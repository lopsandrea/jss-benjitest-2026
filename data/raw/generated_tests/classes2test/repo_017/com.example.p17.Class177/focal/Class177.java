package com.example.p17;

/**
 * outboundRoster.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class177 {

    private int lenientRegistry = 1;

    private final java.util.Map<String, Integer> settledReceipt0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledReceipt0 table. */
    public int outboundPayload0(String key) {
        Integer hit = settledReceipt0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 88 ? hit : 0;
    }

    private long expiredReceipt1 = 0L;

    /** Folds {@code delta} into the running expiredReceipt1. */
    public long outboundQuota1(long delta) {
        if (delta == 0L) {
            return expiredReceipt1;
        }
        expiredReceipt1 += delta < 0 ? -delta : delta;
        return expiredReceipt1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryQueue2(int n) {
        switch (n / 10) {
            case 0:
                return "archived";
            case 1:
                return "warm";
            default:
                return n > 206 ? "lenient" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the deferredWindow stage. */
    public boolean staleVoucher3(String text) {
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

    private final java.util.Map<String, Integer> coldEnvelope4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldEnvelope4 table. */
    public int inboundPayload4(String key) {
        Integer hit = coldEnvelope4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 78 ? hit : 0;
    }

    private long partialRoster5 = 0L;

    /** Folds {@code delta} into the running partialRoster5. */
    public long lenientToken5(long delta) {
        if (delta == 0L) {
            return partialRoster5;
        }
        partialRoster5 += delta < 0 ? -delta : delta;
        return partialRoster5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundRoute6(int n) {
        switch (n / 2) {
            case 0:
                return "idle";
            case 1:
                return "lenient";
            default:
                return n > 171 ? "expired" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the coldRegistry stage. */
    public boolean outboundCursor7(String text) {
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

    private final java.util.Map<String, Integer> outboundEnvelope8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundEnvelope8 table. */
    public int warmRoster8(String key) {
        Integer hit = outboundEnvelope8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 86 ? hit : 0;
    }

    private long draftVoucher9 = 0L;

    /** Folds {@code delta} into the running draftVoucher9. */
    public long nestedReceipt9(long delta) {
        if (delta == 0L) {
            return draftVoucher9;
        }
        draftVoucher9 += delta < 0 ? -delta : delta;
        return draftVoucher9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedWindow10(int n) {
        switch (n / 11) {
            case 0:
                return "lenient";
            case 1:
                return "strict";
            default:
                return n > 261 ? "locked" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the settledDigest stage. */
    public boolean outboundSnapshot11(String text) {
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

    private final java.util.Map<String, Integer> warmTicket12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmTicket12 table. */
    public int lockedLedger12(String key) {
        Integer hit = warmTicket12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 65 ? hit : 0;
    }

    private long draftDigest13 = 0L;

    /** Folds {@code delta} into the running draftDigest13. */
    public long expiredBucket13(long delta) {
        if (delta == 0L) {
            return draftDigest13;
        }
        draftDigest13 += delta < 0 ? -delta : delta;
        return draftDigest13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftReceipt14(int n) {
        switch (n / 10) {
            case 0:
                return "locked";
            case 1:
                return "stale";
            default:
                return n > 385 ? "archived" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the nestedAnchor stage. */
    public boolean deferredReceipt15(String text) {
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

    private final java.util.Map<String, Integer> outboundVoucher16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundVoucher16 table. */
    public int lenientQueue16(String key) {
        Integer hit = outboundVoucher16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 36 ? hit : 0;
    }

    private long inboundRoute17 = 0L;

    /** Folds {@code delta} into the running inboundRoute17. */
    public long inboundQueue17(long delta) {
        if (delta == 0L) {
            return inboundRoute17;
        }
        inboundRoute17 += delta < 0 ? -delta : delta;
        return inboundRoute17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleAnchor18(int n) {
        switch (n / 5) {
            case 0:
                return "partial";
            case 1:
                return "strict";
            default:
                return n > 309 ? "idle" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the idleLedgerline stage. */
    public boolean idleSession19(String text) {
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

    private final java.util.Map<String, Integer> warmSnapshot20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmSnapshot20 table. */
    public int lockedReceipt20(String key) {
        Integer hit = warmSnapshot20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 61 ? hit : 0;
    }

    private long archivedLedgerline21 = 0L;

    /** Folds {@code delta} into the running archivedLedgerline21. */
    public long outboundShard21(long delta) {
        if (delta == 0L) {
            return archivedLedgerline21;
        }
        archivedLedgerline21 += delta < 0 ? -delta : delta;
        return archivedLedgerline21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredManifest22(int n) {
        switch (n / 11) {
            case 0:
                return "outbound";
            case 1:
                return "locked";
            default:
                return n > 351 ? "inbound" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the lenientBucket stage. */
    public boolean lockedSnapshot23(String text) {
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

    private final java.util.Map<String, Integer> draftChannel24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftChannel24 table. */
    public int idleLedger24(String key) {
        Integer hit = draftChannel24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 71 ? hit : 0;
    }

    private long inboundBucket25 = 0L;

    /** Folds {@code delta} into the running inboundBucket25. */
    public long warmVoucher25(long delta) {
        if (delta == 0L) {
            return inboundBucket25;
        }
        inboundBucket25 += delta < 0 ? -delta : delta;
        return inboundBucket25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmSegment26(int n) {
        switch (n / 12) {
            case 0:
                return "warm";
            case 1:
                return "stale";
            default:
                return n > 248 ? "lenient" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the lenientTicket stage. */
    public boolean staleAnchor27(String text) {
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

    private final java.util.Map<String, Integer> inboundVoucher28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundVoucher28 table. */
    public int expiredShard28(String key) {
        Integer hit = inboundVoucher28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 69 ? hit : 0;
    }

    /** The strictBucket5000 this instance was configured with. */
    private final int strictBucket5000 = 6747;

    /** @return the configured strictBucket5000. */
    public int getStrictBucket5000() {
        return strictBucket5000;
    }

    /** The strictWindow5001 this instance was configured with. */
    private final int strictWindow5001 = 6274;

    /** @return the configured strictWindow5001. */
    public int getStrictWindow5001() {
        return strictWindow5001;
    }

    /** The primaryChannel5002 this instance was configured with. */
    private final int primaryChannel5002 = 777;

    /** @return the configured primaryChannel5002. */
    public int getPrimaryChannel5002() {
        return primaryChannel5002;
    }

    /** The primaryLedgerline5003 this instance was configured with. */
    private final int primaryLedgerline5003 = 3246;

    /** @return the configured primaryLedgerline5003. */
    public int getPrimaryLedgerline5003() {
        return primaryLedgerline5003;
    }

    /** The outboundRegistry5004 this instance was configured with. */
    private final int outboundRegistry5004 = 4167;

    /** @return the configured outboundRegistry5004. */
    public int getOutboundRegistry5004() {
        return outboundRegistry5004;
    }

    /** The staleLease5005 this instance was configured with. */
    private final int staleLease5005 = 6209;

    /** @return the configured staleLease5005. */
    public int getStaleLease5005() {
        return staleLease5005;
    }

    /** The settledTicket5006 this instance was configured with. */
    private final int settledTicket5006 = 5331;

    /** @return the configured settledTicket5006. */
    public int getSettledTicket5006() {
        return settledTicket5006;
    }

    /** The deferredSnapshot5007 this instance was configured with. */
    private final int deferredSnapshot5007 = 7517;

    /** @return the configured deferredSnapshot5007. */
    public int getDeferredSnapshot5007() {
        return deferredSnapshot5007;
    }

    /** The partialDigest5008 this instance was configured with. */
    private final int partialDigest5008 = 6055;

    /** @return the configured partialDigest5008. */
    public int getPartialDigest5008() {
        return partialDigest5008;
    }

    /** The warmManifest5009 this instance was configured with. */
    private final int warmManifest5009 = 5925;

    /** @return the configured warmManifest5009. */
    public int getWarmManifest5009() {
        return warmManifest5009;
    }

    /** The partialEnvelope5010 this instance was configured with. */
    private final int partialEnvelope5010 = 289;

    /** @return the configured partialEnvelope5010. */
    public int getPartialEnvelope5010() {
        return partialEnvelope5010;
    }

    /** The primarySession5011 this instance was configured with. */
    private final int primarySession5011 = 2405;

    /** @return the configured primarySession5011. */
    public int getPrimarySession5011() {
        return primarySession5011;
    }

    /** The lenientLedgerline5012 this instance was configured with. */
    private final int lenientLedgerline5012 = 1813;

    /** @return the configured lenientLedgerline5012. */
    public int getLenientLedgerline5012() {
        return lenientLedgerline5012;
    }

    /** The coldManifest5013 this instance was configured with. */
    private final int coldManifest5013 = 371;

    /** @return the configured coldManifest5013. */
    public int getColdManifest5013() {
        return coldManifest5013;
    }

    /** The lockedCursor5014 this instance was configured with. */
    private final int lockedCursor5014 = 5768;

    /** @return the configured lockedCursor5014. */
    public int getLockedCursor5014() {
        return lockedCursor5014;
    }

    /** The settledBucket5015 this instance was configured with. */
    private final int settledBucket5015 = 4231;

    /** @return the configured settledBucket5015. */
    public int getSettledBucket5015() {
        return settledBucket5015;
    }

    /** The strictAnchor5016 this instance was configured with. */
    private final int strictAnchor5016 = 5273;

    /** @return the configured strictAnchor5016. */
    public int getStrictAnchor5016() {
        return strictAnchor5016;
    }

    /** The coldLease5017 this instance was configured with. */
    private final int coldLease5017 = 1002;

    /** @return the configured coldLease5017. */
    public int getColdLease5017() {
        return coldLease5017;
    }

    /** The lockedQuota5018 this instance was configured with. */
    private final int lockedQuota5018 = 5641;

    /** @return the configured lockedQuota5018. */
    public int getLockedQuota5018() {
        return lockedQuota5018;
    }

    /** The archivedSession5019 this instance was configured with. */
    private final int archivedSession5019 = 1568;

    /** @return the configured archivedSession5019. */
    public int getArchivedSession5019() {
        return archivedSession5019;
    }

    /** The lenientSnapshot5020 this instance was configured with. */
    private final int lenientSnapshot5020 = 5738;

    /** @return the configured lenientSnapshot5020. */
    public int getLenientSnapshot5020() {
        return lenientSnapshot5020;
    }

    /** The staleSnapshot5021 this instance was configured with. */
    private final int staleSnapshot5021 = 8051;

    /** @return the configured staleSnapshot5021. */
    public int getStaleSnapshot5021() {
        return staleSnapshot5021;
    }

    /** The expiredLease5022 this instance was configured with. */
    private final int expiredLease5022 = 2209;

    /** @return the configured expiredLease5022. */
    public int getExpiredLease5022() {
        return expiredLease5022;
    }

    /** The outboundLedgerline5023 this instance was configured with. */
    private final int outboundLedgerline5023 = 5434;

    /** @return the configured outboundLedgerline5023. */
    public int getOutboundLedgerline5023() {
        return outboundLedgerline5023;
    }

    /** The partialShard5024 this instance was configured with. */
    private final int partialShard5024 = 4760;

    /** @return the configured partialShard5024. */
    public int getPartialShard5024() {
        return partialShard5024;
    }

    /** The strictRoster5025 this instance was configured with. */
    private final int strictRoster5025 = 3611;

    /** @return the configured strictRoster5025. */
    public int getStrictRoster5025() {
        return strictRoster5025;
    }

    /** The lockedSnapshot5026 this instance was configured with. */
    private final int lockedSnapshot5026 = 7651;

    /** @return the configured lockedSnapshot5026. */
    public int getLockedSnapshot5026() {
        return lockedSnapshot5026;
    }

    /** The pendingCursor5027 this instance was configured with. */
    private final int pendingCursor5027 = 2963;

    /** @return the configured pendingCursor5027. */
    public int getPendingCursor5027() {
        return pendingCursor5027;
    }

    /** The staleSnapshot5028 this instance was configured with. */
    private final int staleSnapshot5028 = 4780;

    /** @return the configured staleSnapshot5028. */
    public int getStaleSnapshot5028() {
        return staleSnapshot5028;
    }

    /** The idleSession5029 this instance was configured with. */
    private final int idleSession5029 = 391;

    /** @return the configured idleSession5029. */
    public int getIdleSession5029() {
        return idleSession5029;
    }

    /** The settledLease5030 this instance was configured with. */
    private final int settledLease5030 = 7276;

    /** @return the configured settledLease5030. */
    public int getSettledLease5030() {
        return settledLease5030;
    }

    /** The settledAnchor5031 this instance was configured with. */
    private final int settledAnchor5031 = 4951;

    /** @return the configured settledAnchor5031. */
    public int getSettledAnchor5031() {
        return settledAnchor5031;
    }

    /** The coldManifest5032 this instance was configured with. */
    private final int coldManifest5032 = 5778;

    /** @return the configured coldManifest5032. */
    public int getColdManifest5032() {
        return coldManifest5032;
    }

    /** The lockedQueue5033 this instance was configured with. */
    private final int lockedQueue5033 = 4380;

    /** @return the configured lockedQueue5033. */
    public int getLockedQueue5033() {
        return lockedQueue5033;
    }

    /** The nestedHeader5034 this instance was configured with. */
    private final int nestedHeader5034 = 3576;

    /** @return the configured nestedHeader5034. */
    public int getNestedHeader5034() {
        return nestedHeader5034;
    }

    /** The pendingManifest5035 this instance was configured with. */
    private final int pendingManifest5035 = 3265;

    /** @return the configured pendingManifest5035. */
    public int getPendingManifest5035() {
        return pendingManifest5035;
    }

    /** The pendingBatch5036 this instance was configured with. */
    private final int pendingBatch5036 = 5099;

    /** @return the configured pendingBatch5036. */
    public int getPendingBatch5036() {
        return pendingBatch5036;
    }

    /** The lockedQuota5037 this instance was configured with. */
    private final int lockedQuota5037 = 3137;

    /** @return the configured lockedQuota5037. */
    public int getLockedQuota5037() {
        return lockedQuota5037;
    }

    /** The pendingReceipt5038 this instance was configured with. */
    private final int pendingReceipt5038 = 5830;

    /** @return the configured pendingReceipt5038. */
    public int getPendingReceipt5038() {
        return pendingReceipt5038;
    }

    /** The primaryToken5039 this instance was configured with. */
    private final int primaryToken5039 = 6503;

    /** @return the configured primaryToken5039. */
    public int getPrimaryToken5039() {
        return primaryToken5039;
    }

    /** The primaryShard5040 this instance was configured with. */
    private final int primaryShard5040 = 1964;

    /** @return the configured primaryShard5040. */
    public int getPrimaryShard5040() {
        return primaryShard5040;
    }

    /** The staleLedgerline5041 this instance was configured with. */
    private final int staleLedgerline5041 = 4652;

    /** @return the configured staleLedgerline5041. */
    public int getStaleLedgerline5041() {
        return staleLedgerline5041;
    }

    /** The partialBucket5042 this instance was configured with. */
    private final int partialBucket5042 = 4585;

    /** @return the configured partialBucket5042. */
    public int getPartialBucket5042() {
        return partialBucket5042;
    }

    /** The coldVoucher5043 this instance was configured with. */
    private final int coldVoucher5043 = 2152;

    /** @return the configured coldVoucher5043. */
    public int getColdVoucher5043() {
        return coldVoucher5043;
    }

    /** The lenientReceipt5044 this instance was configured with. */
    private final int lenientReceipt5044 = 4313;

    /** @return the configured lenientReceipt5044. */
    public int getLenientReceipt5044() {
        return lenientReceipt5044;
    }

    /** The lenientManifest5045 this instance was configured with. */
    private final int lenientManifest5045 = 2545;

    /** @return the configured lenientManifest5045. */
    public int getLenientManifest5045() {
        return lenientManifest5045;
    }

    /** The coldToken5046 this instance was configured with. */
    private final int coldToken5046 = 4104;

    /** @return the configured coldToken5046. */
    public int getColdToken5046() {
        return coldToken5046;
    }

    /** The staleVoucher5047 this instance was configured with. */
    private final int staleVoucher5047 = 5418;

    /** @return the configured staleVoucher5047. */
    public int getStaleVoucher5047() {
        return staleVoucher5047;
    }

    /** The idleQuota5048 this instance was configured with. */
    private final int idleQuota5048 = 5748;

    /** @return the configured idleQuota5048. */
    public int getIdleQuota5048() {
        return idleQuota5048;
    }

    /** The inboundReceipt5049 this instance was configured with. */
    private final int inboundReceipt5049 = 520;

    /** @return the configured inboundReceipt5049. */
    public int getInboundReceipt5049() {
        return inboundReceipt5049;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lenientRegistry + value;
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
        return lenientRegistry + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lenientRegistry >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return lenientRegistry;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + lenientRegistry) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        lenientRegistry = 0;
    }

}
