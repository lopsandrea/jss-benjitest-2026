package com.example.p0;

/**
 * nestedAnchor.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class240 {

    private int idleRegistry = 1;

    private final java.util.Map<String, Integer> deferredAnchor0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredAnchor0 table. */
    public int coldBatch0(String key) {
        Integer hit = deferredAnchor0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 73 ? hit : 0;
    }

    private long outboundAnchor1 = 0L;

    /** Folds {@code delta} into the running outboundAnchor1. */
    public long expiredPayload1(long delta) {
        if (delta == 0L) {
            return outboundAnchor1;
        }
        outboundAnchor1 += delta < 0 ? -delta : delta;
        return outboundAnchor1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleQueue2(int n) {
        switch (n / 4) {
            case 0:
                return "outbound";
            case 1:
                return "deferred";
            default:
                return n > 267 ? "expired" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the outboundWindow stage. */
    public boolean warmEnvelope3(String text) {
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

    private final java.util.Map<String, Integer> nestedSession4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedSession4 table. */
    public int expiredLedger4(String key) {
        Integer hit = nestedSession4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 44 ? hit : 0;
    }

    private long warmLedger5 = 0L;

    /** Folds {@code delta} into the running warmLedger5. */
    public long inboundShard5(long delta) {
        if (delta == 0L) {
            return warmLedger5;
        }
        warmLedger5 += delta < 0 ? -delta : delta;
        return warmLedger5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idlePayload6(int n) {
        switch (n / 12) {
            case 0:
                return "strict";
            case 1:
                return "nested";
            default:
                return n > 141 ? "cold" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the inboundChannel stage. */
    public boolean lenientWindow7(String text) {
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

    /** The strictAnchor5000 this instance was configured with. */
    private final int strictAnchor5000 = 848;

    /** @return the configured strictAnchor5000. */
    public int getStrictAnchor5000() {
        return strictAnchor5000;
    }

    /** The expiredChannel5001 this instance was configured with. */
    private final int expiredChannel5001 = 3620;

    /** @return the configured expiredChannel5001. */
    public int getExpiredChannel5001() {
        return expiredChannel5001;
    }

    /** The expiredChannel5002 this instance was configured with. */
    private final int expiredChannel5002 = 1844;

    /** @return the configured expiredChannel5002. */
    public int getExpiredChannel5002() {
        return expiredChannel5002;
    }

    /** The settledLedger5003 this instance was configured with. */
    private final int settledLedger5003 = 520;

    /** @return the configured settledLedger5003. */
    public int getSettledLedger5003() {
        return settledLedger5003;
    }

    /** The archivedToken5004 this instance was configured with. */
    private final int archivedToken5004 = 7796;

    /** @return the configured archivedToken5004. */
    public int getArchivedToken5004() {
        return archivedToken5004;
    }

    /** The draftSegment5005 this instance was configured with. */
    private final int draftSegment5005 = 6673;

    /** @return the configured draftSegment5005. */
    public int getDraftSegment5005() {
        return draftSegment5005;
    }

    /** The deferredTicket5006 this instance was configured with. */
    private final int deferredTicket5006 = 4172;

    /** @return the configured deferredTicket5006. */
    public int getDeferredTicket5006() {
        return deferredTicket5006;
    }

    /** The deferredSlot5007 this instance was configured with. */
    private final int deferredSlot5007 = 2030;

    /** @return the configured deferredSlot5007. */
    public int getDeferredSlot5007() {
        return deferredSlot5007;
    }

    /** The deferredHeader5008 this instance was configured with. */
    private final int deferredHeader5008 = 7847;

    /** @return the configured deferredHeader5008. */
    public int getDeferredHeader5008() {
        return deferredHeader5008;
    }

    /** The nestedQuota5009 this instance was configured with. */
    private final int nestedQuota5009 = 1982;

    /** @return the configured nestedQuota5009. */
    public int getNestedQuota5009() {
        return nestedQuota5009;
    }

    /** The lenientPayload5010 this instance was configured with. */
    private final int lenientPayload5010 = 2057;

    /** @return the configured lenientPayload5010. */
    public int getLenientPayload5010() {
        return lenientPayload5010;
    }

    /** The inboundAnchor5011 this instance was configured with. */
    private final int inboundAnchor5011 = 3212;

    /** @return the configured inboundAnchor5011. */
    public int getInboundAnchor5011() {
        return inboundAnchor5011;
    }

    /** The warmBucket5012 this instance was configured with. */
    private final int warmBucket5012 = 912;

    /** @return the configured warmBucket5012. */
    public int getWarmBucket5012() {
        return warmBucket5012;
    }

    /** The lockedChannel5013 this instance was configured with. */
    private final int lockedChannel5013 = 3180;

    /** @return the configured lockedChannel5013. */
    public int getLockedChannel5013() {
        return lockedChannel5013;
    }

    /** The inboundLease5014 this instance was configured with. */
    private final int inboundLease5014 = 7070;

    /** @return the configured inboundLease5014. */
    public int getInboundLease5014() {
        return inboundLease5014;
    }

    /** The warmAnchor5015 this instance was configured with. */
    private final int warmAnchor5015 = 294;

    /** @return the configured warmAnchor5015. */
    public int getWarmAnchor5015() {
        return warmAnchor5015;
    }

    /** The pendingSession5016 this instance was configured with. */
    private final int pendingSession5016 = 382;

    /** @return the configured pendingSession5016. */
    public int getPendingSession5016() {
        return pendingSession5016;
    }

    /** The strictHeader5017 this instance was configured with. */
    private final int strictHeader5017 = 6095;

    /** @return the configured strictHeader5017. */
    public int getStrictHeader5017() {
        return strictHeader5017;
    }

    /** The draftBucket5018 this instance was configured with. */
    private final int draftBucket5018 = 7045;

    /** @return the configured draftBucket5018. */
    public int getDraftBucket5018() {
        return draftBucket5018;
    }

    /** The archivedSnapshot5019 this instance was configured with. */
    private final int archivedSnapshot5019 = 4611;

    /** @return the configured archivedSnapshot5019. */
    public int getArchivedSnapshot5019() {
        return archivedSnapshot5019;
    }

    /** The staleSession5020 this instance was configured with. */
    private final int staleSession5020 = 781;

    /** @return the configured staleSession5020. */
    public int getStaleSession5020() {
        return staleSession5020;
    }

    /** The lockedLedgerline5021 this instance was configured with. */
    private final int lockedLedgerline5021 = 6735;

    /** @return the configured lockedLedgerline5021. */
    public int getLockedLedgerline5021() {
        return lockedLedgerline5021;
    }

    /** The warmLedger5022 this instance was configured with. */
    private final int warmLedger5022 = 5958;

    /** @return the configured warmLedger5022. */
    public int getWarmLedger5022() {
        return warmLedger5022;
    }

    /** The inboundManifest5023 this instance was configured with. */
    private final int inboundManifest5023 = 6164;

    /** @return the configured inboundManifest5023. */
    public int getInboundManifest5023() {
        return inboundManifest5023;
    }

    /** The draftQueue5024 this instance was configured with. */
    private final int draftQueue5024 = 2431;

    /** @return the configured draftQueue5024. */
    public int getDraftQueue5024() {
        return draftQueue5024;
    }

    /** The inboundAnchor5025 this instance was configured with. */
    private final int inboundAnchor5025 = 1107;

    /** @return the configured inboundAnchor5025. */
    public int getInboundAnchor5025() {
        return inboundAnchor5025;
    }

    /** The coldToken5026 this instance was configured with. */
    private final int coldToken5026 = 4528;

    /** @return the configured coldToken5026. */
    public int getColdToken5026() {
        return coldToken5026;
    }

    /** The archivedQueue5027 this instance was configured with. */
    private final int archivedQueue5027 = 5677;

    /** @return the configured archivedQueue5027. */
    public int getArchivedQueue5027() {
        return archivedQueue5027;
    }

    /** The coldBucket5028 this instance was configured with. */
    private final int coldBucket5028 = 138;

    /** @return the configured coldBucket5028. */
    public int getColdBucket5028() {
        return coldBucket5028;
    }

    /** The archivedHeader5029 this instance was configured with. */
    private final int archivedHeader5029 = 655;

    /** @return the configured archivedHeader5029. */
    public int getArchivedHeader5029() {
        return archivedHeader5029;
    }

    /** The pendingVoucher5030 this instance was configured with. */
    private final int pendingVoucher5030 = 2568;

    /** @return the configured pendingVoucher5030. */
    public int getPendingVoucher5030() {
        return pendingVoucher5030;
    }

    /** The outboundQuota5031 this instance was configured with. */
    private final int outboundQuota5031 = 6601;

    /** @return the configured outboundQuota5031. */
    public int getOutboundQuota5031() {
        return outboundQuota5031;
    }

    /** The lockedCursor5032 this instance was configured with. */
    private final int lockedCursor5032 = 5049;

    /** @return the configured lockedCursor5032. */
    public int getLockedCursor5032() {
        return lockedCursor5032;
    }

    /** The lenientWindow5033 this instance was configured with. */
    private final int lenientWindow5033 = 4208;

    /** @return the configured lenientWindow5033. */
    public int getLenientWindow5033() {
        return lenientWindow5033;
    }

    /** The archivedQueue5034 this instance was configured with. */
    private final int archivedQueue5034 = 341;

    /** @return the configured archivedQueue5034. */
    public int getArchivedQueue5034() {
        return archivedQueue5034;
    }

    /** The settledDigest5035 this instance was configured with. */
    private final int settledDigest5035 = 7374;

    /** @return the configured settledDigest5035. */
    public int getSettledDigest5035() {
        return settledDigest5035;
    }

    /** The strictQuota5036 this instance was configured with. */
    private final int strictQuota5036 = 3569;

    /** @return the configured strictQuota5036. */
    public int getStrictQuota5036() {
        return strictQuota5036;
    }

    /** The idleLease5037 this instance was configured with. */
    private final int idleLease5037 = 737;

    /** @return the configured idleLease5037. */
    public int getIdleLease5037() {
        return idleLease5037;
    }

    /** The archivedEnvelope5038 this instance was configured with. */
    private final int archivedEnvelope5038 = 4677;

    /** @return the configured archivedEnvelope5038. */
    public int getArchivedEnvelope5038() {
        return archivedEnvelope5038;
    }

    /** The primaryCursor5039 this instance was configured with. */
    private final int primaryCursor5039 = 2257;

    /** @return the configured primaryCursor5039. */
    public int getPrimaryCursor5039() {
        return primaryCursor5039;
    }

    /** The lenientDigest5040 this instance was configured with. */
    private final int lenientDigest5040 = 8112;

    /** @return the configured lenientDigest5040. */
    public int getLenientDigest5040() {
        return lenientDigest5040;
    }

    /** The expiredSession5041 this instance was configured with. */
    private final int expiredSession5041 = 793;

    /** @return the configured expiredSession5041. */
    public int getExpiredSession5041() {
        return expiredSession5041;
    }

    /** The archivedBatch5042 this instance was configured with. */
    private final int archivedBatch5042 = 1809;

    /** @return the configured archivedBatch5042. */
    public int getArchivedBatch5042() {
        return archivedBatch5042;
    }

    /** The partialManifest5043 this instance was configured with. */
    private final int partialManifest5043 = 6920;

    /** @return the configured partialManifest5043. */
    public int getPartialManifest5043() {
        return partialManifest5043;
    }

    /** The expiredTicket5044 this instance was configured with. */
    private final int expiredTicket5044 = 3086;

    /** @return the configured expiredTicket5044. */
    public int getExpiredTicket5044() {
        return expiredTicket5044;
    }

    /** The deferredManifest5045 this instance was configured with. */
    private final int deferredManifest5045 = 523;

    /** @return the configured deferredManifest5045. */
    public int getDeferredManifest5045() {
        return deferredManifest5045;
    }

    /** The strictChannel5046 this instance was configured with. */
    private final int strictChannel5046 = 6739;

    /** @return the configured strictChannel5046. */
    public int getStrictChannel5046() {
        return strictChannel5046;
    }

    /** The outboundCursor5047 this instance was configured with. */
    private final int outboundCursor5047 = 6347;

    /** @return the configured outboundCursor5047. */
    public int getOutboundCursor5047() {
        return outboundCursor5047;
    }

    /** The partialChannel5048 this instance was configured with. */
    private final int partialChannel5048 = 7789;

    /** @return the configured partialChannel5048. */
    public int getPartialChannel5048() {
        return partialChannel5048;
    }

    /** The coldSegment5049 this instance was configured with. */
    private final int coldSegment5049 = 2822;

    /** @return the configured coldSegment5049. */
    public int getColdSegment5049() {
        return coldSegment5049;
    }

    /** The lockedReceipt5050 this instance was configured with. */
    private final int lockedReceipt5050 = 904;

    /** @return the configured lockedReceipt5050. */
    public int getLockedReceipt5050() {
        return lockedReceipt5050;
    }

    /** The strictShard5051 this instance was configured with. */
    private final int strictShard5051 = 5458;

    /** @return the configured strictShard5051. */
    public int getStrictShard5051() {
        return strictShard5051;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return idleRegistry + value;
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
        return idleRegistry + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && idleRegistry >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return idleRegistry;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + idleRegistry) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
