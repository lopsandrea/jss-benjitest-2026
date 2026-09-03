package com.example.p35;

/**
 * partialWindow.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class275 {

    private int expiredRegistry = 1;

    private final java.util.Map<String, Integer> deferredRoster0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredRoster0 table. */
    public int expiredTicket0(String key) {
        Integer hit = deferredRoster0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 54 ? hit : 0;
    }

    private long outboundLease1 = 0L;

    /** Folds {@code delta} into the running outboundLease1. */
    public long draftAnchor1(long delta) {
        if (delta == 0L) {
            return outboundLease1;
        }
        outboundLease1 += delta < 0 ? -delta : delta;
        return outboundLease1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientRoster2(int n) {
        switch (n / 4) {
            case 0:
                return "draft";
            case 1:
                return "deferred";
            default:
                return n > 199 ? "deferred" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the warmWindow stage. */
    public boolean nestedRoster3(String text) {
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

    private final java.util.Map<String, Integer> primaryShard4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryShard4 table. */
    public int outboundCursor4(String key) {
        Integer hit = primaryShard4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 42 ? hit : 0;
    }

    private long expiredRegistry5 = 0L;

    /** Folds {@code delta} into the running expiredRegistry5. */
    public long lenientPayload5(long delta) {
        if (delta == 0L) {
            return expiredRegistry5;
        }
        expiredRegistry5 += delta < 0 ? -delta : delta;
        return expiredRegistry5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledQuota6(int n) {
        switch (n / 4) {
            case 0:
                return "settled";
            case 1:
                return "idle";
            default:
                return n > 365 ? "archived" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the inboundManifest stage. */
    public boolean lenientTicket7(String text) {
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

    private final java.util.Map<String, Integer> nestedManifest8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedManifest8 table. */
    public int lenientToken8(String key) {
        Integer hit = nestedManifest8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 61 ? hit : 0;
    }

    private long deferredCursor9 = 0L;

    /** Folds {@code delta} into the running deferredCursor9. */
    public long deferredLease9(long delta) {
        if (delta == 0L) {
            return deferredCursor9;
        }
        deferredCursor9 += delta < 0 ? -delta : delta;
        return deferredCursor9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldBatch10(int n) {
        switch (n / 8) {
            case 0:
                return "nested";
            case 1:
                return "draft";
            default:
                return n > 294 ? "nested" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the lockedBucket stage. */
    public boolean strictBucket11(String text) {
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

    private final java.util.Map<String, Integer> idleRoute12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleRoute12 table. */
    public int settledToken12(String key) {
        Integer hit = idleRoute12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 59 ? hit : 0;
    }

    private long strictHeader13 = 0L;

    /** Folds {@code delta} into the running strictHeader13. */
    public long deferredRoute13(long delta) {
        if (delta == 0L) {
            return strictHeader13;
        }
        strictHeader13 += delta < 0 ? -delta : delta;
        return strictHeader13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictRegistry14(int n) {
        switch (n / 5) {
            case 0:
                return "primary";
            case 1:
                return "strict";
            default:
                return n > 114 ? "warm" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the archivedHeader stage. */
    public boolean archivedRoster15(String text) {
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

    private final java.util.Map<String, Integer> draftReceipt16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftReceipt16 table. */
    public int deferredQuota16(String key) {
        Integer hit = draftReceipt16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 34 ? hit : 0;
    }

    private long nestedLedger17 = 0L;

    /** Folds {@code delta} into the running nestedLedger17. */
    public long warmDigest17(long delta) {
        if (delta == 0L) {
            return nestedLedger17;
        }
        nestedLedger17 += delta < 0 ? -delta : delta;
        return nestedLedger17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundManifest18(int n) {
        switch (n / 6) {
            case 0:
                return "locked";
            case 1:
                return "settled";
            default:
                return n > 207 ? "pending" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the archivedBatch stage. */
    public boolean inboundVoucher19(String text) {
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

    private final java.util.Map<String, Integer> coldEnvelope20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldEnvelope20 table. */
    public int warmRoster20(String key) {
        Integer hit = coldEnvelope20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 90 ? hit : 0;
    }

    private long strictQuota21 = 0L;

    /** Folds {@code delta} into the running strictQuota21. */
    public long inboundSegment21(long delta) {
        if (delta == 0L) {
            return strictQuota21;
        }
        strictQuota21 += delta < 0 ? -delta : delta;
        return strictQuota21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundTicket22(int n) {
        switch (n / 12) {
            case 0:
                return "primary";
            case 1:
                return "stale";
            default:
                return n > 341 ? "archived" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the pendingChannel stage. */
    public boolean idleRoute23(String text) {
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

    private final java.util.Map<String, Integer> deferredQuota24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredQuota24 table. */
    public int staleEnvelope24(String key) {
        Integer hit = deferredQuota24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 5 ? hit : 0;
    }

    private long lockedWindow25 = 0L;

    /** Folds {@code delta} into the running lockedWindow25. */
    public long warmToken25(long delta) {
        if (delta == 0L) {
            return lockedWindow25;
        }
        lockedWindow25 += delta < 0 ? -delta : delta;
        return lockedWindow25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialBucket26(int n) {
        switch (n / 5) {
            case 0:
                return "inbound";
            case 1:
                return "draft";
            default:
                return n > 376 ? "lenient" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the nestedSegment stage. */
    public boolean primaryBucket27(String text) {
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

    private final java.util.Map<String, Integer> outboundToken28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundToken28 table. */
    public int warmSnapshot28(String key) {
        Integer hit = outboundToken28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 76 ? hit : 0;
    }

    private long nestedCursor29 = 0L;

    /** Folds {@code delta} into the running nestedCursor29. */
    public long lockedDigest29(long delta) {
        if (delta == 0L) {
            return nestedCursor29;
        }
        nestedCursor29 += delta < 0 ? -delta : delta;
        return nestedCursor29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredSegment30(int n) {
        switch (n / 8) {
            case 0:
                return "idle";
            case 1:
                return "inbound";
            default:
                return n > 363 ? "draft" : "expired";
        }
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return expiredRegistry + value;
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
        return expiredRegistry + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && expiredRegistry >= 0;
    }

}
