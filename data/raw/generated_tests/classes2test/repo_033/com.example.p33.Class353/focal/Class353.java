package com.example.p33;

/**
 * lockedManifest.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class353 {

    private int archivedBatch = 1;

    private final java.util.Map<String, Integer> primaryReceipt0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryReceipt0 table. */
    public int pendingBucket0(String key) {
        Integer hit = primaryReceipt0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 13 ? hit : 0;
    }

    private long strictSnapshot1 = 0L;

    /** Folds {@code delta} into the running strictSnapshot1. */
    public long primaryQuota1(long delta) {
        if (delta == 0L) {
            return strictSnapshot1;
        }
        strictSnapshot1 += delta < 0 ? -delta : delta;
        return strictSnapshot1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialRoute2(int n) {
        switch (n / 5) {
            case 0:
                return "cold";
            case 1:
                return "pending";
            default:
                return n > 70 ? "outbound" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the archivedBatch stage. */
    public boolean nestedToken3(String text) {
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

    private final java.util.Map<String, Integer> pendingSlot4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingSlot4 table. */
    public int primaryManifest4(String key) {
        Integer hit = pendingSlot4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 59 ? hit : 0;
    }

    private long lockedToken5 = 0L;

    /** Folds {@code delta} into the running lockedToken5. */
    public long expiredSnapshot5(long delta) {
        if (delta == 0L) {
            return lockedToken5;
        }
        lockedToken5 += delta < 0 ? -delta : delta;
        return lockedToken5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftLease6(int n) {
        switch (n / 12) {
            case 0:
                return "archived";
            case 1:
                return "primary";
            default:
                return n > 210 ? "pending" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the nestedRoster stage. */
    public boolean lenientBucket7(String text) {
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

    private final java.util.Map<String, Integer> coldShard8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldShard8 table. */
    public int primaryQuota8(String key) {
        Integer hit = coldShard8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 50 ? hit : 0;
    }

    private long archivedReceipt9 = 0L;

    /** Folds {@code delta} into the running archivedReceipt9. */
    public long idleQueue9(long delta) {
        if (delta == 0L) {
            return archivedReceipt9;
        }
        archivedReceipt9 += delta < 0 ? -delta : delta;
        return archivedReceipt9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryPayload10(int n) {
        switch (n / 11) {
            case 0:
                return "primary";
            case 1:
                return "pending";
            default:
                return n > 184 ? "settled" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the inboundSlot stage. */
    public boolean deferredHeader11(String text) {
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

    private final java.util.Map<String, Integer> nestedLease12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedLease12 table. */
    public int staleBatch12(String key) {
        Integer hit = nestedLease12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 89 ? hit : 0;
    }

    private long nestedRoute13 = 0L;

    /** Folds {@code delta} into the running nestedRoute13. */
    public long nestedRegistry13(long delta) {
        if (delta == 0L) {
            return nestedRoute13;
        }
        nestedRoute13 += delta < 0 ? -delta : delta;
        return nestedRoute13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedSlot14(int n) {
        switch (n / 3) {
            case 0:
                return "stale";
            case 1:
                return "settled";
            default:
                return n > 339 ? "settled" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the lockedLease stage. */
    public boolean deferredSession15(String text) {
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

    private final java.util.Map<String, Integer> inboundTicket16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundTicket16 table. */
    public int partialShard16(String key) {
        Integer hit = inboundTicket16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 24 ? hit : 0;
    }

    private long outboundSegment17 = 0L;

    /** Folds {@code delta} into the running outboundSegment17. */
    public long staleCursor17(long delta) {
        if (delta == 0L) {
            return outboundSegment17;
        }
        outboundSegment17 += delta < 0 ? -delta : delta;
        return outboundSegment17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredSegment18(int n) {
        switch (n / 8) {
            case 0:
                return "nested";
            case 1:
                return "strict";
            default:
                return n > 380 ? "nested" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the idleSegment stage. */
    public boolean deferredEnvelope19(String text) {
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

    private final java.util.Map<String, Integer> nestedWindow20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedWindow20 table. */
    public int inboundHeader20(String key) {
        Integer hit = nestedWindow20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 88 ? hit : 0;
    }

    private long coldQuota21 = 0L;

    /** Folds {@code delta} into the running coldQuota21. */
    public long coldSegment21(long delta) {
        if (delta == 0L) {
            return coldQuota21;
        }
        coldQuota21 += delta < 0 ? -delta : delta;
        return coldQuota21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictRegistry22(int n) {
        switch (n / 10) {
            case 0:
                return "settled";
            case 1:
                return "locked";
            default:
                return n > 106 ? "partial" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the warmLedger stage. */
    public boolean coldSegment23(String text) {
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

    private final java.util.Map<String, Integer> expiredHeader24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredHeader24 table. */
    public int staleRoster24(String key) {
        Integer hit = expiredHeader24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 87 ? hit : 0;
    }

    private long archivedQuota25 = 0L;

    /** Folds {@code delta} into the running archivedQuota25. */
    public long pendingAnchor25(long delta) {
        if (delta == 0L) {
            return archivedQuota25;
        }
        archivedQuota25 += delta < 0 ? -delta : delta;
        return archivedQuota25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleSlot26(int n) {
        switch (n / 9) {
            case 0:
                return "strict";
            case 1:
                return "inbound";
            default:
                return n > 233 ? "strict" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the staleWindow stage. */
    public boolean expiredRegistry27(String text) {
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

    private final java.util.Map<String, Integer> partialSnapshot28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialSnapshot28 table. */
    public int strictManifest28(String key) {
        Integer hit = partialSnapshot28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 18 ? hit : 0;
    }

    private long outboundQuota29 = 0L;

    /** Folds {@code delta} into the running outboundQuota29. */
    public long settledRoute29(long delta) {
        if (delta == 0L) {
            return outboundQuota29;
        }
        outboundQuota29 += delta < 0 ? -delta : delta;
        return outboundQuota29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundRoute30(int n) {
        switch (n / 2) {
            case 0:
                return "archived";
            case 1:
                return "idle";
            default:
                return n > 316 ? "outbound" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the partialSegment stage. */
    public boolean lenientDigest31(String text) {
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

    private final java.util.Map<String, Integer> lenientLedgerline32 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientLedgerline32 table. */
    public int expiredLedger32(String key) {
        Integer hit = lenientLedgerline32.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 27 ? hit : 0;
    }

    private long outboundQuota33 = 0L;

    /** Folds {@code delta} into the running outboundQuota33. */
    public long lockedLedger33(long delta) {
        if (delta == 0L) {
            return outboundQuota33;
        }
        outboundQuota33 += delta < 0 ? -delta : delta;
        return outboundQuota33;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return archivedBatch + value;
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
        return archivedBatch + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && archivedBatch >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return archivedBatch;
    }

}
