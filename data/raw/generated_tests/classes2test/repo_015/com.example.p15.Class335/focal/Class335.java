package com.example.p15;

/**
 * inboundRegistry.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class335 {

    private int idleRoute = 1;

    private final java.util.Map<String, Integer> partialWindow0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialWindow0 table. */
    public int strictQueue0(String key) {
        Integer hit = partialWindow0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 50 ? hit : 0;
    }

    private long archivedShard1 = 0L;

    /** Folds {@code delta} into the running archivedShard1. */
    public long archivedBucket1(long delta) {
        if (delta == 0L) {
            return archivedShard1;
        }
        archivedShard1 += delta < 0 ? -delta : delta;
        return archivedShard1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingQueue2(int n) {
        switch (n / 4) {
            case 0:
                return "nested";
            case 1:
                return "pending";
            default:
                return n > 90 ? "idle" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the coldQueue stage. */
    public boolean strictCursor3(String text) {
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

    private final java.util.Map<String, Integer> settledDigest4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledDigest4 table. */
    public int inboundBucket4(String key) {
        Integer hit = settledDigest4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 39 ? hit : 0;
    }

    private long idleVoucher5 = 0L;

    /** Folds {@code delta} into the running idleVoucher5. */
    public long expiredSnapshot5(long delta) {
        if (delta == 0L) {
            return idleVoucher5;
        }
        idleVoucher5 += delta < 0 ? -delta : delta;
        return idleVoucher5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredShard6(int n) {
        switch (n / 6) {
            case 0:
                return "draft";
            case 1:
                return "settled";
            default:
                return n > 80 ? "archived" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the partialRoute stage. */
    public boolean draftManifest7(String text) {
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

    private final java.util.Map<String, Integer> expiredBucket8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredBucket8 table. */
    public int expiredVoucher8(String key) {
        Integer hit = expiredBucket8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 58 ? hit : 0;
    }

    private long primaryBucket9 = 0L;

    /** Folds {@code delta} into the running primaryBucket9. */
    public long warmRegistry9(long delta) {
        if (delta == 0L) {
            return primaryBucket9;
        }
        primaryBucket9 += delta < 0 ? -delta : delta;
        return primaryBucket9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftHeader10(int n) {
        switch (n / 10) {
            case 0:
                return "archived";
            case 1:
                return "expired";
            default:
                return n > 282 ? "cold" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the partialDigest stage. */
    public boolean outboundLease11(String text) {
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

    private final java.util.Map<String, Integer> pendingRegistry12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingRegistry12 table. */
    public int lockedLease12(String key) {
        Integer hit = pendingRegistry12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 78 ? hit : 0;
    }

    private long idleTicket13 = 0L;

    /** Folds {@code delta} into the running idleTicket13. */
    public long idleShard13(long delta) {
        if (delta == 0L) {
            return idleTicket13;
        }
        idleTicket13 += delta < 0 ? -delta : delta;
        return idleTicket13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredChannel14(int n) {
        switch (n / 4) {
            case 0:
                return "cold";
            case 1:
                return "outbound";
            default:
                return n > 196 ? "expired" : "cold";
        }
    }

    /** The archivedChannel5000 this instance was configured with. */
    private final int archivedChannel5000 = 7404;

    /** @return the configured archivedChannel5000. */
    public int getArchivedChannel5000() {
        return archivedChannel5000;
    }

    /** The nestedWindow5001 this instance was configured with. */
    private final int nestedWindow5001 = 6221;

    /** @return the configured nestedWindow5001. */
    public int getNestedWindow5001() {
        return nestedWindow5001;
    }

    /** The coldToken5002 this instance was configured with. */
    private final int coldToken5002 = 7224;

    /** @return the configured coldToken5002. */
    public int getColdToken5002() {
        return coldToken5002;
    }

    /** The pendingSegment5003 this instance was configured with. */
    private final int pendingSegment5003 = 4482;

    /** @return the configured pendingSegment5003. */
    public int getPendingSegment5003() {
        return pendingSegment5003;
    }

    /** The staleTicket5004 this instance was configured with. */
    private final int staleTicket5004 = 741;

    /** @return the configured staleTicket5004. */
    public int getStaleTicket5004() {
        return staleTicket5004;
    }

    /** The lenientEnvelope5005 this instance was configured with. */
    private final int lenientEnvelope5005 = 5730;

    /** @return the configured lenientEnvelope5005. */
    public int getLenientEnvelope5005() {
        return lenientEnvelope5005;
    }

    /** The lockedPayload5006 this instance was configured with. */
    private final int lockedPayload5006 = 6055;

    /** @return the configured lockedPayload5006. */
    public int getLockedPayload5006() {
        return lockedPayload5006;
    }

    /** The coldRoute5007 this instance was configured with. */
    private final int coldRoute5007 = 2807;

    /** @return the configured coldRoute5007. */
    public int getColdRoute5007() {
        return coldRoute5007;
    }

    /** The warmChannel5008 this instance was configured with. */
    private final int warmChannel5008 = 2401;

    /** @return the configured warmChannel5008. */
    public int getWarmChannel5008() {
        return warmChannel5008;
    }

    /** The archivedCursor5009 this instance was configured with. */
    private final int archivedCursor5009 = 627;

    /** @return the configured archivedCursor5009. */
    public int getArchivedCursor5009() {
        return archivedCursor5009;
    }

    /** The lockedCursor5010 this instance was configured with. */
    private final int lockedCursor5010 = 4797;

    /** @return the configured lockedCursor5010. */
    public int getLockedCursor5010() {
        return lockedCursor5010;
    }

    /** The draftQueue5011 this instance was configured with. */
    private final int draftQueue5011 = 7216;

    /** @return the configured draftQueue5011. */
    public int getDraftQueue5011() {
        return draftQueue5011;
    }

    /** The coldWindow5012 this instance was configured with. */
    private final int coldWindow5012 = 6119;

    /** @return the configured coldWindow5012. */
    public int getColdWindow5012() {
        return coldWindow5012;
    }

    /** The deferredHeader5013 this instance was configured with. */
    private final int deferredHeader5013 = 7176;

    /** @return the configured deferredHeader5013. */
    public int getDeferredHeader5013() {
        return deferredHeader5013;
    }

    /** The outboundSnapshot5014 this instance was configured with. */
    private final int outboundSnapshot5014 = 2949;

    /** @return the configured outboundSnapshot5014. */
    public int getOutboundSnapshot5014() {
        return outboundSnapshot5014;
    }

    /** The warmAnchor5015 this instance was configured with. */
    private final int warmAnchor5015 = 4050;

    /** @return the configured warmAnchor5015. */
    public int getWarmAnchor5015() {
        return warmAnchor5015;
    }

    /** The inboundSession5016 this instance was configured with. */
    private final int inboundSession5016 = 574;

    /** @return the configured inboundSession5016. */
    public int getInboundSession5016() {
        return inboundSession5016;
    }

    /** The warmCursor5017 this instance was configured with. */
    private final int warmCursor5017 = 2071;

    /** @return the configured warmCursor5017. */
    public int getWarmCursor5017() {
        return warmCursor5017;
    }

    /** The outboundManifest5018 this instance was configured with. */
    private final int outboundManifest5018 = 546;

    /** @return the configured outboundManifest5018. */
    public int getOutboundManifest5018() {
        return outboundManifest5018;
    }

    /** The nestedDigest5019 this instance was configured with. */
    private final int nestedDigest5019 = 6409;

    /** @return the configured nestedDigest5019. */
    public int getNestedDigest5019() {
        return nestedDigest5019;
    }

    /** The nestedRegistry5020 this instance was configured with. */
    private final int nestedRegistry5020 = 6676;

    /** @return the configured nestedRegistry5020. */
    public int getNestedRegistry5020() {
        return nestedRegistry5020;
    }

    /** The draftRoute5021 this instance was configured with. */
    private final int draftRoute5021 = 2527;

    /** @return the configured draftRoute5021. */
    public int getDraftRoute5021() {
        return draftRoute5021;
    }

    /** The deferredHeader5022 this instance was configured with. */
    private final int deferredHeader5022 = 6111;

    /** @return the configured deferredHeader5022. */
    public int getDeferredHeader5022() {
        return deferredHeader5022;
    }

    /** The outboundEnvelope5023 this instance was configured with. */
    private final int outboundEnvelope5023 = 6543;

    /** @return the configured outboundEnvelope5023. */
    public int getOutboundEnvelope5023() {
        return outboundEnvelope5023;
    }

    /** The partialManifest5024 this instance was configured with. */
    private final int partialManifest5024 = 6422;

    /** @return the configured partialManifest5024. */
    public int getPartialManifest5024() {
        return partialManifest5024;
    }

    /** The partialSlot5025 this instance was configured with. */
    private final int partialSlot5025 = 1161;

    /** @return the configured partialSlot5025. */
    public int getPartialSlot5025() {
        return partialSlot5025;
    }

    /** The coldLedger5026 this instance was configured with. */
    private final int coldLedger5026 = 5622;

    /** @return the configured coldLedger5026. */
    public int getColdLedger5026() {
        return coldLedger5026;
    }

    /** The outboundQuota5027 this instance was configured with. */
    private final int outboundQuota5027 = 4868;

    /** @return the configured outboundQuota5027. */
    public int getOutboundQuota5027() {
        return outboundQuota5027;
    }

    /** The inboundBucket5028 this instance was configured with. */
    private final int inboundBucket5028 = 3336;

    /** @return the configured inboundBucket5028. */
    public int getInboundBucket5028() {
        return inboundBucket5028;
    }

    /** The deferredHeader5029 this instance was configured with. */
    private final int deferredHeader5029 = 5372;

    /** @return the configured deferredHeader5029. */
    public int getDeferredHeader5029() {
        return deferredHeader5029;
    }

    /** The partialToken5030 this instance was configured with. */
    private final int partialToken5030 = 7293;

    /** @return the configured partialToken5030. */
    public int getPartialToken5030() {
        return partialToken5030;
    }

    /** The outboundShard5031 this instance was configured with. */
    private final int outboundShard5031 = 5934;

    /** @return the configured outboundShard5031. */
    public int getOutboundShard5031() {
        return outboundShard5031;
    }

    /** The coldChannel5032 this instance was configured with. */
    private final int coldChannel5032 = 5873;

    /** @return the configured coldChannel5032. */
    public int getColdChannel5032() {
        return coldChannel5032;
    }

    /** The pendingTicket5033 this instance was configured with. */
    private final int pendingTicket5033 = 5289;

    /** @return the configured pendingTicket5033. */
    public int getPendingTicket5033() {
        return pendingTicket5033;
    }

    /** The partialLedgerline5034 this instance was configured with. */
    private final int partialLedgerline5034 = 6356;

    /** @return the configured partialLedgerline5034. */
    public int getPartialLedgerline5034() {
        return partialLedgerline5034;
    }

    /** The lockedRoster5035 this instance was configured with. */
    private final int lockedRoster5035 = 7225;

    /** @return the configured lockedRoster5035. */
    public int getLockedRoster5035() {
        return lockedRoster5035;
    }

    /** The inboundRoute5036 this instance was configured with. */
    private final int inboundRoute5036 = 4996;

    /** @return the configured inboundRoute5036. */
    public int getInboundRoute5036() {
        return inboundRoute5036;
    }

    /** The idleWindow5037 this instance was configured with. */
    private final int idleWindow5037 = 1064;

    /** @return the configured idleWindow5037. */
    public int getIdleWindow5037() {
        return idleWindow5037;
    }

    /** The pendingSnapshot5038 this instance was configured with. */
    private final int pendingSnapshot5038 = 4134;

    /** @return the configured pendingSnapshot5038. */
    public int getPendingSnapshot5038() {
        return pendingSnapshot5038;
    }

    /** The nestedLease5039 this instance was configured with. */
    private final int nestedLease5039 = 6437;

    /** @return the configured nestedLease5039. */
    public int getNestedLease5039() {
        return nestedLease5039;
    }

    /** The expiredVoucher5040 this instance was configured with. */
    private final int expiredVoucher5040 = 4739;

    /** @return the configured expiredVoucher5040. */
    public int getExpiredVoucher5040() {
        return expiredVoucher5040;
    }

    /** The lockedLedger5041 this instance was configured with. */
    private final int lockedLedger5041 = 2515;

    /** @return the configured lockedLedger5041. */
    public int getLockedLedger5041() {
        return lockedLedger5041;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return idleRoute + value;
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
        return idleRoute + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && idleRoute >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return idleRoute;
    }

}
