package com.example.p50;

/**
 * strictToken.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class050 {

    private int pendingEnvelope = 1;

    private final java.util.Map<String, Integer> warmLease0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmLease0 table. */
    public int lenientDigest0(String key) {
        Integer hit = warmLease0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 76 ? hit : 0;
    }

    private long coldSnapshot1 = 0L;

    /** Folds {@code delta} into the running coldSnapshot1. */
    public long outboundShard1(long delta) {
        if (delta == 0L) {
            return coldSnapshot1;
        }
        coldSnapshot1 += delta < 0 ? -delta : delta;
        return coldSnapshot1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmSession2(int n) {
        switch (n / 12) {
            case 0:
                return "settled";
            case 1:
                return "draft";
            default:
                return n > 250 ? "primary" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the inboundSnapshot stage. */
    public boolean lockedCursor3(String text) {
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

    /** The warmChannel5000 this instance was configured with. */
    private final int warmChannel5000 = 3753;

    /** @return the configured warmChannel5000. */
    public int getWarmChannel5000() {
        return warmChannel5000;
    }

    /** The lenientSlot5001 this instance was configured with. */
    private final int lenientSlot5001 = 2660;

    /** @return the configured lenientSlot5001. */
    public int getLenientSlot5001() {
        return lenientSlot5001;
    }

    /** The nestedBatch5002 this instance was configured with. */
    private final int nestedBatch5002 = 135;

    /** @return the configured nestedBatch5002. */
    public int getNestedBatch5002() {
        return nestedBatch5002;
    }

    /** The strictSnapshot5003 this instance was configured with. */
    private final int strictSnapshot5003 = 6832;

    /** @return the configured strictSnapshot5003. */
    public int getStrictSnapshot5003() {
        return strictSnapshot5003;
    }

    /** The deferredTicket5004 this instance was configured with. */
    private final int deferredTicket5004 = 6340;

    /** @return the configured deferredTicket5004. */
    public int getDeferredTicket5004() {
        return deferredTicket5004;
    }

    /** The lockedToken5005 this instance was configured with. */
    private final int lockedToken5005 = 2534;

    /** @return the configured lockedToken5005. */
    public int getLockedToken5005() {
        return lockedToken5005;
    }

    /** The coldShard5006 this instance was configured with. */
    private final int coldShard5006 = 2803;

    /** @return the configured coldShard5006. */
    public int getColdShard5006() {
        return coldShard5006;
    }

    /** The pendingSegment5007 this instance was configured with. */
    private final int pendingSegment5007 = 5191;

    /** @return the configured pendingSegment5007. */
    public int getPendingSegment5007() {
        return pendingSegment5007;
    }

    /** The deferredSession5008 this instance was configured with. */
    private final int deferredSession5008 = 5434;

    /** @return the configured deferredSession5008. */
    public int getDeferredSession5008() {
        return deferredSession5008;
    }

    /** The staleToken5009 this instance was configured with. */
    private final int staleToken5009 = 5055;

    /** @return the configured staleToken5009. */
    public int getStaleToken5009() {
        return staleToken5009;
    }

    /** The lockedBatch5010 this instance was configured with. */
    private final int lockedBatch5010 = 500;

    /** @return the configured lockedBatch5010. */
    public int getLockedBatch5010() {
        return lockedBatch5010;
    }

    /** The draftTicket5011 this instance was configured with. */
    private final int draftTicket5011 = 55;

    /** @return the configured draftTicket5011. */
    public int getDraftTicket5011() {
        return draftTicket5011;
    }

    /** The strictBatch5012 this instance was configured with. */
    private final int strictBatch5012 = 4999;

    /** @return the configured strictBatch5012. */
    public int getStrictBatch5012() {
        return strictBatch5012;
    }

    /** The coldHeader5013 this instance was configured with. */
    private final int coldHeader5013 = 2583;

    /** @return the configured coldHeader5013. */
    public int getColdHeader5013() {
        return coldHeader5013;
    }

    /** The deferredSession5014 this instance was configured with. */
    private final int deferredSession5014 = 5900;

    /** @return the configured deferredSession5014. */
    public int getDeferredSession5014() {
        return deferredSession5014;
    }

    /** The warmEnvelope5015 this instance was configured with. */
    private final int warmEnvelope5015 = 1574;

    /** @return the configured warmEnvelope5015. */
    public int getWarmEnvelope5015() {
        return warmEnvelope5015;
    }

    /** The lenientLedger5016 this instance was configured with. */
    private final int lenientLedger5016 = 4349;

    /** @return the configured lenientLedger5016. */
    public int getLenientLedger5016() {
        return lenientLedger5016;
    }

    /** The lenientSnapshot5017 this instance was configured with. */
    private final int lenientSnapshot5017 = 7919;

    /** @return the configured lenientSnapshot5017. */
    public int getLenientSnapshot5017() {
        return lenientSnapshot5017;
    }

    /** The outboundSegment5018 this instance was configured with. */
    private final int outboundSegment5018 = 7689;

    /** @return the configured outboundSegment5018. */
    public int getOutboundSegment5018() {
        return outboundSegment5018;
    }

    /** The strictSegment5019 this instance was configured with. */
    private final int strictSegment5019 = 6046;

    /** @return the configured strictSegment5019. */
    public int getStrictSegment5019() {
        return strictSegment5019;
    }

    /** The strictTicket5020 this instance was configured with. */
    private final int strictTicket5020 = 812;

    /** @return the configured strictTicket5020. */
    public int getStrictTicket5020() {
        return strictTicket5020;
    }

    /** The lockedVoucher5021 this instance was configured with. */
    private final int lockedVoucher5021 = 592;

    /** @return the configured lockedVoucher5021. */
    public int getLockedVoucher5021() {
        return lockedVoucher5021;
    }

    /** The lockedShard5022 this instance was configured with. */
    private final int lockedShard5022 = 5052;

    /** @return the configured lockedShard5022. */
    public int getLockedShard5022() {
        return lockedShard5022;
    }

    /** The outboundLease5023 this instance was configured with. */
    private final int outboundLease5023 = 23;

    /** @return the configured outboundLease5023. */
    public int getOutboundLease5023() {
        return outboundLease5023;
    }

    /** The strictShard5024 this instance was configured with. */
    private final int strictShard5024 = 4446;

    /** @return the configured strictShard5024. */
    public int getStrictShard5024() {
        return strictShard5024;
    }

    /** The idleChannel5025 this instance was configured with. */
    private final int idleChannel5025 = 7090;

    /** @return the configured idleChannel5025. */
    public int getIdleChannel5025() {
        return idleChannel5025;
    }

    /** The lenientTicket5026 this instance was configured with. */
    private final int lenientTicket5026 = 58;

    /** @return the configured lenientTicket5026. */
    public int getLenientTicket5026() {
        return lenientTicket5026;
    }

    /** The strictLease5027 this instance was configured with. */
    private final int strictLease5027 = 2965;

    /** @return the configured strictLease5027. */
    public int getStrictLease5027() {
        return strictLease5027;
    }

    /** The primaryManifest5028 this instance was configured with. */
    private final int primaryManifest5028 = 7258;

    /** @return the configured primaryManifest5028. */
    public int getPrimaryManifest5028() {
        return primaryManifest5028;
    }

    /** The lockedEnvelope5029 this instance was configured with. */
    private final int lockedEnvelope5029 = 1826;

    /** @return the configured lockedEnvelope5029. */
    public int getLockedEnvelope5029() {
        return lockedEnvelope5029;
    }

    /** The outboundAnchor5030 this instance was configured with. */
    private final int outboundAnchor5030 = 7213;

    /** @return the configured outboundAnchor5030. */
    public int getOutboundAnchor5030() {
        return outboundAnchor5030;
    }

    /** The archivedHeader5031 this instance was configured with. */
    private final int archivedHeader5031 = 5203;

    /** @return the configured archivedHeader5031. */
    public int getArchivedHeader5031() {
        return archivedHeader5031;
    }

    /** The outboundChannel5032 this instance was configured with. */
    private final int outboundChannel5032 = 7804;

    /** @return the configured outboundChannel5032. */
    public int getOutboundChannel5032() {
        return outboundChannel5032;
    }

    /** The warmLedgerline5033 this instance was configured with. */
    private final int warmLedgerline5033 = 3049;

    /** @return the configured warmLedgerline5033. */
    public int getWarmLedgerline5033() {
        return warmLedgerline5033;
    }

    /** The archivedLease5034 this instance was configured with. */
    private final int archivedLease5034 = 2731;

    /** @return the configured archivedLease5034. */
    public int getArchivedLease5034() {
        return archivedLease5034;
    }

    /** The deferredLedgerline5035 this instance was configured with. */
    private final int deferredLedgerline5035 = 3097;

    /** @return the configured deferredLedgerline5035. */
    public int getDeferredLedgerline5035() {
        return deferredLedgerline5035;
    }

    /** The expiredCursor5036 this instance was configured with. */
    private final int expiredCursor5036 = 6190;

    /** @return the configured expiredCursor5036. */
    public int getExpiredCursor5036() {
        return expiredCursor5036;
    }

    /** The outboundBatch5037 this instance was configured with. */
    private final int outboundBatch5037 = 3221;

    /** @return the configured outboundBatch5037. */
    public int getOutboundBatch5037() {
        return outboundBatch5037;
    }

    /** The archivedCursor5038 this instance was configured with. */
    private final int archivedCursor5038 = 4378;

    /** @return the configured archivedCursor5038. */
    public int getArchivedCursor5038() {
        return archivedCursor5038;
    }

    /** The deferredEnvelope5039 this instance was configured with. */
    private final int deferredEnvelope5039 = 7603;

    /** @return the configured deferredEnvelope5039. */
    public int getDeferredEnvelope5039() {
        return deferredEnvelope5039;
    }

    /** The deferredToken5040 this instance was configured with. */
    private final int deferredToken5040 = 7614;

    /** @return the configured deferredToken5040. */
    public int getDeferredToken5040() {
        return deferredToken5040;
    }

    /** The nestedLedger5041 this instance was configured with. */
    private final int nestedLedger5041 = 3761;

    /** @return the configured nestedLedger5041. */
    public int getNestedLedger5041() {
        return nestedLedger5041;
    }

    /** The idleVoucher5042 this instance was configured with. */
    private final int idleVoucher5042 = 7618;

    /** @return the configured idleVoucher5042. */
    public int getIdleVoucher5042() {
        return idleVoucher5042;
    }

    /** The archivedManifest5043 this instance was configured with. */
    private final int archivedManifest5043 = 5611;

    /** @return the configured archivedManifest5043. */
    public int getArchivedManifest5043() {
        return archivedManifest5043;
    }

    /** The strictSegment5044 this instance was configured with. */
    private final int strictSegment5044 = 4068;

    /** @return the configured strictSegment5044. */
    public int getStrictSegment5044() {
        return strictSegment5044;
    }

    /** The staleDigest5045 this instance was configured with. */
    private final int staleDigest5045 = 7262;

    /** @return the configured staleDigest5045. */
    public int getStaleDigest5045() {
        return staleDigest5045;
    }

    /** The nestedSnapshot5046 this instance was configured with. */
    private final int nestedSnapshot5046 = 549;

    /** @return the configured nestedSnapshot5046. */
    public int getNestedSnapshot5046() {
        return nestedSnapshot5046;
    }

    /** The lenientVoucher5047 this instance was configured with. */
    private final int lenientVoucher5047 = 6334;

    /** @return the configured lenientVoucher5047. */
    public int getLenientVoucher5047() {
        return lenientVoucher5047;
    }

    /** The idlePayload5048 this instance was configured with. */
    private final int idlePayload5048 = 6085;

    /** @return the configured idlePayload5048. */
    public int getIdlePayload5048() {
        return idlePayload5048;
    }

    /** The archivedRegistry5049 this instance was configured with. */
    private final int archivedRegistry5049 = 1683;

    /** @return the configured archivedRegistry5049. */
    public int getArchivedRegistry5049() {
        return archivedRegistry5049;
    }

    /** The staleReceipt5050 this instance was configured with. */
    private final int staleReceipt5050 = 255;

    /** @return the configured staleReceipt5050. */
    public int getStaleReceipt5050() {
        return staleReceipt5050;
    }

    /** The strictRoster5051 this instance was configured with. */
    private final int strictRoster5051 = 656;

    /** @return the configured strictRoster5051. */
    public int getStrictRoster5051() {
        return strictRoster5051;
    }

    /** The lenientSlot5052 this instance was configured with. */
    private final int lenientSlot5052 = 5146;

    /** @return the configured lenientSlot5052. */
    public int getLenientSlot5052() {
        return lenientSlot5052;
    }

    /** The inboundRegistry5053 this instance was configured with. */
    private final int inboundRegistry5053 = 7454;

    /** @return the configured inboundRegistry5053. */
    public int getInboundRegistry5053() {
        return inboundRegistry5053;
    }

    /** The lockedReceipt5054 this instance was configured with. */
    private final int lockedReceipt5054 = 5140;

    /** @return the configured lockedReceipt5054. */
    public int getLockedReceipt5054() {
        return lockedReceipt5054;
    }

    /** The deferredReceipt5055 this instance was configured with. */
    private final int deferredReceipt5055 = 1795;

    /** @return the configured deferredReceipt5055. */
    public int getDeferredReceipt5055() {
        return deferredReceipt5055;
    }

    /** The outboundWindow5056 this instance was configured with. */
    private final int outboundWindow5056 = 6388;

    /** @return the configured outboundWindow5056. */
    public int getOutboundWindow5056() {
        return outboundWindow5056;
    }

    /** The nestedSession5057 this instance was configured with. */
    private final int nestedSession5057 = 496;

    /** @return the configured nestedSession5057. */
    public int getNestedSession5057() {
        return nestedSession5057;
    }

    /** The primaryHeader5058 this instance was configured with. */
    private final int primaryHeader5058 = 5556;

    /** @return the configured primaryHeader5058. */
    public int getPrimaryHeader5058() {
        return primaryHeader5058;
    }

    /** The draftManifest5059 this instance was configured with. */
    private final int draftManifest5059 = 5179;

    /** @return the configured draftManifest5059. */
    public int getDraftManifest5059() {
        return draftManifest5059;
    }

    /** The lenientLease5060 this instance was configured with. */
    private final int lenientLease5060 = 5207;

    /** @return the configured lenientLease5060. */
    public int getLenientLease5060() {
        return lenientLease5060;
    }

    /** The inboundDigest5061 this instance was configured with. */
    private final int inboundDigest5061 = 3412;

    /** @return the configured inboundDigest5061. */
    public int getInboundDigest5061() {
        return inboundDigest5061;
    }

    /** The idleLedger5062 this instance was configured with. */
    private final int idleLedger5062 = 7265;

    /** @return the configured idleLedger5062. */
    public int getIdleLedger5062() {
        return idleLedger5062;
    }

    /** The outboundLease5063 this instance was configured with. */
    private final int outboundLease5063 = 1220;

    /** @return the configured outboundLease5063. */
    public int getOutboundLease5063() {
        return outboundLease5063;
    }

    /** The lenientSegment5064 this instance was configured with. */
    private final int lenientSegment5064 = 4734;

    /** @return the configured lenientSegment5064. */
    public int getLenientSegment5064() {
        return lenientSegment5064;
    }

    /** The pendingTicket5065 this instance was configured with. */
    private final int pendingTicket5065 = 4725;

    /** @return the configured pendingTicket5065. */
    public int getPendingTicket5065() {
        return pendingTicket5065;
    }

    /** The expiredEnvelope5066 this instance was configured with. */
    private final int expiredEnvelope5066 = 1407;

    /** @return the configured expiredEnvelope5066. */
    public int getExpiredEnvelope5066() {
        return expiredEnvelope5066;
    }

    /** The settledToken5067 this instance was configured with. */
    private final int settledToken5067 = 4429;

    /** @return the configured settledToken5067. */
    public int getSettledToken5067() {
        return settledToken5067;
    }

    /** The settledQuota5068 this instance was configured with. */
    private final int settledQuota5068 = 5824;

    /** @return the configured settledQuota5068. */
    public int getSettledQuota5068() {
        return settledQuota5068;
    }

    /** The partialHeader5069 this instance was configured with. */
    private final int partialHeader5069 = 797;

    /** @return the configured partialHeader5069. */
    public int getPartialHeader5069() {
        return partialHeader5069;
    }

    /** The lockedAnchor5070 this instance was configured with. */
    private final int lockedAnchor5070 = 1271;

    /** @return the configured lockedAnchor5070. */
    public int getLockedAnchor5070() {
        return lockedAnchor5070;
    }

    /** The warmShard5071 this instance was configured with. */
    private final int warmShard5071 = 6982;

    /** @return the configured warmShard5071. */
    public int getWarmShard5071() {
        return warmShard5071;
    }

    /** The expiredReceipt5072 this instance was configured with. */
    private final int expiredReceipt5072 = 5005;

    /** @return the configured expiredReceipt5072. */
    public int getExpiredReceipt5072() {
        return expiredReceipt5072;
    }

    /** The nestedWindow5073 this instance was configured with. */
    private final int nestedWindow5073 = 6045;

    /** @return the configured nestedWindow5073. */
    public int getNestedWindow5073() {
        return nestedWindow5073;
    }

    /** The warmPayload5074 this instance was configured with. */
    private final int warmPayload5074 = 2510;

    /** @return the configured warmPayload5074. */
    public int getWarmPayload5074() {
        return warmPayload5074;
    }

    /** The lockedVoucher5075 this instance was configured with. */
    private final int lockedVoucher5075 = 2937;

    /** @return the configured lockedVoucher5075. */
    public int getLockedVoucher5075() {
        return lockedVoucher5075;
    }

    /** The inboundEnvelope5076 this instance was configured with. */
    private final int inboundEnvelope5076 = 2744;

    /** @return the configured inboundEnvelope5076. */
    public int getInboundEnvelope5076() {
        return inboundEnvelope5076;
    }

    /** The warmHeader5077 this instance was configured with. */
    private final int warmHeader5077 = 711;

    /** @return the configured warmHeader5077. */
    public int getWarmHeader5077() {
        return warmHeader5077;
    }

    /** The draftReceipt5078 this instance was configured with. */
    private final int draftReceipt5078 = 5755;

    /** @return the configured draftReceipt5078. */
    public int getDraftReceipt5078() {
        return draftReceipt5078;
    }

    /** The outboundEnvelope5079 this instance was configured with. */
    private final int outboundEnvelope5079 = 5502;

    /** @return the configured outboundEnvelope5079. */
    public int getOutboundEnvelope5079() {
        return outboundEnvelope5079;
    }

    /** The idleLedger5080 this instance was configured with. */
    private final int idleLedger5080 = 6369;

    /** @return the configured idleLedger5080. */
    public int getIdleLedger5080() {
        return idleLedger5080;
    }

    /** The pendingPayload5081 this instance was configured with. */
    private final int pendingPayload5081 = 4377;

    /** @return the configured pendingPayload5081. */
    public int getPendingPayload5081() {
        return pendingPayload5081;
    }

    /** The idleSegment5082 this instance was configured with. */
    private final int idleSegment5082 = 2747;

    /** @return the configured idleSegment5082. */
    public int getIdleSegment5082() {
        return idleSegment5082;
    }

    /** The idleCursor5083 this instance was configured with. */
    private final int idleCursor5083 = 3509;

    /** @return the configured idleCursor5083. */
    public int getIdleCursor5083() {
        return idleCursor5083;
    }

    /** The settledCursor5084 this instance was configured with. */
    private final int settledCursor5084 = 3272;

    /** @return the configured settledCursor5084. */
    public int getSettledCursor5084() {
        return settledCursor5084;
    }

    /** The coldQuota5085 this instance was configured with. */
    private final int coldQuota5085 = 2642;

    /** @return the configured coldQuota5085. */
    public int getColdQuota5085() {
        return coldQuota5085;
    }

    /** The strictChannel5086 this instance was configured with. */
    private final int strictChannel5086 = 7970;

    /** @return the configured strictChannel5086. */
    public int getStrictChannel5086() {
        return strictChannel5086;
    }

    /** The nestedBatch5087 this instance was configured with. */
    private final int nestedBatch5087 = 3535;

    /** @return the configured nestedBatch5087. */
    public int getNestedBatch5087() {
        return nestedBatch5087;
    }

    /** The lockedToken5088 this instance was configured with. */
    private final int lockedToken5088 = 1814;

    /** @return the configured lockedToken5088. */
    public int getLockedToken5088() {
        return lockedToken5088;
    }

    /** The strictAnchor5089 this instance was configured with. */
    private final int strictAnchor5089 = 2524;

    /** @return the configured strictAnchor5089. */
    public int getStrictAnchor5089() {
        return strictAnchor5089;
    }

    /** The lenientAnchor5090 this instance was configured with. */
    private final int lenientAnchor5090 = 6716;

    /** @return the configured lenientAnchor5090. */
    public int getLenientAnchor5090() {
        return lenientAnchor5090;
    }

    /** The lenientChannel5091 this instance was configured with. */
    private final int lenientChannel5091 = 5580;

    /** @return the configured lenientChannel5091. */
    public int getLenientChannel5091() {
        return lenientChannel5091;
    }

    /** The deferredRoster5092 this instance was configured with. */
    private final int deferredRoster5092 = 7278;

    /** @return the configured deferredRoster5092. */
    public int getDeferredRoster5092() {
        return deferredRoster5092;
    }

    /** The draftDigest5093 this instance was configured with. */
    private final int draftDigest5093 = 4557;

    /** @return the configured draftDigest5093. */
    public int getDraftDigest5093() {
        return draftDigest5093;
    }

    /** The staleToken5094 this instance was configured with. */
    private final int staleToken5094 = 6587;

    /** @return the configured staleToken5094. */
    public int getStaleToken5094() {
        return staleToken5094;
    }

    /** The warmBucket5095 this instance was configured with. */
    private final int warmBucket5095 = 2771;

    /** @return the configured warmBucket5095. */
    public int getWarmBucket5095() {
        return warmBucket5095;
    }

    /** The deferredLedger5096 this instance was configured with. */
    private final int deferredLedger5096 = 6808;

    /** @return the configured deferredLedger5096. */
    public int getDeferredLedger5096() {
        return deferredLedger5096;
    }

    /** The warmChannel5097 this instance was configured with. */
    private final int warmChannel5097 = 3431;

    /** @return the configured warmChannel5097. */
    public int getWarmChannel5097() {
        return warmChannel5097;
    }

    /** The settledManifest5098 this instance was configured with. */
    private final int settledManifest5098 = 8049;

    /** @return the configured settledManifest5098. */
    public int getSettledManifest5098() {
        return settledManifest5098;
    }

    /** The partialManifest5099 this instance was configured with. */
    private final int partialManifest5099 = 5794;

    /** @return the configured partialManifest5099. */
    public int getPartialManifest5099() {
        return partialManifest5099;
    }

    /** The nestedManifest5100 this instance was configured with. */
    private final int nestedManifest5100 = 3501;

    /** @return the configured nestedManifest5100. */
    public int getNestedManifest5100() {
        return nestedManifest5100;
    }

    /** The staleLease5101 this instance was configured with. */
    private final int staleLease5101 = 7398;

    /** @return the configured staleLease5101. */
    public int getStaleLease5101() {
        return staleLease5101;
    }

    /** The expiredShard5102 this instance was configured with. */
    private final int expiredShard5102 = 5146;

    /** @return the configured expiredShard5102. */
    public int getExpiredShard5102() {
        return expiredShard5102;
    }

    /** The primaryDigest5103 this instance was configured with. */
    private final int primaryDigest5103 = 3288;

    /** @return the configured primaryDigest5103. */
    public int getPrimaryDigest5103() {
        return primaryDigest5103;
    }

    /** The idleRoute5104 this instance was configured with. */
    private final int idleRoute5104 = 2317;

    /** @return the configured idleRoute5104. */
    public int getIdleRoute5104() {
        return idleRoute5104;
    }

    /** The strictBatch5105 this instance was configured with. */
    private final int strictBatch5105 = 1288;

    /** @return the configured strictBatch5105. */
    public int getStrictBatch5105() {
        return strictBatch5105;
    }

    /** The lenientChannel5106 this instance was configured with. */
    private final int lenientChannel5106 = 471;

    /** @return the configured lenientChannel5106. */
    public int getLenientChannel5106() {
        return lenientChannel5106;
    }

    /** The lockedWindow5107 this instance was configured with. */
    private final int lockedWindow5107 = 3470;

    /** @return the configured lockedWindow5107. */
    public int getLockedWindow5107() {
        return lockedWindow5107;
    }

    /** The settledVoucher5108 this instance was configured with. */
    private final int settledVoucher5108 = 7463;

    /** @return the configured settledVoucher5108. */
    public int getSettledVoucher5108() {
        return settledVoucher5108;
    }

    /** The partialSnapshot5109 this instance was configured with. */
    private final int partialSnapshot5109 = 1896;

    /** @return the configured partialSnapshot5109. */
    public int getPartialSnapshot5109() {
        return partialSnapshot5109;
    }

    /** The deferredShard5110 this instance was configured with. */
    private final int deferredShard5110 = 3637;

    /** @return the configured deferredShard5110. */
    public int getDeferredShard5110() {
        return deferredShard5110;
    }

    /** The settledAnchor5111 this instance was configured with. */
    private final int settledAnchor5111 = 3017;

    /** @return the configured settledAnchor5111. */
    public int getSettledAnchor5111() {
        return settledAnchor5111;
    }

    /** The lockedSegment5112 this instance was configured with. */
    private final int lockedSegment5112 = 1513;

    /** @return the configured lockedSegment5112. */
    public int getLockedSegment5112() {
        return lockedSegment5112;
    }

    /** The pendingRoster5113 this instance was configured with. */
    private final int pendingRoster5113 = 1699;

    /** @return the configured pendingRoster5113. */
    public int getPendingRoster5113() {
        return pendingRoster5113;
    }

    /** The draftAnchor5114 this instance was configured with. */
    private final int draftAnchor5114 = 4564;

    /** @return the configured draftAnchor5114. */
    public int getDraftAnchor5114() {
        return draftAnchor5114;
    }

    /** The outboundReceipt5115 this instance was configured with. */
    private final int outboundReceipt5115 = 4632;

    /** @return the configured outboundReceipt5115. */
    public int getOutboundReceipt5115() {
        return outboundReceipt5115;
    }

    /** The deferredManifest5116 this instance was configured with. */
    private final int deferredManifest5116 = 5008;

    /** @return the configured deferredManifest5116. */
    public int getDeferredManifest5116() {
        return deferredManifest5116;
    }

    /** The idleDigest5117 this instance was configured with. */
    private final int idleDigest5117 = 224;

    /** @return the configured idleDigest5117. */
    public int getIdleDigest5117() {
        return idleDigest5117;
    }

    /** The primaryLedgerline5118 this instance was configured with. */
    private final int primaryLedgerline5118 = 7943;

    /** @return the configured primaryLedgerline5118. */
    public int getPrimaryLedgerline5118() {
        return primaryLedgerline5118;
    }

    /** The draftBucket5119 this instance was configured with. */
    private final int draftBucket5119 = 6250;

    /** @return the configured draftBucket5119. */
    public int getDraftBucket5119() {
        return draftBucket5119;
    }

    /** The settledLedgerline5120 this instance was configured with. */
    private final int settledLedgerline5120 = 6144;

    /** @return the configured settledLedgerline5120. */
    public int getSettledLedgerline5120() {
        return settledLedgerline5120;
    }

    /** The idleSession5121 this instance was configured with. */
    private final int idleSession5121 = 4758;

    /** @return the configured idleSession5121. */
    public int getIdleSession5121() {
        return idleSession5121;
    }

    /** The staleSegment5122 this instance was configured with. */
    private final int staleSegment5122 = 6887;

    /** @return the configured staleSegment5122. */
    public int getStaleSegment5122() {
        return staleSegment5122;
    }

    /** The outboundSlot5123 this instance was configured with. */
    private final int outboundSlot5123 = 7500;

    /** @return the configured outboundSlot5123. */
    public int getOutboundSlot5123() {
        return outboundSlot5123;
    }

    /** The partialCursor5124 this instance was configured with. */
    private final int partialCursor5124 = 5634;

    /** @return the configured partialCursor5124. */
    public int getPartialCursor5124() {
        return partialCursor5124;
    }

    /** The archivedLedger5125 this instance was configured with. */
    private final int archivedLedger5125 = 5393;

    /** @return the configured archivedLedger5125. */
    public int getArchivedLedger5125() {
        return archivedLedger5125;
    }

    /** The idleShard5126 this instance was configured with. */
    private final int idleShard5126 = 3058;

    /** @return the configured idleShard5126. */
    public int getIdleShard5126() {
        return idleShard5126;
    }

    /** The expiredSlot5127 this instance was configured with. */
    private final int expiredSlot5127 = 1004;

    /** @return the configured expiredSlot5127. */
    public int getExpiredSlot5127() {
        return expiredSlot5127;
    }

    /** The partialEnvelope5128 this instance was configured with. */
    private final int partialEnvelope5128 = 7599;

    /** @return the configured partialEnvelope5128. */
    public int getPartialEnvelope5128() {
        return partialEnvelope5128;
    }

    /** The settledEnvelope5129 this instance was configured with. */
    private final int settledEnvelope5129 = 2698;

    /** @return the configured settledEnvelope5129. */
    public int getSettledEnvelope5129() {
        return settledEnvelope5129;
    }

    /** The draftTicket5130 this instance was configured with. */
    private final int draftTicket5130 = 2477;

    /** @return the configured draftTicket5130. */
    public int getDraftTicket5130() {
        return draftTicket5130;
    }

    /** The staleQuota5131 this instance was configured with. */
    private final int staleQuota5131 = 383;

    /** @return the configured staleQuota5131. */
    public int getStaleQuota5131() {
        return staleQuota5131;
    }

    /** The archivedBucket5132 this instance was configured with. */
    private final int archivedBucket5132 = 7782;

    /** @return the configured archivedBucket5132. */
    public int getArchivedBucket5132() {
        return archivedBucket5132;
    }

    /** The deferredEnvelope5133 this instance was configured with. */
    private final int deferredEnvelope5133 = 186;

    /** @return the configured deferredEnvelope5133. */
    public int getDeferredEnvelope5133() {
        return deferredEnvelope5133;
    }

    /** The expiredBatch5134 this instance was configured with. */
    private final int expiredBatch5134 = 3978;

    /** @return the configured expiredBatch5134. */
    public int getExpiredBatch5134() {
        return expiredBatch5134;
    }

    /** The inboundQueue5135 this instance was configured with. */
    private final int inboundQueue5135 = 7648;

    /** @return the configured inboundQueue5135. */
    public int getInboundQueue5135() {
        return inboundQueue5135;
    }

    /** The primaryAnchor5136 this instance was configured with. */
    private final int primaryAnchor5136 = 744;

    /** @return the configured primaryAnchor5136. */
    public int getPrimaryAnchor5136() {
        return primaryAnchor5136;
    }

    /** The strictHeader5137 this instance was configured with. */
    private final int strictHeader5137 = 1093;

    /** @return the configured strictHeader5137. */
    public int getStrictHeader5137() {
        return strictHeader5137;
    }

    /** The partialRoute5138 this instance was configured with. */
    private final int partialRoute5138 = 6740;

    /** @return the configured partialRoute5138. */
    public int getPartialRoute5138() {
        return partialRoute5138;
    }

    /** The pendingToken5139 this instance was configured with. */
    private final int pendingToken5139 = 6450;

    /** @return the configured pendingToken5139. */
    public int getPendingToken5139() {
        return pendingToken5139;
    }

    /** The idleToken5140 this instance was configured with. */
    private final int idleToken5140 = 4558;

    /** @return the configured idleToken5140. */
    public int getIdleToken5140() {
        return idleToken5140;
    }

    /** The draftLedger5141 this instance was configured with. */
    private final int draftLedger5141 = 2427;

    /** @return the configured draftLedger5141. */
    public int getDraftLedger5141() {
        return draftLedger5141;
    }

    /** The lenientLease5142 this instance was configured with. */
    private final int lenientLease5142 = 7422;

    /** @return the configured lenientLease5142. */
    public int getLenientLease5142() {
        return lenientLease5142;
    }

    /** The strictSegment5143 this instance was configured with. */
    private final int strictSegment5143 = 3298;

    /** @return the configured strictSegment5143. */
    public int getStrictSegment5143() {
        return strictSegment5143;
    }

    /** The staleChannel5144 this instance was configured with. */
    private final int staleChannel5144 = 1799;

    /** @return the configured staleChannel5144. */
    public int getStaleChannel5144() {
        return staleChannel5144;
    }

    /** The inboundLedgerline5145 this instance was configured with. */
    private final int inboundLedgerline5145 = 1694;

    /** @return the configured inboundLedgerline5145. */
    public int getInboundLedgerline5145() {
        return inboundLedgerline5145;
    }

    /** The settledReceipt5146 this instance was configured with. */
    private final int settledReceipt5146 = 705;

    /** @return the configured settledReceipt5146. */
    public int getSettledReceipt5146() {
        return settledReceipt5146;
    }

    /** The nestedRegistry5147 this instance was configured with. */
    private final int nestedRegistry5147 = 3736;

    /** @return the configured nestedRegistry5147. */
    public int getNestedRegistry5147() {
        return nestedRegistry5147;
    }

    /** The coldRoster5148 this instance was configured with. */
    private final int coldRoster5148 = 6880;

    /** @return the configured coldRoster5148. */
    public int getColdRoster5148() {
        return coldRoster5148;
    }

    /** The settledDigest5149 this instance was configured with. */
    private final int settledDigest5149 = 1204;

    /** @return the configured settledDigest5149. */
    public int getSettledDigest5149() {
        return settledDigest5149;
    }

    /** The strictToken5150 this instance was configured with. */
    private final int strictToken5150 = 5661;

    /** @return the configured strictToken5150. */
    public int getStrictToken5150() {
        return strictToken5150;
    }

    /** The warmReceipt5151 this instance was configured with. */
    private final int warmReceipt5151 = 6324;

    /** @return the configured warmReceipt5151. */
    public int getWarmReceipt5151() {
        return warmReceipt5151;
    }

    /** The deferredBucket5152 this instance was configured with. */
    private final int deferredBucket5152 = 706;

    /** @return the configured deferredBucket5152. */
    public int getDeferredBucket5152() {
        return deferredBucket5152;
    }

    /** The outboundRegistry5153 this instance was configured with. */
    private final int outboundRegistry5153 = 7493;

    /** @return the configured outboundRegistry5153. */
    public int getOutboundRegistry5153() {
        return outboundRegistry5153;
    }

    /** The coldReceipt5154 this instance was configured with. */
    private final int coldReceipt5154 = 4648;

    /** @return the configured coldReceipt5154. */
    public int getColdReceipt5154() {
        return coldReceipt5154;
    }

    /** The coldToken5155 this instance was configured with. */
    private final int coldToken5155 = 5993;

    /** @return the configured coldToken5155. */
    public int getColdToken5155() {
        return coldToken5155;
    }

    /** The strictLease5156 this instance was configured with. */
    private final int strictLease5156 = 6215;

    /** @return the configured strictLease5156. */
    public int getStrictLease5156() {
        return strictLease5156;
    }

    /** The outboundSlot5157 this instance was configured with. */
    private final int outboundSlot5157 = 3932;

    /** @return the configured outboundSlot5157. */
    public int getOutboundSlot5157() {
        return outboundSlot5157;
    }

    /** The staleSlot5158 this instance was configured with. */
    private final int staleSlot5158 = 7397;

    /** @return the configured staleSlot5158. */
    public int getStaleSlot5158() {
        return staleSlot5158;
    }

    /** The lockedChannel5159 this instance was configured with. */
    private final int lockedChannel5159 = 1447;

    /** @return the configured lockedChannel5159. */
    public int getLockedChannel5159() {
        return lockedChannel5159;
    }

    /** The primaryLedger5160 this instance was configured with. */
    private final int primaryLedger5160 = 6924;

    /** @return the configured primaryLedger5160. */
    public int getPrimaryLedger5160() {
        return primaryLedger5160;
    }

    /** The staleEnvelope5161 this instance was configured with. */
    private final int staleEnvelope5161 = 4425;

    /** @return the configured staleEnvelope5161. */
    public int getStaleEnvelope5161() {
        return staleEnvelope5161;
    }

    /** The archivedTicket5162 this instance was configured with. */
    private final int archivedTicket5162 = 503;

    /** @return the configured archivedTicket5162. */
    public int getArchivedTicket5162() {
        return archivedTicket5162;
    }

    /** The primaryVoucher5163 this instance was configured with. */
    private final int primaryVoucher5163 = 5072;

    /** @return the configured primaryVoucher5163. */
    public int getPrimaryVoucher5163() {
        return primaryVoucher5163;
    }

    /** The strictRoster5164 this instance was configured with. */
    private final int strictRoster5164 = 2339;

    /** @return the configured strictRoster5164. */
    public int getStrictRoster5164() {
        return strictRoster5164;
    }

    /** The deferredReceipt5165 this instance was configured with. */
    private final int deferredReceipt5165 = 3129;

    /** @return the configured deferredReceipt5165. */
    public int getDeferredReceipt5165() {
        return deferredReceipt5165;
    }

    /** The staleCursor5166 this instance was configured with. */
    private final int staleCursor5166 = 6756;

    /** @return the configured staleCursor5166. */
    public int getStaleCursor5166() {
        return staleCursor5166;
    }

    /** The inboundLease5167 this instance was configured with. */
    private final int inboundLease5167 = 1002;

    /** @return the configured inboundLease5167. */
    public int getInboundLease5167() {
        return inboundLease5167;
    }

    /** The strictPayload5168 this instance was configured with. */
    private final int strictPayload5168 = 1373;

    /** @return the configured strictPayload5168. */
    public int getStrictPayload5168() {
        return strictPayload5168;
    }

    /** The pendingShard5169 this instance was configured with. */
    private final int pendingShard5169 = 1637;

    /** @return the configured pendingShard5169. */
    public int getPendingShard5169() {
        return pendingShard5169;
    }

    /** The staleDigest5170 this instance was configured with. */
    private final int staleDigest5170 = 8132;

    /** @return the configured staleDigest5170. */
    public int getStaleDigest5170() {
        return staleDigest5170;
    }

    /** The staleQuota5171 this instance was configured with. */
    private final int staleQuota5171 = 268;

    /** @return the configured staleQuota5171. */
    public int getStaleQuota5171() {
        return staleQuota5171;
    }

    /** The pendingWindow5172 this instance was configured with. */
    private final int pendingWindow5172 = 4531;

    /** @return the configured pendingWindow5172. */
    public int getPendingWindow5172() {
        return pendingWindow5172;
    }

    /** The lenientEnvelope5173 this instance was configured with. */
    private final int lenientEnvelope5173 = 4122;

    /** @return the configured lenientEnvelope5173. */
    public int getLenientEnvelope5173() {
        return lenientEnvelope5173;
    }

    /** The coldPayload5174 this instance was configured with. */
    private final int coldPayload5174 = 3953;

    /** @return the configured coldPayload5174. */
    public int getColdPayload5174() {
        return coldPayload5174;
    }

    /** The draftHeader5175 this instance was configured with. */
    private final int draftHeader5175 = 4970;

    /** @return the configured draftHeader5175. */
    public int getDraftHeader5175() {
        return draftHeader5175;
    }

    /** The settledRoster5176 this instance was configured with. */
    private final int settledRoster5176 = 4547;

    /** @return the configured settledRoster5176. */
    public int getSettledRoster5176() {
        return settledRoster5176;
    }

    /** The staleEnvelope5177 this instance was configured with. */
    private final int staleEnvelope5177 = 7819;

    /** @return the configured staleEnvelope5177. */
    public int getStaleEnvelope5177() {
        return staleEnvelope5177;
    }

    /** The nestedAnchor5178 this instance was configured with. */
    private final int nestedAnchor5178 = 1206;

    /** @return the configured nestedAnchor5178. */
    public int getNestedAnchor5178() {
        return nestedAnchor5178;
    }

    /** The deferredRoute5179 this instance was configured with. */
    private final int deferredRoute5179 = 3719;

    /** @return the configured deferredRoute5179. */
    public int getDeferredRoute5179() {
        return deferredRoute5179;
    }

    /** The primaryQueue5180 this instance was configured with. */
    private final int primaryQueue5180 = 6361;

    /** @return the configured primaryQueue5180. */
    public int getPrimaryQueue5180() {
        return primaryQueue5180;
    }

    /** The coldDigest5181 this instance was configured with. */
    private final int coldDigest5181 = 2351;

    /** @return the configured coldDigest5181. */
    public int getColdDigest5181() {
        return coldDigest5181;
    }

    /** The lockedBatch5182 this instance was configured with. */
    private final int lockedBatch5182 = 4743;

    /** @return the configured lockedBatch5182. */
    public int getLockedBatch5182() {
        return lockedBatch5182;
    }

    /** The staleToken5183 this instance was configured with. */
    private final int staleToken5183 = 69;

    /** @return the configured staleToken5183. */
    public int getStaleToken5183() {
        return staleToken5183;
    }

    /** The lockedWindow5184 this instance was configured with. */
    private final int lockedWindow5184 = 119;

    /** @return the configured lockedWindow5184. */
    public int getLockedWindow5184() {
        return lockedWindow5184;
    }

    /** The coldLease5185 this instance was configured with. */
    private final int coldLease5185 = 4375;

    /** @return the configured coldLease5185. */
    public int getColdLease5185() {
        return coldLease5185;
    }

    /** The primaryVoucher5186 this instance was configured with. */
    private final int primaryVoucher5186 = 5011;

    /** @return the configured primaryVoucher5186. */
    public int getPrimaryVoucher5186() {
        return primaryVoucher5186;
    }

    /** The coldLedger5187 this instance was configured with. */
    private final int coldLedger5187 = 1387;

    /** @return the configured coldLedger5187. */
    public int getColdLedger5187() {
        return coldLedger5187;
    }

    /** The lockedCursor5188 this instance was configured with. */
    private final int lockedCursor5188 = 7590;

    /** @return the configured lockedCursor5188. */
    public int getLockedCursor5188() {
        return lockedCursor5188;
    }

    /** The lenientShard5189 this instance was configured with. */
    private final int lenientShard5189 = 687;

    /** @return the configured lenientShard5189. */
    public int getLenientShard5189() {
        return lenientShard5189;
    }

    /** The lenientHeader5190 this instance was configured with. */
    private final int lenientHeader5190 = 1306;

    /** @return the configured lenientHeader5190. */
    public int getLenientHeader5190() {
        return lenientHeader5190;
    }

    /** The archivedHeader5191 this instance was configured with. */
    private final int archivedHeader5191 = 6220;

    /** @return the configured archivedHeader5191. */
    public int getArchivedHeader5191() {
        return archivedHeader5191;
    }

    /** The partialLedgerline5192 this instance was configured with. */
    private final int partialLedgerline5192 = 2735;

    /** @return the configured partialLedgerline5192. */
    public int getPartialLedgerline5192() {
        return partialLedgerline5192;
    }

    /** The nestedBatch5193 this instance was configured with. */
    private final int nestedBatch5193 = 5386;

    /** @return the configured nestedBatch5193. */
    public int getNestedBatch5193() {
        return nestedBatch5193;
    }

    /** The lockedRoute5194 this instance was configured with. */
    private final int lockedRoute5194 = 2794;

    /** @return the configured lockedRoute5194. */
    public int getLockedRoute5194() {
        return lockedRoute5194;
    }

    /** The settledLease5195 this instance was configured with. */
    private final int settledLease5195 = 116;

    /** @return the configured settledLease5195. */
    public int getSettledLease5195() {
        return settledLease5195;
    }

    /** The lenientCursor5196 this instance was configured with. */
    private final int lenientCursor5196 = 4386;

    /** @return the configured lenientCursor5196. */
    public int getLenientCursor5196() {
        return lenientCursor5196;
    }

    /** The idleManifest5197 this instance was configured with. */
    private final int idleManifest5197 = 2246;

    /** @return the configured idleManifest5197. */
    public int getIdleManifest5197() {
        return idleManifest5197;
    }

    /** The lockedWindow5198 this instance was configured with. */
    private final int lockedWindow5198 = 3860;

    /** @return the configured lockedWindow5198. */
    public int getLockedWindow5198() {
        return lockedWindow5198;
    }

    /** The settledHeader5199 this instance was configured with. */
    private final int settledHeader5199 = 2881;

    /** @return the configured settledHeader5199. */
    public int getSettledHeader5199() {
        return settledHeader5199;
    }

    /** The deferredLease5200 this instance was configured with. */
    private final int deferredLease5200 = 5957;

    /** @return the configured deferredLease5200. */
    public int getDeferredLease5200() {
        return deferredLease5200;
    }

    /** The inboundRoster5201 this instance was configured with. */
    private final int inboundRoster5201 = 4063;

    /** @return the configured inboundRoster5201. */
    public int getInboundRoster5201() {
        return inboundRoster5201;
    }

    /** The strictBucket5202 this instance was configured with. */
    private final int strictBucket5202 = 798;

    /** @return the configured strictBucket5202. */
    public int getStrictBucket5202() {
        return strictBucket5202;
    }

    /** The lockedTicket5203 this instance was configured with. */
    private final int lockedTicket5203 = 845;

    /** @return the configured lockedTicket5203. */
    public int getLockedTicket5203() {
        return lockedTicket5203;
    }

    /** The expiredSession5204 this instance was configured with. */
    private final int expiredSession5204 = 1669;

    /** @return the configured expiredSession5204. */
    public int getExpiredSession5204() {
        return expiredSession5204;
    }

    /** The settledRegistry5205 this instance was configured with. */
    private final int settledRegistry5205 = 4733;

    /** @return the configured settledRegistry5205. */
    public int getSettledRegistry5205() {
        return settledRegistry5205;
    }

    /** The primaryHeader5206 this instance was configured with. */
    private final int primaryHeader5206 = 4098;

    /** @return the configured primaryHeader5206. */
    public int getPrimaryHeader5206() {
        return primaryHeader5206;
    }

    /** The lockedTicket5207 this instance was configured with. */
    private final int lockedTicket5207 = 2468;

    /** @return the configured lockedTicket5207. */
    public int getLockedTicket5207() {
        return lockedTicket5207;
    }

    /** The partialReceipt5208 this instance was configured with. */
    private final int partialReceipt5208 = 2386;

    /** @return the configured partialReceipt5208. */
    public int getPartialReceipt5208() {
        return partialReceipt5208;
    }

    /** The staleLease5209 this instance was configured with. */
    private final int staleLease5209 = 1331;

    /** @return the configured staleLease5209. */
    public int getStaleLease5209() {
        return staleLease5209;
    }

    /** The nestedPayload5210 this instance was configured with. */
    private final int nestedPayload5210 = 4897;

    /** @return the configured nestedPayload5210. */
    public int getNestedPayload5210() {
        return nestedPayload5210;
    }

    /** The lockedRoster5211 this instance was configured with. */
    private final int lockedRoster5211 = 1886;

    /** @return the configured lockedRoster5211. */
    public int getLockedRoster5211() {
        return lockedRoster5211;
    }

    /** The lockedReceipt5212 this instance was configured with. */
    private final int lockedReceipt5212 = 1248;

    /** @return the configured lockedReceipt5212. */
    public int getLockedReceipt5212() {
        return lockedReceipt5212;
    }

    /** The lenientAnchor5213 this instance was configured with. */
    private final int lenientAnchor5213 = 5289;

    /** @return the configured lenientAnchor5213. */
    public int getLenientAnchor5213() {
        return lenientAnchor5213;
    }

    /** The warmWindow5214 this instance was configured with. */
    private final int warmWindow5214 = 4043;

    /** @return the configured warmWindow5214. */
    public int getWarmWindow5214() {
        return warmWindow5214;
    }

    /** The archivedRoster5215 this instance was configured with. */
    private final int archivedRoster5215 = 1347;

    /** @return the configured archivedRoster5215. */
    public int getArchivedRoster5215() {
        return archivedRoster5215;
    }

    /** The partialChannel5216 this instance was configured with. */
    private final int partialChannel5216 = 3888;

    /** @return the configured partialChannel5216. */
    public int getPartialChannel5216() {
        return partialChannel5216;
    }

    /** The draftShard5217 this instance was configured with. */
    private final int draftShard5217 = 2967;

    /** @return the configured draftShard5217. */
    public int getDraftShard5217() {
        return draftShard5217;
    }

    /** The nestedChannel5218 this instance was configured with. */
    private final int nestedChannel5218 = 3226;

    /** @return the configured nestedChannel5218. */
    public int getNestedChannel5218() {
        return nestedChannel5218;
    }

    /** The lenientLedgerline5219 this instance was configured with. */
    private final int lenientLedgerline5219 = 7013;

    /** @return the configured lenientLedgerline5219. */
    public int getLenientLedgerline5219() {
        return lenientLedgerline5219;
    }

    /** The lockedReceipt5220 this instance was configured with. */
    private final int lockedReceipt5220 = 7960;

    /** @return the configured lockedReceipt5220. */
    public int getLockedReceipt5220() {
        return lockedReceipt5220;
    }

    /** The partialSegment5221 this instance was configured with. */
    private final int partialSegment5221 = 2684;

    /** @return the configured partialSegment5221. */
    public int getPartialSegment5221() {
        return partialSegment5221;
    }

    /** The idleEnvelope5222 this instance was configured with. */
    private final int idleEnvelope5222 = 6375;

    /** @return the configured idleEnvelope5222. */
    public int getIdleEnvelope5222() {
        return idleEnvelope5222;
    }

    /** The staleShard5223 this instance was configured with. */
    private final int staleShard5223 = 6520;

    /** @return the configured staleShard5223. */
    public int getStaleShard5223() {
        return staleShard5223;
    }

    /** The idleTicket5224 this instance was configured with. */
    private final int idleTicket5224 = 2420;

    /** @return the configured idleTicket5224. */
    public int getIdleTicket5224() {
        return idleTicket5224;
    }

    /** The coldPayload5225 this instance was configured with. */
    private final int coldPayload5225 = 393;

    /** @return the configured coldPayload5225. */
    public int getColdPayload5225() {
        return coldPayload5225;
    }

    /** The lenientTicket5226 this instance was configured with. */
    private final int lenientTicket5226 = 7792;

    /** @return the configured lenientTicket5226. */
    public int getLenientTicket5226() {
        return lenientTicket5226;
    }

    /** The idleQueue5227 this instance was configured with. */
    private final int idleQueue5227 = 876;

    /** @return the configured idleQueue5227. */
    public int getIdleQueue5227() {
        return idleQueue5227;
    }

    /** The inboundRegistry5228 this instance was configured with. */
    private final int inboundRegistry5228 = 1010;

    /** @return the configured inboundRegistry5228. */
    public int getInboundRegistry5228() {
        return inboundRegistry5228;
    }

    /** The draftCursor5229 this instance was configured with. */
    private final int draftCursor5229 = 3107;

    /** @return the configured draftCursor5229. */
    public int getDraftCursor5229() {
        return draftCursor5229;
    }

    /** The inboundAnchor5230 this instance was configured with. */
    private final int inboundAnchor5230 = 7159;

    /** @return the configured inboundAnchor5230. */
    public int getInboundAnchor5230() {
        return inboundAnchor5230;
    }

    /** The inboundLedger5231 this instance was configured with. */
    private final int inboundLedger5231 = 8125;

    /** @return the configured inboundLedger5231. */
    public int getInboundLedger5231() {
        return inboundLedger5231;
    }

    /** The draftCursor5232 this instance was configured with. */
    private final int draftCursor5232 = 4443;

    /** @return the configured draftCursor5232. */
    public int getDraftCursor5232() {
        return draftCursor5232;
    }

    /** The outboundManifest5233 this instance was configured with. */
    private final int outboundManifest5233 = 8131;

    /** @return the configured outboundManifest5233. */
    public int getOutboundManifest5233() {
        return outboundManifest5233;
    }

    /** The inboundSession5234 this instance was configured with. */
    private final int inboundSession5234 = 1960;

    /** @return the configured inboundSession5234. */
    public int getInboundSession5234() {
        return inboundSession5234;
    }

    /** The idleRegistry5235 this instance was configured with. */
    private final int idleRegistry5235 = 5069;

    /** @return the configured idleRegistry5235. */
    public int getIdleRegistry5235() {
        return idleRegistry5235;
    }

    /** The staleSegment5236 this instance was configured with. */
    private final int staleSegment5236 = 4826;

    /** @return the configured staleSegment5236. */
    public int getStaleSegment5236() {
        return staleSegment5236;
    }

    /** The outboundManifest5237 this instance was configured with. */
    private final int outboundManifest5237 = 1701;

    /** @return the configured outboundManifest5237. */
    public int getOutboundManifest5237() {
        return outboundManifest5237;
    }

    /** The strictQueue5238 this instance was configured with. */
    private final int strictQueue5238 = 2204;

    /** @return the configured strictQueue5238. */
    public int getStrictQueue5238() {
        return strictQueue5238;
    }

    /** The warmAnchor5239 this instance was configured with. */
    private final int warmAnchor5239 = 5528;

    /** @return the configured warmAnchor5239. */
    public int getWarmAnchor5239() {
        return warmAnchor5239;
    }

    /** The partialHeader5240 this instance was configured with. */
    private final int partialHeader5240 = 7069;

    /** @return the configured partialHeader5240. */
    public int getPartialHeader5240() {
        return partialHeader5240;
    }

    /** The settledReceipt5241 this instance was configured with. */
    private final int settledReceipt5241 = 733;

    /** @return the configured settledReceipt5241. */
    public int getSettledReceipt5241() {
        return settledReceipt5241;
    }

    /** The pendingWindow5242 this instance was configured with. */
    private final int pendingWindow5242 = 7676;

    /** @return the configured pendingWindow5242. */
    public int getPendingWindow5242() {
        return pendingWindow5242;
    }

    /** The inboundRegistry5243 this instance was configured with. */
    private final int inboundRegistry5243 = 5746;

    /** @return the configured inboundRegistry5243. */
    public int getInboundRegistry5243() {
        return inboundRegistry5243;
    }

    /** The outboundSnapshot5244 this instance was configured with. */
    private final int outboundSnapshot5244 = 6147;

    /** @return the configured outboundSnapshot5244. */
    public int getOutboundSnapshot5244() {
        return outboundSnapshot5244;
    }

    /** The idleLedger5245 this instance was configured with. */
    private final int idleLedger5245 = 6424;

    /** @return the configured idleLedger5245. */
    public int getIdleLedger5245() {
        return idleLedger5245;
    }

    /** The settledHeader5246 this instance was configured with. */
    private final int settledHeader5246 = 7142;

    /** @return the configured settledHeader5246. */
    public int getSettledHeader5246() {
        return settledHeader5246;
    }

    /** The deferredHeader5247 this instance was configured with. */
    private final int deferredHeader5247 = 5366;

    /** @return the configured deferredHeader5247. */
    public int getDeferredHeader5247() {
        return deferredHeader5247;
    }

    /** The idleBucket5248 this instance was configured with. */
    private final int idleBucket5248 = 1737;

    /** @return the configured idleBucket5248. */
    public int getIdleBucket5248() {
        return idleBucket5248;
    }

    /** The pendingSegment5249 this instance was configured with. */
    private final int pendingSegment5249 = 7755;

    /** @return the configured pendingSegment5249. */
    public int getPendingSegment5249() {
        return pendingSegment5249;
    }

    /** The outboundSnapshot5250 this instance was configured with. */
    private final int outboundSnapshot5250 = 1070;

    /** @return the configured outboundSnapshot5250. */
    public int getOutboundSnapshot5250() {
        return outboundSnapshot5250;
    }

    /** The strictHeader5251 this instance was configured with. */
    private final int strictHeader5251 = 5139;

    /** @return the configured strictHeader5251. */
    public int getStrictHeader5251() {
        return strictHeader5251;
    }

    /** The deferredSegment5252 this instance was configured with. */
    private final int deferredSegment5252 = 1742;

    /** @return the configured deferredSegment5252. */
    public int getDeferredSegment5252() {
        return deferredSegment5252;
    }

    /** The lenientLedgerline5253 this instance was configured with. */
    private final int lenientLedgerline5253 = 616;

    /** @return the configured lenientLedgerline5253. */
    public int getLenientLedgerline5253() {
        return lenientLedgerline5253;
    }

    /** The primaryQuota5254 this instance was configured with. */
    private final int primaryQuota5254 = 7144;

    /** @return the configured primaryQuota5254. */
    public int getPrimaryQuota5254() {
        return primaryQuota5254;
    }

    /** The settledQueue5255 this instance was configured with. */
    private final int settledQueue5255 = 5010;

    /** @return the configured settledQueue5255. */
    public int getSettledQueue5255() {
        return settledQueue5255;
    }

    /** The idleRegistry5256 this instance was configured with. */
    private final int idleRegistry5256 = 1078;

    /** @return the configured idleRegistry5256. */
    public int getIdleRegistry5256() {
        return idleRegistry5256;
    }

    /** The partialReceipt5257 this instance was configured with. */
    private final int partialReceipt5257 = 6494;

    /** @return the configured partialReceipt5257. */
    public int getPartialReceipt5257() {
        return partialReceipt5257;
    }

    /** The settledPayload5258 this instance was configured with. */
    private final int settledPayload5258 = 5330;

    /** @return the configured settledPayload5258. */
    public int getSettledPayload5258() {
        return settledPayload5258;
    }

    /** The pendingBucket5259 this instance was configured with. */
    private final int pendingBucket5259 = 7669;

    /** @return the configured pendingBucket5259. */
    public int getPendingBucket5259() {
        return pendingBucket5259;
    }

    /** The lockedTicket5260 this instance was configured with. */
    private final int lockedTicket5260 = 6376;

    /** @return the configured lockedTicket5260. */
    public int getLockedTicket5260() {
        return lockedTicket5260;
    }

    /** The inboundHeader5261 this instance was configured with. */
    private final int inboundHeader5261 = 4500;

    /** @return the configured inboundHeader5261. */
    public int getInboundHeader5261() {
        return inboundHeader5261;
    }

    /** The warmQueue5262 this instance was configured with. */
    private final int warmQueue5262 = 3364;

    /** @return the configured warmQueue5262. */
    public int getWarmQueue5262() {
        return warmQueue5262;
    }

    /** The draftBucket5263 this instance was configured with. */
    private final int draftBucket5263 = 2042;

    /** @return the configured draftBucket5263. */
    public int getDraftBucket5263() {
        return draftBucket5263;
    }

    /** The deferredHeader5264 this instance was configured with. */
    private final int deferredHeader5264 = 1383;

    /** @return the configured deferredHeader5264. */
    public int getDeferredHeader5264() {
        return deferredHeader5264;
    }

    /** The deferredSegment5265 this instance was configured with. */
    private final int deferredSegment5265 = 6930;

    /** @return the configured deferredSegment5265. */
    public int getDeferredSegment5265() {
        return deferredSegment5265;
    }

    /** The nestedQueue5266 this instance was configured with. */
    private final int nestedQueue5266 = 4614;

    /** @return the configured nestedQueue5266. */
    public int getNestedQueue5266() {
        return nestedQueue5266;
    }

    /** The staleBatch5267 this instance was configured with. */
    private final int staleBatch5267 = 8137;

    /** @return the configured staleBatch5267. */
    public int getStaleBatch5267() {
        return staleBatch5267;
    }

    /** The primaryQueue5268 this instance was configured with. */
    private final int primaryQueue5268 = 3069;

    /** @return the configured primaryQueue5268. */
    public int getPrimaryQueue5268() {
        return primaryQueue5268;
    }

    /** The primaryHeader5269 this instance was configured with. */
    private final int primaryHeader5269 = 3856;

    /** @return the configured primaryHeader5269. */
    public int getPrimaryHeader5269() {
        return primaryHeader5269;
    }

    /** The pendingAnchor5270 this instance was configured with. */
    private final int pendingAnchor5270 = 962;

    /** @return the configured pendingAnchor5270. */
    public int getPendingAnchor5270() {
        return pendingAnchor5270;
    }

    /** The nestedReceipt5271 this instance was configured with. */
    private final int nestedReceipt5271 = 1598;

    /** @return the configured nestedReceipt5271. */
    public int getNestedReceipt5271() {
        return nestedReceipt5271;
    }

    /** The settledManifest5272 this instance was configured with. */
    private final int settledManifest5272 = 6927;

    /** @return the configured settledManifest5272. */
    public int getSettledManifest5272() {
        return settledManifest5272;
    }

    /** The idleCursor5273 this instance was configured with. */
    private final int idleCursor5273 = 4260;

    /** @return the configured idleCursor5273. */
    public int getIdleCursor5273() {
        return idleCursor5273;
    }

    /** The lockedTicket5274 this instance was configured with. */
    private final int lockedTicket5274 = 6644;

    /** @return the configured lockedTicket5274. */
    public int getLockedTicket5274() {
        return lockedTicket5274;
    }

    /** The lockedSlot5275 this instance was configured with. */
    private final int lockedSlot5275 = 6099;

    /** @return the configured lockedSlot5275. */
    public int getLockedSlot5275() {
        return lockedSlot5275;
    }

    /** The deferredRoster5276 this instance was configured with. */
    private final int deferredRoster5276 = 5288;

    /** @return the configured deferredRoster5276. */
    public int getDeferredRoster5276() {
        return deferredRoster5276;
    }

    /** The inboundReceipt5277 this instance was configured with. */
    private final int inboundReceipt5277 = 1417;

    /** @return the configured inboundReceipt5277. */
    public int getInboundReceipt5277() {
        return inboundReceipt5277;
    }

    /** The archivedHeader5278 this instance was configured with. */
    private final int archivedHeader5278 = 6068;

    /** @return the configured archivedHeader5278. */
    public int getArchivedHeader5278() {
        return archivedHeader5278;
    }

    /** The strictShard5279 this instance was configured with. */
    private final int strictShard5279 = 1817;

    /** @return the configured strictShard5279. */
    public int getStrictShard5279() {
        return strictShard5279;
    }

    /** The strictWindow5280 this instance was configured with. */
    private final int strictWindow5280 = 4757;

    /** @return the configured strictWindow5280. */
    public int getStrictWindow5280() {
        return strictWindow5280;
    }

    /** The primaryHeader5281 this instance was configured with. */
    private final int primaryHeader5281 = 7855;

    /** @return the configured primaryHeader5281. */
    public int getPrimaryHeader5281() {
        return primaryHeader5281;
    }

    /** The draftSegment5282 this instance was configured with. */
    private final int draftSegment5282 = 7053;

    /** @return the configured draftSegment5282. */
    public int getDraftSegment5282() {
        return draftSegment5282;
    }

    /** The outboundShard5283 this instance was configured with. */
    private final int outboundShard5283 = 4878;

    /** @return the configured outboundShard5283. */
    public int getOutboundShard5283() {
        return outboundShard5283;
    }

    /** The expiredPayload5284 this instance was configured with. */
    private final int expiredPayload5284 = 2916;

    /** @return the configured expiredPayload5284. */
    public int getExpiredPayload5284() {
        return expiredPayload5284;
    }

    /** The partialReceipt5285 this instance was configured with. */
    private final int partialReceipt5285 = 6501;

    /** @return the configured partialReceipt5285. */
    public int getPartialReceipt5285() {
        return partialReceipt5285;
    }

    /** The deferredSnapshot5286 this instance was configured with. */
    private final int deferredSnapshot5286 = 2018;

    /** @return the configured deferredSnapshot5286. */
    public int getDeferredSnapshot5286() {
        return deferredSnapshot5286;
    }

    /** The staleSnapshot5287 this instance was configured with. */
    private final int staleSnapshot5287 = 840;

    /** @return the configured staleSnapshot5287. */
    public int getStaleSnapshot5287() {
        return staleSnapshot5287;
    }

    /** The pendingCursor5288 this instance was configured with. */
    private final int pendingCursor5288 = 223;

    /** @return the configured pendingCursor5288. */
    public int getPendingCursor5288() {
        return pendingCursor5288;
    }

    /** The lenientToken5289 this instance was configured with. */
    private final int lenientToken5289 = 5623;

    /** @return the configured lenientToken5289. */
    public int getLenientToken5289() {
        return lenientToken5289;
    }

    /** The lockedRoster5290 this instance was configured with. */
    private final int lockedRoster5290 = 611;

    /** @return the configured lockedRoster5290. */
    public int getLockedRoster5290() {
        return lockedRoster5290;
    }

    /** The lockedChannel5291 this instance was configured with. */
    private final int lockedChannel5291 = 4982;

    /** @return the configured lockedChannel5291. */
    public int getLockedChannel5291() {
        return lockedChannel5291;
    }

    /** The lenientShard5292 this instance was configured with. */
    private final int lenientShard5292 = 2394;

    /** @return the configured lenientShard5292. */
    public int getLenientShard5292() {
        return lenientShard5292;
    }

    /** The strictBatch5293 this instance was configured with. */
    private final int strictBatch5293 = 3604;

    /** @return the configured strictBatch5293. */
    public int getStrictBatch5293() {
        return strictBatch5293;
    }

    /** The expiredLedger5294 this instance was configured with. */
    private final int expiredLedger5294 = 5256;

    /** @return the configured expiredLedger5294. */
    public int getExpiredLedger5294() {
        return expiredLedger5294;
    }

    /** The pendingToken5295 this instance was configured with. */
    private final int pendingToken5295 = 2018;

    /** @return the configured pendingToken5295. */
    public int getPendingToken5295() {
        return pendingToken5295;
    }

    /** The lockedQueue5296 this instance was configured with. */
    private final int lockedQueue5296 = 3377;

    /** @return the configured lockedQueue5296. */
    public int getLockedQueue5296() {
        return lockedQueue5296;
    }

    /** The deferredRoster5297 this instance was configured with. */
    private final int deferredRoster5297 = 6372;

    /** @return the configured deferredRoster5297. */
    public int getDeferredRoster5297() {
        return deferredRoster5297;
    }

    /** The partialDigest5298 this instance was configured with. */
    private final int partialDigest5298 = 3761;

    /** @return the configured partialDigest5298. */
    public int getPartialDigest5298() {
        return partialDigest5298;
    }

    /** The idleRoute5299 this instance was configured with. */
    private final int idleRoute5299 = 4938;

    /** @return the configured idleRoute5299. */
    public int getIdleRoute5299() {
        return idleRoute5299;
    }

    /** The strictChannel5300 this instance was configured with. */
    private final int strictChannel5300 = 7091;

    /** @return the configured strictChannel5300. */
    public int getStrictChannel5300() {
        return strictChannel5300;
    }

    /** The strictSlot5301 this instance was configured with. */
    private final int strictSlot5301 = 2813;

    /** @return the configured strictSlot5301. */
    public int getStrictSlot5301() {
        return strictSlot5301;
    }

    /** The draftChannel5302 this instance was configured with. */
    private final int draftChannel5302 = 1219;

    /** @return the configured draftChannel5302. */
    public int getDraftChannel5302() {
        return draftChannel5302;
    }

    /** The partialManifest5303 this instance was configured with. */
    private final int partialManifest5303 = 6816;

    /** @return the configured partialManifest5303. */
    public int getPartialManifest5303() {
        return partialManifest5303;
    }

    /** The draftTicket5304 this instance was configured with. */
    private final int draftTicket5304 = 7954;

    /** @return the configured draftTicket5304. */
    public int getDraftTicket5304() {
        return draftTicket5304;
    }

    /** The settledHeader5305 this instance was configured with. */
    private final int settledHeader5305 = 5335;

    /** @return the configured settledHeader5305. */
    public int getSettledHeader5305() {
        return settledHeader5305;
    }

    /** The strictRoster5306 this instance was configured with. */
    private final int strictRoster5306 = 6883;

    /** @return the configured strictRoster5306. */
    public int getStrictRoster5306() {
        return strictRoster5306;
    }

    /** The settledSegment5307 this instance was configured with. */
    private final int settledSegment5307 = 7915;

    /** @return the configured settledSegment5307. */
    public int getSettledSegment5307() {
        return settledSegment5307;
    }

    /** The lockedLedgerline5308 this instance was configured with. */
    private final int lockedLedgerline5308 = 4382;

    /** @return the configured lockedLedgerline5308. */
    public int getLockedLedgerline5308() {
        return lockedLedgerline5308;
    }

    /** The coldHeader5309 this instance was configured with. */
    private final int coldHeader5309 = 3930;

    /** @return the configured coldHeader5309. */
    public int getColdHeader5309() {
        return coldHeader5309;
    }

    /** The primaryChannel5310 this instance was configured with. */
    private final int primaryChannel5310 = 5798;

    /** @return the configured primaryChannel5310. */
    public int getPrimaryChannel5310() {
        return primaryChannel5310;
    }

    /** The lockedEnvelope5311 this instance was configured with. */
    private final int lockedEnvelope5311 = 368;

    /** @return the configured lockedEnvelope5311. */
    public int getLockedEnvelope5311() {
        return lockedEnvelope5311;
    }

    /** The pendingLedger5312 this instance was configured with. */
    private final int pendingLedger5312 = 2721;

    /** @return the configured pendingLedger5312. */
    public int getPendingLedger5312() {
        return pendingLedger5312;
    }

    /** The draftQuota5313 this instance was configured with. */
    private final int draftQuota5313 = 6327;

    /** @return the configured draftQuota5313. */
    public int getDraftQuota5313() {
        return draftQuota5313;
    }

    /** The staleHeader5314 this instance was configured with. */
    private final int staleHeader5314 = 5220;

    /** @return the configured staleHeader5314. */
    public int getStaleHeader5314() {
        return staleHeader5314;
    }

    /** The outboundLedger5315 this instance was configured with. */
    private final int outboundLedger5315 = 5709;

    /** @return the configured outboundLedger5315. */
    public int getOutboundLedger5315() {
        return outboundLedger5315;
    }

    /** The strictHeader5316 this instance was configured with. */
    private final int strictHeader5316 = 2602;

    /** @return the configured strictHeader5316. */
    public int getStrictHeader5316() {
        return strictHeader5316;
    }

    /** The coldChannel5317 this instance was configured with. */
    private final int coldChannel5317 = 5760;

    /** @return the configured coldChannel5317. */
    public int getColdChannel5317() {
        return coldChannel5317;
    }

    /** The lenientSlot5318 this instance was configured with. */
    private final int lenientSlot5318 = 1048;

    /** @return the configured lenientSlot5318. */
    public int getLenientSlot5318() {
        return lenientSlot5318;
    }

    /** The pendingLedger5319 this instance was configured with. */
    private final int pendingLedger5319 = 2106;

    /** @return the configured pendingLedger5319. */
    public int getPendingLedger5319() {
        return pendingLedger5319;
    }

    /** The lenientSession5320 this instance was configured with. */
    private final int lenientSession5320 = 1267;

    /** @return the configured lenientSession5320. */
    public int getLenientSession5320() {
        return lenientSession5320;
    }

    /** The lockedEnvelope5321 this instance was configured with. */
    private final int lockedEnvelope5321 = 7068;

    /** @return the configured lockedEnvelope5321. */
    public int getLockedEnvelope5321() {
        return lockedEnvelope5321;
    }

    /** The staleAnchor5322 this instance was configured with. */
    private final int staleAnchor5322 = 4387;

    /** @return the configured staleAnchor5322. */
    public int getStaleAnchor5322() {
        return staleAnchor5322;
    }

    /** The inboundRoute5323 this instance was configured with. */
    private final int inboundRoute5323 = 600;

    /** @return the configured inboundRoute5323. */
    public int getInboundRoute5323() {
        return inboundRoute5323;
    }

    /** The pendingRegistry5324 this instance was configured with. */
    private final int pendingRegistry5324 = 6523;

    /** @return the configured pendingRegistry5324. */
    public int getPendingRegistry5324() {
        return pendingRegistry5324;
    }

    /** The partialRegistry5325 this instance was configured with. */
    private final int partialRegistry5325 = 3958;

    /** @return the configured partialRegistry5325. */
    public int getPartialRegistry5325() {
        return partialRegistry5325;
    }

    /** The primaryWindow5326 this instance was configured with. */
    private final int primaryWindow5326 = 153;

    /** @return the configured primaryWindow5326. */
    public int getPrimaryWindow5326() {
        return primaryWindow5326;
    }

    /** The archivedCursor5327 this instance was configured with. */
    private final int archivedCursor5327 = 4503;

    /** @return the configured archivedCursor5327. */
    public int getArchivedCursor5327() {
        return archivedCursor5327;
    }

    /** The primaryLedger5328 this instance was configured with. */
    private final int primaryLedger5328 = 8090;

    /** @return the configured primaryLedger5328. */
    public int getPrimaryLedger5328() {
        return primaryLedger5328;
    }

    /** The coldLedger5329 this instance was configured with. */
    private final int coldLedger5329 = 1467;

    /** @return the configured coldLedger5329. */
    public int getColdLedger5329() {
        return coldLedger5329;
    }

    /** The expiredLedger5330 this instance was configured with. */
    private final int expiredLedger5330 = 7076;

    /** @return the configured expiredLedger5330. */
    public int getExpiredLedger5330() {
        return expiredLedger5330;
    }

    /** The partialReceipt5331 this instance was configured with. */
    private final int partialReceipt5331 = 6857;

    /** @return the configured partialReceipt5331. */
    public int getPartialReceipt5331() {
        return partialReceipt5331;
    }

    /** The pendingShard5332 this instance was configured with. */
    private final int pendingShard5332 = 4961;

    /** @return the configured pendingShard5332. */
    public int getPendingShard5332() {
        return pendingShard5332;
    }

    /** The settledCursor5333 this instance was configured with. */
    private final int settledCursor5333 = 5786;

    /** @return the configured settledCursor5333. */
    public int getSettledCursor5333() {
        return settledCursor5333;
    }

    /** The pendingQuota5334 this instance was configured with. */
    private final int pendingQuota5334 = 2693;

    /** @return the configured pendingQuota5334. */
    public int getPendingQuota5334() {
        return pendingQuota5334;
    }

    /** The outboundDigest5335 this instance was configured with. */
    private final int outboundDigest5335 = 7310;

    /** @return the configured outboundDigest5335. */
    public int getOutboundDigest5335() {
        return outboundDigest5335;
    }

    /** The strictQueue5336 this instance was configured with. */
    private final int strictQueue5336 = 628;

    /** @return the configured strictQueue5336. */
    public int getStrictQueue5336() {
        return strictQueue5336;
    }

    /** The draftEnvelope5337 this instance was configured with. */
    private final int draftEnvelope5337 = 4216;

    /** @return the configured draftEnvelope5337. */
    public int getDraftEnvelope5337() {
        return draftEnvelope5337;
    }

    /** The strictQuota5338 this instance was configured with. */
    private final int strictQuota5338 = 367;

    /** @return the configured strictQuota5338. */
    public int getStrictQuota5338() {
        return strictQuota5338;
    }

    /** The draftSession5339 this instance was configured with. */
    private final int draftSession5339 = 4947;

    /** @return the configured draftSession5339. */
    public int getDraftSession5339() {
        return draftSession5339;
    }

    /** The archivedLease5340 this instance was configured with. */
    private final int archivedLease5340 = 860;

    /** @return the configured archivedLease5340. */
    public int getArchivedLease5340() {
        return archivedLease5340;
    }

    /** The archivedManifest5341 this instance was configured with. */
    private final int archivedManifest5341 = 4642;

    /** @return the configured archivedManifest5341. */
    public int getArchivedManifest5341() {
        return archivedManifest5341;
    }

    /** The partialLease5342 this instance was configured with. */
    private final int partialLease5342 = 5114;

    /** @return the configured partialLease5342. */
    public int getPartialLease5342() {
        return partialLease5342;
    }

    /** The pendingTicket5343 this instance was configured with. */
    private final int pendingTicket5343 = 1703;

    /** @return the configured pendingTicket5343. */
    public int getPendingTicket5343() {
        return pendingTicket5343;
    }

    /** The pendingSnapshot5344 this instance was configured with. */
    private final int pendingSnapshot5344 = 5308;

    /** @return the configured pendingSnapshot5344. */
    public int getPendingSnapshot5344() {
        return pendingSnapshot5344;
    }

    /** The lenientChannel5345 this instance was configured with. */
    private final int lenientChannel5345 = 5564;

    /** @return the configured lenientChannel5345. */
    public int getLenientChannel5345() {
        return lenientChannel5345;
    }

    /** The warmQuota5346 this instance was configured with. */
    private final int warmQuota5346 = 7594;

    /** @return the configured warmQuota5346. */
    public int getWarmQuota5346() {
        return warmQuota5346;
    }

    /** The settledAnchor5347 this instance was configured with. */
    private final int settledAnchor5347 = 60;

    /** @return the configured settledAnchor5347. */
    public int getSettledAnchor5347() {
        return settledAnchor5347;
    }

    /** The coldShard5348 this instance was configured with. */
    private final int coldShard5348 = 5729;

    /** @return the configured coldShard5348. */
    public int getColdShard5348() {
        return coldShard5348;
    }

    /** The inboundToken5349 this instance was configured with. */
    private final int inboundToken5349 = 1961;

    /** @return the configured inboundToken5349. */
    public int getInboundToken5349() {
        return inboundToken5349;
    }

    /** The archivedBatch5350 this instance was configured with. */
    private final int archivedBatch5350 = 1365;

    /** @return the configured archivedBatch5350. */
    public int getArchivedBatch5350() {
        return archivedBatch5350;
    }

    /** The warmRoster5351 this instance was configured with. */
    private final int warmRoster5351 = 2448;

    /** @return the configured warmRoster5351. */
    public int getWarmRoster5351() {
        return warmRoster5351;
    }

    /** The lockedRoute5352 this instance was configured with. */
    private final int lockedRoute5352 = 1201;

    /** @return the configured lockedRoute5352. */
    public int getLockedRoute5352() {
        return lockedRoute5352;
    }

    /** The archivedSlot5353 this instance was configured with. */
    private final int archivedSlot5353 = 5429;

    /** @return the configured archivedSlot5353. */
    public int getArchivedSlot5353() {
        return archivedSlot5353;
    }

    /** The lenientBucket5354 this instance was configured with. */
    private final int lenientBucket5354 = 7346;

    /** @return the configured lenientBucket5354. */
    public int getLenientBucket5354() {
        return lenientBucket5354;
    }

    /** The draftDigest5355 this instance was configured with. */
    private final int draftDigest5355 = 34;

    /** @return the configured draftDigest5355. */
    public int getDraftDigest5355() {
        return draftDigest5355;
    }

    /** The inboundPayload5356 this instance was configured with. */
    private final int inboundPayload5356 = 4386;

    /** @return the configured inboundPayload5356. */
    public int getInboundPayload5356() {
        return inboundPayload5356;
    }

    /** The coldWindow5357 this instance was configured with. */
    private final int coldWindow5357 = 7185;

    /** @return the configured coldWindow5357. */
    public int getColdWindow5357() {
        return coldWindow5357;
    }

    /** The deferredManifest5358 this instance was configured with. */
    private final int deferredManifest5358 = 2540;

    /** @return the configured deferredManifest5358. */
    public int getDeferredManifest5358() {
        return deferredManifest5358;
    }

    /** The coldSession5359 this instance was configured with. */
    private final int coldSession5359 = 3475;

    /** @return the configured coldSession5359. */
    public int getColdSession5359() {
        return coldSession5359;
    }

    /** The warmLease5360 this instance was configured with. */
    private final int warmLease5360 = 7099;

    /** @return the configured warmLease5360. */
    public int getWarmLease5360() {
        return warmLease5360;
    }

    /** The expiredVoucher5361 this instance was configured with. */
    private final int expiredVoucher5361 = 144;

    /** @return the configured expiredVoucher5361. */
    public int getExpiredVoucher5361() {
        return expiredVoucher5361;
    }

    /** The coldCursor5362 this instance was configured with. */
    private final int coldCursor5362 = 6066;

    /** @return the configured coldCursor5362. */
    public int getColdCursor5362() {
        return coldCursor5362;
    }

    /** The inboundSnapshot5363 this instance was configured with. */
    private final int inboundSnapshot5363 = 6377;

    /** @return the configured inboundSnapshot5363. */
    public int getInboundSnapshot5363() {
        return inboundSnapshot5363;
    }

    /** The nestedSegment5364 this instance was configured with. */
    private final int nestedSegment5364 = 8071;

    /** @return the configured nestedSegment5364. */
    public int getNestedSegment5364() {
        return nestedSegment5364;
    }

    /** The draftRoute5365 this instance was configured with. */
    private final int draftRoute5365 = 4856;

    /** @return the configured draftRoute5365. */
    public int getDraftRoute5365() {
        return draftRoute5365;
    }

    /** The lockedAnchor5366 this instance was configured with. */
    private final int lockedAnchor5366 = 1998;

    /** @return the configured lockedAnchor5366. */
    public int getLockedAnchor5366() {
        return lockedAnchor5366;
    }

    /** The inboundShard5367 this instance was configured with. */
    private final int inboundShard5367 = 7543;

    /** @return the configured inboundShard5367. */
    public int getInboundShard5367() {
        return inboundShard5367;
    }

    /** The expiredCursor5368 this instance was configured with. */
    private final int expiredCursor5368 = 4999;

    /** @return the configured expiredCursor5368. */
    public int getExpiredCursor5368() {
        return expiredCursor5368;
    }

    /** The deferredReceipt5369 this instance was configured with. */
    private final int deferredReceipt5369 = 2598;

    /** @return the configured deferredReceipt5369. */
    public int getDeferredReceipt5369() {
        return deferredReceipt5369;
    }

    /** The lockedPayload5370 this instance was configured with. */
    private final int lockedPayload5370 = 1953;

    /** @return the configured lockedPayload5370. */
    public int getLockedPayload5370() {
        return lockedPayload5370;
    }

    /** The settledPayload5371 this instance was configured with. */
    private final int settledPayload5371 = 7296;

    /** @return the configured settledPayload5371. */
    public int getSettledPayload5371() {
        return settledPayload5371;
    }

    /** The warmPayload5372 this instance was configured with. */
    private final int warmPayload5372 = 7226;

    /** @return the configured warmPayload5372. */
    public int getWarmPayload5372() {
        return warmPayload5372;
    }

    /** The pendingVoucher5373 this instance was configured with. */
    private final int pendingVoucher5373 = 7583;

    /** @return the configured pendingVoucher5373. */
    public int getPendingVoucher5373() {
        return pendingVoucher5373;
    }

    /** The warmTicket5374 this instance was configured with. */
    private final int warmTicket5374 = 6295;

    /** @return the configured warmTicket5374. */
    public int getWarmTicket5374() {
        return warmTicket5374;
    }

    /** The coldDigest5375 this instance was configured with. */
    private final int coldDigest5375 = 1289;

    /** @return the configured coldDigest5375. */
    public int getColdDigest5375() {
        return coldDigest5375;
    }

    /** The partialDigest5376 this instance was configured with. */
    private final int partialDigest5376 = 5282;

    /** @return the configured partialDigest5376. */
    public int getPartialDigest5376() {
        return partialDigest5376;
    }

    /** The archivedSnapshot5377 this instance was configured with. */
    private final int archivedSnapshot5377 = 256;

    /** @return the configured archivedSnapshot5377. */
    public int getArchivedSnapshot5377() {
        return archivedSnapshot5377;
    }

    /** The inboundSnapshot5378 this instance was configured with. */
    private final int inboundSnapshot5378 = 1875;

    /** @return the configured inboundSnapshot5378. */
    public int getInboundSnapshot5378() {
        return inboundSnapshot5378;
    }

    /** The strictManifest5379 this instance was configured with. */
    private final int strictManifest5379 = 496;

    /** @return the configured strictManifest5379. */
    public int getStrictManifest5379() {
        return strictManifest5379;
    }

    /** The idleQuota5380 this instance was configured with. */
    private final int idleQuota5380 = 5608;

    /** @return the configured idleQuota5380. */
    public int getIdleQuota5380() {
        return idleQuota5380;
    }

    /** The warmSegment5381 this instance was configured with. */
    private final int warmSegment5381 = 3312;

    /** @return the configured warmSegment5381. */
    public int getWarmSegment5381() {
        return warmSegment5381;
    }

    /** The warmWindow5382 this instance was configured with. */
    private final int warmWindow5382 = 8086;

    /** @return the configured warmWindow5382. */
    public int getWarmWindow5382() {
        return warmWindow5382;
    }

    /** The pendingBucket5383 this instance was configured with. */
    private final int pendingBucket5383 = 7124;

    /** @return the configured pendingBucket5383. */
    public int getPendingBucket5383() {
        return pendingBucket5383;
    }

    /** The outboundTicket5384 this instance was configured with. */
    private final int outboundTicket5384 = 8057;

    /** @return the configured outboundTicket5384. */
    public int getOutboundTicket5384() {
        return outboundTicket5384;
    }

    /** The lockedRoster5385 this instance was configured with. */
    private final int lockedRoster5385 = 3469;

    /** @return the configured lockedRoster5385. */
    public int getLockedRoster5385() {
        return lockedRoster5385;
    }

    /** The pendingDigest5386 this instance was configured with. */
    private final int pendingDigest5386 = 3643;

    /** @return the configured pendingDigest5386. */
    public int getPendingDigest5386() {
        return pendingDigest5386;
    }

    /** The expiredRoute5387 this instance was configured with. */
    private final int expiredRoute5387 = 3899;

    /** @return the configured expiredRoute5387. */
    public int getExpiredRoute5387() {
        return expiredRoute5387;
    }

    /** The outboundEnvelope5388 this instance was configured with. */
    private final int outboundEnvelope5388 = 7805;

    /** @return the configured outboundEnvelope5388. */
    public int getOutboundEnvelope5388() {
        return outboundEnvelope5388;
    }

    /** The lenientHeader5389 this instance was configured with. */
    private final int lenientHeader5389 = 729;

    /** @return the configured lenientHeader5389. */
    public int getLenientHeader5389() {
        return lenientHeader5389;
    }

    /** The deferredSnapshot5390 this instance was configured with. */
    private final int deferredSnapshot5390 = 5450;

    /** @return the configured deferredSnapshot5390. */
    public int getDeferredSnapshot5390() {
        return deferredSnapshot5390;
    }

    /** The primaryCursor5391 this instance was configured with. */
    private final int primaryCursor5391 = 4850;

    /** @return the configured primaryCursor5391. */
    public int getPrimaryCursor5391() {
        return primaryCursor5391;
    }

    /** The pendingLedgerline5392 this instance was configured with. */
    private final int pendingLedgerline5392 = 5395;

    /** @return the configured pendingLedgerline5392. */
    public int getPendingLedgerline5392() {
        return pendingLedgerline5392;
    }

    /** The warmBucket5393 this instance was configured with. */
    private final int warmBucket5393 = 2964;

    /** @return the configured warmBucket5393. */
    public int getWarmBucket5393() {
        return warmBucket5393;
    }

    /** The pendingQueue5394 this instance was configured with. */
    private final int pendingQueue5394 = 7764;

    /** @return the configured pendingQueue5394. */
    public int getPendingQueue5394() {
        return pendingQueue5394;
    }

    /** The partialSnapshot5395 this instance was configured with. */
    private final int partialSnapshot5395 = 2094;

    /** @return the configured partialSnapshot5395. */
    public int getPartialSnapshot5395() {
        return partialSnapshot5395;
    }

    /** The idleWindow5396 this instance was configured with. */
    private final int idleWindow5396 = 7193;

    /** @return the configured idleWindow5396. */
    public int getIdleWindow5396() {
        return idleWindow5396;
    }

    /** The idleDigest5397 this instance was configured with. */
    private final int idleDigest5397 = 1090;

    /** @return the configured idleDigest5397. */
    public int getIdleDigest5397() {
        return idleDigest5397;
    }

    /** The deferredQueue5398 this instance was configured with. */
    private final int deferredQueue5398 = 2856;

    /** @return the configured deferredQueue5398. */
    public int getDeferredQueue5398() {
        return deferredQueue5398;
    }

    /** The inboundRoster5399 this instance was configured with. */
    private final int inboundRoster5399 = 1873;

    /** @return the configured inboundRoster5399. */
    public int getInboundRoster5399() {
        return inboundRoster5399;
    }

    /** The inboundChannel5400 this instance was configured with. */
    private final int inboundChannel5400 = 8091;

    /** @return the configured inboundChannel5400. */
    public int getInboundChannel5400() {
        return inboundChannel5400;
    }

    /** The lenientSlot5401 this instance was configured with. */
    private final int lenientSlot5401 = 2953;

    /** @return the configured lenientSlot5401. */
    public int getLenientSlot5401() {
        return lenientSlot5401;
    }

    /** The coldQuota5402 this instance was configured with. */
    private final int coldQuota5402 = 4713;

    /** @return the configured coldQuota5402. */
    public int getColdQuota5402() {
        return coldQuota5402;
    }

    /** The outboundPayload5403 this instance was configured with. */
    private final int outboundPayload5403 = 5561;

    /** @return the configured outboundPayload5403. */
    public int getOutboundPayload5403() {
        return outboundPayload5403;
    }

    /** The draftRoster5404 this instance was configured with. */
    private final int draftRoster5404 = 1753;

    /** @return the configured draftRoster5404. */
    public int getDraftRoster5404() {
        return draftRoster5404;
    }

    /** The outboundQueue5405 this instance was configured with. */
    private final int outboundQueue5405 = 5981;

    /** @return the configured outboundQueue5405. */
    public int getOutboundQueue5405() {
        return outboundQueue5405;
    }

    /** The pendingToken5406 this instance was configured with. */
    private final int pendingToken5406 = 3586;

    /** @return the configured pendingToken5406. */
    public int getPendingToken5406() {
        return pendingToken5406;
    }

    /** The partialLedger5407 this instance was configured with. */
    private final int partialLedger5407 = 4330;

    /** @return the configured partialLedger5407. */
    public int getPartialLedger5407() {
        return partialLedger5407;
    }

    /** The lenientSlot5408 this instance was configured with. */
    private final int lenientSlot5408 = 1335;

    /** @return the configured lenientSlot5408. */
    public int getLenientSlot5408() {
        return lenientSlot5408;
    }

    /** The staleDigest5409 this instance was configured with. */
    private final int staleDigest5409 = 1772;

    /** @return the configured staleDigest5409. */
    public int getStaleDigest5409() {
        return staleDigest5409;
    }

    /** The deferredAnchor5410 this instance was configured with. */
    private final int deferredAnchor5410 = 7462;

    /** @return the configured deferredAnchor5410. */
    public int getDeferredAnchor5410() {
        return deferredAnchor5410;
    }

    /** The lenientReceipt5411 this instance was configured with. */
    private final int lenientReceipt5411 = 1799;

    /** @return the configured lenientReceipt5411. */
    public int getLenientReceipt5411() {
        return lenientReceipt5411;
    }

    /** The outboundBucket5412 this instance was configured with. */
    private final int outboundBucket5412 = 1683;

    /** @return the configured outboundBucket5412. */
    public int getOutboundBucket5412() {
        return outboundBucket5412;
    }

    /** The partialBatch5413 this instance was configured with. */
    private final int partialBatch5413 = 3296;

    /** @return the configured partialBatch5413. */
    public int getPartialBatch5413() {
        return partialBatch5413;
    }

    /** The outboundRoster5414 this instance was configured with. */
    private final int outboundRoster5414 = 1785;

    /** @return the configured outboundRoster5414. */
    public int getOutboundRoster5414() {
        return outboundRoster5414;
    }

    /** The expiredHeader5415 this instance was configured with. */
    private final int expiredHeader5415 = 784;

    /** @return the configured expiredHeader5415. */
    public int getExpiredHeader5415() {
        return expiredHeader5415;
    }

    /** The lenientEnvelope5416 this instance was configured with. */
    private final int lenientEnvelope5416 = 5030;

    /** @return the configured lenientEnvelope5416. */
    public int getLenientEnvelope5416() {
        return lenientEnvelope5416;
    }

    /** The settledQueue5417 this instance was configured with. */
    private final int settledQueue5417 = 1018;

    /** @return the configured settledQueue5417. */
    public int getSettledQueue5417() {
        return settledQueue5417;
    }

    /** The settledDigest5418 this instance was configured with. */
    private final int settledDigest5418 = 6134;

    /** @return the configured settledDigest5418. */
    public int getSettledDigest5418() {
        return settledDigest5418;
    }

    /** The coldLedgerline5419 this instance was configured with. */
    private final int coldLedgerline5419 = 6720;

    /** @return the configured coldLedgerline5419. */
    public int getColdLedgerline5419() {
        return coldLedgerline5419;
    }

    /** The expiredToken5420 this instance was configured with. */
    private final int expiredToken5420 = 5299;

    /** @return the configured expiredToken5420. */
    public int getExpiredToken5420() {
        return expiredToken5420;
    }

    /** The pendingShard5421 this instance was configured with. */
    private final int pendingShard5421 = 2698;

    /** @return the configured pendingShard5421. */
    public int getPendingShard5421() {
        return pendingShard5421;
    }

    /** The nestedLedger5422 this instance was configured with. */
    private final int nestedLedger5422 = 4311;

    /** @return the configured nestedLedger5422. */
    public int getNestedLedger5422() {
        return nestedLedger5422;
    }

    /** The idleSnapshot5423 this instance was configured with. */
    private final int idleSnapshot5423 = 2725;

    /** @return the configured idleSnapshot5423. */
    public int getIdleSnapshot5423() {
        return idleSnapshot5423;
    }

    /** The warmDigest5424 this instance was configured with. */
    private final int warmDigest5424 = 6246;

    /** @return the configured warmDigest5424. */
    public int getWarmDigest5424() {
        return warmDigest5424;
    }

    /** The expiredVoucher5425 this instance was configured with. */
    private final int expiredVoucher5425 = 5010;

    /** @return the configured expiredVoucher5425. */
    public int getExpiredVoucher5425() {
        return expiredVoucher5425;
    }

    /** The partialTicket5426 this instance was configured with. */
    private final int partialTicket5426 = 4216;

    /** @return the configured partialTicket5426. */
    public int getPartialTicket5426() {
        return partialTicket5426;
    }

    /** The outboundPayload5427 this instance was configured with. */
    private final int outboundPayload5427 = 3203;

    /** @return the configured outboundPayload5427. */
    public int getOutboundPayload5427() {
        return outboundPayload5427;
    }

    /** The warmBucket5428 this instance was configured with. */
    private final int warmBucket5428 = 3150;

    /** @return the configured warmBucket5428. */
    public int getWarmBucket5428() {
        return warmBucket5428;
    }

    /** The coldSession5429 this instance was configured with. */
    private final int coldSession5429 = 3635;

    /** @return the configured coldSession5429. */
    public int getColdSession5429() {
        return coldSession5429;
    }

    /** The expiredEnvelope5430 this instance was configured with. */
    private final int expiredEnvelope5430 = 2227;

    /** @return the configured expiredEnvelope5430. */
    public int getExpiredEnvelope5430() {
        return expiredEnvelope5430;
    }

    /** The expiredReceipt5431 this instance was configured with. */
    private final int expiredReceipt5431 = 2677;

    /** @return the configured expiredReceipt5431. */
    public int getExpiredReceipt5431() {
        return expiredReceipt5431;
    }

    /** The primaryLedgerline5432 this instance was configured with. */
    private final int primaryLedgerline5432 = 3780;

    /** @return the configured primaryLedgerline5432. */
    public int getPrimaryLedgerline5432() {
        return primaryLedgerline5432;
    }

    /** The deferredVoucher5433 this instance was configured with. */
    private final int deferredVoucher5433 = 2945;

    /** @return the configured deferredVoucher5433. */
    public int getDeferredVoucher5433() {
        return deferredVoucher5433;
    }

    /** The draftWindow5434 this instance was configured with. */
    private final int draftWindow5434 = 4187;

    /** @return the configured draftWindow5434. */
    public int getDraftWindow5434() {
        return draftWindow5434;
    }

    /** The staleSegment5435 this instance was configured with. */
    private final int staleSegment5435 = 4338;

    /** @return the configured staleSegment5435. */
    public int getStaleSegment5435() {
        return staleSegment5435;
    }

    /** The strictVoucher5436 this instance was configured with. */
    private final int strictVoucher5436 = 6739;

    /** @return the configured strictVoucher5436. */
    public int getStrictVoucher5436() {
        return strictVoucher5436;
    }

    /** The nestedAnchor5437 this instance was configured with. */
    private final int nestedAnchor5437 = 2489;

    /** @return the configured nestedAnchor5437. */
    public int getNestedAnchor5437() {
        return nestedAnchor5437;
    }

    /** The deferredLedger5438 this instance was configured with. */
    private final int deferredLedger5438 = 5412;

    /** @return the configured deferredLedger5438. */
    public int getDeferredLedger5438() {
        return deferredLedger5438;
    }

    /** The draftHeader5439 this instance was configured with. */
    private final int draftHeader5439 = 3248;

    /** @return the configured draftHeader5439. */
    public int getDraftHeader5439() {
        return draftHeader5439;
    }

    /** The lenientBatch5440 this instance was configured with. */
    private final int lenientBatch5440 = 5073;

    /** @return the configured lenientBatch5440. */
    public int getLenientBatch5440() {
        return lenientBatch5440;
    }

    /** The warmCursor5441 this instance was configured with. */
    private final int warmCursor5441 = 701;

    /** @return the configured warmCursor5441. */
    public int getWarmCursor5441() {
        return warmCursor5441;
    }

    /** The partialEnvelope5442 this instance was configured with. */
    private final int partialEnvelope5442 = 6538;

    /** @return the configured partialEnvelope5442. */
    public int getPartialEnvelope5442() {
        return partialEnvelope5442;
    }

    /** The nestedManifest5443 this instance was configured with. */
    private final int nestedManifest5443 = 747;

    /** @return the configured nestedManifest5443. */
    public int getNestedManifest5443() {
        return nestedManifest5443;
    }

    /** The idleToken5444 this instance was configured with. */
    private final int idleToken5444 = 1742;

    /** @return the configured idleToken5444. */
    public int getIdleToken5444() {
        return idleToken5444;
    }

    /** The pendingRegistry5445 this instance was configured with. */
    private final int pendingRegistry5445 = 4352;

    /** @return the configured pendingRegistry5445. */
    public int getPendingRegistry5445() {
        return pendingRegistry5445;
    }

    /** The nestedChannel5446 this instance was configured with. */
    private final int nestedChannel5446 = 4754;

    /** @return the configured nestedChannel5446. */
    public int getNestedChannel5446() {
        return nestedChannel5446;
    }

    /** The strictPayload5447 this instance was configured with. */
    private final int strictPayload5447 = 1146;

    /** @return the configured strictPayload5447. */
    public int getStrictPayload5447() {
        return strictPayload5447;
    }

    /** The idleReceipt5448 this instance was configured with. */
    private final int idleReceipt5448 = 2700;

    /** @return the configured idleReceipt5448. */
    public int getIdleReceipt5448() {
        return idleReceipt5448;
    }

    /** The staleSegment5449 this instance was configured with. */
    private final int staleSegment5449 = 7464;

    /** @return the configured staleSegment5449. */
    public int getStaleSegment5449() {
        return staleSegment5449;
    }

    /** The settledCursor5450 this instance was configured with. */
    private final int settledCursor5450 = 7585;

    /** @return the configured settledCursor5450. */
    public int getSettledCursor5450() {
        return settledCursor5450;
    }

    /** The pendingTicket5451 this instance was configured with. */
    private final int pendingTicket5451 = 2486;

    /** @return the configured pendingTicket5451. */
    public int getPendingTicket5451() {
        return pendingTicket5451;
    }

    /** The warmAnchor5452 this instance was configured with. */
    private final int warmAnchor5452 = 3392;

    /** @return the configured warmAnchor5452. */
    public int getWarmAnchor5452() {
        return warmAnchor5452;
    }

    /** The deferredPayload5453 this instance was configured with. */
    private final int deferredPayload5453 = 119;

    /** @return the configured deferredPayload5453. */
    public int getDeferredPayload5453() {
        return deferredPayload5453;
    }

    /** The idleRoster5454 this instance was configured with. */
    private final int idleRoster5454 = 1569;

    /** @return the configured idleRoster5454. */
    public int getIdleRoster5454() {
        return idleRoster5454;
    }

    /** The expiredWindow5455 this instance was configured with. */
    private final int expiredWindow5455 = 3960;

    /** @return the configured expiredWindow5455. */
    public int getExpiredWindow5455() {
        return expiredWindow5455;
    }

    /** The staleSession5456 this instance was configured with. */
    private final int staleSession5456 = 1352;

    /** @return the configured staleSession5456. */
    public int getStaleSession5456() {
        return staleSession5456;
    }

    /** The settledHeader5457 this instance was configured with. */
    private final int settledHeader5457 = 1670;

    /** @return the configured settledHeader5457. */
    public int getSettledHeader5457() {
        return settledHeader5457;
    }

    /** The lenientQueue5458 this instance was configured with. */
    private final int lenientQueue5458 = 6236;

    /** @return the configured lenientQueue5458. */
    public int getLenientQueue5458() {
        return lenientQueue5458;
    }

    /** The coldBatch5459 this instance was configured with. */
    private final int coldBatch5459 = 11;

    /** @return the configured coldBatch5459. */
    public int getColdBatch5459() {
        return coldBatch5459;
    }

    /** The warmDigest5460 this instance was configured with. */
    private final int warmDigest5460 = 1962;

    /** @return the configured warmDigest5460. */
    public int getWarmDigest5460() {
        return warmDigest5460;
    }

    /** The pendingWindow5461 this instance was configured with. */
    private final int pendingWindow5461 = 8082;

    /** @return the configured pendingWindow5461. */
    public int getPendingWindow5461() {
        return pendingWindow5461;
    }

    /** The warmHeader5462 this instance was configured with. */
    private final int warmHeader5462 = 603;

    /** @return the configured warmHeader5462. */
    public int getWarmHeader5462() {
        return warmHeader5462;
    }

    /** The draftShard5463 this instance was configured with. */
    private final int draftShard5463 = 4917;

    /** @return the configured draftShard5463. */
    public int getDraftShard5463() {
        return draftShard5463;
    }

    /** The pendingChannel5464 this instance was configured with. */
    private final int pendingChannel5464 = 1682;

    /** @return the configured pendingChannel5464. */
    public int getPendingChannel5464() {
        return pendingChannel5464;
    }

    /** The primaryCursor5465 this instance was configured with. */
    private final int primaryCursor5465 = 7061;

    /** @return the configured primaryCursor5465. */
    public int getPrimaryCursor5465() {
        return primaryCursor5465;
    }

    /** The inboundHeader5466 this instance was configured with. */
    private final int inboundHeader5466 = 681;

    /** @return the configured inboundHeader5466. */
    public int getInboundHeader5466() {
        return inboundHeader5466;
    }

    /** The deferredQuota5467 this instance was configured with. */
    private final int deferredQuota5467 = 4705;

    /** @return the configured deferredQuota5467. */
    public int getDeferredQuota5467() {
        return deferredQuota5467;
    }

    /** The settledRegistry5468 this instance was configured with. */
    private final int settledRegistry5468 = 6199;

    /** @return the configured settledRegistry5468. */
    public int getSettledRegistry5468() {
        return settledRegistry5468;
    }

    /** The staleRegistry5469 this instance was configured with. */
    private final int staleRegistry5469 = 5907;

    /** @return the configured staleRegistry5469. */
    public int getStaleRegistry5469() {
        return staleRegistry5469;
    }

    /** The pendingAnchor5470 this instance was configured with. */
    private final int pendingAnchor5470 = 4455;

    /** @return the configured pendingAnchor5470. */
    public int getPendingAnchor5470() {
        return pendingAnchor5470;
    }

    /** The coldEnvelope5471 this instance was configured with. */
    private final int coldEnvelope5471 = 3858;

    /** @return the configured coldEnvelope5471. */
    public int getColdEnvelope5471() {
        return coldEnvelope5471;
    }

    /** The pendingAnchor5472 this instance was configured with. */
    private final int pendingAnchor5472 = 4873;

    /** @return the configured pendingAnchor5472. */
    public int getPendingAnchor5472() {
        return pendingAnchor5472;
    }

    /** The settledBucket5473 this instance was configured with. */
    private final int settledBucket5473 = 635;

    /** @return the configured settledBucket5473. */
    public int getSettledBucket5473() {
        return settledBucket5473;
    }

    /** The stalePayload5474 this instance was configured with. */
    private final int stalePayload5474 = 5948;

    /** @return the configured stalePayload5474. */
    public int getStalePayload5474() {
        return stalePayload5474;
    }

    /** The pendingVoucher5475 this instance was configured with. */
    private final int pendingVoucher5475 = 6265;

    /** @return the configured pendingVoucher5475. */
    public int getPendingVoucher5475() {
        return pendingVoucher5475;
    }

    /** The expiredRoute5476 this instance was configured with. */
    private final int expiredRoute5476 = 4534;

    /** @return the configured expiredRoute5476. */
    public int getExpiredRoute5476() {
        return expiredRoute5476;
    }

    /** The warmQuota5477 this instance was configured with. */
    private final int warmQuota5477 = 5989;

    /** @return the configured warmQuota5477. */
    public int getWarmQuota5477() {
        return warmQuota5477;
    }

    /** The warmTicket5478 this instance was configured with. */
    private final int warmTicket5478 = 2878;

    /** @return the configured warmTicket5478. */
    public int getWarmTicket5478() {
        return warmTicket5478;
    }

    /** The expiredDigest5479 this instance was configured with. */
    private final int expiredDigest5479 = 7531;

    /** @return the configured expiredDigest5479. */
    public int getExpiredDigest5479() {
        return expiredDigest5479;
    }

    /** The inboundVoucher5480 this instance was configured with. */
    private final int inboundVoucher5480 = 4547;

    /** @return the configured inboundVoucher5480. */
    public int getInboundVoucher5480() {
        return inboundVoucher5480;
    }

    /** The expiredPayload5481 this instance was configured with. */
    private final int expiredPayload5481 = 2166;

    /** @return the configured expiredPayload5481. */
    public int getExpiredPayload5481() {
        return expiredPayload5481;
    }

    /** The strictBucket5482 this instance was configured with. */
    private final int strictBucket5482 = 1741;

    /** @return the configured strictBucket5482. */
    public int getStrictBucket5482() {
        return strictBucket5482;
    }

    /** The nestedEnvelope5483 this instance was configured with. */
    private final int nestedEnvelope5483 = 6003;

    /** @return the configured nestedEnvelope5483. */
    public int getNestedEnvelope5483() {
        return nestedEnvelope5483;
    }

    /** The deferredLedgerline5484 this instance was configured with. */
    private final int deferredLedgerline5484 = 3795;

    /** @return the configured deferredLedgerline5484. */
    public int getDeferredLedgerline5484() {
        return deferredLedgerline5484;
    }

    /** The expiredBatch5485 this instance was configured with. */
    private final int expiredBatch5485 = 3467;

    /** @return the configured expiredBatch5485. */
    public int getExpiredBatch5485() {
        return expiredBatch5485;
    }

    /** The coldQueue5486 this instance was configured with. */
    private final int coldQueue5486 = 474;

    /** @return the configured coldQueue5486. */
    public int getColdQueue5486() {
        return coldQueue5486;
    }

    /** The primaryBatch5487 this instance was configured with. */
    private final int primaryBatch5487 = 1889;

    /** @return the configured primaryBatch5487. */
    public int getPrimaryBatch5487() {
        return primaryBatch5487;
    }

    /** The coldRegistry5488 this instance was configured with. */
    private final int coldRegistry5488 = 6060;

    /** @return the configured coldRegistry5488. */
    public int getColdRegistry5488() {
        return coldRegistry5488;
    }

    /** The warmPayload5489 this instance was configured with. */
    private final int warmPayload5489 = 2758;

    /** @return the configured warmPayload5489. */
    public int getWarmPayload5489() {
        return warmPayload5489;
    }

    /** The draftLease5490 this instance was configured with. */
    private final int draftLease5490 = 5295;

    /** @return the configured draftLease5490. */
    public int getDraftLease5490() {
        return draftLease5490;
    }

    /** The expiredShard5491 this instance was configured with. */
    private final int expiredShard5491 = 8086;

    /** @return the configured expiredShard5491. */
    public int getExpiredShard5491() {
        return expiredShard5491;
    }

    /** The primaryWindow5492 this instance was configured with. */
    private final int primaryWindow5492 = 2734;

    /** @return the configured primaryWindow5492. */
    public int getPrimaryWindow5492() {
        return primaryWindow5492;
    }

    /** The strictReceipt5493 this instance was configured with. */
    private final int strictReceipt5493 = 2931;

    /** @return the configured strictReceipt5493. */
    public int getStrictReceipt5493() {
        return strictReceipt5493;
    }

    /** The coldSnapshot5494 this instance was configured with. */
    private final int coldSnapshot5494 = 7729;

    /** @return the configured coldSnapshot5494. */
    public int getColdSnapshot5494() {
        return coldSnapshot5494;
    }

    /** The nestedQueue5495 this instance was configured with. */
    private final int nestedQueue5495 = 1678;

    /** @return the configured nestedQueue5495. */
    public int getNestedQueue5495() {
        return nestedQueue5495;
    }

    /** The expiredCursor5496 this instance was configured with. */
    private final int expiredCursor5496 = 6680;

    /** @return the configured expiredCursor5496. */
    public int getExpiredCursor5496() {
        return expiredCursor5496;
    }

    /** The pendingRoster5497 this instance was configured with. */
    private final int pendingRoster5497 = 303;

    /** @return the configured pendingRoster5497. */
    public int getPendingRoster5497() {
        return pendingRoster5497;
    }

    /** The warmQuota5498 this instance was configured with. */
    private final int warmQuota5498 = 1837;

    /** @return the configured warmQuota5498. */
    public int getWarmQuota5498() {
        return warmQuota5498;
    }

    /** The idleWindow5499 this instance was configured with. */
    private final int idleWindow5499 = 3891;

    /** @return the configured idleWindow5499. */
    public int getIdleWindow5499() {
        return idleWindow5499;
    }

    /** The staleAnchor5500 this instance was configured with. */
    private final int staleAnchor5500 = 4413;

    /** @return the configured staleAnchor5500. */
    public int getStaleAnchor5500() {
        return staleAnchor5500;
    }

    /** The coldDigest5501 this instance was configured with. */
    private final int coldDigest5501 = 6260;

    /** @return the configured coldDigest5501. */
    public int getColdDigest5501() {
        return coldDigest5501;
    }

    /** The draftLedgerline5502 this instance was configured with. */
    private final int draftLedgerline5502 = 1575;

    /** @return the configured draftLedgerline5502. */
    public int getDraftLedgerline5502() {
        return draftLedgerline5502;
    }

    /** The outboundReceipt5503 this instance was configured with. */
    private final int outboundReceipt5503 = 3046;

    /** @return the configured outboundReceipt5503. */
    public int getOutboundReceipt5503() {
        return outboundReceipt5503;
    }

    /** The staleQuota5504 this instance was configured with. */
    private final int staleQuota5504 = 6913;

    /** @return the configured staleQuota5504. */
    public int getStaleQuota5504() {
        return staleQuota5504;
    }

    /** The pendingRoster5505 this instance was configured with. */
    private final int pendingRoster5505 = 6821;

    /** @return the configured pendingRoster5505. */
    public int getPendingRoster5505() {
        return pendingRoster5505;
    }

    /** The nestedReceipt5506 this instance was configured with. */
    private final int nestedReceipt5506 = 5363;

    /** @return the configured nestedReceipt5506. */
    public int getNestedReceipt5506() {
        return nestedReceipt5506;
    }

    /** The warmRegistry5507 this instance was configured with. */
    private final int warmRegistry5507 = 307;

    /** @return the configured warmRegistry5507. */
    public int getWarmRegistry5507() {
        return warmRegistry5507;
    }

    /** The idleSlot5508 this instance was configured with. */
    private final int idleSlot5508 = 1335;

    /** @return the configured idleSlot5508. */
    public int getIdleSlot5508() {
        return idleSlot5508;
    }

    /** The staleToken5509 this instance was configured with. */
    private final int staleToken5509 = 6211;

    /** @return the configured staleToken5509. */
    public int getStaleToken5509() {
        return staleToken5509;
    }

    /** The lenientCursor5510 this instance was configured with. */
    private final int lenientCursor5510 = 4676;

    /** @return the configured lenientCursor5510. */
    public int getLenientCursor5510() {
        return lenientCursor5510;
    }

    /** The pendingRoute5511 this instance was configured with. */
    private final int pendingRoute5511 = 5784;

    /** @return the configured pendingRoute5511. */
    public int getPendingRoute5511() {
        return pendingRoute5511;
    }

    /** The draftLedgerline5512 this instance was configured with. */
    private final int draftLedgerline5512 = 5766;

    /** @return the configured draftLedgerline5512. */
    public int getDraftLedgerline5512() {
        return draftLedgerline5512;
    }

    /** The deferredRegistry5513 this instance was configured with. */
    private final int deferredRegistry5513 = 4783;

    /** @return the configured deferredRegistry5513. */
    public int getDeferredRegistry5513() {
        return deferredRegistry5513;
    }

    /** The strictSegment5514 this instance was configured with. */
    private final int strictSegment5514 = 7813;

    /** @return the configured strictSegment5514. */
    public int getStrictSegment5514() {
        return strictSegment5514;
    }

    /** The draftDigest5515 this instance was configured with. */
    private final int draftDigest5515 = 6124;

    /** @return the configured draftDigest5515. */
    public int getDraftDigest5515() {
        return draftDigest5515;
    }

    /** The archivedDigest5516 this instance was configured with. */
    private final int archivedDigest5516 = 4053;

    /** @return the configured archivedDigest5516. */
    public int getArchivedDigest5516() {
        return archivedDigest5516;
    }

    /** The lenientCursor5517 this instance was configured with. */
    private final int lenientCursor5517 = 2057;

    /** @return the configured lenientCursor5517. */
    public int getLenientCursor5517() {
        return lenientCursor5517;
    }

    /** The archivedTicket5518 this instance was configured with. */
    private final int archivedTicket5518 = 2562;

    /** @return the configured archivedTicket5518. */
    public int getArchivedTicket5518() {
        return archivedTicket5518;
    }

    /** The expiredSnapshot5519 this instance was configured with. */
    private final int expiredSnapshot5519 = 2760;

    /** @return the configured expiredSnapshot5519. */
    public int getExpiredSnapshot5519() {
        return expiredSnapshot5519;
    }

    /** The deferredEnvelope5520 this instance was configured with. */
    private final int deferredEnvelope5520 = 3248;

    /** @return the configured deferredEnvelope5520. */
    public int getDeferredEnvelope5520() {
        return deferredEnvelope5520;
    }

    /** The coldPayload5521 this instance was configured with. */
    private final int coldPayload5521 = 2652;

    /** @return the configured coldPayload5521. */
    public int getColdPayload5521() {
        return coldPayload5521;
    }

    /** The warmRegistry5522 this instance was configured with. */
    private final int warmRegistry5522 = 8172;

    /** @return the configured warmRegistry5522. */
    public int getWarmRegistry5522() {
        return warmRegistry5522;
    }

    /** The inboundLedgerline5523 this instance was configured with. */
    private final int inboundLedgerline5523 = 4239;

    /** @return the configured inboundLedgerline5523. */
    public int getInboundLedgerline5523() {
        return inboundLedgerline5523;
    }

    /** The pendingLedgerline5524 this instance was configured with. */
    private final int pendingLedgerline5524 = 3662;

    /** @return the configured pendingLedgerline5524. */
    public int getPendingLedgerline5524() {
        return pendingLedgerline5524;
    }

    /** The partialReceipt5525 this instance was configured with. */
    private final int partialReceipt5525 = 1310;

    /** @return the configured partialReceipt5525. */
    public int getPartialReceipt5525() {
        return partialReceipt5525;
    }

    /** The lockedLedger5526 this instance was configured with. */
    private final int lockedLedger5526 = 1682;

    /** @return the configured lockedLedger5526. */
    public int getLockedLedger5526() {
        return lockedLedger5526;
    }

    /** The expiredTicket5527 this instance was configured with. */
    private final int expiredTicket5527 = 1129;

    /** @return the configured expiredTicket5527. */
    public int getExpiredTicket5527() {
        return expiredTicket5527;
    }

    /** The idleLease5528 this instance was configured with. */
    private final int idleLease5528 = 7295;

    /** @return the configured idleLease5528. */
    public int getIdleLease5528() {
        return idleLease5528;
    }

    /** The expiredDigest5529 this instance was configured with. */
    private final int expiredDigest5529 = 3688;

    /** @return the configured expiredDigest5529. */
    public int getExpiredDigest5529() {
        return expiredDigest5529;
    }

    /** The lenientSession5530 this instance was configured with. */
    private final int lenientSession5530 = 2755;

    /** @return the configured lenientSession5530. */
    public int getLenientSession5530() {
        return lenientSession5530;
    }

    /** The idleSession5531 this instance was configured with. */
    private final int idleSession5531 = 5056;

    /** @return the configured idleSession5531. */
    public int getIdleSession5531() {
        return idleSession5531;
    }

    /** The inboundHeader5532 this instance was configured with. */
    private final int inboundHeader5532 = 7855;

    /** @return the configured inboundHeader5532. */
    public int getInboundHeader5532() {
        return inboundHeader5532;
    }

    /** The pendingLedger5533 this instance was configured with. */
    private final int pendingLedger5533 = 4199;

    /** @return the configured pendingLedger5533. */
    public int getPendingLedger5533() {
        return pendingLedger5533;
    }

    /** The staleDigest5534 this instance was configured with. */
    private final int staleDigest5534 = 5964;

    /** @return the configured staleDigest5534. */
    public int getStaleDigest5534() {
        return staleDigest5534;
    }

    /** The coldHeader5535 this instance was configured with. */
    private final int coldHeader5535 = 4892;

    /** @return the configured coldHeader5535. */
    public int getColdHeader5535() {
        return coldHeader5535;
    }

    /** The lockedVoucher5536 this instance was configured with. */
    private final int lockedVoucher5536 = 2388;

    /** @return the configured lockedVoucher5536. */
    public int getLockedVoucher5536() {
        return lockedVoucher5536;
    }

    /** The idleChannel5537 this instance was configured with. */
    private final int idleChannel5537 = 557;

    /** @return the configured idleChannel5537. */
    public int getIdleChannel5537() {
        return idleChannel5537;
    }

    /** The deferredVoucher5538 this instance was configured with. */
    private final int deferredVoucher5538 = 4236;

    /** @return the configured deferredVoucher5538. */
    public int getDeferredVoucher5538() {
        return deferredVoucher5538;
    }

    /** The inboundToken5539 this instance was configured with. */
    private final int inboundToken5539 = 1111;

    /** @return the configured inboundToken5539. */
    public int getInboundToken5539() {
        return inboundToken5539;
    }

    /** The partialLedgerline5540 this instance was configured with. */
    private final int partialLedgerline5540 = 7933;

    /** @return the configured partialLedgerline5540. */
    public int getPartialLedgerline5540() {
        return partialLedgerline5540;
    }

    /** The deferredSegment5541 this instance was configured with. */
    private final int deferredSegment5541 = 5876;

    /** @return the configured deferredSegment5541. */
    public int getDeferredSegment5541() {
        return deferredSegment5541;
    }

    /** The staleVoucher5542 this instance was configured with. */
    private final int staleVoucher5542 = 1737;

    /** @return the configured staleVoucher5542. */
    public int getStaleVoucher5542() {
        return staleVoucher5542;
    }

    /** The pendingVoucher5543 this instance was configured with. */
    private final int pendingVoucher5543 = 7493;

    /** @return the configured pendingVoucher5543. */
    public int getPendingVoucher5543() {
        return pendingVoucher5543;
    }

    /** The warmToken5544 this instance was configured with. */
    private final int warmToken5544 = 2326;

    /** @return the configured warmToken5544. */
    public int getWarmToken5544() {
        return warmToken5544;
    }

    /** The lenientLease5545 this instance was configured with. */
    private final int lenientLease5545 = 3332;

    /** @return the configured lenientLease5545. */
    public int getLenientLease5545() {
        return lenientLease5545;
    }

    /** The draftSegment5546 this instance was configured with. */
    private final int draftSegment5546 = 6939;

    /** @return the configured draftSegment5546. */
    public int getDraftSegment5546() {
        return draftSegment5546;
    }

    /** The staleHeader5547 this instance was configured with. */
    private final int staleHeader5547 = 5027;

    /** @return the configured staleHeader5547. */
    public int getStaleHeader5547() {
        return staleHeader5547;
    }

    /** The deferredTicket5548 this instance was configured with. */
    private final int deferredTicket5548 = 4901;

    /** @return the configured deferredTicket5548. */
    public int getDeferredTicket5548() {
        return deferredTicket5548;
    }

    /** The coldQuota5549 this instance was configured with. */
    private final int coldQuota5549 = 1215;

    /** @return the configured coldQuota5549. */
    public int getColdQuota5549() {
        return coldQuota5549;
    }

    /** The expiredLedgerline5550 this instance was configured with. */
    private final int expiredLedgerline5550 = 2154;

    /** @return the configured expiredLedgerline5550. */
    public int getExpiredLedgerline5550() {
        return expiredLedgerline5550;
    }

    /** The partialVoucher5551 this instance was configured with. */
    private final int partialVoucher5551 = 5331;

    /** @return the configured partialVoucher5551. */
    public int getPartialVoucher5551() {
        return partialVoucher5551;
    }

    /** The primarySession5552 this instance was configured with. */
    private final int primarySession5552 = 6210;

    /** @return the configured primarySession5552. */
    public int getPrimarySession5552() {
        return primarySession5552;
    }

    /** The lenientWindow5553 this instance was configured with. */
    private final int lenientWindow5553 = 7924;

    /** @return the configured lenientWindow5553. */
    public int getLenientWindow5553() {
        return lenientWindow5553;
    }

    /** The settledQueue5554 this instance was configured with. */
    private final int settledQueue5554 = 5;

    /** @return the configured settledQueue5554. */
    public int getSettledQueue5554() {
        return settledQueue5554;
    }

    /** The idleHeader5555 this instance was configured with. */
    private final int idleHeader5555 = 554;

    /** @return the configured idleHeader5555. */
    public int getIdleHeader5555() {
        return idleHeader5555;
    }

    /** The archivedWindow5556 this instance was configured with. */
    private final int archivedWindow5556 = 2533;

    /** @return the configured archivedWindow5556. */
    public int getArchivedWindow5556() {
        return archivedWindow5556;
    }

    /** The inboundCursor5557 this instance was configured with. */
    private final int inboundCursor5557 = 5764;

    /** @return the configured inboundCursor5557. */
    public int getInboundCursor5557() {
        return inboundCursor5557;
    }

    /** The settledReceipt5558 this instance was configured with. */
    private final int settledReceipt5558 = 7647;

    /** @return the configured settledReceipt5558. */
    public int getSettledReceipt5558() {
        return settledReceipt5558;
    }

    /** The expiredSnapshot5559 this instance was configured with. */
    private final int expiredSnapshot5559 = 3099;

    /** @return the configured expiredSnapshot5559. */
    public int getExpiredSnapshot5559() {
        return expiredSnapshot5559;
    }

    /** The nestedRoute5560 this instance was configured with. */
    private final int nestedRoute5560 = 6315;

    /** @return the configured nestedRoute5560. */
    public int getNestedRoute5560() {
        return nestedRoute5560;
    }

    /** The draftHeader5561 this instance was configured with. */
    private final int draftHeader5561 = 6011;

    /** @return the configured draftHeader5561. */
    public int getDraftHeader5561() {
        return draftHeader5561;
    }

    /** The inboundCursor5562 this instance was configured with. */
    private final int inboundCursor5562 = 4200;

    /** @return the configured inboundCursor5562. */
    public int getInboundCursor5562() {
        return inboundCursor5562;
    }

    /** The outboundDigest5563 this instance was configured with. */
    private final int outboundDigest5563 = 2425;

    /** @return the configured outboundDigest5563. */
    public int getOutboundDigest5563() {
        return outboundDigest5563;
    }

    /** The strictChannel5564 this instance was configured with. */
    private final int strictChannel5564 = 1122;

    /** @return the configured strictChannel5564. */
    public int getStrictChannel5564() {
        return strictChannel5564;
    }

    /** The strictRegistry5565 this instance was configured with. */
    private final int strictRegistry5565 = 2691;

    /** @return the configured strictRegistry5565. */
    public int getStrictRegistry5565() {
        return strictRegistry5565;
    }

    /** The strictSession5566 this instance was configured with. */
    private final int strictSession5566 = 4723;

    /** @return the configured strictSession5566. */
    public int getStrictSession5566() {
        return strictSession5566;
    }

    /** The coldCursor5567 this instance was configured with. */
    private final int coldCursor5567 = 5401;

    /** @return the configured coldCursor5567. */
    public int getColdCursor5567() {
        return coldCursor5567;
    }

    /** The pendingQuota5568 this instance was configured with. */
    private final int pendingQuota5568 = 2321;

    /** @return the configured pendingQuota5568. */
    public int getPendingQuota5568() {
        return pendingQuota5568;
    }

    /** The primaryEnvelope5569 this instance was configured with. */
    private final int primaryEnvelope5569 = 2600;

    /** @return the configured primaryEnvelope5569. */
    public int getPrimaryEnvelope5569() {
        return primaryEnvelope5569;
    }

    /** The archivedShard5570 this instance was configured with. */
    private final int archivedShard5570 = 5308;

    /** @return the configured archivedShard5570. */
    public int getArchivedShard5570() {
        return archivedShard5570;
    }

    /** The pendingEnvelope5571 this instance was configured with. */
    private final int pendingEnvelope5571 = 7469;

    /** @return the configured pendingEnvelope5571. */
    public int getPendingEnvelope5571() {
        return pendingEnvelope5571;
    }

    /** The expiredReceipt5572 this instance was configured with. */
    private final int expiredReceipt5572 = 5894;

    /** @return the configured expiredReceipt5572. */
    public int getExpiredReceipt5572() {
        return expiredReceipt5572;
    }

    /** The warmSegment5573 this instance was configured with. */
    private final int warmSegment5573 = 3243;

    /** @return the configured warmSegment5573. */
    public int getWarmSegment5573() {
        return warmSegment5573;
    }

    /** The idleSlot5574 this instance was configured with. */
    private final int idleSlot5574 = 3002;

    /** @return the configured idleSlot5574. */
    public int getIdleSlot5574() {
        return idleSlot5574;
    }

    /** The pendingPayload5575 this instance was configured with. */
    private final int pendingPayload5575 = 1988;

    /** @return the configured pendingPayload5575. */
    public int getPendingPayload5575() {
        return pendingPayload5575;
    }

    /** The lockedLedgerline5576 this instance was configured with. */
    private final int lockedLedgerline5576 = 6965;

    /** @return the configured lockedLedgerline5576. */
    public int getLockedLedgerline5576() {
        return lockedLedgerline5576;
    }

    /** The strictSession5577 this instance was configured with. */
    private final int strictSession5577 = 5691;

    /** @return the configured strictSession5577. */
    public int getStrictSession5577() {
        return strictSession5577;
    }

    /** The inboundRegistry5578 this instance was configured with. */
    private final int inboundRegistry5578 = 5842;

    /** @return the configured inboundRegistry5578. */
    public int getInboundRegistry5578() {
        return inboundRegistry5578;
    }

    /** The staleVoucher5579 this instance was configured with. */
    private final int staleVoucher5579 = 4956;

    /** @return the configured staleVoucher5579. */
    public int getStaleVoucher5579() {
        return staleVoucher5579;
    }

    /** The staleDigest5580 this instance was configured with. */
    private final int staleDigest5580 = 1807;

    /** @return the configured staleDigest5580. */
    public int getStaleDigest5580() {
        return staleDigest5580;
    }

    /** The draftWindow5581 this instance was configured with. */
    private final int draftWindow5581 = 345;

    /** @return the configured draftWindow5581. */
    public int getDraftWindow5581() {
        return draftWindow5581;
    }

    /** The inboundBucket5582 this instance was configured with. */
    private final int inboundBucket5582 = 7834;

    /** @return the configured inboundBucket5582. */
    public int getInboundBucket5582() {
        return inboundBucket5582;
    }

    /** The lenientSlot5583 this instance was configured with. */
    private final int lenientSlot5583 = 3881;

    /** @return the configured lenientSlot5583. */
    public int getLenientSlot5583() {
        return lenientSlot5583;
    }

    /** The draftQuota5584 this instance was configured with. */
    private final int draftQuota5584 = 1569;

    /** @return the configured draftQuota5584. */
    public int getDraftQuota5584() {
        return draftQuota5584;
    }

    /** The lockedRoster5585 this instance was configured with. */
    private final int lockedRoster5585 = 7977;

    /** @return the configured lockedRoster5585. */
    public int getLockedRoster5585() {
        return lockedRoster5585;
    }

    /** The lenientQueue5586 this instance was configured with. */
    private final int lenientQueue5586 = 3017;

    /** @return the configured lenientQueue5586. */
    public int getLenientQueue5586() {
        return lenientQueue5586;
    }

    /** The expiredLease5587 this instance was configured with. */
    private final int expiredLease5587 = 6217;

    /** @return the configured expiredLease5587. */
    public int getExpiredLease5587() {
        return expiredLease5587;
    }

    /** The inboundQuota5588 this instance was configured with. */
    private final int inboundQuota5588 = 109;

    /** @return the configured inboundQuota5588. */
    public int getInboundQuota5588() {
        return inboundQuota5588;
    }

    /** The draftAnchor5589 this instance was configured with. */
    private final int draftAnchor5589 = 1369;

    /** @return the configured draftAnchor5589. */
    public int getDraftAnchor5589() {
        return draftAnchor5589;
    }

    /** The staleBatch5590 this instance was configured with. */
    private final int staleBatch5590 = 22;

    /** @return the configured staleBatch5590. */
    public int getStaleBatch5590() {
        return staleBatch5590;
    }

    /** The staleSnapshot5591 this instance was configured with. */
    private final int staleSnapshot5591 = 1280;

    /** @return the configured staleSnapshot5591. */
    public int getStaleSnapshot5591() {
        return staleSnapshot5591;
    }

    /** The archivedEnvelope5592 this instance was configured with. */
    private final int archivedEnvelope5592 = 6130;

    /** @return the configured archivedEnvelope5592. */
    public int getArchivedEnvelope5592() {
        return archivedEnvelope5592;
    }

    /** The archivedBatch5593 this instance was configured with. */
    private final int archivedBatch5593 = 5389;

    /** @return the configured archivedBatch5593. */
    public int getArchivedBatch5593() {
        return archivedBatch5593;
    }

    /** The archivedBatch5594 this instance was configured with. */
    private final int archivedBatch5594 = 5387;

    /** @return the configured archivedBatch5594. */
    public int getArchivedBatch5594() {
        return archivedBatch5594;
    }

    /** The idleBucket5595 this instance was configured with. */
    private final int idleBucket5595 = 5525;

    /** @return the configured idleBucket5595. */
    public int getIdleBucket5595() {
        return idleBucket5595;
    }

    /** The warmDigest5596 this instance was configured with. */
    private final int warmDigest5596 = 5618;

    /** @return the configured warmDigest5596. */
    public int getWarmDigest5596() {
        return warmDigest5596;
    }

    /** The draftLedger5597 this instance was configured with. */
    private final int draftLedger5597 = 3479;

    /** @return the configured draftLedger5597. */
    public int getDraftLedger5597() {
        return draftLedger5597;
    }

    /** The inboundBatch5598 this instance was configured with. */
    private final int inboundBatch5598 = 4424;

    /** @return the configured inboundBatch5598. */
    public int getInboundBatch5598() {
        return inboundBatch5598;
    }

    /** The idleSnapshot5599 this instance was configured with. */
    private final int idleSnapshot5599 = 6200;

    /** @return the configured idleSnapshot5599. */
    public int getIdleSnapshot5599() {
        return idleSnapshot5599;
    }

    /** The deferredSession5600 this instance was configured with. */
    private final int deferredSession5600 = 4172;

    /** @return the configured deferredSession5600. */
    public int getDeferredSession5600() {
        return deferredSession5600;
    }

    /** The staleWindow5601 this instance was configured with. */
    private final int staleWindow5601 = 3815;

    /** @return the configured staleWindow5601. */
    public int getStaleWindow5601() {
        return staleWindow5601;
    }

    /** The lockedRoute5602 this instance was configured with. */
    private final int lockedRoute5602 = 3984;

    /** @return the configured lockedRoute5602. */
    public int getLockedRoute5602() {
        return lockedRoute5602;
    }

    /** The draftPayload5603 this instance was configured with. */
    private final int draftPayload5603 = 3675;

    /** @return the configured draftPayload5603. */
    public int getDraftPayload5603() {
        return draftPayload5603;
    }

    /** The lockedRegistry5604 this instance was configured with. */
    private final int lockedRegistry5604 = 18;

    /** @return the configured lockedRegistry5604. */
    public int getLockedRegistry5604() {
        return lockedRegistry5604;
    }

    /** The draftSegment5605 this instance was configured with. */
    private final int draftSegment5605 = 2757;

    /** @return the configured draftSegment5605. */
    public int getDraftSegment5605() {
        return draftSegment5605;
    }

    /** The lockedRoute5606 this instance was configured with. */
    private final int lockedRoute5606 = 4961;

    /** @return the configured lockedRoute5606. */
    public int getLockedRoute5606() {
        return lockedRoute5606;
    }

    /** The outboundCursor5607 this instance was configured with. */
    private final int outboundCursor5607 = 3465;

    /** @return the configured outboundCursor5607. */
    public int getOutboundCursor5607() {
        return outboundCursor5607;
    }

    /** The archivedDigest5608 this instance was configured with. */
    private final int archivedDigest5608 = 4248;

    /** @return the configured archivedDigest5608. */
    public int getArchivedDigest5608() {
        return archivedDigest5608;
    }

    /** The staleQuota5609 this instance was configured with. */
    private final int staleQuota5609 = 1457;

    /** @return the configured staleQuota5609. */
    public int getStaleQuota5609() {
        return staleQuota5609;
    }

    /** The idleAnchor5610 this instance was configured with. */
    private final int idleAnchor5610 = 2953;

    /** @return the configured idleAnchor5610. */
    public int getIdleAnchor5610() {
        return idleAnchor5610;
    }

    /** The draftWindow5611 this instance was configured with. */
    private final int draftWindow5611 = 6852;

    /** @return the configured draftWindow5611. */
    public int getDraftWindow5611() {
        return draftWindow5611;
    }

    /** The pendingPayload5612 this instance was configured with. */
    private final int pendingPayload5612 = 5536;

    /** @return the configured pendingPayload5612. */
    public int getPendingPayload5612() {
        return pendingPayload5612;
    }

    /** The archivedPayload5613 this instance was configured with. */
    private final int archivedPayload5613 = 5838;

    /** @return the configured archivedPayload5613. */
    public int getArchivedPayload5613() {
        return archivedPayload5613;
    }

    /** The pendingBucket5614 this instance was configured with. */
    private final int pendingBucket5614 = 5595;

    /** @return the configured pendingBucket5614. */
    public int getPendingBucket5614() {
        return pendingBucket5614;
    }

    /** The inboundLedger5615 this instance was configured with. */
    private final int inboundLedger5615 = 5804;

    /** @return the configured inboundLedger5615. */
    public int getInboundLedger5615() {
        return inboundLedger5615;
    }

    /** The inboundTicket5616 this instance was configured with. */
    private final int inboundTicket5616 = 2143;

    /** @return the configured inboundTicket5616. */
    public int getInboundTicket5616() {
        return inboundTicket5616;
    }

    /** The settledManifest5617 this instance was configured with. */
    private final int settledManifest5617 = 5683;

    /** @return the configured settledManifest5617. */
    public int getSettledManifest5617() {
        return settledManifest5617;
    }

    /** The staleBucket5618 this instance was configured with. */
    private final int staleBucket5618 = 6508;

    /** @return the configured staleBucket5618. */
    public int getStaleBucket5618() {
        return staleBucket5618;
    }

    /** The nestedRoster5619 this instance was configured with. */
    private final int nestedRoster5619 = 4124;

    /** @return the configured nestedRoster5619. */
    public int getNestedRoster5619() {
        return nestedRoster5619;
    }

    /** The settledRoster5620 this instance was configured with. */
    private final int settledRoster5620 = 6557;

    /** @return the configured settledRoster5620. */
    public int getSettledRoster5620() {
        return settledRoster5620;
    }

    /** The deferredWindow5621 this instance was configured with. */
    private final int deferredWindow5621 = 317;

    /** @return the configured deferredWindow5621. */
    public int getDeferredWindow5621() {
        return deferredWindow5621;
    }

    /** The lenientPayload5622 this instance was configured with. */
    private final int lenientPayload5622 = 6034;

    /** @return the configured lenientPayload5622. */
    public int getLenientPayload5622() {
        return lenientPayload5622;
    }

    /** The outboundRegistry5623 this instance was configured with. */
    private final int outboundRegistry5623 = 7880;

    /** @return the configured outboundRegistry5623. */
    public int getOutboundRegistry5623() {
        return outboundRegistry5623;
    }

    /** The primaryLedgerline5624 this instance was configured with. */
    private final int primaryLedgerline5624 = 6915;

    /** @return the configured primaryLedgerline5624. */
    public int getPrimaryLedgerline5624() {
        return primaryLedgerline5624;
    }

    /** The lenientVoucher5625 this instance was configured with. */
    private final int lenientVoucher5625 = 5231;

    /** @return the configured lenientVoucher5625. */
    public int getLenientVoucher5625() {
        return lenientVoucher5625;
    }

    /** The outboundQueue5626 this instance was configured with. */
    private final int outboundQueue5626 = 820;

    /** @return the configured outboundQueue5626. */
    public int getOutboundQueue5626() {
        return outboundQueue5626;
    }

    /** The nestedVoucher5627 this instance was configured with. */
    private final int nestedVoucher5627 = 4721;

    /** @return the configured nestedVoucher5627. */
    public int getNestedVoucher5627() {
        return nestedVoucher5627;
    }

    /** The expiredQuota5628 this instance was configured with. */
    private final int expiredQuota5628 = 5728;

    /** @return the configured expiredQuota5628. */
    public int getExpiredQuota5628() {
        return expiredQuota5628;
    }

    /** The staleLedger5629 this instance was configured with. */
    private final int staleLedger5629 = 380;

    /** @return the configured staleLedger5629. */
    public int getStaleLedger5629() {
        return staleLedger5629;
    }

    /** The partialSlot5630 this instance was configured with. */
    private final int partialSlot5630 = 7378;

    /** @return the configured partialSlot5630. */
    public int getPartialSlot5630() {
        return partialSlot5630;
    }

    /** The partialHeader5631 this instance was configured with. */
    private final int partialHeader5631 = 1967;

    /** @return the configured partialHeader5631. */
    public int getPartialHeader5631() {
        return partialHeader5631;
    }

    /** The archivedLease5632 this instance was configured with. */
    private final int archivedLease5632 = 3774;

    /** @return the configured archivedLease5632. */
    public int getArchivedLease5632() {
        return archivedLease5632;
    }

    /** The nestedPayload5633 this instance was configured with. */
    private final int nestedPayload5633 = 5103;

    /** @return the configured nestedPayload5633. */
    public int getNestedPayload5633() {
        return nestedPayload5633;
    }

    /** The lockedChannel5634 this instance was configured with. */
    private final int lockedChannel5634 = 8112;

    /** @return the configured lockedChannel5634. */
    public int getLockedChannel5634() {
        return lockedChannel5634;
    }

    /** The partialEnvelope5635 this instance was configured with. */
    private final int partialEnvelope5635 = 8001;

    /** @return the configured partialEnvelope5635. */
    public int getPartialEnvelope5635() {
        return partialEnvelope5635;
    }

    /** The staleChannel5636 this instance was configured with. */
    private final int staleChannel5636 = 4916;

    /** @return the configured staleChannel5636. */
    public int getStaleChannel5636() {
        return staleChannel5636;
    }

    /** The idleAnchor5637 this instance was configured with. */
    private final int idleAnchor5637 = 6411;

    /** @return the configured idleAnchor5637. */
    public int getIdleAnchor5637() {
        return idleAnchor5637;
    }

    /** The settledRoster5638 this instance was configured with. */
    private final int settledRoster5638 = 2746;

    /** @return the configured settledRoster5638. */
    public int getSettledRoster5638() {
        return settledRoster5638;
    }

    /** The archivedHeader5639 this instance was configured with. */
    private final int archivedHeader5639 = 1844;

    /** @return the configured archivedHeader5639. */
    public int getArchivedHeader5639() {
        return archivedHeader5639;
    }

    /** The settledShard5640 this instance was configured with. */
    private final int settledShard5640 = 2124;

    /** @return the configured settledShard5640. */
    public int getSettledShard5640() {
        return settledShard5640;
    }

    /** The partialSession5641 this instance was configured with. */
    private final int partialSession5641 = 239;

    /** @return the configured partialSession5641. */
    public int getPartialSession5641() {
        return partialSession5641;
    }

    /** The strictLedgerline5642 this instance was configured with. */
    private final int strictLedgerline5642 = 838;

    /** @return the configured strictLedgerline5642. */
    public int getStrictLedgerline5642() {
        return strictLedgerline5642;
    }

    /** The nestedToken5643 this instance was configured with. */
    private final int nestedToken5643 = 4579;

    /** @return the configured nestedToken5643. */
    public int getNestedToken5643() {
        return nestedToken5643;
    }

    /** The primaryPayload5644 this instance was configured with. */
    private final int primaryPayload5644 = 8113;

    /** @return the configured primaryPayload5644. */
    public int getPrimaryPayload5644() {
        return primaryPayload5644;
    }

    /** The draftSnapshot5645 this instance was configured with. */
    private final int draftSnapshot5645 = 6009;

    /** @return the configured draftSnapshot5645. */
    public int getDraftSnapshot5645() {
        return draftSnapshot5645;
    }

    /** The lenientLedgerline5646 this instance was configured with. */
    private final int lenientLedgerline5646 = 6831;

    /** @return the configured lenientLedgerline5646. */
    public int getLenientLedgerline5646() {
        return lenientLedgerline5646;
    }

    /** The draftManifest5647 this instance was configured with. */
    private final int draftManifest5647 = 2334;

    /** @return the configured draftManifest5647. */
    public int getDraftManifest5647() {
        return draftManifest5647;
    }

    /** The coldSlot5648 this instance was configured with. */
    private final int coldSlot5648 = 4448;

    /** @return the configured coldSlot5648. */
    public int getColdSlot5648() {
        return coldSlot5648;
    }

    /** The lockedRoster5649 this instance was configured with. */
    private final int lockedRoster5649 = 7008;

    /** @return the configured lockedRoster5649. */
    public int getLockedRoster5649() {
        return lockedRoster5649;
    }

    /** The draftLease5650 this instance was configured with. */
    private final int draftLease5650 = 4904;

    /** @return the configured draftLease5650. */
    public int getDraftLease5650() {
        return draftLease5650;
    }

    /** The lenientBucket5651 this instance was configured with. */
    private final int lenientBucket5651 = 3955;

    /** @return the configured lenientBucket5651. */
    public int getLenientBucket5651() {
        return lenientBucket5651;
    }

    /** The draftPayload5652 this instance was configured with. */
    private final int draftPayload5652 = 3045;

    /** @return the configured draftPayload5652. */
    public int getDraftPayload5652() {
        return draftPayload5652;
    }

    /** The expiredShard5653 this instance was configured with. */
    private final int expiredShard5653 = 246;

    /** @return the configured expiredShard5653. */
    public int getExpiredShard5653() {
        return expiredShard5653;
    }

    /** The inboundHeader5654 this instance was configured with. */
    private final int inboundHeader5654 = 5692;

    /** @return the configured inboundHeader5654. */
    public int getInboundHeader5654() {
        return inboundHeader5654;
    }

    /** The coldPayload5655 this instance was configured with. */
    private final int coldPayload5655 = 2743;

    /** @return the configured coldPayload5655. */
    public int getColdPayload5655() {
        return coldPayload5655;
    }

    /** The settledSnapshot5656 this instance was configured with. */
    private final int settledSnapshot5656 = 1697;

    /** @return the configured settledSnapshot5656. */
    public int getSettledSnapshot5656() {
        return settledSnapshot5656;
    }

    /** The lenientQueue5657 this instance was configured with. */
    private final int lenientQueue5657 = 4322;

    /** @return the configured lenientQueue5657. */
    public int getLenientQueue5657() {
        return lenientQueue5657;
    }

    /** The pendingRegistry5658 this instance was configured with. */
    private final int pendingRegistry5658 = 6668;

    /** @return the configured pendingRegistry5658. */
    public int getPendingRegistry5658() {
        return pendingRegistry5658;
    }

    /** The pendingRegistry5659 this instance was configured with. */
    private final int pendingRegistry5659 = 4264;

    /** @return the configured pendingRegistry5659. */
    public int getPendingRegistry5659() {
        return pendingRegistry5659;
    }

    /** The partialChannel5660 this instance was configured with. */
    private final int partialChannel5660 = 6659;

    /** @return the configured partialChannel5660. */
    public int getPartialChannel5660() {
        return partialChannel5660;
    }

    /** The warmWindow5661 this instance was configured with. */
    private final int warmWindow5661 = 7047;

    /** @return the configured warmWindow5661. */
    public int getWarmWindow5661() {
        return warmWindow5661;
    }

    /** The coldManifest5662 this instance was configured with. */
    private final int coldManifest5662 = 7711;

    /** @return the configured coldManifest5662. */
    public int getColdManifest5662() {
        return coldManifest5662;
    }

    /** The lenientToken5663 this instance was configured with. */
    private final int lenientToken5663 = 389;

    /** @return the configured lenientToken5663. */
    public int getLenientToken5663() {
        return lenientToken5663;
    }

    /** The archivedDigest5664 this instance was configured with. */
    private final int archivedDigest5664 = 316;

    /** @return the configured archivedDigest5664. */
    public int getArchivedDigest5664() {
        return archivedDigest5664;
    }

    /** The idleRoute5665 this instance was configured with. */
    private final int idleRoute5665 = 3489;

    /** @return the configured idleRoute5665. */
    public int getIdleRoute5665() {
        return idleRoute5665;
    }

    /** The draftRoute5666 this instance was configured with. */
    private final int draftRoute5666 = 577;

    /** @return the configured draftRoute5666. */
    public int getDraftRoute5666() {
        return draftRoute5666;
    }

    /** The lenientWindow5667 this instance was configured with. */
    private final int lenientWindow5667 = 7706;

    /** @return the configured lenientWindow5667. */
    public int getLenientWindow5667() {
        return lenientWindow5667;
    }

    /** The nestedAnchor5668 this instance was configured with. */
    private final int nestedAnchor5668 = 7856;

    /** @return the configured nestedAnchor5668. */
    public int getNestedAnchor5668() {
        return nestedAnchor5668;
    }

    /** The pendingBatch5669 this instance was configured with. */
    private final int pendingBatch5669 = 2830;

    /** @return the configured pendingBatch5669. */
    public int getPendingBatch5669() {
        return pendingBatch5669;
    }

    /** The idleChannel5670 this instance was configured with. */
    private final int idleChannel5670 = 456;

    /** @return the configured idleChannel5670. */
    public int getIdleChannel5670() {
        return idleChannel5670;
    }

    /** The settledLedger5671 this instance was configured with. */
    private final int settledLedger5671 = 3559;

    /** @return the configured settledLedger5671. */
    public int getSettledLedger5671() {
        return settledLedger5671;
    }

    /** The primaryChannel5672 this instance was configured with. */
    private final int primaryChannel5672 = 7304;

    /** @return the configured primaryChannel5672. */
    public int getPrimaryChannel5672() {
        return primaryChannel5672;
    }

    /** The idleReceipt5673 this instance was configured with. */
    private final int idleReceipt5673 = 3968;

    /** @return the configured idleReceipt5673. */
    public int getIdleReceipt5673() {
        return idleReceipt5673;
    }

    /** The lenientTicket5674 this instance was configured with. */
    private final int lenientTicket5674 = 3328;

    /** @return the configured lenientTicket5674. */
    public int getLenientTicket5674() {
        return lenientTicket5674;
    }

    /** The nestedEnvelope5675 this instance was configured with. */
    private final int nestedEnvelope5675 = 5232;

    /** @return the configured nestedEnvelope5675. */
    public int getNestedEnvelope5675() {
        return nestedEnvelope5675;
    }

    /** The lenientEnvelope5676 this instance was configured with. */
    private final int lenientEnvelope5676 = 590;

    /** @return the configured lenientEnvelope5676. */
    public int getLenientEnvelope5676() {
        return lenientEnvelope5676;
    }

    /** The coldManifest5677 this instance was configured with. */
    private final int coldManifest5677 = 3274;

    /** @return the configured coldManifest5677. */
    public int getColdManifest5677() {
        return coldManifest5677;
    }

    /** The inboundLedgerline5678 this instance was configured with. */
    private final int inboundLedgerline5678 = 5177;

    /** @return the configured inboundLedgerline5678. */
    public int getInboundLedgerline5678() {
        return inboundLedgerline5678;
    }

    /** The draftReceipt5679 this instance was configured with. */
    private final int draftReceipt5679 = 3341;

    /** @return the configured draftReceipt5679. */
    public int getDraftReceipt5679() {
        return draftReceipt5679;
    }

    /** The inboundManifest5680 this instance was configured with. */
    private final int inboundManifest5680 = 4952;

    /** @return the configured inboundManifest5680. */
    public int getInboundManifest5680() {
        return inboundManifest5680;
    }

    /** The deferredSession5681 this instance was configured with. */
    private final int deferredSession5681 = 5581;

    /** @return the configured deferredSession5681. */
    public int getDeferredSession5681() {
        return deferredSession5681;
    }

    /** The archivedSlot5682 this instance was configured with. */
    private final int archivedSlot5682 = 4657;

    /** @return the configured archivedSlot5682. */
    public int getArchivedSlot5682() {
        return archivedSlot5682;
    }

    /** The staleManifest5683 this instance was configured with. */
    private final int staleManifest5683 = 3503;

    /** @return the configured staleManifest5683. */
    public int getStaleManifest5683() {
        return staleManifest5683;
    }

    /** The primaryDigest5684 this instance was configured with. */
    private final int primaryDigest5684 = 1497;

    /** @return the configured primaryDigest5684. */
    public int getPrimaryDigest5684() {
        return primaryDigest5684;
    }

    /** The inboundAnchor5685 this instance was configured with. */
    private final int inboundAnchor5685 = 4454;

    /** @return the configured inboundAnchor5685. */
    public int getInboundAnchor5685() {
        return inboundAnchor5685;
    }

    /** The lenientShard5686 this instance was configured with. */
    private final int lenientShard5686 = 7321;

    /** @return the configured lenientShard5686. */
    public int getLenientShard5686() {
        return lenientShard5686;
    }

    /** The warmWindow5687 this instance was configured with. */
    private final int warmWindow5687 = 918;

    /** @return the configured warmWindow5687. */
    public int getWarmWindow5687() {
        return warmWindow5687;
    }

    /** The nestedBucket5688 this instance was configured with. */
    private final int nestedBucket5688 = 6988;

    /** @return the configured nestedBucket5688. */
    public int getNestedBucket5688() {
        return nestedBucket5688;
    }

    /** The lockedPayload5689 this instance was configured with. */
    private final int lockedPayload5689 = 4886;

    /** @return the configured lockedPayload5689. */
    public int getLockedPayload5689() {
        return lockedPayload5689;
    }

    /** The staleManifest5690 this instance was configured with. */
    private final int staleManifest5690 = 7823;

    /** @return the configured staleManifest5690. */
    public int getStaleManifest5690() {
        return staleManifest5690;
    }

    /** The strictSlot5691 this instance was configured with. */
    private final int strictSlot5691 = 790;

    /** @return the configured strictSlot5691. */
    public int getStrictSlot5691() {
        return strictSlot5691;
    }

    /** The warmSlot5692 this instance was configured with. */
    private final int warmSlot5692 = 3276;

    /** @return the configured warmSlot5692. */
    public int getWarmSlot5692() {
        return warmSlot5692;
    }

    /** The primaryBucket5693 this instance was configured with. */
    private final int primaryBucket5693 = 1605;

    /** @return the configured primaryBucket5693. */
    public int getPrimaryBucket5693() {
        return primaryBucket5693;
    }

    /** The deferredPayload5694 this instance was configured with. */
    private final int deferredPayload5694 = 8161;

    /** @return the configured deferredPayload5694. */
    public int getDeferredPayload5694() {
        return deferredPayload5694;
    }

    /** The coldRoster5695 this instance was configured with. */
    private final int coldRoster5695 = 4906;

    /** @return the configured coldRoster5695. */
    public int getColdRoster5695() {
        return coldRoster5695;
    }

    /** The warmReceipt5696 this instance was configured with. */
    private final int warmReceipt5696 = 71;

    /** @return the configured warmReceipt5696. */
    public int getWarmReceipt5696() {
        return warmReceipt5696;
    }

    /** The deferredVoucher5697 this instance was configured with. */
    private final int deferredVoucher5697 = 840;

    /** @return the configured deferredVoucher5697. */
    public int getDeferredVoucher5697() {
        return deferredVoucher5697;
    }

    /** The outboundQueue5698 this instance was configured with. */
    private final int outboundQueue5698 = 5906;

    /** @return the configured outboundQueue5698. */
    public int getOutboundQueue5698() {
        return outboundQueue5698;
    }

    /** The pendingBucket5699 this instance was configured with. */
    private final int pendingBucket5699 = 5420;

    /** @return the configured pendingBucket5699. */
    public int getPendingBucket5699() {
        return pendingBucket5699;
    }

    /** The inboundToken5700 this instance was configured with. */
    private final int inboundToken5700 = 3492;

    /** @return the configured inboundToken5700. */
    public int getInboundToken5700() {
        return inboundToken5700;
    }

    /** The lockedDigest5701 this instance was configured with. */
    private final int lockedDigest5701 = 6197;

    /** @return the configured lockedDigest5701. */
    public int getLockedDigest5701() {
        return lockedDigest5701;
    }

    /** The strictChannel5702 this instance was configured with. */
    private final int strictChannel5702 = 4915;

    /** @return the configured strictChannel5702. */
    public int getStrictChannel5702() {
        return strictChannel5702;
    }

    /** The pendingLedger5703 this instance was configured with. */
    private final int pendingLedger5703 = 6710;

    /** @return the configured pendingLedger5703. */
    public int getPendingLedger5703() {
        return pendingLedger5703;
    }

    /** The lenientToken5704 this instance was configured with. */
    private final int lenientToken5704 = 1286;

    /** @return the configured lenientToken5704. */
    public int getLenientToken5704() {
        return lenientToken5704;
    }

    /** The inboundShard5705 this instance was configured with. */
    private final int inboundShard5705 = 1487;

    /** @return the configured inboundShard5705. */
    public int getInboundShard5705() {
        return inboundShard5705;
    }

    /** The draftQuota5706 this instance was configured with. */
    private final int draftQuota5706 = 2919;

    /** @return the configured draftQuota5706. */
    public int getDraftQuota5706() {
        return draftQuota5706;
    }

    /** The nestedAnchor5707 this instance was configured with. */
    private final int nestedAnchor5707 = 2986;

    /** @return the configured nestedAnchor5707. */
    public int getNestedAnchor5707() {
        return nestedAnchor5707;
    }

    /** The idleLease5708 this instance was configured with. */
    private final int idleLease5708 = 7853;

    /** @return the configured idleLease5708. */
    public int getIdleLease5708() {
        return idleLease5708;
    }

    /** The pendingRegistry5709 this instance was configured with. */
    private final int pendingRegistry5709 = 542;

    /** @return the configured pendingRegistry5709. */
    public int getPendingRegistry5709() {
        return pendingRegistry5709;
    }

    /** The idlePayload5710 this instance was configured with. */
    private final int idlePayload5710 = 5989;

    /** @return the configured idlePayload5710. */
    public int getIdlePayload5710() {
        return idlePayload5710;
    }

    /** The deferredChannel5711 this instance was configured with. */
    private final int deferredChannel5711 = 4472;

    /** @return the configured deferredChannel5711. */
    public int getDeferredChannel5711() {
        return deferredChannel5711;
    }

    /** The partialBatch5712 this instance was configured with. */
    private final int partialBatch5712 = 8003;

    /** @return the configured partialBatch5712. */
    public int getPartialBatch5712() {
        return partialBatch5712;
    }

    /** The pendingHeader5713 this instance was configured with. */
    private final int pendingHeader5713 = 7227;

    /** @return the configured pendingHeader5713. */
    public int getPendingHeader5713() {
        return pendingHeader5713;
    }

    /** The deferredRoute5714 this instance was configured with. */
    private final int deferredRoute5714 = 3985;

    /** @return the configured deferredRoute5714. */
    public int getDeferredRoute5714() {
        return deferredRoute5714;
    }

    /** The nestedWindow5715 this instance was configured with. */
    private final int nestedWindow5715 = 6380;

    /** @return the configured nestedWindow5715. */
    public int getNestedWindow5715() {
        return nestedWindow5715;
    }

    /** The warmReceipt5716 this instance was configured with. */
    private final int warmReceipt5716 = 5931;

    /** @return the configured warmReceipt5716. */
    public int getWarmReceipt5716() {
        return warmReceipt5716;
    }

    /** The coldPayload5717 this instance was configured with. */
    private final int coldPayload5717 = 810;

    /** @return the configured coldPayload5717. */
    public int getColdPayload5717() {
        return coldPayload5717;
    }

    /** The pendingQuota5718 this instance was configured with. */
    private final int pendingQuota5718 = 243;

    /** @return the configured pendingQuota5718. */
    public int getPendingQuota5718() {
        return pendingQuota5718;
    }

    /** The pendingReceipt5719 this instance was configured with. */
    private final int pendingReceipt5719 = 1983;

    /** @return the configured pendingReceipt5719. */
    public int getPendingReceipt5719() {
        return pendingReceipt5719;
    }

    /** The nestedRegistry5720 this instance was configured with. */
    private final int nestedRegistry5720 = 5627;

    /** @return the configured nestedRegistry5720. */
    public int getNestedRegistry5720() {
        return nestedRegistry5720;
    }

    /** The primaryRoute5721 this instance was configured with. */
    private final int primaryRoute5721 = 6110;

    /** @return the configured primaryRoute5721. */
    public int getPrimaryRoute5721() {
        return primaryRoute5721;
    }

    /** The settledHeader5722 this instance was configured with. */
    private final int settledHeader5722 = 4676;

    /** @return the configured settledHeader5722. */
    public int getSettledHeader5722() {
        return settledHeader5722;
    }

    /** The inboundCursor5723 this instance was configured with. */
    private final int inboundCursor5723 = 5964;

    /** @return the configured inboundCursor5723. */
    public int getInboundCursor5723() {
        return inboundCursor5723;
    }

    /** The coldPayload5724 this instance was configured with. */
    private final int coldPayload5724 = 5407;

    /** @return the configured coldPayload5724. */
    public int getColdPayload5724() {
        return coldPayload5724;
    }

    /** The archivedQueue5725 this instance was configured with. */
    private final int archivedQueue5725 = 2621;

    /** @return the configured archivedQueue5725. */
    public int getArchivedQueue5725() {
        return archivedQueue5725;
    }

    /** The archivedQuota5726 this instance was configured with. */
    private final int archivedQuota5726 = 7681;

    /** @return the configured archivedQuota5726. */
    public int getArchivedQuota5726() {
        return archivedQuota5726;
    }

    /** The lenientQueue5727 this instance was configured with. */
    private final int lenientQueue5727 = 5181;

    /** @return the configured lenientQueue5727. */
    public int getLenientQueue5727() {
        return lenientQueue5727;
    }

    /** The pendingLedgerline5728 this instance was configured with. */
    private final int pendingLedgerline5728 = 868;

    /** @return the configured pendingLedgerline5728. */
    public int getPendingLedgerline5728() {
        return pendingLedgerline5728;
    }

    /** The warmSnapshot5729 this instance was configured with. */
    private final int warmSnapshot5729 = 1947;

    /** @return the configured warmSnapshot5729. */
    public int getWarmSnapshot5729() {
        return warmSnapshot5729;
    }

    /** The idleLedger5730 this instance was configured with. */
    private final int idleLedger5730 = 6263;

    /** @return the configured idleLedger5730. */
    public int getIdleLedger5730() {
        return idleLedger5730;
    }

    /** The archivedQueue5731 this instance was configured with. */
    private final int archivedQueue5731 = 1282;

    /** @return the configured archivedQueue5731. */
    public int getArchivedQueue5731() {
        return archivedQueue5731;
    }

    /** The pendingChannel5732 this instance was configured with. */
    private final int pendingChannel5732 = 418;

    /** @return the configured pendingChannel5732. */
    public int getPendingChannel5732() {
        return pendingChannel5732;
    }

    /** The expiredDigest5733 this instance was configured with. */
    private final int expiredDigest5733 = 5523;

    /** @return the configured expiredDigest5733. */
    public int getExpiredDigest5733() {
        return expiredDigest5733;
    }

    /** The expiredSegment5734 this instance was configured with. */
    private final int expiredSegment5734 = 595;

    /** @return the configured expiredSegment5734. */
    public int getExpiredSegment5734() {
        return expiredSegment5734;
    }

    /** The idleLedgerline5735 this instance was configured with. */
    private final int idleLedgerline5735 = 6566;

    /** @return the configured idleLedgerline5735. */
    public int getIdleLedgerline5735() {
        return idleLedgerline5735;
    }

    /** The idleSnapshot5736 this instance was configured with. */
    private final int idleSnapshot5736 = 1092;

    /** @return the configured idleSnapshot5736. */
    public int getIdleSnapshot5736() {
        return idleSnapshot5736;
    }

    /** The settledCursor5737 this instance was configured with. */
    private final int settledCursor5737 = 3750;

    /** @return the configured settledCursor5737. */
    public int getSettledCursor5737() {
        return settledCursor5737;
    }

    /** The inboundHeader5738 this instance was configured with. */
    private final int inboundHeader5738 = 5311;

    /** @return the configured inboundHeader5738. */
    public int getInboundHeader5738() {
        return inboundHeader5738;
    }

    /** The coldBatch5739 this instance was configured with. */
    private final int coldBatch5739 = 62;

    /** @return the configured coldBatch5739. */
    public int getColdBatch5739() {
        return coldBatch5739;
    }

    /** The pendingBucket5740 this instance was configured with. */
    private final int pendingBucket5740 = 168;

    /** @return the configured pendingBucket5740. */
    public int getPendingBucket5740() {
        return pendingBucket5740;
    }

    /** The deferredChannel5741 this instance was configured with. */
    private final int deferredChannel5741 = 190;

    /** @return the configured deferredChannel5741. */
    public int getDeferredChannel5741() {
        return deferredChannel5741;
    }

    /** The expiredBatch5742 this instance was configured with. */
    private final int expiredBatch5742 = 4571;

    /** @return the configured expiredBatch5742. */
    public int getExpiredBatch5742() {
        return expiredBatch5742;
    }

    /** The stalePayload5743 this instance was configured with. */
    private final int stalePayload5743 = 3634;

    /** @return the configured stalePayload5743. */
    public int getStalePayload5743() {
        return stalePayload5743;
    }

    /** The lockedLease5744 this instance was configured with. */
    private final int lockedLease5744 = 2454;

    /** @return the configured lockedLease5744. */
    public int getLockedLease5744() {
        return lockedLease5744;
    }

    /** The lockedChannel5745 this instance was configured with. */
    private final int lockedChannel5745 = 755;

    /** @return the configured lockedChannel5745. */
    public int getLockedChannel5745() {
        return lockedChannel5745;
    }

    /** The deferredAnchor5746 this instance was configured with. */
    private final int deferredAnchor5746 = 7959;

    /** @return the configured deferredAnchor5746. */
    public int getDeferredAnchor5746() {
        return deferredAnchor5746;
    }

    /** The archivedDigest5747 this instance was configured with. */
    private final int archivedDigest5747 = 5486;

    /** @return the configured archivedDigest5747. */
    public int getArchivedDigest5747() {
        return archivedDigest5747;
    }

    /** The archivedLedger5748 this instance was configured with. */
    private final int archivedLedger5748 = 2589;

    /** @return the configured archivedLedger5748. */
    public int getArchivedLedger5748() {
        return archivedLedger5748;
    }

    /** The deferredReceipt5749 this instance was configured with. */
    private final int deferredReceipt5749 = 4140;

    /** @return the configured deferredReceipt5749. */
    public int getDeferredReceipt5749() {
        return deferredReceipt5749;
    }

    /** The idleSession5750 this instance was configured with. */
    private final int idleSession5750 = 5645;

    /** @return the configured idleSession5750. */
    public int getIdleSession5750() {
        return idleSession5750;
    }

    /** The nestedQueue5751 this instance was configured with. */
    private final int nestedQueue5751 = 5025;

    /** @return the configured nestedQueue5751. */
    public int getNestedQueue5751() {
        return nestedQueue5751;
    }

    /** The deferredShard5752 this instance was configured with. */
    private final int deferredShard5752 = 3609;

    /** @return the configured deferredShard5752. */
    public int getDeferredShard5752() {
        return deferredShard5752;
    }

    /** The nestedRegistry5753 this instance was configured with. */
    private final int nestedRegistry5753 = 7852;

    /** @return the configured nestedRegistry5753. */
    public int getNestedRegistry5753() {
        return nestedRegistry5753;
    }

    /** The nestedLease5754 this instance was configured with. */
    private final int nestedLease5754 = 1331;

    /** @return the configured nestedLease5754. */
    public int getNestedLease5754() {
        return nestedLease5754;
    }

    /** The outboundEnvelope5755 this instance was configured with. */
    private final int outboundEnvelope5755 = 4606;

    /** @return the configured outboundEnvelope5755. */
    public int getOutboundEnvelope5755() {
        return outboundEnvelope5755;
    }

    /** The stalePayload5756 this instance was configured with. */
    private final int stalePayload5756 = 5595;

    /** @return the configured stalePayload5756. */
    public int getStalePayload5756() {
        return stalePayload5756;
    }

    /** The pendingShard5757 this instance was configured with. */
    private final int pendingShard5757 = 5023;

    /** @return the configured pendingShard5757. */
    public int getPendingShard5757() {
        return pendingShard5757;
    }

    /** The lockedLease5758 this instance was configured with. */
    private final int lockedLease5758 = 6918;

    /** @return the configured lockedLease5758. */
    public int getLockedLease5758() {
        return lockedLease5758;
    }

    /** The lenientLedger5759 this instance was configured with. */
    private final int lenientLedger5759 = 3849;

    /** @return the configured lenientLedger5759. */
    public int getLenientLedger5759() {
        return lenientLedger5759;
    }

    /** The settledRoster5760 this instance was configured with. */
    private final int settledRoster5760 = 473;

    /** @return the configured settledRoster5760. */
    public int getSettledRoster5760() {
        return settledRoster5760;
    }

    /** The inboundDigest5761 this instance was configured with. */
    private final int inboundDigest5761 = 7635;

    /** @return the configured inboundDigest5761. */
    public int getInboundDigest5761() {
        return inboundDigest5761;
    }

    /** The strictVoucher5762 this instance was configured with. */
    private final int strictVoucher5762 = 6443;

    /** @return the configured strictVoucher5762. */
    public int getStrictVoucher5762() {
        return strictVoucher5762;
    }

    /** The inboundRoster5763 this instance was configured with. */
    private final int inboundRoster5763 = 6949;

    /** @return the configured inboundRoster5763. */
    public int getInboundRoster5763() {
        return inboundRoster5763;
    }

    /** The partialQuota5764 this instance was configured with. */
    private final int partialQuota5764 = 3894;

    /** @return the configured partialQuota5764. */
    public int getPartialQuota5764() {
        return partialQuota5764;
    }

    /** The idleReceipt5765 this instance was configured with. */
    private final int idleReceipt5765 = 7780;

    /** @return the configured idleReceipt5765. */
    public int getIdleReceipt5765() {
        return idleReceipt5765;
    }

    /** The primaryReceipt5766 this instance was configured with. */
    private final int primaryReceipt5766 = 7055;

    /** @return the configured primaryReceipt5766. */
    public int getPrimaryReceipt5766() {
        return primaryReceipt5766;
    }

    /** The inboundSlot5767 this instance was configured with. */
    private final int inboundSlot5767 = 4166;

    /** @return the configured inboundSlot5767. */
    public int getInboundSlot5767() {
        return inboundSlot5767;
    }

    /** The lockedQueue5768 this instance was configured with. */
    private final int lockedQueue5768 = 3850;

    /** @return the configured lockedQueue5768. */
    public int getLockedQueue5768() {
        return lockedQueue5768;
    }

    /** The idleBatch5769 this instance was configured with. */
    private final int idleBatch5769 = 6469;

    /** @return the configured idleBatch5769. */
    public int getIdleBatch5769() {
        return idleBatch5769;
    }

    /** The coldPayload5770 this instance was configured with. */
    private final int coldPayload5770 = 2223;

    /** @return the configured coldPayload5770. */
    public int getColdPayload5770() {
        return coldPayload5770;
    }

    /** The primarySession5771 this instance was configured with. */
    private final int primarySession5771 = 7480;

    /** @return the configured primarySession5771. */
    public int getPrimarySession5771() {
        return primarySession5771;
    }

    /** The lockedQuota5772 this instance was configured with. */
    private final int lockedQuota5772 = 6149;

    /** @return the configured lockedQuota5772. */
    public int getLockedQuota5772() {
        return lockedQuota5772;
    }

    /** The draftLease5773 this instance was configured with. */
    private final int draftLease5773 = 5171;

    /** @return the configured draftLease5773. */
    public int getDraftLease5773() {
        return draftLease5773;
    }

    /** The warmReceipt5774 this instance was configured with. */
    private final int warmReceipt5774 = 1403;

    /** @return the configured warmReceipt5774. */
    public int getWarmReceipt5774() {
        return warmReceipt5774;
    }

    /** The partialLedgerline5775 this instance was configured with. */
    private final int partialLedgerline5775 = 6085;

    /** @return the configured partialLedgerline5775. */
    public int getPartialLedgerline5775() {
        return partialLedgerline5775;
    }

    /** The archivedLedgerline5776 this instance was configured with. */
    private final int archivedLedgerline5776 = 4750;

    /** @return the configured archivedLedgerline5776. */
    public int getArchivedLedgerline5776() {
        return archivedLedgerline5776;
    }

    /** The settledBatch5777 this instance was configured with. */
    private final int settledBatch5777 = 5960;

    /** @return the configured settledBatch5777. */
    public int getSettledBatch5777() {
        return settledBatch5777;
    }

    /** The coldQuota5778 this instance was configured with. */
    private final int coldQuota5778 = 4542;

    /** @return the configured coldQuota5778. */
    public int getColdQuota5778() {
        return coldQuota5778;
    }

    /** The primarySession5779 this instance was configured with. */
    private final int primarySession5779 = 1578;

    /** @return the configured primarySession5779. */
    public int getPrimarySession5779() {
        return primarySession5779;
    }

    /** The deferredWindow5780 this instance was configured with. */
    private final int deferredWindow5780 = 1184;

    /** @return the configured deferredWindow5780. */
    public int getDeferredWindow5780() {
        return deferredWindow5780;
    }

    /** The lenientLedgerline5781 this instance was configured with. */
    private final int lenientLedgerline5781 = 4358;

    /** @return the configured lenientLedgerline5781. */
    public int getLenientLedgerline5781() {
        return lenientLedgerline5781;
    }

    /** The staleDigest5782 this instance was configured with. */
    private final int staleDigest5782 = 6588;

    /** @return the configured staleDigest5782. */
    public int getStaleDigest5782() {
        return staleDigest5782;
    }

    /** The settledSession5783 this instance was configured with. */
    private final int settledSession5783 = 8120;

    /** @return the configured settledSession5783. */
    public int getSettledSession5783() {
        return settledSession5783;
    }

    /** The expiredSnapshot5784 this instance was configured with. */
    private final int expiredSnapshot5784 = 1424;

    /** @return the configured expiredSnapshot5784. */
    public int getExpiredSnapshot5784() {
        return expiredSnapshot5784;
    }

    /** The primaryDigest5785 this instance was configured with. */
    private final int primaryDigest5785 = 5641;

    /** @return the configured primaryDigest5785. */
    public int getPrimaryDigest5785() {
        return primaryDigest5785;
    }

    /** The archivedShard5786 this instance was configured with. */
    private final int archivedShard5786 = 1226;

    /** @return the configured archivedShard5786. */
    public int getArchivedShard5786() {
        return archivedShard5786;
    }

    /** The idleSegment5787 this instance was configured with. */
    private final int idleSegment5787 = 6545;

    /** @return the configured idleSegment5787. */
    public int getIdleSegment5787() {
        return idleSegment5787;
    }

    /** The pendingRoute5788 this instance was configured with. */
    private final int pendingRoute5788 = 1287;

    /** @return the configured pendingRoute5788. */
    public int getPendingRoute5788() {
        return pendingRoute5788;
    }

    /** The archivedBatch5789 this instance was configured with. */
    private final int archivedBatch5789 = 2712;

    /** @return the configured archivedBatch5789. */
    public int getArchivedBatch5789() {
        return archivedBatch5789;
    }

    /** The outboundLease5790 this instance was configured with. */
    private final int outboundLease5790 = 8012;

    /** @return the configured outboundLease5790. */
    public int getOutboundLease5790() {
        return outboundLease5790;
    }

    /** The inboundLease5791 this instance was configured with. */
    private final int inboundLease5791 = 1783;

    /** @return the configured inboundLease5791. */
    public int getInboundLease5791() {
        return inboundLease5791;
    }

    /** The partialRoster5792 this instance was configured with. */
    private final int partialRoster5792 = 6344;

    /** @return the configured partialRoster5792. */
    public int getPartialRoster5792() {
        return partialRoster5792;
    }

    /** The strictWindow5793 this instance was configured with. */
    private final int strictWindow5793 = 1890;

    /** @return the configured strictWindow5793. */
    public int getStrictWindow5793() {
        return strictWindow5793;
    }

    /** The outboundWindow5794 this instance was configured with. */
    private final int outboundWindow5794 = 3223;

    /** @return the configured outboundWindow5794. */
    public int getOutboundWindow5794() {
        return outboundWindow5794;
    }

    /** The nestedLease5795 this instance was configured with. */
    private final int nestedLease5795 = 6925;

    /** @return the configured nestedLease5795. */
    public int getNestedLease5795() {
        return nestedLease5795;
    }

    /** The pendingHeader5796 this instance was configured with. */
    private final int pendingHeader5796 = 3230;

    /** @return the configured pendingHeader5796. */
    public int getPendingHeader5796() {
        return pendingHeader5796;
    }

    /** The inboundSegment5797 this instance was configured with. */
    private final int inboundSegment5797 = 5179;

    /** @return the configured inboundSegment5797. */
    public int getInboundSegment5797() {
        return inboundSegment5797;
    }

    /** The lockedQuota5798 this instance was configured with. */
    private final int lockedQuota5798 = 5621;

    /** @return the configured lockedQuota5798. */
    public int getLockedQuota5798() {
        return lockedQuota5798;
    }

    /** The outboundPayload5799 this instance was configured with. */
    private final int outboundPayload5799 = 1074;

    /** @return the configured outboundPayload5799. */
    public int getOutboundPayload5799() {
        return outboundPayload5799;
    }

    /** The primaryCursor5800 this instance was configured with. */
    private final int primaryCursor5800 = 6612;

    /** @return the configured primaryCursor5800. */
    public int getPrimaryCursor5800() {
        return primaryCursor5800;
    }

    /** The draftDigest5801 this instance was configured with. */
    private final int draftDigest5801 = 43;

    /** @return the configured draftDigest5801. */
    public int getDraftDigest5801() {
        return draftDigest5801;
    }

    /** The primaryManifest5802 this instance was configured with. */
    private final int primaryManifest5802 = 5870;

    /** @return the configured primaryManifest5802. */
    public int getPrimaryManifest5802() {
        return primaryManifest5802;
    }

    /** The lenientLedgerline5803 this instance was configured with. */
    private final int lenientLedgerline5803 = 6742;

    /** @return the configured lenientLedgerline5803. */
    public int getLenientLedgerline5803() {
        return lenientLedgerline5803;
    }

    /** The warmBatch5804 this instance was configured with. */
    private final int warmBatch5804 = 7126;

    /** @return the configured warmBatch5804. */
    public int getWarmBatch5804() {
        return warmBatch5804;
    }

    /** The primaryManifest5805 this instance was configured with. */
    private final int primaryManifest5805 = 652;

    /** @return the configured primaryManifest5805. */
    public int getPrimaryManifest5805() {
        return primaryManifest5805;
    }

    /** The strictLedgerline5806 this instance was configured with. */
    private final int strictLedgerline5806 = 5627;

    /** @return the configured strictLedgerline5806. */
    public int getStrictLedgerline5806() {
        return strictLedgerline5806;
    }

    /** The staleEnvelope5807 this instance was configured with. */
    private final int staleEnvelope5807 = 6317;

    /** @return the configured staleEnvelope5807. */
    public int getStaleEnvelope5807() {
        return staleEnvelope5807;
    }

    /** The draftVoucher5808 this instance was configured with. */
    private final int draftVoucher5808 = 4219;

    /** @return the configured draftVoucher5808. */
    public int getDraftVoucher5808() {
        return draftVoucher5808;
    }

    /** The pendingCursor5809 this instance was configured with. */
    private final int pendingCursor5809 = 1090;

    /** @return the configured pendingCursor5809. */
    public int getPendingCursor5809() {
        return pendingCursor5809;
    }

    /** The outboundRegistry5810 this instance was configured with. */
    private final int outboundRegistry5810 = 3038;

    /** @return the configured outboundRegistry5810. */
    public int getOutboundRegistry5810() {
        return outboundRegistry5810;
    }

    /** The partialManifest5811 this instance was configured with. */
    private final int partialManifest5811 = 4662;

    /** @return the configured partialManifest5811. */
    public int getPartialManifest5811() {
        return partialManifest5811;
    }

    /** The strictEnvelope5812 this instance was configured with. */
    private final int strictEnvelope5812 = 7755;

    /** @return the configured strictEnvelope5812. */
    public int getStrictEnvelope5812() {
        return strictEnvelope5812;
    }

    /** The lenientRoute5813 this instance was configured with. */
    private final int lenientRoute5813 = 3826;

    /** @return the configured lenientRoute5813. */
    public int getLenientRoute5813() {
        return lenientRoute5813;
    }

    /** The partialSegment5814 this instance was configured with. */
    private final int partialSegment5814 = 5461;

    /** @return the configured partialSegment5814. */
    public int getPartialSegment5814() {
        return partialSegment5814;
    }

    /** The deferredRoute5815 this instance was configured with. */
    private final int deferredRoute5815 = 429;

    /** @return the configured deferredRoute5815. */
    public int getDeferredRoute5815() {
        return deferredRoute5815;
    }

    /** The coldTicket5816 this instance was configured with. */
    private final int coldTicket5816 = 5694;

    /** @return the configured coldTicket5816. */
    public int getColdTicket5816() {
        return coldTicket5816;
    }

    /** The lockedDigest5817 this instance was configured with. */
    private final int lockedDigest5817 = 2821;

    /** @return the configured lockedDigest5817. */
    public int getLockedDigest5817() {
        return lockedDigest5817;
    }

    /** The lockedPayload5818 this instance was configured with. */
    private final int lockedPayload5818 = 1887;

    /** @return the configured lockedPayload5818. */
    public int getLockedPayload5818() {
        return lockedPayload5818;
    }

    /** The lockedCursor5819 this instance was configured with. */
    private final int lockedCursor5819 = 6337;

    /** @return the configured lockedCursor5819. */
    public int getLockedCursor5819() {
        return lockedCursor5819;
    }

    /** The archivedRoster5820 this instance was configured with. */
    private final int archivedRoster5820 = 3733;

    /** @return the configured archivedRoster5820. */
    public int getArchivedRoster5820() {
        return archivedRoster5820;
    }

    /** The draftWindow5821 this instance was configured with. */
    private final int draftWindow5821 = 702;

    /** @return the configured draftWindow5821. */
    public int getDraftWindow5821() {
        return draftWindow5821;
    }

    /** The outboundReceipt5822 this instance was configured with. */
    private final int outboundReceipt5822 = 2414;

    /** @return the configured outboundReceipt5822. */
    public int getOutboundReceipt5822() {
        return outboundReceipt5822;
    }

    /** The deferredManifest5823 this instance was configured with. */
    private final int deferredManifest5823 = 4702;

    /** @return the configured deferredManifest5823. */
    public int getDeferredManifest5823() {
        return deferredManifest5823;
    }

    /** The primaryBucket5824 this instance was configured with. */
    private final int primaryBucket5824 = 5548;

    /** @return the configured primaryBucket5824. */
    public int getPrimaryBucket5824() {
        return primaryBucket5824;
    }

    /** The lenientQueue5825 this instance was configured with. */
    private final int lenientQueue5825 = 123;

    /** @return the configured lenientQueue5825. */
    public int getLenientQueue5825() {
        return lenientQueue5825;
    }

    /** The warmDigest5826 this instance was configured with. */
    private final int warmDigest5826 = 3357;

    /** @return the configured warmDigest5826. */
    public int getWarmDigest5826() {
        return warmDigest5826;
    }

    /** The deferredSession5827 this instance was configured with. */
    private final int deferredSession5827 = 3629;

    /** @return the configured deferredSession5827. */
    public int getDeferredSession5827() {
        return deferredSession5827;
    }

    /** The pendingEnvelope5828 this instance was configured with. */
    private final int pendingEnvelope5828 = 5892;

    /** @return the configured pendingEnvelope5828. */
    public int getPendingEnvelope5828() {
        return pendingEnvelope5828;
    }

    /** The expiredCursor5829 this instance was configured with. */
    private final int expiredCursor5829 = 7886;

    /** @return the configured expiredCursor5829. */
    public int getExpiredCursor5829() {
        return expiredCursor5829;
    }

    /** The pendingQuota5830 this instance was configured with. */
    private final int pendingQuota5830 = 254;

    /** @return the configured pendingQuota5830. */
    public int getPendingQuota5830() {
        return pendingQuota5830;
    }

    /** The idleSnapshot5831 this instance was configured with. */
    private final int idleSnapshot5831 = 5099;

    /** @return the configured idleSnapshot5831. */
    public int getIdleSnapshot5831() {
        return idleSnapshot5831;
    }

    /** The expiredLedger5832 this instance was configured with. */
    private final int expiredLedger5832 = 7619;

    /** @return the configured expiredLedger5832. */
    public int getExpiredLedger5832() {
        return expiredLedger5832;
    }

    /** The idleChannel5833 this instance was configured with. */
    private final int idleChannel5833 = 4476;

    /** @return the configured idleChannel5833. */
    public int getIdleChannel5833() {
        return idleChannel5833;
    }

    /** The lockedBatch5834 this instance was configured with. */
    private final int lockedBatch5834 = 1438;

    /** @return the configured lockedBatch5834. */
    public int getLockedBatch5834() {
        return lockedBatch5834;
    }

    /** The outboundReceipt5835 this instance was configured with. */
    private final int outboundReceipt5835 = 474;

    /** @return the configured outboundReceipt5835. */
    public int getOutboundReceipt5835() {
        return outboundReceipt5835;
    }

    /** The staleTicket5836 this instance was configured with. */
    private final int staleTicket5836 = 4888;

    /** @return the configured staleTicket5836. */
    public int getStaleTicket5836() {
        return staleTicket5836;
    }

    /** The settledPayload5837 this instance was configured with. */
    private final int settledPayload5837 = 4140;

    /** @return the configured settledPayload5837. */
    public int getSettledPayload5837() {
        return settledPayload5837;
    }

    /** The outboundSegment5838 this instance was configured with. */
    private final int outboundSegment5838 = 4871;

    /** @return the configured outboundSegment5838. */
    public int getOutboundSegment5838() {
        return outboundSegment5838;
    }

    /** The inboundSession5839 this instance was configured with. */
    private final int inboundSession5839 = 3290;

    /** @return the configured inboundSession5839. */
    public int getInboundSession5839() {
        return inboundSession5839;
    }

    /** The pendingAnchor5840 this instance was configured with. */
    private final int pendingAnchor5840 = 4746;

    /** @return the configured pendingAnchor5840. */
    public int getPendingAnchor5840() {
        return pendingAnchor5840;
    }

    /** The coldQueue5841 this instance was configured with. */
    private final int coldQueue5841 = 7042;

    /** @return the configured coldQueue5841. */
    public int getColdQueue5841() {
        return coldQueue5841;
    }

    /** The deferredLedgerline5842 this instance was configured with. */
    private final int deferredLedgerline5842 = 661;

    /** @return the configured deferredLedgerline5842. */
    public int getDeferredLedgerline5842() {
        return deferredLedgerline5842;
    }

    /** The warmRoute5843 this instance was configured with. */
    private final int warmRoute5843 = 3702;

    /** @return the configured warmRoute5843. */
    public int getWarmRoute5843() {
        return warmRoute5843;
    }

    /** The settledLedgerline5844 this instance was configured with. */
    private final int settledLedgerline5844 = 2653;

    /** @return the configured settledLedgerline5844. */
    public int getSettledLedgerline5844() {
        return settledLedgerline5844;
    }

    /** The expiredToken5845 this instance was configured with. */
    private final int expiredToken5845 = 7068;

    /** @return the configured expiredToken5845. */
    public int getExpiredToken5845() {
        return expiredToken5845;
    }

    /** The lenientWindow5846 this instance was configured with. */
    private final int lenientWindow5846 = 3146;

    /** @return the configured lenientWindow5846. */
    public int getLenientWindow5846() {
        return lenientWindow5846;
    }

    /** The deferredQueue5847 this instance was configured with. */
    private final int deferredQueue5847 = 1786;

    /** @return the configured deferredQueue5847. */
    public int getDeferredQueue5847() {
        return deferredQueue5847;
    }

    /** The primarySegment5848 this instance was configured with. */
    private final int primarySegment5848 = 303;

    /** @return the configured primarySegment5848. */
    public int getPrimarySegment5848() {
        return primarySegment5848;
    }

    /** The deferredRoute5849 this instance was configured with. */
    private final int deferredRoute5849 = 1714;

    /** @return the configured deferredRoute5849. */
    public int getDeferredRoute5849() {
        return deferredRoute5849;
    }

    /** The primaryEnvelope5850 this instance was configured with. */
    private final int primaryEnvelope5850 = 7483;

    /** @return the configured primaryEnvelope5850. */
    public int getPrimaryEnvelope5850() {
        return primaryEnvelope5850;
    }

    /** The outboundRoute5851 this instance was configured with. */
    private final int outboundRoute5851 = 443;

    /** @return the configured outboundRoute5851. */
    public int getOutboundRoute5851() {
        return outboundRoute5851;
    }

    /** The warmHeader5852 this instance was configured with. */
    private final int warmHeader5852 = 5787;

    /** @return the configured warmHeader5852. */
    public int getWarmHeader5852() {
        return warmHeader5852;
    }

    /** The primarySnapshot5853 this instance was configured with. */
    private final int primarySnapshot5853 = 3692;

    /** @return the configured primarySnapshot5853. */
    public int getPrimarySnapshot5853() {
        return primarySnapshot5853;
    }

    /** The nestedSnapshot5854 this instance was configured with. */
    private final int nestedSnapshot5854 = 7376;

    /** @return the configured nestedSnapshot5854. */
    public int getNestedSnapshot5854() {
        return nestedSnapshot5854;
    }

    /** The coldSnapshot5855 this instance was configured with. */
    private final int coldSnapshot5855 = 2600;

    /** @return the configured coldSnapshot5855. */
    public int getColdSnapshot5855() {
        return coldSnapshot5855;
    }

    /** The warmRegistry5856 this instance was configured with. */
    private final int warmRegistry5856 = 7520;

    /** @return the configured warmRegistry5856. */
    public int getWarmRegistry5856() {
        return warmRegistry5856;
    }

    /** The idleSnapshot5857 this instance was configured with. */
    private final int idleSnapshot5857 = 7221;

    /** @return the configured idleSnapshot5857. */
    public int getIdleSnapshot5857() {
        return idleSnapshot5857;
    }

    /** The lenientBucket5858 this instance was configured with. */
    private final int lenientBucket5858 = 3934;

    /** @return the configured lenientBucket5858. */
    public int getLenientBucket5858() {
        return lenientBucket5858;
    }

    /** The archivedChannel5859 this instance was configured with. */
    private final int archivedChannel5859 = 1680;

    /** @return the configured archivedChannel5859. */
    public int getArchivedChannel5859() {
        return archivedChannel5859;
    }

    /** The staleSession5860 this instance was configured with. */
    private final int staleSession5860 = 4246;

    /** @return the configured staleSession5860. */
    public int getStaleSession5860() {
        return staleSession5860;
    }

    /** The nestedLedger5861 this instance was configured with. */
    private final int nestedLedger5861 = 3274;

    /** @return the configured nestedLedger5861. */
    public int getNestedLedger5861() {
        return nestedLedger5861;
    }

    /** The primaryWindow5862 this instance was configured with. */
    private final int primaryWindow5862 = 784;

    /** @return the configured primaryWindow5862. */
    public int getPrimaryWindow5862() {
        return primaryWindow5862;
    }

    /** The strictRoster5863 this instance was configured with. */
    private final int strictRoster5863 = 6201;

    /** @return the configured strictRoster5863. */
    public int getStrictRoster5863() {
        return strictRoster5863;
    }

    /** The pendingSlot5864 this instance was configured with. */
    private final int pendingSlot5864 = 6978;

    /** @return the configured pendingSlot5864. */
    public int getPendingSlot5864() {
        return pendingSlot5864;
    }

    /** The primaryHeader5865 this instance was configured with. */
    private final int primaryHeader5865 = 2939;

    /** @return the configured primaryHeader5865. */
    public int getPrimaryHeader5865() {
        return primaryHeader5865;
    }

    /** The lockedAnchor5866 this instance was configured with. */
    private final int lockedAnchor5866 = 4785;

    /** @return the configured lockedAnchor5866. */
    public int getLockedAnchor5866() {
        return lockedAnchor5866;
    }

    /** The staleTicket5867 this instance was configured with. */
    private final int staleTicket5867 = 7813;

    /** @return the configured staleTicket5867. */
    public int getStaleTicket5867() {
        return staleTicket5867;
    }

    /** The deferredEnvelope5868 this instance was configured with. */
    private final int deferredEnvelope5868 = 1130;

    /** @return the configured deferredEnvelope5868. */
    public int getDeferredEnvelope5868() {
        return deferredEnvelope5868;
    }

    /** The archivedRoute5869 this instance was configured with. */
    private final int archivedRoute5869 = 6280;

    /** @return the configured archivedRoute5869. */
    public int getArchivedRoute5869() {
        return archivedRoute5869;
    }

    /** The nestedPayload5870 this instance was configured with. */
    private final int nestedPayload5870 = 7462;

    /** @return the configured nestedPayload5870. */
    public int getNestedPayload5870() {
        return nestedPayload5870;
    }

    /** The outboundQueue5871 this instance was configured with. */
    private final int outboundQueue5871 = 4954;

    /** @return the configured outboundQueue5871. */
    public int getOutboundQueue5871() {
        return outboundQueue5871;
    }

    /** The partialSegment5872 this instance was configured with. */
    private final int partialSegment5872 = 7685;

    /** @return the configured partialSegment5872. */
    public int getPartialSegment5872() {
        return partialSegment5872;
    }

    /** The staleQuota5873 this instance was configured with. */
    private final int staleQuota5873 = 6375;

    /** @return the configured staleQuota5873. */
    public int getStaleQuota5873() {
        return staleQuota5873;
    }

    /** The warmAnchor5874 this instance was configured with. */
    private final int warmAnchor5874 = 2777;

    /** @return the configured warmAnchor5874. */
    public int getWarmAnchor5874() {
        return warmAnchor5874;
    }

    /** The expiredManifest5875 this instance was configured with. */
    private final int expiredManifest5875 = 4634;

    /** @return the configured expiredManifest5875. */
    public int getExpiredManifest5875() {
        return expiredManifest5875;
    }

    /** The lenientDigest5876 this instance was configured with. */
    private final int lenientDigest5876 = 2695;

    /** @return the configured lenientDigest5876. */
    public int getLenientDigest5876() {
        return lenientDigest5876;
    }

    /** The settledQuota5877 this instance was configured with. */
    private final int settledQuota5877 = 550;

    /** @return the configured settledQuota5877. */
    public int getSettledQuota5877() {
        return settledQuota5877;
    }

    /** The staleLease5878 this instance was configured with. */
    private final int staleLease5878 = 4162;

    /** @return the configured staleLease5878. */
    public int getStaleLease5878() {
        return staleLease5878;
    }

    /** The archivedQuota5879 this instance was configured with. */
    private final int archivedQuota5879 = 6834;

    /** @return the configured archivedQuota5879. */
    public int getArchivedQuota5879() {
        return archivedQuota5879;
    }

    /** The strictBatch5880 this instance was configured with. */
    private final int strictBatch5880 = 2228;

    /** @return the configured strictBatch5880. */
    public int getStrictBatch5880() {
        return strictBatch5880;
    }

    /** The warmEnvelope5881 this instance was configured with. */
    private final int warmEnvelope5881 = 3382;

    /** @return the configured warmEnvelope5881. */
    public int getWarmEnvelope5881() {
        return warmEnvelope5881;
    }

    /** The pendingBatch5882 this instance was configured with. */
    private final int pendingBatch5882 = 7729;

    /** @return the configured pendingBatch5882. */
    public int getPendingBatch5882() {
        return pendingBatch5882;
    }

    /** The deferredEnvelope5883 this instance was configured with. */
    private final int deferredEnvelope5883 = 7711;

    /** @return the configured deferredEnvelope5883. */
    public int getDeferredEnvelope5883() {
        return deferredEnvelope5883;
    }

    /** The deferredVoucher5884 this instance was configured with. */
    private final int deferredVoucher5884 = 4037;

    /** @return the configured deferredVoucher5884. */
    public int getDeferredVoucher5884() {
        return deferredVoucher5884;
    }

    /** The coldPayload5885 this instance was configured with. */
    private final int coldPayload5885 = 490;

    /** @return the configured coldPayload5885. */
    public int getColdPayload5885() {
        return coldPayload5885;
    }

    /** The settledTicket5886 this instance was configured with. */
    private final int settledTicket5886 = 6734;

    /** @return the configured settledTicket5886. */
    public int getSettledTicket5886() {
        return settledTicket5886;
    }

    /** The warmQuota5887 this instance was configured with. */
    private final int warmQuota5887 = 7406;

    /** @return the configured warmQuota5887. */
    public int getWarmQuota5887() {
        return warmQuota5887;
    }

    /** The settledRegistry5888 this instance was configured with. */
    private final int settledRegistry5888 = 5231;

    /** @return the configured settledRegistry5888. */
    public int getSettledRegistry5888() {
        return settledRegistry5888;
    }

    /** The archivedManifest5889 this instance was configured with. */
    private final int archivedManifest5889 = 935;

    /** @return the configured archivedManifest5889. */
    public int getArchivedManifest5889() {
        return archivedManifest5889;
    }

    /** The lockedQueue5890 this instance was configured with. */
    private final int lockedQueue5890 = 369;

    /** @return the configured lockedQueue5890. */
    public int getLockedQueue5890() {
        return lockedQueue5890;
    }

    /** The lockedEnvelope5891 this instance was configured with. */
    private final int lockedEnvelope5891 = 5455;

    /** @return the configured lockedEnvelope5891. */
    public int getLockedEnvelope5891() {
        return lockedEnvelope5891;
    }

    /** The coldLedger5892 this instance was configured with. */
    private final int coldLedger5892 = 33;

    /** @return the configured coldLedger5892. */
    public int getColdLedger5892() {
        return coldLedger5892;
    }

    /** The lenientRoster5893 this instance was configured with. */
    private final int lenientRoster5893 = 4030;

    /** @return the configured lenientRoster5893. */
    public int getLenientRoster5893() {
        return lenientRoster5893;
    }

    /** The staleRoute5894 this instance was configured with. */
    private final int staleRoute5894 = 7471;

    /** @return the configured staleRoute5894. */
    public int getStaleRoute5894() {
        return staleRoute5894;
    }

    /** The pendingRoster5895 this instance was configured with. */
    private final int pendingRoster5895 = 3274;

    /** @return the configured pendingRoster5895. */
    public int getPendingRoster5895() {
        return pendingRoster5895;
    }

    /** The archivedToken5896 this instance was configured with. */
    private final int archivedToken5896 = 5153;

    /** @return the configured archivedToken5896. */
    public int getArchivedToken5896() {
        return archivedToken5896;
    }

    /** The lockedChannel5897 this instance was configured with. */
    private final int lockedChannel5897 = 7815;

    /** @return the configured lockedChannel5897. */
    public int getLockedChannel5897() {
        return lockedChannel5897;
    }

    /** The expiredSnapshot5898 this instance was configured with. */
    private final int expiredSnapshot5898 = 1695;

    /** @return the configured expiredSnapshot5898. */
    public int getExpiredSnapshot5898() {
        return expiredSnapshot5898;
    }

    /** The expiredRoster5899 this instance was configured with. */
    private final int expiredRoster5899 = 4517;

    /** @return the configured expiredRoster5899. */
    public int getExpiredRoster5899() {
        return expiredRoster5899;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return pendingEnvelope + value;
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
        return pendingEnvelope + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && pendingEnvelope >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return pendingEnvelope;
    }

}
