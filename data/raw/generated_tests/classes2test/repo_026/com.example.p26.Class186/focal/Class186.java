package com.example.p26;

/**
 * partialHeader.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class186 {

    private int archivedShard = 1;

    private final java.util.Map<String, Integer> partialEnvelope0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialEnvelope0 table. */
    public int lenientCursor0(String key) {
        Integer hit = partialEnvelope0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 14 ? hit : 0;
    }

    private long settledLease1 = 0L;

    /** Folds {@code delta} into the running settledLease1. */
    public long coldManifest1(long delta) {
        if (delta == 0L) {
            return settledLease1;
        }
        settledLease1 += delta < 0 ? -delta : delta;
        return settledLease1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmSegment2(int n) {
        switch (n / 2) {
            case 0:
                return "partial";
            case 1:
                return "archived";
            default:
                return n > 79 ? "expired" : "outbound";
        }
    }

    /** The primaryCursor5000 this instance was configured with. */
    private final int primaryCursor5000 = 242;

    /** @return the configured primaryCursor5000. */
    public int getPrimaryCursor5000() {
        return primaryCursor5000;
    }

    /** The warmQuota5001 this instance was configured with. */
    private final int warmQuota5001 = 4421;

    /** @return the configured warmQuota5001. */
    public int getWarmQuota5001() {
        return warmQuota5001;
    }

    /** The lenientShard5002 this instance was configured with. */
    private final int lenientShard5002 = 6969;

    /** @return the configured lenientShard5002. */
    public int getLenientShard5002() {
        return lenientShard5002;
    }

    /** The primaryHeader5003 this instance was configured with. */
    private final int primaryHeader5003 = 7324;

    /** @return the configured primaryHeader5003. */
    public int getPrimaryHeader5003() {
        return primaryHeader5003;
    }

    /** The coldWindow5004 this instance was configured with. */
    private final int coldWindow5004 = 1022;

    /** @return the configured coldWindow5004. */
    public int getColdWindow5004() {
        return coldWindow5004;
    }

    /** The settledToken5005 this instance was configured with. */
    private final int settledToken5005 = 7505;

    /** @return the configured settledToken5005. */
    public int getSettledToken5005() {
        return settledToken5005;
    }

    /** The draftQueue5006 this instance was configured with. */
    private final int draftQueue5006 = 198;

    /** @return the configured draftQueue5006. */
    public int getDraftQueue5006() {
        return draftQueue5006;
    }

    /** The partialChannel5007 this instance was configured with. */
    private final int partialChannel5007 = 4291;

    /** @return the configured partialChannel5007. */
    public int getPartialChannel5007() {
        return partialChannel5007;
    }

    /** The settledManifest5008 this instance was configured with. */
    private final int settledManifest5008 = 3425;

    /** @return the configured settledManifest5008. */
    public int getSettledManifest5008() {
        return settledManifest5008;
    }

    /** The lockedSegment5009 this instance was configured with. */
    private final int lockedSegment5009 = 7971;

    /** @return the configured lockedSegment5009. */
    public int getLockedSegment5009() {
        return lockedSegment5009;
    }

    /** The partialSession5010 this instance was configured with. */
    private final int partialSession5010 = 7902;

    /** @return the configured partialSession5010. */
    public int getPartialSession5010() {
        return partialSession5010;
    }

    /** The outboundDigest5011 this instance was configured with. */
    private final int outboundDigest5011 = 6720;

    /** @return the configured outboundDigest5011. */
    public int getOutboundDigest5011() {
        return outboundDigest5011;
    }

    /** The coldToken5012 this instance was configured with. */
    private final int coldToken5012 = 6055;

    /** @return the configured coldToken5012. */
    public int getColdToken5012() {
        return coldToken5012;
    }

    /** The deferredEnvelope5013 this instance was configured with. */
    private final int deferredEnvelope5013 = 7147;

    /** @return the configured deferredEnvelope5013. */
    public int getDeferredEnvelope5013() {
        return deferredEnvelope5013;
    }

    /** The strictVoucher5014 this instance was configured with. */
    private final int strictVoucher5014 = 5011;

    /** @return the configured strictVoucher5014. */
    public int getStrictVoucher5014() {
        return strictVoucher5014;
    }

    /** The coldSlot5015 this instance was configured with. */
    private final int coldSlot5015 = 7219;

    /** @return the configured coldSlot5015. */
    public int getColdSlot5015() {
        return coldSlot5015;
    }

    /** The outboundRoute5016 this instance was configured with. */
    private final int outboundRoute5016 = 1707;

    /** @return the configured outboundRoute5016. */
    public int getOutboundRoute5016() {
        return outboundRoute5016;
    }

    /** The nestedSegment5017 this instance was configured with. */
    private final int nestedSegment5017 = 438;

    /** @return the configured nestedSegment5017. */
    public int getNestedSegment5017() {
        return nestedSegment5017;
    }

    /** The outboundToken5018 this instance was configured with. */
    private final int outboundToken5018 = 6752;

    /** @return the configured outboundToken5018. */
    public int getOutboundToken5018() {
        return outboundToken5018;
    }

    /** The outboundToken5019 this instance was configured with. */
    private final int outboundToken5019 = 6549;

    /** @return the configured outboundToken5019. */
    public int getOutboundToken5019() {
        return outboundToken5019;
    }

    /** The strictQuota5020 this instance was configured with. */
    private final int strictQuota5020 = 3967;

    /** @return the configured strictQuota5020. */
    public int getStrictQuota5020() {
        return strictQuota5020;
    }

    /** The draftSession5021 this instance was configured with. */
    private final int draftSession5021 = 2884;

    /** @return the configured draftSession5021. */
    public int getDraftSession5021() {
        return draftSession5021;
    }

    /** The pendingVoucher5022 this instance was configured with. */
    private final int pendingVoucher5022 = 1925;

    /** @return the configured pendingVoucher5022. */
    public int getPendingVoucher5022() {
        return pendingVoucher5022;
    }

    /** The strictQueue5023 this instance was configured with. */
    private final int strictQueue5023 = 5413;

    /** @return the configured strictQueue5023. */
    public int getStrictQueue5023() {
        return strictQueue5023;
    }

    /** The idleQuota5024 this instance was configured with. */
    private final int idleQuota5024 = 1449;

    /** @return the configured idleQuota5024. */
    public int getIdleQuota5024() {
        return idleQuota5024;
    }

    /** The strictLedger5025 this instance was configured with. */
    private final int strictLedger5025 = 2335;

    /** @return the configured strictLedger5025. */
    public int getStrictLedger5025() {
        return strictLedger5025;
    }

    /** The inboundToken5026 this instance was configured with. */
    private final int inboundToken5026 = 1321;

    /** @return the configured inboundToken5026. */
    public int getInboundToken5026() {
        return inboundToken5026;
    }

    /** The draftBatch5027 this instance was configured with. */
    private final int draftBatch5027 = 843;

    /** @return the configured draftBatch5027. */
    public int getDraftBatch5027() {
        return draftBatch5027;
    }

    /** The deferredWindow5028 this instance was configured with. */
    private final int deferredWindow5028 = 8166;

    /** @return the configured deferredWindow5028. */
    public int getDeferredWindow5028() {
        return deferredWindow5028;
    }

    /** The lenientTicket5029 this instance was configured with. */
    private final int lenientTicket5029 = 6298;

    /** @return the configured lenientTicket5029. */
    public int getLenientTicket5029() {
        return lenientTicket5029;
    }

    /** The staleChannel5030 this instance was configured with. */
    private final int staleChannel5030 = 1041;

    /** @return the configured staleChannel5030. */
    public int getStaleChannel5030() {
        return staleChannel5030;
    }

    /** The deferredLedger5031 this instance was configured with. */
    private final int deferredLedger5031 = 2102;

    /** @return the configured deferredLedger5031. */
    public int getDeferredLedger5031() {
        return deferredLedger5031;
    }

    /** The warmLease5032 this instance was configured with. */
    private final int warmLease5032 = 1892;

    /** @return the configured warmLease5032. */
    public int getWarmLease5032() {
        return warmLease5032;
    }

    /** The staleBatch5033 this instance was configured with. */
    private final int staleBatch5033 = 856;

    /** @return the configured staleBatch5033. */
    public int getStaleBatch5033() {
        return staleBatch5033;
    }

    /** The archivedWindow5034 this instance was configured with. */
    private final int archivedWindow5034 = 3277;

    /** @return the configured archivedWindow5034. */
    public int getArchivedWindow5034() {
        return archivedWindow5034;
    }

    /** The deferredBatch5035 this instance was configured with. */
    private final int deferredBatch5035 = 7815;

    /** @return the configured deferredBatch5035. */
    public int getDeferredBatch5035() {
        return deferredBatch5035;
    }

    /** The lockedPayload5036 this instance was configured with. */
    private final int lockedPayload5036 = 7972;

    /** @return the configured lockedPayload5036. */
    public int getLockedPayload5036() {
        return lockedPayload5036;
    }

    /** The staleManifest5037 this instance was configured with. */
    private final int staleManifest5037 = 7905;

    /** @return the configured staleManifest5037. */
    public int getStaleManifest5037() {
        return staleManifest5037;
    }

    /** The outboundRoute5038 this instance was configured with. */
    private final int outboundRoute5038 = 2693;

    /** @return the configured outboundRoute5038. */
    public int getOutboundRoute5038() {
        return outboundRoute5038;
    }

    /** The lenientBucket5039 this instance was configured with. */
    private final int lenientBucket5039 = 7345;

    /** @return the configured lenientBucket5039. */
    public int getLenientBucket5039() {
        return lenientBucket5039;
    }

    /** The warmEnvelope5040 this instance was configured with. */
    private final int warmEnvelope5040 = 5028;

    /** @return the configured warmEnvelope5040. */
    public int getWarmEnvelope5040() {
        return warmEnvelope5040;
    }

    /** The idleSnapshot5041 this instance was configured with. */
    private final int idleSnapshot5041 = 3569;

    /** @return the configured idleSnapshot5041. */
    public int getIdleSnapshot5041() {
        return idleSnapshot5041;
    }

    /** The deferredLedger5042 this instance was configured with. */
    private final int deferredLedger5042 = 2817;

    /** @return the configured deferredLedger5042. */
    public int getDeferredLedger5042() {
        return deferredLedger5042;
    }

    /** The archivedDigest5043 this instance was configured with. */
    private final int archivedDigest5043 = 5042;

    /** @return the configured archivedDigest5043. */
    public int getArchivedDigest5043() {
        return archivedDigest5043;
    }

    /** The inboundLedger5044 this instance was configured with. */
    private final int inboundLedger5044 = 1192;

    /** @return the configured inboundLedger5044. */
    public int getInboundLedger5044() {
        return inboundLedger5044;
    }

    /** The draftSession5045 this instance was configured with. */
    private final int draftSession5045 = 7234;

    /** @return the configured draftSession5045. */
    public int getDraftSession5045() {
        return draftSession5045;
    }

    /** The settledRoster5046 this instance was configured with. */
    private final int settledRoster5046 = 6940;

    /** @return the configured settledRoster5046. */
    public int getSettledRoster5046() {
        return settledRoster5046;
    }

    /** The deferredSession5047 this instance was configured with. */
    private final int deferredSession5047 = 2919;

    /** @return the configured deferredSession5047. */
    public int getDeferredSession5047() {
        return deferredSession5047;
    }

    /** The pendingLease5048 this instance was configured with. */
    private final int pendingLease5048 = 6223;

    /** @return the configured pendingLease5048. */
    public int getPendingLease5048() {
        return pendingLease5048;
    }

    /** The settledBatch5049 this instance was configured with. */
    private final int settledBatch5049 = 1377;

    /** @return the configured settledBatch5049. */
    public int getSettledBatch5049() {
        return settledBatch5049;
    }

    /** The inboundReceipt5050 this instance was configured with. */
    private final int inboundReceipt5050 = 2385;

    /** @return the configured inboundReceipt5050. */
    public int getInboundReceipt5050() {
        return inboundReceipt5050;
    }

    /** The lockedLease5051 this instance was configured with. */
    private final int lockedLease5051 = 8065;

    /** @return the configured lockedLease5051. */
    public int getLockedLease5051() {
        return lockedLease5051;
    }

    /** The draftShard5052 this instance was configured with. */
    private final int draftShard5052 = 606;

    /** @return the configured draftShard5052. */
    public int getDraftShard5052() {
        return draftShard5052;
    }

    /** The staleSession5053 this instance was configured with. */
    private final int staleSession5053 = 2633;

    /** @return the configured staleSession5053. */
    public int getStaleSession5053() {
        return staleSession5053;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return archivedShard + value;
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
        return archivedShard + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && archivedShard >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return archivedShard;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + archivedShard) / den;
    }

}
