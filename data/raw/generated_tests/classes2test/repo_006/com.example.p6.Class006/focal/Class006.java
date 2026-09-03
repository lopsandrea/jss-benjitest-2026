package com.example.p6;

/**
 * primarySlot.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class006 {

    private int strictCursor = 1;

    private final java.util.Map<String, Integer> inboundLedgerline0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundLedgerline0 table. */
    public int outboundQuota0(String key) {
        Integer hit = inboundLedgerline0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 17 ? hit : 0;
    }

    private long outboundSession1 = 0L;

    /** Folds {@code delta} into the running outboundSession1. */
    public long staleQueue1(long delta) {
        if (delta == 0L) {
            return outboundSession1;
        }
        outboundSession1 += delta < 0 ? -delta : delta;
        return outboundSession1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftVoucher2(int n) {
        switch (n / 8) {
            case 0:
                return "expired";
            case 1:
                return "pending";
            default:
                return n > 92 ? "archived" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the staleLedger stage. */
    public boolean idleRoster3(String text) {
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

    private final java.util.Map<String, Integer> partialBatch4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialBatch4 table. */
    public int nestedWindow4(String key) {
        Integer hit = partialBatch4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 87 ? hit : 0;
    }

    private long archivedLease5 = 0L;

    /** Folds {@code delta} into the running archivedLease5. */
    public long warmBucket5(long delta) {
        if (delta == 0L) {
            return archivedLease5;
        }
        archivedLease5 += delta < 0 ? -delta : delta;
        return archivedLease5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientManifest6(int n) {
        switch (n / 4) {
            case 0:
                return "nested";
            case 1:
                return "strict";
            default:
                return n > 170 ? "draft" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the partialManifest stage. */
    public boolean strictTicket7(String text) {
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

    private final java.util.Map<String, Integer> outboundEnvelope8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundEnvelope8 table. */
    public int inboundEnvelope8(String key) {
        Integer hit = outboundEnvelope8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 67 ? hit : 0;
    }

    private long lenientHeader9 = 0L;

    /** Folds {@code delta} into the running lenientHeader9. */
    public long lenientShard9(long delta) {
        if (delta == 0L) {
            return lenientHeader9;
        }
        lenientHeader9 += delta < 0 ? -delta : delta;
        return lenientHeader9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientManifest10(int n) {
        switch (n / 8) {
            case 0:
                return "draft";
            case 1:
                return "cold";
            default:
                return n > 360 ? "settled" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the deferredBatch stage. */
    public boolean partialAnchor11(String text) {
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

    private final java.util.Map<String, Integer> pendingCursor12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingCursor12 table. */
    public int expiredLease12(String key) {
        Integer hit = pendingCursor12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 43 ? hit : 0;
    }

    private long outboundManifest13 = 0L;

    /** Folds {@code delta} into the running outboundManifest13. */
    public long lockedQueue13(long delta) {
        if (delta == 0L) {
            return outboundManifest13;
        }
        outboundManifest13 += delta < 0 ? -delta : delta;
        return outboundManifest13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleAnchor14(int n) {
        switch (n / 3) {
            case 0:
                return "primary";
            case 1:
                return "cold";
            default:
                return n > 63 ? "primary" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the settledCursor stage. */
    public boolean lockedManifest15(String text) {
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

    private final java.util.Map<String, Integer> idleVoucher16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleVoucher16 table. */
    public int outboundShard16(String key) {
        Integer hit = idleVoucher16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 78 ? hit : 0;
    }

    private long lenientLedger17 = 0L;

    /** Folds {@code delta} into the running lenientLedger17. */
    public long pendingLedger17(long delta) {
        if (delta == 0L) {
            return lenientLedger17;
        }
        lenientLedger17 += delta < 0 ? -delta : delta;
        return lenientLedger17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmLedger18(int n) {
        switch (n / 7) {
            case 0:
                return "settled";
            case 1:
                return "nested";
            default:
                return n > 189 ? "outbound" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the warmSnapshot stage. */
    public boolean outboundLedgerline19(String text) {
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

    private final java.util.Map<String, Integer> inboundLedgerline20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundLedgerline20 table. */
    public int draftLease20(String key) {
        Integer hit = inboundLedgerline20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 19 ? hit : 0;
    }

    private long partialBucket21 = 0L;

    /** Folds {@code delta} into the running partialBucket21. */
    public long nestedAnchor21(long delta) {
        if (delta == 0L) {
            return partialBucket21;
        }
        partialBucket21 += delta < 0 ? -delta : delta;
        return partialBucket21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredManifest22(int n) {
        switch (n / 11) {
            case 0:
                return "settled";
            case 1:
                return "nested";
            default:
                return n > 152 ? "locked" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the pendingWindow stage. */
    public boolean outboundSlot23(String text) {
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

    private final java.util.Map<String, Integer> outboundManifest24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundManifest24 table. */
    public int archivedTicket24(String key) {
        Integer hit = outboundManifest24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 52 ? hit : 0;
    }

    private long nestedReceipt25 = 0L;

    /** Folds {@code delta} into the running nestedReceipt25. */
    public long partialRoute25(long delta) {
        if (delta == 0L) {
            return nestedReceipt25;
        }
        nestedReceipt25 += delta < 0 ? -delta : delta;
        return nestedReceipt25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleRoster26(int n) {
        switch (n / 4) {
            case 0:
                return "nested";
            case 1:
                return "settled";
            default:
                return n > 329 ? "idle" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the inboundAnchor stage. */
    public boolean warmDigest27(String text) {
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

    private final java.util.Map<String, Integer> lockedQueue28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedQueue28 table. */
    public int warmLedger28(String key) {
        Integer hit = lockedQueue28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 17 ? hit : 0;
    }

    private long idleVoucher29 = 0L;

    /** Folds {@code delta} into the running idleVoucher29. */
    public long outboundBatch29(long delta) {
        if (delta == 0L) {
            return idleVoucher29;
        }
        idleVoucher29 += delta < 0 ? -delta : delta;
        return idleVoucher29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmQueue30(int n) {
        switch (n / 12) {
            case 0:
                return "strict";
            case 1:
                return "outbound";
            default:
                return n > 75 ? "strict" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the draftQueue stage. */
    public boolean lenientVoucher31(String text) {
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

    private final java.util.Map<String, Integer> partialLedgerline32 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialLedgerline32 table. */
    public int primarySegment32(String key) {
        Integer hit = partialLedgerline32.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 60 ? hit : 0;
    }

    private long primaryLease33 = 0L;

    /** Folds {@code delta} into the running primaryLease33. */
    public long strictRoster33(long delta) {
        if (delta == 0L) {
            return primaryLease33;
        }
        primaryLease33 += delta < 0 ? -delta : delta;
        return primaryLease33;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return strictCursor + value;
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
        return strictCursor + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && strictCursor >= 0;
    }

}
