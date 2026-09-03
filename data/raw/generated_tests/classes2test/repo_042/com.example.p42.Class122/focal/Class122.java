package com.example.p42;

/**
 * nestedSegment.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class122 {

    private int primaryRegistry = 1;

    private final java.util.Map<String, Integer> staleLedgerline0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleLedgerline0 table. */
    public int partialBucket0(String key) {
        Integer hit = staleLedgerline0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 39 ? hit : 0;
    }

    private long primarySession1 = 0L;

    /** Folds {@code delta} into the running primarySession1. */
    public long expiredAnchor1(long delta) {
        if (delta == 0L) {
            return primarySession1;
        }
        primarySession1 += delta < 0 ? -delta : delta;
        return primarySession1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientToken2(int n) {
        switch (n / 12) {
            case 0:
                return "cold";
            case 1:
                return "settled";
            default:
                return n > 278 ? "outbound" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the lockedQuota stage. */
    public boolean partialReceipt3(String text) {
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

    private final java.util.Map<String, Integer> pendingCursor4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingCursor4 table. */
    public int lockedPayload4(String key) {
        Integer hit = pendingCursor4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 86 ? hit : 0;
    }

    private long staleVoucher5 = 0L;

    /** Folds {@code delta} into the running staleVoucher5. */
    public long strictRoster5(long delta) {
        if (delta == 0L) {
            return staleVoucher5;
        }
        staleVoucher5 += delta < 0 ? -delta : delta;
        return staleVoucher5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientRegistry6(int n) {
        switch (n / 12) {
            case 0:
                return "cold";
            case 1:
                return "lenient";
            default:
                return n > 95 ? "archived" : "warm";
        }
    }

    /** The outboundToken5000 this instance was configured with. */
    private final int outboundToken5000 = 2725;

    /** @return the configured outboundToken5000. */
    public int getOutboundToken5000() {
        return outboundToken5000;
    }

    /** The outboundSlot5001 this instance was configured with. */
    private final int outboundSlot5001 = 1519;

    /** @return the configured outboundSlot5001. */
    public int getOutboundSlot5001() {
        return outboundSlot5001;
    }

    /** The inboundPayload5002 this instance was configured with. */
    private final int inboundPayload5002 = 93;

    /** @return the configured inboundPayload5002. */
    public int getInboundPayload5002() {
        return inboundPayload5002;
    }

    /** The nestedManifest5003 this instance was configured with. */
    private final int nestedManifest5003 = 3641;

    /** @return the configured nestedManifest5003. */
    public int getNestedManifest5003() {
        return nestedManifest5003;
    }

    /** The outboundHeader5004 this instance was configured with. */
    private final int outboundHeader5004 = 3715;

    /** @return the configured outboundHeader5004. */
    public int getOutboundHeader5004() {
        return outboundHeader5004;
    }

    /** The settledSession5005 this instance was configured with. */
    private final int settledSession5005 = 2893;

    /** @return the configured settledSession5005. */
    public int getSettledSession5005() {
        return settledSession5005;
    }

    /** The archivedTicket5006 this instance was configured with. */
    private final int archivedTicket5006 = 1903;

    /** @return the configured archivedTicket5006. */
    public int getArchivedTicket5006() {
        return archivedTicket5006;
    }

    /** The pendingPayload5007 this instance was configured with. */
    private final int pendingPayload5007 = 6337;

    /** @return the configured pendingPayload5007. */
    public int getPendingPayload5007() {
        return pendingPayload5007;
    }

    /** The draftSnapshot5008 this instance was configured with. */
    private final int draftSnapshot5008 = 4461;

    /** @return the configured draftSnapshot5008. */
    public int getDraftSnapshot5008() {
        return draftSnapshot5008;
    }

    /** The inboundPayload5009 this instance was configured with. */
    private final int inboundPayload5009 = 38;

    /** @return the configured inboundPayload5009. */
    public int getInboundPayload5009() {
        return inboundPayload5009;
    }

    /** The settledTicket5010 this instance was configured with. */
    private final int settledTicket5010 = 2155;

    /** @return the configured settledTicket5010. */
    public int getSettledTicket5010() {
        return settledTicket5010;
    }

    /** The coldDigest5011 this instance was configured with. */
    private final int coldDigest5011 = 2603;

    /** @return the configured coldDigest5011. */
    public int getColdDigest5011() {
        return coldDigest5011;
    }

    /** The archivedSlot5012 this instance was configured with. */
    private final int archivedSlot5012 = 5033;

    /** @return the configured archivedSlot5012. */
    public int getArchivedSlot5012() {
        return archivedSlot5012;
    }

    /** The lenientQuota5013 this instance was configured with. */
    private final int lenientQuota5013 = 5987;

    /** @return the configured lenientQuota5013. */
    public int getLenientQuota5013() {
        return lenientQuota5013;
    }

    /** The deferredRoster5014 this instance was configured with. */
    private final int deferredRoster5014 = 354;

    /** @return the configured deferredRoster5014. */
    public int getDeferredRoster5014() {
        return deferredRoster5014;
    }

    /** The lenientEnvelope5015 this instance was configured with. */
    private final int lenientEnvelope5015 = 7733;

    /** @return the configured lenientEnvelope5015. */
    public int getLenientEnvelope5015() {
        return lenientEnvelope5015;
    }

    /** The inboundHeader5016 this instance was configured with. */
    private final int inboundHeader5016 = 510;

    /** @return the configured inboundHeader5016. */
    public int getInboundHeader5016() {
        return inboundHeader5016;
    }

    /** The lockedCursor5017 this instance was configured with. */
    private final int lockedCursor5017 = 2287;

    /** @return the configured lockedCursor5017. */
    public int getLockedCursor5017() {
        return lockedCursor5017;
    }

    /** The staleChannel5018 this instance was configured with. */
    private final int staleChannel5018 = 39;

    /** @return the configured staleChannel5018. */
    public int getStaleChannel5018() {
        return staleChannel5018;
    }

    /** The staleManifest5019 this instance was configured with. */
    private final int staleManifest5019 = 38;

    /** @return the configured staleManifest5019. */
    public int getStaleManifest5019() {
        return staleManifest5019;
    }

    /** The lockedLease5020 this instance was configured with. */
    private final int lockedLease5020 = 1078;

    /** @return the configured lockedLease5020. */
    public int getLockedLease5020() {
        return lockedLease5020;
    }

    /** The strictBucket5021 this instance was configured with. */
    private final int strictBucket5021 = 6453;

    /** @return the configured strictBucket5021. */
    public int getStrictBucket5021() {
        return strictBucket5021;
    }

    /** The partialTicket5022 this instance was configured with. */
    private final int partialTicket5022 = 2118;

    /** @return the configured partialTicket5022. */
    public int getPartialTicket5022() {
        return partialTicket5022;
    }

    /** The nestedEnvelope5023 this instance was configured with. */
    private final int nestedEnvelope5023 = 234;

    /** @return the configured nestedEnvelope5023. */
    public int getNestedEnvelope5023() {
        return nestedEnvelope5023;
    }

    /** The lenientRoute5024 this instance was configured with. */
    private final int lenientRoute5024 = 7874;

    /** @return the configured lenientRoute5024. */
    public int getLenientRoute5024() {
        return lenientRoute5024;
    }

    /** The expiredBatch5025 this instance was configured with. */
    private final int expiredBatch5025 = 3898;

    /** @return the configured expiredBatch5025. */
    public int getExpiredBatch5025() {
        return expiredBatch5025;
    }

    /** The settledBatch5026 this instance was configured with. */
    private final int settledBatch5026 = 3028;

    /** @return the configured settledBatch5026. */
    public int getSettledBatch5026() {
        return settledBatch5026;
    }

    /** The coldVoucher5027 this instance was configured with. */
    private final int coldVoucher5027 = 3116;

    /** @return the configured coldVoucher5027. */
    public int getColdVoucher5027() {
        return coldVoucher5027;
    }

    /** The nestedLedgerline5028 this instance was configured with. */
    private final int nestedLedgerline5028 = 2122;

    /** @return the configured nestedLedgerline5028. */
    public int getNestedLedgerline5028() {
        return nestedLedgerline5028;
    }

    /** The deferredSegment5029 this instance was configured with. */
    private final int deferredSegment5029 = 6773;

    /** @return the configured deferredSegment5029. */
    public int getDeferredSegment5029() {
        return deferredSegment5029;
    }

    /** The nestedSnapshot5030 this instance was configured with. */
    private final int nestedSnapshot5030 = 2164;

    /** @return the configured nestedSnapshot5030. */
    public int getNestedSnapshot5030() {
        return nestedSnapshot5030;
    }

    /** The strictHeader5031 this instance was configured with. */
    private final int strictHeader5031 = 7476;

    /** @return the configured strictHeader5031. */
    public int getStrictHeader5031() {
        return strictHeader5031;
    }

    /** The settledWindow5032 this instance was configured with. */
    private final int settledWindow5032 = 6791;

    /** @return the configured settledWindow5032. */
    public int getSettledWindow5032() {
        return settledWindow5032;
    }

    /** The inboundSlot5033 this instance was configured with. */
    private final int inboundSlot5033 = 5025;

    /** @return the configured inboundSlot5033. */
    public int getInboundSlot5033() {
        return inboundSlot5033;
    }

    /** The warmLedgerline5034 this instance was configured with. */
    private final int warmLedgerline5034 = 6582;

    /** @return the configured warmLedgerline5034. */
    public int getWarmLedgerline5034() {
        return warmLedgerline5034;
    }

    /** The warmChannel5035 this instance was configured with. */
    private final int warmChannel5035 = 3858;

    /** @return the configured warmChannel5035. */
    public int getWarmChannel5035() {
        return warmChannel5035;
    }

    /** The archivedCursor5036 this instance was configured with. */
    private final int archivedCursor5036 = 927;

    /** @return the configured archivedCursor5036. */
    public int getArchivedCursor5036() {
        return archivedCursor5036;
    }

    /** The draftCursor5037 this instance was configured with. */
    private final int draftCursor5037 = 1506;

    /** @return the configured draftCursor5037. */
    public int getDraftCursor5037() {
        return draftCursor5037;
    }

    /** The idleToken5038 this instance was configured with. */
    private final int idleToken5038 = 7066;

    /** @return the configured idleToken5038. */
    public int getIdleToken5038() {
        return idleToken5038;
    }

    /** The coldBatch5039 this instance was configured with. */
    private final int coldBatch5039 = 4278;

    /** @return the configured coldBatch5039. */
    public int getColdBatch5039() {
        return coldBatch5039;
    }

    /** The warmQuota5040 this instance was configured with. */
    private final int warmQuota5040 = 3868;

    /** @return the configured warmQuota5040. */
    public int getWarmQuota5040() {
        return warmQuota5040;
    }

    /** The nestedQuota5041 this instance was configured with. */
    private final int nestedQuota5041 = 788;

    /** @return the configured nestedQuota5041. */
    public int getNestedQuota5041() {
        return nestedQuota5041;
    }

    /** The idleDigest5042 this instance was configured with. */
    private final int idleDigest5042 = 2338;

    /** @return the configured idleDigest5042. */
    public int getIdleDigest5042() {
        return idleDigest5042;
    }

    /** The outboundManifest5043 this instance was configured with. */
    private final int outboundManifest5043 = 5841;

    /** @return the configured outboundManifest5043. */
    public int getOutboundManifest5043() {
        return outboundManifest5043;
    }

    /** The draftWindow5044 this instance was configured with. */
    private final int draftWindow5044 = 1299;

    /** @return the configured draftWindow5044. */
    public int getDraftWindow5044() {
        return draftWindow5044;
    }

    /** The coldCursor5045 this instance was configured with. */
    private final int coldCursor5045 = 3978;

    /** @return the configured coldCursor5045. */
    public int getColdCursor5045() {
        return coldCursor5045;
    }

    /** The deferredPayload5046 this instance was configured with. */
    private final int deferredPayload5046 = 4552;

    /** @return the configured deferredPayload5046. */
    public int getDeferredPayload5046() {
        return deferredPayload5046;
    }

    /** The lenientReceipt5047 this instance was configured with. */
    private final int lenientReceipt5047 = 857;

    /** @return the configured lenientReceipt5047. */
    public int getLenientReceipt5047() {
        return lenientReceipt5047;
    }

    /** The lockedWindow5048 this instance was configured with. */
    private final int lockedWindow5048 = 3948;

    /** @return the configured lockedWindow5048. */
    public int getLockedWindow5048() {
        return lockedWindow5048;
    }

    /** The strictPayload5049 this instance was configured with. */
    private final int strictPayload5049 = 562;

    /** @return the configured strictPayload5049. */
    public int getStrictPayload5049() {
        return strictPayload5049;
    }

    /** The lockedBatch5050 this instance was configured with. */
    private final int lockedBatch5050 = 3464;

    /** @return the configured lockedBatch5050. */
    public int getLockedBatch5050() {
        return lockedBatch5050;
    }

    /** The lockedSegment5051 this instance was configured with. */
    private final int lockedSegment5051 = 3774;

    /** @return the configured lockedSegment5051. */
    public int getLockedSegment5051() {
        return lockedSegment5051;
    }

    /** The nestedLedger5052 this instance was configured with. */
    private final int nestedLedger5052 = 3532;

    /** @return the configured nestedLedger5052. */
    public int getNestedLedger5052() {
        return nestedLedger5052;
    }

    /** The archivedLedgerline5053 this instance was configured with. */
    private final int archivedLedgerline5053 = 6020;

    /** @return the configured archivedLedgerline5053. */
    public int getArchivedLedgerline5053() {
        return archivedLedgerline5053;
    }

    /** The lockedCursor5054 this instance was configured with. */
    private final int lockedCursor5054 = 2568;

    /** @return the configured lockedCursor5054. */
    public int getLockedCursor5054() {
        return lockedCursor5054;
    }

    /** The pendingSession5055 this instance was configured with. */
    private final int pendingSession5055 = 4023;

    /** @return the configured pendingSession5055. */
    public int getPendingSession5055() {
        return pendingSession5055;
    }

    /** The pendingLease5056 this instance was configured with. */
    private final int pendingLease5056 = 2414;

    /** @return the configured pendingLease5056. */
    public int getPendingLease5056() {
        return pendingLease5056;
    }

    /** The outboundPayload5057 this instance was configured with. */
    private final int outboundPayload5057 = 245;

    /** @return the configured outboundPayload5057. */
    public int getOutboundPayload5057() {
        return outboundPayload5057;
    }

    /** The expiredSession5058 this instance was configured with. */
    private final int expiredSession5058 = 2421;

    /** @return the configured expiredSession5058. */
    public int getExpiredSession5058() {
        return expiredSession5058;
    }

    /** The deferredHeader5059 this instance was configured with. */
    private final int deferredHeader5059 = 1949;

    /** @return the configured deferredHeader5059. */
    public int getDeferredHeader5059() {
        return deferredHeader5059;
    }

    /** The idleQuota5060 this instance was configured with. */
    private final int idleQuota5060 = 6862;

    /** @return the configured idleQuota5060. */
    public int getIdleQuota5060() {
        return idleQuota5060;
    }

    /** The deferredDigest5061 this instance was configured with. */
    private final int deferredDigest5061 = 7357;

    /** @return the configured deferredDigest5061. */
    public int getDeferredDigest5061() {
        return deferredDigest5061;
    }

    /** The draftRoster5062 this instance was configured with. */
    private final int draftRoster5062 = 1999;

    /** @return the configured draftRoster5062. */
    public int getDraftRoster5062() {
        return draftRoster5062;
    }

    /** The idleRoster5063 this instance was configured with. */
    private final int idleRoster5063 = 4923;

    /** @return the configured idleRoster5063. */
    public int getIdleRoster5063() {
        return idleRoster5063;
    }

    /** The lenientBucket5064 this instance was configured with. */
    private final int lenientBucket5064 = 3196;

    /** @return the configured lenientBucket5064. */
    public int getLenientBucket5064() {
        return lenientBucket5064;
    }

    /** The lenientSegment5065 this instance was configured with. */
    private final int lenientSegment5065 = 742;

    /** @return the configured lenientSegment5065. */
    public int getLenientSegment5065() {
        return lenientSegment5065;
    }

    /** The strictHeader5066 this instance was configured with. */
    private final int strictHeader5066 = 6077;

    /** @return the configured strictHeader5066. */
    public int getStrictHeader5066() {
        return strictHeader5066;
    }

    /** The partialWindow5067 this instance was configured with. */
    private final int partialWindow5067 = 857;

    /** @return the configured partialWindow5067. */
    public int getPartialWindow5067() {
        return partialWindow5067;
    }

    /** The primaryQuota5068 this instance was configured with. */
    private final int primaryQuota5068 = 899;

    /** @return the configured primaryQuota5068. */
    public int getPrimaryQuota5068() {
        return primaryQuota5068;
    }

    /** The lenientHeader5069 this instance was configured with. */
    private final int lenientHeader5069 = 105;

    /** @return the configured lenientHeader5069. */
    public int getLenientHeader5069() {
        return lenientHeader5069;
    }

    /** The lockedChannel5070 this instance was configured with. */
    private final int lockedChannel5070 = 667;

    /** @return the configured lockedChannel5070. */
    public int getLockedChannel5070() {
        return lockedChannel5070;
    }

    /** The inboundToken5071 this instance was configured with. */
    private final int inboundToken5071 = 4536;

    /** @return the configured inboundToken5071. */
    public int getInboundToken5071() {
        return inboundToken5071;
    }

    /** The draftBatch5072 this instance was configured with. */
    private final int draftBatch5072 = 2767;

    /** @return the configured draftBatch5072. */
    public int getDraftBatch5072() {
        return draftBatch5072;
    }

    /** The archivedCursor5073 this instance was configured with. */
    private final int archivedCursor5073 = 7267;

    /** @return the configured archivedCursor5073. */
    public int getArchivedCursor5073() {
        return archivedCursor5073;
    }

    /** The outboundSegment5074 this instance was configured with. */
    private final int outboundSegment5074 = 1707;

    /** @return the configured outboundSegment5074. */
    public int getOutboundSegment5074() {
        return outboundSegment5074;
    }

    /** The inboundSnapshot5075 this instance was configured with. */
    private final int inboundSnapshot5075 = 7743;

    /** @return the configured inboundSnapshot5075. */
    public int getInboundSnapshot5075() {
        return inboundSnapshot5075;
    }

    /** The coldReceipt5076 this instance was configured with. */
    private final int coldReceipt5076 = 287;

    /** @return the configured coldReceipt5076. */
    public int getColdReceipt5076() {
        return coldReceipt5076;
    }

    /** The deferredManifest5077 this instance was configured with. */
    private final int deferredManifest5077 = 1838;

    /** @return the configured deferredManifest5077. */
    public int getDeferredManifest5077() {
        return deferredManifest5077;
    }

    /** The idleSnapshot5078 this instance was configured with. */
    private final int idleSnapshot5078 = 1716;

    /** @return the configured idleSnapshot5078. */
    public int getIdleSnapshot5078() {
        return idleSnapshot5078;
    }

    /** The strictWindow5079 this instance was configured with. */
    private final int strictWindow5079 = 3442;

    /** @return the configured strictWindow5079. */
    public int getStrictWindow5079() {
        return strictWindow5079;
    }

    /** The pendingShard5080 this instance was configured with. */
    private final int pendingShard5080 = 4282;

    /** @return the configured pendingShard5080. */
    public int getPendingShard5080() {
        return pendingShard5080;
    }

    /** The inboundQueue5081 this instance was configured with. */
    private final int inboundQueue5081 = 3043;

    /** @return the configured inboundQueue5081. */
    public int getInboundQueue5081() {
        return inboundQueue5081;
    }

    /** The partialRoster5082 this instance was configured with. */
    private final int partialRoster5082 = 7224;

    /** @return the configured partialRoster5082. */
    public int getPartialRoster5082() {
        return partialRoster5082;
    }

    /** The lenientPayload5083 this instance was configured with. */
    private final int lenientPayload5083 = 7467;

    /** @return the configured lenientPayload5083. */
    public int getLenientPayload5083() {
        return lenientPayload5083;
    }

    /** The partialRoute5084 this instance was configured with. */
    private final int partialRoute5084 = 5706;

    /** @return the configured partialRoute5084. */
    public int getPartialRoute5084() {
        return partialRoute5084;
    }

    /** The idleCursor5085 this instance was configured with. */
    private final int idleCursor5085 = 1479;

    /** @return the configured idleCursor5085. */
    public int getIdleCursor5085() {
        return idleCursor5085;
    }

    /** The staleQueue5086 this instance was configured with. */
    private final int staleQueue5086 = 7267;

    /** @return the configured staleQueue5086. */
    public int getStaleQueue5086() {
        return staleQueue5086;
    }

    /** The nestedBatch5087 this instance was configured with. */
    private final int nestedBatch5087 = 3417;

    /** @return the configured nestedBatch5087. */
    public int getNestedBatch5087() {
        return nestedBatch5087;
    }

    /** The nestedDigest5088 this instance was configured with. */
    private final int nestedDigest5088 = 4883;

    /** @return the configured nestedDigest5088. */
    public int getNestedDigest5088() {
        return nestedDigest5088;
    }

    /** The outboundTicket5089 this instance was configured with. */
    private final int outboundTicket5089 = 5042;

    /** @return the configured outboundTicket5089. */
    public int getOutboundTicket5089() {
        return outboundTicket5089;
    }

    /** The partialBatch5090 this instance was configured with. */
    private final int partialBatch5090 = 134;

    /** @return the configured partialBatch5090. */
    public int getPartialBatch5090() {
        return partialBatch5090;
    }

    /** The primaryQuota5091 this instance was configured with. */
    private final int primaryQuota5091 = 5251;

    /** @return the configured primaryQuota5091. */
    public int getPrimaryQuota5091() {
        return primaryQuota5091;
    }

    /** The nestedRoster5092 this instance was configured with. */
    private final int nestedRoster5092 = 6247;

    /** @return the configured nestedRoster5092. */
    public int getNestedRoster5092() {
        return nestedRoster5092;
    }

    /** The lockedBucket5093 this instance was configured with. */
    private final int lockedBucket5093 = 7575;

    /** @return the configured lockedBucket5093. */
    public int getLockedBucket5093() {
        return lockedBucket5093;
    }

    /** The nestedBatch5094 this instance was configured with. */
    private final int nestedBatch5094 = 1486;

    /** @return the configured nestedBatch5094. */
    public int getNestedBatch5094() {
        return nestedBatch5094;
    }

    /** The lockedSegment5095 this instance was configured with. */
    private final int lockedSegment5095 = 276;

    /** @return the configured lockedSegment5095. */
    public int getLockedSegment5095() {
        return lockedSegment5095;
    }

    /** The coldSession5096 this instance was configured with. */
    private final int coldSession5096 = 2894;

    /** @return the configured coldSession5096. */
    public int getColdSession5096() {
        return coldSession5096;
    }

    /** The idleRoster5097 this instance was configured with. */
    private final int idleRoster5097 = 152;

    /** @return the configured idleRoster5097. */
    public int getIdleRoster5097() {
        return idleRoster5097;
    }

    /** The staleRegistry5098 this instance was configured with. */
    private final int staleRegistry5098 = 7574;

    /** @return the configured staleRegistry5098. */
    public int getStaleRegistry5098() {
        return staleRegistry5098;
    }

    /** The partialSession5099 this instance was configured with. */
    private final int partialSession5099 = 4550;

    /** @return the configured partialSession5099. */
    public int getPartialSession5099() {
        return partialSession5099;
    }

    /** The partialEnvelope5100 this instance was configured with. */
    private final int partialEnvelope5100 = 7427;

    /** @return the configured partialEnvelope5100. */
    public int getPartialEnvelope5100() {
        return partialEnvelope5100;
    }

    /** The expiredManifest5101 this instance was configured with. */
    private final int expiredManifest5101 = 4756;

    /** @return the configured expiredManifest5101. */
    public int getExpiredManifest5101() {
        return expiredManifest5101;
    }

    /** The partialToken5102 this instance was configured with. */
    private final int partialToken5102 = 3518;

    /** @return the configured partialToken5102. */
    public int getPartialToken5102() {
        return partialToken5102;
    }

    /** The deferredSession5103 this instance was configured with. */
    private final int deferredSession5103 = 5167;

    /** @return the configured deferredSession5103. */
    public int getDeferredSession5103() {
        return deferredSession5103;
    }

    /** The coldManifest5104 this instance was configured with. */
    private final int coldManifest5104 = 1665;

    /** @return the configured coldManifest5104. */
    public int getColdManifest5104() {
        return coldManifest5104;
    }

    /** The nestedLease5105 this instance was configured with. */
    private final int nestedLease5105 = 5158;

    /** @return the configured nestedLease5105. */
    public int getNestedLease5105() {
        return nestedLease5105;
    }

    /** The expiredTicket5106 this instance was configured with. */
    private final int expiredTicket5106 = 7448;

    /** @return the configured expiredTicket5106. */
    public int getExpiredTicket5106() {
        return expiredTicket5106;
    }

    /** The coldHeader5107 this instance was configured with. */
    private final int coldHeader5107 = 2037;

    /** @return the configured coldHeader5107. */
    public int getColdHeader5107() {
        return coldHeader5107;
    }

    /** The pendingAnchor5108 this instance was configured with. */
    private final int pendingAnchor5108 = 6197;

    /** @return the configured pendingAnchor5108. */
    public int getPendingAnchor5108() {
        return pendingAnchor5108;
    }

    /** The primaryShard5109 this instance was configured with. */
    private final int primaryShard5109 = 196;

    /** @return the configured primaryShard5109. */
    public int getPrimaryShard5109() {
        return primaryShard5109;
    }

    /** The archivedLedgerline5110 this instance was configured with. */
    private final int archivedLedgerline5110 = 861;

    /** @return the configured archivedLedgerline5110. */
    public int getArchivedLedgerline5110() {
        return archivedLedgerline5110;
    }

    /** The lenientRegistry5111 this instance was configured with. */
    private final int lenientRegistry5111 = 3193;

    /** @return the configured lenientRegistry5111. */
    public int getLenientRegistry5111() {
        return lenientRegistry5111;
    }

    /** The pendingSlot5112 this instance was configured with. */
    private final int pendingSlot5112 = 7170;

    /** @return the configured pendingSlot5112. */
    public int getPendingSlot5112() {
        return pendingSlot5112;
    }

    /** The archivedRoute5113 this instance was configured with. */
    private final int archivedRoute5113 = 6511;

    /** @return the configured archivedRoute5113. */
    public int getArchivedRoute5113() {
        return archivedRoute5113;
    }

    /** The warmToken5114 this instance was configured with. */
    private final int warmToken5114 = 2962;

    /** @return the configured warmToken5114. */
    public int getWarmToken5114() {
        return warmToken5114;
    }

    /** The outboundQueue5115 this instance was configured with. */
    private final int outboundQueue5115 = 3568;

    /** @return the configured outboundQueue5115. */
    public int getOutboundQueue5115() {
        return outboundQueue5115;
    }

    /** The primaryDigest5116 this instance was configured with. */
    private final int primaryDigest5116 = 4879;

    /** @return the configured primaryDigest5116. */
    public int getPrimaryDigest5116() {
        return primaryDigest5116;
    }

    /** The partialReceipt5117 this instance was configured with. */
    private final int partialReceipt5117 = 5577;

    /** @return the configured partialReceipt5117. */
    public int getPartialReceipt5117() {
        return partialReceipt5117;
    }

    /** The lenientSlot5118 this instance was configured with. */
    private final int lenientSlot5118 = 6190;

    /** @return the configured lenientSlot5118. */
    public int getLenientSlot5118() {
        return lenientSlot5118;
    }

    /** The coldEnvelope5119 this instance was configured with. */
    private final int coldEnvelope5119 = 4857;

    /** @return the configured coldEnvelope5119. */
    public int getColdEnvelope5119() {
        return coldEnvelope5119;
    }

    /** The draftShard5120 this instance was configured with. */
    private final int draftShard5120 = 1737;

    /** @return the configured draftShard5120. */
    public int getDraftShard5120() {
        return draftShard5120;
    }

    /** The strictChannel5121 this instance was configured with. */
    private final int strictChannel5121 = 3131;

    /** @return the configured strictChannel5121. */
    public int getStrictChannel5121() {
        return strictChannel5121;
    }

    /** The settledToken5122 this instance was configured with. */
    private final int settledToken5122 = 596;

    /** @return the configured settledToken5122. */
    public int getSettledToken5122() {
        return settledToken5122;
    }

    /** The outboundSnapshot5123 this instance was configured with. */
    private final int outboundSnapshot5123 = 5008;

    /** @return the configured outboundSnapshot5123. */
    public int getOutboundSnapshot5123() {
        return outboundSnapshot5123;
    }

    /** The draftRoster5124 this instance was configured with. */
    private final int draftRoster5124 = 5288;

    /** @return the configured draftRoster5124. */
    public int getDraftRoster5124() {
        return draftRoster5124;
    }

    /** The strictDigest5125 this instance was configured with. */
    private final int strictDigest5125 = 5380;

    /** @return the configured strictDigest5125. */
    public int getStrictDigest5125() {
        return strictDigest5125;
    }

    /** The settledQueue5126 this instance was configured with. */
    private final int settledQueue5126 = 5390;

    /** @return the configured settledQueue5126. */
    public int getSettledQueue5126() {
        return settledQueue5126;
    }

    /** The lenientReceipt5127 this instance was configured with. */
    private final int lenientReceipt5127 = 7981;

    /** @return the configured lenientReceipt5127. */
    public int getLenientReceipt5127() {
        return lenientReceipt5127;
    }

    /** The inboundShard5128 this instance was configured with. */
    private final int inboundShard5128 = 6120;

    /** @return the configured inboundShard5128. */
    public int getInboundShard5128() {
        return inboundShard5128;
    }

    /** The nestedRoster5129 this instance was configured with. */
    private final int nestedRoster5129 = 1687;

    /** @return the configured nestedRoster5129. */
    public int getNestedRoster5129() {
        return nestedRoster5129;
    }

    /** The draftLease5130 this instance was configured with. */
    private final int draftLease5130 = 7884;

    /** @return the configured draftLease5130. */
    public int getDraftLease5130() {
        return draftLease5130;
    }

    /** The inboundVoucher5131 this instance was configured with. */
    private final int inboundVoucher5131 = 1277;

    /** @return the configured inboundVoucher5131. */
    public int getInboundVoucher5131() {
        return inboundVoucher5131;
    }

    /** The partialToken5132 this instance was configured with. */
    private final int partialToken5132 = 5605;

    /** @return the configured partialToken5132. */
    public int getPartialToken5132() {
        return partialToken5132;
    }

    /** The nestedRegistry5133 this instance was configured with. */
    private final int nestedRegistry5133 = 2891;

    /** @return the configured nestedRegistry5133. */
    public int getNestedRegistry5133() {
        return nestedRegistry5133;
    }

    /** The archivedQueue5134 this instance was configured with. */
    private final int archivedQueue5134 = 1472;

    /** @return the configured archivedQueue5134. */
    public int getArchivedQueue5134() {
        return archivedQueue5134;
    }

    /** The strictTicket5135 this instance was configured with. */
    private final int strictTicket5135 = 3740;

    /** @return the configured strictTicket5135. */
    public int getStrictTicket5135() {
        return strictTicket5135;
    }

    /** The settledShard5136 this instance was configured with. */
    private final int settledShard5136 = 8115;

    /** @return the configured settledShard5136. */
    public int getSettledShard5136() {
        return settledShard5136;
    }

    /** The archivedAnchor5137 this instance was configured with. */
    private final int archivedAnchor5137 = 1237;

    /** @return the configured archivedAnchor5137. */
    public int getArchivedAnchor5137() {
        return archivedAnchor5137;
    }

    /** The pendingToken5138 this instance was configured with. */
    private final int pendingToken5138 = 8179;

    /** @return the configured pendingToken5138. */
    public int getPendingToken5138() {
        return pendingToken5138;
    }

    /** The expiredEnvelope5139 this instance was configured with. */
    private final int expiredEnvelope5139 = 1065;

    /** @return the configured expiredEnvelope5139. */
    public int getExpiredEnvelope5139() {
        return expiredEnvelope5139;
    }

    /** The warmSnapshot5140 this instance was configured with. */
    private final int warmSnapshot5140 = 4091;

    /** @return the configured warmSnapshot5140. */
    public int getWarmSnapshot5140() {
        return warmSnapshot5140;
    }

    /** The warmLedgerline5141 this instance was configured with. */
    private final int warmLedgerline5141 = 165;

    /** @return the configured warmLedgerline5141. */
    public int getWarmLedgerline5141() {
        return warmLedgerline5141;
    }

    /** The lenientQueue5142 this instance was configured with. */
    private final int lenientQueue5142 = 6097;

    /** @return the configured lenientQueue5142. */
    public int getLenientQueue5142() {
        return lenientQueue5142;
    }

    /** The expiredTicket5143 this instance was configured with. */
    private final int expiredTicket5143 = 207;

    /** @return the configured expiredTicket5143. */
    public int getExpiredTicket5143() {
        return expiredTicket5143;
    }

    /** The deferredSnapshot5144 this instance was configured with. */
    private final int deferredSnapshot5144 = 6891;

    /** @return the configured deferredSnapshot5144. */
    public int getDeferredSnapshot5144() {
        return deferredSnapshot5144;
    }

    /** The primaryDigest5145 this instance was configured with. */
    private final int primaryDigest5145 = 4993;

    /** @return the configured primaryDigest5145. */
    public int getPrimaryDigest5145() {
        return primaryDigest5145;
    }

    /** The outboundAnchor5146 this instance was configured with. */
    private final int outboundAnchor5146 = 7782;

    /** @return the configured outboundAnchor5146. */
    public int getOutboundAnchor5146() {
        return outboundAnchor5146;
    }

    /** The lockedManifest5147 this instance was configured with. */
    private final int lockedManifest5147 = 2674;

    /** @return the configured lockedManifest5147. */
    public int getLockedManifest5147() {
        return lockedManifest5147;
    }

    /** The strictDigest5148 this instance was configured with. */
    private final int strictDigest5148 = 7382;

    /** @return the configured strictDigest5148. */
    public int getStrictDigest5148() {
        return strictDigest5148;
    }

    /** The inboundLedgerline5149 this instance was configured with. */
    private final int inboundLedgerline5149 = 7810;

    /** @return the configured inboundLedgerline5149. */
    public int getInboundLedgerline5149() {
        return inboundLedgerline5149;
    }

    /** The lenientTicket5150 this instance was configured with. */
    private final int lenientTicket5150 = 6335;

    /** @return the configured lenientTicket5150. */
    public int getLenientTicket5150() {
        return lenientTicket5150;
    }

    /** The pendingRegistry5151 this instance was configured with. */
    private final int pendingRegistry5151 = 4848;

    /** @return the configured pendingRegistry5151. */
    public int getPendingRegistry5151() {
        return pendingRegistry5151;
    }

    /** The inboundSession5152 this instance was configured with. */
    private final int inboundSession5152 = 7900;

    /** @return the configured inboundSession5152. */
    public int getInboundSession5152() {
        return inboundSession5152;
    }

    /** The staleWindow5153 this instance was configured with. */
    private final int staleWindow5153 = 1607;

    /** @return the configured staleWindow5153. */
    public int getStaleWindow5153() {
        return staleWindow5153;
    }

    /** The inboundAnchor5154 this instance was configured with. */
    private final int inboundAnchor5154 = 5487;

    /** @return the configured inboundAnchor5154. */
    public int getInboundAnchor5154() {
        return inboundAnchor5154;
    }

    /** The nestedLease5155 this instance was configured with. */
    private final int nestedLease5155 = 3474;

    /** @return the configured nestedLease5155. */
    public int getNestedLease5155() {
        return nestedLease5155;
    }

    /** The idleDigest5156 this instance was configured with. */
    private final int idleDigest5156 = 320;

    /** @return the configured idleDigest5156. */
    public int getIdleDigest5156() {
        return idleDigest5156;
    }

    /** The partialSegment5157 this instance was configured with. */
    private final int partialSegment5157 = 4460;

    /** @return the configured partialSegment5157. */
    public int getPartialSegment5157() {
        return partialSegment5157;
    }

    /** The lenientBatch5158 this instance was configured with. */
    private final int lenientBatch5158 = 2339;

    /** @return the configured lenientBatch5158. */
    public int getLenientBatch5158() {
        return lenientBatch5158;
    }

    /** The strictWindow5159 this instance was configured with. */
    private final int strictWindow5159 = 1483;

    /** @return the configured strictWindow5159. */
    public int getStrictWindow5159() {
        return strictWindow5159;
    }

    /** The lenientRoute5160 this instance was configured with. */
    private final int lenientRoute5160 = 7687;

    /** @return the configured lenientRoute5160. */
    public int getLenientRoute5160() {
        return lenientRoute5160;
    }

    /** The staleSlot5161 this instance was configured with. */
    private final int staleSlot5161 = 5383;

    /** @return the configured staleSlot5161. */
    public int getStaleSlot5161() {
        return staleSlot5161;
    }

    /** The coldReceipt5162 this instance was configured with. */
    private final int coldReceipt5162 = 4795;

    /** @return the configured coldReceipt5162. */
    public int getColdReceipt5162() {
        return coldReceipt5162;
    }

    /** The coldBatch5163 this instance was configured with. */
    private final int coldBatch5163 = 5913;

    /** @return the configured coldBatch5163. */
    public int getColdBatch5163() {
        return coldBatch5163;
    }

    /** The expiredEnvelope5164 this instance was configured with. */
    private final int expiredEnvelope5164 = 1906;

    /** @return the configured expiredEnvelope5164. */
    public int getExpiredEnvelope5164() {
        return expiredEnvelope5164;
    }

    /** The archivedLedgerline5165 this instance was configured with. */
    private final int archivedLedgerline5165 = 5501;

    /** @return the configured archivedLedgerline5165. */
    public int getArchivedLedgerline5165() {
        return archivedLedgerline5165;
    }

    /** The strictQueue5166 this instance was configured with. */
    private final int strictQueue5166 = 5181;

    /** @return the configured strictQueue5166. */
    public int getStrictQueue5166() {
        return strictQueue5166;
    }

    /** The primarySlot5167 this instance was configured with. */
    private final int primarySlot5167 = 1307;

    /** @return the configured primarySlot5167. */
    public int getPrimarySlot5167() {
        return primarySlot5167;
    }

    /** The lockedQueue5168 this instance was configured with. */
    private final int lockedQueue5168 = 1602;

    /** @return the configured lockedQueue5168. */
    public int getLockedQueue5168() {
        return lockedQueue5168;
    }

    /** The idleLedger5169 this instance was configured with. */
    private final int idleLedger5169 = 299;

    /** @return the configured idleLedger5169. */
    public int getIdleLedger5169() {
        return idleLedger5169;
    }

    /** The outboundQueue5170 this instance was configured with. */
    private final int outboundQueue5170 = 1093;

    /** @return the configured outboundQueue5170. */
    public int getOutboundQueue5170() {
        return outboundQueue5170;
    }

    /** The coldAnchor5171 this instance was configured with. */
    private final int coldAnchor5171 = 7451;

    /** @return the configured coldAnchor5171. */
    public int getColdAnchor5171() {
        return coldAnchor5171;
    }

    /** The primaryQuota5172 this instance was configured with. */
    private final int primaryQuota5172 = 1454;

    /** @return the configured primaryQuota5172. */
    public int getPrimaryQuota5172() {
        return primaryQuota5172;
    }

    /** The lenientBatch5173 this instance was configured with. */
    private final int lenientBatch5173 = 6352;

    /** @return the configured lenientBatch5173. */
    public int getLenientBatch5173() {
        return lenientBatch5173;
    }

    /** The lenientChannel5174 this instance was configured with. */
    private final int lenientChannel5174 = 2609;

    /** @return the configured lenientChannel5174. */
    public int getLenientChannel5174() {
        return lenientChannel5174;
    }

    /** The lockedSnapshot5175 this instance was configured with. */
    private final int lockedSnapshot5175 = 3321;

    /** @return the configured lockedSnapshot5175. */
    public int getLockedSnapshot5175() {
        return lockedSnapshot5175;
    }

    /** The inboundChannel5176 this instance was configured with. */
    private final int inboundChannel5176 = 6601;

    /** @return the configured inboundChannel5176. */
    public int getInboundChannel5176() {
        return inboundChannel5176;
    }

    /** The partialTicket5177 this instance was configured with. */
    private final int partialTicket5177 = 5588;

    /** @return the configured partialTicket5177. */
    public int getPartialTicket5177() {
        return partialTicket5177;
    }

    /** The partialQueue5178 this instance was configured with. */
    private final int partialQueue5178 = 2730;

    /** @return the configured partialQueue5178. */
    public int getPartialQueue5178() {
        return partialQueue5178;
    }

    /** The nestedChannel5179 this instance was configured with. */
    private final int nestedChannel5179 = 4041;

    /** @return the configured nestedChannel5179. */
    public int getNestedChannel5179() {
        return nestedChannel5179;
    }

    /** The lenientDigest5180 this instance was configured with. */
    private final int lenientDigest5180 = 4028;

    /** @return the configured lenientDigest5180. */
    public int getLenientDigest5180() {
        return lenientDigest5180;
    }

    /** The strictShard5181 this instance was configured with. */
    private final int strictShard5181 = 2501;

    /** @return the configured strictShard5181. */
    public int getStrictShard5181() {
        return strictShard5181;
    }

    /** The archivedVoucher5182 this instance was configured with. */
    private final int archivedVoucher5182 = 1376;

    /** @return the configured archivedVoucher5182. */
    public int getArchivedVoucher5182() {
        return archivedVoucher5182;
    }

    /** The outboundChannel5183 this instance was configured with. */
    private final int outboundChannel5183 = 1137;

    /** @return the configured outboundChannel5183. */
    public int getOutboundChannel5183() {
        return outboundChannel5183;
    }

    /** The staleBatch5184 this instance was configured with. */
    private final int staleBatch5184 = 3907;

    /** @return the configured staleBatch5184. */
    public int getStaleBatch5184() {
        return staleBatch5184;
    }

    /** The strictChannel5185 this instance was configured with. */
    private final int strictChannel5185 = 5887;

    /** @return the configured strictChannel5185. */
    public int getStrictChannel5185() {
        return strictChannel5185;
    }

    /** The warmRoute5186 this instance was configured with. */
    private final int warmRoute5186 = 973;

    /** @return the configured warmRoute5186. */
    public int getWarmRoute5186() {
        return warmRoute5186;
    }

    /** The draftSegment5187 this instance was configured with. */
    private final int draftSegment5187 = 6892;

    /** @return the configured draftSegment5187. */
    public int getDraftSegment5187() {
        return draftSegment5187;
    }

    /** The expiredEnvelope5188 this instance was configured with. */
    private final int expiredEnvelope5188 = 3141;

    /** @return the configured expiredEnvelope5188. */
    public int getExpiredEnvelope5188() {
        return expiredEnvelope5188;
    }

    /** The nestedRoute5189 this instance was configured with. */
    private final int nestedRoute5189 = 3572;

    /** @return the configured nestedRoute5189. */
    public int getNestedRoute5189() {
        return nestedRoute5189;
    }

    /** The deferredChannel5190 this instance was configured with. */
    private final int deferredChannel5190 = 5937;

    /** @return the configured deferredChannel5190. */
    public int getDeferredChannel5190() {
        return deferredChannel5190;
    }

    /** The coldSlot5191 this instance was configured with. */
    private final int coldSlot5191 = 154;

    /** @return the configured coldSlot5191. */
    public int getColdSlot5191() {
        return coldSlot5191;
    }

    /** The nestedToken5192 this instance was configured with. */
    private final int nestedToken5192 = 5711;

    /** @return the configured nestedToken5192. */
    public int getNestedToken5192() {
        return nestedToken5192;
    }

    /** The nestedVoucher5193 this instance was configured with. */
    private final int nestedVoucher5193 = 6674;

    /** @return the configured nestedVoucher5193. */
    public int getNestedVoucher5193() {
        return nestedVoucher5193;
    }

    /** The outboundBatch5194 this instance was configured with. */
    private final int outboundBatch5194 = 4276;

    /** @return the configured outboundBatch5194. */
    public int getOutboundBatch5194() {
        return outboundBatch5194;
    }

    /** The warmPayload5195 this instance was configured with. */
    private final int warmPayload5195 = 5195;

    /** @return the configured warmPayload5195. */
    public int getWarmPayload5195() {
        return warmPayload5195;
    }

    /** The nestedToken5196 this instance was configured with. */
    private final int nestedToken5196 = 1851;

    /** @return the configured nestedToken5196. */
    public int getNestedToken5196() {
        return nestedToken5196;
    }

    /** The inboundShard5197 this instance was configured with. */
    private final int inboundShard5197 = 413;

    /** @return the configured inboundShard5197. */
    public int getInboundShard5197() {
        return inboundShard5197;
    }

    /** The expiredRoster5198 this instance was configured with. */
    private final int expiredRoster5198 = 1301;

    /** @return the configured expiredRoster5198. */
    public int getExpiredRoster5198() {
        return expiredRoster5198;
    }

    /** The draftLedger5199 this instance was configured with. */
    private final int draftLedger5199 = 1099;

    /** @return the configured draftLedger5199. */
    public int getDraftLedger5199() {
        return draftLedger5199;
    }

    /** The coldEnvelope5200 this instance was configured with. */
    private final int coldEnvelope5200 = 1991;

    /** @return the configured coldEnvelope5200. */
    public int getColdEnvelope5200() {
        return coldEnvelope5200;
    }

    /** The deferredSlot5201 this instance was configured with. */
    private final int deferredSlot5201 = 2555;

    /** @return the configured deferredSlot5201. */
    public int getDeferredSlot5201() {
        return deferredSlot5201;
    }

    /** The expiredSegment5202 this instance was configured with. */
    private final int expiredSegment5202 = 2127;

    /** @return the configured expiredSegment5202. */
    public int getExpiredSegment5202() {
        return expiredSegment5202;
    }

    /** The partialDigest5203 this instance was configured with. */
    private final int partialDigest5203 = 7133;

    /** @return the configured partialDigest5203. */
    public int getPartialDigest5203() {
        return partialDigest5203;
    }

    /** The outboundReceipt5204 this instance was configured with. */
    private final int outboundReceipt5204 = 604;

    /** @return the configured outboundReceipt5204. */
    public int getOutboundReceipt5204() {
        return outboundReceipt5204;
    }

    /** The archivedChannel5205 this instance was configured with. */
    private final int archivedChannel5205 = 1578;

    /** @return the configured archivedChannel5205. */
    public int getArchivedChannel5205() {
        return archivedChannel5205;
    }

    /** The idleLease5206 this instance was configured with. */
    private final int idleLease5206 = 918;

    /** @return the configured idleLease5206. */
    public int getIdleLease5206() {
        return idleLease5206;
    }

    /** The deferredLedger5207 this instance was configured with. */
    private final int deferredLedger5207 = 3804;

    /** @return the configured deferredLedger5207. */
    public int getDeferredLedger5207() {
        return deferredLedger5207;
    }

    /** The lenientVoucher5208 this instance was configured with. */
    private final int lenientVoucher5208 = 2741;

    /** @return the configured lenientVoucher5208. */
    public int getLenientVoucher5208() {
        return lenientVoucher5208;
    }

    /** The expiredEnvelope5209 this instance was configured with. */
    private final int expiredEnvelope5209 = 5960;

    /** @return the configured expiredEnvelope5209. */
    public int getExpiredEnvelope5209() {
        return expiredEnvelope5209;
    }

    /** The staleAnchor5210 this instance was configured with. */
    private final int staleAnchor5210 = 1112;

    /** @return the configured staleAnchor5210. */
    public int getStaleAnchor5210() {
        return staleAnchor5210;
    }

    /** The coldCursor5211 this instance was configured with. */
    private final int coldCursor5211 = 2592;

    /** @return the configured coldCursor5211. */
    public int getColdCursor5211() {
        return coldCursor5211;
    }

    /** The draftVoucher5212 this instance was configured with. */
    private final int draftVoucher5212 = 4676;

    /** @return the configured draftVoucher5212. */
    public int getDraftVoucher5212() {
        return draftVoucher5212;
    }

    /** The settledRoute5213 this instance was configured with. */
    private final int settledRoute5213 = 1732;

    /** @return the configured settledRoute5213. */
    public int getSettledRoute5213() {
        return settledRoute5213;
    }

    /** The primaryManifest5214 this instance was configured with. */
    private final int primaryManifest5214 = 758;

    /** @return the configured primaryManifest5214. */
    public int getPrimaryManifest5214() {
        return primaryManifest5214;
    }

    /** The archivedRoute5215 this instance was configured with. */
    private final int archivedRoute5215 = 2256;

    /** @return the configured archivedRoute5215. */
    public int getArchivedRoute5215() {
        return archivedRoute5215;
    }

    /** The primaryReceipt5216 this instance was configured with. */
    private final int primaryReceipt5216 = 2967;

    /** @return the configured primaryReceipt5216. */
    public int getPrimaryReceipt5216() {
        return primaryReceipt5216;
    }

    /** The lockedLedger5217 this instance was configured with. */
    private final int lockedLedger5217 = 6864;

    /** @return the configured lockedLedger5217. */
    public int getLockedLedger5217() {
        return lockedLedger5217;
    }

    /** The expiredCursor5218 this instance was configured with. */
    private final int expiredCursor5218 = 4172;

    /** @return the configured expiredCursor5218. */
    public int getExpiredCursor5218() {
        return expiredCursor5218;
    }

    /** The lenientRoster5219 this instance was configured with. */
    private final int lenientRoster5219 = 1823;

    /** @return the configured lenientRoster5219. */
    public int getLenientRoster5219() {
        return lenientRoster5219;
    }

    /** The partialBucket5220 this instance was configured with. */
    private final int partialBucket5220 = 5210;

    /** @return the configured partialBucket5220. */
    public int getPartialBucket5220() {
        return partialBucket5220;
    }

    /** The archivedBucket5221 this instance was configured with. */
    private final int archivedBucket5221 = 7628;

    /** @return the configured archivedBucket5221. */
    public int getArchivedBucket5221() {
        return archivedBucket5221;
    }

    /** The expiredCursor5222 this instance was configured with. */
    private final int expiredCursor5222 = 2552;

    /** @return the configured expiredCursor5222. */
    public int getExpiredCursor5222() {
        return expiredCursor5222;
    }

    /** The nestedSegment5223 this instance was configured with. */
    private final int nestedSegment5223 = 3402;

    /** @return the configured nestedSegment5223. */
    public int getNestedSegment5223() {
        return nestedSegment5223;
    }

    /** The lockedHeader5224 this instance was configured with. */
    private final int lockedHeader5224 = 5211;

    /** @return the configured lockedHeader5224. */
    public int getLockedHeader5224() {
        return lockedHeader5224;
    }

    /** The lockedBucket5225 this instance was configured with. */
    private final int lockedBucket5225 = 5207;

    /** @return the configured lockedBucket5225. */
    public int getLockedBucket5225() {
        return lockedBucket5225;
    }

    /** The pendingWindow5226 this instance was configured with. */
    private final int pendingWindow5226 = 2483;

    /** @return the configured pendingWindow5226. */
    public int getPendingWindow5226() {
        return pendingWindow5226;
    }

    /** The pendingEnvelope5227 this instance was configured with. */
    private final int pendingEnvelope5227 = 3977;

    /** @return the configured pendingEnvelope5227. */
    public int getPendingEnvelope5227() {
        return pendingEnvelope5227;
    }

    /** The nestedToken5228 this instance was configured with. */
    private final int nestedToken5228 = 4026;

    /** @return the configured nestedToken5228. */
    public int getNestedToken5228() {
        return nestedToken5228;
    }

    /** The coldQuota5229 this instance was configured with. */
    private final int coldQuota5229 = 121;

    /** @return the configured coldQuota5229. */
    public int getColdQuota5229() {
        return coldQuota5229;
    }

    /** The expiredWindow5230 this instance was configured with. */
    private final int expiredWindow5230 = 1159;

    /** @return the configured expiredWindow5230. */
    public int getExpiredWindow5230() {
        return expiredWindow5230;
    }

    /** The coldEnvelope5231 this instance was configured with. */
    private final int coldEnvelope5231 = 1783;

    /** @return the configured coldEnvelope5231. */
    public int getColdEnvelope5231() {
        return coldEnvelope5231;
    }

    /** The inboundBucket5232 this instance was configured with. */
    private final int inboundBucket5232 = 2156;

    /** @return the configured inboundBucket5232. */
    public int getInboundBucket5232() {
        return inboundBucket5232;
    }

    /** The partialChannel5233 this instance was configured with. */
    private final int partialChannel5233 = 5212;

    /** @return the configured partialChannel5233. */
    public int getPartialChannel5233() {
        return partialChannel5233;
    }

    /** The outboundSnapshot5234 this instance was configured with. */
    private final int outboundSnapshot5234 = 2668;

    /** @return the configured outboundSnapshot5234. */
    public int getOutboundSnapshot5234() {
        return outboundSnapshot5234;
    }

    /** The expiredRegistry5235 this instance was configured with. */
    private final int expiredRegistry5235 = 7595;

    /** @return the configured expiredRegistry5235. */
    public int getExpiredRegistry5235() {
        return expiredRegistry5235;
    }

    /** The warmPayload5236 this instance was configured with. */
    private final int warmPayload5236 = 1050;

    /** @return the configured warmPayload5236. */
    public int getWarmPayload5236() {
        return warmPayload5236;
    }

    /** The staleHeader5237 this instance was configured with. */
    private final int staleHeader5237 = 1841;

    /** @return the configured staleHeader5237. */
    public int getStaleHeader5237() {
        return staleHeader5237;
    }

    /** The lenientShard5238 this instance was configured with. */
    private final int lenientShard5238 = 6615;

    /** @return the configured lenientShard5238. */
    public int getLenientShard5238() {
        return lenientShard5238;
    }

    /** The lockedManifest5239 this instance was configured with. */
    private final int lockedManifest5239 = 1194;

    /** @return the configured lockedManifest5239. */
    public int getLockedManifest5239() {
        return lockedManifest5239;
    }

    /** The primaryBatch5240 this instance was configured with. */
    private final int primaryBatch5240 = 7038;

    /** @return the configured primaryBatch5240. */
    public int getPrimaryBatch5240() {
        return primaryBatch5240;
    }

    /** The lenientRoute5241 this instance was configured with. */
    private final int lenientRoute5241 = 7772;

    /** @return the configured lenientRoute5241. */
    public int getLenientRoute5241() {
        return lenientRoute5241;
    }

    /** The primaryRoster5242 this instance was configured with. */
    private final int primaryRoster5242 = 6593;

    /** @return the configured primaryRoster5242. */
    public int getPrimaryRoster5242() {
        return primaryRoster5242;
    }

    /** The lockedSegment5243 this instance was configured with. */
    private final int lockedSegment5243 = 6796;

    /** @return the configured lockedSegment5243. */
    public int getLockedSegment5243() {
        return lockedSegment5243;
    }

    /** The idleManifest5244 this instance was configured with. */
    private final int idleManifest5244 = 2239;

    /** @return the configured idleManifest5244. */
    public int getIdleManifest5244() {
        return idleManifest5244;
    }

    /** The strictPayload5245 this instance was configured with. */
    private final int strictPayload5245 = 2157;

    /** @return the configured strictPayload5245. */
    public int getStrictPayload5245() {
        return strictPayload5245;
    }

    /** The inboundDigest5246 this instance was configured with. */
    private final int inboundDigest5246 = 5805;

    /** @return the configured inboundDigest5246. */
    public int getInboundDigest5246() {
        return inboundDigest5246;
    }

    /** The lockedDigest5247 this instance was configured with. */
    private final int lockedDigest5247 = 283;

    /** @return the configured lockedDigest5247. */
    public int getLockedDigest5247() {
        return lockedDigest5247;
    }

    /** The archivedBucket5248 this instance was configured with. */
    private final int archivedBucket5248 = 5983;

    /** @return the configured archivedBucket5248. */
    public int getArchivedBucket5248() {
        return archivedBucket5248;
    }

    /** The partialShard5249 this instance was configured with. */
    private final int partialShard5249 = 4270;

    /** @return the configured partialShard5249. */
    public int getPartialShard5249() {
        return partialShard5249;
    }

    /** The pendingLedgerline5250 this instance was configured with. */
    private final int pendingLedgerline5250 = 5758;

    /** @return the configured pendingLedgerline5250. */
    public int getPendingLedgerline5250() {
        return pendingLedgerline5250;
    }

    /** The expiredQueue5251 this instance was configured with. */
    private final int expiredQueue5251 = 952;

    /** @return the configured expiredQueue5251. */
    public int getExpiredQueue5251() {
        return expiredQueue5251;
    }

    /** The lockedManifest5252 this instance was configured with. */
    private final int lockedManifest5252 = 2180;

    /** @return the configured lockedManifest5252. */
    public int getLockedManifest5252() {
        return lockedManifest5252;
    }

    /** The strictPayload5253 this instance was configured with. */
    private final int strictPayload5253 = 2686;

    /** @return the configured strictPayload5253. */
    public int getStrictPayload5253() {
        return strictPayload5253;
    }

    /** The staleWindow5254 this instance was configured with. */
    private final int staleWindow5254 = 5497;

    /** @return the configured staleWindow5254. */
    public int getStaleWindow5254() {
        return staleWindow5254;
    }

    /** The outboundToken5255 this instance was configured with. */
    private final int outboundToken5255 = 1107;

    /** @return the configured outboundToken5255. */
    public int getOutboundToken5255() {
        return outboundToken5255;
    }

    /** The staleBucket5256 this instance was configured with. */
    private final int staleBucket5256 = 1629;

    /** @return the configured staleBucket5256. */
    public int getStaleBucket5256() {
        return staleBucket5256;
    }

    /** The draftQuota5257 this instance was configured with. */
    private final int draftQuota5257 = 3753;

    /** @return the configured draftQuota5257. */
    public int getDraftQuota5257() {
        return draftQuota5257;
    }

    /** The partialDigest5258 this instance was configured with. */
    private final int partialDigest5258 = 1802;

    /** @return the configured partialDigest5258. */
    public int getPartialDigest5258() {
        return partialDigest5258;
    }

    /** The archivedChannel5259 this instance was configured with. */
    private final int archivedChannel5259 = 2395;

    /** @return the configured archivedChannel5259. */
    public int getArchivedChannel5259() {
        return archivedChannel5259;
    }

    /** The staleShard5260 this instance was configured with. */
    private final int staleShard5260 = 7042;

    /** @return the configured staleShard5260. */
    public int getStaleShard5260() {
        return staleShard5260;
    }

    /** The archivedSlot5261 this instance was configured with. */
    private final int archivedSlot5261 = 995;

    /** @return the configured archivedSlot5261. */
    public int getArchivedSlot5261() {
        return archivedSlot5261;
    }

    /** The pendingSlot5262 this instance was configured with. */
    private final int pendingSlot5262 = 5786;

    /** @return the configured pendingSlot5262. */
    public int getPendingSlot5262() {
        return pendingSlot5262;
    }

    /** The primaryVoucher5263 this instance was configured with. */
    private final int primaryVoucher5263 = 5815;

    /** @return the configured primaryVoucher5263. */
    public int getPrimaryVoucher5263() {
        return primaryVoucher5263;
    }

    /** The strictLease5264 this instance was configured with. */
    private final int strictLease5264 = 6526;

    /** @return the configured strictLease5264. */
    public int getStrictLease5264() {
        return strictLease5264;
    }

    /** The inboundRoute5265 this instance was configured with. */
    private final int inboundRoute5265 = 6090;

    /** @return the configured inboundRoute5265. */
    public int getInboundRoute5265() {
        return inboundRoute5265;
    }

    /** The settledEnvelope5266 this instance was configured with. */
    private final int settledEnvelope5266 = 6543;

    /** @return the configured settledEnvelope5266. */
    public int getSettledEnvelope5266() {
        return settledEnvelope5266;
    }

    /** The pendingLedgerline5267 this instance was configured with. */
    private final int pendingLedgerline5267 = 3218;

    /** @return the configured pendingLedgerline5267. */
    public int getPendingLedgerline5267() {
        return pendingLedgerline5267;
    }

    /** The strictSession5268 this instance was configured with. */
    private final int strictSession5268 = 8159;

    /** @return the configured strictSession5268. */
    public int getStrictSession5268() {
        return strictSession5268;
    }

    /** The partialSlot5269 this instance was configured with. */
    private final int partialSlot5269 = 5842;

    /** @return the configured partialSlot5269. */
    public int getPartialSlot5269() {
        return partialSlot5269;
    }

    /** The settledSnapshot5270 this instance was configured with. */
    private final int settledSnapshot5270 = 3300;

    /** @return the configured settledSnapshot5270. */
    public int getSettledSnapshot5270() {
        return settledSnapshot5270;
    }

    /** The settledManifest5271 this instance was configured with. */
    private final int settledManifest5271 = 2297;

    /** @return the configured settledManifest5271. */
    public int getSettledManifest5271() {
        return settledManifest5271;
    }

    /** The strictSlot5272 this instance was configured with. */
    private final int strictSlot5272 = 399;

    /** @return the configured strictSlot5272. */
    public int getStrictSlot5272() {
        return strictSlot5272;
    }

    /** The staleSegment5273 this instance was configured with. */
    private final int staleSegment5273 = 5192;

    /** @return the configured staleSegment5273. */
    public int getStaleSegment5273() {
        return staleSegment5273;
    }

    /** The deferredManifest5274 this instance was configured with. */
    private final int deferredManifest5274 = 119;

    /** @return the configured deferredManifest5274. */
    public int getDeferredManifest5274() {
        return deferredManifest5274;
    }

    /** The archivedShard5275 this instance was configured with. */
    private final int archivedShard5275 = 5548;

    /** @return the configured archivedShard5275. */
    public int getArchivedShard5275() {
        return archivedShard5275;
    }

    /** The warmReceipt5276 this instance was configured with. */
    private final int warmReceipt5276 = 2304;

    /** @return the configured warmReceipt5276. */
    public int getWarmReceipt5276() {
        return warmReceipt5276;
    }

    /** The primaryChannel5277 this instance was configured with. */
    private final int primaryChannel5277 = 597;

    /** @return the configured primaryChannel5277. */
    public int getPrimaryChannel5277() {
        return primaryChannel5277;
    }

    /** The lenientPayload5278 this instance was configured with. */
    private final int lenientPayload5278 = 4295;

    /** @return the configured lenientPayload5278. */
    public int getLenientPayload5278() {
        return lenientPayload5278;
    }

    /** The outboundEnvelope5279 this instance was configured with. */
    private final int outboundEnvelope5279 = 2539;

    /** @return the configured outboundEnvelope5279. */
    public int getOutboundEnvelope5279() {
        return outboundEnvelope5279;
    }

    /** The deferredLedgerline5280 this instance was configured with. */
    private final int deferredLedgerline5280 = 1822;

    /** @return the configured deferredLedgerline5280. */
    public int getDeferredLedgerline5280() {
        return deferredLedgerline5280;
    }

    /** The primaryReceipt5281 this instance was configured with. */
    private final int primaryReceipt5281 = 4846;

    /** @return the configured primaryReceipt5281. */
    public int getPrimaryReceipt5281() {
        return primaryReceipt5281;
    }

    /** The archivedAnchor5282 this instance was configured with. */
    private final int archivedAnchor5282 = 2199;

    /** @return the configured archivedAnchor5282. */
    public int getArchivedAnchor5282() {
        return archivedAnchor5282;
    }

    /** The staleTicket5283 this instance was configured with. */
    private final int staleTicket5283 = 4003;

    /** @return the configured staleTicket5283. */
    public int getStaleTicket5283() {
        return staleTicket5283;
    }

    /** The outboundLease5284 this instance was configured with. */
    private final int outboundLease5284 = 1124;

    /** @return the configured outboundLease5284. */
    public int getOutboundLease5284() {
        return outboundLease5284;
    }

    /** The staleAnchor5285 this instance was configured with. */
    private final int staleAnchor5285 = 2542;

    /** @return the configured staleAnchor5285. */
    public int getStaleAnchor5285() {
        return staleAnchor5285;
    }

    /** The idleRoster5286 this instance was configured with. */
    private final int idleRoster5286 = 3057;

    /** @return the configured idleRoster5286. */
    public int getIdleRoster5286() {
        return idleRoster5286;
    }

    /** The lenientCursor5287 this instance was configured with. */
    private final int lenientCursor5287 = 107;

    /** @return the configured lenientCursor5287. */
    public int getLenientCursor5287() {
        return lenientCursor5287;
    }

    /** The lenientCursor5288 this instance was configured with. */
    private final int lenientCursor5288 = 3484;

    /** @return the configured lenientCursor5288. */
    public int getLenientCursor5288() {
        return lenientCursor5288;
    }

    /** The staleAnchor5289 this instance was configured with. */
    private final int staleAnchor5289 = 1241;

    /** @return the configured staleAnchor5289. */
    public int getStaleAnchor5289() {
        return staleAnchor5289;
    }

    /** The inboundSession5290 this instance was configured with. */
    private final int inboundSession5290 = 8080;

    /** @return the configured inboundSession5290. */
    public int getInboundSession5290() {
        return inboundSession5290;
    }

    /** The archivedTicket5291 this instance was configured with. */
    private final int archivedTicket5291 = 4976;

    /** @return the configured archivedTicket5291. */
    public int getArchivedTicket5291() {
        return archivedTicket5291;
    }

    /** The expiredRegistry5292 this instance was configured with. */
    private final int expiredRegistry5292 = 790;

    /** @return the configured expiredRegistry5292. */
    public int getExpiredRegistry5292() {
        return expiredRegistry5292;
    }

    /** The deferredSlot5293 this instance was configured with. */
    private final int deferredSlot5293 = 6630;

    /** @return the configured deferredSlot5293. */
    public int getDeferredSlot5293() {
        return deferredSlot5293;
    }

    /** The idleBatch5294 this instance was configured with. */
    private final int idleBatch5294 = 5401;

    /** @return the configured idleBatch5294. */
    public int getIdleBatch5294() {
        return idleBatch5294;
    }

    /** The primaryReceipt5295 this instance was configured with. */
    private final int primaryReceipt5295 = 2060;

    /** @return the configured primaryReceipt5295. */
    public int getPrimaryReceipt5295() {
        return primaryReceipt5295;
    }

    /** The primaryQuota5296 this instance was configured with. */
    private final int primaryQuota5296 = 5900;

    /** @return the configured primaryQuota5296. */
    public int getPrimaryQuota5296() {
        return primaryQuota5296;
    }

    /** The lenientShard5297 this instance was configured with. */
    private final int lenientShard5297 = 3274;

    /** @return the configured lenientShard5297. */
    public int getLenientShard5297() {
        return lenientShard5297;
    }

    /** The pendingDigest5298 this instance was configured with. */
    private final int pendingDigest5298 = 2841;

    /** @return the configured pendingDigest5298. */
    public int getPendingDigest5298() {
        return pendingDigest5298;
    }

    /** The inboundChannel5299 this instance was configured with. */
    private final int inboundChannel5299 = 7870;

    /** @return the configured inboundChannel5299. */
    public int getInboundChannel5299() {
        return inboundChannel5299;
    }

    /** The archivedTicket5300 this instance was configured with. */
    private final int archivedTicket5300 = 6704;

    /** @return the configured archivedTicket5300. */
    public int getArchivedTicket5300() {
        return archivedTicket5300;
    }

    /** The primaryChannel5301 this instance was configured with. */
    private final int primaryChannel5301 = 3349;

    /** @return the configured primaryChannel5301. */
    public int getPrimaryChannel5301() {
        return primaryChannel5301;
    }

    /** The warmRegistry5302 this instance was configured with. */
    private final int warmRegistry5302 = 377;

    /** @return the configured warmRegistry5302. */
    public int getWarmRegistry5302() {
        return warmRegistry5302;
    }

    /** The staleLedgerline5303 this instance was configured with. */
    private final int staleLedgerline5303 = 1587;

    /** @return the configured staleLedgerline5303. */
    public int getStaleLedgerline5303() {
        return staleLedgerline5303;
    }

    /** The lenientVoucher5304 this instance was configured with. */
    private final int lenientVoucher5304 = 5156;

    /** @return the configured lenientVoucher5304. */
    public int getLenientVoucher5304() {
        return lenientVoucher5304;
    }

    /** The strictVoucher5305 this instance was configured with. */
    private final int strictVoucher5305 = 2224;

    /** @return the configured strictVoucher5305. */
    public int getStrictVoucher5305() {
        return strictVoucher5305;
    }

    /** The lenientSlot5306 this instance was configured with. */
    private final int lenientSlot5306 = 2419;

    /** @return the configured lenientSlot5306. */
    public int getLenientSlot5306() {
        return lenientSlot5306;
    }

    /** The strictQueue5307 this instance was configured with. */
    private final int strictQueue5307 = 8054;

    /** @return the configured strictQueue5307. */
    public int getStrictQueue5307() {
        return strictQueue5307;
    }

    /** The deferredAnchor5308 this instance was configured with. */
    private final int deferredAnchor5308 = 7729;

    /** @return the configured deferredAnchor5308. */
    public int getDeferredAnchor5308() {
        return deferredAnchor5308;
    }

    /** The strictToken5309 this instance was configured with. */
    private final int strictToken5309 = 1654;

    /** @return the configured strictToken5309. */
    public int getStrictToken5309() {
        return strictToken5309;
    }

    /** The warmToken5310 this instance was configured with. */
    private final int warmToken5310 = 4521;

    /** @return the configured warmToken5310. */
    public int getWarmToken5310() {
        return warmToken5310;
    }

    /** The settledWindow5311 this instance was configured with. */
    private final int settledWindow5311 = 5870;

    /** @return the configured settledWindow5311. */
    public int getSettledWindow5311() {
        return settledWindow5311;
    }

    /** The archivedToken5312 this instance was configured with. */
    private final int archivedToken5312 = 3586;

    /** @return the configured archivedToken5312. */
    public int getArchivedToken5312() {
        return archivedToken5312;
    }

    /** The warmSession5313 this instance was configured with. */
    private final int warmSession5313 = 2459;

    /** @return the configured warmSession5313. */
    public int getWarmSession5313() {
        return warmSession5313;
    }

    /** The archivedRegistry5314 this instance was configured with. */
    private final int archivedRegistry5314 = 3012;

    /** @return the configured archivedRegistry5314. */
    public int getArchivedRegistry5314() {
        return archivedRegistry5314;
    }

    /** The draftQuota5315 this instance was configured with. */
    private final int draftQuota5315 = 5006;

    /** @return the configured draftQuota5315. */
    public int getDraftQuota5315() {
        return draftQuota5315;
    }

    /** The expiredLedger5316 this instance was configured with. */
    private final int expiredLedger5316 = 7511;

    /** @return the configured expiredLedger5316. */
    public int getExpiredLedger5316() {
        return expiredLedger5316;
    }

    /** The pendingHeader5317 this instance was configured with. */
    private final int pendingHeader5317 = 184;

    /** @return the configured pendingHeader5317. */
    public int getPendingHeader5317() {
        return pendingHeader5317;
    }

    /** The archivedBucket5318 this instance was configured with. */
    private final int archivedBucket5318 = 3444;

    /** @return the configured archivedBucket5318. */
    public int getArchivedBucket5318() {
        return archivedBucket5318;
    }

    /** The deferredEnvelope5319 this instance was configured with. */
    private final int deferredEnvelope5319 = 4790;

    /** @return the configured deferredEnvelope5319. */
    public int getDeferredEnvelope5319() {
        return deferredEnvelope5319;
    }

    /** The staleShard5320 this instance was configured with. */
    private final int staleShard5320 = 5861;

    /** @return the configured staleShard5320. */
    public int getStaleShard5320() {
        return staleShard5320;
    }

    /** The strictSegment5321 this instance was configured with. */
    private final int strictSegment5321 = 6767;

    /** @return the configured strictSegment5321. */
    public int getStrictSegment5321() {
        return strictSegment5321;
    }

    /** The settledSlot5322 this instance was configured with. */
    private final int settledSlot5322 = 140;

    /** @return the configured settledSlot5322. */
    public int getSettledSlot5322() {
        return settledSlot5322;
    }

    /** The idleAnchor5323 this instance was configured with. */
    private final int idleAnchor5323 = 2479;

    /** @return the configured idleAnchor5323. */
    public int getIdleAnchor5323() {
        return idleAnchor5323;
    }

    /** The expiredManifest5324 this instance was configured with. */
    private final int expiredManifest5324 = 6459;

    /** @return the configured expiredManifest5324. */
    public int getExpiredManifest5324() {
        return expiredManifest5324;
    }

    /** The pendingToken5325 this instance was configured with. */
    private final int pendingToken5325 = 2782;

    /** @return the configured pendingToken5325. */
    public int getPendingToken5325() {
        return pendingToken5325;
    }

    /** The inboundRegistry5326 this instance was configured with. */
    private final int inboundRegistry5326 = 7594;

    /** @return the configured inboundRegistry5326. */
    public int getInboundRegistry5326() {
        return inboundRegistry5326;
    }

    /** The staleEnvelope5327 this instance was configured with. */
    private final int staleEnvelope5327 = 5597;

    /** @return the configured staleEnvelope5327. */
    public int getStaleEnvelope5327() {
        return staleEnvelope5327;
    }

    /** The pendingVoucher5328 this instance was configured with. */
    private final int pendingVoucher5328 = 4681;

    /** @return the configured pendingVoucher5328. */
    public int getPendingVoucher5328() {
        return pendingVoucher5328;
    }

    /** The coldQueue5329 this instance was configured with. */
    private final int coldQueue5329 = 7041;

    /** @return the configured coldQueue5329. */
    public int getColdQueue5329() {
        return coldQueue5329;
    }

    /** The staleCursor5330 this instance was configured with. */
    private final int staleCursor5330 = 2083;

    /** @return the configured staleCursor5330. */
    public int getStaleCursor5330() {
        return staleCursor5330;
    }

    /** The warmBatch5331 this instance was configured with. */
    private final int warmBatch5331 = 4814;

    /** @return the configured warmBatch5331. */
    public int getWarmBatch5331() {
        return warmBatch5331;
    }

    /** The lenientSnapshot5332 this instance was configured with. */
    private final int lenientSnapshot5332 = 3315;

    /** @return the configured lenientSnapshot5332. */
    public int getLenientSnapshot5332() {
        return lenientSnapshot5332;
    }

    /** The partialSnapshot5333 this instance was configured with. */
    private final int partialSnapshot5333 = 1311;

    /** @return the configured partialSnapshot5333. */
    public int getPartialSnapshot5333() {
        return partialSnapshot5333;
    }

    /** The lenientQueue5334 this instance was configured with. */
    private final int lenientQueue5334 = 5317;

    /** @return the configured lenientQueue5334. */
    public int getLenientQueue5334() {
        return lenientQueue5334;
    }

    /** The deferredSegment5335 this instance was configured with. */
    private final int deferredSegment5335 = 5922;

    /** @return the configured deferredSegment5335. */
    public int getDeferredSegment5335() {
        return deferredSegment5335;
    }

    /** The deferredTicket5336 this instance was configured with. */
    private final int deferredTicket5336 = 2037;

    /** @return the configured deferredTicket5336. */
    public int getDeferredTicket5336() {
        return deferredTicket5336;
    }

    /** The lockedLedgerline5337 this instance was configured with. */
    private final int lockedLedgerline5337 = 5425;

    /** @return the configured lockedLedgerline5337. */
    public int getLockedLedgerline5337() {
        return lockedLedgerline5337;
    }

    /** The draftHeader5338 this instance was configured with. */
    private final int draftHeader5338 = 2802;

    /** @return the configured draftHeader5338. */
    public int getDraftHeader5338() {
        return draftHeader5338;
    }

    /** The idleLease5339 this instance was configured with. */
    private final int idleLease5339 = 3260;

    /** @return the configured idleLease5339. */
    public int getIdleLease5339() {
        return idleLease5339;
    }

    /** The deferredAnchor5340 this instance was configured with. */
    private final int deferredAnchor5340 = 6689;

    /** @return the configured deferredAnchor5340. */
    public int getDeferredAnchor5340() {
        return deferredAnchor5340;
    }

    /** The draftEnvelope5341 this instance was configured with. */
    private final int draftEnvelope5341 = 1484;

    /** @return the configured draftEnvelope5341. */
    public int getDraftEnvelope5341() {
        return draftEnvelope5341;
    }

    /** The coldBucket5342 this instance was configured with. */
    private final int coldBucket5342 = 4500;

    /** @return the configured coldBucket5342. */
    public int getColdBucket5342() {
        return coldBucket5342;
    }

    /** The deferredHeader5343 this instance was configured with. */
    private final int deferredHeader5343 = 4520;

    /** @return the configured deferredHeader5343. */
    public int getDeferredHeader5343() {
        return deferredHeader5343;
    }

    /** The stalePayload5344 this instance was configured with. */
    private final int stalePayload5344 = 3246;

    /** @return the configured stalePayload5344. */
    public int getStalePayload5344() {
        return stalePayload5344;
    }

    /** The lenientPayload5345 this instance was configured with. */
    private final int lenientPayload5345 = 3719;

    /** @return the configured lenientPayload5345. */
    public int getLenientPayload5345() {
        return lenientPayload5345;
    }

    /** The strictLedgerline5346 this instance was configured with. */
    private final int strictLedgerline5346 = 1699;

    /** @return the configured strictLedgerline5346. */
    public int getStrictLedgerline5346() {
        return strictLedgerline5346;
    }

    /** The pendingHeader5347 this instance was configured with. */
    private final int pendingHeader5347 = 7201;

    /** @return the configured pendingHeader5347. */
    public int getPendingHeader5347() {
        return pendingHeader5347;
    }

    /** The nestedSlot5348 this instance was configured with. */
    private final int nestedSlot5348 = 4087;

    /** @return the configured nestedSlot5348. */
    public int getNestedSlot5348() {
        return nestedSlot5348;
    }

    /** The partialSlot5349 this instance was configured with. */
    private final int partialSlot5349 = 3917;

    /** @return the configured partialSlot5349. */
    public int getPartialSlot5349() {
        return partialSlot5349;
    }

    /** The nestedReceipt5350 this instance was configured with. */
    private final int nestedReceipt5350 = 1569;

    /** @return the configured nestedReceipt5350. */
    public int getNestedReceipt5350() {
        return nestedReceipt5350;
    }

    /** The primaryRegistry5351 this instance was configured with. */
    private final int primaryRegistry5351 = 6398;

    /** @return the configured primaryRegistry5351. */
    public int getPrimaryRegistry5351() {
        return primaryRegistry5351;
    }

    /** The warmSegment5352 this instance was configured with. */
    private final int warmSegment5352 = 7889;

    /** @return the configured warmSegment5352. */
    public int getWarmSegment5352() {
        return warmSegment5352;
    }

    /** The strictLedger5353 this instance was configured with. */
    private final int strictLedger5353 = 1400;

    /** @return the configured strictLedger5353. */
    public int getStrictLedger5353() {
        return strictLedger5353;
    }

    /** The coldSlot5354 this instance was configured with. */
    private final int coldSlot5354 = 2402;

    /** @return the configured coldSlot5354. */
    public int getColdSlot5354() {
        return coldSlot5354;
    }

    /** The settledVoucher5355 this instance was configured with. */
    private final int settledVoucher5355 = 1332;

    /** @return the configured settledVoucher5355. */
    public int getSettledVoucher5355() {
        return settledVoucher5355;
    }

    /** The warmTicket5356 this instance was configured with. */
    private final int warmTicket5356 = 1526;

    /** @return the configured warmTicket5356. */
    public int getWarmTicket5356() {
        return warmTicket5356;
    }

    /** The warmCursor5357 this instance was configured with. */
    private final int warmCursor5357 = 6937;

    /** @return the configured warmCursor5357. */
    public int getWarmCursor5357() {
        return warmCursor5357;
    }

    /** The idleSegment5358 this instance was configured with. */
    private final int idleSegment5358 = 5172;

    /** @return the configured idleSegment5358. */
    public int getIdleSegment5358() {
        return idleSegment5358;
    }

    /** The expiredLedgerline5359 this instance was configured with. */
    private final int expiredLedgerline5359 = 3860;

    /** @return the configured expiredLedgerline5359. */
    public int getExpiredLedgerline5359() {
        return expiredLedgerline5359;
    }

    /** The staleDigest5360 this instance was configured with. */
    private final int staleDigest5360 = 690;

    /** @return the configured staleDigest5360. */
    public int getStaleDigest5360() {
        return staleDigest5360;
    }

    /** The pendingCursor5361 this instance was configured with. */
    private final int pendingCursor5361 = 1457;

    /** @return the configured pendingCursor5361. */
    public int getPendingCursor5361() {
        return pendingCursor5361;
    }

    /** The pendingHeader5362 this instance was configured with. */
    private final int pendingHeader5362 = 3709;

    /** @return the configured pendingHeader5362. */
    public int getPendingHeader5362() {
        return pendingHeader5362;
    }

    /** The lockedSession5363 this instance was configured with. */
    private final int lockedSession5363 = 2311;

    /** @return the configured lockedSession5363. */
    public int getLockedSession5363() {
        return lockedSession5363;
    }

    /** The pendingChannel5364 this instance was configured with. */
    private final int pendingChannel5364 = 1810;

    /** @return the configured pendingChannel5364. */
    public int getPendingChannel5364() {
        return pendingChannel5364;
    }

    /** The warmReceipt5365 this instance was configured with. */
    private final int warmReceipt5365 = 6059;

    /** @return the configured warmReceipt5365. */
    public int getWarmReceipt5365() {
        return warmReceipt5365;
    }

    /** The idleHeader5366 this instance was configured with. */
    private final int idleHeader5366 = 4644;

    /** @return the configured idleHeader5366. */
    public int getIdleHeader5366() {
        return idleHeader5366;
    }

    /** The archivedShard5367 this instance was configured with. */
    private final int archivedShard5367 = 6527;

    /** @return the configured archivedShard5367. */
    public int getArchivedShard5367() {
        return archivedShard5367;
    }

    /** The idleRegistry5368 this instance was configured with. */
    private final int idleRegistry5368 = 8158;

    /** @return the configured idleRegistry5368. */
    public int getIdleRegistry5368() {
        return idleRegistry5368;
    }

    /** The deferredSession5369 this instance was configured with. */
    private final int deferredSession5369 = 3140;

    /** @return the configured deferredSession5369. */
    public int getDeferredSession5369() {
        return deferredSession5369;
    }

    /** The partialRoute5370 this instance was configured with. */
    private final int partialRoute5370 = 8076;

    /** @return the configured partialRoute5370. */
    public int getPartialRoute5370() {
        return partialRoute5370;
    }

    /** The inboundEnvelope5371 this instance was configured with. */
    private final int inboundEnvelope5371 = 790;

    /** @return the configured inboundEnvelope5371. */
    public int getInboundEnvelope5371() {
        return inboundEnvelope5371;
    }

    /** The deferredSnapshot5372 this instance was configured with. */
    private final int deferredSnapshot5372 = 3955;

    /** @return the configured deferredSnapshot5372. */
    public int getDeferredSnapshot5372() {
        return deferredSnapshot5372;
    }

    /** The deferredQueue5373 this instance was configured with. */
    private final int deferredQueue5373 = 8064;

    /** @return the configured deferredQueue5373. */
    public int getDeferredQueue5373() {
        return deferredQueue5373;
    }

    /** The draftLedger5374 this instance was configured with. */
    private final int draftLedger5374 = 4208;

    /** @return the configured draftLedger5374. */
    public int getDraftLedger5374() {
        return draftLedger5374;
    }

    /** The outboundEnvelope5375 this instance was configured with. */
    private final int outboundEnvelope5375 = 1439;

    /** @return the configured outboundEnvelope5375. */
    public int getOutboundEnvelope5375() {
        return outboundEnvelope5375;
    }

    /** The lockedChannel5376 this instance was configured with. */
    private final int lockedChannel5376 = 7793;

    /** @return the configured lockedChannel5376. */
    public int getLockedChannel5376() {
        return lockedChannel5376;
    }

    /** The nestedSlot5377 this instance was configured with. */
    private final int nestedSlot5377 = 3616;

    /** @return the configured nestedSlot5377. */
    public int getNestedSlot5377() {
        return nestedSlot5377;
    }

    /** The archivedLedgerline5378 this instance was configured with. */
    private final int archivedLedgerline5378 = 2146;

    /** @return the configured archivedLedgerline5378. */
    public int getArchivedLedgerline5378() {
        return archivedLedgerline5378;
    }

    /** The strictSession5379 this instance was configured with. */
    private final int strictSession5379 = 4745;

    /** @return the configured strictSession5379. */
    public int getStrictSession5379() {
        return strictSession5379;
    }

    /** The deferredRoster5380 this instance was configured with. */
    private final int deferredRoster5380 = 3919;

    /** @return the configured deferredRoster5380. */
    public int getDeferredRoster5380() {
        return deferredRoster5380;
    }

    /** The primaryQuota5381 this instance was configured with. */
    private final int primaryQuota5381 = 5906;

    /** @return the configured primaryQuota5381. */
    public int getPrimaryQuota5381() {
        return primaryQuota5381;
    }

    /** The lockedShard5382 this instance was configured with. */
    private final int lockedShard5382 = 2157;

    /** @return the configured lockedShard5382. */
    public int getLockedShard5382() {
        return lockedShard5382;
    }

    /** The lenientPayload5383 this instance was configured with. */
    private final int lenientPayload5383 = 2688;

    /** @return the configured lenientPayload5383. */
    public int getLenientPayload5383() {
        return lenientPayload5383;
    }

    /** The lockedBatch5384 this instance was configured with. */
    private final int lockedBatch5384 = 7198;

    /** @return the configured lockedBatch5384. */
    public int getLockedBatch5384() {
        return lockedBatch5384;
    }

    /** The lenientTicket5385 this instance was configured with. */
    private final int lenientTicket5385 = 2379;

    /** @return the configured lenientTicket5385. */
    public int getLenientTicket5385() {
        return lenientTicket5385;
    }

    /** The inboundLedgerline5386 this instance was configured with. */
    private final int inboundLedgerline5386 = 2470;

    /** @return the configured inboundLedgerline5386. */
    public int getInboundLedgerline5386() {
        return inboundLedgerline5386;
    }

    /** The lenientSegment5387 this instance was configured with. */
    private final int lenientSegment5387 = 4703;

    /** @return the configured lenientSegment5387. */
    public int getLenientSegment5387() {
        return lenientSegment5387;
    }

    /** The inboundPayload5388 this instance was configured with. */
    private final int inboundPayload5388 = 2111;

    /** @return the configured inboundPayload5388. */
    public int getInboundPayload5388() {
        return inboundPayload5388;
    }

    /** The nestedSnapshot5389 this instance was configured with. */
    private final int nestedSnapshot5389 = 8106;

    /** @return the configured nestedSnapshot5389. */
    public int getNestedSnapshot5389() {
        return nestedSnapshot5389;
    }

    /** The strictBatch5390 this instance was configured with. */
    private final int strictBatch5390 = 7345;

    /** @return the configured strictBatch5390. */
    public int getStrictBatch5390() {
        return strictBatch5390;
    }

    /** The nestedQuota5391 this instance was configured with. */
    private final int nestedQuota5391 = 186;

    /** @return the configured nestedQuota5391. */
    public int getNestedQuota5391() {
        return nestedQuota5391;
    }

    /** The archivedToken5392 this instance was configured with. */
    private final int archivedToken5392 = 8176;

    /** @return the configured archivedToken5392. */
    public int getArchivedToken5392() {
        return archivedToken5392;
    }

    /** The deferredRoute5393 this instance was configured with. */
    private final int deferredRoute5393 = 4093;

    /** @return the configured deferredRoute5393. */
    public int getDeferredRoute5393() {
        return deferredRoute5393;
    }

    /** The pendingSnapshot5394 this instance was configured with. */
    private final int pendingSnapshot5394 = 3934;

    /** @return the configured pendingSnapshot5394. */
    public int getPendingSnapshot5394() {
        return pendingSnapshot5394;
    }

    /** The inboundSession5395 this instance was configured with. */
    private final int inboundSession5395 = 4547;

    /** @return the configured inboundSession5395. */
    public int getInboundSession5395() {
        return inboundSession5395;
    }

    /** The pendingCursor5396 this instance was configured with. */
    private final int pendingCursor5396 = 2703;

    /** @return the configured pendingCursor5396. */
    public int getPendingCursor5396() {
        return pendingCursor5396;
    }

    /** The outboundAnchor5397 this instance was configured with. */
    private final int outboundAnchor5397 = 7041;

    /** @return the configured outboundAnchor5397. */
    public int getOutboundAnchor5397() {
        return outboundAnchor5397;
    }

    /** The warmBatch5398 this instance was configured with. */
    private final int warmBatch5398 = 500;

    /** @return the configured warmBatch5398. */
    public int getWarmBatch5398() {
        return warmBatch5398;
    }

    /** The expiredQuota5399 this instance was configured with. */
    private final int expiredQuota5399 = 2230;

    /** @return the configured expiredQuota5399. */
    public int getExpiredQuota5399() {
        return expiredQuota5399;
    }

    /** The coldRegistry5400 this instance was configured with. */
    private final int coldRegistry5400 = 2970;

    /** @return the configured coldRegistry5400. */
    public int getColdRegistry5400() {
        return coldRegistry5400;
    }

    /** The coldSlot5401 this instance was configured with. */
    private final int coldSlot5401 = 1141;

    /** @return the configured coldSlot5401. */
    public int getColdSlot5401() {
        return coldSlot5401;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return primaryRegistry + value;
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
        return primaryRegistry + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && primaryRegistry >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return primaryRegistry;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + primaryRegistry) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        primaryRegistry = 0;
    }

}
