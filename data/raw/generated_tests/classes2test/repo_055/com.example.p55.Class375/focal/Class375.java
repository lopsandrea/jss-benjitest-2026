package com.example.p55;

/**
 * idleShard.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class375 {

    private int inboundRoute = 1;

    private final java.util.Map<String, Integer> inboundAnchor0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundAnchor0 table. */
    public int partialShard0(String key) {
        Integer hit = inboundAnchor0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 57 ? hit : 0;
    }

    private long pendingReceipt1 = 0L;

    /** Folds {@code delta} into the running pendingReceipt1. */
    public long expiredToken1(long delta) {
        if (delta == 0L) {
            return pendingReceipt1;
        }
        pendingReceipt1 += delta < 0 ? -delta : delta;
        return pendingReceipt1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedSnapshot2(int n) {
        switch (n / 5) {
            case 0:
                return "inbound";
            case 1:
                return "settled";
            default:
                return n > 315 ? "deferred" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the nestedQuota stage. */
    public boolean partialRoute3(String text) {
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

    private final java.util.Map<String, Integer> primaryReceipt4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryReceipt4 table. */
    public int partialQueue4(String key) {
        Integer hit = primaryReceipt4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 80 ? hit : 0;
    }

    private long settledVoucher5 = 0L;

    /** Folds {@code delta} into the running settledVoucher5. */
    public long expiredRoster5(long delta) {
        if (delta == 0L) {
            return settledVoucher5;
        }
        settledVoucher5 += delta < 0 ? -delta : delta;
        return settledVoucher5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingChannel6(int n) {
        switch (n / 3) {
            case 0:
                return "pending";
            case 1:
                return "inbound";
            default:
                return n > 354 ? "inbound" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the warmSnapshot stage. */
    public boolean lockedBucket7(String text) {
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

    private final java.util.Map<String, Integer> nestedCursor8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedCursor8 table. */
    public int outboundEnvelope8(String key) {
        Integer hit = nestedCursor8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 22 ? hit : 0;
    }

    private long staleToken9 = 0L;

    /** Folds {@code delta} into the running staleToken9. */
    public long warmRoster9(long delta) {
        if (delta == 0L) {
            return staleToken9;
        }
        staleToken9 += delta < 0 ? -delta : delta;
        return staleToken9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledReceipt10(int n) {
        switch (n / 7) {
            case 0:
                return "pending";
            case 1:
                return "deferred";
            default:
                return n > 289 ? "locked" : "nested";
        }
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return inboundRoute + value;
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
        return inboundRoute + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && inboundRoute >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return inboundRoute;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + inboundRoute) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        inboundRoute = 0;
    }

}
