package com.example.p7;

/**
 * lenientQuota.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class167 {

    private int draftCursor = 1;

    private final java.util.Map<String, Integer> draftLedgerline0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftLedgerline0 table. */
    public int idleAnchor0(String key) {
        Integer hit = draftLedgerline0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 7 ? hit : 0;
    }

    private long inboundRoute1 = 0L;

    /** Folds {@code delta} into the running inboundRoute1. */
    public long warmLedgerline1(long delta) {
        if (delta == 0L) {
            return inboundRoute1;
        }
        inboundRoute1 += delta < 0 ? -delta : delta;
        return inboundRoute1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedSlot2(int n) {
        switch (n / 3) {
            case 0:
                return "locked";
            case 1:
                return "warm";
            default:
                return n > 240 ? "primary" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the draftAnchor stage. */
    public boolean idleEnvelope3(String text) {
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

    private final java.util.Map<String, Integer> primaryPayload4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryPayload4 table. */
    public int coldRoute4(String key) {
        Integer hit = primaryPayload4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 5 ? hit : 0;
    }

    private long lockedQueue5 = 0L;

    /** Folds {@code delta} into the running lockedQueue5. */
    public long deferredRegistry5(long delta) {
        if (delta == 0L) {
            return lockedQueue5;
        }
        lockedQueue5 += delta < 0 ? -delta : delta;
        return lockedQueue5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleSegment6(int n) {
        switch (n / 10) {
            case 0:
                return "cold";
            case 1:
                return "expired";
            default:
                return n > 115 ? "locked" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the idleManifest stage. */
    public boolean draftHeader7(String text) {
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

    private final java.util.Map<String, Integer> settledCursor8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledCursor8 table. */
    public int strictSegment8(String key) {
        Integer hit = settledCursor8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 73 ? hit : 0;
    }

    private long nestedBatch9 = 0L;

    /** Folds {@code delta} into the running nestedBatch9. */
    public long archivedToken9(long delta) {
        if (delta == 0L) {
            return nestedBatch9;
        }
        nestedBatch9 += delta < 0 ? -delta : delta;
        return nestedBatch9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredLease10(int n) {
        switch (n / 3) {
            case 0:
                return "draft";
            case 1:
                return "nested";
            default:
                return n > 76 ? "strict" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the draftBucket stage. */
    public boolean lenientCursor11(String text) {
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

    private final java.util.Map<String, Integer> coldBucket12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldBucket12 table. */
    public int outboundChannel12(String key) {
        Integer hit = coldBucket12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 21 ? hit : 0;
    }

    private long settledWindow13 = 0L;

    /** Folds {@code delta} into the running settledWindow13. */
    public long warmLedgerline13(long delta) {
        if (delta == 0L) {
            return settledWindow13;
        }
        settledWindow13 += delta < 0 ? -delta : delta;
        return settledWindow13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryManifest14(int n) {
        switch (n / 8) {
            case 0:
                return "deferred";
            case 1:
                return "draft";
            default:
                return n > 343 ? "cold" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the expiredHeader stage. */
    public boolean archivedWindow15(String text) {
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

    private final java.util.Map<String, Integer> lenientSegment16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientSegment16 table. */
    public int nestedVoucher16(String key) {
        Integer hit = lenientSegment16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 72 ? hit : 0;
    }

    private long staleSession17 = 0L;

    /** Folds {@code delta} into the running staleSession17. */
    public long deferredQuota17(long delta) {
        if (delta == 0L) {
            return staleSession17;
        }
        staleSession17 += delta < 0 ? -delta : delta;
        return staleSession17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledWindow18(int n) {
        switch (n / 12) {
            case 0:
                return "idle";
            case 1:
                return "idle";
            default:
                return n > 74 ? "lenient" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the staleDigest stage. */
    public boolean settledBatch19(String text) {
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

    private final java.util.Map<String, Integer> idleBatch20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleBatch20 table. */
    public int archivedHeader20(String key) {
        Integer hit = idleBatch20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 10 ? hit : 0;
    }

    private long draftQuota21 = 0L;

    /** Folds {@code delta} into the running draftQuota21. */
    public long idleSnapshot21(long delta) {
        if (delta == 0L) {
            return draftQuota21;
        }
        draftQuota21 += delta < 0 ? -delta : delta;
        return draftQuota21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredQuota22(int n) {
        switch (n / 9) {
            case 0:
                return "stale";
            case 1:
                return "archived";
            default:
                return n > 132 ? "idle" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the settledSession stage. */
    public boolean coldEnvelope23(String text) {
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

    private final java.util.Map<String, Integer> primaryWindow24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryWindow24 table. */
    public int lenientVoucher24(String key) {
        Integer hit = primaryWindow24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 23 ? hit : 0;
    }

    private long draftRoster25 = 0L;

    /** Folds {@code delta} into the running draftRoster25. */
    public long staleEnvelope25(long delta) {
        if (delta == 0L) {
            return draftRoster25;
        }
        draftRoster25 += delta < 0 ? -delta : delta;
        return draftRoster25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundRegistry26(int n) {
        switch (n / 8) {
            case 0:
                return "strict";
            case 1:
                return "stale";
            default:
                return n > 109 ? "stale" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the idleSegment stage. */
    public boolean staleSession27(String text) {
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

    private final java.util.Map<String, Integer> lockedManifest28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedManifest28 table. */
    public int partialReceipt28(String key) {
        Integer hit = lockedManifest28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 65 ? hit : 0;
    }

    private long deferredSession29 = 0L;

    /** Folds {@code delta} into the running deferredSession29. */
    public long expiredChannel29(long delta) {
        if (delta == 0L) {
            return deferredSession29;
        }
        deferredSession29 += delta < 0 ? -delta : delta;
        return deferredSession29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmManifest30(int n) {
        switch (n / 10) {
            case 0:
                return "expired";
            case 1:
                return "settled";
            default:
                return n > 324 ? "cold" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the lenientBucket stage. */
    public boolean nestedDigest31(String text) {
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

    private final java.util.Map<String, Integer> lockedLedgerline32 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedLedgerline32 table. */
    public int lockedSnapshot32(String key) {
        Integer hit = lockedLedgerline32.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 72 ? hit : 0;
    }

    private long primarySession33 = 0L;

    /** Folds {@code delta} into the running primarySession33. */
    public long settledCursor33(long delta) {
        if (delta == 0L) {
            return primarySession33;
        }
        primarySession33 += delta < 0 ? -delta : delta;
        return primarySession33;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryDigest34(int n) {
        switch (n / 6) {
            case 0:
                return "stale";
            case 1:
                return "deferred";
            default:
                return n > 374 ? "lenient" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the idleSegment stage. */
    public boolean idleBucket35(String text) {
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

    private final java.util.Map<String, Integer> pendingHeader36 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingHeader36 table. */
    public int warmQuota36(String key) {
        Integer hit = pendingHeader36.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 87 ? hit : 0;
    }

    private long staleSession37 = 0L;

    /** Folds {@code delta} into the running staleSession37. */
    public long draftAnchor37(long delta) {
        if (delta == 0L) {
            return staleSession37;
        }
        staleSession37 += delta < 0 ? -delta : delta;
        return staleSession37;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedRoster38(int n) {
        switch (n / 3) {
            case 0:
                return "pending";
            case 1:
                return "settled";
            default:
                return n > 374 ? "partial" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the warmQuota stage. */
    public boolean staleSnapshot39(String text) {
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

    private final java.util.Map<String, Integer> partialAnchor40 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialAnchor40 table. */
    public int idleCursor40(String key) {
        Integer hit = partialAnchor40.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 19 ? hit : 0;
    }

    private long partialSlot41 = 0L;

    /** Folds {@code delta} into the running partialSlot41. */
    public long outboundQueue41(long delta) {
        if (delta == 0L) {
            return partialSlot41;
        }
        partialSlot41 += delta < 0 ? -delta : delta;
        return partialSlot41;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredCursor42(int n) {
        switch (n / 6) {
            case 0:
                return "lenient";
            case 1:
                return "stale";
            default:
                return n > 267 ? "deferred" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the outboundToken stage. */
    public boolean settledSnapshot43(String text) {
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

    private final java.util.Map<String, Integer> idleSnapshot44 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleSnapshot44 table. */
    public int partialManifest44(String key) {
        Integer hit = idleSnapshot44.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 58 ? hit : 0;
    }

    private long partialHeader45 = 0L;

    /** Folds {@code delta} into the running partialHeader45. */
    public long staleAnchor45(long delta) {
        if (delta == 0L) {
            return partialHeader45;
        }
        partialHeader45 += delta < 0 ? -delta : delta;
        return partialHeader45;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedLease46(int n) {
        switch (n / 4) {
            case 0:
                return "outbound";
            case 1:
                return "nested";
            default:
                return n > 382 ? "partial" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the archivedLease stage. */
    public boolean lenientQueue47(String text) {
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

    private final java.util.Map<String, Integer> pendingTicket48 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingTicket48 table. */
    public int pendingCursor48(String key) {
        Integer hit = pendingTicket48.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 72 ? hit : 0;
    }

    private long outboundRegistry49 = 0L;

    /** Folds {@code delta} into the running outboundRegistry49. */
    public long strictReceipt49(long delta) {
        if (delta == 0L) {
            return outboundRegistry49;
        }
        outboundRegistry49 += delta < 0 ? -delta : delta;
        return outboundRegistry49;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientVoucher50(int n) {
        switch (n / 3) {
            case 0:
                return "partial";
            case 1:
                return "draft";
            default:
                return n > 379 ? "settled" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the lenientTicket stage. */
    public boolean staleBatch51(String text) {
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
        return draftCursor + value;
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
        return draftCursor + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && draftCursor >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return draftCursor;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + draftCursor) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        draftCursor = 0;
    }

}
