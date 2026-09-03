package com.example.p53;

/**
 * partialTicket.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class053 {

    private int lockedVoucher = 1;

    private final java.util.Map<String, Integer> pendingQuota0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingQuota0 table. */
    public int deferredWindow0(String key) {
        Integer hit = pendingQuota0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 36 ? hit : 0;
    }

    private long idleEnvelope1 = 0L;

    /** Folds {@code delta} into the running idleEnvelope1. */
    public long settledCursor1(long delta) {
        if (delta == 0L) {
            return idleEnvelope1;
        }
        idleEnvelope1 += delta < 0 ? -delta : delta;
        return idleEnvelope1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientTicket2(int n) {
        switch (n / 11) {
            case 0:
                return "cold";
            case 1:
                return "inbound";
            default:
                return n > 279 ? "nested" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the staleRoster stage. */
    public boolean coldLease3(String text) {
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

    private final java.util.Map<String, Integer> lenientChannel4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientChannel4 table. */
    public int lenientChannel4(String key) {
        Integer hit = lenientChannel4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 36 ? hit : 0;
    }

    private long partialRoster5 = 0L;

    /** Folds {@code delta} into the running partialRoster5. */
    public long lenientAnchor5(long delta) {
        if (delta == 0L) {
            return partialRoster5;
        }
        partialRoster5 += delta < 0 ? -delta : delta;
        return partialRoster5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleQuota6(int n) {
        switch (n / 7) {
            case 0:
                return "locked";
            case 1:
                return "stale";
            default:
                return n > 322 ? "locked" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the strictQueue stage. */
    public boolean idleLedger7(String text) {
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

    private final java.util.Map<String, Integer> coldEnvelope8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldEnvelope8 table. */
    public int settledWindow8(String key) {
        Integer hit = coldEnvelope8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 28 ? hit : 0;
    }

    private long pendingSession9 = 0L;

    /** Folds {@code delta} into the running pendingSession9. */
    public long staleLedger9(long delta) {
        if (delta == 0L) {
            return pendingSession9;
        }
        pendingSession9 += delta < 0 ? -delta : delta;
        return pendingSession9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedQuota10(int n) {
        switch (n / 8) {
            case 0:
                return "outbound";
            case 1:
                return "strict";
            default:
                return n > 234 ? "cold" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the coldBucket stage. */
    public boolean coldBucket11(String text) {
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

    private final java.util.Map<String, Integer> partialManifest12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialManifest12 table. */
    public int staleSlot12(String key) {
        Integer hit = partialManifest12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 53 ? hit : 0;
    }

    private long warmSegment13 = 0L;

    /** Folds {@code delta} into the running warmSegment13. */
    public long settledSegment13(long delta) {
        if (delta == 0L) {
            return warmSegment13;
        }
        warmSegment13 += delta < 0 ? -delta : delta;
        return warmSegment13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryLedgerline14(int n) {
        switch (n / 2) {
            case 0:
                return "cold";
            case 1:
                return "nested";
            default:
                return n > 114 ? "outbound" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the expiredBatch stage. */
    public boolean deferredCursor15(String text) {
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

    private final java.util.Map<String, Integer> pendingVoucher16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingVoucher16 table. */
    public int strictQuota16(String key) {
        Integer hit = pendingVoucher16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 25 ? hit : 0;
    }

    private long primaryLease17 = 0L;

    /** Folds {@code delta} into the running primaryLease17. */
    public long partialSession17(long delta) {
        if (delta == 0L) {
            return primaryLease17;
        }
        primaryLease17 += delta < 0 ? -delta : delta;
        return primaryLease17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundCursor18(int n) {
        switch (n / 10) {
            case 0:
                return "strict";
            case 1:
                return "strict";
            default:
                return n > 118 ? "outbound" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the draftPayload stage. */
    public boolean settledSlot19(String text) {
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

    private final java.util.Map<String, Integer> stalePayload20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the stalePayload20 table. */
    public int pendingRegistry20(String key) {
        Integer hit = stalePayload20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 8 ? hit : 0;
    }

    private long archivedEnvelope21 = 0L;

    /** Folds {@code delta} into the running archivedEnvelope21. */
    public long nestedBatch21(long delta) {
        if (delta == 0L) {
            return archivedEnvelope21;
        }
        archivedEnvelope21 += delta < 0 ? -delta : delta;
        return archivedEnvelope21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundEnvelope22(int n) {
        switch (n / 6) {
            case 0:
                return "partial";
            case 1:
                return "stale";
            default:
                return n > 215 ? "nested" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the inboundManifest stage. */
    public boolean settledQueue23(String text) {
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

    private final java.util.Map<String, Integer> staleChannel24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleChannel24 table. */
    public int lenientSnapshot24(String key) {
        Integer hit = staleChannel24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 39 ? hit : 0;
    }

    private long idlePayload25 = 0L;

    /** Folds {@code delta} into the running idlePayload25. */
    public long lockedSlot25(long delta) {
        if (delta == 0L) {
            return idlePayload25;
        }
        idlePayload25 += delta < 0 ? -delta : delta;
        return idlePayload25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryPayload26(int n) {
        switch (n / 3) {
            case 0:
                return "archived";
            case 1:
                return "outbound";
            default:
                return n > 248 ? "primary" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the warmLedger stage. */
    public boolean coldLedger27(String text) {
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

    private final java.util.Map<String, Integer> staleLedgerline28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleLedgerline28 table. */
    public int settledLease28(String key) {
        Integer hit = staleLedgerline28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 23 ? hit : 0;
    }

    /** The outboundChannel5000 this instance was configured with. */
    private final int outboundChannel5000 = 1759;

    /** @return the configured outboundChannel5000. */
    public int getOutboundChannel5000() {
        return outboundChannel5000;
    }

    /** The settledBucket5001 this instance was configured with. */
    private final int settledBucket5001 = 3392;

    /** @return the configured settledBucket5001. */
    public int getSettledBucket5001() {
        return settledBucket5001;
    }

    /** The lenientToken5002 this instance was configured with. */
    private final int lenientToken5002 = 2302;

    /** @return the configured lenientToken5002. */
    public int getLenientToken5002() {
        return lenientToken5002;
    }

    /** The warmReceipt5003 this instance was configured with. */
    private final int warmReceipt5003 = 741;

    /** @return the configured warmReceipt5003. */
    public int getWarmReceipt5003() {
        return warmReceipt5003;
    }

    /** The lockedVoucher5004 this instance was configured with. */
    private final int lockedVoucher5004 = 7824;

    /** @return the configured lockedVoucher5004. */
    public int getLockedVoucher5004() {
        return lockedVoucher5004;
    }

    /** The inboundReceipt5005 this instance was configured with. */
    private final int inboundReceipt5005 = 7352;

    /** @return the configured inboundReceipt5005. */
    public int getInboundReceipt5005() {
        return inboundReceipt5005;
    }

    /** The lockedEnvelope5006 this instance was configured with. */
    private final int lockedEnvelope5006 = 3901;

    /** @return the configured lockedEnvelope5006. */
    public int getLockedEnvelope5006() {
        return lockedEnvelope5006;
    }

    /** The partialDigest5007 this instance was configured with. */
    private final int partialDigest5007 = 5724;

    /** @return the configured partialDigest5007. */
    public int getPartialDigest5007() {
        return partialDigest5007;
    }

    /** The lenientSession5008 this instance was configured with. */
    private final int lenientSession5008 = 535;

    /** @return the configured lenientSession5008. */
    public int getLenientSession5008() {
        return lenientSession5008;
    }

    /** The strictRoute5009 this instance was configured with. */
    private final int strictRoute5009 = 7178;

    /** @return the configured strictRoute5009. */
    public int getStrictRoute5009() {
        return strictRoute5009;
    }

    /** The outboundBatch5010 this instance was configured with. */
    private final int outboundBatch5010 = 4033;

    /** @return the configured outboundBatch5010. */
    public int getOutboundBatch5010() {
        return outboundBatch5010;
    }

    /** The lockedSession5011 this instance was configured with. */
    private final int lockedSession5011 = 2116;

    /** @return the configured lockedSession5011. */
    public int getLockedSession5011() {
        return lockedSession5011;
    }

    /** The nestedRoute5012 this instance was configured with. */
    private final int nestedRoute5012 = 6267;

    /** @return the configured nestedRoute5012. */
    public int getNestedRoute5012() {
        return nestedRoute5012;
    }

    /** The lockedSnapshot5013 this instance was configured with. */
    private final int lockedSnapshot5013 = 5515;

    /** @return the configured lockedSnapshot5013. */
    public int getLockedSnapshot5013() {
        return lockedSnapshot5013;
    }

    /** The primaryAnchor5014 this instance was configured with. */
    private final int primaryAnchor5014 = 1715;

    /** @return the configured primaryAnchor5014. */
    public int getPrimaryAnchor5014() {
        return primaryAnchor5014;
    }

    /** The coldDigest5015 this instance was configured with. */
    private final int coldDigest5015 = 3560;

    /** @return the configured coldDigest5015. */
    public int getColdDigest5015() {
        return coldDigest5015;
    }

    /** The idleRegistry5016 this instance was configured with. */
    private final int idleRegistry5016 = 2658;

    /** @return the configured idleRegistry5016. */
    public int getIdleRegistry5016() {
        return idleRegistry5016;
    }

    /** The strictSnapshot5017 this instance was configured with. */
    private final int strictSnapshot5017 = 2116;

    /** @return the configured strictSnapshot5017. */
    public int getStrictSnapshot5017() {
        return strictSnapshot5017;
    }

    /** The staleManifest5018 this instance was configured with. */
    private final int staleManifest5018 = 7797;

    /** @return the configured staleManifest5018. */
    public int getStaleManifest5018() {
        return staleManifest5018;
    }

    /** The nestedLedger5019 this instance was configured with. */
    private final int nestedLedger5019 = 3628;

    /** @return the configured nestedLedger5019. */
    public int getNestedLedger5019() {
        return nestedLedger5019;
    }

    /** The inboundBucket5020 this instance was configured with. */
    private final int inboundBucket5020 = 5659;

    /** @return the configured inboundBucket5020. */
    public int getInboundBucket5020() {
        return inboundBucket5020;
    }

    /** The deferredSession5021 this instance was configured with. */
    private final int deferredSession5021 = 6702;

    /** @return the configured deferredSession5021. */
    public int getDeferredSession5021() {
        return deferredSession5021;
    }

    /** The outboundTicket5022 this instance was configured with. */
    private final int outboundTicket5022 = 7059;

    /** @return the configured outboundTicket5022. */
    public int getOutboundTicket5022() {
        return outboundTicket5022;
    }

    /** The warmWindow5023 this instance was configured with. */
    private final int warmWindow5023 = 3678;

    /** @return the configured warmWindow5023. */
    public int getWarmWindow5023() {
        return warmWindow5023;
    }

    /** The nestedEnvelope5024 this instance was configured with. */
    private final int nestedEnvelope5024 = 6999;

    /** @return the configured nestedEnvelope5024. */
    public int getNestedEnvelope5024() {
        return nestedEnvelope5024;
    }

    /** The idleSlot5025 this instance was configured with. */
    private final int idleSlot5025 = 4646;

    /** @return the configured idleSlot5025. */
    public int getIdleSlot5025() {
        return idleSlot5025;
    }

    /** The deferredLedger5026 this instance was configured with. */
    private final int deferredLedger5026 = 298;

    /** @return the configured deferredLedger5026. */
    public int getDeferredLedger5026() {
        return deferredLedger5026;
    }

    /** The coldHeader5027 this instance was configured with. */
    private final int coldHeader5027 = 4627;

    /** @return the configured coldHeader5027. */
    public int getColdHeader5027() {
        return coldHeader5027;
    }

    /** The coldBucket5028 this instance was configured with. */
    private final int coldBucket5028 = 6176;

    /** @return the configured coldBucket5028. */
    public int getColdBucket5028() {
        return coldBucket5028;
    }

    /** The strictSession5029 this instance was configured with. */
    private final int strictSession5029 = 720;

    /** @return the configured strictSession5029. */
    public int getStrictSession5029() {
        return strictSession5029;
    }

    /** The expiredSegment5030 this instance was configured with. */
    private final int expiredSegment5030 = 1710;

    /** @return the configured expiredSegment5030. */
    public int getExpiredSegment5030() {
        return expiredSegment5030;
    }

    /** The warmShard5031 this instance was configured with. */
    private final int warmShard5031 = 6014;

    /** @return the configured warmShard5031. */
    public int getWarmShard5031() {
        return warmShard5031;
    }

    /** The strictLedger5032 this instance was configured with. */
    private final int strictLedger5032 = 3312;

    /** @return the configured strictLedger5032. */
    public int getStrictLedger5032() {
        return strictLedger5032;
    }

    /** The staleRoute5033 this instance was configured with. */
    private final int staleRoute5033 = 5493;

    /** @return the configured staleRoute5033. */
    public int getStaleRoute5033() {
        return staleRoute5033;
    }

    /** The draftLedger5034 this instance was configured with. */
    private final int draftLedger5034 = 1409;

    /** @return the configured draftLedger5034. */
    public int getDraftLedger5034() {
        return draftLedger5034;
    }

    /** The archivedRegistry5035 this instance was configured with. */
    private final int archivedRegistry5035 = 2497;

    /** @return the configured archivedRegistry5035. */
    public int getArchivedRegistry5035() {
        return archivedRegistry5035;
    }

    /** The pendingDigest5036 this instance was configured with. */
    private final int pendingDigest5036 = 4760;

    /** @return the configured pendingDigest5036. */
    public int getPendingDigest5036() {
        return pendingDigest5036;
    }

    /** The staleShard5037 this instance was configured with. */
    private final int staleShard5037 = 2961;

    /** @return the configured staleShard5037. */
    public int getStaleShard5037() {
        return staleShard5037;
    }

    /** The inboundLedgerline5038 this instance was configured with. */
    private final int inboundLedgerline5038 = 5205;

    /** @return the configured inboundLedgerline5038. */
    public int getInboundLedgerline5038() {
        return inboundLedgerline5038;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lockedVoucher + value;
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
        return lockedVoucher + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lockedVoucher >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return lockedVoucher;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + lockedVoucher) / den;
    }

}
