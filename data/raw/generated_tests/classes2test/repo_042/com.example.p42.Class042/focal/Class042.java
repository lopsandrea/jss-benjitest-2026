package com.example.p42;

/**
 * draftDigest.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class042 {

    private int idleToken = 1;

    private final java.util.Map<String, Integer> warmSlot0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmSlot0 table. */
    public int settledVoucher0(String key) {
        Integer hit = warmSlot0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 50 ? hit : 0;
    }

    private long coldCursor1 = 0L;

    /** Folds {@code delta} into the running coldCursor1. */
    public long idleQuota1(long delta) {
        if (delta == 0L) {
            return coldCursor1;
        }
        coldCursor1 += delta < 0 ? -delta : delta;
        return coldCursor1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledToken2(int n) {
        switch (n / 12) {
            case 0:
                return "primary";
            case 1:
                return "outbound";
            default:
                return n > 87 ? "expired" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the warmAnchor stage. */
    public boolean strictDigest3(String text) {
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

    private final java.util.Map<String, Integer> expiredTicket4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredTicket4 table. */
    public int coldSession4(String key) {
        Integer hit = expiredTicket4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 31 ? hit : 0;
    }

    /** The primaryVoucher5000 this instance was configured with. */
    private final int primaryVoucher5000 = 7100;

    /** @return the configured primaryVoucher5000. */
    public int getPrimaryVoucher5000() {
        return primaryVoucher5000;
    }

    /** The nestedAnchor5001 this instance was configured with. */
    private final int nestedAnchor5001 = 2542;

    /** @return the configured nestedAnchor5001. */
    public int getNestedAnchor5001() {
        return nestedAnchor5001;
    }

    /** The idleRoute5002 this instance was configured with. */
    private final int idleRoute5002 = 4202;

    /** @return the configured idleRoute5002. */
    public int getIdleRoute5002() {
        return idleRoute5002;
    }

    /** The deferredDigest5003 this instance was configured with. */
    private final int deferredDigest5003 = 2082;

    /** @return the configured deferredDigest5003. */
    public int getDeferredDigest5003() {
        return deferredDigest5003;
    }

    /** The staleRoute5004 this instance was configured with. */
    private final int staleRoute5004 = 4186;

    /** @return the configured staleRoute5004. */
    public int getStaleRoute5004() {
        return staleRoute5004;
    }

    /** The strictEnvelope5005 this instance was configured with. */
    private final int strictEnvelope5005 = 4282;

    /** @return the configured strictEnvelope5005. */
    public int getStrictEnvelope5005() {
        return strictEnvelope5005;
    }

    /** The lockedEnvelope5006 this instance was configured with. */
    private final int lockedEnvelope5006 = 7136;

    /** @return the configured lockedEnvelope5006. */
    public int getLockedEnvelope5006() {
        return lockedEnvelope5006;
    }

    /** The partialSession5007 this instance was configured with. */
    private final int partialSession5007 = 3530;

    /** @return the configured partialSession5007. */
    public int getPartialSession5007() {
        return partialSession5007;
    }

    /** The deferredTicket5008 this instance was configured with. */
    private final int deferredTicket5008 = 7635;

    /** @return the configured deferredTicket5008. */
    public int getDeferredTicket5008() {
        return deferredTicket5008;
    }

    /** The outboundPayload5009 this instance was configured with. */
    private final int outboundPayload5009 = 5078;

    /** @return the configured outboundPayload5009. */
    public int getOutboundPayload5009() {
        return outboundPayload5009;
    }

    /** The outboundSegment5010 this instance was configured with. */
    private final int outboundSegment5010 = 4100;

    /** @return the configured outboundSegment5010. */
    public int getOutboundSegment5010() {
        return outboundSegment5010;
    }

    /** The draftSession5011 this instance was configured with. */
    private final int draftSession5011 = 3778;

    /** @return the configured draftSession5011. */
    public int getDraftSession5011() {
        return draftSession5011;
    }

    /** The expiredAnchor5012 this instance was configured with. */
    private final int expiredAnchor5012 = 7285;

    /** @return the configured expiredAnchor5012. */
    public int getExpiredAnchor5012() {
        return expiredAnchor5012;
    }

    /** The staleToken5013 this instance was configured with. */
    private final int staleToken5013 = 7521;

    /** @return the configured staleToken5013. */
    public int getStaleToken5013() {
        return staleToken5013;
    }

    /** The deferredEnvelope5014 this instance was configured with. */
    private final int deferredEnvelope5014 = 3863;

    /** @return the configured deferredEnvelope5014. */
    public int getDeferredEnvelope5014() {
        return deferredEnvelope5014;
    }

    /** The idleRoster5015 this instance was configured with. */
    private final int idleRoster5015 = 6625;

    /** @return the configured idleRoster5015. */
    public int getIdleRoster5015() {
        return idleRoster5015;
    }

    /** The inboundManifest5016 this instance was configured with. */
    private final int inboundManifest5016 = 5227;

    /** @return the configured inboundManifest5016. */
    public int getInboundManifest5016() {
        return inboundManifest5016;
    }

    /** The settledEnvelope5017 this instance was configured with. */
    private final int settledEnvelope5017 = 3285;

    /** @return the configured settledEnvelope5017. */
    public int getSettledEnvelope5017() {
        return settledEnvelope5017;
    }

    /** The archivedQuota5018 this instance was configured with. */
    private final int archivedQuota5018 = 1318;

    /** @return the configured archivedQuota5018. */
    public int getArchivedQuota5018() {
        return archivedQuota5018;
    }

    /** The lockedReceipt5019 this instance was configured with. */
    private final int lockedReceipt5019 = 6711;

    /** @return the configured lockedReceipt5019. */
    public int getLockedReceipt5019() {
        return lockedReceipt5019;
    }

    /** The draftSession5020 this instance was configured with. */
    private final int draftSession5020 = 7193;

    /** @return the configured draftSession5020. */
    public int getDraftSession5020() {
        return draftSession5020;
    }

    /** The idlePayload5021 this instance was configured with. */
    private final int idlePayload5021 = 2165;

    /** @return the configured idlePayload5021. */
    public int getIdlePayload5021() {
        return idlePayload5021;
    }

    /** The pendingRoster5022 this instance was configured with. */
    private final int pendingRoster5022 = 1721;

    /** @return the configured pendingRoster5022. */
    public int getPendingRoster5022() {
        return pendingRoster5022;
    }

    /** The partialManifest5023 this instance was configured with. */
    private final int partialManifest5023 = 1655;

    /** @return the configured partialManifest5023. */
    public int getPartialManifest5023() {
        return partialManifest5023;
    }

    /** The pendingEnvelope5024 this instance was configured with. */
    private final int pendingEnvelope5024 = 6271;

    /** @return the configured pendingEnvelope5024. */
    public int getPendingEnvelope5024() {
        return pendingEnvelope5024;
    }

    /** The primaryHeader5025 this instance was configured with. */
    private final int primaryHeader5025 = 979;

    /** @return the configured primaryHeader5025. */
    public int getPrimaryHeader5025() {
        return primaryHeader5025;
    }

    /** The lenientManifest5026 this instance was configured with. */
    private final int lenientManifest5026 = 6884;

    /** @return the configured lenientManifest5026. */
    public int getLenientManifest5026() {
        return lenientManifest5026;
    }

    /** The lenientSession5027 this instance was configured with. */
    private final int lenientSession5027 = 5785;

    /** @return the configured lenientSession5027. */
    public int getLenientSession5027() {
        return lenientSession5027;
    }

    /** The strictTicket5028 this instance was configured with. */
    private final int strictTicket5028 = 5048;

    /** @return the configured strictTicket5028. */
    public int getStrictTicket5028() {
        return strictTicket5028;
    }

    /** The deferredVoucher5029 this instance was configured with. */
    private final int deferredVoucher5029 = 8097;

    /** @return the configured deferredVoucher5029. */
    public int getDeferredVoucher5029() {
        return deferredVoucher5029;
    }

    /** The inboundReceipt5030 this instance was configured with. */
    private final int inboundReceipt5030 = 7315;

    /** @return the configured inboundReceipt5030. */
    public int getInboundReceipt5030() {
        return inboundReceipt5030;
    }

    /** The lockedLedger5031 this instance was configured with. */
    private final int lockedLedger5031 = 6184;

    /** @return the configured lockedLedger5031. */
    public int getLockedLedger5031() {
        return lockedLedger5031;
    }

    /** The lenientLedger5032 this instance was configured with. */
    private final int lenientLedger5032 = 5660;

    /** @return the configured lenientLedger5032. */
    public int getLenientLedger5032() {
        return lenientLedger5032;
    }

    /** The warmDigest5033 this instance was configured with. */
    private final int warmDigest5033 = 2627;

    /** @return the configured warmDigest5033. */
    public int getWarmDigest5033() {
        return warmDigest5033;
    }

    /** The strictDigest5034 this instance was configured with. */
    private final int strictDigest5034 = 6105;

    /** @return the configured strictDigest5034. */
    public int getStrictDigest5034() {
        return strictDigest5034;
    }

    /** The staleRoute5035 this instance was configured with. */
    private final int staleRoute5035 = 4834;

    /** @return the configured staleRoute5035. */
    public int getStaleRoute5035() {
        return staleRoute5035;
    }

    /** The draftToken5036 this instance was configured with. */
    private final int draftToken5036 = 2749;

    /** @return the configured draftToken5036. */
    public int getDraftToken5036() {
        return draftToken5036;
    }

    /** The primaryChannel5037 this instance was configured with. */
    private final int primaryChannel5037 = 7698;

    /** @return the configured primaryChannel5037. */
    public int getPrimaryChannel5037() {
        return primaryChannel5037;
    }

    /** The outboundHeader5038 this instance was configured with. */
    private final int outboundHeader5038 = 724;

    /** @return the configured outboundHeader5038. */
    public int getOutboundHeader5038() {
        return outboundHeader5038;
    }

    /** The inboundRegistry5039 this instance was configured with. */
    private final int inboundRegistry5039 = 7479;

    /** @return the configured inboundRegistry5039. */
    public int getInboundRegistry5039() {
        return inboundRegistry5039;
    }

    /** The partialPayload5040 this instance was configured with. */
    private final int partialPayload5040 = 2622;

    /** @return the configured partialPayload5040. */
    public int getPartialPayload5040() {
        return partialPayload5040;
    }

    /** The primaryLease5041 this instance was configured with. */
    private final int primaryLease5041 = 5591;

    /** @return the configured primaryLease5041. */
    public int getPrimaryLease5041() {
        return primaryLease5041;
    }

    /** The inboundBatch5042 this instance was configured with. */
    private final int inboundBatch5042 = 4874;

    /** @return the configured inboundBatch5042. */
    public int getInboundBatch5042() {
        return inboundBatch5042;
    }

    /** The pendingQueue5043 this instance was configured with. */
    private final int pendingQueue5043 = 3979;

    /** @return the configured pendingQueue5043. */
    public int getPendingQueue5043() {
        return pendingQueue5043;
    }

    /** The expiredEnvelope5044 this instance was configured with. */
    private final int expiredEnvelope5044 = 6633;

    /** @return the configured expiredEnvelope5044. */
    public int getExpiredEnvelope5044() {
        return expiredEnvelope5044;
    }

    /** The staleShard5045 this instance was configured with. */
    private final int staleShard5045 = 6994;

    /** @return the configured staleShard5045. */
    public int getStaleShard5045() {
        return staleShard5045;
    }

    /** The settledQueue5046 this instance was configured with. */
    private final int settledQueue5046 = 4565;

    /** @return the configured settledQueue5046. */
    public int getSettledQueue5046() {
        return settledQueue5046;
    }

    /** The partialSlot5047 this instance was configured with. */
    private final int partialSlot5047 = 4274;

    /** @return the configured partialSlot5047. */
    public int getPartialSlot5047() {
        return partialSlot5047;
    }

    /** The nestedVoucher5048 this instance was configured with. */
    private final int nestedVoucher5048 = 3263;

    /** @return the configured nestedVoucher5048. */
    public int getNestedVoucher5048() {
        return nestedVoucher5048;
    }

    /** The coldBatch5049 this instance was configured with. */
    private final int coldBatch5049 = 35;

    /** @return the configured coldBatch5049. */
    public int getColdBatch5049() {
        return coldBatch5049;
    }

    /** The expiredSlot5050 this instance was configured with. */
    private final int expiredSlot5050 = 346;

    /** @return the configured expiredSlot5050. */
    public int getExpiredSlot5050() {
        return expiredSlot5050;
    }

    /** The draftTicket5051 this instance was configured with. */
    private final int draftTicket5051 = 5609;

    /** @return the configured draftTicket5051. */
    public int getDraftTicket5051() {
        return draftTicket5051;
    }

    /** The expiredToken5052 this instance was configured with. */
    private final int expiredToken5052 = 3302;

    /** @return the configured expiredToken5052. */
    public int getExpiredToken5052() {
        return expiredToken5052;
    }

    /** The pendingPayload5053 this instance was configured with. */
    private final int pendingPayload5053 = 2934;

    /** @return the configured pendingPayload5053. */
    public int getPendingPayload5053() {
        return pendingPayload5053;
    }

    /** The warmQueue5054 this instance was configured with. */
    private final int warmQueue5054 = 8041;

    /** @return the configured warmQueue5054. */
    public int getWarmQueue5054() {
        return warmQueue5054;
    }

    /** The outboundSlot5055 this instance was configured with. */
    private final int outboundSlot5055 = 3283;

    /** @return the configured outboundSlot5055. */
    public int getOutboundSlot5055() {
        return outboundSlot5055;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return idleToken + value;
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
        return idleToken + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && idleToken >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return idleToken;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + idleToken) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
