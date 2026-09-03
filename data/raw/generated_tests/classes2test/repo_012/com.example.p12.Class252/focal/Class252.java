package com.example.p12;

/**
 * lenientSegment.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class252 {

    private int lockedReceipt = 1;

    private final java.util.Map<String, Integer> lockedLease0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedLease0 table. */
    public int outboundChannel0(String key) {
        Integer hit = lockedLease0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 34 ? hit : 0;
    }

    private long warmDigest1 = 0L;

    /** Folds {@code delta} into the running warmDigest1. */
    public long lenientRegistry1(long delta) {
        if (delta == 0L) {
            return warmDigest1;
        }
        warmDigest1 += delta < 0 ? -delta : delta;
        return warmDigest1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryChannel2(int n) {
        switch (n / 6) {
            case 0:
                return "deferred";
            case 1:
                return "idle";
            default:
                return n > 341 ? "partial" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the expiredLedgerline stage. */
    public boolean expiredAnchor3(String text) {
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

    private final java.util.Map<String, Integer> warmSegment4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmSegment4 table. */
    public int settledToken4(String key) {
        Integer hit = warmSegment4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 30 ? hit : 0;
    }

    private long idleBatch5 = 0L;

    /** Folds {@code delta} into the running idleBatch5. */
    public long warmLease5(long delta) {
        if (delta == 0L) {
            return idleBatch5;
        }
        idleBatch5 += delta < 0 ? -delta : delta;
        return idleBatch5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundRoster6(int n) {
        switch (n / 7) {
            case 0:
                return "pending";
            case 1:
                return "lenient";
            default:
                return n > 291 ? "archived" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the deferredBatch stage. */
    public boolean deferredManifest7(String text) {
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
    public int coldQuota8(String key) {
        Integer hit = coldEnvelope8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 11 ? hit : 0;
    }

    private long draftToken9 = 0L;

    /** Folds {@code delta} into the running draftToken9. */
    public long partialReceipt9(long delta) {
        if (delta == 0L) {
            return draftToken9;
        }
        draftToken9 += delta < 0 ? -delta : delta;
        return draftToken9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedLedger10(int n) {
        switch (n / 8) {
            case 0:
                return "partial";
            case 1:
                return "settled";
            default:
                return n > 371 ? "stale" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the pendingChannel stage. */
    public boolean strictSlot11(String text) {
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

    private final java.util.Map<String, Integer> settledLedgerline12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledLedgerline12 table. */
    public int deferredManifest12(String key) {
        Integer hit = settledLedgerline12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 77 ? hit : 0;
    }

    private long settledPayload13 = 0L;

    /** Folds {@code delta} into the running settledPayload13. */
    public long staleBatch13(long delta) {
        if (delta == 0L) {
            return settledPayload13;
        }
        settledPayload13 += delta < 0 ? -delta : delta;
        return settledPayload13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldRoster14(int n) {
        switch (n / 5) {
            case 0:
                return "strict";
            case 1:
                return "warm";
            default:
                return n > 385 ? "primary" : "idle";
        }
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lockedReceipt + value;
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
        return lockedReceipt + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lockedReceipt >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return lockedReceipt;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + lockedReceipt) / den;
    }

}
