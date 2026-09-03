"""Allow ``python -m benjitest`` in addition to the installed console script."""

import sys

from .cli import main

if __name__ == "__main__":
    sys.exit(main())
