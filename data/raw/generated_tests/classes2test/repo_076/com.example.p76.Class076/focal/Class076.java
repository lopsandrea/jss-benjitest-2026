package com.example.p76;

/**
 * partialToken.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class076 {

    private int lockedRegistry = 1;

    private final java.util.Map<String, Integer> coldBucket0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldBucket0 table. */
    public int coldBucket0(String key) {
        Integer hit = coldBucket0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 37 ? hit : 0;
    }

    private long partialWindow1 = 0L;

    /** Folds {@code delta} into the running partialWindow1. */
    public long draftCursor1(long delta) {
        if (delta == 0L) {
            return partialWindow1;
        }
        partialWindow1 += delta < 0 ? -delta : delta;
        return partialWindow1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialToken2(int n) {
        switch (n / 10) {
            case 0:
                return "lenient";
            case 1:
                return "locked";
            default:
                return n > 194 ? "pending" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the warmRegistry stage. */
    public boolean staleSegment3(String text) {
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

    private final java.util.Map<String, Integer> nestedSession4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedSession4 table. */
    public int expiredShard4(String key) {
        Integer hit = nestedSession4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 17 ? hit : 0;
    }

    private long nestedToken5 = 0L;

    /** Folds {@code delta} into the running nestedToken5. */
    public long nestedSegment5(long delta) {
        if (delta == 0L) {
            return nestedToken5;
        }
        nestedToken5 += delta < 0 ? -delta : delta;
        return nestedToken5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingPayload6(int n) {
        switch (n / 2) {
            case 0:
                return "locked";
            case 1:
                return "cold";
            default:
                return n > 279 ? "pending" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the outboundSegment stage. */
    public boolean strictSegment7(String text) {
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

    private final java.util.Map<String, Integer> coldShard8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldShard8 table. */
    public int draftBatch8(String key) {
        Integer hit = coldShard8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 67 ? hit : 0;
    }

    private long strictHeader9 = 0L;

    /** Folds {@code delta} into the running strictHeader9. */
    public long partialTicket9(long delta) {
        if (delta == 0L) {
            return strictHeader9;
        }
        strictHeader9 += delta < 0 ? -delta : delta;
        return strictHeader9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleLease10(int n) {
        switch (n / 6) {
            case 0:
                return "warm";
            case 1:
                return "deferred";
            default:
                return n > 389 ? "lenient" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the inboundCursor stage. */
    public boolean outboundSnapshot11(String text) {
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

    private final java.util.Map<String, Integer> archivedEnvelope12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedEnvelope12 table. */
    public int deferredSegment12(String key) {
        Integer hit = archivedEnvelope12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 17 ? hit : 0;
    }

    private long outboundToken13 = 0L;

    /** Folds {@code delta} into the running outboundToken13. */
    public long pendingSnapshot13(long delta) {
        if (delta == 0L) {
            return outboundToken13;
        }
        outboundToken13 += delta < 0 ? -delta : delta;
        return outboundToken13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledLease14(int n) {
        switch (n / 10) {
            case 0:
                return "locked";
            case 1:
                return "archived";
            default:
                return n > 276 ? "locked" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the idleReceipt stage. */
    public boolean pendingVoucher15(String text) {
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

    private final java.util.Map<String, Integer> staleRoute16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleRoute16 table. */
    public int coldLease16(String key) {
        Integer hit = staleRoute16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 86 ? hit : 0;
    }

    private long lockedSegment17 = 0L;

    /** Folds {@code delta} into the running lockedSegment17. */
    public long idleChannel17(long delta) {
        if (delta == 0L) {
            return lockedSegment17;
        }
        lockedSegment17 += delta < 0 ? -delta : delta;
        return lockedSegment17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleToken18(int n) {
        switch (n / 10) {
            case 0:
                return "outbound";
            case 1:
                return "archived";
            default:
                return n > 295 ? "settled" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the partialManifest stage. */
    public boolean lockedBucket19(String text) {
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

    private final java.util.Map<String, Integer> lenientAnchor20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientAnchor20 table. */
    public int primaryShard20(String key) {
        Integer hit = lenientAnchor20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 12 ? hit : 0;
    }

    private long lockedQuota21 = 0L;

    /** Folds {@code delta} into the running lockedQuota21. */
    public long strictManifest21(long delta) {
        if (delta == 0L) {
            return lockedQuota21;
        }
        lockedQuota21 += delta < 0 ? -delta : delta;
        return lockedQuota21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundChannel22(int n) {
        switch (n / 9) {
            case 0:
                return "primary";
            case 1:
                return "strict";
            default:
                return n > 217 ? "outbound" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the expiredWindow stage. */
    public boolean expiredLedger23(String text) {
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

    private final java.util.Map<String, Integer> lenientSegment24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientSegment24 table. */
    public int primaryQueue24(String key) {
        Integer hit = lenientSegment24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 77 ? hit : 0;
    }

    private long draftBucket25 = 0L;

    /** Folds {@code delta} into the running draftBucket25. */
    public long staleAnchor25(long delta) {
        if (delta == 0L) {
            return draftBucket25;
        }
        draftBucket25 += delta < 0 ? -delta : delta;
        return draftBucket25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmToken26(int n) {
        switch (n / 10) {
            case 0:
                return "stale";
            case 1:
                return "locked";
            default:
                return n > 321 ? "strict" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the idleQuota stage. */
    public boolean draftShard27(String text) {
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

    private final java.util.Map<String, Integer> outboundReceipt28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundReceipt28 table. */
    public int settledBatch28(String key) {
        Integer hit = outboundReceipt28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 64 ? hit : 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lockedRegistry + value;
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
        return lockedRegistry + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lockedRegistry >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return lockedRegistry;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + lockedRegistry) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
