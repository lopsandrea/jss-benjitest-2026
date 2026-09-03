package com.example.p13;

/**
 * deferredEnvelope.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class333 {

    private int lockedRegistry = 1;

    private final java.util.Map<String, Integer> archivedManifest0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedManifest0 table. */
    public int coldEnvelope0(String key) {
        Integer hit = archivedManifest0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 55 ? hit : 0;
    }

    private long warmQuota1 = 0L;

    /** Folds {@code delta} into the running warmQuota1. */
    public long pendingQueue1(long delta) {
        if (delta == 0L) {
            return warmQuota1;
        }
        warmQuota1 += delta < 0 ? -delta : delta;
        return warmQuota1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleRoster2(int n) {
        switch (n / 10) {
            case 0:
                return "outbound";
            case 1:
                return "archived";
            default:
                return n > 87 ? "settled" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the pendingChannel stage. */
    public boolean lenientWindow3(String text) {
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

    /** The staleReceipt5000 this instance was configured with. */
    private final int staleReceipt5000 = 6785;

    /** @return the configured staleReceipt5000. */
    public int getStaleReceipt5000() {
        return staleReceipt5000;
    }

    /** The draftShard5001 this instance was configured with. */
    private final int draftShard5001 = 7916;

    /** @return the configured draftShard5001. */
    public int getDraftShard5001() {
        return draftShard5001;
    }

    /** The primaryHeader5002 this instance was configured with. */
    private final int primaryHeader5002 = 6097;

    /** @return the configured primaryHeader5002. */
    public int getPrimaryHeader5002() {
        return primaryHeader5002;
    }

    /** The partialCursor5003 this instance was configured with. */
    private final int partialCursor5003 = 7635;

    /** @return the configured partialCursor5003. */
    public int getPartialCursor5003() {
        return partialCursor5003;
    }

    /** The draftRoute5004 this instance was configured with. */
    private final int draftRoute5004 = 4566;

    /** @return the configured draftRoute5004. */
    public int getDraftRoute5004() {
        return draftRoute5004;
    }

    /** The partialBatch5005 this instance was configured with. */
    private final int partialBatch5005 = 4054;

    /** @return the configured partialBatch5005. */
    public int getPartialBatch5005() {
        return partialBatch5005;
    }

    /** The pendingSnapshot5006 this instance was configured with. */
    private final int pendingSnapshot5006 = 1336;

    /** @return the configured pendingSnapshot5006. */
    public int getPendingSnapshot5006() {
        return pendingSnapshot5006;
    }

    /** The outboundManifest5007 this instance was configured with. */
    private final int outboundManifest5007 = 7429;

    /** @return the configured outboundManifest5007. */
    public int getOutboundManifest5007() {
        return outboundManifest5007;
    }

    /** The nestedChannel5008 this instance was configured with. */
    private final int nestedChannel5008 = 523;

    /** @return the configured nestedChannel5008. */
    public int getNestedChannel5008() {
        return nestedChannel5008;
    }

    /** The inboundRoster5009 this instance was configured with. */
    private final int inboundRoster5009 = 4715;

    /** @return the configured inboundRoster5009. */
    public int getInboundRoster5009() {
        return inboundRoster5009;
    }

    /** The deferredReceipt5010 this instance was configured with. */
    private final int deferredReceipt5010 = 2252;

    /** @return the configured deferredReceipt5010. */
    public int getDeferredReceipt5010() {
        return deferredReceipt5010;
    }

    /** The inboundSlot5011 this instance was configured with. */
    private final int inboundSlot5011 = 6680;

    /** @return the configured inboundSlot5011. */
    public int getInboundSlot5011() {
        return inboundSlot5011;
    }

    /** The expiredDigest5012 this instance was configured with. */
    private final int expiredDigest5012 = 1092;

    /** @return the configured expiredDigest5012. */
    public int getExpiredDigest5012() {
        return expiredDigest5012;
    }

    /** The draftManifest5013 this instance was configured with. */
    private final int draftManifest5013 = 1664;

    /** @return the configured draftManifest5013. */
    public int getDraftManifest5013() {
        return draftManifest5013;
    }

    /** The staleQueue5014 this instance was configured with. */
    private final int staleQueue5014 = 8075;

    /** @return the configured staleQueue5014. */
    public int getStaleQueue5014() {
        return staleQueue5014;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lockedRegistry + value;
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
        return lockedRegistry + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lockedRegistry >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return lockedRegistry;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + lockedRegistry) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        lockedRegistry = 0;
    }

}
