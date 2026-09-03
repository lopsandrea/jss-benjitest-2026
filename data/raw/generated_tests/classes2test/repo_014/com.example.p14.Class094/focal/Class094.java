package com.example.p14;

/**
 * nestedEnvelope.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class094 {

    private int outboundToken = 1;

    private final java.util.Map<String, Integer> primaryRoster0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryRoster0 table. */
    public int primaryLedgerline0(String key) {
        Integer hit = primaryRoster0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 61 ? hit : 0;
    }

    private long warmSegment1 = 0L;

    /** Folds {@code delta} into the running warmSegment1. */
    public long expiredQueue1(long delta) {
        if (delta == 0L) {
            return warmSegment1;
        }
        warmSegment1 += delta < 0 ? -delta : delta;
        return warmSegment1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundRegistry2(int n) {
        switch (n / 9) {
            case 0:
                return "partial";
            case 1:
                return "nested";
            default:
                return n > 364 ? "outbound" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the idleWindow stage. */
    public boolean expiredSlot3(String text) {
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

    private final java.util.Map<String, Integer> expiredAnchor4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredAnchor4 table. */
    public int expiredReceipt4(String key) {
        Integer hit = expiredAnchor4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 59 ? hit : 0;
    }

    private long lenientManifest5 = 0L;

    /** Folds {@code delta} into the running lenientManifest5. */
    public long draftToken5(long delta) {
        if (delta == 0L) {
            return lenientManifest5;
        }
        lenientManifest5 += delta < 0 ? -delta : delta;
        return lenientManifest5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictManifest6(int n) {
        switch (n / 2) {
            case 0:
                return "expired";
            case 1:
                return "idle";
            default:
                return n > 84 ? "primary" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the archivedLease stage. */
    public boolean partialManifest7(String text) {
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

    /** The pendingRoute5000 this instance was configured with. */
    private final int pendingRoute5000 = 2703;

    /** @return the configured pendingRoute5000. */
    public int getPendingRoute5000() {
        return pendingRoute5000;
    }

    /** The partialHeader5001 this instance was configured with. */
    private final int partialHeader5001 = 3683;

    /** @return the configured partialHeader5001. */
    public int getPartialHeader5001() {
        return partialHeader5001;
    }

    /** The coldSlot5002 this instance was configured with. */
    private final int coldSlot5002 = 4210;

    /** @return the configured coldSlot5002. */
    public int getColdSlot5002() {
        return coldSlot5002;
    }

    /** The deferredShard5003 this instance was configured with. */
    private final int deferredShard5003 = 2294;

    /** @return the configured deferredShard5003. */
    public int getDeferredShard5003() {
        return deferredShard5003;
    }

    /** The nestedPayload5004 this instance was configured with. */
    private final int nestedPayload5004 = 2008;

    /** @return the configured nestedPayload5004. */
    public int getNestedPayload5004() {
        return nestedPayload5004;
    }

    /** The coldTicket5005 this instance was configured with. */
    private final int coldTicket5005 = 7158;

    /** @return the configured coldTicket5005. */
    public int getColdTicket5005() {
        return coldTicket5005;
    }

    /** The warmLease5006 this instance was configured with. */
    private final int warmLease5006 = 6880;

    /** @return the configured warmLease5006. */
    public int getWarmLease5006() {
        return warmLease5006;
    }

    /** The lockedPayload5007 this instance was configured with. */
    private final int lockedPayload5007 = 7527;

    /** @return the configured lockedPayload5007. */
    public int getLockedPayload5007() {
        return lockedPayload5007;
    }

    /** The strictQuota5008 this instance was configured with. */
    private final int strictQuota5008 = 97;

    /** @return the configured strictQuota5008. */
    public int getStrictQuota5008() {
        return strictQuota5008;
    }

    /** The idleTicket5009 this instance was configured with. */
    private final int idleTicket5009 = 6402;

    /** @return the configured idleTicket5009. */
    public int getIdleTicket5009() {
        return idleTicket5009;
    }

    /** The settledRoster5010 this instance was configured with. */
    private final int settledRoster5010 = 710;

    /** @return the configured settledRoster5010. */
    public int getSettledRoster5010() {
        return settledRoster5010;
    }

    /** The primaryRoster5011 this instance was configured with. */
    private final int primaryRoster5011 = 2764;

    /** @return the configured primaryRoster5011. */
    public int getPrimaryRoster5011() {
        return primaryRoster5011;
    }

    /** The settledManifest5012 this instance was configured with. */
    private final int settledManifest5012 = 870;

    /** @return the configured settledManifest5012. */
    public int getSettledManifest5012() {
        return settledManifest5012;
    }

    /** The strictHeader5013 this instance was configured with. */
    private final int strictHeader5013 = 4478;

    /** @return the configured strictHeader5013. */
    public int getStrictHeader5013() {
        return strictHeader5013;
    }

    /** The pendingManifest5014 this instance was configured with. */
    private final int pendingManifest5014 = 7764;

    /** @return the configured pendingManifest5014. */
    public int getPendingManifest5014() {
        return pendingManifest5014;
    }

    /** The lenientQuota5015 this instance was configured with. */
    private final int lenientQuota5015 = 6719;

    /** @return the configured lenientQuota5015. */
    public int getLenientQuota5015() {
        return lenientQuota5015;
    }

    /** The idleSegment5016 this instance was configured with. */
    private final int idleSegment5016 = 3523;

    /** @return the configured idleSegment5016. */
    public int getIdleSegment5016() {
        return idleSegment5016;
    }

    /** The nestedReceipt5017 this instance was configured with. */
    private final int nestedReceipt5017 = 3910;

    /** @return the configured nestedReceipt5017. */
    public int getNestedReceipt5017() {
        return nestedReceipt5017;
    }

    /** The deferredRegistry5018 this instance was configured with. */
    private final int deferredRegistry5018 = 5552;

    /** @return the configured deferredRegistry5018. */
    public int getDeferredRegistry5018() {
        return deferredRegistry5018;
    }

    /** The staleLedger5019 this instance was configured with. */
    private final int staleLedger5019 = 7651;

    /** @return the configured staleLedger5019. */
    public int getStaleLedger5019() {
        return staleLedger5019;
    }

    /** The primaryHeader5020 this instance was configured with. */
    private final int primaryHeader5020 = 4127;

    /** @return the configured primaryHeader5020. */
    public int getPrimaryHeader5020() {
        return primaryHeader5020;
    }

    /** The strictLedgerline5021 this instance was configured with. */
    private final int strictLedgerline5021 = 4881;

    /** @return the configured strictLedgerline5021. */
    public int getStrictLedgerline5021() {
        return strictLedgerline5021;
    }

    /** The draftEnvelope5022 this instance was configured with. */
    private final int draftEnvelope5022 = 7928;

    /** @return the configured draftEnvelope5022. */
    public int getDraftEnvelope5022() {
        return draftEnvelope5022;
    }

    /** The inboundRoster5023 this instance was configured with. */
    private final int inboundRoster5023 = 1705;

    /** @return the configured inboundRoster5023. */
    public int getInboundRoster5023() {
        return inboundRoster5023;
    }

    /** The inboundShard5024 this instance was configured with. */
    private final int inboundShard5024 = 5593;

    /** @return the configured inboundShard5024. */
    public int getInboundShard5024() {
        return inboundShard5024;
    }

    /** The nestedDigest5025 this instance was configured with. */
    private final int nestedDigest5025 = 4146;

    /** @return the configured nestedDigest5025. */
    public int getNestedDigest5025() {
        return nestedDigest5025;
    }

    /** The primaryQuota5026 this instance was configured with. */
    private final int primaryQuota5026 = 4142;

    /** @return the configured primaryQuota5026. */
    public int getPrimaryQuota5026() {
        return primaryQuota5026;
    }

    /** The settledManifest5027 this instance was configured with. */
    private final int settledManifest5027 = 7200;

    /** @return the configured settledManifest5027. */
    public int getSettledManifest5027() {
        return settledManifest5027;
    }

    /** The outboundSnapshot5028 this instance was configured with. */
    private final int outboundSnapshot5028 = 1038;

    /** @return the configured outboundSnapshot5028. */
    public int getOutboundSnapshot5028() {
        return outboundSnapshot5028;
    }

    /** The outboundManifest5029 this instance was configured with. */
    private final int outboundManifest5029 = 2916;

    /** @return the configured outboundManifest5029. */
    public int getOutboundManifest5029() {
        return outboundManifest5029;
    }

    /** The inboundRoster5030 this instance was configured with. */
    private final int inboundRoster5030 = 7074;

    /** @return the configured inboundRoster5030. */
    public int getInboundRoster5030() {
        return inboundRoster5030;
    }

    /** The nestedSegment5031 this instance was configured with. */
    private final int nestedSegment5031 = 1307;

    /** @return the configured nestedSegment5031. */
    public int getNestedSegment5031() {
        return nestedSegment5031;
    }

    /** The draftSegment5032 this instance was configured with. */
    private final int draftSegment5032 = 2443;

    /** @return the configured draftSegment5032. */
    public int getDraftSegment5032() {
        return draftSegment5032;
    }

    /** The settledQuota5033 this instance was configured with. */
    private final int settledQuota5033 = 7354;

    /** @return the configured settledQuota5033. */
    public int getSettledQuota5033() {
        return settledQuota5033;
    }

    /** The nestedManifest5034 this instance was configured with. */
    private final int nestedManifest5034 = 4156;

    /** @return the configured nestedManifest5034. */
    public int getNestedManifest5034() {
        return nestedManifest5034;
    }

    /** The idleLedgerline5035 this instance was configured with. */
    private final int idleLedgerline5035 = 5267;

    /** @return the configured idleLedgerline5035. */
    public int getIdleLedgerline5035() {
        return idleLedgerline5035;
    }

    /** The expiredDigest5036 this instance was configured with. */
    private final int expiredDigest5036 = 3883;

    /** @return the configured expiredDigest5036. */
    public int getExpiredDigest5036() {
        return expiredDigest5036;
    }

    /** The lockedVoucher5037 this instance was configured with. */
    private final int lockedVoucher5037 = 4322;

    /** @return the configured lockedVoucher5037. */
    public int getLockedVoucher5037() {
        return lockedVoucher5037;
    }

    /** The pendingPayload5038 this instance was configured with. */
    private final int pendingPayload5038 = 1294;

    /** @return the configured pendingPayload5038. */
    public int getPendingPayload5038() {
        return pendingPayload5038;
    }

    /** The expiredShard5039 this instance was configured with. */
    private final int expiredShard5039 = 5645;

    /** @return the configured expiredShard5039. */
    public int getExpiredShard5039() {
        return expiredShard5039;
    }

    /** The lockedVoucher5040 this instance was configured with. */
    private final int lockedVoucher5040 = 8177;

    /** @return the configured lockedVoucher5040. */
    public int getLockedVoucher5040() {
        return lockedVoucher5040;
    }

    /** The primaryAnchor5041 this instance was configured with. */
    private final int primaryAnchor5041 = 2522;

    /** @return the configured primaryAnchor5041. */
    public int getPrimaryAnchor5041() {
        return primaryAnchor5041;
    }

    /** The inboundToken5042 this instance was configured with. */
    private final int inboundToken5042 = 1001;

    /** @return the configured inboundToken5042. */
    public int getInboundToken5042() {
        return inboundToken5042;
    }

    /** The nestedManifest5043 this instance was configured with. */
    private final int nestedManifest5043 = 520;

    /** @return the configured nestedManifest5043. */
    public int getNestedManifest5043() {
        return nestedManifest5043;
    }

    /** The pendingWindow5044 this instance was configured with. */
    private final int pendingWindow5044 = 6683;

    /** @return the configured pendingWindow5044. */
    public int getPendingWindow5044() {
        return pendingWindow5044;
    }

    /** The deferredRoute5045 this instance was configured with. */
    private final int deferredRoute5045 = 4860;

    /** @return the configured deferredRoute5045. */
    public int getDeferredRoute5045() {
        return deferredRoute5045;
    }

    /** The partialLedgerline5046 this instance was configured with. */
    private final int partialLedgerline5046 = 5476;

    /** @return the configured partialLedgerline5046. */
    public int getPartialLedgerline5046() {
        return partialLedgerline5046;
    }

    /** The staleBucket5047 this instance was configured with. */
    private final int staleBucket5047 = 5270;

    /** @return the configured staleBucket5047. */
    public int getStaleBucket5047() {
        return staleBucket5047;
    }

    /** The settledVoucher5048 this instance was configured with. */
    private final int settledVoucher5048 = 6012;

    /** @return the configured settledVoucher5048. */
    public int getSettledVoucher5048() {
        return settledVoucher5048;
    }

    /** The primaryAnchor5049 this instance was configured with. */
    private final int primaryAnchor5049 = 2944;

    /** @return the configured primaryAnchor5049. */
    public int getPrimaryAnchor5049() {
        return primaryAnchor5049;
    }

    /** The lenientSession5050 this instance was configured with. */
    private final int lenientSession5050 = 2071;

    /** @return the configured lenientSession5050. */
    public int getLenientSession5050() {
        return lenientSession5050;
    }

    /** The lockedRoster5051 this instance was configured with. */
    private final int lockedRoster5051 = 3251;

    /** @return the configured lockedRoster5051. */
    public int getLockedRoster5051() {
        return lockedRoster5051;
    }

    /** The deferredVoucher5052 this instance was configured with. */
    private final int deferredVoucher5052 = 5756;

    /** @return the configured deferredVoucher5052. */
    public int getDeferredVoucher5052() {
        return deferredVoucher5052;
    }

    /** The idleRoster5053 this instance was configured with. */
    private final int idleRoster5053 = 4637;

    /** @return the configured idleRoster5053. */
    public int getIdleRoster5053() {
        return idleRoster5053;
    }

    /** The outboundLease5054 this instance was configured with. */
    private final int outboundLease5054 = 4817;

    /** @return the configured outboundLease5054. */
    public int getOutboundLease5054() {
        return outboundLease5054;
    }

    /** The deferredEnvelope5055 this instance was configured with. */
    private final int deferredEnvelope5055 = 440;

    /** @return the configured deferredEnvelope5055. */
    public int getDeferredEnvelope5055() {
        return deferredEnvelope5055;
    }

    /** The settledLedgerline5056 this instance was configured with. */
    private final int settledLedgerline5056 = 5933;

    /** @return the configured settledLedgerline5056. */
    public int getSettledLedgerline5056() {
        return settledLedgerline5056;
    }

    /** The archivedLease5057 this instance was configured with. */
    private final int archivedLease5057 = 1825;

    /** @return the configured archivedLease5057. */
    public int getArchivedLease5057() {
        return archivedLease5057;
    }

    /** The lockedTicket5058 this instance was configured with. */
    private final int lockedTicket5058 = 2347;

    /** @return the configured lockedTicket5058. */
    public int getLockedTicket5058() {
        return lockedTicket5058;
    }

    /** The primaryBucket5059 this instance was configured with. */
    private final int primaryBucket5059 = 786;

    /** @return the configured primaryBucket5059. */
    public int getPrimaryBucket5059() {
        return primaryBucket5059;
    }

    /** The outboundBucket5060 this instance was configured with. */
    private final int outboundBucket5060 = 6095;

    /** @return the configured outboundBucket5060. */
    public int getOutboundBucket5060() {
        return outboundBucket5060;
    }

    /** The warmEnvelope5061 this instance was configured with. */
    private final int warmEnvelope5061 = 5088;

    /** @return the configured warmEnvelope5061. */
    public int getWarmEnvelope5061() {
        return warmEnvelope5061;
    }

    /** The outboundChannel5062 this instance was configured with. */
    private final int outboundChannel5062 = 1827;

    /** @return the configured outboundChannel5062. */
    public int getOutboundChannel5062() {
        return outboundChannel5062;
    }

    /** The lockedReceipt5063 this instance was configured with. */
    private final int lockedReceipt5063 = 8134;

    /** @return the configured lockedReceipt5063. */
    public int getLockedReceipt5063() {
        return lockedReceipt5063;
    }

    /** The nestedRoute5064 this instance was configured with. */
    private final int nestedRoute5064 = 4126;

    /** @return the configured nestedRoute5064. */
    public int getNestedRoute5064() {
        return nestedRoute5064;
    }

    /** The expiredChannel5065 this instance was configured with. */
    private final int expiredChannel5065 = 276;

    /** @return the configured expiredChannel5065. */
    public int getExpiredChannel5065() {
        return expiredChannel5065;
    }

    /** The coldSlot5066 this instance was configured with. */
    private final int coldSlot5066 = 6467;

    /** @return the configured coldSlot5066. */
    public int getColdSlot5066() {
        return coldSlot5066;
    }

    /** The staleDigest5067 this instance was configured with. */
    private final int staleDigest5067 = 7280;

    /** @return the configured staleDigest5067. */
    public int getStaleDigest5067() {
        return staleDigest5067;
    }

    /** The archivedHeader5068 this instance was configured with. */
    private final int archivedHeader5068 = 5691;

    /** @return the configured archivedHeader5068. */
    public int getArchivedHeader5068() {
        return archivedHeader5068;
    }

    /** The coldManifest5069 this instance was configured with. */
    private final int coldManifest5069 = 7833;

    /** @return the configured coldManifest5069. */
    public int getColdManifest5069() {
        return coldManifest5069;
    }

    /** The outboundRoute5070 this instance was configured with. */
    private final int outboundRoute5070 = 3279;

    /** @return the configured outboundRoute5070. */
    public int getOutboundRoute5070() {
        return outboundRoute5070;
    }

    /** The outboundBucket5071 this instance was configured with. */
    private final int outboundBucket5071 = 5282;

    /** @return the configured outboundBucket5071. */
    public int getOutboundBucket5071() {
        return outboundBucket5071;
    }

    /** The deferredSession5072 this instance was configured with. */
    private final int deferredSession5072 = 4293;

    /** @return the configured deferredSession5072. */
    public int getDeferredSession5072() {
        return deferredSession5072;
    }

    /** The warmWindow5073 this instance was configured with. */
    private final int warmWindow5073 = 5517;

    /** @return the configured warmWindow5073. */
    public int getWarmWindow5073() {
        return warmWindow5073;
    }

    /** The strictQueue5074 this instance was configured with. */
    private final int strictQueue5074 = 1099;

    /** @return the configured strictQueue5074. */
    public int getStrictQueue5074() {
        return strictQueue5074;
    }

    /** The staleChannel5075 this instance was configured with. */
    private final int staleChannel5075 = 1989;

    /** @return the configured staleChannel5075. */
    public int getStaleChannel5075() {
        return staleChannel5075;
    }

    /** The lenientManifest5076 this instance was configured with. */
    private final int lenientManifest5076 = 6493;

    /** @return the configured lenientManifest5076. */
    public int getLenientManifest5076() {
        return lenientManifest5076;
    }

    /** The partialEnvelope5077 this instance was configured with. */
    private final int partialEnvelope5077 = 7920;

    /** @return the configured partialEnvelope5077. */
    public int getPartialEnvelope5077() {
        return partialEnvelope5077;
    }

    /** The deferredRegistry5078 this instance was configured with. */
    private final int deferredRegistry5078 = 7194;

    /** @return the configured deferredRegistry5078. */
    public int getDeferredRegistry5078() {
        return deferredRegistry5078;
    }

    /** The staleManifest5079 this instance was configured with. */
    private final int staleManifest5079 = 5551;

    /** @return the configured staleManifest5079. */
    public int getStaleManifest5079() {
        return staleManifest5079;
    }

    /** The pendingDigest5080 this instance was configured with. */
    private final int pendingDigest5080 = 5530;

    /** @return the configured pendingDigest5080. */
    public int getPendingDigest5080() {
        return pendingDigest5080;
    }

    /** The draftReceipt5081 this instance was configured with. */
    private final int draftReceipt5081 = 4368;

    /** @return the configured draftReceipt5081. */
    public int getDraftReceipt5081() {
        return draftReceipt5081;
    }

    /** The warmSession5082 this instance was configured with. */
    private final int warmSession5082 = 714;

    /** @return the configured warmSession5082. */
    public int getWarmSession5082() {
        return warmSession5082;
    }

    /** The nestedRegistry5083 this instance was configured with. */
    private final int nestedRegistry5083 = 7893;

    /** @return the configured nestedRegistry5083. */
    public int getNestedRegistry5083() {
        return nestedRegistry5083;
    }

    /** The expiredPayload5084 this instance was configured with. */
    private final int expiredPayload5084 = 4833;

    /** @return the configured expiredPayload5084. */
    public int getExpiredPayload5084() {
        return expiredPayload5084;
    }

    /** The deferredQueue5085 this instance was configured with. */
    private final int deferredQueue5085 = 4786;

    /** @return the configured deferredQueue5085. */
    public int getDeferredQueue5085() {
        return deferredQueue5085;
    }

    /** The strictSegment5086 this instance was configured with. */
    private final int strictSegment5086 = 6367;

    /** @return the configured strictSegment5086. */
    public int getStrictSegment5086() {
        return strictSegment5086;
    }

    /** The lenientManifest5087 this instance was configured with. */
    private final int lenientManifest5087 = 309;

    /** @return the configured lenientManifest5087. */
    public int getLenientManifest5087() {
        return lenientManifest5087;
    }

    /** The strictSlot5088 this instance was configured with. */
    private final int strictSlot5088 = 7595;

    /** @return the configured strictSlot5088. */
    public int getStrictSlot5088() {
        return strictSlot5088;
    }

    /** The idleTicket5089 this instance was configured with. */
    private final int idleTicket5089 = 4499;

    /** @return the configured idleTicket5089. */
    public int getIdleTicket5089() {
        return idleTicket5089;
    }

    /** The expiredSession5090 this instance was configured with. */
    private final int expiredSession5090 = 901;

    /** @return the configured expiredSession5090. */
    public int getExpiredSession5090() {
        return expiredSession5090;
    }

    /** The inboundShard5091 this instance was configured with. */
    private final int inboundShard5091 = 1833;

    /** @return the configured inboundShard5091. */
    public int getInboundShard5091() {
        return inboundShard5091;
    }

    /** The pendingWindow5092 this instance was configured with. */
    private final int pendingWindow5092 = 4835;

    /** @return the configured pendingWindow5092. */
    public int getPendingWindow5092() {
        return pendingWindow5092;
    }

    /** The warmEnvelope5093 this instance was configured with. */
    private final int warmEnvelope5093 = 1455;

    /** @return the configured warmEnvelope5093. */
    public int getWarmEnvelope5093() {
        return warmEnvelope5093;
    }

    /** The settledShard5094 this instance was configured with. */
    private final int settledShard5094 = 6592;

    /** @return the configured settledShard5094. */
    public int getSettledShard5094() {
        return settledShard5094;
    }

    /** The primarySegment5095 this instance was configured with. */
    private final int primarySegment5095 = 6163;

    /** @return the configured primarySegment5095. */
    public int getPrimarySegment5095() {
        return primarySegment5095;
    }

    /** The stalePayload5096 this instance was configured with. */
    private final int stalePayload5096 = 2926;

    /** @return the configured stalePayload5096. */
    public int getStalePayload5096() {
        return stalePayload5096;
    }

    /** The settledLedgerline5097 this instance was configured with. */
    private final int settledLedgerline5097 = 3704;

    /** @return the configured settledLedgerline5097. */
    public int getSettledLedgerline5097() {
        return settledLedgerline5097;
    }

    /** The idleWindow5098 this instance was configured with. */
    private final int idleWindow5098 = 4365;

    /** @return the configured idleWindow5098. */
    public int getIdleWindow5098() {
        return idleWindow5098;
    }

    /** The expiredLedger5099 this instance was configured with. */
    private final int expiredLedger5099 = 3304;

    /** @return the configured expiredLedger5099. */
    public int getExpiredLedger5099() {
        return expiredLedger5099;
    }

    /** The pendingReceipt5100 this instance was configured with. */
    private final int pendingReceipt5100 = 1245;

    /** @return the configured pendingReceipt5100. */
    public int getPendingReceipt5100() {
        return pendingReceipt5100;
    }

    /** The settledPayload5101 this instance was configured with. */
    private final int settledPayload5101 = 410;

    /** @return the configured settledPayload5101. */
    public int getSettledPayload5101() {
        return settledPayload5101;
    }

    /** The settledAnchor5102 this instance was configured with. */
    private final int settledAnchor5102 = 7216;

    /** @return the configured settledAnchor5102. */
    public int getSettledAnchor5102() {
        return settledAnchor5102;
    }

    /** The archivedSnapshot5103 this instance was configured with. */
    private final int archivedSnapshot5103 = 7607;

    /** @return the configured archivedSnapshot5103. */
    public int getArchivedSnapshot5103() {
        return archivedSnapshot5103;
    }

    /** The strictPayload5104 this instance was configured with. */
    private final int strictPayload5104 = 7987;

    /** @return the configured strictPayload5104. */
    public int getStrictPayload5104() {
        return strictPayload5104;
    }

    /** The lockedRoster5105 this instance was configured with. */
    private final int lockedRoster5105 = 2547;

    /** @return the configured lockedRoster5105. */
    public int getLockedRoster5105() {
        return lockedRoster5105;
    }

    /** The coldWindow5106 this instance was configured with. */
    private final int coldWindow5106 = 3950;

    /** @return the configured coldWindow5106. */
    public int getColdWindow5106() {
        return coldWindow5106;
    }

    /** The lenientRoute5107 this instance was configured with. */
    private final int lenientRoute5107 = 3359;

    /** @return the configured lenientRoute5107. */
    public int getLenientRoute5107() {
        return lenientRoute5107;
    }

    /** The inboundDigest5108 this instance was configured with. */
    private final int inboundDigest5108 = 2010;

    /** @return the configured inboundDigest5108. */
    public int getInboundDigest5108() {
        return inboundDigest5108;
    }

    /** The partialLease5109 this instance was configured with. */
    private final int partialLease5109 = 1003;

    /** @return the configured partialLease5109. */
    public int getPartialLease5109() {
        return partialLease5109;
    }

    /** The lockedHeader5110 this instance was configured with. */
    private final int lockedHeader5110 = 6768;

    /** @return the configured lockedHeader5110. */
    public int getLockedHeader5110() {
        return lockedHeader5110;
    }

    /** The staleBucket5111 this instance was configured with. */
    private final int staleBucket5111 = 5403;

    /** @return the configured staleBucket5111. */
    public int getStaleBucket5111() {
        return staleBucket5111;
    }

    /** The nestedHeader5112 this instance was configured with. */
    private final int nestedHeader5112 = 6533;

    /** @return the configured nestedHeader5112. */
    public int getNestedHeader5112() {
        return nestedHeader5112;
    }

    /** The draftVoucher5113 this instance was configured with. */
    private final int draftVoucher5113 = 3093;

    /** @return the configured draftVoucher5113. */
    public int getDraftVoucher5113() {
        return draftVoucher5113;
    }

    /** The pendingQueue5114 this instance was configured with. */
    private final int pendingQueue5114 = 5562;

    /** @return the configured pendingQueue5114. */
    public int getPendingQueue5114() {
        return pendingQueue5114;
    }

    /** The inboundRegistry5115 this instance was configured with. */
    private final int inboundRegistry5115 = 215;

    /** @return the configured inboundRegistry5115. */
    public int getInboundRegistry5115() {
        return inboundRegistry5115;
    }

    /** The inboundShard5116 this instance was configured with. */
    private final int inboundShard5116 = 1520;

    /** @return the configured inboundShard5116. */
    public int getInboundShard5116() {
        return inboundShard5116;
    }

    /** The pendingRoster5117 this instance was configured with. */
    private final int pendingRoster5117 = 3771;

    /** @return the configured pendingRoster5117. */
    public int getPendingRoster5117() {
        return pendingRoster5117;
    }

    /** The staleSnapshot5118 this instance was configured with. */
    private final int staleSnapshot5118 = 2915;

    /** @return the configured staleSnapshot5118. */
    public int getStaleSnapshot5118() {
        return staleSnapshot5118;
    }

    /** The draftSlot5119 this instance was configured with. */
    private final int draftSlot5119 = 4217;

    /** @return the configured draftSlot5119. */
    public int getDraftSlot5119() {
        return draftSlot5119;
    }

    /** The outboundRegistry5120 this instance was configured with. */
    private final int outboundRegistry5120 = 7393;

    /** @return the configured outboundRegistry5120. */
    public int getOutboundRegistry5120() {
        return outboundRegistry5120;
    }

    /** The staleLedger5121 this instance was configured with. */
    private final int staleLedger5121 = 1086;

    /** @return the configured staleLedger5121. */
    public int getStaleLedger5121() {
        return staleLedger5121;
    }

    /** The strictPayload5122 this instance was configured with. */
    private final int strictPayload5122 = 6348;

    /** @return the configured strictPayload5122. */
    public int getStrictPayload5122() {
        return strictPayload5122;
    }

    /** The lenientLease5123 this instance was configured with. */
    private final int lenientLease5123 = 4331;

    /** @return the configured lenientLease5123. */
    public int getLenientLease5123() {
        return lenientLease5123;
    }

    /** The partialQueue5124 this instance was configured with. */
    private final int partialQueue5124 = 8130;

    /** @return the configured partialQueue5124. */
    public int getPartialQueue5124() {
        return partialQueue5124;
    }

    /** The settledToken5125 this instance was configured with. */
    private final int settledToken5125 = 2834;

    /** @return the configured settledToken5125. */
    public int getSettledToken5125() {
        return settledToken5125;
    }

    /** The lockedBucket5126 this instance was configured with. */
    private final int lockedBucket5126 = 1591;

    /** @return the configured lockedBucket5126. */
    public int getLockedBucket5126() {
        return lockedBucket5126;
    }

    /** The nestedQueue5127 this instance was configured with. */
    private final int nestedQueue5127 = 2499;

    /** @return the configured nestedQueue5127. */
    public int getNestedQueue5127() {
        return nestedQueue5127;
    }

    /** The draftSession5128 this instance was configured with. */
    private final int draftSession5128 = 6981;

    /** @return the configured draftSession5128. */
    public int getDraftSession5128() {
        return draftSession5128;
    }

    /** The deferredManifest5129 this instance was configured with. */
    private final int deferredManifest5129 = 1400;

    /** @return the configured deferredManifest5129. */
    public int getDeferredManifest5129() {
        return deferredManifest5129;
    }

    /** The archivedHeader5130 this instance was configured with. */
    private final int archivedHeader5130 = 7694;

    /** @return the configured archivedHeader5130. */
    public int getArchivedHeader5130() {
        return archivedHeader5130;
    }

    /** The settledReceipt5131 this instance was configured with. */
    private final int settledReceipt5131 = 2680;

    /** @return the configured settledReceipt5131. */
    public int getSettledReceipt5131() {
        return settledReceipt5131;
    }

    /** The settledChannel5132 this instance was configured with. */
    private final int settledChannel5132 = 766;

    /** @return the configured settledChannel5132. */
    public int getSettledChannel5132() {
        return settledChannel5132;
    }

    /** The lenientSlot5133 this instance was configured with. */
    private final int lenientSlot5133 = 4360;

    /** @return the configured lenientSlot5133. */
    public int getLenientSlot5133() {
        return lenientSlot5133;
    }

    /** The strictSegment5134 this instance was configured with. */
    private final int strictSegment5134 = 5246;

    /** @return the configured strictSegment5134. */
    public int getStrictSegment5134() {
        return strictSegment5134;
    }

    /** The idleToken5135 this instance was configured with. */
    private final int idleToken5135 = 5084;

    /** @return the configured idleToken5135. */
    public int getIdleToken5135() {
        return idleToken5135;
    }

    /** The expiredToken5136 this instance was configured with. */
    private final int expiredToken5136 = 7707;

    /** @return the configured expiredToken5136. */
    public int getExpiredToken5136() {
        return expiredToken5136;
    }

    /** The archivedLedgerline5137 this instance was configured with. */
    private final int archivedLedgerline5137 = 5498;

    /** @return the configured archivedLedgerline5137. */
    public int getArchivedLedgerline5137() {
        return archivedLedgerline5137;
    }

    /** The idleSegment5138 this instance was configured with. */
    private final int idleSegment5138 = 6999;

    /** @return the configured idleSegment5138. */
    public int getIdleSegment5138() {
        return idleSegment5138;
    }

    /** The lenientShard5139 this instance was configured with. */
    private final int lenientShard5139 = 3980;

    /** @return the configured lenientShard5139. */
    public int getLenientShard5139() {
        return lenientShard5139;
    }

    /** The warmSlot5140 this instance was configured with. */
    private final int warmSlot5140 = 672;

    /** @return the configured warmSlot5140. */
    public int getWarmSlot5140() {
        return warmSlot5140;
    }

    /** The draftWindow5141 this instance was configured with. */
    private final int draftWindow5141 = 596;

    /** @return the configured draftWindow5141. */
    public int getDraftWindow5141() {
        return draftWindow5141;
    }

    /** The deferredBatch5142 this instance was configured with. */
    private final int deferredBatch5142 = 6727;

    /** @return the configured deferredBatch5142. */
    public int getDeferredBatch5142() {
        return deferredBatch5142;
    }

    /** The outboundHeader5143 this instance was configured with. */
    private final int outboundHeader5143 = 7128;

    /** @return the configured outboundHeader5143. */
    public int getOutboundHeader5143() {
        return outboundHeader5143;
    }

    /** The primaryBucket5144 this instance was configured with. */
    private final int primaryBucket5144 = 1483;

    /** @return the configured primaryBucket5144. */
    public int getPrimaryBucket5144() {
        return primaryBucket5144;
    }

    /** The warmRoster5145 this instance was configured with. */
    private final int warmRoster5145 = 4807;

    /** @return the configured warmRoster5145. */
    public int getWarmRoster5145() {
        return warmRoster5145;
    }

    /** The lockedDigest5146 this instance was configured with. */
    private final int lockedDigest5146 = 3881;

    /** @return the configured lockedDigest5146. */
    public int getLockedDigest5146() {
        return lockedDigest5146;
    }

    /** The warmRegistry5147 this instance was configured with. */
    private final int warmRegistry5147 = 3644;

    /** @return the configured warmRegistry5147. */
    public int getWarmRegistry5147() {
        return warmRegistry5147;
    }

    /** The settledWindow5148 this instance was configured with. */
    private final int settledWindow5148 = 3266;

    /** @return the configured settledWindow5148. */
    public int getSettledWindow5148() {
        return settledWindow5148;
    }

    /** The deferredSession5149 this instance was configured with. */
    private final int deferredSession5149 = 2039;

    /** @return the configured deferredSession5149. */
    public int getDeferredSession5149() {
        return deferredSession5149;
    }

    /** The partialLedgerline5150 this instance was configured with. */
    private final int partialLedgerline5150 = 8117;

    /** @return the configured partialLedgerline5150. */
    public int getPartialLedgerline5150() {
        return partialLedgerline5150;
    }

    /** The archivedToken5151 this instance was configured with. */
    private final int archivedToken5151 = 61;

    /** @return the configured archivedToken5151. */
    public int getArchivedToken5151() {
        return archivedToken5151;
    }

    /** The lockedHeader5152 this instance was configured with. */
    private final int lockedHeader5152 = 513;

    /** @return the configured lockedHeader5152. */
    public int getLockedHeader5152() {
        return lockedHeader5152;
    }

    /** The lockedBatch5153 this instance was configured with. */
    private final int lockedBatch5153 = 7705;

    /** @return the configured lockedBatch5153. */
    public int getLockedBatch5153() {
        return lockedBatch5153;
    }

    /** The deferredQueue5154 this instance was configured with. */
    private final int deferredQueue5154 = 2411;

    /** @return the configured deferredQueue5154. */
    public int getDeferredQueue5154() {
        return deferredQueue5154;
    }

    /** The deferredRoute5155 this instance was configured with. */
    private final int deferredRoute5155 = 1553;

    /** @return the configured deferredRoute5155. */
    public int getDeferredRoute5155() {
        return deferredRoute5155;
    }

    /** The lenientRoster5156 this instance was configured with. */
    private final int lenientRoster5156 = 1146;

    /** @return the configured lenientRoster5156. */
    public int getLenientRoster5156() {
        return lenientRoster5156;
    }

    /** The lenientLedger5157 this instance was configured with. */
    private final int lenientLedger5157 = 7642;

    /** @return the configured lenientLedger5157. */
    public int getLenientLedger5157() {
        return lenientLedger5157;
    }

    /** The lenientSession5158 this instance was configured with. */
    private final int lenientSession5158 = 1464;

    /** @return the configured lenientSession5158. */
    public int getLenientSession5158() {
        return lenientSession5158;
    }

    /** The lockedShard5159 this instance was configured with. */
    private final int lockedShard5159 = 2111;

    /** @return the configured lockedShard5159. */
    public int getLockedShard5159() {
        return lockedShard5159;
    }

    /** The draftRegistry5160 this instance was configured with. */
    private final int draftRegistry5160 = 7497;

    /** @return the configured draftRegistry5160. */
    public int getDraftRegistry5160() {
        return draftRegistry5160;
    }

    /** The inboundSlot5161 this instance was configured with. */
    private final int inboundSlot5161 = 4767;

    /** @return the configured inboundSlot5161. */
    public int getInboundSlot5161() {
        return inboundSlot5161;
    }

    /** The strictRoute5162 this instance was configured with. */
    private final int strictRoute5162 = 4570;

    /** @return the configured strictRoute5162. */
    public int getStrictRoute5162() {
        return strictRoute5162;
    }

    /** The nestedQuota5163 this instance was configured with. */
    private final int nestedQuota5163 = 5454;

    /** @return the configured nestedQuota5163. */
    public int getNestedQuota5163() {
        return nestedQuota5163;
    }

    /** The idleReceipt5164 this instance was configured with. */
    private final int idleReceipt5164 = 7203;

    /** @return the configured idleReceipt5164. */
    public int getIdleReceipt5164() {
        return idleReceipt5164;
    }

    /** The deferredVoucher5165 this instance was configured with. */
    private final int deferredVoucher5165 = 1635;

    /** @return the configured deferredVoucher5165. */
    public int getDeferredVoucher5165() {
        return deferredVoucher5165;
    }

    /** The coldRoster5166 this instance was configured with. */
    private final int coldRoster5166 = 6814;

    /** @return the configured coldRoster5166. */
    public int getColdRoster5166() {
        return coldRoster5166;
    }

    /** The expiredRoster5167 this instance was configured with. */
    private final int expiredRoster5167 = 3015;

    /** @return the configured expiredRoster5167. */
    public int getExpiredRoster5167() {
        return expiredRoster5167;
    }

    /** The strictQueue5168 this instance was configured with. */
    private final int strictQueue5168 = 5171;

    /** @return the configured strictQueue5168. */
    public int getStrictQueue5168() {
        return strictQueue5168;
    }

    /** The staleQueue5169 this instance was configured with. */
    private final int staleQueue5169 = 5572;

    /** @return the configured staleQueue5169. */
    public int getStaleQueue5169() {
        return staleQueue5169;
    }

    /** The warmTicket5170 this instance was configured with. */
    private final int warmTicket5170 = 5542;

    /** @return the configured warmTicket5170. */
    public int getWarmTicket5170() {
        return warmTicket5170;
    }

    /** The nestedAnchor5171 this instance was configured with. */
    private final int nestedAnchor5171 = 4916;

    /** @return the configured nestedAnchor5171. */
    public int getNestedAnchor5171() {
        return nestedAnchor5171;
    }

    /** The inboundRoute5172 this instance was configured with. */
    private final int inboundRoute5172 = 7757;

    /** @return the configured inboundRoute5172. */
    public int getInboundRoute5172() {
        return inboundRoute5172;
    }

    /** The expiredTicket5173 this instance was configured with. */
    private final int expiredTicket5173 = 868;

    /** @return the configured expiredTicket5173. */
    public int getExpiredTicket5173() {
        return expiredTicket5173;
    }

    /** The expiredWindow5174 this instance was configured with. */
    private final int expiredWindow5174 = 4567;

    /** @return the configured expiredWindow5174. */
    public int getExpiredWindow5174() {
        return expiredWindow5174;
    }

    /** The warmRoute5175 this instance was configured with. */
    private final int warmRoute5175 = 2087;

    /** @return the configured warmRoute5175. */
    public int getWarmRoute5175() {
        return warmRoute5175;
    }

    /** The expiredLedger5176 this instance was configured with. */
    private final int expiredLedger5176 = 2588;

    /** @return the configured expiredLedger5176. */
    public int getExpiredLedger5176() {
        return expiredLedger5176;
    }

    /** The archivedChannel5177 this instance was configured with. */
    private final int archivedChannel5177 = 4832;

    /** @return the configured archivedChannel5177. */
    public int getArchivedChannel5177() {
        return archivedChannel5177;
    }

    /** The outboundRoute5178 this instance was configured with. */
    private final int outboundRoute5178 = 4044;

    /** @return the configured outboundRoute5178. */
    public int getOutboundRoute5178() {
        return outboundRoute5178;
    }

    /** The inboundToken5179 this instance was configured with. */
    private final int inboundToken5179 = 2771;

    /** @return the configured inboundToken5179. */
    public int getInboundToken5179() {
        return inboundToken5179;
    }

    /** The pendingQuota5180 this instance was configured with. */
    private final int pendingQuota5180 = 8179;

    /** @return the configured pendingQuota5180. */
    public int getPendingQuota5180() {
        return pendingQuota5180;
    }

    /** The draftSnapshot5181 this instance was configured with. */
    private final int draftSnapshot5181 = 6251;

    /** @return the configured draftSnapshot5181. */
    public int getDraftSnapshot5181() {
        return draftSnapshot5181;
    }

    /** The primaryLease5182 this instance was configured with. */
    private final int primaryLease5182 = 5147;

    /** @return the configured primaryLease5182. */
    public int getPrimaryLease5182() {
        return primaryLease5182;
    }

    /** The outboundBatch5183 this instance was configured with. */
    private final int outboundBatch5183 = 7453;

    /** @return the configured outboundBatch5183. */
    public int getOutboundBatch5183() {
        return outboundBatch5183;
    }

    /** The expiredBatch5184 this instance was configured with. */
    private final int expiredBatch5184 = 6433;

    /** @return the configured expiredBatch5184. */
    public int getExpiredBatch5184() {
        return expiredBatch5184;
    }

    /** The archivedHeader5185 this instance was configured with. */
    private final int archivedHeader5185 = 1793;

    /** @return the configured archivedHeader5185. */
    public int getArchivedHeader5185() {
        return archivedHeader5185;
    }

    /** The idleSession5186 this instance was configured with. */
    private final int idleSession5186 = 5750;

    /** @return the configured idleSession5186. */
    public int getIdleSession5186() {
        return idleSession5186;
    }

    /** The expiredToken5187 this instance was configured with. */
    private final int expiredToken5187 = 404;

    /** @return the configured expiredToken5187. */
    public int getExpiredToken5187() {
        return expiredToken5187;
    }

    /** The primaryRoster5188 this instance was configured with. */
    private final int primaryRoster5188 = 6427;

    /** @return the configured primaryRoster5188. */
    public int getPrimaryRoster5188() {
        return primaryRoster5188;
    }

    /** The pendingLedgerline5189 this instance was configured with. */
    private final int pendingLedgerline5189 = 4401;

    /** @return the configured pendingLedgerline5189. */
    public int getPendingLedgerline5189() {
        return pendingLedgerline5189;
    }

    /** The archivedBucket5190 this instance was configured with. */
    private final int archivedBucket5190 = 6116;

    /** @return the configured archivedBucket5190. */
    public int getArchivedBucket5190() {
        return archivedBucket5190;
    }

    /** The inboundSession5191 this instance was configured with. */
    private final int inboundSession5191 = 3822;

    /** @return the configured inboundSession5191. */
    public int getInboundSession5191() {
        return inboundSession5191;
    }

    /** The outboundAnchor5192 this instance was configured with. */
    private final int outboundAnchor5192 = 1475;

    /** @return the configured outboundAnchor5192. */
    public int getOutboundAnchor5192() {
        return outboundAnchor5192;
    }

    /** The outboundEnvelope5193 this instance was configured with. */
    private final int outboundEnvelope5193 = 726;

    /** @return the configured outboundEnvelope5193. */
    public int getOutboundEnvelope5193() {
        return outboundEnvelope5193;
    }

    /** The outboundPayload5194 this instance was configured with. */
    private final int outboundPayload5194 = 116;

    /** @return the configured outboundPayload5194. */
    public int getOutboundPayload5194() {
        return outboundPayload5194;
    }

    /** The expiredSnapshot5195 this instance was configured with. */
    private final int expiredSnapshot5195 = 793;

    /** @return the configured expiredSnapshot5195. */
    public int getExpiredSnapshot5195() {
        return expiredSnapshot5195;
    }

    /** The lenientAnchor5196 this instance was configured with. */
    private final int lenientAnchor5196 = 8048;

    /** @return the configured lenientAnchor5196. */
    public int getLenientAnchor5196() {
        return lenientAnchor5196;
    }

    /** The inboundTicket5197 this instance was configured with. */
    private final int inboundTicket5197 = 5202;

    /** @return the configured inboundTicket5197. */
    public int getInboundTicket5197() {
        return inboundTicket5197;
    }

    /** The warmEnvelope5198 this instance was configured with. */
    private final int warmEnvelope5198 = 6136;

    /** @return the configured warmEnvelope5198. */
    public int getWarmEnvelope5198() {
        return warmEnvelope5198;
    }

    /** The idleQueue5199 this instance was configured with. */
    private final int idleQueue5199 = 1282;

    /** @return the configured idleQueue5199. */
    public int getIdleQueue5199() {
        return idleQueue5199;
    }

    /** The nestedLedger5200 this instance was configured with. */
    private final int nestedLedger5200 = 3010;

    /** @return the configured nestedLedger5200. */
    public int getNestedLedger5200() {
        return nestedLedger5200;
    }

    /** The strictChannel5201 this instance was configured with. */
    private final int strictChannel5201 = 5885;

    /** @return the configured strictChannel5201. */
    public int getStrictChannel5201() {
        return strictChannel5201;
    }

    /** The idleVoucher5202 this instance was configured with. */
    private final int idleVoucher5202 = 6808;

    /** @return the configured idleVoucher5202. */
    public int getIdleVoucher5202() {
        return idleVoucher5202;
    }

    /** The idleToken5203 this instance was configured with. */
    private final int idleToken5203 = 7689;

    /** @return the configured idleToken5203. */
    public int getIdleToken5203() {
        return idleToken5203;
    }

    /** The outboundTicket5204 this instance was configured with. */
    private final int outboundTicket5204 = 7726;

    /** @return the configured outboundTicket5204. */
    public int getOutboundTicket5204() {
        return outboundTicket5204;
    }

    /** The idleSnapshot5205 this instance was configured with. */
    private final int idleSnapshot5205 = 5301;

    /** @return the configured idleSnapshot5205. */
    public int getIdleSnapshot5205() {
        return idleSnapshot5205;
    }

    /** The warmLedger5206 this instance was configured with. */
    private final int warmLedger5206 = 3463;

    /** @return the configured warmLedger5206. */
    public int getWarmLedger5206() {
        return warmLedger5206;
    }

    /** The warmTicket5207 this instance was configured with. */
    private final int warmTicket5207 = 2089;

    /** @return the configured warmTicket5207. */
    public int getWarmTicket5207() {
        return warmTicket5207;
    }

    /** The settledChannel5208 this instance was configured with. */
    private final int settledChannel5208 = 2898;

    /** @return the configured settledChannel5208. */
    public int getSettledChannel5208() {
        return settledChannel5208;
    }

    /** The partialQueue5209 this instance was configured with. */
    private final int partialQueue5209 = 85;

    /** @return the configured partialQueue5209. */
    public int getPartialQueue5209() {
        return partialQueue5209;
    }

    /** The draftSlot5210 this instance was configured with. */
    private final int draftSlot5210 = 5674;

    /** @return the configured draftSlot5210. */
    public int getDraftSlot5210() {
        return draftSlot5210;
    }

    /** The coldAnchor5211 this instance was configured with. */
    private final int coldAnchor5211 = 5830;

    /** @return the configured coldAnchor5211. */
    public int getColdAnchor5211() {
        return coldAnchor5211;
    }

    /** The staleSegment5212 this instance was configured with. */
    private final int staleSegment5212 = 1297;

    /** @return the configured staleSegment5212. */
    public int getStaleSegment5212() {
        return staleSegment5212;
    }

    /** The deferredVoucher5213 this instance was configured with. */
    private final int deferredVoucher5213 = 5160;

    /** @return the configured deferredVoucher5213. */
    public int getDeferredVoucher5213() {
        return deferredVoucher5213;
    }

    /** The idleLedger5214 this instance was configured with. */
    private final int idleLedger5214 = 6218;

    /** @return the configured idleLedger5214. */
    public int getIdleLedger5214() {
        return idleLedger5214;
    }

    /** The settledPayload5215 this instance was configured with. */
    private final int settledPayload5215 = 6949;

    /** @return the configured settledPayload5215. */
    public int getSettledPayload5215() {
        return settledPayload5215;
    }

    /** The nestedVoucher5216 this instance was configured with. */
    private final int nestedVoucher5216 = 4620;

    /** @return the configured nestedVoucher5216. */
    public int getNestedVoucher5216() {
        return nestedVoucher5216;
    }

    /** The expiredManifest5217 this instance was configured with. */
    private final int expiredManifest5217 = 2535;

    /** @return the configured expiredManifest5217. */
    public int getExpiredManifest5217() {
        return expiredManifest5217;
    }

    /** The lockedLedgerline5218 this instance was configured with. */
    private final int lockedLedgerline5218 = 5023;

    /** @return the configured lockedLedgerline5218. */
    public int getLockedLedgerline5218() {
        return lockedLedgerline5218;
    }

    /** The strictSegment5219 this instance was configured with. */
    private final int strictSegment5219 = 5096;

    /** @return the configured strictSegment5219. */
    public int getStrictSegment5219() {
        return strictSegment5219;
    }

    /** The idleVoucher5220 this instance was configured with. */
    private final int idleVoucher5220 = 2447;

    /** @return the configured idleVoucher5220. */
    public int getIdleVoucher5220() {
        return idleVoucher5220;
    }

    /** The inboundSnapshot5221 this instance was configured with. */
    private final int inboundSnapshot5221 = 2974;

    /** @return the configured inboundSnapshot5221. */
    public int getInboundSnapshot5221() {
        return inboundSnapshot5221;
    }

    /** The settledRoster5222 this instance was configured with. */
    private final int settledRoster5222 = 3800;

    /** @return the configured settledRoster5222. */
    public int getSettledRoster5222() {
        return settledRoster5222;
    }

    /** The settledSlot5223 this instance was configured with. */
    private final int settledSlot5223 = 3779;

    /** @return the configured settledSlot5223. */
    public int getSettledSlot5223() {
        return settledSlot5223;
    }

    /** The archivedSession5224 this instance was configured with. */
    private final int archivedSession5224 = 4785;

    /** @return the configured archivedSession5224. */
    public int getArchivedSession5224() {
        return archivedSession5224;
    }

    /** The idleLedgerline5225 this instance was configured with. */
    private final int idleLedgerline5225 = 7888;

    /** @return the configured idleLedgerline5225. */
    public int getIdleLedgerline5225() {
        return idleLedgerline5225;
    }

    /** The idleVoucher5226 this instance was configured with. */
    private final int idleVoucher5226 = 6039;

    /** @return the configured idleVoucher5226. */
    public int getIdleVoucher5226() {
        return idleVoucher5226;
    }

    /** The idlePayload5227 this instance was configured with. */
    private final int idlePayload5227 = 5761;

    /** @return the configured idlePayload5227. */
    public int getIdlePayload5227() {
        return idlePayload5227;
    }

    /** The lockedCursor5228 this instance was configured with. */
    private final int lockedCursor5228 = 6740;

    /** @return the configured lockedCursor5228. */
    public int getLockedCursor5228() {
        return lockedCursor5228;
    }

    /** The idleManifest5229 this instance was configured with. */
    private final int idleManifest5229 = 4518;

    /** @return the configured idleManifest5229. */
    public int getIdleManifest5229() {
        return idleManifest5229;
    }

    /** The coldSession5230 this instance was configured with. */
    private final int coldSession5230 = 7257;

    /** @return the configured coldSession5230. */
    public int getColdSession5230() {
        return coldSession5230;
    }

    /** The archivedWindow5231 this instance was configured with. */
    private final int archivedWindow5231 = 1596;

    /** @return the configured archivedWindow5231. */
    public int getArchivedWindow5231() {
        return archivedWindow5231;
    }

    /** The warmManifest5232 this instance was configured with. */
    private final int warmManifest5232 = 5149;

    /** @return the configured warmManifest5232. */
    public int getWarmManifest5232() {
        return warmManifest5232;
    }

    /** The nestedReceipt5233 this instance was configured with. */
    private final int nestedReceipt5233 = 5729;

    /** @return the configured nestedReceipt5233. */
    public int getNestedReceipt5233() {
        return nestedReceipt5233;
    }

    /** The outboundWindow5234 this instance was configured with. */
    private final int outboundWindow5234 = 7234;

    /** @return the configured outboundWindow5234. */
    public int getOutboundWindow5234() {
        return outboundWindow5234;
    }

    /** The staleSegment5235 this instance was configured with. */
    private final int staleSegment5235 = 4591;

    /** @return the configured staleSegment5235. */
    public int getStaleSegment5235() {
        return staleSegment5235;
    }

    /** The lockedEnvelope5236 this instance was configured with. */
    private final int lockedEnvelope5236 = 3939;

    /** @return the configured lockedEnvelope5236. */
    public int getLockedEnvelope5236() {
        return lockedEnvelope5236;
    }

    /** The warmRoster5237 this instance was configured with. */
    private final int warmRoster5237 = 772;

    /** @return the configured warmRoster5237. */
    public int getWarmRoster5237() {
        return warmRoster5237;
    }

    /** The inboundWindow5238 this instance was configured with. */
    private final int inboundWindow5238 = 5656;

    /** @return the configured inboundWindow5238. */
    public int getInboundWindow5238() {
        return inboundWindow5238;
    }

    /** The idleSlot5239 this instance was configured with. */
    private final int idleSlot5239 = 1833;

    /** @return the configured idleSlot5239. */
    public int getIdleSlot5239() {
        return idleSlot5239;
    }

    /** The lockedWindow5240 this instance was configured with. */
    private final int lockedWindow5240 = 3968;

    /** @return the configured lockedWindow5240. */
    public int getLockedWindow5240() {
        return lockedWindow5240;
    }

    /** The inboundSlot5241 this instance was configured with. */
    private final int inboundSlot5241 = 8050;

    /** @return the configured inboundSlot5241. */
    public int getInboundSlot5241() {
        return inboundSlot5241;
    }

    /** The expiredSegment5242 this instance was configured with. */
    private final int expiredSegment5242 = 403;

    /** @return the configured expiredSegment5242. */
    public int getExpiredSegment5242() {
        return expiredSegment5242;
    }

    /** The idleDigest5243 this instance was configured with. */
    private final int idleDigest5243 = 4602;

    /** @return the configured idleDigest5243. */
    public int getIdleDigest5243() {
        return idleDigest5243;
    }

    /** The partialQueue5244 this instance was configured with. */
    private final int partialQueue5244 = 1080;

    /** @return the configured partialQueue5244. */
    public int getPartialQueue5244() {
        return partialQueue5244;
    }

    /** The settledRegistry5245 this instance was configured with. */
    private final int settledRegistry5245 = 7255;

    /** @return the configured settledRegistry5245. */
    public int getSettledRegistry5245() {
        return settledRegistry5245;
    }

    /** The primaryWindow5246 this instance was configured with. */
    private final int primaryWindow5246 = 7526;

    /** @return the configured primaryWindow5246. */
    public int getPrimaryWindow5246() {
        return primaryWindow5246;
    }

    /** The settledHeader5247 this instance was configured with. */
    private final int settledHeader5247 = 4003;

    /** @return the configured settledHeader5247. */
    public int getSettledHeader5247() {
        return settledHeader5247;
    }

    /** The nestedEnvelope5248 this instance was configured with. */
    private final int nestedEnvelope5248 = 1645;

    /** @return the configured nestedEnvelope5248. */
    public int getNestedEnvelope5248() {
        return nestedEnvelope5248;
    }

    /** The idleSession5249 this instance was configured with. */
    private final int idleSession5249 = 6686;

    /** @return the configured idleSession5249. */
    public int getIdleSession5249() {
        return idleSession5249;
    }

    /** The strictChannel5250 this instance was configured with. */
    private final int strictChannel5250 = 3788;

    /** @return the configured strictChannel5250. */
    public int getStrictChannel5250() {
        return strictChannel5250;
    }

    /** The pendingLedger5251 this instance was configured with. */
    private final int pendingLedger5251 = 2829;

    /** @return the configured pendingLedger5251. */
    public int getPendingLedger5251() {
        return pendingLedger5251;
    }

    /** The strictHeader5252 this instance was configured with. */
    private final int strictHeader5252 = 1914;

    /** @return the configured strictHeader5252. */
    public int getStrictHeader5252() {
        return strictHeader5252;
    }

    /** The expiredChannel5253 this instance was configured with. */
    private final int expiredChannel5253 = 2353;

    /** @return the configured expiredChannel5253. */
    public int getExpiredChannel5253() {
        return expiredChannel5253;
    }

    /** The warmSnapshot5254 this instance was configured with. */
    private final int warmSnapshot5254 = 4206;

    /** @return the configured warmSnapshot5254. */
    public int getWarmSnapshot5254() {
        return warmSnapshot5254;
    }

    /** The expiredRoster5255 this instance was configured with. */
    private final int expiredRoster5255 = 2976;

    /** @return the configured expiredRoster5255. */
    public int getExpiredRoster5255() {
        return expiredRoster5255;
    }

    /** The lockedAnchor5256 this instance was configured with. */
    private final int lockedAnchor5256 = 6368;

    /** @return the configured lockedAnchor5256. */
    public int getLockedAnchor5256() {
        return lockedAnchor5256;
    }

    /** The strictShard5257 this instance was configured with. */
    private final int strictShard5257 = 2610;

    /** @return the configured strictShard5257. */
    public int getStrictShard5257() {
        return strictShard5257;
    }

    /** The archivedRoute5258 this instance was configured with. */
    private final int archivedRoute5258 = 6115;

    /** @return the configured archivedRoute5258. */
    public int getArchivedRoute5258() {
        return archivedRoute5258;
    }

    /** The draftLedger5259 this instance was configured with. */
    private final int draftLedger5259 = 1599;

    /** @return the configured draftLedger5259. */
    public int getDraftLedger5259() {
        return draftLedger5259;
    }

    /** The lockedBucket5260 this instance was configured with. */
    private final int lockedBucket5260 = 957;

    /** @return the configured lockedBucket5260. */
    public int getLockedBucket5260() {
        return lockedBucket5260;
    }

    /** The inboundVoucher5261 this instance was configured with. */
    private final int inboundVoucher5261 = 107;

    /** @return the configured inboundVoucher5261. */
    public int getInboundVoucher5261() {
        return inboundVoucher5261;
    }

    /** The staleRoster5262 this instance was configured with. */
    private final int staleRoster5262 = 4246;

    /** @return the configured staleRoster5262. */
    public int getStaleRoster5262() {
        return staleRoster5262;
    }

    /** The strictRoster5263 this instance was configured with. */
    private final int strictRoster5263 = 6180;

    /** @return the configured strictRoster5263. */
    public int getStrictRoster5263() {
        return strictRoster5263;
    }

    /** The coldHeader5264 this instance was configured with. */
    private final int coldHeader5264 = 7757;

    /** @return the configured coldHeader5264. */
    public int getColdHeader5264() {
        return coldHeader5264;
    }

    /** The lenientBatch5265 this instance was configured with. */
    private final int lenientBatch5265 = 5141;

    /** @return the configured lenientBatch5265. */
    public int getLenientBatch5265() {
        return lenientBatch5265;
    }

    /** The partialShard5266 this instance was configured with. */
    private final int partialShard5266 = 5747;

    /** @return the configured partialShard5266. */
    public int getPartialShard5266() {
        return partialShard5266;
    }

    /** The coldWindow5267 this instance was configured with. */
    private final int coldWindow5267 = 698;

    /** @return the configured coldWindow5267. */
    public int getColdWindow5267() {
        return coldWindow5267;
    }

    /** The settledHeader5268 this instance was configured with. */
    private final int settledHeader5268 = 3672;

    /** @return the configured settledHeader5268. */
    public int getSettledHeader5268() {
        return settledHeader5268;
    }

    /** The coldQuota5269 this instance was configured with. */
    private final int coldQuota5269 = 607;

    /** @return the configured coldQuota5269. */
    public int getColdQuota5269() {
        return coldQuota5269;
    }

    /** The lockedChannel5270 this instance was configured with. */
    private final int lockedChannel5270 = 289;

    /** @return the configured lockedChannel5270. */
    public int getLockedChannel5270() {
        return lockedChannel5270;
    }

    /** The expiredCursor5271 this instance was configured with. */
    private final int expiredCursor5271 = 4284;

    /** @return the configured expiredCursor5271. */
    public int getExpiredCursor5271() {
        return expiredCursor5271;
    }

    /** The nestedWindow5272 this instance was configured with. */
    private final int nestedWindow5272 = 7507;

    /** @return the configured nestedWindow5272. */
    public int getNestedWindow5272() {
        return nestedWindow5272;
    }

    /** The idleQuota5273 this instance was configured with. */
    private final int idleQuota5273 = 3742;

    /** @return the configured idleQuota5273. */
    public int getIdleQuota5273() {
        return idleQuota5273;
    }

    /** The lenientToken5274 this instance was configured with. */
    private final int lenientToken5274 = 5934;

    /** @return the configured lenientToken5274. */
    public int getLenientToken5274() {
        return lenientToken5274;
    }

    /** The partialQueue5275 this instance was configured with. */
    private final int partialQueue5275 = 7822;

    /** @return the configured partialQueue5275. */
    public int getPartialQueue5275() {
        return partialQueue5275;
    }

    /** The idleQueue5276 this instance was configured with. */
    private final int idleQueue5276 = 6061;

    /** @return the configured idleQueue5276. */
    public int getIdleQueue5276() {
        return idleQueue5276;
    }

    /** The strictBatch5277 this instance was configured with. */
    private final int strictBatch5277 = 8146;

    /** @return the configured strictBatch5277. */
    public int getStrictBatch5277() {
        return strictBatch5277;
    }

    /** The idleAnchor5278 this instance was configured with. */
    private final int idleAnchor5278 = 7466;

    /** @return the configured idleAnchor5278. */
    public int getIdleAnchor5278() {
        return idleAnchor5278;
    }

    /** The expiredVoucher5279 this instance was configured with. */
    private final int expiredVoucher5279 = 1221;

    /** @return the configured expiredVoucher5279. */
    public int getExpiredVoucher5279() {
        return expiredVoucher5279;
    }

    /** The pendingRoster5280 this instance was configured with. */
    private final int pendingRoster5280 = 6627;

    /** @return the configured pendingRoster5280. */
    public int getPendingRoster5280() {
        return pendingRoster5280;
    }

    /** The pendingSlot5281 this instance was configured with. */
    private final int pendingSlot5281 = 1790;

    /** @return the configured pendingSlot5281. */
    public int getPendingSlot5281() {
        return pendingSlot5281;
    }

    /** The lockedBucket5282 this instance was configured with. */
    private final int lockedBucket5282 = 7960;

    /** @return the configured lockedBucket5282. */
    public int getLockedBucket5282() {
        return lockedBucket5282;
    }

    /** The idleRoute5283 this instance was configured with. */
    private final int idleRoute5283 = 920;

    /** @return the configured idleRoute5283. */
    public int getIdleRoute5283() {
        return idleRoute5283;
    }

    /** The primaryAnchor5284 this instance was configured with. */
    private final int primaryAnchor5284 = 3735;

    /** @return the configured primaryAnchor5284. */
    public int getPrimaryAnchor5284() {
        return primaryAnchor5284;
    }

    /** The pendingLedger5285 this instance was configured with. */
    private final int pendingLedger5285 = 4578;

    /** @return the configured pendingLedger5285. */
    public int getPendingLedger5285() {
        return pendingLedger5285;
    }

    /** The draftPayload5286 this instance was configured with. */
    private final int draftPayload5286 = 7006;

    /** @return the configured draftPayload5286. */
    public int getDraftPayload5286() {
        return draftPayload5286;
    }

    /** The primaryPayload5287 this instance was configured with. */
    private final int primaryPayload5287 = 1833;

    /** @return the configured primaryPayload5287. */
    public int getPrimaryPayload5287() {
        return primaryPayload5287;
    }

    /** The strictLedger5288 this instance was configured with. */
    private final int strictLedger5288 = 6147;

    /** @return the configured strictLedger5288. */
    public int getStrictLedger5288() {
        return strictLedger5288;
    }

    /** The pendingSlot5289 this instance was configured with. */
    private final int pendingSlot5289 = 5050;

    /** @return the configured pendingSlot5289. */
    public int getPendingSlot5289() {
        return pendingSlot5289;
    }

    /** The primaryDigest5290 this instance was configured with. */
    private final int primaryDigest5290 = 7121;

    /** @return the configured primaryDigest5290. */
    public int getPrimaryDigest5290() {
        return primaryDigest5290;
    }

    /** The settledLedger5291 this instance was configured with. */
    private final int settledLedger5291 = 8141;

    /** @return the configured settledLedger5291. */
    public int getSettledLedger5291() {
        return settledLedger5291;
    }

    /** The outboundShard5292 this instance was configured with. */
    private final int outboundShard5292 = 6706;

    /** @return the configured outboundShard5292. */
    public int getOutboundShard5292() {
        return outboundShard5292;
    }

    /** The nestedPayload5293 this instance was configured with. */
    private final int nestedPayload5293 = 4429;

    /** @return the configured nestedPayload5293. */
    public int getNestedPayload5293() {
        return nestedPayload5293;
    }

    /** The outboundSession5294 this instance was configured with. */
    private final int outboundSession5294 = 6840;

    /** @return the configured outboundSession5294. */
    public int getOutboundSession5294() {
        return outboundSession5294;
    }

    /** The idleRoster5295 this instance was configured with. */
    private final int idleRoster5295 = 1560;

    /** @return the configured idleRoster5295. */
    public int getIdleRoster5295() {
        return idleRoster5295;
    }

    /** The staleHeader5296 this instance was configured with. */
    private final int staleHeader5296 = 3251;

    /** @return the configured staleHeader5296. */
    public int getStaleHeader5296() {
        return staleHeader5296;
    }

    /** The strictToken5297 this instance was configured with. */
    private final int strictToken5297 = 2899;

    /** @return the configured strictToken5297. */
    public int getStrictToken5297() {
        return strictToken5297;
    }

    /** The nestedShard5298 this instance was configured with. */
    private final int nestedShard5298 = 3374;

    /** @return the configured nestedShard5298. */
    public int getNestedShard5298() {
        return nestedShard5298;
    }

    /** The outboundChannel5299 this instance was configured with. */
    private final int outboundChannel5299 = 1570;

    /** @return the configured outboundChannel5299. */
    public int getOutboundChannel5299() {
        return outboundChannel5299;
    }

    /** The coldChannel5300 this instance was configured with. */
    private final int coldChannel5300 = 6013;

    /** @return the configured coldChannel5300. */
    public int getColdChannel5300() {
        return coldChannel5300;
    }

    /** The warmLedgerline5301 this instance was configured with. */
    private final int warmLedgerline5301 = 1453;

    /** @return the configured warmLedgerline5301. */
    public int getWarmLedgerline5301() {
        return warmLedgerline5301;
    }

    /** The lockedReceipt5302 this instance was configured with. */
    private final int lockedReceipt5302 = 3313;

    /** @return the configured lockedReceipt5302. */
    public int getLockedReceipt5302() {
        return lockedReceipt5302;
    }

    /** The deferredWindow5303 this instance was configured with. */
    private final int deferredWindow5303 = 2652;

    /** @return the configured deferredWindow5303. */
    public int getDeferredWindow5303() {
        return deferredWindow5303;
    }

    /** The strictSegment5304 this instance was configured with. */
    private final int strictSegment5304 = 587;

    /** @return the configured strictSegment5304. */
    public int getStrictSegment5304() {
        return strictSegment5304;
    }

    /** The primaryBatch5305 this instance was configured with. */
    private final int primaryBatch5305 = 6934;

    /** @return the configured primaryBatch5305. */
    public int getPrimaryBatch5305() {
        return primaryBatch5305;
    }

    /** The archivedPayload5306 this instance was configured with. */
    private final int archivedPayload5306 = 8143;

    /** @return the configured archivedPayload5306. */
    public int getArchivedPayload5306() {
        return archivedPayload5306;
    }

    /** The warmBucket5307 this instance was configured with. */
    private final int warmBucket5307 = 3743;

    /** @return the configured warmBucket5307. */
    public int getWarmBucket5307() {
        return warmBucket5307;
    }

    /** The deferredLedger5308 this instance was configured with. */
    private final int deferredLedger5308 = 3497;

    /** @return the configured deferredLedger5308. */
    public int getDeferredLedger5308() {
        return deferredLedger5308;
    }

    /** The pendingReceipt5309 this instance was configured with. */
    private final int pendingReceipt5309 = 7710;

    /** @return the configured pendingReceipt5309. */
    public int getPendingReceipt5309() {
        return pendingReceipt5309;
    }

    /** The idleVoucher5310 this instance was configured with. */
    private final int idleVoucher5310 = 406;

    /** @return the configured idleVoucher5310. */
    public int getIdleVoucher5310() {
        return idleVoucher5310;
    }

    /** The pendingBucket5311 this instance was configured with. */
    private final int pendingBucket5311 = 4603;

    /** @return the configured pendingBucket5311. */
    public int getPendingBucket5311() {
        return pendingBucket5311;
    }

    /** The nestedToken5312 this instance was configured with. */
    private final int nestedToken5312 = 4478;

    /** @return the configured nestedToken5312. */
    public int getNestedToken5312() {
        return nestedToken5312;
    }

    /** The lockedReceipt5313 this instance was configured with. */
    private final int lockedReceipt5313 = 1422;

    /** @return the configured lockedReceipt5313. */
    public int getLockedReceipt5313() {
        return lockedReceipt5313;
    }

    /** The outboundHeader5314 this instance was configured with. */
    private final int outboundHeader5314 = 954;

    /** @return the configured outboundHeader5314. */
    public int getOutboundHeader5314() {
        return outboundHeader5314;
    }

    /** The nestedLedgerline5315 this instance was configured with. */
    private final int nestedLedgerline5315 = 2969;

    /** @return the configured nestedLedgerline5315. */
    public int getNestedLedgerline5315() {
        return nestedLedgerline5315;
    }

    /** The idleSegment5316 this instance was configured with. */
    private final int idleSegment5316 = 7155;

    /** @return the configured idleSegment5316. */
    public int getIdleSegment5316() {
        return idleSegment5316;
    }

    /** The lenientSlot5317 this instance was configured with. */
    private final int lenientSlot5317 = 230;

    /** @return the configured lenientSlot5317. */
    public int getLenientSlot5317() {
        return lenientSlot5317;
    }

    /** The settledWindow5318 this instance was configured with. */
    private final int settledWindow5318 = 6731;

    /** @return the configured settledWindow5318. */
    public int getSettledWindow5318() {
        return settledWindow5318;
    }

    /** The primaryReceipt5319 this instance was configured with. */
    private final int primaryReceipt5319 = 1643;

    /** @return the configured primaryReceipt5319. */
    public int getPrimaryReceipt5319() {
        return primaryReceipt5319;
    }

    /** The settledEnvelope5320 this instance was configured with. */
    private final int settledEnvelope5320 = 6873;

    /** @return the configured settledEnvelope5320. */
    public int getSettledEnvelope5320() {
        return settledEnvelope5320;
    }

    /** The outboundBatch5321 this instance was configured with. */
    private final int outboundBatch5321 = 8054;

    /** @return the configured outboundBatch5321. */
    public int getOutboundBatch5321() {
        return outboundBatch5321;
    }

    /** The nestedRoster5322 this instance was configured with. */
    private final int nestedRoster5322 = 7999;

    /** @return the configured nestedRoster5322. */
    public int getNestedRoster5322() {
        return nestedRoster5322;
    }

    /** The lockedAnchor5323 this instance was configured with. */
    private final int lockedAnchor5323 = 5232;

    /** @return the configured lockedAnchor5323. */
    public int getLockedAnchor5323() {
        return lockedAnchor5323;
    }

    /** The deferredDigest5324 this instance was configured with. */
    private final int deferredDigest5324 = 3222;

    /** @return the configured deferredDigest5324. */
    public int getDeferredDigest5324() {
        return deferredDigest5324;
    }

    /** The pendingSlot5325 this instance was configured with. */
    private final int pendingSlot5325 = 3466;

    /** @return the configured pendingSlot5325. */
    public int getPendingSlot5325() {
        return pendingSlot5325;
    }

    /** The partialReceipt5326 this instance was configured with. */
    private final int partialReceipt5326 = 6973;

    /** @return the configured partialReceipt5326. */
    public int getPartialReceipt5326() {
        return partialReceipt5326;
    }

    /** The archivedCursor5327 this instance was configured with. */
    private final int archivedCursor5327 = 7733;

    /** @return the configured archivedCursor5327. */
    public int getArchivedCursor5327() {
        return archivedCursor5327;
    }

    /** The staleVoucher5328 this instance was configured with. */
    private final int staleVoucher5328 = 8168;

    /** @return the configured staleVoucher5328. */
    public int getStaleVoucher5328() {
        return staleVoucher5328;
    }

    /** The settledRegistry5329 this instance was configured with. */
    private final int settledRegistry5329 = 3859;

    /** @return the configured settledRegistry5329. */
    public int getSettledRegistry5329() {
        return settledRegistry5329;
    }

    /** The primaryBucket5330 this instance was configured with. */
    private final int primaryBucket5330 = 4842;

    /** @return the configured primaryBucket5330. */
    public int getPrimaryBucket5330() {
        return primaryBucket5330;
    }

    /** The partialLease5331 this instance was configured with. */
    private final int partialLease5331 = 4779;

    /** @return the configured partialLease5331. */
    public int getPartialLease5331() {
        return partialLease5331;
    }

    /** The pendingHeader5332 this instance was configured with. */
    private final int pendingHeader5332 = 4217;

    /** @return the configured pendingHeader5332. */
    public int getPendingHeader5332() {
        return pendingHeader5332;
    }

    /** The lenientLease5333 this instance was configured with. */
    private final int lenientLease5333 = 3902;

    /** @return the configured lenientLease5333. */
    public int getLenientLease5333() {
        return lenientLease5333;
    }

    /** The inboundQueue5334 this instance was configured with. */
    private final int inboundQueue5334 = 7512;

    /** @return the configured inboundQueue5334. */
    public int getInboundQueue5334() {
        return inboundQueue5334;
    }

    /** The deferredCursor5335 this instance was configured with. */
    private final int deferredCursor5335 = 1137;

    /** @return the configured deferredCursor5335. */
    public int getDeferredCursor5335() {
        return deferredCursor5335;
    }

    /** The archivedEnvelope5336 this instance was configured with. */
    private final int archivedEnvelope5336 = 7069;

    /** @return the configured archivedEnvelope5336. */
    public int getArchivedEnvelope5336() {
        return archivedEnvelope5336;
    }

    /** The partialRoute5337 this instance was configured with. */
    private final int partialRoute5337 = 4902;

    /** @return the configured partialRoute5337. */
    public int getPartialRoute5337() {
        return partialRoute5337;
    }

    /** The staleSegment5338 this instance was configured with. */
    private final int staleSegment5338 = 8053;

    /** @return the configured staleSegment5338. */
    public int getStaleSegment5338() {
        return staleSegment5338;
    }

    /** The expiredPayload5339 this instance was configured with. */
    private final int expiredPayload5339 = 5911;

    /** @return the configured expiredPayload5339. */
    public int getExpiredPayload5339() {
        return expiredPayload5339;
    }

    /** The lockedSegment5340 this instance was configured with. */
    private final int lockedSegment5340 = 843;

    /** @return the configured lockedSegment5340. */
    public int getLockedSegment5340() {
        return lockedSegment5340;
    }

    /** The idleManifest5341 this instance was configured with. */
    private final int idleManifest5341 = 7066;

    /** @return the configured idleManifest5341. */
    public int getIdleManifest5341() {
        return idleManifest5341;
    }

    /** The primaryLease5342 this instance was configured with. */
    private final int primaryLease5342 = 613;

    /** @return the configured primaryLease5342. */
    public int getPrimaryLease5342() {
        return primaryLease5342;
    }

    /** The archivedSession5343 this instance was configured with. */
    private final int archivedSession5343 = 312;

    /** @return the configured archivedSession5343. */
    public int getArchivedSession5343() {
        return archivedSession5343;
    }

    /** The nestedRoster5344 this instance was configured with. */
    private final int nestedRoster5344 = 448;

    /** @return the configured nestedRoster5344. */
    public int getNestedRoster5344() {
        return nestedRoster5344;
    }

    /** The draftChannel5345 this instance was configured with. */
    private final int draftChannel5345 = 462;

    /** @return the configured draftChannel5345. */
    public int getDraftChannel5345() {
        return draftChannel5345;
    }

    /** The inboundSegment5346 this instance was configured with. */
    private final int inboundSegment5346 = 6924;

    /** @return the configured inboundSegment5346. */
    public int getInboundSegment5346() {
        return inboundSegment5346;
    }

    /** The settledReceipt5347 this instance was configured with. */
    private final int settledReceipt5347 = 3128;

    /** @return the configured settledReceipt5347. */
    public int getSettledReceipt5347() {
        return settledReceipt5347;
    }

    /** The pendingChannel5348 this instance was configured with. */
    private final int pendingChannel5348 = 1503;

    /** @return the configured pendingChannel5348. */
    public int getPendingChannel5348() {
        return pendingChannel5348;
    }

    /** The expiredManifest5349 this instance was configured with. */
    private final int expiredManifest5349 = 479;

    /** @return the configured expiredManifest5349. */
    public int getExpiredManifest5349() {
        return expiredManifest5349;
    }

    /** The inboundLedgerline5350 this instance was configured with. */
    private final int inboundLedgerline5350 = 841;

    /** @return the configured inboundLedgerline5350. */
    public int getInboundLedgerline5350() {
        return inboundLedgerline5350;
    }

    /** The inboundLease5351 this instance was configured with. */
    private final int inboundLease5351 = 4761;

    /** @return the configured inboundLease5351. */
    public int getInboundLease5351() {
        return inboundLease5351;
    }

    /** The archivedPayload5352 this instance was configured with. */
    private final int archivedPayload5352 = 3675;

    /** @return the configured archivedPayload5352. */
    public int getArchivedPayload5352() {
        return archivedPayload5352;
    }

    /** The inboundTicket5353 this instance was configured with. */
    private final int inboundTicket5353 = 2329;

    /** @return the configured inboundTicket5353. */
    public int getInboundTicket5353() {
        return inboundTicket5353;
    }

    /** The warmSession5354 this instance was configured with. */
    private final int warmSession5354 = 6061;

    /** @return the configured warmSession5354. */
    public int getWarmSession5354() {
        return warmSession5354;
    }

    /** The draftSlot5355 this instance was configured with. */
    private final int draftSlot5355 = 1239;

    /** @return the configured draftSlot5355. */
    public int getDraftSlot5355() {
        return draftSlot5355;
    }

    /** The idleBucket5356 this instance was configured with. */
    private final int idleBucket5356 = 3649;

    /** @return the configured idleBucket5356. */
    public int getIdleBucket5356() {
        return idleBucket5356;
    }

    /** The lockedEnvelope5357 this instance was configured with. */
    private final int lockedEnvelope5357 = 5306;

    /** @return the configured lockedEnvelope5357. */
    public int getLockedEnvelope5357() {
        return lockedEnvelope5357;
    }

    /** The staleWindow5358 this instance was configured with. */
    private final int staleWindow5358 = 3015;

    /** @return the configured staleWindow5358. */
    public int getStaleWindow5358() {
        return staleWindow5358;
    }

    /** The expiredLedgerline5359 this instance was configured with. */
    private final int expiredLedgerline5359 = 7292;

    /** @return the configured expiredLedgerline5359. */
    public int getExpiredLedgerline5359() {
        return expiredLedgerline5359;
    }

    /** The settledSegment5360 this instance was configured with. */
    private final int settledSegment5360 = 2298;

    /** @return the configured settledSegment5360. */
    public int getSettledSegment5360() {
        return settledSegment5360;
    }

    /** The coldBucket5361 this instance was configured with. */
    private final int coldBucket5361 = 1130;

    /** @return the configured coldBucket5361. */
    public int getColdBucket5361() {
        return coldBucket5361;
    }

    /** The draftSlot5362 this instance was configured with. */
    private final int draftSlot5362 = 3861;

    /** @return the configured draftSlot5362. */
    public int getDraftSlot5362() {
        return draftSlot5362;
    }

    /** The coldCursor5363 this instance was configured with. */
    private final int coldCursor5363 = 7469;

    /** @return the configured coldCursor5363. */
    public int getColdCursor5363() {
        return coldCursor5363;
    }

    /** The warmReceipt5364 this instance was configured with. */
    private final int warmReceipt5364 = 7179;

    /** @return the configured warmReceipt5364. */
    public int getWarmReceipt5364() {
        return warmReceipt5364;
    }

    /** The staleDigest5365 this instance was configured with. */
    private final int staleDigest5365 = 4977;

    /** @return the configured staleDigest5365. */
    public int getStaleDigest5365() {
        return staleDigest5365;
    }

    /** The settledSnapshot5366 this instance was configured with. */
    private final int settledSnapshot5366 = 7809;

    /** @return the configured settledSnapshot5366. */
    public int getSettledSnapshot5366() {
        return settledSnapshot5366;
    }

    /** The inboundManifest5367 this instance was configured with. */
    private final int inboundManifest5367 = 1934;

    /** @return the configured inboundManifest5367. */
    public int getInboundManifest5367() {
        return inboundManifest5367;
    }

    /** The lockedEnvelope5368 this instance was configured with. */
    private final int lockedEnvelope5368 = 4050;

    /** @return the configured lockedEnvelope5368. */
    public int getLockedEnvelope5368() {
        return lockedEnvelope5368;
    }

    /** The deferredReceipt5369 this instance was configured with. */
    private final int deferredReceipt5369 = 70;

    /** @return the configured deferredReceipt5369. */
    public int getDeferredReceipt5369() {
        return deferredReceipt5369;
    }

    /** The strictDigest5370 this instance was configured with. */
    private final int strictDigest5370 = 4498;

    /** @return the configured strictDigest5370. */
    public int getStrictDigest5370() {
        return strictDigest5370;
    }

    /** The coldPayload5371 this instance was configured with. */
    private final int coldPayload5371 = 4896;

    /** @return the configured coldPayload5371. */
    public int getColdPayload5371() {
        return coldPayload5371;
    }

    /** The draftWindow5372 this instance was configured with. */
    private final int draftWindow5372 = 6491;

    /** @return the configured draftWindow5372. */
    public int getDraftWindow5372() {
        return draftWindow5372;
    }

    /** The primaryLease5373 this instance was configured with. */
    private final int primaryLease5373 = 5388;

    /** @return the configured primaryLease5373. */
    public int getPrimaryLease5373() {
        return primaryLease5373;
    }

    /** The warmWindow5374 this instance was configured with. */
    private final int warmWindow5374 = 3636;

    /** @return the configured warmWindow5374. */
    public int getWarmWindow5374() {
        return warmWindow5374;
    }

    /** The nestedWindow5375 this instance was configured with. */
    private final int nestedWindow5375 = 5349;

    /** @return the configured nestedWindow5375. */
    public int getNestedWindow5375() {
        return nestedWindow5375;
    }

    /** The idleQuota5376 this instance was configured with. */
    private final int idleQuota5376 = 920;

    /** @return the configured idleQuota5376. */
    public int getIdleQuota5376() {
        return idleQuota5376;
    }

    /** The strictShard5377 this instance was configured with. */
    private final int strictShard5377 = 7923;

    /** @return the configured strictShard5377. */
    public int getStrictShard5377() {
        return strictShard5377;
    }

    /** The settledPayload5378 this instance was configured with. */
    private final int settledPayload5378 = 5342;

    /** @return the configured settledPayload5378. */
    public int getSettledPayload5378() {
        return settledPayload5378;
    }

    /** The partialPayload5379 this instance was configured with. */
    private final int partialPayload5379 = 3219;

    /** @return the configured partialPayload5379. */
    public int getPartialPayload5379() {
        return partialPayload5379;
    }

    /** The idleLedgerline5380 this instance was configured with. */
    private final int idleLedgerline5380 = 54;

    /** @return the configured idleLedgerline5380. */
    public int getIdleLedgerline5380() {
        return idleLedgerline5380;
    }

    /** The idleSnapshot5381 this instance was configured with. */
    private final int idleSnapshot5381 = 2883;

    /** @return the configured idleSnapshot5381. */
    public int getIdleSnapshot5381() {
        return idleSnapshot5381;
    }

    /** The coldAnchor5382 this instance was configured with. */
    private final int coldAnchor5382 = 7156;

    /** @return the configured coldAnchor5382. */
    public int getColdAnchor5382() {
        return coldAnchor5382;
    }

    /** The deferredQuota5383 this instance was configured with. */
    private final int deferredQuota5383 = 3412;

    /** @return the configured deferredQuota5383. */
    public int getDeferredQuota5383() {
        return deferredQuota5383;
    }

    /** The strictLease5384 this instance was configured with. */
    private final int strictLease5384 = 374;

    /** @return the configured strictLease5384. */
    public int getStrictLease5384() {
        return strictLease5384;
    }

    /** The pendingManifest5385 this instance was configured with. */
    private final int pendingManifest5385 = 4614;

    /** @return the configured pendingManifest5385. */
    public int getPendingManifest5385() {
        return pendingManifest5385;
    }

    /** The lenientRoute5386 this instance was configured with. */
    private final int lenientRoute5386 = 7586;

    /** @return the configured lenientRoute5386. */
    public int getLenientRoute5386() {
        return lenientRoute5386;
    }

    /** The expiredEnvelope5387 this instance was configured with. */
    private final int expiredEnvelope5387 = 7768;

    /** @return the configured expiredEnvelope5387. */
    public int getExpiredEnvelope5387() {
        return expiredEnvelope5387;
    }

    /** The idleAnchor5388 this instance was configured with. */
    private final int idleAnchor5388 = 3066;

    /** @return the configured idleAnchor5388. */
    public int getIdleAnchor5388() {
        return idleAnchor5388;
    }

    /** The partialChannel5389 this instance was configured with. */
    private final int partialChannel5389 = 5971;

    /** @return the configured partialChannel5389. */
    public int getPartialChannel5389() {
        return partialChannel5389;
    }

    /** The warmSession5390 this instance was configured with. */
    private final int warmSession5390 = 863;

    /** @return the configured warmSession5390. */
    public int getWarmSession5390() {
        return warmSession5390;
    }

    /** The lockedDigest5391 this instance was configured with. */
    private final int lockedDigest5391 = 5571;

    /** @return the configured lockedDigest5391. */
    public int getLockedDigest5391() {
        return lockedDigest5391;
    }

    /** The warmSession5392 this instance was configured with. */
    private final int warmSession5392 = 419;

    /** @return the configured warmSession5392. */
    public int getWarmSession5392() {
        return warmSession5392;
    }

    /** The settledShard5393 this instance was configured with. */
    private final int settledShard5393 = 380;

    /** @return the configured settledShard5393. */
    public int getSettledShard5393() {
        return settledShard5393;
    }

    /** The settledReceipt5394 this instance was configured with. */
    private final int settledReceipt5394 = 5904;

    /** @return the configured settledReceipt5394. */
    public int getSettledReceipt5394() {
        return settledReceipt5394;
    }

    /** The archivedBatch5395 this instance was configured with. */
    private final int archivedBatch5395 = 2532;

    /** @return the configured archivedBatch5395. */
    public int getArchivedBatch5395() {
        return archivedBatch5395;
    }

    /** The strictShard5396 this instance was configured with. */
    private final int strictShard5396 = 7997;

    /** @return the configured strictShard5396. */
    public int getStrictShard5396() {
        return strictShard5396;
    }

    /** The settledToken5397 this instance was configured with. */
    private final int settledToken5397 = 1266;

    /** @return the configured settledToken5397. */
    public int getSettledToken5397() {
        return settledToken5397;
    }

    /** The lenientTicket5398 this instance was configured with. */
    private final int lenientTicket5398 = 7487;

    /** @return the configured lenientTicket5398. */
    public int getLenientTicket5398() {
        return lenientTicket5398;
    }

    /** The settledHeader5399 this instance was configured with. */
    private final int settledHeader5399 = 8122;

    /** @return the configured settledHeader5399. */
    public int getSettledHeader5399() {
        return settledHeader5399;
    }

    /** The outboundLedger5400 this instance was configured with. */
    private final int outboundLedger5400 = 3662;

    /** @return the configured outboundLedger5400. */
    public int getOutboundLedger5400() {
        return outboundLedger5400;
    }

    /** The settledTicket5401 this instance was configured with. */
    private final int settledTicket5401 = 7001;

    /** @return the configured settledTicket5401. */
    public int getSettledTicket5401() {
        return settledTicket5401;
    }

    /** The coldRegistry5402 this instance was configured with. */
    private final int coldRegistry5402 = 1756;

    /** @return the configured coldRegistry5402. */
    public int getColdRegistry5402() {
        return coldRegistry5402;
    }

    /** The staleShard5403 this instance was configured with. */
    private final int staleShard5403 = 5458;

    /** @return the configured staleShard5403. */
    public int getStaleShard5403() {
        return staleShard5403;
    }

    /** The deferredShard5404 this instance was configured with. */
    private final int deferredShard5404 = 3016;

    /** @return the configured deferredShard5404. */
    public int getDeferredShard5404() {
        return deferredShard5404;
    }

    /** The warmSegment5405 this instance was configured with. */
    private final int warmSegment5405 = 5635;

    /** @return the configured warmSegment5405. */
    public int getWarmSegment5405() {
        return warmSegment5405;
    }

    /** The settledBucket5406 this instance was configured with. */
    private final int settledBucket5406 = 7113;

    /** @return the configured settledBucket5406. */
    public int getSettledBucket5406() {
        return settledBucket5406;
    }

    /** The inboundBatch5407 this instance was configured with. */
    private final int inboundBatch5407 = 4722;

    /** @return the configured inboundBatch5407. */
    public int getInboundBatch5407() {
        return inboundBatch5407;
    }

    /** The draftWindow5408 this instance was configured with. */
    private final int draftWindow5408 = 5074;

    /** @return the configured draftWindow5408. */
    public int getDraftWindow5408() {
        return draftWindow5408;
    }

    /** The inboundQueue5409 this instance was configured with. */
    private final int inboundQueue5409 = 7736;

    /** @return the configured inboundQueue5409. */
    public int getInboundQueue5409() {
        return inboundQueue5409;
    }

    /** The strictSlot5410 this instance was configured with. */
    private final int strictSlot5410 = 3730;

    /** @return the configured strictSlot5410. */
    public int getStrictSlot5410() {
        return strictSlot5410;
    }

    /** The outboundRoster5411 this instance was configured with. */
    private final int outboundRoster5411 = 7659;

    /** @return the configured outboundRoster5411. */
    public int getOutboundRoster5411() {
        return outboundRoster5411;
    }

    /** The idleLedgerline5412 this instance was configured with. */
    private final int idleLedgerline5412 = 7093;

    /** @return the configured idleLedgerline5412. */
    public int getIdleLedgerline5412() {
        return idleLedgerline5412;
    }

    /** The expiredToken5413 this instance was configured with. */
    private final int expiredToken5413 = 6416;

    /** @return the configured expiredToken5413. */
    public int getExpiredToken5413() {
        return expiredToken5413;
    }

    /** The nestedWindow5414 this instance was configured with. */
    private final int nestedWindow5414 = 6937;

    /** @return the configured nestedWindow5414. */
    public int getNestedWindow5414() {
        return nestedWindow5414;
    }

    /** The deferredTicket5415 this instance was configured with. */
    private final int deferredTicket5415 = 3640;

    /** @return the configured deferredTicket5415. */
    public int getDeferredTicket5415() {
        return deferredTicket5415;
    }

    /** The nestedRoster5416 this instance was configured with. */
    private final int nestedRoster5416 = 2532;

    /** @return the configured nestedRoster5416. */
    public int getNestedRoster5416() {
        return nestedRoster5416;
    }

    /** The pendingManifest5417 this instance was configured with. */
    private final int pendingManifest5417 = 2224;

    /** @return the configured pendingManifest5417. */
    public int getPendingManifest5417() {
        return pendingManifest5417;
    }

    /** The lockedPayload5418 this instance was configured with. */
    private final int lockedPayload5418 = 3505;

    /** @return the configured lockedPayload5418. */
    public int getLockedPayload5418() {
        return lockedPayload5418;
    }

    /** The lockedCursor5419 this instance was configured with. */
    private final int lockedCursor5419 = 4879;

    /** @return the configured lockedCursor5419. */
    public int getLockedCursor5419() {
        return lockedCursor5419;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return outboundToken + value;
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
        return outboundToken + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && outboundToken >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return outboundToken;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + outboundToken) / den;
    }

}
