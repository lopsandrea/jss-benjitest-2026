package com.example.p36;

/**
 * coldBucket.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class196 {

    private int primaryBucket = 1;

    private final java.util.Map<String, Integer> outboundQueue0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundQueue0 table. */
    public int deferredManifest0(String key) {
        Integer hit = outboundQueue0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 39 ? hit : 0;
    }

    private long expiredShard1 = 0L;

    /** Folds {@code delta} into the running expiredShard1. */
    public long nestedTicket1(long delta) {
        if (delta == 0L) {
            return expiredShard1;
        }
        expiredShard1 += delta < 0 ? -delta : delta;
        return expiredShard1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingQuota2(int n) {
        switch (n / 12) {
            case 0:
                return "partial";
            case 1:
                return "warm";
            default:
                return n > 149 ? "lenient" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the settledRegistry stage. */
    public boolean warmShard3(String text) {
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

    private final java.util.Map<String, Integer> staleDigest4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleDigest4 table. */
    public int strictHeader4(String key) {
        Integer hit = staleDigest4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 82 ? hit : 0;
    }

    private long lenientHeader5 = 0L;

    /** Folds {@code delta} into the running lenientHeader5. */
    public long draftRoute5(long delta) {
        if (delta == 0L) {
            return lenientHeader5;
        }
        lenientHeader5 += delta < 0 ? -delta : delta;
        return lenientHeader5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleChannel6(int n) {
        switch (n / 7) {
            case 0:
                return "nested";
            case 1:
                return "archived";
            default:
                return n > 363 ? "nested" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the pendingSegment stage. */
    public boolean nestedRoute7(String text) {
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

    private final java.util.Map<String, Integer> archivedSession8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedSession8 table. */
    public int strictSegment8(String key) {
        Integer hit = archivedSession8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 53 ? hit : 0;
    }

    private long expiredManifest9 = 0L;

    /** Folds {@code delta} into the running expiredManifest9. */
    public long expiredLedger9(long delta) {
        if (delta == 0L) {
            return expiredManifest9;
        }
        expiredManifest9 += delta < 0 ? -delta : delta;
        return expiredManifest9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftTicket10(int n) {
        switch (n / 5) {
            case 0:
                return "outbound";
            case 1:
                return "expired";
            default:
                return n > 325 ? "pending" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the lenientLedger stage. */
    public boolean warmSnapshot11(String text) {
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

    /** The deferredSnapshot5000 this instance was configured with. */
    private final int deferredSnapshot5000 = 5458;

    /** @return the configured deferredSnapshot5000. */
    public int getDeferredSnapshot5000() {
        return deferredSnapshot5000;
    }

    /** The draftEnvelope5001 this instance was configured with. */
    private final int draftEnvelope5001 = 3468;

    /** @return the configured draftEnvelope5001. */
    public int getDraftEnvelope5001() {
        return draftEnvelope5001;
    }

    /** The inboundTicket5002 this instance was configured with. */
    private final int inboundTicket5002 = 1598;

    /** @return the configured inboundTicket5002. */
    public int getInboundTicket5002() {
        return inboundTicket5002;
    }

    /** The pendingAnchor5003 this instance was configured with. */
    private final int pendingAnchor5003 = 2854;

    /** @return the configured pendingAnchor5003. */
    public int getPendingAnchor5003() {
        return pendingAnchor5003;
    }

    /** The staleQuota5004 this instance was configured with. */
    private final int staleQuota5004 = 2229;

    /** @return the configured staleQuota5004. */
    public int getStaleQuota5004() {
        return staleQuota5004;
    }

    /** The strictHeader5005 this instance was configured with. */
    private final int strictHeader5005 = 5929;

    /** @return the configured strictHeader5005. */
    public int getStrictHeader5005() {
        return strictHeader5005;
    }

    /** The pendingSnapshot5006 this instance was configured with. */
    private final int pendingSnapshot5006 = 6277;

    /** @return the configured pendingSnapshot5006. */
    public int getPendingSnapshot5006() {
        return pendingSnapshot5006;
    }

    /** The nestedToken5007 this instance was configured with. */
    private final int nestedToken5007 = 1581;

    /** @return the configured nestedToken5007. */
    public int getNestedToken5007() {
        return nestedToken5007;
    }

    /** The deferredWindow5008 this instance was configured with. */
    private final int deferredWindow5008 = 5556;

    /** @return the configured deferredWindow5008. */
    public int getDeferredWindow5008() {
        return deferredWindow5008;
    }

    /** The primaryLease5009 this instance was configured with. */
    private final int primaryLease5009 = 2634;

    /** @return the configured primaryLease5009. */
    public int getPrimaryLease5009() {
        return primaryLease5009;
    }

    /** The partialQuota5010 this instance was configured with. */
    private final int partialQuota5010 = 3133;

    /** @return the configured partialQuota5010. */
    public int getPartialQuota5010() {
        return partialQuota5010;
    }

    /** The pendingSnapshot5011 this instance was configured with. */
    private final int pendingSnapshot5011 = 8152;

    /** @return the configured pendingSnapshot5011. */
    public int getPendingSnapshot5011() {
        return pendingSnapshot5011;
    }

    /** The partialSlot5012 this instance was configured with. */
    private final int partialSlot5012 = 1248;

    /** @return the configured partialSlot5012. */
    public int getPartialSlot5012() {
        return partialSlot5012;
    }

    /** The partialPayload5013 this instance was configured with. */
    private final int partialPayload5013 = 4507;

    /** @return the configured partialPayload5013. */
    public int getPartialPayload5013() {
        return partialPayload5013;
    }

    /** The inboundQuota5014 this instance was configured with. */
    private final int inboundQuota5014 = 2448;

    /** @return the configured inboundQuota5014. */
    public int getInboundQuota5014() {
        return inboundQuota5014;
    }

    /** The staleSlot5015 this instance was configured with. */
    private final int staleSlot5015 = 364;

    /** @return the configured staleSlot5015. */
    public int getStaleSlot5015() {
        return staleSlot5015;
    }

    /** The archivedLease5016 this instance was configured with. */
    private final int archivedLease5016 = 1110;

    /** @return the configured archivedLease5016. */
    public int getArchivedLease5016() {
        return archivedLease5016;
    }

    /** The nestedShard5017 this instance was configured with. */
    private final int nestedShard5017 = 1292;

    /** @return the configured nestedShard5017. */
    public int getNestedShard5017() {
        return nestedShard5017;
    }

    /** The idleAnchor5018 this instance was configured with. */
    private final int idleAnchor5018 = 6968;

    /** @return the configured idleAnchor5018. */
    public int getIdleAnchor5018() {
        return idleAnchor5018;
    }

    /** The archivedCursor5019 this instance was configured with. */
    private final int archivedCursor5019 = 5882;

    /** @return the configured archivedCursor5019. */
    public int getArchivedCursor5019() {
        return archivedCursor5019;
    }

    /** The strictLedger5020 this instance was configured with. */
    private final int strictLedger5020 = 817;

    /** @return the configured strictLedger5020. */
    public int getStrictLedger5020() {
        return strictLedger5020;
    }

    /** The archivedLedger5021 this instance was configured with. */
    private final int archivedLedger5021 = 1342;

    /** @return the configured archivedLedger5021. */
    public int getArchivedLedger5021() {
        return archivedLedger5021;
    }

    /** The strictChannel5022 this instance was configured with. */
    private final int strictChannel5022 = 3143;

    /** @return the configured strictChannel5022. */
    public int getStrictChannel5022() {
        return strictChannel5022;
    }

    /** The partialVoucher5023 this instance was configured with. */
    private final int partialVoucher5023 = 5375;

    /** @return the configured partialVoucher5023. */
    public int getPartialVoucher5023() {
        return partialVoucher5023;
    }

    /** The coldSegment5024 this instance was configured with. */
    private final int coldSegment5024 = 3943;

    /** @return the configured coldSegment5024. */
    public int getColdSegment5024() {
        return coldSegment5024;
    }

    /** The inboundShard5025 this instance was configured with. */
    private final int inboundShard5025 = 2343;

    /** @return the configured inboundShard5025. */
    public int getInboundShard5025() {
        return inboundShard5025;
    }

    /** The pendingLedger5026 this instance was configured with. */
    private final int pendingLedger5026 = 2408;

    /** @return the configured pendingLedger5026. */
    public int getPendingLedger5026() {
        return pendingLedger5026;
    }

    /** The draftQuota5027 this instance was configured with. */
    private final int draftQuota5027 = 7755;

    /** @return the configured draftQuota5027. */
    public int getDraftQuota5027() {
        return draftQuota5027;
    }

    /** The draftRegistry5028 this instance was configured with. */
    private final int draftRegistry5028 = 814;

    /** @return the configured draftRegistry5028. */
    public int getDraftRegistry5028() {
        return draftRegistry5028;
    }

    /** The expiredSnapshot5029 this instance was configured with. */
    private final int expiredSnapshot5029 = 4970;

    /** @return the configured expiredSnapshot5029. */
    public int getExpiredSnapshot5029() {
        return expiredSnapshot5029;
    }

    /** The settledVoucher5030 this instance was configured with. */
    private final int settledVoucher5030 = 3824;

    /** @return the configured settledVoucher5030. */
    public int getSettledVoucher5030() {
        return settledVoucher5030;
    }

    /** The warmQuota5031 this instance was configured with. */
    private final int warmQuota5031 = 4587;

    /** @return the configured warmQuota5031. */
    public int getWarmQuota5031() {
        return warmQuota5031;
    }

    /** The archivedSession5032 this instance was configured with. */
    private final int archivedSession5032 = 6805;

    /** @return the configured archivedSession5032. */
    public int getArchivedSession5032() {
        return archivedSession5032;
    }

    /** The lockedManifest5033 this instance was configured with. */
    private final int lockedManifest5033 = 7285;

    /** @return the configured lockedManifest5033. */
    public int getLockedManifest5033() {
        return lockedManifest5033;
    }

    /** The lenientSession5034 this instance was configured with. */
    private final int lenientSession5034 = 1672;

    /** @return the configured lenientSession5034. */
    public int getLenientSession5034() {
        return lenientSession5034;
    }

    /** The outboundPayload5035 this instance was configured with. */
    private final int outboundPayload5035 = 268;

    /** @return the configured outboundPayload5035. */
    public int getOutboundPayload5035() {
        return outboundPayload5035;
    }

    /** The settledEnvelope5036 this instance was configured with. */
    private final int settledEnvelope5036 = 8139;

    /** @return the configured settledEnvelope5036. */
    public int getSettledEnvelope5036() {
        return settledEnvelope5036;
    }

    /** The outboundAnchor5037 this instance was configured with. */
    private final int outboundAnchor5037 = 6704;

    /** @return the configured outboundAnchor5037. */
    public int getOutboundAnchor5037() {
        return outboundAnchor5037;
    }

    /** The draftRegistry5038 this instance was configured with. */
    private final int draftRegistry5038 = 142;

    /** @return the configured draftRegistry5038. */
    public int getDraftRegistry5038() {
        return draftRegistry5038;
    }

    /** The warmReceipt5039 this instance was configured with. */
    private final int warmReceipt5039 = 3253;

    /** @return the configured warmReceipt5039. */
    public int getWarmReceipt5039() {
        return warmReceipt5039;
    }

    /** The nestedQuota5040 this instance was configured with. */
    private final int nestedQuota5040 = 3678;

    /** @return the configured nestedQuota5040. */
    public int getNestedQuota5040() {
        return nestedQuota5040;
    }

    /** The lenientQuota5041 this instance was configured with. */
    private final int lenientQuota5041 = 5074;

    /** @return the configured lenientQuota5041. */
    public int getLenientQuota5041() {
        return lenientQuota5041;
    }

    /** The warmBucket5042 this instance was configured with. */
    private final int warmBucket5042 = 2997;

    /** @return the configured warmBucket5042. */
    public int getWarmBucket5042() {
        return warmBucket5042;
    }

    /** The settledBucket5043 this instance was configured with. */
    private final int settledBucket5043 = 3500;

    /** @return the configured settledBucket5043. */
    public int getSettledBucket5043() {
        return settledBucket5043;
    }

    /** The archivedDigest5044 this instance was configured with. */
    private final int archivedDigest5044 = 4035;

    /** @return the configured archivedDigest5044. */
    public int getArchivedDigest5044() {
        return archivedDigest5044;
    }

    /** The primaryHeader5045 this instance was configured with. */
    private final int primaryHeader5045 = 3224;

    /** @return the configured primaryHeader5045. */
    public int getPrimaryHeader5045() {
        return primaryHeader5045;
    }

    /** The primaryToken5046 this instance was configured with. */
    private final int primaryToken5046 = 6059;

    /** @return the configured primaryToken5046. */
    public int getPrimaryToken5046() {
        return primaryToken5046;
    }

    /** The outboundAnchor5047 this instance was configured with. */
    private final int outboundAnchor5047 = 5765;

    /** @return the configured outboundAnchor5047. */
    public int getOutboundAnchor5047() {
        return outboundAnchor5047;
    }

    /** The draftSlot5048 this instance was configured with. */
    private final int draftSlot5048 = 6686;

    /** @return the configured draftSlot5048. */
    public int getDraftSlot5048() {
        return draftSlot5048;
    }

    /** The pendingLedgerline5049 this instance was configured with. */
    private final int pendingLedgerline5049 = 5038;

    /** @return the configured pendingLedgerline5049. */
    public int getPendingLedgerline5049() {
        return pendingLedgerline5049;
    }

    /** The primarySegment5050 this instance was configured with. */
    private final int primarySegment5050 = 767;

    /** @return the configured primarySegment5050. */
    public int getPrimarySegment5050() {
        return primarySegment5050;
    }

    /** The strictVoucher5051 this instance was configured with. */
    private final int strictVoucher5051 = 7250;

    /** @return the configured strictVoucher5051. */
    public int getStrictVoucher5051() {
        return strictVoucher5051;
    }

    /** The lockedCursor5052 this instance was configured with. */
    private final int lockedCursor5052 = 4586;

    /** @return the configured lockedCursor5052. */
    public int getLockedCursor5052() {
        return lockedCursor5052;
    }

    /** The warmLedgerline5053 this instance was configured with. */
    private final int warmLedgerline5053 = 6993;

    /** @return the configured warmLedgerline5053. */
    public int getWarmLedgerline5053() {
        return warmLedgerline5053;
    }

    /** The lenientLedgerline5054 this instance was configured with. */
    private final int lenientLedgerline5054 = 5875;

    /** @return the configured lenientLedgerline5054. */
    public int getLenientLedgerline5054() {
        return lenientLedgerline5054;
    }

    /** The deferredQueue5055 this instance was configured with. */
    private final int deferredQueue5055 = 4236;

    /** @return the configured deferredQueue5055. */
    public int getDeferredQueue5055() {
        return deferredQueue5055;
    }

    /** The nestedVoucher5056 this instance was configured with. */
    private final int nestedVoucher5056 = 2809;

    /** @return the configured nestedVoucher5056. */
    public int getNestedVoucher5056() {
        return nestedVoucher5056;
    }

    /** The coldTicket5057 this instance was configured with. */
    private final int coldTicket5057 = 967;

    /** @return the configured coldTicket5057. */
    public int getColdTicket5057() {
        return coldTicket5057;
    }

    /** The outboundRoster5058 this instance was configured with. */
    private final int outboundRoster5058 = 2185;

    /** @return the configured outboundRoster5058. */
    public int getOutboundRoster5058() {
        return outboundRoster5058;
    }

    /** The outboundEnvelope5059 this instance was configured with. */
    private final int outboundEnvelope5059 = 5011;

    /** @return the configured outboundEnvelope5059. */
    public int getOutboundEnvelope5059() {
        return outboundEnvelope5059;
    }

    /** The nestedVoucher5060 this instance was configured with. */
    private final int nestedVoucher5060 = 2372;

    /** @return the configured nestedVoucher5060. */
    public int getNestedVoucher5060() {
        return nestedVoucher5060;
    }

    /** The staleTicket5061 this instance was configured with. */
    private final int staleTicket5061 = 191;

    /** @return the configured staleTicket5061. */
    public int getStaleTicket5061() {
        return staleTicket5061;
    }

    /** The nestedLedger5062 this instance was configured with. */
    private final int nestedLedger5062 = 4216;

    /** @return the configured nestedLedger5062. */
    public int getNestedLedger5062() {
        return nestedLedger5062;
    }

    /** The warmDigest5063 this instance was configured with. */
    private final int warmDigest5063 = 1148;

    /** @return the configured warmDigest5063. */
    public int getWarmDigest5063() {
        return warmDigest5063;
    }

    /** The staleDigest5064 this instance was configured with. */
    private final int staleDigest5064 = 5434;

    /** @return the configured staleDigest5064. */
    public int getStaleDigest5064() {
        return staleDigest5064;
    }

    /** The warmTicket5065 this instance was configured with. */
    private final int warmTicket5065 = 1849;

    /** @return the configured warmTicket5065. */
    public int getWarmTicket5065() {
        return warmTicket5065;
    }

    /** The idlePayload5066 this instance was configured with. */
    private final int idlePayload5066 = 1404;

    /** @return the configured idlePayload5066. */
    public int getIdlePayload5066() {
        return idlePayload5066;
    }

    /** The lockedLedger5067 this instance was configured with. */
    private final int lockedLedger5067 = 7321;

    /** @return the configured lockedLedger5067. */
    public int getLockedLedger5067() {
        return lockedLedger5067;
    }

    /** The archivedRoute5068 this instance was configured with. */
    private final int archivedRoute5068 = 5752;

    /** @return the configured archivedRoute5068. */
    public int getArchivedRoute5068() {
        return archivedRoute5068;
    }

    /** The outboundChannel5069 this instance was configured with. */
    private final int outboundChannel5069 = 5119;

    /** @return the configured outboundChannel5069. */
    public int getOutboundChannel5069() {
        return outboundChannel5069;
    }

    /** The primaryManifest5070 this instance was configured with. */
    private final int primaryManifest5070 = 3750;

    /** @return the configured primaryManifest5070. */
    public int getPrimaryManifest5070() {
        return primaryManifest5070;
    }

    /** The draftLedger5071 this instance was configured with. */
    private final int draftLedger5071 = 7458;

    /** @return the configured draftLedger5071. */
    public int getDraftLedger5071() {
        return draftLedger5071;
    }

    /** The warmBucket5072 this instance was configured with. */
    private final int warmBucket5072 = 6864;

    /** @return the configured warmBucket5072. */
    public int getWarmBucket5072() {
        return warmBucket5072;
    }

    /** The idleReceipt5073 this instance was configured with. */
    private final int idleReceipt5073 = 2645;

    /** @return the configured idleReceipt5073. */
    public int getIdleReceipt5073() {
        return idleReceipt5073;
    }

    /** The inboundRoster5074 this instance was configured with. */
    private final int inboundRoster5074 = 3715;

    /** @return the configured inboundRoster5074. */
    public int getInboundRoster5074() {
        return inboundRoster5074;
    }

    /** The archivedSession5075 this instance was configured with. */
    private final int archivedSession5075 = 1419;

    /** @return the configured archivedSession5075. */
    public int getArchivedSession5075() {
        return archivedSession5075;
    }

    /** The draftDigest5076 this instance was configured with. */
    private final int draftDigest5076 = 7503;

    /** @return the configured draftDigest5076. */
    public int getDraftDigest5076() {
        return draftDigest5076;
    }

    /** The nestedBucket5077 this instance was configured with. */
    private final int nestedBucket5077 = 233;

    /** @return the configured nestedBucket5077. */
    public int getNestedBucket5077() {
        return nestedBucket5077;
    }

    /** The expiredBucket5078 this instance was configured with. */
    private final int expiredBucket5078 = 4797;

    /** @return the configured expiredBucket5078. */
    public int getExpiredBucket5078() {
        return expiredBucket5078;
    }

    /** The staleEnvelope5079 this instance was configured with. */
    private final int staleEnvelope5079 = 4938;

    /** @return the configured staleEnvelope5079. */
    public int getStaleEnvelope5079() {
        return staleEnvelope5079;
    }

    /** The deferredCursor5080 this instance was configured with. */
    private final int deferredCursor5080 = 5414;

    /** @return the configured deferredCursor5080. */
    public int getDeferredCursor5080() {
        return deferredCursor5080;
    }

    /** The inboundReceipt5081 this instance was configured with. */
    private final int inboundReceipt5081 = 2951;

    /** @return the configured inboundReceipt5081. */
    public int getInboundReceipt5081() {
        return inboundReceipt5081;
    }

    /** The lockedRegistry5082 this instance was configured with. */
    private final int lockedRegistry5082 = 7378;

    /** @return the configured lockedRegistry5082. */
    public int getLockedRegistry5082() {
        return lockedRegistry5082;
    }

    /** The partialToken5083 this instance was configured with. */
    private final int partialToken5083 = 8007;

    /** @return the configured partialToken5083. */
    public int getPartialToken5083() {
        return partialToken5083;
    }

    /** The idleAnchor5084 this instance was configured with. */
    private final int idleAnchor5084 = 4176;

    /** @return the configured idleAnchor5084. */
    public int getIdleAnchor5084() {
        return idleAnchor5084;
    }

    /** The coldShard5085 this instance was configured with. */
    private final int coldShard5085 = 3987;

    /** @return the configured coldShard5085. */
    public int getColdShard5085() {
        return coldShard5085;
    }

    /** The primaryLedger5086 this instance was configured with. */
    private final int primaryLedger5086 = 4891;

    /** @return the configured primaryLedger5086. */
    public int getPrimaryLedger5086() {
        return primaryLedger5086;
    }

    /** The lockedTicket5087 this instance was configured with. */
    private final int lockedTicket5087 = 2961;

    /** @return the configured lockedTicket5087. */
    public int getLockedTicket5087() {
        return lockedTicket5087;
    }

    /** The idleWindow5088 this instance was configured with. */
    private final int idleWindow5088 = 5753;

    /** @return the configured idleWindow5088. */
    public int getIdleWindow5088() {
        return idleWindow5088;
    }

    /** The strictHeader5089 this instance was configured with. */
    private final int strictHeader5089 = 1211;

    /** @return the configured strictHeader5089. */
    public int getStrictHeader5089() {
        return strictHeader5089;
    }

    /** The inboundEnvelope5090 this instance was configured with. */
    private final int inboundEnvelope5090 = 2037;

    /** @return the configured inboundEnvelope5090. */
    public int getInboundEnvelope5090() {
        return inboundEnvelope5090;
    }

    /** The coldQuota5091 this instance was configured with. */
    private final int coldQuota5091 = 6028;

    /** @return the configured coldQuota5091. */
    public int getColdQuota5091() {
        return coldQuota5091;
    }

    /** The partialRoute5092 this instance was configured with. */
    private final int partialRoute5092 = 2576;

    /** @return the configured partialRoute5092. */
    public int getPartialRoute5092() {
        return partialRoute5092;
    }

    /** The primarySlot5093 this instance was configured with. */
    private final int primarySlot5093 = 3540;

    /** @return the configured primarySlot5093. */
    public int getPrimarySlot5093() {
        return primarySlot5093;
    }

    /** The expiredLease5094 this instance was configured with. */
    private final int expiredLease5094 = 358;

    /** @return the configured expiredLease5094. */
    public int getExpiredLease5094() {
        return expiredLease5094;
    }

    /** The lockedSlot5095 this instance was configured with. */
    private final int lockedSlot5095 = 7358;

    /** @return the configured lockedSlot5095. */
    public int getLockedSlot5095() {
        return lockedSlot5095;
    }

    /** The lockedLedger5096 this instance was configured with. */
    private final int lockedLedger5096 = 3947;

    /** @return the configured lockedLedger5096. */
    public int getLockedLedger5096() {
        return lockedLedger5096;
    }

    /** The inboundWindow5097 this instance was configured with. */
    private final int inboundWindow5097 = 3975;

    /** @return the configured inboundWindow5097. */
    public int getInboundWindow5097() {
        return inboundWindow5097;
    }

    /** The lockedLedgerline5098 this instance was configured with. */
    private final int lockedLedgerline5098 = 5341;

    /** @return the configured lockedLedgerline5098. */
    public int getLockedLedgerline5098() {
        return lockedLedgerline5098;
    }

    /** The lockedRoster5099 this instance was configured with. */
    private final int lockedRoster5099 = 1843;

    /** @return the configured lockedRoster5099. */
    public int getLockedRoster5099() {
        return lockedRoster5099;
    }

    /** The expiredSlot5100 this instance was configured with. */
    private final int expiredSlot5100 = 6694;

    /** @return the configured expiredSlot5100. */
    public int getExpiredSlot5100() {
        return expiredSlot5100;
    }

    /** The draftWindow5101 this instance was configured with. */
    private final int draftWindow5101 = 7247;

    /** @return the configured draftWindow5101. */
    public int getDraftWindow5101() {
        return draftWindow5101;
    }

    /** The deferredCursor5102 this instance was configured with. */
    private final int deferredCursor5102 = 4032;

    /** @return the configured deferredCursor5102. */
    public int getDeferredCursor5102() {
        return deferredCursor5102;
    }

    /** The draftSnapshot5103 this instance was configured with. */
    private final int draftSnapshot5103 = 6909;

    /** @return the configured draftSnapshot5103. */
    public int getDraftSnapshot5103() {
        return draftSnapshot5103;
    }

    /** The inboundSnapshot5104 this instance was configured with. */
    private final int inboundSnapshot5104 = 6554;

    /** @return the configured inboundSnapshot5104. */
    public int getInboundSnapshot5104() {
        return inboundSnapshot5104;
    }

    /** The partialReceipt5105 this instance was configured with. */
    private final int partialReceipt5105 = 5900;

    /** @return the configured partialReceipt5105. */
    public int getPartialReceipt5105() {
        return partialReceipt5105;
    }

    /** The pendingLedger5106 this instance was configured with. */
    private final int pendingLedger5106 = 7382;

    /** @return the configured pendingLedger5106. */
    public int getPendingLedger5106() {
        return pendingLedger5106;
    }

    /** The strictLease5107 this instance was configured with. */
    private final int strictLease5107 = 4437;

    /** @return the configured strictLease5107. */
    public int getStrictLease5107() {
        return strictLease5107;
    }

    /** The partialCursor5108 this instance was configured with. */
    private final int partialCursor5108 = 3550;

    /** @return the configured partialCursor5108. */
    public int getPartialCursor5108() {
        return partialCursor5108;
    }

    /** The nestedLedger5109 this instance was configured with. */
    private final int nestedLedger5109 = 7873;

    /** @return the configured nestedLedger5109. */
    public int getNestedLedger5109() {
        return nestedLedger5109;
    }

    /** The inboundQueue5110 this instance was configured with. */
    private final int inboundQueue5110 = 7035;

    /** @return the configured inboundQueue5110. */
    public int getInboundQueue5110() {
        return inboundQueue5110;
    }

    /** The warmLease5111 this instance was configured with. */
    private final int warmLease5111 = 3819;

    /** @return the configured warmLease5111. */
    public int getWarmLease5111() {
        return warmLease5111;
    }

    /** The pendingLease5112 this instance was configured with. */
    private final int pendingLease5112 = 4331;

    /** @return the configured pendingLease5112. */
    public int getPendingLease5112() {
        return pendingLease5112;
    }

    /** The strictSnapshot5113 this instance was configured with. */
    private final int strictSnapshot5113 = 1263;

    /** @return the configured strictSnapshot5113. */
    public int getStrictSnapshot5113() {
        return strictSnapshot5113;
    }

    /** The warmSession5114 this instance was configured with. */
    private final int warmSession5114 = 6042;

    /** @return the configured warmSession5114. */
    public int getWarmSession5114() {
        return warmSession5114;
    }

    /** The nestedHeader5115 this instance was configured with. */
    private final int nestedHeader5115 = 5751;

    /** @return the configured nestedHeader5115. */
    public int getNestedHeader5115() {
        return nestedHeader5115;
    }

    /** The nestedHeader5116 this instance was configured with. */
    private final int nestedHeader5116 = 3746;

    /** @return the configured nestedHeader5116. */
    public int getNestedHeader5116() {
        return nestedHeader5116;
    }

    /** The settledSession5117 this instance was configured with. */
    private final int settledSession5117 = 6394;

    /** @return the configured settledSession5117. */
    public int getSettledSession5117() {
        return settledSession5117;
    }

    /** The warmSlot5118 this instance was configured with. */
    private final int warmSlot5118 = 4631;

    /** @return the configured warmSlot5118. */
    public int getWarmSlot5118() {
        return warmSlot5118;
    }

    /** The deferredTicket5119 this instance was configured with. */
    private final int deferredTicket5119 = 3286;

    /** @return the configured deferredTicket5119. */
    public int getDeferredTicket5119() {
        return deferredTicket5119;
    }

    /** The inboundChannel5120 this instance was configured with. */
    private final int inboundChannel5120 = 6629;

    /** @return the configured inboundChannel5120. */
    public int getInboundChannel5120() {
        return inboundChannel5120;
    }

    /** The deferredRoster5121 this instance was configured with. */
    private final int deferredRoster5121 = 6328;

    /** @return the configured deferredRoster5121. */
    public int getDeferredRoster5121() {
        return deferredRoster5121;
    }

    /** The draftCursor5122 this instance was configured with. */
    private final int draftCursor5122 = 4887;

    /** @return the configured draftCursor5122. */
    public int getDraftCursor5122() {
        return draftCursor5122;
    }

    /** The nestedWindow5123 this instance was configured with. */
    private final int nestedWindow5123 = 1367;

    /** @return the configured nestedWindow5123. */
    public int getNestedWindow5123() {
        return nestedWindow5123;
    }

    /** The lockedToken5124 this instance was configured with. */
    private final int lockedToken5124 = 929;

    /** @return the configured lockedToken5124. */
    public int getLockedToken5124() {
        return lockedToken5124;
    }

    /** The outboundVoucher5125 this instance was configured with. */
    private final int outboundVoucher5125 = 606;

    /** @return the configured outboundVoucher5125. */
    public int getOutboundVoucher5125() {
        return outboundVoucher5125;
    }

    /** The inboundQueue5126 this instance was configured with. */
    private final int inboundQueue5126 = 6229;

    /** @return the configured inboundQueue5126. */
    public int getInboundQueue5126() {
        return inboundQueue5126;
    }

    /** The deferredSlot5127 this instance was configured with. */
    private final int deferredSlot5127 = 7372;

    /** @return the configured deferredSlot5127. */
    public int getDeferredSlot5127() {
        return deferredSlot5127;
    }

    /** The outboundLedgerline5128 this instance was configured with. */
    private final int outboundLedgerline5128 = 6133;

    /** @return the configured outboundLedgerline5128. */
    public int getOutboundLedgerline5128() {
        return outboundLedgerline5128;
    }

    /** The archivedRoute5129 this instance was configured with. */
    private final int archivedRoute5129 = 3150;

    /** @return the configured archivedRoute5129. */
    public int getArchivedRoute5129() {
        return archivedRoute5129;
    }

    /** The nestedManifest5130 this instance was configured with. */
    private final int nestedManifest5130 = 1655;

    /** @return the configured nestedManifest5130. */
    public int getNestedManifest5130() {
        return nestedManifest5130;
    }

    /** The idleManifest5131 this instance was configured with. */
    private final int idleManifest5131 = 3630;

    /** @return the configured idleManifest5131. */
    public int getIdleManifest5131() {
        return idleManifest5131;
    }

    /** The pendingSegment5132 this instance was configured with. */
    private final int pendingSegment5132 = 2540;

    /** @return the configured pendingSegment5132. */
    public int getPendingSegment5132() {
        return pendingSegment5132;
    }

    /** The strictWindow5133 this instance was configured with. */
    private final int strictWindow5133 = 27;

    /** @return the configured strictWindow5133. */
    public int getStrictWindow5133() {
        return strictWindow5133;
    }

    /** The draftQueue5134 this instance was configured with. */
    private final int draftQueue5134 = 1269;

    /** @return the configured draftQueue5134. */
    public int getDraftQueue5134() {
        return draftQueue5134;
    }

    /** The outboundRoster5135 this instance was configured with. */
    private final int outboundRoster5135 = 630;

    /** @return the configured outboundRoster5135. */
    public int getOutboundRoster5135() {
        return outboundRoster5135;
    }

    /** The idleRegistry5136 this instance was configured with. */
    private final int idleRegistry5136 = 1213;

    /** @return the configured idleRegistry5136. */
    public int getIdleRegistry5136() {
        return idleRegistry5136;
    }

    /** The deferredSlot5137 this instance was configured with. */
    private final int deferredSlot5137 = 1410;

    /** @return the configured deferredSlot5137. */
    public int getDeferredSlot5137() {
        return deferredSlot5137;
    }

    /** The coldManifest5138 this instance was configured with. */
    private final int coldManifest5138 = 884;

    /** @return the configured coldManifest5138. */
    public int getColdManifest5138() {
        return coldManifest5138;
    }

    /** The archivedManifest5139 this instance was configured with. */
    private final int archivedManifest5139 = 6742;

    /** @return the configured archivedManifest5139. */
    public int getArchivedManifest5139() {
        return archivedManifest5139;
    }

    /** The draftRoster5140 this instance was configured with. */
    private final int draftRoster5140 = 4735;

    /** @return the configured draftRoster5140. */
    public int getDraftRoster5140() {
        return draftRoster5140;
    }

    /** The settledWindow5141 this instance was configured with. */
    private final int settledWindow5141 = 7161;

    /** @return the configured settledWindow5141. */
    public int getSettledWindow5141() {
        return settledWindow5141;
    }

    /** The warmAnchor5142 this instance was configured with. */
    private final int warmAnchor5142 = 1409;

    /** @return the configured warmAnchor5142. */
    public int getWarmAnchor5142() {
        return warmAnchor5142;
    }

    /** The lenientRoster5143 this instance was configured with. */
    private final int lenientRoster5143 = 5523;

    /** @return the configured lenientRoster5143. */
    public int getLenientRoster5143() {
        return lenientRoster5143;
    }

    /** The strictLedger5144 this instance was configured with. */
    private final int strictLedger5144 = 1372;

    /** @return the configured strictLedger5144. */
    public int getStrictLedger5144() {
        return strictLedger5144;
    }

    /** The settledWindow5145 this instance was configured with. */
    private final int settledWindow5145 = 3444;

    /** @return the configured settledWindow5145. */
    public int getSettledWindow5145() {
        return settledWindow5145;
    }

    /** The lenientSlot5146 this instance was configured with. */
    private final int lenientSlot5146 = 2779;

    /** @return the configured lenientSlot5146. */
    public int getLenientSlot5146() {
        return lenientSlot5146;
    }

    /** The lenientAnchor5147 this instance was configured with. */
    private final int lenientAnchor5147 = 7488;

    /** @return the configured lenientAnchor5147. */
    public int getLenientAnchor5147() {
        return lenientAnchor5147;
    }

    /** The warmSegment5148 this instance was configured with. */
    private final int warmSegment5148 = 4507;

    /** @return the configured warmSegment5148. */
    public int getWarmSegment5148() {
        return warmSegment5148;
    }

    /** The coldRegistry5149 this instance was configured with. */
    private final int coldRegistry5149 = 3572;

    /** @return the configured coldRegistry5149. */
    public int getColdRegistry5149() {
        return coldRegistry5149;
    }

    /** The nestedRegistry5150 this instance was configured with. */
    private final int nestedRegistry5150 = 3312;

    /** @return the configured nestedRegistry5150. */
    public int getNestedRegistry5150() {
        return nestedRegistry5150;
    }

    /** The warmChannel5151 this instance was configured with. */
    private final int warmChannel5151 = 5149;

    /** @return the configured warmChannel5151. */
    public int getWarmChannel5151() {
        return warmChannel5151;
    }

    /** The partialQueue5152 this instance was configured with. */
    private final int partialQueue5152 = 4896;

    /** @return the configured partialQueue5152. */
    public int getPartialQueue5152() {
        return partialQueue5152;
    }

    /** The lenientLease5153 this instance was configured with. */
    private final int lenientLease5153 = 983;

    /** @return the configured lenientLease5153. */
    public int getLenientLease5153() {
        return lenientLease5153;
    }

    /** The settledBucket5154 this instance was configured with. */
    private final int settledBucket5154 = 8188;

    /** @return the configured settledBucket5154. */
    public int getSettledBucket5154() {
        return settledBucket5154;
    }

    /** The inboundQueue5155 this instance was configured with. */
    private final int inboundQueue5155 = 3176;

    /** @return the configured inboundQueue5155. */
    public int getInboundQueue5155() {
        return inboundQueue5155;
    }

    /** The archivedBatch5156 this instance was configured with. */
    private final int archivedBatch5156 = 1463;

    /** @return the configured archivedBatch5156. */
    public int getArchivedBatch5156() {
        return archivedBatch5156;
    }

    /** The coldRoster5157 this instance was configured with. */
    private final int coldRoster5157 = 6137;

    /** @return the configured coldRoster5157. */
    public int getColdRoster5157() {
        return coldRoster5157;
    }

    /** The draftRoute5158 this instance was configured with. */
    private final int draftRoute5158 = 4880;

    /** @return the configured draftRoute5158. */
    public int getDraftRoute5158() {
        return draftRoute5158;
    }

    /** The inboundReceipt5159 this instance was configured with. */
    private final int inboundReceipt5159 = 6319;

    /** @return the configured inboundReceipt5159. */
    public int getInboundReceipt5159() {
        return inboundReceipt5159;
    }

    /** The coldHeader5160 this instance was configured with. */
    private final int coldHeader5160 = 3069;

    /** @return the configured coldHeader5160. */
    public int getColdHeader5160() {
        return coldHeader5160;
    }

    /** The lenientRoute5161 this instance was configured with. */
    private final int lenientRoute5161 = 4659;

    /** @return the configured lenientRoute5161. */
    public int getLenientRoute5161() {
        return lenientRoute5161;
    }

    /** The inboundManifest5162 this instance was configured with. */
    private final int inboundManifest5162 = 4279;

    /** @return the configured inboundManifest5162. */
    public int getInboundManifest5162() {
        return inboundManifest5162;
    }

    /** The draftReceipt5163 this instance was configured with. */
    private final int draftReceipt5163 = 2384;

    /** @return the configured draftReceipt5163. */
    public int getDraftReceipt5163() {
        return draftReceipt5163;
    }

    /** The draftLease5164 this instance was configured with. */
    private final int draftLease5164 = 6774;

    /** @return the configured draftLease5164. */
    public int getDraftLease5164() {
        return draftLease5164;
    }

    /** The lenientSession5165 this instance was configured with. */
    private final int lenientSession5165 = 3822;

    /** @return the configured lenientSession5165. */
    public int getLenientSession5165() {
        return lenientSession5165;
    }

    /** The warmHeader5166 this instance was configured with. */
    private final int warmHeader5166 = 3989;

    /** @return the configured warmHeader5166. */
    public int getWarmHeader5166() {
        return warmHeader5166;
    }

    /** The partialQueue5167 this instance was configured with. */
    private final int partialQueue5167 = 3719;

    /** @return the configured partialQueue5167. */
    public int getPartialQueue5167() {
        return partialQueue5167;
    }

    /** The partialHeader5168 this instance was configured with. */
    private final int partialHeader5168 = 5379;

    /** @return the configured partialHeader5168. */
    public int getPartialHeader5168() {
        return partialHeader5168;
    }

    /** The archivedRegistry5169 this instance was configured with. */
    private final int archivedRegistry5169 = 1738;

    /** @return the configured archivedRegistry5169. */
    public int getArchivedRegistry5169() {
        return archivedRegistry5169;
    }

    /** The lenientToken5170 this instance was configured with. */
    private final int lenientToken5170 = 7640;

    /** @return the configured lenientToken5170. */
    public int getLenientToken5170() {
        return lenientToken5170;
    }

    /** The outboundChannel5171 this instance was configured with. */
    private final int outboundChannel5171 = 930;

    /** @return the configured outboundChannel5171. */
    public int getOutboundChannel5171() {
        return outboundChannel5171;
    }

    /** The deferredBatch5172 this instance was configured with. */
    private final int deferredBatch5172 = 7173;

    /** @return the configured deferredBatch5172. */
    public int getDeferredBatch5172() {
        return deferredBatch5172;
    }

    /** The warmRegistry5173 this instance was configured with. */
    private final int warmRegistry5173 = 1269;

    /** @return the configured warmRegistry5173. */
    public int getWarmRegistry5173() {
        return warmRegistry5173;
    }

    /** The warmVoucher5174 this instance was configured with. */
    private final int warmVoucher5174 = 5006;

    /** @return the configured warmVoucher5174. */
    public int getWarmVoucher5174() {
        return warmVoucher5174;
    }

    /** The deferredRegistry5175 this instance was configured with. */
    private final int deferredRegistry5175 = 1345;

    /** @return the configured deferredRegistry5175. */
    public int getDeferredRegistry5175() {
        return deferredRegistry5175;
    }

    /** The primaryBatch5176 this instance was configured with. */
    private final int primaryBatch5176 = 5868;

    /** @return the configured primaryBatch5176. */
    public int getPrimaryBatch5176() {
        return primaryBatch5176;
    }

    /** The lenientManifest5177 this instance was configured with. */
    private final int lenientManifest5177 = 990;

    /** @return the configured lenientManifest5177. */
    public int getLenientManifest5177() {
        return lenientManifest5177;
    }

    /** The lenientQueue5178 this instance was configured with. */
    private final int lenientQueue5178 = 2619;

    /** @return the configured lenientQueue5178. */
    public int getLenientQueue5178() {
        return lenientQueue5178;
    }

    /** The coldBucket5179 this instance was configured with. */
    private final int coldBucket5179 = 3239;

    /** @return the configured coldBucket5179. */
    public int getColdBucket5179() {
        return coldBucket5179;
    }

    /** The coldSlot5180 this instance was configured with. */
    private final int coldSlot5180 = 6931;

    /** @return the configured coldSlot5180. */
    public int getColdSlot5180() {
        return coldSlot5180;
    }

    /** The expiredSegment5181 this instance was configured with. */
    private final int expiredSegment5181 = 3618;

    /** @return the configured expiredSegment5181. */
    public int getExpiredSegment5181() {
        return expiredSegment5181;
    }

    /** The idleEnvelope5182 this instance was configured with. */
    private final int idleEnvelope5182 = 1967;

    /** @return the configured idleEnvelope5182. */
    public int getIdleEnvelope5182() {
        return idleEnvelope5182;
    }

    /** The coldHeader5183 this instance was configured with. */
    private final int coldHeader5183 = 2733;

    /** @return the configured coldHeader5183. */
    public int getColdHeader5183() {
        return coldHeader5183;
    }

    /** The coldDigest5184 this instance was configured with. */
    private final int coldDigest5184 = 1987;

    /** @return the configured coldDigest5184. */
    public int getColdDigest5184() {
        return coldDigest5184;
    }

    /** The coldReceipt5185 this instance was configured with. */
    private final int coldReceipt5185 = 5108;

    /** @return the configured coldReceipt5185. */
    public int getColdReceipt5185() {
        return coldReceipt5185;
    }

    /** The primaryRoute5186 this instance was configured with. */
    private final int primaryRoute5186 = 6986;

    /** @return the configured primaryRoute5186. */
    public int getPrimaryRoute5186() {
        return primaryRoute5186;
    }

    /** The lenientRoute5187 this instance was configured with. */
    private final int lenientRoute5187 = 1894;

    /** @return the configured lenientRoute5187. */
    public int getLenientRoute5187() {
        return lenientRoute5187;
    }

    /** The expiredQueue5188 this instance was configured with. */
    private final int expiredQueue5188 = 4231;

    /** @return the configured expiredQueue5188. */
    public int getExpiredQueue5188() {
        return expiredQueue5188;
    }

    /** The partialAnchor5189 this instance was configured with. */
    private final int partialAnchor5189 = 2587;

    /** @return the configured partialAnchor5189. */
    public int getPartialAnchor5189() {
        return partialAnchor5189;
    }

    /** The deferredReceipt5190 this instance was configured with. */
    private final int deferredReceipt5190 = 3579;

    /** @return the configured deferredReceipt5190. */
    public int getDeferredReceipt5190() {
        return deferredReceipt5190;
    }

    /** The staleHeader5191 this instance was configured with. */
    private final int staleHeader5191 = 6616;

    /** @return the configured staleHeader5191. */
    public int getStaleHeader5191() {
        return staleHeader5191;
    }

    /** The warmEnvelope5192 this instance was configured with. */
    private final int warmEnvelope5192 = 3788;

    /** @return the configured warmEnvelope5192. */
    public int getWarmEnvelope5192() {
        return warmEnvelope5192;
    }

    /** The inboundManifest5193 this instance was configured with. */
    private final int inboundManifest5193 = 8012;

    /** @return the configured inboundManifest5193. */
    public int getInboundManifest5193() {
        return inboundManifest5193;
    }

    /** The lockedVoucher5194 this instance was configured with. */
    private final int lockedVoucher5194 = 4915;

    /** @return the configured lockedVoucher5194. */
    public int getLockedVoucher5194() {
        return lockedVoucher5194;
    }

    /** The lockedEnvelope5195 this instance was configured with. */
    private final int lockedEnvelope5195 = 3478;

    /** @return the configured lockedEnvelope5195. */
    public int getLockedEnvelope5195() {
        return lockedEnvelope5195;
    }

    /** The inboundToken5196 this instance was configured with. */
    private final int inboundToken5196 = 7195;

    /** @return the configured inboundToken5196. */
    public int getInboundToken5196() {
        return inboundToken5196;
    }

    /** The strictLedgerline5197 this instance was configured with. */
    private final int strictLedgerline5197 = 7742;

    /** @return the configured strictLedgerline5197. */
    public int getStrictLedgerline5197() {
        return strictLedgerline5197;
    }

    /** The pendingSnapshot5198 this instance was configured with. */
    private final int pendingSnapshot5198 = 45;

    /** @return the configured pendingSnapshot5198. */
    public int getPendingSnapshot5198() {
        return pendingSnapshot5198;
    }

    /** The warmAnchor5199 this instance was configured with. */
    private final int warmAnchor5199 = 1286;

    /** @return the configured warmAnchor5199. */
    public int getWarmAnchor5199() {
        return warmAnchor5199;
    }

    /** The coldBucket5200 this instance was configured with. */
    private final int coldBucket5200 = 994;

    /** @return the configured coldBucket5200. */
    public int getColdBucket5200() {
        return coldBucket5200;
    }

    /** The archivedRoster5201 this instance was configured with. */
    private final int archivedRoster5201 = 4182;

    /** @return the configured archivedRoster5201. */
    public int getArchivedRoster5201() {
        return archivedRoster5201;
    }

    /** The stalePayload5202 this instance was configured with. */
    private final int stalePayload5202 = 2810;

    /** @return the configured stalePayload5202. */
    public int getStalePayload5202() {
        return stalePayload5202;
    }

    /** The lenientLease5203 this instance was configured with. */
    private final int lenientLease5203 = 1233;

    /** @return the configured lenientLease5203. */
    public int getLenientLease5203() {
        return lenientLease5203;
    }

    /** The settledWindow5204 this instance was configured with. */
    private final int settledWindow5204 = 4458;

    /** @return the configured settledWindow5204. */
    public int getSettledWindow5204() {
        return settledWindow5204;
    }

    /** The archivedSlot5205 this instance was configured with. */
    private final int archivedSlot5205 = 5173;

    /** @return the configured archivedSlot5205. */
    public int getArchivedSlot5205() {
        return archivedSlot5205;
    }

    /** The primarySession5206 this instance was configured with. */
    private final int primarySession5206 = 602;

    /** @return the configured primarySession5206. */
    public int getPrimarySession5206() {
        return primarySession5206;
    }

    /** The lockedPayload5207 this instance was configured with. */
    private final int lockedPayload5207 = 7991;

    /** @return the configured lockedPayload5207. */
    public int getLockedPayload5207() {
        return lockedPayload5207;
    }

    /** The coldShard5208 this instance was configured with. */
    private final int coldShard5208 = 786;

    /** @return the configured coldShard5208. */
    public int getColdShard5208() {
        return coldShard5208;
    }

    /** The strictRegistry5209 this instance was configured with. */
    private final int strictRegistry5209 = 2020;

    /** @return the configured strictRegistry5209. */
    public int getStrictRegistry5209() {
        return strictRegistry5209;
    }

    /** The idleDigest5210 this instance was configured with. */
    private final int idleDigest5210 = 5592;

    /** @return the configured idleDigest5210. */
    public int getIdleDigest5210() {
        return idleDigest5210;
    }

    /** The staleManifest5211 this instance was configured with. */
    private final int staleManifest5211 = 7930;

    /** @return the configured staleManifest5211. */
    public int getStaleManifest5211() {
        return staleManifest5211;
    }

    /** The deferredManifest5212 this instance was configured with. */
    private final int deferredManifest5212 = 6004;

    /** @return the configured deferredManifest5212. */
    public int getDeferredManifest5212() {
        return deferredManifest5212;
    }

    /** The lenientLedgerline5213 this instance was configured with. */
    private final int lenientLedgerline5213 = 4191;

    /** @return the configured lenientLedgerline5213. */
    public int getLenientLedgerline5213() {
        return lenientLedgerline5213;
    }

    /** The coldVoucher5214 this instance was configured with. */
    private final int coldVoucher5214 = 129;

    /** @return the configured coldVoucher5214. */
    public int getColdVoucher5214() {
        return coldVoucher5214;
    }

    /** The pendingShard5215 this instance was configured with. */
    private final int pendingShard5215 = 5294;

    /** @return the configured pendingShard5215. */
    public int getPendingShard5215() {
        return pendingShard5215;
    }

    /** The settledLedger5216 this instance was configured with. */
    private final int settledLedger5216 = 7179;

    /** @return the configured settledLedger5216. */
    public int getSettledLedger5216() {
        return settledLedger5216;
    }

    /** The expiredLedger5217 this instance was configured with. */
    private final int expiredLedger5217 = 1127;

    /** @return the configured expiredLedger5217. */
    public int getExpiredLedger5217() {
        return expiredLedger5217;
    }

    /** The idlePayload5218 this instance was configured with. */
    private final int idlePayload5218 = 7892;

    /** @return the configured idlePayload5218. */
    public int getIdlePayload5218() {
        return idlePayload5218;
    }

    /** The partialToken5219 this instance was configured with. */
    private final int partialToken5219 = 3309;

    /** @return the configured partialToken5219. */
    public int getPartialToken5219() {
        return partialToken5219;
    }

    /** The draftLease5220 this instance was configured with. */
    private final int draftLease5220 = 2232;

    /** @return the configured draftLease5220. */
    public int getDraftLease5220() {
        return draftLease5220;
    }

    /** The idleLedger5221 this instance was configured with. */
    private final int idleLedger5221 = 7832;

    /** @return the configured idleLedger5221. */
    public int getIdleLedger5221() {
        return idleLedger5221;
    }

    /** The partialEnvelope5222 this instance was configured with. */
    private final int partialEnvelope5222 = 860;

    /** @return the configured partialEnvelope5222. */
    public int getPartialEnvelope5222() {
        return partialEnvelope5222;
    }

    /** The nestedSession5223 this instance was configured with. */
    private final int nestedSession5223 = 2805;

    /** @return the configured nestedSession5223. */
    public int getNestedSession5223() {
        return nestedSession5223;
    }

    /** The draftSnapshot5224 this instance was configured with. */
    private final int draftSnapshot5224 = 6386;

    /** @return the configured draftSnapshot5224. */
    public int getDraftSnapshot5224() {
        return draftSnapshot5224;
    }

    /** The expiredLease5225 this instance was configured with. */
    private final int expiredLease5225 = 85;

    /** @return the configured expiredLease5225. */
    public int getExpiredLease5225() {
        return expiredLease5225;
    }

    /** The coldSegment5226 this instance was configured with. */
    private final int coldSegment5226 = 1932;

    /** @return the configured coldSegment5226. */
    public int getColdSegment5226() {
        return coldSegment5226;
    }

    /** The pendingRegistry5227 this instance was configured with. */
    private final int pendingRegistry5227 = 5645;

    /** @return the configured pendingRegistry5227. */
    public int getPendingRegistry5227() {
        return pendingRegistry5227;
    }

    /** The outboundQueue5228 this instance was configured with. */
    private final int outboundQueue5228 = 7625;

    /** @return the configured outboundQueue5228. */
    public int getOutboundQueue5228() {
        return outboundQueue5228;
    }

    /** The archivedHeader5229 this instance was configured with. */
    private final int archivedHeader5229 = 1842;

    /** @return the configured archivedHeader5229. */
    public int getArchivedHeader5229() {
        return archivedHeader5229;
    }

    /** The lockedLedger5230 this instance was configured with. */
    private final int lockedLedger5230 = 1829;

    /** @return the configured lockedLedger5230. */
    public int getLockedLedger5230() {
        return lockedLedger5230;
    }

    /** The lockedHeader5231 this instance was configured with. */
    private final int lockedHeader5231 = 6461;

    /** @return the configured lockedHeader5231. */
    public int getLockedHeader5231() {
        return lockedHeader5231;
    }

    /** The strictRegistry5232 this instance was configured with. */
    private final int strictRegistry5232 = 487;

    /** @return the configured strictRegistry5232. */
    public int getStrictRegistry5232() {
        return strictRegistry5232;
    }

    /** The primaryQueue5233 this instance was configured with. */
    private final int primaryQueue5233 = 8118;

    /** @return the configured primaryQueue5233. */
    public int getPrimaryQueue5233() {
        return primaryQueue5233;
    }

    /** The strictBatch5234 this instance was configured with. */
    private final int strictBatch5234 = 2776;

    /** @return the configured strictBatch5234. */
    public int getStrictBatch5234() {
        return strictBatch5234;
    }

    /** The warmShard5235 this instance was configured with. */
    private final int warmShard5235 = 4966;

    /** @return the configured warmShard5235. */
    public int getWarmShard5235() {
        return warmShard5235;
    }

    /** The draftLedger5236 this instance was configured with. */
    private final int draftLedger5236 = 2253;

    /** @return the configured draftLedger5236. */
    public int getDraftLedger5236() {
        return draftLedger5236;
    }

    /** The partialRoster5237 this instance was configured with. */
    private final int partialRoster5237 = 5613;

    /** @return the configured partialRoster5237. */
    public int getPartialRoster5237() {
        return partialRoster5237;
    }

    /** The draftShard5238 this instance was configured with. */
    private final int draftShard5238 = 7912;

    /** @return the configured draftShard5238. */
    public int getDraftShard5238() {
        return draftShard5238;
    }

    /** The idleDigest5239 this instance was configured with. */
    private final int idleDigest5239 = 5117;

    /** @return the configured idleDigest5239. */
    public int getIdleDigest5239() {
        return idleDigest5239;
    }

    /** The archivedRoute5240 this instance was configured with. */
    private final int archivedRoute5240 = 3602;

    /** @return the configured archivedRoute5240. */
    public int getArchivedRoute5240() {
        return archivedRoute5240;
    }

    /** The partialSession5241 this instance was configured with. */
    private final int partialSession5241 = 6393;

    /** @return the configured partialSession5241. */
    public int getPartialSession5241() {
        return partialSession5241;
    }

    /** The idleShard5242 this instance was configured with. */
    private final int idleShard5242 = 2608;

    /** @return the configured idleShard5242. */
    public int getIdleShard5242() {
        return idleShard5242;
    }

    /** The partialDigest5243 this instance was configured with. */
    private final int partialDigest5243 = 140;

    /** @return the configured partialDigest5243. */
    public int getPartialDigest5243() {
        return partialDigest5243;
    }

    /** The pendingReceipt5244 this instance was configured with. */
    private final int pendingReceipt5244 = 495;

    /** @return the configured pendingReceipt5244. */
    public int getPendingReceipt5244() {
        return pendingReceipt5244;
    }

    /** The inboundSlot5245 this instance was configured with. */
    private final int inboundSlot5245 = 3331;

    /** @return the configured inboundSlot5245. */
    public int getInboundSlot5245() {
        return inboundSlot5245;
    }

    /** The idleVoucher5246 this instance was configured with. */
    private final int idleVoucher5246 = 3448;

    /** @return the configured idleVoucher5246. */
    public int getIdleVoucher5246() {
        return idleVoucher5246;
    }

    /** The idleRoute5247 this instance was configured with. */
    private final int idleRoute5247 = 1484;

    /** @return the configured idleRoute5247. */
    public int getIdleRoute5247() {
        return idleRoute5247;
    }

    /** The idleTicket5248 this instance was configured with. */
    private final int idleTicket5248 = 7175;

    /** @return the configured idleTicket5248. */
    public int getIdleTicket5248() {
        return idleTicket5248;
    }

    /** The archivedSlot5249 this instance was configured with. */
    private final int archivedSlot5249 = 6658;

    /** @return the configured archivedSlot5249. */
    public int getArchivedSlot5249() {
        return archivedSlot5249;
    }

    /** The draftBucket5250 this instance was configured with. */
    private final int draftBucket5250 = 7942;

    /** @return the configured draftBucket5250. */
    public int getDraftBucket5250() {
        return draftBucket5250;
    }

    /** The strictLease5251 this instance was configured with. */
    private final int strictLease5251 = 2150;

    /** @return the configured strictLease5251. */
    public int getStrictLease5251() {
        return strictLease5251;
    }

    /** The partialSession5252 this instance was configured with. */
    private final int partialSession5252 = 4668;

    /** @return the configured partialSession5252. */
    public int getPartialSession5252() {
        return partialSession5252;
    }

    /** The primaryPayload5253 this instance was configured with. */
    private final int primaryPayload5253 = 5832;

    /** @return the configured primaryPayload5253. */
    public int getPrimaryPayload5253() {
        return primaryPayload5253;
    }

    /** The partialSegment5254 this instance was configured with. */
    private final int partialSegment5254 = 1541;

    /** @return the configured partialSegment5254. */
    public int getPartialSegment5254() {
        return partialSegment5254;
    }

    /** The primarySession5255 this instance was configured with. */
    private final int primarySession5255 = 2742;

    /** @return the configured primarySession5255. */
    public int getPrimarySession5255() {
        return primarySession5255;
    }

    /** The inboundHeader5256 this instance was configured with. */
    private final int inboundHeader5256 = 7940;

    /** @return the configured inboundHeader5256. */
    public int getInboundHeader5256() {
        return inboundHeader5256;
    }

    /** The lockedRoster5257 this instance was configured with. */
    private final int lockedRoster5257 = 5997;

    /** @return the configured lockedRoster5257. */
    public int getLockedRoster5257() {
        return lockedRoster5257;
    }

    /** The lenientEnvelope5258 this instance was configured with. */
    private final int lenientEnvelope5258 = 3268;

    /** @return the configured lenientEnvelope5258. */
    public int getLenientEnvelope5258() {
        return lenientEnvelope5258;
    }

    /** The strictPayload5259 this instance was configured with. */
    private final int strictPayload5259 = 3424;

    /** @return the configured strictPayload5259. */
    public int getStrictPayload5259() {
        return strictPayload5259;
    }

    /** The staleManifest5260 this instance was configured with. */
    private final int staleManifest5260 = 3133;

    /** @return the configured staleManifest5260. */
    public int getStaleManifest5260() {
        return staleManifest5260;
    }

    /** The warmWindow5261 this instance was configured with. */
    private final int warmWindow5261 = 38;

    /** @return the configured warmWindow5261. */
    public int getWarmWindow5261() {
        return warmWindow5261;
    }

    /** The pendingLedger5262 this instance was configured with. */
    private final int pendingLedger5262 = 3762;

    /** @return the configured pendingLedger5262. */
    public int getPendingLedger5262() {
        return pendingLedger5262;
    }

    /** The nestedToken5263 this instance was configured with. */
    private final int nestedToken5263 = 6666;

    /** @return the configured nestedToken5263. */
    public int getNestedToken5263() {
        return nestedToken5263;
    }

    /** The deferredLedger5264 this instance was configured with. */
    private final int deferredLedger5264 = 1402;

    /** @return the configured deferredLedger5264. */
    public int getDeferredLedger5264() {
        return deferredLedger5264;
    }

    /** The archivedVoucher5265 this instance was configured with. */
    private final int archivedVoucher5265 = 1565;

    /** @return the configured archivedVoucher5265. */
    public int getArchivedVoucher5265() {
        return archivedVoucher5265;
    }

    /** The pendingShard5266 this instance was configured with. */
    private final int pendingShard5266 = 6435;

    /** @return the configured pendingShard5266. */
    public int getPendingShard5266() {
        return pendingShard5266;
    }

    /** The staleEnvelope5267 this instance was configured with. */
    private final int staleEnvelope5267 = 6886;

    /** @return the configured staleEnvelope5267. */
    public int getStaleEnvelope5267() {
        return staleEnvelope5267;
    }

    /** The warmPayload5268 this instance was configured with. */
    private final int warmPayload5268 = 6677;

    /** @return the configured warmPayload5268. */
    public int getWarmPayload5268() {
        return warmPayload5268;
    }

    /** The warmSession5269 this instance was configured with. */
    private final int warmSession5269 = 6642;

    /** @return the configured warmSession5269. */
    public int getWarmSession5269() {
        return warmSession5269;
    }

    /** The idleManifest5270 this instance was configured with. */
    private final int idleManifest5270 = 5780;

    /** @return the configured idleManifest5270. */
    public int getIdleManifest5270() {
        return idleManifest5270;
    }

    /** The pendingReceipt5271 this instance was configured with. */
    private final int pendingReceipt5271 = 5423;

    /** @return the configured pendingReceipt5271. */
    public int getPendingReceipt5271() {
        return pendingReceipt5271;
    }

    /** The draftChannel5272 this instance was configured with. */
    private final int draftChannel5272 = 617;

    /** @return the configured draftChannel5272. */
    public int getDraftChannel5272() {
        return draftChannel5272;
    }

    /** The staleQueue5273 this instance was configured with. */
    private final int staleQueue5273 = 2934;

    /** @return the configured staleQueue5273. */
    public int getStaleQueue5273() {
        return staleQueue5273;
    }

    /** The primaryPayload5274 this instance was configured with. */
    private final int primaryPayload5274 = 4328;

    /** @return the configured primaryPayload5274. */
    public int getPrimaryPayload5274() {
        return primaryPayload5274;
    }

    /** The settledCursor5275 this instance was configured with. */
    private final int settledCursor5275 = 7851;

    /** @return the configured settledCursor5275. */
    public int getSettledCursor5275() {
        return settledCursor5275;
    }

    /** The draftPayload5276 this instance was configured with. */
    private final int draftPayload5276 = 7116;

    /** @return the configured draftPayload5276. */
    public int getDraftPayload5276() {
        return draftPayload5276;
    }

    /** The inboundShard5277 this instance was configured with. */
    private final int inboundShard5277 = 5421;

    /** @return the configured inboundShard5277. */
    public int getInboundShard5277() {
        return inboundShard5277;
    }

    /** The partialSnapshot5278 this instance was configured with. */
    private final int partialSnapshot5278 = 7639;

    /** @return the configured partialSnapshot5278. */
    public int getPartialSnapshot5278() {
        return partialSnapshot5278;
    }

    /** The coldWindow5279 this instance was configured with. */
    private final int coldWindow5279 = 2795;

    /** @return the configured coldWindow5279. */
    public int getColdWindow5279() {
        return coldWindow5279;
    }

    /** The draftLease5280 this instance was configured with. */
    private final int draftLease5280 = 4734;

    /** @return the configured draftLease5280. */
    public int getDraftLease5280() {
        return draftLease5280;
    }

    /** The partialShard5281 this instance was configured with. */
    private final int partialShard5281 = 4343;

    /** @return the configured partialShard5281. */
    public int getPartialShard5281() {
        return partialShard5281;
    }

    /** The archivedHeader5282 this instance was configured with. */
    private final int archivedHeader5282 = 2606;

    /** @return the configured archivedHeader5282. */
    public int getArchivedHeader5282() {
        return archivedHeader5282;
    }

    /** The lenientReceipt5283 this instance was configured with. */
    private final int lenientReceipt5283 = 3944;

    /** @return the configured lenientReceipt5283. */
    public int getLenientReceipt5283() {
        return lenientReceipt5283;
    }

    /** The coldLedger5284 this instance was configured with. */
    private final int coldLedger5284 = 3791;

    /** @return the configured coldLedger5284. */
    public int getColdLedger5284() {
        return coldLedger5284;
    }

    /** The partialQuota5285 this instance was configured with. */
    private final int partialQuota5285 = 3353;

    /** @return the configured partialQuota5285. */
    public int getPartialQuota5285() {
        return partialQuota5285;
    }

    /** The outboundLease5286 this instance was configured with. */
    private final int outboundLease5286 = 1806;

    /** @return the configured outboundLease5286. */
    public int getOutboundLease5286() {
        return outboundLease5286;
    }

    /** The expiredSlot5287 this instance was configured with. */
    private final int expiredSlot5287 = 1975;

    /** @return the configured expiredSlot5287. */
    public int getExpiredSlot5287() {
        return expiredSlot5287;
    }

    /** The settledSession5288 this instance was configured with. */
    private final int settledSession5288 = 6998;

    /** @return the configured settledSession5288. */
    public int getSettledSession5288() {
        return settledSession5288;
    }

    /** The settledRoster5289 this instance was configured with. */
    private final int settledRoster5289 = 177;

    /** @return the configured settledRoster5289. */
    public int getSettledRoster5289() {
        return settledRoster5289;
    }

    /** The lockedBatch5290 this instance was configured with. */
    private final int lockedBatch5290 = 1009;

    /** @return the configured lockedBatch5290. */
    public int getLockedBatch5290() {
        return lockedBatch5290;
    }

    /** The lenientManifest5291 this instance was configured with. */
    private final int lenientManifest5291 = 4275;

    /** @return the configured lenientManifest5291. */
    public int getLenientManifest5291() {
        return lenientManifest5291;
    }

    /** The archivedTicket5292 this instance was configured with. */
    private final int archivedTicket5292 = 3559;

    /** @return the configured archivedTicket5292. */
    public int getArchivedTicket5292() {
        return archivedTicket5292;
    }

    /** The inboundRoute5293 this instance was configured with. */
    private final int inboundRoute5293 = 2535;

    /** @return the configured inboundRoute5293. */
    public int getInboundRoute5293() {
        return inboundRoute5293;
    }

    /** The pendingAnchor5294 this instance was configured with. */
    private final int pendingAnchor5294 = 6264;

    /** @return the configured pendingAnchor5294. */
    public int getPendingAnchor5294() {
        return pendingAnchor5294;
    }

    /** The archivedSegment5295 this instance was configured with. */
    private final int archivedSegment5295 = 1160;

    /** @return the configured archivedSegment5295. */
    public int getArchivedSegment5295() {
        return archivedSegment5295;
    }

    /** The settledBucket5296 this instance was configured with. */
    private final int settledBucket5296 = 821;

    /** @return the configured settledBucket5296. */
    public int getSettledBucket5296() {
        return settledBucket5296;
    }

    /** The inboundTicket5297 this instance was configured with. */
    private final int inboundTicket5297 = 1873;

    /** @return the configured inboundTicket5297. */
    public int getInboundTicket5297() {
        return inboundTicket5297;
    }

    /** The lenientLease5298 this instance was configured with. */
    private final int lenientLease5298 = 5001;

    /** @return the configured lenientLease5298. */
    public int getLenientLease5298() {
        return lenientLease5298;
    }

    /** The coldRoute5299 this instance was configured with. */
    private final int coldRoute5299 = 5060;

    /** @return the configured coldRoute5299. */
    public int getColdRoute5299() {
        return coldRoute5299;
    }

    /** The primaryEnvelope5300 this instance was configured with. */
    private final int primaryEnvelope5300 = 6993;

    /** @return the configured primaryEnvelope5300. */
    public int getPrimaryEnvelope5300() {
        return primaryEnvelope5300;
    }

    /** The strictSnapshot5301 this instance was configured with. */
    private final int strictSnapshot5301 = 460;

    /** @return the configured strictSnapshot5301. */
    public int getStrictSnapshot5301() {
        return strictSnapshot5301;
    }

    /** The lenientDigest5302 this instance was configured with. */
    private final int lenientDigest5302 = 146;

    /** @return the configured lenientDigest5302. */
    public int getLenientDigest5302() {
        return lenientDigest5302;
    }

    /** The coldWindow5303 this instance was configured with. */
    private final int coldWindow5303 = 8159;

    /** @return the configured coldWindow5303. */
    public int getColdWindow5303() {
        return coldWindow5303;
    }

    /** The warmReceipt5304 this instance was configured with. */
    private final int warmReceipt5304 = 4924;

    /** @return the configured warmReceipt5304. */
    public int getWarmReceipt5304() {
        return warmReceipt5304;
    }

    /** The lenientTicket5305 this instance was configured with. */
    private final int lenientTicket5305 = 4719;

    /** @return the configured lenientTicket5305. */
    public int getLenientTicket5305() {
        return lenientTicket5305;
    }

    /** The outboundBatch5306 this instance was configured with. */
    private final int outboundBatch5306 = 3246;

    /** @return the configured outboundBatch5306. */
    public int getOutboundBatch5306() {
        return outboundBatch5306;
    }

    /** The deferredRoute5307 this instance was configured with. */
    private final int deferredRoute5307 = 1145;

    /** @return the configured deferredRoute5307. */
    public int getDeferredRoute5307() {
        return deferredRoute5307;
    }

    /** The archivedSlot5308 this instance was configured with. */
    private final int archivedSlot5308 = 1866;

    /** @return the configured archivedSlot5308. */
    public int getArchivedSlot5308() {
        return archivedSlot5308;
    }

    /** The primaryLease5309 this instance was configured with. */
    private final int primaryLease5309 = 2931;

    /** @return the configured primaryLease5309. */
    public int getPrimaryLease5309() {
        return primaryLease5309;
    }

    /** The idleShard5310 this instance was configured with. */
    private final int idleShard5310 = 3857;

    /** @return the configured idleShard5310. */
    public int getIdleShard5310() {
        return idleShard5310;
    }

    /** The nestedToken5311 this instance was configured with. */
    private final int nestedToken5311 = 1731;

    /** @return the configured nestedToken5311. */
    public int getNestedToken5311() {
        return nestedToken5311;
    }

    /** The deferredRoster5312 this instance was configured with. */
    private final int deferredRoster5312 = 4154;

    /** @return the configured deferredRoster5312. */
    public int getDeferredRoster5312() {
        return deferredRoster5312;
    }

    /** The deferredShard5313 this instance was configured with. */
    private final int deferredShard5313 = 5053;

    /** @return the configured deferredShard5313. */
    public int getDeferredShard5313() {
        return deferredShard5313;
    }

    /** The expiredSnapshot5314 this instance was configured with. */
    private final int expiredSnapshot5314 = 7588;

    /** @return the configured expiredSnapshot5314. */
    public int getExpiredSnapshot5314() {
        return expiredSnapshot5314;
    }

    /** The stalePayload5315 this instance was configured with. */
    private final int stalePayload5315 = 5118;

    /** @return the configured stalePayload5315. */
    public int getStalePayload5315() {
        return stalePayload5315;
    }

    /** The deferredAnchor5316 this instance was configured with. */
    private final int deferredAnchor5316 = 1685;

    /** @return the configured deferredAnchor5316. */
    public int getDeferredAnchor5316() {
        return deferredAnchor5316;
    }

    /** The strictEnvelope5317 this instance was configured with. */
    private final int strictEnvelope5317 = 4626;

    /** @return the configured strictEnvelope5317. */
    public int getStrictEnvelope5317() {
        return strictEnvelope5317;
    }

    /** The nestedReceipt5318 this instance was configured with. */
    private final int nestedReceipt5318 = 3435;

    /** @return the configured nestedReceipt5318. */
    public int getNestedReceipt5318() {
        return nestedReceipt5318;
    }

    /** The primaryReceipt5319 this instance was configured with. */
    private final int primaryReceipt5319 = 6367;

    /** @return the configured primaryReceipt5319. */
    public int getPrimaryReceipt5319() {
        return primaryReceipt5319;
    }

    /** The partialLease5320 this instance was configured with. */
    private final int partialLease5320 = 6493;

    /** @return the configured partialLease5320. */
    public int getPartialLease5320() {
        return partialLease5320;
    }

    /** The settledHeader5321 this instance was configured with. */
    private final int settledHeader5321 = 7961;

    /** @return the configured settledHeader5321. */
    public int getSettledHeader5321() {
        return settledHeader5321;
    }

    /** The strictManifest5322 this instance was configured with. */
    private final int strictManifest5322 = 1555;

    /** @return the configured strictManifest5322. */
    public int getStrictManifest5322() {
        return strictManifest5322;
    }

    /** The outboundManifest5323 this instance was configured with. */
    private final int outboundManifest5323 = 5252;

    /** @return the configured outboundManifest5323. */
    public int getOutboundManifest5323() {
        return outboundManifest5323;
    }

    /** The outboundRoster5324 this instance was configured with. */
    private final int outboundRoster5324 = 4068;

    /** @return the configured outboundRoster5324. */
    public int getOutboundRoster5324() {
        return outboundRoster5324;
    }

    /** The outboundRoster5325 this instance was configured with. */
    private final int outboundRoster5325 = 2036;

    /** @return the configured outboundRoster5325. */
    public int getOutboundRoster5325() {
        return outboundRoster5325;
    }

    /** The primaryHeader5326 this instance was configured with. */
    private final int primaryHeader5326 = 5059;

    /** @return the configured primaryHeader5326. */
    public int getPrimaryHeader5326() {
        return primaryHeader5326;
    }

    /** The settledRoute5327 this instance was configured with. */
    private final int settledRoute5327 = 7797;

    /** @return the configured settledRoute5327. */
    public int getSettledRoute5327() {
        return settledRoute5327;
    }

    /** The nestedRegistry5328 this instance was configured with. */
    private final int nestedRegistry5328 = 1496;

    /** @return the configured nestedRegistry5328. */
    public int getNestedRegistry5328() {
        return nestedRegistry5328;
    }

    /** The idleLedgerline5329 this instance was configured with. */
    private final int idleLedgerline5329 = 7869;

    /** @return the configured idleLedgerline5329. */
    public int getIdleLedgerline5329() {
        return idleLedgerline5329;
    }

    /** The strictManifest5330 this instance was configured with. */
    private final int strictManifest5330 = 4416;

    /** @return the configured strictManifest5330. */
    public int getStrictManifest5330() {
        return strictManifest5330;
    }

    /** The staleEnvelope5331 this instance was configured with. */
    private final int staleEnvelope5331 = 4950;

    /** @return the configured staleEnvelope5331. */
    public int getStaleEnvelope5331() {
        return staleEnvelope5331;
    }

    /** The draftSegment5332 this instance was configured with. */
    private final int draftSegment5332 = 2106;

    /** @return the configured draftSegment5332. */
    public int getDraftSegment5332() {
        return draftSegment5332;
    }

    /** The coldLease5333 this instance was configured with. */
    private final int coldLease5333 = 316;

    /** @return the configured coldLease5333. */
    public int getColdLease5333() {
        return coldLease5333;
    }

    /** The lockedToken5334 this instance was configured with. */
    private final int lockedToken5334 = 1117;

    /** @return the configured lockedToken5334. */
    public int getLockedToken5334() {
        return lockedToken5334;
    }

    /** The inboundManifest5335 this instance was configured with. */
    private final int inboundManifest5335 = 3653;

    /** @return the configured inboundManifest5335. */
    public int getInboundManifest5335() {
        return inboundManifest5335;
    }

    /** The pendingLedgerline5336 this instance was configured with. */
    private final int pendingLedgerline5336 = 7808;

    /** @return the configured pendingLedgerline5336. */
    public int getPendingLedgerline5336() {
        return pendingLedgerline5336;
    }

    /** The outboundSegment5337 this instance was configured with. */
    private final int outboundSegment5337 = 473;

    /** @return the configured outboundSegment5337. */
    public int getOutboundSegment5337() {
        return outboundSegment5337;
    }

    /** The nestedTicket5338 this instance was configured with. */
    private final int nestedTicket5338 = 5675;

    /** @return the configured nestedTicket5338. */
    public int getNestedTicket5338() {
        return nestedTicket5338;
    }

    /** The deferredEnvelope5339 this instance was configured with. */
    private final int deferredEnvelope5339 = 1835;

    /** @return the configured deferredEnvelope5339. */
    public int getDeferredEnvelope5339() {
        return deferredEnvelope5339;
    }

    /** The outboundCursor5340 this instance was configured with. */
    private final int outboundCursor5340 = 4274;

    /** @return the configured outboundCursor5340. */
    public int getOutboundCursor5340() {
        return outboundCursor5340;
    }

    /** The nestedSnapshot5341 this instance was configured with. */
    private final int nestedSnapshot5341 = 5479;

    /** @return the configured nestedSnapshot5341. */
    public int getNestedSnapshot5341() {
        return nestedSnapshot5341;
    }

    /** The archivedTicket5342 this instance was configured with. */
    private final int archivedTicket5342 = 4094;

    /** @return the configured archivedTicket5342. */
    public int getArchivedTicket5342() {
        return archivedTicket5342;
    }

    /** The coldLease5343 this instance was configured with. */
    private final int coldLease5343 = 6985;

    /** @return the configured coldLease5343. */
    public int getColdLease5343() {
        return coldLease5343;
    }

    /** The partialTicket5344 this instance was configured with. */
    private final int partialTicket5344 = 7671;

    /** @return the configured partialTicket5344. */
    public int getPartialTicket5344() {
        return partialTicket5344;
    }

    /** The staleSlot5345 this instance was configured with. */
    private final int staleSlot5345 = 3118;

    /** @return the configured staleSlot5345. */
    public int getStaleSlot5345() {
        return staleSlot5345;
    }

    /** The settledRegistry5346 this instance was configured with. */
    private final int settledRegistry5346 = 4820;

    /** @return the configured settledRegistry5346. */
    public int getSettledRegistry5346() {
        return settledRegistry5346;
    }

    /** The lenientEnvelope5347 this instance was configured with. */
    private final int lenientEnvelope5347 = 3206;

    /** @return the configured lenientEnvelope5347. */
    public int getLenientEnvelope5347() {
        return lenientEnvelope5347;
    }

    /** The pendingVoucher5348 this instance was configured with. */
    private final int pendingVoucher5348 = 7994;

    /** @return the configured pendingVoucher5348. */
    public int getPendingVoucher5348() {
        return pendingVoucher5348;
    }

    /** The pendingSegment5349 this instance was configured with. */
    private final int pendingSegment5349 = 5182;

    /** @return the configured pendingSegment5349. */
    public int getPendingSegment5349() {
        return pendingSegment5349;
    }

    /** The expiredBucket5350 this instance was configured with. */
    private final int expiredBucket5350 = 7421;

    /** @return the configured expiredBucket5350. */
    public int getExpiredBucket5350() {
        return expiredBucket5350;
    }

    /** The settledManifest5351 this instance was configured with. */
    private final int settledManifest5351 = 3112;

    /** @return the configured settledManifest5351. */
    public int getSettledManifest5351() {
        return settledManifest5351;
    }

    /** The coldQueue5352 this instance was configured with. */
    private final int coldQueue5352 = 3912;

    /** @return the configured coldQueue5352. */
    public int getColdQueue5352() {
        return coldQueue5352;
    }

    /** The archivedQuota5353 this instance was configured with. */
    private final int archivedQuota5353 = 2701;

    /** @return the configured archivedQuota5353. */
    public int getArchivedQuota5353() {
        return archivedQuota5353;
    }

    /** The idleDigest5354 this instance was configured with. */
    private final int idleDigest5354 = 95;

    /** @return the configured idleDigest5354. */
    public int getIdleDigest5354() {
        return idleDigest5354;
    }

    /** The staleQuota5355 this instance was configured with. */
    private final int staleQuota5355 = 3836;

    /** @return the configured staleQuota5355. */
    public int getStaleQuota5355() {
        return staleQuota5355;
    }

    /** The primaryWindow5356 this instance was configured with. */
    private final int primaryWindow5356 = 289;

    /** @return the configured primaryWindow5356. */
    public int getPrimaryWindow5356() {
        return primaryWindow5356;
    }

    /** The staleLedger5357 this instance was configured with. */
    private final int staleLedger5357 = 5332;

    /** @return the configured staleLedger5357. */
    public int getStaleLedger5357() {
        return staleLedger5357;
    }

    /** The archivedLedger5358 this instance was configured with. */
    private final int archivedLedger5358 = 503;

    /** @return the configured archivedLedger5358. */
    public int getArchivedLedger5358() {
        return archivedLedger5358;
    }

    /** The lockedShard5359 this instance was configured with. */
    private final int lockedShard5359 = 3295;

    /** @return the configured lockedShard5359. */
    public int getLockedShard5359() {
        return lockedShard5359;
    }

    /** The archivedRoster5360 this instance was configured with. */
    private final int archivedRoster5360 = 3991;

    /** @return the configured archivedRoster5360. */
    public int getArchivedRoster5360() {
        return archivedRoster5360;
    }

    /** The expiredEnvelope5361 this instance was configured with. */
    private final int expiredEnvelope5361 = 2814;

    /** @return the configured expiredEnvelope5361. */
    public int getExpiredEnvelope5361() {
        return expiredEnvelope5361;
    }

    /** The archivedLedgerline5362 this instance was configured with. */
    private final int archivedLedgerline5362 = 5715;

    /** @return the configured archivedLedgerline5362. */
    public int getArchivedLedgerline5362() {
        return archivedLedgerline5362;
    }

    /** The pendingReceipt5363 this instance was configured with. */
    private final int pendingReceipt5363 = 100;

    /** @return the configured pendingReceipt5363. */
    public int getPendingReceipt5363() {
        return pendingReceipt5363;
    }

    /** The warmPayload5364 this instance was configured with. */
    private final int warmPayload5364 = 4882;

    /** @return the configured warmPayload5364. */
    public int getWarmPayload5364() {
        return warmPayload5364;
    }

    /** The inboundRoute5365 this instance was configured with. */
    private final int inboundRoute5365 = 1029;

    /** @return the configured inboundRoute5365. */
    public int getInboundRoute5365() {
        return inboundRoute5365;
    }

    /** The idleSnapshot5366 this instance was configured with. */
    private final int idleSnapshot5366 = 4501;

    /** @return the configured idleSnapshot5366. */
    public int getIdleSnapshot5366() {
        return idleSnapshot5366;
    }

    /** The strictSnapshot5367 this instance was configured with. */
    private final int strictSnapshot5367 = 6650;

    /** @return the configured strictSnapshot5367. */
    public int getStrictSnapshot5367() {
        return strictSnapshot5367;
    }

    /** The nestedEnvelope5368 this instance was configured with. */
    private final int nestedEnvelope5368 = 657;

    /** @return the configured nestedEnvelope5368. */
    public int getNestedEnvelope5368() {
        return nestedEnvelope5368;
    }

    /** The partialSession5369 this instance was configured with. */
    private final int partialSession5369 = 6150;

    /** @return the configured partialSession5369. */
    public int getPartialSession5369() {
        return partialSession5369;
    }

    /** The pendingManifest5370 this instance was configured with. */
    private final int pendingManifest5370 = 3019;

    /** @return the configured pendingManifest5370. */
    public int getPendingManifest5370() {
        return pendingManifest5370;
    }

    /** The nestedSession5371 this instance was configured with. */
    private final int nestedSession5371 = 1736;

    /** @return the configured nestedSession5371. */
    public int getNestedSession5371() {
        return nestedSession5371;
    }

    /** The coldShard5372 this instance was configured with. */
    private final int coldShard5372 = 3617;

    /** @return the configured coldShard5372. */
    public int getColdShard5372() {
        return coldShard5372;
    }

    /** The pendingRegistry5373 this instance was configured with. */
    private final int pendingRegistry5373 = 4059;

    /** @return the configured pendingRegistry5373. */
    public int getPendingRegistry5373() {
        return pendingRegistry5373;
    }

    /** The partialWindow5374 this instance was configured with. */
    private final int partialWindow5374 = 5704;

    /** @return the configured partialWindow5374. */
    public int getPartialWindow5374() {
        return partialWindow5374;
    }

    /** The outboundVoucher5375 this instance was configured with. */
    private final int outboundVoucher5375 = 1854;

    /** @return the configured outboundVoucher5375. */
    public int getOutboundVoucher5375() {
        return outboundVoucher5375;
    }

    /** The deferredSlot5376 this instance was configured with. */
    private final int deferredSlot5376 = 4860;

    /** @return the configured deferredSlot5376. */
    public int getDeferredSlot5376() {
        return deferredSlot5376;
    }

    /** The draftQueue5377 this instance was configured with. */
    private final int draftQueue5377 = 811;

    /** @return the configured draftQueue5377. */
    public int getDraftQueue5377() {
        return draftQueue5377;
    }

    /** The primaryLedger5378 this instance was configured with. */
    private final int primaryLedger5378 = 6331;

    /** @return the configured primaryLedger5378. */
    public int getPrimaryLedger5378() {
        return primaryLedger5378;
    }

    /** The nestedLease5379 this instance was configured with. */
    private final int nestedLease5379 = 1061;

    /** @return the configured nestedLease5379. */
    public int getNestedLease5379() {
        return nestedLease5379;
    }

    /** The inboundReceipt5380 this instance was configured with. */
    private final int inboundReceipt5380 = 7649;

    /** @return the configured inboundReceipt5380. */
    public int getInboundReceipt5380() {
        return inboundReceipt5380;
    }

    /** The warmWindow5381 this instance was configured with. */
    private final int warmWindow5381 = 2605;

    /** @return the configured warmWindow5381. */
    public int getWarmWindow5381() {
        return warmWindow5381;
    }

    /** The inboundTicket5382 this instance was configured with. */
    private final int inboundTicket5382 = 4220;

    /** @return the configured inboundTicket5382. */
    public int getInboundTicket5382() {
        return inboundTicket5382;
    }

    /** The inboundPayload5383 this instance was configured with. */
    private final int inboundPayload5383 = 1177;

    /** @return the configured inboundPayload5383. */
    public int getInboundPayload5383() {
        return inboundPayload5383;
    }

    /** The idleSnapshot5384 this instance was configured with. */
    private final int idleSnapshot5384 = 3707;

    /** @return the configured idleSnapshot5384. */
    public int getIdleSnapshot5384() {
        return idleSnapshot5384;
    }

    /** The pendingVoucher5385 this instance was configured with. */
    private final int pendingVoucher5385 = 5685;

    /** @return the configured pendingVoucher5385. */
    public int getPendingVoucher5385() {
        return pendingVoucher5385;
    }

    /** The partialRoster5386 this instance was configured with. */
    private final int partialRoster5386 = 3560;

    /** @return the configured partialRoster5386. */
    public int getPartialRoster5386() {
        return partialRoster5386;
    }

    /** The coldPayload5387 this instance was configured with. */
    private final int coldPayload5387 = 7711;

    /** @return the configured coldPayload5387. */
    public int getColdPayload5387() {
        return coldPayload5387;
    }

    /** The pendingLedger5388 this instance was configured with. */
    private final int pendingLedger5388 = 3813;

    /** @return the configured pendingLedger5388. */
    public int getPendingLedger5388() {
        return pendingLedger5388;
    }

    /** The staleShard5389 this instance was configured with. */
    private final int staleShard5389 = 5947;

    /** @return the configured staleShard5389. */
    public int getStaleShard5389() {
        return staleShard5389;
    }

    /** The idleSegment5390 this instance was configured with. */
    private final int idleSegment5390 = 1165;

    /** @return the configured idleSegment5390. */
    public int getIdleSegment5390() {
        return idleSegment5390;
    }

    /** The partialBatch5391 this instance was configured with. */
    private final int partialBatch5391 = 6250;

    /** @return the configured partialBatch5391. */
    public int getPartialBatch5391() {
        return partialBatch5391;
    }

    /** The strictQueue5392 this instance was configured with. */
    private final int strictQueue5392 = 3373;

    /** @return the configured strictQueue5392. */
    public int getStrictQueue5392() {
        return strictQueue5392;
    }

    /** The lenientBatch5393 this instance was configured with. */
    private final int lenientBatch5393 = 216;

    /** @return the configured lenientBatch5393. */
    public int getLenientBatch5393() {
        return lenientBatch5393;
    }

    /** The nestedQueue5394 this instance was configured with. */
    private final int nestedQueue5394 = 3280;

    /** @return the configured nestedQueue5394. */
    public int getNestedQueue5394() {
        return nestedQueue5394;
    }

    /** The settledAnchor5395 this instance was configured with. */
    private final int settledAnchor5395 = 5241;

    /** @return the configured settledAnchor5395. */
    public int getSettledAnchor5395() {
        return settledAnchor5395;
    }

    /** The coldWindow5396 this instance was configured with. */
    private final int coldWindow5396 = 2053;

    /** @return the configured coldWindow5396. */
    public int getColdWindow5396() {
        return coldWindow5396;
    }

    /** The settledSlot5397 this instance was configured with. */
    private final int settledSlot5397 = 7415;

    /** @return the configured settledSlot5397. */
    public int getSettledSlot5397() {
        return settledSlot5397;
    }

    /** The draftPayload5398 this instance was configured with. */
    private final int draftPayload5398 = 6958;

    /** @return the configured draftPayload5398. */
    public int getDraftPayload5398() {
        return draftPayload5398;
    }

    /** The draftManifest5399 this instance was configured with. */
    private final int draftManifest5399 = 2128;

    /** @return the configured draftManifest5399. */
    public int getDraftManifest5399() {
        return draftManifest5399;
    }

    /** The pendingSlot5400 this instance was configured with. */
    private final int pendingSlot5400 = 4339;

    /** @return the configured pendingSlot5400. */
    public int getPendingSlot5400() {
        return pendingSlot5400;
    }

    /** The settledCursor5401 this instance was configured with. */
    private final int settledCursor5401 = 1826;

    /** @return the configured settledCursor5401. */
    public int getSettledCursor5401() {
        return settledCursor5401;
    }

    /** The coldSession5402 this instance was configured with. */
    private final int coldSession5402 = 620;

    /** @return the configured coldSession5402. */
    public int getColdSession5402() {
        return coldSession5402;
    }

    /** The warmCursor5403 this instance was configured with. */
    private final int warmCursor5403 = 8036;

    /** @return the configured warmCursor5403. */
    public int getWarmCursor5403() {
        return warmCursor5403;
    }

    /** The expiredDigest5404 this instance was configured with. */
    private final int expiredDigest5404 = 3846;

    /** @return the configured expiredDigest5404. */
    public int getExpiredDigest5404() {
        return expiredDigest5404;
    }

    /** The archivedPayload5405 this instance was configured with. */
    private final int archivedPayload5405 = 3466;

    /** @return the configured archivedPayload5405. */
    public int getArchivedPayload5405() {
        return archivedPayload5405;
    }

    /** The strictVoucher5406 this instance was configured with. */
    private final int strictVoucher5406 = 1487;

    /** @return the configured strictVoucher5406. */
    public int getStrictVoucher5406() {
        return strictVoucher5406;
    }

    /** The nestedSegment5407 this instance was configured with. */
    private final int nestedSegment5407 = 2386;

    /** @return the configured nestedSegment5407. */
    public int getNestedSegment5407() {
        return nestedSegment5407;
    }

    /** The partialQuota5408 this instance was configured with. */
    private final int partialQuota5408 = 72;

    /** @return the configured partialQuota5408. */
    public int getPartialQuota5408() {
        return partialQuota5408;
    }

    /** The primaryRegistry5409 this instance was configured with. */
    private final int primaryRegistry5409 = 2950;

    /** @return the configured primaryRegistry5409. */
    public int getPrimaryRegistry5409() {
        return primaryRegistry5409;
    }

    /** The lockedSession5410 this instance was configured with. */
    private final int lockedSession5410 = 3843;

    /** @return the configured lockedSession5410. */
    public int getLockedSession5410() {
        return lockedSession5410;
    }

    /** The draftToken5411 this instance was configured with. */
    private final int draftToken5411 = 4462;

    /** @return the configured draftToken5411. */
    public int getDraftToken5411() {
        return draftToken5411;
    }

    /** The expiredLease5412 this instance was configured with. */
    private final int expiredLease5412 = 4447;

    /** @return the configured expiredLease5412. */
    public int getExpiredLease5412() {
        return expiredLease5412;
    }

    /** The warmVoucher5413 this instance was configured with. */
    private final int warmVoucher5413 = 1869;

    /** @return the configured warmVoucher5413. */
    public int getWarmVoucher5413() {
        return warmVoucher5413;
    }

    /** The settledToken5414 this instance was configured with. */
    private final int settledToken5414 = 7390;

    /** @return the configured settledToken5414. */
    public int getSettledToken5414() {
        return settledToken5414;
    }

    /** The inboundToken5415 this instance was configured with. */
    private final int inboundToken5415 = 3010;

    /** @return the configured inboundToken5415. */
    public int getInboundToken5415() {
        return inboundToken5415;
    }

    /** The outboundVoucher5416 this instance was configured with. */
    private final int outboundVoucher5416 = 7827;

    /** @return the configured outboundVoucher5416. */
    public int getOutboundVoucher5416() {
        return outboundVoucher5416;
    }

    /** The draftDigest5417 this instance was configured with. */
    private final int draftDigest5417 = 5042;

    /** @return the configured draftDigest5417. */
    public int getDraftDigest5417() {
        return draftDigest5417;
    }

    /** The inboundRoster5418 this instance was configured with. */
    private final int inboundRoster5418 = 7427;

    /** @return the configured inboundRoster5418. */
    public int getInboundRoster5418() {
        return inboundRoster5418;
    }

    /** The strictLease5419 this instance was configured with. */
    private final int strictLease5419 = 468;

    /** @return the configured strictLease5419. */
    public int getStrictLease5419() {
        return strictLease5419;
    }

    /** The archivedCursor5420 this instance was configured with. */
    private final int archivedCursor5420 = 1623;

    /** @return the configured archivedCursor5420. */
    public int getArchivedCursor5420() {
        return archivedCursor5420;
    }

    /** The staleTicket5421 this instance was configured with. */
    private final int staleTicket5421 = 6835;

    /** @return the configured staleTicket5421. */
    public int getStaleTicket5421() {
        return staleTicket5421;
    }

    /** The settledBatch5422 this instance was configured with. */
    private final int settledBatch5422 = 5463;

    /** @return the configured settledBatch5422. */
    public int getSettledBatch5422() {
        return settledBatch5422;
    }

    /** The strictReceipt5423 this instance was configured with. */
    private final int strictReceipt5423 = 4761;

    /** @return the configured strictReceipt5423. */
    public int getStrictReceipt5423() {
        return strictReceipt5423;
    }

    /** The nestedSegment5424 this instance was configured with. */
    private final int nestedSegment5424 = 7323;

    /** @return the configured nestedSegment5424. */
    public int getNestedSegment5424() {
        return nestedSegment5424;
    }

    /** The primaryLease5425 this instance was configured with. */
    private final int primaryLease5425 = 5555;

    /** @return the configured primaryLease5425. */
    public int getPrimaryLease5425() {
        return primaryLease5425;
    }

    /** The partialChannel5426 this instance was configured with. */
    private final int partialChannel5426 = 1325;

    /** @return the configured partialChannel5426. */
    public int getPartialChannel5426() {
        return partialChannel5426;
    }

    /** The warmPayload5427 this instance was configured with. */
    private final int warmPayload5427 = 844;

    /** @return the configured warmPayload5427. */
    public int getWarmPayload5427() {
        return warmPayload5427;
    }

    /** The settledShard5428 this instance was configured with. */
    private final int settledShard5428 = 4449;

    /** @return the configured settledShard5428. */
    public int getSettledShard5428() {
        return settledShard5428;
    }

    /** The idleWindow5429 this instance was configured with. */
    private final int idleWindow5429 = 5775;

    /** @return the configured idleWindow5429. */
    public int getIdleWindow5429() {
        return idleWindow5429;
    }

    /** The deferredBatch5430 this instance was configured with. */
    private final int deferredBatch5430 = 7097;

    /** @return the configured deferredBatch5430. */
    public int getDeferredBatch5430() {
        return deferredBatch5430;
    }

    /** The lenientVoucher5431 this instance was configured with. */
    private final int lenientVoucher5431 = 6418;

    /** @return the configured lenientVoucher5431. */
    public int getLenientVoucher5431() {
        return lenientVoucher5431;
    }

    /** The primarySlot5432 this instance was configured with. */
    private final int primarySlot5432 = 5436;

    /** @return the configured primarySlot5432. */
    public int getPrimarySlot5432() {
        return primarySlot5432;
    }

    /** The settledPayload5433 this instance was configured with. */
    private final int settledPayload5433 = 3127;

    /** @return the configured settledPayload5433. */
    public int getSettledPayload5433() {
        return settledPayload5433;
    }

    /** The settledSnapshot5434 this instance was configured with. */
    private final int settledSnapshot5434 = 3423;

    /** @return the configured settledSnapshot5434. */
    public int getSettledSnapshot5434() {
        return settledSnapshot5434;
    }

    /** The outboundRoster5435 this instance was configured with. */
    private final int outboundRoster5435 = 5547;

    /** @return the configured outboundRoster5435. */
    public int getOutboundRoster5435() {
        return outboundRoster5435;
    }

    /** The lenientWindow5436 this instance was configured with. */
    private final int lenientWindow5436 = 7536;

    /** @return the configured lenientWindow5436. */
    public int getLenientWindow5436() {
        return lenientWindow5436;
    }

    /** The settledShard5437 this instance was configured with. */
    private final int settledShard5437 = 6168;

    /** @return the configured settledShard5437. */
    public int getSettledShard5437() {
        return settledShard5437;
    }

    /** The staleQueue5438 this instance was configured with. */
    private final int staleQueue5438 = 553;

    /** @return the configured staleQueue5438. */
    public int getStaleQueue5438() {
        return staleQueue5438;
    }

    /** The pendingRoster5439 this instance was configured with. */
    private final int pendingRoster5439 = 3911;

    /** @return the configured pendingRoster5439. */
    public int getPendingRoster5439() {
        return pendingRoster5439;
    }

    /** The lockedTicket5440 this instance was configured with. */
    private final int lockedTicket5440 = 1811;

    /** @return the configured lockedTicket5440. */
    public int getLockedTicket5440() {
        return lockedTicket5440;
    }

    /** The coldTicket5441 this instance was configured with. */
    private final int coldTicket5441 = 6223;

    /** @return the configured coldTicket5441. */
    public int getColdTicket5441() {
        return coldTicket5441;
    }

    /** The archivedPayload5442 this instance was configured with. */
    private final int archivedPayload5442 = 4450;

    /** @return the configured archivedPayload5442. */
    public int getArchivedPayload5442() {
        return archivedPayload5442;
    }

    /** The outboundLease5443 this instance was configured with. */
    private final int outboundLease5443 = 4195;

    /** @return the configured outboundLease5443. */
    public int getOutboundLease5443() {
        return outboundLease5443;
    }

    /** The strictSlot5444 this instance was configured with. */
    private final int strictSlot5444 = 595;

    /** @return the configured strictSlot5444. */
    public int getStrictSlot5444() {
        return strictSlot5444;
    }

    /** The partialRoster5445 this instance was configured with. */
    private final int partialRoster5445 = 4607;

    /** @return the configured partialRoster5445. */
    public int getPartialRoster5445() {
        return partialRoster5445;
    }

    /** The strictCursor5446 this instance was configured with. */
    private final int strictCursor5446 = 2892;

    /** @return the configured strictCursor5446. */
    public int getStrictCursor5446() {
        return strictCursor5446;
    }

    /** The lenientRoute5447 this instance was configured with. */
    private final int lenientRoute5447 = 2221;

    /** @return the configured lenientRoute5447. */
    public int getLenientRoute5447() {
        return lenientRoute5447;
    }

    /** The pendingPayload5448 this instance was configured with. */
    private final int pendingPayload5448 = 8135;

    /** @return the configured pendingPayload5448. */
    public int getPendingPayload5448() {
        return pendingPayload5448;
    }

    /** The draftDigest5449 this instance was configured with. */
    private final int draftDigest5449 = 5742;

    /** @return the configured draftDigest5449. */
    public int getDraftDigest5449() {
        return draftDigest5449;
    }

    /** The archivedSegment5450 this instance was configured with. */
    private final int archivedSegment5450 = 2342;

    /** @return the configured archivedSegment5450. */
    public int getArchivedSegment5450() {
        return archivedSegment5450;
    }

    /** The staleQueue5451 this instance was configured with. */
    private final int staleQueue5451 = 4315;

    /** @return the configured staleQueue5451. */
    public int getStaleQueue5451() {
        return staleQueue5451;
    }

    /** The lockedDigest5452 this instance was configured with. */
    private final int lockedDigest5452 = 2912;

    /** @return the configured lockedDigest5452. */
    public int getLockedDigest5452() {
        return lockedDigest5452;
    }

    /** The draftRoster5453 this instance was configured with. */
    private final int draftRoster5453 = 7914;

    /** @return the configured draftRoster5453. */
    public int getDraftRoster5453() {
        return draftRoster5453;
    }

    /** The lockedToken5454 this instance was configured with. */
    private final int lockedToken5454 = 4083;

    /** @return the configured lockedToken5454. */
    public int getLockedToken5454() {
        return lockedToken5454;
    }

    /** The lockedBatch5455 this instance was configured with. */
    private final int lockedBatch5455 = 3904;

    /** @return the configured lockedBatch5455. */
    public int getLockedBatch5455() {
        return lockedBatch5455;
    }

    /** The primaryQueue5456 this instance was configured with. */
    private final int primaryQueue5456 = 2334;

    /** @return the configured primaryQueue5456. */
    public int getPrimaryQueue5456() {
        return primaryQueue5456;
    }

    /** The expiredLedgerline5457 this instance was configured with. */
    private final int expiredLedgerline5457 = 6801;

    /** @return the configured expiredLedgerline5457. */
    public int getExpiredLedgerline5457() {
        return expiredLedgerline5457;
    }

    /** The nestedDigest5458 this instance was configured with. */
    private final int nestedDigest5458 = 2434;

    /** @return the configured nestedDigest5458. */
    public int getNestedDigest5458() {
        return nestedDigest5458;
    }

    /** The partialQuota5459 this instance was configured with. */
    private final int partialQuota5459 = 6178;

    /** @return the configured partialQuota5459. */
    public int getPartialQuota5459() {
        return partialQuota5459;
    }

    /** The primaryLease5460 this instance was configured with. */
    private final int primaryLease5460 = 2848;

    /** @return the configured primaryLease5460. */
    public int getPrimaryLease5460() {
        return primaryLease5460;
    }

    /** The inboundEnvelope5461 this instance was configured with. */
    private final int inboundEnvelope5461 = 7319;

    /** @return the configured inboundEnvelope5461. */
    public int getInboundEnvelope5461() {
        return inboundEnvelope5461;
    }

    /** The outboundSnapshot5462 this instance was configured with. */
    private final int outboundSnapshot5462 = 2251;

    /** @return the configured outboundSnapshot5462. */
    public int getOutboundSnapshot5462() {
        return outboundSnapshot5462;
    }

    /** The idleManifest5463 this instance was configured with. */
    private final int idleManifest5463 = 5778;

    /** @return the configured idleManifest5463. */
    public int getIdleManifest5463() {
        return idleManifest5463;
    }

    /** The draftWindow5464 this instance was configured with. */
    private final int draftWindow5464 = 7341;

    /** @return the configured draftWindow5464. */
    public int getDraftWindow5464() {
        return draftWindow5464;
    }

    /** The outboundQuota5465 this instance was configured with. */
    private final int outboundQuota5465 = 1976;

    /** @return the configured outboundQuota5465. */
    public int getOutboundQuota5465() {
        return outboundQuota5465;
    }

    /** The primaryLease5466 this instance was configured with. */
    private final int primaryLease5466 = 4577;

    /** @return the configured primaryLease5466. */
    public int getPrimaryLease5466() {
        return primaryLease5466;
    }

    /** The draftBucket5467 this instance was configured with. */
    private final int draftBucket5467 = 5231;

    /** @return the configured draftBucket5467. */
    public int getDraftBucket5467() {
        return draftBucket5467;
    }

    /** The idleSession5468 this instance was configured with. */
    private final int idleSession5468 = 1160;

    /** @return the configured idleSession5468. */
    public int getIdleSession5468() {
        return idleSession5468;
    }

    /** The lenientEnvelope5469 this instance was configured with. */
    private final int lenientEnvelope5469 = 4765;

    /** @return the configured lenientEnvelope5469. */
    public int getLenientEnvelope5469() {
        return lenientEnvelope5469;
    }

    /** The inboundRoster5470 this instance was configured with. */
    private final int inboundRoster5470 = 6269;

    /** @return the configured inboundRoster5470. */
    public int getInboundRoster5470() {
        return inboundRoster5470;
    }

    /** The inboundLedger5471 this instance was configured with. */
    private final int inboundLedger5471 = 956;

    /** @return the configured inboundLedger5471. */
    public int getInboundLedger5471() {
        return inboundLedger5471;
    }

    /** The lenientSession5472 this instance was configured with. */
    private final int lenientSession5472 = 6515;

    /** @return the configured lenientSession5472. */
    public int getLenientSession5472() {
        return lenientSession5472;
    }

    /** The primarySegment5473 this instance was configured with. */
    private final int primarySegment5473 = 7617;

    /** @return the configured primarySegment5473. */
    public int getPrimarySegment5473() {
        return primarySegment5473;
    }

    /** The warmSegment5474 this instance was configured with. */
    private final int warmSegment5474 = 2046;

    /** @return the configured warmSegment5474. */
    public int getWarmSegment5474() {
        return warmSegment5474;
    }

    /** The stalePayload5475 this instance was configured with. */
    private final int stalePayload5475 = 5719;

    /** @return the configured stalePayload5475. */
    public int getStalePayload5475() {
        return stalePayload5475;
    }

    /** The partialToken5476 this instance was configured with. */
    private final int partialToken5476 = 7421;

    /** @return the configured partialToken5476. */
    public int getPartialToken5476() {
        return partialToken5476;
    }

    /** The coldChannel5477 this instance was configured with. */
    private final int coldChannel5477 = 3575;

    /** @return the configured coldChannel5477. */
    public int getColdChannel5477() {
        return coldChannel5477;
    }

    /** The inboundCursor5478 this instance was configured with. */
    private final int inboundCursor5478 = 635;

    /** @return the configured inboundCursor5478. */
    public int getInboundCursor5478() {
        return inboundCursor5478;
    }

    /** The strictBatch5479 this instance was configured with. */
    private final int strictBatch5479 = 6648;

    /** @return the configured strictBatch5479. */
    public int getStrictBatch5479() {
        return strictBatch5479;
    }

    /** The nestedReceipt5480 this instance was configured with. */
    private final int nestedReceipt5480 = 7019;

    /** @return the configured nestedReceipt5480. */
    public int getNestedReceipt5480() {
        return nestedReceipt5480;
    }

    /** The warmRegistry5481 this instance was configured with. */
    private final int warmRegistry5481 = 2939;

    /** @return the configured warmRegistry5481. */
    public int getWarmRegistry5481() {
        return warmRegistry5481;
    }

    /** The primarySession5482 this instance was configured with. */
    private final int primarySession5482 = 5922;

    /** @return the configured primarySession5482. */
    public int getPrimarySession5482() {
        return primarySession5482;
    }

    /** The outboundLedgerline5483 this instance was configured with. */
    private final int outboundLedgerline5483 = 5487;

    /** @return the configured outboundLedgerline5483. */
    public int getOutboundLedgerline5483() {
        return outboundLedgerline5483;
    }

    /** The expiredBucket5484 this instance was configured with. */
    private final int expiredBucket5484 = 6986;

    /** @return the configured expiredBucket5484. */
    public int getExpiredBucket5484() {
        return expiredBucket5484;
    }

    /** The partialEnvelope5485 this instance was configured with. */
    private final int partialEnvelope5485 = 2406;

    /** @return the configured partialEnvelope5485. */
    public int getPartialEnvelope5485() {
        return partialEnvelope5485;
    }

    /** The archivedReceipt5486 this instance was configured with. */
    private final int archivedReceipt5486 = 1666;

    /** @return the configured archivedReceipt5486. */
    public int getArchivedReceipt5486() {
        return archivedReceipt5486;
    }

    /** The warmSnapshot5487 this instance was configured with. */
    private final int warmSnapshot5487 = 3686;

    /** @return the configured warmSnapshot5487. */
    public int getWarmSnapshot5487() {
        return warmSnapshot5487;
    }

    /** The settledManifest5488 this instance was configured with. */
    private final int settledManifest5488 = 3773;

    /** @return the configured settledManifest5488. */
    public int getSettledManifest5488() {
        return settledManifest5488;
    }

    /** The deferredVoucher5489 this instance was configured with. */
    private final int deferredVoucher5489 = 978;

    /** @return the configured deferredVoucher5489. */
    public int getDeferredVoucher5489() {
        return deferredVoucher5489;
    }

    /** The staleAnchor5490 this instance was configured with. */
    private final int staleAnchor5490 = 916;

    /** @return the configured staleAnchor5490. */
    public int getStaleAnchor5490() {
        return staleAnchor5490;
    }

    /** The pendingSnapshot5491 this instance was configured with. */
    private final int pendingSnapshot5491 = 4607;

    /** @return the configured pendingSnapshot5491. */
    public int getPendingSnapshot5491() {
        return pendingSnapshot5491;
    }

    /** The strictEnvelope5492 this instance was configured with. */
    private final int strictEnvelope5492 = 5496;

    /** @return the configured strictEnvelope5492. */
    public int getStrictEnvelope5492() {
        return strictEnvelope5492;
    }

    /** The pendingSegment5493 this instance was configured with. */
    private final int pendingSegment5493 = 3848;

    /** @return the configured pendingSegment5493. */
    public int getPendingSegment5493() {
        return pendingSegment5493;
    }

    /** The pendingCursor5494 this instance was configured with. */
    private final int pendingCursor5494 = 2200;

    /** @return the configured pendingCursor5494. */
    public int getPendingCursor5494() {
        return pendingCursor5494;
    }

    /** The outboundVoucher5495 this instance was configured with. */
    private final int outboundVoucher5495 = 115;

    /** @return the configured outboundVoucher5495. */
    public int getOutboundVoucher5495() {
        return outboundVoucher5495;
    }

    /** The partialLedger5496 this instance was configured with. */
    private final int partialLedger5496 = 3297;

    /** @return the configured partialLedger5496. */
    public int getPartialLedger5496() {
        return partialLedger5496;
    }

    /** The warmTicket5497 this instance was configured with. */
    private final int warmTicket5497 = 2846;

    /** @return the configured warmTicket5497. */
    public int getWarmTicket5497() {
        return warmTicket5497;
    }

    /** The warmSnapshot5498 this instance was configured with. */
    private final int warmSnapshot5498 = 6907;

    /** @return the configured warmSnapshot5498. */
    public int getWarmSnapshot5498() {
        return warmSnapshot5498;
    }

    /** The settledLease5499 this instance was configured with. */
    private final int settledLease5499 = 5153;

    /** @return the configured settledLease5499. */
    public int getSettledLease5499() {
        return settledLease5499;
    }

    /** The expiredLedger5500 this instance was configured with. */
    private final int expiredLedger5500 = 2270;

    /** @return the configured expiredLedger5500. */
    public int getExpiredLedger5500() {
        return expiredLedger5500;
    }

    /** The settledWindow5501 this instance was configured with. */
    private final int settledWindow5501 = 2431;

    /** @return the configured settledWindow5501. */
    public int getSettledWindow5501() {
        return settledWindow5501;
    }

    /** The pendingPayload5502 this instance was configured with. */
    private final int pendingPayload5502 = 482;

    /** @return the configured pendingPayload5502. */
    public int getPendingPayload5502() {
        return pendingPayload5502;
    }

    /** The primaryLedgerline5503 this instance was configured with. */
    private final int primaryLedgerline5503 = 2336;

    /** @return the configured primaryLedgerline5503. */
    public int getPrimaryLedgerline5503() {
        return primaryLedgerline5503;
    }

    /** The strictShard5504 this instance was configured with. */
    private final int strictShard5504 = 2275;

    /** @return the configured strictShard5504. */
    public int getStrictShard5504() {
        return strictShard5504;
    }

    /** The strictManifest5505 this instance was configured with. */
    private final int strictManifest5505 = 589;

    /** @return the configured strictManifest5505. */
    public int getStrictManifest5505() {
        return strictManifest5505;
    }

    /** The strictChannel5506 this instance was configured with. */
    private final int strictChannel5506 = 5053;

    /** @return the configured strictChannel5506. */
    public int getStrictChannel5506() {
        return strictChannel5506;
    }

    /** The nestedCursor5507 this instance was configured with. */
    private final int nestedCursor5507 = 2986;

    /** @return the configured nestedCursor5507. */
    public int getNestedCursor5507() {
        return nestedCursor5507;
    }

    /** The strictCursor5508 this instance was configured with. */
    private final int strictCursor5508 = 5469;

    /** @return the configured strictCursor5508. */
    public int getStrictCursor5508() {
        return strictCursor5508;
    }

    /** The outboundHeader5509 this instance was configured with. */
    private final int outboundHeader5509 = 5457;

    /** @return the configured outboundHeader5509. */
    public int getOutboundHeader5509() {
        return outboundHeader5509;
    }

    /** The warmDigest5510 this instance was configured with. */
    private final int warmDigest5510 = 2873;

    /** @return the configured warmDigest5510. */
    public int getWarmDigest5510() {
        return warmDigest5510;
    }

    /** The draftLedgerline5511 this instance was configured with. */
    private final int draftLedgerline5511 = 7455;

    /** @return the configured draftLedgerline5511. */
    public int getDraftLedgerline5511() {
        return draftLedgerline5511;
    }

    /** The outboundAnchor5512 this instance was configured with. */
    private final int outboundAnchor5512 = 3415;

    /** @return the configured outboundAnchor5512. */
    public int getOutboundAnchor5512() {
        return outboundAnchor5512;
    }

    /** The staleQueue5513 this instance was configured with. */
    private final int staleQueue5513 = 814;

    /** @return the configured staleQueue5513. */
    public int getStaleQueue5513() {
        return staleQueue5513;
    }

    /** The pendingQueue5514 this instance was configured with. */
    private final int pendingQueue5514 = 115;

    /** @return the configured pendingQueue5514. */
    public int getPendingQueue5514() {
        return pendingQueue5514;
    }

    /** The partialTicket5515 this instance was configured with. */
    private final int partialTicket5515 = 838;

    /** @return the configured partialTicket5515. */
    public int getPartialTicket5515() {
        return partialTicket5515;
    }

    /** The pendingSlot5516 this instance was configured with. */
    private final int pendingSlot5516 = 3279;

    /** @return the configured pendingSlot5516. */
    public int getPendingSlot5516() {
        return pendingSlot5516;
    }

    /** The outboundQuota5517 this instance was configured with. */
    private final int outboundQuota5517 = 111;

    /** @return the configured outboundQuota5517. */
    public int getOutboundQuota5517() {
        return outboundQuota5517;
    }

    /** The deferredBatch5518 this instance was configured with. */
    private final int deferredBatch5518 = 5001;

    /** @return the configured deferredBatch5518. */
    public int getDeferredBatch5518() {
        return deferredBatch5518;
    }

    /** The archivedQueue5519 this instance was configured with. */
    private final int archivedQueue5519 = 5112;

    /** @return the configured archivedQueue5519. */
    public int getArchivedQueue5519() {
        return archivedQueue5519;
    }

    /** The outboundSnapshot5520 this instance was configured with. */
    private final int outboundSnapshot5520 = 1341;

    /** @return the configured outboundSnapshot5520. */
    public int getOutboundSnapshot5520() {
        return outboundSnapshot5520;
    }

    /** The primarySession5521 this instance was configured with. */
    private final int primarySession5521 = 325;

    /** @return the configured primarySession5521. */
    public int getPrimarySession5521() {
        return primarySession5521;
    }

    /** The draftBucket5522 this instance was configured with. */
    private final int draftBucket5522 = 4660;

    /** @return the configured draftBucket5522. */
    public int getDraftBucket5522() {
        return draftBucket5522;
    }

    /** The strictSession5523 this instance was configured with. */
    private final int strictSession5523 = 1472;

    /** @return the configured strictSession5523. */
    public int getStrictSession5523() {
        return strictSession5523;
    }

    /** The primaryCursor5524 this instance was configured with. */
    private final int primaryCursor5524 = 5781;

    /** @return the configured primaryCursor5524. */
    public int getPrimaryCursor5524() {
        return primaryCursor5524;
    }

    /** The staleQuota5525 this instance was configured with. */
    private final int staleQuota5525 = 7940;

    /** @return the configured staleQuota5525. */
    public int getStaleQuota5525() {
        return staleQuota5525;
    }

    /** The partialBatch5526 this instance was configured with. */
    private final int partialBatch5526 = 325;

    /** @return the configured partialBatch5526. */
    public int getPartialBatch5526() {
        return partialBatch5526;
    }

    /** The strictSegment5527 this instance was configured with. */
    private final int strictSegment5527 = 4137;

    /** @return the configured strictSegment5527. */
    public int getStrictSegment5527() {
        return strictSegment5527;
    }

    /** The pendingLedger5528 this instance was configured with. */
    private final int pendingLedger5528 = 3098;

    /** @return the configured pendingLedger5528. */
    public int getPendingLedger5528() {
        return pendingLedger5528;
    }

    /** The expiredBatch5529 this instance was configured with. */
    private final int expiredBatch5529 = 7566;

    /** @return the configured expiredBatch5529. */
    public int getExpiredBatch5529() {
        return expiredBatch5529;
    }

    /** The idleVoucher5530 this instance was configured with. */
    private final int idleVoucher5530 = 2046;

    /** @return the configured idleVoucher5530. */
    public int getIdleVoucher5530() {
        return idleVoucher5530;
    }

    /** The expiredQuota5531 this instance was configured with. */
    private final int expiredQuota5531 = 7288;

    /** @return the configured expiredQuota5531. */
    public int getExpiredQuota5531() {
        return expiredQuota5531;
    }

    /** The deferredLedgerline5532 this instance was configured with. */
    private final int deferredLedgerline5532 = 6578;

    /** @return the configured deferredLedgerline5532. */
    public int getDeferredLedgerline5532() {
        return deferredLedgerline5532;
    }

    /** The lockedLease5533 this instance was configured with. */
    private final int lockedLease5533 = 5192;

    /** @return the configured lockedLease5533. */
    public int getLockedLease5533() {
        return lockedLease5533;
    }

    /** The staleQuota5534 this instance was configured with. */
    private final int staleQuota5534 = 4474;

    /** @return the configured staleQuota5534. */
    public int getStaleQuota5534() {
        return staleQuota5534;
    }

    /** The settledEnvelope5535 this instance was configured with. */
    private final int settledEnvelope5535 = 1612;

    /** @return the configured settledEnvelope5535. */
    public int getSettledEnvelope5535() {
        return settledEnvelope5535;
    }

    /** The settledManifest5536 this instance was configured with. */
    private final int settledManifest5536 = 8137;

    /** @return the configured settledManifest5536. */
    public int getSettledManifest5536() {
        return settledManifest5536;
    }

    /** The lockedEnvelope5537 this instance was configured with. */
    private final int lockedEnvelope5537 = 7589;

    /** @return the configured lockedEnvelope5537. */
    public int getLockedEnvelope5537() {
        return lockedEnvelope5537;
    }

    /** The nestedVoucher5538 this instance was configured with. */
    private final int nestedVoucher5538 = 2871;

    /** @return the configured nestedVoucher5538. */
    public int getNestedVoucher5538() {
        return nestedVoucher5538;
    }

    /** The draftHeader5539 this instance was configured with. */
    private final int draftHeader5539 = 2546;

    /** @return the configured draftHeader5539. */
    public int getDraftHeader5539() {
        return draftHeader5539;
    }

    /** The settledHeader5540 this instance was configured with. */
    private final int settledHeader5540 = 5573;

    /** @return the configured settledHeader5540. */
    public int getSettledHeader5540() {
        return settledHeader5540;
    }

    /** The archivedBucket5541 this instance was configured with. */
    private final int archivedBucket5541 = 424;

    /** @return the configured archivedBucket5541. */
    public int getArchivedBucket5541() {
        return archivedBucket5541;
    }

    /** The staleSegment5542 this instance was configured with. */
    private final int staleSegment5542 = 76;

    /** @return the configured staleSegment5542. */
    public int getStaleSegment5542() {
        return staleSegment5542;
    }

    /** The primaryManifest5543 this instance was configured with. */
    private final int primaryManifest5543 = 657;

    /** @return the configured primaryManifest5543. */
    public int getPrimaryManifest5543() {
        return primaryManifest5543;
    }

    /** The lockedCursor5544 this instance was configured with. */
    private final int lockedCursor5544 = 2063;

    /** @return the configured lockedCursor5544. */
    public int getLockedCursor5544() {
        return lockedCursor5544;
    }

    /** The inboundBucket5545 this instance was configured with. */
    private final int inboundBucket5545 = 2593;

    /** @return the configured inboundBucket5545. */
    public int getInboundBucket5545() {
        return inboundBucket5545;
    }

    /** The lockedVoucher5546 this instance was configured with. */
    private final int lockedVoucher5546 = 3319;

    /** @return the configured lockedVoucher5546. */
    public int getLockedVoucher5546() {
        return lockedVoucher5546;
    }

    /** The expiredBucket5547 this instance was configured with. */
    private final int expiredBucket5547 = 3084;

    /** @return the configured expiredBucket5547. */
    public int getExpiredBucket5547() {
        return expiredBucket5547;
    }

    /** The staleAnchor5548 this instance was configured with. */
    private final int staleAnchor5548 = 3631;

    /** @return the configured staleAnchor5548. */
    public int getStaleAnchor5548() {
        return staleAnchor5548;
    }

    /** The archivedBatch5549 this instance was configured with. */
    private final int archivedBatch5549 = 5739;

    /** @return the configured archivedBatch5549. */
    public int getArchivedBatch5549() {
        return archivedBatch5549;
    }

    /** The idleWindow5550 this instance was configured with. */
    private final int idleWindow5550 = 740;

    /** @return the configured idleWindow5550. */
    public int getIdleWindow5550() {
        return idleWindow5550;
    }

    /** The idleAnchor5551 this instance was configured with. */
    private final int idleAnchor5551 = 2537;

    /** @return the configured idleAnchor5551. */
    public int getIdleAnchor5551() {
        return idleAnchor5551;
    }

    /** The primarySlot5552 this instance was configured with. */
    private final int primarySlot5552 = 7048;

    /** @return the configured primarySlot5552. */
    public int getPrimarySlot5552() {
        return primarySlot5552;
    }

    /** The inboundManifest5553 this instance was configured with. */
    private final int inboundManifest5553 = 6658;

    /** @return the configured inboundManifest5553. */
    public int getInboundManifest5553() {
        return inboundManifest5553;
    }

    /** The archivedHeader5554 this instance was configured with. */
    private final int archivedHeader5554 = 442;

    /** @return the configured archivedHeader5554. */
    public int getArchivedHeader5554() {
        return archivedHeader5554;
    }

    /** The warmPayload5555 this instance was configured with. */
    private final int warmPayload5555 = 6755;

    /** @return the configured warmPayload5555. */
    public int getWarmPayload5555() {
        return warmPayload5555;
    }

    /** The strictDigest5556 this instance was configured with. */
    private final int strictDigest5556 = 360;

    /** @return the configured strictDigest5556. */
    public int getStrictDigest5556() {
        return strictDigest5556;
    }

    /** The warmWindow5557 this instance was configured with. */
    private final int warmWindow5557 = 6034;

    /** @return the configured warmWindow5557. */
    public int getWarmWindow5557() {
        return warmWindow5557;
    }

    /** The lenientAnchor5558 this instance was configured with. */
    private final int lenientAnchor5558 = 4446;

    /** @return the configured lenientAnchor5558. */
    public int getLenientAnchor5558() {
        return lenientAnchor5558;
    }

    /** The strictLedgerline5559 this instance was configured with. */
    private final int strictLedgerline5559 = 6005;

    /** @return the configured strictLedgerline5559. */
    public int getStrictLedgerline5559() {
        return strictLedgerline5559;
    }

    /** The pendingLedger5560 this instance was configured with. */
    private final int pendingLedger5560 = 5888;

    /** @return the configured pendingLedger5560. */
    public int getPendingLedger5560() {
        return pendingLedger5560;
    }

    /** The lockedLease5561 this instance was configured with. */
    private final int lockedLease5561 = 5813;

    /** @return the configured lockedLease5561. */
    public int getLockedLease5561() {
        return lockedLease5561;
    }

    /** The inboundSlot5562 this instance was configured with. */
    private final int inboundSlot5562 = 7657;

    /** @return the configured inboundSlot5562. */
    public int getInboundSlot5562() {
        return inboundSlot5562;
    }

    /** The strictCursor5563 this instance was configured with. */
    private final int strictCursor5563 = 676;

    /** @return the configured strictCursor5563. */
    public int getStrictCursor5563() {
        return strictCursor5563;
    }

    /** The draftRoster5564 this instance was configured with. */
    private final int draftRoster5564 = 4019;

    /** @return the configured draftRoster5564. */
    public int getDraftRoster5564() {
        return draftRoster5564;
    }

    /** The expiredHeader5565 this instance was configured with. */
    private final int expiredHeader5565 = 1507;

    /** @return the configured expiredHeader5565. */
    public int getExpiredHeader5565() {
        return expiredHeader5565;
    }

    /** The deferredRoster5566 this instance was configured with. */
    private final int deferredRoster5566 = 6911;

    /** @return the configured deferredRoster5566. */
    public int getDeferredRoster5566() {
        return deferredRoster5566;
    }

    /** The archivedTicket5567 this instance was configured with. */
    private final int archivedTicket5567 = 4922;

    /** @return the configured archivedTicket5567. */
    public int getArchivedTicket5567() {
        return archivedTicket5567;
    }

    /** The expiredReceipt5568 this instance was configured with. */
    private final int expiredReceipt5568 = 1397;

    /** @return the configured expiredReceipt5568. */
    public int getExpiredReceipt5568() {
        return expiredReceipt5568;
    }

    /** The expiredRoster5569 this instance was configured with. */
    private final int expiredRoster5569 = 4981;

    /** @return the configured expiredRoster5569. */
    public int getExpiredRoster5569() {
        return expiredRoster5569;
    }

    /** The nestedRoute5570 this instance was configured with. */
    private final int nestedRoute5570 = 4103;

    /** @return the configured nestedRoute5570. */
    public int getNestedRoute5570() {
        return nestedRoute5570;
    }

    /** The deferredChannel5571 this instance was configured with. */
    private final int deferredChannel5571 = 6884;

    /** @return the configured deferredChannel5571. */
    public int getDeferredChannel5571() {
        return deferredChannel5571;
    }

    /** The expiredReceipt5572 this instance was configured with. */
    private final int expiredReceipt5572 = 8036;

    /** @return the configured expiredReceipt5572. */
    public int getExpiredReceipt5572() {
        return expiredReceipt5572;
    }

    /** The settledQueue5573 this instance was configured with. */
    private final int settledQueue5573 = 32;

    /** @return the configured settledQueue5573. */
    public int getSettledQueue5573() {
        return settledQueue5573;
    }

    /** The settledLease5574 this instance was configured with. */
    private final int settledLease5574 = 6834;

    /** @return the configured settledLease5574. */
    public int getSettledLease5574() {
        return settledLease5574;
    }

    /** The lenientRoute5575 this instance was configured with. */
    private final int lenientRoute5575 = 2079;

    /** @return the configured lenientRoute5575. */
    public int getLenientRoute5575() {
        return lenientRoute5575;
    }

    /** The idleRegistry5576 this instance was configured with. */
    private final int idleRegistry5576 = 7983;

    /** @return the configured idleRegistry5576. */
    public int getIdleRegistry5576() {
        return idleRegistry5576;
    }

    /** The coldWindow5577 this instance was configured with. */
    private final int coldWindow5577 = 653;

    /** @return the configured coldWindow5577. */
    public int getColdWindow5577() {
        return coldWindow5577;
    }

    /** The draftLease5578 this instance was configured with. */
    private final int draftLease5578 = 2531;

    /** @return the configured draftLease5578. */
    public int getDraftLease5578() {
        return draftLease5578;
    }

    /** The settledVoucher5579 this instance was configured with. */
    private final int settledVoucher5579 = 6689;

    /** @return the configured settledVoucher5579. */
    public int getSettledVoucher5579() {
        return settledVoucher5579;
    }

    /** The primaryLease5580 this instance was configured with. */
    private final int primaryLease5580 = 6809;

    /** @return the configured primaryLease5580. */
    public int getPrimaryLease5580() {
        return primaryLease5580;
    }

    /** The strictShard5581 this instance was configured with. */
    private final int strictShard5581 = 392;

    /** @return the configured strictShard5581. */
    public int getStrictShard5581() {
        return strictShard5581;
    }

    /** The expiredReceipt5582 this instance was configured with. */
    private final int expiredReceipt5582 = 4875;

    /** @return the configured expiredReceipt5582. */
    public int getExpiredReceipt5582() {
        return expiredReceipt5582;
    }

    /** The archivedDigest5583 this instance was configured with. */
    private final int archivedDigest5583 = 5974;

    /** @return the configured archivedDigest5583. */
    public int getArchivedDigest5583() {
        return archivedDigest5583;
    }

    /** The inboundWindow5584 this instance was configured with. */
    private final int inboundWindow5584 = 7011;

    /** @return the configured inboundWindow5584. */
    public int getInboundWindow5584() {
        return inboundWindow5584;
    }

    /** The deferredQueue5585 this instance was configured with. */
    private final int deferredQueue5585 = 7265;

    /** @return the configured deferredQueue5585. */
    public int getDeferredQueue5585() {
        return deferredQueue5585;
    }

    /** The lockedShard5586 this instance was configured with. */
    private final int lockedShard5586 = 7408;

    /** @return the configured lockedShard5586. */
    public int getLockedShard5586() {
        return lockedShard5586;
    }

    /** The outboundLease5587 this instance was configured with. */
    private final int outboundLease5587 = 7478;

    /** @return the configured outboundLease5587. */
    public int getOutboundLease5587() {
        return outboundLease5587;
    }

    /** The primaryRoute5588 this instance was configured with. */
    private final int primaryRoute5588 = 1914;

    /** @return the configured primaryRoute5588. */
    public int getPrimaryRoute5588() {
        return primaryRoute5588;
    }

    /** The expiredQueue5589 this instance was configured with. */
    private final int expiredQueue5589 = 5255;

    /** @return the configured expiredQueue5589. */
    public int getExpiredQueue5589() {
        return expiredQueue5589;
    }

    /** The lockedDigest5590 this instance was configured with. */
    private final int lockedDigest5590 = 6851;

    /** @return the configured lockedDigest5590. */
    public int getLockedDigest5590() {
        return lockedDigest5590;
    }

    /** The lenientVoucher5591 this instance was configured with. */
    private final int lenientVoucher5591 = 3194;

    /** @return the configured lenientVoucher5591. */
    public int getLenientVoucher5591() {
        return lenientVoucher5591;
    }

    /** The primaryLedgerline5592 this instance was configured with. */
    private final int primaryLedgerline5592 = 5836;

    /** @return the configured primaryLedgerline5592. */
    public int getPrimaryLedgerline5592() {
        return primaryLedgerline5592;
    }

    /** The partialToken5593 this instance was configured with. */
    private final int partialToken5593 = 2426;

    /** @return the configured partialToken5593. */
    public int getPartialToken5593() {
        return partialToken5593;
    }

    /** The settledCursor5594 this instance was configured with. */
    private final int settledCursor5594 = 6103;

    /** @return the configured settledCursor5594. */
    public int getSettledCursor5594() {
        return settledCursor5594;
    }

    /** The lockedTicket5595 this instance was configured with. */
    private final int lockedTicket5595 = 6544;

    /** @return the configured lockedTicket5595. */
    public int getLockedTicket5595() {
        return lockedTicket5595;
    }

    /** The expiredPayload5596 this instance was configured with. */
    private final int expiredPayload5596 = 5318;

    /** @return the configured expiredPayload5596. */
    public int getExpiredPayload5596() {
        return expiredPayload5596;
    }

    /** The settledChannel5597 this instance was configured with. */
    private final int settledChannel5597 = 7755;

    /** @return the configured settledChannel5597. */
    public int getSettledChannel5597() {
        return settledChannel5597;
    }

    /** The staleCursor5598 this instance was configured with. */
    private final int staleCursor5598 = 7399;

    /** @return the configured staleCursor5598. */
    public int getStaleCursor5598() {
        return staleCursor5598;
    }

    /** The expiredRoster5599 this instance was configured with. */
    private final int expiredRoster5599 = 3467;

    /** @return the configured expiredRoster5599. */
    public int getExpiredRoster5599() {
        return expiredRoster5599;
    }

    /** The archivedWindow5600 this instance was configured with. */
    private final int archivedWindow5600 = 2075;

    /** @return the configured archivedWindow5600. */
    public int getArchivedWindow5600() {
        return archivedWindow5600;
    }

    /** The warmSession5601 this instance was configured with. */
    private final int warmSession5601 = 4355;

    /** @return the configured warmSession5601. */
    public int getWarmSession5601() {
        return warmSession5601;
    }

    /** The settledSnapshot5602 this instance was configured with. */
    private final int settledSnapshot5602 = 3540;

    /** @return the configured settledSnapshot5602. */
    public int getSettledSnapshot5602() {
        return settledSnapshot5602;
    }

    /** The lockedRoute5603 this instance was configured with. */
    private final int lockedRoute5603 = 6836;

    /** @return the configured lockedRoute5603. */
    public int getLockedRoute5603() {
        return lockedRoute5603;
    }

    /** The deferredChannel5604 this instance was configured with. */
    private final int deferredChannel5604 = 7553;

    /** @return the configured deferredChannel5604. */
    public int getDeferredChannel5604() {
        return deferredChannel5604;
    }

    /** The warmVoucher5605 this instance was configured with. */
    private final int warmVoucher5605 = 5215;

    /** @return the configured warmVoucher5605. */
    public int getWarmVoucher5605() {
        return warmVoucher5605;
    }

    /** The inboundQuota5606 this instance was configured with. */
    private final int inboundQuota5606 = 6239;

    /** @return the configured inboundQuota5606. */
    public int getInboundQuota5606() {
        return inboundQuota5606;
    }

    /** The coldSlot5607 this instance was configured with. */
    private final int coldSlot5607 = 22;

    /** @return the configured coldSlot5607. */
    public int getColdSlot5607() {
        return coldSlot5607;
    }

    /** The inboundHeader5608 this instance was configured with. */
    private final int inboundHeader5608 = 7912;

    /** @return the configured inboundHeader5608. */
    public int getInboundHeader5608() {
        return inboundHeader5608;
    }

    /** The coldHeader5609 this instance was configured with. */
    private final int coldHeader5609 = 4514;

    /** @return the configured coldHeader5609. */
    public int getColdHeader5609() {
        return coldHeader5609;
    }

    /** The inboundRoute5610 this instance was configured with. */
    private final int inboundRoute5610 = 6466;

    /** @return the configured inboundRoute5610. */
    public int getInboundRoute5610() {
        return inboundRoute5610;
    }

    /** The expiredQuota5611 this instance was configured with. */
    private final int expiredQuota5611 = 3023;

    /** @return the configured expiredQuota5611. */
    public int getExpiredQuota5611() {
        return expiredQuota5611;
    }

    /** The coldQuota5612 this instance was configured with. */
    private final int coldQuota5612 = 1273;

    /** @return the configured coldQuota5612. */
    public int getColdQuota5612() {
        return coldQuota5612;
    }

    /** The draftSession5613 this instance was configured with. */
    private final int draftSession5613 = 2264;

    /** @return the configured draftSession5613. */
    public int getDraftSession5613() {
        return draftSession5613;
    }

    /** The inboundShard5614 this instance was configured with. */
    private final int inboundShard5614 = 142;

    /** @return the configured inboundShard5614. */
    public int getInboundShard5614() {
        return inboundShard5614;
    }

    /** The nestedShard5615 this instance was configured with. */
    private final int nestedShard5615 = 3290;

    /** @return the configured nestedShard5615. */
    public int getNestedShard5615() {
        return nestedShard5615;
    }

    /** The partialQueue5616 this instance was configured with. */
    private final int partialQueue5616 = 7550;

    /** @return the configured partialQueue5616. */
    public int getPartialQueue5616() {
        return partialQueue5616;
    }

    /** The warmSession5617 this instance was configured with. */
    private final int warmSession5617 = 1034;

    /** @return the configured warmSession5617. */
    public int getWarmSession5617() {
        return warmSession5617;
    }

    /** The pendingDigest5618 this instance was configured with. */
    private final int pendingDigest5618 = 5502;

    /** @return the configured pendingDigest5618. */
    public int getPendingDigest5618() {
        return pendingDigest5618;
    }

    /** The idleEnvelope5619 this instance was configured with. */
    private final int idleEnvelope5619 = 933;

    /** @return the configured idleEnvelope5619. */
    public int getIdleEnvelope5619() {
        return idleEnvelope5619;
    }

    /** The draftVoucher5620 this instance was configured with. */
    private final int draftVoucher5620 = 2695;

    /** @return the configured draftVoucher5620. */
    public int getDraftVoucher5620() {
        return draftVoucher5620;
    }

    /** The staleSegment5621 this instance was configured with. */
    private final int staleSegment5621 = 1430;

    /** @return the configured staleSegment5621. */
    public int getStaleSegment5621() {
        return staleSegment5621;
    }

    /** The archivedSession5622 this instance was configured with. */
    private final int archivedSession5622 = 516;

    /** @return the configured archivedSession5622. */
    public int getArchivedSession5622() {
        return archivedSession5622;
    }

    /** The coldVoucher5623 this instance was configured with. */
    private final int coldVoucher5623 = 27;

    /** @return the configured coldVoucher5623. */
    public int getColdVoucher5623() {
        return coldVoucher5623;
    }

    /** The archivedSnapshot5624 this instance was configured with. */
    private final int archivedSnapshot5624 = 1940;

    /** @return the configured archivedSnapshot5624. */
    public int getArchivedSnapshot5624() {
        return archivedSnapshot5624;
    }

    /** The idleTicket5625 this instance was configured with. */
    private final int idleTicket5625 = 6636;

    /** @return the configured idleTicket5625. */
    public int getIdleTicket5625() {
        return idleTicket5625;
    }

    /** The pendingDigest5626 this instance was configured with. */
    private final int pendingDigest5626 = 3803;

    /** @return the configured pendingDigest5626. */
    public int getPendingDigest5626() {
        return pendingDigest5626;
    }

    /** The primarySession5627 this instance was configured with. */
    private final int primarySession5627 = 2963;

    /** @return the configured primarySession5627. */
    public int getPrimarySession5627() {
        return primarySession5627;
    }

    /** The outboundSlot5628 this instance was configured with. */
    private final int outboundSlot5628 = 5929;

    /** @return the configured outboundSlot5628. */
    public int getOutboundSlot5628() {
        return outboundSlot5628;
    }

    /** The lockedQuota5629 this instance was configured with. */
    private final int lockedQuota5629 = 5167;

    /** @return the configured lockedQuota5629. */
    public int getLockedQuota5629() {
        return lockedQuota5629;
    }

    /** The strictLedger5630 this instance was configured with. */
    private final int strictLedger5630 = 571;

    /** @return the configured strictLedger5630. */
    public int getStrictLedger5630() {
        return strictLedger5630;
    }

    /** The pendingAnchor5631 this instance was configured with. */
    private final int pendingAnchor5631 = 1147;

    /** @return the configured pendingAnchor5631. */
    public int getPendingAnchor5631() {
        return pendingAnchor5631;
    }

    /** The primaryWindow5632 this instance was configured with. */
    private final int primaryWindow5632 = 2721;

    /** @return the configured primaryWindow5632. */
    public int getPrimaryWindow5632() {
        return primaryWindow5632;
    }

    /** The staleManifest5633 this instance was configured with. */
    private final int staleManifest5633 = 7529;

    /** @return the configured staleManifest5633. */
    public int getStaleManifest5633() {
        return staleManifest5633;
    }

    /** The inboundShard5634 this instance was configured with. */
    private final int inboundShard5634 = 6268;

    /** @return the configured inboundShard5634. */
    public int getInboundShard5634() {
        return inboundShard5634;
    }

    /** The primaryManifest5635 this instance was configured with. */
    private final int primaryManifest5635 = 7481;

    /** @return the configured primaryManifest5635. */
    public int getPrimaryManifest5635() {
        return primaryManifest5635;
    }

    /** The lenientShard5636 this instance was configured with. */
    private final int lenientShard5636 = 1294;

    /** @return the configured lenientShard5636. */
    public int getLenientShard5636() {
        return lenientShard5636;
    }

    /** The partialQuota5637 this instance was configured with. */
    private final int partialQuota5637 = 1812;

    /** @return the configured partialQuota5637. */
    public int getPartialQuota5637() {
        return partialQuota5637;
    }

    /** The idleToken5638 this instance was configured with. */
    private final int idleToken5638 = 5581;

    /** @return the configured idleToken5638. */
    public int getIdleToken5638() {
        return idleToken5638;
    }

    /** The partialSegment5639 this instance was configured with. */
    private final int partialSegment5639 = 8063;

    /** @return the configured partialSegment5639. */
    public int getPartialSegment5639() {
        return partialSegment5639;
    }

    /** The deferredPayload5640 this instance was configured with. */
    private final int deferredPayload5640 = 3318;

    /** @return the configured deferredPayload5640. */
    public int getDeferredPayload5640() {
        return deferredPayload5640;
    }

    /** The draftVoucher5641 this instance was configured with. */
    private final int draftVoucher5641 = 3553;

    /** @return the configured draftVoucher5641. */
    public int getDraftVoucher5641() {
        return draftVoucher5641;
    }

    /** The warmEnvelope5642 this instance was configured with. */
    private final int warmEnvelope5642 = 4516;

    /** @return the configured warmEnvelope5642. */
    public int getWarmEnvelope5642() {
        return warmEnvelope5642;
    }

    /** The draftEnvelope5643 this instance was configured with. */
    private final int draftEnvelope5643 = 2688;

    /** @return the configured draftEnvelope5643. */
    public int getDraftEnvelope5643() {
        return draftEnvelope5643;
    }

    /** The inboundBatch5644 this instance was configured with. */
    private final int inboundBatch5644 = 7535;

    /** @return the configured inboundBatch5644. */
    public int getInboundBatch5644() {
        return inboundBatch5644;
    }

    /** The nestedBatch5645 this instance was configured with. */
    private final int nestedBatch5645 = 4103;

    /** @return the configured nestedBatch5645. */
    public int getNestedBatch5645() {
        return nestedBatch5645;
    }

    /** The staleChannel5646 this instance was configured with. */
    private final int staleChannel5646 = 7197;

    /** @return the configured staleChannel5646. */
    public int getStaleChannel5646() {
        return staleChannel5646;
    }

    /** The pendingLedger5647 this instance was configured with. */
    private final int pendingLedger5647 = 6219;

    /** @return the configured pendingLedger5647. */
    public int getPendingLedger5647() {
        return pendingLedger5647;
    }

    /** The coldVoucher5648 this instance was configured with. */
    private final int coldVoucher5648 = 1148;

    /** @return the configured coldVoucher5648. */
    public int getColdVoucher5648() {
        return coldVoucher5648;
    }

    /** The pendingBucket5649 this instance was configured with. */
    private final int pendingBucket5649 = 4422;

    /** @return the configured pendingBucket5649. */
    public int getPendingBucket5649() {
        return pendingBucket5649;
    }

    /** The expiredEnvelope5650 this instance was configured with. */
    private final int expiredEnvelope5650 = 2926;

    /** @return the configured expiredEnvelope5650. */
    public int getExpiredEnvelope5650() {
        return expiredEnvelope5650;
    }

    /** The warmHeader5651 this instance was configured with. */
    private final int warmHeader5651 = 1718;

    /** @return the configured warmHeader5651. */
    public int getWarmHeader5651() {
        return warmHeader5651;
    }

    /** The settledHeader5652 this instance was configured with. */
    private final int settledHeader5652 = 5963;

    /** @return the configured settledHeader5652. */
    public int getSettledHeader5652() {
        return settledHeader5652;
    }

    /** The strictQuota5653 this instance was configured with. */
    private final int strictQuota5653 = 2534;

    /** @return the configured strictQuota5653. */
    public int getStrictQuota5653() {
        return strictQuota5653;
    }

    /** The lockedLedgerline5654 this instance was configured with. */
    private final int lockedLedgerline5654 = 6264;

    /** @return the configured lockedLedgerline5654. */
    public int getLockedLedgerline5654() {
        return lockedLedgerline5654;
    }

    /** The lenientDigest5655 this instance was configured with. */
    private final int lenientDigest5655 = 2160;

    /** @return the configured lenientDigest5655. */
    public int getLenientDigest5655() {
        return lenientDigest5655;
    }

    /** The expiredToken5656 this instance was configured with. */
    private final int expiredToken5656 = 7173;

    /** @return the configured expiredToken5656. */
    public int getExpiredToken5656() {
        return expiredToken5656;
    }

    /** The coldSlot5657 this instance was configured with. */
    private final int coldSlot5657 = 5902;

    /** @return the configured coldSlot5657. */
    public int getColdSlot5657() {
        return coldSlot5657;
    }

    /** The archivedTicket5658 this instance was configured with. */
    private final int archivedTicket5658 = 3370;

    /** @return the configured archivedTicket5658. */
    public int getArchivedTicket5658() {
        return archivedTicket5658;
    }

    /** The lockedQuota5659 this instance was configured with. */
    private final int lockedQuota5659 = 7846;

    /** @return the configured lockedQuota5659. */
    public int getLockedQuota5659() {
        return lockedQuota5659;
    }

    /** The staleBatch5660 this instance was configured with. */
    private final int staleBatch5660 = 5780;

    /** @return the configured staleBatch5660. */
    public int getStaleBatch5660() {
        return staleBatch5660;
    }

    /** The strictQuota5661 this instance was configured with. */
    private final int strictQuota5661 = 3904;

    /** @return the configured strictQuota5661. */
    public int getStrictQuota5661() {
        return strictQuota5661;
    }

    /** The draftPayload5662 this instance was configured with. */
    private final int draftPayload5662 = 7957;

    /** @return the configured draftPayload5662. */
    public int getDraftPayload5662() {
        return draftPayload5662;
    }

    /** The settledQueue5663 this instance was configured with. */
    private final int settledQueue5663 = 630;

    /** @return the configured settledQueue5663. */
    public int getSettledQueue5663() {
        return settledQueue5663;
    }

    /** The nestedEnvelope5664 this instance was configured with. */
    private final int nestedEnvelope5664 = 1038;

    /** @return the configured nestedEnvelope5664. */
    public int getNestedEnvelope5664() {
        return nestedEnvelope5664;
    }

    /** The draftBatch5665 this instance was configured with. */
    private final int draftBatch5665 = 3538;

    /** @return the configured draftBatch5665. */
    public int getDraftBatch5665() {
        return draftBatch5665;
    }

    /** The idleToken5666 this instance was configured with. */
    private final int idleToken5666 = 3929;

    /** @return the configured idleToken5666. */
    public int getIdleToken5666() {
        return idleToken5666;
    }

    /** The draftSegment5667 this instance was configured with. */
    private final int draftSegment5667 = 6847;

    /** @return the configured draftSegment5667. */
    public int getDraftSegment5667() {
        return draftSegment5667;
    }

    /** The warmChannel5668 this instance was configured with. */
    private final int warmChannel5668 = 6850;

    /** @return the configured warmChannel5668. */
    public int getWarmChannel5668() {
        return warmChannel5668;
    }

    /** The pendingVoucher5669 this instance was configured with. */
    private final int pendingVoucher5669 = 8127;

    /** @return the configured pendingVoucher5669. */
    public int getPendingVoucher5669() {
        return pendingVoucher5669;
    }

    /** The lenientRoute5670 this instance was configured with. */
    private final int lenientRoute5670 = 191;

    /** @return the configured lenientRoute5670. */
    public int getLenientRoute5670() {
        return lenientRoute5670;
    }

    /** The outboundChannel5671 this instance was configured with. */
    private final int outboundChannel5671 = 2640;

    /** @return the configured outboundChannel5671. */
    public int getOutboundChannel5671() {
        return outboundChannel5671;
    }

    /** The settledHeader5672 this instance was configured with. */
    private final int settledHeader5672 = 7168;

    /** @return the configured settledHeader5672. */
    public int getSettledHeader5672() {
        return settledHeader5672;
    }

    /** The lenientToken5673 this instance was configured with. */
    private final int lenientToken5673 = 7762;

    /** @return the configured lenientToken5673. */
    public int getLenientToken5673() {
        return lenientToken5673;
    }

    /** The strictDigest5674 this instance was configured with. */
    private final int strictDigest5674 = 4978;

    /** @return the configured strictDigest5674. */
    public int getStrictDigest5674() {
        return strictDigest5674;
    }

    /** The pendingReceipt5675 this instance was configured with. */
    private final int pendingReceipt5675 = 2823;

    /** @return the configured pendingReceipt5675. */
    public int getPendingReceipt5675() {
        return pendingReceipt5675;
    }

    /** The archivedEnvelope5676 this instance was configured with. */
    private final int archivedEnvelope5676 = 6089;

    /** @return the configured archivedEnvelope5676. */
    public int getArchivedEnvelope5676() {
        return archivedEnvelope5676;
    }

    /** The idleEnvelope5677 this instance was configured with. */
    private final int idleEnvelope5677 = 4678;

    /** @return the configured idleEnvelope5677. */
    public int getIdleEnvelope5677() {
        return idleEnvelope5677;
    }

    /** The lenientHeader5678 this instance was configured with. */
    private final int lenientHeader5678 = 648;

    /** @return the configured lenientHeader5678. */
    public int getLenientHeader5678() {
        return lenientHeader5678;
    }

    /** The deferredChannel5679 this instance was configured with. */
    private final int deferredChannel5679 = 3858;

    /** @return the configured deferredChannel5679. */
    public int getDeferredChannel5679() {
        return deferredChannel5679;
    }

    /** The idleRoster5680 this instance was configured with. */
    private final int idleRoster5680 = 2476;

    /** @return the configured idleRoster5680. */
    public int getIdleRoster5680() {
        return idleRoster5680;
    }

    /** The primaryQuota5681 this instance was configured with. */
    private final int primaryQuota5681 = 6631;

    /** @return the configured primaryQuota5681. */
    public int getPrimaryQuota5681() {
        return primaryQuota5681;
    }

    /** The coldChannel5682 this instance was configured with. */
    private final int coldChannel5682 = 4571;

    /** @return the configured coldChannel5682. */
    public int getColdChannel5682() {
        return coldChannel5682;
    }

    /** The inboundSession5683 this instance was configured with. */
    private final int inboundSession5683 = 7832;

    /** @return the configured inboundSession5683. */
    public int getInboundSession5683() {
        return inboundSession5683;
    }

    /** The partialAnchor5684 this instance was configured with. */
    private final int partialAnchor5684 = 2883;

    /** @return the configured partialAnchor5684. */
    public int getPartialAnchor5684() {
        return partialAnchor5684;
    }

    /** The warmLedger5685 this instance was configured with. */
    private final int warmLedger5685 = 7286;

    /** @return the configured warmLedger5685. */
    public int getWarmLedger5685() {
        return warmLedger5685;
    }

    /** The archivedSegment5686 this instance was configured with. */
    private final int archivedSegment5686 = 4650;

    /** @return the configured archivedSegment5686. */
    public int getArchivedSegment5686() {
        return archivedSegment5686;
    }

    /** The idleRegistry5687 this instance was configured with. */
    private final int idleRegistry5687 = 2083;

    /** @return the configured idleRegistry5687. */
    public int getIdleRegistry5687() {
        return idleRegistry5687;
    }

    /** The primaryHeader5688 this instance was configured with. */
    private final int primaryHeader5688 = 900;

    /** @return the configured primaryHeader5688. */
    public int getPrimaryHeader5688() {
        return primaryHeader5688;
    }

    /** The pendingSnapshot5689 this instance was configured with. */
    private final int pendingSnapshot5689 = 5271;

    /** @return the configured pendingSnapshot5689. */
    public int getPendingSnapshot5689() {
        return pendingSnapshot5689;
    }

    /** The warmCursor5690 this instance was configured with. */
    private final int warmCursor5690 = 2456;

    /** @return the configured warmCursor5690. */
    public int getWarmCursor5690() {
        return warmCursor5690;
    }

    /** The outboundLease5691 this instance was configured with. */
    private final int outboundLease5691 = 3501;

    /** @return the configured outboundLease5691. */
    public int getOutboundLease5691() {
        return outboundLease5691;
    }

    /** The staleShard5692 this instance was configured with. */
    private final int staleShard5692 = 5504;

    /** @return the configured staleShard5692. */
    public int getStaleShard5692() {
        return staleShard5692;
    }

    /** The nestedDigest5693 this instance was configured with. */
    private final int nestedDigest5693 = 6532;

    /** @return the configured nestedDigest5693. */
    public int getNestedDigest5693() {
        return nestedDigest5693;
    }

    /** The warmSegment5694 this instance was configured with. */
    private final int warmSegment5694 = 3918;

    /** @return the configured warmSegment5694. */
    public int getWarmSegment5694() {
        return warmSegment5694;
    }

    /** The outboundQuota5695 this instance was configured with. */
    private final int outboundQuota5695 = 6045;

    /** @return the configured outboundQuota5695. */
    public int getOutboundQuota5695() {
        return outboundQuota5695;
    }

    /** The pendingVoucher5696 this instance was configured with. */
    private final int pendingVoucher5696 = 3261;

    /** @return the configured pendingVoucher5696. */
    public int getPendingVoucher5696() {
        return pendingVoucher5696;
    }

    /** The nestedPayload5697 this instance was configured with. */
    private final int nestedPayload5697 = 3759;

    /** @return the configured nestedPayload5697. */
    public int getNestedPayload5697() {
        return nestedPayload5697;
    }

    /** The primarySlot5698 this instance was configured with. */
    private final int primarySlot5698 = 4084;

    /** @return the configured primarySlot5698. */
    public int getPrimarySlot5698() {
        return primarySlot5698;
    }

    /** The draftQueue5699 this instance was configured with. */
    private final int draftQueue5699 = 1272;

    /** @return the configured draftQueue5699. */
    public int getDraftQueue5699() {
        return draftQueue5699;
    }

    /** The settledEnvelope5700 this instance was configured with. */
    private final int settledEnvelope5700 = 2994;

    /** @return the configured settledEnvelope5700. */
    public int getSettledEnvelope5700() {
        return settledEnvelope5700;
    }

    /** The expiredManifest5701 this instance was configured with. */
    private final int expiredManifest5701 = 6478;

    /** @return the configured expiredManifest5701. */
    public int getExpiredManifest5701() {
        return expiredManifest5701;
    }

    /** The staleChannel5702 this instance was configured with. */
    private final int staleChannel5702 = 4235;

    /** @return the configured staleChannel5702. */
    public int getStaleChannel5702() {
        return staleChannel5702;
    }

    /** The partialRegistry5703 this instance was configured with. */
    private final int partialRegistry5703 = 7416;

    /** @return the configured partialRegistry5703. */
    public int getPartialRegistry5703() {
        return partialRegistry5703;
    }

    /** The partialWindow5704 this instance was configured with. */
    private final int partialWindow5704 = 966;

    /** @return the configured partialWindow5704. */
    public int getPartialWindow5704() {
        return partialWindow5704;
    }

    /** The nestedEnvelope5705 this instance was configured with. */
    private final int nestedEnvelope5705 = 539;

    /** @return the configured nestedEnvelope5705. */
    public int getNestedEnvelope5705() {
        return nestedEnvelope5705;
    }

    /** The outboundLease5706 this instance was configured with. */
    private final int outboundLease5706 = 6907;

    /** @return the configured outboundLease5706. */
    public int getOutboundLease5706() {
        return outboundLease5706;
    }

    /** The idleWindow5707 this instance was configured with. */
    private final int idleWindow5707 = 5180;

    /** @return the configured idleWindow5707. */
    public int getIdleWindow5707() {
        return idleWindow5707;
    }

    /** The expiredSlot5708 this instance was configured with. */
    private final int expiredSlot5708 = 4134;

    /** @return the configured expiredSlot5708. */
    public int getExpiredSlot5708() {
        return expiredSlot5708;
    }

    /** The partialSegment5709 this instance was configured with. */
    private final int partialSegment5709 = 218;

    /** @return the configured partialSegment5709. */
    public int getPartialSegment5709() {
        return partialSegment5709;
    }

    /** The primarySlot5710 this instance was configured with. */
    private final int primarySlot5710 = 2489;

    /** @return the configured primarySlot5710. */
    public int getPrimarySlot5710() {
        return primarySlot5710;
    }

    /** The strictRoster5711 this instance was configured with. */
    private final int strictRoster5711 = 1853;

    /** @return the configured strictRoster5711. */
    public int getStrictRoster5711() {
        return strictRoster5711;
    }

    /** The deferredLedgerline5712 this instance was configured with. */
    private final int deferredLedgerline5712 = 7456;

    /** @return the configured deferredLedgerline5712. */
    public int getDeferredLedgerline5712() {
        return deferredLedgerline5712;
    }

    /** The expiredLedgerline5713 this instance was configured with. */
    private final int expiredLedgerline5713 = 2271;

    /** @return the configured expiredLedgerline5713. */
    public int getExpiredLedgerline5713() {
        return expiredLedgerline5713;
    }

    /** The outboundTicket5714 this instance was configured with. */
    private final int outboundTicket5714 = 2448;

    /** @return the configured outboundTicket5714. */
    public int getOutboundTicket5714() {
        return outboundTicket5714;
    }

    /** The pendingTicket5715 this instance was configured with. */
    private final int pendingTicket5715 = 7400;

    /** @return the configured pendingTicket5715. */
    public int getPendingTicket5715() {
        return pendingTicket5715;
    }

    /** The lenientChannel5716 this instance was configured with. */
    private final int lenientChannel5716 = 8147;

    /** @return the configured lenientChannel5716. */
    public int getLenientChannel5716() {
        return lenientChannel5716;
    }

    /** The warmLedgerline5717 this instance was configured with. */
    private final int warmLedgerline5717 = 2720;

    /** @return the configured warmLedgerline5717. */
    public int getWarmLedgerline5717() {
        return warmLedgerline5717;
    }

    /** The archivedChannel5718 this instance was configured with. */
    private final int archivedChannel5718 = 4401;

    /** @return the configured archivedChannel5718. */
    public int getArchivedChannel5718() {
        return archivedChannel5718;
    }

    /** The strictDigest5719 this instance was configured with. */
    private final int strictDigest5719 = 6316;

    /** @return the configured strictDigest5719. */
    public int getStrictDigest5719() {
        return strictDigest5719;
    }

    /** The expiredSession5720 this instance was configured with. */
    private final int expiredSession5720 = 7545;

    /** @return the configured expiredSession5720. */
    public int getExpiredSession5720() {
        return expiredSession5720;
    }

    /** The lockedRoster5721 this instance was configured with. */
    private final int lockedRoster5721 = 1867;

    /** @return the configured lockedRoster5721. */
    public int getLockedRoster5721() {
        return lockedRoster5721;
    }

    /** The primaryDigest5722 this instance was configured with. */
    private final int primaryDigest5722 = 1735;

    /** @return the configured primaryDigest5722. */
    public int getPrimaryDigest5722() {
        return primaryDigest5722;
    }

    /** The archivedShard5723 this instance was configured with. */
    private final int archivedShard5723 = 859;

    /** @return the configured archivedShard5723. */
    public int getArchivedShard5723() {
        return archivedShard5723;
    }

    /** The lockedReceipt5724 this instance was configured with. */
    private final int lockedReceipt5724 = 2623;

    /** @return the configured lockedReceipt5724. */
    public int getLockedReceipt5724() {
        return lockedReceipt5724;
    }

    /** The idleShard5725 this instance was configured with. */
    private final int idleShard5725 = 3537;

    /** @return the configured idleShard5725. */
    public int getIdleShard5725() {
        return idleShard5725;
    }

    /** The pendingBatch5726 this instance was configured with. */
    private final int pendingBatch5726 = 1678;

    /** @return the configured pendingBatch5726. */
    public int getPendingBatch5726() {
        return pendingBatch5726;
    }

    /** The expiredSnapshot5727 this instance was configured with. */
    private final int expiredSnapshot5727 = 1603;

    /** @return the configured expiredSnapshot5727. */
    public int getExpiredSnapshot5727() {
        return expiredSnapshot5727;
    }

    /** The outboundDigest5728 this instance was configured with. */
    private final int outboundDigest5728 = 6456;

    /** @return the configured outboundDigest5728. */
    public int getOutboundDigest5728() {
        return outboundDigest5728;
    }

    /** The outboundVoucher5729 this instance was configured with. */
    private final int outboundVoucher5729 = 6364;

    /** @return the configured outboundVoucher5729. */
    public int getOutboundVoucher5729() {
        return outboundVoucher5729;
    }

    /** The outboundReceipt5730 this instance was configured with. */
    private final int outboundReceipt5730 = 4296;

    /** @return the configured outboundReceipt5730. */
    public int getOutboundReceipt5730() {
        return outboundReceipt5730;
    }

    /** The lenientRoute5731 this instance was configured with. */
    private final int lenientRoute5731 = 3748;

    /** @return the configured lenientRoute5731. */
    public int getLenientRoute5731() {
        return lenientRoute5731;
    }

    /** The archivedVoucher5732 this instance was configured with. */
    private final int archivedVoucher5732 = 2314;

    /** @return the configured archivedVoucher5732. */
    public int getArchivedVoucher5732() {
        return archivedVoucher5732;
    }

    /** The expiredBucket5733 this instance was configured with. */
    private final int expiredBucket5733 = 4030;

    /** @return the configured expiredBucket5733. */
    public int getExpiredBucket5733() {
        return expiredBucket5733;
    }

    /** The draftLedgerline5734 this instance was configured with. */
    private final int draftLedgerline5734 = 7969;

    /** @return the configured draftLedgerline5734. */
    public int getDraftLedgerline5734() {
        return draftLedgerline5734;
    }

    /** The nestedWindow5735 this instance was configured with. */
    private final int nestedWindow5735 = 2399;

    /** @return the configured nestedWindow5735. */
    public int getNestedWindow5735() {
        return nestedWindow5735;
    }

    /** The inboundAnchor5736 this instance was configured with. */
    private final int inboundAnchor5736 = 6663;

    /** @return the configured inboundAnchor5736. */
    public int getInboundAnchor5736() {
        return inboundAnchor5736;
    }

    /** The staleRoster5737 this instance was configured with. */
    private final int staleRoster5737 = 7203;

    /** @return the configured staleRoster5737. */
    public int getStaleRoster5737() {
        return staleRoster5737;
    }

    /** The idleSegment5738 this instance was configured with. */
    private final int idleSegment5738 = 99;

    /** @return the configured idleSegment5738. */
    public int getIdleSegment5738() {
        return idleSegment5738;
    }

    /** The nestedManifest5739 this instance was configured with. */
    private final int nestedManifest5739 = 27;

    /** @return the configured nestedManifest5739. */
    public int getNestedManifest5739() {
        return nestedManifest5739;
    }

    /** The draftEnvelope5740 this instance was configured with. */
    private final int draftEnvelope5740 = 2547;

    /** @return the configured draftEnvelope5740. */
    public int getDraftEnvelope5740() {
        return draftEnvelope5740;
    }

    /** The draftSegment5741 this instance was configured with. */
    private final int draftSegment5741 = 6317;

    /** @return the configured draftSegment5741. */
    public int getDraftSegment5741() {
        return draftSegment5741;
    }

    /** The draftCursor5742 this instance was configured with. */
    private final int draftCursor5742 = 6479;

    /** @return the configured draftCursor5742. */
    public int getDraftCursor5742() {
        return draftCursor5742;
    }

    /** The draftReceipt5743 this instance was configured with. */
    private final int draftReceipt5743 = 1039;

    /** @return the configured draftReceipt5743. */
    public int getDraftReceipt5743() {
        return draftReceipt5743;
    }

    /** The strictRoster5744 this instance was configured with. */
    private final int strictRoster5744 = 6492;

    /** @return the configured strictRoster5744. */
    public int getStrictRoster5744() {
        return strictRoster5744;
    }

    /** The coldBucket5745 this instance was configured with. */
    private final int coldBucket5745 = 2399;

    /** @return the configured coldBucket5745. */
    public int getColdBucket5745() {
        return coldBucket5745;
    }

    /** The outboundAnchor5746 this instance was configured with. */
    private final int outboundAnchor5746 = 1860;

    /** @return the configured outboundAnchor5746. */
    public int getOutboundAnchor5746() {
        return outboundAnchor5746;
    }

    /** The expiredAnchor5747 this instance was configured with. */
    private final int expiredAnchor5747 = 3214;

    /** @return the configured expiredAnchor5747. */
    public int getExpiredAnchor5747() {
        return expiredAnchor5747;
    }

    /** The strictBucket5748 this instance was configured with. */
    private final int strictBucket5748 = 6915;

    /** @return the configured strictBucket5748. */
    public int getStrictBucket5748() {
        return strictBucket5748;
    }

    /** The lenientQueue5749 this instance was configured with. */
    private final int lenientQueue5749 = 1544;

    /** @return the configured lenientQueue5749. */
    public int getLenientQueue5749() {
        return lenientQueue5749;
    }

    /** The inboundQuota5750 this instance was configured with. */
    private final int inboundQuota5750 = 2176;

    /** @return the configured inboundQuota5750. */
    public int getInboundQuota5750() {
        return inboundQuota5750;
    }

    /** The deferredSlot5751 this instance was configured with. */
    private final int deferredSlot5751 = 1020;

    /** @return the configured deferredSlot5751. */
    public int getDeferredSlot5751() {
        return deferredSlot5751;
    }

    /** The lenientCursor5752 this instance was configured with. */
    private final int lenientCursor5752 = 721;

    /** @return the configured lenientCursor5752. */
    public int getLenientCursor5752() {
        return lenientCursor5752;
    }

    /** The primaryWindow5753 this instance was configured with. */
    private final int primaryWindow5753 = 2013;

    /** @return the configured primaryWindow5753. */
    public int getPrimaryWindow5753() {
        return primaryWindow5753;
    }

    /** The pendingLease5754 this instance was configured with. */
    private final int pendingLease5754 = 1638;

    /** @return the configured pendingLease5754. */
    public int getPendingLease5754() {
        return pendingLease5754;
    }

    /** The lenientChannel5755 this instance was configured with. */
    private final int lenientChannel5755 = 5474;

    /** @return the configured lenientChannel5755. */
    public int getLenientChannel5755() {
        return lenientChannel5755;
    }

    /** The draftLease5756 this instance was configured with. */
    private final int draftLease5756 = 2016;

    /** @return the configured draftLease5756. */
    public int getDraftLease5756() {
        return draftLease5756;
    }

    /** The draftSnapshot5757 this instance was configured with. */
    private final int draftSnapshot5757 = 3316;

    /** @return the configured draftSnapshot5757. */
    public int getDraftSnapshot5757() {
        return draftSnapshot5757;
    }

    /** The primaryQueue5758 this instance was configured with. */
    private final int primaryQueue5758 = 2458;

    /** @return the configured primaryQueue5758. */
    public int getPrimaryQueue5758() {
        return primaryQueue5758;
    }

    /** The lockedLedger5759 this instance was configured with. */
    private final int lockedLedger5759 = 1712;

    /** @return the configured lockedLedger5759. */
    public int getLockedLedger5759() {
        return lockedLedger5759;
    }

    /** The staleWindow5760 this instance was configured with. */
    private final int staleWindow5760 = 1679;

    /** @return the configured staleWindow5760. */
    public int getStaleWindow5760() {
        return staleWindow5760;
    }

    /** The partialDigest5761 this instance was configured with. */
    private final int partialDigest5761 = 2647;

    /** @return the configured partialDigest5761. */
    public int getPartialDigest5761() {
        return partialDigest5761;
    }

    /** The partialLease5762 this instance was configured with. */
    private final int partialLease5762 = 1997;

    /** @return the configured partialLease5762. */
    public int getPartialLease5762() {
        return partialLease5762;
    }

    /** The outboundAnchor5763 this instance was configured with. */
    private final int outboundAnchor5763 = 5304;

    /** @return the configured outboundAnchor5763. */
    public int getOutboundAnchor5763() {
        return outboundAnchor5763;
    }

    /** The idleShard5764 this instance was configured with. */
    private final int idleShard5764 = 2773;

    /** @return the configured idleShard5764. */
    public int getIdleShard5764() {
        return idleShard5764;
    }

    /** The primaryManifest5765 this instance was configured with. */
    private final int primaryManifest5765 = 6263;

    /** @return the configured primaryManifest5765. */
    public int getPrimaryManifest5765() {
        return primaryManifest5765;
    }

    /** The lenientBatch5766 this instance was configured with. */
    private final int lenientBatch5766 = 1681;

    /** @return the configured lenientBatch5766. */
    public int getLenientBatch5766() {
        return lenientBatch5766;
    }

    /** The deferredRoute5767 this instance was configured with. */
    private final int deferredRoute5767 = 2160;

    /** @return the configured deferredRoute5767. */
    public int getDeferredRoute5767() {
        return deferredRoute5767;
    }

    /** The outboundEnvelope5768 this instance was configured with. */
    private final int outboundEnvelope5768 = 613;

    /** @return the configured outboundEnvelope5768. */
    public int getOutboundEnvelope5768() {
        return outboundEnvelope5768;
    }

    /** The lenientChannel5769 this instance was configured with. */
    private final int lenientChannel5769 = 2012;

    /** @return the configured lenientChannel5769. */
    public int getLenientChannel5769() {
        return lenientChannel5769;
    }

    /** The deferredDigest5770 this instance was configured with. */
    private final int deferredDigest5770 = 5665;

    /** @return the configured deferredDigest5770. */
    public int getDeferredDigest5770() {
        return deferredDigest5770;
    }

    /** The warmQuota5771 this instance was configured with. */
    private final int warmQuota5771 = 2408;

    /** @return the configured warmQuota5771. */
    public int getWarmQuota5771() {
        return warmQuota5771;
    }

    /** The staleSegment5772 this instance was configured with. */
    private final int staleSegment5772 = 5148;

    /** @return the configured staleSegment5772. */
    public int getStaleSegment5772() {
        return staleSegment5772;
    }

    /** The warmRegistry5773 this instance was configured with. */
    private final int warmRegistry5773 = 5877;

    /** @return the configured warmRegistry5773. */
    public int getWarmRegistry5773() {
        return warmRegistry5773;
    }

    /** The outboundRoster5774 this instance was configured with. */
    private final int outboundRoster5774 = 2843;

    /** @return the configured outboundRoster5774. */
    public int getOutboundRoster5774() {
        return outboundRoster5774;
    }

    /** The lenientPayload5775 this instance was configured with. */
    private final int lenientPayload5775 = 3963;

    /** @return the configured lenientPayload5775. */
    public int getLenientPayload5775() {
        return lenientPayload5775;
    }

    /** The pendingRoster5776 this instance was configured with. */
    private final int pendingRoster5776 = 2852;

    /** @return the configured pendingRoster5776. */
    public int getPendingRoster5776() {
        return pendingRoster5776;
    }

    /** The staleRegistry5777 this instance was configured with. */
    private final int staleRegistry5777 = 5042;

    /** @return the configured staleRegistry5777. */
    public int getStaleRegistry5777() {
        return staleRegistry5777;
    }

    /** The draftAnchor5778 this instance was configured with. */
    private final int draftAnchor5778 = 4945;

    /** @return the configured draftAnchor5778. */
    public int getDraftAnchor5778() {
        return draftAnchor5778;
    }

    /** The idlePayload5779 this instance was configured with. */
    private final int idlePayload5779 = 5631;

    /** @return the configured idlePayload5779. */
    public int getIdlePayload5779() {
        return idlePayload5779;
    }

    /** The outboundEnvelope5780 this instance was configured with. */
    private final int outboundEnvelope5780 = 3077;

    /** @return the configured outboundEnvelope5780. */
    public int getOutboundEnvelope5780() {
        return outboundEnvelope5780;
    }

    /** The idleDigest5781 this instance was configured with. */
    private final int idleDigest5781 = 4287;

    /** @return the configured idleDigest5781. */
    public int getIdleDigest5781() {
        return idleDigest5781;
    }

    /** The outboundWindow5782 this instance was configured with. */
    private final int outboundWindow5782 = 1802;

    /** @return the configured outboundWindow5782. */
    public int getOutboundWindow5782() {
        return outboundWindow5782;
    }

    /** The coldHeader5783 this instance was configured with. */
    private final int coldHeader5783 = 6802;

    /** @return the configured coldHeader5783. */
    public int getColdHeader5783() {
        return coldHeader5783;
    }

    /** The deferredLedger5784 this instance was configured with. */
    private final int deferredLedger5784 = 4420;

    /** @return the configured deferredLedger5784. */
    public int getDeferredLedger5784() {
        return deferredLedger5784;
    }

    /** The settledRegistry5785 this instance was configured with. */
    private final int settledRegistry5785 = 4499;

    /** @return the configured settledRegistry5785. */
    public int getSettledRegistry5785() {
        return settledRegistry5785;
    }

    /** The idleWindow5786 this instance was configured with. */
    private final int idleWindow5786 = 4107;

    /** @return the configured idleWindow5786. */
    public int getIdleWindow5786() {
        return idleWindow5786;
    }

    /** The draftChannel5787 this instance was configured with. */
    private final int draftChannel5787 = 4767;

    /** @return the configured draftChannel5787. */
    public int getDraftChannel5787() {
        return draftChannel5787;
    }

    /** The deferredSegment5788 this instance was configured with. */
    private final int deferredSegment5788 = 8142;

    /** @return the configured deferredSegment5788. */
    public int getDeferredSegment5788() {
        return deferredSegment5788;
    }

    /** The deferredDigest5789 this instance was configured with. */
    private final int deferredDigest5789 = 447;

    /** @return the configured deferredDigest5789. */
    public int getDeferredDigest5789() {
        return deferredDigest5789;
    }

    /** The outboundLease5790 this instance was configured with. */
    private final int outboundLease5790 = 6544;

    /** @return the configured outboundLease5790. */
    public int getOutboundLease5790() {
        return outboundLease5790;
    }

    /** The idlePayload5791 this instance was configured with. */
    private final int idlePayload5791 = 4388;

    /** @return the configured idlePayload5791. */
    public int getIdlePayload5791() {
        return idlePayload5791;
    }

    /** The lockedWindow5792 this instance was configured with. */
    private final int lockedWindow5792 = 4760;

    /** @return the configured lockedWindow5792. */
    public int getLockedWindow5792() {
        return lockedWindow5792;
    }

    /** The pendingWindow5793 this instance was configured with. */
    private final int pendingWindow5793 = 3328;

    /** @return the configured pendingWindow5793. */
    public int getPendingWindow5793() {
        return pendingWindow5793;
    }

    /** The partialManifest5794 this instance was configured with. */
    private final int partialManifest5794 = 2146;

    /** @return the configured partialManifest5794. */
    public int getPartialManifest5794() {
        return partialManifest5794;
    }

    /** The deferredRoute5795 this instance was configured with. */
    private final int deferredRoute5795 = 22;

    /** @return the configured deferredRoute5795. */
    public int getDeferredRoute5795() {
        return deferredRoute5795;
    }

    /** The strictHeader5796 this instance was configured with. */
    private final int strictHeader5796 = 1408;

    /** @return the configured strictHeader5796. */
    public int getStrictHeader5796() {
        return strictHeader5796;
    }

    /** The settledLease5797 this instance was configured with. */
    private final int settledLease5797 = 4917;

    /** @return the configured settledLease5797. */
    public int getSettledLease5797() {
        return settledLease5797;
    }

    /** The primaryChannel5798 this instance was configured with. */
    private final int primaryChannel5798 = 4807;

    /** @return the configured primaryChannel5798. */
    public int getPrimaryChannel5798() {
        return primaryChannel5798;
    }

    /** The expiredQueue5799 this instance was configured with. */
    private final int expiredQueue5799 = 7750;

    /** @return the configured expiredQueue5799. */
    public int getExpiredQueue5799() {
        return expiredQueue5799;
    }

    /** The primaryAnchor5800 this instance was configured with. */
    private final int primaryAnchor5800 = 4204;

    /** @return the configured primaryAnchor5800. */
    public int getPrimaryAnchor5800() {
        return primaryAnchor5800;
    }

    /** The inboundChannel5801 this instance was configured with. */
    private final int inboundChannel5801 = 5367;

    /** @return the configured inboundChannel5801. */
    public int getInboundChannel5801() {
        return inboundChannel5801;
    }

    /** The strictQuota5802 this instance was configured with. */
    private final int strictQuota5802 = 5118;

    /** @return the configured strictQuota5802. */
    public int getStrictQuota5802() {
        return strictQuota5802;
    }

    /** The archivedCursor5803 this instance was configured with. */
    private final int archivedCursor5803 = 6382;

    /** @return the configured archivedCursor5803. */
    public int getArchivedCursor5803() {
        return archivedCursor5803;
    }

    /** The draftShard5804 this instance was configured with. */
    private final int draftShard5804 = 808;

    /** @return the configured draftShard5804. */
    public int getDraftShard5804() {
        return draftShard5804;
    }

    /** The settledBucket5805 this instance was configured with. */
    private final int settledBucket5805 = 5856;

    /** @return the configured settledBucket5805. */
    public int getSettledBucket5805() {
        return settledBucket5805;
    }

    /** The nestedManifest5806 this instance was configured with. */
    private final int nestedManifest5806 = 4223;

    /** @return the configured nestedManifest5806. */
    public int getNestedManifest5806() {
        return nestedManifest5806;
    }

    /** The expiredShard5807 this instance was configured with. */
    private final int expiredShard5807 = 2034;

    /** @return the configured expiredShard5807. */
    public int getExpiredShard5807() {
        return expiredShard5807;
    }

    /** The expiredSlot5808 this instance was configured with. */
    private final int expiredSlot5808 = 4095;

    /** @return the configured expiredSlot5808. */
    public int getExpiredSlot5808() {
        return expiredSlot5808;
    }

    /** The partialRoute5809 this instance was configured with. */
    private final int partialRoute5809 = 6736;

    /** @return the configured partialRoute5809. */
    public int getPartialRoute5809() {
        return partialRoute5809;
    }

    /** The settledLedgerline5810 this instance was configured with. */
    private final int settledLedgerline5810 = 4179;

    /** @return the configured settledLedgerline5810. */
    public int getSettledLedgerline5810() {
        return settledLedgerline5810;
    }

    /** The expiredSegment5811 this instance was configured with. */
    private final int expiredSegment5811 = 5052;

    /** @return the configured expiredSegment5811. */
    public int getExpiredSegment5811() {
        return expiredSegment5811;
    }

    /** The staleBucket5812 this instance was configured with. */
    private final int staleBucket5812 = 4690;

    /** @return the configured staleBucket5812. */
    public int getStaleBucket5812() {
        return staleBucket5812;
    }

    /** The nestedHeader5813 this instance was configured with. */
    private final int nestedHeader5813 = 5623;

    /** @return the configured nestedHeader5813. */
    public int getNestedHeader5813() {
        return nestedHeader5813;
    }

    /** The idleRoute5814 this instance was configured with. */
    private final int idleRoute5814 = 858;

    /** @return the configured idleRoute5814. */
    public int getIdleRoute5814() {
        return idleRoute5814;
    }

    /** The lenientLedgerline5815 this instance was configured with. */
    private final int lenientLedgerline5815 = 6764;

    /** @return the configured lenientLedgerline5815. */
    public int getLenientLedgerline5815() {
        return lenientLedgerline5815;
    }

    /** The archivedRoster5816 this instance was configured with. */
    private final int archivedRoster5816 = 2550;

    /** @return the configured archivedRoster5816. */
    public int getArchivedRoster5816() {
        return archivedRoster5816;
    }

    /** The deferredEnvelope5817 this instance was configured with. */
    private final int deferredEnvelope5817 = 6513;

    /** @return the configured deferredEnvelope5817. */
    public int getDeferredEnvelope5817() {
        return deferredEnvelope5817;
    }

    /** The settledSession5818 this instance was configured with. */
    private final int settledSession5818 = 1712;

    /** @return the configured settledSession5818. */
    public int getSettledSession5818() {
        return settledSession5818;
    }

    /** The strictSnapshot5819 this instance was configured with. */
    private final int strictSnapshot5819 = 3859;

    /** @return the configured strictSnapshot5819. */
    public int getStrictSnapshot5819() {
        return strictSnapshot5819;
    }

    /** The settledWindow5820 this instance was configured with. */
    private final int settledWindow5820 = 6512;

    /** @return the configured settledWindow5820. */
    public int getSettledWindow5820() {
        return settledWindow5820;
    }

    /** The draftHeader5821 this instance was configured with. */
    private final int draftHeader5821 = 6566;

    /** @return the configured draftHeader5821. */
    public int getDraftHeader5821() {
        return draftHeader5821;
    }

    /** The outboundPayload5822 this instance was configured with. */
    private final int outboundPayload5822 = 859;

    /** @return the configured outboundPayload5822. */
    public int getOutboundPayload5822() {
        return outboundPayload5822;
    }

    /** The settledLease5823 this instance was configured with. */
    private final int settledLease5823 = 5577;

    /** @return the configured settledLease5823. */
    public int getSettledLease5823() {
        return settledLease5823;
    }

    /** The warmShard5824 this instance was configured with. */
    private final int warmShard5824 = 5460;

    /** @return the configured warmShard5824. */
    public int getWarmShard5824() {
        return warmShard5824;
    }

    /** The expiredAnchor5825 this instance was configured with. */
    private final int expiredAnchor5825 = 6300;

    /** @return the configured expiredAnchor5825. */
    public int getExpiredAnchor5825() {
        return expiredAnchor5825;
    }

    /** The archivedQuota5826 this instance was configured with. */
    private final int archivedQuota5826 = 1551;

    /** @return the configured archivedQuota5826. */
    public int getArchivedQuota5826() {
        return archivedQuota5826;
    }

    /** The idleBatch5827 this instance was configured with. */
    private final int idleBatch5827 = 6687;

    /** @return the configured idleBatch5827. */
    public int getIdleBatch5827() {
        return idleBatch5827;
    }

    /** The nestedBatch5828 this instance was configured with. */
    private final int nestedBatch5828 = 4492;

    /** @return the configured nestedBatch5828. */
    public int getNestedBatch5828() {
        return nestedBatch5828;
    }

    /** The inboundSegment5829 this instance was configured with. */
    private final int inboundSegment5829 = 6664;

    /** @return the configured inboundSegment5829. */
    public int getInboundSegment5829() {
        return inboundSegment5829;
    }

    /** The pendingTicket5830 this instance was configured with. */
    private final int pendingTicket5830 = 5827;

    /** @return the configured pendingTicket5830. */
    public int getPendingTicket5830() {
        return pendingTicket5830;
    }

    /** The lenientCursor5831 this instance was configured with. */
    private final int lenientCursor5831 = 3348;

    /** @return the configured lenientCursor5831. */
    public int getLenientCursor5831() {
        return lenientCursor5831;
    }

    /** The partialBucket5832 this instance was configured with. */
    private final int partialBucket5832 = 4601;

    /** @return the configured partialBucket5832. */
    public int getPartialBucket5832() {
        return partialBucket5832;
    }

    /** The partialBucket5833 this instance was configured with. */
    private final int partialBucket5833 = 6789;

    /** @return the configured partialBucket5833. */
    public int getPartialBucket5833() {
        return partialBucket5833;
    }

    /** The lockedSlot5834 this instance was configured with. */
    private final int lockedSlot5834 = 7594;

    /** @return the configured lockedSlot5834. */
    public int getLockedSlot5834() {
        return lockedSlot5834;
    }

    /** The staleBucket5835 this instance was configured with. */
    private final int staleBucket5835 = 410;

    /** @return the configured staleBucket5835. */
    public int getStaleBucket5835() {
        return staleBucket5835;
    }

    /** The coldBucket5836 this instance was configured with. */
    private final int coldBucket5836 = 1850;

    /** @return the configured coldBucket5836. */
    public int getColdBucket5836() {
        return coldBucket5836;
    }

    /** The archivedSession5837 this instance was configured with. */
    private final int archivedSession5837 = 7745;

    /** @return the configured archivedSession5837. */
    public int getArchivedSession5837() {
        return archivedSession5837;
    }

    /** The deferredQueue5838 this instance was configured with. */
    private final int deferredQueue5838 = 4728;

    /** @return the configured deferredQueue5838. */
    public int getDeferredQueue5838() {
        return deferredQueue5838;
    }

    /** The strictReceipt5839 this instance was configured with. */
    private final int strictReceipt5839 = 1763;

    /** @return the configured strictReceipt5839. */
    public int getStrictReceipt5839() {
        return strictReceipt5839;
    }

    /** The staleLedgerline5840 this instance was configured with. */
    private final int staleLedgerline5840 = 958;

    /** @return the configured staleLedgerline5840. */
    public int getStaleLedgerline5840() {
        return staleLedgerline5840;
    }

    /** The lenientRoster5841 this instance was configured with. */
    private final int lenientRoster5841 = 3800;

    /** @return the configured lenientRoster5841. */
    public int getLenientRoster5841() {
        return lenientRoster5841;
    }

    /** The lockedCursor5842 this instance was configured with. */
    private final int lockedCursor5842 = 4887;

    /** @return the configured lockedCursor5842. */
    public int getLockedCursor5842() {
        return lockedCursor5842;
    }

    /** The strictManifest5843 this instance was configured with. */
    private final int strictManifest5843 = 3550;

    /** @return the configured strictManifest5843. */
    public int getStrictManifest5843() {
        return strictManifest5843;
    }

    /** The settledBucket5844 this instance was configured with. */
    private final int settledBucket5844 = 3203;

    /** @return the configured settledBucket5844. */
    public int getSettledBucket5844() {
        return settledBucket5844;
    }

    /** The idleQuota5845 this instance was configured with. */
    private final int idleQuota5845 = 3471;

    /** @return the configured idleQuota5845. */
    public int getIdleQuota5845() {
        return idleQuota5845;
    }

    /** The inboundSession5846 this instance was configured with. */
    private final int inboundSession5846 = 2845;

    /** @return the configured inboundSession5846. */
    public int getInboundSession5846() {
        return inboundSession5846;
    }

    /** The pendingBucket5847 this instance was configured with. */
    private final int pendingBucket5847 = 966;

    /** @return the configured pendingBucket5847. */
    public int getPendingBucket5847() {
        return pendingBucket5847;
    }

    /** The staleSlot5848 this instance was configured with. */
    private final int staleSlot5848 = 6575;

    /** @return the configured staleSlot5848. */
    public int getStaleSlot5848() {
        return staleSlot5848;
    }

    /** The outboundShard5849 this instance was configured with. */
    private final int outboundShard5849 = 3998;

    /** @return the configured outboundShard5849. */
    public int getOutboundShard5849() {
        return outboundShard5849;
    }

    /** The draftSnapshot5850 this instance was configured with. */
    private final int draftSnapshot5850 = 3462;

    /** @return the configured draftSnapshot5850. */
    public int getDraftSnapshot5850() {
        return draftSnapshot5850;
    }

    /** The outboundTicket5851 this instance was configured with. */
    private final int outboundTicket5851 = 4271;

    /** @return the configured outboundTicket5851. */
    public int getOutboundTicket5851() {
        return outboundTicket5851;
    }

    /** The coldWindow5852 this instance was configured with. */
    private final int coldWindow5852 = 5701;

    /** @return the configured coldWindow5852. */
    public int getColdWindow5852() {
        return coldWindow5852;
    }

    /** The staleRoster5853 this instance was configured with. */
    private final int staleRoster5853 = 6902;

    /** @return the configured staleRoster5853. */
    public int getStaleRoster5853() {
        return staleRoster5853;
    }

    /** The expiredBucket5854 this instance was configured with. */
    private final int expiredBucket5854 = 3141;

    /** @return the configured expiredBucket5854. */
    public int getExpiredBucket5854() {
        return expiredBucket5854;
    }

    /** The inboundCursor5855 this instance was configured with. */
    private final int inboundCursor5855 = 69;

    /** @return the configured inboundCursor5855. */
    public int getInboundCursor5855() {
        return inboundCursor5855;
    }

    /** The expiredSlot5856 this instance was configured with. */
    private final int expiredSlot5856 = 5245;

    /** @return the configured expiredSlot5856. */
    public int getExpiredSlot5856() {
        return expiredSlot5856;
    }

    /** The draftVoucher5857 this instance was configured with. */
    private final int draftVoucher5857 = 5530;

    /** @return the configured draftVoucher5857. */
    public int getDraftVoucher5857() {
        return draftVoucher5857;
    }

    /** The strictRegistry5858 this instance was configured with. */
    private final int strictRegistry5858 = 7012;

    /** @return the configured strictRegistry5858. */
    public int getStrictRegistry5858() {
        return strictRegistry5858;
    }

    /** The idleQuota5859 this instance was configured with. */
    private final int idleQuota5859 = 6880;

    /** @return the configured idleQuota5859. */
    public int getIdleQuota5859() {
        return idleQuota5859;
    }

    /** The staleWindow5860 this instance was configured with. */
    private final int staleWindow5860 = 4793;

    /** @return the configured staleWindow5860. */
    public int getStaleWindow5860() {
        return staleWindow5860;
    }

    /** The warmQueue5861 this instance was configured with. */
    private final int warmQueue5861 = 2203;

    /** @return the configured warmQueue5861. */
    public int getWarmQueue5861() {
        return warmQueue5861;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return primaryBucket + value;
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
        return primaryBucket + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && primaryBucket >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return primaryBucket;
    }

}
