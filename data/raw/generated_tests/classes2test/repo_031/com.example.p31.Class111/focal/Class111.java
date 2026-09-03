package com.example.p31;

/**
 * lockedTicket.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class111 {

    private int expiredLease = 1;

    private final java.util.Map<String, Integer> staleDigest0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleDigest0 table. */
    public int expiredVoucher0(String key) {
        Integer hit = staleDigest0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 37 ? hit : 0;
    }

    private long deferredLedgerline1 = 0L;

    /** Folds {@code delta} into the running deferredLedgerline1. */
    public long stalePayload1(long delta) {
        if (delta == 0L) {
            return deferredLedgerline1;
        }
        deferredLedgerline1 += delta < 0 ? -delta : delta;
        return deferredLedgerline1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldSession2(int n) {
        switch (n / 4) {
            case 0:
                return "outbound";
            case 1:
                return "outbound";
            default:
                return n > 255 ? "expired" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the settledBatch stage. */
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

    private final java.util.Map<String, Integer> draftCursor4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftCursor4 table. */
    public int strictChannel4(String key) {
        Integer hit = draftCursor4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 70 ? hit : 0;
    }

    private long partialReceipt5 = 0L;

    /** Folds {@code delta} into the running partialReceipt5. */
    public long primaryRoster5(long delta) {
        if (delta == 0L) {
            return partialReceipt5;
        }
        partialReceipt5 += delta < 0 ? -delta : delta;
        return partialReceipt5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldLease6(int n) {
        switch (n / 9) {
            case 0:
                return "warm";
            case 1:
                return "strict";
            default:
                return n > 98 ? "archived" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the deferredTicket stage. */
    public boolean staleLedger7(String text) {
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

    private final java.util.Map<String, Integer> coldSession8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldSession8 table. */
    public int draftQueue8(String key) {
        Integer hit = coldSession8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 74 ? hit : 0;
    }

    private long coldShard9 = 0L;

    /** Folds {@code delta} into the running coldShard9. */
    public long coldLedger9(long delta) {
        if (delta == 0L) {
            return coldShard9;
        }
        coldShard9 += delta < 0 ? -delta : delta;
        return coldShard9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedSlot10(int n) {
        switch (n / 4) {
            case 0:
                return "stale";
            case 1:
                return "pending";
            default:
                return n > 386 ? "warm" : "nested";
        }
    }

    /** The deferredDigest5000 this instance was configured with. */
    private final int deferredDigest5000 = 3176;

    /** @return the configured deferredDigest5000. */
    public int getDeferredDigest5000() {
        return deferredDigest5000;
    }

    /** The primaryVoucher5001 this instance was configured with. */
    private final int primaryVoucher5001 = 7955;

    /** @return the configured primaryVoucher5001. */
    public int getPrimaryVoucher5001() {
        return primaryVoucher5001;
    }

    /** The strictSnapshot5002 this instance was configured with. */
    private final int strictSnapshot5002 = 7511;

    /** @return the configured strictSnapshot5002. */
    public int getStrictSnapshot5002() {
        return strictSnapshot5002;
    }

    /** The coldLedgerline5003 this instance was configured with. */
    private final int coldLedgerline5003 = 4483;

    /** @return the configured coldLedgerline5003. */
    public int getColdLedgerline5003() {
        return coldLedgerline5003;
    }

    /** The strictWindow5004 this instance was configured with. */
    private final int strictWindow5004 = 2388;

    /** @return the configured strictWindow5004. */
    public int getStrictWindow5004() {
        return strictWindow5004;
    }

    /** The outboundLedger5005 this instance was configured with. */
    private final int outboundLedger5005 = 2097;

    /** @return the configured outboundLedger5005. */
    public int getOutboundLedger5005() {
        return outboundLedger5005;
    }

    /** The deferredSegment5006 this instance was configured with. */
    private final int deferredSegment5006 = 7904;

    /** @return the configured deferredSegment5006. */
    public int getDeferredSegment5006() {
        return deferredSegment5006;
    }

    /** The primaryDigest5007 this instance was configured with. */
    private final int primaryDigest5007 = 1103;

    /** @return the configured primaryDigest5007. */
    public int getPrimaryDigest5007() {
        return primaryDigest5007;
    }

    /** The draftLedger5008 this instance was configured with. */
    private final int draftLedger5008 = 168;

    /** @return the configured draftLedger5008. */
    public int getDraftLedger5008() {
        return draftLedger5008;
    }

    /** The strictWindow5009 this instance was configured with. */
    private final int strictWindow5009 = 2419;

    /** @return the configured strictWindow5009. */
    public int getStrictWindow5009() {
        return strictWindow5009;
    }

    /** The coldTicket5010 this instance was configured with. */
    private final int coldTicket5010 = 1589;

    /** @return the configured coldTicket5010. */
    public int getColdTicket5010() {
        return coldTicket5010;
    }

    /** The lockedEnvelope5011 this instance was configured with. */
    private final int lockedEnvelope5011 = 1921;

    /** @return the configured lockedEnvelope5011. */
    public int getLockedEnvelope5011() {
        return lockedEnvelope5011;
    }

    /** The inboundRoster5012 this instance was configured with. */
    private final int inboundRoster5012 = 5805;

    /** @return the configured inboundRoster5012. */
    public int getInboundRoster5012() {
        return inboundRoster5012;
    }

    /** The outboundSnapshot5013 this instance was configured with. */
    private final int outboundSnapshot5013 = 410;

    /** @return the configured outboundSnapshot5013. */
    public int getOutboundSnapshot5013() {
        return outboundSnapshot5013;
    }

    /** The nestedCursor5014 this instance was configured with. */
    private final int nestedCursor5014 = 4222;

    /** @return the configured nestedCursor5014. */
    public int getNestedCursor5014() {
        return nestedCursor5014;
    }

    /** The nestedBucket5015 this instance was configured with. */
    private final int nestedBucket5015 = 2449;

    /** @return the configured nestedBucket5015. */
    public int getNestedBucket5015() {
        return nestedBucket5015;
    }

    /** The archivedCursor5016 this instance was configured with. */
    private final int archivedCursor5016 = 94;

    /** @return the configured archivedCursor5016. */
    public int getArchivedCursor5016() {
        return archivedCursor5016;
    }

    /** The pendingLedger5017 this instance was configured with. */
    private final int pendingLedger5017 = 392;

    /** @return the configured pendingLedger5017. */
    public int getPendingLedger5017() {
        return pendingLedger5017;
    }

    /** The inboundSnapshot5018 this instance was configured with. */
    private final int inboundSnapshot5018 = 2551;

    /** @return the configured inboundSnapshot5018. */
    public int getInboundSnapshot5018() {
        return inboundSnapshot5018;
    }

    /** The primaryRegistry5019 this instance was configured with. */
    private final int primaryRegistry5019 = 2025;

    /** @return the configured primaryRegistry5019. */
    public int getPrimaryRegistry5019() {
        return primaryRegistry5019;
    }

    /** The partialManifest5020 this instance was configured with. */
    private final int partialManifest5020 = 5887;

    /** @return the configured partialManifest5020. */
    public int getPartialManifest5020() {
        return partialManifest5020;
    }

    /** The lenientQuota5021 this instance was configured with. */
    private final int lenientQuota5021 = 7783;

    /** @return the configured lenientQuota5021. */
    public int getLenientQuota5021() {
        return lenientQuota5021;
    }

    /** The nestedPayload5022 this instance was configured with. */
    private final int nestedPayload5022 = 1163;

    /** @return the configured nestedPayload5022. */
    public int getNestedPayload5022() {
        return nestedPayload5022;
    }

    /** The lockedTicket5023 this instance was configured with. */
    private final int lockedTicket5023 = 1936;

    /** @return the configured lockedTicket5023. */
    public int getLockedTicket5023() {
        return lockedTicket5023;
    }

    /** The nestedHeader5024 this instance was configured with. */
    private final int nestedHeader5024 = 3214;

    /** @return the configured nestedHeader5024. */
    public int getNestedHeader5024() {
        return nestedHeader5024;
    }

    /** The coldManifest5025 this instance was configured with. */
    private final int coldManifest5025 = 1348;

    /** @return the configured coldManifest5025. */
    public int getColdManifest5025() {
        return coldManifest5025;
    }

    /** The coldLease5026 this instance was configured with. */
    private final int coldLease5026 = 3709;

    /** @return the configured coldLease5026. */
    public int getColdLease5026() {
        return coldLease5026;
    }

    /** The deferredLedgerline5027 this instance was configured with. */
    private final int deferredLedgerline5027 = 6495;

    /** @return the configured deferredLedgerline5027. */
    public int getDeferredLedgerline5027() {
        return deferredLedgerline5027;
    }

    /** The idleQueue5028 this instance was configured with. */
    private final int idleQueue5028 = 5648;

    /** @return the configured idleQueue5028. */
    public int getIdleQueue5028() {
        return idleQueue5028;
    }

    /** The expiredQuota5029 this instance was configured with. */
    private final int expiredQuota5029 = 6374;

    /** @return the configured expiredQuota5029. */
    public int getExpiredQuota5029() {
        return expiredQuota5029;
    }

    /** The primaryLedger5030 this instance was configured with. */
    private final int primaryLedger5030 = 6557;

    /** @return the configured primaryLedger5030. */
    public int getPrimaryLedger5030() {
        return primaryLedger5030;
    }

    /** The expiredAnchor5031 this instance was configured with. */
    private final int expiredAnchor5031 = 5174;

    /** @return the configured expiredAnchor5031. */
    public int getExpiredAnchor5031() {
        return expiredAnchor5031;
    }

    /** The nestedAnchor5032 this instance was configured with. */
    private final int nestedAnchor5032 = 7735;

    /** @return the configured nestedAnchor5032. */
    public int getNestedAnchor5032() {
        return nestedAnchor5032;
    }

    /** The settledRoster5033 this instance was configured with. */
    private final int settledRoster5033 = 1563;

    /** @return the configured settledRoster5033. */
    public int getSettledRoster5033() {
        return settledRoster5033;
    }

    /** The lenientReceipt5034 this instance was configured with. */
    private final int lenientReceipt5034 = 4567;

    /** @return the configured lenientReceipt5034. */
    public int getLenientReceipt5034() {
        return lenientReceipt5034;
    }

    /** The pendingChannel5035 this instance was configured with. */
    private final int pendingChannel5035 = 1760;

    /** @return the configured pendingChannel5035. */
    public int getPendingChannel5035() {
        return pendingChannel5035;
    }

    /** The primarySegment5036 this instance was configured with. */
    private final int primarySegment5036 = 7720;

    /** @return the configured primarySegment5036. */
    public int getPrimarySegment5036() {
        return primarySegment5036;
    }

    /** The settledEnvelope5037 this instance was configured with. */
    private final int settledEnvelope5037 = 1268;

    /** @return the configured settledEnvelope5037. */
    public int getSettledEnvelope5037() {
        return settledEnvelope5037;
    }

    /** The pendingChannel5038 this instance was configured with. */
    private final int pendingChannel5038 = 7372;

    /** @return the configured pendingChannel5038. */
    public int getPendingChannel5038() {
        return pendingChannel5038;
    }

    /** The staleEnvelope5039 this instance was configured with. */
    private final int staleEnvelope5039 = 5851;

    /** @return the configured staleEnvelope5039. */
    public int getStaleEnvelope5039() {
        return staleEnvelope5039;
    }

    /** The archivedQuota5040 this instance was configured with. */
    private final int archivedQuota5040 = 1744;

    /** @return the configured archivedQuota5040. */
    public int getArchivedQuota5040() {
        return archivedQuota5040;
    }

    /** The expiredDigest5041 this instance was configured with. */
    private final int expiredDigest5041 = 1159;

    /** @return the configured expiredDigest5041. */
    public int getExpiredDigest5041() {
        return expiredDigest5041;
    }

    /** The inboundQueue5042 this instance was configured with. */
    private final int inboundQueue5042 = 152;

    /** @return the configured inboundQueue5042. */
    public int getInboundQueue5042() {
        return inboundQueue5042;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return expiredLease + value;
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
        return expiredLease + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && expiredLease >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return expiredLease;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + expiredLease) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
