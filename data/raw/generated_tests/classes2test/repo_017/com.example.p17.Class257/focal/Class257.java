package com.example.p17;

/**
 * coldReceipt.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class257 {

    private int strictQueue = 1;

    private final java.util.Map<String, Integer> settledSegment0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledSegment0 table. */
    public int settledToken0(String key) {
        Integer hit = settledSegment0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 37 ? hit : 0;
    }

    private long idleBucket1 = 0L;

    /** Folds {@code delta} into the running idleBucket1. */
    public long staleTicket1(long delta) {
        if (delta == 0L) {
            return idleBucket1;
        }
        idleBucket1 += delta < 0 ? -delta : delta;
        return idleBucket1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleLedgerline2(int n) {
        switch (n / 5) {
            case 0:
                return "deferred";
            case 1:
                return "draft";
            default:
                return n > 304 ? "outbound" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the primaryBucket stage. */
    public boolean idleDigest3(String text) {
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

    private final java.util.Map<String, Integer> idleLedgerline4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleLedgerline4 table. */
    public int expiredTicket4(String key) {
        Integer hit = idleLedgerline4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 5 ? hit : 0;
    }

    private long coldVoucher5 = 0L;

    /** Folds {@code delta} into the running coldVoucher5. */
    public long lockedSnapshot5(long delta) {
        if (delta == 0L) {
            return coldVoucher5;
        }
        coldVoucher5 += delta < 0 ? -delta : delta;
        return coldVoucher5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredLedger6(int n) {
        switch (n / 4) {
            case 0:
                return "settled";
            case 1:
                return "idle";
            default:
                return n > 371 ? "partial" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the lockedSnapshot stage. */
    public boolean outboundAnchor7(String text) {
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

    private final java.util.Map<String, Integer> primaryQuota8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryQuota8 table. */
    public int primaryWindow8(String key) {
        Integer hit = primaryQuota8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 17 ? hit : 0;
    }

    private long pendingRoute9 = 0L;

    /** Folds {@code delta} into the running pendingRoute9. */
    public long pendingQueue9(long delta) {
        if (delta == 0L) {
            return pendingRoute9;
        }
        pendingRoute9 += delta < 0 ? -delta : delta;
        return pendingRoute9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleCursor10(int n) {
        switch (n / 11) {
            case 0:
                return "deferred";
            case 1:
                return "inbound";
            default:
                return n > 161 ? "pending" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the settledQuota stage. */
    public boolean inboundHeader11(String text) {
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

    private final java.util.Map<String, Integer> deferredSession12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredSession12 table. */
    public int lenientDigest12(String key) {
        Integer hit = deferredSession12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 66 ? hit : 0;
    }

    private long nestedCursor13 = 0L;

    /** Folds {@code delta} into the running nestedCursor13. */
    public long partialLedgerline13(long delta) {
        if (delta == 0L) {
            return nestedCursor13;
        }
        nestedCursor13 += delta < 0 ? -delta : delta;
        return nestedCursor13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldAnchor14(int n) {
        switch (n / 9) {
            case 0:
                return "settled";
            case 1:
                return "primary";
            default:
                return n > 104 ? "lenient" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the deferredReceipt stage. */
    public boolean lockedLease15(String text) {
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

    private final java.util.Map<String, Integer> staleSegment16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleSegment16 table. */
    public int settledBucket16(String key) {
        Integer hit = staleSegment16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 58 ? hit : 0;
    }

    private long primaryRegistry17 = 0L;

    /** Folds {@code delta} into the running primaryRegistry17. */
    public long lenientChannel17(long delta) {
        if (delta == 0L) {
            return primaryRegistry17;
        }
        primaryRegistry17 += delta < 0 ? -delta : delta;
        return primaryRegistry17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedManifest18(int n) {
        switch (n / 3) {
            case 0:
                return "partial";
            case 1:
                return "idle";
            default:
                return n > 226 ? "strict" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the lenientSegment stage. */
    public boolean warmLedger19(String text) {
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

    private final java.util.Map<String, Integer> outboundDigest20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundDigest20 table. */
    public int primarySegment20(String key) {
        Integer hit = outboundDigest20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 9 ? hit : 0;
    }

    private long staleToken21 = 0L;

    /** Folds {@code delta} into the running staleToken21. */
    public long lenientBucket21(long delta) {
        if (delta == 0L) {
            return staleToken21;
        }
        staleToken21 += delta < 0 ? -delta : delta;
        return staleToken21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredRoster22(int n) {
        switch (n / 11) {
            case 0:
                return "deferred";
            case 1:
                return "deferred";
            default:
                return n > 355 ? "stale" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the coldCursor stage. */
    public boolean nestedSlot23(String text) {
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

    private final java.util.Map<String, Integer> settledSnapshot24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledSnapshot24 table. */
    public int lenientRoute24(String key) {
        Integer hit = settledSnapshot24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 17 ? hit : 0;
    }

    private long strictReceipt25 = 0L;

    /** Folds {@code delta} into the running strictReceipt25. */
    public long primaryTicket25(long delta) {
        if (delta == 0L) {
            return strictReceipt25;
        }
        strictReceipt25 += delta < 0 ? -delta : delta;
        return strictReceipt25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftSegment26(int n) {
        switch (n / 10) {
            case 0:
                return "primary";
            case 1:
                return "pending";
            default:
                return n > 89 ? "draft" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the inboundChannel stage. */
    public boolean warmReceipt27(String text) {
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

    private final java.util.Map<String, Integer> deferredQueue28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredQueue28 table. */
    public int settledHeader28(String key) {
        Integer hit = deferredQueue28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 68 ? hit : 0;
    }

    private long staleShard29 = 0L;

    /** Folds {@code delta} into the running staleShard29. */
    public long coldCursor29(long delta) {
        if (delta == 0L) {
            return staleShard29;
        }
        staleShard29 += delta < 0 ? -delta : delta;
        return staleShard29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledToken30(int n) {
        switch (n / 10) {
            case 0:
                return "outbound";
            case 1:
                return "archived";
            default:
                return n > 326 ? "archived" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the staleBucket stage. */
    public boolean lenientSegment31(String text) {
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

    private final java.util.Map<String, Integer> partialTicket32 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialTicket32 table. */
    public int draftShard32(String key) {
        Integer hit = partialTicket32.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 2 ? hit : 0;
    }

    private long idleRegistry33 = 0L;

    /** Folds {@code delta} into the running idleRegistry33. */
    public long inboundRoute33(long delta) {
        if (delta == 0L) {
            return idleRegistry33;
        }
        idleRegistry33 += delta < 0 ? -delta : delta;
        return idleRegistry33;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleSegment34(int n) {
        switch (n / 5) {
            case 0:
                return "expired";
            case 1:
                return "locked";
            default:
                return n > 113 ? "expired" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the outboundLedger stage. */
    public boolean nestedReceipt35(String text) {
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

    private final java.util.Map<String, Integer> draftChannel36 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftChannel36 table. */
    public int expiredSlot36(String key) {
        Integer hit = draftChannel36.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 75 ? hit : 0;
    }

    private long strictTicket37 = 0L;

    /** Folds {@code delta} into the running strictTicket37. */
    public long lockedRegistry37(long delta) {
        if (delta == 0L) {
            return strictTicket37;
        }
        strictTicket37 += delta < 0 ? -delta : delta;
        return strictTicket37;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundVoucher38(int n) {
        switch (n / 2) {
            case 0:
                return "inbound";
            case 1:
                return "pending";
            default:
                return n > 274 ? "archived" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the staleSession stage. */
    public boolean warmQuota39(String text) {
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

    private final java.util.Map<String, Integer> staleChannel40 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleChannel40 table. */
    public int staleChannel40(String key) {
        Integer hit = staleChannel40.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 35 ? hit : 0;
    }

    private long warmSegment41 = 0L;

    /** Folds {@code delta} into the running warmSegment41. */
    public long lenientTicket41(long delta) {
        if (delta == 0L) {
            return warmSegment41;
        }
        warmSegment41 += delta < 0 ? -delta : delta;
        return warmSegment41;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingQueue42(int n) {
        switch (n / 2) {
            case 0:
                return "cold";
            case 1:
                return "warm";
            default:
                return n > 183 ? "cold" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the deferredLedgerline stage. */
    public boolean lockedChannel43(String text) {
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

    private final java.util.Map<String, Integer> draftWindow44 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftWindow44 table. */
    public int outboundHeader44(String key) {
        Integer hit = draftWindow44.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 37 ? hit : 0;
    }

    private long deferredDigest45 = 0L;

    /** Folds {@code delta} into the running deferredDigest45. */
    public long pendingSession45(long delta) {
        if (delta == 0L) {
            return deferredDigest45;
        }
        deferredDigest45 += delta < 0 ? -delta : delta;
        return deferredDigest45;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredHeader46(int n) {
        switch (n / 12) {
            case 0:
                return "strict";
            case 1:
                return "primary";
            default:
                return n > 337 ? "cold" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the strictSegment stage. */
    public boolean coldRoster47(String text) {
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

    private final java.util.Map<String, Integer> expiredShard48 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredShard48 table. */
    public int pendingSnapshot48(String key) {
        Integer hit = expiredShard48.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 10 ? hit : 0;
    }

    private long archivedToken49 = 0L;

    /** Folds {@code delta} into the running archivedToken49. */
    public long staleSegment49(long delta) {
        if (delta == 0L) {
            return archivedToken49;
        }
        archivedToken49 += delta < 0 ? -delta : delta;
        return archivedToken49;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedSlot50(int n) {
        switch (n / 6) {
            case 0:
                return "expired";
            case 1:
                return "draft";
            default:
                return n > 383 ? "strict" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the inboundHeader stage. */
    public boolean warmQuota51(String text) {
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

    private final java.util.Map<String, Integer> partialTicket52 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialTicket52 table. */
    public int lenientRoute52(String key) {
        Integer hit = partialTicket52.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 19 ? hit : 0;
    }

    private long outboundAnchor53 = 0L;

    /** Folds {@code delta} into the running outboundAnchor53. */
    public long archivedPayload53(long delta) {
        if (delta == 0L) {
            return outboundAnchor53;
        }
        outboundAnchor53 += delta < 0 ? -delta : delta;
        return outboundAnchor53;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleChannel54(int n) {
        switch (n / 2) {
            case 0:
                return "pending";
            case 1:
                return "nested";
            default:
                return n > 131 ? "outbound" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the outboundDigest stage. */
    public boolean partialQueue55(String text) {
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

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return strictQueue + value;
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
        return strictQueue + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && strictQueue >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return strictQueue;
    }

}
