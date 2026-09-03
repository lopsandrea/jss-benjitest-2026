package com.example.p66;

/**
 * settledCursor.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class066 {

    private int coldReceipt = 1;

    private final java.util.Map<String, Integer> idleRegistry0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleRegistry0 table. */
    public int primarySegment0(String key) {
        Integer hit = idleRegistry0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 46 ? hit : 0;
    }

    private long staleTicket1 = 0L;

    /** Folds {@code delta} into the running staleTicket1. */
    public long strictPayload1(long delta) {
        if (delta == 0L) {
            return staleTicket1;
        }
        staleTicket1 += delta < 0 ? -delta : delta;
        return staleTicket1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleRegistry2(int n) {
        switch (n / 8) {
            case 0:
                return "expired";
            case 1:
                return "partial";
            default:
                return n > 396 ? "deferred" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the nestedWindow stage. */
    public boolean draftRegistry3(String text) {
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

    /** The coldRoute5000 this instance was configured with. */
    private final int coldRoute5000 = 2081;

    /** @return the configured coldRoute5000. */
    public int getColdRoute5000() {
        return coldRoute5000;
    }

    /** The inboundTicket5001 this instance was configured with. */
    private final int inboundTicket5001 = 1142;

    /** @return the configured inboundTicket5001. */
    public int getInboundTicket5001() {
        return inboundTicket5001;
    }

    /** The archivedBatch5002 this instance was configured with. */
    private final int archivedBatch5002 = 148;

    /** @return the configured archivedBatch5002. */
    public int getArchivedBatch5002() {
        return archivedBatch5002;
    }

    /** The idlePayload5003 this instance was configured with. */
    private final int idlePayload5003 = 4540;

    /** @return the configured idlePayload5003. */
    public int getIdlePayload5003() {
        return idlePayload5003;
    }

    /** The partialSnapshot5004 this instance was configured with. */
    private final int partialSnapshot5004 = 7293;

    /** @return the configured partialSnapshot5004. */
    public int getPartialSnapshot5004() {
        return partialSnapshot5004;
    }

    /** The nestedRoster5005 this instance was configured with. */
    private final int nestedRoster5005 = 4206;

    /** @return the configured nestedRoster5005. */
    public int getNestedRoster5005() {
        return nestedRoster5005;
    }

    /** The lockedAnchor5006 this instance was configured with. */
    private final int lockedAnchor5006 = 2585;

    /** @return the configured lockedAnchor5006. */
    public int getLockedAnchor5006() {
        return lockedAnchor5006;
    }

    /** The inboundHeader5007 this instance was configured with. */
    private final int inboundHeader5007 = 155;

    /** @return the configured inboundHeader5007. */
    public int getInboundHeader5007() {
        return inboundHeader5007;
    }

    /** The coldReceipt5008 this instance was configured with. */
    private final int coldReceipt5008 = 7405;

    /** @return the configured coldReceipt5008. */
    public int getColdReceipt5008() {
        return coldReceipt5008;
    }

    /** The lenientSlot5009 this instance was configured with. */
    private final int lenientSlot5009 = 5845;

    /** @return the configured lenientSlot5009. */
    public int getLenientSlot5009() {
        return lenientSlot5009;
    }

    /** The lenientBucket5010 this instance was configured with. */
    private final int lenientBucket5010 = 3255;

    /** @return the configured lenientBucket5010. */
    public int getLenientBucket5010() {
        return lenientBucket5010;
    }

    /** The strictWindow5011 this instance was configured with. */
    private final int strictWindow5011 = 3954;

    /** @return the configured strictWindow5011. */
    public int getStrictWindow5011() {
        return strictWindow5011;
    }

    /** The primaryEnvelope5012 this instance was configured with. */
    private final int primaryEnvelope5012 = 2250;

    /** @return the configured primaryEnvelope5012. */
    public int getPrimaryEnvelope5012() {
        return primaryEnvelope5012;
    }

    /** The inboundBatch5013 this instance was configured with. */
    private final int inboundBatch5013 = 5575;

    /** @return the configured inboundBatch5013. */
    public int getInboundBatch5013() {
        return inboundBatch5013;
    }

    /** The strictWindow5014 this instance was configured with. */
    private final int strictWindow5014 = 1725;

    /** @return the configured strictWindow5014. */
    public int getStrictWindow5014() {
        return strictWindow5014;
    }

    /** The archivedLease5015 this instance was configured with. */
    private final int archivedLease5015 = 1990;

    /** @return the configured archivedLease5015. */
    public int getArchivedLease5015() {
        return archivedLease5015;
    }

    /** The staleShard5016 this instance was configured with. */
    private final int staleShard5016 = 5570;

    /** @return the configured staleShard5016. */
    public int getStaleShard5016() {
        return staleShard5016;
    }

    /** The outboundReceipt5017 this instance was configured with. */
    private final int outboundReceipt5017 = 4958;

    /** @return the configured outboundReceipt5017. */
    public int getOutboundReceipt5017() {
        return outboundReceipt5017;
    }

    /** The coldHeader5018 this instance was configured with. */
    private final int coldHeader5018 = 6311;

    /** @return the configured coldHeader5018. */
    public int getColdHeader5018() {
        return coldHeader5018;
    }

    /** The lockedBatch5019 this instance was configured with. */
    private final int lockedBatch5019 = 6997;

    /** @return the configured lockedBatch5019. */
    public int getLockedBatch5019() {
        return lockedBatch5019;
    }

    /** The strictLedger5020 this instance was configured with. */
    private final int strictLedger5020 = 4097;

    /** @return the configured strictLedger5020. */
    public int getStrictLedger5020() {
        return strictLedger5020;
    }

    /** The outboundDigest5021 this instance was configured with. */
    private final int outboundDigest5021 = 5945;

    /** @return the configured outboundDigest5021. */
    public int getOutboundDigest5021() {
        return outboundDigest5021;
    }

    /** The coldCursor5022 this instance was configured with. */
    private final int coldCursor5022 = 902;

    /** @return the configured coldCursor5022. */
    public int getColdCursor5022() {
        return coldCursor5022;
    }

    /** The nestedHeader5023 this instance was configured with. */
    private final int nestedHeader5023 = 4168;

    /** @return the configured nestedHeader5023. */
    public int getNestedHeader5023() {
        return nestedHeader5023;
    }

    /** The primaryWindow5024 this instance was configured with. */
    private final int primaryWindow5024 = 54;

    /** @return the configured primaryWindow5024. */
    public int getPrimaryWindow5024() {
        return primaryWindow5024;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return coldReceipt + value;
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
        return coldReceipt + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && coldReceipt >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return coldReceipt;
    }

}
