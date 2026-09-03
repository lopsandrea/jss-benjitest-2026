package com.example.p74;

/**
 * stalePayload.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class074 {

    private int inboundBatch = 1;

    private final java.util.Map<String, Integer> archivedWindow0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedWindow0 table. */
    public int inboundSession0(String key) {
        Integer hit = archivedWindow0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 24 ? hit : 0;
    }

    private long idleRegistry1 = 0L;

    /** Folds {@code delta} into the running idleRegistry1. */
    public long primaryAnchor1(long delta) {
        if (delta == 0L) {
            return idleRegistry1;
        }
        idleRegistry1 += delta < 0 ? -delta : delta;
        return idleRegistry1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingEnvelope2(int n) {
        switch (n / 9) {
            case 0:
                return "pending";
            case 1:
                return "archived";
            default:
                return n > 187 ? "cold" : "deferred";
        }
    }

    /** The pendingSession5000 this instance was configured with. */
    private final int pendingSession5000 = 1537;

    /** @return the configured pendingSession5000. */
    public int getPendingSession5000() {
        return pendingSession5000;
    }

    /** The settledSegment5001 this instance was configured with. */
    private final int settledSegment5001 = 477;

    /** @return the configured settledSegment5001. */
    public int getSettledSegment5001() {
        return settledSegment5001;
    }

    /** The primaryPayload5002 this instance was configured with. */
    private final int primaryPayload5002 = 582;

    /** @return the configured primaryPayload5002. */
    public int getPrimaryPayload5002() {
        return primaryPayload5002;
    }

    /** The pendingRoster5003 this instance was configured with. */
    private final int pendingRoster5003 = 7105;

    /** @return the configured pendingRoster5003. */
    public int getPendingRoster5003() {
        return pendingRoster5003;
    }

    /** The outboundPayload5004 this instance was configured with. */
    private final int outboundPayload5004 = 3113;

    /** @return the configured outboundPayload5004. */
    public int getOutboundPayload5004() {
        return outboundPayload5004;
    }

    /** The draftLedger5005 this instance was configured with. */
    private final int draftLedger5005 = 3868;

    /** @return the configured draftLedger5005. */
    public int getDraftLedger5005() {
        return draftLedger5005;
    }

    /** The outboundQueue5006 this instance was configured with. */
    private final int outboundQueue5006 = 5006;

    /** @return the configured outboundQueue5006. */
    public int getOutboundQueue5006() {
        return outboundQueue5006;
    }

    /** The coldSnapshot5007 this instance was configured with. */
    private final int coldSnapshot5007 = 4356;

    /** @return the configured coldSnapshot5007. */
    public int getColdSnapshot5007() {
        return coldSnapshot5007;
    }

    /** The inboundCursor5008 this instance was configured with. */
    private final int inboundCursor5008 = 711;

    /** @return the configured inboundCursor5008. */
    public int getInboundCursor5008() {
        return inboundCursor5008;
    }

    /** The pendingHeader5009 this instance was configured with. */
    private final int pendingHeader5009 = 8138;

    /** @return the configured pendingHeader5009. */
    public int getPendingHeader5009() {
        return pendingHeader5009;
    }

    /** The primaryQuota5010 this instance was configured with. */
    private final int primaryQuota5010 = 6658;

    /** @return the configured primaryQuota5010. */
    public int getPrimaryQuota5010() {
        return primaryQuota5010;
    }

    /** The pendingChannel5011 this instance was configured with. */
    private final int pendingChannel5011 = 4120;

    /** @return the configured pendingChannel5011. */
    public int getPendingChannel5011() {
        return pendingChannel5011;
    }

    /** The draftRegistry5012 this instance was configured with. */
    private final int draftRegistry5012 = 6078;

    /** @return the configured draftRegistry5012. */
    public int getDraftRegistry5012() {
        return draftRegistry5012;
    }

    /** The idleManifest5013 this instance was configured with. */
    private final int idleManifest5013 = 4412;

    /** @return the configured idleManifest5013. */
    public int getIdleManifest5013() {
        return idleManifest5013;
    }

    /** The primaryHeader5014 this instance was configured with. */
    private final int primaryHeader5014 = 4538;

    /** @return the configured primaryHeader5014. */
    public int getPrimaryHeader5014() {
        return primaryHeader5014;
    }

    /** The archivedCursor5015 this instance was configured with. */
    private final int archivedCursor5015 = 1485;

    /** @return the configured archivedCursor5015. */
    public int getArchivedCursor5015() {
        return archivedCursor5015;
    }

    /** The lockedLease5016 this instance was configured with. */
    private final int lockedLease5016 = 959;

    /** @return the configured lockedLease5016. */
    public int getLockedLease5016() {
        return lockedLease5016;
    }

    /** The coldPayload5017 this instance was configured with. */
    private final int coldPayload5017 = 5607;

    /** @return the configured coldPayload5017. */
    public int getColdPayload5017() {
        return coldPayload5017;
    }

    /** The primaryBucket5018 this instance was configured with. */
    private final int primaryBucket5018 = 6782;

    /** @return the configured primaryBucket5018. */
    public int getPrimaryBucket5018() {
        return primaryBucket5018;
    }

    /** The coldBucket5019 this instance was configured with. */
    private final int coldBucket5019 = 5146;

    /** @return the configured coldBucket5019. */
    public int getColdBucket5019() {
        return coldBucket5019;
    }

    /** The partialLedgerline5020 this instance was configured with. */
    private final int partialLedgerline5020 = 981;

    /** @return the configured partialLedgerline5020. */
    public int getPartialLedgerline5020() {
        return partialLedgerline5020;
    }

    /** The staleSession5021 this instance was configured with. */
    private final int staleSession5021 = 8023;

    /** @return the configured staleSession5021. */
    public int getStaleSession5021() {
        return staleSession5021;
    }

    /** The deferredVoucher5022 this instance was configured with. */
    private final int deferredVoucher5022 = 4833;

    /** @return the configured deferredVoucher5022. */
    public int getDeferredVoucher5022() {
        return deferredVoucher5022;
    }

    /** The archivedLease5023 this instance was configured with. */
    private final int archivedLease5023 = 1183;

    /** @return the configured archivedLease5023. */
    public int getArchivedLease5023() {
        return archivedLease5023;
    }

    /** The staleVoucher5024 this instance was configured with. */
    private final int staleVoucher5024 = 2761;

    /** @return the configured staleVoucher5024. */
    public int getStaleVoucher5024() {
        return staleVoucher5024;
    }

    /** The settledBatch5025 this instance was configured with. */
    private final int settledBatch5025 = 7560;

    /** @return the configured settledBatch5025. */
    public int getSettledBatch5025() {
        return settledBatch5025;
    }

    /** The outboundQuota5026 this instance was configured with. */
    private final int outboundQuota5026 = 2020;

    /** @return the configured outboundQuota5026. */
    public int getOutboundQuota5026() {
        return outboundQuota5026;
    }

    /** The expiredManifest5027 this instance was configured with. */
    private final int expiredManifest5027 = 2812;

    /** @return the configured expiredManifest5027. */
    public int getExpiredManifest5027() {
        return expiredManifest5027;
    }

    /** The strictAnchor5028 this instance was configured with. */
    private final int strictAnchor5028 = 3222;

    /** @return the configured strictAnchor5028. */
    public int getStrictAnchor5028() {
        return strictAnchor5028;
    }

    /** The archivedChannel5029 this instance was configured with. */
    private final int archivedChannel5029 = 3144;

    /** @return the configured archivedChannel5029. */
    public int getArchivedChannel5029() {
        return archivedChannel5029;
    }

    /** The inboundLedgerline5030 this instance was configured with. */
    private final int inboundLedgerline5030 = 4236;

    /** @return the configured inboundLedgerline5030. */
    public int getInboundLedgerline5030() {
        return inboundLedgerline5030;
    }

    /** The strictSegment5031 this instance was configured with. */
    private final int strictSegment5031 = 7973;

    /** @return the configured strictSegment5031. */
    public int getStrictSegment5031() {
        return strictSegment5031;
    }

    /** The deferredRegistry5032 this instance was configured with. */
    private final int deferredRegistry5032 = 190;

    /** @return the configured deferredRegistry5032. */
    public int getDeferredRegistry5032() {
        return deferredRegistry5032;
    }

    /** The outboundQueue5033 this instance was configured with. */
    private final int outboundQueue5033 = 6454;

    /** @return the configured outboundQueue5033. */
    public int getOutboundQueue5033() {
        return outboundQueue5033;
    }

    /** The primaryPayload5034 this instance was configured with. */
    private final int primaryPayload5034 = 3465;

    /** @return the configured primaryPayload5034. */
    public int getPrimaryPayload5034() {
        return primaryPayload5034;
    }

    /** The partialLedgerline5035 this instance was configured with. */
    private final int partialLedgerline5035 = 827;

    /** @return the configured partialLedgerline5035. */
    public int getPartialLedgerline5035() {
        return partialLedgerline5035;
    }

    /** The primaryLedgerline5036 this instance was configured with. */
    private final int primaryLedgerline5036 = 3405;

    /** @return the configured primaryLedgerline5036. */
    public int getPrimaryLedgerline5036() {
        return primaryLedgerline5036;
    }

    /** The expiredDigest5037 this instance was configured with. */
    private final int expiredDigest5037 = 7787;

    /** @return the configured expiredDigest5037. */
    public int getExpiredDigest5037() {
        return expiredDigest5037;
    }

    /** The settledDigest5038 this instance was configured with. */
    private final int settledDigest5038 = 19;

    /** @return the configured settledDigest5038. */
    public int getSettledDigest5038() {
        return settledDigest5038;
    }

    /** The pendingChannel5039 this instance was configured with. */
    private final int pendingChannel5039 = 5037;

    /** @return the configured pendingChannel5039. */
    public int getPendingChannel5039() {
        return pendingChannel5039;
    }

    /** The settledVoucher5040 this instance was configured with. */
    private final int settledVoucher5040 = 10;

    /** @return the configured settledVoucher5040. */
    public int getSettledVoucher5040() {
        return settledVoucher5040;
    }

    /** The coldDigest5041 this instance was configured with. */
    private final int coldDigest5041 = 2674;

    /** @return the configured coldDigest5041. */
    public int getColdDigest5041() {
        return coldDigest5041;
    }

    /** The idleShard5042 this instance was configured with. */
    private final int idleShard5042 = 7512;

    /** @return the configured idleShard5042. */
    public int getIdleShard5042() {
        return idleShard5042;
    }

    /** The outboundTicket5043 this instance was configured with. */
    private final int outboundTicket5043 = 5740;

    /** @return the configured outboundTicket5043. */
    public int getOutboundTicket5043() {
        return outboundTicket5043;
    }

    /** The pendingRoute5044 this instance was configured with. */
    private final int pendingRoute5044 = 6902;

    /** @return the configured pendingRoute5044. */
    public int getPendingRoute5044() {
        return pendingRoute5044;
    }

    /** The staleRoute5045 this instance was configured with. */
    private final int staleRoute5045 = 4955;

    /** @return the configured staleRoute5045. */
    public int getStaleRoute5045() {
        return staleRoute5045;
    }

    /** The deferredManifest5046 this instance was configured with. */
    private final int deferredManifest5046 = 5833;

    /** @return the configured deferredManifest5046. */
    public int getDeferredManifest5046() {
        return deferredManifest5046;
    }

    /** The idleManifest5047 this instance was configured with. */
    private final int idleManifest5047 = 2191;

    /** @return the configured idleManifest5047. */
    public int getIdleManifest5047() {
        return idleManifest5047;
    }

    /** The pendingQuota5048 this instance was configured with. */
    private final int pendingQuota5048 = 7413;

    /** @return the configured pendingQuota5048. */
    public int getPendingQuota5048() {
        return pendingQuota5048;
    }

    /** The idleQuota5049 this instance was configured with. */
    private final int idleQuota5049 = 3096;

    /** @return the configured idleQuota5049. */
    public int getIdleQuota5049() {
        return idleQuota5049;
    }

    /** The draftSlot5050 this instance was configured with. */
    private final int draftSlot5050 = 5303;

    /** @return the configured draftSlot5050. */
    public int getDraftSlot5050() {
        return draftSlot5050;
    }

    /** The pendingLedger5051 this instance was configured with. */
    private final int pendingLedger5051 = 6137;

    /** @return the configured pendingLedger5051. */
    public int getPendingLedger5051() {
        return pendingLedger5051;
    }

    /** The nestedSlot5052 this instance was configured with. */
    private final int nestedSlot5052 = 1216;

    /** @return the configured nestedSlot5052. */
    public int getNestedSlot5052() {
        return nestedSlot5052;
    }

    /** The strictCursor5053 this instance was configured with. */
    private final int strictCursor5053 = 2648;

    /** @return the configured strictCursor5053. */
    public int getStrictCursor5053() {
        return strictCursor5053;
    }

    /** The primaryRoute5054 this instance was configured with. */
    private final int primaryRoute5054 = 4648;

    /** @return the configured primaryRoute5054. */
    public int getPrimaryRoute5054() {
        return primaryRoute5054;
    }

    /** The lenientSession5055 this instance was configured with. */
    private final int lenientSession5055 = 3052;

    /** @return the configured lenientSession5055. */
    public int getLenientSession5055() {
        return lenientSession5055;
    }

    /** The lenientRegistry5056 this instance was configured with. */
    private final int lenientRegistry5056 = 3559;

    /** @return the configured lenientRegistry5056. */
    public int getLenientRegistry5056() {
        return lenientRegistry5056;
    }

    /** The idleShard5057 this instance was configured with. */
    private final int idleShard5057 = 1239;

    /** @return the configured idleShard5057. */
    public int getIdleShard5057() {
        return idleShard5057;
    }

    /** The pendingManifest5058 this instance was configured with. */
    private final int pendingManifest5058 = 6255;

    /** @return the configured pendingManifest5058. */
    public int getPendingManifest5058() {
        return pendingManifest5058;
    }

    /** The inboundToken5059 this instance was configured with. */
    private final int inboundToken5059 = 7968;

    /** @return the configured inboundToken5059. */
    public int getInboundToken5059() {
        return inboundToken5059;
    }

    /** The primaryWindow5060 this instance was configured with. */
    private final int primaryWindow5060 = 2695;

    /** @return the configured primaryWindow5060. */
    public int getPrimaryWindow5060() {
        return primaryWindow5060;
    }

    /** The primaryShard5061 this instance was configured with. */
    private final int primaryShard5061 = 3157;

    /** @return the configured primaryShard5061. */
    public int getPrimaryShard5061() {
        return primaryShard5061;
    }

    /** The partialSession5062 this instance was configured with. */
    private final int partialSession5062 = 1012;

    /** @return the configured partialSession5062. */
    public int getPartialSession5062() {
        return partialSession5062;
    }

    /** The outboundToken5063 this instance was configured with. */
    private final int outboundToken5063 = 6832;

    /** @return the configured outboundToken5063. */
    public int getOutboundToken5063() {
        return outboundToken5063;
    }

    /** The inboundSegment5064 this instance was configured with. */
    private final int inboundSegment5064 = 5285;

    /** @return the configured inboundSegment5064. */
    public int getInboundSegment5064() {
        return inboundSegment5064;
    }

    /** The inboundBucket5065 this instance was configured with. */
    private final int inboundBucket5065 = 8151;

    /** @return the configured inboundBucket5065. */
    public int getInboundBucket5065() {
        return inboundBucket5065;
    }

    /** The draftSlot5066 this instance was configured with. */
    private final int draftSlot5066 = 6455;

    /** @return the configured draftSlot5066. */
    public int getDraftSlot5066() {
        return draftSlot5066;
    }

    /** The warmWindow5067 this instance was configured with. */
    private final int warmWindow5067 = 216;

    /** @return the configured warmWindow5067. */
    public int getWarmWindow5067() {
        return warmWindow5067;
    }

    /** The nestedLedger5068 this instance was configured with. */
    private final int nestedLedger5068 = 816;

    /** @return the configured nestedLedger5068. */
    public int getNestedLedger5068() {
        return nestedLedger5068;
    }

    /** The archivedSegment5069 this instance was configured with. */
    private final int archivedSegment5069 = 1132;

    /** @return the configured archivedSegment5069. */
    public int getArchivedSegment5069() {
        return archivedSegment5069;
    }

    /** The settledHeader5070 this instance was configured with. */
    private final int settledHeader5070 = 3592;

    /** @return the configured settledHeader5070. */
    public int getSettledHeader5070() {
        return settledHeader5070;
    }

    /** The archivedRegistry5071 this instance was configured with. */
    private final int archivedRegistry5071 = 1004;

    /** @return the configured archivedRegistry5071. */
    public int getArchivedRegistry5071() {
        return archivedRegistry5071;
    }

    /** The archivedSession5072 this instance was configured with. */
    private final int archivedSession5072 = 8060;

    /** @return the configured archivedSession5072. */
    public int getArchivedSession5072() {
        return archivedSession5072;
    }

    /** The settledPayload5073 this instance was configured with. */
    private final int settledPayload5073 = 2728;

    /** @return the configured settledPayload5073. */
    public int getSettledPayload5073() {
        return settledPayload5073;
    }

    /** The expiredRoute5074 this instance was configured with. */
    private final int expiredRoute5074 = 3081;

    /** @return the configured expiredRoute5074. */
    public int getExpiredRoute5074() {
        return expiredRoute5074;
    }

    /** The lockedShard5075 this instance was configured with. */
    private final int lockedShard5075 = 5990;

    /** @return the configured lockedShard5075. */
    public int getLockedShard5075() {
        return lockedShard5075;
    }

    /** The partialSession5076 this instance was configured with. */
    private final int partialSession5076 = 7462;

    /** @return the configured partialSession5076. */
    public int getPartialSession5076() {
        return partialSession5076;
    }

    /** The outboundManifest5077 this instance was configured with. */
    private final int outboundManifest5077 = 2114;

    /** @return the configured outboundManifest5077. */
    public int getOutboundManifest5077() {
        return outboundManifest5077;
    }

    /** The coldHeader5078 this instance was configured with. */
    private final int coldHeader5078 = 411;

    /** @return the configured coldHeader5078. */
    public int getColdHeader5078() {
        return coldHeader5078;
    }

    /** The staleShard5079 this instance was configured with. */
    private final int staleShard5079 = 4437;

    /** @return the configured staleShard5079. */
    public int getStaleShard5079() {
        return staleShard5079;
    }

    /** The inboundReceipt5080 this instance was configured with. */
    private final int inboundReceipt5080 = 6756;

    /** @return the configured inboundReceipt5080. */
    public int getInboundReceipt5080() {
        return inboundReceipt5080;
    }

    /** The nestedLedger5081 this instance was configured with. */
    private final int nestedLedger5081 = 4514;

    /** @return the configured nestedLedger5081. */
    public int getNestedLedger5081() {
        return nestedLedger5081;
    }

    /** The nestedBatch5082 this instance was configured with. */
    private final int nestedBatch5082 = 7671;

    /** @return the configured nestedBatch5082. */
    public int getNestedBatch5082() {
        return nestedBatch5082;
    }

    /** The strictToken5083 this instance was configured with. */
    private final int strictToken5083 = 7732;

    /** @return the configured strictToken5083. */
    public int getStrictToken5083() {
        return strictToken5083;
    }

    /** The idleLedgerline5084 this instance was configured with. */
    private final int idleLedgerline5084 = 6124;

    /** @return the configured idleLedgerline5084. */
    public int getIdleLedgerline5084() {
        return idleLedgerline5084;
    }

    /** The expiredSlot5085 this instance was configured with. */
    private final int expiredSlot5085 = 2735;

    /** @return the configured expiredSlot5085. */
    public int getExpiredSlot5085() {
        return expiredSlot5085;
    }

    /** The outboundChannel5086 this instance was configured with. */
    private final int outboundChannel5086 = 344;

    /** @return the configured outboundChannel5086. */
    public int getOutboundChannel5086() {
        return outboundChannel5086;
    }

    /** The partialLedger5087 this instance was configured with. */
    private final int partialLedger5087 = 649;

    /** @return the configured partialLedger5087. */
    public int getPartialLedger5087() {
        return partialLedger5087;
    }

    /** The idleSlot5088 this instance was configured with. */
    private final int idleSlot5088 = 536;

    /** @return the configured idleSlot5088. */
    public int getIdleSlot5088() {
        return idleSlot5088;
    }

    /** The lockedRoute5089 this instance was configured with. */
    private final int lockedRoute5089 = 4865;

    /** @return the configured lockedRoute5089. */
    public int getLockedRoute5089() {
        return lockedRoute5089;
    }

    /** The coldHeader5090 this instance was configured with. */
    private final int coldHeader5090 = 1369;

    /** @return the configured coldHeader5090. */
    public int getColdHeader5090() {
        return coldHeader5090;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return inboundBatch + value;
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
        return inboundBatch + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && inboundBatch >= 0;
    }

}
