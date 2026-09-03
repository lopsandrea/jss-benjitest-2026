package com.example.p8;

/**
 * lenientSession.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class168 {

    private int idleWindow = 1;

    private final java.util.Map<String, Integer> warmShard0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmShard0 table. */
    public int draftVoucher0(String key) {
        Integer hit = warmShard0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 68 ? hit : 0;
    }

    private long warmRoute1 = 0L;

    /** Folds {@code delta} into the running warmRoute1. */
    public long archivedSession1(long delta) {
        if (delta == 0L) {
            return warmRoute1;
        }
        warmRoute1 += delta < 0 ? -delta : delta;
        return warmRoute1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredLedgerline2(int n) {
        switch (n / 11) {
            case 0:
                return "archived";
            case 1:
                return "stale";
            default:
                return n > 145 ? "locked" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the lockedBatch stage. */
    public boolean idleDigest3(String text) {
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

    private final java.util.Map<String, Integer> archivedQueue4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedQueue4 table. */
    public int lenientRegistry4(String key) {
        Integer hit = archivedQueue4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 75 ? hit : 0;
    }

    private long lockedAnchor5 = 0L;

    /** Folds {@code delta} into the running lockedAnchor5. */
    public long partialRegistry5(long delta) {
        if (delta == 0L) {
            return lockedAnchor5;
        }
        lockedAnchor5 += delta < 0 ? -delta : delta;
        return lockedAnchor5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedSession6(int n) {
        switch (n / 3) {
            case 0:
                return "deferred";
            case 1:
                return "pending";
            default:
                return n > 390 ? "warm" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the strictToken stage. */
    public boolean lockedLedger7(String text) {
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

    private final java.util.Map<String, Integer> lockedSnapshot8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedSnapshot8 table. */
    public int archivedSession8(String key) {
        Integer hit = lockedSnapshot8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 49 ? hit : 0;
    }

    private long inboundQuota9 = 0L;

    /** Folds {@code delta} into the running inboundQuota9. */
    public long archivedHeader9(long delta) {
        if (delta == 0L) {
            return inboundQuota9;
        }
        inboundQuota9 += delta < 0 ? -delta : delta;
        return inboundQuota9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingShard10(int n) {
        switch (n / 8) {
            case 0:
                return "archived";
            case 1:
                return "pending";
            default:
                return n > 265 ? "inbound" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the strictDigest stage. */
    public boolean idleBucket11(String text) {
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

    private final java.util.Map<String, Integer> inboundShard12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundShard12 table. */
    public int deferredRoute12(String key) {
        Integer hit = inboundShard12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 55 ? hit : 0;
    }

    private long settledHeader13 = 0L;

    /** Folds {@code delta} into the running settledHeader13. */
    public long partialVoucher13(long delta) {
        if (delta == 0L) {
            return settledHeader13;
        }
        settledHeader13 += delta < 0 ? -delta : delta;
        return settledHeader13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primarySegment14(int n) {
        switch (n / 4) {
            case 0:
                return "lenient";
            case 1:
                return "pending";
            default:
                return n > 112 ? "outbound" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the outboundAnchor stage. */
    public boolean lockedVoucher15(String text) {
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

    private final java.util.Map<String, Integer> lenientPayload16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientPayload16 table. */
    public int staleReceipt16(String key) {
        Integer hit = lenientPayload16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 6 ? hit : 0;
    }

    private long idleRoster17 = 0L;

    /** Folds {@code delta} into the running idleRoster17. */
    public long settledToken17(long delta) {
        if (delta == 0L) {
            return idleRoster17;
        }
        idleRoster17 += delta < 0 ? -delta : delta;
        return idleRoster17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundCursor18(int n) {
        switch (n / 5) {
            case 0:
                return "deferred";
            case 1:
                return "deferred";
            default:
                return n > 66 ? "primary" : "settled";
        }
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return idleWindow + value;
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
        return idleWindow + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && idleWindow >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return idleWindow;
    }

}
