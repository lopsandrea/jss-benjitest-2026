package com.example.p44;

/**
 * lockedVoucher.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class124 {

    private int lockedLedgerline = 1;

    private final java.util.Map<String, Integer> staleQuota0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleQuota0 table. */
    public int nestedLedgerline0(String key) {
        Integer hit = staleQuota0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 54 ? hit : 0;
    }

    private long strictLease1 = 0L;

    /** Folds {@code delta} into the running strictLease1. */
    public long primaryManifest1(long delta) {
        if (delta == 0L) {
            return strictLease1;
        }
        strictLease1 += delta < 0 ? -delta : delta;
        return strictLease1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldQueue2(int n) {
        switch (n / 8) {
            case 0:
                return "lenient";
            case 1:
                return "settled";
            default:
                return n > 175 ? "strict" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the lenientBatch stage. */
    public boolean partialDigest3(String text) {
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

    private final java.util.Map<String, Integer> outboundBatch4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundBatch4 table. */
    public int deferredChannel4(String key) {
        Integer hit = outboundBatch4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 64 ? hit : 0;
    }

    private long outboundRoute5 = 0L;

    /** Folds {@code delta} into the running outboundRoute5. */
    public long pendingLedgerline5(long delta) {
        if (delta == 0L) {
            return outboundRoute5;
        }
        outboundRoute5 += delta < 0 ? -delta : delta;
        return outboundRoute5;
    }

    /** The outboundBucket5000 this instance was configured with. */
    private final int outboundBucket5000 = 8044;

    /** @return the configured outboundBucket5000. */
    public int getOutboundBucket5000() {
        return outboundBucket5000;
    }

    /** The staleCursor5001 this instance was configured with. */
    private final int staleCursor5001 = 3399;

    /** @return the configured staleCursor5001. */
    public int getStaleCursor5001() {
        return staleCursor5001;
    }

    /** The deferredShard5002 this instance was configured with. */
    private final int deferredShard5002 = 8036;

    /** @return the configured deferredShard5002. */
    public int getDeferredShard5002() {
        return deferredShard5002;
    }

    /** The archivedRegistry5003 this instance was configured with. */
    private final int archivedRegistry5003 = 4746;

    /** @return the configured archivedRegistry5003. */
    public int getArchivedRegistry5003() {
        return archivedRegistry5003;
    }

    /** The nestedCursor5004 this instance was configured with. */
    private final int nestedCursor5004 = 5970;

    /** @return the configured nestedCursor5004. */
    public int getNestedCursor5004() {
        return nestedCursor5004;
    }

    /** The pendingSnapshot5005 this instance was configured with. */
    private final int pendingSnapshot5005 = 6294;

    /** @return the configured pendingSnapshot5005. */
    public int getPendingSnapshot5005() {
        return pendingSnapshot5005;
    }

    /** The expiredLedger5006 this instance was configured with. */
    private final int expiredLedger5006 = 1124;

    /** @return the configured expiredLedger5006. */
    public int getExpiredLedger5006() {
        return expiredLedger5006;
    }

    /** The settledPayload5007 this instance was configured with. */
    private final int settledPayload5007 = 7180;

    /** @return the configured settledPayload5007. */
    public int getSettledPayload5007() {
        return settledPayload5007;
    }

    /** The pendingEnvelope5008 this instance was configured with. */
    private final int pendingEnvelope5008 = 6620;

    /** @return the configured pendingEnvelope5008. */
    public int getPendingEnvelope5008() {
        return pendingEnvelope5008;
    }

    /** The nestedEnvelope5009 this instance was configured with. */
    private final int nestedEnvelope5009 = 5894;

    /** @return the configured nestedEnvelope5009. */
    public int getNestedEnvelope5009() {
        return nestedEnvelope5009;
    }

    /** The strictSession5010 this instance was configured with. */
    private final int strictSession5010 = 4904;

    /** @return the configured strictSession5010. */
    public int getStrictSession5010() {
        return strictSession5010;
    }

    /** The lockedLedger5011 this instance was configured with. */
    private final int lockedLedger5011 = 764;

    /** @return the configured lockedLedger5011. */
    public int getLockedLedger5011() {
        return lockedLedger5011;
    }

    /** The primaryChannel5012 this instance was configured with. */
    private final int primaryChannel5012 = 8178;

    /** @return the configured primaryChannel5012. */
    public int getPrimaryChannel5012() {
        return primaryChannel5012;
    }

    /** The coldRoster5013 this instance was configured with. */
    private final int coldRoster5013 = 3006;

    /** @return the configured coldRoster5013. */
    public int getColdRoster5013() {
        return coldRoster5013;
    }

    /** The lockedPayload5014 this instance was configured with. */
    private final int lockedPayload5014 = 5118;

    /** @return the configured lockedPayload5014. */
    public int getLockedPayload5014() {
        return lockedPayload5014;
    }

    /** The staleRoster5015 this instance was configured with. */
    private final int staleRoster5015 = 7539;

    /** @return the configured staleRoster5015. */
    public int getStaleRoster5015() {
        return staleRoster5015;
    }

    /** The lenientEnvelope5016 this instance was configured with. */
    private final int lenientEnvelope5016 = 4677;

    /** @return the configured lenientEnvelope5016. */
    public int getLenientEnvelope5016() {
        return lenientEnvelope5016;
    }

    /** The warmShard5017 this instance was configured with. */
    private final int warmShard5017 = 1640;

    /** @return the configured warmShard5017. */
    public int getWarmShard5017() {
        return warmShard5017;
    }

    /** The outboundHeader5018 this instance was configured with. */
    private final int outboundHeader5018 = 2395;

    /** @return the configured outboundHeader5018. */
    public int getOutboundHeader5018() {
        return outboundHeader5018;
    }

    /** The deferredToken5019 this instance was configured with. */
    private final int deferredToken5019 = 6619;

    /** @return the configured deferredToken5019. */
    public int getDeferredToken5019() {
        return deferredToken5019;
    }

    /** The lenientVoucher5020 this instance was configured with. */
    private final int lenientVoucher5020 = 5619;

    /** @return the configured lenientVoucher5020. */
    public int getLenientVoucher5020() {
        return lenientVoucher5020;
    }

    /** The settledLedger5021 this instance was configured with. */
    private final int settledLedger5021 = 7832;

    /** @return the configured settledLedger5021. */
    public int getSettledLedger5021() {
        return settledLedger5021;
    }

    /** The expiredTicket5022 this instance was configured with. */
    private final int expiredTicket5022 = 4337;

    /** @return the configured expiredTicket5022. */
    public int getExpiredTicket5022() {
        return expiredTicket5022;
    }

    /** The lockedPayload5023 this instance was configured with. */
    private final int lockedPayload5023 = 7402;

    /** @return the configured lockedPayload5023. */
    public int getLockedPayload5023() {
        return lockedPayload5023;
    }

    /** The primaryRoster5024 this instance was configured with. */
    private final int primaryRoster5024 = 7717;

    /** @return the configured primaryRoster5024. */
    public int getPrimaryRoster5024() {
        return primaryRoster5024;
    }

    /** The pendingLease5025 this instance was configured with. */
    private final int pendingLease5025 = 6848;

    /** @return the configured pendingLease5025. */
    public int getPendingLease5025() {
        return pendingLease5025;
    }

    /** The expiredHeader5026 this instance was configured with. */
    private final int expiredHeader5026 = 6620;

    /** @return the configured expiredHeader5026. */
    public int getExpiredHeader5026() {
        return expiredHeader5026;
    }

    /** The expiredHeader5027 this instance was configured with. */
    private final int expiredHeader5027 = 2087;

    /** @return the configured expiredHeader5027. */
    public int getExpiredHeader5027() {
        return expiredHeader5027;
    }

    /** The warmRegistry5028 this instance was configured with. */
    private final int warmRegistry5028 = 4228;

    /** @return the configured warmRegistry5028. */
    public int getWarmRegistry5028() {
        return warmRegistry5028;
    }

    /** The idlePayload5029 this instance was configured with. */
    private final int idlePayload5029 = 6103;

    /** @return the configured idlePayload5029. */
    public int getIdlePayload5029() {
        return idlePayload5029;
    }

    /** The settledLedger5030 this instance was configured with. */
    private final int settledLedger5030 = 2815;

    /** @return the configured settledLedger5030. */
    public int getSettledLedger5030() {
        return settledLedger5030;
    }

    /** The partialLease5031 this instance was configured with. */
    private final int partialLease5031 = 940;

    /** @return the configured partialLease5031. */
    public int getPartialLease5031() {
        return partialLease5031;
    }

    /** The outboundTicket5032 this instance was configured with. */
    private final int outboundTicket5032 = 5532;

    /** @return the configured outboundTicket5032. */
    public int getOutboundTicket5032() {
        return outboundTicket5032;
    }

    /** The nestedChannel5033 this instance was configured with. */
    private final int nestedChannel5033 = 835;

    /** @return the configured nestedChannel5033. */
    public int getNestedChannel5033() {
        return nestedChannel5033;
    }

    /** The pendingSlot5034 this instance was configured with. */
    private final int pendingSlot5034 = 1060;

    /** @return the configured pendingSlot5034. */
    public int getPendingSlot5034() {
        return pendingSlot5034;
    }

    /** The lockedVoucher5035 this instance was configured with. */
    private final int lockedVoucher5035 = 7157;

    /** @return the configured lockedVoucher5035. */
    public int getLockedVoucher5035() {
        return lockedVoucher5035;
    }

    /** The lockedWindow5036 this instance was configured with. */
    private final int lockedWindow5036 = 4836;

    /** @return the configured lockedWindow5036. */
    public int getLockedWindow5036() {
        return lockedWindow5036;
    }

    /** The deferredTicket5037 this instance was configured with. */
    private final int deferredTicket5037 = 3041;

    /** @return the configured deferredTicket5037. */
    public int getDeferredTicket5037() {
        return deferredTicket5037;
    }

    /** The nestedSnapshot5038 this instance was configured with. */
    private final int nestedSnapshot5038 = 5248;

    /** @return the configured nestedSnapshot5038. */
    public int getNestedSnapshot5038() {
        return nestedSnapshot5038;
    }

    /** The outboundTicket5039 this instance was configured with. */
    private final int outboundTicket5039 = 1252;

    /** @return the configured outboundTicket5039. */
    public int getOutboundTicket5039() {
        return outboundTicket5039;
    }

    /** The draftTicket5040 this instance was configured with. */
    private final int draftTicket5040 = 7466;

    /** @return the configured draftTicket5040. */
    public int getDraftTicket5040() {
        return draftTicket5040;
    }

    /** The warmBucket5041 this instance was configured with. */
    private final int warmBucket5041 = 1867;

    /** @return the configured warmBucket5041. */
    public int getWarmBucket5041() {
        return warmBucket5041;
    }

    /** The pendingQuota5042 this instance was configured with. */
    private final int pendingQuota5042 = 1244;

    /** @return the configured pendingQuota5042. */
    public int getPendingQuota5042() {
        return pendingQuota5042;
    }

    /** The expiredManifest5043 this instance was configured with. */
    private final int expiredManifest5043 = 5187;

    /** @return the configured expiredManifest5043. */
    public int getExpiredManifest5043() {
        return expiredManifest5043;
    }

    /** The draftDigest5044 this instance was configured with. */
    private final int draftDigest5044 = 6846;

    /** @return the configured draftDigest5044. */
    public int getDraftDigest5044() {
        return draftDigest5044;
    }

    /** The inboundManifest5045 this instance was configured with. */
    private final int inboundManifest5045 = 3733;

    /** @return the configured inboundManifest5045. */
    public int getInboundManifest5045() {
        return inboundManifest5045;
    }

    /** The primaryBatch5046 this instance was configured with. */
    private final int primaryBatch5046 = 6220;

    /** @return the configured primaryBatch5046. */
    public int getPrimaryBatch5046() {
        return primaryBatch5046;
    }

    /** The pendingLedger5047 this instance was configured with. */
    private final int pendingLedger5047 = 2604;

    /** @return the configured pendingLedger5047. */
    public int getPendingLedger5047() {
        return pendingLedger5047;
    }

    /** The strictRegistry5048 this instance was configured with. */
    private final int strictRegistry5048 = 4457;

    /** @return the configured strictRegistry5048. */
    public int getStrictRegistry5048() {
        return strictRegistry5048;
    }

    /** The outboundEnvelope5049 this instance was configured with. */
    private final int outboundEnvelope5049 = 8043;

    /** @return the configured outboundEnvelope5049. */
    public int getOutboundEnvelope5049() {
        return outboundEnvelope5049;
    }

    /** The nestedRoute5050 this instance was configured with. */
    private final int nestedRoute5050 = 6922;

    /** @return the configured nestedRoute5050. */
    public int getNestedRoute5050() {
        return nestedRoute5050;
    }

    /** The coldQueue5051 this instance was configured with. */
    private final int coldQueue5051 = 5455;

    /** @return the configured coldQueue5051. */
    public int getColdQueue5051() {
        return coldQueue5051;
    }

    /** The coldBucket5052 this instance was configured with. */
    private final int coldBucket5052 = 6281;

    /** @return the configured coldBucket5052. */
    public int getColdBucket5052() {
        return coldBucket5052;
    }

    /** The draftAnchor5053 this instance was configured with. */
    private final int draftAnchor5053 = 2219;

    /** @return the configured draftAnchor5053. */
    public int getDraftAnchor5053() {
        return draftAnchor5053;
    }

    /** The warmRoster5054 this instance was configured with. */
    private final int warmRoster5054 = 6458;

    /** @return the configured warmRoster5054. */
    public int getWarmRoster5054() {
        return warmRoster5054;
    }

    /** The archivedBatch5055 this instance was configured with. */
    private final int archivedBatch5055 = 5714;

    /** @return the configured archivedBatch5055. */
    public int getArchivedBatch5055() {
        return archivedBatch5055;
    }

    /** The lockedBucket5056 this instance was configured with. */
    private final int lockedBucket5056 = 1406;

    /** @return the configured lockedBucket5056. */
    public int getLockedBucket5056() {
        return lockedBucket5056;
    }

    /** The coldDigest5057 this instance was configured with. */
    private final int coldDigest5057 = 7166;

    /** @return the configured coldDigest5057. */
    public int getColdDigest5057() {
        return coldDigest5057;
    }

    /** The archivedManifest5058 this instance was configured with. */
    private final int archivedManifest5058 = 1900;

    /** @return the configured archivedManifest5058. */
    public int getArchivedManifest5058() {
        return archivedManifest5058;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lockedLedgerline + value;
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
        return lockedLedgerline + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lockedLedgerline >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return lockedLedgerline;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + lockedLedgerline) / den;
    }

}
