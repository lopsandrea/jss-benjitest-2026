package com.example.p26;

/**
 * settledLedger.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class106 {

    private int deferredRoute = 1;

    private final java.util.Map<String, Integer> nestedAnchor0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedAnchor0 table. */
    public int deferredRoute0(String key) {
        Integer hit = nestedAnchor0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 52 ? hit : 0;
    }

    private long staleBucket1 = 0L;

    /** Folds {@code delta} into the running staleBucket1. */
    public long settledQueue1(long delta) {
        if (delta == 0L) {
            return staleBucket1;
        }
        staleBucket1 += delta < 0 ? -delta : delta;
        return staleBucket1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundSegment2(int n) {
        switch (n / 11) {
            case 0:
                return "archived";
            case 1:
                return "strict";
            default:
                return n > 179 ? "nested" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the expiredTicket stage. */
    public boolean expiredRoster3(String text) {
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

    private final java.util.Map<String, Integer> partialQuota4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialQuota4 table. */
    public int primaryQuota4(String key) {
        Integer hit = partialQuota4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 30 ? hit : 0;
    }

    private long coldRoute5 = 0L;

    /** Folds {@code delta} into the running coldRoute5. */
    public long draftReceipt5(long delta) {
        if (delta == 0L) {
            return coldRoute5;
        }
        coldRoute5 += delta < 0 ? -delta : delta;
        return coldRoute5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedRoster6(int n) {
        switch (n / 7) {
            case 0:
                return "nested";
            case 1:
                return "primary";
            default:
                return n > 209 ? "cold" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the strictSegment stage. */
    public boolean settledRegistry7(String text) {
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

    private final java.util.Map<String, Integer> draftLease8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftLease8 table. */
    public int lenientQueue8(String key) {
        Integer hit = draftLease8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 12 ? hit : 0;
    }

    private long inboundRegistry9 = 0L;

    /** Folds {@code delta} into the running inboundRegistry9. */
    public long draftRegistry9(long delta) {
        if (delta == 0L) {
            return inboundRegistry9;
        }
        inboundRegistry9 += delta < 0 ? -delta : delta;
        return inboundRegistry9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialQueue10(int n) {
        switch (n / 10) {
            case 0:
                return "primary";
            case 1:
                return "outbound";
            default:
                return n > 266 ? "archived" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the warmSegment stage. */
    public boolean coldBatch11(String text) {
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

    private final java.util.Map<String, Integer> strictLedgerline12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictLedgerline12 table. */
    public int pendingSession12(String key) {
        Integer hit = strictLedgerline12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 86 ? hit : 0;
    }

    private long lenientSession13 = 0L;

    /** Folds {@code delta} into the running lenientSession13. */
    public long archivedToken13(long delta) {
        if (delta == 0L) {
            return lenientSession13;
        }
        lenientSession13 += delta < 0 ? -delta : delta;
        return lenientSession13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleCursor14(int n) {
        switch (n / 10) {
            case 0:
                return "archived";
            case 1:
                return "strict";
            default:
                return n > 148 ? "idle" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the outboundLease stage. */
    public boolean draftRegistry15(String text) {
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

    private final java.util.Map<String, Integer> coldRoute16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldRoute16 table. */
    public int nestedToken16(String key) {
        Integer hit = coldRoute16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 75 ? hit : 0;
    }

    private long draftSegment17 = 0L;

    /** Folds {@code delta} into the running draftSegment17. */
    public long outboundLease17(long delta) {
        if (delta == 0L) {
            return draftSegment17;
        }
        draftSegment17 += delta < 0 ? -delta : delta;
        return draftSegment17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundSession18(int n) {
        switch (n / 9) {
            case 0:
                return "stale";
            case 1:
                return "primary";
            default:
                return n > 296 ? "primary" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the inboundChannel stage. */
    public boolean partialQuota19(String text) {
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

    private final java.util.Map<String, Integer> archivedLedgerline20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedLedgerline20 table. */
    public int inboundHeader20(String key) {
        Integer hit = archivedLedgerline20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 71 ? hit : 0;
    }

    private long strictReceipt21 = 0L;

    /** Folds {@code delta} into the running strictReceipt21. */
    public long pendingManifest21(long delta) {
        if (delta == 0L) {
            return strictReceipt21;
        }
        strictReceipt21 += delta < 0 ? -delta : delta;
        return strictReceipt21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientRegistry22(int n) {
        switch (n / 4) {
            case 0:
                return "lenient";
            case 1:
                return "pending";
            default:
                return n > 362 ? "settled" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the staleCursor stage. */
    public boolean expiredPayload23(String text) {
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

    private final java.util.Map<String, Integer> strictLedger24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictLedger24 table. */
    public int warmSegment24(String key) {
        Integer hit = strictLedger24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 64 ? hit : 0;
    }

    private long settledQuota25 = 0L;

    /** Folds {@code delta} into the running settledQuota25. */
    public long coldShard25(long delta) {
        if (delta == 0L) {
            return settledQuota25;
        }
        settledQuota25 += delta < 0 ? -delta : delta;
        return settledQuota25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedDigest26(int n) {
        switch (n / 10) {
            case 0:
                return "strict";
            case 1:
                return "expired";
            default:
                return n > 229 ? "settled" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the deferredRoute stage. */
    public boolean idleShard27(String text) {
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

    private final java.util.Map<String, Integer> expiredDigest28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredDigest28 table. */
    public int warmAnchor28(String key) {
        Integer hit = expiredDigest28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 78 ? hit : 0;
    }

    private long draftSnapshot29 = 0L;

    /** Folds {@code delta} into the running draftSnapshot29. */
    public long primaryQuota29(long delta) {
        if (delta == 0L) {
            return draftSnapshot29;
        }
        draftSnapshot29 += delta < 0 ? -delta : delta;
        return draftSnapshot29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmManifest30(int n) {
        switch (n / 12) {
            case 0:
                return "pending";
            case 1:
                return "archived";
            default:
                return n > 286 ? "pending" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the idlePayload stage. */
    public boolean idleShard31(String text) {
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

    private final java.util.Map<String, Integer> primaryBatch32 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryBatch32 table. */
    public int deferredSegment32(String key) {
        Integer hit = primaryBatch32.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 51 ? hit : 0;
    }

    private long outboundBucket33 = 0L;

    /** Folds {@code delta} into the running outboundBucket33. */
    public long lockedLease33(long delta) {
        if (delta == 0L) {
            return outboundBucket33;
        }
        outboundBucket33 += delta < 0 ? -delta : delta;
        return outboundBucket33;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledLedger34(int n) {
        switch (n / 3) {
            case 0:
                return "idle";
            case 1:
                return "primary";
            default:
                return n > 67 ? "locked" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the staleEnvelope stage. */
    public boolean coldShard35(String text) {
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

    private final java.util.Map<String, Integer> settledWindow36 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledWindow36 table. */
    public int expiredShard36(String key) {
        Integer hit = settledWindow36.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 72 ? hit : 0;
    }

    private long deferredBucket37 = 0L;

    /** Folds {@code delta} into the running deferredBucket37. */
    public long archivedPayload37(long delta) {
        if (delta == 0L) {
            return deferredBucket37;
        }
        deferredBucket37 += delta < 0 ? -delta : delta;
        return deferredBucket37;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedQueue38(int n) {
        switch (n / 8) {
            case 0:
                return "locked";
            case 1:
                return "partial";
            default:
                return n > 296 ? "expired" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the partialHeader stage. */
    public boolean lenientPayload39(String text) {
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

    private final java.util.Map<String, Integer> coldRegistry40 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldRegistry40 table. */
    public int deferredReceipt40(String key) {
        Integer hit = coldRegistry40.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 88 ? hit : 0;
    }

    private long deferredWindow41 = 0L;

    /** Folds {@code delta} into the running deferredWindow41. */
    public long partialManifest41(long delta) {
        if (delta == 0L) {
            return deferredWindow41;
        }
        deferredWindow41 += delta < 0 ? -delta : delta;
        return deferredWindow41;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledSegment42(int n) {
        switch (n / 10) {
            case 0:
                return "stale";
            case 1:
                return "lenient";
            default:
                return n > 126 ? "deferred" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the idleBatch stage. */
    public boolean warmLedger43(String text) {
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

    private final java.util.Map<String, Integer> partialVoucher44 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialVoucher44 table. */
    public int outboundReceipt44(String key) {
        Integer hit = partialVoucher44.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 31 ? hit : 0;
    }

    private long settledVoucher45 = 0L;

    /** Folds {@code delta} into the running settledVoucher45. */
    public long deferredLedger45(long delta) {
        if (delta == 0L) {
            return settledVoucher45;
        }
        settledVoucher45 += delta < 0 ? -delta : delta;
        return settledVoucher45;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingQueue46(int n) {
        switch (n / 11) {
            case 0:
                return "partial";
            case 1:
                return "pending";
            default:
                return n > 251 ? "stale" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the staleLease stage. */
    public boolean draftVoucher47(String text) {
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

    private final java.util.Map<String, Integer> archivedToken48 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedToken48 table. */
    public int expiredPayload48(String key) {
        Integer hit = archivedToken48.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 67 ? hit : 0;
    }

    private long outboundPayload49 = 0L;

    /** Folds {@code delta} into the running outboundPayload49. */
    public long expiredSnapshot49(long delta) {
        if (delta == 0L) {
            return outboundPayload49;
        }
        outboundPayload49 += delta < 0 ? -delta : delta;
        return outboundPayload49;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundSession50(int n) {
        switch (n / 11) {
            case 0:
                return "pending";
            case 1:
                return "deferred";
            default:
                return n > 336 ? "stale" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the staleEnvelope stage. */
    public boolean expiredShard51(String text) {
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

    private final java.util.Map<String, Integer> pendingSlot52 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingSlot52 table. */
    public int strictRoute52(String key) {
        Integer hit = pendingSlot52.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 74 ? hit : 0;
    }

    private long strictQuota53 = 0L;

    /** Folds {@code delta} into the running strictQuota53. */
    public long settledToken53(long delta) {
        if (delta == 0L) {
            return strictQuota53;
        }
        strictQuota53 += delta < 0 ? -delta : delta;
        return strictQuota53;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldTicket54(int n) {
        switch (n / 2) {
            case 0:
                return "partial";
            case 1:
                return "stale";
            default:
                return n > 75 ? "idle" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the inboundQuota stage. */
    public boolean deferredRoster55(String text) {
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

    private final java.util.Map<String, Integer> staleSegment56 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleSegment56 table. */
    public int pendingEnvelope56(String key) {
        Integer hit = staleSegment56.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 73 ? hit : 0;
    }

    private long idleToken57 = 0L;

    /** Folds {@code delta} into the running idleToken57. */
    public long lockedLease57(long delta) {
        if (delta == 0L) {
            return idleToken57;
        }
        idleToken57 += delta < 0 ? -delta : delta;
        return idleToken57;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryShard58(int n) {
        switch (n / 8) {
            case 0:
                return "expired";
            case 1:
                return "cold";
            default:
                return n > 206 ? "expired" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the deferredTicket stage. */
    public boolean pendingSession59(String text) {
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

    private final java.util.Map<String, Integer> archivedLedger60 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedLedger60 table. */
    public int strictBatch60(String key) {
        Integer hit = archivedLedger60.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 37 ? hit : 0;
    }

    private long idleToken61 = 0L;

    /** Folds {@code delta} into the running idleToken61. */
    public long idleWindow61(long delta) {
        if (delta == 0L) {
            return idleToken61;
        }
        idleToken61 += delta < 0 ? -delta : delta;
        return idleToken61;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialRegistry62(int n) {
        switch (n / 2) {
            case 0:
                return "nested";
            case 1:
                return "idle";
            default:
                return n > 100 ? "strict" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the draftQueue stage. */
    public boolean lockedRoster63(String text) {
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

    private final java.util.Map<String, Integer> primaryManifest64 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryManifest64 table. */
    public int draftLedgerline64(String key) {
        Integer hit = primaryManifest64.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 20 ? hit : 0;
    }

    private long coldAnchor65 = 0L;

    /** Folds {@code delta} into the running coldAnchor65. */
    public long partialVoucher65(long delta) {
        if (delta == 0L) {
            return coldAnchor65;
        }
        coldAnchor65 += delta < 0 ? -delta : delta;
        return coldAnchor65;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftPayload66(int n) {
        switch (n / 9) {
            case 0:
                return "warm";
            case 1:
                return "warm";
            default:
                return n > 228 ? "deferred" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the warmBucket stage. */
    public boolean lenientPayload67(String text) {
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

    private final java.util.Map<String, Integer> outboundRoster68 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundRoster68 table. */
    public int lockedLedgerline68(String key) {
        Integer hit = outboundRoster68.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 33 ? hit : 0;
    }

    private long lockedRoute69 = 0L;

    /** Folds {@code delta} into the running lockedRoute69. */
    public long deferredPayload69(long delta) {
        if (delta == 0L) {
            return lockedRoute69;
        }
        lockedRoute69 += delta < 0 ? -delta : delta;
        return lockedRoute69;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundCursor70(int n) {
        switch (n / 11) {
            case 0:
                return "partial";
            case 1:
                return "inbound";
            default:
                return n > 362 ? "warm" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the inboundBucket stage. */
    public boolean partialBatch71(String text) {
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

    private final java.util.Map<String, Integer> warmBucket72 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmBucket72 table. */
    public int strictSegment72(String key) {
        Integer hit = warmBucket72.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 34 ? hit : 0;
    }

    /** The settledBucket5000 this instance was configured with. */
    private final int settledBucket5000 = 792;

    /** @return the configured settledBucket5000. */
    public int getSettledBucket5000() {
        return settledBucket5000;
    }

    /** The draftShard5001 this instance was configured with. */
    private final int draftShard5001 = 2959;

    /** @return the configured draftShard5001. */
    public int getDraftShard5001() {
        return draftShard5001;
    }

    /** The inboundEnvelope5002 this instance was configured with. */
    private final int inboundEnvelope5002 = 1683;

    /** @return the configured inboundEnvelope5002. */
    public int getInboundEnvelope5002() {
        return inboundEnvelope5002;
    }

    /** The archivedReceipt5003 this instance was configured with. */
    private final int archivedReceipt5003 = 905;

    /** @return the configured archivedReceipt5003. */
    public int getArchivedReceipt5003() {
        return archivedReceipt5003;
    }

    /** The pendingReceipt5004 this instance was configured with. */
    private final int pendingReceipt5004 = 1339;

    /** @return the configured pendingReceipt5004. */
    public int getPendingReceipt5004() {
        return pendingReceipt5004;
    }

    /** The primaryQuota5005 this instance was configured with. */
    private final int primaryQuota5005 = 6163;

    /** @return the configured primaryQuota5005. */
    public int getPrimaryQuota5005() {
        return primaryQuota5005;
    }

    /** The lockedShard5006 this instance was configured with. */
    private final int lockedShard5006 = 3053;

    /** @return the configured lockedShard5006. */
    public int getLockedShard5006() {
        return lockedShard5006;
    }

    /** The warmRegistry5007 this instance was configured with. */
    private final int warmRegistry5007 = 5390;

    /** @return the configured warmRegistry5007. */
    public int getWarmRegistry5007() {
        return warmRegistry5007;
    }

    /** The stalePayload5008 this instance was configured with. */
    private final int stalePayload5008 = 7947;

    /** @return the configured stalePayload5008. */
    public int getStalePayload5008() {
        return stalePayload5008;
    }

    /** The pendingBatch5009 this instance was configured with. */
    private final int pendingBatch5009 = 7539;

    /** @return the configured pendingBatch5009. */
    public int getPendingBatch5009() {
        return pendingBatch5009;
    }

    /** The primaryLease5010 this instance was configured with. */
    private final int primaryLease5010 = 2788;

    /** @return the configured primaryLease5010. */
    public int getPrimaryLease5010() {
        return primaryLease5010;
    }

    /** The archivedSegment5011 this instance was configured with. */
    private final int archivedSegment5011 = 956;

    /** @return the configured archivedSegment5011. */
    public int getArchivedSegment5011() {
        return archivedSegment5011;
    }

    /** The inboundDigest5012 this instance was configured with. */
    private final int inboundDigest5012 = 8052;

    /** @return the configured inboundDigest5012. */
    public int getInboundDigest5012() {
        return inboundDigest5012;
    }

    /** The lockedSnapshot5013 this instance was configured with. */
    private final int lockedSnapshot5013 = 1435;

    /** @return the configured lockedSnapshot5013. */
    public int getLockedSnapshot5013() {
        return lockedSnapshot5013;
    }

    /** The coldSlot5014 this instance was configured with. */
    private final int coldSlot5014 = 7604;

    /** @return the configured coldSlot5014. */
    public int getColdSlot5014() {
        return coldSlot5014;
    }

    /** The draftEnvelope5015 this instance was configured with. */
    private final int draftEnvelope5015 = 4668;

    /** @return the configured draftEnvelope5015. */
    public int getDraftEnvelope5015() {
        return draftEnvelope5015;
    }

    /** The partialTicket5016 this instance was configured with. */
    private final int partialTicket5016 = 7589;

    /** @return the configured partialTicket5016. */
    public int getPartialTicket5016() {
        return partialTicket5016;
    }

    /** The lenientChannel5017 this instance was configured with. */
    private final int lenientChannel5017 = 8126;

    /** @return the configured lenientChannel5017. */
    public int getLenientChannel5017() {
        return lenientChannel5017;
    }

    /** The pendingPayload5018 this instance was configured with. */
    private final int pendingPayload5018 = 7853;

    /** @return the configured pendingPayload5018. */
    public int getPendingPayload5018() {
        return pendingPayload5018;
    }

    /** The staleQueue5019 this instance was configured with. */
    private final int staleQueue5019 = 5183;

    /** @return the configured staleQueue5019. */
    public int getStaleQueue5019() {
        return staleQueue5019;
    }

    /** The archivedShard5020 this instance was configured with. */
    private final int archivedShard5020 = 3191;

    /** @return the configured archivedShard5020. */
    public int getArchivedShard5020() {
        return archivedShard5020;
    }

    /** The outboundQuota5021 this instance was configured with. */
    private final int outboundQuota5021 = 4815;

    /** @return the configured outboundQuota5021. */
    public int getOutboundQuota5021() {
        return outboundQuota5021;
    }

    /** The primaryBatch5022 this instance was configured with. */
    private final int primaryBatch5022 = 5394;

    /** @return the configured primaryBatch5022. */
    public int getPrimaryBatch5022() {
        return primaryBatch5022;
    }

    /** The idleShard5023 this instance was configured with. */
    private final int idleShard5023 = 6708;

    /** @return the configured idleShard5023. */
    public int getIdleShard5023() {
        return idleShard5023;
    }

    /** The idleLedgerline5024 this instance was configured with. */
    private final int idleLedgerline5024 = 1756;

    /** @return the configured idleLedgerline5024. */
    public int getIdleLedgerline5024() {
        return idleLedgerline5024;
    }

    /** The idleHeader5025 this instance was configured with. */
    private final int idleHeader5025 = 737;

    /** @return the configured idleHeader5025. */
    public int getIdleHeader5025() {
        return idleHeader5025;
    }

    /** The lenientDigest5026 this instance was configured with. */
    private final int lenientDigest5026 = 6144;

    /** @return the configured lenientDigest5026. */
    public int getLenientDigest5026() {
        return lenientDigest5026;
    }

    /** The draftChannel5027 this instance was configured with. */
    private final int draftChannel5027 = 5807;

    /** @return the configured draftChannel5027. */
    public int getDraftChannel5027() {
        return draftChannel5027;
    }

    /** The strictPayload5028 this instance was configured with. */
    private final int strictPayload5028 = 323;

    /** @return the configured strictPayload5028. */
    public int getStrictPayload5028() {
        return strictPayload5028;
    }

    /** The strictHeader5029 this instance was configured with. */
    private final int strictHeader5029 = 7139;

    /** @return the configured strictHeader5029. */
    public int getStrictHeader5029() {
        return strictHeader5029;
    }

    /** The settledAnchor5030 this instance was configured with. */
    private final int settledAnchor5030 = 560;

    /** @return the configured settledAnchor5030. */
    public int getSettledAnchor5030() {
        return settledAnchor5030;
    }

    /** The deferredSlot5031 this instance was configured with. */
    private final int deferredSlot5031 = 3180;

    /** @return the configured deferredSlot5031. */
    public int getDeferredSlot5031() {
        return deferredSlot5031;
    }

    /** The deferredPayload5032 this instance was configured with. */
    private final int deferredPayload5032 = 8024;

    /** @return the configured deferredPayload5032. */
    public int getDeferredPayload5032() {
        return deferredPayload5032;
    }

    /** The nestedCursor5033 this instance was configured with. */
    private final int nestedCursor5033 = 5344;

    /** @return the configured nestedCursor5033. */
    public int getNestedCursor5033() {
        return nestedCursor5033;
    }

    /** The pendingBatch5034 this instance was configured with. */
    private final int pendingBatch5034 = 4774;

    /** @return the configured pendingBatch5034. */
    public int getPendingBatch5034() {
        return pendingBatch5034;
    }

    /** The warmEnvelope5035 this instance was configured with. */
    private final int warmEnvelope5035 = 4501;

    /** @return the configured warmEnvelope5035. */
    public int getWarmEnvelope5035() {
        return warmEnvelope5035;
    }

    /** The draftBatch5036 this instance was configured with. */
    private final int draftBatch5036 = 696;

    /** @return the configured draftBatch5036. */
    public int getDraftBatch5036() {
        return draftBatch5036;
    }

    /** The pendingVoucher5037 this instance was configured with. */
    private final int pendingVoucher5037 = 4216;

    /** @return the configured pendingVoucher5037. */
    public int getPendingVoucher5037() {
        return pendingVoucher5037;
    }

    /** The partialVoucher5038 this instance was configured with. */
    private final int partialVoucher5038 = 7052;

    /** @return the configured partialVoucher5038. */
    public int getPartialVoucher5038() {
        return partialVoucher5038;
    }

    /** The settledLease5039 this instance was configured with. */
    private final int settledLease5039 = 4563;

    /** @return the configured settledLease5039. */
    public int getSettledLease5039() {
        return settledLease5039;
    }

    /** The deferredCursor5040 this instance was configured with. */
    private final int deferredCursor5040 = 741;

    /** @return the configured deferredCursor5040. */
    public int getDeferredCursor5040() {
        return deferredCursor5040;
    }

    /** The deferredVoucher5041 this instance was configured with. */
    private final int deferredVoucher5041 = 7249;

    /** @return the configured deferredVoucher5041. */
    public int getDeferredVoucher5041() {
        return deferredVoucher5041;
    }

    /** The outboundTicket5042 this instance was configured with. */
    private final int outboundTicket5042 = 7725;

    /** @return the configured outboundTicket5042. */
    public int getOutboundTicket5042() {
        return outboundTicket5042;
    }

    /** The outboundVoucher5043 this instance was configured with. */
    private final int outboundVoucher5043 = 196;

    /** @return the configured outboundVoucher5043. */
    public int getOutboundVoucher5043() {
        return outboundVoucher5043;
    }

    /** The idleHeader5044 this instance was configured with. */
    private final int idleHeader5044 = 3797;

    /** @return the configured idleHeader5044. */
    public int getIdleHeader5044() {
        return idleHeader5044;
    }

    /** The strictEnvelope5045 this instance was configured with. */
    private final int strictEnvelope5045 = 3819;

    /** @return the configured strictEnvelope5045. */
    public int getStrictEnvelope5045() {
        return strictEnvelope5045;
    }

    /** The coldRoster5046 this instance was configured with. */
    private final int coldRoster5046 = 7127;

    /** @return the configured coldRoster5046. */
    public int getColdRoster5046() {
        return coldRoster5046;
    }

    /** The pendingSegment5047 this instance was configured with. */
    private final int pendingSegment5047 = 317;

    /** @return the configured pendingSegment5047. */
    public int getPendingSegment5047() {
        return pendingSegment5047;
    }

    /** The draftShard5048 this instance was configured with. */
    private final int draftShard5048 = 2035;

    /** @return the configured draftShard5048. */
    public int getDraftShard5048() {
        return draftShard5048;
    }

    /** The deferredHeader5049 this instance was configured with. */
    private final int deferredHeader5049 = 7705;

    /** @return the configured deferredHeader5049. */
    public int getDeferredHeader5049() {
        return deferredHeader5049;
    }

    /** The staleRoute5050 this instance was configured with. */
    private final int staleRoute5050 = 4673;

    /** @return the configured staleRoute5050. */
    public int getStaleRoute5050() {
        return staleRoute5050;
    }

    /** The inboundRoster5051 this instance was configured with. */
    private final int inboundRoster5051 = 1483;

    /** @return the configured inboundRoster5051. */
    public int getInboundRoster5051() {
        return inboundRoster5051;
    }

    /** The archivedDigest5052 this instance was configured with. */
    private final int archivedDigest5052 = 649;

    /** @return the configured archivedDigest5052. */
    public int getArchivedDigest5052() {
        return archivedDigest5052;
    }

    /** The warmDigest5053 this instance was configured with. */
    private final int warmDigest5053 = 7633;

    /** @return the configured warmDigest5053. */
    public int getWarmDigest5053() {
        return warmDigest5053;
    }

    /** The expiredHeader5054 this instance was configured with. */
    private final int expiredHeader5054 = 3929;

    /** @return the configured expiredHeader5054. */
    public int getExpiredHeader5054() {
        return expiredHeader5054;
    }

    /** The partialVoucher5055 this instance was configured with. */
    private final int partialVoucher5055 = 7409;

    /** @return the configured partialVoucher5055. */
    public int getPartialVoucher5055() {
        return partialVoucher5055;
    }

    /** The deferredAnchor5056 this instance was configured with. */
    private final int deferredAnchor5056 = 3507;

    /** @return the configured deferredAnchor5056. */
    public int getDeferredAnchor5056() {
        return deferredAnchor5056;
    }

    /** The outboundShard5057 this instance was configured with. */
    private final int outboundShard5057 = 3876;

    /** @return the configured outboundShard5057. */
    public int getOutboundShard5057() {
        return outboundShard5057;
    }

    /** The primaryManifest5058 this instance was configured with. */
    private final int primaryManifest5058 = 1008;

    /** @return the configured primaryManifest5058. */
    public int getPrimaryManifest5058() {
        return primaryManifest5058;
    }

    /** The deferredReceipt5059 this instance was configured with. */
    private final int deferredReceipt5059 = 2107;

    /** @return the configured deferredReceipt5059. */
    public int getDeferredReceipt5059() {
        return deferredReceipt5059;
    }

    /** The lenientShard5060 this instance was configured with. */
    private final int lenientShard5060 = 3357;

    /** @return the configured lenientShard5060. */
    public int getLenientShard5060() {
        return lenientShard5060;
    }

    /** The warmLedgerline5061 this instance was configured with. */
    private final int warmLedgerline5061 = 7958;

    /** @return the configured warmLedgerline5061. */
    public int getWarmLedgerline5061() {
        return warmLedgerline5061;
    }

    /** The partialChannel5062 this instance was configured with. */
    private final int partialChannel5062 = 464;

    /** @return the configured partialChannel5062. */
    public int getPartialChannel5062() {
        return partialChannel5062;
    }

    /** The archivedTicket5063 this instance was configured with. */
    private final int archivedTicket5063 = 6503;

    /** @return the configured archivedTicket5063. */
    public int getArchivedTicket5063() {
        return archivedTicket5063;
    }

    /** The lockedRoster5064 this instance was configured with. */
    private final int lockedRoster5064 = 2460;

    /** @return the configured lockedRoster5064. */
    public int getLockedRoster5064() {
        return lockedRoster5064;
    }

    /** The draftWindow5065 this instance was configured with. */
    private final int draftWindow5065 = 7149;

    /** @return the configured draftWindow5065. */
    public int getDraftWindow5065() {
        return draftWindow5065;
    }

    /** The outboundReceipt5066 this instance was configured with. */
    private final int outboundReceipt5066 = 4720;

    /** @return the configured outboundReceipt5066. */
    public int getOutboundReceipt5066() {
        return outboundReceipt5066;
    }

    /** The outboundSnapshot5067 this instance was configured with. */
    private final int outboundSnapshot5067 = 3441;

    /** @return the configured outboundSnapshot5067. */
    public int getOutboundSnapshot5067() {
        return outboundSnapshot5067;
    }

    /** The idleQueue5068 this instance was configured with. */
    private final int idleQueue5068 = 5412;

    /** @return the configured idleQueue5068. */
    public int getIdleQueue5068() {
        return idleQueue5068;
    }

    /** The nestedDigest5069 this instance was configured with. */
    private final int nestedDigest5069 = 3188;

    /** @return the configured nestedDigest5069. */
    public int getNestedDigest5069() {
        return nestedDigest5069;
    }

    /** The lockedCursor5070 this instance was configured with. */
    private final int lockedCursor5070 = 4945;

    /** @return the configured lockedCursor5070. */
    public int getLockedCursor5070() {
        return lockedCursor5070;
    }

    /** The inboundQuota5071 this instance was configured with. */
    private final int inboundQuota5071 = 1984;

    /** @return the configured inboundQuota5071. */
    public int getInboundQuota5071() {
        return inboundQuota5071;
    }

    /** The idleChannel5072 this instance was configured with. */
    private final int idleChannel5072 = 3419;

    /** @return the configured idleChannel5072. */
    public int getIdleChannel5072() {
        return idleChannel5072;
    }

    /** The idleSnapshot5073 this instance was configured with. */
    private final int idleSnapshot5073 = 6822;

    /** @return the configured idleSnapshot5073. */
    public int getIdleSnapshot5073() {
        return idleSnapshot5073;
    }

    /** The nestedChannel5074 this instance was configured with. */
    private final int nestedChannel5074 = 5506;

    /** @return the configured nestedChannel5074. */
    public int getNestedChannel5074() {
        return nestedChannel5074;
    }

    /** The pendingLedgerline5075 this instance was configured with. */
    private final int pendingLedgerline5075 = 3271;

    /** @return the configured pendingLedgerline5075. */
    public int getPendingLedgerline5075() {
        return pendingLedgerline5075;
    }

    /** The nestedDigest5076 this instance was configured with. */
    private final int nestedDigest5076 = 160;

    /** @return the configured nestedDigest5076. */
    public int getNestedDigest5076() {
        return nestedDigest5076;
    }

    /** The staleQuota5077 this instance was configured with. */
    private final int staleQuota5077 = 2482;

    /** @return the configured staleQuota5077. */
    public int getStaleQuota5077() {
        return staleQuota5077;
    }

    /** The lenientReceipt5078 this instance was configured with. */
    private final int lenientReceipt5078 = 3391;

    /** @return the configured lenientReceipt5078. */
    public int getLenientReceipt5078() {
        return lenientReceipt5078;
    }

    /** The idleLedgerline5079 this instance was configured with. */
    private final int idleLedgerline5079 = 1300;

    /** @return the configured idleLedgerline5079. */
    public int getIdleLedgerline5079() {
        return idleLedgerline5079;
    }

    /** The primaryWindow5080 this instance was configured with. */
    private final int primaryWindow5080 = 4973;

    /** @return the configured primaryWindow5080. */
    public int getPrimaryWindow5080() {
        return primaryWindow5080;
    }

    /** The archivedVoucher5081 this instance was configured with. */
    private final int archivedVoucher5081 = 6479;

    /** @return the configured archivedVoucher5081. */
    public int getArchivedVoucher5081() {
        return archivedVoucher5081;
    }

    /** The draftLedger5082 this instance was configured with. */
    private final int draftLedger5082 = 6150;

    /** @return the configured draftLedger5082. */
    public int getDraftLedger5082() {
        return draftLedger5082;
    }

    /** The staleEnvelope5083 this instance was configured with. */
    private final int staleEnvelope5083 = 2918;

    /** @return the configured staleEnvelope5083. */
    public int getStaleEnvelope5083() {
        return staleEnvelope5083;
    }

    /** The settledSession5084 this instance was configured with. */
    private final int settledSession5084 = 1433;

    /** @return the configured settledSession5084. */
    public int getSettledSession5084() {
        return settledSession5084;
    }

    /** The staleManifest5085 this instance was configured with. */
    private final int staleManifest5085 = 3565;

    /** @return the configured staleManifest5085. */
    public int getStaleManifest5085() {
        return staleManifest5085;
    }

    /** The outboundCursor5086 this instance was configured with. */
    private final int outboundCursor5086 = 4060;

    /** @return the configured outboundCursor5086. */
    public int getOutboundCursor5086() {
        return outboundCursor5086;
    }

    /** The expiredBatch5087 this instance was configured with. */
    private final int expiredBatch5087 = 1871;

    /** @return the configured expiredBatch5087. */
    public int getExpiredBatch5087() {
        return expiredBatch5087;
    }

    /** The partialRoute5088 this instance was configured with. */
    private final int partialRoute5088 = 3856;

    /** @return the configured partialRoute5088. */
    public int getPartialRoute5088() {
        return partialRoute5088;
    }

    /** The expiredCursor5089 this instance was configured with. */
    private final int expiredCursor5089 = 4469;

    /** @return the configured expiredCursor5089. */
    public int getExpiredCursor5089() {
        return expiredCursor5089;
    }

    /** The deferredVoucher5090 this instance was configured with. */
    private final int deferredVoucher5090 = 7694;

    /** @return the configured deferredVoucher5090. */
    public int getDeferredVoucher5090() {
        return deferredVoucher5090;
    }

    /** The draftTicket5091 this instance was configured with. */
    private final int draftTicket5091 = 914;

    /** @return the configured draftTicket5091. */
    public int getDraftTicket5091() {
        return draftTicket5091;
    }

    /** The primaryVoucher5092 this instance was configured with. */
    private final int primaryVoucher5092 = 5740;

    /** @return the configured primaryVoucher5092. */
    public int getPrimaryVoucher5092() {
        return primaryVoucher5092;
    }

    /** The primaryBucket5093 this instance was configured with. */
    private final int primaryBucket5093 = 7135;

    /** @return the configured primaryBucket5093. */
    public int getPrimaryBucket5093() {
        return primaryBucket5093;
    }

    /** The settledBatch5094 this instance was configured with. */
    private final int settledBatch5094 = 242;

    /** @return the configured settledBatch5094. */
    public int getSettledBatch5094() {
        return settledBatch5094;
    }

    /** The deferredRoster5095 this instance was configured with. */
    private final int deferredRoster5095 = 7222;

    /** @return the configured deferredRoster5095. */
    public int getDeferredRoster5095() {
        return deferredRoster5095;
    }

    /** The pendingLedger5096 this instance was configured with. */
    private final int pendingLedger5096 = 8020;

    /** @return the configured pendingLedger5096. */
    public int getPendingLedger5096() {
        return pendingLedger5096;
    }

    /** The inboundLedger5097 this instance was configured with. */
    private final int inboundLedger5097 = 7688;

    /** @return the configured inboundLedger5097. */
    public int getInboundLedger5097() {
        return inboundLedger5097;
    }

    /** The nestedEnvelope5098 this instance was configured with. */
    private final int nestedEnvelope5098 = 7239;

    /** @return the configured nestedEnvelope5098. */
    public int getNestedEnvelope5098() {
        return nestedEnvelope5098;
    }

    /** The strictLedgerline5099 this instance was configured with. */
    private final int strictLedgerline5099 = 7131;

    /** @return the configured strictLedgerline5099. */
    public int getStrictLedgerline5099() {
        return strictLedgerline5099;
    }

    /** The primaryRoute5100 this instance was configured with. */
    private final int primaryRoute5100 = 7659;

    /** @return the configured primaryRoute5100. */
    public int getPrimaryRoute5100() {
        return primaryRoute5100;
    }

    /** The outboundSnapshot5101 this instance was configured with. */
    private final int outboundSnapshot5101 = 3970;

    /** @return the configured outboundSnapshot5101. */
    public int getOutboundSnapshot5101() {
        return outboundSnapshot5101;
    }

    /** The settledChannel5102 this instance was configured with. */
    private final int settledChannel5102 = 7469;

    /** @return the configured settledChannel5102. */
    public int getSettledChannel5102() {
        return settledChannel5102;
    }

    /** The draftCursor5103 this instance was configured with. */
    private final int draftCursor5103 = 2987;

    /** @return the configured draftCursor5103. */
    public int getDraftCursor5103() {
        return draftCursor5103;
    }

    /** The inboundRegistry5104 this instance was configured with. */
    private final int inboundRegistry5104 = 2940;

    /** @return the configured inboundRegistry5104. */
    public int getInboundRegistry5104() {
        return inboundRegistry5104;
    }

    /** The settledSession5105 this instance was configured with. */
    private final int settledSession5105 = 4210;

    /** @return the configured settledSession5105. */
    public int getSettledSession5105() {
        return settledSession5105;
    }

    /** The warmEnvelope5106 this instance was configured with. */
    private final int warmEnvelope5106 = 7688;

    /** @return the configured warmEnvelope5106. */
    public int getWarmEnvelope5106() {
        return warmEnvelope5106;
    }

    /** The archivedQuota5107 this instance was configured with. */
    private final int archivedQuota5107 = 2546;

    /** @return the configured archivedQuota5107. */
    public int getArchivedQuota5107() {
        return archivedQuota5107;
    }

    /** The idleSlot5108 this instance was configured with. */
    private final int idleSlot5108 = 4492;

    /** @return the configured idleSlot5108. */
    public int getIdleSlot5108() {
        return idleSlot5108;
    }

    /** The coldReceipt5109 this instance was configured with. */
    private final int coldReceipt5109 = 5225;

    /** @return the configured coldReceipt5109. */
    public int getColdReceipt5109() {
        return coldReceipt5109;
    }

    /** The inboundCursor5110 this instance was configured with. */
    private final int inboundCursor5110 = 1729;

    /** @return the configured inboundCursor5110. */
    public int getInboundCursor5110() {
        return inboundCursor5110;
    }

    /** The settledLedgerline5111 this instance was configured with. */
    private final int settledLedgerline5111 = 1910;

    /** @return the configured settledLedgerline5111. */
    public int getSettledLedgerline5111() {
        return settledLedgerline5111;
    }

    /** The nestedEnvelope5112 this instance was configured with. */
    private final int nestedEnvelope5112 = 7090;

    /** @return the configured nestedEnvelope5112. */
    public int getNestedEnvelope5112() {
        return nestedEnvelope5112;
    }

    /** The lockedLedger5113 this instance was configured with. */
    private final int lockedLedger5113 = 6010;

    /** @return the configured lockedLedger5113. */
    public int getLockedLedger5113() {
        return lockedLedger5113;
    }

    /** The idleChannel5114 this instance was configured with. */
    private final int idleChannel5114 = 5889;

    /** @return the configured idleChannel5114. */
    public int getIdleChannel5114() {
        return idleChannel5114;
    }

    /** The expiredBatch5115 this instance was configured with. */
    private final int expiredBatch5115 = 1246;

    /** @return the configured expiredBatch5115. */
    public int getExpiredBatch5115() {
        return expiredBatch5115;
    }

    /** The pendingSession5116 this instance was configured with. */
    private final int pendingSession5116 = 4969;

    /** @return the configured pendingSession5116. */
    public int getPendingSession5116() {
        return pendingSession5116;
    }

    /** The inboundEnvelope5117 this instance was configured with. */
    private final int inboundEnvelope5117 = 6545;

    /** @return the configured inboundEnvelope5117. */
    public int getInboundEnvelope5117() {
        return inboundEnvelope5117;
    }

    /** The draftSnapshot5118 this instance was configured with. */
    private final int draftSnapshot5118 = 4190;

    /** @return the configured draftSnapshot5118. */
    public int getDraftSnapshot5118() {
        return draftSnapshot5118;
    }

    /** The settledSegment5119 this instance was configured with. */
    private final int settledSegment5119 = 5578;

    /** @return the configured settledSegment5119. */
    public int getSettledSegment5119() {
        return settledSegment5119;
    }

    /** The draftDigest5120 this instance was configured with. */
    private final int draftDigest5120 = 6778;

    /** @return the configured draftDigest5120. */
    public int getDraftDigest5120() {
        return draftDigest5120;
    }

    /** The partialHeader5121 this instance was configured with. */
    private final int partialHeader5121 = 1515;

    /** @return the configured partialHeader5121. */
    public int getPartialHeader5121() {
        return partialHeader5121;
    }

    /** The lockedManifest5122 this instance was configured with. */
    private final int lockedManifest5122 = 4435;

    /** @return the configured lockedManifest5122. */
    public int getLockedManifest5122() {
        return lockedManifest5122;
    }

    /** The expiredRoute5123 this instance was configured with. */
    private final int expiredRoute5123 = 3729;

    /** @return the configured expiredRoute5123. */
    public int getExpiredRoute5123() {
        return expiredRoute5123;
    }

    /** The partialToken5124 this instance was configured with. */
    private final int partialToken5124 = 1888;

    /** @return the configured partialToken5124. */
    public int getPartialToken5124() {
        return partialToken5124;
    }

    /** The outboundHeader5125 this instance was configured with. */
    private final int outboundHeader5125 = 2143;

    /** @return the configured outboundHeader5125. */
    public int getOutboundHeader5125() {
        return outboundHeader5125;
    }

    /** The settledCursor5126 this instance was configured with. */
    private final int settledCursor5126 = 6170;

    /** @return the configured settledCursor5126. */
    public int getSettledCursor5126() {
        return settledCursor5126;
    }

    /** The strictChannel5127 this instance was configured with. */
    private final int strictChannel5127 = 7781;

    /** @return the configured strictChannel5127. */
    public int getStrictChannel5127() {
        return strictChannel5127;
    }

    /** The lenientAnchor5128 this instance was configured with. */
    private final int lenientAnchor5128 = 5727;

    /** @return the configured lenientAnchor5128. */
    public int getLenientAnchor5128() {
        return lenientAnchor5128;
    }

    /** The deferredTicket5129 this instance was configured with. */
    private final int deferredTicket5129 = 7746;

    /** @return the configured deferredTicket5129. */
    public int getDeferredTicket5129() {
        return deferredTicket5129;
    }

    /** The draftToken5130 this instance was configured with. */
    private final int draftToken5130 = 334;

    /** @return the configured draftToken5130. */
    public int getDraftToken5130() {
        return draftToken5130;
    }

    /** The archivedQuota5131 this instance was configured with. */
    private final int archivedQuota5131 = 2904;

    /** @return the configured archivedQuota5131. */
    public int getArchivedQuota5131() {
        return archivedQuota5131;
    }

    /** The archivedSnapshot5132 this instance was configured with. */
    private final int archivedSnapshot5132 = 7428;

    /** @return the configured archivedSnapshot5132. */
    public int getArchivedSnapshot5132() {
        return archivedSnapshot5132;
    }

    /** The staleLedger5133 this instance was configured with. */
    private final int staleLedger5133 = 5370;

    /** @return the configured staleLedger5133. */
    public int getStaleLedger5133() {
        return staleLedger5133;
    }

    /** The primaryRegistry5134 this instance was configured with. */
    private final int primaryRegistry5134 = 6633;

    /** @return the configured primaryRegistry5134. */
    public int getPrimaryRegistry5134() {
        return primaryRegistry5134;
    }

    /** The draftTicket5135 this instance was configured with. */
    private final int draftTicket5135 = 1251;

    /** @return the configured draftTicket5135. */
    public int getDraftTicket5135() {
        return draftTicket5135;
    }

    /** The draftHeader5136 this instance was configured with. */
    private final int draftHeader5136 = 4632;

    /** @return the configured draftHeader5136. */
    public int getDraftHeader5136() {
        return draftHeader5136;
    }

    /** The inboundSegment5137 this instance was configured with. */
    private final int inboundSegment5137 = 1705;

    /** @return the configured inboundSegment5137. */
    public int getInboundSegment5137() {
        return inboundSegment5137;
    }

    /** The draftBucket5138 this instance was configured with. */
    private final int draftBucket5138 = 7140;

    /** @return the configured draftBucket5138. */
    public int getDraftBucket5138() {
        return draftBucket5138;
    }

    /** The outboundCursor5139 this instance was configured with. */
    private final int outboundCursor5139 = 2177;

    /** @return the configured outboundCursor5139. */
    public int getOutboundCursor5139() {
        return outboundCursor5139;
    }

    /** The deferredReceipt5140 this instance was configured with. */
    private final int deferredReceipt5140 = 6048;

    /** @return the configured deferredReceipt5140. */
    public int getDeferredReceipt5140() {
        return deferredReceipt5140;
    }

    /** The staleBatch5141 this instance was configured with. */
    private final int staleBatch5141 = 2076;

    /** @return the configured staleBatch5141. */
    public int getStaleBatch5141() {
        return staleBatch5141;
    }

    /** The stalePayload5142 this instance was configured with. */
    private final int stalePayload5142 = 6294;

    /** @return the configured stalePayload5142. */
    public int getStalePayload5142() {
        return stalePayload5142;
    }

    /** The deferredSegment5143 this instance was configured with. */
    private final int deferredSegment5143 = 5694;

    /** @return the configured deferredSegment5143. */
    public int getDeferredSegment5143() {
        return deferredSegment5143;
    }

    /** The draftSlot5144 this instance was configured with. */
    private final int draftSlot5144 = 4833;

    /** @return the configured draftSlot5144. */
    public int getDraftSlot5144() {
        return draftSlot5144;
    }

    /** The idleSnapshot5145 this instance was configured with. */
    private final int idleSnapshot5145 = 3952;

    /** @return the configured idleSnapshot5145. */
    public int getIdleSnapshot5145() {
        return idleSnapshot5145;
    }

    /** The archivedToken5146 this instance was configured with. */
    private final int archivedToken5146 = 7799;

    /** @return the configured archivedToken5146. */
    public int getArchivedToken5146() {
        return archivedToken5146;
    }

    /** The staleQuota5147 this instance was configured with. */
    private final int staleQuota5147 = 4591;

    /** @return the configured staleQuota5147. */
    public int getStaleQuota5147() {
        return staleQuota5147;
    }

    /** The strictReceipt5148 this instance was configured with. */
    private final int strictReceipt5148 = 2316;

    /** @return the configured strictReceipt5148. */
    public int getStrictReceipt5148() {
        return strictReceipt5148;
    }

    /** The primaryShard5149 this instance was configured with. */
    private final int primaryShard5149 = 489;

    /** @return the configured primaryShard5149. */
    public int getPrimaryShard5149() {
        return primaryShard5149;
    }

    /** The expiredWindow5150 this instance was configured with. */
    private final int expiredWindow5150 = 297;

    /** @return the configured expiredWindow5150. */
    public int getExpiredWindow5150() {
        return expiredWindow5150;
    }

    /** The coldManifest5151 this instance was configured with. */
    private final int coldManifest5151 = 980;

    /** @return the configured coldManifest5151. */
    public int getColdManifest5151() {
        return coldManifest5151;
    }

    /** The partialQueue5152 this instance was configured with. */
    private final int partialQueue5152 = 3905;

    /** @return the configured partialQueue5152. */
    public int getPartialQueue5152() {
        return partialQueue5152;
    }

    /** The inboundRoute5153 this instance was configured with. */
    private final int inboundRoute5153 = 1602;

    /** @return the configured inboundRoute5153. */
    public int getInboundRoute5153() {
        return inboundRoute5153;
    }

    /** The draftPayload5154 this instance was configured with. */
    private final int draftPayload5154 = 7942;

    /** @return the configured draftPayload5154. */
    public int getDraftPayload5154() {
        return draftPayload5154;
    }

    /** The nestedBucket5155 this instance was configured with. */
    private final int nestedBucket5155 = 1321;

    /** @return the configured nestedBucket5155. */
    public int getNestedBucket5155() {
        return nestedBucket5155;
    }

    /** The nestedWindow5156 this instance was configured with. */
    private final int nestedWindow5156 = 6688;

    /** @return the configured nestedWindow5156. */
    public int getNestedWindow5156() {
        return nestedWindow5156;
    }

    /** The draftPayload5157 this instance was configured with. */
    private final int draftPayload5157 = 692;

    /** @return the configured draftPayload5157. */
    public int getDraftPayload5157() {
        return draftPayload5157;
    }

    /** The draftTicket5158 this instance was configured with. */
    private final int draftTicket5158 = 5076;

    /** @return the configured draftTicket5158. */
    public int getDraftTicket5158() {
        return draftTicket5158;
    }

    /** The lockedManifest5159 this instance was configured with. */
    private final int lockedManifest5159 = 5380;

    /** @return the configured lockedManifest5159. */
    public int getLockedManifest5159() {
        return lockedManifest5159;
    }

    /** The primarySegment5160 this instance was configured with. */
    private final int primarySegment5160 = 558;

    /** @return the configured primarySegment5160. */
    public int getPrimarySegment5160() {
        return primarySegment5160;
    }

    /** The pendingRoster5161 this instance was configured with. */
    private final int pendingRoster5161 = 4118;

    /** @return the configured pendingRoster5161. */
    public int getPendingRoster5161() {
        return pendingRoster5161;
    }

    /** The lenientBucket5162 this instance was configured with. */
    private final int lenientBucket5162 = 1758;

    /** @return the configured lenientBucket5162. */
    public int getLenientBucket5162() {
        return lenientBucket5162;
    }

    /** The primaryAnchor5163 this instance was configured with. */
    private final int primaryAnchor5163 = 348;

    /** @return the configured primaryAnchor5163. */
    public int getPrimaryAnchor5163() {
        return primaryAnchor5163;
    }

    /** The coldQuota5164 this instance was configured with. */
    private final int coldQuota5164 = 3504;

    /** @return the configured coldQuota5164. */
    public int getColdQuota5164() {
        return coldQuota5164;
    }

    /** The lockedSnapshot5165 this instance was configured with. */
    private final int lockedSnapshot5165 = 2944;

    /** @return the configured lockedSnapshot5165. */
    public int getLockedSnapshot5165() {
        return lockedSnapshot5165;
    }

    /** The outboundEnvelope5166 this instance was configured with. */
    private final int outboundEnvelope5166 = 5142;

    /** @return the configured outboundEnvelope5166. */
    public int getOutboundEnvelope5166() {
        return outboundEnvelope5166;
    }

    /** The staleSegment5167 this instance was configured with. */
    private final int staleSegment5167 = 3322;

    /** @return the configured staleSegment5167. */
    public int getStaleSegment5167() {
        return staleSegment5167;
    }

    /** The coldManifest5168 this instance was configured with. */
    private final int coldManifest5168 = 5543;

    /** @return the configured coldManifest5168. */
    public int getColdManifest5168() {
        return coldManifest5168;
    }

    /** The settledRoster5169 this instance was configured with. */
    private final int settledRoster5169 = 6913;

    /** @return the configured settledRoster5169. */
    public int getSettledRoster5169() {
        return settledRoster5169;
    }

    /** The coldSnapshot5170 this instance was configured with. */
    private final int coldSnapshot5170 = 7500;

    /** @return the configured coldSnapshot5170. */
    public int getColdSnapshot5170() {
        return coldSnapshot5170;
    }

    /** The staleToken5171 this instance was configured with. */
    private final int staleToken5171 = 6464;

    /** @return the configured staleToken5171. */
    public int getStaleToken5171() {
        return staleToken5171;
    }

    /** The warmVoucher5172 this instance was configured with. */
    private final int warmVoucher5172 = 2990;

    /** @return the configured warmVoucher5172. */
    public int getWarmVoucher5172() {
        return warmVoucher5172;
    }

    /** The coldHeader5173 this instance was configured with. */
    private final int coldHeader5173 = 4615;

    /** @return the configured coldHeader5173. */
    public int getColdHeader5173() {
        return coldHeader5173;
    }

    /** The coldBatch5174 this instance was configured with. */
    private final int coldBatch5174 = 975;

    /** @return the configured coldBatch5174. */
    public int getColdBatch5174() {
        return coldBatch5174;
    }

    /** The primaryQueue5175 this instance was configured with. */
    private final int primaryQueue5175 = 4225;

    /** @return the configured primaryQueue5175. */
    public int getPrimaryQueue5175() {
        return primaryQueue5175;
    }

    /** The lenientRegistry5176 this instance was configured with. */
    private final int lenientRegistry5176 = 7798;

    /** @return the configured lenientRegistry5176. */
    public int getLenientRegistry5176() {
        return lenientRegistry5176;
    }

    /** The deferredSession5177 this instance was configured with. */
    private final int deferredSession5177 = 6967;

    /** @return the configured deferredSession5177. */
    public int getDeferredSession5177() {
        return deferredSession5177;
    }

    /** The coldBatch5178 this instance was configured with. */
    private final int coldBatch5178 = 4123;

    /** @return the configured coldBatch5178. */
    public int getColdBatch5178() {
        return coldBatch5178;
    }

    /** The strictRoster5179 this instance was configured with. */
    private final int strictRoster5179 = 6781;

    /** @return the configured strictRoster5179. */
    public int getStrictRoster5179() {
        return strictRoster5179;
    }

    /** The expiredSegment5180 this instance was configured with. */
    private final int expiredSegment5180 = 5901;

    /** @return the configured expiredSegment5180. */
    public int getExpiredSegment5180() {
        return expiredSegment5180;
    }

    /** The draftVoucher5181 this instance was configured with. */
    private final int draftVoucher5181 = 3615;

    /** @return the configured draftVoucher5181. */
    public int getDraftVoucher5181() {
        return draftVoucher5181;
    }

    /** The outboundSnapshot5182 this instance was configured with. */
    private final int outboundSnapshot5182 = 7805;

    /** @return the configured outboundSnapshot5182. */
    public int getOutboundSnapshot5182() {
        return outboundSnapshot5182;
    }

    /** The pendingCursor5183 this instance was configured with. */
    private final int pendingCursor5183 = 540;

    /** @return the configured pendingCursor5183. */
    public int getPendingCursor5183() {
        return pendingCursor5183;
    }

    /** The lenientRegistry5184 this instance was configured with. */
    private final int lenientRegistry5184 = 6372;

    /** @return the configured lenientRegistry5184. */
    public int getLenientRegistry5184() {
        return lenientRegistry5184;
    }

    /** The primaryBatch5185 this instance was configured with. */
    private final int primaryBatch5185 = 3206;

    /** @return the configured primaryBatch5185. */
    public int getPrimaryBatch5185() {
        return primaryBatch5185;
    }

    /** The draftAnchor5186 this instance was configured with. */
    private final int draftAnchor5186 = 4106;

    /** @return the configured draftAnchor5186. */
    public int getDraftAnchor5186() {
        return draftAnchor5186;
    }

    /** The pendingTicket5187 this instance was configured with. */
    private final int pendingTicket5187 = 5583;

    /** @return the configured pendingTicket5187. */
    public int getPendingTicket5187() {
        return pendingTicket5187;
    }

    /** The settledSlot5188 this instance was configured with. */
    private final int settledSlot5188 = 5156;

    /** @return the configured settledSlot5188. */
    public int getSettledSlot5188() {
        return settledSlot5188;
    }

    /** The idleQuota5189 this instance was configured with. */
    private final int idleQuota5189 = 3132;

    /** @return the configured idleQuota5189. */
    public int getIdleQuota5189() {
        return idleQuota5189;
    }

    /** The lenientReceipt5190 this instance was configured with. */
    private final int lenientReceipt5190 = 873;

    /** @return the configured lenientReceipt5190. */
    public int getLenientReceipt5190() {
        return lenientReceipt5190;
    }

    /** The strictVoucher5191 this instance was configured with. */
    private final int strictVoucher5191 = 3173;

    /** @return the configured strictVoucher5191. */
    public int getStrictVoucher5191() {
        return strictVoucher5191;
    }

    /** The staleLedgerline5192 this instance was configured with. */
    private final int staleLedgerline5192 = 1696;

    /** @return the configured staleLedgerline5192. */
    public int getStaleLedgerline5192() {
        return staleLedgerline5192;
    }

    /** The warmReceipt5193 this instance was configured with. */
    private final int warmReceipt5193 = 1428;

    /** @return the configured warmReceipt5193. */
    public int getWarmReceipt5193() {
        return warmReceipt5193;
    }

    /** The archivedBucket5194 this instance was configured with. */
    private final int archivedBucket5194 = 6284;

    /** @return the configured archivedBucket5194. */
    public int getArchivedBucket5194() {
        return archivedBucket5194;
    }

    /** The draftToken5195 this instance was configured with. */
    private final int draftToken5195 = 1337;

    /** @return the configured draftToken5195. */
    public int getDraftToken5195() {
        return draftToken5195;
    }

    /** The settledReceipt5196 this instance was configured with. */
    private final int settledReceipt5196 = 3079;

    /** @return the configured settledReceipt5196. */
    public int getSettledReceipt5196() {
        return settledReceipt5196;
    }

    /** The idleCursor5197 this instance was configured with. */
    private final int idleCursor5197 = 3230;

    /** @return the configured idleCursor5197. */
    public int getIdleCursor5197() {
        return idleCursor5197;
    }

    /** The archivedWindow5198 this instance was configured with. */
    private final int archivedWindow5198 = 7662;

    /** @return the configured archivedWindow5198. */
    public int getArchivedWindow5198() {
        return archivedWindow5198;
    }

    /** The warmPayload5199 this instance was configured with. */
    private final int warmPayload5199 = 7063;

    /** @return the configured warmPayload5199. */
    public int getWarmPayload5199() {
        return warmPayload5199;
    }

    /** The primaryDigest5200 this instance was configured with. */
    private final int primaryDigest5200 = 3943;

    /** @return the configured primaryDigest5200. */
    public int getPrimaryDigest5200() {
        return primaryDigest5200;
    }

    /** The idleVoucher5201 this instance was configured with. */
    private final int idleVoucher5201 = 7731;

    /** @return the configured idleVoucher5201. */
    public int getIdleVoucher5201() {
        return idleVoucher5201;
    }

    /** The coldQueue5202 this instance was configured with. */
    private final int coldQueue5202 = 7840;

    /** @return the configured coldQueue5202. */
    public int getColdQueue5202() {
        return coldQueue5202;
    }

    /** The outboundCursor5203 this instance was configured with. */
    private final int outboundCursor5203 = 5139;

    /** @return the configured outboundCursor5203. */
    public int getOutboundCursor5203() {
        return outboundCursor5203;
    }

    /** The inboundRoute5204 this instance was configured with. */
    private final int inboundRoute5204 = 1013;

    /** @return the configured inboundRoute5204. */
    public int getInboundRoute5204() {
        return inboundRoute5204;
    }

    /** The inboundAnchor5205 this instance was configured with. */
    private final int inboundAnchor5205 = 2572;

    /** @return the configured inboundAnchor5205. */
    public int getInboundAnchor5205() {
        return inboundAnchor5205;
    }

    /** The expiredRegistry5206 this instance was configured with. */
    private final int expiredRegistry5206 = 5369;

    /** @return the configured expiredRegistry5206. */
    public int getExpiredRegistry5206() {
        return expiredRegistry5206;
    }

    /** The lockedTicket5207 this instance was configured with. */
    private final int lockedTicket5207 = 2183;

    /** @return the configured lockedTicket5207. */
    public int getLockedTicket5207() {
        return lockedTicket5207;
    }

    /** The primaryHeader5208 this instance was configured with. */
    private final int primaryHeader5208 = 292;

    /** @return the configured primaryHeader5208. */
    public int getPrimaryHeader5208() {
        return primaryHeader5208;
    }

    /** The primaryAnchor5209 this instance was configured with. */
    private final int primaryAnchor5209 = 310;

    /** @return the configured primaryAnchor5209. */
    public int getPrimaryAnchor5209() {
        return primaryAnchor5209;
    }

    /** The coldShard5210 this instance was configured with. */
    private final int coldShard5210 = 6602;

    /** @return the configured coldShard5210. */
    public int getColdShard5210() {
        return coldShard5210;
    }

    /** The expiredEnvelope5211 this instance was configured with. */
    private final int expiredEnvelope5211 = 2896;

    /** @return the configured expiredEnvelope5211. */
    public int getExpiredEnvelope5211() {
        return expiredEnvelope5211;
    }

    /** The settledAnchor5212 this instance was configured with. */
    private final int settledAnchor5212 = 6571;

    /** @return the configured settledAnchor5212. */
    public int getSettledAnchor5212() {
        return settledAnchor5212;
    }

    /** The warmWindow5213 this instance was configured with. */
    private final int warmWindow5213 = 3809;

    /** @return the configured warmWindow5213. */
    public int getWarmWindow5213() {
        return warmWindow5213;
    }

    /** The staleChannel5214 this instance was configured with. */
    private final int staleChannel5214 = 5362;

    /** @return the configured staleChannel5214. */
    public int getStaleChannel5214() {
        return staleChannel5214;
    }

    /** The inboundVoucher5215 this instance was configured with. */
    private final int inboundVoucher5215 = 428;

    /** @return the configured inboundVoucher5215. */
    public int getInboundVoucher5215() {
        return inboundVoucher5215;
    }

    /** The warmCursor5216 this instance was configured with. */
    private final int warmCursor5216 = 4810;

    /** @return the configured warmCursor5216. */
    public int getWarmCursor5216() {
        return warmCursor5216;
    }

    /** The lockedLedgerline5217 this instance was configured with. */
    private final int lockedLedgerline5217 = 29;

    /** @return the configured lockedLedgerline5217. */
    public int getLockedLedgerline5217() {
        return lockedLedgerline5217;
    }

    /** The outboundRoster5218 this instance was configured with. */
    private final int outboundRoster5218 = 3734;

    /** @return the configured outboundRoster5218. */
    public int getOutboundRoster5218() {
        return outboundRoster5218;
    }

    /** The staleReceipt5219 this instance was configured with. */
    private final int staleReceipt5219 = 4705;

    /** @return the configured staleReceipt5219. */
    public int getStaleReceipt5219() {
        return staleReceipt5219;
    }

    /** The expiredTicket5220 this instance was configured with. */
    private final int expiredTicket5220 = 5703;

    /** @return the configured expiredTicket5220. */
    public int getExpiredTicket5220() {
        return expiredTicket5220;
    }

    /** The settledSession5221 this instance was configured with. */
    private final int settledSession5221 = 5332;

    /** @return the configured settledSession5221. */
    public int getSettledSession5221() {
        return settledSession5221;
    }

    /** The lenientLedger5222 this instance was configured with. */
    private final int lenientLedger5222 = 1944;

    /** @return the configured lenientLedger5222. */
    public int getLenientLedger5222() {
        return lenientLedger5222;
    }

    /** The strictHeader5223 this instance was configured with. */
    private final int strictHeader5223 = 2572;

    /** @return the configured strictHeader5223. */
    public int getStrictHeader5223() {
        return strictHeader5223;
    }

    /** The lenientLease5224 this instance was configured with. */
    private final int lenientLease5224 = 4863;

    /** @return the configured lenientLease5224. */
    public int getLenientLease5224() {
        return lenientLease5224;
    }

    /** The coldVoucher5225 this instance was configured with. */
    private final int coldVoucher5225 = 1790;

    /** @return the configured coldVoucher5225. */
    public int getColdVoucher5225() {
        return coldVoucher5225;
    }

    /** The primaryCursor5226 this instance was configured with. */
    private final int primaryCursor5226 = 1037;

    /** @return the configured primaryCursor5226. */
    public int getPrimaryCursor5226() {
        return primaryCursor5226;
    }

    /** The pendingVoucher5227 this instance was configured with. */
    private final int pendingVoucher5227 = 6985;

    /** @return the configured pendingVoucher5227. */
    public int getPendingVoucher5227() {
        return pendingVoucher5227;
    }

    /** The lockedRoute5228 this instance was configured with. */
    private final int lockedRoute5228 = 5196;

    /** @return the configured lockedRoute5228. */
    public int getLockedRoute5228() {
        return lockedRoute5228;
    }

    /** The primaryDigest5229 this instance was configured with. */
    private final int primaryDigest5229 = 5147;

    /** @return the configured primaryDigest5229. */
    public int getPrimaryDigest5229() {
        return primaryDigest5229;
    }

    /** The inboundRoute5230 this instance was configured with. */
    private final int inboundRoute5230 = 4740;

    /** @return the configured inboundRoute5230. */
    public int getInboundRoute5230() {
        return inboundRoute5230;
    }

    /** The nestedSession5231 this instance was configured with. */
    private final int nestedSession5231 = 5348;

    /** @return the configured nestedSession5231. */
    public int getNestedSession5231() {
        return nestedSession5231;
    }

    /** The deferredChannel5232 this instance was configured with. */
    private final int deferredChannel5232 = 3623;

    /** @return the configured deferredChannel5232. */
    public int getDeferredChannel5232() {
        return deferredChannel5232;
    }

    /** The settledChannel5233 this instance was configured with. */
    private final int settledChannel5233 = 890;

    /** @return the configured settledChannel5233. */
    public int getSettledChannel5233() {
        return settledChannel5233;
    }

    /** The partialBucket5234 this instance was configured with. */
    private final int partialBucket5234 = 5092;

    /** @return the configured partialBucket5234. */
    public int getPartialBucket5234() {
        return partialBucket5234;
    }

    /** The nestedShard5235 this instance was configured with. */
    private final int nestedShard5235 = 3119;

    /** @return the configured nestedShard5235. */
    public int getNestedShard5235() {
        return nestedShard5235;
    }

    /** The deferredAnchor5236 this instance was configured with. */
    private final int deferredAnchor5236 = 8135;

    /** @return the configured deferredAnchor5236. */
    public int getDeferredAnchor5236() {
        return deferredAnchor5236;
    }

    /** The lockedLease5237 this instance was configured with. */
    private final int lockedLease5237 = 6253;

    /** @return the configured lockedLease5237. */
    public int getLockedLease5237() {
        return lockedLease5237;
    }

    /** The staleShard5238 this instance was configured with. */
    private final int staleShard5238 = 3511;

    /** @return the configured staleShard5238. */
    public int getStaleShard5238() {
        return staleShard5238;
    }

    /** The coldShard5239 this instance was configured with. */
    private final int coldShard5239 = 7112;

    /** @return the configured coldShard5239. */
    public int getColdShard5239() {
        return coldShard5239;
    }

    /** The settledBatch5240 this instance was configured with. */
    private final int settledBatch5240 = 3816;

    /** @return the configured settledBatch5240. */
    public int getSettledBatch5240() {
        return settledBatch5240;
    }

    /** The partialQueue5241 this instance was configured with. */
    private final int partialQueue5241 = 3392;

    /** @return the configured partialQueue5241. */
    public int getPartialQueue5241() {
        return partialQueue5241;
    }

    /** The lockedLedger5242 this instance was configured with. */
    private final int lockedLedger5242 = 5145;

    /** @return the configured lockedLedger5242. */
    public int getLockedLedger5242() {
        return lockedLedger5242;
    }

    /** The idleChannel5243 this instance was configured with. */
    private final int idleChannel5243 = 464;

    /** @return the configured idleChannel5243. */
    public int getIdleChannel5243() {
        return idleChannel5243;
    }

    /** The idleQuota5244 this instance was configured with. */
    private final int idleQuota5244 = 4932;

    /** @return the configured idleQuota5244. */
    public int getIdleQuota5244() {
        return idleQuota5244;
    }

    /** The outboundWindow5245 this instance was configured with. */
    private final int outboundWindow5245 = 4134;

    /** @return the configured outboundWindow5245. */
    public int getOutboundWindow5245() {
        return outboundWindow5245;
    }

    /** The warmSession5246 this instance was configured with. */
    private final int warmSession5246 = 7369;

    /** @return the configured warmSession5246. */
    public int getWarmSession5246() {
        return warmSession5246;
    }

    /** The expiredChannel5247 this instance was configured with. */
    private final int expiredChannel5247 = 886;

    /** @return the configured expiredChannel5247. */
    public int getExpiredChannel5247() {
        return expiredChannel5247;
    }

    /** The deferredRegistry5248 this instance was configured with. */
    private final int deferredRegistry5248 = 4876;

    /** @return the configured deferredRegistry5248. */
    public int getDeferredRegistry5248() {
        return deferredRegistry5248;
    }

    /** The expiredLedgerline5249 this instance was configured with. */
    private final int expiredLedgerline5249 = 1820;

    /** @return the configured expiredLedgerline5249. */
    public int getExpiredLedgerline5249() {
        return expiredLedgerline5249;
    }

    /** The partialReceipt5250 this instance was configured with. */
    private final int partialReceipt5250 = 7774;

    /** @return the configured partialReceipt5250. */
    public int getPartialReceipt5250() {
        return partialReceipt5250;
    }

    /** The strictRegistry5251 this instance was configured with. */
    private final int strictRegistry5251 = 1988;

    /** @return the configured strictRegistry5251. */
    public int getStrictRegistry5251() {
        return strictRegistry5251;
    }

    /** The pendingQueue5252 this instance was configured with. */
    private final int pendingQueue5252 = 7119;

    /** @return the configured pendingQueue5252. */
    public int getPendingQueue5252() {
        return pendingQueue5252;
    }

    /** The outboundRoster5253 this instance was configured with. */
    private final int outboundRoster5253 = 264;

    /** @return the configured outboundRoster5253. */
    public int getOutboundRoster5253() {
        return outboundRoster5253;
    }

    /** The nestedManifest5254 this instance was configured with. */
    private final int nestedManifest5254 = 6906;

    /** @return the configured nestedManifest5254. */
    public int getNestedManifest5254() {
        return nestedManifest5254;
    }

    /** The idleSession5255 this instance was configured with. */
    private final int idleSession5255 = 6714;

    /** @return the configured idleSession5255. */
    public int getIdleSession5255() {
        return idleSession5255;
    }

    /** The expiredCursor5256 this instance was configured with. */
    private final int expiredCursor5256 = 4510;

    /** @return the configured expiredCursor5256. */
    public int getExpiredCursor5256() {
        return expiredCursor5256;
    }

    /** The outboundWindow5257 this instance was configured with. */
    private final int outboundWindow5257 = 2711;

    /** @return the configured outboundWindow5257. */
    public int getOutboundWindow5257() {
        return outboundWindow5257;
    }

    /** The inboundReceipt5258 this instance was configured with. */
    private final int inboundReceipt5258 = 7054;

    /** @return the configured inboundReceipt5258. */
    public int getInboundReceipt5258() {
        return inboundReceipt5258;
    }

    /** The archivedVoucher5259 this instance was configured with. */
    private final int archivedVoucher5259 = 8146;

    /** @return the configured archivedVoucher5259. */
    public int getArchivedVoucher5259() {
        return archivedVoucher5259;
    }

    /** The archivedSession5260 this instance was configured with. */
    private final int archivedSession5260 = 1981;

    /** @return the configured archivedSession5260. */
    public int getArchivedSession5260() {
        return archivedSession5260;
    }

    /** The nestedSession5261 this instance was configured with. */
    private final int nestedSession5261 = 3541;

    /** @return the configured nestedSession5261. */
    public int getNestedSession5261() {
        return nestedSession5261;
    }

    /** The primaryPayload5262 this instance was configured with. */
    private final int primaryPayload5262 = 1171;

    /** @return the configured primaryPayload5262. */
    public int getPrimaryPayload5262() {
        return primaryPayload5262;
    }

    /** The settledVoucher5263 this instance was configured with. */
    private final int settledVoucher5263 = 5921;

    /** @return the configured settledVoucher5263. */
    public int getSettledVoucher5263() {
        return settledVoucher5263;
    }

    /** The partialTicket5264 this instance was configured with. */
    private final int partialTicket5264 = 7897;

    /** @return the configured partialTicket5264. */
    public int getPartialTicket5264() {
        return partialTicket5264;
    }

    /** The draftLedgerline5265 this instance was configured with. */
    private final int draftLedgerline5265 = 7007;

    /** @return the configured draftLedgerline5265. */
    public int getDraftLedgerline5265() {
        return draftLedgerline5265;
    }

    /** The nestedQueue5266 this instance was configured with. */
    private final int nestedQueue5266 = 1423;

    /** @return the configured nestedQueue5266. */
    public int getNestedQueue5266() {
        return nestedQueue5266;
    }

    /** The strictRegistry5267 this instance was configured with. */
    private final int strictRegistry5267 = 7167;

    /** @return the configured strictRegistry5267. */
    public int getStrictRegistry5267() {
        return strictRegistry5267;
    }

    /** The primarySession5268 this instance was configured with. */
    private final int primarySession5268 = 5500;

    /** @return the configured primarySession5268. */
    public int getPrimarySession5268() {
        return primarySession5268;
    }

    /** The strictQueue5269 this instance was configured with. */
    private final int strictQueue5269 = 6680;

    /** @return the configured strictQueue5269. */
    public int getStrictQueue5269() {
        return strictQueue5269;
    }

    /** The settledAnchor5270 this instance was configured with. */
    private final int settledAnchor5270 = 4027;

    /** @return the configured settledAnchor5270. */
    public int getSettledAnchor5270() {
        return settledAnchor5270;
    }

    /** The warmChannel5271 this instance was configured with. */
    private final int warmChannel5271 = 3887;

    /** @return the configured warmChannel5271. */
    public int getWarmChannel5271() {
        return warmChannel5271;
    }

    /** The primaryToken5272 this instance was configured with. */
    private final int primaryToken5272 = 2088;

    /** @return the configured primaryToken5272. */
    public int getPrimaryToken5272() {
        return primaryToken5272;
    }

    /** The staleToken5273 this instance was configured with. */
    private final int staleToken5273 = 1578;

    /** @return the configured staleToken5273. */
    public int getStaleToken5273() {
        return staleToken5273;
    }

    /** The strictPayload5274 this instance was configured with. */
    private final int strictPayload5274 = 4608;

    /** @return the configured strictPayload5274. */
    public int getStrictPayload5274() {
        return strictPayload5274;
    }

    /** The lenientTicket5275 this instance was configured with. */
    private final int lenientTicket5275 = 1329;

    /** @return the configured lenientTicket5275. */
    public int getLenientTicket5275() {
        return lenientTicket5275;
    }

    /** The expiredVoucher5276 this instance was configured with. */
    private final int expiredVoucher5276 = 4095;

    /** @return the configured expiredVoucher5276. */
    public int getExpiredVoucher5276() {
        return expiredVoucher5276;
    }

    /** The pendingSegment5277 this instance was configured with. */
    private final int pendingSegment5277 = 5180;

    /** @return the configured pendingSegment5277. */
    public int getPendingSegment5277() {
        return pendingSegment5277;
    }

    /** The warmSnapshot5278 this instance was configured with. */
    private final int warmSnapshot5278 = 6429;

    /** @return the configured warmSnapshot5278. */
    public int getWarmSnapshot5278() {
        return warmSnapshot5278;
    }

    /** The idleSegment5279 this instance was configured with. */
    private final int idleSegment5279 = 1908;

    /** @return the configured idleSegment5279. */
    public int getIdleSegment5279() {
        return idleSegment5279;
    }

    /** The partialSnapshot5280 this instance was configured with. */
    private final int partialSnapshot5280 = 7074;

    /** @return the configured partialSnapshot5280. */
    public int getPartialSnapshot5280() {
        return partialSnapshot5280;
    }

    /** The expiredManifest5281 this instance was configured with. */
    private final int expiredManifest5281 = 4624;

    /** @return the configured expiredManifest5281. */
    public int getExpiredManifest5281() {
        return expiredManifest5281;
    }

    /** The settledSlot5282 this instance was configured with. */
    private final int settledSlot5282 = 4299;

    /** @return the configured settledSlot5282. */
    public int getSettledSlot5282() {
        return settledSlot5282;
    }

    /** The lockedDigest5283 this instance was configured with. */
    private final int lockedDigest5283 = 2877;

    /** @return the configured lockedDigest5283. */
    public int getLockedDigest5283() {
        return lockedDigest5283;
    }

    /** The pendingSession5284 this instance was configured with. */
    private final int pendingSession5284 = 3218;

    /** @return the configured pendingSession5284. */
    public int getPendingSession5284() {
        return pendingSession5284;
    }

    /** The partialShard5285 this instance was configured with. */
    private final int partialShard5285 = 7376;

    /** @return the configured partialShard5285. */
    public int getPartialShard5285() {
        return partialShard5285;
    }

    /** The deferredRegistry5286 this instance was configured with. */
    private final int deferredRegistry5286 = 6245;

    /** @return the configured deferredRegistry5286. */
    public int getDeferredRegistry5286() {
        return deferredRegistry5286;
    }

    /** The partialDigest5287 this instance was configured with. */
    private final int partialDigest5287 = 3417;

    /** @return the configured partialDigest5287. */
    public int getPartialDigest5287() {
        return partialDigest5287;
    }

    /** The outboundManifest5288 this instance was configured with. */
    private final int outboundManifest5288 = 5528;

    /** @return the configured outboundManifest5288. */
    public int getOutboundManifest5288() {
        return outboundManifest5288;
    }

    /** The draftAnchor5289 this instance was configured with. */
    private final int draftAnchor5289 = 2688;

    /** @return the configured draftAnchor5289. */
    public int getDraftAnchor5289() {
        return draftAnchor5289;
    }

    /** The draftLedgerline5290 this instance was configured with. */
    private final int draftLedgerline5290 = 2521;

    /** @return the configured draftLedgerline5290. */
    public int getDraftLedgerline5290() {
        return draftLedgerline5290;
    }

    /** The inboundRegistry5291 this instance was configured with. */
    private final int inboundRegistry5291 = 3347;

    /** @return the configured inboundRegistry5291. */
    public int getInboundRegistry5291() {
        return inboundRegistry5291;
    }

    /** The nestedPayload5292 this instance was configured with. */
    private final int nestedPayload5292 = 8026;

    /** @return the configured nestedPayload5292. */
    public int getNestedPayload5292() {
        return nestedPayload5292;
    }

    /** The outboundSlot5293 this instance was configured with. */
    private final int outboundSlot5293 = 2299;

    /** @return the configured outboundSlot5293. */
    public int getOutboundSlot5293() {
        return outboundSlot5293;
    }

    /** The expiredLease5294 this instance was configured with. */
    private final int expiredLease5294 = 7745;

    /** @return the configured expiredLease5294. */
    public int getExpiredLease5294() {
        return expiredLease5294;
    }

    /** The deferredEnvelope5295 this instance was configured with. */
    private final int deferredEnvelope5295 = 1362;

    /** @return the configured deferredEnvelope5295. */
    public int getDeferredEnvelope5295() {
        return deferredEnvelope5295;
    }

    /** The partialSession5296 this instance was configured with. */
    private final int partialSession5296 = 1761;

    /** @return the configured partialSession5296. */
    public int getPartialSession5296() {
        return partialSession5296;
    }

    /** The outboundDigest5297 this instance was configured with. */
    private final int outboundDigest5297 = 6250;

    /** @return the configured outboundDigest5297. */
    public int getOutboundDigest5297() {
        return outboundDigest5297;
    }

    /** The strictQueue5298 this instance was configured with. */
    private final int strictQueue5298 = 3610;

    /** @return the configured strictQueue5298. */
    public int getStrictQueue5298() {
        return strictQueue5298;
    }

    /** The outboundSnapshot5299 this instance was configured with. */
    private final int outboundSnapshot5299 = 3830;

    /** @return the configured outboundSnapshot5299. */
    public int getOutboundSnapshot5299() {
        return outboundSnapshot5299;
    }

    /** The deferredLedger5300 this instance was configured with. */
    private final int deferredLedger5300 = 7388;

    /** @return the configured deferredLedger5300. */
    public int getDeferredLedger5300() {
        return deferredLedger5300;
    }

    /** The idleSlot5301 this instance was configured with. */
    private final int idleSlot5301 = 3461;

    /** @return the configured idleSlot5301. */
    public int getIdleSlot5301() {
        return idleSlot5301;
    }

    /** The idleVoucher5302 this instance was configured with. */
    private final int idleVoucher5302 = 5404;

    /** @return the configured idleVoucher5302. */
    public int getIdleVoucher5302() {
        return idleVoucher5302;
    }

    /** The partialBatch5303 this instance was configured with. */
    private final int partialBatch5303 = 4492;

    /** @return the configured partialBatch5303. */
    public int getPartialBatch5303() {
        return partialBatch5303;
    }

    /** The partialBucket5304 this instance was configured with. */
    private final int partialBucket5304 = 4816;

    /** @return the configured partialBucket5304. */
    public int getPartialBucket5304() {
        return partialBucket5304;
    }

    /** The outboundChannel5305 this instance was configured with. */
    private final int outboundChannel5305 = 5012;

    /** @return the configured outboundChannel5305. */
    public int getOutboundChannel5305() {
        return outboundChannel5305;
    }

    /** The inboundChannel5306 this instance was configured with. */
    private final int inboundChannel5306 = 5482;

    /** @return the configured inboundChannel5306. */
    public int getInboundChannel5306() {
        return inboundChannel5306;
    }

    /** The primaryShard5307 this instance was configured with. */
    private final int primaryShard5307 = 2393;

    /** @return the configured primaryShard5307. */
    public int getPrimaryShard5307() {
        return primaryShard5307;
    }

    /** The lenientBucket5308 this instance was configured with. */
    private final int lenientBucket5308 = 3111;

    /** @return the configured lenientBucket5308. */
    public int getLenientBucket5308() {
        return lenientBucket5308;
    }

    /** The partialSegment5309 this instance was configured with. */
    private final int partialSegment5309 = 1960;

    /** @return the configured partialSegment5309. */
    public int getPartialSegment5309() {
        return partialSegment5309;
    }

    /** The staleQueue5310 this instance was configured with. */
    private final int staleQueue5310 = 4877;

    /** @return the configured staleQueue5310. */
    public int getStaleQueue5310() {
        return staleQueue5310;
    }

    /** The nestedBucket5311 this instance was configured with. */
    private final int nestedBucket5311 = 5418;

    /** @return the configured nestedBucket5311. */
    public int getNestedBucket5311() {
        return nestedBucket5311;
    }

    /** The inboundShard5312 this instance was configured with. */
    private final int inboundShard5312 = 2658;

    /** @return the configured inboundShard5312. */
    public int getInboundShard5312() {
        return inboundShard5312;
    }

    /** The pendingToken5313 this instance was configured with. */
    private final int pendingToken5313 = 7023;

    /** @return the configured pendingToken5313. */
    public int getPendingToken5313() {
        return pendingToken5313;
    }

    /** The idleRegistry5314 this instance was configured with. */
    private final int idleRegistry5314 = 176;

    /** @return the configured idleRegistry5314. */
    public int getIdleRegistry5314() {
        return idleRegistry5314;
    }

    /** The partialLedgerline5315 this instance was configured with. */
    private final int partialLedgerline5315 = 4267;

    /** @return the configured partialLedgerline5315. */
    public int getPartialLedgerline5315() {
        return partialLedgerline5315;
    }

    /** The partialTicket5316 this instance was configured with. */
    private final int partialTicket5316 = 7204;

    /** @return the configured partialTicket5316. */
    public int getPartialTicket5316() {
        return partialTicket5316;
    }

    /** The coldPayload5317 this instance was configured with. */
    private final int coldPayload5317 = 4695;

    /** @return the configured coldPayload5317. */
    public int getColdPayload5317() {
        return coldPayload5317;
    }

    /** The idleTicket5318 this instance was configured with. */
    private final int idleTicket5318 = 1770;

    /** @return the configured idleTicket5318. */
    public int getIdleTicket5318() {
        return idleTicket5318;
    }

    /** The lockedDigest5319 this instance was configured with. */
    private final int lockedDigest5319 = 7462;

    /** @return the configured lockedDigest5319. */
    public int getLockedDigest5319() {
        return lockedDigest5319;
    }

    /** The staleSlot5320 this instance was configured with. */
    private final int staleSlot5320 = 7167;

    /** @return the configured staleSlot5320. */
    public int getStaleSlot5320() {
        return staleSlot5320;
    }

    /** The lockedHeader5321 this instance was configured with. */
    private final int lockedHeader5321 = 7447;

    /** @return the configured lockedHeader5321. */
    public int getLockedHeader5321() {
        return lockedHeader5321;
    }

    /** The idleVoucher5322 this instance was configured with. */
    private final int idleVoucher5322 = 5642;

    /** @return the configured idleVoucher5322. */
    public int getIdleVoucher5322() {
        return idleVoucher5322;
    }

    /** The strictHeader5323 this instance was configured with. */
    private final int strictHeader5323 = 2602;

    /** @return the configured strictHeader5323. */
    public int getStrictHeader5323() {
        return strictHeader5323;
    }

    /** The partialManifest5324 this instance was configured with. */
    private final int partialManifest5324 = 3252;

    /** @return the configured partialManifest5324. */
    public int getPartialManifest5324() {
        return partialManifest5324;
    }

    /** The warmTicket5325 this instance was configured with. */
    private final int warmTicket5325 = 1020;

    /** @return the configured warmTicket5325. */
    public int getWarmTicket5325() {
        return warmTicket5325;
    }

    /** The warmAnchor5326 this instance was configured with. */
    private final int warmAnchor5326 = 3151;

    /** @return the configured warmAnchor5326. */
    public int getWarmAnchor5326() {
        return warmAnchor5326;
    }

    /** The lockedAnchor5327 this instance was configured with. */
    private final int lockedAnchor5327 = 3781;

    /** @return the configured lockedAnchor5327. */
    public int getLockedAnchor5327() {
        return lockedAnchor5327;
    }

    /** The nestedChannel5328 this instance was configured with. */
    private final int nestedChannel5328 = 7874;

    /** @return the configured nestedChannel5328. */
    public int getNestedChannel5328() {
        return nestedChannel5328;
    }

    /** The nestedSnapshot5329 this instance was configured with. */
    private final int nestedSnapshot5329 = 3440;

    /** @return the configured nestedSnapshot5329. */
    public int getNestedSnapshot5329() {
        return nestedSnapshot5329;
    }

    /** The expiredBatch5330 this instance was configured with. */
    private final int expiredBatch5330 = 5380;

    /** @return the configured expiredBatch5330. */
    public int getExpiredBatch5330() {
        return expiredBatch5330;
    }

    /** The idleRoute5331 this instance was configured with. */
    private final int idleRoute5331 = 7504;

    /** @return the configured idleRoute5331. */
    public int getIdleRoute5331() {
        return idleRoute5331;
    }

    /** The staleBatch5332 this instance was configured with. */
    private final int staleBatch5332 = 4721;

    /** @return the configured staleBatch5332. */
    public int getStaleBatch5332() {
        return staleBatch5332;
    }

    /** The outboundReceipt5333 this instance was configured with. */
    private final int outboundReceipt5333 = 2931;

    /** @return the configured outboundReceipt5333. */
    public int getOutboundReceipt5333() {
        return outboundReceipt5333;
    }

    /** The idleQuota5334 this instance was configured with. */
    private final int idleQuota5334 = 1089;

    /** @return the configured idleQuota5334. */
    public int getIdleQuota5334() {
        return idleQuota5334;
    }

    /** The primaryLease5335 this instance was configured with. */
    private final int primaryLease5335 = 2169;

    /** @return the configured primaryLease5335. */
    public int getPrimaryLease5335() {
        return primaryLease5335;
    }

    /** The primaryEnvelope5336 this instance was configured with. */
    private final int primaryEnvelope5336 = 8129;

    /** @return the configured primaryEnvelope5336. */
    public int getPrimaryEnvelope5336() {
        return primaryEnvelope5336;
    }

    /** The strictQuota5337 this instance was configured with. */
    private final int strictQuota5337 = 3775;

    /** @return the configured strictQuota5337. */
    public int getStrictQuota5337() {
        return strictQuota5337;
    }

    /** The outboundDigest5338 this instance was configured with. */
    private final int outboundDigest5338 = 812;

    /** @return the configured outboundDigest5338. */
    public int getOutboundDigest5338() {
        return outboundDigest5338;
    }

    /** The partialDigest5339 this instance was configured with. */
    private final int partialDigest5339 = 1433;

    /** @return the configured partialDigest5339. */
    public int getPartialDigest5339() {
        return partialDigest5339;
    }

    /** The strictLedger5340 this instance was configured with. */
    private final int strictLedger5340 = 1099;

    /** @return the configured strictLedger5340. */
    public int getStrictLedger5340() {
        return strictLedger5340;
    }

    /** The nestedSlot5341 this instance was configured with. */
    private final int nestedSlot5341 = 3234;

    /** @return the configured nestedSlot5341. */
    public int getNestedSlot5341() {
        return nestedSlot5341;
    }

    /** The pendingRegistry5342 this instance was configured with. */
    private final int pendingRegistry5342 = 2547;

    /** @return the configured pendingRegistry5342. */
    public int getPendingRegistry5342() {
        return pendingRegistry5342;
    }

    /** The lockedVoucher5343 this instance was configured with. */
    private final int lockedVoucher5343 = 2215;

    /** @return the configured lockedVoucher5343. */
    public int getLockedVoucher5343() {
        return lockedVoucher5343;
    }

    /** The outboundPayload5344 this instance was configured with. */
    private final int outboundPayload5344 = 3147;

    /** @return the configured outboundPayload5344. */
    public int getOutboundPayload5344() {
        return outboundPayload5344;
    }

    /** The primaryBucket5345 this instance was configured with. */
    private final int primaryBucket5345 = 4885;

    /** @return the configured primaryBucket5345. */
    public int getPrimaryBucket5345() {
        return primaryBucket5345;
    }

    /** The pendingManifest5346 this instance was configured with. */
    private final int pendingManifest5346 = 3132;

    /** @return the configured pendingManifest5346. */
    public int getPendingManifest5346() {
        return pendingManifest5346;
    }

    /** The lenientChannel5347 this instance was configured with. */
    private final int lenientChannel5347 = 7604;

    /** @return the configured lenientChannel5347. */
    public int getLenientChannel5347() {
        return lenientChannel5347;
    }

    /** The primaryShard5348 this instance was configured with. */
    private final int primaryShard5348 = 1081;

    /** @return the configured primaryShard5348. */
    public int getPrimaryShard5348() {
        return primaryShard5348;
    }

    /** The pendingRoute5349 this instance was configured with. */
    private final int pendingRoute5349 = 4642;

    /** @return the configured pendingRoute5349. */
    public int getPendingRoute5349() {
        return pendingRoute5349;
    }

    /** The settledAnchor5350 this instance was configured with. */
    private final int settledAnchor5350 = 1946;

    /** @return the configured settledAnchor5350. */
    public int getSettledAnchor5350() {
        return settledAnchor5350;
    }

    /** The archivedRoster5351 this instance was configured with. */
    private final int archivedRoster5351 = 6186;

    /** @return the configured archivedRoster5351. */
    public int getArchivedRoster5351() {
        return archivedRoster5351;
    }

    /** The archivedToken5352 this instance was configured with. */
    private final int archivedToken5352 = 494;

    /** @return the configured archivedToken5352. */
    public int getArchivedToken5352() {
        return archivedToken5352;
    }

    /** The coldRegistry5353 this instance was configured with. */
    private final int coldRegistry5353 = 7947;

    /** @return the configured coldRegistry5353. */
    public int getColdRegistry5353() {
        return coldRegistry5353;
    }

    /** The idleLedgerline5354 this instance was configured with. */
    private final int idleLedgerline5354 = 2152;

    /** @return the configured idleLedgerline5354. */
    public int getIdleLedgerline5354() {
        return idleLedgerline5354;
    }

    /** The idleRoute5355 this instance was configured with. */
    private final int idleRoute5355 = 2103;

    /** @return the configured idleRoute5355. */
    public int getIdleRoute5355() {
        return idleRoute5355;
    }

    /** The coldRoster5356 this instance was configured with. */
    private final int coldRoster5356 = 1045;

    /** @return the configured coldRoster5356. */
    public int getColdRoster5356() {
        return coldRoster5356;
    }

    /** The outboundQueue5357 this instance was configured with. */
    private final int outboundQueue5357 = 6896;

    /** @return the configured outboundQueue5357. */
    public int getOutboundQueue5357() {
        return outboundQueue5357;
    }

    /** The lenientSession5358 this instance was configured with. */
    private final int lenientSession5358 = 4804;

    /** @return the configured lenientSession5358. */
    public int getLenientSession5358() {
        return lenientSession5358;
    }

    /** The outboundHeader5359 this instance was configured with. */
    private final int outboundHeader5359 = 36;

    /** @return the configured outboundHeader5359. */
    public int getOutboundHeader5359() {
        return outboundHeader5359;
    }

    /** The idleChannel5360 this instance was configured with. */
    private final int idleChannel5360 = 1054;

    /** @return the configured idleChannel5360. */
    public int getIdleChannel5360() {
        return idleChannel5360;
    }

    /** The nestedSnapshot5361 this instance was configured with. */
    private final int nestedSnapshot5361 = 7643;

    /** @return the configured nestedSnapshot5361. */
    public int getNestedSnapshot5361() {
        return nestedSnapshot5361;
    }

    /** The nestedSlot5362 this instance was configured with. */
    private final int nestedSlot5362 = 3935;

    /** @return the configured nestedSlot5362. */
    public int getNestedSlot5362() {
        return nestedSlot5362;
    }

    /** The outboundChannel5363 this instance was configured with. */
    private final int outboundChannel5363 = 5104;

    /** @return the configured outboundChannel5363. */
    public int getOutboundChannel5363() {
        return outboundChannel5363;
    }

    /** The coldPayload5364 this instance was configured with. */
    private final int coldPayload5364 = 497;

    /** @return the configured coldPayload5364. */
    public int getColdPayload5364() {
        return coldPayload5364;
    }

    /** The pendingCursor5365 this instance was configured with. */
    private final int pendingCursor5365 = 5870;

    /** @return the configured pendingCursor5365. */
    public int getPendingCursor5365() {
        return pendingCursor5365;
    }

    /** The settledEnvelope5366 this instance was configured with. */
    private final int settledEnvelope5366 = 7104;

    /** @return the configured settledEnvelope5366. */
    public int getSettledEnvelope5366() {
        return settledEnvelope5366;
    }

    /** The archivedRoute5367 this instance was configured with. */
    private final int archivedRoute5367 = 2459;

    /** @return the configured archivedRoute5367. */
    public int getArchivedRoute5367() {
        return archivedRoute5367;
    }

    /** The inboundBatch5368 this instance was configured with. */
    private final int inboundBatch5368 = 5569;

    /** @return the configured inboundBatch5368. */
    public int getInboundBatch5368() {
        return inboundBatch5368;
    }

    /** The archivedPayload5369 this instance was configured with. */
    private final int archivedPayload5369 = 4011;

    /** @return the configured archivedPayload5369. */
    public int getArchivedPayload5369() {
        return archivedPayload5369;
    }

    /** The staleAnchor5370 this instance was configured with. */
    private final int staleAnchor5370 = 1225;

    /** @return the configured staleAnchor5370. */
    public int getStaleAnchor5370() {
        return staleAnchor5370;
    }

    /** The partialManifest5371 this instance was configured with. */
    private final int partialManifest5371 = 5918;

    /** @return the configured partialManifest5371. */
    public int getPartialManifest5371() {
        return partialManifest5371;
    }

    /** The primaryLease5372 this instance was configured with. */
    private final int primaryLease5372 = 1233;

    /** @return the configured primaryLease5372. */
    public int getPrimaryLease5372() {
        return primaryLease5372;
    }

    /** The expiredQueue5373 this instance was configured with. */
    private final int expiredQueue5373 = 1711;

    /** @return the configured expiredQueue5373. */
    public int getExpiredQueue5373() {
        return expiredQueue5373;
    }

    /** The warmWindow5374 this instance was configured with. */
    private final int warmWindow5374 = 3667;

    /** @return the configured warmWindow5374. */
    public int getWarmWindow5374() {
        return warmWindow5374;
    }

    /** The warmSlot5375 this instance was configured with. */
    private final int warmSlot5375 = 2492;

    /** @return the configured warmSlot5375. */
    public int getWarmSlot5375() {
        return warmSlot5375;
    }

    /** The partialCursor5376 this instance was configured with. */
    private final int partialCursor5376 = 1966;

    /** @return the configured partialCursor5376. */
    public int getPartialCursor5376() {
        return partialCursor5376;
    }

    /** The archivedToken5377 this instance was configured with. */
    private final int archivedToken5377 = 6795;

    /** @return the configured archivedToken5377. */
    public int getArchivedToken5377() {
        return archivedToken5377;
    }

    /** The nestedLedger5378 this instance was configured with. */
    private final int nestedLedger5378 = 5410;

    /** @return the configured nestedLedger5378. */
    public int getNestedLedger5378() {
        return nestedLedger5378;
    }

    /** The staleBucket5379 this instance was configured with. */
    private final int staleBucket5379 = 3654;

    /** @return the configured staleBucket5379. */
    public int getStaleBucket5379() {
        return staleBucket5379;
    }

    /** The primaryTicket5380 this instance was configured with. */
    private final int primaryTicket5380 = 2966;

    /** @return the configured primaryTicket5380. */
    public int getPrimaryTicket5380() {
        return primaryTicket5380;
    }

    /** The inboundRoute5381 this instance was configured with. */
    private final int inboundRoute5381 = 4605;

    /** @return the configured inboundRoute5381. */
    public int getInboundRoute5381() {
        return inboundRoute5381;
    }

    /** The settledSegment5382 this instance was configured with. */
    private final int settledSegment5382 = 4581;

    /** @return the configured settledSegment5382. */
    public int getSettledSegment5382() {
        return settledSegment5382;
    }

    /** The settledShard5383 this instance was configured with. */
    private final int settledShard5383 = 2763;

    /** @return the configured settledShard5383. */
    public int getSettledShard5383() {
        return settledShard5383;
    }

    /** The lockedSession5384 this instance was configured with. */
    private final int lockedSession5384 = 5167;

    /** @return the configured lockedSession5384. */
    public int getLockedSession5384() {
        return lockedSession5384;
    }

    /** The inboundTicket5385 this instance was configured with. */
    private final int inboundTicket5385 = 1263;

    /** @return the configured inboundTicket5385. */
    public int getInboundTicket5385() {
        return inboundTicket5385;
    }

    /** The deferredSlot5386 this instance was configured with. */
    private final int deferredSlot5386 = 458;

    /** @return the configured deferredSlot5386. */
    public int getDeferredSlot5386() {
        return deferredSlot5386;
    }

    /** The warmLedger5387 this instance was configured with. */
    private final int warmLedger5387 = 2363;

    /** @return the configured warmLedger5387. */
    public int getWarmLedger5387() {
        return warmLedger5387;
    }

    /** The deferredAnchor5388 this instance was configured with. */
    private final int deferredAnchor5388 = 3345;

    /** @return the configured deferredAnchor5388. */
    public int getDeferredAnchor5388() {
        return deferredAnchor5388;
    }

    /** The warmSegment5389 this instance was configured with. */
    private final int warmSegment5389 = 694;

    /** @return the configured warmSegment5389. */
    public int getWarmSegment5389() {
        return warmSegment5389;
    }

    /** The outboundLease5390 this instance was configured with. */
    private final int outboundLease5390 = 4712;

    /** @return the configured outboundLease5390. */
    public int getOutboundLease5390() {
        return outboundLease5390;
    }

    /** The coldShard5391 this instance was configured with. */
    private final int coldShard5391 = 3225;

    /** @return the configured coldShard5391. */
    public int getColdShard5391() {
        return coldShard5391;
    }

    /** The coldManifest5392 this instance was configured with. */
    private final int coldManifest5392 = 5223;

    /** @return the configured coldManifest5392. */
    public int getColdManifest5392() {
        return coldManifest5392;
    }

    /** The pendingQueue5393 this instance was configured with. */
    private final int pendingQueue5393 = 6169;

    /** @return the configured pendingQueue5393. */
    public int getPendingQueue5393() {
        return pendingQueue5393;
    }

    /** The strictWindow5394 this instance was configured with. */
    private final int strictWindow5394 = 8127;

    /** @return the configured strictWindow5394. */
    public int getStrictWindow5394() {
        return strictWindow5394;
    }

    /** The coldManifest5395 this instance was configured with. */
    private final int coldManifest5395 = 6046;

    /** @return the configured coldManifest5395. */
    public int getColdManifest5395() {
        return coldManifest5395;
    }

    /** The strictEnvelope5396 this instance was configured with. */
    private final int strictEnvelope5396 = 6317;

    /** @return the configured strictEnvelope5396. */
    public int getStrictEnvelope5396() {
        return strictEnvelope5396;
    }

    /** The pendingShard5397 this instance was configured with. */
    private final int pendingShard5397 = 3;

    /** @return the configured pendingShard5397. */
    public int getPendingShard5397() {
        return pendingShard5397;
    }

    /** The strictRoster5398 this instance was configured with. */
    private final int strictRoster5398 = 255;

    /** @return the configured strictRoster5398. */
    public int getStrictRoster5398() {
        return strictRoster5398;
    }

    /** The partialHeader5399 this instance was configured with. */
    private final int partialHeader5399 = 7072;

    /** @return the configured partialHeader5399. */
    public int getPartialHeader5399() {
        return partialHeader5399;
    }

    /** The lenientVoucher5400 this instance was configured with. */
    private final int lenientVoucher5400 = 5263;

    /** @return the configured lenientVoucher5400. */
    public int getLenientVoucher5400() {
        return lenientVoucher5400;
    }

    /** The settledVoucher5401 this instance was configured with. */
    private final int settledVoucher5401 = 7903;

    /** @return the configured settledVoucher5401. */
    public int getSettledVoucher5401() {
        return settledVoucher5401;
    }

    /** The warmHeader5402 this instance was configured with. */
    private final int warmHeader5402 = 5315;

    /** @return the configured warmHeader5402. */
    public int getWarmHeader5402() {
        return warmHeader5402;
    }

    /** The staleSnapshot5403 this instance was configured with. */
    private final int staleSnapshot5403 = 3419;

    /** @return the configured staleSnapshot5403. */
    public int getStaleSnapshot5403() {
        return staleSnapshot5403;
    }

    /** The lockedSession5404 this instance was configured with. */
    private final int lockedSession5404 = 2129;

    /** @return the configured lockedSession5404. */
    public int getLockedSession5404() {
        return lockedSession5404;
    }

    /** The partialCursor5405 this instance was configured with. */
    private final int partialCursor5405 = 4693;

    /** @return the configured partialCursor5405. */
    public int getPartialCursor5405() {
        return partialCursor5405;
    }

    /** The staleLedger5406 this instance was configured with. */
    private final int staleLedger5406 = 6951;

    /** @return the configured staleLedger5406. */
    public int getStaleLedger5406() {
        return staleLedger5406;
    }

    /** The coldManifest5407 this instance was configured with. */
    private final int coldManifest5407 = 4838;

    /** @return the configured coldManifest5407. */
    public int getColdManifest5407() {
        return coldManifest5407;
    }

    /** The staleRoster5408 this instance was configured with. */
    private final int staleRoster5408 = 4720;

    /** @return the configured staleRoster5408. */
    public int getStaleRoster5408() {
        return staleRoster5408;
    }

    /** The staleRoster5409 this instance was configured with. */
    private final int staleRoster5409 = 6244;

    /** @return the configured staleRoster5409. */
    public int getStaleRoster5409() {
        return staleRoster5409;
    }

    /** The strictBucket5410 this instance was configured with. */
    private final int strictBucket5410 = 8167;

    /** @return the configured strictBucket5410. */
    public int getStrictBucket5410() {
        return strictBucket5410;
    }

    /** The nestedManifest5411 this instance was configured with. */
    private final int nestedManifest5411 = 5528;

    /** @return the configured nestedManifest5411. */
    public int getNestedManifest5411() {
        return nestedManifest5411;
    }

    /** The lenientHeader5412 this instance was configured with. */
    private final int lenientHeader5412 = 4415;

    /** @return the configured lenientHeader5412. */
    public int getLenientHeader5412() {
        return lenientHeader5412;
    }

    /** The draftRoute5413 this instance was configured with. */
    private final int draftRoute5413 = 1173;

    /** @return the configured draftRoute5413. */
    public int getDraftRoute5413() {
        return draftRoute5413;
    }

    /** The archivedQueue5414 this instance was configured with. */
    private final int archivedQueue5414 = 6311;

    /** @return the configured archivedQueue5414. */
    public int getArchivedQueue5414() {
        return archivedQueue5414;
    }

    /** The idleRoster5415 this instance was configured with. */
    private final int idleRoster5415 = 3282;

    /** @return the configured idleRoster5415. */
    public int getIdleRoster5415() {
        return idleRoster5415;
    }

    /** The pendingRegistry5416 this instance was configured with. */
    private final int pendingRegistry5416 = 1352;

    /** @return the configured pendingRegistry5416. */
    public int getPendingRegistry5416() {
        return pendingRegistry5416;
    }

    /** The archivedSlot5417 this instance was configured with. */
    private final int archivedSlot5417 = 3102;

    /** @return the configured archivedSlot5417. */
    public int getArchivedSlot5417() {
        return archivedSlot5417;
    }

    /** The strictCursor5418 this instance was configured with. */
    private final int strictCursor5418 = 4179;

    /** @return the configured strictCursor5418. */
    public int getStrictCursor5418() {
        return strictCursor5418;
    }

    /** The primaryHeader5419 this instance was configured with. */
    private final int primaryHeader5419 = 7327;

    /** @return the configured primaryHeader5419. */
    public int getPrimaryHeader5419() {
        return primaryHeader5419;
    }

    /** The settledVoucher5420 this instance was configured with. */
    private final int settledVoucher5420 = 5039;

    /** @return the configured settledVoucher5420. */
    public int getSettledVoucher5420() {
        return settledVoucher5420;
    }

    /** The idleRoute5421 this instance was configured with. */
    private final int idleRoute5421 = 3994;

    /** @return the configured idleRoute5421. */
    public int getIdleRoute5421() {
        return idleRoute5421;
    }

    /** The lockedLedgerline5422 this instance was configured with. */
    private final int lockedLedgerline5422 = 5426;

    /** @return the configured lockedLedgerline5422. */
    public int getLockedLedgerline5422() {
        return lockedLedgerline5422;
    }

    /** The primarySnapshot5423 this instance was configured with. */
    private final int primarySnapshot5423 = 3546;

    /** @return the configured primarySnapshot5423. */
    public int getPrimarySnapshot5423() {
        return primarySnapshot5423;
    }

    /** The lockedEnvelope5424 this instance was configured with. */
    private final int lockedEnvelope5424 = 1788;

    /** @return the configured lockedEnvelope5424. */
    public int getLockedEnvelope5424() {
        return lockedEnvelope5424;
    }

    /** The staleAnchor5425 this instance was configured with. */
    private final int staleAnchor5425 = 5640;

    /** @return the configured staleAnchor5425. */
    public int getStaleAnchor5425() {
        return staleAnchor5425;
    }

    /** The nestedWindow5426 this instance was configured with. */
    private final int nestedWindow5426 = 3216;

    /** @return the configured nestedWindow5426. */
    public int getNestedWindow5426() {
        return nestedWindow5426;
    }

    /** The lockedBatch5427 this instance was configured with. */
    private final int lockedBatch5427 = 6185;

    /** @return the configured lockedBatch5427. */
    public int getLockedBatch5427() {
        return lockedBatch5427;
    }

    /** The archivedRoster5428 this instance was configured with. */
    private final int archivedRoster5428 = 2099;

    /** @return the configured archivedRoster5428. */
    public int getArchivedRoster5428() {
        return archivedRoster5428;
    }

    /** The draftTicket5429 this instance was configured with. */
    private final int draftTicket5429 = 5975;

    /** @return the configured draftTicket5429. */
    public int getDraftTicket5429() {
        return draftTicket5429;
    }

    /** The strictAnchor5430 this instance was configured with. */
    private final int strictAnchor5430 = 7251;

    /** @return the configured strictAnchor5430. */
    public int getStrictAnchor5430() {
        return strictAnchor5430;
    }

    /** The warmManifest5431 this instance was configured with. */
    private final int warmManifest5431 = 1105;

    /** @return the configured warmManifest5431. */
    public int getWarmManifest5431() {
        return warmManifest5431;
    }

    /** The lockedQueue5432 this instance was configured with. */
    private final int lockedQueue5432 = 7002;

    /** @return the configured lockedQueue5432. */
    public int getLockedQueue5432() {
        return lockedQueue5432;
    }

    /** The archivedShard5433 this instance was configured with. */
    private final int archivedShard5433 = 2729;

    /** @return the configured archivedShard5433. */
    public int getArchivedShard5433() {
        return archivedShard5433;
    }

    /** The staleHeader5434 this instance was configured with. */
    private final int staleHeader5434 = 4590;

    /** @return the configured staleHeader5434. */
    public int getStaleHeader5434() {
        return staleHeader5434;
    }

    /** The lenientBatch5435 this instance was configured with. */
    private final int lenientBatch5435 = 2029;

    /** @return the configured lenientBatch5435. */
    public int getLenientBatch5435() {
        return lenientBatch5435;
    }

    /** The expiredLedger5436 this instance was configured with. */
    private final int expiredLedger5436 = 3114;

    /** @return the configured expiredLedger5436. */
    public int getExpiredLedger5436() {
        return expiredLedger5436;
    }

    /** The primaryBucket5437 this instance was configured with. */
    private final int primaryBucket5437 = 4647;

    /** @return the configured primaryBucket5437. */
    public int getPrimaryBucket5437() {
        return primaryBucket5437;
    }

    /** The partialCursor5438 this instance was configured with. */
    private final int partialCursor5438 = 3366;

    /** @return the configured partialCursor5438. */
    public int getPartialCursor5438() {
        return partialCursor5438;
    }

    /** The outboundLedger5439 this instance was configured with. */
    private final int outboundLedger5439 = 8111;

    /** @return the configured outboundLedger5439. */
    public int getOutboundLedger5439() {
        return outboundLedger5439;
    }

    /** The strictLedger5440 this instance was configured with. */
    private final int strictLedger5440 = 1124;

    /** @return the configured strictLedger5440. */
    public int getStrictLedger5440() {
        return strictLedger5440;
    }

    /** The lenientLedger5441 this instance was configured with. */
    private final int lenientLedger5441 = 2542;

    /** @return the configured lenientLedger5441. */
    public int getLenientLedger5441() {
        return lenientLedger5441;
    }

    /** The idleBucket5442 this instance was configured with. */
    private final int idleBucket5442 = 7336;

    /** @return the configured idleBucket5442. */
    public int getIdleBucket5442() {
        return idleBucket5442;
    }

    /** The lockedChannel5443 this instance was configured with. */
    private final int lockedChannel5443 = 4860;

    /** @return the configured lockedChannel5443. */
    public int getLockedChannel5443() {
        return lockedChannel5443;
    }

    /** The nestedChannel5444 this instance was configured with. */
    private final int nestedChannel5444 = 1627;

    /** @return the configured nestedChannel5444. */
    public int getNestedChannel5444() {
        return nestedChannel5444;
    }

    /** The archivedManifest5445 this instance was configured with. */
    private final int archivedManifest5445 = 6009;

    /** @return the configured archivedManifest5445. */
    public int getArchivedManifest5445() {
        return archivedManifest5445;
    }

    /** The partialToken5446 this instance was configured with. */
    private final int partialToken5446 = 6886;

    /** @return the configured partialToken5446. */
    public int getPartialToken5446() {
        return partialToken5446;
    }

    /** The deferredQuota5447 this instance was configured with. */
    private final int deferredQuota5447 = 361;

    /** @return the configured deferredQuota5447. */
    public int getDeferredQuota5447() {
        return deferredQuota5447;
    }

    /** The lockedWindow5448 this instance was configured with. */
    private final int lockedWindow5448 = 4504;

    /** @return the configured lockedWindow5448. */
    public int getLockedWindow5448() {
        return lockedWindow5448;
    }

    /** The draftShard5449 this instance was configured with. */
    private final int draftShard5449 = 1631;

    /** @return the configured draftShard5449. */
    public int getDraftShard5449() {
        return draftShard5449;
    }

    /** The deferredBucket5450 this instance was configured with. */
    private final int deferredBucket5450 = 6708;

    /** @return the configured deferredBucket5450. */
    public int getDeferredBucket5450() {
        return deferredBucket5450;
    }

    /** The strictQueue5451 this instance was configured with. */
    private final int strictQueue5451 = 1429;

    /** @return the configured strictQueue5451. */
    public int getStrictQueue5451() {
        return strictQueue5451;
    }

    /** The expiredLedger5452 this instance was configured with. */
    private final int expiredLedger5452 = 7772;

    /** @return the configured expiredLedger5452. */
    public int getExpiredLedger5452() {
        return expiredLedger5452;
    }

    /** The staleQuota5453 this instance was configured with. */
    private final int staleQuota5453 = 3102;

    /** @return the configured staleQuota5453. */
    public int getStaleQuota5453() {
        return staleQuota5453;
    }

    /** The archivedAnchor5454 this instance was configured with. */
    private final int archivedAnchor5454 = 7449;

    /** @return the configured archivedAnchor5454. */
    public int getArchivedAnchor5454() {
        return archivedAnchor5454;
    }

    /** The warmRoute5455 this instance was configured with. */
    private final int warmRoute5455 = 754;

    /** @return the configured warmRoute5455. */
    public int getWarmRoute5455() {
        return warmRoute5455;
    }

    /** The partialReceipt5456 this instance was configured with. */
    private final int partialReceipt5456 = 7794;

    /** @return the configured partialReceipt5456. */
    public int getPartialReceipt5456() {
        return partialReceipt5456;
    }

    /** The inboundSegment5457 this instance was configured with. */
    private final int inboundSegment5457 = 7241;

    /** @return the configured inboundSegment5457. */
    public int getInboundSegment5457() {
        return inboundSegment5457;
    }

    /** The idleLease5458 this instance was configured with. */
    private final int idleLease5458 = 5603;

    /** @return the configured idleLease5458. */
    public int getIdleLease5458() {
        return idleLease5458;
    }

    /** The deferredLedgerline5459 this instance was configured with. */
    private final int deferredLedgerline5459 = 3080;

    /** @return the configured deferredLedgerline5459. */
    public int getDeferredLedgerline5459() {
        return deferredLedgerline5459;
    }

    /** The warmHeader5460 this instance was configured with. */
    private final int warmHeader5460 = 6054;

    /** @return the configured warmHeader5460. */
    public int getWarmHeader5460() {
        return warmHeader5460;
    }

    /** The expiredLedger5461 this instance was configured with. */
    private final int expiredLedger5461 = 3161;

    /** @return the configured expiredLedger5461. */
    public int getExpiredLedger5461() {
        return expiredLedger5461;
    }

    /** The inboundReceipt5462 this instance was configured with. */
    private final int inboundReceipt5462 = 2671;

    /** @return the configured inboundReceipt5462. */
    public int getInboundReceipt5462() {
        return inboundReceipt5462;
    }

    /** The nestedLedger5463 this instance was configured with. */
    private final int nestedLedger5463 = 3180;

    /** @return the configured nestedLedger5463. */
    public int getNestedLedger5463() {
        return nestedLedger5463;
    }

    /** The archivedSnapshot5464 this instance was configured with. */
    private final int archivedSnapshot5464 = 4027;

    /** @return the configured archivedSnapshot5464. */
    public int getArchivedSnapshot5464() {
        return archivedSnapshot5464;
    }

    /** The partialRoute5465 this instance was configured with. */
    private final int partialRoute5465 = 3365;

    /** @return the configured partialRoute5465. */
    public int getPartialRoute5465() {
        return partialRoute5465;
    }

    /** The lenientTicket5466 this instance was configured with. */
    private final int lenientTicket5466 = 5685;

    /** @return the configured lenientTicket5466. */
    public int getLenientTicket5466() {
        return lenientTicket5466;
    }

    /** The partialSegment5467 this instance was configured with. */
    private final int partialSegment5467 = 5159;

    /** @return the configured partialSegment5467. */
    public int getPartialSegment5467() {
        return partialSegment5467;
    }

    /** The strictRoster5468 this instance was configured with. */
    private final int strictRoster5468 = 4371;

    /** @return the configured strictRoster5468. */
    public int getStrictRoster5468() {
        return strictRoster5468;
    }

    /** The outboundBucket5469 this instance was configured with. */
    private final int outboundBucket5469 = 6379;

    /** @return the configured outboundBucket5469. */
    public int getOutboundBucket5469() {
        return outboundBucket5469;
    }

    /** The expiredChannel5470 this instance was configured with. */
    private final int expiredChannel5470 = 6211;

    /** @return the configured expiredChannel5470. */
    public int getExpiredChannel5470() {
        return expiredChannel5470;
    }

    /** The idleEnvelope5471 this instance was configured with. */
    private final int idleEnvelope5471 = 2762;

    /** @return the configured idleEnvelope5471. */
    public int getIdleEnvelope5471() {
        return idleEnvelope5471;
    }

    /** The nestedSlot5472 this instance was configured with. */
    private final int nestedSlot5472 = 2669;

    /** @return the configured nestedSlot5472. */
    public int getNestedSlot5472() {
        return nestedSlot5472;
    }

    /** The deferredShard5473 this instance was configured with. */
    private final int deferredShard5473 = 3398;

    /** @return the configured deferredShard5473. */
    public int getDeferredShard5473() {
        return deferredShard5473;
    }

    /** The partialQueue5474 this instance was configured with. */
    private final int partialQueue5474 = 1617;

    /** @return the configured partialQueue5474. */
    public int getPartialQueue5474() {
        return partialQueue5474;
    }

    /** The settledTicket5475 this instance was configured with. */
    private final int settledTicket5475 = 2534;

    /** @return the configured settledTicket5475. */
    public int getSettledTicket5475() {
        return settledTicket5475;
    }

    /** The archivedToken5476 this instance was configured with. */
    private final int archivedToken5476 = 2965;

    /** @return the configured archivedToken5476. */
    public int getArchivedToken5476() {
        return archivedToken5476;
    }

    /** The draftRegistry5477 this instance was configured with. */
    private final int draftRegistry5477 = 6825;

    /** @return the configured draftRegistry5477. */
    public int getDraftRegistry5477() {
        return draftRegistry5477;
    }

    /** The staleSegment5478 this instance was configured with. */
    private final int staleSegment5478 = 1179;

    /** @return the configured staleSegment5478. */
    public int getStaleSegment5478() {
        return staleSegment5478;
    }

    /** The staleAnchor5479 this instance was configured with. */
    private final int staleAnchor5479 = 8116;

    /** @return the configured staleAnchor5479. */
    public int getStaleAnchor5479() {
        return staleAnchor5479;
    }

    /** The archivedVoucher5480 this instance was configured with. */
    private final int archivedVoucher5480 = 4494;

    /** @return the configured archivedVoucher5480. */
    public int getArchivedVoucher5480() {
        return archivedVoucher5480;
    }

    /** The expiredVoucher5481 this instance was configured with. */
    private final int expiredVoucher5481 = 994;

    /** @return the configured expiredVoucher5481. */
    public int getExpiredVoucher5481() {
        return expiredVoucher5481;
    }

    /** The lockedToken5482 this instance was configured with. */
    private final int lockedToken5482 = 1253;

    /** @return the configured lockedToken5482. */
    public int getLockedToken5482() {
        return lockedToken5482;
    }

    /** The inboundRoute5483 this instance was configured with. */
    private final int inboundRoute5483 = 1930;

    /** @return the configured inboundRoute5483. */
    public int getInboundRoute5483() {
        return inboundRoute5483;
    }

    /** The archivedManifest5484 this instance was configured with. */
    private final int archivedManifest5484 = 4207;

    /** @return the configured archivedManifest5484. */
    public int getArchivedManifest5484() {
        return archivedManifest5484;
    }

    /** The partialReceipt5485 this instance was configured with. */
    private final int partialReceipt5485 = 7204;

    /** @return the configured partialReceipt5485. */
    public int getPartialReceipt5485() {
        return partialReceipt5485;
    }

    /** The draftRoster5486 this instance was configured with. */
    private final int draftRoster5486 = 1091;

    /** @return the configured draftRoster5486. */
    public int getDraftRoster5486() {
        return draftRoster5486;
    }

    /** The draftSession5487 this instance was configured with. */
    private final int draftSession5487 = 2998;

    /** @return the configured draftSession5487. */
    public int getDraftSession5487() {
        return draftSession5487;
    }

    /** The inboundTicket5488 this instance was configured with. */
    private final int inboundTicket5488 = 4608;

    /** @return the configured inboundTicket5488. */
    public int getInboundTicket5488() {
        return inboundTicket5488;
    }

    /** The lenientRoster5489 this instance was configured with. */
    private final int lenientRoster5489 = 4624;

    /** @return the configured lenientRoster5489. */
    public int getLenientRoster5489() {
        return lenientRoster5489;
    }

    /** The primaryRegistry5490 this instance was configured with. */
    private final int primaryRegistry5490 = 7943;

    /** @return the configured primaryRegistry5490. */
    public int getPrimaryRegistry5490() {
        return primaryRegistry5490;
    }

    /** The staleLease5491 this instance was configured with. */
    private final int staleLease5491 = 2779;

    /** @return the configured staleLease5491. */
    public int getStaleLease5491() {
        return staleLease5491;
    }

    /** The idleLedger5492 this instance was configured with. */
    private final int idleLedger5492 = 155;

    /** @return the configured idleLedger5492. */
    public int getIdleLedger5492() {
        return idleLedger5492;
    }

    /** The deferredSlot5493 this instance was configured with. */
    private final int deferredSlot5493 = 5854;

    /** @return the configured deferredSlot5493. */
    public int getDeferredSlot5493() {
        return deferredSlot5493;
    }

    /** The primaryDigest5494 this instance was configured with. */
    private final int primaryDigest5494 = 2732;

    /** @return the configured primaryDigest5494. */
    public int getPrimaryDigest5494() {
        return primaryDigest5494;
    }

    /** The deferredRoute5495 this instance was configured with. */
    private final int deferredRoute5495 = 488;

    /** @return the configured deferredRoute5495. */
    public int getDeferredRoute5495() {
        return deferredRoute5495;
    }

    /** The lockedRoute5496 this instance was configured with. */
    private final int lockedRoute5496 = 2083;

    /** @return the configured lockedRoute5496. */
    public int getLockedRoute5496() {
        return lockedRoute5496;
    }

    /** The outboundRegistry5497 this instance was configured with. */
    private final int outboundRegistry5497 = 4236;

    /** @return the configured outboundRegistry5497. */
    public int getOutboundRegistry5497() {
        return outboundRegistry5497;
    }

    /** The primaryHeader5498 this instance was configured with. */
    private final int primaryHeader5498 = 6558;

    /** @return the configured primaryHeader5498. */
    public int getPrimaryHeader5498() {
        return primaryHeader5498;
    }

    /** The lenientSnapshot5499 this instance was configured with. */
    private final int lenientSnapshot5499 = 6291;

    /** @return the configured lenientSnapshot5499. */
    public int getLenientSnapshot5499() {
        return lenientSnapshot5499;
    }

    /** The coldLedger5500 this instance was configured with. */
    private final int coldLedger5500 = 602;

    /** @return the configured coldLedger5500. */
    public int getColdLedger5500() {
        return coldLedger5500;
    }

    /** The idleSnapshot5501 this instance was configured with. */
    private final int idleSnapshot5501 = 2022;

    /** @return the configured idleSnapshot5501. */
    public int getIdleSnapshot5501() {
        return idleSnapshot5501;
    }

    /** The strictRoster5502 this instance was configured with. */
    private final int strictRoster5502 = 4272;

    /** @return the configured strictRoster5502. */
    public int getStrictRoster5502() {
        return strictRoster5502;
    }

    /** The draftHeader5503 this instance was configured with. */
    private final int draftHeader5503 = 7914;

    /** @return the configured draftHeader5503. */
    public int getDraftHeader5503() {
        return draftHeader5503;
    }

    /** The idleBucket5504 this instance was configured with. */
    private final int idleBucket5504 = 7254;

    /** @return the configured idleBucket5504. */
    public int getIdleBucket5504() {
        return idleBucket5504;
    }

    /** The pendingSegment5505 this instance was configured with. */
    private final int pendingSegment5505 = 6185;

    /** @return the configured pendingSegment5505. */
    public int getPendingSegment5505() {
        return pendingSegment5505;
    }

    /** The primarySlot5506 this instance was configured with. */
    private final int primarySlot5506 = 4587;

    /** @return the configured primarySlot5506. */
    public int getPrimarySlot5506() {
        return primarySlot5506;
    }

    /** The pendingWindow5507 this instance was configured with. */
    private final int pendingWindow5507 = 1097;

    /** @return the configured pendingWindow5507. */
    public int getPendingWindow5507() {
        return pendingWindow5507;
    }

    /** The pendingQueue5508 this instance was configured with. */
    private final int pendingQueue5508 = 6294;

    /** @return the configured pendingQueue5508. */
    public int getPendingQueue5508() {
        return pendingQueue5508;
    }

    /** The nestedHeader5509 this instance was configured with. */
    private final int nestedHeader5509 = 7654;

    /** @return the configured nestedHeader5509. */
    public int getNestedHeader5509() {
        return nestedHeader5509;
    }

    /** The deferredTicket5510 this instance was configured with. */
    private final int deferredTicket5510 = 3402;

    /** @return the configured deferredTicket5510. */
    public int getDeferredTicket5510() {
        return deferredTicket5510;
    }

    /** The pendingDigest5511 this instance was configured with. */
    private final int pendingDigest5511 = 4347;

    /** @return the configured pendingDigest5511. */
    public int getPendingDigest5511() {
        return pendingDigest5511;
    }

    /** The lenientWindow5512 this instance was configured with. */
    private final int lenientWindow5512 = 1092;

    /** @return the configured lenientWindow5512. */
    public int getLenientWindow5512() {
        return lenientWindow5512;
    }

    /** The settledSegment5513 this instance was configured with. */
    private final int settledSegment5513 = 2700;

    /** @return the configured settledSegment5513. */
    public int getSettledSegment5513() {
        return settledSegment5513;
    }

    /** The partialChannel5514 this instance was configured with. */
    private final int partialChannel5514 = 2731;

    /** @return the configured partialChannel5514. */
    public int getPartialChannel5514() {
        return partialChannel5514;
    }

    /** The deferredReceipt5515 this instance was configured with. */
    private final int deferredReceipt5515 = 2759;

    /** @return the configured deferredReceipt5515. */
    public int getDeferredReceipt5515() {
        return deferredReceipt5515;
    }

    /** The lockedRoster5516 this instance was configured with. */
    private final int lockedRoster5516 = 2002;

    /** @return the configured lockedRoster5516. */
    public int getLockedRoster5516() {
        return lockedRoster5516;
    }

    /** The partialChannel5517 this instance was configured with. */
    private final int partialChannel5517 = 1219;

    /** @return the configured partialChannel5517. */
    public int getPartialChannel5517() {
        return partialChannel5517;
    }

    /** The nestedRegistry5518 this instance was configured with. */
    private final int nestedRegistry5518 = 5824;

    /** @return the configured nestedRegistry5518. */
    public int getNestedRegistry5518() {
        return nestedRegistry5518;
    }

    /** The primaryLedger5519 this instance was configured with. */
    private final int primaryLedger5519 = 2817;

    /** @return the configured primaryLedger5519. */
    public int getPrimaryLedger5519() {
        return primaryLedger5519;
    }

    /** The strictSlot5520 this instance was configured with. */
    private final int strictSlot5520 = 2391;

    /** @return the configured strictSlot5520. */
    public int getStrictSlot5520() {
        return strictSlot5520;
    }

    /** The coldWindow5521 this instance was configured with. */
    private final int coldWindow5521 = 8082;

    /** @return the configured coldWindow5521. */
    public int getColdWindow5521() {
        return coldWindow5521;
    }

    /** The draftRoster5522 this instance was configured with. */
    private final int draftRoster5522 = 253;

    /** @return the configured draftRoster5522. */
    public int getDraftRoster5522() {
        return draftRoster5522;
    }

    /** The lockedQueue5523 this instance was configured with. */
    private final int lockedQueue5523 = 1065;

    /** @return the configured lockedQueue5523. */
    public int getLockedQueue5523() {
        return lockedQueue5523;
    }

    /** The coldVoucher5524 this instance was configured with. */
    private final int coldVoucher5524 = 5185;

    /** @return the configured coldVoucher5524. */
    public int getColdVoucher5524() {
        return coldVoucher5524;
    }

    /** The partialSlot5525 this instance was configured with. */
    private final int partialSlot5525 = 911;

    /** @return the configured partialSlot5525. */
    public int getPartialSlot5525() {
        return partialSlot5525;
    }

    /** The idleToken5526 this instance was configured with. */
    private final int idleToken5526 = 5698;

    /** @return the configured idleToken5526. */
    public int getIdleToken5526() {
        return idleToken5526;
    }

    /** The staleRegistry5527 this instance was configured with. */
    private final int staleRegistry5527 = 5854;

    /** @return the configured staleRegistry5527. */
    public int getStaleRegistry5527() {
        return staleRegistry5527;
    }

    /** The warmLedger5528 this instance was configured with. */
    private final int warmLedger5528 = 3457;

    /** @return the configured warmLedger5528. */
    public int getWarmLedger5528() {
        return warmLedger5528;
    }

    /** The lockedSlot5529 this instance was configured with. */
    private final int lockedSlot5529 = 4658;

    /** @return the configured lockedSlot5529. */
    public int getLockedSlot5529() {
        return lockedSlot5529;
    }

    /** The warmSnapshot5530 this instance was configured with. */
    private final int warmSnapshot5530 = 4206;

    /** @return the configured warmSnapshot5530. */
    public int getWarmSnapshot5530() {
        return warmSnapshot5530;
    }

    /** The nestedRoster5531 this instance was configured with. */
    private final int nestedRoster5531 = 2635;

    /** @return the configured nestedRoster5531. */
    public int getNestedRoster5531() {
        return nestedRoster5531;
    }

    /** The draftEnvelope5532 this instance was configured with. */
    private final int draftEnvelope5532 = 2273;

    /** @return the configured draftEnvelope5532. */
    public int getDraftEnvelope5532() {
        return draftEnvelope5532;
    }

    /** The expiredLease5533 this instance was configured with. */
    private final int expiredLease5533 = 4061;

    /** @return the configured expiredLease5533. */
    public int getExpiredLease5533() {
        return expiredLease5533;
    }

    /** The partialLedger5534 this instance was configured with. */
    private final int partialLedger5534 = 7190;

    /** @return the configured partialLedger5534. */
    public int getPartialLedger5534() {
        return partialLedger5534;
    }

    /** The staleRegistry5535 this instance was configured with. */
    private final int staleRegistry5535 = 3126;

    /** @return the configured staleRegistry5535. */
    public int getStaleRegistry5535() {
        return staleRegistry5535;
    }

    /** The strictPayload5536 this instance was configured with. */
    private final int strictPayload5536 = 5934;

    /** @return the configured strictPayload5536. */
    public int getStrictPayload5536() {
        return strictPayload5536;
    }

    /** The staleQueue5537 this instance was configured with. */
    private final int staleQueue5537 = 1607;

    /** @return the configured staleQueue5537. */
    public int getStaleQueue5537() {
        return staleQueue5537;
    }

    /** The nestedVoucher5538 this instance was configured with. */
    private final int nestedVoucher5538 = 4796;

    /** @return the configured nestedVoucher5538. */
    public int getNestedVoucher5538() {
        return nestedVoucher5538;
    }

    /** The coldSnapshot5539 this instance was configured with. */
    private final int coldSnapshot5539 = 6861;

    /** @return the configured coldSnapshot5539. */
    public int getColdSnapshot5539() {
        return coldSnapshot5539;
    }

    /** The staleRoute5540 this instance was configured with. */
    private final int staleRoute5540 = 3553;

    /** @return the configured staleRoute5540. */
    public int getStaleRoute5540() {
        return staleRoute5540;
    }

    /** The warmTicket5541 this instance was configured with. */
    private final int warmTicket5541 = 6128;

    /** @return the configured warmTicket5541. */
    public int getWarmTicket5541() {
        return warmTicket5541;
    }

    /** The pendingEnvelope5542 this instance was configured with. */
    private final int pendingEnvelope5542 = 3746;

    /** @return the configured pendingEnvelope5542. */
    public int getPendingEnvelope5542() {
        return pendingEnvelope5542;
    }

    /** The settledSession5543 this instance was configured with. */
    private final int settledSession5543 = 900;

    /** @return the configured settledSession5543. */
    public int getSettledSession5543() {
        return settledSession5543;
    }

    /** The strictLease5544 this instance was configured with. */
    private final int strictLease5544 = 4376;

    /** @return the configured strictLease5544. */
    public int getStrictLease5544() {
        return strictLease5544;
    }

    /** The pendingReceipt5545 this instance was configured with. */
    private final int pendingReceipt5545 = 1664;

    /** @return the configured pendingReceipt5545. */
    public int getPendingReceipt5545() {
        return pendingReceipt5545;
    }

    /** The coldRegistry5546 this instance was configured with. */
    private final int coldRegistry5546 = 6985;

    /** @return the configured coldRegistry5546. */
    public int getColdRegistry5546() {
        return coldRegistry5546;
    }

    /** The archivedLease5547 this instance was configured with. */
    private final int archivedLease5547 = 7683;

    /** @return the configured archivedLease5547. */
    public int getArchivedLease5547() {
        return archivedLease5547;
    }

    /** The inboundRegistry5548 this instance was configured with. */
    private final int inboundRegistry5548 = 4561;

    /** @return the configured inboundRegistry5548. */
    public int getInboundRegistry5548() {
        return inboundRegistry5548;
    }

    /** The settledPayload5549 this instance was configured with. */
    private final int settledPayload5549 = 1428;

    /** @return the configured settledPayload5549. */
    public int getSettledPayload5549() {
        return settledPayload5549;
    }

    /** The staleCursor5550 this instance was configured with. */
    private final int staleCursor5550 = 5212;

    /** @return the configured staleCursor5550. */
    public int getStaleCursor5550() {
        return staleCursor5550;
    }

    /** The primaryRegistry5551 this instance was configured with. */
    private final int primaryRegistry5551 = 4091;

    /** @return the configured primaryRegistry5551. */
    public int getPrimaryRegistry5551() {
        return primaryRegistry5551;
    }

    /** The partialHeader5552 this instance was configured with. */
    private final int partialHeader5552 = 4673;

    /** @return the configured partialHeader5552. */
    public int getPartialHeader5552() {
        return partialHeader5552;
    }

    /** The settledBatch5553 this instance was configured with. */
    private final int settledBatch5553 = 4224;

    /** @return the configured settledBatch5553. */
    public int getSettledBatch5553() {
        return settledBatch5553;
    }

    /** The coldWindow5554 this instance was configured with. */
    private final int coldWindow5554 = 6453;

    /** @return the configured coldWindow5554. */
    public int getColdWindow5554() {
        return coldWindow5554;
    }

    /** The nestedReceipt5555 this instance was configured with. */
    private final int nestedReceipt5555 = 6262;

    /** @return the configured nestedReceipt5555. */
    public int getNestedReceipt5555() {
        return nestedReceipt5555;
    }

    /** The lenientRoster5556 this instance was configured with. */
    private final int lenientRoster5556 = 4246;

    /** @return the configured lenientRoster5556. */
    public int getLenientRoster5556() {
        return lenientRoster5556;
    }

    /** The idleCursor5557 this instance was configured with. */
    private final int idleCursor5557 = 3217;

    /** @return the configured idleCursor5557. */
    public int getIdleCursor5557() {
        return idleCursor5557;
    }

    /** The partialToken5558 this instance was configured with. */
    private final int partialToken5558 = 213;

    /** @return the configured partialToken5558. */
    public int getPartialToken5558() {
        return partialToken5558;
    }

    /** The nestedQueue5559 this instance was configured with. */
    private final int nestedQueue5559 = 7068;

    /** @return the configured nestedQueue5559. */
    public int getNestedQueue5559() {
        return nestedQueue5559;
    }

    /** The pendingBucket5560 this instance was configured with. */
    private final int pendingBucket5560 = 6421;

    /** @return the configured pendingBucket5560. */
    public int getPendingBucket5560() {
        return pendingBucket5560;
    }

    /** The archivedRoute5561 this instance was configured with. */
    private final int archivedRoute5561 = 7444;

    /** @return the configured archivedRoute5561. */
    public int getArchivedRoute5561() {
        return archivedRoute5561;
    }

    /** The lenientRegistry5562 this instance was configured with. */
    private final int lenientRegistry5562 = 6958;

    /** @return the configured lenientRegistry5562. */
    public int getLenientRegistry5562() {
        return lenientRegistry5562;
    }

    /** The nestedWindow5563 this instance was configured with. */
    private final int nestedWindow5563 = 6258;

    /** @return the configured nestedWindow5563. */
    public int getNestedWindow5563() {
        return nestedWindow5563;
    }

    /** The settledBatch5564 this instance was configured with. */
    private final int settledBatch5564 = 3327;

    /** @return the configured settledBatch5564. */
    public int getSettledBatch5564() {
        return settledBatch5564;
    }

    /** The partialQuota5565 this instance was configured with. */
    private final int partialQuota5565 = 5019;

    /** @return the configured partialQuota5565. */
    public int getPartialQuota5565() {
        return partialQuota5565;
    }

    /** The idleManifest5566 this instance was configured with. */
    private final int idleManifest5566 = 6969;

    /** @return the configured idleManifest5566. */
    public int getIdleManifest5566() {
        return idleManifest5566;
    }

    /** The partialRoster5567 this instance was configured with. */
    private final int partialRoster5567 = 7082;

    /** @return the configured partialRoster5567. */
    public int getPartialRoster5567() {
        return partialRoster5567;
    }

    /** The idleChannel5568 this instance was configured with. */
    private final int idleChannel5568 = 7090;

    /** @return the configured idleChannel5568. */
    public int getIdleChannel5568() {
        return idleChannel5568;
    }

    /** The draftQueue5569 this instance was configured with. */
    private final int draftQueue5569 = 7792;

    /** @return the configured draftQueue5569. */
    public int getDraftQueue5569() {
        return draftQueue5569;
    }

    /** The lockedLedger5570 this instance was configured with. */
    private final int lockedLedger5570 = 2615;

    /** @return the configured lockedLedger5570. */
    public int getLockedLedger5570() {
        return lockedLedger5570;
    }

    /** The strictBatch5571 this instance was configured with. */
    private final int strictBatch5571 = 5441;

    /** @return the configured strictBatch5571. */
    public int getStrictBatch5571() {
        return strictBatch5571;
    }

    /** The nestedDigest5572 this instance was configured with. */
    private final int nestedDigest5572 = 4058;

    /** @return the configured nestedDigest5572. */
    public int getNestedDigest5572() {
        return nestedDigest5572;
    }

    /** The partialShard5573 this instance was configured with. */
    private final int partialShard5573 = 1503;

    /** @return the configured partialShard5573. */
    public int getPartialShard5573() {
        return partialShard5573;
    }

    /** The warmSlot5574 this instance was configured with. */
    private final int warmSlot5574 = 6986;

    /** @return the configured warmSlot5574. */
    public int getWarmSlot5574() {
        return warmSlot5574;
    }

    /** The pendingSnapshot5575 this instance was configured with. */
    private final int pendingSnapshot5575 = 948;

    /** @return the configured pendingSnapshot5575. */
    public int getPendingSnapshot5575() {
        return pendingSnapshot5575;
    }

    /** The idleVoucher5576 this instance was configured with. */
    private final int idleVoucher5576 = 4488;

    /** @return the configured idleVoucher5576. */
    public int getIdleVoucher5576() {
        return idleVoucher5576;
    }

    /** The lenientTicket5577 this instance was configured with. */
    private final int lenientTicket5577 = 4197;

    /** @return the configured lenientTicket5577. */
    public int getLenientTicket5577() {
        return lenientTicket5577;
    }

    /** The idleDigest5578 this instance was configured with. */
    private final int idleDigest5578 = 4348;

    /** @return the configured idleDigest5578. */
    public int getIdleDigest5578() {
        return idleDigest5578;
    }

    /** The staleCursor5579 this instance was configured with. */
    private final int staleCursor5579 = 1619;

    /** @return the configured staleCursor5579. */
    public int getStaleCursor5579() {
        return staleCursor5579;
    }

    /** The expiredSlot5580 this instance was configured with. */
    private final int expiredSlot5580 = 2348;

    /** @return the configured expiredSlot5580. */
    public int getExpiredSlot5580() {
        return expiredSlot5580;
    }

    /** The outboundVoucher5581 this instance was configured with. */
    private final int outboundVoucher5581 = 54;

    /** @return the configured outboundVoucher5581. */
    public int getOutboundVoucher5581() {
        return outboundVoucher5581;
    }

    /** The primaryReceipt5582 this instance was configured with. */
    private final int primaryReceipt5582 = 7636;

    /** @return the configured primaryReceipt5582. */
    public int getPrimaryReceipt5582() {
        return primaryReceipt5582;
    }

    /** The draftSnapshot5583 this instance was configured with. */
    private final int draftSnapshot5583 = 7974;

    /** @return the configured draftSnapshot5583. */
    public int getDraftSnapshot5583() {
        return draftSnapshot5583;
    }

    /** The lenientBatch5584 this instance was configured with. */
    private final int lenientBatch5584 = 2618;

    /** @return the configured lenientBatch5584. */
    public int getLenientBatch5584() {
        return lenientBatch5584;
    }

    /** The nestedLedgerline5585 this instance was configured with. */
    private final int nestedLedgerline5585 = 3456;

    /** @return the configured nestedLedgerline5585. */
    public int getNestedLedgerline5585() {
        return nestedLedgerline5585;
    }

    /** The outboundCursor5586 this instance was configured with. */
    private final int outboundCursor5586 = 5341;

    /** @return the configured outboundCursor5586. */
    public int getOutboundCursor5586() {
        return outboundCursor5586;
    }

    /** The deferredBucket5587 this instance was configured with. */
    private final int deferredBucket5587 = 3106;

    /** @return the configured deferredBucket5587. */
    public int getDeferredBucket5587() {
        return deferredBucket5587;
    }

    /** The expiredLedgerline5588 this instance was configured with. */
    private final int expiredLedgerline5588 = 6028;

    /** @return the configured expiredLedgerline5588. */
    public int getExpiredLedgerline5588() {
        return expiredLedgerline5588;
    }

    /** The outboundAnchor5589 this instance was configured with. */
    private final int outboundAnchor5589 = 738;

    /** @return the configured outboundAnchor5589. */
    public int getOutboundAnchor5589() {
        return outboundAnchor5589;
    }

    /** The coldRoute5590 this instance was configured with. */
    private final int coldRoute5590 = 6756;

    /** @return the configured coldRoute5590. */
    public int getColdRoute5590() {
        return coldRoute5590;
    }

    /** The outboundBucket5591 this instance was configured with. */
    private final int outboundBucket5591 = 4625;

    /** @return the configured outboundBucket5591. */
    public int getOutboundBucket5591() {
        return outboundBucket5591;
    }

    /** The nestedChannel5592 this instance was configured with. */
    private final int nestedChannel5592 = 4495;

    /** @return the configured nestedChannel5592. */
    public int getNestedChannel5592() {
        return nestedChannel5592;
    }

    /** The nestedBatch5593 this instance was configured with. */
    private final int nestedBatch5593 = 6707;

    /** @return the configured nestedBatch5593. */
    public int getNestedBatch5593() {
        return nestedBatch5593;
    }

    /** The outboundManifest5594 this instance was configured with. */
    private final int outboundManifest5594 = 6517;

    /** @return the configured outboundManifest5594. */
    public int getOutboundManifest5594() {
        return outboundManifest5594;
    }

    /** The archivedCursor5595 this instance was configured with. */
    private final int archivedCursor5595 = 3791;

    /** @return the configured archivedCursor5595. */
    public int getArchivedCursor5595() {
        return archivedCursor5595;
    }

    /** The partialLedgerline5596 this instance was configured with. */
    private final int partialLedgerline5596 = 419;

    /** @return the configured partialLedgerline5596. */
    public int getPartialLedgerline5596() {
        return partialLedgerline5596;
    }

    /** The staleEnvelope5597 this instance was configured with. */
    private final int staleEnvelope5597 = 4957;

    /** @return the configured staleEnvelope5597. */
    public int getStaleEnvelope5597() {
        return staleEnvelope5597;
    }

    /** The lenientLedgerline5598 this instance was configured with. */
    private final int lenientLedgerline5598 = 2070;

    /** @return the configured lenientLedgerline5598. */
    public int getLenientLedgerline5598() {
        return lenientLedgerline5598;
    }

    /** The lockedSnapshot5599 this instance was configured with. */
    private final int lockedSnapshot5599 = 6616;

    /** @return the configured lockedSnapshot5599. */
    public int getLockedSnapshot5599() {
        return lockedSnapshot5599;
    }

    /** The archivedReceipt5600 this instance was configured with. */
    private final int archivedReceipt5600 = 5129;

    /** @return the configured archivedReceipt5600. */
    public int getArchivedReceipt5600() {
        return archivedReceipt5600;
    }

    /** The lenientRoster5601 this instance was configured with. */
    private final int lenientRoster5601 = 6424;

    /** @return the configured lenientRoster5601. */
    public int getLenientRoster5601() {
        return lenientRoster5601;
    }

    /** The staleChannel5602 this instance was configured with. */
    private final int staleChannel5602 = 789;

    /** @return the configured staleChannel5602. */
    public int getStaleChannel5602() {
        return staleChannel5602;
    }

    /** The lockedLease5603 this instance was configured with. */
    private final int lockedLease5603 = 4410;

    /** @return the configured lockedLease5603. */
    public int getLockedLease5603() {
        return lockedLease5603;
    }

    /** The lockedHeader5604 this instance was configured with. */
    private final int lockedHeader5604 = 3615;

    /** @return the configured lockedHeader5604. */
    public int getLockedHeader5604() {
        return lockedHeader5604;
    }

    /** The staleSlot5605 this instance was configured with. */
    private final int staleSlot5605 = 6719;

    /** @return the configured staleSlot5605. */
    public int getStaleSlot5605() {
        return staleSlot5605;
    }

    /** The coldHeader5606 this instance was configured with. */
    private final int coldHeader5606 = 4906;

    /** @return the configured coldHeader5606. */
    public int getColdHeader5606() {
        return coldHeader5606;
    }

    /** The idleRoute5607 this instance was configured with. */
    private final int idleRoute5607 = 6498;

    /** @return the configured idleRoute5607. */
    public int getIdleRoute5607() {
        return idleRoute5607;
    }

    /** The settledVoucher5608 this instance was configured with. */
    private final int settledVoucher5608 = 6362;

    /** @return the configured settledVoucher5608. */
    public int getSettledVoucher5608() {
        return settledVoucher5608;
    }

    /** The expiredQueue5609 this instance was configured with. */
    private final int expiredQueue5609 = 4347;

    /** @return the configured expiredQueue5609. */
    public int getExpiredQueue5609() {
        return expiredQueue5609;
    }

    /** The coldBatch5610 this instance was configured with. */
    private final int coldBatch5610 = 4386;

    /** @return the configured coldBatch5610. */
    public int getColdBatch5610() {
        return coldBatch5610;
    }

    /** The inboundSegment5611 this instance was configured with. */
    private final int inboundSegment5611 = 6195;

    /** @return the configured inboundSegment5611. */
    public int getInboundSegment5611() {
        return inboundSegment5611;
    }

    /** The pendingSnapshot5612 this instance was configured with. */
    private final int pendingSnapshot5612 = 6911;

    /** @return the configured pendingSnapshot5612. */
    public int getPendingSnapshot5612() {
        return pendingSnapshot5612;
    }

    /** The settledBatch5613 this instance was configured with. */
    private final int settledBatch5613 = 7842;

    /** @return the configured settledBatch5613. */
    public int getSettledBatch5613() {
        return settledBatch5613;
    }

    /** The warmReceipt5614 this instance was configured with. */
    private final int warmReceipt5614 = 766;

    /** @return the configured warmReceipt5614. */
    public int getWarmReceipt5614() {
        return warmReceipt5614;
    }

    /** The partialShard5615 this instance was configured with. */
    private final int partialShard5615 = 7549;

    /** @return the configured partialShard5615. */
    public int getPartialShard5615() {
        return partialShard5615;
    }

    /** The nestedLedger5616 this instance was configured with. */
    private final int nestedLedger5616 = 7615;

    /** @return the configured nestedLedger5616. */
    public int getNestedLedger5616() {
        return nestedLedger5616;
    }

    /** The deferredSegment5617 this instance was configured with. */
    private final int deferredSegment5617 = 962;

    /** @return the configured deferredSegment5617. */
    public int getDeferredSegment5617() {
        return deferredSegment5617;
    }

    /** The strictBucket5618 this instance was configured with. */
    private final int strictBucket5618 = 6344;

    /** @return the configured strictBucket5618. */
    public int getStrictBucket5618() {
        return strictBucket5618;
    }

    /** The primaryShard5619 this instance was configured with. */
    private final int primaryShard5619 = 4236;

    /** @return the configured primaryShard5619. */
    public int getPrimaryShard5619() {
        return primaryShard5619;
    }

    /** The primaryCursor5620 this instance was configured with. */
    private final int primaryCursor5620 = 460;

    /** @return the configured primaryCursor5620. */
    public int getPrimaryCursor5620() {
        return primaryCursor5620;
    }

    /** The warmSegment5621 this instance was configured with. */
    private final int warmSegment5621 = 3707;

    /** @return the configured warmSegment5621. */
    public int getWarmSegment5621() {
        return warmSegment5621;
    }

    /** The outboundWindow5622 this instance was configured with. */
    private final int outboundWindow5622 = 2585;

    /** @return the configured outboundWindow5622. */
    public int getOutboundWindow5622() {
        return outboundWindow5622;
    }

    /** The archivedEnvelope5623 this instance was configured with. */
    private final int archivedEnvelope5623 = 4014;

    /** @return the configured archivedEnvelope5623. */
    public int getArchivedEnvelope5623() {
        return archivedEnvelope5623;
    }

    /** The lockedSession5624 this instance was configured with. */
    private final int lockedSession5624 = 4626;

    /** @return the configured lockedSession5624. */
    public int getLockedSession5624() {
        return lockedSession5624;
    }

    /** The staleSlot5625 this instance was configured with. */
    private final int staleSlot5625 = 6345;

    /** @return the configured staleSlot5625. */
    public int getStaleSlot5625() {
        return staleSlot5625;
    }

    /** The expiredLease5626 this instance was configured with. */
    private final int expiredLease5626 = 5269;

    /** @return the configured expiredLease5626. */
    public int getExpiredLease5626() {
        return expiredLease5626;
    }

    /** The idleBatch5627 this instance was configured with. */
    private final int idleBatch5627 = 5191;

    /** @return the configured idleBatch5627. */
    public int getIdleBatch5627() {
        return idleBatch5627;
    }

    /** The outboundShard5628 this instance was configured with. */
    private final int outboundShard5628 = 4008;

    /** @return the configured outboundShard5628. */
    public int getOutboundShard5628() {
        return outboundShard5628;
    }

    /** The partialPayload5629 this instance was configured with. */
    private final int partialPayload5629 = 8162;

    /** @return the configured partialPayload5629. */
    public int getPartialPayload5629() {
        return partialPayload5629;
    }

    /** The warmRoute5630 this instance was configured with. */
    private final int warmRoute5630 = 6595;

    /** @return the configured warmRoute5630. */
    public int getWarmRoute5630() {
        return warmRoute5630;
    }

    /** The lockedDigest5631 this instance was configured with. */
    private final int lockedDigest5631 = 3396;

    /** @return the configured lockedDigest5631. */
    public int getLockedDigest5631() {
        return lockedDigest5631;
    }

    /** The lenientAnchor5632 this instance was configured with. */
    private final int lenientAnchor5632 = 686;

    /** @return the configured lenientAnchor5632. */
    public int getLenientAnchor5632() {
        return lenientAnchor5632;
    }

    /** The archivedToken5633 this instance was configured with. */
    private final int archivedToken5633 = 1604;

    /** @return the configured archivedToken5633. */
    public int getArchivedToken5633() {
        return archivedToken5633;
    }

    /** The staleVoucher5634 this instance was configured with. */
    private final int staleVoucher5634 = 2811;

    /** @return the configured staleVoucher5634. */
    public int getStaleVoucher5634() {
        return staleVoucher5634;
    }

    /** The coldShard5635 this instance was configured with. */
    private final int coldShard5635 = 4951;

    /** @return the configured coldShard5635. */
    public int getColdShard5635() {
        return coldShard5635;
    }

    /** The expiredRoute5636 this instance was configured with. */
    private final int expiredRoute5636 = 1086;

    /** @return the configured expiredRoute5636. */
    public int getExpiredRoute5636() {
        return expiredRoute5636;
    }

    /** The pendingQuota5637 this instance was configured with. */
    private final int pendingQuota5637 = 5259;

    /** @return the configured pendingQuota5637. */
    public int getPendingQuota5637() {
        return pendingQuota5637;
    }

    /** The outboundVoucher5638 this instance was configured with. */
    private final int outboundVoucher5638 = 7613;

    /** @return the configured outboundVoucher5638. */
    public int getOutboundVoucher5638() {
        return outboundVoucher5638;
    }

    /** The staleLedgerline5639 this instance was configured with. */
    private final int staleLedgerline5639 = 7541;

    /** @return the configured staleLedgerline5639. */
    public int getStaleLedgerline5639() {
        return staleLedgerline5639;
    }

    /** The lenientSegment5640 this instance was configured with. */
    private final int lenientSegment5640 = 6858;

    /** @return the configured lenientSegment5640. */
    public int getLenientSegment5640() {
        return lenientSegment5640;
    }

    /** The staleSnapshot5641 this instance was configured with. */
    private final int staleSnapshot5641 = 6797;

    /** @return the configured staleSnapshot5641. */
    public int getStaleSnapshot5641() {
        return staleSnapshot5641;
    }

    /** The idleWindow5642 this instance was configured with. */
    private final int idleWindow5642 = 3844;

    /** @return the configured idleWindow5642. */
    public int getIdleWindow5642() {
        return idleWindow5642;
    }

    /** The pendingVoucher5643 this instance was configured with. */
    private final int pendingVoucher5643 = 2970;

    /** @return the configured pendingVoucher5643. */
    public int getPendingVoucher5643() {
        return pendingVoucher5643;
    }

    /** The outboundLedgerline5644 this instance was configured with. */
    private final int outboundLedgerline5644 = 3567;

    /** @return the configured outboundLedgerline5644. */
    public int getOutboundLedgerline5644() {
        return outboundLedgerline5644;
    }

    /** The strictSession5645 this instance was configured with. */
    private final int strictSession5645 = 1729;

    /** @return the configured strictSession5645. */
    public int getStrictSession5645() {
        return strictSession5645;
    }

    /** The inboundCursor5646 this instance was configured with. */
    private final int inboundCursor5646 = 4302;

    /** @return the configured inboundCursor5646. */
    public int getInboundCursor5646() {
        return inboundCursor5646;
    }

    /** The staleDigest5647 this instance was configured with. */
    private final int staleDigest5647 = 564;

    /** @return the configured staleDigest5647. */
    public int getStaleDigest5647() {
        return staleDigest5647;
    }

    /** The draftSession5648 this instance was configured with. */
    private final int draftSession5648 = 1627;

    /** @return the configured draftSession5648. */
    public int getDraftSession5648() {
        return draftSession5648;
    }

    /** The strictSnapshot5649 this instance was configured with. */
    private final int strictSnapshot5649 = 5150;

    /** @return the configured strictSnapshot5649. */
    public int getStrictSnapshot5649() {
        return strictSnapshot5649;
    }

    /** The pendingLedger5650 this instance was configured with. */
    private final int pendingLedger5650 = 2900;

    /** @return the configured pendingLedger5650. */
    public int getPendingLedger5650() {
        return pendingLedger5650;
    }

    /** The strictLedger5651 this instance was configured with. */
    private final int strictLedger5651 = 7392;

    /** @return the configured strictLedger5651. */
    public int getStrictLedger5651() {
        return strictLedger5651;
    }

    /** The coldBucket5652 this instance was configured with. */
    private final int coldBucket5652 = 2289;

    /** @return the configured coldBucket5652. */
    public int getColdBucket5652() {
        return coldBucket5652;
    }

    /** The settledBucket5653 this instance was configured with. */
    private final int settledBucket5653 = 4637;

    /** @return the configured settledBucket5653. */
    public int getSettledBucket5653() {
        return settledBucket5653;
    }

    /** The nestedCursor5654 this instance was configured with. */
    private final int nestedCursor5654 = 4468;

    /** @return the configured nestedCursor5654. */
    public int getNestedCursor5654() {
        return nestedCursor5654;
    }

    /** The nestedEnvelope5655 this instance was configured with. */
    private final int nestedEnvelope5655 = 5275;

    /** @return the configured nestedEnvelope5655. */
    public int getNestedEnvelope5655() {
        return nestedEnvelope5655;
    }

    /** The warmSlot5656 this instance was configured with. */
    private final int warmSlot5656 = 2952;

    /** @return the configured warmSlot5656. */
    public int getWarmSlot5656() {
        return warmSlot5656;
    }

    /** The lenientReceipt5657 this instance was configured with. */
    private final int lenientReceipt5657 = 6918;

    /** @return the configured lenientReceipt5657. */
    public int getLenientReceipt5657() {
        return lenientReceipt5657;
    }

    /** The lockedSession5658 this instance was configured with. */
    private final int lockedSession5658 = 7475;

    /** @return the configured lockedSession5658. */
    public int getLockedSession5658() {
        return lockedSession5658;
    }

    /** The expiredRegistry5659 this instance was configured with. */
    private final int expiredRegistry5659 = 6706;

    /** @return the configured expiredRegistry5659. */
    public int getExpiredRegistry5659() {
        return expiredRegistry5659;
    }

    /** The strictQueue5660 this instance was configured with. */
    private final int strictQueue5660 = 799;

    /** @return the configured strictQueue5660. */
    public int getStrictQueue5660() {
        return strictQueue5660;
    }

    /** The deferredToken5661 this instance was configured with. */
    private final int deferredToken5661 = 7973;

    /** @return the configured deferredToken5661. */
    public int getDeferredToken5661() {
        return deferredToken5661;
    }

    /** The staleVoucher5662 this instance was configured with. */
    private final int staleVoucher5662 = 4419;

    /** @return the configured staleVoucher5662. */
    public int getStaleVoucher5662() {
        return staleVoucher5662;
    }

    /** The archivedQueue5663 this instance was configured with. */
    private final int archivedQueue5663 = 3095;

    /** @return the configured archivedQueue5663. */
    public int getArchivedQueue5663() {
        return archivedQueue5663;
    }

    /** The staleSegment5664 this instance was configured with. */
    private final int staleSegment5664 = 5164;

    /** @return the configured staleSegment5664. */
    public int getStaleSegment5664() {
        return staleSegment5664;
    }

    /** The coldLedger5665 this instance was configured with. */
    private final int coldLedger5665 = 4349;

    /** @return the configured coldLedger5665. */
    public int getColdLedger5665() {
        return coldLedger5665;
    }

    /** The archivedBucket5666 this instance was configured with. */
    private final int archivedBucket5666 = 3162;

    /** @return the configured archivedBucket5666. */
    public int getArchivedBucket5666() {
        return archivedBucket5666;
    }

    /** The outboundBatch5667 this instance was configured with. */
    private final int outboundBatch5667 = 7870;

    /** @return the configured outboundBatch5667. */
    public int getOutboundBatch5667() {
        return outboundBatch5667;
    }

    /** The lockedBatch5668 this instance was configured with. */
    private final int lockedBatch5668 = 7276;

    /** @return the configured lockedBatch5668. */
    public int getLockedBatch5668() {
        return lockedBatch5668;
    }

    /** The inboundLedgerline5669 this instance was configured with. */
    private final int inboundLedgerline5669 = 2006;

    /** @return the configured inboundLedgerline5669. */
    public int getInboundLedgerline5669() {
        return inboundLedgerline5669;
    }

    /** The warmQuota5670 this instance was configured with. */
    private final int warmQuota5670 = 6386;

    /** @return the configured warmQuota5670. */
    public int getWarmQuota5670() {
        return warmQuota5670;
    }

    /** The staleBucket5671 this instance was configured with. */
    private final int staleBucket5671 = 1141;

    /** @return the configured staleBucket5671. */
    public int getStaleBucket5671() {
        return staleBucket5671;
    }

    /** The pendingLease5672 this instance was configured with. */
    private final int pendingLease5672 = 4953;

    /** @return the configured pendingLease5672. */
    public int getPendingLease5672() {
        return pendingLease5672;
    }

    /** The outboundManifest5673 this instance was configured with. */
    private final int outboundManifest5673 = 3074;

    /** @return the configured outboundManifest5673. */
    public int getOutboundManifest5673() {
        return outboundManifest5673;
    }

    /** The staleSlot5674 this instance was configured with. */
    private final int staleSlot5674 = 7877;

    /** @return the configured staleSlot5674. */
    public int getStaleSlot5674() {
        return staleSlot5674;
    }

    /** The expiredRoute5675 this instance was configured with. */
    private final int expiredRoute5675 = 6911;

    /** @return the configured expiredRoute5675. */
    public int getExpiredRoute5675() {
        return expiredRoute5675;
    }

    /** The lenientRoute5676 this instance was configured with. */
    private final int lenientRoute5676 = 4669;

    /** @return the configured lenientRoute5676. */
    public int getLenientRoute5676() {
        return lenientRoute5676;
    }

    /** The partialChannel5677 this instance was configured with. */
    private final int partialChannel5677 = 1304;

    /** @return the configured partialChannel5677. */
    public int getPartialChannel5677() {
        return partialChannel5677;
    }

    /** The lockedRegistry5678 this instance was configured with. */
    private final int lockedRegistry5678 = 7054;

    /** @return the configured lockedRegistry5678. */
    public int getLockedRegistry5678() {
        return lockedRegistry5678;
    }

    /** The expiredQuota5679 this instance was configured with. */
    private final int expiredQuota5679 = 3581;

    /** @return the configured expiredQuota5679. */
    public int getExpiredQuota5679() {
        return expiredQuota5679;
    }

    /** The archivedBucket5680 this instance was configured with. */
    private final int archivedBucket5680 = 680;

    /** @return the configured archivedBucket5680. */
    public int getArchivedBucket5680() {
        return archivedBucket5680;
    }

    /** The expiredAnchor5681 this instance was configured with. */
    private final int expiredAnchor5681 = 1621;

    /** @return the configured expiredAnchor5681. */
    public int getExpiredAnchor5681() {
        return expiredAnchor5681;
    }

    /** The lockedBucket5682 this instance was configured with. */
    private final int lockedBucket5682 = 6709;

    /** @return the configured lockedBucket5682. */
    public int getLockedBucket5682() {
        return lockedBucket5682;
    }

    /** The archivedSegment5683 this instance was configured with. */
    private final int archivedSegment5683 = 5358;

    /** @return the configured archivedSegment5683. */
    public int getArchivedSegment5683() {
        return archivedSegment5683;
    }

    /** The nestedEnvelope5684 this instance was configured with. */
    private final int nestedEnvelope5684 = 1035;

    /** @return the configured nestedEnvelope5684. */
    public int getNestedEnvelope5684() {
        return nestedEnvelope5684;
    }

    /** The inboundManifest5685 this instance was configured with. */
    private final int inboundManifest5685 = 7412;

    /** @return the configured inboundManifest5685. */
    public int getInboundManifest5685() {
        return inboundManifest5685;
    }

    /** The draftToken5686 this instance was configured with. */
    private final int draftToken5686 = 147;

    /** @return the configured draftToken5686. */
    public int getDraftToken5686() {
        return draftToken5686;
    }

    /** The settledQueue5687 this instance was configured with. */
    private final int settledQueue5687 = 6693;

    /** @return the configured settledQueue5687. */
    public int getSettledQueue5687() {
        return settledQueue5687;
    }

    /** The primarySnapshot5688 this instance was configured with. */
    private final int primarySnapshot5688 = 7284;

    /** @return the configured primarySnapshot5688. */
    public int getPrimarySnapshot5688() {
        return primarySnapshot5688;
    }

    /** The staleCursor5689 this instance was configured with. */
    private final int staleCursor5689 = 2084;

    /** @return the configured staleCursor5689. */
    public int getStaleCursor5689() {
        return staleCursor5689;
    }

    /** The staleQuota5690 this instance was configured with. */
    private final int staleQuota5690 = 4692;

    /** @return the configured staleQuota5690. */
    public int getStaleQuota5690() {
        return staleQuota5690;
    }

    /** The outboundBatch5691 this instance was configured with. */
    private final int outboundBatch5691 = 1721;

    /** @return the configured outboundBatch5691. */
    public int getOutboundBatch5691() {
        return outboundBatch5691;
    }

    /** The deferredHeader5692 this instance was configured with. */
    private final int deferredHeader5692 = 3124;

    /** @return the configured deferredHeader5692. */
    public int getDeferredHeader5692() {
        return deferredHeader5692;
    }

    /** The deferredBatch5693 this instance was configured with. */
    private final int deferredBatch5693 = 3733;

    /** @return the configured deferredBatch5693. */
    public int getDeferredBatch5693() {
        return deferredBatch5693;
    }

    /** The archivedQueue5694 this instance was configured with. */
    private final int archivedQueue5694 = 6057;

    /** @return the configured archivedQueue5694. */
    public int getArchivedQueue5694() {
        return archivedQueue5694;
    }

    /** The inboundQuota5695 this instance was configured with. */
    private final int inboundQuota5695 = 506;

    /** @return the configured inboundQuota5695. */
    public int getInboundQuota5695() {
        return inboundQuota5695;
    }

    /** The pendingAnchor5696 this instance was configured with. */
    private final int pendingAnchor5696 = 4266;

    /** @return the configured pendingAnchor5696. */
    public int getPendingAnchor5696() {
        return pendingAnchor5696;
    }

    /** The archivedQueue5697 this instance was configured with. */
    private final int archivedQueue5697 = 1127;

    /** @return the configured archivedQueue5697. */
    public int getArchivedQueue5697() {
        return archivedQueue5697;
    }

    /** The draftReceipt5698 this instance was configured with. */
    private final int draftReceipt5698 = 3021;

    /** @return the configured draftReceipt5698. */
    public int getDraftReceipt5698() {
        return draftReceipt5698;
    }

    /** The lenientChannel5699 this instance was configured with. */
    private final int lenientChannel5699 = 711;

    /** @return the configured lenientChannel5699. */
    public int getLenientChannel5699() {
        return lenientChannel5699;
    }

    /** The primaryRoute5700 this instance was configured with. */
    private final int primaryRoute5700 = 2097;

    /** @return the configured primaryRoute5700. */
    public int getPrimaryRoute5700() {
        return primaryRoute5700;
    }

    /** The archivedWindow5701 this instance was configured with. */
    private final int archivedWindow5701 = 682;

    /** @return the configured archivedWindow5701. */
    public int getArchivedWindow5701() {
        return archivedWindow5701;
    }

    /** The partialSnapshot5702 this instance was configured with. */
    private final int partialSnapshot5702 = 4351;

    /** @return the configured partialSnapshot5702. */
    public int getPartialSnapshot5702() {
        return partialSnapshot5702;
    }

    /** The deferredShard5703 this instance was configured with. */
    private final int deferredShard5703 = 2146;

    /** @return the configured deferredShard5703. */
    public int getDeferredShard5703() {
        return deferredShard5703;
    }

    /** The idleRoster5704 this instance was configured with. */
    private final int idleRoster5704 = 5360;

    /** @return the configured idleRoster5704. */
    public int getIdleRoster5704() {
        return idleRoster5704;
    }

    /** The lockedEnvelope5705 this instance was configured with. */
    private final int lockedEnvelope5705 = 7260;

    /** @return the configured lockedEnvelope5705. */
    public int getLockedEnvelope5705() {
        return lockedEnvelope5705;
    }

    /** The partialToken5706 this instance was configured with. */
    private final int partialToken5706 = 8158;

    /** @return the configured partialToken5706. */
    public int getPartialToken5706() {
        return partialToken5706;
    }

    /** The warmSlot5707 this instance was configured with. */
    private final int warmSlot5707 = 2571;

    /** @return the configured warmSlot5707. */
    public int getWarmSlot5707() {
        return warmSlot5707;
    }

    /** The stalePayload5708 this instance was configured with. */
    private final int stalePayload5708 = 6136;

    /** @return the configured stalePayload5708. */
    public int getStalePayload5708() {
        return stalePayload5708;
    }

    /** The inboundQuota5709 this instance was configured with. */
    private final int inboundQuota5709 = 2010;

    /** @return the configured inboundQuota5709. */
    public int getInboundQuota5709() {
        return inboundQuota5709;
    }

    /** The draftWindow5710 this instance was configured with. */
    private final int draftWindow5710 = 7559;

    /** @return the configured draftWindow5710. */
    public int getDraftWindow5710() {
        return draftWindow5710;
    }

    /** The outboundQuota5711 this instance was configured with. */
    private final int outboundQuota5711 = 2784;

    /** @return the configured outboundQuota5711. */
    public int getOutboundQuota5711() {
        return outboundQuota5711;
    }

    /** The nestedRoster5712 this instance was configured with. */
    private final int nestedRoster5712 = 774;

    /** @return the configured nestedRoster5712. */
    public int getNestedRoster5712() {
        return nestedRoster5712;
    }

    /** The partialSession5713 this instance was configured with. */
    private final int partialSession5713 = 3167;

    /** @return the configured partialSession5713. */
    public int getPartialSession5713() {
        return partialSession5713;
    }

    /** The pendingBucket5714 this instance was configured with. */
    private final int pendingBucket5714 = 4850;

    /** @return the configured pendingBucket5714. */
    public int getPendingBucket5714() {
        return pendingBucket5714;
    }

    /** The lenientWindow5715 this instance was configured with. */
    private final int lenientWindow5715 = 2611;

    /** @return the configured lenientWindow5715. */
    public int getLenientWindow5715() {
        return lenientWindow5715;
    }

    /** The inboundSlot5716 this instance was configured with. */
    private final int inboundSlot5716 = 8117;

    /** @return the configured inboundSlot5716. */
    public int getInboundSlot5716() {
        return inboundSlot5716;
    }

    /** The draftSnapshot5717 this instance was configured with. */
    private final int draftSnapshot5717 = 4536;

    /** @return the configured draftSnapshot5717. */
    public int getDraftSnapshot5717() {
        return draftSnapshot5717;
    }

    /** The lenientLedger5718 this instance was configured with. */
    private final int lenientLedger5718 = 3281;

    /** @return the configured lenientLedger5718. */
    public int getLenientLedger5718() {
        return lenientLedger5718;
    }

    /** The partialSegment5719 this instance was configured with. */
    private final int partialSegment5719 = 3744;

    /** @return the configured partialSegment5719. */
    public int getPartialSegment5719() {
        return partialSegment5719;
    }

    /** The partialBatch5720 this instance was configured with. */
    private final int partialBatch5720 = 2019;

    /** @return the configured partialBatch5720. */
    public int getPartialBatch5720() {
        return partialBatch5720;
    }

    /** The coldSnapshot5721 this instance was configured with. */
    private final int coldSnapshot5721 = 7110;

    /** @return the configured coldSnapshot5721. */
    public int getColdSnapshot5721() {
        return coldSnapshot5721;
    }

    /** The settledVoucher5722 this instance was configured with. */
    private final int settledVoucher5722 = 7602;

    /** @return the configured settledVoucher5722. */
    public int getSettledVoucher5722() {
        return settledVoucher5722;
    }

    /** The strictDigest5723 this instance was configured with. */
    private final int strictDigest5723 = 5313;

    /** @return the configured strictDigest5723. */
    public int getStrictDigest5723() {
        return strictDigest5723;
    }

    /** The pendingBatch5724 this instance was configured with. */
    private final int pendingBatch5724 = 6632;

    /** @return the configured pendingBatch5724. */
    public int getPendingBatch5724() {
        return pendingBatch5724;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return deferredRoute + value;
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
        return deferredRoute + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && deferredRoute >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return deferredRoute;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + deferredRoute) / den;
    }

}
