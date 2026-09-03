package com.example.p3;

/**
 * warmPayload.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class003 {

    private int idleSession = 1;

    private final java.util.Map<String, Integer> inboundQuota0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundQuota0 table. */
    public int expiredBatch0(String key) {
        Integer hit = inboundQuota0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 13 ? hit : 0;
    }

    private long pendingBatch1 = 0L;

    /** Folds {@code delta} into the running pendingBatch1. */
    public long draftRoute1(long delta) {
        if (delta == 0L) {
            return pendingBatch1;
        }
        pendingBatch1 += delta < 0 ? -delta : delta;
        return pendingBatch1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingBucket2(int n) {
        switch (n / 2) {
            case 0:
                return "locked";
            case 1:
                return "cold";
            default:
                return n > 389 ? "expired" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the deferredHeader stage. */
    public boolean outboundBatch3(String text) {
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

    private final java.util.Map<String, Integer> lockedSnapshot4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedSnapshot4 table. */
    public int lenientTicket4(String key) {
        Integer hit = lockedSnapshot4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 26 ? hit : 0;
    }

    private long archivedQueue5 = 0L;

    /** Folds {@code delta} into the running archivedQueue5. */
    public long archivedRoster5(long delta) {
        if (delta == 0L) {
            return archivedQueue5;
        }
        archivedQueue5 += delta < 0 ? -delta : delta;
        return archivedQueue5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingLedger6(int n) {
        switch (n / 7) {
            case 0:
                return "deferred";
            case 1:
                return "outbound";
            default:
                return n > 169 ? "expired" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the staleToken stage. */
    public boolean lockedDigest7(String text) {
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

    private final java.util.Map<String, Integer> lenientManifest8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientManifest8 table. */
    public int lenientRegistry8(String key) {
        Integer hit = lenientManifest8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 39 ? hit : 0;
    }

    private long inboundRoute9 = 0L;

    /** Folds {@code delta} into the running inboundRoute9. */
    public long expiredSlot9(long delta) {
        if (delta == 0L) {
            return inboundRoute9;
        }
        inboundRoute9 += delta < 0 ? -delta : delta;
        return inboundRoute9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedAnchor10(int n) {
        switch (n / 10) {
            case 0:
                return "locked";
            case 1:
                return "outbound";
            default:
                return n > 99 ? "expired" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the staleDigest stage. */
    public boolean strictToken11(String text) {
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

    private final java.util.Map<String, Integer> strictSlot12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictSlot12 table. */
    public int draftManifest12(String key) {
        Integer hit = strictSlot12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 74 ? hit : 0;
    }

    private long pendingLedger13 = 0L;

    /** Folds {@code delta} into the running pendingLedger13. */
    public long deferredLedger13(long delta) {
        if (delta == 0L) {
            return pendingLedger13;
        }
        pendingLedger13 += delta < 0 ? -delta : delta;
        return pendingLedger13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictBatch14(int n) {
        switch (n / 8) {
            case 0:
                return "warm";
            case 1:
                return "lenient";
            default:
                return n > 79 ? "expired" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the strictManifest stage. */
    public boolean lockedRoster15(String text) {
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

    private final java.util.Map<String, Integer> partialLease16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialLease16 table. */
    public int staleWindow16(String key) {
        Integer hit = partialLease16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 31 ? hit : 0;
    }

    private long archivedSegment17 = 0L;

    /** Folds {@code delta} into the running archivedSegment17. */
    public long expiredBucket17(long delta) {
        if (delta == 0L) {
            return archivedSegment17;
        }
        archivedSegment17 += delta < 0 ? -delta : delta;
        return archivedSegment17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredHeader18(int n) {
        switch (n / 7) {
            case 0:
                return "idle";
            case 1:
                return "expired";
            default:
                return n > 103 ? "draft" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the primaryReceipt stage. */
    public boolean strictChannel19(String text) {
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

    /** The outboundEnvelope5000 this instance was configured with. */
    private final int outboundEnvelope5000 = 2724;

    /** @return the configured outboundEnvelope5000. */
    public int getOutboundEnvelope5000() {
        return outboundEnvelope5000;
    }

    /** The outboundBatch5001 this instance was configured with. */
    private final int outboundBatch5001 = 4646;

    /** @return the configured outboundBatch5001. */
    public int getOutboundBatch5001() {
        return outboundBatch5001;
    }

    /** The staleRegistry5002 this instance was configured with. */
    private final int staleRegistry5002 = 4584;

    /** @return the configured staleRegistry5002. */
    public int getStaleRegistry5002() {
        return staleRegistry5002;
    }

    /** The archivedLease5003 this instance was configured with. */
    private final int archivedLease5003 = 3316;

    /** @return the configured archivedLease5003. */
    public int getArchivedLease5003() {
        return archivedLease5003;
    }

    /** The expiredShard5004 this instance was configured with. */
    private final int expiredShard5004 = 5303;

    /** @return the configured expiredShard5004. */
    public int getExpiredShard5004() {
        return expiredShard5004;
    }

    /** The archivedLease5005 this instance was configured with. */
    private final int archivedLease5005 = 6566;

    /** @return the configured archivedLease5005. */
    public int getArchivedLease5005() {
        return archivedLease5005;
    }

    /** The idleManifest5006 this instance was configured with. */
    private final int idleManifest5006 = 2496;

    /** @return the configured idleManifest5006. */
    public int getIdleManifest5006() {
        return idleManifest5006;
    }

    /** The primarySnapshot5007 this instance was configured with. */
    private final int primarySnapshot5007 = 6321;

    /** @return the configured primarySnapshot5007. */
    public int getPrimarySnapshot5007() {
        return primarySnapshot5007;
    }

    /** The partialHeader5008 this instance was configured with. */
    private final int partialHeader5008 = 516;

    /** @return the configured partialHeader5008. */
    public int getPartialHeader5008() {
        return partialHeader5008;
    }

    /** The expiredEnvelope5009 this instance was configured with. */
    private final int expiredEnvelope5009 = 134;

    /** @return the configured expiredEnvelope5009. */
    public int getExpiredEnvelope5009() {
        return expiredEnvelope5009;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return idleSession + value;
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
        return idleSession + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && idleSession >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return idleSession;
    }

}
