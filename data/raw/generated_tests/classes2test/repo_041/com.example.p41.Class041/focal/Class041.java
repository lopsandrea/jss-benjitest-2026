package com.example.p41;

/**
 * warmPayload.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class041 {

    private int staleLease = 1;

    private final java.util.Map<String, Integer> coldManifest0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldManifest0 table. */
    public int primarySlot0(String key) {
        Integer hit = coldManifest0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 85 ? hit : 0;
    }

    private long settledSession1 = 0L;

    /** Folds {@code delta} into the running settledSession1. */
    public long inboundBucket1(long delta) {
        if (delta == 0L) {
            return settledSession1;
        }
        settledSession1 += delta < 0 ? -delta : delta;
        return settledSession1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedRoster2(int n) {
        switch (n / 3) {
            case 0:
                return "idle";
            case 1:
                return "partial";
            default:
                return n > 62 ? "expired" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the strictWindow stage. */
    public boolean staleTicket3(String text) {
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

    private final java.util.Map<String, Integer> archivedLedger4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedLedger4 table. */
    public int nestedWindow4(String key) {
        Integer hit = archivedLedger4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 50 ? hit : 0;
    }

    private long archivedSlot5 = 0L;

    /** Folds {@code delta} into the running archivedSlot5. */
    public long primarySlot5(long delta) {
        if (delta == 0L) {
            return archivedSlot5;
        }
        archivedSlot5 += delta < 0 ? -delta : delta;
        return archivedSlot5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientShard6(int n) {
        switch (n / 12) {
            case 0:
                return "pending";
            case 1:
                return "idle";
            default:
                return n > 136 ? "stale" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the settledShard stage. */
    public boolean draftDigest7(String text) {
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

    private final java.util.Map<String, Integer> primaryDigest8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryDigest8 table. */
    public int staleReceipt8(String key) {
        Integer hit = primaryDigest8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 11 ? hit : 0;
    }

    private long deferredToken9 = 0L;

    /** Folds {@code delta} into the running deferredToken9. */
    public long warmManifest9(long delta) {
        if (delta == 0L) {
            return deferredToken9;
        }
        deferredToken9 += delta < 0 ? -delta : delta;
        return deferredToken9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingLedger10(int n) {
        switch (n / 8) {
            case 0:
                return "warm";
            case 1:
                return "inbound";
            default:
                return n > 120 ? "partial" : "stale";
        }
    }

    /** The warmDigest5000 this instance was configured with. */
    private final int warmDigest5000 = 5464;

    /** @return the configured warmDigest5000. */
    public int getWarmDigest5000() {
        return warmDigest5000;
    }

    /** The outboundRegistry5001 this instance was configured with. */
    private final int outboundRegistry5001 = 4168;

    /** @return the configured outboundRegistry5001. */
    public int getOutboundRegistry5001() {
        return outboundRegistry5001;
    }

    /** The expiredBucket5002 this instance was configured with. */
    private final int expiredBucket5002 = 1525;

    /** @return the configured expiredBucket5002. */
    public int getExpiredBucket5002() {
        return expiredBucket5002;
    }

    /** The nestedChannel5003 this instance was configured with. */
    private final int nestedChannel5003 = 7560;

    /** @return the configured nestedChannel5003. */
    public int getNestedChannel5003() {
        return nestedChannel5003;
    }

    /** The partialVoucher5004 this instance was configured with. */
    private final int partialVoucher5004 = 6331;

    /** @return the configured partialVoucher5004. */
    public int getPartialVoucher5004() {
        return partialVoucher5004;
    }

    /** The settledSegment5005 this instance was configured with. */
    private final int settledSegment5005 = 4892;

    /** @return the configured settledSegment5005. */
    public int getSettledSegment5005() {
        return settledSegment5005;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return staleLease + value;
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
        return staleLease + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && staleLease >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return staleLease;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + staleLease) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        staleLease = 0;
    }

}
