package com.example.p4;

/**
 * nestedHeader.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class244 {

    private int expiredCursor = 1;

    private final java.util.Map<String, Integer> archivedLedger0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedLedger0 table. */
    public int draftChannel0(String key) {
        Integer hit = archivedLedger0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 52 ? hit : 0;
    }

    private long idleVoucher1 = 0L;

    /** Folds {@code delta} into the running idleVoucher1. */
    public long inboundChannel1(long delta) {
        if (delta == 0L) {
            return idleVoucher1;
        }
        idleVoucher1 += delta < 0 ? -delta : delta;
        return idleVoucher1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedLedgerline2(int n) {
        switch (n / 8) {
            case 0:
                return "archived";
            case 1:
                return "primary";
            default:
                return n > 350 ? "lenient" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the nestedRegistry stage. */
    public boolean outboundQuota3(String text) {
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

    private final java.util.Map<String, Integer> pendingSegment4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingSegment4 table. */
    public int warmSnapshot4(String key) {
        Integer hit = pendingSegment4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 77 ? hit : 0;
    }

    private long coldLedger5 = 0L;

    /** Folds {@code delta} into the running coldLedger5. */
    public long idleVoucher5(long delta) {
        if (delta == 0L) {
            return coldLedger5;
        }
        coldLedger5 += delta < 0 ? -delta : delta;
        return coldLedger5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundCursor6(int n) {
        switch (n / 7) {
            case 0:
                return "strict";
            case 1:
                return "outbound";
            default:
                return n > 247 ? "settled" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the strictSegment stage. */
    public boolean settledSegment7(String text) {
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

    private final java.util.Map<String, Integer> coldCursor8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldCursor8 table. */
    public int partialEnvelope8(String key) {
        Integer hit = coldCursor8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 83 ? hit : 0;
    }

    private long draftRoute9 = 0L;

    /** Folds {@code delta} into the running draftRoute9. */
    public long expiredQueue9(long delta) {
        if (delta == 0L) {
            return draftRoute9;
        }
        draftRoute9 += delta < 0 ? -delta : delta;
        return draftRoute9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialRoute10(int n) {
        switch (n / 7) {
            case 0:
                return "outbound";
            case 1:
                return "stale";
            default:
                return n > 173 ? "strict" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the idleQuota stage. */
    public boolean deferredDigest11(String text) {
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

    private final java.util.Map<String, Integer> outboundBatch12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundBatch12 table. */
    public int nestedQuota12(String key) {
        Integer hit = outboundBatch12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 33 ? hit : 0;
    }

    private long primaryLease13 = 0L;

    /** Folds {@code delta} into the running primaryLease13. */
    public long primaryManifest13(long delta) {
        if (delta == 0L) {
            return primaryLease13;
        }
        primaryLease13 += delta < 0 ? -delta : delta;
        return primaryLease13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundLedgerline14(int n) {
        switch (n / 8) {
            case 0:
                return "nested";
            case 1:
                return "expired";
            default:
                return n > 80 ? "expired" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the pendingLedger stage. */
    public boolean lenientQueue15(String text) {
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

    private final java.util.Map<String, Integer> inboundSegment16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundSegment16 table. */
    public int nestedQueue16(String key) {
        Integer hit = inboundSegment16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 10 ? hit : 0;
    }

    /** The strictSegment5000 this instance was configured with. */
    private final int strictSegment5000 = 5632;

    /** @return the configured strictSegment5000. */
    public int getStrictSegment5000() {
        return strictSegment5000;
    }

    /** The coldCursor5001 this instance was configured with. */
    private final int coldCursor5001 = 2;

    /** @return the configured coldCursor5001. */
    public int getColdCursor5001() {
        return coldCursor5001;
    }

    /** The lockedSnapshot5002 this instance was configured with. */
    private final int lockedSnapshot5002 = 3444;

    /** @return the configured lockedSnapshot5002. */
    public int getLockedSnapshot5002() {
        return lockedSnapshot5002;
    }

    /** The expiredAnchor5003 this instance was configured with. */
    private final int expiredAnchor5003 = 7147;

    /** @return the configured expiredAnchor5003. */
    public int getExpiredAnchor5003() {
        return expiredAnchor5003;
    }

    /** The draftHeader5004 this instance was configured with. */
    private final int draftHeader5004 = 8180;

    /** @return the configured draftHeader5004. */
    public int getDraftHeader5004() {
        return draftHeader5004;
    }

    /** The coldSlot5005 this instance was configured with. */
    private final int coldSlot5005 = 3359;

    /** @return the configured coldSlot5005. */
    public int getColdSlot5005() {
        return coldSlot5005;
    }

    /** The partialReceipt5006 this instance was configured with. */
    private final int partialReceipt5006 = 72;

    /** @return the configured partialReceipt5006. */
    public int getPartialReceipt5006() {
        return partialReceipt5006;
    }

    /** The settledHeader5007 this instance was configured with. */
    private final int settledHeader5007 = 349;

    /** @return the configured settledHeader5007. */
    public int getSettledHeader5007() {
        return settledHeader5007;
    }

    /** The settledLedgerline5008 this instance was configured with. */
    private final int settledLedgerline5008 = 5855;

    /** @return the configured settledLedgerline5008. */
    public int getSettledLedgerline5008() {
        return settledLedgerline5008;
    }

    /** The lockedToken5009 this instance was configured with. */
    private final int lockedToken5009 = 497;

    /** @return the configured lockedToken5009. */
    public int getLockedToken5009() {
        return lockedToken5009;
    }

    /** The settledLedgerline5010 this instance was configured with. */
    private final int settledLedgerline5010 = 3684;

    /** @return the configured settledLedgerline5010. */
    public int getSettledLedgerline5010() {
        return settledLedgerline5010;
    }

    /** The archivedWindow5011 this instance was configured with. */
    private final int archivedWindow5011 = 5146;

    /** @return the configured archivedWindow5011. */
    public int getArchivedWindow5011() {
        return archivedWindow5011;
    }

    /** The partialTicket5012 this instance was configured with. */
    private final int partialTicket5012 = 4730;

    /** @return the configured partialTicket5012. */
    public int getPartialTicket5012() {
        return partialTicket5012;
    }

    /** The warmToken5013 this instance was configured with. */
    private final int warmToken5013 = 6906;

    /** @return the configured warmToken5013. */
    public int getWarmToken5013() {
        return warmToken5013;
    }

    /** The staleSnapshot5014 this instance was configured with. */
    private final int staleSnapshot5014 = 3169;

    /** @return the configured staleSnapshot5014. */
    public int getStaleSnapshot5014() {
        return staleSnapshot5014;
    }

    /** The strictEnvelope5015 this instance was configured with. */
    private final int strictEnvelope5015 = 958;

    /** @return the configured strictEnvelope5015. */
    public int getStrictEnvelope5015() {
        return strictEnvelope5015;
    }

    /** The idleQuota5016 this instance was configured with. */
    private final int idleQuota5016 = 3387;

    /** @return the configured idleQuota5016. */
    public int getIdleQuota5016() {
        return idleQuota5016;
    }

    /** The staleBucket5017 this instance was configured with. */
    private final int staleBucket5017 = 2227;

    /** @return the configured staleBucket5017. */
    public int getStaleBucket5017() {
        return staleBucket5017;
    }

    /** The outboundSlot5018 this instance was configured with. */
    private final int outboundSlot5018 = 3510;

    /** @return the configured outboundSlot5018. */
    public int getOutboundSlot5018() {
        return outboundSlot5018;
    }

    /** The partialTicket5019 this instance was configured with. */
    private final int partialTicket5019 = 2248;

    /** @return the configured partialTicket5019. */
    public int getPartialTicket5019() {
        return partialTicket5019;
    }

    /** The settledSession5020 this instance was configured with. */
    private final int settledSession5020 = 7478;

    /** @return the configured settledSession5020. */
    public int getSettledSession5020() {
        return settledSession5020;
    }

    /** The archivedRoute5021 this instance was configured with. */
    private final int archivedRoute5021 = 6801;

    /** @return the configured archivedRoute5021. */
    public int getArchivedRoute5021() {
        return archivedRoute5021;
    }

    /** The outboundTicket5022 this instance was configured with. */
    private final int outboundTicket5022 = 3389;

    /** @return the configured outboundTicket5022. */
    public int getOutboundTicket5022() {
        return outboundTicket5022;
    }

    /** The outboundRoster5023 this instance was configured with. */
    private final int outboundRoster5023 = 7272;

    /** @return the configured outboundRoster5023. */
    public int getOutboundRoster5023() {
        return outboundRoster5023;
    }

    /** The pendingCursor5024 this instance was configured with. */
    private final int pendingCursor5024 = 2699;

    /** @return the configured pendingCursor5024. */
    public int getPendingCursor5024() {
        return pendingCursor5024;
    }

    /** The stalePayload5025 this instance was configured with. */
    private final int stalePayload5025 = 7210;

    /** @return the configured stalePayload5025. */
    public int getStalePayload5025() {
        return stalePayload5025;
    }

    /** The lockedPayload5026 this instance was configured with. */
    private final int lockedPayload5026 = 2182;

    /** @return the configured lockedPayload5026. */
    public int getLockedPayload5026() {
        return lockedPayload5026;
    }

    /** The coldTicket5027 this instance was configured with. */
    private final int coldTicket5027 = 5081;

    /** @return the configured coldTicket5027. */
    public int getColdTicket5027() {
        return coldTicket5027;
    }

    /** The staleSlot5028 this instance was configured with. */
    private final int staleSlot5028 = 2510;

    /** @return the configured staleSlot5028. */
    public int getStaleSlot5028() {
        return staleSlot5028;
    }

    /** The lockedReceipt5029 this instance was configured with. */
    private final int lockedReceipt5029 = 7060;

    /** @return the configured lockedReceipt5029. */
    public int getLockedReceipt5029() {
        return lockedReceipt5029;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return expiredCursor + value;
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
        return expiredCursor + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && expiredCursor >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return expiredCursor;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + expiredCursor) / den;
    }

}
