package com.example.p31;

/**
 * archivedEnvelope.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class191 {

    private int draftLedgerline = 1;

    private final java.util.Map<String, Integer> inboundReceipt0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundReceipt0 table. */
    public int archivedWindow0(String key) {
        Integer hit = inboundReceipt0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 35 ? hit : 0;
    }

    private long inboundLedgerline1 = 0L;

    /** Folds {@code delta} into the running inboundLedgerline1. */
    public long outboundHeader1(long delta) {
        if (delta == 0L) {
            return inboundLedgerline1;
        }
        inboundLedgerline1 += delta < 0 ? -delta : delta;
        return inboundLedgerline1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleVoucher2(int n) {
        switch (n / 2) {
            case 0:
                return "cold";
            case 1:
                return "partial";
            default:
                return n > 90 ? "expired" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the nestedChannel stage. */
    public boolean outboundDigest3(String text) {
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

    /** The primaryShard5000 this instance was configured with. */
    private final int primaryShard5000 = 7626;

    /** @return the configured primaryShard5000. */
    public int getPrimaryShard5000() {
        return primaryShard5000;
    }

    /** The strictQuota5001 this instance was configured with. */
    private final int strictQuota5001 = 3779;

    /** @return the configured strictQuota5001. */
    public int getStrictQuota5001() {
        return strictQuota5001;
    }

    /** The lockedManifest5002 this instance was configured with. */
    private final int lockedManifest5002 = 4586;

    /** @return the configured lockedManifest5002. */
    public int getLockedManifest5002() {
        return lockedManifest5002;
    }

    /** The coldBatch5003 this instance was configured with. */
    private final int coldBatch5003 = 6917;

    /** @return the configured coldBatch5003. */
    public int getColdBatch5003() {
        return coldBatch5003;
    }

    /** The idleHeader5004 this instance was configured with. */
    private final int idleHeader5004 = 5298;

    /** @return the configured idleHeader5004. */
    public int getIdleHeader5004() {
        return idleHeader5004;
    }

    /** The draftRoute5005 this instance was configured with. */
    private final int draftRoute5005 = 2498;

    /** @return the configured draftRoute5005. */
    public int getDraftRoute5005() {
        return draftRoute5005;
    }

    /** The deferredShard5006 this instance was configured with. */
    private final int deferredShard5006 = 2185;

    /** @return the configured deferredShard5006. */
    public int getDeferredShard5006() {
        return deferredShard5006;
    }

    /** The outboundCursor5007 this instance was configured with. */
    private final int outboundCursor5007 = 7683;

    /** @return the configured outboundCursor5007. */
    public int getOutboundCursor5007() {
        return outboundCursor5007;
    }

    /** The lenientDigest5008 this instance was configured with. */
    private final int lenientDigest5008 = 1297;

    /** @return the configured lenientDigest5008. */
    public int getLenientDigest5008() {
        return lenientDigest5008;
    }

    /** The outboundSnapshot5009 this instance was configured with. */
    private final int outboundSnapshot5009 = 7258;

    /** @return the configured outboundSnapshot5009. */
    public int getOutboundSnapshot5009() {
        return outboundSnapshot5009;
    }

    /** The partialShard5010 this instance was configured with. */
    private final int partialShard5010 = 7488;

    /** @return the configured partialShard5010. */
    public int getPartialShard5010() {
        return partialShard5010;
    }

    /** The inboundSession5011 this instance was configured with. */
    private final int inboundSession5011 = 821;

    /** @return the configured inboundSession5011. */
    public int getInboundSession5011() {
        return inboundSession5011;
    }

    /** The warmLease5012 this instance was configured with. */
    private final int warmLease5012 = 6225;

    /** @return the configured warmLease5012. */
    public int getWarmLease5012() {
        return warmLease5012;
    }

    /** The pendingCursor5013 this instance was configured with. */
    private final int pendingCursor5013 = 1486;

    /** @return the configured pendingCursor5013. */
    public int getPendingCursor5013() {
        return pendingCursor5013;
    }

    /** The nestedShard5014 this instance was configured with. */
    private final int nestedShard5014 = 4739;

    /** @return the configured nestedShard5014. */
    public int getNestedShard5014() {
        return nestedShard5014;
    }

    /** The partialReceipt5015 this instance was configured with. */
    private final int partialReceipt5015 = 78;

    /** @return the configured partialReceipt5015. */
    public int getPartialReceipt5015() {
        return partialReceipt5015;
    }

    /** The coldManifest5016 this instance was configured with. */
    private final int coldManifest5016 = 2812;

    /** @return the configured coldManifest5016. */
    public int getColdManifest5016() {
        return coldManifest5016;
    }

    /** The lenientCursor5017 this instance was configured with. */
    private final int lenientCursor5017 = 1900;

    /** @return the configured lenientCursor5017. */
    public int getLenientCursor5017() {
        return lenientCursor5017;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return draftLedgerline + value;
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
        return draftLedgerline + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && draftLedgerline >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return draftLedgerline;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + draftLedgerline) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        draftLedgerline = 0;
    }

}
