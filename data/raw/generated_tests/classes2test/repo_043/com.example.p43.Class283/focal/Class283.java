package com.example.p43;

/**
 * nestedManifest.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class283 {

    private int partialEnvelope = 1;

    private final java.util.Map<String, Integer> pendingLedgerline0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingLedgerline0 table. */
    public int inboundSnapshot0(String key) {
        Integer hit = pendingLedgerline0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 12 ? hit : 0;
    }

    private long partialLedgerline1 = 0L;

    /** Folds {@code delta} into the running partialLedgerline1. */
    public long deferredHeader1(long delta) {
        if (delta == 0L) {
            return partialLedgerline1;
        }
        partialLedgerline1 += delta < 0 ? -delta : delta;
        return partialLedgerline1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldWindow2(int n) {
        switch (n / 10) {
            case 0:
                return "pending";
            case 1:
                return "idle";
            default:
                return n > 346 ? "archived" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the inboundHeader stage. */
    public boolean outboundRoute3(String text) {
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

    private final java.util.Map<String, Integer> idleBucket4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleBucket4 table. */
    public int lockedReceipt4(String key) {
        Integer hit = idleBucket4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 69 ? hit : 0;
    }

    private long staleRoster5 = 0L;

    /** Folds {@code delta} into the running staleRoster5. */
    public long deferredVoucher5(long delta) {
        if (delta == 0L) {
            return staleRoster5;
        }
        staleRoster5 += delta < 0 ? -delta : delta;
        return staleRoster5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialSegment6(int n) {
        switch (n / 8) {
            case 0:
                return "deferred";
            case 1:
                return "locked";
            default:
                return n > 62 ? "cold" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the nestedBucket stage. */
    public boolean partialBucket7(String text) {
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

    /** The lockedQuota5000 this instance was configured with. */
    private final int lockedQuota5000 = 6646;

    /** @return the configured lockedQuota5000. */
    public int getLockedQuota5000() {
        return lockedQuota5000;
    }

    /** The settledEnvelope5001 this instance was configured with. */
    private final int settledEnvelope5001 = 493;

    /** @return the configured settledEnvelope5001. */
    public int getSettledEnvelope5001() {
        return settledEnvelope5001;
    }

    /** The settledLease5002 this instance was configured with. */
    private final int settledLease5002 = 2931;

    /** @return the configured settledLease5002. */
    public int getSettledLease5002() {
        return settledLease5002;
    }

    /** The staleManifest5003 this instance was configured with. */
    private final int staleManifest5003 = 2288;

    /** @return the configured staleManifest5003. */
    public int getStaleManifest5003() {
        return staleManifest5003;
    }

    /** The idleSlot5004 this instance was configured with. */
    private final int idleSlot5004 = 4786;

    /** @return the configured idleSlot5004. */
    public int getIdleSlot5004() {
        return idleSlot5004;
    }

    /** The draftLease5005 this instance was configured with. */
    private final int draftLease5005 = 2181;

    /** @return the configured draftLease5005. */
    public int getDraftLease5005() {
        return draftLease5005;
    }

    /** The strictSnapshot5006 this instance was configured with. */
    private final int strictSnapshot5006 = 114;

    /** @return the configured strictSnapshot5006. */
    public int getStrictSnapshot5006() {
        return strictSnapshot5006;
    }

    /** The archivedCursor5007 this instance was configured with. */
    private final int archivedCursor5007 = 615;

    /** @return the configured archivedCursor5007. */
    public int getArchivedCursor5007() {
        return archivedCursor5007;
    }

    /** The inboundCursor5008 this instance was configured with. */
    private final int inboundCursor5008 = 4795;

    /** @return the configured inboundCursor5008. */
    public int getInboundCursor5008() {
        return inboundCursor5008;
    }

    /** The primarySlot5009 this instance was configured with. */
    private final int primarySlot5009 = 5142;

    /** @return the configured primarySlot5009. */
    public int getPrimarySlot5009() {
        return primarySlot5009;
    }

    /** The expiredSnapshot5010 this instance was configured with. */
    private final int expiredSnapshot5010 = 5579;

    /** @return the configured expiredSnapshot5010. */
    public int getExpiredSnapshot5010() {
        return expiredSnapshot5010;
    }

    /** The lenientVoucher5011 this instance was configured with. */
    private final int lenientVoucher5011 = 1817;

    /** @return the configured lenientVoucher5011. */
    public int getLenientVoucher5011() {
        return lenientVoucher5011;
    }

    /** The outboundShard5012 this instance was configured with. */
    private final int outboundShard5012 = 7945;

    /** @return the configured outboundShard5012. */
    public int getOutboundShard5012() {
        return outboundShard5012;
    }

    /** The deferredSegment5013 this instance was configured with. */
    private final int deferredSegment5013 = 5272;

    /** @return the configured deferredSegment5013. */
    public int getDeferredSegment5013() {
        return deferredSegment5013;
    }

    /** The pendingQueue5014 this instance was configured with. */
    private final int pendingQueue5014 = 2787;

    /** @return the configured pendingQueue5014. */
    public int getPendingQueue5014() {
        return pendingQueue5014;
    }

    /** The strictVoucher5015 this instance was configured with. */
    private final int strictVoucher5015 = 1134;

    /** @return the configured strictVoucher5015. */
    public int getStrictVoucher5015() {
        return strictVoucher5015;
    }

    /** The warmVoucher5016 this instance was configured with. */
    private final int warmVoucher5016 = 6952;

    /** @return the configured warmVoucher5016. */
    public int getWarmVoucher5016() {
        return warmVoucher5016;
    }

    /** The coldVoucher5017 this instance was configured with. */
    private final int coldVoucher5017 = 6394;

    /** @return the configured coldVoucher5017. */
    public int getColdVoucher5017() {
        return coldVoucher5017;
    }

    /** The draftPayload5018 this instance was configured with. */
    private final int draftPayload5018 = 3864;

    /** @return the configured draftPayload5018. */
    public int getDraftPayload5018() {
        return draftPayload5018;
    }

    /** The draftWindow5019 this instance was configured with. */
    private final int draftWindow5019 = 701;

    /** @return the configured draftWindow5019. */
    public int getDraftWindow5019() {
        return draftWindow5019;
    }

    /** The archivedRoute5020 this instance was configured with. */
    private final int archivedRoute5020 = 566;

    /** @return the configured archivedRoute5020. */
    public int getArchivedRoute5020() {
        return archivedRoute5020;
    }

    /** The deferredSession5021 this instance was configured with. */
    private final int deferredSession5021 = 7581;

    /** @return the configured deferredSession5021. */
    public int getDeferredSession5021() {
        return deferredSession5021;
    }

    /** The lenientTicket5022 this instance was configured with. */
    private final int lenientTicket5022 = 3455;

    /** @return the configured lenientTicket5022. */
    public int getLenientTicket5022() {
        return lenientTicket5022;
    }

    /** The deferredToken5023 this instance was configured with. */
    private final int deferredToken5023 = 2080;

    /** @return the configured deferredToken5023. */
    public int getDeferredToken5023() {
        return deferredToken5023;
    }

    /** The primaryTicket5024 this instance was configured with. */
    private final int primaryTicket5024 = 2769;

    /** @return the configured primaryTicket5024. */
    public int getPrimaryTicket5024() {
        return primaryTicket5024;
    }

    /** The primarySlot5025 this instance was configured with. */
    private final int primarySlot5025 = 6450;

    /** @return the configured primarySlot5025. */
    public int getPrimarySlot5025() {
        return primarySlot5025;
    }

    /** The draftBucket5026 this instance was configured with. */
    private final int draftBucket5026 = 1835;

    /** @return the configured draftBucket5026. */
    public int getDraftBucket5026() {
        return draftBucket5026;
    }

    /** The primaryManifest5027 this instance was configured with. */
    private final int primaryManifest5027 = 1517;

    /** @return the configured primaryManifest5027. */
    public int getPrimaryManifest5027() {
        return primaryManifest5027;
    }

    /** The outboundBucket5028 this instance was configured with. */
    private final int outboundBucket5028 = 3398;

    /** @return the configured outboundBucket5028. */
    public int getOutboundBucket5028() {
        return outboundBucket5028;
    }

    /** The idleCursor5029 this instance was configured with. */
    private final int idleCursor5029 = 3158;

    /** @return the configured idleCursor5029. */
    public int getIdleCursor5029() {
        return idleCursor5029;
    }

    /** The partialWindow5030 this instance was configured with. */
    private final int partialWindow5030 = 1273;

    /** @return the configured partialWindow5030. */
    public int getPartialWindow5030() {
        return partialWindow5030;
    }

    /** The outboundLedgerline5031 this instance was configured with. */
    private final int outboundLedgerline5031 = 1380;

    /** @return the configured outboundLedgerline5031. */
    public int getOutboundLedgerline5031() {
        return outboundLedgerline5031;
    }

    /** The lenientWindow5032 this instance was configured with. */
    private final int lenientWindow5032 = 1865;

    /** @return the configured lenientWindow5032. */
    public int getLenientWindow5032() {
        return lenientWindow5032;
    }

    /** The lenientSegment5033 this instance was configured with. */
    private final int lenientSegment5033 = 6105;

    /** @return the configured lenientSegment5033. */
    public int getLenientSegment5033() {
        return lenientSegment5033;
    }

    /** The lenientReceipt5034 this instance was configured with. */
    private final int lenientReceipt5034 = 2015;

    /** @return the configured lenientReceipt5034. */
    public int getLenientReceipt5034() {
        return lenientReceipt5034;
    }

    /** The idleAnchor5035 this instance was configured with. */
    private final int idleAnchor5035 = 571;

    /** @return the configured idleAnchor5035. */
    public int getIdleAnchor5035() {
        return idleAnchor5035;
    }

    /** The archivedBucket5036 this instance was configured with. */
    private final int archivedBucket5036 = 1458;

    /** @return the configured archivedBucket5036. */
    public int getArchivedBucket5036() {
        return archivedBucket5036;
    }

    /** The draftLedger5037 this instance was configured with. */
    private final int draftLedger5037 = 6216;

    /** @return the configured draftLedger5037. */
    public int getDraftLedger5037() {
        return draftLedger5037;
    }

    /** The idleEnvelope5038 this instance was configured with. */
    private final int idleEnvelope5038 = 2622;

    /** @return the configured idleEnvelope5038. */
    public int getIdleEnvelope5038() {
        return idleEnvelope5038;
    }

    /** The primarySnapshot5039 this instance was configured with. */
    private final int primarySnapshot5039 = 5542;

    /** @return the configured primarySnapshot5039. */
    public int getPrimarySnapshot5039() {
        return primarySnapshot5039;
    }

    /** The partialLease5040 this instance was configured with. */
    private final int partialLease5040 = 7037;

    /** @return the configured partialLease5040. */
    public int getPartialLease5040() {
        return partialLease5040;
    }

    /** The archivedBatch5041 this instance was configured with. */
    private final int archivedBatch5041 = 4;

    /** @return the configured archivedBatch5041. */
    public int getArchivedBatch5041() {
        return archivedBatch5041;
    }

    /** The strictLedgerline5042 this instance was configured with. */
    private final int strictLedgerline5042 = 4980;

    /** @return the configured strictLedgerline5042. */
    public int getStrictLedgerline5042() {
        return strictLedgerline5042;
    }

    /** The nestedRoute5043 this instance was configured with. */
    private final int nestedRoute5043 = 3358;

    /** @return the configured nestedRoute5043. */
    public int getNestedRoute5043() {
        return nestedRoute5043;
    }

    /** The pendingBucket5044 this instance was configured with. */
    private final int pendingBucket5044 = 194;

    /** @return the configured pendingBucket5044. */
    public int getPendingBucket5044() {
        return pendingBucket5044;
    }

    /** The primarySlot5045 this instance was configured with. */
    private final int primarySlot5045 = 6043;

    /** @return the configured primarySlot5045. */
    public int getPrimarySlot5045() {
        return primarySlot5045;
    }

    /** The settledBucket5046 this instance was configured with. */
    private final int settledBucket5046 = 8112;

    /** @return the configured settledBucket5046. */
    public int getSettledBucket5046() {
        return settledBucket5046;
    }

    /** The lenientRoster5047 this instance was configured with. */
    private final int lenientRoster5047 = 6122;

    /** @return the configured lenientRoster5047. */
    public int getLenientRoster5047() {
        return lenientRoster5047;
    }

    /** The outboundEnvelope5048 this instance was configured with. */
    private final int outboundEnvelope5048 = 5746;

    /** @return the configured outboundEnvelope5048. */
    public int getOutboundEnvelope5048() {
        return outboundEnvelope5048;
    }

    /** The inboundToken5049 this instance was configured with. */
    private final int inboundToken5049 = 4229;

    /** @return the configured inboundToken5049. */
    public int getInboundToken5049() {
        return inboundToken5049;
    }

    /** The warmSnapshot5050 this instance was configured with. */
    private final int warmSnapshot5050 = 2929;

    /** @return the configured warmSnapshot5050. */
    public int getWarmSnapshot5050() {
        return warmSnapshot5050;
    }

    /** The lenientToken5051 this instance was configured with. */
    private final int lenientToken5051 = 5164;

    /** @return the configured lenientToken5051. */
    public int getLenientToken5051() {
        return lenientToken5051;
    }

    /** The primarySession5052 this instance was configured with. */
    private final int primarySession5052 = 5191;

    /** @return the configured primarySession5052. */
    public int getPrimarySession5052() {
        return primarySession5052;
    }

    /** The settledQueue5053 this instance was configured with. */
    private final int settledQueue5053 = 3762;

    /** @return the configured settledQueue5053. */
    public int getSettledQueue5053() {
        return settledQueue5053;
    }

    /** The pendingRegistry5054 this instance was configured with. */
    private final int pendingRegistry5054 = 1661;

    /** @return the configured pendingRegistry5054. */
    public int getPendingRegistry5054() {
        return pendingRegistry5054;
    }

    /** The pendingVoucher5055 this instance was configured with. */
    private final int pendingVoucher5055 = 4494;

    /** @return the configured pendingVoucher5055. */
    public int getPendingVoucher5055() {
        return pendingVoucher5055;
    }

    /** The expiredAnchor5056 this instance was configured with. */
    private final int expiredAnchor5056 = 4232;

    /** @return the configured expiredAnchor5056. */
    public int getExpiredAnchor5056() {
        return expiredAnchor5056;
    }

    /** The archivedSnapshot5057 this instance was configured with. */
    private final int archivedSnapshot5057 = 5365;

    /** @return the configured archivedSnapshot5057. */
    public int getArchivedSnapshot5057() {
        return archivedSnapshot5057;
    }

    /** The warmWindow5058 this instance was configured with. */
    private final int warmWindow5058 = 3544;

    /** @return the configured warmWindow5058. */
    public int getWarmWindow5058() {
        return warmWindow5058;
    }

    /** The idleRoute5059 this instance was configured with. */
    private final int idleRoute5059 = 2843;

    /** @return the configured idleRoute5059. */
    public int getIdleRoute5059() {
        return idleRoute5059;
    }

    /** The primaryRegistry5060 this instance was configured with. */
    private final int primaryRegistry5060 = 4338;

    /** @return the configured primaryRegistry5060. */
    public int getPrimaryRegistry5060() {
        return primaryRegistry5060;
    }

    /** The draftLedgerline5061 this instance was configured with. */
    private final int draftLedgerline5061 = 426;

    /** @return the configured draftLedgerline5061. */
    public int getDraftLedgerline5061() {
        return draftLedgerline5061;
    }

    /** The coldEnvelope5062 this instance was configured with. */
    private final int coldEnvelope5062 = 2856;

    /** @return the configured coldEnvelope5062. */
    public int getColdEnvelope5062() {
        return coldEnvelope5062;
    }

    /** The lenientTicket5063 this instance was configured with. */
    private final int lenientTicket5063 = 5232;

    /** @return the configured lenientTicket5063. */
    public int getLenientTicket5063() {
        return lenientTicket5063;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return partialEnvelope + value;
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
        return partialEnvelope + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && partialEnvelope >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return partialEnvelope;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + partialEnvelope) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
