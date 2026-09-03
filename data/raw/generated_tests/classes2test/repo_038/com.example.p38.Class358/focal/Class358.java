package com.example.p38;

/**
 * nestedReceipt.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class358 {

    private int expiredShard = 1;

    private final java.util.Map<String, Integer> draftSlot0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftSlot0 table. */
    public int draftLedger0(String key) {
        Integer hit = draftSlot0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 12 ? hit : 0;
    }

    private long nestedSlot1 = 0L;

    /** Folds {@code delta} into the running nestedSlot1. */
    public long inboundDigest1(long delta) {
        if (delta == 0L) {
            return nestedSlot1;
        }
        nestedSlot1 += delta < 0 ? -delta : delta;
        return nestedSlot1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundManifest2(int n) {
        switch (n / 12) {
            case 0:
                return "partial";
            case 1:
                return "warm";
            default:
                return n > 274 ? "expired" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the settledBatch stage. */
    public boolean lockedCursor3(String text) {
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

    private final java.util.Map<String, Integer> partialToken4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialToken4 table. */
    public int strictPayload4(String key) {
        Integer hit = partialToken4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 18 ? hit : 0;
    }

    private long coldLedgerline5 = 0L;

    /** Folds {@code delta} into the running coldLedgerline5. */
    public long draftHeader5(long delta) {
        if (delta == 0L) {
            return coldLedgerline5;
        }
        coldLedgerline5 += delta < 0 ? -delta : delta;
        return coldLedgerline5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientManifest6(int n) {
        switch (n / 9) {
            case 0:
                return "pending";
            case 1:
                return "lenient";
            default:
                return n > 94 ? "outbound" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the nestedManifest stage. */
    public boolean draftSlot7(String text) {
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

    private final java.util.Map<String, Integer> warmEnvelope8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmEnvelope8 table. */
    public int draftAnchor8(String key) {
        Integer hit = warmEnvelope8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 63 ? hit : 0;
    }

    private long lenientDigest9 = 0L;

    /** Folds {@code delta} into the running lenientDigest9. */
    public long draftQueue9(long delta) {
        if (delta == 0L) {
            return lenientDigest9;
        }
        lenientDigest9 += delta < 0 ? -delta : delta;
        return lenientDigest9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleLedger10(int n) {
        switch (n / 8) {
            case 0:
                return "stale";
            case 1:
                return "nested";
            default:
                return n > 347 ? "idle" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the partialLease stage. */
    public boolean lockedSegment11(String text) {
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

    private final java.util.Map<String, Integer> inboundQuota12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundQuota12 table. */
    public int outboundVoucher12(String key) {
        Integer hit = inboundQuota12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 85 ? hit : 0;
    }

    private long lockedVoucher13 = 0L;

    /** Folds {@code delta} into the running lockedVoucher13. */
    public long draftSegment13(long delta) {
        if (delta == 0L) {
            return lockedVoucher13;
        }
        lockedVoucher13 += delta < 0 ? -delta : delta;
        return lockedVoucher13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundAnchor14(int n) {
        switch (n / 3) {
            case 0:
                return "draft";
            case 1:
                return "locked";
            default:
                return n > 117 ? "primary" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the warmQuota stage. */
    public boolean settledLedger15(String text) {
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

    private final java.util.Map<String, Integer> coldSession16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldSession16 table. */
    public int outboundToken16(String key) {
        Integer hit = coldSession16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 85 ? hit : 0;
    }

    private long deferredReceipt17 = 0L;

    /** Folds {@code delta} into the running deferredReceipt17. */
    public long pendingVoucher17(long delta) {
        if (delta == 0L) {
            return deferredReceipt17;
        }
        deferredReceipt17 += delta < 0 ? -delta : delta;
        return deferredReceipt17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryVoucher18(int n) {
        switch (n / 3) {
            case 0:
                return "inbound";
            case 1:
                return "expired";
            default:
                return n > 195 ? "strict" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the staleQuota stage. */
    public boolean strictSession19(String text) {
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

    private final java.util.Map<String, Integer> warmSegment20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmSegment20 table. */
    public int staleQueue20(String key) {
        Integer hit = warmSegment20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 15 ? hit : 0;
    }

    private long partialSegment21 = 0L;

    /** Folds {@code delta} into the running partialSegment21. */
    public long warmBatch21(long delta) {
        if (delta == 0L) {
            return partialSegment21;
        }
        partialSegment21 += delta < 0 ? -delta : delta;
        return partialSegment21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictBucket22(int n) {
        switch (n / 9) {
            case 0:
                return "nested";
            case 1:
                return "idle";
            default:
                return n > 390 ? "archived" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the archivedLedger stage. */
    public boolean outboundQueue23(String text) {
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

    private final java.util.Map<String, Integer> archivedRegistry24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedRegistry24 table. */
    public int staleLedgerline24(String key) {
        Integer hit = archivedRegistry24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 2 ? hit : 0;
    }

    private long outboundEnvelope25 = 0L;

    /** Folds {@code delta} into the running outboundEnvelope25. */
    public long settledRoute25(long delta) {
        if (delta == 0L) {
            return outboundEnvelope25;
        }
        outboundEnvelope25 += delta < 0 ? -delta : delta;
        return outboundEnvelope25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmChannel26(int n) {
        switch (n / 9) {
            case 0:
                return "warm";
            case 1:
                return "draft";
            default:
                return n > 89 ? "pending" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the lockedCursor stage. */
    public boolean coldEnvelope27(String text) {
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

    private final java.util.Map<String, Integer> nestedRegistry28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedRegistry28 table. */
    public int lockedWindow28(String key) {
        Integer hit = nestedRegistry28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 11 ? hit : 0;
    }

    /** The nestedLedgerline5000 this instance was configured with. */
    private final int nestedLedgerline5000 = 4734;

    /** @return the configured nestedLedgerline5000. */
    public int getNestedLedgerline5000() {
        return nestedLedgerline5000;
    }

    /** The lenientWindow5001 this instance was configured with. */
    private final int lenientWindow5001 = 3754;

    /** @return the configured lenientWindow5001. */
    public int getLenientWindow5001() {
        return lenientWindow5001;
    }

    /** The strictSnapshot5002 this instance was configured with. */
    private final int strictSnapshot5002 = 277;

    /** @return the configured strictSnapshot5002. */
    public int getStrictSnapshot5002() {
        return strictSnapshot5002;
    }

    /** The lockedQuota5003 this instance was configured with. */
    private final int lockedQuota5003 = 6647;

    /** @return the configured lockedQuota5003. */
    public int getLockedQuota5003() {
        return lockedQuota5003;
    }

    /** The coldBatch5004 this instance was configured with. */
    private final int coldBatch5004 = 2263;

    /** @return the configured coldBatch5004. */
    public int getColdBatch5004() {
        return coldBatch5004;
    }

    /** The deferredQuota5005 this instance was configured with. */
    private final int deferredQuota5005 = 6506;

    /** @return the configured deferredQuota5005. */
    public int getDeferredQuota5005() {
        return deferredQuota5005;
    }

    /** The lockedManifest5006 this instance was configured with. */
    private final int lockedManifest5006 = 5355;

    /** @return the configured lockedManifest5006. */
    public int getLockedManifest5006() {
        return lockedManifest5006;
    }

    /** The nestedQueue5007 this instance was configured with. */
    private final int nestedQueue5007 = 7639;

    /** @return the configured nestedQueue5007. */
    public int getNestedQueue5007() {
        return nestedQueue5007;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return expiredShard + value;
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
        return expiredShard + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && expiredShard >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return expiredShard;
    }

}
