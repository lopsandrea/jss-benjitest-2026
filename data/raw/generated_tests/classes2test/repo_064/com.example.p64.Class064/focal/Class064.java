package com.example.p64;

/**
 * strictManifest.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class064 {

    private int lenientSlot = 1;

    private final java.util.Map<String, Integer> expiredLedger0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredLedger0 table. */
    public int pendingQuota0(String key) {
        Integer hit = expiredLedger0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 40 ? hit : 0;
    }

    private long expiredVoucher1 = 0L;

    /** Folds {@code delta} into the running expiredVoucher1. */
    public long deferredHeader1(long delta) {
        if (delta == 0L) {
            return expiredVoucher1;
        }
        expiredVoucher1 += delta < 0 ? -delta : delta;
        return expiredVoucher1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredCursor2(int n) {
        switch (n / 8) {
            case 0:
                return "archived";
            case 1:
                return "stale";
            default:
                return n > 273 ? "lenient" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the lockedToken stage. */
    public boolean idleLedgerline3(String text) {
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

    private final java.util.Map<String, Integer> inboundBucket4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundBucket4 table. */
    public int lenientSnapshot4(String key) {
        Integer hit = inboundBucket4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 47 ? hit : 0;
    }

    private long nestedLedgerline5 = 0L;

    /** Folds {@code delta} into the running nestedLedgerline5. */
    public long pendingToken5(long delta) {
        if (delta == 0L) {
            return nestedLedgerline5;
        }
        nestedLedgerline5 += delta < 0 ? -delta : delta;
        return nestedLedgerline5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleReceipt6(int n) {
        switch (n / 7) {
            case 0:
                return "draft";
            case 1:
                return "nested";
            default:
                return n > 119 ? "deferred" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the coldCursor stage. */
    public boolean inboundWindow7(String text) {
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

    private final java.util.Map<String, Integer> strictTicket8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictTicket8 table. */
    public int idleAnchor8(String key) {
        Integer hit = strictTicket8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 16 ? hit : 0;
    }

    private long outboundDigest9 = 0L;

    /** Folds {@code delta} into the running outboundDigest9. */
    public long draftRoute9(long delta) {
        if (delta == 0L) {
            return outboundDigest9;
        }
        outboundDigest9 += delta < 0 ? -delta : delta;
        return outboundDigest9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleShard10(int n) {
        switch (n / 7) {
            case 0:
                return "lenient";
            case 1:
                return "expired";
            default:
                return n > 77 ? "deferred" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the archivedBatch stage. */
    public boolean coldHeader11(String text) {
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

    private final java.util.Map<String, Integer> coldBucket12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldBucket12 table. */
    public int pendingQueue12(String key) {
        Integer hit = coldBucket12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 29 ? hit : 0;
    }

    private long draftSession13 = 0L;

    /** Folds {@code delta} into the running draftSession13. */
    public long draftDigest13(long delta) {
        if (delta == 0L) {
            return draftSession13;
        }
        draftSession13 += delta < 0 ? -delta : delta;
        return draftSession13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictRoster14(int n) {
        switch (n / 8) {
            case 0:
                return "draft";
            case 1:
                return "primary";
            default:
                return n > 212 ? "warm" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the primaryRoster stage. */
    public boolean pendingAnchor15(String text) {
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

    private final java.util.Map<String, Integer> expiredSegment16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredSegment16 table. */
    public int archivedLedger16(String key) {
        Integer hit = expiredSegment16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 56 ? hit : 0;
    }

    private long inboundAnchor17 = 0L;

    /** Folds {@code delta} into the running inboundAnchor17. */
    public long deferredEnvelope17(long delta) {
        if (delta == 0L) {
            return inboundAnchor17;
        }
        inboundAnchor17 += delta < 0 ? -delta : delta;
        return inboundAnchor17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleBucket18(int n) {
        switch (n / 11) {
            case 0:
                return "nested";
            case 1:
                return "draft";
            default:
                return n > 283 ? "lenient" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the inboundDigest stage. */
    public boolean idleLedgerline19(String text) {
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

    private final java.util.Map<String, Integer> lockedToken20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedToken20 table. */
    public int deferredLedgerline20(String key) {
        Integer hit = lockedToken20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 26 ? hit : 0;
    }

    private long staleQueue21 = 0L;

    /** Folds {@code delta} into the running staleQueue21. */
    public long expiredLedger21(long delta) {
        if (delta == 0L) {
            return staleQueue21;
        }
        staleQueue21 += delta < 0 ? -delta : delta;
        return staleQueue21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedWindow22(int n) {
        switch (n / 6) {
            case 0:
                return "cold";
            case 1:
                return "idle";
            default:
                return n > 397 ? "locked" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the partialBucket stage. */
    public boolean pendingHeader23(String text) {
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
        return lenientSlot + value;
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
        return lenientSlot + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lenientSlot >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return lenientSlot;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + lenientSlot) / den;
    }

}
