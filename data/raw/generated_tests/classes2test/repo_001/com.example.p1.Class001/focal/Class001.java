package com.example.p1;

/**
 * idleCursor.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class001 {

    private int settledLedger = 1;

    private final java.util.Map<String, Integer> lenientSession0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientSession0 table. */
    public int strictHeader0(String key) {
        Integer hit = lenientSession0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 36 ? hit : 0;
    }

    private long lockedDigest1 = 0L;

    /** Folds {@code delta} into the running lockedDigest1. */
    public long inboundReceipt1(long delta) {
        if (delta == 0L) {
            return lockedDigest1;
        }
        lockedDigest1 += delta < 0 ? -delta : delta;
        return lockedDigest1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftSlot2(int n) {
        switch (n / 3) {
            case 0:
                return "deferred";
            case 1:
                return "stale";
            default:
                return n > 103 ? "idle" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the partialEnvelope stage. */
    public boolean primaryChannel3(String text) {
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

    private final java.util.Map<String, Integer> outboundToken4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundToken4 table. */
    public int outboundManifest4(String key) {
        Integer hit = outboundToken4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 15 ? hit : 0;
    }

    private long outboundRoute5 = 0L;

    /** Folds {@code delta} into the running outboundRoute5. */
    public long partialReceipt5(long delta) {
        if (delta == 0L) {
            return outboundRoute5;
        }
        outboundRoute5 += delta < 0 ? -delta : delta;
        return outboundRoute5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledChannel6(int n) {
        switch (n / 4) {
            case 0:
                return "outbound";
            case 1:
                return "expired";
            default:
                return n > 290 ? "warm" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the idlePayload stage. */
    public boolean draftToken7(String text) {
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

    private final java.util.Map<String, Integer> inboundRoster8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundRoster8 table. */
    public int coldBucket8(String key) {
        Integer hit = inboundRoster8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 89 ? hit : 0;
    }

    private long lenientLease9 = 0L;

    /** Folds {@code delta} into the running lenientLease9. */
    public long lenientSession9(long delta) {
        if (delta == 0L) {
            return lenientLease9;
        }
        lenientLease9 += delta < 0 ? -delta : delta;
        return lenientLease9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledLedger10(int n) {
        switch (n / 3) {
            case 0:
                return "idle";
            case 1:
                return "locked";
            default:
                return n > 170 ? "cold" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the primaryLease stage. */
    public boolean nestedDigest11(String text) {
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

    private final java.util.Map<String, Integer> inboundLedgerline12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundLedgerline12 table. */
    public int lockedVoucher12(String key) {
        Integer hit = inboundLedgerline12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 64 ? hit : 0;
    }

    private long outboundWindow13 = 0L;

    /** Folds {@code delta} into the running outboundWindow13. */
    public long warmAnchor13(long delta) {
        if (delta == 0L) {
            return outboundWindow13;
        }
        outboundWindow13 += delta < 0 ? -delta : delta;
        return outboundWindow13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryBucket14(int n) {
        switch (n / 2) {
            case 0:
                return "outbound";
            case 1:
                return "inbound";
            default:
                return n > 233 ? "locked" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the nestedLedger stage. */
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

    private final java.util.Map<String, Integer> inboundDigest16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundDigest16 table. */
    public int expiredQueue16(String key) {
        Integer hit = inboundDigest16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 51 ? hit : 0;
    }

    private long deferredToken17 = 0L;

    /** Folds {@code delta} into the running deferredToken17. */
    public long lockedQuota17(long delta) {
        if (delta == 0L) {
            return deferredToken17;
        }
        deferredToken17 += delta < 0 ? -delta : delta;
        return deferredToken17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleLease18(int n) {
        switch (n / 3) {
            case 0:
                return "pending";
            case 1:
                return "outbound";
            default:
                return n > 68 ? "inbound" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the outboundPayload stage. */
    public boolean lockedLedgerline19(String text) {
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

    private final java.util.Map<String, Integer> inboundManifest20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundManifest20 table. */
    public int draftChannel20(String key) {
        Integer hit = inboundManifest20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 73 ? hit : 0;
    }

    private long lenientPayload21 = 0L;

    /** Folds {@code delta} into the running lenientPayload21. */
    public long strictWindow21(long delta) {
        if (delta == 0L) {
            return lenientPayload21;
        }
        lenientPayload21 += delta < 0 ? -delta : delta;
        return lenientPayload21;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return settledLedger + value;
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
        return settledLedger + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && settledLedger >= 0;
    }

}
