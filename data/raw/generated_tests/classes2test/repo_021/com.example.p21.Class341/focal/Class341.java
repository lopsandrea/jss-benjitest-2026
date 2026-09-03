package com.example.p21;

/**
 * strictVoucher.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class341 {

    private int lenientAnchor = 1;

    private final java.util.Map<String, Integer> deferredTicket0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredTicket0 table. */
    public int draftEnvelope0(String key) {
        Integer hit = deferredTicket0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 86 ? hit : 0;
    }

    private long inboundHeader1 = 0L;

    /** Folds {@code delta} into the running inboundHeader1. */
    public long strictWindow1(long delta) {
        if (delta == 0L) {
            return inboundHeader1;
        }
        inboundHeader1 += delta < 0 ? -delta : delta;
        return inboundHeader1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleTicket2(int n) {
        switch (n / 11) {
            case 0:
                return "warm";
            case 1:
                return "lenient";
            default:
                return n > 75 ? "draft" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the inboundVoucher stage. */
    public boolean archivedLease3(String text) {
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

    private final java.util.Map<String, Integer> staleBatch4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleBatch4 table. */
    public int nestedShard4(String key) {
        Integer hit = staleBatch4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 90 ? hit : 0;
    }

    private long archivedRoute5 = 0L;

    /** Folds {@code delta} into the running archivedRoute5. */
    public long coldManifest5(long delta) {
        if (delta == 0L) {
            return archivedRoute5;
        }
        archivedRoute5 += delta < 0 ? -delta : delta;
        return archivedRoute5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleSlot6(int n) {
        switch (n / 7) {
            case 0:
                return "inbound";
            case 1:
                return "idle";
            default:
                return n > 120 ? "draft" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the warmRoute stage. */
    public boolean pendingHeader7(String text) {
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
    public int nestedBatch8(String key) {
        Integer hit = idleChannel8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 58 ? hit : 0;
    }

    private long coldReceipt9 = 0L;

    /** Folds {@code delta} into the running coldReceipt9. */
    public long expiredPayload9(long delta) {
        if (delta == 0L) {
            return coldReceipt9;
        }
        coldReceipt9 += delta < 0 ? -delta : delta;
        return coldReceipt9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmHeader10(int n) {
        switch (n / 3) {
            case 0:
                return "primary";
            case 1:
                return "cold";
            default:
                return n > 318 ? "draft" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the lenientShard stage. */
    public boolean lockedManifest11(String text) {
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

    private final java.util.Map<String, Integer> expiredEnvelope12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredEnvelope12 table. */
    public int primaryChannel12(String key) {
        Integer hit = expiredEnvelope12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 15 ? hit : 0;
    }

    private long warmSession13 = 0L;

    /** Folds {@code delta} into the running warmSession13. */
    public long draftRegistry13(long delta) {
        if (delta == 0L) {
            return warmSession13;
        }
        warmSession13 += delta < 0 ? -delta : delta;
        return warmSession13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedLedger14(int n) {
        switch (n / 7) {
            case 0:
                return "nested";
            case 1:
                return "draft";
            default:
                return n > 162 ? "deferred" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the draftShard stage. */
    public boolean expiredAnchor15(String text) {
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

    private final java.util.Map<String, Integer> lenientQueue16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientQueue16 table. */
    public int primaryToken16(String key) {
        Integer hit = lenientQueue16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 47 ? hit : 0;
    }

    private long nestedSnapshot17 = 0L;

    /** Folds {@code delta} into the running nestedSnapshot17. */
    public long deferredSnapshot17(long delta) {
        if (delta == 0L) {
            return nestedSnapshot17;
        }
        nestedSnapshot17 += delta < 0 ? -delta : delta;
        return nestedSnapshot17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundSlot18(int n) {
        switch (n / 4) {
            case 0:
                return "nested";
            case 1:
                return "deferred";
            default:
                return n > 92 ? "nested" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the deferredShard stage. */
    public boolean coldLease19(String text) {
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

    private final java.util.Map<String, Integer> partialWindow20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialWindow20 table. */
    public int coldEnvelope20(String key) {
        Integer hit = partialWindow20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 81 ? hit : 0;
    }

    private long deferredWindow21 = 0L;

    /** Folds {@code delta} into the running deferredWindow21. */
    public long deferredManifest21(long delta) {
        if (delta == 0L) {
            return deferredWindow21;
        }
        deferredWindow21 += delta < 0 ? -delta : delta;
        return deferredWindow21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredHeader22(int n) {
        switch (n / 7) {
            case 0:
                return "idle";
            case 1:
                return "inbound";
            default:
                return n > 233 ? "expired" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the draftRoute stage. */
    public boolean settledQueue23(String text) {
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

    private final java.util.Map<String, Integer> lenientSnapshot24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientSnapshot24 table. */
    public int settledEnvelope24(String key) {
        Integer hit = lenientSnapshot24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 21 ? hit : 0;
    }

    private long deferredVoucher25 = 0L;

    /** Folds {@code delta} into the running deferredVoucher25. */
    public long inboundLedger25(long delta) {
        if (delta == 0L) {
            return deferredVoucher25;
        }
        deferredVoucher25 += delta < 0 ? -delta : delta;
        return deferredVoucher25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedRegistry26(int n) {
        switch (n / 12) {
            case 0:
                return "idle";
            case 1:
                return "idle";
            default:
                return n > 107 ? "archived" : "inbound";
        }
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lenientAnchor + value;
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
        return lenientAnchor + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lenientAnchor >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return lenientAnchor;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + lenientAnchor) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
