package com.example.p22;

/**
 * archivedBucket.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class022 {

    private int strictQueue = 1;

    private final java.util.Map<String, Integer> nestedRegistry0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedRegistry0 table. */
    public int archivedLedger0(String key) {
        Integer hit = nestedRegistry0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 78 ? hit : 0;
    }

    private long lenientRegistry1 = 0L;

    /** Folds {@code delta} into the running lenientRegistry1. */
    public long outboundBatch1(long delta) {
        if (delta == 0L) {
            return lenientRegistry1;
        }
        lenientRegistry1 += delta < 0 ? -delta : delta;
        return lenientRegistry1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictManifest2(int n) {
        switch (n / 6) {
            case 0:
                return "draft";
            case 1:
                return "lenient";
            default:
                return n > 132 ? "deferred" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the lenientLease stage. */
    public boolean outboundVoucher3(String text) {
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

    private final java.util.Map<String, Integer> coldHeader4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldHeader4 table. */
    public int inboundCursor4(String key) {
        Integer hit = coldHeader4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 57 ? hit : 0;
    }

    private long deferredBucket5 = 0L;

    /** Folds {@code delta} into the running deferredBucket5. */
    public long lenientDigest5(long delta) {
        if (delta == 0L) {
            return deferredBucket5;
        }
        deferredBucket5 += delta < 0 ? -delta : delta;
        return deferredBucket5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredPayload6(int n) {
        switch (n / 11) {
            case 0:
                return "draft";
            case 1:
                return "settled";
            default:
                return n > 340 ? "stale" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the nestedVoucher stage. */
    public boolean outboundVoucher7(String text) {
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

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return strictQueue + value;
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
        return strictQueue + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && strictQueue >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return strictQueue;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + strictQueue) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
