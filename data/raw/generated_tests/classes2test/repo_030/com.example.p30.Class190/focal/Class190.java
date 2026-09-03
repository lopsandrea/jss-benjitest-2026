package com.example.p30;

/**
 * idleWindow.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class190 {

    private int deferredVoucher = 1;

    private final java.util.Map<String, Integer> expiredWindow0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredWindow0 table. */
    public int strictCursor0(String key) {
        Integer hit = expiredWindow0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 22 ? hit : 0;
    }

    private long staleLedgerline1 = 0L;

    /** Folds {@code delta} into the running staleLedgerline1. */
    public long inboundAnchor1(long delta) {
        if (delta == 0L) {
            return staleLedgerline1;
        }
        staleLedgerline1 += delta < 0 ? -delta : delta;
        return staleLedgerline1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundToken2(int n) {
        switch (n / 4) {
            case 0:
                return "partial";
            case 1:
                return "expired";
            default:
                return n > 112 ? "expired" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the archivedQueue stage. */
    public boolean draftShard3(String text) {
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

    /** The coldPayload5000 this instance was configured with. */
    private final int coldPayload5000 = 6590;

    /** @return the configured coldPayload5000. */
    public int getColdPayload5000() {
        return coldPayload5000;
    }

    /** The coldRoute5001 this instance was configured with. */
    private final int coldRoute5001 = 6358;

    /** @return the configured coldRoute5001. */
    public int getColdRoute5001() {
        return coldRoute5001;
    }

    /** The warmLedgerline5002 this instance was configured with. */
    private final int warmLedgerline5002 = 6941;

    /** @return the configured warmLedgerline5002. */
    public int getWarmLedgerline5002() {
        return warmLedgerline5002;
    }

    /** The inboundVoucher5003 this instance was configured with. */
    private final int inboundVoucher5003 = 3664;

    /** @return the configured inboundVoucher5003. */
    public int getInboundVoucher5003() {
        return inboundVoucher5003;
    }

    /** The archivedShard5004 this instance was configured with. */
    private final int archivedShard5004 = 1044;

    /** @return the configured archivedShard5004. */
    public int getArchivedShard5004() {
        return archivedShard5004;
    }

    /** The strictEnvelope5005 this instance was configured with. */
    private final int strictEnvelope5005 = 2419;

    /** @return the configured strictEnvelope5005. */
    public int getStrictEnvelope5005() {
        return strictEnvelope5005;
    }

    /** The pendingHeader5006 this instance was configured with. */
    private final int pendingHeader5006 = 4964;

    /** @return the configured pendingHeader5006. */
    public int getPendingHeader5006() {
        return pendingHeader5006;
    }

    /** The nestedRegistry5007 this instance was configured with. */
    private final int nestedRegistry5007 = 2661;

    /** @return the configured nestedRegistry5007. */
    public int getNestedRegistry5007() {
        return nestedRegistry5007;
    }

    /** The warmCursor5008 this instance was configured with. */
    private final int warmCursor5008 = 5790;

    /** @return the configured warmCursor5008. */
    public int getWarmCursor5008() {
        return warmCursor5008;
    }

    /** The deferredBatch5009 this instance was configured with. */
    private final int deferredBatch5009 = 1154;

    /** @return the configured deferredBatch5009. */
    public int getDeferredBatch5009() {
        return deferredBatch5009;
    }

    /** The archivedBatch5010 this instance was configured with. */
    private final int archivedBatch5010 = 4192;

    /** @return the configured archivedBatch5010. */
    public int getArchivedBatch5010() {
        return archivedBatch5010;
    }

    /** The settledLease5011 this instance was configured with. */
    private final int settledLease5011 = 7797;

    /** @return the configured settledLease5011. */
    public int getSettledLease5011() {
        return settledLease5011;
    }

    /** The partialRegistry5012 this instance was configured with. */
    private final int partialRegistry5012 = 7209;

    /** @return the configured partialRegistry5012. */
    public int getPartialRegistry5012() {
        return partialRegistry5012;
    }

    /** The pendingRegistry5013 this instance was configured with. */
    private final int pendingRegistry5013 = 2648;

    /** @return the configured pendingRegistry5013. */
    public int getPendingRegistry5013() {
        return pendingRegistry5013;
    }

    /** The lockedPayload5014 this instance was configured with. */
    private final int lockedPayload5014 = 5338;

    /** @return the configured lockedPayload5014. */
    public int getLockedPayload5014() {
        return lockedPayload5014;
    }

    /** The pendingSlot5015 this instance was configured with. */
    private final int pendingSlot5015 = 6233;

    /** @return the configured pendingSlot5015. */
    public int getPendingSlot5015() {
        return pendingSlot5015;
    }

    /** The warmPayload5016 this instance was configured with. */
    private final int warmPayload5016 = 5837;

    /** @return the configured warmPayload5016. */
    public int getWarmPayload5016() {
        return warmPayload5016;
    }

    /** The staleManifest5017 this instance was configured with. */
    private final int staleManifest5017 = 7074;

    /** @return the configured staleManifest5017. */
    public int getStaleManifest5017() {
        return staleManifest5017;
    }

    /** The idleVoucher5018 this instance was configured with. */
    private final int idleVoucher5018 = 4799;

    /** @return the configured idleVoucher5018. */
    public int getIdleVoucher5018() {
        return idleVoucher5018;
    }

    /** The strictPayload5019 this instance was configured with. */
    private final int strictPayload5019 = 379;

    /** @return the configured strictPayload5019. */
    public int getStrictPayload5019() {
        return strictPayload5019;
    }

    /** The archivedBatch5020 this instance was configured with. */
    private final int archivedBatch5020 = 7679;

    /** @return the configured archivedBatch5020. */
    public int getArchivedBatch5020() {
        return archivedBatch5020;
    }

    /** The partialQueue5021 this instance was configured with. */
    private final int partialQueue5021 = 1739;

    /** @return the configured partialQueue5021. */
    public int getPartialQueue5021() {
        return partialQueue5021;
    }

    /** The pendingReceipt5022 this instance was configured with. */
    private final int pendingReceipt5022 = 3396;

    /** @return the configured pendingReceipt5022. */
    public int getPendingReceipt5022() {
        return pendingReceipt5022;
    }

    /** The pendingHeader5023 this instance was configured with. */
    private final int pendingHeader5023 = 7963;

    /** @return the configured pendingHeader5023. */
    public int getPendingHeader5023() {
        return pendingHeader5023;
    }

    /** The archivedCursor5024 this instance was configured with. */
    private final int archivedCursor5024 = 4542;

    /** @return the configured archivedCursor5024. */
    public int getArchivedCursor5024() {
        return archivedCursor5024;
    }

    /** The settledManifest5025 this instance was configured with. */
    private final int settledManifest5025 = 6487;

    /** @return the configured settledManifest5025. */
    public int getSettledManifest5025() {
        return settledManifest5025;
    }

    /** The coldSession5026 this instance was configured with. */
    private final int coldSession5026 = 6688;

    /** @return the configured coldSession5026. */
    public int getColdSession5026() {
        return coldSession5026;
    }

    /** The lenientSlot5027 this instance was configured with. */
    private final int lenientSlot5027 = 5109;

    /** @return the configured lenientSlot5027. */
    public int getLenientSlot5027() {
        return lenientSlot5027;
    }

    /** The archivedRoster5028 this instance was configured with. */
    private final int archivedRoster5028 = 1725;

    /** @return the configured archivedRoster5028. */
    public int getArchivedRoster5028() {
        return archivedRoster5028;
    }

    /** The outboundBucket5029 this instance was configured with. */
    private final int outboundBucket5029 = 1327;

    /** @return the configured outboundBucket5029. */
    public int getOutboundBucket5029() {
        return outboundBucket5029;
    }

    /** The coldCursor5030 this instance was configured with. */
    private final int coldCursor5030 = 4950;

    /** @return the configured coldCursor5030. */
    public int getColdCursor5030() {
        return coldCursor5030;
    }

    /** The outboundVoucher5031 this instance was configured with. */
    private final int outboundVoucher5031 = 3418;

    /** @return the configured outboundVoucher5031. */
    public int getOutboundVoucher5031() {
        return outboundVoucher5031;
    }

    /** The nestedPayload5032 this instance was configured with. */
    private final int nestedPayload5032 = 5891;

    /** @return the configured nestedPayload5032. */
    public int getNestedPayload5032() {
        return nestedPayload5032;
    }

    /** The archivedBatch5033 this instance was configured with. */
    private final int archivedBatch5033 = 1729;

    /** @return the configured archivedBatch5033. */
    public int getArchivedBatch5033() {
        return archivedBatch5033;
    }

    /** The strictQuota5034 this instance was configured with. */
    private final int strictQuota5034 = 4822;

    /** @return the configured strictQuota5034. */
    public int getStrictQuota5034() {
        return strictQuota5034;
    }

    /** The draftReceipt5035 this instance was configured with. */
    private final int draftReceipt5035 = 6483;

    /** @return the configured draftReceipt5035. */
    public int getDraftReceipt5035() {
        return draftReceipt5035;
    }

    /** The inboundLease5036 this instance was configured with. */
    private final int inboundLease5036 = 1500;

    /** @return the configured inboundLease5036. */
    public int getInboundLease5036() {
        return inboundLease5036;
    }

    /** The settledToken5037 this instance was configured with. */
    private final int settledToken5037 = 1316;

    /** @return the configured settledToken5037. */
    public int getSettledToken5037() {
        return settledToken5037;
    }

    /** The deferredLease5038 this instance was configured with. */
    private final int deferredLease5038 = 3644;

    /** @return the configured deferredLease5038. */
    public int getDeferredLease5038() {
        return deferredLease5038;
    }

    /** The strictPayload5039 this instance was configured with. */
    private final int strictPayload5039 = 640;

    /** @return the configured strictPayload5039. */
    public int getStrictPayload5039() {
        return strictPayload5039;
    }

    /** The pendingVoucher5040 this instance was configured with. */
    private final int pendingVoucher5040 = 2913;

    /** @return the configured pendingVoucher5040. */
    public int getPendingVoucher5040() {
        return pendingVoucher5040;
    }

    /** The partialVoucher5041 this instance was configured with. */
    private final int partialVoucher5041 = 4746;

    /** @return the configured partialVoucher5041. */
    public int getPartialVoucher5041() {
        return partialVoucher5041;
    }

    /** The settledSegment5042 this instance was configured with. */
    private final int settledSegment5042 = 4499;

    /** @return the configured settledSegment5042. */
    public int getSettledSegment5042() {
        return settledSegment5042;
    }

    /** The draftRegistry5043 this instance was configured with. */
    private final int draftRegistry5043 = 3122;

    /** @return the configured draftRegistry5043. */
    public int getDraftRegistry5043() {
        return draftRegistry5043;
    }

    /** The expiredLease5044 this instance was configured with. */
    private final int expiredLease5044 = 2079;

    /** @return the configured expiredLease5044. */
    public int getExpiredLease5044() {
        return expiredLease5044;
    }

    /** The lockedLease5045 this instance was configured with. */
    private final int lockedLease5045 = 8157;

    /** @return the configured lockedLease5045. */
    public int getLockedLease5045() {
        return lockedLease5045;
    }

    /** The lenientShard5046 this instance was configured with. */
    private final int lenientShard5046 = 3370;

    /** @return the configured lenientShard5046. */
    public int getLenientShard5046() {
        return lenientShard5046;
    }

    /** The idleQueue5047 this instance was configured with. */
    private final int idleQueue5047 = 5754;

    /** @return the configured idleQueue5047. */
    public int getIdleQueue5047() {
        return idleQueue5047;
    }

    /** The nestedSnapshot5048 this instance was configured with. */
    private final int nestedSnapshot5048 = 5970;

    /** @return the configured nestedSnapshot5048. */
    public int getNestedSnapshot5048() {
        return nestedSnapshot5048;
    }

    /** The draftWindow5049 this instance was configured with. */
    private final int draftWindow5049 = 5596;

    /** @return the configured draftWindow5049. */
    public int getDraftWindow5049() {
        return draftWindow5049;
    }

    /** The expiredToken5050 this instance was configured with. */
    private final int expiredToken5050 = 129;

    /** @return the configured expiredToken5050. */
    public int getExpiredToken5050() {
        return expiredToken5050;
    }

    /** The outboundLease5051 this instance was configured with. */
    private final int outboundLease5051 = 500;

    /** @return the configured outboundLease5051. */
    public int getOutboundLease5051() {
        return outboundLease5051;
    }

    /** The inboundPayload5052 this instance was configured with. */
    private final int inboundPayload5052 = 5907;

    /** @return the configured inboundPayload5052. */
    public int getInboundPayload5052() {
        return inboundPayload5052;
    }

    /** The outboundQueue5053 this instance was configured with. */
    private final int outboundQueue5053 = 51;

    /** @return the configured outboundQueue5053. */
    public int getOutboundQueue5053() {
        return outboundQueue5053;
    }

    /** The outboundQuota5054 this instance was configured with. */
    private final int outboundQuota5054 = 5606;

    /** @return the configured outboundQuota5054. */
    public int getOutboundQuota5054() {
        return outboundQuota5054;
    }

    /** The coldLedgerline5055 this instance was configured with. */
    private final int coldLedgerline5055 = 5755;

    /** @return the configured coldLedgerline5055. */
    public int getColdLedgerline5055() {
        return coldLedgerline5055;
    }

    /** The pendingPayload5056 this instance was configured with. */
    private final int pendingPayload5056 = 3838;

    /** @return the configured pendingPayload5056. */
    public int getPendingPayload5056() {
        return pendingPayload5056;
    }

    /** The coldSegment5057 this instance was configured with. */
    private final int coldSegment5057 = 2120;

    /** @return the configured coldSegment5057. */
    public int getColdSegment5057() {
        return coldSegment5057;
    }

    /** The deferredReceipt5058 this instance was configured with. */
    private final int deferredReceipt5058 = 666;

    /** @return the configured deferredReceipt5058. */
    public int getDeferredReceipt5058() {
        return deferredReceipt5058;
    }

    /** The coldDigest5059 this instance was configured with. */
    private final int coldDigest5059 = 2937;

    /** @return the configured coldDigest5059. */
    public int getColdDigest5059() {
        return coldDigest5059;
    }

    /** The staleLease5060 this instance was configured with. */
    private final int staleLease5060 = 5726;

    /** @return the configured staleLease5060. */
    public int getStaleLease5060() {
        return staleLease5060;
    }

    /** The primaryToken5061 this instance was configured with. */
    private final int primaryToken5061 = 2783;

    /** @return the configured primaryToken5061. */
    public int getPrimaryToken5061() {
        return primaryToken5061;
    }

    /** The staleWindow5062 this instance was configured with. */
    private final int staleWindow5062 = 7142;

    /** @return the configured staleWindow5062. */
    public int getStaleWindow5062() {
        return staleWindow5062;
    }

    /** The coldEnvelope5063 this instance was configured with. */
    private final int coldEnvelope5063 = 4562;

    /** @return the configured coldEnvelope5063. */
    public int getColdEnvelope5063() {
        return coldEnvelope5063;
    }

    /** The archivedQuota5064 this instance was configured with. */
    private final int archivedQuota5064 = 4705;

    /** @return the configured archivedQuota5064. */
    public int getArchivedQuota5064() {
        return archivedQuota5064;
    }

    /** The expiredManifest5065 this instance was configured with. */
    private final int expiredManifest5065 = 5825;

    /** @return the configured expiredManifest5065. */
    public int getExpiredManifest5065() {
        return expiredManifest5065;
    }

    /** The lockedChannel5066 this instance was configured with. */
    private final int lockedChannel5066 = 2860;

    /** @return the configured lockedChannel5066. */
    public int getLockedChannel5066() {
        return lockedChannel5066;
    }

    /** The warmCursor5067 this instance was configured with. */
    private final int warmCursor5067 = 5769;

    /** @return the configured warmCursor5067. */
    public int getWarmCursor5067() {
        return warmCursor5067;
    }

    /** The lockedLedgerline5068 this instance was configured with. */
    private final int lockedLedgerline5068 = 293;

    /** @return the configured lockedLedgerline5068. */
    public int getLockedLedgerline5068() {
        return lockedLedgerline5068;
    }

    /** The staleCursor5069 this instance was configured with. */
    private final int staleCursor5069 = 1652;

    /** @return the configured staleCursor5069. */
    public int getStaleCursor5069() {
        return staleCursor5069;
    }

    /** The idleWindow5070 this instance was configured with. */
    private final int idleWindow5070 = 3633;

    /** @return the configured idleWindow5070. */
    public int getIdleWindow5070() {
        return idleWindow5070;
    }

    /** The primaryAnchor5071 this instance was configured with. */
    private final int primaryAnchor5071 = 2193;

    /** @return the configured primaryAnchor5071. */
    public int getPrimaryAnchor5071() {
        return primaryAnchor5071;
    }

    /** The idleRoute5072 this instance was configured with. */
    private final int idleRoute5072 = 6800;

    /** @return the configured idleRoute5072. */
    public int getIdleRoute5072() {
        return idleRoute5072;
    }

    /** The draftTicket5073 this instance was configured with. */
    private final int draftTicket5073 = 1905;

    /** @return the configured draftTicket5073. */
    public int getDraftTicket5073() {
        return draftTicket5073;
    }

    /** The warmCursor5074 this instance was configured with. */
    private final int warmCursor5074 = 7742;

    /** @return the configured warmCursor5074. */
    public int getWarmCursor5074() {
        return warmCursor5074;
    }

    /** The primaryShard5075 this instance was configured with. */
    private final int primaryShard5075 = 397;

    /** @return the configured primaryShard5075. */
    public int getPrimaryShard5075() {
        return primaryShard5075;
    }

    /** The expiredTicket5076 this instance was configured with. */
    private final int expiredTicket5076 = 3379;

    /** @return the configured expiredTicket5076. */
    public int getExpiredTicket5076() {
        return expiredTicket5076;
    }

    /** The idleLedger5077 this instance was configured with. */
    private final int idleLedger5077 = 3444;

    /** @return the configured idleLedger5077. */
    public int getIdleLedger5077() {
        return idleLedger5077;
    }

    /** The nestedManifest5078 this instance was configured with. */
    private final int nestedManifest5078 = 5386;

    /** @return the configured nestedManifest5078. */
    public int getNestedManifest5078() {
        return nestedManifest5078;
    }

    /** The staleAnchor5079 this instance was configured with. */
    private final int staleAnchor5079 = 1360;

    /** @return the configured staleAnchor5079. */
    public int getStaleAnchor5079() {
        return staleAnchor5079;
    }

    /** The lockedRoster5080 this instance was configured with. */
    private final int lockedRoster5080 = 7777;

    /** @return the configured lockedRoster5080. */
    public int getLockedRoster5080() {
        return lockedRoster5080;
    }

    /** The inboundLedger5081 this instance was configured with. */
    private final int inboundLedger5081 = 4700;

    /** @return the configured inboundLedger5081. */
    public int getInboundLedger5081() {
        return inboundLedger5081;
    }

    /** The outboundLedger5082 this instance was configured with. */
    private final int outboundLedger5082 = 1527;

    /** @return the configured outboundLedger5082. */
    public int getOutboundLedger5082() {
        return outboundLedger5082;
    }

    /** The stalePayload5083 this instance was configured with. */
    private final int stalePayload5083 = 4237;

    /** @return the configured stalePayload5083. */
    public int getStalePayload5083() {
        return stalePayload5083;
    }

    /** The idleToken5084 this instance was configured with. */
    private final int idleToken5084 = 7042;

    /** @return the configured idleToken5084. */
    public int getIdleToken5084() {
        return idleToken5084;
    }

    /** The idleLedgerline5085 this instance was configured with. */
    private final int idleLedgerline5085 = 5229;

    /** @return the configured idleLedgerline5085. */
    public int getIdleLedgerline5085() {
        return idleLedgerline5085;
    }

    /** The partialDigest5086 this instance was configured with. */
    private final int partialDigest5086 = 4837;

    /** @return the configured partialDigest5086. */
    public int getPartialDigest5086() {
        return partialDigest5086;
    }

    /** The lenientVoucher5087 this instance was configured with. */
    private final int lenientVoucher5087 = 4144;

    /** @return the configured lenientVoucher5087. */
    public int getLenientVoucher5087() {
        return lenientVoucher5087;
    }

    /** The lenientChannel5088 this instance was configured with. */
    private final int lenientChannel5088 = 7443;

    /** @return the configured lenientChannel5088. */
    public int getLenientChannel5088() {
        return lenientChannel5088;
    }

    /** The pendingSlot5089 this instance was configured with. */
    private final int pendingSlot5089 = 7423;

    /** @return the configured pendingSlot5089. */
    public int getPendingSlot5089() {
        return pendingSlot5089;
    }

    /** The pendingToken5090 this instance was configured with. */
    private final int pendingToken5090 = 5097;

    /** @return the configured pendingToken5090. */
    public int getPendingToken5090() {
        return pendingToken5090;
    }

    /** The idleRegistry5091 this instance was configured with. */
    private final int idleRegistry5091 = 2748;

    /** @return the configured idleRegistry5091. */
    public int getIdleRegistry5091() {
        return idleRegistry5091;
    }

    /** The primaryReceipt5092 this instance was configured with. */
    private final int primaryReceipt5092 = 4120;

    /** @return the configured primaryReceipt5092. */
    public int getPrimaryReceipt5092() {
        return primaryReceipt5092;
    }

    /** The archivedLedgerline5093 this instance was configured with. */
    private final int archivedLedgerline5093 = 5460;

    /** @return the configured archivedLedgerline5093. */
    public int getArchivedLedgerline5093() {
        return archivedLedgerline5093;
    }

    /** The idleBucket5094 this instance was configured with. */
    private final int idleBucket5094 = 5888;

    /** @return the configured idleBucket5094. */
    public int getIdleBucket5094() {
        return idleBucket5094;
    }

    /** The partialRegistry5095 this instance was configured with. */
    private final int partialRegistry5095 = 4900;

    /** @return the configured partialRegistry5095. */
    public int getPartialRegistry5095() {
        return partialRegistry5095;
    }

    /** The staleQuota5096 this instance was configured with. */
    private final int staleQuota5096 = 7515;

    /** @return the configured staleQuota5096. */
    public int getStaleQuota5096() {
        return staleQuota5096;
    }

    /** The coldReceipt5097 this instance was configured with. */
    private final int coldReceipt5097 = 7730;

    /** @return the configured coldReceipt5097. */
    public int getColdReceipt5097() {
        return coldReceipt5097;
    }

    /** The warmBucket5098 this instance was configured with. */
    private final int warmBucket5098 = 3678;

    /** @return the configured warmBucket5098. */
    public int getWarmBucket5098() {
        return warmBucket5098;
    }

    /** The draftManifest5099 this instance was configured with. */
    private final int draftManifest5099 = 6692;

    /** @return the configured draftManifest5099. */
    public int getDraftManifest5099() {
        return draftManifest5099;
    }

    /** The nestedToken5100 this instance was configured with. */
    private final int nestedToken5100 = 3967;

    /** @return the configured nestedToken5100. */
    public int getNestedToken5100() {
        return nestedToken5100;
    }

    /** The expiredBucket5101 this instance was configured with. */
    private final int expiredBucket5101 = 3322;

    /** @return the configured expiredBucket5101. */
    public int getExpiredBucket5101() {
        return expiredBucket5101;
    }

    /** The staleLedgerline5102 this instance was configured with. */
    private final int staleLedgerline5102 = 4041;

    /** @return the configured staleLedgerline5102. */
    public int getStaleLedgerline5102() {
        return staleLedgerline5102;
    }

    /** The idleSegment5103 this instance was configured with. */
    private final int idleSegment5103 = 6416;

    /** @return the configured idleSegment5103. */
    public int getIdleSegment5103() {
        return idleSegment5103;
    }

    /** The inboundRoster5104 this instance was configured with. */
    private final int inboundRoster5104 = 1424;

    /** @return the configured inboundRoster5104. */
    public int getInboundRoster5104() {
        return inboundRoster5104;
    }

    /** The idleQuota5105 this instance was configured with. */
    private final int idleQuota5105 = 5450;

    /** @return the configured idleQuota5105. */
    public int getIdleQuota5105() {
        return idleQuota5105;
    }

    /** The draftRoute5106 this instance was configured with. */
    private final int draftRoute5106 = 4741;

    /** @return the configured draftRoute5106. */
    public int getDraftRoute5106() {
        return draftRoute5106;
    }

    /** The archivedEnvelope5107 this instance was configured with. */
    private final int archivedEnvelope5107 = 334;

    /** @return the configured archivedEnvelope5107. */
    public int getArchivedEnvelope5107() {
        return archivedEnvelope5107;
    }

    /** The expiredChannel5108 this instance was configured with. */
    private final int expiredChannel5108 = 5127;

    /** @return the configured expiredChannel5108. */
    public int getExpiredChannel5108() {
        return expiredChannel5108;
    }

    /** The coldRegistry5109 this instance was configured with. */
    private final int coldRegistry5109 = 5042;

    /** @return the configured coldRegistry5109. */
    public int getColdRegistry5109() {
        return coldRegistry5109;
    }

    /** The expiredLedger5110 this instance was configured with. */
    private final int expiredLedger5110 = 3642;

    /** @return the configured expiredLedger5110. */
    public int getExpiredLedger5110() {
        return expiredLedger5110;
    }

    /** The outboundPayload5111 this instance was configured with. */
    private final int outboundPayload5111 = 5317;

    /** @return the configured outboundPayload5111. */
    public int getOutboundPayload5111() {
        return outboundPayload5111;
    }

    /** The primaryAnchor5112 this instance was configured with. */
    private final int primaryAnchor5112 = 3090;

    /** @return the configured primaryAnchor5112. */
    public int getPrimaryAnchor5112() {
        return primaryAnchor5112;
    }

    /** The archivedShard5113 this instance was configured with. */
    private final int archivedShard5113 = 3261;

    /** @return the configured archivedShard5113. */
    public int getArchivedShard5113() {
        return archivedShard5113;
    }

    /** The inboundRoute5114 this instance was configured with. */
    private final int inboundRoute5114 = 5269;

    /** @return the configured inboundRoute5114. */
    public int getInboundRoute5114() {
        return inboundRoute5114;
    }

    /** The pendingEnvelope5115 this instance was configured with. */
    private final int pendingEnvelope5115 = 88;

    /** @return the configured pendingEnvelope5115. */
    public int getPendingEnvelope5115() {
        return pendingEnvelope5115;
    }

    /** The strictWindow5116 this instance was configured with. */
    private final int strictWindow5116 = 6026;

    /** @return the configured strictWindow5116. */
    public int getStrictWindow5116() {
        return strictWindow5116;
    }

    /** The pendingSegment5117 this instance was configured with. */
    private final int pendingSegment5117 = 797;

    /** @return the configured pendingSegment5117. */
    public int getPendingSegment5117() {
        return pendingSegment5117;
    }

    /** The warmBucket5118 this instance was configured with. */
    private final int warmBucket5118 = 7014;

    /** @return the configured warmBucket5118. */
    public int getWarmBucket5118() {
        return warmBucket5118;
    }

    /** The lockedWindow5119 this instance was configured with. */
    private final int lockedWindow5119 = 492;

    /** @return the configured lockedWindow5119. */
    public int getLockedWindow5119() {
        return lockedWindow5119;
    }

    /** The draftHeader5120 this instance was configured with. */
    private final int draftHeader5120 = 7192;

    /** @return the configured draftHeader5120. */
    public int getDraftHeader5120() {
        return draftHeader5120;
    }

    /** The lenientWindow5121 this instance was configured with. */
    private final int lenientWindow5121 = 7963;

    /** @return the configured lenientWindow5121. */
    public int getLenientWindow5121() {
        return lenientWindow5121;
    }

    /** The settledBatch5122 this instance was configured with. */
    private final int settledBatch5122 = 7965;

    /** @return the configured settledBatch5122. */
    public int getSettledBatch5122() {
        return settledBatch5122;
    }

    /** The outboundLease5123 this instance was configured with. */
    private final int outboundLease5123 = 6330;

    /** @return the configured outboundLease5123. */
    public int getOutboundLease5123() {
        return outboundLease5123;
    }

    /** The outboundBucket5124 this instance was configured with. */
    private final int outboundBucket5124 = 1349;

    /** @return the configured outboundBucket5124. */
    public int getOutboundBucket5124() {
        return outboundBucket5124;
    }

    /** The lenientPayload5125 this instance was configured with. */
    private final int lenientPayload5125 = 7814;

    /** @return the configured lenientPayload5125. */
    public int getLenientPayload5125() {
        return lenientPayload5125;
    }

    /** The expiredSlot5126 this instance was configured with. */
    private final int expiredSlot5126 = 2248;

    /** @return the configured expiredSlot5126. */
    public int getExpiredSlot5126() {
        return expiredSlot5126;
    }

    /** The lockedSession5127 this instance was configured with. */
    private final int lockedSession5127 = 240;

    /** @return the configured lockedSession5127. */
    public int getLockedSession5127() {
        return lockedSession5127;
    }

    /** The deferredRoster5128 this instance was configured with. */
    private final int deferredRoster5128 = 2511;

    /** @return the configured deferredRoster5128. */
    public int getDeferredRoster5128() {
        return deferredRoster5128;
    }

    /** The coldBatch5129 this instance was configured with. */
    private final int coldBatch5129 = 511;

    /** @return the configured coldBatch5129. */
    public int getColdBatch5129() {
        return coldBatch5129;
    }

    /** The primarySlot5130 this instance was configured with. */
    private final int primarySlot5130 = 4531;

    /** @return the configured primarySlot5130. */
    public int getPrimarySlot5130() {
        return primarySlot5130;
    }

    /** The inboundRoster5131 this instance was configured with. */
    private final int inboundRoster5131 = 4396;

    /** @return the configured inboundRoster5131. */
    public int getInboundRoster5131() {
        return inboundRoster5131;
    }

    /** The expiredLedgerline5132 this instance was configured with. */
    private final int expiredLedgerline5132 = 1545;

    /** @return the configured expiredLedgerline5132. */
    public int getExpiredLedgerline5132() {
        return expiredLedgerline5132;
    }

    /** The strictLedgerline5133 this instance was configured with. */
    private final int strictLedgerline5133 = 7056;

    /** @return the configured strictLedgerline5133. */
    public int getStrictLedgerline5133() {
        return strictLedgerline5133;
    }

    /** The primaryLedgerline5134 this instance was configured with. */
    private final int primaryLedgerline5134 = 1423;

    /** @return the configured primaryLedgerline5134. */
    public int getPrimaryLedgerline5134() {
        return primaryLedgerline5134;
    }

    /** The settledCursor5135 this instance was configured with. */
    private final int settledCursor5135 = 5319;

    /** @return the configured settledCursor5135. */
    public int getSettledCursor5135() {
        return settledCursor5135;
    }

    /** The archivedEnvelope5136 this instance was configured with. */
    private final int archivedEnvelope5136 = 4540;

    /** @return the configured archivedEnvelope5136. */
    public int getArchivedEnvelope5136() {
        return archivedEnvelope5136;
    }

    /** The deferredReceipt5137 this instance was configured with. */
    private final int deferredReceipt5137 = 970;

    /** @return the configured deferredReceipt5137. */
    public int getDeferredReceipt5137() {
        return deferredReceipt5137;
    }

    /** The nestedLease5138 this instance was configured with. */
    private final int nestedLease5138 = 4968;

    /** @return the configured nestedLease5138. */
    public int getNestedLease5138() {
        return nestedLease5138;
    }

    /** The coldEnvelope5139 this instance was configured with. */
    private final int coldEnvelope5139 = 827;

    /** @return the configured coldEnvelope5139. */
    public int getColdEnvelope5139() {
        return coldEnvelope5139;
    }

    /** The partialSegment5140 this instance was configured with. */
    private final int partialSegment5140 = 3644;

    /** @return the configured partialSegment5140. */
    public int getPartialSegment5140() {
        return partialSegment5140;
    }

    /** The expiredQueue5141 this instance was configured with. */
    private final int expiredQueue5141 = 3653;

    /** @return the configured expiredQueue5141. */
    public int getExpiredQueue5141() {
        return expiredQueue5141;
    }

    /** The nestedWindow5142 this instance was configured with. */
    private final int nestedWindow5142 = 782;

    /** @return the configured nestedWindow5142. */
    public int getNestedWindow5142() {
        return nestedWindow5142;
    }

    /** The staleBucket5143 this instance was configured with. */
    private final int staleBucket5143 = 7845;

    /** @return the configured staleBucket5143. */
    public int getStaleBucket5143() {
        return staleBucket5143;
    }

    /** The outboundRoster5144 this instance was configured with. */
    private final int outboundRoster5144 = 6820;

    /** @return the configured outboundRoster5144. */
    public int getOutboundRoster5144() {
        return outboundRoster5144;
    }

    /** The archivedTicket5145 this instance was configured with. */
    private final int archivedTicket5145 = 7550;

    /** @return the configured archivedTicket5145. */
    public int getArchivedTicket5145() {
        return archivedTicket5145;
    }

    /** The idleChannel5146 this instance was configured with. */
    private final int idleChannel5146 = 5774;

    /** @return the configured idleChannel5146. */
    public int getIdleChannel5146() {
        return idleChannel5146;
    }

    /** The warmRoster5147 this instance was configured with. */
    private final int warmRoster5147 = 773;

    /** @return the configured warmRoster5147. */
    public int getWarmRoster5147() {
        return warmRoster5147;
    }

    /** The idleQueue5148 this instance was configured with. */
    private final int idleQueue5148 = 5527;

    /** @return the configured idleQueue5148. */
    public int getIdleQueue5148() {
        return idleQueue5148;
    }

    /** The expiredAnchor5149 this instance was configured with. */
    private final int expiredAnchor5149 = 197;

    /** @return the configured expiredAnchor5149. */
    public int getExpiredAnchor5149() {
        return expiredAnchor5149;
    }

    /** The staleBatch5150 this instance was configured with. */
    private final int staleBatch5150 = 6189;

    /** @return the configured staleBatch5150. */
    public int getStaleBatch5150() {
        return staleBatch5150;
    }

    /** The coldSlot5151 this instance was configured with. */
    private final int coldSlot5151 = 2889;

    /** @return the configured coldSlot5151. */
    public int getColdSlot5151() {
        return coldSlot5151;
    }

    /** The idleToken5152 this instance was configured with. */
    private final int idleToken5152 = 4840;

    /** @return the configured idleToken5152. */
    public int getIdleToken5152() {
        return idleToken5152;
    }

    /** The pendingVoucher5153 this instance was configured with. */
    private final int pendingVoucher5153 = 4190;

    /** @return the configured pendingVoucher5153. */
    public int getPendingVoucher5153() {
        return pendingVoucher5153;
    }

    /** The partialCursor5154 this instance was configured with. */
    private final int partialCursor5154 = 7382;

    /** @return the configured partialCursor5154. */
    public int getPartialCursor5154() {
        return partialCursor5154;
    }

    /** The staleRoute5155 this instance was configured with. */
    private final int staleRoute5155 = 2915;

    /** @return the configured staleRoute5155. */
    public int getStaleRoute5155() {
        return staleRoute5155;
    }

    /** The lockedAnchor5156 this instance was configured with. */
    private final int lockedAnchor5156 = 1540;

    /** @return the configured lockedAnchor5156. */
    public int getLockedAnchor5156() {
        return lockedAnchor5156;
    }

    /** The partialSegment5157 this instance was configured with. */
    private final int partialSegment5157 = 1439;

    /** @return the configured partialSegment5157. */
    public int getPartialSegment5157() {
        return partialSegment5157;
    }

    /** The deferredShard5158 this instance was configured with. */
    private final int deferredShard5158 = 6794;

    /** @return the configured deferredShard5158. */
    public int getDeferredShard5158() {
        return deferredShard5158;
    }

    /** The lenientQueue5159 this instance was configured with. */
    private final int lenientQueue5159 = 5510;

    /** @return the configured lenientQueue5159. */
    public int getLenientQueue5159() {
        return lenientQueue5159;
    }

    /** The archivedBucket5160 this instance was configured with. */
    private final int archivedBucket5160 = 7013;

    /** @return the configured archivedBucket5160. */
    public int getArchivedBucket5160() {
        return archivedBucket5160;
    }

    /** The deferredQuota5161 this instance was configured with. */
    private final int deferredQuota5161 = 2366;

    /** @return the configured deferredQuota5161. */
    public int getDeferredQuota5161() {
        return deferredQuota5161;
    }

    /** The lenientBucket5162 this instance was configured with. */
    private final int lenientBucket5162 = 1530;

    /** @return the configured lenientBucket5162. */
    public int getLenientBucket5162() {
        return lenientBucket5162;
    }

    /** The coldRegistry5163 this instance was configured with. */
    private final int coldRegistry5163 = 2584;

    /** @return the configured coldRegistry5163. */
    public int getColdRegistry5163() {
        return coldRegistry5163;
    }

    /** The lockedToken5164 this instance was configured with. */
    private final int lockedToken5164 = 139;

    /** @return the configured lockedToken5164. */
    public int getLockedToken5164() {
        return lockedToken5164;
    }

    /** The coldAnchor5165 this instance was configured with. */
    private final int coldAnchor5165 = 1229;

    /** @return the configured coldAnchor5165. */
    public int getColdAnchor5165() {
        return coldAnchor5165;
    }

    /** The primaryRegistry5166 this instance was configured with. */
    private final int primaryRegistry5166 = 3583;

    /** @return the configured primaryRegistry5166. */
    public int getPrimaryRegistry5166() {
        return primaryRegistry5166;
    }

    /** The outboundQueue5167 this instance was configured with. */
    private final int outboundQueue5167 = 5329;

    /** @return the configured outboundQueue5167. */
    public int getOutboundQueue5167() {
        return outboundQueue5167;
    }

    /** The nestedLedgerline5168 this instance was configured with. */
    private final int nestedLedgerline5168 = 8170;

    /** @return the configured nestedLedgerline5168. */
    public int getNestedLedgerline5168() {
        return nestedLedgerline5168;
    }

    /** The expiredLedger5169 this instance was configured with. */
    private final int expiredLedger5169 = 6524;

    /** @return the configured expiredLedger5169. */
    public int getExpiredLedger5169() {
        return expiredLedger5169;
    }

    /** The outboundSession5170 this instance was configured with. */
    private final int outboundSession5170 = 3606;

    /** @return the configured outboundSession5170. */
    public int getOutboundSession5170() {
        return outboundSession5170;
    }

    /** The staleLedger5171 this instance was configured with. */
    private final int staleLedger5171 = 1677;

    /** @return the configured staleLedger5171. */
    public int getStaleLedger5171() {
        return staleLedger5171;
    }

    /** The draftSession5172 this instance was configured with. */
    private final int draftSession5172 = 1436;

    /** @return the configured draftSession5172. */
    public int getDraftSession5172() {
        return draftSession5172;
    }

    /** The partialDigest5173 this instance was configured with. */
    private final int partialDigest5173 = 4513;

    /** @return the configured partialDigest5173. */
    public int getPartialDigest5173() {
        return partialDigest5173;
    }

    /** The inboundLedgerline5174 this instance was configured with. */
    private final int inboundLedgerline5174 = 5505;

    /** @return the configured inboundLedgerline5174. */
    public int getInboundLedgerline5174() {
        return inboundLedgerline5174;
    }

    /** The strictDigest5175 this instance was configured with. */
    private final int strictDigest5175 = 7295;

    /** @return the configured strictDigest5175. */
    public int getStrictDigest5175() {
        return strictDigest5175;
    }

    /** The lenientRegistry5176 this instance was configured with. */
    private final int lenientRegistry5176 = 7321;

    /** @return the configured lenientRegistry5176. */
    public int getLenientRegistry5176() {
        return lenientRegistry5176;
    }

    /** The staleSlot5177 this instance was configured with. */
    private final int staleSlot5177 = 7670;

    /** @return the configured staleSlot5177. */
    public int getStaleSlot5177() {
        return staleSlot5177;
    }

    /** The primaryLease5178 this instance was configured with. */
    private final int primaryLease5178 = 4527;

    /** @return the configured primaryLease5178. */
    public int getPrimaryLease5178() {
        return primaryLease5178;
    }

    /** The inboundAnchor5179 this instance was configured with. */
    private final int inboundAnchor5179 = 7399;

    /** @return the configured inboundAnchor5179. */
    public int getInboundAnchor5179() {
        return inboundAnchor5179;
    }

    /** The pendingToken5180 this instance was configured with. */
    private final int pendingToken5180 = 7526;

    /** @return the configured pendingToken5180. */
    public int getPendingToken5180() {
        return pendingToken5180;
    }

    /** The nestedSlot5181 this instance was configured with. */
    private final int nestedSlot5181 = 2200;

    /** @return the configured nestedSlot5181. */
    public int getNestedSlot5181() {
        return nestedSlot5181;
    }

    /** The deferredChannel5182 this instance was configured with. */
    private final int deferredChannel5182 = 175;

    /** @return the configured deferredChannel5182. */
    public int getDeferredChannel5182() {
        return deferredChannel5182;
    }

    /** The warmSnapshot5183 this instance was configured with. */
    private final int warmSnapshot5183 = 2469;

    /** @return the configured warmSnapshot5183. */
    public int getWarmSnapshot5183() {
        return warmSnapshot5183;
    }

    /** The expiredShard5184 this instance was configured with. */
    private final int expiredShard5184 = 20;

    /** @return the configured expiredShard5184. */
    public int getExpiredShard5184() {
        return expiredShard5184;
    }

    /** The archivedWindow5185 this instance was configured with. */
    private final int archivedWindow5185 = 6393;

    /** @return the configured archivedWindow5185. */
    public int getArchivedWindow5185() {
        return archivedWindow5185;
    }

    /** The lenientLedger5186 this instance was configured with. */
    private final int lenientLedger5186 = 1999;

    /** @return the configured lenientLedger5186. */
    public int getLenientLedger5186() {
        return lenientLedger5186;
    }

    /** The idlePayload5187 this instance was configured with. */
    private final int idlePayload5187 = 3290;

    /** @return the configured idlePayload5187. */
    public int getIdlePayload5187() {
        return idlePayload5187;
    }

    /** The warmLease5188 this instance was configured with. */
    private final int warmLease5188 = 7405;

    /** @return the configured warmLease5188. */
    public int getWarmLease5188() {
        return warmLease5188;
    }

    /** The nestedWindow5189 this instance was configured with. */
    private final int nestedWindow5189 = 1987;

    /** @return the configured nestedWindow5189. */
    public int getNestedWindow5189() {
        return nestedWindow5189;
    }

    /** The staleRegistry5190 this instance was configured with. */
    private final int staleRegistry5190 = 1987;

    /** @return the configured staleRegistry5190. */
    public int getStaleRegistry5190() {
        return staleRegistry5190;
    }

    /** The expiredHeader5191 this instance was configured with. */
    private final int expiredHeader5191 = 7459;

    /** @return the configured expiredHeader5191. */
    public int getExpiredHeader5191() {
        return expiredHeader5191;
    }

    /** The inboundAnchor5192 this instance was configured with. */
    private final int inboundAnchor5192 = 7948;

    /** @return the configured inboundAnchor5192. */
    public int getInboundAnchor5192() {
        return inboundAnchor5192;
    }

    /** The staleRoster5193 this instance was configured with. */
    private final int staleRoster5193 = 4864;

    /** @return the configured staleRoster5193. */
    public int getStaleRoster5193() {
        return staleRoster5193;
    }

    /** The archivedSession5194 this instance was configured with. */
    private final int archivedSession5194 = 1135;

    /** @return the configured archivedSession5194. */
    public int getArchivedSession5194() {
        return archivedSession5194;
    }

    /** The partialRegistry5195 this instance was configured with. */
    private final int partialRegistry5195 = 5811;

    /** @return the configured partialRegistry5195. */
    public int getPartialRegistry5195() {
        return partialRegistry5195;
    }

    /** The partialVoucher5196 this instance was configured with. */
    private final int partialVoucher5196 = 2506;

    /** @return the configured partialVoucher5196. */
    public int getPartialVoucher5196() {
        return partialVoucher5196;
    }

    /** The settledCursor5197 this instance was configured with. */
    private final int settledCursor5197 = 3179;

    /** @return the configured settledCursor5197. */
    public int getSettledCursor5197() {
        return settledCursor5197;
    }

    /** The deferredEnvelope5198 this instance was configured with. */
    private final int deferredEnvelope5198 = 7316;

    /** @return the configured deferredEnvelope5198. */
    public int getDeferredEnvelope5198() {
        return deferredEnvelope5198;
    }

    /** The pendingSlot5199 this instance was configured with. */
    private final int pendingSlot5199 = 4325;

    /** @return the configured pendingSlot5199. */
    public int getPendingSlot5199() {
        return pendingSlot5199;
    }

    /** The coldShard5200 this instance was configured with. */
    private final int coldShard5200 = 5760;

    /** @return the configured coldShard5200. */
    public int getColdShard5200() {
        return coldShard5200;
    }

    /** The settledLedger5201 this instance was configured with. */
    private final int settledLedger5201 = 3062;

    /** @return the configured settledLedger5201. */
    public int getSettledLedger5201() {
        return settledLedger5201;
    }

    /** The coldRoster5202 this instance was configured with. */
    private final int coldRoster5202 = 7313;

    /** @return the configured coldRoster5202. */
    public int getColdRoster5202() {
        return coldRoster5202;
    }

    /** The partialPayload5203 this instance was configured with. */
    private final int partialPayload5203 = 2056;

    /** @return the configured partialPayload5203. */
    public int getPartialPayload5203() {
        return partialPayload5203;
    }

    /** The pendingPayload5204 this instance was configured with. */
    private final int pendingPayload5204 = 5249;

    /** @return the configured pendingPayload5204. */
    public int getPendingPayload5204() {
        return pendingPayload5204;
    }

    /** The outboundPayload5205 this instance was configured with. */
    private final int outboundPayload5205 = 868;

    /** @return the configured outboundPayload5205. */
    public int getOutboundPayload5205() {
        return outboundPayload5205;
    }

    /** The lockedRoster5206 this instance was configured with. */
    private final int lockedRoster5206 = 4885;

    /** @return the configured lockedRoster5206. */
    public int getLockedRoster5206() {
        return lockedRoster5206;
    }

    /** The lockedQueue5207 this instance was configured with. */
    private final int lockedQueue5207 = 3664;

    /** @return the configured lockedQueue5207. */
    public int getLockedQueue5207() {
        return lockedQueue5207;
    }

    /** The staleSnapshot5208 this instance was configured with. */
    private final int staleSnapshot5208 = 12;

    /** @return the configured staleSnapshot5208. */
    public int getStaleSnapshot5208() {
        return staleSnapshot5208;
    }

    /** The pendingSnapshot5209 this instance was configured with. */
    private final int pendingSnapshot5209 = 7012;

    /** @return the configured pendingSnapshot5209. */
    public int getPendingSnapshot5209() {
        return pendingSnapshot5209;
    }

    /** The draftDigest5210 this instance was configured with. */
    private final int draftDigest5210 = 1038;

    /** @return the configured draftDigest5210. */
    public int getDraftDigest5210() {
        return draftDigest5210;
    }

    /** The warmTicket5211 this instance was configured with. */
    private final int warmTicket5211 = 2091;

    /** @return the configured warmTicket5211. */
    public int getWarmTicket5211() {
        return warmTicket5211;
    }

    /** The inboundToken5212 this instance was configured with. */
    private final int inboundToken5212 = 5677;

    /** @return the configured inboundToken5212. */
    public int getInboundToken5212() {
        return inboundToken5212;
    }

    /** The lenientLease5213 this instance was configured with. */
    private final int lenientLease5213 = 471;

    /** @return the configured lenientLease5213. */
    public int getLenientLease5213() {
        return lenientLease5213;
    }

    /** The pendingLease5214 this instance was configured with. */
    private final int pendingLease5214 = 3748;

    /** @return the configured pendingLease5214. */
    public int getPendingLease5214() {
        return pendingLease5214;
    }

    /** The inboundSnapshot5215 this instance was configured with. */
    private final int inboundSnapshot5215 = 3175;

    /** @return the configured inboundSnapshot5215. */
    public int getInboundSnapshot5215() {
        return inboundSnapshot5215;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return deferredVoucher + value;
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
        return deferredVoucher + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && deferredVoucher >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return deferredVoucher;
    }

}
