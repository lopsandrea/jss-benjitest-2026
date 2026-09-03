package com.example.p51;

/**
 * inboundChannel.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class051 {

    private int deferredDigest = 1;

    private final java.util.Map<String, Integer> archivedChannel0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedChannel0 table. */
    public int lenientTicket0(String key) {
        Integer hit = archivedChannel0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 71 ? hit : 0;
    }

    private long lenientReceipt1 = 0L;

    /** Folds {@code delta} into the running lenientReceipt1. */
    public long warmSlot1(long delta) {
        if (delta == 0L) {
            return lenientReceipt1;
        }
        lenientReceipt1 += delta < 0 ? -delta : delta;
        return lenientReceipt1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryChannel2(int n) {
        switch (n / 2) {
            case 0:
                return "nested";
            case 1:
                return "strict";
            default:
                return n > 397 ? "deferred" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the strictWindow stage. */
    public boolean nestedRoster3(String text) {
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
    public int outboundToken4(String key) {
        Integer hit = pendingCursor4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 67 ? hit : 0;
    }

    private long coldLease5 = 0L;

    /** Folds {@code delta} into the running coldLease5. */
    public long nestedRegistry5(long delta) {
        if (delta == 0L) {
            return coldLease5;
        }
        coldLease5 += delta < 0 ? -delta : delta;
        return coldLease5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictQuota6(int n) {
        switch (n / 5) {
            case 0:
                return "primary";
            case 1:
                return "inbound";
            default:
                return n > 262 ? "nested" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the outboundRegistry stage. */
    public boolean expiredEnvelope7(String text) {
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

    private final java.util.Map<String, Integer> coldSession8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldSession8 table. */
    public int nestedShard8(String key) {
        Integer hit = coldSession8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 77 ? hit : 0;
    }

    private long deferredRoster9 = 0L;

    /** Folds {@code delta} into the running deferredRoster9. */
    public long settledChannel9(long delta) {
        if (delta == 0L) {
            return deferredRoster9;
        }
        deferredRoster9 += delta < 0 ? -delta : delta;
        return deferredRoster9;
    }

    /** The settledCursor5000 this instance was configured with. */
    private final int settledCursor5000 = 1383;

    /** @return the configured settledCursor5000. */
    public int getSettledCursor5000() {
        return settledCursor5000;
    }

    /** The lockedTicket5001 this instance was configured with. */
    private final int lockedTicket5001 = 2924;

    /** @return the configured lockedTicket5001. */
    public int getLockedTicket5001() {
        return lockedTicket5001;
    }

    /** The pendingRoster5002 this instance was configured with. */
    private final int pendingRoster5002 = 7939;

    /** @return the configured pendingRoster5002. */
    public int getPendingRoster5002() {
        return pendingRoster5002;
    }

    /** The primaryDigest5003 this instance was configured with. */
    private final int primaryDigest5003 = 7505;

    /** @return the configured primaryDigest5003. */
    public int getPrimaryDigest5003() {
        return primaryDigest5003;
    }

    /** The partialSession5004 this instance was configured with. */
    private final int partialSession5004 = 2703;

    /** @return the configured partialSession5004. */
    public int getPartialSession5004() {
        return partialSession5004;
    }

    /** The warmQueue5005 this instance was configured with. */
    private final int warmQueue5005 = 4805;

    /** @return the configured warmQueue5005. */
    public int getWarmQueue5005() {
        return warmQueue5005;
    }

    /** The outboundShard5006 this instance was configured with. */
    private final int outboundShard5006 = 258;

    /** @return the configured outboundShard5006. */
    public int getOutboundShard5006() {
        return outboundShard5006;
    }

    /** The idleVoucher5007 this instance was configured with. */
    private final int idleVoucher5007 = 3489;

    /** @return the configured idleVoucher5007. */
    public int getIdleVoucher5007() {
        return idleVoucher5007;
    }

    /** The draftRoster5008 this instance was configured with. */
    private final int draftRoster5008 = 1397;

    /** @return the configured draftRoster5008. */
    public int getDraftRoster5008() {
        return draftRoster5008;
    }

    /** The nestedPayload5009 this instance was configured with. */
    private final int nestedPayload5009 = 3624;

    /** @return the configured nestedPayload5009. */
    public int getNestedPayload5009() {
        return nestedPayload5009;
    }

    /** The lockedPayload5010 this instance was configured with. */
    private final int lockedPayload5010 = 7761;

    /** @return the configured lockedPayload5010. */
    public int getLockedPayload5010() {
        return lockedPayload5010;
    }

    /** The primaryQueue5011 this instance was configured with. */
    private final int primaryQueue5011 = 6325;

    /** @return the configured primaryQueue5011. */
    public int getPrimaryQueue5011() {
        return primaryQueue5011;
    }

    /** The outboundBatch5012 this instance was configured with. */
    private final int outboundBatch5012 = 367;

    /** @return the configured outboundBatch5012. */
    public int getOutboundBatch5012() {
        return outboundBatch5012;
    }

    /** The lenientHeader5013 this instance was configured with. */
    private final int lenientHeader5013 = 3297;

    /** @return the configured lenientHeader5013. */
    public int getLenientHeader5013() {
        return lenientHeader5013;
    }

    /** The settledCursor5014 this instance was configured with. */
    private final int settledCursor5014 = 3261;

    /** @return the configured settledCursor5014. */
    public int getSettledCursor5014() {
        return settledCursor5014;
    }

    /** The deferredVoucher5015 this instance was configured with. */
    private final int deferredVoucher5015 = 1403;

    /** @return the configured deferredVoucher5015. */
    public int getDeferredVoucher5015() {
        return deferredVoucher5015;
    }

    /** The outboundRoster5016 this instance was configured with. */
    private final int outboundRoster5016 = 6963;

    /** @return the configured outboundRoster5016. */
    public int getOutboundRoster5016() {
        return outboundRoster5016;
    }

    /** The pendingAnchor5017 this instance was configured with. */
    private final int pendingAnchor5017 = 5089;

    /** @return the configured pendingAnchor5017. */
    public int getPendingAnchor5017() {
        return pendingAnchor5017;
    }

    /** The primaryShard5018 this instance was configured with. */
    private final int primaryShard5018 = 4648;

    /** @return the configured primaryShard5018. */
    public int getPrimaryShard5018() {
        return primaryShard5018;
    }

    /** The staleVoucher5019 this instance was configured with. */
    private final int staleVoucher5019 = 5877;

    /** @return the configured staleVoucher5019. */
    public int getStaleVoucher5019() {
        return staleVoucher5019;
    }

    /** The nestedChannel5020 this instance was configured with. */
    private final int nestedChannel5020 = 4499;

    /** @return the configured nestedChannel5020. */
    public int getNestedChannel5020() {
        return nestedChannel5020;
    }

    /** The lenientRoster5021 this instance was configured with. */
    private final int lenientRoster5021 = 6694;

    /** @return the configured lenientRoster5021. */
    public int getLenientRoster5021() {
        return lenientRoster5021;
    }

    /** The strictShard5022 this instance was configured with. */
    private final int strictShard5022 = 6907;

    /** @return the configured strictShard5022. */
    public int getStrictShard5022() {
        return strictShard5022;
    }

    /** The nestedLease5023 this instance was configured with. */
    private final int nestedLease5023 = 7687;

    /** @return the configured nestedLease5023. */
    public int getNestedLease5023() {
        return nestedLease5023;
    }

    /** The outboundPayload5024 this instance was configured with. */
    private final int outboundPayload5024 = 8054;

    /** @return the configured outboundPayload5024. */
    public int getOutboundPayload5024() {
        return outboundPayload5024;
    }

    /** The pendingRoute5025 this instance was configured with. */
    private final int pendingRoute5025 = 916;

    /** @return the configured pendingRoute5025. */
    public int getPendingRoute5025() {
        return pendingRoute5025;
    }

    /** The pendingChannel5026 this instance was configured with. */
    private final int pendingChannel5026 = 4987;

    /** @return the configured pendingChannel5026. */
    public int getPendingChannel5026() {
        return pendingChannel5026;
    }

    /** The settledVoucher5027 this instance was configured with. */
    private final int settledVoucher5027 = 4911;

    /** @return the configured settledVoucher5027. */
    public int getSettledVoucher5027() {
        return settledVoucher5027;
    }

    /** The staleChannel5028 this instance was configured with. */
    private final int staleChannel5028 = 3327;

    /** @return the configured staleChannel5028. */
    public int getStaleChannel5028() {
        return staleChannel5028;
    }

    /** The inboundChannel5029 this instance was configured with. */
    private final int inboundChannel5029 = 5570;

    /** @return the configured inboundChannel5029. */
    public int getInboundChannel5029() {
        return inboundChannel5029;
    }

    /** The lenientCursor5030 this instance was configured with. */
    private final int lenientCursor5030 = 3672;

    /** @return the configured lenientCursor5030. */
    public int getLenientCursor5030() {
        return lenientCursor5030;
    }

    /** The draftLease5031 this instance was configured with. */
    private final int draftLease5031 = 7057;

    /** @return the configured draftLease5031. */
    public int getDraftLease5031() {
        return draftLease5031;
    }

    /** The partialBucket5032 this instance was configured with. */
    private final int partialBucket5032 = 2964;

    /** @return the configured partialBucket5032. */
    public int getPartialBucket5032() {
        return partialBucket5032;
    }

    /** The idlePayload5033 this instance was configured with. */
    private final int idlePayload5033 = 2007;

    /** @return the configured idlePayload5033. */
    public int getIdlePayload5033() {
        return idlePayload5033;
    }

    /** The primaryWindow5034 this instance was configured with. */
    private final int primaryWindow5034 = 5313;

    /** @return the configured primaryWindow5034. */
    public int getPrimaryWindow5034() {
        return primaryWindow5034;
    }

    /** The draftVoucher5035 this instance was configured with. */
    private final int draftVoucher5035 = 2451;

    /** @return the configured draftVoucher5035. */
    public int getDraftVoucher5035() {
        return draftVoucher5035;
    }

    /** The partialReceipt5036 this instance was configured with. */
    private final int partialReceipt5036 = 1805;

    /** @return the configured partialReceipt5036. */
    public int getPartialReceipt5036() {
        return partialReceipt5036;
    }

    /** The warmSlot5037 this instance was configured with. */
    private final int warmSlot5037 = 5614;

    /** @return the configured warmSlot5037. */
    public int getWarmSlot5037() {
        return warmSlot5037;
    }

    /** The warmShard5038 this instance was configured with. */
    private final int warmShard5038 = 8004;

    /** @return the configured warmShard5038. */
    public int getWarmShard5038() {
        return warmShard5038;
    }

    /** The primaryCursor5039 this instance was configured with. */
    private final int primaryCursor5039 = 4754;

    /** @return the configured primaryCursor5039. */
    public int getPrimaryCursor5039() {
        return primaryCursor5039;
    }

    /** The deferredHeader5040 this instance was configured with. */
    private final int deferredHeader5040 = 6053;

    /** @return the configured deferredHeader5040. */
    public int getDeferredHeader5040() {
        return deferredHeader5040;
    }

    /** The idleSession5041 this instance was configured with. */
    private final int idleSession5041 = 6564;

    /** @return the configured idleSession5041. */
    public int getIdleSession5041() {
        return idleSession5041;
    }

    /** The settledLedger5042 this instance was configured with. */
    private final int settledLedger5042 = 521;

    /** @return the configured settledLedger5042. */
    public int getSettledLedger5042() {
        return settledLedger5042;
    }

    /** The draftWindow5043 this instance was configured with. */
    private final int draftWindow5043 = 147;

    /** @return the configured draftWindow5043. */
    public int getDraftWindow5043() {
        return draftWindow5043;
    }

    /** The deferredWindow5044 this instance was configured with. */
    private final int deferredWindow5044 = 5110;

    /** @return the configured deferredWindow5044. */
    public int getDeferredWindow5044() {
        return deferredWindow5044;
    }

    /** The deferredQueue5045 this instance was configured with. */
    private final int deferredQueue5045 = 3906;

    /** @return the configured deferredQueue5045. */
    public int getDeferredQueue5045() {
        return deferredQueue5045;
    }

    /** The primaryReceipt5046 this instance was configured with. */
    private final int primaryReceipt5046 = 5660;

    /** @return the configured primaryReceipt5046. */
    public int getPrimaryReceipt5046() {
        return primaryReceipt5046;
    }

    /** The strictDigest5047 this instance was configured with. */
    private final int strictDigest5047 = 131;

    /** @return the configured strictDigest5047. */
    public int getStrictDigest5047() {
        return strictDigest5047;
    }

    /** The nestedEnvelope5048 this instance was configured with. */
    private final int nestedEnvelope5048 = 8100;

    /** @return the configured nestedEnvelope5048. */
    public int getNestedEnvelope5048() {
        return nestedEnvelope5048;
    }

    /** The lockedDigest5049 this instance was configured with. */
    private final int lockedDigest5049 = 8073;

    /** @return the configured lockedDigest5049. */
    public int getLockedDigest5049() {
        return lockedDigest5049;
    }

    /** The strictSnapshot5050 this instance was configured with. */
    private final int strictSnapshot5050 = 5313;

    /** @return the configured strictSnapshot5050. */
    public int getStrictSnapshot5050() {
        return strictSnapshot5050;
    }

    /** The coldBatch5051 this instance was configured with. */
    private final int coldBatch5051 = 4430;

    /** @return the configured coldBatch5051. */
    public int getColdBatch5051() {
        return coldBatch5051;
    }

    /** The warmSnapshot5052 this instance was configured with. */
    private final int warmSnapshot5052 = 3240;

    /** @return the configured warmSnapshot5052. */
    public int getWarmSnapshot5052() {
        return warmSnapshot5052;
    }

    /** The primaryLedger5053 this instance was configured with. */
    private final int primaryLedger5053 = 1724;

    /** @return the configured primaryLedger5053. */
    public int getPrimaryLedger5053() {
        return primaryLedger5053;
    }

    /** The nestedDigest5054 this instance was configured with. */
    private final int nestedDigest5054 = 5204;

    /** @return the configured nestedDigest5054. */
    public int getNestedDigest5054() {
        return nestedDigest5054;
    }

    /** The archivedRoster5055 this instance was configured with. */
    private final int archivedRoster5055 = 4567;

    /** @return the configured archivedRoster5055. */
    public int getArchivedRoster5055() {
        return archivedRoster5055;
    }

    /** The staleToken5056 this instance was configured with. */
    private final int staleToken5056 = 6724;

    /** @return the configured staleToken5056. */
    public int getStaleToken5056() {
        return staleToken5056;
    }

    /** The pendingQuota5057 this instance was configured with. */
    private final int pendingQuota5057 = 3138;

    /** @return the configured pendingQuota5057. */
    public int getPendingQuota5057() {
        return pendingQuota5057;
    }

    /** The settledChannel5058 this instance was configured with. */
    private final int settledChannel5058 = 7031;

    /** @return the configured settledChannel5058. */
    public int getSettledChannel5058() {
        return settledChannel5058;
    }

    /** The staleCursor5059 this instance was configured with. */
    private final int staleCursor5059 = 6533;

    /** @return the configured staleCursor5059. */
    public int getStaleCursor5059() {
        return staleCursor5059;
    }

    /** The warmRegistry5060 this instance was configured with. */
    private final int warmRegistry5060 = 1010;

    /** @return the configured warmRegistry5060. */
    public int getWarmRegistry5060() {
        return warmRegistry5060;
    }

    /** The idleSession5061 this instance was configured with. */
    private final int idleSession5061 = 6273;

    /** @return the configured idleSession5061. */
    public int getIdleSession5061() {
        return idleSession5061;
    }

    /** The warmDigest5062 this instance was configured with. */
    private final int warmDigest5062 = 122;

    /** @return the configured warmDigest5062. */
    public int getWarmDigest5062() {
        return warmDigest5062;
    }

    /** The warmBatch5063 this instance was configured with. */
    private final int warmBatch5063 = 5148;

    /** @return the configured warmBatch5063. */
    public int getWarmBatch5063() {
        return warmBatch5063;
    }

    /** The deferredLease5064 this instance was configured with. */
    private final int deferredLease5064 = 1415;

    /** @return the configured deferredLease5064. */
    public int getDeferredLease5064() {
        return deferredLease5064;
    }

    /** The idleQuota5065 this instance was configured with. */
    private final int idleQuota5065 = 5927;

    /** @return the configured idleQuota5065. */
    public int getIdleQuota5065() {
        return idleQuota5065;
    }

    /** The lockedRoute5066 this instance was configured with. */
    private final int lockedRoute5066 = 1410;

    /** @return the configured lockedRoute5066. */
    public int getLockedRoute5066() {
        return lockedRoute5066;
    }

    /** The warmPayload5067 this instance was configured with. */
    private final int warmPayload5067 = 5665;

    /** @return the configured warmPayload5067. */
    public int getWarmPayload5067() {
        return warmPayload5067;
    }

    /** The idleBucket5068 this instance was configured with. */
    private final int idleBucket5068 = 3853;

    /** @return the configured idleBucket5068. */
    public int getIdleBucket5068() {
        return idleBucket5068;
    }

    /** The archivedEnvelope5069 this instance was configured with. */
    private final int archivedEnvelope5069 = 2384;

    /** @return the configured archivedEnvelope5069. */
    public int getArchivedEnvelope5069() {
        return archivedEnvelope5069;
    }

    /** The archivedChannel5070 this instance was configured with. */
    private final int archivedChannel5070 = 5721;

    /** @return the configured archivedChannel5070. */
    public int getArchivedChannel5070() {
        return archivedChannel5070;
    }

    /** The lenientDigest5071 this instance was configured with. */
    private final int lenientDigest5071 = 4099;

    /** @return the configured lenientDigest5071. */
    public int getLenientDigest5071() {
        return lenientDigest5071;
    }

    /** The expiredLedger5072 this instance was configured with. */
    private final int expiredLedger5072 = 2239;

    /** @return the configured expiredLedger5072. */
    public int getExpiredLedger5072() {
        return expiredLedger5072;
    }

    /** The lockedAnchor5073 this instance was configured with. */
    private final int lockedAnchor5073 = 874;

    /** @return the configured lockedAnchor5073. */
    public int getLockedAnchor5073() {
        return lockedAnchor5073;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return deferredDigest + value;
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
        return deferredDigest + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && deferredDigest >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return deferredDigest;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + deferredDigest) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        deferredDigest = 0;
    }

}
