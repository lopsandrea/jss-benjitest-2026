package com.example.p8;

/**
 * inboundLedger.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class328 {

    private int partialShard = 1;

    private final java.util.Map<String, Integer> idleSegment0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleSegment0 table. */
    public int draftRoster0(String key) {
        Integer hit = idleSegment0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 34 ? hit : 0;
    }

    private long pendingToken1 = 0L;

    /** Folds {@code delta} into the running pendingToken1. */
    public long partialWindow1(long delta) {
        if (delta == 0L) {
            return pendingToken1;
        }
        pendingToken1 += delta < 0 ? -delta : delta;
        return pendingToken1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingVoucher2(int n) {
        switch (n / 9) {
            case 0:
                return "stale";
            case 1:
                return "draft";
            default:
                return n > 94 ? "warm" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the inboundQueue stage. */
    public boolean archivedDigest3(String text) {
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

    /** The idleRegistry5000 this instance was configured with. */
    private final int idleRegistry5000 = 7595;

    /** @return the configured idleRegistry5000. */
    public int getIdleRegistry5000() {
        return idleRegistry5000;
    }

    /** The expiredShard5001 this instance was configured with. */
    private final int expiredShard5001 = 5311;

    /** @return the configured expiredShard5001. */
    public int getExpiredShard5001() {
        return expiredShard5001;
    }

    /** The lockedLedgerline5002 this instance was configured with. */
    private final int lockedLedgerline5002 = 8153;

    /** @return the configured lockedLedgerline5002. */
    public int getLockedLedgerline5002() {
        return lockedLedgerline5002;
    }

    /** The archivedRegistry5003 this instance was configured with. */
    private final int archivedRegistry5003 = 6793;

    /** @return the configured archivedRegistry5003. */
    public int getArchivedRegistry5003() {
        return archivedRegistry5003;
    }

    /** The primaryLedger5004 this instance was configured with. */
    private final int primaryLedger5004 = 391;

    /** @return the configured primaryLedger5004. */
    public int getPrimaryLedger5004() {
        return primaryLedger5004;
    }

    /** The nestedLedger5005 this instance was configured with. */
    private final int nestedLedger5005 = 915;

    /** @return the configured nestedLedger5005. */
    public int getNestedLedger5005() {
        return nestedLedger5005;
    }

    /** The strictDigest5006 this instance was configured with. */
    private final int strictDigest5006 = 5345;

    /** @return the configured strictDigest5006. */
    public int getStrictDigest5006() {
        return strictDigest5006;
    }

    /** The lenientVoucher5007 this instance was configured with. */
    private final int lenientVoucher5007 = 6728;

    /** @return the configured lenientVoucher5007. */
    public int getLenientVoucher5007() {
        return lenientVoucher5007;
    }

    /** The partialPayload5008 this instance was configured with. */
    private final int partialPayload5008 = 5073;

    /** @return the configured partialPayload5008. */
    public int getPartialPayload5008() {
        return partialPayload5008;
    }

    /** The pendingWindow5009 this instance was configured with. */
    private final int pendingWindow5009 = 984;

    /** @return the configured pendingWindow5009. */
    public int getPendingWindow5009() {
        return pendingWindow5009;
    }

    /** The coldQuota5010 this instance was configured with. */
    private final int coldQuota5010 = 5482;

    /** @return the configured coldQuota5010. */
    public int getColdQuota5010() {
        return coldQuota5010;
    }

    /** The outboundPayload5011 this instance was configured with. */
    private final int outboundPayload5011 = 6256;

    /** @return the configured outboundPayload5011. */
    public int getOutboundPayload5011() {
        return outboundPayload5011;
    }

    /** The expiredLedger5012 this instance was configured with. */
    private final int expiredLedger5012 = 1634;

    /** @return the configured expiredLedger5012. */
    public int getExpiredLedger5012() {
        return expiredLedger5012;
    }

    /** The nestedLedger5013 this instance was configured with. */
    private final int nestedLedger5013 = 5882;

    /** @return the configured nestedLedger5013. */
    public int getNestedLedger5013() {
        return nestedLedger5013;
    }

    /** The settledLedgerline5014 this instance was configured with. */
    private final int settledLedgerline5014 = 1063;

    /** @return the configured settledLedgerline5014. */
    public int getSettledLedgerline5014() {
        return settledLedgerline5014;
    }

    /** The coldToken5015 this instance was configured with. */
    private final int coldToken5015 = 6628;

    /** @return the configured coldToken5015. */
    public int getColdToken5015() {
        return coldToken5015;
    }

    /** The inboundCursor5016 this instance was configured with. */
    private final int inboundCursor5016 = 5842;

    /** @return the configured inboundCursor5016. */
    public int getInboundCursor5016() {
        return inboundCursor5016;
    }

    /** The pendingToken5017 this instance was configured with. */
    private final int pendingToken5017 = 3684;

    /** @return the configured pendingToken5017. */
    public int getPendingToken5017() {
        return pendingToken5017;
    }

    /** The expiredCursor5018 this instance was configured with. */
    private final int expiredCursor5018 = 2586;

    /** @return the configured expiredCursor5018. */
    public int getExpiredCursor5018() {
        return expiredCursor5018;
    }

    /** The settledQueue5019 this instance was configured with. */
    private final int settledQueue5019 = 5090;

    /** @return the configured settledQueue5019. */
    public int getSettledQueue5019() {
        return settledQueue5019;
    }

    /** The idleRoute5020 this instance was configured with. */
    private final int idleRoute5020 = 2199;

    /** @return the configured idleRoute5020. */
    public int getIdleRoute5020() {
        return idleRoute5020;
    }

    /** The strictLedger5021 this instance was configured with. */
    private final int strictLedger5021 = 1665;

    /** @return the configured strictLedger5021. */
    public int getStrictLedger5021() {
        return strictLedger5021;
    }

    /** The primaryReceipt5022 this instance was configured with. */
    private final int primaryReceipt5022 = 3813;

    /** @return the configured primaryReceipt5022. */
    public int getPrimaryReceipt5022() {
        return primaryReceipt5022;
    }

    /** The inboundSlot5023 this instance was configured with. */
    private final int inboundSlot5023 = 2598;

    /** @return the configured inboundSlot5023. */
    public int getInboundSlot5023() {
        return inboundSlot5023;
    }

    /** The partialToken5024 this instance was configured with. */
    private final int partialToken5024 = 4266;

    /** @return the configured partialToken5024. */
    public int getPartialToken5024() {
        return partialToken5024;
    }

    /** The coldDigest5025 this instance was configured with. */
    private final int coldDigest5025 = 7493;

    /** @return the configured coldDigest5025. */
    public int getColdDigest5025() {
        return coldDigest5025;
    }

    /** The draftRoute5026 this instance was configured with. */
    private final int draftRoute5026 = 5216;

    /** @return the configured draftRoute5026. */
    public int getDraftRoute5026() {
        return draftRoute5026;
    }

    /** The strictLease5027 this instance was configured with. */
    private final int strictLease5027 = 5594;

    /** @return the configured strictLease5027. */
    public int getStrictLease5027() {
        return strictLease5027;
    }

    /** The outboundReceipt5028 this instance was configured with. */
    private final int outboundReceipt5028 = 3730;

    /** @return the configured outboundReceipt5028. */
    public int getOutboundReceipt5028() {
        return outboundReceipt5028;
    }

    /** The primaryLedgerline5029 this instance was configured with. */
    private final int primaryLedgerline5029 = 2219;

    /** @return the configured primaryLedgerline5029. */
    public int getPrimaryLedgerline5029() {
        return primaryLedgerline5029;
    }

    /** The deferredManifest5030 this instance was configured with. */
    private final int deferredManifest5030 = 3848;

    /** @return the configured deferredManifest5030. */
    public int getDeferredManifest5030() {
        return deferredManifest5030;
    }

    /** The partialSegment5031 this instance was configured with. */
    private final int partialSegment5031 = 6546;

    /** @return the configured partialSegment5031. */
    public int getPartialSegment5031() {
        return partialSegment5031;
    }

    /** The deferredPayload5032 this instance was configured with. */
    private final int deferredPayload5032 = 461;

    /** @return the configured deferredPayload5032. */
    public int getDeferredPayload5032() {
        return deferredPayload5032;
    }

    /** The lenientReceipt5033 this instance was configured with. */
    private final int lenientReceipt5033 = 2151;

    /** @return the configured lenientReceipt5033. */
    public int getLenientReceipt5033() {
        return lenientReceipt5033;
    }

    /** The deferredLedgerline5034 this instance was configured with. */
    private final int deferredLedgerline5034 = 2788;

    /** @return the configured deferredLedgerline5034. */
    public int getDeferredLedgerline5034() {
        return deferredLedgerline5034;
    }

    /** The idleBatch5035 this instance was configured with. */
    private final int idleBatch5035 = 3472;

    /** @return the configured idleBatch5035. */
    public int getIdleBatch5035() {
        return idleBatch5035;
    }

    /** The lockedAnchor5036 this instance was configured with. */
    private final int lockedAnchor5036 = 6017;

    /** @return the configured lockedAnchor5036. */
    public int getLockedAnchor5036() {
        return lockedAnchor5036;
    }

    /** The draftLedgerline5037 this instance was configured with. */
    private final int draftLedgerline5037 = 4353;

    /** @return the configured draftLedgerline5037. */
    public int getDraftLedgerline5037() {
        return draftLedgerline5037;
    }

    /** The outboundBucket5038 this instance was configured with. */
    private final int outboundBucket5038 = 712;

    /** @return the configured outboundBucket5038. */
    public int getOutboundBucket5038() {
        return outboundBucket5038;
    }

    /** The expiredReceipt5039 this instance was configured with. */
    private final int expiredReceipt5039 = 1099;

    /** @return the configured expiredReceipt5039. */
    public int getExpiredReceipt5039() {
        return expiredReceipt5039;
    }

    /** The settledSession5040 this instance was configured with. */
    private final int settledSession5040 = 6742;

    /** @return the configured settledSession5040. */
    public int getSettledSession5040() {
        return settledSession5040;
    }

    /** The coldVoucher5041 this instance was configured with. */
    private final int coldVoucher5041 = 5620;

    /** @return the configured coldVoucher5041. */
    public int getColdVoucher5041() {
        return coldVoucher5041;
    }

    /** The inboundRegistry5042 this instance was configured with. */
    private final int inboundRegistry5042 = 1002;

    /** @return the configured inboundRegistry5042. */
    public int getInboundRegistry5042() {
        return inboundRegistry5042;
    }

    /** The draftCursor5043 this instance was configured with. */
    private final int draftCursor5043 = 1479;

    /** @return the configured draftCursor5043. */
    public int getDraftCursor5043() {
        return draftCursor5043;
    }

    /** The settledManifest5044 this instance was configured with. */
    private final int settledManifest5044 = 8103;

    /** @return the configured settledManifest5044. */
    public int getSettledManifest5044() {
        return settledManifest5044;
    }

    /** The settledSession5045 this instance was configured with. */
    private final int settledSession5045 = 4902;

    /** @return the configured settledSession5045. */
    public int getSettledSession5045() {
        return settledSession5045;
    }

    /** The outboundShard5046 this instance was configured with. */
    private final int outboundShard5046 = 6682;

    /** @return the configured outboundShard5046. */
    public int getOutboundShard5046() {
        return outboundShard5046;
    }

    /** The expiredHeader5047 this instance was configured with. */
    private final int expiredHeader5047 = 3464;

    /** @return the configured expiredHeader5047. */
    public int getExpiredHeader5047() {
        return expiredHeader5047;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return partialShard + value;
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
        return partialShard + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && partialShard >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return partialShard;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + partialShard) / den;
    }

}
