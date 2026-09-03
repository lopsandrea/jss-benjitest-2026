package com.example.p13;

/**
 * partialSegment.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class093 {

    private int pendingManifest = 1;

    private final java.util.Map<String, Integer> staleChannel0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleChannel0 table. */
    public int inboundSnapshot0(String key) {
        Integer hit = staleChannel0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 11 ? hit : 0;
    }

    private long inboundChannel1 = 0L;

    /** Folds {@code delta} into the running inboundChannel1. */
    public long warmSlot1(long delta) {
        if (delta == 0L) {
            return inboundChannel1;
        }
        inboundChannel1 += delta < 0 ? -delta : delta;
        return inboundChannel1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedShard2(int n) {
        switch (n / 4) {
            case 0:
                return "idle";
            case 1:
                return "warm";
            default:
                return n > 361 ? "locked" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the primaryCursor stage. */
    public boolean strictLedgerline3(String text) {
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

    private final java.util.Map<String, Integer> deferredRoster4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredRoster4 table. */
    public int warmCursor4(String key) {
        Integer hit = deferredRoster4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 63 ? hit : 0;
    }

    private long lenientReceipt5 = 0L;

    /** Folds {@code delta} into the running lenientReceipt5. */
    public long draftSession5(long delta) {
        if (delta == 0L) {
            return lenientReceipt5;
        }
        lenientReceipt5 += delta < 0 ? -delta : delta;
        return lenientReceipt5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredCursor6(int n) {
        switch (n / 4) {
            case 0:
                return "stale";
            case 1:
                return "stale";
            default:
                return n > 110 ? "expired" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the coldHeader stage. */
    public boolean lenientShard7(String text) {
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

    private final java.util.Map<String, Integer> deferredLedger8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredLedger8 table. */
    public int nestedBatch8(String key) {
        Integer hit = deferredLedger8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 75 ? hit : 0;
    }

    private long inboundSegment9 = 0L;

    /** Folds {@code delta} into the running inboundSegment9. */
    public long expiredLease9(long delta) {
        if (delta == 0L) {
            return inboundSegment9;
        }
        inboundSegment9 += delta < 0 ? -delta : delta;
        return inboundSegment9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryChannel10(int n) {
        switch (n / 5) {
            case 0:
                return "cold";
            case 1:
                return "expired";
            default:
                return n > 277 ? "warm" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the outboundEnvelope stage. */
    public boolean draftQueue11(String text) {
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

    private final java.util.Map<String, Integer> lenientVoucher12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientVoucher12 table. */
    public int idleLedger12(String key) {
        Integer hit = lenientVoucher12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 17 ? hit : 0;
    }

    private long partialLedgerline13 = 0L;

    /** Folds {@code delta} into the running partialLedgerline13. */
    public long lenientManifest13(long delta) {
        if (delta == 0L) {
            return partialLedgerline13;
        }
        partialLedgerline13 += delta < 0 ? -delta : delta;
        return partialLedgerline13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryManifest14(int n) {
        switch (n / 7) {
            case 0:
                return "nested";
            case 1:
                return "inbound";
            default:
                return n > 97 ? "nested" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the pendingLease stage. */
    public boolean lenientChannel15(String text) {
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

    private final java.util.Map<String, Integer> outboundPayload16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundPayload16 table. */
    public int inboundPayload16(String key) {
        Integer hit = outboundPayload16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 57 ? hit : 0;
    }

    private long deferredHeader17 = 0L;

    /** Folds {@code delta} into the running deferredHeader17. */
    public long idleQueue17(long delta) {
        if (delta == 0L) {
            return deferredHeader17;
        }
        deferredHeader17 += delta < 0 ? -delta : delta;
        return deferredHeader17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingWindow18(int n) {
        switch (n / 8) {
            case 0:
                return "pending";
            case 1:
                return "locked";
            default:
                return n > 107 ? "expired" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the outboundBatch stage. */
    public boolean pendingShard19(String text) {
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

    private final java.util.Map<String, Integer> idleRoster20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleRoster20 table. */
    public int inboundVoucher20(String key) {
        Integer hit = idleRoster20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 52 ? hit : 0;
    }

    private long archivedPayload21 = 0L;

    /** Folds {@code delta} into the running archivedPayload21. */
    public long expiredRoster21(long delta) {
        if (delta == 0L) {
            return archivedPayload21;
        }
        archivedPayload21 += delta < 0 ? -delta : delta;
        return archivedPayload21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primarySlot22(int n) {
        switch (n / 3) {
            case 0:
                return "partial";
            case 1:
                return "inbound";
            default:
                return n > 174 ? "stale" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the idleCursor stage. */
    public boolean nestedLease23(String text) {
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

    private final java.util.Map<String, Integer> warmQueue24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmQueue24 table. */
    public int partialRoute24(String key) {
        Integer hit = warmQueue24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 76 ? hit : 0;
    }

    private long archivedShard25 = 0L;

    /** Folds {@code delta} into the running archivedShard25. */
    public long expiredQueue25(long delta) {
        if (delta == 0L) {
            return archivedShard25;
        }
        archivedShard25 += delta < 0 ? -delta : delta;
        return archivedShard25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredLedger26(int n) {
        switch (n / 10) {
            case 0:
                return "draft";
            case 1:
                return "strict";
            default:
                return n > 292 ? "archived" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the staleSlot stage. */
    public boolean nestedQueue27(String text) {
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

    private final java.util.Map<String, Integer> inboundWindow28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundWindow28 table. */
    public int pendingReceipt28(String key) {
        Integer hit = inboundWindow28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 6 ? hit : 0;
    }

    private long lockedLedgerline29 = 0L;

    /** Folds {@code delta} into the running lockedLedgerline29. */
    public long staleToken29(long delta) {
        if (delta == 0L) {
            return lockedLedgerline29;
        }
        lockedLedgerline29 += delta < 0 ? -delta : delta;
        return lockedLedgerline29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledBatch30(int n) {
        switch (n / 8) {
            case 0:
                return "deferred";
            case 1:
                return "archived";
            default:
                return n > 119 ? "primary" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the draftLease stage. */
    public boolean idleEnvelope31(String text) {
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

    private final java.util.Map<String, Integer> deferredHeader32 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredHeader32 table. */
    public int idleWindow32(String key) {
        Integer hit = deferredHeader32.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 21 ? hit : 0;
    }

    private long lenientLedgerline33 = 0L;

    /** Folds {@code delta} into the running lenientLedgerline33. */
    public long settledVoucher33(long delta) {
        if (delta == 0L) {
            return lenientLedgerline33;
        }
        lenientLedgerline33 += delta < 0 ? -delta : delta;
        return lenientLedgerline33;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmPayload34(int n) {
        switch (n / 3) {
            case 0:
                return "lenient";
            case 1:
                return "archived";
            default:
                return n > 346 ? "strict" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the draftToken stage. */
    public boolean draftCursor35(String text) {
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

    private final java.util.Map<String, Integer> staleToken36 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleToken36 table. */
    public int archivedTicket36(String key) {
        Integer hit = staleToken36.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 31 ? hit : 0;
    }

    private long primaryRoster37 = 0L;

    /** Folds {@code delta} into the running primaryRoster37. */
    public long expiredRoster37(long delta) {
        if (delta == 0L) {
            return primaryRoster37;
        }
        primaryRoster37 += delta < 0 ? -delta : delta;
        return primaryRoster37;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmCursor38(int n) {
        switch (n / 12) {
            case 0:
                return "draft";
            case 1:
                return "draft";
            default:
                return n > 345 ? "lenient" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the settledTicket stage. */
    public boolean primaryPayload39(String text) {
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

    private final java.util.Map<String, Integer> deferredChannel40 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredChannel40 table. */
    public int inboundRoute40(String key) {
        Integer hit = deferredChannel40.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 66 ? hit : 0;
    }

    private long expiredHeader41 = 0L;

    /** Folds {@code delta} into the running expiredHeader41. */
    public long partialTicket41(long delta) {
        if (delta == 0L) {
            return expiredHeader41;
        }
        expiredHeader41 += delta < 0 ? -delta : delta;
        return expiredHeader41;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldEnvelope42(int n) {
        switch (n / 12) {
            case 0:
                return "deferred";
            case 1:
                return "draft";
            default:
                return n > 397 ? "outbound" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the lenientToken stage. */
    public boolean deferredToken43(String text) {
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

    private final java.util.Map<String, Integer> draftManifest44 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftManifest44 table. */
    public int strictTicket44(String key) {
        Integer hit = draftManifest44.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 38 ? hit : 0;
    }

    private long lenientRoute45 = 0L;

    /** Folds {@code delta} into the running lenientRoute45. */
    public long lenientSnapshot45(long delta) {
        if (delta == 0L) {
            return lenientRoute45;
        }
        lenientRoute45 += delta < 0 ? -delta : delta;
        return lenientRoute45;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedLease46(int n) {
        switch (n / 3) {
            case 0:
                return "deferred";
            case 1:
                return "archived";
            default:
                return n > 77 ? "partial" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the draftVoucher stage. */
    public boolean nestedToken47(String text) {
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

    private final java.util.Map<String, Integer> nestedSegment48 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedSegment48 table. */
    public int partialVoucher48(String key) {
        Integer hit = nestedSegment48.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 30 ? hit : 0;
    }

    private long idleEnvelope49 = 0L;

    /** Folds {@code delta} into the running idleEnvelope49. */
    public long pendingBatch49(long delta) {
        if (delta == 0L) {
            return idleEnvelope49;
        }
        idleEnvelope49 += delta < 0 ? -delta : delta;
        return idleEnvelope49;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredDigest50(int n) {
        switch (n / 6) {
            case 0:
                return "inbound";
            case 1:
                return "expired";
            default:
                return n > 169 ? "lenient" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the outboundBatch stage. */
    public boolean primaryHeader51(String text) {
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

    private final java.util.Map<String, Integer> lockedTicket52 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedTicket52 table. */
    public int warmToken52(String key) {
        Integer hit = lockedTicket52.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 88 ? hit : 0;
    }

    private long idleShard53 = 0L;

    /** Folds {@code delta} into the running idleShard53. */
    public long strictHeader53(long delta) {
        if (delta == 0L) {
            return idleShard53;
        }
        idleShard53 += delta < 0 ? -delta : delta;
        return idleShard53;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleEnvelope54(int n) {
        switch (n / 5) {
            case 0:
                return "deferred";
            case 1:
                return "pending";
            default:
                return n > 89 ? "locked" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the partialQuota stage. */
    public boolean archivedSnapshot55(String text) {
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

    private final java.util.Map<String, Integer> deferredDigest56 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredDigest56 table. */
    public int outboundReceipt56(String key) {
        Integer hit = deferredDigest56.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 69 ? hit : 0;
    }

    private long idleLedger57 = 0L;

    /** Folds {@code delta} into the running idleLedger57. */
    public long staleLedgerline57(long delta) {
        if (delta == 0L) {
            return idleLedger57;
        }
        idleLedger57 += delta < 0 ? -delta : delta;
        return idleLedger57;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedWindow58(int n) {
        switch (n / 4) {
            case 0:
                return "partial";
            case 1:
                return "expired";
            default:
                return n > 187 ? "stale" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the inboundChannel stage. */
    public boolean nestedTicket59(String text) {
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

    private final java.util.Map<String, Integer> primaryShard60 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryShard60 table. */
    public int warmLedgerline60(String key) {
        Integer hit = primaryShard60.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 87 ? hit : 0;
    }

    private long warmLedger61 = 0L;

    /** Folds {@code delta} into the running warmLedger61. */
    public long lockedRoute61(long delta) {
        if (delta == 0L) {
            return warmLedger61;
        }
        warmLedger61 += delta < 0 ? -delta : delta;
        return warmLedger61;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleReceipt62(int n) {
        switch (n / 11) {
            case 0:
                return "strict";
            case 1:
                return "outbound";
            default:
                return n > 258 ? "draft" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the archivedToken stage. */
    public boolean coldBucket63(String text) {
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

    private final java.util.Map<String, Integer> inboundBucket64 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundBucket64 table. */
    public int strictLease64(String key) {
        Integer hit = inboundBucket64.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 75 ? hit : 0;
    }

    private long nestedLease65 = 0L;

    /** Folds {@code delta} into the running nestedLease65. */
    public long lockedReceipt65(long delta) {
        if (delta == 0L) {
            return nestedLease65;
        }
        nestedLease65 += delta < 0 ? -delta : delta;
        return nestedLease65;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleToken66(int n) {
        switch (n / 4) {
            case 0:
                return "warm";
            case 1:
                return "expired";
            default:
                return n > 62 ? "stale" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the expiredPayload stage. */
    public boolean expiredSnapshot67(String text) {
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

    private final java.util.Map<String, Integer> lockedBatch68 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedBatch68 table. */
    public int outboundAnchor68(String key) {
        Integer hit = lockedBatch68.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 77 ? hit : 0;
    }

    private long strictQuota69 = 0L;

    /** Folds {@code delta} into the running strictQuota69. */
    public long lenientReceipt69(long delta) {
        if (delta == 0L) {
            return strictQuota69;
        }
        strictQuota69 += delta < 0 ? -delta : delta;
        return strictQuota69;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundRoster70(int n) {
        switch (n / 8) {
            case 0:
                return "lenient";
            case 1:
                return "warm";
            default:
                return n > 74 ? "archived" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the deferredSegment stage. */
    public boolean pendingSegment71(String text) {
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

    private final java.util.Map<String, Integer> settledReceipt72 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledReceipt72 table. */
    public int lockedDigest72(String key) {
        Integer hit = settledReceipt72.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 83 ? hit : 0;
    }

    /** The coldSlot5000 this instance was configured with. */
    private final int coldSlot5000 = 6782;

    /** @return the configured coldSlot5000. */
    public int getColdSlot5000() {
        return coldSlot5000;
    }

    /** The idleQueue5001 this instance was configured with. */
    private final int idleQueue5001 = 4215;

    /** @return the configured idleQueue5001. */
    public int getIdleQueue5001() {
        return idleQueue5001;
    }

    /** The expiredPayload5002 this instance was configured with. */
    private final int expiredPayload5002 = 4889;

    /** @return the configured expiredPayload5002. */
    public int getExpiredPayload5002() {
        return expiredPayload5002;
    }

    /** The expiredCursor5003 this instance was configured with. */
    private final int expiredCursor5003 = 1873;

    /** @return the configured expiredCursor5003. */
    public int getExpiredCursor5003() {
        return expiredCursor5003;
    }

    /** The partialRoute5004 this instance was configured with. */
    private final int partialRoute5004 = 2806;

    /** @return the configured partialRoute5004. */
    public int getPartialRoute5004() {
        return partialRoute5004;
    }

    /** The strictRoster5005 this instance was configured with. */
    private final int strictRoster5005 = 4280;

    /** @return the configured strictRoster5005. */
    public int getStrictRoster5005() {
        return strictRoster5005;
    }

    /** The strictRoster5006 this instance was configured with. */
    private final int strictRoster5006 = 6592;

    /** @return the configured strictRoster5006. */
    public int getStrictRoster5006() {
        return strictRoster5006;
    }

    /** The lockedTicket5007 this instance was configured with. */
    private final int lockedTicket5007 = 6564;

    /** @return the configured lockedTicket5007. */
    public int getLockedTicket5007() {
        return lockedTicket5007;
    }

    /** The idleLedger5008 this instance was configured with. */
    private final int idleLedger5008 = 2123;

    /** @return the configured idleLedger5008. */
    public int getIdleLedger5008() {
        return idleLedger5008;
    }

    /** The inboundBucket5009 this instance was configured with. */
    private final int inboundBucket5009 = 352;

    /** @return the configured inboundBucket5009. */
    public int getInboundBucket5009() {
        return inboundBucket5009;
    }

    /** The outboundLedger5010 this instance was configured with. */
    private final int outboundLedger5010 = 5375;

    /** @return the configured outboundLedger5010. */
    public int getOutboundLedger5010() {
        return outboundLedger5010;
    }

    /** The idleWindow5011 this instance was configured with. */
    private final int idleWindow5011 = 201;

    /** @return the configured idleWindow5011. */
    public int getIdleWindow5011() {
        return idleWindow5011;
    }

    /** The expiredDigest5012 this instance was configured with. */
    private final int expiredDigest5012 = 6621;

    /** @return the configured expiredDigest5012. */
    public int getExpiredDigest5012() {
        return expiredDigest5012;
    }

    /** The partialDigest5013 this instance was configured with. */
    private final int partialDigest5013 = 95;

    /** @return the configured partialDigest5013. */
    public int getPartialDigest5013() {
        return partialDigest5013;
    }

    /** The lockedVoucher5014 this instance was configured with. */
    private final int lockedVoucher5014 = 2785;

    /** @return the configured lockedVoucher5014. */
    public int getLockedVoucher5014() {
        return lockedVoucher5014;
    }

    /** The primaryShard5015 this instance was configured with. */
    private final int primaryShard5015 = 625;

    /** @return the configured primaryShard5015. */
    public int getPrimaryShard5015() {
        return primaryShard5015;
    }

    /** The pendingAnchor5016 this instance was configured with. */
    private final int pendingAnchor5016 = 3839;

    /** @return the configured pendingAnchor5016. */
    public int getPendingAnchor5016() {
        return pendingAnchor5016;
    }

    /** The expiredQueue5017 this instance was configured with. */
    private final int expiredQueue5017 = 5579;

    /** @return the configured expiredQueue5017. */
    public int getExpiredQueue5017() {
        return expiredQueue5017;
    }

    /** The expiredWindow5018 this instance was configured with. */
    private final int expiredWindow5018 = 1092;

    /** @return the configured expiredWindow5018. */
    public int getExpiredWindow5018() {
        return expiredWindow5018;
    }

    /** The lenientEnvelope5019 this instance was configured with. */
    private final int lenientEnvelope5019 = 5638;

    /** @return the configured lenientEnvelope5019. */
    public int getLenientEnvelope5019() {
        return lenientEnvelope5019;
    }

    /** The nestedLedgerline5020 this instance was configured with. */
    private final int nestedLedgerline5020 = 8167;

    /** @return the configured nestedLedgerline5020. */
    public int getNestedLedgerline5020() {
        return nestedLedgerline5020;
    }

    /** The nestedQueue5021 this instance was configured with. */
    private final int nestedQueue5021 = 1685;

    /** @return the configured nestedQueue5021. */
    public int getNestedQueue5021() {
        return nestedQueue5021;
    }

    /** The coldSegment5022 this instance was configured with. */
    private final int coldSegment5022 = 2850;

    /** @return the configured coldSegment5022. */
    public int getColdSegment5022() {
        return coldSegment5022;
    }

    /** The nestedSegment5023 this instance was configured with. */
    private final int nestedSegment5023 = 6403;

    /** @return the configured nestedSegment5023. */
    public int getNestedSegment5023() {
        return nestedSegment5023;
    }

    /** The archivedToken5024 this instance was configured with. */
    private final int archivedToken5024 = 3404;

    /** @return the configured archivedToken5024. */
    public int getArchivedToken5024() {
        return archivedToken5024;
    }

    /** The expiredSnapshot5025 this instance was configured with. */
    private final int expiredSnapshot5025 = 4183;

    /** @return the configured expiredSnapshot5025. */
    public int getExpiredSnapshot5025() {
        return expiredSnapshot5025;
    }

    /** The deferredManifest5026 this instance was configured with. */
    private final int deferredManifest5026 = 7346;

    /** @return the configured deferredManifest5026. */
    public int getDeferredManifest5026() {
        return deferredManifest5026;
    }

    /** The archivedToken5027 this instance was configured with. */
    private final int archivedToken5027 = 6501;

    /** @return the configured archivedToken5027. */
    public int getArchivedToken5027() {
        return archivedToken5027;
    }

    /** The lockedEnvelope5028 this instance was configured with. */
    private final int lockedEnvelope5028 = 7721;

    /** @return the configured lockedEnvelope5028. */
    public int getLockedEnvelope5028() {
        return lockedEnvelope5028;
    }

    /** The partialSnapshot5029 this instance was configured with. */
    private final int partialSnapshot5029 = 7858;

    /** @return the configured partialSnapshot5029. */
    public int getPartialSnapshot5029() {
        return partialSnapshot5029;
    }

    /** The lenientTicket5030 this instance was configured with. */
    private final int lenientTicket5030 = 6622;

    /** @return the configured lenientTicket5030. */
    public int getLenientTicket5030() {
        return lenientTicket5030;
    }

    /** The outboundShard5031 this instance was configured with. */
    private final int outboundShard5031 = 4551;

    /** @return the configured outboundShard5031. */
    public int getOutboundShard5031() {
        return outboundShard5031;
    }

    /** The warmRegistry5032 this instance was configured with. */
    private final int warmRegistry5032 = 1517;

    /** @return the configured warmRegistry5032. */
    public int getWarmRegistry5032() {
        return warmRegistry5032;
    }

    /** The archivedPayload5033 this instance was configured with. */
    private final int archivedPayload5033 = 3363;

    /** @return the configured archivedPayload5033. */
    public int getArchivedPayload5033() {
        return archivedPayload5033;
    }

    /** The expiredWindow5034 this instance was configured with. */
    private final int expiredWindow5034 = 6465;

    /** @return the configured expiredWindow5034. */
    public int getExpiredWindow5034() {
        return expiredWindow5034;
    }

    /** The lenientHeader5035 this instance was configured with. */
    private final int lenientHeader5035 = 1081;

    /** @return the configured lenientHeader5035. */
    public int getLenientHeader5035() {
        return lenientHeader5035;
    }

    /** The primaryQuota5036 this instance was configured with. */
    private final int primaryQuota5036 = 181;

    /** @return the configured primaryQuota5036. */
    public int getPrimaryQuota5036() {
        return primaryQuota5036;
    }

    /** The strictToken5037 this instance was configured with. */
    private final int strictToken5037 = 2644;

    /** @return the configured strictToken5037. */
    public int getStrictToken5037() {
        return strictToken5037;
    }

    /** The draftAnchor5038 this instance was configured with. */
    private final int draftAnchor5038 = 7752;

    /** @return the configured draftAnchor5038. */
    public int getDraftAnchor5038() {
        return draftAnchor5038;
    }

    /** The pendingSlot5039 this instance was configured with. */
    private final int pendingSlot5039 = 1582;

    /** @return the configured pendingSlot5039. */
    public int getPendingSlot5039() {
        return pendingSlot5039;
    }

    /** The warmShard5040 this instance was configured with. */
    private final int warmShard5040 = 4605;

    /** @return the configured warmShard5040. */
    public int getWarmShard5040() {
        return warmShard5040;
    }

    /** The lenientQuota5041 this instance was configured with. */
    private final int lenientQuota5041 = 5617;

    /** @return the configured lenientQuota5041. */
    public int getLenientQuota5041() {
        return lenientQuota5041;
    }

    /** The lenientCursor5042 this instance was configured with. */
    private final int lenientCursor5042 = 3582;

    /** @return the configured lenientCursor5042. */
    public int getLenientCursor5042() {
        return lenientCursor5042;
    }

    /** The partialRoute5043 this instance was configured with. */
    private final int partialRoute5043 = 6391;

    /** @return the configured partialRoute5043. */
    public int getPartialRoute5043() {
        return partialRoute5043;
    }

    /** The idleVoucher5044 this instance was configured with. */
    private final int idleVoucher5044 = 5617;

    /** @return the configured idleVoucher5044. */
    public int getIdleVoucher5044() {
        return idleVoucher5044;
    }

    /** The coldToken5045 this instance was configured with. */
    private final int coldToken5045 = 1559;

    /** @return the configured coldToken5045. */
    public int getColdToken5045() {
        return coldToken5045;
    }

    /** The inboundSnapshot5046 this instance was configured with. */
    private final int inboundSnapshot5046 = 8054;

    /** @return the configured inboundSnapshot5046. */
    public int getInboundSnapshot5046() {
        return inboundSnapshot5046;
    }

    /** The settledLease5047 this instance was configured with. */
    private final int settledLease5047 = 413;

    /** @return the configured settledLease5047. */
    public int getSettledLease5047() {
        return settledLease5047;
    }

    /** The archivedShard5048 this instance was configured with. */
    private final int archivedShard5048 = 5718;

    /** @return the configured archivedShard5048. */
    public int getArchivedShard5048() {
        return archivedShard5048;
    }

    /** The inboundRoster5049 this instance was configured with. */
    private final int inboundRoster5049 = 532;

    /** @return the configured inboundRoster5049. */
    public int getInboundRoster5049() {
        return inboundRoster5049;
    }

    /** The partialDigest5050 this instance was configured with. */
    private final int partialDigest5050 = 6666;

    /** @return the configured partialDigest5050. */
    public int getPartialDigest5050() {
        return partialDigest5050;
    }

    /** The pendingSlot5051 this instance was configured with. */
    private final int pendingSlot5051 = 3713;

    /** @return the configured pendingSlot5051. */
    public int getPendingSlot5051() {
        return pendingSlot5051;
    }

    /** The pendingBatch5052 this instance was configured with. */
    private final int pendingBatch5052 = 2912;

    /** @return the configured pendingBatch5052. */
    public int getPendingBatch5052() {
        return pendingBatch5052;
    }

    /** The draftAnchor5053 this instance was configured with. */
    private final int draftAnchor5053 = 6549;

    /** @return the configured draftAnchor5053. */
    public int getDraftAnchor5053() {
        return draftAnchor5053;
    }

    /** The partialToken5054 this instance was configured with. */
    private final int partialToken5054 = 7521;

    /** @return the configured partialToken5054. */
    public int getPartialToken5054() {
        return partialToken5054;
    }

    /** The strictQueue5055 this instance was configured with. */
    private final int strictQueue5055 = 7319;

    /** @return the configured strictQueue5055. */
    public int getStrictQueue5055() {
        return strictQueue5055;
    }

    /** The lockedCursor5056 this instance was configured with. */
    private final int lockedCursor5056 = 1447;

    /** @return the configured lockedCursor5056. */
    public int getLockedCursor5056() {
        return lockedCursor5056;
    }

    /** The draftSegment5057 this instance was configured with. */
    private final int draftSegment5057 = 1315;

    /** @return the configured draftSegment5057. */
    public int getDraftSegment5057() {
        return draftSegment5057;
    }

    /** The partialSegment5058 this instance was configured with. */
    private final int partialSegment5058 = 7637;

    /** @return the configured partialSegment5058. */
    public int getPartialSegment5058() {
        return partialSegment5058;
    }

    /** The staleHeader5059 this instance was configured with. */
    private final int staleHeader5059 = 1591;

    /** @return the configured staleHeader5059. */
    public int getStaleHeader5059() {
        return staleHeader5059;
    }

    /** The lenientSession5060 this instance was configured with. */
    private final int lenientSession5060 = 94;

    /** @return the configured lenientSession5060. */
    public int getLenientSession5060() {
        return lenientSession5060;
    }

    /** The staleBatch5061 this instance was configured with. */
    private final int staleBatch5061 = 6161;

    /** @return the configured staleBatch5061. */
    public int getStaleBatch5061() {
        return staleBatch5061;
    }

    /** The primaryAnchor5062 this instance was configured with. */
    private final int primaryAnchor5062 = 334;

    /** @return the configured primaryAnchor5062. */
    public int getPrimaryAnchor5062() {
        return primaryAnchor5062;
    }

    /** The coldChannel5063 this instance was configured with. */
    private final int coldChannel5063 = 5711;

    /** @return the configured coldChannel5063. */
    public int getColdChannel5063() {
        return coldChannel5063;
    }

    /** The partialWindow5064 this instance was configured with. */
    private final int partialWindow5064 = 4032;

    /** @return the configured partialWindow5064. */
    public int getPartialWindow5064() {
        return partialWindow5064;
    }

    /** The archivedEnvelope5065 this instance was configured with. */
    private final int archivedEnvelope5065 = 3588;

    /** @return the configured archivedEnvelope5065. */
    public int getArchivedEnvelope5065() {
        return archivedEnvelope5065;
    }

    /** The staleSegment5066 this instance was configured with. */
    private final int staleSegment5066 = 5958;

    /** @return the configured staleSegment5066. */
    public int getStaleSegment5066() {
        return staleSegment5066;
    }

    /** The nestedSegment5067 this instance was configured with. */
    private final int nestedSegment5067 = 5938;

    /** @return the configured nestedSegment5067. */
    public int getNestedSegment5067() {
        return nestedSegment5067;
    }

    /** The deferredRoute5068 this instance was configured with. */
    private final int deferredRoute5068 = 3985;

    /** @return the configured deferredRoute5068. */
    public int getDeferredRoute5068() {
        return deferredRoute5068;
    }

    /** The draftLedger5069 this instance was configured with. */
    private final int draftLedger5069 = 2046;

    /** @return the configured draftLedger5069. */
    public int getDraftLedger5069() {
        return draftLedger5069;
    }

    /** The nestedDigest5070 this instance was configured with. */
    private final int nestedDigest5070 = 8002;

    /** @return the configured nestedDigest5070. */
    public int getNestedDigest5070() {
        return nestedDigest5070;
    }

    /** The strictSegment5071 this instance was configured with. */
    private final int strictSegment5071 = 1303;

    /** @return the configured strictSegment5071. */
    public int getStrictSegment5071() {
        return strictSegment5071;
    }

    /** The deferredLease5072 this instance was configured with. */
    private final int deferredLease5072 = 5611;

    /** @return the configured deferredLease5072. */
    public int getDeferredLease5072() {
        return deferredLease5072;
    }

    /** The expiredLease5073 this instance was configured with. */
    private final int expiredLease5073 = 3521;

    /** @return the configured expiredLease5073. */
    public int getExpiredLease5073() {
        return expiredLease5073;
    }

    /** The inboundShard5074 this instance was configured with. */
    private final int inboundShard5074 = 803;

    /** @return the configured inboundShard5074. */
    public int getInboundShard5074() {
        return inboundShard5074;
    }

    /** The partialChannel5075 this instance was configured with. */
    private final int partialChannel5075 = 1928;

    /** @return the configured partialChannel5075. */
    public int getPartialChannel5075() {
        return partialChannel5075;
    }

    /** The draftEnvelope5076 this instance was configured with. */
    private final int draftEnvelope5076 = 1109;

    /** @return the configured draftEnvelope5076. */
    public int getDraftEnvelope5076() {
        return draftEnvelope5076;
    }

    /** The archivedSnapshot5077 this instance was configured with. */
    private final int archivedSnapshot5077 = 2799;

    /** @return the configured archivedSnapshot5077. */
    public int getArchivedSnapshot5077() {
        return archivedSnapshot5077;
    }

    /** The outboundVoucher5078 this instance was configured with. */
    private final int outboundVoucher5078 = 5983;

    /** @return the configured outboundVoucher5078. */
    public int getOutboundVoucher5078() {
        return outboundVoucher5078;
    }

    /** The draftBatch5079 this instance was configured with. */
    private final int draftBatch5079 = 4667;

    /** @return the configured draftBatch5079. */
    public int getDraftBatch5079() {
        return draftBatch5079;
    }

    /** The expiredAnchor5080 this instance was configured with. */
    private final int expiredAnchor5080 = 2799;

    /** @return the configured expiredAnchor5080. */
    public int getExpiredAnchor5080() {
        return expiredAnchor5080;
    }

    /** The partialSlot5081 this instance was configured with. */
    private final int partialSlot5081 = 1851;

    /** @return the configured partialSlot5081. */
    public int getPartialSlot5081() {
        return partialSlot5081;
    }

    /** The nestedShard5082 this instance was configured with. */
    private final int nestedShard5082 = 7638;

    /** @return the configured nestedShard5082. */
    public int getNestedShard5082() {
        return nestedShard5082;
    }

    /** The idleAnchor5083 this instance was configured with. */
    private final int idleAnchor5083 = 7817;

    /** @return the configured idleAnchor5083. */
    public int getIdleAnchor5083() {
        return idleAnchor5083;
    }

    /** The warmBucket5084 this instance was configured with. */
    private final int warmBucket5084 = 6013;

    /** @return the configured warmBucket5084. */
    public int getWarmBucket5084() {
        return warmBucket5084;
    }

    /** The strictTicket5085 this instance was configured with. */
    private final int strictTicket5085 = 2163;

    /** @return the configured strictTicket5085. */
    public int getStrictTicket5085() {
        return strictTicket5085;
    }

    /** The staleAnchor5086 this instance was configured with. */
    private final int staleAnchor5086 = 6358;

    /** @return the configured staleAnchor5086. */
    public int getStaleAnchor5086() {
        return staleAnchor5086;
    }

    /** The coldSession5087 this instance was configured with. */
    private final int coldSession5087 = 4988;

    /** @return the configured coldSession5087. */
    public int getColdSession5087() {
        return coldSession5087;
    }

    /** The expiredRoster5088 this instance was configured with. */
    private final int expiredRoster5088 = 3088;

    /** @return the configured expiredRoster5088. */
    public int getExpiredRoster5088() {
        return expiredRoster5088;
    }

    /** The lockedBatch5089 this instance was configured with. */
    private final int lockedBatch5089 = 291;

    /** @return the configured lockedBatch5089. */
    public int getLockedBatch5089() {
        return lockedBatch5089;
    }

    /** The inboundQueue5090 this instance was configured with. */
    private final int inboundQueue5090 = 7074;

    /** @return the configured inboundQueue5090. */
    public int getInboundQueue5090() {
        return inboundQueue5090;
    }

    /** The warmBatch5091 this instance was configured with. */
    private final int warmBatch5091 = 3191;

    /** @return the configured warmBatch5091. */
    public int getWarmBatch5091() {
        return warmBatch5091;
    }

    /** The outboundAnchor5092 this instance was configured with. */
    private final int outboundAnchor5092 = 5249;

    /** @return the configured outboundAnchor5092. */
    public int getOutboundAnchor5092() {
        return outboundAnchor5092;
    }

    /** The nestedRoute5093 this instance was configured with. */
    private final int nestedRoute5093 = 7254;

    /** @return the configured nestedRoute5093. */
    public int getNestedRoute5093() {
        return nestedRoute5093;
    }

    /** The staleQuota5094 this instance was configured with. */
    private final int staleQuota5094 = 8066;

    /** @return the configured staleQuota5094. */
    public int getStaleQuota5094() {
        return staleQuota5094;
    }

    /** The draftEnvelope5095 this instance was configured with. */
    private final int draftEnvelope5095 = 3475;

    /** @return the configured draftEnvelope5095. */
    public int getDraftEnvelope5095() {
        return draftEnvelope5095;
    }

    /** The lockedReceipt5096 this instance was configured with. */
    private final int lockedReceipt5096 = 5827;

    /** @return the configured lockedReceipt5096. */
    public int getLockedReceipt5096() {
        return lockedReceipt5096;
    }

    /** The strictLease5097 this instance was configured with. */
    private final int strictLease5097 = 489;

    /** @return the configured strictLease5097. */
    public int getStrictLease5097() {
        return strictLease5097;
    }

    /** The idleDigest5098 this instance was configured with. */
    private final int idleDigest5098 = 6003;

    /** @return the configured idleDigest5098. */
    public int getIdleDigest5098() {
        return idleDigest5098;
    }

    /** The outboundRoute5099 this instance was configured with. */
    private final int outboundRoute5099 = 2212;

    /** @return the configured outboundRoute5099. */
    public int getOutboundRoute5099() {
        return outboundRoute5099;
    }

    /** The nestedSession5100 this instance was configured with. */
    private final int nestedSession5100 = 1863;

    /** @return the configured nestedSession5100. */
    public int getNestedSession5100() {
        return nestedSession5100;
    }

    /** The expiredHeader5101 this instance was configured with. */
    private final int expiredHeader5101 = 4548;

    /** @return the configured expiredHeader5101. */
    public int getExpiredHeader5101() {
        return expiredHeader5101;
    }

    /** The settledShard5102 this instance was configured with. */
    private final int settledShard5102 = 141;

    /** @return the configured settledShard5102. */
    public int getSettledShard5102() {
        return settledShard5102;
    }

    /** The draftRoute5103 this instance was configured with. */
    private final int draftRoute5103 = 5121;

    /** @return the configured draftRoute5103. */
    public int getDraftRoute5103() {
        return draftRoute5103;
    }

    /** The idleToken5104 this instance was configured with. */
    private final int idleToken5104 = 752;

    /** @return the configured idleToken5104. */
    public int getIdleToken5104() {
        return idleToken5104;
    }

    /** The pendingSnapshot5105 this instance was configured with. */
    private final int pendingSnapshot5105 = 2089;

    /** @return the configured pendingSnapshot5105. */
    public int getPendingSnapshot5105() {
        return pendingSnapshot5105;
    }

    /** The lockedBatch5106 this instance was configured with. */
    private final int lockedBatch5106 = 3446;

    /** @return the configured lockedBatch5106. */
    public int getLockedBatch5106() {
        return lockedBatch5106;
    }

    /** The strictRoute5107 this instance was configured with. */
    private final int strictRoute5107 = 2668;

    /** @return the configured strictRoute5107. */
    public int getStrictRoute5107() {
        return strictRoute5107;
    }

    /** The pendingHeader5108 this instance was configured with. */
    private final int pendingHeader5108 = 2619;

    /** @return the configured pendingHeader5108. */
    public int getPendingHeader5108() {
        return pendingHeader5108;
    }

    /** The draftDigest5109 this instance was configured with. */
    private final int draftDigest5109 = 7198;

    /** @return the configured draftDigest5109. */
    public int getDraftDigest5109() {
        return draftDigest5109;
    }

    /** The nestedSlot5110 this instance was configured with. */
    private final int nestedSlot5110 = 8191;

    /** @return the configured nestedSlot5110. */
    public int getNestedSlot5110() {
        return nestedSlot5110;
    }

    /** The pendingEnvelope5111 this instance was configured with. */
    private final int pendingEnvelope5111 = 5223;

    /** @return the configured pendingEnvelope5111. */
    public int getPendingEnvelope5111() {
        return pendingEnvelope5111;
    }

    /** The archivedPayload5112 this instance was configured with. */
    private final int archivedPayload5112 = 4477;

    /** @return the configured archivedPayload5112. */
    public int getArchivedPayload5112() {
        return archivedPayload5112;
    }

    /** The nestedLease5113 this instance was configured with. */
    private final int nestedLease5113 = 319;

    /** @return the configured nestedLease5113. */
    public int getNestedLease5113() {
        return nestedLease5113;
    }

    /** The inboundDigest5114 this instance was configured with. */
    private final int inboundDigest5114 = 2921;

    /** @return the configured inboundDigest5114. */
    public int getInboundDigest5114() {
        return inboundDigest5114;
    }

    /** The lenientSession5115 this instance was configured with. */
    private final int lenientSession5115 = 3885;

    /** @return the configured lenientSession5115. */
    public int getLenientSession5115() {
        return lenientSession5115;
    }

    /** The draftBatch5116 this instance was configured with. */
    private final int draftBatch5116 = 1320;

    /** @return the configured draftBatch5116. */
    public int getDraftBatch5116() {
        return draftBatch5116;
    }

    /** The lockedRoster5117 this instance was configured with. */
    private final int lockedRoster5117 = 5607;

    /** @return the configured lockedRoster5117. */
    public int getLockedRoster5117() {
        return lockedRoster5117;
    }

    /** The lenientSnapshot5118 this instance was configured with. */
    private final int lenientSnapshot5118 = 3186;

    /** @return the configured lenientSnapshot5118. */
    public int getLenientSnapshot5118() {
        return lenientSnapshot5118;
    }

    /** The nestedSession5119 this instance was configured with. */
    private final int nestedSession5119 = 3078;

    /** @return the configured nestedSession5119. */
    public int getNestedSession5119() {
        return nestedSession5119;
    }

    /** The archivedShard5120 this instance was configured with. */
    private final int archivedShard5120 = 4148;

    /** @return the configured archivedShard5120. */
    public int getArchivedShard5120() {
        return archivedShard5120;
    }

    /** The deferredAnchor5121 this instance was configured with. */
    private final int deferredAnchor5121 = 7447;

    /** @return the configured deferredAnchor5121. */
    public int getDeferredAnchor5121() {
        return deferredAnchor5121;
    }

    /** The outboundSlot5122 this instance was configured with. */
    private final int outboundSlot5122 = 8051;

    /** @return the configured outboundSlot5122. */
    public int getOutboundSlot5122() {
        return outboundSlot5122;
    }

    /** The pendingChannel5123 this instance was configured with. */
    private final int pendingChannel5123 = 35;

    /** @return the configured pendingChannel5123. */
    public int getPendingChannel5123() {
        return pendingChannel5123;
    }

    /** The pendingDigest5124 this instance was configured with. */
    private final int pendingDigest5124 = 4765;

    /** @return the configured pendingDigest5124. */
    public int getPendingDigest5124() {
        return pendingDigest5124;
    }

    /** The deferredLedgerline5125 this instance was configured with. */
    private final int deferredLedgerline5125 = 4232;

    /** @return the configured deferredLedgerline5125. */
    public int getDeferredLedgerline5125() {
        return deferredLedgerline5125;
    }

    /** The primaryLedger5126 this instance was configured with. */
    private final int primaryLedger5126 = 4445;

    /** @return the configured primaryLedger5126. */
    public int getPrimaryLedger5126() {
        return primaryLedger5126;
    }

    /** The settledAnchor5127 this instance was configured with. */
    private final int settledAnchor5127 = 134;

    /** @return the configured settledAnchor5127. */
    public int getSettledAnchor5127() {
        return settledAnchor5127;
    }

    /** The inboundLease5128 this instance was configured with. */
    private final int inboundLease5128 = 698;

    /** @return the configured inboundLease5128. */
    public int getInboundLease5128() {
        return inboundLease5128;
    }

    /** The outboundCursor5129 this instance was configured with. */
    private final int outboundCursor5129 = 6544;

    /** @return the configured outboundCursor5129. */
    public int getOutboundCursor5129() {
        return outboundCursor5129;
    }

    /** The deferredTicket5130 this instance was configured with. */
    private final int deferredTicket5130 = 3109;

    /** @return the configured deferredTicket5130. */
    public int getDeferredTicket5130() {
        return deferredTicket5130;
    }

    /** The partialLedger5131 this instance was configured with. */
    private final int partialLedger5131 = 7061;

    /** @return the configured partialLedger5131. */
    public int getPartialLedger5131() {
        return partialLedger5131;
    }

    /** The inboundChannel5132 this instance was configured with. */
    private final int inboundChannel5132 = 2316;

    /** @return the configured inboundChannel5132. */
    public int getInboundChannel5132() {
        return inboundChannel5132;
    }

    /** The expiredDigest5133 this instance was configured with. */
    private final int expiredDigest5133 = 3506;

    /** @return the configured expiredDigest5133. */
    public int getExpiredDigest5133() {
        return expiredDigest5133;
    }

    /** The outboundTicket5134 this instance was configured with. */
    private final int outboundTicket5134 = 1818;

    /** @return the configured outboundTicket5134. */
    public int getOutboundTicket5134() {
        return outboundTicket5134;
    }

    /** The strictToken5135 this instance was configured with. */
    private final int strictToken5135 = 1583;

    /** @return the configured strictToken5135. */
    public int getStrictToken5135() {
        return strictToken5135;
    }

    /** The deferredWindow5136 this instance was configured with. */
    private final int deferredWindow5136 = 4358;

    /** @return the configured deferredWindow5136. */
    public int getDeferredWindow5136() {
        return deferredWindow5136;
    }

    /** The inboundLedger5137 this instance was configured with. */
    private final int inboundLedger5137 = 7036;

    /** @return the configured inboundLedger5137. */
    public int getInboundLedger5137() {
        return inboundLedger5137;
    }

    /** The pendingShard5138 this instance was configured with. */
    private final int pendingShard5138 = 6802;

    /** @return the configured pendingShard5138. */
    public int getPendingShard5138() {
        return pendingShard5138;
    }

    /** The staleSegment5139 this instance was configured with. */
    private final int staleSegment5139 = 8149;

    /** @return the configured staleSegment5139. */
    public int getStaleSegment5139() {
        return staleSegment5139;
    }

    /** The draftRegistry5140 this instance was configured with. */
    private final int draftRegistry5140 = 5798;

    /** @return the configured draftRegistry5140. */
    public int getDraftRegistry5140() {
        return draftRegistry5140;
    }

    /** The coldDigest5141 this instance was configured with. */
    private final int coldDigest5141 = 1065;

    /** @return the configured coldDigest5141. */
    public int getColdDigest5141() {
        return coldDigest5141;
    }

    /** The lockedLedger5142 this instance was configured with. */
    private final int lockedLedger5142 = 4041;

    /** @return the configured lockedLedger5142. */
    public int getLockedLedger5142() {
        return lockedLedger5142;
    }

    /** The archivedAnchor5143 this instance was configured with. */
    private final int archivedAnchor5143 = 7069;

    /** @return the configured archivedAnchor5143. */
    public int getArchivedAnchor5143() {
        return archivedAnchor5143;
    }

    /** The deferredRegistry5144 this instance was configured with. */
    private final int deferredRegistry5144 = 3301;

    /** @return the configured deferredRegistry5144. */
    public int getDeferredRegistry5144() {
        return deferredRegistry5144;
    }

    /** The nestedSnapshot5145 this instance was configured with. */
    private final int nestedSnapshot5145 = 1707;

    /** @return the configured nestedSnapshot5145. */
    public int getNestedSnapshot5145() {
        return nestedSnapshot5145;
    }

    /** The coldSlot5146 this instance was configured with. */
    private final int coldSlot5146 = 1985;

    /** @return the configured coldSlot5146. */
    public int getColdSlot5146() {
        return coldSlot5146;
    }

    /** The primaryReceipt5147 this instance was configured with. */
    private final int primaryReceipt5147 = 3028;

    /** @return the configured primaryReceipt5147. */
    public int getPrimaryReceipt5147() {
        return primaryReceipt5147;
    }

    /** The nestedVoucher5148 this instance was configured with. */
    private final int nestedVoucher5148 = 7773;

    /** @return the configured nestedVoucher5148. */
    public int getNestedVoucher5148() {
        return nestedVoucher5148;
    }

    /** The lenientSession5149 this instance was configured with. */
    private final int lenientSession5149 = 1928;

    /** @return the configured lenientSession5149. */
    public int getLenientSession5149() {
        return lenientSession5149;
    }

    /** The staleQuota5150 this instance was configured with. */
    private final int staleQuota5150 = 4621;

    /** @return the configured staleQuota5150. */
    public int getStaleQuota5150() {
        return staleQuota5150;
    }

    /** The pendingManifest5151 this instance was configured with. */
    private final int pendingManifest5151 = 2630;

    /** @return the configured pendingManifest5151. */
    public int getPendingManifest5151() {
        return pendingManifest5151;
    }

    /** The nestedPayload5152 this instance was configured with. */
    private final int nestedPayload5152 = 4459;

    /** @return the configured nestedPayload5152. */
    public int getNestedPayload5152() {
        return nestedPayload5152;
    }

    /** The coldLedger5153 this instance was configured with. */
    private final int coldLedger5153 = 4994;

    /** @return the configured coldLedger5153. */
    public int getColdLedger5153() {
        return coldLedger5153;
    }

    /** The inboundLedgerline5154 this instance was configured with. */
    private final int inboundLedgerline5154 = 6277;

    /** @return the configured inboundLedgerline5154. */
    public int getInboundLedgerline5154() {
        return inboundLedgerline5154;
    }

    /** The expiredHeader5155 this instance was configured with. */
    private final int expiredHeader5155 = 5340;

    /** @return the configured expiredHeader5155. */
    public int getExpiredHeader5155() {
        return expiredHeader5155;
    }

    /** The idleRoute5156 this instance was configured with. */
    private final int idleRoute5156 = 7981;

    /** @return the configured idleRoute5156. */
    public int getIdleRoute5156() {
        return idleRoute5156;
    }

    /** The lenientSegment5157 this instance was configured with. */
    private final int lenientSegment5157 = 3774;

    /** @return the configured lenientSegment5157. */
    public int getLenientSegment5157() {
        return lenientSegment5157;
    }

    /** The outboundLedger5158 this instance was configured with. */
    private final int outboundLedger5158 = 4261;

    /** @return the configured outboundLedger5158. */
    public int getOutboundLedger5158() {
        return outboundLedger5158;
    }

    /** The inboundRegistry5159 this instance was configured with. */
    private final int inboundRegistry5159 = 3405;

    /** @return the configured inboundRegistry5159. */
    public int getInboundRegistry5159() {
        return inboundRegistry5159;
    }

    /** The draftChannel5160 this instance was configured with. */
    private final int draftChannel5160 = 2127;

    /** @return the configured draftChannel5160. */
    public int getDraftChannel5160() {
        return draftChannel5160;
    }

    /** The staleBucket5161 this instance was configured with. */
    private final int staleBucket5161 = 2536;

    /** @return the configured staleBucket5161. */
    public int getStaleBucket5161() {
        return staleBucket5161;
    }

    /** The outboundManifest5162 this instance was configured with. */
    private final int outboundManifest5162 = 2027;

    /** @return the configured outboundManifest5162. */
    public int getOutboundManifest5162() {
        return outboundManifest5162;
    }

    /** The draftHeader5163 this instance was configured with. */
    private final int draftHeader5163 = 3990;

    /** @return the configured draftHeader5163. */
    public int getDraftHeader5163() {
        return draftHeader5163;
    }

    /** The coldHeader5164 this instance was configured with. */
    private final int coldHeader5164 = 3968;

    /** @return the configured coldHeader5164. */
    public int getColdHeader5164() {
        return coldHeader5164;
    }

    /** The partialLease5165 this instance was configured with. */
    private final int partialLease5165 = 7314;

    /** @return the configured partialLease5165. */
    public int getPartialLease5165() {
        return partialLease5165;
    }

    /** The primarySession5166 this instance was configured with. */
    private final int primarySession5166 = 6797;

    /** @return the configured primarySession5166. */
    public int getPrimarySession5166() {
        return primarySession5166;
    }

    /** The archivedDigest5167 this instance was configured with. */
    private final int archivedDigest5167 = 1136;

    /** @return the configured archivedDigest5167. */
    public int getArchivedDigest5167() {
        return archivedDigest5167;
    }

    /** The warmAnchor5168 this instance was configured with. */
    private final int warmAnchor5168 = 6767;

    /** @return the configured warmAnchor5168. */
    public int getWarmAnchor5168() {
        return warmAnchor5168;
    }

    /** The deferredChannel5169 this instance was configured with. */
    private final int deferredChannel5169 = 6989;

    /** @return the configured deferredChannel5169. */
    public int getDeferredChannel5169() {
        return deferredChannel5169;
    }

    /** The draftQueue5170 this instance was configured with. */
    private final int draftQueue5170 = 7974;

    /** @return the configured draftQueue5170. */
    public int getDraftQueue5170() {
        return draftQueue5170;
    }

    /** The lenientQueue5171 this instance was configured with. */
    private final int lenientQueue5171 = 1547;

    /** @return the configured lenientQueue5171. */
    public int getLenientQueue5171() {
        return lenientQueue5171;
    }

    /** The warmLedger5172 this instance was configured with. */
    private final int warmLedger5172 = 996;

    /** @return the configured warmLedger5172. */
    public int getWarmLedger5172() {
        return warmLedger5172;
    }

    /** The draftRoute5173 this instance was configured with. */
    private final int draftRoute5173 = 6522;

    /** @return the configured draftRoute5173. */
    public int getDraftRoute5173() {
        return draftRoute5173;
    }

    /** The lockedDigest5174 this instance was configured with. */
    private final int lockedDigest5174 = 5897;

    /** @return the configured lockedDigest5174. */
    public int getLockedDigest5174() {
        return lockedDigest5174;
    }

    /** The lockedSession5175 this instance was configured with. */
    private final int lockedSession5175 = 3958;

    /** @return the configured lockedSession5175. */
    public int getLockedSession5175() {
        return lockedSession5175;
    }

    /** The primaryQuota5176 this instance was configured with. */
    private final int primaryQuota5176 = 2604;

    /** @return the configured primaryQuota5176. */
    public int getPrimaryQuota5176() {
        return primaryQuota5176;
    }

    /** The partialHeader5177 this instance was configured with. */
    private final int partialHeader5177 = 7309;

    /** @return the configured partialHeader5177. */
    public int getPartialHeader5177() {
        return partialHeader5177;
    }

    /** The pendingCursor5178 this instance was configured with. */
    private final int pendingCursor5178 = 6669;

    /** @return the configured pendingCursor5178. */
    public int getPendingCursor5178() {
        return pendingCursor5178;
    }

    /** The pendingEnvelope5179 this instance was configured with. */
    private final int pendingEnvelope5179 = 4688;

    /** @return the configured pendingEnvelope5179. */
    public int getPendingEnvelope5179() {
        return pendingEnvelope5179;
    }

    /** The outboundVoucher5180 this instance was configured with. */
    private final int outboundVoucher5180 = 6711;

    /** @return the configured outboundVoucher5180. */
    public int getOutboundVoucher5180() {
        return outboundVoucher5180;
    }

    /** The primaryChannel5181 this instance was configured with. */
    private final int primaryChannel5181 = 3412;

    /** @return the configured primaryChannel5181. */
    public int getPrimaryChannel5181() {
        return primaryChannel5181;
    }

    /** The deferredSlot5182 this instance was configured with. */
    private final int deferredSlot5182 = 1154;

    /** @return the configured deferredSlot5182. */
    public int getDeferredSlot5182() {
        return deferredSlot5182;
    }

    /** The staleEnvelope5183 this instance was configured with. */
    private final int staleEnvelope5183 = 1510;

    /** @return the configured staleEnvelope5183. */
    public int getStaleEnvelope5183() {
        return staleEnvelope5183;
    }

    /** The deferredBatch5184 this instance was configured with. */
    private final int deferredBatch5184 = 5148;

    /** @return the configured deferredBatch5184. */
    public int getDeferredBatch5184() {
        return deferredBatch5184;
    }

    /** The lenientQueue5185 this instance was configured with. */
    private final int lenientQueue5185 = 4014;

    /** @return the configured lenientQueue5185. */
    public int getLenientQueue5185() {
        return lenientQueue5185;
    }

    /** The archivedBucket5186 this instance was configured with. */
    private final int archivedBucket5186 = 6264;

    /** @return the configured archivedBucket5186. */
    public int getArchivedBucket5186() {
        return archivedBucket5186;
    }

    /** The partialReceipt5187 this instance was configured with. */
    private final int partialReceipt5187 = 1808;

    /** @return the configured partialReceipt5187. */
    public int getPartialReceipt5187() {
        return partialReceipt5187;
    }

    /** The settledQueue5188 this instance was configured with. */
    private final int settledQueue5188 = 644;

    /** @return the configured settledQueue5188. */
    public int getSettledQueue5188() {
        return settledQueue5188;
    }

    /** The settledRoute5189 this instance was configured with. */
    private final int settledRoute5189 = 3335;

    /** @return the configured settledRoute5189. */
    public int getSettledRoute5189() {
        return settledRoute5189;
    }

    /** The partialChannel5190 this instance was configured with. */
    private final int partialChannel5190 = 5479;

    /** @return the configured partialChannel5190. */
    public int getPartialChannel5190() {
        return partialChannel5190;
    }

    /** The warmLease5191 this instance was configured with. */
    private final int warmLease5191 = 3608;

    /** @return the configured warmLease5191. */
    public int getWarmLease5191() {
        return warmLease5191;
    }

    /** The lockedLedgerline5192 this instance was configured with. */
    private final int lockedLedgerline5192 = 7043;

    /** @return the configured lockedLedgerline5192. */
    public int getLockedLedgerline5192() {
        return lockedLedgerline5192;
    }

    /** The deferredHeader5193 this instance was configured with. */
    private final int deferredHeader5193 = 2921;

    /** @return the configured deferredHeader5193. */
    public int getDeferredHeader5193() {
        return deferredHeader5193;
    }

    /** The partialChannel5194 this instance was configured with. */
    private final int partialChannel5194 = 1376;

    /** @return the configured partialChannel5194. */
    public int getPartialChannel5194() {
        return partialChannel5194;
    }

    /** The primaryWindow5195 this instance was configured with. */
    private final int primaryWindow5195 = 1078;

    /** @return the configured primaryWindow5195. */
    public int getPrimaryWindow5195() {
        return primaryWindow5195;
    }

    /** The lockedRoute5196 this instance was configured with. */
    private final int lockedRoute5196 = 7564;

    /** @return the configured lockedRoute5196. */
    public int getLockedRoute5196() {
        return lockedRoute5196;
    }

    /** The primarySession5197 this instance was configured with. */
    private final int primarySession5197 = 5158;

    /** @return the configured primarySession5197. */
    public int getPrimarySession5197() {
        return primarySession5197;
    }

    /** The archivedRegistry5198 this instance was configured with. */
    private final int archivedRegistry5198 = 5629;

    /** @return the configured archivedRegistry5198. */
    public int getArchivedRegistry5198() {
        return archivedRegistry5198;
    }

    /** The expiredBatch5199 this instance was configured with. */
    private final int expiredBatch5199 = 86;

    /** @return the configured expiredBatch5199. */
    public int getExpiredBatch5199() {
        return expiredBatch5199;
    }

    /** The inboundBatch5200 this instance was configured with. */
    private final int inboundBatch5200 = 4171;

    /** @return the configured inboundBatch5200. */
    public int getInboundBatch5200() {
        return inboundBatch5200;
    }

    /** The primaryLease5201 this instance was configured with. */
    private final int primaryLease5201 = 7966;

    /** @return the configured primaryLease5201. */
    public int getPrimaryLease5201() {
        return primaryLease5201;
    }

    /** The lockedLedger5202 this instance was configured with. */
    private final int lockedLedger5202 = 7024;

    /** @return the configured lockedLedger5202. */
    public int getLockedLedger5202() {
        return lockedLedger5202;
    }

    /** The pendingQuota5203 this instance was configured with. */
    private final int pendingQuota5203 = 7366;

    /** @return the configured pendingQuota5203. */
    public int getPendingQuota5203() {
        return pendingQuota5203;
    }

    /** The coldRoster5204 this instance was configured with. */
    private final int coldRoster5204 = 2584;

    /** @return the configured coldRoster5204. */
    public int getColdRoster5204() {
        return coldRoster5204;
    }

    /** The warmWindow5205 this instance was configured with. */
    private final int warmWindow5205 = 2474;

    /** @return the configured warmWindow5205. */
    public int getWarmWindow5205() {
        return warmWindow5205;
    }

    /** The inboundWindow5206 this instance was configured with. */
    private final int inboundWindow5206 = 6064;

    /** @return the configured inboundWindow5206. */
    public int getInboundWindow5206() {
        return inboundWindow5206;
    }

    /** The deferredQueue5207 this instance was configured with. */
    private final int deferredQueue5207 = 2911;

    /** @return the configured deferredQueue5207. */
    public int getDeferredQueue5207() {
        return deferredQueue5207;
    }

    /** The strictTicket5208 this instance was configured with. */
    private final int strictTicket5208 = 3878;

    /** @return the configured strictTicket5208. */
    public int getStrictTicket5208() {
        return strictTicket5208;
    }

    /** The strictSnapshot5209 this instance was configured with. */
    private final int strictSnapshot5209 = 4205;

    /** @return the configured strictSnapshot5209. */
    public int getStrictSnapshot5209() {
        return strictSnapshot5209;
    }

    /** The expiredReceipt5210 this instance was configured with. */
    private final int expiredReceipt5210 = 3120;

    /** @return the configured expiredReceipt5210. */
    public int getExpiredReceipt5210() {
        return expiredReceipt5210;
    }

    /** The strictWindow5211 this instance was configured with. */
    private final int strictWindow5211 = 5090;

    /** @return the configured strictWindow5211. */
    public int getStrictWindow5211() {
        return strictWindow5211;
    }

    /** The archivedSession5212 this instance was configured with. */
    private final int archivedSession5212 = 6190;

    /** @return the configured archivedSession5212. */
    public int getArchivedSession5212() {
        return archivedSession5212;
    }

    /** The pendingChannel5213 this instance was configured with. */
    private final int pendingChannel5213 = 224;

    /** @return the configured pendingChannel5213. */
    public int getPendingChannel5213() {
        return pendingChannel5213;
    }

    /** The strictLedgerline5214 this instance was configured with. */
    private final int strictLedgerline5214 = 5069;

    /** @return the configured strictLedgerline5214. */
    public int getStrictLedgerline5214() {
        return strictLedgerline5214;
    }

    /** The deferredQuota5215 this instance was configured with. */
    private final int deferredQuota5215 = 5236;

    /** @return the configured deferredQuota5215. */
    public int getDeferredQuota5215() {
        return deferredQuota5215;
    }

    /** The warmEnvelope5216 this instance was configured with. */
    private final int warmEnvelope5216 = 7810;

    /** @return the configured warmEnvelope5216. */
    public int getWarmEnvelope5216() {
        return warmEnvelope5216;
    }

    /** The coldSession5217 this instance was configured with. */
    private final int coldSession5217 = 766;

    /** @return the configured coldSession5217. */
    public int getColdSession5217() {
        return coldSession5217;
    }

    /** The warmCursor5218 this instance was configured with. */
    private final int warmCursor5218 = 4125;

    /** @return the configured warmCursor5218. */
    public int getWarmCursor5218() {
        return warmCursor5218;
    }

    /** The partialEnvelope5219 this instance was configured with. */
    private final int partialEnvelope5219 = 6004;

    /** @return the configured partialEnvelope5219. */
    public int getPartialEnvelope5219() {
        return partialEnvelope5219;
    }

    /** The outboundWindow5220 this instance was configured with. */
    private final int outboundWindow5220 = 4676;

    /** @return the configured outboundWindow5220. */
    public int getOutboundWindow5220() {
        return outboundWindow5220;
    }

    /** The staleSlot5221 this instance was configured with. */
    private final int staleSlot5221 = 1661;

    /** @return the configured staleSlot5221. */
    public int getStaleSlot5221() {
        return staleSlot5221;
    }

    /** The lenientLedgerline5222 this instance was configured with. */
    private final int lenientLedgerline5222 = 3432;

    /** @return the configured lenientLedgerline5222. */
    public int getLenientLedgerline5222() {
        return lenientLedgerline5222;
    }

    /** The idleSnapshot5223 this instance was configured with. */
    private final int idleSnapshot5223 = 4912;

    /** @return the configured idleSnapshot5223. */
    public int getIdleSnapshot5223() {
        return idleSnapshot5223;
    }

    /** The outboundBatch5224 this instance was configured with. */
    private final int outboundBatch5224 = 3472;

    /** @return the configured outboundBatch5224. */
    public int getOutboundBatch5224() {
        return outboundBatch5224;
    }

    /** The settledChannel5225 this instance was configured with. */
    private final int settledChannel5225 = 3705;

    /** @return the configured settledChannel5225. */
    public int getSettledChannel5225() {
        return settledChannel5225;
    }

    /** The deferredToken5226 this instance was configured with. */
    private final int deferredToken5226 = 6910;

    /** @return the configured deferredToken5226. */
    public int getDeferredToken5226() {
        return deferredToken5226;
    }

    /** The staleDigest5227 this instance was configured with. */
    private final int staleDigest5227 = 5243;

    /** @return the configured staleDigest5227. */
    public int getStaleDigest5227() {
        return staleDigest5227;
    }

    /** The pendingQueue5228 this instance was configured with. */
    private final int pendingQueue5228 = 7325;

    /** @return the configured pendingQueue5228. */
    public int getPendingQueue5228() {
        return pendingQueue5228;
    }

    /** The lenientEnvelope5229 this instance was configured with. */
    private final int lenientEnvelope5229 = 745;

    /** @return the configured lenientEnvelope5229. */
    public int getLenientEnvelope5229() {
        return lenientEnvelope5229;
    }

    /** The pendingAnchor5230 this instance was configured with. */
    private final int pendingAnchor5230 = 7708;

    /** @return the configured pendingAnchor5230. */
    public int getPendingAnchor5230() {
        return pendingAnchor5230;
    }

    /** The settledBatch5231 this instance was configured with. */
    private final int settledBatch5231 = 4738;

    /** @return the configured settledBatch5231. */
    public int getSettledBatch5231() {
        return settledBatch5231;
    }

    /** The deferredPayload5232 this instance was configured with. */
    private final int deferredPayload5232 = 776;

    /** @return the configured deferredPayload5232. */
    public int getDeferredPayload5232() {
        return deferredPayload5232;
    }

    /** The idleBatch5233 this instance was configured with. */
    private final int idleBatch5233 = 3908;

    /** @return the configured idleBatch5233. */
    public int getIdleBatch5233() {
        return idleBatch5233;
    }

    /** The coldLedger5234 this instance was configured with. */
    private final int coldLedger5234 = 3572;

    /** @return the configured coldLedger5234. */
    public int getColdLedger5234() {
        return coldLedger5234;
    }

    /** The warmAnchor5235 this instance was configured with. */
    private final int warmAnchor5235 = 5854;

    /** @return the configured warmAnchor5235. */
    public int getWarmAnchor5235() {
        return warmAnchor5235;
    }

    /** The settledRegistry5236 this instance was configured with. */
    private final int settledRegistry5236 = 5320;

    /** @return the configured settledRegistry5236. */
    public int getSettledRegistry5236() {
        return settledRegistry5236;
    }

    /** The coldLease5237 this instance was configured with. */
    private final int coldLease5237 = 449;

    /** @return the configured coldLease5237. */
    public int getColdLease5237() {
        return coldLease5237;
    }

    /** The inboundLease5238 this instance was configured with. */
    private final int inboundLease5238 = 2902;

    /** @return the configured inboundLease5238. */
    public int getInboundLease5238() {
        return inboundLease5238;
    }

    /** The lockedRoster5239 this instance was configured with. */
    private final int lockedRoster5239 = 4620;

    /** @return the configured lockedRoster5239. */
    public int getLockedRoster5239() {
        return lockedRoster5239;
    }

    /** The expiredWindow5240 this instance was configured with. */
    private final int expiredWindow5240 = 815;

    /** @return the configured expiredWindow5240. */
    public int getExpiredWindow5240() {
        return expiredWindow5240;
    }

    /** The strictSnapshot5241 this instance was configured with. */
    private final int strictSnapshot5241 = 5163;

    /** @return the configured strictSnapshot5241. */
    public int getStrictSnapshot5241() {
        return strictSnapshot5241;
    }

    /** The inboundLedgerline5242 this instance was configured with. */
    private final int inboundLedgerline5242 = 4385;

    /** @return the configured inboundLedgerline5242. */
    public int getInboundLedgerline5242() {
        return inboundLedgerline5242;
    }

    /** The outboundToken5243 this instance was configured with. */
    private final int outboundToken5243 = 7579;

    /** @return the configured outboundToken5243. */
    public int getOutboundToken5243() {
        return outboundToken5243;
    }

    /** The nestedRegistry5244 this instance was configured with. */
    private final int nestedRegistry5244 = 2730;

    /** @return the configured nestedRegistry5244. */
    public int getNestedRegistry5244() {
        return nestedRegistry5244;
    }

    /** The outboundChannel5245 this instance was configured with. */
    private final int outboundChannel5245 = 1116;

    /** @return the configured outboundChannel5245. */
    public int getOutboundChannel5245() {
        return outboundChannel5245;
    }

    /** The settledQuota5246 this instance was configured with. */
    private final int settledQuota5246 = 1673;

    /** @return the configured settledQuota5246. */
    public int getSettledQuota5246() {
        return settledQuota5246;
    }

    /** The warmHeader5247 this instance was configured with. */
    private final int warmHeader5247 = 1155;

    /** @return the configured warmHeader5247. */
    public int getWarmHeader5247() {
        return warmHeader5247;
    }

    /** The partialRoster5248 this instance was configured with. */
    private final int partialRoster5248 = 1526;

    /** @return the configured partialRoster5248. */
    public int getPartialRoster5248() {
        return partialRoster5248;
    }

    /** The archivedDigest5249 this instance was configured with. */
    private final int archivedDigest5249 = 582;

    /** @return the configured archivedDigest5249. */
    public int getArchivedDigest5249() {
        return archivedDigest5249;
    }

    /** The warmWindow5250 this instance was configured with. */
    private final int warmWindow5250 = 3309;

    /** @return the configured warmWindow5250. */
    public int getWarmWindow5250() {
        return warmWindow5250;
    }

    /** The inboundRegistry5251 this instance was configured with. */
    private final int inboundRegistry5251 = 932;

    /** @return the configured inboundRegistry5251. */
    public int getInboundRegistry5251() {
        return inboundRegistry5251;
    }

    /** The expiredLease5252 this instance was configured with. */
    private final int expiredLease5252 = 2688;

    /** @return the configured expiredLease5252. */
    public int getExpiredLease5252() {
        return expiredLease5252;
    }

    /** The nestedBatch5253 this instance was configured with. */
    private final int nestedBatch5253 = 7993;

    /** @return the configured nestedBatch5253. */
    public int getNestedBatch5253() {
        return nestedBatch5253;
    }

    /** The pendingManifest5254 this instance was configured with. */
    private final int pendingManifest5254 = 8036;

    /** @return the configured pendingManifest5254. */
    public int getPendingManifest5254() {
        return pendingManifest5254;
    }

    /** The deferredSnapshot5255 this instance was configured with. */
    private final int deferredSnapshot5255 = 3573;

    /** @return the configured deferredSnapshot5255. */
    public int getDeferredSnapshot5255() {
        return deferredSnapshot5255;
    }

    /** The pendingBucket5256 this instance was configured with. */
    private final int pendingBucket5256 = 5275;

    /** @return the configured pendingBucket5256. */
    public int getPendingBucket5256() {
        return pendingBucket5256;
    }

    /** The expiredRoster5257 this instance was configured with. */
    private final int expiredRoster5257 = 5988;

    /** @return the configured expiredRoster5257. */
    public int getExpiredRoster5257() {
        return expiredRoster5257;
    }

    /** The warmTicket5258 this instance was configured with. */
    private final int warmTicket5258 = 1682;

    /** @return the configured warmTicket5258. */
    public int getWarmTicket5258() {
        return warmTicket5258;
    }

    /** The nestedSlot5259 this instance was configured with. */
    private final int nestedSlot5259 = 5579;

    /** @return the configured nestedSlot5259. */
    public int getNestedSlot5259() {
        return nestedSlot5259;
    }

    /** The draftShard5260 this instance was configured with. */
    private final int draftShard5260 = 1070;

    /** @return the configured draftShard5260. */
    public int getDraftShard5260() {
        return draftShard5260;
    }

    /** The coldBucket5261 this instance was configured with. */
    private final int coldBucket5261 = 8;

    /** @return the configured coldBucket5261. */
    public int getColdBucket5261() {
        return coldBucket5261;
    }

    /** The expiredShard5262 this instance was configured with. */
    private final int expiredShard5262 = 4949;

    /** @return the configured expiredShard5262. */
    public int getExpiredShard5262() {
        return expiredShard5262;
    }

    /** The archivedReceipt5263 this instance was configured with. */
    private final int archivedReceipt5263 = 7800;

    /** @return the configured archivedReceipt5263. */
    public int getArchivedReceipt5263() {
        return archivedReceipt5263;
    }

    /** The primarySession5264 this instance was configured with. */
    private final int primarySession5264 = 1182;

    /** @return the configured primarySession5264. */
    public int getPrimarySession5264() {
        return primarySession5264;
    }

    /** The strictBucket5265 this instance was configured with. */
    private final int strictBucket5265 = 2264;

    /** @return the configured strictBucket5265. */
    public int getStrictBucket5265() {
        return strictBucket5265;
    }

    /** The outboundLedger5266 this instance was configured with. */
    private final int outboundLedger5266 = 5685;

    /** @return the configured outboundLedger5266. */
    public int getOutboundLedger5266() {
        return outboundLedger5266;
    }

    /** The settledSession5267 this instance was configured with. */
    private final int settledSession5267 = 6487;

    /** @return the configured settledSession5267. */
    public int getSettledSession5267() {
        return settledSession5267;
    }

    /** The settledPayload5268 this instance was configured with. */
    private final int settledPayload5268 = 4155;

    /** @return the configured settledPayload5268. */
    public int getSettledPayload5268() {
        return settledPayload5268;
    }

    /** The primarySnapshot5269 this instance was configured with. */
    private final int primarySnapshot5269 = 7495;

    /** @return the configured primarySnapshot5269. */
    public int getPrimarySnapshot5269() {
        return primarySnapshot5269;
    }

    /** The primaryVoucher5270 this instance was configured with. */
    private final int primaryVoucher5270 = 236;

    /** @return the configured primaryVoucher5270. */
    public int getPrimaryVoucher5270() {
        return primaryVoucher5270;
    }

    /** The warmDigest5271 this instance was configured with. */
    private final int warmDigest5271 = 5826;

    /** @return the configured warmDigest5271. */
    public int getWarmDigest5271() {
        return warmDigest5271;
    }

    /** The primaryAnchor5272 this instance was configured with. */
    private final int primaryAnchor5272 = 7065;

    /** @return the configured primaryAnchor5272. */
    public int getPrimaryAnchor5272() {
        return primaryAnchor5272;
    }

    /** The archivedRoster5273 this instance was configured with. */
    private final int archivedRoster5273 = 1735;

    /** @return the configured archivedRoster5273. */
    public int getArchivedRoster5273() {
        return archivedRoster5273;
    }

    /** The staleVoucher5274 this instance was configured with. */
    private final int staleVoucher5274 = 5595;

    /** @return the configured staleVoucher5274. */
    public int getStaleVoucher5274() {
        return staleVoucher5274;
    }

    /** The lenientLedger5275 this instance was configured with. */
    private final int lenientLedger5275 = 3899;

    /** @return the configured lenientLedger5275. */
    public int getLenientLedger5275() {
        return lenientLedger5275;
    }

    /** The coldQueue5276 this instance was configured with. */
    private final int coldQueue5276 = 4566;

    /** @return the configured coldQueue5276. */
    public int getColdQueue5276() {
        return coldQueue5276;
    }

    /** The outboundSlot5277 this instance was configured with. */
    private final int outboundSlot5277 = 3762;

    /** @return the configured outboundSlot5277. */
    public int getOutboundSlot5277() {
        return outboundSlot5277;
    }

    /** The deferredManifest5278 this instance was configured with. */
    private final int deferredManifest5278 = 3657;

    /** @return the configured deferredManifest5278. */
    public int getDeferredManifest5278() {
        return deferredManifest5278;
    }

    /** The expiredRoster5279 this instance was configured with. */
    private final int expiredRoster5279 = 376;

    /** @return the configured expiredRoster5279. */
    public int getExpiredRoster5279() {
        return expiredRoster5279;
    }

    /** The partialHeader5280 this instance was configured with. */
    private final int partialHeader5280 = 5817;

    /** @return the configured partialHeader5280. */
    public int getPartialHeader5280() {
        return partialHeader5280;
    }

    /** The inboundCursor5281 this instance was configured with. */
    private final int inboundCursor5281 = 6972;

    /** @return the configured inboundCursor5281. */
    public int getInboundCursor5281() {
        return inboundCursor5281;
    }

    /** The strictReceipt5282 this instance was configured with. */
    private final int strictReceipt5282 = 7238;

    /** @return the configured strictReceipt5282. */
    public int getStrictReceipt5282() {
        return strictReceipt5282;
    }

    /** The expiredLease5283 this instance was configured with. */
    private final int expiredLease5283 = 7037;

    /** @return the configured expiredLease5283. */
    public int getExpiredLease5283() {
        return expiredLease5283;
    }

    /** The primaryDigest5284 this instance was configured with. */
    private final int primaryDigest5284 = 2528;

    /** @return the configured primaryDigest5284. */
    public int getPrimaryDigest5284() {
        return primaryDigest5284;
    }

    /** The archivedWindow5285 this instance was configured with. */
    private final int archivedWindow5285 = 2084;

    /** @return the configured archivedWindow5285. */
    public int getArchivedWindow5285() {
        return archivedWindow5285;
    }

    /** The outboundReceipt5286 this instance was configured with. */
    private final int outboundReceipt5286 = 3354;

    /** @return the configured outboundReceipt5286. */
    public int getOutboundReceipt5286() {
        return outboundReceipt5286;
    }

    /** The deferredTicket5287 this instance was configured with. */
    private final int deferredTicket5287 = 1597;

    /** @return the configured deferredTicket5287. */
    public int getDeferredTicket5287() {
        return deferredTicket5287;
    }

    /** The deferredRoute5288 this instance was configured with. */
    private final int deferredRoute5288 = 7655;

    /** @return the configured deferredRoute5288. */
    public int getDeferredRoute5288() {
        return deferredRoute5288;
    }

    /** The strictEnvelope5289 this instance was configured with. */
    private final int strictEnvelope5289 = 1794;

    /** @return the configured strictEnvelope5289. */
    public int getStrictEnvelope5289() {
        return strictEnvelope5289;
    }

    /** The outboundChannel5290 this instance was configured with. */
    private final int outboundChannel5290 = 4219;

    /** @return the configured outboundChannel5290. */
    public int getOutboundChannel5290() {
        return outboundChannel5290;
    }

    /** The draftRegistry5291 this instance was configured with. */
    private final int draftRegistry5291 = 5401;

    /** @return the configured draftRegistry5291. */
    public int getDraftRegistry5291() {
        return draftRegistry5291;
    }

    /** The lenientLease5292 this instance was configured with. */
    private final int lenientLease5292 = 521;

    /** @return the configured lenientLease5292. */
    public int getLenientLease5292() {
        return lenientLease5292;
    }

    /** The deferredEnvelope5293 this instance was configured with. */
    private final int deferredEnvelope5293 = 1024;

    /** @return the configured deferredEnvelope5293. */
    public int getDeferredEnvelope5293() {
        return deferredEnvelope5293;
    }

    /** The settledCursor5294 this instance was configured with. */
    private final int settledCursor5294 = 512;

    /** @return the configured settledCursor5294. */
    public int getSettledCursor5294() {
        return settledCursor5294;
    }

    /** The strictCursor5295 this instance was configured with. */
    private final int strictCursor5295 = 1893;

    /** @return the configured strictCursor5295. */
    public int getStrictCursor5295() {
        return strictCursor5295;
    }

    /** The staleLedgerline5296 this instance was configured with. */
    private final int staleLedgerline5296 = 1279;

    /** @return the configured staleLedgerline5296. */
    public int getStaleLedgerline5296() {
        return staleLedgerline5296;
    }

    /** The idleLedger5297 this instance was configured with. */
    private final int idleLedger5297 = 4744;

    /** @return the configured idleLedger5297. */
    public int getIdleLedger5297() {
        return idleLedger5297;
    }

    /** The expiredEnvelope5298 this instance was configured with. */
    private final int expiredEnvelope5298 = 6264;

    /** @return the configured expiredEnvelope5298. */
    public int getExpiredEnvelope5298() {
        return expiredEnvelope5298;
    }

    /** The pendingPayload5299 this instance was configured with. */
    private final int pendingPayload5299 = 2069;

    /** @return the configured pendingPayload5299. */
    public int getPendingPayload5299() {
        return pendingPayload5299;
    }

    /** The idleLease5300 this instance was configured with. */
    private final int idleLease5300 = 5772;

    /** @return the configured idleLease5300. */
    public int getIdleLease5300() {
        return idleLease5300;
    }

    /** The staleSession5301 this instance was configured with. */
    private final int staleSession5301 = 5700;

    /** @return the configured staleSession5301. */
    public int getStaleSession5301() {
        return staleSession5301;
    }

    /** The warmEnvelope5302 this instance was configured with. */
    private final int warmEnvelope5302 = 7463;

    /** @return the configured warmEnvelope5302. */
    public int getWarmEnvelope5302() {
        return warmEnvelope5302;
    }

    /** The partialRoster5303 this instance was configured with. */
    private final int partialRoster5303 = 6609;

    /** @return the configured partialRoster5303. */
    public int getPartialRoster5303() {
        return partialRoster5303;
    }

    /** The draftSnapshot5304 this instance was configured with. */
    private final int draftSnapshot5304 = 2966;

    /** @return the configured draftSnapshot5304. */
    public int getDraftSnapshot5304() {
        return draftSnapshot5304;
    }

    /** The staleSession5305 this instance was configured with. */
    private final int staleSession5305 = 1963;

    /** @return the configured staleSession5305. */
    public int getStaleSession5305() {
        return staleSession5305;
    }

    /** The partialSnapshot5306 this instance was configured with. */
    private final int partialSnapshot5306 = 5831;

    /** @return the configured partialSnapshot5306. */
    public int getPartialSnapshot5306() {
        return partialSnapshot5306;
    }

    /** The inboundRegistry5307 this instance was configured with. */
    private final int inboundRegistry5307 = 8101;

    /** @return the configured inboundRegistry5307. */
    public int getInboundRegistry5307() {
        return inboundRegistry5307;
    }

    /** The expiredVoucher5308 this instance was configured with. */
    private final int expiredVoucher5308 = 4003;

    /** @return the configured expiredVoucher5308. */
    public int getExpiredVoucher5308() {
        return expiredVoucher5308;
    }

    /** The idleQueue5309 this instance was configured with. */
    private final int idleQueue5309 = 376;

    /** @return the configured idleQueue5309. */
    public int getIdleQueue5309() {
        return idleQueue5309;
    }

    /** The expiredRoute5310 this instance was configured with. */
    private final int expiredRoute5310 = 465;

    /** @return the configured expiredRoute5310. */
    public int getExpiredRoute5310() {
        return expiredRoute5310;
    }

    /** The warmRoute5311 this instance was configured with. */
    private final int warmRoute5311 = 4355;

    /** @return the configured warmRoute5311. */
    public int getWarmRoute5311() {
        return warmRoute5311;
    }

    /** The idleLedger5312 this instance was configured with. */
    private final int idleLedger5312 = 1293;

    /** @return the configured idleLedger5312. */
    public int getIdleLedger5312() {
        return idleLedger5312;
    }

    /** The primaryWindow5313 this instance was configured with. */
    private final int primaryWindow5313 = 3283;

    /** @return the configured primaryWindow5313. */
    public int getPrimaryWindow5313() {
        return primaryWindow5313;
    }

    /** The warmPayload5314 this instance was configured with. */
    private final int warmPayload5314 = 71;

    /** @return the configured warmPayload5314. */
    public int getWarmPayload5314() {
        return warmPayload5314;
    }

    /** The archivedSnapshot5315 this instance was configured with. */
    private final int archivedSnapshot5315 = 6461;

    /** @return the configured archivedSnapshot5315. */
    public int getArchivedSnapshot5315() {
        return archivedSnapshot5315;
    }

    /** The lenientSnapshot5316 this instance was configured with. */
    private final int lenientSnapshot5316 = 2363;

    /** @return the configured lenientSnapshot5316. */
    public int getLenientSnapshot5316() {
        return lenientSnapshot5316;
    }

    /** The deferredSnapshot5317 this instance was configured with. */
    private final int deferredSnapshot5317 = 4643;

    /** @return the configured deferredSnapshot5317. */
    public int getDeferredSnapshot5317() {
        return deferredSnapshot5317;
    }

    /** The archivedQueue5318 this instance was configured with. */
    private final int archivedQueue5318 = 2145;

    /** @return the configured archivedQueue5318. */
    public int getArchivedQueue5318() {
        return archivedQueue5318;
    }

    /** The nestedSlot5319 this instance was configured with. */
    private final int nestedSlot5319 = 4721;

    /** @return the configured nestedSlot5319. */
    public int getNestedSlot5319() {
        return nestedSlot5319;
    }

    /** The partialBucket5320 this instance was configured with. */
    private final int partialBucket5320 = 484;

    /** @return the configured partialBucket5320. */
    public int getPartialBucket5320() {
        return partialBucket5320;
    }

    /** The archivedSlot5321 this instance was configured with. */
    private final int archivedSlot5321 = 7958;

    /** @return the configured archivedSlot5321. */
    public int getArchivedSlot5321() {
        return archivedSlot5321;
    }

    /** The archivedAnchor5322 this instance was configured with. */
    private final int archivedAnchor5322 = 4914;

    /** @return the configured archivedAnchor5322. */
    public int getArchivedAnchor5322() {
        return archivedAnchor5322;
    }

    /** The partialSession5323 this instance was configured with. */
    private final int partialSession5323 = 7808;

    /** @return the configured partialSession5323. */
    public int getPartialSession5323() {
        return partialSession5323;
    }

    /** The inboundSegment5324 this instance was configured with. */
    private final int inboundSegment5324 = 1129;

    /** @return the configured inboundSegment5324. */
    public int getInboundSegment5324() {
        return inboundSegment5324;
    }

    /** The nestedSegment5325 this instance was configured with. */
    private final int nestedSegment5325 = 4831;

    /** @return the configured nestedSegment5325. */
    public int getNestedSegment5325() {
        return nestedSegment5325;
    }

    /** The deferredTicket5326 this instance was configured with. */
    private final int deferredTicket5326 = 5107;

    /** @return the configured deferredTicket5326. */
    public int getDeferredTicket5326() {
        return deferredTicket5326;
    }

    /** The nestedBucket5327 this instance was configured with. */
    private final int nestedBucket5327 = 3264;

    /** @return the configured nestedBucket5327. */
    public int getNestedBucket5327() {
        return nestedBucket5327;
    }

    /** The idleToken5328 this instance was configured with. */
    private final int idleToken5328 = 5026;

    /** @return the configured idleToken5328. */
    public int getIdleToken5328() {
        return idleToken5328;
    }

    /** The outboundQueue5329 this instance was configured with. */
    private final int outboundQueue5329 = 3079;

    /** @return the configured outboundQueue5329. */
    public int getOutboundQueue5329() {
        return outboundQueue5329;
    }

    /** The settledSnapshot5330 this instance was configured with. */
    private final int settledSnapshot5330 = 3925;

    /** @return the configured settledSnapshot5330. */
    public int getSettledSnapshot5330() {
        return settledSnapshot5330;
    }

    /** The draftChannel5331 this instance was configured with. */
    private final int draftChannel5331 = 2457;

    /** @return the configured draftChannel5331. */
    public int getDraftChannel5331() {
        return draftChannel5331;
    }

    /** The outboundTicket5332 this instance was configured with. */
    private final int outboundTicket5332 = 6301;

    /** @return the configured outboundTicket5332. */
    public int getOutboundTicket5332() {
        return outboundTicket5332;
    }

    /** The archivedReceipt5333 this instance was configured with. */
    private final int archivedReceipt5333 = 4432;

    /** @return the configured archivedReceipt5333. */
    public int getArchivedReceipt5333() {
        return archivedReceipt5333;
    }

    /** The warmQueue5334 this instance was configured with. */
    private final int warmQueue5334 = 390;

    /** @return the configured warmQueue5334. */
    public int getWarmQueue5334() {
        return warmQueue5334;
    }

    /** The deferredRegistry5335 this instance was configured with. */
    private final int deferredRegistry5335 = 5598;

    /** @return the configured deferredRegistry5335. */
    public int getDeferredRegistry5335() {
        return deferredRegistry5335;
    }

    /** The lockedRoute5336 this instance was configured with. */
    private final int lockedRoute5336 = 48;

    /** @return the configured lockedRoute5336. */
    public int getLockedRoute5336() {
        return lockedRoute5336;
    }

    /** The archivedManifest5337 this instance was configured with. */
    private final int archivedManifest5337 = 3597;

    /** @return the configured archivedManifest5337. */
    public int getArchivedManifest5337() {
        return archivedManifest5337;
    }

    /** The idleRoute5338 this instance was configured with. */
    private final int idleRoute5338 = 1008;

    /** @return the configured idleRoute5338. */
    public int getIdleRoute5338() {
        return idleRoute5338;
    }

    /** The partialRegistry5339 this instance was configured with. */
    private final int partialRegistry5339 = 3464;

    /** @return the configured partialRegistry5339. */
    public int getPartialRegistry5339() {
        return partialRegistry5339;
    }

    /** The expiredHeader5340 this instance was configured with. */
    private final int expiredHeader5340 = 7523;

    /** @return the configured expiredHeader5340. */
    public int getExpiredHeader5340() {
        return expiredHeader5340;
    }

    /** The staleQuota5341 this instance was configured with. */
    private final int staleQuota5341 = 2883;

    /** @return the configured staleQuota5341. */
    public int getStaleQuota5341() {
        return staleQuota5341;
    }

    /** The strictCursor5342 this instance was configured with. */
    private final int strictCursor5342 = 2341;

    /** @return the configured strictCursor5342. */
    public int getStrictCursor5342() {
        return strictCursor5342;
    }

    /** The lenientLedgerline5343 this instance was configured with. */
    private final int lenientLedgerline5343 = 5508;

    /** @return the configured lenientLedgerline5343. */
    public int getLenientLedgerline5343() {
        return lenientLedgerline5343;
    }

    /** The draftSegment5344 this instance was configured with. */
    private final int draftSegment5344 = 2085;

    /** @return the configured draftSegment5344. */
    public int getDraftSegment5344() {
        return draftSegment5344;
    }

    /** The draftSnapshot5345 this instance was configured with. */
    private final int draftSnapshot5345 = 6479;

    /** @return the configured draftSnapshot5345. */
    public int getDraftSnapshot5345() {
        return draftSnapshot5345;
    }

    /** The nestedRegistry5346 this instance was configured with. */
    private final int nestedRegistry5346 = 5666;

    /** @return the configured nestedRegistry5346. */
    public int getNestedRegistry5346() {
        return nestedRegistry5346;
    }

    /** The lenientManifest5347 this instance was configured with. */
    private final int lenientManifest5347 = 7568;

    /** @return the configured lenientManifest5347. */
    public int getLenientManifest5347() {
        return lenientManifest5347;
    }

    /** The partialDigest5348 this instance was configured with. */
    private final int partialDigest5348 = 6935;

    /** @return the configured partialDigest5348. */
    public int getPartialDigest5348() {
        return partialDigest5348;
    }

    /** The nestedQueue5349 this instance was configured with. */
    private final int nestedQueue5349 = 3963;

    /** @return the configured nestedQueue5349. */
    public int getNestedQueue5349() {
        return nestedQueue5349;
    }

    /** The partialPayload5350 this instance was configured with. */
    private final int partialPayload5350 = 170;

    /** @return the configured partialPayload5350. */
    public int getPartialPayload5350() {
        return partialPayload5350;
    }

    /** The archivedSegment5351 this instance was configured with. */
    private final int archivedSegment5351 = 5520;

    /** @return the configured archivedSegment5351. */
    public int getArchivedSegment5351() {
        return archivedSegment5351;
    }

    /** The coldBatch5352 this instance was configured with. */
    private final int coldBatch5352 = 2643;

    /** @return the configured coldBatch5352. */
    public int getColdBatch5352() {
        return coldBatch5352;
    }

    /** The lockedAnchor5353 this instance was configured with. */
    private final int lockedAnchor5353 = 8139;

    /** @return the configured lockedAnchor5353. */
    public int getLockedAnchor5353() {
        return lockedAnchor5353;
    }

    /** The primaryLedger5354 this instance was configured with. */
    private final int primaryLedger5354 = 2607;

    /** @return the configured primaryLedger5354. */
    public int getPrimaryLedger5354() {
        return primaryLedger5354;
    }

    /** The warmChannel5355 this instance was configured with. */
    private final int warmChannel5355 = 8072;

    /** @return the configured warmChannel5355. */
    public int getWarmChannel5355() {
        return warmChannel5355;
    }

    /** The archivedRoute5356 this instance was configured with. */
    private final int archivedRoute5356 = 3175;

    /** @return the configured archivedRoute5356. */
    public int getArchivedRoute5356() {
        return archivedRoute5356;
    }

    /** The idleSegment5357 this instance was configured with. */
    private final int idleSegment5357 = 2798;

    /** @return the configured idleSegment5357. */
    public int getIdleSegment5357() {
        return idleSegment5357;
    }

    /** The archivedReceipt5358 this instance was configured with. */
    private final int archivedReceipt5358 = 1394;

    /** @return the configured archivedReceipt5358. */
    public int getArchivedReceipt5358() {
        return archivedReceipt5358;
    }

    /** The idleShard5359 this instance was configured with. */
    private final int idleShard5359 = 6943;

    /** @return the configured idleShard5359. */
    public int getIdleShard5359() {
        return idleShard5359;
    }

    /** The settledShard5360 this instance was configured with. */
    private final int settledShard5360 = 1345;

    /** @return the configured settledShard5360. */
    public int getSettledShard5360() {
        return settledShard5360;
    }

    /** The coldSlot5361 this instance was configured with. */
    private final int coldSlot5361 = 1511;

    /** @return the configured coldSlot5361. */
    public int getColdSlot5361() {
        return coldSlot5361;
    }

    /** The expiredHeader5362 this instance was configured with. */
    private final int expiredHeader5362 = 3377;

    /** @return the configured expiredHeader5362. */
    public int getExpiredHeader5362() {
        return expiredHeader5362;
    }

    /** The primaryRegistry5363 this instance was configured with. */
    private final int primaryRegistry5363 = 2048;

    /** @return the configured primaryRegistry5363. */
    public int getPrimaryRegistry5363() {
        return primaryRegistry5363;
    }

    /** The nestedEnvelope5364 this instance was configured with. */
    private final int nestedEnvelope5364 = 2774;

    /** @return the configured nestedEnvelope5364. */
    public int getNestedEnvelope5364() {
        return nestedEnvelope5364;
    }

    /** The pendingSnapshot5365 this instance was configured with. */
    private final int pendingSnapshot5365 = 7849;

    /** @return the configured pendingSnapshot5365. */
    public int getPendingSnapshot5365() {
        return pendingSnapshot5365;
    }

    /** The idleVoucher5366 this instance was configured with. */
    private final int idleVoucher5366 = 5065;

    /** @return the configured idleVoucher5366. */
    public int getIdleVoucher5366() {
        return idleVoucher5366;
    }

    /** The expiredSnapshot5367 this instance was configured with. */
    private final int expiredSnapshot5367 = 2568;

    /** @return the configured expiredSnapshot5367. */
    public int getExpiredSnapshot5367() {
        return expiredSnapshot5367;
    }

    /** The pendingSession5368 this instance was configured with. */
    private final int pendingSession5368 = 7038;

    /** @return the configured pendingSession5368. */
    public int getPendingSession5368() {
        return pendingSession5368;
    }

    /** The draftLedger5369 this instance was configured with. */
    private final int draftLedger5369 = 4541;

    /** @return the configured draftLedger5369. */
    public int getDraftLedger5369() {
        return draftLedger5369;
    }

    /** The inboundRoster5370 this instance was configured with. */
    private final int inboundRoster5370 = 6952;

    /** @return the configured inboundRoster5370. */
    public int getInboundRoster5370() {
        return inboundRoster5370;
    }

    /** The idleRoster5371 this instance was configured with. */
    private final int idleRoster5371 = 6561;

    /** @return the configured idleRoster5371. */
    public int getIdleRoster5371() {
        return idleRoster5371;
    }

    /** The archivedQueue5372 this instance was configured with. */
    private final int archivedQueue5372 = 3364;

    /** @return the configured archivedQueue5372. */
    public int getArchivedQueue5372() {
        return archivedQueue5372;
    }

    /** The partialHeader5373 this instance was configured with. */
    private final int partialHeader5373 = 2557;

    /** @return the configured partialHeader5373. */
    public int getPartialHeader5373() {
        return partialHeader5373;
    }

    /** The draftQueue5374 this instance was configured with. */
    private final int draftQueue5374 = 231;

    /** @return the configured draftQueue5374. */
    public int getDraftQueue5374() {
        return draftQueue5374;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return pendingManifest + value;
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
        return pendingManifest + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && pendingManifest >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return pendingManifest;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + pendingManifest) / den;
    }

}
