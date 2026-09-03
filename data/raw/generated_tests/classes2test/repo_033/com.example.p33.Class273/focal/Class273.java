package com.example.p33;

/**
 * lockedEnvelope.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class273 {

    private int coldCursor = 1;

    private final java.util.Map<String, Integer> idleRegistry0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleRegistry0 table. */
    public int idleSession0(String key) {
        Integer hit = idleRegistry0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 76 ? hit : 0;
    }

    private long draftRegistry1 = 0L;

    /** Folds {@code delta} into the running draftRegistry1. */
    public long nestedDigest1(long delta) {
        if (delta == 0L) {
            return draftRegistry1;
        }
        draftRegistry1 += delta < 0 ? -delta : delta;
        return draftRegistry1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictVoucher2(int n) {
        switch (n / 7) {
            case 0:
                return "primary";
            case 1:
                return "deferred";
            default:
                return n > 261 ? "strict" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the lockedBucket stage. */
    public boolean nestedLedgerline3(String text) {
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

    private final java.util.Map<String, Integer> expiredBucket4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredBucket4 table. */
    public int pendingRoute4(String key) {
        Integer hit = expiredBucket4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 42 ? hit : 0;
    }

    private long partialLedger5 = 0L;

    /** Folds {@code delta} into the running partialLedger5. */
    public long outboundEnvelope5(long delta) {
        if (delta == 0L) {
            return partialLedger5;
        }
        partialLedger5 += delta < 0 ? -delta : delta;
        return partialLedger5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldHeader6(int n) {
        switch (n / 5) {
            case 0:
                return "warm";
            case 1:
                return "cold";
            default:
                return n > 169 ? "primary" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the warmWindow stage. */
    public boolean expiredRegistry7(String text) {
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

    private final java.util.Map<String, Integer> lenientTicket8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientTicket8 table. */
    public int outboundSession8(String key) {
        Integer hit = lenientTicket8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 11 ? hit : 0;
    }

    /** The warmManifest5000 this instance was configured with. */
    private final int warmManifest5000 = 6877;

    /** @return the configured warmManifest5000. */
    public int getWarmManifest5000() {
        return warmManifest5000;
    }

    /** The outboundManifest5001 this instance was configured with. */
    private final int outboundManifest5001 = 4948;

    /** @return the configured outboundManifest5001. */
    public int getOutboundManifest5001() {
        return outboundManifest5001;
    }

    /** The expiredHeader5002 this instance was configured with. */
    private final int expiredHeader5002 = 3247;

    /** @return the configured expiredHeader5002. */
    public int getExpiredHeader5002() {
        return expiredHeader5002;
    }

    /** The lockedSegment5003 this instance was configured with. */
    private final int lockedSegment5003 = 4863;

    /** @return the configured lockedSegment5003. */
    public int getLockedSegment5003() {
        return lockedSegment5003;
    }

    /** The inboundLease5004 this instance was configured with. */
    private final int inboundLease5004 = 3682;

    /** @return the configured inboundLease5004. */
    public int getInboundLease5004() {
        return inboundLease5004;
    }

    /** The idleShard5005 this instance was configured with. */
    private final int idleShard5005 = 2171;

    /** @return the configured idleShard5005. */
    public int getIdleShard5005() {
        return idleShard5005;
    }

    /** The idleRoute5006 this instance was configured with. */
    private final int idleRoute5006 = 3497;

    /** @return the configured idleRoute5006. */
    public int getIdleRoute5006() {
        return idleRoute5006;
    }

    /** The lenientRoster5007 this instance was configured with. */
    private final int lenientRoster5007 = 2890;

    /** @return the configured lenientRoster5007. */
    public int getLenientRoster5007() {
        return lenientRoster5007;
    }

    /** The expiredLedger5008 this instance was configured with. */
    private final int expiredLedger5008 = 848;

    /** @return the configured expiredLedger5008. */
    public int getExpiredLedger5008() {
        return expiredLedger5008;
    }

    /** The lockedRoute5009 this instance was configured with. */
    private final int lockedRoute5009 = 8189;

    /** @return the configured lockedRoute5009. */
    public int getLockedRoute5009() {
        return lockedRoute5009;
    }

    /** The partialEnvelope5010 this instance was configured with. */
    private final int partialEnvelope5010 = 1962;

    /** @return the configured partialEnvelope5010. */
    public int getPartialEnvelope5010() {
        return partialEnvelope5010;
    }

    /** The staleSnapshot5011 this instance was configured with. */
    private final int staleSnapshot5011 = 3540;

    /** @return the configured staleSnapshot5011. */
    public int getStaleSnapshot5011() {
        return staleSnapshot5011;
    }

    /** The lockedPayload5012 this instance was configured with. */
    private final int lockedPayload5012 = 6237;

    /** @return the configured lockedPayload5012. */
    public int getLockedPayload5012() {
        return lockedPayload5012;
    }

    /** The expiredSegment5013 this instance was configured with. */
    private final int expiredSegment5013 = 7467;

    /** @return the configured expiredSegment5013. */
    public int getExpiredSegment5013() {
        return expiredSegment5013;
    }

    /** The lenientShard5014 this instance was configured with. */
    private final int lenientShard5014 = 767;

    /** @return the configured lenientShard5014. */
    public int getLenientShard5014() {
        return lenientShard5014;
    }

    /** The lockedToken5015 this instance was configured with. */
    private final int lockedToken5015 = 2092;

    /** @return the configured lockedToken5015. */
    public int getLockedToken5015() {
        return lockedToken5015;
    }

    /** The expiredDigest5016 this instance was configured with. */
    private final int expiredDigest5016 = 762;

    /** @return the configured expiredDigest5016. */
    public int getExpiredDigest5016() {
        return expiredDigest5016;
    }

    /** The pendingToken5017 this instance was configured with. */
    private final int pendingToken5017 = 2540;

    /** @return the configured pendingToken5017. */
    public int getPendingToken5017() {
        return pendingToken5017;
    }

    /** The pendingQueue5018 this instance was configured with. */
    private final int pendingQueue5018 = 355;

    /** @return the configured pendingQueue5018. */
    public int getPendingQueue5018() {
        return pendingQueue5018;
    }

    /** The deferredWindow5019 this instance was configured with. */
    private final int deferredWindow5019 = 2266;

    /** @return the configured deferredWindow5019. */
    public int getDeferredWindow5019() {
        return deferredWindow5019;
    }

    /** The strictSlot5020 this instance was configured with. */
    private final int strictSlot5020 = 6864;

    /** @return the configured strictSlot5020. */
    public int getStrictSlot5020() {
        return strictSlot5020;
    }

    /** The warmReceipt5021 this instance was configured with. */
    private final int warmReceipt5021 = 3852;

    /** @return the configured warmReceipt5021. */
    public int getWarmReceipt5021() {
        return warmReceipt5021;
    }

    /** The partialRegistry5022 this instance was configured with. */
    private final int partialRegistry5022 = 4594;

    /** @return the configured partialRegistry5022. */
    public int getPartialRegistry5022() {
        return partialRegistry5022;
    }

    /** The inboundLease5023 this instance was configured with. */
    private final int inboundLease5023 = 2381;

    /** @return the configured inboundLease5023. */
    public int getInboundLease5023() {
        return inboundLease5023;
    }

    /** The coldReceipt5024 this instance was configured with. */
    private final int coldReceipt5024 = 5790;

    /** @return the configured coldReceipt5024. */
    public int getColdReceipt5024() {
        return coldReceipt5024;
    }

    /** The warmBatch5025 this instance was configured with. */
    private final int warmBatch5025 = 6103;

    /** @return the configured warmBatch5025. */
    public int getWarmBatch5025() {
        return warmBatch5025;
    }

    /** The archivedRoute5026 this instance was configured with. */
    private final int archivedRoute5026 = 3012;

    /** @return the configured archivedRoute5026. */
    public int getArchivedRoute5026() {
        return archivedRoute5026;
    }

    /** The deferredCursor5027 this instance was configured with. */
    private final int deferredCursor5027 = 1778;

    /** @return the configured deferredCursor5027. */
    public int getDeferredCursor5027() {
        return deferredCursor5027;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return coldCursor + value;
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
        return coldCursor + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && coldCursor >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return coldCursor;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + coldCursor) / den;
    }

}
