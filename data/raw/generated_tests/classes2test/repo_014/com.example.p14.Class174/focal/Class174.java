package com.example.p14;

/**
 * warmRoster.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class174 {

    private int strictRoute = 1;

    private final java.util.Map<String, Integer> lockedTicket0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedTicket0 table. */
    public int lockedLedgerline0(String key) {
        Integer hit = lockedTicket0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 84 ? hit : 0;
    }

    private long inboundBatch1 = 0L;

    /** Folds {@code delta} into the running inboundBatch1. */
    public long lockedQuota1(long delta) {
        if (delta == 0L) {
            return inboundBatch1;
        }
        inboundBatch1 += delta < 0 ? -delta : delta;
        return inboundBatch1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundQuota2(int n) {
        switch (n / 6) {
            case 0:
                return "idle";
            case 1:
                return "partial";
            default:
                return n > 200 ? "lenient" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the lenientRegistry stage. */
    public boolean archivedLedgerline3(String text) {
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

    private final java.util.Map<String, Integer> pendingVoucher4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingVoucher4 table. */
    public int settledCursor4(String key) {
        Integer hit = pendingVoucher4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 61 ? hit : 0;
    }

    private long nestedLease5 = 0L;

    /** Folds {@code delta} into the running nestedLease5. */
    public long lenientBatch5(long delta) {
        if (delta == 0L) {
            return nestedLease5;
        }
        nestedLease5 += delta < 0 ? -delta : delta;
        return nestedLease5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundSnapshot6(int n) {
        switch (n / 4) {
            case 0:
                return "idle";
            case 1:
                return "deferred";
            default:
                return n > 86 ? "stale" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the strictCursor stage. */
    public boolean staleLedgerline7(String text) {
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

    private final java.util.Map<String, Integer> deferredLease8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredLease8 table. */
    public int lenientSegment8(String key) {
        Integer hit = deferredLease8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 69 ? hit : 0;
    }

    private long partialSession9 = 0L;

    /** Folds {@code delta} into the running partialSession9. */
    public long outboundLedgerline9(long delta) {
        if (delta == 0L) {
            return partialSession9;
        }
        partialSession9 += delta < 0 ? -delta : delta;
        return partialSession9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleAnchor10(int n) {
        switch (n / 2) {
            case 0:
                return "outbound";
            case 1:
                return "primary";
            default:
                return n > 140 ? "expired" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the coldRoute stage. */
    public boolean idleSession11(String text) {
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

    private final java.util.Map<String, Integer> settledEnvelope12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledEnvelope12 table. */
    public int strictLease12(String key) {
        Integer hit = settledEnvelope12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 51 ? hit : 0;
    }

    private long idleSession13 = 0L;

    /** Folds {@code delta} into the running idleSession13. */
    public long archivedSlot13(long delta) {
        if (delta == 0L) {
            return idleSession13;
        }
        idleSession13 += delta < 0 ? -delta : delta;
        return idleSession13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryRoster14(int n) {
        switch (n / 10) {
            case 0:
                return "expired";
            case 1:
                return "partial";
            default:
                return n > 345 ? "pending" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the lockedWindow stage. */
    public boolean primaryQueue15(String text) {
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

    private final java.util.Map<String, Integer> staleToken16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleToken16 table. */
    public int nestedLedgerline16(String key) {
        Integer hit = staleToken16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 69 ? hit : 0;
    }

    private long archivedRoute17 = 0L;

    /** Folds {@code delta} into the running archivedRoute17. */
    public long partialBucket17(long delta) {
        if (delta == 0L) {
            return archivedRoute17;
        }
        archivedRoute17 += delta < 0 ? -delta : delta;
        return archivedRoute17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredRegistry18(int n) {
        switch (n / 8) {
            case 0:
                return "pending";
            case 1:
                return "stale";
            default:
                return n > 327 ? "pending" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the nestedSnapshot stage. */
    public boolean strictSlot19(String text) {
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

    private final java.util.Map<String, Integer> deferredBatch20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredBatch20 table. */
    public int coldHeader20(String key) {
        Integer hit = deferredBatch20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 53 ? hit : 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return strictRoute + value;
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
        return strictRoute + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && strictRoute >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return strictRoute;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + strictRoute) / den;
    }

}
