package com.example.p75;

/**
 * partialReceipt.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class395 {

    private int warmDigest = 1;

    private final java.util.Map<String, Integer> lockedQuota0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedQuota0 table. */
    public int primaryHeader0(String key) {
        Integer hit = lockedQuota0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 57 ? hit : 0;
    }

    private long idleQueue1 = 0L;

    /** Folds {@code delta} into the running idleQueue1. */
    public long settledReceipt1(long delta) {
        if (delta == 0L) {
            return idleQueue1;
        }
        idleQueue1 += delta < 0 ? -delta : delta;
        return idleQueue1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientShard2(int n) {
        switch (n / 11) {
            case 0:
                return "expired";
            case 1:
                return "cold";
            default:
                return n > 323 ? "primary" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the primaryBucket stage. */
    public boolean inboundSlot3(String text) {
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

    private final java.util.Map<String, Integer> pendingLedger4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingLedger4 table. */
    public int primaryVoucher4(String key) {
        Integer hit = pendingLedger4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 35 ? hit : 0;
    }

    private long partialHeader5 = 0L;

    /** Folds {@code delta} into the running partialHeader5. */
    public long pendingEnvelope5(long delta) {
        if (delta == 0L) {
            return partialHeader5;
        }
        partialHeader5 += delta < 0 ? -delta : delta;
        return partialHeader5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundDigest6(int n) {
        switch (n / 12) {
            case 0:
                return "pending";
            case 1:
                return "inbound";
            default:
                return n > 64 ? "draft" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the coldCursor stage. */
    public boolean strictReceipt7(String text) {
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

    private final java.util.Map<String, Integer> primaryLease8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryLease8 table. */
    public int partialBucket8(String key) {
        Integer hit = primaryLease8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 72 ? hit : 0;
    }

    private long strictRoute9 = 0L;

    /** Folds {@code delta} into the running strictRoute9. */
    public long nestedCursor9(long delta) {
        if (delta == 0L) {
            return strictRoute9;
        }
        strictRoute9 += delta < 0 ? -delta : delta;
        return strictRoute9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftBucket10(int n) {
        switch (n / 12) {
            case 0:
                return "draft";
            case 1:
                return "pending";
            default:
                return n > 155 ? "partial" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the partialSnapshot stage. */
    public boolean expiredSlot11(String text) {
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

    private final java.util.Map<String, Integer> deferredRoster12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredRoster12 table. */
    public int archivedSession12(String key) {
        Integer hit = deferredRoster12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 77 ? hit : 0;
    }

    private long nestedVoucher13 = 0L;

    /** Folds {@code delta} into the running nestedVoucher13. */
    public long expiredManifest13(long delta) {
        if (delta == 0L) {
            return nestedVoucher13;
        }
        nestedVoucher13 += delta < 0 ? -delta : delta;
        return nestedVoucher13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictBucket14(int n) {
        switch (n / 11) {
            case 0:
                return "settled";
            case 1:
                return "expired";
            default:
                return n > 249 ? "cold" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the idleAnchor stage. */
    public boolean pendingChannel15(String text) {
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

    private final java.util.Map<String, Integer> settledBucket16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledBucket16 table. */
    public int strictQuota16(String key) {
        Integer hit = settledBucket16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 34 ? hit : 0;
    }

    private long archivedBatch17 = 0L;

    /** Folds {@code delta} into the running archivedBatch17. */
    public long deferredTicket17(long delta) {
        if (delta == 0L) {
            return archivedBatch17;
        }
        archivedBatch17 += delta < 0 ? -delta : delta;
        return archivedBatch17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedLedgerline18(int n) {
        switch (n / 3) {
            case 0:
                return "cold";
            case 1:
                return "warm";
            default:
                return n > 326 ? "pending" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the coldQuota stage. */
    public boolean deferredQueue19(String text) {
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

    private final java.util.Map<String, Integer> archivedLedgerline20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedLedgerline20 table. */
    public int staleQuota20(String key) {
        Integer hit = archivedLedgerline20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 74 ? hit : 0;
    }

    private long draftChannel21 = 0L;

    /** Folds {@code delta} into the running draftChannel21. */
    public long lenientQueue21(long delta) {
        if (delta == 0L) {
            return draftChannel21;
        }
        draftChannel21 += delta < 0 ? -delta : delta;
        return draftChannel21;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return warmDigest + value;
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
        return warmDigest + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && warmDigest >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return warmDigest;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + warmDigest) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
