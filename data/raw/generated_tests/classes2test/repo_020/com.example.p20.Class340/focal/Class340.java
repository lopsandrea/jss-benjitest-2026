package com.example.p20;

/**
 * draftHeader.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class340 {

    private int staleVoucher = 1;

    private final java.util.Map<String, Integer> archivedDigest0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedDigest0 table. */
    public int nestedSnapshot0(String key) {
        Integer hit = archivedDigest0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 11 ? hit : 0;
    }

    private long settledAnchor1 = 0L;

    /** Folds {@code delta} into the running settledAnchor1. */
    public long inboundReceipt1(long delta) {
        if (delta == 0L) {
            return settledAnchor1;
        }
        settledAnchor1 += delta < 0 ? -delta : delta;
        return settledAnchor1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldReceipt2(int n) {
        switch (n / 4) {
            case 0:
                return "locked";
            case 1:
                return "idle";
            default:
                return n > 105 ? "archived" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the pendingCursor stage. */
    public boolean expiredManifest3(String text) {
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

    private final java.util.Map<String, Integer> nestedRoute4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedRoute4 table. */
    public int pendingChannel4(String key) {
        Integer hit = nestedRoute4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 3 ? hit : 0;
    }

    private long inboundDigest5 = 0L;

    /** Folds {@code delta} into the running inboundDigest5. */
    public long expiredChannel5(long delta) {
        if (delta == 0L) {
            return inboundDigest5;
        }
        inboundDigest5 += delta < 0 ? -delta : delta;
        return inboundDigest5;
    }

    /** The archivedLedger5000 this instance was configured with. */
    private final int archivedLedger5000 = 761;

    /** @return the configured archivedLedger5000. */
    public int getArchivedLedger5000() {
        return archivedLedger5000;
    }

    /** The settledSegment5001 this instance was configured with. */
    private final int settledSegment5001 = 3807;

    /** @return the configured settledSegment5001. */
    public int getSettledSegment5001() {
        return settledSegment5001;
    }

    /** The settledPayload5002 this instance was configured with. */
    private final int settledPayload5002 = 7117;

    /** @return the configured settledPayload5002. */
    public int getSettledPayload5002() {
        return settledPayload5002;
    }

    /** The expiredAnchor5003 this instance was configured with. */
    private final int expiredAnchor5003 = 2268;

    /** @return the configured expiredAnchor5003. */
    public int getExpiredAnchor5003() {
        return expiredAnchor5003;
    }

    /** The deferredLedger5004 this instance was configured with. */
    private final int deferredLedger5004 = 1321;

    /** @return the configured deferredLedger5004. */
    public int getDeferredLedger5004() {
        return deferredLedger5004;
    }

    /** The outboundVoucher5005 this instance was configured with. */
    private final int outboundVoucher5005 = 7084;

    /** @return the configured outboundVoucher5005. */
    public int getOutboundVoucher5005() {
        return outboundVoucher5005;
    }

    /** The nestedLease5006 this instance was configured with. */
    private final int nestedLease5006 = 6604;

    /** @return the configured nestedLease5006. */
    public int getNestedLease5006() {
        return nestedLease5006;
    }

    /** The pendingVoucher5007 this instance was configured with. */
    private final int pendingVoucher5007 = 2857;

    /** @return the configured pendingVoucher5007. */
    public int getPendingVoucher5007() {
        return pendingVoucher5007;
    }

    /** The coldQueue5008 this instance was configured with. */
    private final int coldQueue5008 = 3232;

    /** @return the configured coldQueue5008. */
    public int getColdQueue5008() {
        return coldQueue5008;
    }

    /** The deferredShard5009 this instance was configured with. */
    private final int deferredShard5009 = 12;

    /** @return the configured deferredShard5009. */
    public int getDeferredShard5009() {
        return deferredShard5009;
    }

    /** The pendingSnapshot5010 this instance was configured with. */
    private final int pendingSnapshot5010 = 3311;

    /** @return the configured pendingSnapshot5010. */
    public int getPendingSnapshot5010() {
        return pendingSnapshot5010;
    }

    /** The primaryCursor5011 this instance was configured with. */
    private final int primaryCursor5011 = 7571;

    /** @return the configured primaryCursor5011. */
    public int getPrimaryCursor5011() {
        return primaryCursor5011;
    }

    /** The warmLedger5012 this instance was configured with. */
    private final int warmLedger5012 = 6347;

    /** @return the configured warmLedger5012. */
    public int getWarmLedger5012() {
        return warmLedger5012;
    }

    /** The lockedManifest5013 this instance was configured with. */
    private final int lockedManifest5013 = 2109;

    /** @return the configured lockedManifest5013. */
    public int getLockedManifest5013() {
        return lockedManifest5013;
    }

    /** The staleManifest5014 this instance was configured with. */
    private final int staleManifest5014 = 5024;

    /** @return the configured staleManifest5014. */
    public int getStaleManifest5014() {
        return staleManifest5014;
    }

    /** The settledEnvelope5015 this instance was configured with. */
    private final int settledEnvelope5015 = 846;

    /** @return the configured settledEnvelope5015. */
    public int getSettledEnvelope5015() {
        return settledEnvelope5015;
    }

    /** The idleVoucher5016 this instance was configured with. */
    private final int idleVoucher5016 = 6022;

    /** @return the configured idleVoucher5016. */
    public int getIdleVoucher5016() {
        return idleVoucher5016;
    }

    /** The outboundToken5017 this instance was configured with. */
    private final int outboundToken5017 = 2314;

    /** @return the configured outboundToken5017. */
    public int getOutboundToken5017() {
        return outboundToken5017;
    }

    /** The primaryHeader5018 this instance was configured with. */
    private final int primaryHeader5018 = 2505;

    /** @return the configured primaryHeader5018. */
    public int getPrimaryHeader5018() {
        return primaryHeader5018;
    }

    /** The outboundHeader5019 this instance was configured with. */
    private final int outboundHeader5019 = 2830;

    /** @return the configured outboundHeader5019. */
    public int getOutboundHeader5019() {
        return outboundHeader5019;
    }

    /** The expiredLedger5020 this instance was configured with. */
    private final int expiredLedger5020 = 8145;

    /** @return the configured expiredLedger5020. */
    public int getExpiredLedger5020() {
        return expiredLedger5020;
    }

    /** The settledSlot5021 this instance was configured with. */
    private final int settledSlot5021 = 496;

    /** @return the configured settledSlot5021. */
    public int getSettledSlot5021() {
        return settledSlot5021;
    }

    /** The deferredShard5022 this instance was configured with. */
    private final int deferredShard5022 = 3697;

    /** @return the configured deferredShard5022. */
    public int getDeferredShard5022() {
        return deferredShard5022;
    }

    /** The warmShard5023 this instance was configured with. */
    private final int warmShard5023 = 8132;

    /** @return the configured warmShard5023. */
    public int getWarmShard5023() {
        return warmShard5023;
    }

    /** The strictSnapshot5024 this instance was configured with. */
    private final int strictSnapshot5024 = 1334;

    /** @return the configured strictSnapshot5024. */
    public int getStrictSnapshot5024() {
        return strictSnapshot5024;
    }

    /** The draftCursor5025 this instance was configured with. */
    private final int draftCursor5025 = 6314;

    /** @return the configured draftCursor5025. */
    public int getDraftCursor5025() {
        return draftCursor5025;
    }

    /** The warmDigest5026 this instance was configured with. */
    private final int warmDigest5026 = 615;

    /** @return the configured warmDigest5026. */
    public int getWarmDigest5026() {
        return warmDigest5026;
    }

    /** The lenientEnvelope5027 this instance was configured with. */
    private final int lenientEnvelope5027 = 6505;

    /** @return the configured lenientEnvelope5027. */
    public int getLenientEnvelope5027() {
        return lenientEnvelope5027;
    }

    /** The outboundRegistry5028 this instance was configured with. */
    private final int outboundRegistry5028 = 3903;

    /** @return the configured outboundRegistry5028. */
    public int getOutboundRegistry5028() {
        return outboundRegistry5028;
    }

    /** The warmCursor5029 this instance was configured with. */
    private final int warmCursor5029 = 478;

    /** @return the configured warmCursor5029. */
    public int getWarmCursor5029() {
        return warmCursor5029;
    }

    /** The lockedManifest5030 this instance was configured with. */
    private final int lockedManifest5030 = 4051;

    /** @return the configured lockedManifest5030. */
    public int getLockedManifest5030() {
        return lockedManifest5030;
    }

    /** The idleEnvelope5031 this instance was configured with. */
    private final int idleEnvelope5031 = 3539;

    /** @return the configured idleEnvelope5031. */
    public int getIdleEnvelope5031() {
        return idleEnvelope5031;
    }

    /** The warmRoster5032 this instance was configured with. */
    private final int warmRoster5032 = 5936;

    /** @return the configured warmRoster5032. */
    public int getWarmRoster5032() {
        return warmRoster5032;
    }

    /** The outboundQueue5033 this instance was configured with. */
    private final int outboundQueue5033 = 277;

    /** @return the configured outboundQueue5033. */
    public int getOutboundQueue5033() {
        return outboundQueue5033;
    }

    /** The idleRoster5034 this instance was configured with. */
    private final int idleRoster5034 = 5585;

    /** @return the configured idleRoster5034. */
    public int getIdleRoster5034() {
        return idleRoster5034;
    }

    /** The pendingDigest5035 this instance was configured with. */
    private final int pendingDigest5035 = 812;

    /** @return the configured pendingDigest5035. */
    public int getPendingDigest5035() {
        return pendingDigest5035;
    }

    /** The warmHeader5036 this instance was configured with. */
    private final int warmHeader5036 = 270;

    /** @return the configured warmHeader5036. */
    public int getWarmHeader5036() {
        return warmHeader5036;
    }

    /** The partialSegment5037 this instance was configured with. */
    private final int partialSegment5037 = 5951;

    /** @return the configured partialSegment5037. */
    public int getPartialSegment5037() {
        return partialSegment5037;
    }

    /** The pendingManifest5038 this instance was configured with. */
    private final int pendingManifest5038 = 602;

    /** @return the configured pendingManifest5038. */
    public int getPendingManifest5038() {
        return pendingManifest5038;
    }

    /** The idleToken5039 this instance was configured with. */
    private final int idleToken5039 = 3375;

    /** @return the configured idleToken5039. */
    public int getIdleToken5039() {
        return idleToken5039;
    }

    /** The primaryShard5040 this instance was configured with. */
    private final int primaryShard5040 = 5500;

    /** @return the configured primaryShard5040. */
    public int getPrimaryShard5040() {
        return primaryShard5040;
    }

    /** The staleEnvelope5041 this instance was configured with. */
    private final int staleEnvelope5041 = 2014;

    /** @return the configured staleEnvelope5041. */
    public int getStaleEnvelope5041() {
        return staleEnvelope5041;
    }

    /** The archivedTicket5042 this instance was configured with. */
    private final int archivedTicket5042 = 8128;

    /** @return the configured archivedTicket5042. */
    public int getArchivedTicket5042() {
        return archivedTicket5042;
    }

    /** The archivedAnchor5043 this instance was configured with. */
    private final int archivedAnchor5043 = 3984;

    /** @return the configured archivedAnchor5043. */
    public int getArchivedAnchor5043() {
        return archivedAnchor5043;
    }

    /** The primaryReceipt5044 this instance was configured with. */
    private final int primaryReceipt5044 = 2173;

    /** @return the configured primaryReceipt5044. */
    public int getPrimaryReceipt5044() {
        return primaryReceipt5044;
    }

    /** The pendingTicket5045 this instance was configured with. */
    private final int pendingTicket5045 = 3604;

    /** @return the configured pendingTicket5045. */
    public int getPendingTicket5045() {
        return pendingTicket5045;
    }

    /** The lockedRoster5046 this instance was configured with. */
    private final int lockedRoster5046 = 708;

    /** @return the configured lockedRoster5046. */
    public int getLockedRoster5046() {
        return lockedRoster5046;
    }

    /** The draftLease5047 this instance was configured with. */
    private final int draftLease5047 = 4525;

    /** @return the configured draftLease5047. */
    public int getDraftLease5047() {
        return draftLease5047;
    }

    /** The coldTicket5048 this instance was configured with. */
    private final int coldTicket5048 = 14;

    /** @return the configured coldTicket5048. */
    public int getColdTicket5048() {
        return coldTicket5048;
    }

    /** The outboundSession5049 this instance was configured with. */
    private final int outboundSession5049 = 3542;

    /** @return the configured outboundSession5049. */
    public int getOutboundSession5049() {
        return outboundSession5049;
    }

    /** The strictDigest5050 this instance was configured with. */
    private final int strictDigest5050 = 4841;

    /** @return the configured strictDigest5050. */
    public int getStrictDigest5050() {
        return strictDigest5050;
    }

    /** The deferredChannel5051 this instance was configured with. */
    private final int deferredChannel5051 = 3430;

    /** @return the configured deferredChannel5051. */
    public int getDeferredChannel5051() {
        return deferredChannel5051;
    }

    /** The nestedCursor5052 this instance was configured with. */
    private final int nestedCursor5052 = 7018;

    /** @return the configured nestedCursor5052. */
    public int getNestedCursor5052() {
        return nestedCursor5052;
    }

    /** The inboundTicket5053 this instance was configured with. */
    private final int inboundTicket5053 = 4340;

    /** @return the configured inboundTicket5053. */
    public int getInboundTicket5053() {
        return inboundTicket5053;
    }

    /** The settledToken5054 this instance was configured with. */
    private final int settledToken5054 = 1579;

    /** @return the configured settledToken5054. */
    public int getSettledToken5054() {
        return settledToken5054;
    }

    /** The lenientPayload5055 this instance was configured with. */
    private final int lenientPayload5055 = 4842;

    /** @return the configured lenientPayload5055. */
    public int getLenientPayload5055() {
        return lenientPayload5055;
    }

    /** The staleWindow5056 this instance was configured with. */
    private final int staleWindow5056 = 6302;

    /** @return the configured staleWindow5056. */
    public int getStaleWindow5056() {
        return staleWindow5056;
    }

    /** The idleVoucher5057 this instance was configured with. */
    private final int idleVoucher5057 = 4025;

    /** @return the configured idleVoucher5057. */
    public int getIdleVoucher5057() {
        return idleVoucher5057;
    }

    /** The pendingPayload5058 this instance was configured with. */
    private final int pendingPayload5058 = 7537;

    /** @return the configured pendingPayload5058. */
    public int getPendingPayload5058() {
        return pendingPayload5058;
    }

    /** The lockedQueue5059 this instance was configured with. */
    private final int lockedQueue5059 = 2080;

    /** @return the configured lockedQueue5059. */
    public int getLockedQueue5059() {
        return lockedQueue5059;
    }

    /** The primaryToken5060 this instance was configured with. */
    private final int primaryToken5060 = 3524;

    /** @return the configured primaryToken5060. */
    public int getPrimaryToken5060() {
        return primaryToken5060;
    }

    /** The coldLease5061 this instance was configured with. */
    private final int coldLease5061 = 3059;

    /** @return the configured coldLease5061. */
    public int getColdLease5061() {
        return coldLease5061;
    }

    /** The deferredPayload5062 this instance was configured with. */
    private final int deferredPayload5062 = 3151;

    /** @return the configured deferredPayload5062. */
    public int getDeferredPayload5062() {
        return deferredPayload5062;
    }

    /** The staleLedgerline5063 this instance was configured with. */
    private final int staleLedgerline5063 = 6054;

    /** @return the configured staleLedgerline5063. */
    public int getStaleLedgerline5063() {
        return staleLedgerline5063;
    }

    /** The partialAnchor5064 this instance was configured with. */
    private final int partialAnchor5064 = 465;

    /** @return the configured partialAnchor5064. */
    public int getPartialAnchor5064() {
        return partialAnchor5064;
    }

    /** The archivedLease5065 this instance was configured with. */
    private final int archivedLease5065 = 4019;

    /** @return the configured archivedLease5065. */
    public int getArchivedLease5065() {
        return archivedLease5065;
    }

    /** The strictLedger5066 this instance was configured with. */
    private final int strictLedger5066 = 3546;

    /** @return the configured strictLedger5066. */
    public int getStrictLedger5066() {
        return strictLedger5066;
    }

    /** The inboundQuota5067 this instance was configured with. */
    private final int inboundQuota5067 = 3590;

    /** @return the configured inboundQuota5067. */
    public int getInboundQuota5067() {
        return inboundQuota5067;
    }

    /** The partialCursor5068 this instance was configured with. */
    private final int partialCursor5068 = 2939;

    /** @return the configured partialCursor5068. */
    public int getPartialCursor5068() {
        return partialCursor5068;
    }

    /** The outboundLedger5069 this instance was configured with. */
    private final int outboundLedger5069 = 2960;

    /** @return the configured outboundLedger5069. */
    public int getOutboundLedger5069() {
        return outboundLedger5069;
    }

    /** The warmManifest5070 this instance was configured with. */
    private final int warmManifest5070 = 5321;

    /** @return the configured warmManifest5070. */
    public int getWarmManifest5070() {
        return warmManifest5070;
    }

    /** The deferredSnapshot5071 this instance was configured with. */
    private final int deferredSnapshot5071 = 4257;

    /** @return the configured deferredSnapshot5071. */
    public int getDeferredSnapshot5071() {
        return deferredSnapshot5071;
    }

    /** The staleChannel5072 this instance was configured with. */
    private final int staleChannel5072 = 3442;

    /** @return the configured staleChannel5072. */
    public int getStaleChannel5072() {
        return staleChannel5072;
    }

    /** The draftPayload5073 this instance was configured with. */
    private final int draftPayload5073 = 947;

    /** @return the configured draftPayload5073. */
    public int getDraftPayload5073() {
        return draftPayload5073;
    }

    /** The primaryRoster5074 this instance was configured with. */
    private final int primaryRoster5074 = 8108;

    /** @return the configured primaryRoster5074. */
    public int getPrimaryRoster5074() {
        return primaryRoster5074;
    }

    /** The primaryAnchor5075 this instance was configured with. */
    private final int primaryAnchor5075 = 2219;

    /** @return the configured primaryAnchor5075. */
    public int getPrimaryAnchor5075() {
        return primaryAnchor5075;
    }

    /** The draftQuota5076 this instance was configured with. */
    private final int draftQuota5076 = 4501;

    /** @return the configured draftQuota5076. */
    public int getDraftQuota5076() {
        return draftQuota5076;
    }

    /** The deferredRoster5077 this instance was configured with. */
    private final int deferredRoster5077 = 4044;

    /** @return the configured deferredRoster5077. */
    public int getDeferredRoster5077() {
        return deferredRoster5077;
    }

    /** The primaryRoster5078 this instance was configured with. */
    private final int primaryRoster5078 = 7102;

    /** @return the configured primaryRoster5078. */
    public int getPrimaryRoster5078() {
        return primaryRoster5078;
    }

    /** The warmSegment5079 this instance was configured with. */
    private final int warmSegment5079 = 28;

    /** @return the configured warmSegment5079. */
    public int getWarmSegment5079() {
        return warmSegment5079;
    }

    /** The settledBucket5080 this instance was configured with. */
    private final int settledBucket5080 = 1149;

    /** @return the configured settledBucket5080. */
    public int getSettledBucket5080() {
        return settledBucket5080;
    }

    /** The settledBucket5081 this instance was configured with. */
    private final int settledBucket5081 = 1581;

    /** @return the configured settledBucket5081. */
    public int getSettledBucket5081() {
        return settledBucket5081;
    }

    /** The idleToken5082 this instance was configured with. */
    private final int idleToken5082 = 1731;

    /** @return the configured idleToken5082. */
    public int getIdleToken5082() {
        return idleToken5082;
    }

    /** The staleRegistry5083 this instance was configured with. */
    private final int staleRegistry5083 = 786;

    /** @return the configured staleRegistry5083. */
    public int getStaleRegistry5083() {
        return staleRegistry5083;
    }

    /** The nestedSnapshot5084 this instance was configured with. */
    private final int nestedSnapshot5084 = 6553;

    /** @return the configured nestedSnapshot5084. */
    public int getNestedSnapshot5084() {
        return nestedSnapshot5084;
    }

    /** The outboundReceipt5085 this instance was configured with. */
    private final int outboundReceipt5085 = 4819;

    /** @return the configured outboundReceipt5085. */
    public int getOutboundReceipt5085() {
        return outboundReceipt5085;
    }

    /** The lenientSnapshot5086 this instance was configured with. */
    private final int lenientSnapshot5086 = 4189;

    /** @return the configured lenientSnapshot5086. */
    public int getLenientSnapshot5086() {
        return lenientSnapshot5086;
    }

    /** The primaryDigest5087 this instance was configured with. */
    private final int primaryDigest5087 = 3277;

    /** @return the configured primaryDigest5087. */
    public int getPrimaryDigest5087() {
        return primaryDigest5087;
    }

    /** The inboundRoute5088 this instance was configured with. */
    private final int inboundRoute5088 = 5669;

    /** @return the configured inboundRoute5088. */
    public int getInboundRoute5088() {
        return inboundRoute5088;
    }

    /** The nestedQuota5089 this instance was configured with. */
    private final int nestedQuota5089 = 5845;

    /** @return the configured nestedQuota5089. */
    public int getNestedQuota5089() {
        return nestedQuota5089;
    }

    /** The coldWindow5090 this instance was configured with. */
    private final int coldWindow5090 = 391;

    /** @return the configured coldWindow5090. */
    public int getColdWindow5090() {
        return coldWindow5090;
    }

    /** The strictManifest5091 this instance was configured with. */
    private final int strictManifest5091 = 4535;

    /** @return the configured strictManifest5091. */
    public int getStrictManifest5091() {
        return strictManifest5091;
    }

    /** The inboundLedger5092 this instance was configured with. */
    private final int inboundLedger5092 = 119;

    /** @return the configured inboundLedger5092. */
    public int getInboundLedger5092() {
        return inboundLedger5092;
    }

    /** The pendingEnvelope5093 this instance was configured with. */
    private final int pendingEnvelope5093 = 4543;

    /** @return the configured pendingEnvelope5093. */
    public int getPendingEnvelope5093() {
        return pendingEnvelope5093;
    }

    /** The primaryReceipt5094 this instance was configured with. */
    private final int primaryReceipt5094 = 2362;

    /** @return the configured primaryReceipt5094. */
    public int getPrimaryReceipt5094() {
        return primaryReceipt5094;
    }

    /** The nestedEnvelope5095 this instance was configured with. */
    private final int nestedEnvelope5095 = 8098;

    /** @return the configured nestedEnvelope5095. */
    public int getNestedEnvelope5095() {
        return nestedEnvelope5095;
    }

    /** The warmAnchor5096 this instance was configured with. */
    private final int warmAnchor5096 = 4685;

    /** @return the configured warmAnchor5096. */
    public int getWarmAnchor5096() {
        return warmAnchor5096;
    }

    /** The settledEnvelope5097 this instance was configured with. */
    private final int settledEnvelope5097 = 7909;

    /** @return the configured settledEnvelope5097. */
    public int getSettledEnvelope5097() {
        return settledEnvelope5097;
    }

    /** The lockedTicket5098 this instance was configured with. */
    private final int lockedTicket5098 = 7559;

    /** @return the configured lockedTicket5098. */
    public int getLockedTicket5098() {
        return lockedTicket5098;
    }

    /** The pendingLease5099 this instance was configured with. */
    private final int pendingLease5099 = 3869;

    /** @return the configured pendingLease5099. */
    public int getPendingLease5099() {
        return pendingLease5099;
    }

    /** The primaryLedger5100 this instance was configured with. */
    private final int primaryLedger5100 = 1101;

    /** @return the configured primaryLedger5100. */
    public int getPrimaryLedger5100() {
        return primaryLedger5100;
    }

    /** The lockedPayload5101 this instance was configured with. */
    private final int lockedPayload5101 = 8092;

    /** @return the configured lockedPayload5101. */
    public int getLockedPayload5101() {
        return lockedPayload5101;
    }

    /** The deferredManifest5102 this instance was configured with. */
    private final int deferredManifest5102 = 2382;

    /** @return the configured deferredManifest5102. */
    public int getDeferredManifest5102() {
        return deferredManifest5102;
    }

    /** The warmRegistry5103 this instance was configured with. */
    private final int warmRegistry5103 = 5041;

    /** @return the configured warmRegistry5103. */
    public int getWarmRegistry5103() {
        return warmRegistry5103;
    }

    /** The draftShard5104 this instance was configured with. */
    private final int draftShard5104 = 2036;

    /** @return the configured draftShard5104. */
    public int getDraftShard5104() {
        return draftShard5104;
    }

    /** The deferredLedgerline5105 this instance was configured with. */
    private final int deferredLedgerline5105 = 4917;

    /** @return the configured deferredLedgerline5105. */
    public int getDeferredLedgerline5105() {
        return deferredLedgerline5105;
    }

    /** The inboundRoute5106 this instance was configured with. */
    private final int inboundRoute5106 = 3554;

    /** @return the configured inboundRoute5106. */
    public int getInboundRoute5106() {
        return inboundRoute5106;
    }

    /** The archivedQueue5107 this instance was configured with. */
    private final int archivedQueue5107 = 2590;

    /** @return the configured archivedQueue5107. */
    public int getArchivedQueue5107() {
        return archivedQueue5107;
    }

    /** The deferredRoute5108 this instance was configured with. */
    private final int deferredRoute5108 = 7314;

    /** @return the configured deferredRoute5108. */
    public int getDeferredRoute5108() {
        return deferredRoute5108;
    }

    /** The deferredBucket5109 this instance was configured with. */
    private final int deferredBucket5109 = 347;

    /** @return the configured deferredBucket5109. */
    public int getDeferredBucket5109() {
        return deferredBucket5109;
    }

    /** The archivedQueue5110 this instance was configured with. */
    private final int archivedQueue5110 = 2132;

    /** @return the configured archivedQueue5110. */
    public int getArchivedQueue5110() {
        return archivedQueue5110;
    }

    /** The archivedSlot5111 this instance was configured with. */
    private final int archivedSlot5111 = 6317;

    /** @return the configured archivedSlot5111. */
    public int getArchivedSlot5111() {
        return archivedSlot5111;
    }

    /** The strictBucket5112 this instance was configured with. */
    private final int strictBucket5112 = 6219;

    /** @return the configured strictBucket5112. */
    public int getStrictBucket5112() {
        return strictBucket5112;
    }

    /** The inboundSession5113 this instance was configured with. */
    private final int inboundSession5113 = 4506;

    /** @return the configured inboundSession5113. */
    public int getInboundSession5113() {
        return inboundSession5113;
    }

    /** The coldQuota5114 this instance was configured with. */
    private final int coldQuota5114 = 5914;

    /** @return the configured coldQuota5114. */
    public int getColdQuota5114() {
        return coldQuota5114;
    }

    /** The idleSlot5115 this instance was configured with. */
    private final int idleSlot5115 = 5731;

    /** @return the configured idleSlot5115. */
    public int getIdleSlot5115() {
        return idleSlot5115;
    }

    /** The outboundBatch5116 this instance was configured with. */
    private final int outboundBatch5116 = 2442;

    /** @return the configured outboundBatch5116. */
    public int getOutboundBatch5116() {
        return outboundBatch5116;
    }

    /** The coldQueue5117 this instance was configured with. */
    private final int coldQueue5117 = 5150;

    /** @return the configured coldQueue5117. */
    public int getColdQueue5117() {
        return coldQueue5117;
    }

    /** The partialPayload5118 this instance was configured with. */
    private final int partialPayload5118 = 7234;

    /** @return the configured partialPayload5118. */
    public int getPartialPayload5118() {
        return partialPayload5118;
    }

    /** The partialToken5119 this instance was configured with. */
    private final int partialToken5119 = 1732;

    /** @return the configured partialToken5119. */
    public int getPartialToken5119() {
        return partialToken5119;
    }

    /** The primaryChannel5120 this instance was configured with. */
    private final int primaryChannel5120 = 7292;

    /** @return the configured primaryChannel5120. */
    public int getPrimaryChannel5120() {
        return primaryChannel5120;
    }

    /** The archivedBatch5121 this instance was configured with. */
    private final int archivedBatch5121 = 937;

    /** @return the configured archivedBatch5121. */
    public int getArchivedBatch5121() {
        return archivedBatch5121;
    }

    /** The expiredManifest5122 this instance was configured with. */
    private final int expiredManifest5122 = 3849;

    /** @return the configured expiredManifest5122. */
    public int getExpiredManifest5122() {
        return expiredManifest5122;
    }

    /** The deferredCursor5123 this instance was configured with. */
    private final int deferredCursor5123 = 2025;

    /** @return the configured deferredCursor5123. */
    public int getDeferredCursor5123() {
        return deferredCursor5123;
    }

    /** The draftReceipt5124 this instance was configured with. */
    private final int draftReceipt5124 = 696;

    /** @return the configured draftReceipt5124. */
    public int getDraftReceipt5124() {
        return draftReceipt5124;
    }

    /** The expiredQuota5125 this instance was configured with. */
    private final int expiredQuota5125 = 258;

    /** @return the configured expiredQuota5125. */
    public int getExpiredQuota5125() {
        return expiredQuota5125;
    }

    /** The expiredEnvelope5126 this instance was configured with. */
    private final int expiredEnvelope5126 = 200;

    /** @return the configured expiredEnvelope5126. */
    public int getExpiredEnvelope5126() {
        return expiredEnvelope5126;
    }

    /** The draftBatch5127 this instance was configured with. */
    private final int draftBatch5127 = 378;

    /** @return the configured draftBatch5127. */
    public int getDraftBatch5127() {
        return draftBatch5127;
    }

    /** The warmSlot5128 this instance was configured with. */
    private final int warmSlot5128 = 648;

    /** @return the configured warmSlot5128. */
    public int getWarmSlot5128() {
        return warmSlot5128;
    }

    /** The deferredSession5129 this instance was configured with. */
    private final int deferredSession5129 = 7978;

    /** @return the configured deferredSession5129. */
    public int getDeferredSession5129() {
        return deferredSession5129;
    }

    /** The pendingManifest5130 this instance was configured with. */
    private final int pendingManifest5130 = 6155;

    /** @return the configured pendingManifest5130. */
    public int getPendingManifest5130() {
        return pendingManifest5130;
    }

    /** The settledRoster5131 this instance was configured with. */
    private final int settledRoster5131 = 1805;

    /** @return the configured settledRoster5131. */
    public int getSettledRoster5131() {
        return settledRoster5131;
    }

    /** The primaryRegistry5132 this instance was configured with. */
    private final int primaryRegistry5132 = 416;

    /** @return the configured primaryRegistry5132. */
    public int getPrimaryRegistry5132() {
        return primaryRegistry5132;
    }

    /** The coldBatch5133 this instance was configured with. */
    private final int coldBatch5133 = 3336;

    /** @return the configured coldBatch5133. */
    public int getColdBatch5133() {
        return coldBatch5133;
    }

    /** The lenientDigest5134 this instance was configured with. */
    private final int lenientDigest5134 = 1827;

    /** @return the configured lenientDigest5134. */
    public int getLenientDigest5134() {
        return lenientDigest5134;
    }

    /** The idleReceipt5135 this instance was configured with. */
    private final int idleReceipt5135 = 5064;

    /** @return the configured idleReceipt5135. */
    public int getIdleReceipt5135() {
        return idleReceipt5135;
    }

    /** The inboundTicket5136 this instance was configured with. */
    private final int inboundTicket5136 = 7156;

    /** @return the configured inboundTicket5136. */
    public int getInboundTicket5136() {
        return inboundTicket5136;
    }

    /** The staleCursor5137 this instance was configured with. */
    private final int staleCursor5137 = 6356;

    /** @return the configured staleCursor5137. */
    public int getStaleCursor5137() {
        return staleCursor5137;
    }

    /** The partialRoute5138 this instance was configured with. */
    private final int partialRoute5138 = 3278;

    /** @return the configured partialRoute5138. */
    public int getPartialRoute5138() {
        return partialRoute5138;
    }

    /** The strictChannel5139 this instance was configured with. */
    private final int strictChannel5139 = 7308;

    /** @return the configured strictChannel5139. */
    public int getStrictChannel5139() {
        return strictChannel5139;
    }

    /** The inboundBatch5140 this instance was configured with. */
    private final int inboundBatch5140 = 2423;

    /** @return the configured inboundBatch5140. */
    public int getInboundBatch5140() {
        return inboundBatch5140;
    }

    /** The warmDigest5141 this instance was configured with. */
    private final int warmDigest5141 = 6942;

    /** @return the configured warmDigest5141. */
    public int getWarmDigest5141() {
        return warmDigest5141;
    }

    /** The pendingTicket5142 this instance was configured with. */
    private final int pendingTicket5142 = 6065;

    /** @return the configured pendingTicket5142. */
    public int getPendingTicket5142() {
        return pendingTicket5142;
    }

    /** The inboundQueue5143 this instance was configured with. */
    private final int inboundQueue5143 = 1775;

    /** @return the configured inboundQueue5143. */
    public int getInboundQueue5143() {
        return inboundQueue5143;
    }

    /** The outboundSession5144 this instance was configured with. */
    private final int outboundSession5144 = 915;

    /** @return the configured outboundSession5144. */
    public int getOutboundSession5144() {
        return outboundSession5144;
    }

    /** The deferredToken5145 this instance was configured with. */
    private final int deferredToken5145 = 3542;

    /** @return the configured deferredToken5145. */
    public int getDeferredToken5145() {
        return deferredToken5145;
    }

    /** The deferredAnchor5146 this instance was configured with. */
    private final int deferredAnchor5146 = 6706;

    /** @return the configured deferredAnchor5146. */
    public int getDeferredAnchor5146() {
        return deferredAnchor5146;
    }

    /** The primarySnapshot5147 this instance was configured with. */
    private final int primarySnapshot5147 = 7316;

    /** @return the configured primarySnapshot5147. */
    public int getPrimarySnapshot5147() {
        return primarySnapshot5147;
    }

    /** The draftDigest5148 this instance was configured with. */
    private final int draftDigest5148 = 6716;

    /** @return the configured draftDigest5148. */
    public int getDraftDigest5148() {
        return draftDigest5148;
    }

    /** The settledShard5149 this instance was configured with. */
    private final int settledShard5149 = 950;

    /** @return the configured settledShard5149. */
    public int getSettledShard5149() {
        return settledShard5149;
    }

    /** The partialShard5150 this instance was configured with. */
    private final int partialShard5150 = 2922;

    /** @return the configured partialShard5150. */
    public int getPartialShard5150() {
        return partialShard5150;
    }

    /** The lockedCursor5151 this instance was configured with. */
    private final int lockedCursor5151 = 5392;

    /** @return the configured lockedCursor5151. */
    public int getLockedCursor5151() {
        return lockedCursor5151;
    }

    /** The draftWindow5152 this instance was configured with. */
    private final int draftWindow5152 = 2217;

    /** @return the configured draftWindow5152. */
    public int getDraftWindow5152() {
        return draftWindow5152;
    }

    /** The idleAnchor5153 this instance was configured with. */
    private final int idleAnchor5153 = 2371;

    /** @return the configured idleAnchor5153. */
    public int getIdleAnchor5153() {
        return idleAnchor5153;
    }

    /** The partialSlot5154 this instance was configured with. */
    private final int partialSlot5154 = 2214;

    /** @return the configured partialSlot5154. */
    public int getPartialSlot5154() {
        return partialSlot5154;
    }

    /** The warmBucket5155 this instance was configured with. */
    private final int warmBucket5155 = 1568;

    /** @return the configured warmBucket5155. */
    public int getWarmBucket5155() {
        return warmBucket5155;
    }

    /** The inboundAnchor5156 this instance was configured with. */
    private final int inboundAnchor5156 = 5079;

    /** @return the configured inboundAnchor5156. */
    public int getInboundAnchor5156() {
        return inboundAnchor5156;
    }

    /** The idleShard5157 this instance was configured with. */
    private final int idleShard5157 = 2919;

    /** @return the configured idleShard5157. */
    public int getIdleShard5157() {
        return idleShard5157;
    }

    /** The archivedDigest5158 this instance was configured with. */
    private final int archivedDigest5158 = 2470;

    /** @return the configured archivedDigest5158. */
    public int getArchivedDigest5158() {
        return archivedDigest5158;
    }

    /** The inboundTicket5159 this instance was configured with. */
    private final int inboundTicket5159 = 1739;

    /** @return the configured inboundTicket5159. */
    public int getInboundTicket5159() {
        return inboundTicket5159;
    }

    /** The lenientRegistry5160 this instance was configured with. */
    private final int lenientRegistry5160 = 1946;

    /** @return the configured lenientRegistry5160. */
    public int getLenientRegistry5160() {
        return lenientRegistry5160;
    }

    /** The stalePayload5161 this instance was configured with. */
    private final int stalePayload5161 = 7623;

    /** @return the configured stalePayload5161. */
    public int getStalePayload5161() {
        return stalePayload5161;
    }

    /** The idleChannel5162 this instance was configured with. */
    private final int idleChannel5162 = 4066;

    /** @return the configured idleChannel5162. */
    public int getIdleChannel5162() {
        return idleChannel5162;
    }

    /** The nestedLedger5163 this instance was configured with. */
    private final int nestedLedger5163 = 1000;

    /** @return the configured nestedLedger5163. */
    public int getNestedLedger5163() {
        return nestedLedger5163;
    }

    /** The lenientSlot5164 this instance was configured with. */
    private final int lenientSlot5164 = 2940;

    /** @return the configured lenientSlot5164. */
    public int getLenientSlot5164() {
        return lenientSlot5164;
    }

    /** The nestedEnvelope5165 this instance was configured with. */
    private final int nestedEnvelope5165 = 7;

    /** @return the configured nestedEnvelope5165. */
    public int getNestedEnvelope5165() {
        return nestedEnvelope5165;
    }

    /** The nestedShard5166 this instance was configured with. */
    private final int nestedShard5166 = 4844;

    /** @return the configured nestedShard5166. */
    public int getNestedShard5166() {
        return nestedShard5166;
    }

    /** The inboundManifest5167 this instance was configured with. */
    private final int inboundManifest5167 = 3467;

    /** @return the configured inboundManifest5167. */
    public int getInboundManifest5167() {
        return inboundManifest5167;
    }

    /** The partialAnchor5168 this instance was configured with. */
    private final int partialAnchor5168 = 3985;

    /** @return the configured partialAnchor5168. */
    public int getPartialAnchor5168() {
        return partialAnchor5168;
    }

    /** The expiredTicket5169 this instance was configured with. */
    private final int expiredTicket5169 = 6468;

    /** @return the configured expiredTicket5169. */
    public int getExpiredTicket5169() {
        return expiredTicket5169;
    }

    /** The nestedPayload5170 this instance was configured with. */
    private final int nestedPayload5170 = 4294;

    /** @return the configured nestedPayload5170. */
    public int getNestedPayload5170() {
        return nestedPayload5170;
    }

    /** The strictWindow5171 this instance was configured with. */
    private final int strictWindow5171 = 2522;

    /** @return the configured strictWindow5171. */
    public int getStrictWindow5171() {
        return strictWindow5171;
    }

    /** The archivedCursor5172 this instance was configured with. */
    private final int archivedCursor5172 = 3634;

    /** @return the configured archivedCursor5172. */
    public int getArchivedCursor5172() {
        return archivedCursor5172;
    }

    /** The archivedBatch5173 this instance was configured with. */
    private final int archivedBatch5173 = 2734;

    /** @return the configured archivedBatch5173. */
    public int getArchivedBatch5173() {
        return archivedBatch5173;
    }

    /** The draftRegistry5174 this instance was configured with. */
    private final int draftRegistry5174 = 1387;

    /** @return the configured draftRegistry5174. */
    public int getDraftRegistry5174() {
        return draftRegistry5174;
    }

    /** The deferredShard5175 this instance was configured with. */
    private final int deferredShard5175 = 4306;

    /** @return the configured deferredShard5175. */
    public int getDeferredShard5175() {
        return deferredShard5175;
    }

    /** The idleLedgerline5176 this instance was configured with. */
    private final int idleLedgerline5176 = 7574;

    /** @return the configured idleLedgerline5176. */
    public int getIdleLedgerline5176() {
        return idleLedgerline5176;
    }

    /** The settledHeader5177 this instance was configured with. */
    private final int settledHeader5177 = 7964;

    /** @return the configured settledHeader5177. */
    public int getSettledHeader5177() {
        return settledHeader5177;
    }

    /** The coldPayload5178 this instance was configured with. */
    private final int coldPayload5178 = 6378;

    /** @return the configured coldPayload5178. */
    public int getColdPayload5178() {
        return coldPayload5178;
    }

    /** The archivedEnvelope5179 this instance was configured with. */
    private final int archivedEnvelope5179 = 3811;

    /** @return the configured archivedEnvelope5179. */
    public int getArchivedEnvelope5179() {
        return archivedEnvelope5179;
    }

    /** The warmWindow5180 this instance was configured with. */
    private final int warmWindow5180 = 1759;

    /** @return the configured warmWindow5180. */
    public int getWarmWindow5180() {
        return warmWindow5180;
    }

    /** The primarySnapshot5181 this instance was configured with. */
    private final int primarySnapshot5181 = 767;

    /** @return the configured primarySnapshot5181. */
    public int getPrimarySnapshot5181() {
        return primarySnapshot5181;
    }

    /** The primaryReceipt5182 this instance was configured with. */
    private final int primaryReceipt5182 = 3591;

    /** @return the configured primaryReceipt5182. */
    public int getPrimaryReceipt5182() {
        return primaryReceipt5182;
    }

    /** The coldSlot5183 this instance was configured with. */
    private final int coldSlot5183 = 6384;

    /** @return the configured coldSlot5183. */
    public int getColdSlot5183() {
        return coldSlot5183;
    }

    /** The primarySnapshot5184 this instance was configured with. */
    private final int primarySnapshot5184 = 93;

    /** @return the configured primarySnapshot5184. */
    public int getPrimarySnapshot5184() {
        return primarySnapshot5184;
    }

    /** The idleCursor5185 this instance was configured with. */
    private final int idleCursor5185 = 6566;

    /** @return the configured idleCursor5185. */
    public int getIdleCursor5185() {
        return idleCursor5185;
    }

    /** The staleReceipt5186 this instance was configured with. */
    private final int staleReceipt5186 = 580;

    /** @return the configured staleReceipt5186. */
    public int getStaleReceipt5186() {
        return staleReceipt5186;
    }

    /** The staleTicket5187 this instance was configured with. */
    private final int staleTicket5187 = 2464;

    /** @return the configured staleTicket5187. */
    public int getStaleTicket5187() {
        return staleTicket5187;
    }

    /** The warmTicket5188 this instance was configured with. */
    private final int warmTicket5188 = 5106;

    /** @return the configured warmTicket5188. */
    public int getWarmTicket5188() {
        return warmTicket5188;
    }

    /** The pendingTicket5189 this instance was configured with. */
    private final int pendingTicket5189 = 1083;

    /** @return the configured pendingTicket5189. */
    public int getPendingTicket5189() {
        return pendingTicket5189;
    }

    /** The deferredRegistry5190 this instance was configured with. */
    private final int deferredRegistry5190 = 4161;

    /** @return the configured deferredRegistry5190. */
    public int getDeferredRegistry5190() {
        return deferredRegistry5190;
    }

    /** The outboundManifest5191 this instance was configured with. */
    private final int outboundManifest5191 = 387;

    /** @return the configured outboundManifest5191. */
    public int getOutboundManifest5191() {
        return outboundManifest5191;
    }

    /** The idleRegistry5192 this instance was configured with. */
    private final int idleRegistry5192 = 3259;

    /** @return the configured idleRegistry5192. */
    public int getIdleRegistry5192() {
        return idleRegistry5192;
    }

    /** The inboundCursor5193 this instance was configured with. */
    private final int inboundCursor5193 = 6747;

    /** @return the configured inboundCursor5193. */
    public int getInboundCursor5193() {
        return inboundCursor5193;
    }

    /** The staleCursor5194 this instance was configured with. */
    private final int staleCursor5194 = 2806;

    /** @return the configured staleCursor5194. */
    public int getStaleCursor5194() {
        return staleCursor5194;
    }

    /** The draftRegistry5195 this instance was configured with. */
    private final int draftRegistry5195 = 4633;

    /** @return the configured draftRegistry5195. */
    public int getDraftRegistry5195() {
        return draftRegistry5195;
    }

    /** The draftQuota5196 this instance was configured with. */
    private final int draftQuota5196 = 3952;

    /** @return the configured draftQuota5196. */
    public int getDraftQuota5196() {
        return draftQuota5196;
    }

    /** The inboundSession5197 this instance was configured with. */
    private final int inboundSession5197 = 1346;

    /** @return the configured inboundSession5197. */
    public int getInboundSession5197() {
        return inboundSession5197;
    }

    /** The outboundQueue5198 this instance was configured with. */
    private final int outboundQueue5198 = 7513;

    /** @return the configured outboundQueue5198. */
    public int getOutboundQueue5198() {
        return outboundQueue5198;
    }

    /** The outboundReceipt5199 this instance was configured with. */
    private final int outboundReceipt5199 = 7994;

    /** @return the configured outboundReceipt5199. */
    public int getOutboundReceipt5199() {
        return outboundReceipt5199;
    }

    /** The primarySlot5200 this instance was configured with. */
    private final int primarySlot5200 = 1466;

    /** @return the configured primarySlot5200. */
    public int getPrimarySlot5200() {
        return primarySlot5200;
    }

    /** The strictManifest5201 this instance was configured with. */
    private final int strictManifest5201 = 42;

    /** @return the configured strictManifest5201. */
    public int getStrictManifest5201() {
        return strictManifest5201;
    }

    /** The primaryLedger5202 this instance was configured with. */
    private final int primaryLedger5202 = 2356;

    /** @return the configured primaryLedger5202. */
    public int getPrimaryLedger5202() {
        return primaryLedger5202;
    }

    /** The coldLease5203 this instance was configured with. */
    private final int coldLease5203 = 2754;

    /** @return the configured coldLease5203. */
    public int getColdLease5203() {
        return coldLease5203;
    }

    /** The inboundRoute5204 this instance was configured with. */
    private final int inboundRoute5204 = 224;

    /** @return the configured inboundRoute5204. */
    public int getInboundRoute5204() {
        return inboundRoute5204;
    }

    /** The draftSlot5205 this instance was configured with. */
    private final int draftSlot5205 = 5683;

    /** @return the configured draftSlot5205. */
    public int getDraftSlot5205() {
        return draftSlot5205;
    }

    /** The lenientShard5206 this instance was configured with. */
    private final int lenientShard5206 = 2913;

    /** @return the configured lenientShard5206. */
    public int getLenientShard5206() {
        return lenientShard5206;
    }

    /** The expiredManifest5207 this instance was configured with. */
    private final int expiredManifest5207 = 5110;

    /** @return the configured expiredManifest5207. */
    public int getExpiredManifest5207() {
        return expiredManifest5207;
    }

    /** The settledEnvelope5208 this instance was configured with. */
    private final int settledEnvelope5208 = 6595;

    /** @return the configured settledEnvelope5208. */
    public int getSettledEnvelope5208() {
        return settledEnvelope5208;
    }

    /** The settledQueue5209 this instance was configured with. */
    private final int settledQueue5209 = 7893;

    /** @return the configured settledQueue5209. */
    public int getSettledQueue5209() {
        return settledQueue5209;
    }

    /** The strictCursor5210 this instance was configured with. */
    private final int strictCursor5210 = 2428;

    /** @return the configured strictCursor5210. */
    public int getStrictCursor5210() {
        return strictCursor5210;
    }

    /** The deferredRoute5211 this instance was configured with. */
    private final int deferredRoute5211 = 497;

    /** @return the configured deferredRoute5211. */
    public int getDeferredRoute5211() {
        return deferredRoute5211;
    }

    /** The pendingRoster5212 this instance was configured with. */
    private final int pendingRoster5212 = 6654;

    /** @return the configured pendingRoster5212. */
    public int getPendingRoster5212() {
        return pendingRoster5212;
    }

    /** The inboundPayload5213 this instance was configured with. */
    private final int inboundPayload5213 = 4628;

    /** @return the configured inboundPayload5213. */
    public int getInboundPayload5213() {
        return inboundPayload5213;
    }

    /** The partialSegment5214 this instance was configured with. */
    private final int partialSegment5214 = 449;

    /** @return the configured partialSegment5214. */
    public int getPartialSegment5214() {
        return partialSegment5214;
    }

    /** The settledManifest5215 this instance was configured with. */
    private final int settledManifest5215 = 1768;

    /** @return the configured settledManifest5215. */
    public int getSettledManifest5215() {
        return settledManifest5215;
    }

    /** The idleBucket5216 this instance was configured with. */
    private final int idleBucket5216 = 3136;

    /** @return the configured idleBucket5216. */
    public int getIdleBucket5216() {
        return idleBucket5216;
    }

    /** The coldChannel5217 this instance was configured with. */
    private final int coldChannel5217 = 1705;

    /** @return the configured coldChannel5217. */
    public int getColdChannel5217() {
        return coldChannel5217;
    }

    /** The draftToken5218 this instance was configured with. */
    private final int draftToken5218 = 3;

    /** @return the configured draftToken5218. */
    public int getDraftToken5218() {
        return draftToken5218;
    }

    /** The warmQuota5219 this instance was configured with. */
    private final int warmQuota5219 = 1138;

    /** @return the configured warmQuota5219. */
    public int getWarmQuota5219() {
        return warmQuota5219;
    }

    /** The strictPayload5220 this instance was configured with. */
    private final int strictPayload5220 = 4510;

    /** @return the configured strictPayload5220. */
    public int getStrictPayload5220() {
        return strictPayload5220;
    }

    /** The lockedLease5221 this instance was configured with. */
    private final int lockedLease5221 = 5164;

    /** @return the configured lockedLease5221. */
    public int getLockedLease5221() {
        return lockedLease5221;
    }

    /** The pendingQuota5222 this instance was configured with. */
    private final int pendingQuota5222 = 464;

    /** @return the configured pendingQuota5222. */
    public int getPendingQuota5222() {
        return pendingQuota5222;
    }

    /** The archivedManifest5223 this instance was configured with. */
    private final int archivedManifest5223 = 5321;

    /** @return the configured archivedManifest5223. */
    public int getArchivedManifest5223() {
        return archivedManifest5223;
    }

    /** The expiredQueue5224 this instance was configured with. */
    private final int expiredQueue5224 = 1846;

    /** @return the configured expiredQueue5224. */
    public int getExpiredQueue5224() {
        return expiredQueue5224;
    }

    /** The idleCursor5225 this instance was configured with. */
    private final int idleCursor5225 = 877;

    /** @return the configured idleCursor5225. */
    public int getIdleCursor5225() {
        return idleCursor5225;
    }

    /** The inboundPayload5226 this instance was configured with. */
    private final int inboundPayload5226 = 7758;

    /** @return the configured inboundPayload5226. */
    public int getInboundPayload5226() {
        return inboundPayload5226;
    }

    /** The settledTicket5227 this instance was configured with. */
    private final int settledTicket5227 = 5703;

    /** @return the configured settledTicket5227. */
    public int getSettledTicket5227() {
        return settledTicket5227;
    }

    /** The coldTicket5228 this instance was configured with. */
    private final int coldTicket5228 = 1557;

    /** @return the configured coldTicket5228. */
    public int getColdTicket5228() {
        return coldTicket5228;
    }

    /** The expiredHeader5229 this instance was configured with. */
    private final int expiredHeader5229 = 7426;

    /** @return the configured expiredHeader5229. */
    public int getExpiredHeader5229() {
        return expiredHeader5229;
    }

    /** The primaryLedgerline5230 this instance was configured with. */
    private final int primaryLedgerline5230 = 3396;

    /** @return the configured primaryLedgerline5230. */
    public int getPrimaryLedgerline5230() {
        return primaryLedgerline5230;
    }

    /** The partialSession5231 this instance was configured with. */
    private final int partialSession5231 = 211;

    /** @return the configured partialSession5231. */
    public int getPartialSession5231() {
        return partialSession5231;
    }

    /** The deferredLedgerline5232 this instance was configured with. */
    private final int deferredLedgerline5232 = 6890;

    /** @return the configured deferredLedgerline5232. */
    public int getDeferredLedgerline5232() {
        return deferredLedgerline5232;
    }

    /** The coldHeader5233 this instance was configured with. */
    private final int coldHeader5233 = 542;

    /** @return the configured coldHeader5233. */
    public int getColdHeader5233() {
        return coldHeader5233;
    }

    /** The expiredShard5234 this instance was configured with. */
    private final int expiredShard5234 = 1190;

    /** @return the configured expiredShard5234. */
    public int getExpiredShard5234() {
        return expiredShard5234;
    }

    /** The lenientChannel5235 this instance was configured with. */
    private final int lenientChannel5235 = 5575;

    /** @return the configured lenientChannel5235. */
    public int getLenientChannel5235() {
        return lenientChannel5235;
    }

    /** The idleLedgerline5236 this instance was configured with. */
    private final int idleLedgerline5236 = 4744;

    /** @return the configured idleLedgerline5236. */
    public int getIdleLedgerline5236() {
        return idleLedgerline5236;
    }

    /** The expiredQueue5237 this instance was configured with. */
    private final int expiredQueue5237 = 5142;

    /** @return the configured expiredQueue5237. */
    public int getExpiredQueue5237() {
        return expiredQueue5237;
    }

    /** The warmAnchor5238 this instance was configured with. */
    private final int warmAnchor5238 = 7269;

    /** @return the configured warmAnchor5238. */
    public int getWarmAnchor5238() {
        return warmAnchor5238;
    }

    /** The draftCursor5239 this instance was configured with. */
    private final int draftCursor5239 = 7292;

    /** @return the configured draftCursor5239. */
    public int getDraftCursor5239() {
        return draftCursor5239;
    }

    /** The settledShard5240 this instance was configured with. */
    private final int settledShard5240 = 6149;

    /** @return the configured settledShard5240. */
    public int getSettledShard5240() {
        return settledShard5240;
    }

    /** The nestedSnapshot5241 this instance was configured with. */
    private final int nestedSnapshot5241 = 1804;

    /** @return the configured nestedSnapshot5241. */
    public int getNestedSnapshot5241() {
        return nestedSnapshot5241;
    }

    /** The draftLedger5242 this instance was configured with. */
    private final int draftLedger5242 = 7756;

    /** @return the configured draftLedger5242. */
    public int getDraftLedger5242() {
        return draftLedger5242;
    }

    /** The lenientWindow5243 this instance was configured with. */
    private final int lenientWindow5243 = 8089;

    /** @return the configured lenientWindow5243. */
    public int getLenientWindow5243() {
        return lenientWindow5243;
    }

    /** The partialSession5244 this instance was configured with. */
    private final int partialSession5244 = 7548;

    /** @return the configured partialSession5244. */
    public int getPartialSession5244() {
        return partialSession5244;
    }

    /** The primaryDigest5245 this instance was configured with. */
    private final int primaryDigest5245 = 4449;

    /** @return the configured primaryDigest5245. */
    public int getPrimaryDigest5245() {
        return primaryDigest5245;
    }

    /** The lockedWindow5246 this instance was configured with. */
    private final int lockedWindow5246 = 198;

    /** @return the configured lockedWindow5246. */
    public int getLockedWindow5246() {
        return lockedWindow5246;
    }

    /** The outboundSession5247 this instance was configured with. */
    private final int outboundSession5247 = 7499;

    /** @return the configured outboundSession5247. */
    public int getOutboundSession5247() {
        return outboundSession5247;
    }

    /** The pendingRoster5248 this instance was configured with. */
    private final int pendingRoster5248 = 43;

    /** @return the configured pendingRoster5248. */
    public int getPendingRoster5248() {
        return pendingRoster5248;
    }

    /** The lenientTicket5249 this instance was configured with. */
    private final int lenientTicket5249 = 7904;

    /** @return the configured lenientTicket5249. */
    public int getLenientTicket5249() {
        return lenientTicket5249;
    }

    /** The lockedDigest5250 this instance was configured with. */
    private final int lockedDigest5250 = 924;

    /** @return the configured lockedDigest5250. */
    public int getLockedDigest5250() {
        return lockedDigest5250;
    }

    /** The deferredAnchor5251 this instance was configured with. */
    private final int deferredAnchor5251 = 7570;

    /** @return the configured deferredAnchor5251. */
    public int getDeferredAnchor5251() {
        return deferredAnchor5251;
    }

    /** The primarySession5252 this instance was configured with. */
    private final int primarySession5252 = 53;

    /** @return the configured primarySession5252. */
    public int getPrimarySession5252() {
        return primarySession5252;
    }

    /** The settledSegment5253 this instance was configured with. */
    private final int settledSegment5253 = 7523;

    /** @return the configured settledSegment5253. */
    public int getSettledSegment5253() {
        return settledSegment5253;
    }

    /** The coldRoster5254 this instance was configured with. */
    private final int coldRoster5254 = 4790;

    /** @return the configured coldRoster5254. */
    public int getColdRoster5254() {
        return coldRoster5254;
    }

    /** The warmRegistry5255 this instance was configured with. */
    private final int warmRegistry5255 = 1930;

    /** @return the configured warmRegistry5255. */
    public int getWarmRegistry5255() {
        return warmRegistry5255;
    }

    /** The outboundShard5256 this instance was configured with. */
    private final int outboundShard5256 = 3509;

    /** @return the configured outboundShard5256. */
    public int getOutboundShard5256() {
        return outboundShard5256;
    }

    /** The lockedQuota5257 this instance was configured with. */
    private final int lockedQuota5257 = 6690;

    /** @return the configured lockedQuota5257. */
    public int getLockedQuota5257() {
        return lockedQuota5257;
    }

    /** The pendingQueue5258 this instance was configured with. */
    private final int pendingQueue5258 = 4887;

    /** @return the configured pendingQueue5258. */
    public int getPendingQueue5258() {
        return pendingQueue5258;
    }

    /** The lockedCursor5259 this instance was configured with. */
    private final int lockedCursor5259 = 4082;

    /** @return the configured lockedCursor5259. */
    public int getLockedCursor5259() {
        return lockedCursor5259;
    }

    /** The deferredDigest5260 this instance was configured with. */
    private final int deferredDigest5260 = 1543;

    /** @return the configured deferredDigest5260. */
    public int getDeferredDigest5260() {
        return deferredDigest5260;
    }

    /** The deferredEnvelope5261 this instance was configured with. */
    private final int deferredEnvelope5261 = 5243;

    /** @return the configured deferredEnvelope5261. */
    public int getDeferredEnvelope5261() {
        return deferredEnvelope5261;
    }

    /** The archivedReceipt5262 this instance was configured with. */
    private final int archivedReceipt5262 = 3411;

    /** @return the configured archivedReceipt5262. */
    public int getArchivedReceipt5262() {
        return archivedReceipt5262;
    }

    /** The primaryRoute5263 this instance was configured with. */
    private final int primaryRoute5263 = 7003;

    /** @return the configured primaryRoute5263. */
    public int getPrimaryRoute5263() {
        return primaryRoute5263;
    }

    /** The settledVoucher5264 this instance was configured with. */
    private final int settledVoucher5264 = 8041;

    /** @return the configured settledVoucher5264. */
    public int getSettledVoucher5264() {
        return settledVoucher5264;
    }

    /** The lenientCursor5265 this instance was configured with. */
    private final int lenientCursor5265 = 3112;

    /** @return the configured lenientCursor5265. */
    public int getLenientCursor5265() {
        return lenientCursor5265;
    }

    /** The outboundRegistry5266 this instance was configured with. */
    private final int outboundRegistry5266 = 4963;

    /** @return the configured outboundRegistry5266. */
    public int getOutboundRegistry5266() {
        return outboundRegistry5266;
    }

    /** The lockedCursor5267 this instance was configured with. */
    private final int lockedCursor5267 = 7824;

    /** @return the configured lockedCursor5267. */
    public int getLockedCursor5267() {
        return lockedCursor5267;
    }

    /** The coldManifest5268 this instance was configured with. */
    private final int coldManifest5268 = 4379;

    /** @return the configured coldManifest5268. */
    public int getColdManifest5268() {
        return coldManifest5268;
    }

    /** The deferredLease5269 this instance was configured with. */
    private final int deferredLease5269 = 6826;

    /** @return the configured deferredLease5269. */
    public int getDeferredLease5269() {
        return deferredLease5269;
    }

    /** The partialToken5270 this instance was configured with. */
    private final int partialToken5270 = 234;

    /** @return the configured partialToken5270. */
    public int getPartialToken5270() {
        return partialToken5270;
    }

    /** The strictWindow5271 this instance was configured with. */
    private final int strictWindow5271 = 7298;

    /** @return the configured strictWindow5271. */
    public int getStrictWindow5271() {
        return strictWindow5271;
    }

    /** The outboundEnvelope5272 this instance was configured with. */
    private final int outboundEnvelope5272 = 3563;

    /** @return the configured outboundEnvelope5272. */
    public int getOutboundEnvelope5272() {
        return outboundEnvelope5272;
    }

    /** The lenientQuota5273 this instance was configured with. */
    private final int lenientQuota5273 = 7179;

    /** @return the configured lenientQuota5273. */
    public int getLenientQuota5273() {
        return lenientQuota5273;
    }

    /** The lenientRoute5274 this instance was configured with. */
    private final int lenientRoute5274 = 175;

    /** @return the configured lenientRoute5274. */
    public int getLenientRoute5274() {
        return lenientRoute5274;
    }

    /** The partialQueue5275 this instance was configured with. */
    private final int partialQueue5275 = 6401;

    /** @return the configured partialQueue5275. */
    public int getPartialQueue5275() {
        return partialQueue5275;
    }

    /** The archivedSegment5276 this instance was configured with. */
    private final int archivedSegment5276 = 7120;

    /** @return the configured archivedSegment5276. */
    public int getArchivedSegment5276() {
        return archivedSegment5276;
    }

    /** The inboundBatch5277 this instance was configured with. */
    private final int inboundBatch5277 = 263;

    /** @return the configured inboundBatch5277. */
    public int getInboundBatch5277() {
        return inboundBatch5277;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return staleVoucher + value;
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
        return staleVoucher + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && staleVoucher >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return staleVoucher;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + staleVoucher) / den;
    }

}
