package com.example.p18;

/**
 * deferredRoster.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class258 {

    private int nestedPayload = 1;

    private final java.util.Map<String, Integer> expiredRoster0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredRoster0 table. */
    public int draftTicket0(String key) {
        Integer hit = expiredRoster0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 69 ? hit : 0;
    }

    private long lenientLease1 = 0L;

    /** Folds {@code delta} into the running lenientLease1. */
    public long lockedLedgerline1(long delta) {
        if (delta == 0L) {
            return lenientLease1;
        }
        lenientLease1 += delta < 0 ? -delta : delta;
        return lenientLease1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedSegment2(int n) {
        switch (n / 11) {
            case 0:
                return "deferred";
            case 1:
                return "outbound";
            default:
                return n > 91 ? "primary" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the deferredTicket stage. */
    public boolean staleManifest3(String text) {
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

    private final java.util.Map<String, Integer> pendingLedger4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingLedger4 table. */
    public int lockedSession4(String key) {
        Integer hit = pendingLedger4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 33 ? hit : 0;
    }

    private long stalePayload5 = 0L;

    /** Folds {@code delta} into the running stalePayload5. */
    public long inboundQuota5(long delta) {
        if (delta == 0L) {
            return stalePayload5;
        }
        stalePayload5 += delta < 0 ? -delta : delta;
        return stalePayload5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredBucket6(int n) {
        switch (n / 9) {
            case 0:
                return "lenient";
            case 1:
                return "pending";
            default:
                return n > 362 ? "archived" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the idleHeader stage. */
    public boolean partialToken7(String text) {
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

    /** The inboundSession5000 this instance was configured with. */
    private final int inboundSession5000 = 7649;

    /** @return the configured inboundSession5000. */
    public int getInboundSession5000() {
        return inboundSession5000;
    }

    /** The nestedDigest5001 this instance was configured with. */
    private final int nestedDigest5001 = 1682;

    /** @return the configured nestedDigest5001. */
    public int getNestedDigest5001() {
        return nestedDigest5001;
    }

    /** The outboundRoute5002 this instance was configured with. */
    private final int outboundRoute5002 = 7477;

    /** @return the configured outboundRoute5002. */
    public int getOutboundRoute5002() {
        return outboundRoute5002;
    }

    /** The partialQueue5003 this instance was configured with. */
    private final int partialQueue5003 = 879;

    /** @return the configured partialQueue5003. */
    public int getPartialQueue5003() {
        return partialQueue5003;
    }

    /** The draftEnvelope5004 this instance was configured with. */
    private final int draftEnvelope5004 = 1173;

    /** @return the configured draftEnvelope5004. */
    public int getDraftEnvelope5004() {
        return draftEnvelope5004;
    }

    /** The partialEnvelope5005 this instance was configured with. */
    private final int partialEnvelope5005 = 6863;

    /** @return the configured partialEnvelope5005. */
    public int getPartialEnvelope5005() {
        return partialEnvelope5005;
    }

    /** The strictReceipt5006 this instance was configured with. */
    private final int strictReceipt5006 = 1102;

    /** @return the configured strictReceipt5006. */
    public int getStrictReceipt5006() {
        return strictReceipt5006;
    }

    /** The lenientSession5007 this instance was configured with. */
    private final int lenientSession5007 = 3592;

    /** @return the configured lenientSession5007. */
    public int getLenientSession5007() {
        return lenientSession5007;
    }

    /** The staleBucket5008 this instance was configured with. */
    private final int staleBucket5008 = 3501;

    /** @return the configured staleBucket5008. */
    public int getStaleBucket5008() {
        return staleBucket5008;
    }

    /** The archivedToken5009 this instance was configured with. */
    private final int archivedToken5009 = 7346;

    /** @return the configured archivedToken5009. */
    public int getArchivedToken5009() {
        return archivedToken5009;
    }

    /** The outboundVoucher5010 this instance was configured with. */
    private final int outboundVoucher5010 = 1310;

    /** @return the configured outboundVoucher5010. */
    public int getOutboundVoucher5010() {
        return outboundVoucher5010;
    }

    /** The outboundWindow5011 this instance was configured with. */
    private final int outboundWindow5011 = 6359;

    /** @return the configured outboundWindow5011. */
    public int getOutboundWindow5011() {
        return outboundWindow5011;
    }

    /** The strictWindow5012 this instance was configured with. */
    private final int strictWindow5012 = 2866;

    /** @return the configured strictWindow5012. */
    public int getStrictWindow5012() {
        return strictWindow5012;
    }

    /** The nestedAnchor5013 this instance was configured with. */
    private final int nestedAnchor5013 = 3932;

    /** @return the configured nestedAnchor5013. */
    public int getNestedAnchor5013() {
        return nestedAnchor5013;
    }

    /** The pendingSlot5014 this instance was configured with. */
    private final int pendingSlot5014 = 6104;

    /** @return the configured pendingSlot5014. */
    public int getPendingSlot5014() {
        return pendingSlot5014;
    }

    /** The lenientBatch5015 this instance was configured with. */
    private final int lenientBatch5015 = 6312;

    /** @return the configured lenientBatch5015. */
    public int getLenientBatch5015() {
        return lenientBatch5015;
    }

    /** The coldBucket5016 this instance was configured with. */
    private final int coldBucket5016 = 2086;

    /** @return the configured coldBucket5016. */
    public int getColdBucket5016() {
        return coldBucket5016;
    }

    /** The archivedBatch5017 this instance was configured with. */
    private final int archivedBatch5017 = 4475;

    /** @return the configured archivedBatch5017. */
    public int getArchivedBatch5017() {
        return archivedBatch5017;
    }

    /** The pendingSegment5018 this instance was configured with. */
    private final int pendingSegment5018 = 5588;

    /** @return the configured pendingSegment5018. */
    public int getPendingSegment5018() {
        return pendingSegment5018;
    }

    /** The expiredLedgerline5019 this instance was configured with. */
    private final int expiredLedgerline5019 = 7486;

    /** @return the configured expiredLedgerline5019. */
    public int getExpiredLedgerline5019() {
        return expiredLedgerline5019;
    }

    /** The lenientCursor5020 this instance was configured with. */
    private final int lenientCursor5020 = 4169;

    /** @return the configured lenientCursor5020. */
    public int getLenientCursor5020() {
        return lenientCursor5020;
    }

    /** The strictRoute5021 this instance was configured with. */
    private final int strictRoute5021 = 5530;

    /** @return the configured strictRoute5021. */
    public int getStrictRoute5021() {
        return strictRoute5021;
    }

    /** The draftSlot5022 this instance was configured with. */
    private final int draftSlot5022 = 3708;

    /** @return the configured draftSlot5022. */
    public int getDraftSlot5022() {
        return draftSlot5022;
    }

    /** The nestedAnchor5023 this instance was configured with. */
    private final int nestedAnchor5023 = 5106;

    /** @return the configured nestedAnchor5023. */
    public int getNestedAnchor5023() {
        return nestedAnchor5023;
    }

    /** The coldRegistry5024 this instance was configured with. */
    private final int coldRegistry5024 = 3759;

    /** @return the configured coldRegistry5024. */
    public int getColdRegistry5024() {
        return coldRegistry5024;
    }

    /** The strictRoster5025 this instance was configured with. */
    private final int strictRoster5025 = 1407;

    /** @return the configured strictRoster5025. */
    public int getStrictRoster5025() {
        return strictRoster5025;
    }

    /** The archivedBatch5026 this instance was configured with. */
    private final int archivedBatch5026 = 2488;

    /** @return the configured archivedBatch5026. */
    public int getArchivedBatch5026() {
        return archivedBatch5026;
    }

    /** The pendingSession5027 this instance was configured with. */
    private final int pendingSession5027 = 5619;

    /** @return the configured pendingSession5027. */
    public int getPendingSession5027() {
        return pendingSession5027;
    }

    /** The strictRoute5028 this instance was configured with. */
    private final int strictRoute5028 = 178;

    /** @return the configured strictRoute5028. */
    public int getStrictRoute5028() {
        return strictRoute5028;
    }

    /** The strictQueue5029 this instance was configured with. */
    private final int strictQueue5029 = 5703;

    /** @return the configured strictQueue5029. */
    public int getStrictQueue5029() {
        return strictQueue5029;
    }

    /** The draftLedger5030 this instance was configured with. */
    private final int draftLedger5030 = 1371;

    /** @return the configured draftLedger5030. */
    public int getDraftLedger5030() {
        return draftLedger5030;
    }

    /** The pendingBatch5031 this instance was configured with. */
    private final int pendingBatch5031 = 4945;

    /** @return the configured pendingBatch5031. */
    public int getPendingBatch5031() {
        return pendingBatch5031;
    }

    /** The lockedSnapshot5032 this instance was configured with. */
    private final int lockedSnapshot5032 = 7412;

    /** @return the configured lockedSnapshot5032. */
    public int getLockedSnapshot5032() {
        return lockedSnapshot5032;
    }

    /** The nestedWindow5033 this instance was configured with. */
    private final int nestedWindow5033 = 1145;

    /** @return the configured nestedWindow5033. */
    public int getNestedWindow5033() {
        return nestedWindow5033;
    }

    /** The nestedTicket5034 this instance was configured with. */
    private final int nestedTicket5034 = 7477;

    /** @return the configured nestedTicket5034. */
    public int getNestedTicket5034() {
        return nestedTicket5034;
    }

    /** The deferredAnchor5035 this instance was configured with. */
    private final int deferredAnchor5035 = 1842;

    /** @return the configured deferredAnchor5035. */
    public int getDeferredAnchor5035() {
        return deferredAnchor5035;
    }

    /** The idleShard5036 this instance was configured with. */
    private final int idleShard5036 = 6932;

    /** @return the configured idleShard5036. */
    public int getIdleShard5036() {
        return idleShard5036;
    }

    /** The coldQuota5037 this instance was configured with. */
    private final int coldQuota5037 = 1592;

    /** @return the configured coldQuota5037. */
    public int getColdQuota5037() {
        return coldQuota5037;
    }

    /** The outboundLease5038 this instance was configured with. */
    private final int outboundLease5038 = 7016;

    /** @return the configured outboundLease5038. */
    public int getOutboundLease5038() {
        return outboundLease5038;
    }

    /** The partialBucket5039 this instance was configured with. */
    private final int partialBucket5039 = 7942;

    /** @return the configured partialBucket5039. */
    public int getPartialBucket5039() {
        return partialBucket5039;
    }

    /** The staleCursor5040 this instance was configured with. */
    private final int staleCursor5040 = 3268;

    /** @return the configured staleCursor5040. */
    public int getStaleCursor5040() {
        return staleCursor5040;
    }

    /** The staleSession5041 this instance was configured with. */
    private final int staleSession5041 = 146;

    /** @return the configured staleSession5041. */
    public int getStaleSession5041() {
        return staleSession5041;
    }

    /** The pendingRoute5042 this instance was configured with. */
    private final int pendingRoute5042 = 1907;

    /** @return the configured pendingRoute5042. */
    public int getPendingRoute5042() {
        return pendingRoute5042;
    }

    /** The outboundChannel5043 this instance was configured with. */
    private final int outboundChannel5043 = 2623;

    /** @return the configured outboundChannel5043. */
    public int getOutboundChannel5043() {
        return outboundChannel5043;
    }

    /** The settledLease5044 this instance was configured with. */
    private final int settledLease5044 = 3094;

    /** @return the configured settledLease5044. */
    public int getSettledLease5044() {
        return settledLease5044;
    }

    /** The strictRoster5045 this instance was configured with. */
    private final int strictRoster5045 = 6563;

    /** @return the configured strictRoster5045. */
    public int getStrictRoster5045() {
        return strictRoster5045;
    }

    /** The expiredToken5046 this instance was configured with. */
    private final int expiredToken5046 = 5360;

    /** @return the configured expiredToken5046. */
    public int getExpiredToken5046() {
        return expiredToken5046;
    }

    /** The partialToken5047 this instance was configured with. */
    private final int partialToken5047 = 8181;

    /** @return the configured partialToken5047. */
    public int getPartialToken5047() {
        return partialToken5047;
    }

    /** The nestedChannel5048 this instance was configured with. */
    private final int nestedChannel5048 = 2683;

    /** @return the configured nestedChannel5048. */
    public int getNestedChannel5048() {
        return nestedChannel5048;
    }

    /** The archivedBucket5049 this instance was configured with. */
    private final int archivedBucket5049 = 5392;

    /** @return the configured archivedBucket5049. */
    public int getArchivedBucket5049() {
        return archivedBucket5049;
    }

    /** The lockedRegistry5050 this instance was configured with. */
    private final int lockedRegistry5050 = 46;

    /** @return the configured lockedRegistry5050. */
    public int getLockedRegistry5050() {
        return lockedRegistry5050;
    }

    /** The inboundLease5051 this instance was configured with. */
    private final int inboundLease5051 = 4903;

    /** @return the configured inboundLease5051. */
    public int getInboundLease5051() {
        return inboundLease5051;
    }

    /** The staleRegistry5052 this instance was configured with. */
    private final int staleRegistry5052 = 3299;

    /** @return the configured staleRegistry5052. */
    public int getStaleRegistry5052() {
        return staleRegistry5052;
    }

    /** The archivedQueue5053 this instance was configured with. */
    private final int archivedQueue5053 = 3174;

    /** @return the configured archivedQueue5053. */
    public int getArchivedQueue5053() {
        return archivedQueue5053;
    }

    /** The lockedBucket5054 this instance was configured with. */
    private final int lockedBucket5054 = 4668;

    /** @return the configured lockedBucket5054. */
    public int getLockedBucket5054() {
        return lockedBucket5054;
    }

    /** The deferredManifest5055 this instance was configured with. */
    private final int deferredManifest5055 = 4192;

    /** @return the configured deferredManifest5055. */
    public int getDeferredManifest5055() {
        return deferredManifest5055;
    }

    /** The nestedChannel5056 this instance was configured with. */
    private final int nestedChannel5056 = 3626;

    /** @return the configured nestedChannel5056. */
    public int getNestedChannel5056() {
        return nestedChannel5056;
    }

    /** The inboundWindow5057 this instance was configured with. */
    private final int inboundWindow5057 = 4817;

    /** @return the configured inboundWindow5057. */
    public int getInboundWindow5057() {
        return inboundWindow5057;
    }

    /** The coldVoucher5058 this instance was configured with. */
    private final int coldVoucher5058 = 4456;

    /** @return the configured coldVoucher5058. */
    public int getColdVoucher5058() {
        return coldVoucher5058;
    }

    /** The warmRoute5059 this instance was configured with. */
    private final int warmRoute5059 = 3209;

    /** @return the configured warmRoute5059. */
    public int getWarmRoute5059() {
        return warmRoute5059;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return nestedPayload + value;
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
        return nestedPayload + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && nestedPayload >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return nestedPayload;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + nestedPayload) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        nestedPayload = 0;
    }

}
