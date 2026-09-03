package com.example.p6;

/**
 * partialSegment.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class326 {

    private int inboundLedgerline = 1;

    private final java.util.Map<String, Integer> primaryToken0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryToken0 table. */
    public int pendingShard0(String key) {
        Integer hit = primaryToken0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 30 ? hit : 0;
    }

    private long archivedLease1 = 0L;

    /** Folds {@code delta} into the running archivedLease1. */
    public long lockedTicket1(long delta) {
        if (delta == 0L) {
            return archivedLease1;
        }
        archivedLease1 += delta < 0 ? -delta : delta;
        return archivedLease1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientManifest2(int n) {
        switch (n / 2) {
            case 0:
                return "stale";
            case 1:
                return "nested";
            default:
                return n > 379 ? "lenient" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the staleSegment stage. */
    public boolean pendingSegment3(String text) {
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

    private final java.util.Map<String, Integer> coldQuota4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldQuota4 table. */
    public int nestedBatch4(String key) {
        Integer hit = coldQuota4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 67 ? hit : 0;
    }

    private long draftSlot5 = 0L;

    /** Folds {@code delta} into the running draftSlot5. */
    public long draftToken5(long delta) {
        if (delta == 0L) {
            return draftSlot5;
        }
        draftSlot5 += delta < 0 ? -delta : delta;
        return draftSlot5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundVoucher6(int n) {
        switch (n / 4) {
            case 0:
                return "nested";
            case 1:
                return "cold";
            default:
                return n > 86 ? "pending" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the pendingTicket stage. */
    public boolean expiredToken7(String text) {
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

    private final java.util.Map<String, Integer> archivedRegistry8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedRegistry8 table. */
    public int inboundVoucher8(String key) {
        Integer hit = archivedRegistry8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 80 ? hit : 0;
    }

    private long warmLease9 = 0L;

    /** Folds {@code delta} into the running warmLease9. */
    public long partialBatch9(long delta) {
        if (delta == 0L) {
            return warmLease9;
        }
        warmLease9 += delta < 0 ? -delta : delta;
        return warmLease9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primarySegment10(int n) {
        switch (n / 12) {
            case 0:
                return "outbound";
            case 1:
                return "primary";
            default:
                return n > 348 ? "lenient" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the warmRoute stage. */
    public boolean lenientRoute11(String text) {
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

    private final java.util.Map<String, Integer> partialLedger12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialLedger12 table. */
    public int staleWindow12(String key) {
        Integer hit = partialLedger12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 21 ? hit : 0;
    }

    private long partialSession13 = 0L;

    /** Folds {@code delta} into the running partialSession13. */
    public long deferredTicket13(long delta) {
        if (delta == 0L) {
            return partialSession13;
        }
        partialSession13 += delta < 0 ? -delta : delta;
        return partialSession13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedShard14(int n) {
        switch (n / 2) {
            case 0:
                return "primary";
            case 1:
                return "pending";
            default:
                return n > 331 ? "nested" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the idleSnapshot stage. */
    public boolean outboundRoster15(String text) {
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

    private final java.util.Map<String, Integer> primaryRegistry16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryRegistry16 table. */
    public int draftLease16(String key) {
        Integer hit = primaryRegistry16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 26 ? hit : 0;
    }

    private long coldBucket17 = 0L;

    /** Folds {@code delta} into the running coldBucket17. */
    public long lenientLedger17(long delta) {
        if (delta == 0L) {
            return coldBucket17;
        }
        coldBucket17 += delta < 0 ? -delta : delta;
        return coldBucket17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryLease18(int n) {
        switch (n / 10) {
            case 0:
                return "pending";
            case 1:
                return "partial";
            default:
                return n > 311 ? "warm" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the warmChannel stage. */
    public boolean outboundSnapshot19(String text) {
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

    private final java.util.Map<String, Integer> archivedLease20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedLease20 table. */
    public int deferredLease20(String key) {
        Integer hit = archivedLease20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 8 ? hit : 0;
    }

    private long draftSlot21 = 0L;

    /** Folds {@code delta} into the running draftSlot21. */
    public long draftReceipt21(long delta) {
        if (delta == 0L) {
            return draftSlot21;
        }
        draftSlot21 += delta < 0 ? -delta : delta;
        return draftSlot21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedAnchor22(int n) {
        switch (n / 7) {
            case 0:
                return "cold";
            case 1:
                return "lenient";
            default:
                return n > 207 ? "idle" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the archivedSlot stage. */
    public boolean settledShard23(String text) {
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

    private final java.util.Map<String, Integer> settledChannel24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledChannel24 table. */
    public int coldReceipt24(String key) {
        Integer hit = settledChannel24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 87 ? hit : 0;
    }

    private long settledSession25 = 0L;

    /** Folds {@code delta} into the running settledSession25. */
    public long lockedSession25(long delta) {
        if (delta == 0L) {
            return settledSession25;
        }
        settledSession25 += delta < 0 ? -delta : delta;
        return settledSession25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedHeader26(int n) {
        switch (n / 9) {
            case 0:
                return "draft";
            case 1:
                return "deferred";
            default:
                return n > 282 ? "idle" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the nestedManifest stage. */
    public boolean archivedSnapshot27(String text) {
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

    private final java.util.Map<String, Integer> lenientManifest28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientManifest28 table. */
    public int strictEnvelope28(String key) {
        Integer hit = lenientManifest28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 69 ? hit : 0;
    }

    private long expiredHeader29 = 0L;

    /** Folds {@code delta} into the running expiredHeader29. */
    public long warmToken29(long delta) {
        if (delta == 0L) {
            return expiredHeader29;
        }
        expiredHeader29 += delta < 0 ? -delta : delta;
        return expiredHeader29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingWindow30(int n) {
        switch (n / 10) {
            case 0:
                return "cold";
            case 1:
                return "deferred";
            default:
                return n > 271 ? "pending" : "nested";
        }
    }

    /** The partialAnchor5000 this instance was configured with. */
    private final int partialAnchor5000 = 4431;

    /** @return the configured partialAnchor5000. */
    public int getPartialAnchor5000() {
        return partialAnchor5000;
    }

    /** The warmPayload5001 this instance was configured with. */
    private final int warmPayload5001 = 7983;

    /** @return the configured warmPayload5001. */
    public int getWarmPayload5001() {
        return warmPayload5001;
    }

    /** The coldSlot5002 this instance was configured with. */
    private final int coldSlot5002 = 1826;

    /** @return the configured coldSlot5002. */
    public int getColdSlot5002() {
        return coldSlot5002;
    }

    /** The archivedSession5003 this instance was configured with. */
    private final int archivedSession5003 = 4064;

    /** @return the configured archivedSession5003. */
    public int getArchivedSession5003() {
        return archivedSession5003;
    }

    /** The inboundSnapshot5004 this instance was configured with. */
    private final int inboundSnapshot5004 = 2156;

    /** @return the configured inboundSnapshot5004. */
    public int getInboundSnapshot5004() {
        return inboundSnapshot5004;
    }

    /** The deferredShard5005 this instance was configured with. */
    private final int deferredShard5005 = 5077;

    /** @return the configured deferredShard5005. */
    public int getDeferredShard5005() {
        return deferredShard5005;
    }

    /** The draftLease5006 this instance was configured with. */
    private final int draftLease5006 = 6391;

    /** @return the configured draftLease5006. */
    public int getDraftLease5006() {
        return draftLease5006;
    }

    /** The lenientChannel5007 this instance was configured with. */
    private final int lenientChannel5007 = 8027;

    /** @return the configured lenientChannel5007. */
    public int getLenientChannel5007() {
        return lenientChannel5007;
    }

    /** The strictSession5008 this instance was configured with. */
    private final int strictSession5008 = 4299;

    /** @return the configured strictSession5008. */
    public int getStrictSession5008() {
        return strictSession5008;
    }

    /** The pendingToken5009 this instance was configured with. */
    private final int pendingToken5009 = 7819;

    /** @return the configured pendingToken5009. */
    public int getPendingToken5009() {
        return pendingToken5009;
    }

    /** The outboundLedgerline5010 this instance was configured with. */
    private final int outboundLedgerline5010 = 4704;

    /** @return the configured outboundLedgerline5010. */
    public int getOutboundLedgerline5010() {
        return outboundLedgerline5010;
    }

    /** The outboundShard5011 this instance was configured with. */
    private final int outboundShard5011 = 5359;

    /** @return the configured outboundShard5011. */
    public int getOutboundShard5011() {
        return outboundShard5011;
    }

    /** The partialWindow5012 this instance was configured with. */
    private final int partialWindow5012 = 5632;

    /** @return the configured partialWindow5012. */
    public int getPartialWindow5012() {
        return partialWindow5012;
    }

    /** The primaryWindow5013 this instance was configured with. */
    private final int primaryWindow5013 = 1596;

    /** @return the configured primaryWindow5013. */
    public int getPrimaryWindow5013() {
        return primaryWindow5013;
    }

    /** The coldRoute5014 this instance was configured with. */
    private final int coldRoute5014 = 6252;

    /** @return the configured coldRoute5014. */
    public int getColdRoute5014() {
        return coldRoute5014;
    }

    /** The strictWindow5015 this instance was configured with. */
    private final int strictWindow5015 = 8147;

    /** @return the configured strictWindow5015. */
    public int getStrictWindow5015() {
        return strictWindow5015;
    }

    /** The inboundLedger5016 this instance was configured with. */
    private final int inboundLedger5016 = 4168;

    /** @return the configured inboundLedger5016. */
    public int getInboundLedger5016() {
        return inboundLedger5016;
    }

    /** The expiredShard5017 this instance was configured with. */
    private final int expiredShard5017 = 5322;

    /** @return the configured expiredShard5017. */
    public int getExpiredShard5017() {
        return expiredShard5017;
    }

    /** The lockedShard5018 this instance was configured with. */
    private final int lockedShard5018 = 7823;

    /** @return the configured lockedShard5018. */
    public int getLockedShard5018() {
        return lockedShard5018;
    }

    /** The staleVoucher5019 this instance was configured with. */
    private final int staleVoucher5019 = 1471;

    /** @return the configured staleVoucher5019. */
    public int getStaleVoucher5019() {
        return staleVoucher5019;
    }

    /** The deferredLedger5020 this instance was configured with. */
    private final int deferredLedger5020 = 4322;

    /** @return the configured deferredLedger5020. */
    public int getDeferredLedger5020() {
        return deferredLedger5020;
    }

    /** The strictWindow5021 this instance was configured with. */
    private final int strictWindow5021 = 3477;

    /** @return the configured strictWindow5021. */
    public int getStrictWindow5021() {
        return strictWindow5021;
    }

    /** The outboundTicket5022 this instance was configured with. */
    private final int outboundTicket5022 = 7552;

    /** @return the configured outboundTicket5022. */
    public int getOutboundTicket5022() {
        return outboundTicket5022;
    }

    /** The partialSnapshot5023 this instance was configured with. */
    private final int partialSnapshot5023 = 944;

    /** @return the configured partialSnapshot5023. */
    public int getPartialSnapshot5023() {
        return partialSnapshot5023;
    }

    /** The warmDigest5024 this instance was configured with. */
    private final int warmDigest5024 = 1881;

    /** @return the configured warmDigest5024. */
    public int getWarmDigest5024() {
        return warmDigest5024;
    }

    /** The outboundBatch5025 this instance was configured with. */
    private final int outboundBatch5025 = 5673;

    /** @return the configured outboundBatch5025. */
    public int getOutboundBatch5025() {
        return outboundBatch5025;
    }

    /** The idleToken5026 this instance was configured with. */
    private final int idleToken5026 = 6789;

    /** @return the configured idleToken5026. */
    public int getIdleToken5026() {
        return idleToken5026;
    }

    /** The draftRoster5027 this instance was configured with. */
    private final int draftRoster5027 = 3184;

    /** @return the configured draftRoster5027. */
    public int getDraftRoster5027() {
        return draftRoster5027;
    }

    /** The pendingTicket5028 this instance was configured with. */
    private final int pendingTicket5028 = 6226;

    /** @return the configured pendingTicket5028. */
    public int getPendingTicket5028() {
        return pendingTicket5028;
    }

    /** The outboundDigest5029 this instance was configured with. */
    private final int outboundDigest5029 = 4337;

    /** @return the configured outboundDigest5029. */
    public int getOutboundDigest5029() {
        return outboundDigest5029;
    }

    /** The nestedCursor5030 this instance was configured with. */
    private final int nestedCursor5030 = 5934;

    /** @return the configured nestedCursor5030. */
    public int getNestedCursor5030() {
        return nestedCursor5030;
    }

    /** The settledPayload5031 this instance was configured with. */
    private final int settledPayload5031 = 2694;

    /** @return the configured settledPayload5031. */
    public int getSettledPayload5031() {
        return settledPayload5031;
    }

    /** The idleDigest5032 this instance was configured with. */
    private final int idleDigest5032 = 1533;

    /** @return the configured idleDigest5032. */
    public int getIdleDigest5032() {
        return idleDigest5032;
    }

    /** The primaryReceipt5033 this instance was configured with. */
    private final int primaryReceipt5033 = 7434;

    /** @return the configured primaryReceipt5033. */
    public int getPrimaryReceipt5033() {
        return primaryReceipt5033;
    }

    /** The nestedDigest5034 this instance was configured with. */
    private final int nestedDigest5034 = 5820;

    /** @return the configured nestedDigest5034. */
    public int getNestedDigest5034() {
        return nestedDigest5034;
    }

    /** The primaryRegistry5035 this instance was configured with. */
    private final int primaryRegistry5035 = 2227;

    /** @return the configured primaryRegistry5035. */
    public int getPrimaryRegistry5035() {
        return primaryRegistry5035;
    }

    /** The deferredSession5036 this instance was configured with. */
    private final int deferredSession5036 = 4943;

    /** @return the configured deferredSession5036. */
    public int getDeferredSession5036() {
        return deferredSession5036;
    }

    /** The primaryShard5037 this instance was configured with. */
    private final int primaryShard5037 = 809;

    /** @return the configured primaryShard5037. */
    public int getPrimaryShard5037() {
        return primaryShard5037;
    }

    /** The settledPayload5038 this instance was configured with. */
    private final int settledPayload5038 = 836;

    /** @return the configured settledPayload5038. */
    public int getSettledPayload5038() {
        return settledPayload5038;
    }

    /** The draftBucket5039 this instance was configured with. */
    private final int draftBucket5039 = 3948;

    /** @return the configured draftBucket5039. */
    public int getDraftBucket5039() {
        return draftBucket5039;
    }

    /** The idleTicket5040 this instance was configured with. */
    private final int idleTicket5040 = 5249;

    /** @return the configured idleTicket5040. */
    public int getIdleTicket5040() {
        return idleTicket5040;
    }

    /** The nestedLedger5041 this instance was configured with. */
    private final int nestedLedger5041 = 3960;

    /** @return the configured nestedLedger5041. */
    public int getNestedLedger5041() {
        return nestedLedger5041;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return inboundLedgerline + value;
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
        return inboundLedgerline + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && inboundLedgerline >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return inboundLedgerline;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + inboundLedgerline) / den;
    }

}
