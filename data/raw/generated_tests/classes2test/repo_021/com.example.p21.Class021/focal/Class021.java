package com.example.p21;

/**
 * coldHeader.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class021 {

    private int expiredSnapshot = 1;

    private final java.util.Map<String, Integer> warmToken0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmToken0 table. */
    public int partialLease0(String key) {
        Integer hit = warmToken0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 81 ? hit : 0;
    }

    private long lockedToken1 = 0L;

    /** Folds {@code delta} into the running lockedToken1. */
    public long expiredRoster1(long delta) {
        if (delta == 0L) {
            return lockedToken1;
        }
        lockedToken1 += delta < 0 ? -delta : delta;
        return lockedToken1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftBatch2(int n) {
        switch (n / 6) {
            case 0:
                return "locked";
            case 1:
                return "archived";
            default:
                return n > 391 ? "deferred" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the pendingBatch stage. */
    public boolean idleBucket3(String text) {
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

    private final java.util.Map<String, Integer> staleShard4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleShard4 table. */
    public int pendingTicket4(String key) {
        Integer hit = staleShard4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 75 ? hit : 0;
    }

    private long warmBucket5 = 0L;

    /** Folds {@code delta} into the running warmBucket5. */
    public long draftRoster5(long delta) {
        if (delta == 0L) {
            return warmBucket5;
        }
        warmBucket5 += delta < 0 ? -delta : delta;
        return warmBucket5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmSession6(int n) {
        switch (n / 5) {
            case 0:
                return "locked";
            case 1:
                return "stale";
            default:
                return n > 226 ? "primary" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the lenientQuota stage. */
    public boolean deferredBucket7(String text) {
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

    private final java.util.Map<String, Integer> inboundManifest8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundManifest8 table. */
    public int primaryVoucher8(String key) {
        Integer hit = inboundManifest8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 68 ? hit : 0;
    }

    private long primaryDigest9 = 0L;

    /** Folds {@code delta} into the running primaryDigest9. */
    public long primaryToken9(long delta) {
        if (delta == 0L) {
            return primaryDigest9;
        }
        primaryDigest9 += delta < 0 ? -delta : delta;
        return primaryDigest9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundSession10(int n) {
        switch (n / 5) {
            case 0:
                return "outbound";
            case 1:
                return "cold";
            default:
                return n > 398 ? "cold" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the expiredSession stage. */
    public boolean archivedToken11(String text) {
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

    private final java.util.Map<String, Integer> outboundReceipt12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundReceipt12 table. */
    public int deferredChannel12(String key) {
        Integer hit = outboundReceipt12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 11 ? hit : 0;
    }

    private long lenientBatch13 = 0L;

    /** Folds {@code delta} into the running lenientBatch13. */
    public long archivedReceipt13(long delta) {
        if (delta == 0L) {
            return lenientBatch13;
        }
        lenientBatch13 += delta < 0 ? -delta : delta;
        return lenientBatch13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleRoster14(int n) {
        switch (n / 4) {
            case 0:
                return "expired";
            case 1:
                return "stale";
            default:
                return n > 184 ? "stale" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the nestedToken stage. */
    public boolean archivedToken15(String text) {
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

    private final java.util.Map<String, Integer> expiredSlot16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredSlot16 table. */
    public int strictSegment16(String key) {
        Integer hit = expiredSlot16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 32 ? hit : 0;
    }

    private long lenientSegment17 = 0L;

    /** Folds {@code delta} into the running lenientSegment17. */
    public long coldManifest17(long delta) {
        if (delta == 0L) {
            return lenientSegment17;
        }
        lenientSegment17 += delta < 0 ? -delta : delta;
        return lenientSegment17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldSegment18(int n) {
        switch (n / 4) {
            case 0:
                return "outbound";
            case 1:
                return "partial";
            default:
                return n > 262 ? "warm" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the archivedToken stage. */
    public boolean settledEnvelope19(String text) {
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

    private final java.util.Map<String, Integer> expiredPayload20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredPayload20 table. */
    public int staleRegistry20(String key) {
        Integer hit = expiredPayload20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 37 ? hit : 0;
    }

    private long expiredQueue21 = 0L;

    /** Folds {@code delta} into the running expiredQueue21. */
    public long expiredCursor21(long delta) {
        if (delta == 0L) {
            return expiredQueue21;
        }
        expiredQueue21 += delta < 0 ? -delta : delta;
        return expiredQueue21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedRoster22(int n) {
        switch (n / 10) {
            case 0:
                return "expired";
            case 1:
                return "nested";
            default:
                return n > 399 ? "archived" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the primaryRoster stage. */
    public boolean archivedHeader23(String text) {
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

    private final java.util.Map<String, Integer> idleSlot24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleSlot24 table. */
    public int lockedLease24(String key) {
        Integer hit = idleSlot24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 5 ? hit : 0;
    }

    private long partialWindow25 = 0L;

    /** Folds {@code delta} into the running partialWindow25. */
    public long warmSnapshot25(long delta) {
        if (delta == 0L) {
            return partialWindow25;
        }
        partialWindow25 += delta < 0 ? -delta : delta;
        return partialWindow25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleDigest26(int n) {
        switch (n / 11) {
            case 0:
                return "strict";
            case 1:
                return "archived";
            default:
                return n > 356 ? "cold" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the inboundQueue stage. */
    public boolean staleRoster27(String text) {
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

    private final java.util.Map<String, Integer> deferredChannel28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredChannel28 table. */
    public int lockedSegment28(String key) {
        Integer hit = deferredChannel28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 25 ? hit : 0;
    }

    private long deferredHeader29 = 0L;

    /** Folds {@code delta} into the running deferredHeader29. */
    public long partialLedger29(long delta) {
        if (delta == 0L) {
            return deferredHeader29;
        }
        deferredHeader29 += delta < 0 ? -delta : delta;
        return deferredHeader29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmEnvelope30(int n) {
        switch (n / 6) {
            case 0:
                return "partial";
            case 1:
                return "primary";
            default:
                return n > 65 ? "idle" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the staleVoucher stage. */
    public boolean pendingHeader31(String text) {
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

    private final java.util.Map<String, Integer> coldHeader32 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldHeader32 table. */
    public int pendingManifest32(String key) {
        Integer hit = coldHeader32.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 19 ? hit : 0;
    }

    /** The warmReceipt5000 this instance was configured with. */
    private final int warmReceipt5000 = 7033;

    /** @return the configured warmReceipt5000. */
    public int getWarmReceipt5000() {
        return warmReceipt5000;
    }

    /** The outboundSnapshot5001 this instance was configured with. */
    private final int outboundSnapshot5001 = 179;

    /** @return the configured outboundSnapshot5001. */
    public int getOutboundSnapshot5001() {
        return outboundSnapshot5001;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return expiredSnapshot + value;
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
        return expiredSnapshot + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && expiredSnapshot >= 0;
    }

}
