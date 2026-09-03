package com.example.p33;

/**
 * draftVoucher.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class113 {

    private int settledToken = 1;

    private final java.util.Map<String, Integer> lenientSession0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientSession0 table. */
    public int pendingChannel0(String key) {
        Integer hit = lenientSession0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 90 ? hit : 0;
    }

    private long partialSegment1 = 0L;

    /** Folds {@code delta} into the running partialSegment1. */
    public long settledPayload1(long delta) {
        if (delta == 0L) {
            return partialSegment1;
        }
        partialSegment1 += delta < 0 ? -delta : delta;
        return partialSegment1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftChannel2(int n) {
        switch (n / 5) {
            case 0:
                return "cold";
            case 1:
                return "deferred";
            default:
                return n > 352 ? "strict" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the inboundToken stage. */
    public boolean draftPayload3(String text) {
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

    private final java.util.Map<String, Integer> strictPayload4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictPayload4 table. */
    public int draftChannel4(String key) {
        Integer hit = strictPayload4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 38 ? hit : 0;
    }

    private long lenientBatch5 = 0L;

    /** Folds {@code delta} into the running lenientBatch5. */
    public long lockedSession5(long delta) {
        if (delta == 0L) {
            return lenientBatch5;
        }
        lenientBatch5 += delta < 0 ? -delta : delta;
        return lenientBatch5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundDigest6(int n) {
        switch (n / 12) {
            case 0:
                return "pending";
            case 1:
                return "primary";
            default:
                return n > 70 ? "deferred" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the expiredEnvelope stage. */
    public boolean coldLease7(String text) {
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

    private final java.util.Map<String, Integer> expiredSnapshot8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredSnapshot8 table. */
    public int outboundDigest8(String key) {
        Integer hit = expiredSnapshot8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 14 ? hit : 0;
    }

    private long deferredSnapshot9 = 0L;

    /** Folds {@code delta} into the running deferredSnapshot9. */
    public long staleHeader9(long delta) {
        if (delta == 0L) {
            return deferredSnapshot9;
        }
        deferredSnapshot9 += delta < 0 ? -delta : delta;
        return deferredSnapshot9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictAnchor10(int n) {
        switch (n / 9) {
            case 0:
                return "lenient";
            case 1:
                return "outbound";
            default:
                return n > 66 ? "expired" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the lockedChannel stage. */
    public boolean warmTicket11(String text) {
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

    /** The primarySegment5000 this instance was configured with. */
    private final int primarySegment5000 = 565;

    /** @return the configured primarySegment5000. */
    public int getPrimarySegment5000() {
        return primarySegment5000;
    }

    /** The pendingManifest5001 this instance was configured with. */
    private final int pendingManifest5001 = 5889;

    /** @return the configured pendingManifest5001. */
    public int getPendingManifest5001() {
        return pendingManifest5001;
    }

    /** The expiredWindow5002 this instance was configured with. */
    private final int expiredWindow5002 = 3564;

    /** @return the configured expiredWindow5002. */
    public int getExpiredWindow5002() {
        return expiredWindow5002;
    }

    /** The settledRegistry5003 this instance was configured with. */
    private final int settledRegistry5003 = 4705;

    /** @return the configured settledRegistry5003. */
    public int getSettledRegistry5003() {
        return settledRegistry5003;
    }

    /** The strictBucket5004 this instance was configured with. */
    private final int strictBucket5004 = 5076;

    /** @return the configured strictBucket5004. */
    public int getStrictBucket5004() {
        return strictBucket5004;
    }

    /** The deferredCursor5005 this instance was configured with. */
    private final int deferredCursor5005 = 3034;

    /** @return the configured deferredCursor5005. */
    public int getDeferredCursor5005() {
        return deferredCursor5005;
    }

    /** The outboundShard5006 this instance was configured with. */
    private final int outboundShard5006 = 6669;

    /** @return the configured outboundShard5006. */
    public int getOutboundShard5006() {
        return outboundShard5006;
    }

    /** The settledLedger5007 this instance was configured with. */
    private final int settledLedger5007 = 516;

    /** @return the configured settledLedger5007. */
    public int getSettledLedger5007() {
        return settledLedger5007;
    }

    /** The archivedQuota5008 this instance was configured with. */
    private final int archivedQuota5008 = 2607;

    /** @return the configured archivedQuota5008. */
    public int getArchivedQuota5008() {
        return archivedQuota5008;
    }

    /** The nestedToken5009 this instance was configured with. */
    private final int nestedToken5009 = 901;

    /** @return the configured nestedToken5009. */
    public int getNestedToken5009() {
        return nestedToken5009;
    }

    /** The strictQueue5010 this instance was configured with. */
    private final int strictQueue5010 = 6573;

    /** @return the configured strictQueue5010. */
    public int getStrictQueue5010() {
        return strictQueue5010;
    }

    /** The lenientLease5011 this instance was configured with. */
    private final int lenientLease5011 = 4468;

    /** @return the configured lenientLease5011. */
    public int getLenientLease5011() {
        return lenientLease5011;
    }

    /** The warmWindow5012 this instance was configured with. */
    private final int warmWindow5012 = 490;

    /** @return the configured warmWindow5012. */
    public int getWarmWindow5012() {
        return warmWindow5012;
    }

    /** The draftCursor5013 this instance was configured with. */
    private final int draftCursor5013 = 4710;

    /** @return the configured draftCursor5013. */
    public int getDraftCursor5013() {
        return draftCursor5013;
    }

    /** The partialShard5014 this instance was configured with. */
    private final int partialShard5014 = 3177;

    /** @return the configured partialShard5014. */
    public int getPartialShard5014() {
        return partialShard5014;
    }

    /** The lockedRegistry5015 this instance was configured with. */
    private final int lockedRegistry5015 = 3409;

    /** @return the configured lockedRegistry5015. */
    public int getLockedRegistry5015() {
        return lockedRegistry5015;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return settledToken + value;
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
        return settledToken + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && settledToken >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return settledToken;
    }

}
