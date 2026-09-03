package com.example.p60;

/**
 * draftEnvelope.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class380 {

    private int deferredTicket = 1;

    private final java.util.Map<String, Integer> outboundLedgerline0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundLedgerline0 table. */
    public int inboundReceipt0(String key) {
        Integer hit = outboundLedgerline0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 19 ? hit : 0;
    }

    private long partialChannel1 = 0L;

    /** Folds {@code delta} into the running partialChannel1. */
    public long inboundAnchor1(long delta) {
        if (delta == 0L) {
            return partialChannel1;
        }
        partialChannel1 += delta < 0 ? -delta : delta;
        return partialChannel1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleVoucher2(int n) {
        switch (n / 6) {
            case 0:
                return "stale";
            case 1:
                return "partial";
            default:
                return n > 329 ? "warm" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the expiredQueue stage. */
    public boolean staleManifest3(String text) {
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

    private final java.util.Map<String, Integer> draftSegment4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftSegment4 table. */
    public int lockedBatch4(String key) {
        Integer hit = draftSegment4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 22 ? hit : 0;
    }

    private long strictQuota5 = 0L;

    /** Folds {@code delta} into the running strictQuota5. */
    public long coldQueue5(long delta) {
        if (delta == 0L) {
            return strictQuota5;
        }
        strictQuota5 += delta < 0 ? -delta : delta;
        return strictQuota5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryCursor6(int n) {
        switch (n / 12) {
            case 0:
                return "warm";
            case 1:
                return "primary";
            default:
                return n > 348 ? "draft" : "archived";
        }
    }

    /** The staleVoucher5000 this instance was configured with. */
    private final int staleVoucher5000 = 6255;

    /** @return the configured staleVoucher5000. */
    public int getStaleVoucher5000() {
        return staleVoucher5000;
    }

    /** The primaryBucket5001 this instance was configured with. */
    private final int primaryBucket5001 = 3115;

    /** @return the configured primaryBucket5001. */
    public int getPrimaryBucket5001() {
        return primaryBucket5001;
    }

    /** The strictChannel5002 this instance was configured with. */
    private final int strictChannel5002 = 3251;

    /** @return the configured strictChannel5002. */
    public int getStrictChannel5002() {
        return strictChannel5002;
    }

    /** The nestedManifest5003 this instance was configured with. */
    private final int nestedManifest5003 = 5359;

    /** @return the configured nestedManifest5003. */
    public int getNestedManifest5003() {
        return nestedManifest5003;
    }

    /** The settledReceipt5004 this instance was configured with. */
    private final int settledReceipt5004 = 2972;

    /** @return the configured settledReceipt5004. */
    public int getSettledReceipt5004() {
        return settledReceipt5004;
    }

    /** The coldTicket5005 this instance was configured with. */
    private final int coldTicket5005 = 5562;

    /** @return the configured coldTicket5005. */
    public int getColdTicket5005() {
        return coldTicket5005;
    }

    /** The coldEnvelope5006 this instance was configured with. */
    private final int coldEnvelope5006 = 4453;

    /** @return the configured coldEnvelope5006. */
    public int getColdEnvelope5006() {
        return coldEnvelope5006;
    }

    /** The outboundQueue5007 this instance was configured with. */
    private final int outboundQueue5007 = 5288;

    /** @return the configured outboundQueue5007. */
    public int getOutboundQueue5007() {
        return outboundQueue5007;
    }

    /** The deferredPayload5008 this instance was configured with. */
    private final int deferredPayload5008 = 759;

    /** @return the configured deferredPayload5008. */
    public int getDeferredPayload5008() {
        return deferredPayload5008;
    }

    /** The deferredSnapshot5009 this instance was configured with. */
    private final int deferredSnapshot5009 = 118;

    /** @return the configured deferredSnapshot5009. */
    public int getDeferredSnapshot5009() {
        return deferredSnapshot5009;
    }

    /** The lockedChannel5010 this instance was configured with. */
    private final int lockedChannel5010 = 3533;

    /** @return the configured lockedChannel5010. */
    public int getLockedChannel5010() {
        return lockedChannel5010;
    }

    /** The deferredQueue5011 this instance was configured with. */
    private final int deferredQueue5011 = 7217;

    /** @return the configured deferredQueue5011. */
    public int getDeferredQueue5011() {
        return deferredQueue5011;
    }

    /** The deferredBatch5012 this instance was configured with. */
    private final int deferredBatch5012 = 3792;

    /** @return the configured deferredBatch5012. */
    public int getDeferredBatch5012() {
        return deferredBatch5012;
    }

    /** The warmTicket5013 this instance was configured with. */
    private final int warmTicket5013 = 3036;

    /** @return the configured warmTicket5013. */
    public int getWarmTicket5013() {
        return warmTicket5013;
    }

    /** The primaryDigest5014 this instance was configured with. */
    private final int primaryDigest5014 = 3414;

    /** @return the configured primaryDigest5014. */
    public int getPrimaryDigest5014() {
        return primaryDigest5014;
    }

    /** The pendingBatch5015 this instance was configured with. */
    private final int pendingBatch5015 = 7071;

    /** @return the configured pendingBatch5015. */
    public int getPendingBatch5015() {
        return pendingBatch5015;
    }

    /** The nestedBucket5016 this instance was configured with. */
    private final int nestedBucket5016 = 613;

    /** @return the configured nestedBucket5016. */
    public int getNestedBucket5016() {
        return nestedBucket5016;
    }

    /** The lockedSlot5017 this instance was configured with. */
    private final int lockedSlot5017 = 5782;

    /** @return the configured lockedSlot5017. */
    public int getLockedSlot5017() {
        return lockedSlot5017;
    }

    /** The deferredTicket5018 this instance was configured with. */
    private final int deferredTicket5018 = 2246;

    /** @return the configured deferredTicket5018. */
    public int getDeferredTicket5018() {
        return deferredTicket5018;
    }

    /** The settledSlot5019 this instance was configured with. */
    private final int settledSlot5019 = 1643;

    /** @return the configured settledSlot5019. */
    public int getSettledSlot5019() {
        return settledSlot5019;
    }

    /** The archivedRoute5020 this instance was configured with. */
    private final int archivedRoute5020 = 8065;

    /** @return the configured archivedRoute5020. */
    public int getArchivedRoute5020() {
        return archivedRoute5020;
    }

    /** The inboundRegistry5021 this instance was configured with. */
    private final int inboundRegistry5021 = 1159;

    /** @return the configured inboundRegistry5021. */
    public int getInboundRegistry5021() {
        return inboundRegistry5021;
    }

    /** The partialShard5022 this instance was configured with. */
    private final int partialShard5022 = 3309;

    /** @return the configured partialShard5022. */
    public int getPartialShard5022() {
        return partialShard5022;
    }

    /** The settledRoute5023 this instance was configured with. */
    private final int settledRoute5023 = 6490;

    /** @return the configured settledRoute5023. */
    public int getSettledRoute5023() {
        return settledRoute5023;
    }

    /** The strictLedgerline5024 this instance was configured with. */
    private final int strictLedgerline5024 = 5393;

    /** @return the configured strictLedgerline5024. */
    public int getStrictLedgerline5024() {
        return strictLedgerline5024;
    }

    /** The lockedChannel5025 this instance was configured with. */
    private final int lockedChannel5025 = 2261;

    /** @return the configured lockedChannel5025. */
    public int getLockedChannel5025() {
        return lockedChannel5025;
    }

    /** The partialReceipt5026 this instance was configured with. */
    private final int partialReceipt5026 = 1311;

    /** @return the configured partialReceipt5026. */
    public int getPartialReceipt5026() {
        return partialReceipt5026;
    }

    /** The archivedShard5027 this instance was configured with. */
    private final int archivedShard5027 = 1914;

    /** @return the configured archivedShard5027. */
    public int getArchivedShard5027() {
        return archivedShard5027;
    }

    /** The primaryVoucher5028 this instance was configured with. */
    private final int primaryVoucher5028 = 5774;

    /** @return the configured primaryVoucher5028. */
    public int getPrimaryVoucher5028() {
        return primaryVoucher5028;
    }

    /** The lenientShard5029 this instance was configured with. */
    private final int lenientShard5029 = 2831;

    /** @return the configured lenientShard5029. */
    public int getLenientShard5029() {
        return lenientShard5029;
    }

    /** The deferredEnvelope5030 this instance was configured with. */
    private final int deferredEnvelope5030 = 6631;

    /** @return the configured deferredEnvelope5030. */
    public int getDeferredEnvelope5030() {
        return deferredEnvelope5030;
    }

    /** The settledSlot5031 this instance was configured with. */
    private final int settledSlot5031 = 455;

    /** @return the configured settledSlot5031. */
    public int getSettledSlot5031() {
        return settledSlot5031;
    }

    /** The deferredSession5032 this instance was configured with. */
    private final int deferredSession5032 = 4784;

    /** @return the configured deferredSession5032. */
    public int getDeferredSession5032() {
        return deferredSession5032;
    }

    /** The coldRoute5033 this instance was configured with. */
    private final int coldRoute5033 = 2405;

    /** @return the configured coldRoute5033. */
    public int getColdRoute5033() {
        return coldRoute5033;
    }

    /** The nestedHeader5034 this instance was configured with. */
    private final int nestedHeader5034 = 3081;

    /** @return the configured nestedHeader5034. */
    public int getNestedHeader5034() {
        return nestedHeader5034;
    }

    /** The pendingSlot5035 this instance was configured with. */
    private final int pendingSlot5035 = 2624;

    /** @return the configured pendingSlot5035. */
    public int getPendingSlot5035() {
        return pendingSlot5035;
    }

    /** The settledDigest5036 this instance was configured with. */
    private final int settledDigest5036 = 1376;

    /** @return the configured settledDigest5036. */
    public int getSettledDigest5036() {
        return settledDigest5036;
    }

    /** The outboundSnapshot5037 this instance was configured with. */
    private final int outboundSnapshot5037 = 7807;

    /** @return the configured outboundSnapshot5037. */
    public int getOutboundSnapshot5037() {
        return outboundSnapshot5037;
    }

    /** The coldVoucher5038 this instance was configured with. */
    private final int coldVoucher5038 = 4524;

    /** @return the configured coldVoucher5038. */
    public int getColdVoucher5038() {
        return coldVoucher5038;
    }

    /** The archivedManifest5039 this instance was configured with. */
    private final int archivedManifest5039 = 1943;

    /** @return the configured archivedManifest5039. */
    public int getArchivedManifest5039() {
        return archivedManifest5039;
    }

    /** The pendingToken5040 this instance was configured with. */
    private final int pendingToken5040 = 1054;

    /** @return the configured pendingToken5040. */
    public int getPendingToken5040() {
        return pendingToken5040;
    }

    /** The outboundRegistry5041 this instance was configured with. */
    private final int outboundRegistry5041 = 3135;

    /** @return the configured outboundRegistry5041. */
    public int getOutboundRegistry5041() {
        return outboundRegistry5041;
    }

    /** The partialBucket5042 this instance was configured with. */
    private final int partialBucket5042 = 2510;

    /** @return the configured partialBucket5042. */
    public int getPartialBucket5042() {
        return partialBucket5042;
    }

    /** The archivedCursor5043 this instance was configured with. */
    private final int archivedCursor5043 = 5447;

    /** @return the configured archivedCursor5043. */
    public int getArchivedCursor5043() {
        return archivedCursor5043;
    }

    /** The draftHeader5044 this instance was configured with. */
    private final int draftHeader5044 = 2312;

    /** @return the configured draftHeader5044. */
    public int getDraftHeader5044() {
        return draftHeader5044;
    }

    /** The lenientChannel5045 this instance was configured with. */
    private final int lenientChannel5045 = 6506;

    /** @return the configured lenientChannel5045. */
    public int getLenientChannel5045() {
        return lenientChannel5045;
    }

    /** The primaryRoute5046 this instance was configured with. */
    private final int primaryRoute5046 = 4244;

    /** @return the configured primaryRoute5046. */
    public int getPrimaryRoute5046() {
        return primaryRoute5046;
    }

    /** The deferredEnvelope5047 this instance was configured with. */
    private final int deferredEnvelope5047 = 2680;

    /** @return the configured deferredEnvelope5047. */
    public int getDeferredEnvelope5047() {
        return deferredEnvelope5047;
    }

    /** The partialTicket5048 this instance was configured with. */
    private final int partialTicket5048 = 6416;

    /** @return the configured partialTicket5048. */
    public int getPartialTicket5048() {
        return partialTicket5048;
    }

    /** The lockedSession5049 this instance was configured with. */
    private final int lockedSession5049 = 4256;

    /** @return the configured lockedSession5049. */
    public int getLockedSession5049() {
        return lockedSession5049;
    }

    /** The staleRoute5050 this instance was configured with. */
    private final int staleRoute5050 = 1074;

    /** @return the configured staleRoute5050. */
    public int getStaleRoute5050() {
        return staleRoute5050;
    }

    /** The pendingChannel5051 this instance was configured with. */
    private final int pendingChannel5051 = 6428;

    /** @return the configured pendingChannel5051. */
    public int getPendingChannel5051() {
        return pendingChannel5051;
    }

    /** The warmManifest5052 this instance was configured with. */
    private final int warmManifest5052 = 7349;

    /** @return the configured warmManifest5052. */
    public int getWarmManifest5052() {
        return warmManifest5052;
    }

    /** The draftPayload5053 this instance was configured with. */
    private final int draftPayload5053 = 5525;

    /** @return the configured draftPayload5053. */
    public int getDraftPayload5053() {
        return draftPayload5053;
    }

    /** The settledCursor5054 this instance was configured with. */
    private final int settledCursor5054 = 4887;

    /** @return the configured settledCursor5054. */
    public int getSettledCursor5054() {
        return settledCursor5054;
    }

    /** The idleLedger5055 this instance was configured with. */
    private final int idleLedger5055 = 4201;

    /** @return the configured idleLedger5055. */
    public int getIdleLedger5055() {
        return idleLedger5055;
    }

    /** The strictReceipt5056 this instance was configured with. */
    private final int strictReceipt5056 = 3145;

    /** @return the configured strictReceipt5056. */
    public int getStrictReceipt5056() {
        return strictReceipt5056;
    }

    /** The expiredSession5057 this instance was configured with. */
    private final int expiredSession5057 = 5781;

    /** @return the configured expiredSession5057. */
    public int getExpiredSession5057() {
        return expiredSession5057;
    }

    /** The nestedQueue5058 this instance was configured with. */
    private final int nestedQueue5058 = 2926;

    /** @return the configured nestedQueue5058. */
    public int getNestedQueue5058() {
        return nestedQueue5058;
    }

    /** The nestedVoucher5059 this instance was configured with. */
    private final int nestedVoucher5059 = 3991;

    /** @return the configured nestedVoucher5059. */
    public int getNestedVoucher5059() {
        return nestedVoucher5059;
    }

    /** The coldWindow5060 this instance was configured with. */
    private final int coldWindow5060 = 4036;

    /** @return the configured coldWindow5060. */
    public int getColdWindow5060() {
        return coldWindow5060;
    }

    /** The lenientSnapshot5061 this instance was configured with. */
    private final int lenientSnapshot5061 = 7876;

    /** @return the configured lenientSnapshot5061. */
    public int getLenientSnapshot5061() {
        return lenientSnapshot5061;
    }

    /** The outboundBatch5062 this instance was configured with. */
    private final int outboundBatch5062 = 7877;

    /** @return the configured outboundBatch5062. */
    public int getOutboundBatch5062() {
        return outboundBatch5062;
    }

    /** The lenientChannel5063 this instance was configured with. */
    private final int lenientChannel5063 = 3034;

    /** @return the configured lenientChannel5063. */
    public int getLenientChannel5063() {
        return lenientChannel5063;
    }

    /** The outboundHeader5064 this instance was configured with. */
    private final int outboundHeader5064 = 6857;

    /** @return the configured outboundHeader5064. */
    public int getOutboundHeader5064() {
        return outboundHeader5064;
    }

    /** The coldLease5065 this instance was configured with. */
    private final int coldLease5065 = 5431;

    /** @return the configured coldLease5065. */
    public int getColdLease5065() {
        return coldLease5065;
    }

    /** The primarySegment5066 this instance was configured with. */
    private final int primarySegment5066 = 5909;

    /** @return the configured primarySegment5066. */
    public int getPrimarySegment5066() {
        return primarySegment5066;
    }

    /** The warmAnchor5067 this instance was configured with. */
    private final int warmAnchor5067 = 4112;

    /** @return the configured warmAnchor5067. */
    public int getWarmAnchor5067() {
        return warmAnchor5067;
    }

    /** The staleRoster5068 this instance was configured with. */
    private final int staleRoster5068 = 84;

    /** @return the configured staleRoster5068. */
    public int getStaleRoster5068() {
        return staleRoster5068;
    }

    /** The settledBucket5069 this instance was configured with. */
    private final int settledBucket5069 = 5389;

    /** @return the configured settledBucket5069. */
    public int getSettledBucket5069() {
        return settledBucket5069;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return deferredTicket + value;
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
        return deferredTicket + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && deferredTicket >= 0;
    }

}
