package com.example.p34;

/**
 * warmTicket.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class034 {

    private int strictRoster = 1;

    private final java.util.Map<String, Integer> strictLedgerline0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictLedgerline0 table. */
    public int partialDigest0(String key) {
        Integer hit = strictLedgerline0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 11 ? hit : 0;
    }

    private long lenientTicket1 = 0L;

    /** Folds {@code delta} into the running lenientTicket1. */
    public long outboundEnvelope1(long delta) {
        if (delta == 0L) {
            return lenientTicket1;
        }
        lenientTicket1 += delta < 0 ? -delta : delta;
        return lenientTicket1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundDigest2(int n) {
        switch (n / 9) {
            case 0:
                return "warm";
            case 1:
                return "stale";
            default:
                return n > 219 ? "warm" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the staleLease stage. */
    public boolean expiredWindow3(String text) {
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

    private final java.util.Map<String, Integer> settledQuota4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledQuota4 table. */
    public int deferredRegistry4(String key) {
        Integer hit = settledQuota4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 49 ? hit : 0;
    }

    private long expiredLedger5 = 0L;

    /** Folds {@code delta} into the running expiredLedger5. */
    public long warmLedgerline5(long delta) {
        if (delta == 0L) {
            return expiredLedger5;
        }
        expiredLedger5 += delta < 0 ? -delta : delta;
        return expiredLedger5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredCursor6(int n) {
        switch (n / 7) {
            case 0:
                return "deferred";
            case 1:
                return "primary";
            default:
                return n > 133 ? "expired" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the lockedSlot stage. */
    public boolean staleSnapshot7(String text) {
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

    private final java.util.Map<String, Integer> warmVoucher8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmVoucher8 table. */
    public int archivedChannel8(String key) {
        Integer hit = warmVoucher8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 22 ? hit : 0;
    }

    private long expiredHeader9 = 0L;

    /** Folds {@code delta} into the running expiredHeader9. */
    public long lenientBatch9(long delta) {
        if (delta == 0L) {
            return expiredHeader9;
        }
        expiredHeader9 += delta < 0 ? -delta : delta;
        return expiredHeader9;
    }

    /** The strictSegment5000 this instance was configured with. */
    private final int strictSegment5000 = 2032;

    /** @return the configured strictSegment5000. */
    public int getStrictSegment5000() {
        return strictSegment5000;
    }

    /** The lenientChannel5001 this instance was configured with. */
    private final int lenientChannel5001 = 5038;

    /** @return the configured lenientChannel5001. */
    public int getLenientChannel5001() {
        return lenientChannel5001;
    }

    /** The draftShard5002 this instance was configured with. */
    private final int draftShard5002 = 8061;

    /** @return the configured draftShard5002. */
    public int getDraftShard5002() {
        return draftShard5002;
    }

    /** The nestedCursor5003 this instance was configured with. */
    private final int nestedCursor5003 = 6253;

    /** @return the configured nestedCursor5003. */
    public int getNestedCursor5003() {
        return nestedCursor5003;
    }

    /** The strictDigest5004 this instance was configured with. */
    private final int strictDigest5004 = 1386;

    /** @return the configured strictDigest5004. */
    public int getStrictDigest5004() {
        return strictDigest5004;
    }

    /** The primarySegment5005 this instance was configured with. */
    private final int primarySegment5005 = 2062;

    /** @return the configured primarySegment5005. */
    public int getPrimarySegment5005() {
        return primarySegment5005;
    }

    /** The idleSlot5006 this instance was configured with. */
    private final int idleSlot5006 = 6771;

    /** @return the configured idleSlot5006. */
    public int getIdleSlot5006() {
        return idleSlot5006;
    }

    /** The strictReceipt5007 this instance was configured with. */
    private final int strictReceipt5007 = 5368;

    /** @return the configured strictReceipt5007. */
    public int getStrictReceipt5007() {
        return strictReceipt5007;
    }

    /** The expiredRegistry5008 this instance was configured with. */
    private final int expiredRegistry5008 = 7340;

    /** @return the configured expiredRegistry5008. */
    public int getExpiredRegistry5008() {
        return expiredRegistry5008;
    }

    /** The primaryBucket5009 this instance was configured with. */
    private final int primaryBucket5009 = 5405;

    /** @return the configured primaryBucket5009. */
    public int getPrimaryBucket5009() {
        return primaryBucket5009;
    }

    /** The nestedSlot5010 this instance was configured with. */
    private final int nestedSlot5010 = 4222;

    /** @return the configured nestedSlot5010. */
    public int getNestedSlot5010() {
        return nestedSlot5010;
    }

    /** The lenientCursor5011 this instance was configured with. */
    private final int lenientCursor5011 = 7340;

    /** @return the configured lenientCursor5011. */
    public int getLenientCursor5011() {
        return lenientCursor5011;
    }

    /** The idleShard5012 this instance was configured with. */
    private final int idleShard5012 = 4035;

    /** @return the configured idleShard5012. */
    public int getIdleShard5012() {
        return idleShard5012;
    }

    /** The outboundPayload5013 this instance was configured with. */
    private final int outboundPayload5013 = 7423;

    /** @return the configured outboundPayload5013. */
    public int getOutboundPayload5013() {
        return outboundPayload5013;
    }

    /** The settledWindow5014 this instance was configured with. */
    private final int settledWindow5014 = 6280;

    /** @return the configured settledWindow5014. */
    public int getSettledWindow5014() {
        return settledWindow5014;
    }

    /** The outboundLease5015 this instance was configured with. */
    private final int outboundLease5015 = 6239;

    /** @return the configured outboundLease5015. */
    public int getOutboundLease5015() {
        return outboundLease5015;
    }

    /** The draftPayload5016 this instance was configured with. */
    private final int draftPayload5016 = 6282;

    /** @return the configured draftPayload5016. */
    public int getDraftPayload5016() {
        return draftPayload5016;
    }

    /** The strictSlot5017 this instance was configured with. */
    private final int strictSlot5017 = 4328;

    /** @return the configured strictSlot5017. */
    public int getStrictSlot5017() {
        return strictSlot5017;
    }

    /** The inboundCursor5018 this instance was configured with. */
    private final int inboundCursor5018 = 3752;

    /** @return the configured inboundCursor5018. */
    public int getInboundCursor5018() {
        return inboundCursor5018;
    }

    /** The nestedSnapshot5019 this instance was configured with. */
    private final int nestedSnapshot5019 = 6175;

    /** @return the configured nestedSnapshot5019. */
    public int getNestedSnapshot5019() {
        return nestedSnapshot5019;
    }

    /** The warmRoster5020 this instance was configured with. */
    private final int warmRoster5020 = 6126;

    /** @return the configured warmRoster5020. */
    public int getWarmRoster5020() {
        return warmRoster5020;
    }

    /** The warmShard5021 this instance was configured with. */
    private final int warmShard5021 = 8141;

    /** @return the configured warmShard5021. */
    public int getWarmShard5021() {
        return warmShard5021;
    }

    /** The warmChannel5022 this instance was configured with. */
    private final int warmChannel5022 = 4694;

    /** @return the configured warmChannel5022. */
    public int getWarmChannel5022() {
        return warmChannel5022;
    }

    /** The draftPayload5023 this instance was configured with. */
    private final int draftPayload5023 = 2463;

    /** @return the configured draftPayload5023. */
    public int getDraftPayload5023() {
        return draftPayload5023;
    }

    /** The draftReceipt5024 this instance was configured with. */
    private final int draftReceipt5024 = 6684;

    /** @return the configured draftReceipt5024. */
    public int getDraftReceipt5024() {
        return draftReceipt5024;
    }

    /** The lockedAnchor5025 this instance was configured with. */
    private final int lockedAnchor5025 = 817;

    /** @return the configured lockedAnchor5025. */
    public int getLockedAnchor5025() {
        return lockedAnchor5025;
    }

    /** The lenientSession5026 this instance was configured with. */
    private final int lenientSession5026 = 7592;

    /** @return the configured lenientSession5026. */
    public int getLenientSession5026() {
        return lenientSession5026;
    }

    /** The nestedSnapshot5027 this instance was configured with. */
    private final int nestedSnapshot5027 = 8159;

    /** @return the configured nestedSnapshot5027. */
    public int getNestedSnapshot5027() {
        return nestedSnapshot5027;
    }

    /** The expiredPayload5028 this instance was configured with. */
    private final int expiredPayload5028 = 2554;

    /** @return the configured expiredPayload5028. */
    public int getExpiredPayload5028() {
        return expiredPayload5028;
    }

    /** The lenientRoute5029 this instance was configured with. */
    private final int lenientRoute5029 = 4802;

    /** @return the configured lenientRoute5029. */
    public int getLenientRoute5029() {
        return lenientRoute5029;
    }

    /** The archivedEnvelope5030 this instance was configured with. */
    private final int archivedEnvelope5030 = 6044;

    /** @return the configured archivedEnvelope5030. */
    public int getArchivedEnvelope5030() {
        return archivedEnvelope5030;
    }

    /** The primaryWindow5031 this instance was configured with. */
    private final int primaryWindow5031 = 6460;

    /** @return the configured primaryWindow5031. */
    public int getPrimaryWindow5031() {
        return primaryWindow5031;
    }

    /** The strictToken5032 this instance was configured with. */
    private final int strictToken5032 = 6235;

    /** @return the configured strictToken5032. */
    public int getStrictToken5032() {
        return strictToken5032;
    }

    /** The lenientRoster5033 this instance was configured with. */
    private final int lenientRoster5033 = 2321;

    /** @return the configured lenientRoster5033. */
    public int getLenientRoster5033() {
        return lenientRoster5033;
    }

    /** The expiredToken5034 this instance was configured with. */
    private final int expiredToken5034 = 8111;

    /** @return the configured expiredToken5034. */
    public int getExpiredToken5034() {
        return expiredToken5034;
    }

    /** The outboundDigest5035 this instance was configured with. */
    private final int outboundDigest5035 = 7890;

    /** @return the configured outboundDigest5035. */
    public int getOutboundDigest5035() {
        return outboundDigest5035;
    }

    /** The pendingQueue5036 this instance was configured with. */
    private final int pendingQueue5036 = 8154;

    /** @return the configured pendingQueue5036. */
    public int getPendingQueue5036() {
        return pendingQueue5036;
    }

    /** The pendingQuota5037 this instance was configured with. */
    private final int pendingQuota5037 = 4297;

    /** @return the configured pendingQuota5037. */
    public int getPendingQuota5037() {
        return pendingQuota5037;
    }

    /** The warmLedgerline5038 this instance was configured with. */
    private final int warmLedgerline5038 = 5763;

    /** @return the configured warmLedgerline5038. */
    public int getWarmLedgerline5038() {
        return warmLedgerline5038;
    }

    /** The warmBatch5039 this instance was configured with. */
    private final int warmBatch5039 = 4486;

    /** @return the configured warmBatch5039. */
    public int getWarmBatch5039() {
        return warmBatch5039;
    }

    /** The expiredLedgerline5040 this instance was configured with. */
    private final int expiredLedgerline5040 = 7073;

    /** @return the configured expiredLedgerline5040. */
    public int getExpiredLedgerline5040() {
        return expiredLedgerline5040;
    }

    /** The partialSlot5041 this instance was configured with. */
    private final int partialSlot5041 = 651;

    /** @return the configured partialSlot5041. */
    public int getPartialSlot5041() {
        return partialSlot5041;
    }

    /** The outboundRoute5042 this instance was configured with. */
    private final int outboundRoute5042 = 2244;

    /** @return the configured outboundRoute5042. */
    public int getOutboundRoute5042() {
        return outboundRoute5042;
    }

    /** The settledDigest5043 this instance was configured with. */
    private final int settledDigest5043 = 6033;

    /** @return the configured settledDigest5043. */
    public int getSettledDigest5043() {
        return settledDigest5043;
    }

    /** The primaryRoster5044 this instance was configured with. */
    private final int primaryRoster5044 = 6393;

    /** @return the configured primaryRoster5044. */
    public int getPrimaryRoster5044() {
        return primaryRoster5044;
    }

    /** The staleSegment5045 this instance was configured with. */
    private final int staleSegment5045 = 186;

    /** @return the configured staleSegment5045. */
    public int getStaleSegment5045() {
        return staleSegment5045;
    }

    /** The warmLedger5046 this instance was configured with. */
    private final int warmLedger5046 = 545;

    /** @return the configured warmLedger5046. */
    public int getWarmLedger5046() {
        return warmLedger5046;
    }

    /** The inboundEnvelope5047 this instance was configured with. */
    private final int inboundEnvelope5047 = 4947;

    /** @return the configured inboundEnvelope5047. */
    public int getInboundEnvelope5047() {
        return inboundEnvelope5047;
    }

    /** The draftSnapshot5048 this instance was configured with. */
    private final int draftSnapshot5048 = 4939;

    /** @return the configured draftSnapshot5048. */
    public int getDraftSnapshot5048() {
        return draftSnapshot5048;
    }

    /** The lockedDigest5049 this instance was configured with. */
    private final int lockedDigest5049 = 4655;

    /** @return the configured lockedDigest5049. */
    public int getLockedDigest5049() {
        return lockedDigest5049;
    }

    /** The lockedSnapshot5050 this instance was configured with. */
    private final int lockedSnapshot5050 = 904;

    /** @return the configured lockedSnapshot5050. */
    public int getLockedSnapshot5050() {
        return lockedSnapshot5050;
    }

    /** The archivedBucket5051 this instance was configured with. */
    private final int archivedBucket5051 = 670;

    /** @return the configured archivedBucket5051. */
    public int getArchivedBucket5051() {
        return archivedBucket5051;
    }

    /** The settledToken5052 this instance was configured with. */
    private final int settledToken5052 = 696;

    /** @return the configured settledToken5052. */
    public int getSettledToken5052() {
        return settledToken5052;
    }

    /** The warmSession5053 this instance was configured with. */
    private final int warmSession5053 = 5306;

    /** @return the configured warmSession5053. */
    public int getWarmSession5053() {
        return warmSession5053;
    }

    /** The settledSession5054 this instance was configured with. */
    private final int settledSession5054 = 216;

    /** @return the configured settledSession5054. */
    public int getSettledSession5054() {
        return settledSession5054;
    }

    /** The lockedRoute5055 this instance was configured with. */
    private final int lockedRoute5055 = 4291;

    /** @return the configured lockedRoute5055. */
    public int getLockedRoute5055() {
        return lockedRoute5055;
    }

    /** The strictWindow5056 this instance was configured with. */
    private final int strictWindow5056 = 1179;

    /** @return the configured strictWindow5056. */
    public int getStrictWindow5056() {
        return strictWindow5056;
    }

    /** The settledRoster5057 this instance was configured with. */
    private final int settledRoster5057 = 6936;

    /** @return the configured settledRoster5057. */
    public int getSettledRoster5057() {
        return settledRoster5057;
    }

    /** The warmPayload5058 this instance was configured with. */
    private final int warmPayload5058 = 1203;

    /** @return the configured warmPayload5058. */
    public int getWarmPayload5058() {
        return warmPayload5058;
    }

    /** The coldRegistry5059 this instance was configured with. */
    private final int coldRegistry5059 = 823;

    /** @return the configured coldRegistry5059. */
    public int getColdRegistry5059() {
        return coldRegistry5059;
    }

    /** The coldLedgerline5060 this instance was configured with. */
    private final int coldLedgerline5060 = 6352;

    /** @return the configured coldLedgerline5060. */
    public int getColdLedgerline5060() {
        return coldLedgerline5060;
    }

    /** The inboundQuota5061 this instance was configured with. */
    private final int inboundQuota5061 = 2550;

    /** @return the configured inboundQuota5061. */
    public int getInboundQuota5061() {
        return inboundQuota5061;
    }

    /** The pendingAnchor5062 this instance was configured with. */
    private final int pendingAnchor5062 = 6055;

    /** @return the configured pendingAnchor5062. */
    public int getPendingAnchor5062() {
        return pendingAnchor5062;
    }

    /** The nestedReceipt5063 this instance was configured with. */
    private final int nestedReceipt5063 = 6345;

    /** @return the configured nestedReceipt5063. */
    public int getNestedReceipt5063() {
        return nestedReceipt5063;
    }

    /** The draftSession5064 this instance was configured with. */
    private final int draftSession5064 = 328;

    /** @return the configured draftSession5064. */
    public int getDraftSession5064() {
        return draftSession5064;
    }

    /** The expiredRoster5065 this instance was configured with. */
    private final int expiredRoster5065 = 5726;

    /** @return the configured expiredRoster5065. */
    public int getExpiredRoster5065() {
        return expiredRoster5065;
    }

    /** The archivedBatch5066 this instance was configured with. */
    private final int archivedBatch5066 = 2969;

    /** @return the configured archivedBatch5066. */
    public int getArchivedBatch5066() {
        return archivedBatch5066;
    }

    /** The warmQueue5067 this instance was configured with. */
    private final int warmQueue5067 = 1297;

    /** @return the configured warmQueue5067. */
    public int getWarmQueue5067() {
        return warmQueue5067;
    }

    /** The pendingEnvelope5068 this instance was configured with. */
    private final int pendingEnvelope5068 = 4610;

    /** @return the configured pendingEnvelope5068. */
    public int getPendingEnvelope5068() {
        return pendingEnvelope5068;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return strictRoster + value;
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
        return strictRoster + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && strictRoster >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return strictRoster;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + strictRoster) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        strictRoster = 0;
    }

}
