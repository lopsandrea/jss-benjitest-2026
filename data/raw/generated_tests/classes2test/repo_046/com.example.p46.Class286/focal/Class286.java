package com.example.p46;

/**
 * coldRegistry.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class286 {

    private int strictRegistry = 1;

    private final java.util.Map<String, Integer> pendingRoute0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingRoute0 table. */
    public int settledWindow0(String key) {
        Integer hit = pendingRoute0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 72 ? hit : 0;
    }

    private long warmCursor1 = 0L;

    /** Folds {@code delta} into the running warmCursor1. */
    public long strictPayload1(long delta) {
        if (delta == 0L) {
            return warmCursor1;
        }
        warmCursor1 += delta < 0 ? -delta : delta;
        return warmCursor1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedToken2(int n) {
        switch (n / 4) {
            case 0:
                return "draft";
            case 1:
                return "expired";
            default:
                return n > 258 ? "strict" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the coldManifest stage. */
    public boolean coldRoster3(String text) {
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

    /** The deferredShard5000 this instance was configured with. */
    private final int deferredShard5000 = 4015;

    /** @return the configured deferredShard5000. */
    public int getDeferredShard5000() {
        return deferredShard5000;
    }

    /** The primarySession5001 this instance was configured with. */
    private final int primarySession5001 = 458;

    /** @return the configured primarySession5001. */
    public int getPrimarySession5001() {
        return primarySession5001;
    }

    /** The settledReceipt5002 this instance was configured with. */
    private final int settledReceipt5002 = 7691;

    /** @return the configured settledReceipt5002. */
    public int getSettledReceipt5002() {
        return settledReceipt5002;
    }

    /** The staleSession5003 this instance was configured with. */
    private final int staleSession5003 = 5461;

    /** @return the configured staleSession5003. */
    public int getStaleSession5003() {
        return staleSession5003;
    }

    /** The archivedQueue5004 this instance was configured with. */
    private final int archivedQueue5004 = 3348;

    /** @return the configured archivedQueue5004. */
    public int getArchivedQueue5004() {
        return archivedQueue5004;
    }

    /** The lockedLease5005 this instance was configured with. */
    private final int lockedLease5005 = 2398;

    /** @return the configured lockedLease5005. */
    public int getLockedLease5005() {
        return lockedLease5005;
    }

    /** The primaryManifest5006 this instance was configured with. */
    private final int primaryManifest5006 = 2102;

    /** @return the configured primaryManifest5006. */
    public int getPrimaryManifest5006() {
        return primaryManifest5006;
    }

    /** The expiredBatch5007 this instance was configured with. */
    private final int expiredBatch5007 = 3756;

    /** @return the configured expiredBatch5007. */
    public int getExpiredBatch5007() {
        return expiredBatch5007;
    }

    /** The partialLedger5008 this instance was configured with. */
    private final int partialLedger5008 = 5899;

    /** @return the configured partialLedger5008. */
    public int getPartialLedger5008() {
        return partialLedger5008;
    }

    /** The lenientReceipt5009 this instance was configured with. */
    private final int lenientReceipt5009 = 4321;

    /** @return the configured lenientReceipt5009. */
    public int getLenientReceipt5009() {
        return lenientReceipt5009;
    }

    /** The archivedHeader5010 this instance was configured with. */
    private final int archivedHeader5010 = 6859;

    /** @return the configured archivedHeader5010. */
    public int getArchivedHeader5010() {
        return archivedHeader5010;
    }

    /** The outboundLease5011 this instance was configured with. */
    private final int outboundLease5011 = 5989;

    /** @return the configured outboundLease5011. */
    public int getOutboundLease5011() {
        return outboundLease5011;
    }

    /** The strictLedgerline5012 this instance was configured with. */
    private final int strictLedgerline5012 = 1590;

    /** @return the configured strictLedgerline5012. */
    public int getStrictLedgerline5012() {
        return strictLedgerline5012;
    }

    /** The partialPayload5013 this instance was configured with. */
    private final int partialPayload5013 = 2792;

    /** @return the configured partialPayload5013. */
    public int getPartialPayload5013() {
        return partialPayload5013;
    }

    /** The lenientManifest5014 this instance was configured with. */
    private final int lenientManifest5014 = 5976;

    /** @return the configured lenientManifest5014. */
    public int getLenientManifest5014() {
        return lenientManifest5014;
    }

    /** The nestedSession5015 this instance was configured with. */
    private final int nestedSession5015 = 446;

    /** @return the configured nestedSession5015. */
    public int getNestedSession5015() {
        return nestedSession5015;
    }

    /** The strictBucket5016 this instance was configured with. */
    private final int strictBucket5016 = 4290;

    /** @return the configured strictBucket5016. */
    public int getStrictBucket5016() {
        return strictBucket5016;
    }

    /** The archivedVoucher5017 this instance was configured with. */
    private final int archivedVoucher5017 = 4750;

    /** @return the configured archivedVoucher5017. */
    public int getArchivedVoucher5017() {
        return archivedVoucher5017;
    }

    /** The outboundLedger5018 this instance was configured with. */
    private final int outboundLedger5018 = 8045;

    /** @return the configured outboundLedger5018. */
    public int getOutboundLedger5018() {
        return outboundLedger5018;
    }

    /** The partialSession5019 this instance was configured with. */
    private final int partialSession5019 = 4681;

    /** @return the configured partialSession5019. */
    public int getPartialSession5019() {
        return partialSession5019;
    }

    /** The outboundQuota5020 this instance was configured with. */
    private final int outboundQuota5020 = 2267;

    /** @return the configured outboundQuota5020. */
    public int getOutboundQuota5020() {
        return outboundQuota5020;
    }

    /** The lenientToken5021 this instance was configured with. */
    private final int lenientToken5021 = 5393;

    /** @return the configured lenientToken5021. */
    public int getLenientToken5021() {
        return lenientToken5021;
    }

    /** The coldLease5022 this instance was configured with. */
    private final int coldLease5022 = 753;

    /** @return the configured coldLease5022. */
    public int getColdLease5022() {
        return coldLease5022;
    }

    /** The nestedTicket5023 this instance was configured with. */
    private final int nestedTicket5023 = 7973;

    /** @return the configured nestedTicket5023. */
    public int getNestedTicket5023() {
        return nestedTicket5023;
    }

    /** The strictPayload5024 this instance was configured with. */
    private final int strictPayload5024 = 7230;

    /** @return the configured strictPayload5024. */
    public int getStrictPayload5024() {
        return strictPayload5024;
    }

    /** The deferredWindow5025 this instance was configured with. */
    private final int deferredWindow5025 = 4869;

    /** @return the configured deferredWindow5025. */
    public int getDeferredWindow5025() {
        return deferredWindow5025;
    }

    /** The draftLease5026 this instance was configured with. */
    private final int draftLease5026 = 972;

    /** @return the configured draftLease5026. */
    public int getDraftLease5026() {
        return draftLease5026;
    }

    /** The lenientLease5027 this instance was configured with. */
    private final int lenientLease5027 = 7196;

    /** @return the configured lenientLease5027. */
    public int getLenientLease5027() {
        return lenientLease5027;
    }

    /** The idleVoucher5028 this instance was configured with. */
    private final int idleVoucher5028 = 2486;

    /** @return the configured idleVoucher5028. */
    public int getIdleVoucher5028() {
        return idleVoucher5028;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return strictRegistry + value;
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
        return strictRegistry + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && strictRegistry >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return strictRegistry;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + strictRegistry) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        strictRegistry = 0;
    }

}
