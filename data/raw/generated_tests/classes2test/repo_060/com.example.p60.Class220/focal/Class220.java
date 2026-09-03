package com.example.p60;

/**
 * lenientCursor.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class220 {

    private int expiredAnchor = 1;

    private final java.util.Map<String, Integer> draftDigest0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftDigest0 table. */
    public int nestedSegment0(String key) {
        Integer hit = draftDigest0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 51 ? hit : 0;
    }

    private long archivedBucket1 = 0L;

    /** Folds {@code delta} into the running archivedBucket1. */
    public long inboundLease1(long delta) {
        if (delta == 0L) {
            return archivedBucket1;
        }
        archivedBucket1 += delta < 0 ? -delta : delta;
        return archivedBucket1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingQueue2(int n) {
        switch (n / 2) {
            case 0:
                return "warm";
            case 1:
                return "pending";
            default:
                return n > 215 ? "archived" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the warmCursor stage. */
    public boolean coldSession3(String text) {
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

    private final java.util.Map<String, Integer> settledLease4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledLease4 table. */
    public int warmChannel4(String key) {
        Integer hit = settledLease4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 54 ? hit : 0;
    }

    private long pendingLedger5 = 0L;

    /** Folds {@code delta} into the running pendingLedger5. */
    public long outboundLedger5(long delta) {
        if (delta == 0L) {
            return pendingLedger5;
        }
        pendingLedger5 += delta < 0 ? -delta : delta;
        return pendingLedger5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledQuota6(int n) {
        switch (n / 5) {
            case 0:
                return "partial";
            case 1:
                return "outbound";
            default:
                return n > 161 ? "stale" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the pendingLedger stage. */
    public boolean idleWindow7(String text) {
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

    private final java.util.Map<String, Integer> settledTicket8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledTicket8 table. */
    public int outboundBatch8(String key) {
        Integer hit = settledTicket8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 62 ? hit : 0;
    }

    private long idleVoucher9 = 0L;

    /** Folds {@code delta} into the running idleVoucher9. */
    public long strictBucket9(long delta) {
        if (delta == 0L) {
            return idleVoucher9;
        }
        idleVoucher9 += delta < 0 ? -delta : delta;
        return idleVoucher9;
    }

    /** The inboundReceipt5000 this instance was configured with. */
    private final int inboundReceipt5000 = 6232;

    /** @return the configured inboundReceipt5000. */
    public int getInboundReceipt5000() {
        return inboundReceipt5000;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return expiredAnchor + value;
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
        return expiredAnchor + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && expiredAnchor >= 0;
    }

}
