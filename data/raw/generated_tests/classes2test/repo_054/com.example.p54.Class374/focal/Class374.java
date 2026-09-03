package com.example.p54;

/**
 * draftQueue.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class374 {

    private int outboundRegistry = 1;

    private final java.util.Map<String, Integer> archivedLedgerline0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedLedgerline0 table. */
    public int warmRegistry0(String key) {
        Integer hit = archivedLedgerline0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 70 ? hit : 0;
    }

    private long settledHeader1 = 0L;

    /** Folds {@code delta} into the running settledHeader1. */
    public long primarySession1(long delta) {
        if (delta == 0L) {
            return settledHeader1;
        }
        settledHeader1 += delta < 0 ? -delta : delta;
        return settledHeader1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientCursor2(int n) {
        switch (n / 3) {
            case 0:
                return "expired";
            case 1:
                return "deferred";
            default:
                return n > 166 ? "locked" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the nestedTicket stage. */
    public boolean nestedAnchor3(String text) {
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

    private final java.util.Map<String, Integer> warmShard4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmShard4 table. */
    public int coldLease4(String key) {
        Integer hit = warmShard4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 41 ? hit : 0;
    }

    /** The expiredDigest5000 this instance was configured with. */
    private final int expiredDigest5000 = 1863;

    /** @return the configured expiredDigest5000. */
    public int getExpiredDigest5000() {
        return expiredDigest5000;
    }

    /** The inboundWindow5001 this instance was configured with. */
    private final int inboundWindow5001 = 5628;

    /** @return the configured inboundWindow5001. */
    public int getInboundWindow5001() {
        return inboundWindow5001;
    }

    /** The partialTicket5002 this instance was configured with. */
    private final int partialTicket5002 = 2174;

    /** @return the configured partialTicket5002. */
    public int getPartialTicket5002() {
        return partialTicket5002;
    }

    /** The settledLedgerline5003 this instance was configured with. */
    private final int settledLedgerline5003 = 5635;

    /** @return the configured settledLedgerline5003. */
    public int getSettledLedgerline5003() {
        return settledLedgerline5003;
    }

    /** The strictCursor5004 this instance was configured with. */
    private final int strictCursor5004 = 1880;

    /** @return the configured strictCursor5004. */
    public int getStrictCursor5004() {
        return strictCursor5004;
    }

    /** The settledBucket5005 this instance was configured with. */
    private final int settledBucket5005 = 7112;

    /** @return the configured settledBucket5005. */
    public int getSettledBucket5005() {
        return settledBucket5005;
    }

    /** The lenientLedgerline5006 this instance was configured with. */
    private final int lenientLedgerline5006 = 6480;

    /** @return the configured lenientLedgerline5006. */
    public int getLenientLedgerline5006() {
        return lenientLedgerline5006;
    }

    /** The partialManifest5007 this instance was configured with. */
    private final int partialManifest5007 = 4010;

    /** @return the configured partialManifest5007. */
    public int getPartialManifest5007() {
        return partialManifest5007;
    }

    /** The strictLedgerline5008 this instance was configured with. */
    private final int strictLedgerline5008 = 5805;

    /** @return the configured strictLedgerline5008. */
    public int getStrictLedgerline5008() {
        return strictLedgerline5008;
    }

    /** The nestedRoster5009 this instance was configured with. */
    private final int nestedRoster5009 = 2222;

    /** @return the configured nestedRoster5009. */
    public int getNestedRoster5009() {
        return nestedRoster5009;
    }

    /** The staleQueue5010 this instance was configured with. */
    private final int staleQueue5010 = 4779;

    /** @return the configured staleQueue5010. */
    public int getStaleQueue5010() {
        return staleQueue5010;
    }

    /** The lockedTicket5011 this instance was configured with. */
    private final int lockedTicket5011 = 4196;

    /** @return the configured lockedTicket5011. */
    public int getLockedTicket5011() {
        return lockedTicket5011;
    }

    /** The draftQueue5012 this instance was configured with. */
    private final int draftQueue5012 = 2614;

    /** @return the configured draftQueue5012. */
    public int getDraftQueue5012() {
        return draftQueue5012;
    }

    /** The draftSnapshot5013 this instance was configured with. */
    private final int draftSnapshot5013 = 6030;

    /** @return the configured draftSnapshot5013. */
    public int getDraftSnapshot5013() {
        return draftSnapshot5013;
    }

    /** The expiredBatch5014 this instance was configured with. */
    private final int expiredBatch5014 = 4954;

    /** @return the configured expiredBatch5014. */
    public int getExpiredBatch5014() {
        return expiredBatch5014;
    }

    /** The partialSlot5015 this instance was configured with. */
    private final int partialSlot5015 = 7198;

    /** @return the configured partialSlot5015. */
    public int getPartialSlot5015() {
        return partialSlot5015;
    }

    /** The strictTicket5016 this instance was configured with. */
    private final int strictTicket5016 = 7015;

    /** @return the configured strictTicket5016. */
    public int getStrictTicket5016() {
        return strictTicket5016;
    }

    /** The inboundQuota5017 this instance was configured with. */
    private final int inboundQuota5017 = 2181;

    /** @return the configured inboundQuota5017. */
    public int getInboundQuota5017() {
        return inboundQuota5017;
    }

    /** The partialToken5018 this instance was configured with. */
    private final int partialToken5018 = 1884;

    /** @return the configured partialToken5018. */
    public int getPartialToken5018() {
        return partialToken5018;
    }

    /** The strictCursor5019 this instance was configured with. */
    private final int strictCursor5019 = 1827;

    /** @return the configured strictCursor5019. */
    public int getStrictCursor5019() {
        return strictCursor5019;
    }

    /** The lenientBucket5020 this instance was configured with. */
    private final int lenientBucket5020 = 5493;

    /** @return the configured lenientBucket5020. */
    public int getLenientBucket5020() {
        return lenientBucket5020;
    }

    /** The pendingRegistry5021 this instance was configured with. */
    private final int pendingRegistry5021 = 6451;

    /** @return the configured pendingRegistry5021. */
    public int getPendingRegistry5021() {
        return pendingRegistry5021;
    }

    /** The lenientQuota5022 this instance was configured with. */
    private final int lenientQuota5022 = 3582;

    /** @return the configured lenientQuota5022. */
    public int getLenientQuota5022() {
        return lenientQuota5022;
    }

    /** The pendingLease5023 this instance was configured with. */
    private final int pendingLease5023 = 5126;

    /** @return the configured pendingLease5023. */
    public int getPendingLease5023() {
        return pendingLease5023;
    }

    /** The partialAnchor5024 this instance was configured with. */
    private final int partialAnchor5024 = 3118;

    /** @return the configured partialAnchor5024. */
    public int getPartialAnchor5024() {
        return partialAnchor5024;
    }

    /** The staleRoster5025 this instance was configured with. */
    private final int staleRoster5025 = 3400;

    /** @return the configured staleRoster5025. */
    public int getStaleRoster5025() {
        return staleRoster5025;
    }

    /** The draftVoucher5026 this instance was configured with. */
    private final int draftVoucher5026 = 1481;

    /** @return the configured draftVoucher5026. */
    public int getDraftVoucher5026() {
        return draftVoucher5026;
    }

    /** The strictBatch5027 this instance was configured with. */
    private final int strictBatch5027 = 72;

    /** @return the configured strictBatch5027. */
    public int getStrictBatch5027() {
        return strictBatch5027;
    }

    /** The nestedEnvelope5028 this instance was configured with. */
    private final int nestedEnvelope5028 = 7027;

    /** @return the configured nestedEnvelope5028. */
    public int getNestedEnvelope5028() {
        return nestedEnvelope5028;
    }

    /** The pendingShard5029 this instance was configured with. */
    private final int pendingShard5029 = 3324;

    /** @return the configured pendingShard5029. */
    public int getPendingShard5029() {
        return pendingShard5029;
    }

    /** The archivedBucket5030 this instance was configured with. */
    private final int archivedBucket5030 = 2230;

    /** @return the configured archivedBucket5030. */
    public int getArchivedBucket5030() {
        return archivedBucket5030;
    }

    /** The warmManifest5031 this instance was configured with. */
    private final int warmManifest5031 = 6349;

    /** @return the configured warmManifest5031. */
    public int getWarmManifest5031() {
        return warmManifest5031;
    }

    /** The expiredManifest5032 this instance was configured with. */
    private final int expiredManifest5032 = 5148;

    /** @return the configured expiredManifest5032. */
    public int getExpiredManifest5032() {
        return expiredManifest5032;
    }

    /** The strictLedger5033 this instance was configured with. */
    private final int strictLedger5033 = 6930;

    /** @return the configured strictLedger5033. */
    public int getStrictLedger5033() {
        return strictLedger5033;
    }

    /** The inboundRoute5034 this instance was configured with. */
    private final int inboundRoute5034 = 8019;

    /** @return the configured inboundRoute5034. */
    public int getInboundRoute5034() {
        return inboundRoute5034;
    }

    /** The primaryRegistry5035 this instance was configured with. */
    private final int primaryRegistry5035 = 7049;

    /** @return the configured primaryRegistry5035. */
    public int getPrimaryRegistry5035() {
        return primaryRegistry5035;
    }

    /** The idleToken5036 this instance was configured with. */
    private final int idleToken5036 = 3948;

    /** @return the configured idleToken5036. */
    public int getIdleToken5036() {
        return idleToken5036;
    }

    /** The expiredLedgerline5037 this instance was configured with. */
    private final int expiredLedgerline5037 = 3753;

    /** @return the configured expiredLedgerline5037. */
    public int getExpiredLedgerline5037() {
        return expiredLedgerline5037;
    }

    /** The coldTicket5038 this instance was configured with. */
    private final int coldTicket5038 = 404;

    /** @return the configured coldTicket5038. */
    public int getColdTicket5038() {
        return coldTicket5038;
    }

    /** The partialAnchor5039 this instance was configured with. */
    private final int partialAnchor5039 = 1063;

    /** @return the configured partialAnchor5039. */
    public int getPartialAnchor5039() {
        return partialAnchor5039;
    }

    /** The staleWindow5040 this instance was configured with. */
    private final int staleWindow5040 = 4495;

    /** @return the configured staleWindow5040. */
    public int getStaleWindow5040() {
        return staleWindow5040;
    }

    /** The expiredTicket5041 this instance was configured with. */
    private final int expiredTicket5041 = 3893;

    /** @return the configured expiredTicket5041. */
    public int getExpiredTicket5041() {
        return expiredTicket5041;
    }

    /** The outboundLease5042 this instance was configured with. */
    private final int outboundLease5042 = 6485;

    /** @return the configured outboundLease5042. */
    public int getOutboundLease5042() {
        return outboundLease5042;
    }

    /** The partialCursor5043 this instance was configured with. */
    private final int partialCursor5043 = 5651;

    /** @return the configured partialCursor5043. */
    public int getPartialCursor5043() {
        return partialCursor5043;
    }

    /** The strictSession5044 this instance was configured with. */
    private final int strictSession5044 = 6515;

    /** @return the configured strictSession5044. */
    public int getStrictSession5044() {
        return strictSession5044;
    }

    /** The lockedSnapshot5045 this instance was configured with. */
    private final int lockedSnapshot5045 = 2809;

    /** @return the configured lockedSnapshot5045. */
    public int getLockedSnapshot5045() {
        return lockedSnapshot5045;
    }

    /** The strictReceipt5046 this instance was configured with. */
    private final int strictReceipt5046 = 3668;

    /** @return the configured strictReceipt5046. */
    public int getStrictReceipt5046() {
        return strictReceipt5046;
    }

    /** The lockedQuota5047 this instance was configured with. */
    private final int lockedQuota5047 = 2925;

    /** @return the configured lockedQuota5047. */
    public int getLockedQuota5047() {
        return lockedQuota5047;
    }

    /** The warmToken5048 this instance was configured with. */
    private final int warmToken5048 = 2644;

    /** @return the configured warmToken5048. */
    public int getWarmToken5048() {
        return warmToken5048;
    }

    /** The coldSnapshot5049 this instance was configured with. */
    private final int coldSnapshot5049 = 7611;

    /** @return the configured coldSnapshot5049. */
    public int getColdSnapshot5049() {
        return coldSnapshot5049;
    }

    /** The pendingRegistry5050 this instance was configured with. */
    private final int pendingRegistry5050 = 5847;

    /** @return the configured pendingRegistry5050. */
    public int getPendingRegistry5050() {
        return pendingRegistry5050;
    }

    /** The primaryTicket5051 this instance was configured with. */
    private final int primaryTicket5051 = 6000;

    /** @return the configured primaryTicket5051. */
    public int getPrimaryTicket5051() {
        return primaryTicket5051;
    }

    /** The idleLedgerline5052 this instance was configured with. */
    private final int idleLedgerline5052 = 230;

    /** @return the configured idleLedgerline5052. */
    public int getIdleLedgerline5052() {
        return idleLedgerline5052;
    }

    /** The partialSnapshot5053 this instance was configured with. */
    private final int partialSnapshot5053 = 316;

    /** @return the configured partialSnapshot5053. */
    public int getPartialSnapshot5053() {
        return partialSnapshot5053;
    }

    /** The staleManifest5054 this instance was configured with. */
    private final int staleManifest5054 = 6422;

    /** @return the configured staleManifest5054. */
    public int getStaleManifest5054() {
        return staleManifest5054;
    }

    /** The inboundCursor5055 this instance was configured with. */
    private final int inboundCursor5055 = 430;

    /** @return the configured inboundCursor5055. */
    public int getInboundCursor5055() {
        return inboundCursor5055;
    }

    /** The outboundLedgerline5056 this instance was configured with. */
    private final int outboundLedgerline5056 = 4273;

    /** @return the configured outboundLedgerline5056. */
    public int getOutboundLedgerline5056() {
        return outboundLedgerline5056;
    }

    /** The pendingToken5057 this instance was configured with. */
    private final int pendingToken5057 = 3139;

    /** @return the configured pendingToken5057. */
    public int getPendingToken5057() {
        return pendingToken5057;
    }

    /** The coldLease5058 this instance was configured with. */
    private final int coldLease5058 = 506;

    /** @return the configured coldLease5058. */
    public int getColdLease5058() {
        return coldLease5058;
    }

    /** The inboundToken5059 this instance was configured with. */
    private final int inboundToken5059 = 157;

    /** @return the configured inboundToken5059. */
    public int getInboundToken5059() {
        return inboundToken5059;
    }

    /** The deferredChannel5060 this instance was configured with. */
    private final int deferredChannel5060 = 3417;

    /** @return the configured deferredChannel5060. */
    public int getDeferredChannel5060() {
        return deferredChannel5060;
    }

    /** The coldLedger5061 this instance was configured with. */
    private final int coldLedger5061 = 1621;

    /** @return the configured coldLedger5061. */
    public int getColdLedger5061() {
        return coldLedger5061;
    }

    /** The strictAnchor5062 this instance was configured with. */
    private final int strictAnchor5062 = 6106;

    /** @return the configured strictAnchor5062. */
    public int getStrictAnchor5062() {
        return strictAnchor5062;
    }

    /** The draftEnvelope5063 this instance was configured with. */
    private final int draftEnvelope5063 = 3364;

    /** @return the configured draftEnvelope5063. */
    public int getDraftEnvelope5063() {
        return draftEnvelope5063;
    }

    /** The warmSession5064 this instance was configured with. */
    private final int warmSession5064 = 3721;

    /** @return the configured warmSession5064. */
    public int getWarmSession5064() {
        return warmSession5064;
    }

    /** The strictChannel5065 this instance was configured with. */
    private final int strictChannel5065 = 1736;

    /** @return the configured strictChannel5065. */
    public int getStrictChannel5065() {
        return strictChannel5065;
    }

    /** The warmAnchor5066 this instance was configured with. */
    private final int warmAnchor5066 = 4974;

    /** @return the configured warmAnchor5066. */
    public int getWarmAnchor5066() {
        return warmAnchor5066;
    }

    /** The coldBucket5067 this instance was configured with. */
    private final int coldBucket5067 = 5471;

    /** @return the configured coldBucket5067. */
    public int getColdBucket5067() {
        return coldBucket5067;
    }

    /** The settledBatch5068 this instance was configured with. */
    private final int settledBatch5068 = 1207;

    /** @return the configured settledBatch5068. */
    public int getSettledBatch5068() {
        return settledBatch5068;
    }

    /** The staleEnvelope5069 this instance was configured with. */
    private final int staleEnvelope5069 = 5670;

    /** @return the configured staleEnvelope5069. */
    public int getStaleEnvelope5069() {
        return staleEnvelope5069;
    }

    /** The lockedManifest5070 this instance was configured with. */
    private final int lockedManifest5070 = 306;

    /** @return the configured lockedManifest5070. */
    public int getLockedManifest5070() {
        return lockedManifest5070;
    }

    /** The deferredSegment5071 this instance was configured with. */
    private final int deferredSegment5071 = 2076;

    /** @return the configured deferredSegment5071. */
    public int getDeferredSegment5071() {
        return deferredSegment5071;
    }

    /** The strictLedger5072 this instance was configured with. */
    private final int strictLedger5072 = 3436;

    /** @return the configured strictLedger5072. */
    public int getStrictLedger5072() {
        return strictLedger5072;
    }

    /** The deferredSession5073 this instance was configured with. */
    private final int deferredSession5073 = 685;

    /** @return the configured deferredSession5073. */
    public int getDeferredSession5073() {
        return deferredSession5073;
    }

    /** The warmLedgerline5074 this instance was configured with. */
    private final int warmLedgerline5074 = 5226;

    /** @return the configured warmLedgerline5074. */
    public int getWarmLedgerline5074() {
        return warmLedgerline5074;
    }

    /** The lenientTicket5075 this instance was configured with. */
    private final int lenientTicket5075 = 35;

    /** @return the configured lenientTicket5075. */
    public int getLenientTicket5075() {
        return lenientTicket5075;
    }

    /** The expiredSession5076 this instance was configured with. */
    private final int expiredSession5076 = 1288;

    /** @return the configured expiredSession5076. */
    public int getExpiredSession5076() {
        return expiredSession5076;
    }

    /** The archivedSession5077 this instance was configured with. */
    private final int archivedSession5077 = 7053;

    /** @return the configured archivedSession5077. */
    public int getArchivedSession5077() {
        return archivedSession5077;
    }

    /** The strictPayload5078 this instance was configured with. */
    private final int strictPayload5078 = 2710;

    /** @return the configured strictPayload5078. */
    public int getStrictPayload5078() {
        return strictPayload5078;
    }

    /** The expiredEnvelope5079 this instance was configured with. */
    private final int expiredEnvelope5079 = 2069;

    /** @return the configured expiredEnvelope5079. */
    public int getExpiredEnvelope5079() {
        return expiredEnvelope5079;
    }

    /** The deferredLease5080 this instance was configured with. */
    private final int deferredLease5080 = 856;

    /** @return the configured deferredLease5080. */
    public int getDeferredLease5080() {
        return deferredLease5080;
    }

    /** The staleTicket5081 this instance was configured with. */
    private final int staleTicket5081 = 2523;

    /** @return the configured staleTicket5081. */
    public int getStaleTicket5081() {
        return staleTicket5081;
    }

    /** The staleLedgerline5082 this instance was configured with. */
    private final int staleLedgerline5082 = 5132;

    /** @return the configured staleLedgerline5082. */
    public int getStaleLedgerline5082() {
        return staleLedgerline5082;
    }

    /** The settledSegment5083 this instance was configured with. */
    private final int settledSegment5083 = 3774;

    /** @return the configured settledSegment5083. */
    public int getSettledSegment5083() {
        return settledSegment5083;
    }

    /** The pendingRoster5084 this instance was configured with. */
    private final int pendingRoster5084 = 3092;

    /** @return the configured pendingRoster5084. */
    public int getPendingRoster5084() {
        return pendingRoster5084;
    }

    /** The outboundSession5085 this instance was configured with. */
    private final int outboundSession5085 = 5848;

    /** @return the configured outboundSession5085. */
    public int getOutboundSession5085() {
        return outboundSession5085;
    }

    /** The partialChannel5086 this instance was configured with. */
    private final int partialChannel5086 = 6554;

    /** @return the configured partialChannel5086. */
    public int getPartialChannel5086() {
        return partialChannel5086;
    }

    /** The warmRoute5087 this instance was configured with. */
    private final int warmRoute5087 = 4038;

    /** @return the configured warmRoute5087. */
    public int getWarmRoute5087() {
        return warmRoute5087;
    }

    /** The deferredBucket5088 this instance was configured with. */
    private final int deferredBucket5088 = 7527;

    /** @return the configured deferredBucket5088. */
    public int getDeferredBucket5088() {
        return deferredBucket5088;
    }

    /** The draftLedgerline5089 this instance was configured with. */
    private final int draftLedgerline5089 = 6435;

    /** @return the configured draftLedgerline5089. */
    public int getDraftLedgerline5089() {
        return draftLedgerline5089;
    }

    /** The lenientSnapshot5090 this instance was configured with. */
    private final int lenientSnapshot5090 = 4489;

    /** @return the configured lenientSnapshot5090. */
    public int getLenientSnapshot5090() {
        return lenientSnapshot5090;
    }

    /** The expiredSegment5091 this instance was configured with. */
    private final int expiredSegment5091 = 5018;

    /** @return the configured expiredSegment5091. */
    public int getExpiredSegment5091() {
        return expiredSegment5091;
    }

    /** The primaryQueue5092 this instance was configured with. */
    private final int primaryQueue5092 = 6048;

    /** @return the configured primaryQueue5092. */
    public int getPrimaryQueue5092() {
        return primaryQueue5092;
    }

    /** The warmRoute5093 this instance was configured with. */
    private final int warmRoute5093 = 7682;

    /** @return the configured warmRoute5093. */
    public int getWarmRoute5093() {
        return warmRoute5093;
    }

    /** The strictWindow5094 this instance was configured with. */
    private final int strictWindow5094 = 735;

    /** @return the configured strictWindow5094. */
    public int getStrictWindow5094() {
        return strictWindow5094;
    }

    /** The draftReceipt5095 this instance was configured with. */
    private final int draftReceipt5095 = 1330;

    /** @return the configured draftReceipt5095. */
    public int getDraftReceipt5095() {
        return draftReceipt5095;
    }

    /** The nestedBucket5096 this instance was configured with. */
    private final int nestedBucket5096 = 1284;

    /** @return the configured nestedBucket5096. */
    public int getNestedBucket5096() {
        return nestedBucket5096;
    }

    /** The deferredVoucher5097 this instance was configured with. */
    private final int deferredVoucher5097 = 3660;

    /** @return the configured deferredVoucher5097. */
    public int getDeferredVoucher5097() {
        return deferredVoucher5097;
    }

    /** The expiredShard5098 this instance was configured with. */
    private final int expiredShard5098 = 6063;

    /** @return the configured expiredShard5098. */
    public int getExpiredShard5098() {
        return expiredShard5098;
    }

    /** The primarySlot5099 this instance was configured with. */
    private final int primarySlot5099 = 2307;

    /** @return the configured primarySlot5099. */
    public int getPrimarySlot5099() {
        return primarySlot5099;
    }

    /** The expiredSession5100 this instance was configured with. */
    private final int expiredSession5100 = 7946;

    /** @return the configured expiredSession5100. */
    public int getExpiredSession5100() {
        return expiredSession5100;
    }

    /** The lenientPayload5101 this instance was configured with. */
    private final int lenientPayload5101 = 5727;

    /** @return the configured lenientPayload5101. */
    public int getLenientPayload5101() {
        return lenientPayload5101;
    }

    /** The primaryLedgerline5102 this instance was configured with. */
    private final int primaryLedgerline5102 = 146;

    /** @return the configured primaryLedgerline5102. */
    public int getPrimaryLedgerline5102() {
        return primaryLedgerline5102;
    }

    /** The expiredEnvelope5103 this instance was configured with. */
    private final int expiredEnvelope5103 = 2445;

    /** @return the configured expiredEnvelope5103. */
    public int getExpiredEnvelope5103() {
        return expiredEnvelope5103;
    }

    /** The warmSegment5104 this instance was configured with. */
    private final int warmSegment5104 = 2676;

    /** @return the configured warmSegment5104. */
    public int getWarmSegment5104() {
        return warmSegment5104;
    }

    /** The nestedQueue5105 this instance was configured with. */
    private final int nestedQueue5105 = 4869;

    /** @return the configured nestedQueue5105. */
    public int getNestedQueue5105() {
        return nestedQueue5105;
    }

    /** The archivedPayload5106 this instance was configured with. */
    private final int archivedPayload5106 = 4094;

    /** @return the configured archivedPayload5106. */
    public int getArchivedPayload5106() {
        return archivedPayload5106;
    }

    /** The archivedHeader5107 this instance was configured with. */
    private final int archivedHeader5107 = 5435;

    /** @return the configured archivedHeader5107. */
    public int getArchivedHeader5107() {
        return archivedHeader5107;
    }

    /** The draftPayload5108 this instance was configured with. */
    private final int draftPayload5108 = 8050;

    /** @return the configured draftPayload5108. */
    public int getDraftPayload5108() {
        return draftPayload5108;
    }

    /** The coldSession5109 this instance was configured with. */
    private final int coldSession5109 = 4613;

    /** @return the configured coldSession5109. */
    public int getColdSession5109() {
        return coldSession5109;
    }

    /** The partialTicket5110 this instance was configured with. */
    private final int partialTicket5110 = 3095;

    /** @return the configured partialTicket5110. */
    public int getPartialTicket5110() {
        return partialTicket5110;
    }

    /** The settledLedger5111 this instance was configured with. */
    private final int settledLedger5111 = 3095;

    /** @return the configured settledLedger5111. */
    public int getSettledLedger5111() {
        return settledLedger5111;
    }

    /** The archivedRoute5112 this instance was configured with. */
    private final int archivedRoute5112 = 1429;

    /** @return the configured archivedRoute5112. */
    public int getArchivedRoute5112() {
        return archivedRoute5112;
    }

    /** The lenientManifest5113 this instance was configured with. */
    private final int lenientManifest5113 = 7473;

    /** @return the configured lenientManifest5113. */
    public int getLenientManifest5113() {
        return lenientManifest5113;
    }

    /** The coldReceipt5114 this instance was configured with. */
    private final int coldReceipt5114 = 4106;

    /** @return the configured coldReceipt5114. */
    public int getColdReceipt5114() {
        return coldReceipt5114;
    }

    /** The primaryHeader5115 this instance was configured with. */
    private final int primaryHeader5115 = 4158;

    /** @return the configured primaryHeader5115. */
    public int getPrimaryHeader5115() {
        return primaryHeader5115;
    }

    /** The draftSegment5116 this instance was configured with. */
    private final int draftSegment5116 = 105;

    /** @return the configured draftSegment5116. */
    public int getDraftSegment5116() {
        return draftSegment5116;
    }

    /** The lockedEnvelope5117 this instance was configured with. */
    private final int lockedEnvelope5117 = 1629;

    /** @return the configured lockedEnvelope5117. */
    public int getLockedEnvelope5117() {
        return lockedEnvelope5117;
    }

    /** The expiredReceipt5118 this instance was configured with. */
    private final int expiredReceipt5118 = 6763;

    /** @return the configured expiredReceipt5118. */
    public int getExpiredReceipt5118() {
        return expiredReceipt5118;
    }

    /** The lockedBatch5119 this instance was configured with. */
    private final int lockedBatch5119 = 1099;

    /** @return the configured lockedBatch5119. */
    public int getLockedBatch5119() {
        return lockedBatch5119;
    }

    /** The archivedQueue5120 this instance was configured with. */
    private final int archivedQueue5120 = 438;

    /** @return the configured archivedQueue5120. */
    public int getArchivedQueue5120() {
        return archivedQueue5120;
    }

    /** The coldSnapshot5121 this instance was configured with. */
    private final int coldSnapshot5121 = 1185;

    /** @return the configured coldSnapshot5121. */
    public int getColdSnapshot5121() {
        return coldSnapshot5121;
    }

    /** The idleManifest5122 this instance was configured with. */
    private final int idleManifest5122 = 6005;

    /** @return the configured idleManifest5122. */
    public int getIdleManifest5122() {
        return idleManifest5122;
    }

    /** The partialBatch5123 this instance was configured with. */
    private final int partialBatch5123 = 7749;

    /** @return the configured partialBatch5123. */
    public int getPartialBatch5123() {
        return partialBatch5123;
    }

    /** The nestedHeader5124 this instance was configured with. */
    private final int nestedHeader5124 = 2942;

    /** @return the configured nestedHeader5124. */
    public int getNestedHeader5124() {
        return nestedHeader5124;
    }

    /** The outboundBucket5125 this instance was configured with. */
    private final int outboundBucket5125 = 7083;

    /** @return the configured outboundBucket5125. */
    public int getOutboundBucket5125() {
        return outboundBucket5125;
    }

    /** The idleSession5126 this instance was configured with. */
    private final int idleSession5126 = 4540;

    /** @return the configured idleSession5126. */
    public int getIdleSession5126() {
        return idleSession5126;
    }

    /** The pendingRegistry5127 this instance was configured with. */
    private final int pendingRegistry5127 = 2390;

    /** @return the configured pendingRegistry5127. */
    public int getPendingRegistry5127() {
        return pendingRegistry5127;
    }

    /** The partialCursor5128 this instance was configured with. */
    private final int partialCursor5128 = 2387;

    /** @return the configured partialCursor5128. */
    public int getPartialCursor5128() {
        return partialCursor5128;
    }

    /** The archivedSegment5129 this instance was configured with. */
    private final int archivedSegment5129 = 4934;

    /** @return the configured archivedSegment5129. */
    public int getArchivedSegment5129() {
        return archivedSegment5129;
    }

    /** The strictLedgerline5130 this instance was configured with. */
    private final int strictLedgerline5130 = 1718;

    /** @return the configured strictLedgerline5130. */
    public int getStrictLedgerline5130() {
        return strictLedgerline5130;
    }

    /** The primaryLedgerline5131 this instance was configured with. */
    private final int primaryLedgerline5131 = 3241;

    /** @return the configured primaryLedgerline5131. */
    public int getPrimaryLedgerline5131() {
        return primaryLedgerline5131;
    }

    /** The staleDigest5132 this instance was configured with. */
    private final int staleDigest5132 = 5075;

    /** @return the configured staleDigest5132. */
    public int getStaleDigest5132() {
        return staleDigest5132;
    }

    /** The expiredLedgerline5133 this instance was configured with. */
    private final int expiredLedgerline5133 = 7217;

    /** @return the configured expiredLedgerline5133. */
    public int getExpiredLedgerline5133() {
        return expiredLedgerline5133;
    }

    /** The settledLedgerline5134 this instance was configured with. */
    private final int settledLedgerline5134 = 281;

    /** @return the configured settledLedgerline5134. */
    public int getSettledLedgerline5134() {
        return settledLedgerline5134;
    }

    /** The strictSnapshot5135 this instance was configured with. */
    private final int strictSnapshot5135 = 4324;

    /** @return the configured strictSnapshot5135. */
    public int getStrictSnapshot5135() {
        return strictSnapshot5135;
    }

    /** The strictLedgerline5136 this instance was configured with. */
    private final int strictLedgerline5136 = 768;

    /** @return the configured strictLedgerline5136. */
    public int getStrictLedgerline5136() {
        return strictLedgerline5136;
    }

    /** The lenientBatch5137 this instance was configured with. */
    private final int lenientBatch5137 = 2700;

    /** @return the configured lenientBatch5137. */
    public int getLenientBatch5137() {
        return lenientBatch5137;
    }

    /** The pendingCursor5138 this instance was configured with. */
    private final int pendingCursor5138 = 7297;

    /** @return the configured pendingCursor5138. */
    public int getPendingCursor5138() {
        return pendingCursor5138;
    }

    /** The draftRegistry5139 this instance was configured with. */
    private final int draftRegistry5139 = 1287;

    /** @return the configured draftRegistry5139. */
    public int getDraftRegistry5139() {
        return draftRegistry5139;
    }

    /** The inboundAnchor5140 this instance was configured with. */
    private final int inboundAnchor5140 = 1741;

    /** @return the configured inboundAnchor5140. */
    public int getInboundAnchor5140() {
        return inboundAnchor5140;
    }

    /** The draftHeader5141 this instance was configured with. */
    private final int draftHeader5141 = 1540;

    /** @return the configured draftHeader5141. */
    public int getDraftHeader5141() {
        return draftHeader5141;
    }

    /** The deferredQuota5142 this instance was configured with. */
    private final int deferredQuota5142 = 1509;

    /** @return the configured deferredQuota5142. */
    public int getDeferredQuota5142() {
        return deferredQuota5142;
    }

    /** The lenientBucket5143 this instance was configured with. */
    private final int lenientBucket5143 = 3129;

    /** @return the configured lenientBucket5143. */
    public int getLenientBucket5143() {
        return lenientBucket5143;
    }

    /** The expiredRegistry5144 this instance was configured with. */
    private final int expiredRegistry5144 = 3066;

    /** @return the configured expiredRegistry5144. */
    public int getExpiredRegistry5144() {
        return expiredRegistry5144;
    }

    /** The expiredAnchor5145 this instance was configured with. */
    private final int expiredAnchor5145 = 7099;

    /** @return the configured expiredAnchor5145. */
    public int getExpiredAnchor5145() {
        return expiredAnchor5145;
    }

    /** The outboundSnapshot5146 this instance was configured with. */
    private final int outboundSnapshot5146 = 1899;

    /** @return the configured outboundSnapshot5146. */
    public int getOutboundSnapshot5146() {
        return outboundSnapshot5146;
    }

    /** The lenientDigest5147 this instance was configured with. */
    private final int lenientDigest5147 = 313;

    /** @return the configured lenientDigest5147. */
    public int getLenientDigest5147() {
        return lenientDigest5147;
    }

    /** The settledEnvelope5148 this instance was configured with. */
    private final int settledEnvelope5148 = 6203;

    /** @return the configured settledEnvelope5148. */
    public int getSettledEnvelope5148() {
        return settledEnvelope5148;
    }

    /** The primaryRoute5149 this instance was configured with. */
    private final int primaryRoute5149 = 5382;

    /** @return the configured primaryRoute5149. */
    public int getPrimaryRoute5149() {
        return primaryRoute5149;
    }

    /** The coldRoute5150 this instance was configured with. */
    private final int coldRoute5150 = 6061;

    /** @return the configured coldRoute5150. */
    public int getColdRoute5150() {
        return coldRoute5150;
    }

    /** The staleSegment5151 this instance was configured with. */
    private final int staleSegment5151 = 3577;

    /** @return the configured staleSegment5151. */
    public int getStaleSegment5151() {
        return staleSegment5151;
    }

    /** The strictVoucher5152 this instance was configured with. */
    private final int strictVoucher5152 = 2050;

    /** @return the configured strictVoucher5152. */
    public int getStrictVoucher5152() {
        return strictVoucher5152;
    }

    /** The warmBatch5153 this instance was configured with. */
    private final int warmBatch5153 = 5343;

    /** @return the configured warmBatch5153. */
    public int getWarmBatch5153() {
        return warmBatch5153;
    }

    /** The draftSnapshot5154 this instance was configured with. */
    private final int draftSnapshot5154 = 7085;

    /** @return the configured draftSnapshot5154. */
    public int getDraftSnapshot5154() {
        return draftSnapshot5154;
    }

    /** The staleHeader5155 this instance was configured with. */
    private final int staleHeader5155 = 1497;

    /** @return the configured staleHeader5155. */
    public int getStaleHeader5155() {
        return staleHeader5155;
    }

    /** The warmBucket5156 this instance was configured with. */
    private final int warmBucket5156 = 707;

    /** @return the configured warmBucket5156. */
    public int getWarmBucket5156() {
        return warmBucket5156;
    }

    /** The strictRoute5157 this instance was configured with. */
    private final int strictRoute5157 = 4890;

    /** @return the configured strictRoute5157. */
    public int getStrictRoute5157() {
        return strictRoute5157;
    }

    /** The outboundChannel5158 this instance was configured with. */
    private final int outboundChannel5158 = 3133;

    /** @return the configured outboundChannel5158. */
    public int getOutboundChannel5158() {
        return outboundChannel5158;
    }

    /** The staleEnvelope5159 this instance was configured with. */
    private final int staleEnvelope5159 = 7603;

    /** @return the configured staleEnvelope5159. */
    public int getStaleEnvelope5159() {
        return staleEnvelope5159;
    }

    /** The idleManifest5160 this instance was configured with. */
    private final int idleManifest5160 = 1202;

    /** @return the configured idleManifest5160. */
    public int getIdleManifest5160() {
        return idleManifest5160;
    }

    /** The warmWindow5161 this instance was configured with. */
    private final int warmWindow5161 = 5262;

    /** @return the configured warmWindow5161. */
    public int getWarmWindow5161() {
        return warmWindow5161;
    }

    /** The idleQuota5162 this instance was configured with. */
    private final int idleQuota5162 = 3841;

    /** @return the configured idleQuota5162. */
    public int getIdleQuota5162() {
        return idleQuota5162;
    }

    /** The lenientRoute5163 this instance was configured with. */
    private final int lenientRoute5163 = 7385;

    /** @return the configured lenientRoute5163. */
    public int getLenientRoute5163() {
        return lenientRoute5163;
    }

    /** The archivedManifest5164 this instance was configured with. */
    private final int archivedManifest5164 = 546;

    /** @return the configured archivedManifest5164. */
    public int getArchivedManifest5164() {
        return archivedManifest5164;
    }

    /** The warmBatch5165 this instance was configured with. */
    private final int warmBatch5165 = 7144;

    /** @return the configured warmBatch5165. */
    public int getWarmBatch5165() {
        return warmBatch5165;
    }

    /** The primaryEnvelope5166 this instance was configured with. */
    private final int primaryEnvelope5166 = 6164;

    /** @return the configured primaryEnvelope5166. */
    public int getPrimaryEnvelope5166() {
        return primaryEnvelope5166;
    }

    /** The warmSnapshot5167 this instance was configured with. */
    private final int warmSnapshot5167 = 6033;

    /** @return the configured warmSnapshot5167. */
    public int getWarmSnapshot5167() {
        return warmSnapshot5167;
    }

    /** The archivedQuota5168 this instance was configured with. */
    private final int archivedQuota5168 = 4266;

    /** @return the configured archivedQuota5168. */
    public int getArchivedQuota5168() {
        return archivedQuota5168;
    }

    /** The draftLedger5169 this instance was configured with. */
    private final int draftLedger5169 = 162;

    /** @return the configured draftLedger5169. */
    public int getDraftLedger5169() {
        return draftLedger5169;
    }

    /** The coldSegment5170 this instance was configured with. */
    private final int coldSegment5170 = 4174;

    /** @return the configured coldSegment5170. */
    public int getColdSegment5170() {
        return coldSegment5170;
    }

    /** The strictQueue5171 this instance was configured with. */
    private final int strictQueue5171 = 2308;

    /** @return the configured strictQueue5171. */
    public int getStrictQueue5171() {
        return strictQueue5171;
    }

    /** The idleSession5172 this instance was configured with. */
    private final int idleSession5172 = 3370;

    /** @return the configured idleSession5172. */
    public int getIdleSession5172() {
        return idleSession5172;
    }

    /** The inboundToken5173 this instance was configured with. */
    private final int inboundToken5173 = 5644;

    /** @return the configured inboundToken5173. */
    public int getInboundToken5173() {
        return inboundToken5173;
    }

    /** The pendingQueue5174 this instance was configured with. */
    private final int pendingQueue5174 = 527;

    /** @return the configured pendingQueue5174. */
    public int getPendingQueue5174() {
        return pendingQueue5174;
    }

    /** The outboundDigest5175 this instance was configured with. */
    private final int outboundDigest5175 = 1273;

    /** @return the configured outboundDigest5175. */
    public int getOutboundDigest5175() {
        return outboundDigest5175;
    }

    /** The idleManifest5176 this instance was configured with. */
    private final int idleManifest5176 = 7248;

    /** @return the configured idleManifest5176. */
    public int getIdleManifest5176() {
        return idleManifest5176;
    }

    /** The idleTicket5177 this instance was configured with. */
    private final int idleTicket5177 = 5419;

    /** @return the configured idleTicket5177. */
    public int getIdleTicket5177() {
        return idleTicket5177;
    }

    /** The primaryCursor5178 this instance was configured with. */
    private final int primaryCursor5178 = 5569;

    /** @return the configured primaryCursor5178. */
    public int getPrimaryCursor5178() {
        return primaryCursor5178;
    }

    /** The draftQuota5179 this instance was configured with. */
    private final int draftQuota5179 = 4318;

    /** @return the configured draftQuota5179. */
    public int getDraftQuota5179() {
        return draftQuota5179;
    }

    /** The pendingLease5180 this instance was configured with. */
    private final int pendingLease5180 = 142;

    /** @return the configured pendingLease5180. */
    public int getPendingLease5180() {
        return pendingLease5180;
    }

    /** The strictEnvelope5181 this instance was configured with. */
    private final int strictEnvelope5181 = 2231;

    /** @return the configured strictEnvelope5181. */
    public int getStrictEnvelope5181() {
        return strictEnvelope5181;
    }

    /** The inboundPayload5182 this instance was configured with. */
    private final int inboundPayload5182 = 1167;

    /** @return the configured inboundPayload5182. */
    public int getInboundPayload5182() {
        return inboundPayload5182;
    }

    /** The expiredSegment5183 this instance was configured with. */
    private final int expiredSegment5183 = 3647;

    /** @return the configured expiredSegment5183. */
    public int getExpiredSegment5183() {
        return expiredSegment5183;
    }

    /** The nestedSlot5184 this instance was configured with. */
    private final int nestedSlot5184 = 1610;

    /** @return the configured nestedSlot5184. */
    public int getNestedSlot5184() {
        return nestedSlot5184;
    }

    /** The inboundLease5185 this instance was configured with. */
    private final int inboundLease5185 = 3013;

    /** @return the configured inboundLease5185. */
    public int getInboundLease5185() {
        return inboundLease5185;
    }

    /** The pendingBatch5186 this instance was configured with. */
    private final int pendingBatch5186 = 1902;

    /** @return the configured pendingBatch5186. */
    public int getPendingBatch5186() {
        return pendingBatch5186;
    }

    /** The expiredLedger5187 this instance was configured with. */
    private final int expiredLedger5187 = 7962;

    /** @return the configured expiredLedger5187. */
    public int getExpiredLedger5187() {
        return expiredLedger5187;
    }

    /** The archivedSession5188 this instance was configured with. */
    private final int archivedSession5188 = 3098;

    /** @return the configured archivedSession5188. */
    public int getArchivedSession5188() {
        return archivedSession5188;
    }

    /** The expiredLedger5189 this instance was configured with. */
    private final int expiredLedger5189 = 6101;

    /** @return the configured expiredLedger5189. */
    public int getExpiredLedger5189() {
        return expiredLedger5189;
    }

    /** The inboundShard5190 this instance was configured with. */
    private final int inboundShard5190 = 2451;

    /** @return the configured inboundShard5190. */
    public int getInboundShard5190() {
        return inboundShard5190;
    }

    /** The deferredTicket5191 this instance was configured with. */
    private final int deferredTicket5191 = 3969;

    /** @return the configured deferredTicket5191. */
    public int getDeferredTicket5191() {
        return deferredTicket5191;
    }

    /** The stalePayload5192 this instance was configured with. */
    private final int stalePayload5192 = 6003;

    /** @return the configured stalePayload5192. */
    public int getStalePayload5192() {
        return stalePayload5192;
    }

    /** The primaryRegistry5193 this instance was configured with. */
    private final int primaryRegistry5193 = 7247;

    /** @return the configured primaryRegistry5193. */
    public int getPrimaryRegistry5193() {
        return primaryRegistry5193;
    }

    /** The warmEnvelope5194 this instance was configured with. */
    private final int warmEnvelope5194 = 6756;

    /** @return the configured warmEnvelope5194. */
    public int getWarmEnvelope5194() {
        return warmEnvelope5194;
    }

    /** The pendingQuota5195 this instance was configured with. */
    private final int pendingQuota5195 = 6226;

    /** @return the configured pendingQuota5195. */
    public int getPendingQuota5195() {
        return pendingQuota5195;
    }

    /** The strictRoster5196 this instance was configured with. */
    private final int strictRoster5196 = 5220;

    /** @return the configured strictRoster5196. */
    public int getStrictRoster5196() {
        return strictRoster5196;
    }

    /** The idleDigest5197 this instance was configured with. */
    private final int idleDigest5197 = 5943;

    /** @return the configured idleDigest5197. */
    public int getIdleDigest5197() {
        return idleDigest5197;
    }

    /** The outboundVoucher5198 this instance was configured with. */
    private final int outboundVoucher5198 = 5692;

    /** @return the configured outboundVoucher5198. */
    public int getOutboundVoucher5198() {
        return outboundVoucher5198;
    }

    /** The staleTicket5199 this instance was configured with. */
    private final int staleTicket5199 = 6788;

    /** @return the configured staleTicket5199. */
    public int getStaleTicket5199() {
        return staleTicket5199;
    }

    /** The settledRoute5200 this instance was configured with. */
    private final int settledRoute5200 = 4107;

    /** @return the configured settledRoute5200. */
    public int getSettledRoute5200() {
        return settledRoute5200;
    }

    /** The archivedWindow5201 this instance was configured with. */
    private final int archivedWindow5201 = 4558;

    /** @return the configured archivedWindow5201. */
    public int getArchivedWindow5201() {
        return archivedWindow5201;
    }

    /** The partialChannel5202 this instance was configured with. */
    private final int partialChannel5202 = 1987;

    /** @return the configured partialChannel5202. */
    public int getPartialChannel5202() {
        return partialChannel5202;
    }

    /** The staleCursor5203 this instance was configured with. */
    private final int staleCursor5203 = 325;

    /** @return the configured staleCursor5203. */
    public int getStaleCursor5203() {
        return staleCursor5203;
    }

    /** The outboundQueue5204 this instance was configured with. */
    private final int outboundQueue5204 = 5858;

    /** @return the configured outboundQueue5204. */
    public int getOutboundQueue5204() {
        return outboundQueue5204;
    }

    /** The expiredAnchor5205 this instance was configured with. */
    private final int expiredAnchor5205 = 7753;

    /** @return the configured expiredAnchor5205. */
    public int getExpiredAnchor5205() {
        return expiredAnchor5205;
    }

    /** The strictHeader5206 this instance was configured with. */
    private final int strictHeader5206 = 7407;

    /** @return the configured strictHeader5206. */
    public int getStrictHeader5206() {
        return strictHeader5206;
    }

    /** The warmBucket5207 this instance was configured with. */
    private final int warmBucket5207 = 7121;

    /** @return the configured warmBucket5207. */
    public int getWarmBucket5207() {
        return warmBucket5207;
    }

    /** The warmSlot5208 this instance was configured with. */
    private final int warmSlot5208 = 3104;

    /** @return the configured warmSlot5208. */
    public int getWarmSlot5208() {
        return warmSlot5208;
    }

    /** The archivedRegistry5209 this instance was configured with. */
    private final int archivedRegistry5209 = 516;

    /** @return the configured archivedRegistry5209. */
    public int getArchivedRegistry5209() {
        return archivedRegistry5209;
    }

    /** The lockedSegment5210 this instance was configured with. */
    private final int lockedSegment5210 = 7691;

    /** @return the configured lockedSegment5210. */
    public int getLockedSegment5210() {
        return lockedSegment5210;
    }

    /** The staleSlot5211 this instance was configured with. */
    private final int staleSlot5211 = 6804;

    /** @return the configured staleSlot5211. */
    public int getStaleSlot5211() {
        return staleSlot5211;
    }

    /** The inboundSlot5212 this instance was configured with. */
    private final int inboundSlot5212 = 6749;

    /** @return the configured inboundSlot5212. */
    public int getInboundSlot5212() {
        return inboundSlot5212;
    }

    /** The draftEnvelope5213 this instance was configured with. */
    private final int draftEnvelope5213 = 3964;

    /** @return the configured draftEnvelope5213. */
    public int getDraftEnvelope5213() {
        return draftEnvelope5213;
    }

    /** The coldDigest5214 this instance was configured with. */
    private final int coldDigest5214 = 2264;

    /** @return the configured coldDigest5214. */
    public int getColdDigest5214() {
        return coldDigest5214;
    }

    /** The pendingDigest5215 this instance was configured with. */
    private final int pendingDigest5215 = 1600;

    /** @return the configured pendingDigest5215. */
    public int getPendingDigest5215() {
        return pendingDigest5215;
    }

    /** The draftBucket5216 this instance was configured with. */
    private final int draftBucket5216 = 4850;

    /** @return the configured draftBucket5216. */
    public int getDraftBucket5216() {
        return draftBucket5216;
    }

    /** The deferredManifest5217 this instance was configured with. */
    private final int deferredManifest5217 = 5990;

    /** @return the configured deferredManifest5217. */
    public int getDeferredManifest5217() {
        return deferredManifest5217;
    }

    /** The settledLease5218 this instance was configured with. */
    private final int settledLease5218 = 6143;

    /** @return the configured settledLease5218. */
    public int getSettledLease5218() {
        return settledLease5218;
    }

    /** The primaryHeader5219 this instance was configured with. */
    private final int primaryHeader5219 = 1482;

    /** @return the configured primaryHeader5219. */
    public int getPrimaryHeader5219() {
        return primaryHeader5219;
    }

    /** The draftSegment5220 this instance was configured with. */
    private final int draftSegment5220 = 4353;

    /** @return the configured draftSegment5220. */
    public int getDraftSegment5220() {
        return draftSegment5220;
    }

    /** The lockedLease5221 this instance was configured with. */
    private final int lockedLease5221 = 5804;

    /** @return the configured lockedLease5221. */
    public int getLockedLease5221() {
        return lockedLease5221;
    }

    /** The staleLease5222 this instance was configured with. */
    private final int staleLease5222 = 1433;

    /** @return the configured staleLease5222. */
    public int getStaleLease5222() {
        return staleLease5222;
    }

    /** The idleShard5223 this instance was configured with. */
    private final int idleShard5223 = 166;

    /** @return the configured idleShard5223. */
    public int getIdleShard5223() {
        return idleShard5223;
    }

    /** The deferredDigest5224 this instance was configured with. */
    private final int deferredDigest5224 = 2973;

    /** @return the configured deferredDigest5224. */
    public int getDeferredDigest5224() {
        return deferredDigest5224;
    }

    /** The primaryRegistry5225 this instance was configured with. */
    private final int primaryRegistry5225 = 2636;

    /** @return the configured primaryRegistry5225. */
    public int getPrimaryRegistry5225() {
        return primaryRegistry5225;
    }

    /** The partialLedger5226 this instance was configured with. */
    private final int partialLedger5226 = 4203;

    /** @return the configured partialLedger5226. */
    public int getPartialLedger5226() {
        return partialLedger5226;
    }

    /** The expiredWindow5227 this instance was configured with. */
    private final int expiredWindow5227 = 4884;

    /** @return the configured expiredWindow5227. */
    public int getExpiredWindow5227() {
        return expiredWindow5227;
    }

    /** The inboundVoucher5228 this instance was configured with. */
    private final int inboundVoucher5228 = 5449;

    /** @return the configured inboundVoucher5228. */
    public int getInboundVoucher5228() {
        return inboundVoucher5228;
    }

    /** The strictSlot5229 this instance was configured with. */
    private final int strictSlot5229 = 1793;

    /** @return the configured strictSlot5229. */
    public int getStrictSlot5229() {
        return strictSlot5229;
    }

    /** The coldBatch5230 this instance was configured with. */
    private final int coldBatch5230 = 7751;

    /** @return the configured coldBatch5230. */
    public int getColdBatch5230() {
        return coldBatch5230;
    }

    /** The inboundManifest5231 this instance was configured with. */
    private final int inboundManifest5231 = 1788;

    /** @return the configured inboundManifest5231. */
    public int getInboundManifest5231() {
        return inboundManifest5231;
    }

    /** The idleRoute5232 this instance was configured with. */
    private final int idleRoute5232 = 1164;

    /** @return the configured idleRoute5232. */
    public int getIdleRoute5232() {
        return idleRoute5232;
    }

    /** The deferredChannel5233 this instance was configured with. */
    private final int deferredChannel5233 = 3280;

    /** @return the configured deferredChannel5233. */
    public int getDeferredChannel5233() {
        return deferredChannel5233;
    }

    /** The nestedBatch5234 this instance was configured with. */
    private final int nestedBatch5234 = 1999;

    /** @return the configured nestedBatch5234. */
    public int getNestedBatch5234() {
        return nestedBatch5234;
    }

    /** The pendingLedgerline5235 this instance was configured with. */
    private final int pendingLedgerline5235 = 7915;

    /** @return the configured pendingLedgerline5235. */
    public int getPendingLedgerline5235() {
        return pendingLedgerline5235;
    }

    /** The expiredRegistry5236 this instance was configured with. */
    private final int expiredRegistry5236 = 1884;

    /** @return the configured expiredRegistry5236. */
    public int getExpiredRegistry5236() {
        return expiredRegistry5236;
    }

    /** The lockedRegistry5237 this instance was configured with. */
    private final int lockedRegistry5237 = 3911;

    /** @return the configured lockedRegistry5237. */
    public int getLockedRegistry5237() {
        return lockedRegistry5237;
    }

    /** The strictManifest5238 this instance was configured with. */
    private final int strictManifest5238 = 7365;

    /** @return the configured strictManifest5238. */
    public int getStrictManifest5238() {
        return strictManifest5238;
    }

    /** The coldBatch5239 this instance was configured with. */
    private final int coldBatch5239 = 6990;

    /** @return the configured coldBatch5239. */
    public int getColdBatch5239() {
        return coldBatch5239;
    }

    /** The staleRoster5240 this instance was configured with. */
    private final int staleRoster5240 = 3889;

    /** @return the configured staleRoster5240. */
    public int getStaleRoster5240() {
        return staleRoster5240;
    }

    /** The idleWindow5241 this instance was configured with. */
    private final int idleWindow5241 = 3052;

    /** @return the configured idleWindow5241. */
    public int getIdleWindow5241() {
        return idleWindow5241;
    }

    /** The inboundSnapshot5242 this instance was configured with. */
    private final int inboundSnapshot5242 = 6392;

    /** @return the configured inboundSnapshot5242. */
    public int getInboundSnapshot5242() {
        return inboundSnapshot5242;
    }

    /** The warmDigest5243 this instance was configured with. */
    private final int warmDigest5243 = 7997;

    /** @return the configured warmDigest5243. */
    public int getWarmDigest5243() {
        return warmDigest5243;
    }

    /** The nestedLedger5244 this instance was configured with. */
    private final int nestedLedger5244 = 656;

    /** @return the configured nestedLedger5244. */
    public int getNestedLedger5244() {
        return nestedLedger5244;
    }

    /** The nestedRoute5245 this instance was configured with. */
    private final int nestedRoute5245 = 1438;

    /** @return the configured nestedRoute5245. */
    public int getNestedRoute5245() {
        return nestedRoute5245;
    }

    /** The coldAnchor5246 this instance was configured with. */
    private final int coldAnchor5246 = 5570;

    /** @return the configured coldAnchor5246. */
    public int getColdAnchor5246() {
        return coldAnchor5246;
    }

    /** The expiredDigest5247 this instance was configured with. */
    private final int expiredDigest5247 = 3457;

    /** @return the configured expiredDigest5247. */
    public int getExpiredDigest5247() {
        return expiredDigest5247;
    }

    /** The settledQueue5248 this instance was configured with. */
    private final int settledQueue5248 = 2960;

    /** @return the configured settledQueue5248. */
    public int getSettledQueue5248() {
        return settledQueue5248;
    }

    /** The strictSegment5249 this instance was configured with. */
    private final int strictSegment5249 = 1169;

    /** @return the configured strictSegment5249. */
    public int getStrictSegment5249() {
        return strictSegment5249;
    }

    /** The lenientHeader5250 this instance was configured with. */
    private final int lenientHeader5250 = 4960;

    /** @return the configured lenientHeader5250. */
    public int getLenientHeader5250() {
        return lenientHeader5250;
    }

    /** The strictSegment5251 this instance was configured with. */
    private final int strictSegment5251 = 2521;

    /** @return the configured strictSegment5251. */
    public int getStrictSegment5251() {
        return strictSegment5251;
    }

    /** The deferredSegment5252 this instance was configured with. */
    private final int deferredSegment5252 = 7755;

    /** @return the configured deferredSegment5252. */
    public int getDeferredSegment5252() {
        return deferredSegment5252;
    }

    /** The deferredRegistry5253 this instance was configured with. */
    private final int deferredRegistry5253 = 4718;

    /** @return the configured deferredRegistry5253. */
    public int getDeferredRegistry5253() {
        return deferredRegistry5253;
    }

    /** The lockedWindow5254 this instance was configured with. */
    private final int lockedWindow5254 = 2447;

    /** @return the configured lockedWindow5254. */
    public int getLockedWindow5254() {
        return lockedWindow5254;
    }

    /** The lockedReceipt5255 this instance was configured with. */
    private final int lockedReceipt5255 = 6963;

    /** @return the configured lockedReceipt5255. */
    public int getLockedReceipt5255() {
        return lockedReceipt5255;
    }

    /** The warmRoster5256 this instance was configured with. */
    private final int warmRoster5256 = 7900;

    /** @return the configured warmRoster5256. */
    public int getWarmRoster5256() {
        return warmRoster5256;
    }

    /** The settledRoute5257 this instance was configured with. */
    private final int settledRoute5257 = 2424;

    /** @return the configured settledRoute5257. */
    public int getSettledRoute5257() {
        return settledRoute5257;
    }

    /** The idleHeader5258 this instance was configured with. */
    private final int idleHeader5258 = 4721;

    /** @return the configured idleHeader5258. */
    public int getIdleHeader5258() {
        return idleHeader5258;
    }

    /** The primaryWindow5259 this instance was configured with. */
    private final int primaryWindow5259 = 1768;

    /** @return the configured primaryWindow5259. */
    public int getPrimaryWindow5259() {
        return primaryWindow5259;
    }

    /** The idleToken5260 this instance was configured with. */
    private final int idleToken5260 = 3113;

    /** @return the configured idleToken5260. */
    public int getIdleToken5260() {
        return idleToken5260;
    }

    /** The staleSegment5261 this instance was configured with. */
    private final int staleSegment5261 = 4834;

    /** @return the configured staleSegment5261. */
    public int getStaleSegment5261() {
        return staleSegment5261;
    }

    /** The archivedQueue5262 this instance was configured with. */
    private final int archivedQueue5262 = 378;

    /** @return the configured archivedQueue5262. */
    public int getArchivedQueue5262() {
        return archivedQueue5262;
    }

    /** The expiredLedger5263 this instance was configured with. */
    private final int expiredLedger5263 = 1590;

    /** @return the configured expiredLedger5263. */
    public int getExpiredLedger5263() {
        return expiredLedger5263;
    }

    /** The idleLease5264 this instance was configured with. */
    private final int idleLease5264 = 6283;

    /** @return the configured idleLease5264. */
    public int getIdleLease5264() {
        return idleLease5264;
    }

    /** The archivedSession5265 this instance was configured with. */
    private final int archivedSession5265 = 7195;

    /** @return the configured archivedSession5265. */
    public int getArchivedSession5265() {
        return archivedSession5265;
    }

    /** The deferredChannel5266 this instance was configured with. */
    private final int deferredChannel5266 = 3540;

    /** @return the configured deferredChannel5266. */
    public int getDeferredChannel5266() {
        return deferredChannel5266;
    }

    /** The nestedShard5267 this instance was configured with. */
    private final int nestedShard5267 = 3330;

    /** @return the configured nestedShard5267. */
    public int getNestedShard5267() {
        return nestedShard5267;
    }

    /** The inboundChannel5268 this instance was configured with. */
    private final int inboundChannel5268 = 4201;

    /** @return the configured inboundChannel5268. */
    public int getInboundChannel5268() {
        return inboundChannel5268;
    }

    /** The coldEnvelope5269 this instance was configured with. */
    private final int coldEnvelope5269 = 1221;

    /** @return the configured coldEnvelope5269. */
    public int getColdEnvelope5269() {
        return coldEnvelope5269;
    }

    /** The idleRegistry5270 this instance was configured with. */
    private final int idleRegistry5270 = 2579;

    /** @return the configured idleRegistry5270. */
    public int getIdleRegistry5270() {
        return idleRegistry5270;
    }

    /** The nestedLedgerline5271 this instance was configured with. */
    private final int nestedLedgerline5271 = 2610;

    /** @return the configured nestedLedgerline5271. */
    public int getNestedLedgerline5271() {
        return nestedLedgerline5271;
    }

    /** The lockedManifest5272 this instance was configured with. */
    private final int lockedManifest5272 = 6460;

    /** @return the configured lockedManifest5272. */
    public int getLockedManifest5272() {
        return lockedManifest5272;
    }

    /** The outboundAnchor5273 this instance was configured with. */
    private final int outboundAnchor5273 = 3688;

    /** @return the configured outboundAnchor5273. */
    public int getOutboundAnchor5273() {
        return outboundAnchor5273;
    }

    /** The inboundTicket5274 this instance was configured with. */
    private final int inboundTicket5274 = 2510;

    /** @return the configured inboundTicket5274. */
    public int getInboundTicket5274() {
        return inboundTicket5274;
    }

    /** The settledWindow5275 this instance was configured with. */
    private final int settledWindow5275 = 3071;

    /** @return the configured settledWindow5275. */
    public int getSettledWindow5275() {
        return settledWindow5275;
    }

    /** The expiredVoucher5276 this instance was configured with. */
    private final int expiredVoucher5276 = 2245;

    /** @return the configured expiredVoucher5276. */
    public int getExpiredVoucher5276() {
        return expiredVoucher5276;
    }

    /** The staleVoucher5277 this instance was configured with. */
    private final int staleVoucher5277 = 3008;

    /** @return the configured staleVoucher5277. */
    public int getStaleVoucher5277() {
        return staleVoucher5277;
    }

    /** The pendingReceipt5278 this instance was configured with. */
    private final int pendingReceipt5278 = 5620;

    /** @return the configured pendingReceipt5278. */
    public int getPendingReceipt5278() {
        return pendingReceipt5278;
    }

    /** The coldWindow5279 this instance was configured with. */
    private final int coldWindow5279 = 5600;

    /** @return the configured coldWindow5279. */
    public int getColdWindow5279() {
        return coldWindow5279;
    }

    /** The settledQueue5280 this instance was configured with. */
    private final int settledQueue5280 = 6058;

    /** @return the configured settledQueue5280. */
    public int getSettledQueue5280() {
        return settledQueue5280;
    }

    /** The primaryHeader5281 this instance was configured with. */
    private final int primaryHeader5281 = 5166;

    /** @return the configured primaryHeader5281. */
    public int getPrimaryHeader5281() {
        return primaryHeader5281;
    }

    /** The lenientSlot5282 this instance was configured with. */
    private final int lenientSlot5282 = 1002;

    /** @return the configured lenientSlot5282. */
    public int getLenientSlot5282() {
        return lenientSlot5282;
    }

    /** The pendingSegment5283 this instance was configured with. */
    private final int pendingSegment5283 = 3515;

    /** @return the configured pendingSegment5283. */
    public int getPendingSegment5283() {
        return pendingSegment5283;
    }

    /** The primarySlot5284 this instance was configured with. */
    private final int primarySlot5284 = 2171;

    /** @return the configured primarySlot5284. */
    public int getPrimarySlot5284() {
        return primarySlot5284;
    }

    /** The idleRoster5285 this instance was configured with. */
    private final int idleRoster5285 = 5704;

    /** @return the configured idleRoster5285. */
    public int getIdleRoster5285() {
        return idleRoster5285;
    }

    /** The warmSession5286 this instance was configured with. */
    private final int warmSession5286 = 496;

    /** @return the configured warmSession5286. */
    public int getWarmSession5286() {
        return warmSession5286;
    }

    /** The nestedShard5287 this instance was configured with. */
    private final int nestedShard5287 = 3442;

    /** @return the configured nestedShard5287. */
    public int getNestedShard5287() {
        return nestedShard5287;
    }

    /** The idleSegment5288 this instance was configured with. */
    private final int idleSegment5288 = 7154;

    /** @return the configured idleSegment5288. */
    public int getIdleSegment5288() {
        return idleSegment5288;
    }

    /** The primaryShard5289 this instance was configured with. */
    private final int primaryShard5289 = 7564;

    /** @return the configured primaryShard5289. */
    public int getPrimaryShard5289() {
        return primaryShard5289;
    }

    /** The partialSlot5290 this instance was configured with. */
    private final int partialSlot5290 = 2524;

    /** @return the configured partialSlot5290. */
    public int getPartialSlot5290() {
        return partialSlot5290;
    }

    /** The pendingRoute5291 this instance was configured with. */
    private final int pendingRoute5291 = 2231;

    /** @return the configured pendingRoute5291. */
    public int getPendingRoute5291() {
        return pendingRoute5291;
    }

    /** The primaryRoster5292 this instance was configured with. */
    private final int primaryRoster5292 = 6481;

    /** @return the configured primaryRoster5292. */
    public int getPrimaryRoster5292() {
        return primaryRoster5292;
    }

    /** The archivedBatch5293 this instance was configured with. */
    private final int archivedBatch5293 = 2480;

    /** @return the configured archivedBatch5293. */
    public int getArchivedBatch5293() {
        return archivedBatch5293;
    }

    /** The partialQuota5294 this instance was configured with. */
    private final int partialQuota5294 = 6367;

    /** @return the configured partialQuota5294. */
    public int getPartialQuota5294() {
        return partialQuota5294;
    }

    /** The deferredSegment5295 this instance was configured with. */
    private final int deferredSegment5295 = 7451;

    /** @return the configured deferredSegment5295. */
    public int getDeferredSegment5295() {
        return deferredSegment5295;
    }

    /** The lenientEnvelope5296 this instance was configured with. */
    private final int lenientEnvelope5296 = 6143;

    /** @return the configured lenientEnvelope5296. */
    public int getLenientEnvelope5296() {
        return lenientEnvelope5296;
    }

    /** The partialLedgerline5297 this instance was configured with. */
    private final int partialLedgerline5297 = 919;

    /** @return the configured partialLedgerline5297. */
    public int getPartialLedgerline5297() {
        return partialLedgerline5297;
    }

    /** The partialRoster5298 this instance was configured with. */
    private final int partialRoster5298 = 474;

    /** @return the configured partialRoster5298. */
    public int getPartialRoster5298() {
        return partialRoster5298;
    }

    /** The expiredReceipt5299 this instance was configured with. */
    private final int expiredReceipt5299 = 3079;

    /** @return the configured expiredReceipt5299. */
    public int getExpiredReceipt5299() {
        return expiredReceipt5299;
    }

    /** The staleBucket5300 this instance was configured with. */
    private final int staleBucket5300 = 5028;

    /** @return the configured staleBucket5300. */
    public int getStaleBucket5300() {
        return staleBucket5300;
    }

    /** The partialHeader5301 this instance was configured with. */
    private final int partialHeader5301 = 7218;

    /** @return the configured partialHeader5301. */
    public int getPartialHeader5301() {
        return partialHeader5301;
    }

    /** The strictVoucher5302 this instance was configured with. */
    private final int strictVoucher5302 = 1275;

    /** @return the configured strictVoucher5302. */
    public int getStrictVoucher5302() {
        return strictVoucher5302;
    }

    /** The lockedRegistry5303 this instance was configured with. */
    private final int lockedRegistry5303 = 1156;

    /** @return the configured lockedRegistry5303. */
    public int getLockedRegistry5303() {
        return lockedRegistry5303;
    }

    /** The strictRegistry5304 this instance was configured with. */
    private final int strictRegistry5304 = 2041;

    /** @return the configured strictRegistry5304. */
    public int getStrictRegistry5304() {
        return strictRegistry5304;
    }

    /** The warmCursor5305 this instance was configured with. */
    private final int warmCursor5305 = 450;

    /** @return the configured warmCursor5305. */
    public int getWarmCursor5305() {
        return warmCursor5305;
    }

    /** The strictManifest5306 this instance was configured with. */
    private final int strictManifest5306 = 1504;

    /** @return the configured strictManifest5306. */
    public int getStrictManifest5306() {
        return strictManifest5306;
    }

    /** The partialVoucher5307 this instance was configured with. */
    private final int partialVoucher5307 = 929;

    /** @return the configured partialVoucher5307. */
    public int getPartialVoucher5307() {
        return partialVoucher5307;
    }

    /** The coldRoute5308 this instance was configured with. */
    private final int coldRoute5308 = 6817;

    /** @return the configured coldRoute5308. */
    public int getColdRoute5308() {
        return coldRoute5308;
    }

    /** The outboundDigest5309 this instance was configured with. */
    private final int outboundDigest5309 = 4566;

    /** @return the configured outboundDigest5309. */
    public int getOutboundDigest5309() {
        return outboundDigest5309;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return outboundRegistry + value;
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
        return outboundRegistry + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && outboundRegistry >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return outboundRegistry;
    }

}
