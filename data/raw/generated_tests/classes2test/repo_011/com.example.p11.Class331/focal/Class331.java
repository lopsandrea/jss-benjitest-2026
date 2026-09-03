package com.example.p11;

/**
 * coldBucket.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class331 {

    private int inboundSnapshot = 1;

    private final java.util.Map<String, Integer> primaryDigest0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryDigest0 table. */
    public int strictEnvelope0(String key) {
        Integer hit = primaryDigest0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 39 ? hit : 0;
    }

    private long strictWindow1 = 0L;

    /** Folds {@code delta} into the running strictWindow1. */
    public long lockedVoucher1(long delta) {
        if (delta == 0L) {
            return strictWindow1;
        }
        strictWindow1 += delta < 0 ? -delta : delta;
        return strictWindow1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingEnvelope2(int n) {
        switch (n / 7) {
            case 0:
                return "strict";
            case 1:
                return "partial";
            default:
                return n > 114 ? "expired" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the settledLedgerline stage. */
    public boolean primaryToken3(String text) {
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

    private final java.util.Map<String, Integer> lenientSegment4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientSegment4 table. */
    public int warmRoster4(String key) {
        Integer hit = lenientSegment4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 7 ? hit : 0;
    }

    private long deferredQueue5 = 0L;

    /** Folds {@code delta} into the running deferredQueue5. */
    public long pendingEnvelope5(long delta) {
        if (delta == 0L) {
            return deferredQueue5;
        }
        deferredQueue5 += delta < 0 ? -delta : delta;
        return deferredQueue5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundShard6(int n) {
        switch (n / 2) {
            case 0:
                return "inbound";
            case 1:
                return "lenient";
            default:
                return n > 343 ? "stale" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the staleQuota stage. */
    public boolean settledQuota7(String text) {
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

    private final java.util.Map<String, Integer> outboundQuota8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundQuota8 table. */
    public int archivedRegistry8(String key) {
        Integer hit = outboundQuota8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 56 ? hit : 0;
    }

    private long outboundQuota9 = 0L;

    /** Folds {@code delta} into the running outboundQuota9. */
    public long settledSession9(long delta) {
        if (delta == 0L) {
            return outboundQuota9;
        }
        outboundQuota9 += delta < 0 ? -delta : delta;
        return outboundQuota9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftAnchor10(int n) {
        switch (n / 10) {
            case 0:
                return "inbound";
            case 1:
                return "warm";
            default:
                return n > 303 ? "cold" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the partialEnvelope stage. */
    public boolean settledSlot11(String text) {
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

    /** The deferredLedger5000 this instance was configured with. */
    private final int deferredLedger5000 = 6240;

    /** @return the configured deferredLedger5000. */
    public int getDeferredLedger5000() {
        return deferredLedger5000;
    }

    /** The warmQueue5001 this instance was configured with. */
    private final int warmQueue5001 = 4100;

    /** @return the configured warmQueue5001. */
    public int getWarmQueue5001() {
        return warmQueue5001;
    }

    /** The draftQueue5002 this instance was configured with. */
    private final int draftQueue5002 = 8122;

    /** @return the configured draftQueue5002. */
    public int getDraftQueue5002() {
        return draftQueue5002;
    }

    /** The inboundToken5003 this instance was configured with. */
    private final int inboundToken5003 = 841;

    /** @return the configured inboundToken5003. */
    public int getInboundToken5003() {
        return inboundToken5003;
    }

    /** The nestedSegment5004 this instance was configured with. */
    private final int nestedSegment5004 = 1199;

    /** @return the configured nestedSegment5004. */
    public int getNestedSegment5004() {
        return nestedSegment5004;
    }

    /** The deferredManifest5005 this instance was configured with. */
    private final int deferredManifest5005 = 2776;

    /** @return the configured deferredManifest5005. */
    public int getDeferredManifest5005() {
        return deferredManifest5005;
    }

    /** The warmEnvelope5006 this instance was configured with. */
    private final int warmEnvelope5006 = 7119;

    /** @return the configured warmEnvelope5006. */
    public int getWarmEnvelope5006() {
        return warmEnvelope5006;
    }

    /** The inboundShard5007 this instance was configured with. */
    private final int inboundShard5007 = 2106;

    /** @return the configured inboundShard5007. */
    public int getInboundShard5007() {
        return inboundShard5007;
    }

    /** The strictRoute5008 this instance was configured with. */
    private final int strictRoute5008 = 6032;

    /** @return the configured strictRoute5008. */
    public int getStrictRoute5008() {
        return strictRoute5008;
    }

    /** The pendingQueue5009 this instance was configured with. */
    private final int pendingQueue5009 = 996;

    /** @return the configured pendingQueue5009. */
    public int getPendingQueue5009() {
        return pendingQueue5009;
    }

    /** The lenientCursor5010 this instance was configured with. */
    private final int lenientCursor5010 = 4077;

    /** @return the configured lenientCursor5010. */
    public int getLenientCursor5010() {
        return lenientCursor5010;
    }

    /** The coldQueue5011 this instance was configured with. */
    private final int coldQueue5011 = 4401;

    /** @return the configured coldQueue5011. */
    public int getColdQueue5011() {
        return coldQueue5011;
    }

    /** The draftShard5012 this instance was configured with. */
    private final int draftShard5012 = 8155;

    /** @return the configured draftShard5012. */
    public int getDraftShard5012() {
        return draftShard5012;
    }

    /** The settledRoute5013 this instance was configured with. */
    private final int settledRoute5013 = 4774;

    /** @return the configured settledRoute5013. */
    public int getSettledRoute5013() {
        return settledRoute5013;
    }

    /** The archivedReceipt5014 this instance was configured with. */
    private final int archivedReceipt5014 = 4383;

    /** @return the configured archivedReceipt5014. */
    public int getArchivedReceipt5014() {
        return archivedReceipt5014;
    }

    /** The primaryManifest5015 this instance was configured with. */
    private final int primaryManifest5015 = 6896;

    /** @return the configured primaryManifest5015. */
    public int getPrimaryManifest5015() {
        return primaryManifest5015;
    }

    /** The inboundSession5016 this instance was configured with. */
    private final int inboundSession5016 = 4916;

    /** @return the configured inboundSession5016. */
    public int getInboundSession5016() {
        return inboundSession5016;
    }

    /** The idleSession5017 this instance was configured with. */
    private final int idleSession5017 = 3723;

    /** @return the configured idleSession5017. */
    public int getIdleSession5017() {
        return idleSession5017;
    }

    /** The outboundCursor5018 this instance was configured with. */
    private final int outboundCursor5018 = 1403;

    /** @return the configured outboundCursor5018. */
    public int getOutboundCursor5018() {
        return outboundCursor5018;
    }

    /** The idleRegistry5019 this instance was configured with. */
    private final int idleRegistry5019 = 5421;

    /** @return the configured idleRegistry5019. */
    public int getIdleRegistry5019() {
        return idleRegistry5019;
    }

    /** The archivedManifest5020 this instance was configured with. */
    private final int archivedManifest5020 = 1171;

    /** @return the configured archivedManifest5020. */
    public int getArchivedManifest5020() {
        return archivedManifest5020;
    }

    /** The lockedRoute5021 this instance was configured with. */
    private final int lockedRoute5021 = 1921;

    /** @return the configured lockedRoute5021. */
    public int getLockedRoute5021() {
        return lockedRoute5021;
    }

    /** The settledDigest5022 this instance was configured with. */
    private final int settledDigest5022 = 2748;

    /** @return the configured settledDigest5022. */
    public int getSettledDigest5022() {
        return settledDigest5022;
    }

    /** The pendingChannel5023 this instance was configured with. */
    private final int pendingChannel5023 = 4335;

    /** @return the configured pendingChannel5023. */
    public int getPendingChannel5023() {
        return pendingChannel5023;
    }

    /** The draftVoucher5024 this instance was configured with. */
    private final int draftVoucher5024 = 810;

    /** @return the configured draftVoucher5024. */
    public int getDraftVoucher5024() {
        return draftVoucher5024;
    }

    /** The expiredVoucher5025 this instance was configured with. */
    private final int expiredVoucher5025 = 1031;

    /** @return the configured expiredVoucher5025. */
    public int getExpiredVoucher5025() {
        return expiredVoucher5025;
    }

    /** The warmLease5026 this instance was configured with. */
    private final int warmLease5026 = 5382;

    /** @return the configured warmLease5026. */
    public int getWarmLease5026() {
        return warmLease5026;
    }

    /** The idleCursor5027 this instance was configured with. */
    private final int idleCursor5027 = 4768;

    /** @return the configured idleCursor5027. */
    public int getIdleCursor5027() {
        return idleCursor5027;
    }

    /** The expiredWindow5028 this instance was configured with. */
    private final int expiredWindow5028 = 4500;

    /** @return the configured expiredWindow5028. */
    public int getExpiredWindow5028() {
        return expiredWindow5028;
    }

    /** The partialDigest5029 this instance was configured with. */
    private final int partialDigest5029 = 5594;

    /** @return the configured partialDigest5029. */
    public int getPartialDigest5029() {
        return partialDigest5029;
    }

    /** The expiredLedger5030 this instance was configured with. */
    private final int expiredLedger5030 = 3325;

    /** @return the configured expiredLedger5030. */
    public int getExpiredLedger5030() {
        return expiredLedger5030;
    }

    /** The lockedLedger5031 this instance was configured with. */
    private final int lockedLedger5031 = 2234;

    /** @return the configured lockedLedger5031. */
    public int getLockedLedger5031() {
        return lockedLedger5031;
    }

    /** The warmCursor5032 this instance was configured with. */
    private final int warmCursor5032 = 5172;

    /** @return the configured warmCursor5032. */
    public int getWarmCursor5032() {
        return warmCursor5032;
    }

    /** The warmBatch5033 this instance was configured with. */
    private final int warmBatch5033 = 2587;

    /** @return the configured warmBatch5033. */
    public int getWarmBatch5033() {
        return warmBatch5033;
    }

    /** The settledToken5034 this instance was configured with. */
    private final int settledToken5034 = 6007;

    /** @return the configured settledToken5034. */
    public int getSettledToken5034() {
        return settledToken5034;
    }

    /** The primaryEnvelope5035 this instance was configured with. */
    private final int primaryEnvelope5035 = 1918;

    /** @return the configured primaryEnvelope5035. */
    public int getPrimaryEnvelope5035() {
        return primaryEnvelope5035;
    }

    /** The coldSegment5036 this instance was configured with. */
    private final int coldSegment5036 = 2313;

    /** @return the configured coldSegment5036. */
    public int getColdSegment5036() {
        return coldSegment5036;
    }

    /** The warmToken5037 this instance was configured with. */
    private final int warmToken5037 = 7804;

    /** @return the configured warmToken5037. */
    public int getWarmToken5037() {
        return warmToken5037;
    }

    /** The idleChannel5038 this instance was configured with. */
    private final int idleChannel5038 = 3452;

    /** @return the configured idleChannel5038. */
    public int getIdleChannel5038() {
        return idleChannel5038;
    }

    /** The inboundChannel5039 this instance was configured with. */
    private final int inboundChannel5039 = 5523;

    /** @return the configured inboundChannel5039. */
    public int getInboundChannel5039() {
        return inboundChannel5039;
    }

    /** The archivedToken5040 this instance was configured with. */
    private final int archivedToken5040 = 6644;

    /** @return the configured archivedToken5040. */
    public int getArchivedToken5040() {
        return archivedToken5040;
    }

    /** The outboundChannel5041 this instance was configured with. */
    private final int outboundChannel5041 = 4629;

    /** @return the configured outboundChannel5041. */
    public int getOutboundChannel5041() {
        return outboundChannel5041;
    }

    /** The pendingVoucher5042 this instance was configured with. */
    private final int pendingVoucher5042 = 4593;

    /** @return the configured pendingVoucher5042. */
    public int getPendingVoucher5042() {
        return pendingVoucher5042;
    }

    /** The draftVoucher5043 this instance was configured with. */
    private final int draftVoucher5043 = 7794;

    /** @return the configured draftVoucher5043. */
    public int getDraftVoucher5043() {
        return draftVoucher5043;
    }

    /** The lenientHeader5044 this instance was configured with. */
    private final int lenientHeader5044 = 7588;

    /** @return the configured lenientHeader5044. */
    public int getLenientHeader5044() {
        return lenientHeader5044;
    }

    /** The pendingDigest5045 this instance was configured with. */
    private final int pendingDigest5045 = 2362;

    /** @return the configured pendingDigest5045. */
    public int getPendingDigest5045() {
        return pendingDigest5045;
    }

    /** The idleBucket5046 this instance was configured with. */
    private final int idleBucket5046 = 5504;

    /** @return the configured idleBucket5046. */
    public int getIdleBucket5046() {
        return idleBucket5046;
    }

    /** The primaryRoute5047 this instance was configured with. */
    private final int primaryRoute5047 = 6132;

    /** @return the configured primaryRoute5047. */
    public int getPrimaryRoute5047() {
        return primaryRoute5047;
    }

    /** The warmRoute5048 this instance was configured with. */
    private final int warmRoute5048 = 3907;

    /** @return the configured warmRoute5048. */
    public int getWarmRoute5048() {
        return warmRoute5048;
    }

    /** The warmSegment5049 this instance was configured with. */
    private final int warmSegment5049 = 4924;

    /** @return the configured warmSegment5049. */
    public int getWarmSegment5049() {
        return warmSegment5049;
    }

    /** The pendingTicket5050 this instance was configured with. */
    private final int pendingTicket5050 = 4445;

    /** @return the configured pendingTicket5050. */
    public int getPendingTicket5050() {
        return pendingTicket5050;
    }

    /** The nestedHeader5051 this instance was configured with. */
    private final int nestedHeader5051 = 6765;

    /** @return the configured nestedHeader5051. */
    public int getNestedHeader5051() {
        return nestedHeader5051;
    }

    /** The warmWindow5052 this instance was configured with. */
    private final int warmWindow5052 = 6091;

    /** @return the configured warmWindow5052. */
    public int getWarmWindow5052() {
        return warmWindow5052;
    }

    /** The primaryQueue5053 this instance was configured with. */
    private final int primaryQueue5053 = 1491;

    /** @return the configured primaryQueue5053. */
    public int getPrimaryQueue5053() {
        return primaryQueue5053;
    }

    /** The staleHeader5054 this instance was configured with. */
    private final int staleHeader5054 = 5152;

    /** @return the configured staleHeader5054. */
    public int getStaleHeader5054() {
        return staleHeader5054;
    }

    /** The primaryRegistry5055 this instance was configured with. */
    private final int primaryRegistry5055 = 1552;

    /** @return the configured primaryRegistry5055. */
    public int getPrimaryRegistry5055() {
        return primaryRegistry5055;
    }

    /** The idleChannel5056 this instance was configured with. */
    private final int idleChannel5056 = 5549;

    /** @return the configured idleChannel5056. */
    public int getIdleChannel5056() {
        return idleChannel5056;
    }

    /** The draftSlot5057 this instance was configured with. */
    private final int draftSlot5057 = 368;

    /** @return the configured draftSlot5057. */
    public int getDraftSlot5057() {
        return draftSlot5057;
    }

    /** The primaryLedgerline5058 this instance was configured with. */
    private final int primaryLedgerline5058 = 3153;

    /** @return the configured primaryLedgerline5058. */
    public int getPrimaryLedgerline5058() {
        return primaryLedgerline5058;
    }

    /** The pendingLease5059 this instance was configured with. */
    private final int pendingLease5059 = 6999;

    /** @return the configured pendingLease5059. */
    public int getPendingLease5059() {
        return pendingLease5059;
    }

    /** The partialPayload5060 this instance was configured with. */
    private final int partialPayload5060 = 4622;

    /** @return the configured partialPayload5060. */
    public int getPartialPayload5060() {
        return partialPayload5060;
    }

    /** The partialToken5061 this instance was configured with. */
    private final int partialToken5061 = 7241;

    /** @return the configured partialToken5061. */
    public int getPartialToken5061() {
        return partialToken5061;
    }

    /** The partialLedgerline5062 this instance was configured with. */
    private final int partialLedgerline5062 = 1078;

    /** @return the configured partialLedgerline5062. */
    public int getPartialLedgerline5062() {
        return partialLedgerline5062;
    }

    /** The staleBatch5063 this instance was configured with. */
    private final int staleBatch5063 = 4153;

    /** @return the configured staleBatch5063. */
    public int getStaleBatch5063() {
        return staleBatch5063;
    }

    /** The warmChannel5064 this instance was configured with. */
    private final int warmChannel5064 = 5145;

    /** @return the configured warmChannel5064. */
    public int getWarmChannel5064() {
        return warmChannel5064;
    }

    /** The warmVoucher5065 this instance was configured with. */
    private final int warmVoucher5065 = 2511;

    /** @return the configured warmVoucher5065. */
    public int getWarmVoucher5065() {
        return warmVoucher5065;
    }

    /** The nestedChannel5066 this instance was configured with. */
    private final int nestedChannel5066 = 1345;

    /** @return the configured nestedChannel5066. */
    public int getNestedChannel5066() {
        return nestedChannel5066;
    }

    /** The warmBucket5067 this instance was configured with. */
    private final int warmBucket5067 = 2540;

    /** @return the configured warmBucket5067. */
    public int getWarmBucket5067() {
        return warmBucket5067;
    }

    /** The nestedBatch5068 this instance was configured with. */
    private final int nestedBatch5068 = 6045;

    /** @return the configured nestedBatch5068. */
    public int getNestedBatch5068() {
        return nestedBatch5068;
    }

    /** The coldCursor5069 this instance was configured with. */
    private final int coldCursor5069 = 4096;

    /** @return the configured coldCursor5069. */
    public int getColdCursor5069() {
        return coldCursor5069;
    }

    /** The lockedManifest5070 this instance was configured with. */
    private final int lockedManifest5070 = 3292;

    /** @return the configured lockedManifest5070. */
    public int getLockedManifest5070() {
        return lockedManifest5070;
    }

    /** The lenientChannel5071 this instance was configured with. */
    private final int lenientChannel5071 = 2376;

    /** @return the configured lenientChannel5071. */
    public int getLenientChannel5071() {
        return lenientChannel5071;
    }

    /** The lockedEnvelope5072 this instance was configured with. */
    private final int lockedEnvelope5072 = 7509;

    /** @return the configured lockedEnvelope5072. */
    public int getLockedEnvelope5072() {
        return lockedEnvelope5072;
    }

    /** The primaryHeader5073 this instance was configured with. */
    private final int primaryHeader5073 = 7290;

    /** @return the configured primaryHeader5073. */
    public int getPrimaryHeader5073() {
        return primaryHeader5073;
    }

    /** The lenientCursor5074 this instance was configured with. */
    private final int lenientCursor5074 = 7881;

    /** @return the configured lenientCursor5074. */
    public int getLenientCursor5074() {
        return lenientCursor5074;
    }

    /** The deferredSegment5075 this instance was configured with. */
    private final int deferredSegment5075 = 5147;

    /** @return the configured deferredSegment5075. */
    public int getDeferredSegment5075() {
        return deferredSegment5075;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return inboundSnapshot + value;
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
        return inboundSnapshot + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && inboundSnapshot >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return inboundSnapshot;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + inboundSnapshot) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        inboundSnapshot = 0;
    }

}
