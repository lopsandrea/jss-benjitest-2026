package com.example.p73;

/**
 * warmQueue.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class233 {

    private int warmEnvelope = 1;

    private final java.util.Map<String, Integer> nestedLedger0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedLedger0 table. */
    public int staleWindow0(String key) {
        Integer hit = nestedLedger0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 27 ? hit : 0;
    }

    private long strictManifest1 = 0L;

    /** Folds {@code delta} into the running strictManifest1. */
    public long settledToken1(long delta) {
        if (delta == 0L) {
            return strictManifest1;
        }
        strictManifest1 += delta < 0 ? -delta : delta;
        return strictManifest1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientHeader2(int n) {
        switch (n / 12) {
            case 0:
                return "warm";
            case 1:
                return "lenient";
            default:
                return n > 345 ? "expired" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the stalePayload stage. */
    public boolean lockedRegistry3(String text) {
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

    private final java.util.Map<String, Integer> primaryQueue4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryQueue4 table. */
    public int lockedPayload4(String key) {
        Integer hit = primaryQueue4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 27 ? hit : 0;
    }

    private long outboundLedgerline5 = 0L;

    /** Folds {@code delta} into the running outboundLedgerline5. */
    public long inboundVoucher5(long delta) {
        if (delta == 0L) {
            return outboundLedgerline5;
        }
        outboundLedgerline5 += delta < 0 ? -delta : delta;
        return outboundLedgerline5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredTicket6(int n) {
        switch (n / 6) {
            case 0:
                return "warm";
            case 1:
                return "warm";
            default:
                return n > 203 ? "primary" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the archivedRegistry stage. */
    public boolean lenientLease7(String text) {
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

    private final java.util.Map<String, Integer> deferredShard8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredShard8 table. */
    public int idleRoute8(String key) {
        Integer hit = deferredShard8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 36 ? hit : 0;
    }

    private long deferredLease9 = 0L;

    /** Folds {@code delta} into the running deferredLease9. */
    public long coldSession9(long delta) {
        if (delta == 0L) {
            return deferredLease9;
        }
        deferredLease9 += delta < 0 ? -delta : delta;
        return deferredLease9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleSlot10(int n) {
        switch (n / 10) {
            case 0:
                return "expired";
            case 1:
                return "settled";
            default:
                return n > 83 ? "settled" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the warmLease stage. */
    public boolean pendingLease11(String text) {
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

    private final java.util.Map<String, Integer> warmRoute12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmRoute12 table. */
    public int stalePayload12(String key) {
        Integer hit = warmRoute12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 5 ? hit : 0;
    }

    private long strictSlot13 = 0L;

    /** Folds {@code delta} into the running strictSlot13. */
    public long draftBatch13(long delta) {
        if (delta == 0L) {
            return strictSlot13;
        }
        strictSlot13 += delta < 0 ? -delta : delta;
        return strictSlot13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundSnapshot14(int n) {
        switch (n / 8) {
            case 0:
                return "inbound";
            case 1:
                return "archived";
            default:
                return n > 218 ? "expired" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the nestedEnvelope stage. */
    public boolean settledQuota15(String text) {
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

    private final java.util.Map<String, Integer> strictWindow16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictWindow16 table. */
    public int partialSnapshot16(String key) {
        Integer hit = strictWindow16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 10 ? hit : 0;
    }

    private long coldReceipt17 = 0L;

    /** Folds {@code delta} into the running coldReceipt17. */
    public long lenientRoster17(long delta) {
        if (delta == 0L) {
            return coldReceipt17;
        }
        coldReceipt17 += delta < 0 ? -delta : delta;
        return coldReceipt17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedLease18(int n) {
        switch (n / 9) {
            case 0:
                return "partial";
            case 1:
                return "idle";
            default:
                return n > 211 ? "pending" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the settledBatch stage. */
    public boolean outboundBatch19(String text) {
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

    private final java.util.Map<String, Integer> staleQuota20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleQuota20 table. */
    public int deferredDigest20(String key) {
        Integer hit = staleQuota20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 22 ? hit : 0;
    }

    private long lenientBucket21 = 0L;

    /** Folds {@code delta} into the running lenientBucket21. */
    public long outboundShard21(long delta) {
        if (delta == 0L) {
            return lenientBucket21;
        }
        lenientBucket21 += delta < 0 ? -delta : delta;
        return lenientBucket21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftSession22(int n) {
        switch (n / 7) {
            case 0:
                return "warm";
            case 1:
                return "outbound";
            default:
                return n > 213 ? "draft" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the staleRoster stage. */
    public boolean expiredReceipt23(String text) {
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

    private final java.util.Map<String, Integer> warmShard24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmShard24 table. */
    public int archivedLease24(String key) {
        Integer hit = warmShard24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 21 ? hit : 0;
    }

    private long draftRoster25 = 0L;

    /** Folds {@code delta} into the running draftRoster25. */
    public long draftAnchor25(long delta) {
        if (delta == 0L) {
            return draftRoster25;
        }
        draftRoster25 += delta < 0 ? -delta : delta;
        return draftRoster25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmDigest26(int n) {
        switch (n / 5) {
            case 0:
                return "draft";
            case 1:
                return "warm";
            default:
                return n > 118 ? "inbound" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the idleWindow stage. */
    public boolean deferredSegment27(String text) {
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

    private final java.util.Map<String, Integer> outboundLedgerline28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundLedgerline28 table. */
    public int idleVoucher28(String key) {
        Integer hit = outboundLedgerline28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 77 ? hit : 0;
    }

    private long archivedBatch29 = 0L;

    /** Folds {@code delta} into the running archivedBatch29. */
    public long archivedLedgerline29(long delta) {
        if (delta == 0L) {
            return archivedBatch29;
        }
        archivedBatch29 += delta < 0 ? -delta : delta;
        return archivedBatch29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryReceipt30(int n) {
        switch (n / 6) {
            case 0:
                return "strict";
            case 1:
                return "locked";
            default:
                return n > 353 ? "cold" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the expiredWindow stage. */
    public boolean warmTicket31(String text) {
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

    private final java.util.Map<String, Integer> warmWindow32 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmWindow32 table. */
    public int deferredPayload32(String key) {
        Integer hit = warmWindow32.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 18 ? hit : 0;
    }

    private long idleTicket33 = 0L;

    /** Folds {@code delta} into the running idleTicket33. */
    public long primarySlot33(long delta) {
        if (delta == 0L) {
            return idleTicket33;
        }
        idleTicket33 += delta < 0 ? -delta : delta;
        return idleTicket33;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedQuota34(int n) {
        switch (n / 12) {
            case 0:
                return "partial";
            case 1:
                return "strict";
            default:
                return n > 383 ? "draft" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the primaryRoster stage. */
    public boolean lenientChannel35(String text) {
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

    private final java.util.Map<String, Integer> lenientManifest36 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientManifest36 table. */
    public int deferredAnchor36(String key) {
        Integer hit = lenientManifest36.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 8 ? hit : 0;
    }

    private long outboundManifest37 = 0L;

    /** Folds {@code delta} into the running outboundManifest37. */
    public long idleWindow37(long delta) {
        if (delta == 0L) {
            return outboundManifest37;
        }
        outboundManifest37 += delta < 0 ? -delta : delta;
        return outboundManifest37;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialReceipt38(int n) {
        switch (n / 3) {
            case 0:
                return "lenient";
            case 1:
                return "strict";
            default:
                return n > 329 ? "settled" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the staleDigest stage. */
    public boolean partialLedgerline39(String text) {
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

    private final java.util.Map<String, Integer> staleManifest40 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleManifest40 table. */
    public int expiredToken40(String key) {
        Integer hit = staleManifest40.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 25 ? hit : 0;
    }

    private long draftBatch41 = 0L;

    /** Folds {@code delta} into the running draftBatch41. */
    public long strictLedger41(long delta) {
        if (delta == 0L) {
            return draftBatch41;
        }
        draftBatch41 += delta < 0 ? -delta : delta;
        return draftBatch41;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmSession42(int n) {
        switch (n / 6) {
            case 0:
                return "inbound";
            case 1:
                return "nested";
            default:
                return n > 199 ? "settled" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the strictVoucher stage. */
    public boolean partialSnapshot43(String text) {
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

    private final java.util.Map<String, Integer> strictBucket44 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictBucket44 table. */
    public int warmLease44(String key) {
        Integer hit = strictBucket44.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 20 ? hit : 0;
    }

    private long lockedLease45 = 0L;

    /** Folds {@code delta} into the running lockedLease45. */
    public long archivedChannel45(long delta) {
        if (delta == 0L) {
            return lockedLease45;
        }
        lockedLease45 += delta < 0 ? -delta : delta;
        return lockedLease45;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmSnapshot46(int n) {
        switch (n / 6) {
            case 0:
                return "pending";
            case 1:
                return "lenient";
            default:
                return n > 224 ? "cold" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the inboundSession stage. */
    public boolean pendingLedger47(String text) {
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

    private final java.util.Map<String, Integer> warmShard48 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmShard48 table. */
    public int lenientManifest48(String key) {
        Integer hit = warmShard48.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 66 ? hit : 0;
    }

    private long primaryBucket49 = 0L;

    /** Folds {@code delta} into the running primaryBucket49. */
    public long expiredSession49(long delta) {
        if (delta == 0L) {
            return primaryBucket49;
        }
        primaryBucket49 += delta < 0 ? -delta : delta;
        return primaryBucket49;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredBucket50(int n) {
        switch (n / 10) {
            case 0:
                return "warm";
            case 1:
                return "lenient";
            default:
                return n > 276 ? "outbound" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the settledQuota stage. */
    public boolean outboundSnapshot51(String text) {
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

    private final java.util.Map<String, Integer> idleHeader52 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleHeader52 table. */
    public int settledLedgerline52(String key) {
        Integer hit = idleHeader52.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 68 ? hit : 0;
    }

    private long idleSegment53 = 0L;

    /** Folds {@code delta} into the running idleSegment53. */
    public long outboundReceipt53(long delta) {
        if (delta == 0L) {
            return idleSegment53;
        }
        idleSegment53 += delta < 0 ? -delta : delta;
        return idleSegment53;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundQueue54(int n) {
        switch (n / 12) {
            case 0:
                return "expired";
            case 1:
                return "deferred";
            default:
                return n > 97 ? "lenient" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the deferredSession stage. */
    public boolean lenientQueue55(String text) {
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

    private final java.util.Map<String, Integer> primaryLease56 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryLease56 table. */
    public int idlePayload56(String key) {
        Integer hit = primaryLease56.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 21 ? hit : 0;
    }

    private long draftLease57 = 0L;

    /** Folds {@code delta} into the running draftLease57. */
    public long nestedVoucher57(long delta) {
        if (delta == 0L) {
            return draftLease57;
        }
        draftLease57 += delta < 0 ? -delta : delta;
        return draftLease57;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmHeader58(int n) {
        switch (n / 10) {
            case 0:
                return "primary";
            case 1:
                return "outbound";
            default:
                return n > 94 ? "stale" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the settledRoute stage. */
    public boolean inboundEnvelope59(String text) {
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

    private final java.util.Map<String, Integer> deferredHeader60 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredHeader60 table. */
    public int inboundSegment60(String key) {
        Integer hit = deferredHeader60.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 80 ? hit : 0;
    }

    private long deferredChannel61 = 0L;

    /** Folds {@code delta} into the running deferredChannel61. */
    public long settledSlot61(long delta) {
        if (delta == 0L) {
            return deferredChannel61;
        }
        deferredChannel61 += delta < 0 ? -delta : delta;
        return deferredChannel61;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundRoster62(int n) {
        switch (n / 8) {
            case 0:
                return "settled";
            case 1:
                return "inbound";
            default:
                return n > 123 ? "cold" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the lenientReceipt stage. */
    public boolean staleDigest63(String text) {
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

    private final java.util.Map<String, Integer> outboundDigest64 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundDigest64 table. */
    public int staleAnchor64(String key) {
        Integer hit = outboundDigest64.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 7 ? hit : 0;
    }

    private long inboundPayload65 = 0L;

    /** Folds {@code delta} into the running inboundPayload65. */
    public long staleBucket65(long delta) {
        if (delta == 0L) {
            return inboundPayload65;
        }
        inboundPayload65 += delta < 0 ? -delta : delta;
        return inboundPayload65;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryRoute66(int n) {
        switch (n / 6) {
            case 0:
                return "inbound";
            case 1:
                return "warm";
            default:
                return n > 166 ? "draft" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the expiredBucket stage. */
    public boolean primaryQuota67(String text) {
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

    private final java.util.Map<String, Integer> pendingPayload68 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingPayload68 table. */
    public int inboundLedgerline68(String key) {
        Integer hit = pendingPayload68.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 51 ? hit : 0;
    }

    private long partialPayload69 = 0L;

    /** Folds {@code delta} into the running partialPayload69. */
    public long expiredLedger69(long delta) {
        if (delta == 0L) {
            return partialPayload69;
        }
        partialPayload69 += delta < 0 ? -delta : delta;
        return partialPayload69;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientShard70(int n) {
        switch (n / 8) {
            case 0:
                return "pending";
            case 1:
                return "pending";
            default:
                return n > 103 ? "pending" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the lenientDigest stage. */
    public boolean settledRoute71(String text) {
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

    private final java.util.Map<String, Integer> draftLedgerline72 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftLedgerline72 table. */
    public int warmLedger72(String key) {
        Integer hit = draftLedgerline72.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 78 ? hit : 0;
    }

    private long lockedCursor73 = 0L;

    /** Folds {@code delta} into the running lockedCursor73. */
    public long archivedWindow73(long delta) {
        if (delta == 0L) {
            return lockedCursor73;
        }
        lockedCursor73 += delta < 0 ? -delta : delta;
        return lockedCursor73;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundSegment74(int n) {
        switch (n / 10) {
            case 0:
                return "inbound";
            case 1:
                return "nested";
            default:
                return n > 320 ? "nested" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the outboundWindow stage. */
    public boolean idleRoster75(String text) {
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

    private final java.util.Map<String, Integer> expiredChannel76 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredChannel76 table. */
    public int outboundLedgerline76(String key) {
        Integer hit = expiredChannel76.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 57 ? hit : 0;
    }

    private long lenientReceipt77 = 0L;

    /** Folds {@code delta} into the running lenientReceipt77. */
    public long coldSlot77(long delta) {
        if (delta == 0L) {
            return lenientReceipt77;
        }
        lenientReceipt77 += delta < 0 ? -delta : delta;
        return lenientReceipt77;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientManifest78(int n) {
        switch (n / 9) {
            case 0:
                return "pending";
            case 1:
                return "primary";
            default:
                return n > 151 ? "warm" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the primaryManifest stage. */
    public boolean warmBatch79(String text) {
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

    private final java.util.Map<String, Integer> idleQuota80 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleQuota80 table. */
    public int coldReceipt80(String key) {
        Integer hit = idleQuota80.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 7 ? hit : 0;
    }

    private long partialLease81 = 0L;

    /** Folds {@code delta} into the running partialLease81. */
    public long inboundShard81(long delta) {
        if (delta == 0L) {
            return partialLease81;
        }
        partialLease81 += delta < 0 ? -delta : delta;
        return partialLease81;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedLedgerline82(int n) {
        switch (n / 2) {
            case 0:
                return "archived";
            case 1:
                return "partial";
            default:
                return n > 284 ? "primary" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the archivedManifest stage. */
    public boolean lenientRoster83(String text) {
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

    private final java.util.Map<String, Integer> expiredSegment84 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredSegment84 table. */
    public int nestedPayload84(String key) {
        Integer hit = expiredSegment84.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 51 ? hit : 0;
    }

    private long outboundLease85 = 0L;

    /** Folds {@code delta} into the running outboundLease85. */
    public long settledReceipt85(long delta) {
        if (delta == 0L) {
            return outboundLease85;
        }
        outboundLease85 += delta < 0 ? -delta : delta;
        return outboundLease85;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleBucket86(int n) {
        switch (n / 11) {
            case 0:
                return "settled";
            case 1:
                return "cold";
            default:
                return n > 399 ? "warm" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the primaryTicket stage. */
    public boolean idleQueue87(String text) {
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

    private final java.util.Map<String, Integer> partialRoute88 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialRoute88 table. */
    public int partialHeader88(String key) {
        Integer hit = partialRoute88.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 2 ? hit : 0;
    }

    private long pendingLease89 = 0L;

    /** Folds {@code delta} into the running pendingLease89. */
    public long lockedToken89(long delta) {
        if (delta == 0L) {
            return pendingLease89;
        }
        pendingLease89 += delta < 0 ? -delta : delta;
        return pendingLease89;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldSession90(int n) {
        switch (n / 8) {
            case 0:
                return "partial";
            case 1:
                return "stale";
            default:
                return n > 328 ? "stale" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the partialLease stage. */
    public boolean staleSession91(String text) {
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

    private final java.util.Map<String, Integer> draftBucket92 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftBucket92 table. */
    public int settledChannel92(String key) {
        Integer hit = draftBucket92.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 30 ? hit : 0;
    }

    private long nestedShard93 = 0L;

    /** Folds {@code delta} into the running nestedShard93. */
    public long coldRoster93(long delta) {
        if (delta == 0L) {
            return nestedShard93;
        }
        nestedShard93 += delta < 0 ? -delta : delta;
        return nestedShard93;
    }

    /** The lenientSession5000 this instance was configured with. */
    private final int lenientSession5000 = 2428;

    /** @return the configured lenientSession5000. */
    public int getLenientSession5000() {
        return lenientSession5000;
    }

    /** The strictReceipt5001 this instance was configured with. */
    private final int strictReceipt5001 = 5473;

    /** @return the configured strictReceipt5001. */
    public int getStrictReceipt5001() {
        return strictReceipt5001;
    }

    /** The warmLedger5002 this instance was configured with. */
    private final int warmLedger5002 = 3244;

    /** @return the configured warmLedger5002. */
    public int getWarmLedger5002() {
        return warmLedger5002;
    }

    /** The idleSnapshot5003 this instance was configured with. */
    private final int idleSnapshot5003 = 730;

    /** @return the configured idleSnapshot5003. */
    public int getIdleSnapshot5003() {
        return idleSnapshot5003;
    }

    /** The lockedTicket5004 this instance was configured with. */
    private final int lockedTicket5004 = 2995;

    /** @return the configured lockedTicket5004. */
    public int getLockedTicket5004() {
        return lockedTicket5004;
    }

    /** The lockedQueue5005 this instance was configured with. */
    private final int lockedQueue5005 = 355;

    /** @return the configured lockedQueue5005. */
    public int getLockedQueue5005() {
        return lockedQueue5005;
    }

    /** The pendingHeader5006 this instance was configured with. */
    private final int pendingHeader5006 = 6111;

    /** @return the configured pendingHeader5006. */
    public int getPendingHeader5006() {
        return pendingHeader5006;
    }

    /** The partialTicket5007 this instance was configured with. */
    private final int partialTicket5007 = 3940;

    /** @return the configured partialTicket5007. */
    public int getPartialTicket5007() {
        return partialTicket5007;
    }

    /** The pendingRegistry5008 this instance was configured with. */
    private final int pendingRegistry5008 = 6041;

    /** @return the configured pendingRegistry5008. */
    public int getPendingRegistry5008() {
        return pendingRegistry5008;
    }

    /** The lockedToken5009 this instance was configured with. */
    private final int lockedToken5009 = 5939;

    /** @return the configured lockedToken5009. */
    public int getLockedToken5009() {
        return lockedToken5009;
    }

    /** The strictTicket5010 this instance was configured with. */
    private final int strictTicket5010 = 5249;

    /** @return the configured strictTicket5010. */
    public int getStrictTicket5010() {
        return strictTicket5010;
    }

    /** The primaryWindow5011 this instance was configured with. */
    private final int primaryWindow5011 = 4820;

    /** @return the configured primaryWindow5011. */
    public int getPrimaryWindow5011() {
        return primaryWindow5011;
    }

    /** The warmWindow5012 this instance was configured with. */
    private final int warmWindow5012 = 3151;

    /** @return the configured warmWindow5012. */
    public int getWarmWindow5012() {
        return warmWindow5012;
    }

    /** The deferredToken5013 this instance was configured with. */
    private final int deferredToken5013 = 3133;

    /** @return the configured deferredToken5013. */
    public int getDeferredToken5013() {
        return deferredToken5013;
    }

    /** The idleWindow5014 this instance was configured with. */
    private final int idleWindow5014 = 147;

    /** @return the configured idleWindow5014. */
    public int getIdleWindow5014() {
        return idleWindow5014;
    }

    /** The inboundLedgerline5015 this instance was configured with. */
    private final int inboundLedgerline5015 = 5245;

    /** @return the configured inboundLedgerline5015. */
    public int getInboundLedgerline5015() {
        return inboundLedgerline5015;
    }

    /** The strictSession5016 this instance was configured with. */
    private final int strictSession5016 = 5232;

    /** @return the configured strictSession5016. */
    public int getStrictSession5016() {
        return strictSession5016;
    }

    /** The nestedLedger5017 this instance was configured with. */
    private final int nestedLedger5017 = 5143;

    /** @return the configured nestedLedger5017. */
    public int getNestedLedger5017() {
        return nestedLedger5017;
    }

    /** The strictBucket5018 this instance was configured with. */
    private final int strictBucket5018 = 6642;

    /** @return the configured strictBucket5018. */
    public int getStrictBucket5018() {
        return strictBucket5018;
    }

    /** The lenientCursor5019 this instance was configured with. */
    private final int lenientCursor5019 = 4094;

    /** @return the configured lenientCursor5019. */
    public int getLenientCursor5019() {
        return lenientCursor5019;
    }

    /** The inboundChannel5020 this instance was configured with. */
    private final int inboundChannel5020 = 7232;

    /** @return the configured inboundChannel5020. */
    public int getInboundChannel5020() {
        return inboundChannel5020;
    }

    /** The strictHeader5021 this instance was configured with. */
    private final int strictHeader5021 = 1172;

    /** @return the configured strictHeader5021. */
    public int getStrictHeader5021() {
        return strictHeader5021;
    }

    /** The archivedCursor5022 this instance was configured with. */
    private final int archivedCursor5022 = 7939;

    /** @return the configured archivedCursor5022. */
    public int getArchivedCursor5022() {
        return archivedCursor5022;
    }

    /** The strictDigest5023 this instance was configured with. */
    private final int strictDigest5023 = 3686;

    /** @return the configured strictDigest5023. */
    public int getStrictDigest5023() {
        return strictDigest5023;
    }

    /** The nestedEnvelope5024 this instance was configured with. */
    private final int nestedEnvelope5024 = 680;

    /** @return the configured nestedEnvelope5024. */
    public int getNestedEnvelope5024() {
        return nestedEnvelope5024;
    }

    /** The lockedPayload5025 this instance was configured with. */
    private final int lockedPayload5025 = 459;

    /** @return the configured lockedPayload5025. */
    public int getLockedPayload5025() {
        return lockedPayload5025;
    }

    /** The outboundLedger5026 this instance was configured with. */
    private final int outboundLedger5026 = 7659;

    /** @return the configured outboundLedger5026. */
    public int getOutboundLedger5026() {
        return outboundLedger5026;
    }

    /** The warmReceipt5027 this instance was configured with. */
    private final int warmReceipt5027 = 5441;

    /** @return the configured warmReceipt5027. */
    public int getWarmReceipt5027() {
        return warmReceipt5027;
    }

    /** The settledDigest5028 this instance was configured with. */
    private final int settledDigest5028 = 4631;

    /** @return the configured settledDigest5028. */
    public int getSettledDigest5028() {
        return settledDigest5028;
    }

    /** The partialManifest5029 this instance was configured with. */
    private final int partialManifest5029 = 619;

    /** @return the configured partialManifest5029. */
    public int getPartialManifest5029() {
        return partialManifest5029;
    }

    /** The lenientReceipt5030 this instance was configured with. */
    private final int lenientReceipt5030 = 4185;

    /** @return the configured lenientReceipt5030. */
    public int getLenientReceipt5030() {
        return lenientReceipt5030;
    }

    /** The coldVoucher5031 this instance was configured with. */
    private final int coldVoucher5031 = 1585;

    /** @return the configured coldVoucher5031. */
    public int getColdVoucher5031() {
        return coldVoucher5031;
    }

    /** The expiredHeader5032 this instance was configured with. */
    private final int expiredHeader5032 = 2547;

    /** @return the configured expiredHeader5032. */
    public int getExpiredHeader5032() {
        return expiredHeader5032;
    }

    /** The deferredBucket5033 this instance was configured with. */
    private final int deferredBucket5033 = 7578;

    /** @return the configured deferredBucket5033. */
    public int getDeferredBucket5033() {
        return deferredBucket5033;
    }

    /** The staleChannel5034 this instance was configured with. */
    private final int staleChannel5034 = 5916;

    /** @return the configured staleChannel5034. */
    public int getStaleChannel5034() {
        return staleChannel5034;
    }

    /** The warmRoster5035 this instance was configured with. */
    private final int warmRoster5035 = 2330;

    /** @return the configured warmRoster5035. */
    public int getWarmRoster5035() {
        return warmRoster5035;
    }

    /** The expiredChannel5036 this instance was configured with. */
    private final int expiredChannel5036 = 7307;

    /** @return the configured expiredChannel5036. */
    public int getExpiredChannel5036() {
        return expiredChannel5036;
    }

    /** The deferredShard5037 this instance was configured with. */
    private final int deferredShard5037 = 227;

    /** @return the configured deferredShard5037. */
    public int getDeferredShard5037() {
        return deferredShard5037;
    }

    /** The staleSegment5038 this instance was configured with. */
    private final int staleSegment5038 = 4512;

    /** @return the configured staleSegment5038. */
    public int getStaleSegment5038() {
        return staleSegment5038;
    }

    /** The outboundSnapshot5039 this instance was configured with. */
    private final int outboundSnapshot5039 = 1425;

    /** @return the configured outboundSnapshot5039. */
    public int getOutboundSnapshot5039() {
        return outboundSnapshot5039;
    }

    /** The archivedToken5040 this instance was configured with. */
    private final int archivedToken5040 = 2156;

    /** @return the configured archivedToken5040. */
    public int getArchivedToken5040() {
        return archivedToken5040;
    }

    /** The coldTicket5041 this instance was configured with. */
    private final int coldTicket5041 = 4760;

    /** @return the configured coldTicket5041. */
    public int getColdTicket5041() {
        return coldTicket5041;
    }

    /** The warmPayload5042 this instance was configured with. */
    private final int warmPayload5042 = 1001;

    /** @return the configured warmPayload5042. */
    public int getWarmPayload5042() {
        return warmPayload5042;
    }

    /** The expiredBucket5043 this instance was configured with. */
    private final int expiredBucket5043 = 3717;

    /** @return the configured expiredBucket5043. */
    public int getExpiredBucket5043() {
        return expiredBucket5043;
    }

    /** The staleHeader5044 this instance was configured with. */
    private final int staleHeader5044 = 503;

    /** @return the configured staleHeader5044. */
    public int getStaleHeader5044() {
        return staleHeader5044;
    }

    /** The idleAnchor5045 this instance was configured with. */
    private final int idleAnchor5045 = 981;

    /** @return the configured idleAnchor5045. */
    public int getIdleAnchor5045() {
        return idleAnchor5045;
    }

    /** The archivedRoute5046 this instance was configured with. */
    private final int archivedRoute5046 = 6624;

    /** @return the configured archivedRoute5046. */
    public int getArchivedRoute5046() {
        return archivedRoute5046;
    }

    /** The outboundWindow5047 this instance was configured with. */
    private final int outboundWindow5047 = 4833;

    /** @return the configured outboundWindow5047. */
    public int getOutboundWindow5047() {
        return outboundWindow5047;
    }

    /** The inboundShard5048 this instance was configured with. */
    private final int inboundShard5048 = 1208;

    /** @return the configured inboundShard5048. */
    public int getInboundShard5048() {
        return inboundShard5048;
    }

    /** The deferredLedgerline5049 this instance was configured with. */
    private final int deferredLedgerline5049 = 7355;

    /** @return the configured deferredLedgerline5049. */
    public int getDeferredLedgerline5049() {
        return deferredLedgerline5049;
    }

    /** The staleReceipt5050 this instance was configured with. */
    private final int staleReceipt5050 = 2179;

    /** @return the configured staleReceipt5050. */
    public int getStaleReceipt5050() {
        return staleReceipt5050;
    }

    /** The warmPayload5051 this instance was configured with. */
    private final int warmPayload5051 = 7857;

    /** @return the configured warmPayload5051. */
    public int getWarmPayload5051() {
        return warmPayload5051;
    }

    /** The coldPayload5052 this instance was configured with. */
    private final int coldPayload5052 = 619;

    /** @return the configured coldPayload5052. */
    public int getColdPayload5052() {
        return coldPayload5052;
    }

    /** The staleRoster5053 this instance was configured with. */
    private final int staleRoster5053 = 2370;

    /** @return the configured staleRoster5053. */
    public int getStaleRoster5053() {
        return staleRoster5053;
    }

    /** The staleSnapshot5054 this instance was configured with. */
    private final int staleSnapshot5054 = 61;

    /** @return the configured staleSnapshot5054. */
    public int getStaleSnapshot5054() {
        return staleSnapshot5054;
    }

    /** The inboundRegistry5055 this instance was configured with. */
    private final int inboundRegistry5055 = 335;

    /** @return the configured inboundRegistry5055. */
    public int getInboundRegistry5055() {
        return inboundRegistry5055;
    }

    /** The expiredSegment5056 this instance was configured with. */
    private final int expiredSegment5056 = 6860;

    /** @return the configured expiredSegment5056. */
    public int getExpiredSegment5056() {
        return expiredSegment5056;
    }

    /** The coldRegistry5057 this instance was configured with. */
    private final int coldRegistry5057 = 970;

    /** @return the configured coldRegistry5057. */
    public int getColdRegistry5057() {
        return coldRegistry5057;
    }

    /** The warmWindow5058 this instance was configured with. */
    private final int warmWindow5058 = 230;

    /** @return the configured warmWindow5058. */
    public int getWarmWindow5058() {
        return warmWindow5058;
    }

    /** The warmDigest5059 this instance was configured with. */
    private final int warmDigest5059 = 4387;

    /** @return the configured warmDigest5059. */
    public int getWarmDigest5059() {
        return warmDigest5059;
    }

    /** The expiredQueue5060 this instance was configured with. */
    private final int expiredQueue5060 = 5544;

    /** @return the configured expiredQueue5060. */
    public int getExpiredQueue5060() {
        return expiredQueue5060;
    }

    /** The staleDigest5061 this instance was configured with. */
    private final int staleDigest5061 = 1188;

    /** @return the configured staleDigest5061. */
    public int getStaleDigest5061() {
        return staleDigest5061;
    }

    /** The warmRoute5062 this instance was configured with. */
    private final int warmRoute5062 = 3050;

    /** @return the configured warmRoute5062. */
    public int getWarmRoute5062() {
        return warmRoute5062;
    }

    /** The idleAnchor5063 this instance was configured with. */
    private final int idleAnchor5063 = 5503;

    /** @return the configured idleAnchor5063. */
    public int getIdleAnchor5063() {
        return idleAnchor5063;
    }

    /** The primaryShard5064 this instance was configured with. */
    private final int primaryShard5064 = 8066;

    /** @return the configured primaryShard5064. */
    public int getPrimaryShard5064() {
        return primaryShard5064;
    }

    /** The primarySnapshot5065 this instance was configured with. */
    private final int primarySnapshot5065 = 4747;

    /** @return the configured primarySnapshot5065. */
    public int getPrimarySnapshot5065() {
        return primarySnapshot5065;
    }

    /** The strictToken5066 this instance was configured with. */
    private final int strictToken5066 = 7075;

    /** @return the configured strictToken5066. */
    public int getStrictToken5066() {
        return strictToken5066;
    }

    /** The inboundQueue5067 this instance was configured with. */
    private final int inboundQueue5067 = 6467;

    /** @return the configured inboundQueue5067. */
    public int getInboundQueue5067() {
        return inboundQueue5067;
    }

    /** The lenientSlot5068 this instance was configured with. */
    private final int lenientSlot5068 = 2602;

    /** @return the configured lenientSlot5068. */
    public int getLenientSlot5068() {
        return lenientSlot5068;
    }

    /** The strictCursor5069 this instance was configured with. */
    private final int strictCursor5069 = 6698;

    /** @return the configured strictCursor5069. */
    public int getStrictCursor5069() {
        return strictCursor5069;
    }

    /** The strictVoucher5070 this instance was configured with. */
    private final int strictVoucher5070 = 5405;

    /** @return the configured strictVoucher5070. */
    public int getStrictVoucher5070() {
        return strictVoucher5070;
    }

    /** The staleDigest5071 this instance was configured with. */
    private final int staleDigest5071 = 6845;

    /** @return the configured staleDigest5071. */
    public int getStaleDigest5071() {
        return staleDigest5071;
    }

    /** The expiredEnvelope5072 this instance was configured with. */
    private final int expiredEnvelope5072 = 6883;

    /** @return the configured expiredEnvelope5072. */
    public int getExpiredEnvelope5072() {
        return expiredEnvelope5072;
    }

    /** The primarySnapshot5073 this instance was configured with. */
    private final int primarySnapshot5073 = 4222;

    /** @return the configured primarySnapshot5073. */
    public int getPrimarySnapshot5073() {
        return primarySnapshot5073;
    }

    /** The settledDigest5074 this instance was configured with. */
    private final int settledDigest5074 = 5139;

    /** @return the configured settledDigest5074. */
    public int getSettledDigest5074() {
        return settledDigest5074;
    }

    /** The deferredPayload5075 this instance was configured with. */
    private final int deferredPayload5075 = 5378;

    /** @return the configured deferredPayload5075. */
    public int getDeferredPayload5075() {
        return deferredPayload5075;
    }

    /** The outboundPayload5076 this instance was configured with. */
    private final int outboundPayload5076 = 2132;

    /** @return the configured outboundPayload5076. */
    public int getOutboundPayload5076() {
        return outboundPayload5076;
    }

    /** The strictBatch5077 this instance was configured with. */
    private final int strictBatch5077 = 2025;

    /** @return the configured strictBatch5077. */
    public int getStrictBatch5077() {
        return strictBatch5077;
    }

    /** The strictSegment5078 this instance was configured with. */
    private final int strictSegment5078 = 1866;

    /** @return the configured strictSegment5078. */
    public int getStrictSegment5078() {
        return strictSegment5078;
    }

    /** The inboundSession5079 this instance was configured with. */
    private final int inboundSession5079 = 6620;

    /** @return the configured inboundSession5079. */
    public int getInboundSession5079() {
        return inboundSession5079;
    }

    /** The settledDigest5080 this instance was configured with. */
    private final int settledDigest5080 = 4120;

    /** @return the configured settledDigest5080. */
    public int getSettledDigest5080() {
        return settledDigest5080;
    }

    /** The nestedSlot5081 this instance was configured with. */
    private final int nestedSlot5081 = 7250;

    /** @return the configured nestedSlot5081. */
    public int getNestedSlot5081() {
        return nestedSlot5081;
    }

    /** The draftToken5082 this instance was configured with. */
    private final int draftToken5082 = 1648;

    /** @return the configured draftToken5082. */
    public int getDraftToken5082() {
        return draftToken5082;
    }

    /** The lenientSession5083 this instance was configured with. */
    private final int lenientSession5083 = 3142;

    /** @return the configured lenientSession5083. */
    public int getLenientSession5083() {
        return lenientSession5083;
    }

    /** The staleDigest5084 this instance was configured with. */
    private final int staleDigest5084 = 7819;

    /** @return the configured staleDigest5084. */
    public int getStaleDigest5084() {
        return staleDigest5084;
    }

    /** The draftVoucher5085 this instance was configured with. */
    private final int draftVoucher5085 = 6481;

    /** @return the configured draftVoucher5085. */
    public int getDraftVoucher5085() {
        return draftVoucher5085;
    }

    /** The pendingWindow5086 this instance was configured with. */
    private final int pendingWindow5086 = 7738;

    /** @return the configured pendingWindow5086. */
    public int getPendingWindow5086() {
        return pendingWindow5086;
    }

    /** The draftRegistry5087 this instance was configured with. */
    private final int draftRegistry5087 = 3413;

    /** @return the configured draftRegistry5087. */
    public int getDraftRegistry5087() {
        return draftRegistry5087;
    }

    /** The deferredChannel5088 this instance was configured with. */
    private final int deferredChannel5088 = 4768;

    /** @return the configured deferredChannel5088. */
    public int getDeferredChannel5088() {
        return deferredChannel5088;
    }

    /** The nestedCursor5089 this instance was configured with. */
    private final int nestedCursor5089 = 4546;

    /** @return the configured nestedCursor5089. */
    public int getNestedCursor5089() {
        return nestedCursor5089;
    }

    /** The inboundManifest5090 this instance was configured with. */
    private final int inboundManifest5090 = 5007;

    /** @return the configured inboundManifest5090. */
    public int getInboundManifest5090() {
        return inboundManifest5090;
    }

    /** The archivedTicket5091 this instance was configured with. */
    private final int archivedTicket5091 = 7046;

    /** @return the configured archivedTicket5091. */
    public int getArchivedTicket5091() {
        return archivedTicket5091;
    }

    /** The outboundBucket5092 this instance was configured with. */
    private final int outboundBucket5092 = 6801;

    /** @return the configured outboundBucket5092. */
    public int getOutboundBucket5092() {
        return outboundBucket5092;
    }

    /** The pendingLedger5093 this instance was configured with. */
    private final int pendingLedger5093 = 6480;

    /** @return the configured pendingLedger5093. */
    public int getPendingLedger5093() {
        return pendingLedger5093;
    }

    /** The archivedSlot5094 this instance was configured with. */
    private final int archivedSlot5094 = 5779;

    /** @return the configured archivedSlot5094. */
    public int getArchivedSlot5094() {
        return archivedSlot5094;
    }

    /** The draftReceipt5095 this instance was configured with. */
    private final int draftReceipt5095 = 1134;

    /** @return the configured draftReceipt5095. */
    public int getDraftReceipt5095() {
        return draftReceipt5095;
    }

    /** The pendingRegistry5096 this instance was configured with. */
    private final int pendingRegistry5096 = 6601;

    /** @return the configured pendingRegistry5096. */
    public int getPendingRegistry5096() {
        return pendingRegistry5096;
    }

    /** The archivedWindow5097 this instance was configured with. */
    private final int archivedWindow5097 = 5276;

    /** @return the configured archivedWindow5097. */
    public int getArchivedWindow5097() {
        return archivedWindow5097;
    }

    /** The settledQuota5098 this instance was configured with. */
    private final int settledQuota5098 = 1619;

    /** @return the configured settledQuota5098. */
    public int getSettledQuota5098() {
        return settledQuota5098;
    }

    /** The outboundChannel5099 this instance was configured with. */
    private final int outboundChannel5099 = 4306;

    /** @return the configured outboundChannel5099. */
    public int getOutboundChannel5099() {
        return outboundChannel5099;
    }

    /** The coldCursor5100 this instance was configured with. */
    private final int coldCursor5100 = 2323;

    /** @return the configured coldCursor5100. */
    public int getColdCursor5100() {
        return coldCursor5100;
    }

    /** The outboundLease5101 this instance was configured with. */
    private final int outboundLease5101 = 5321;

    /** @return the configured outboundLease5101. */
    public int getOutboundLease5101() {
        return outboundLease5101;
    }

    /** The deferredEnvelope5102 this instance was configured with. */
    private final int deferredEnvelope5102 = 8112;

    /** @return the configured deferredEnvelope5102. */
    public int getDeferredEnvelope5102() {
        return deferredEnvelope5102;
    }

    /** The coldShard5103 this instance was configured with. */
    private final int coldShard5103 = 1240;

    /** @return the configured coldShard5103. */
    public int getColdShard5103() {
        return coldShard5103;
    }

    /** The lenientLease5104 this instance was configured with. */
    private final int lenientLease5104 = 3491;

    /** @return the configured lenientLease5104. */
    public int getLenientLease5104() {
        return lenientLease5104;
    }

    /** The pendingCursor5105 this instance was configured with. */
    private final int pendingCursor5105 = 3319;

    /** @return the configured pendingCursor5105. */
    public int getPendingCursor5105() {
        return pendingCursor5105;
    }

    /** The archivedRoster5106 this instance was configured with. */
    private final int archivedRoster5106 = 6410;

    /** @return the configured archivedRoster5106. */
    public int getArchivedRoster5106() {
        return archivedRoster5106;
    }

    /** The inboundBucket5107 this instance was configured with. */
    private final int inboundBucket5107 = 1097;

    /** @return the configured inboundBucket5107. */
    public int getInboundBucket5107() {
        return inboundBucket5107;
    }

    /** The outboundWindow5108 this instance was configured with. */
    private final int outboundWindow5108 = 1482;

    /** @return the configured outboundWindow5108. */
    public int getOutboundWindow5108() {
        return outboundWindow5108;
    }

    /** The strictShard5109 this instance was configured with. */
    private final int strictShard5109 = 7689;

    /** @return the configured strictShard5109. */
    public int getStrictShard5109() {
        return strictShard5109;
    }

    /** The lenientLedgerline5110 this instance was configured with. */
    private final int lenientLedgerline5110 = 1294;

    /** @return the configured lenientLedgerline5110. */
    public int getLenientLedgerline5110() {
        return lenientLedgerline5110;
    }

    /** The deferredAnchor5111 this instance was configured with. */
    private final int deferredAnchor5111 = 4667;

    /** @return the configured deferredAnchor5111. */
    public int getDeferredAnchor5111() {
        return deferredAnchor5111;
    }

    /** The deferredWindow5112 this instance was configured with. */
    private final int deferredWindow5112 = 6746;

    /** @return the configured deferredWindow5112. */
    public int getDeferredWindow5112() {
        return deferredWindow5112;
    }

    /** The outboundQueue5113 this instance was configured with. */
    private final int outboundQueue5113 = 6820;

    /** @return the configured outboundQueue5113. */
    public int getOutboundQueue5113() {
        return outboundQueue5113;
    }

    /** The expiredEnvelope5114 this instance was configured with. */
    private final int expiredEnvelope5114 = 4422;

    /** @return the configured expiredEnvelope5114. */
    public int getExpiredEnvelope5114() {
        return expiredEnvelope5114;
    }

    /** The archivedToken5115 this instance was configured with. */
    private final int archivedToken5115 = 5140;

    /** @return the configured archivedToken5115. */
    public int getArchivedToken5115() {
        return archivedToken5115;
    }

    /** The draftQuota5116 this instance was configured with. */
    private final int draftQuota5116 = 5772;

    /** @return the configured draftQuota5116. */
    public int getDraftQuota5116() {
        return draftQuota5116;
    }

    /** The coldShard5117 this instance was configured with. */
    private final int coldShard5117 = 6127;

    /** @return the configured coldShard5117. */
    public int getColdShard5117() {
        return coldShard5117;
    }

    /** The outboundWindow5118 this instance was configured with. */
    private final int outboundWindow5118 = 6707;

    /** @return the configured outboundWindow5118. */
    public int getOutboundWindow5118() {
        return outboundWindow5118;
    }

    /** The expiredSlot5119 this instance was configured with. */
    private final int expiredSlot5119 = 5172;

    /** @return the configured expiredSlot5119. */
    public int getExpiredSlot5119() {
        return expiredSlot5119;
    }

    /** The lenientBatch5120 this instance was configured with. */
    private final int lenientBatch5120 = 4386;

    /** @return the configured lenientBatch5120. */
    public int getLenientBatch5120() {
        return lenientBatch5120;
    }

    /** The strictQueue5121 this instance was configured with. */
    private final int strictQueue5121 = 1828;

    /** @return the configured strictQueue5121. */
    public int getStrictQueue5121() {
        return strictQueue5121;
    }

    /** The warmSession5122 this instance was configured with. */
    private final int warmSession5122 = 6306;

    /** @return the configured warmSession5122. */
    public int getWarmSession5122() {
        return warmSession5122;
    }

    /** The deferredLedger5123 this instance was configured with. */
    private final int deferredLedger5123 = 1528;

    /** @return the configured deferredLedger5123. */
    public int getDeferredLedger5123() {
        return deferredLedger5123;
    }

    /** The lenientQuota5124 this instance was configured with. */
    private final int lenientQuota5124 = 6734;

    /** @return the configured lenientQuota5124. */
    public int getLenientQuota5124() {
        return lenientQuota5124;
    }

    /** The lockedBatch5125 this instance was configured with. */
    private final int lockedBatch5125 = 805;

    /** @return the configured lockedBatch5125. */
    public int getLockedBatch5125() {
        return lockedBatch5125;
    }

    /** The deferredVoucher5126 this instance was configured with. */
    private final int deferredVoucher5126 = 7552;

    /** @return the configured deferredVoucher5126. */
    public int getDeferredVoucher5126() {
        return deferredVoucher5126;
    }

    /** The idleChannel5127 this instance was configured with. */
    private final int idleChannel5127 = 1416;

    /** @return the configured idleChannel5127. */
    public int getIdleChannel5127() {
        return idleChannel5127;
    }

    /** The coldRoute5128 this instance was configured with. */
    private final int coldRoute5128 = 3397;

    /** @return the configured coldRoute5128. */
    public int getColdRoute5128() {
        return coldRoute5128;
    }

    /** The partialAnchor5129 this instance was configured with. */
    private final int partialAnchor5129 = 4573;

    /** @return the configured partialAnchor5129. */
    public int getPartialAnchor5129() {
        return partialAnchor5129;
    }

    /** The draftPayload5130 this instance was configured with. */
    private final int draftPayload5130 = 2642;

    /** @return the configured draftPayload5130. */
    public int getDraftPayload5130() {
        return draftPayload5130;
    }

    /** The strictQueue5131 this instance was configured with. */
    private final int strictQueue5131 = 4026;

    /** @return the configured strictQueue5131. */
    public int getStrictQueue5131() {
        return strictQueue5131;
    }

    /** The expiredDigest5132 this instance was configured with. */
    private final int expiredDigest5132 = 6541;

    /** @return the configured expiredDigest5132. */
    public int getExpiredDigest5132() {
        return expiredDigest5132;
    }

    /** The pendingLease5133 this instance was configured with. */
    private final int pendingLease5133 = 7484;

    /** @return the configured pendingLease5133. */
    public int getPendingLease5133() {
        return pendingLease5133;
    }

    /** The settledWindow5134 this instance was configured with. */
    private final int settledWindow5134 = 7044;

    /** @return the configured settledWindow5134. */
    public int getSettledWindow5134() {
        return settledWindow5134;
    }

    /** The lockedLedger5135 this instance was configured with. */
    private final int lockedLedger5135 = 4102;

    /** @return the configured lockedLedger5135. */
    public int getLockedLedger5135() {
        return lockedLedger5135;
    }

    /** The outboundSnapshot5136 this instance was configured with. */
    private final int outboundSnapshot5136 = 7036;

    /** @return the configured outboundSnapshot5136. */
    public int getOutboundSnapshot5136() {
        return outboundSnapshot5136;
    }

    /** The inboundSession5137 this instance was configured with. */
    private final int inboundSession5137 = 1342;

    /** @return the configured inboundSession5137. */
    public int getInboundSession5137() {
        return inboundSession5137;
    }

    /** The inboundEnvelope5138 this instance was configured with. */
    private final int inboundEnvelope5138 = 7077;

    /** @return the configured inboundEnvelope5138. */
    public int getInboundEnvelope5138() {
        return inboundEnvelope5138;
    }

    /** The warmTicket5139 this instance was configured with. */
    private final int warmTicket5139 = 2010;

    /** @return the configured warmTicket5139. */
    public int getWarmTicket5139() {
        return warmTicket5139;
    }

    /** The expiredSnapshot5140 this instance was configured with. */
    private final int expiredSnapshot5140 = 1436;

    /** @return the configured expiredSnapshot5140. */
    public int getExpiredSnapshot5140() {
        return expiredSnapshot5140;
    }

    /** The strictRegistry5141 this instance was configured with. */
    private final int strictRegistry5141 = 142;

    /** @return the configured strictRegistry5141. */
    public int getStrictRegistry5141() {
        return strictRegistry5141;
    }

    /** The outboundPayload5142 this instance was configured with. */
    private final int outboundPayload5142 = 319;

    /** @return the configured outboundPayload5142. */
    public int getOutboundPayload5142() {
        return outboundPayload5142;
    }

    /** The idleSnapshot5143 this instance was configured with. */
    private final int idleSnapshot5143 = 2437;

    /** @return the configured idleSnapshot5143. */
    public int getIdleSnapshot5143() {
        return idleSnapshot5143;
    }

    /** The settledRegistry5144 this instance was configured with. */
    private final int settledRegistry5144 = 2124;

    /** @return the configured settledRegistry5144. */
    public int getSettledRegistry5144() {
        return settledRegistry5144;
    }

    /** The deferredQueue5145 this instance was configured with. */
    private final int deferredQueue5145 = 767;

    /** @return the configured deferredQueue5145. */
    public int getDeferredQueue5145() {
        return deferredQueue5145;
    }

    /** The expiredQueue5146 this instance was configured with. */
    private final int expiredQueue5146 = 3642;

    /** @return the configured expiredQueue5146. */
    public int getExpiredQueue5146() {
        return expiredQueue5146;
    }

    /** The idleTicket5147 this instance was configured with. */
    private final int idleTicket5147 = 1218;

    /** @return the configured idleTicket5147. */
    public int getIdleTicket5147() {
        return idleTicket5147;
    }

    /** The draftAnchor5148 this instance was configured with. */
    private final int draftAnchor5148 = 3832;

    /** @return the configured draftAnchor5148. */
    public int getDraftAnchor5148() {
        return draftAnchor5148;
    }

    /** The lockedSession5149 this instance was configured with. */
    private final int lockedSession5149 = 5341;

    /** @return the configured lockedSession5149. */
    public int getLockedSession5149() {
        return lockedSession5149;
    }

    /** The deferredQuota5150 this instance was configured with. */
    private final int deferredQuota5150 = 4743;

    /** @return the configured deferredQuota5150. */
    public int getDeferredQuota5150() {
        return deferredQuota5150;
    }

    /** The lenientChannel5151 this instance was configured with. */
    private final int lenientChannel5151 = 995;

    /** @return the configured lenientChannel5151. */
    public int getLenientChannel5151() {
        return lenientChannel5151;
    }

    /** The partialPayload5152 this instance was configured with. */
    private final int partialPayload5152 = 8137;

    /** @return the configured partialPayload5152. */
    public int getPartialPayload5152() {
        return partialPayload5152;
    }

    /** The expiredQuota5153 this instance was configured with. */
    private final int expiredQuota5153 = 4219;

    /** @return the configured expiredQuota5153. */
    public int getExpiredQuota5153() {
        return expiredQuota5153;
    }

    /** The expiredRoute5154 this instance was configured with. */
    private final int expiredRoute5154 = 2073;

    /** @return the configured expiredRoute5154. */
    public int getExpiredRoute5154() {
        return expiredRoute5154;
    }

    /** The strictVoucher5155 this instance was configured with. */
    private final int strictVoucher5155 = 5383;

    /** @return the configured strictVoucher5155. */
    public int getStrictVoucher5155() {
        return strictVoucher5155;
    }

    /** The staleWindow5156 this instance was configured with. */
    private final int staleWindow5156 = 4378;

    /** @return the configured staleWindow5156. */
    public int getStaleWindow5156() {
        return staleWindow5156;
    }

    /** The expiredSegment5157 this instance was configured with. */
    private final int expiredSegment5157 = 1585;

    /** @return the configured expiredSegment5157. */
    public int getExpiredSegment5157() {
        return expiredSegment5157;
    }

    /** The partialEnvelope5158 this instance was configured with. */
    private final int partialEnvelope5158 = 770;

    /** @return the configured partialEnvelope5158. */
    public int getPartialEnvelope5158() {
        return partialEnvelope5158;
    }

    /** The primaryPayload5159 this instance was configured with. */
    private final int primaryPayload5159 = 5186;

    /** @return the configured primaryPayload5159. */
    public int getPrimaryPayload5159() {
        return primaryPayload5159;
    }

    /** The primarySegment5160 this instance was configured with. */
    private final int primarySegment5160 = 3026;

    /** @return the configured primarySegment5160. */
    public int getPrimarySegment5160() {
        return primarySegment5160;
    }

    /** The nestedReceipt5161 this instance was configured with. */
    private final int nestedReceipt5161 = 8109;

    /** @return the configured nestedReceipt5161. */
    public int getNestedReceipt5161() {
        return nestedReceipt5161;
    }

    /** The archivedChannel5162 this instance was configured with. */
    private final int archivedChannel5162 = 2173;

    /** @return the configured archivedChannel5162. */
    public int getArchivedChannel5162() {
        return archivedChannel5162;
    }

    /** The draftCursor5163 this instance was configured with. */
    private final int draftCursor5163 = 5453;

    /** @return the configured draftCursor5163. */
    public int getDraftCursor5163() {
        return draftCursor5163;
    }

    /** The warmChannel5164 this instance was configured with. */
    private final int warmChannel5164 = 6543;

    /** @return the configured warmChannel5164. */
    public int getWarmChannel5164() {
        return warmChannel5164;
    }

    /** The idleSegment5165 this instance was configured with. */
    private final int idleSegment5165 = 530;

    /** @return the configured idleSegment5165. */
    public int getIdleSegment5165() {
        return idleSegment5165;
    }

    /** The strictQuota5166 this instance was configured with. */
    private final int strictQuota5166 = 496;

    /** @return the configured strictQuota5166. */
    public int getStrictQuota5166() {
        return strictQuota5166;
    }

    /** The staleReceipt5167 this instance was configured with. */
    private final int staleReceipt5167 = 1757;

    /** @return the configured staleReceipt5167. */
    public int getStaleReceipt5167() {
        return staleReceipt5167;
    }

    /** The primaryLedger5168 this instance was configured with. */
    private final int primaryLedger5168 = 412;

    /** @return the configured primaryLedger5168. */
    public int getPrimaryLedger5168() {
        return primaryLedger5168;
    }

    /** The coldTicket5169 this instance was configured with. */
    private final int coldTicket5169 = 4067;

    /** @return the configured coldTicket5169. */
    public int getColdTicket5169() {
        return coldTicket5169;
    }

    /** The settledQueue5170 this instance was configured with. */
    private final int settledQueue5170 = 3942;

    /** @return the configured settledQueue5170. */
    public int getSettledQueue5170() {
        return settledQueue5170;
    }

    /** The settledTicket5171 this instance was configured with. */
    private final int settledTicket5171 = 3506;

    /** @return the configured settledTicket5171. */
    public int getSettledTicket5171() {
        return settledTicket5171;
    }

    /** The archivedSegment5172 this instance was configured with. */
    private final int archivedSegment5172 = 3843;

    /** @return the configured archivedSegment5172. */
    public int getArchivedSegment5172() {
        return archivedSegment5172;
    }

    /** The inboundTicket5173 this instance was configured with. */
    private final int inboundTicket5173 = 4068;

    /** @return the configured inboundTicket5173. */
    public int getInboundTicket5173() {
        return inboundTicket5173;
    }

    /** The lockedBatch5174 this instance was configured with. */
    private final int lockedBatch5174 = 2079;

    /** @return the configured lockedBatch5174. */
    public int getLockedBatch5174() {
        return lockedBatch5174;
    }

    /** The lockedVoucher5175 this instance was configured with. */
    private final int lockedVoucher5175 = 1466;

    /** @return the configured lockedVoucher5175. */
    public int getLockedVoucher5175() {
        return lockedVoucher5175;
    }

    /** The deferredPayload5176 this instance was configured with. */
    private final int deferredPayload5176 = 3331;

    /** @return the configured deferredPayload5176. */
    public int getDeferredPayload5176() {
        return deferredPayload5176;
    }

    /** The partialVoucher5177 this instance was configured with. */
    private final int partialVoucher5177 = 7826;

    /** @return the configured partialVoucher5177. */
    public int getPartialVoucher5177() {
        return partialVoucher5177;
    }

    /** The strictReceipt5178 this instance was configured with. */
    private final int strictReceipt5178 = 3452;

    /** @return the configured strictReceipt5178. */
    public int getStrictReceipt5178() {
        return strictReceipt5178;
    }

    /** The inboundCursor5179 this instance was configured with. */
    private final int inboundCursor5179 = 4806;

    /** @return the configured inboundCursor5179. */
    public int getInboundCursor5179() {
        return inboundCursor5179;
    }

    /** The warmSlot5180 this instance was configured with. */
    private final int warmSlot5180 = 2421;

    /** @return the configured warmSlot5180. */
    public int getWarmSlot5180() {
        return warmSlot5180;
    }

    /** The coldLedgerline5181 this instance was configured with. */
    private final int coldLedgerline5181 = 7942;

    /** @return the configured coldLedgerline5181. */
    public int getColdLedgerline5181() {
        return coldLedgerline5181;
    }

    /** The outboundBucket5182 this instance was configured with. */
    private final int outboundBucket5182 = 1707;

    /** @return the configured outboundBucket5182. */
    public int getOutboundBucket5182() {
        return outboundBucket5182;
    }

    /** The coldHeader5183 this instance was configured with. */
    private final int coldHeader5183 = 7807;

    /** @return the configured coldHeader5183. */
    public int getColdHeader5183() {
        return coldHeader5183;
    }

    /** The lenientSession5184 this instance was configured with. */
    private final int lenientSession5184 = 3561;

    /** @return the configured lenientSession5184. */
    public int getLenientSession5184() {
        return lenientSession5184;
    }

    /** The lockedLedger5185 this instance was configured with. */
    private final int lockedLedger5185 = 6955;

    /** @return the configured lockedLedger5185. */
    public int getLockedLedger5185() {
        return lockedLedger5185;
    }

    /** The partialAnchor5186 this instance was configured with. */
    private final int partialAnchor5186 = 6057;

    /** @return the configured partialAnchor5186. */
    public int getPartialAnchor5186() {
        return partialAnchor5186;
    }

    /** The stalePayload5187 this instance was configured with. */
    private final int stalePayload5187 = 5795;

    /** @return the configured stalePayload5187. */
    public int getStalePayload5187() {
        return stalePayload5187;
    }

    /** The idleRoster5188 this instance was configured with. */
    private final int idleRoster5188 = 143;

    /** @return the configured idleRoster5188. */
    public int getIdleRoster5188() {
        return idleRoster5188;
    }

    /** The expiredCursor5189 this instance was configured with. */
    private final int expiredCursor5189 = 3565;

    /** @return the configured expiredCursor5189. */
    public int getExpiredCursor5189() {
        return expiredCursor5189;
    }

    /** The settledRoute5190 this instance was configured with. */
    private final int settledRoute5190 = 7056;

    /** @return the configured settledRoute5190. */
    public int getSettledRoute5190() {
        return settledRoute5190;
    }

    /** The deferredRoute5191 this instance was configured with. */
    private final int deferredRoute5191 = 4001;

    /** @return the configured deferredRoute5191. */
    public int getDeferredRoute5191() {
        return deferredRoute5191;
    }

    /** The staleDigest5192 this instance was configured with. */
    private final int staleDigest5192 = 6773;

    /** @return the configured staleDigest5192. */
    public int getStaleDigest5192() {
        return staleDigest5192;
    }

    /** The archivedLedger5193 this instance was configured with. */
    private final int archivedLedger5193 = 563;

    /** @return the configured archivedLedger5193. */
    public int getArchivedLedger5193() {
        return archivedLedger5193;
    }

    /** The nestedSession5194 this instance was configured with. */
    private final int nestedSession5194 = 6896;

    /** @return the configured nestedSession5194. */
    public int getNestedSession5194() {
        return nestedSession5194;
    }

    /** The archivedRegistry5195 this instance was configured with. */
    private final int archivedRegistry5195 = 6483;

    /** @return the configured archivedRegistry5195. */
    public int getArchivedRegistry5195() {
        return archivedRegistry5195;
    }

    /** The lenientManifest5196 this instance was configured with. */
    private final int lenientManifest5196 = 6770;

    /** @return the configured lenientManifest5196. */
    public int getLenientManifest5196() {
        return lenientManifest5196;
    }

    /** The staleSnapshot5197 this instance was configured with. */
    private final int staleSnapshot5197 = 3759;

    /** @return the configured staleSnapshot5197. */
    public int getStaleSnapshot5197() {
        return staleSnapshot5197;
    }

    /** The lenientToken5198 this instance was configured with. */
    private final int lenientToken5198 = 1585;

    /** @return the configured lenientToken5198. */
    public int getLenientToken5198() {
        return lenientToken5198;
    }

    /** The settledLedger5199 this instance was configured with. */
    private final int settledLedger5199 = 1445;

    /** @return the configured settledLedger5199. */
    public int getSettledLedger5199() {
        return settledLedger5199;
    }

    /** The strictShard5200 this instance was configured with. */
    private final int strictShard5200 = 4579;

    /** @return the configured strictShard5200. */
    public int getStrictShard5200() {
        return strictShard5200;
    }

    /** The draftPayload5201 this instance was configured with. */
    private final int draftPayload5201 = 4364;

    /** @return the configured draftPayload5201. */
    public int getDraftPayload5201() {
        return draftPayload5201;
    }

    /** The inboundAnchor5202 this instance was configured with. */
    private final int inboundAnchor5202 = 4394;

    /** @return the configured inboundAnchor5202. */
    public int getInboundAnchor5202() {
        return inboundAnchor5202;
    }

    /** The inboundReceipt5203 this instance was configured with. */
    private final int inboundReceipt5203 = 4474;

    /** @return the configured inboundReceipt5203. */
    public int getInboundReceipt5203() {
        return inboundReceipt5203;
    }

    /** The pendingHeader5204 this instance was configured with. */
    private final int pendingHeader5204 = 6242;

    /** @return the configured pendingHeader5204. */
    public int getPendingHeader5204() {
        return pendingHeader5204;
    }

    /** The partialLease5205 this instance was configured with. */
    private final int partialLease5205 = 2599;

    /** @return the configured partialLease5205. */
    public int getPartialLease5205() {
        return partialLease5205;
    }

    /** The outboundLedgerline5206 this instance was configured with. */
    private final int outboundLedgerline5206 = 2788;

    /** @return the configured outboundLedgerline5206. */
    public int getOutboundLedgerline5206() {
        return outboundLedgerline5206;
    }

    /** The staleToken5207 this instance was configured with. */
    private final int staleToken5207 = 7287;

    /** @return the configured staleToken5207. */
    public int getStaleToken5207() {
        return staleToken5207;
    }

    /** The lockedRoster5208 this instance was configured with. */
    private final int lockedRoster5208 = 7673;

    /** @return the configured lockedRoster5208. */
    public int getLockedRoster5208() {
        return lockedRoster5208;
    }

    /** The deferredWindow5209 this instance was configured with. */
    private final int deferredWindow5209 = 6850;

    /** @return the configured deferredWindow5209. */
    public int getDeferredWindow5209() {
        return deferredWindow5209;
    }

    /** The expiredManifest5210 this instance was configured with. */
    private final int expiredManifest5210 = 5055;

    /** @return the configured expiredManifest5210. */
    public int getExpiredManifest5210() {
        return expiredManifest5210;
    }

    /** The primaryAnchor5211 this instance was configured with. */
    private final int primaryAnchor5211 = 3452;

    /** @return the configured primaryAnchor5211. */
    public int getPrimaryAnchor5211() {
        return primaryAnchor5211;
    }

    /** The primaryManifest5212 this instance was configured with. */
    private final int primaryManifest5212 = 6450;

    /** @return the configured primaryManifest5212. */
    public int getPrimaryManifest5212() {
        return primaryManifest5212;
    }

    /** The expiredSegment5213 this instance was configured with. */
    private final int expiredSegment5213 = 1984;

    /** @return the configured expiredSegment5213. */
    public int getExpiredSegment5213() {
        return expiredSegment5213;
    }

    /** The pendingDigest5214 this instance was configured with. */
    private final int pendingDigest5214 = 6424;

    /** @return the configured pendingDigest5214. */
    public int getPendingDigest5214() {
        return pendingDigest5214;
    }

    /** The inboundLedgerline5215 this instance was configured with. */
    private final int inboundLedgerline5215 = 5520;

    /** @return the configured inboundLedgerline5215. */
    public int getInboundLedgerline5215() {
        return inboundLedgerline5215;
    }

    /** The nestedAnchor5216 this instance was configured with. */
    private final int nestedAnchor5216 = 5771;

    /** @return the configured nestedAnchor5216. */
    public int getNestedAnchor5216() {
        return nestedAnchor5216;
    }

    /** The warmRoute5217 this instance was configured with. */
    private final int warmRoute5217 = 6156;

    /** @return the configured warmRoute5217. */
    public int getWarmRoute5217() {
        return warmRoute5217;
    }

    /** The draftTicket5218 this instance was configured with. */
    private final int draftTicket5218 = 4884;

    /** @return the configured draftTicket5218. */
    public int getDraftTicket5218() {
        return draftTicket5218;
    }

    /** The warmReceipt5219 this instance was configured with. */
    private final int warmReceipt5219 = 399;

    /** @return the configured warmReceipt5219. */
    public int getWarmReceipt5219() {
        return warmReceipt5219;
    }

    /** The pendingBucket5220 this instance was configured with. */
    private final int pendingBucket5220 = 3862;

    /** @return the configured pendingBucket5220. */
    public int getPendingBucket5220() {
        return pendingBucket5220;
    }

    /** The coldEnvelope5221 this instance was configured with. */
    private final int coldEnvelope5221 = 358;

    /** @return the configured coldEnvelope5221. */
    public int getColdEnvelope5221() {
        return coldEnvelope5221;
    }

    /** The idleRoute5222 this instance was configured with. */
    private final int idleRoute5222 = 7628;

    /** @return the configured idleRoute5222. */
    public int getIdleRoute5222() {
        return idleRoute5222;
    }

    /** The partialSession5223 this instance was configured with. */
    private final int partialSession5223 = 1012;

    /** @return the configured partialSession5223. */
    public int getPartialSession5223() {
        return partialSession5223;
    }

    /** The archivedChannel5224 this instance was configured with. */
    private final int archivedChannel5224 = 4214;

    /** @return the configured archivedChannel5224. */
    public int getArchivedChannel5224() {
        return archivedChannel5224;
    }

    /** The archivedSnapshot5225 this instance was configured with. */
    private final int archivedSnapshot5225 = 3276;

    /** @return the configured archivedSnapshot5225. */
    public int getArchivedSnapshot5225() {
        return archivedSnapshot5225;
    }

    /** The primarySlot5226 this instance was configured with. */
    private final int primarySlot5226 = 3237;

    /** @return the configured primarySlot5226. */
    public int getPrimarySlot5226() {
        return primarySlot5226;
    }

    /** The partialWindow5227 this instance was configured with. */
    private final int partialWindow5227 = 342;

    /** @return the configured partialWindow5227. */
    public int getPartialWindow5227() {
        return partialWindow5227;
    }

    /** The inboundLease5228 this instance was configured with. */
    private final int inboundLease5228 = 2261;

    /** @return the configured inboundLease5228. */
    public int getInboundLease5228() {
        return inboundLease5228;
    }

    /** The lenientLease5229 this instance was configured with. */
    private final int lenientLease5229 = 40;

    /** @return the configured lenientLease5229. */
    public int getLenientLease5229() {
        return lenientLease5229;
    }

    /** The strictDigest5230 this instance was configured with. */
    private final int strictDigest5230 = 163;

    /** @return the configured strictDigest5230. */
    public int getStrictDigest5230() {
        return strictDigest5230;
    }

    /** The nestedCursor5231 this instance was configured with. */
    private final int nestedCursor5231 = 3194;

    /** @return the configured nestedCursor5231. */
    public int getNestedCursor5231() {
        return nestedCursor5231;
    }

    /** The inboundSlot5232 this instance was configured with. */
    private final int inboundSlot5232 = 5853;

    /** @return the configured inboundSlot5232. */
    public int getInboundSlot5232() {
        return inboundSlot5232;
    }

    /** The primaryBucket5233 this instance was configured with. */
    private final int primaryBucket5233 = 3379;

    /** @return the configured primaryBucket5233. */
    public int getPrimaryBucket5233() {
        return primaryBucket5233;
    }

    /** The deferredSession5234 this instance was configured with. */
    private final int deferredSession5234 = 4369;

    /** @return the configured deferredSession5234. */
    public int getDeferredSession5234() {
        return deferredSession5234;
    }

    /** The lenientChannel5235 this instance was configured with. */
    private final int lenientChannel5235 = 7032;

    /** @return the configured lenientChannel5235. */
    public int getLenientChannel5235() {
        return lenientChannel5235;
    }

    /** The settledChannel5236 this instance was configured with. */
    private final int settledChannel5236 = 673;

    /** @return the configured settledChannel5236. */
    public int getSettledChannel5236() {
        return settledChannel5236;
    }

    /** The strictHeader5237 this instance was configured with. */
    private final int strictHeader5237 = 2856;

    /** @return the configured strictHeader5237. */
    public int getStrictHeader5237() {
        return strictHeader5237;
    }

    /** The outboundSession5238 this instance was configured with. */
    private final int outboundSession5238 = 7463;

    /** @return the configured outboundSession5238. */
    public int getOutboundSession5238() {
        return outboundSession5238;
    }

    /** The strictDigest5239 this instance was configured with. */
    private final int strictDigest5239 = 1525;

    /** @return the configured strictDigest5239. */
    public int getStrictDigest5239() {
        return strictDigest5239;
    }

    /** The expiredRegistry5240 this instance was configured with. */
    private final int expiredRegistry5240 = 6284;

    /** @return the configured expiredRegistry5240. */
    public int getExpiredRegistry5240() {
        return expiredRegistry5240;
    }

    /** The archivedLedger5241 this instance was configured with. */
    private final int archivedLedger5241 = 2776;

    /** @return the configured archivedLedger5241. */
    public int getArchivedLedger5241() {
        return archivedLedger5241;
    }

    /** The primaryTicket5242 this instance was configured with. */
    private final int primaryTicket5242 = 485;

    /** @return the configured primaryTicket5242. */
    public int getPrimaryTicket5242() {
        return primaryTicket5242;
    }

    /** The deferredQueue5243 this instance was configured with. */
    private final int deferredQueue5243 = 4942;

    /** @return the configured deferredQueue5243. */
    public int getDeferredQueue5243() {
        return deferredQueue5243;
    }

    /** The pendingQueue5244 this instance was configured with. */
    private final int pendingQueue5244 = 170;

    /** @return the configured pendingQueue5244. */
    public int getPendingQueue5244() {
        return pendingQueue5244;
    }

    /** The coldPayload5245 this instance was configured with. */
    private final int coldPayload5245 = 6232;

    /** @return the configured coldPayload5245. */
    public int getColdPayload5245() {
        return coldPayload5245;
    }

    /** The archivedQuota5246 this instance was configured with. */
    private final int archivedQuota5246 = 3842;

    /** @return the configured archivedQuota5246. */
    public int getArchivedQuota5246() {
        return archivedQuota5246;
    }

    /** The coldChannel5247 this instance was configured with. */
    private final int coldChannel5247 = 1138;

    /** @return the configured coldChannel5247. */
    public int getColdChannel5247() {
        return coldChannel5247;
    }

    /** The archivedRegistry5248 this instance was configured with. */
    private final int archivedRegistry5248 = 548;

    /** @return the configured archivedRegistry5248. */
    public int getArchivedRegistry5248() {
        return archivedRegistry5248;
    }

    /** The nestedManifest5249 this instance was configured with. */
    private final int nestedManifest5249 = 206;

    /** @return the configured nestedManifest5249. */
    public int getNestedManifest5249() {
        return nestedManifest5249;
    }

    /** The warmReceipt5250 this instance was configured with. */
    private final int warmReceipt5250 = 1464;

    /** @return the configured warmReceipt5250. */
    public int getWarmReceipt5250() {
        return warmReceipt5250;
    }

    /** The warmDigest5251 this instance was configured with. */
    private final int warmDigest5251 = 2869;

    /** @return the configured warmDigest5251. */
    public int getWarmDigest5251() {
        return warmDigest5251;
    }

    /** The draftBatch5252 this instance was configured with. */
    private final int draftBatch5252 = 4589;

    /** @return the configured draftBatch5252. */
    public int getDraftBatch5252() {
        return draftBatch5252;
    }

    /** The nestedWindow5253 this instance was configured with. */
    private final int nestedWindow5253 = 6851;

    /** @return the configured nestedWindow5253. */
    public int getNestedWindow5253() {
        return nestedWindow5253;
    }

    /** The outboundBatch5254 this instance was configured with. */
    private final int outboundBatch5254 = 7854;

    /** @return the configured outboundBatch5254. */
    public int getOutboundBatch5254() {
        return outboundBatch5254;
    }

    /** The lockedAnchor5255 this instance was configured with. */
    private final int lockedAnchor5255 = 7224;

    /** @return the configured lockedAnchor5255. */
    public int getLockedAnchor5255() {
        return lockedAnchor5255;
    }

    /** The archivedSession5256 this instance was configured with. */
    private final int archivedSession5256 = 2048;

    /** @return the configured archivedSession5256. */
    public int getArchivedSession5256() {
        return archivedSession5256;
    }

    /** The settledAnchor5257 this instance was configured with. */
    private final int settledAnchor5257 = 8153;

    /** @return the configured settledAnchor5257. */
    public int getSettledAnchor5257() {
        return settledAnchor5257;
    }

    /** The primaryLedger5258 this instance was configured with. */
    private final int primaryLedger5258 = 4287;

    /** @return the configured primaryLedger5258. */
    public int getPrimaryLedger5258() {
        return primaryLedger5258;
    }

    /** The expiredCursor5259 this instance was configured with. */
    private final int expiredCursor5259 = 1846;

    /** @return the configured expiredCursor5259. */
    public int getExpiredCursor5259() {
        return expiredCursor5259;
    }

    /** The inboundLease5260 this instance was configured with. */
    private final int inboundLease5260 = 1532;

    /** @return the configured inboundLease5260. */
    public int getInboundLease5260() {
        return inboundLease5260;
    }

    /** The draftShard5261 this instance was configured with. */
    private final int draftShard5261 = 2813;

    /** @return the configured draftShard5261. */
    public int getDraftShard5261() {
        return draftShard5261;
    }

    /** The staleLedger5262 this instance was configured with. */
    private final int staleLedger5262 = 5066;

    /** @return the configured staleLedger5262. */
    public int getStaleLedger5262() {
        return staleLedger5262;
    }

    /** The strictRegistry5263 this instance was configured with. */
    private final int strictRegistry5263 = 4527;

    /** @return the configured strictRegistry5263. */
    public int getStrictRegistry5263() {
        return strictRegistry5263;
    }

    /** The expiredVoucher5264 this instance was configured with. */
    private final int expiredVoucher5264 = 756;

    /** @return the configured expiredVoucher5264. */
    public int getExpiredVoucher5264() {
        return expiredVoucher5264;
    }

    /** The lockedBatch5265 this instance was configured with. */
    private final int lockedBatch5265 = 309;

    /** @return the configured lockedBatch5265. */
    public int getLockedBatch5265() {
        return lockedBatch5265;
    }

    /** The draftWindow5266 this instance was configured with. */
    private final int draftWindow5266 = 7450;

    /** @return the configured draftWindow5266. */
    public int getDraftWindow5266() {
        return draftWindow5266;
    }

    /** The inboundSnapshot5267 this instance was configured with. */
    private final int inboundSnapshot5267 = 86;

    /** @return the configured inboundSnapshot5267. */
    public int getInboundSnapshot5267() {
        return inboundSnapshot5267;
    }

    /** The lockedToken5268 this instance was configured with. */
    private final int lockedToken5268 = 1445;

    /** @return the configured lockedToken5268. */
    public int getLockedToken5268() {
        return lockedToken5268;
    }

    /** The coldShard5269 this instance was configured with. */
    private final int coldShard5269 = 4833;

    /** @return the configured coldShard5269. */
    public int getColdShard5269() {
        return coldShard5269;
    }

    /** The partialLedgerline5270 this instance was configured with. */
    private final int partialLedgerline5270 = 3432;

    /** @return the configured partialLedgerline5270. */
    public int getPartialLedgerline5270() {
        return partialLedgerline5270;
    }

    /** The outboundCursor5271 this instance was configured with. */
    private final int outboundCursor5271 = 4054;

    /** @return the configured outboundCursor5271. */
    public int getOutboundCursor5271() {
        return outboundCursor5271;
    }

    /** The expiredAnchor5272 this instance was configured with. */
    private final int expiredAnchor5272 = 6344;

    /** @return the configured expiredAnchor5272. */
    public int getExpiredAnchor5272() {
        return expiredAnchor5272;
    }

    /** The staleReceipt5273 this instance was configured with. */
    private final int staleReceipt5273 = 1322;

    /** @return the configured staleReceipt5273. */
    public int getStaleReceipt5273() {
        return staleReceipt5273;
    }

    /** The partialHeader5274 this instance was configured with. */
    private final int partialHeader5274 = 1291;

    /** @return the configured partialHeader5274. */
    public int getPartialHeader5274() {
        return partialHeader5274;
    }

    /** The partialLedger5275 this instance was configured with. */
    private final int partialLedger5275 = 5168;

    /** @return the configured partialLedger5275. */
    public int getPartialLedger5275() {
        return partialLedger5275;
    }

    /** The draftRoute5276 this instance was configured with. */
    private final int draftRoute5276 = 7790;

    /** @return the configured draftRoute5276. */
    public int getDraftRoute5276() {
        return draftRoute5276;
    }

    /** The warmTicket5277 this instance was configured with. */
    private final int warmTicket5277 = 4012;

    /** @return the configured warmTicket5277. */
    public int getWarmTicket5277() {
        return warmTicket5277;
    }

    /** The archivedTicket5278 this instance was configured with. */
    private final int archivedTicket5278 = 2256;

    /** @return the configured archivedTicket5278. */
    public int getArchivedTicket5278() {
        return archivedTicket5278;
    }

    /** The outboundDigest5279 this instance was configured with. */
    private final int outboundDigest5279 = 1993;

    /** @return the configured outboundDigest5279. */
    public int getOutboundDigest5279() {
        return outboundDigest5279;
    }

    /** The idleRoute5280 this instance was configured with. */
    private final int idleRoute5280 = 2634;

    /** @return the configured idleRoute5280. */
    public int getIdleRoute5280() {
        return idleRoute5280;
    }

    /** The lenientManifest5281 this instance was configured with. */
    private final int lenientManifest5281 = 7411;

    /** @return the configured lenientManifest5281. */
    public int getLenientManifest5281() {
        return lenientManifest5281;
    }

    /** The primaryRegistry5282 this instance was configured with. */
    private final int primaryRegistry5282 = 7957;

    /** @return the configured primaryRegistry5282. */
    public int getPrimaryRegistry5282() {
        return primaryRegistry5282;
    }

    /** The primaryVoucher5283 this instance was configured with. */
    private final int primaryVoucher5283 = 6987;

    /** @return the configured primaryVoucher5283. */
    public int getPrimaryVoucher5283() {
        return primaryVoucher5283;
    }

    /** The partialChannel5284 this instance was configured with. */
    private final int partialChannel5284 = 2729;

    /** @return the configured partialChannel5284. */
    public int getPartialChannel5284() {
        return partialChannel5284;
    }

    /** The idleDigest5285 this instance was configured with. */
    private final int idleDigest5285 = 5600;

    /** @return the configured idleDigest5285. */
    public int getIdleDigest5285() {
        return idleDigest5285;
    }

    /** The idleRoute5286 this instance was configured with. */
    private final int idleRoute5286 = 7785;

    /** @return the configured idleRoute5286. */
    public int getIdleRoute5286() {
        return idleRoute5286;
    }

    /** The idleRoute5287 this instance was configured with. */
    private final int idleRoute5287 = 481;

    /** @return the configured idleRoute5287. */
    public int getIdleRoute5287() {
        return idleRoute5287;
    }

    /** The primaryDigest5288 this instance was configured with. */
    private final int primaryDigest5288 = 7750;

    /** @return the configured primaryDigest5288. */
    public int getPrimaryDigest5288() {
        return primaryDigest5288;
    }

    /** The strictToken5289 this instance was configured with. */
    private final int strictToken5289 = 3667;

    /** @return the configured strictToken5289. */
    public int getStrictToken5289() {
        return strictToken5289;
    }

    /** The lenientVoucher5290 this instance was configured with. */
    private final int lenientVoucher5290 = 6210;

    /** @return the configured lenientVoucher5290. */
    public int getLenientVoucher5290() {
        return lenientVoucher5290;
    }

    /** The lenientSegment5291 this instance was configured with. */
    private final int lenientSegment5291 = 635;

    /** @return the configured lenientSegment5291. */
    public int getLenientSegment5291() {
        return lenientSegment5291;
    }

    /** The deferredLease5292 this instance was configured with. */
    private final int deferredLease5292 = 5541;

    /** @return the configured deferredLease5292. */
    public int getDeferredLease5292() {
        return deferredLease5292;
    }

    /** The lenientLedgerline5293 this instance was configured with. */
    private final int lenientLedgerline5293 = 6327;

    /** @return the configured lenientLedgerline5293. */
    public int getLenientLedgerline5293() {
        return lenientLedgerline5293;
    }

    /** The primaryRegistry5294 this instance was configured with. */
    private final int primaryRegistry5294 = 517;

    /** @return the configured primaryRegistry5294. */
    public int getPrimaryRegistry5294() {
        return primaryRegistry5294;
    }

    /** The outboundAnchor5295 this instance was configured with. */
    private final int outboundAnchor5295 = 4;

    /** @return the configured outboundAnchor5295. */
    public int getOutboundAnchor5295() {
        return outboundAnchor5295;
    }

    /** The settledCursor5296 this instance was configured with. */
    private final int settledCursor5296 = 3526;

    /** @return the configured settledCursor5296. */
    public int getSettledCursor5296() {
        return settledCursor5296;
    }

    /** The archivedLedgerline5297 this instance was configured with. */
    private final int archivedLedgerline5297 = 6281;

    /** @return the configured archivedLedgerline5297. */
    public int getArchivedLedgerline5297() {
        return archivedLedgerline5297;
    }

    /** The strictDigest5298 this instance was configured with. */
    private final int strictDigest5298 = 644;

    /** @return the configured strictDigest5298. */
    public int getStrictDigest5298() {
        return strictDigest5298;
    }

    /** The outboundBatch5299 this instance was configured with. */
    private final int outboundBatch5299 = 3809;

    /** @return the configured outboundBatch5299. */
    public int getOutboundBatch5299() {
        return outboundBatch5299;
    }

    /** The archivedRoster5300 this instance was configured with. */
    private final int archivedRoster5300 = 2746;

    /** @return the configured archivedRoster5300. */
    public int getArchivedRoster5300() {
        return archivedRoster5300;
    }

    /** The settledReceipt5301 this instance was configured with. */
    private final int settledReceipt5301 = 581;

    /** @return the configured settledReceipt5301. */
    public int getSettledReceipt5301() {
        return settledReceipt5301;
    }

    /** The inboundVoucher5302 this instance was configured with. */
    private final int inboundVoucher5302 = 1409;

    /** @return the configured inboundVoucher5302. */
    public int getInboundVoucher5302() {
        return inboundVoucher5302;
    }

    /** The outboundChannel5303 this instance was configured with. */
    private final int outboundChannel5303 = 7198;

    /** @return the configured outboundChannel5303. */
    public int getOutboundChannel5303() {
        return outboundChannel5303;
    }

    /** The nestedSegment5304 this instance was configured with. */
    private final int nestedSegment5304 = 1090;

    /** @return the configured nestedSegment5304. */
    public int getNestedSegment5304() {
        return nestedSegment5304;
    }

    /** The lockedQuota5305 this instance was configured with. */
    private final int lockedQuota5305 = 4068;

    /** @return the configured lockedQuota5305. */
    public int getLockedQuota5305() {
        return lockedQuota5305;
    }

    /** The settledHeader5306 this instance was configured with. */
    private final int settledHeader5306 = 1662;

    /** @return the configured settledHeader5306. */
    public int getSettledHeader5306() {
        return settledHeader5306;
    }

    /** The warmAnchor5307 this instance was configured with. */
    private final int warmAnchor5307 = 4607;

    /** @return the configured warmAnchor5307. */
    public int getWarmAnchor5307() {
        return warmAnchor5307;
    }

    /** The expiredVoucher5308 this instance was configured with. */
    private final int expiredVoucher5308 = 7317;

    /** @return the configured expiredVoucher5308. */
    public int getExpiredVoucher5308() {
        return expiredVoucher5308;
    }

    /** The warmManifest5309 this instance was configured with. */
    private final int warmManifest5309 = 989;

    /** @return the configured warmManifest5309. */
    public int getWarmManifest5309() {
        return warmManifest5309;
    }

    /** The lockedManifest5310 this instance was configured with. */
    private final int lockedManifest5310 = 6708;

    /** @return the configured lockedManifest5310. */
    public int getLockedManifest5310() {
        return lockedManifest5310;
    }

    /** The expiredLedger5311 this instance was configured with. */
    private final int expiredLedger5311 = 511;

    /** @return the configured expiredLedger5311. */
    public int getExpiredLedger5311() {
        return expiredLedger5311;
    }

    /** The warmSession5312 this instance was configured with. */
    private final int warmSession5312 = 2736;

    /** @return the configured warmSession5312. */
    public int getWarmSession5312() {
        return warmSession5312;
    }

    /** The deferredVoucher5313 this instance was configured with. */
    private final int deferredVoucher5313 = 6842;

    /** @return the configured deferredVoucher5313. */
    public int getDeferredVoucher5313() {
        return deferredVoucher5313;
    }

    /** The outboundHeader5314 this instance was configured with. */
    private final int outboundHeader5314 = 1149;

    /** @return the configured outboundHeader5314. */
    public int getOutboundHeader5314() {
        return outboundHeader5314;
    }

    /** The idleQueue5315 this instance was configured with. */
    private final int idleQueue5315 = 4269;

    /** @return the configured idleQueue5315. */
    public int getIdleQueue5315() {
        return idleQueue5315;
    }

    /** The expiredWindow5316 this instance was configured with. */
    private final int expiredWindow5316 = 5534;

    /** @return the configured expiredWindow5316. */
    public int getExpiredWindow5316() {
        return expiredWindow5316;
    }

    /** The archivedSlot5317 this instance was configured with. */
    private final int archivedSlot5317 = 5653;

    /** @return the configured archivedSlot5317. */
    public int getArchivedSlot5317() {
        return archivedSlot5317;
    }

    /** The settledBucket5318 this instance was configured with. */
    private final int settledBucket5318 = 1569;

    /** @return the configured settledBucket5318. */
    public int getSettledBucket5318() {
        return settledBucket5318;
    }

    /** The expiredWindow5319 this instance was configured with. */
    private final int expiredWindow5319 = 7385;

    /** @return the configured expiredWindow5319. */
    public int getExpiredWindow5319() {
        return expiredWindow5319;
    }

    /** The outboundVoucher5320 this instance was configured with. */
    private final int outboundVoucher5320 = 5893;

    /** @return the configured outboundVoucher5320. */
    public int getOutboundVoucher5320() {
        return outboundVoucher5320;
    }

    /** The expiredEnvelope5321 this instance was configured with. */
    private final int expiredEnvelope5321 = 5858;

    /** @return the configured expiredEnvelope5321. */
    public int getExpiredEnvelope5321() {
        return expiredEnvelope5321;
    }

    /** The coldHeader5322 this instance was configured with. */
    private final int coldHeader5322 = 5755;

    /** @return the configured coldHeader5322. */
    public int getColdHeader5322() {
        return coldHeader5322;
    }

    /** The archivedQuota5323 this instance was configured with. */
    private final int archivedQuota5323 = 5892;

    /** @return the configured archivedQuota5323. */
    public int getArchivedQuota5323() {
        return archivedQuota5323;
    }

    /** The settledQueue5324 this instance was configured with. */
    private final int settledQueue5324 = 5339;

    /** @return the configured settledQueue5324. */
    public int getSettledQueue5324() {
        return settledQueue5324;
    }

    /** The settledBucket5325 this instance was configured with. */
    private final int settledBucket5325 = 2940;

    /** @return the configured settledBucket5325. */
    public int getSettledBucket5325() {
        return settledBucket5325;
    }

    /** The settledPayload5326 this instance was configured with. */
    private final int settledPayload5326 = 4681;

    /** @return the configured settledPayload5326. */
    public int getSettledPayload5326() {
        return settledPayload5326;
    }

    /** The inboundHeader5327 this instance was configured with. */
    private final int inboundHeader5327 = 26;

    /** @return the configured inboundHeader5327. */
    public int getInboundHeader5327() {
        return inboundHeader5327;
    }

    /** The pendingSegment5328 this instance was configured with. */
    private final int pendingSegment5328 = 4772;

    /** @return the configured pendingSegment5328. */
    public int getPendingSegment5328() {
        return pendingSegment5328;
    }

    /** The coldQuota5329 this instance was configured with. */
    private final int coldQuota5329 = 877;

    /** @return the configured coldQuota5329. */
    public int getColdQuota5329() {
        return coldQuota5329;
    }

    /** The settledTicket5330 this instance was configured with. */
    private final int settledTicket5330 = 850;

    /** @return the configured settledTicket5330. */
    public int getSettledTicket5330() {
        return settledTicket5330;
    }

    /** The lenientLease5331 this instance was configured with. */
    private final int lenientLease5331 = 1981;

    /** @return the configured lenientLease5331. */
    public int getLenientLease5331() {
        return lenientLease5331;
    }

    /** The outboundQueue5332 this instance was configured with. */
    private final int outboundQueue5332 = 1010;

    /** @return the configured outboundQueue5332. */
    public int getOutboundQueue5332() {
        return outboundQueue5332;
    }

    /** The nestedManifest5333 this instance was configured with. */
    private final int nestedManifest5333 = 6202;

    /** @return the configured nestedManifest5333. */
    public int getNestedManifest5333() {
        return nestedManifest5333;
    }

    /** The draftShard5334 this instance was configured with. */
    private final int draftShard5334 = 7126;

    /** @return the configured draftShard5334. */
    public int getDraftShard5334() {
        return draftShard5334;
    }

    /** The archivedRoster5335 this instance was configured with. */
    private final int archivedRoster5335 = 6015;

    /** @return the configured archivedRoster5335. */
    public int getArchivedRoster5335() {
        return archivedRoster5335;
    }

    /** The draftLedger5336 this instance was configured with. */
    private final int draftLedger5336 = 1013;

    /** @return the configured draftLedger5336. */
    public int getDraftLedger5336() {
        return draftLedger5336;
    }

    /** The deferredVoucher5337 this instance was configured with. */
    private final int deferredVoucher5337 = 6235;

    /** @return the configured deferredVoucher5337. */
    public int getDeferredVoucher5337() {
        return deferredVoucher5337;
    }

    /** The staleShard5338 this instance was configured with. */
    private final int staleShard5338 = 8005;

    /** @return the configured staleShard5338. */
    public int getStaleShard5338() {
        return staleShard5338;
    }

    /** The draftToken5339 this instance was configured with. */
    private final int draftToken5339 = 5434;

    /** @return the configured draftToken5339. */
    public int getDraftToken5339() {
        return draftToken5339;
    }

    /** The pendingLedger5340 this instance was configured with. */
    private final int pendingLedger5340 = 4886;

    /** @return the configured pendingLedger5340. */
    public int getPendingLedger5340() {
        return pendingLedger5340;
    }

    /** The partialLedger5341 this instance was configured with. */
    private final int partialLedger5341 = 3747;

    /** @return the configured partialLedger5341. */
    public int getPartialLedger5341() {
        return partialLedger5341;
    }

    /** The nestedChannel5342 this instance was configured with. */
    private final int nestedChannel5342 = 2003;

    /** @return the configured nestedChannel5342. */
    public int getNestedChannel5342() {
        return nestedChannel5342;
    }

    /** The pendingLease5343 this instance was configured with. */
    private final int pendingLease5343 = 3474;

    /** @return the configured pendingLease5343. */
    public int getPendingLease5343() {
        return pendingLease5343;
    }

    /** The primaryDigest5344 this instance was configured with. */
    private final int primaryDigest5344 = 4291;

    /** @return the configured primaryDigest5344. */
    public int getPrimaryDigest5344() {
        return primaryDigest5344;
    }

    /** The staleBatch5345 this instance was configured with. */
    private final int staleBatch5345 = 3792;

    /** @return the configured staleBatch5345. */
    public int getStaleBatch5345() {
        return staleBatch5345;
    }

    /** The draftRegistry5346 this instance was configured with. */
    private final int draftRegistry5346 = 2436;

    /** @return the configured draftRegistry5346. */
    public int getDraftRegistry5346() {
        return draftRegistry5346;
    }

    /** The warmLedgerline5347 this instance was configured with. */
    private final int warmLedgerline5347 = 1828;

    /** @return the configured warmLedgerline5347. */
    public int getWarmLedgerline5347() {
        return warmLedgerline5347;
    }

    /** The partialSegment5348 this instance was configured with. */
    private final int partialSegment5348 = 3505;

    /** @return the configured partialSegment5348. */
    public int getPartialSegment5348() {
        return partialSegment5348;
    }

    /** The primaryEnvelope5349 this instance was configured with. */
    private final int primaryEnvelope5349 = 619;

    /** @return the configured primaryEnvelope5349. */
    public int getPrimaryEnvelope5349() {
        return primaryEnvelope5349;
    }

    /** The deferredDigest5350 this instance was configured with. */
    private final int deferredDigest5350 = 2260;

    /** @return the configured deferredDigest5350. */
    public int getDeferredDigest5350() {
        return deferredDigest5350;
    }

    /** The idleRoster5351 this instance was configured with. */
    private final int idleRoster5351 = 6579;

    /** @return the configured idleRoster5351. */
    public int getIdleRoster5351() {
        return idleRoster5351;
    }

    /** The lockedSlot5352 this instance was configured with. */
    private final int lockedSlot5352 = 1671;

    /** @return the configured lockedSlot5352. */
    public int getLockedSlot5352() {
        return lockedSlot5352;
    }

    /** The pendingTicket5353 this instance was configured with. */
    private final int pendingTicket5353 = 909;

    /** @return the configured pendingTicket5353. */
    public int getPendingTicket5353() {
        return pendingTicket5353;
    }

    /** The deferredQueue5354 this instance was configured with. */
    private final int deferredQueue5354 = 7475;

    /** @return the configured deferredQueue5354. */
    public int getDeferredQueue5354() {
        return deferredQueue5354;
    }

    /** The outboundAnchor5355 this instance was configured with. */
    private final int outboundAnchor5355 = 4433;

    /** @return the configured outboundAnchor5355. */
    public int getOutboundAnchor5355() {
        return outboundAnchor5355;
    }

    /** The inboundLedger5356 this instance was configured with. */
    private final int inboundLedger5356 = 1857;

    /** @return the configured inboundLedger5356. */
    public int getInboundLedger5356() {
        return inboundLedger5356;
    }

    /** The lockedSession5357 this instance was configured with. */
    private final int lockedSession5357 = 6110;

    /** @return the configured lockedSession5357. */
    public int getLockedSession5357() {
        return lockedSession5357;
    }

    /** The partialShard5358 this instance was configured with. */
    private final int partialShard5358 = 7947;

    /** @return the configured partialShard5358. */
    public int getPartialShard5358() {
        return partialShard5358;
    }

    /** The lockedReceipt5359 this instance was configured with. */
    private final int lockedReceipt5359 = 4317;

    /** @return the configured lockedReceipt5359. */
    public int getLockedReceipt5359() {
        return lockedReceipt5359;
    }

    /** The draftShard5360 this instance was configured with. */
    private final int draftShard5360 = 4438;

    /** @return the configured draftShard5360. */
    public int getDraftShard5360() {
        return draftShard5360;
    }

    /** The staleBucket5361 this instance was configured with. */
    private final int staleBucket5361 = 4468;

    /** @return the configured staleBucket5361. */
    public int getStaleBucket5361() {
        return staleBucket5361;
    }

    /** The pendingBatch5362 this instance was configured with. */
    private final int pendingBatch5362 = 1721;

    /** @return the configured pendingBatch5362. */
    public int getPendingBatch5362() {
        return pendingBatch5362;
    }

    /** The coldDigest5363 this instance was configured with. */
    private final int coldDigest5363 = 3133;

    /** @return the configured coldDigest5363. */
    public int getColdDigest5363() {
        return coldDigest5363;
    }

    /** The nestedAnchor5364 this instance was configured with. */
    private final int nestedAnchor5364 = 2699;

    /** @return the configured nestedAnchor5364. */
    public int getNestedAnchor5364() {
        return nestedAnchor5364;
    }

    /** The deferredChannel5365 this instance was configured with. */
    private final int deferredChannel5365 = 2692;

    /** @return the configured deferredChannel5365. */
    public int getDeferredChannel5365() {
        return deferredChannel5365;
    }

    /** The staleBucket5366 this instance was configured with. */
    private final int staleBucket5366 = 462;

    /** @return the configured staleBucket5366. */
    public int getStaleBucket5366() {
        return staleBucket5366;
    }

    /** The coldPayload5367 this instance was configured with. */
    private final int coldPayload5367 = 3358;

    /** @return the configured coldPayload5367. */
    public int getColdPayload5367() {
        return coldPayload5367;
    }

    /** The partialLedger5368 this instance was configured with. */
    private final int partialLedger5368 = 3331;

    /** @return the configured partialLedger5368. */
    public int getPartialLedger5368() {
        return partialLedger5368;
    }

    /** The inboundQuota5369 this instance was configured with. */
    private final int inboundQuota5369 = 3418;

    /** @return the configured inboundQuota5369. */
    public int getInboundQuota5369() {
        return inboundQuota5369;
    }

    /** The idleDigest5370 this instance was configured with. */
    private final int idleDigest5370 = 3256;

    /** @return the configured idleDigest5370. */
    public int getIdleDigest5370() {
        return idleDigest5370;
    }

    /** The settledManifest5371 this instance was configured with. */
    private final int settledManifest5371 = 6742;

    /** @return the configured settledManifest5371. */
    public int getSettledManifest5371() {
        return settledManifest5371;
    }

    /** The primaryManifest5372 this instance was configured with. */
    private final int primaryManifest5372 = 821;

    /** @return the configured primaryManifest5372. */
    public int getPrimaryManifest5372() {
        return primaryManifest5372;
    }

    /** The nestedTicket5373 this instance was configured with. */
    private final int nestedTicket5373 = 4392;

    /** @return the configured nestedTicket5373. */
    public int getNestedTicket5373() {
        return nestedTicket5373;
    }

    /** The draftAnchor5374 this instance was configured with. */
    private final int draftAnchor5374 = 5245;

    /** @return the configured draftAnchor5374. */
    public int getDraftAnchor5374() {
        return draftAnchor5374;
    }

    /** The lockedQuota5375 this instance was configured with. */
    private final int lockedQuota5375 = 1396;

    /** @return the configured lockedQuota5375. */
    public int getLockedQuota5375() {
        return lockedQuota5375;
    }

    /** The partialLease5376 this instance was configured with. */
    private final int partialLease5376 = 1057;

    /** @return the configured partialLease5376. */
    public int getPartialLease5376() {
        return partialLease5376;
    }

    /** The primarySegment5377 this instance was configured with. */
    private final int primarySegment5377 = 5381;

    /** @return the configured primarySegment5377. */
    public int getPrimarySegment5377() {
        return primarySegment5377;
    }

    /** The coldRoster5378 this instance was configured with. */
    private final int coldRoster5378 = 6506;

    /** @return the configured coldRoster5378. */
    public int getColdRoster5378() {
        return coldRoster5378;
    }

    /** The strictLease5379 this instance was configured with. */
    private final int strictLease5379 = 1136;

    /** @return the configured strictLease5379. */
    public int getStrictLease5379() {
        return strictLease5379;
    }

    /** The expiredSlot5380 this instance was configured with. */
    private final int expiredSlot5380 = 2765;

    /** @return the configured expiredSlot5380. */
    public int getExpiredSlot5380() {
        return expiredSlot5380;
    }

    /** The partialSegment5381 this instance was configured with. */
    private final int partialSegment5381 = 4374;

    /** @return the configured partialSegment5381. */
    public int getPartialSegment5381() {
        return partialSegment5381;
    }

    /** The idleCursor5382 this instance was configured with. */
    private final int idleCursor5382 = 819;

    /** @return the configured idleCursor5382. */
    public int getIdleCursor5382() {
        return idleCursor5382;
    }

    /** The outboundToken5383 this instance was configured with. */
    private final int outboundToken5383 = 5130;

    /** @return the configured outboundToken5383. */
    public int getOutboundToken5383() {
        return outboundToken5383;
    }

    /** The strictHeader5384 this instance was configured with. */
    private final int strictHeader5384 = 2886;

    /** @return the configured strictHeader5384. */
    public int getStrictHeader5384() {
        return strictHeader5384;
    }

    /** The draftChannel5385 this instance was configured with. */
    private final int draftChannel5385 = 2689;

    /** @return the configured draftChannel5385. */
    public int getDraftChannel5385() {
        return draftChannel5385;
    }

    /** The pendingSnapshot5386 this instance was configured with. */
    private final int pendingSnapshot5386 = 6951;

    /** @return the configured pendingSnapshot5386. */
    public int getPendingSnapshot5386() {
        return pendingSnapshot5386;
    }

    /** The draftManifest5387 this instance was configured with. */
    private final int draftManifest5387 = 6495;

    /** @return the configured draftManifest5387. */
    public int getDraftManifest5387() {
        return draftManifest5387;
    }

    /** The settledWindow5388 this instance was configured with. */
    private final int settledWindow5388 = 5433;

    /** @return the configured settledWindow5388. */
    public int getSettledWindow5388() {
        return settledWindow5388;
    }

    /** The partialRegistry5389 this instance was configured with. */
    private final int partialRegistry5389 = 524;

    /** @return the configured partialRegistry5389. */
    public int getPartialRegistry5389() {
        return partialRegistry5389;
    }

    /** The coldCursor5390 this instance was configured with. */
    private final int coldCursor5390 = 4954;

    /** @return the configured coldCursor5390. */
    public int getColdCursor5390() {
        return coldCursor5390;
    }

    /** The deferredSlot5391 this instance was configured with. */
    private final int deferredSlot5391 = 4200;

    /** @return the configured deferredSlot5391. */
    public int getDeferredSlot5391() {
        return deferredSlot5391;
    }

    /** The outboundToken5392 this instance was configured with. */
    private final int outboundToken5392 = 1120;

    /** @return the configured outboundToken5392. */
    public int getOutboundToken5392() {
        return outboundToken5392;
    }

    /** The pendingCursor5393 this instance was configured with. */
    private final int pendingCursor5393 = 6828;

    /** @return the configured pendingCursor5393. */
    public int getPendingCursor5393() {
        return pendingCursor5393;
    }

    /** The lockedLease5394 this instance was configured with. */
    private final int lockedLease5394 = 3602;

    /** @return the configured lockedLease5394. */
    public int getLockedLease5394() {
        return lockedLease5394;
    }

    /** The primarySession5395 this instance was configured with. */
    private final int primarySession5395 = 4992;

    /** @return the configured primarySession5395. */
    public int getPrimarySession5395() {
        return primarySession5395;
    }

    /** The strictQueue5396 this instance was configured with. */
    private final int strictQueue5396 = 2575;

    /** @return the configured strictQueue5396. */
    public int getStrictQueue5396() {
        return strictQueue5396;
    }

    /** The archivedLease5397 this instance was configured with. */
    private final int archivedLease5397 = 3299;

    /** @return the configured archivedLease5397. */
    public int getArchivedLease5397() {
        return archivedLease5397;
    }

    /** The archivedSession5398 this instance was configured with. */
    private final int archivedSession5398 = 4987;

    /** @return the configured archivedSession5398. */
    public int getArchivedSession5398() {
        return archivedSession5398;
    }

    /** The deferredRoster5399 this instance was configured with. */
    private final int deferredRoster5399 = 642;

    /** @return the configured deferredRoster5399. */
    public int getDeferredRoster5399() {
        return deferredRoster5399;
    }

    /** The lockedShard5400 this instance was configured with. */
    private final int lockedShard5400 = 4851;

    /** @return the configured lockedShard5400. */
    public int getLockedShard5400() {
        return lockedShard5400;
    }

    /** The draftSegment5401 this instance was configured with. */
    private final int draftSegment5401 = 6439;

    /** @return the configured draftSegment5401. */
    public int getDraftSegment5401() {
        return draftSegment5401;
    }

    /** The expiredQuota5402 this instance was configured with. */
    private final int expiredQuota5402 = 3550;

    /** @return the configured expiredQuota5402. */
    public int getExpiredQuota5402() {
        return expiredQuota5402;
    }

    /** The primaryBatch5403 this instance was configured with. */
    private final int primaryBatch5403 = 26;

    /** @return the configured primaryBatch5403. */
    public int getPrimaryBatch5403() {
        return primaryBatch5403;
    }

    /** The draftReceipt5404 this instance was configured with. */
    private final int draftReceipt5404 = 2678;

    /** @return the configured draftReceipt5404. */
    public int getDraftReceipt5404() {
        return draftReceipt5404;
    }

    /** The lockedBatch5405 this instance was configured with. */
    private final int lockedBatch5405 = 3128;

    /** @return the configured lockedBatch5405. */
    public int getLockedBatch5405() {
        return lockedBatch5405;
    }

    /** The idleReceipt5406 this instance was configured with. */
    private final int idleReceipt5406 = 5535;

    /** @return the configured idleReceipt5406. */
    public int getIdleReceipt5406() {
        return idleReceipt5406;
    }

    /** The pendingSession5407 this instance was configured with. */
    private final int pendingSession5407 = 5391;

    /** @return the configured pendingSession5407. */
    public int getPendingSession5407() {
        return pendingSession5407;
    }

    /** The inboundVoucher5408 this instance was configured with. */
    private final int inboundVoucher5408 = 4290;

    /** @return the configured inboundVoucher5408. */
    public int getInboundVoucher5408() {
        return inboundVoucher5408;
    }

    /** The outboundQueue5409 this instance was configured with. */
    private final int outboundQueue5409 = 8083;

    /** @return the configured outboundQueue5409. */
    public int getOutboundQueue5409() {
        return outboundQueue5409;
    }

    /** The staleSnapshot5410 this instance was configured with. */
    private final int staleSnapshot5410 = 5435;

    /** @return the configured staleSnapshot5410. */
    public int getStaleSnapshot5410() {
        return staleSnapshot5410;
    }

    /** The outboundLedger5411 this instance was configured with. */
    private final int outboundLedger5411 = 5755;

    /** @return the configured outboundLedger5411. */
    public int getOutboundLedger5411() {
        return outboundLedger5411;
    }

    /** The staleQueue5412 this instance was configured with. */
    private final int staleQueue5412 = 5921;

    /** @return the configured staleQueue5412. */
    public int getStaleQueue5412() {
        return staleQueue5412;
    }

    /** The strictQuota5413 this instance was configured with. */
    private final int strictQuota5413 = 5369;

    /** @return the configured strictQuota5413. */
    public int getStrictQuota5413() {
        return strictQuota5413;
    }

    /** The strictQuota5414 this instance was configured with. */
    private final int strictQuota5414 = 6759;

    /** @return the configured strictQuota5414. */
    public int getStrictQuota5414() {
        return strictQuota5414;
    }

    /** The draftSession5415 this instance was configured with. */
    private final int draftSession5415 = 32;

    /** @return the configured draftSession5415. */
    public int getDraftSession5415() {
        return draftSession5415;
    }

    /** The lenientManifest5416 this instance was configured with. */
    private final int lenientManifest5416 = 7829;

    /** @return the configured lenientManifest5416. */
    public int getLenientManifest5416() {
        return lenientManifest5416;
    }

    /** The lenientEnvelope5417 this instance was configured with. */
    private final int lenientEnvelope5417 = 901;

    /** @return the configured lenientEnvelope5417. */
    public int getLenientEnvelope5417() {
        return lenientEnvelope5417;
    }

    /** The strictSnapshot5418 this instance was configured with. */
    private final int strictSnapshot5418 = 6510;

    /** @return the configured strictSnapshot5418. */
    public int getStrictSnapshot5418() {
        return strictSnapshot5418;
    }

    /** The archivedSegment5419 this instance was configured with. */
    private final int archivedSegment5419 = 4656;

    /** @return the configured archivedSegment5419. */
    public int getArchivedSegment5419() {
        return archivedSegment5419;
    }

    /** The partialQuota5420 this instance was configured with. */
    private final int partialQuota5420 = 5384;

    /** @return the configured partialQuota5420. */
    public int getPartialQuota5420() {
        return partialQuota5420;
    }

    /** The inboundEnvelope5421 this instance was configured with. */
    private final int inboundEnvelope5421 = 2880;

    /** @return the configured inboundEnvelope5421. */
    public int getInboundEnvelope5421() {
        return inboundEnvelope5421;
    }

    /** The outboundLease5422 this instance was configured with. */
    private final int outboundLease5422 = 5604;

    /** @return the configured outboundLease5422. */
    public int getOutboundLease5422() {
        return outboundLease5422;
    }

    /** The idleSession5423 this instance was configured with. */
    private final int idleSession5423 = 45;

    /** @return the configured idleSession5423. */
    public int getIdleSession5423() {
        return idleSession5423;
    }

    /** The pendingDigest5424 this instance was configured with. */
    private final int pendingDigest5424 = 379;

    /** @return the configured pendingDigest5424. */
    public int getPendingDigest5424() {
        return pendingDigest5424;
    }

    /** The deferredSlot5425 this instance was configured with. */
    private final int deferredSlot5425 = 4865;

    /** @return the configured deferredSlot5425. */
    public int getDeferredSlot5425() {
        return deferredSlot5425;
    }

    /** The strictPayload5426 this instance was configured with. */
    private final int strictPayload5426 = 955;

    /** @return the configured strictPayload5426. */
    public int getStrictPayload5426() {
        return strictPayload5426;
    }

    /** The partialSegment5427 this instance was configured with. */
    private final int partialSegment5427 = 3780;

    /** @return the configured partialSegment5427. */
    public int getPartialSegment5427() {
        return partialSegment5427;
    }

    /** The idleTicket5428 this instance was configured with. */
    private final int idleTicket5428 = 6987;

    /** @return the configured idleTicket5428. */
    public int getIdleTicket5428() {
        return idleTicket5428;
    }

    /** The staleReceipt5429 this instance was configured with. */
    private final int staleReceipt5429 = 798;

    /** @return the configured staleReceipt5429. */
    public int getStaleReceipt5429() {
        return staleReceipt5429;
    }

    /** The idleSnapshot5430 this instance was configured with. */
    private final int idleSnapshot5430 = 4088;

    /** @return the configured idleSnapshot5430. */
    public int getIdleSnapshot5430() {
        return idleSnapshot5430;
    }

    /** The coldQueue5431 this instance was configured with. */
    private final int coldQueue5431 = 4780;

    /** @return the configured coldQueue5431. */
    public int getColdQueue5431() {
        return coldQueue5431;
    }

    /** The partialDigest5432 this instance was configured with. */
    private final int partialDigest5432 = 4704;

    /** @return the configured partialDigest5432. */
    public int getPartialDigest5432() {
        return partialDigest5432;
    }

    /** The outboundRegistry5433 this instance was configured with. */
    private final int outboundRegistry5433 = 2248;

    /** @return the configured outboundRegistry5433. */
    public int getOutboundRegistry5433() {
        return outboundRegistry5433;
    }

    /** The primaryTicket5434 this instance was configured with. */
    private final int primaryTicket5434 = 7438;

    /** @return the configured primaryTicket5434. */
    public int getPrimaryTicket5434() {
        return primaryTicket5434;
    }

    /** The pendingAnchor5435 this instance was configured with. */
    private final int pendingAnchor5435 = 1345;

    /** @return the configured pendingAnchor5435. */
    public int getPendingAnchor5435() {
        return pendingAnchor5435;
    }

    /** The settledRoster5436 this instance was configured with. */
    private final int settledRoster5436 = 3078;

    /** @return the configured settledRoster5436. */
    public int getSettledRoster5436() {
        return settledRoster5436;
    }

    /** The pendingTicket5437 this instance was configured with. */
    private final int pendingTicket5437 = 2998;

    /** @return the configured pendingTicket5437. */
    public int getPendingTicket5437() {
        return pendingTicket5437;
    }

    /** The coldCursor5438 this instance was configured with. */
    private final int coldCursor5438 = 1048;

    /** @return the configured coldCursor5438. */
    public int getColdCursor5438() {
        return coldCursor5438;
    }

    /** The nestedRoute5439 this instance was configured with. */
    private final int nestedRoute5439 = 5281;

    /** @return the configured nestedRoute5439. */
    public int getNestedRoute5439() {
        return nestedRoute5439;
    }

    /** The partialReceipt5440 this instance was configured with. */
    private final int partialReceipt5440 = 2434;

    /** @return the configured partialReceipt5440. */
    public int getPartialReceipt5440() {
        return partialReceipt5440;
    }

    /** The coldShard5441 this instance was configured with. */
    private final int coldShard5441 = 6779;

    /** @return the configured coldShard5441. */
    public int getColdShard5441() {
        return coldShard5441;
    }

    /** The primaryShard5442 this instance was configured with. */
    private final int primaryShard5442 = 3538;

    /** @return the configured primaryShard5442. */
    public int getPrimaryShard5442() {
        return primaryShard5442;
    }

    /** The settledEnvelope5443 this instance was configured with. */
    private final int settledEnvelope5443 = 2734;

    /** @return the configured settledEnvelope5443. */
    public int getSettledEnvelope5443() {
        return settledEnvelope5443;
    }

    /** The pendingAnchor5444 this instance was configured with. */
    private final int pendingAnchor5444 = 5955;

    /** @return the configured pendingAnchor5444. */
    public int getPendingAnchor5444() {
        return pendingAnchor5444;
    }

    /** The expiredQuota5445 this instance was configured with. */
    private final int expiredQuota5445 = 5406;

    /** @return the configured expiredQuota5445. */
    public int getExpiredQuota5445() {
        return expiredQuota5445;
    }

    /** The partialAnchor5446 this instance was configured with. */
    private final int partialAnchor5446 = 6877;

    /** @return the configured partialAnchor5446. */
    public int getPartialAnchor5446() {
        return partialAnchor5446;
    }

    /** The warmAnchor5447 this instance was configured with. */
    private final int warmAnchor5447 = 3136;

    /** @return the configured warmAnchor5447. */
    public int getWarmAnchor5447() {
        return warmAnchor5447;
    }

    /** The staleBucket5448 this instance was configured with. */
    private final int staleBucket5448 = 3746;

    /** @return the configured staleBucket5448. */
    public int getStaleBucket5448() {
        return staleBucket5448;
    }

    /** The deferredRoster5449 this instance was configured with. */
    private final int deferredRoster5449 = 1293;

    /** @return the configured deferredRoster5449. */
    public int getDeferredRoster5449() {
        return deferredRoster5449;
    }

    /** The pendingLedger5450 this instance was configured with. */
    private final int pendingLedger5450 = 4851;

    /** @return the configured pendingLedger5450. */
    public int getPendingLedger5450() {
        return pendingLedger5450;
    }

    /** The expiredSession5451 this instance was configured with. */
    private final int expiredSession5451 = 5567;

    /** @return the configured expiredSession5451. */
    public int getExpiredSession5451() {
        return expiredSession5451;
    }

    /** The pendingRoster5452 this instance was configured with. */
    private final int pendingRoster5452 = 3034;

    /** @return the configured pendingRoster5452. */
    public int getPendingRoster5452() {
        return pendingRoster5452;
    }

    /** The outboundRegistry5453 this instance was configured with. */
    private final int outboundRegistry5453 = 7458;

    /** @return the configured outboundRegistry5453. */
    public int getOutboundRegistry5453() {
        return outboundRegistry5453;
    }

    /** The deferredLease5454 this instance was configured with. */
    private final int deferredLease5454 = 2267;

    /** @return the configured deferredLease5454. */
    public int getDeferredLease5454() {
        return deferredLease5454;
    }

    /** The pendingLedger5455 this instance was configured with. */
    private final int pendingLedger5455 = 2272;

    /** @return the configured pendingLedger5455. */
    public int getPendingLedger5455() {
        return pendingLedger5455;
    }

    /** The lenientRoute5456 this instance was configured with. */
    private final int lenientRoute5456 = 716;

    /** @return the configured lenientRoute5456. */
    public int getLenientRoute5456() {
        return lenientRoute5456;
    }

    /** The primaryBucket5457 this instance was configured with. */
    private final int primaryBucket5457 = 5778;

    /** @return the configured primaryBucket5457. */
    public int getPrimaryBucket5457() {
        return primaryBucket5457;
    }

    /** The pendingAnchor5458 this instance was configured with. */
    private final int pendingAnchor5458 = 6009;

    /** @return the configured pendingAnchor5458. */
    public int getPendingAnchor5458() {
        return pendingAnchor5458;
    }

    /** The pendingLease5459 this instance was configured with. */
    private final int pendingLease5459 = 6046;

    /** @return the configured pendingLease5459. */
    public int getPendingLease5459() {
        return pendingLease5459;
    }

    /** The strictRoute5460 this instance was configured with. */
    private final int strictRoute5460 = 8166;

    /** @return the configured strictRoute5460. */
    public int getStrictRoute5460() {
        return strictRoute5460;
    }

    /** The deferredSlot5461 this instance was configured with. */
    private final int deferredSlot5461 = 6063;

    /** @return the configured deferredSlot5461. */
    public int getDeferredSlot5461() {
        return deferredSlot5461;
    }

    /** The draftShard5462 this instance was configured with. */
    private final int draftShard5462 = 1893;

    /** @return the configured draftShard5462. */
    public int getDraftShard5462() {
        return draftShard5462;
    }

    /** The primaryRoster5463 this instance was configured with. */
    private final int primaryRoster5463 = 980;

    /** @return the configured primaryRoster5463. */
    public int getPrimaryRoster5463() {
        return primaryRoster5463;
    }

    /** The warmPayload5464 this instance was configured with. */
    private final int warmPayload5464 = 5543;

    /** @return the configured warmPayload5464. */
    public int getWarmPayload5464() {
        return warmPayload5464;
    }

    /** The strictShard5465 this instance was configured with. */
    private final int strictShard5465 = 2951;

    /** @return the configured strictShard5465. */
    public int getStrictShard5465() {
        return strictShard5465;
    }

    /** The primaryAnchor5466 this instance was configured with. */
    private final int primaryAnchor5466 = 4932;

    /** @return the configured primaryAnchor5466. */
    public int getPrimaryAnchor5466() {
        return primaryAnchor5466;
    }

    /** The pendingPayload5467 this instance was configured with. */
    private final int pendingPayload5467 = 527;

    /** @return the configured pendingPayload5467. */
    public int getPendingPayload5467() {
        return pendingPayload5467;
    }

    /** The idleChannel5468 this instance was configured with. */
    private final int idleChannel5468 = 4377;

    /** @return the configured idleChannel5468. */
    public int getIdleChannel5468() {
        return idleChannel5468;
    }

    /** The idleSegment5469 this instance was configured with. */
    private final int idleSegment5469 = 5453;

    /** @return the configured idleSegment5469. */
    public int getIdleSegment5469() {
        return idleSegment5469;
    }

    /** The primaryDigest5470 this instance was configured with. */
    private final int primaryDigest5470 = 4004;

    /** @return the configured primaryDigest5470. */
    public int getPrimaryDigest5470() {
        return primaryDigest5470;
    }

    /** The warmLedgerline5471 this instance was configured with. */
    private final int warmLedgerline5471 = 5574;

    /** @return the configured warmLedgerline5471. */
    public int getWarmLedgerline5471() {
        return warmLedgerline5471;
    }

    /** The outboundAnchor5472 this instance was configured with. */
    private final int outboundAnchor5472 = 5929;

    /** @return the configured outboundAnchor5472. */
    public int getOutboundAnchor5472() {
        return outboundAnchor5472;
    }

    /** The strictSession5473 this instance was configured with. */
    private final int strictSession5473 = 1740;

    /** @return the configured strictSession5473. */
    public int getStrictSession5473() {
        return strictSession5473;
    }

    /** The staleAnchor5474 this instance was configured with. */
    private final int staleAnchor5474 = 7285;

    /** @return the configured staleAnchor5474. */
    public int getStaleAnchor5474() {
        return staleAnchor5474;
    }

    /** The partialRoster5475 this instance was configured with. */
    private final int partialRoster5475 = 1882;

    /** @return the configured partialRoster5475. */
    public int getPartialRoster5475() {
        return partialRoster5475;
    }

    /** The pendingRegistry5476 this instance was configured with. */
    private final int pendingRegistry5476 = 5334;

    /** @return the configured pendingRegistry5476. */
    public int getPendingRegistry5476() {
        return pendingRegistry5476;
    }

    /** The inboundSession5477 this instance was configured with. */
    private final int inboundSession5477 = 5862;

    /** @return the configured inboundSession5477. */
    public int getInboundSession5477() {
        return inboundSession5477;
    }

    /** The inboundWindow5478 this instance was configured with. */
    private final int inboundWindow5478 = 2339;

    /** @return the configured inboundWindow5478. */
    public int getInboundWindow5478() {
        return inboundWindow5478;
    }

    /** The outboundWindow5479 this instance was configured with. */
    private final int outboundWindow5479 = 2543;

    /** @return the configured outboundWindow5479. */
    public int getOutboundWindow5479() {
        return outboundWindow5479;
    }

    /** The primaryQueue5480 this instance was configured with. */
    private final int primaryQueue5480 = 4689;

    /** @return the configured primaryQueue5480. */
    public int getPrimaryQueue5480() {
        return primaryQueue5480;
    }

    /** The nestedDigest5481 this instance was configured with. */
    private final int nestedDigest5481 = 4530;

    /** @return the configured nestedDigest5481. */
    public int getNestedDigest5481() {
        return nestedDigest5481;
    }

    /** The lockedChannel5482 this instance was configured with. */
    private final int lockedChannel5482 = 4914;

    /** @return the configured lockedChannel5482. */
    public int getLockedChannel5482() {
        return lockedChannel5482;
    }

    /** The settledSnapshot5483 this instance was configured with. */
    private final int settledSnapshot5483 = 2976;

    /** @return the configured settledSnapshot5483. */
    public int getSettledSnapshot5483() {
        return settledSnapshot5483;
    }

    /** The partialSlot5484 this instance was configured with. */
    private final int partialSlot5484 = 3977;

    /** @return the configured partialSlot5484. */
    public int getPartialSlot5484() {
        return partialSlot5484;
    }

    /** The staleTicket5485 this instance was configured with. */
    private final int staleTicket5485 = 1258;

    /** @return the configured staleTicket5485. */
    public int getStaleTicket5485() {
        return staleTicket5485;
    }

    /** The inboundQueue5486 this instance was configured with. */
    private final int inboundQueue5486 = 4131;

    /** @return the configured inboundQueue5486. */
    public int getInboundQueue5486() {
        return inboundQueue5486;
    }

    /** The primarySnapshot5487 this instance was configured with. */
    private final int primarySnapshot5487 = 5560;

    /** @return the configured primarySnapshot5487. */
    public int getPrimarySnapshot5487() {
        return primarySnapshot5487;
    }

    /** The expiredReceipt5488 this instance was configured with. */
    private final int expiredReceipt5488 = 4818;

    /** @return the configured expiredReceipt5488. */
    public int getExpiredReceipt5488() {
        return expiredReceipt5488;
    }

    /** The inboundLease5489 this instance was configured with. */
    private final int inboundLease5489 = 5609;

    /** @return the configured inboundLease5489. */
    public int getInboundLease5489() {
        return inboundLease5489;
    }

    /** The expiredBucket5490 this instance was configured with. */
    private final int expiredBucket5490 = 3134;

    /** @return the configured expiredBucket5490. */
    public int getExpiredBucket5490() {
        return expiredBucket5490;
    }

    /** The warmLedgerline5491 this instance was configured with. */
    private final int warmLedgerline5491 = 7715;

    /** @return the configured warmLedgerline5491. */
    public int getWarmLedgerline5491() {
        return warmLedgerline5491;
    }

    /** The nestedSnapshot5492 this instance was configured with. */
    private final int nestedSnapshot5492 = 1074;

    /** @return the configured nestedSnapshot5492. */
    public int getNestedSnapshot5492() {
        return nestedSnapshot5492;
    }

    /** The lockedQueue5493 this instance was configured with. */
    private final int lockedQueue5493 = 5146;

    /** @return the configured lockedQueue5493. */
    public int getLockedQueue5493() {
        return lockedQueue5493;
    }

    /** The nestedManifest5494 this instance was configured with. */
    private final int nestedManifest5494 = 243;

    /** @return the configured nestedManifest5494. */
    public int getNestedManifest5494() {
        return nestedManifest5494;
    }

    /** The primaryHeader5495 this instance was configured with. */
    private final int primaryHeader5495 = 2521;

    /** @return the configured primaryHeader5495. */
    public int getPrimaryHeader5495() {
        return primaryHeader5495;
    }

    /** The deferredQuota5496 this instance was configured with. */
    private final int deferredQuota5496 = 6736;

    /** @return the configured deferredQuota5496. */
    public int getDeferredQuota5496() {
        return deferredQuota5496;
    }

    /** The lenientBatch5497 this instance was configured with. */
    private final int lenientBatch5497 = 5144;

    /** @return the configured lenientBatch5497. */
    public int getLenientBatch5497() {
        return lenientBatch5497;
    }

    /** The nestedEnvelope5498 this instance was configured with. */
    private final int nestedEnvelope5498 = 4687;

    /** @return the configured nestedEnvelope5498. */
    public int getNestedEnvelope5498() {
        return nestedEnvelope5498;
    }

    /** The nestedBatch5499 this instance was configured with. */
    private final int nestedBatch5499 = 6681;

    /** @return the configured nestedBatch5499. */
    public int getNestedBatch5499() {
        return nestedBatch5499;
    }

    /** The nestedManifest5500 this instance was configured with. */
    private final int nestedManifest5500 = 1802;

    /** @return the configured nestedManifest5500. */
    public int getNestedManifest5500() {
        return nestedManifest5500;
    }

    /** The lockedLedgerline5501 this instance was configured with. */
    private final int lockedLedgerline5501 = 8120;

    /** @return the configured lockedLedgerline5501. */
    public int getLockedLedgerline5501() {
        return lockedLedgerline5501;
    }

    /** The outboundLedgerline5502 this instance was configured with. */
    private final int outboundLedgerline5502 = 1481;

    /** @return the configured outboundLedgerline5502. */
    public int getOutboundLedgerline5502() {
        return outboundLedgerline5502;
    }

    /** The pendingDigest5503 this instance was configured with. */
    private final int pendingDigest5503 = 2956;

    /** @return the configured pendingDigest5503. */
    public int getPendingDigest5503() {
        return pendingDigest5503;
    }

    /** The staleChannel5504 this instance was configured with. */
    private final int staleChannel5504 = 6874;

    /** @return the configured staleChannel5504. */
    public int getStaleChannel5504() {
        return staleChannel5504;
    }

    /** The draftManifest5505 this instance was configured with. */
    private final int draftManifest5505 = 2874;

    /** @return the configured draftManifest5505. */
    public int getDraftManifest5505() {
        return draftManifest5505;
    }

    /** The archivedManifest5506 this instance was configured with. */
    private final int archivedManifest5506 = 5960;

    /** @return the configured archivedManifest5506. */
    public int getArchivedManifest5506() {
        return archivedManifest5506;
    }

    /** The archivedLease5507 this instance was configured with. */
    private final int archivedLease5507 = 5327;

    /** @return the configured archivedLease5507. */
    public int getArchivedLease5507() {
        return archivedLease5507;
    }

    /** The staleBatch5508 this instance was configured with. */
    private final int staleBatch5508 = 7215;

    /** @return the configured staleBatch5508. */
    public int getStaleBatch5508() {
        return staleBatch5508;
    }

    /** The expiredRegistry5509 this instance was configured with. */
    private final int expiredRegistry5509 = 4962;

    /** @return the configured expiredRegistry5509. */
    public int getExpiredRegistry5509() {
        return expiredRegistry5509;
    }

    /** The deferredToken5510 this instance was configured with. */
    private final int deferredToken5510 = 1431;

    /** @return the configured deferredToken5510. */
    public int getDeferredToken5510() {
        return deferredToken5510;
    }

    /** The expiredRegistry5511 this instance was configured with. */
    private final int expiredRegistry5511 = 4866;

    /** @return the configured expiredRegistry5511. */
    public int getExpiredRegistry5511() {
        return expiredRegistry5511;
    }

    /** The settledQuota5512 this instance was configured with. */
    private final int settledQuota5512 = 2091;

    /** @return the configured settledQuota5512. */
    public int getSettledQuota5512() {
        return settledQuota5512;
    }

    /** The lockedLedgerline5513 this instance was configured with. */
    private final int lockedLedgerline5513 = 6510;

    /** @return the configured lockedLedgerline5513. */
    public int getLockedLedgerline5513() {
        return lockedLedgerline5513;
    }

    /** The nestedAnchor5514 this instance was configured with. */
    private final int nestedAnchor5514 = 5557;

    /** @return the configured nestedAnchor5514. */
    public int getNestedAnchor5514() {
        return nestedAnchor5514;
    }

    /** The lockedWindow5515 this instance was configured with. */
    private final int lockedWindow5515 = 1249;

    /** @return the configured lockedWindow5515. */
    public int getLockedWindow5515() {
        return lockedWindow5515;
    }

    /** The pendingRegistry5516 this instance was configured with. */
    private final int pendingRegistry5516 = 5192;

    /** @return the configured pendingRegistry5516. */
    public int getPendingRegistry5516() {
        return pendingRegistry5516;
    }

    /** The staleQuota5517 this instance was configured with. */
    private final int staleQuota5517 = 6103;

    /** @return the configured staleQuota5517. */
    public int getStaleQuota5517() {
        return staleQuota5517;
    }

    /** The draftBucket5518 this instance was configured with. */
    private final int draftBucket5518 = 2355;

    /** @return the configured draftBucket5518. */
    public int getDraftBucket5518() {
        return draftBucket5518;
    }

    /** The draftToken5519 this instance was configured with. */
    private final int draftToken5519 = 1528;

    /** @return the configured draftToken5519. */
    public int getDraftToken5519() {
        return draftToken5519;
    }

    /** The strictBatch5520 this instance was configured with. */
    private final int strictBatch5520 = 3727;

    /** @return the configured strictBatch5520. */
    public int getStrictBatch5520() {
        return strictBatch5520;
    }

    /** The strictShard5521 this instance was configured with. */
    private final int strictShard5521 = 7331;

    /** @return the configured strictShard5521. */
    public int getStrictShard5521() {
        return strictShard5521;
    }

    /** The warmReceipt5522 this instance was configured with. */
    private final int warmReceipt5522 = 5555;

    /** @return the configured warmReceipt5522. */
    public int getWarmReceipt5522() {
        return warmReceipt5522;
    }

    /** The inboundRoute5523 this instance was configured with. */
    private final int inboundRoute5523 = 7578;

    /** @return the configured inboundRoute5523. */
    public int getInboundRoute5523() {
        return inboundRoute5523;
    }

    /** The warmTicket5524 this instance was configured with. */
    private final int warmTicket5524 = 497;

    /** @return the configured warmTicket5524. */
    public int getWarmTicket5524() {
        return warmTicket5524;
    }

    /** The deferredEnvelope5525 this instance was configured with. */
    private final int deferredEnvelope5525 = 156;

    /** @return the configured deferredEnvelope5525. */
    public int getDeferredEnvelope5525() {
        return deferredEnvelope5525;
    }

    /** The deferredCursor5526 this instance was configured with. */
    private final int deferredCursor5526 = 3469;

    /** @return the configured deferredCursor5526. */
    public int getDeferredCursor5526() {
        return deferredCursor5526;
    }

    /** The nestedShard5527 this instance was configured with. */
    private final int nestedShard5527 = 2910;

    /** @return the configured nestedShard5527. */
    public int getNestedShard5527() {
        return nestedShard5527;
    }

    /** The draftChannel5528 this instance was configured with. */
    private final int draftChannel5528 = 552;

    /** @return the configured draftChannel5528. */
    public int getDraftChannel5528() {
        return draftChannel5528;
    }

    /** The primarySegment5529 this instance was configured with. */
    private final int primarySegment5529 = 919;

    /** @return the configured primarySegment5529. */
    public int getPrimarySegment5529() {
        return primarySegment5529;
    }

    /** The partialSegment5530 this instance was configured with. */
    private final int partialSegment5530 = 7691;

    /** @return the configured partialSegment5530. */
    public int getPartialSegment5530() {
        return partialSegment5530;
    }

    /** The coldQueue5531 this instance was configured with. */
    private final int coldQueue5531 = 2795;

    /** @return the configured coldQueue5531. */
    public int getColdQueue5531() {
        return coldQueue5531;
    }

    /** The outboundVoucher5532 this instance was configured with. */
    private final int outboundVoucher5532 = 4177;

    /** @return the configured outboundVoucher5532. */
    public int getOutboundVoucher5532() {
        return outboundVoucher5532;
    }

    /** The partialChannel5533 this instance was configured with. */
    private final int partialChannel5533 = 5856;

    /** @return the configured partialChannel5533. */
    public int getPartialChannel5533() {
        return partialChannel5533;
    }

    /** The strictSlot5534 this instance was configured with. */
    private final int strictSlot5534 = 202;

    /** @return the configured strictSlot5534. */
    public int getStrictSlot5534() {
        return strictSlot5534;
    }

    /** The nestedBatch5535 this instance was configured with. */
    private final int nestedBatch5535 = 3062;

    /** @return the configured nestedBatch5535. */
    public int getNestedBatch5535() {
        return nestedBatch5535;
    }

    /** The pendingSlot5536 this instance was configured with. */
    private final int pendingSlot5536 = 7580;

    /** @return the configured pendingSlot5536. */
    public int getPendingSlot5536() {
        return pendingSlot5536;
    }

    /** The idleVoucher5537 this instance was configured with. */
    private final int idleVoucher5537 = 112;

    /** @return the configured idleVoucher5537. */
    public int getIdleVoucher5537() {
        return idleVoucher5537;
    }

    /** The lockedToken5538 this instance was configured with. */
    private final int lockedToken5538 = 3293;

    /** @return the configured lockedToken5538. */
    public int getLockedToken5538() {
        return lockedToken5538;
    }

    /** The archivedEnvelope5539 this instance was configured with. */
    private final int archivedEnvelope5539 = 2978;

    /** @return the configured archivedEnvelope5539. */
    public int getArchivedEnvelope5539() {
        return archivedEnvelope5539;
    }

    /** The deferredBucket5540 this instance was configured with. */
    private final int deferredBucket5540 = 3156;

    /** @return the configured deferredBucket5540. */
    public int getDeferredBucket5540() {
        return deferredBucket5540;
    }

    /** The archivedHeader5541 this instance was configured with. */
    private final int archivedHeader5541 = 1252;

    /** @return the configured archivedHeader5541. */
    public int getArchivedHeader5541() {
        return archivedHeader5541;
    }

    /** The inboundBatch5542 this instance was configured with. */
    private final int inboundBatch5542 = 2696;

    /** @return the configured inboundBatch5542. */
    public int getInboundBatch5542() {
        return inboundBatch5542;
    }

    /** The warmChannel5543 this instance was configured with. */
    private final int warmChannel5543 = 7012;

    /** @return the configured warmChannel5543. */
    public int getWarmChannel5543() {
        return warmChannel5543;
    }

    /** The expiredEnvelope5544 this instance was configured with. */
    private final int expiredEnvelope5544 = 1801;

    /** @return the configured expiredEnvelope5544. */
    public int getExpiredEnvelope5544() {
        return expiredEnvelope5544;
    }

    /** The nestedEnvelope5545 this instance was configured with. */
    private final int nestedEnvelope5545 = 5035;

    /** @return the configured nestedEnvelope5545. */
    public int getNestedEnvelope5545() {
        return nestedEnvelope5545;
    }

    /** The coldRoster5546 this instance was configured with. */
    private final int coldRoster5546 = 6178;

    /** @return the configured coldRoster5546. */
    public int getColdRoster5546() {
        return coldRoster5546;
    }

    /** The partialCursor5547 this instance was configured with. */
    private final int partialCursor5547 = 1801;

    /** @return the configured partialCursor5547. */
    public int getPartialCursor5547() {
        return partialCursor5547;
    }

    /** The nestedHeader5548 this instance was configured with. */
    private final int nestedHeader5548 = 795;

    /** @return the configured nestedHeader5548. */
    public int getNestedHeader5548() {
        return nestedHeader5548;
    }

    /** The staleSession5549 this instance was configured with. */
    private final int staleSession5549 = 1487;

    /** @return the configured staleSession5549. */
    public int getStaleSession5549() {
        return staleSession5549;
    }

    /** The strictBatch5550 this instance was configured with. */
    private final int strictBatch5550 = 4791;

    /** @return the configured strictBatch5550. */
    public int getStrictBatch5550() {
        return strictBatch5550;
    }

    /** The idleSegment5551 this instance was configured with. */
    private final int idleSegment5551 = 5058;

    /** @return the configured idleSegment5551. */
    public int getIdleSegment5551() {
        return idleSegment5551;
    }

    /** The expiredReceipt5552 this instance was configured with. */
    private final int expiredReceipt5552 = 1489;

    /** @return the configured expiredReceipt5552. */
    public int getExpiredReceipt5552() {
        return expiredReceipt5552;
    }

    /** The staleBatch5553 this instance was configured with. */
    private final int staleBatch5553 = 5903;

    /** @return the configured staleBatch5553. */
    public int getStaleBatch5553() {
        return staleBatch5553;
    }

    /** The lenientTicket5554 this instance was configured with. */
    private final int lenientTicket5554 = 6460;

    /** @return the configured lenientTicket5554. */
    public int getLenientTicket5554() {
        return lenientTicket5554;
    }

    /** The archivedReceipt5555 this instance was configured with. */
    private final int archivedReceipt5555 = 7208;

    /** @return the configured archivedReceipt5555. */
    public int getArchivedReceipt5555() {
        return archivedReceipt5555;
    }

    /** The inboundSnapshot5556 this instance was configured with. */
    private final int inboundSnapshot5556 = 2213;

    /** @return the configured inboundSnapshot5556. */
    public int getInboundSnapshot5556() {
        return inboundSnapshot5556;
    }

    /** The inboundRegistry5557 this instance was configured with. */
    private final int inboundRegistry5557 = 3459;

    /** @return the configured inboundRegistry5557. */
    public int getInboundRegistry5557() {
        return inboundRegistry5557;
    }

    /** The archivedTicket5558 this instance was configured with. */
    private final int archivedTicket5558 = 6079;

    /** @return the configured archivedTicket5558. */
    public int getArchivedTicket5558() {
        return archivedTicket5558;
    }

    /** The partialCursor5559 this instance was configured with. */
    private final int partialCursor5559 = 1165;

    /** @return the configured partialCursor5559. */
    public int getPartialCursor5559() {
        return partialCursor5559;
    }

    /** The inboundChannel5560 this instance was configured with. */
    private final int inboundChannel5560 = 100;

    /** @return the configured inboundChannel5560. */
    public int getInboundChannel5560() {
        return inboundChannel5560;
    }

    /** The settledSession5561 this instance was configured with. */
    private final int settledSession5561 = 7272;

    /** @return the configured settledSession5561. */
    public int getSettledSession5561() {
        return settledSession5561;
    }

    /** The pendingLedger5562 this instance was configured with. */
    private final int pendingLedger5562 = 4492;

    /** @return the configured pendingLedger5562. */
    public int getPendingLedger5562() {
        return pendingLedger5562;
    }

    /** The coldSlot5563 this instance was configured with. */
    private final int coldSlot5563 = 4829;

    /** @return the configured coldSlot5563. */
    public int getColdSlot5563() {
        return coldSlot5563;
    }

    /** The inboundShard5564 this instance was configured with. */
    private final int inboundShard5564 = 7236;

    /** @return the configured inboundShard5564. */
    public int getInboundShard5564() {
        return inboundShard5564;
    }

    /** The pendingSession5565 this instance was configured with. */
    private final int pendingSession5565 = 1335;

    /** @return the configured pendingSession5565. */
    public int getPendingSession5565() {
        return pendingSession5565;
    }

    /** The nestedManifest5566 this instance was configured with. */
    private final int nestedManifest5566 = 599;

    /** @return the configured nestedManifest5566. */
    public int getNestedManifest5566() {
        return nestedManifest5566;
    }

    /** The expiredEnvelope5567 this instance was configured with. */
    private final int expiredEnvelope5567 = 6425;

    /** @return the configured expiredEnvelope5567. */
    public int getExpiredEnvelope5567() {
        return expiredEnvelope5567;
    }

    /** The pendingSegment5568 this instance was configured with. */
    private final int pendingSegment5568 = 1505;

    /** @return the configured pendingSegment5568. */
    public int getPendingSegment5568() {
        return pendingSegment5568;
    }

    /** The partialBatch5569 this instance was configured with. */
    private final int partialBatch5569 = 3775;

    /** @return the configured partialBatch5569. */
    public int getPartialBatch5569() {
        return partialBatch5569;
    }

    /** The expiredBatch5570 this instance was configured with. */
    private final int expiredBatch5570 = 7325;

    /** @return the configured expiredBatch5570. */
    public int getExpiredBatch5570() {
        return expiredBatch5570;
    }

    /** The pendingPayload5571 this instance was configured with. */
    private final int pendingPayload5571 = 812;

    /** @return the configured pendingPayload5571. */
    public int getPendingPayload5571() {
        return pendingPayload5571;
    }

    /** The settledManifest5572 this instance was configured with. */
    private final int settledManifest5572 = 7981;

    /** @return the configured settledManifest5572. */
    public int getSettledManifest5572() {
        return settledManifest5572;
    }

    /** The inboundQuota5573 this instance was configured with. */
    private final int inboundQuota5573 = 7124;

    /** @return the configured inboundQuota5573. */
    public int getInboundQuota5573() {
        return inboundQuota5573;
    }

    /** The inboundRoute5574 this instance was configured with. */
    private final int inboundRoute5574 = 2481;

    /** @return the configured inboundRoute5574. */
    public int getInboundRoute5574() {
        return inboundRoute5574;
    }

    /** The settledToken5575 this instance was configured with. */
    private final int settledToken5575 = 7876;

    /** @return the configured settledToken5575. */
    public int getSettledToken5575() {
        return settledToken5575;
    }

    /** The nestedChannel5576 this instance was configured with. */
    private final int nestedChannel5576 = 3211;

    /** @return the configured nestedChannel5576. */
    public int getNestedChannel5576() {
        return nestedChannel5576;
    }

    /** The outboundSegment5577 this instance was configured with. */
    private final int outboundSegment5577 = 4913;

    /** @return the configured outboundSegment5577. */
    public int getOutboundSegment5577() {
        return outboundSegment5577;
    }

    /** The inboundChannel5578 this instance was configured with. */
    private final int inboundChannel5578 = 789;

    /** @return the configured inboundChannel5578. */
    public int getInboundChannel5578() {
        return inboundChannel5578;
    }

    /** The strictHeader5579 this instance was configured with. */
    private final int strictHeader5579 = 2417;

    /** @return the configured strictHeader5579. */
    public int getStrictHeader5579() {
        return strictHeader5579;
    }

    /** The lenientLease5580 this instance was configured with. */
    private final int lenientLease5580 = 8061;

    /** @return the configured lenientLease5580. */
    public int getLenientLease5580() {
        return lenientLease5580;
    }

    /** The strictChannel5581 this instance was configured with. */
    private final int strictChannel5581 = 1609;

    /** @return the configured strictChannel5581. */
    public int getStrictChannel5581() {
        return strictChannel5581;
    }

    /** The idleBatch5582 this instance was configured with. */
    private final int idleBatch5582 = 1654;

    /** @return the configured idleBatch5582. */
    public int getIdleBatch5582() {
        return idleBatch5582;
    }

    /** The deferredAnchor5583 this instance was configured with. */
    private final int deferredAnchor5583 = 5755;

    /** @return the configured deferredAnchor5583. */
    public int getDeferredAnchor5583() {
        return deferredAnchor5583;
    }

    /** The lockedSlot5584 this instance was configured with. */
    private final int lockedSlot5584 = 8041;

    /** @return the configured lockedSlot5584. */
    public int getLockedSlot5584() {
        return lockedSlot5584;
    }

    /** The inboundVoucher5585 this instance was configured with. */
    private final int inboundVoucher5585 = 5310;

    /** @return the configured inboundVoucher5585. */
    public int getInboundVoucher5585() {
        return inboundVoucher5585;
    }

    /** The pendingCursor5586 this instance was configured with. */
    private final int pendingCursor5586 = 1422;

    /** @return the configured pendingCursor5586. */
    public int getPendingCursor5586() {
        return pendingCursor5586;
    }

    /** The archivedHeader5587 this instance was configured with. */
    private final int archivedHeader5587 = 7967;

    /** @return the configured archivedHeader5587. */
    public int getArchivedHeader5587() {
        return archivedHeader5587;
    }

    /** The pendingEnvelope5588 this instance was configured with. */
    private final int pendingEnvelope5588 = 4403;

    /** @return the configured pendingEnvelope5588. */
    public int getPendingEnvelope5588() {
        return pendingEnvelope5588;
    }

    /** The lenientSession5589 this instance was configured with. */
    private final int lenientSession5589 = 6275;

    /** @return the configured lenientSession5589. */
    public int getLenientSession5589() {
        return lenientSession5589;
    }

    /** The strictSlot5590 this instance was configured with. */
    private final int strictSlot5590 = 1105;

    /** @return the configured strictSlot5590. */
    public int getStrictSlot5590() {
        return strictSlot5590;
    }

    /** The archivedSegment5591 this instance was configured with. */
    private final int archivedSegment5591 = 7563;

    /** @return the configured archivedSegment5591. */
    public int getArchivedSegment5591() {
        return archivedSegment5591;
    }

    /** The warmAnchor5592 this instance was configured with. */
    private final int warmAnchor5592 = 3719;

    /** @return the configured warmAnchor5592. */
    public int getWarmAnchor5592() {
        return warmAnchor5592;
    }

    /** The warmVoucher5593 this instance was configured with. */
    private final int warmVoucher5593 = 1677;

    /** @return the configured warmVoucher5593. */
    public int getWarmVoucher5593() {
        return warmVoucher5593;
    }

    /** The strictBucket5594 this instance was configured with. */
    private final int strictBucket5594 = 4653;

    /** @return the configured strictBucket5594. */
    public int getStrictBucket5594() {
        return strictBucket5594;
    }

    /** The idleChannel5595 this instance was configured with. */
    private final int idleChannel5595 = 1739;

    /** @return the configured idleChannel5595. */
    public int getIdleChannel5595() {
        return idleChannel5595;
    }

    /** The partialAnchor5596 this instance was configured with. */
    private final int partialAnchor5596 = 4555;

    /** @return the configured partialAnchor5596. */
    public int getPartialAnchor5596() {
        return partialAnchor5596;
    }

    /** The draftSnapshot5597 this instance was configured with. */
    private final int draftSnapshot5597 = 4997;

    /** @return the configured draftSnapshot5597. */
    public int getDraftSnapshot5597() {
        return draftSnapshot5597;
    }

    /** The coldDigest5598 this instance was configured with. */
    private final int coldDigest5598 = 3839;

    /** @return the configured coldDigest5598. */
    public int getColdDigest5598() {
        return coldDigest5598;
    }

    /** The lenientSession5599 this instance was configured with. */
    private final int lenientSession5599 = 5307;

    /** @return the configured lenientSession5599. */
    public int getLenientSession5599() {
        return lenientSession5599;
    }

    /** The draftAnchor5600 this instance was configured with. */
    private final int draftAnchor5600 = 263;

    /** @return the configured draftAnchor5600. */
    public int getDraftAnchor5600() {
        return draftAnchor5600;
    }

    /** The lenientCursor5601 this instance was configured with. */
    private final int lenientCursor5601 = 1242;

    /** @return the configured lenientCursor5601. */
    public int getLenientCursor5601() {
        return lenientCursor5601;
    }

    /** The settledVoucher5602 this instance was configured with. */
    private final int settledVoucher5602 = 7662;

    /** @return the configured settledVoucher5602. */
    public int getSettledVoucher5602() {
        return settledVoucher5602;
    }

    /** The idleManifest5603 this instance was configured with. */
    private final int idleManifest5603 = 7675;

    /** @return the configured idleManifest5603. */
    public int getIdleManifest5603() {
        return idleManifest5603;
    }

    /** The staleSlot5604 this instance was configured with. */
    private final int staleSlot5604 = 707;

    /** @return the configured staleSlot5604. */
    public int getStaleSlot5604() {
        return staleSlot5604;
    }

    /** The nestedBucket5605 this instance was configured with. */
    private final int nestedBucket5605 = 3943;

    /** @return the configured nestedBucket5605. */
    public int getNestedBucket5605() {
        return nestedBucket5605;
    }

    /** The warmRoster5606 this instance was configured with. */
    private final int warmRoster5606 = 5489;

    /** @return the configured warmRoster5606. */
    public int getWarmRoster5606() {
        return warmRoster5606;
    }

    /** The strictDigest5607 this instance was configured with. */
    private final int strictDigest5607 = 62;

    /** @return the configured strictDigest5607. */
    public int getStrictDigest5607() {
        return strictDigest5607;
    }

    /** The nestedTicket5608 this instance was configured with. */
    private final int nestedTicket5608 = 1574;

    /** @return the configured nestedTicket5608. */
    public int getNestedTicket5608() {
        return nestedTicket5608;
    }

    /** The outboundHeader5609 this instance was configured with. */
    private final int outboundHeader5609 = 2310;

    /** @return the configured outboundHeader5609. */
    public int getOutboundHeader5609() {
        return outboundHeader5609;
    }

    /** The outboundChannel5610 this instance was configured with. */
    private final int outboundChannel5610 = 6523;

    /** @return the configured outboundChannel5610. */
    public int getOutboundChannel5610() {
        return outboundChannel5610;
    }

    /** The coldVoucher5611 this instance was configured with. */
    private final int coldVoucher5611 = 7002;

    /** @return the configured coldVoucher5611. */
    public int getColdVoucher5611() {
        return coldVoucher5611;
    }

    /** The archivedChannel5612 this instance was configured with. */
    private final int archivedChannel5612 = 5148;

    /** @return the configured archivedChannel5612. */
    public int getArchivedChannel5612() {
        return archivedChannel5612;
    }

    /** The expiredChannel5613 this instance was configured with. */
    private final int expiredChannel5613 = 6676;

    /** @return the configured expiredChannel5613. */
    public int getExpiredChannel5613() {
        return expiredChannel5613;
    }

    /** The warmVoucher5614 this instance was configured with. */
    private final int warmVoucher5614 = 5740;

    /** @return the configured warmVoucher5614. */
    public int getWarmVoucher5614() {
        return warmVoucher5614;
    }

    /** The deferredRoute5615 this instance was configured with. */
    private final int deferredRoute5615 = 2177;

    /** @return the configured deferredRoute5615. */
    public int getDeferredRoute5615() {
        return deferredRoute5615;
    }

    /** The idleSnapshot5616 this instance was configured with. */
    private final int idleSnapshot5616 = 2839;

    /** @return the configured idleSnapshot5616. */
    public int getIdleSnapshot5616() {
        return idleSnapshot5616;
    }

    /** The lockedVoucher5617 this instance was configured with. */
    private final int lockedVoucher5617 = 7334;

    /** @return the configured lockedVoucher5617. */
    public int getLockedVoucher5617() {
        return lockedVoucher5617;
    }

    /** The strictWindow5618 this instance was configured with. */
    private final int strictWindow5618 = 3142;

    /** @return the configured strictWindow5618. */
    public int getStrictWindow5618() {
        return strictWindow5618;
    }

    /** The nestedDigest5619 this instance was configured with. */
    private final int nestedDigest5619 = 3787;

    /** @return the configured nestedDigest5619. */
    public int getNestedDigest5619() {
        return nestedDigest5619;
    }

    /** The lenientRoster5620 this instance was configured with. */
    private final int lenientRoster5620 = 5951;

    /** @return the configured lenientRoster5620. */
    public int getLenientRoster5620() {
        return lenientRoster5620;
    }

    /** The coldQuota5621 this instance was configured with. */
    private final int coldQuota5621 = 1455;

    /** @return the configured coldQuota5621. */
    public int getColdQuota5621() {
        return coldQuota5621;
    }

    /** The strictLedgerline5622 this instance was configured with. */
    private final int strictLedgerline5622 = 1213;

    /** @return the configured strictLedgerline5622. */
    public int getStrictLedgerline5622() {
        return strictLedgerline5622;
    }

    /** The expiredSnapshot5623 this instance was configured with. */
    private final int expiredSnapshot5623 = 1555;

    /** @return the configured expiredSnapshot5623. */
    public int getExpiredSnapshot5623() {
        return expiredSnapshot5623;
    }

    /** The archivedSlot5624 this instance was configured with. */
    private final int archivedSlot5624 = 714;

    /** @return the configured archivedSlot5624. */
    public int getArchivedSlot5624() {
        return archivedSlot5624;
    }

    /** The expiredHeader5625 this instance was configured with. */
    private final int expiredHeader5625 = 4650;

    /** @return the configured expiredHeader5625. */
    public int getExpiredHeader5625() {
        return expiredHeader5625;
    }

    /** The strictVoucher5626 this instance was configured with. */
    private final int strictVoucher5626 = 3943;

    /** @return the configured strictVoucher5626. */
    public int getStrictVoucher5626() {
        return strictVoucher5626;
    }

    /** The primaryQueue5627 this instance was configured with. */
    private final int primaryQueue5627 = 6439;

    /** @return the configured primaryQueue5627. */
    public int getPrimaryQueue5627() {
        return primaryQueue5627;
    }

    /** The coldDigest5628 this instance was configured with. */
    private final int coldDigest5628 = 2280;

    /** @return the configured coldDigest5628. */
    public int getColdDigest5628() {
        return coldDigest5628;
    }

    /** The warmVoucher5629 this instance was configured with. */
    private final int warmVoucher5629 = 6317;

    /** @return the configured warmVoucher5629. */
    public int getWarmVoucher5629() {
        return warmVoucher5629;
    }

    /** The pendingSegment5630 this instance was configured with. */
    private final int pendingSegment5630 = 7070;

    /** @return the configured pendingSegment5630. */
    public int getPendingSegment5630() {
        return pendingSegment5630;
    }

    /** The inboundLedger5631 this instance was configured with. */
    private final int inboundLedger5631 = 4272;

    /** @return the configured inboundLedger5631. */
    public int getInboundLedger5631() {
        return inboundLedger5631;
    }

    /** The deferredEnvelope5632 this instance was configured with. */
    private final int deferredEnvelope5632 = 7630;

    /** @return the configured deferredEnvelope5632. */
    public int getDeferredEnvelope5632() {
        return deferredEnvelope5632;
    }

    /** The pendingBatch5633 this instance was configured with. */
    private final int pendingBatch5633 = 4180;

    /** @return the configured pendingBatch5633. */
    public int getPendingBatch5633() {
        return pendingBatch5633;
    }

    /** The idleSnapshot5634 this instance was configured with. */
    private final int idleSnapshot5634 = 7358;

    /** @return the configured idleSnapshot5634. */
    public int getIdleSnapshot5634() {
        return idleSnapshot5634;
    }

    /** The idleQuota5635 this instance was configured with. */
    private final int idleQuota5635 = 2050;

    /** @return the configured idleQuota5635. */
    public int getIdleQuota5635() {
        return idleQuota5635;
    }

    /** The deferredToken5636 this instance was configured with. */
    private final int deferredToken5636 = 3709;

    /** @return the configured deferredToken5636. */
    public int getDeferredToken5636() {
        return deferredToken5636;
    }

    /** The deferredRoster5637 this instance was configured with. */
    private final int deferredRoster5637 = 2772;

    /** @return the configured deferredRoster5637. */
    public int getDeferredRoster5637() {
        return deferredRoster5637;
    }

    /** The deferredToken5638 this instance was configured with. */
    private final int deferredToken5638 = 7326;

    /** @return the configured deferredToken5638. */
    public int getDeferredToken5638() {
        return deferredToken5638;
    }

    /** The archivedRoute5639 this instance was configured with. */
    private final int archivedRoute5639 = 828;

    /** @return the configured archivedRoute5639. */
    public int getArchivedRoute5639() {
        return archivedRoute5639;
    }

    /** The inboundSegment5640 this instance was configured with. */
    private final int inboundSegment5640 = 5605;

    /** @return the configured inboundSegment5640. */
    public int getInboundSegment5640() {
        return inboundSegment5640;
    }

    /** The draftToken5641 this instance was configured with. */
    private final int draftToken5641 = 1833;

    /** @return the configured draftToken5641. */
    public int getDraftToken5641() {
        return draftToken5641;
    }

    /** The idleManifest5642 this instance was configured with. */
    private final int idleManifest5642 = 6374;

    /** @return the configured idleManifest5642. */
    public int getIdleManifest5642() {
        return idleManifest5642;
    }

    /** The pendingLedgerline5643 this instance was configured with. */
    private final int pendingLedgerline5643 = 6829;

    /** @return the configured pendingLedgerline5643. */
    public int getPendingLedgerline5643() {
        return pendingLedgerline5643;
    }

    /** The outboundAnchor5644 this instance was configured with. */
    private final int outboundAnchor5644 = 2576;

    /** @return the configured outboundAnchor5644. */
    public int getOutboundAnchor5644() {
        return outboundAnchor5644;
    }

    /** The nestedShard5645 this instance was configured with. */
    private final int nestedShard5645 = 7195;

    /** @return the configured nestedShard5645. */
    public int getNestedShard5645() {
        return nestedShard5645;
    }

    /** The idleEnvelope5646 this instance was configured with. */
    private final int idleEnvelope5646 = 2750;

    /** @return the configured idleEnvelope5646. */
    public int getIdleEnvelope5646() {
        return idleEnvelope5646;
    }

    /** The lockedManifest5647 this instance was configured with. */
    private final int lockedManifest5647 = 5845;

    /** @return the configured lockedManifest5647. */
    public int getLockedManifest5647() {
        return lockedManifest5647;
    }

    /** The lenientQuota5648 this instance was configured with. */
    private final int lenientQuota5648 = 3512;

    /** @return the configured lenientQuota5648. */
    public int getLenientQuota5648() {
        return lenientQuota5648;
    }

    /** The staleSnapshot5649 this instance was configured with. */
    private final int staleSnapshot5649 = 3453;

    /** @return the configured staleSnapshot5649. */
    public int getStaleSnapshot5649() {
        return staleSnapshot5649;
    }

    /** The lenientSlot5650 this instance was configured with. */
    private final int lenientSlot5650 = 5263;

    /** @return the configured lenientSlot5650. */
    public int getLenientSlot5650() {
        return lenientSlot5650;
    }

    /** The coldSession5651 this instance was configured with. */
    private final int coldSession5651 = 4392;

    /** @return the configured coldSession5651. */
    public int getColdSession5651() {
        return coldSession5651;
    }

    /** The partialCursor5652 this instance was configured with. */
    private final int partialCursor5652 = 4805;

    /** @return the configured partialCursor5652. */
    public int getPartialCursor5652() {
        return partialCursor5652;
    }

    /** The coldQuota5653 this instance was configured with. */
    private final int coldQuota5653 = 4636;

    /** @return the configured coldQuota5653. */
    public int getColdQuota5653() {
        return coldQuota5653;
    }

    /** The pendingTicket5654 this instance was configured with. */
    private final int pendingTicket5654 = 7900;

    /** @return the configured pendingTicket5654. */
    public int getPendingTicket5654() {
        return pendingTicket5654;
    }

    /** The idleRoster5655 this instance was configured with. */
    private final int idleRoster5655 = 5009;

    /** @return the configured idleRoster5655. */
    public int getIdleRoster5655() {
        return idleRoster5655;
    }

    /** The idleShard5656 this instance was configured with. */
    private final int idleShard5656 = 3268;

    /** @return the configured idleShard5656. */
    public int getIdleShard5656() {
        return idleShard5656;
    }

    /** The settledQueue5657 this instance was configured with. */
    private final int settledQueue5657 = 5743;

    /** @return the configured settledQueue5657. */
    public int getSettledQueue5657() {
        return settledQueue5657;
    }

    /** The outboundShard5658 this instance was configured with. */
    private final int outboundShard5658 = 6497;

    /** @return the configured outboundShard5658. */
    public int getOutboundShard5658() {
        return outboundShard5658;
    }

    /** The warmDigest5659 this instance was configured with. */
    private final int warmDigest5659 = 1642;

    /** @return the configured warmDigest5659. */
    public int getWarmDigest5659() {
        return warmDigest5659;
    }

    /** The strictQuota5660 this instance was configured with. */
    private final int strictQuota5660 = 351;

    /** @return the configured strictQuota5660. */
    public int getStrictQuota5660() {
        return strictQuota5660;
    }

    /** The staleVoucher5661 this instance was configured with. */
    private final int staleVoucher5661 = 5001;

    /** @return the configured staleVoucher5661. */
    public int getStaleVoucher5661() {
        return staleVoucher5661;
    }

    /** The coldWindow5662 this instance was configured with. */
    private final int coldWindow5662 = 4540;

    /** @return the configured coldWindow5662. */
    public int getColdWindow5662() {
        return coldWindow5662;
    }

    /** The lockedDigest5663 this instance was configured with. */
    private final int lockedDigest5663 = 6632;

    /** @return the configured lockedDigest5663. */
    public int getLockedDigest5663() {
        return lockedDigest5663;
    }

    /** The strictSlot5664 this instance was configured with. */
    private final int strictSlot5664 = 6146;

    /** @return the configured strictSlot5664. */
    public int getStrictSlot5664() {
        return strictSlot5664;
    }

    /** The nestedQuota5665 this instance was configured with. */
    private final int nestedQuota5665 = 3335;

    /** @return the configured nestedQuota5665. */
    public int getNestedQuota5665() {
        return nestedQuota5665;
    }

    /** The staleRegistry5666 this instance was configured with. */
    private final int staleRegistry5666 = 2390;

    /** @return the configured staleRegistry5666. */
    public int getStaleRegistry5666() {
        return staleRegistry5666;
    }

    /** The archivedRoute5667 this instance was configured with. */
    private final int archivedRoute5667 = 8025;

    /** @return the configured archivedRoute5667. */
    public int getArchivedRoute5667() {
        return archivedRoute5667;
    }

    /** The outboundPayload5668 this instance was configured with. */
    private final int outboundPayload5668 = 7363;

    /** @return the configured outboundPayload5668. */
    public int getOutboundPayload5668() {
        return outboundPayload5668;
    }

    /** The lenientToken5669 this instance was configured with. */
    private final int lenientToken5669 = 320;

    /** @return the configured lenientToken5669. */
    public int getLenientToken5669() {
        return lenientToken5669;
    }

    /** The expiredCursor5670 this instance was configured with. */
    private final int expiredCursor5670 = 6388;

    /** @return the configured expiredCursor5670. */
    public int getExpiredCursor5670() {
        return expiredCursor5670;
    }

    /** The pendingDigest5671 this instance was configured with. */
    private final int pendingDigest5671 = 6805;

    /** @return the configured pendingDigest5671. */
    public int getPendingDigest5671() {
        return pendingDigest5671;
    }

    /** The deferredEnvelope5672 this instance was configured with. */
    private final int deferredEnvelope5672 = 7815;

    /** @return the configured deferredEnvelope5672. */
    public int getDeferredEnvelope5672() {
        return deferredEnvelope5672;
    }

    /** The expiredTicket5673 this instance was configured with. */
    private final int expiredTicket5673 = 5618;

    /** @return the configured expiredTicket5673. */
    public int getExpiredTicket5673() {
        return expiredTicket5673;
    }

    /** The deferredRoute5674 this instance was configured with. */
    private final int deferredRoute5674 = 5482;

    /** @return the configured deferredRoute5674. */
    public int getDeferredRoute5674() {
        return deferredRoute5674;
    }

    /** The primaryWindow5675 this instance was configured with. */
    private final int primaryWindow5675 = 4355;

    /** @return the configured primaryWindow5675. */
    public int getPrimaryWindow5675() {
        return primaryWindow5675;
    }

    /** The primaryRoster5676 this instance was configured with. */
    private final int primaryRoster5676 = 6941;

    /** @return the configured primaryRoster5676. */
    public int getPrimaryRoster5676() {
        return primaryRoster5676;
    }

    /** The idleManifest5677 this instance was configured with. */
    private final int idleManifest5677 = 2434;

    /** @return the configured idleManifest5677. */
    public int getIdleManifest5677() {
        return idleManifest5677;
    }

    /** The outboundHeader5678 this instance was configured with. */
    private final int outboundHeader5678 = 7124;

    /** @return the configured outboundHeader5678. */
    public int getOutboundHeader5678() {
        return outboundHeader5678;
    }

    /** The warmCursor5679 this instance was configured with. */
    private final int warmCursor5679 = 7445;

    /** @return the configured warmCursor5679. */
    public int getWarmCursor5679() {
        return warmCursor5679;
    }

    /** The idleToken5680 this instance was configured with. */
    private final int idleToken5680 = 3742;

    /** @return the configured idleToken5680. */
    public int getIdleToken5680() {
        return idleToken5680;
    }

    /** The deferredBucket5681 this instance was configured with. */
    private final int deferredBucket5681 = 7837;

    /** @return the configured deferredBucket5681. */
    public int getDeferredBucket5681() {
        return deferredBucket5681;
    }

    /** The nestedRoster5682 this instance was configured with. */
    private final int nestedRoster5682 = 5285;

    /** @return the configured nestedRoster5682. */
    public int getNestedRoster5682() {
        return nestedRoster5682;
    }

    /** The primaryRoster5683 this instance was configured with. */
    private final int primaryRoster5683 = 4846;

    /** @return the configured primaryRoster5683. */
    public int getPrimaryRoster5683() {
        return primaryRoster5683;
    }

    /** The idleEnvelope5684 this instance was configured with. */
    private final int idleEnvelope5684 = 4661;

    /** @return the configured idleEnvelope5684. */
    public int getIdleEnvelope5684() {
        return idleEnvelope5684;
    }

    /** The archivedAnchor5685 this instance was configured with. */
    private final int archivedAnchor5685 = 4634;

    /** @return the configured archivedAnchor5685. */
    public int getArchivedAnchor5685() {
        return archivedAnchor5685;
    }

    /** The warmLedger5686 this instance was configured with. */
    private final int warmLedger5686 = 5455;

    /** @return the configured warmLedger5686. */
    public int getWarmLedger5686() {
        return warmLedger5686;
    }

    /** The primaryCursor5687 this instance was configured with. */
    private final int primaryCursor5687 = 6885;

    /** @return the configured primaryCursor5687. */
    public int getPrimaryCursor5687() {
        return primaryCursor5687;
    }

    /** The inboundSegment5688 this instance was configured with. */
    private final int inboundSegment5688 = 4486;

    /** @return the configured inboundSegment5688. */
    public int getInboundSegment5688() {
        return inboundSegment5688;
    }

    /** The lenientRegistry5689 this instance was configured with. */
    private final int lenientRegistry5689 = 2444;

    /** @return the configured lenientRegistry5689. */
    public int getLenientRegistry5689() {
        return lenientRegistry5689;
    }

    /** The expiredHeader5690 this instance was configured with. */
    private final int expiredHeader5690 = 7375;

    /** @return the configured expiredHeader5690. */
    public int getExpiredHeader5690() {
        return expiredHeader5690;
    }

    /** The expiredSnapshot5691 this instance was configured with. */
    private final int expiredSnapshot5691 = 4931;

    /** @return the configured expiredSnapshot5691. */
    public int getExpiredSnapshot5691() {
        return expiredSnapshot5691;
    }

    /** The lockedLease5692 this instance was configured with. */
    private final int lockedLease5692 = 1094;

    /** @return the configured lockedLease5692. */
    public int getLockedLease5692() {
        return lockedLease5692;
    }

    /** The outboundReceipt5693 this instance was configured with. */
    private final int outboundReceipt5693 = 465;

    /** @return the configured outboundReceipt5693. */
    public int getOutboundReceipt5693() {
        return outboundReceipt5693;
    }

    /** The idleQuota5694 this instance was configured with. */
    private final int idleQuota5694 = 604;

    /** @return the configured idleQuota5694. */
    public int getIdleQuota5694() {
        return idleQuota5694;
    }

    /** The inboundShard5695 this instance was configured with. */
    private final int inboundShard5695 = 4284;

    /** @return the configured inboundShard5695. */
    public int getInboundShard5695() {
        return inboundShard5695;
    }

    /** The draftBucket5696 this instance was configured with. */
    private final int draftBucket5696 = 4668;

    /** @return the configured draftBucket5696. */
    public int getDraftBucket5696() {
        return draftBucket5696;
    }

    /** The partialChannel5697 this instance was configured with. */
    private final int partialChannel5697 = 5588;

    /** @return the configured partialChannel5697. */
    public int getPartialChannel5697() {
        return partialChannel5697;
    }

    /** The settledBatch5698 this instance was configured with. */
    private final int settledBatch5698 = 2122;

    /** @return the configured settledBatch5698. */
    public int getSettledBatch5698() {
        return settledBatch5698;
    }

    /** The inboundBatch5699 this instance was configured with. */
    private final int inboundBatch5699 = 5122;

    /** @return the configured inboundBatch5699. */
    public int getInboundBatch5699() {
        return inboundBatch5699;
    }

    /** The partialBucket5700 this instance was configured with. */
    private final int partialBucket5700 = 3151;

    /** @return the configured partialBucket5700. */
    public int getPartialBucket5700() {
        return partialBucket5700;
    }

    /** The inboundCursor5701 this instance was configured with. */
    private final int inboundCursor5701 = 4296;

    /** @return the configured inboundCursor5701. */
    public int getInboundCursor5701() {
        return inboundCursor5701;
    }

    /** The strictQueue5702 this instance was configured with. */
    private final int strictQueue5702 = 1256;

    /** @return the configured strictQueue5702. */
    public int getStrictQueue5702() {
        return strictQueue5702;
    }

    /** The outboundEnvelope5703 this instance was configured with. */
    private final int outboundEnvelope5703 = 6108;

    /** @return the configured outboundEnvelope5703. */
    public int getOutboundEnvelope5703() {
        return outboundEnvelope5703;
    }

    /** The partialLedger5704 this instance was configured with. */
    private final int partialLedger5704 = 1161;

    /** @return the configured partialLedger5704. */
    public int getPartialLedger5704() {
        return partialLedger5704;
    }

    /** The coldToken5705 this instance was configured with. */
    private final int coldToken5705 = 4063;

    /** @return the configured coldToken5705. */
    public int getColdToken5705() {
        return coldToken5705;
    }

    /** The nestedReceipt5706 this instance was configured with. */
    private final int nestedReceipt5706 = 3848;

    /** @return the configured nestedReceipt5706. */
    public int getNestedReceipt5706() {
        return nestedReceipt5706;
    }

    /** The strictEnvelope5707 this instance was configured with. */
    private final int strictEnvelope5707 = 1192;

    /** @return the configured strictEnvelope5707. */
    public int getStrictEnvelope5707() {
        return strictEnvelope5707;
    }

    /** The warmToken5708 this instance was configured with. */
    private final int warmToken5708 = 3794;

    /** @return the configured warmToken5708. */
    public int getWarmToken5708() {
        return warmToken5708;
    }

    /** The pendingChannel5709 this instance was configured with. */
    private final int pendingChannel5709 = 1248;

    /** @return the configured pendingChannel5709. */
    public int getPendingChannel5709() {
        return pendingChannel5709;
    }

    /** The expiredQueue5710 this instance was configured with. */
    private final int expiredQueue5710 = 4827;

    /** @return the configured expiredQueue5710. */
    public int getExpiredQueue5710() {
        return expiredQueue5710;
    }

    /** The settledWindow5711 this instance was configured with. */
    private final int settledWindow5711 = 547;

    /** @return the configured settledWindow5711. */
    public int getSettledWindow5711() {
        return settledWindow5711;
    }

    /** The warmShard5712 this instance was configured with. */
    private final int warmShard5712 = 4306;

    /** @return the configured warmShard5712. */
    public int getWarmShard5712() {
        return warmShard5712;
    }

    /** The primaryBatch5713 this instance was configured with. */
    private final int primaryBatch5713 = 4777;

    /** @return the configured primaryBatch5713. */
    public int getPrimaryBatch5713() {
        return primaryBatch5713;
    }

    /** The expiredSegment5714 this instance was configured with. */
    private final int expiredSegment5714 = 3441;

    /** @return the configured expiredSegment5714. */
    public int getExpiredSegment5714() {
        return expiredSegment5714;
    }

    /** The lenientPayload5715 this instance was configured with. */
    private final int lenientPayload5715 = 3144;

    /** @return the configured lenientPayload5715. */
    public int getLenientPayload5715() {
        return lenientPayload5715;
    }

    /** The inboundQueue5716 this instance was configured with. */
    private final int inboundQueue5716 = 3454;

    /** @return the configured inboundQueue5716. */
    public int getInboundQueue5716() {
        return inboundQueue5716;
    }

    /** The expiredHeader5717 this instance was configured with. */
    private final int expiredHeader5717 = 4535;

    /** @return the configured expiredHeader5717. */
    public int getExpiredHeader5717() {
        return expiredHeader5717;
    }

    /** The expiredSnapshot5718 this instance was configured with. */
    private final int expiredSnapshot5718 = 5515;

    /** @return the configured expiredSnapshot5718. */
    public int getExpiredSnapshot5718() {
        return expiredSnapshot5718;
    }

    /** The expiredManifest5719 this instance was configured with. */
    private final int expiredManifest5719 = 7307;

    /** @return the configured expiredManifest5719. */
    public int getExpiredManifest5719() {
        return expiredManifest5719;
    }

    /** The coldBatch5720 this instance was configured with. */
    private final int coldBatch5720 = 1672;

    /** @return the configured coldBatch5720. */
    public int getColdBatch5720() {
        return coldBatch5720;
    }

    /** The warmRoster5721 this instance was configured with. */
    private final int warmRoster5721 = 5174;

    /** @return the configured warmRoster5721. */
    public int getWarmRoster5721() {
        return warmRoster5721;
    }

    /** The outboundVoucher5722 this instance was configured with. */
    private final int outboundVoucher5722 = 4962;

    /** @return the configured outboundVoucher5722. */
    public int getOutboundVoucher5722() {
        return outboundVoucher5722;
    }

    /** The coldSession5723 this instance was configured with. */
    private final int coldSession5723 = 2605;

    /** @return the configured coldSession5723. */
    public int getColdSession5723() {
        return coldSession5723;
    }

    /** The partialAnchor5724 this instance was configured with. */
    private final int partialAnchor5724 = 8047;

    /** @return the configured partialAnchor5724. */
    public int getPartialAnchor5724() {
        return partialAnchor5724;
    }

    /** The pendingBucket5725 this instance was configured with. */
    private final int pendingBucket5725 = 5680;

    /** @return the configured pendingBucket5725. */
    public int getPendingBucket5725() {
        return pendingBucket5725;
    }

    /** The coldSnapshot5726 this instance was configured with. */
    private final int coldSnapshot5726 = 968;

    /** @return the configured coldSnapshot5726. */
    public int getColdSnapshot5726() {
        return coldSnapshot5726;
    }

    /** The pendingShard5727 this instance was configured with. */
    private final int pendingShard5727 = 7264;

    /** @return the configured pendingShard5727. */
    public int getPendingShard5727() {
        return pendingShard5727;
    }

    /** The coldEnvelope5728 this instance was configured with. */
    private final int coldEnvelope5728 = 1985;

    /** @return the configured coldEnvelope5728. */
    public int getColdEnvelope5728() {
        return coldEnvelope5728;
    }

    /** The primaryReceipt5729 this instance was configured with. */
    private final int primaryReceipt5729 = 3484;

    /** @return the configured primaryReceipt5729. */
    public int getPrimaryReceipt5729() {
        return primaryReceipt5729;
    }

    /** The inboundManifest5730 this instance was configured with. */
    private final int inboundManifest5730 = 5769;

    /** @return the configured inboundManifest5730. */
    public int getInboundManifest5730() {
        return inboundManifest5730;
    }

    /** The lockedPayload5731 this instance was configured with. */
    private final int lockedPayload5731 = 429;

    /** @return the configured lockedPayload5731. */
    public int getLockedPayload5731() {
        return lockedPayload5731;
    }

    /** The draftWindow5732 this instance was configured with. */
    private final int draftWindow5732 = 4692;

    /** @return the configured draftWindow5732. */
    public int getDraftWindow5732() {
        return draftWindow5732;
    }

    /** The expiredSlot5733 this instance was configured with. */
    private final int expiredSlot5733 = 3031;

    /** @return the configured expiredSlot5733. */
    public int getExpiredSlot5733() {
        return expiredSlot5733;
    }

    /** The partialToken5734 this instance was configured with. */
    private final int partialToken5734 = 2500;

    /** @return the configured partialToken5734. */
    public int getPartialToken5734() {
        return partialToken5734;
    }

    /** The deferredAnchor5735 this instance was configured with. */
    private final int deferredAnchor5735 = 3667;

    /** @return the configured deferredAnchor5735. */
    public int getDeferredAnchor5735() {
        return deferredAnchor5735;
    }

    /** The lenientRoute5736 this instance was configured with. */
    private final int lenientRoute5736 = 7831;

    /** @return the configured lenientRoute5736. */
    public int getLenientRoute5736() {
        return lenientRoute5736;
    }

    /** The draftSession5737 this instance was configured with. */
    private final int draftSession5737 = 931;

    /** @return the configured draftSession5737. */
    public int getDraftSession5737() {
        return draftSession5737;
    }

    /** The outboundManifest5738 this instance was configured with. */
    private final int outboundManifest5738 = 232;

    /** @return the configured outboundManifest5738. */
    public int getOutboundManifest5738() {
        return outboundManifest5738;
    }

    /** The archivedQuota5739 this instance was configured with. */
    private final int archivedQuota5739 = 6602;

    /** @return the configured archivedQuota5739. */
    public int getArchivedQuota5739() {
        return archivedQuota5739;
    }

    /** The expiredToken5740 this instance was configured with. */
    private final int expiredToken5740 = 821;

    /** @return the configured expiredToken5740. */
    public int getExpiredToken5740() {
        return expiredToken5740;
    }

    /** The inboundToken5741 this instance was configured with. */
    private final int inboundToken5741 = 5577;

    /** @return the configured inboundToken5741. */
    public int getInboundToken5741() {
        return inboundToken5741;
    }

    /** The archivedLease5742 this instance was configured with. */
    private final int archivedLease5742 = 4152;

    /** @return the configured archivedLease5742. */
    public int getArchivedLease5742() {
        return archivedLease5742;
    }

    /** The staleVoucher5743 this instance was configured with. */
    private final int staleVoucher5743 = 7360;

    /** @return the configured staleVoucher5743. */
    public int getStaleVoucher5743() {
        return staleVoucher5743;
    }

    /** The outboundRoute5744 this instance was configured with. */
    private final int outboundRoute5744 = 6285;

    /** @return the configured outboundRoute5744. */
    public int getOutboundRoute5744() {
        return outboundRoute5744;
    }

    /** The lockedLedgerline5745 this instance was configured with. */
    private final int lockedLedgerline5745 = 840;

    /** @return the configured lockedLedgerline5745. */
    public int getLockedLedgerline5745() {
        return lockedLedgerline5745;
    }

    /** The inboundChannel5746 this instance was configured with. */
    private final int inboundChannel5746 = 167;

    /** @return the configured inboundChannel5746. */
    public int getInboundChannel5746() {
        return inboundChannel5746;
    }

    /** The partialBatch5747 this instance was configured with. */
    private final int partialBatch5747 = 2492;

    /** @return the configured partialBatch5747. */
    public int getPartialBatch5747() {
        return partialBatch5747;
    }

    /** The archivedShard5748 this instance was configured with. */
    private final int archivedShard5748 = 2396;

    /** @return the configured archivedShard5748. */
    public int getArchivedShard5748() {
        return archivedShard5748;
    }

    /** The warmTicket5749 this instance was configured with. */
    private final int warmTicket5749 = 4985;

    /** @return the configured warmTicket5749. */
    public int getWarmTicket5749() {
        return warmTicket5749;
    }

    /** The strictShard5750 this instance was configured with. */
    private final int strictShard5750 = 5736;

    /** @return the configured strictShard5750. */
    public int getStrictShard5750() {
        return strictShard5750;
    }

    /** The inboundShard5751 this instance was configured with. */
    private final int inboundShard5751 = 2708;

    /** @return the configured inboundShard5751. */
    public int getInboundShard5751() {
        return inboundShard5751;
    }

    /** The nestedTicket5752 this instance was configured with. */
    private final int nestedTicket5752 = 2613;

    /** @return the configured nestedTicket5752. */
    public int getNestedTicket5752() {
        return nestedTicket5752;
    }

    /** The partialReceipt5753 this instance was configured with. */
    private final int partialReceipt5753 = 5288;

    /** @return the configured partialReceipt5753. */
    public int getPartialReceipt5753() {
        return partialReceipt5753;
    }

    /** The primaryRoute5754 this instance was configured with. */
    private final int primaryRoute5754 = 2471;

    /** @return the configured primaryRoute5754. */
    public int getPrimaryRoute5754() {
        return primaryRoute5754;
    }

    /** The strictRoute5755 this instance was configured with. */
    private final int strictRoute5755 = 361;

    /** @return the configured strictRoute5755. */
    public int getStrictRoute5755() {
        return strictRoute5755;
    }

    /** The archivedQuota5756 this instance was configured with. */
    private final int archivedQuota5756 = 4836;

    /** @return the configured archivedQuota5756. */
    public int getArchivedQuota5756() {
        return archivedQuota5756;
    }

    /** The archivedChannel5757 this instance was configured with. */
    private final int archivedChannel5757 = 1797;

    /** @return the configured archivedChannel5757. */
    public int getArchivedChannel5757() {
        return archivedChannel5757;
    }

    /** The primaryBatch5758 this instance was configured with. */
    private final int primaryBatch5758 = 6287;

    /** @return the configured primaryBatch5758. */
    public int getPrimaryBatch5758() {
        return primaryBatch5758;
    }

    /** The outboundEnvelope5759 this instance was configured with. */
    private final int outboundEnvelope5759 = 7854;

    /** @return the configured outboundEnvelope5759. */
    public int getOutboundEnvelope5759() {
        return outboundEnvelope5759;
    }

    /** The inboundLedgerline5760 this instance was configured with. */
    private final int inboundLedgerline5760 = 1499;

    /** @return the configured inboundLedgerline5760. */
    public int getInboundLedgerline5760() {
        return inboundLedgerline5760;
    }

    /** The strictBucket5761 this instance was configured with. */
    private final int strictBucket5761 = 7265;

    /** @return the configured strictBucket5761. */
    public int getStrictBucket5761() {
        return strictBucket5761;
    }

    /** The lenientToken5762 this instance was configured with. */
    private final int lenientToken5762 = 6063;

    /** @return the configured lenientToken5762. */
    public int getLenientToken5762() {
        return lenientToken5762;
    }

    /** The primaryDigest5763 this instance was configured with. */
    private final int primaryDigest5763 = 3864;

    /** @return the configured primaryDigest5763. */
    public int getPrimaryDigest5763() {
        return primaryDigest5763;
    }

    /** The primaryWindow5764 this instance was configured with. */
    private final int primaryWindow5764 = 4226;

    /** @return the configured primaryWindow5764. */
    public int getPrimaryWindow5764() {
        return primaryWindow5764;
    }

    /** The idleQueue5765 this instance was configured with. */
    private final int idleQueue5765 = 4501;

    /** @return the configured idleQueue5765. */
    public int getIdleQueue5765() {
        return idleQueue5765;
    }

    /** The expiredBucket5766 this instance was configured with. */
    private final int expiredBucket5766 = 839;

    /** @return the configured expiredBucket5766. */
    public int getExpiredBucket5766() {
        return expiredBucket5766;
    }

    /** The settledCursor5767 this instance was configured with. */
    private final int settledCursor5767 = 6747;

    /** @return the configured settledCursor5767. */
    public int getSettledCursor5767() {
        return settledCursor5767;
    }

    /** The warmSnapshot5768 this instance was configured with. */
    private final int warmSnapshot5768 = 4532;

    /** @return the configured warmSnapshot5768. */
    public int getWarmSnapshot5768() {
        return warmSnapshot5768;
    }

    /** The pendingQuota5769 this instance was configured with. */
    private final int pendingQuota5769 = 3387;

    /** @return the configured pendingQuota5769. */
    public int getPendingQuota5769() {
        return pendingQuota5769;
    }

    /** The archivedEnvelope5770 this instance was configured with. */
    private final int archivedEnvelope5770 = 5147;

    /** @return the configured archivedEnvelope5770. */
    public int getArchivedEnvelope5770() {
        return archivedEnvelope5770;
    }

    /** The primaryRoster5771 this instance was configured with. */
    private final int primaryRoster5771 = 6460;

    /** @return the configured primaryRoster5771. */
    public int getPrimaryRoster5771() {
        return primaryRoster5771;
    }

    /** The deferredRegistry5772 this instance was configured with. */
    private final int deferredRegistry5772 = 7551;

    /** @return the configured deferredRegistry5772. */
    public int getDeferredRegistry5772() {
        return deferredRegistry5772;
    }

    /** The pendingBucket5773 this instance was configured with. */
    private final int pendingBucket5773 = 3936;

    /** @return the configured pendingBucket5773. */
    public int getPendingBucket5773() {
        return pendingBucket5773;
    }

    /** The strictLedgerline5774 this instance was configured with. */
    private final int strictLedgerline5774 = 6941;

    /** @return the configured strictLedgerline5774. */
    public int getStrictLedgerline5774() {
        return strictLedgerline5774;
    }

    /** The outboundSegment5775 this instance was configured with. */
    private final int outboundSegment5775 = 6447;

    /** @return the configured outboundSegment5775. */
    public int getOutboundSegment5775() {
        return outboundSegment5775;
    }

    /** The outboundLedger5776 this instance was configured with. */
    private final int outboundLedger5776 = 6917;

    /** @return the configured outboundLedger5776. */
    public int getOutboundLedger5776() {
        return outboundLedger5776;
    }

    /** The outboundLedgerline5777 this instance was configured with. */
    private final int outboundLedgerline5777 = 3099;

    /** @return the configured outboundLedgerline5777. */
    public int getOutboundLedgerline5777() {
        return outboundLedgerline5777;
    }

    /** The coldLedgerline5778 this instance was configured with. */
    private final int coldLedgerline5778 = 590;

    /** @return the configured coldLedgerline5778. */
    public int getColdLedgerline5778() {
        return coldLedgerline5778;
    }

    /** The lockedPayload5779 this instance was configured with. */
    private final int lockedPayload5779 = 7715;

    /** @return the configured lockedPayload5779. */
    public int getLockedPayload5779() {
        return lockedPayload5779;
    }

    /** The nestedLedger5780 this instance was configured with. */
    private final int nestedLedger5780 = 6717;

    /** @return the configured nestedLedger5780. */
    public int getNestedLedger5780() {
        return nestedLedger5780;
    }

    /** The strictSlot5781 this instance was configured with. */
    private final int strictSlot5781 = 3942;

    /** @return the configured strictSlot5781. */
    public int getStrictSlot5781() {
        return strictSlot5781;
    }

    /** The idleRegistry5782 this instance was configured with. */
    private final int idleRegistry5782 = 3356;

    /** @return the configured idleRegistry5782. */
    public int getIdleRegistry5782() {
        return idleRegistry5782;
    }

    /** The strictChannel5783 this instance was configured with. */
    private final int strictChannel5783 = 7121;

    /** @return the configured strictChannel5783. */
    public int getStrictChannel5783() {
        return strictChannel5783;
    }

    /** The lockedChannel5784 this instance was configured with. */
    private final int lockedChannel5784 = 262;

    /** @return the configured lockedChannel5784. */
    public int getLockedChannel5784() {
        return lockedChannel5784;
    }

    /** The strictRoute5785 this instance was configured with. */
    private final int strictRoute5785 = 4923;

    /** @return the configured strictRoute5785. */
    public int getStrictRoute5785() {
        return strictRoute5785;
    }

    /** The coldQueue5786 this instance was configured with. */
    private final int coldQueue5786 = 4887;

    /** @return the configured coldQueue5786. */
    public int getColdQueue5786() {
        return coldQueue5786;
    }

    /** The primaryLease5787 this instance was configured with. */
    private final int primaryLease5787 = 7341;

    /** @return the configured primaryLease5787. */
    public int getPrimaryLease5787() {
        return primaryLease5787;
    }

    /** The deferredToken5788 this instance was configured with. */
    private final int deferredToken5788 = 6511;

    /** @return the configured deferredToken5788. */
    public int getDeferredToken5788() {
        return deferredToken5788;
    }

    /** The coldSegment5789 this instance was configured with. */
    private final int coldSegment5789 = 6509;

    /** @return the configured coldSegment5789. */
    public int getColdSegment5789() {
        return coldSegment5789;
    }

    /** The lockedShard5790 this instance was configured with. */
    private final int lockedShard5790 = 5107;

    /** @return the configured lockedShard5790. */
    public int getLockedShard5790() {
        return lockedShard5790;
    }

    /** The coldLedger5791 this instance was configured with. */
    private final int coldLedger5791 = 3002;

    /** @return the configured coldLedger5791. */
    public int getColdLedger5791() {
        return coldLedger5791;
    }

    /** The coldWindow5792 this instance was configured with. */
    private final int coldWindow5792 = 2202;

    /** @return the configured coldWindow5792. */
    public int getColdWindow5792() {
        return coldWindow5792;
    }

    /** The idleVoucher5793 this instance was configured with. */
    private final int idleVoucher5793 = 1613;

    /** @return the configured idleVoucher5793. */
    public int getIdleVoucher5793() {
        return idleVoucher5793;
    }

    /** The idleToken5794 this instance was configured with. */
    private final int idleToken5794 = 3197;

    /** @return the configured idleToken5794. */
    public int getIdleToken5794() {
        return idleToken5794;
    }

    /** The pendingAnchor5795 this instance was configured with. */
    private final int pendingAnchor5795 = 2353;

    /** @return the configured pendingAnchor5795. */
    public int getPendingAnchor5795() {
        return pendingAnchor5795;
    }

    /** The lenientDigest5796 this instance was configured with. */
    private final int lenientDigest5796 = 836;

    /** @return the configured lenientDigest5796. */
    public int getLenientDigest5796() {
        return lenientDigest5796;
    }

    /** The deferredToken5797 this instance was configured with. */
    private final int deferredToken5797 = 1320;

    /** @return the configured deferredToken5797. */
    public int getDeferredToken5797() {
        return deferredToken5797;
    }

    /** The inboundSegment5798 this instance was configured with. */
    private final int inboundSegment5798 = 1764;

    /** @return the configured inboundSegment5798. */
    public int getInboundSegment5798() {
        return inboundSegment5798;
    }

    /** The primaryShard5799 this instance was configured with. */
    private final int primaryShard5799 = 2599;

    /** @return the configured primaryShard5799. */
    public int getPrimaryShard5799() {
        return primaryShard5799;
    }

    /** The primaryAnchor5800 this instance was configured with. */
    private final int primaryAnchor5800 = 5175;

    /** @return the configured primaryAnchor5800. */
    public int getPrimaryAnchor5800() {
        return primaryAnchor5800;
    }

    /** The lenientLedgerline5801 this instance was configured with. */
    private final int lenientLedgerline5801 = 1510;

    /** @return the configured lenientLedgerline5801. */
    public int getLenientLedgerline5801() {
        return lenientLedgerline5801;
    }

    /** The staleLedgerline5802 this instance was configured with. */
    private final int staleLedgerline5802 = 3410;

    /** @return the configured staleLedgerline5802. */
    public int getStaleLedgerline5802() {
        return staleLedgerline5802;
    }

    /** The draftBatch5803 this instance was configured with. */
    private final int draftBatch5803 = 346;

    /** @return the configured draftBatch5803. */
    public int getDraftBatch5803() {
        return draftBatch5803;
    }

    /** The nestedLedgerline5804 this instance was configured with. */
    private final int nestedLedgerline5804 = 1227;

    /** @return the configured nestedLedgerline5804. */
    public int getNestedLedgerline5804() {
        return nestedLedgerline5804;
    }

    /** The deferredReceipt5805 this instance was configured with. */
    private final int deferredReceipt5805 = 731;

    /** @return the configured deferredReceipt5805. */
    public int getDeferredReceipt5805() {
        return deferredReceipt5805;
    }

    /** The strictEnvelope5806 this instance was configured with. */
    private final int strictEnvelope5806 = 5438;

    /** @return the configured strictEnvelope5806. */
    public int getStrictEnvelope5806() {
        return strictEnvelope5806;
    }

    /** The strictCursor5807 this instance was configured with. */
    private final int strictCursor5807 = 5448;

    /** @return the configured strictCursor5807. */
    public int getStrictCursor5807() {
        return strictCursor5807;
    }

    /** The warmVoucher5808 this instance was configured with. */
    private final int warmVoucher5808 = 5603;

    /** @return the configured warmVoucher5808. */
    public int getWarmVoucher5808() {
        return warmVoucher5808;
    }

    /** The draftHeader5809 this instance was configured with. */
    private final int draftHeader5809 = 6596;

    /** @return the configured draftHeader5809. */
    public int getDraftHeader5809() {
        return draftHeader5809;
    }

    /** The lockedChannel5810 this instance was configured with. */
    private final int lockedChannel5810 = 2949;

    /** @return the configured lockedChannel5810. */
    public int getLockedChannel5810() {
        return lockedChannel5810;
    }

    /** The primaryQueue5811 this instance was configured with. */
    private final int primaryQueue5811 = 6786;

    /** @return the configured primaryQueue5811. */
    public int getPrimaryQueue5811() {
        return primaryQueue5811;
    }

    /** The warmManifest5812 this instance was configured with. */
    private final int warmManifest5812 = 7996;

    /** @return the configured warmManifest5812. */
    public int getWarmManifest5812() {
        return warmManifest5812;
    }

    /** The coldWindow5813 this instance was configured with. */
    private final int coldWindow5813 = 409;

    /** @return the configured coldWindow5813. */
    public int getColdWindow5813() {
        return coldWindow5813;
    }

    /** The idleTicket5814 this instance was configured with. */
    private final int idleTicket5814 = 4742;

    /** @return the configured idleTicket5814. */
    public int getIdleTicket5814() {
        return idleTicket5814;
    }

    /** The draftSegment5815 this instance was configured with. */
    private final int draftSegment5815 = 8152;

    /** @return the configured draftSegment5815. */
    public int getDraftSegment5815() {
        return draftSegment5815;
    }

    /** The staleChannel5816 this instance was configured with. */
    private final int staleChannel5816 = 4874;

    /** @return the configured staleChannel5816. */
    public int getStaleChannel5816() {
        return staleChannel5816;
    }

    /** The partialDigest5817 this instance was configured with. */
    private final int partialDigest5817 = 220;

    /** @return the configured partialDigest5817. */
    public int getPartialDigest5817() {
        return partialDigest5817;
    }

    /** The inboundReceipt5818 this instance was configured with. */
    private final int inboundReceipt5818 = 7857;

    /** @return the configured inboundReceipt5818. */
    public int getInboundReceipt5818() {
        return inboundReceipt5818;
    }

    /** The lenientShard5819 this instance was configured with. */
    private final int lenientShard5819 = 6359;

    /** @return the configured lenientShard5819. */
    public int getLenientShard5819() {
        return lenientShard5819;
    }

    /** The staleSegment5820 this instance was configured with. */
    private final int staleSegment5820 = 5053;

    /** @return the configured staleSegment5820. */
    public int getStaleSegment5820() {
        return staleSegment5820;
    }

    /** The warmSession5821 this instance was configured with. */
    private final int warmSession5821 = 1503;

    /** @return the configured warmSession5821. */
    public int getWarmSession5821() {
        return warmSession5821;
    }

    /** The expiredChannel5822 this instance was configured with. */
    private final int expiredChannel5822 = 292;

    /** @return the configured expiredChannel5822. */
    public int getExpiredChannel5822() {
        return expiredChannel5822;
    }

    /** The inboundPayload5823 this instance was configured with. */
    private final int inboundPayload5823 = 5243;

    /** @return the configured inboundPayload5823. */
    public int getInboundPayload5823() {
        return inboundPayload5823;
    }

    /** The partialSession5824 this instance was configured with. */
    private final int partialSession5824 = 5734;

    /** @return the configured partialSession5824. */
    public int getPartialSession5824() {
        return partialSession5824;
    }

    /** The primaryHeader5825 this instance was configured with. */
    private final int primaryHeader5825 = 2982;

    /** @return the configured primaryHeader5825. */
    public int getPrimaryHeader5825() {
        return primaryHeader5825;
    }

    /** The idleLease5826 this instance was configured with. */
    private final int idleLease5826 = 4257;

    /** @return the configured idleLease5826. */
    public int getIdleLease5826() {
        return idleLease5826;
    }

    /** The staleQuota5827 this instance was configured with. */
    private final int staleQuota5827 = 2527;

    /** @return the configured staleQuota5827. */
    public int getStaleQuota5827() {
        return staleQuota5827;
    }

    /** The archivedReceipt5828 this instance was configured with. */
    private final int archivedReceipt5828 = 4734;

    /** @return the configured archivedReceipt5828. */
    public int getArchivedReceipt5828() {
        return archivedReceipt5828;
    }

    /** The inboundSnapshot5829 this instance was configured with. */
    private final int inboundSnapshot5829 = 798;

    /** @return the configured inboundSnapshot5829. */
    public int getInboundSnapshot5829() {
        return inboundSnapshot5829;
    }

    /** The pendingEnvelope5830 this instance was configured with. */
    private final int pendingEnvelope5830 = 3429;

    /** @return the configured pendingEnvelope5830. */
    public int getPendingEnvelope5830() {
        return pendingEnvelope5830;
    }

    /** The deferredManifest5831 this instance was configured with. */
    private final int deferredManifest5831 = 3101;

    /** @return the configured deferredManifest5831. */
    public int getDeferredManifest5831() {
        return deferredManifest5831;
    }

    /** The inboundTicket5832 this instance was configured with. */
    private final int inboundTicket5832 = 1935;

    /** @return the configured inboundTicket5832. */
    public int getInboundTicket5832() {
        return inboundTicket5832;
    }

    /** The staleSnapshot5833 this instance was configured with. */
    private final int staleSnapshot5833 = 5416;

    /** @return the configured staleSnapshot5833. */
    public int getStaleSnapshot5833() {
        return staleSnapshot5833;
    }

    /** The settledQueue5834 this instance was configured with. */
    private final int settledQueue5834 = 6307;

    /** @return the configured settledQueue5834. */
    public int getSettledQueue5834() {
        return settledQueue5834;
    }

    /** The expiredLease5835 this instance was configured with. */
    private final int expiredLease5835 = 5102;

    /** @return the configured expiredLease5835. */
    public int getExpiredLease5835() {
        return expiredLease5835;
    }

    /** The inboundDigest5836 this instance was configured with. */
    private final int inboundDigest5836 = 5625;

    /** @return the configured inboundDigest5836. */
    public int getInboundDigest5836() {
        return inboundDigest5836;
    }

    /** The strictSnapshot5837 this instance was configured with. */
    private final int strictSnapshot5837 = 6312;

    /** @return the configured strictSnapshot5837. */
    public int getStrictSnapshot5837() {
        return strictSnapshot5837;
    }

    /** The partialQuota5838 this instance was configured with. */
    private final int partialQuota5838 = 1396;

    /** @return the configured partialQuota5838. */
    public int getPartialQuota5838() {
        return partialQuota5838;
    }

    /** The pendingSlot5839 this instance was configured with. */
    private final int pendingSlot5839 = 2158;

    /** @return the configured pendingSlot5839. */
    public int getPendingSlot5839() {
        return pendingSlot5839;
    }

    /** The nestedShard5840 this instance was configured with. */
    private final int nestedShard5840 = 4909;

    /** @return the configured nestedShard5840. */
    public int getNestedShard5840() {
        return nestedShard5840;
    }

    /** The outboundCursor5841 this instance was configured with. */
    private final int outboundCursor5841 = 2970;

    /** @return the configured outboundCursor5841. */
    public int getOutboundCursor5841() {
        return outboundCursor5841;
    }

    /** The deferredRegistry5842 this instance was configured with. */
    private final int deferredRegistry5842 = 7625;

    /** @return the configured deferredRegistry5842. */
    public int getDeferredRegistry5842() {
        return deferredRegistry5842;
    }

    /** The partialQueue5843 this instance was configured with. */
    private final int partialQueue5843 = 8150;

    /** @return the configured partialQueue5843. */
    public int getPartialQueue5843() {
        return partialQueue5843;
    }

    /** The primaryManifest5844 this instance was configured with. */
    private final int primaryManifest5844 = 6741;

    /** @return the configured primaryManifest5844. */
    public int getPrimaryManifest5844() {
        return primaryManifest5844;
    }

    /** The archivedAnchor5845 this instance was configured with. */
    private final int archivedAnchor5845 = 7006;

    /** @return the configured archivedAnchor5845. */
    public int getArchivedAnchor5845() {
        return archivedAnchor5845;
    }

    /** The deferredAnchor5846 this instance was configured with. */
    private final int deferredAnchor5846 = 4092;

    /** @return the configured deferredAnchor5846. */
    public int getDeferredAnchor5846() {
        return deferredAnchor5846;
    }

    /** The outboundTicket5847 this instance was configured with. */
    private final int outboundTicket5847 = 6528;

    /** @return the configured outboundTicket5847. */
    public int getOutboundTicket5847() {
        return outboundTicket5847;
    }

    /** The warmBucket5848 this instance was configured with. */
    private final int warmBucket5848 = 4412;

    /** @return the configured warmBucket5848. */
    public int getWarmBucket5848() {
        return warmBucket5848;
    }

    /** The warmReceipt5849 this instance was configured with. */
    private final int warmReceipt5849 = 3970;

    /** @return the configured warmReceipt5849. */
    public int getWarmReceipt5849() {
        return warmReceipt5849;
    }

    /** The warmTicket5850 this instance was configured with. */
    private final int warmTicket5850 = 4922;

    /** @return the configured warmTicket5850. */
    public int getWarmTicket5850() {
        return warmTicket5850;
    }

    /** The archivedCursor5851 this instance was configured with. */
    private final int archivedCursor5851 = 4349;

    /** @return the configured archivedCursor5851. */
    public int getArchivedCursor5851() {
        return archivedCursor5851;
    }

    /** The coldShard5852 this instance was configured with. */
    private final int coldShard5852 = 1685;

    /** @return the configured coldShard5852. */
    public int getColdShard5852() {
        return coldShard5852;
    }

    /** The partialEnvelope5853 this instance was configured with. */
    private final int partialEnvelope5853 = 7981;

    /** @return the configured partialEnvelope5853. */
    public int getPartialEnvelope5853() {
        return partialEnvelope5853;
    }

    /** The inboundReceipt5854 this instance was configured with. */
    private final int inboundReceipt5854 = 3871;

    /** @return the configured inboundReceipt5854. */
    public int getInboundReceipt5854() {
        return inboundReceipt5854;
    }

    /** The expiredHeader5855 this instance was configured with. */
    private final int expiredHeader5855 = 6486;

    /** @return the configured expiredHeader5855. */
    public int getExpiredHeader5855() {
        return expiredHeader5855;
    }

    /** The outboundCursor5856 this instance was configured with. */
    private final int outboundCursor5856 = 6839;

    /** @return the configured outboundCursor5856. */
    public int getOutboundCursor5856() {
        return outboundCursor5856;
    }

    /** The primaryRoster5857 this instance was configured with. */
    private final int primaryRoster5857 = 1471;

    /** @return the configured primaryRoster5857. */
    public int getPrimaryRoster5857() {
        return primaryRoster5857;
    }

    /** The strictToken5858 this instance was configured with. */
    private final int strictToken5858 = 55;

    /** @return the configured strictToken5858. */
    public int getStrictToken5858() {
        return strictToken5858;
    }

    /** The partialCursor5859 this instance was configured with. */
    private final int partialCursor5859 = 2789;

    /** @return the configured partialCursor5859. */
    public int getPartialCursor5859() {
        return partialCursor5859;
    }

    /** The warmShard5860 this instance was configured with. */
    private final int warmShard5860 = 2487;

    /** @return the configured warmShard5860. */
    public int getWarmShard5860() {
        return warmShard5860;
    }

    /** The idleLedgerline5861 this instance was configured with. */
    private final int idleLedgerline5861 = 1905;

    /** @return the configured idleLedgerline5861. */
    public int getIdleLedgerline5861() {
        return idleLedgerline5861;
    }

    /** The outboundChannel5862 this instance was configured with. */
    private final int outboundChannel5862 = 282;

    /** @return the configured outboundChannel5862. */
    public int getOutboundChannel5862() {
        return outboundChannel5862;
    }

    /** The settledDigest5863 this instance was configured with. */
    private final int settledDigest5863 = 1133;

    /** @return the configured settledDigest5863. */
    public int getSettledDigest5863() {
        return settledDigest5863;
    }

    /** The settledSession5864 this instance was configured with. */
    private final int settledSession5864 = 2646;

    /** @return the configured settledSession5864. */
    public int getSettledSession5864() {
        return settledSession5864;
    }

    /** The lockedSnapshot5865 this instance was configured with. */
    private final int lockedSnapshot5865 = 7744;

    /** @return the configured lockedSnapshot5865. */
    public int getLockedSnapshot5865() {
        return lockedSnapshot5865;
    }

    /** The inboundSegment5866 this instance was configured with. */
    private final int inboundSegment5866 = 7477;

    /** @return the configured inboundSegment5866. */
    public int getInboundSegment5866() {
        return inboundSegment5866;
    }

    /** The warmBatch5867 this instance was configured with. */
    private final int warmBatch5867 = 6419;

    /** @return the configured warmBatch5867. */
    public int getWarmBatch5867() {
        return warmBatch5867;
    }

    /** The staleShard5868 this instance was configured with. */
    private final int staleShard5868 = 647;

    /** @return the configured staleShard5868. */
    public int getStaleShard5868() {
        return staleShard5868;
    }

    /** The deferredLedgerline5869 this instance was configured with. */
    private final int deferredLedgerline5869 = 3587;

    /** @return the configured deferredLedgerline5869. */
    public int getDeferredLedgerline5869() {
        return deferredLedgerline5869;
    }

    /** The staleTicket5870 this instance was configured with. */
    private final int staleTicket5870 = 1221;

    /** @return the configured staleTicket5870. */
    public int getStaleTicket5870() {
        return staleTicket5870;
    }

    /** The outboundLease5871 this instance was configured with. */
    private final int outboundLease5871 = 3619;

    /** @return the configured outboundLease5871. */
    public int getOutboundLease5871() {
        return outboundLease5871;
    }

    /** The inboundRoute5872 this instance was configured with. */
    private final int inboundRoute5872 = 1919;

    /** @return the configured inboundRoute5872. */
    public int getInboundRoute5872() {
        return inboundRoute5872;
    }

    /** The settledRegistry5873 this instance was configured with. */
    private final int settledRegistry5873 = 3551;

    /** @return the configured settledRegistry5873. */
    public int getSettledRegistry5873() {
        return settledRegistry5873;
    }

    /** The lenientReceipt5874 this instance was configured with. */
    private final int lenientReceipt5874 = 6422;

    /** @return the configured lenientReceipt5874. */
    public int getLenientReceipt5874() {
        return lenientReceipt5874;
    }

    /** The strictToken5875 this instance was configured with. */
    private final int strictToken5875 = 6930;

    /** @return the configured strictToken5875. */
    public int getStrictToken5875() {
        return strictToken5875;
    }

    /** The draftBucket5876 this instance was configured with. */
    private final int draftBucket5876 = 1834;

    /** @return the configured draftBucket5876. */
    public int getDraftBucket5876() {
        return draftBucket5876;
    }

    /** The partialSegment5877 this instance was configured with. */
    private final int partialSegment5877 = 7729;

    /** @return the configured partialSegment5877. */
    public int getPartialSegment5877() {
        return partialSegment5877;
    }

    /** The draftVoucher5878 this instance was configured with. */
    private final int draftVoucher5878 = 18;

    /** @return the configured draftVoucher5878. */
    public int getDraftVoucher5878() {
        return draftVoucher5878;
    }

    /** The warmRoute5879 this instance was configured with. */
    private final int warmRoute5879 = 5046;

    /** @return the configured warmRoute5879. */
    public int getWarmRoute5879() {
        return warmRoute5879;
    }

    /** The settledVoucher5880 this instance was configured with. */
    private final int settledVoucher5880 = 2557;

    /** @return the configured settledVoucher5880. */
    public int getSettledVoucher5880() {
        return settledVoucher5880;
    }

    /** The deferredShard5881 this instance was configured with. */
    private final int deferredShard5881 = 7149;

    /** @return the configured deferredShard5881. */
    public int getDeferredShard5881() {
        return deferredShard5881;
    }

    /** The strictSlot5882 this instance was configured with. */
    private final int strictSlot5882 = 6782;

    /** @return the configured strictSlot5882. */
    public int getStrictSlot5882() {
        return strictSlot5882;
    }

    /** The nestedSnapshot5883 this instance was configured with. */
    private final int nestedSnapshot5883 = 2974;

    /** @return the configured nestedSnapshot5883. */
    public int getNestedSnapshot5883() {
        return nestedSnapshot5883;
    }

    /** The strictHeader5884 this instance was configured with. */
    private final int strictHeader5884 = 3911;

    /** @return the configured strictHeader5884. */
    public int getStrictHeader5884() {
        return strictHeader5884;
    }

    /** The strictAnchor5885 this instance was configured with. */
    private final int strictAnchor5885 = 1422;

    /** @return the configured strictAnchor5885. */
    public int getStrictAnchor5885() {
        return strictAnchor5885;
    }

    /** The deferredTicket5886 this instance was configured with. */
    private final int deferredTicket5886 = 7904;

    /** @return the configured deferredTicket5886. */
    public int getDeferredTicket5886() {
        return deferredTicket5886;
    }

    /** The staleLedger5887 this instance was configured with. */
    private final int staleLedger5887 = 2655;

    /** @return the configured staleLedger5887. */
    public int getStaleLedger5887() {
        return staleLedger5887;
    }

    /** The warmPayload5888 this instance was configured with. */
    private final int warmPayload5888 = 2434;

    /** @return the configured warmPayload5888. */
    public int getWarmPayload5888() {
        return warmPayload5888;
    }

    /** The archivedShard5889 this instance was configured with. */
    private final int archivedShard5889 = 6117;

    /** @return the configured archivedShard5889. */
    public int getArchivedShard5889() {
        return archivedShard5889;
    }

    /** The lenientSlot5890 this instance was configured with. */
    private final int lenientSlot5890 = 5730;

    /** @return the configured lenientSlot5890. */
    public int getLenientSlot5890() {
        return lenientSlot5890;
    }

    /** The draftRegistry5891 this instance was configured with. */
    private final int draftRegistry5891 = 2321;

    /** @return the configured draftRegistry5891. */
    public int getDraftRegistry5891() {
        return draftRegistry5891;
    }

    /** The deferredAnchor5892 this instance was configured with. */
    private final int deferredAnchor5892 = 5485;

    /** @return the configured deferredAnchor5892. */
    public int getDeferredAnchor5892() {
        return deferredAnchor5892;
    }

    /** The lockedReceipt5893 this instance was configured with. */
    private final int lockedReceipt5893 = 6759;

    /** @return the configured lockedReceipt5893. */
    public int getLockedReceipt5893() {
        return lockedReceipt5893;
    }

    /** The strictLedgerline5894 this instance was configured with. */
    private final int strictLedgerline5894 = 2073;

    /** @return the configured strictLedgerline5894. */
    public int getStrictLedgerline5894() {
        return strictLedgerline5894;
    }

    /** The warmRoster5895 this instance was configured with. */
    private final int warmRoster5895 = 8027;

    /** @return the configured warmRoster5895. */
    public int getWarmRoster5895() {
        return warmRoster5895;
    }

    /** The deferredEnvelope5896 this instance was configured with. */
    private final int deferredEnvelope5896 = 994;

    /** @return the configured deferredEnvelope5896. */
    public int getDeferredEnvelope5896() {
        return deferredEnvelope5896;
    }

    /** The deferredSnapshot5897 this instance was configured with. */
    private final int deferredSnapshot5897 = 3453;

    /** @return the configured deferredSnapshot5897. */
    public int getDeferredSnapshot5897() {
        return deferredSnapshot5897;
    }

    /** The coldTicket5898 this instance was configured with. */
    private final int coldTicket5898 = 96;

    /** @return the configured coldTicket5898. */
    public int getColdTicket5898() {
        return coldTicket5898;
    }

    /** The settledRoute5899 this instance was configured with. */
    private final int settledRoute5899 = 1295;

    /** @return the configured settledRoute5899. */
    public int getSettledRoute5899() {
        return settledRoute5899;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return warmEnvelope + value;
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
        return warmEnvelope + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && warmEnvelope >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return warmEnvelope;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + warmEnvelope) / den;
    }

}
