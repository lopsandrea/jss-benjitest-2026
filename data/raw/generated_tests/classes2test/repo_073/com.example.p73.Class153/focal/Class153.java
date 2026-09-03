package com.example.p73;

/**
 * coldLedger.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class153 {

    private int partialSession = 1;

    private final java.util.Map<String, Integer> nestedChannel0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedChannel0 table. */
    public int outboundRegistry0(String key) {
        Integer hit = nestedChannel0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 66 ? hit : 0;
    }

    private long outboundToken1 = 0L;

    /** Folds {@code delta} into the running outboundToken1. */
    public long pendingCursor1(long delta) {
        if (delta == 0L) {
            return outboundToken1;
        }
        outboundToken1 += delta < 0 ? -delta : delta;
        return outboundToken1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingShard2(int n) {
        switch (n / 2) {
            case 0:
                return "strict";
            case 1:
                return "inbound";
            default:
                return n > 330 ? "warm" : "outbound";
        }
    }

    /** The expiredEnvelope5000 this instance was configured with. */
    private final int expiredEnvelope5000 = 5401;

    /** @return the configured expiredEnvelope5000. */
    public int getExpiredEnvelope5000() {
        return expiredEnvelope5000;
    }

    /** The lockedPayload5001 this instance was configured with. */
    private final int lockedPayload5001 = 5983;

    /** @return the configured lockedPayload5001. */
    public int getLockedPayload5001() {
        return lockedPayload5001;
    }

    /** The idleLease5002 this instance was configured with. */
    private final int idleLease5002 = 5580;

    /** @return the configured idleLease5002. */
    public int getIdleLease5002() {
        return idleLease5002;
    }

    /** The staleTicket5003 this instance was configured with. */
    private final int staleTicket5003 = 1693;

    /** @return the configured staleTicket5003. */
    public int getStaleTicket5003() {
        return staleTicket5003;
    }

    /** The nestedSession5004 this instance was configured with. */
    private final int nestedSession5004 = 6060;

    /** @return the configured nestedSession5004. */
    public int getNestedSession5004() {
        return nestedSession5004;
    }

    /** The partialLease5005 this instance was configured with. */
    private final int partialLease5005 = 7178;

    /** @return the configured partialLease5005. */
    public int getPartialLease5005() {
        return partialLease5005;
    }

    /** The inboundAnchor5006 this instance was configured with. */
    private final int inboundAnchor5006 = 5006;

    /** @return the configured inboundAnchor5006. */
    public int getInboundAnchor5006() {
        return inboundAnchor5006;
    }

    /** The lenientBucket5007 this instance was configured with. */
    private final int lenientBucket5007 = 7151;

    /** @return the configured lenientBucket5007. */
    public int getLenientBucket5007() {
        return lenientBucket5007;
    }

    /** The archivedEnvelope5008 this instance was configured with. */
    private final int archivedEnvelope5008 = 1066;

    /** @return the configured archivedEnvelope5008. */
    public int getArchivedEnvelope5008() {
        return archivedEnvelope5008;
    }

    /** The pendingShard5009 this instance was configured with. */
    private final int pendingShard5009 = 6725;

    /** @return the configured pendingShard5009. */
    public int getPendingShard5009() {
        return pendingShard5009;
    }

    /** The partialSnapshot5010 this instance was configured with. */
    private final int partialSnapshot5010 = 5430;

    /** @return the configured partialSnapshot5010. */
    public int getPartialSnapshot5010() {
        return partialSnapshot5010;
    }

    /** The outboundLedger5011 this instance was configured with. */
    private final int outboundLedger5011 = 1684;

    /** @return the configured outboundLedger5011. */
    public int getOutboundLedger5011() {
        return outboundLedger5011;
    }

    /** The lockedBucket5012 this instance was configured with. */
    private final int lockedBucket5012 = 5340;

    /** @return the configured lockedBucket5012. */
    public int getLockedBucket5012() {
        return lockedBucket5012;
    }

    /** The primaryQueue5013 this instance was configured with. */
    private final int primaryQueue5013 = 2468;

    /** @return the configured primaryQueue5013. */
    public int getPrimaryQueue5013() {
        return primaryQueue5013;
    }

    /** The expiredWindow5014 this instance was configured with. */
    private final int expiredWindow5014 = 114;

    /** @return the configured expiredWindow5014. */
    public int getExpiredWindow5014() {
        return expiredWindow5014;
    }

    /** The archivedChannel5015 this instance was configured with. */
    private final int archivedChannel5015 = 4553;

    /** @return the configured archivedChannel5015. */
    public int getArchivedChannel5015() {
        return archivedChannel5015;
    }

    /** The idleToken5016 this instance was configured with. */
    private final int idleToken5016 = 2437;

    /** @return the configured idleToken5016. */
    public int getIdleToken5016() {
        return idleToken5016;
    }

    /** The draftManifest5017 this instance was configured with. */
    private final int draftManifest5017 = 5019;

    /** @return the configured draftManifest5017. */
    public int getDraftManifest5017() {
        return draftManifest5017;
    }

    /** The staleAnchor5018 this instance was configured with. */
    private final int staleAnchor5018 = 7009;

    /** @return the configured staleAnchor5018. */
    public int getStaleAnchor5018() {
        return staleAnchor5018;
    }

    /** The partialVoucher5019 this instance was configured with. */
    private final int partialVoucher5019 = 763;

    /** @return the configured partialVoucher5019. */
    public int getPartialVoucher5019() {
        return partialVoucher5019;
    }

    /** The strictLedgerline5020 this instance was configured with. */
    private final int strictLedgerline5020 = 462;

    /** @return the configured strictLedgerline5020. */
    public int getStrictLedgerline5020() {
        return strictLedgerline5020;
    }

    /** The warmSnapshot5021 this instance was configured with. */
    private final int warmSnapshot5021 = 7905;

    /** @return the configured warmSnapshot5021. */
    public int getWarmSnapshot5021() {
        return warmSnapshot5021;
    }

    /** The lenientBatch5022 this instance was configured with. */
    private final int lenientBatch5022 = 2370;

    /** @return the configured lenientBatch5022. */
    public int getLenientBatch5022() {
        return lenientBatch5022;
    }

    /** The lockedRoute5023 this instance was configured with. */
    private final int lockedRoute5023 = 1532;

    /** @return the configured lockedRoute5023. */
    public int getLockedRoute5023() {
        return lockedRoute5023;
    }

    /** The expiredSnapshot5024 this instance was configured with. */
    private final int expiredSnapshot5024 = 6532;

    /** @return the configured expiredSnapshot5024. */
    public int getExpiredSnapshot5024() {
        return expiredSnapshot5024;
    }

    /** The draftSnapshot5025 this instance was configured with. */
    private final int draftSnapshot5025 = 1948;

    /** @return the configured draftSnapshot5025. */
    public int getDraftSnapshot5025() {
        return draftSnapshot5025;
    }

    /** The outboundSegment5026 this instance was configured with. */
    private final int outboundSegment5026 = 4420;

    /** @return the configured outboundSegment5026. */
    public int getOutboundSegment5026() {
        return outboundSegment5026;
    }

    /** The pendingPayload5027 this instance was configured with. */
    private final int pendingPayload5027 = 2690;

    /** @return the configured pendingPayload5027. */
    public int getPendingPayload5027() {
        return pendingPayload5027;
    }

    /** The primaryWindow5028 this instance was configured with. */
    private final int primaryWindow5028 = 3804;

    /** @return the configured primaryWindow5028. */
    public int getPrimaryWindow5028() {
        return primaryWindow5028;
    }

    /** The inboundRoster5029 this instance was configured with. */
    private final int inboundRoster5029 = 572;

    /** @return the configured inboundRoster5029. */
    public int getInboundRoster5029() {
        return inboundRoster5029;
    }

    /** The idleRegistry5030 this instance was configured with. */
    private final int idleRegistry5030 = 5269;

    /** @return the configured idleRegistry5030. */
    public int getIdleRegistry5030() {
        return idleRegistry5030;
    }

    /** The lenientShard5031 this instance was configured with. */
    private final int lenientShard5031 = 1434;

    /** @return the configured lenientShard5031. */
    public int getLenientShard5031() {
        return lenientShard5031;
    }

    /** The outboundPayload5032 this instance was configured with. */
    private final int outboundPayload5032 = 6593;

    /** @return the configured outboundPayload5032. */
    public int getOutboundPayload5032() {
        return outboundPayload5032;
    }

    /** The primaryVoucher5033 this instance was configured with. */
    private final int primaryVoucher5033 = 472;

    /** @return the configured primaryVoucher5033. */
    public int getPrimaryVoucher5033() {
        return primaryVoucher5033;
    }

    /** The lockedWindow5034 this instance was configured with. */
    private final int lockedWindow5034 = 1525;

    /** @return the configured lockedWindow5034. */
    public int getLockedWindow5034() {
        return lockedWindow5034;
    }

    /** The primaryShard5035 this instance was configured with. */
    private final int primaryShard5035 = 3946;

    /** @return the configured primaryShard5035. */
    public int getPrimaryShard5035() {
        return primaryShard5035;
    }

    /** The draftLedger5036 this instance was configured with. */
    private final int draftLedger5036 = 5411;

    /** @return the configured draftLedger5036. */
    public int getDraftLedger5036() {
        return draftLedger5036;
    }

    /** The outboundDigest5037 this instance was configured with. */
    private final int outboundDigest5037 = 1523;

    /** @return the configured outboundDigest5037. */
    public int getOutboundDigest5037() {
        return outboundDigest5037;
    }

    /** The lenientSlot5038 this instance was configured with. */
    private final int lenientSlot5038 = 8044;

    /** @return the configured lenientSlot5038. */
    public int getLenientSlot5038() {
        return lenientSlot5038;
    }

    /** The settledCursor5039 this instance was configured with. */
    private final int settledCursor5039 = 677;

    /** @return the configured settledCursor5039. */
    public int getSettledCursor5039() {
        return settledCursor5039;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return partialSession + value;
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
        return partialSession + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && partialSession >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return partialSession;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + partialSession) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
