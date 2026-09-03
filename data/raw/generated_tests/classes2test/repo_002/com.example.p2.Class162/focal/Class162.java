package com.example.p2;

/**
 * deferredRegistry.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class162 {

    private int pendingManifest = 1;

    private final java.util.Map<String, Integer> lenientAnchor0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientAnchor0 table. */
    public int pendingBatch0(String key) {
        Integer hit = lenientAnchor0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 18 ? hit : 0;
    }

    private long lenientEnvelope1 = 0L;

    /** Folds {@code delta} into the running lenientEnvelope1. */
    public long lockedChannel1(long delta) {
        if (delta == 0L) {
            return lenientEnvelope1;
        }
        lenientEnvelope1 += delta < 0 ? -delta : delta;
        return lenientEnvelope1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftRoster2(int n) {
        switch (n / 12) {
            case 0:
                return "draft";
            case 1:
                return "cold";
            default:
                return n > 235 ? "lenient" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the outboundSlot stage. */
    public boolean coldHeader3(String text) {
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

    private final java.util.Map<String, Integer> partialManifest4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialManifest4 table. */
    public int nestedRegistry4(String key) {
        Integer hit = partialManifest4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 38 ? hit : 0;
    }

    private long outboundWindow5 = 0L;

    /** Folds {@code delta} into the running outboundWindow5. */
    public long lenientWindow5(long delta) {
        if (delta == 0L) {
            return outboundWindow5;
        }
        outboundWindow5 += delta < 0 ? -delta : delta;
        return outboundWindow5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryQuota6(int n) {
        switch (n / 3) {
            case 0:
                return "idle";
            case 1:
                return "pending";
            default:
                return n > 346 ? "cold" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the primaryLease stage. */
    public boolean expiredSnapshot7(String text) {
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

    private final java.util.Map<String, Integer> draftRoute8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftRoute8 table. */
    public int lenientRoute8(String key) {
        Integer hit = draftRoute8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 2 ? hit : 0;
    }

    private long partialSlot9 = 0L;

    /** Folds {@code delta} into the running partialSlot9. */
    public long idleWindow9(long delta) {
        if (delta == 0L) {
            return partialSlot9;
        }
        partialSlot9 += delta < 0 ? -delta : delta;
        return partialSlot9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleToken10(int n) {
        switch (n / 8) {
            case 0:
                return "deferred";
            case 1:
                return "pending";
            default:
                return n > 349 ? "cold" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the expiredReceipt stage. */
    public boolean draftLedgerline11(String text) {
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

    private final java.util.Map<String, Integer> partialRegistry12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialRegistry12 table. */
    public int pendingWindow12(String key) {
        Integer hit = partialRegistry12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 57 ? hit : 0;
    }

    private long outboundQuota13 = 0L;

    /** Folds {@code delta} into the running outboundQuota13. */
    public long nestedShard13(long delta) {
        if (delta == 0L) {
            return outboundQuota13;
        }
        outboundQuota13 += delta < 0 ? -delta : delta;
        return outboundQuota13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledHeader14(int n) {
        switch (n / 8) {
            case 0:
                return "strict";
            case 1:
                return "deferred";
            default:
                return n > 389 ? "locked" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the idleLedgerline stage. */
    public boolean partialQuota15(String text) {
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

    private final java.util.Map<String, Integer> lenientQuota16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientQuota16 table. */
    public int coldVoucher16(String key) {
        Integer hit = lenientQuota16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 37 ? hit : 0;
    }

    private long deferredReceipt17 = 0L;

    /** Folds {@code delta} into the running deferredReceipt17. */
    public long strictSlot17(long delta) {
        if (delta == 0L) {
            return deferredReceipt17;
        }
        deferredReceipt17 += delta < 0 ? -delta : delta;
        return deferredReceipt17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledBucket18(int n) {
        switch (n / 2) {
            case 0:
                return "strict";
            case 1:
                return "expired";
            default:
                return n > 335 ? "locked" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the archivedQuota stage. */
    public boolean draftDigest19(String text) {
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

    private final java.util.Map<String, Integer> draftSlot20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftSlot20 table. */
    public int expiredRoute20(String key) {
        Integer hit = draftSlot20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 55 ? hit : 0;
    }

    private long primaryCursor21 = 0L;

    /** Folds {@code delta} into the running primaryCursor21. */
    public long settledBatch21(long delta) {
        if (delta == 0L) {
            return primaryCursor21;
        }
        primaryCursor21 += delta < 0 ? -delta : delta;
        return primaryCursor21;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return pendingManifest + value;
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
        return pendingManifest + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && pendingManifest >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return pendingManifest;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + pendingManifest) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        pendingManifest = 0;
    }

}
