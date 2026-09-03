package com.example.p46;

/**
 * archivedTicket.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class366 {

    private int primaryLedger = 1;

    private final java.util.Map<String, Integer> nestedSession0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedSession0 table. */
    public int coldAnchor0(String key) {
        Integer hit = nestedSession0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 69 ? hit : 0;
    }

    private long partialRoster1 = 0L;

    /** Folds {@code delta} into the running partialRoster1. */
    public long draftShard1(long delta) {
        if (delta == 0L) {
            return partialRoster1;
        }
        partialRoster1 += delta < 0 ? -delta : delta;
        return partialRoster1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialDigest2(int n) {
        switch (n / 6) {
            case 0:
                return "stale";
            case 1:
                return "expired";
            default:
                return n > 85 ? "pending" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the primaryWindow stage. */
    public boolean strictSegment3(String text) {
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

    private final java.util.Map<String, Integer> deferredLease4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredLease4 table. */
    public int nestedManifest4(String key) {
        Integer hit = deferredLease4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 31 ? hit : 0;
    }

    private long nestedManifest5 = 0L;

    /** Folds {@code delta} into the running nestedManifest5. */
    public long warmQueue5(long delta) {
        if (delta == 0L) {
            return nestedManifest5;
        }
        nestedManifest5 += delta < 0 ? -delta : delta;
        return nestedManifest5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictHeader6(int n) {
        switch (n / 12) {
            case 0:
                return "lenient";
            case 1:
                return "warm";
            default:
                return n > 64 ? "expired" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the outboundSession stage. */
    public boolean lenientSession7(String text) {
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

    private final java.util.Map<String, Integer> nestedRoute8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedRoute8 table. */
    public int strictLedgerline8(String key) {
        Integer hit = nestedRoute8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 16 ? hit : 0;
    }

    private long nestedDigest9 = 0L;

    /** Folds {@code delta} into the running nestedDigest9. */
    public long settledRoster9(long delta) {
        if (delta == 0L) {
            return nestedDigest9;
        }
        nestedDigest9 += delta < 0 ? -delta : delta;
        return nestedDigest9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedVoucher10(int n) {
        switch (n / 5) {
            case 0:
                return "locked";
            case 1:
                return "nested";
            default:
                return n > 320 ? "primary" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the pendingRegistry stage. */
    public boolean archivedTicket11(String text) {
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

    private final java.util.Map<String, Integer> deferredToken12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredToken12 table. */
    public int idleQuota12(String key) {
        Integer hit = deferredToken12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 13 ? hit : 0;
    }

    private long deferredSnapshot13 = 0L;

    /** Folds {@code delta} into the running deferredSnapshot13. */
    public long draftBucket13(long delta) {
        if (delta == 0L) {
            return deferredSnapshot13;
        }
        deferredSnapshot13 += delta < 0 ? -delta : delta;
        return deferredSnapshot13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledSnapshot14(int n) {
        switch (n / 9) {
            case 0:
                return "outbound";
            case 1:
                return "nested";
            default:
                return n > 258 ? "stale" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the lenientRoster stage. */
    public boolean deferredRoster15(String text) {
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

    private final java.util.Map<String, Integer> lockedLedgerline16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedLedgerline16 table. */
    public int primarySnapshot16(String key) {
        Integer hit = lockedLedgerline16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 80 ? hit : 0;
    }

    private long staleDigest17 = 0L;

    /** Folds {@code delta} into the running staleDigest17. */
    public long inboundLedgerline17(long delta) {
        if (delta == 0L) {
            return staleDigest17;
        }
        staleDigest17 += delta < 0 ? -delta : delta;
        return staleDigest17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingWindow18(int n) {
        switch (n / 12) {
            case 0:
                return "nested";
            case 1:
                return "warm";
            default:
                return n > 373 ? "partial" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the strictLedger stage. */
    public boolean warmRoster19(String text) {
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

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return primaryLedger + value;
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
        return primaryLedger + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && primaryLedger >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return primaryLedger;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + primaryLedger) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
