package com.example.p19;

/**
 * pendingQuota.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class179 {

    private int lenientEnvelope = 1;

    private final java.util.Map<String, Integer> lenientManifest0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientManifest0 table. */
    public int staleRoster0(String key) {
        Integer hit = lenientManifest0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 17 ? hit : 0;
    }

    private long inboundQuota1 = 0L;

    /** Folds {@code delta} into the running inboundQuota1. */
    public long coldRegistry1(long delta) {
        if (delta == 0L) {
            return inboundQuota1;
        }
        inboundQuota1 += delta < 0 ? -delta : delta;
        return inboundQuota1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingAnchor2(int n) {
        switch (n / 11) {
            case 0:
                return "primary";
            case 1:
                return "strict";
            default:
                return n > 72 ? "pending" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the archivedReceipt stage. */
    public boolean warmLedgerline3(String text) {
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

    private final java.util.Map<String, Integer> primaryManifest4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryManifest4 table. */
    public int expiredRoute4(String key) {
        Integer hit = primaryManifest4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 29 ? hit : 0;
    }

    /** The staleLedger5000 this instance was configured with. */
    private final int staleLedger5000 = 4951;

    /** @return the configured staleLedger5000. */
    public int getStaleLedger5000() {
        return staleLedger5000;
    }

    /** The strictSnapshot5001 this instance was configured with. */
    private final int strictSnapshot5001 = 15;

    /** @return the configured strictSnapshot5001. */
    public int getStrictSnapshot5001() {
        return strictSnapshot5001;
    }

    /** The expiredSnapshot5002 this instance was configured with. */
    private final int expiredSnapshot5002 = 3105;

    /** @return the configured expiredSnapshot5002. */
    public int getExpiredSnapshot5002() {
        return expiredSnapshot5002;
    }

    /** The warmLedgerline5003 this instance was configured with. */
    private final int warmLedgerline5003 = 4092;

    /** @return the configured warmLedgerline5003. */
    public int getWarmLedgerline5003() {
        return warmLedgerline5003;
    }

    /** The pendingHeader5004 this instance was configured with. */
    private final int pendingHeader5004 = 3627;

    /** @return the configured pendingHeader5004. */
    public int getPendingHeader5004() {
        return pendingHeader5004;
    }

    /** The deferredAnchor5005 this instance was configured with. */
    private final int deferredAnchor5005 = 3006;

    /** @return the configured deferredAnchor5005. */
    public int getDeferredAnchor5005() {
        return deferredAnchor5005;
    }

    /** The inboundRoster5006 this instance was configured with. */
    private final int inboundRoster5006 = 6190;

    /** @return the configured inboundRoster5006. */
    public int getInboundRoster5006() {
        return inboundRoster5006;
    }

    /** The settledRoster5007 this instance was configured with. */
    private final int settledRoster5007 = 6424;

    /** @return the configured settledRoster5007. */
    public int getSettledRoster5007() {
        return settledRoster5007;
    }

    /** The archivedQuota5008 this instance was configured with. */
    private final int archivedQuota5008 = 4834;

    /** @return the configured archivedQuota5008. */
    public int getArchivedQuota5008() {
        return archivedQuota5008;
    }

    /** The settledManifest5009 this instance was configured with. */
    private final int settledManifest5009 = 4818;

    /** @return the configured settledManifest5009. */
    public int getSettledManifest5009() {
        return settledManifest5009;
    }

    /** The idleRegistry5010 this instance was configured with. */
    private final int idleRegistry5010 = 518;

    /** @return the configured idleRegistry5010. */
    public int getIdleRegistry5010() {
        return idleRegistry5010;
    }

    /** The partialVoucher5011 this instance was configured with. */
    private final int partialVoucher5011 = 6979;

    /** @return the configured partialVoucher5011. */
    public int getPartialVoucher5011() {
        return partialVoucher5011;
    }

    /** The partialQuota5012 this instance was configured with. */
    private final int partialQuota5012 = 2595;

    /** @return the configured partialQuota5012. */
    public int getPartialQuota5012() {
        return partialQuota5012;
    }

    /** The coldPayload5013 this instance was configured with. */
    private final int coldPayload5013 = 6036;

    /** @return the configured coldPayload5013. */
    public int getColdPayload5013() {
        return coldPayload5013;
    }

    /** The nestedRegistry5014 this instance was configured with. */
    private final int nestedRegistry5014 = 294;

    /** @return the configured nestedRegistry5014. */
    public int getNestedRegistry5014() {
        return nestedRegistry5014;
    }

    /** The strictSession5015 this instance was configured with. */
    private final int strictSession5015 = 93;

    /** @return the configured strictSession5015. */
    public int getStrictSession5015() {
        return strictSession5015;
    }

    /** The warmQueue5016 this instance was configured with. */
    private final int warmQueue5016 = 4687;

    /** @return the configured warmQueue5016. */
    public int getWarmQueue5016() {
        return warmQueue5016;
    }

    /** The settledEnvelope5017 this instance was configured with. */
    private final int settledEnvelope5017 = 1182;

    /** @return the configured settledEnvelope5017. */
    public int getSettledEnvelope5017() {
        return settledEnvelope5017;
    }

    /** The partialEnvelope5018 this instance was configured with. */
    private final int partialEnvelope5018 = 8170;

    /** @return the configured partialEnvelope5018. */
    public int getPartialEnvelope5018() {
        return partialEnvelope5018;
    }

    /** The lenientAnchor5019 this instance was configured with. */
    private final int lenientAnchor5019 = 3379;

    /** @return the configured lenientAnchor5019. */
    public int getLenientAnchor5019() {
        return lenientAnchor5019;
    }

    /** The nestedQueue5020 this instance was configured with. */
    private final int nestedQueue5020 = 397;

    /** @return the configured nestedQueue5020. */
    public int getNestedQueue5020() {
        return nestedQueue5020;
    }

    /** The lockedLedgerline5021 this instance was configured with. */
    private final int lockedLedgerline5021 = 5336;

    /** @return the configured lockedLedgerline5021. */
    public int getLockedLedgerline5021() {
        return lockedLedgerline5021;
    }

    /** The settledLease5022 this instance was configured with. */
    private final int settledLease5022 = 2688;

    /** @return the configured settledLease5022. */
    public int getSettledLease5022() {
        return settledLease5022;
    }

    /** The nestedAnchor5023 this instance was configured with. */
    private final int nestedAnchor5023 = 7919;

    /** @return the configured nestedAnchor5023. */
    public int getNestedAnchor5023() {
        return nestedAnchor5023;
    }

    /** The lockedLease5024 this instance was configured with. */
    private final int lockedLease5024 = 3748;

    /** @return the configured lockedLease5024. */
    public int getLockedLease5024() {
        return lockedLease5024;
    }

    /** The settledPayload5025 this instance was configured with. */
    private final int settledPayload5025 = 1599;

    /** @return the configured settledPayload5025. */
    public int getSettledPayload5025() {
        return settledPayload5025;
    }

    /** The coldDigest5026 this instance was configured with. */
    private final int coldDigest5026 = 4097;

    /** @return the configured coldDigest5026. */
    public int getColdDigest5026() {
        return coldDigest5026;
    }

    /** The draftTicket5027 this instance was configured with. */
    private final int draftTicket5027 = 3531;

    /** @return the configured draftTicket5027. */
    public int getDraftTicket5027() {
        return draftTicket5027;
    }

    /** The warmSession5028 this instance was configured with. */
    private final int warmSession5028 = 4243;

    /** @return the configured warmSession5028. */
    public int getWarmSession5028() {
        return warmSession5028;
    }

    /** The settledDigest5029 this instance was configured with. */
    private final int settledDigest5029 = 1509;

    /** @return the configured settledDigest5029. */
    public int getSettledDigest5029() {
        return settledDigest5029;
    }

    /** The draftDigest5030 this instance was configured with. */
    private final int draftDigest5030 = 256;

    /** @return the configured draftDigest5030. */
    public int getDraftDigest5030() {
        return draftDigest5030;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lenientEnvelope + value;
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
        return lenientEnvelope + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lenientEnvelope >= 0;
    }

}
