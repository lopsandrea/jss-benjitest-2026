package com.example.p15;

/**
 * archivedReceipt.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class095 {

    private int coldQuota = 1;

    private final java.util.Map<String, Integer> warmToken0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmToken0 table. */
    public int draftWindow0(String key) {
        Integer hit = warmToken0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 52 ? hit : 0;
    }

    private long coldRoute1 = 0L;

    /** Folds {@code delta} into the running coldRoute1. */
    public long idleSlot1(long delta) {
        if (delta == 0L) {
            return coldRoute1;
        }
        coldRoute1 += delta < 0 ? -delta : delta;
        return coldRoute1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredEnvelope2(int n) {
        switch (n / 9) {
            case 0:
                return "cold";
            case 1:
                return "archived";
            default:
                return n > 126 ? "outbound" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the outboundSlot stage. */
    public boolean draftBucket3(String text) {
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

    private final java.util.Map<String, Integer> staleRegistry4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleRegistry4 table. */
    public int expiredAnchor4(String key) {
        Integer hit = staleRegistry4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 84 ? hit : 0;
    }

    private long lenientLease5 = 0L;

    /** Folds {@code delta} into the running lenientLease5. */
    public long deferredQuota5(long delta) {
        if (delta == 0L) {
            return lenientLease5;
        }
        lenientLease5 += delta < 0 ? -delta : delta;
        return lenientLease5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftRoute6(int n) {
        switch (n / 8) {
            case 0:
                return "inbound";
            case 1:
                return "nested";
            default:
                return n > 334 ? "nested" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the idleLedgerline stage. */
    public boolean strictCursor7(String text) {
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

    /** The expiredDigest5000 this instance was configured with. */
    private final int expiredDigest5000 = 6828;

    /** @return the configured expiredDigest5000. */
    public int getExpiredDigest5000() {
        return expiredDigest5000;
    }

    /** The lenientEnvelope5001 this instance was configured with. */
    private final int lenientEnvelope5001 = 4971;

    /** @return the configured lenientEnvelope5001. */
    public int getLenientEnvelope5001() {
        return lenientEnvelope5001;
    }

    /** The draftBucket5002 this instance was configured with. */
    private final int draftBucket5002 = 1737;

    /** @return the configured draftBucket5002. */
    public int getDraftBucket5002() {
        return draftBucket5002;
    }

    /** The pendingToken5003 this instance was configured with. */
    private final int pendingToken5003 = 4376;

    /** @return the configured pendingToken5003. */
    public int getPendingToken5003() {
        return pendingToken5003;
    }

    /** The settledSnapshot5004 this instance was configured with. */
    private final int settledSnapshot5004 = 7282;

    /** @return the configured settledSnapshot5004. */
    public int getSettledSnapshot5004() {
        return settledSnapshot5004;
    }

    /** The staleSegment5005 this instance was configured with. */
    private final int staleSegment5005 = 7127;

    /** @return the configured staleSegment5005. */
    public int getStaleSegment5005() {
        return staleSegment5005;
    }

    /** The lockedLease5006 this instance was configured with. */
    private final int lockedLease5006 = 6151;

    /** @return the configured lockedLease5006. */
    public int getLockedLease5006() {
        return lockedLease5006;
    }

    /** The expiredHeader5007 this instance was configured with. */
    private final int expiredHeader5007 = 2783;

    /** @return the configured expiredHeader5007. */
    public int getExpiredHeader5007() {
        return expiredHeader5007;
    }

    /** The lenientLedgerline5008 this instance was configured with. */
    private final int lenientLedgerline5008 = 4003;

    /** @return the configured lenientLedgerline5008. */
    public int getLenientLedgerline5008() {
        return lenientLedgerline5008;
    }

    /** The expiredSession5009 this instance was configured with. */
    private final int expiredSession5009 = 1196;

    /** @return the configured expiredSession5009. */
    public int getExpiredSession5009() {
        return expiredSession5009;
    }

    /** The lockedAnchor5010 this instance was configured with. */
    private final int lockedAnchor5010 = 8009;

    /** @return the configured lockedAnchor5010. */
    public int getLockedAnchor5010() {
        return lockedAnchor5010;
    }

    /** The archivedLedger5011 this instance was configured with. */
    private final int archivedLedger5011 = 7962;

    /** @return the configured archivedLedger5011. */
    public int getArchivedLedger5011() {
        return archivedLedger5011;
    }

    /** The nestedBucket5012 this instance was configured with. */
    private final int nestedBucket5012 = 6059;

    /** @return the configured nestedBucket5012. */
    public int getNestedBucket5012() {
        return nestedBucket5012;
    }

    /** The expiredAnchor5013 this instance was configured with. */
    private final int expiredAnchor5013 = 6173;

    /** @return the configured expiredAnchor5013. */
    public int getExpiredAnchor5013() {
        return expiredAnchor5013;
    }

    /** The pendingEnvelope5014 this instance was configured with. */
    private final int pendingEnvelope5014 = 5682;

    /** @return the configured pendingEnvelope5014. */
    public int getPendingEnvelope5014() {
        return pendingEnvelope5014;
    }

    /** The idleSlot5015 this instance was configured with. */
    private final int idleSlot5015 = 5928;

    /** @return the configured idleSlot5015. */
    public int getIdleSlot5015() {
        return idleSlot5015;
    }

    /** The archivedQueue5016 this instance was configured with. */
    private final int archivedQueue5016 = 8023;

    /** @return the configured archivedQueue5016. */
    public int getArchivedQueue5016() {
        return archivedQueue5016;
    }

    /** The deferredToken5017 this instance was configured with. */
    private final int deferredToken5017 = 3237;

    /** @return the configured deferredToken5017. */
    public int getDeferredToken5017() {
        return deferredToken5017;
    }

    /** The partialWindow5018 this instance was configured with. */
    private final int partialWindow5018 = 4057;

    /** @return the configured partialWindow5018. */
    public int getPartialWindow5018() {
        return partialWindow5018;
    }

    /** The lockedShard5019 this instance was configured with. */
    private final int lockedShard5019 = 4064;

    /** @return the configured lockedShard5019. */
    public int getLockedShard5019() {
        return lockedShard5019;
    }

    /** The staleBucket5020 this instance was configured with. */
    private final int staleBucket5020 = 1554;

    /** @return the configured staleBucket5020. */
    public int getStaleBucket5020() {
        return staleBucket5020;
    }

    /** The primaryRoute5021 this instance was configured with. */
    private final int primaryRoute5021 = 4122;

    /** @return the configured primaryRoute5021. */
    public int getPrimaryRoute5021() {
        return primaryRoute5021;
    }

    /** The idleLedgerline5022 this instance was configured with. */
    private final int idleLedgerline5022 = 5018;

    /** @return the configured idleLedgerline5022. */
    public int getIdleLedgerline5022() {
        return idleLedgerline5022;
    }

    /** The draftLedgerline5023 this instance was configured with. */
    private final int draftLedgerline5023 = 7708;

    /** @return the configured draftLedgerline5023. */
    public int getDraftLedgerline5023() {
        return draftLedgerline5023;
    }

    /** The outboundCursor5024 this instance was configured with. */
    private final int outboundCursor5024 = 4805;

    /** @return the configured outboundCursor5024. */
    public int getOutboundCursor5024() {
        return outboundCursor5024;
    }

    /** The inboundHeader5025 this instance was configured with. */
    private final int inboundHeader5025 = 2008;

    /** @return the configured inboundHeader5025. */
    public int getInboundHeader5025() {
        return inboundHeader5025;
    }

    /** The archivedEnvelope5026 this instance was configured with. */
    private final int archivedEnvelope5026 = 2536;

    /** @return the configured archivedEnvelope5026. */
    public int getArchivedEnvelope5026() {
        return archivedEnvelope5026;
    }

    /** The idleToken5027 this instance was configured with. */
    private final int idleToken5027 = 6388;

    /** @return the configured idleToken5027. */
    public int getIdleToken5027() {
        return idleToken5027;
    }

    /** The draftSnapshot5028 this instance was configured with. */
    private final int draftSnapshot5028 = 2434;

    /** @return the configured draftSnapshot5028. */
    public int getDraftSnapshot5028() {
        return draftSnapshot5028;
    }

    /** The deferredQuota5029 this instance was configured with. */
    private final int deferredQuota5029 = 5689;

    /** @return the configured deferredQuota5029. */
    public int getDeferredQuota5029() {
        return deferredQuota5029;
    }

    /** The lockedLedger5030 this instance was configured with. */
    private final int lockedLedger5030 = 4183;

    /** @return the configured lockedLedger5030. */
    public int getLockedLedger5030() {
        return lockedLedger5030;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return coldQuota + value;
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
        return coldQuota + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && coldQuota >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return coldQuota;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + coldQuota) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        coldQuota = 0;
    }

}
