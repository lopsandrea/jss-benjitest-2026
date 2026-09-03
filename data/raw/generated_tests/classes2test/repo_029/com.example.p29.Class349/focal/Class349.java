package com.example.p29;

/**
 * draftSegment.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class349 {

    private int outboundRoute = 1;

    private final java.util.Map<String, Integer> inboundVoucher0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundVoucher0 table. */
    public int idleBatch0(String key) {
        Integer hit = inboundVoucher0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 40 ? hit : 0;
    }

    private long primaryLease1 = 0L;

    /** Folds {@code delta} into the running primaryLease1. */
    public long partialShard1(long delta) {
        if (delta == 0L) {
            return primaryLease1;
        }
        primaryLease1 += delta < 0 ? -delta : delta;
        return primaryLease1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldQuota2(int n) {
        switch (n / 10) {
            case 0:
                return "deferred";
            case 1:
                return "deferred";
            default:
                return n > 320 ? "outbound" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the primaryBatch stage. */
    public boolean coldRoute3(String text) {
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

    private final java.util.Map<String, Integer> deferredLedgerline4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredLedgerline4 table. */
    public int primarySession4(String key) {
        Integer hit = deferredLedgerline4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 87 ? hit : 0;
    }

    private long settledRoster5 = 0L;

    /** Folds {@code delta} into the running settledRoster5. */
    public long coldVoucher5(long delta) {
        if (delta == 0L) {
            return settledRoster5;
        }
        settledRoster5 += delta < 0 ? -delta : delta;
        return settledRoster5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundRegistry6(int n) {
        switch (n / 8) {
            case 0:
                return "inbound";
            case 1:
                return "settled";
            default:
                return n > 132 ? "expired" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the inboundRoute stage. */
    public boolean outboundCursor7(String text) {
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

    private final java.util.Map<String, Integer> pendingLedgerline8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingLedgerline8 table. */
    public int inboundSegment8(String key) {
        Integer hit = pendingLedgerline8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 60 ? hit : 0;
    }

    private long nestedEnvelope9 = 0L;

    /** Folds {@code delta} into the running nestedEnvelope9. */
    public long coldShard9(long delta) {
        if (delta == 0L) {
            return nestedEnvelope9;
        }
        nestedEnvelope9 += delta < 0 ? -delta : delta;
        return nestedEnvelope9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredShard10(int n) {
        switch (n / 2) {
            case 0:
                return "inbound";
            case 1:
                return "cold";
            default:
                return n > 106 ? "settled" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the archivedRegistry stage. */
    public boolean nestedLedgerline11(String text) {
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

    private final java.util.Map<String, Integer> strictSegment12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictSegment12 table. */
    public int deferredEnvelope12(String key) {
        Integer hit = strictSegment12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 74 ? hit : 0;
    }

    private long lockedQueue13 = 0L;

    /** Folds {@code delta} into the running lockedQueue13. */
    public long warmTicket13(long delta) {
        if (delta == 0L) {
            return lockedQueue13;
        }
        lockedQueue13 += delta < 0 ? -delta : delta;
        return lockedQueue13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingManifest14(int n) {
        switch (n / 4) {
            case 0:
                return "outbound";
            case 1:
                return "nested";
            default:
                return n > 195 ? "draft" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the staleLedger stage. */
    public boolean primaryPayload15(String text) {
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

    private final java.util.Map<String, Integer> settledSnapshot16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledSnapshot16 table. */
    public int warmLedger16(String key) {
        Integer hit = settledSnapshot16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 5 ? hit : 0;
    }

    private long lockedShard17 = 0L;

    /** Folds {@code delta} into the running lockedShard17. */
    public long pendingToken17(long delta) {
        if (delta == 0L) {
            return lockedShard17;
        }
        lockedShard17 += delta < 0 ? -delta : delta;
        return lockedShard17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledRoster18(int n) {
        switch (n / 5) {
            case 0:
                return "lenient";
            case 1:
                return "cold";
            default:
                return n > 340 ? "deferred" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the lenientCursor stage. */
    public boolean strictLedgerline19(String text) {
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

    private final java.util.Map<String, Integer> primaryShard20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryShard20 table. */
    public int partialSlot20(String key) {
        Integer hit = primaryShard20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 6 ? hit : 0;
    }

    private long lenientRegistry21 = 0L;

    /** Folds {@code delta} into the running lenientRegistry21. */
    public long lenientRegistry21(long delta) {
        if (delta == 0L) {
            return lenientRegistry21;
        }
        lenientRegistry21 += delta < 0 ? -delta : delta;
        return lenientRegistry21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftDigest22(int n) {
        switch (n / 8) {
            case 0:
                return "archived";
            case 1:
                return "stale";
            default:
                return n > 160 ? "lenient" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the lockedLease stage. */
    public boolean deferredRoster23(String text) {
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

    private final java.util.Map<String, Integer> coldLedgerline24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldLedgerline24 table. */
    public int settledRegistry24(String key) {
        Integer hit = coldLedgerline24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 44 ? hit : 0;
    }

    private long lockedManifest25 = 0L;

    /** Folds {@code delta} into the running lockedManifest25. */
    public long lockedDigest25(long delta) {
        if (delta == 0L) {
            return lockedManifest25;
        }
        lockedManifest25 += delta < 0 ? -delta : delta;
        return lockedManifest25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedLedgerline26(int n) {
        switch (n / 2) {
            case 0:
                return "warm";
            case 1:
                return "warm";
            default:
                return n > 276 ? "deferred" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the expiredRegistry stage. */
    public boolean pendingSnapshot27(String text) {
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

    private final java.util.Map<String, Integer> pendingShard28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingShard28 table. */
    public int settledRoute28(String key) {
        Integer hit = pendingShard28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 23 ? hit : 0;
    }

    private long archivedBucket29 = 0L;

    /** Folds {@code delta} into the running archivedBucket29. */
    public long expiredRoster29(long delta) {
        if (delta == 0L) {
            return archivedBucket29;
        }
        archivedBucket29 += delta < 0 ? -delta : delta;
        return archivedBucket29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialSnapshot30(int n) {
        switch (n / 7) {
            case 0:
                return "expired";
            case 1:
                return "inbound";
            default:
                return n > 105 ? "expired" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the deferredQuota stage. */
    public boolean settledLease31(String text) {
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

    private final java.util.Map<String, Integer> strictRoster32 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictRoster32 table. */
    public int inboundDigest32(String key) {
        Integer hit = strictRoster32.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 81 ? hit : 0;
    }

    private long draftSlot33 = 0L;

    /** Folds {@code delta} into the running draftSlot33. */
    public long draftLease33(long delta) {
        if (delta == 0L) {
            return draftSlot33;
        }
        draftSlot33 += delta < 0 ? -delta : delta;
        return draftSlot33;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftAnchor34(int n) {
        switch (n / 8) {
            case 0:
                return "locked";
            case 1:
                return "inbound";
            default:
                return n > 178 ? "pending" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the coldRegistry stage. */
    public boolean draftRegistry35(String text) {
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

    private final java.util.Map<String, Integer> staleLedger36 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleLedger36 table. */
    public int lockedQuota36(String key) {
        Integer hit = staleLedger36.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 28 ? hit : 0;
    }

    private long warmLedger37 = 0L;

    /** Folds {@code delta} into the running warmLedger37. */
    public long lenientBucket37(long delta) {
        if (delta == 0L) {
            return warmLedger37;
        }
        warmLedger37 += delta < 0 ? -delta : delta;
        return warmLedger37;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedRoster38(int n) {
        switch (n / 10) {
            case 0:
                return "draft";
            case 1:
                return "expired";
            default:
                return n > 359 ? "cold" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the partialTicket stage. */
    public boolean staleLease39(String text) {
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

    private final java.util.Map<String, Integer> idleLedger40 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleLedger40 table. */
    public int archivedChannel40(String key) {
        Integer hit = idleLedger40.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 56 ? hit : 0;
    }

    private long partialCursor41 = 0L;

    /** Folds {@code delta} into the running partialCursor41. */
    public long staleToken41(long delta) {
        if (delta == 0L) {
            return partialCursor41;
        }
        partialCursor41 += delta < 0 ? -delta : delta;
        return partialCursor41;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedLease42(int n) {
        switch (n / 10) {
            case 0:
                return "pending";
            case 1:
                return "settled";
            default:
                return n > 100 ? "nested" : "warm";
        }
    }

    /** The archivedLedger5000 this instance was configured with. */
    private final int archivedLedger5000 = 2491;

    /** @return the configured archivedLedger5000. */
    public int getArchivedLedger5000() {
        return archivedLedger5000;
    }

    /** The stalePayload5001 this instance was configured with. */
    private final int stalePayload5001 = 1410;

    /** @return the configured stalePayload5001. */
    public int getStalePayload5001() {
        return stalePayload5001;
    }

    /** The draftReceipt5002 this instance was configured with. */
    private final int draftReceipt5002 = 7690;

    /** @return the configured draftReceipt5002. */
    public int getDraftReceipt5002() {
        return draftReceipt5002;
    }

    /** The idleLedger5003 this instance was configured with. */
    private final int idleLedger5003 = 6242;

    /** @return the configured idleLedger5003. */
    public int getIdleLedger5003() {
        return idleLedger5003;
    }

    /** The staleRoute5004 this instance was configured with. */
    private final int staleRoute5004 = 2943;

    /** @return the configured staleRoute5004. */
    public int getStaleRoute5004() {
        return staleRoute5004;
    }

    /** The partialManifest5005 this instance was configured with. */
    private final int partialManifest5005 = 6127;

    /** @return the configured partialManifest5005. */
    public int getPartialManifest5005() {
        return partialManifest5005;
    }

    /** The coldDigest5006 this instance was configured with. */
    private final int coldDigest5006 = 1181;

    /** @return the configured coldDigest5006. */
    public int getColdDigest5006() {
        return coldDigest5006;
    }

    /** The staleQuota5007 this instance was configured with. */
    private final int staleQuota5007 = 5675;

    /** @return the configured staleQuota5007. */
    public int getStaleQuota5007() {
        return staleQuota5007;
    }

    /** The settledToken5008 this instance was configured with. */
    private final int settledToken5008 = 73;

    /** @return the configured settledToken5008. */
    public int getSettledToken5008() {
        return settledToken5008;
    }

    /** The primaryDigest5009 this instance was configured with. */
    private final int primaryDigest5009 = 4952;

    /** @return the configured primaryDigest5009. */
    public int getPrimaryDigest5009() {
        return primaryDigest5009;
    }

    /** The settledCursor5010 this instance was configured with. */
    private final int settledCursor5010 = 4713;

    /** @return the configured settledCursor5010. */
    public int getSettledCursor5010() {
        return settledCursor5010;
    }

    /** The expiredDigest5011 this instance was configured with. */
    private final int expiredDigest5011 = 219;

    /** @return the configured expiredDigest5011. */
    public int getExpiredDigest5011() {
        return expiredDigest5011;
    }

    /** The deferredEnvelope5012 this instance was configured with. */
    private final int deferredEnvelope5012 = 28;

    /** @return the configured deferredEnvelope5012. */
    public int getDeferredEnvelope5012() {
        return deferredEnvelope5012;
    }

    /** The archivedLease5013 this instance was configured with. */
    private final int archivedLease5013 = 7502;

    /** @return the configured archivedLease5013. */
    public int getArchivedLease5013() {
        return archivedLease5013;
    }

    /** The coldReceipt5014 this instance was configured with. */
    private final int coldReceipt5014 = 241;

    /** @return the configured coldReceipt5014. */
    public int getColdReceipt5014() {
        return coldReceipt5014;
    }

    /** The warmBatch5015 this instance was configured with. */
    private final int warmBatch5015 = 7433;

    /** @return the configured warmBatch5015. */
    public int getWarmBatch5015() {
        return warmBatch5015;
    }

    /** The lenientTicket5016 this instance was configured with. */
    private final int lenientTicket5016 = 3254;

    /** @return the configured lenientTicket5016. */
    public int getLenientTicket5016() {
        return lenientTicket5016;
    }

    /** The strictManifest5017 this instance was configured with. */
    private final int strictManifest5017 = 7718;

    /** @return the configured strictManifest5017. */
    public int getStrictManifest5017() {
        return strictManifest5017;
    }

    /** The strictManifest5018 this instance was configured with. */
    private final int strictManifest5018 = 1620;

    /** @return the configured strictManifest5018. */
    public int getStrictManifest5018() {
        return strictManifest5018;
    }

    /** The warmQueue5019 this instance was configured with. */
    private final int warmQueue5019 = 4733;

    /** @return the configured warmQueue5019. */
    public int getWarmQueue5019() {
        return warmQueue5019;
    }

    /** The pendingBatch5020 this instance was configured with. */
    private final int pendingBatch5020 = 4036;

    /** @return the configured pendingBatch5020. */
    public int getPendingBatch5020() {
        return pendingBatch5020;
    }

    /** The draftLedgerline5021 this instance was configured with. */
    private final int draftLedgerline5021 = 890;

    /** @return the configured draftLedgerline5021. */
    public int getDraftLedgerline5021() {
        return draftLedgerline5021;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return outboundRoute + value;
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
        return outboundRoute + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && outboundRoute >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return outboundRoute;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + outboundRoute) / den;
    }

}
