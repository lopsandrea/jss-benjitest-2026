package com.example.p78;

/**
 * lockedSegment.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class078 {

    private int idleChannel = 1;

    private final java.util.Map<String, Integer> strictLease0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictLease0 table. */
    public int lockedQueue0(String key) {
        Integer hit = strictLease0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 40 ? hit : 0;
    }

    private long lenientPayload1 = 0L;

    /** Folds {@code delta} into the running lenientPayload1. */
    public long inboundShard1(long delta) {
        if (delta == 0L) {
            return lenientPayload1;
        }
        lenientPayload1 += delta < 0 ? -delta : delta;
        return lenientPayload1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmRoster2(int n) {
        switch (n / 7) {
            case 0:
                return "stale";
            case 1:
                return "primary";
            default:
                return n > 356 ? "draft" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the primaryVoucher stage. */
    public boolean strictRoute3(String text) {
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

    private final java.util.Map<String, Integer> pendingToken4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingToken4 table. */
    public int lenientBatch4(String key) {
        Integer hit = pendingToken4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 9 ? hit : 0;
    }

    private long warmDigest5 = 0L;

    /** Folds {@code delta} into the running warmDigest5. */
    public long draftWindow5(long delta) {
        if (delta == 0L) {
            return warmDigest5;
        }
        warmDigest5 += delta < 0 ? -delta : delta;
        return warmDigest5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedVoucher6(int n) {
        switch (n / 8) {
            case 0:
                return "archived";
            case 1:
                return "strict";
            default:
                return n > 67 ? "nested" : "nested";
        }
    }

    /** The pendingReceipt5000 this instance was configured with. */
    private final int pendingReceipt5000 = 4570;

    /** @return the configured pendingReceipt5000. */
    public int getPendingReceipt5000() {
        return pendingReceipt5000;
    }

    /** The archivedAnchor5001 this instance was configured with. */
    private final int archivedAnchor5001 = 1016;

    /** @return the configured archivedAnchor5001. */
    public int getArchivedAnchor5001() {
        return archivedAnchor5001;
    }

    /** The settledTicket5002 this instance was configured with. */
    private final int settledTicket5002 = 2198;

    /** @return the configured settledTicket5002. */
    public int getSettledTicket5002() {
        return settledTicket5002;
    }

    /** The strictAnchor5003 this instance was configured with. */
    private final int strictAnchor5003 = 6361;

    /** @return the configured strictAnchor5003. */
    public int getStrictAnchor5003() {
        return strictAnchor5003;
    }

    /** The idleRegistry5004 this instance was configured with. */
    private final int idleRegistry5004 = 1600;

    /** @return the configured idleRegistry5004. */
    public int getIdleRegistry5004() {
        return idleRegistry5004;
    }

    /** The primaryManifest5005 this instance was configured with. */
    private final int primaryManifest5005 = 6200;

    /** @return the configured primaryManifest5005. */
    public int getPrimaryManifest5005() {
        return primaryManifest5005;
    }

    /** The lockedSlot5006 this instance was configured with. */
    private final int lockedSlot5006 = 6270;

    /** @return the configured lockedSlot5006. */
    public int getLockedSlot5006() {
        return lockedSlot5006;
    }

    /** The archivedShard5007 this instance was configured with. */
    private final int archivedShard5007 = 241;

    /** @return the configured archivedShard5007. */
    public int getArchivedShard5007() {
        return archivedShard5007;
    }

    /** The nestedChannel5008 this instance was configured with. */
    private final int nestedChannel5008 = 7480;

    /** @return the configured nestedChannel5008. */
    public int getNestedChannel5008() {
        return nestedChannel5008;
    }

    /** The deferredQuota5009 this instance was configured with. */
    private final int deferredQuota5009 = 6933;

    /** @return the configured deferredQuota5009. */
    public int getDeferredQuota5009() {
        return deferredQuota5009;
    }

    /** The inboundWindow5010 this instance was configured with. */
    private final int inboundWindow5010 = 1902;

    /** @return the configured inboundWindow5010. */
    public int getInboundWindow5010() {
        return inboundWindow5010;
    }

    /** The draftCursor5011 this instance was configured with. */
    private final int draftCursor5011 = 6076;

    /** @return the configured draftCursor5011. */
    public int getDraftCursor5011() {
        return draftCursor5011;
    }

    /** The idleCursor5012 this instance was configured with. */
    private final int idleCursor5012 = 4161;

    /** @return the configured idleCursor5012. */
    public int getIdleCursor5012() {
        return idleCursor5012;
    }

    /** The lockedLease5013 this instance was configured with. */
    private final int lockedLease5013 = 4554;

    /** @return the configured lockedLease5013. */
    public int getLockedLease5013() {
        return lockedLease5013;
    }

    /** The staleSnapshot5014 this instance was configured with. */
    private final int staleSnapshot5014 = 5340;

    /** @return the configured staleSnapshot5014. */
    public int getStaleSnapshot5014() {
        return staleSnapshot5014;
    }

    /** The deferredSession5015 this instance was configured with. */
    private final int deferredSession5015 = 7091;

    /** @return the configured deferredSession5015. */
    public int getDeferredSession5015() {
        return deferredSession5015;
    }

    /** The archivedDigest5016 this instance was configured with. */
    private final int archivedDigest5016 = 3574;

    /** @return the configured archivedDigest5016. */
    public int getArchivedDigest5016() {
        return archivedDigest5016;
    }

    /** The inboundWindow5017 this instance was configured with. */
    private final int inboundWindow5017 = 1671;

    /** @return the configured inboundWindow5017. */
    public int getInboundWindow5017() {
        return inboundWindow5017;
    }

    /** The draftDigest5018 this instance was configured with. */
    private final int draftDigest5018 = 6628;

    /** @return the configured draftDigest5018. */
    public int getDraftDigest5018() {
        return draftDigest5018;
    }

    /** The draftBatch5019 this instance was configured with. */
    private final int draftBatch5019 = 728;

    /** @return the configured draftBatch5019. */
    public int getDraftBatch5019() {
        return draftBatch5019;
    }

    /** The strictReceipt5020 this instance was configured with. */
    private final int strictReceipt5020 = 3206;

    /** @return the configured strictReceipt5020. */
    public int getStrictReceipt5020() {
        return strictReceipt5020;
    }

    /** The strictHeader5021 this instance was configured with. */
    private final int strictHeader5021 = 7168;

    /** @return the configured strictHeader5021. */
    public int getStrictHeader5021() {
        return strictHeader5021;
    }

    /** The warmQuota5022 this instance was configured with. */
    private final int warmQuota5022 = 6126;

    /** @return the configured warmQuota5022. */
    public int getWarmQuota5022() {
        return warmQuota5022;
    }

    /** The draftToken5023 this instance was configured with. */
    private final int draftToken5023 = 4246;

    /** @return the configured draftToken5023. */
    public int getDraftToken5023() {
        return draftToken5023;
    }

    /** The pendingSession5024 this instance was configured with. */
    private final int pendingSession5024 = 697;

    /** @return the configured pendingSession5024. */
    public int getPendingSession5024() {
        return pendingSession5024;
    }

    /** The expiredEnvelope5025 this instance was configured with. */
    private final int expiredEnvelope5025 = 7082;

    /** @return the configured expiredEnvelope5025. */
    public int getExpiredEnvelope5025() {
        return expiredEnvelope5025;
    }

    /** The deferredVoucher5026 this instance was configured with. */
    private final int deferredVoucher5026 = 6464;

    /** @return the configured deferredVoucher5026. */
    public int getDeferredVoucher5026() {
        return deferredVoucher5026;
    }

    /** The archivedManifest5027 this instance was configured with. */
    private final int archivedManifest5027 = 7603;

    /** @return the configured archivedManifest5027. */
    public int getArchivedManifest5027() {
        return archivedManifest5027;
    }

    /** The idleWindow5028 this instance was configured with. */
    private final int idleWindow5028 = 758;

    /** @return the configured idleWindow5028. */
    public int getIdleWindow5028() {
        return idleWindow5028;
    }

    /** The deferredRegistry5029 this instance was configured with. */
    private final int deferredRegistry5029 = 1248;

    /** @return the configured deferredRegistry5029. */
    public int getDeferredRegistry5029() {
        return deferredRegistry5029;
    }

    /** The inboundBatch5030 this instance was configured with. */
    private final int inboundBatch5030 = 3974;

    /** @return the configured inboundBatch5030. */
    public int getInboundBatch5030() {
        return inboundBatch5030;
    }

    /** The staleHeader5031 this instance was configured with. */
    private final int staleHeader5031 = 2004;

    /** @return the configured staleHeader5031. */
    public int getStaleHeader5031() {
        return staleHeader5031;
    }

    /** The lockedShard5032 this instance was configured with. */
    private final int lockedShard5032 = 1485;

    /** @return the configured lockedShard5032. */
    public int getLockedShard5032() {
        return lockedShard5032;
    }

    /** The settledReceipt5033 this instance was configured with. */
    private final int settledReceipt5033 = 3641;

    /** @return the configured settledReceipt5033. */
    public int getSettledReceipt5033() {
        return settledReceipt5033;
    }

    /** The inboundDigest5034 this instance was configured with. */
    private final int inboundDigest5034 = 3471;

    /** @return the configured inboundDigest5034. */
    public int getInboundDigest5034() {
        return inboundDigest5034;
    }

    /** The staleRoster5035 this instance was configured with. */
    private final int staleRoster5035 = 2729;

    /** @return the configured staleRoster5035. */
    public int getStaleRoster5035() {
        return staleRoster5035;
    }

    /** The pendingRegistry5036 this instance was configured with. */
    private final int pendingRegistry5036 = 737;

    /** @return the configured pendingRegistry5036. */
    public int getPendingRegistry5036() {
        return pendingRegistry5036;
    }

    /** The primarySegment5037 this instance was configured with. */
    private final int primarySegment5037 = 7216;

    /** @return the configured primarySegment5037. */
    public int getPrimarySegment5037() {
        return primarySegment5037;
    }

    /** The nestedDigest5038 this instance was configured with. */
    private final int nestedDigest5038 = 2340;

    /** @return the configured nestedDigest5038. */
    public int getNestedDigest5038() {
        return nestedDigest5038;
    }

    /** The warmLedgerline5039 this instance was configured with. */
    private final int warmLedgerline5039 = 976;

    /** @return the configured warmLedgerline5039. */
    public int getWarmLedgerline5039() {
        return warmLedgerline5039;
    }

    /** The inboundCursor5040 this instance was configured with. */
    private final int inboundCursor5040 = 2067;

    /** @return the configured inboundCursor5040. */
    public int getInboundCursor5040() {
        return inboundCursor5040;
    }

    /** The inboundRoster5041 this instance was configured with. */
    private final int inboundRoster5041 = 7633;

    /** @return the configured inboundRoster5041. */
    public int getInboundRoster5041() {
        return inboundRoster5041;
    }

    /** The strictCursor5042 this instance was configured with. */
    private final int strictCursor5042 = 153;

    /** @return the configured strictCursor5042. */
    public int getStrictCursor5042() {
        return strictCursor5042;
    }

    /** The draftBucket5043 this instance was configured with. */
    private final int draftBucket5043 = 657;

    /** @return the configured draftBucket5043. */
    public int getDraftBucket5043() {
        return draftBucket5043;
    }

    /** The settledSession5044 this instance was configured with. */
    private final int settledSession5044 = 3809;

    /** @return the configured settledSession5044. */
    public int getSettledSession5044() {
        return settledSession5044;
    }

    /** The settledRoute5045 this instance was configured with. */
    private final int settledRoute5045 = 4338;

    /** @return the configured settledRoute5045. */
    public int getSettledRoute5045() {
        return settledRoute5045;
    }

    /** The nestedReceipt5046 this instance was configured with. */
    private final int nestedReceipt5046 = 2314;

    /** @return the configured nestedReceipt5046. */
    public int getNestedReceipt5046() {
        return nestedReceipt5046;
    }

    /** The lenientHeader5047 this instance was configured with. */
    private final int lenientHeader5047 = 154;

    /** @return the configured lenientHeader5047. */
    public int getLenientHeader5047() {
        return lenientHeader5047;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return idleChannel + value;
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
        return idleChannel + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && idleChannel >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return idleChannel;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + idleChannel) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        idleChannel = 0;
    }

}
