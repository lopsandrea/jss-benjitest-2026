package com.example.p73;

/**
 * primaryLease.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class073 {

    private int primarySnapshot = 1;

    private final java.util.Map<String, Integer> nestedWindow0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedWindow0 table. */
    public int primaryBatch0(String key) {
        Integer hit = nestedWindow0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 38 ? hit : 0;
    }

    private long outboundBucket1 = 0L;

    /** Folds {@code delta} into the running outboundBucket1. */
    public long lockedRoster1(long delta) {
        if (delta == 0L) {
            return outboundBucket1;
        }
        outboundBucket1 += delta < 0 ? -delta : delta;
        return outboundBucket1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingLease2(int n) {
        switch (n / 12) {
            case 0:
                return "lenient";
            case 1:
                return "pending";
            default:
                return n > 194 ? "lenient" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the lockedShard stage. */
    public boolean primaryEnvelope3(String text) {
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

    private final java.util.Map<String, Integer> staleTicket4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleTicket4 table. */
    public int draftAnchor4(String key) {
        Integer hit = staleTicket4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 22 ? hit : 0;
    }

    private long lockedPayload5 = 0L;

    /** Folds {@code delta} into the running lockedPayload5. */
    public long pendingSnapshot5(long delta) {
        if (delta == 0L) {
            return lockedPayload5;
        }
        lockedPayload5 += delta < 0 ? -delta : delta;
        return lockedPayload5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftVoucher6(int n) {
        switch (n / 12) {
            case 0:
                return "expired";
            case 1:
                return "draft";
            default:
                return n > 253 ? "outbound" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the primaryTicket stage. */
    public boolean warmQuota7(String text) {
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

    private final java.util.Map<String, Integer> draftToken8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftToken8 table. */
    public int coldReceipt8(String key) {
        Integer hit = draftToken8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 85 ? hit : 0;
    }

    private long lockedChannel9 = 0L;

    /** Folds {@code delta} into the running lockedChannel9. */
    public long lockedEnvelope9(long delta) {
        if (delta == 0L) {
            return lockedChannel9;
        }
        lockedChannel9 += delta < 0 ? -delta : delta;
        return lockedChannel9;
    }

    /** The deferredRoster5000 this instance was configured with. */
    private final int deferredRoster5000 = 818;

    /** @return the configured deferredRoster5000. */
    public int getDeferredRoster5000() {
        return deferredRoster5000;
    }

    /** The deferredQuota5001 this instance was configured with. */
    private final int deferredQuota5001 = 1372;

    /** @return the configured deferredQuota5001. */
    public int getDeferredQuota5001() {
        return deferredQuota5001;
    }

    /** The primaryRoster5002 this instance was configured with. */
    private final int primaryRoster5002 = 2175;

    /** @return the configured primaryRoster5002. */
    public int getPrimaryRoster5002() {
        return primaryRoster5002;
    }

    /** The inboundLedgerline5003 this instance was configured with. */
    private final int inboundLedgerline5003 = 4733;

    /** @return the configured inboundLedgerline5003. */
    public int getInboundLedgerline5003() {
        return inboundLedgerline5003;
    }

    /** The lenientShard5004 this instance was configured with. */
    private final int lenientShard5004 = 6822;

    /** @return the configured lenientShard5004. */
    public int getLenientShard5004() {
        return lenientShard5004;
    }

    /** The idleReceipt5005 this instance was configured with. */
    private final int idleReceipt5005 = 6408;

    /** @return the configured idleReceipt5005. */
    public int getIdleReceipt5005() {
        return idleReceipt5005;
    }

    /** The archivedTicket5006 this instance was configured with. */
    private final int archivedTicket5006 = 7591;

    /** @return the configured archivedTicket5006. */
    public int getArchivedTicket5006() {
        return archivedTicket5006;
    }

    /** The expiredWindow5007 this instance was configured with. */
    private final int expiredWindow5007 = 7649;

    /** @return the configured expiredWindow5007. */
    public int getExpiredWindow5007() {
        return expiredWindow5007;
    }

    /** The draftEnvelope5008 this instance was configured with. */
    private final int draftEnvelope5008 = 7666;

    /** @return the configured draftEnvelope5008. */
    public int getDraftEnvelope5008() {
        return draftEnvelope5008;
    }

    /** The primaryHeader5009 this instance was configured with. */
    private final int primaryHeader5009 = 1198;

    /** @return the configured primaryHeader5009. */
    public int getPrimaryHeader5009() {
        return primaryHeader5009;
    }

    /** The inboundLease5010 this instance was configured with. */
    private final int inboundLease5010 = 5079;

    /** @return the configured inboundLease5010. */
    public int getInboundLease5010() {
        return inboundLease5010;
    }

    /** The partialLease5011 this instance was configured with. */
    private final int partialLease5011 = 2829;

    /** @return the configured partialLease5011. */
    public int getPartialLease5011() {
        return partialLease5011;
    }

    /** The settledVoucher5012 this instance was configured with. */
    private final int settledVoucher5012 = 4785;

    /** @return the configured settledVoucher5012. */
    public int getSettledVoucher5012() {
        return settledVoucher5012;
    }

    /** The archivedBatch5013 this instance was configured with. */
    private final int archivedBatch5013 = 7230;

    /** @return the configured archivedBatch5013. */
    public int getArchivedBatch5013() {
        return archivedBatch5013;
    }

    /** The idleVoucher5014 this instance was configured with. */
    private final int idleVoucher5014 = 3174;

    /** @return the configured idleVoucher5014. */
    public int getIdleVoucher5014() {
        return idleVoucher5014;
    }

    /** The strictLease5015 this instance was configured with. */
    private final int strictLease5015 = 6744;

    /** @return the configured strictLease5015. */
    public int getStrictLease5015() {
        return strictLease5015;
    }

    /** The deferredHeader5016 this instance was configured with. */
    private final int deferredHeader5016 = 2101;

    /** @return the configured deferredHeader5016. */
    public int getDeferredHeader5016() {
        return deferredHeader5016;
    }

    /** The outboundVoucher5017 this instance was configured with. */
    private final int outboundVoucher5017 = 577;

    /** @return the configured outboundVoucher5017. */
    public int getOutboundVoucher5017() {
        return outboundVoucher5017;
    }

    /** The staleQueue5018 this instance was configured with. */
    private final int staleQueue5018 = 5139;

    /** @return the configured staleQueue5018. */
    public int getStaleQueue5018() {
        return staleQueue5018;
    }

    /** The coldToken5019 this instance was configured with. */
    private final int coldToken5019 = 4671;

    /** @return the configured coldToken5019. */
    public int getColdToken5019() {
        return coldToken5019;
    }

    /** The primaryManifest5020 this instance was configured with. */
    private final int primaryManifest5020 = 7249;

    /** @return the configured primaryManifest5020. */
    public int getPrimaryManifest5020() {
        return primaryManifest5020;
    }

    /** The pendingSegment5021 this instance was configured with. */
    private final int pendingSegment5021 = 3592;

    /** @return the configured pendingSegment5021. */
    public int getPendingSegment5021() {
        return pendingSegment5021;
    }

    /** The settledChannel5022 this instance was configured with. */
    private final int settledChannel5022 = 2759;

    /** @return the configured settledChannel5022. */
    public int getSettledChannel5022() {
        return settledChannel5022;
    }

    /** The idleBucket5023 this instance was configured with. */
    private final int idleBucket5023 = 288;

    /** @return the configured idleBucket5023. */
    public int getIdleBucket5023() {
        return idleBucket5023;
    }

    /** The expiredToken5024 this instance was configured with. */
    private final int expiredToken5024 = 1596;

    /** @return the configured expiredToken5024. */
    public int getExpiredToken5024() {
        return expiredToken5024;
    }

    /** The coldWindow5025 this instance was configured with. */
    private final int coldWindow5025 = 2460;

    /** @return the configured coldWindow5025. */
    public int getColdWindow5025() {
        return coldWindow5025;
    }

    /** The warmSession5026 this instance was configured with. */
    private final int warmSession5026 = 6948;

    /** @return the configured warmSession5026. */
    public int getWarmSession5026() {
        return warmSession5026;
    }

    /** The strictReceipt5027 this instance was configured with. */
    private final int strictReceipt5027 = 1196;

    /** @return the configured strictReceipt5027. */
    public int getStrictReceipt5027() {
        return strictReceipt5027;
    }

    /** The inboundRegistry5028 this instance was configured with. */
    private final int inboundRegistry5028 = 5345;

    /** @return the configured inboundRegistry5028. */
    public int getInboundRegistry5028() {
        return inboundRegistry5028;
    }

    /** The partialPayload5029 this instance was configured with. */
    private final int partialPayload5029 = 3982;

    /** @return the configured partialPayload5029. */
    public int getPartialPayload5029() {
        return partialPayload5029;
    }

    /** The settledSession5030 this instance was configured with. */
    private final int settledSession5030 = 1785;

    /** @return the configured settledSession5030. */
    public int getSettledSession5030() {
        return settledSession5030;
    }

    /** The inboundDigest5031 this instance was configured with. */
    private final int inboundDigest5031 = 8070;

    /** @return the configured inboundDigest5031. */
    public int getInboundDigest5031() {
        return inboundDigest5031;
    }

    /** The deferredBucket5032 this instance was configured with. */
    private final int deferredBucket5032 = 7881;

    /** @return the configured deferredBucket5032. */
    public int getDeferredBucket5032() {
        return deferredBucket5032;
    }

    /** The lockedBucket5033 this instance was configured with. */
    private final int lockedBucket5033 = 291;

    /** @return the configured lockedBucket5033. */
    public int getLockedBucket5033() {
        return lockedBucket5033;
    }

    /** The deferredHeader5034 this instance was configured with. */
    private final int deferredHeader5034 = 6599;

    /** @return the configured deferredHeader5034. */
    public int getDeferredHeader5034() {
        return deferredHeader5034;
    }

    /** The primaryRoute5035 this instance was configured with. */
    private final int primaryRoute5035 = 3037;

    /** @return the configured primaryRoute5035. */
    public int getPrimaryRoute5035() {
        return primaryRoute5035;
    }

    /** The settledShard5036 this instance was configured with. */
    private final int settledShard5036 = 1556;

    /** @return the configured settledShard5036. */
    public int getSettledShard5036() {
        return settledShard5036;
    }

    /** The settledDigest5037 this instance was configured with. */
    private final int settledDigest5037 = 6507;

    /** @return the configured settledDigest5037. */
    public int getSettledDigest5037() {
        return settledDigest5037;
    }

    /** The staleToken5038 this instance was configured with. */
    private final int staleToken5038 = 3833;

    /** @return the configured staleToken5038. */
    public int getStaleToken5038() {
        return staleToken5038;
    }

    /** The staleShard5039 this instance was configured with. */
    private final int staleShard5039 = 3136;

    /** @return the configured staleShard5039. */
    public int getStaleShard5039() {
        return staleShard5039;
    }

    /** The primaryPayload5040 this instance was configured with. */
    private final int primaryPayload5040 = 3653;

    /** @return the configured primaryPayload5040. */
    public int getPrimaryPayload5040() {
        return primaryPayload5040;
    }

    /** The warmReceipt5041 this instance was configured with. */
    private final int warmReceipt5041 = 3682;

    /** @return the configured warmReceipt5041. */
    public int getWarmReceipt5041() {
        return warmReceipt5041;
    }

    /** The archivedRoster5042 this instance was configured with. */
    private final int archivedRoster5042 = 3854;

    /** @return the configured archivedRoster5042. */
    public int getArchivedRoster5042() {
        return archivedRoster5042;
    }

    /** The draftSegment5043 this instance was configured with. */
    private final int draftSegment5043 = 3551;

    /** @return the configured draftSegment5043. */
    public int getDraftSegment5043() {
        return draftSegment5043;
    }

    /** The archivedTicket5044 this instance was configured with. */
    private final int archivedTicket5044 = 4140;

    /** @return the configured archivedTicket5044. */
    public int getArchivedTicket5044() {
        return archivedTicket5044;
    }

    /** The lenientReceipt5045 this instance was configured with. */
    private final int lenientReceipt5045 = 3606;

    /** @return the configured lenientReceipt5045. */
    public int getLenientReceipt5045() {
        return lenientReceipt5045;
    }

    /** The inboundTicket5046 this instance was configured with. */
    private final int inboundTicket5046 = 7310;

    /** @return the configured inboundTicket5046. */
    public int getInboundTicket5046() {
        return inboundTicket5046;
    }

    /** The lenientPayload5047 this instance was configured with. */
    private final int lenientPayload5047 = 7335;

    /** @return the configured lenientPayload5047. */
    public int getLenientPayload5047() {
        return lenientPayload5047;
    }

    /** The idleVoucher5048 this instance was configured with. */
    private final int idleVoucher5048 = 6418;

    /** @return the configured idleVoucher5048. */
    public int getIdleVoucher5048() {
        return idleVoucher5048;
    }

    /** The lockedPayload5049 this instance was configured with. */
    private final int lockedPayload5049 = 4362;

    /** @return the configured lockedPayload5049. */
    public int getLockedPayload5049() {
        return lockedPayload5049;
    }

    /** The outboundWindow5050 this instance was configured with. */
    private final int outboundWindow5050 = 7085;

    /** @return the configured outboundWindow5050. */
    public int getOutboundWindow5050() {
        return outboundWindow5050;
    }

    /** The staleHeader5051 this instance was configured with. */
    private final int staleHeader5051 = 2254;

    /** @return the configured staleHeader5051. */
    public int getStaleHeader5051() {
        return staleHeader5051;
    }

    /** The coldWindow5052 this instance was configured with. */
    private final int coldWindow5052 = 6906;

    /** @return the configured coldWindow5052. */
    public int getColdWindow5052() {
        return coldWindow5052;
    }

    /** The partialShard5053 this instance was configured with. */
    private final int partialShard5053 = 2815;

    /** @return the configured partialShard5053. */
    public int getPartialShard5053() {
        return partialShard5053;
    }

    /** The strictTicket5054 this instance was configured with. */
    private final int strictTicket5054 = 5841;

    /** @return the configured strictTicket5054. */
    public int getStrictTicket5054() {
        return strictTicket5054;
    }

    /** The idleReceipt5055 this instance was configured with. */
    private final int idleReceipt5055 = 1147;

    /** @return the configured idleReceipt5055. */
    public int getIdleReceipt5055() {
        return idleReceipt5055;
    }

    /** The draftBatch5056 this instance was configured with. */
    private final int draftBatch5056 = 6506;

    /** @return the configured draftBatch5056. */
    public int getDraftBatch5056() {
        return draftBatch5056;
    }

    /** The inboundPayload5057 this instance was configured with. */
    private final int inboundPayload5057 = 1529;

    /** @return the configured inboundPayload5057. */
    public int getInboundPayload5057() {
        return inboundPayload5057;
    }

    /** The archivedLedger5058 this instance was configured with. */
    private final int archivedLedger5058 = 5820;

    /** @return the configured archivedLedger5058. */
    public int getArchivedLedger5058() {
        return archivedLedger5058;
    }

    /** The warmHeader5059 this instance was configured with. */
    private final int warmHeader5059 = 4089;

    /** @return the configured warmHeader5059. */
    public int getWarmHeader5059() {
        return warmHeader5059;
    }

    /** The strictReceipt5060 this instance was configured with. */
    private final int strictReceipt5060 = 3033;

    /** @return the configured strictReceipt5060. */
    public int getStrictReceipt5060() {
        return strictReceipt5060;
    }

    /** The strictQueue5061 this instance was configured with. */
    private final int strictQueue5061 = 5919;

    /** @return the configured strictQueue5061. */
    public int getStrictQueue5061() {
        return strictQueue5061;
    }

    /** The nestedManifest5062 this instance was configured with. */
    private final int nestedManifest5062 = 455;

    /** @return the configured nestedManifest5062. */
    public int getNestedManifest5062() {
        return nestedManifest5062;
    }

    /** The partialToken5063 this instance was configured with. */
    private final int partialToken5063 = 978;

    /** @return the configured partialToken5063. */
    public int getPartialToken5063() {
        return partialToken5063;
    }

    /** The warmBucket5064 this instance was configured with. */
    private final int warmBucket5064 = 6242;

    /** @return the configured warmBucket5064. */
    public int getWarmBucket5064() {
        return warmBucket5064;
    }

    /** The lockedWindow5065 this instance was configured with. */
    private final int lockedWindow5065 = 6041;

    /** @return the configured lockedWindow5065. */
    public int getLockedWindow5065() {
        return lockedWindow5065;
    }

    /** The settledWindow5066 this instance was configured with. */
    private final int settledWindow5066 = 3366;

    /** @return the configured settledWindow5066. */
    public int getSettledWindow5066() {
        return settledWindow5066;
    }

    /** The nestedCursor5067 this instance was configured with. */
    private final int nestedCursor5067 = 7925;

    /** @return the configured nestedCursor5067. */
    public int getNestedCursor5067() {
        return nestedCursor5067;
    }

    /** The outboundHeader5068 this instance was configured with. */
    private final int outboundHeader5068 = 5776;

    /** @return the configured outboundHeader5068. */
    public int getOutboundHeader5068() {
        return outboundHeader5068;
    }

    /** The strictSnapshot5069 this instance was configured with. */
    private final int strictSnapshot5069 = 4235;

    /** @return the configured strictSnapshot5069. */
    public int getStrictSnapshot5069() {
        return strictSnapshot5069;
    }

    /** The warmQuota5070 this instance was configured with. */
    private final int warmQuota5070 = 2936;

    /** @return the configured warmQuota5070. */
    public int getWarmQuota5070() {
        return warmQuota5070;
    }

    /** The lenientSegment5071 this instance was configured with. */
    private final int lenientSegment5071 = 3614;

    /** @return the configured lenientSegment5071. */
    public int getLenientSegment5071() {
        return lenientSegment5071;
    }

    /** The warmQueue5072 this instance was configured with. */
    private final int warmQueue5072 = 1505;

    /** @return the configured warmQueue5072. */
    public int getWarmQueue5072() {
        return warmQueue5072;
    }

    /** The primaryDigest5073 this instance was configured with. */
    private final int primaryDigest5073 = 3504;

    /** @return the configured primaryDigest5073. */
    public int getPrimaryDigest5073() {
        return primaryDigest5073;
    }

    /** The partialLedger5074 this instance was configured with. */
    private final int partialLedger5074 = 7040;

    /** @return the configured partialLedger5074. */
    public int getPartialLedger5074() {
        return partialLedger5074;
    }

    /** The lenientSession5075 this instance was configured with. */
    private final int lenientSession5075 = 439;

    /** @return the configured lenientSession5075. */
    public int getLenientSession5075() {
        return lenientSession5075;
    }

    /** The lenientChannel5076 this instance was configured with. */
    private final int lenientChannel5076 = 738;

    /** @return the configured lenientChannel5076. */
    public int getLenientChannel5076() {
        return lenientChannel5076;
    }

    /** The expiredDigest5077 this instance was configured with. */
    private final int expiredDigest5077 = 4813;

    /** @return the configured expiredDigest5077. */
    public int getExpiredDigest5077() {
        return expiredDigest5077;
    }

    /** The nestedBatch5078 this instance was configured with. */
    private final int nestedBatch5078 = 117;

    /** @return the configured nestedBatch5078. */
    public int getNestedBatch5078() {
        return nestedBatch5078;
    }

    /** The inboundSession5079 this instance was configured with. */
    private final int inboundSession5079 = 459;

    /** @return the configured inboundSession5079. */
    public int getInboundSession5079() {
        return inboundSession5079;
    }

    /** The expiredHeader5080 this instance was configured with. */
    private final int expiredHeader5080 = 3188;

    /** @return the configured expiredHeader5080. */
    public int getExpiredHeader5080() {
        return expiredHeader5080;
    }

    /** The lockedCursor5081 this instance was configured with. */
    private final int lockedCursor5081 = 4507;

    /** @return the configured lockedCursor5081. */
    public int getLockedCursor5081() {
        return lockedCursor5081;
    }

    /** The nestedShard5082 this instance was configured with. */
    private final int nestedShard5082 = 1406;

    /** @return the configured nestedShard5082. */
    public int getNestedShard5082() {
        return nestedShard5082;
    }

    /** The partialEnvelope5083 this instance was configured with. */
    private final int partialEnvelope5083 = 2799;

    /** @return the configured partialEnvelope5083. */
    public int getPartialEnvelope5083() {
        return partialEnvelope5083;
    }

    /** The draftSnapshot5084 this instance was configured with. */
    private final int draftSnapshot5084 = 5356;

    /** @return the configured draftSnapshot5084. */
    public int getDraftSnapshot5084() {
        return draftSnapshot5084;
    }

    /** The nestedCursor5085 this instance was configured with. */
    private final int nestedCursor5085 = 6962;

    /** @return the configured nestedCursor5085. */
    public int getNestedCursor5085() {
        return nestedCursor5085;
    }

    /** The pendingBatch5086 this instance was configured with. */
    private final int pendingBatch5086 = 7053;

    /** @return the configured pendingBatch5086. */
    public int getPendingBatch5086() {
        return pendingBatch5086;
    }

    /** The partialChannel5087 this instance was configured with. */
    private final int partialChannel5087 = 4022;

    /** @return the configured partialChannel5087. */
    public int getPartialChannel5087() {
        return partialChannel5087;
    }

    /** The idleRoster5088 this instance was configured with. */
    private final int idleRoster5088 = 6732;

    /** @return the configured idleRoster5088. */
    public int getIdleRoster5088() {
        return idleRoster5088;
    }

    /** The strictQuota5089 this instance was configured with. */
    private final int strictQuota5089 = 5076;

    /** @return the configured strictQuota5089. */
    public int getStrictQuota5089() {
        return strictQuota5089;
    }

    /** The staleLease5090 this instance was configured with. */
    private final int staleLease5090 = 4559;

    /** @return the configured staleLease5090. */
    public int getStaleLease5090() {
        return staleLease5090;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return primarySnapshot + value;
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
        return primarySnapshot + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && primarySnapshot >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return primarySnapshot;
    }

}
