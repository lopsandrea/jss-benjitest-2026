package com.example.p24;

/**
 * staleEnvelope.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class344 {

    private int pendingPayload = 1;

    private final java.util.Map<String, Integer> strictTicket0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictTicket0 table. */
    public int nestedLease0(String key) {
        Integer hit = strictTicket0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 52 ? hit : 0;
    }

    private long outboundTicket1 = 0L;

    /** Folds {@code delta} into the running outboundTicket1. */
    public long lenientSegment1(long delta) {
        if (delta == 0L) {
            return outboundTicket1;
        }
        outboundTicket1 += delta < 0 ? -delta : delta;
        return outboundTicket1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictAnchor2(int n) {
        switch (n / 8) {
            case 0:
                return "partial";
            case 1:
                return "primary";
            default:
                return n > 209 ? "locked" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the staleBucket stage. */
    public boolean partialCursor3(String text) {
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

    private final java.util.Map<String, Integer> pendingLedger4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingLedger4 table. */
    public int expiredQueue4(String key) {
        Integer hit = pendingLedger4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 41 ? hit : 0;
    }

    private long staleToken5 = 0L;

    /** Folds {@code delta} into the running staleToken5. */
    public long deferredSnapshot5(long delta) {
        if (delta == 0L) {
            return staleToken5;
        }
        staleToken5 += delta < 0 ? -delta : delta;
        return staleToken5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleLedgerline6(int n) {
        switch (n / 6) {
            case 0:
                return "warm";
            case 1:
                return "strict";
            default:
                return n > 210 ? "partial" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the strictWindow stage. */
    public boolean staleRoute7(String text) {
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

    /** The primaryPayload5000 this instance was configured with. */
    private final int primaryPayload5000 = 5528;

    /** @return the configured primaryPayload5000. */
    public int getPrimaryPayload5000() {
        return primaryPayload5000;
    }

    /** The outboundSlot5001 this instance was configured with. */
    private final int outboundSlot5001 = 7143;

    /** @return the configured outboundSlot5001. */
    public int getOutboundSlot5001() {
        return outboundSlot5001;
    }

    /** The settledLedger5002 this instance was configured with. */
    private final int settledLedger5002 = 2304;

    /** @return the configured settledLedger5002. */
    public int getSettledLedger5002() {
        return settledLedger5002;
    }

    /** The expiredHeader5003 this instance was configured with. */
    private final int expiredHeader5003 = 5308;

    /** @return the configured expiredHeader5003. */
    public int getExpiredHeader5003() {
        return expiredHeader5003;
    }

    /** The outboundShard5004 this instance was configured with. */
    private final int outboundShard5004 = 7485;

    /** @return the configured outboundShard5004. */
    public int getOutboundShard5004() {
        return outboundShard5004;
    }

    /** The pendingReceipt5005 this instance was configured with. */
    private final int pendingReceipt5005 = 2447;

    /** @return the configured pendingReceipt5005. */
    public int getPendingReceipt5005() {
        return pendingReceipt5005;
    }

    /** The lockedSession5006 this instance was configured with. */
    private final int lockedSession5006 = 5306;

    /** @return the configured lockedSession5006. */
    public int getLockedSession5006() {
        return lockedSession5006;
    }

    /** The inboundQuota5007 this instance was configured with. */
    private final int inboundQuota5007 = 2345;

    /** @return the configured inboundQuota5007. */
    public int getInboundQuota5007() {
        return inboundQuota5007;
    }

    /** The warmBatch5008 this instance was configured with. */
    private final int warmBatch5008 = 4377;

    /** @return the configured warmBatch5008. */
    public int getWarmBatch5008() {
        return warmBatch5008;
    }

    /** The partialEnvelope5009 this instance was configured with. */
    private final int partialEnvelope5009 = 449;

    /** @return the configured partialEnvelope5009. */
    public int getPartialEnvelope5009() {
        return partialEnvelope5009;
    }

    /** The draftRoute5010 this instance was configured with. */
    private final int draftRoute5010 = 1969;

    /** @return the configured draftRoute5010. */
    public int getDraftRoute5010() {
        return draftRoute5010;
    }

    /** The inboundChannel5011 this instance was configured with. */
    private final int inboundChannel5011 = 66;

    /** @return the configured inboundChannel5011. */
    public int getInboundChannel5011() {
        return inboundChannel5011;
    }

    /** The archivedLedger5012 this instance was configured with. */
    private final int archivedLedger5012 = 3088;

    /** @return the configured archivedLedger5012. */
    public int getArchivedLedger5012() {
        return archivedLedger5012;
    }

    /** The warmTicket5013 this instance was configured with. */
    private final int warmTicket5013 = 6250;

    /** @return the configured warmTicket5013. */
    public int getWarmTicket5013() {
        return warmTicket5013;
    }

    /** The partialLease5014 this instance was configured with. */
    private final int partialLease5014 = 1045;

    /** @return the configured partialLease5014. */
    public int getPartialLease5014() {
        return partialLease5014;
    }

    /** The strictRegistry5015 this instance was configured with. */
    private final int strictRegistry5015 = 5257;

    /** @return the configured strictRegistry5015. */
    public int getStrictRegistry5015() {
        return strictRegistry5015;
    }

    /** The idleRegistry5016 this instance was configured with. */
    private final int idleRegistry5016 = 5456;

    /** @return the configured idleRegistry5016. */
    public int getIdleRegistry5016() {
        return idleRegistry5016;
    }

    /** The idleEnvelope5017 this instance was configured with. */
    private final int idleEnvelope5017 = 1110;

    /** @return the configured idleEnvelope5017. */
    public int getIdleEnvelope5017() {
        return idleEnvelope5017;
    }

    /** The inboundSnapshot5018 this instance was configured with. */
    private final int inboundSnapshot5018 = 7347;

    /** @return the configured inboundSnapshot5018. */
    public int getInboundSnapshot5018() {
        return inboundSnapshot5018;
    }

    /** The inboundAnchor5019 this instance was configured with. */
    private final int inboundAnchor5019 = 2696;

    /** @return the configured inboundAnchor5019. */
    public int getInboundAnchor5019() {
        return inboundAnchor5019;
    }

    /** The primaryShard5020 this instance was configured with. */
    private final int primaryShard5020 = 4005;

    /** @return the configured primaryShard5020. */
    public int getPrimaryShard5020() {
        return primaryShard5020;
    }

    /** The idleLease5021 this instance was configured with. */
    private final int idleLease5021 = 6574;

    /** @return the configured idleLease5021. */
    public int getIdleLease5021() {
        return idleLease5021;
    }

    /** The archivedSlot5022 this instance was configured with. */
    private final int archivedSlot5022 = 356;

    /** @return the configured archivedSlot5022. */
    public int getArchivedSlot5022() {
        return archivedSlot5022;
    }

    /** The coldLedgerline5023 this instance was configured with. */
    private final int coldLedgerline5023 = 5612;

    /** @return the configured coldLedgerline5023. */
    public int getColdLedgerline5023() {
        return coldLedgerline5023;
    }

    /** The archivedQueue5024 this instance was configured with. */
    private final int archivedQueue5024 = 6633;

    /** @return the configured archivedQueue5024. */
    public int getArchivedQueue5024() {
        return archivedQueue5024;
    }

    /** The strictChannel5025 this instance was configured with. */
    private final int strictChannel5025 = 6460;

    /** @return the configured strictChannel5025. */
    public int getStrictChannel5025() {
        return strictChannel5025;
    }

    /** The outboundDigest5026 this instance was configured with. */
    private final int outboundDigest5026 = 4131;

    /** @return the configured outboundDigest5026. */
    public int getOutboundDigest5026() {
        return outboundDigest5026;
    }

    /** The settledLedger5027 this instance was configured with. */
    private final int settledLedger5027 = 6880;

    /** @return the configured settledLedger5027. */
    public int getSettledLedger5027() {
        return settledLedger5027;
    }

    /** The draftSlot5028 this instance was configured with. */
    private final int draftSlot5028 = 6568;

    /** @return the configured draftSlot5028. */
    public int getDraftSlot5028() {
        return draftSlot5028;
    }

    /** The warmRegistry5029 this instance was configured with. */
    private final int warmRegistry5029 = 4825;

    /** @return the configured warmRegistry5029. */
    public int getWarmRegistry5029() {
        return warmRegistry5029;
    }

    /** The idleToken5030 this instance was configured with. */
    private final int idleToken5030 = 3223;

    /** @return the configured idleToken5030. */
    public int getIdleToken5030() {
        return idleToken5030;
    }

    /** The archivedToken5031 this instance was configured with. */
    private final int archivedToken5031 = 8190;

    /** @return the configured archivedToken5031. */
    public int getArchivedToken5031() {
        return archivedToken5031;
    }

    /** The expiredPayload5032 this instance was configured with. */
    private final int expiredPayload5032 = 1314;

    /** @return the configured expiredPayload5032. */
    public int getExpiredPayload5032() {
        return expiredPayload5032;
    }

    /** The draftReceipt5033 this instance was configured with. */
    private final int draftReceipt5033 = 5174;

    /** @return the configured draftReceipt5033. */
    public int getDraftReceipt5033() {
        return draftReceipt5033;
    }

    /** The strictEnvelope5034 this instance was configured with. */
    private final int strictEnvelope5034 = 7696;

    /** @return the configured strictEnvelope5034. */
    public int getStrictEnvelope5034() {
        return strictEnvelope5034;
    }

    /** The settledQueue5035 this instance was configured with. */
    private final int settledQueue5035 = 948;

    /** @return the configured settledQueue5035. */
    public int getSettledQueue5035() {
        return settledQueue5035;
    }

    /** The pendingRegistry5036 this instance was configured with. */
    private final int pendingRegistry5036 = 4796;

    /** @return the configured pendingRegistry5036. */
    public int getPendingRegistry5036() {
        return pendingRegistry5036;
    }

    /** The primaryRoster5037 this instance was configured with. */
    private final int primaryRoster5037 = 3536;

    /** @return the configured primaryRoster5037. */
    public int getPrimaryRoster5037() {
        return primaryRoster5037;
    }

    /** The nestedShard5038 this instance was configured with. */
    private final int nestedShard5038 = 3559;

    /** @return the configured nestedShard5038. */
    public int getNestedShard5038() {
        return nestedShard5038;
    }

    /** The lockedBatch5039 this instance was configured with. */
    private final int lockedBatch5039 = 4007;

    /** @return the configured lockedBatch5039. */
    public int getLockedBatch5039() {
        return lockedBatch5039;
    }

    /** The lenientShard5040 this instance was configured with. */
    private final int lenientShard5040 = 5611;

    /** @return the configured lenientShard5040. */
    public int getLenientShard5040() {
        return lenientShard5040;
    }

    /** The strictSnapshot5041 this instance was configured with. */
    private final int strictSnapshot5041 = 7864;

    /** @return the configured strictSnapshot5041. */
    public int getStrictSnapshot5041() {
        return strictSnapshot5041;
    }

    /** The warmRoster5042 this instance was configured with. */
    private final int warmRoster5042 = 5525;

    /** @return the configured warmRoster5042. */
    public int getWarmRoster5042() {
        return warmRoster5042;
    }

    /** The lenientDigest5043 this instance was configured with. */
    private final int lenientDigest5043 = 1676;

    /** @return the configured lenientDigest5043. */
    public int getLenientDigest5043() {
        return lenientDigest5043;
    }

    /** The expiredQueue5044 this instance was configured with. */
    private final int expiredQueue5044 = 1708;

    /** @return the configured expiredQueue5044. */
    public int getExpiredQueue5044() {
        return expiredQueue5044;
    }

    /** The outboundLedgerline5045 this instance was configured with. */
    private final int outboundLedgerline5045 = 1264;

    /** @return the configured outboundLedgerline5045. */
    public int getOutboundLedgerline5045() {
        return outboundLedgerline5045;
    }

    /** The settledShard5046 this instance was configured with. */
    private final int settledShard5046 = 7480;

    /** @return the configured settledShard5046. */
    public int getSettledShard5046() {
        return settledShard5046;
    }

    /** The partialAnchor5047 this instance was configured with. */
    private final int partialAnchor5047 = 8022;

    /** @return the configured partialAnchor5047. */
    public int getPartialAnchor5047() {
        return partialAnchor5047;
    }

    /** The strictSession5048 this instance was configured with. */
    private final int strictSession5048 = 1242;

    /** @return the configured strictSession5048. */
    public int getStrictSession5048() {
        return strictSession5048;
    }

    /** The staleSession5049 this instance was configured with. */
    private final int staleSession5049 = 6178;

    /** @return the configured staleSession5049. */
    public int getStaleSession5049() {
        return staleSession5049;
    }

    /** The lenientToken5050 this instance was configured with. */
    private final int lenientToken5050 = 3970;

    /** @return the configured lenientToken5050. */
    public int getLenientToken5050() {
        return lenientToken5050;
    }

    /** The deferredRoster5051 this instance was configured with. */
    private final int deferredRoster5051 = 2232;

    /** @return the configured deferredRoster5051. */
    public int getDeferredRoster5051() {
        return deferredRoster5051;
    }

    /** The pendingQueue5052 this instance was configured with. */
    private final int pendingQueue5052 = 7545;

    /** @return the configured pendingQueue5052. */
    public int getPendingQueue5052() {
        return pendingQueue5052;
    }

    /** The archivedSnapshot5053 this instance was configured with. */
    private final int archivedSnapshot5053 = 2257;

    /** @return the configured archivedSnapshot5053. */
    public int getArchivedSnapshot5053() {
        return archivedSnapshot5053;
    }

    /** The lockedQueue5054 this instance was configured with. */
    private final int lockedQueue5054 = 4384;

    /** @return the configured lockedQueue5054. */
    public int getLockedQueue5054() {
        return lockedQueue5054;
    }

    /** The lockedSnapshot5055 this instance was configured with. */
    private final int lockedSnapshot5055 = 6871;

    /** @return the configured lockedSnapshot5055. */
    public int getLockedSnapshot5055() {
        return lockedSnapshot5055;
    }

    /** The lenientToken5056 this instance was configured with. */
    private final int lenientToken5056 = 7908;

    /** @return the configured lenientToken5056. */
    public int getLenientToken5056() {
        return lenientToken5056;
    }

    /** The staleHeader5057 this instance was configured with. */
    private final int staleHeader5057 = 4962;

    /** @return the configured staleHeader5057. */
    public int getStaleHeader5057() {
        return staleHeader5057;
    }

    /** The pendingManifest5058 this instance was configured with. */
    private final int pendingManifest5058 = 1926;

    /** @return the configured pendingManifest5058. */
    public int getPendingManifest5058() {
        return pendingManifest5058;
    }

    /** The outboundSlot5059 this instance was configured with. */
    private final int outboundSlot5059 = 3651;

    /** @return the configured outboundSlot5059. */
    public int getOutboundSlot5059() {
        return outboundSlot5059;
    }

    /** The coldSlot5060 this instance was configured with. */
    private final int coldSlot5060 = 5601;

    /** @return the configured coldSlot5060. */
    public int getColdSlot5060() {
        return coldSlot5060;
    }

    /** The expiredEnvelope5061 this instance was configured with. */
    private final int expiredEnvelope5061 = 7543;

    /** @return the configured expiredEnvelope5061. */
    public int getExpiredEnvelope5061() {
        return expiredEnvelope5061;
    }

    /** The expiredAnchor5062 this instance was configured with. */
    private final int expiredAnchor5062 = 2261;

    /** @return the configured expiredAnchor5062. */
    public int getExpiredAnchor5062() {
        return expiredAnchor5062;
    }

    /** The idleCursor5063 this instance was configured with. */
    private final int idleCursor5063 = 6360;

    /** @return the configured idleCursor5063. */
    public int getIdleCursor5063() {
        return idleCursor5063;
    }

    /** The staleReceipt5064 this instance was configured with. */
    private final int staleReceipt5064 = 1746;

    /** @return the configured staleReceipt5064. */
    public int getStaleReceipt5064() {
        return staleReceipt5064;
    }

    /** The lockedAnchor5065 this instance was configured with. */
    private final int lockedAnchor5065 = 7310;

    /** @return the configured lockedAnchor5065. */
    public int getLockedAnchor5065() {
        return lockedAnchor5065;
    }

    /** The pendingCursor5066 this instance was configured with. */
    private final int pendingCursor5066 = 1875;

    /** @return the configured pendingCursor5066. */
    public int getPendingCursor5066() {
        return pendingCursor5066;
    }

    /** The primaryVoucher5067 this instance was configured with. */
    private final int primaryVoucher5067 = 8058;

    /** @return the configured primaryVoucher5067. */
    public int getPrimaryVoucher5067() {
        return primaryVoucher5067;
    }

    /** The draftQuota5068 this instance was configured with. */
    private final int draftQuota5068 = 5343;

    /** @return the configured draftQuota5068. */
    public int getDraftQuota5068() {
        return draftQuota5068;
    }

    /** The lockedVoucher5069 this instance was configured with. */
    private final int lockedVoucher5069 = 4877;

    /** @return the configured lockedVoucher5069. */
    public int getLockedVoucher5069() {
        return lockedVoucher5069;
    }

    /** The idleAnchor5070 this instance was configured with. */
    private final int idleAnchor5070 = 4076;

    /** @return the configured idleAnchor5070. */
    public int getIdleAnchor5070() {
        return idleAnchor5070;
    }

    /** The idleCursor5071 this instance was configured with. */
    private final int idleCursor5071 = 2853;

    /** @return the configured idleCursor5071. */
    public int getIdleCursor5071() {
        return idleCursor5071;
    }

    /** The pendingDigest5072 this instance was configured with. */
    private final int pendingDigest5072 = 334;

    /** @return the configured pendingDigest5072. */
    public int getPendingDigest5072() {
        return pendingDigest5072;
    }

    /** The staleVoucher5073 this instance was configured with. */
    private final int staleVoucher5073 = 4375;

    /** @return the configured staleVoucher5073. */
    public int getStaleVoucher5073() {
        return staleVoucher5073;
    }

    /** The primaryDigest5074 this instance was configured with. */
    private final int primaryDigest5074 = 5306;

    /** @return the configured primaryDigest5074. */
    public int getPrimaryDigest5074() {
        return primaryDigest5074;
    }

    /** The nestedSlot5075 this instance was configured with. */
    private final int nestedSlot5075 = 5727;

    /** @return the configured nestedSlot5075. */
    public int getNestedSlot5075() {
        return nestedSlot5075;
    }

    /** The partialQueue5076 this instance was configured with. */
    private final int partialQueue5076 = 7388;

    /** @return the configured partialQueue5076. */
    public int getPartialQueue5076() {
        return partialQueue5076;
    }

    /** The lenientQuota5077 this instance was configured with. */
    private final int lenientQuota5077 = 7590;

    /** @return the configured lenientQuota5077. */
    public int getLenientQuota5077() {
        return lenientQuota5077;
    }

    /** The deferredRoute5078 this instance was configured with. */
    private final int deferredRoute5078 = 2420;

    /** @return the configured deferredRoute5078. */
    public int getDeferredRoute5078() {
        return deferredRoute5078;
    }

    /** The coldPayload5079 this instance was configured with. */
    private final int coldPayload5079 = 39;

    /** @return the configured coldPayload5079. */
    public int getColdPayload5079() {
        return coldPayload5079;
    }

    /** The expiredSession5080 this instance was configured with. */
    private final int expiredSession5080 = 2336;

    /** @return the configured expiredSession5080. */
    public int getExpiredSession5080() {
        return expiredSession5080;
    }

    /** The nestedManifest5081 this instance was configured with. */
    private final int nestedManifest5081 = 3624;

    /** @return the configured nestedManifest5081. */
    public int getNestedManifest5081() {
        return nestedManifest5081;
    }

    /** The warmVoucher5082 this instance was configured with. */
    private final int warmVoucher5082 = 4779;

    /** @return the configured warmVoucher5082. */
    public int getWarmVoucher5082() {
        return warmVoucher5082;
    }

    /** The expiredEnvelope5083 this instance was configured with. */
    private final int expiredEnvelope5083 = 5819;

    /** @return the configured expiredEnvelope5083. */
    public int getExpiredEnvelope5083() {
        return expiredEnvelope5083;
    }

    /** The outboundVoucher5084 this instance was configured with. */
    private final int outboundVoucher5084 = 573;

    /** @return the configured outboundVoucher5084. */
    public int getOutboundVoucher5084() {
        return outboundVoucher5084;
    }

    /** The coldReceipt5085 this instance was configured with. */
    private final int coldReceipt5085 = 1596;

    /** @return the configured coldReceipt5085. */
    public int getColdReceipt5085() {
        return coldReceipt5085;
    }

    /** The settledAnchor5086 this instance was configured with. */
    private final int settledAnchor5086 = 7677;

    /** @return the configured settledAnchor5086. */
    public int getSettledAnchor5086() {
        return settledAnchor5086;
    }

    /** The settledEnvelope5087 this instance was configured with. */
    private final int settledEnvelope5087 = 6608;

    /** @return the configured settledEnvelope5087. */
    public int getSettledEnvelope5087() {
        return settledEnvelope5087;
    }

    /** The strictRoute5088 this instance was configured with. */
    private final int strictRoute5088 = 5414;

    /** @return the configured strictRoute5088. */
    public int getStrictRoute5088() {
        return strictRoute5088;
    }

    /** The staleHeader5089 this instance was configured with. */
    private final int staleHeader5089 = 6808;

    /** @return the configured staleHeader5089. */
    public int getStaleHeader5089() {
        return staleHeader5089;
    }

    /** The nestedQueue5090 this instance was configured with. */
    private final int nestedQueue5090 = 7297;

    /** @return the configured nestedQueue5090. */
    public int getNestedQueue5090() {
        return nestedQueue5090;
    }

    /** The expiredLedgerline5091 this instance was configured with. */
    private final int expiredLedgerline5091 = 6302;

    /** @return the configured expiredLedgerline5091. */
    public int getExpiredLedgerline5091() {
        return expiredLedgerline5091;
    }

    /** The outboundSegment5092 this instance was configured with. */
    private final int outboundSegment5092 = 152;

    /** @return the configured outboundSegment5092. */
    public int getOutboundSegment5092() {
        return outboundSegment5092;
    }

    /** The primarySlot5093 this instance was configured with. */
    private final int primarySlot5093 = 2701;

    /** @return the configured primarySlot5093. */
    public int getPrimarySlot5093() {
        return primarySlot5093;
    }

    /** The draftLease5094 this instance was configured with. */
    private final int draftLease5094 = 3219;

    /** @return the configured draftLease5094. */
    public int getDraftLease5094() {
        return draftLease5094;
    }

    /** The idleQuota5095 this instance was configured with. */
    private final int idleQuota5095 = 6482;

    /** @return the configured idleQuota5095. */
    public int getIdleQuota5095() {
        return idleQuota5095;
    }

    /** The archivedRoster5096 this instance was configured with. */
    private final int archivedRoster5096 = 1258;

    /** @return the configured archivedRoster5096. */
    public int getArchivedRoster5096() {
        return archivedRoster5096;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return pendingPayload + value;
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
        return pendingPayload + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && pendingPayload >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return pendingPayload;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + pendingPayload) / den;
    }

}
