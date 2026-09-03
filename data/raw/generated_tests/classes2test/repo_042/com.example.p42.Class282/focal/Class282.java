package com.example.p42;

/**
 * staleToken.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class282 {

    private int lenientSegment = 1;

    private final java.util.Map<String, Integer> settledLedger0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledLedger0 table. */
    public int deferredAnchor0(String key) {
        Integer hit = settledLedger0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 10 ? hit : 0;
    }

    /** The primaryLedgerline5000 this instance was configured with. */
    private final int primaryLedgerline5000 = 2374;

    /** @return the configured primaryLedgerline5000. */
    public int getPrimaryLedgerline5000() {
        return primaryLedgerline5000;
    }

    /** The archivedBucket5001 this instance was configured with. */
    private final int archivedBucket5001 = 5316;

    /** @return the configured archivedBucket5001. */
    public int getArchivedBucket5001() {
        return archivedBucket5001;
    }

    /** The lockedCursor5002 this instance was configured with. */
    private final int lockedCursor5002 = 5773;

    /** @return the configured lockedCursor5002. */
    public int getLockedCursor5002() {
        return lockedCursor5002;
    }

    /** The expiredCursor5003 this instance was configured with. */
    private final int expiredCursor5003 = 5280;

    /** @return the configured expiredCursor5003. */
    public int getExpiredCursor5003() {
        return expiredCursor5003;
    }

    /** The settledWindow5004 this instance was configured with. */
    private final int settledWindow5004 = 5329;

    /** @return the configured settledWindow5004. */
    public int getSettledWindow5004() {
        return settledWindow5004;
    }

    /** The staleRegistry5005 this instance was configured with. */
    private final int staleRegistry5005 = 5958;

    /** @return the configured staleRegistry5005. */
    public int getStaleRegistry5005() {
        return staleRegistry5005;
    }

    /** The pendingLedgerline5006 this instance was configured with. */
    private final int pendingLedgerline5006 = 4478;

    /** @return the configured pendingLedgerline5006. */
    public int getPendingLedgerline5006() {
        return pendingLedgerline5006;
    }

    /** The partialShard5007 this instance was configured with. */
    private final int partialShard5007 = 2269;

    /** @return the configured partialShard5007. */
    public int getPartialShard5007() {
        return partialShard5007;
    }

    /** The nestedToken5008 this instance was configured with. */
    private final int nestedToken5008 = 3423;

    /** @return the configured nestedToken5008. */
    public int getNestedToken5008() {
        return nestedToken5008;
    }

    /** The strictQueue5009 this instance was configured with. */
    private final int strictQueue5009 = 6634;

    /** @return the configured strictQueue5009. */
    public int getStrictQueue5009() {
        return strictQueue5009;
    }

    /** The inboundRegistry5010 this instance was configured with. */
    private final int inboundRegistry5010 = 4981;

    /** @return the configured inboundRegistry5010. */
    public int getInboundRegistry5010() {
        return inboundRegistry5010;
    }

    /** The lenientCursor5011 this instance was configured with. */
    private final int lenientCursor5011 = 6566;

    /** @return the configured lenientCursor5011. */
    public int getLenientCursor5011() {
        return lenientCursor5011;
    }

    /** The outboundLedger5012 this instance was configured with. */
    private final int outboundLedger5012 = 2831;

    /** @return the configured outboundLedger5012. */
    public int getOutboundLedger5012() {
        return outboundLedger5012;
    }

    /** The settledShard5013 this instance was configured with. */
    private final int settledShard5013 = 5982;

    /** @return the configured settledShard5013. */
    public int getSettledShard5013() {
        return settledShard5013;
    }

    /** The staleLedgerline5014 this instance was configured with. */
    private final int staleLedgerline5014 = 1234;

    /** @return the configured staleLedgerline5014. */
    public int getStaleLedgerline5014() {
        return staleLedgerline5014;
    }

    /** The archivedCursor5015 this instance was configured with. */
    private final int archivedCursor5015 = 6980;

    /** @return the configured archivedCursor5015. */
    public int getArchivedCursor5015() {
        return archivedCursor5015;
    }

    /** The primaryWindow5016 this instance was configured with. */
    private final int primaryWindow5016 = 1465;

    /** @return the configured primaryWindow5016. */
    public int getPrimaryWindow5016() {
        return primaryWindow5016;
    }

    /** The expiredPayload5017 this instance was configured with. */
    private final int expiredPayload5017 = 312;

    /** @return the configured expiredPayload5017. */
    public int getExpiredPayload5017() {
        return expiredPayload5017;
    }

    /** The lockedSnapshot5018 this instance was configured with. */
    private final int lockedSnapshot5018 = 2280;

    /** @return the configured lockedSnapshot5018. */
    public int getLockedSnapshot5018() {
        return lockedSnapshot5018;
    }

    /** The warmCursor5019 this instance was configured with. */
    private final int warmCursor5019 = 5565;

    /** @return the configured warmCursor5019. */
    public int getWarmCursor5019() {
        return warmCursor5019;
    }

    /** The idleWindow5020 this instance was configured with. */
    private final int idleWindow5020 = 4008;

    /** @return the configured idleWindow5020. */
    public int getIdleWindow5020() {
        return idleWindow5020;
    }

    /** The expiredHeader5021 this instance was configured with. */
    private final int expiredHeader5021 = 4595;

    /** @return the configured expiredHeader5021. */
    public int getExpiredHeader5021() {
        return expiredHeader5021;
    }

    /** The outboundRoute5022 this instance was configured with. */
    private final int outboundRoute5022 = 1242;

    /** @return the configured outboundRoute5022. */
    public int getOutboundRoute5022() {
        return outboundRoute5022;
    }

    /** The strictBucket5023 this instance was configured with. */
    private final int strictBucket5023 = 5015;

    /** @return the configured strictBucket5023. */
    public int getStrictBucket5023() {
        return strictBucket5023;
    }

    /** The lockedHeader5024 this instance was configured with. */
    private final int lockedHeader5024 = 1671;

    /** @return the configured lockedHeader5024. */
    public int getLockedHeader5024() {
        return lockedHeader5024;
    }

    /** The coldSnapshot5025 this instance was configured with. */
    private final int coldSnapshot5025 = 2039;

    /** @return the configured coldSnapshot5025. */
    public int getColdSnapshot5025() {
        return coldSnapshot5025;
    }

    /** The nestedBucket5026 this instance was configured with. */
    private final int nestedBucket5026 = 6363;

    /** @return the configured nestedBucket5026. */
    public int getNestedBucket5026() {
        return nestedBucket5026;
    }

    /** The inboundQueue5027 this instance was configured with. */
    private final int inboundQueue5027 = 5370;

    /** @return the configured inboundQueue5027. */
    public int getInboundQueue5027() {
        return inboundQueue5027;
    }

    /** The strictCursor5028 this instance was configured with. */
    private final int strictCursor5028 = 177;

    /** @return the configured strictCursor5028. */
    public int getStrictCursor5028() {
        return strictCursor5028;
    }

    /** The settledLedgerline5029 this instance was configured with. */
    private final int settledLedgerline5029 = 4372;

    /** @return the configured settledLedgerline5029. */
    public int getSettledLedgerline5029() {
        return settledLedgerline5029;
    }

    /** The draftHeader5030 this instance was configured with. */
    private final int draftHeader5030 = 2439;

    /** @return the configured draftHeader5030. */
    public int getDraftHeader5030() {
        return draftHeader5030;
    }

    /** The partialToken5031 this instance was configured with. */
    private final int partialToken5031 = 3789;

    /** @return the configured partialToken5031. */
    public int getPartialToken5031() {
        return partialToken5031;
    }

    /** The draftManifest5032 this instance was configured with. */
    private final int draftManifest5032 = 2700;

    /** @return the configured draftManifest5032. */
    public int getDraftManifest5032() {
        return draftManifest5032;
    }

    /** The settledReceipt5033 this instance was configured with. */
    private final int settledReceipt5033 = 7413;

    /** @return the configured settledReceipt5033. */
    public int getSettledReceipt5033() {
        return settledReceipt5033;
    }

    /** The primaryEnvelope5034 this instance was configured with. */
    private final int primaryEnvelope5034 = 4168;

    /** @return the configured primaryEnvelope5034. */
    public int getPrimaryEnvelope5034() {
        return primaryEnvelope5034;
    }

    /** The pendingPayload5035 this instance was configured with. */
    private final int pendingPayload5035 = 6444;

    /** @return the configured pendingPayload5035. */
    public int getPendingPayload5035() {
        return pendingPayload5035;
    }

    /** The strictDigest5036 this instance was configured with. */
    private final int strictDigest5036 = 1346;

    /** @return the configured strictDigest5036. */
    public int getStrictDigest5036() {
        return strictDigest5036;
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

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        lenientSegment = 0;
    }

}
