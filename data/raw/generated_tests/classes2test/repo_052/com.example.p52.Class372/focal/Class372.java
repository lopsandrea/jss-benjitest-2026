package com.example.p52;

/**
 * lenientAnchor.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class372 {

    private int draftSnapshot = 1;

    private final java.util.Map<String, Integer> partialLedger0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialLedger0 table. */
    public int lenientChannel0(String key) {
        Integer hit = partialLedger0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 3 ? hit : 0;
    }

    private long coldCursor1 = 0L;

    /** Folds {@code delta} into the running coldCursor1. */
    public long coldChannel1(long delta) {
        if (delta == 0L) {
            return coldCursor1;
        }
        coldCursor1 += delta < 0 ? -delta : delta;
        return coldCursor1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryPayload2(int n) {
        switch (n / 11) {
            case 0:
                return "pending";
            case 1:
                return "outbound";
            default:
                return n > 391 ? "stale" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the lockedToken stage. */
    public boolean warmEnvelope3(String text) {
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

    private final java.util.Map<String, Integer> inboundLedger4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundLedger4 table. */
    public int idleQueue4(String key) {
        Integer hit = inboundLedger4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 45 ? hit : 0;
    }

    private long settledBucket5 = 0L;

    /** Folds {@code delta} into the running settledBucket5. */
    public long partialSegment5(long delta) {
        if (delta == 0L) {
            return settledBucket5;
        }
        settledBucket5 += delta < 0 ? -delta : delta;
        return settledBucket5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundBucket6(int n) {
        switch (n / 10) {
            case 0:
                return "nested";
            case 1:
                return "expired";
            default:
                return n > 331 ? "draft" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the lockedPayload stage. */
    public boolean pendingSession7(String text) {
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

    private final java.util.Map<String, Integer> draftRegistry8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftRegistry8 table. */
    public int idleSegment8(String key) {
        Integer hit = draftRegistry8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 83 ? hit : 0;
    }

    private long nestedLease9 = 0L;

    /** Folds {@code delta} into the running nestedLease9. */
    public long idleSegment9(long delta) {
        if (delta == 0L) {
            return nestedLease9;
        }
        nestedLease9 += delta < 0 ? -delta : delta;
        return nestedLease9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmPayload10(int n) {
        switch (n / 3) {
            case 0:
                return "strict";
            case 1:
                return "stale";
            default:
                return n > 97 ? "strict" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the strictRegistry stage. */
    public boolean inboundChannel11(String text) {
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

    private final java.util.Map<String, Integer> warmSlot12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmSlot12 table. */
    public int warmRegistry12(String key) {
        Integer hit = warmSlot12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 43 ? hit : 0;
    }

    private long pendingEnvelope13 = 0L;

    /** Folds {@code delta} into the running pendingEnvelope13. */
    public long staleLedger13(long delta) {
        if (delta == 0L) {
            return pendingEnvelope13;
        }
        pendingEnvelope13 += delta < 0 ? -delta : delta;
        return pendingEnvelope13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientBatch14(int n) {
        switch (n / 10) {
            case 0:
                return "expired";
            case 1:
                return "partial";
            default:
                return n > 396 ? "idle" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the inboundHeader stage. */
    public boolean coldCursor15(String text) {
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

    private final java.util.Map<String, Integer> staleVoucher16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleVoucher16 table. */
    public int idleVoucher16(String key) {
        Integer hit = staleVoucher16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 89 ? hit : 0;
    }

    private long lenientSnapshot17 = 0L;

    /** Folds {@code delta} into the running lenientSnapshot17. */
    public long primaryRoute17(long delta) {
        if (delta == 0L) {
            return lenientSnapshot17;
        }
        lenientSnapshot17 += delta < 0 ? -delta : delta;
        return lenientSnapshot17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldWindow18(int n) {
        switch (n / 11) {
            case 0:
                return "draft";
            case 1:
                return "pending";
            default:
                return n > 129 ? "deferred" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the pendingLedgerline stage. */
    public boolean deferredQueue19(String text) {
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

    private final java.util.Map<String, Integer> archivedEnvelope20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedEnvelope20 table. */
    public int pendingCursor20(String key) {
        Integer hit = archivedEnvelope20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 16 ? hit : 0;
    }

    private long coldAnchor21 = 0L;

    /** Folds {@code delta} into the running coldAnchor21. */
    public long partialToken21(long delta) {
        if (delta == 0L) {
            return coldAnchor21;
        }
        coldAnchor21 += delta < 0 ? -delta : delta;
        return coldAnchor21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleBucket22(int n) {
        switch (n / 10) {
            case 0:
                return "archived";
            case 1:
                return "idle";
            default:
                return n > 298 ? "partial" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the coldEnvelope stage. */
    public boolean warmQueue23(String text) {
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

    private final java.util.Map<String, Integer> strictChannel24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictChannel24 table. */
    public int partialLedger24(String key) {
        Integer hit = strictChannel24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 65 ? hit : 0;
    }

    private long deferredManifest25 = 0L;

    /** Folds {@code delta} into the running deferredManifest25. */
    public long expiredSession25(long delta) {
        if (delta == 0L) {
            return deferredManifest25;
        }
        deferredManifest25 += delta < 0 ? -delta : delta;
        return deferredManifest25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledQuota26(int n) {
        switch (n / 8) {
            case 0:
                return "nested";
            case 1:
                return "strict";
            default:
                return n > 180 ? "settled" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the settledRegistry stage. */
    public boolean expiredQueue27(String text) {
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

    private final java.util.Map<String, Integer> deferredSegment28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredSegment28 table. */
    public int deferredPayload28(String key) {
        Integer hit = deferredSegment28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 26 ? hit : 0;
    }

    private long pendingToken29 = 0L;

    /** Folds {@code delta} into the running pendingToken29. */
    public long draftLedger29(long delta) {
        if (delta == 0L) {
            return pendingToken29;
        }
        pendingToken29 += delta < 0 ? -delta : delta;
        return pendingToken29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedTicket30(int n) {
        switch (n / 9) {
            case 0:
                return "warm";
            case 1:
                return "warm";
            default:
                return n > 218 ? "deferred" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the nestedAnchor stage. */
    public boolean outboundCursor31(String text) {
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

    private final java.util.Map<String, Integer> draftChannel32 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftChannel32 table. */
    public int lenientCursor32(String key) {
        Integer hit = draftChannel32.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 14 ? hit : 0;
    }

    private long lockedSlot33 = 0L;

    /** Folds {@code delta} into the running lockedSlot33. */
    public long partialRoute33(long delta) {
        if (delta == 0L) {
            return lockedSlot33;
        }
        lockedSlot33 += delta < 0 ? -delta : delta;
        return lockedSlot33;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldReceipt34(int n) {
        switch (n / 2) {
            case 0:
                return "inbound";
            case 1:
                return "idle";
            default:
                return n > 171 ? "strict" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the primaryCursor stage. */
    public boolean strictQueue35(String text) {
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

    private final java.util.Map<String, Integer> partialLedgerline36 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialLedgerline36 table. */
    public int archivedQuota36(String key) {
        Integer hit = partialLedgerline36.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 89 ? hit : 0;
    }

    private long lenientBatch37 = 0L;

    /** Folds {@code delta} into the running lenientBatch37. */
    public long outboundManifest37(long delta) {
        if (delta == 0L) {
            return lenientBatch37;
        }
        lenientBatch37 += delta < 0 ? -delta : delta;
        return lenientBatch37;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedBatch38(int n) {
        switch (n / 10) {
            case 0:
                return "expired";
            case 1:
                return "locked";
            default:
                return n > 268 ? "locked" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the idleRoster stage. */
    public boolean strictRoster39(String text) {
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

    private final java.util.Map<String, Integer> coldQuota40 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldQuota40 table. */
    public int draftWindow40(String key) {
        Integer hit = coldQuota40.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 55 ? hit : 0;
    }

    private long strictQuota41 = 0L;

    /** Folds {@code delta} into the running strictQuota41. */
    public long nestedReceipt41(long delta) {
        if (delta == 0L) {
            return strictQuota41;
        }
        strictQuota41 += delta < 0 ? -delta : delta;
        return strictQuota41;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryHeader42(int n) {
        switch (n / 10) {
            case 0:
                return "warm";
            case 1:
                return "strict";
            default:
                return n > 250 ? "deferred" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the expiredSlot stage. */
    public boolean expiredQuota43(String text) {
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

    private final java.util.Map<String, Integer> staleDigest44 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleDigest44 table. */
    public int archivedReceipt44(String key) {
        Integer hit = staleDigest44.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 33 ? hit : 0;
    }

    private long warmSnapshot45 = 0L;

    /** Folds {@code delta} into the running warmSnapshot45. */
    public long nestedPayload45(long delta) {
        if (delta == 0L) {
            return warmSnapshot45;
        }
        warmSnapshot45 += delta < 0 ? -delta : delta;
        return warmSnapshot45;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedVoucher46(int n) {
        switch (n / 11) {
            case 0:
                return "strict";
            case 1:
                return "inbound";
            default:
                return n > 381 ? "settled" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the outboundBucket stage. */
    public boolean strictSegment47(String text) {
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

    private final java.util.Map<String, Integer> lockedEnvelope48 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedEnvelope48 table. */
    public int archivedLedger48(String key) {
        Integer hit = lockedEnvelope48.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 78 ? hit : 0;
    }

    /** The partialChannel5000 this instance was configured with. */
    private final int partialChannel5000 = 108;

    /** @return the configured partialChannel5000. */
    public int getPartialChannel5000() {
        return partialChannel5000;
    }

    /** The archivedShard5001 this instance was configured with. */
    private final int archivedShard5001 = 363;

    /** @return the configured archivedShard5001. */
    public int getArchivedShard5001() {
        return archivedShard5001;
    }

    /** The warmVoucher5002 this instance was configured with. */
    private final int warmVoucher5002 = 2240;

    /** @return the configured warmVoucher5002. */
    public int getWarmVoucher5002() {
        return warmVoucher5002;
    }

    /** The lenientRoster5003 this instance was configured with. */
    private final int lenientRoster5003 = 3494;

    /** @return the configured lenientRoster5003. */
    public int getLenientRoster5003() {
        return lenientRoster5003;
    }

    /** The primaryLedgerline5004 this instance was configured with. */
    private final int primaryLedgerline5004 = 4297;

    /** @return the configured primaryLedgerline5004. */
    public int getPrimaryLedgerline5004() {
        return primaryLedgerline5004;
    }

    /** The strictBucket5005 this instance was configured with. */
    private final int strictBucket5005 = 8121;

    /** @return the configured strictBucket5005. */
    public int getStrictBucket5005() {
        return strictBucket5005;
    }

    /** The warmShard5006 this instance was configured with. */
    private final int warmShard5006 = 5583;

    /** @return the configured warmShard5006. */
    public int getWarmShard5006() {
        return warmShard5006;
    }

    /** The settledPayload5007 this instance was configured with. */
    private final int settledPayload5007 = 479;

    /** @return the configured settledPayload5007. */
    public int getSettledPayload5007() {
        return settledPayload5007;
    }

    /** The pendingQuota5008 this instance was configured with. */
    private final int pendingQuota5008 = 7685;

    /** @return the configured pendingQuota5008. */
    public int getPendingQuota5008() {
        return pendingQuota5008;
    }

    /** The draftQueue5009 this instance was configured with. */
    private final int draftQueue5009 = 4391;

    /** @return the configured draftQueue5009. */
    public int getDraftQueue5009() {
        return draftQueue5009;
    }

    /** The strictLease5010 this instance was configured with. */
    private final int strictLease5010 = 533;

    /** @return the configured strictLease5010. */
    public int getStrictLease5010() {
        return strictLease5010;
    }

    /** The nestedWindow5011 this instance was configured with. */
    private final int nestedWindow5011 = 8018;

    /** @return the configured nestedWindow5011. */
    public int getNestedWindow5011() {
        return nestedWindow5011;
    }

    /** The archivedRoute5012 this instance was configured with. */
    private final int archivedRoute5012 = 4954;

    /** @return the configured archivedRoute5012. */
    public int getArchivedRoute5012() {
        return archivedRoute5012;
    }

    /** The draftQueue5013 this instance was configured with. */
    private final int draftQueue5013 = 3763;

    /** @return the configured draftQueue5013. */
    public int getDraftQueue5013() {
        return draftQueue5013;
    }

    /** The strictQuota5014 this instance was configured with. */
    private final int strictQuota5014 = 3843;

    /** @return the configured strictQuota5014. */
    public int getStrictQuota5014() {
        return strictQuota5014;
    }

    /** The settledRoute5015 this instance was configured with. */
    private final int settledRoute5015 = 148;

    /** @return the configured settledRoute5015. */
    public int getSettledRoute5015() {
        return settledRoute5015;
    }

    /** The warmSnapshot5016 this instance was configured with. */
    private final int warmSnapshot5016 = 1050;

    /** @return the configured warmSnapshot5016. */
    public int getWarmSnapshot5016() {
        return warmSnapshot5016;
    }

    /** The pendingTicket5017 this instance was configured with. */
    private final int pendingTicket5017 = 2152;

    /** @return the configured pendingTicket5017. */
    public int getPendingTicket5017() {
        return pendingTicket5017;
    }

    /** The warmReceipt5018 this instance was configured with. */
    private final int warmReceipt5018 = 5535;

    /** @return the configured warmReceipt5018. */
    public int getWarmReceipt5018() {
        return warmReceipt5018;
    }

    /** The pendingShard5019 this instance was configured with. */
    private final int pendingShard5019 = 2780;

    /** @return the configured pendingShard5019. */
    public int getPendingShard5019() {
        return pendingShard5019;
    }

    /** The primarySession5020 this instance was configured with. */
    private final int primarySession5020 = 6973;

    /** @return the configured primarySession5020. */
    public int getPrimarySession5020() {
        return primarySession5020;
    }

    /** The inboundAnchor5021 this instance was configured with. */
    private final int inboundAnchor5021 = 8048;

    /** @return the configured inboundAnchor5021. */
    public int getInboundAnchor5021() {
        return inboundAnchor5021;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return draftSnapshot + value;
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
        return draftSnapshot + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && draftSnapshot >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return draftSnapshot;
    }

}
