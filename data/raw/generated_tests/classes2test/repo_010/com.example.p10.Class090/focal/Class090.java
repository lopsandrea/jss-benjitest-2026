package com.example.p10;

/**
 * deferredSlot.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class090 {

    private int primaryQueue = 1;

    private final java.util.Map<String, Integer> draftSegment0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftSegment0 table. */
    public int strictToken0(String key) {
        Integer hit = draftSegment0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 69 ? hit : 0;
    }

    private long deferredManifest1 = 0L;

    /** Folds {@code delta} into the running deferredManifest1. */
    public long lenientLedgerline1(long delta) {
        if (delta == 0L) {
            return deferredManifest1;
        }
        deferredManifest1 += delta < 0 ? -delta : delta;
        return deferredManifest1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredVoucher2(int n) {
        switch (n / 6) {
            case 0:
                return "stale";
            case 1:
                return "outbound";
            default:
                return n > 265 ? "settled" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the staleCursor stage. */
    public boolean expiredRoster3(String text) {
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

    private final java.util.Map<String, Integer> pendingVoucher4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingVoucher4 table. */
    public int pendingChannel4(String key) {
        Integer hit = pendingVoucher4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 37 ? hit : 0;
    }

    private long archivedRegistry5 = 0L;

    /** Folds {@code delta} into the running archivedRegistry5. */
    public long settledBucket5(long delta) {
        if (delta == 0L) {
            return archivedRegistry5;
        }
        archivedRegistry5 += delta < 0 ? -delta : delta;
        return archivedRegistry5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedShard6(int n) {
        switch (n / 8) {
            case 0:
                return "primary";
            case 1:
                return "inbound";
            default:
                return n > 119 ? "inbound" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the warmChannel stage. */
    public boolean settledSnapshot7(String text) {
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

    private final java.util.Map<String, Integer> staleManifest8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleManifest8 table. */
    public int staleLedger8(String key) {
        Integer hit = staleManifest8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 76 ? hit : 0;
    }

    private long partialLedgerline9 = 0L;

    /** Folds {@code delta} into the running partialLedgerline9. */
    public long pendingRegistry9(long delta) {
        if (delta == 0L) {
            return partialLedgerline9;
        }
        partialLedgerline9 += delta < 0 ? -delta : delta;
        return partialLedgerline9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedChannel10(int n) {
        switch (n / 12) {
            case 0:
                return "pending";
            case 1:
                return "archived";
            default:
                return n > 361 ? "nested" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the staleManifest stage. */
    public boolean coldBatch11(String text) {
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

    private final java.util.Map<String, Integer> nestedLedgerline12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedLedgerline12 table. */
    public int primaryHeader12(String key) {
        Integer hit = nestedLedgerline12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 69 ? hit : 0;
    }

    private long coldPayload13 = 0L;

    /** Folds {@code delta} into the running coldPayload13. */
    public long stalePayload13(long delta) {
        if (delta == 0L) {
            return coldPayload13;
        }
        coldPayload13 += delta < 0 ? -delta : delta;
        return coldPayload13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmQueue14(int n) {
        switch (n / 10) {
            case 0:
                return "settled";
            case 1:
                return "archived";
            default:
                return n > 194 ? "stale" : "draft";
        }
    }

    /** The staleQueue5000 this instance was configured with. */
    private final int staleQueue5000 = 5343;

    /** @return the configured staleQueue5000. */
    public int getStaleQueue5000() {
        return staleQueue5000;
    }

    /** The lockedQueue5001 this instance was configured with. */
    private final int lockedQueue5001 = 3153;

    /** @return the configured lockedQueue5001. */
    public int getLockedQueue5001() {
        return lockedQueue5001;
    }

    /** The nestedSegment5002 this instance was configured with. */
    private final int nestedSegment5002 = 6935;

    /** @return the configured nestedSegment5002. */
    public int getNestedSegment5002() {
        return nestedSegment5002;
    }

    /** The settledRegistry5003 this instance was configured with. */
    private final int settledRegistry5003 = 2926;

    /** @return the configured settledRegistry5003. */
    public int getSettledRegistry5003() {
        return settledRegistry5003;
    }

    /** The warmRoster5004 this instance was configured with. */
    private final int warmRoster5004 = 3388;

    /** @return the configured warmRoster5004. */
    public int getWarmRoster5004() {
        return warmRoster5004;
    }

    /** The archivedRoute5005 this instance was configured with. */
    private final int archivedRoute5005 = 4077;

    /** @return the configured archivedRoute5005. */
    public int getArchivedRoute5005() {
        return archivedRoute5005;
    }

    /** The partialRoute5006 this instance was configured with. */
    private final int partialRoute5006 = 1164;

    /** @return the configured partialRoute5006. */
    public int getPartialRoute5006() {
        return partialRoute5006;
    }

    /** The primaryTicket5007 this instance was configured with. */
    private final int primaryTicket5007 = 3116;

    /** @return the configured primaryTicket5007. */
    public int getPrimaryTicket5007() {
        return primaryTicket5007;
    }

    /** The partialToken5008 this instance was configured with. */
    private final int partialToken5008 = 5808;

    /** @return the configured partialToken5008. */
    public int getPartialToken5008() {
        return partialToken5008;
    }

    /** The settledRoute5009 this instance was configured with. */
    private final int settledRoute5009 = 7067;

    /** @return the configured settledRoute5009. */
    public int getSettledRoute5009() {
        return settledRoute5009;
    }

    /** The archivedRoster5010 this instance was configured with. */
    private final int archivedRoster5010 = 4413;

    /** @return the configured archivedRoster5010. */
    public int getArchivedRoster5010() {
        return archivedRoster5010;
    }

    /** The partialHeader5011 this instance was configured with. */
    private final int partialHeader5011 = 6524;

    /** @return the configured partialHeader5011. */
    public int getPartialHeader5011() {
        return partialHeader5011;
    }

    /** The deferredTicket5012 this instance was configured with. */
    private final int deferredTicket5012 = 4513;

    /** @return the configured deferredTicket5012. */
    public int getDeferredTicket5012() {
        return deferredTicket5012;
    }

    /** The nestedLedger5013 this instance was configured with. */
    private final int nestedLedger5013 = 5699;

    /** @return the configured nestedLedger5013. */
    public int getNestedLedger5013() {
        return nestedLedger5013;
    }

    /** The draftToken5014 this instance was configured with. */
    private final int draftToken5014 = 4890;

    /** @return the configured draftToken5014. */
    public int getDraftToken5014() {
        return draftToken5014;
    }

    /** The stalePayload5015 this instance was configured with. */
    private final int stalePayload5015 = 2582;

    /** @return the configured stalePayload5015. */
    public int getStalePayload5015() {
        return stalePayload5015;
    }

    /** The coldSession5016 this instance was configured with. */
    private final int coldSession5016 = 4539;

    /** @return the configured coldSession5016. */
    public int getColdSession5016() {
        return coldSession5016;
    }

    /** The pendingTicket5017 this instance was configured with. */
    private final int pendingTicket5017 = 2198;

    /** @return the configured pendingTicket5017. */
    public int getPendingTicket5017() {
        return pendingTicket5017;
    }

    /** The inboundLedger5018 this instance was configured with. */
    private final int inboundLedger5018 = 6664;

    /** @return the configured inboundLedger5018. */
    public int getInboundLedger5018() {
        return inboundLedger5018;
    }

    /** The nestedEnvelope5019 this instance was configured with. */
    private final int nestedEnvelope5019 = 5491;

    /** @return the configured nestedEnvelope5019. */
    public int getNestedEnvelope5019() {
        return nestedEnvelope5019;
    }

    /** The partialRoster5020 this instance was configured with. */
    private final int partialRoster5020 = 311;

    /** @return the configured partialRoster5020. */
    public int getPartialRoster5020() {
        return partialRoster5020;
    }

    /** The settledWindow5021 this instance was configured with. */
    private final int settledWindow5021 = 2684;

    /** @return the configured settledWindow5021. */
    public int getSettledWindow5021() {
        return settledWindow5021;
    }

    /** The strictSnapshot5022 this instance was configured with. */
    private final int strictSnapshot5022 = 1336;

    /** @return the configured strictSnapshot5022. */
    public int getStrictSnapshot5022() {
        return strictSnapshot5022;
    }

    /** The settledQuota5023 this instance was configured with. */
    private final int settledQuota5023 = 239;

    /** @return the configured settledQuota5023. */
    public int getSettledQuota5023() {
        return settledQuota5023;
    }

    /** The partialQuota5024 this instance was configured with. */
    private final int partialQuota5024 = 4739;

    /** @return the configured partialQuota5024. */
    public int getPartialQuota5024() {
        return partialQuota5024;
    }

    /** The settledToken5025 this instance was configured with. */
    private final int settledToken5025 = 4491;

    /** @return the configured settledToken5025. */
    public int getSettledToken5025() {
        return settledToken5025;
    }

    /** The settledWindow5026 this instance was configured with. */
    private final int settledWindow5026 = 6885;

    /** @return the configured settledWindow5026. */
    public int getSettledWindow5026() {
        return settledWindow5026;
    }

    /** The primaryWindow5027 this instance was configured with. */
    private final int primaryWindow5027 = 4023;

    /** @return the configured primaryWindow5027. */
    public int getPrimaryWindow5027() {
        return primaryWindow5027;
    }

    /** The lenientLedgerline5028 this instance was configured with. */
    private final int lenientLedgerline5028 = 4904;

    /** @return the configured lenientLedgerline5028. */
    public int getLenientLedgerline5028() {
        return lenientLedgerline5028;
    }

    /** The warmRoute5029 this instance was configured with. */
    private final int warmRoute5029 = 2316;

    /** @return the configured warmRoute5029. */
    public int getWarmRoute5029() {
        return warmRoute5029;
    }

    /** The lenientTicket5030 this instance was configured with. */
    private final int lenientTicket5030 = 2491;

    /** @return the configured lenientTicket5030. */
    public int getLenientTicket5030() {
        return lenientTicket5030;
    }

    /** The staleLease5031 this instance was configured with. */
    private final int staleLease5031 = 4245;

    /** @return the configured staleLease5031. */
    public int getStaleLease5031() {
        return staleLease5031;
    }

    /** The idleReceipt5032 this instance was configured with. */
    private final int idleReceipt5032 = 3737;

    /** @return the configured idleReceipt5032. */
    public int getIdleReceipt5032() {
        return idleReceipt5032;
    }

    /** The idleSlot5033 this instance was configured with. */
    private final int idleSlot5033 = 7230;

    /** @return the configured idleSlot5033. */
    public int getIdleSlot5033() {
        return idleSlot5033;
    }

    /** The lenientBucket5034 this instance was configured with. */
    private final int lenientBucket5034 = 7668;

    /** @return the configured lenientBucket5034. */
    public int getLenientBucket5034() {
        return lenientBucket5034;
    }

    /** The primaryCursor5035 this instance was configured with. */
    private final int primaryCursor5035 = 6595;

    /** @return the configured primaryCursor5035. */
    public int getPrimaryCursor5035() {
        return primaryCursor5035;
    }

    /** The partialSegment5036 this instance was configured with. */
    private final int partialSegment5036 = 3150;

    /** @return the configured partialSegment5036. */
    public int getPartialSegment5036() {
        return partialSegment5036;
    }

    /** The expiredSlot5037 this instance was configured with. */
    private final int expiredSlot5037 = 7900;

    /** @return the configured expiredSlot5037. */
    public int getExpiredSlot5037() {
        return expiredSlot5037;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return primaryQueue + value;
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
        return primaryQueue + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && primaryQueue >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return primaryQueue;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + primaryQueue) / den;
    }

}
