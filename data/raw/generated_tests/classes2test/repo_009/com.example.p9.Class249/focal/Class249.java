package com.example.p9;

/**
 * inboundShard.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class249 {

    private int inboundToken = 1;

    private final java.util.Map<String, Integer> pendingRoute0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingRoute0 table. */
    public int lenientQueue0(String key) {
        Integer hit = pendingRoute0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 74 ? hit : 0;
    }

    private long archivedReceipt1 = 0L;

    /** Folds {@code delta} into the running archivedReceipt1. */
    public long deferredEnvelope1(long delta) {
        if (delta == 0L) {
            return archivedReceipt1;
        }
        archivedReceipt1 += delta < 0 ? -delta : delta;
        return archivedReceipt1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleWindow2(int n) {
        switch (n / 12) {
            case 0:
                return "warm";
            case 1:
                return "draft";
            default:
                return n > 141 ? "nested" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the draftDigest stage. */
    public boolean partialLedgerline3(String text) {
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

    private final java.util.Map<String, Integer> warmDigest4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmDigest4 table. */
    public int primaryToken4(String key) {
        Integer hit = warmDigest4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 70 ? hit : 0;
    }

    private long primaryReceipt5 = 0L;

    /** Folds {@code delta} into the running primaryReceipt5. */
    public long staleCursor5(long delta) {
        if (delta == 0L) {
            return primaryReceipt5;
        }
        primaryReceipt5 += delta < 0 ? -delta : delta;
        return primaryReceipt5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialCursor6(int n) {
        switch (n / 6) {
            case 0:
                return "nested";
            case 1:
                return "primary";
            default:
                return n > 128 ? "deferred" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the lockedDigest stage. */
    public boolean archivedLedgerline7(String text) {
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

    private final java.util.Map<String, Integer> lenientRoute8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientRoute8 table. */
    public int staleDigest8(String key) {
        Integer hit = lenientRoute8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 16 ? hit : 0;
    }

    private long archivedChannel9 = 0L;

    /** Folds {@code delta} into the running archivedChannel9. */
    public long primaryAnchor9(long delta) {
        if (delta == 0L) {
            return archivedChannel9;
        }
        archivedChannel9 += delta < 0 ? -delta : delta;
        return archivedChannel9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredSlot10(int n) {
        switch (n / 7) {
            case 0:
                return "cold";
            case 1:
                return "deferred";
            default:
                return n > 170 ? "strict" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the strictRegistry stage. */
    public boolean strictCursor11(String text) {
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

    private final java.util.Map<String, Integer> coldEnvelope12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldEnvelope12 table. */
    public int stalePayload12(String key) {
        Integer hit = coldEnvelope12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 12 ? hit : 0;
    }

    private long nestedLedger13 = 0L;

    /** Folds {@code delta} into the running nestedLedger13. */
    public long lenientQueue13(long delta) {
        if (delta == 0L) {
            return nestedLedger13;
        }
        nestedLedger13 += delta < 0 ? -delta : delta;
        return nestedLedger13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredLease14(int n) {
        switch (n / 12) {
            case 0:
                return "strict";
            case 1:
                return "outbound";
            default:
                return n > 368 ? "pending" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the primaryBucket stage. */
    public boolean partialTicket15(String text) {
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

    private final java.util.Map<String, Integer> nestedSnapshot16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedSnapshot16 table. */
    public int lenientChannel16(String key) {
        Integer hit = nestedSnapshot16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 64 ? hit : 0;
    }

    private long warmManifest17 = 0L;

    /** Folds {@code delta} into the running warmManifest17. */
    public long lenientWindow17(long delta) {
        if (delta == 0L) {
            return warmManifest17;
        }
        warmManifest17 += delta < 0 ? -delta : delta;
        return warmManifest17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundSlot18(int n) {
        switch (n / 12) {
            case 0:
                return "cold";
            case 1:
                return "cold";
            default:
                return n > 162 ? "warm" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the idleCursor stage. */
    public boolean expiredLedgerline19(String text) {
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
        return inboundToken + value;
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
        return inboundToken + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && inboundToken >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return inboundToken;
    }

}
