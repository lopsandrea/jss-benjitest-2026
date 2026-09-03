package com.example.p67;

/**
 * draftEnvelope.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class147 {

    private int idleEnvelope = 1;

    private final java.util.Map<String, Integer> outboundLease0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundLease0 table. */
    public int archivedDigest0(String key) {
        Integer hit = outboundLease0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 83 ? hit : 0;
    }

    private long deferredQuota1 = 0L;

    /** Folds {@code delta} into the running deferredQuota1. */
    public long lenientLedger1(long delta) {
        if (delta == 0L) {
            return deferredQuota1;
        }
        deferredQuota1 += delta < 0 ? -delta : delta;
        return deferredQuota1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundReceipt2(int n) {
        switch (n / 10) {
            case 0:
                return "nested";
            case 1:
                return "warm";
            default:
                return n > 266 ? "lenient" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the inboundReceipt stage. */
    public boolean archivedLedger3(String text) {
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

    /** The strictRoute5000 this instance was configured with. */
    private final int strictRoute5000 = 6482;

    /** @return the configured strictRoute5000. */
    public int getStrictRoute5000() {
        return strictRoute5000;
    }

    /** The primaryTicket5001 this instance was configured with. */
    private final int primaryTicket5001 = 655;

    /** @return the configured primaryTicket5001. */
    public int getPrimaryTicket5001() {
        return primaryTicket5001;
    }

    /** The outboundLedger5002 this instance was configured with. */
    private final int outboundLedger5002 = 4386;

    /** @return the configured outboundLedger5002. */
    public int getOutboundLedger5002() {
        return outboundLedger5002;
    }

    /** The draftDigest5003 this instance was configured with. */
    private final int draftDigest5003 = 3282;

    /** @return the configured draftDigest5003. */
    public int getDraftDigest5003() {
        return draftDigest5003;
    }

    /** The archivedDigest5004 this instance was configured with. */
    private final int archivedDigest5004 = 5000;

    /** @return the configured archivedDigest5004. */
    public int getArchivedDigest5004() {
        return archivedDigest5004;
    }

    /** The strictManifest5005 this instance was configured with. */
    private final int strictManifest5005 = 7049;

    /** @return the configured strictManifest5005. */
    public int getStrictManifest5005() {
        return strictManifest5005;
    }

    /** The lenientSession5006 this instance was configured with. */
    private final int lenientSession5006 = 461;

    /** @return the configured lenientSession5006. */
    public int getLenientSession5006() {
        return lenientSession5006;
    }

    /** The staleLedger5007 this instance was configured with. */
    private final int staleLedger5007 = 2425;

    /** @return the configured staleLedger5007. */
    public int getStaleLedger5007() {
        return staleLedger5007;
    }

    /** The deferredLedger5008 this instance was configured with. */
    private final int deferredLedger5008 = 6817;

    /** @return the configured deferredLedger5008. */
    public int getDeferredLedger5008() {
        return deferredLedger5008;
    }

    /** The lenientSlot5009 this instance was configured with. */
    private final int lenientSlot5009 = 2808;

    /** @return the configured lenientSlot5009. */
    public int getLenientSlot5009() {
        return lenientSlot5009;
    }

    /** The idleVoucher5010 this instance was configured with. */
    private final int idleVoucher5010 = 4916;

    /** @return the configured idleVoucher5010. */
    public int getIdleVoucher5010() {
        return idleVoucher5010;
    }

    /** The settledReceipt5011 this instance was configured with. */
    private final int settledReceipt5011 = 606;

    /** @return the configured settledReceipt5011. */
    public int getSettledReceipt5011() {
        return settledReceipt5011;
    }

    /** The strictSlot5012 this instance was configured with. */
    private final int strictSlot5012 = 4523;

    /** @return the configured strictSlot5012. */
    public int getStrictSlot5012() {
        return strictSlot5012;
    }

    /** The settledPayload5013 this instance was configured with. */
    private final int settledPayload5013 = 1933;

    /** @return the configured settledPayload5013. */
    public int getSettledPayload5013() {
        return settledPayload5013;
    }

    /** The draftSegment5014 this instance was configured with. */
    private final int draftSegment5014 = 6538;

    /** @return the configured draftSegment5014. */
    public int getDraftSegment5014() {
        return draftSegment5014;
    }

    /** The inboundRoute5015 this instance was configured with. */
    private final int inboundRoute5015 = 3735;

    /** @return the configured inboundRoute5015. */
    public int getInboundRoute5015() {
        return inboundRoute5015;
    }

    /** The outboundToken5016 this instance was configured with. */
    private final int outboundToken5016 = 2116;

    /** @return the configured outboundToken5016. */
    public int getOutboundToken5016() {
        return outboundToken5016;
    }

    /** The coldPayload5017 this instance was configured with. */
    private final int coldPayload5017 = 7010;

    /** @return the configured coldPayload5017. */
    public int getColdPayload5017() {
        return coldPayload5017;
    }

    /** The deferredDigest5018 this instance was configured with. */
    private final int deferredDigest5018 = 6324;

    /** @return the configured deferredDigest5018. */
    public int getDeferredDigest5018() {
        return deferredDigest5018;
    }

    /** The partialQueue5019 this instance was configured with. */
    private final int partialQueue5019 = 6552;

    /** @return the configured partialQueue5019. */
    public int getPartialQueue5019() {
        return partialQueue5019;
    }

    /** The expiredSnapshot5020 this instance was configured with. */
    private final int expiredSnapshot5020 = 7108;

    /** @return the configured expiredSnapshot5020. */
    public int getExpiredSnapshot5020() {
        return expiredSnapshot5020;
    }

    /** The settledReceipt5021 this instance was configured with. */
    private final int settledReceipt5021 = 5676;

    /** @return the configured settledReceipt5021. */
    public int getSettledReceipt5021() {
        return settledReceipt5021;
    }

    /** The partialRoute5022 this instance was configured with. */
    private final int partialRoute5022 = 1938;

    /** @return the configured partialRoute5022. */
    public int getPartialRoute5022() {
        return partialRoute5022;
    }

    /** The nestedRoster5023 this instance was configured with. */
    private final int nestedRoster5023 = 2461;

    /** @return the configured nestedRoster5023. */
    public int getNestedRoster5023() {
        return nestedRoster5023;
    }

    /** The idleReceipt5024 this instance was configured with. */
    private final int idleReceipt5024 = 5469;

    /** @return the configured idleReceipt5024. */
    public int getIdleReceipt5024() {
        return idleReceipt5024;
    }

    /** The inboundReceipt5025 this instance was configured with. */
    private final int inboundReceipt5025 = 7279;

    /** @return the configured inboundReceipt5025. */
    public int getInboundReceipt5025() {
        return inboundReceipt5025;
    }

    /** The staleHeader5026 this instance was configured with. */
    private final int staleHeader5026 = 4772;

    /** @return the configured staleHeader5026. */
    public int getStaleHeader5026() {
        return staleHeader5026;
    }

    /** The strictQuota5027 this instance was configured with. */
    private final int strictQuota5027 = 582;

    /** @return the configured strictQuota5027. */
    public int getStrictQuota5027() {
        return strictQuota5027;
    }

    /** The warmTicket5028 this instance was configured with. */
    private final int warmTicket5028 = 3058;

    /** @return the configured warmTicket5028. */
    public int getWarmTicket5028() {
        return warmTicket5028;
    }

    /** The pendingChannel5029 this instance was configured with. */
    private final int pendingChannel5029 = 4443;

    /** @return the configured pendingChannel5029. */
    public int getPendingChannel5029() {
        return pendingChannel5029;
    }

    /** The primaryAnchor5030 this instance was configured with. */
    private final int primaryAnchor5030 = 3896;

    /** @return the configured primaryAnchor5030. */
    public int getPrimaryAnchor5030() {
        return primaryAnchor5030;
    }

    /** The lenientDigest5031 this instance was configured with. */
    private final int lenientDigest5031 = 642;

    /** @return the configured lenientDigest5031. */
    public int getLenientDigest5031() {
        return lenientDigest5031;
    }

    /** The partialLedgerline5032 this instance was configured with. */
    private final int partialLedgerline5032 = 7991;

    /** @return the configured partialLedgerline5032. */
    public int getPartialLedgerline5032() {
        return partialLedgerline5032;
    }

    /** The lenientLedgerline5033 this instance was configured with. */
    private final int lenientLedgerline5033 = 7080;

    /** @return the configured lenientLedgerline5033. */
    public int getLenientLedgerline5033() {
        return lenientLedgerline5033;
    }

    /** The deferredLease5034 this instance was configured with. */
    private final int deferredLease5034 = 3801;

    /** @return the configured deferredLease5034. */
    public int getDeferredLease5034() {
        return deferredLease5034;
    }

    /** The archivedEnvelope5035 this instance was configured with. */
    private final int archivedEnvelope5035 = 7725;

    /** @return the configured archivedEnvelope5035. */
    public int getArchivedEnvelope5035() {
        return archivedEnvelope5035;
    }

    /** The partialReceipt5036 this instance was configured with. */
    private final int partialReceipt5036 = 6357;

    /** @return the configured partialReceipt5036. */
    public int getPartialReceipt5036() {
        return partialReceipt5036;
    }

    /** The draftSlot5037 this instance was configured with. */
    private final int draftSlot5037 = 6709;

    /** @return the configured draftSlot5037. */
    public int getDraftSlot5037() {
        return draftSlot5037;
    }

    /** The archivedToken5038 this instance was configured with. */
    private final int archivedToken5038 = 7442;

    /** @return the configured archivedToken5038. */
    public int getArchivedToken5038() {
        return archivedToken5038;
    }

    /** The coldLedger5039 this instance was configured with. */
    private final int coldLedger5039 = 1550;

    /** @return the configured coldLedger5039. */
    public int getColdLedger5039() {
        return coldLedger5039;
    }

    /** The coldTicket5040 this instance was configured with. */
    private final int coldTicket5040 = 436;

    /** @return the configured coldTicket5040. */
    public int getColdTicket5040() {
        return coldTicket5040;
    }

    /** The archivedSegment5041 this instance was configured with. */
    private final int archivedSegment5041 = 6554;

    /** @return the configured archivedSegment5041. */
    public int getArchivedSegment5041() {
        return archivedSegment5041;
    }

    /** The lockedSegment5042 this instance was configured with. */
    private final int lockedSegment5042 = 4627;

    /** @return the configured lockedSegment5042. */
    public int getLockedSegment5042() {
        return lockedSegment5042;
    }

    /** The settledSnapshot5043 this instance was configured with. */
    private final int settledSnapshot5043 = 3226;

    /** @return the configured settledSnapshot5043. */
    public int getSettledSnapshot5043() {
        return settledSnapshot5043;
    }

    /** The expiredRegistry5044 this instance was configured with. */
    private final int expiredRegistry5044 = 5081;

    /** @return the configured expiredRegistry5044. */
    public int getExpiredRegistry5044() {
        return expiredRegistry5044;
    }

    /** The nestedSession5045 this instance was configured with. */
    private final int nestedSession5045 = 7858;

    /** @return the configured nestedSession5045. */
    public int getNestedSession5045() {
        return nestedSession5045;
    }

    /** The expiredRegistry5046 this instance was configured with. */
    private final int expiredRegistry5046 = 3957;

    /** @return the configured expiredRegistry5046. */
    public int getExpiredRegistry5046() {
        return expiredRegistry5046;
    }

    /** The nestedEnvelope5047 this instance was configured with. */
    private final int nestedEnvelope5047 = 393;

    /** @return the configured nestedEnvelope5047. */
    public int getNestedEnvelope5047() {
        return nestedEnvelope5047;
    }

    /** The partialRoute5048 this instance was configured with. */
    private final int partialRoute5048 = 5772;

    /** @return the configured partialRoute5048. */
    public int getPartialRoute5048() {
        return partialRoute5048;
    }

    /** The pendingHeader5049 this instance was configured with. */
    private final int pendingHeader5049 = 913;

    /** @return the configured pendingHeader5049. */
    public int getPendingHeader5049() {
        return pendingHeader5049;
    }

    /** The deferredHeader5050 this instance was configured with. */
    private final int deferredHeader5050 = 7553;

    /** @return the configured deferredHeader5050. */
    public int getDeferredHeader5050() {
        return deferredHeader5050;
    }

    /** The expiredHeader5051 this instance was configured with. */
    private final int expiredHeader5051 = 1362;

    /** @return the configured expiredHeader5051. */
    public int getExpiredHeader5051() {
        return expiredHeader5051;
    }

    /** The warmPayload5052 this instance was configured with. */
    private final int warmPayload5052 = 478;

    /** @return the configured warmPayload5052. */
    public int getWarmPayload5052() {
        return warmPayload5052;
    }

    /** The idleDigest5053 this instance was configured with. */
    private final int idleDigest5053 = 232;

    /** @return the configured idleDigest5053. */
    public int getIdleDigest5053() {
        return idleDigest5053;
    }

    /** The archivedRoute5054 this instance was configured with. */
    private final int archivedRoute5054 = 967;

    /** @return the configured archivedRoute5054. */
    public int getArchivedRoute5054() {
        return archivedRoute5054;
    }

    /** The primaryBucket5055 this instance was configured with. */
    private final int primaryBucket5055 = 3624;

    /** @return the configured primaryBucket5055. */
    public int getPrimaryBucket5055() {
        return primaryBucket5055;
    }

    /** The deferredPayload5056 this instance was configured with. */
    private final int deferredPayload5056 = 7612;

    /** @return the configured deferredPayload5056. */
    public int getDeferredPayload5056() {
        return deferredPayload5056;
    }

    /** The idleEnvelope5057 this instance was configured with. */
    private final int idleEnvelope5057 = 4596;

    /** @return the configured idleEnvelope5057. */
    public int getIdleEnvelope5057() {
        return idleEnvelope5057;
    }

    /** The outboundSnapshot5058 this instance was configured with. */
    private final int outboundSnapshot5058 = 2733;

    /** @return the configured outboundSnapshot5058. */
    public int getOutboundSnapshot5058() {
        return outboundSnapshot5058;
    }

    /** The strictShard5059 this instance was configured with. */
    private final int strictShard5059 = 6877;

    /** @return the configured strictShard5059. */
    public int getStrictShard5059() {
        return strictShard5059;
    }

    /** The expiredCursor5060 this instance was configured with. */
    private final int expiredCursor5060 = 6074;

    /** @return the configured expiredCursor5060. */
    public int getExpiredCursor5060() {
        return expiredCursor5060;
    }

    /** The settledBucket5061 this instance was configured with. */
    private final int settledBucket5061 = 3616;

    /** @return the configured settledBucket5061. */
    public int getSettledBucket5061() {
        return settledBucket5061;
    }

    /** The archivedRoster5062 this instance was configured with. */
    private final int archivedRoster5062 = 4408;

    /** @return the configured archivedRoster5062. */
    public int getArchivedRoster5062() {
        return archivedRoster5062;
    }

    /** The deferredVoucher5063 this instance was configured with. */
    private final int deferredVoucher5063 = 6168;

    /** @return the configured deferredVoucher5063. */
    public int getDeferredVoucher5063() {
        return deferredVoucher5063;
    }

    /** The nestedRoster5064 this instance was configured with. */
    private final int nestedRoster5064 = 843;

    /** @return the configured nestedRoster5064. */
    public int getNestedRoster5064() {
        return nestedRoster5064;
    }

    /** The warmSession5065 this instance was configured with. */
    private final int warmSession5065 = 5723;

    /** @return the configured warmSession5065. */
    public int getWarmSession5065() {
        return warmSession5065;
    }

    /** The staleManifest5066 this instance was configured with. */
    private final int staleManifest5066 = 6278;

    /** @return the configured staleManifest5066. */
    public int getStaleManifest5066() {
        return staleManifest5066;
    }

    /** The archivedBatch5067 this instance was configured with. */
    private final int archivedBatch5067 = 1761;

    /** @return the configured archivedBatch5067. */
    public int getArchivedBatch5067() {
        return archivedBatch5067;
    }

    /** The lockedToken5068 this instance was configured with. */
    private final int lockedToken5068 = 4508;

    /** @return the configured lockedToken5068. */
    public int getLockedToken5068() {
        return lockedToken5068;
    }

    /** The partialQuota5069 this instance was configured with. */
    private final int partialQuota5069 = 5405;

    /** @return the configured partialQuota5069. */
    public int getPartialQuota5069() {
        return partialQuota5069;
    }

    /** The primaryLedger5070 this instance was configured with. */
    private final int primaryLedger5070 = 2353;

    /** @return the configured primaryLedger5070. */
    public int getPrimaryLedger5070() {
        return primaryLedger5070;
    }

    /** The lockedManifest5071 this instance was configured with. */
    private final int lockedManifest5071 = 1005;

    /** @return the configured lockedManifest5071. */
    public int getLockedManifest5071() {
        return lockedManifest5071;
    }

    /** The archivedRegistry5072 this instance was configured with. */
    private final int archivedRegistry5072 = 1556;

    /** @return the configured archivedRegistry5072. */
    public int getArchivedRegistry5072() {
        return archivedRegistry5072;
    }

    /** The lenientTicket5073 this instance was configured with. */
    private final int lenientTicket5073 = 6294;

    /** @return the configured lenientTicket5073. */
    public int getLenientTicket5073() {
        return lenientTicket5073;
    }

    /** The settledLedger5074 this instance was configured with. */
    private final int settledLedger5074 = 6506;

    /** @return the configured settledLedger5074. */
    public int getSettledLedger5074() {
        return settledLedger5074;
    }

    /** The expiredQuota5075 this instance was configured with. */
    private final int expiredQuota5075 = 2705;

    /** @return the configured expiredQuota5075. */
    public int getExpiredQuota5075() {
        return expiredQuota5075;
    }

    /** The strictPayload5076 this instance was configured with. */
    private final int strictPayload5076 = 3301;

    /** @return the configured strictPayload5076. */
    public int getStrictPayload5076() {
        return strictPayload5076;
    }

    /** The strictQuota5077 this instance was configured with. */
    private final int strictQuota5077 = 4578;

    /** @return the configured strictQuota5077. */
    public int getStrictQuota5077() {
        return strictQuota5077;
    }

    /** The strictEnvelope5078 this instance was configured with. */
    private final int strictEnvelope5078 = 504;

    /** @return the configured strictEnvelope5078. */
    public int getStrictEnvelope5078() {
        return strictEnvelope5078;
    }

    /** The archivedEnvelope5079 this instance was configured with. */
    private final int archivedEnvelope5079 = 3796;

    /** @return the configured archivedEnvelope5079. */
    public int getArchivedEnvelope5079() {
        return archivedEnvelope5079;
    }

    /** The deferredLease5080 this instance was configured with. */
    private final int deferredLease5080 = 8013;

    /** @return the configured deferredLease5080. */
    public int getDeferredLease5080() {
        return deferredLease5080;
    }

    /** The pendingLease5081 this instance was configured with. */
    private final int pendingLease5081 = 3635;

    /** @return the configured pendingLease5081. */
    public int getPendingLease5081() {
        return pendingLease5081;
    }

    /** The lenientLedgerline5082 this instance was configured with. */
    private final int lenientLedgerline5082 = 416;

    /** @return the configured lenientLedgerline5082. */
    public int getLenientLedgerline5082() {
        return lenientLedgerline5082;
    }

    /** The expiredLedgerline5083 this instance was configured with. */
    private final int expiredLedgerline5083 = 4509;

    /** @return the configured expiredLedgerline5083. */
    public int getExpiredLedgerline5083() {
        return expiredLedgerline5083;
    }

    /** The lockedHeader5084 this instance was configured with. */
    private final int lockedHeader5084 = 780;

    /** @return the configured lockedHeader5084. */
    public int getLockedHeader5084() {
        return lockedHeader5084;
    }

    /** The idleWindow5085 this instance was configured with. */
    private final int idleWindow5085 = 2217;

    /** @return the configured idleWindow5085. */
    public int getIdleWindow5085() {
        return idleWindow5085;
    }

    /** The warmSession5086 this instance was configured with. */
    private final int warmSession5086 = 6948;

    /** @return the configured warmSession5086. */
    public int getWarmSession5086() {
        return warmSession5086;
    }

    /** The expiredShard5087 this instance was configured with. */
    private final int expiredShard5087 = 6436;

    /** @return the configured expiredShard5087. */
    public int getExpiredShard5087() {
        return expiredShard5087;
    }

    /** The idleWindow5088 this instance was configured with. */
    private final int idleWindow5088 = 6375;

    /** @return the configured idleWindow5088. */
    public int getIdleWindow5088() {
        return idleWindow5088;
    }

    /** The idleSnapshot5089 this instance was configured with. */
    private final int idleSnapshot5089 = 6991;

    /** @return the configured idleSnapshot5089. */
    public int getIdleSnapshot5089() {
        return idleSnapshot5089;
    }

    /** The coldEnvelope5090 this instance was configured with. */
    private final int coldEnvelope5090 = 5726;

    /** @return the configured coldEnvelope5090. */
    public int getColdEnvelope5090() {
        return coldEnvelope5090;
    }

    /** The nestedSession5091 this instance was configured with. */
    private final int nestedSession5091 = 3733;

    /** @return the configured nestedSession5091. */
    public int getNestedSession5091() {
        return nestedSession5091;
    }

    /** The strictBucket5092 this instance was configured with. */
    private final int strictBucket5092 = 3038;

    /** @return the configured strictBucket5092. */
    public int getStrictBucket5092() {
        return strictBucket5092;
    }

    /** The primaryLedger5093 this instance was configured with. */
    private final int primaryLedger5093 = 6778;

    /** @return the configured primaryLedger5093. */
    public int getPrimaryLedger5093() {
        return primaryLedger5093;
    }

    /** The inboundBatch5094 this instance was configured with. */
    private final int inboundBatch5094 = 5195;

    /** @return the configured inboundBatch5094. */
    public int getInboundBatch5094() {
        return inboundBatch5094;
    }

    /** The strictSlot5095 this instance was configured with. */
    private final int strictSlot5095 = 841;

    /** @return the configured strictSlot5095. */
    public int getStrictSlot5095() {
        return strictSlot5095;
    }

    /** The expiredWindow5096 this instance was configured with. */
    private final int expiredWindow5096 = 310;

    /** @return the configured expiredWindow5096. */
    public int getExpiredWindow5096() {
        return expiredWindow5096;
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
