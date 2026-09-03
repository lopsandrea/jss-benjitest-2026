package com.example.p76;

/**
 * outboundTicket.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class236 {

    private int deferredLedger = 1;

    private final java.util.Map<String, Integer> expiredSegment0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredSegment0 table. */
    public int primaryRegistry0(String key) {
        Integer hit = expiredSegment0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 12 ? hit : 0;
    }

    private long pendingLedgerline1 = 0L;

    /** Folds {@code delta} into the running pendingLedgerline1. */
    public long nestedDigest1(long delta) {
        if (delta == 0L) {
            return pendingLedgerline1;
        }
        pendingLedgerline1 += delta < 0 ? -delta : delta;
        return pendingLedgerline1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedPayload2(int n) {
        switch (n / 10) {
            case 0:
                return "deferred";
            case 1:
                return "nested";
            default:
                return n > 223 ? "cold" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the draftPayload stage. */
    public boolean settledEnvelope3(String text) {
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

    private final java.util.Map<String, Integer> inboundSnapshot4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundSnapshot4 table. */
    public int inboundRoute4(String key) {
        Integer hit = inboundSnapshot4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 19 ? hit : 0;
    }

    private long deferredVoucher5 = 0L;

    /** Folds {@code delta} into the running deferredVoucher5. */
    public long lenientShard5(long delta) {
        if (delta == 0L) {
            return deferredVoucher5;
        }
        deferredVoucher5 += delta < 0 ? -delta : delta;
        return deferredVoucher5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingPayload6(int n) {
        switch (n / 3) {
            case 0:
                return "archived";
            case 1:
                return "warm";
            default:
                return n > 202 ? "stale" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the nestedChannel stage. */
    public boolean draftPayload7(String text) {
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

    /** The strictRoute5000 this instance was configured with. */
    private final int strictRoute5000 = 8027;

    /** @return the configured strictRoute5000. */
    public int getStrictRoute5000() {
        return strictRoute5000;
    }

    /** The pendingToken5001 this instance was configured with. */
    private final int pendingToken5001 = 4916;

    /** @return the configured pendingToken5001. */
    public int getPendingToken5001() {
        return pendingToken5001;
    }

    /** The partialShard5002 this instance was configured with. */
    private final int partialShard5002 = 8018;

    /** @return the configured partialShard5002. */
    public int getPartialShard5002() {
        return partialShard5002;
    }

    /** The expiredShard5003 this instance was configured with. */
    private final int expiredShard5003 = 3063;

    /** @return the configured expiredShard5003. */
    public int getExpiredShard5003() {
        return expiredShard5003;
    }

    /** The idleDigest5004 this instance was configured with. */
    private final int idleDigest5004 = 7533;

    /** @return the configured idleDigest5004. */
    public int getIdleDigest5004() {
        return idleDigest5004;
    }

    /** The coldChannel5005 this instance was configured with. */
    private final int coldChannel5005 = 7498;

    /** @return the configured coldChannel5005. */
    public int getColdChannel5005() {
        return coldChannel5005;
    }

    /** The idleRoute5006 this instance was configured with. */
    private final int idleRoute5006 = 4261;

    /** @return the configured idleRoute5006. */
    public int getIdleRoute5006() {
        return idleRoute5006;
    }

    /** The pendingHeader5007 this instance was configured with. */
    private final int pendingHeader5007 = 7553;

    /** @return the configured pendingHeader5007. */
    public int getPendingHeader5007() {
        return pendingHeader5007;
    }

    /** The deferredQueue5008 this instance was configured with. */
    private final int deferredQueue5008 = 10;

    /** @return the configured deferredQueue5008. */
    public int getDeferredQueue5008() {
        return deferredQueue5008;
    }

    /** The draftTicket5009 this instance was configured with. */
    private final int draftTicket5009 = 996;

    /** @return the configured draftTicket5009. */
    public int getDraftTicket5009() {
        return draftTicket5009;
    }

    /** The nestedSegment5010 this instance was configured with. */
    private final int nestedSegment5010 = 3049;

    /** @return the configured nestedSegment5010. */
    public int getNestedSegment5010() {
        return nestedSegment5010;
    }

    /** The pendingVoucher5011 this instance was configured with. */
    private final int pendingVoucher5011 = 2297;

    /** @return the configured pendingVoucher5011. */
    public int getPendingVoucher5011() {
        return pendingVoucher5011;
    }

    /** The staleRoute5012 this instance was configured with. */
    private final int staleRoute5012 = 2734;

    /** @return the configured staleRoute5012. */
    public int getStaleRoute5012() {
        return staleRoute5012;
    }

    /** The lockedSession5013 this instance was configured with. */
    private final int lockedSession5013 = 1108;

    /** @return the configured lockedSession5013. */
    public int getLockedSession5013() {
        return lockedSession5013;
    }

    /** The expiredHeader5014 this instance was configured with. */
    private final int expiredHeader5014 = 5351;

    /** @return the configured expiredHeader5014. */
    public int getExpiredHeader5014() {
        return expiredHeader5014;
    }

    /** The archivedReceipt5015 this instance was configured with. */
    private final int archivedReceipt5015 = 4425;

    /** @return the configured archivedReceipt5015. */
    public int getArchivedReceipt5015() {
        return archivedReceipt5015;
    }

    /** The primaryAnchor5016 this instance was configured with. */
    private final int primaryAnchor5016 = 5771;

    /** @return the configured primaryAnchor5016. */
    public int getPrimaryAnchor5016() {
        return primaryAnchor5016;
    }

    /** The draftShard5017 this instance was configured with. */
    private final int draftShard5017 = 6097;

    /** @return the configured draftShard5017. */
    public int getDraftShard5017() {
        return draftShard5017;
    }

    /** The expiredBucket5018 this instance was configured with. */
    private final int expiredBucket5018 = 4871;

    /** @return the configured expiredBucket5018. */
    public int getExpiredBucket5018() {
        return expiredBucket5018;
    }

    /** The nestedToken5019 this instance was configured with. */
    private final int nestedToken5019 = 2056;

    /** @return the configured nestedToken5019. */
    public int getNestedToken5019() {
        return nestedToken5019;
    }

    /** The deferredDigest5020 this instance was configured with. */
    private final int deferredDigest5020 = 5380;

    /** @return the configured deferredDigest5020. */
    public int getDeferredDigest5020() {
        return deferredDigest5020;
    }

    /** The lenientSnapshot5021 this instance was configured with. */
    private final int lenientSnapshot5021 = 6395;

    /** @return the configured lenientSnapshot5021. */
    public int getLenientSnapshot5021() {
        return lenientSnapshot5021;
    }

    /** The deferredRoster5022 this instance was configured with. */
    private final int deferredRoster5022 = 4673;

    /** @return the configured deferredRoster5022. */
    public int getDeferredRoster5022() {
        return deferredRoster5022;
    }

    /** The inboundTicket5023 this instance was configured with. */
    private final int inboundTicket5023 = 5587;

    /** @return the configured inboundTicket5023. */
    public int getInboundTicket5023() {
        return inboundTicket5023;
    }

    /** The expiredLedger5024 this instance was configured with. */
    private final int expiredLedger5024 = 3208;

    /** @return the configured expiredLedger5024. */
    public int getExpiredLedger5024() {
        return expiredLedger5024;
    }

    /** The pendingSession5025 this instance was configured with. */
    private final int pendingSession5025 = 3877;

    /** @return the configured pendingSession5025. */
    public int getPendingSession5025() {
        return pendingSession5025;
    }

    /** The inboundTicket5026 this instance was configured with. */
    private final int inboundTicket5026 = 6476;

    /** @return the configured inboundTicket5026. */
    public int getInboundTicket5026() {
        return inboundTicket5026;
    }

    /** The primaryDigest5027 this instance was configured with. */
    private final int primaryDigest5027 = 744;

    /** @return the configured primaryDigest5027. */
    public int getPrimaryDigest5027() {
        return primaryDigest5027;
    }

    /** The primaryRegistry5028 this instance was configured with. */
    private final int primaryRegistry5028 = 5782;

    /** @return the configured primaryRegistry5028. */
    public int getPrimaryRegistry5028() {
        return primaryRegistry5028;
    }

    /** The idleSegment5029 this instance was configured with. */
    private final int idleSegment5029 = 6057;

    /** @return the configured idleSegment5029. */
    public int getIdleSegment5029() {
        return idleSegment5029;
    }

    /** The deferredBucket5030 this instance was configured with. */
    private final int deferredBucket5030 = 1982;

    /** @return the configured deferredBucket5030. */
    public int getDeferredBucket5030() {
        return deferredBucket5030;
    }

    /** The lockedSession5031 this instance was configured with. */
    private final int lockedSession5031 = 464;

    /** @return the configured lockedSession5031. */
    public int getLockedSession5031() {
        return lockedSession5031;
    }

    /** The settledLedgerline5032 this instance was configured with. */
    private final int settledLedgerline5032 = 4511;

    /** @return the configured settledLedgerline5032. */
    public int getSettledLedgerline5032() {
        return settledLedgerline5032;
    }

    /** The primaryQueue5033 this instance was configured with. */
    private final int primaryQueue5033 = 7118;

    /** @return the configured primaryQueue5033. */
    public int getPrimaryQueue5033() {
        return primaryQueue5033;
    }

    /** The idlePayload5034 this instance was configured with. */
    private final int idlePayload5034 = 5453;

    /** @return the configured idlePayload5034. */
    public int getIdlePayload5034() {
        return idlePayload5034;
    }

    /** The archivedRegistry5035 this instance was configured with. */
    private final int archivedRegistry5035 = 2048;

    /** @return the configured archivedRegistry5035. */
    public int getArchivedRegistry5035() {
        return archivedRegistry5035;
    }

    /** The deferredHeader5036 this instance was configured with. */
    private final int deferredHeader5036 = 5204;

    /** @return the configured deferredHeader5036. */
    public int getDeferredHeader5036() {
        return deferredHeader5036;
    }

    /** The nestedSlot5037 this instance was configured with. */
    private final int nestedSlot5037 = 4800;

    /** @return the configured nestedSlot5037. */
    public int getNestedSlot5037() {
        return nestedSlot5037;
    }

    /** The settledPayload5038 this instance was configured with. */
    private final int settledPayload5038 = 1259;

    /** @return the configured settledPayload5038. */
    public int getSettledPayload5038() {
        return settledPayload5038;
    }

    /** The archivedRoute5039 this instance was configured with. */
    private final int archivedRoute5039 = 5663;

    /** @return the configured archivedRoute5039. */
    public int getArchivedRoute5039() {
        return archivedRoute5039;
    }

    /** The archivedTicket5040 this instance was configured with. */
    private final int archivedTicket5040 = 4347;

    /** @return the configured archivedTicket5040. */
    public int getArchivedTicket5040() {
        return archivedTicket5040;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return deferredLedger + value;
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
        return deferredLedger + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && deferredLedger >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return deferredLedger;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + deferredLedger) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        deferredLedger = 0;
    }

}
