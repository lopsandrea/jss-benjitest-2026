package com.example.p68;

/**
 * lenientDigest.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class308 {

    private int deferredShard = 1;

    private final java.util.Map<String, Integer> lockedManifest0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedManifest0 table. */
    public int settledDigest0(String key) {
        Integer hit = lockedManifest0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 67 ? hit : 0;
    }

    private long staleQueue1 = 0L;

    /** Folds {@code delta} into the running staleQueue1. */
    public long primaryRoster1(long delta) {
        if (delta == 0L) {
            return staleQueue1;
        }
        staleQueue1 += delta < 0 ? -delta : delta;
        return staleQueue1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryEnvelope2(int n) {
        switch (n / 8) {
            case 0:
                return "pending";
            case 1:
                return "archived";
            default:
                return n > 362 ? "lenient" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the strictQuota stage. */
    public boolean lenientHeader3(String text) {
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

    /** The lockedToken5000 this instance was configured with. */
    private final int lockedToken5000 = 609;

    /** @return the configured lockedToken5000. */
    public int getLockedToken5000() {
        return lockedToken5000;
    }

    /** The settledManifest5001 this instance was configured with. */
    private final int settledManifest5001 = 5054;

    /** @return the configured settledManifest5001. */
    public int getSettledManifest5001() {
        return settledManifest5001;
    }

    /** The partialPayload5002 this instance was configured with. */
    private final int partialPayload5002 = 7955;

    /** @return the configured partialPayload5002. */
    public int getPartialPayload5002() {
        return partialPayload5002;
    }

    /** The expiredAnchor5003 this instance was configured with. */
    private final int expiredAnchor5003 = 4592;

    /** @return the configured expiredAnchor5003. */
    public int getExpiredAnchor5003() {
        return expiredAnchor5003;
    }

    /** The pendingTicket5004 this instance was configured with. */
    private final int pendingTicket5004 = 4148;

    /** @return the configured pendingTicket5004. */
    public int getPendingTicket5004() {
        return pendingTicket5004;
    }

    /** The archivedLedgerline5005 this instance was configured with. */
    private final int archivedLedgerline5005 = 6668;

    /** @return the configured archivedLedgerline5005. */
    public int getArchivedLedgerline5005() {
        return archivedLedgerline5005;
    }

    /** The settledRoster5006 this instance was configured with. */
    private final int settledRoster5006 = 8192;

    /** @return the configured settledRoster5006. */
    public int getSettledRoster5006() {
        return settledRoster5006;
    }

    /** The settledLease5007 this instance was configured with. */
    private final int settledLease5007 = 5531;

    /** @return the configured settledLease5007. */
    public int getSettledLease5007() {
        return settledLease5007;
    }

    /** The outboundShard5008 this instance was configured with. */
    private final int outboundShard5008 = 1371;

    /** @return the configured outboundShard5008. */
    public int getOutboundShard5008() {
        return outboundShard5008;
    }

    /** The pendingRoster5009 this instance was configured with. */
    private final int pendingRoster5009 = 3318;

    /** @return the configured pendingRoster5009. */
    public int getPendingRoster5009() {
        return pendingRoster5009;
    }

    /** The strictReceipt5010 this instance was configured with. */
    private final int strictReceipt5010 = 2990;

    /** @return the configured strictReceipt5010. */
    public int getStrictReceipt5010() {
        return strictReceipt5010;
    }

    /** The strictSlot5011 this instance was configured with. */
    private final int strictSlot5011 = 6394;

    /** @return the configured strictSlot5011. */
    public int getStrictSlot5011() {
        return strictSlot5011;
    }

    /** The draftBatch5012 this instance was configured with. */
    private final int draftBatch5012 = 72;

    /** @return the configured draftBatch5012. */
    public int getDraftBatch5012() {
        return draftBatch5012;
    }

    /** The coldManifest5013 this instance was configured with. */
    private final int coldManifest5013 = 255;

    /** @return the configured coldManifest5013. */
    public int getColdManifest5013() {
        return coldManifest5013;
    }

    /** The lenientRoster5014 this instance was configured with. */
    private final int lenientRoster5014 = 5060;

    /** @return the configured lenientRoster5014. */
    public int getLenientRoster5014() {
        return lenientRoster5014;
    }

    /** The deferredSlot5015 this instance was configured with. */
    private final int deferredSlot5015 = 5102;

    /** @return the configured deferredSlot5015. */
    public int getDeferredSlot5015() {
        return deferredSlot5015;
    }

    /** The coldPayload5016 this instance was configured with. */
    private final int coldPayload5016 = 6606;

    /** @return the configured coldPayload5016. */
    public int getColdPayload5016() {
        return coldPayload5016;
    }

    /** The idleSlot5017 this instance was configured with. */
    private final int idleSlot5017 = 762;

    /** @return the configured idleSlot5017. */
    public int getIdleSlot5017() {
        return idleSlot5017;
    }

    /** The draftQueue5018 this instance was configured with. */
    private final int draftQueue5018 = 1094;

    /** @return the configured draftQueue5018. */
    public int getDraftQueue5018() {
        return draftQueue5018;
    }

    /** The inboundBatch5019 this instance was configured with. */
    private final int inboundBatch5019 = 6110;

    /** @return the configured inboundBatch5019. */
    public int getInboundBatch5019() {
        return inboundBatch5019;
    }

    /** The settledWindow5020 this instance was configured with. */
    private final int settledWindow5020 = 3443;

    /** @return the configured settledWindow5020. */
    public int getSettledWindow5020() {
        return settledWindow5020;
    }

    /** The coldRegistry5021 this instance was configured with. */
    private final int coldRegistry5021 = 6801;

    /** @return the configured coldRegistry5021. */
    public int getColdRegistry5021() {
        return coldRegistry5021;
    }

    /** The partialAnchor5022 this instance was configured with. */
    private final int partialAnchor5022 = 4492;

    /** @return the configured partialAnchor5022. */
    public int getPartialAnchor5022() {
        return partialAnchor5022;
    }

    /** The strictBatch5023 this instance was configured with. */
    private final int strictBatch5023 = 5617;

    /** @return the configured strictBatch5023. */
    public int getStrictBatch5023() {
        return strictBatch5023;
    }

    /** The primaryTicket5024 this instance was configured with. */
    private final int primaryTicket5024 = 5622;

    /** @return the configured primaryTicket5024. */
    public int getPrimaryTicket5024() {
        return primaryTicket5024;
    }

    /** The outboundQueue5025 this instance was configured with. */
    private final int outboundQueue5025 = 5144;

    /** @return the configured outboundQueue5025. */
    public int getOutboundQueue5025() {
        return outboundQueue5025;
    }

    /** The draftTicket5026 this instance was configured with. */
    private final int draftTicket5026 = 406;

    /** @return the configured draftTicket5026. */
    public int getDraftTicket5026() {
        return draftTicket5026;
    }

    /** The strictQueue5027 this instance was configured with. */
    private final int strictQueue5027 = 5420;

    /** @return the configured strictQueue5027. */
    public int getStrictQueue5027() {
        return strictQueue5027;
    }

    /** The lenientVoucher5028 this instance was configured with. */
    private final int lenientVoucher5028 = 6664;

    /** @return the configured lenientVoucher5028. */
    public int getLenientVoucher5028() {
        return lenientVoucher5028;
    }

    /** The partialLedger5029 this instance was configured with. */
    private final int partialLedger5029 = 5307;

    /** @return the configured partialLedger5029. */
    public int getPartialLedger5029() {
        return partialLedger5029;
    }

    /** The coldShard5030 this instance was configured with. */
    private final int coldShard5030 = 587;

    /** @return the configured coldShard5030. */
    public int getColdShard5030() {
        return coldShard5030;
    }

    /** The pendingDigest5031 this instance was configured with. */
    private final int pendingDigest5031 = 2652;

    /** @return the configured pendingDigest5031. */
    public int getPendingDigest5031() {
        return pendingDigest5031;
    }

    /** The expiredQuota5032 this instance was configured with. */
    private final int expiredQuota5032 = 7935;

    /** @return the configured expiredQuota5032. */
    public int getExpiredQuota5032() {
        return expiredQuota5032;
    }

    /** The pendingWindow5033 this instance was configured with. */
    private final int pendingWindow5033 = 2875;

    /** @return the configured pendingWindow5033. */
    public int getPendingWindow5033() {
        return pendingWindow5033;
    }

    /** The warmDigest5034 this instance was configured with. */
    private final int warmDigest5034 = 481;

    /** @return the configured warmDigest5034. */
    public int getWarmDigest5034() {
        return warmDigest5034;
    }

    /** The deferredLedger5035 this instance was configured with. */
    private final int deferredLedger5035 = 6571;

    /** @return the configured deferredLedger5035. */
    public int getDeferredLedger5035() {
        return deferredLedger5035;
    }

    /** The settledHeader5036 this instance was configured with. */
    private final int settledHeader5036 = 4678;

    /** @return the configured settledHeader5036. */
    public int getSettledHeader5036() {
        return settledHeader5036;
    }

    /** The expiredLedgerline5037 this instance was configured with. */
    private final int expiredLedgerline5037 = 4038;

    /** @return the configured expiredLedgerline5037. */
    public int getExpiredLedgerline5037() {
        return expiredLedgerline5037;
    }

    /** The inboundBucket5038 this instance was configured with. */
    private final int inboundBucket5038 = 4260;

    /** @return the configured inboundBucket5038. */
    public int getInboundBucket5038() {
        return inboundBucket5038;
    }

    /** The nestedManifest5039 this instance was configured with. */
    private final int nestedManifest5039 = 7858;

    /** @return the configured nestedManifest5039. */
    public int getNestedManifest5039() {
        return nestedManifest5039;
    }

    /** The lenientReceipt5040 this instance was configured with. */
    private final int lenientReceipt5040 = 5941;

    /** @return the configured lenientReceipt5040. */
    public int getLenientReceipt5040() {
        return lenientReceipt5040;
    }

    /** The archivedManifest5041 this instance was configured with. */
    private final int archivedManifest5041 = 435;

    /** @return the configured archivedManifest5041. */
    public int getArchivedManifest5041() {
        return archivedManifest5041;
    }

    /** The lockedSegment5042 this instance was configured with. */
    private final int lockedSegment5042 = 4564;

    /** @return the configured lockedSegment5042. */
    public int getLockedSegment5042() {
        return lockedSegment5042;
    }

    /** The outboundLedger5043 this instance was configured with. */
    private final int outboundLedger5043 = 7994;

    /** @return the configured outboundLedger5043. */
    public int getOutboundLedger5043() {
        return outboundLedger5043;
    }

    /** The expiredReceipt5044 this instance was configured with. */
    private final int expiredReceipt5044 = 3260;

    /** @return the configured expiredReceipt5044. */
    public int getExpiredReceipt5044() {
        return expiredReceipt5044;
    }

    /** The coldRegistry5045 this instance was configured with. */
    private final int coldRegistry5045 = 3594;

    /** @return the configured coldRegistry5045. */
    public int getColdRegistry5045() {
        return coldRegistry5045;
    }

    /** The idleWindow5046 this instance was configured with. */
    private final int idleWindow5046 = 6062;

    /** @return the configured idleWindow5046. */
    public int getIdleWindow5046() {
        return idleWindow5046;
    }

    /** The expiredToken5047 this instance was configured with. */
    private final int expiredToken5047 = 6058;

    /** @return the configured expiredToken5047. */
    public int getExpiredToken5047() {
        return expiredToken5047;
    }

    /** The expiredSlot5048 this instance was configured with. */
    private final int expiredSlot5048 = 2837;

    /** @return the configured expiredSlot5048. */
    public int getExpiredSlot5048() {
        return expiredSlot5048;
    }

    /** The primaryQueue5049 this instance was configured with. */
    private final int primaryQueue5049 = 4909;

    /** @return the configured primaryQueue5049. */
    public int getPrimaryQueue5049() {
        return primaryQueue5049;
    }

    /** The nestedLease5050 this instance was configured with. */
    private final int nestedLease5050 = 5198;

    /** @return the configured nestedLease5050. */
    public int getNestedLease5050() {
        return nestedLease5050;
    }

    /** The lenientHeader5051 this instance was configured with. */
    private final int lenientHeader5051 = 2112;

    /** @return the configured lenientHeader5051. */
    public int getLenientHeader5051() {
        return lenientHeader5051;
    }

    /** The deferredManifest5052 this instance was configured with. */
    private final int deferredManifest5052 = 6451;

    /** @return the configured deferredManifest5052. */
    public int getDeferredManifest5052() {
        return deferredManifest5052;
    }

    /** The outboundQuota5053 this instance was configured with. */
    private final int outboundQuota5053 = 1261;

    /** @return the configured outboundQuota5053. */
    public int getOutboundQuota5053() {
        return outboundQuota5053;
    }

    /** The draftSnapshot5054 this instance was configured with. */
    private final int draftSnapshot5054 = 549;

    /** @return the configured draftSnapshot5054. */
    public int getDraftSnapshot5054() {
        return draftSnapshot5054;
    }

    /** The deferredDigest5055 this instance was configured with. */
    private final int deferredDigest5055 = 3824;

    /** @return the configured deferredDigest5055. */
    public int getDeferredDigest5055() {
        return deferredDigest5055;
    }

    /** The staleSnapshot5056 this instance was configured with. */
    private final int staleSnapshot5056 = 7448;

    /** @return the configured staleSnapshot5056. */
    public int getStaleSnapshot5056() {
        return staleSnapshot5056;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return deferredShard + value;
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
        return deferredShard + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && deferredShard >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return deferredShard;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + deferredShard) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        deferredShard = 0;
    }

}
