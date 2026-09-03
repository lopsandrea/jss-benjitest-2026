"""Report Generator Module."""

from .generator import (
    AGGREGATE_COLUMNS,
    AGGREGATE_FILENAME,
    CORRECTION_FILENAME,
    PER_CLASS_FILENAME,
    ReportGenerator,
    build_record_from_result,
)
from .records import GenerationRecord

__all__ = [
    "AGGREGATE_COLUMNS",
    "AGGREGATE_FILENAME",
    "CORRECTION_FILENAME",
    "PER_CLASS_FILENAME",
    "GenerationRecord",
    "ReportGenerator",
    "build_record_from_result",
]
