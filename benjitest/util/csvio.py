"""CSV helpers that tolerate a leading comment block.

The files under ``data/`` carry a ``#``-prefixed preamble stating their provenance
and the invariants they must satisfy. ``csv.DictReader`` has no notion of comments
and would take the first such line as the header, so readers go through
:func:`rows` instead.
"""

from __future__ import annotations

import csv
from typing import IO, Iterator


def uncommented(handle: IO[str]) -> Iterator[str]:
    """Yield the lines of ``handle``, dropping ``#`` comment lines."""
    for line in handle:
        if not line.lstrip().startswith("#"):
            yield line


def rows(handle: IO[str]) -> csv.DictReader:
    """A :class:`csv.DictReader` over ``handle`` that skips comment lines."""
    return csv.DictReader(uncommented(handle))
