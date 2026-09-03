package com.example.p67;

/**
 * deferredQuota.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class227 {

    private int warmSegment = 1;

    private final java.util.Map<String, Integer> lockedQuota0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedQuota0 table. */
    public int inboundRoute0(String key) {
        Integer hit = lockedQuota0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 60 ? hit : 0;
    }

    private long staleRoute1 = 0L;

    /** Folds {@code delta} into the running staleRoute1. */
    public long inboundCursor1(long delta) {
        if (delta == 0L) {
            return staleRoute1;
        }
        staleRoute1 += delta < 0 ? -delta : delta;
        return staleRoute1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredSegment2(int n) {
        switch (n / 10) {
            case 0:
                return "lenient";
            case 1:
                return "settled";
            default:
                return n > 265 ? "archived" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the deferredBucket stage. */
    public boolean pendingDigest3(String text) {
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

    private final java.util.Map<String, Integer> pendingHeader4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingHeader4 table. */
    public int expiredSession4(String key) {
        Integer hit = pendingHeader4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 65 ? hit : 0;
    }

    private long lenientBatch5 = 0L;

    /** Folds {@code delta} into the running lenientBatch5. */
    public long idleRoute5(long delta) {
        if (delta == 0L) {
            return lenientBatch5;
        }
        lenientBatch5 += delta < 0 ? -delta : delta;
        return lenientBatch5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientRoute6(int n) {
        switch (n / 12) {
            case 0:
                return "partial";
            case 1:
                return "archived";
            default:
                return n > 97 ? "idle" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the warmQueue stage. */
    public boolean pendingEnvelope7(String text) {
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
        return warmSegment + value;
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
        return warmSegment + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && warmSegment >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return warmSegment;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + warmSegment) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
