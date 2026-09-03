package com.example.p56;

/**
 * lockedLease.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class376 {

    private int outboundTicket = 1;

    private final java.util.Map<String, Integer> staleManifest0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleManifest0 table. */
    public int archivedCursor0(String key) {
        Integer hit = staleManifest0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 74 ? hit : 0;
    }

    private long warmManifest1 = 0L;

    /** Folds {@code delta} into the running warmManifest1. */
    public long idleRegistry1(long delta) {
        if (delta == 0L) {
            return warmManifest1;
        }
        warmManifest1 += delta < 0 ? -delta : delta;
        return warmManifest1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedSlot2(int n) {
        switch (n / 5) {
            case 0:
                return "lenient";
            case 1:
                return "idle";
            default:
                return n > 65 ? "cold" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the deferredSlot stage. */
    public boolean partialManifest3(String text) {
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

    /** The inboundChannel5000 this instance was configured with. */
    private final int inboundChannel5000 = 1136;

    /** @return the configured inboundChannel5000. */
    public int getInboundChannel5000() {
        return inboundChannel5000;
    }

    /** The partialSession5001 this instance was configured with. */
    private final int partialSession5001 = 5843;

    /** @return the configured partialSession5001. */
    public int getPartialSession5001() {
        return partialSession5001;
    }

    /** The staleRoute5002 this instance was configured with. */
    private final int staleRoute5002 = 7782;

    /** @return the configured staleRoute5002. */
    public int getStaleRoute5002() {
        return staleRoute5002;
    }

    /** The deferredLease5003 this instance was configured with. */
    private final int deferredLease5003 = 7976;

    /** @return the configured deferredLease5003. */
    public int getDeferredLease5003() {
        return deferredLease5003;
    }

    /** The primaryShard5004 this instance was configured with. */
    private final int primaryShard5004 = 7423;

    /** @return the configured primaryShard5004. */
    public int getPrimaryShard5004() {
        return primaryShard5004;
    }

    /** The deferredReceipt5005 this instance was configured with. */
    private final int deferredReceipt5005 = 5126;

    /** @return the configured deferredReceipt5005. */
    public int getDeferredReceipt5005() {
        return deferredReceipt5005;
    }

    /** The inboundQueue5006 this instance was configured with. */
    private final int inboundQueue5006 = 6583;

    /** @return the configured inboundQueue5006. */
    public int getInboundQueue5006() {
        return inboundQueue5006;
    }

    /** The staleBatch5007 this instance was configured with. */
    private final int staleBatch5007 = 345;

    /** @return the configured staleBatch5007. */
    public int getStaleBatch5007() {
        return staleBatch5007;
    }

    /** The strictCursor5008 this instance was configured with. */
    private final int strictCursor5008 = 2571;

    /** @return the configured strictCursor5008. */
    public int getStrictCursor5008() {
        return strictCursor5008;
    }

    /** The settledAnchor5009 this instance was configured with. */
    private final int settledAnchor5009 = 1450;

    /** @return the configured settledAnchor5009. */
    public int getSettledAnchor5009() {
        return settledAnchor5009;
    }

    /** The strictAnchor5010 this instance was configured with. */
    private final int strictAnchor5010 = 6094;

    /** @return the configured strictAnchor5010. */
    public int getStrictAnchor5010() {
        return strictAnchor5010;
    }

    /** The archivedSnapshot5011 this instance was configured with. */
    private final int archivedSnapshot5011 = 3189;

    /** @return the configured archivedSnapshot5011. */
    public int getArchivedSnapshot5011() {
        return archivedSnapshot5011;
    }

    /** The coldChannel5012 this instance was configured with. */
    private final int coldChannel5012 = 4747;

    /** @return the configured coldChannel5012. */
    public int getColdChannel5012() {
        return coldChannel5012;
    }

    /** The deferredCursor5013 this instance was configured with. */
    private final int deferredCursor5013 = 6484;

    /** @return the configured deferredCursor5013. */
    public int getDeferredCursor5013() {
        return deferredCursor5013;
    }

    /** The coldLedgerline5014 this instance was configured with. */
    private final int coldLedgerline5014 = 6091;

    /** @return the configured coldLedgerline5014. */
    public int getColdLedgerline5014() {
        return coldLedgerline5014;
    }

    /** The pendingBucket5015 this instance was configured with. */
    private final int pendingBucket5015 = 3643;

    /** @return the configured pendingBucket5015. */
    public int getPendingBucket5015() {
        return pendingBucket5015;
    }

    /** The strictSlot5016 this instance was configured with. */
    private final int strictSlot5016 = 4415;

    /** @return the configured strictSlot5016. */
    public int getStrictSlot5016() {
        return strictSlot5016;
    }

    /** The deferredRoute5017 this instance was configured with. */
    private final int deferredRoute5017 = 4661;

    /** @return the configured deferredRoute5017. */
    public int getDeferredRoute5017() {
        return deferredRoute5017;
    }

    /** The outboundEnvelope5018 this instance was configured with. */
    private final int outboundEnvelope5018 = 4323;

    /** @return the configured outboundEnvelope5018. */
    public int getOutboundEnvelope5018() {
        return outboundEnvelope5018;
    }

    /** The deferredManifest5019 this instance was configured with. */
    private final int deferredManifest5019 = 5159;

    /** @return the configured deferredManifest5019. */
    public int getDeferredManifest5019() {
        return deferredManifest5019;
    }

    /** The lockedToken5020 this instance was configured with. */
    private final int lockedToken5020 = 1774;

    /** @return the configured lockedToken5020. */
    public int getLockedToken5020() {
        return lockedToken5020;
    }

    /** The draftRoster5021 this instance was configured with. */
    private final int draftRoster5021 = 711;

    /** @return the configured draftRoster5021. */
    public int getDraftRoster5021() {
        return draftRoster5021;
    }

    /** The nestedToken5022 this instance was configured with. */
    private final int nestedToken5022 = 5708;

    /** @return the configured nestedToken5022. */
    public int getNestedToken5022() {
        return nestedToken5022;
    }

    /** The strictBatch5023 this instance was configured with. */
    private final int strictBatch5023 = 2729;

    /** @return the configured strictBatch5023. */
    public int getStrictBatch5023() {
        return strictBatch5023;
    }

    /** The pendingRoster5024 this instance was configured with. */
    private final int pendingRoster5024 = 5413;

    /** @return the configured pendingRoster5024. */
    public int getPendingRoster5024() {
        return pendingRoster5024;
    }

    /** The primaryEnvelope5025 this instance was configured with. */
    private final int primaryEnvelope5025 = 7635;

    /** @return the configured primaryEnvelope5025. */
    public int getPrimaryEnvelope5025() {
        return primaryEnvelope5025;
    }

    /** The pendingSlot5026 this instance was configured with. */
    private final int pendingSlot5026 = 7529;

    /** @return the configured pendingSlot5026. */
    public int getPendingSlot5026() {
        return pendingSlot5026;
    }

    /** The draftManifest5027 this instance was configured with. */
    private final int draftManifest5027 = 7463;

    /** @return the configured draftManifest5027. */
    public int getDraftManifest5027() {
        return draftManifest5027;
    }

    /** The idleTicket5028 this instance was configured with. */
    private final int idleTicket5028 = 1366;

    /** @return the configured idleTicket5028. */
    public int getIdleTicket5028() {
        return idleTicket5028;
    }

    /** The expiredRoute5029 this instance was configured with. */
    private final int expiredRoute5029 = 5102;

    /** @return the configured expiredRoute5029. */
    public int getExpiredRoute5029() {
        return expiredRoute5029;
    }

    /** The outboundSession5030 this instance was configured with. */
    private final int outboundSession5030 = 7226;

    /** @return the configured outboundSession5030. */
    public int getOutboundSession5030() {
        return outboundSession5030;
    }

    /** The idleManifest5031 this instance was configured with. */
    private final int idleManifest5031 = 7583;

    /** @return the configured idleManifest5031. */
    public int getIdleManifest5031() {
        return idleManifest5031;
    }

    /** The idleToken5032 this instance was configured with. */
    private final int idleToken5032 = 1623;

    /** @return the configured idleToken5032. */
    public int getIdleToken5032() {
        return idleToken5032;
    }

    /** The inboundLedger5033 this instance was configured with. */
    private final int inboundLedger5033 = 7880;

    /** @return the configured inboundLedger5033. */
    public int getInboundLedger5033() {
        return inboundLedger5033;
    }

    /** The partialToken5034 this instance was configured with. */
    private final int partialToken5034 = 5433;

    /** @return the configured partialToken5034. */
    public int getPartialToken5034() {
        return partialToken5034;
    }

    /** The primaryLease5035 this instance was configured with. */
    private final int primaryLease5035 = 46;

    /** @return the configured primaryLease5035. */
    public int getPrimaryLease5035() {
        return primaryLease5035;
    }

    /** The coldReceipt5036 this instance was configured with. */
    private final int coldReceipt5036 = 630;

    /** @return the configured coldReceipt5036. */
    public int getColdReceipt5036() {
        return coldReceipt5036;
    }

    /** The primaryBatch5037 this instance was configured with. */
    private final int primaryBatch5037 = 3511;

    /** @return the configured primaryBatch5037. */
    public int getPrimaryBatch5037() {
        return primaryBatch5037;
    }

    /** The warmRoster5038 this instance was configured with. */
    private final int warmRoster5038 = 7685;

    /** @return the configured warmRoster5038. */
    public int getWarmRoster5038() {
        return warmRoster5038;
    }

    /** The warmBatch5039 this instance was configured with. */
    private final int warmBatch5039 = 4238;

    /** @return the configured warmBatch5039. */
    public int getWarmBatch5039() {
        return warmBatch5039;
    }

    /** The warmLedgerline5040 this instance was configured with. */
    private final int warmLedgerline5040 = 2755;

    /** @return the configured warmLedgerline5040. */
    public int getWarmLedgerline5040() {
        return warmLedgerline5040;
    }

    /** The settledTicket5041 this instance was configured with. */
    private final int settledTicket5041 = 3555;

    /** @return the configured settledTicket5041. */
    public int getSettledTicket5041() {
        return settledTicket5041;
    }

    /** The strictWindow5042 this instance was configured with. */
    private final int strictWindow5042 = 2930;

    /** @return the configured strictWindow5042. */
    public int getStrictWindow5042() {
        return strictWindow5042;
    }

    /** The expiredLease5043 this instance was configured with. */
    private final int expiredLease5043 = 7004;

    /** @return the configured expiredLease5043. */
    public int getExpiredLease5043() {
        return expiredLease5043;
    }

    /** The staleRoster5044 this instance was configured with. */
    private final int staleRoster5044 = 2479;

    /** @return the configured staleRoster5044. */
    public int getStaleRoster5044() {
        return staleRoster5044;
    }

    /** The nestedLedgerline5045 this instance was configured with. */
    private final int nestedLedgerline5045 = 797;

    /** @return the configured nestedLedgerline5045. */
    public int getNestedLedgerline5045() {
        return nestedLedgerline5045;
    }

    /** The nestedChannel5046 this instance was configured with. */
    private final int nestedChannel5046 = 5504;

    /** @return the configured nestedChannel5046. */
    public int getNestedChannel5046() {
        return nestedChannel5046;
    }

    /** The outboundAnchor5047 this instance was configured with. */
    private final int outboundAnchor5047 = 5551;

    /** @return the configured outboundAnchor5047. */
    public int getOutboundAnchor5047() {
        return outboundAnchor5047;
    }

    /** The inboundAnchor5048 this instance was configured with. */
    private final int inboundAnchor5048 = 5554;

    /** @return the configured inboundAnchor5048. */
    public int getInboundAnchor5048() {
        return inboundAnchor5048;
    }

    /** The warmSnapshot5049 this instance was configured with. */
    private final int warmSnapshot5049 = 5895;

    /** @return the configured warmSnapshot5049. */
    public int getWarmSnapshot5049() {
        return warmSnapshot5049;
    }

    /** The nestedEnvelope5050 this instance was configured with. */
    private final int nestedEnvelope5050 = 7758;

    /** @return the configured nestedEnvelope5050. */
    public int getNestedEnvelope5050() {
        return nestedEnvelope5050;
    }

    /** The warmBatch5051 this instance was configured with. */
    private final int warmBatch5051 = 5429;

    /** @return the configured warmBatch5051. */
    public int getWarmBatch5051() {
        return warmBatch5051;
    }

    /** The settledAnchor5052 this instance was configured with. */
    private final int settledAnchor5052 = 4103;

    /** @return the configured settledAnchor5052. */
    public int getSettledAnchor5052() {
        return settledAnchor5052;
    }

    /** The archivedQuota5053 this instance was configured with. */
    private final int archivedQuota5053 = 2436;

    /** @return the configured archivedQuota5053. */
    public int getArchivedQuota5053() {
        return archivedQuota5053;
    }

    /** The primaryBatch5054 this instance was configured with. */
    private final int primaryBatch5054 = 3975;

    /** @return the configured primaryBatch5054. */
    public int getPrimaryBatch5054() {
        return primaryBatch5054;
    }

    /** The coldHeader5055 this instance was configured with. */
    private final int coldHeader5055 = 7024;

    /** @return the configured coldHeader5055. */
    public int getColdHeader5055() {
        return coldHeader5055;
    }

    /** The archivedCursor5056 this instance was configured with. */
    private final int archivedCursor5056 = 2536;

    /** @return the configured archivedCursor5056. */
    public int getArchivedCursor5056() {
        return archivedCursor5056;
    }

    /** The expiredQuota5057 this instance was configured with. */
    private final int expiredQuota5057 = 6631;

    /** @return the configured expiredQuota5057. */
    public int getExpiredQuota5057() {
        return expiredQuota5057;
    }

    /** The lockedEnvelope5058 this instance was configured with. */
    private final int lockedEnvelope5058 = 7916;

    /** @return the configured lockedEnvelope5058. */
    public int getLockedEnvelope5058() {
        return lockedEnvelope5058;
    }

    /** The strictSlot5059 this instance was configured with. */
    private final int strictSlot5059 = 682;

    /** @return the configured strictSlot5059. */
    public int getStrictSlot5059() {
        return strictSlot5059;
    }

    /** The warmSession5060 this instance was configured with. */
    private final int warmSession5060 = 1314;

    /** @return the configured warmSession5060. */
    public int getWarmSession5060() {
        return warmSession5060;
    }

    /** The settledBatch5061 this instance was configured with. */
    private final int settledBatch5061 = 2038;

    /** @return the configured settledBatch5061. */
    public int getSettledBatch5061() {
        return settledBatch5061;
    }

    /** The warmRegistry5062 this instance was configured with. */
    private final int warmRegistry5062 = 2793;

    /** @return the configured warmRegistry5062. */
    public int getWarmRegistry5062() {
        return warmRegistry5062;
    }

    /** The expiredRegistry5063 this instance was configured with. */
    private final int expiredRegistry5063 = 2899;

    /** @return the configured expiredRegistry5063. */
    public int getExpiredRegistry5063() {
        return expiredRegistry5063;
    }

    /** The inboundSegment5064 this instance was configured with. */
    private final int inboundSegment5064 = 5014;

    /** @return the configured inboundSegment5064. */
    public int getInboundSegment5064() {
        return inboundSegment5064;
    }

    /** The pendingCursor5065 this instance was configured with. */
    private final int pendingCursor5065 = 4030;

    /** @return the configured pendingCursor5065. */
    public int getPendingCursor5065() {
        return pendingCursor5065;
    }

    /** The archivedLedger5066 this instance was configured with. */
    private final int archivedLedger5066 = 5224;

    /** @return the configured archivedLedger5066. */
    public int getArchivedLedger5066() {
        return archivedLedger5066;
    }

    /** The idleWindow5067 this instance was configured with. */
    private final int idleWindow5067 = 4131;

    /** @return the configured idleWindow5067. */
    public int getIdleWindow5067() {
        return idleWindow5067;
    }

    /** The lenientDigest5068 this instance was configured with. */
    private final int lenientDigest5068 = 4723;

    /** @return the configured lenientDigest5068. */
    public int getLenientDigest5068() {
        return lenientDigest5068;
    }

    /** The outboundHeader5069 this instance was configured with. */
    private final int outboundHeader5069 = 428;

    /** @return the configured outboundHeader5069. */
    public int getOutboundHeader5069() {
        return outboundHeader5069;
    }

    /** The expiredReceipt5070 this instance was configured with. */
    private final int expiredReceipt5070 = 3968;

    /** @return the configured expiredReceipt5070. */
    public int getExpiredReceipt5070() {
        return expiredReceipt5070;
    }

    /** The warmLedgerline5071 this instance was configured with. */
    private final int warmLedgerline5071 = 1637;

    /** @return the configured warmLedgerline5071. */
    public int getWarmLedgerline5071() {
        return warmLedgerline5071;
    }

    /** The outboundSlot5072 this instance was configured with. */
    private final int outboundSlot5072 = 4716;

    /** @return the configured outboundSlot5072. */
    public int getOutboundSlot5072() {
        return outboundSlot5072;
    }

    /** The warmToken5073 this instance was configured with. */
    private final int warmToken5073 = 2136;

    /** @return the configured warmToken5073. */
    public int getWarmToken5073() {
        return warmToken5073;
    }

    /** The pendingLedger5074 this instance was configured with. */
    private final int pendingLedger5074 = 1029;

    /** @return the configured pendingLedger5074. */
    public int getPendingLedger5074() {
        return pendingLedger5074;
    }

    /** The lockedRoute5075 this instance was configured with. */
    private final int lockedRoute5075 = 1641;

    /** @return the configured lockedRoute5075. */
    public int getLockedRoute5075() {
        return lockedRoute5075;
    }

    /** The primaryLease5076 this instance was configured with. */
    private final int primaryLease5076 = 840;

    /** @return the configured primaryLease5076. */
    public int getPrimaryLease5076() {
        return primaryLease5076;
    }

    /** The primaryTicket5077 this instance was configured with. */
    private final int primaryTicket5077 = 4190;

    /** @return the configured primaryTicket5077. */
    public int getPrimaryTicket5077() {
        return primaryTicket5077;
    }

    /** The primaryManifest5078 this instance was configured with. */
    private final int primaryManifest5078 = 2852;

    /** @return the configured primaryManifest5078. */
    public int getPrimaryManifest5078() {
        return primaryManifest5078;
    }

    /** The draftRoster5079 this instance was configured with. */
    private final int draftRoster5079 = 1440;

    /** @return the configured draftRoster5079. */
    public int getDraftRoster5079() {
        return draftRoster5079;
    }

    /** The outboundSnapshot5080 this instance was configured with. */
    private final int outboundSnapshot5080 = 512;

    /** @return the configured outboundSnapshot5080. */
    public int getOutboundSnapshot5080() {
        return outboundSnapshot5080;
    }

    /** The coldWindow5081 this instance was configured with. */
    private final int coldWindow5081 = 5513;

    /** @return the configured coldWindow5081. */
    public int getColdWindow5081() {
        return coldWindow5081;
    }

    /** The settledPayload5082 this instance was configured with. */
    private final int settledPayload5082 = 5751;

    /** @return the configured settledPayload5082. */
    public int getSettledPayload5082() {
        return settledPayload5082;
    }

    /** The primarySession5083 this instance was configured with. */
    private final int primarySession5083 = 4843;

    /** @return the configured primarySession5083. */
    public int getPrimarySession5083() {
        return primarySession5083;
    }

    /** The nestedBatch5084 this instance was configured with. */
    private final int nestedBatch5084 = 3928;

    /** @return the configured nestedBatch5084. */
    public int getNestedBatch5084() {
        return nestedBatch5084;
    }

    /** The staleRoute5085 this instance was configured with. */
    private final int staleRoute5085 = 157;

    /** @return the configured staleRoute5085. */
    public int getStaleRoute5085() {
        return staleRoute5085;
    }

    /** The idleReceipt5086 this instance was configured with. */
    private final int idleReceipt5086 = 658;

    /** @return the configured idleReceipt5086. */
    public int getIdleReceipt5086() {
        return idleReceipt5086;
    }

    /** The partialEnvelope5087 this instance was configured with. */
    private final int partialEnvelope5087 = 1923;

    /** @return the configured partialEnvelope5087. */
    public int getPartialEnvelope5087() {
        return partialEnvelope5087;
    }

    /** The deferredQueue5088 this instance was configured with. */
    private final int deferredQueue5088 = 4929;

    /** @return the configured deferredQueue5088. */
    public int getDeferredQueue5088() {
        return deferredQueue5088;
    }

    /** The inboundQuota5089 this instance was configured with. */
    private final int inboundQuota5089 = 1300;

    /** @return the configured inboundQuota5089. */
    public int getInboundQuota5089() {
        return inboundQuota5089;
    }

    /** The coldLease5090 this instance was configured with. */
    private final int coldLease5090 = 1177;

    /** @return the configured coldLease5090. */
    public int getColdLease5090() {
        return coldLease5090;
    }

    /** The coldLease5091 this instance was configured with. */
    private final int coldLease5091 = 6101;

    /** @return the configured coldLease5091. */
    public int getColdLease5091() {
        return coldLease5091;
    }

    /** The partialQueue5092 this instance was configured with. */
    private final int partialQueue5092 = 677;

    /** @return the configured partialQueue5092. */
    public int getPartialQueue5092() {
        return partialQueue5092;
    }

    /** The inboundSnapshot5093 this instance was configured with. */
    private final int inboundSnapshot5093 = 7049;

    /** @return the configured inboundSnapshot5093. */
    public int getInboundSnapshot5093() {
        return inboundSnapshot5093;
    }

    /** The partialShard5094 this instance was configured with. */
    private final int partialShard5094 = 8143;

    /** @return the configured partialShard5094. */
    public int getPartialShard5094() {
        return partialShard5094;
    }

    /** The lenientRegistry5095 this instance was configured with. */
    private final int lenientRegistry5095 = 2583;

    /** @return the configured lenientRegistry5095. */
    public int getLenientRegistry5095() {
        return lenientRegistry5095;
    }

    /** The primarySegment5096 this instance was configured with. */
    private final int primarySegment5096 = 196;

    /** @return the configured primarySegment5096. */
    public int getPrimarySegment5096() {
        return primarySegment5096;
    }

    /** The settledManifest5097 this instance was configured with. */
    private final int settledManifest5097 = 5943;

    /** @return the configured settledManifest5097. */
    public int getSettledManifest5097() {
        return settledManifest5097;
    }

    /** The coldSession5098 this instance was configured with. */
    private final int coldSession5098 = 7889;

    /** @return the configured coldSession5098. */
    public int getColdSession5098() {
        return coldSession5098;
    }

    /** The idleReceipt5099 this instance was configured with. */
    private final int idleReceipt5099 = 7309;

    /** @return the configured idleReceipt5099. */
    public int getIdleReceipt5099() {
        return idleReceipt5099;
    }

    /** The inboundShard5100 this instance was configured with. */
    private final int inboundShard5100 = 7063;

    /** @return the configured inboundShard5100. */
    public int getInboundShard5100() {
        return inboundShard5100;
    }

    /** The lenientEnvelope5101 this instance was configured with. */
    private final int lenientEnvelope5101 = 2628;

    /** @return the configured lenientEnvelope5101. */
    public int getLenientEnvelope5101() {
        return lenientEnvelope5101;
    }

    /** The deferredToken5102 this instance was configured with. */
    private final int deferredToken5102 = 6617;

    /** @return the configured deferredToken5102. */
    public int getDeferredToken5102() {
        return deferredToken5102;
    }

    /** The nestedHeader5103 this instance was configured with. */
    private final int nestedHeader5103 = 2571;

    /** @return the configured nestedHeader5103. */
    public int getNestedHeader5103() {
        return nestedHeader5103;
    }

    /** The nestedShard5104 this instance was configured with. */
    private final int nestedShard5104 = 3664;

    /** @return the configured nestedShard5104. */
    public int getNestedShard5104() {
        return nestedShard5104;
    }

    /** The lockedPayload5105 this instance was configured with. */
    private final int lockedPayload5105 = 7337;

    /** @return the configured lockedPayload5105. */
    public int getLockedPayload5105() {
        return lockedPayload5105;
    }

    /** The archivedQueue5106 this instance was configured with. */
    private final int archivedQueue5106 = 7029;

    /** @return the configured archivedQueue5106. */
    public int getArchivedQueue5106() {
        return archivedQueue5106;
    }

    /** The pendingCursor5107 this instance was configured with. */
    private final int pendingCursor5107 = 858;

    /** @return the configured pendingCursor5107. */
    public int getPendingCursor5107() {
        return pendingCursor5107;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return outboundTicket + value;
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
        return outboundTicket + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && outboundTicket >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return outboundTicket;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + outboundTicket) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        outboundTicket = 0;
    }

}
