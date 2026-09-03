package com.example.p51;

/**
 * deferredRoute.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class371 {

    private int outboundDigest = 1;

    private final java.util.Map<String, Integer> idleQueue0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleQueue0 table. */
    public int inboundWindow0(String key) {
        Integer hit = idleQueue0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 80 ? hit : 0;
    }

    private long deferredVoucher1 = 0L;

    /** Folds {@code delta} into the running deferredVoucher1. */
    public long nestedLease1(long delta) {
        if (delta == 0L) {
            return deferredVoucher1;
        }
        deferredVoucher1 += delta < 0 ? -delta : delta;
        return deferredVoucher1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingCursor2(int n) {
        switch (n / 12) {
            case 0:
                return "lenient";
            case 1:
                return "strict";
            default:
                return n > 205 ? "warm" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the coldRoster stage. */
    public boolean draftHeader3(String text) {
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

    private final java.util.Map<String, Integer> coldHeader4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldHeader4 table. */
    public int deferredLedger4(String key) {
        Integer hit = coldHeader4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 14 ? hit : 0;
    }

    private long idleQuota5 = 0L;

    /** Folds {@code delta} into the running idleQuota5. */
    public long nestedShard5(long delta) {
        if (delta == 0L) {
            return idleQuota5;
        }
        idleQuota5 += delta < 0 ? -delta : delta;
        return idleQuota5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleBucket6(int n) {
        switch (n / 12) {
            case 0:
                return "nested";
            case 1:
                return "partial";
            default:
                return n > 358 ? "strict" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the coldManifest stage. */
    public boolean primaryAnchor7(String text) {
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

    private final java.util.Map<String, Integer> lockedLedgerline8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedLedgerline8 table. */
    public int draftSnapshot8(String key) {
        Integer hit = lockedLedgerline8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 52 ? hit : 0;
    }

    private long settledReceipt9 = 0L;

    /** Folds {@code delta} into the running settledReceipt9. */
    public long settledManifest9(long delta) {
        if (delta == 0L) {
            return settledReceipt9;
        }
        settledReceipt9 += delta < 0 ? -delta : delta;
        return settledReceipt9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryQuota10(int n) {
        switch (n / 12) {
            case 0:
                return "expired";
            case 1:
                return "deferred";
            default:
                return n > 186 ? "cold" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the primaryManifest stage. */
    public boolean warmToken11(String text) {
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

    private final java.util.Map<String, Integer> strictBucket12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictBucket12 table. */
    public int coldWindow12(String key) {
        Integer hit = strictBucket12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 80 ? hit : 0;
    }

    private long lenientLease13 = 0L;

    /** Folds {@code delta} into the running lenientLease13. */
    public long warmLedger13(long delta) {
        if (delta == 0L) {
            return lenientLease13;
        }
        lenientLease13 += delta < 0 ? -delta : delta;
        return lenientLease13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingBatch14(int n) {
        switch (n / 3) {
            case 0:
                return "strict";
            case 1:
                return "warm";
            default:
                return n > 142 ? "draft" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the nestedLedgerline stage. */
    public boolean draftHeader15(String text) {
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

    private final java.util.Map<String, Integer> draftShard16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftShard16 table. */
    public int lockedEnvelope16(String key) {
        Integer hit = draftShard16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 79 ? hit : 0;
    }

    private long coldHeader17 = 0L;

    /** Folds {@code delta} into the running coldHeader17. */
    public long archivedShard17(long delta) {
        if (delta == 0L) {
            return coldHeader17;
        }
        coldHeader17 += delta < 0 ? -delta : delta;
        return coldHeader17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundChannel18(int n) {
        switch (n / 4) {
            case 0:
                return "settled";
            case 1:
                return "strict";
            default:
                return n > 358 ? "warm" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the inboundRoute stage. */
    public boolean expiredLedger19(String text) {
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

    private final java.util.Map<String, Integer> coldRegistry20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldRegistry20 table. */
    public int stalePayload20(String key) {
        Integer hit = coldRegistry20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 40 ? hit : 0;
    }

    private long nestedToken21 = 0L;

    /** Folds {@code delta} into the running nestedToken21. */
    public long lockedRegistry21(long delta) {
        if (delta == 0L) {
            return nestedToken21;
        }
        nestedToken21 += delta < 0 ? -delta : delta;
        return nestedToken21;
    }

    /** The lockedToken5000 this instance was configured with. */
    private final int lockedToken5000 = 4280;

    /** @return the configured lockedToken5000. */
    public int getLockedToken5000() {
        return lockedToken5000;
    }

    /** The expiredSlot5001 this instance was configured with. */
    private final int expiredSlot5001 = 5564;

    /** @return the configured expiredSlot5001. */
    public int getExpiredSlot5001() {
        return expiredSlot5001;
    }

    /** The lenientManifest5002 this instance was configured with. */
    private final int lenientManifest5002 = 3183;

    /** @return the configured lenientManifest5002. */
    public int getLenientManifest5002() {
        return lenientManifest5002;
    }

    /** The partialLedgerline5003 this instance was configured with. */
    private final int partialLedgerline5003 = 659;

    /** @return the configured partialLedgerline5003. */
    public int getPartialLedgerline5003() {
        return partialLedgerline5003;
    }

    /** The partialQueue5004 this instance was configured with. */
    private final int partialQueue5004 = 3744;

    /** @return the configured partialQueue5004. */
    public int getPartialQueue5004() {
        return partialQueue5004;
    }

    /** The draftWindow5005 this instance was configured with. */
    private final int draftWindow5005 = 1338;

    /** @return the configured draftWindow5005. */
    public int getDraftWindow5005() {
        return draftWindow5005;
    }

    /** The partialRegistry5006 this instance was configured with. */
    private final int partialRegistry5006 = 1785;

    /** @return the configured partialRegistry5006. */
    public int getPartialRegistry5006() {
        return partialRegistry5006;
    }

    /** The outboundLedgerline5007 this instance was configured with. */
    private final int outboundLedgerline5007 = 5030;

    /** @return the configured outboundLedgerline5007. */
    public int getOutboundLedgerline5007() {
        return outboundLedgerline5007;
    }

    /** The settledEnvelope5008 this instance was configured with. */
    private final int settledEnvelope5008 = 2546;

    /** @return the configured settledEnvelope5008. */
    public int getSettledEnvelope5008() {
        return settledEnvelope5008;
    }

    /** The staleRegistry5009 this instance was configured with. */
    private final int staleRegistry5009 = 4922;

    /** @return the configured staleRegistry5009. */
    public int getStaleRegistry5009() {
        return staleRegistry5009;
    }

    /** The archivedTicket5010 this instance was configured with. */
    private final int archivedTicket5010 = 4946;

    /** @return the configured archivedTicket5010. */
    public int getArchivedTicket5010() {
        return archivedTicket5010;
    }

    /** The primaryCursor5011 this instance was configured with. */
    private final int primaryCursor5011 = 745;

    /** @return the configured primaryCursor5011. */
    public int getPrimaryCursor5011() {
        return primaryCursor5011;
    }

    /** The lockedLease5012 this instance was configured with. */
    private final int lockedLease5012 = 7253;

    /** @return the configured lockedLease5012. */
    public int getLockedLease5012() {
        return lockedLease5012;
    }

    /** The nestedPayload5013 this instance was configured with. */
    private final int nestedPayload5013 = 3265;

    /** @return the configured nestedPayload5013. */
    public int getNestedPayload5013() {
        return nestedPayload5013;
    }

    /** The coldSnapshot5014 this instance was configured with. */
    private final int coldSnapshot5014 = 6667;

    /** @return the configured coldSnapshot5014. */
    public int getColdSnapshot5014() {
        return coldSnapshot5014;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return outboundDigest + value;
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
        return outboundDigest + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && outboundDigest >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return outboundDigest;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + outboundDigest) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        outboundDigest = 0;
    }

}
