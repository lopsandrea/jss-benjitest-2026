package com.example.p79;

/**
 * nestedReceipt.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class239 {

    private int nestedSession = 1;

    private final java.util.Map<String, Integer> archivedSession0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedSession0 table. */
    public int stalePayload0(String key) {
        Integer hit = archivedSession0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 64 ? hit : 0;
    }

    private long nestedRegistry1 = 0L;

    /** Folds {@code delta} into the running nestedRegistry1. */
    public long idleLease1(long delta) {
        if (delta == 0L) {
            return nestedRegistry1;
        }
        nestedRegistry1 += delta < 0 ? -delta : delta;
        return nestedRegistry1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundQuota2(int n) {
        switch (n / 3) {
            case 0:
                return "nested";
            case 1:
                return "primary";
            default:
                return n > 160 ? "warm" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the deferredReceipt stage. */
    public boolean expiredLease3(String text) {
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

    private final java.util.Map<String, Integer> lockedToken4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedToken4 table. */
    public int staleSession4(String key) {
        Integer hit = lockedToken4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 88 ? hit : 0;
    }

    private long pendingCursor5 = 0L;

    /** Folds {@code delta} into the running pendingCursor5. */
    public long outboundLedger5(long delta) {
        if (delta == 0L) {
            return pendingCursor5;
        }
        pendingCursor5 += delta < 0 ? -delta : delta;
        return pendingCursor5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialQuota6(int n) {
        switch (n / 3) {
            case 0:
                return "primary";
            case 1:
                return "idle";
            default:
                return n > 73 ? "warm" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the archivedCursor stage. */
    public boolean deferredBucket7(String text) {
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

    private final java.util.Map<String, Integer> inboundToken8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundToken8 table. */
    public int lenientTicket8(String key) {
        Integer hit = inboundToken8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 87 ? hit : 0;
    }

    private long outboundRoster9 = 0L;

    /** Folds {@code delta} into the running outboundRoster9. */
    public long nestedVoucher9(long delta) {
        if (delta == 0L) {
            return outboundRoster9;
        }
        outboundRoster9 += delta < 0 ? -delta : delta;
        return outboundRoster9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialRegistry10(int n) {
        switch (n / 10) {
            case 0:
                return "locked";
            case 1:
                return "partial";
            default:
                return n > 91 ? "expired" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the warmVoucher stage. */
    public boolean deferredVoucher11(String text) {
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

    private final java.util.Map<String, Integer> expiredShard12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredShard12 table. */
    public int draftSession12(String key) {
        Integer hit = expiredShard12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 35 ? hit : 0;
    }

    /** The expiredQueue5000 this instance was configured with. */
    private final int expiredQueue5000 = 5525;

    /** @return the configured expiredQueue5000. */
    public int getExpiredQueue5000() {
        return expiredQueue5000;
    }

    /** The archivedEnvelope5001 this instance was configured with. */
    private final int archivedEnvelope5001 = 5062;

    /** @return the configured archivedEnvelope5001. */
    public int getArchivedEnvelope5001() {
        return archivedEnvelope5001;
    }

    /** The lockedQuota5002 this instance was configured with. */
    private final int lockedQuota5002 = 935;

    /** @return the configured lockedQuota5002. */
    public int getLockedQuota5002() {
        return lockedQuota5002;
    }

    /** The pendingTicket5003 this instance was configured with. */
    private final int pendingTicket5003 = 6832;

    /** @return the configured pendingTicket5003. */
    public int getPendingTicket5003() {
        return pendingTicket5003;
    }

    /** The inboundLedger5004 this instance was configured with. */
    private final int inboundLedger5004 = 4679;

    /** @return the configured inboundLedger5004. */
    public int getInboundLedger5004() {
        return inboundLedger5004;
    }

    /** The expiredWindow5005 this instance was configured with. */
    private final int expiredWindow5005 = 3641;

    /** @return the configured expiredWindow5005. */
    public int getExpiredWindow5005() {
        return expiredWindow5005;
    }

    /** The expiredQueue5006 this instance was configured with. */
    private final int expiredQueue5006 = 4634;

    /** @return the configured expiredQueue5006. */
    public int getExpiredQueue5006() {
        return expiredQueue5006;
    }

    /** The deferredManifest5007 this instance was configured with. */
    private final int deferredManifest5007 = 2856;

    /** @return the configured deferredManifest5007. */
    public int getDeferredManifest5007() {
        return deferredManifest5007;
    }

    /** The strictSlot5008 this instance was configured with. */
    private final int strictSlot5008 = 2185;

    /** @return the configured strictSlot5008. */
    public int getStrictSlot5008() {
        return strictSlot5008;
    }

    /** The lenientWindow5009 this instance was configured with. */
    private final int lenientWindow5009 = 6010;

    /** @return the configured lenientWindow5009. */
    public int getLenientWindow5009() {
        return lenientWindow5009;
    }

    /** The deferredSegment5010 this instance was configured with. */
    private final int deferredSegment5010 = 3456;

    /** @return the configured deferredSegment5010. */
    public int getDeferredSegment5010() {
        return deferredSegment5010;
    }

    /** The expiredToken5011 this instance was configured with. */
    private final int expiredToken5011 = 1492;

    /** @return the configured expiredToken5011. */
    public int getExpiredToken5011() {
        return expiredToken5011;
    }

    /** The deferredBucket5012 this instance was configured with. */
    private final int deferredBucket5012 = 6156;

    /** @return the configured deferredBucket5012. */
    public int getDeferredBucket5012() {
        return deferredBucket5012;
    }

    /** The expiredToken5013 this instance was configured with. */
    private final int expiredToken5013 = 3246;

    /** @return the configured expiredToken5013. */
    public int getExpiredToken5013() {
        return expiredToken5013;
    }

    /** The draftToken5014 this instance was configured with. */
    private final int draftToken5014 = 2616;

    /** @return the configured draftToken5014. */
    public int getDraftToken5014() {
        return draftToken5014;
    }

    /** The draftLedgerline5015 this instance was configured with. */
    private final int draftLedgerline5015 = 7810;

    /** @return the configured draftLedgerline5015. */
    public int getDraftLedgerline5015() {
        return draftLedgerline5015;
    }

    /** The deferredQuota5016 this instance was configured with. */
    private final int deferredQuota5016 = 1642;

    /** @return the configured deferredQuota5016. */
    public int getDeferredQuota5016() {
        return deferredQuota5016;
    }

    /** The deferredCursor5017 this instance was configured with. */
    private final int deferredCursor5017 = 4052;

    /** @return the configured deferredCursor5017. */
    public int getDeferredCursor5017() {
        return deferredCursor5017;
    }

    /** The lenientQuota5018 this instance was configured with. */
    private final int lenientQuota5018 = 2657;

    /** @return the configured lenientQuota5018. */
    public int getLenientQuota5018() {
        return lenientQuota5018;
    }

    /** The idleCursor5019 this instance was configured with. */
    private final int idleCursor5019 = 6817;

    /** @return the configured idleCursor5019. */
    public int getIdleCursor5019() {
        return idleCursor5019;
    }

    /** The nestedRoute5020 this instance was configured with. */
    private final int nestedRoute5020 = 8163;

    /** @return the configured nestedRoute5020. */
    public int getNestedRoute5020() {
        return nestedRoute5020;
    }

    /** The coldPayload5021 this instance was configured with. */
    private final int coldPayload5021 = 6000;

    /** @return the configured coldPayload5021. */
    public int getColdPayload5021() {
        return coldPayload5021;
    }

    /** The archivedRoute5022 this instance was configured with. */
    private final int archivedRoute5022 = 7516;

    /** @return the configured archivedRoute5022. */
    public int getArchivedRoute5022() {
        return archivedRoute5022;
    }

    /** The expiredLease5023 this instance was configured with. */
    private final int expiredLease5023 = 737;

    /** @return the configured expiredLease5023. */
    public int getExpiredLease5023() {
        return expiredLease5023;
    }

    /** The warmSegment5024 this instance was configured with. */
    private final int warmSegment5024 = 7428;

    /** @return the configured warmSegment5024. */
    public int getWarmSegment5024() {
        return warmSegment5024;
    }

    /** The idleSession5025 this instance was configured with. */
    private final int idleSession5025 = 3680;

    /** @return the configured idleSession5025. */
    public int getIdleSession5025() {
        return idleSession5025;
    }

    /** The settledBucket5026 this instance was configured with. */
    private final int settledBucket5026 = 5496;

    /** @return the configured settledBucket5026. */
    public int getSettledBucket5026() {
        return settledBucket5026;
    }

    /** The deferredAnchor5027 this instance was configured with. */
    private final int deferredAnchor5027 = 2577;

    /** @return the configured deferredAnchor5027. */
    public int getDeferredAnchor5027() {
        return deferredAnchor5027;
    }

    /** The idleChannel5028 this instance was configured with. */
    private final int idleChannel5028 = 4047;

    /** @return the configured idleChannel5028. */
    public int getIdleChannel5028() {
        return idleChannel5028;
    }

    /** The settledQuota5029 this instance was configured with. */
    private final int settledQuota5029 = 3247;

    /** @return the configured settledQuota5029. */
    public int getSettledQuota5029() {
        return settledQuota5029;
    }

    /** The partialChannel5030 this instance was configured with. */
    private final int partialChannel5030 = 8101;

    /** @return the configured partialChannel5030. */
    public int getPartialChannel5030() {
        return partialChannel5030;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return nestedSession + value;
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
        return nestedSession + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && nestedSession >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return nestedSession;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + nestedSession) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        nestedSession = 0;
    }

}
