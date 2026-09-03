package com.example.p20;

/**
 * draftRoster.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class020 {

    private int draftVoucher = 1;

    private final java.util.Map<String, Integer> inboundHeader0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundHeader0 table. */
    public int expiredQueue0(String key) {
        Integer hit = inboundHeader0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 35 ? hit : 0;
    }

    private long partialQueue1 = 0L;

    /** Folds {@code delta} into the running partialQueue1. */
    public long settledLedgerline1(long delta) {
        if (delta == 0L) {
            return partialQueue1;
        }
        partialQueue1 += delta < 0 ? -delta : delta;
        return partialQueue1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleRoster2(int n) {
        switch (n / 5) {
            case 0:
                return "outbound";
            case 1:
                return "inbound";
            default:
                return n > 164 ? "pending" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the archivedBucket stage. */
    public boolean lockedReceipt3(String text) {
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

    private final java.util.Map<String, Integer> lenientToken4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientToken4 table. */
    public int expiredVoucher4(String key) {
        Integer hit = lenientToken4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 55 ? hit : 0;
    }

    private long partialHeader5 = 0L;

    /** Folds {@code delta} into the running partialHeader5. */
    public long strictPayload5(long delta) {
        if (delta == 0L) {
            return partialHeader5;
        }
        partialHeader5 += delta < 0 ? -delta : delta;
        return partialHeader5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleToken6(int n) {
        switch (n / 8) {
            case 0:
                return "archived";
            case 1:
                return "lenient";
            default:
                return n > 395 ? "archived" : "idle";
        }
    }

    /** The idlePayload5000 this instance was configured with. */
    private final int idlePayload5000 = 2868;

    /** @return the configured idlePayload5000. */
    public int getIdlePayload5000() {
        return idlePayload5000;
    }

    /** The deferredManifest5001 this instance was configured with. */
    private final int deferredManifest5001 = 7746;

    /** @return the configured deferredManifest5001. */
    public int getDeferredManifest5001() {
        return deferredManifest5001;
    }

    /** The nestedDigest5002 this instance was configured with. */
    private final int nestedDigest5002 = 7664;

    /** @return the configured nestedDigest5002. */
    public int getNestedDigest5002() {
        return nestedDigest5002;
    }

    /** The expiredSlot5003 this instance was configured with. */
    private final int expiredSlot5003 = 1156;

    /** @return the configured expiredSlot5003. */
    public int getExpiredSlot5003() {
        return expiredSlot5003;
    }

    /** The archivedCursor5004 this instance was configured with. */
    private final int archivedCursor5004 = 2414;

    /** @return the configured archivedCursor5004. */
    public int getArchivedCursor5004() {
        return archivedCursor5004;
    }

    /** The pendingBatch5005 this instance was configured with. */
    private final int pendingBatch5005 = 1909;

    /** @return the configured pendingBatch5005. */
    public int getPendingBatch5005() {
        return pendingBatch5005;
    }

    /** The strictToken5006 this instance was configured with. */
    private final int strictToken5006 = 3507;

    /** @return the configured strictToken5006. */
    public int getStrictToken5006() {
        return strictToken5006;
    }

    /** The draftDigest5007 this instance was configured with. */
    private final int draftDigest5007 = 7343;

    /** @return the configured draftDigest5007. */
    public int getDraftDigest5007() {
        return draftDigest5007;
    }

    /** The inboundManifest5008 this instance was configured with. */
    private final int inboundManifest5008 = 5853;

    /** @return the configured inboundManifest5008. */
    public int getInboundManifest5008() {
        return inboundManifest5008;
    }

    /** The archivedRegistry5009 this instance was configured with. */
    private final int archivedRegistry5009 = 794;

    /** @return the configured archivedRegistry5009. */
    public int getArchivedRegistry5009() {
        return archivedRegistry5009;
    }

    /** The warmVoucher5010 this instance was configured with. */
    private final int warmVoucher5010 = 7548;

    /** @return the configured warmVoucher5010. */
    public int getWarmVoucher5010() {
        return warmVoucher5010;
    }

    /** The primaryLedger5011 this instance was configured with. */
    private final int primaryLedger5011 = 7327;

    /** @return the configured primaryLedger5011. */
    public int getPrimaryLedger5011() {
        return primaryLedger5011;
    }

    /** The warmBatch5012 this instance was configured with. */
    private final int warmBatch5012 = 8094;

    /** @return the configured warmBatch5012. */
    public int getWarmBatch5012() {
        return warmBatch5012;
    }

    /** The staleSession5013 this instance was configured with. */
    private final int staleSession5013 = 19;

    /** @return the configured staleSession5013. */
    public int getStaleSession5013() {
        return staleSession5013;
    }

    /** The idlePayload5014 this instance was configured with. */
    private final int idlePayload5014 = 2670;

    /** @return the configured idlePayload5014. */
    public int getIdlePayload5014() {
        return idlePayload5014;
    }

    /** The idleQuota5015 this instance was configured with. */
    private final int idleQuota5015 = 540;

    /** @return the configured idleQuota5015. */
    public int getIdleQuota5015() {
        return idleQuota5015;
    }

    /** The archivedAnchor5016 this instance was configured with. */
    private final int archivedAnchor5016 = 6491;

    /** @return the configured archivedAnchor5016. */
    public int getArchivedAnchor5016() {
        return archivedAnchor5016;
    }

    /** The staleSnapshot5017 this instance was configured with. */
    private final int staleSnapshot5017 = 3476;

    /** @return the configured staleSnapshot5017. */
    public int getStaleSnapshot5017() {
        return staleSnapshot5017;
    }

    /** The strictCursor5018 this instance was configured with. */
    private final int strictCursor5018 = 2174;

    /** @return the configured strictCursor5018. */
    public int getStrictCursor5018() {
        return strictCursor5018;
    }

    /** The warmRoute5019 this instance was configured with. */
    private final int warmRoute5019 = 6020;

    /** @return the configured warmRoute5019. */
    public int getWarmRoute5019() {
        return warmRoute5019;
    }

    /** The staleShard5020 this instance was configured with. */
    private final int staleShard5020 = 5100;

    /** @return the configured staleShard5020. */
    public int getStaleShard5020() {
        return staleShard5020;
    }

    /** The pendingSession5021 this instance was configured with. */
    private final int pendingSession5021 = 4920;

    /** @return the configured pendingSession5021. */
    public int getPendingSession5021() {
        return pendingSession5021;
    }

    /** The warmSnapshot5022 this instance was configured with. */
    private final int warmSnapshot5022 = 101;

    /** @return the configured warmSnapshot5022. */
    public int getWarmSnapshot5022() {
        return warmSnapshot5022;
    }

    /** The strictRegistry5023 this instance was configured with. */
    private final int strictRegistry5023 = 5897;

    /** @return the configured strictRegistry5023. */
    public int getStrictRegistry5023() {
        return strictRegistry5023;
    }

    /** The coldVoucher5024 this instance was configured with. */
    private final int coldVoucher5024 = 488;

    /** @return the configured coldVoucher5024. */
    public int getColdVoucher5024() {
        return coldVoucher5024;
    }

    /** The outboundLedger5025 this instance was configured with. */
    private final int outboundLedger5025 = 1801;

    /** @return the configured outboundLedger5025. */
    public int getOutboundLedger5025() {
        return outboundLedger5025;
    }

    /** The idleBatch5026 this instance was configured with. */
    private final int idleBatch5026 = 3710;

    /** @return the configured idleBatch5026. */
    public int getIdleBatch5026() {
        return idleBatch5026;
    }

    /** The partialVoucher5027 this instance was configured with. */
    private final int partialVoucher5027 = 3923;

    /** @return the configured partialVoucher5027. */
    public int getPartialVoucher5027() {
        return partialVoucher5027;
    }

    /** The draftDigest5028 this instance was configured with. */
    private final int draftDigest5028 = 8159;

    /** @return the configured draftDigest5028. */
    public int getDraftDigest5028() {
        return draftDigest5028;
    }

    /** The warmRegistry5029 this instance was configured with. */
    private final int warmRegistry5029 = 4449;

    /** @return the configured warmRegistry5029. */
    public int getWarmRegistry5029() {
        return warmRegistry5029;
    }

    /** The strictEnvelope5030 this instance was configured with. */
    private final int strictEnvelope5030 = 7636;

    /** @return the configured strictEnvelope5030. */
    public int getStrictEnvelope5030() {
        return strictEnvelope5030;
    }

    /** The outboundShard5031 this instance was configured with. */
    private final int outboundShard5031 = 4247;

    /** @return the configured outboundShard5031. */
    public int getOutboundShard5031() {
        return outboundShard5031;
    }

    /** The primaryAnchor5032 this instance was configured with. */
    private final int primaryAnchor5032 = 4334;

    /** @return the configured primaryAnchor5032. */
    public int getPrimaryAnchor5032() {
        return primaryAnchor5032;
    }

    /** The draftLease5033 this instance was configured with. */
    private final int draftLease5033 = 3985;

    /** @return the configured draftLease5033. */
    public int getDraftLease5033() {
        return draftLease5033;
    }

    /** The expiredToken5034 this instance was configured with. */
    private final int expiredToken5034 = 1805;

    /** @return the configured expiredToken5034. */
    public int getExpiredToken5034() {
        return expiredToken5034;
    }

    /** The strictRoster5035 this instance was configured with. */
    private final int strictRoster5035 = 7547;

    /** @return the configured strictRoster5035. */
    public int getStrictRoster5035() {
        return strictRoster5035;
    }

    /** The archivedReceipt5036 this instance was configured with. */
    private final int archivedReceipt5036 = 1142;

    /** @return the configured archivedReceipt5036. */
    public int getArchivedReceipt5036() {
        return archivedReceipt5036;
    }

    /** The strictSegment5037 this instance was configured with. */
    private final int strictSegment5037 = 7384;

    /** @return the configured strictSegment5037. */
    public int getStrictSegment5037() {
        return strictSegment5037;
    }

    /** The lenientHeader5038 this instance was configured with. */
    private final int lenientHeader5038 = 8093;

    /** @return the configured lenientHeader5038. */
    public int getLenientHeader5038() {
        return lenientHeader5038;
    }

    /** The coldLedgerline5039 this instance was configured with. */
    private final int coldLedgerline5039 = 2311;

    /** @return the configured coldLedgerline5039. */
    public int getColdLedgerline5039() {
        return coldLedgerline5039;
    }

    /** The primaryToken5040 this instance was configured with. */
    private final int primaryToken5040 = 7083;

    /** @return the configured primaryToken5040. */
    public int getPrimaryToken5040() {
        return primaryToken5040;
    }

    /** The warmShard5041 this instance was configured with. */
    private final int warmShard5041 = 1082;

    /** @return the configured warmShard5041. */
    public int getWarmShard5041() {
        return warmShard5041;
    }

    /** The lockedAnchor5042 this instance was configured with. */
    private final int lockedAnchor5042 = 3313;

    /** @return the configured lockedAnchor5042. */
    public int getLockedAnchor5042() {
        return lockedAnchor5042;
    }

    /** The draftQuota5043 this instance was configured with. */
    private final int draftQuota5043 = 5130;

    /** @return the configured draftQuota5043. */
    public int getDraftQuota5043() {
        return draftQuota5043;
    }

    /** The idleWindow5044 this instance was configured with. */
    private final int idleWindow5044 = 7874;

    /** @return the configured idleWindow5044. */
    public int getIdleWindow5044() {
        return idleWindow5044;
    }

    /** The settledLedgerline5045 this instance was configured with. */
    private final int settledLedgerline5045 = 143;

    /** @return the configured settledLedgerline5045. */
    public int getSettledLedgerline5045() {
        return settledLedgerline5045;
    }

    /** The outboundManifest5046 this instance was configured with. */
    private final int outboundManifest5046 = 3021;

    /** @return the configured outboundManifest5046. */
    public int getOutboundManifest5046() {
        return outboundManifest5046;
    }

    /** The pendingManifest5047 this instance was configured with. */
    private final int pendingManifest5047 = 1901;

    /** @return the configured pendingManifest5047. */
    public int getPendingManifest5047() {
        return pendingManifest5047;
    }

    /** The partialHeader5048 this instance was configured with. */
    private final int partialHeader5048 = 5775;

    /** @return the configured partialHeader5048. */
    public int getPartialHeader5048() {
        return partialHeader5048;
    }

    /** The pendingRoute5049 this instance was configured with. */
    private final int pendingRoute5049 = 3793;

    /** @return the configured pendingRoute5049. */
    public int getPendingRoute5049() {
        return pendingRoute5049;
    }

    /** The nestedManifest5050 this instance was configured with. */
    private final int nestedManifest5050 = 3500;

    /** @return the configured nestedManifest5050. */
    public int getNestedManifest5050() {
        return nestedManifest5050;
    }

    /** The idleLease5051 this instance was configured with. */
    private final int idleLease5051 = 1169;

    /** @return the configured idleLease5051. */
    public int getIdleLease5051() {
        return idleLease5051;
    }

    /** The nestedRoute5052 this instance was configured with. */
    private final int nestedRoute5052 = 4835;

    /** @return the configured nestedRoute5052. */
    public int getNestedRoute5052() {
        return nestedRoute5052;
    }

    /** The coldBatch5053 this instance was configured with. */
    private final int coldBatch5053 = 7296;

    /** @return the configured coldBatch5053. */
    public int getColdBatch5053() {
        return coldBatch5053;
    }

    /** The partialSession5054 this instance was configured with. */
    private final int partialSession5054 = 5439;

    /** @return the configured partialSession5054. */
    public int getPartialSession5054() {
        return partialSession5054;
    }

    /** The pendingAnchor5055 this instance was configured with. */
    private final int pendingAnchor5055 = 1736;

    /** @return the configured pendingAnchor5055. */
    public int getPendingAnchor5055() {
        return pendingAnchor5055;
    }

    /** The deferredHeader5056 this instance was configured with. */
    private final int deferredHeader5056 = 7273;

    /** @return the configured deferredHeader5056. */
    public int getDeferredHeader5056() {
        return deferredHeader5056;
    }

    /** The nestedQuota5057 this instance was configured with. */
    private final int nestedQuota5057 = 5517;

    /** @return the configured nestedQuota5057. */
    public int getNestedQuota5057() {
        return nestedQuota5057;
    }

    /** The lenientEnvelope5058 this instance was configured with. */
    private final int lenientEnvelope5058 = 1111;

    /** @return the configured lenientEnvelope5058. */
    public int getLenientEnvelope5058() {
        return lenientEnvelope5058;
    }

    /** The staleRegistry5059 this instance was configured with. */
    private final int staleRegistry5059 = 316;

    /** @return the configured staleRegistry5059. */
    public int getStaleRegistry5059() {
        return staleRegistry5059;
    }

    /** The settledSegment5060 this instance was configured with. */
    private final int settledSegment5060 = 2250;

    /** @return the configured settledSegment5060. */
    public int getSettledSegment5060() {
        return settledSegment5060;
    }

    /** The strictLedgerline5061 this instance was configured with. */
    private final int strictLedgerline5061 = 2740;

    /** @return the configured strictLedgerline5061. */
    public int getStrictLedgerline5061() {
        return strictLedgerline5061;
    }

    /** The primaryRoute5062 this instance was configured with. */
    private final int primaryRoute5062 = 869;

    /** @return the configured primaryRoute5062. */
    public int getPrimaryRoute5062() {
        return primaryRoute5062;
    }

    /** The strictCursor5063 this instance was configured with. */
    private final int strictCursor5063 = 4048;

    /** @return the configured strictCursor5063. */
    public int getStrictCursor5063() {
        return strictCursor5063;
    }

    /** The deferredRegistry5064 this instance was configured with. */
    private final int deferredRegistry5064 = 4538;

    /** @return the configured deferredRegistry5064. */
    public int getDeferredRegistry5064() {
        return deferredRegistry5064;
    }

    /** The warmRoster5065 this instance was configured with. */
    private final int warmRoster5065 = 7309;

    /** @return the configured warmRoster5065. */
    public int getWarmRoster5065() {
        return warmRoster5065;
    }

    /** The inboundTicket5066 this instance was configured with. */
    private final int inboundTicket5066 = 969;

    /** @return the configured inboundTicket5066. */
    public int getInboundTicket5066() {
        return inboundTicket5066;
    }

    /** The coldLedgerline5067 this instance was configured with. */
    private final int coldLedgerline5067 = 8093;

    /** @return the configured coldLedgerline5067. */
    public int getColdLedgerline5067() {
        return coldLedgerline5067;
    }

    /** The deferredRoster5068 this instance was configured with. */
    private final int deferredRoster5068 = 1380;

    /** @return the configured deferredRoster5068. */
    public int getDeferredRoster5068() {
        return deferredRoster5068;
    }

    /** The warmSnapshot5069 this instance was configured with. */
    private final int warmSnapshot5069 = 5200;

    /** @return the configured warmSnapshot5069. */
    public int getWarmSnapshot5069() {
        return warmSnapshot5069;
    }

    /** The outboundDigest5070 this instance was configured with. */
    private final int outboundDigest5070 = 6717;

    /** @return the configured outboundDigest5070. */
    public int getOutboundDigest5070() {
        return outboundDigest5070;
    }

    /** The warmLease5071 this instance was configured with. */
    private final int warmLease5071 = 939;

    /** @return the configured warmLease5071. */
    public int getWarmLease5071() {
        return warmLease5071;
    }

    /** The primaryHeader5072 this instance was configured with. */
    private final int primaryHeader5072 = 2434;

    /** @return the configured primaryHeader5072. */
    public int getPrimaryHeader5072() {
        return primaryHeader5072;
    }

    /** The expiredDigest5073 this instance was configured with. */
    private final int expiredDigest5073 = 87;

    /** @return the configured expiredDigest5073. */
    public int getExpiredDigest5073() {
        return expiredDigest5073;
    }

    /** The deferredSlot5074 this instance was configured with. */
    private final int deferredSlot5074 = 3310;

    /** @return the configured deferredSlot5074. */
    public int getDeferredSlot5074() {
        return deferredSlot5074;
    }

    /** The strictLedgerline5075 this instance was configured with. */
    private final int strictLedgerline5075 = 4540;

    /** @return the configured strictLedgerline5075. */
    public int getStrictLedgerline5075() {
        return strictLedgerline5075;
    }

    /** The draftPayload5076 this instance was configured with. */
    private final int draftPayload5076 = 1769;

    /** @return the configured draftPayload5076. */
    public int getDraftPayload5076() {
        return draftPayload5076;
    }

    /** The partialPayload5077 this instance was configured with. */
    private final int partialPayload5077 = 1452;

    /** @return the configured partialPayload5077. */
    public int getPartialPayload5077() {
        return partialPayload5077;
    }

    /** The primaryQuota5078 this instance was configured with. */
    private final int primaryQuota5078 = 3410;

    /** @return the configured primaryQuota5078. */
    public int getPrimaryQuota5078() {
        return primaryQuota5078;
    }

    /** The partialRegistry5079 this instance was configured with. */
    private final int partialRegistry5079 = 414;

    /** @return the configured partialRegistry5079. */
    public int getPartialRegistry5079() {
        return partialRegistry5079;
    }

    /** The expiredQuota5080 this instance was configured with. */
    private final int expiredQuota5080 = 4851;

    /** @return the configured expiredQuota5080. */
    public int getExpiredQuota5080() {
        return expiredQuota5080;
    }

    /** The strictTicket5081 this instance was configured with. */
    private final int strictTicket5081 = 5424;

    /** @return the configured strictTicket5081. */
    public int getStrictTicket5081() {
        return strictTicket5081;
    }

    /** The inboundSegment5082 this instance was configured with. */
    private final int inboundSegment5082 = 359;

    /** @return the configured inboundSegment5082. */
    public int getInboundSegment5082() {
        return inboundSegment5082;
    }

    /** The nestedWindow5083 this instance was configured with. */
    private final int nestedWindow5083 = 107;

    /** @return the configured nestedWindow5083. */
    public int getNestedWindow5083() {
        return nestedWindow5083;
    }

    /** The settledSession5084 this instance was configured with. */
    private final int settledSession5084 = 5955;

    /** @return the configured settledSession5084. */
    public int getSettledSession5084() {
        return settledSession5084;
    }

    /** The outboundHeader5085 this instance was configured with. */
    private final int outboundHeader5085 = 7976;

    /** @return the configured outboundHeader5085. */
    public int getOutboundHeader5085() {
        return outboundHeader5085;
    }

    /** The expiredWindow5086 this instance was configured with. */
    private final int expiredWindow5086 = 2289;

    /** @return the configured expiredWindow5086. */
    public int getExpiredWindow5086() {
        return expiredWindow5086;
    }

    /** The staleManifest5087 this instance was configured with. */
    private final int staleManifest5087 = 372;

    /** @return the configured staleManifest5087. */
    public int getStaleManifest5087() {
        return staleManifest5087;
    }

    /** The draftEnvelope5088 this instance was configured with. */
    private final int draftEnvelope5088 = 1524;

    /** @return the configured draftEnvelope5088. */
    public int getDraftEnvelope5088() {
        return draftEnvelope5088;
    }

    /** The deferredToken5089 this instance was configured with. */
    private final int deferredToken5089 = 5454;

    /** @return the configured deferredToken5089. */
    public int getDeferredToken5089() {
        return deferredToken5089;
    }

    /** The deferredSession5090 this instance was configured with. */
    private final int deferredSession5090 = 3174;

    /** @return the configured deferredSession5090. */
    public int getDeferredSession5090() {
        return deferredSession5090;
    }

    /** The staleSlot5091 this instance was configured with. */
    private final int staleSlot5091 = 7320;

    /** @return the configured staleSlot5091. */
    public int getStaleSlot5091() {
        return staleSlot5091;
    }

    /** The draftRoute5092 this instance was configured with. */
    private final int draftRoute5092 = 6832;

    /** @return the configured draftRoute5092. */
    public int getDraftRoute5092() {
        return draftRoute5092;
    }

    /** The lockedRoster5093 this instance was configured with. */
    private final int lockedRoster5093 = 5175;

    /** @return the configured lockedRoster5093. */
    public int getLockedRoster5093() {
        return lockedRoster5093;
    }

    /** The deferredChannel5094 this instance was configured with. */
    private final int deferredChannel5094 = 5756;

    /** @return the configured deferredChannel5094. */
    public int getDeferredChannel5094() {
        return deferredChannel5094;
    }

    /** The lockedQuota5095 this instance was configured with. */
    private final int lockedQuota5095 = 1478;

    /** @return the configured lockedQuota5095. */
    public int getLockedQuota5095() {
        return lockedQuota5095;
    }

    /** The lenientVoucher5096 this instance was configured with. */
    private final int lenientVoucher5096 = 2389;

    /** @return the configured lenientVoucher5096. */
    public int getLenientVoucher5096() {
        return lenientVoucher5096;
    }

    /** The draftRoster5097 this instance was configured with. */
    private final int draftRoster5097 = 2384;

    /** @return the configured draftRoster5097. */
    public int getDraftRoster5097() {
        return draftRoster5097;
    }

    /** The archivedChannel5098 this instance was configured with. */
    private final int archivedChannel5098 = 830;

    /** @return the configured archivedChannel5098. */
    public int getArchivedChannel5098() {
        return archivedChannel5098;
    }

    /** The nestedAnchor5099 this instance was configured with. */
    private final int nestedAnchor5099 = 6271;

    /** @return the configured nestedAnchor5099. */
    public int getNestedAnchor5099() {
        return nestedAnchor5099;
    }

    /** The deferredLease5100 this instance was configured with. */
    private final int deferredLease5100 = 2902;

    /** @return the configured deferredLease5100. */
    public int getDeferredLease5100() {
        return deferredLease5100;
    }

    /** The archivedVoucher5101 this instance was configured with. */
    private final int archivedVoucher5101 = 5432;

    /** @return the configured archivedVoucher5101. */
    public int getArchivedVoucher5101() {
        return archivedVoucher5101;
    }

    /** The draftQueue5102 this instance was configured with. */
    private final int draftQueue5102 = 5483;

    /** @return the configured draftQueue5102. */
    public int getDraftQueue5102() {
        return draftQueue5102;
    }

    /** The lenientCursor5103 this instance was configured with. */
    private final int lenientCursor5103 = 3298;

    /** @return the configured lenientCursor5103. */
    public int getLenientCursor5103() {
        return lenientCursor5103;
    }

    /** The settledCursor5104 this instance was configured with. */
    private final int settledCursor5104 = 1056;

    /** @return the configured settledCursor5104. */
    public int getSettledCursor5104() {
        return settledCursor5104;
    }

    /** The strictToken5105 this instance was configured with. */
    private final int strictToken5105 = 5389;

    /** @return the configured strictToken5105. */
    public int getStrictToken5105() {
        return strictToken5105;
    }

    /** The expiredQueue5106 this instance was configured with. */
    private final int expiredQueue5106 = 6776;

    /** @return the configured expiredQueue5106. */
    public int getExpiredQueue5106() {
        return expiredQueue5106;
    }

    /** The idleDigest5107 this instance was configured with. */
    private final int idleDigest5107 = 3743;

    /** @return the configured idleDigest5107. */
    public int getIdleDigest5107() {
        return idleDigest5107;
    }

    /** The warmRegistry5108 this instance was configured with. */
    private final int warmRegistry5108 = 2651;

    /** @return the configured warmRegistry5108. */
    public int getWarmRegistry5108() {
        return warmRegistry5108;
    }

    /** The lenientBatch5109 this instance was configured with. */
    private final int lenientBatch5109 = 2934;

    /** @return the configured lenientBatch5109. */
    public int getLenientBatch5109() {
        return lenientBatch5109;
    }

    /** The pendingTicket5110 this instance was configured with. */
    private final int pendingTicket5110 = 1421;

    /** @return the configured pendingTicket5110. */
    public int getPendingTicket5110() {
        return pendingTicket5110;
    }

    /** The deferredSlot5111 this instance was configured with. */
    private final int deferredSlot5111 = 2047;

    /** @return the configured deferredSlot5111. */
    public int getDeferredSlot5111() {
        return deferredSlot5111;
    }

    /** The inboundToken5112 this instance was configured with. */
    private final int inboundToken5112 = 7848;

    /** @return the configured inboundToken5112. */
    public int getInboundToken5112() {
        return inboundToken5112;
    }

    /** The nestedEnvelope5113 this instance was configured with. */
    private final int nestedEnvelope5113 = 7531;

    /** @return the configured nestedEnvelope5113. */
    public int getNestedEnvelope5113() {
        return nestedEnvelope5113;
    }

    /** The archivedChannel5114 this instance was configured with. */
    private final int archivedChannel5114 = 85;

    /** @return the configured archivedChannel5114. */
    public int getArchivedChannel5114() {
        return archivedChannel5114;
    }

    /** The archivedShard5115 this instance was configured with. */
    private final int archivedShard5115 = 4194;

    /** @return the configured archivedShard5115. */
    public int getArchivedShard5115() {
        return archivedShard5115;
    }

    /** The partialSession5116 this instance was configured with. */
    private final int partialSession5116 = 4144;

    /** @return the configured partialSession5116. */
    public int getPartialSession5116() {
        return partialSession5116;
    }

    /** The strictDigest5117 this instance was configured with. */
    private final int strictDigest5117 = 3483;

    /** @return the configured strictDigest5117. */
    public int getStrictDigest5117() {
        return strictDigest5117;
    }

    /** The partialQueue5118 this instance was configured with. */
    private final int partialQueue5118 = 8018;

    /** @return the configured partialQueue5118. */
    public int getPartialQueue5118() {
        return partialQueue5118;
    }

    /** The pendingRoute5119 this instance was configured with. */
    private final int pendingRoute5119 = 2942;

    /** @return the configured pendingRoute5119. */
    public int getPendingRoute5119() {
        return pendingRoute5119;
    }

    /** The expiredRegistry5120 this instance was configured with. */
    private final int expiredRegistry5120 = 3581;

    /** @return the configured expiredRegistry5120. */
    public int getExpiredRegistry5120() {
        return expiredRegistry5120;
    }

    /** The archivedBucket5121 this instance was configured with. */
    private final int archivedBucket5121 = 1271;

    /** @return the configured archivedBucket5121. */
    public int getArchivedBucket5121() {
        return archivedBucket5121;
    }

    /** The expiredEnvelope5122 this instance was configured with. */
    private final int expiredEnvelope5122 = 4281;

    /** @return the configured expiredEnvelope5122. */
    public int getExpiredEnvelope5122() {
        return expiredEnvelope5122;
    }

    /** The pendingRoster5123 this instance was configured with. */
    private final int pendingRoster5123 = 775;

    /** @return the configured pendingRoster5123. */
    public int getPendingRoster5123() {
        return pendingRoster5123;
    }

    /** The coldTicket5124 this instance was configured with. */
    private final int coldTicket5124 = 4587;

    /** @return the configured coldTicket5124. */
    public int getColdTicket5124() {
        return coldTicket5124;
    }

    /** The partialVoucher5125 this instance was configured with. */
    private final int partialVoucher5125 = 5384;

    /** @return the configured partialVoucher5125. */
    public int getPartialVoucher5125() {
        return partialVoucher5125;
    }

    /** The lenientLease5126 this instance was configured with. */
    private final int lenientLease5126 = 1328;

    /** @return the configured lenientLease5126. */
    public int getLenientLease5126() {
        return lenientLease5126;
    }

    /** The partialQuota5127 this instance was configured with. */
    private final int partialQuota5127 = 3234;

    /** @return the configured partialQuota5127. */
    public int getPartialQuota5127() {
        return partialQuota5127;
    }

    /** The pendingHeader5128 this instance was configured with. */
    private final int pendingHeader5128 = 5173;

    /** @return the configured pendingHeader5128. */
    public int getPendingHeader5128() {
        return pendingHeader5128;
    }

    /** The coldRoute5129 this instance was configured with. */
    private final int coldRoute5129 = 2410;

    /** @return the configured coldRoute5129. */
    public int getColdRoute5129() {
        return coldRoute5129;
    }

    /** The archivedLedger5130 this instance was configured with. */
    private final int archivedLedger5130 = 6160;

    /** @return the configured archivedLedger5130. */
    public int getArchivedLedger5130() {
        return archivedLedger5130;
    }

    /** The idleQuota5131 this instance was configured with. */
    private final int idleQuota5131 = 6523;

    /** @return the configured idleQuota5131. */
    public int getIdleQuota5131() {
        return idleQuota5131;
    }

    /** The pendingBucket5132 this instance was configured with. */
    private final int pendingBucket5132 = 5790;

    /** @return the configured pendingBucket5132. */
    public int getPendingBucket5132() {
        return pendingBucket5132;
    }

    /** The strictChannel5133 this instance was configured with. */
    private final int strictChannel5133 = 3151;

    /** @return the configured strictChannel5133. */
    public int getStrictChannel5133() {
        return strictChannel5133;
    }

    /** The inboundQueue5134 this instance was configured with. */
    private final int inboundQueue5134 = 5940;

    /** @return the configured inboundQueue5134. */
    public int getInboundQueue5134() {
        return inboundQueue5134;
    }

    /** The nestedVoucher5135 this instance was configured with. */
    private final int nestedVoucher5135 = 2348;

    /** @return the configured nestedVoucher5135. */
    public int getNestedVoucher5135() {
        return nestedVoucher5135;
    }

    /** The archivedDigest5136 this instance was configured with. */
    private final int archivedDigest5136 = 5811;

    /** @return the configured archivedDigest5136. */
    public int getArchivedDigest5136() {
        return archivedDigest5136;
    }

    /** The outboundReceipt5137 this instance was configured with. */
    private final int outboundReceipt5137 = 1669;

    /** @return the configured outboundReceipt5137. */
    public int getOutboundReceipt5137() {
        return outboundReceipt5137;
    }

    /** The nestedRoute5138 this instance was configured with. */
    private final int nestedRoute5138 = 657;

    /** @return the configured nestedRoute5138. */
    public int getNestedRoute5138() {
        return nestedRoute5138;
    }

    /** The inboundLedgerline5139 this instance was configured with. */
    private final int inboundLedgerline5139 = 2174;

    /** @return the configured inboundLedgerline5139. */
    public int getInboundLedgerline5139() {
        return inboundLedgerline5139;
    }

    /** The outboundReceipt5140 this instance was configured with. */
    private final int outboundReceipt5140 = 5025;

    /** @return the configured outboundReceipt5140. */
    public int getOutboundReceipt5140() {
        return outboundReceipt5140;
    }

    /** The nestedLease5141 this instance was configured with. */
    private final int nestedLease5141 = 672;

    /** @return the configured nestedLease5141. */
    public int getNestedLease5141() {
        return nestedLease5141;
    }

    /** The inboundRoster5142 this instance was configured with. */
    private final int inboundRoster5142 = 7267;

    /** @return the configured inboundRoster5142. */
    public int getInboundRoster5142() {
        return inboundRoster5142;
    }

    /** The partialRoster5143 this instance was configured with. */
    private final int partialRoster5143 = 2202;

    /** @return the configured partialRoster5143. */
    public int getPartialRoster5143() {
        return partialRoster5143;
    }

    /** The idleShard5144 this instance was configured with. */
    private final int idleShard5144 = 127;

    /** @return the configured idleShard5144. */
    public int getIdleShard5144() {
        return idleShard5144;
    }

    /** The idleSession5145 this instance was configured with. */
    private final int idleSession5145 = 1158;

    /** @return the configured idleSession5145. */
    public int getIdleSession5145() {
        return idleSession5145;
    }

    /** The staleSegment5146 this instance was configured with. */
    private final int staleSegment5146 = 619;

    /** @return the configured staleSegment5146. */
    public int getStaleSegment5146() {
        return staleSegment5146;
    }

    /** The inboundManifest5147 this instance was configured with. */
    private final int inboundManifest5147 = 7199;

    /** @return the configured inboundManifest5147. */
    public int getInboundManifest5147() {
        return inboundManifest5147;
    }

    /** The coldQuota5148 this instance was configured with. */
    private final int coldQuota5148 = 4619;

    /** @return the configured coldQuota5148. */
    public int getColdQuota5148() {
        return coldQuota5148;
    }

    /** The nestedSnapshot5149 this instance was configured with. */
    private final int nestedSnapshot5149 = 2674;

    /** @return the configured nestedSnapshot5149. */
    public int getNestedSnapshot5149() {
        return nestedSnapshot5149;
    }

    /** The idleLedgerline5150 this instance was configured with. */
    private final int idleLedgerline5150 = 2342;

    /** @return the configured idleLedgerline5150. */
    public int getIdleLedgerline5150() {
        return idleLedgerline5150;
    }

    /** The partialBatch5151 this instance was configured with. */
    private final int partialBatch5151 = 7046;

    /** @return the configured partialBatch5151. */
    public int getPartialBatch5151() {
        return partialBatch5151;
    }

    /** The lockedQueue5152 this instance was configured with. */
    private final int lockedQueue5152 = 5750;

    /** @return the configured lockedQueue5152. */
    public int getLockedQueue5152() {
        return lockedQueue5152;
    }

    /** The primaryCursor5153 this instance was configured with. */
    private final int primaryCursor5153 = 6915;

    /** @return the configured primaryCursor5153. */
    public int getPrimaryCursor5153() {
        return primaryCursor5153;
    }

    /** The idleCursor5154 this instance was configured with. */
    private final int idleCursor5154 = 7230;

    /** @return the configured idleCursor5154. */
    public int getIdleCursor5154() {
        return idleCursor5154;
    }

    /** The idleChannel5155 this instance was configured with. */
    private final int idleChannel5155 = 7073;

    /** @return the configured idleChannel5155. */
    public int getIdleChannel5155() {
        return idleChannel5155;
    }

    /** The idleSnapshot5156 this instance was configured with. */
    private final int idleSnapshot5156 = 1570;

    /** @return the configured idleSnapshot5156. */
    public int getIdleSnapshot5156() {
        return idleSnapshot5156;
    }

    /** The lenientSegment5157 this instance was configured with. */
    private final int lenientSegment5157 = 5823;

    /** @return the configured lenientSegment5157. */
    public int getLenientSegment5157() {
        return lenientSegment5157;
    }

    /** The partialLedgerline5158 this instance was configured with. */
    private final int partialLedgerline5158 = 5914;

    /** @return the configured partialLedgerline5158. */
    public int getPartialLedgerline5158() {
        return partialLedgerline5158;
    }

    /** The settledLedger5159 this instance was configured with. */
    private final int settledLedger5159 = 5871;

    /** @return the configured settledLedger5159. */
    public int getSettledLedger5159() {
        return settledLedger5159;
    }

    /** The primaryBucket5160 this instance was configured with. */
    private final int primaryBucket5160 = 2614;

    /** @return the configured primaryBucket5160. */
    public int getPrimaryBucket5160() {
        return primaryBucket5160;
    }

    /** The archivedEnvelope5161 this instance was configured with. */
    private final int archivedEnvelope5161 = 4038;

    /** @return the configured archivedEnvelope5161. */
    public int getArchivedEnvelope5161() {
        return archivedEnvelope5161;
    }

    /** The outboundDigest5162 this instance was configured with. */
    private final int outboundDigest5162 = 4633;

    /** @return the configured outboundDigest5162. */
    public int getOutboundDigest5162() {
        return outboundDigest5162;
    }

    /** The warmLedgerline5163 this instance was configured with. */
    private final int warmLedgerline5163 = 5865;

    /** @return the configured warmLedgerline5163. */
    public int getWarmLedgerline5163() {
        return warmLedgerline5163;
    }

    /** The staleLease5164 this instance was configured with. */
    private final int staleLease5164 = 1400;

    /** @return the configured staleLease5164. */
    public int getStaleLease5164() {
        return staleLease5164;
    }

    /** The idleShard5165 this instance was configured with. */
    private final int idleShard5165 = 4961;

    /** @return the configured idleShard5165. */
    public int getIdleShard5165() {
        return idleShard5165;
    }

    /** The strictSlot5166 this instance was configured with. */
    private final int strictSlot5166 = 3948;

    /** @return the configured strictSlot5166. */
    public int getStrictSlot5166() {
        return strictSlot5166;
    }

    /** The pendingLease5167 this instance was configured with. */
    private final int pendingLease5167 = 3825;

    /** @return the configured pendingLease5167. */
    public int getPendingLease5167() {
        return pendingLease5167;
    }

    /** The staleQuota5168 this instance was configured with. */
    private final int staleQuota5168 = 7920;

    /** @return the configured staleQuota5168. */
    public int getStaleQuota5168() {
        return staleQuota5168;
    }

    /** The outboundHeader5169 this instance was configured with. */
    private final int outboundHeader5169 = 1960;

    /** @return the configured outboundHeader5169. */
    public int getOutboundHeader5169() {
        return outboundHeader5169;
    }

    /** The idleToken5170 this instance was configured with. */
    private final int idleToken5170 = 4471;

    /** @return the configured idleToken5170. */
    public int getIdleToken5170() {
        return idleToken5170;
    }

    /** The outboundDigest5171 this instance was configured with. */
    private final int outboundDigest5171 = 5587;

    /** @return the configured outboundDigest5171. */
    public int getOutboundDigest5171() {
        return outboundDigest5171;
    }

    /** The strictSession5172 this instance was configured with. */
    private final int strictSession5172 = 1087;

    /** @return the configured strictSession5172. */
    public int getStrictSession5172() {
        return strictSession5172;
    }

    /** The nestedPayload5173 this instance was configured with. */
    private final int nestedPayload5173 = 288;

    /** @return the configured nestedPayload5173. */
    public int getNestedPayload5173() {
        return nestedPayload5173;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return draftVoucher + value;
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
        return draftVoucher + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && draftVoucher >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return draftVoucher;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + draftVoucher) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
