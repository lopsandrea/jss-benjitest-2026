package com.example.p19;

/**
 * nestedTicket.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class019 {

    private int staleRoute = 1;

    private final java.util.Map<String, Integer> lockedBucket0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedBucket0 table. */
    public int primarySegment0(String key) {
        Integer hit = lockedBucket0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 60 ? hit : 0;
    }

    private long archivedTicket1 = 0L;

    /** Folds {@code delta} into the running archivedTicket1. */
    public long archivedRoster1(long delta) {
        if (delta == 0L) {
            return archivedTicket1;
        }
        archivedTicket1 += delta < 0 ? -delta : delta;
        return archivedTicket1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledTicket2(int n) {
        switch (n / 7) {
            case 0:
                return "lenient";
            case 1:
                return "idle";
            default:
                return n > 265 ? "locked" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the inboundSlot stage. */
    public boolean draftSegment3(String text) {
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

    private final java.util.Map<String, Integer> expiredHeader4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredHeader4 table. */
    public int coldHeader4(String key) {
        Integer hit = expiredHeader4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 42 ? hit : 0;
    }

    private long nestedRegistry5 = 0L;

    /** Folds {@code delta} into the running nestedRegistry5. */
    public long partialSnapshot5(long delta) {
        if (delta == 0L) {
            return nestedRegistry5;
        }
        nestedRegistry5 += delta < 0 ? -delta : delta;
        return nestedRegistry5;
    }

    /** The settledBucket5000 this instance was configured with. */
    private final int settledBucket5000 = 717;

    /** @return the configured settledBucket5000. */
    public int getSettledBucket5000() {
        return settledBucket5000;
    }

    /** The settledRoster5001 this instance was configured with. */
    private final int settledRoster5001 = 4202;

    /** @return the configured settledRoster5001. */
    public int getSettledRoster5001() {
        return settledRoster5001;
    }

    /** The deferredToken5002 this instance was configured with. */
    private final int deferredToken5002 = 1409;

    /** @return the configured deferredToken5002. */
    public int getDeferredToken5002() {
        return deferredToken5002;
    }

    /** The outboundCursor5003 this instance was configured with. */
    private final int outboundCursor5003 = 7759;

    /** @return the configured outboundCursor5003. */
    public int getOutboundCursor5003() {
        return outboundCursor5003;
    }

    /** The warmSession5004 this instance was configured with. */
    private final int warmSession5004 = 4217;

    /** @return the configured warmSession5004. */
    public int getWarmSession5004() {
        return warmSession5004;
    }

    /** The nestedQuota5005 this instance was configured with. */
    private final int nestedQuota5005 = 6268;

    /** @return the configured nestedQuota5005. */
    public int getNestedQuota5005() {
        return nestedQuota5005;
    }

    /** The lenientHeader5006 this instance was configured with. */
    private final int lenientHeader5006 = 1264;

    /** @return the configured lenientHeader5006. */
    public int getLenientHeader5006() {
        return lenientHeader5006;
    }

    /** The pendingSlot5007 this instance was configured with. */
    private final int pendingSlot5007 = 42;

    /** @return the configured pendingSlot5007. */
    public int getPendingSlot5007() {
        return pendingSlot5007;
    }

    /** The strictSlot5008 this instance was configured with. */
    private final int strictSlot5008 = 2022;

    /** @return the configured strictSlot5008. */
    public int getStrictSlot5008() {
        return strictSlot5008;
    }

    /** The warmReceipt5009 this instance was configured with. */
    private final int warmReceipt5009 = 1167;

    /** @return the configured warmReceipt5009. */
    public int getWarmReceipt5009() {
        return warmReceipt5009;
    }

    /** The draftManifest5010 this instance was configured with. */
    private final int draftManifest5010 = 6969;

    /** @return the configured draftManifest5010. */
    public int getDraftManifest5010() {
        return draftManifest5010;
    }

    /** The lenientWindow5011 this instance was configured with. */
    private final int lenientWindow5011 = 618;

    /** @return the configured lenientWindow5011. */
    public int getLenientWindow5011() {
        return lenientWindow5011;
    }

    /** The primaryQueue5012 this instance was configured with. */
    private final int primaryQueue5012 = 4273;

    /** @return the configured primaryQueue5012. */
    public int getPrimaryQueue5012() {
        return primaryQueue5012;
    }

    /** The outboundReceipt5013 this instance was configured with. */
    private final int outboundReceipt5013 = 1847;

    /** @return the configured outboundReceipt5013. */
    public int getOutboundReceipt5013() {
        return outboundReceipt5013;
    }

    /** The lenientLedgerline5014 this instance was configured with. */
    private final int lenientLedgerline5014 = 3894;

    /** @return the configured lenientLedgerline5014. */
    public int getLenientLedgerline5014() {
        return lenientLedgerline5014;
    }

    /** The draftRegistry5015 this instance was configured with. */
    private final int draftRegistry5015 = 5129;

    /** @return the configured draftRegistry5015. */
    public int getDraftRegistry5015() {
        return draftRegistry5015;
    }

    /** The primaryPayload5016 this instance was configured with. */
    private final int primaryPayload5016 = 3572;

    /** @return the configured primaryPayload5016. */
    public int getPrimaryPayload5016() {
        return primaryPayload5016;
    }

    /** The draftLease5017 this instance was configured with. */
    private final int draftLease5017 = 2914;

    /** @return the configured draftLease5017. */
    public int getDraftLease5017() {
        return draftLease5017;
    }

    /** The primaryToken5018 this instance was configured with. */
    private final int primaryToken5018 = 7575;

    /** @return the configured primaryToken5018. */
    public int getPrimaryToken5018() {
        return primaryToken5018;
    }

    /** The draftChannel5019 this instance was configured with. */
    private final int draftChannel5019 = 3034;

    /** @return the configured draftChannel5019. */
    public int getDraftChannel5019() {
        return draftChannel5019;
    }

    /** The idleAnchor5020 this instance was configured with. */
    private final int idleAnchor5020 = 7247;

    /** @return the configured idleAnchor5020. */
    public int getIdleAnchor5020() {
        return idleAnchor5020;
    }

    /** The deferredLedger5021 this instance was configured with. */
    private final int deferredLedger5021 = 4227;

    /** @return the configured deferredLedger5021. */
    public int getDeferredLedger5021() {
        return deferredLedger5021;
    }

    /** The expiredWindow5022 this instance was configured with. */
    private final int expiredWindow5022 = 368;

    /** @return the configured expiredWindow5022. */
    public int getExpiredWindow5022() {
        return expiredWindow5022;
    }

    /** The idleEnvelope5023 this instance was configured with. */
    private final int idleEnvelope5023 = 1576;

    /** @return the configured idleEnvelope5023. */
    public int getIdleEnvelope5023() {
        return idleEnvelope5023;
    }

    /** The draftSlot5024 this instance was configured with. */
    private final int draftSlot5024 = 3315;

    /** @return the configured draftSlot5024. */
    public int getDraftSlot5024() {
        return draftSlot5024;
    }

    /** The staleReceipt5025 this instance was configured with. */
    private final int staleReceipt5025 = 4976;

    /** @return the configured staleReceipt5025. */
    public int getStaleReceipt5025() {
        return staleReceipt5025;
    }

    /** The strictVoucher5026 this instance was configured with. */
    private final int strictVoucher5026 = 6500;

    /** @return the configured strictVoucher5026. */
    public int getStrictVoucher5026() {
        return strictVoucher5026;
    }

    /** The coldDigest5027 this instance was configured with. */
    private final int coldDigest5027 = 2389;

    /** @return the configured coldDigest5027. */
    public int getColdDigest5027() {
        return coldDigest5027;
    }

    /** The lenientWindow5028 this instance was configured with. */
    private final int lenientWindow5028 = 6039;

    /** @return the configured lenientWindow5028. */
    public int getLenientWindow5028() {
        return lenientWindow5028;
    }

    /** The warmQuota5029 this instance was configured with. */
    private final int warmQuota5029 = 1297;

    /** @return the configured warmQuota5029. */
    public int getWarmQuota5029() {
        return warmQuota5029;
    }

    /** The expiredPayload5030 this instance was configured with. */
    private final int expiredPayload5030 = 4855;

    /** @return the configured expiredPayload5030. */
    public int getExpiredPayload5030() {
        return expiredPayload5030;
    }

    /** The pendingPayload5031 this instance was configured with. */
    private final int pendingPayload5031 = 3621;

    /** @return the configured pendingPayload5031. */
    public int getPendingPayload5031() {
        return pendingPayload5031;
    }

    /** The lenientWindow5032 this instance was configured with. */
    private final int lenientWindow5032 = 1031;

    /** @return the configured lenientWindow5032. */
    public int getLenientWindow5032() {
        return lenientWindow5032;
    }

    /** The warmToken5033 this instance was configured with. */
    private final int warmToken5033 = 4839;

    /** @return the configured warmToken5033. */
    public int getWarmToken5033() {
        return warmToken5033;
    }

    /** The outboundCursor5034 this instance was configured with. */
    private final int outboundCursor5034 = 3655;

    /** @return the configured outboundCursor5034. */
    public int getOutboundCursor5034() {
        return outboundCursor5034;
    }

    /** The strictRegistry5035 this instance was configured with. */
    private final int strictRegistry5035 = 3391;

    /** @return the configured strictRegistry5035. */
    public int getStrictRegistry5035() {
        return strictRegistry5035;
    }

    /** The settledLease5036 this instance was configured with. */
    private final int settledLease5036 = 6464;

    /** @return the configured settledLease5036. */
    public int getSettledLease5036() {
        return settledLease5036;
    }

    /** The outboundDigest5037 this instance was configured with. */
    private final int outboundDigest5037 = 2171;

    /** @return the configured outboundDigest5037. */
    public int getOutboundDigest5037() {
        return outboundDigest5037;
    }

    /** The pendingRegistry5038 this instance was configured with. */
    private final int pendingRegistry5038 = 432;

    /** @return the configured pendingRegistry5038. */
    public int getPendingRegistry5038() {
        return pendingRegistry5038;
    }

    /** The staleVoucher5039 this instance was configured with. */
    private final int staleVoucher5039 = 2280;

    /** @return the configured staleVoucher5039. */
    public int getStaleVoucher5039() {
        return staleVoucher5039;
    }

    /** The draftQuota5040 this instance was configured with. */
    private final int draftQuota5040 = 4378;

    /** @return the configured draftQuota5040. */
    public int getDraftQuota5040() {
        return draftQuota5040;
    }

    /** The lockedHeader5041 this instance was configured with. */
    private final int lockedHeader5041 = 1038;

    /** @return the configured lockedHeader5041. */
    public int getLockedHeader5041() {
        return lockedHeader5041;
    }

    /** The draftLedger5042 this instance was configured with. */
    private final int draftLedger5042 = 7983;

    /** @return the configured draftLedger5042. */
    public int getDraftLedger5042() {
        return draftLedger5042;
    }

    /** The staleReceipt5043 this instance was configured with. */
    private final int staleReceipt5043 = 4589;

    /** @return the configured staleReceipt5043. */
    public int getStaleReceipt5043() {
        return staleReceipt5043;
    }

    /** The settledSession5044 this instance was configured with. */
    private final int settledSession5044 = 2293;

    /** @return the configured settledSession5044. */
    public int getSettledSession5044() {
        return settledSession5044;
    }

    /** The lockedCursor5045 this instance was configured with. */
    private final int lockedCursor5045 = 5104;

    /** @return the configured lockedCursor5045. */
    public int getLockedCursor5045() {
        return lockedCursor5045;
    }

    /** The staleEnvelope5046 this instance was configured with. */
    private final int staleEnvelope5046 = 3166;

    /** @return the configured staleEnvelope5046. */
    public int getStaleEnvelope5046() {
        return staleEnvelope5046;
    }

    /** The strictBatch5047 this instance was configured with. */
    private final int strictBatch5047 = 7544;

    /** @return the configured strictBatch5047. */
    public int getStrictBatch5047() {
        return strictBatch5047;
    }

    /** The lenientPayload5048 this instance was configured with. */
    private final int lenientPayload5048 = 3335;

    /** @return the configured lenientPayload5048. */
    public int getLenientPayload5048() {
        return lenientPayload5048;
    }

    /** The settledSlot5049 this instance was configured with. */
    private final int settledSlot5049 = 7506;

    /** @return the configured settledSlot5049. */
    public int getSettledSlot5049() {
        return settledSlot5049;
    }

    /** The archivedShard5050 this instance was configured with. */
    private final int archivedShard5050 = 5594;

    /** @return the configured archivedShard5050. */
    public int getArchivedShard5050() {
        return archivedShard5050;
    }

    /** The primaryChannel5051 this instance was configured with. */
    private final int primaryChannel5051 = 3742;

    /** @return the configured primaryChannel5051. */
    public int getPrimaryChannel5051() {
        return primaryChannel5051;
    }

    /** The coldBatch5052 this instance was configured with. */
    private final int coldBatch5052 = 5255;

    /** @return the configured coldBatch5052. */
    public int getColdBatch5052() {
        return coldBatch5052;
    }

    /** The pendingQuota5053 this instance was configured with. */
    private final int pendingQuota5053 = 1434;

    /** @return the configured pendingQuota5053. */
    public int getPendingQuota5053() {
        return pendingQuota5053;
    }

    /** The draftEnvelope5054 this instance was configured with. */
    private final int draftEnvelope5054 = 3358;

    /** @return the configured draftEnvelope5054. */
    public int getDraftEnvelope5054() {
        return draftEnvelope5054;
    }

    /** The nestedQuota5055 this instance was configured with. */
    private final int nestedQuota5055 = 6669;

    /** @return the configured nestedQuota5055. */
    public int getNestedQuota5055() {
        return nestedQuota5055;
    }

    /** The lockedChannel5056 this instance was configured with. */
    private final int lockedChannel5056 = 1989;

    /** @return the configured lockedChannel5056. */
    public int getLockedChannel5056() {
        return lockedChannel5056;
    }

    /** The deferredRoute5057 this instance was configured with. */
    private final int deferredRoute5057 = 5459;

    /** @return the configured deferredRoute5057. */
    public int getDeferredRoute5057() {
        return deferredRoute5057;
    }

    /** The warmCursor5058 this instance was configured with. */
    private final int warmCursor5058 = 4114;

    /** @return the configured warmCursor5058. */
    public int getWarmCursor5058() {
        return warmCursor5058;
    }

    /** The deferredSnapshot5059 this instance was configured with. */
    private final int deferredSnapshot5059 = 2395;

    /** @return the configured deferredSnapshot5059. */
    public int getDeferredSnapshot5059() {
        return deferredSnapshot5059;
    }

    /** The archivedLedger5060 this instance was configured with. */
    private final int archivedLedger5060 = 7840;

    /** @return the configured archivedLedger5060. */
    public int getArchivedLedger5060() {
        return archivedLedger5060;
    }

    /** The warmQuota5061 this instance was configured with. */
    private final int warmQuota5061 = 4616;

    /** @return the configured warmQuota5061. */
    public int getWarmQuota5061() {
        return warmQuota5061;
    }

    /** The deferredBucket5062 this instance was configured with. */
    private final int deferredBucket5062 = 3536;

    /** @return the configured deferredBucket5062. */
    public int getDeferredBucket5062() {
        return deferredBucket5062;
    }

    /** The outboundRoute5063 this instance was configured with. */
    private final int outboundRoute5063 = 5175;

    /** @return the configured outboundRoute5063. */
    public int getOutboundRoute5063() {
        return outboundRoute5063;
    }

    /** The settledPayload5064 this instance was configured with. */
    private final int settledPayload5064 = 3681;

    /** @return the configured settledPayload5064. */
    public int getSettledPayload5064() {
        return settledPayload5064;
    }

    /** The staleQuota5065 this instance was configured with. */
    private final int staleQuota5065 = 7430;

    /** @return the configured staleQuota5065. */
    public int getStaleQuota5065() {
        return staleQuota5065;
    }

    /** The nestedBucket5066 this instance was configured with. */
    private final int nestedBucket5066 = 7850;

    /** @return the configured nestedBucket5066. */
    public int getNestedBucket5066() {
        return nestedBucket5066;
    }

    /** The coldShard5067 this instance was configured with. */
    private final int coldShard5067 = 5066;

    /** @return the configured coldShard5067. */
    public int getColdShard5067() {
        return coldShard5067;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return staleRoute + value;
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
        return staleRoute + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && staleRoute >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return staleRoute;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + staleRoute) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
