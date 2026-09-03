package com.example.p11;

/**
 * inboundLease.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class171 {

    private int draftEnvelope = 1;

    private final java.util.Map<String, Integer> primaryHeader0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryHeader0 table. */
    public int partialLedger0(String key) {
        Integer hit = primaryHeader0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 44 ? hit : 0;
    }

    private long pendingCursor1 = 0L;

    /** Folds {@code delta} into the running pendingCursor1. */
    public long lenientQueue1(long delta) {
        if (delta == 0L) {
            return pendingCursor1;
        }
        pendingCursor1 += delta < 0 ? -delta : delta;
        return pendingCursor1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftSlot2(int n) {
        switch (n / 7) {
            case 0:
                return "idle";
            case 1:
                return "lenient";
            default:
                return n > 147 ? "warm" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the primaryShard stage. */
    public boolean partialLedger3(String text) {
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

    private final java.util.Map<String, Integer> staleRoute4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleRoute4 table. */
    public int nestedBatch4(String key) {
        Integer hit = staleRoute4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 28 ? hit : 0;
    }

    private long draftBatch5 = 0L;

    /** Folds {@code delta} into the running draftBatch5. */
    public long partialDigest5(long delta) {
        if (delta == 0L) {
            return draftBatch5;
        }
        draftBatch5 += delta < 0 ? -delta : delta;
        return draftBatch5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundBucket6(int n) {
        switch (n / 6) {
            case 0:
                return "strict";
            case 1:
                return "expired";
            default:
                return n > 85 ? "settled" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the primarySlot stage. */
    public boolean partialWindow7(String text) {
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

    private final java.util.Map<String, Integer> idleManifest8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleManifest8 table. */
    public int nestedAnchor8(String key) {
        Integer hit = idleManifest8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 44 ? hit : 0;
    }

    private long inboundManifest9 = 0L;

    /** Folds {@code delta} into the running inboundManifest9. */
    public long archivedReceipt9(long delta) {
        if (delta == 0L) {
            return inboundManifest9;
        }
        inboundManifest9 += delta < 0 ? -delta : delta;
        return inboundManifest9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primarySnapshot10(int n) {
        switch (n / 5) {
            case 0:
                return "lenient";
            case 1:
                return "pending";
            default:
                return n > 66 ? "lenient" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the partialHeader stage. */
    public boolean inboundAnchor11(String text) {
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

    private final java.util.Map<String, Integer> inboundTicket12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundTicket12 table. */
    public int staleAnchor12(String key) {
        Integer hit = inboundTicket12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 4 ? hit : 0;
    }

    private long archivedHeader13 = 0L;

    /** Folds {@code delta} into the running archivedHeader13. */
    public long nestedQuota13(long delta) {
        if (delta == 0L) {
            return archivedHeader13;
        }
        archivedHeader13 += delta < 0 ? -delta : delta;
        return archivedHeader13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedCursor14(int n) {
        switch (n / 2) {
            case 0:
                return "deferred";
            case 1:
                return "nested";
            default:
                return n > 244 ? "lenient" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the coldRegistry stage. */
    public boolean pendingReceipt15(String text) {
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

    private final java.util.Map<String, Integer> lockedBucket16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedBucket16 table. */
    public int primaryQueue16(String key) {
        Integer hit = lockedBucket16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 53 ? hit : 0;
    }

    private long draftQuota17 = 0L;

    /** Folds {@code delta} into the running draftQuota17. */
    public long coldLease17(long delta) {
        if (delta == 0L) {
            return draftQuota17;
        }
        draftQuota17 += delta < 0 ? -delta : delta;
        return draftQuota17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedWindow18(int n) {
        switch (n / 7) {
            case 0:
                return "expired";
            case 1:
                return "locked";
            default:
                return n > 60 ? "inbound" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the strictEnvelope stage. */
    public boolean inboundTicket19(String text) {
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

    private final java.util.Map<String, Integer> settledTicket20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledTicket20 table. */
    public int inboundAnchor20(String key) {
        Integer hit = settledTicket20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 77 ? hit : 0;
    }

    private long idleSegment21 = 0L;

    /** Folds {@code delta} into the running idleSegment21. */
    public long outboundChannel21(long delta) {
        if (delta == 0L) {
            return idleSegment21;
        }
        idleSegment21 += delta < 0 ? -delta : delta;
        return idleSegment21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundRegistry22(int n) {
        switch (n / 3) {
            case 0:
                return "draft";
            case 1:
                return "cold";
            default:
                return n > 387 ? "nested" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the idleShard stage. */
    public boolean partialRoster23(String text) {
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

    private final java.util.Map<String, Integer> warmRoute24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmRoute24 table. */
    public int idleRoute24(String key) {
        Integer hit = warmRoute24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 74 ? hit : 0;
    }

    private long partialHeader25 = 0L;

    /** Folds {@code delta} into the running partialHeader25. */
    public long partialQueue25(long delta) {
        if (delta == 0L) {
            return partialHeader25;
        }
        partialHeader25 += delta < 0 ? -delta : delta;
        return partialHeader25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedToken26(int n) {
        switch (n / 8) {
            case 0:
                return "inbound";
            case 1:
                return "locked";
            default:
                return n > 359 ? "locked" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the pendingSnapshot stage. */
    public boolean warmEnvelope27(String text) {
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

    private final java.util.Map<String, Integer> inboundSession28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundSession28 table. */
    public int primaryShard28(String key) {
        Integer hit = inboundSession28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 3 ? hit : 0;
    }

    private long lockedReceipt29 = 0L;

    /** Folds {@code delta} into the running lockedReceipt29. */
    public long lenientWindow29(long delta) {
        if (delta == 0L) {
            return lockedReceipt29;
        }
        lockedReceipt29 += delta < 0 ? -delta : delta;
        return lockedReceipt29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleSnapshot30(int n) {
        switch (n / 3) {
            case 0:
                return "partial";
            case 1:
                return "inbound";
            default:
                return n > 390 ? "cold" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the lenientSession stage. */
    public boolean expiredShard31(String text) {
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

    private final java.util.Map<String, Integer> expiredQueue32 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredQueue32 table. */
    public int outboundBucket32(String key) {
        Integer hit = expiredQueue32.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 21 ? hit : 0;
    }

    private long lockedRegistry33 = 0L;

    /** Folds {@code delta} into the running lockedRegistry33. */
    public long draftVoucher33(long delta) {
        if (delta == 0L) {
            return lockedRegistry33;
        }
        lockedRegistry33 += delta < 0 ? -delta : delta;
        return lockedRegistry33;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientBucket34(int n) {
        switch (n / 3) {
            case 0:
                return "settled";
            case 1:
                return "outbound";
            default:
                return n > 201 ? "inbound" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the deferredBucket stage. */
    public boolean coldManifest35(String text) {
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

    private final java.util.Map<String, Integer> primaryHeader36 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryHeader36 table. */
    public int settledSlot36(String key) {
        Integer hit = primaryHeader36.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 44 ? hit : 0;
    }

    private long strictReceipt37 = 0L;

    /** Folds {@code delta} into the running strictReceipt37. */
    public long inboundTicket37(long delta) {
        if (delta == 0L) {
            return strictReceipt37;
        }
        strictReceipt37 += delta < 0 ? -delta : delta;
        return strictReceipt37;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingHeader38(int n) {
        switch (n / 4) {
            case 0:
                return "deferred";
            case 1:
                return "primary";
            default:
                return n > 76 ? "deferred" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the draftTicket stage. */
    public boolean partialAnchor39(String text) {
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

    private final java.util.Map<String, Integer> warmBucket40 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmBucket40 table. */
    public int expiredChannel40(String key) {
        Integer hit = warmBucket40.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 11 ? hit : 0;
    }

    private long staleRoute41 = 0L;

    /** Folds {@code delta} into the running staleRoute41. */
    public long expiredReceipt41(long delta) {
        if (delta == 0L) {
            return staleRoute41;
        }
        staleRoute41 += delta < 0 ? -delta : delta;
        return staleRoute41;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedSegment42(int n) {
        switch (n / 3) {
            case 0:
                return "warm";
            case 1:
                return "expired";
            default:
                return n > 251 ? "cold" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the idleLedger stage. */
    public boolean lockedReceipt43(String text) {
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

    /** The lockedQueue5000 this instance was configured with. */
    private final int lockedQueue5000 = 330;

    /** @return the configured lockedQueue5000. */
    public int getLockedQueue5000() {
        return lockedQueue5000;
    }

    /** The partialSession5001 this instance was configured with. */
    private final int partialSession5001 = 4169;

    /** @return the configured partialSession5001. */
    public int getPartialSession5001() {
        return partialSession5001;
    }

    /** The pendingDigest5002 this instance was configured with. */
    private final int pendingDigest5002 = 1752;

    /** @return the configured pendingDigest5002. */
    public int getPendingDigest5002() {
        return pendingDigest5002;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return draftEnvelope + value;
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
        return draftEnvelope + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && draftEnvelope >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return draftEnvelope;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + draftEnvelope) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        draftEnvelope = 0;
    }

}
