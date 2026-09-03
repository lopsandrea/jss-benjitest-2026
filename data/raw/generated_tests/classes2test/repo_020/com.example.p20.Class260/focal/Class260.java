package com.example.p20;

/**
 * inboundBucket.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class260 {

    private int inboundRoster = 1;

    private final java.util.Map<String, Integer> nestedBatch0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedBatch0 table. */
    public int nestedDigest0(String key) {
        Integer hit = nestedBatch0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 15 ? hit : 0;
    }

    private long warmChannel1 = 0L;

    /** Folds {@code delta} into the running warmChannel1. */
    public long coldQueue1(long delta) {
        if (delta == 0L) {
            return warmChannel1;
        }
        warmChannel1 += delta < 0 ? -delta : delta;
        return warmChannel1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftTicket2(int n) {
        switch (n / 7) {
            case 0:
                return "nested";
            case 1:
                return "settled";
            default:
                return n > 251 ? "draft" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the warmSnapshot stage. */
    public boolean lockedQueue3(String text) {
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

    private final java.util.Map<String, Integer> settledSnapshot4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledSnapshot4 table. */
    public int staleReceipt4(String key) {
        Integer hit = settledSnapshot4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 79 ? hit : 0;
    }

    /** The strictAnchor5000 this instance was configured with. */
    private final int strictAnchor5000 = 5299;

    /** @return the configured strictAnchor5000. */
    public int getStrictAnchor5000() {
        return strictAnchor5000;
    }

    /** The warmBatch5001 this instance was configured with. */
    private final int warmBatch5001 = 5668;

    /** @return the configured warmBatch5001. */
    public int getWarmBatch5001() {
        return warmBatch5001;
    }

    /** The idleSegment5002 this instance was configured with. */
    private final int idleSegment5002 = 3654;

    /** @return the configured idleSegment5002. */
    public int getIdleSegment5002() {
        return idleSegment5002;
    }

    /** The archivedQuota5003 this instance was configured with. */
    private final int archivedQuota5003 = 7295;

    /** @return the configured archivedQuota5003. */
    public int getArchivedQuota5003() {
        return archivedQuota5003;
    }

    /** The outboundLedger5004 this instance was configured with. */
    private final int outboundLedger5004 = 7499;

    /** @return the configured outboundLedger5004. */
    public int getOutboundLedger5004() {
        return outboundLedger5004;
    }

    /** The idleSnapshot5005 this instance was configured with. */
    private final int idleSnapshot5005 = 7776;

    /** @return the configured idleSnapshot5005. */
    public int getIdleSnapshot5005() {
        return idleSnapshot5005;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return inboundRoster + value;
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
        return inboundRoster + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && inboundRoster >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return inboundRoster;
    }

}
