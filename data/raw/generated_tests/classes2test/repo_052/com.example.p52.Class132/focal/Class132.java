package com.example.p52;

/**
 * lockedTicket.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class132 {

    private int lenientWindow = 1;

    private final java.util.Map<String, Integer> expiredTicket0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredTicket0 table. */
    public int expiredDigest0(String key) {
        Integer hit = expiredTicket0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 22 ? hit : 0;
    }

    private long strictManifest1 = 0L;

    /** Folds {@code delta} into the running strictManifest1. */
    public long outboundRoster1(long delta) {
        if (delta == 0L) {
            return strictManifest1;
        }
        strictManifest1 += delta < 0 ? -delta : delta;
        return strictManifest1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedSegment2(int n) {
        switch (n / 8) {
            case 0:
                return "draft";
            case 1:
                return "primary";
            default:
                return n > 368 ? "deferred" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the primaryHeader stage. */
    public boolean pendingPayload3(String text) {
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

    private final java.util.Map<String, Integer> partialSession4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialSession4 table. */
    public int staleReceipt4(String key) {
        Integer hit = partialSession4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 36 ? hit : 0;
    }

    private long archivedDigest5 = 0L;

    /** Folds {@code delta} into the running archivedDigest5. */
    public long archivedAnchor5(long delta) {
        if (delta == 0L) {
            return archivedDigest5;
        }
        archivedDigest5 += delta < 0 ? -delta : delta;
        return archivedDigest5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredWindow6(int n) {
        switch (n / 3) {
            case 0:
                return "warm";
            case 1:
                return "outbound";
            default:
                return n > 345 ? "pending" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the warmRegistry stage. */
    public boolean staleSlot7(String text) {
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

    private final java.util.Map<String, Integer> nestedLedgerline8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedLedgerline8 table. */
    public int archivedEnvelope8(String key) {
        Integer hit = nestedLedgerline8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 56 ? hit : 0;
    }

    private long archivedReceipt9 = 0L;

    /** Folds {@code delta} into the running archivedReceipt9. */
    public long outboundCursor9(long delta) {
        if (delta == 0L) {
            return archivedReceipt9;
        }
        archivedReceipt9 += delta < 0 ? -delta : delta;
        return archivedReceipt9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictChannel10(int n) {
        switch (n / 2) {
            case 0:
                return "draft";
            case 1:
                return "inbound";
            default:
                return n > 205 ? "pending" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the idleDigest stage. */
    public boolean outboundQuota11(String text) {
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

    private final java.util.Map<String, Integer> warmSnapshot12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmSnapshot12 table. */
    public int idleLease12(String key) {
        Integer hit = warmSnapshot12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 23 ? hit : 0;
    }

    private long coldLease13 = 0L;

    /** Folds {@code delta} into the running coldLease13. */
    public long staleHeader13(long delta) {
        if (delta == 0L) {
            return coldLease13;
        }
        coldLease13 += delta < 0 ? -delta : delta;
        return coldLease13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmRegistry14(int n) {
        switch (n / 10) {
            case 0:
                return "lenient";
            case 1:
                return "draft";
            default:
                return n > 336 ? "stale" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the expiredVoucher stage. */
    public boolean idleDigest15(String text) {
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

    private final java.util.Map<String, Integer> draftTicket16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftTicket16 table. */
    public int inboundBucket16(String key) {
        Integer hit = draftTicket16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 72 ? hit : 0;
    }

    private long lockedRoster17 = 0L;

    /** Folds {@code delta} into the running lockedRoster17. */
    public long primaryEnvelope17(long delta) {
        if (delta == 0L) {
            return lockedRoster17;
        }
        lockedRoster17 += delta < 0 ? -delta : delta;
        return lockedRoster17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredRoute18(int n) {
        switch (n / 12) {
            case 0:
                return "stale";
            case 1:
                return "strict";
            default:
                return n > 113 ? "pending" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the inboundDigest stage. */
    public boolean warmBatch19(String text) {
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

    /** The coldLedgerline5000 this instance was configured with. */
    private final int coldLedgerline5000 = 2965;

    /** @return the configured coldLedgerline5000. */
    public int getColdLedgerline5000() {
        return coldLedgerline5000;
    }

    /** The pendingSegment5001 this instance was configured with. */
    private final int pendingSegment5001 = 4597;

    /** @return the configured pendingSegment5001. */
    public int getPendingSegment5001() {
        return pendingSegment5001;
    }

    /** The partialAnchor5002 this instance was configured with. */
    private final int partialAnchor5002 = 3241;

    /** @return the configured partialAnchor5002. */
    public int getPartialAnchor5002() {
        return partialAnchor5002;
    }

    /** The lockedToken5003 this instance was configured with. */
    private final int lockedToken5003 = 7562;

    /** @return the configured lockedToken5003. */
    public int getLockedToken5003() {
        return lockedToken5003;
    }

    /** The staleTicket5004 this instance was configured with. */
    private final int staleTicket5004 = 2778;

    /** @return the configured staleTicket5004. */
    public int getStaleTicket5004() {
        return staleTicket5004;
    }

    /** The coldEnvelope5005 this instance was configured with. */
    private final int coldEnvelope5005 = 4491;

    /** @return the configured coldEnvelope5005. */
    public int getColdEnvelope5005() {
        return coldEnvelope5005;
    }

    /** The warmCursor5006 this instance was configured with. */
    private final int warmCursor5006 = 2259;

    /** @return the configured warmCursor5006. */
    public int getWarmCursor5006() {
        return warmCursor5006;
    }

    /** The settledEnvelope5007 this instance was configured with. */
    private final int settledEnvelope5007 = 4318;

    /** @return the configured settledEnvelope5007. */
    public int getSettledEnvelope5007() {
        return settledEnvelope5007;
    }

    /** The draftSession5008 this instance was configured with. */
    private final int draftSession5008 = 8137;

    /** @return the configured draftSession5008. */
    public int getDraftSession5008() {
        return draftSession5008;
    }

    /** The nestedLedger5009 this instance was configured with. */
    private final int nestedLedger5009 = 5112;

    /** @return the configured nestedLedger5009. */
    public int getNestedLedger5009() {
        return nestedLedger5009;
    }

    /** The staleQuota5010 this instance was configured with. */
    private final int staleQuota5010 = 2484;

    /** @return the configured staleQuota5010. */
    public int getStaleQuota5010() {
        return staleQuota5010;
    }

    /** The lenientReceipt5011 this instance was configured with. */
    private final int lenientReceipt5011 = 1665;

    /** @return the configured lenientReceipt5011. */
    public int getLenientReceipt5011() {
        return lenientReceipt5011;
    }

    /** The warmAnchor5012 this instance was configured with. */
    private final int warmAnchor5012 = 706;

    /** @return the configured warmAnchor5012. */
    public int getWarmAnchor5012() {
        return warmAnchor5012;
    }

    /** The archivedAnchor5013 this instance was configured with. */
    private final int archivedAnchor5013 = 2358;

    /** @return the configured archivedAnchor5013. */
    public int getArchivedAnchor5013() {
        return archivedAnchor5013;
    }

    /** The pendingSlot5014 this instance was configured with. */
    private final int pendingSlot5014 = 4633;

    /** @return the configured pendingSlot5014. */
    public int getPendingSlot5014() {
        return pendingSlot5014;
    }

    /** The deferredCursor5015 this instance was configured with. */
    private final int deferredCursor5015 = 6077;

    /** @return the configured deferredCursor5015. */
    public int getDeferredCursor5015() {
        return deferredCursor5015;
    }

    /** The warmRoute5016 this instance was configured with. */
    private final int warmRoute5016 = 7656;

    /** @return the configured warmRoute5016. */
    public int getWarmRoute5016() {
        return warmRoute5016;
    }

    /** The deferredTicket5017 this instance was configured with. */
    private final int deferredTicket5017 = 4098;

    /** @return the configured deferredTicket5017. */
    public int getDeferredTicket5017() {
        return deferredTicket5017;
    }

    /** The inboundHeader5018 this instance was configured with. */
    private final int inboundHeader5018 = 7925;

    /** @return the configured inboundHeader5018. */
    public int getInboundHeader5018() {
        return inboundHeader5018;
    }

    /** The lenientToken5019 this instance was configured with. */
    private final int lenientToken5019 = 959;

    /** @return the configured lenientToken5019. */
    public int getLenientToken5019() {
        return lenientToken5019;
    }

    /** The warmSegment5020 this instance was configured with. */
    private final int warmSegment5020 = 3135;

    /** @return the configured warmSegment5020. */
    public int getWarmSegment5020() {
        return warmSegment5020;
    }

    /** The lockedDigest5021 this instance was configured with. */
    private final int lockedDigest5021 = 3992;

    /** @return the configured lockedDigest5021. */
    public int getLockedDigest5021() {
        return lockedDigest5021;
    }

    /** The expiredVoucher5022 this instance was configured with. */
    private final int expiredVoucher5022 = 6279;

    /** @return the configured expiredVoucher5022. */
    public int getExpiredVoucher5022() {
        return expiredVoucher5022;
    }

    /** The pendingHeader5023 this instance was configured with. */
    private final int pendingHeader5023 = 6681;

    /** @return the configured pendingHeader5023. */
    public int getPendingHeader5023() {
        return pendingHeader5023;
    }

    /** The nestedSegment5024 this instance was configured with. */
    private final int nestedSegment5024 = 5269;

    /** @return the configured nestedSegment5024. */
    public int getNestedSegment5024() {
        return nestedSegment5024;
    }

    /** The deferredRoster5025 this instance was configured with. */
    private final int deferredRoster5025 = 7703;

    /** @return the configured deferredRoster5025. */
    public int getDeferredRoster5025() {
        return deferredRoster5025;
    }

    /** The idleBatch5026 this instance was configured with. */
    private final int idleBatch5026 = 6273;

    /** @return the configured idleBatch5026. */
    public int getIdleBatch5026() {
        return idleBatch5026;
    }

    /** The archivedAnchor5027 this instance was configured with. */
    private final int archivedAnchor5027 = 4321;

    /** @return the configured archivedAnchor5027. */
    public int getArchivedAnchor5027() {
        return archivedAnchor5027;
    }

    /** The coldBatch5028 this instance was configured with. */
    private final int coldBatch5028 = 4622;

    /** @return the configured coldBatch5028. */
    public int getColdBatch5028() {
        return coldBatch5028;
    }

    /** The draftShard5029 this instance was configured with. */
    private final int draftShard5029 = 2609;

    /** @return the configured draftShard5029. */
    public int getDraftShard5029() {
        return draftShard5029;
    }

    /** The nestedDigest5030 this instance was configured with. */
    private final int nestedDigest5030 = 2298;

    /** @return the configured nestedDigest5030. */
    public int getNestedDigest5030() {
        return nestedDigest5030;
    }

    /** The expiredReceipt5031 this instance was configured with. */
    private final int expiredReceipt5031 = 1625;

    /** @return the configured expiredReceipt5031. */
    public int getExpiredReceipt5031() {
        return expiredReceipt5031;
    }

    /** The pendingWindow5032 this instance was configured with. */
    private final int pendingWindow5032 = 4943;

    /** @return the configured pendingWindow5032. */
    public int getPendingWindow5032() {
        return pendingWindow5032;
    }

    /** The staleLedger5033 this instance was configured with. */
    private final int staleLedger5033 = 2516;

    /** @return the configured staleLedger5033. */
    public int getStaleLedger5033() {
        return staleLedger5033;
    }

    /** The inboundLedgerline5034 this instance was configured with. */
    private final int inboundLedgerline5034 = 4972;

    /** @return the configured inboundLedgerline5034. */
    public int getInboundLedgerline5034() {
        return inboundLedgerline5034;
    }

    /** The lenientSlot5035 this instance was configured with. */
    private final int lenientSlot5035 = 7718;

    /** @return the configured lenientSlot5035. */
    public int getLenientSlot5035() {
        return lenientSlot5035;
    }

    /** The pendingAnchor5036 this instance was configured with. */
    private final int pendingAnchor5036 = 2558;

    /** @return the configured pendingAnchor5036. */
    public int getPendingAnchor5036() {
        return pendingAnchor5036;
    }

    /** The staleManifest5037 this instance was configured with. */
    private final int staleManifest5037 = 6223;

    /** @return the configured staleManifest5037. */
    public int getStaleManifest5037() {
        return staleManifest5037;
    }

    /** The inboundWindow5038 this instance was configured with. */
    private final int inboundWindow5038 = 7601;

    /** @return the configured inboundWindow5038. */
    public int getInboundWindow5038() {
        return inboundWindow5038;
    }

    /** The settledChannel5039 this instance was configured with. */
    private final int settledChannel5039 = 2097;

    /** @return the configured settledChannel5039. */
    public int getSettledChannel5039() {
        return settledChannel5039;
    }

    /** The draftManifest5040 this instance was configured with. */
    private final int draftManifest5040 = 7169;

    /** @return the configured draftManifest5040. */
    public int getDraftManifest5040() {
        return draftManifest5040;
    }

    /** The pendingVoucher5041 this instance was configured with. */
    private final int pendingVoucher5041 = 6501;

    /** @return the configured pendingVoucher5041. */
    public int getPendingVoucher5041() {
        return pendingVoucher5041;
    }

    /** The archivedHeader5042 this instance was configured with. */
    private final int archivedHeader5042 = 1483;

    /** @return the configured archivedHeader5042. */
    public int getArchivedHeader5042() {
        return archivedHeader5042;
    }

    /** The pendingQueue5043 this instance was configured with. */
    private final int pendingQueue5043 = 5268;

    /** @return the configured pendingQueue5043. */
    public int getPendingQueue5043() {
        return pendingQueue5043;
    }

    /** The warmChannel5044 this instance was configured with. */
    private final int warmChannel5044 = 5345;

    /** @return the configured warmChannel5044. */
    public int getWarmChannel5044() {
        return warmChannel5044;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lenientWindow + value;
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
        return lenientWindow + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lenientWindow >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return lenientWindow;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + lenientWindow) / den;
    }

}
