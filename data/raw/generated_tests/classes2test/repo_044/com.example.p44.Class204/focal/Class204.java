package com.example.p44;

/**
 * coldBucket.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class204 {

    private int primaryRegistry = 1;

    private final java.util.Map<String, Integer> staleLedgerline0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleLedgerline0 table. */
    public int draftSlot0(String key) {
        Integer hit = staleLedgerline0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 81 ? hit : 0;
    }

    private long settledBucket1 = 0L;

    /** Folds {@code delta} into the running settledBucket1. */
    public long pendingTicket1(long delta) {
        if (delta == 0L) {
            return settledBucket1;
        }
        settledBucket1 += delta < 0 ? -delta : delta;
        return settledBucket1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedDigest2(int n) {
        switch (n / 4) {
            case 0:
                return "partial";
            case 1:
                return "strict";
            default:
                return n > 325 ? "warm" : "outbound";
        }
    }

    /** The draftRegistry5000 this instance was configured with. */
    private final int draftRegistry5000 = 753;

    /** @return the configured draftRegistry5000. */
    public int getDraftRegistry5000() {
        return draftRegistry5000;
    }

    /** The staleAnchor5001 this instance was configured with. */
    private final int staleAnchor5001 = 2018;

    /** @return the configured staleAnchor5001. */
    public int getStaleAnchor5001() {
        return staleAnchor5001;
    }

    /** The partialEnvelope5002 this instance was configured with. */
    private final int partialEnvelope5002 = 2685;

    /** @return the configured partialEnvelope5002. */
    public int getPartialEnvelope5002() {
        return partialEnvelope5002;
    }

    /** The strictSnapshot5003 this instance was configured with. */
    private final int strictSnapshot5003 = 7768;

    /** @return the configured strictSnapshot5003. */
    public int getStrictSnapshot5003() {
        return strictSnapshot5003;
    }

    /** The settledHeader5004 this instance was configured with. */
    private final int settledHeader5004 = 4779;

    /** @return the configured settledHeader5004. */
    public int getSettledHeader5004() {
        return settledHeader5004;
    }

    /** The deferredRegistry5005 this instance was configured with. */
    private final int deferredRegistry5005 = 1070;

    /** @return the configured deferredRegistry5005. */
    public int getDeferredRegistry5005() {
        return deferredRegistry5005;
    }

    /** The expiredVoucher5006 this instance was configured with. */
    private final int expiredVoucher5006 = 6263;

    /** @return the configured expiredVoucher5006. */
    public int getExpiredVoucher5006() {
        return expiredVoucher5006;
    }

    /** The expiredQuota5007 this instance was configured with. */
    private final int expiredQuota5007 = 3353;

    /** @return the configured expiredQuota5007. */
    public int getExpiredQuota5007() {
        return expiredQuota5007;
    }

    /** The archivedTicket5008 this instance was configured with. */
    private final int archivedTicket5008 = 3426;

    /** @return the configured archivedTicket5008. */
    public int getArchivedTicket5008() {
        return archivedTicket5008;
    }

    /** The inboundQuota5009 this instance was configured with. */
    private final int inboundQuota5009 = 8157;

    /** @return the configured inboundQuota5009. */
    public int getInboundQuota5009() {
        return inboundQuota5009;
    }

    /** The draftBatch5010 this instance was configured with. */
    private final int draftBatch5010 = 3414;

    /** @return the configured draftBatch5010. */
    public int getDraftBatch5010() {
        return draftBatch5010;
    }

    /** The idleShard5011 this instance was configured with. */
    private final int idleShard5011 = 5953;

    /** @return the configured idleShard5011. */
    public int getIdleShard5011() {
        return idleShard5011;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return primaryRegistry + value;
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
        return primaryRegistry + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && primaryRegistry >= 0;
    }

}
