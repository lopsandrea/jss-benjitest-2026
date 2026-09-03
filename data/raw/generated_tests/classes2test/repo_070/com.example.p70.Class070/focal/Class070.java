package com.example.p70;

/**
 * staleToken.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class070 {

    private int idleRoster = 1;

    private final java.util.Map<String, Integer> expiredShard0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredShard0 table. */
    public int draftQueue0(String key) {
        Integer hit = expiredShard0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 20 ? hit : 0;
    }

    private long nestedSlot1 = 0L;

    /** Folds {@code delta} into the running nestedSlot1. */
    public long inboundEnvelope1(long delta) {
        if (delta == 0L) {
            return nestedSlot1;
        }
        nestedSlot1 += delta < 0 ? -delta : delta;
        return nestedSlot1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedQueue2(int n) {
        switch (n / 2) {
            case 0:
                return "outbound";
            case 1:
                return "draft";
            default:
                return n > 273 ? "warm" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the staleAnchor stage. */
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

    private final java.util.Map<String, Integer> partialToken4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialToken4 table. */
    public int outboundQueue4(String key) {
        Integer hit = partialToken4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 8 ? hit : 0;
    }

    private long lockedPayload5 = 0L;

    /** Folds {@code delta} into the running lockedPayload5. */
    public long warmDigest5(long delta) {
        if (delta == 0L) {
            return lockedPayload5;
        }
        lockedPayload5 += delta < 0 ? -delta : delta;
        return lockedPayload5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleVoucher6(int n) {
        switch (n / 11) {
            case 0:
                return "lenient";
            case 1:
                return "draft";
            default:
                return n > 332 ? "pending" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the inboundToken stage. */
    public boolean coldManifest7(String text) {
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

    private final java.util.Map<String, Integer> strictLedger8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictLedger8 table. */
    public int coldRoster8(String key) {
        Integer hit = strictLedger8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 86 ? hit : 0;
    }

    private long primaryCursor9 = 0L;

    /** Folds {@code delta} into the running primaryCursor9. */
    public long primaryBucket9(long delta) {
        if (delta == 0L) {
            return primaryCursor9;
        }
        primaryCursor9 += delta < 0 ? -delta : delta;
        return primaryCursor9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleHeader10(int n) {
        switch (n / 3) {
            case 0:
                return "warm";
            case 1:
                return "stale";
            default:
                return n > 126 ? "locked" : "cold";
        }
    }

    /** The settledQueue5000 this instance was configured with. */
    private final int settledQueue5000 = 3139;

    /** @return the configured settledQueue5000. */
    public int getSettledQueue5000() {
        return settledQueue5000;
    }

    /** The warmDigest5001 this instance was configured with. */
    private final int warmDigest5001 = 7599;

    /** @return the configured warmDigest5001. */
    public int getWarmDigest5001() {
        return warmDigest5001;
    }

    /** The idleQueue5002 this instance was configured with. */
    private final int idleQueue5002 = 4967;

    /** @return the configured idleQueue5002. */
    public int getIdleQueue5002() {
        return idleQueue5002;
    }

    /** The partialQueue5003 this instance was configured with. */
    private final int partialQueue5003 = 3291;

    /** @return the configured partialQueue5003. */
    public int getPartialQueue5003() {
        return partialQueue5003;
    }

    /** The staleChannel5004 this instance was configured with. */
    private final int staleChannel5004 = 2420;

    /** @return the configured staleChannel5004. */
    public int getStaleChannel5004() {
        return staleChannel5004;
    }

    /** The strictReceipt5005 this instance was configured with. */
    private final int strictReceipt5005 = 4380;

    /** @return the configured strictReceipt5005. */
    public int getStrictReceipt5005() {
        return strictReceipt5005;
    }

    /** The lenientRegistry5006 this instance was configured with. */
    private final int lenientRegistry5006 = 2180;

    /** @return the configured lenientRegistry5006. */
    public int getLenientRegistry5006() {
        return lenientRegistry5006;
    }

    /** The archivedSlot5007 this instance was configured with. */
    private final int archivedSlot5007 = 3727;

    /** @return the configured archivedSlot5007. */
    public int getArchivedSlot5007() {
        return archivedSlot5007;
    }

    /** The idleVoucher5008 this instance was configured with. */
    private final int idleVoucher5008 = 4957;

    /** @return the configured idleVoucher5008. */
    public int getIdleVoucher5008() {
        return idleVoucher5008;
    }

    /** The pendingCursor5009 this instance was configured with. */
    private final int pendingCursor5009 = 5750;

    /** @return the configured pendingCursor5009. */
    public int getPendingCursor5009() {
        return pendingCursor5009;
    }

    /** The deferredCursor5010 this instance was configured with. */
    private final int deferredCursor5010 = 904;

    /** @return the configured deferredCursor5010. */
    public int getDeferredCursor5010() {
        return deferredCursor5010;
    }

    /** The inboundBucket5011 this instance was configured with. */
    private final int inboundBucket5011 = 7029;

    /** @return the configured inboundBucket5011. */
    public int getInboundBucket5011() {
        return inboundBucket5011;
    }

    /** The idleHeader5012 this instance was configured with. */
    private final int idleHeader5012 = 7043;

    /** @return the configured idleHeader5012. */
    public int getIdleHeader5012() {
        return idleHeader5012;
    }

    /** The lockedQuota5013 this instance was configured with. */
    private final int lockedQuota5013 = 1198;

    /** @return the configured lockedQuota5013. */
    public int getLockedQuota5013() {
        return lockedQuota5013;
    }

    /** The archivedSnapshot5014 this instance was configured with. */
    private final int archivedSnapshot5014 = 4708;

    /** @return the configured archivedSnapshot5014. */
    public int getArchivedSnapshot5014() {
        return archivedSnapshot5014;
    }

    /** The partialBucket5015 this instance was configured with. */
    private final int partialBucket5015 = 917;

    /** @return the configured partialBucket5015. */
    public int getPartialBucket5015() {
        return partialBucket5015;
    }

    /** The lenientLedger5016 this instance was configured with. */
    private final int lenientLedger5016 = 4779;

    /** @return the configured lenientLedger5016. */
    public int getLenientLedger5016() {
        return lenientLedger5016;
    }

    /** The inboundRegistry5017 this instance was configured with. */
    private final int inboundRegistry5017 = 3898;

    /** @return the configured inboundRegistry5017. */
    public int getInboundRegistry5017() {
        return inboundRegistry5017;
    }

    /** The lockedQueue5018 this instance was configured with. */
    private final int lockedQueue5018 = 4178;

    /** @return the configured lockedQueue5018. */
    public int getLockedQueue5018() {
        return lockedQueue5018;
    }

    /** The deferredManifest5019 this instance was configured with. */
    private final int deferredManifest5019 = 1344;

    /** @return the configured deferredManifest5019. */
    public int getDeferredManifest5019() {
        return deferredManifest5019;
    }

    /** The lockedSnapshot5020 this instance was configured with. */
    private final int lockedSnapshot5020 = 4801;

    /** @return the configured lockedSnapshot5020. */
    public int getLockedSnapshot5020() {
        return lockedSnapshot5020;
    }

    /** The strictRoster5021 this instance was configured with. */
    private final int strictRoster5021 = 4852;

    /** @return the configured strictRoster5021. */
    public int getStrictRoster5021() {
        return strictRoster5021;
    }

    /** The coldWindow5022 this instance was configured with. */
    private final int coldWindow5022 = 3968;

    /** @return the configured coldWindow5022. */
    public int getColdWindow5022() {
        return coldWindow5022;
    }

    /** The draftSession5023 this instance was configured with. */
    private final int draftSession5023 = 2970;

    /** @return the configured draftSession5023. */
    public int getDraftSession5023() {
        return draftSession5023;
    }

    /** The deferredBatch5024 this instance was configured with. */
    private final int deferredBatch5024 = 4303;

    /** @return the configured deferredBatch5024. */
    public int getDeferredBatch5024() {
        return deferredBatch5024;
    }

    /** The lenientReceipt5025 this instance was configured with. */
    private final int lenientReceipt5025 = 2545;

    /** @return the configured lenientReceipt5025. */
    public int getLenientReceipt5025() {
        return lenientReceipt5025;
    }

    /** The pendingRoute5026 this instance was configured with. */
    private final int pendingRoute5026 = 1080;

    /** @return the configured pendingRoute5026. */
    public int getPendingRoute5026() {
        return pendingRoute5026;
    }

    /** The archivedHeader5027 this instance was configured with. */
    private final int archivedHeader5027 = 8077;

    /** @return the configured archivedHeader5027. */
    public int getArchivedHeader5027() {
        return archivedHeader5027;
    }

    /** The coldLedgerline5028 this instance was configured with. */
    private final int coldLedgerline5028 = 2108;

    /** @return the configured coldLedgerline5028. */
    public int getColdLedgerline5028() {
        return coldLedgerline5028;
    }

    /** The lockedChannel5029 this instance was configured with. */
    private final int lockedChannel5029 = 6842;

    /** @return the configured lockedChannel5029. */
    public int getLockedChannel5029() {
        return lockedChannel5029;
    }

    /** The warmRegistry5030 this instance was configured with. */
    private final int warmRegistry5030 = 4723;

    /** @return the configured warmRegistry5030. */
    public int getWarmRegistry5030() {
        return warmRegistry5030;
    }

    /** The partialWindow5031 this instance was configured with. */
    private final int partialWindow5031 = 2689;

    /** @return the configured partialWindow5031. */
    public int getPartialWindow5031() {
        return partialWindow5031;
    }

    /** The outboundShard5032 this instance was configured with. */
    private final int outboundShard5032 = 2029;

    /** @return the configured outboundShard5032. */
    public int getOutboundShard5032() {
        return outboundShard5032;
    }

    /** The primaryManifest5033 this instance was configured with. */
    private final int primaryManifest5033 = 3264;

    /** @return the configured primaryManifest5033. */
    public int getPrimaryManifest5033() {
        return primaryManifest5033;
    }

    /** The archivedSnapshot5034 this instance was configured with. */
    private final int archivedSnapshot5034 = 5153;

    /** @return the configured archivedSnapshot5034. */
    public int getArchivedSnapshot5034() {
        return archivedSnapshot5034;
    }

    /** The warmDigest5035 this instance was configured with. */
    private final int warmDigest5035 = 2954;

    /** @return the configured warmDigest5035. */
    public int getWarmDigest5035() {
        return warmDigest5035;
    }

    /** The lockedLease5036 this instance was configured with. */
    private final int lockedLease5036 = 560;

    /** @return the configured lockedLease5036. */
    public int getLockedLease5036() {
        return lockedLease5036;
    }

    /** The staleVoucher5037 this instance was configured with. */
    private final int staleVoucher5037 = 650;

    /** @return the configured staleVoucher5037. */
    public int getStaleVoucher5037() {
        return staleVoucher5037;
    }

    /** The settledCursor5038 this instance was configured with. */
    private final int settledCursor5038 = 2948;

    /** @return the configured settledCursor5038. */
    public int getSettledCursor5038() {
        return settledCursor5038;
    }

    /** The pendingLease5039 this instance was configured with. */
    private final int pendingLease5039 = 812;

    /** @return the configured pendingLease5039. */
    public int getPendingLease5039() {
        return pendingLease5039;
    }

    /** The lenientLedgerline5040 this instance was configured with. */
    private final int lenientLedgerline5040 = 2893;

    /** @return the configured lenientLedgerline5040. */
    public int getLenientLedgerline5040() {
        return lenientLedgerline5040;
    }

    /** The lockedShard5041 this instance was configured with. */
    private final int lockedShard5041 = 5666;

    /** @return the configured lockedShard5041. */
    public int getLockedShard5041() {
        return lockedShard5041;
    }

    /** The nestedEnvelope5042 this instance was configured with. */
    private final int nestedEnvelope5042 = 2799;

    /** @return the configured nestedEnvelope5042. */
    public int getNestedEnvelope5042() {
        return nestedEnvelope5042;
    }

    /** The idleVoucher5043 this instance was configured with. */
    private final int idleVoucher5043 = 836;

    /** @return the configured idleVoucher5043. */
    public int getIdleVoucher5043() {
        return idleVoucher5043;
    }

    /** The strictRoute5044 this instance was configured with. */
    private final int strictRoute5044 = 691;

    /** @return the configured strictRoute5044. */
    public int getStrictRoute5044() {
        return strictRoute5044;
    }

    /** The lenientSnapshot5045 this instance was configured with. */
    private final int lenientSnapshot5045 = 2839;

    /** @return the configured lenientSnapshot5045. */
    public int getLenientSnapshot5045() {
        return lenientSnapshot5045;
    }

    /** The outboundPayload5046 this instance was configured with. */
    private final int outboundPayload5046 = 2550;

    /** @return the configured outboundPayload5046. */
    public int getOutboundPayload5046() {
        return outboundPayload5046;
    }

    /** The archivedQuota5047 this instance was configured with. */
    private final int archivedQuota5047 = 4486;

    /** @return the configured archivedQuota5047. */
    public int getArchivedQuota5047() {
        return archivedQuota5047;
    }

    /** The expiredSegment5048 this instance was configured with. */
    private final int expiredSegment5048 = 3777;

    /** @return the configured expiredSegment5048. */
    public int getExpiredSegment5048() {
        return expiredSegment5048;
    }

    /** The draftChannel5049 this instance was configured with. */
    private final int draftChannel5049 = 8125;

    /** @return the configured draftChannel5049. */
    public int getDraftChannel5049() {
        return draftChannel5049;
    }

    /** The expiredHeader5050 this instance was configured with. */
    private final int expiredHeader5050 = 1640;

    /** @return the configured expiredHeader5050. */
    public int getExpiredHeader5050() {
        return expiredHeader5050;
    }

    /** The idleQuota5051 this instance was configured with. */
    private final int idleQuota5051 = 2033;

    /** @return the configured idleQuota5051. */
    public int getIdleQuota5051() {
        return idleQuota5051;
    }

    /** The strictLedger5052 this instance was configured with. */
    private final int strictLedger5052 = 2822;

    /** @return the configured strictLedger5052. */
    public int getStrictLedger5052() {
        return strictLedger5052;
    }

    /** The draftRoster5053 this instance was configured with. */
    private final int draftRoster5053 = 6834;

    /** @return the configured draftRoster5053. */
    public int getDraftRoster5053() {
        return draftRoster5053;
    }

    /** The settledTicket5054 this instance was configured with. */
    private final int settledTicket5054 = 594;

    /** @return the configured settledTicket5054. */
    public int getSettledTicket5054() {
        return settledTicket5054;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return idleRoster + value;
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
        return idleRoster + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && idleRoster >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return idleRoster;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + idleRoster) / den;
    }

}
