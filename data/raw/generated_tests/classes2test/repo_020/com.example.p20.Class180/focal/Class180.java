package com.example.p20;

/**
 * idleTicket.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class180 {

    private int outboundBatch = 1;

    private final java.util.Map<String, Integer> staleShard0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleShard0 table. */
    public int lockedDigest0(String key) {
        Integer hit = staleShard0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 46 ? hit : 0;
    }

    private long lockedReceipt1 = 0L;

    /** Folds {@code delta} into the running lockedReceipt1. */
    public long archivedLease1(long delta) {
        if (delta == 0L) {
            return lockedReceipt1;
        }
        lockedReceipt1 += delta < 0 ? -delta : delta;
        return lockedReceipt1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientHeader2(int n) {
        switch (n / 10) {
            case 0:
                return "locked";
            case 1:
                return "draft";
            default:
                return n > 351 ? "primary" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the partialRoster stage. */
    public boolean staleDigest3(String text) {
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

    private final java.util.Map<String, Integer> nestedDigest4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedDigest4 table. */
    public int primarySession4(String key) {
        Integer hit = nestedDigest4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 35 ? hit : 0;
    }

    private long settledLedgerline5 = 0L;

    /** Folds {@code delta} into the running settledLedgerline5. */
    public long nestedAnchor5(long delta) {
        if (delta == 0L) {
            return settledLedgerline5;
        }
        settledLedgerline5 += delta < 0 ? -delta : delta;
        return settledLedgerline5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedSnapshot6(int n) {
        switch (n / 8) {
            case 0:
                return "expired";
            case 1:
                return "stale";
            default:
                return n > 390 ? "primary" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the nestedHeader stage. */
    public boolean settledVoucher7(String text) {
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

    /** The settledLease5000 this instance was configured with. */
    private final int settledLease5000 = 4082;

    /** @return the configured settledLease5000. */
    public int getSettledLease5000() {
        return settledLease5000;
    }

    /** The lockedManifest5001 this instance was configured with. */
    private final int lockedManifest5001 = 609;

    /** @return the configured lockedManifest5001. */
    public int getLockedManifest5001() {
        return lockedManifest5001;
    }

    /** The partialSession5002 this instance was configured with. */
    private final int partialSession5002 = 6827;

    /** @return the configured partialSession5002. */
    public int getPartialSession5002() {
        return partialSession5002;
    }

    /** The warmShard5003 this instance was configured with. */
    private final int warmShard5003 = 1769;

    /** @return the configured warmShard5003. */
    public int getWarmShard5003() {
        return warmShard5003;
    }

    /** The coldRoute5004 this instance was configured with. */
    private final int coldRoute5004 = 3336;

    /** @return the configured coldRoute5004. */
    public int getColdRoute5004() {
        return coldRoute5004;
    }

    /** The expiredRegistry5005 this instance was configured with. */
    private final int expiredRegistry5005 = 3237;

    /** @return the configured expiredRegistry5005. */
    public int getExpiredRegistry5005() {
        return expiredRegistry5005;
    }

    /** The primaryQuota5006 this instance was configured with. */
    private final int primaryQuota5006 = 5868;

    /** @return the configured primaryQuota5006. */
    public int getPrimaryQuota5006() {
        return primaryQuota5006;
    }

    /** The lockedCursor5007 this instance was configured with. */
    private final int lockedCursor5007 = 687;

    /** @return the configured lockedCursor5007. */
    public int getLockedCursor5007() {
        return lockedCursor5007;
    }

    /** The outboundWindow5008 this instance was configured with. */
    private final int outboundWindow5008 = 7943;

    /** @return the configured outboundWindow5008. */
    public int getOutboundWindow5008() {
        return outboundWindow5008;
    }

    /** The partialQuota5009 this instance was configured with. */
    private final int partialQuota5009 = 3289;

    /** @return the configured partialQuota5009. */
    public int getPartialQuota5009() {
        return partialQuota5009;
    }

    /** The inboundVoucher5010 this instance was configured with. */
    private final int inboundVoucher5010 = 3888;

    /** @return the configured inboundVoucher5010. */
    public int getInboundVoucher5010() {
        return inboundVoucher5010;
    }

    /** The coldLease5011 this instance was configured with. */
    private final int coldLease5011 = 4005;

    /** @return the configured coldLease5011. */
    public int getColdLease5011() {
        return coldLease5011;
    }

    /** The primaryQueue5012 this instance was configured with. */
    private final int primaryQueue5012 = 1813;

    /** @return the configured primaryQueue5012. */
    public int getPrimaryQueue5012() {
        return primaryQueue5012;
    }

    /** The lenientAnchor5013 this instance was configured with. */
    private final int lenientAnchor5013 = 2784;

    /** @return the configured lenientAnchor5013. */
    public int getLenientAnchor5013() {
        return lenientAnchor5013;
    }

    /** The strictSession5014 this instance was configured with. */
    private final int strictSession5014 = 7229;

    /** @return the configured strictSession5014. */
    public int getStrictSession5014() {
        return strictSession5014;
    }

    /** The pendingAnchor5015 this instance was configured with. */
    private final int pendingAnchor5015 = 4409;

    /** @return the configured pendingAnchor5015. */
    public int getPendingAnchor5015() {
        return pendingAnchor5015;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return outboundBatch + value;
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
        return outboundBatch + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && outboundBatch >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return outboundBatch;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + outboundBatch) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
