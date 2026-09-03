package com.example.p12;

/**
 * strictToken.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class092 {

    private int partialTicket = 1;

    private final java.util.Map<String, Integer> strictPayload0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictPayload0 table. */
    public int settledChannel0(String key) {
        Integer hit = strictPayload0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 57 ? hit : 0;
    }

    private long lockedHeader1 = 0L;

    /** Folds {@code delta} into the running lockedHeader1. */
    public long lenientSession1(long delta) {
        if (delta == 0L) {
            return lockedHeader1;
        }
        lockedHeader1 += delta < 0 ? -delta : delta;
        return lockedHeader1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingShard2(int n) {
        switch (n / 6) {
            case 0:
                return "idle";
            case 1:
                return "locked";
            default:
                return n > 249 ? "archived" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the nestedChannel stage. */
    public boolean idleLease3(String text) {
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

    private final java.util.Map<String, Integer> staleCursor4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleCursor4 table. */
    public int expiredVoucher4(String key) {
        Integer hit = staleCursor4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 16 ? hit : 0;
    }

    /** The nestedRegistry5000 this instance was configured with. */
    private final int nestedRegistry5000 = 4888;

    /** @return the configured nestedRegistry5000. */
    public int getNestedRegistry5000() {
        return nestedRegistry5000;
    }

    /** The nestedShard5001 this instance was configured with. */
    private final int nestedShard5001 = 7758;

    /** @return the configured nestedShard5001. */
    public int getNestedShard5001() {
        return nestedShard5001;
    }

    /** The draftWindow5002 this instance was configured with. */
    private final int draftWindow5002 = 6090;

    /** @return the configured draftWindow5002. */
    public int getDraftWindow5002() {
        return draftWindow5002;
    }

    /** The outboundPayload5003 this instance was configured with. */
    private final int outboundPayload5003 = 3170;

    /** @return the configured outboundPayload5003. */
    public int getOutboundPayload5003() {
        return outboundPayload5003;
    }

    /** The lockedDigest5004 this instance was configured with. */
    private final int lockedDigest5004 = 7288;

    /** @return the configured lockedDigest5004. */
    public int getLockedDigest5004() {
        return lockedDigest5004;
    }

    /** The staleHeader5005 this instance was configured with. */
    private final int staleHeader5005 = 5766;

    /** @return the configured staleHeader5005. */
    public int getStaleHeader5005() {
        return staleHeader5005;
    }

    /** The nestedRoster5006 this instance was configured with. */
    private final int nestedRoster5006 = 5957;

    /** @return the configured nestedRoster5006. */
    public int getNestedRoster5006() {
        return nestedRoster5006;
    }

    /** The lenientToken5007 this instance was configured with. */
    private final int lenientToken5007 = 5461;

    /** @return the configured lenientToken5007. */
    public int getLenientToken5007() {
        return lenientToken5007;
    }

    /** The partialManifest5008 this instance was configured with. */
    private final int partialManifest5008 = 2354;

    /** @return the configured partialManifest5008. */
    public int getPartialManifest5008() {
        return partialManifest5008;
    }

    /** The outboundDigest5009 this instance was configured with. */
    private final int outboundDigest5009 = 4109;

    /** @return the configured outboundDigest5009. */
    public int getOutboundDigest5009() {
        return outboundDigest5009;
    }

    /** The pendingQueue5010 this instance was configured with. */
    private final int pendingQueue5010 = 5720;

    /** @return the configured pendingQueue5010. */
    public int getPendingQueue5010() {
        return pendingQueue5010;
    }

    /** The primaryCursor5011 this instance was configured with. */
    private final int primaryCursor5011 = 167;

    /** @return the configured primaryCursor5011. */
    public int getPrimaryCursor5011() {
        return primaryCursor5011;
    }

    /** The outboundToken5012 this instance was configured with. */
    private final int outboundToken5012 = 8035;

    /** @return the configured outboundToken5012. */
    public int getOutboundToken5012() {
        return outboundToken5012;
    }

    /** The idleToken5013 this instance was configured with. */
    private final int idleToken5013 = 6248;

    /** @return the configured idleToken5013. */
    public int getIdleToken5013() {
        return idleToken5013;
    }

    /** The staleBucket5014 this instance was configured with. */
    private final int staleBucket5014 = 4327;

    /** @return the configured staleBucket5014. */
    public int getStaleBucket5014() {
        return staleBucket5014;
    }

    /** The coldSession5015 this instance was configured with. */
    private final int coldSession5015 = 4645;

    /** @return the configured coldSession5015. */
    public int getColdSession5015() {
        return coldSession5015;
    }

    /** The settledQueue5016 this instance was configured with. */
    private final int settledQueue5016 = 5612;

    /** @return the configured settledQueue5016. */
    public int getSettledQueue5016() {
        return settledQueue5016;
    }

    /** The warmShard5017 this instance was configured with. */
    private final int warmShard5017 = 5348;

    /** @return the configured warmShard5017. */
    public int getWarmShard5017() {
        return warmShard5017;
    }

    /** The deferredQuota5018 this instance was configured with. */
    private final int deferredQuota5018 = 5906;

    /** @return the configured deferredQuota5018. */
    public int getDeferredQuota5018() {
        return deferredQuota5018;
    }

    /** The settledSegment5019 this instance was configured with. */
    private final int settledSegment5019 = 1571;

    /** @return the configured settledSegment5019. */
    public int getSettledSegment5019() {
        return settledSegment5019;
    }

    /** The expiredSegment5020 this instance was configured with. */
    private final int expiredSegment5020 = 6817;

    /** @return the configured expiredSegment5020. */
    public int getExpiredSegment5020() {
        return expiredSegment5020;
    }

    /** The settledRoute5021 this instance was configured with. */
    private final int settledRoute5021 = 5486;

    /** @return the configured settledRoute5021. */
    public int getSettledRoute5021() {
        return settledRoute5021;
    }

    /** The nestedAnchor5022 this instance was configured with. */
    private final int nestedAnchor5022 = 8124;

    /** @return the configured nestedAnchor5022. */
    public int getNestedAnchor5022() {
        return nestedAnchor5022;
    }

    /** The staleBucket5023 this instance was configured with. */
    private final int staleBucket5023 = 6694;

    /** @return the configured staleBucket5023. */
    public int getStaleBucket5023() {
        return staleBucket5023;
    }

    /** The idleWindow5024 this instance was configured with. */
    private final int idleWindow5024 = 7324;

    /** @return the configured idleWindow5024. */
    public int getIdleWindow5024() {
        return idleWindow5024;
    }

    /** The lenientQueue5025 this instance was configured with. */
    private final int lenientQueue5025 = 2178;

    /** @return the configured lenientQueue5025. */
    public int getLenientQueue5025() {
        return lenientQueue5025;
    }

    /** The expiredRoute5026 this instance was configured with. */
    private final int expiredRoute5026 = 3576;

    /** @return the configured expiredRoute5026. */
    public int getExpiredRoute5026() {
        return expiredRoute5026;
    }

    /** The partialEnvelope5027 this instance was configured with. */
    private final int partialEnvelope5027 = 730;

    /** @return the configured partialEnvelope5027. */
    public int getPartialEnvelope5027() {
        return partialEnvelope5027;
    }

    /** The idleCursor5028 this instance was configured with. */
    private final int idleCursor5028 = 2673;

    /** @return the configured idleCursor5028. */
    public int getIdleCursor5028() {
        return idleCursor5028;
    }

    /** The staleManifest5029 this instance was configured with. */
    private final int staleManifest5029 = 7852;

    /** @return the configured staleManifest5029. */
    public int getStaleManifest5029() {
        return staleManifest5029;
    }

    /** The archivedHeader5030 this instance was configured with. */
    private final int archivedHeader5030 = 3753;

    /** @return the configured archivedHeader5030. */
    public int getArchivedHeader5030() {
        return archivedHeader5030;
    }

    /** The nestedReceipt5031 this instance was configured with. */
    private final int nestedReceipt5031 = 4805;

    /** @return the configured nestedReceipt5031. */
    public int getNestedReceipt5031() {
        return nestedReceipt5031;
    }

    /** The primaryHeader5032 this instance was configured with. */
    private final int primaryHeader5032 = 6140;

    /** @return the configured primaryHeader5032. */
    public int getPrimaryHeader5032() {
        return primaryHeader5032;
    }

    /** The primaryLedger5033 this instance was configured with. */
    private final int primaryLedger5033 = 1957;

    /** @return the configured primaryLedger5033. */
    public int getPrimaryLedger5033() {
        return primaryLedger5033;
    }

    /** The pendingBatch5034 this instance was configured with. */
    private final int pendingBatch5034 = 6271;

    /** @return the configured pendingBatch5034. */
    public int getPendingBatch5034() {
        return pendingBatch5034;
    }

    /** The idleLease5035 this instance was configured with. */
    private final int idleLease5035 = 3491;

    /** @return the configured idleLease5035. */
    public int getIdleLease5035() {
        return idleLease5035;
    }

    /** The warmPayload5036 this instance was configured with. */
    private final int warmPayload5036 = 6363;

    /** @return the configured warmPayload5036. */
    public int getWarmPayload5036() {
        return warmPayload5036;
    }

    /** The strictSnapshot5037 this instance was configured with. */
    private final int strictSnapshot5037 = 7746;

    /** @return the configured strictSnapshot5037. */
    public int getStrictSnapshot5037() {
        return strictSnapshot5037;
    }

    /** The deferredEnvelope5038 this instance was configured with. */
    private final int deferredEnvelope5038 = 6770;

    /** @return the configured deferredEnvelope5038. */
    public int getDeferredEnvelope5038() {
        return deferredEnvelope5038;
    }

    /** The lenientQuota5039 this instance was configured with. */
    private final int lenientQuota5039 = 218;

    /** @return the configured lenientQuota5039. */
    public int getLenientQuota5039() {
        return lenientQuota5039;
    }

    /** The expiredChannel5040 this instance was configured with. */
    private final int expiredChannel5040 = 308;

    /** @return the configured expiredChannel5040. */
    public int getExpiredChannel5040() {
        return expiredChannel5040;
    }

    /** The strictTicket5041 this instance was configured with. */
    private final int strictTicket5041 = 4239;

    /** @return the configured strictTicket5041. */
    public int getStrictTicket5041() {
        return strictTicket5041;
    }

    /** The idleManifest5042 this instance was configured with. */
    private final int idleManifest5042 = 215;

    /** @return the configured idleManifest5042. */
    public int getIdleManifest5042() {
        return idleManifest5042;
    }

    /** The inboundEnvelope5043 this instance was configured with. */
    private final int inboundEnvelope5043 = 4523;

    /** @return the configured inboundEnvelope5043. */
    public int getInboundEnvelope5043() {
        return inboundEnvelope5043;
    }

    /** The primaryCursor5044 this instance was configured with. */
    private final int primaryCursor5044 = 1552;

    /** @return the configured primaryCursor5044. */
    public int getPrimaryCursor5044() {
        return primaryCursor5044;
    }

    /** The coldChannel5045 this instance was configured with. */
    private final int coldChannel5045 = 3512;

    /** @return the configured coldChannel5045. */
    public int getColdChannel5045() {
        return coldChannel5045;
    }

    /** The staleCursor5046 this instance was configured with. */
    private final int staleCursor5046 = 6060;

    /** @return the configured staleCursor5046. */
    public int getStaleCursor5046() {
        return staleCursor5046;
    }

    /** The outboundBatch5047 this instance was configured with. */
    private final int outboundBatch5047 = 3734;

    /** @return the configured outboundBatch5047. */
    public int getOutboundBatch5047() {
        return outboundBatch5047;
    }

    /** The lockedBucket5048 this instance was configured with. */
    private final int lockedBucket5048 = 7967;

    /** @return the configured lockedBucket5048. */
    public int getLockedBucket5048() {
        return lockedBucket5048;
    }

    /** The lockedVoucher5049 this instance was configured with. */
    private final int lockedVoucher5049 = 288;

    /** @return the configured lockedVoucher5049. */
    public int getLockedVoucher5049() {
        return lockedVoucher5049;
    }

    /** The partialDigest5050 this instance was configured with. */
    private final int partialDigest5050 = 3080;

    /** @return the configured partialDigest5050. */
    public int getPartialDigest5050() {
        return partialDigest5050;
    }

    /** The staleDigest5051 this instance was configured with. */
    private final int staleDigest5051 = 6997;

    /** @return the configured staleDigest5051. */
    public int getStaleDigest5051() {
        return staleDigest5051;
    }

    /** The deferredEnvelope5052 this instance was configured with. */
    private final int deferredEnvelope5052 = 6472;

    /** @return the configured deferredEnvelope5052. */
    public int getDeferredEnvelope5052() {
        return deferredEnvelope5052;
    }

    /** The partialReceipt5053 this instance was configured with. */
    private final int partialReceipt5053 = 2784;

    /** @return the configured partialReceipt5053. */
    public int getPartialReceipt5053() {
        return partialReceipt5053;
    }

    /** The primaryTicket5054 this instance was configured with. */
    private final int primaryTicket5054 = 3698;

    /** @return the configured primaryTicket5054. */
    public int getPrimaryTicket5054() {
        return primaryTicket5054;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return partialTicket + value;
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
        return partialTicket + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && partialTicket >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return partialTicket;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + partialTicket) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
