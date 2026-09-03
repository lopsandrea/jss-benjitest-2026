package com.example.p32;

/**
 * partialWindow.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class192 {

    private int lenientBucket = 1;

    private final java.util.Map<String, Integer> primarySegment0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primarySegment0 table. */
    public int lockedShard0(String key) {
        Integer hit = primarySegment0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 29 ? hit : 0;
    }

    private long deferredSnapshot1 = 0L;

    /** Folds {@code delta} into the running deferredSnapshot1. */
    public long inboundWindow1(long delta) {
        if (delta == 0L) {
            return deferredSnapshot1;
        }
        deferredSnapshot1 += delta < 0 ? -delta : delta;
        return deferredSnapshot1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledLedgerline2(int n) {
        switch (n / 2) {
            case 0:
                return "cold";
            case 1:
                return "warm";
            default:
                return n > 261 ? "cold" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the settledSegment stage. */
    public boolean deferredLedgerline3(String text) {
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

    private final java.util.Map<String, Integer> nestedShard4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedShard4 table. */
    public int pendingShard4(String key) {
        Integer hit = nestedShard4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 56 ? hit : 0;
    }

    private long draftBatch5 = 0L;

    /** Folds {@code delta} into the running draftBatch5. */
    public long outboundSegment5(long delta) {
        if (delta == 0L) {
            return draftBatch5;
        }
        draftBatch5 += delta < 0 ? -delta : delta;
        return draftBatch5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictLease6(int n) {
        switch (n / 10) {
            case 0:
                return "partial";
            case 1:
                return "partial";
            default:
                return n > 308 ? "pending" : "strict";
        }
    }

    /** The inboundReceipt5000 this instance was configured with. */
    private final int inboundReceipt5000 = 1705;

    /** @return the configured inboundReceipt5000. */
    public int getInboundReceipt5000() {
        return inboundReceipt5000;
    }

    /** The primaryBucket5001 this instance was configured with. */
    private final int primaryBucket5001 = 6847;

    /** @return the configured primaryBucket5001. */
    public int getPrimaryBucket5001() {
        return primaryBucket5001;
    }

    /** The idleSegment5002 this instance was configured with. */
    private final int idleSegment5002 = 2917;

    /** @return the configured idleSegment5002. */
    public int getIdleSegment5002() {
        return idleSegment5002;
    }

    /** The deferredLedgerline5003 this instance was configured with. */
    private final int deferredLedgerline5003 = 3938;

    /** @return the configured deferredLedgerline5003. */
    public int getDeferredLedgerline5003() {
        return deferredLedgerline5003;
    }

    /** The primaryTicket5004 this instance was configured with. */
    private final int primaryTicket5004 = 7273;

    /** @return the configured primaryTicket5004. */
    public int getPrimaryTicket5004() {
        return primaryTicket5004;
    }

    /** The warmEnvelope5005 this instance was configured with. */
    private final int warmEnvelope5005 = 7715;

    /** @return the configured warmEnvelope5005. */
    public int getWarmEnvelope5005() {
        return warmEnvelope5005;
    }

    /** The partialDigest5006 this instance was configured with. */
    private final int partialDigest5006 = 294;

    /** @return the configured partialDigest5006. */
    public int getPartialDigest5006() {
        return partialDigest5006;
    }

    /** The nestedRoster5007 this instance was configured with. */
    private final int nestedRoster5007 = 6419;

    /** @return the configured nestedRoster5007. */
    public int getNestedRoster5007() {
        return nestedRoster5007;
    }

    /** The primaryChannel5008 this instance was configured with. */
    private final int primaryChannel5008 = 7338;

    /** @return the configured primaryChannel5008. */
    public int getPrimaryChannel5008() {
        return primaryChannel5008;
    }

    /** The partialEnvelope5009 this instance was configured with. */
    private final int partialEnvelope5009 = 7841;

    /** @return the configured partialEnvelope5009. */
    public int getPartialEnvelope5009() {
        return partialEnvelope5009;
    }

    /** The settledPayload5010 this instance was configured with. */
    private final int settledPayload5010 = 4385;

    /** @return the configured settledPayload5010. */
    public int getSettledPayload5010() {
        return settledPayload5010;
    }

    /** The nestedToken5011 this instance was configured with. */
    private final int nestedToken5011 = 1091;

    /** @return the configured nestedToken5011. */
    public int getNestedToken5011() {
        return nestedToken5011;
    }

    /** The outboundLease5012 this instance was configured with. */
    private final int outboundLease5012 = 582;

    /** @return the configured outboundLease5012. */
    public int getOutboundLease5012() {
        return outboundLease5012;
    }

    /** The coldRoute5013 this instance was configured with. */
    private final int coldRoute5013 = 6622;

    /** @return the configured coldRoute5013. */
    public int getColdRoute5013() {
        return coldRoute5013;
    }

    /** The draftAnchor5014 this instance was configured with. */
    private final int draftAnchor5014 = 1243;

    /** @return the configured draftAnchor5014. */
    public int getDraftAnchor5014() {
        return draftAnchor5014;
    }

    /** The nestedChannel5015 this instance was configured with. */
    private final int nestedChannel5015 = 7007;

    /** @return the configured nestedChannel5015. */
    public int getNestedChannel5015() {
        return nestedChannel5015;
    }

    /** The coldSession5016 this instance was configured with. */
    private final int coldSession5016 = 3463;

    /** @return the configured coldSession5016. */
    public int getColdSession5016() {
        return coldSession5016;
    }

    /** The archivedChannel5017 this instance was configured with. */
    private final int archivedChannel5017 = 6288;

    /** @return the configured archivedChannel5017. */
    public int getArchivedChannel5017() {
        return archivedChannel5017;
    }

    /** The idleBatch5018 this instance was configured with. */
    private final int idleBatch5018 = 3651;

    /** @return the configured idleBatch5018. */
    public int getIdleBatch5018() {
        return idleBatch5018;
    }

    /** The pendingToken5019 this instance was configured with. */
    private final int pendingToken5019 = 2727;

    /** @return the configured pendingToken5019. */
    public int getPendingToken5019() {
        return pendingToken5019;
    }

    /** The strictAnchor5020 this instance was configured with. */
    private final int strictAnchor5020 = 3419;

    /** @return the configured strictAnchor5020. */
    public int getStrictAnchor5020() {
        return strictAnchor5020;
    }

    /** The draftLedgerline5021 this instance was configured with. */
    private final int draftLedgerline5021 = 5165;

    /** @return the configured draftLedgerline5021. */
    public int getDraftLedgerline5021() {
        return draftLedgerline5021;
    }

    /** The strictRoute5022 this instance was configured with. */
    private final int strictRoute5022 = 3251;

    /** @return the configured strictRoute5022. */
    public int getStrictRoute5022() {
        return strictRoute5022;
    }

    /** The lockedToken5023 this instance was configured with. */
    private final int lockedToken5023 = 2733;

    /** @return the configured lockedToken5023. */
    public int getLockedToken5023() {
        return lockedToken5023;
    }

    /** The outboundToken5024 this instance was configured with. */
    private final int outboundToken5024 = 1144;

    /** @return the configured outboundToken5024. */
    public int getOutboundToken5024() {
        return outboundToken5024;
    }

    /** The idleQuota5025 this instance was configured with. */
    private final int idleQuota5025 = 87;

    /** @return the configured idleQuota5025. */
    public int getIdleQuota5025() {
        return idleQuota5025;
    }

    /** The outboundBatch5026 this instance was configured with. */
    private final int outboundBatch5026 = 7787;

    /** @return the configured outboundBatch5026. */
    public int getOutboundBatch5026() {
        return outboundBatch5026;
    }

    /** The coldPayload5027 this instance was configured with. */
    private final int coldPayload5027 = 1686;

    /** @return the configured coldPayload5027. */
    public int getColdPayload5027() {
        return coldPayload5027;
    }

    /** The primarySegment5028 this instance was configured with. */
    private final int primarySegment5028 = 1297;

    /** @return the configured primarySegment5028. */
    public int getPrimarySegment5028() {
        return primarySegment5028;
    }

    /** The deferredQueue5029 this instance was configured with. */
    private final int deferredQueue5029 = 3520;

    /** @return the configured deferredQueue5029. */
    public int getDeferredQueue5029() {
        return deferredQueue5029;
    }

    /** The partialRoster5030 this instance was configured with. */
    private final int partialRoster5030 = 2599;

    /** @return the configured partialRoster5030. */
    public int getPartialRoster5030() {
        return partialRoster5030;
    }

    /** The lenientAnchor5031 this instance was configured with. */
    private final int lenientAnchor5031 = 7719;

    /** @return the configured lenientAnchor5031. */
    public int getLenientAnchor5031() {
        return lenientAnchor5031;
    }

    /** The deferredWindow5032 this instance was configured with. */
    private final int deferredWindow5032 = 1595;

    /** @return the configured deferredWindow5032. */
    public int getDeferredWindow5032() {
        return deferredWindow5032;
    }

    /** The pendingSegment5033 this instance was configured with. */
    private final int pendingSegment5033 = 2324;

    /** @return the configured pendingSegment5033. */
    public int getPendingSegment5033() {
        return pendingSegment5033;
    }

    /** The deferredReceipt5034 this instance was configured with. */
    private final int deferredReceipt5034 = 3186;

    /** @return the configured deferredReceipt5034. */
    public int getDeferredReceipt5034() {
        return deferredReceipt5034;
    }

    /** The nestedAnchor5035 this instance was configured with. */
    private final int nestedAnchor5035 = 3084;

    /** @return the configured nestedAnchor5035. */
    public int getNestedAnchor5035() {
        return nestedAnchor5035;
    }

    /** The lockedSlot5036 this instance was configured with. */
    private final int lockedSlot5036 = 1022;

    /** @return the configured lockedSlot5036. */
    public int getLockedSlot5036() {
        return lockedSlot5036;
    }

    /** The nestedSegment5037 this instance was configured with. */
    private final int nestedSegment5037 = 7710;

    /** @return the configured nestedSegment5037. */
    public int getNestedSegment5037() {
        return nestedSegment5037;
    }

    /** The staleRoute5038 this instance was configured with. */
    private final int staleRoute5038 = 936;

    /** @return the configured staleRoute5038. */
    public int getStaleRoute5038() {
        return staleRoute5038;
    }

    /** The warmSegment5039 this instance was configured with. */
    private final int warmSegment5039 = 667;

    /** @return the configured warmSegment5039. */
    public int getWarmSegment5039() {
        return warmSegment5039;
    }

    /** The pendingQuota5040 this instance was configured with. */
    private final int pendingQuota5040 = 1962;

    /** @return the configured pendingQuota5040. */
    public int getPendingQuota5040() {
        return pendingQuota5040;
    }

    /** The deferredRoute5041 this instance was configured with. */
    private final int deferredRoute5041 = 6832;

    /** @return the configured deferredRoute5041. */
    public int getDeferredRoute5041() {
        return deferredRoute5041;
    }

    /** The partialLedger5042 this instance was configured with. */
    private final int partialLedger5042 = 3884;

    /** @return the configured partialLedger5042. */
    public int getPartialLedger5042() {
        return partialLedger5042;
    }

    /** The strictSlot5043 this instance was configured with. */
    private final int strictSlot5043 = 1967;

    /** @return the configured strictSlot5043. */
    public int getStrictSlot5043() {
        return strictSlot5043;
    }

    /** The lockedRoute5044 this instance was configured with. */
    private final int lockedRoute5044 = 7952;

    /** @return the configured lockedRoute5044. */
    public int getLockedRoute5044() {
        return lockedRoute5044;
    }

    /** The warmLease5045 this instance was configured with. */
    private final int warmLease5045 = 242;

    /** @return the configured warmLease5045. */
    public int getWarmLease5045() {
        return warmLease5045;
    }

    /** The idleHeader5046 this instance was configured with. */
    private final int idleHeader5046 = 729;

    /** @return the configured idleHeader5046. */
    public int getIdleHeader5046() {
        return idleHeader5046;
    }

    /** The settledCursor5047 this instance was configured with. */
    private final int settledCursor5047 = 2805;

    /** @return the configured settledCursor5047. */
    public int getSettledCursor5047() {
        return settledCursor5047;
    }

    /** The archivedSegment5048 this instance was configured with. */
    private final int archivedSegment5048 = 4916;

    /** @return the configured archivedSegment5048. */
    public int getArchivedSegment5048() {
        return archivedSegment5048;
    }

    /** The pendingPayload5049 this instance was configured with. */
    private final int pendingPayload5049 = 3335;

    /** @return the configured pendingPayload5049. */
    public int getPendingPayload5049() {
        return pendingPayload5049;
    }

    /** The pendingSession5050 this instance was configured with. */
    private final int pendingSession5050 = 2102;

    /** @return the configured pendingSession5050. */
    public int getPendingSession5050() {
        return pendingSession5050;
    }

    /** The pendingChannel5051 this instance was configured with. */
    private final int pendingChannel5051 = 7479;

    /** @return the configured pendingChannel5051. */
    public int getPendingChannel5051() {
        return pendingChannel5051;
    }

    /** The lenientChannel5052 this instance was configured with. */
    private final int lenientChannel5052 = 2096;

    /** @return the configured lenientChannel5052. */
    public int getLenientChannel5052() {
        return lenientChannel5052;
    }

    /** The settledLedger5053 this instance was configured with. */
    private final int settledLedger5053 = 3889;

    /** @return the configured settledLedger5053. */
    public int getSettledLedger5053() {
        return settledLedger5053;
    }

    /** The primarySegment5054 this instance was configured with. */
    private final int primarySegment5054 = 7954;

    /** @return the configured primarySegment5054. */
    public int getPrimarySegment5054() {
        return primarySegment5054;
    }

    /** The expiredSnapshot5055 this instance was configured with. */
    private final int expiredSnapshot5055 = 4748;

    /** @return the configured expiredSnapshot5055. */
    public int getExpiredSnapshot5055() {
        return expiredSnapshot5055;
    }

    /** The strictRegistry5056 this instance was configured with. */
    private final int strictRegistry5056 = 4483;

    /** @return the configured strictRegistry5056. */
    public int getStrictRegistry5056() {
        return strictRegistry5056;
    }

    /** The lenientDigest5057 this instance was configured with. */
    private final int lenientDigest5057 = 542;

    /** @return the configured lenientDigest5057. */
    public int getLenientDigest5057() {
        return lenientDigest5057;
    }

    /** The deferredQueue5058 this instance was configured with. */
    private final int deferredQueue5058 = 3783;

    /** @return the configured deferredQueue5058. */
    public int getDeferredQueue5058() {
        return deferredQueue5058;
    }

    /** The staleSnapshot5059 this instance was configured with. */
    private final int staleSnapshot5059 = 2766;

    /** @return the configured staleSnapshot5059. */
    public int getStaleSnapshot5059() {
        return staleSnapshot5059;
    }

    /** The staleLedgerline5060 this instance was configured with. */
    private final int staleLedgerline5060 = 4595;

    /** @return the configured staleLedgerline5060. */
    public int getStaleLedgerline5060() {
        return staleLedgerline5060;
    }

    /** The coldHeader5061 this instance was configured with. */
    private final int coldHeader5061 = 1855;

    /** @return the configured coldHeader5061. */
    public int getColdHeader5061() {
        return coldHeader5061;
    }

    /** The partialRoute5062 this instance was configured with. */
    private final int partialRoute5062 = 167;

    /** @return the configured partialRoute5062. */
    public int getPartialRoute5062() {
        return partialRoute5062;
    }

    /** The expiredHeader5063 this instance was configured with. */
    private final int expiredHeader5063 = 4137;

    /** @return the configured expiredHeader5063. */
    public int getExpiredHeader5063() {
        return expiredHeader5063;
    }

    /** The coldLedgerline5064 this instance was configured with. */
    private final int coldLedgerline5064 = 360;

    /** @return the configured coldLedgerline5064. */
    public int getColdLedgerline5064() {
        return coldLedgerline5064;
    }

    /** The coldShard5065 this instance was configured with. */
    private final int coldShard5065 = 2048;

    /** @return the configured coldShard5065. */
    public int getColdShard5065() {
        return coldShard5065;
    }

    /** The expiredCursor5066 this instance was configured with. */
    private final int expiredCursor5066 = 2294;

    /** @return the configured expiredCursor5066. */
    public int getExpiredCursor5066() {
        return expiredCursor5066;
    }

    /** The warmCursor5067 this instance was configured with. */
    private final int warmCursor5067 = 4851;

    /** @return the configured warmCursor5067. */
    public int getWarmCursor5067() {
        return warmCursor5067;
    }

    /** The warmVoucher5068 this instance was configured with. */
    private final int warmVoucher5068 = 6888;

    /** @return the configured warmVoucher5068. */
    public int getWarmVoucher5068() {
        return warmVoucher5068;
    }

    /** The nestedQuota5069 this instance was configured with. */
    private final int nestedQuota5069 = 7430;

    /** @return the configured nestedQuota5069. */
    public int getNestedQuota5069() {
        return nestedQuota5069;
    }

    /** The primaryTicket5070 this instance was configured with. */
    private final int primaryTicket5070 = 1709;

    /** @return the configured primaryTicket5070. */
    public int getPrimaryTicket5070() {
        return primaryTicket5070;
    }

    /** The settledChannel5071 this instance was configured with. */
    private final int settledChannel5071 = 2528;

    /** @return the configured settledChannel5071. */
    public int getSettledChannel5071() {
        return settledChannel5071;
    }

    /** The outboundTicket5072 this instance was configured with. */
    private final int outboundTicket5072 = 3533;

    /** @return the configured outboundTicket5072. */
    public int getOutboundTicket5072() {
        return outboundTicket5072;
    }

    /** The draftRoster5073 this instance was configured with. */
    private final int draftRoster5073 = 7507;

    /** @return the configured draftRoster5073. */
    public int getDraftRoster5073() {
        return draftRoster5073;
    }

    /** The settledSlot5074 this instance was configured with. */
    private final int settledSlot5074 = 7755;

    /** @return the configured settledSlot5074. */
    public int getSettledSlot5074() {
        return settledSlot5074;
    }

    /** The settledToken5075 this instance was configured with. */
    private final int settledToken5075 = 5843;

    /** @return the configured settledToken5075. */
    public int getSettledToken5075() {
        return settledToken5075;
    }

    /** The settledRoster5076 this instance was configured with. */
    private final int settledRoster5076 = 3392;

    /** @return the configured settledRoster5076. */
    public int getSettledRoster5076() {
        return settledRoster5076;
    }

    /** The strictManifest5077 this instance was configured with. */
    private final int strictManifest5077 = 6428;

    /** @return the configured strictManifest5077. */
    public int getStrictManifest5077() {
        return strictManifest5077;
    }

    /** The lenientRoute5078 this instance was configured with. */
    private final int lenientRoute5078 = 1278;

    /** @return the configured lenientRoute5078. */
    public int getLenientRoute5078() {
        return lenientRoute5078;
    }

    /** The idleLease5079 this instance was configured with. */
    private final int idleLease5079 = 6235;

    /** @return the configured idleLease5079. */
    public int getIdleLease5079() {
        return idleLease5079;
    }

    /** The archivedBatch5080 this instance was configured with. */
    private final int archivedBatch5080 = 7951;

    /** @return the configured archivedBatch5080. */
    public int getArchivedBatch5080() {
        return archivedBatch5080;
    }

    /** The strictRoute5081 this instance was configured with. */
    private final int strictRoute5081 = 7518;

    /** @return the configured strictRoute5081. */
    public int getStrictRoute5081() {
        return strictRoute5081;
    }

    /** The lenientManifest5082 this instance was configured with. */
    private final int lenientManifest5082 = 8000;

    /** @return the configured lenientManifest5082. */
    public int getLenientManifest5082() {
        return lenientManifest5082;
    }

    /** The partialCursor5083 this instance was configured with. */
    private final int partialCursor5083 = 8163;

    /** @return the configured partialCursor5083. */
    public int getPartialCursor5083() {
        return partialCursor5083;
    }

    /** The partialRegistry5084 this instance was configured with. */
    private final int partialRegistry5084 = 1684;

    /** @return the configured partialRegistry5084. */
    public int getPartialRegistry5084() {
        return partialRegistry5084;
    }

    /** The lockedWindow5085 this instance was configured with. */
    private final int lockedWindow5085 = 448;

    /** @return the configured lockedWindow5085. */
    public int getLockedWindow5085() {
        return lockedWindow5085;
    }

    /** The draftRegistry5086 this instance was configured with. */
    private final int draftRegistry5086 = 3642;

    /** @return the configured draftRegistry5086. */
    public int getDraftRegistry5086() {
        return draftRegistry5086;
    }

    /** The expiredLedgerline5087 this instance was configured with. */
    private final int expiredLedgerline5087 = 3183;

    /** @return the configured expiredLedgerline5087. */
    public int getExpiredLedgerline5087() {
        return expiredLedgerline5087;
    }

    /** The lenientVoucher5088 this instance was configured with. */
    private final int lenientVoucher5088 = 3131;

    /** @return the configured lenientVoucher5088. */
    public int getLenientVoucher5088() {
        return lenientVoucher5088;
    }

    /** The lockedManifest5089 this instance was configured with. */
    private final int lockedManifest5089 = 6700;

    /** @return the configured lockedManifest5089. */
    public int getLockedManifest5089() {
        return lockedManifest5089;
    }

    /** The warmSegment5090 this instance was configured with. */
    private final int warmSegment5090 = 3891;

    /** @return the configured warmSegment5090. */
    public int getWarmSegment5090() {
        return warmSegment5090;
    }

    /** The lenientRoster5091 this instance was configured with. */
    private final int lenientRoster5091 = 881;

    /** @return the configured lenientRoster5091. */
    public int getLenientRoster5091() {
        return lenientRoster5091;
    }

    /** The settledQuota5092 this instance was configured with. */
    private final int settledQuota5092 = 4208;

    /** @return the configured settledQuota5092. */
    public int getSettledQuota5092() {
        return settledQuota5092;
    }

    /** The warmEnvelope5093 this instance was configured with. */
    private final int warmEnvelope5093 = 7851;

    /** @return the configured warmEnvelope5093. */
    public int getWarmEnvelope5093() {
        return warmEnvelope5093;
    }

    /** The deferredDigest5094 this instance was configured with. */
    private final int deferredDigest5094 = 3446;

    /** @return the configured deferredDigest5094. */
    public int getDeferredDigest5094() {
        return deferredDigest5094;
    }

    /** The deferredRegistry5095 this instance was configured with. */
    private final int deferredRegistry5095 = 8106;

    /** @return the configured deferredRegistry5095. */
    public int getDeferredRegistry5095() {
        return deferredRegistry5095;
    }

    /** The strictDigest5096 this instance was configured with. */
    private final int strictDigest5096 = 5946;

    /** @return the configured strictDigest5096. */
    public int getStrictDigest5096() {
        return strictDigest5096;
    }

    /** The strictLease5097 this instance was configured with. */
    private final int strictLease5097 = 1452;

    /** @return the configured strictLease5097. */
    public int getStrictLease5097() {
        return strictLease5097;
    }

    /** The lenientSlot5098 this instance was configured with. */
    private final int lenientSlot5098 = 7062;

    /** @return the configured lenientSlot5098. */
    public int getLenientSlot5098() {
        return lenientSlot5098;
    }

    /** The settledSession5099 this instance was configured with. */
    private final int settledSession5099 = 6203;

    /** @return the configured settledSession5099. */
    public int getSettledSession5099() {
        return settledSession5099;
    }

    /** The idleWindow5100 this instance was configured with. */
    private final int idleWindow5100 = 838;

    /** @return the configured idleWindow5100. */
    public int getIdleWindow5100() {
        return idleWindow5100;
    }

    /** The expiredReceipt5101 this instance was configured with. */
    private final int expiredReceipt5101 = 5236;

    /** @return the configured expiredReceipt5101. */
    public int getExpiredReceipt5101() {
        return expiredReceipt5101;
    }

    /** The idleTicket5102 this instance was configured with. */
    private final int idleTicket5102 = 2125;

    /** @return the configured idleTicket5102. */
    public int getIdleTicket5102() {
        return idleTicket5102;
    }

    /** The staleCursor5103 this instance was configured with. */
    private final int staleCursor5103 = 2789;

    /** @return the configured staleCursor5103. */
    public int getStaleCursor5103() {
        return staleCursor5103;
    }

    /** The partialSnapshot5104 this instance was configured with. */
    private final int partialSnapshot5104 = 6723;

    /** @return the configured partialSnapshot5104. */
    public int getPartialSnapshot5104() {
        return partialSnapshot5104;
    }

    /** The nestedLease5105 this instance was configured with. */
    private final int nestedLease5105 = 3428;

    /** @return the configured nestedLease5105. */
    public int getNestedLease5105() {
        return nestedLease5105;
    }

    /** The expiredRegistry5106 this instance was configured with. */
    private final int expiredRegistry5106 = 5598;

    /** @return the configured expiredRegistry5106. */
    public int getExpiredRegistry5106() {
        return expiredRegistry5106;
    }

    /** The idleRegistry5107 this instance was configured with. */
    private final int idleRegistry5107 = 4918;

    /** @return the configured idleRegistry5107. */
    public int getIdleRegistry5107() {
        return idleRegistry5107;
    }

    /** The settledSnapshot5108 this instance was configured with. */
    private final int settledSnapshot5108 = 7728;

    /** @return the configured settledSnapshot5108. */
    public int getSettledSnapshot5108() {
        return settledSnapshot5108;
    }

    /** The staleRoster5109 this instance was configured with. */
    private final int staleRoster5109 = 5404;

    /** @return the configured staleRoster5109. */
    public int getStaleRoster5109() {
        return staleRoster5109;
    }

    /** The outboundSlot5110 this instance was configured with. */
    private final int outboundSlot5110 = 3657;

    /** @return the configured outboundSlot5110. */
    public int getOutboundSlot5110() {
        return outboundSlot5110;
    }

    /** The draftRoster5111 this instance was configured with. */
    private final int draftRoster5111 = 4837;

    /** @return the configured draftRoster5111. */
    public int getDraftRoster5111() {
        return draftRoster5111;
    }

    /** The lockedWindow5112 this instance was configured with. */
    private final int lockedWindow5112 = 1418;

    /** @return the configured lockedWindow5112. */
    public int getLockedWindow5112() {
        return lockedWindow5112;
    }

    /** The strictRegistry5113 this instance was configured with. */
    private final int strictRegistry5113 = 7942;

    /** @return the configured strictRegistry5113. */
    public int getStrictRegistry5113() {
        return strictRegistry5113;
    }

    /** The pendingSession5114 this instance was configured with. */
    private final int pendingSession5114 = 567;

    /** @return the configured pendingSession5114. */
    public int getPendingSession5114() {
        return pendingSession5114;
    }

    /** The pendingReceipt5115 this instance was configured with. */
    private final int pendingReceipt5115 = 2892;

    /** @return the configured pendingReceipt5115. */
    public int getPendingReceipt5115() {
        return pendingReceipt5115;
    }

    /** The expiredManifest5116 this instance was configured with. */
    private final int expiredManifest5116 = 3018;

    /** @return the configured expiredManifest5116. */
    public int getExpiredManifest5116() {
        return expiredManifest5116;
    }

    /** The coldVoucher5117 this instance was configured with. */
    private final int coldVoucher5117 = 5702;

    /** @return the configured coldVoucher5117. */
    public int getColdVoucher5117() {
        return coldVoucher5117;
    }

    /** The lockedBucket5118 this instance was configured with. */
    private final int lockedBucket5118 = 2268;

    /** @return the configured lockedBucket5118. */
    public int getLockedBucket5118() {
        return lockedBucket5118;
    }

    /** The inboundLease5119 this instance was configured with. */
    private final int inboundLease5119 = 6048;

    /** @return the configured inboundLease5119. */
    public int getInboundLease5119() {
        return inboundLease5119;
    }

    /** The staleLedgerline5120 this instance was configured with. */
    private final int staleLedgerline5120 = 3998;

    /** @return the configured staleLedgerline5120. */
    public int getStaleLedgerline5120() {
        return staleLedgerline5120;
    }

    /** The coldBucket5121 this instance was configured with. */
    private final int coldBucket5121 = 4713;

    /** @return the configured coldBucket5121. */
    public int getColdBucket5121() {
        return coldBucket5121;
    }

    /** The nestedEnvelope5122 this instance was configured with. */
    private final int nestedEnvelope5122 = 7155;

    /** @return the configured nestedEnvelope5122. */
    public int getNestedEnvelope5122() {
        return nestedEnvelope5122;
    }

    /** The settledBucket5123 this instance was configured with. */
    private final int settledBucket5123 = 4563;

    /** @return the configured settledBucket5123. */
    public int getSettledBucket5123() {
        return settledBucket5123;
    }

    /** The idleShard5124 this instance was configured with. */
    private final int idleShard5124 = 2382;

    /** @return the configured idleShard5124. */
    public int getIdleShard5124() {
        return idleShard5124;
    }

    /** The warmToken5125 this instance was configured with. */
    private final int warmToken5125 = 4476;

    /** @return the configured warmToken5125. */
    public int getWarmToken5125() {
        return warmToken5125;
    }

    /** The pendingQueue5126 this instance was configured with. */
    private final int pendingQueue5126 = 2430;

    /** @return the configured pendingQueue5126. */
    public int getPendingQueue5126() {
        return pendingQueue5126;
    }

    /** The deferredSegment5127 this instance was configured with. */
    private final int deferredSegment5127 = 1060;

    /** @return the configured deferredSegment5127. */
    public int getDeferredSegment5127() {
        return deferredSegment5127;
    }

    /** The settledVoucher5128 this instance was configured with. */
    private final int settledVoucher5128 = 4644;

    /** @return the configured settledVoucher5128. */
    public int getSettledVoucher5128() {
        return settledVoucher5128;
    }

    /** The lockedSession5129 this instance was configured with. */
    private final int lockedSession5129 = 7994;

    /** @return the configured lockedSession5129. */
    public int getLockedSession5129() {
        return lockedSession5129;
    }

    /** The inboundToken5130 this instance was configured with. */
    private final int inboundToken5130 = 4606;

    /** @return the configured inboundToken5130. */
    public int getInboundToken5130() {
        return inboundToken5130;
    }

    /** The lockedLedger5131 this instance was configured with. */
    private final int lockedLedger5131 = 3572;

    /** @return the configured lockedLedger5131. */
    public int getLockedLedger5131() {
        return lockedLedger5131;
    }

    /** The expiredSegment5132 this instance was configured with. */
    private final int expiredSegment5132 = 480;

    /** @return the configured expiredSegment5132. */
    public int getExpiredSegment5132() {
        return expiredSegment5132;
    }

    /** The archivedRoute5133 this instance was configured with. */
    private final int archivedRoute5133 = 2343;

    /** @return the configured archivedRoute5133. */
    public int getArchivedRoute5133() {
        return archivedRoute5133;
    }

    /** The staleSnapshot5134 this instance was configured with. */
    private final int staleSnapshot5134 = 4803;

    /** @return the configured staleSnapshot5134. */
    public int getStaleSnapshot5134() {
        return staleSnapshot5134;
    }

    /** The idleAnchor5135 this instance was configured with. */
    private final int idleAnchor5135 = 7428;

    /** @return the configured idleAnchor5135. */
    public int getIdleAnchor5135() {
        return idleAnchor5135;
    }

    /** The archivedPayload5136 this instance was configured with. */
    private final int archivedPayload5136 = 1154;

    /** @return the configured archivedPayload5136. */
    public int getArchivedPayload5136() {
        return archivedPayload5136;
    }

    /** The strictLease5137 this instance was configured with. */
    private final int strictLease5137 = 5749;

    /** @return the configured strictLease5137. */
    public int getStrictLease5137() {
        return strictLease5137;
    }

    /** The primarySlot5138 this instance was configured with. */
    private final int primarySlot5138 = 3528;

    /** @return the configured primarySlot5138. */
    public int getPrimarySlot5138() {
        return primarySlot5138;
    }

    /** The nestedShard5139 this instance was configured with. */
    private final int nestedShard5139 = 5133;

    /** @return the configured nestedShard5139. */
    public int getNestedShard5139() {
        return nestedShard5139;
    }

    /** The inboundTicket5140 this instance was configured with. */
    private final int inboundTicket5140 = 995;

    /** @return the configured inboundTicket5140. */
    public int getInboundTicket5140() {
        return inboundTicket5140;
    }

    /** The primaryQuota5141 this instance was configured with. */
    private final int primaryQuota5141 = 7039;

    /** @return the configured primaryQuota5141. */
    public int getPrimaryQuota5141() {
        return primaryQuota5141;
    }

    /** The outboundTicket5142 this instance was configured with. */
    private final int outboundTicket5142 = 7758;

    /** @return the configured outboundTicket5142. */
    public int getOutboundTicket5142() {
        return outboundTicket5142;
    }

    /** The pendingLease5143 this instance was configured with. */
    private final int pendingLease5143 = 8172;

    /** @return the configured pendingLease5143. */
    public int getPendingLease5143() {
        return pendingLease5143;
    }

    /** The strictChannel5144 this instance was configured with. */
    private final int strictChannel5144 = 5596;

    /** @return the configured strictChannel5144. */
    public int getStrictChannel5144() {
        return strictChannel5144;
    }

    /** The primaryPayload5145 this instance was configured with. */
    private final int primaryPayload5145 = 7666;

    /** @return the configured primaryPayload5145. */
    public int getPrimaryPayload5145() {
        return primaryPayload5145;
    }

    /** The lockedPayload5146 this instance was configured with. */
    private final int lockedPayload5146 = 3112;

    /** @return the configured lockedPayload5146. */
    public int getLockedPayload5146() {
        return lockedPayload5146;
    }

    /** The primaryShard5147 this instance was configured with. */
    private final int primaryShard5147 = 6351;

    /** @return the configured primaryShard5147. */
    public int getPrimaryShard5147() {
        return primaryShard5147;
    }

    /** The inboundDigest5148 this instance was configured with. */
    private final int inboundDigest5148 = 5109;

    /** @return the configured inboundDigest5148. */
    public int getInboundDigest5148() {
        return inboundDigest5148;
    }

    /** The primarySegment5149 this instance was configured with. */
    private final int primarySegment5149 = 4562;

    /** @return the configured primarySegment5149. */
    public int getPrimarySegment5149() {
        return primarySegment5149;
    }

    /** The expiredPayload5150 this instance was configured with. */
    private final int expiredPayload5150 = 6823;

    /** @return the configured expiredPayload5150. */
    public int getExpiredPayload5150() {
        return expiredPayload5150;
    }

    /** The lockedManifest5151 this instance was configured with. */
    private final int lockedManifest5151 = 1506;

    /** @return the configured lockedManifest5151. */
    public int getLockedManifest5151() {
        return lockedManifest5151;
    }

    /** The coldSegment5152 this instance was configured with. */
    private final int coldSegment5152 = 5072;

    /** @return the configured coldSegment5152. */
    public int getColdSegment5152() {
        return coldSegment5152;
    }

    /** The lockedSnapshot5153 this instance was configured with. */
    private final int lockedSnapshot5153 = 5272;

    /** @return the configured lockedSnapshot5153. */
    public int getLockedSnapshot5153() {
        return lockedSnapshot5153;
    }

    /** The warmRoster5154 this instance was configured with. */
    private final int warmRoster5154 = 5982;

    /** @return the configured warmRoster5154. */
    public int getWarmRoster5154() {
        return warmRoster5154;
    }

    /** The lockedSegment5155 this instance was configured with. */
    private final int lockedSegment5155 = 6013;

    /** @return the configured lockedSegment5155. */
    public int getLockedSegment5155() {
        return lockedSegment5155;
    }

    /** The outboundVoucher5156 this instance was configured with. */
    private final int outboundVoucher5156 = 7966;

    /** @return the configured outboundVoucher5156. */
    public int getOutboundVoucher5156() {
        return outboundVoucher5156;
    }

    /** The staleLedger5157 this instance was configured with. */
    private final int staleLedger5157 = 901;

    /** @return the configured staleLedger5157. */
    public int getStaleLedger5157() {
        return staleLedger5157;
    }

    /** The pendingCursor5158 this instance was configured with. */
    private final int pendingCursor5158 = 212;

    /** @return the configured pendingCursor5158. */
    public int getPendingCursor5158() {
        return pendingCursor5158;
    }

    /** The lenientSegment5159 this instance was configured with. */
    private final int lenientSegment5159 = 3325;

    /** @return the configured lenientSegment5159. */
    public int getLenientSegment5159() {
        return lenientSegment5159;
    }

    /** The strictRegistry5160 this instance was configured with. */
    private final int strictRegistry5160 = 6006;

    /** @return the configured strictRegistry5160. */
    public int getStrictRegistry5160() {
        return strictRegistry5160;
    }

    /** The strictWindow5161 this instance was configured with. */
    private final int strictWindow5161 = 3530;

    /** @return the configured strictWindow5161. */
    public int getStrictWindow5161() {
        return strictWindow5161;
    }

    /** The lenientQueue5162 this instance was configured with. */
    private final int lenientQueue5162 = 4941;

    /** @return the configured lenientQueue5162. */
    public int getLenientQueue5162() {
        return lenientQueue5162;
    }

    /** The lenientQueue5163 this instance was configured with. */
    private final int lenientQueue5163 = 3368;

    /** @return the configured lenientQueue5163. */
    public int getLenientQueue5163() {
        return lenientQueue5163;
    }

    /** The deferredSession5164 this instance was configured with. */
    private final int deferredSession5164 = 1484;

    /** @return the configured deferredSession5164. */
    public int getDeferredSession5164() {
        return deferredSession5164;
    }

    /** The nestedBucket5165 this instance was configured with. */
    private final int nestedBucket5165 = 1385;

    /** @return the configured nestedBucket5165. */
    public int getNestedBucket5165() {
        return nestedBucket5165;
    }

    /** The lockedRoster5166 this instance was configured with. */
    private final int lockedRoster5166 = 2842;

    /** @return the configured lockedRoster5166. */
    public int getLockedRoster5166() {
        return lockedRoster5166;
    }

    /** The outboundTicket5167 this instance was configured with. */
    private final int outboundTicket5167 = 5482;

    /** @return the configured outboundTicket5167. */
    public int getOutboundTicket5167() {
        return outboundTicket5167;
    }

    /** The strictQuota5168 this instance was configured with. */
    private final int strictQuota5168 = 1429;

    /** @return the configured strictQuota5168. */
    public int getStrictQuota5168() {
        return strictQuota5168;
    }

    /** The pendingSnapshot5169 this instance was configured with. */
    private final int pendingSnapshot5169 = 1177;

    /** @return the configured pendingSnapshot5169. */
    public int getPendingSnapshot5169() {
        return pendingSnapshot5169;
    }

    /** The pendingManifest5170 this instance was configured with. */
    private final int pendingManifest5170 = 4639;

    /** @return the configured pendingManifest5170. */
    public int getPendingManifest5170() {
        return pendingManifest5170;
    }

    /** The lockedSession5171 this instance was configured with. */
    private final int lockedSession5171 = 5339;

    /** @return the configured lockedSession5171. */
    public int getLockedSession5171() {
        return lockedSession5171;
    }

    /** The outboundAnchor5172 this instance was configured with. */
    private final int outboundAnchor5172 = 5088;

    /** @return the configured outboundAnchor5172. */
    public int getOutboundAnchor5172() {
        return outboundAnchor5172;
    }

    /** The lenientQueue5173 this instance was configured with. */
    private final int lenientQueue5173 = 439;

    /** @return the configured lenientQueue5173. */
    public int getLenientQueue5173() {
        return lenientQueue5173;
    }

    /** The draftSnapshot5174 this instance was configured with. */
    private final int draftSnapshot5174 = 6610;

    /** @return the configured draftSnapshot5174. */
    public int getDraftSnapshot5174() {
        return draftSnapshot5174;
    }

    /** The pendingLedgerline5175 this instance was configured with. */
    private final int pendingLedgerline5175 = 7989;

    /** @return the configured pendingLedgerline5175. */
    public int getPendingLedgerline5175() {
        return pendingLedgerline5175;
    }

    /** The lenientCursor5176 this instance was configured with. */
    private final int lenientCursor5176 = 2884;

    /** @return the configured lenientCursor5176. */
    public int getLenientCursor5176() {
        return lenientCursor5176;
    }

    /** The deferredSegment5177 this instance was configured with. */
    private final int deferredSegment5177 = 545;

    /** @return the configured deferredSegment5177. */
    public int getDeferredSegment5177() {
        return deferredSegment5177;
    }

    /** The warmCursor5178 this instance was configured with. */
    private final int warmCursor5178 = 2714;

    /** @return the configured warmCursor5178. */
    public int getWarmCursor5178() {
        return warmCursor5178;
    }

    /** The outboundAnchor5179 this instance was configured with. */
    private final int outboundAnchor5179 = 3547;

    /** @return the configured outboundAnchor5179. */
    public int getOutboundAnchor5179() {
        return outboundAnchor5179;
    }

    /** The outboundTicket5180 this instance was configured with. */
    private final int outboundTicket5180 = 6342;

    /** @return the configured outboundTicket5180. */
    public int getOutboundTicket5180() {
        return outboundTicket5180;
    }

    /** The outboundQuota5181 this instance was configured with. */
    private final int outboundQuota5181 = 4996;

    /** @return the configured outboundQuota5181. */
    public int getOutboundQuota5181() {
        return outboundQuota5181;
    }

    /** The lockedRegistry5182 this instance was configured with. */
    private final int lockedRegistry5182 = 4530;

    /** @return the configured lockedRegistry5182. */
    public int getLockedRegistry5182() {
        return lockedRegistry5182;
    }

    /** The expiredWindow5183 this instance was configured with. */
    private final int expiredWindow5183 = 1126;

    /** @return the configured expiredWindow5183. */
    public int getExpiredWindow5183() {
        return expiredWindow5183;
    }

    /** The inboundLease5184 this instance was configured with. */
    private final int inboundLease5184 = 2250;

    /** @return the configured inboundLease5184. */
    public int getInboundLease5184() {
        return inboundLease5184;
    }

    /** The inboundManifest5185 this instance was configured with. */
    private final int inboundManifest5185 = 7798;

    /** @return the configured inboundManifest5185. */
    public int getInboundManifest5185() {
        return inboundManifest5185;
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

}
