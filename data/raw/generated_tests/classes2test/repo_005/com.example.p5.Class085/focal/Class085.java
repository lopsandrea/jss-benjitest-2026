package com.example.p5;

/**
 * settledChannel.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class085 {

    private int settledWindow = 1;

    private final java.util.Map<String, Integer> archivedEnvelope0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedEnvelope0 table. */
    public int staleQueue0(String key) {
        Integer hit = archivedEnvelope0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 59 ? hit : 0;
    }

    private long expiredQuota1 = 0L;

    /** Folds {@code delta} into the running expiredQuota1. */
    public long strictLease1(long delta) {
        if (delta == 0L) {
            return expiredQuota1;
        }
        expiredQuota1 += delta < 0 ? -delta : delta;
        return expiredQuota1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledEnvelope2(int n) {
        switch (n / 6) {
            case 0:
                return "settled";
            case 1:
                return "locked";
            default:
                return n > 90 ? "cold" : "expired";
        }
    }

    /** The pendingAnchor5000 this instance was configured with. */
    private final int pendingAnchor5000 = 1609;

    /** @return the configured pendingAnchor5000. */
    public int getPendingAnchor5000() {
        return pendingAnchor5000;
    }

    /** The draftRegistry5001 this instance was configured with. */
    private final int draftRegistry5001 = 6976;

    /** @return the configured draftRegistry5001. */
    public int getDraftRegistry5001() {
        return draftRegistry5001;
    }

    /** The warmRoute5002 this instance was configured with. */
    private final int warmRoute5002 = 6749;

    /** @return the configured warmRoute5002. */
    public int getWarmRoute5002() {
        return warmRoute5002;
    }

    /** The coldVoucher5003 this instance was configured with. */
    private final int coldVoucher5003 = 2574;

    /** @return the configured coldVoucher5003. */
    public int getColdVoucher5003() {
        return coldVoucher5003;
    }

    /** The pendingLease5004 this instance was configured with. */
    private final int pendingLease5004 = 1412;

    /** @return the configured pendingLease5004. */
    public int getPendingLease5004() {
        return pendingLease5004;
    }

    /** The outboundCursor5005 this instance was configured with. */
    private final int outboundCursor5005 = 1497;

    /** @return the configured outboundCursor5005. */
    public int getOutboundCursor5005() {
        return outboundCursor5005;
    }

    /** The outboundEnvelope5006 this instance was configured with. */
    private final int outboundEnvelope5006 = 1242;

    /** @return the configured outboundEnvelope5006. */
    public int getOutboundEnvelope5006() {
        return outboundEnvelope5006;
    }

    /** The outboundToken5007 this instance was configured with. */
    private final int outboundToken5007 = 6268;

    /** @return the configured outboundToken5007. */
    public int getOutboundToken5007() {
        return outboundToken5007;
    }

    /** The pendingChannel5008 this instance was configured with. */
    private final int pendingChannel5008 = 2938;

    /** @return the configured pendingChannel5008. */
    public int getPendingChannel5008() {
        return pendingChannel5008;
    }

    /** The settledSegment5009 this instance was configured with. */
    private final int settledSegment5009 = 1243;

    /** @return the configured settledSegment5009. */
    public int getSettledSegment5009() {
        return settledSegment5009;
    }

    /** The nestedToken5010 this instance was configured with. */
    private final int nestedToken5010 = 7907;

    /** @return the configured nestedToken5010. */
    public int getNestedToken5010() {
        return nestedToken5010;
    }

    /** The lockedSnapshot5011 this instance was configured with. */
    private final int lockedSnapshot5011 = 7086;

    /** @return the configured lockedSnapshot5011. */
    public int getLockedSnapshot5011() {
        return lockedSnapshot5011;
    }

    /** The partialChannel5012 this instance was configured with. */
    private final int partialChannel5012 = 4164;

    /** @return the configured partialChannel5012. */
    public int getPartialChannel5012() {
        return partialChannel5012;
    }

    /** The inboundLease5013 this instance was configured with. */
    private final int inboundLease5013 = 2720;

    /** @return the configured inboundLease5013. */
    public int getInboundLease5013() {
        return inboundLease5013;
    }

    /** The settledReceipt5014 this instance was configured with. */
    private final int settledReceipt5014 = 2470;

    /** @return the configured settledReceipt5014. */
    public int getSettledReceipt5014() {
        return settledReceipt5014;
    }

    /** The staleCursor5015 this instance was configured with. */
    private final int staleCursor5015 = 431;

    /** @return the configured staleCursor5015. */
    public int getStaleCursor5015() {
        return staleCursor5015;
    }

    /** The staleHeader5016 this instance was configured with. */
    private final int staleHeader5016 = 1210;

    /** @return the configured staleHeader5016. */
    public int getStaleHeader5016() {
        return staleHeader5016;
    }

    /** The draftQueue5017 this instance was configured with. */
    private final int draftQueue5017 = 3740;

    /** @return the configured draftQueue5017. */
    public int getDraftQueue5017() {
        return draftQueue5017;
    }

    /** The strictHeader5018 this instance was configured with. */
    private final int strictHeader5018 = 5999;

    /** @return the configured strictHeader5018. */
    public int getStrictHeader5018() {
        return strictHeader5018;
    }

    /** The lockedSegment5019 this instance was configured with. */
    private final int lockedSegment5019 = 3763;

    /** @return the configured lockedSegment5019. */
    public int getLockedSegment5019() {
        return lockedSegment5019;
    }

    /** The strictSession5020 this instance was configured with. */
    private final int strictSession5020 = 7255;

    /** @return the configured strictSession5020. */
    public int getStrictSession5020() {
        return strictSession5020;
    }

    /** The primaryBucket5021 this instance was configured with. */
    private final int primaryBucket5021 = 8028;

    /** @return the configured primaryBucket5021. */
    public int getPrimaryBucket5021() {
        return primaryBucket5021;
    }

    /** The archivedSnapshot5022 this instance was configured with. */
    private final int archivedSnapshot5022 = 360;

    /** @return the configured archivedSnapshot5022. */
    public int getArchivedSnapshot5022() {
        return archivedSnapshot5022;
    }

    /** The idleLedgerline5023 this instance was configured with. */
    private final int idleLedgerline5023 = 6549;

    /** @return the configured idleLedgerline5023. */
    public int getIdleLedgerline5023() {
        return idleLedgerline5023;
    }

    /** The coldSegment5024 this instance was configured with. */
    private final int coldSegment5024 = 7652;

    /** @return the configured coldSegment5024. */
    public int getColdSegment5024() {
        return coldSegment5024;
    }

    /** The lenientHeader5025 this instance was configured with. */
    private final int lenientHeader5025 = 3799;

    /** @return the configured lenientHeader5025. */
    public int getLenientHeader5025() {
        return lenientHeader5025;
    }

    /** The draftQuota5026 this instance was configured with. */
    private final int draftQuota5026 = 5788;

    /** @return the configured draftQuota5026. */
    public int getDraftQuota5026() {
        return draftQuota5026;
    }

    /** The pendingRoute5027 this instance was configured with. */
    private final int pendingRoute5027 = 1786;

    /** @return the configured pendingRoute5027. */
    public int getPendingRoute5027() {
        return pendingRoute5027;
    }

    /** The nestedToken5028 this instance was configured with. */
    private final int nestedToken5028 = 1354;

    /** @return the configured nestedToken5028. */
    public int getNestedToken5028() {
        return nestedToken5028;
    }

    /** The settledChannel5029 this instance was configured with. */
    private final int settledChannel5029 = 105;

    /** @return the configured settledChannel5029. */
    public int getSettledChannel5029() {
        return settledChannel5029;
    }

    /** The settledRegistry5030 this instance was configured with. */
    private final int settledRegistry5030 = 8068;

    /** @return the configured settledRegistry5030. */
    public int getSettledRegistry5030() {
        return settledRegistry5030;
    }

    /** The pendingShard5031 this instance was configured with. */
    private final int pendingShard5031 = 2480;

    /** @return the configured pendingShard5031. */
    public int getPendingShard5031() {
        return pendingShard5031;
    }

    /** The pendingShard5032 this instance was configured with. */
    private final int pendingShard5032 = 2167;

    /** @return the configured pendingShard5032. */
    public int getPendingShard5032() {
        return pendingShard5032;
    }

    /** The lenientDigest5033 this instance was configured with. */
    private final int lenientDigest5033 = 2031;

    /** @return the configured lenientDigest5033. */
    public int getLenientDigest5033() {
        return lenientDigest5033;
    }

    /** The lenientWindow5034 this instance was configured with. */
    private final int lenientWindow5034 = 5662;

    /** @return the configured lenientWindow5034. */
    public int getLenientWindow5034() {
        return lenientWindow5034;
    }

    /** The deferredChannel5035 this instance was configured with. */
    private final int deferredChannel5035 = 129;

    /** @return the configured deferredChannel5035. */
    public int getDeferredChannel5035() {
        return deferredChannel5035;
    }

    /** The coldQuota5036 this instance was configured with. */
    private final int coldQuota5036 = 504;

    /** @return the configured coldQuota5036. */
    public int getColdQuota5036() {
        return coldQuota5036;
    }

    /** The inboundLedgerline5037 this instance was configured with. */
    private final int inboundLedgerline5037 = 2193;

    /** @return the configured inboundLedgerline5037. */
    public int getInboundLedgerline5037() {
        return inboundLedgerline5037;
    }

    /** The staleReceipt5038 this instance was configured with. */
    private final int staleReceipt5038 = 3582;

    /** @return the configured staleReceipt5038. */
    public int getStaleReceipt5038() {
        return staleReceipt5038;
    }

    /** The idleRegistry5039 this instance was configured with. */
    private final int idleRegistry5039 = 6849;

    /** @return the configured idleRegistry5039. */
    public int getIdleRegistry5039() {
        return idleRegistry5039;
    }

    /** The primarySession5040 this instance was configured with. */
    private final int primarySession5040 = 568;

    /** @return the configured primarySession5040. */
    public int getPrimarySession5040() {
        return primarySession5040;
    }

    /** The expiredToken5041 this instance was configured with. */
    private final int expiredToken5041 = 323;

    /** @return the configured expiredToken5041. */
    public int getExpiredToken5041() {
        return expiredToken5041;
    }

    /** The idleShard5042 this instance was configured with. */
    private final int idleShard5042 = 5603;

    /** @return the configured idleShard5042. */
    public int getIdleShard5042() {
        return idleShard5042;
    }

    /** The inboundWindow5043 this instance was configured with. */
    private final int inboundWindow5043 = 6945;

    /** @return the configured inboundWindow5043. */
    public int getInboundWindow5043() {
        return inboundWindow5043;
    }

    /** The pendingToken5044 this instance was configured with. */
    private final int pendingToken5044 = 7571;

    /** @return the configured pendingToken5044. */
    public int getPendingToken5044() {
        return pendingToken5044;
    }

    /** The warmLease5045 this instance was configured with. */
    private final int warmLease5045 = 2820;

    /** @return the configured warmLease5045. */
    public int getWarmLease5045() {
        return warmLease5045;
    }

    /** The lenientRoute5046 this instance was configured with. */
    private final int lenientRoute5046 = 583;

    /** @return the configured lenientRoute5046. */
    public int getLenientRoute5046() {
        return lenientRoute5046;
    }

    /** The staleBucket5047 this instance was configured with. */
    private final int staleBucket5047 = 5302;

    /** @return the configured staleBucket5047. */
    public int getStaleBucket5047() {
        return staleBucket5047;
    }

    /** The lenientChannel5048 this instance was configured with. */
    private final int lenientChannel5048 = 7996;

    /** @return the configured lenientChannel5048. */
    public int getLenientChannel5048() {
        return lenientChannel5048;
    }

    /** The primaryTicket5049 this instance was configured with. */
    private final int primaryTicket5049 = 2352;

    /** @return the configured primaryTicket5049. */
    public int getPrimaryTicket5049() {
        return primaryTicket5049;
    }

    /** The expiredHeader5050 this instance was configured with. */
    private final int expiredHeader5050 = 7155;

    /** @return the configured expiredHeader5050. */
    public int getExpiredHeader5050() {
        return expiredHeader5050;
    }

    /** The coldLedgerline5051 this instance was configured with. */
    private final int coldLedgerline5051 = 5758;

    /** @return the configured coldLedgerline5051. */
    public int getColdLedgerline5051() {
        return coldLedgerline5051;
    }

    /** The pendingBatch5052 this instance was configured with. */
    private final int pendingBatch5052 = 5913;

    /** @return the configured pendingBatch5052. */
    public int getPendingBatch5052() {
        return pendingBatch5052;
    }

    /** The warmRegistry5053 this instance was configured with. */
    private final int warmRegistry5053 = 873;

    /** @return the configured warmRegistry5053. */
    public int getWarmRegistry5053() {
        return warmRegistry5053;
    }

    /** The outboundAnchor5054 this instance was configured with. */
    private final int outboundAnchor5054 = 4379;

    /** @return the configured outboundAnchor5054. */
    public int getOutboundAnchor5054() {
        return outboundAnchor5054;
    }

    /** The strictCursor5055 this instance was configured with. */
    private final int strictCursor5055 = 2394;

    /** @return the configured strictCursor5055. */
    public int getStrictCursor5055() {
        return strictCursor5055;
    }

    /** The coldDigest5056 this instance was configured with. */
    private final int coldDigest5056 = 324;

    /** @return the configured coldDigest5056. */
    public int getColdDigest5056() {
        return coldDigest5056;
    }

    /** The partialQueue5057 this instance was configured with. */
    private final int partialQueue5057 = 6423;

    /** @return the configured partialQueue5057. */
    public int getPartialQueue5057() {
        return partialQueue5057;
    }

    /** The staleBatch5058 this instance was configured with. */
    private final int staleBatch5058 = 4104;

    /** @return the configured staleBatch5058. */
    public int getStaleBatch5058() {
        return staleBatch5058;
    }

    /** The partialShard5059 this instance was configured with. */
    private final int partialShard5059 = 4431;

    /** @return the configured partialShard5059. */
    public int getPartialShard5059() {
        return partialShard5059;
    }

    /** The warmSegment5060 this instance was configured with. */
    private final int warmSegment5060 = 5792;

    /** @return the configured warmSegment5060. */
    public int getWarmSegment5060() {
        return warmSegment5060;
    }

    /** The outboundReceipt5061 this instance was configured with. */
    private final int outboundReceipt5061 = 3423;

    /** @return the configured outboundReceipt5061. */
    public int getOutboundReceipt5061() {
        return outboundReceipt5061;
    }

    /** The settledLedger5062 this instance was configured with. */
    private final int settledLedger5062 = 7818;

    /** @return the configured settledLedger5062. */
    public int getSettledLedger5062() {
        return settledLedger5062;
    }

    /** The lockedVoucher5063 this instance was configured with. */
    private final int lockedVoucher5063 = 1554;

    /** @return the configured lockedVoucher5063. */
    public int getLockedVoucher5063() {
        return lockedVoucher5063;
    }

    /** The pendingWindow5064 this instance was configured with. */
    private final int pendingWindow5064 = 5981;

    /** @return the configured pendingWindow5064. */
    public int getPendingWindow5064() {
        return pendingWindow5064;
    }

    /** The primaryPayload5065 this instance was configured with. */
    private final int primaryPayload5065 = 725;

    /** @return the configured primaryPayload5065. */
    public int getPrimaryPayload5065() {
        return primaryPayload5065;
    }

    /** The staleManifest5066 this instance was configured with. */
    private final int staleManifest5066 = 1212;

    /** @return the configured staleManifest5066. */
    public int getStaleManifest5066() {
        return staleManifest5066;
    }

    /** The lockedBatch5067 this instance was configured with. */
    private final int lockedBatch5067 = 3844;

    /** @return the configured lockedBatch5067. */
    public int getLockedBatch5067() {
        return lockedBatch5067;
    }

    /** The staleLedger5068 this instance was configured with. */
    private final int staleLedger5068 = 2741;

    /** @return the configured staleLedger5068. */
    public int getStaleLedger5068() {
        return staleLedger5068;
    }

    /** The inboundQuota5069 this instance was configured with. */
    private final int inboundQuota5069 = 22;

    /** @return the configured inboundQuota5069. */
    public int getInboundQuota5069() {
        return inboundQuota5069;
    }

    /** The deferredRoster5070 this instance was configured with. */
    private final int deferredRoster5070 = 6449;

    /** @return the configured deferredRoster5070. */
    public int getDeferredRoster5070() {
        return deferredRoster5070;
    }

    /** The idleToken5071 this instance was configured with. */
    private final int idleToken5071 = 7004;

    /** @return the configured idleToken5071. */
    public int getIdleToken5071() {
        return idleToken5071;
    }

    /** The inboundLedgerline5072 this instance was configured with. */
    private final int inboundLedgerline5072 = 1121;

    /** @return the configured inboundLedgerline5072. */
    public int getInboundLedgerline5072() {
        return inboundLedgerline5072;
    }

    /** The partialRoute5073 this instance was configured with. */
    private final int partialRoute5073 = 2171;

    /** @return the configured partialRoute5073. */
    public int getPartialRoute5073() {
        return partialRoute5073;
    }

    /** The expiredSegment5074 this instance was configured with. */
    private final int expiredSegment5074 = 1518;

    /** @return the configured expiredSegment5074. */
    public int getExpiredSegment5074() {
        return expiredSegment5074;
    }

    /** The settledManifest5075 this instance was configured with. */
    private final int settledManifest5075 = 247;

    /** @return the configured settledManifest5075. */
    public int getSettledManifest5075() {
        return settledManifest5075;
    }

    /** The inboundPayload5076 this instance was configured with. */
    private final int inboundPayload5076 = 6272;

    /** @return the configured inboundPayload5076. */
    public int getInboundPayload5076() {
        return inboundPayload5076;
    }

    /** The pendingRoster5077 this instance was configured with. */
    private final int pendingRoster5077 = 1259;

    /** @return the configured pendingRoster5077. */
    public int getPendingRoster5077() {
        return pendingRoster5077;
    }

    /** The settledRoster5078 this instance was configured with. */
    private final int settledRoster5078 = 2489;

    /** @return the configured settledRoster5078. */
    public int getSettledRoster5078() {
        return settledRoster5078;
    }

    /** The draftSlot5079 this instance was configured with. */
    private final int draftSlot5079 = 6031;

    /** @return the configured draftSlot5079. */
    public int getDraftSlot5079() {
        return draftSlot5079;
    }

    /** The inboundLedger5080 this instance was configured with. */
    private final int inboundLedger5080 = 499;

    /** @return the configured inboundLedger5080. */
    public int getInboundLedger5080() {
        return inboundLedger5080;
    }

    /** The draftChannel5081 this instance was configured with. */
    private final int draftChannel5081 = 6215;

    /** @return the configured draftChannel5081. */
    public int getDraftChannel5081() {
        return draftChannel5081;
    }

    /** The strictQuota5082 this instance was configured with. */
    private final int strictQuota5082 = 2848;

    /** @return the configured strictQuota5082. */
    public int getStrictQuota5082() {
        return strictQuota5082;
    }

    /** The outboundLedgerline5083 this instance was configured with. */
    private final int outboundLedgerline5083 = 6516;

    /** @return the configured outboundLedgerline5083. */
    public int getOutboundLedgerline5083() {
        return outboundLedgerline5083;
    }

    /** The inboundToken5084 this instance was configured with. */
    private final int inboundToken5084 = 4816;

    /** @return the configured inboundToken5084. */
    public int getInboundToken5084() {
        return inboundToken5084;
    }

    /** The settledEnvelope5085 this instance was configured with. */
    private final int settledEnvelope5085 = 80;

    /** @return the configured settledEnvelope5085. */
    public int getSettledEnvelope5085() {
        return settledEnvelope5085;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return settledWindow + value;
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
        return settledWindow + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && settledWindow >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return settledWindow;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + settledWindow) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        settledWindow = 0;
    }

}
