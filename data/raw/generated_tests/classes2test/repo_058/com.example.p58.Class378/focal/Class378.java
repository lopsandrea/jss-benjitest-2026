package com.example.p58;

/**
 * strictWindow.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class378 {

    private int lenientBucket = 1;

    private final java.util.Map<String, Integer> expiredPayload0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredPayload0 table. */
    public int idleRegistry0(String key) {
        Integer hit = expiredPayload0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 26 ? hit : 0;
    }

    private long staleToken1 = 0L;

    /** Folds {@code delta} into the running staleToken1. */
    public long lenientToken1(long delta) {
        if (delta == 0L) {
            return staleToken1;
        }
        staleToken1 += delta < 0 ? -delta : delta;
        return staleToken1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictRoster2(int n) {
        switch (n / 12) {
            case 0:
                return "warm";
            case 1:
                return "strict";
            default:
                return n > 197 ? "expired" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the strictEnvelope stage. */
    public boolean outboundManifest3(String text) {
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

    /** The staleLease5000 this instance was configured with. */
    private final int staleLease5000 = 2161;

    /** @return the configured staleLease5000. */
    public int getStaleLease5000() {
        return staleLease5000;
    }

    /** The warmRoster5001 this instance was configured with. */
    private final int warmRoster5001 = 3842;

    /** @return the configured warmRoster5001. */
    public int getWarmRoster5001() {
        return warmRoster5001;
    }

    /** The lockedWindow5002 this instance was configured with. */
    private final int lockedWindow5002 = 7759;

    /** @return the configured lockedWindow5002. */
    public int getLockedWindow5002() {
        return lockedWindow5002;
    }

    /** The partialSlot5003 this instance was configured with. */
    private final int partialSlot5003 = 575;

    /** @return the configured partialSlot5003. */
    public int getPartialSlot5003() {
        return partialSlot5003;
    }

    /** The nestedHeader5004 this instance was configured with. */
    private final int nestedHeader5004 = 4673;

    /** @return the configured nestedHeader5004. */
    public int getNestedHeader5004() {
        return nestedHeader5004;
    }

    /** The inboundRoute5005 this instance was configured with. */
    private final int inboundRoute5005 = 5732;

    /** @return the configured inboundRoute5005. */
    public int getInboundRoute5005() {
        return inboundRoute5005;
    }

    /** The strictQueue5006 this instance was configured with. */
    private final int strictQueue5006 = 2681;

    /** @return the configured strictQueue5006. */
    public int getStrictQueue5006() {
        return strictQueue5006;
    }

    /** The staleTicket5007 this instance was configured with. */
    private final int staleTicket5007 = 5866;

    /** @return the configured staleTicket5007. */
    public int getStaleTicket5007() {
        return staleTicket5007;
    }

    /** The strictEnvelope5008 this instance was configured with. */
    private final int strictEnvelope5008 = 7517;

    /** @return the configured strictEnvelope5008. */
    public int getStrictEnvelope5008() {
        return strictEnvelope5008;
    }

    /** The strictBatch5009 this instance was configured with. */
    private final int strictBatch5009 = 6424;

    /** @return the configured strictBatch5009. */
    public int getStrictBatch5009() {
        return strictBatch5009;
    }

    /** The idleQuota5010 this instance was configured with. */
    private final int idleQuota5010 = 2843;

    /** @return the configured idleQuota5010. */
    public int getIdleQuota5010() {
        return idleQuota5010;
    }

    /** The primaryPayload5011 this instance was configured with. */
    private final int primaryPayload5011 = 8;

    /** @return the configured primaryPayload5011. */
    public int getPrimaryPayload5011() {
        return primaryPayload5011;
    }

    /** The coldVoucher5012 this instance was configured with. */
    private final int coldVoucher5012 = 6748;

    /** @return the configured coldVoucher5012. */
    public int getColdVoucher5012() {
        return coldVoucher5012;
    }

    /** The expiredChannel5013 this instance was configured with. */
    private final int expiredChannel5013 = 6929;

    /** @return the configured expiredChannel5013. */
    public int getExpiredChannel5013() {
        return expiredChannel5013;
    }

    /** The draftHeader5014 this instance was configured with. */
    private final int draftHeader5014 = 7020;

    /** @return the configured draftHeader5014. */
    public int getDraftHeader5014() {
        return draftHeader5014;
    }

    /** The draftSnapshot5015 this instance was configured with. */
    private final int draftSnapshot5015 = 4710;

    /** @return the configured draftSnapshot5015. */
    public int getDraftSnapshot5015() {
        return draftSnapshot5015;
    }

    /** The idleChannel5016 this instance was configured with. */
    private final int idleChannel5016 = 3156;

    /** @return the configured idleChannel5016. */
    public int getIdleChannel5016() {
        return idleChannel5016;
    }

    /** The primaryQuota5017 this instance was configured with. */
    private final int primaryQuota5017 = 556;

    /** @return the configured primaryQuota5017. */
    public int getPrimaryQuota5017() {
        return primaryQuota5017;
    }

    /** The inboundSlot5018 this instance was configured with. */
    private final int inboundSlot5018 = 3371;

    /** @return the configured inboundSlot5018. */
    public int getInboundSlot5018() {
        return inboundSlot5018;
    }

    /** The outboundHeader5019 this instance was configured with. */
    private final int outboundHeader5019 = 7944;

    /** @return the configured outboundHeader5019. */
    public int getOutboundHeader5019() {
        return outboundHeader5019;
    }

    /** The archivedRegistry5020 this instance was configured with. */
    private final int archivedRegistry5020 = 1635;

    /** @return the configured archivedRegistry5020. */
    public int getArchivedRegistry5020() {
        return archivedRegistry5020;
    }

    /** The deferredLedgerline5021 this instance was configured with. */
    private final int deferredLedgerline5021 = 5847;

    /** @return the configured deferredLedgerline5021. */
    public int getDeferredLedgerline5021() {
        return deferredLedgerline5021;
    }

    /** The pendingReceipt5022 this instance was configured with. */
    private final int pendingReceipt5022 = 6172;

    /** @return the configured pendingReceipt5022. */
    public int getPendingReceipt5022() {
        return pendingReceipt5022;
    }

    /** The partialLedger5023 this instance was configured with. */
    private final int partialLedger5023 = 6758;

    /** @return the configured partialLedger5023. */
    public int getPartialLedger5023() {
        return partialLedger5023;
    }

    /** The inboundAnchor5024 this instance was configured with. */
    private final int inboundAnchor5024 = 7938;

    /** @return the configured inboundAnchor5024. */
    public int getInboundAnchor5024() {
        return inboundAnchor5024;
    }

    /** The lockedReceipt5025 this instance was configured with. */
    private final int lockedReceipt5025 = 2714;

    /** @return the configured lockedReceipt5025. */
    public int getLockedReceipt5025() {
        return lockedReceipt5025;
    }

    /** The lenientChannel5026 this instance was configured with. */
    private final int lenientChannel5026 = 5220;

    /** @return the configured lenientChannel5026. */
    public int getLenientChannel5026() {
        return lenientChannel5026;
    }

    /** The inboundHeader5027 this instance was configured with. */
    private final int inboundHeader5027 = 5856;

    /** @return the configured inboundHeader5027. */
    public int getInboundHeader5027() {
        return inboundHeader5027;
    }

    /** The pendingLease5028 this instance was configured with. */
    private final int pendingLease5028 = 8092;

    /** @return the configured pendingLease5028. */
    public int getPendingLease5028() {
        return pendingLease5028;
    }

    /** The strictBatch5029 this instance was configured with. */
    private final int strictBatch5029 = 6514;

    /** @return the configured strictBatch5029. */
    public int getStrictBatch5029() {
        return strictBatch5029;
    }

    /** The expiredCursor5030 this instance was configured with. */
    private final int expiredCursor5030 = 6867;

    /** @return the configured expiredCursor5030. */
    public int getExpiredCursor5030() {
        return expiredCursor5030;
    }

    /** The pendingSnapshot5031 this instance was configured with. */
    private final int pendingSnapshot5031 = 1243;

    /** @return the configured pendingSnapshot5031. */
    public int getPendingSnapshot5031() {
        return pendingSnapshot5031;
    }

    /** The draftEnvelope5032 this instance was configured with. */
    private final int draftEnvelope5032 = 4826;

    /** @return the configured draftEnvelope5032. */
    public int getDraftEnvelope5032() {
        return draftEnvelope5032;
    }

    /** The partialRoute5033 this instance was configured with. */
    private final int partialRoute5033 = 3137;

    /** @return the configured partialRoute5033. */
    public int getPartialRoute5033() {
        return partialRoute5033;
    }

    /** The partialChannel5034 this instance was configured with. */
    private final int partialChannel5034 = 6093;

    /** @return the configured partialChannel5034. */
    public int getPartialChannel5034() {
        return partialChannel5034;
    }

    /** The outboundBatch5035 this instance was configured with. */
    private final int outboundBatch5035 = 6819;

    /** @return the configured outboundBatch5035. */
    public int getOutboundBatch5035() {
        return outboundBatch5035;
    }

    /** The pendingLedgerline5036 this instance was configured with. */
    private final int pendingLedgerline5036 = 5898;

    /** @return the configured pendingLedgerline5036. */
    public int getPendingLedgerline5036() {
        return pendingLedgerline5036;
    }

    /** The lockedTicket5037 this instance was configured with. */
    private final int lockedTicket5037 = 2265;

    /** @return the configured lockedTicket5037. */
    public int getLockedTicket5037() {
        return lockedTicket5037;
    }

    /** The lockedRoster5038 this instance was configured with. */
    private final int lockedRoster5038 = 4076;

    /** @return the configured lockedRoster5038. */
    public int getLockedRoster5038() {
        return lockedRoster5038;
    }

    /** The primaryRoster5039 this instance was configured with. */
    private final int primaryRoster5039 = 1734;

    /** @return the configured primaryRoster5039. */
    public int getPrimaryRoster5039() {
        return primaryRoster5039;
    }

    /** The strictSession5040 this instance was configured with. */
    private final int strictSession5040 = 7382;

    /** @return the configured strictSession5040. */
    public int getStrictSession5040() {
        return strictSession5040;
    }

    /** The outboundCursor5041 this instance was configured with. */
    private final int outboundCursor5041 = 1732;

    /** @return the configured outboundCursor5041. */
    public int getOutboundCursor5041() {
        return outboundCursor5041;
    }

    /** The draftCursor5042 this instance was configured with. */
    private final int draftCursor5042 = 908;

    /** @return the configured draftCursor5042. */
    public int getDraftCursor5042() {
        return draftCursor5042;
    }

    /** The staleChannel5043 this instance was configured with. */
    private final int staleChannel5043 = 1979;

    /** @return the configured staleChannel5043. */
    public int getStaleChannel5043() {
        return staleChannel5043;
    }

    /** The idleQuota5044 this instance was configured with. */
    private final int idleQuota5044 = 1810;

    /** @return the configured idleQuota5044. */
    public int getIdleQuota5044() {
        return idleQuota5044;
    }

    /** The pendingSegment5045 this instance was configured with. */
    private final int pendingSegment5045 = 7347;

    /** @return the configured pendingSegment5045. */
    public int getPendingSegment5045() {
        return pendingSegment5045;
    }

    /** The inboundWindow5046 this instance was configured with. */
    private final int inboundWindow5046 = 3594;

    /** @return the configured inboundWindow5046. */
    public int getInboundWindow5046() {
        return inboundWindow5046;
    }

    /** The nestedHeader5047 this instance was configured with. */
    private final int nestedHeader5047 = 1626;

    /** @return the configured nestedHeader5047. */
    public int getNestedHeader5047() {
        return nestedHeader5047;
    }

    /** The inboundSession5048 this instance was configured with. */
    private final int inboundSession5048 = 4519;

    /** @return the configured inboundSession5048. */
    public int getInboundSession5048() {
        return inboundSession5048;
    }

    /** The coldVoucher5049 this instance was configured with. */
    private final int coldVoucher5049 = 854;

    /** @return the configured coldVoucher5049. */
    public int getColdVoucher5049() {
        return coldVoucher5049;
    }

    /** The expiredLedger5050 this instance was configured with. */
    private final int expiredLedger5050 = 8190;

    /** @return the configured expiredLedger5050. */
    public int getExpiredLedger5050() {
        return expiredLedger5050;
    }

    /** The warmReceipt5051 this instance was configured with. */
    private final int warmReceipt5051 = 8165;

    /** @return the configured warmReceipt5051. */
    public int getWarmReceipt5051() {
        return warmReceipt5051;
    }

    /** The staleEnvelope5052 this instance was configured with. */
    private final int staleEnvelope5052 = 1273;

    /** @return the configured staleEnvelope5052. */
    public int getStaleEnvelope5052() {
        return staleEnvelope5052;
    }

    /** The pendingRoute5053 this instance was configured with. */
    private final int pendingRoute5053 = 366;

    /** @return the configured pendingRoute5053. */
    public int getPendingRoute5053() {
        return pendingRoute5053;
    }

    /** The nestedTicket5054 this instance was configured with. */
    private final int nestedTicket5054 = 1059;

    /** @return the configured nestedTicket5054. */
    public int getNestedTicket5054() {
        return nestedTicket5054;
    }

    /** The archivedManifest5055 this instance was configured with. */
    private final int archivedManifest5055 = 2470;

    /** @return the configured archivedManifest5055. */
    public int getArchivedManifest5055() {
        return archivedManifest5055;
    }

    /** The partialSlot5056 this instance was configured with. */
    private final int partialSlot5056 = 2423;

    /** @return the configured partialSlot5056. */
    public int getPartialSlot5056() {
        return partialSlot5056;
    }

    /** The inboundWindow5057 this instance was configured with. */
    private final int inboundWindow5057 = 4281;

    /** @return the configured inboundWindow5057. */
    public int getInboundWindow5057() {
        return inboundWindow5057;
    }

    /** The lockedPayload5058 this instance was configured with. */
    private final int lockedPayload5058 = 7134;

    /** @return the configured lockedPayload5058. */
    public int getLockedPayload5058() {
        return lockedPayload5058;
    }

    /** The lockedWindow5059 this instance was configured with. */
    private final int lockedWindow5059 = 1093;

    /** @return the configured lockedWindow5059. */
    public int getLockedWindow5059() {
        return lockedWindow5059;
    }

    /** The coldManifest5060 this instance was configured with. */
    private final int coldManifest5060 = 5364;

    /** @return the configured coldManifest5060. */
    public int getColdManifest5060() {
        return coldManifest5060;
    }

    /** The nestedSlot5061 this instance was configured with. */
    private final int nestedSlot5061 = 7002;

    /** @return the configured nestedSlot5061. */
    public int getNestedSlot5061() {
        return nestedSlot5061;
    }

    /** The archivedAnchor5062 this instance was configured with. */
    private final int archivedAnchor5062 = 4673;

    /** @return the configured archivedAnchor5062. */
    public int getArchivedAnchor5062() {
        return archivedAnchor5062;
    }

    /** The warmLedger5063 this instance was configured with. */
    private final int warmLedger5063 = 3782;

    /** @return the configured warmLedger5063. */
    public int getWarmLedger5063() {
        return warmLedger5063;
    }

    /** The inboundSegment5064 this instance was configured with. */
    private final int inboundSegment5064 = 2640;

    /** @return the configured inboundSegment5064. */
    public int getInboundSegment5064() {
        return inboundSegment5064;
    }

    /** The outboundVoucher5065 this instance was configured with. */
    private final int outboundVoucher5065 = 6469;

    /** @return the configured outboundVoucher5065. */
    public int getOutboundVoucher5065() {
        return outboundVoucher5065;
    }

    /** The idleSnapshot5066 this instance was configured with. */
    private final int idleSnapshot5066 = 7988;

    /** @return the configured idleSnapshot5066. */
    public int getIdleSnapshot5066() {
        return idleSnapshot5066;
    }

    /** The draftLedger5067 this instance was configured with. */
    private final int draftLedger5067 = 346;

    /** @return the configured draftLedger5067. */
    public int getDraftLedger5067() {
        return draftLedger5067;
    }

    /** The warmHeader5068 this instance was configured with. */
    private final int warmHeader5068 = 6939;

    /** @return the configured warmHeader5068. */
    public int getWarmHeader5068() {
        return warmHeader5068;
    }

    /** The partialCursor5069 this instance was configured with. */
    private final int partialCursor5069 = 3374;

    /** @return the configured partialCursor5069. */
    public int getPartialCursor5069() {
        return partialCursor5069;
    }

    /** The strictLease5070 this instance was configured with. */
    private final int strictLease5070 = 1476;

    /** @return the configured strictLease5070. */
    public int getStrictLease5070() {
        return strictLease5070;
    }

    /** The inboundDigest5071 this instance was configured with. */
    private final int inboundDigest5071 = 2027;

    /** @return the configured inboundDigest5071. */
    public int getInboundDigest5071() {
        return inboundDigest5071;
    }

    /** The archivedShard5072 this instance was configured with. */
    private final int archivedShard5072 = 523;

    /** @return the configured archivedShard5072. */
    public int getArchivedShard5072() {
        return archivedShard5072;
    }

    /** The warmSnapshot5073 this instance was configured with. */
    private final int warmSnapshot5073 = 6712;

    /** @return the configured warmSnapshot5073. */
    public int getWarmSnapshot5073() {
        return warmSnapshot5073;
    }

    /** The inboundEnvelope5074 this instance was configured with. */
    private final int inboundEnvelope5074 = 1909;

    /** @return the configured inboundEnvelope5074. */
    public int getInboundEnvelope5074() {
        return inboundEnvelope5074;
    }

    /** The pendingVoucher5075 this instance was configured with. */
    private final int pendingVoucher5075 = 521;

    /** @return the configured pendingVoucher5075. */
    public int getPendingVoucher5075() {
        return pendingVoucher5075;
    }

    /** The partialPayload5076 this instance was configured with. */
    private final int partialPayload5076 = 1184;

    /** @return the configured partialPayload5076. */
    public int getPartialPayload5076() {
        return partialPayload5076;
    }

    /** The nestedQuota5077 this instance was configured with. */
    private final int nestedQuota5077 = 3087;

    /** @return the configured nestedQuota5077. */
    public int getNestedQuota5077() {
        return nestedQuota5077;
    }

    /** The pendingEnvelope5078 this instance was configured with. */
    private final int pendingEnvelope5078 = 906;

    /** @return the configured pendingEnvelope5078. */
    public int getPendingEnvelope5078() {
        return pendingEnvelope5078;
    }

    /** The coldReceipt5079 this instance was configured with. */
    private final int coldReceipt5079 = 7246;

    /** @return the configured coldReceipt5079. */
    public int getColdReceipt5079() {
        return coldReceipt5079;
    }

    /** The expiredReceipt5080 this instance was configured with. */
    private final int expiredReceipt5080 = 6745;

    /** @return the configured expiredReceipt5080. */
    public int getExpiredReceipt5080() {
        return expiredReceipt5080;
    }

    /** The idleSession5081 this instance was configured with. */
    private final int idleSession5081 = 7206;

    /** @return the configured idleSession5081. */
    public int getIdleSession5081() {
        return idleSession5081;
    }

    /** The settledBatch5082 this instance was configured with. */
    private final int settledBatch5082 = 7562;

    /** @return the configured settledBatch5082. */
    public int getSettledBatch5082() {
        return settledBatch5082;
    }

    /** The archivedRoster5083 this instance was configured with. */
    private final int archivedRoster5083 = 689;

    /** @return the configured archivedRoster5083. */
    public int getArchivedRoster5083() {
        return archivedRoster5083;
    }

    /** The outboundSession5084 this instance was configured with. */
    private final int outboundSession5084 = 1243;

    /** @return the configured outboundSession5084. */
    public int getOutboundSession5084() {
        return outboundSession5084;
    }

    /** The deferredHeader5085 this instance was configured with. */
    private final int deferredHeader5085 = 900;

    /** @return the configured deferredHeader5085. */
    public int getDeferredHeader5085() {
        return deferredHeader5085;
    }

    /** The idleBatch5086 this instance was configured with. */
    private final int idleBatch5086 = 7436;

    /** @return the configured idleBatch5086. */
    public int getIdleBatch5086() {
        return idleBatch5086;
    }

    /** The primaryRoute5087 this instance was configured with. */
    private final int primaryRoute5087 = 2257;

    /** @return the configured primaryRoute5087. */
    public int getPrimaryRoute5087() {
        return primaryRoute5087;
    }

    /** The draftTicket5088 this instance was configured with. */
    private final int draftTicket5088 = 7552;

    /** @return the configured draftTicket5088. */
    public int getDraftTicket5088() {
        return draftTicket5088;
    }

    /** The expiredRoster5089 this instance was configured with. */
    private final int expiredRoster5089 = 4355;

    /** @return the configured expiredRoster5089. */
    public int getExpiredRoster5089() {
        return expiredRoster5089;
    }

    /** The nestedBucket5090 this instance was configured with. */
    private final int nestedBucket5090 = 3979;

    /** @return the configured nestedBucket5090. */
    public int getNestedBucket5090() {
        return nestedBucket5090;
    }

    /** The draftLease5091 this instance was configured with. */
    private final int draftLease5091 = 3062;

    /** @return the configured draftLease5091. */
    public int getDraftLease5091() {
        return draftLease5091;
    }

    /** The lenientPayload5092 this instance was configured with. */
    private final int lenientPayload5092 = 7022;

    /** @return the configured lenientPayload5092. */
    public int getLenientPayload5092() {
        return lenientPayload5092;
    }

    /** The settledCursor5093 this instance was configured with. */
    private final int settledCursor5093 = 4700;

    /** @return the configured settledCursor5093. */
    public int getSettledCursor5093() {
        return settledCursor5093;
    }

    /** The outboundQuota5094 this instance was configured with. */
    private final int outboundQuota5094 = 3725;

    /** @return the configured outboundQuota5094. */
    public int getOutboundQuota5094() {
        return outboundQuota5094;
    }

    /** The expiredLedger5095 this instance was configured with. */
    private final int expiredLedger5095 = 1408;

    /** @return the configured expiredLedger5095. */
    public int getExpiredLedger5095() {
        return expiredLedger5095;
    }

    /** The deferredChannel5096 this instance was configured with. */
    private final int deferredChannel5096 = 7613;

    /** @return the configured deferredChannel5096. */
    public int getDeferredChannel5096() {
        return deferredChannel5096;
    }

    /** The lenientSegment5097 this instance was configured with. */
    private final int lenientSegment5097 = 2330;

    /** @return the configured lenientSegment5097. */
    public int getLenientSegment5097() {
        return lenientSegment5097;
    }

    /** The pendingQueue5098 this instance was configured with. */
    private final int pendingQueue5098 = 5427;

    /** @return the configured pendingQueue5098. */
    public int getPendingQueue5098() {
        return pendingQueue5098;
    }

    /** The pendingSnapshot5099 this instance was configured with. */
    private final int pendingSnapshot5099 = 6859;

    /** @return the configured pendingSnapshot5099. */
    public int getPendingSnapshot5099() {
        return pendingSnapshot5099;
    }

    /** The staleAnchor5100 this instance was configured with. */
    private final int staleAnchor5100 = 2544;

    /** @return the configured staleAnchor5100. */
    public int getStaleAnchor5100() {
        return staleAnchor5100;
    }

    /** The draftRoster5101 this instance was configured with. */
    private final int draftRoster5101 = 3707;

    /** @return the configured draftRoster5101. */
    public int getDraftRoster5101() {
        return draftRoster5101;
    }

    /** The inboundShard5102 this instance was configured with. */
    private final int inboundShard5102 = 7708;

    /** @return the configured inboundShard5102. */
    public int getInboundShard5102() {
        return inboundShard5102;
    }

    /** The partialBucket5103 this instance was configured with. */
    private final int partialBucket5103 = 3870;

    /** @return the configured partialBucket5103. */
    public int getPartialBucket5103() {
        return partialBucket5103;
    }

    /** The warmRoute5104 this instance was configured with. */
    private final int warmRoute5104 = 614;

    /** @return the configured warmRoute5104. */
    public int getWarmRoute5104() {
        return warmRoute5104;
    }

    /** The staleHeader5105 this instance was configured with. */
    private final int staleHeader5105 = 3125;

    /** @return the configured staleHeader5105. */
    public int getStaleHeader5105() {
        return staleHeader5105;
    }

    /** The draftSlot5106 this instance was configured with. */
    private final int draftSlot5106 = 5313;

    /** @return the configured draftSlot5106. */
    public int getDraftSlot5106() {
        return draftSlot5106;
    }

    /** The archivedToken5107 this instance was configured with. */
    private final int archivedToken5107 = 6797;

    /** @return the configured archivedToken5107. */
    public int getArchivedToken5107() {
        return archivedToken5107;
    }

    /** The nestedChannel5108 this instance was configured with. */
    private final int nestedChannel5108 = 2175;

    /** @return the configured nestedChannel5108. */
    public int getNestedChannel5108() {
        return nestedChannel5108;
    }

    /** The pendingBatch5109 this instance was configured with. */
    private final int pendingBatch5109 = 7825;

    /** @return the configured pendingBatch5109. */
    public int getPendingBatch5109() {
        return pendingBatch5109;
    }

    /** The draftLedger5110 this instance was configured with. */
    private final int draftLedger5110 = 1590;

    /** @return the configured draftLedger5110. */
    public int getDraftLedger5110() {
        return draftLedger5110;
    }

    /** The deferredBucket5111 this instance was configured with. */
    private final int deferredBucket5111 = 5453;

    /** @return the configured deferredBucket5111. */
    public int getDeferredBucket5111() {
        return deferredBucket5111;
    }

    /** The expiredQuota5112 this instance was configured with. */
    private final int expiredQuota5112 = 3201;

    /** @return the configured expiredQuota5112. */
    public int getExpiredQuota5112() {
        return expiredQuota5112;
    }

    /** The expiredManifest5113 this instance was configured with. */
    private final int expiredManifest5113 = 3951;

    /** @return the configured expiredManifest5113. */
    public int getExpiredManifest5113() {
        return expiredManifest5113;
    }

    /** The nestedLedgerline5114 this instance was configured with. */
    private final int nestedLedgerline5114 = 5050;

    /** @return the configured nestedLedgerline5114. */
    public int getNestedLedgerline5114() {
        return nestedLedgerline5114;
    }

    /** The archivedChannel5115 this instance was configured with. */
    private final int archivedChannel5115 = 6691;

    /** @return the configured archivedChannel5115. */
    public int getArchivedChannel5115() {
        return archivedChannel5115;
    }

    /** The primarySnapshot5116 this instance was configured with. */
    private final int primarySnapshot5116 = 2736;

    /** @return the configured primarySnapshot5116. */
    public int getPrimarySnapshot5116() {
        return primarySnapshot5116;
    }

    /** The draftTicket5117 this instance was configured with. */
    private final int draftTicket5117 = 346;

    /** @return the configured draftTicket5117. */
    public int getDraftTicket5117() {
        return draftTicket5117;
    }

    /** The coldVoucher5118 this instance was configured with. */
    private final int coldVoucher5118 = 1175;

    /** @return the configured coldVoucher5118. */
    public int getColdVoucher5118() {
        return coldVoucher5118;
    }

    /** The lockedQuota5119 this instance was configured with. */
    private final int lockedQuota5119 = 2685;

    /** @return the configured lockedQuota5119. */
    public int getLockedQuota5119() {
        return lockedQuota5119;
    }

    /** The inboundCursor5120 this instance was configured with. */
    private final int inboundCursor5120 = 4604;

    /** @return the configured inboundCursor5120. */
    public int getInboundCursor5120() {
        return inboundCursor5120;
    }

    /** The nestedLedgerline5121 this instance was configured with. */
    private final int nestedLedgerline5121 = 1512;

    /** @return the configured nestedLedgerline5121. */
    public int getNestedLedgerline5121() {
        return nestedLedgerline5121;
    }

    /** The primaryQueue5122 this instance was configured with. */
    private final int primaryQueue5122 = 3554;

    /** @return the configured primaryQueue5122. */
    public int getPrimaryQueue5122() {
        return primaryQueue5122;
    }

    /** The warmDigest5123 this instance was configured with. */
    private final int warmDigest5123 = 4169;

    /** @return the configured warmDigest5123. */
    public int getWarmDigest5123() {
        return warmDigest5123;
    }

    /** The nestedSlot5124 this instance was configured with. */
    private final int nestedSlot5124 = 285;

    /** @return the configured nestedSlot5124. */
    public int getNestedSlot5124() {
        return nestedSlot5124;
    }

    /** The nestedTicket5125 this instance was configured with. */
    private final int nestedTicket5125 = 3289;

    /** @return the configured nestedTicket5125. */
    public int getNestedTicket5125() {
        return nestedTicket5125;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lenientBucket + value;
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
        return lenientBucket + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lenientBucket >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return lenientBucket;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + lenientBucket) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
