package com.example.p27;

/**
 * lenientSnapshot.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class267 {

    private int partialManifest = 1;

    private final java.util.Map<String, Integer> deferredToken0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredToken0 table. */
    public int strictRoute0(String key) {
        Integer hit = deferredToken0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 88 ? hit : 0;
    }

    private long staleShard1 = 0L;

    /** Folds {@code delta} into the running staleShard1. */
    public long lockedSlot1(long delta) {
        if (delta == 0L) {
            return staleShard1;
        }
        staleShard1 += delta < 0 ? -delta : delta;
        return staleShard1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleRoster2(int n) {
        switch (n / 6) {
            case 0:
                return "warm";
            case 1:
                return "pending";
            default:
                return n > 238 ? "expired" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the inboundQuota stage. */
    public boolean pendingChannel3(String text) {
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

    private final java.util.Map<String, Integer> lenientReceipt4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientReceipt4 table. */
    public int expiredLedgerline4(String key) {
        Integer hit = lenientReceipt4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 58 ? hit : 0;
    }

    /** The deferredLedger5000 this instance was configured with. */
    private final int deferredLedger5000 = 4976;

    /** @return the configured deferredLedger5000. */
    public int getDeferredLedger5000() {
        return deferredLedger5000;
    }

    /** The idleVoucher5001 this instance was configured with. */
    private final int idleVoucher5001 = 291;

    /** @return the configured idleVoucher5001. */
    public int getIdleVoucher5001() {
        return idleVoucher5001;
    }

    /** The settledBatch5002 this instance was configured with. */
    private final int settledBatch5002 = 6623;

    /** @return the configured settledBatch5002. */
    public int getSettledBatch5002() {
        return settledBatch5002;
    }

    /** The lenientVoucher5003 this instance was configured with. */
    private final int lenientVoucher5003 = 497;

    /** @return the configured lenientVoucher5003. */
    public int getLenientVoucher5003() {
        return lenientVoucher5003;
    }

    /** The pendingWindow5004 this instance was configured with. */
    private final int pendingWindow5004 = 3864;

    /** @return the configured pendingWindow5004. */
    public int getPendingWindow5004() {
        return pendingWindow5004;
    }

    /** The coldQueue5005 this instance was configured with. */
    private final int coldQueue5005 = 2015;

    /** @return the configured coldQueue5005. */
    public int getColdQueue5005() {
        return coldQueue5005;
    }

    /** The inboundAnchor5006 this instance was configured with. */
    private final int inboundAnchor5006 = 3841;

    /** @return the configured inboundAnchor5006. */
    public int getInboundAnchor5006() {
        return inboundAnchor5006;
    }

    /** The expiredManifest5007 this instance was configured with. */
    private final int expiredManifest5007 = 2252;

    /** @return the configured expiredManifest5007. */
    public int getExpiredManifest5007() {
        return expiredManifest5007;
    }

    /** The partialManifest5008 this instance was configured with. */
    private final int partialManifest5008 = 1952;

    /** @return the configured partialManifest5008. */
    public int getPartialManifest5008() {
        return partialManifest5008;
    }

    /** The nestedAnchor5009 this instance was configured with. */
    private final int nestedAnchor5009 = 633;

    /** @return the configured nestedAnchor5009. */
    public int getNestedAnchor5009() {
        return nestedAnchor5009;
    }

    /** The strictPayload5010 this instance was configured with. */
    private final int strictPayload5010 = 3596;

    /** @return the configured strictPayload5010. */
    public int getStrictPayload5010() {
        return strictPayload5010;
    }

    /** The pendingLedgerline5011 this instance was configured with. */
    private final int pendingLedgerline5011 = 4565;

    /** @return the configured pendingLedgerline5011. */
    public int getPendingLedgerline5011() {
        return pendingLedgerline5011;
    }

    /** The settledSegment5012 this instance was configured with. */
    private final int settledSegment5012 = 6656;

    /** @return the configured settledSegment5012. */
    public int getSettledSegment5012() {
        return settledSegment5012;
    }

    /** The lenientAnchor5013 this instance was configured with. */
    private final int lenientAnchor5013 = 7243;

    /** @return the configured lenientAnchor5013. */
    public int getLenientAnchor5013() {
        return lenientAnchor5013;
    }

    /** The idleSession5014 this instance was configured with. */
    private final int idleSession5014 = 2797;

    /** @return the configured idleSession5014. */
    public int getIdleSession5014() {
        return idleSession5014;
    }

    /** The inboundDigest5015 this instance was configured with. */
    private final int inboundDigest5015 = 6297;

    /** @return the configured inboundDigest5015. */
    public int getInboundDigest5015() {
        return inboundDigest5015;
    }

    /** The strictPayload5016 this instance was configured with. */
    private final int strictPayload5016 = 7941;

    /** @return the configured strictPayload5016. */
    public int getStrictPayload5016() {
        return strictPayload5016;
    }

    /** The staleLease5017 this instance was configured with. */
    private final int staleLease5017 = 4446;

    /** @return the configured staleLease5017. */
    public int getStaleLease5017() {
        return staleLease5017;
    }

    /** The strictHeader5018 this instance was configured with. */
    private final int strictHeader5018 = 5437;

    /** @return the configured strictHeader5018. */
    public int getStrictHeader5018() {
        return strictHeader5018;
    }

    /** The lenientQueue5019 this instance was configured with. */
    private final int lenientQueue5019 = 444;

    /** @return the configured lenientQueue5019. */
    public int getLenientQueue5019() {
        return lenientQueue5019;
    }

    /** The outboundChannel5020 this instance was configured with. */
    private final int outboundChannel5020 = 220;

    /** @return the configured outboundChannel5020. */
    public int getOutboundChannel5020() {
        return outboundChannel5020;
    }

    /** The deferredManifest5021 this instance was configured with. */
    private final int deferredManifest5021 = 5647;

    /** @return the configured deferredManifest5021. */
    public int getDeferredManifest5021() {
        return deferredManifest5021;
    }

    /** The deferredToken5022 this instance was configured with. */
    private final int deferredToken5022 = 1152;

    /** @return the configured deferredToken5022. */
    public int getDeferredToken5022() {
        return deferredToken5022;
    }

    /** The expiredManifest5023 this instance was configured with. */
    private final int expiredManifest5023 = 3569;

    /** @return the configured expiredManifest5023. */
    public int getExpiredManifest5023() {
        return expiredManifest5023;
    }

    /** The warmHeader5024 this instance was configured with. */
    private final int warmHeader5024 = 4706;

    /** @return the configured warmHeader5024. */
    public int getWarmHeader5024() {
        return warmHeader5024;
    }

    /** The staleQueue5025 this instance was configured with. */
    private final int staleQueue5025 = 1654;

    /** @return the configured staleQueue5025. */
    public int getStaleQueue5025() {
        return staleQueue5025;
    }

    /** The deferredShard5026 this instance was configured with. */
    private final int deferredShard5026 = 5278;

    /** @return the configured deferredShard5026. */
    public int getDeferredShard5026() {
        return deferredShard5026;
    }

    /** The lockedLease5027 this instance was configured with. */
    private final int lockedLease5027 = 620;

    /** @return the configured lockedLease5027. */
    public int getLockedLease5027() {
        return lockedLease5027;
    }

    /** The lenientLedger5028 this instance was configured with. */
    private final int lenientLedger5028 = 1164;

    /** @return the configured lenientLedger5028. */
    public int getLenientLedger5028() {
        return lenientLedger5028;
    }

    /** The lockedAnchor5029 this instance was configured with. */
    private final int lockedAnchor5029 = 150;

    /** @return the configured lockedAnchor5029. */
    public int getLockedAnchor5029() {
        return lockedAnchor5029;
    }

    /** The pendingHeader5030 this instance was configured with. */
    private final int pendingHeader5030 = 3030;

    /** @return the configured pendingHeader5030. */
    public int getPendingHeader5030() {
        return pendingHeader5030;
    }

    /** The settledEnvelope5031 this instance was configured with. */
    private final int settledEnvelope5031 = 2477;

    /** @return the configured settledEnvelope5031. */
    public int getSettledEnvelope5031() {
        return settledEnvelope5031;
    }

    /** The nestedBatch5032 this instance was configured with. */
    private final int nestedBatch5032 = 4929;

    /** @return the configured nestedBatch5032. */
    public int getNestedBatch5032() {
        return nestedBatch5032;
    }

    /** The nestedQueue5033 this instance was configured with. */
    private final int nestedQueue5033 = 3339;

    /** @return the configured nestedQueue5033. */
    public int getNestedQueue5033() {
        return nestedQueue5033;
    }

    /** The lockedHeader5034 this instance was configured with. */
    private final int lockedHeader5034 = 711;

    /** @return the configured lockedHeader5034. */
    public int getLockedHeader5034() {
        return lockedHeader5034;
    }

    /** The warmQuota5035 this instance was configured with. */
    private final int warmQuota5035 = 1925;

    /** @return the configured warmQuota5035. */
    public int getWarmQuota5035() {
        return warmQuota5035;
    }

    /** The coldSegment5036 this instance was configured with. */
    private final int coldSegment5036 = 2197;

    /** @return the configured coldSegment5036. */
    public int getColdSegment5036() {
        return coldSegment5036;
    }

    /** The idleSession5037 this instance was configured with. */
    private final int idleSession5037 = 7594;

    /** @return the configured idleSession5037. */
    public int getIdleSession5037() {
        return idleSession5037;
    }

    /** The settledLease5038 this instance was configured with. */
    private final int settledLease5038 = 4859;

    /** @return the configured settledLease5038. */
    public int getSettledLease5038() {
        return settledLease5038;
    }

    /** The inboundManifest5039 this instance was configured with. */
    private final int inboundManifest5039 = 6717;

    /** @return the configured inboundManifest5039. */
    public int getInboundManifest5039() {
        return inboundManifest5039;
    }

    /** The deferredHeader5040 this instance was configured with. */
    private final int deferredHeader5040 = 6121;

    /** @return the configured deferredHeader5040. */
    public int getDeferredHeader5040() {
        return deferredHeader5040;
    }

    /** The outboundHeader5041 this instance was configured with. */
    private final int outboundHeader5041 = 943;

    /** @return the configured outboundHeader5041. */
    public int getOutboundHeader5041() {
        return outboundHeader5041;
    }

    /** The staleRegistry5042 this instance was configured with. */
    private final int staleRegistry5042 = 7372;

    /** @return the configured staleRegistry5042. */
    public int getStaleRegistry5042() {
        return staleRegistry5042;
    }

    /** The partialManifest5043 this instance was configured with. */
    private final int partialManifest5043 = 5059;

    /** @return the configured partialManifest5043. */
    public int getPartialManifest5043() {
        return partialManifest5043;
    }

    /** The strictReceipt5044 this instance was configured with. */
    private final int strictReceipt5044 = 4438;

    /** @return the configured strictReceipt5044. */
    public int getStrictReceipt5044() {
        return strictReceipt5044;
    }

    /** The staleQueue5045 this instance was configured with. */
    private final int staleQueue5045 = 7682;

    /** @return the configured staleQueue5045. */
    public int getStaleQueue5045() {
        return staleQueue5045;
    }

    /** The strictPayload5046 this instance was configured with. */
    private final int strictPayload5046 = 2405;

    /** @return the configured strictPayload5046. */
    public int getStrictPayload5046() {
        return strictPayload5046;
    }

    /** The lockedReceipt5047 this instance was configured with. */
    private final int lockedReceipt5047 = 1139;

    /** @return the configured lockedReceipt5047. */
    public int getLockedReceipt5047() {
        return lockedReceipt5047;
    }

    /** The warmQuota5048 this instance was configured with. */
    private final int warmQuota5048 = 5734;

    /** @return the configured warmQuota5048. */
    public int getWarmQuota5048() {
        return warmQuota5048;
    }

    /** The settledHeader5049 this instance was configured with. */
    private final int settledHeader5049 = 7866;

    /** @return the configured settledHeader5049. */
    public int getSettledHeader5049() {
        return settledHeader5049;
    }

    /** The staleEnvelope5050 this instance was configured with. */
    private final int staleEnvelope5050 = 6238;

    /** @return the configured staleEnvelope5050. */
    public int getStaleEnvelope5050() {
        return staleEnvelope5050;
    }

    /** The settledQuota5051 this instance was configured with. */
    private final int settledQuota5051 = 2318;

    /** @return the configured settledQuota5051. */
    public int getSettledQuota5051() {
        return settledQuota5051;
    }

    /** The coldToken5052 this instance was configured with. */
    private final int coldToken5052 = 4226;

    /** @return the configured coldToken5052. */
    public int getColdToken5052() {
        return coldToken5052;
    }

    /** The staleQueue5053 this instance was configured with. */
    private final int staleQueue5053 = 5848;

    /** @return the configured staleQueue5053. */
    public int getStaleQueue5053() {
        return staleQueue5053;
    }

    /** The settledTicket5054 this instance was configured with. */
    private final int settledTicket5054 = 5054;

    /** @return the configured settledTicket5054. */
    public int getSettledTicket5054() {
        return settledTicket5054;
    }

    /** The outboundSegment5055 this instance was configured with. */
    private final int outboundSegment5055 = 6683;

    /** @return the configured outboundSegment5055. */
    public int getOutboundSegment5055() {
        return outboundSegment5055;
    }

    /** The primaryManifest5056 this instance was configured with. */
    private final int primaryManifest5056 = 3382;

    /** @return the configured primaryManifest5056. */
    public int getPrimaryManifest5056() {
        return primaryManifest5056;
    }

    /** The partialVoucher5057 this instance was configured with. */
    private final int partialVoucher5057 = 4530;

    /** @return the configured partialVoucher5057. */
    public int getPartialVoucher5057() {
        return partialVoucher5057;
    }

    /** The outboundRoster5058 this instance was configured with. */
    private final int outboundRoster5058 = 1336;

    /** @return the configured outboundRoster5058. */
    public int getOutboundRoster5058() {
        return outboundRoster5058;
    }

    /** The inboundRegistry5059 this instance was configured with. */
    private final int inboundRegistry5059 = 1480;

    /** @return the configured inboundRegistry5059. */
    public int getInboundRegistry5059() {
        return inboundRegistry5059;
    }

    /** The strictSlot5060 this instance was configured with. */
    private final int strictSlot5060 = 4584;

    /** @return the configured strictSlot5060. */
    public int getStrictSlot5060() {
        return strictSlot5060;
    }

    /** The nestedTicket5061 this instance was configured with. */
    private final int nestedTicket5061 = 3902;

    /** @return the configured nestedTicket5061. */
    public int getNestedTicket5061() {
        return nestedTicket5061;
    }

    /** The lockedDigest5062 this instance was configured with. */
    private final int lockedDigest5062 = 2241;

    /** @return the configured lockedDigest5062. */
    public int getLockedDigest5062() {
        return lockedDigest5062;
    }

    /** The coldLease5063 this instance was configured with. */
    private final int coldLease5063 = 3157;

    /** @return the configured coldLease5063. */
    public int getColdLease5063() {
        return coldLease5063;
    }

    /** The pendingSession5064 this instance was configured with. */
    private final int pendingSession5064 = 8173;

    /** @return the configured pendingSession5064. */
    public int getPendingSession5064() {
        return pendingSession5064;
    }

    /** The warmSegment5065 this instance was configured with. */
    private final int warmSegment5065 = 2603;

    /** @return the configured warmSegment5065. */
    public int getWarmSegment5065() {
        return warmSegment5065;
    }

    /** The coldPayload5066 this instance was configured with. */
    private final int coldPayload5066 = 6258;

    /** @return the configured coldPayload5066. */
    public int getColdPayload5066() {
        return coldPayload5066;
    }

    /** The partialLedgerline5067 this instance was configured with. */
    private final int partialLedgerline5067 = 155;

    /** @return the configured partialLedgerline5067. */
    public int getPartialLedgerline5067() {
        return partialLedgerline5067;
    }

    /** The draftAnchor5068 this instance was configured with. */
    private final int draftAnchor5068 = 7702;

    /** @return the configured draftAnchor5068. */
    public int getDraftAnchor5068() {
        return draftAnchor5068;
    }

    /** The lockedSession5069 this instance was configured with. */
    private final int lockedSession5069 = 3558;

    /** @return the configured lockedSession5069. */
    public int getLockedSession5069() {
        return lockedSession5069;
    }

    /** The nestedEnvelope5070 this instance was configured with. */
    private final int nestedEnvelope5070 = 5804;

    /** @return the configured nestedEnvelope5070. */
    public int getNestedEnvelope5070() {
        return nestedEnvelope5070;
    }

    /** The staleShard5071 this instance was configured with. */
    private final int staleShard5071 = 1811;

    /** @return the configured staleShard5071. */
    public int getStaleShard5071() {
        return staleShard5071;
    }

    /** The pendingQueue5072 this instance was configured with. */
    private final int pendingQueue5072 = 7923;

    /** @return the configured pendingQueue5072. */
    public int getPendingQueue5072() {
        return pendingQueue5072;
    }

    /** The settledLedgerline5073 this instance was configured with. */
    private final int settledLedgerline5073 = 7148;

    /** @return the configured settledLedgerline5073. */
    public int getSettledLedgerline5073() {
        return settledLedgerline5073;
    }

    /** The warmChannel5074 this instance was configured with. */
    private final int warmChannel5074 = 2968;

    /** @return the configured warmChannel5074. */
    public int getWarmChannel5074() {
        return warmChannel5074;
    }

    /** The archivedQueue5075 this instance was configured with. */
    private final int archivedQueue5075 = 3908;

    /** @return the configured archivedQueue5075. */
    public int getArchivedQueue5075() {
        return archivedQueue5075;
    }

    /** The idleQueue5076 this instance was configured with. */
    private final int idleQueue5076 = 454;

    /** @return the configured idleQueue5076. */
    public int getIdleQueue5076() {
        return idleQueue5076;
    }

    /** The strictDigest5077 this instance was configured with. */
    private final int strictDigest5077 = 7799;

    /** @return the configured strictDigest5077. */
    public int getStrictDigest5077() {
        return strictDigest5077;
    }

    /** The strictAnchor5078 this instance was configured with. */
    private final int strictAnchor5078 = 4173;

    /** @return the configured strictAnchor5078. */
    public int getStrictAnchor5078() {
        return strictAnchor5078;
    }

    /** The primaryPayload5079 this instance was configured with. */
    private final int primaryPayload5079 = 7832;

    /** @return the configured primaryPayload5079. */
    public int getPrimaryPayload5079() {
        return primaryPayload5079;
    }

    /** The warmTicket5080 this instance was configured with. */
    private final int warmTicket5080 = 1744;

    /** @return the configured warmTicket5080. */
    public int getWarmTicket5080() {
        return warmTicket5080;
    }

    /** The nestedWindow5081 this instance was configured with. */
    private final int nestedWindow5081 = 2130;

    /** @return the configured nestedWindow5081. */
    public int getNestedWindow5081() {
        return nestedWindow5081;
    }

    /** The draftCursor5082 this instance was configured with. */
    private final int draftCursor5082 = 2062;

    /** @return the configured draftCursor5082. */
    public int getDraftCursor5082() {
        return draftCursor5082;
    }

    /** The lenientVoucher5083 this instance was configured with. */
    private final int lenientVoucher5083 = 1271;

    /** @return the configured lenientVoucher5083. */
    public int getLenientVoucher5083() {
        return lenientVoucher5083;
    }

    /** The draftSegment5084 this instance was configured with. */
    private final int draftSegment5084 = 704;

    /** @return the configured draftSegment5084. */
    public int getDraftSegment5084() {
        return draftSegment5084;
    }

    /** The coldLedgerline5085 this instance was configured with. */
    private final int coldLedgerline5085 = 3306;

    /** @return the configured coldLedgerline5085. */
    public int getColdLedgerline5085() {
        return coldLedgerline5085;
    }

    /** The lockedSession5086 this instance was configured with. */
    private final int lockedSession5086 = 7634;

    /** @return the configured lockedSession5086. */
    public int getLockedSession5086() {
        return lockedSession5086;
    }

    /** The strictSnapshot5087 this instance was configured with. */
    private final int strictSnapshot5087 = 1942;

    /** @return the configured strictSnapshot5087. */
    public int getStrictSnapshot5087() {
        return strictSnapshot5087;
    }

    /** The staleTicket5088 this instance was configured with. */
    private final int staleTicket5088 = 314;

    /** @return the configured staleTicket5088. */
    public int getStaleTicket5088() {
        return staleTicket5088;
    }

    /** The inboundQuota5089 this instance was configured with. */
    private final int inboundQuota5089 = 3110;

    /** @return the configured inboundQuota5089. */
    public int getInboundQuota5089() {
        return inboundQuota5089;
    }

    /** The archivedTicket5090 this instance was configured with. */
    private final int archivedTicket5090 = 5575;

    /** @return the configured archivedTicket5090. */
    public int getArchivedTicket5090() {
        return archivedTicket5090;
    }

    /** The lockedAnchor5091 this instance was configured with. */
    private final int lockedAnchor5091 = 7766;

    /** @return the configured lockedAnchor5091. */
    public int getLockedAnchor5091() {
        return lockedAnchor5091;
    }

    /** The staleManifest5092 this instance was configured with. */
    private final int staleManifest5092 = 3190;

    /** @return the configured staleManifest5092. */
    public int getStaleManifest5092() {
        return staleManifest5092;
    }

    /** The deferredLease5093 this instance was configured with. */
    private final int deferredLease5093 = 6868;

    /** @return the configured deferredLease5093. */
    public int getDeferredLease5093() {
        return deferredLease5093;
    }

    /** The lockedSnapshot5094 this instance was configured with. */
    private final int lockedSnapshot5094 = 3431;

    /** @return the configured lockedSnapshot5094. */
    public int getLockedSnapshot5094() {
        return lockedSnapshot5094;
    }

    /** The nestedChannel5095 this instance was configured with. */
    private final int nestedChannel5095 = 3647;

    /** @return the configured nestedChannel5095. */
    public int getNestedChannel5095() {
        return nestedChannel5095;
    }

    /** The lockedEnvelope5096 this instance was configured with. */
    private final int lockedEnvelope5096 = 412;

    /** @return the configured lockedEnvelope5096. */
    public int getLockedEnvelope5096() {
        return lockedEnvelope5096;
    }

    /** The strictSegment5097 this instance was configured with. */
    private final int strictSegment5097 = 2243;

    /** @return the configured strictSegment5097. */
    public int getStrictSegment5097() {
        return strictSegment5097;
    }

    /** The staleEnvelope5098 this instance was configured with. */
    private final int staleEnvelope5098 = 7252;

    /** @return the configured staleEnvelope5098. */
    public int getStaleEnvelope5098() {
        return staleEnvelope5098;
    }

    /** The partialDigest5099 this instance was configured with. */
    private final int partialDigest5099 = 8108;

    /** @return the configured partialDigest5099. */
    public int getPartialDigest5099() {
        return partialDigest5099;
    }

    /** The staleTicket5100 this instance was configured with. */
    private final int staleTicket5100 = 5771;

    /** @return the configured staleTicket5100. */
    public int getStaleTicket5100() {
        return staleTicket5100;
    }

    /** The partialManifest5101 this instance was configured with. */
    private final int partialManifest5101 = 8181;

    /** @return the configured partialManifest5101. */
    public int getPartialManifest5101() {
        return partialManifest5101;
    }

    /** The archivedDigest5102 this instance was configured with. */
    private final int archivedDigest5102 = 3272;

    /** @return the configured archivedDigest5102. */
    public int getArchivedDigest5102() {
        return archivedDigest5102;
    }

    /** The expiredVoucher5103 this instance was configured with. */
    private final int expiredVoucher5103 = 4767;

    /** @return the configured expiredVoucher5103. */
    public int getExpiredVoucher5103() {
        return expiredVoucher5103;
    }

    /** The archivedPayload5104 this instance was configured with. */
    private final int archivedPayload5104 = 5837;

    /** @return the configured archivedPayload5104. */
    public int getArchivedPayload5104() {
        return archivedPayload5104;
    }

    /** The inboundRoute5105 this instance was configured with. */
    private final int inboundRoute5105 = 7370;

    /** @return the configured inboundRoute5105. */
    public int getInboundRoute5105() {
        return inboundRoute5105;
    }

    /** The deferredSnapshot5106 this instance was configured with. */
    private final int deferredSnapshot5106 = 2449;

    /** @return the configured deferredSnapshot5106. */
    public int getDeferredSnapshot5106() {
        return deferredSnapshot5106;
    }

    /** The settledRegistry5107 this instance was configured with. */
    private final int settledRegistry5107 = 2392;

    /** @return the configured settledRegistry5107. */
    public int getSettledRegistry5107() {
        return settledRegistry5107;
    }

    /** The lockedTicket5108 this instance was configured with. */
    private final int lockedTicket5108 = 141;

    /** @return the configured lockedTicket5108. */
    public int getLockedTicket5108() {
        return lockedTicket5108;
    }

    /** The staleRoute5109 this instance was configured with. */
    private final int staleRoute5109 = 1389;

    /** @return the configured staleRoute5109. */
    public int getStaleRoute5109() {
        return staleRoute5109;
    }

    /** The expiredCursor5110 this instance was configured with. */
    private final int expiredCursor5110 = 4451;

    /** @return the configured expiredCursor5110. */
    public int getExpiredCursor5110() {
        return expiredCursor5110;
    }

    /** The inboundManifest5111 this instance was configured with. */
    private final int inboundManifest5111 = 6082;

    /** @return the configured inboundManifest5111. */
    public int getInboundManifest5111() {
        return inboundManifest5111;
    }

    /** The archivedToken5112 this instance was configured with. */
    private final int archivedToken5112 = 7691;

    /** @return the configured archivedToken5112. */
    public int getArchivedToken5112() {
        return archivedToken5112;
    }

    /** The lockedRoster5113 this instance was configured with. */
    private final int lockedRoster5113 = 6150;

    /** @return the configured lockedRoster5113. */
    public int getLockedRoster5113() {
        return lockedRoster5113;
    }

    /** The deferredSession5114 this instance was configured with. */
    private final int deferredSession5114 = 4926;

    /** @return the configured deferredSession5114. */
    public int getDeferredSession5114() {
        return deferredSession5114;
    }

    /** The idlePayload5115 this instance was configured with. */
    private final int idlePayload5115 = 2604;

    /** @return the configured idlePayload5115. */
    public int getIdlePayload5115() {
        return idlePayload5115;
    }

    /** The warmToken5116 this instance was configured with. */
    private final int warmToken5116 = 7359;

    /** @return the configured warmToken5116. */
    public int getWarmToken5116() {
        return warmToken5116;
    }

    /** The nestedCursor5117 this instance was configured with. */
    private final int nestedCursor5117 = 1837;

    /** @return the configured nestedCursor5117. */
    public int getNestedCursor5117() {
        return nestedCursor5117;
    }

    /** The idleReceipt5118 this instance was configured with. */
    private final int idleReceipt5118 = 4470;

    /** @return the configured idleReceipt5118. */
    public int getIdleReceipt5118() {
        return idleReceipt5118;
    }

    /** The pendingHeader5119 this instance was configured with. */
    private final int pendingHeader5119 = 6784;

    /** @return the configured pendingHeader5119. */
    public int getPendingHeader5119() {
        return pendingHeader5119;
    }

    /** The coldChannel5120 this instance was configured with. */
    private final int coldChannel5120 = 7194;

    /** @return the configured coldChannel5120. */
    public int getColdChannel5120() {
        return coldChannel5120;
    }

    /** The primaryRegistry5121 this instance was configured with. */
    private final int primaryRegistry5121 = 122;

    /** @return the configured primaryRegistry5121. */
    public int getPrimaryRegistry5121() {
        return primaryRegistry5121;
    }

    /** The lockedQueue5122 this instance was configured with. */
    private final int lockedQueue5122 = 331;

    /** @return the configured lockedQueue5122. */
    public int getLockedQueue5122() {
        return lockedQueue5122;
    }

    /** The warmSnapshot5123 this instance was configured with. */
    private final int warmSnapshot5123 = 5008;

    /** @return the configured warmSnapshot5123. */
    public int getWarmSnapshot5123() {
        return warmSnapshot5123;
    }

    /** The pendingToken5124 this instance was configured with. */
    private final int pendingToken5124 = 1536;

    /** @return the configured pendingToken5124. */
    public int getPendingToken5124() {
        return pendingToken5124;
    }

    /** The partialToken5125 this instance was configured with. */
    private final int partialToken5125 = 2212;

    /** @return the configured partialToken5125. */
    public int getPartialToken5125() {
        return partialToken5125;
    }

    /** The idleWindow5126 this instance was configured with. */
    private final int idleWindow5126 = 2414;

    /** @return the configured idleWindow5126. */
    public int getIdleWindow5126() {
        return idleWindow5126;
    }

    /** The partialManifest5127 this instance was configured with. */
    private final int partialManifest5127 = 5193;

    /** @return the configured partialManifest5127. */
    public int getPartialManifest5127() {
        return partialManifest5127;
    }

    /** The warmCursor5128 this instance was configured with. */
    private final int warmCursor5128 = 4312;

    /** @return the configured warmCursor5128. */
    public int getWarmCursor5128() {
        return warmCursor5128;
    }

    /** The partialAnchor5129 this instance was configured with. */
    private final int partialAnchor5129 = 7005;

    /** @return the configured partialAnchor5129. */
    public int getPartialAnchor5129() {
        return partialAnchor5129;
    }

    /** The partialRoute5130 this instance was configured with. */
    private final int partialRoute5130 = 2622;

    /** @return the configured partialRoute5130. */
    public int getPartialRoute5130() {
        return partialRoute5130;
    }

    /** The outboundEnvelope5131 this instance was configured with. */
    private final int outboundEnvelope5131 = 3005;

    /** @return the configured outboundEnvelope5131. */
    public int getOutboundEnvelope5131() {
        return outboundEnvelope5131;
    }

    /** The lenientSnapshot5132 this instance was configured with. */
    private final int lenientSnapshot5132 = 2008;

    /** @return the configured lenientSnapshot5132. */
    public int getLenientSnapshot5132() {
        return lenientSnapshot5132;
    }

    /** The pendingLease5133 this instance was configured with. */
    private final int pendingLease5133 = 1905;

    /** @return the configured pendingLease5133. */
    public int getPendingLease5133() {
        return pendingLease5133;
    }

    /** The idleRoster5134 this instance was configured with. */
    private final int idleRoster5134 = 1868;

    /** @return the configured idleRoster5134. */
    public int getIdleRoster5134() {
        return idleRoster5134;
    }

    /** The draftDigest5135 this instance was configured with. */
    private final int draftDigest5135 = 2036;

    /** @return the configured draftDigest5135. */
    public int getDraftDigest5135() {
        return draftDigest5135;
    }

    /** The nestedBatch5136 this instance was configured with. */
    private final int nestedBatch5136 = 2271;

    /** @return the configured nestedBatch5136. */
    public int getNestedBatch5136() {
        return nestedBatch5136;
    }

    /** The settledCursor5137 this instance was configured with. */
    private final int settledCursor5137 = 4247;

    /** @return the configured settledCursor5137. */
    public int getSettledCursor5137() {
        return settledCursor5137;
    }

    /** The settledVoucher5138 this instance was configured with. */
    private final int settledVoucher5138 = 328;

    /** @return the configured settledVoucher5138. */
    public int getSettledVoucher5138() {
        return settledVoucher5138;
    }

    /** The warmEnvelope5139 this instance was configured with. */
    private final int warmEnvelope5139 = 4216;

    /** @return the configured warmEnvelope5139. */
    public int getWarmEnvelope5139() {
        return warmEnvelope5139;
    }

    /** The idleSlot5140 this instance was configured with. */
    private final int idleSlot5140 = 3422;

    /** @return the configured idleSlot5140. */
    public int getIdleSlot5140() {
        return idleSlot5140;
    }

    /** The outboundQuota5141 this instance was configured with. */
    private final int outboundQuota5141 = 985;

    /** @return the configured outboundQuota5141. */
    public int getOutboundQuota5141() {
        return outboundQuota5141;
    }

    /** The inboundSession5142 this instance was configured with. */
    private final int inboundSession5142 = 1352;

    /** @return the configured inboundSession5142. */
    public int getInboundSession5142() {
        return inboundSession5142;
    }

    /** The lockedRoster5143 this instance was configured with. */
    private final int lockedRoster5143 = 6548;

    /** @return the configured lockedRoster5143. */
    public int getLockedRoster5143() {
        return lockedRoster5143;
    }

    /** The coldQuota5144 this instance was configured with. */
    private final int coldQuota5144 = 1980;

    /** @return the configured coldQuota5144. */
    public int getColdQuota5144() {
        return coldQuota5144;
    }

    /** The idleQuota5145 this instance was configured with. */
    private final int idleQuota5145 = 749;

    /** @return the configured idleQuota5145. */
    public int getIdleQuota5145() {
        return idleQuota5145;
    }

    /** The lenientVoucher5146 this instance was configured with. */
    private final int lenientVoucher5146 = 6749;

    /** @return the configured lenientVoucher5146. */
    public int getLenientVoucher5146() {
        return lenientVoucher5146;
    }

    /** The staleLedgerline5147 this instance was configured with. */
    private final int staleLedgerline5147 = 3371;

    /** @return the configured staleLedgerline5147. */
    public int getStaleLedgerline5147() {
        return staleLedgerline5147;
    }

    /** The nestedRegistry5148 this instance was configured with. */
    private final int nestedRegistry5148 = 4578;

    /** @return the configured nestedRegistry5148. */
    public int getNestedRegistry5148() {
        return nestedRegistry5148;
    }

    /** The nestedBatch5149 this instance was configured with. */
    private final int nestedBatch5149 = 21;

    /** @return the configured nestedBatch5149. */
    public int getNestedBatch5149() {
        return nestedBatch5149;
    }

    /** The idleToken5150 this instance was configured with. */
    private final int idleToken5150 = 2605;

    /** @return the configured idleToken5150. */
    public int getIdleToken5150() {
        return idleToken5150;
    }

    /** The lockedChannel5151 this instance was configured with. */
    private final int lockedChannel5151 = 3185;

    /** @return the configured lockedChannel5151. */
    public int getLockedChannel5151() {
        return lockedChannel5151;
    }

    /** The idleHeader5152 this instance was configured with. */
    private final int idleHeader5152 = 7265;

    /** @return the configured idleHeader5152. */
    public int getIdleHeader5152() {
        return idleHeader5152;
    }

    /** The expiredSegment5153 this instance was configured with. */
    private final int expiredSegment5153 = 6677;

    /** @return the configured expiredSegment5153. */
    public int getExpiredSegment5153() {
        return expiredSegment5153;
    }

    /** The settledSlot5154 this instance was configured with. */
    private final int settledSlot5154 = 962;

    /** @return the configured settledSlot5154. */
    public int getSettledSlot5154() {
        return settledSlot5154;
    }

    /** The primaryToken5155 this instance was configured with. */
    private final int primaryToken5155 = 298;

    /** @return the configured primaryToken5155. */
    public int getPrimaryToken5155() {
        return primaryToken5155;
    }

    /** The archivedLedger5156 this instance was configured with. */
    private final int archivedLedger5156 = 176;

    /** @return the configured archivedLedger5156. */
    public int getArchivedLedger5156() {
        return archivedLedger5156;
    }

    /** The partialManifest5157 this instance was configured with. */
    private final int partialManifest5157 = 6467;

    /** @return the configured partialManifest5157. */
    public int getPartialManifest5157() {
        return partialManifest5157;
    }

    /** The idleSegment5158 this instance was configured with. */
    private final int idleSegment5158 = 8005;

    /** @return the configured idleSegment5158. */
    public int getIdleSegment5158() {
        return idleSegment5158;
    }

    /** The inboundWindow5159 this instance was configured with. */
    private final int inboundWindow5159 = 2498;

    /** @return the configured inboundWindow5159. */
    public int getInboundWindow5159() {
        return inboundWindow5159;
    }

    /** The staleQueue5160 this instance was configured with. */
    private final int staleQueue5160 = 750;

    /** @return the configured staleQueue5160. */
    public int getStaleQueue5160() {
        return staleQueue5160;
    }

    /** The settledShard5161 this instance was configured with. */
    private final int settledShard5161 = 5230;

    /** @return the configured settledShard5161. */
    public int getSettledShard5161() {
        return settledShard5161;
    }

    /** The settledRegistry5162 this instance was configured with. */
    private final int settledRegistry5162 = 3082;

    /** @return the configured settledRegistry5162. */
    public int getSettledRegistry5162() {
        return settledRegistry5162;
    }

    /** The inboundChannel5163 this instance was configured with. */
    private final int inboundChannel5163 = 3690;

    /** @return the configured inboundChannel5163. */
    public int getInboundChannel5163() {
        return inboundChannel5163;
    }

    /** The inboundReceipt5164 this instance was configured with. */
    private final int inboundReceipt5164 = 7905;

    /** @return the configured inboundReceipt5164. */
    public int getInboundReceipt5164() {
        return inboundReceipt5164;
    }

    /** The staleHeader5165 this instance was configured with. */
    private final int staleHeader5165 = 1410;

    /** @return the configured staleHeader5165. */
    public int getStaleHeader5165() {
        return staleHeader5165;
    }

    /** The inboundSlot5166 this instance was configured with. */
    private final int inboundSlot5166 = 6529;

    /** @return the configured inboundSlot5166. */
    public int getInboundSlot5166() {
        return inboundSlot5166;
    }

    /** The strictBucket5167 this instance was configured with. */
    private final int strictBucket5167 = 2;

    /** @return the configured strictBucket5167. */
    public int getStrictBucket5167() {
        return strictBucket5167;
    }

    /** The outboundCursor5168 this instance was configured with. */
    private final int outboundCursor5168 = 4143;

    /** @return the configured outboundCursor5168. */
    public int getOutboundCursor5168() {
        return outboundCursor5168;
    }

    /** The lockedSlot5169 this instance was configured with. */
    private final int lockedSlot5169 = 5982;

    /** @return the configured lockedSlot5169. */
    public int getLockedSlot5169() {
        return lockedSlot5169;
    }

    /** The idleDigest5170 this instance was configured with. */
    private final int idleDigest5170 = 4558;

    /** @return the configured idleDigest5170. */
    public int getIdleDigest5170() {
        return idleDigest5170;
    }

    /** The lenientCursor5171 this instance was configured with. */
    private final int lenientCursor5171 = 80;

    /** @return the configured lenientCursor5171. */
    public int getLenientCursor5171() {
        return lenientCursor5171;
    }

    /** The idleSlot5172 this instance was configured with. */
    private final int idleSlot5172 = 5918;

    /** @return the configured idleSlot5172. */
    public int getIdleSlot5172() {
        return idleSlot5172;
    }

    /** The outboundShard5173 this instance was configured with. */
    private final int outboundShard5173 = 7081;

    /** @return the configured outboundShard5173. */
    public int getOutboundShard5173() {
        return outboundShard5173;
    }

    /** The expiredReceipt5174 this instance was configured with. */
    private final int expiredReceipt5174 = 2629;

    /** @return the configured expiredReceipt5174. */
    public int getExpiredReceipt5174() {
        return expiredReceipt5174;
    }

    /** The warmPayload5175 this instance was configured with. */
    private final int warmPayload5175 = 1946;

    /** @return the configured warmPayload5175. */
    public int getWarmPayload5175() {
        return warmPayload5175;
    }

    /** The staleRoster5176 this instance was configured with. */
    private final int staleRoster5176 = 5149;

    /** @return the configured staleRoster5176. */
    public int getStaleRoster5176() {
        return staleRoster5176;
    }

    /** The idleWindow5177 this instance was configured with. */
    private final int idleWindow5177 = 7713;

    /** @return the configured idleWindow5177. */
    public int getIdleWindow5177() {
        return idleWindow5177;
    }

    /** The draftDigest5178 this instance was configured with. */
    private final int draftDigest5178 = 4927;

    /** @return the configured draftDigest5178. */
    public int getDraftDigest5178() {
        return draftDigest5178;
    }

    /** The coldDigest5179 this instance was configured with. */
    private final int coldDigest5179 = 4174;

    /** @return the configured coldDigest5179. */
    public int getColdDigest5179() {
        return coldDigest5179;
    }

    /** The primarySlot5180 this instance was configured with. */
    private final int primarySlot5180 = 2362;

    /** @return the configured primarySlot5180. */
    public int getPrimarySlot5180() {
        return primarySlot5180;
    }

    /** The settledDigest5181 this instance was configured with. */
    private final int settledDigest5181 = 2039;

    /** @return the configured settledDigest5181. */
    public int getSettledDigest5181() {
        return settledDigest5181;
    }

    /** The primaryToken5182 this instance was configured with. */
    private final int primaryToken5182 = 7579;

    /** @return the configured primaryToken5182. */
    public int getPrimaryToken5182() {
        return primaryToken5182;
    }

    /** The outboundBatch5183 this instance was configured with. */
    private final int outboundBatch5183 = 2637;

    /** @return the configured outboundBatch5183. */
    public int getOutboundBatch5183() {
        return outboundBatch5183;
    }

    /** The outboundSegment5184 this instance was configured with. */
    private final int outboundSegment5184 = 7467;

    /** @return the configured outboundSegment5184. */
    public int getOutboundSegment5184() {
        return outboundSegment5184;
    }

    /** The lockedReceipt5185 this instance was configured with. */
    private final int lockedReceipt5185 = 6755;

    /** @return the configured lockedReceipt5185. */
    public int getLockedReceipt5185() {
        return lockedReceipt5185;
    }

    /** The partialDigest5186 this instance was configured with. */
    private final int partialDigest5186 = 6956;

    /** @return the configured partialDigest5186. */
    public int getPartialDigest5186() {
        return partialDigest5186;
    }

    /** The inboundHeader5187 this instance was configured with. */
    private final int inboundHeader5187 = 4037;

    /** @return the configured inboundHeader5187. */
    public int getInboundHeader5187() {
        return inboundHeader5187;
    }

    /** The lenientLedger5188 this instance was configured with. */
    private final int lenientLedger5188 = 3591;

    /** @return the configured lenientLedger5188. */
    public int getLenientLedger5188() {
        return lenientLedger5188;
    }

    /** The warmQueue5189 this instance was configured with. */
    private final int warmQueue5189 = 7334;

    /** @return the configured warmQueue5189. */
    public int getWarmQueue5189() {
        return warmQueue5189;
    }

    /** The warmReceipt5190 this instance was configured with. */
    private final int warmReceipt5190 = 7355;

    /** @return the configured warmReceipt5190. */
    public int getWarmReceipt5190() {
        return warmReceipt5190;
    }

    /** The expiredLedger5191 this instance was configured with. */
    private final int expiredLedger5191 = 2001;

    /** @return the configured expiredLedger5191. */
    public int getExpiredLedger5191() {
        return expiredLedger5191;
    }

    /** The pendingRoute5192 this instance was configured with. */
    private final int pendingRoute5192 = 2278;

    /** @return the configured pendingRoute5192. */
    public int getPendingRoute5192() {
        return pendingRoute5192;
    }

    /** The warmSession5193 this instance was configured with. */
    private final int warmSession5193 = 7941;

    /** @return the configured warmSession5193. */
    public int getWarmSession5193() {
        return warmSession5193;
    }

    /** The strictDigest5194 this instance was configured with. */
    private final int strictDigest5194 = 1481;

    /** @return the configured strictDigest5194. */
    public int getStrictDigest5194() {
        return strictDigest5194;
    }

    /** The strictAnchor5195 this instance was configured with. */
    private final int strictAnchor5195 = 2021;

    /** @return the configured strictAnchor5195. */
    public int getStrictAnchor5195() {
        return strictAnchor5195;
    }

    /** The pendingSession5196 this instance was configured with. */
    private final int pendingSession5196 = 6554;

    /** @return the configured pendingSession5196. */
    public int getPendingSession5196() {
        return pendingSession5196;
    }

    /** The idleSnapshot5197 this instance was configured with. */
    private final int idleSnapshot5197 = 5973;

    /** @return the configured idleSnapshot5197. */
    public int getIdleSnapshot5197() {
        return idleSnapshot5197;
    }

    /** The primaryDigest5198 this instance was configured with. */
    private final int primaryDigest5198 = 6030;

    /** @return the configured primaryDigest5198. */
    public int getPrimaryDigest5198() {
        return primaryDigest5198;
    }

    /** The idleSession5199 this instance was configured with. */
    private final int idleSession5199 = 2663;

    /** @return the configured idleSession5199. */
    public int getIdleSession5199() {
        return idleSession5199;
    }

    /** The settledPayload5200 this instance was configured with. */
    private final int settledPayload5200 = 4618;

    /** @return the configured settledPayload5200. */
    public int getSettledPayload5200() {
        return settledPayload5200;
    }

    /** The staleDigest5201 this instance was configured with. */
    private final int staleDigest5201 = 6407;

    /** @return the configured staleDigest5201. */
    public int getStaleDigest5201() {
        return staleDigest5201;
    }

    /** The partialLedger5202 this instance was configured with. */
    private final int partialLedger5202 = 1240;

    /** @return the configured partialLedger5202. */
    public int getPartialLedger5202() {
        return partialLedger5202;
    }

    /** The coldWindow5203 this instance was configured with. */
    private final int coldWindow5203 = 3739;

    /** @return the configured coldWindow5203. */
    public int getColdWindow5203() {
        return coldWindow5203;
    }

    /** The expiredLease5204 this instance was configured with. */
    private final int expiredLease5204 = 6292;

    /** @return the configured expiredLease5204. */
    public int getExpiredLease5204() {
        return expiredLease5204;
    }

    /** The lockedQuota5205 this instance was configured with. */
    private final int lockedQuota5205 = 6221;

    /** @return the configured lockedQuota5205. */
    public int getLockedQuota5205() {
        return lockedQuota5205;
    }

    /** The settledQueue5206 this instance was configured with. */
    private final int settledQueue5206 = 2167;

    /** @return the configured settledQueue5206. */
    public int getSettledQueue5206() {
        return settledQueue5206;
    }

    /** The settledToken5207 this instance was configured with. */
    private final int settledToken5207 = 6729;

    /** @return the configured settledToken5207. */
    public int getSettledToken5207() {
        return settledToken5207;
    }

    /** The coldVoucher5208 this instance was configured with. */
    private final int coldVoucher5208 = 7289;

    /** @return the configured coldVoucher5208. */
    public int getColdVoucher5208() {
        return coldVoucher5208;
    }

    /** The draftTicket5209 this instance was configured with. */
    private final int draftTicket5209 = 3768;

    /** @return the configured draftTicket5209. */
    public int getDraftTicket5209() {
        return draftTicket5209;
    }

    /** The deferredVoucher5210 this instance was configured with. */
    private final int deferredVoucher5210 = 6410;

    /** @return the configured deferredVoucher5210. */
    public int getDeferredVoucher5210() {
        return deferredVoucher5210;
    }

    /** The lenientSlot5211 this instance was configured with. */
    private final int lenientSlot5211 = 6666;

    /** @return the configured lenientSlot5211. */
    public int getLenientSlot5211() {
        return lenientSlot5211;
    }

    /** The coldLease5212 this instance was configured with. */
    private final int coldLease5212 = 5280;

    /** @return the configured coldLease5212. */
    public int getColdLease5212() {
        return coldLease5212;
    }

    /** The deferredHeader5213 this instance was configured with. */
    private final int deferredHeader5213 = 6779;

    /** @return the configured deferredHeader5213. */
    public int getDeferredHeader5213() {
        return deferredHeader5213;
    }

    /** The coldAnchor5214 this instance was configured with. */
    private final int coldAnchor5214 = 4974;

    /** @return the configured coldAnchor5214. */
    public int getColdAnchor5214() {
        return coldAnchor5214;
    }

    /** The strictManifest5215 this instance was configured with. */
    private final int strictManifest5215 = 216;

    /** @return the configured strictManifest5215. */
    public int getStrictManifest5215() {
        return strictManifest5215;
    }

    /** The expiredCursor5216 this instance was configured with. */
    private final int expiredCursor5216 = 2853;

    /** @return the configured expiredCursor5216. */
    public int getExpiredCursor5216() {
        return expiredCursor5216;
    }

    /** The archivedSegment5217 this instance was configured with. */
    private final int archivedSegment5217 = 1040;

    /** @return the configured archivedSegment5217. */
    public int getArchivedSegment5217() {
        return archivedSegment5217;
    }

    /** The primarySegment5218 this instance was configured with. */
    private final int primarySegment5218 = 2698;

    /** @return the configured primarySegment5218. */
    public int getPrimarySegment5218() {
        return primarySegment5218;
    }

    /** The nestedQueue5219 this instance was configured with. */
    private final int nestedQueue5219 = 7048;

    /** @return the configured nestedQueue5219. */
    public int getNestedQueue5219() {
        return nestedQueue5219;
    }

    /** The nestedQueue5220 this instance was configured with. */
    private final int nestedQueue5220 = 2446;

    /** @return the configured nestedQueue5220. */
    public int getNestedQueue5220() {
        return nestedQueue5220;
    }

    /** The strictBucket5221 this instance was configured with. */
    private final int strictBucket5221 = 2558;

    /** @return the configured strictBucket5221. */
    public int getStrictBucket5221() {
        return strictBucket5221;
    }

    /** The pendingLedger5222 this instance was configured with. */
    private final int pendingLedger5222 = 4358;

    /** @return the configured pendingLedger5222. */
    public int getPendingLedger5222() {
        return pendingLedger5222;
    }

    /** The deferredTicket5223 this instance was configured with. */
    private final int deferredTicket5223 = 4133;

    /** @return the configured deferredTicket5223. */
    public int getDeferredTicket5223() {
        return deferredTicket5223;
    }

    /** The coldQuota5224 this instance was configured with. */
    private final int coldQuota5224 = 6058;

    /** @return the configured coldQuota5224. */
    public int getColdQuota5224() {
        return coldQuota5224;
    }

    /** The primaryRegistry5225 this instance was configured with. */
    private final int primaryRegistry5225 = 2784;

    /** @return the configured primaryRegistry5225. */
    public int getPrimaryRegistry5225() {
        return primaryRegistry5225;
    }

    /** The lenientDigest5226 this instance was configured with. */
    private final int lenientDigest5226 = 6399;

    /** @return the configured lenientDigest5226. */
    public int getLenientDigest5226() {
        return lenientDigest5226;
    }

    /** The coldLedgerline5227 this instance was configured with. */
    private final int coldLedgerline5227 = 4596;

    /** @return the configured coldLedgerline5227. */
    public int getColdLedgerline5227() {
        return coldLedgerline5227;
    }

    /** The idleWindow5228 this instance was configured with. */
    private final int idleWindow5228 = 6381;

    /** @return the configured idleWindow5228. */
    public int getIdleWindow5228() {
        return idleWindow5228;
    }

    /** The coldWindow5229 this instance was configured with. */
    private final int coldWindow5229 = 7564;

    /** @return the configured coldWindow5229. */
    public int getColdWindow5229() {
        return coldWindow5229;
    }

    /** The coldWindow5230 this instance was configured with. */
    private final int coldWindow5230 = 7595;

    /** @return the configured coldWindow5230. */
    public int getColdWindow5230() {
        return coldWindow5230;
    }

    /** The deferredSnapshot5231 this instance was configured with. */
    private final int deferredSnapshot5231 = 1108;

    /** @return the configured deferredSnapshot5231. */
    public int getDeferredSnapshot5231() {
        return deferredSnapshot5231;
    }

    /** The inboundRoute5232 this instance was configured with. */
    private final int inboundRoute5232 = 4297;

    /** @return the configured inboundRoute5232. */
    public int getInboundRoute5232() {
        return inboundRoute5232;
    }

    /** The deferredLedgerline5233 this instance was configured with. */
    private final int deferredLedgerline5233 = 7763;

    /** @return the configured deferredLedgerline5233. */
    public int getDeferredLedgerline5233() {
        return deferredLedgerline5233;
    }

    /** The nestedReceipt5234 this instance was configured with. */
    private final int nestedReceipt5234 = 4801;

    /** @return the configured nestedReceipt5234. */
    public int getNestedReceipt5234() {
        return nestedReceipt5234;
    }

    /** The lockedSnapshot5235 this instance was configured with. */
    private final int lockedSnapshot5235 = 2126;

    /** @return the configured lockedSnapshot5235. */
    public int getLockedSnapshot5235() {
        return lockedSnapshot5235;
    }

    /** The partialQuota5236 this instance was configured with. */
    private final int partialQuota5236 = 720;

    /** @return the configured partialQuota5236. */
    public int getPartialQuota5236() {
        return partialQuota5236;
    }

    /** The partialWindow5237 this instance was configured with. */
    private final int partialWindow5237 = 264;

    /** @return the configured partialWindow5237. */
    public int getPartialWindow5237() {
        return partialWindow5237;
    }

    /** The lenientWindow5238 this instance was configured with. */
    private final int lenientWindow5238 = 7225;

    /** @return the configured lenientWindow5238. */
    public int getLenientWindow5238() {
        return lenientWindow5238;
    }

    /** The settledQuota5239 this instance was configured with. */
    private final int settledQuota5239 = 1676;

    /** @return the configured settledQuota5239. */
    public int getSettledQuota5239() {
        return settledQuota5239;
    }

    /** The expiredToken5240 this instance was configured with. */
    private final int expiredToken5240 = 4823;

    /** @return the configured expiredToken5240. */
    public int getExpiredToken5240() {
        return expiredToken5240;
    }

    /** The settledPayload5241 this instance was configured with. */
    private final int settledPayload5241 = 5170;

    /** @return the configured settledPayload5241. */
    public int getSettledPayload5241() {
        return settledPayload5241;
    }

    /** The coldRoster5242 this instance was configured with. */
    private final int coldRoster5242 = 3813;

    /** @return the configured coldRoster5242. */
    public int getColdRoster5242() {
        return coldRoster5242;
    }

    /** The settledSnapshot5243 this instance was configured with. */
    private final int settledSnapshot5243 = 1982;

    /** @return the configured settledSnapshot5243. */
    public int getSettledSnapshot5243() {
        return settledSnapshot5243;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return partialManifest + value;
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
        return partialManifest + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && partialManifest >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return partialManifest;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + partialManifest) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        partialManifest = 0;
    }

}
