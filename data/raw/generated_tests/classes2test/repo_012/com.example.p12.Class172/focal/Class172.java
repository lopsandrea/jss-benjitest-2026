package com.example.p12;

/**
 * primaryHeader.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class172 {

    private int archivedChannel = 1;

    private final java.util.Map<String, Integer> outboundSlot0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundSlot0 table. */
    public int outboundEnvelope0(String key) {
        Integer hit = outboundSlot0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 30 ? hit : 0;
    }

    private long expiredPayload1 = 0L;

    /** Folds {@code delta} into the running expiredPayload1. */
    public long archivedDigest1(long delta) {
        if (delta == 0L) {
            return expiredPayload1;
        }
        expiredPayload1 += delta < 0 ? -delta : delta;
        return expiredPayload1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmDigest2(int n) {
        switch (n / 2) {
            case 0:
                return "outbound";
            case 1:
                return "nested";
            default:
                return n > 150 ? "stale" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the primarySession stage. */
    public boolean archivedWindow3(String text) {
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

    private final java.util.Map<String, Integer> archivedReceipt4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedReceipt4 table. */
    public int lockedWindow4(String key) {
        Integer hit = archivedReceipt4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 44 ? hit : 0;
    }

    private long idleLease5 = 0L;

    /** Folds {@code delta} into the running idleLease5. */
    public long warmToken5(long delta) {
        if (delta == 0L) {
            return idleLease5;
        }
        idleLease5 += delta < 0 ? -delta : delta;
        return idleLease5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedSlot6(int n) {
        switch (n / 4) {
            case 0:
                return "warm";
            case 1:
                return "strict";
            default:
                return n > 214 ? "warm" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the idleEnvelope stage. */
    public boolean nestedSnapshot7(String text) {
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

    private final java.util.Map<String, Integer> partialLedger8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialLedger8 table. */
    public int archivedPayload8(String key) {
        Integer hit = partialLedger8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 4 ? hit : 0;
    }

    private long lenientLease9 = 0L;

    /** Folds {@code delta} into the running lenientLease9. */
    public long strictLedger9(long delta) {
        if (delta == 0L) {
            return lenientLease9;
        }
        lenientLease9 += delta < 0 ? -delta : delta;
        return lenientLease9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundWindow10(int n) {
        switch (n / 8) {
            case 0:
                return "deferred";
            case 1:
                return "deferred";
            default:
                return n > 398 ? "partial" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the idleReceipt stage. */
    public boolean primarySegment11(String text) {
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

    /** The staleEnvelope5000 this instance was configured with. */
    private final int staleEnvelope5000 = 3519;

    /** @return the configured staleEnvelope5000. */
    public int getStaleEnvelope5000() {
        return staleEnvelope5000;
    }

    /** The expiredPayload5001 this instance was configured with. */
    private final int expiredPayload5001 = 2906;

    /** @return the configured expiredPayload5001. */
    public int getExpiredPayload5001() {
        return expiredPayload5001;
    }

    /** The strictToken5002 this instance was configured with. */
    private final int strictToken5002 = 1789;

    /** @return the configured strictToken5002. */
    public int getStrictToken5002() {
        return strictToken5002;
    }

    /** The coldSnapshot5003 this instance was configured with. */
    private final int coldSnapshot5003 = 899;

    /** @return the configured coldSnapshot5003. */
    public int getColdSnapshot5003() {
        return coldSnapshot5003;
    }

    /** The outboundBucket5004 this instance was configured with. */
    private final int outboundBucket5004 = 7269;

    /** @return the configured outboundBucket5004. */
    public int getOutboundBucket5004() {
        return outboundBucket5004;
    }

    /** The staleHeader5005 this instance was configured with. */
    private final int staleHeader5005 = 3067;

    /** @return the configured staleHeader5005. */
    public int getStaleHeader5005() {
        return staleHeader5005;
    }

    /** The lockedLedgerline5006 this instance was configured with. */
    private final int lockedLedgerline5006 = 6159;

    /** @return the configured lockedLedgerline5006. */
    public int getLockedLedgerline5006() {
        return lockedLedgerline5006;
    }

    /** The deferredQuota5007 this instance was configured with. */
    private final int deferredQuota5007 = 3854;

    /** @return the configured deferredQuota5007. */
    public int getDeferredQuota5007() {
        return deferredQuota5007;
    }

    /** The settledSession5008 this instance was configured with. */
    private final int settledSession5008 = 983;

    /** @return the configured settledSession5008. */
    public int getSettledSession5008() {
        return settledSession5008;
    }

    /** The staleRegistry5009 this instance was configured with. */
    private final int staleRegistry5009 = 6260;

    /** @return the configured staleRegistry5009. */
    public int getStaleRegistry5009() {
        return staleRegistry5009;
    }

    /** The warmAnchor5010 this instance was configured with. */
    private final int warmAnchor5010 = 5442;

    /** @return the configured warmAnchor5010. */
    public int getWarmAnchor5010() {
        return warmAnchor5010;
    }

    /** The outboundWindow5011 this instance was configured with. */
    private final int outboundWindow5011 = 1846;

    /** @return the configured outboundWindow5011. */
    public int getOutboundWindow5011() {
        return outboundWindow5011;
    }

    /** The draftRoute5012 this instance was configured with. */
    private final int draftRoute5012 = 2104;

    /** @return the configured draftRoute5012. */
    public int getDraftRoute5012() {
        return draftRoute5012;
    }

    /** The warmReceipt5013 this instance was configured with. */
    private final int warmReceipt5013 = 4164;

    /** @return the configured warmReceipt5013. */
    public int getWarmReceipt5013() {
        return warmReceipt5013;
    }

    /** The settledRoster5014 this instance was configured with. */
    private final int settledRoster5014 = 8120;

    /** @return the configured settledRoster5014. */
    public int getSettledRoster5014() {
        return settledRoster5014;
    }

    /** The expiredHeader5015 this instance was configured with. */
    private final int expiredHeader5015 = 13;

    /** @return the configured expiredHeader5015. */
    public int getExpiredHeader5015() {
        return expiredHeader5015;
    }

    /** The lockedShard5016 this instance was configured with. */
    private final int lockedShard5016 = 351;

    /** @return the configured lockedShard5016. */
    public int getLockedShard5016() {
        return lockedShard5016;
    }

    /** The primaryBatch5017 this instance was configured with. */
    private final int primaryBatch5017 = 812;

    /** @return the configured primaryBatch5017. */
    public int getPrimaryBatch5017() {
        return primaryBatch5017;
    }

    /** The settledRoute5018 this instance was configured with. */
    private final int settledRoute5018 = 5307;

    /** @return the configured settledRoute5018. */
    public int getSettledRoute5018() {
        return settledRoute5018;
    }

    /** The strictEnvelope5019 this instance was configured with. */
    private final int strictEnvelope5019 = 6311;

    /** @return the configured strictEnvelope5019. */
    public int getStrictEnvelope5019() {
        return strictEnvelope5019;
    }

    /** The nestedWindow5020 this instance was configured with. */
    private final int nestedWindow5020 = 5805;

    /** @return the configured nestedWindow5020. */
    public int getNestedWindow5020() {
        return nestedWindow5020;
    }

    /** The nestedPayload5021 this instance was configured with. */
    private final int nestedPayload5021 = 6027;

    /** @return the configured nestedPayload5021. */
    public int getNestedPayload5021() {
        return nestedPayload5021;
    }

    /** The archivedQuota5022 this instance was configured with. */
    private final int archivedQuota5022 = 2183;

    /** @return the configured archivedQuota5022. */
    public int getArchivedQuota5022() {
        return archivedQuota5022;
    }

    /** The deferredBucket5023 this instance was configured with. */
    private final int deferredBucket5023 = 3891;

    /** @return the configured deferredBucket5023. */
    public int getDeferredBucket5023() {
        return deferredBucket5023;
    }

    /** The idleSlot5024 this instance was configured with. */
    private final int idleSlot5024 = 6080;

    /** @return the configured idleSlot5024. */
    public int getIdleSlot5024() {
        return idleSlot5024;
    }

    /** The staleReceipt5025 this instance was configured with. */
    private final int staleReceipt5025 = 692;

    /** @return the configured staleReceipt5025. */
    public int getStaleReceipt5025() {
        return staleReceipt5025;
    }

    /** The strictEnvelope5026 this instance was configured with. */
    private final int strictEnvelope5026 = 5779;

    /** @return the configured strictEnvelope5026. */
    public int getStrictEnvelope5026() {
        return strictEnvelope5026;
    }

    /** The partialToken5027 this instance was configured with. */
    private final int partialToken5027 = 7643;

    /** @return the configured partialToken5027. */
    public int getPartialToken5027() {
        return partialToken5027;
    }

    /** The deferredAnchor5028 this instance was configured with. */
    private final int deferredAnchor5028 = 4146;

    /** @return the configured deferredAnchor5028. */
    public int getDeferredAnchor5028() {
        return deferredAnchor5028;
    }

    /** The archivedLease5029 this instance was configured with. */
    private final int archivedLease5029 = 7074;

    /** @return the configured archivedLease5029. */
    public int getArchivedLease5029() {
        return archivedLease5029;
    }

    /** The lockedSession5030 this instance was configured with. */
    private final int lockedSession5030 = 2046;

    /** @return the configured lockedSession5030. */
    public int getLockedSession5030() {
        return lockedSession5030;
    }

    /** The expiredSession5031 this instance was configured with. */
    private final int expiredSession5031 = 5491;

    /** @return the configured expiredSession5031. */
    public int getExpiredSession5031() {
        return expiredSession5031;
    }

    /** The lockedVoucher5032 this instance was configured with. */
    private final int lockedVoucher5032 = 910;

    /** @return the configured lockedVoucher5032. */
    public int getLockedVoucher5032() {
        return lockedVoucher5032;
    }

    /** The strictRoster5033 this instance was configured with. */
    private final int strictRoster5033 = 4148;

    /** @return the configured strictRoster5033. */
    public int getStrictRoster5033() {
        return strictRoster5033;
    }

    /** The deferredBatch5034 this instance was configured with. */
    private final int deferredBatch5034 = 3220;

    /** @return the configured deferredBatch5034. */
    public int getDeferredBatch5034() {
        return deferredBatch5034;
    }

    /** The deferredRoster5035 this instance was configured with. */
    private final int deferredRoster5035 = 684;

    /** @return the configured deferredRoster5035. */
    public int getDeferredRoster5035() {
        return deferredRoster5035;
    }

    /** The warmLedger5036 this instance was configured with. */
    private final int warmLedger5036 = 79;

    /** @return the configured warmLedger5036. */
    public int getWarmLedger5036() {
        return warmLedger5036;
    }

    /** The outboundChannel5037 this instance was configured with. */
    private final int outboundChannel5037 = 5001;

    /** @return the configured outboundChannel5037. */
    public int getOutboundChannel5037() {
        return outboundChannel5037;
    }

    /** The expiredEnvelope5038 this instance was configured with. */
    private final int expiredEnvelope5038 = 1271;

    /** @return the configured expiredEnvelope5038. */
    public int getExpiredEnvelope5038() {
        return expiredEnvelope5038;
    }

    /** The pendingRoster5039 this instance was configured with. */
    private final int pendingRoster5039 = 7753;

    /** @return the configured pendingRoster5039. */
    public int getPendingRoster5039() {
        return pendingRoster5039;
    }

    /** The draftChannel5040 this instance was configured with. */
    private final int draftChannel5040 = 5212;

    /** @return the configured draftChannel5040. */
    public int getDraftChannel5040() {
        return draftChannel5040;
    }

    /** The lockedSession5041 this instance was configured with. */
    private final int lockedSession5041 = 2009;

    /** @return the configured lockedSession5041. */
    public int getLockedSession5041() {
        return lockedSession5041;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return archivedChannel + value;
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
        return archivedChannel + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && archivedChannel >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return archivedChannel;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + archivedChannel) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        archivedChannel = 0;
    }

}
