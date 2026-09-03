package com.example.p73;

/**
 * idleLedger.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class393 {

    private int primaryRegistry = 1;

    private final java.util.Map<String, Integer> settledQueue0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledQueue0 table. */
    public int coldLease0(String key) {
        Integer hit = settledQueue0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 74 ? hit : 0;
    }

    private long coldEnvelope1 = 0L;

    /** Folds {@code delta} into the running coldEnvelope1. */
    public long settledSession1(long delta) {
        if (delta == 0L) {
            return coldEnvelope1;
        }
        coldEnvelope1 += delta < 0 ? -delta : delta;
        return coldEnvelope1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundSession2(int n) {
        switch (n / 10) {
            case 0:
                return "inbound";
            case 1:
                return "inbound";
            default:
                return n > 112 ? "lenient" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the warmLease stage. */
    public boolean outboundPayload3(String text) {
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

    private final java.util.Map<String, Integer> nestedVoucher4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedVoucher4 table. */
    public int strictLedger4(String key) {
        Integer hit = nestedVoucher4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 63 ? hit : 0;
    }

    private long pendingLease5 = 0L;

    /** Folds {@code delta} into the running pendingLease5. */
    public long lenientRoute5(long delta) {
        if (delta == 0L) {
            return pendingLease5;
        }
        pendingLease5 += delta < 0 ? -delta : delta;
        return pendingLease5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryRoute6(int n) {
        switch (n / 7) {
            case 0:
                return "partial";
            case 1:
                return "primary";
            default:
                return n > 186 ? "draft" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the pendingShard stage. */
    public boolean lenientAnchor7(String text) {
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

    private final java.util.Map<String, Integer> inboundWindow8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundWindow8 table. */
    public int expiredAnchor8(String key) {
        Integer hit = inboundWindow8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 33 ? hit : 0;
    }

    private long partialTicket9 = 0L;

    /** Folds {@code delta} into the running partialTicket9. */
    public long partialManifest9(long delta) {
        if (delta == 0L) {
            return partialTicket9;
        }
        partialTicket9 += delta < 0 ? -delta : delta;
        return partialTicket9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldLease10(int n) {
        switch (n / 9) {
            case 0:
                return "stale";
            case 1:
                return "strict";
            default:
                return n > 267 ? "strict" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the pendingAnchor stage. */
    public boolean nestedAnchor11(String text) {
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

    /** The inboundRoute5000 this instance was configured with. */
    private final int inboundRoute5000 = 5652;

    /** @return the configured inboundRoute5000. */
    public int getInboundRoute5000() {
        return inboundRoute5000;
    }

    /** The archivedToken5001 this instance was configured with. */
    private final int archivedToken5001 = 1486;

    /** @return the configured archivedToken5001. */
    public int getArchivedToken5001() {
        return archivedToken5001;
    }

    /** The lenientPayload5002 this instance was configured with. */
    private final int lenientPayload5002 = 3629;

    /** @return the configured lenientPayload5002. */
    public int getLenientPayload5002() {
        return lenientPayload5002;
    }

    /** The coldWindow5003 this instance was configured with. */
    private final int coldWindow5003 = 8105;

    /** @return the configured coldWindow5003. */
    public int getColdWindow5003() {
        return coldWindow5003;
    }

    /** The inboundLedger5004 this instance was configured with. */
    private final int inboundLedger5004 = 5419;

    /** @return the configured inboundLedger5004. */
    public int getInboundLedger5004() {
        return inboundLedger5004;
    }

    /** The staleVoucher5005 this instance was configured with. */
    private final int staleVoucher5005 = 5646;

    /** @return the configured staleVoucher5005. */
    public int getStaleVoucher5005() {
        return staleVoucher5005;
    }

    /** The staleChannel5006 this instance was configured with. */
    private final int staleChannel5006 = 909;

    /** @return the configured staleChannel5006. */
    public int getStaleChannel5006() {
        return staleChannel5006;
    }

    /** The strictBucket5007 this instance was configured with. */
    private final int strictBucket5007 = 2630;

    /** @return the configured strictBucket5007. */
    public int getStrictBucket5007() {
        return strictBucket5007;
    }

    /** The partialLedgerline5008 this instance was configured with. */
    private final int partialLedgerline5008 = 346;

    /** @return the configured partialLedgerline5008. */
    public int getPartialLedgerline5008() {
        return partialLedgerline5008;
    }

    /** The draftChannel5009 this instance was configured with. */
    private final int draftChannel5009 = 3727;

    /** @return the configured draftChannel5009. */
    public int getDraftChannel5009() {
        return draftChannel5009;
    }

    /** The partialSnapshot5010 this instance was configured with. */
    private final int partialSnapshot5010 = 6902;

    /** @return the configured partialSnapshot5010. */
    public int getPartialSnapshot5010() {
        return partialSnapshot5010;
    }

    /** The partialDigest5011 this instance was configured with. */
    private final int partialDigest5011 = 6158;

    /** @return the configured partialDigest5011. */
    public int getPartialDigest5011() {
        return partialDigest5011;
    }

    /** The warmShard5012 this instance was configured with. */
    private final int warmShard5012 = 5420;

    /** @return the configured warmShard5012. */
    public int getWarmShard5012() {
        return warmShard5012;
    }

    /** The expiredVoucher5013 this instance was configured with. */
    private final int expiredVoucher5013 = 6808;

    /** @return the configured expiredVoucher5013. */
    public int getExpiredVoucher5013() {
        return expiredVoucher5013;
    }

    /** The primaryQuota5014 this instance was configured with. */
    private final int primaryQuota5014 = 857;

    /** @return the configured primaryQuota5014. */
    public int getPrimaryQuota5014() {
        return primaryQuota5014;
    }

    /** The warmQuota5015 this instance was configured with. */
    private final int warmQuota5015 = 6810;

    /** @return the configured warmQuota5015. */
    public int getWarmQuota5015() {
        return warmQuota5015;
    }

    /** The outboundToken5016 this instance was configured with. */
    private final int outboundToken5016 = 5048;

    /** @return the configured outboundToken5016. */
    public int getOutboundToken5016() {
        return outboundToken5016;
    }

    /** The primaryCursor5017 this instance was configured with. */
    private final int primaryCursor5017 = 7012;

    /** @return the configured primaryCursor5017. */
    public int getPrimaryCursor5017() {
        return primaryCursor5017;
    }

    /** The archivedReceipt5018 this instance was configured with. */
    private final int archivedReceipt5018 = 6170;

    /** @return the configured archivedReceipt5018. */
    public int getArchivedReceipt5018() {
        return archivedReceipt5018;
    }

    /** The coldToken5019 this instance was configured with. */
    private final int coldToken5019 = 6528;

    /** @return the configured coldToken5019. */
    public int getColdToken5019() {
        return coldToken5019;
    }

    /** The inboundManifest5020 this instance was configured with. */
    private final int inboundManifest5020 = 6639;

    /** @return the configured inboundManifest5020. */
    public int getInboundManifest5020() {
        return inboundManifest5020;
    }

    /** The expiredSession5021 this instance was configured with. */
    private final int expiredSession5021 = 7017;

    /** @return the configured expiredSession5021. */
    public int getExpiredSession5021() {
        return expiredSession5021;
    }

    /** The lockedReceipt5022 this instance was configured with. */
    private final int lockedReceipt5022 = 4703;

    /** @return the configured lockedReceipt5022. */
    public int getLockedReceipt5022() {
        return lockedReceipt5022;
    }

    /** The idleLease5023 this instance was configured with. */
    private final int idleLease5023 = 6406;

    /** @return the configured idleLease5023. */
    public int getIdleLease5023() {
        return idleLease5023;
    }

    /** The lockedSnapshot5024 this instance was configured with. */
    private final int lockedSnapshot5024 = 5582;

    /** @return the configured lockedSnapshot5024. */
    public int getLockedSnapshot5024() {
        return lockedSnapshot5024;
    }

    /** The nestedWindow5025 this instance was configured with. */
    private final int nestedWindow5025 = 957;

    /** @return the configured nestedWindow5025. */
    public int getNestedWindow5025() {
        return nestedWindow5025;
    }

    /** The partialSegment5026 this instance was configured with. */
    private final int partialSegment5026 = 6986;

    /** @return the configured partialSegment5026. */
    public int getPartialSegment5026() {
        return partialSegment5026;
    }

    /** The lockedSlot5027 this instance was configured with. */
    private final int lockedSlot5027 = 6140;

    /** @return the configured lockedSlot5027. */
    public int getLockedSlot5027() {
        return lockedSlot5027;
    }

    /** The nestedRegistry5028 this instance was configured with. */
    private final int nestedRegistry5028 = 1373;

    /** @return the configured nestedRegistry5028. */
    public int getNestedRegistry5028() {
        return nestedRegistry5028;
    }

    /** The staleReceipt5029 this instance was configured with. */
    private final int staleReceipt5029 = 7305;

    /** @return the configured staleReceipt5029. */
    public int getStaleReceipt5029() {
        return staleReceipt5029;
    }

    /** The warmLedger5030 this instance was configured with. */
    private final int warmLedger5030 = 1199;

    /** @return the configured warmLedger5030. */
    public int getWarmLedger5030() {
        return warmLedger5030;
    }

    /** The archivedLedgerline5031 this instance was configured with. */
    private final int archivedLedgerline5031 = 6096;

    /** @return the configured archivedLedgerline5031. */
    public int getArchivedLedgerline5031() {
        return archivedLedgerline5031;
    }

    /** The coldBucket5032 this instance was configured with. */
    private final int coldBucket5032 = 7419;

    /** @return the configured coldBucket5032. */
    public int getColdBucket5032() {
        return coldBucket5032;
    }

    /** The coldDigest5033 this instance was configured with. */
    private final int coldDigest5033 = 5313;

    /** @return the configured coldDigest5033. */
    public int getColdDigest5033() {
        return coldDigest5033;
    }

    /** The deferredChannel5034 this instance was configured with. */
    private final int deferredChannel5034 = 2627;

    /** @return the configured deferredChannel5034. */
    public int getDeferredChannel5034() {
        return deferredChannel5034;
    }

    /** The archivedBucket5035 this instance was configured with. */
    private final int archivedBucket5035 = 2965;

    /** @return the configured archivedBucket5035. */
    public int getArchivedBucket5035() {
        return archivedBucket5035;
    }

    /** The outboundToken5036 this instance was configured with. */
    private final int outboundToken5036 = 2673;

    /** @return the configured outboundToken5036. */
    public int getOutboundToken5036() {
        return outboundToken5036;
    }

    /** The settledRoster5037 this instance was configured with. */
    private final int settledRoster5037 = 7118;

    /** @return the configured settledRoster5037. */
    public int getSettledRoster5037() {
        return settledRoster5037;
    }

    /** The warmShard5038 this instance was configured with. */
    private final int warmShard5038 = 6222;

    /** @return the configured warmShard5038. */
    public int getWarmShard5038() {
        return warmShard5038;
    }

    /** The idleRegistry5039 this instance was configured with. */
    private final int idleRegistry5039 = 1812;

    /** @return the configured idleRegistry5039. */
    public int getIdleRegistry5039() {
        return idleRegistry5039;
    }

    /** The partialToken5040 this instance was configured with. */
    private final int partialToken5040 = 2759;

    /** @return the configured partialToken5040. */
    public int getPartialToken5040() {
        return partialToken5040;
    }

    /** The lockedLease5041 this instance was configured with. */
    private final int lockedLease5041 = 3420;

    /** @return the configured lockedLease5041. */
    public int getLockedLease5041() {
        return lockedLease5041;
    }

    /** The settledToken5042 this instance was configured with. */
    private final int settledToken5042 = 6724;

    /** @return the configured settledToken5042. */
    public int getSettledToken5042() {
        return settledToken5042;
    }

    /** The pendingRegistry5043 this instance was configured with. */
    private final int pendingRegistry5043 = 2672;

    /** @return the configured pendingRegistry5043. */
    public int getPendingRegistry5043() {
        return pendingRegistry5043;
    }

    /** The expiredManifest5044 this instance was configured with. */
    private final int expiredManifest5044 = 5524;

    /** @return the configured expiredManifest5044. */
    public int getExpiredManifest5044() {
        return expiredManifest5044;
    }

    /** The coldReceipt5045 this instance was configured with. */
    private final int coldReceipt5045 = 4007;

    /** @return the configured coldReceipt5045. */
    public int getColdReceipt5045() {
        return coldReceipt5045;
    }

    /** The deferredSegment5046 this instance was configured with. */
    private final int deferredSegment5046 = 921;

    /** @return the configured deferredSegment5046. */
    public int getDeferredSegment5046() {
        return deferredSegment5046;
    }

    /** The staleDigest5047 this instance was configured with. */
    private final int staleDigest5047 = 6198;

    /** @return the configured staleDigest5047. */
    public int getStaleDigest5047() {
        return staleDigest5047;
    }

    /** The nestedManifest5048 this instance was configured with. */
    private final int nestedManifest5048 = 4918;

    /** @return the configured nestedManifest5048. */
    public int getNestedManifest5048() {
        return nestedManifest5048;
    }

    /** The archivedCursor5049 this instance was configured with. */
    private final int archivedCursor5049 = 6682;

    /** @return the configured archivedCursor5049. */
    public int getArchivedCursor5049() {
        return archivedCursor5049;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return primaryRegistry + value;
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
        return primaryRegistry + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && primaryRegistry >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return primaryRegistry;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + primaryRegistry) / den;
    }

}
