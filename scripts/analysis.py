#!/usr/bin/env python3
"""
BenjiTest Analysis Scripts
==========================

This module provides functions to load, analyze, and visualize 
the experimental results from the BenjiTest evaluation framework.

Author: Andrea Lops (andrea.lops@poliba.it)
"""

import pandas as pd
import numpy as np
from pathlib import Path
from typing import Dict, List, Tuple, Optional
import warnings

# Suppress pandas warnings for cleaner output
warnings.filterwarnings('ignore', category=FutureWarning)

# ============================================================================
# DATA LOADING FUNCTIONS
# ============================================================================

def get_data_path() -> Path:
    """Get the path to the data directory."""
    return Path(__file__).parent.parent / 'data'


def load_raw_metrics() -> pd.DataFrame:
    """
    Load the raw metrics per model and strategy.
    
    Returns:
        DataFrame with columns: model, prompt_name, branch_coverage, line_coverage,
        method_coverage, mutation_score, AR, EH, MG, EA, LT, UT, RO, MNT,
        CR_initial, CR_after_fix, num_attempts
    """
    path = get_data_path() / 'raw' / 'metrics_per_model_strategy.csv'
    return pd.read_csv(path, comment='#')


def load_ablation_results() -> pd.DataFrame:
    """
    Load the ablation study results.
    
    Returns:
        DataFrame with ablation configurations and their metrics.
    """
    path = get_data_path() / 'raw' / 'ablation_study_results.csv'
    return pd.read_csv(path, comment='#')


def load_defects4j_results() -> pd.DataFrame:
    """
    Load the Defects4J validation results (RQ5).
    
    Returns:
        DataFrame with fault detection rates per project.
    """
    path = get_data_path() / 'raw' / 'defects4j_results.csv'
    return pd.read_csv(path, comment='#')


def load_correction_breakdown() -> pd.DataFrame:
    """
    Load the correction loop error breakdown.
    
    Returns:
        DataFrame with error phases, types, and fix rates.
    """
    path = get_data_path() / 'raw' / 'correction_loop_breakdown.csv'
    return pd.read_csv(path, comment='#')


# ============================================================================
# ANALYSIS FUNCTIONS
# ============================================================================

def get_best_configurations(df: pd.DataFrame, metric: str = 'mutation_score', 
                            top_n: int = 5) -> pd.DataFrame:
    """
    Get the top N configurations by a given metric.
    
    Args:
        df: Raw metrics DataFrame
        metric: Column name to sort by
        top_n: Number of top results to return
        
    Returns:
        DataFrame with top N configurations
    """
    # Exclude human baseline
    filtered = df[df['model'] != 'human'].copy()
    return filtered.nlargest(top_n, metric)[['model', 'prompt_name', metric, 'CR_after_fix']]


def compute_improvement_stats(df: pd.DataFrame) -> Dict[str, pd.DataFrame]:
    """
    Compute improvement statistics for each model comparing zero-shot to dynamic.
    
    Args:
        df: Raw metrics DataFrame
        
    Returns:
        Dictionary with comparison DataFrames
    """
    models = df[df['model'] != 'human']['model'].unique()
    
    improvements = []
    for model in models:
        model_data = df[df['model'] == model]
        
        zero_shot = model_data[model_data['prompt_name'] == 'zero-shot']
        dynamic = model_data[model_data['prompt_name'] == 'dynamic']
        
        if len(zero_shot) > 0 and len(dynamic) > 0:
            zs = zero_shot.iloc[0]
            dyn = dynamic.iloc[0]
            
            improvements.append({
                'model': model,
                'CR_improvement_pp': dyn['CR_initial'] - zs['CR_initial'],
                'mutation_improvement_pp': dyn['mutation_score'] - zs['mutation_score'],
                'branch_cov_improvement_pp': dyn['branch_coverage'] - zs['branch_coverage'],
                'line_cov_improvement_pp': dyn['line_coverage'] - zs['line_coverage'],
                'lazy_test_reduction': zs['LT'] - dyn['LT']
            })
    
    return pd.DataFrame(improvements)


def compute_human_comparison(df: pd.DataFrame) -> pd.DataFrame:
    """
    Compare best LLM configurations against human baseline.
    
    Args:
        df: Raw metrics DataFrame
        
    Returns:
        DataFrame with human vs best LLM comparison
    """
    human = df[df['model'] == 'human'].iloc[0]
    
    # Get best dynamic configurations
    dynamic = df[(df['prompt_name'] == 'dynamic') & (df['model'] != 'human')]
    best_llm = dynamic.loc[dynamic['mutation_score'].idxmax()]
    
    metrics = ['branch_coverage', 'line_coverage', 'method_coverage', 
               'mutation_score', 'LT', 'MNT']
    
    comparison = []
    for metric in metrics:
        comparison.append({
            'metric': metric,
            'human': human[metric],
            'best_llm': best_llm[metric],
            'difference': best_llm[metric] - human[metric]
        })
    
    return pd.DataFrame(comparison)


def compute_strategy_summary(df: pd.DataFrame) -> pd.DataFrame:
    """
    Compute summary statistics per strategy across all models.
    
    Args:
        df: Raw metrics DataFrame
        
    Returns:
        DataFrame with strategy-level summary
    """
    # Exclude human
    filtered = df[df['model'] != 'human']
    
    summary = filtered.groupby('prompt_name').agg({
        'CR_initial': 'mean',
        'CR_after_fix': 'mean',
        'mutation_score': 'mean',
        'branch_coverage': 'mean',
        'line_coverage': 'mean',
        'LT': 'mean',
        'MNT': 'mean',
        'num_attempts': 'mean'
    }).round(2)
    
    return summary


def calculate_fix_rate(df: pd.DataFrame) -> pd.DataFrame:
    """
    Calculate the fix rate for each model-strategy combination.
    
    The fix rate is defined as: (final_CR - initial_CR) / (100 - initial_CR) * 100
    i.e., what percentage of initially failing tests were fixed.
    
    Args:
        df: Raw metrics DataFrame
        
    Returns:
        DataFrame with fix rates
    """
    results = df[df['model'] != 'human'].copy()
    
    # Avoid division by zero for 100% initial CR
    results['failures'] = 100 - results['CR_initial']
    results['fixed'] = results['CR_after_fix'] - results['CR_initial']
    results['fix_rate'] = np.where(
        results['failures'] > 0,
        (results['fixed'] / results['failures'] * 100).round(1),
        100.0
    )
    
    return results[['model', 'prompt_name', 'CR_initial', 'CR_after_fix', 'fix_rate']]


# ============================================================================
# REPORT GENERATION FUNCTIONS
# ============================================================================

def generate_latex_table(df: pd.DataFrame, caption: str = "", 
                         label: str = "") -> str:
    """
    Generate a LaTeX table from a DataFrame.
    
    Args:
        df: DataFrame to convert
        caption: Table caption
        label: Table label for referencing
        
    Returns:
        LaTeX string
    """
    latex = df.to_latex(index=True, escape=True, float_format="%.2f")
    
    if caption:
        latex = latex.replace(
            r'\begin{tabular}',
            f'\\caption{{{caption}}}\n\\label{{{label}}}\n\\begin{{tabular}}'
        )
    
    return latex


def print_summary_report():
    """Print a comprehensive summary report of all experimental results."""
    
    print("=" * 80)
    print("BENJITEST EXPERIMENTAL RESULTS SUMMARY")
    print("=" * 80)
    
    df = load_raw_metrics()
    
    # RQ1: Best configurations
    print("\n" + "-" * 40)
    print("RQ1: Top 5 Configurations by Mutation Score")
    print("-" * 40)
    print(get_best_configurations(df, 'mutation_score', 5).to_string(index=False))
    
    # Strategy comparison
    print("\n" + "-" * 40)
    print("Strategy Summary (Average across all models)")
    print("-" * 40)
    print(compute_strategy_summary(df).to_string())
    
    # Human comparison
    print("\n" + "-" * 40)
    print("RQ4: Human vs Best LLM Comparison")
    print("-" * 40)
    print(compute_human_comparison(df).to_string(index=False))
    
    # Improvement stats
    print("\n" + "-" * 40)
    print("RQ2: Improvement from Zero-shot to Dynamic")
    print("-" * 40)
    print(compute_improvement_stats(df).to_string(index=False))
    
    # Defects4J
    print("\n" + "-" * 40)
    print("RQ5: Defects4J Fault Detection Rates")
    print("-" * 40)
    d4j = load_defects4j_results()
    print(d4j.to_string(index=False))
    
    # Ablation
    print("\n" + "-" * 40)
    print("Ablation Study Results")
    print("-" * 40)
    ablation = load_ablation_results()
    print(ablation.to_string(index=False))
    
    print("\n" + "=" * 80)
    print("END OF REPORT")
    print("=" * 80)


# ============================================================================
# MAIN EXECUTION
# ============================================================================

if __name__ == "__main__":
    print_summary_report()
