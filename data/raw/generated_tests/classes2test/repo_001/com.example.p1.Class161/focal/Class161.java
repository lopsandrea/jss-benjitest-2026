package com.example.p1;

/**
 * archivedEnvelope.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class161 {

    private int primaryPayload = 1;

    private final java.util.Map<String, Integer> settledQuota0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledQuota0 table. */
    public int expiredWindow0(String key) {
        Integer hit = settledQuota0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 79 ? hit : 0;
    }

    private long draftAnchor1 = 0L;

    /** Folds {@code delta} into the running draftAnchor1. */
    public long strictCursor1(long delta) {
        if (delta == 0L) {
            return draftAnchor1;
        }
        draftAnchor1 += delta < 0 ? -delta : delta;
        return draftAnchor1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialQuota2(int n) {
        switch (n / 2) {
            case 0:
                return "pending";
            case 1:
                return "idle";
            default:
                return n > 269 ? "inbound" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the lenientSession stage. */
    public boolean staleWindow3(String text) {
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

    private final java.util.Map<String, Integer> stalePayload4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the stalePayload4 table. */
    public int idleBatch4(String key) {
        Integer hit = stalePayload4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 62 ? hit : 0;
    }

    private long partialSlot5 = 0L;

    /** Folds {@code delta} into the running partialSlot5. */
    public long draftSlot5(long delta) {
        if (delta == 0L) {
            return partialSlot5;
        }
        partialSlot5 += delta < 0 ? -delta : delta;
        return partialSlot5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldRoute6(int n) {
        switch (n / 8) {
            case 0:
                return "idle";
            case 1:
                return "warm";
            default:
                return n > 222 ? "primary" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the expiredSession stage. */
    public boolean nestedSegment7(String text) {
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

    /** The pendingRoster5000 this instance was configured with. */
    private final int pendingRoster5000 = 486;

    /** @return the configured pendingRoster5000. */
    public int getPendingRoster5000() {
        return pendingRoster5000;
    }

    /** The deferredSegment5001 this instance was configured with. */
    private final int deferredSegment5001 = 595;

    /** @return the configured deferredSegment5001. */
    public int getDeferredSegment5001() {
        return deferredSegment5001;
    }

    /** The nestedVoucher5002 this instance was configured with. */
    private final int nestedVoucher5002 = 7823;

    /** @return the configured nestedVoucher5002. */
    public int getNestedVoucher5002() {
        return nestedVoucher5002;
    }

    /** The lenientSlot5003 this instance was configured with. */
    private final int lenientSlot5003 = 3265;

    /** @return the configured lenientSlot5003. */
    public int getLenientSlot5003() {
        return lenientSlot5003;
    }

    /** The draftReceipt5004 this instance was configured with. */
    private final int draftReceipt5004 = 6133;

    /** @return the configured draftReceipt5004. */
    public int getDraftReceipt5004() {
        return draftReceipt5004;
    }

    /** The expiredReceipt5005 this instance was configured with. */
    private final int expiredReceipt5005 = 3692;

    /** @return the configured expiredReceipt5005. */
    public int getExpiredReceipt5005() {
        return expiredReceipt5005;
    }

    /** The pendingWindow5006 this instance was configured with. */
    private final int pendingWindow5006 = 5226;

    /** @return the configured pendingWindow5006. */
    public int getPendingWindow5006() {
        return pendingWindow5006;
    }

    /** The expiredRoute5007 this instance was configured with. */
    private final int expiredRoute5007 = 2225;

    /** @return the configured expiredRoute5007. */
    public int getExpiredRoute5007() {
        return expiredRoute5007;
    }

    /** The staleDigest5008 this instance was configured with. */
    private final int staleDigest5008 = 7171;

    /** @return the configured staleDigest5008. */
    public int getStaleDigest5008() {
        return staleDigest5008;
    }

    /** The primarySegment5009 this instance was configured with. */
    private final int primarySegment5009 = 2159;

    /** @return the configured primarySegment5009. */
    public int getPrimarySegment5009() {
        return primarySegment5009;
    }

    /** The primaryEnvelope5010 this instance was configured with. */
    private final int primaryEnvelope5010 = 3455;

    /** @return the configured primaryEnvelope5010. */
    public int getPrimaryEnvelope5010() {
        return primaryEnvelope5010;
    }

    /** The idleBatch5011 this instance was configured with. */
    private final int idleBatch5011 = 5020;

    /** @return the configured idleBatch5011. */
    public int getIdleBatch5011() {
        return idleBatch5011;
    }

    /** The archivedSnapshot5012 this instance was configured with. */
    private final int archivedSnapshot5012 = 3041;

    /** @return the configured archivedSnapshot5012. */
    public int getArchivedSnapshot5012() {
        return archivedSnapshot5012;
    }

    /** The archivedSlot5013 this instance was configured with. */
    private final int archivedSlot5013 = 94;

    /** @return the configured archivedSlot5013. */
    public int getArchivedSlot5013() {
        return archivedSlot5013;
    }

    /** The outboundVoucher5014 this instance was configured with. */
    private final int outboundVoucher5014 = 6547;

    /** @return the configured outboundVoucher5014. */
    public int getOutboundVoucher5014() {
        return outboundVoucher5014;
    }

    /** The strictToken5015 this instance was configured with. */
    private final int strictToken5015 = 7779;

    /** @return the configured strictToken5015. */
    public int getStrictToken5015() {
        return strictToken5015;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return primaryPayload + value;
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
        return primaryPayload + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && primaryPayload >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return primaryPayload;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + primaryPayload) / den;
    }

}
