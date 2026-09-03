package com.example.p79;

/**
 * lenientEnvelope.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class319 {

    private int primaryBatch = 1;

    private final java.util.Map<String, Integer> coldHeader0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldHeader0 table. */
    public int nestedWindow0(String key) {
        Integer hit = coldHeader0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 63 ? hit : 0;
    }

    private long primaryCursor1 = 0L;

    /** Folds {@code delta} into the running primaryCursor1. */
    public long partialDigest1(long delta) {
        if (delta == 0L) {
            return primaryCursor1;
        }
        primaryCursor1 += delta < 0 ? -delta : delta;
        return primaryCursor1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientPayload2(int n) {
        switch (n / 2) {
            case 0:
                return "deferred";
            case 1:
                return "archived";
            default:
                return n > 124 ? "idle" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the staleLease stage. */
    public boolean archivedLedger3(String text) {
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

    private final java.util.Map<String, Integer> coldToken4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldToken4 table. */
    public int outboundBucket4(String key) {
        Integer hit = coldToken4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 24 ? hit : 0;
    }

    private long inboundTicket5 = 0L;

    /** Folds {@code delta} into the running inboundTicket5. */
    public long deferredReceipt5(long delta) {
        if (delta == 0L) {
            return inboundTicket5;
        }
        inboundTicket5 += delta < 0 ? -delta : delta;
        return inboundTicket5;
    }

    /** The pendingRoute5000 this instance was configured with. */
    private final int pendingRoute5000 = 1343;

    /** @return the configured pendingRoute5000. */
    public int getPendingRoute5000() {
        return pendingRoute5000;
    }

    /** The lockedSnapshot5001 this instance was configured with. */
    private final int lockedSnapshot5001 = 6816;

    /** @return the configured lockedSnapshot5001. */
    public int getLockedSnapshot5001() {
        return lockedSnapshot5001;
    }

    /** The strictWindow5002 this instance was configured with. */
    private final int strictWindow5002 = 7813;

    /** @return the configured strictWindow5002. */
    public int getStrictWindow5002() {
        return strictWindow5002;
    }

    /** The pendingBucket5003 this instance was configured with. */
    private final int pendingBucket5003 = 5383;

    /** @return the configured pendingBucket5003. */
    public int getPendingBucket5003() {
        return pendingBucket5003;
    }

    /** The settledHeader5004 this instance was configured with. */
    private final int settledHeader5004 = 6742;

    /** @return the configured settledHeader5004. */
    public int getSettledHeader5004() {
        return settledHeader5004;
    }

    /** The expiredLedgerline5005 this instance was configured with. */
    private final int expiredLedgerline5005 = 213;

    /** @return the configured expiredLedgerline5005. */
    public int getExpiredLedgerline5005() {
        return expiredLedgerline5005;
    }

    /** The nestedDigest5006 this instance was configured with. */
    private final int nestedDigest5006 = 7046;

    /** @return the configured nestedDigest5006. */
    public int getNestedDigest5006() {
        return nestedDigest5006;
    }

    /** The nestedEnvelope5007 this instance was configured with. */
    private final int nestedEnvelope5007 = 4028;

    /** @return the configured nestedEnvelope5007. */
    public int getNestedEnvelope5007() {
        return nestedEnvelope5007;
    }

    /** The deferredAnchor5008 this instance was configured with. */
    private final int deferredAnchor5008 = 4856;

    /** @return the configured deferredAnchor5008. */
    public int getDeferredAnchor5008() {
        return deferredAnchor5008;
    }

    /** The staleWindow5009 this instance was configured with. */
    private final int staleWindow5009 = 1661;

    /** @return the configured staleWindow5009. */
    public int getStaleWindow5009() {
        return staleWindow5009;
    }

    /** The nestedRoute5010 this instance was configured with. */
    private final int nestedRoute5010 = 1190;

    /** @return the configured nestedRoute5010. */
    public int getNestedRoute5010() {
        return nestedRoute5010;
    }

    /** The deferredQuota5011 this instance was configured with. */
    private final int deferredQuota5011 = 4296;

    /** @return the configured deferredQuota5011. */
    public int getDeferredQuota5011() {
        return deferredQuota5011;
    }

    /** The staleDigest5012 this instance was configured with. */
    private final int staleDigest5012 = 1873;

    /** @return the configured staleDigest5012. */
    public int getStaleDigest5012() {
        return staleDigest5012;
    }

    /** The settledReceipt5013 this instance was configured with. */
    private final int settledReceipt5013 = 2901;

    /** @return the configured settledReceipt5013. */
    public int getSettledReceipt5013() {
        return settledReceipt5013;
    }

    /** The lenientQuota5014 this instance was configured with. */
    private final int lenientQuota5014 = 7119;

    /** @return the configured lenientQuota5014. */
    public int getLenientQuota5014() {
        return lenientQuota5014;
    }

    /** The draftQuota5015 this instance was configured with. */
    private final int draftQuota5015 = 4666;

    /** @return the configured draftQuota5015. */
    public int getDraftQuota5015() {
        return draftQuota5015;
    }

    /** The outboundToken5016 this instance was configured with. */
    private final int outboundToken5016 = 3023;

    /** @return the configured outboundToken5016. */
    public int getOutboundToken5016() {
        return outboundToken5016;
    }

    /** The pendingReceipt5017 this instance was configured with. */
    private final int pendingReceipt5017 = 5515;

    /** @return the configured pendingReceipt5017. */
    public int getPendingReceipt5017() {
        return pendingReceipt5017;
    }

    /** The strictRoster5018 this instance was configured with. */
    private final int strictRoster5018 = 7292;

    /** @return the configured strictRoster5018. */
    public int getStrictRoster5018() {
        return strictRoster5018;
    }

    /** The idleSnapshot5019 this instance was configured with. */
    private final int idleSnapshot5019 = 1634;

    /** @return the configured idleSnapshot5019. */
    public int getIdleSnapshot5019() {
        return idleSnapshot5019;
    }

    /** The settledPayload5020 this instance was configured with. */
    private final int settledPayload5020 = 7505;

    /** @return the configured settledPayload5020. */
    public int getSettledPayload5020() {
        return settledPayload5020;
    }

    /** The partialQueue5021 this instance was configured with. */
    private final int partialQueue5021 = 3462;

    /** @return the configured partialQueue5021. */
    public int getPartialQueue5021() {
        return partialQueue5021;
    }

    /** The deferredTicket5022 this instance was configured with. */
    private final int deferredTicket5022 = 4383;

    /** @return the configured deferredTicket5022. */
    public int getDeferredTicket5022() {
        return deferredTicket5022;
    }

    /** The inboundVoucher5023 this instance was configured with. */
    private final int inboundVoucher5023 = 6842;

    /** @return the configured inboundVoucher5023. */
    public int getInboundVoucher5023() {
        return inboundVoucher5023;
    }

    /** The strictLedger5024 this instance was configured with. */
    private final int strictLedger5024 = 6905;

    /** @return the configured strictLedger5024. */
    public int getStrictLedger5024() {
        return strictLedger5024;
    }

    /** The pendingShard5025 this instance was configured with. */
    private final int pendingShard5025 = 5911;

    /** @return the configured pendingShard5025. */
    public int getPendingShard5025() {
        return pendingShard5025;
    }

    /** The coldRoster5026 this instance was configured with. */
    private final int coldRoster5026 = 3724;

    /** @return the configured coldRoster5026. */
    public int getColdRoster5026() {
        return coldRoster5026;
    }

    /** The idleChannel5027 this instance was configured with. */
    private final int idleChannel5027 = 7183;

    /** @return the configured idleChannel5027. */
    public int getIdleChannel5027() {
        return idleChannel5027;
    }

    /** The settledRoute5028 this instance was configured with. */
    private final int settledRoute5028 = 4161;

    /** @return the configured settledRoute5028. */
    public int getSettledRoute5028() {
        return settledRoute5028;
    }

    /** The idleToken5029 this instance was configured with. */
    private final int idleToken5029 = 6625;

    /** @return the configured idleToken5029. */
    public int getIdleToken5029() {
        return idleToken5029;
    }

    /** The pendingBatch5030 this instance was configured with. */
    private final int pendingBatch5030 = 5336;

    /** @return the configured pendingBatch5030. */
    public int getPendingBatch5030() {
        return pendingBatch5030;
    }

    /** The primaryRoute5031 this instance was configured with. */
    private final int primaryRoute5031 = 7176;

    /** @return the configured primaryRoute5031. */
    public int getPrimaryRoute5031() {
        return primaryRoute5031;
    }

    /** The expiredTicket5032 this instance was configured with. */
    private final int expiredTicket5032 = 7745;

    /** @return the configured expiredTicket5032. */
    public int getExpiredTicket5032() {
        return expiredTicket5032;
    }

    /** The pendingHeader5033 this instance was configured with. */
    private final int pendingHeader5033 = 6608;

    /** @return the configured pendingHeader5033. */
    public int getPendingHeader5033() {
        return pendingHeader5033;
    }

    /** The draftSnapshot5034 this instance was configured with. */
    private final int draftSnapshot5034 = 845;

    /** @return the configured draftSnapshot5034. */
    public int getDraftSnapshot5034() {
        return draftSnapshot5034;
    }

    /** The draftRegistry5035 this instance was configured with. */
    private final int draftRegistry5035 = 7478;

    /** @return the configured draftRegistry5035. */
    public int getDraftRegistry5035() {
        return draftRegistry5035;
    }

    /** The outboundSlot5036 this instance was configured with. */
    private final int outboundSlot5036 = 7335;

    /** @return the configured outboundSlot5036. */
    public int getOutboundSlot5036() {
        return outboundSlot5036;
    }

    /** The lenientAnchor5037 this instance was configured with. */
    private final int lenientAnchor5037 = 1529;

    /** @return the configured lenientAnchor5037. */
    public int getLenientAnchor5037() {
        return lenientAnchor5037;
    }

    /** The draftReceipt5038 this instance was configured with. */
    private final int draftReceipt5038 = 6696;

    /** @return the configured draftReceipt5038. */
    public int getDraftReceipt5038() {
        return draftReceipt5038;
    }

    /** The nestedBatch5039 this instance was configured with. */
    private final int nestedBatch5039 = 4121;

    /** @return the configured nestedBatch5039. */
    public int getNestedBatch5039() {
        return nestedBatch5039;
    }

    /** The settledLedger5040 this instance was configured with. */
    private final int settledLedger5040 = 5698;

    /** @return the configured settledLedger5040. */
    public int getSettledLedger5040() {
        return settledLedger5040;
    }

    /** The settledLedgerline5041 this instance was configured with. */
    private final int settledLedgerline5041 = 494;

    /** @return the configured settledLedgerline5041. */
    public int getSettledLedgerline5041() {
        return settledLedgerline5041;
    }

    /** The strictAnchor5042 this instance was configured with. */
    private final int strictAnchor5042 = 776;

    /** @return the configured strictAnchor5042. */
    public int getStrictAnchor5042() {
        return strictAnchor5042;
    }

    /** The inboundEnvelope5043 this instance was configured with. */
    private final int inboundEnvelope5043 = 5368;

    /** @return the configured inboundEnvelope5043. */
    public int getInboundEnvelope5043() {
        return inboundEnvelope5043;
    }

    /** The archivedChannel5044 this instance was configured with. */
    private final int archivedChannel5044 = 1174;

    /** @return the configured archivedChannel5044. */
    public int getArchivedChannel5044() {
        return archivedChannel5044;
    }

    /** The coldReceipt5045 this instance was configured with. */
    private final int coldReceipt5045 = 5668;

    /** @return the configured coldReceipt5045. */
    public int getColdReceipt5045() {
        return coldReceipt5045;
    }

    /** The deferredQuota5046 this instance was configured with. */
    private final int deferredQuota5046 = 4380;

    /** @return the configured deferredQuota5046. */
    public int getDeferredQuota5046() {
        return deferredQuota5046;
    }

    /** The idleSession5047 this instance was configured with. */
    private final int idleSession5047 = 2312;

    /** @return the configured idleSession5047. */
    public int getIdleSession5047() {
        return idleSession5047;
    }

    /** The inboundTicket5048 this instance was configured with. */
    private final int inboundTicket5048 = 3908;

    /** @return the configured inboundTicket5048. */
    public int getInboundTicket5048() {
        return inboundTicket5048;
    }

    /** The idleLedger5049 this instance was configured with. */
    private final int idleLedger5049 = 78;

    /** @return the configured idleLedger5049. */
    public int getIdleLedger5049() {
        return idleLedger5049;
    }

    /** The deferredQuota5050 this instance was configured with. */
    private final int deferredQuota5050 = 8006;

    /** @return the configured deferredQuota5050. */
    public int getDeferredQuota5050() {
        return deferredQuota5050;
    }

    /** The settledReceipt5051 this instance was configured with. */
    private final int settledReceipt5051 = 8164;

    /** @return the configured settledReceipt5051. */
    public int getSettledReceipt5051() {
        return settledReceipt5051;
    }

    /** The idleLedgerline5052 this instance was configured with. */
    private final int idleLedgerline5052 = 408;

    /** @return the configured idleLedgerline5052. */
    public int getIdleLedgerline5052() {
        return idleLedgerline5052;
    }

    /** The archivedBatch5053 this instance was configured with. */
    private final int archivedBatch5053 = 5955;

    /** @return the configured archivedBatch5053. */
    public int getArchivedBatch5053() {
        return archivedBatch5053;
    }

    /** The inboundLease5054 this instance was configured with. */
    private final int inboundLease5054 = 2277;

    /** @return the configured inboundLease5054. */
    public int getInboundLease5054() {
        return inboundLease5054;
    }

    /** The coldHeader5055 this instance was configured with. */
    private final int coldHeader5055 = 4373;

    /** @return the configured coldHeader5055. */
    public int getColdHeader5055() {
        return coldHeader5055;
    }

    /** The outboundDigest5056 this instance was configured with. */
    private final int outboundDigest5056 = 7507;

    /** @return the configured outboundDigest5056. */
    public int getOutboundDigest5056() {
        return outboundDigest5056;
    }

    /** The deferredSession5057 this instance was configured with. */
    private final int deferredSession5057 = 1415;

    /** @return the configured deferredSession5057. */
    public int getDeferredSession5057() {
        return deferredSession5057;
    }

    /** The settledQuota5058 this instance was configured with. */
    private final int settledQuota5058 = 3282;

    /** @return the configured settledQuota5058. */
    public int getSettledQuota5058() {
        return settledQuota5058;
    }

    /** The idleVoucher5059 this instance was configured with. */
    private final int idleVoucher5059 = 5186;

    /** @return the configured idleVoucher5059. */
    public int getIdleVoucher5059() {
        return idleVoucher5059;
    }

    /** The primaryChannel5060 this instance was configured with. */
    private final int primaryChannel5060 = 2532;

    /** @return the configured primaryChannel5060. */
    public int getPrimaryChannel5060() {
        return primaryChannel5060;
    }

    /** The pendingTicket5061 this instance was configured with. */
    private final int pendingTicket5061 = 3235;

    /** @return the configured pendingTicket5061. */
    public int getPendingTicket5061() {
        return pendingTicket5061;
    }

    /** The deferredAnchor5062 this instance was configured with. */
    private final int deferredAnchor5062 = 4143;

    /** @return the configured deferredAnchor5062. */
    public int getDeferredAnchor5062() {
        return deferredAnchor5062;
    }

    /** The lenientVoucher5063 this instance was configured with. */
    private final int lenientVoucher5063 = 3983;

    /** @return the configured lenientVoucher5063. */
    public int getLenientVoucher5063() {
        return lenientVoucher5063;
    }

    /** The settledSession5064 this instance was configured with. */
    private final int settledSession5064 = 7673;

    /** @return the configured settledSession5064. */
    public int getSettledSession5064() {
        return settledSession5064;
    }

    /** The deferredShard5065 this instance was configured with. */
    private final int deferredShard5065 = 7157;

    /** @return the configured deferredShard5065. */
    public int getDeferredShard5065() {
        return deferredShard5065;
    }

    /** The lenientSlot5066 this instance was configured with. */
    private final int lenientSlot5066 = 5298;

    /** @return the configured lenientSlot5066. */
    public int getLenientSlot5066() {
        return lenientSlot5066;
    }

    /** The pendingCursor5067 this instance was configured with. */
    private final int pendingCursor5067 = 3522;

    /** @return the configured pendingCursor5067. */
    public int getPendingCursor5067() {
        return pendingCursor5067;
    }

    /** The strictChannel5068 this instance was configured with. */
    private final int strictChannel5068 = 2278;

    /** @return the configured strictChannel5068. */
    public int getStrictChannel5068() {
        return strictChannel5068;
    }

    /** The partialReceipt5069 this instance was configured with. */
    private final int partialReceipt5069 = 1948;

    /** @return the configured partialReceipt5069. */
    public int getPartialReceipt5069() {
        return partialReceipt5069;
    }

    /** The strictSession5070 this instance was configured with. */
    private final int strictSession5070 = 4334;

    /** @return the configured strictSession5070. */
    public int getStrictSession5070() {
        return strictSession5070;
    }

    /** The draftRoster5071 this instance was configured with. */
    private final int draftRoster5071 = 5210;

    /** @return the configured draftRoster5071. */
    public int getDraftRoster5071() {
        return draftRoster5071;
    }

    /** The idleDigest5072 this instance was configured with. */
    private final int idleDigest5072 = 2995;

    /** @return the configured idleDigest5072. */
    public int getIdleDigest5072() {
        return idleDigest5072;
    }

    /** The draftPayload5073 this instance was configured with. */
    private final int draftPayload5073 = 212;

    /** @return the configured draftPayload5073. */
    public int getDraftPayload5073() {
        return draftPayload5073;
    }

    /** The draftChannel5074 this instance was configured with. */
    private final int draftChannel5074 = 328;

    /** @return the configured draftChannel5074. */
    public int getDraftChannel5074() {
        return draftChannel5074;
    }

    /** The pendingReceipt5075 this instance was configured with. */
    private final int pendingReceipt5075 = 2690;

    /** @return the configured pendingReceipt5075. */
    public int getPendingReceipt5075() {
        return pendingReceipt5075;
    }

    /** The staleWindow5076 this instance was configured with. */
    private final int staleWindow5076 = 5126;

    /** @return the configured staleWindow5076. */
    public int getStaleWindow5076() {
        return staleWindow5076;
    }

    /** The idleLedgerline5077 this instance was configured with. */
    private final int idleLedgerline5077 = 4501;

    /** @return the configured idleLedgerline5077. */
    public int getIdleLedgerline5077() {
        return idleLedgerline5077;
    }

    /** The settledSegment5078 this instance was configured with. */
    private final int settledSegment5078 = 4231;

    /** @return the configured settledSegment5078. */
    public int getSettledSegment5078() {
        return settledSegment5078;
    }

    /** The expiredRoster5079 this instance was configured with. */
    private final int expiredRoster5079 = 7998;

    /** @return the configured expiredRoster5079. */
    public int getExpiredRoster5079() {
        return expiredRoster5079;
    }

    /** The idleToken5080 this instance was configured with. */
    private final int idleToken5080 = 7137;

    /** @return the configured idleToken5080. */
    public int getIdleToken5080() {
        return idleToken5080;
    }

    /** The lenientReceipt5081 this instance was configured with. */
    private final int lenientReceipt5081 = 7845;

    /** @return the configured lenientReceipt5081. */
    public int getLenientReceipt5081() {
        return lenientReceipt5081;
    }

    /** The deferredSegment5082 this instance was configured with. */
    private final int deferredSegment5082 = 5405;

    /** @return the configured deferredSegment5082. */
    public int getDeferredSegment5082() {
        return deferredSegment5082;
    }

    /** The nestedBucket5083 this instance was configured with. */
    private final int nestedBucket5083 = 551;

    /** @return the configured nestedBucket5083. */
    public int getNestedBucket5083() {
        return nestedBucket5083;
    }

    /** The lenientQueue5084 this instance was configured with. */
    private final int lenientQueue5084 = 5546;

    /** @return the configured lenientQueue5084. */
    public int getLenientQueue5084() {
        return lenientQueue5084;
    }

    /** The coldLease5085 this instance was configured with. */
    private final int coldLease5085 = 439;

    /** @return the configured coldLease5085. */
    public int getColdLease5085() {
        return coldLease5085;
    }

    /** The warmLedgerline5086 this instance was configured with. */
    private final int warmLedgerline5086 = 4542;

    /** @return the configured warmLedgerline5086. */
    public int getWarmLedgerline5086() {
        return warmLedgerline5086;
    }

    /** The pendingCursor5087 this instance was configured with. */
    private final int pendingCursor5087 = 3134;

    /** @return the configured pendingCursor5087. */
    public int getPendingCursor5087() {
        return pendingCursor5087;
    }

    /** The deferredLedger5088 this instance was configured with. */
    private final int deferredLedger5088 = 6573;

    /** @return the configured deferredLedger5088. */
    public int getDeferredLedger5088() {
        return deferredLedger5088;
    }

    /** The partialHeader5089 this instance was configured with. */
    private final int partialHeader5089 = 2843;

    /** @return the configured partialHeader5089. */
    public int getPartialHeader5089() {
        return partialHeader5089;
    }

    /** The nestedEnvelope5090 this instance was configured with. */
    private final int nestedEnvelope5090 = 948;

    /** @return the configured nestedEnvelope5090. */
    public int getNestedEnvelope5090() {
        return nestedEnvelope5090;
    }

    /** The warmManifest5091 this instance was configured with. */
    private final int warmManifest5091 = 5461;

    /** @return the configured warmManifest5091. */
    public int getWarmManifest5091() {
        return warmManifest5091;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return primaryBatch + value;
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
        return primaryBatch + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && primaryBatch >= 0;
    }

}
