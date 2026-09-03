#!/usr/bin/env python3
"""
BenjiTest Visualization Scripts
================================

Generate plots and figures for the BenjiTest paper.

Requirements:
    pip install pandas matplotlib seaborn

Author: Andrea Lops (andrea.lops@poliba.it)
"""

import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
from pathlib import Path
import sys

# Add parent directory to path for imports
sys.path.insert(0, str(Path(__file__).parent))
from analysis import load_raw_metrics, load_ablation_results, load_defects4j_results

# Set style
plt.style.use('seaborn-v0_8-whitegrid')
sns.set_palette("husl")

OUTPUT_DIR = Path(__file__).parent.parent / 'figures'


def ensure_output_dir():
    """Create output directory if it doesn't exist."""
    OUTPUT_DIR.mkdir(parents=True, exist_ok=True)


def plot_compilation_rates_by_strategy(save: bool = True):
    """
    Plot initial and final compilation rates grouped by strategy.
    Corresponds to Figure showing CR improvement.
    """
    df = load_raw_metrics()
    df = df[df['model'] != 'human']
    
    fig, axes = plt.subplots(1, 2, figsize=(14, 6))
    
    # Initial CR by strategy
    strategy_order = ['zero-shot', 'few-shot', 'dynamic', 'pseudo-code']
    
    ax1 = axes[0]
    sns.boxplot(data=df, x='prompt_name', y='CR_initial', order=strategy_order, ax=ax1)
    ax1.set_xlabel('Strategy')
    ax1.set_ylabel('Initial Compilation Rate (%)')
    ax1.set_title('Initial Compilation Rate by Strategy')
    ax1.set_ylim(0, 100)
    
    # Final CR by strategy
    ax2 = axes[1]
    sns.boxplot(data=df, x='prompt_name', y='CR_after_fix', order=strategy_order, ax=ax2)
    ax2.set_xlabel('Strategy')
    ax2.set_ylabel('Final Compilation Rate (%)')
    ax2.set_title('Final Compilation Rate (After Correction)')
    ax2.set_ylim(0, 100)
    
    plt.tight_layout()
    
    if save:
        ensure_output_dir()
        plt.savefig(OUTPUT_DIR / 'compilation_rates.pdf', bbox_inches='tight')
        plt.savefig(OUTPUT_DIR / 'compilation_rates.png', dpi=300, bbox_inches='tight')
    
    return fig


def plot_mutation_scores_heatmap(save: bool = True):
    """
    Create a heatmap of mutation scores across models and strategies.
    """
    df = load_raw_metrics()
    df = df[df['model'] != 'human']
    
    pivot = df.pivot(index='model', columns='prompt_name', values='mutation_score')
    pivot = pivot[['zero-shot', 'few-shot', 'dynamic', 'pseudo-code']]
    
    fig, ax = plt.subplots(figsize=(10, 8))
    sns.heatmap(pivot, annot=True, fmt='.1f', cmap='RdYlGn', 
                vmin=20, vmax=100, ax=ax, cbar_kws={'label': 'Mutation Score (%)'})
    ax.set_title('Mutation Score by Model and Strategy')
    ax.set_xlabel('Strategy')
    ax.set_ylabel('Model')
    
    plt.tight_layout()
    
    if save:
        ensure_output_dir()
        plt.savefig(OUTPUT_DIR / 'mutation_score_heatmap.pdf', bbox_inches='tight')
        plt.savefig(OUTPUT_DIR / 'mutation_score_heatmap.png', dpi=300, bbox_inches='tight')
    
    return fig


def plot_human_vs_llm_comparison(save: bool = True):
    """
    Bar chart comparing human-written tests vs best LLM configuration.
    """
    df = load_raw_metrics()
    
    human = df[df['model'] == 'human'].iloc[0]
    best_llm = df[(df['model'] != 'human') & (df['prompt_name'] == 'dynamic')]\
               .nlargest(1, 'mutation_score').iloc[0]
    
    metrics = ['branch_coverage', 'line_coverage', 'method_coverage', 'mutation_score']
    labels = ['Branch Cov.', 'Line Cov.', 'Method Cov.', 'Mutation Score']
    
    human_vals = [human[m] for m in metrics]
    llm_vals = [best_llm[m] for m in metrics]
    
    x = range(len(metrics))
    width = 0.35
    
    fig, ax = plt.subplots(figsize=(10, 6))
    bars1 = ax.bar([i - width/2 for i in x], human_vals, width, label='Human', color='steelblue')
    bars2 = ax.bar([i + width/2 for i in x], llm_vals, width, label='LLM (Best Dynamic)', color='coral')
    
    ax.set_xlabel('Metric')
    ax.set_ylabel('Percentage (%)')
    ax.set_title('RQ4: Human-written vs LLM-generated Tests')
    ax.set_xticks(x)
    ax.set_xticklabels(labels)
    ax.legend()
    ax.set_ylim(0, 100)
    
    # Add value labels on bars
    for bar in bars1:
        height = bar.get_height()
        ax.annotate(f'{height:.1f}', xy=(bar.get_x() + bar.get_width()/2, height),
                    xytext=(0, 3), textcoords="offset points", ha='center', va='bottom', fontsize=9)
    
    for bar in bars2:
        height = bar.get_height()
        ax.annotate(f'{height:.1f}', xy=(bar.get_x() + bar.get_width()/2, height),
                    xytext=(0, 3), textcoords="offset points", ha='center', va='bottom', fontsize=9)
    
    plt.tight_layout()
    
    if save:
        ensure_output_dir()
        plt.savefig(OUTPUT_DIR / 'human_vs_llm.pdf', bbox_inches='tight')
        plt.savefig(OUTPUT_DIR / 'human_vs_llm.png', dpi=300, bbox_inches='tight')
    
    return fig


def plot_ablation_study(save: bool = True):
    """
    Bar chart showing ablation study results.
    """
    df = load_ablation_results()
    
    fig, axes = plt.subplots(1, 3, figsize=(15, 5))
    
    configs = df['configuration'].tolist()
    x = range(len(configs))
    
    # Mutation Score
    ax1 = axes[0]
    colors = ['green' if i == 0 else 'coral' for i in range(len(configs))]
    ax1.bar(x, df['mutation_score'], color=colors)
    ax1.set_xticks(x)
    ax1.set_xticklabels(['Full', 'No-BB', 'No-WB', 'No-Ctx'], rotation=0)
    ax1.set_ylabel('Mutation Score (%)')
    ax1.set_title('Mutation Score')
    ax1.set_ylim(0, 100)
    
    # Branch Coverage
    ax2 = axes[1]
    ax2.bar(x, df['branch_coverage'], color=colors)
    ax2.set_xticks(x)
    ax2.set_xticklabels(['Full', 'No-BB', 'No-WB', 'No-Ctx'], rotation=0)
    ax2.set_ylabel('Branch Coverage (%)')
    ax2.set_title('Branch Coverage')
    ax2.set_ylim(0, 100)
    
    # Lazy Test Smell
    ax3 = axes[2]
    ax3.bar(x, df['lazy_test'], color=colors)
    ax3.set_xticks(x)
    ax3.set_xticklabels(['Full', 'No-BB', 'No-WB', 'No-Ctx'], rotation=0)
    ax3.set_ylabel('Lazy Test Smell Count')
    ax3.set_title('Lazy Test Smell')
    
    plt.suptitle('Ablation Study: Impact of Removing Agent Components', fontsize=14)
    plt.tight_layout()
    
    if save:
        ensure_output_dir()
        plt.savefig(OUTPUT_DIR / 'ablation_study.pdf', bbox_inches='tight')
        plt.savefig(OUTPUT_DIR / 'ablation_study.png', dpi=300, bbox_inches='tight')
    
    return fig


def plot_defects4j_comparison(save: bool = True):
    """
    Bar chart showing Defects4J fault detection rates.
    """
    df = load_defects4j_results()
    df = df[df['project'] != 'Total']
    
    x = range(len(df))
    width = 0.35
    
    fig, ax = plt.subplots(figsize=(8, 6))
    bars1 = ax.bar([i - width/2 for i in x], df['zero_shot_fdr'], width, 
                   label='Zero-shot', color='steelblue')
    bars2 = ax.bar([i + width/2 for i in x], df['dynamic_fdr'], width, 
                   label='Dynamic', color='coral')
    
    ax.set_xlabel('Defects4J Project')
    ax.set_ylabel('Fault Detection Rate (%)')
    ax.set_title('RQ5: Fault Detection Rate on Defects4J')
    ax.set_xticks(x)
    ax.set_xticklabels(df['project'])
    ax.legend()
    ax.set_ylim(0, 70)
    
    # Add value labels
    for bar in bars1:
        height = bar.get_height()
        ax.annotate(f'{height:.1f}%', xy=(bar.get_x() + bar.get_width()/2, height),
                    xytext=(0, 3), textcoords="offset points", ha='center', va='bottom', fontsize=9)
    
    for bar in bars2:
        height = bar.get_height()
        ax.annotate(f'{height:.1f}%', xy=(bar.get_x() + bar.get_width()/2, height),
                    xytext=(0, 3), textcoords="offset points", ha='center', va='bottom', fontsize=9)
    
    plt.tight_layout()
    
    if save:
        ensure_output_dir()
        plt.savefig(OUTPUT_DIR / 'defects4j_fdr.pdf', bbox_inches='tight')
        plt.savefig(OUTPUT_DIR / 'defects4j_fdr.png', dpi=300, bbox_inches='tight')
    
    return fig


def plot_improvement_from_dynamic(save: bool = True):
    """
    Plot showing improvement in CR from zero-shot to dynamic strategy.
    """
    df = load_raw_metrics()
    df = df[df['model'] != 'human']
    
    models = df['model'].unique()
    improvements = []
    
    for model in models:
        model_data = df[df['model'] == model]
        zs = model_data[model_data['prompt_name'] == 'zero-shot']['CR_initial'].values[0]
        dyn = model_data[model_data['prompt_name'] == 'dynamic']['CR_initial'].values[0]
        improvements.append({
            'model': model,
            'zero_shot': zs,
            'dynamic': dyn,
            'improvement': dyn - zs
        })
    
    imp_df = pd.DataFrame(improvements).sort_values('improvement', ascending=True)
    
    fig, ax = plt.subplots(figsize=(10, 6))
    
    y = range(len(imp_df))
    ax.barh(y, imp_df['improvement'], color='coral', alpha=0.8)
    ax.set_yticks(y)
    ax.set_yticklabels(imp_df['model'])
    ax.set_xlabel('Compilation Rate Improvement (percentage points)')
    ax.set_title('RQ2: CR Improvement from Zero-shot to Dynamic Strategy')
    ax.axvline(x=0, color='black', linewidth=0.5)
    
    # Add labels
    for i, v in enumerate(imp_df['improvement']):
        ax.text(v + 1, i, f'+{v:.0f}pp', va='center', fontsize=9)
    
    plt.tight_layout()
    
    if save:
        ensure_output_dir()
        plt.savefig(OUTPUT_DIR / 'dynamic_improvement.pdf', bbox_inches='tight')
        plt.savefig(OUTPUT_DIR / 'dynamic_improvement.png', dpi=300, bbox_inches='tight')
    
    return fig


def generate_all_figures():
    """Generate all figures for the paper."""
    print("Generating figures...")
    ensure_output_dir()
    
    print("  - Compilation rates plot")
    plot_compilation_rates_by_strategy()
    
    print("  - Mutation score heatmap")
    plot_mutation_scores_heatmap()
    
    print("  - Human vs LLM comparison")
    plot_human_vs_llm_comparison()
    
    print("  - Ablation study")
    plot_ablation_study()
    
    print("  - Defects4J comparison")
    plot_defects4j_comparison()
    
    print("  - Dynamic improvement")
    plot_improvement_from_dynamic()
    
    plot_rq1_distributions()

    print(f"\nAll figures saved to: {OUTPUT_DIR}")


def plot_rq1_distributions(out="figs/rq1_distributions.pdf"):
    """Figure 5: distribution of branch coverage and mutation score per model x strategy.

    Reads data/raw/per_class_results.csv and plots one violin per (model, strategy)
    over the compiled subset, with the interquartile box and median inside it. The
    cell means reproduce metrics_per_model_strategy.csv, i.e. the paper's Table 7.
    """
    import csv
    import collections
    import matplotlib
    matplotlib.use("Agg")
    import matplotlib.pyplot as plt

    rows = [r for r in csv.DictReader(
        open("data/raw/per_class_results.csv"))]

    strategies = ["zero-shot", "few-shot", "pseudo-code", "dynamic"]
    models = ["gpt-4.1", "deepseek-r1", "gemini-2.5-pro", "o3", "grok-3",
              "llama3.1:70b", "o4-mini", "gpt-4o-mini", "gemini-1.5-pro"]
    colours = {"zero-shot": "#c44e52", "few-shot": "#dd8452",
               "pseudo-code": "#55a868", "dynamic": "#4c72b0"}

    cells = collections.defaultdict(list)
    for r in rows:
        if r["compiled"] == "1":
            cells[(r["model"], r["strategy"], "branch")].append(float(r["branch_coverage"]))
            cells[(r["model"], r["strategy"], "mutation")].append(float(r["mutation_score"]))

    fig, axes = plt.subplots(2, 1, figsize=(11, 7.2), sharex=True)
    for ax, (metric, label) in zip(axes, [("branch", "Branch coverage (%)"),
                                          ("mutation", "Mutation score (%)")]):
        positions, data, cols = [], [], []
        for i, model in enumerate(models):
            for j, strategy in enumerate(strategies):
                values = cells.get((model, strategy, metric), [])
                if values:
                    positions.append(i * 5 + j)
                    data.append(values)
                    cols.append(colours[strategy])

        violins = ax.violinplot(data, positions=positions, widths=0.85,
                                showextrema=False, showmedians=False)
        for body, colour in zip(violins["bodies"], cols):
            body.set_facecolor(colour)
            body.set_edgecolor("none")
            body.set_alpha(0.75)

        ax.boxplot(data, positions=positions, widths=0.16, patch_artist=True,
                   showfliers=False,
                   medianprops=dict(color="white", lw=1.3),
                   boxprops=dict(facecolor="#2b2b2b", edgecolor="none"),
                   whiskerprops=dict(color="#2b2b2b", lw=0.9),
                   capprops=dict(color="#2b2b2b", lw=0.9))

        ax.set_ylabel(label, fontsize=10)
        ax.set_ylim(0, 105)
        ax.grid(axis="y", alpha=0.25, lw=0.5)
        ax.set_axisbelow(True)
        for spine in ("top", "right"):
            ax.spines[spine].set_visible(False)

    axes[1].set_xticks([i * 5 + 1.5 for i in range(len(models))])
    axes[1].set_xticklabels(models, rotation=18, ha="right", fontsize=9)
    handles = [plt.Rectangle((0, 0), 1, 1, fc=colours[s], alpha=0.75) for s in strategies]
    axes[0].legend(handles, strategies, ncol=4, fontsize=9, frameon=False,
                   loc="lower right", bbox_to_anchor=(1.0, 1.01))

    plt.tight_layout()
    plt.savefig(out, bbox_inches="tight")
    return out


if __name__ == "__main__":
    generate_all_figures()
