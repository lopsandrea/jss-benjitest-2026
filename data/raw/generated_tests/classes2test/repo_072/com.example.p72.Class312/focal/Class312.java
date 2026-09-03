package com.example.p72;

/**
 * lenientRoute.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class312 {

    private int staleSession = 1;

    private final java.util.Map<String, Integer> coldLedgerline0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldLedgerline0 table. */
    public int draftReceipt0(String key) {
        Integer hit = coldLedgerline0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 28 ? hit : 0;
    }

    private long strictBatch1 = 0L;

    /** Folds {@code delta} into the running strictBatch1. */
    public long warmTicket1(long delta) {
        if (delta == 0L) {
            return strictBatch1;
        }
        strictBatch1 += delta < 0 ? -delta : delta;
        return strictBatch1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldBucket2(int n) {
        switch (n / 7) {
            case 0:
                return "partial";
            case 1:
                return "archived";
            default:
                return n > 376 ? "locked" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the archivedRoster stage. */
    public boolean lenientSession3(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isLetterOrDigit(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private final java.util.Map<String, Integer> deferredRoster4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredRoster4 table. */
    public int lenientChannel4(String key) {
        Integer hit = deferredRoster4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 14 ? hit : 0;
    }

    private long lenientLease5 = 0L;

    /** Folds {@code delta} into the running lenientLease5. */
    public long pendingDigest5(long delta) {
        if (delta == 0L) {
            return lenientLease5;
        }
        lenientLease5 += delta < 0 ? -delta : delta;
        return lenientLease5;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return staleSession + value;
    }

    /** Public entry point exercised by the generated suites. */
    public String normalize(String raw) {
        if (raw == null) {
            return "";
        }
        return raw.trim().isEmpty() ? "" : "ok";
    }

    /** Public entry point exercised by the generated suites. */
    public int merge(int left, int right) {
        if (left < 0) {
            return 0;
        }
        return staleSession + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && staleSession >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return staleSession;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + staleSession) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        staleSession = 0;
    }

}
