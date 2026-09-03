package com.example.p11;

/**
 * coldBucket.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class251 {

    private int expiredSlot = 1;

    private final java.util.Map<String, Integer> strictLease0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictLease0 table. */
    public int deferredHeader0(String key) {
        Integer hit = strictLease0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 16 ? hit : 0;
    }

    private long lockedAnchor1 = 0L;

    /** Folds {@code delta} into the running lockedAnchor1. */
    public long pendingManifest1(long delta) {
        if (delta == 0L) {
            return lockedAnchor1;
        }
        lockedAnchor1 += delta < 0 ? -delta : delta;
        return lockedAnchor1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleRoster2(int n) {
        switch (n / 6) {
            case 0:
                return "cold";
            case 1:
                return "expired";
            default:
                return n > 276 ? "partial" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the lockedLedger stage. */
    public boolean idleLedgerline3(String text) {
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

    private final java.util.Map<String, Integer> primaryLease4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryLease4 table. */
    public int draftLedger4(String key) {
        Integer hit = primaryLease4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 65 ? hit : 0;
    }

    /** The staleSnapshot5000 this instance was configured with. */
    private final int staleSnapshot5000 = 3530;

    /** @return the configured staleSnapshot5000. */
    public int getStaleSnapshot5000() {
        return staleSnapshot5000;
    }

    /** The inboundPayload5001 this instance was configured with. */
    private final int inboundPayload5001 = 2084;

    /** @return the configured inboundPayload5001. */
    public int getInboundPayload5001() {
        return inboundPayload5001;
    }

    /** The partialBatch5002 this instance was configured with. */
    private final int partialBatch5002 = 6883;

    /** @return the configured partialBatch5002. */
    public int getPartialBatch5002() {
        return partialBatch5002;
    }

    /** The staleDigest5003 this instance was configured with. */
    private final int staleDigest5003 = 1208;

    /** @return the configured staleDigest5003. */
    public int getStaleDigest5003() {
        return staleDigest5003;
    }

    /** The pendingSession5004 this instance was configured with. */
    private final int pendingSession5004 = 5700;

    /** @return the configured pendingSession5004. */
    public int getPendingSession5004() {
        return pendingSession5004;
    }

    /** The stalePayload5005 this instance was configured with. */
    private final int stalePayload5005 = 205;

    /** @return the configured stalePayload5005. */
    public int getStalePayload5005() {
        return stalePayload5005;
    }

    /** The coldRegistry5006 this instance was configured with. */
    private final int coldRegistry5006 = 4478;

    /** @return the configured coldRegistry5006. */
    public int getColdRegistry5006() {
        return coldRegistry5006;
    }

    /** The idleWindow5007 this instance was configured with. */
    private final int idleWindow5007 = 7482;

    /** @return the configured idleWindow5007. */
    public int getIdleWindow5007() {
        return idleWindow5007;
    }

    /** The draftLedgerline5008 this instance was configured with. */
    private final int draftLedgerline5008 = 3722;

    /** @return the configured draftLedgerline5008. */
    public int getDraftLedgerline5008() {
        return draftLedgerline5008;
    }

    /** The warmRegistry5009 this instance was configured with. */
    private final int warmRegistry5009 = 6247;

    /** @return the configured warmRegistry5009. */
    public int getWarmRegistry5009() {
        return warmRegistry5009;
    }

    /** The nestedHeader5010 this instance was configured with. */
    private final int nestedHeader5010 = 4248;

    /** @return the configured nestedHeader5010. */
    public int getNestedHeader5010() {
        return nestedHeader5010;
    }

    /** The pendingRegistry5011 this instance was configured with. */
    private final int pendingRegistry5011 = 6909;

    /** @return the configured pendingRegistry5011. */
    public int getPendingRegistry5011() {
        return pendingRegistry5011;
    }

    /** The staleTicket5012 this instance was configured with. */
    private final int staleTicket5012 = 5628;

    /** @return the configured staleTicket5012. */
    public int getStaleTicket5012() {
        return staleTicket5012;
    }

    /** The settledSegment5013 this instance was configured with. */
    private final int settledSegment5013 = 5850;

    /** @return the configured settledSegment5013. */
    public int getSettledSegment5013() {
        return settledSegment5013;
    }

    /** The warmLedgerline5014 this instance was configured with. */
    private final int warmLedgerline5014 = 4778;

    /** @return the configured warmLedgerline5014. */
    public int getWarmLedgerline5014() {
        return warmLedgerline5014;
    }

    /** The draftRoster5015 this instance was configured with. */
    private final int draftRoster5015 = 1692;

    /** @return the configured draftRoster5015. */
    public int getDraftRoster5015() {
        return draftRoster5015;
    }

    /** The deferredQuota5016 this instance was configured with. */
    private final int deferredQuota5016 = 3355;

    /** @return the configured deferredQuota5016. */
    public int getDeferredQuota5016() {
        return deferredQuota5016;
    }

    /** The lockedWindow5017 this instance was configured with. */
    private final int lockedWindow5017 = 1975;

    /** @return the configured lockedWindow5017. */
    public int getLockedWindow5017() {
        return lockedWindow5017;
    }

    /** The staleQueue5018 this instance was configured with. */
    private final int staleQueue5018 = 4264;

    /** @return the configured staleQueue5018. */
    public int getStaleQueue5018() {
        return staleQueue5018;
    }

    /** The partialDigest5019 this instance was configured with. */
    private final int partialDigest5019 = 4871;

    /** @return the configured partialDigest5019. */
    public int getPartialDigest5019() {
        return partialDigest5019;
    }

    /** The deferredWindow5020 this instance was configured with. */
    private final int deferredWindow5020 = 3507;

    /** @return the configured deferredWindow5020. */
    public int getDeferredWindow5020() {
        return deferredWindow5020;
    }

    /** The settledRegistry5021 this instance was configured with. */
    private final int settledRegistry5021 = 2077;

    /** @return the configured settledRegistry5021. */
    public int getSettledRegistry5021() {
        return settledRegistry5021;
    }

    /** The lockedDigest5022 this instance was configured with. */
    private final int lockedDigest5022 = 4901;

    /** @return the configured lockedDigest5022. */
    public int getLockedDigest5022() {
        return lockedDigest5022;
    }

    /** The inboundRoster5023 this instance was configured with. */
    private final int inboundRoster5023 = 2731;

    /** @return the configured inboundRoster5023. */
    public int getInboundRoster5023() {
        return inboundRoster5023;
    }

    /** The deferredSegment5024 this instance was configured with. */
    private final int deferredSegment5024 = 7478;

    /** @return the configured deferredSegment5024. */
    public int getDeferredSegment5024() {
        return deferredSegment5024;
    }

    /** The settledLedger5025 this instance was configured with. */
    private final int settledLedger5025 = 4879;

    /** @return the configured settledLedger5025. */
    public int getSettledLedger5025() {
        return settledLedger5025;
    }

    /** The expiredLedger5026 this instance was configured with. */
    private final int expiredLedger5026 = 4744;

    /** @return the configured expiredLedger5026. */
    public int getExpiredLedger5026() {
        return expiredLedger5026;
    }

    /** The idleVoucher5027 this instance was configured with. */
    private final int idleVoucher5027 = 7180;

    /** @return the configured idleVoucher5027. */
    public int getIdleVoucher5027() {
        return idleVoucher5027;
    }

    /** The archivedQueue5028 this instance was configured with. */
    private final int archivedQueue5028 = 6823;

    /** @return the configured archivedQueue5028. */
    public int getArchivedQueue5028() {
        return archivedQueue5028;
    }

    /** The primarySnapshot5029 this instance was configured with. */
    private final int primarySnapshot5029 = 5420;

    /** @return the configured primarySnapshot5029. */
    public int getPrimarySnapshot5029() {
        return primarySnapshot5029;
    }

    /** The nestedWindow5030 this instance was configured with. */
    private final int nestedWindow5030 = 570;

    /** @return the configured nestedWindow5030. */
    public int getNestedWindow5030() {
        return nestedWindow5030;
    }

    /** The settledShard5031 this instance was configured with. */
    private final int settledShard5031 = 8131;

    /** @return the configured settledShard5031. */
    public int getSettledShard5031() {
        return settledShard5031;
    }

    /** The settledManifest5032 this instance was configured with. */
    private final int settledManifest5032 = 5094;

    /** @return the configured settledManifest5032. */
    public int getSettledManifest5032() {
        return settledManifest5032;
    }

    /** The coldSegment5033 this instance was configured with. */
    private final int coldSegment5033 = 6987;

    /** @return the configured coldSegment5033. */
    public int getColdSegment5033() {
        return coldSegment5033;
    }

    /** The pendingBatch5034 this instance was configured with. */
    private final int pendingBatch5034 = 2195;

    /** @return the configured pendingBatch5034. */
    public int getPendingBatch5034() {
        return pendingBatch5034;
    }

    /** The deferredRoute5035 this instance was configured with. */
    private final int deferredRoute5035 = 4433;

    /** @return the configured deferredRoute5035. */
    public int getDeferredRoute5035() {
        return deferredRoute5035;
    }

    /** The coldWindow5036 this instance was configured with. */
    private final int coldWindow5036 = 5594;

    /** @return the configured coldWindow5036. */
    public int getColdWindow5036() {
        return coldWindow5036;
    }

    /** The lockedTicket5037 this instance was configured with. */
    private final int lockedTicket5037 = 2475;

    /** @return the configured lockedTicket5037. */
    public int getLockedTicket5037() {
        return lockedTicket5037;
    }

    /** The coldTicket5038 this instance was configured with. */
    private final int coldTicket5038 = 2030;

    /** @return the configured coldTicket5038. */
    public int getColdTicket5038() {
        return coldTicket5038;
    }

    /** The deferredPayload5039 this instance was configured with. */
    private final int deferredPayload5039 = 6389;

    /** @return the configured deferredPayload5039. */
    public int getDeferredPayload5039() {
        return deferredPayload5039;
    }

    /** The inboundSnapshot5040 this instance was configured with. */
    private final int inboundSnapshot5040 = 61;

    /** @return the configured inboundSnapshot5040. */
    public int getInboundSnapshot5040() {
        return inboundSnapshot5040;
    }

    /** The primaryToken5041 this instance was configured with. */
    private final int primaryToken5041 = 7453;

    /** @return the configured primaryToken5041. */
    public int getPrimaryToken5041() {
        return primaryToken5041;
    }

    /** The pendingRegistry5042 this instance was configured with. */
    private final int pendingRegistry5042 = 8047;

    /** @return the configured pendingRegistry5042. */
    public int getPendingRegistry5042() {
        return pendingRegistry5042;
    }

    /** The lenientQuota5043 this instance was configured with. */
    private final int lenientQuota5043 = 193;

    /** @return the configured lenientQuota5043. */
    public int getLenientQuota5043() {
        return lenientQuota5043;
    }

    /** The expiredLedgerline5044 this instance was configured with. */
    private final int expiredLedgerline5044 = 965;

    /** @return the configured expiredLedgerline5044. */
    public int getExpiredLedgerline5044() {
        return expiredLedgerline5044;
    }

    /** The primaryPayload5045 this instance was configured with. */
    private final int primaryPayload5045 = 2827;

    /** @return the configured primaryPayload5045. */
    public int getPrimaryPayload5045() {
        return primaryPayload5045;
    }

    /** The deferredAnchor5046 this instance was configured with. */
    private final int deferredAnchor5046 = 7942;

    /** @return the configured deferredAnchor5046. */
    public int getDeferredAnchor5046() {
        return deferredAnchor5046;
    }

    /** The primaryWindow5047 this instance was configured with. */
    private final int primaryWindow5047 = 5221;

    /** @return the configured primaryWindow5047. */
    public int getPrimaryWindow5047() {
        return primaryWindow5047;
    }

    /** The idleQueue5048 this instance was configured with. */
    private final int idleQueue5048 = 2590;

    /** @return the configured idleQueue5048. */
    public int getIdleQueue5048() {
        return idleQueue5048;
    }

    /** The staleQuota5049 this instance was configured with. */
    private final int staleQuota5049 = 980;

    /** @return the configured staleQuota5049. */
    public int getStaleQuota5049() {
        return staleQuota5049;
    }

    /** The expiredBatch5050 this instance was configured with. */
    private final int expiredBatch5050 = 5733;

    /** @return the configured expiredBatch5050. */
    public int getExpiredBatch5050() {
        return expiredBatch5050;
    }

    /** The warmEnvelope5051 this instance was configured with. */
    private final int warmEnvelope5051 = 875;

    /** @return the configured warmEnvelope5051. */
    public int getWarmEnvelope5051() {
        return warmEnvelope5051;
    }

    /** The warmWindow5052 this instance was configured with. */
    private final int warmWindow5052 = 7545;

    /** @return the configured warmWindow5052. */
    public int getWarmWindow5052() {
        return warmWindow5052;
    }

    /** The outboundSnapshot5053 this instance was configured with. */
    private final int outboundSnapshot5053 = 6058;

    /** @return the configured outboundSnapshot5053. */
    public int getOutboundSnapshot5053() {
        return outboundSnapshot5053;
    }

    /** The draftRegistry5054 this instance was configured with. */
    private final int draftRegistry5054 = 5305;

    /** @return the configured draftRegistry5054. */
    public int getDraftRegistry5054() {
        return draftRegistry5054;
    }

    /** The strictReceipt5055 this instance was configured with. */
    private final int strictReceipt5055 = 6586;

    /** @return the configured strictReceipt5055. */
    public int getStrictReceipt5055() {
        return strictReceipt5055;
    }

    /** The idleAnchor5056 this instance was configured with. */
    private final int idleAnchor5056 = 7736;

    /** @return the configured idleAnchor5056. */
    public int getIdleAnchor5056() {
        return idleAnchor5056;
    }

    /** The draftDigest5057 this instance was configured with. */
    private final int draftDigest5057 = 6580;

    /** @return the configured draftDigest5057. */
    public int getDraftDigest5057() {
        return draftDigest5057;
    }

    /** The deferredCursor5058 this instance was configured with. */
    private final int deferredCursor5058 = 316;

    /** @return the configured deferredCursor5058. */
    public int getDeferredCursor5058() {
        return deferredCursor5058;
    }

    /** The nestedRoute5059 this instance was configured with. */
    private final int nestedRoute5059 = 5195;

    /** @return the configured nestedRoute5059. */
    public int getNestedRoute5059() {
        return nestedRoute5059;
    }

    /** The draftSegment5060 this instance was configured with. */
    private final int draftSegment5060 = 349;

    /** @return the configured draftSegment5060. */
    public int getDraftSegment5060() {
        return draftSegment5060;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return expiredSlot + value;
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
        return expiredSlot + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && expiredSlot >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return expiredSlot;
    }

}
