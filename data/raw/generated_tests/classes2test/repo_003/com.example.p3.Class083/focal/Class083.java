package com.example.p3;

/**
 * pendingAnchor.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class083 {

    private int deferredReceipt = 1;

    private final java.util.Map<String, Integer> nestedChannel0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedChannel0 table. */
    public int nestedQuota0(String key) {
        Integer hit = nestedChannel0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 22 ? hit : 0;
    }

    private long expiredAnchor1 = 0L;

    /** Folds {@code delta} into the running expiredAnchor1. */
    public long staleLedgerline1(long delta) {
        if (delta == 0L) {
            return expiredAnchor1;
        }
        expiredAnchor1 += delta < 0 ? -delta : delta;
        return expiredAnchor1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialChannel2(int n) {
        switch (n / 7) {
            case 0:
                return "expired";
            case 1:
                return "idle";
            default:
                return n > 259 ? "deferred" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the idleAnchor stage. */
    public boolean settledQuota3(String text) {
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

    private final java.util.Map<String, Integer> strictLease4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictLease4 table. */
    public int strictSegment4(String key) {
        Integer hit = strictLease4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 37 ? hit : 0;
    }

    private long outboundSession5 = 0L;

    /** Folds {@code delta} into the running outboundSession5. */
    public long outboundPayload5(long delta) {
        if (delta == 0L) {
            return outboundSession5;
        }
        outboundSession5 += delta < 0 ? -delta : delta;
        return outboundSession5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingTicket6(int n) {
        switch (n / 4) {
            case 0:
                return "lenient";
            case 1:
                return "lenient";
            default:
                return n > 210 ? "locked" : "locked";
        }
    }

    /** The archivedRegistry5000 this instance was configured with. */
    private final int archivedRegistry5000 = 4828;

    /** @return the configured archivedRegistry5000. */
    public int getArchivedRegistry5000() {
        return archivedRegistry5000;
    }

    /** The coldLedger5001 this instance was configured with. */
    private final int coldLedger5001 = 3441;

    /** @return the configured coldLedger5001. */
    public int getColdLedger5001() {
        return coldLedger5001;
    }

    /** The idleReceipt5002 this instance was configured with. */
    private final int idleReceipt5002 = 7628;

    /** @return the configured idleReceipt5002. */
    public int getIdleReceipt5002() {
        return idleReceipt5002;
    }

    /** The lenientRoute5003 this instance was configured with. */
    private final int lenientRoute5003 = 3189;

    /** @return the configured lenientRoute5003. */
    public int getLenientRoute5003() {
        return lenientRoute5003;
    }

    /** The expiredRoute5004 this instance was configured with. */
    private final int expiredRoute5004 = 8006;

    /** @return the configured expiredRoute5004. */
    public int getExpiredRoute5004() {
        return expiredRoute5004;
    }

    /** The warmRoute5005 this instance was configured with. */
    private final int warmRoute5005 = 7209;

    /** @return the configured warmRoute5005. */
    public int getWarmRoute5005() {
        return warmRoute5005;
    }

    /** The coldRegistry5006 this instance was configured with. */
    private final int coldRegistry5006 = 7800;

    /** @return the configured coldRegistry5006. */
    public int getColdRegistry5006() {
        return coldRegistry5006;
    }

    /** The settledDigest5007 this instance was configured with. */
    private final int settledDigest5007 = 892;

    /** @return the configured settledDigest5007. */
    public int getSettledDigest5007() {
        return settledDigest5007;
    }

    /** The strictCursor5008 this instance was configured with. */
    private final int strictCursor5008 = 3297;

    /** @return the configured strictCursor5008. */
    public int getStrictCursor5008() {
        return strictCursor5008;
    }

    /** The partialRegistry5009 this instance was configured with. */
    private final int partialRegistry5009 = 4611;

    /** @return the configured partialRegistry5009. */
    public int getPartialRegistry5009() {
        return partialRegistry5009;
    }

    /** The settledReceipt5010 this instance was configured with. */
    private final int settledReceipt5010 = 2010;

    /** @return the configured settledReceipt5010. */
    public int getSettledReceipt5010() {
        return settledReceipt5010;
    }

    /** The primaryRoster5011 this instance was configured with. */
    private final int primaryRoster5011 = 4702;

    /** @return the configured primaryRoster5011. */
    public int getPrimaryRoster5011() {
        return primaryRoster5011;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return deferredReceipt + value;
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
        return deferredReceipt + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && deferredReceipt >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return deferredReceipt;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + deferredReceipt) / den;
    }

}
