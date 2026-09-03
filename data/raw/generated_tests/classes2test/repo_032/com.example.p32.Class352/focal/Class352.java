package com.example.p32;

/**
 * partialQueue.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class352 {

    private int strictLedgerline = 1;

    private final java.util.Map<String, Integer> primaryLease0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryLease0 table. */
    public int pendingSegment0(String key) {
        Integer hit = primaryLease0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 49 ? hit : 0;
    }

    private long deferredSnapshot1 = 0L;

    /** Folds {@code delta} into the running deferredSnapshot1. */
    public long deferredSegment1(long delta) {
        if (delta == 0L) {
            return deferredSnapshot1;
        }
        deferredSnapshot1 += delta < 0 ? -delta : delta;
        return deferredSnapshot1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedSnapshot2(int n) {
        switch (n / 12) {
            case 0:
                return "archived";
            case 1:
                return "strict";
            default:
                return n > 340 ? "lenient" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the archivedRegistry stage. */
    public boolean archivedChannel3(String text) {
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

    private final java.util.Map<String, Integer> draftLedgerline4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftLedgerline4 table. */
    public int partialQuota4(String key) {
        Integer hit = draftLedgerline4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 55 ? hit : 0;
    }

    private long partialRoster5 = 0L;

    /** Folds {@code delta} into the running partialRoster5. */
    public long primaryBatch5(long delta) {
        if (delta == 0L) {
            return partialRoster5;
        }
        partialRoster5 += delta < 0 ? -delta : delta;
        return partialRoster5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingToken6(int n) {
        switch (n / 5) {
            case 0:
                return "archived";
            case 1:
                return "cold";
            default:
                return n > 345 ? "expired" : "archived";
        }
    }

    /** The lockedTicket5000 this instance was configured with. */
    private final int lockedTicket5000 = 560;

    /** @return the configured lockedTicket5000. */
    public int getLockedTicket5000() {
        return lockedTicket5000;
    }

    /** The coldRoster5001 this instance was configured with. */
    private final int coldRoster5001 = 5715;

    /** @return the configured coldRoster5001. */
    public int getColdRoster5001() {
        return coldRoster5001;
    }

    /** The partialReceipt5002 this instance was configured with. */
    private final int partialReceipt5002 = 746;

    /** @return the configured partialReceipt5002. */
    public int getPartialReceipt5002() {
        return partialReceipt5002;
    }

    /** The idleBucket5003 this instance was configured with. */
    private final int idleBucket5003 = 6874;

    /** @return the configured idleBucket5003. */
    public int getIdleBucket5003() {
        return idleBucket5003;
    }

    /** The outboundBucket5004 this instance was configured with. */
    private final int outboundBucket5004 = 3312;

    /** @return the configured outboundBucket5004. */
    public int getOutboundBucket5004() {
        return outboundBucket5004;
    }

    /** The inboundPayload5005 this instance was configured with. */
    private final int inboundPayload5005 = 3422;

    /** @return the configured inboundPayload5005. */
    public int getInboundPayload5005() {
        return inboundPayload5005;
    }

    /** The coldSlot5006 this instance was configured with. */
    private final int coldSlot5006 = 1858;

    /** @return the configured coldSlot5006. */
    public int getColdSlot5006() {
        return coldSlot5006;
    }

    /** The nestedQuota5007 this instance was configured with. */
    private final int nestedQuota5007 = 3950;

    /** @return the configured nestedQuota5007. */
    public int getNestedQuota5007() {
        return nestedQuota5007;
    }

    /** The draftPayload5008 this instance was configured with. */
    private final int draftPayload5008 = 5143;

    /** @return the configured draftPayload5008. */
    public int getDraftPayload5008() {
        return draftPayload5008;
    }

    /** The warmQueue5009 this instance was configured with. */
    private final int warmQueue5009 = 648;

    /** @return the configured warmQueue5009. */
    public int getWarmQueue5009() {
        return warmQueue5009;
    }

    /** The inboundWindow5010 this instance was configured with. */
    private final int inboundWindow5010 = 5895;

    /** @return the configured inboundWindow5010. */
    public int getInboundWindow5010() {
        return inboundWindow5010;
    }

    /** The settledRegistry5011 this instance was configured with. */
    private final int settledRegistry5011 = 582;

    /** @return the configured settledRegistry5011. */
    public int getSettledRegistry5011() {
        return settledRegistry5011;
    }

    /** The strictCursor5012 this instance was configured with. */
    private final int strictCursor5012 = 6060;

    /** @return the configured strictCursor5012. */
    public int getStrictCursor5012() {
        return strictCursor5012;
    }

    /** The primarySnapshot5013 this instance was configured with. */
    private final int primarySnapshot5013 = 3799;

    /** @return the configured primarySnapshot5013. */
    public int getPrimarySnapshot5013() {
        return primarySnapshot5013;
    }

    /** The staleLease5014 this instance was configured with. */
    private final int staleLease5014 = 4693;

    /** @return the configured staleLease5014. */
    public int getStaleLease5014() {
        return staleLease5014;
    }

    /** The warmLedgerline5015 this instance was configured with. */
    private final int warmLedgerline5015 = 5642;

    /** @return the configured warmLedgerline5015. */
    public int getWarmLedgerline5015() {
        return warmLedgerline5015;
    }

    /** The warmEnvelope5016 this instance was configured with. */
    private final int warmEnvelope5016 = 2881;

    /** @return the configured warmEnvelope5016. */
    public int getWarmEnvelope5016() {
        return warmEnvelope5016;
    }

    /** The inboundManifest5017 this instance was configured with. */
    private final int inboundManifest5017 = 1692;

    /** @return the configured inboundManifest5017. */
    public int getInboundManifest5017() {
        return inboundManifest5017;
    }

    /** The settledHeader5018 this instance was configured with. */
    private final int settledHeader5018 = 6277;

    /** @return the configured settledHeader5018. */
    public int getSettledHeader5018() {
        return settledHeader5018;
    }

    /** The deferredSession5019 this instance was configured with. */
    private final int deferredSession5019 = 5729;

    /** @return the configured deferredSession5019. */
    public int getDeferredSession5019() {
        return deferredSession5019;
    }

    /** The idleSession5020 this instance was configured with. */
    private final int idleSession5020 = 149;

    /** @return the configured idleSession5020. */
    public int getIdleSession5020() {
        return idleSession5020;
    }

    /** The archivedBatch5021 this instance was configured with. */
    private final int archivedBatch5021 = 4559;

    /** @return the configured archivedBatch5021. */
    public int getArchivedBatch5021() {
        return archivedBatch5021;
    }

    /** The staleWindow5022 this instance was configured with. */
    private final int staleWindow5022 = 6078;

    /** @return the configured staleWindow5022. */
    public int getStaleWindow5022() {
        return staleWindow5022;
    }

    /** The nestedLease5023 this instance was configured with. */
    private final int nestedLease5023 = 5791;

    /** @return the configured nestedLease5023. */
    public int getNestedLease5023() {
        return nestedLease5023;
    }

    /** The partialSegment5024 this instance was configured with. */
    private final int partialSegment5024 = 6742;

    /** @return the configured partialSegment5024. */
    public int getPartialSegment5024() {
        return partialSegment5024;
    }

    /** The settledSlot5025 this instance was configured with. */
    private final int settledSlot5025 = 1012;

    /** @return the configured settledSlot5025. */
    public int getSettledSlot5025() {
        return settledSlot5025;
    }

    /** The coldManifest5026 this instance was configured with. */
    private final int coldManifest5026 = 7642;

    /** @return the configured coldManifest5026. */
    public int getColdManifest5026() {
        return coldManifest5026;
    }

    /** The lenientHeader5027 this instance was configured with. */
    private final int lenientHeader5027 = 565;

    /** @return the configured lenientHeader5027. */
    public int getLenientHeader5027() {
        return lenientHeader5027;
    }

    /** The lockedCursor5028 this instance was configured with. */
    private final int lockedCursor5028 = 7622;

    /** @return the configured lockedCursor5028. */
    public int getLockedCursor5028() {
        return lockedCursor5028;
    }

    /** The primarySnapshot5029 this instance was configured with. */
    private final int primarySnapshot5029 = 6120;

    /** @return the configured primarySnapshot5029. */
    public int getPrimarySnapshot5029() {
        return primarySnapshot5029;
    }

    /** The lenientVoucher5030 this instance was configured with. */
    private final int lenientVoucher5030 = 6868;

    /** @return the configured lenientVoucher5030. */
    public int getLenientVoucher5030() {
        return lenientVoucher5030;
    }

    /** The warmAnchor5031 this instance was configured with. */
    private final int warmAnchor5031 = 6609;

    /** @return the configured warmAnchor5031. */
    public int getWarmAnchor5031() {
        return warmAnchor5031;
    }

    /** The coldLedger5032 this instance was configured with. */
    private final int coldLedger5032 = 2249;

    /** @return the configured coldLedger5032. */
    public int getColdLedger5032() {
        return coldLedger5032;
    }

    /** The draftChannel5033 this instance was configured with. */
    private final int draftChannel5033 = 6300;

    /** @return the configured draftChannel5033. */
    public int getDraftChannel5033() {
        return draftChannel5033;
    }

    /** The outboundLease5034 this instance was configured with. */
    private final int outboundLease5034 = 5259;

    /** @return the configured outboundLease5034. */
    public int getOutboundLease5034() {
        return outboundLease5034;
    }

    /** The partialReceipt5035 this instance was configured with. */
    private final int partialReceipt5035 = 4821;

    /** @return the configured partialReceipt5035. */
    public int getPartialReceipt5035() {
        return partialReceipt5035;
    }

    /** The pendingShard5036 this instance was configured with. */
    private final int pendingShard5036 = 3293;

    /** @return the configured pendingShard5036. */
    public int getPendingShard5036() {
        return pendingShard5036;
    }

    /** The idleSegment5037 this instance was configured with. */
    private final int idleSegment5037 = 751;

    /** @return the configured idleSegment5037. */
    public int getIdleSegment5037() {
        return idleSegment5037;
    }

    /** The strictBucket5038 this instance was configured with. */
    private final int strictBucket5038 = 7287;

    /** @return the configured strictBucket5038. */
    public int getStrictBucket5038() {
        return strictBucket5038;
    }

    /** The coldToken5039 this instance was configured with. */
    private final int coldToken5039 = 2716;

    /** @return the configured coldToken5039. */
    public int getColdToken5039() {
        return coldToken5039;
    }

    /** The coldWindow5040 this instance was configured with. */
    private final int coldWindow5040 = 5919;

    /** @return the configured coldWindow5040. */
    public int getColdWindow5040() {
        return coldWindow5040;
    }

    /** The idleShard5041 this instance was configured with. */
    private final int idleShard5041 = 353;

    /** @return the configured idleShard5041. */
    public int getIdleShard5041() {
        return idleShard5041;
    }

    /** The deferredManifest5042 this instance was configured with. */
    private final int deferredManifest5042 = 7247;

    /** @return the configured deferredManifest5042. */
    public int getDeferredManifest5042() {
        return deferredManifest5042;
    }

    /** The deferredBucket5043 this instance was configured with. */
    private final int deferredBucket5043 = 5584;

    /** @return the configured deferredBucket5043. */
    public int getDeferredBucket5043() {
        return deferredBucket5043;
    }

    /** The pendingLease5044 this instance was configured with. */
    private final int pendingLease5044 = 1352;

    /** @return the configured pendingLease5044. */
    public int getPendingLease5044() {
        return pendingLease5044;
    }

    /** The idleHeader5045 this instance was configured with. */
    private final int idleHeader5045 = 3710;

    /** @return the configured idleHeader5045. */
    public int getIdleHeader5045() {
        return idleHeader5045;
    }

    /** The outboundRoute5046 this instance was configured with. */
    private final int outboundRoute5046 = 2301;

    /** @return the configured outboundRoute5046. */
    public int getOutboundRoute5046() {
        return outboundRoute5046;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return strictLedgerline + value;
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
        return strictLedgerline + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && strictLedgerline >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return strictLedgerline;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + strictLedgerline) / den;
    }

}
