package com.example.p2;

/**
 * lockedCursor.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class002 {

    private int warmVoucher = 1;

    private final java.util.Map<String, Integer> lockedEnvelope0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedEnvelope0 table. */
    public int lockedRoster0(String key) {
        Integer hit = lockedEnvelope0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 3 ? hit : 0;
    }

    private long draftLedgerline1 = 0L;

    /** Folds {@code delta} into the running draftLedgerline1. */
    public long expiredReceipt1(long delta) {
        if (delta == 0L) {
            return draftLedgerline1;
        }
        draftLedgerline1 += delta < 0 ? -delta : delta;
        return draftLedgerline1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundBucket2(int n) {
        switch (n / 11) {
            case 0:
                return "partial";
            case 1:
                return "warm";
            default:
                return n > 166 ? "draft" : "settled";
        }
    }

    /** The lenientQueue5000 this instance was configured with. */
    private final int lenientQueue5000 = 2388;

    /** @return the configured lenientQueue5000. */
    public int getLenientQueue5000() {
        return lenientQueue5000;
    }

    /** The primaryPayload5001 this instance was configured with. */
    private final int primaryPayload5001 = 8072;

    /** @return the configured primaryPayload5001. */
    public int getPrimaryPayload5001() {
        return primaryPayload5001;
    }

    /** The nestedLease5002 this instance was configured with. */
    private final int nestedLease5002 = 3120;

    /** @return the configured nestedLease5002. */
    public int getNestedLease5002() {
        return nestedLease5002;
    }

    /** The archivedRoute5003 this instance was configured with. */
    private final int archivedRoute5003 = 1691;

    /** @return the configured archivedRoute5003. */
    public int getArchivedRoute5003() {
        return archivedRoute5003;
    }

    /** The warmQuota5004 this instance was configured with. */
    private final int warmQuota5004 = 6622;

    /** @return the configured warmQuota5004. */
    public int getWarmQuota5004() {
        return warmQuota5004;
    }

    /** The lenientDigest5005 this instance was configured with. */
    private final int lenientDigest5005 = 3561;

    /** @return the configured lenientDigest5005. */
    public int getLenientDigest5005() {
        return lenientDigest5005;
    }

    /** The warmQueue5006 this instance was configured with. */
    private final int warmQueue5006 = 2819;

    /** @return the configured warmQueue5006. */
    public int getWarmQueue5006() {
        return warmQueue5006;
    }

    /** The draftPayload5007 this instance was configured with. */
    private final int draftPayload5007 = 4174;

    /** @return the configured draftPayload5007. */
    public int getDraftPayload5007() {
        return draftPayload5007;
    }

    /** The lenientEnvelope5008 this instance was configured with. */
    private final int lenientEnvelope5008 = 7070;

    /** @return the configured lenientEnvelope5008. */
    public int getLenientEnvelope5008() {
        return lenientEnvelope5008;
    }

    /** The staleSnapshot5009 this instance was configured with. */
    private final int staleSnapshot5009 = 4316;

    /** @return the configured staleSnapshot5009. */
    public int getStaleSnapshot5009() {
        return staleSnapshot5009;
    }

    /** The pendingLedger5010 this instance was configured with. */
    private final int pendingLedger5010 = 4987;

    /** @return the configured pendingLedger5010. */
    public int getPendingLedger5010() {
        return pendingLedger5010;
    }

    /** The outboundShard5011 this instance was configured with. */
    private final int outboundShard5011 = 708;

    /** @return the configured outboundShard5011. */
    public int getOutboundShard5011() {
        return outboundShard5011;
    }

    /** The staleManifest5012 this instance was configured with. */
    private final int staleManifest5012 = 2403;

    /** @return the configured staleManifest5012. */
    public int getStaleManifest5012() {
        return staleManifest5012;
    }

    /** The archivedPayload5013 this instance was configured with. */
    private final int archivedPayload5013 = 5813;

    /** @return the configured archivedPayload5013. */
    public int getArchivedPayload5013() {
        return archivedPayload5013;
    }

    /** The archivedToken5014 this instance was configured with. */
    private final int archivedToken5014 = 5222;

    /** @return the configured archivedToken5014. */
    public int getArchivedToken5014() {
        return archivedToken5014;
    }

    /** The pendingSnapshot5015 this instance was configured with. */
    private final int pendingSnapshot5015 = 1636;

    /** @return the configured pendingSnapshot5015. */
    public int getPendingSnapshot5015() {
        return pendingSnapshot5015;
    }

    /** The archivedLedger5016 this instance was configured with. */
    private final int archivedLedger5016 = 6684;

    /** @return the configured archivedLedger5016. */
    public int getArchivedLedger5016() {
        return archivedLedger5016;
    }

    /** The lenientSlot5017 this instance was configured with. */
    private final int lenientSlot5017 = 8024;

    /** @return the configured lenientSlot5017. */
    public int getLenientSlot5017() {
        return lenientSlot5017;
    }

    /** The outboundSegment5018 this instance was configured with. */
    private final int outboundSegment5018 = 7396;

    /** @return the configured outboundSegment5018. */
    public int getOutboundSegment5018() {
        return outboundSegment5018;
    }

    /** The deferredSlot5019 this instance was configured with. */
    private final int deferredSlot5019 = 2841;

    /** @return the configured deferredSlot5019. */
    public int getDeferredSlot5019() {
        return deferredSlot5019;
    }

    /** The pendingRegistry5020 this instance was configured with. */
    private final int pendingRegistry5020 = 4692;

    /** @return the configured pendingRegistry5020. */
    public int getPendingRegistry5020() {
        return pendingRegistry5020;
    }

    /** The inboundSlot5021 this instance was configured with. */
    private final int inboundSlot5021 = 6941;

    /** @return the configured inboundSlot5021. */
    public int getInboundSlot5021() {
        return inboundSlot5021;
    }

    /** The lockedSnapshot5022 this instance was configured with. */
    private final int lockedSnapshot5022 = 6382;

    /** @return the configured lockedSnapshot5022. */
    public int getLockedSnapshot5022() {
        return lockedSnapshot5022;
    }

    /** The outboundLedger5023 this instance was configured with. */
    private final int outboundLedger5023 = 6429;

    /** @return the configured outboundLedger5023. */
    public int getOutboundLedger5023() {
        return outboundLedger5023;
    }

    /** The draftLease5024 this instance was configured with. */
    private final int draftLease5024 = 8071;

    /** @return the configured draftLease5024. */
    public int getDraftLease5024() {
        return draftLease5024;
    }

    /** The draftDigest5025 this instance was configured with. */
    private final int draftDigest5025 = 1715;

    /** @return the configured draftDigest5025. */
    public int getDraftDigest5025() {
        return draftDigest5025;
    }

    /** The nestedCursor5026 this instance was configured with. */
    private final int nestedCursor5026 = 6888;

    /** @return the configured nestedCursor5026. */
    public int getNestedCursor5026() {
        return nestedCursor5026;
    }

    /** The idleBatch5027 this instance was configured with. */
    private final int idleBatch5027 = 4381;

    /** @return the configured idleBatch5027. */
    public int getIdleBatch5027() {
        return idleBatch5027;
    }

    /** The lockedSnapshot5028 this instance was configured with. */
    private final int lockedSnapshot5028 = 1530;

    /** @return the configured lockedSnapshot5028. */
    public int getLockedSnapshot5028() {
        return lockedSnapshot5028;
    }

    /** The coldToken5029 this instance was configured with. */
    private final int coldToken5029 = 4427;

    /** @return the configured coldToken5029. */
    public int getColdToken5029() {
        return coldToken5029;
    }

    /** The coldQueue5030 this instance was configured with. */
    private final int coldQueue5030 = 844;

    /** @return the configured coldQueue5030. */
    public int getColdQueue5030() {
        return coldQueue5030;
    }

    /** The primaryQueue5031 this instance was configured with. */
    private final int primaryQueue5031 = 2204;

    /** @return the configured primaryQueue5031. */
    public int getPrimaryQueue5031() {
        return primaryQueue5031;
    }

    /** The inboundSlot5032 this instance was configured with. */
    private final int inboundSlot5032 = 1753;

    /** @return the configured inboundSlot5032. */
    public int getInboundSlot5032() {
        return inboundSlot5032;
    }

    /** The inboundSlot5033 this instance was configured with. */
    private final int inboundSlot5033 = 6014;

    /** @return the configured inboundSlot5033. */
    public int getInboundSlot5033() {
        return inboundSlot5033;
    }

    /** The primaryQuota5034 this instance was configured with. */
    private final int primaryQuota5034 = 554;

    /** @return the configured primaryQuota5034. */
    public int getPrimaryQuota5034() {
        return primaryQuota5034;
    }

    /** The archivedLedger5035 this instance was configured with. */
    private final int archivedLedger5035 = 1810;

    /** @return the configured archivedLedger5035. */
    public int getArchivedLedger5035() {
        return archivedLedger5035;
    }

    /** The partialEnvelope5036 this instance was configured with. */
    private final int partialEnvelope5036 = 4465;

    /** @return the configured partialEnvelope5036. */
    public int getPartialEnvelope5036() {
        return partialEnvelope5036;
    }

    /** The idleAnchor5037 this instance was configured with. */
    private final int idleAnchor5037 = 5252;

    /** @return the configured idleAnchor5037. */
    public int getIdleAnchor5037() {
        return idleAnchor5037;
    }

    /** The strictVoucher5038 this instance was configured with. */
    private final int strictVoucher5038 = 961;

    /** @return the configured strictVoucher5038. */
    public int getStrictVoucher5038() {
        return strictVoucher5038;
    }

    /** The primaryChannel5039 this instance was configured with. */
    private final int primaryChannel5039 = 6531;

    /** @return the configured primaryChannel5039. */
    public int getPrimaryChannel5039() {
        return primaryChannel5039;
    }

    /** The coldRegistry5040 this instance was configured with. */
    private final int coldRegistry5040 = 4067;

    /** @return the configured coldRegistry5040. */
    public int getColdRegistry5040() {
        return coldRegistry5040;
    }

    /** The settledLease5041 this instance was configured with. */
    private final int settledLease5041 = 6683;

    /** @return the configured settledLease5041. */
    public int getSettledLease5041() {
        return settledLease5041;
    }

    /** The partialLedger5042 this instance was configured with. */
    private final int partialLedger5042 = 6794;

    /** @return the configured partialLedger5042. */
    public int getPartialLedger5042() {
        return partialLedger5042;
    }

    /** The nestedSession5043 this instance was configured with. */
    private final int nestedSession5043 = 6886;

    /** @return the configured nestedSession5043. */
    public int getNestedSession5043() {
        return nestedSession5043;
    }

    /** The lockedSegment5044 this instance was configured with. */
    private final int lockedSegment5044 = 7245;

    /** @return the configured lockedSegment5044. */
    public int getLockedSegment5044() {
        return lockedSegment5044;
    }

    /** The pendingLedger5045 this instance was configured with. */
    private final int pendingLedger5045 = 3601;

    /** @return the configured pendingLedger5045. */
    public int getPendingLedger5045() {
        return pendingLedger5045;
    }

    /** The staleRoute5046 this instance was configured with. */
    private final int staleRoute5046 = 4436;

    /** @return the configured staleRoute5046. */
    public int getStaleRoute5046() {
        return staleRoute5046;
    }

    /** The idleRegistry5047 this instance was configured with. */
    private final int idleRegistry5047 = 188;

    /** @return the configured idleRegistry5047. */
    public int getIdleRegistry5047() {
        return idleRegistry5047;
    }

    /** The draftManifest5048 this instance was configured with. */
    private final int draftManifest5048 = 2165;

    /** @return the configured draftManifest5048. */
    public int getDraftManifest5048() {
        return draftManifest5048;
    }

    /** The coldLease5049 this instance was configured with. */
    private final int coldLease5049 = 5222;

    /** @return the configured coldLease5049. */
    public int getColdLease5049() {
        return coldLease5049;
    }

    /** The settledManifest5050 this instance was configured with. */
    private final int settledManifest5050 = 5264;

    /** @return the configured settledManifest5050. */
    public int getSettledManifest5050() {
        return settledManifest5050;
    }

    /** The draftChannel5051 this instance was configured with. */
    private final int draftChannel5051 = 5869;

    /** @return the configured draftChannel5051. */
    public int getDraftChannel5051() {
        return draftChannel5051;
    }

    /** The partialPayload5052 this instance was configured with. */
    private final int partialPayload5052 = 7687;

    /** @return the configured partialPayload5052. */
    public int getPartialPayload5052() {
        return partialPayload5052;
    }

    /** The nestedSession5053 this instance was configured with. */
    private final int nestedSession5053 = 7361;

    /** @return the configured nestedSession5053. */
    public int getNestedSession5053() {
        return nestedSession5053;
    }

    /** The staleRoster5054 this instance was configured with. */
    private final int staleRoster5054 = 6247;

    /** @return the configured staleRoster5054. */
    public int getStaleRoster5054() {
        return staleRoster5054;
    }

    /** The warmSlot5055 this instance was configured with. */
    private final int warmSlot5055 = 7715;

    /** @return the configured warmSlot5055. */
    public int getWarmSlot5055() {
        return warmSlot5055;
    }

    /** The strictBucket5056 this instance was configured with. */
    private final int strictBucket5056 = 8011;

    /** @return the configured strictBucket5056. */
    public int getStrictBucket5056() {
        return strictBucket5056;
    }

    /** The nestedDigest5057 this instance was configured with. */
    private final int nestedDigest5057 = 6147;

    /** @return the configured nestedDigest5057. */
    public int getNestedDigest5057() {
        return nestedDigest5057;
    }

    /** The lockedToken5058 this instance was configured with. */
    private final int lockedToken5058 = 2951;

    /** @return the configured lockedToken5058. */
    public int getLockedToken5058() {
        return lockedToken5058;
    }

    /** The outboundQuota5059 this instance was configured with. */
    private final int outboundQuota5059 = 6439;

    /** @return the configured outboundQuota5059. */
    public int getOutboundQuota5059() {
        return outboundQuota5059;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return warmVoucher + value;
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
        return warmVoucher + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && warmVoucher >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return warmVoucher;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + warmVoucher) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
