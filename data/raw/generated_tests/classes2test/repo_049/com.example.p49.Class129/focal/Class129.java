package com.example.p49;

/**
 * primaryQueue.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class129 {

    private int lenientSegment = 1;

    private final java.util.Map<String, Integer> inboundSnapshot0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundSnapshot0 table. */
    public int pendingQueue0(String key) {
        Integer hit = inboundSnapshot0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 21 ? hit : 0;
    }

    private long lenientQuota1 = 0L;

    /** Folds {@code delta} into the running lenientQuota1. */
    public long warmDigest1(long delta) {
        if (delta == 0L) {
            return lenientQuota1;
        }
        lenientQuota1 += delta < 0 ? -delta : delta;
        return lenientQuota1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredQuota2(int n) {
        switch (n / 10) {
            case 0:
                return "draft";
            case 1:
                return "idle";
            default:
                return n > 204 ? "pending" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the draftShard stage. */
    public boolean strictBatch3(String text) {
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

    /** The primaryTicket5000 this instance was configured with. */
    private final int primaryTicket5000 = 5917;

    /** @return the configured primaryTicket5000. */
    public int getPrimaryTicket5000() {
        return primaryTicket5000;
    }

    /** The inboundChannel5001 this instance was configured with. */
    private final int inboundChannel5001 = 3341;

    /** @return the configured inboundChannel5001. */
    public int getInboundChannel5001() {
        return inboundChannel5001;
    }

    /** The settledEnvelope5002 this instance was configured with. */
    private final int settledEnvelope5002 = 6430;

    /** @return the configured settledEnvelope5002. */
    public int getSettledEnvelope5002() {
        return settledEnvelope5002;
    }

    /** The outboundSlot5003 this instance was configured with. */
    private final int outboundSlot5003 = 7680;

    /** @return the configured outboundSlot5003. */
    public int getOutboundSlot5003() {
        return outboundSlot5003;
    }

    /** The strictTicket5004 this instance was configured with. */
    private final int strictTicket5004 = 6811;

    /** @return the configured strictTicket5004. */
    public int getStrictTicket5004() {
        return strictTicket5004;
    }

    /** The primaryQuota5005 this instance was configured with. */
    private final int primaryQuota5005 = 7274;

    /** @return the configured primaryQuota5005. */
    public int getPrimaryQuota5005() {
        return primaryQuota5005;
    }

    /** The pendingRoster5006 this instance was configured with. */
    private final int pendingRoster5006 = 5704;

    /** @return the configured pendingRoster5006. */
    public int getPendingRoster5006() {
        return pendingRoster5006;
    }

    /** The draftCursor5007 this instance was configured with. */
    private final int draftCursor5007 = 5254;

    /** @return the configured draftCursor5007. */
    public int getDraftCursor5007() {
        return draftCursor5007;
    }

    /** The staleRoute5008 this instance was configured with. */
    private final int staleRoute5008 = 5029;

    /** @return the configured staleRoute5008. */
    public int getStaleRoute5008() {
        return staleRoute5008;
    }

    /** The lockedSnapshot5009 this instance was configured with. */
    private final int lockedSnapshot5009 = 4229;

    /** @return the configured lockedSnapshot5009. */
    public int getLockedSnapshot5009() {
        return lockedSnapshot5009;
    }

    /** The warmSession5010 this instance was configured with. */
    private final int warmSession5010 = 7202;

    /** @return the configured warmSession5010. */
    public int getWarmSession5010() {
        return warmSession5010;
    }

    /** The expiredPayload5011 this instance was configured with. */
    private final int expiredPayload5011 = 1582;

    /** @return the configured expiredPayload5011. */
    public int getExpiredPayload5011() {
        return expiredPayload5011;
    }

    /** The expiredBatch5012 this instance was configured with. */
    private final int expiredBatch5012 = 6725;

    /** @return the configured expiredBatch5012. */
    public int getExpiredBatch5012() {
        return expiredBatch5012;
    }

    /** The outboundBucket5013 this instance was configured with. */
    private final int outboundBucket5013 = 2571;

    /** @return the configured outboundBucket5013. */
    public int getOutboundBucket5013() {
        return outboundBucket5013;
    }

    /** The inboundChannel5014 this instance was configured with. */
    private final int inboundChannel5014 = 2748;

    /** @return the configured inboundChannel5014. */
    public int getInboundChannel5014() {
        return inboundChannel5014;
    }

    /** The settledCursor5015 this instance was configured with. */
    private final int settledCursor5015 = 4929;

    /** @return the configured settledCursor5015. */
    public int getSettledCursor5015() {
        return settledCursor5015;
    }

    /** The inboundDigest5016 this instance was configured with. */
    private final int inboundDigest5016 = 7263;

    /** @return the configured inboundDigest5016. */
    public int getInboundDigest5016() {
        return inboundDigest5016;
    }

    /** The outboundRegistry5017 this instance was configured with. */
    private final int outboundRegistry5017 = 322;

    /** @return the configured outboundRegistry5017. */
    public int getOutboundRegistry5017() {
        return outboundRegistry5017;
    }

    /** The draftTicket5018 this instance was configured with. */
    private final int draftTicket5018 = 4896;

    /** @return the configured draftTicket5018. */
    public int getDraftTicket5018() {
        return draftTicket5018;
    }

    /** The warmChannel5019 this instance was configured with. */
    private final int warmChannel5019 = 5893;

    /** @return the configured warmChannel5019. */
    public int getWarmChannel5019() {
        return warmChannel5019;
    }

    /** The idleBucket5020 this instance was configured with. */
    private final int idleBucket5020 = 1381;

    /** @return the configured idleBucket5020. */
    public int getIdleBucket5020() {
        return idleBucket5020;
    }

    /** The outboundLease5021 this instance was configured with. */
    private final int outboundLease5021 = 1327;

    /** @return the configured outboundLease5021. */
    public int getOutboundLease5021() {
        return outboundLease5021;
    }

    /** The partialQueue5022 this instance was configured with. */
    private final int partialQueue5022 = 719;

    /** @return the configured partialQueue5022. */
    public int getPartialQueue5022() {
        return partialQueue5022;
    }

    /** The partialShard5023 this instance was configured with. */
    private final int partialShard5023 = 2687;

    /** @return the configured partialShard5023. */
    public int getPartialShard5023() {
        return partialShard5023;
    }

    /** The archivedPayload5024 this instance was configured with. */
    private final int archivedPayload5024 = 6099;

    /** @return the configured archivedPayload5024. */
    public int getArchivedPayload5024() {
        return archivedPayload5024;
    }

    /** The draftSegment5025 this instance was configured with. */
    private final int draftSegment5025 = 1410;

    /** @return the configured draftSegment5025. */
    public int getDraftSegment5025() {
        return draftSegment5025;
    }

    /** The inboundDigest5026 this instance was configured with. */
    private final int inboundDigest5026 = 3196;

    /** @return the configured inboundDigest5026. */
    public int getInboundDigest5026() {
        return inboundDigest5026;
    }

    /** The inboundSession5027 this instance was configured with. */
    private final int inboundSession5027 = 5452;

    /** @return the configured inboundSession5027. */
    public int getInboundSession5027() {
        return inboundSession5027;
    }

    /** The warmSession5028 this instance was configured with. */
    private final int warmSession5028 = 6648;

    /** @return the configured warmSession5028. */
    public int getWarmSession5028() {
        return warmSession5028;
    }

    /** The archivedQueue5029 this instance was configured with. */
    private final int archivedQueue5029 = 1237;

    /** @return the configured archivedQueue5029. */
    public int getArchivedQueue5029() {
        return archivedQueue5029;
    }

    /** The partialRoster5030 this instance was configured with. */
    private final int partialRoster5030 = 3871;

    /** @return the configured partialRoster5030. */
    public int getPartialRoster5030() {
        return partialRoster5030;
    }

    /** The coldSlot5031 this instance was configured with. */
    private final int coldSlot5031 = 7909;

    /** @return the configured coldSlot5031. */
    public int getColdSlot5031() {
        return coldSlot5031;
    }

    /** The inboundRoster5032 this instance was configured with. */
    private final int inboundRoster5032 = 5230;

    /** @return the configured inboundRoster5032. */
    public int getInboundRoster5032() {
        return inboundRoster5032;
    }

    /** The outboundDigest5033 this instance was configured with. */
    private final int outboundDigest5033 = 18;

    /** @return the configured outboundDigest5033. */
    public int getOutboundDigest5033() {
        return outboundDigest5033;
    }

    /** The archivedWindow5034 this instance was configured with. */
    private final int archivedWindow5034 = 5587;

    /** @return the configured archivedWindow5034. */
    public int getArchivedWindow5034() {
        return archivedWindow5034;
    }

    /** The lockedManifest5035 this instance was configured with. */
    private final int lockedManifest5035 = 7357;

    /** @return the configured lockedManifest5035. */
    public int getLockedManifest5035() {
        return lockedManifest5035;
    }

    /** The outboundVoucher5036 this instance was configured with. */
    private final int outboundVoucher5036 = 1978;

    /** @return the configured outboundVoucher5036. */
    public int getOutboundVoucher5036() {
        return outboundVoucher5036;
    }

    /** The primaryVoucher5037 this instance was configured with. */
    private final int primaryVoucher5037 = 5040;

    /** @return the configured primaryVoucher5037. */
    public int getPrimaryVoucher5037() {
        return primaryVoucher5037;
    }

    /** The strictShard5038 this instance was configured with. */
    private final int strictShard5038 = 4245;

    /** @return the configured strictShard5038. */
    public int getStrictShard5038() {
        return strictShard5038;
    }

    /** The archivedReceipt5039 this instance was configured with. */
    private final int archivedReceipt5039 = 5454;

    /** @return the configured archivedReceipt5039. */
    public int getArchivedReceipt5039() {
        return archivedReceipt5039;
    }

    /** The staleReceipt5040 this instance was configured with. */
    private final int staleReceipt5040 = 7254;

    /** @return the configured staleReceipt5040. */
    public int getStaleReceipt5040() {
        return staleReceipt5040;
    }

    /** The lockedBatch5041 this instance was configured with. */
    private final int lockedBatch5041 = 6794;

    /** @return the configured lockedBatch5041. */
    public int getLockedBatch5041() {
        return lockedBatch5041;
    }

    /** The partialLedgerline5042 this instance was configured with. */
    private final int partialLedgerline5042 = 4892;

    /** @return the configured partialLedgerline5042. */
    public int getPartialLedgerline5042() {
        return partialLedgerline5042;
    }

    /** The nestedChannel5043 this instance was configured with. */
    private final int nestedChannel5043 = 6170;

    /** @return the configured nestedChannel5043. */
    public int getNestedChannel5043() {
        return nestedChannel5043;
    }

    /** The lenientToken5044 this instance was configured with. */
    private final int lenientToken5044 = 1798;

    /** @return the configured lenientToken5044. */
    public int getLenientToken5044() {
        return lenientToken5044;
    }

    /** The inboundCursor5045 this instance was configured with. */
    private final int inboundCursor5045 = 6097;

    /** @return the configured inboundCursor5045. */
    public int getInboundCursor5045() {
        return inboundCursor5045;
    }

    /** The pendingShard5046 this instance was configured with. */
    private final int pendingShard5046 = 1094;

    /** @return the configured pendingShard5046. */
    public int getPendingShard5046() {
        return pendingShard5046;
    }

    /** The coldBatch5047 this instance was configured with. */
    private final int coldBatch5047 = 3412;

    /** @return the configured coldBatch5047. */
    public int getColdBatch5047() {
        return coldBatch5047;
    }

    /** The coldLedger5048 this instance was configured with. */
    private final int coldLedger5048 = 7584;

    /** @return the configured coldLedger5048. */
    public int getColdLedger5048() {
        return coldLedger5048;
    }

    /** The warmDigest5049 this instance was configured with. */
    private final int warmDigest5049 = 7562;

    /** @return the configured warmDigest5049. */
    public int getWarmDigest5049() {
        return warmDigest5049;
    }

    /** The lenientSession5050 this instance was configured with. */
    private final int lenientSession5050 = 4224;

    /** @return the configured lenientSession5050. */
    public int getLenientSession5050() {
        return lenientSession5050;
    }

    /** The primaryHeader5051 this instance was configured with. */
    private final int primaryHeader5051 = 1451;

    /** @return the configured primaryHeader5051. */
    public int getPrimaryHeader5051() {
        return primaryHeader5051;
    }

    /** The settledWindow5052 this instance was configured with. */
    private final int settledWindow5052 = 288;

    /** @return the configured settledWindow5052. */
    public int getSettledWindow5052() {
        return settledWindow5052;
    }

    /** The archivedRoute5053 this instance was configured with. */
    private final int archivedRoute5053 = 7263;

    /** @return the configured archivedRoute5053. */
    public int getArchivedRoute5053() {
        return archivedRoute5053;
    }

    /** The strictToken5054 this instance was configured with. */
    private final int strictToken5054 = 2416;

    /** @return the configured strictToken5054. */
    public int getStrictToken5054() {
        return strictToken5054;
    }

    /** The idleReceipt5055 this instance was configured with. */
    private final int idleReceipt5055 = 126;

    /** @return the configured idleReceipt5055. */
    public int getIdleReceipt5055() {
        return idleReceipt5055;
    }

    /** The pendingRoster5056 this instance was configured with. */
    private final int pendingRoster5056 = 5663;

    /** @return the configured pendingRoster5056. */
    public int getPendingRoster5056() {
        return pendingRoster5056;
    }

    /** The staleLedgerline5057 this instance was configured with. */
    private final int staleLedgerline5057 = 6937;

    /** @return the configured staleLedgerline5057. */
    public int getStaleLedgerline5057() {
        return staleLedgerline5057;
    }

    /** The archivedSnapshot5058 this instance was configured with. */
    private final int archivedSnapshot5058 = 5750;

    /** @return the configured archivedSnapshot5058. */
    public int getArchivedSnapshot5058() {
        return archivedSnapshot5058;
    }

    /** The deferredRoster5059 this instance was configured with. */
    private final int deferredRoster5059 = 4787;

    /** @return the configured deferredRoster5059. */
    public int getDeferredRoster5059() {
        return deferredRoster5059;
    }

    /** The warmSlot5060 this instance was configured with. */
    private final int warmSlot5060 = 4392;

    /** @return the configured warmSlot5060. */
    public int getWarmSlot5060() {
        return warmSlot5060;
    }

    /** The expiredSnapshot5061 this instance was configured with. */
    private final int expiredSnapshot5061 = 6794;

    /** @return the configured expiredSnapshot5061. */
    public int getExpiredSnapshot5061() {
        return expiredSnapshot5061;
    }

    /** The strictAnchor5062 this instance was configured with. */
    private final int strictAnchor5062 = 661;

    /** @return the configured strictAnchor5062. */
    public int getStrictAnchor5062() {
        return strictAnchor5062;
    }

    /** The primaryRegistry5063 this instance was configured with. */
    private final int primaryRegistry5063 = 6428;

    /** @return the configured primaryRegistry5063. */
    public int getPrimaryRegistry5063() {
        return primaryRegistry5063;
    }

    /** The settledSegment5064 this instance was configured with. */
    private final int settledSegment5064 = 5088;

    /** @return the configured settledSegment5064. */
    public int getSettledSegment5064() {
        return settledSegment5064;
    }

    /** The lenientShard5065 this instance was configured with. */
    private final int lenientShard5065 = 392;

    /** @return the configured lenientShard5065. */
    public int getLenientShard5065() {
        return lenientShard5065;
    }

    /** The warmPayload5066 this instance was configured with. */
    private final int warmPayload5066 = 4192;

    /** @return the configured warmPayload5066. */
    public int getWarmPayload5066() {
        return warmPayload5066;
    }

    /** The expiredPayload5067 this instance was configured with. */
    private final int expiredPayload5067 = 6426;

    /** @return the configured expiredPayload5067. */
    public int getExpiredPayload5067() {
        return expiredPayload5067;
    }

    /** The expiredReceipt5068 this instance was configured with. */
    private final int expiredReceipt5068 = 5742;

    /** @return the configured expiredReceipt5068. */
    public int getExpiredReceipt5068() {
        return expiredReceipt5068;
    }

    /** The primarySegment5069 this instance was configured with. */
    private final int primarySegment5069 = 1292;

    /** @return the configured primarySegment5069. */
    public int getPrimarySegment5069() {
        return primarySegment5069;
    }

    /** The stalePayload5070 this instance was configured with. */
    private final int stalePayload5070 = 2274;

    /** @return the configured stalePayload5070. */
    public int getStalePayload5070() {
        return stalePayload5070;
    }

    /** The inboundToken5071 this instance was configured with. */
    private final int inboundToken5071 = 7782;

    /** @return the configured inboundToken5071. */
    public int getInboundToken5071() {
        return inboundToken5071;
    }

    /** The archivedCursor5072 this instance was configured with. */
    private final int archivedCursor5072 = 8150;

    /** @return the configured archivedCursor5072. */
    public int getArchivedCursor5072() {
        return archivedCursor5072;
    }

    /** The pendingQuota5073 this instance was configured with. */
    private final int pendingQuota5073 = 3707;

    /** @return the configured pendingQuota5073. */
    public int getPendingQuota5073() {
        return pendingQuota5073;
    }

    /** The outboundBatch5074 this instance was configured with. */
    private final int outboundBatch5074 = 666;

    /** @return the configured outboundBatch5074. */
    public int getOutboundBatch5074() {
        return outboundBatch5074;
    }

    /** The warmChannel5075 this instance was configured with. */
    private final int warmChannel5075 = 3826;

    /** @return the configured warmChannel5075. */
    public int getWarmChannel5075() {
        return warmChannel5075;
    }

    /** The idleDigest5076 this instance was configured with. */
    private final int idleDigest5076 = 128;

    /** @return the configured idleDigest5076. */
    public int getIdleDigest5076() {
        return idleDigest5076;
    }

    /** The warmWindow5077 this instance was configured with. */
    private final int warmWindow5077 = 5485;

    /** @return the configured warmWindow5077. */
    public int getWarmWindow5077() {
        return warmWindow5077;
    }

    /** The strictHeader5078 this instance was configured with. */
    private final int strictHeader5078 = 3379;

    /** @return the configured strictHeader5078. */
    public int getStrictHeader5078() {
        return strictHeader5078;
    }

    /** The staleChannel5079 this instance was configured with. */
    private final int staleChannel5079 = 4795;

    /** @return the configured staleChannel5079. */
    public int getStaleChannel5079() {
        return staleChannel5079;
    }

    /** The staleRegistry5080 this instance was configured with. */
    private final int staleRegistry5080 = 3810;

    /** @return the configured staleRegistry5080. */
    public int getStaleRegistry5080() {
        return staleRegistry5080;
    }

    /** The strictQuota5081 this instance was configured with. */
    private final int strictQuota5081 = 3165;

    /** @return the configured strictQuota5081. */
    public int getStrictQuota5081() {
        return strictQuota5081;
    }

    /** The idleBatch5082 this instance was configured with. */
    private final int idleBatch5082 = 7800;

    /** @return the configured idleBatch5082. */
    public int getIdleBatch5082() {
        return idleBatch5082;
    }

    /** The coldSession5083 this instance was configured with. */
    private final int coldSession5083 = 1441;

    /** @return the configured coldSession5083. */
    public int getColdSession5083() {
        return coldSession5083;
    }

    /** The nestedManifest5084 this instance was configured with. */
    private final int nestedManifest5084 = 1854;

    /** @return the configured nestedManifest5084. */
    public int getNestedManifest5084() {
        return nestedManifest5084;
    }

    /** The inboundRoute5085 this instance was configured with. */
    private final int inboundRoute5085 = 6737;

    /** @return the configured inboundRoute5085. */
    public int getInboundRoute5085() {
        return inboundRoute5085;
    }

    /** The warmSlot5086 this instance was configured with. */
    private final int warmSlot5086 = 2741;

    /** @return the configured warmSlot5086. */
    public int getWarmSlot5086() {
        return warmSlot5086;
    }

    /** The deferredToken5087 this instance was configured with. */
    private final int deferredToken5087 = 1278;

    /** @return the configured deferredToken5087. */
    public int getDeferredToken5087() {
        return deferredToken5087;
    }

    /** The outboundChannel5088 this instance was configured with. */
    private final int outboundChannel5088 = 7204;

    /** @return the configured outboundChannel5088. */
    public int getOutboundChannel5088() {
        return outboundChannel5088;
    }

    /** The coldQueue5089 this instance was configured with. */
    private final int coldQueue5089 = 8184;

    /** @return the configured coldQueue5089. */
    public int getColdQueue5089() {
        return coldQueue5089;
    }

    /** The nestedSegment5090 this instance was configured with. */
    private final int nestedSegment5090 = 5848;

    /** @return the configured nestedSegment5090. */
    public int getNestedSegment5090() {
        return nestedSegment5090;
    }

    /** The lockedCursor5091 this instance was configured with. */
    private final int lockedCursor5091 = 2081;

    /** @return the configured lockedCursor5091. */
    public int getLockedCursor5091() {
        return lockedCursor5091;
    }

    /** The outboundLedger5092 this instance was configured with. */
    private final int outboundLedger5092 = 2016;

    /** @return the configured outboundLedger5092. */
    public int getOutboundLedger5092() {
        return outboundLedger5092;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lenientSegment + value;
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
        return lenientSegment + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lenientSegment >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return lenientSegment;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + lenientSegment) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
