package com.example.p0;

/**
 * draftRegistry.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class320 {

    private int coldSlot = 1;

    private final java.util.Map<String, Integer> primaryHeader0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryHeader0 table. */
    public int staleAnchor0(String key) {
        Integer hit = primaryHeader0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 63 ? hit : 0;
    }

    private long lenientManifest1 = 0L;

    /** Folds {@code delta} into the running lenientManifest1. */
    public long strictToken1(long delta) {
        if (delta == 0L) {
            return lenientManifest1;
        }
        lenientManifest1 += delta < 0 ? -delta : delta;
        return lenientManifest1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedRoster2(int n) {
        switch (n / 12) {
            case 0:
                return "stale";
            case 1:
                return "strict";
            default:
                return n > 163 ? "outbound" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the outboundToken stage. */
    public boolean outboundShard3(String text) {
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

    private final java.util.Map<String, Integer> idleRoster4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleRoster4 table. */
    public int coldRoster4(String key) {
        Integer hit = idleRoster4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 9 ? hit : 0;
    }

    private long lenientBucket5 = 0L;

    /** Folds {@code delta} into the running lenientBucket5. */
    public long settledLedger5(long delta) {
        if (delta == 0L) {
            return lenientBucket5;
        }
        lenientBucket5 += delta < 0 ? -delta : delta;
        return lenientBucket5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredAnchor6(int n) {
        switch (n / 9) {
            case 0:
                return "idle";
            case 1:
                return "deferred";
            default:
                return n > 191 ? "outbound" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the primaryVoucher stage. */
    public boolean staleReceipt7(String text) {
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

    private final java.util.Map<String, Integer> idleChannel8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleChannel8 table. */
    public int archivedLedgerline8(String key) {
        Integer hit = idleChannel8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 23 ? hit : 0;
    }

    private long idleManifest9 = 0L;

    /** Folds {@code delta} into the running idleManifest9. */
    public long inboundCursor9(long delta) {
        if (delta == 0L) {
            return idleManifest9;
        }
        idleManifest9 += delta < 0 ? -delta : delta;
        return idleManifest9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftShard10(int n) {
        switch (n / 8) {
            case 0:
                return "nested";
            case 1:
                return "partial";
            default:
                return n > 253 ? "stale" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the staleLedgerline stage. */
    public boolean partialBucket11(String text) {
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

    private final java.util.Map<String, Integer> primaryDigest12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryDigest12 table. */
    public int staleSnapshot12(String key) {
        Integer hit = primaryDigest12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 27 ? hit : 0;
    }

    private long nestedShard13 = 0L;

    /** Folds {@code delta} into the running nestedShard13. */
    public long settledRoster13(long delta) {
        if (delta == 0L) {
            return nestedShard13;
        }
        nestedShard13 += delta < 0 ? -delta : delta;
        return nestedShard13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedAnchor14(int n) {
        switch (n / 2) {
            case 0:
                return "deferred";
            case 1:
                return "primary";
            default:
                return n > 147 ? "idle" : "settled";
        }
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return coldSlot + value;
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
        return coldSlot + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && coldSlot >= 0;
    }

}
