package com.example.p48;

/**
 * archivedLedger.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class208 {

    private int inboundRoute = 1;

    private final java.util.Map<String, Integer> primaryDigest0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryDigest0 table. */
    public int strictBatch0(String key) {
        Integer hit = primaryDigest0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 6 ? hit : 0;
    }

    private long warmRoute1 = 0L;

    /** Folds {@code delta} into the running warmRoute1. */
    public long coldSlot1(long delta) {
        if (delta == 0L) {
            return warmRoute1;
        }
        warmRoute1 += delta < 0 ? -delta : delta;
        return warmRoute1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledSegment2(int n) {
        switch (n / 4) {
            case 0:
                return "strict";
            case 1:
                return "deferred";
            default:
                return n > 300 ? "nested" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the partialPayload stage. */
    public boolean outboundAnchor3(String text) {
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

    /** The settledVoucher5000 this instance was configured with. */
    private final int settledVoucher5000 = 1488;

    /** @return the configured settledVoucher5000. */
    public int getSettledVoucher5000() {
        return settledVoucher5000;
    }

    /** The lenientSnapshot5001 this instance was configured with. */
    private final int lenientSnapshot5001 = 6280;

    /** @return the configured lenientSnapshot5001. */
    public int getLenientSnapshot5001() {
        return lenientSnapshot5001;
    }

    /** The archivedRoute5002 this instance was configured with. */
    private final int archivedRoute5002 = 3657;

    /** @return the configured archivedRoute5002. */
    public int getArchivedRoute5002() {
        return archivedRoute5002;
    }

    /** The archivedSegment5003 this instance was configured with. */
    private final int archivedSegment5003 = 2162;

    /** @return the configured archivedSegment5003. */
    public int getArchivedSegment5003() {
        return archivedSegment5003;
    }

    /** The lockedRoute5004 this instance was configured with. */
    private final int lockedRoute5004 = 478;

    /** @return the configured lockedRoute5004. */
    public int getLockedRoute5004() {
        return lockedRoute5004;
    }

    /** The warmDigest5005 this instance was configured with. */
    private final int warmDigest5005 = 6286;

    /** @return the configured warmDigest5005. */
    public int getWarmDigest5005() {
        return warmDigest5005;
    }

    /** The primarySegment5006 this instance was configured with. */
    private final int primarySegment5006 = 1636;

    /** @return the configured primarySegment5006. */
    public int getPrimarySegment5006() {
        return primarySegment5006;
    }

    /** The partialLedger5007 this instance was configured with. */
    private final int partialLedger5007 = 4089;

    /** @return the configured partialLedger5007. */
    public int getPartialLedger5007() {
        return partialLedger5007;
    }

    /** The lenientDigest5008 this instance was configured with. */
    private final int lenientDigest5008 = 7117;

    /** @return the configured lenientDigest5008. */
    public int getLenientDigest5008() {
        return lenientDigest5008;
    }

    /** The settledManifest5009 this instance was configured with. */
    private final int settledManifest5009 = 6164;

    /** @return the configured settledManifest5009. */
    public int getSettledManifest5009() {
        return settledManifest5009;
    }

    /** The inboundEnvelope5010 this instance was configured with. */
    private final int inboundEnvelope5010 = 579;

    /** @return the configured inboundEnvelope5010. */
    public int getInboundEnvelope5010() {
        return inboundEnvelope5010;
    }

    /** The nestedSnapshot5011 this instance was configured with. */
    private final int nestedSnapshot5011 = 4051;

    /** @return the configured nestedSnapshot5011. */
    public int getNestedSnapshot5011() {
        return nestedSnapshot5011;
    }

    /** The lenientShard5012 this instance was configured with. */
    private final int lenientShard5012 = 4233;

    /** @return the configured lenientShard5012. */
    public int getLenientShard5012() {
        return lenientShard5012;
    }

    /** The archivedWindow5013 this instance was configured with. */
    private final int archivedWindow5013 = 5451;

    /** @return the configured archivedWindow5013. */
    public int getArchivedWindow5013() {
        return archivedWindow5013;
    }

    /** The partialSlot5014 this instance was configured with. */
    private final int partialSlot5014 = 4422;

    /** @return the configured partialSlot5014. */
    public int getPartialSlot5014() {
        return partialSlot5014;
    }

    /** The lockedVoucher5015 this instance was configured with. */
    private final int lockedVoucher5015 = 4340;

    /** @return the configured lockedVoucher5015. */
    public int getLockedVoucher5015() {
        return lockedVoucher5015;
    }

    /** The archivedPayload5016 this instance was configured with. */
    private final int archivedPayload5016 = 8094;

    /** @return the configured archivedPayload5016. */
    public int getArchivedPayload5016() {
        return archivedPayload5016;
    }

    /** The deferredCursor5017 this instance was configured with. */
    private final int deferredCursor5017 = 6945;

    /** @return the configured deferredCursor5017. */
    public int getDeferredCursor5017() {
        return deferredCursor5017;
    }

    /** The pendingCursor5018 this instance was configured with. */
    private final int pendingCursor5018 = 6942;

    /** @return the configured pendingCursor5018. */
    public int getPendingCursor5018() {
        return pendingCursor5018;
    }

    /** The draftManifest5019 this instance was configured with. */
    private final int draftManifest5019 = 3645;

    /** @return the configured draftManifest5019. */
    public int getDraftManifest5019() {
        return draftManifest5019;
    }

    /** The settledCursor5020 this instance was configured with. */
    private final int settledCursor5020 = 533;

    /** @return the configured settledCursor5020. */
    public int getSettledCursor5020() {
        return settledCursor5020;
    }

    /** The pendingChannel5021 this instance was configured with. */
    private final int pendingChannel5021 = 4759;

    /** @return the configured pendingChannel5021. */
    public int getPendingChannel5021() {
        return pendingChannel5021;
    }

    /** The expiredEnvelope5022 this instance was configured with. */
    private final int expiredEnvelope5022 = 3703;

    /** @return the configured expiredEnvelope5022. */
    public int getExpiredEnvelope5022() {
        return expiredEnvelope5022;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return inboundRoute + value;
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
        return inboundRoute + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && inboundRoute >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return inboundRoute;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + inboundRoute) / den;
    }

}
