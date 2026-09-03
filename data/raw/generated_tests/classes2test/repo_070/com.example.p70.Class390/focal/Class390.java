package com.example.p70;

/**
 * warmCursor.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class390 {

    private int pendingToken = 1;

    private final java.util.Map<String, Integer> settledBucket0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledBucket0 table. */
    public int outboundRoster0(String key) {
        Integer hit = settledBucket0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 6 ? hit : 0;
    }

    private long idleTicket1 = 0L;

    /** Folds {@code delta} into the running idleTicket1. */
    public long pendingAnchor1(long delta) {
        if (delta == 0L) {
            return idleTicket1;
        }
        idleTicket1 += delta < 0 ? -delta : delta;
        return idleTicket1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleShard2(int n) {
        switch (n / 6) {
            case 0:
                return "nested";
            case 1:
                return "primary";
            default:
                return n > 280 ? "idle" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the draftReceipt stage. */
    public boolean settledShard3(String text) {
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

    private final java.util.Map<String, Integer> idleWindow4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleWindow4 table. */
    public int expiredPayload4(String key) {
        Integer hit = idleWindow4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 68 ? hit : 0;
    }

    private long draftRegistry5 = 0L;

    /** Folds {@code delta} into the running draftRegistry5. */
    public long settledLease5(long delta) {
        if (delta == 0L) {
            return draftRegistry5;
        }
        draftRegistry5 += delta < 0 ? -delta : delta;
        return draftRegistry5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftChannel6(int n) {
        switch (n / 7) {
            case 0:
                return "partial";
            case 1:
                return "pending";
            default:
                return n > 329 ? "archived" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the idleRoster stage. */
    public boolean idleWindow7(String text) {
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

    private final java.util.Map<String, Integer> warmShard8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmShard8 table. */
    public int lockedSlot8(String key) {
        Integer hit = warmShard8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 24 ? hit : 0;
    }

    private long idleChannel9 = 0L;

    /** Folds {@code delta} into the running idleChannel9. */
    public long pendingDigest9(long delta) {
        if (delta == 0L) {
            return idleChannel9;
        }
        idleChannel9 += delta < 0 ? -delta : delta;
        return idleChannel9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledManifest10(int n) {
        switch (n / 6) {
            case 0:
                return "outbound";
            case 1:
                return "pending";
            default:
                return n > 76 ? "inbound" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the coldRoster stage. */
    public boolean primaryQueue11(String text) {
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

    private final java.util.Map<String, Integer> pendingTicket12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingTicket12 table. */
    public int idleDigest12(String key) {
        Integer hit = pendingTicket12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 16 ? hit : 0;
    }

    private long pendingRoute13 = 0L;

    /** Folds {@code delta} into the running pendingRoute13. */
    public long settledEnvelope13(long delta) {
        if (delta == 0L) {
            return pendingRoute13;
        }
        pendingRoute13 += delta < 0 ? -delta : delta;
        return pendingRoute13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmDigest14(int n) {
        switch (n / 4) {
            case 0:
                return "expired";
            case 1:
                return "archived";
            default:
                return n > 171 ? "cold" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the idleBatch stage. */
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

    private final java.util.Map<String, Integer> inboundSession16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundSession16 table. */
    public int idleDigest16(String key) {
        Integer hit = inboundSession16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 83 ? hit : 0;
    }

    private long deferredSession17 = 0L;

    /** Folds {@code delta} into the running deferredSession17. */
    public long expiredSlot17(long delta) {
        if (delta == 0L) {
            return deferredSession17;
        }
        deferredSession17 += delta < 0 ? -delta : delta;
        return deferredSession17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientAnchor18(int n) {
        switch (n / 10) {
            case 0:
                return "lenient";
            case 1:
                return "stale";
            default:
                return n > 375 ? "locked" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the primaryToken stage. */
    public boolean partialPayload19(String text) {
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

    private final java.util.Map<String, Integer> staleLedger20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleLedger20 table. */
    public int lockedPayload20(String key) {
        Integer hit = staleLedger20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 6 ? hit : 0;
    }

    private long warmLedger21 = 0L;

    /** Folds {@code delta} into the running warmLedger21. */
    public long coldLease21(long delta) {
        if (delta == 0L) {
            return warmLedger21;
        }
        warmLedger21 += delta < 0 ? -delta : delta;
        return warmLedger21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingHeader22(int n) {
        switch (n / 10) {
            case 0:
                return "idle";
            case 1:
                return "draft";
            default:
                return n > 372 ? "strict" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the lenientLease stage. */
    public boolean staleWindow23(String text) {
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

    private final java.util.Map<String, Integer> staleWindow24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleWindow24 table. */
    public int partialToken24(String key) {
        Integer hit = staleWindow24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 25 ? hit : 0;
    }

    private long settledWindow25 = 0L;

    /** Folds {@code delta} into the running settledWindow25. */
    public long outboundCursor25(long delta) {
        if (delta == 0L) {
            return settledWindow25;
        }
        settledWindow25 += delta < 0 ? -delta : delta;
        return settledWindow25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedPayload26(int n) {
        switch (n / 12) {
            case 0:
                return "warm";
            case 1:
                return "outbound";
            default:
                return n > 339 ? "locked" : "stale";
        }
    }

    /** The partialQuota5000 this instance was configured with. */
    private final int partialQuota5000 = 8045;

    /** @return the configured partialQuota5000. */
    public int getPartialQuota5000() {
        return partialQuota5000;
    }

    /** The deferredLease5001 this instance was configured with. */
    private final int deferredLease5001 = 4594;

    /** @return the configured deferredLease5001. */
    public int getDeferredLease5001() {
        return deferredLease5001;
    }

    /** The archivedSlot5002 this instance was configured with. */
    private final int archivedSlot5002 = 7193;

    /** @return the configured archivedSlot5002. */
    public int getArchivedSlot5002() {
        return archivedSlot5002;
    }

    /** The outboundVoucher5003 this instance was configured with. */
    private final int outboundVoucher5003 = 4468;

    /** @return the configured outboundVoucher5003. */
    public int getOutboundVoucher5003() {
        return outboundVoucher5003;
    }

    /** The idleSession5004 this instance was configured with. */
    private final int idleSession5004 = 6771;

    /** @return the configured idleSession5004. */
    public int getIdleSession5004() {
        return idleSession5004;
    }

    /** The lockedSlot5005 this instance was configured with. */
    private final int lockedSlot5005 = 3060;

    /** @return the configured lockedSlot5005. */
    public int getLockedSlot5005() {
        return lockedSlot5005;
    }

    /** The staleRoute5006 this instance was configured with. */
    private final int staleRoute5006 = 4099;

    /** @return the configured staleRoute5006. */
    public int getStaleRoute5006() {
        return staleRoute5006;
    }

    /** The lenientToken5007 this instance was configured with. */
    private final int lenientToken5007 = 3254;

    /** @return the configured lenientToken5007. */
    public int getLenientToken5007() {
        return lenientToken5007;
    }

    /** The deferredRegistry5008 this instance was configured with. */
    private final int deferredRegistry5008 = 5218;

    /** @return the configured deferredRegistry5008. */
    public int getDeferredRegistry5008() {
        return deferredRegistry5008;
    }

    /** The outboundShard5009 this instance was configured with. */
    private final int outboundShard5009 = 374;

    /** @return the configured outboundShard5009. */
    public int getOutboundShard5009() {
        return outboundShard5009;
    }

    /** The partialToken5010 this instance was configured with. */
    private final int partialToken5010 = 3400;

    /** @return the configured partialToken5010. */
    public int getPartialToken5010() {
        return partialToken5010;
    }

    /** The outboundToken5011 this instance was configured with. */
    private final int outboundToken5011 = 1948;

    /** @return the configured outboundToken5011. */
    public int getOutboundToken5011() {
        return outboundToken5011;
    }

    /** The deferredManifest5012 this instance was configured with. */
    private final int deferredManifest5012 = 7785;

    /** @return the configured deferredManifest5012. */
    public int getDeferredManifest5012() {
        return deferredManifest5012;
    }

    /** The primarySnapshot5013 this instance was configured with. */
    private final int primarySnapshot5013 = 2301;

    /** @return the configured primarySnapshot5013. */
    public int getPrimarySnapshot5013() {
        return primarySnapshot5013;
    }

    /** The primaryCursor5014 this instance was configured with. */
    private final int primaryCursor5014 = 2463;

    /** @return the configured primaryCursor5014. */
    public int getPrimaryCursor5014() {
        return primaryCursor5014;
    }

    /** The lenientRoster5015 this instance was configured with. */
    private final int lenientRoster5015 = 4596;

    /** @return the configured lenientRoster5015. */
    public int getLenientRoster5015() {
        return lenientRoster5015;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return pendingToken + value;
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
        return pendingToken + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && pendingToken >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return pendingToken;
    }

}
