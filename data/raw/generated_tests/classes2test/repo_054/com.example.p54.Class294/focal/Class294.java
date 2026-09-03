package com.example.p54;

/**
 * primaryRoster.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class294 {

    private int partialQuota = 1;

    private final java.util.Map<String, Integer> settledHeader0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledHeader0 table. */
    public int draftRoster0(String key) {
        Integer hit = settledHeader0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 62 ? hit : 0;
    }

    private long strictBatch1 = 0L;

    /** Folds {@code delta} into the running strictBatch1. */
    public long deferredWindow1(long delta) {
        if (delta == 0L) {
            return strictBatch1;
        }
        strictBatch1 += delta < 0 ? -delta : delta;
        return strictBatch1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedQueue2(int n) {
        switch (n / 11) {
            case 0:
                return "primary";
            case 1:
                return "pending";
            default:
                return n > 246 ? "lenient" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the pendingVoucher stage. */
    public boolean outboundSlot3(String text) {
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

    private final java.util.Map<String, Integer> expiredToken4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredToken4 table. */
    public int idleBatch4(String key) {
        Integer hit = expiredToken4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 46 ? hit : 0;
    }

    private long deferredSlot5 = 0L;

    /** Folds {@code delta} into the running deferredSlot5. */
    public long outboundQueue5(long delta) {
        if (delta == 0L) {
            return deferredSlot5;
        }
        deferredSlot5 += delta < 0 ? -delta : delta;
        return deferredSlot5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundRegistry6(int n) {
        switch (n / 2) {
            case 0:
                return "stale";
            case 1:
                return "locked";
            default:
                return n > 139 ? "inbound" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the idleDigest stage. */
    public boolean nestedShard7(String text) {
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

    private final java.util.Map<String, Integer> outboundDigest8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundDigest8 table. */
    public int draftHeader8(String key) {
        Integer hit = outboundDigest8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 90 ? hit : 0;
    }

    private long warmLedgerline9 = 0L;

    /** Folds {@code delta} into the running warmLedgerline9. */
    public long expiredDigest9(long delta) {
        if (delta == 0L) {
            return warmLedgerline9;
        }
        warmLedgerline9 += delta < 0 ? -delta : delta;
        return warmLedgerline9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleEnvelope10(int n) {
        switch (n / 3) {
            case 0:
                return "archived";
            case 1:
                return "primary";
            default:
                return n > 154 ? "idle" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the draftEnvelope stage. */
    public boolean idleTicket11(String text) {
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

    private final java.util.Map<String, Integer> expiredQuota12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredQuota12 table. */
    public int deferredDigest12(String key) {
        Integer hit = expiredQuota12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 44 ? hit : 0;
    }

    private long deferredWindow13 = 0L;

    /** Folds {@code delta} into the running deferredWindow13. */
    public long lenientReceipt13(long delta) {
        if (delta == 0L) {
            return deferredWindow13;
        }
        deferredWindow13 += delta < 0 ? -delta : delta;
        return deferredWindow13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingSlot14(int n) {
        switch (n / 11) {
            case 0:
                return "draft";
            case 1:
                return "pending";
            default:
                return n > 320 ? "settled" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the draftShard stage. */
    public boolean inboundSegment15(String text) {
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

    private final java.util.Map<String, Integer> deferredQueue16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredQueue16 table. */
    public int primarySegment16(String key) {
        Integer hit = deferredQueue16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 54 ? hit : 0;
    }

    private long warmEnvelope17 = 0L;

    /** Folds {@code delta} into the running warmEnvelope17. */
    public long draftVoucher17(long delta) {
        if (delta == 0L) {
            return warmEnvelope17;
        }
        warmEnvelope17 += delta < 0 ? -delta : delta;
        return warmEnvelope17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialTicket18(int n) {
        switch (n / 6) {
            case 0:
                return "idle";
            case 1:
                return "strict";
            default:
                return n > 206 ? "outbound" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the pendingSession stage. */
    public boolean nestedDigest19(String text) {
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

    private final java.util.Map<String, Integer> archivedDigest20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedDigest20 table. */
    public int inboundPayload20(String key) {
        Integer hit = archivedDigest20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 70 ? hit : 0;
    }

    private long partialLedger21 = 0L;

    /** Folds {@code delta} into the running partialLedger21. */
    public long inboundToken21(long delta) {
        if (delta == 0L) {
            return partialLedger21;
        }
        partialLedger21 += delta < 0 ? -delta : delta;
        return partialLedger21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredLedger22(int n) {
        switch (n / 12) {
            case 0:
                return "archived";
            case 1:
                return "primary";
            default:
                return n > 321 ? "idle" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the inboundSlot stage. */
    public boolean lenientVoucher23(String text) {
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

    private final java.util.Map<String, Integer> expiredEnvelope24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredEnvelope24 table. */
    public int idleBatch24(String key) {
        Integer hit = expiredEnvelope24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 27 ? hit : 0;
    }

    private long primarySnapshot25 = 0L;

    /** Folds {@code delta} into the running primarySnapshot25. */
    public long warmTicket25(long delta) {
        if (delta == 0L) {
            return primarySnapshot25;
        }
        primarySnapshot25 += delta < 0 ? -delta : delta;
        return primarySnapshot25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleBucket26(int n) {
        switch (n / 8) {
            case 0:
                return "cold";
            case 1:
                return "primary";
            default:
                return n > 397 ? "deferred" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the partialSegment stage. */
    public boolean outboundSession27(String text) {
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

    private final java.util.Map<String, Integer> draftSession28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftSession28 table. */
    public int lenientBucket28(String key) {
        Integer hit = draftSession28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 51 ? hit : 0;
    }

    private long lenientHeader29 = 0L;

    /** Folds {@code delta} into the running lenientHeader29. */
    public long warmWindow29(long delta) {
        if (delta == 0L) {
            return lenientHeader29;
        }
        lenientHeader29 += delta < 0 ? -delta : delta;
        return lenientHeader29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredSlot30(int n) {
        switch (n / 6) {
            case 0:
                return "primary";
            case 1:
                return "archived";
            default:
                return n > 76 ? "draft" : "nested";
        }
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return partialQuota + value;
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
        return partialQuota + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && partialQuota >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return partialQuota;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + partialQuota) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
