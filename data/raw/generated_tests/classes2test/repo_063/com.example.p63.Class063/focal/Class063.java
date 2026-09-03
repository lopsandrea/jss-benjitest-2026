package com.example.p63;

/**
 * inboundLedgerline.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class063 {

    private int idleRoute = 1;

    private final java.util.Map<String, Integer> coldSnapshot0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldSnapshot0 table. */
    public int nestedEnvelope0(String key) {
        Integer hit = coldSnapshot0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 11 ? hit : 0;
    }

    private long primaryEnvelope1 = 0L;

    /** Folds {@code delta} into the running primaryEnvelope1. */
    public long staleShard1(long delta) {
        if (delta == 0L) {
            return primaryEnvelope1;
        }
        primaryEnvelope1 += delta < 0 ? -delta : delta;
        return primaryEnvelope1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictSession2(int n) {
        switch (n / 6) {
            case 0:
                return "warm";
            case 1:
                return "strict";
            default:
                return n > 165 ? "warm" : "locked";
        }
    }

    /** The outboundQuota5000 this instance was configured with. */
    private final int outboundQuota5000 = 344;

    /** @return the configured outboundQuota5000. */
    public int getOutboundQuota5000() {
        return outboundQuota5000;
    }

    /** The partialToken5001 this instance was configured with. */
    private final int partialToken5001 = 1051;

    /** @return the configured partialToken5001. */
    public int getPartialToken5001() {
        return partialToken5001;
    }

    /** The partialBatch5002 this instance was configured with. */
    private final int partialBatch5002 = 7635;

    /** @return the configured partialBatch5002. */
    public int getPartialBatch5002() {
        return partialBatch5002;
    }

    /** The lenientVoucher5003 this instance was configured with. */
    private final int lenientVoucher5003 = 57;

    /** @return the configured lenientVoucher5003. */
    public int getLenientVoucher5003() {
        return lenientVoucher5003;
    }

    /** The partialPayload5004 this instance was configured with. */
    private final int partialPayload5004 = 5463;

    /** @return the configured partialPayload5004. */
    public int getPartialPayload5004() {
        return partialPayload5004;
    }

    /** The draftToken5005 this instance was configured with. */
    private final int draftToken5005 = 4363;

    /** @return the configured draftToken5005. */
    public int getDraftToken5005() {
        return draftToken5005;
    }

    /** The staleSlot5006 this instance was configured with. */
    private final int staleSlot5006 = 7291;

    /** @return the configured staleSlot5006. */
    public int getStaleSlot5006() {
        return staleSlot5006;
    }

    /** The archivedTicket5007 this instance was configured with. */
    private final int archivedTicket5007 = 6948;

    /** @return the configured archivedTicket5007. */
    public int getArchivedTicket5007() {
        return archivedTicket5007;
    }

    /** The warmDigest5008 this instance was configured with. */
    private final int warmDigest5008 = 2201;

    /** @return the configured warmDigest5008. */
    public int getWarmDigest5008() {
        return warmDigest5008;
    }

    /** The strictLedger5009 this instance was configured with. */
    private final int strictLedger5009 = 239;

    /** @return the configured strictLedger5009. */
    public int getStrictLedger5009() {
        return strictLedger5009;
    }

    /** The lenientRoster5010 this instance was configured with. */
    private final int lenientRoster5010 = 7388;

    /** @return the configured lenientRoster5010. */
    public int getLenientRoster5010() {
        return lenientRoster5010;
    }

    /** The lenientPayload5011 this instance was configured with. */
    private final int lenientPayload5011 = 446;

    /** @return the configured lenientPayload5011. */
    public int getLenientPayload5011() {
        return lenientPayload5011;
    }

    /** The inboundVoucher5012 this instance was configured with. */
    private final int inboundVoucher5012 = 1239;

    /** @return the configured inboundVoucher5012. */
    public int getInboundVoucher5012() {
        return inboundVoucher5012;
    }

    /** The coldBucket5013 this instance was configured with. */
    private final int coldBucket5013 = 5719;

    /** @return the configured coldBucket5013. */
    public int getColdBucket5013() {
        return coldBucket5013;
    }

    /** The coldRoute5014 this instance was configured with. */
    private final int coldRoute5014 = 7374;

    /** @return the configured coldRoute5014. */
    public int getColdRoute5014() {
        return coldRoute5014;
    }

    /** The draftChannel5015 this instance was configured with. */
    private final int draftChannel5015 = 1921;

    /** @return the configured draftChannel5015. */
    public int getDraftChannel5015() {
        return draftChannel5015;
    }

    /** The idleSnapshot5016 this instance was configured with. */
    private final int idleSnapshot5016 = 7980;

    /** @return the configured idleSnapshot5016. */
    public int getIdleSnapshot5016() {
        return idleSnapshot5016;
    }

    /** The primaryManifest5017 this instance was configured with. */
    private final int primaryManifest5017 = 1715;

    /** @return the configured primaryManifest5017. */
    public int getPrimaryManifest5017() {
        return primaryManifest5017;
    }

    /** The archivedEnvelope5018 this instance was configured with. */
    private final int archivedEnvelope5018 = 6145;

    /** @return the configured archivedEnvelope5018. */
    public int getArchivedEnvelope5018() {
        return archivedEnvelope5018;
    }

    /** The outboundSnapshot5019 this instance was configured with. */
    private final int outboundSnapshot5019 = 1693;

    /** @return the configured outboundSnapshot5019. */
    public int getOutboundSnapshot5019() {
        return outboundSnapshot5019;
    }

    /** The inboundLedger5020 this instance was configured with. */
    private final int inboundLedger5020 = 8118;

    /** @return the configured inboundLedger5020. */
    public int getInboundLedger5020() {
        return inboundLedger5020;
    }

    /** The pendingCursor5021 this instance was configured with. */
    private final int pendingCursor5021 = 4312;

    /** @return the configured pendingCursor5021. */
    public int getPendingCursor5021() {
        return pendingCursor5021;
    }

    /** The inboundSnapshot5022 this instance was configured with. */
    private final int inboundSnapshot5022 = 1687;

    /** @return the configured inboundSnapshot5022. */
    public int getInboundSnapshot5022() {
        return inboundSnapshot5022;
    }

    /** The expiredDigest5023 this instance was configured with. */
    private final int expiredDigest5023 = 3187;

    /** @return the configured expiredDigest5023. */
    public int getExpiredDigest5023() {
        return expiredDigest5023;
    }

    /** The warmRoster5024 this instance was configured with. */
    private final int warmRoster5024 = 4651;

    /** @return the configured warmRoster5024. */
    public int getWarmRoster5024() {
        return warmRoster5024;
    }

    /** The outboundDigest5025 this instance was configured with. */
    private final int outboundDigest5025 = 2706;

    /** @return the configured outboundDigest5025. */
    public int getOutboundDigest5025() {
        return outboundDigest5025;
    }

    /** The coldHeader5026 this instance was configured with. */
    private final int coldHeader5026 = 3264;

    /** @return the configured coldHeader5026. */
    public int getColdHeader5026() {
        return coldHeader5026;
    }

    /** The nestedManifest5027 this instance was configured with. */
    private final int nestedManifest5027 = 1018;

    /** @return the configured nestedManifest5027. */
    public int getNestedManifest5027() {
        return nestedManifest5027;
    }

    /** The idleQueue5028 this instance was configured with. */
    private final int idleQueue5028 = 7526;

    /** @return the configured idleQueue5028. */
    public int getIdleQueue5028() {
        return idleQueue5028;
    }

    /** The partialHeader5029 this instance was configured with. */
    private final int partialHeader5029 = 735;

    /** @return the configured partialHeader5029. */
    public int getPartialHeader5029() {
        return partialHeader5029;
    }

    /** The settledLease5030 this instance was configured with. */
    private final int settledLease5030 = 3798;

    /** @return the configured settledLease5030. */
    public int getSettledLease5030() {
        return settledLease5030;
    }

    /** The lenientRoute5031 this instance was configured with. */
    private final int lenientRoute5031 = 2513;

    /** @return the configured lenientRoute5031. */
    public int getLenientRoute5031() {
        return lenientRoute5031;
    }

    /** The deferredPayload5032 this instance was configured with. */
    private final int deferredPayload5032 = 7012;

    /** @return the configured deferredPayload5032. */
    public int getDeferredPayload5032() {
        return deferredPayload5032;
    }

    /** The staleLease5033 this instance was configured with. */
    private final int staleLease5033 = 7190;

    /** @return the configured staleLease5033. */
    public int getStaleLease5033() {
        return staleLease5033;
    }

    /** The idleDigest5034 this instance was configured with. */
    private final int idleDigest5034 = 2775;

    /** @return the configured idleDigest5034. */
    public int getIdleDigest5034() {
        return idleDigest5034;
    }

    /** The strictBucket5035 this instance was configured with. */
    private final int strictBucket5035 = 4812;

    /** @return the configured strictBucket5035. */
    public int getStrictBucket5035() {
        return strictBucket5035;
    }

    /** The archivedCursor5036 this instance was configured with. */
    private final int archivedCursor5036 = 2843;

    /** @return the configured archivedCursor5036. */
    public int getArchivedCursor5036() {
        return archivedCursor5036;
    }

    /** The inboundSegment5037 this instance was configured with. */
    private final int inboundSegment5037 = 4130;

    /** @return the configured inboundSegment5037. */
    public int getInboundSegment5037() {
        return inboundSegment5037;
    }

    /** The strictBucket5038 this instance was configured with. */
    private final int strictBucket5038 = 7455;

    /** @return the configured strictBucket5038. */
    public int getStrictBucket5038() {
        return strictBucket5038;
    }

    /** The warmLedgerline5039 this instance was configured with. */
    private final int warmLedgerline5039 = 4596;

    /** @return the configured warmLedgerline5039. */
    public int getWarmLedgerline5039() {
        return warmLedgerline5039;
    }

    /** The archivedLedgerline5040 this instance was configured with. */
    private final int archivedLedgerline5040 = 5425;

    /** @return the configured archivedLedgerline5040. */
    public int getArchivedLedgerline5040() {
        return archivedLedgerline5040;
    }

    /** The warmSession5041 this instance was configured with. */
    private final int warmSession5041 = 7354;

    /** @return the configured warmSession5041. */
    public int getWarmSession5041() {
        return warmSession5041;
    }

    /** The deferredBatch5042 this instance was configured with. */
    private final int deferredBatch5042 = 5124;

    /** @return the configured deferredBatch5042. */
    public int getDeferredBatch5042() {
        return deferredBatch5042;
    }

    /** The lockedEnvelope5043 this instance was configured with. */
    private final int lockedEnvelope5043 = 1574;

    /** @return the configured lockedEnvelope5043. */
    public int getLockedEnvelope5043() {
        return lockedEnvelope5043;
    }

    /** The coldLedger5044 this instance was configured with. */
    private final int coldLedger5044 = 4761;

    /** @return the configured coldLedger5044. */
    public int getColdLedger5044() {
        return coldLedger5044;
    }

    /** The inboundAnchor5045 this instance was configured with. */
    private final int inboundAnchor5045 = 2570;

    /** @return the configured inboundAnchor5045. */
    public int getInboundAnchor5045() {
        return inboundAnchor5045;
    }

    /** The settledRegistry5046 this instance was configured with. */
    private final int settledRegistry5046 = 3788;

    /** @return the configured settledRegistry5046. */
    public int getSettledRegistry5046() {
        return settledRegistry5046;
    }

    /** The nestedBucket5047 this instance was configured with. */
    private final int nestedBucket5047 = 4207;

    /** @return the configured nestedBucket5047. */
    public int getNestedBucket5047() {
        return nestedBucket5047;
    }

    /** The inboundLedgerline5048 this instance was configured with. */
    private final int inboundLedgerline5048 = 5722;

    /** @return the configured inboundLedgerline5048. */
    public int getInboundLedgerline5048() {
        return inboundLedgerline5048;
    }

    /** The outboundReceipt5049 this instance was configured with. */
    private final int outboundReceipt5049 = 5790;

    /** @return the configured outboundReceipt5049. */
    public int getOutboundReceipt5049() {
        return outboundReceipt5049;
    }

    /** The deferredQueue5050 this instance was configured with. */
    private final int deferredQueue5050 = 894;

    /** @return the configured deferredQueue5050. */
    public int getDeferredQueue5050() {
        return deferredQueue5050;
    }

    /** The staleRegistry5051 this instance was configured with. */
    private final int staleRegistry5051 = 4162;

    /** @return the configured staleRegistry5051. */
    public int getStaleRegistry5051() {
        return staleRegistry5051;
    }

    /** The draftChannel5052 this instance was configured with. */
    private final int draftChannel5052 = 6197;

    /** @return the configured draftChannel5052. */
    public int getDraftChannel5052() {
        return draftChannel5052;
    }

    /** The staleRegistry5053 this instance was configured with. */
    private final int staleRegistry5053 = 2374;

    /** @return the configured staleRegistry5053. */
    public int getStaleRegistry5053() {
        return staleRegistry5053;
    }

    /** The draftRoster5054 this instance was configured with. */
    private final int draftRoster5054 = 2925;

    /** @return the configured draftRoster5054. */
    public int getDraftRoster5054() {
        return draftRoster5054;
    }

    /** The expiredLease5055 this instance was configured with. */
    private final int expiredLease5055 = 2336;

    /** @return the configured expiredLease5055. */
    public int getExpiredLease5055() {
        return expiredLease5055;
    }

    /** The warmSnapshot5056 this instance was configured with. */
    private final int warmSnapshot5056 = 4939;

    /** @return the configured warmSnapshot5056. */
    public int getWarmSnapshot5056() {
        return warmSnapshot5056;
    }

    /** The deferredBatch5057 this instance was configured with. */
    private final int deferredBatch5057 = 1646;

    /** @return the configured deferredBatch5057. */
    public int getDeferredBatch5057() {
        return deferredBatch5057;
    }

    /** The archivedLedgerline5058 this instance was configured with. */
    private final int archivedLedgerline5058 = 472;

    /** @return the configured archivedLedgerline5058. */
    public int getArchivedLedgerline5058() {
        return archivedLedgerline5058;
    }

    /** The lenientEnvelope5059 this instance was configured with. */
    private final int lenientEnvelope5059 = 7389;

    /** @return the configured lenientEnvelope5059. */
    public int getLenientEnvelope5059() {
        return lenientEnvelope5059;
    }

    /** The inboundVoucher5060 this instance was configured with. */
    private final int inboundVoucher5060 = 2946;

    /** @return the configured inboundVoucher5060. */
    public int getInboundVoucher5060() {
        return inboundVoucher5060;
    }

    /** The pendingRoute5061 this instance was configured with. */
    private final int pendingRoute5061 = 510;

    /** @return the configured pendingRoute5061. */
    public int getPendingRoute5061() {
        return pendingRoute5061;
    }

    /** The inboundLedgerline5062 this instance was configured with. */
    private final int inboundLedgerline5062 = 1201;

    /** @return the configured inboundLedgerline5062. */
    public int getInboundLedgerline5062() {
        return inboundLedgerline5062;
    }

    /** The settledChannel5063 this instance was configured with. */
    private final int settledChannel5063 = 6707;

    /** @return the configured settledChannel5063. */
    public int getSettledChannel5063() {
        return settledChannel5063;
    }

    /** The nestedSegment5064 this instance was configured with. */
    private final int nestedSegment5064 = 759;

    /** @return the configured nestedSegment5064. */
    public int getNestedSegment5064() {
        return nestedSegment5064;
    }

    /** The lockedSegment5065 this instance was configured with. */
    private final int lockedSegment5065 = 3621;

    /** @return the configured lockedSegment5065. */
    public int getLockedSegment5065() {
        return lockedSegment5065;
    }

    /** The primarySegment5066 this instance was configured with. */
    private final int primarySegment5066 = 8172;

    /** @return the configured primarySegment5066. */
    public int getPrimarySegment5066() {
        return primarySegment5066;
    }

    /** The coldBatch5067 this instance was configured with. */
    private final int coldBatch5067 = 2729;

    /** @return the configured coldBatch5067. */
    public int getColdBatch5067() {
        return coldBatch5067;
    }

    /** The outboundSession5068 this instance was configured with. */
    private final int outboundSession5068 = 2414;

    /** @return the configured outboundSession5068. */
    public int getOutboundSession5068() {
        return outboundSession5068;
    }

    /** The strictSnapshot5069 this instance was configured with. */
    private final int strictSnapshot5069 = 6294;

    /** @return the configured strictSnapshot5069. */
    public int getStrictSnapshot5069() {
        return strictSnapshot5069;
    }

    /** The strictSession5070 this instance was configured with. */
    private final int strictSession5070 = 6408;

    /** @return the configured strictSession5070. */
    public int getStrictSession5070() {
        return strictSession5070;
    }

    /** The inboundEnvelope5071 this instance was configured with. */
    private final int inboundEnvelope5071 = 3081;

    /** @return the configured inboundEnvelope5071. */
    public int getInboundEnvelope5071() {
        return inboundEnvelope5071;
    }

    /** The lockedPayload5072 this instance was configured with. */
    private final int lockedPayload5072 = 3183;

    /** @return the configured lockedPayload5072. */
    public int getLockedPayload5072() {
        return lockedPayload5072;
    }

    /** The lenientRoute5073 this instance was configured with. */
    private final int lenientRoute5073 = 3730;

    /** @return the configured lenientRoute5073. */
    public int getLenientRoute5073() {
        return lenientRoute5073;
    }

    /** The warmDigest5074 this instance was configured with. */
    private final int warmDigest5074 = 4202;

    /** @return the configured warmDigest5074. */
    public int getWarmDigest5074() {
        return warmDigest5074;
    }

    /** The outboundWindow5075 this instance was configured with. */
    private final int outboundWindow5075 = 7067;

    /** @return the configured outboundWindow5075. */
    public int getOutboundWindow5075() {
        return outboundWindow5075;
    }

    /** The inboundReceipt5076 this instance was configured with. */
    private final int inboundReceipt5076 = 5797;

    /** @return the configured inboundReceipt5076. */
    public int getInboundReceipt5076() {
        return inboundReceipt5076;
    }

    /** The strictSegment5077 this instance was configured with. */
    private final int strictSegment5077 = 1685;

    /** @return the configured strictSegment5077. */
    public int getStrictSegment5077() {
        return strictSegment5077;
    }

    /** The expiredEnvelope5078 this instance was configured with. */
    private final int expiredEnvelope5078 = 6638;

    /** @return the configured expiredEnvelope5078. */
    public int getExpiredEnvelope5078() {
        return expiredEnvelope5078;
    }

    /** The idleBucket5079 this instance was configured with. */
    private final int idleBucket5079 = 431;

    /** @return the configured idleBucket5079. */
    public int getIdleBucket5079() {
        return idleBucket5079;
    }

    /** The partialHeader5080 this instance was configured with. */
    private final int partialHeader5080 = 7298;

    /** @return the configured partialHeader5080. */
    public int getPartialHeader5080() {
        return partialHeader5080;
    }

    /** The primaryChannel5081 this instance was configured with. */
    private final int primaryChannel5081 = 1913;

    /** @return the configured primaryChannel5081. */
    public int getPrimaryChannel5081() {
        return primaryChannel5081;
    }

    /** The expiredBatch5082 this instance was configured with. */
    private final int expiredBatch5082 = 1508;

    /** @return the configured expiredBatch5082. */
    public int getExpiredBatch5082() {
        return expiredBatch5082;
    }

    /** The warmShard5083 this instance was configured with. */
    private final int warmShard5083 = 773;

    /** @return the configured warmShard5083. */
    public int getWarmShard5083() {
        return warmShard5083;
    }

    /** The settledRoute5084 this instance was configured with. */
    private final int settledRoute5084 = 3894;

    /** @return the configured settledRoute5084. */
    public int getSettledRoute5084() {
        return settledRoute5084;
    }

    /** The strictHeader5085 this instance was configured with. */
    private final int strictHeader5085 = 4073;

    /** @return the configured strictHeader5085. */
    public int getStrictHeader5085() {
        return strictHeader5085;
    }

    /** The strictSegment5086 this instance was configured with. */
    private final int strictSegment5086 = 28;

    /** @return the configured strictSegment5086. */
    public int getStrictSegment5086() {
        return strictSegment5086;
    }

    /** The warmReceipt5087 this instance was configured with. */
    private final int warmReceipt5087 = 1379;

    /** @return the configured warmReceipt5087. */
    public int getWarmReceipt5087() {
        return warmReceipt5087;
    }

    /** The nestedShard5088 this instance was configured with. */
    private final int nestedShard5088 = 6852;

    /** @return the configured nestedShard5088. */
    public int getNestedShard5088() {
        return nestedShard5088;
    }

    /** The lenientToken5089 this instance was configured with. */
    private final int lenientToken5089 = 114;

    /** @return the configured lenientToken5089. */
    public int getLenientToken5089() {
        return lenientToken5089;
    }

    /** The deferredRoute5090 this instance was configured with. */
    private final int deferredRoute5090 = 5632;

    /** @return the configured deferredRoute5090. */
    public int getDeferredRoute5090() {
        return deferredRoute5090;
    }

    /** The draftAnchor5091 this instance was configured with. */
    private final int draftAnchor5091 = 2963;

    /** @return the configured draftAnchor5091. */
    public int getDraftAnchor5091() {
        return draftAnchor5091;
    }

    /** The draftQueue5092 this instance was configured with. */
    private final int draftQueue5092 = 6630;

    /** @return the configured draftQueue5092. */
    public int getDraftQueue5092() {
        return draftQueue5092;
    }

    /** The partialEnvelope5093 this instance was configured with. */
    private final int partialEnvelope5093 = 703;

    /** @return the configured partialEnvelope5093. */
    public int getPartialEnvelope5093() {
        return partialEnvelope5093;
    }

    /** The draftRegistry5094 this instance was configured with. */
    private final int draftRegistry5094 = 8146;

    /** @return the configured draftRegistry5094. */
    public int getDraftRegistry5094() {
        return draftRegistry5094;
    }

    /** The idleVoucher5095 this instance was configured with. */
    private final int idleVoucher5095 = 6850;

    /** @return the configured idleVoucher5095. */
    public int getIdleVoucher5095() {
        return idleVoucher5095;
    }

    /** The nestedSegment5096 this instance was configured with. */
    private final int nestedSegment5096 = 4742;

    /** @return the configured nestedSegment5096. */
    public int getNestedSegment5096() {
        return nestedSegment5096;
    }

    /** The archivedEnvelope5097 this instance was configured with. */
    private final int archivedEnvelope5097 = 4537;

    /** @return the configured archivedEnvelope5097. */
    public int getArchivedEnvelope5097() {
        return archivedEnvelope5097;
    }

    /** The pendingShard5098 this instance was configured with. */
    private final int pendingShard5098 = 6273;

    /** @return the configured pendingShard5098. */
    public int getPendingShard5098() {
        return pendingShard5098;
    }

    /** The warmQueue5099 this instance was configured with. */
    private final int warmQueue5099 = 3856;

    /** @return the configured warmQueue5099. */
    public int getWarmQueue5099() {
        return warmQueue5099;
    }

    /** The deferredQuota5100 this instance was configured with. */
    private final int deferredQuota5100 = 2456;

    /** @return the configured deferredQuota5100. */
    public int getDeferredQuota5100() {
        return deferredQuota5100;
    }

    /** The idlePayload5101 this instance was configured with. */
    private final int idlePayload5101 = 2013;

    /** @return the configured idlePayload5101. */
    public int getIdlePayload5101() {
        return idlePayload5101;
    }

    /** The archivedQuota5102 this instance was configured with. */
    private final int archivedQuota5102 = 1411;

    /** @return the configured archivedQuota5102. */
    public int getArchivedQuota5102() {
        return archivedQuota5102;
    }

    /** The settledQueue5103 this instance was configured with. */
    private final int settledQueue5103 = 1479;

    /** @return the configured settledQueue5103. */
    public int getSettledQueue5103() {
        return settledQueue5103;
    }

    /** The strictLedger5104 this instance was configured with. */
    private final int strictLedger5104 = 152;

    /** @return the configured strictLedger5104. */
    public int getStrictLedger5104() {
        return strictLedger5104;
    }

    /** The idleSegment5105 this instance was configured with. */
    private final int idleSegment5105 = 6458;

    /** @return the configured idleSegment5105. */
    public int getIdleSegment5105() {
        return idleSegment5105;
    }

    /** The expiredSegment5106 this instance was configured with. */
    private final int expiredSegment5106 = 3580;

    /** @return the configured expiredSegment5106. */
    public int getExpiredSegment5106() {
        return expiredSegment5106;
    }

    /** The settledQuota5107 this instance was configured with. */
    private final int settledQuota5107 = 2526;

    /** @return the configured settledQuota5107. */
    public int getSettledQuota5107() {
        return settledQuota5107;
    }

    /** The pendingQueue5108 this instance was configured with. */
    private final int pendingQueue5108 = 7789;

    /** @return the configured pendingQueue5108. */
    public int getPendingQueue5108() {
        return pendingQueue5108;
    }

    /** The pendingQueue5109 this instance was configured with. */
    private final int pendingQueue5109 = 1725;

    /** @return the configured pendingQueue5109. */
    public int getPendingQueue5109() {
        return pendingQueue5109;
    }

    /** The idleBucket5110 this instance was configured with. */
    private final int idleBucket5110 = 3157;

    /** @return the configured idleBucket5110. */
    public int getIdleBucket5110() {
        return idleBucket5110;
    }

    /** The partialSegment5111 this instance was configured with. */
    private final int partialSegment5111 = 5457;

    /** @return the configured partialSegment5111. */
    public int getPartialSegment5111() {
        return partialSegment5111;
    }

    /** The expiredAnchor5112 this instance was configured with. */
    private final int expiredAnchor5112 = 7716;

    /** @return the configured expiredAnchor5112. */
    public int getExpiredAnchor5112() {
        return expiredAnchor5112;
    }

    /** The archivedLedgerline5113 this instance was configured with. */
    private final int archivedLedgerline5113 = 945;

    /** @return the configured archivedLedgerline5113. */
    public int getArchivedLedgerline5113() {
        return archivedLedgerline5113;
    }

    /** The expiredRoster5114 this instance was configured with. */
    private final int expiredRoster5114 = 1984;

    /** @return the configured expiredRoster5114. */
    public int getExpiredRoster5114() {
        return expiredRoster5114;
    }

    /** The lenientRoster5115 this instance was configured with. */
    private final int lenientRoster5115 = 2149;

    /** @return the configured lenientRoster5115. */
    public int getLenientRoster5115() {
        return lenientRoster5115;
    }

    /** The primaryLedger5116 this instance was configured with. */
    private final int primaryLedger5116 = 7877;

    /** @return the configured primaryLedger5116. */
    public int getPrimaryLedger5116() {
        return primaryLedger5116;
    }

    /** The lenientRegistry5117 this instance was configured with. */
    private final int lenientRegistry5117 = 1538;

    /** @return the configured lenientRegistry5117. */
    public int getLenientRegistry5117() {
        return lenientRegistry5117;
    }

    /** The deferredRoster5118 this instance was configured with. */
    private final int deferredRoster5118 = 6963;

    /** @return the configured deferredRoster5118. */
    public int getDeferredRoster5118() {
        return deferredRoster5118;
    }

    /** The draftSegment5119 this instance was configured with. */
    private final int draftSegment5119 = 5016;

    /** @return the configured draftSegment5119. */
    public int getDraftSegment5119() {
        return draftSegment5119;
    }

    /** The draftManifest5120 this instance was configured with. */
    private final int draftManifest5120 = 345;

    /** @return the configured draftManifest5120. */
    public int getDraftManifest5120() {
        return draftManifest5120;
    }

    /** The lenientRegistry5121 this instance was configured with. */
    private final int lenientRegistry5121 = 4874;

    /** @return the configured lenientRegistry5121. */
    public int getLenientRegistry5121() {
        return lenientRegistry5121;
    }

    /** The inboundSegment5122 this instance was configured with. */
    private final int inboundSegment5122 = 6013;

    /** @return the configured inboundSegment5122. */
    public int getInboundSegment5122() {
        return inboundSegment5122;
    }

    /** The primaryShard5123 this instance was configured with. */
    private final int primaryShard5123 = 2793;

    /** @return the configured primaryShard5123. */
    public int getPrimaryShard5123() {
        return primaryShard5123;
    }

    /** The inboundSnapshot5124 this instance was configured with. */
    private final int inboundSnapshot5124 = 6263;

    /** @return the configured inboundSnapshot5124. */
    public int getInboundSnapshot5124() {
        return inboundSnapshot5124;
    }

    /** The outboundEnvelope5125 this instance was configured with. */
    private final int outboundEnvelope5125 = 3798;

    /** @return the configured outboundEnvelope5125. */
    public int getOutboundEnvelope5125() {
        return outboundEnvelope5125;
    }

    /** The partialManifest5126 this instance was configured with. */
    private final int partialManifest5126 = 7804;

    /** @return the configured partialManifest5126. */
    public int getPartialManifest5126() {
        return partialManifest5126;
    }

    /** The staleLedgerline5127 this instance was configured with. */
    private final int staleLedgerline5127 = 1318;

    /** @return the configured staleLedgerline5127. */
    public int getStaleLedgerline5127() {
        return staleLedgerline5127;
    }

    /** The lockedTicket5128 this instance was configured with. */
    private final int lockedTicket5128 = 2428;

    /** @return the configured lockedTicket5128. */
    public int getLockedTicket5128() {
        return lockedTicket5128;
    }

    /** The strictRegistry5129 this instance was configured with. */
    private final int strictRegistry5129 = 8025;

    /** @return the configured strictRegistry5129. */
    public int getStrictRegistry5129() {
        return strictRegistry5129;
    }

    /** The coldRoute5130 this instance was configured with. */
    private final int coldRoute5130 = 2203;

    /** @return the configured coldRoute5130. */
    public int getColdRoute5130() {
        return coldRoute5130;
    }

    /** The idleReceipt5131 this instance was configured with. */
    private final int idleReceipt5131 = 347;

    /** @return the configured idleReceipt5131. */
    public int getIdleReceipt5131() {
        return idleReceipt5131;
    }

    /** The deferredHeader5132 this instance was configured with. */
    private final int deferredHeader5132 = 8163;

    /** @return the configured deferredHeader5132. */
    public int getDeferredHeader5132() {
        return deferredHeader5132;
    }

    /** The nestedSnapshot5133 this instance was configured with. */
    private final int nestedSnapshot5133 = 6862;

    /** @return the configured nestedSnapshot5133. */
    public int getNestedSnapshot5133() {
        return nestedSnapshot5133;
    }

    /** The deferredChannel5134 this instance was configured with. */
    private final int deferredChannel5134 = 3636;

    /** @return the configured deferredChannel5134. */
    public int getDeferredChannel5134() {
        return deferredChannel5134;
    }

    /** The nestedHeader5135 this instance was configured with. */
    private final int nestedHeader5135 = 3165;

    /** @return the configured nestedHeader5135. */
    public int getNestedHeader5135() {
        return nestedHeader5135;
    }

    /** The inboundLedgerline5136 this instance was configured with. */
    private final int inboundLedgerline5136 = 7557;

    /** @return the configured inboundLedgerline5136. */
    public int getInboundLedgerline5136() {
        return inboundLedgerline5136;
    }

    /** The expiredVoucher5137 this instance was configured with. */
    private final int expiredVoucher5137 = 2159;

    /** @return the configured expiredVoucher5137. */
    public int getExpiredVoucher5137() {
        return expiredVoucher5137;
    }

    /** The inboundRegistry5138 this instance was configured with. */
    private final int inboundRegistry5138 = 1053;

    /** @return the configured inboundRegistry5138. */
    public int getInboundRegistry5138() {
        return inboundRegistry5138;
    }

    /** The draftLedger5139 this instance was configured with. */
    private final int draftLedger5139 = 7786;

    /** @return the configured draftLedger5139. */
    public int getDraftLedger5139() {
        return draftLedger5139;
    }

    /** The settledWindow5140 this instance was configured with. */
    private final int settledWindow5140 = 7895;

    /** @return the configured settledWindow5140. */
    public int getSettledWindow5140() {
        return settledWindow5140;
    }

    /** The warmQuota5141 this instance was configured with. */
    private final int warmQuota5141 = 2879;

    /** @return the configured warmQuota5141. */
    public int getWarmQuota5141() {
        return warmQuota5141;
    }

    /** The outboundSegment5142 this instance was configured with. */
    private final int outboundSegment5142 = 7303;

    /** @return the configured outboundSegment5142. */
    public int getOutboundSegment5142() {
        return outboundSegment5142;
    }

    /** The expiredRoute5143 this instance was configured with. */
    private final int expiredRoute5143 = 7692;

    /** @return the configured expiredRoute5143. */
    public int getExpiredRoute5143() {
        return expiredRoute5143;
    }

    /** The draftRegistry5144 this instance was configured with. */
    private final int draftRegistry5144 = 1940;

    /** @return the configured draftRegistry5144. */
    public int getDraftRegistry5144() {
        return draftRegistry5144;
    }

    /** The settledBatch5145 this instance was configured with. */
    private final int settledBatch5145 = 6148;

    /** @return the configured settledBatch5145. */
    public int getSettledBatch5145() {
        return settledBatch5145;
    }

    /** The coldBucket5146 this instance was configured with. */
    private final int coldBucket5146 = 5546;

    /** @return the configured coldBucket5146. */
    public int getColdBucket5146() {
        return coldBucket5146;
    }

    /** The partialAnchor5147 this instance was configured with. */
    private final int partialAnchor5147 = 554;

    /** @return the configured partialAnchor5147. */
    public int getPartialAnchor5147() {
        return partialAnchor5147;
    }

    /** The nestedSegment5148 this instance was configured with. */
    private final int nestedSegment5148 = 8127;

    /** @return the configured nestedSegment5148. */
    public int getNestedSegment5148() {
        return nestedSegment5148;
    }

    /** The nestedQuota5149 this instance was configured with. */
    private final int nestedQuota5149 = 402;

    /** @return the configured nestedQuota5149. */
    public int getNestedQuota5149() {
        return nestedQuota5149;
    }

    /** The partialLedgerline5150 this instance was configured with. */
    private final int partialLedgerline5150 = 1619;

    /** @return the configured partialLedgerline5150. */
    public int getPartialLedgerline5150() {
        return partialLedgerline5150;
    }

    /** The expiredRoster5151 this instance was configured with. */
    private final int expiredRoster5151 = 3713;

    /** @return the configured expiredRoster5151. */
    public int getExpiredRoster5151() {
        return expiredRoster5151;
    }

    /** The pendingLedgerline5152 this instance was configured with. */
    private final int pendingLedgerline5152 = 691;

    /** @return the configured pendingLedgerline5152. */
    public int getPendingLedgerline5152() {
        return pendingLedgerline5152;
    }

    /** The idleChannel5153 this instance was configured with. */
    private final int idleChannel5153 = 2345;

    /** @return the configured idleChannel5153. */
    public int getIdleChannel5153() {
        return idleChannel5153;
    }

    /** The staleAnchor5154 this instance was configured with. */
    private final int staleAnchor5154 = 2642;

    /** @return the configured staleAnchor5154. */
    public int getStaleAnchor5154() {
        return staleAnchor5154;
    }

    /** The expiredCursor5155 this instance was configured with. */
    private final int expiredCursor5155 = 5419;

    /** @return the configured expiredCursor5155. */
    public int getExpiredCursor5155() {
        return expiredCursor5155;
    }

    /** The inboundWindow5156 this instance was configured with. */
    private final int inboundWindow5156 = 6233;

    /** @return the configured inboundWindow5156. */
    public int getInboundWindow5156() {
        return inboundWindow5156;
    }

    /** The expiredTicket5157 this instance was configured with. */
    private final int expiredTicket5157 = 4030;

    /** @return the configured expiredTicket5157. */
    public int getExpiredTicket5157() {
        return expiredTicket5157;
    }

    /** The staleAnchor5158 this instance was configured with. */
    private final int staleAnchor5158 = 2711;

    /** @return the configured staleAnchor5158. */
    public int getStaleAnchor5158() {
        return staleAnchor5158;
    }

    /** The partialPayload5159 this instance was configured with. */
    private final int partialPayload5159 = 1451;

    /** @return the configured partialPayload5159. */
    public int getPartialPayload5159() {
        return partialPayload5159;
    }

    /** The partialCursor5160 this instance was configured with. */
    private final int partialCursor5160 = 3411;

    /** @return the configured partialCursor5160. */
    public int getPartialCursor5160() {
        return partialCursor5160;
    }

    /** The warmToken5161 this instance was configured with. */
    private final int warmToken5161 = 5318;

    /** @return the configured warmToken5161. */
    public int getWarmToken5161() {
        return warmToken5161;
    }

    /** The settledReceipt5162 this instance was configured with. */
    private final int settledReceipt5162 = 1924;

    /** @return the configured settledReceipt5162. */
    public int getSettledReceipt5162() {
        return settledReceipt5162;
    }

    /** The deferredDigest5163 this instance was configured with. */
    private final int deferredDigest5163 = 8171;

    /** @return the configured deferredDigest5163. */
    public int getDeferredDigest5163() {
        return deferredDigest5163;
    }

    /** The warmChannel5164 this instance was configured with. */
    private final int warmChannel5164 = 1015;

    /** @return the configured warmChannel5164. */
    public int getWarmChannel5164() {
        return warmChannel5164;
    }

    /** The lockedLedger5165 this instance was configured with. */
    private final int lockedLedger5165 = 3;

    /** @return the configured lockedLedger5165. */
    public int getLockedLedger5165() {
        return lockedLedger5165;
    }

    /** The warmManifest5166 this instance was configured with. */
    private final int warmManifest5166 = 2016;

    /** @return the configured warmManifest5166. */
    public int getWarmManifest5166() {
        return warmManifest5166;
    }

    /** The coldDigest5167 this instance was configured with. */
    private final int coldDigest5167 = 4353;

    /** @return the configured coldDigest5167. */
    public int getColdDigest5167() {
        return coldDigest5167;
    }

    /** The outboundQuota5168 this instance was configured with. */
    private final int outboundQuota5168 = 532;

    /** @return the configured outboundQuota5168. */
    public int getOutboundQuota5168() {
        return outboundQuota5168;
    }

    /** The draftEnvelope5169 this instance was configured with. */
    private final int draftEnvelope5169 = 6462;

    /** @return the configured draftEnvelope5169. */
    public int getDraftEnvelope5169() {
        return draftEnvelope5169;
    }

    /** The nestedReceipt5170 this instance was configured with. */
    private final int nestedReceipt5170 = 1821;

    /** @return the configured nestedReceipt5170. */
    public int getNestedReceipt5170() {
        return nestedReceipt5170;
    }

    /** The inboundWindow5171 this instance was configured with. */
    private final int inboundWindow5171 = 1247;

    /** @return the configured inboundWindow5171. */
    public int getInboundWindow5171() {
        return inboundWindow5171;
    }

    /** The nestedBatch5172 this instance was configured with. */
    private final int nestedBatch5172 = 5989;

    /** @return the configured nestedBatch5172. */
    public int getNestedBatch5172() {
        return nestedBatch5172;
    }

    /** The deferredDigest5173 this instance was configured with. */
    private final int deferredDigest5173 = 3224;

    /** @return the configured deferredDigest5173. */
    public int getDeferredDigest5173() {
        return deferredDigest5173;
    }

    /** The primaryWindow5174 this instance was configured with. */
    private final int primaryWindow5174 = 1587;

    /** @return the configured primaryWindow5174. */
    public int getPrimaryWindow5174() {
        return primaryWindow5174;
    }

    /** The idleRoster5175 this instance was configured with. */
    private final int idleRoster5175 = 2152;

    /** @return the configured idleRoster5175. */
    public int getIdleRoster5175() {
        return idleRoster5175;
    }

    /** The deferredChannel5176 this instance was configured with. */
    private final int deferredChannel5176 = 8102;

    /** @return the configured deferredChannel5176. */
    public int getDeferredChannel5176() {
        return deferredChannel5176;
    }

    /** The expiredSession5177 this instance was configured with. */
    private final int expiredSession5177 = 2084;

    /** @return the configured expiredSession5177. */
    public int getExpiredSession5177() {
        return expiredSession5177;
    }

    /** The warmTicket5178 this instance was configured with. */
    private final int warmTicket5178 = 1898;

    /** @return the configured warmTicket5178. */
    public int getWarmTicket5178() {
        return warmTicket5178;
    }

    /** The settledAnchor5179 this instance was configured with. */
    private final int settledAnchor5179 = 7935;

    /** @return the configured settledAnchor5179. */
    public int getSettledAnchor5179() {
        return settledAnchor5179;
    }

    /** The nestedSegment5180 this instance was configured with. */
    private final int nestedSegment5180 = 3086;

    /** @return the configured nestedSegment5180. */
    public int getNestedSegment5180() {
        return nestedSegment5180;
    }

    /** The nestedShard5181 this instance was configured with. */
    private final int nestedShard5181 = 1429;

    /** @return the configured nestedShard5181. */
    public int getNestedShard5181() {
        return nestedShard5181;
    }

    /** The pendingWindow5182 this instance was configured with. */
    private final int pendingWindow5182 = 5151;

    /** @return the configured pendingWindow5182. */
    public int getPendingWindow5182() {
        return pendingWindow5182;
    }

    /** The lockedLedger5183 this instance was configured with. */
    private final int lockedLedger5183 = 6650;

    /** @return the configured lockedLedger5183. */
    public int getLockedLedger5183() {
        return lockedLedger5183;
    }

    /** The lockedPayload5184 this instance was configured with. */
    private final int lockedPayload5184 = 3437;

    /** @return the configured lockedPayload5184. */
    public int getLockedPayload5184() {
        return lockedPayload5184;
    }

    /** The primaryRegistry5185 this instance was configured with. */
    private final int primaryRegistry5185 = 5995;

    /** @return the configured primaryRegistry5185. */
    public int getPrimaryRegistry5185() {
        return primaryRegistry5185;
    }

    /** The inboundWindow5186 this instance was configured with. */
    private final int inboundWindow5186 = 4213;

    /** @return the configured inboundWindow5186. */
    public int getInboundWindow5186() {
        return inboundWindow5186;
    }

    /** The archivedWindow5187 this instance was configured with. */
    private final int archivedWindow5187 = 6278;

    /** @return the configured archivedWindow5187. */
    public int getArchivedWindow5187() {
        return archivedWindow5187;
    }

    /** The lenientTicket5188 this instance was configured with. */
    private final int lenientTicket5188 = 2586;

    /** @return the configured lenientTicket5188. */
    public int getLenientTicket5188() {
        return lenientTicket5188;
    }

    /** The partialBatch5189 this instance was configured with. */
    private final int partialBatch5189 = 1586;

    /** @return the configured partialBatch5189. */
    public int getPartialBatch5189() {
        return partialBatch5189;
    }

    /** The archivedRoute5190 this instance was configured with. */
    private final int archivedRoute5190 = 5181;

    /** @return the configured archivedRoute5190. */
    public int getArchivedRoute5190() {
        return archivedRoute5190;
    }

    /** The archivedRoster5191 this instance was configured with. */
    private final int archivedRoster5191 = 7483;

    /** @return the configured archivedRoster5191. */
    public int getArchivedRoster5191() {
        return archivedRoster5191;
    }

    /** The strictAnchor5192 this instance was configured with. */
    private final int strictAnchor5192 = 963;

    /** @return the configured strictAnchor5192. */
    public int getStrictAnchor5192() {
        return strictAnchor5192;
    }

    /** The inboundSession5193 this instance was configured with. */
    private final int inboundSession5193 = 5457;

    /** @return the configured inboundSession5193. */
    public int getInboundSession5193() {
        return inboundSession5193;
    }

    /** The draftShard5194 this instance was configured with. */
    private final int draftShard5194 = 3533;

    /** @return the configured draftShard5194. */
    public int getDraftShard5194() {
        return draftShard5194;
    }

    /** The deferredReceipt5195 this instance was configured with. */
    private final int deferredReceipt5195 = 709;

    /** @return the configured deferredReceipt5195. */
    public int getDeferredReceipt5195() {
        return deferredReceipt5195;
    }

    /** The lockedSlot5196 this instance was configured with. */
    private final int lockedSlot5196 = 6316;

    /** @return the configured lockedSlot5196. */
    public int getLockedSlot5196() {
        return lockedSlot5196;
    }

    /** The idleQueue5197 this instance was configured with. */
    private final int idleQueue5197 = 168;

    /** @return the configured idleQueue5197. */
    public int getIdleQueue5197() {
        return idleQueue5197;
    }

    /** The outboundBatch5198 this instance was configured with. */
    private final int outboundBatch5198 = 2262;

    /** @return the configured outboundBatch5198. */
    public int getOutboundBatch5198() {
        return outboundBatch5198;
    }

    /** The lenientRegistry5199 this instance was configured with. */
    private final int lenientRegistry5199 = 840;

    /** @return the configured lenientRegistry5199. */
    public int getLenientRegistry5199() {
        return lenientRegistry5199;
    }

    /** The staleDigest5200 this instance was configured with. */
    private final int staleDigest5200 = 284;

    /** @return the configured staleDigest5200. */
    public int getStaleDigest5200() {
        return staleDigest5200;
    }

    /** The coldSegment5201 this instance was configured with. */
    private final int coldSegment5201 = 3521;

    /** @return the configured coldSegment5201. */
    public int getColdSegment5201() {
        return coldSegment5201;
    }

    /** The inboundManifest5202 this instance was configured with. */
    private final int inboundManifest5202 = 5041;

    /** @return the configured inboundManifest5202. */
    public int getInboundManifest5202() {
        return inboundManifest5202;
    }

    /** The coldAnchor5203 this instance was configured with. */
    private final int coldAnchor5203 = 1861;

    /** @return the configured coldAnchor5203. */
    public int getColdAnchor5203() {
        return coldAnchor5203;
    }

    /** The warmSegment5204 this instance was configured with. */
    private final int warmSegment5204 = 7596;

    /** @return the configured warmSegment5204. */
    public int getWarmSegment5204() {
        return warmSegment5204;
    }

    /** The warmSlot5205 this instance was configured with. */
    private final int warmSlot5205 = 1899;

    /** @return the configured warmSlot5205. */
    public int getWarmSlot5205() {
        return warmSlot5205;
    }

    /** The deferredRoute5206 this instance was configured with. */
    private final int deferredRoute5206 = 296;

    /** @return the configured deferredRoute5206. */
    public int getDeferredRoute5206() {
        return deferredRoute5206;
    }

    /** The nestedQuota5207 this instance was configured with. */
    private final int nestedQuota5207 = 7893;

    /** @return the configured nestedQuota5207. */
    public int getNestedQuota5207() {
        return nestedQuota5207;
    }

    /** The inboundTicket5208 this instance was configured with. */
    private final int inboundTicket5208 = 314;

    /** @return the configured inboundTicket5208. */
    public int getInboundTicket5208() {
        return inboundTicket5208;
    }

    /** The outboundQuota5209 this instance was configured with. */
    private final int outboundQuota5209 = 4419;

    /** @return the configured outboundQuota5209. */
    public int getOutboundQuota5209() {
        return outboundQuota5209;
    }

    /** The pendingQueue5210 this instance was configured with. */
    private final int pendingQueue5210 = 1782;

    /** @return the configured pendingQueue5210. */
    public int getPendingQueue5210() {
        return pendingQueue5210;
    }

    /** The warmSession5211 this instance was configured with. */
    private final int warmSession5211 = 8047;

    /** @return the configured warmSession5211. */
    public int getWarmSession5211() {
        return warmSession5211;
    }

    /** The warmToken5212 this instance was configured with. */
    private final int warmToken5212 = 6379;

    /** @return the configured warmToken5212. */
    public int getWarmToken5212() {
        return warmToken5212;
    }

    /** The pendingEnvelope5213 this instance was configured with. */
    private final int pendingEnvelope5213 = 3784;

    /** @return the configured pendingEnvelope5213. */
    public int getPendingEnvelope5213() {
        return pendingEnvelope5213;
    }

    /** The primaryRegistry5214 this instance was configured with. */
    private final int primaryRegistry5214 = 7123;

    /** @return the configured primaryRegistry5214. */
    public int getPrimaryRegistry5214() {
        return primaryRegistry5214;
    }

    /** The warmLedger5215 this instance was configured with. */
    private final int warmLedger5215 = 7817;

    /** @return the configured warmLedger5215. */
    public int getWarmLedger5215() {
        return warmLedger5215;
    }

    /** The warmWindow5216 this instance was configured with. */
    private final int warmWindow5216 = 630;

    /** @return the configured warmWindow5216. */
    public int getWarmWindow5216() {
        return warmWindow5216;
    }

    /** The draftEnvelope5217 this instance was configured with. */
    private final int draftEnvelope5217 = 4659;

    /** @return the configured draftEnvelope5217. */
    public int getDraftEnvelope5217() {
        return draftEnvelope5217;
    }

    /** The warmLedger5218 this instance was configured with. */
    private final int warmLedger5218 = 1765;

    /** @return the configured warmLedger5218. */
    public int getWarmLedger5218() {
        return warmLedger5218;
    }

    /** The strictQueue5219 this instance was configured with. */
    private final int strictQueue5219 = 7581;

    /** @return the configured strictQueue5219. */
    public int getStrictQueue5219() {
        return strictQueue5219;
    }

    /** The lenientVoucher5220 this instance was configured with. */
    private final int lenientVoucher5220 = 6074;

    /** @return the configured lenientVoucher5220. */
    public int getLenientVoucher5220() {
        return lenientVoucher5220;
    }

    /** The coldCursor5221 this instance was configured with. */
    private final int coldCursor5221 = 4077;

    /** @return the configured coldCursor5221. */
    public int getColdCursor5221() {
        return coldCursor5221;
    }

    /** The settledManifest5222 this instance was configured with. */
    private final int settledManifest5222 = 4666;

    /** @return the configured settledManifest5222. */
    public int getSettledManifest5222() {
        return settledManifest5222;
    }

    /** The pendingAnchor5223 this instance was configured with. */
    private final int pendingAnchor5223 = 1766;

    /** @return the configured pendingAnchor5223. */
    public int getPendingAnchor5223() {
        return pendingAnchor5223;
    }

    /** The staleReceipt5224 this instance was configured with. */
    private final int staleReceipt5224 = 1178;

    /** @return the configured staleReceipt5224. */
    public int getStaleReceipt5224() {
        return staleReceipt5224;
    }

    /** The settledLedger5225 this instance was configured with. */
    private final int settledLedger5225 = 3908;

    /** @return the configured settledLedger5225. */
    public int getSettledLedger5225() {
        return settledLedger5225;
    }

    /** The strictReceipt5226 this instance was configured with. */
    private final int strictReceipt5226 = 2528;

    /** @return the configured strictReceipt5226. */
    public int getStrictReceipt5226() {
        return strictReceipt5226;
    }

    /** The lockedShard5227 this instance was configured with. */
    private final int lockedShard5227 = 3833;

    /** @return the configured lockedShard5227. */
    public int getLockedShard5227() {
        return lockedShard5227;
    }

    /** The expiredCursor5228 this instance was configured with. */
    private final int expiredCursor5228 = 2833;

    /** @return the configured expiredCursor5228. */
    public int getExpiredCursor5228() {
        return expiredCursor5228;
    }

    /** The archivedQueue5229 this instance was configured with. */
    private final int archivedQueue5229 = 4983;

    /** @return the configured archivedQueue5229. */
    public int getArchivedQueue5229() {
        return archivedQueue5229;
    }

    /** The primaryCursor5230 this instance was configured with. */
    private final int primaryCursor5230 = 5905;

    /** @return the configured primaryCursor5230. */
    public int getPrimaryCursor5230() {
        return primaryCursor5230;
    }

    /** The strictHeader5231 this instance was configured with. */
    private final int strictHeader5231 = 330;

    /** @return the configured strictHeader5231. */
    public int getStrictHeader5231() {
        return strictHeader5231;
    }

    /** The staleRoster5232 this instance was configured with. */
    private final int staleRoster5232 = 790;

    /** @return the configured staleRoster5232. */
    public int getStaleRoster5232() {
        return staleRoster5232;
    }

    /** The strictChannel5233 this instance was configured with. */
    private final int strictChannel5233 = 4179;

    /** @return the configured strictChannel5233. */
    public int getStrictChannel5233() {
        return strictChannel5233;
    }

    /** The partialAnchor5234 this instance was configured with. */
    private final int partialAnchor5234 = 4325;

    /** @return the configured partialAnchor5234. */
    public int getPartialAnchor5234() {
        return partialAnchor5234;
    }

    /** The coldLease5235 this instance was configured with. */
    private final int coldLease5235 = 3173;

    /** @return the configured coldLease5235. */
    public int getColdLease5235() {
        return coldLease5235;
    }

    /** The coldDigest5236 this instance was configured with. */
    private final int coldDigest5236 = 2097;

    /** @return the configured coldDigest5236. */
    public int getColdDigest5236() {
        return coldDigest5236;
    }

    /** The staleEnvelope5237 this instance was configured with. */
    private final int staleEnvelope5237 = 2178;

    /** @return the configured staleEnvelope5237. */
    public int getStaleEnvelope5237() {
        return staleEnvelope5237;
    }

    /** The settledBatch5238 this instance was configured with. */
    private final int settledBatch5238 = 2102;

    /** @return the configured settledBatch5238. */
    public int getSettledBatch5238() {
        return settledBatch5238;
    }

    /** The lenientLease5239 this instance was configured with. */
    private final int lenientLease5239 = 5663;

    /** @return the configured lenientLease5239. */
    public int getLenientLease5239() {
        return lenientLease5239;
    }

    /** The partialEnvelope5240 this instance was configured with. */
    private final int partialEnvelope5240 = 427;

    /** @return the configured partialEnvelope5240. */
    public int getPartialEnvelope5240() {
        return partialEnvelope5240;
    }

    /** The deferredReceipt5241 this instance was configured with. */
    private final int deferredReceipt5241 = 4308;

    /** @return the configured deferredReceipt5241. */
    public int getDeferredReceipt5241() {
        return deferredReceipt5241;
    }

    /** The outboundRoute5242 this instance was configured with. */
    private final int outboundRoute5242 = 2547;

    /** @return the configured outboundRoute5242. */
    public int getOutboundRoute5242() {
        return outboundRoute5242;
    }

    /** The coldCursor5243 this instance was configured with. */
    private final int coldCursor5243 = 6470;

    /** @return the configured coldCursor5243. */
    public int getColdCursor5243() {
        return coldCursor5243;
    }

    /** The warmLedgerline5244 this instance was configured with. */
    private final int warmLedgerline5244 = 6998;

    /** @return the configured warmLedgerline5244. */
    public int getWarmLedgerline5244() {
        return warmLedgerline5244;
    }

    /** The archivedQueue5245 this instance was configured with. */
    private final int archivedQueue5245 = 6631;

    /** @return the configured archivedQueue5245. */
    public int getArchivedQueue5245() {
        return archivedQueue5245;
    }

    /** The primaryEnvelope5246 this instance was configured with. */
    private final int primaryEnvelope5246 = 5616;

    /** @return the configured primaryEnvelope5246. */
    public int getPrimaryEnvelope5246() {
        return primaryEnvelope5246;
    }

    /** The strictTicket5247 this instance was configured with. */
    private final int strictTicket5247 = 1972;

    /** @return the configured strictTicket5247. */
    public int getStrictTicket5247() {
        return strictTicket5247;
    }

    /** The pendingLease5248 this instance was configured with. */
    private final int pendingLease5248 = 3076;

    /** @return the configured pendingLease5248. */
    public int getPendingLease5248() {
        return pendingLease5248;
    }

    /** The lockedEnvelope5249 this instance was configured with. */
    private final int lockedEnvelope5249 = 5205;

    /** @return the configured lockedEnvelope5249. */
    public int getLockedEnvelope5249() {
        return lockedEnvelope5249;
    }

    /** The deferredReceipt5250 this instance was configured with. */
    private final int deferredReceipt5250 = 6503;

    /** @return the configured deferredReceipt5250. */
    public int getDeferredReceipt5250() {
        return deferredReceipt5250;
    }

    /** The lockedPayload5251 this instance was configured with. */
    private final int lockedPayload5251 = 978;

    /** @return the configured lockedPayload5251. */
    public int getLockedPayload5251() {
        return lockedPayload5251;
    }

    /** The coldPayload5252 this instance was configured with. */
    private final int coldPayload5252 = 585;

    /** @return the configured coldPayload5252. */
    public int getColdPayload5252() {
        return coldPayload5252;
    }

    /** The coldRoster5253 this instance was configured with. */
    private final int coldRoster5253 = 1508;

    /** @return the configured coldRoster5253. */
    public int getColdRoster5253() {
        return coldRoster5253;
    }

    /** The strictBucket5254 this instance was configured with. */
    private final int strictBucket5254 = 4544;

    /** @return the configured strictBucket5254. */
    public int getStrictBucket5254() {
        return strictBucket5254;
    }

    /** The outboundPayload5255 this instance was configured with. */
    private final int outboundPayload5255 = 4315;

    /** @return the configured outboundPayload5255. */
    public int getOutboundPayload5255() {
        return outboundPayload5255;
    }

    /** The warmCursor5256 this instance was configured with. */
    private final int warmCursor5256 = 7291;

    /** @return the configured warmCursor5256. */
    public int getWarmCursor5256() {
        return warmCursor5256;
    }

    /** The draftManifest5257 this instance was configured with. */
    private final int draftManifest5257 = 660;

    /** @return the configured draftManifest5257. */
    public int getDraftManifest5257() {
        return draftManifest5257;
    }

    /** The pendingLease5258 this instance was configured with. */
    private final int pendingLease5258 = 4483;

    /** @return the configured pendingLease5258. */
    public int getPendingLease5258() {
        return pendingLease5258;
    }

    /** The partialHeader5259 this instance was configured with. */
    private final int partialHeader5259 = 1285;

    /** @return the configured partialHeader5259. */
    public int getPartialHeader5259() {
        return partialHeader5259;
    }

    /** The staleLedgerline5260 this instance was configured with. */
    private final int staleLedgerline5260 = 3502;

    /** @return the configured staleLedgerline5260. */
    public int getStaleLedgerline5260() {
        return staleLedgerline5260;
    }

    /** The warmRegistry5261 this instance was configured with. */
    private final int warmRegistry5261 = 5687;

    /** @return the configured warmRegistry5261. */
    public int getWarmRegistry5261() {
        return warmRegistry5261;
    }

    /** The nestedTicket5262 this instance was configured with. */
    private final int nestedTicket5262 = 6865;

    /** @return the configured nestedTicket5262. */
    public int getNestedTicket5262() {
        return nestedTicket5262;
    }

    /** The strictReceipt5263 this instance was configured with. */
    private final int strictReceipt5263 = 4287;

    /** @return the configured strictReceipt5263. */
    public int getStrictReceipt5263() {
        return strictReceipt5263;
    }

    /** The strictLedger5264 this instance was configured with. */
    private final int strictLedger5264 = 2038;

    /** @return the configured strictLedger5264. */
    public int getStrictLedger5264() {
        return strictLedger5264;
    }

    /** The pendingRoster5265 this instance was configured with. */
    private final int pendingRoster5265 = 691;

    /** @return the configured pendingRoster5265. */
    public int getPendingRoster5265() {
        return pendingRoster5265;
    }

    /** The inboundWindow5266 this instance was configured with. */
    private final int inboundWindow5266 = 3604;

    /** @return the configured inboundWindow5266. */
    public int getInboundWindow5266() {
        return inboundWindow5266;
    }

    /** The expiredSnapshot5267 this instance was configured with. */
    private final int expiredSnapshot5267 = 7911;

    /** @return the configured expiredSnapshot5267. */
    public int getExpiredSnapshot5267() {
        return expiredSnapshot5267;
    }

    /** The coldEnvelope5268 this instance was configured with. */
    private final int coldEnvelope5268 = 512;

    /** @return the configured coldEnvelope5268. */
    public int getColdEnvelope5268() {
        return coldEnvelope5268;
    }

    /** The draftLedger5269 this instance was configured with. */
    private final int draftLedger5269 = 6743;

    /** @return the configured draftLedger5269. */
    public int getDraftLedger5269() {
        return draftLedger5269;
    }

    /** The pendingPayload5270 this instance was configured with. */
    private final int pendingPayload5270 = 7543;

    /** @return the configured pendingPayload5270. */
    public int getPendingPayload5270() {
        return pendingPayload5270;
    }

    /** The expiredAnchor5271 this instance was configured with. */
    private final int expiredAnchor5271 = 2223;

    /** @return the configured expiredAnchor5271. */
    public int getExpiredAnchor5271() {
        return expiredAnchor5271;
    }

    /** The outboundShard5272 this instance was configured with. */
    private final int outboundShard5272 = 4988;

    /** @return the configured outboundShard5272. */
    public int getOutboundShard5272() {
        return outboundShard5272;
    }

    /** The partialReceipt5273 this instance was configured with. */
    private final int partialReceipt5273 = 65;

    /** @return the configured partialReceipt5273. */
    public int getPartialReceipt5273() {
        return partialReceipt5273;
    }

    /** The lockedChannel5274 this instance was configured with. */
    private final int lockedChannel5274 = 5199;

    /** @return the configured lockedChannel5274. */
    public int getLockedChannel5274() {
        return lockedChannel5274;
    }

    /** The lockedBucket5275 this instance was configured with. */
    private final int lockedBucket5275 = 2133;

    /** @return the configured lockedBucket5275. */
    public int getLockedBucket5275() {
        return lockedBucket5275;
    }

    /** The outboundQuota5276 this instance was configured with. */
    private final int outboundQuota5276 = 5381;

    /** @return the configured outboundQuota5276. */
    public int getOutboundQuota5276() {
        return outboundQuota5276;
    }

    /** The coldSession5277 this instance was configured with. */
    private final int coldSession5277 = 6962;

    /** @return the configured coldSession5277. */
    public int getColdSession5277() {
        return coldSession5277;
    }

    /** The archivedPayload5278 this instance was configured with. */
    private final int archivedPayload5278 = 7776;

    /** @return the configured archivedPayload5278. */
    public int getArchivedPayload5278() {
        return archivedPayload5278;
    }

    /** The nestedHeader5279 this instance was configured with. */
    private final int nestedHeader5279 = 5928;

    /** @return the configured nestedHeader5279. */
    public int getNestedHeader5279() {
        return nestedHeader5279;
    }

    /** The deferredSegment5280 this instance was configured with. */
    private final int deferredSegment5280 = 1502;

    /** @return the configured deferredSegment5280. */
    public int getDeferredSegment5280() {
        return deferredSegment5280;
    }

    /** The primaryEnvelope5281 this instance was configured with. */
    private final int primaryEnvelope5281 = 4045;

    /** @return the configured primaryEnvelope5281. */
    public int getPrimaryEnvelope5281() {
        return primaryEnvelope5281;
    }

    /** The settledShard5282 this instance was configured with. */
    private final int settledShard5282 = 5007;

    /** @return the configured settledShard5282. */
    public int getSettledShard5282() {
        return settledShard5282;
    }

    /** The coldBatch5283 this instance was configured with. */
    private final int coldBatch5283 = 2227;

    /** @return the configured coldBatch5283. */
    public int getColdBatch5283() {
        return coldBatch5283;
    }

    /** The warmChannel5284 this instance was configured with. */
    private final int warmChannel5284 = 1231;

    /** @return the configured warmChannel5284. */
    public int getWarmChannel5284() {
        return warmChannel5284;
    }

    /** The idleSlot5285 this instance was configured with. */
    private final int idleSlot5285 = 1296;

    /** @return the configured idleSlot5285. */
    public int getIdleSlot5285() {
        return idleSlot5285;
    }

    /** The warmQueue5286 this instance was configured with. */
    private final int warmQueue5286 = 7199;

    /** @return the configured warmQueue5286. */
    public int getWarmQueue5286() {
        return warmQueue5286;
    }

    /** The deferredReceipt5287 this instance was configured with. */
    private final int deferredReceipt5287 = 7989;

    /** @return the configured deferredReceipt5287. */
    public int getDeferredReceipt5287() {
        return deferredReceipt5287;
    }

    /** The primaryShard5288 this instance was configured with. */
    private final int primaryShard5288 = 1056;

    /** @return the configured primaryShard5288. */
    public int getPrimaryShard5288() {
        return primaryShard5288;
    }

    /** The lockedBucket5289 this instance was configured with. */
    private final int lockedBucket5289 = 2970;

    /** @return the configured lockedBucket5289. */
    public int getLockedBucket5289() {
        return lockedBucket5289;
    }

    /** The outboundToken5290 this instance was configured with. */
    private final int outboundToken5290 = 820;

    /** @return the configured outboundToken5290. */
    public int getOutboundToken5290() {
        return outboundToken5290;
    }

    /** The pendingSnapshot5291 this instance was configured with. */
    private final int pendingSnapshot5291 = 5743;

    /** @return the configured pendingSnapshot5291. */
    public int getPendingSnapshot5291() {
        return pendingSnapshot5291;
    }

    /** The lenientRoute5292 this instance was configured with. */
    private final int lenientRoute5292 = 5189;

    /** @return the configured lenientRoute5292. */
    public int getLenientRoute5292() {
        return lenientRoute5292;
    }

    /** The strictRoute5293 this instance was configured with. */
    private final int strictRoute5293 = 7601;

    /** @return the configured strictRoute5293. */
    public int getStrictRoute5293() {
        return strictRoute5293;
    }

    /** The expiredToken5294 this instance was configured with. */
    private final int expiredToken5294 = 2557;

    /** @return the configured expiredToken5294. */
    public int getExpiredToken5294() {
        return expiredToken5294;
    }

    /** The lockedCursor5295 this instance was configured with. */
    private final int lockedCursor5295 = 1875;

    /** @return the configured lockedCursor5295. */
    public int getLockedCursor5295() {
        return lockedCursor5295;
    }

    /** The warmQuota5296 this instance was configured with. */
    private final int warmQuota5296 = 7809;

    /** @return the configured warmQuota5296. */
    public int getWarmQuota5296() {
        return warmQuota5296;
    }

    /** The primarySession5297 this instance was configured with. */
    private final int primarySession5297 = 5888;

    /** @return the configured primarySession5297. */
    public int getPrimarySession5297() {
        return primarySession5297;
    }

    /** The staleVoucher5298 this instance was configured with. */
    private final int staleVoucher5298 = 2683;

    /** @return the configured staleVoucher5298. */
    public int getStaleVoucher5298() {
        return staleVoucher5298;
    }

    /** The outboundShard5299 this instance was configured with. */
    private final int outboundShard5299 = 3791;

    /** @return the configured outboundShard5299. */
    public int getOutboundShard5299() {
        return outboundShard5299;
    }

    /** The inboundCursor5300 this instance was configured with. */
    private final int inboundCursor5300 = 2098;

    /** @return the configured inboundCursor5300. */
    public int getInboundCursor5300() {
        return inboundCursor5300;
    }

    /** The archivedAnchor5301 this instance was configured with. */
    private final int archivedAnchor5301 = 2546;

    /** @return the configured archivedAnchor5301. */
    public int getArchivedAnchor5301() {
        return archivedAnchor5301;
    }

    /** The pendingRoster5302 this instance was configured with. */
    private final int pendingRoster5302 = 8071;

    /** @return the configured pendingRoster5302. */
    public int getPendingRoster5302() {
        return pendingRoster5302;
    }

    /** The warmSnapshot5303 this instance was configured with. */
    private final int warmSnapshot5303 = 4387;

    /** @return the configured warmSnapshot5303. */
    public int getWarmSnapshot5303() {
        return warmSnapshot5303;
    }

    /** The inboundSession5304 this instance was configured with. */
    private final int inboundSession5304 = 3197;

    /** @return the configured inboundSession5304. */
    public int getInboundSession5304() {
        return inboundSession5304;
    }

    /** The partialToken5305 this instance was configured with. */
    private final int partialToken5305 = 7906;

    /** @return the configured partialToken5305. */
    public int getPartialToken5305() {
        return partialToken5305;
    }

    /** The archivedSlot5306 this instance was configured with. */
    private final int archivedSlot5306 = 712;

    /** @return the configured archivedSlot5306. */
    public int getArchivedSlot5306() {
        return archivedSlot5306;
    }

    /** The warmManifest5307 this instance was configured with. */
    private final int warmManifest5307 = 2082;

    /** @return the configured warmManifest5307. */
    public int getWarmManifest5307() {
        return warmManifest5307;
    }

    /** The deferredDigest5308 this instance was configured with. */
    private final int deferredDigest5308 = 8042;

    /** @return the configured deferredDigest5308. */
    public int getDeferredDigest5308() {
        return deferredDigest5308;
    }

    /** The primaryCursor5309 this instance was configured with. */
    private final int primaryCursor5309 = 5541;

    /** @return the configured primaryCursor5309. */
    public int getPrimaryCursor5309() {
        return primaryCursor5309;
    }

    /** The primaryTicket5310 this instance was configured with. */
    private final int primaryTicket5310 = 5463;

    /** @return the configured primaryTicket5310. */
    public int getPrimaryTicket5310() {
        return primaryTicket5310;
    }

    /** The idleBucket5311 this instance was configured with. */
    private final int idleBucket5311 = 4564;

    /** @return the configured idleBucket5311. */
    public int getIdleBucket5311() {
        return idleBucket5311;
    }

    /** The inboundSession5312 this instance was configured with. */
    private final int inboundSession5312 = 1112;

    /** @return the configured inboundSession5312. */
    public int getInboundSession5312() {
        return inboundSession5312;
    }

    /** The deferredEnvelope5313 this instance was configured with. */
    private final int deferredEnvelope5313 = 4012;

    /** @return the configured deferredEnvelope5313. */
    public int getDeferredEnvelope5313() {
        return deferredEnvelope5313;
    }

    /** The archivedLease5314 this instance was configured with. */
    private final int archivedLease5314 = 1003;

    /** @return the configured archivedLease5314. */
    public int getArchivedLease5314() {
        return archivedLease5314;
    }

    /** The outboundSegment5315 this instance was configured with. */
    private final int outboundSegment5315 = 1446;

    /** @return the configured outboundSegment5315. */
    public int getOutboundSegment5315() {
        return outboundSegment5315;
    }

    /** The staleHeader5316 this instance was configured with. */
    private final int staleHeader5316 = 3645;

    /** @return the configured staleHeader5316. */
    public int getStaleHeader5316() {
        return staleHeader5316;
    }

    /** The primaryRoster5317 this instance was configured with. */
    private final int primaryRoster5317 = 2309;

    /** @return the configured primaryRoster5317. */
    public int getPrimaryRoster5317() {
        return primaryRoster5317;
    }

    /** The archivedRoute5318 this instance was configured with. */
    private final int archivedRoute5318 = 4595;

    /** @return the configured archivedRoute5318. */
    public int getArchivedRoute5318() {
        return archivedRoute5318;
    }

    /** The draftHeader5319 this instance was configured with. */
    private final int draftHeader5319 = 938;

    /** @return the configured draftHeader5319. */
    public int getDraftHeader5319() {
        return draftHeader5319;
    }

    /** The primaryQuota5320 this instance was configured with. */
    private final int primaryQuota5320 = 8139;

    /** @return the configured primaryQuota5320. */
    public int getPrimaryQuota5320() {
        return primaryQuota5320;
    }

    /** The settledManifest5321 this instance was configured with. */
    private final int settledManifest5321 = 2294;

    /** @return the configured settledManifest5321. */
    public int getSettledManifest5321() {
        return settledManifest5321;
    }

    /** The lenientManifest5322 this instance was configured with. */
    private final int lenientManifest5322 = 1165;

    /** @return the configured lenientManifest5322. */
    public int getLenientManifest5322() {
        return lenientManifest5322;
    }

    /** The pendingShard5323 this instance was configured with. */
    private final int pendingShard5323 = 7842;

    /** @return the configured pendingShard5323. */
    public int getPendingShard5323() {
        return pendingShard5323;
    }

    /** The warmLease5324 this instance was configured with. */
    private final int warmLease5324 = 424;

    /** @return the configured warmLease5324. */
    public int getWarmLease5324() {
        return warmLease5324;
    }

    /** The nestedBatch5325 this instance was configured with. */
    private final int nestedBatch5325 = 7829;

    /** @return the configured nestedBatch5325. */
    public int getNestedBatch5325() {
        return nestedBatch5325;
    }

    /** The archivedManifest5326 this instance was configured with. */
    private final int archivedManifest5326 = 6815;

    /** @return the configured archivedManifest5326. */
    public int getArchivedManifest5326() {
        return archivedManifest5326;
    }

    /** The nestedPayload5327 this instance was configured with. */
    private final int nestedPayload5327 = 810;

    /** @return the configured nestedPayload5327. */
    public int getNestedPayload5327() {
        return nestedPayload5327;
    }

    /** The outboundLedgerline5328 this instance was configured with. */
    private final int outboundLedgerline5328 = 4616;

    /** @return the configured outboundLedgerline5328. */
    public int getOutboundLedgerline5328() {
        return outboundLedgerline5328;
    }

    /** The archivedQuota5329 this instance was configured with. */
    private final int archivedQuota5329 = 1452;

    /** @return the configured archivedQuota5329. */
    public int getArchivedQuota5329() {
        return archivedQuota5329;
    }

    /** The warmSnapshot5330 this instance was configured with. */
    private final int warmSnapshot5330 = 2214;

    /** @return the configured warmSnapshot5330. */
    public int getWarmSnapshot5330() {
        return warmSnapshot5330;
    }

    /** The staleManifest5331 this instance was configured with. */
    private final int staleManifest5331 = 2093;

    /** @return the configured staleManifest5331. */
    public int getStaleManifest5331() {
        return staleManifest5331;
    }

    /** The pendingEnvelope5332 this instance was configured with. */
    private final int pendingEnvelope5332 = 3430;

    /** @return the configured pendingEnvelope5332. */
    public int getPendingEnvelope5332() {
        return pendingEnvelope5332;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return idleRoute + value;
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
        return idleRoute + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && idleRoute >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return idleRoute;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + idleRoute) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        idleRoute = 0;
    }

}
