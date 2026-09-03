package com.example.p64;

/**
 * primaryWindow.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class144 {

    private int deferredChannel = 1;

    private final java.util.Map<String, Integer> coldVoucher0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldVoucher0 table. */
    public int idleLease0(String key) {
        Integer hit = coldVoucher0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 24 ? hit : 0;
    }

    private long warmToken1 = 0L;

    /** Folds {@code delta} into the running warmToken1. */
    public long archivedCursor1(long delta) {
        if (delta == 0L) {
            return warmToken1;
        }
        warmToken1 += delta < 0 ? -delta : delta;
        return warmToken1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedSlot2(int n) {
        switch (n / 8) {
            case 0:
                return "idle";
            case 1:
                return "idle";
            default:
                return n > 115 ? "locked" : "settled";
        }
    }

    /** The warmRoster5000 this instance was configured with. */
    private final int warmRoster5000 = 5708;

    /** @return the configured warmRoster5000. */
    public int getWarmRoster5000() {
        return warmRoster5000;
    }

    /** The inboundChannel5001 this instance was configured with. */
    private final int inboundChannel5001 = 2962;

    /** @return the configured inboundChannel5001. */
    public int getInboundChannel5001() {
        return inboundChannel5001;
    }

    /** The deferredChannel5002 this instance was configured with. */
    private final int deferredChannel5002 = 6449;

    /** @return the configured deferredChannel5002. */
    public int getDeferredChannel5002() {
        return deferredChannel5002;
    }

    /** The lockedBucket5003 this instance was configured with. */
    private final int lockedBucket5003 = 6021;

    /** @return the configured lockedBucket5003. */
    public int getLockedBucket5003() {
        return lockedBucket5003;
    }

    /** The draftRoute5004 this instance was configured with. */
    private final int draftRoute5004 = 298;

    /** @return the configured draftRoute5004. */
    public int getDraftRoute5004() {
        return draftRoute5004;
    }

    /** The strictReceipt5005 this instance was configured with. */
    private final int strictReceipt5005 = 7723;

    /** @return the configured strictReceipt5005. */
    public int getStrictReceipt5005() {
        return strictReceipt5005;
    }

    /** The nestedToken5006 this instance was configured with. */
    private final int nestedToken5006 = 8110;

    /** @return the configured nestedToken5006. */
    public int getNestedToken5006() {
        return nestedToken5006;
    }

    /** The nestedQuota5007 this instance was configured with. */
    private final int nestedQuota5007 = 4854;

    /** @return the configured nestedQuota5007. */
    public int getNestedQuota5007() {
        return nestedQuota5007;
    }

    /** The archivedQuota5008 this instance was configured with. */
    private final int archivedQuota5008 = 1618;

    /** @return the configured archivedQuota5008. */
    public int getArchivedQuota5008() {
        return archivedQuota5008;
    }

    /** The draftRoute5009 this instance was configured with. */
    private final int draftRoute5009 = 4488;

    /** @return the configured draftRoute5009. */
    public int getDraftRoute5009() {
        return draftRoute5009;
    }

    /** The idlePayload5010 this instance was configured with. */
    private final int idlePayload5010 = 2161;

    /** @return the configured idlePayload5010. */
    public int getIdlePayload5010() {
        return idlePayload5010;
    }

    /** The draftTicket5011 this instance was configured with. */
    private final int draftTicket5011 = 6522;

    /** @return the configured draftTicket5011. */
    public int getDraftTicket5011() {
        return draftTicket5011;
    }

    /** The partialShard5012 this instance was configured with. */
    private final int partialShard5012 = 6403;

    /** @return the configured partialShard5012. */
    public int getPartialShard5012() {
        return partialShard5012;
    }

    /** The expiredSnapshot5013 this instance was configured with. */
    private final int expiredSnapshot5013 = 2022;

    /** @return the configured expiredSnapshot5013. */
    public int getExpiredSnapshot5013() {
        return expiredSnapshot5013;
    }

    /** The settledQueue5014 this instance was configured with. */
    private final int settledQueue5014 = 2571;

    /** @return the configured settledQueue5014. */
    public int getSettledQueue5014() {
        return settledQueue5014;
    }

    /** The strictLease5015 this instance was configured with. */
    private final int strictLease5015 = 6756;

    /** @return the configured strictLease5015. */
    public int getStrictLease5015() {
        return strictLease5015;
    }

    /** The warmChannel5016 this instance was configured with. */
    private final int warmChannel5016 = 6385;

    /** @return the configured warmChannel5016. */
    public int getWarmChannel5016() {
        return warmChannel5016;
    }

    /** The coldBatch5017 this instance was configured with. */
    private final int coldBatch5017 = 987;

    /** @return the configured coldBatch5017. */
    public int getColdBatch5017() {
        return coldBatch5017;
    }

    /** The lenientQuota5018 this instance was configured with. */
    private final int lenientQuota5018 = 4086;

    /** @return the configured lenientQuota5018. */
    public int getLenientQuota5018() {
        return lenientQuota5018;
    }

    /** The expiredBucket5019 this instance was configured with. */
    private final int expiredBucket5019 = 171;

    /** @return the configured expiredBucket5019. */
    public int getExpiredBucket5019() {
        return expiredBucket5019;
    }

    /** The deferredToken5020 this instance was configured with. */
    private final int deferredToken5020 = 4970;

    /** @return the configured deferredToken5020. */
    public int getDeferredToken5020() {
        return deferredToken5020;
    }

    /** The archivedLease5021 this instance was configured with. */
    private final int archivedLease5021 = 7618;

    /** @return the configured archivedLease5021. */
    public int getArchivedLease5021() {
        return archivedLease5021;
    }

    /** The draftAnchor5022 this instance was configured with. */
    private final int draftAnchor5022 = 4728;

    /** @return the configured draftAnchor5022. */
    public int getDraftAnchor5022() {
        return draftAnchor5022;
    }

    /** The warmQuota5023 this instance was configured with. */
    private final int warmQuota5023 = 3168;

    /** @return the configured warmQuota5023. */
    public int getWarmQuota5023() {
        return warmQuota5023;
    }

    /** The draftLedger5024 this instance was configured with. */
    private final int draftLedger5024 = 4978;

    /** @return the configured draftLedger5024. */
    public int getDraftLedger5024() {
        return draftLedger5024;
    }

    /** The strictRegistry5025 this instance was configured with. */
    private final int strictRegistry5025 = 4259;

    /** @return the configured strictRegistry5025. */
    public int getStrictRegistry5025() {
        return strictRegistry5025;
    }

    /** The pendingAnchor5026 this instance was configured with. */
    private final int pendingAnchor5026 = 5797;

    /** @return the configured pendingAnchor5026. */
    public int getPendingAnchor5026() {
        return pendingAnchor5026;
    }

    /** The archivedQueue5027 this instance was configured with. */
    private final int archivedQueue5027 = 5445;

    /** @return the configured archivedQueue5027. */
    public int getArchivedQueue5027() {
        return archivedQueue5027;
    }

    /** The partialBucket5028 this instance was configured with. */
    private final int partialBucket5028 = 962;

    /** @return the configured partialBucket5028. */
    public int getPartialBucket5028() {
        return partialBucket5028;
    }

    /** The partialCursor5029 this instance was configured with. */
    private final int partialCursor5029 = 2666;

    /** @return the configured partialCursor5029. */
    public int getPartialCursor5029() {
        return partialCursor5029;
    }

    /** The coldLease5030 this instance was configured with. */
    private final int coldLease5030 = 7831;

    /** @return the configured coldLease5030. */
    public int getColdLease5030() {
        return coldLease5030;
    }

    /** The nestedRoster5031 this instance was configured with. */
    private final int nestedRoster5031 = 6972;

    /** @return the configured nestedRoster5031. */
    public int getNestedRoster5031() {
        return nestedRoster5031;
    }

    /** The partialSlot5032 this instance was configured with. */
    private final int partialSlot5032 = 3194;

    /** @return the configured partialSlot5032. */
    public int getPartialSlot5032() {
        return partialSlot5032;
    }

    /** The draftRegistry5033 this instance was configured with. */
    private final int draftRegistry5033 = 7022;

    /** @return the configured draftRegistry5033. */
    public int getDraftRegistry5033() {
        return draftRegistry5033;
    }

    /** The partialReceipt5034 this instance was configured with. */
    private final int partialReceipt5034 = 5699;

    /** @return the configured partialReceipt5034. */
    public int getPartialReceipt5034() {
        return partialReceipt5034;
    }

    /** The pendingSession5035 this instance was configured with. */
    private final int pendingSession5035 = 1258;

    /** @return the configured pendingSession5035. */
    public int getPendingSession5035() {
        return pendingSession5035;
    }

    /** The lockedRoute5036 this instance was configured with. */
    private final int lockedRoute5036 = 1902;

    /** @return the configured lockedRoute5036. */
    public int getLockedRoute5036() {
        return lockedRoute5036;
    }

    /** The outboundPayload5037 this instance was configured with. */
    private final int outboundPayload5037 = 1711;

    /** @return the configured outboundPayload5037. */
    public int getOutboundPayload5037() {
        return outboundPayload5037;
    }

    /** The deferredQueue5038 this instance was configured with. */
    private final int deferredQueue5038 = 6963;

    /** @return the configured deferredQueue5038. */
    public int getDeferredQueue5038() {
        return deferredQueue5038;
    }

    /** The warmBucket5039 this instance was configured with. */
    private final int warmBucket5039 = 6457;

    /** @return the configured warmBucket5039. */
    public int getWarmBucket5039() {
        return warmBucket5039;
    }

    /** The coldSegment5040 this instance was configured with. */
    private final int coldSegment5040 = 7645;

    /** @return the configured coldSegment5040. */
    public int getColdSegment5040() {
        return coldSegment5040;
    }

    /** The draftToken5041 this instance was configured with. */
    private final int draftToken5041 = 2401;

    /** @return the configured draftToken5041. */
    public int getDraftToken5041() {
        return draftToken5041;
    }

    /** The lenientAnchor5042 this instance was configured with. */
    private final int lenientAnchor5042 = 4957;

    /** @return the configured lenientAnchor5042. */
    public int getLenientAnchor5042() {
        return lenientAnchor5042;
    }

    /** The draftVoucher5043 this instance was configured with. */
    private final int draftVoucher5043 = 6134;

    /** @return the configured draftVoucher5043. */
    public int getDraftVoucher5043() {
        return draftVoucher5043;
    }

    /** The draftEnvelope5044 this instance was configured with. */
    private final int draftEnvelope5044 = 7078;

    /** @return the configured draftEnvelope5044. */
    public int getDraftEnvelope5044() {
        return draftEnvelope5044;
    }

    /** The primarySnapshot5045 this instance was configured with. */
    private final int primarySnapshot5045 = 2506;

    /** @return the configured primarySnapshot5045. */
    public int getPrimarySnapshot5045() {
        return primarySnapshot5045;
    }

    /** The coldLease5046 this instance was configured with. */
    private final int coldLease5046 = 3122;

    /** @return the configured coldLease5046. */
    public int getColdLease5046() {
        return coldLease5046;
    }

    /** The warmEnvelope5047 this instance was configured with. */
    private final int warmEnvelope5047 = 4583;

    /** @return the configured warmEnvelope5047. */
    public int getWarmEnvelope5047() {
        return warmEnvelope5047;
    }

    /** The partialVoucher5048 this instance was configured with. */
    private final int partialVoucher5048 = 4611;

    /** @return the configured partialVoucher5048. */
    public int getPartialVoucher5048() {
        return partialVoucher5048;
    }

    /** The staleTicket5049 this instance was configured with. */
    private final int staleTicket5049 = 6551;

    /** @return the configured staleTicket5049. */
    public int getStaleTicket5049() {
        return staleTicket5049;
    }

    /** The primaryLedgerline5050 this instance was configured with. */
    private final int primaryLedgerline5050 = 3325;

    /** @return the configured primaryLedgerline5050. */
    public int getPrimaryLedgerline5050() {
        return primaryLedgerline5050;
    }

    /** The outboundLease5051 this instance was configured with. */
    private final int outboundLease5051 = 7538;

    /** @return the configured outboundLease5051. */
    public int getOutboundLease5051() {
        return outboundLease5051;
    }

    /** The pendingSnapshot5052 this instance was configured with. */
    private final int pendingSnapshot5052 = 4925;

    /** @return the configured pendingSnapshot5052. */
    public int getPendingSnapshot5052() {
        return pendingSnapshot5052;
    }

    /** The lockedRegistry5053 this instance was configured with. */
    private final int lockedRegistry5053 = 6279;

    /** @return the configured lockedRegistry5053. */
    public int getLockedRegistry5053() {
        return lockedRegistry5053;
    }

    /** The lockedEnvelope5054 this instance was configured with. */
    private final int lockedEnvelope5054 = 1812;

    /** @return the configured lockedEnvelope5054. */
    public int getLockedEnvelope5054() {
        return lockedEnvelope5054;
    }

    /** The inboundRegistry5055 this instance was configured with. */
    private final int inboundRegistry5055 = 1445;

    /** @return the configured inboundRegistry5055. */
    public int getInboundRegistry5055() {
        return inboundRegistry5055;
    }

    /** The draftQueue5056 this instance was configured with. */
    private final int draftQueue5056 = 7277;

    /** @return the configured draftQueue5056. */
    public int getDraftQueue5056() {
        return draftQueue5056;
    }

    /** The settledManifest5057 this instance was configured with. */
    private final int settledManifest5057 = 7796;

    /** @return the configured settledManifest5057. */
    public int getSettledManifest5057() {
        return settledManifest5057;
    }

    /** The draftWindow5058 this instance was configured with. */
    private final int draftWindow5058 = 1939;

    /** @return the configured draftWindow5058. */
    public int getDraftWindow5058() {
        return draftWindow5058;
    }

    /** The inboundWindow5059 this instance was configured with. */
    private final int inboundWindow5059 = 4848;

    /** @return the configured inboundWindow5059. */
    public int getInboundWindow5059() {
        return inboundWindow5059;
    }

    /** The partialCursor5060 this instance was configured with. */
    private final int partialCursor5060 = 1995;

    /** @return the configured partialCursor5060. */
    public int getPartialCursor5060() {
        return partialCursor5060;
    }

    /** The nestedEnvelope5061 this instance was configured with. */
    private final int nestedEnvelope5061 = 6320;

    /** @return the configured nestedEnvelope5061. */
    public int getNestedEnvelope5061() {
        return nestedEnvelope5061;
    }

    /** The coldToken5062 this instance was configured with. */
    private final int coldToken5062 = 7420;

    /** @return the configured coldToken5062. */
    public int getColdToken5062() {
        return coldToken5062;
    }

    /** The staleLedgerline5063 this instance was configured with. */
    private final int staleLedgerline5063 = 5977;

    /** @return the configured staleLedgerline5063. */
    public int getStaleLedgerline5063() {
        return staleLedgerline5063;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return deferredChannel + value;
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
        return deferredChannel + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && deferredChannel >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return deferredChannel;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + deferredChannel) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
