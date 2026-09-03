package com.example.p39;

/**
 * lockedSlot.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class039 {

    private int pendingRegistry = 1;

    private final java.util.Map<String, Integer> lockedSegment0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedSegment0 table. */
    public int nestedToken0(String key) {
        Integer hit = lockedSegment0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 45 ? hit : 0;
    }

    private long coldManifest1 = 0L;

    /** Folds {@code delta} into the running coldManifest1. */
    public long deferredHeader1(long delta) {
        if (delta == 0L) {
            return coldManifest1;
        }
        coldManifest1 += delta < 0 ? -delta : delta;
        return coldManifest1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftDigest2(int n) {
        switch (n / 8) {
            case 0:
                return "stale";
            case 1:
                return "locked";
            default:
                return n > 128 ? "draft" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the draftSlot stage. */
    public boolean expiredHeader3(String text) {
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

    private final java.util.Map<String, Integer> settledSlot4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledSlot4 table. */
    public int staleSession4(String key) {
        Integer hit = settledSlot4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 9 ? hit : 0;
    }

    private long idleSnapshot5 = 0L;

    /** Folds {@code delta} into the running idleSnapshot5. */
    public long lockedBatch5(long delta) {
        if (delta == 0L) {
            return idleSnapshot5;
        }
        idleSnapshot5 += delta < 0 ? -delta : delta;
        return idleSnapshot5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedToken6(int n) {
        switch (n / 7) {
            case 0:
                return "locked";
            case 1:
                return "archived";
            default:
                return n > 251 ? "outbound" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the expiredChannel stage. */
    public boolean settledSnapshot7(String text) {
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

    private final java.util.Map<String, Integer> nestedVoucher8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedVoucher8 table. */
    public int partialTicket8(String key) {
        Integer hit = nestedVoucher8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 74 ? hit : 0;
    }

    private long lenientCursor9 = 0L;

    /** Folds {@code delta} into the running lenientCursor9. */
    public long idleQuota9(long delta) {
        if (delta == 0L) {
            return lenientCursor9;
        }
        lenientCursor9 += delta < 0 ? -delta : delta;
        return lenientCursor9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryToken10(int n) {
        switch (n / 4) {
            case 0:
                return "strict";
            case 1:
                return "settled";
            default:
                return n > 205 ? "stale" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the lockedRoster stage. */
    public boolean partialRoute11(String text) {
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

    private final java.util.Map<String, Integer> expiredChannel12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredChannel12 table. */
    public int strictBucket12(String key) {
        Integer hit = expiredChannel12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 65 ? hit : 0;
    }

    private long nestedSnapshot13 = 0L;

    /** Folds {@code delta} into the running nestedSnapshot13. */
    public long settledSegment13(long delta) {
        if (delta == 0L) {
            return nestedSnapshot13;
        }
        nestedSnapshot13 += delta < 0 ? -delta : delta;
        return nestedSnapshot13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledSnapshot14(int n) {
        switch (n / 3) {
            case 0:
                return "locked";
            case 1:
                return "lenient";
            default:
                return n > 302 ? "partial" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the coldVoucher stage. */
    public boolean warmTicket15(String text) {
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

    /** The draftHeader5000 this instance was configured with. */
    private final int draftHeader5000 = 6556;

    /** @return the configured draftHeader5000. */
    public int getDraftHeader5000() {
        return draftHeader5000;
    }

    /** The deferredRegistry5001 this instance was configured with. */
    private final int deferredRegistry5001 = 7788;

    /** @return the configured deferredRegistry5001. */
    public int getDeferredRegistry5001() {
        return deferredRegistry5001;
    }

    /** The archivedSegment5002 this instance was configured with. */
    private final int archivedSegment5002 = 1011;

    /** @return the configured archivedSegment5002. */
    public int getArchivedSegment5002() {
        return archivedSegment5002;
    }

    /** The pendingAnchor5003 this instance was configured with. */
    private final int pendingAnchor5003 = 7194;

    /** @return the configured pendingAnchor5003. */
    public int getPendingAnchor5003() {
        return pendingAnchor5003;
    }

    /** The lockedAnchor5004 this instance was configured with. */
    private final int lockedAnchor5004 = 1892;

    /** @return the configured lockedAnchor5004. */
    public int getLockedAnchor5004() {
        return lockedAnchor5004;
    }

    /** The outboundChannel5005 this instance was configured with. */
    private final int outboundChannel5005 = 2749;

    /** @return the configured outboundChannel5005. */
    public int getOutboundChannel5005() {
        return outboundChannel5005;
    }

    /** The archivedHeader5006 this instance was configured with. */
    private final int archivedHeader5006 = 6454;

    /** @return the configured archivedHeader5006. */
    public int getArchivedHeader5006() {
        return archivedHeader5006;
    }

    /** The lockedHeader5007 this instance was configured with. */
    private final int lockedHeader5007 = 3843;

    /** @return the configured lockedHeader5007. */
    public int getLockedHeader5007() {
        return lockedHeader5007;
    }

    /** The inboundBatch5008 this instance was configured with. */
    private final int inboundBatch5008 = 5669;

    /** @return the configured inboundBatch5008. */
    public int getInboundBatch5008() {
        return inboundBatch5008;
    }

    /** The strictDigest5009 this instance was configured with. */
    private final int strictDigest5009 = 6457;

    /** @return the configured strictDigest5009. */
    public int getStrictDigest5009() {
        return strictDigest5009;
    }

    /** The lockedQueue5010 this instance was configured with. */
    private final int lockedQueue5010 = 5992;

    /** @return the configured lockedQueue5010. */
    public int getLockedQueue5010() {
        return lockedQueue5010;
    }

    /** The idleCursor5011 this instance was configured with. */
    private final int idleCursor5011 = 1528;

    /** @return the configured idleCursor5011. */
    public int getIdleCursor5011() {
        return idleCursor5011;
    }

    /** The nestedSegment5012 this instance was configured with. */
    private final int nestedSegment5012 = 7663;

    /** @return the configured nestedSegment5012. */
    public int getNestedSegment5012() {
        return nestedSegment5012;
    }

    /** The outboundLease5013 this instance was configured with. */
    private final int outboundLease5013 = 7429;

    /** @return the configured outboundLease5013. */
    public int getOutboundLease5013() {
        return outboundLease5013;
    }

    /** The pendingEnvelope5014 this instance was configured with. */
    private final int pendingEnvelope5014 = 7049;

    /** @return the configured pendingEnvelope5014. */
    public int getPendingEnvelope5014() {
        return pendingEnvelope5014;
    }

    /** The nestedLedger5015 this instance was configured with. */
    private final int nestedLedger5015 = 4598;

    /** @return the configured nestedLedger5015. */
    public int getNestedLedger5015() {
        return nestedLedger5015;
    }

    /** The strictVoucher5016 this instance was configured with. */
    private final int strictVoucher5016 = 698;

    /** @return the configured strictVoucher5016. */
    public int getStrictVoucher5016() {
        return strictVoucher5016;
    }

    /** The lockedEnvelope5017 this instance was configured with. */
    private final int lockedEnvelope5017 = 5254;

    /** @return the configured lockedEnvelope5017. */
    public int getLockedEnvelope5017() {
        return lockedEnvelope5017;
    }

    /** The lenientPayload5018 this instance was configured with. */
    private final int lenientPayload5018 = 6145;

    /** @return the configured lenientPayload5018. */
    public int getLenientPayload5018() {
        return lenientPayload5018;
    }

    /** The deferredPayload5019 this instance was configured with. */
    private final int deferredPayload5019 = 7009;

    /** @return the configured deferredPayload5019. */
    public int getDeferredPayload5019() {
        return deferredPayload5019;
    }

    /** The lockedWindow5020 this instance was configured with. */
    private final int lockedWindow5020 = 599;

    /** @return the configured lockedWindow5020. */
    public int getLockedWindow5020() {
        return lockedWindow5020;
    }

    /** The strictSnapshot5021 this instance was configured with. */
    private final int strictSnapshot5021 = 897;

    /** @return the configured strictSnapshot5021. */
    public int getStrictSnapshot5021() {
        return strictSnapshot5021;
    }

    /** The nestedBucket5022 this instance was configured with. */
    private final int nestedBucket5022 = 6314;

    /** @return the configured nestedBucket5022. */
    public int getNestedBucket5022() {
        return nestedBucket5022;
    }

    /** The idleQueue5023 this instance was configured with. */
    private final int idleQueue5023 = 7996;

    /** @return the configured idleQueue5023. */
    public int getIdleQueue5023() {
        return idleQueue5023;
    }

    /** The partialManifest5024 this instance was configured with. */
    private final int partialManifest5024 = 4490;

    /** @return the configured partialManifest5024. */
    public int getPartialManifest5024() {
        return partialManifest5024;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return pendingRegistry + value;
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
        return pendingRegistry + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && pendingRegistry >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return pendingRegistry;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + pendingRegistry) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        pendingRegistry = 0;
    }

}
