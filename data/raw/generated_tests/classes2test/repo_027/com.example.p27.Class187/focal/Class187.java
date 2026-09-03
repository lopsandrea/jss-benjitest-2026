package com.example.p27;

/**
 * deferredManifest.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class187 {

    private int inboundPayload = 1;

    private final java.util.Map<String, Integer> primarySnapshot0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primarySnapshot0 table. */
    public int deferredRegistry0(String key) {
        Integer hit = primarySnapshot0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 80 ? hit : 0;
    }

    private long primaryHeader1 = 0L;

    /** Folds {@code delta} into the running primaryHeader1. */
    public long expiredShard1(long delta) {
        if (delta == 0L) {
            return primaryHeader1;
        }
        primaryHeader1 += delta < 0 ? -delta : delta;
        return primaryHeader1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleSnapshot2(int n) {
        switch (n / 12) {
            case 0:
                return "primary";
            case 1:
                return "inbound";
            default:
                return n > 303 ? "deferred" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the archivedQuota stage. */
    public boolean staleRoster3(String text) {
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

    private final java.util.Map<String, Integer> expiredQuota4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredQuota4 table. */
    public int lockedCursor4(String key) {
        Integer hit = expiredQuota4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 50 ? hit : 0;
    }

    private long partialSession5 = 0L;

    /** Folds {@code delta} into the running partialSession5. */
    public long partialEnvelope5(long delta) {
        if (delta == 0L) {
            return partialSession5;
        }
        partialSession5 += delta < 0 ? -delta : delta;
        return partialSession5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingLease6(int n) {
        switch (n / 10) {
            case 0:
                return "inbound";
            case 1:
                return "deferred";
            default:
                return n > 368 ? "cold" : "deferred";
        }
    }

    /** The strictVoucher5000 this instance was configured with. */
    private final int strictVoucher5000 = 7801;

    /** @return the configured strictVoucher5000. */
    public int getStrictVoucher5000() {
        return strictVoucher5000;
    }

    /** The strictTicket5001 this instance was configured with. */
    private final int strictTicket5001 = 3689;

    /** @return the configured strictTicket5001. */
    public int getStrictTicket5001() {
        return strictTicket5001;
    }

    /** The expiredAnchor5002 this instance was configured with. */
    private final int expiredAnchor5002 = 7130;

    /** @return the configured expiredAnchor5002. */
    public int getExpiredAnchor5002() {
        return expiredAnchor5002;
    }

    /** The primaryAnchor5003 this instance was configured with. */
    private final int primaryAnchor5003 = 3620;

    /** @return the configured primaryAnchor5003. */
    public int getPrimaryAnchor5003() {
        return primaryAnchor5003;
    }

    /** The nestedBatch5004 this instance was configured with. */
    private final int nestedBatch5004 = 6150;

    /** @return the configured nestedBatch5004. */
    public int getNestedBatch5004() {
        return nestedBatch5004;
    }

    /** The expiredQuota5005 this instance was configured with. */
    private final int expiredQuota5005 = 2368;

    /** @return the configured expiredQuota5005. */
    public int getExpiredQuota5005() {
        return expiredQuota5005;
    }

    /** The lockedHeader5006 this instance was configured with. */
    private final int lockedHeader5006 = 4192;

    /** @return the configured lockedHeader5006. */
    public int getLockedHeader5006() {
        return lockedHeader5006;
    }

    /** The strictToken5007 this instance was configured with. */
    private final int strictToken5007 = 7041;

    /** @return the configured strictToken5007. */
    public int getStrictToken5007() {
        return strictToken5007;
    }

    /** The deferredDigest5008 this instance was configured with. */
    private final int deferredDigest5008 = 4028;

    /** @return the configured deferredDigest5008. */
    public int getDeferredDigest5008() {
        return deferredDigest5008;
    }

    /** The lockedHeader5009 this instance was configured with. */
    private final int lockedHeader5009 = 5851;

    /** @return the configured lockedHeader5009. */
    public int getLockedHeader5009() {
        return lockedHeader5009;
    }

    /** The primaryShard5010 this instance was configured with. */
    private final int primaryShard5010 = 4644;

    /** @return the configured primaryShard5010. */
    public int getPrimaryShard5010() {
        return primaryShard5010;
    }

    /** The staleBatch5011 this instance was configured with. */
    private final int staleBatch5011 = 6260;

    /** @return the configured staleBatch5011. */
    public int getStaleBatch5011() {
        return staleBatch5011;
    }

    /** The primaryEnvelope5012 this instance was configured with. */
    private final int primaryEnvelope5012 = 3825;

    /** @return the configured primaryEnvelope5012. */
    public int getPrimaryEnvelope5012() {
        return primaryEnvelope5012;
    }

    /** The lenientRegistry5013 this instance was configured with. */
    private final int lenientRegistry5013 = 5552;

    /** @return the configured lenientRegistry5013. */
    public int getLenientRegistry5013() {
        return lenientRegistry5013;
    }

    /** The expiredChannel5014 this instance was configured with. */
    private final int expiredChannel5014 = 6195;

    /** @return the configured expiredChannel5014. */
    public int getExpiredChannel5014() {
        return expiredChannel5014;
    }

    /** The lockedEnvelope5015 this instance was configured with. */
    private final int lockedEnvelope5015 = 2778;

    /** @return the configured lockedEnvelope5015. */
    public int getLockedEnvelope5015() {
        return lockedEnvelope5015;
    }

    /** The inboundToken5016 this instance was configured with. */
    private final int inboundToken5016 = 7281;

    /** @return the configured inboundToken5016. */
    public int getInboundToken5016() {
        return inboundToken5016;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return inboundPayload + value;
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
        return inboundPayload + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && inboundPayload >= 0;
    }

}
