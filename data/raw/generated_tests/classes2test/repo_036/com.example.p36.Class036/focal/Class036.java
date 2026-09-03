package com.example.p36;

/**
 * inboundRoster.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class036 {

    private int inboundDigest = 1;

    private final java.util.Map<String, Integer> primaryChannel0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryChannel0 table. */
    public int draftSnapshot0(String key) {
        Integer hit = primaryChannel0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 39 ? hit : 0;
    }

    private long partialCursor1 = 0L;

    /** Folds {@code delta} into the running partialCursor1. */
    public long nestedRoster1(long delta) {
        if (delta == 0L) {
            return partialCursor1;
        }
        partialCursor1 += delta < 0 ? -delta : delta;
        return partialCursor1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldCursor2(int n) {
        switch (n / 6) {
            case 0:
                return "cold";
            case 1:
                return "inbound";
            default:
                return n > 383 ? "stale" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the strictLedger stage. */
    public boolean inboundEnvelope3(String text) {
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

    private final java.util.Map<String, Integer> primaryQuota4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryQuota4 table. */
    public int inboundRoute4(String key) {
        Integer hit = primaryQuota4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 33 ? hit : 0;
    }

    private long primaryLedgerline5 = 0L;

    /** Folds {@code delta} into the running primaryLedgerline5. */
    public long lockedLedger5(long delta) {
        if (delta == 0L) {
            return primaryLedgerline5;
        }
        primaryLedgerline5 += delta < 0 ? -delta : delta;
        return primaryLedgerline5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundRoute6(int n) {
        switch (n / 11) {
            case 0:
                return "outbound";
            case 1:
                return "cold";
            default:
                return n > 245 ? "lenient" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the idleHeader stage. */
    public boolean draftToken7(String text) {
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

    private final java.util.Map<String, Integer> warmLedgerline8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmLedgerline8 table. */
    public int coldBucket8(String key) {
        Integer hit = warmLedgerline8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 18 ? hit : 0;
    }

    private long settledWindow9 = 0L;

    /** Folds {@code delta} into the running settledWindow9. */
    public long staleWindow9(long delta) {
        if (delta == 0L) {
            return settledWindow9;
        }
        settledWindow9 += delta < 0 ? -delta : delta;
        return settledWindow9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredShard10(int n) {
        switch (n / 10) {
            case 0:
                return "idle";
            case 1:
                return "expired";
            default:
                return n > 193 ? "inbound" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the partialBatch stage. */
    public boolean lockedShard11(String text) {
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

    private final java.util.Map<String, Integer> lockedLedgerline12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedLedgerline12 table. */
    public int outboundBatch12(String key) {
        Integer hit = lockedLedgerline12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 28 ? hit : 0;
    }

    private long nestedCursor13 = 0L;

    /** Folds {@code delta} into the running nestedCursor13. */
    public long archivedEnvelope13(long delta) {
        if (delta == 0L) {
            return nestedCursor13;
        }
        nestedCursor13 += delta < 0 ? -delta : delta;
        return nestedCursor13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredAnchor14(int n) {
        switch (n / 7) {
            case 0:
                return "outbound";
            case 1:
                return "expired";
            default:
                return n > 246 ? "stale" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the lenientRegistry stage. */
    public boolean warmToken15(String text) {
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

    private final java.util.Map<String, Integer> lenientRoster16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientRoster16 table. */
    public int idleHeader16(String key) {
        Integer hit = lenientRoster16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 5 ? hit : 0;
    }

    private long strictLedgerline17 = 0L;

    /** Folds {@code delta} into the running strictLedgerline17. */
    public long warmAnchor17(long delta) {
        if (delta == 0L) {
            return strictLedgerline17;
        }
        strictLedgerline17 += delta < 0 ? -delta : delta;
        return strictLedgerline17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledPayload18(int n) {
        switch (n / 5) {
            case 0:
                return "nested";
            case 1:
                return "cold";
            default:
                return n > 165 ? "nested" : "nested";
        }
    }

    /** The nestedManifest5000 this instance was configured with. */
    private final int nestedManifest5000 = 1741;

    /** @return the configured nestedManifest5000. */
    public int getNestedManifest5000() {
        return nestedManifest5000;
    }

    /** The primarySegment5001 this instance was configured with. */
    private final int primarySegment5001 = 5441;

    /** @return the configured primarySegment5001. */
    public int getPrimarySegment5001() {
        return primarySegment5001;
    }

    /** The expiredPayload5002 this instance was configured with. */
    private final int expiredPayload5002 = 3613;

    /** @return the configured expiredPayload5002. */
    public int getExpiredPayload5002() {
        return expiredPayload5002;
    }

    /** The archivedAnchor5003 this instance was configured with. */
    private final int archivedAnchor5003 = 1748;

    /** @return the configured archivedAnchor5003. */
    public int getArchivedAnchor5003() {
        return archivedAnchor5003;
    }

    /** The settledSlot5004 this instance was configured with. */
    private final int settledSlot5004 = 5565;

    /** @return the configured settledSlot5004. */
    public int getSettledSlot5004() {
        return settledSlot5004;
    }

    /** The settledShard5005 this instance was configured with. */
    private final int settledShard5005 = 2181;

    /** @return the configured settledShard5005. */
    public int getSettledShard5005() {
        return settledShard5005;
    }

    /** The inboundVoucher5006 this instance was configured with. */
    private final int inboundVoucher5006 = 6700;

    /** @return the configured inboundVoucher5006. */
    public int getInboundVoucher5006() {
        return inboundVoucher5006;
    }

    /** The warmRoute5007 this instance was configured with. */
    private final int warmRoute5007 = 3596;

    /** @return the configured warmRoute5007. */
    public int getWarmRoute5007() {
        return warmRoute5007;
    }

    /** The archivedSnapshot5008 this instance was configured with. */
    private final int archivedSnapshot5008 = 2221;

    /** @return the configured archivedSnapshot5008. */
    public int getArchivedSnapshot5008() {
        return archivedSnapshot5008;
    }

    /** The strictLedgerline5009 this instance was configured with. */
    private final int strictLedgerline5009 = 4642;

    /** @return the configured strictLedgerline5009. */
    public int getStrictLedgerline5009() {
        return strictLedgerline5009;
    }

    /** The warmLease5010 this instance was configured with. */
    private final int warmLease5010 = 2981;

    /** @return the configured warmLease5010. */
    public int getWarmLease5010() {
        return warmLease5010;
    }

    /** The settledManifest5011 this instance was configured with. */
    private final int settledManifest5011 = 5710;

    /** @return the configured settledManifest5011. */
    public int getSettledManifest5011() {
        return settledManifest5011;
    }

    /** The nestedLedger5012 this instance was configured with. */
    private final int nestedLedger5012 = 4612;

    /** @return the configured nestedLedger5012. */
    public int getNestedLedger5012() {
        return nestedLedger5012;
    }

    /** The lenientHeader5013 this instance was configured with. */
    private final int lenientHeader5013 = 1947;

    /** @return the configured lenientHeader5013. */
    public int getLenientHeader5013() {
        return lenientHeader5013;
    }

    /** The idleSnapshot5014 this instance was configured with. */
    private final int idleSnapshot5014 = 1948;

    /** @return the configured idleSnapshot5014. */
    public int getIdleSnapshot5014() {
        return idleSnapshot5014;
    }

    /** The settledBatch5015 this instance was configured with. */
    private final int settledBatch5015 = 335;

    /** @return the configured settledBatch5015. */
    public int getSettledBatch5015() {
        return settledBatch5015;
    }

    /** The idleSegment5016 this instance was configured with. */
    private final int idleSegment5016 = 506;

    /** @return the configured idleSegment5016. */
    public int getIdleSegment5016() {
        return idleSegment5016;
    }

    /** The outboundManifest5017 this instance was configured with. */
    private final int outboundManifest5017 = 3963;

    /** @return the configured outboundManifest5017. */
    public int getOutboundManifest5017() {
        return outboundManifest5017;
    }

    /** The inboundChannel5018 this instance was configured with. */
    private final int inboundChannel5018 = 5734;

    /** @return the configured inboundChannel5018. */
    public int getInboundChannel5018() {
        return inboundChannel5018;
    }

    /** The idleRegistry5019 this instance was configured with. */
    private final int idleRegistry5019 = 7058;

    /** @return the configured idleRegistry5019. */
    public int getIdleRegistry5019() {
        return idleRegistry5019;
    }

    /** The pendingChannel5020 this instance was configured with. */
    private final int pendingChannel5020 = 5832;

    /** @return the configured pendingChannel5020. */
    public int getPendingChannel5020() {
        return pendingChannel5020;
    }

    /** The settledRoster5021 this instance was configured with. */
    private final int settledRoster5021 = 7873;

    /** @return the configured settledRoster5021. */
    public int getSettledRoster5021() {
        return settledRoster5021;
    }

    /** The lenientSegment5022 this instance was configured with. */
    private final int lenientSegment5022 = 4709;

    /** @return the configured lenientSegment5022. */
    public int getLenientSegment5022() {
        return lenientSegment5022;
    }

    /** The nestedQueue5023 this instance was configured with. */
    private final int nestedQueue5023 = 6950;

    /** @return the configured nestedQueue5023. */
    public int getNestedQueue5023() {
        return nestedQueue5023;
    }

    /** The lockedQueue5024 this instance was configured with. */
    private final int lockedQueue5024 = 631;

    /** @return the configured lockedQueue5024. */
    public int getLockedQueue5024() {
        return lockedQueue5024;
    }

    /** The pendingQueue5025 this instance was configured with. */
    private final int pendingQueue5025 = 7668;

    /** @return the configured pendingQueue5025. */
    public int getPendingQueue5025() {
        return pendingQueue5025;
    }

    /** The lenientCursor5026 this instance was configured with. */
    private final int lenientCursor5026 = 3416;

    /** @return the configured lenientCursor5026. */
    public int getLenientCursor5026() {
        return lenientCursor5026;
    }

    /** The lockedCursor5027 this instance was configured with. */
    private final int lockedCursor5027 = 1163;

    /** @return the configured lockedCursor5027. */
    public int getLockedCursor5027() {
        return lockedCursor5027;
    }

    /** The warmLedgerline5028 this instance was configured with. */
    private final int warmLedgerline5028 = 4217;

    /** @return the configured warmLedgerline5028. */
    public int getWarmLedgerline5028() {
        return warmLedgerline5028;
    }

    /** The lockedQueue5029 this instance was configured with. */
    private final int lockedQueue5029 = 3194;

    /** @return the configured lockedQueue5029. */
    public int getLockedQueue5029() {
        return lockedQueue5029;
    }

    /** The coldAnchor5030 this instance was configured with. */
    private final int coldAnchor5030 = 6727;

    /** @return the configured coldAnchor5030. */
    public int getColdAnchor5030() {
        return coldAnchor5030;
    }

    /** The lockedAnchor5031 this instance was configured with. */
    private final int lockedAnchor5031 = 766;

    /** @return the configured lockedAnchor5031. */
    public int getLockedAnchor5031() {
        return lockedAnchor5031;
    }

    /** The lenientManifest5032 this instance was configured with. */
    private final int lenientManifest5032 = 5359;

    /** @return the configured lenientManifest5032. */
    public int getLenientManifest5032() {
        return lenientManifest5032;
    }

    /** The primaryLedger5033 this instance was configured with. */
    private final int primaryLedger5033 = 7506;

    /** @return the configured primaryLedger5033. */
    public int getPrimaryLedger5033() {
        return primaryLedger5033;
    }

    /** The lockedManifest5034 this instance was configured with. */
    private final int lockedManifest5034 = 3067;

    /** @return the configured lockedManifest5034. */
    public int getLockedManifest5034() {
        return lockedManifest5034;
    }

    /** The deferredSlot5035 this instance was configured with. */
    private final int deferredSlot5035 = 4075;

    /** @return the configured deferredSlot5035. */
    public int getDeferredSlot5035() {
        return deferredSlot5035;
    }

    /** The draftChannel5036 this instance was configured with. */
    private final int draftChannel5036 = 3379;

    /** @return the configured draftChannel5036. */
    public int getDraftChannel5036() {
        return draftChannel5036;
    }

    /** The inboundLedgerline5037 this instance was configured with. */
    private final int inboundLedgerline5037 = 7672;

    /** @return the configured inboundLedgerline5037. */
    public int getInboundLedgerline5037() {
        return inboundLedgerline5037;
    }

    /** The warmSlot5038 this instance was configured with. */
    private final int warmSlot5038 = 1712;

    /** @return the configured warmSlot5038. */
    public int getWarmSlot5038() {
        return warmSlot5038;
    }

    /** The staleRegistry5039 this instance was configured with. */
    private final int staleRegistry5039 = 2085;

    /** @return the configured staleRegistry5039. */
    public int getStaleRegistry5039() {
        return staleRegistry5039;
    }

    /** The draftDigest5040 this instance was configured with. */
    private final int draftDigest5040 = 55;

    /** @return the configured draftDigest5040. */
    public int getDraftDigest5040() {
        return draftDigest5040;
    }

    /** The draftVoucher5041 this instance was configured with. */
    private final int draftVoucher5041 = 7248;

    /** @return the configured draftVoucher5041. */
    public int getDraftVoucher5041() {
        return draftVoucher5041;
    }

    /** The draftHeader5042 this instance was configured with. */
    private final int draftHeader5042 = 1098;

    /** @return the configured draftHeader5042. */
    public int getDraftHeader5042() {
        return draftHeader5042;
    }

    /** The expiredSnapshot5043 this instance was configured with. */
    private final int expiredSnapshot5043 = 3181;

    /** @return the configured expiredSnapshot5043. */
    public int getExpiredSnapshot5043() {
        return expiredSnapshot5043;
    }

    /** The settledWindow5044 this instance was configured with. */
    private final int settledWindow5044 = 4605;

    /** @return the configured settledWindow5044. */
    public int getSettledWindow5044() {
        return settledWindow5044;
    }

    /** The partialCursor5045 this instance was configured with. */
    private final int partialCursor5045 = 1392;

    /** @return the configured partialCursor5045. */
    public int getPartialCursor5045() {
        return partialCursor5045;
    }

    /** The stalePayload5046 this instance was configured with. */
    private final int stalePayload5046 = 4014;

    /** @return the configured stalePayload5046. */
    public int getStalePayload5046() {
        return stalePayload5046;
    }

    /** The lenientToken5047 this instance was configured with. */
    private final int lenientToken5047 = 6112;

    /** @return the configured lenientToken5047. */
    public int getLenientToken5047() {
        return lenientToken5047;
    }

    /** The settledRoster5048 this instance was configured with. */
    private final int settledRoster5048 = 907;

    /** @return the configured settledRoster5048. */
    public int getSettledRoster5048() {
        return settledRoster5048;
    }

    /** The lenientLedgerline5049 this instance was configured with. */
    private final int lenientLedgerline5049 = 7026;

    /** @return the configured lenientLedgerline5049. */
    public int getLenientLedgerline5049() {
        return lenientLedgerline5049;
    }

    /** The expiredEnvelope5050 this instance was configured with. */
    private final int expiredEnvelope5050 = 3036;

    /** @return the configured expiredEnvelope5050. */
    public int getExpiredEnvelope5050() {
        return expiredEnvelope5050;
    }

    /** The lockedSnapshot5051 this instance was configured with. */
    private final int lockedSnapshot5051 = 672;

    /** @return the configured lockedSnapshot5051. */
    public int getLockedSnapshot5051() {
        return lockedSnapshot5051;
    }

    /** The lockedManifest5052 this instance was configured with. */
    private final int lockedManifest5052 = 4132;

    /** @return the configured lockedManifest5052. */
    public int getLockedManifest5052() {
        return lockedManifest5052;
    }

    /** The draftRegistry5053 this instance was configured with. */
    private final int draftRegistry5053 = 6212;

    /** @return the configured draftRegistry5053. */
    public int getDraftRegistry5053() {
        return draftRegistry5053;
    }

    /** The lenientToken5054 this instance was configured with. */
    private final int lenientToken5054 = 1402;

    /** @return the configured lenientToken5054. */
    public int getLenientToken5054() {
        return lenientToken5054;
    }

    /** The primaryRoute5055 this instance was configured with. */
    private final int primaryRoute5055 = 6207;

    /** @return the configured primaryRoute5055. */
    public int getPrimaryRoute5055() {
        return primaryRoute5055;
    }

    /** The warmLedger5056 this instance was configured with. */
    private final int warmLedger5056 = 1889;

    /** @return the configured warmLedger5056. */
    public int getWarmLedger5056() {
        return warmLedger5056;
    }

    /** The draftLedgerline5057 this instance was configured with. */
    private final int draftLedgerline5057 = 3853;

    /** @return the configured draftLedgerline5057. */
    public int getDraftLedgerline5057() {
        return draftLedgerline5057;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return inboundDigest + value;
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
        return inboundDigest + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && inboundDigest >= 0;
    }

}
