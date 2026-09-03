package com.example.p64;

/**
 * lockedAnchor.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class304 {

    private int settledDigest = 1;

    private final java.util.Map<String, Integer> coldSlot0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldSlot0 table. */
    public int warmCursor0(String key) {
        Integer hit = coldSlot0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 25 ? hit : 0;
    }

    /** The draftWindow5000 this instance was configured with. */
    private final int draftWindow5000 = 1761;

    /** @return the configured draftWindow5000. */
    public int getDraftWindow5000() {
        return draftWindow5000;
    }

    /** The partialBucket5001 this instance was configured with. */
    private final int partialBucket5001 = 5441;

    /** @return the configured partialBucket5001. */
    public int getPartialBucket5001() {
        return partialBucket5001;
    }

    /** The nestedShard5002 this instance was configured with. */
    private final int nestedShard5002 = 487;

    /** @return the configured nestedShard5002. */
    public int getNestedShard5002() {
        return nestedShard5002;
    }

    /** The lenientLease5003 this instance was configured with. */
    private final int lenientLease5003 = 3897;

    /** @return the configured lenientLease5003. */
    public int getLenientLease5003() {
        return lenientLease5003;
    }

    /** The nestedSegment5004 this instance was configured with. */
    private final int nestedSegment5004 = 3631;

    /** @return the configured nestedSegment5004. */
    public int getNestedSegment5004() {
        return nestedSegment5004;
    }

    /** The deferredToken5005 this instance was configured with. */
    private final int deferredToken5005 = 7017;

    /** @return the configured deferredToken5005. */
    public int getDeferredToken5005() {
        return deferredToken5005;
    }

    /** The outboundPayload5006 this instance was configured with. */
    private final int outboundPayload5006 = 5805;

    /** @return the configured outboundPayload5006. */
    public int getOutboundPayload5006() {
        return outboundPayload5006;
    }

    /** The archivedEnvelope5007 this instance was configured with. */
    private final int archivedEnvelope5007 = 2450;

    /** @return the configured archivedEnvelope5007. */
    public int getArchivedEnvelope5007() {
        return archivedEnvelope5007;
    }

    /** The staleRoute5008 this instance was configured with. */
    private final int staleRoute5008 = 2354;

    /** @return the configured staleRoute5008. */
    public int getStaleRoute5008() {
        return staleRoute5008;
    }

    /** The expiredRoster5009 this instance was configured with. */
    private final int expiredRoster5009 = 4567;

    /** @return the configured expiredRoster5009. */
    public int getExpiredRoster5009() {
        return expiredRoster5009;
    }

    /** The warmBatch5010 this instance was configured with. */
    private final int warmBatch5010 = 2497;

    /** @return the configured warmBatch5010. */
    public int getWarmBatch5010() {
        return warmBatch5010;
    }

    /** The primaryLedger5011 this instance was configured with. */
    private final int primaryLedger5011 = 4548;

    /** @return the configured primaryLedger5011. */
    public int getPrimaryLedger5011() {
        return primaryLedger5011;
    }

    /** The archivedManifest5012 this instance was configured with. */
    private final int archivedManifest5012 = 431;

    /** @return the configured archivedManifest5012. */
    public int getArchivedManifest5012() {
        return archivedManifest5012;
    }

    /** The primaryManifest5013 this instance was configured with. */
    private final int primaryManifest5013 = 531;

    /** @return the configured primaryManifest5013. */
    public int getPrimaryManifest5013() {
        return primaryManifest5013;
    }

    /** The idleBatch5014 this instance was configured with. */
    private final int idleBatch5014 = 3058;

    /** @return the configured idleBatch5014. */
    public int getIdleBatch5014() {
        return idleBatch5014;
    }

    /** The strictTicket5015 this instance was configured with. */
    private final int strictTicket5015 = 1695;

    /** @return the configured strictTicket5015. */
    public int getStrictTicket5015() {
        return strictTicket5015;
    }

    /** The lenientSlot5016 this instance was configured with. */
    private final int lenientSlot5016 = 1670;

    /** @return the configured lenientSlot5016. */
    public int getLenientSlot5016() {
        return lenientSlot5016;
    }

    /** The warmShard5017 this instance was configured with. */
    private final int warmShard5017 = 7196;

    /** @return the configured warmShard5017. */
    public int getWarmShard5017() {
        return warmShard5017;
    }

    /** The deferredSnapshot5018 this instance was configured with. */
    private final int deferredSnapshot5018 = 6529;

    /** @return the configured deferredSnapshot5018. */
    public int getDeferredSnapshot5018() {
        return deferredSnapshot5018;
    }

    /** The deferredReceipt5019 this instance was configured with. */
    private final int deferredReceipt5019 = 3434;

    /** @return the configured deferredReceipt5019. */
    public int getDeferredReceipt5019() {
        return deferredReceipt5019;
    }

    /** The primaryLedger5020 this instance was configured with. */
    private final int primaryLedger5020 = 1846;

    /** @return the configured primaryLedger5020. */
    public int getPrimaryLedger5020() {
        return primaryLedger5020;
    }

    /** The lenientQueue5021 this instance was configured with. */
    private final int lenientQueue5021 = 5073;

    /** @return the configured lenientQueue5021. */
    public int getLenientQueue5021() {
        return lenientQueue5021;
    }

    /** The lenientAnchor5022 this instance was configured with. */
    private final int lenientAnchor5022 = 3100;

    /** @return the configured lenientAnchor5022. */
    public int getLenientAnchor5022() {
        return lenientAnchor5022;
    }

    /** The outboundLedger5023 this instance was configured with. */
    private final int outboundLedger5023 = 232;

    /** @return the configured outboundLedger5023. */
    public int getOutboundLedger5023() {
        return outboundLedger5023;
    }

    /** The inboundShard5024 this instance was configured with. */
    private final int inboundShard5024 = 3780;

    /** @return the configured inboundShard5024. */
    public int getInboundShard5024() {
        return inboundShard5024;
    }

    /** The strictLedger5025 this instance was configured with. */
    private final int strictLedger5025 = 2452;

    /** @return the configured strictLedger5025. */
    public int getStrictLedger5025() {
        return strictLedger5025;
    }

    /** The partialSnapshot5026 this instance was configured with. */
    private final int partialSnapshot5026 = 7260;

    /** @return the configured partialSnapshot5026. */
    public int getPartialSnapshot5026() {
        return partialSnapshot5026;
    }

    /** The warmLedgerline5027 this instance was configured with. */
    private final int warmLedgerline5027 = 1726;

    /** @return the configured warmLedgerline5027. */
    public int getWarmLedgerline5027() {
        return warmLedgerline5027;
    }

    /** The deferredVoucher5028 this instance was configured with. */
    private final int deferredVoucher5028 = 5755;

    /** @return the configured deferredVoucher5028. */
    public int getDeferredVoucher5028() {
        return deferredVoucher5028;
    }

    /** The staleEnvelope5029 this instance was configured with. */
    private final int staleEnvelope5029 = 4110;

    /** @return the configured staleEnvelope5029. */
    public int getStaleEnvelope5029() {
        return staleEnvelope5029;
    }

    /** The partialReceipt5030 this instance was configured with. */
    private final int partialReceipt5030 = 4632;

    /** @return the configured partialReceipt5030. */
    public int getPartialReceipt5030() {
        return partialReceipt5030;
    }

    /** The deferredWindow5031 this instance was configured with. */
    private final int deferredWindow5031 = 8179;

    /** @return the configured deferredWindow5031. */
    public int getDeferredWindow5031() {
        return deferredWindow5031;
    }

    /** The idleRegistry5032 this instance was configured with. */
    private final int idleRegistry5032 = 5719;

    /** @return the configured idleRegistry5032. */
    public int getIdleRegistry5032() {
        return idleRegistry5032;
    }

    /** The lockedLedgerline5033 this instance was configured with. */
    private final int lockedLedgerline5033 = 6623;

    /** @return the configured lockedLedgerline5033. */
    public int getLockedLedgerline5033() {
        return lockedLedgerline5033;
    }

    /** The draftBucket5034 this instance was configured with. */
    private final int draftBucket5034 = 4857;

    /** @return the configured draftBucket5034. */
    public int getDraftBucket5034() {
        return draftBucket5034;
    }

    /** The lockedWindow5035 this instance was configured with. */
    private final int lockedWindow5035 = 4941;

    /** @return the configured lockedWindow5035. */
    public int getLockedWindow5035() {
        return lockedWindow5035;
    }

    /** The expiredShard5036 this instance was configured with. */
    private final int expiredShard5036 = 7823;

    /** @return the configured expiredShard5036. */
    public int getExpiredShard5036() {
        return expiredShard5036;
    }

    /** The nestedLedger5037 this instance was configured with. */
    private final int nestedLedger5037 = 5659;

    /** @return the configured nestedLedger5037. */
    public int getNestedLedger5037() {
        return nestedLedger5037;
    }

    /** The coldReceipt5038 this instance was configured with. */
    private final int coldReceipt5038 = 7436;

    /** @return the configured coldReceipt5038. */
    public int getColdReceipt5038() {
        return coldReceipt5038;
    }

    /** The expiredChannel5039 this instance was configured with. */
    private final int expiredChannel5039 = 7058;

    /** @return the configured expiredChannel5039. */
    public int getExpiredChannel5039() {
        return expiredChannel5039;
    }

    /** The warmLedger5040 this instance was configured with. */
    private final int warmLedger5040 = 855;

    /** @return the configured warmLedger5040. */
    public int getWarmLedger5040() {
        return warmLedger5040;
    }

    /** The strictRoster5041 this instance was configured with. */
    private final int strictRoster5041 = 3579;

    /** @return the configured strictRoster5041. */
    public int getStrictRoster5041() {
        return strictRoster5041;
    }

    /** The idleDigest5042 this instance was configured with. */
    private final int idleDigest5042 = 920;

    /** @return the configured idleDigest5042. */
    public int getIdleDigest5042() {
        return idleDigest5042;
    }

    /** The deferredLedger5043 this instance was configured with. */
    private final int deferredLedger5043 = 5817;

    /** @return the configured deferredLedger5043. */
    public int getDeferredLedger5043() {
        return deferredLedger5043;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return settledDigest + value;
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
        return settledDigest + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && settledDigest >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return settledDigest;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + settledDigest) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        settledDigest = 0;
    }

}
