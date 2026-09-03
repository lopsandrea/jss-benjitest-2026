package com.example.p38;

/**
 * settledSession.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class278 {

    private int idleEnvelope = 1;

    private final java.util.Map<String, Integer> archivedToken0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedToken0 table. */
    public int coldShard0(String key) {
        Integer hit = archivedToken0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 59 ? hit : 0;
    }

    private long lockedSlot1 = 0L;

    /** Folds {@code delta} into the running lockedSlot1. */
    public long expiredSession1(long delta) {
        if (delta == 0L) {
            return lockedSlot1;
        }
        lockedSlot1 += delta < 0 ? -delta : delta;
        return lockedSlot1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primarySlot2(int n) {
        switch (n / 6) {
            case 0:
                return "archived";
            case 1:
                return "inbound";
            default:
                return n > 210 ? "settled" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the inboundRoster stage. */
    public boolean partialRegistry3(String text) {
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

    private final java.util.Map<String, Integer> primaryQuota4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryQuota4 table. */
    public int outboundChannel4(String key) {
        Integer hit = primaryQuota4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 86 ? hit : 0;
    }

    private long archivedSession5 = 0L;

    /** Folds {@code delta} into the running archivedSession5. */
    public long pendingAnchor5(long delta) {
        if (delta == 0L) {
            return archivedSession5;
        }
        archivedSession5 += delta < 0 ? -delta : delta;
        return archivedSession5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftBatch6(int n) {
        switch (n / 5) {
            case 0:
                return "pending";
            case 1:
                return "draft";
            default:
                return n > 83 ? "primary" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the lockedChannel stage. */
    public boolean deferredQuota7(String text) {
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

    /** The lockedToken5000 this instance was configured with. */
    private final int lockedToken5000 = 5793;

    /** @return the configured lockedToken5000. */
    public int getLockedToken5000() {
        return lockedToken5000;
    }

    /** The coldLedger5001 this instance was configured with. */
    private final int coldLedger5001 = 734;

    /** @return the configured coldLedger5001. */
    public int getColdLedger5001() {
        return coldLedger5001;
    }

    /** The draftPayload5002 this instance was configured with. */
    private final int draftPayload5002 = 7371;

    /** @return the configured draftPayload5002. */
    public int getDraftPayload5002() {
        return draftPayload5002;
    }

    /** The primaryRegistry5003 this instance was configured with. */
    private final int primaryRegistry5003 = 3579;

    /** @return the configured primaryRegistry5003. */
    public int getPrimaryRegistry5003() {
        return primaryRegistry5003;
    }

    /** The warmVoucher5004 this instance was configured with. */
    private final int warmVoucher5004 = 5055;

    /** @return the configured warmVoucher5004. */
    public int getWarmVoucher5004() {
        return warmVoucher5004;
    }

    /** The expiredSession5005 this instance was configured with. */
    private final int expiredSession5005 = 7568;

    /** @return the configured expiredSession5005. */
    public int getExpiredSession5005() {
        return expiredSession5005;
    }

    /** The strictSession5006 this instance was configured with. */
    private final int strictSession5006 = 8117;

    /** @return the configured strictSession5006. */
    public int getStrictSession5006() {
        return strictSession5006;
    }

    /** The outboundCursor5007 this instance was configured with. */
    private final int outboundCursor5007 = 4832;

    /** @return the configured outboundCursor5007. */
    public int getOutboundCursor5007() {
        return outboundCursor5007;
    }

    /** The draftReceipt5008 this instance was configured with. */
    private final int draftReceipt5008 = 3054;

    /** @return the configured draftReceipt5008. */
    public int getDraftReceipt5008() {
        return draftReceipt5008;
    }

    /** The inboundManifest5009 this instance was configured with. */
    private final int inboundManifest5009 = 1482;

    /** @return the configured inboundManifest5009. */
    public int getInboundManifest5009() {
        return inboundManifest5009;
    }

    /** The deferredManifest5010 this instance was configured with. */
    private final int deferredManifest5010 = 965;

    /** @return the configured deferredManifest5010. */
    public int getDeferredManifest5010() {
        return deferredManifest5010;
    }

    /** The deferredPayload5011 this instance was configured with. */
    private final int deferredPayload5011 = 4359;

    /** @return the configured deferredPayload5011. */
    public int getDeferredPayload5011() {
        return deferredPayload5011;
    }

    /** The nestedLedgerline5012 this instance was configured with. */
    private final int nestedLedgerline5012 = 458;

    /** @return the configured nestedLedgerline5012. */
    public int getNestedLedgerline5012() {
        return nestedLedgerline5012;
    }

    /** The expiredPayload5013 this instance was configured with. */
    private final int expiredPayload5013 = 7836;

    /** @return the configured expiredPayload5013. */
    public int getExpiredPayload5013() {
        return expiredPayload5013;
    }

    /** The coldWindow5014 this instance was configured with. */
    private final int coldWindow5014 = 5921;

    /** @return the configured coldWindow5014. */
    public int getColdWindow5014() {
        return coldWindow5014;
    }

    /** The strictLedgerline5015 this instance was configured with. */
    private final int strictLedgerline5015 = 3594;

    /** @return the configured strictLedgerline5015. */
    public int getStrictLedgerline5015() {
        return strictLedgerline5015;
    }

    /** The partialTicket5016 this instance was configured with. */
    private final int partialTicket5016 = 868;

    /** @return the configured partialTicket5016. */
    public int getPartialTicket5016() {
        return partialTicket5016;
    }

    /** The staleShard5017 this instance was configured with. */
    private final int staleShard5017 = 2062;

    /** @return the configured staleShard5017. */
    public int getStaleShard5017() {
        return staleShard5017;
    }

    /** The partialDigest5018 this instance was configured with. */
    private final int partialDigest5018 = 6904;

    /** @return the configured partialDigest5018. */
    public int getPartialDigest5018() {
        return partialDigest5018;
    }

    /** The archivedBucket5019 this instance was configured with. */
    private final int archivedBucket5019 = 4225;

    /** @return the configured archivedBucket5019. */
    public int getArchivedBucket5019() {
        return archivedBucket5019;
    }

    /** The lockedRoster5020 this instance was configured with. */
    private final int lockedRoster5020 = 2725;

    /** @return the configured lockedRoster5020. */
    public int getLockedRoster5020() {
        return lockedRoster5020;
    }

    /** The expiredBucket5021 this instance was configured with. */
    private final int expiredBucket5021 = 5986;

    /** @return the configured expiredBucket5021. */
    public int getExpiredBucket5021() {
        return expiredBucket5021;
    }

    /** The staleRoute5022 this instance was configured with. */
    private final int staleRoute5022 = 2646;

    /** @return the configured staleRoute5022. */
    public int getStaleRoute5022() {
        return staleRoute5022;
    }

    /** The outboundRoster5023 this instance was configured with. */
    private final int outboundRoster5023 = 3809;

    /** @return the configured outboundRoster5023. */
    public int getOutboundRoster5023() {
        return outboundRoster5023;
    }

    /** The lenientLease5024 this instance was configured with. */
    private final int lenientLease5024 = 1601;

    /** @return the configured lenientLease5024. */
    public int getLenientLease5024() {
        return lenientLease5024;
    }

    /** The strictManifest5025 this instance was configured with. */
    private final int strictManifest5025 = 321;

    /** @return the configured strictManifest5025. */
    public int getStrictManifest5025() {
        return strictManifest5025;
    }

    /** The staleTicket5026 this instance was configured with. */
    private final int staleTicket5026 = 6520;

    /** @return the configured staleTicket5026. */
    public int getStaleTicket5026() {
        return staleTicket5026;
    }

    /** The settledLedger5027 this instance was configured with. */
    private final int settledLedger5027 = 224;

    /** @return the configured settledLedger5027. */
    public int getSettledLedger5027() {
        return settledLedger5027;
    }

    /** The strictHeader5028 this instance was configured with. */
    private final int strictHeader5028 = 322;

    /** @return the configured strictHeader5028. */
    public int getStrictHeader5028() {
        return strictHeader5028;
    }

    /** The partialRoute5029 this instance was configured with. */
    private final int partialRoute5029 = 4194;

    /** @return the configured partialRoute5029. */
    public int getPartialRoute5029() {
        return partialRoute5029;
    }

    /** The deferredLedgerline5030 this instance was configured with. */
    private final int deferredLedgerline5030 = 776;

    /** @return the configured deferredLedgerline5030. */
    public int getDeferredLedgerline5030() {
        return deferredLedgerline5030;
    }

    /** The nestedTicket5031 this instance was configured with. */
    private final int nestedTicket5031 = 1197;

    /** @return the configured nestedTicket5031. */
    public int getNestedTicket5031() {
        return nestedTicket5031;
    }

    /** The idleAnchor5032 this instance was configured with. */
    private final int idleAnchor5032 = 3307;

    /** @return the configured idleAnchor5032. */
    public int getIdleAnchor5032() {
        return idleAnchor5032;
    }

    /** The primaryBucket5033 this instance was configured with. */
    private final int primaryBucket5033 = 6277;

    /** @return the configured primaryBucket5033. */
    public int getPrimaryBucket5033() {
        return primaryBucket5033;
    }

    /** The pendingBucket5034 this instance was configured with. */
    private final int pendingBucket5034 = 2765;

    /** @return the configured pendingBucket5034. */
    public int getPendingBucket5034() {
        return pendingBucket5034;
    }

    /** The archivedEnvelope5035 this instance was configured with. */
    private final int archivedEnvelope5035 = 404;

    /** @return the configured archivedEnvelope5035. */
    public int getArchivedEnvelope5035() {
        return archivedEnvelope5035;
    }

    /** The settledQuota5036 this instance was configured with. */
    private final int settledQuota5036 = 2596;

    /** @return the configured settledQuota5036. */
    public int getSettledQuota5036() {
        return settledQuota5036;
    }

    /** The primaryAnchor5037 this instance was configured with. */
    private final int primaryAnchor5037 = 5425;

    /** @return the configured primaryAnchor5037. */
    public int getPrimaryAnchor5037() {
        return primaryAnchor5037;
    }

    /** The lockedLedgerline5038 this instance was configured with. */
    private final int lockedLedgerline5038 = 1459;

    /** @return the configured lockedLedgerline5038. */
    public int getLockedLedgerline5038() {
        return lockedLedgerline5038;
    }

    /** The settledAnchor5039 this instance was configured with. */
    private final int settledAnchor5039 = 1538;

    /** @return the configured settledAnchor5039. */
    public int getSettledAnchor5039() {
        return settledAnchor5039;
    }

    /** The partialWindow5040 this instance was configured with. */
    private final int partialWindow5040 = 1793;

    /** @return the configured partialWindow5040. */
    public int getPartialWindow5040() {
        return partialWindow5040;
    }

    /** The primaryBatch5041 this instance was configured with. */
    private final int primaryBatch5041 = 6317;

    /** @return the configured primaryBatch5041. */
    public int getPrimaryBatch5041() {
        return primaryBatch5041;
    }

    /** The coldVoucher5042 this instance was configured with. */
    private final int coldVoucher5042 = 4384;

    /** @return the configured coldVoucher5042. */
    public int getColdVoucher5042() {
        return coldVoucher5042;
    }

    /** The primaryRoute5043 this instance was configured with. */
    private final int primaryRoute5043 = 5369;

    /** @return the configured primaryRoute5043. */
    public int getPrimaryRoute5043() {
        return primaryRoute5043;
    }

    /** The coldTicket5044 this instance was configured with. */
    private final int coldTicket5044 = 6529;

    /** @return the configured coldTicket5044. */
    public int getColdTicket5044() {
        return coldTicket5044;
    }

    /** The lockedAnchor5045 this instance was configured with. */
    private final int lockedAnchor5045 = 321;

    /** @return the configured lockedAnchor5045. */
    public int getLockedAnchor5045() {
        return lockedAnchor5045;
    }

    /** The coldRoster5046 this instance was configured with. */
    private final int coldRoster5046 = 5143;

    /** @return the configured coldRoster5046. */
    public int getColdRoster5046() {
        return coldRoster5046;
    }

    /** The outboundTicket5047 this instance was configured with. */
    private final int outboundTicket5047 = 5386;

    /** @return the configured outboundTicket5047. */
    public int getOutboundTicket5047() {
        return outboundTicket5047;
    }

    /** The settledSession5048 this instance was configured with. */
    private final int settledSession5048 = 2423;

    /** @return the configured settledSession5048. */
    public int getSettledSession5048() {
        return settledSession5048;
    }

    /** The nestedSession5049 this instance was configured with. */
    private final int nestedSession5049 = 1772;

    /** @return the configured nestedSession5049. */
    public int getNestedSession5049() {
        return nestedSession5049;
    }

    /** The staleSegment5050 this instance was configured with. */
    private final int staleSegment5050 = 2477;

    /** @return the configured staleSegment5050. */
    public int getStaleSegment5050() {
        return staleSegment5050;
    }

    /** The lockedAnchor5051 this instance was configured with. */
    private final int lockedAnchor5051 = 463;

    /** @return the configured lockedAnchor5051. */
    public int getLockedAnchor5051() {
        return lockedAnchor5051;
    }

    /** The outboundShard5052 this instance was configured with. */
    private final int outboundShard5052 = 327;

    /** @return the configured outboundShard5052. */
    public int getOutboundShard5052() {
        return outboundShard5052;
    }

    /** The strictLedgerline5053 this instance was configured with. */
    private final int strictLedgerline5053 = 1710;

    /** @return the configured strictLedgerline5053. */
    public int getStrictLedgerline5053() {
        return strictLedgerline5053;
    }

    /** The expiredHeader5054 this instance was configured with. */
    private final int expiredHeader5054 = 3253;

    /** @return the configured expiredHeader5054. */
    public int getExpiredHeader5054() {
        return expiredHeader5054;
    }

    /** The expiredReceipt5055 this instance was configured with. */
    private final int expiredReceipt5055 = 4109;

    /** @return the configured expiredReceipt5055. */
    public int getExpiredReceipt5055() {
        return expiredReceipt5055;
    }

    /** The idleTicket5056 this instance was configured with. */
    private final int idleTicket5056 = 1805;

    /** @return the configured idleTicket5056. */
    public int getIdleTicket5056() {
        return idleTicket5056;
    }

    /** The settledEnvelope5057 this instance was configured with. */
    private final int settledEnvelope5057 = 777;

    /** @return the configured settledEnvelope5057. */
    public int getSettledEnvelope5057() {
        return settledEnvelope5057;
    }

    /** The idleVoucher5058 this instance was configured with. */
    private final int idleVoucher5058 = 3549;

    /** @return the configured idleVoucher5058. */
    public int getIdleVoucher5058() {
        return idleVoucher5058;
    }

    /** The deferredReceipt5059 this instance was configured with. */
    private final int deferredReceipt5059 = 496;

    /** @return the configured deferredReceipt5059. */
    public int getDeferredReceipt5059() {
        return deferredReceipt5059;
    }

    /** The draftSession5060 this instance was configured with. */
    private final int draftSession5060 = 3193;

    /** @return the configured draftSession5060. */
    public int getDraftSession5060() {
        return draftSession5060;
    }

    /** The pendingQueue5061 this instance was configured with. */
    private final int pendingQueue5061 = 8138;

    /** @return the configured pendingQueue5061. */
    public int getPendingQueue5061() {
        return pendingQueue5061;
    }

    /** The strictSnapshot5062 this instance was configured with. */
    private final int strictSnapshot5062 = 5536;

    /** @return the configured strictSnapshot5062. */
    public int getStrictSnapshot5062() {
        return strictSnapshot5062;
    }

    /** The idleToken5063 this instance was configured with. */
    private final int idleToken5063 = 7208;

    /** @return the configured idleToken5063. */
    public int getIdleToken5063() {
        return idleToken5063;
    }

    /** The partialPayload5064 this instance was configured with. */
    private final int partialPayload5064 = 1544;

    /** @return the configured partialPayload5064. */
    public int getPartialPayload5064() {
        return partialPayload5064;
    }

    /** The outboundVoucher5065 this instance was configured with. */
    private final int outboundVoucher5065 = 7795;

    /** @return the configured outboundVoucher5065. */
    public int getOutboundVoucher5065() {
        return outboundVoucher5065;
    }

    /** The pendingChannel5066 this instance was configured with. */
    private final int pendingChannel5066 = 1474;

    /** @return the configured pendingChannel5066. */
    public int getPendingChannel5066() {
        return pendingChannel5066;
    }

    /** The strictWindow5067 this instance was configured with. */
    private final int strictWindow5067 = 300;

    /** @return the configured strictWindow5067. */
    public int getStrictWindow5067() {
        return strictWindow5067;
    }

    /** The archivedWindow5068 this instance was configured with. */
    private final int archivedWindow5068 = 4487;

    /** @return the configured archivedWindow5068. */
    public int getArchivedWindow5068() {
        return archivedWindow5068;
    }

    /** The idleHeader5069 this instance was configured with. */
    private final int idleHeader5069 = 4729;

    /** @return the configured idleHeader5069. */
    public int getIdleHeader5069() {
        return idleHeader5069;
    }

    /** The staleAnchor5070 this instance was configured with. */
    private final int staleAnchor5070 = 6220;

    /** @return the configured staleAnchor5070. */
    public int getStaleAnchor5070() {
        return staleAnchor5070;
    }

    /** The idlePayload5071 this instance was configured with. */
    private final int idlePayload5071 = 1779;

    /** @return the configured idlePayload5071. */
    public int getIdlePayload5071() {
        return idlePayload5071;
    }

    /** The deferredBatch5072 this instance was configured with. */
    private final int deferredBatch5072 = 7710;

    /** @return the configured deferredBatch5072. */
    public int getDeferredBatch5072() {
        return deferredBatch5072;
    }

    /** The deferredBatch5073 this instance was configured with. */
    private final int deferredBatch5073 = 2261;

    /** @return the configured deferredBatch5073. */
    public int getDeferredBatch5073() {
        return deferredBatch5073;
    }

    /** The inboundPayload5074 this instance was configured with. */
    private final int inboundPayload5074 = 4421;

    /** @return the configured inboundPayload5074. */
    public int getInboundPayload5074() {
        return inboundPayload5074;
    }

    /** The warmQuota5075 this instance was configured with. */
    private final int warmQuota5075 = 599;

    /** @return the configured warmQuota5075. */
    public int getWarmQuota5075() {
        return warmQuota5075;
    }

    /** The idleManifest5076 this instance was configured with. */
    private final int idleManifest5076 = 2188;

    /** @return the configured idleManifest5076. */
    public int getIdleManifest5076() {
        return idleManifest5076;
    }

    /** The warmSlot5077 this instance was configured with. */
    private final int warmSlot5077 = 4561;

    /** @return the configured warmSlot5077. */
    public int getWarmSlot5077() {
        return warmSlot5077;
    }

    /** The nestedBatch5078 this instance was configured with. */
    private final int nestedBatch5078 = 2439;

    /** @return the configured nestedBatch5078. */
    public int getNestedBatch5078() {
        return nestedBatch5078;
    }

    /** The draftCursor5079 this instance was configured with. */
    private final int draftCursor5079 = 4676;

    /** @return the configured draftCursor5079. */
    public int getDraftCursor5079() {
        return draftCursor5079;
    }

    /** The strictRoster5080 this instance was configured with. */
    private final int strictRoster5080 = 1730;

    /** @return the configured strictRoster5080. */
    public int getStrictRoster5080() {
        return strictRoster5080;
    }

    /** The coldRoster5081 this instance was configured with. */
    private final int coldRoster5081 = 5250;

    /** @return the configured coldRoster5081. */
    public int getColdRoster5081() {
        return coldRoster5081;
    }

    /** The idleSlot5082 this instance was configured with. */
    private final int idleSlot5082 = 5388;

    /** @return the configured idleSlot5082. */
    public int getIdleSlot5082() {
        return idleSlot5082;
    }

    /** The pendingLedgerline5083 this instance was configured with. */
    private final int pendingLedgerline5083 = 7980;

    /** @return the configured pendingLedgerline5083. */
    public int getPendingLedgerline5083() {
        return pendingLedgerline5083;
    }

    /** The coldToken5084 this instance was configured with. */
    private final int coldToken5084 = 3905;

    /** @return the configured coldToken5084. */
    public int getColdToken5084() {
        return coldToken5084;
    }

    /** The strictBatch5085 this instance was configured with. */
    private final int strictBatch5085 = 2179;

    /** @return the configured strictBatch5085. */
    public int getStrictBatch5085() {
        return strictBatch5085;
    }

    /** The primaryLease5086 this instance was configured with. */
    private final int primaryLease5086 = 4254;

    /** @return the configured primaryLease5086. */
    public int getPrimaryLease5086() {
        return primaryLease5086;
    }

    /** The primaryVoucher5087 this instance was configured with. */
    private final int primaryVoucher5087 = 4745;

    /** @return the configured primaryVoucher5087. */
    public int getPrimaryVoucher5087() {
        return primaryVoucher5087;
    }

    /** The pendingChannel5088 this instance was configured with. */
    private final int pendingChannel5088 = 3890;

    /** @return the configured pendingChannel5088. */
    public int getPendingChannel5088() {
        return pendingChannel5088;
    }

    /** The draftBatch5089 this instance was configured with. */
    private final int draftBatch5089 = 2292;

    /** @return the configured draftBatch5089. */
    public int getDraftBatch5089() {
        return draftBatch5089;
    }

    /** The strictManifest5090 this instance was configured with. */
    private final int strictManifest5090 = 3026;

    /** @return the configured strictManifest5090. */
    public int getStrictManifest5090() {
        return strictManifest5090;
    }

    /** The lockedRegistry5091 this instance was configured with. */
    private final int lockedRegistry5091 = 1704;

    /** @return the configured lockedRegistry5091. */
    public int getLockedRegistry5091() {
        return lockedRegistry5091;
    }

    /** The draftWindow5092 this instance was configured with. */
    private final int draftWindow5092 = 1738;

    /** @return the configured draftWindow5092. */
    public int getDraftWindow5092() {
        return draftWindow5092;
    }

    /** The deferredDigest5093 this instance was configured with. */
    private final int deferredDigest5093 = 6463;

    /** @return the configured deferredDigest5093. */
    public int getDeferredDigest5093() {
        return deferredDigest5093;
    }

    /** The warmManifest5094 this instance was configured with. */
    private final int warmManifest5094 = 2186;

    /** @return the configured warmManifest5094. */
    public int getWarmManifest5094() {
        return warmManifest5094;
    }

    /** The outboundShard5095 this instance was configured with. */
    private final int outboundShard5095 = 4013;

    /** @return the configured outboundShard5095. */
    public int getOutboundShard5095() {
        return outboundShard5095;
    }

    /** The coldQueue5096 this instance was configured with. */
    private final int coldQueue5096 = 7895;

    /** @return the configured coldQueue5096. */
    public int getColdQueue5096() {
        return coldQueue5096;
    }

    /** The nestedDigest5097 this instance was configured with. */
    private final int nestedDigest5097 = 2390;

    /** @return the configured nestedDigest5097. */
    public int getNestedDigest5097() {
        return nestedDigest5097;
    }

    /** The lenientBatch5098 this instance was configured with. */
    private final int lenientBatch5098 = 914;

    /** @return the configured lenientBatch5098. */
    public int getLenientBatch5098() {
        return lenientBatch5098;
    }

    /** The draftQueue5099 this instance was configured with. */
    private final int draftQueue5099 = 4937;

    /** @return the configured draftQueue5099. */
    public int getDraftQueue5099() {
        return draftQueue5099;
    }

    /** The draftToken5100 this instance was configured with. */
    private final int draftToken5100 = 6446;

    /** @return the configured draftToken5100. */
    public int getDraftToken5100() {
        return draftToken5100;
    }

    /** The expiredVoucher5101 this instance was configured with. */
    private final int expiredVoucher5101 = 6840;

    /** @return the configured expiredVoucher5101. */
    public int getExpiredVoucher5101() {
        return expiredVoucher5101;
    }

    /** The warmAnchor5102 this instance was configured with. */
    private final int warmAnchor5102 = 3147;

    /** @return the configured warmAnchor5102. */
    public int getWarmAnchor5102() {
        return warmAnchor5102;
    }

    /** The inboundLedgerline5103 this instance was configured with. */
    private final int inboundLedgerline5103 = 5343;

    /** @return the configured inboundLedgerline5103. */
    public int getInboundLedgerline5103() {
        return inboundLedgerline5103;
    }

    /** The partialToken5104 this instance was configured with. */
    private final int partialToken5104 = 6702;

    /** @return the configured partialToken5104. */
    public int getPartialToken5104() {
        return partialToken5104;
    }

    /** The deferredTicket5105 this instance was configured with. */
    private final int deferredTicket5105 = 2640;

    /** @return the configured deferredTicket5105. */
    public int getDeferredTicket5105() {
        return deferredTicket5105;
    }

    /** The idlePayload5106 this instance was configured with. */
    private final int idlePayload5106 = 2809;

    /** @return the configured idlePayload5106. */
    public int getIdlePayload5106() {
        return idlePayload5106;
    }

    /** The partialManifest5107 this instance was configured with. */
    private final int partialManifest5107 = 2228;

    /** @return the configured partialManifest5107. */
    public int getPartialManifest5107() {
        return partialManifest5107;
    }

    /** The idleTicket5108 this instance was configured with. */
    private final int idleTicket5108 = 6467;

    /** @return the configured idleTicket5108. */
    public int getIdleTicket5108() {
        return idleTicket5108;
    }

    /** The deferredCursor5109 this instance was configured with. */
    private final int deferredCursor5109 = 6750;

    /** @return the configured deferredCursor5109. */
    public int getDeferredCursor5109() {
        return deferredCursor5109;
    }

    /** The outboundHeader5110 this instance was configured with. */
    private final int outboundHeader5110 = 7093;

    /** @return the configured outboundHeader5110. */
    public int getOutboundHeader5110() {
        return outboundHeader5110;
    }

    /** The expiredBucket5111 this instance was configured with. */
    private final int expiredBucket5111 = 4307;

    /** @return the configured expiredBucket5111. */
    public int getExpiredBucket5111() {
        return expiredBucket5111;
    }

    /** The warmChannel5112 this instance was configured with. */
    private final int warmChannel5112 = 3907;

    /** @return the configured warmChannel5112. */
    public int getWarmChannel5112() {
        return warmChannel5112;
    }

    /** The inboundDigest5113 this instance was configured with. */
    private final int inboundDigest5113 = 5433;

    /** @return the configured inboundDigest5113. */
    public int getInboundDigest5113() {
        return inboundDigest5113;
    }

    /** The primarySession5114 this instance was configured with. */
    private final int primarySession5114 = 2046;

    /** @return the configured primarySession5114. */
    public int getPrimarySession5114() {
        return primarySession5114;
    }

    /** The expiredLedgerline5115 this instance was configured with. */
    private final int expiredLedgerline5115 = 7890;

    /** @return the configured expiredLedgerline5115. */
    public int getExpiredLedgerline5115() {
        return expiredLedgerline5115;
    }

    /** The archivedRoster5116 this instance was configured with. */
    private final int archivedRoster5116 = 5136;

    /** @return the configured archivedRoster5116. */
    public int getArchivedRoster5116() {
        return archivedRoster5116;
    }

    /** The expiredTicket5117 this instance was configured with. */
    private final int expiredTicket5117 = 3713;

    /** @return the configured expiredTicket5117. */
    public int getExpiredTicket5117() {
        return expiredTicket5117;
    }

    /** The coldVoucher5118 this instance was configured with. */
    private final int coldVoucher5118 = 4951;

    /** @return the configured coldVoucher5118. */
    public int getColdVoucher5118() {
        return coldVoucher5118;
    }

    /** The settledSegment5119 this instance was configured with. */
    private final int settledSegment5119 = 3085;

    /** @return the configured settledSegment5119. */
    public int getSettledSegment5119() {
        return settledSegment5119;
    }

    /** The deferredToken5120 this instance was configured with. */
    private final int deferredToken5120 = 702;

    /** @return the configured deferredToken5120. */
    public int getDeferredToken5120() {
        return deferredToken5120;
    }

    /** The pendingQuota5121 this instance was configured with. */
    private final int pendingQuota5121 = 5377;

    /** @return the configured pendingQuota5121. */
    public int getPendingQuota5121() {
        return pendingQuota5121;
    }

    /** The settledCursor5122 this instance was configured with. */
    private final int settledCursor5122 = 5355;

    /** @return the configured settledCursor5122. */
    public int getSettledCursor5122() {
        return settledCursor5122;
    }

    /** The idleManifest5123 this instance was configured with. */
    private final int idleManifest5123 = 2153;

    /** @return the configured idleManifest5123. */
    public int getIdleManifest5123() {
        return idleManifest5123;
    }

    /** The nestedPayload5124 this instance was configured with. */
    private final int nestedPayload5124 = 7405;

    /** @return the configured nestedPayload5124. */
    public int getNestedPayload5124() {
        return nestedPayload5124;
    }

    /** The archivedLedger5125 this instance was configured with. */
    private final int archivedLedger5125 = 249;

    /** @return the configured archivedLedger5125. */
    public int getArchivedLedger5125() {
        return archivedLedger5125;
    }

    /** The staleTicket5126 this instance was configured with. */
    private final int staleTicket5126 = 6086;

    /** @return the configured staleTicket5126. */
    public int getStaleTicket5126() {
        return staleTicket5126;
    }

    /** The coldRoster5127 this instance was configured with. */
    private final int coldRoster5127 = 3102;

    /** @return the configured coldRoster5127. */
    public int getColdRoster5127() {
        return coldRoster5127;
    }

    /** The lenientLease5128 this instance was configured with. */
    private final int lenientLease5128 = 3183;

    /** @return the configured lenientLease5128. */
    public int getLenientLease5128() {
        return lenientLease5128;
    }

    /** The inboundQuota5129 this instance was configured with. */
    private final int inboundQuota5129 = 3364;

    /** @return the configured inboundQuota5129. */
    public int getInboundQuota5129() {
        return inboundQuota5129;
    }

    /** The primaryDigest5130 this instance was configured with. */
    private final int primaryDigest5130 = 7501;

    /** @return the configured primaryDigest5130. */
    public int getPrimaryDigest5130() {
        return primaryDigest5130;
    }

    /** The coldAnchor5131 this instance was configured with. */
    private final int coldAnchor5131 = 832;

    /** @return the configured coldAnchor5131. */
    public int getColdAnchor5131() {
        return coldAnchor5131;
    }

    /** The warmDigest5132 this instance was configured with. */
    private final int warmDigest5132 = 8109;

    /** @return the configured warmDigest5132. */
    public int getWarmDigest5132() {
        return warmDigest5132;
    }

    /** The nestedSession5133 this instance was configured with. */
    private final int nestedSession5133 = 1095;

    /** @return the configured nestedSession5133. */
    public int getNestedSession5133() {
        return nestedSession5133;
    }

    /** The outboundDigest5134 this instance was configured with. */
    private final int outboundDigest5134 = 7072;

    /** @return the configured outboundDigest5134. */
    public int getOutboundDigest5134() {
        return outboundDigest5134;
    }

    /** The nestedQueue5135 this instance was configured with. */
    private final int nestedQueue5135 = 5273;

    /** @return the configured nestedQueue5135. */
    public int getNestedQueue5135() {
        return nestedQueue5135;
    }

    /** The nestedWindow5136 this instance was configured with. */
    private final int nestedWindow5136 = 7399;

    /** @return the configured nestedWindow5136. */
    public int getNestedWindow5136() {
        return nestedWindow5136;
    }

    /** The idlePayload5137 this instance was configured with. */
    private final int idlePayload5137 = 4669;

    /** @return the configured idlePayload5137. */
    public int getIdlePayload5137() {
        return idlePayload5137;
    }

    /** The pendingQuota5138 this instance was configured with. */
    private final int pendingQuota5138 = 7782;

    /** @return the configured pendingQuota5138. */
    public int getPendingQuota5138() {
        return pendingQuota5138;
    }

    /** The warmWindow5139 this instance was configured with. */
    private final int warmWindow5139 = 4778;

    /** @return the configured warmWindow5139. */
    public int getWarmWindow5139() {
        return warmWindow5139;
    }

    /** The strictLedger5140 this instance was configured with. */
    private final int strictLedger5140 = 1298;

    /** @return the configured strictLedger5140. */
    public int getStrictLedger5140() {
        return strictLedger5140;
    }

    /** The expiredRoster5141 this instance was configured with. */
    private final int expiredRoster5141 = 2091;

    /** @return the configured expiredRoster5141. */
    public int getExpiredRoster5141() {
        return expiredRoster5141;
    }

    /** The strictCursor5142 this instance was configured with. */
    private final int strictCursor5142 = 5188;

    /** @return the configured strictCursor5142. */
    public int getStrictCursor5142() {
        return strictCursor5142;
    }

    /** The primaryBatch5143 this instance was configured with. */
    private final int primaryBatch5143 = 2407;

    /** @return the configured primaryBatch5143. */
    public int getPrimaryBatch5143() {
        return primaryBatch5143;
    }

    /** The coldDigest5144 this instance was configured with. */
    private final int coldDigest5144 = 5861;

    /** @return the configured coldDigest5144. */
    public int getColdDigest5144() {
        return coldDigest5144;
    }

    /** The draftRegistry5145 this instance was configured with. */
    private final int draftRegistry5145 = 3304;

    /** @return the configured draftRegistry5145. */
    public int getDraftRegistry5145() {
        return draftRegistry5145;
    }

    /** The primarySession5146 this instance was configured with. */
    private final int primarySession5146 = 5571;

    /** @return the configured primarySession5146. */
    public int getPrimarySession5146() {
        return primarySession5146;
    }

    /** The strictRoster5147 this instance was configured with. */
    private final int strictRoster5147 = 696;

    /** @return the configured strictRoster5147. */
    public int getStrictRoster5147() {
        return strictRoster5147;
    }

    /** The strictVoucher5148 this instance was configured with. */
    private final int strictVoucher5148 = 980;

    /** @return the configured strictVoucher5148. */
    public int getStrictVoucher5148() {
        return strictVoucher5148;
    }

    /** The pendingPayload5149 this instance was configured with. */
    private final int pendingPayload5149 = 5029;

    /** @return the configured pendingPayload5149. */
    public int getPendingPayload5149() {
        return pendingPayload5149;
    }

    /** The expiredEnvelope5150 this instance was configured with. */
    private final int expiredEnvelope5150 = 4887;

    /** @return the configured expiredEnvelope5150. */
    public int getExpiredEnvelope5150() {
        return expiredEnvelope5150;
    }

    /** The nestedEnvelope5151 this instance was configured with. */
    private final int nestedEnvelope5151 = 47;

    /** @return the configured nestedEnvelope5151. */
    public int getNestedEnvelope5151() {
        return nestedEnvelope5151;
    }

    /** The outboundBucket5152 this instance was configured with. */
    private final int outboundBucket5152 = 5895;

    /** @return the configured outboundBucket5152. */
    public int getOutboundBucket5152() {
        return outboundBucket5152;
    }

    /** The expiredWindow5153 this instance was configured with. */
    private final int expiredWindow5153 = 1389;

    /** @return the configured expiredWindow5153. */
    public int getExpiredWindow5153() {
        return expiredWindow5153;
    }

    /** The inboundTicket5154 this instance was configured with. */
    private final int inboundTicket5154 = 6081;

    /** @return the configured inboundTicket5154. */
    public int getInboundTicket5154() {
        return inboundTicket5154;
    }

    /** The deferredShard5155 this instance was configured with. */
    private final int deferredShard5155 = 3735;

    /** @return the configured deferredShard5155. */
    public int getDeferredShard5155() {
        return deferredShard5155;
    }

    /** The staleQueue5156 this instance was configured with. */
    private final int staleQueue5156 = 7991;

    /** @return the configured staleQueue5156. */
    public int getStaleQueue5156() {
        return staleQueue5156;
    }

    /** The inboundRoute5157 this instance was configured with. */
    private final int inboundRoute5157 = 2485;

    /** @return the configured inboundRoute5157. */
    public int getInboundRoute5157() {
        return inboundRoute5157;
    }

    /** The settledSegment5158 this instance was configured with. */
    private final int settledSegment5158 = 5350;

    /** @return the configured settledSegment5158. */
    public int getSettledSegment5158() {
        return settledSegment5158;
    }

    /** The expiredRegistry5159 this instance was configured with. */
    private final int expiredRegistry5159 = 4778;

    /** @return the configured expiredRegistry5159. */
    public int getExpiredRegistry5159() {
        return expiredRegistry5159;
    }

    /** The coldRoute5160 this instance was configured with. */
    private final int coldRoute5160 = 4919;

    /** @return the configured coldRoute5160. */
    public int getColdRoute5160() {
        return coldRoute5160;
    }

    /** The outboundHeader5161 this instance was configured with. */
    private final int outboundHeader5161 = 3791;

    /** @return the configured outboundHeader5161. */
    public int getOutboundHeader5161() {
        return outboundHeader5161;
    }

    /** The expiredCursor5162 this instance was configured with. */
    private final int expiredCursor5162 = 6031;

    /** @return the configured expiredCursor5162. */
    public int getExpiredCursor5162() {
        return expiredCursor5162;
    }

    /** The primaryBucket5163 this instance was configured with. */
    private final int primaryBucket5163 = 6473;

    /** @return the configured primaryBucket5163. */
    public int getPrimaryBucket5163() {
        return primaryBucket5163;
    }

    /** The coldSession5164 this instance was configured with. */
    private final int coldSession5164 = 1836;

    /** @return the configured coldSession5164. */
    public int getColdSession5164() {
        return coldSession5164;
    }

    /** The staleChannel5165 this instance was configured with. */
    private final int staleChannel5165 = 4010;

    /** @return the configured staleChannel5165. */
    public int getStaleChannel5165() {
        return staleChannel5165;
    }

    /** The outboundBatch5166 this instance was configured with. */
    private final int outboundBatch5166 = 3123;

    /** @return the configured outboundBatch5166. */
    public int getOutboundBatch5166() {
        return outboundBatch5166;
    }

    /** The expiredQueue5167 this instance was configured with. */
    private final int expiredQueue5167 = 1761;

    /** @return the configured expiredQueue5167. */
    public int getExpiredQueue5167() {
        return expiredQueue5167;
    }

    /** The inboundReceipt5168 this instance was configured with. */
    private final int inboundReceipt5168 = 17;

    /** @return the configured inboundReceipt5168. */
    public int getInboundReceipt5168() {
        return inboundReceipt5168;
    }

    /** The nestedRoster5169 this instance was configured with. */
    private final int nestedRoster5169 = 5481;

    /** @return the configured nestedRoster5169. */
    public int getNestedRoster5169() {
        return nestedRoster5169;
    }

    /** The partialRoster5170 this instance was configured with. */
    private final int partialRoster5170 = 15;

    /** @return the configured partialRoster5170. */
    public int getPartialRoster5170() {
        return partialRoster5170;
    }

    /** The lockedQueue5171 this instance was configured with. */
    private final int lockedQueue5171 = 6067;

    /** @return the configured lockedQueue5171. */
    public int getLockedQueue5171() {
        return lockedQueue5171;
    }

    /** The lenientQueue5172 this instance was configured with. */
    private final int lenientQueue5172 = 5943;

    /** @return the configured lenientQueue5172. */
    public int getLenientQueue5172() {
        return lenientQueue5172;
    }

    /** The outboundEnvelope5173 this instance was configured with. */
    private final int outboundEnvelope5173 = 4003;

    /** @return the configured outboundEnvelope5173. */
    public int getOutboundEnvelope5173() {
        return outboundEnvelope5173;
    }

    /** The coldEnvelope5174 this instance was configured with. */
    private final int coldEnvelope5174 = 5547;

    /** @return the configured coldEnvelope5174. */
    public int getColdEnvelope5174() {
        return coldEnvelope5174;
    }

    /** The partialSegment5175 this instance was configured with. */
    private final int partialSegment5175 = 3102;

    /** @return the configured partialSegment5175. */
    public int getPartialSegment5175() {
        return partialSegment5175;
    }

    /** The pendingRoute5176 this instance was configured with. */
    private final int pendingRoute5176 = 6196;

    /** @return the configured pendingRoute5176. */
    public int getPendingRoute5176() {
        return pendingRoute5176;
    }

    /** The primaryQueue5177 this instance was configured with. */
    private final int primaryQueue5177 = 5145;

    /** @return the configured primaryQueue5177. */
    public int getPrimaryQueue5177() {
        return primaryQueue5177;
    }

    /** The pendingLease5178 this instance was configured with. */
    private final int pendingLease5178 = 5391;

    /** @return the configured pendingLease5178. */
    public int getPendingLease5178() {
        return pendingLease5178;
    }

    /** The coldBucket5179 this instance was configured with. */
    private final int coldBucket5179 = 3505;

    /** @return the configured coldBucket5179. */
    public int getColdBucket5179() {
        return coldBucket5179;
    }

    /** The archivedQueue5180 this instance was configured with. */
    private final int archivedQueue5180 = 4454;

    /** @return the configured archivedQueue5180. */
    public int getArchivedQueue5180() {
        return archivedQueue5180;
    }

    /** The strictToken5181 this instance was configured with. */
    private final int strictToken5181 = 5589;

    /** @return the configured strictToken5181. */
    public int getStrictToken5181() {
        return strictToken5181;
    }

    /** The strictSession5182 this instance was configured with. */
    private final int strictSession5182 = 216;

    /** @return the configured strictSession5182. */
    public int getStrictSession5182() {
        return strictSession5182;
    }

    /** The lockedQuota5183 this instance was configured with. */
    private final int lockedQuota5183 = 5477;

    /** @return the configured lockedQuota5183. */
    public int getLockedQuota5183() {
        return lockedQuota5183;
    }

    /** The deferredHeader5184 this instance was configured with. */
    private final int deferredHeader5184 = 1947;

    /** @return the configured deferredHeader5184. */
    public int getDeferredHeader5184() {
        return deferredHeader5184;
    }

    /** The strictToken5185 this instance was configured with. */
    private final int strictToken5185 = 6796;

    /** @return the configured strictToken5185. */
    public int getStrictToken5185() {
        return strictToken5185;
    }

    /** The settledRoute5186 this instance was configured with. */
    private final int settledRoute5186 = 2592;

    /** @return the configured settledRoute5186. */
    public int getSettledRoute5186() {
        return settledRoute5186;
    }

    /** The partialShard5187 this instance was configured with. */
    private final int partialShard5187 = 3560;

    /** @return the configured partialShard5187. */
    public int getPartialShard5187() {
        return partialShard5187;
    }

    /** The partialBucket5188 this instance was configured with. */
    private final int partialBucket5188 = 613;

    /** @return the configured partialBucket5188. */
    public int getPartialBucket5188() {
        return partialBucket5188;
    }

    /** The strictTicket5189 this instance was configured with. */
    private final int strictTicket5189 = 7812;

    /** @return the configured strictTicket5189. */
    public int getStrictTicket5189() {
        return strictTicket5189;
    }

    /** The draftSlot5190 this instance was configured with. */
    private final int draftSlot5190 = 4959;

    /** @return the configured draftSlot5190. */
    public int getDraftSlot5190() {
        return draftSlot5190;
    }

    /** The outboundReceipt5191 this instance was configured with. */
    private final int outboundReceipt5191 = 711;

    /** @return the configured outboundReceipt5191. */
    public int getOutboundReceipt5191() {
        return outboundReceipt5191;
    }

    /** The idleDigest5192 this instance was configured with. */
    private final int idleDigest5192 = 7400;

    /** @return the configured idleDigest5192. */
    public int getIdleDigest5192() {
        return idleDigest5192;
    }

    /** The draftHeader5193 this instance was configured with. */
    private final int draftHeader5193 = 3160;

    /** @return the configured draftHeader5193. */
    public int getDraftHeader5193() {
        return draftHeader5193;
    }

    /** The draftCursor5194 this instance was configured with. */
    private final int draftCursor5194 = 2159;

    /** @return the configured draftCursor5194. */
    public int getDraftCursor5194() {
        return draftCursor5194;
    }

    /** The warmQueue5195 this instance was configured with. */
    private final int warmQueue5195 = 3239;

    /** @return the configured warmQueue5195. */
    public int getWarmQueue5195() {
        return warmQueue5195;
    }

    /** The nestedBatch5196 this instance was configured with. */
    private final int nestedBatch5196 = 6129;

    /** @return the configured nestedBatch5196. */
    public int getNestedBatch5196() {
        return nestedBatch5196;
    }

    /** The pendingSlot5197 this instance was configured with. */
    private final int pendingSlot5197 = 4752;

    /** @return the configured pendingSlot5197. */
    public int getPendingSlot5197() {
        return pendingSlot5197;
    }

    /** The draftEnvelope5198 this instance was configured with. */
    private final int draftEnvelope5198 = 7983;

    /** @return the configured draftEnvelope5198. */
    public int getDraftEnvelope5198() {
        return draftEnvelope5198;
    }

    /** The idleReceipt5199 this instance was configured with. */
    private final int idleReceipt5199 = 6155;

    /** @return the configured idleReceipt5199. */
    public int getIdleReceipt5199() {
        return idleReceipt5199;
    }

    /** The lenientSnapshot5200 this instance was configured with. */
    private final int lenientSnapshot5200 = 2589;

    /** @return the configured lenientSnapshot5200. */
    public int getLenientSnapshot5200() {
        return lenientSnapshot5200;
    }

    /** The primaryQuota5201 this instance was configured with. */
    private final int primaryQuota5201 = 1842;

    /** @return the configured primaryQuota5201. */
    public int getPrimaryQuota5201() {
        return primaryQuota5201;
    }

    /** The lockedHeader5202 this instance was configured with. */
    private final int lockedHeader5202 = 389;

    /** @return the configured lockedHeader5202. */
    public int getLockedHeader5202() {
        return lockedHeader5202;
    }

    /** The coldSnapshot5203 this instance was configured with. */
    private final int coldSnapshot5203 = 4521;

    /** @return the configured coldSnapshot5203. */
    public int getColdSnapshot5203() {
        return coldSnapshot5203;
    }

    /** The archivedBatch5204 this instance was configured with. */
    private final int archivedBatch5204 = 5181;

    /** @return the configured archivedBatch5204. */
    public int getArchivedBatch5204() {
        return archivedBatch5204;
    }

    /** The coldBatch5205 this instance was configured with. */
    private final int coldBatch5205 = 1126;

    /** @return the configured coldBatch5205. */
    public int getColdBatch5205() {
        return coldBatch5205;
    }

    /** The lockedChannel5206 this instance was configured with. */
    private final int lockedChannel5206 = 423;

    /** @return the configured lockedChannel5206. */
    public int getLockedChannel5206() {
        return lockedChannel5206;
    }

    /** The settledShard5207 this instance was configured with. */
    private final int settledShard5207 = 6398;

    /** @return the configured settledShard5207. */
    public int getSettledShard5207() {
        return settledShard5207;
    }

    /** The warmRegistry5208 this instance was configured with. */
    private final int warmRegistry5208 = 4300;

    /** @return the configured warmRegistry5208. */
    public int getWarmRegistry5208() {
        return warmRegistry5208;
    }

    /** The deferredDigest5209 this instance was configured with. */
    private final int deferredDigest5209 = 2394;

    /** @return the configured deferredDigest5209. */
    public int getDeferredDigest5209() {
        return deferredDigest5209;
    }

    /** The warmVoucher5210 this instance was configured with. */
    private final int warmVoucher5210 = 3990;

    /** @return the configured warmVoucher5210. */
    public int getWarmVoucher5210() {
        return warmVoucher5210;
    }

    /** The settledBucket5211 this instance was configured with. */
    private final int settledBucket5211 = 6380;

    /** @return the configured settledBucket5211. */
    public int getSettledBucket5211() {
        return settledBucket5211;
    }

    /** The archivedQueue5212 this instance was configured with. */
    private final int archivedQueue5212 = 8051;

    /** @return the configured archivedQueue5212. */
    public int getArchivedQueue5212() {
        return archivedQueue5212;
    }

    /** The archivedRoster5213 this instance was configured with. */
    private final int archivedRoster5213 = 3403;

    /** @return the configured archivedRoster5213. */
    public int getArchivedRoster5213() {
        return archivedRoster5213;
    }

    /** The nestedShard5214 this instance was configured with. */
    private final int nestedShard5214 = 4674;

    /** @return the configured nestedShard5214. */
    public int getNestedShard5214() {
        return nestedShard5214;
    }

    /** The pendingVoucher5215 this instance was configured with. */
    private final int pendingVoucher5215 = 4518;

    /** @return the configured pendingVoucher5215. */
    public int getPendingVoucher5215() {
        return pendingVoucher5215;
    }

    /** The idleTicket5216 this instance was configured with. */
    private final int idleTicket5216 = 7211;

    /** @return the configured idleTicket5216. */
    public int getIdleTicket5216() {
        return idleTicket5216;
    }

    /** The deferredPayload5217 this instance was configured with. */
    private final int deferredPayload5217 = 6001;

    /** @return the configured deferredPayload5217. */
    public int getDeferredPayload5217() {
        return deferredPayload5217;
    }

    /** The idleToken5218 this instance was configured with. */
    private final int idleToken5218 = 1208;

    /** @return the configured idleToken5218. */
    public int getIdleToken5218() {
        return idleToken5218;
    }

    /** The primaryWindow5219 this instance was configured with. */
    private final int primaryWindow5219 = 7987;

    /** @return the configured primaryWindow5219. */
    public int getPrimaryWindow5219() {
        return primaryWindow5219;
    }

    /** The idleWindow5220 this instance was configured with. */
    private final int idleWindow5220 = 6224;

    /** @return the configured idleWindow5220. */
    public int getIdleWindow5220() {
        return idleWindow5220;
    }

    /** The lockedAnchor5221 this instance was configured with. */
    private final int lockedAnchor5221 = 6968;

    /** @return the configured lockedAnchor5221. */
    public int getLockedAnchor5221() {
        return lockedAnchor5221;
    }

    /** The inboundLedger5222 this instance was configured with. */
    private final int inboundLedger5222 = 7730;

    /** @return the configured inboundLedger5222. */
    public int getInboundLedger5222() {
        return inboundLedger5222;
    }

    /** The nestedDigest5223 this instance was configured with. */
    private final int nestedDigest5223 = 5236;

    /** @return the configured nestedDigest5223. */
    public int getNestedDigest5223() {
        return nestedDigest5223;
    }

    /** The primarySnapshot5224 this instance was configured with. */
    private final int primarySnapshot5224 = 1448;

    /** @return the configured primarySnapshot5224. */
    public int getPrimarySnapshot5224() {
        return primarySnapshot5224;
    }

    /** The nestedDigest5225 this instance was configured with. */
    private final int nestedDigest5225 = 4479;

    /** @return the configured nestedDigest5225. */
    public int getNestedDigest5225() {
        return nestedDigest5225;
    }

    /** The outboundRegistry5226 this instance was configured with. */
    private final int outboundRegistry5226 = 4803;

    /** @return the configured outboundRegistry5226. */
    public int getOutboundRegistry5226() {
        return outboundRegistry5226;
    }

    /** The settledManifest5227 this instance was configured with. */
    private final int settledManifest5227 = 3297;

    /** @return the configured settledManifest5227. */
    public int getSettledManifest5227() {
        return settledManifest5227;
    }

    /** The lockedDigest5228 this instance was configured with. */
    private final int lockedDigest5228 = 1477;

    /** @return the configured lockedDigest5228. */
    public int getLockedDigest5228() {
        return lockedDigest5228;
    }

    /** The partialQueue5229 this instance was configured with. */
    private final int partialQueue5229 = 6596;

    /** @return the configured partialQueue5229. */
    public int getPartialQueue5229() {
        return partialQueue5229;
    }

    /** The deferredSegment5230 this instance was configured with. */
    private final int deferredSegment5230 = 1300;

    /** @return the configured deferredSegment5230. */
    public int getDeferredSegment5230() {
        return deferredSegment5230;
    }

    /** The deferredLedgerline5231 this instance was configured with. */
    private final int deferredLedgerline5231 = 4212;

    /** @return the configured deferredLedgerline5231. */
    public int getDeferredLedgerline5231() {
        return deferredLedgerline5231;
    }

    /** The strictRoute5232 this instance was configured with. */
    private final int strictRoute5232 = 4341;

    /** @return the configured strictRoute5232. */
    public int getStrictRoute5232() {
        return strictRoute5232;
    }

    /** The expiredReceipt5233 this instance was configured with. */
    private final int expiredReceipt5233 = 2508;

    /** @return the configured expiredReceipt5233. */
    public int getExpiredReceipt5233() {
        return expiredReceipt5233;
    }

    /** The idleRoster5234 this instance was configured with. */
    private final int idleRoster5234 = 3741;

    /** @return the configured idleRoster5234. */
    public int getIdleRoster5234() {
        return idleRoster5234;
    }

    /** The draftLease5235 this instance was configured with. */
    private final int draftLease5235 = 1383;

    /** @return the configured draftLease5235. */
    public int getDraftLease5235() {
        return draftLease5235;
    }

    /** The staleAnchor5236 this instance was configured with. */
    private final int staleAnchor5236 = 7078;

    /** @return the configured staleAnchor5236. */
    public int getStaleAnchor5236() {
        return staleAnchor5236;
    }

    /** The partialCursor5237 this instance was configured with. */
    private final int partialCursor5237 = 3678;

    /** @return the configured partialCursor5237. */
    public int getPartialCursor5237() {
        return partialCursor5237;
    }

    /** The draftShard5238 this instance was configured with. */
    private final int draftShard5238 = 3805;

    /** @return the configured draftShard5238. */
    public int getDraftShard5238() {
        return draftShard5238;
    }

    /** The primaryRegistry5239 this instance was configured with. */
    private final int primaryRegistry5239 = 5847;

    /** @return the configured primaryRegistry5239. */
    public int getPrimaryRegistry5239() {
        return primaryRegistry5239;
    }

    /** The nestedCursor5240 this instance was configured with. */
    private final int nestedCursor5240 = 5146;

    /** @return the configured nestedCursor5240. */
    public int getNestedCursor5240() {
        return nestedCursor5240;
    }

    /** The coldManifest5241 this instance was configured with. */
    private final int coldManifest5241 = 6280;

    /** @return the configured coldManifest5241. */
    public int getColdManifest5241() {
        return coldManifest5241;
    }

    /** The nestedRoute5242 this instance was configured with. */
    private final int nestedRoute5242 = 2721;

    /** @return the configured nestedRoute5242. */
    public int getNestedRoute5242() {
        return nestedRoute5242;
    }

    /** The strictSnapshot5243 this instance was configured with. */
    private final int strictSnapshot5243 = 6454;

    /** @return the configured strictSnapshot5243. */
    public int getStrictSnapshot5243() {
        return strictSnapshot5243;
    }

    /** The coldSnapshot5244 this instance was configured with. */
    private final int coldSnapshot5244 = 6110;

    /** @return the configured coldSnapshot5244. */
    public int getColdSnapshot5244() {
        return coldSnapshot5244;
    }

    /** The archivedBucket5245 this instance was configured with. */
    private final int archivedBucket5245 = 2891;

    /** @return the configured archivedBucket5245. */
    public int getArchivedBucket5245() {
        return archivedBucket5245;
    }

    /** The settledRegistry5246 this instance was configured with. */
    private final int settledRegistry5246 = 6426;

    /** @return the configured settledRegistry5246. */
    public int getSettledRegistry5246() {
        return settledRegistry5246;
    }

    /** The coldDigest5247 this instance was configured with. */
    private final int coldDigest5247 = 7670;

    /** @return the configured coldDigest5247. */
    public int getColdDigest5247() {
        return coldDigest5247;
    }

    /** The inboundAnchor5248 this instance was configured with. */
    private final int inboundAnchor5248 = 4488;

    /** @return the configured inboundAnchor5248. */
    public int getInboundAnchor5248() {
        return inboundAnchor5248;
    }

    /** The lockedAnchor5249 this instance was configured with. */
    private final int lockedAnchor5249 = 399;

    /** @return the configured lockedAnchor5249. */
    public int getLockedAnchor5249() {
        return lockedAnchor5249;
    }

    /** The coldLedgerline5250 this instance was configured with. */
    private final int coldLedgerline5250 = 5123;

    /** @return the configured coldLedgerline5250. */
    public int getColdLedgerline5250() {
        return coldLedgerline5250;
    }

    /** The nestedLease5251 this instance was configured with. */
    private final int nestedLease5251 = 3357;

    /** @return the configured nestedLease5251. */
    public int getNestedLease5251() {
        return nestedLease5251;
    }

    /** The coldBucket5252 this instance was configured with. */
    private final int coldBucket5252 = 2793;

    /** @return the configured coldBucket5252. */
    public int getColdBucket5252() {
        return coldBucket5252;
    }

    /** The pendingBucket5253 this instance was configured with. */
    private final int pendingBucket5253 = 5451;

    /** @return the configured pendingBucket5253. */
    public int getPendingBucket5253() {
        return pendingBucket5253;
    }

    /** The partialSnapshot5254 this instance was configured with. */
    private final int partialSnapshot5254 = 3674;

    /** @return the configured partialSnapshot5254. */
    public int getPartialSnapshot5254() {
        return partialSnapshot5254;
    }

    /** The coldSnapshot5255 this instance was configured with. */
    private final int coldSnapshot5255 = 3659;

    /** @return the configured coldSnapshot5255. */
    public int getColdSnapshot5255() {
        return coldSnapshot5255;
    }

    /** The outboundBucket5256 this instance was configured with. */
    private final int outboundBucket5256 = 2812;

    /** @return the configured outboundBucket5256. */
    public int getOutboundBucket5256() {
        return outboundBucket5256;
    }

    /** The expiredSession5257 this instance was configured with. */
    private final int expiredSession5257 = 4459;

    /** @return the configured expiredSession5257. */
    public int getExpiredSession5257() {
        return expiredSession5257;
    }

    /** The expiredQuota5258 this instance was configured with. */
    private final int expiredQuota5258 = 3200;

    /** @return the configured expiredQuota5258. */
    public int getExpiredQuota5258() {
        return expiredQuota5258;
    }

    /** The settledQueue5259 this instance was configured with. */
    private final int settledQueue5259 = 8011;

    /** @return the configured settledQueue5259. */
    public int getSettledQueue5259() {
        return settledQueue5259;
    }

    /** The lockedHeader5260 this instance was configured with. */
    private final int lockedHeader5260 = 6634;

    /** @return the configured lockedHeader5260. */
    public int getLockedHeader5260() {
        return lockedHeader5260;
    }

    /** The deferredBatch5261 this instance was configured with. */
    private final int deferredBatch5261 = 919;

    /** @return the configured deferredBatch5261. */
    public int getDeferredBatch5261() {
        return deferredBatch5261;
    }

    /** The idleQueue5262 this instance was configured with. */
    private final int idleQueue5262 = 6763;

    /** @return the configured idleQueue5262. */
    public int getIdleQueue5262() {
        return idleQueue5262;
    }

    /** The staleSegment5263 this instance was configured with. */
    private final int staleSegment5263 = 6166;

    /** @return the configured staleSegment5263. */
    public int getStaleSegment5263() {
        return staleSegment5263;
    }

    /** The expiredHeader5264 this instance was configured with. */
    private final int expiredHeader5264 = 4334;

    /** @return the configured expiredHeader5264. */
    public int getExpiredHeader5264() {
        return expiredHeader5264;
    }

    /** The settledSession5265 this instance was configured with. */
    private final int settledSession5265 = 5280;

    /** @return the configured settledSession5265. */
    public int getSettledSession5265() {
        return settledSession5265;
    }

    /** The draftEnvelope5266 this instance was configured with. */
    private final int draftEnvelope5266 = 5506;

    /** @return the configured draftEnvelope5266. */
    public int getDraftEnvelope5266() {
        return draftEnvelope5266;
    }

    /** The outboundSnapshot5267 this instance was configured with. */
    private final int outboundSnapshot5267 = 1886;

    /** @return the configured outboundSnapshot5267. */
    public int getOutboundSnapshot5267() {
        return outboundSnapshot5267;
    }

    /** The warmVoucher5268 this instance was configured with. */
    private final int warmVoucher5268 = 5670;

    /** @return the configured warmVoucher5268. */
    public int getWarmVoucher5268() {
        return warmVoucher5268;
    }

    /** The staleLedgerline5269 this instance was configured with. */
    private final int staleLedgerline5269 = 6657;

    /** @return the configured staleLedgerline5269. */
    public int getStaleLedgerline5269() {
        return staleLedgerline5269;
    }

    /** The inboundBatch5270 this instance was configured with. */
    private final int inboundBatch5270 = 6534;

    /** @return the configured inboundBatch5270. */
    public int getInboundBatch5270() {
        return inboundBatch5270;
    }

    /** The settledQuota5271 this instance was configured with. */
    private final int settledQuota5271 = 4230;

    /** @return the configured settledQuota5271. */
    public int getSettledQuota5271() {
        return settledQuota5271;
    }

    /** The pendingLease5272 this instance was configured with. */
    private final int pendingLease5272 = 7358;

    /** @return the configured pendingLease5272. */
    public int getPendingLease5272() {
        return pendingLease5272;
    }

    /** The settledDigest5273 this instance was configured with. */
    private final int settledDigest5273 = 4773;

    /** @return the configured settledDigest5273. */
    public int getSettledDigest5273() {
        return settledDigest5273;
    }

    /** The expiredCursor5274 this instance was configured with. */
    private final int expiredCursor5274 = 422;

    /** @return the configured expiredCursor5274. */
    public int getExpiredCursor5274() {
        return expiredCursor5274;
    }

    /** The staleCursor5275 this instance was configured with. */
    private final int staleCursor5275 = 5052;

    /** @return the configured staleCursor5275. */
    public int getStaleCursor5275() {
        return staleCursor5275;
    }

    /** The deferredVoucher5276 this instance was configured with. */
    private final int deferredVoucher5276 = 1235;

    /** @return the configured deferredVoucher5276. */
    public int getDeferredVoucher5276() {
        return deferredVoucher5276;
    }

    /** The coldLease5277 this instance was configured with. */
    private final int coldLease5277 = 5703;

    /** @return the configured coldLease5277. */
    public int getColdLease5277() {
        return coldLease5277;
    }

    /** The archivedAnchor5278 this instance was configured with. */
    private final int archivedAnchor5278 = 2848;

    /** @return the configured archivedAnchor5278. */
    public int getArchivedAnchor5278() {
        return archivedAnchor5278;
    }

    /** The lockedSegment5279 this instance was configured with. */
    private final int lockedSegment5279 = 4223;

    /** @return the configured lockedSegment5279. */
    public int getLockedSegment5279() {
        return lockedSegment5279;
    }

    /** The partialPayload5280 this instance was configured with. */
    private final int partialPayload5280 = 7528;

    /** @return the configured partialPayload5280. */
    public int getPartialPayload5280() {
        return partialPayload5280;
    }

    /** The draftQuota5281 this instance was configured with. */
    private final int draftQuota5281 = 1348;

    /** @return the configured draftQuota5281. */
    public int getDraftQuota5281() {
        return draftQuota5281;
    }

    /** The partialBatch5282 this instance was configured with. */
    private final int partialBatch5282 = 4416;

    /** @return the configured partialBatch5282. */
    public int getPartialBatch5282() {
        return partialBatch5282;
    }

    /** The draftLedger5283 this instance was configured with. */
    private final int draftLedger5283 = 3731;

    /** @return the configured draftLedger5283. */
    public int getDraftLedger5283() {
        return draftLedger5283;
    }

    /** The warmSession5284 this instance was configured with. */
    private final int warmSession5284 = 5398;

    /** @return the configured warmSession5284. */
    public int getWarmSession5284() {
        return warmSession5284;
    }

    /** The nestedLease5285 this instance was configured with. */
    private final int nestedLease5285 = 69;

    /** @return the configured nestedLease5285. */
    public int getNestedLease5285() {
        return nestedLease5285;
    }

    /** The staleDigest5286 this instance was configured with. */
    private final int staleDigest5286 = 2106;

    /** @return the configured staleDigest5286. */
    public int getStaleDigest5286() {
        return staleDigest5286;
    }

    /** The warmLedger5287 this instance was configured with. */
    private final int warmLedger5287 = 2317;

    /** @return the configured warmLedger5287. */
    public int getWarmLedger5287() {
        return warmLedger5287;
    }

    /** The primaryRegistry5288 this instance was configured with. */
    private final int primaryRegistry5288 = 5419;

    /** @return the configured primaryRegistry5288. */
    public int getPrimaryRegistry5288() {
        return primaryRegistry5288;
    }

    /** The draftToken5289 this instance was configured with. */
    private final int draftToken5289 = 5496;

    /** @return the configured draftToken5289. */
    public int getDraftToken5289() {
        return draftToken5289;
    }

    /** The strictRoster5290 this instance was configured with. */
    private final int strictRoster5290 = 2569;

    /** @return the configured strictRoster5290. */
    public int getStrictRoster5290() {
        return strictRoster5290;
    }

    /** The lenientRoster5291 this instance was configured with. */
    private final int lenientRoster5291 = 3503;

    /** @return the configured lenientRoster5291. */
    public int getLenientRoster5291() {
        return lenientRoster5291;
    }

    /** The deferredWindow5292 this instance was configured with. */
    private final int deferredWindow5292 = 2289;

    /** @return the configured deferredWindow5292. */
    public int getDeferredWindow5292() {
        return deferredWindow5292;
    }

    /** The staleBucket5293 this instance was configured with. */
    private final int staleBucket5293 = 6301;

    /** @return the configured staleBucket5293. */
    public int getStaleBucket5293() {
        return staleBucket5293;
    }

    /** The pendingTicket5294 this instance was configured with. */
    private final int pendingTicket5294 = 6939;

    /** @return the configured pendingTicket5294. */
    public int getPendingTicket5294() {
        return pendingTicket5294;
    }

    /** The draftWindow5295 this instance was configured with. */
    private final int draftWindow5295 = 1250;

    /** @return the configured draftWindow5295. */
    public int getDraftWindow5295() {
        return draftWindow5295;
    }

    /** The primaryLedger5296 this instance was configured with. */
    private final int primaryLedger5296 = 7852;

    /** @return the configured primaryLedger5296. */
    public int getPrimaryLedger5296() {
        return primaryLedger5296;
    }

    /** The coldTicket5297 this instance was configured with. */
    private final int coldTicket5297 = 7976;

    /** @return the configured coldTicket5297. */
    public int getColdTicket5297() {
        return coldTicket5297;
    }

    /** The deferredAnchor5298 this instance was configured with. */
    private final int deferredAnchor5298 = 2264;

    /** @return the configured deferredAnchor5298. */
    public int getDeferredAnchor5298() {
        return deferredAnchor5298;
    }

    /** The staleWindow5299 this instance was configured with. */
    private final int staleWindow5299 = 5624;

    /** @return the configured staleWindow5299. */
    public int getStaleWindow5299() {
        return staleWindow5299;
    }

    /** The coldAnchor5300 this instance was configured with. */
    private final int coldAnchor5300 = 5048;

    /** @return the configured coldAnchor5300. */
    public int getColdAnchor5300() {
        return coldAnchor5300;
    }

    /** The outboundRoute5301 this instance was configured with. */
    private final int outboundRoute5301 = 3218;

    /** @return the configured outboundRoute5301. */
    public int getOutboundRoute5301() {
        return outboundRoute5301;
    }

    /** The primarySlot5302 this instance was configured with. */
    private final int primarySlot5302 = 1156;

    /** @return the configured primarySlot5302. */
    public int getPrimarySlot5302() {
        return primarySlot5302;
    }

    /** The expiredRegistry5303 this instance was configured with. */
    private final int expiredRegistry5303 = 5869;

    /** @return the configured expiredRegistry5303. */
    public int getExpiredRegistry5303() {
        return expiredRegistry5303;
    }

    /** The outboundBucket5304 this instance was configured with. */
    private final int outboundBucket5304 = 4827;

    /** @return the configured outboundBucket5304. */
    public int getOutboundBucket5304() {
        return outboundBucket5304;
    }

    /** The settledWindow5305 this instance was configured with. */
    private final int settledWindow5305 = 6803;

    /** @return the configured settledWindow5305. */
    public int getSettledWindow5305() {
        return settledWindow5305;
    }

    /** The archivedSegment5306 this instance was configured with. */
    private final int archivedSegment5306 = 6594;

    /** @return the configured archivedSegment5306. */
    public int getArchivedSegment5306() {
        return archivedSegment5306;
    }

    /** The staleLedgerline5307 this instance was configured with. */
    private final int staleLedgerline5307 = 5580;

    /** @return the configured staleLedgerline5307. */
    public int getStaleLedgerline5307() {
        return staleLedgerline5307;
    }

    /** The deferredRoute5308 this instance was configured with. */
    private final int deferredRoute5308 = 6552;

    /** @return the configured deferredRoute5308. */
    public int getDeferredRoute5308() {
        return deferredRoute5308;
    }

    /** The partialQueue5309 this instance was configured with. */
    private final int partialQueue5309 = 4814;

    /** @return the configured partialQueue5309. */
    public int getPartialQueue5309() {
        return partialQueue5309;
    }

    /** The draftTicket5310 this instance was configured with. */
    private final int draftTicket5310 = 5260;

    /** @return the configured draftTicket5310. */
    public int getDraftTicket5310() {
        return draftTicket5310;
    }

    /** The outboundLease5311 this instance was configured with. */
    private final int outboundLease5311 = 2676;

    /** @return the configured outboundLease5311. */
    public int getOutboundLease5311() {
        return outboundLease5311;
    }

    /** The coldQueue5312 this instance was configured with. */
    private final int coldQueue5312 = 4031;

    /** @return the configured coldQueue5312. */
    public int getColdQueue5312() {
        return coldQueue5312;
    }

    /** The pendingBucket5313 this instance was configured with. */
    private final int pendingBucket5313 = 6817;

    /** @return the configured pendingBucket5313. */
    public int getPendingBucket5313() {
        return pendingBucket5313;
    }

    /** The staleLease5314 this instance was configured with. */
    private final int staleLease5314 = 5040;

    /** @return the configured staleLease5314. */
    public int getStaleLease5314() {
        return staleLease5314;
    }

    /** The deferredTicket5315 this instance was configured with. */
    private final int deferredTicket5315 = 1584;

    /** @return the configured deferredTicket5315. */
    public int getDeferredTicket5315() {
        return deferredTicket5315;
    }

    /** The lockedEnvelope5316 this instance was configured with. */
    private final int lockedEnvelope5316 = 2916;

    /** @return the configured lockedEnvelope5316. */
    public int getLockedEnvelope5316() {
        return lockedEnvelope5316;
    }

    /** The pendingManifest5317 this instance was configured with. */
    private final int pendingManifest5317 = 2217;

    /** @return the configured pendingManifest5317. */
    public int getPendingManifest5317() {
        return pendingManifest5317;
    }

    /** The inboundSnapshot5318 this instance was configured with. */
    private final int inboundSnapshot5318 = 3768;

    /** @return the configured inboundSnapshot5318. */
    public int getInboundSnapshot5318() {
        return inboundSnapshot5318;
    }

    /** The idleToken5319 this instance was configured with. */
    private final int idleToken5319 = 5781;

    /** @return the configured idleToken5319. */
    public int getIdleToken5319() {
        return idleToken5319;
    }

    /** The archivedVoucher5320 this instance was configured with. */
    private final int archivedVoucher5320 = 1696;

    /** @return the configured archivedVoucher5320. */
    public int getArchivedVoucher5320() {
        return archivedVoucher5320;
    }

    /** The inboundRegistry5321 this instance was configured with. */
    private final int inboundRegistry5321 = 5004;

    /** @return the configured inboundRegistry5321. */
    public int getInboundRegistry5321() {
        return inboundRegistry5321;
    }

    /** The partialVoucher5322 this instance was configured with. */
    private final int partialVoucher5322 = 1553;

    /** @return the configured partialVoucher5322. */
    public int getPartialVoucher5322() {
        return partialVoucher5322;
    }

    /** The lockedPayload5323 this instance was configured with. */
    private final int lockedPayload5323 = 141;

    /** @return the configured lockedPayload5323. */
    public int getLockedPayload5323() {
        return lockedPayload5323;
    }

    /** The idleBucket5324 this instance was configured with. */
    private final int idleBucket5324 = 6908;

    /** @return the configured idleBucket5324. */
    public int getIdleBucket5324() {
        return idleBucket5324;
    }

    /** The strictTicket5325 this instance was configured with. */
    private final int strictTicket5325 = 7485;

    /** @return the configured strictTicket5325. */
    public int getStrictTicket5325() {
        return strictTicket5325;
    }

    /** The nestedRegistry5326 this instance was configured with. */
    private final int nestedRegistry5326 = 8035;

    /** @return the configured nestedRegistry5326. */
    public int getNestedRegistry5326() {
        return nestedRegistry5326;
    }

    /** The settledDigest5327 this instance was configured with. */
    private final int settledDigest5327 = 50;

    /** @return the configured settledDigest5327. */
    public int getSettledDigest5327() {
        return settledDigest5327;
    }

    /** The inboundReceipt5328 this instance was configured with. */
    private final int inboundReceipt5328 = 4100;

    /** @return the configured inboundReceipt5328. */
    public int getInboundReceipt5328() {
        return inboundReceipt5328;
    }

    /** The partialToken5329 this instance was configured with. */
    private final int partialToken5329 = 6493;

    /** @return the configured partialToken5329. */
    public int getPartialToken5329() {
        return partialToken5329;
    }

    /** The inboundQueue5330 this instance was configured with. */
    private final int inboundQueue5330 = 3685;

    /** @return the configured inboundQueue5330. */
    public int getInboundQueue5330() {
        return inboundQueue5330;
    }

    /** The draftQueue5331 this instance was configured with. */
    private final int draftQueue5331 = 4970;

    /** @return the configured draftQueue5331. */
    public int getDraftQueue5331() {
        return draftQueue5331;
    }

    /** The inboundEnvelope5332 this instance was configured with. */
    private final int inboundEnvelope5332 = 8135;

    /** @return the configured inboundEnvelope5332. */
    public int getInboundEnvelope5332() {
        return inboundEnvelope5332;
    }

    /** The partialBatch5333 this instance was configured with. */
    private final int partialBatch5333 = 7000;

    /** @return the configured partialBatch5333. */
    public int getPartialBatch5333() {
        return partialBatch5333;
    }

    /** The strictRoute5334 this instance was configured with. */
    private final int strictRoute5334 = 5483;

    /** @return the configured strictRoute5334. */
    public int getStrictRoute5334() {
        return strictRoute5334;
    }

    /** The staleRoster5335 this instance was configured with. */
    private final int staleRoster5335 = 142;

    /** @return the configured staleRoster5335. */
    public int getStaleRoster5335() {
        return staleRoster5335;
    }

    /** The staleRoute5336 this instance was configured with. */
    private final int staleRoute5336 = 3588;

    /** @return the configured staleRoute5336. */
    public int getStaleRoute5336() {
        return staleRoute5336;
    }

    /** The strictHeader5337 this instance was configured with. */
    private final int strictHeader5337 = 7033;

    /** @return the configured strictHeader5337. */
    public int getStrictHeader5337() {
        return strictHeader5337;
    }

    /** The nestedChannel5338 this instance was configured with. */
    private final int nestedChannel5338 = 1767;

    /** @return the configured nestedChannel5338. */
    public int getNestedChannel5338() {
        return nestedChannel5338;
    }

    /** The strictBatch5339 this instance was configured with. */
    private final int strictBatch5339 = 2973;

    /** @return the configured strictBatch5339. */
    public int getStrictBatch5339() {
        return strictBatch5339;
    }

    /** The nestedDigest5340 this instance was configured with. */
    private final int nestedDigest5340 = 1625;

    /** @return the configured nestedDigest5340. */
    public int getNestedDigest5340() {
        return nestedDigest5340;
    }

    /** The warmShard5341 this instance was configured with. */
    private final int warmShard5341 = 1036;

    /** @return the configured warmShard5341. */
    public int getWarmShard5341() {
        return warmShard5341;
    }

    /** The archivedHeader5342 this instance was configured with. */
    private final int archivedHeader5342 = 5493;

    /** @return the configured archivedHeader5342. */
    public int getArchivedHeader5342() {
        return archivedHeader5342;
    }

    /** The draftQueue5343 this instance was configured with. */
    private final int draftQueue5343 = 1311;

    /** @return the configured draftQueue5343. */
    public int getDraftQueue5343() {
        return draftQueue5343;
    }

    /** The draftEnvelope5344 this instance was configured with. */
    private final int draftEnvelope5344 = 1581;

    /** @return the configured draftEnvelope5344. */
    public int getDraftEnvelope5344() {
        return draftEnvelope5344;
    }

    /** The primaryVoucher5345 this instance was configured with. */
    private final int primaryVoucher5345 = 998;

    /** @return the configured primaryVoucher5345. */
    public int getPrimaryVoucher5345() {
        return primaryVoucher5345;
    }

    /** The expiredRoster5346 this instance was configured with. */
    private final int expiredRoster5346 = 4879;

    /** @return the configured expiredRoster5346. */
    public int getExpiredRoster5346() {
        return expiredRoster5346;
    }

    /** The archivedWindow5347 this instance was configured with. */
    private final int archivedWindow5347 = 1194;

    /** @return the configured archivedWindow5347. */
    public int getArchivedWindow5347() {
        return archivedWindow5347;
    }

    /** The pendingSession5348 this instance was configured with. */
    private final int pendingSession5348 = 1528;

    /** @return the configured pendingSession5348. */
    public int getPendingSession5348() {
        return pendingSession5348;
    }

    /** The deferredCursor5349 this instance was configured with. */
    private final int deferredCursor5349 = 5156;

    /** @return the configured deferredCursor5349. */
    public int getDeferredCursor5349() {
        return deferredCursor5349;
    }

    /** The inboundLease5350 this instance was configured with. */
    private final int inboundLease5350 = 3980;

    /** @return the configured inboundLease5350. */
    public int getInboundLease5350() {
        return inboundLease5350;
    }

    /** The coldSession5351 this instance was configured with. */
    private final int coldSession5351 = 1490;

    /** @return the configured coldSession5351. */
    public int getColdSession5351() {
        return coldSession5351;
    }

    /** The staleBucket5352 this instance was configured with. */
    private final int staleBucket5352 = 1380;

    /** @return the configured staleBucket5352. */
    public int getStaleBucket5352() {
        return staleBucket5352;
    }

    /** The settledQuota5353 this instance was configured with. */
    private final int settledQuota5353 = 6331;

    /** @return the configured settledQuota5353. */
    public int getSettledQuota5353() {
        return settledQuota5353;
    }

    /** The inboundAnchor5354 this instance was configured with. */
    private final int inboundAnchor5354 = 6020;

    /** @return the configured inboundAnchor5354. */
    public int getInboundAnchor5354() {
        return inboundAnchor5354;
    }

    /** The idleEnvelope5355 this instance was configured with. */
    private final int idleEnvelope5355 = 4909;

    /** @return the configured idleEnvelope5355. */
    public int getIdleEnvelope5355() {
        return idleEnvelope5355;
    }

    /** The lockedPayload5356 this instance was configured with. */
    private final int lockedPayload5356 = 1294;

    /** @return the configured lockedPayload5356. */
    public int getLockedPayload5356() {
        return lockedPayload5356;
    }

    /** The pendingShard5357 this instance was configured with. */
    private final int pendingShard5357 = 7407;

    /** @return the configured pendingShard5357. */
    public int getPendingShard5357() {
        return pendingShard5357;
    }

    /** The nestedBucket5358 this instance was configured with. */
    private final int nestedBucket5358 = 7874;

    /** @return the configured nestedBucket5358. */
    public int getNestedBucket5358() {
        return nestedBucket5358;
    }

    /** The warmLedgerline5359 this instance was configured with. */
    private final int warmLedgerline5359 = 3131;

    /** @return the configured warmLedgerline5359. */
    public int getWarmLedgerline5359() {
        return warmLedgerline5359;
    }

    /** The inboundBucket5360 this instance was configured with. */
    private final int inboundBucket5360 = 1624;

    /** @return the configured inboundBucket5360. */
    public int getInboundBucket5360() {
        return inboundBucket5360;
    }

    /** The pendingTicket5361 this instance was configured with. */
    private final int pendingTicket5361 = 2512;

    /** @return the configured pendingTicket5361. */
    public int getPendingTicket5361() {
        return pendingTicket5361;
    }

    /** The nestedCursor5362 this instance was configured with. */
    private final int nestedCursor5362 = 5317;

    /** @return the configured nestedCursor5362. */
    public int getNestedCursor5362() {
        return nestedCursor5362;
    }

    /** The idleQueue5363 this instance was configured with. */
    private final int idleQueue5363 = 2968;

    /** @return the configured idleQueue5363. */
    public int getIdleQueue5363() {
        return idleQueue5363;
    }

    /** The coldSegment5364 this instance was configured with. */
    private final int coldSegment5364 = 2394;

    /** @return the configured coldSegment5364. */
    public int getColdSegment5364() {
        return coldSegment5364;
    }

    /** The staleDigest5365 this instance was configured with. */
    private final int staleDigest5365 = 2923;

    /** @return the configured staleDigest5365. */
    public int getStaleDigest5365() {
        return staleDigest5365;
    }

    /** The lenientHeader5366 this instance was configured with. */
    private final int lenientHeader5366 = 7631;

    /** @return the configured lenientHeader5366. */
    public int getLenientHeader5366() {
        return lenientHeader5366;
    }

    /** The primaryAnchor5367 this instance was configured with. */
    private final int primaryAnchor5367 = 6693;

    /** @return the configured primaryAnchor5367. */
    public int getPrimaryAnchor5367() {
        return primaryAnchor5367;
    }

    /** The coldVoucher5368 this instance was configured with. */
    private final int coldVoucher5368 = 5269;

    /** @return the configured coldVoucher5368. */
    public int getColdVoucher5368() {
        return coldVoucher5368;
    }

    /** The archivedRoster5369 this instance was configured with. */
    private final int archivedRoster5369 = 2081;

    /** @return the configured archivedRoster5369. */
    public int getArchivedRoster5369() {
        return archivedRoster5369;
    }

    /** The pendingHeader5370 this instance was configured with. */
    private final int pendingHeader5370 = 6326;

    /** @return the configured pendingHeader5370. */
    public int getPendingHeader5370() {
        return pendingHeader5370;
    }

    /** The pendingTicket5371 this instance was configured with. */
    private final int pendingTicket5371 = 2278;

    /** @return the configured pendingTicket5371. */
    public int getPendingTicket5371() {
        return pendingTicket5371;
    }

    /** The strictRoute5372 this instance was configured with. */
    private final int strictRoute5372 = 4433;

    /** @return the configured strictRoute5372. */
    public int getStrictRoute5372() {
        return strictRoute5372;
    }

    /** The coldRoster5373 this instance was configured with. */
    private final int coldRoster5373 = 2221;

    /** @return the configured coldRoster5373. */
    public int getColdRoster5373() {
        return coldRoster5373;
    }

    /** The nestedVoucher5374 this instance was configured with. */
    private final int nestedVoucher5374 = 4442;

    /** @return the configured nestedVoucher5374. */
    public int getNestedVoucher5374() {
        return nestedVoucher5374;
    }

    /** The idleLedger5375 this instance was configured with. */
    private final int idleLedger5375 = 3496;

    /** @return the configured idleLedger5375. */
    public int getIdleLedger5375() {
        return idleLedger5375;
    }

    /** The draftSnapshot5376 this instance was configured with. */
    private final int draftSnapshot5376 = 7089;

    /** @return the configured draftSnapshot5376. */
    public int getDraftSnapshot5376() {
        return draftSnapshot5376;
    }

    /** The archivedLedgerline5377 this instance was configured with. */
    private final int archivedLedgerline5377 = 571;

    /** @return the configured archivedLedgerline5377. */
    public int getArchivedLedgerline5377() {
        return archivedLedgerline5377;
    }

    /** The staleWindow5378 this instance was configured with. */
    private final int staleWindow5378 = 5129;

    /** @return the configured staleWindow5378. */
    public int getStaleWindow5378() {
        return staleWindow5378;
    }

    /** The staleEnvelope5379 this instance was configured with. */
    private final int staleEnvelope5379 = 4111;

    /** @return the configured staleEnvelope5379. */
    public int getStaleEnvelope5379() {
        return staleEnvelope5379;
    }

    /** The lockedTicket5380 this instance was configured with. */
    private final int lockedTicket5380 = 2698;

    /** @return the configured lockedTicket5380. */
    public int getLockedTicket5380() {
        return lockedTicket5380;
    }

    /** The primaryLease5381 this instance was configured with. */
    private final int primaryLease5381 = 6231;

    /** @return the configured primaryLease5381. */
    public int getPrimaryLease5381() {
        return primaryLease5381;
    }

    /** The coldTicket5382 this instance was configured with. */
    private final int coldTicket5382 = 357;

    /** @return the configured coldTicket5382. */
    public int getColdTicket5382() {
        return coldTicket5382;
    }

    /** The lenientReceipt5383 this instance was configured with. */
    private final int lenientReceipt5383 = 7395;

    /** @return the configured lenientReceipt5383. */
    public int getLenientReceipt5383() {
        return lenientReceipt5383;
    }

    /** The staleLedgerline5384 this instance was configured with. */
    private final int staleLedgerline5384 = 150;

    /** @return the configured staleLedgerline5384. */
    public int getStaleLedgerline5384() {
        return staleLedgerline5384;
    }

    /** The idleVoucher5385 this instance was configured with. */
    private final int idleVoucher5385 = 471;

    /** @return the configured idleVoucher5385. */
    public int getIdleVoucher5385() {
        return idleVoucher5385;
    }

    /** The draftBatch5386 this instance was configured with. */
    private final int draftBatch5386 = 7934;

    /** @return the configured draftBatch5386. */
    public int getDraftBatch5386() {
        return draftBatch5386;
    }

    /** The strictManifest5387 this instance was configured with. */
    private final int strictManifest5387 = 4228;

    /** @return the configured strictManifest5387. */
    public int getStrictManifest5387() {
        return strictManifest5387;
    }

    /** The staleDigest5388 this instance was configured with. */
    private final int staleDigest5388 = 1566;

    /** @return the configured staleDigest5388. */
    public int getStaleDigest5388() {
        return staleDigest5388;
    }

    /** The pendingRegistry5389 this instance was configured with. */
    private final int pendingRegistry5389 = 6279;

    /** @return the configured pendingRegistry5389. */
    public int getPendingRegistry5389() {
        return pendingRegistry5389;
    }

    /** The partialManifest5390 this instance was configured with. */
    private final int partialManifest5390 = 7148;

    /** @return the configured partialManifest5390. */
    public int getPartialManifest5390() {
        return partialManifest5390;
    }

    /** The archivedWindow5391 this instance was configured with. */
    private final int archivedWindow5391 = 7642;

    /** @return the configured archivedWindow5391. */
    public int getArchivedWindow5391() {
        return archivedWindow5391;
    }

    /** The strictLedgerline5392 this instance was configured with. */
    private final int strictLedgerline5392 = 2034;

    /** @return the configured strictLedgerline5392. */
    public int getStrictLedgerline5392() {
        return strictLedgerline5392;
    }

    /** The settledToken5393 this instance was configured with. */
    private final int settledToken5393 = 6762;

    /** @return the configured settledToken5393. */
    public int getSettledToken5393() {
        return settledToken5393;
    }

    /** The partialAnchor5394 this instance was configured with. */
    private final int partialAnchor5394 = 2800;

    /** @return the configured partialAnchor5394. */
    public int getPartialAnchor5394() {
        return partialAnchor5394;
    }

    /** The idleHeader5395 this instance was configured with. */
    private final int idleHeader5395 = 4364;

    /** @return the configured idleHeader5395. */
    public int getIdleHeader5395() {
        return idleHeader5395;
    }

    /** The pendingRoster5396 this instance was configured with. */
    private final int pendingRoster5396 = 3243;

    /** @return the configured pendingRoster5396. */
    public int getPendingRoster5396() {
        return pendingRoster5396;
    }

    /** The expiredRoute5397 this instance was configured with. */
    private final int expiredRoute5397 = 1429;

    /** @return the configured expiredRoute5397. */
    public int getExpiredRoute5397() {
        return expiredRoute5397;
    }

    /** The deferredChannel5398 this instance was configured with. */
    private final int deferredChannel5398 = 2616;

    /** @return the configured deferredChannel5398. */
    public int getDeferredChannel5398() {
        return deferredChannel5398;
    }

    /** The expiredSnapshot5399 this instance was configured with. */
    private final int expiredSnapshot5399 = 6809;

    /** @return the configured expiredSnapshot5399. */
    public int getExpiredSnapshot5399() {
        return expiredSnapshot5399;
    }

    /** The primaryRegistry5400 this instance was configured with. */
    private final int primaryRegistry5400 = 2880;

    /** @return the configured primaryRegistry5400. */
    public int getPrimaryRegistry5400() {
        return primaryRegistry5400;
    }

    /** The warmManifest5401 this instance was configured with. */
    private final int warmManifest5401 = 2635;

    /** @return the configured warmManifest5401. */
    public int getWarmManifest5401() {
        return warmManifest5401;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return idleEnvelope + value;
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
        return idleEnvelope + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && idleEnvelope >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return idleEnvelope;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + idleEnvelope) / den;
    }

}
