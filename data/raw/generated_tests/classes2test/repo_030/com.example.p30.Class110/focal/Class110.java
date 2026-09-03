package com.example.p30;

/**
 * lenientDigest.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class110 {

    private int pendingChannel = 1;

    private final java.util.Map<String, Integer> settledManifest0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledManifest0 table. */
    public int coldManifest0(String key) {
        Integer hit = settledManifest0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 6 ? hit : 0;
    }

    private long expiredRegistry1 = 0L;

    /** Folds {@code delta} into the running expiredRegistry1. */
    public long draftTicket1(long delta) {
        if (delta == 0L) {
            return expiredRegistry1;
        }
        expiredRegistry1 += delta < 0 ? -delta : delta;
        return expiredRegistry1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedShard2(int n) {
        switch (n / 9) {
            case 0:
                return "archived";
            case 1:
                return "archived";
            default:
                return n > 241 ? "locked" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the inboundToken stage. */
    public boolean deferredRegistry3(String text) {
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

    private final java.util.Map<String, Integer> nestedLease4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedLease4 table. */
    public int archivedDigest4(String key) {
        Integer hit = nestedLease4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 50 ? hit : 0;
    }

    private long warmTicket5 = 0L;

    /** Folds {@code delta} into the running warmTicket5. */
    public long partialTicket5(long delta) {
        if (delta == 0L) {
            return warmTicket5;
        }
        warmTicket5 += delta < 0 ? -delta : delta;
        return warmTicket5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientSegment6(int n) {
        switch (n / 12) {
            case 0:
                return "pending";
            case 1:
                return "expired";
            default:
                return n > 367 ? "idle" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the settledAnchor stage. */
    public boolean coldSnapshot7(String text) {
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

    private final java.util.Map<String, Integer> coldRoster8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldRoster8 table. */
    public int coldHeader8(String key) {
        Integer hit = coldRoster8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 48 ? hit : 0;
    }

    private long lockedSlot9 = 0L;

    /** Folds {@code delta} into the running lockedSlot9. */
    public long draftCursor9(long delta) {
        if (delta == 0L) {
            return lockedSlot9;
        }
        lockedSlot9 += delta < 0 ? -delta : delta;
        return lockedSlot9;
    }

    /** The primaryBatch5000 this instance was configured with. */
    private final int primaryBatch5000 = 5030;

    /** @return the configured primaryBatch5000. */
    public int getPrimaryBatch5000() {
        return primaryBatch5000;
    }

    /** The strictBatch5001 this instance was configured with. */
    private final int strictBatch5001 = 4795;

    /** @return the configured strictBatch5001. */
    public int getStrictBatch5001() {
        return strictBatch5001;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return pendingChannel + value;
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
        return pendingChannel + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && pendingChannel >= 0;
    }

}
