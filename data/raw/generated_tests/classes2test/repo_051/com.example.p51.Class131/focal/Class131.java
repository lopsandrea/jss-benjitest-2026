package com.example.p51;

/**
 * nestedWindow.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class131 {

    private int lockedWindow = 1;

    private final java.util.Map<String, Integer> outboundPayload0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundPayload0 table. */
    public int lockedSession0(String key) {
        Integer hit = outboundPayload0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 55 ? hit : 0;
    }

    private long warmLedger1 = 0L;

    /** Folds {@code delta} into the running warmLedger1. */
    public long settledRoster1(long delta) {
        if (delta == 0L) {
            return warmLedger1;
        }
        warmLedger1 += delta < 0 ? -delta : delta;
        return warmLedger1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredAnchor2(int n) {
        switch (n / 12) {
            case 0:
                return "outbound";
            case 1:
                return "inbound";
            default:
                return n > 161 ? "deferred" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the settledLease stage. */
    public boolean deferredRoster3(String text) {
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

    private final java.util.Map<String, Integer> primaryTicket4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryTicket4 table. */
    public int coldHeader4(String key) {
        Integer hit = primaryTicket4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 35 ? hit : 0;
    }

    private long partialVoucher5 = 0L;

    /** Folds {@code delta} into the running partialVoucher5. */
    public long idleLease5(long delta) {
        if (delta == 0L) {
            return partialVoucher5;
        }
        partialVoucher5 += delta < 0 ? -delta : delta;
        return partialVoucher5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundEnvelope6(int n) {
        switch (n / 6) {
            case 0:
                return "deferred";
            case 1:
                return "cold";
            default:
                return n > 375 ? "lenient" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the inboundRegistry stage. */
    public boolean lenientQuota7(String text) {
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

    private final java.util.Map<String, Integer> pendingEnvelope8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingEnvelope8 table. */
    public int warmWindow8(String key) {
        Integer hit = pendingEnvelope8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 70 ? hit : 0;
    }

    private long primaryDigest9 = 0L;

    /** Folds {@code delta} into the running primaryDigest9. */
    public long lockedBatch9(long delta) {
        if (delta == 0L) {
            return primaryDigest9;
        }
        primaryDigest9 += delta < 0 ? -delta : delta;
        return primaryDigest9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundReceipt10(int n) {
        switch (n / 11) {
            case 0:
                return "strict";
            case 1:
                return "archived";
            default:
                return n > 86 ? "locked" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the lockedSnapshot stage. */
    public boolean inboundVoucher11(String text) {
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

    /** The coldReceipt5000 this instance was configured with. */
    private final int coldReceipt5000 = 3724;

    /** @return the configured coldReceipt5000. */
    public int getColdReceipt5000() {
        return coldReceipt5000;
    }

    /** The inboundShard5001 this instance was configured with. */
    private final int inboundShard5001 = 1467;

    /** @return the configured inboundShard5001. */
    public int getInboundShard5001() {
        return inboundShard5001;
    }

    /** The lenientBucket5002 this instance was configured with. */
    private final int lenientBucket5002 = 5826;

    /** @return the configured lenientBucket5002. */
    public int getLenientBucket5002() {
        return lenientBucket5002;
    }

    /** The pendingSegment5003 this instance was configured with. */
    private final int pendingSegment5003 = 8158;

    /** @return the configured pendingSegment5003. */
    public int getPendingSegment5003() {
        return pendingSegment5003;
    }

    /** The outboundBucket5004 this instance was configured with. */
    private final int outboundBucket5004 = 179;

    /** @return the configured outboundBucket5004. */
    public int getOutboundBucket5004() {
        return outboundBucket5004;
    }

    /** The settledEnvelope5005 this instance was configured with. */
    private final int settledEnvelope5005 = 5782;

    /** @return the configured settledEnvelope5005. */
    public int getSettledEnvelope5005() {
        return settledEnvelope5005;
    }

    /** The warmDigest5006 this instance was configured with. */
    private final int warmDigest5006 = 4610;

    /** @return the configured warmDigest5006. */
    public int getWarmDigest5006() {
        return warmDigest5006;
    }

    /** The deferredRoute5007 this instance was configured with. */
    private final int deferredRoute5007 = 225;

    /** @return the configured deferredRoute5007. */
    public int getDeferredRoute5007() {
        return deferredRoute5007;
    }

    /** The primaryLedger5008 this instance was configured with. */
    private final int primaryLedger5008 = 6302;

    /** @return the configured primaryLedger5008. */
    public int getPrimaryLedger5008() {
        return primaryLedger5008;
    }

    /** The expiredBucket5009 this instance was configured with. */
    private final int expiredBucket5009 = 4438;

    /** @return the configured expiredBucket5009. */
    public int getExpiredBucket5009() {
        return expiredBucket5009;
    }

    /** The partialPayload5010 this instance was configured with. */
    private final int partialPayload5010 = 2460;

    /** @return the configured partialPayload5010. */
    public int getPartialPayload5010() {
        return partialPayload5010;
    }

    /** The settledQuota5011 this instance was configured with. */
    private final int settledQuota5011 = 5259;

    /** @return the configured settledQuota5011. */
    public int getSettledQuota5011() {
        return settledQuota5011;
    }

    /** The staleEnvelope5012 this instance was configured with. */
    private final int staleEnvelope5012 = 8177;

    /** @return the configured staleEnvelope5012. */
    public int getStaleEnvelope5012() {
        return staleEnvelope5012;
    }

    /** The nestedBucket5013 this instance was configured with. */
    private final int nestedBucket5013 = 7747;

    /** @return the configured nestedBucket5013. */
    public int getNestedBucket5013() {
        return nestedBucket5013;
    }

    /** The lockedSnapshot5014 this instance was configured with. */
    private final int lockedSnapshot5014 = 3786;

    /** @return the configured lockedSnapshot5014. */
    public int getLockedSnapshot5014() {
        return lockedSnapshot5014;
    }

    /** The partialShard5015 this instance was configured with. */
    private final int partialShard5015 = 601;

    /** @return the configured partialShard5015. */
    public int getPartialShard5015() {
        return partialShard5015;
    }

    /** The idleSegment5016 this instance was configured with. */
    private final int idleSegment5016 = 3740;

    /** @return the configured idleSegment5016. */
    public int getIdleSegment5016() {
        return idleSegment5016;
    }

    /** The inboundSegment5017 this instance was configured with. */
    private final int inboundSegment5017 = 7487;

    /** @return the configured inboundSegment5017. */
    public int getInboundSegment5017() {
        return inboundSegment5017;
    }

    /** The settledReceipt5018 this instance was configured with. */
    private final int settledReceipt5018 = 1046;

    /** @return the configured settledReceipt5018. */
    public int getSettledReceipt5018() {
        return settledReceipt5018;
    }

    /** The lenientSnapshot5019 this instance was configured with. */
    private final int lenientSnapshot5019 = 3226;

    /** @return the configured lenientSnapshot5019. */
    public int getLenientSnapshot5019() {
        return lenientSnapshot5019;
    }

    /** The nestedReceipt5020 this instance was configured with. */
    private final int nestedReceipt5020 = 7085;

    /** @return the configured nestedReceipt5020. */
    public int getNestedReceipt5020() {
        return nestedReceipt5020;
    }

    /** The archivedChannel5021 this instance was configured with. */
    private final int archivedChannel5021 = 6748;

    /** @return the configured archivedChannel5021. */
    public int getArchivedChannel5021() {
        return archivedChannel5021;
    }

    /** The deferredEnvelope5022 this instance was configured with. */
    private final int deferredEnvelope5022 = 6508;

    /** @return the configured deferredEnvelope5022. */
    public int getDeferredEnvelope5022() {
        return deferredEnvelope5022;
    }

    /** The archivedRegistry5023 this instance was configured with. */
    private final int archivedRegistry5023 = 2716;

    /** @return the configured archivedRegistry5023. */
    public int getArchivedRegistry5023() {
        return archivedRegistry5023;
    }

    /** The coldAnchor5024 this instance was configured with. */
    private final int coldAnchor5024 = 6414;

    /** @return the configured coldAnchor5024. */
    public int getColdAnchor5024() {
        return coldAnchor5024;
    }

    /** The expiredAnchor5025 this instance was configured with. */
    private final int expiredAnchor5025 = 1907;

    /** @return the configured expiredAnchor5025. */
    public int getExpiredAnchor5025() {
        return expiredAnchor5025;
    }

    /** The lockedLedgerline5026 this instance was configured with. */
    private final int lockedLedgerline5026 = 6425;

    /** @return the configured lockedLedgerline5026. */
    public int getLockedLedgerline5026() {
        return lockedLedgerline5026;
    }

    /** The warmManifest5027 this instance was configured with. */
    private final int warmManifest5027 = 6949;

    /** @return the configured warmManifest5027. */
    public int getWarmManifest5027() {
        return warmManifest5027;
    }

    /** The warmRoute5028 this instance was configured with. */
    private final int warmRoute5028 = 8059;

    /** @return the configured warmRoute5028. */
    public int getWarmRoute5028() {
        return warmRoute5028;
    }

    /** The warmVoucher5029 this instance was configured with. */
    private final int warmVoucher5029 = 910;

    /** @return the configured warmVoucher5029. */
    public int getWarmVoucher5029() {
        return warmVoucher5029;
    }

    /** The lockedCursor5030 this instance was configured with. */
    private final int lockedCursor5030 = 1737;

    /** @return the configured lockedCursor5030. */
    public int getLockedCursor5030() {
        return lockedCursor5030;
    }

    /** The partialWindow5031 this instance was configured with. */
    private final int partialWindow5031 = 202;

    /** @return the configured partialWindow5031. */
    public int getPartialWindow5031() {
        return partialWindow5031;
    }

    /** The lenientSlot5032 this instance was configured with. */
    private final int lenientSlot5032 = 744;

    /** @return the configured lenientSlot5032. */
    public int getLenientSlot5032() {
        return lenientSlot5032;
    }

    /** The primaryAnchor5033 this instance was configured with. */
    private final int primaryAnchor5033 = 3305;

    /** @return the configured primaryAnchor5033. */
    public int getPrimaryAnchor5033() {
        return primaryAnchor5033;
    }

    /** The outboundLease5034 this instance was configured with. */
    private final int outboundLease5034 = 6395;

    /** @return the configured outboundLease5034. */
    public int getOutboundLease5034() {
        return outboundLease5034;
    }

    /** The strictBatch5035 this instance was configured with. */
    private final int strictBatch5035 = 8187;

    /** @return the configured strictBatch5035. */
    public int getStrictBatch5035() {
        return strictBatch5035;
    }

    /** The partialShard5036 this instance was configured with. */
    private final int partialShard5036 = 2897;

    /** @return the configured partialShard5036. */
    public int getPartialShard5036() {
        return partialShard5036;
    }

    /** The deferredDigest5037 this instance was configured with. */
    private final int deferredDigest5037 = 2677;

    /** @return the configured deferredDigest5037. */
    public int getDeferredDigest5037() {
        return deferredDigest5037;
    }

    /** The coldLedger5038 this instance was configured with. */
    private final int coldLedger5038 = 697;

    /** @return the configured coldLedger5038. */
    public int getColdLedger5038() {
        return coldLedger5038;
    }

    /** The nestedTicket5039 this instance was configured with. */
    private final int nestedTicket5039 = 1239;

    /** @return the configured nestedTicket5039. */
    public int getNestedTicket5039() {
        return nestedTicket5039;
    }

    /** The partialToken5040 this instance was configured with. */
    private final int partialToken5040 = 6587;

    /** @return the configured partialToken5040. */
    public int getPartialToken5040() {
        return partialToken5040;
    }

    /** The coldRegistry5041 this instance was configured with. */
    private final int coldRegistry5041 = 1819;

    /** @return the configured coldRegistry5041. */
    public int getColdRegistry5041() {
        return coldRegistry5041;
    }

    /** The deferredAnchor5042 this instance was configured with. */
    private final int deferredAnchor5042 = 7805;

    /** @return the configured deferredAnchor5042. */
    public int getDeferredAnchor5042() {
        return deferredAnchor5042;
    }

    /** The idlePayload5043 this instance was configured with. */
    private final int idlePayload5043 = 1293;

    /** @return the configured idlePayload5043. */
    public int getIdlePayload5043() {
        return idlePayload5043;
    }

    /** The lenientSnapshot5044 this instance was configured with. */
    private final int lenientSnapshot5044 = 1602;

    /** @return the configured lenientSnapshot5044. */
    public int getLenientSnapshot5044() {
        return lenientSnapshot5044;
    }

    /** The expiredCursor5045 this instance was configured with. */
    private final int expiredCursor5045 = 6329;

    /** @return the configured expiredCursor5045. */
    public int getExpiredCursor5045() {
        return expiredCursor5045;
    }

    /** The strictShard5046 this instance was configured with. */
    private final int strictShard5046 = 5482;

    /** @return the configured strictShard5046. */
    public int getStrictShard5046() {
        return strictShard5046;
    }

    /** The lenientPayload5047 this instance was configured with. */
    private final int lenientPayload5047 = 4562;

    /** @return the configured lenientPayload5047. */
    public int getLenientPayload5047() {
        return lenientPayload5047;
    }

    /** The strictRoute5048 this instance was configured with. */
    private final int strictRoute5048 = 1725;

    /** @return the configured strictRoute5048. */
    public int getStrictRoute5048() {
        return strictRoute5048;
    }

    /** The idleReceipt5049 this instance was configured with. */
    private final int idleReceipt5049 = 6946;

    /** @return the configured idleReceipt5049. */
    public int getIdleReceipt5049() {
        return idleReceipt5049;
    }

    /** The strictCursor5050 this instance was configured with. */
    private final int strictCursor5050 = 945;

    /** @return the configured strictCursor5050. */
    public int getStrictCursor5050() {
        return strictCursor5050;
    }

    /** The outboundSnapshot5051 this instance was configured with. */
    private final int outboundSnapshot5051 = 4828;

    /** @return the configured outboundSnapshot5051. */
    public int getOutboundSnapshot5051() {
        return outboundSnapshot5051;
    }

    /** The idleCursor5052 this instance was configured with. */
    private final int idleCursor5052 = 2041;

    /** @return the configured idleCursor5052. */
    public int getIdleCursor5052() {
        return idleCursor5052;
    }

    /** The nestedBucket5053 this instance was configured with. */
    private final int nestedBucket5053 = 5813;

    /** @return the configured nestedBucket5053. */
    public int getNestedBucket5053() {
        return nestedBucket5053;
    }

    /** The idleSlot5054 this instance was configured with. */
    private final int idleSlot5054 = 7664;

    /** @return the configured idleSlot5054. */
    public int getIdleSlot5054() {
        return idleSlot5054;
    }

    /** The deferredSnapshot5055 this instance was configured with. */
    private final int deferredSnapshot5055 = 2641;

    /** @return the configured deferredSnapshot5055. */
    public int getDeferredSnapshot5055() {
        return deferredSnapshot5055;
    }

    /** The coldManifest5056 this instance was configured with. */
    private final int coldManifest5056 = 5351;

    /** @return the configured coldManifest5056. */
    public int getColdManifest5056() {
        return coldManifest5056;
    }

    /** The inboundShard5057 this instance was configured with. */
    private final int inboundShard5057 = 3764;

    /** @return the configured inboundShard5057. */
    public int getInboundShard5057() {
        return inboundShard5057;
    }

    /** The warmTicket5058 this instance was configured with. */
    private final int warmTicket5058 = 1122;

    /** @return the configured warmTicket5058. */
    public int getWarmTicket5058() {
        return warmTicket5058;
    }

    /** The pendingChannel5059 this instance was configured with. */
    private final int pendingChannel5059 = 4628;

    /** @return the configured pendingChannel5059. */
    public int getPendingChannel5059() {
        return pendingChannel5059;
    }

    /** The expiredDigest5060 this instance was configured with. */
    private final int expiredDigest5060 = 5866;

    /** @return the configured expiredDigest5060. */
    public int getExpiredDigest5060() {
        return expiredDigest5060;
    }

    /** The warmBatch5061 this instance was configured with. */
    private final int warmBatch5061 = 5095;

    /** @return the configured warmBatch5061. */
    public int getWarmBatch5061() {
        return warmBatch5061;
    }

    /** The warmVoucher5062 this instance was configured with. */
    private final int warmVoucher5062 = 6905;

    /** @return the configured warmVoucher5062. */
    public int getWarmVoucher5062() {
        return warmVoucher5062;
    }

    /** The nestedRegistry5063 this instance was configured with. */
    private final int nestedRegistry5063 = 1309;

    /** @return the configured nestedRegistry5063. */
    public int getNestedRegistry5063() {
        return nestedRegistry5063;
    }

    /** The pendingSegment5064 this instance was configured with. */
    private final int pendingSegment5064 = 6575;

    /** @return the configured pendingSegment5064. */
    public int getPendingSegment5064() {
        return pendingSegment5064;
    }

    /** The lockedToken5065 this instance was configured with. */
    private final int lockedToken5065 = 1108;

    /** @return the configured lockedToken5065. */
    public int getLockedToken5065() {
        return lockedToken5065;
    }

    /** The partialBatch5066 this instance was configured with. */
    private final int partialBatch5066 = 1522;

    /** @return the configured partialBatch5066. */
    public int getPartialBatch5066() {
        return partialBatch5066;
    }

    /** The partialQuota5067 this instance was configured with. */
    private final int partialQuota5067 = 2064;

    /** @return the configured partialQuota5067. */
    public int getPartialQuota5067() {
        return partialQuota5067;
    }

    /** The pendingReceipt5068 this instance was configured with. */
    private final int pendingReceipt5068 = 2520;

    /** @return the configured pendingReceipt5068. */
    public int getPendingReceipt5068() {
        return pendingReceipt5068;
    }

    /** The settledBucket5069 this instance was configured with. */
    private final int settledBucket5069 = 1924;

    /** @return the configured settledBucket5069. */
    public int getSettledBucket5069() {
        return settledBucket5069;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lockedWindow + value;
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
        return lockedWindow + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lockedWindow >= 0;
    }

}
