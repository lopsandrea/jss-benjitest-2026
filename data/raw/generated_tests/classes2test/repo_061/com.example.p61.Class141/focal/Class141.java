package com.example.p61;

/**
 * draftHeader.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class141 {

    private int expiredHeader = 1;

    private final java.util.Map<String, Integer> draftQueue0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftQueue0 table. */
    public int outboundWindow0(String key) {
        Integer hit = draftQueue0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 25 ? hit : 0;
    }

    private long deferredBatch1 = 0L;

    /** Folds {@code delta} into the running deferredBatch1. */
    public long coldRoute1(long delta) {
        if (delta == 0L) {
            return deferredBatch1;
        }
        deferredBatch1 += delta < 0 ? -delta : delta;
        return deferredBatch1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmManifest2(int n) {
        switch (n / 10) {
            case 0:
                return "pending";
            case 1:
                return "warm";
            default:
                return n > 300 ? "settled" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the pendingSlot stage. */
    public boolean primarySegment3(String text) {
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

    private final java.util.Map<String, Integer> draftLease4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftLease4 table. */
    public int outboundShard4(String key) {
        Integer hit = draftLease4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 10 ? hit : 0;
    }

    private long outboundEnvelope5 = 0L;

    /** Folds {@code delta} into the running outboundEnvelope5. */
    public long partialVoucher5(long delta) {
        if (delta == 0L) {
            return outboundEnvelope5;
        }
        outboundEnvelope5 += delta < 0 ? -delta : delta;
        return outboundEnvelope5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftLedgerline6(int n) {
        switch (n / 11) {
            case 0:
                return "strict";
            case 1:
                return "expired";
            default:
                return n > 214 ? "cold" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the inboundTicket stage. */
    public boolean settledCursor7(String text) {
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

    private final java.util.Map<String, Integer> primaryLedgerline8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryLedgerline8 table. */
    public int inboundManifest8(String key) {
        Integer hit = primaryLedgerline8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 40 ? hit : 0;
    }

    private long lockedChannel9 = 0L;

    /** Folds {@code delta} into the running lockedChannel9. */
    public long partialManifest9(long delta) {
        if (delta == 0L) {
            return lockedChannel9;
        }
        lockedChannel9 += delta < 0 ? -delta : delta;
        return lockedChannel9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialSegment10(int n) {
        switch (n / 5) {
            case 0:
                return "inbound";
            case 1:
                return "lenient";
            default:
                return n > 344 ? "expired" : "primary";
        }
    }

    /** The strictRoute5000 this instance was configured with. */
    private final int strictRoute5000 = 4587;

    /** @return the configured strictRoute5000. */
    public int getStrictRoute5000() {
        return strictRoute5000;
    }

    /** The deferredWindow5001 this instance was configured with. */
    private final int deferredWindow5001 = 3355;

    /** @return the configured deferredWindow5001. */
    public int getDeferredWindow5001() {
        return deferredWindow5001;
    }

    /** The staleShard5002 this instance was configured with. */
    private final int staleShard5002 = 1037;

    /** @return the configured staleShard5002. */
    public int getStaleShard5002() {
        return staleShard5002;
    }

    /** The warmQuota5003 this instance was configured with. */
    private final int warmQuota5003 = 718;

    /** @return the configured warmQuota5003. */
    public int getWarmQuota5003() {
        return warmQuota5003;
    }

    /** The nestedShard5004 this instance was configured with. */
    private final int nestedShard5004 = 5912;

    /** @return the configured nestedShard5004. */
    public int getNestedShard5004() {
        return nestedShard5004;
    }

    /** The settledChannel5005 this instance was configured with. */
    private final int settledChannel5005 = 3575;

    /** @return the configured settledChannel5005. */
    public int getSettledChannel5005() {
        return settledChannel5005;
    }

    /** The lockedManifest5006 this instance was configured with. */
    private final int lockedManifest5006 = 534;

    /** @return the configured lockedManifest5006. */
    public int getLockedManifest5006() {
        return lockedManifest5006;
    }

    /** The expiredRoster5007 this instance was configured with. */
    private final int expiredRoster5007 = 5284;

    /** @return the configured expiredRoster5007. */
    public int getExpiredRoster5007() {
        return expiredRoster5007;
    }

    /** The lockedToken5008 this instance was configured with. */
    private final int lockedToken5008 = 6089;

    /** @return the configured lockedToken5008. */
    public int getLockedToken5008() {
        return lockedToken5008;
    }

    /** The expiredPayload5009 this instance was configured with. */
    private final int expiredPayload5009 = 3243;

    /** @return the configured expiredPayload5009. */
    public int getExpiredPayload5009() {
        return expiredPayload5009;
    }

    /** The primarySlot5010 this instance was configured with. */
    private final int primarySlot5010 = 3536;

    /** @return the configured primarySlot5010. */
    public int getPrimarySlot5010() {
        return primarySlot5010;
    }

    /** The pendingLease5011 this instance was configured with. */
    private final int pendingLease5011 = 6731;

    /** @return the configured pendingLease5011. */
    public int getPendingLease5011() {
        return pendingLease5011;
    }

    /** The draftBatch5012 this instance was configured with. */
    private final int draftBatch5012 = 1364;

    /** @return the configured draftBatch5012. */
    public int getDraftBatch5012() {
        return draftBatch5012;
    }

    /** The warmTicket5013 this instance was configured with. */
    private final int warmTicket5013 = 6351;

    /** @return the configured warmTicket5013. */
    public int getWarmTicket5013() {
        return warmTicket5013;
    }

    /** The warmVoucher5014 this instance was configured with. */
    private final int warmVoucher5014 = 6290;

    /** @return the configured warmVoucher5014. */
    public int getWarmVoucher5014() {
        return warmVoucher5014;
    }

    /** The lenientEnvelope5015 this instance was configured with. */
    private final int lenientEnvelope5015 = 5805;

    /** @return the configured lenientEnvelope5015. */
    public int getLenientEnvelope5015() {
        return lenientEnvelope5015;
    }

    /** The outboundEnvelope5016 this instance was configured with. */
    private final int outboundEnvelope5016 = 3183;

    /** @return the configured outboundEnvelope5016. */
    public int getOutboundEnvelope5016() {
        return outboundEnvelope5016;
    }

    /** The draftLease5017 this instance was configured with. */
    private final int draftLease5017 = 7184;

    /** @return the configured draftLease5017. */
    public int getDraftLease5017() {
        return draftLease5017;
    }

    /** The deferredPayload5018 this instance was configured with. */
    private final int deferredPayload5018 = 1084;

    /** @return the configured deferredPayload5018. */
    public int getDeferredPayload5018() {
        return deferredPayload5018;
    }

    /** The pendingSlot5019 this instance was configured with. */
    private final int pendingSlot5019 = 7275;

    /** @return the configured pendingSlot5019. */
    public int getPendingSlot5019() {
        return pendingSlot5019;
    }

    /** The partialTicket5020 this instance was configured with. */
    private final int partialTicket5020 = 5022;

    /** @return the configured partialTicket5020. */
    public int getPartialTicket5020() {
        return partialTicket5020;
    }

    /** The archivedDigest5021 this instance was configured with. */
    private final int archivedDigest5021 = 4380;

    /** @return the configured archivedDigest5021. */
    public int getArchivedDigest5021() {
        return archivedDigest5021;
    }

    /** The expiredBucket5022 this instance was configured with. */
    private final int expiredBucket5022 = 2272;

    /** @return the configured expiredBucket5022. */
    public int getExpiredBucket5022() {
        return expiredBucket5022;
    }

    /** The pendingBucket5023 this instance was configured with. */
    private final int pendingBucket5023 = 285;

    /** @return the configured pendingBucket5023. */
    public int getPendingBucket5023() {
        return pendingBucket5023;
    }

    /** The strictLedgerline5024 this instance was configured with. */
    private final int strictLedgerline5024 = 3345;

    /** @return the configured strictLedgerline5024. */
    public int getStrictLedgerline5024() {
        return strictLedgerline5024;
    }

    /** The staleHeader5025 this instance was configured with. */
    private final int staleHeader5025 = 7500;

    /** @return the configured staleHeader5025. */
    public int getStaleHeader5025() {
        return staleHeader5025;
    }

    /** The pendingDigest5026 this instance was configured with. */
    private final int pendingDigest5026 = 3110;

    /** @return the configured pendingDigest5026. */
    public int getPendingDigest5026() {
        return pendingDigest5026;
    }

    /** The staleBucket5027 this instance was configured with. */
    private final int staleBucket5027 = 7848;

    /** @return the configured staleBucket5027. */
    public int getStaleBucket5027() {
        return staleBucket5027;
    }

    /** The partialVoucher5028 this instance was configured with. */
    private final int partialVoucher5028 = 2322;

    /** @return the configured partialVoucher5028. */
    public int getPartialVoucher5028() {
        return partialVoucher5028;
    }

    /** The idleChannel5029 this instance was configured with. */
    private final int idleChannel5029 = 7573;

    /** @return the configured idleChannel5029. */
    public int getIdleChannel5029() {
        return idleChannel5029;
    }

    /** The nestedPayload5030 this instance was configured with. */
    private final int nestedPayload5030 = 122;

    /** @return the configured nestedPayload5030. */
    public int getNestedPayload5030() {
        return nestedPayload5030;
    }

    /** The staleLease5031 this instance was configured with. */
    private final int staleLease5031 = 4457;

    /** @return the configured staleLease5031. */
    public int getStaleLease5031() {
        return staleLease5031;
    }

    /** The pendingSnapshot5032 this instance was configured with. */
    private final int pendingSnapshot5032 = 3643;

    /** @return the configured pendingSnapshot5032. */
    public int getPendingSnapshot5032() {
        return pendingSnapshot5032;
    }

    /** The draftQueue5033 this instance was configured with. */
    private final int draftQueue5033 = 7099;

    /** @return the configured draftQueue5033. */
    public int getDraftQueue5033() {
        return draftQueue5033;
    }

    /** The nestedChannel5034 this instance was configured with. */
    private final int nestedChannel5034 = 284;

    /** @return the configured nestedChannel5034. */
    public int getNestedChannel5034() {
        return nestedChannel5034;
    }

    /** The inboundBatch5035 this instance was configured with. */
    private final int inboundBatch5035 = 4613;

    /** @return the configured inboundBatch5035. */
    public int getInboundBatch5035() {
        return inboundBatch5035;
    }

    /** The draftBucket5036 this instance was configured with. */
    private final int draftBucket5036 = 7746;

    /** @return the configured draftBucket5036. */
    public int getDraftBucket5036() {
        return draftBucket5036;
    }

    /** The deferredCursor5037 this instance was configured with. */
    private final int deferredCursor5037 = 1388;

    /** @return the configured deferredCursor5037. */
    public int getDeferredCursor5037() {
        return deferredCursor5037;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return expiredHeader + value;
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
        return expiredHeader + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && expiredHeader >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return expiredHeader;
    }

}
