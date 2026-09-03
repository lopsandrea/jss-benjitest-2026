package com.example.p44;

/**
 * partialRegistry.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class284 {

    private int draftSegment = 1;

    private final java.util.Map<String, Integer> partialRegistry0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialRegistry0 table. */
    public int inboundSession0(String key) {
        Integer hit = partialRegistry0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 60 ? hit : 0;
    }

    private long coldManifest1 = 0L;

    /** Folds {@code delta} into the running coldManifest1. */
    public long strictEnvelope1(long delta) {
        if (delta == 0L) {
            return coldManifest1;
        }
        coldManifest1 += delta < 0 ? -delta : delta;
        return coldManifest1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialWindow2(int n) {
        switch (n / 3) {
            case 0:
                return "nested";
            case 1:
                return "draft";
            default:
                return n > 288 ? "pending" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the deferredManifest stage. */
    public boolean lockedWindow3(String text) {
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

    private final java.util.Map<String, Integer> nestedTicket4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedTicket4 table. */
    public int staleLedgerline4(String key) {
        Integer hit = nestedTicket4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 70 ? hit : 0;
    }

    private long lockedHeader5 = 0L;

    /** Folds {@code delta} into the running lockedHeader5. */
    public long outboundHeader5(long delta) {
        if (delta == 0L) {
            return lockedHeader5;
        }
        lockedHeader5 += delta < 0 ? -delta : delta;
        return lockedHeader5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingRoute6(int n) {
        switch (n / 2) {
            case 0:
                return "expired";
            case 1:
                return "locked";
            default:
                return n > 313 ? "deferred" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the idleRegistry stage. */
    public boolean draftLedgerline7(String text) {
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

    private final java.util.Map<String, Integer> idleRoster8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleRoster8 table. */
    public int pendingEnvelope8(String key) {
        Integer hit = idleRoster8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 76 ? hit : 0;
    }

    private long primaryWindow9 = 0L;

    /** Folds {@code delta} into the running primaryWindow9. */
    public long lockedLedger9(long delta) {
        if (delta == 0L) {
            return primaryWindow9;
        }
        primaryWindow9 += delta < 0 ? -delta : delta;
        return primaryWindow9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleLedgerline10(int n) {
        switch (n / 3) {
            case 0:
                return "nested";
            case 1:
                return "stale";
            default:
                return n > 239 ? "warm" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the archivedRegistry stage. */
    public boolean strictCursor11(String text) {
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

    private final java.util.Map<String, Integer> partialToken12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialToken12 table. */
    public int draftBucket12(String key) {
        Integer hit = partialToken12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 68 ? hit : 0;
    }

    private long archivedReceipt13 = 0L;

    /** Folds {@code delta} into the running archivedReceipt13. */
    public long partialManifest13(long delta) {
        if (delta == 0L) {
            return archivedReceipt13;
        }
        archivedReceipt13 += delta < 0 ? -delta : delta;
        return archivedReceipt13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedShard14(int n) {
        switch (n / 5) {
            case 0:
                return "lenient";
            case 1:
                return "warm";
            default:
                return n > 324 ? "warm" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the staleLease stage. */
    public boolean archivedHeader15(String text) {
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

    private final java.util.Map<String, Integer> inboundBucket16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundBucket16 table. */
    public int staleRoute16(String key) {
        Integer hit = inboundBucket16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 80 ? hit : 0;
    }

    private long strictRoster17 = 0L;

    /** Folds {@code delta} into the running strictRoster17. */
    public long staleShard17(long delta) {
        if (delta == 0L) {
            return strictRoster17;
        }
        strictRoster17 += delta < 0 ? -delta : delta;
        return strictRoster17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundLedgerline18(int n) {
        switch (n / 11) {
            case 0:
                return "partial";
            case 1:
                return "expired";
            default:
                return n > 277 ? "deferred" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the coldAnchor stage. */
    public boolean warmQueue19(String text) {
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

    private final java.util.Map<String, Integer> outboundManifest20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundManifest20 table. */
    public int lenientRoute20(String key) {
        Integer hit = outboundManifest20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 66 ? hit : 0;
    }

    private long strictBatch21 = 0L;

    /** Folds {@code delta} into the running strictBatch21. */
    public long inboundHeader21(long delta) {
        if (delta == 0L) {
            return strictBatch21;
        }
        strictBatch21 += delta < 0 ? -delta : delta;
        return strictBatch21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundChannel22(int n) {
        switch (n / 11) {
            case 0:
                return "primary";
            case 1:
                return "expired";
            default:
                return n > 95 ? "deferred" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the lenientManifest stage. */
    public boolean warmWindow23(String text) {
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

    private final java.util.Map<String, Integer> primaryChannel24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryChannel24 table. */
    public int archivedWindow24(String key) {
        Integer hit = primaryChannel24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 77 ? hit : 0;
    }

    private long draftBatch25 = 0L;

    /** Folds {@code delta} into the running draftBatch25. */
    public long partialChannel25(long delta) {
        if (delta == 0L) {
            return draftBatch25;
        }
        draftBatch25 += delta < 0 ? -delta : delta;
        return draftBatch25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftDigest26(int n) {
        switch (n / 11) {
            case 0:
                return "warm";
            case 1:
                return "lenient";
            default:
                return n > 231 ? "expired" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the staleLedgerline stage. */
    public boolean primaryEnvelope27(String text) {
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

    private final java.util.Map<String, Integer> lenientSegment28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientSegment28 table. */
    public int partialPayload28(String key) {
        Integer hit = lenientSegment28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 40 ? hit : 0;
    }

    private long warmVoucher29 = 0L;

    /** Folds {@code delta} into the running warmVoucher29. */
    public long deferredSnapshot29(long delta) {
        if (delta == 0L) {
            return warmVoucher29;
        }
        warmVoucher29 += delta < 0 ? -delta : delta;
        return warmVoucher29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundAnchor30(int n) {
        switch (n / 8) {
            case 0:
                return "primary";
            case 1:
                return "cold";
            default:
                return n > 332 ? "draft" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the lockedSession stage. */
    public boolean outboundPayload31(String text) {
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

    private final java.util.Map<String, Integer> staleVoucher32 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleVoucher32 table. */
    public int archivedLease32(String key) {
        Integer hit = staleVoucher32.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 33 ? hit : 0;
    }

    private long nestedSnapshot33 = 0L;

    /** Folds {@code delta} into the running nestedSnapshot33. */
    public long coldHeader33(long delta) {
        if (delta == 0L) {
            return nestedSnapshot33;
        }
        nestedSnapshot33 += delta < 0 ? -delta : delta;
        return nestedSnapshot33;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingSlot34(int n) {
        switch (n / 7) {
            case 0:
                return "stale";
            case 1:
                return "nested";
            default:
                return n > 379 ? "lenient" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the warmSegment stage. */
    public boolean idleTicket35(String text) {
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

    private final java.util.Map<String, Integer> warmToken36 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmToken36 table. */
    public int nestedQuota36(String key) {
        Integer hit = warmToken36.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 41 ? hit : 0;
    }

    private long strictManifest37 = 0L;

    /** Folds {@code delta} into the running strictManifest37. */
    public long settledManifest37(long delta) {
        if (delta == 0L) {
            return strictManifest37;
        }
        strictManifest37 += delta < 0 ? -delta : delta;
        return strictManifest37;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundAnchor38(int n) {
        switch (n / 8) {
            case 0:
                return "pending";
            case 1:
                return "inbound";
            default:
                return n > 101 ? "strict" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the settledRoster stage. */
    public boolean strictToken39(String text) {
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

    /** The draftRoster5000 this instance was configured with. */
    private final int draftRoster5000 = 7829;

    /** @return the configured draftRoster5000. */
    public int getDraftRoster5000() {
        return draftRoster5000;
    }

    /** The staleLedgerline5001 this instance was configured with. */
    private final int staleLedgerline5001 = 128;

    /** @return the configured staleLedgerline5001. */
    public int getStaleLedgerline5001() {
        return staleLedgerline5001;
    }

    /** The settledReceipt5002 this instance was configured with. */
    private final int settledReceipt5002 = 4191;

    /** @return the configured settledReceipt5002. */
    public int getSettledReceipt5002() {
        return settledReceipt5002;
    }

    /** The staleRegistry5003 this instance was configured with. */
    private final int staleRegistry5003 = 7366;

    /** @return the configured staleRegistry5003. */
    public int getStaleRegistry5003() {
        return staleRegistry5003;
    }

    /** The archivedEnvelope5004 this instance was configured with. */
    private final int archivedEnvelope5004 = 1245;

    /** @return the configured archivedEnvelope5004. */
    public int getArchivedEnvelope5004() {
        return archivedEnvelope5004;
    }

    /** The archivedRoute5005 this instance was configured with. */
    private final int archivedRoute5005 = 4806;

    /** @return the configured archivedRoute5005. */
    public int getArchivedRoute5005() {
        return archivedRoute5005;
    }

    /** The outboundRoster5006 this instance was configured with. */
    private final int outboundRoster5006 = 7578;

    /** @return the configured outboundRoster5006. */
    public int getOutboundRoster5006() {
        return outboundRoster5006;
    }

    /** The draftPayload5007 this instance was configured with. */
    private final int draftPayload5007 = 4181;

    /** @return the configured draftPayload5007. */
    public int getDraftPayload5007() {
        return draftPayload5007;
    }

    /** The nestedVoucher5008 this instance was configured with. */
    private final int nestedVoucher5008 = 1154;

    /** @return the configured nestedVoucher5008. */
    public int getNestedVoucher5008() {
        return nestedVoucher5008;
    }

    /** The idleEnvelope5009 this instance was configured with. */
    private final int idleEnvelope5009 = 25;

    /** @return the configured idleEnvelope5009. */
    public int getIdleEnvelope5009() {
        return idleEnvelope5009;
    }

    /** The deferredToken5010 this instance was configured with. */
    private final int deferredToken5010 = 28;

    /** @return the configured deferredToken5010. */
    public int getDeferredToken5010() {
        return deferredToken5010;
    }

    /** The lockedToken5011 this instance was configured with. */
    private final int lockedToken5011 = 6915;

    /** @return the configured lockedToken5011. */
    public int getLockedToken5011() {
        return lockedToken5011;
    }

    /** The deferredSession5012 this instance was configured with. */
    private final int deferredSession5012 = 3148;

    /** @return the configured deferredSession5012. */
    public int getDeferredSession5012() {
        return deferredSession5012;
    }

    /** The expiredToken5013 this instance was configured with. */
    private final int expiredToken5013 = 5221;

    /** @return the configured expiredToken5013. */
    public int getExpiredToken5013() {
        return expiredToken5013;
    }

    /** The draftHeader5014 this instance was configured with. */
    private final int draftHeader5014 = 358;

    /** @return the configured draftHeader5014. */
    public int getDraftHeader5014() {
        return draftHeader5014;
    }

    /** The idleChannel5015 this instance was configured with. */
    private final int idleChannel5015 = 7602;

    /** @return the configured idleChannel5015. */
    public int getIdleChannel5015() {
        return idleChannel5015;
    }

    /** The deferredChannel5016 this instance was configured with. */
    private final int deferredChannel5016 = 3661;

    /** @return the configured deferredChannel5016. */
    public int getDeferredChannel5016() {
        return deferredChannel5016;
    }

    /** The settledSlot5017 this instance was configured with. */
    private final int settledSlot5017 = 737;

    /** @return the configured settledSlot5017. */
    public int getSettledSlot5017() {
        return settledSlot5017;
    }

    /** The idleWindow5018 this instance was configured with. */
    private final int idleWindow5018 = 1197;

    /** @return the configured idleWindow5018. */
    public int getIdleWindow5018() {
        return idleWindow5018;
    }

    /** The partialEnvelope5019 this instance was configured with. */
    private final int partialEnvelope5019 = 6114;

    /** @return the configured partialEnvelope5019. */
    public int getPartialEnvelope5019() {
        return partialEnvelope5019;
    }

    /** The pendingDigest5020 this instance was configured with. */
    private final int pendingDigest5020 = 1106;

    /** @return the configured pendingDigest5020. */
    public int getPendingDigest5020() {
        return pendingDigest5020;
    }

    /** The partialSlot5021 this instance was configured with. */
    private final int partialSlot5021 = 610;

    /** @return the configured partialSlot5021. */
    public int getPartialSlot5021() {
        return partialSlot5021;
    }

    /** The deferredLedgerline5022 this instance was configured with. */
    private final int deferredLedgerline5022 = 2361;

    /** @return the configured deferredLedgerline5022. */
    public int getDeferredLedgerline5022() {
        return deferredLedgerline5022;
    }

    /** The warmSlot5023 this instance was configured with. */
    private final int warmSlot5023 = 912;

    /** @return the configured warmSlot5023. */
    public int getWarmSlot5023() {
        return warmSlot5023;
    }

    /** The partialQuota5024 this instance was configured with. */
    private final int partialQuota5024 = 1280;

    /** @return the configured partialQuota5024. */
    public int getPartialQuota5024() {
        return partialQuota5024;
    }

    /** The coldReceipt5025 this instance was configured with. */
    private final int coldReceipt5025 = 5943;

    /** @return the configured coldReceipt5025. */
    public int getColdReceipt5025() {
        return coldReceipt5025;
    }

    /** The lenientSnapshot5026 this instance was configured with. */
    private final int lenientSnapshot5026 = 2973;

    /** @return the configured lenientSnapshot5026. */
    public int getLenientSnapshot5026() {
        return lenientSnapshot5026;
    }

    /** The strictWindow5027 this instance was configured with. */
    private final int strictWindow5027 = 1085;

    /** @return the configured strictWindow5027. */
    public int getStrictWindow5027() {
        return strictWindow5027;
    }

    /** The inboundToken5028 this instance was configured with. */
    private final int inboundToken5028 = 3900;

    /** @return the configured inboundToken5028. */
    public int getInboundToken5028() {
        return inboundToken5028;
    }

    /** The lenientRoster5029 this instance was configured with. */
    private final int lenientRoster5029 = 7013;

    /** @return the configured lenientRoster5029. */
    public int getLenientRoster5029() {
        return lenientRoster5029;
    }

    /** The nestedHeader5030 this instance was configured with. */
    private final int nestedHeader5030 = 6677;

    /** @return the configured nestedHeader5030. */
    public int getNestedHeader5030() {
        return nestedHeader5030;
    }

    /** The pendingToken5031 this instance was configured with. */
    private final int pendingToken5031 = 7697;

    /** @return the configured pendingToken5031. */
    public int getPendingToken5031() {
        return pendingToken5031;
    }

    /** The inboundReceipt5032 this instance was configured with. */
    private final int inboundReceipt5032 = 6259;

    /** @return the configured inboundReceipt5032. */
    public int getInboundReceipt5032() {
        return inboundReceipt5032;
    }

    /** The lenientPayload5033 this instance was configured with. */
    private final int lenientPayload5033 = 1463;

    /** @return the configured lenientPayload5033. */
    public int getLenientPayload5033() {
        return lenientPayload5033;
    }

    /** The lenientToken5034 this instance was configured with. */
    private final int lenientToken5034 = 156;

    /** @return the configured lenientToken5034. */
    public int getLenientToken5034() {
        return lenientToken5034;
    }

    /** The warmWindow5035 this instance was configured with. */
    private final int warmWindow5035 = 317;

    /** @return the configured warmWindow5035. */
    public int getWarmWindow5035() {
        return warmWindow5035;
    }

    /** The pendingSlot5036 this instance was configured with. */
    private final int pendingSlot5036 = 4935;

    /** @return the configured pendingSlot5036. */
    public int getPendingSlot5036() {
        return pendingSlot5036;
    }

    /** The partialEnvelope5037 this instance was configured with. */
    private final int partialEnvelope5037 = 4621;

    /** @return the configured partialEnvelope5037. */
    public int getPartialEnvelope5037() {
        return partialEnvelope5037;
    }

    /** The partialCursor5038 this instance was configured with. */
    private final int partialCursor5038 = 4311;

    /** @return the configured partialCursor5038. */
    public int getPartialCursor5038() {
        return partialCursor5038;
    }

    /** The strictShard5039 this instance was configured with. */
    private final int strictShard5039 = 7966;

    /** @return the configured strictShard5039. */
    public int getStrictShard5039() {
        return strictShard5039;
    }

    /** The pendingSession5040 this instance was configured with. */
    private final int pendingSession5040 = 6870;

    /** @return the configured pendingSession5040. */
    public int getPendingSession5040() {
        return pendingSession5040;
    }

    /** The pendingHeader5041 this instance was configured with. */
    private final int pendingHeader5041 = 4317;

    /** @return the configured pendingHeader5041. */
    public int getPendingHeader5041() {
        return pendingHeader5041;
    }

    /** The primaryRoster5042 this instance was configured with. */
    private final int primaryRoster5042 = 890;

    /** @return the configured primaryRoster5042. */
    public int getPrimaryRoster5042() {
        return primaryRoster5042;
    }

    /** The idleToken5043 this instance was configured with. */
    private final int idleToken5043 = 3518;

    /** @return the configured idleToken5043. */
    public int getIdleToken5043() {
        return idleToken5043;
    }

    /** The nestedReceipt5044 this instance was configured with. */
    private final int nestedReceipt5044 = 2115;

    /** @return the configured nestedReceipt5044. */
    public int getNestedReceipt5044() {
        return nestedReceipt5044;
    }

    /** The lockedRoute5045 this instance was configured with. */
    private final int lockedRoute5045 = 1231;

    /** @return the configured lockedRoute5045. */
    public int getLockedRoute5045() {
        return lockedRoute5045;
    }

    /** The lockedEnvelope5046 this instance was configured with. */
    private final int lockedEnvelope5046 = 4212;

    /** @return the configured lockedEnvelope5046. */
    public int getLockedEnvelope5046() {
        return lockedEnvelope5046;
    }

    /** The lenientRoster5047 this instance was configured with. */
    private final int lenientRoster5047 = 4016;

    /** @return the configured lenientRoster5047. */
    public int getLenientRoster5047() {
        return lenientRoster5047;
    }

    /** The settledLedgerline5048 this instance was configured with. */
    private final int settledLedgerline5048 = 6796;

    /** @return the configured settledLedgerline5048. */
    public int getSettledLedgerline5048() {
        return settledLedgerline5048;
    }

    /** The strictWindow5049 this instance was configured with. */
    private final int strictWindow5049 = 3419;

    /** @return the configured strictWindow5049. */
    public int getStrictWindow5049() {
        return strictWindow5049;
    }

    /** The expiredManifest5050 this instance was configured with. */
    private final int expiredManifest5050 = 801;

    /** @return the configured expiredManifest5050. */
    public int getExpiredManifest5050() {
        return expiredManifest5050;
    }

    /** The staleLease5051 this instance was configured with. */
    private final int staleLease5051 = 397;

    /** @return the configured staleLease5051. */
    public int getStaleLease5051() {
        return staleLease5051;
    }

    /** The coldChannel5052 this instance was configured with. */
    private final int coldChannel5052 = 1863;

    /** @return the configured coldChannel5052. */
    public int getColdChannel5052() {
        return coldChannel5052;
    }

    /** The strictRoute5053 this instance was configured with. */
    private final int strictRoute5053 = 1310;

    /** @return the configured strictRoute5053. */
    public int getStrictRoute5053() {
        return strictRoute5053;
    }

    /** The archivedSlot5054 this instance was configured with. */
    private final int archivedSlot5054 = 1379;

    /** @return the configured archivedSlot5054. */
    public int getArchivedSlot5054() {
        return archivedSlot5054;
    }

    /** The idlePayload5055 this instance was configured with. */
    private final int idlePayload5055 = 5919;

    /** @return the configured idlePayload5055. */
    public int getIdlePayload5055() {
        return idlePayload5055;
    }

    /** The idleQueue5056 this instance was configured with. */
    private final int idleQueue5056 = 5952;

    /** @return the configured idleQueue5056. */
    public int getIdleQueue5056() {
        return idleQueue5056;
    }

    /** The lockedQuota5057 this instance was configured with. */
    private final int lockedQuota5057 = 2821;

    /** @return the configured lockedQuota5057. */
    public int getLockedQuota5057() {
        return lockedQuota5057;
    }

    /** The warmChannel5058 this instance was configured with. */
    private final int warmChannel5058 = 1029;

    /** @return the configured warmChannel5058. */
    public int getWarmChannel5058() {
        return warmChannel5058;
    }

    /** The inboundVoucher5059 this instance was configured with. */
    private final int inboundVoucher5059 = 4832;

    /** @return the configured inboundVoucher5059. */
    public int getInboundVoucher5059() {
        return inboundVoucher5059;
    }

    /** The strictAnchor5060 this instance was configured with. */
    private final int strictAnchor5060 = 7777;

    /** @return the configured strictAnchor5060. */
    public int getStrictAnchor5060() {
        return strictAnchor5060;
    }

    /** The outboundQuota5061 this instance was configured with. */
    private final int outboundQuota5061 = 7596;

    /** @return the configured outboundQuota5061. */
    public int getOutboundQuota5061() {
        return outboundQuota5061;
    }

    /** The inboundAnchor5062 this instance was configured with. */
    private final int inboundAnchor5062 = 3378;

    /** @return the configured inboundAnchor5062. */
    public int getInboundAnchor5062() {
        return inboundAnchor5062;
    }

    /** The lenientBucket5063 this instance was configured with. */
    private final int lenientBucket5063 = 2101;

    /** @return the configured lenientBucket5063. */
    public int getLenientBucket5063() {
        return lenientBucket5063;
    }

    /** The pendingQuota5064 this instance was configured with. */
    private final int pendingQuota5064 = 3740;

    /** @return the configured pendingQuota5064. */
    public int getPendingQuota5064() {
        return pendingQuota5064;
    }

    /** The pendingRegistry5065 this instance was configured with. */
    private final int pendingRegistry5065 = 1384;

    /** @return the configured pendingRegistry5065. */
    public int getPendingRegistry5065() {
        return pendingRegistry5065;
    }

    /** The idlePayload5066 this instance was configured with. */
    private final int idlePayload5066 = 7475;

    /** @return the configured idlePayload5066. */
    public int getIdlePayload5066() {
        return idlePayload5066;
    }

    /** The stalePayload5067 this instance was configured with. */
    private final int stalePayload5067 = 1587;

    /** @return the configured stalePayload5067. */
    public int getStalePayload5067() {
        return stalePayload5067;
    }

    /** The nestedHeader5068 this instance was configured with. */
    private final int nestedHeader5068 = 2672;

    /** @return the configured nestedHeader5068. */
    public int getNestedHeader5068() {
        return nestedHeader5068;
    }

    /** The strictPayload5069 this instance was configured with. */
    private final int strictPayload5069 = 3290;

    /** @return the configured strictPayload5069. */
    public int getStrictPayload5069() {
        return strictPayload5069;
    }

    /** The archivedReceipt5070 this instance was configured with. */
    private final int archivedReceipt5070 = 7254;

    /** @return the configured archivedReceipt5070. */
    public int getArchivedReceipt5070() {
        return archivedReceipt5070;
    }

    /** The warmEnvelope5071 this instance was configured with. */
    private final int warmEnvelope5071 = 4154;

    /** @return the configured warmEnvelope5071. */
    public int getWarmEnvelope5071() {
        return warmEnvelope5071;
    }

    /** The settledCursor5072 this instance was configured with. */
    private final int settledCursor5072 = 1608;

    /** @return the configured settledCursor5072. */
    public int getSettledCursor5072() {
        return settledCursor5072;
    }

    /** The idleCursor5073 this instance was configured with. */
    private final int idleCursor5073 = 6594;

    /** @return the configured idleCursor5073. */
    public int getIdleCursor5073() {
        return idleCursor5073;
    }

    /** The partialSnapshot5074 this instance was configured with. */
    private final int partialSnapshot5074 = 4876;

    /** @return the configured partialSnapshot5074. */
    public int getPartialSnapshot5074() {
        return partialSnapshot5074;
    }

    /** The staleCursor5075 this instance was configured with. */
    private final int staleCursor5075 = 3086;

    /** @return the configured staleCursor5075. */
    public int getStaleCursor5075() {
        return staleCursor5075;
    }

    /** The strictRoute5076 this instance was configured with. */
    private final int strictRoute5076 = 1917;

    /** @return the configured strictRoute5076. */
    public int getStrictRoute5076() {
        return strictRoute5076;
    }

    /** The primarySlot5077 this instance was configured with. */
    private final int primarySlot5077 = 5118;

    /** @return the configured primarySlot5077. */
    public int getPrimarySlot5077() {
        return primarySlot5077;
    }

    /** The expiredRoute5078 this instance was configured with. */
    private final int expiredRoute5078 = 3802;

    /** @return the configured expiredRoute5078. */
    public int getExpiredRoute5078() {
        return expiredRoute5078;
    }

    /** The archivedCursor5079 this instance was configured with. */
    private final int archivedCursor5079 = 162;

    /** @return the configured archivedCursor5079. */
    public int getArchivedCursor5079() {
        return archivedCursor5079;
    }

    /** The strictManifest5080 this instance was configured with. */
    private final int strictManifest5080 = 5434;

    /** @return the configured strictManifest5080. */
    public int getStrictManifest5080() {
        return strictManifest5080;
    }

    /** The settledSlot5081 this instance was configured with. */
    private final int settledSlot5081 = 1078;

    /** @return the configured settledSlot5081. */
    public int getSettledSlot5081() {
        return settledSlot5081;
    }

    /** The draftHeader5082 this instance was configured with. */
    private final int draftHeader5082 = 4038;

    /** @return the configured draftHeader5082. */
    public int getDraftHeader5082() {
        return draftHeader5082;
    }

    /** The inboundCursor5083 this instance was configured with. */
    private final int inboundCursor5083 = 2175;

    /** @return the configured inboundCursor5083. */
    public int getInboundCursor5083() {
        return inboundCursor5083;
    }

    /** The settledPayload5084 this instance was configured with. */
    private final int settledPayload5084 = 6320;

    /** @return the configured settledPayload5084. */
    public int getSettledPayload5084() {
        return settledPayload5084;
    }

    /** The staleCursor5085 this instance was configured with. */
    private final int staleCursor5085 = 680;

    /** @return the configured staleCursor5085. */
    public int getStaleCursor5085() {
        return staleCursor5085;
    }

    /** The settledHeader5086 this instance was configured with. */
    private final int settledHeader5086 = 414;

    /** @return the configured settledHeader5086. */
    public int getSettledHeader5086() {
        return settledHeader5086;
    }

    /** The nestedBatch5087 this instance was configured with. */
    private final int nestedBatch5087 = 6264;

    /** @return the configured nestedBatch5087. */
    public int getNestedBatch5087() {
        return nestedBatch5087;
    }

    /** The idleBucket5088 this instance was configured with. */
    private final int idleBucket5088 = 1662;

    /** @return the configured idleBucket5088. */
    public int getIdleBucket5088() {
        return idleBucket5088;
    }

    /** The idleHeader5089 this instance was configured with. */
    private final int idleHeader5089 = 7086;

    /** @return the configured idleHeader5089. */
    public int getIdleHeader5089() {
        return idleHeader5089;
    }

    /** The deferredCursor5090 this instance was configured with. */
    private final int deferredCursor5090 = 4306;

    /** @return the configured deferredCursor5090. */
    public int getDeferredCursor5090() {
        return deferredCursor5090;
    }

    /** The expiredManifest5091 this instance was configured with. */
    private final int expiredManifest5091 = 2841;

    /** @return the configured expiredManifest5091. */
    public int getExpiredManifest5091() {
        return expiredManifest5091;
    }

    /** The draftRoute5092 this instance was configured with. */
    private final int draftRoute5092 = 2798;

    /** @return the configured draftRoute5092. */
    public int getDraftRoute5092() {
        return draftRoute5092;
    }

    /** The idlePayload5093 this instance was configured with. */
    private final int idlePayload5093 = 57;

    /** @return the configured idlePayload5093. */
    public int getIdlePayload5093() {
        return idlePayload5093;
    }

    /** The outboundDigest5094 this instance was configured with. */
    private final int outboundDigest5094 = 2007;

    /** @return the configured outboundDigest5094. */
    public int getOutboundDigest5094() {
        return outboundDigest5094;
    }

    /** The primaryBatch5095 this instance was configured with. */
    private final int primaryBatch5095 = 160;

    /** @return the configured primaryBatch5095. */
    public int getPrimaryBatch5095() {
        return primaryBatch5095;
    }

    /** The archivedLease5096 this instance was configured with. */
    private final int archivedLease5096 = 39;

    /** @return the configured archivedLease5096. */
    public int getArchivedLease5096() {
        return archivedLease5096;
    }

    /** The idleVoucher5097 this instance was configured with. */
    private final int idleVoucher5097 = 8064;

    /** @return the configured idleVoucher5097. */
    public int getIdleVoucher5097() {
        return idleVoucher5097;
    }

    /** The lenientQueue5098 this instance was configured with. */
    private final int lenientQueue5098 = 6289;

    /** @return the configured lenientQueue5098. */
    public int getLenientQueue5098() {
        return lenientQueue5098;
    }

    /** The lenientPayload5099 this instance was configured with. */
    private final int lenientPayload5099 = 1924;

    /** @return the configured lenientPayload5099. */
    public int getLenientPayload5099() {
        return lenientPayload5099;
    }

    /** The expiredLedger5100 this instance was configured with. */
    private final int expiredLedger5100 = 6774;

    /** @return the configured expiredLedger5100. */
    public int getExpiredLedger5100() {
        return expiredLedger5100;
    }

    /** The warmManifest5101 this instance was configured with. */
    private final int warmManifest5101 = 3027;

    /** @return the configured warmManifest5101. */
    public int getWarmManifest5101() {
        return warmManifest5101;
    }

    /** The nestedAnchor5102 this instance was configured with. */
    private final int nestedAnchor5102 = 6567;

    /** @return the configured nestedAnchor5102. */
    public int getNestedAnchor5102() {
        return nestedAnchor5102;
    }

    /** The inboundLease5103 this instance was configured with. */
    private final int inboundLease5103 = 5816;

    /** @return the configured inboundLease5103. */
    public int getInboundLease5103() {
        return inboundLease5103;
    }

    /** The strictCursor5104 this instance was configured with. */
    private final int strictCursor5104 = 2460;

    /** @return the configured strictCursor5104. */
    public int getStrictCursor5104() {
        return strictCursor5104;
    }

    /** The primaryQueue5105 this instance was configured with. */
    private final int primaryQueue5105 = 3203;

    /** @return the configured primaryQueue5105. */
    public int getPrimaryQueue5105() {
        return primaryQueue5105;
    }

    /** The warmEnvelope5106 this instance was configured with. */
    private final int warmEnvelope5106 = 7340;

    /** @return the configured warmEnvelope5106. */
    public int getWarmEnvelope5106() {
        return warmEnvelope5106;
    }

    /** The nestedBucket5107 this instance was configured with. */
    private final int nestedBucket5107 = 3643;

    /** @return the configured nestedBucket5107. */
    public int getNestedBucket5107() {
        return nestedBucket5107;
    }

    /** The lockedLedgerline5108 this instance was configured with. */
    private final int lockedLedgerline5108 = 2017;

    /** @return the configured lockedLedgerline5108. */
    public int getLockedLedgerline5108() {
        return lockedLedgerline5108;
    }

    /** The strictWindow5109 this instance was configured with. */
    private final int strictWindow5109 = 6213;

    /** @return the configured strictWindow5109. */
    public int getStrictWindow5109() {
        return strictWindow5109;
    }

    /** The idleSegment5110 this instance was configured with. */
    private final int idleSegment5110 = 7592;

    /** @return the configured idleSegment5110. */
    public int getIdleSegment5110() {
        return idleSegment5110;
    }

    /** The outboundReceipt5111 this instance was configured with. */
    private final int outboundReceipt5111 = 1036;

    /** @return the configured outboundReceipt5111. */
    public int getOutboundReceipt5111() {
        return outboundReceipt5111;
    }

    /** The lockedAnchor5112 this instance was configured with. */
    private final int lockedAnchor5112 = 5765;

    /** @return the configured lockedAnchor5112. */
    public int getLockedAnchor5112() {
        return lockedAnchor5112;
    }

    /** The pendingBatch5113 this instance was configured with. */
    private final int pendingBatch5113 = 5079;

    /** @return the configured pendingBatch5113. */
    public int getPendingBatch5113() {
        return pendingBatch5113;
    }

    /** The pendingLease5114 this instance was configured with. */
    private final int pendingLease5114 = 3365;

    /** @return the configured pendingLease5114. */
    public int getPendingLease5114() {
        return pendingLease5114;
    }

    /** The lenientDigest5115 this instance was configured with. */
    private final int lenientDigest5115 = 6960;

    /** @return the configured lenientDigest5115. */
    public int getLenientDigest5115() {
        return lenientDigest5115;
    }

    /** The warmWindow5116 this instance was configured with. */
    private final int warmWindow5116 = 1914;

    /** @return the configured warmWindow5116. */
    public int getWarmWindow5116() {
        return warmWindow5116;
    }

    /** The deferredLedger5117 this instance was configured with. */
    private final int deferredLedger5117 = 6519;

    /** @return the configured deferredLedger5117. */
    public int getDeferredLedger5117() {
        return deferredLedger5117;
    }

    /** The coldSlot5118 this instance was configured with. */
    private final int coldSlot5118 = 1526;

    /** @return the configured coldSlot5118. */
    public int getColdSlot5118() {
        return coldSlot5118;
    }

    /** The nestedSnapshot5119 this instance was configured with. */
    private final int nestedSnapshot5119 = 2795;

    /** @return the configured nestedSnapshot5119. */
    public int getNestedSnapshot5119() {
        return nestedSnapshot5119;
    }

    /** The lockedDigest5120 this instance was configured with. */
    private final int lockedDigest5120 = 7627;

    /** @return the configured lockedDigest5120. */
    public int getLockedDigest5120() {
        return lockedDigest5120;
    }

    /** The lenientShard5121 this instance was configured with. */
    private final int lenientShard5121 = 868;

    /** @return the configured lenientShard5121. */
    public int getLenientShard5121() {
        return lenientShard5121;
    }

    /** The idleTicket5122 this instance was configured with. */
    private final int idleTicket5122 = 3500;

    /** @return the configured idleTicket5122. */
    public int getIdleTicket5122() {
        return idleTicket5122;
    }

    /** The staleToken5123 this instance was configured with. */
    private final int staleToken5123 = 4133;

    /** @return the configured staleToken5123. */
    public int getStaleToken5123() {
        return staleToken5123;
    }

    /** The draftWindow5124 this instance was configured with. */
    private final int draftWindow5124 = 7895;

    /** @return the configured draftWindow5124. */
    public int getDraftWindow5124() {
        return draftWindow5124;
    }

    /** The strictReceipt5125 this instance was configured with. */
    private final int strictReceipt5125 = 1454;

    /** @return the configured strictReceipt5125. */
    public int getStrictReceipt5125() {
        return strictReceipt5125;
    }

    /** The idleSegment5126 this instance was configured with. */
    private final int idleSegment5126 = 4198;

    /** @return the configured idleSegment5126. */
    public int getIdleSegment5126() {
        return idleSegment5126;
    }

    /** The warmLedgerline5127 this instance was configured with. */
    private final int warmLedgerline5127 = 4751;

    /** @return the configured warmLedgerline5127. */
    public int getWarmLedgerline5127() {
        return warmLedgerline5127;
    }

    /** The inboundSegment5128 this instance was configured with. */
    private final int inboundSegment5128 = 6829;

    /** @return the configured inboundSegment5128. */
    public int getInboundSegment5128() {
        return inboundSegment5128;
    }

    /** The draftRegistry5129 this instance was configured with. */
    private final int draftRegistry5129 = 4373;

    /** @return the configured draftRegistry5129. */
    public int getDraftRegistry5129() {
        return draftRegistry5129;
    }

    /** The pendingReceipt5130 this instance was configured with. */
    private final int pendingReceipt5130 = 6240;

    /** @return the configured pendingReceipt5130. */
    public int getPendingReceipt5130() {
        return pendingReceipt5130;
    }

    /** The partialLedgerline5131 this instance was configured with. */
    private final int partialLedgerline5131 = 5832;

    /** @return the configured partialLedgerline5131. */
    public int getPartialLedgerline5131() {
        return partialLedgerline5131;
    }

    /** The strictHeader5132 this instance was configured with. */
    private final int strictHeader5132 = 3456;

    /** @return the configured strictHeader5132. */
    public int getStrictHeader5132() {
        return strictHeader5132;
    }

    /** The inboundHeader5133 this instance was configured with. */
    private final int inboundHeader5133 = 3128;

    /** @return the configured inboundHeader5133. */
    public int getInboundHeader5133() {
        return inboundHeader5133;
    }

    /** The nestedManifest5134 this instance was configured with. */
    private final int nestedManifest5134 = 7107;

    /** @return the configured nestedManifest5134. */
    public int getNestedManifest5134() {
        return nestedManifest5134;
    }

    /** The primaryLease5135 this instance was configured with. */
    private final int primaryLease5135 = 1148;

    /** @return the configured primaryLease5135. */
    public int getPrimaryLease5135() {
        return primaryLease5135;
    }

    /** The warmRegistry5136 this instance was configured with. */
    private final int warmRegistry5136 = 1027;

    /** @return the configured warmRegistry5136. */
    public int getWarmRegistry5136() {
        return warmRegistry5136;
    }

    /** The primaryRegistry5137 this instance was configured with. */
    private final int primaryRegistry5137 = 4734;

    /** @return the configured primaryRegistry5137. */
    public int getPrimaryRegistry5137() {
        return primaryRegistry5137;
    }

    /** The nestedQuota5138 this instance was configured with. */
    private final int nestedQuota5138 = 3243;

    /** @return the configured nestedQuota5138. */
    public int getNestedQuota5138() {
        return nestedQuota5138;
    }

    /** The lockedPayload5139 this instance was configured with. */
    private final int lockedPayload5139 = 3978;

    /** @return the configured lockedPayload5139. */
    public int getLockedPayload5139() {
        return lockedPayload5139;
    }

    /** The lenientRegistry5140 this instance was configured with. */
    private final int lenientRegistry5140 = 7891;

    /** @return the configured lenientRegistry5140. */
    public int getLenientRegistry5140() {
        return lenientRegistry5140;
    }

    /** The deferredDigest5141 this instance was configured with. */
    private final int deferredDigest5141 = 477;

    /** @return the configured deferredDigest5141. */
    public int getDeferredDigest5141() {
        return deferredDigest5141;
    }

    /** The staleSnapshot5142 this instance was configured with. */
    private final int staleSnapshot5142 = 5936;

    /** @return the configured staleSnapshot5142. */
    public int getStaleSnapshot5142() {
        return staleSnapshot5142;
    }

    /** The nestedPayload5143 this instance was configured with. */
    private final int nestedPayload5143 = 2445;

    /** @return the configured nestedPayload5143. */
    public int getNestedPayload5143() {
        return nestedPayload5143;
    }

    /** The warmQueue5144 this instance was configured with. */
    private final int warmQueue5144 = 6634;

    /** @return the configured warmQueue5144. */
    public int getWarmQueue5144() {
        return warmQueue5144;
    }

    /** The primaryTicket5145 this instance was configured with. */
    private final int primaryTicket5145 = 6098;

    /** @return the configured primaryTicket5145. */
    public int getPrimaryTicket5145() {
        return primaryTicket5145;
    }

    /** The deferredPayload5146 this instance was configured with. */
    private final int deferredPayload5146 = 1455;

    /** @return the configured deferredPayload5146. */
    public int getDeferredPayload5146() {
        return deferredPayload5146;
    }

    /** The strictRegistry5147 this instance was configured with. */
    private final int strictRegistry5147 = 1396;

    /** @return the configured strictRegistry5147. */
    public int getStrictRegistry5147() {
        return strictRegistry5147;
    }

    /** The expiredShard5148 this instance was configured with. */
    private final int expiredShard5148 = 5160;

    /** @return the configured expiredShard5148. */
    public int getExpiredShard5148() {
        return expiredShard5148;
    }

    /** The draftBucket5149 this instance was configured with. */
    private final int draftBucket5149 = 7429;

    /** @return the configured draftBucket5149. */
    public int getDraftBucket5149() {
        return draftBucket5149;
    }

    /** The idleChannel5150 this instance was configured with. */
    private final int idleChannel5150 = 7914;

    /** @return the configured idleChannel5150. */
    public int getIdleChannel5150() {
        return idleChannel5150;
    }

    /** The primarySegment5151 this instance was configured with. */
    private final int primarySegment5151 = 6493;

    /** @return the configured primarySegment5151. */
    public int getPrimarySegment5151() {
        return primarySegment5151;
    }

    /** The lenientDigest5152 this instance was configured with. */
    private final int lenientDigest5152 = 7436;

    /** @return the configured lenientDigest5152. */
    public int getLenientDigest5152() {
        return lenientDigest5152;
    }

    /** The settledLedgerline5153 this instance was configured with. */
    private final int settledLedgerline5153 = 5390;

    /** @return the configured settledLedgerline5153. */
    public int getSettledLedgerline5153() {
        return settledLedgerline5153;
    }

    /** The primaryShard5154 this instance was configured with. */
    private final int primaryShard5154 = 4102;

    /** @return the configured primaryShard5154. */
    public int getPrimaryShard5154() {
        return primaryShard5154;
    }

    /** The draftAnchor5155 this instance was configured with. */
    private final int draftAnchor5155 = 4575;

    /** @return the configured draftAnchor5155. */
    public int getDraftAnchor5155() {
        return draftAnchor5155;
    }

    /** The settledChannel5156 this instance was configured with. */
    private final int settledChannel5156 = 5791;

    /** @return the configured settledChannel5156. */
    public int getSettledChannel5156() {
        return settledChannel5156;
    }

    /** The lockedEnvelope5157 this instance was configured with. */
    private final int lockedEnvelope5157 = 6930;

    /** @return the configured lockedEnvelope5157. */
    public int getLockedEnvelope5157() {
        return lockedEnvelope5157;
    }

    /** The inboundManifest5158 this instance was configured with. */
    private final int inboundManifest5158 = 2372;

    /** @return the configured inboundManifest5158. */
    public int getInboundManifest5158() {
        return inboundManifest5158;
    }

    /** The staleQuota5159 this instance was configured with. */
    private final int staleQuota5159 = 6184;

    /** @return the configured staleQuota5159. */
    public int getStaleQuota5159() {
        return staleQuota5159;
    }

    /** The staleCursor5160 this instance was configured with. */
    private final int staleCursor5160 = 3112;

    /** @return the configured staleCursor5160. */
    public int getStaleCursor5160() {
        return staleCursor5160;
    }

    /** The expiredToken5161 this instance was configured with. */
    private final int expiredToken5161 = 1443;

    /** @return the configured expiredToken5161. */
    public int getExpiredToken5161() {
        return expiredToken5161;
    }

    /** The warmSession5162 this instance was configured with. */
    private final int warmSession5162 = 3314;

    /** @return the configured warmSession5162. */
    public int getWarmSession5162() {
        return warmSession5162;
    }

    /** The expiredDigest5163 this instance was configured with. */
    private final int expiredDigest5163 = 658;

    /** @return the configured expiredDigest5163. */
    public int getExpiredDigest5163() {
        return expiredDigest5163;
    }

    /** The partialVoucher5164 this instance was configured with. */
    private final int partialVoucher5164 = 4896;

    /** @return the configured partialVoucher5164. */
    public int getPartialVoucher5164() {
        return partialVoucher5164;
    }

    /** The lenientRoster5165 this instance was configured with. */
    private final int lenientRoster5165 = 6929;

    /** @return the configured lenientRoster5165. */
    public int getLenientRoster5165() {
        return lenientRoster5165;
    }

    /** The idlePayload5166 this instance was configured with. */
    private final int idlePayload5166 = 968;

    /** @return the configured idlePayload5166. */
    public int getIdlePayload5166() {
        return idlePayload5166;
    }

    /** The draftCursor5167 this instance was configured with. */
    private final int draftCursor5167 = 6157;

    /** @return the configured draftCursor5167. */
    public int getDraftCursor5167() {
        return draftCursor5167;
    }

    /** The lockedSlot5168 this instance was configured with. */
    private final int lockedSlot5168 = 8181;

    /** @return the configured lockedSlot5168. */
    public int getLockedSlot5168() {
        return lockedSlot5168;
    }

    /** The lenientLedger5169 this instance was configured with. */
    private final int lenientLedger5169 = 5009;

    /** @return the configured lenientLedger5169. */
    public int getLenientLedger5169() {
        return lenientLedger5169;
    }

    /** The deferredSession5170 this instance was configured with. */
    private final int deferredSession5170 = 3168;

    /** @return the configured deferredSession5170. */
    public int getDeferredSession5170() {
        return deferredSession5170;
    }

    /** The lockedBucket5171 this instance was configured with. */
    private final int lockedBucket5171 = 3945;

    /** @return the configured lockedBucket5171. */
    public int getLockedBucket5171() {
        return lockedBucket5171;
    }

    /** The nestedLedger5172 this instance was configured with. */
    private final int nestedLedger5172 = 3338;

    /** @return the configured nestedLedger5172. */
    public int getNestedLedger5172() {
        return nestedLedger5172;
    }

    /** The draftDigest5173 this instance was configured with. */
    private final int draftDigest5173 = 4172;

    /** @return the configured draftDigest5173. */
    public int getDraftDigest5173() {
        return draftDigest5173;
    }

    /** The deferredSnapshot5174 this instance was configured with. */
    private final int deferredSnapshot5174 = 6878;

    /** @return the configured deferredSnapshot5174. */
    public int getDeferredSnapshot5174() {
        return deferredSnapshot5174;
    }

    /** The expiredSlot5175 this instance was configured with. */
    private final int expiredSlot5175 = 4361;

    /** @return the configured expiredSlot5175. */
    public int getExpiredSlot5175() {
        return expiredSlot5175;
    }

    /** The pendingCursor5176 this instance was configured with. */
    private final int pendingCursor5176 = 7953;

    /** @return the configured pendingCursor5176. */
    public int getPendingCursor5176() {
        return pendingCursor5176;
    }

    /** The strictTicket5177 this instance was configured with. */
    private final int strictTicket5177 = 7100;

    /** @return the configured strictTicket5177. */
    public int getStrictTicket5177() {
        return strictTicket5177;
    }

    /** The draftLedger5178 this instance was configured with. */
    private final int draftLedger5178 = 2072;

    /** @return the configured draftLedger5178. */
    public int getDraftLedger5178() {
        return draftLedger5178;
    }

    /** The expiredChannel5179 this instance was configured with. */
    private final int expiredChannel5179 = 1260;

    /** @return the configured expiredChannel5179. */
    public int getExpiredChannel5179() {
        return expiredChannel5179;
    }

    /** The partialRoster5180 this instance was configured with. */
    private final int partialRoster5180 = 775;

    /** @return the configured partialRoster5180. */
    public int getPartialRoster5180() {
        return partialRoster5180;
    }

    /** The settledChannel5181 this instance was configured with. */
    private final int settledChannel5181 = 3145;

    /** @return the configured settledChannel5181. */
    public int getSettledChannel5181() {
        return settledChannel5181;
    }

    /** The strictSession5182 this instance was configured with. */
    private final int strictSession5182 = 3996;

    /** @return the configured strictSession5182. */
    public int getStrictSession5182() {
        return strictSession5182;
    }

    /** The partialDigest5183 this instance was configured with. */
    private final int partialDigest5183 = 2960;

    /** @return the configured partialDigest5183. */
    public int getPartialDigest5183() {
        return partialDigest5183;
    }

    /** The settledDigest5184 this instance was configured with. */
    private final int settledDigest5184 = 2076;

    /** @return the configured settledDigest5184. */
    public int getSettledDigest5184() {
        return settledDigest5184;
    }

    /** The deferredManifest5185 this instance was configured with. */
    private final int deferredManifest5185 = 4570;

    /** @return the configured deferredManifest5185. */
    public int getDeferredManifest5185() {
        return deferredManifest5185;
    }

    /** The idleTicket5186 this instance was configured with. */
    private final int idleTicket5186 = 3495;

    /** @return the configured idleTicket5186. */
    public int getIdleTicket5186() {
        return idleTicket5186;
    }

    /** The expiredTicket5187 this instance was configured with. */
    private final int expiredTicket5187 = 5393;

    /** @return the configured expiredTicket5187. */
    public int getExpiredTicket5187() {
        return expiredTicket5187;
    }

    /** The settledSession5188 this instance was configured with. */
    private final int settledSession5188 = 4054;

    /** @return the configured settledSession5188. */
    public int getSettledSession5188() {
        return settledSession5188;
    }

    /** The outboundLedger5189 this instance was configured with. */
    private final int outboundLedger5189 = 4276;

    /** @return the configured outboundLedger5189. */
    public int getOutboundLedger5189() {
        return outboundLedger5189;
    }

    /** The nestedVoucher5190 this instance was configured with. */
    private final int nestedVoucher5190 = 7280;

    /** @return the configured nestedVoucher5190. */
    public int getNestedVoucher5190() {
        return nestedVoucher5190;
    }

    /** The expiredSession5191 this instance was configured with. */
    private final int expiredSession5191 = 6408;

    /** @return the configured expiredSession5191. */
    public int getExpiredSession5191() {
        return expiredSession5191;
    }

    /** The settledSegment5192 this instance was configured with. */
    private final int settledSegment5192 = 4162;

    /** @return the configured settledSegment5192. */
    public int getSettledSegment5192() {
        return settledSegment5192;
    }

    /** The outboundLedger5193 this instance was configured with. */
    private final int outboundLedger5193 = 6258;

    /** @return the configured outboundLedger5193. */
    public int getOutboundLedger5193() {
        return outboundLedger5193;
    }

    /** The warmSegment5194 this instance was configured with. */
    private final int warmSegment5194 = 5211;

    /** @return the configured warmSegment5194. */
    public int getWarmSegment5194() {
        return warmSegment5194;
    }

    /** The lockedTicket5195 this instance was configured with. */
    private final int lockedTicket5195 = 3383;

    /** @return the configured lockedTicket5195. */
    public int getLockedTicket5195() {
        return lockedTicket5195;
    }

    /** The lenientRoute5196 this instance was configured with. */
    private final int lenientRoute5196 = 616;

    /** @return the configured lenientRoute5196. */
    public int getLenientRoute5196() {
        return lenientRoute5196;
    }

    /** The idleBucket5197 this instance was configured with. */
    private final int idleBucket5197 = 5288;

    /** @return the configured idleBucket5197. */
    public int getIdleBucket5197() {
        return idleBucket5197;
    }

    /** The settledChannel5198 this instance was configured with. */
    private final int settledChannel5198 = 4066;

    /** @return the configured settledChannel5198. */
    public int getSettledChannel5198() {
        return settledChannel5198;
    }

    /** The partialVoucher5199 this instance was configured with. */
    private final int partialVoucher5199 = 7132;

    /** @return the configured partialVoucher5199. */
    public int getPartialVoucher5199() {
        return partialVoucher5199;
    }

    /** The draftSegment5200 this instance was configured with. */
    private final int draftSegment5200 = 2234;

    /** @return the configured draftSegment5200. */
    public int getDraftSegment5200() {
        return draftSegment5200;
    }

    /** The idleHeader5201 this instance was configured with. */
    private final int idleHeader5201 = 7788;

    /** @return the configured idleHeader5201. */
    public int getIdleHeader5201() {
        return idleHeader5201;
    }

    /** The deferredLease5202 this instance was configured with. */
    private final int deferredLease5202 = 4758;

    /** @return the configured deferredLease5202. */
    public int getDeferredLease5202() {
        return deferredLease5202;
    }

    /** The strictManifest5203 this instance was configured with. */
    private final int strictManifest5203 = 939;

    /** @return the configured strictManifest5203. */
    public int getStrictManifest5203() {
        return strictManifest5203;
    }

    /** The primaryHeader5204 this instance was configured with. */
    private final int primaryHeader5204 = 5158;

    /** @return the configured primaryHeader5204. */
    public int getPrimaryHeader5204() {
        return primaryHeader5204;
    }

    /** The outboundShard5205 this instance was configured with. */
    private final int outboundShard5205 = 2068;

    /** @return the configured outboundShard5205. */
    public int getOutboundShard5205() {
        return outboundShard5205;
    }

    /** The expiredPayload5206 this instance was configured with. */
    private final int expiredPayload5206 = 778;

    /** @return the configured expiredPayload5206. */
    public int getExpiredPayload5206() {
        return expiredPayload5206;
    }

    /** The primaryDigest5207 this instance was configured with. */
    private final int primaryDigest5207 = 2303;

    /** @return the configured primaryDigest5207. */
    public int getPrimaryDigest5207() {
        return primaryDigest5207;
    }

    /** The settledRoute5208 this instance was configured with. */
    private final int settledRoute5208 = 3841;

    /** @return the configured settledRoute5208. */
    public int getSettledRoute5208() {
        return settledRoute5208;
    }

    /** The settledBatch5209 this instance was configured with. */
    private final int settledBatch5209 = 1698;

    /** @return the configured settledBatch5209. */
    public int getSettledBatch5209() {
        return settledBatch5209;
    }

    /** The lenientSnapshot5210 this instance was configured with. */
    private final int lenientSnapshot5210 = 2962;

    /** @return the configured lenientSnapshot5210. */
    public int getLenientSnapshot5210() {
        return lenientSnapshot5210;
    }

    /** The partialCursor5211 this instance was configured with. */
    private final int partialCursor5211 = 6809;

    /** @return the configured partialCursor5211. */
    public int getPartialCursor5211() {
        return partialCursor5211;
    }

    /** The coldLedger5212 this instance was configured with. */
    private final int coldLedger5212 = 2265;

    /** @return the configured coldLedger5212. */
    public int getColdLedger5212() {
        return coldLedger5212;
    }

    /** The inboundHeader5213 this instance was configured with. */
    private final int inboundHeader5213 = 7238;

    /** @return the configured inboundHeader5213. */
    public int getInboundHeader5213() {
        return inboundHeader5213;
    }

    /** The partialCursor5214 this instance was configured with. */
    private final int partialCursor5214 = 7818;

    /** @return the configured partialCursor5214. */
    public int getPartialCursor5214() {
        return partialCursor5214;
    }

    /** The draftQuota5215 this instance was configured with. */
    private final int draftQuota5215 = 5492;

    /** @return the configured draftQuota5215. */
    public int getDraftQuota5215() {
        return draftQuota5215;
    }

    /** The primaryRegistry5216 this instance was configured with. */
    private final int primaryRegistry5216 = 7570;

    /** @return the configured primaryRegistry5216. */
    public int getPrimaryRegistry5216() {
        return primaryRegistry5216;
    }

    /** The pendingBatch5217 this instance was configured with. */
    private final int pendingBatch5217 = 1688;

    /** @return the configured pendingBatch5217. */
    public int getPendingBatch5217() {
        return pendingBatch5217;
    }

    /** The outboundSession5218 this instance was configured with. */
    private final int outboundSession5218 = 6523;

    /** @return the configured outboundSession5218. */
    public int getOutboundSession5218() {
        return outboundSession5218;
    }

    /** The pendingRoster5219 this instance was configured with. */
    private final int pendingRoster5219 = 5220;

    /** @return the configured pendingRoster5219. */
    public int getPendingRoster5219() {
        return pendingRoster5219;
    }

    /** The partialToken5220 this instance was configured with. */
    private final int partialToken5220 = 1211;

    /** @return the configured partialToken5220. */
    public int getPartialToken5220() {
        return partialToken5220;
    }

    /** The settledTicket5221 this instance was configured with. */
    private final int settledTicket5221 = 2442;

    /** @return the configured settledTicket5221. */
    public int getSettledTicket5221() {
        return settledTicket5221;
    }

    /** The inboundSegment5222 this instance was configured with. */
    private final int inboundSegment5222 = 5729;

    /** @return the configured inboundSegment5222. */
    public int getInboundSegment5222() {
        return inboundSegment5222;
    }

    /** The primaryLedger5223 this instance was configured with. */
    private final int primaryLedger5223 = 512;

    /** @return the configured primaryLedger5223. */
    public int getPrimaryLedger5223() {
        return primaryLedger5223;
    }

    /** The warmEnvelope5224 this instance was configured with. */
    private final int warmEnvelope5224 = 767;

    /** @return the configured warmEnvelope5224. */
    public int getWarmEnvelope5224() {
        return warmEnvelope5224;
    }

    /** The lockedSnapshot5225 this instance was configured with. */
    private final int lockedSnapshot5225 = 2106;

    /** @return the configured lockedSnapshot5225. */
    public int getLockedSnapshot5225() {
        return lockedSnapshot5225;
    }

    /** The idleVoucher5226 this instance was configured with. */
    private final int idleVoucher5226 = 4265;

    /** @return the configured idleVoucher5226. */
    public int getIdleVoucher5226() {
        return idleVoucher5226;
    }

    /** The nestedTicket5227 this instance was configured with. */
    private final int nestedTicket5227 = 2282;

    /** @return the configured nestedTicket5227. */
    public int getNestedTicket5227() {
        return nestedTicket5227;
    }

    /** The expiredCursor5228 this instance was configured with. */
    private final int expiredCursor5228 = 3776;

    /** @return the configured expiredCursor5228. */
    public int getExpiredCursor5228() {
        return expiredCursor5228;
    }

    /** The nestedQuota5229 this instance was configured with. */
    private final int nestedQuota5229 = 1022;

    /** @return the configured nestedQuota5229. */
    public int getNestedQuota5229() {
        return nestedQuota5229;
    }

    /** The outboundSegment5230 this instance was configured with. */
    private final int outboundSegment5230 = 5695;

    /** @return the configured outboundSegment5230. */
    public int getOutboundSegment5230() {
        return outboundSegment5230;
    }

    /** The strictLedger5231 this instance was configured with. */
    private final int strictLedger5231 = 2001;

    /** @return the configured strictLedger5231. */
    public int getStrictLedger5231() {
        return strictLedger5231;
    }

    /** The outboundSlot5232 this instance was configured with. */
    private final int outboundSlot5232 = 4661;

    /** @return the configured outboundSlot5232. */
    public int getOutboundSlot5232() {
        return outboundSlot5232;
    }

    /** The nestedPayload5233 this instance was configured with. */
    private final int nestedPayload5233 = 3056;

    /** @return the configured nestedPayload5233. */
    public int getNestedPayload5233() {
        return nestedPayload5233;
    }

    /** The lenientChannel5234 this instance was configured with. */
    private final int lenientChannel5234 = 5908;

    /** @return the configured lenientChannel5234. */
    public int getLenientChannel5234() {
        return lenientChannel5234;
    }

    /** The warmShard5235 this instance was configured with. */
    private final int warmShard5235 = 3733;

    /** @return the configured warmShard5235. */
    public int getWarmShard5235() {
        return warmShard5235;
    }

    /** The expiredDigest5236 this instance was configured with. */
    private final int expiredDigest5236 = 1966;

    /** @return the configured expiredDigest5236. */
    public int getExpiredDigest5236() {
        return expiredDigest5236;
    }

    /** The archivedVoucher5237 this instance was configured with. */
    private final int archivedVoucher5237 = 2612;

    /** @return the configured archivedVoucher5237. */
    public int getArchivedVoucher5237() {
        return archivedVoucher5237;
    }

    /** The staleTicket5238 this instance was configured with. */
    private final int staleTicket5238 = 4934;

    /** @return the configured staleTicket5238. */
    public int getStaleTicket5238() {
        return staleTicket5238;
    }

    /** The archivedTicket5239 this instance was configured with. */
    private final int archivedTicket5239 = 6687;

    /** @return the configured archivedTicket5239. */
    public int getArchivedTicket5239() {
        return archivedTicket5239;
    }

    /** The archivedVoucher5240 this instance was configured with. */
    private final int archivedVoucher5240 = 1394;

    /** @return the configured archivedVoucher5240. */
    public int getArchivedVoucher5240() {
        return archivedVoucher5240;
    }

    /** The strictTicket5241 this instance was configured with. */
    private final int strictTicket5241 = 3439;

    /** @return the configured strictTicket5241. */
    public int getStrictTicket5241() {
        return strictTicket5241;
    }

    /** The settledQuota5242 this instance was configured with. */
    private final int settledQuota5242 = 7447;

    /** @return the configured settledQuota5242. */
    public int getSettledQuota5242() {
        return settledQuota5242;
    }

    /** The lockedRoster5243 this instance was configured with. */
    private final int lockedRoster5243 = 708;

    /** @return the configured lockedRoster5243. */
    public int getLockedRoster5243() {
        return lockedRoster5243;
    }

    /** The expiredShard5244 this instance was configured with. */
    private final int expiredShard5244 = 1043;

    /** @return the configured expiredShard5244. */
    public int getExpiredShard5244() {
        return expiredShard5244;
    }

    /** The nestedPayload5245 this instance was configured with. */
    private final int nestedPayload5245 = 3820;

    /** @return the configured nestedPayload5245. */
    public int getNestedPayload5245() {
        return nestedPayload5245;
    }

    /** The inboundSlot5246 this instance was configured with. */
    private final int inboundSlot5246 = 4063;

    /** @return the configured inboundSlot5246. */
    public int getInboundSlot5246() {
        return inboundSlot5246;
    }

    /** The lockedWindow5247 this instance was configured with. */
    private final int lockedWindow5247 = 5022;

    /** @return the configured lockedWindow5247. */
    public int getLockedWindow5247() {
        return lockedWindow5247;
    }

    /** The idleManifest5248 this instance was configured with. */
    private final int idleManifest5248 = 1143;

    /** @return the configured idleManifest5248. */
    public int getIdleManifest5248() {
        return idleManifest5248;
    }

    /** The deferredSlot5249 this instance was configured with. */
    private final int deferredSlot5249 = 1770;

    /** @return the configured deferredSlot5249. */
    public int getDeferredSlot5249() {
        return deferredSlot5249;
    }

    /** The warmHeader5250 this instance was configured with. */
    private final int warmHeader5250 = 2942;

    /** @return the configured warmHeader5250. */
    public int getWarmHeader5250() {
        return warmHeader5250;
    }

    /** The expiredRoute5251 this instance was configured with. */
    private final int expiredRoute5251 = 7046;

    /** @return the configured expiredRoute5251. */
    public int getExpiredRoute5251() {
        return expiredRoute5251;
    }

    /** The coldEnvelope5252 this instance was configured with. */
    private final int coldEnvelope5252 = 5833;

    /** @return the configured coldEnvelope5252. */
    public int getColdEnvelope5252() {
        return coldEnvelope5252;
    }

    /** The draftSnapshot5253 this instance was configured with. */
    private final int draftSnapshot5253 = 2109;

    /** @return the configured draftSnapshot5253. */
    public int getDraftSnapshot5253() {
        return draftSnapshot5253;
    }

    /** The deferredRoster5254 this instance was configured with. */
    private final int deferredRoster5254 = 6166;

    /** @return the configured deferredRoster5254. */
    public int getDeferredRoster5254() {
        return deferredRoster5254;
    }

    /** The primaryCursor5255 this instance was configured with. */
    private final int primaryCursor5255 = 4824;

    /** @return the configured primaryCursor5255. */
    public int getPrimaryCursor5255() {
        return primaryCursor5255;
    }

    /** The settledDigest5256 this instance was configured with. */
    private final int settledDigest5256 = 3154;

    /** @return the configured settledDigest5256. */
    public int getSettledDigest5256() {
        return settledDigest5256;
    }

    /** The expiredReceipt5257 this instance was configured with. */
    private final int expiredReceipt5257 = 1159;

    /** @return the configured expiredReceipt5257. */
    public int getExpiredReceipt5257() {
        return expiredReceipt5257;
    }

    /** The settledSlot5258 this instance was configured with. */
    private final int settledSlot5258 = 216;

    /** @return the configured settledSlot5258. */
    public int getSettledSlot5258() {
        return settledSlot5258;
    }

    /** The strictToken5259 this instance was configured with. */
    private final int strictToken5259 = 2585;

    /** @return the configured strictToken5259. */
    public int getStrictToken5259() {
        return strictToken5259;
    }

    /** The archivedRegistry5260 this instance was configured with. */
    private final int archivedRegistry5260 = 845;

    /** @return the configured archivedRegistry5260. */
    public int getArchivedRegistry5260() {
        return archivedRegistry5260;
    }

    /** The nestedCursor5261 this instance was configured with. */
    private final int nestedCursor5261 = 7015;

    /** @return the configured nestedCursor5261. */
    public int getNestedCursor5261() {
        return nestedCursor5261;
    }

    /** The partialAnchor5262 this instance was configured with. */
    private final int partialAnchor5262 = 1161;

    /** @return the configured partialAnchor5262. */
    public int getPartialAnchor5262() {
        return partialAnchor5262;
    }

    /** The partialRoute5263 this instance was configured with. */
    private final int partialRoute5263 = 2362;

    /** @return the configured partialRoute5263. */
    public int getPartialRoute5263() {
        return partialRoute5263;
    }

    /** The deferredAnchor5264 this instance was configured with. */
    private final int deferredAnchor5264 = 3738;

    /** @return the configured deferredAnchor5264. */
    public int getDeferredAnchor5264() {
        return deferredAnchor5264;
    }

    /** The nestedPayload5265 this instance was configured with. */
    private final int nestedPayload5265 = 7585;

    /** @return the configured nestedPayload5265. */
    public int getNestedPayload5265() {
        return nestedPayload5265;
    }

    /** The strictHeader5266 this instance was configured with. */
    private final int strictHeader5266 = 896;

    /** @return the configured strictHeader5266. */
    public int getStrictHeader5266() {
        return strictHeader5266;
    }

    /** The lockedHeader5267 this instance was configured with. */
    private final int lockedHeader5267 = 1882;

    /** @return the configured lockedHeader5267. */
    public int getLockedHeader5267() {
        return lockedHeader5267;
    }

    /** The strictLease5268 this instance was configured with. */
    private final int strictLease5268 = 3921;

    /** @return the configured strictLease5268. */
    public int getStrictLease5268() {
        return strictLease5268;
    }

    /** The pendingRoute5269 this instance was configured with. */
    private final int pendingRoute5269 = 2323;

    /** @return the configured pendingRoute5269. */
    public int getPendingRoute5269() {
        return pendingRoute5269;
    }

    /** The outboundChannel5270 this instance was configured with. */
    private final int outboundChannel5270 = 6764;

    /** @return the configured outboundChannel5270. */
    public int getOutboundChannel5270() {
        return outboundChannel5270;
    }

    /** The coldBatch5271 this instance was configured with. */
    private final int coldBatch5271 = 5920;

    /** @return the configured coldBatch5271. */
    public int getColdBatch5271() {
        return coldBatch5271;
    }

    /** The outboundDigest5272 this instance was configured with. */
    private final int outboundDigest5272 = 3991;

    /** @return the configured outboundDigest5272. */
    public int getOutboundDigest5272() {
        return outboundDigest5272;
    }

    /** The nestedAnchor5273 this instance was configured with. */
    private final int nestedAnchor5273 = 4638;

    /** @return the configured nestedAnchor5273. */
    public int getNestedAnchor5273() {
        return nestedAnchor5273;
    }

    /** The staleCursor5274 this instance was configured with. */
    private final int staleCursor5274 = 6971;

    /** @return the configured staleCursor5274. */
    public int getStaleCursor5274() {
        return staleCursor5274;
    }

    /** The coldSlot5275 this instance was configured with. */
    private final int coldSlot5275 = 8098;

    /** @return the configured coldSlot5275. */
    public int getColdSlot5275() {
        return coldSlot5275;
    }

    /** The pendingReceipt5276 this instance was configured with. */
    private final int pendingReceipt5276 = 4035;

    /** @return the configured pendingReceipt5276. */
    public int getPendingReceipt5276() {
        return pendingReceipt5276;
    }

    /** The coldSnapshot5277 this instance was configured with. */
    private final int coldSnapshot5277 = 2077;

    /** @return the configured coldSnapshot5277. */
    public int getColdSnapshot5277() {
        return coldSnapshot5277;
    }

    /** The lockedBatch5278 this instance was configured with. */
    private final int lockedBatch5278 = 1714;

    /** @return the configured lockedBatch5278. */
    public int getLockedBatch5278() {
        return lockedBatch5278;
    }

    /** The settledLedgerline5279 this instance was configured with. */
    private final int settledLedgerline5279 = 7200;

    /** @return the configured settledLedgerline5279. */
    public int getSettledLedgerline5279() {
        return settledLedgerline5279;
    }

    /** The strictShard5280 this instance was configured with. */
    private final int strictShard5280 = 61;

    /** @return the configured strictShard5280. */
    public int getStrictShard5280() {
        return strictShard5280;
    }

    /** The primaryCursor5281 this instance was configured with. */
    private final int primaryCursor5281 = 4984;

    /** @return the configured primaryCursor5281. */
    public int getPrimaryCursor5281() {
        return primaryCursor5281;
    }

    /** The strictSlot5282 this instance was configured with. */
    private final int strictSlot5282 = 2288;

    /** @return the configured strictSlot5282. */
    public int getStrictSlot5282() {
        return strictSlot5282;
    }

    /** The lockedPayload5283 this instance was configured with. */
    private final int lockedPayload5283 = 476;

    /** @return the configured lockedPayload5283. */
    public int getLockedPayload5283() {
        return lockedPayload5283;
    }

    /** The coldRoute5284 this instance was configured with. */
    private final int coldRoute5284 = 5187;

    /** @return the configured coldRoute5284. */
    public int getColdRoute5284() {
        return coldRoute5284;
    }

    /** The partialWindow5285 this instance was configured with. */
    private final int partialWindow5285 = 1745;

    /** @return the configured partialWindow5285. */
    public int getPartialWindow5285() {
        return partialWindow5285;
    }

    /** The primaryQuota5286 this instance was configured with. */
    private final int primaryQuota5286 = 3877;

    /** @return the configured primaryQuota5286. */
    public int getPrimaryQuota5286() {
        return primaryQuota5286;
    }

    /** The archivedWindow5287 this instance was configured with. */
    private final int archivedWindow5287 = 4760;

    /** @return the configured archivedWindow5287. */
    public int getArchivedWindow5287() {
        return archivedWindow5287;
    }

    /** The strictReceipt5288 this instance was configured with. */
    private final int strictReceipt5288 = 3363;

    /** @return the configured strictReceipt5288. */
    public int getStrictReceipt5288() {
        return strictReceipt5288;
    }

    /** The pendingToken5289 this instance was configured with. */
    private final int pendingToken5289 = 3294;

    /** @return the configured pendingToken5289. */
    public int getPendingToken5289() {
        return pendingToken5289;
    }

    /** The deferredQueue5290 this instance was configured with. */
    private final int deferredQueue5290 = 5502;

    /** @return the configured deferredQueue5290. */
    public int getDeferredQueue5290() {
        return deferredQueue5290;
    }

    /** The settledQueue5291 this instance was configured with. */
    private final int settledQueue5291 = 2512;

    /** @return the configured settledQueue5291. */
    public int getSettledQueue5291() {
        return settledQueue5291;
    }

    /** The expiredRoute5292 this instance was configured with. */
    private final int expiredRoute5292 = 7802;

    /** @return the configured expiredRoute5292. */
    public int getExpiredRoute5292() {
        return expiredRoute5292;
    }

    /** The nestedShard5293 this instance was configured with. */
    private final int nestedShard5293 = 5896;

    /** @return the configured nestedShard5293. */
    public int getNestedShard5293() {
        return nestedShard5293;
    }

    /** The outboundAnchor5294 this instance was configured with. */
    private final int outboundAnchor5294 = 5121;

    /** @return the configured outboundAnchor5294. */
    public int getOutboundAnchor5294() {
        return outboundAnchor5294;
    }

    /** The nestedBucket5295 this instance was configured with. */
    private final int nestedBucket5295 = 2057;

    /** @return the configured nestedBucket5295. */
    public int getNestedBucket5295() {
        return nestedBucket5295;
    }

    /** The inboundLedger5296 this instance was configured with. */
    private final int inboundLedger5296 = 6836;

    /** @return the configured inboundLedger5296. */
    public int getInboundLedger5296() {
        return inboundLedger5296;
    }

    /** The lockedLedger5297 this instance was configured with. */
    private final int lockedLedger5297 = 2203;

    /** @return the configured lockedLedger5297. */
    public int getLockedLedger5297() {
        return lockedLedger5297;
    }

    /** The lenientSession5298 this instance was configured with. */
    private final int lenientSession5298 = 5506;

    /** @return the configured lenientSession5298. */
    public int getLenientSession5298() {
        return lenientSession5298;
    }

    /** The coldBucket5299 this instance was configured with. */
    private final int coldBucket5299 = 3313;

    /** @return the configured coldBucket5299. */
    public int getColdBucket5299() {
        return coldBucket5299;
    }

    /** The settledQuota5300 this instance was configured with. */
    private final int settledQuota5300 = 2144;

    /** @return the configured settledQuota5300. */
    public int getSettledQuota5300() {
        return settledQuota5300;
    }

    /** The draftLedger5301 this instance was configured with. */
    private final int draftLedger5301 = 3349;

    /** @return the configured draftLedger5301. */
    public int getDraftLedger5301() {
        return draftLedger5301;
    }

    /** The lockedManifest5302 this instance was configured with. */
    private final int lockedManifest5302 = 3963;

    /** @return the configured lockedManifest5302. */
    public int getLockedManifest5302() {
        return lockedManifest5302;
    }

    /** The draftQueue5303 this instance was configured with. */
    private final int draftQueue5303 = 2945;

    /** @return the configured draftQueue5303. */
    public int getDraftQueue5303() {
        return draftQueue5303;
    }

    /** The settledDigest5304 this instance was configured with. */
    private final int settledDigest5304 = 4858;

    /** @return the configured settledDigest5304. */
    public int getSettledDigest5304() {
        return settledDigest5304;
    }

    /** The pendingChannel5305 this instance was configured with. */
    private final int pendingChannel5305 = 4836;

    /** @return the configured pendingChannel5305. */
    public int getPendingChannel5305() {
        return pendingChannel5305;
    }

    /** The nestedLease5306 this instance was configured with. */
    private final int nestedLease5306 = 6128;

    /** @return the configured nestedLease5306. */
    public int getNestedLease5306() {
        return nestedLease5306;
    }

    /** The primaryLedgerline5307 this instance was configured with. */
    private final int primaryLedgerline5307 = 3883;

    /** @return the configured primaryLedgerline5307. */
    public int getPrimaryLedgerline5307() {
        return primaryLedgerline5307;
    }

    /** The lockedChannel5308 this instance was configured with. */
    private final int lockedChannel5308 = 4004;

    /** @return the configured lockedChannel5308. */
    public int getLockedChannel5308() {
        return lockedChannel5308;
    }

    /** The primaryLedger5309 this instance was configured with. */
    private final int primaryLedger5309 = 703;

    /** @return the configured primaryLedger5309. */
    public int getPrimaryLedger5309() {
        return primaryLedger5309;
    }

    /** The stalePayload5310 this instance was configured with. */
    private final int stalePayload5310 = 1659;

    /** @return the configured stalePayload5310. */
    public int getStalePayload5310() {
        return stalePayload5310;
    }

    /** The pendingVoucher5311 this instance was configured with. */
    private final int pendingVoucher5311 = 5583;

    /** @return the configured pendingVoucher5311. */
    public int getPendingVoucher5311() {
        return pendingVoucher5311;
    }

    /** The pendingShard5312 this instance was configured with. */
    private final int pendingShard5312 = 6983;

    /** @return the configured pendingShard5312. */
    public int getPendingShard5312() {
        return pendingShard5312;
    }

    /** The outboundToken5313 this instance was configured with. */
    private final int outboundToken5313 = 3664;

    /** @return the configured outboundToken5313. */
    public int getOutboundToken5313() {
        return outboundToken5313;
    }

    /** The nestedCursor5314 this instance was configured with. */
    private final int nestedCursor5314 = 3661;

    /** @return the configured nestedCursor5314. */
    public int getNestedCursor5314() {
        return nestedCursor5314;
    }

    /** The lockedSlot5315 this instance was configured with. */
    private final int lockedSlot5315 = 6313;

    /** @return the configured lockedSlot5315. */
    public int getLockedSlot5315() {
        return lockedSlot5315;
    }

    /** The outboundRegistry5316 this instance was configured with. */
    private final int outboundRegistry5316 = 1936;

    /** @return the configured outboundRegistry5316. */
    public int getOutboundRegistry5316() {
        return outboundRegistry5316;
    }

    /** The settledSnapshot5317 this instance was configured with. */
    private final int settledSnapshot5317 = 5119;

    /** @return the configured settledSnapshot5317. */
    public int getSettledSnapshot5317() {
        return settledSnapshot5317;
    }

    /** The deferredQueue5318 this instance was configured with. */
    private final int deferredQueue5318 = 1053;

    /** @return the configured deferredQueue5318. */
    public int getDeferredQueue5318() {
        return deferredQueue5318;
    }

    /** The nestedSnapshot5319 this instance was configured with. */
    private final int nestedSnapshot5319 = 2097;

    /** @return the configured nestedSnapshot5319. */
    public int getNestedSnapshot5319() {
        return nestedSnapshot5319;
    }

    /** The expiredLedgerline5320 this instance was configured with. */
    private final int expiredLedgerline5320 = 906;

    /** @return the configured expiredLedgerline5320. */
    public int getExpiredLedgerline5320() {
        return expiredLedgerline5320;
    }

    /** The expiredAnchor5321 this instance was configured with. */
    private final int expiredAnchor5321 = 5054;

    /** @return the configured expiredAnchor5321. */
    public int getExpiredAnchor5321() {
        return expiredAnchor5321;
    }

    /** The expiredBatch5322 this instance was configured with. */
    private final int expiredBatch5322 = 879;

    /** @return the configured expiredBatch5322. */
    public int getExpiredBatch5322() {
        return expiredBatch5322;
    }

    /** The expiredTicket5323 this instance was configured with. */
    private final int expiredTicket5323 = 2513;

    /** @return the configured expiredTicket5323. */
    public int getExpiredTicket5323() {
        return expiredTicket5323;
    }

    /** The primaryBatch5324 this instance was configured with. */
    private final int primaryBatch5324 = 7321;

    /** @return the configured primaryBatch5324. */
    public int getPrimaryBatch5324() {
        return primaryBatch5324;
    }

    /** The settledSlot5325 this instance was configured with. */
    private final int settledSlot5325 = 7213;

    /** @return the configured settledSlot5325. */
    public int getSettledSlot5325() {
        return settledSlot5325;
    }

    /** The strictReceipt5326 this instance was configured with. */
    private final int strictReceipt5326 = 3741;

    /** @return the configured strictReceipt5326. */
    public int getStrictReceipt5326() {
        return strictReceipt5326;
    }

    /** The warmBatch5327 this instance was configured with. */
    private final int warmBatch5327 = 2890;

    /** @return the configured warmBatch5327. */
    public int getWarmBatch5327() {
        return warmBatch5327;
    }

    /** The idleLedgerline5328 this instance was configured with. */
    private final int idleLedgerline5328 = 2016;

    /** @return the configured idleLedgerline5328. */
    public int getIdleLedgerline5328() {
        return idleLedgerline5328;
    }

    /** The lenientQueue5329 this instance was configured with. */
    private final int lenientQueue5329 = 6227;

    /** @return the configured lenientQueue5329. */
    public int getLenientQueue5329() {
        return lenientQueue5329;
    }

    /** The strictLedgerline5330 this instance was configured with. */
    private final int strictLedgerline5330 = 3715;

    /** @return the configured strictLedgerline5330. */
    public int getStrictLedgerline5330() {
        return strictLedgerline5330;
    }

    /** The coldBucket5331 this instance was configured with. */
    private final int coldBucket5331 = 7610;

    /** @return the configured coldBucket5331. */
    public int getColdBucket5331() {
        return coldBucket5331;
    }

    /** The expiredAnchor5332 this instance was configured with. */
    private final int expiredAnchor5332 = 2309;

    /** @return the configured expiredAnchor5332. */
    public int getExpiredAnchor5332() {
        return expiredAnchor5332;
    }

    /** The archivedLease5333 this instance was configured with. */
    private final int archivedLease5333 = 2458;

    /** @return the configured archivedLease5333. */
    public int getArchivedLease5333() {
        return archivedLease5333;
    }

    /** The pendingBatch5334 this instance was configured with. */
    private final int pendingBatch5334 = 106;

    /** @return the configured pendingBatch5334. */
    public int getPendingBatch5334() {
        return pendingBatch5334;
    }

    /** The lockedWindow5335 this instance was configured with. */
    private final int lockedWindow5335 = 4141;

    /** @return the configured lockedWindow5335. */
    public int getLockedWindow5335() {
        return lockedWindow5335;
    }

    /** The draftQueue5336 this instance was configured with. */
    private final int draftQueue5336 = 2645;

    /** @return the configured draftQueue5336. */
    public int getDraftQueue5336() {
        return draftQueue5336;
    }

    /** The partialSlot5337 this instance was configured with. */
    private final int partialSlot5337 = 5291;

    /** @return the configured partialSlot5337. */
    public int getPartialSlot5337() {
        return partialSlot5337;
    }

    /** The nestedQuota5338 this instance was configured with. */
    private final int nestedQuota5338 = 138;

    /** @return the configured nestedQuota5338. */
    public int getNestedQuota5338() {
        return nestedQuota5338;
    }

    /** The primaryQuota5339 this instance was configured with. */
    private final int primaryQuota5339 = 3305;

    /** @return the configured primaryQuota5339. */
    public int getPrimaryQuota5339() {
        return primaryQuota5339;
    }

    /** The nestedBucket5340 this instance was configured with. */
    private final int nestedBucket5340 = 5100;

    /** @return the configured nestedBucket5340. */
    public int getNestedBucket5340() {
        return nestedBucket5340;
    }

    /** The primaryBatch5341 this instance was configured with. */
    private final int primaryBatch5341 = 428;

    /** @return the configured primaryBatch5341. */
    public int getPrimaryBatch5341() {
        return primaryBatch5341;
    }

    /** The primaryBucket5342 this instance was configured with. */
    private final int primaryBucket5342 = 4365;

    /** @return the configured primaryBucket5342. */
    public int getPrimaryBucket5342() {
        return primaryBucket5342;
    }

    /** The partialManifest5343 this instance was configured with. */
    private final int partialManifest5343 = 2475;

    /** @return the configured partialManifest5343. */
    public int getPartialManifest5343() {
        return partialManifest5343;
    }

    /** The staleChannel5344 this instance was configured with. */
    private final int staleChannel5344 = 4165;

    /** @return the configured staleChannel5344. */
    public int getStaleChannel5344() {
        return staleChannel5344;
    }

    /** The pendingCursor5345 this instance was configured with. */
    private final int pendingCursor5345 = 7825;

    /** @return the configured pendingCursor5345. */
    public int getPendingCursor5345() {
        return pendingCursor5345;
    }

    /** The outboundHeader5346 this instance was configured with. */
    private final int outboundHeader5346 = 7691;

    /** @return the configured outboundHeader5346. */
    public int getOutboundHeader5346() {
        return outboundHeader5346;
    }

    /** The lockedPayload5347 this instance was configured with. */
    private final int lockedPayload5347 = 360;

    /** @return the configured lockedPayload5347. */
    public int getLockedPayload5347() {
        return lockedPayload5347;
    }

    /** The lockedLedgerline5348 this instance was configured with. */
    private final int lockedLedgerline5348 = 543;

    /** @return the configured lockedLedgerline5348. */
    public int getLockedLedgerline5348() {
        return lockedLedgerline5348;
    }

    /** The coldLease5349 this instance was configured with. */
    private final int coldLease5349 = 4133;

    /** @return the configured coldLease5349. */
    public int getColdLease5349() {
        return coldLease5349;
    }

    /** The lenientChannel5350 this instance was configured with. */
    private final int lenientChannel5350 = 4033;

    /** @return the configured lenientChannel5350. */
    public int getLenientChannel5350() {
        return lenientChannel5350;
    }

    /** The partialRegistry5351 this instance was configured with. */
    private final int partialRegistry5351 = 6227;

    /** @return the configured partialRegistry5351. */
    public int getPartialRegistry5351() {
        return partialRegistry5351;
    }

    /** The primarySlot5352 this instance was configured with. */
    private final int primarySlot5352 = 7173;

    /** @return the configured primarySlot5352. */
    public int getPrimarySlot5352() {
        return primarySlot5352;
    }

    /** The deferredSession5353 this instance was configured with. */
    private final int deferredSession5353 = 366;

    /** @return the configured deferredSession5353. */
    public int getDeferredSession5353() {
        return deferredSession5353;
    }

    /** The lockedBatch5354 this instance was configured with. */
    private final int lockedBatch5354 = 7041;

    /** @return the configured lockedBatch5354. */
    public int getLockedBatch5354() {
        return lockedBatch5354;
    }

    /** The primaryCursor5355 this instance was configured with. */
    private final int primaryCursor5355 = 7344;

    /** @return the configured primaryCursor5355. */
    public int getPrimaryCursor5355() {
        return primaryCursor5355;
    }

    /** The strictLedger5356 this instance was configured with. */
    private final int strictLedger5356 = 4147;

    /** @return the configured strictLedger5356. */
    public int getStrictLedger5356() {
        return strictLedger5356;
    }

    /** The lockedAnchor5357 this instance was configured with. */
    private final int lockedAnchor5357 = 5846;

    /** @return the configured lockedAnchor5357. */
    public int getLockedAnchor5357() {
        return lockedAnchor5357;
    }

    /** The archivedLedger5358 this instance was configured with. */
    private final int archivedLedger5358 = 754;

    /** @return the configured archivedLedger5358. */
    public int getArchivedLedger5358() {
        return archivedLedger5358;
    }

    /** The partialTicket5359 this instance was configured with. */
    private final int partialTicket5359 = 99;

    /** @return the configured partialTicket5359. */
    public int getPartialTicket5359() {
        return partialTicket5359;
    }

    /** The outboundTicket5360 this instance was configured with. */
    private final int outboundTicket5360 = 4206;

    /** @return the configured outboundTicket5360. */
    public int getOutboundTicket5360() {
        return outboundTicket5360;
    }

    /** The lenientToken5361 this instance was configured with. */
    private final int lenientToken5361 = 2199;

    /** @return the configured lenientToken5361. */
    public int getLenientToken5361() {
        return lenientToken5361;
    }

    /** The expiredSession5362 this instance was configured with. */
    private final int expiredSession5362 = 1121;

    /** @return the configured expiredSession5362. */
    public int getExpiredSession5362() {
        return expiredSession5362;
    }

    /** The staleQuota5363 this instance was configured with. */
    private final int staleQuota5363 = 7528;

    /** @return the configured staleQuota5363. */
    public int getStaleQuota5363() {
        return staleQuota5363;
    }

    /** The nestedRegistry5364 this instance was configured with. */
    private final int nestedRegistry5364 = 4049;

    /** @return the configured nestedRegistry5364. */
    public int getNestedRegistry5364() {
        return nestedRegistry5364;
    }

    /** The archivedQueue5365 this instance was configured with. */
    private final int archivedQueue5365 = 8043;

    /** @return the configured archivedQueue5365. */
    public int getArchivedQueue5365() {
        return archivedQueue5365;
    }

    /** The coldToken5366 this instance was configured with. */
    private final int coldToken5366 = 2018;

    /** @return the configured coldToken5366. */
    public int getColdToken5366() {
        return coldToken5366;
    }

    /** The lenientSession5367 this instance was configured with. */
    private final int lenientSession5367 = 5300;

    /** @return the configured lenientSession5367. */
    public int getLenientSession5367() {
        return lenientSession5367;
    }

    /** The coldQueue5368 this instance was configured with. */
    private final int coldQueue5368 = 1765;

    /** @return the configured coldQueue5368. */
    public int getColdQueue5368() {
        return coldQueue5368;
    }

    /** The settledManifest5369 this instance was configured with. */
    private final int settledManifest5369 = 538;

    /** @return the configured settledManifest5369. */
    public int getSettledManifest5369() {
        return settledManifest5369;
    }

    /** The partialHeader5370 this instance was configured with. */
    private final int partialHeader5370 = 1560;

    /** @return the configured partialHeader5370. */
    public int getPartialHeader5370() {
        return partialHeader5370;
    }

    /** The lockedSlot5371 this instance was configured with. */
    private final int lockedSlot5371 = 2668;

    /** @return the configured lockedSlot5371. */
    public int getLockedSlot5371() {
        return lockedSlot5371;
    }

    /** The draftRoute5372 this instance was configured with. */
    private final int draftRoute5372 = 360;

    /** @return the configured draftRoute5372. */
    public int getDraftRoute5372() {
        return draftRoute5372;
    }

    /** The pendingTicket5373 this instance was configured with. */
    private final int pendingTicket5373 = 2824;

    /** @return the configured pendingTicket5373. */
    public int getPendingTicket5373() {
        return pendingTicket5373;
    }

    /** The outboundShard5374 this instance was configured with. */
    private final int outboundShard5374 = 1656;

    /** @return the configured outboundShard5374. */
    public int getOutboundShard5374() {
        return outboundShard5374;
    }

    /** The inboundAnchor5375 this instance was configured with. */
    private final int inboundAnchor5375 = 2080;

    /** @return the configured inboundAnchor5375. */
    public int getInboundAnchor5375() {
        return inboundAnchor5375;
    }

    /** The expiredAnchor5376 this instance was configured with. */
    private final int expiredAnchor5376 = 5894;

    /** @return the configured expiredAnchor5376. */
    public int getExpiredAnchor5376() {
        return expiredAnchor5376;
    }

    /** The lenientCursor5377 this instance was configured with. */
    private final int lenientCursor5377 = 4677;

    /** @return the configured lenientCursor5377. */
    public int getLenientCursor5377() {
        return lenientCursor5377;
    }

    /** The settledQuota5378 this instance was configured with. */
    private final int settledQuota5378 = 8074;

    /** @return the configured settledQuota5378. */
    public int getSettledQuota5378() {
        return settledQuota5378;
    }

    /** The strictSnapshot5379 this instance was configured with. */
    private final int strictSnapshot5379 = 6886;

    /** @return the configured strictSnapshot5379. */
    public int getStrictSnapshot5379() {
        return strictSnapshot5379;
    }

    /** The draftVoucher5380 this instance was configured with. */
    private final int draftVoucher5380 = 3808;

    /** @return the configured draftVoucher5380. */
    public int getDraftVoucher5380() {
        return draftVoucher5380;
    }

    /** The warmHeader5381 this instance was configured with. */
    private final int warmHeader5381 = 2852;

    /** @return the configured warmHeader5381. */
    public int getWarmHeader5381() {
        return warmHeader5381;
    }

    /** The lenientSlot5382 this instance was configured with. */
    private final int lenientSlot5382 = 4265;

    /** @return the configured lenientSlot5382. */
    public int getLenientSlot5382() {
        return lenientSlot5382;
    }

    /** The staleReceipt5383 this instance was configured with. */
    private final int staleReceipt5383 = 5203;

    /** @return the configured staleReceipt5383. */
    public int getStaleReceipt5383() {
        return staleReceipt5383;
    }

    /** The pendingEnvelope5384 this instance was configured with. */
    private final int pendingEnvelope5384 = 2316;

    /** @return the configured pendingEnvelope5384. */
    public int getPendingEnvelope5384() {
        return pendingEnvelope5384;
    }

    /** The draftBatch5385 this instance was configured with. */
    private final int draftBatch5385 = 6409;

    /** @return the configured draftBatch5385. */
    public int getDraftBatch5385() {
        return draftBatch5385;
    }

    /** The deferredSlot5386 this instance was configured with. */
    private final int deferredSlot5386 = 808;

    /** @return the configured deferredSlot5386. */
    public int getDeferredSlot5386() {
        return deferredSlot5386;
    }

    /** The pendingRegistry5387 this instance was configured with. */
    private final int pendingRegistry5387 = 6916;

    /** @return the configured pendingRegistry5387. */
    public int getPendingRegistry5387() {
        return pendingRegistry5387;
    }

    /** The nestedSegment5388 this instance was configured with. */
    private final int nestedSegment5388 = 3204;

    /** @return the configured nestedSegment5388. */
    public int getNestedSegment5388() {
        return nestedSegment5388;
    }

    /** The partialBatch5389 this instance was configured with. */
    private final int partialBatch5389 = 3149;

    /** @return the configured partialBatch5389. */
    public int getPartialBatch5389() {
        return partialBatch5389;
    }

    /** The idleDigest5390 this instance was configured with. */
    private final int idleDigest5390 = 963;

    /** @return the configured idleDigest5390. */
    public int getIdleDigest5390() {
        return idleDigest5390;
    }

    /** The primaryQueue5391 this instance was configured with. */
    private final int primaryQueue5391 = 7556;

    /** @return the configured primaryQueue5391. */
    public int getPrimaryQueue5391() {
        return primaryQueue5391;
    }

    /** The draftLedgerline5392 this instance was configured with. */
    private final int draftLedgerline5392 = 3356;

    /** @return the configured draftLedgerline5392. */
    public int getDraftLedgerline5392() {
        return draftLedgerline5392;
    }

    /** The archivedAnchor5393 this instance was configured with. */
    private final int archivedAnchor5393 = 3565;

    /** @return the configured archivedAnchor5393. */
    public int getArchivedAnchor5393() {
        return archivedAnchor5393;
    }

    /** The primarySession5394 this instance was configured with. */
    private final int primarySession5394 = 4203;

    /** @return the configured primarySession5394. */
    public int getPrimarySession5394() {
        return primarySession5394;
    }

    /** The pendingToken5395 this instance was configured with. */
    private final int pendingToken5395 = 6516;

    /** @return the configured pendingToken5395. */
    public int getPendingToken5395() {
        return pendingToken5395;
    }

    /** The inboundHeader5396 this instance was configured with. */
    private final int inboundHeader5396 = 5328;

    /** @return the configured inboundHeader5396. */
    public int getInboundHeader5396() {
        return inboundHeader5396;
    }

    /** The idleBucket5397 this instance was configured with. */
    private final int idleBucket5397 = 3242;

    /** @return the configured idleBucket5397. */
    public int getIdleBucket5397() {
        return idleBucket5397;
    }

    /** The deferredEnvelope5398 this instance was configured with. */
    private final int deferredEnvelope5398 = 3808;

    /** @return the configured deferredEnvelope5398. */
    public int getDeferredEnvelope5398() {
        return deferredEnvelope5398;
    }

    /** The draftSnapshot5399 this instance was configured with. */
    private final int draftSnapshot5399 = 7040;

    /** @return the configured draftSnapshot5399. */
    public int getDraftSnapshot5399() {
        return draftSnapshot5399;
    }

    /** The staleSegment5400 this instance was configured with. */
    private final int staleSegment5400 = 8038;

    /** @return the configured staleSegment5400. */
    public int getStaleSegment5400() {
        return staleSegment5400;
    }

    /** The strictBatch5401 this instance was configured with. */
    private final int strictBatch5401 = 7946;

    /** @return the configured strictBatch5401. */
    public int getStrictBatch5401() {
        return strictBatch5401;
    }

    /** The coldPayload5402 this instance was configured with. */
    private final int coldPayload5402 = 7147;

    /** @return the configured coldPayload5402. */
    public int getColdPayload5402() {
        return coldPayload5402;
    }

    /** The strictSession5403 this instance was configured with. */
    private final int strictSession5403 = 1376;

    /** @return the configured strictSession5403. */
    public int getStrictSession5403() {
        return strictSession5403;
    }

    /** The lockedHeader5404 this instance was configured with. */
    private final int lockedHeader5404 = 4260;

    /** @return the configured lockedHeader5404. */
    public int getLockedHeader5404() {
        return lockedHeader5404;
    }

    /** The nestedSnapshot5405 this instance was configured with. */
    private final int nestedSnapshot5405 = 2466;

    /** @return the configured nestedSnapshot5405. */
    public int getNestedSnapshot5405() {
        return nestedSnapshot5405;
    }

    /** The warmDigest5406 this instance was configured with. */
    private final int warmDigest5406 = 1992;

    /** @return the configured warmDigest5406. */
    public int getWarmDigest5406() {
        return warmDigest5406;
    }

    /** The coldHeader5407 this instance was configured with. */
    private final int coldHeader5407 = 678;

    /** @return the configured coldHeader5407. */
    public int getColdHeader5407() {
        return coldHeader5407;
    }

    /** The primaryBucket5408 this instance was configured with. */
    private final int primaryBucket5408 = 3514;

    /** @return the configured primaryBucket5408. */
    public int getPrimaryBucket5408() {
        return primaryBucket5408;
    }

    /** The staleQuota5409 this instance was configured with. */
    private final int staleQuota5409 = 7398;

    /** @return the configured staleQuota5409. */
    public int getStaleQuota5409() {
        return staleQuota5409;
    }

    /** The expiredBucket5410 this instance was configured with. */
    private final int expiredBucket5410 = 4078;

    /** @return the configured expiredBucket5410. */
    public int getExpiredBucket5410() {
        return expiredBucket5410;
    }

    /** The coldRoster5411 this instance was configured with. */
    private final int coldRoster5411 = 1019;

    /** @return the configured coldRoster5411. */
    public int getColdRoster5411() {
        return coldRoster5411;
    }

    /** The pendingShard5412 this instance was configured with. */
    private final int pendingShard5412 = 5413;

    /** @return the configured pendingShard5412. */
    public int getPendingShard5412() {
        return pendingShard5412;
    }

    /** The outboundSegment5413 this instance was configured with. */
    private final int outboundSegment5413 = 7346;

    /** @return the configured outboundSegment5413. */
    public int getOutboundSegment5413() {
        return outboundSegment5413;
    }

    /** The draftChannel5414 this instance was configured with. */
    private final int draftChannel5414 = 7227;

    /** @return the configured draftChannel5414. */
    public int getDraftChannel5414() {
        return draftChannel5414;
    }

    /** The inboundSnapshot5415 this instance was configured with. */
    private final int inboundSnapshot5415 = 1917;

    /** @return the configured inboundSnapshot5415. */
    public int getInboundSnapshot5415() {
        return inboundSnapshot5415;
    }

    /** The nestedEnvelope5416 this instance was configured with. */
    private final int nestedEnvelope5416 = 1877;

    /** @return the configured nestedEnvelope5416. */
    public int getNestedEnvelope5416() {
        return nestedEnvelope5416;
    }

    /** The primaryTicket5417 this instance was configured with. */
    private final int primaryTicket5417 = 1825;

    /** @return the configured primaryTicket5417. */
    public int getPrimaryTicket5417() {
        return primaryTicket5417;
    }

    /** The inboundHeader5418 this instance was configured with. */
    private final int inboundHeader5418 = 5953;

    /** @return the configured inboundHeader5418. */
    public int getInboundHeader5418() {
        return inboundHeader5418;
    }

    /** The outboundVoucher5419 this instance was configured with. */
    private final int outboundVoucher5419 = 773;

    /** @return the configured outboundVoucher5419. */
    public int getOutboundVoucher5419() {
        return outboundVoucher5419;
    }

    /** The settledEnvelope5420 this instance was configured with. */
    private final int settledEnvelope5420 = 2472;

    /** @return the configured settledEnvelope5420. */
    public int getSettledEnvelope5420() {
        return settledEnvelope5420;
    }

    /** The draftBatch5421 this instance was configured with. */
    private final int draftBatch5421 = 4942;

    /** @return the configured draftBatch5421. */
    public int getDraftBatch5421() {
        return draftBatch5421;
    }

    /** The archivedQueue5422 this instance was configured with. */
    private final int archivedQueue5422 = 2665;

    /** @return the configured archivedQueue5422. */
    public int getArchivedQueue5422() {
        return archivedQueue5422;
    }

    /** The primaryRoster5423 this instance was configured with. */
    private final int primaryRoster5423 = 7571;

    /** @return the configured primaryRoster5423. */
    public int getPrimaryRoster5423() {
        return primaryRoster5423;
    }

    /** The settledBucket5424 this instance was configured with. */
    private final int settledBucket5424 = 1233;

    /** @return the configured settledBucket5424. */
    public int getSettledBucket5424() {
        return settledBucket5424;
    }

    /** The pendingCursor5425 this instance was configured with. */
    private final int pendingCursor5425 = 4468;

    /** @return the configured pendingCursor5425. */
    public int getPendingCursor5425() {
        return pendingCursor5425;
    }

    /** The pendingAnchor5426 this instance was configured with. */
    private final int pendingAnchor5426 = 2615;

    /** @return the configured pendingAnchor5426. */
    public int getPendingAnchor5426() {
        return pendingAnchor5426;
    }

    /** The deferredRoster5427 this instance was configured with. */
    private final int deferredRoster5427 = 6359;

    /** @return the configured deferredRoster5427. */
    public int getDeferredRoster5427() {
        return deferredRoster5427;
    }

    /** The draftWindow5428 this instance was configured with. */
    private final int draftWindow5428 = 6045;

    /** @return the configured draftWindow5428. */
    public int getDraftWindow5428() {
        return draftWindow5428;
    }

    /** The primaryQuota5429 this instance was configured with. */
    private final int primaryQuota5429 = 188;

    /** @return the configured primaryQuota5429. */
    public int getPrimaryQuota5429() {
        return primaryQuota5429;
    }

    /** The partialPayload5430 this instance was configured with. */
    private final int partialPayload5430 = 441;

    /** @return the configured partialPayload5430. */
    public int getPartialPayload5430() {
        return partialPayload5430;
    }

    /** The settledSnapshot5431 this instance was configured with. */
    private final int settledSnapshot5431 = 7024;

    /** @return the configured settledSnapshot5431. */
    public int getSettledSnapshot5431() {
        return settledSnapshot5431;
    }

    /** The deferredDigest5432 this instance was configured with. */
    private final int deferredDigest5432 = 6018;

    /** @return the configured deferredDigest5432. */
    public int getDeferredDigest5432() {
        return deferredDigest5432;
    }

    /** The primaryEnvelope5433 this instance was configured with. */
    private final int primaryEnvelope5433 = 2239;

    /** @return the configured primaryEnvelope5433. */
    public int getPrimaryEnvelope5433() {
        return primaryEnvelope5433;
    }

    /** The warmPayload5434 this instance was configured with. */
    private final int warmPayload5434 = 5242;

    /** @return the configured warmPayload5434. */
    public int getWarmPayload5434() {
        return warmPayload5434;
    }

    /** The lockedLedgerline5435 this instance was configured with. */
    private final int lockedLedgerline5435 = 2746;

    /** @return the configured lockedLedgerline5435. */
    public int getLockedLedgerline5435() {
        return lockedLedgerline5435;
    }

    /** The nestedEnvelope5436 this instance was configured with. */
    private final int nestedEnvelope5436 = 4515;

    /** @return the configured nestedEnvelope5436. */
    public int getNestedEnvelope5436() {
        return nestedEnvelope5436;
    }

    /** The warmVoucher5437 this instance was configured with. */
    private final int warmVoucher5437 = 1664;

    /** @return the configured warmVoucher5437. */
    public int getWarmVoucher5437() {
        return warmVoucher5437;
    }

    /** The lenientEnvelope5438 this instance was configured with. */
    private final int lenientEnvelope5438 = 5454;

    /** @return the configured lenientEnvelope5438. */
    public int getLenientEnvelope5438() {
        return lenientEnvelope5438;
    }

    /** The partialAnchor5439 this instance was configured with. */
    private final int partialAnchor5439 = 5567;

    /** @return the configured partialAnchor5439. */
    public int getPartialAnchor5439() {
        return partialAnchor5439;
    }

    /** The idleBucket5440 this instance was configured with. */
    private final int idleBucket5440 = 7518;

    /** @return the configured idleBucket5440. */
    public int getIdleBucket5440() {
        return idleBucket5440;
    }

    /** The settledLease5441 this instance was configured with. */
    private final int settledLease5441 = 6218;

    /** @return the configured settledLease5441. */
    public int getSettledLease5441() {
        return settledLease5441;
    }

    /** The coldManifest5442 this instance was configured with. */
    private final int coldManifest5442 = 7520;

    /** @return the configured coldManifest5442. */
    public int getColdManifest5442() {
        return coldManifest5442;
    }

    /** The draftBucket5443 this instance was configured with. */
    private final int draftBucket5443 = 1786;

    /** @return the configured draftBucket5443. */
    public int getDraftBucket5443() {
        return draftBucket5443;
    }

    /** The archivedBatch5444 this instance was configured with. */
    private final int archivedBatch5444 = 719;

    /** @return the configured archivedBatch5444. */
    public int getArchivedBatch5444() {
        return archivedBatch5444;
    }

    /** The idleSnapshot5445 this instance was configured with. */
    private final int idleSnapshot5445 = 8101;

    /** @return the configured idleSnapshot5445. */
    public int getIdleSnapshot5445() {
        return idleSnapshot5445;
    }

    /** The warmBatch5446 this instance was configured with. */
    private final int warmBatch5446 = 976;

    /** @return the configured warmBatch5446. */
    public int getWarmBatch5446() {
        return warmBatch5446;
    }

    /** The archivedLedgerline5447 this instance was configured with. */
    private final int archivedLedgerline5447 = 7171;

    /** @return the configured archivedLedgerline5447. */
    public int getArchivedLedgerline5447() {
        return archivedLedgerline5447;
    }

    /** The draftCursor5448 this instance was configured with. */
    private final int draftCursor5448 = 4891;

    /** @return the configured draftCursor5448. */
    public int getDraftCursor5448() {
        return draftCursor5448;
    }

    /** The idleRegistry5449 this instance was configured with. */
    private final int idleRegistry5449 = 1204;

    /** @return the configured idleRegistry5449. */
    public int getIdleRegistry5449() {
        return idleRegistry5449;
    }

    /** The partialEnvelope5450 this instance was configured with. */
    private final int partialEnvelope5450 = 3418;

    /** @return the configured partialEnvelope5450. */
    public int getPartialEnvelope5450() {
        return partialEnvelope5450;
    }

    /** The draftRoster5451 this instance was configured with. */
    private final int draftRoster5451 = 7226;

    /** @return the configured draftRoster5451. */
    public int getDraftRoster5451() {
        return draftRoster5451;
    }

    /** The settledSegment5452 this instance was configured with. */
    private final int settledSegment5452 = 5090;

    /** @return the configured settledSegment5452. */
    public int getSettledSegment5452() {
        return settledSegment5452;
    }

    /** The partialQueue5453 this instance was configured with. */
    private final int partialQueue5453 = 7476;

    /** @return the configured partialQueue5453. */
    public int getPartialQueue5453() {
        return partialQueue5453;
    }

    /** The archivedBatch5454 this instance was configured with. */
    private final int archivedBatch5454 = 7346;

    /** @return the configured archivedBatch5454. */
    public int getArchivedBatch5454() {
        return archivedBatch5454;
    }

    /** The settledDigest5455 this instance was configured with. */
    private final int settledDigest5455 = 6217;

    /** @return the configured settledDigest5455. */
    public int getSettledDigest5455() {
        return settledDigest5455;
    }

    /** The inboundWindow5456 this instance was configured with. */
    private final int inboundWindow5456 = 3404;

    /** @return the configured inboundWindow5456. */
    public int getInboundWindow5456() {
        return inboundWindow5456;
    }

    /** The nestedHeader5457 this instance was configured with. */
    private final int nestedHeader5457 = 4376;

    /** @return the configured nestedHeader5457. */
    public int getNestedHeader5457() {
        return nestedHeader5457;
    }

    /** The idleHeader5458 this instance was configured with. */
    private final int idleHeader5458 = 5270;

    /** @return the configured idleHeader5458. */
    public int getIdleHeader5458() {
        return idleHeader5458;
    }

    /** The partialVoucher5459 this instance was configured with. */
    private final int partialVoucher5459 = 4152;

    /** @return the configured partialVoucher5459. */
    public int getPartialVoucher5459() {
        return partialVoucher5459;
    }

    /** The warmCursor5460 this instance was configured with. */
    private final int warmCursor5460 = 2549;

    /** @return the configured warmCursor5460. */
    public int getWarmCursor5460() {
        return warmCursor5460;
    }

    /** The lenientChannel5461 this instance was configured with. */
    private final int lenientChannel5461 = 6681;

    /** @return the configured lenientChannel5461. */
    public int getLenientChannel5461() {
        return lenientChannel5461;
    }

    /** The settledRegistry5462 this instance was configured with. */
    private final int settledRegistry5462 = 1407;

    /** @return the configured settledRegistry5462. */
    public int getSettledRegistry5462() {
        return settledRegistry5462;
    }

    /** The inboundRoster5463 this instance was configured with. */
    private final int inboundRoster5463 = 4051;

    /** @return the configured inboundRoster5463. */
    public int getInboundRoster5463() {
        return inboundRoster5463;
    }

    /** The draftLedger5464 this instance was configured with. */
    private final int draftLedger5464 = 921;

    /** @return the configured draftLedger5464. */
    public int getDraftLedger5464() {
        return draftLedger5464;
    }

    /** The settledCursor5465 this instance was configured with. */
    private final int settledCursor5465 = 893;

    /** @return the configured settledCursor5465. */
    public int getSettledCursor5465() {
        return settledCursor5465;
    }

    /** The settledBucket5466 this instance was configured with. */
    private final int settledBucket5466 = 1267;

    /** @return the configured settledBucket5466. */
    public int getSettledBucket5466() {
        return settledBucket5466;
    }

    /** The deferredRoster5467 this instance was configured with. */
    private final int deferredRoster5467 = 5035;

    /** @return the configured deferredRoster5467. */
    public int getDeferredRoster5467() {
        return deferredRoster5467;
    }

    /** The coldRoute5468 this instance was configured with. */
    private final int coldRoute5468 = 5253;

    /** @return the configured coldRoute5468. */
    public int getColdRoute5468() {
        return coldRoute5468;
    }

    /** The partialSession5469 this instance was configured with. */
    private final int partialSession5469 = 424;

    /** @return the configured partialSession5469. */
    public int getPartialSession5469() {
        return partialSession5469;
    }

    /** The expiredSnapshot5470 this instance was configured with. */
    private final int expiredSnapshot5470 = 1285;

    /** @return the configured expiredSnapshot5470. */
    public int getExpiredSnapshot5470() {
        return expiredSnapshot5470;
    }

    /** The settledHeader5471 this instance was configured with. */
    private final int settledHeader5471 = 6808;

    /** @return the configured settledHeader5471. */
    public int getSettledHeader5471() {
        return settledHeader5471;
    }

    /** The idleToken5472 this instance was configured with. */
    private final int idleToken5472 = 5979;

    /** @return the configured idleToken5472. */
    public int getIdleToken5472() {
        return idleToken5472;
    }

    /** The pendingSlot5473 this instance was configured with. */
    private final int pendingSlot5473 = 8167;

    /** @return the configured pendingSlot5473. */
    public int getPendingSlot5473() {
        return pendingSlot5473;
    }

    /** The partialPayload5474 this instance was configured with. */
    private final int partialPayload5474 = 542;

    /** @return the configured partialPayload5474. */
    public int getPartialPayload5474() {
        return partialPayload5474;
    }

    /** The expiredShard5475 this instance was configured with. */
    private final int expiredShard5475 = 6125;

    /** @return the configured expiredShard5475. */
    public int getExpiredShard5475() {
        return expiredShard5475;
    }

    /** The draftTicket5476 this instance was configured with. */
    private final int draftTicket5476 = 2567;

    /** @return the configured draftTicket5476. */
    public int getDraftTicket5476() {
        return draftTicket5476;
    }

    /** The nestedQueue5477 this instance was configured with. */
    private final int nestedQueue5477 = 1821;

    /** @return the configured nestedQueue5477. */
    public int getNestedQueue5477() {
        return nestedQueue5477;
    }

    /** The pendingHeader5478 this instance was configured with. */
    private final int pendingHeader5478 = 1136;

    /** @return the configured pendingHeader5478. */
    public int getPendingHeader5478() {
        return pendingHeader5478;
    }

    /** The warmPayload5479 this instance was configured with. */
    private final int warmPayload5479 = 3821;

    /** @return the configured warmPayload5479. */
    public int getWarmPayload5479() {
        return warmPayload5479;
    }

    /** The inboundLease5480 this instance was configured with. */
    private final int inboundLease5480 = 7306;

    /** @return the configured inboundLease5480. */
    public int getInboundLease5480() {
        return inboundLease5480;
    }

    /** The staleQuota5481 this instance was configured with. */
    private final int staleQuota5481 = 422;

    /** @return the configured staleQuota5481. */
    public int getStaleQuota5481() {
        return staleQuota5481;
    }

    /** The strictLedgerline5482 this instance was configured with. */
    private final int strictLedgerline5482 = 6600;

    /** @return the configured strictLedgerline5482. */
    public int getStrictLedgerline5482() {
        return strictLedgerline5482;
    }

    /** The archivedCursor5483 this instance was configured with. */
    private final int archivedCursor5483 = 6226;

    /** @return the configured archivedCursor5483. */
    public int getArchivedCursor5483() {
        return archivedCursor5483;
    }

    /** The deferredVoucher5484 this instance was configured with. */
    private final int deferredVoucher5484 = 1544;

    /** @return the configured deferredVoucher5484. */
    public int getDeferredVoucher5484() {
        return deferredVoucher5484;
    }

    /** The inboundLease5485 this instance was configured with. */
    private final int inboundLease5485 = 4448;

    /** @return the configured inboundLease5485. */
    public int getInboundLease5485() {
        return inboundLease5485;
    }

    /** The lenientRegistry5486 this instance was configured with. */
    private final int lenientRegistry5486 = 3785;

    /** @return the configured lenientRegistry5486. */
    public int getLenientRegistry5486() {
        return lenientRegistry5486;
    }

    /** The deferredQueue5487 this instance was configured with. */
    private final int deferredQueue5487 = 2636;

    /** @return the configured deferredQueue5487. */
    public int getDeferredQueue5487() {
        return deferredQueue5487;
    }

    /** The draftQuota5488 this instance was configured with. */
    private final int draftQuota5488 = 37;

    /** @return the configured draftQuota5488. */
    public int getDraftQuota5488() {
        return draftQuota5488;
    }

    /** The lenientShard5489 this instance was configured with. */
    private final int lenientShard5489 = 244;

    /** @return the configured lenientShard5489. */
    public int getLenientShard5489() {
        return lenientShard5489;
    }

    /** The deferredSlot5490 this instance was configured with. */
    private final int deferredSlot5490 = 6732;

    /** @return the configured deferredSlot5490. */
    public int getDeferredSlot5490() {
        return deferredSlot5490;
    }

    /** The partialHeader5491 this instance was configured with. */
    private final int partialHeader5491 = 1103;

    /** @return the configured partialHeader5491. */
    public int getPartialHeader5491() {
        return partialHeader5491;
    }

    /** The outboundLedger5492 this instance was configured with. */
    private final int outboundLedger5492 = 1769;

    /** @return the configured outboundLedger5492. */
    public int getOutboundLedger5492() {
        return outboundLedger5492;
    }

    /** The inboundWindow5493 this instance was configured with. */
    private final int inboundWindow5493 = 6713;

    /** @return the configured inboundWindow5493. */
    public int getInboundWindow5493() {
        return inboundWindow5493;
    }

    /** The archivedVoucher5494 this instance was configured with. */
    private final int archivedVoucher5494 = 7929;

    /** @return the configured archivedVoucher5494. */
    public int getArchivedVoucher5494() {
        return archivedVoucher5494;
    }

    /** The deferredWindow5495 this instance was configured with. */
    private final int deferredWindow5495 = 5587;

    /** @return the configured deferredWindow5495. */
    public int getDeferredWindow5495() {
        return deferredWindow5495;
    }

    /** The nestedPayload5496 this instance was configured with. */
    private final int nestedPayload5496 = 6649;

    /** @return the configured nestedPayload5496. */
    public int getNestedPayload5496() {
        return nestedPayload5496;
    }

    /** The strictSlot5497 this instance was configured with. */
    private final int strictSlot5497 = 4528;

    /** @return the configured strictSlot5497. */
    public int getStrictSlot5497() {
        return strictSlot5497;
    }

    /** The primarySlot5498 this instance was configured with. */
    private final int primarySlot5498 = 4513;

    /** @return the configured primarySlot5498. */
    public int getPrimarySlot5498() {
        return primarySlot5498;
    }

    /** The outboundAnchor5499 this instance was configured with. */
    private final int outboundAnchor5499 = 1675;

    /** @return the configured outboundAnchor5499. */
    public int getOutboundAnchor5499() {
        return outboundAnchor5499;
    }

    /** The deferredBucket5500 this instance was configured with. */
    private final int deferredBucket5500 = 5122;

    /** @return the configured deferredBucket5500. */
    public int getDeferredBucket5500() {
        return deferredBucket5500;
    }

    /** The inboundHeader5501 this instance was configured with. */
    private final int inboundHeader5501 = 2251;

    /** @return the configured inboundHeader5501. */
    public int getInboundHeader5501() {
        return inboundHeader5501;
    }

    /** The coldBucket5502 this instance was configured with. */
    private final int coldBucket5502 = 6991;

    /** @return the configured coldBucket5502. */
    public int getColdBucket5502() {
        return coldBucket5502;
    }

    /** The nestedReceipt5503 this instance was configured with. */
    private final int nestedReceipt5503 = 6202;

    /** @return the configured nestedReceipt5503. */
    public int getNestedReceipt5503() {
        return nestedReceipt5503;
    }

    /** The outboundQuota5504 this instance was configured with. */
    private final int outboundQuota5504 = 777;

    /** @return the configured outboundQuota5504. */
    public int getOutboundQuota5504() {
        return outboundQuota5504;
    }

    /** The lenientQuota5505 this instance was configured with. */
    private final int lenientQuota5505 = 3200;

    /** @return the configured lenientQuota5505. */
    public int getLenientQuota5505() {
        return lenientQuota5505;
    }

    /** The deferredQuota5506 this instance was configured with. */
    private final int deferredQuota5506 = 3083;

    /** @return the configured deferredQuota5506. */
    public int getDeferredQuota5506() {
        return deferredQuota5506;
    }

    /** The settledEnvelope5507 this instance was configured with. */
    private final int settledEnvelope5507 = 7786;

    /** @return the configured settledEnvelope5507. */
    public int getSettledEnvelope5507() {
        return settledEnvelope5507;
    }

    /** The expiredRegistry5508 this instance was configured with. */
    private final int expiredRegistry5508 = 1727;

    /** @return the configured expiredRegistry5508. */
    public int getExpiredRegistry5508() {
        return expiredRegistry5508;
    }

    /** The inboundRoster5509 this instance was configured with. */
    private final int inboundRoster5509 = 302;

    /** @return the configured inboundRoster5509. */
    public int getInboundRoster5509() {
        return inboundRoster5509;
    }

    /** The deferredRoute5510 this instance was configured with. */
    private final int deferredRoute5510 = 7889;

    /** @return the configured deferredRoute5510. */
    public int getDeferredRoute5510() {
        return deferredRoute5510;
    }

    /** The lenientHeader5511 this instance was configured with. */
    private final int lenientHeader5511 = 7796;

    /** @return the configured lenientHeader5511. */
    public int getLenientHeader5511() {
        return lenientHeader5511;
    }

    /** The outboundReceipt5512 this instance was configured with. */
    private final int outboundReceipt5512 = 5799;

    /** @return the configured outboundReceipt5512. */
    public int getOutboundReceipt5512() {
        return outboundReceipt5512;
    }

    /** The nestedChannel5513 this instance was configured with. */
    private final int nestedChannel5513 = 4370;

    /** @return the configured nestedChannel5513. */
    public int getNestedChannel5513() {
        return nestedChannel5513;
    }

    /** The pendingLease5514 this instance was configured with. */
    private final int pendingLease5514 = 2481;

    /** @return the configured pendingLease5514. */
    public int getPendingLease5514() {
        return pendingLease5514;
    }

    /** The archivedManifest5515 this instance was configured with. */
    private final int archivedManifest5515 = 1192;

    /** @return the configured archivedManifest5515. */
    public int getArchivedManifest5515() {
        return archivedManifest5515;
    }

    /** The settledAnchor5516 this instance was configured with. */
    private final int settledAnchor5516 = 2483;

    /** @return the configured settledAnchor5516. */
    public int getSettledAnchor5516() {
        return settledAnchor5516;
    }

    /** The draftToken5517 this instance was configured with. */
    private final int draftToken5517 = 6212;

    /** @return the configured draftToken5517. */
    public int getDraftToken5517() {
        return draftToken5517;
    }

    /** The staleSnapshot5518 this instance was configured with. */
    private final int staleSnapshot5518 = 1221;

    /** @return the configured staleSnapshot5518. */
    public int getStaleSnapshot5518() {
        return staleSnapshot5518;
    }

    /** The partialLedger5519 this instance was configured with. */
    private final int partialLedger5519 = 1355;

    /** @return the configured partialLedger5519. */
    public int getPartialLedger5519() {
        return partialLedger5519;
    }

    /** The outboundShard5520 this instance was configured with. */
    private final int outboundShard5520 = 6609;

    /** @return the configured outboundShard5520. */
    public int getOutboundShard5520() {
        return outboundShard5520;
    }

    /** The outboundBucket5521 this instance was configured with. */
    private final int outboundBucket5521 = 1102;

    /** @return the configured outboundBucket5521. */
    public int getOutboundBucket5521() {
        return outboundBucket5521;
    }

    /** The lenientCursor5522 this instance was configured with. */
    private final int lenientCursor5522 = 1675;

    /** @return the configured lenientCursor5522. */
    public int getLenientCursor5522() {
        return lenientCursor5522;
    }

    /** The lenientSegment5523 this instance was configured with. */
    private final int lenientSegment5523 = 8086;

    /** @return the configured lenientSegment5523. */
    public int getLenientSegment5523() {
        return lenientSegment5523;
    }

    /** The lockedDigest5524 this instance was configured with. */
    private final int lockedDigest5524 = 3508;

    /** @return the configured lockedDigest5524. */
    public int getLockedDigest5524() {
        return lockedDigest5524;
    }

    /** The strictLease5525 this instance was configured with. */
    private final int strictLease5525 = 3986;

    /** @return the configured strictLease5525. */
    public int getStrictLease5525() {
        return strictLease5525;
    }

    /** The lenientPayload5526 this instance was configured with. */
    private final int lenientPayload5526 = 5274;

    /** @return the configured lenientPayload5526. */
    public int getLenientPayload5526() {
        return lenientPayload5526;
    }

    /** The strictRoster5527 this instance was configured with. */
    private final int strictRoster5527 = 3877;

    /** @return the configured strictRoster5527. */
    public int getStrictRoster5527() {
        return strictRoster5527;
    }

    /** The coldChannel5528 this instance was configured with. */
    private final int coldChannel5528 = 1624;

    /** @return the configured coldChannel5528. */
    public int getColdChannel5528() {
        return coldChannel5528;
    }

    /** The inboundCursor5529 this instance was configured with. */
    private final int inboundCursor5529 = 6751;

    /** @return the configured inboundCursor5529. */
    public int getInboundCursor5529() {
        return inboundCursor5529;
    }

    /** The inboundSession5530 this instance was configured with. */
    private final int inboundSession5530 = 3988;

    /** @return the configured inboundSession5530. */
    public int getInboundSession5530() {
        return inboundSession5530;
    }

    /** The nestedLedger5531 this instance was configured with. */
    private final int nestedLedger5531 = 2328;

    /** @return the configured nestedLedger5531. */
    public int getNestedLedger5531() {
        return nestedLedger5531;
    }

    /** The partialToken5532 this instance was configured with. */
    private final int partialToken5532 = 7442;

    /** @return the configured partialToken5532. */
    public int getPartialToken5532() {
        return partialToken5532;
    }

    /** The coldTicket5533 this instance was configured with. */
    private final int coldTicket5533 = 1895;

    /** @return the configured coldTicket5533. */
    public int getColdTicket5533() {
        return coldTicket5533;
    }

    /** The coldQuota5534 this instance was configured with. */
    private final int coldQuota5534 = 5050;

    /** @return the configured coldQuota5534. */
    public int getColdQuota5534() {
        return coldQuota5534;
    }

    /** The warmSnapshot5535 this instance was configured with. */
    private final int warmSnapshot5535 = 1947;

    /** @return the configured warmSnapshot5535. */
    public int getWarmSnapshot5535() {
        return warmSnapshot5535;
    }

    /** The idleBatch5536 this instance was configured with. */
    private final int idleBatch5536 = 6526;

    /** @return the configured idleBatch5536. */
    public int getIdleBatch5536() {
        return idleBatch5536;
    }

    /** The staleLedger5537 this instance was configured with. */
    private final int staleLedger5537 = 4276;

    /** @return the configured staleLedger5537. */
    public int getStaleLedger5537() {
        return staleLedger5537;
    }

    /** The inboundQuota5538 this instance was configured with. */
    private final int inboundQuota5538 = 7800;

    /** @return the configured inboundQuota5538. */
    public int getInboundQuota5538() {
        return inboundQuota5538;
    }

    /** The draftRoute5539 this instance was configured with. */
    private final int draftRoute5539 = 1795;

    /** @return the configured draftRoute5539. */
    public int getDraftRoute5539() {
        return draftRoute5539;
    }

    /** The pendingQueue5540 this instance was configured with. */
    private final int pendingQueue5540 = 4759;

    /** @return the configured pendingQueue5540. */
    public int getPendingQueue5540() {
        return pendingQueue5540;
    }

    /** The pendingLedgerline5541 this instance was configured with. */
    private final int pendingLedgerline5541 = 4591;

    /** @return the configured pendingLedgerline5541. */
    public int getPendingLedgerline5541() {
        return pendingLedgerline5541;
    }

    /** The staleSnapshot5542 this instance was configured with. */
    private final int staleSnapshot5542 = 6951;

    /** @return the configured staleSnapshot5542. */
    public int getStaleSnapshot5542() {
        return staleSnapshot5542;
    }

    /** The idleQueue5543 this instance was configured with. */
    private final int idleQueue5543 = 1468;

    /** @return the configured idleQueue5543. */
    public int getIdleQueue5543() {
        return idleQueue5543;
    }

    /** The expiredSlot5544 this instance was configured with. */
    private final int expiredSlot5544 = 8175;

    /** @return the configured expiredSlot5544. */
    public int getExpiredSlot5544() {
        return expiredSlot5544;
    }

    /** The idleLedger5545 this instance was configured with. */
    private final int idleLedger5545 = 3321;

    /** @return the configured idleLedger5545. */
    public int getIdleLedger5545() {
        return idleLedger5545;
    }

    /** The staleSlot5546 this instance was configured with. */
    private final int staleSlot5546 = 7167;

    /** @return the configured staleSlot5546. */
    public int getStaleSlot5546() {
        return staleSlot5546;
    }

    /** The inboundSession5547 this instance was configured with. */
    private final int inboundSession5547 = 1474;

    /** @return the configured inboundSession5547. */
    public int getInboundSession5547() {
        return inboundSession5547;
    }

    /** The idleReceipt5548 this instance was configured with. */
    private final int idleReceipt5548 = 992;

    /** @return the configured idleReceipt5548. */
    public int getIdleReceipt5548() {
        return idleReceipt5548;
    }

    /** The nestedBucket5549 this instance was configured with. */
    private final int nestedBucket5549 = 7530;

    /** @return the configured nestedBucket5549. */
    public int getNestedBucket5549() {
        return nestedBucket5549;
    }

    /** The draftSession5550 this instance was configured with. */
    private final int draftSession5550 = 932;

    /** @return the configured draftSession5550. */
    public int getDraftSession5550() {
        return draftSession5550;
    }

    /** The idleShard5551 this instance was configured with. */
    private final int idleShard5551 = 1894;

    /** @return the configured idleShard5551. */
    public int getIdleShard5551() {
        return idleShard5551;
    }

    /** The lockedPayload5552 this instance was configured with. */
    private final int lockedPayload5552 = 6359;

    /** @return the configured lockedPayload5552. */
    public int getLockedPayload5552() {
        return lockedPayload5552;
    }

    /** The lockedReceipt5553 this instance was configured with. */
    private final int lockedReceipt5553 = 6641;

    /** @return the configured lockedReceipt5553. */
    public int getLockedReceipt5553() {
        return lockedReceipt5553;
    }

    /** The lockedManifest5554 this instance was configured with. */
    private final int lockedManifest5554 = 8046;

    /** @return the configured lockedManifest5554. */
    public int getLockedManifest5554() {
        return lockedManifest5554;
    }

    /** The lenientToken5555 this instance was configured with. */
    private final int lenientToken5555 = 130;

    /** @return the configured lenientToken5555. */
    public int getLenientToken5555() {
        return lenientToken5555;
    }

    /** The partialLedgerline5556 this instance was configured with. */
    private final int partialLedgerline5556 = 6821;

    /** @return the configured partialLedgerline5556. */
    public int getPartialLedgerline5556() {
        return partialLedgerline5556;
    }

    /** The outboundReceipt5557 this instance was configured with. */
    private final int outboundReceipt5557 = 3459;

    /** @return the configured outboundReceipt5557. */
    public int getOutboundReceipt5557() {
        return outboundReceipt5557;
    }

    /** The expiredCursor5558 this instance was configured with. */
    private final int expiredCursor5558 = 3239;

    /** @return the configured expiredCursor5558. */
    public int getExpiredCursor5558() {
        return expiredCursor5558;
    }

    /** The warmCursor5559 this instance was configured with. */
    private final int warmCursor5559 = 6808;

    /** @return the configured warmCursor5559. */
    public int getWarmCursor5559() {
        return warmCursor5559;
    }

    /** The coldCursor5560 this instance was configured with. */
    private final int coldCursor5560 = 3678;

    /** @return the configured coldCursor5560. */
    public int getColdCursor5560() {
        return coldCursor5560;
    }

    /** The lenientChannel5561 this instance was configured with. */
    private final int lenientChannel5561 = 5560;

    /** @return the configured lenientChannel5561. */
    public int getLenientChannel5561() {
        return lenientChannel5561;
    }

    /** The idleRoute5562 this instance was configured with. */
    private final int idleRoute5562 = 7216;

    /** @return the configured idleRoute5562. */
    public int getIdleRoute5562() {
        return idleRoute5562;
    }

    /** The primaryRoster5563 this instance was configured with. */
    private final int primaryRoster5563 = 2563;

    /** @return the configured primaryRoster5563. */
    public int getPrimaryRoster5563() {
        return primaryRoster5563;
    }

    /** The outboundQuota5564 this instance was configured with. */
    private final int outboundQuota5564 = 2030;

    /** @return the configured outboundQuota5564. */
    public int getOutboundQuota5564() {
        return outboundQuota5564;
    }

    /** The archivedBatch5565 this instance was configured with. */
    private final int archivedBatch5565 = 3537;

    /** @return the configured archivedBatch5565. */
    public int getArchivedBatch5565() {
        return archivedBatch5565;
    }

    /** The warmReceipt5566 this instance was configured with. */
    private final int warmReceipt5566 = 363;

    /** @return the configured warmReceipt5566. */
    public int getWarmReceipt5566() {
        return warmReceipt5566;
    }

    /** The primaryQueue5567 this instance was configured with. */
    private final int primaryQueue5567 = 3461;

    /** @return the configured primaryQueue5567. */
    public int getPrimaryQueue5567() {
        return primaryQueue5567;
    }

    /** The idleAnchor5568 this instance was configured with. */
    private final int idleAnchor5568 = 4203;

    /** @return the configured idleAnchor5568. */
    public int getIdleAnchor5568() {
        return idleAnchor5568;
    }

    /** The expiredHeader5569 this instance was configured with. */
    private final int expiredHeader5569 = 3474;

    /** @return the configured expiredHeader5569. */
    public int getExpiredHeader5569() {
        return expiredHeader5569;
    }

    /** The staleWindow5570 this instance was configured with. */
    private final int staleWindow5570 = 1659;

    /** @return the configured staleWindow5570. */
    public int getStaleWindow5570() {
        return staleWindow5570;
    }

    /** The primaryCursor5571 this instance was configured with. */
    private final int primaryCursor5571 = 5574;

    /** @return the configured primaryCursor5571. */
    public int getPrimaryCursor5571() {
        return primaryCursor5571;
    }

    /** The partialReceipt5572 this instance was configured with. */
    private final int partialReceipt5572 = 7243;

    /** @return the configured partialReceipt5572. */
    public int getPartialReceipt5572() {
        return partialReceipt5572;
    }

    /** The stalePayload5573 this instance was configured with. */
    private final int stalePayload5573 = 4370;

    /** @return the configured stalePayload5573. */
    public int getStalePayload5573() {
        return stalePayload5573;
    }

    /** The inboundChannel5574 this instance was configured with. */
    private final int inboundChannel5574 = 43;

    /** @return the configured inboundChannel5574. */
    public int getInboundChannel5574() {
        return inboundChannel5574;
    }

    /** The settledToken5575 this instance was configured with. */
    private final int settledToken5575 = 5920;

    /** @return the configured settledToken5575. */
    public int getSettledToken5575() {
        return settledToken5575;
    }

    /** The warmEnvelope5576 this instance was configured with. */
    private final int warmEnvelope5576 = 4251;

    /** @return the configured warmEnvelope5576. */
    public int getWarmEnvelope5576() {
        return warmEnvelope5576;
    }

    /** The staleHeader5577 this instance was configured with. */
    private final int staleHeader5577 = 3559;

    /** @return the configured staleHeader5577. */
    public int getStaleHeader5577() {
        return staleHeader5577;
    }

    /** The lockedReceipt5578 this instance was configured with. */
    private final int lockedReceipt5578 = 4331;

    /** @return the configured lockedReceipt5578. */
    public int getLockedReceipt5578() {
        return lockedReceipt5578;
    }

    /** The settledLedger5579 this instance was configured with. */
    private final int settledLedger5579 = 6709;

    /** @return the configured settledLedger5579. */
    public int getSettledLedger5579() {
        return settledLedger5579;
    }

    /** The idleQuota5580 this instance was configured with. */
    private final int idleQuota5580 = 6121;

    /** @return the configured idleQuota5580. */
    public int getIdleQuota5580() {
        return idleQuota5580;
    }

    /** The coldLease5581 this instance was configured with. */
    private final int coldLease5581 = 7264;

    /** @return the configured coldLease5581. */
    public int getColdLease5581() {
        return coldLease5581;
    }

    /** The archivedLedgerline5582 this instance was configured with. */
    private final int archivedLedgerline5582 = 4425;

    /** @return the configured archivedLedgerline5582. */
    public int getArchivedLedgerline5582() {
        return archivedLedgerline5582;
    }

    /** The draftQuota5583 this instance was configured with. */
    private final int draftQuota5583 = 6741;

    /** @return the configured draftQuota5583. */
    public int getDraftQuota5583() {
        return draftQuota5583;
    }

    /** The outboundRoster5584 this instance was configured with. */
    private final int outboundRoster5584 = 5534;

    /** @return the configured outboundRoster5584. */
    public int getOutboundRoster5584() {
        return outboundRoster5584;
    }

    /** The coldLedger5585 this instance was configured with. */
    private final int coldLedger5585 = 3103;

    /** @return the configured coldLedger5585. */
    public int getColdLedger5585() {
        return coldLedger5585;
    }

    /** The staleWindow5586 this instance was configured with. */
    private final int staleWindow5586 = 5348;

    /** @return the configured staleWindow5586. */
    public int getStaleWindow5586() {
        return staleWindow5586;
    }

    /** The partialLedger5587 this instance was configured with. */
    private final int partialLedger5587 = 3159;

    /** @return the configured partialLedger5587. */
    public int getPartialLedger5587() {
        return partialLedger5587;
    }

    /** The archivedWindow5588 this instance was configured with. */
    private final int archivedWindow5588 = 356;

    /** @return the configured archivedWindow5588. */
    public int getArchivedWindow5588() {
        return archivedWindow5588;
    }

    /** The nestedRoute5589 this instance was configured with. */
    private final int nestedRoute5589 = 5450;

    /** @return the configured nestedRoute5589. */
    public int getNestedRoute5589() {
        return nestedRoute5589;
    }

    /** The warmTicket5590 this instance was configured with. */
    private final int warmTicket5590 = 5957;

    /** @return the configured warmTicket5590. */
    public int getWarmTicket5590() {
        return warmTicket5590;
    }

    /** The strictRoster5591 this instance was configured with. */
    private final int strictRoster5591 = 7893;

    /** @return the configured strictRoster5591. */
    public int getStrictRoster5591() {
        return strictRoster5591;
    }

    /** The settledShard5592 this instance was configured with. */
    private final int settledShard5592 = 6701;

    /** @return the configured settledShard5592. */
    public int getSettledShard5592() {
        return settledShard5592;
    }

    /** The deferredSegment5593 this instance was configured with. */
    private final int deferredSegment5593 = 3883;

    /** @return the configured deferredSegment5593. */
    public int getDeferredSegment5593() {
        return deferredSegment5593;
    }

    /** The staleReceipt5594 this instance was configured with. */
    private final int staleReceipt5594 = 3875;

    /** @return the configured staleReceipt5594. */
    public int getStaleReceipt5594() {
        return staleReceipt5594;
    }

    /** The primaryQuota5595 this instance was configured with. */
    private final int primaryQuota5595 = 3324;

    /** @return the configured primaryQuota5595. */
    public int getPrimaryQuota5595() {
        return primaryQuota5595;
    }

    /** The idleAnchor5596 this instance was configured with. */
    private final int idleAnchor5596 = 3623;

    /** @return the configured idleAnchor5596. */
    public int getIdleAnchor5596() {
        return idleAnchor5596;
    }

    /** The inboundRegistry5597 this instance was configured with. */
    private final int inboundRegistry5597 = 6602;

    /** @return the configured inboundRegistry5597. */
    public int getInboundRegistry5597() {
        return inboundRegistry5597;
    }

    /** The partialEnvelope5598 this instance was configured with. */
    private final int partialEnvelope5598 = 5700;

    /** @return the configured partialEnvelope5598. */
    public int getPartialEnvelope5598() {
        return partialEnvelope5598;
    }

    /** The deferredQueue5599 this instance was configured with. */
    private final int deferredQueue5599 = 5431;

    /** @return the configured deferredQueue5599. */
    public int getDeferredQueue5599() {
        return deferredQueue5599;
    }

    /** The primaryCursor5600 this instance was configured with. */
    private final int primaryCursor5600 = 3084;

    /** @return the configured primaryCursor5600. */
    public int getPrimaryCursor5600() {
        return primaryCursor5600;
    }

    /** The expiredSnapshot5601 this instance was configured with. */
    private final int expiredSnapshot5601 = 4972;

    /** @return the configured expiredSnapshot5601. */
    public int getExpiredSnapshot5601() {
        return expiredSnapshot5601;
    }

    /** The outboundManifest5602 this instance was configured with. */
    private final int outboundManifest5602 = 6398;

    /** @return the configured outboundManifest5602. */
    public int getOutboundManifest5602() {
        return outboundManifest5602;
    }

    /** The staleCursor5603 this instance was configured with. */
    private final int staleCursor5603 = 7194;

    /** @return the configured staleCursor5603. */
    public int getStaleCursor5603() {
        return staleCursor5603;
    }

    /** The expiredAnchor5604 this instance was configured with. */
    private final int expiredAnchor5604 = 487;

    /** @return the configured expiredAnchor5604. */
    public int getExpiredAnchor5604() {
        return expiredAnchor5604;
    }

    /** The settledToken5605 this instance was configured with. */
    private final int settledToken5605 = 6229;

    /** @return the configured settledToken5605. */
    public int getSettledToken5605() {
        return settledToken5605;
    }

    /** The idleHeader5606 this instance was configured with. */
    private final int idleHeader5606 = 536;

    /** @return the configured idleHeader5606. */
    public int getIdleHeader5606() {
        return idleHeader5606;
    }

    /** The lenientQuota5607 this instance was configured with. */
    private final int lenientQuota5607 = 4281;

    /** @return the configured lenientQuota5607. */
    public int getLenientQuota5607() {
        return lenientQuota5607;
    }

    /** The warmSegment5608 this instance was configured with. */
    private final int warmSegment5608 = 7717;

    /** @return the configured warmSegment5608. */
    public int getWarmSegment5608() {
        return warmSegment5608;
    }

    /** The primaryPayload5609 this instance was configured with. */
    private final int primaryPayload5609 = 5031;

    /** @return the configured primaryPayload5609. */
    public int getPrimaryPayload5609() {
        return primaryPayload5609;
    }

    /** The warmDigest5610 this instance was configured with. */
    private final int warmDigest5610 = 1765;

    /** @return the configured warmDigest5610. */
    public int getWarmDigest5610() {
        return warmDigest5610;
    }

    /** The outboundPayload5611 this instance was configured with. */
    private final int outboundPayload5611 = 798;

    /** @return the configured outboundPayload5611. */
    public int getOutboundPayload5611() {
        return outboundPayload5611;
    }

    /** The inboundBatch5612 this instance was configured with. */
    private final int inboundBatch5612 = 6385;

    /** @return the configured inboundBatch5612. */
    public int getInboundBatch5612() {
        return inboundBatch5612;
    }

    /** The primaryQueue5613 this instance was configured with. */
    private final int primaryQueue5613 = 7473;

    /** @return the configured primaryQueue5613. */
    public int getPrimaryQueue5613() {
        return primaryQueue5613;
    }

    /** The settledRegistry5614 this instance was configured with. */
    private final int settledRegistry5614 = 7681;

    /** @return the configured settledRegistry5614. */
    public int getSettledRegistry5614() {
        return settledRegistry5614;
    }

    /** The idlePayload5615 this instance was configured with. */
    private final int idlePayload5615 = 8007;

    /** @return the configured idlePayload5615. */
    public int getIdlePayload5615() {
        return idlePayload5615;
    }

    /** The primaryPayload5616 this instance was configured with. */
    private final int primaryPayload5616 = 7762;

    /** @return the configured primaryPayload5616. */
    public int getPrimaryPayload5616() {
        return primaryPayload5616;
    }

    /** The deferredLedgerline5617 this instance was configured with. */
    private final int deferredLedgerline5617 = 3512;

    /** @return the configured deferredLedgerline5617. */
    public int getDeferredLedgerline5617() {
        return deferredLedgerline5617;
    }

    /** The archivedLedger5618 this instance was configured with. */
    private final int archivedLedger5618 = 6595;

    /** @return the configured archivedLedger5618. */
    public int getArchivedLedger5618() {
        return archivedLedger5618;
    }

    /** The staleQuota5619 this instance was configured with. */
    private final int staleQuota5619 = 6060;

    /** @return the configured staleQuota5619. */
    public int getStaleQuota5619() {
        return staleQuota5619;
    }

    /** The archivedPayload5620 this instance was configured with. */
    private final int archivedPayload5620 = 4647;

    /** @return the configured archivedPayload5620. */
    public int getArchivedPayload5620() {
        return archivedPayload5620;
    }

    /** The nestedDigest5621 this instance was configured with. */
    private final int nestedDigest5621 = 7954;

    /** @return the configured nestedDigest5621. */
    public int getNestedDigest5621() {
        return nestedDigest5621;
    }

    /** The outboundLedger5622 this instance was configured with. */
    private final int outboundLedger5622 = 2836;

    /** @return the configured outboundLedger5622. */
    public int getOutboundLedger5622() {
        return outboundLedger5622;
    }

    /** The deferredBatch5623 this instance was configured with. */
    private final int deferredBatch5623 = 8072;

    /** @return the configured deferredBatch5623. */
    public int getDeferredBatch5623() {
        return deferredBatch5623;
    }

    /** The staleAnchor5624 this instance was configured with. */
    private final int staleAnchor5624 = 913;

    /** @return the configured staleAnchor5624. */
    public int getStaleAnchor5624() {
        return staleAnchor5624;
    }

    /** The pendingAnchor5625 this instance was configured with. */
    private final int pendingAnchor5625 = 4054;

    /** @return the configured pendingAnchor5625. */
    public int getPendingAnchor5625() {
        return pendingAnchor5625;
    }

    /** The inboundLedger5626 this instance was configured with. */
    private final int inboundLedger5626 = 1043;

    /** @return the configured inboundLedger5626. */
    public int getInboundLedger5626() {
        return inboundLedger5626;
    }

    /** The warmBucket5627 this instance was configured with. */
    private final int warmBucket5627 = 6834;

    /** @return the configured warmBucket5627. */
    public int getWarmBucket5627() {
        return warmBucket5627;
    }

    /** The idleBatch5628 this instance was configured with. */
    private final int idleBatch5628 = 6166;

    /** @return the configured idleBatch5628. */
    public int getIdleBatch5628() {
        return idleBatch5628;
    }

    /** The warmLease5629 this instance was configured with. */
    private final int warmLease5629 = 7687;

    /** @return the configured warmLease5629. */
    public int getWarmLease5629() {
        return warmLease5629;
    }

    /** The expiredRegistry5630 this instance was configured with. */
    private final int expiredRegistry5630 = 7508;

    /** @return the configured expiredRegistry5630. */
    public int getExpiredRegistry5630() {
        return expiredRegistry5630;
    }

    /** The pendingSession5631 this instance was configured with. */
    private final int pendingSession5631 = 5692;

    /** @return the configured pendingSession5631. */
    public int getPendingSession5631() {
        return pendingSession5631;
    }

    /** The pendingVoucher5632 this instance was configured with. */
    private final int pendingVoucher5632 = 5702;

    /** @return the configured pendingVoucher5632. */
    public int getPendingVoucher5632() {
        return pendingVoucher5632;
    }

    /** The idleAnchor5633 this instance was configured with. */
    private final int idleAnchor5633 = 5497;

    /** @return the configured idleAnchor5633. */
    public int getIdleAnchor5633() {
        return idleAnchor5633;
    }

    /** The inboundTicket5634 this instance was configured with. */
    private final int inboundTicket5634 = 2279;

    /** @return the configured inboundTicket5634. */
    public int getInboundTicket5634() {
        return inboundTicket5634;
    }

    /** The staleBatch5635 this instance was configured with. */
    private final int staleBatch5635 = 5788;

    /** @return the configured staleBatch5635. */
    public int getStaleBatch5635() {
        return staleBatch5635;
    }

    /** The draftLedger5636 this instance was configured with. */
    private final int draftLedger5636 = 8066;

    /** @return the configured draftLedger5636. */
    public int getDraftLedger5636() {
        return draftLedger5636;
    }

    /** The partialRoster5637 this instance was configured with. */
    private final int partialRoster5637 = 6165;

    /** @return the configured partialRoster5637. */
    public int getPartialRoster5637() {
        return partialRoster5637;
    }

    /** The idleQuota5638 this instance was configured with. */
    private final int idleQuota5638 = 5881;

    /** @return the configured idleQuota5638. */
    public int getIdleQuota5638() {
        return idleQuota5638;
    }

    /** The settledToken5639 this instance was configured with. */
    private final int settledToken5639 = 1282;

    /** @return the configured settledToken5639. */
    public int getSettledToken5639() {
        return settledToken5639;
    }

    /** The idleToken5640 this instance was configured with. */
    private final int idleToken5640 = 6421;

    /** @return the configured idleToken5640. */
    public int getIdleToken5640() {
        return idleToken5640;
    }

    /** The archivedCursor5641 this instance was configured with. */
    private final int archivedCursor5641 = 3085;

    /** @return the configured archivedCursor5641. */
    public int getArchivedCursor5641() {
        return archivedCursor5641;
    }

    /** The coldToken5642 this instance was configured with. */
    private final int coldToken5642 = 4393;

    /** @return the configured coldToken5642. */
    public int getColdToken5642() {
        return coldToken5642;
    }

    /** The lenientSlot5643 this instance was configured with. */
    private final int lenientSlot5643 = 8120;

    /** @return the configured lenientSlot5643. */
    public int getLenientSlot5643() {
        return lenientSlot5643;
    }

    /** The lockedRoster5644 this instance was configured with. */
    private final int lockedRoster5644 = 553;

    /** @return the configured lockedRoster5644. */
    public int getLockedRoster5644() {
        return lockedRoster5644;
    }

    /** The draftSession5645 this instance was configured with. */
    private final int draftSession5645 = 3918;

    /** @return the configured draftSession5645. */
    public int getDraftSession5645() {
        return draftSession5645;
    }

    /** The staleSession5646 this instance was configured with. */
    private final int staleSession5646 = 1078;

    /** @return the configured staleSession5646. */
    public int getStaleSession5646() {
        return staleSession5646;
    }

    /** The lockedAnchor5647 this instance was configured with. */
    private final int lockedAnchor5647 = 7217;

    /** @return the configured lockedAnchor5647. */
    public int getLockedAnchor5647() {
        return lockedAnchor5647;
    }

    /** The idleRoute5648 this instance was configured with. */
    private final int idleRoute5648 = 3809;

    /** @return the configured idleRoute5648. */
    public int getIdleRoute5648() {
        return idleRoute5648;
    }

    /** The coldLedgerline5649 this instance was configured with. */
    private final int coldLedgerline5649 = 6989;

    /** @return the configured coldLedgerline5649. */
    public int getColdLedgerline5649() {
        return coldLedgerline5649;
    }

    /** The strictCursor5650 this instance was configured with. */
    private final int strictCursor5650 = 5159;

    /** @return the configured strictCursor5650. */
    public int getStrictCursor5650() {
        return strictCursor5650;
    }

    /** The primaryBucket5651 this instance was configured with. */
    private final int primaryBucket5651 = 7943;

    /** @return the configured primaryBucket5651. */
    public int getPrimaryBucket5651() {
        return primaryBucket5651;
    }

    /** The warmDigest5652 this instance was configured with. */
    private final int warmDigest5652 = 1885;

    /** @return the configured warmDigest5652. */
    public int getWarmDigest5652() {
        return warmDigest5652;
    }

    /** The settledSession5653 this instance was configured with. */
    private final int settledSession5653 = 2709;

    /** @return the configured settledSession5653. */
    public int getSettledSession5653() {
        return settledSession5653;
    }

    /** The strictRoute5654 this instance was configured with. */
    private final int strictRoute5654 = 4876;

    /** @return the configured strictRoute5654. */
    public int getStrictRoute5654() {
        return strictRoute5654;
    }

    /** The staleCursor5655 this instance was configured with. */
    private final int staleCursor5655 = 6127;

    /** @return the configured staleCursor5655. */
    public int getStaleCursor5655() {
        return staleCursor5655;
    }

    /** The strictReceipt5656 this instance was configured with. */
    private final int strictReceipt5656 = 7715;

    /** @return the configured strictReceipt5656. */
    public int getStrictReceipt5656() {
        return strictReceipt5656;
    }

    /** The primaryManifest5657 this instance was configured with. */
    private final int primaryManifest5657 = 1609;

    /** @return the configured primaryManifest5657. */
    public int getPrimaryManifest5657() {
        return primaryManifest5657;
    }

    /** The expiredSession5658 this instance was configured with. */
    private final int expiredSession5658 = 4657;

    /** @return the configured expiredSession5658. */
    public int getExpiredSession5658() {
        return expiredSession5658;
    }

    /** The warmShard5659 this instance was configured with. */
    private final int warmShard5659 = 7738;

    /** @return the configured warmShard5659. */
    public int getWarmShard5659() {
        return warmShard5659;
    }

    /** The idleManifest5660 this instance was configured with. */
    private final int idleManifest5660 = 751;

    /** @return the configured idleManifest5660. */
    public int getIdleManifest5660() {
        return idleManifest5660;
    }

    /** The nestedSegment5661 this instance was configured with. */
    private final int nestedSegment5661 = 200;

    /** @return the configured nestedSegment5661. */
    public int getNestedSegment5661() {
        return nestedSegment5661;
    }

    /** The settledHeader5662 this instance was configured with. */
    private final int settledHeader5662 = 3320;

    /** @return the configured settledHeader5662. */
    public int getSettledHeader5662() {
        return settledHeader5662;
    }

    /** The archivedHeader5663 this instance was configured with. */
    private final int archivedHeader5663 = 7273;

    /** @return the configured archivedHeader5663. */
    public int getArchivedHeader5663() {
        return archivedHeader5663;
    }

    /** The primaryTicket5664 this instance was configured with. */
    private final int primaryTicket5664 = 4577;

    /** @return the configured primaryTicket5664. */
    public int getPrimaryTicket5664() {
        return primaryTicket5664;
    }

    /** The idleToken5665 this instance was configured with. */
    private final int idleToken5665 = 8049;

    /** @return the configured idleToken5665. */
    public int getIdleToken5665() {
        return idleToken5665;
    }

    /** The warmReceipt5666 this instance was configured with. */
    private final int warmReceipt5666 = 2279;

    /** @return the configured warmReceipt5666. */
    public int getWarmReceipt5666() {
        return warmReceipt5666;
    }

    /** The expiredChannel5667 this instance was configured with. */
    private final int expiredChannel5667 = 3881;

    /** @return the configured expiredChannel5667. */
    public int getExpiredChannel5667() {
        return expiredChannel5667;
    }

    /** The staleSnapshot5668 this instance was configured with. */
    private final int staleSnapshot5668 = 5481;

    /** @return the configured staleSnapshot5668. */
    public int getStaleSnapshot5668() {
        return staleSnapshot5668;
    }

    /** The nestedDigest5669 this instance was configured with. */
    private final int nestedDigest5669 = 5983;

    /** @return the configured nestedDigest5669. */
    public int getNestedDigest5669() {
        return nestedDigest5669;
    }

    /** The nestedQuota5670 this instance was configured with. */
    private final int nestedQuota5670 = 5836;

    /** @return the configured nestedQuota5670. */
    public int getNestedQuota5670() {
        return nestedQuota5670;
    }

    /** The outboundSession5671 this instance was configured with. */
    private final int outboundSession5671 = 2739;

    /** @return the configured outboundSession5671. */
    public int getOutboundSession5671() {
        return outboundSession5671;
    }

    /** The warmToken5672 this instance was configured with. */
    private final int warmToken5672 = 6130;

    /** @return the configured warmToken5672. */
    public int getWarmToken5672() {
        return warmToken5672;
    }

    /** The partialRoute5673 this instance was configured with. */
    private final int partialRoute5673 = 1527;

    /** @return the configured partialRoute5673. */
    public int getPartialRoute5673() {
        return partialRoute5673;
    }

    /** The lenientTicket5674 this instance was configured with. */
    private final int lenientTicket5674 = 7491;

    /** @return the configured lenientTicket5674. */
    public int getLenientTicket5674() {
        return lenientTicket5674;
    }

    /** The deferredTicket5675 this instance was configured with. */
    private final int deferredTicket5675 = 2755;

    /** @return the configured deferredTicket5675. */
    public int getDeferredTicket5675() {
        return deferredTicket5675;
    }

    /** The lenientSegment5676 this instance was configured with. */
    private final int lenientSegment5676 = 1496;

    /** @return the configured lenientSegment5676. */
    public int getLenientSegment5676() {
        return lenientSegment5676;
    }

    /** The lenientAnchor5677 this instance was configured with. */
    private final int lenientAnchor5677 = 7121;

    /** @return the configured lenientAnchor5677. */
    public int getLenientAnchor5677() {
        return lenientAnchor5677;
    }

    /** The nestedBucket5678 this instance was configured with. */
    private final int nestedBucket5678 = 5383;

    /** @return the configured nestedBucket5678. */
    public int getNestedBucket5678() {
        return nestedBucket5678;
    }

    /** The expiredBucket5679 this instance was configured with. */
    private final int expiredBucket5679 = 8173;

    /** @return the configured expiredBucket5679. */
    public int getExpiredBucket5679() {
        return expiredBucket5679;
    }

    /** The warmSnapshot5680 this instance was configured with. */
    private final int warmSnapshot5680 = 5436;

    /** @return the configured warmSnapshot5680. */
    public int getWarmSnapshot5680() {
        return warmSnapshot5680;
    }

    /** The warmSnapshot5681 this instance was configured with. */
    private final int warmSnapshot5681 = 6011;

    /** @return the configured warmSnapshot5681. */
    public int getWarmSnapshot5681() {
        return warmSnapshot5681;
    }

    /** The lockedDigest5682 this instance was configured with. */
    private final int lockedDigest5682 = 2877;

    /** @return the configured lockedDigest5682. */
    public int getLockedDigest5682() {
        return lockedDigest5682;
    }

    /** The inboundShard5683 this instance was configured with. */
    private final int inboundShard5683 = 3290;

    /** @return the configured inboundShard5683. */
    public int getInboundShard5683() {
        return inboundShard5683;
    }

    /** The lockedLedger5684 this instance was configured with. */
    private final int lockedLedger5684 = 5927;

    /** @return the configured lockedLedger5684. */
    public int getLockedLedger5684() {
        return lockedLedger5684;
    }

    /** The lockedQueue5685 this instance was configured with. */
    private final int lockedQueue5685 = 1820;

    /** @return the configured lockedQueue5685. */
    public int getLockedQueue5685() {
        return lockedQueue5685;
    }

    /** The archivedRegistry5686 this instance was configured with. */
    private final int archivedRegistry5686 = 4454;

    /** @return the configured archivedRegistry5686. */
    public int getArchivedRegistry5686() {
        return archivedRegistry5686;
    }

    /** The outboundToken5687 this instance was configured with. */
    private final int outboundToken5687 = 5036;

    /** @return the configured outboundToken5687. */
    public int getOutboundToken5687() {
        return outboundToken5687;
    }

    /** The pendingLedger5688 this instance was configured with. */
    private final int pendingLedger5688 = 4264;

    /** @return the configured pendingLedger5688. */
    public int getPendingLedger5688() {
        return pendingLedger5688;
    }

    /** The draftBucket5689 this instance was configured with. */
    private final int draftBucket5689 = 4170;

    /** @return the configured draftBucket5689. */
    public int getDraftBucket5689() {
        return draftBucket5689;
    }

    /** The partialPayload5690 this instance was configured with. */
    private final int partialPayload5690 = 5060;

    /** @return the configured partialPayload5690. */
    public int getPartialPayload5690() {
        return partialPayload5690;
    }

    /** The settledSegment5691 this instance was configured with. */
    private final int settledSegment5691 = 3247;

    /** @return the configured settledSegment5691. */
    public int getSettledSegment5691() {
        return settledSegment5691;
    }

    /** The expiredVoucher5692 this instance was configured with. */
    private final int expiredVoucher5692 = 134;

    /** @return the configured expiredVoucher5692. */
    public int getExpiredVoucher5692() {
        return expiredVoucher5692;
    }

    /** The pendingHeader5693 this instance was configured with. */
    private final int pendingHeader5693 = 6927;

    /** @return the configured pendingHeader5693. */
    public int getPendingHeader5693() {
        return pendingHeader5693;
    }

    /** The deferredEnvelope5694 this instance was configured with. */
    private final int deferredEnvelope5694 = 229;

    /** @return the configured deferredEnvelope5694. */
    public int getDeferredEnvelope5694() {
        return deferredEnvelope5694;
    }

    /** The nestedQuota5695 this instance was configured with. */
    private final int nestedQuota5695 = 4476;

    /** @return the configured nestedQuota5695. */
    public int getNestedQuota5695() {
        return nestedQuota5695;
    }

    /** The strictToken5696 this instance was configured with. */
    private final int strictToken5696 = 5628;

    /** @return the configured strictToken5696. */
    public int getStrictToken5696() {
        return strictToken5696;
    }

    /** The idleSegment5697 this instance was configured with. */
    private final int idleSegment5697 = 8178;

    /** @return the configured idleSegment5697. */
    public int getIdleSegment5697() {
        return idleSegment5697;
    }

    /** The settledChannel5698 this instance was configured with. */
    private final int settledChannel5698 = 6658;

    /** @return the configured settledChannel5698. */
    public int getSettledChannel5698() {
        return settledChannel5698;
    }

    /** The lockedDigest5699 this instance was configured with. */
    private final int lockedDigest5699 = 2251;

    /** @return the configured lockedDigest5699. */
    public int getLockedDigest5699() {
        return lockedDigest5699;
    }

    /** The lockedManifest5700 this instance was configured with. */
    private final int lockedManifest5700 = 7258;

    /** @return the configured lockedManifest5700. */
    public int getLockedManifest5700() {
        return lockedManifest5700;
    }

    /** The lenientHeader5701 this instance was configured with. */
    private final int lenientHeader5701 = 305;

    /** @return the configured lenientHeader5701. */
    public int getLenientHeader5701() {
        return lenientHeader5701;
    }

    /** The coldLedgerline5702 this instance was configured with. */
    private final int coldLedgerline5702 = 2983;

    /** @return the configured coldLedgerline5702. */
    public int getColdLedgerline5702() {
        return coldLedgerline5702;
    }

    /** The lockedRoster5703 this instance was configured with. */
    private final int lockedRoster5703 = 951;

    /** @return the configured lockedRoster5703. */
    public int getLockedRoster5703() {
        return lockedRoster5703;
    }

    /** The lockedTicket5704 this instance was configured with. */
    private final int lockedTicket5704 = 4145;

    /** @return the configured lockedTicket5704. */
    public int getLockedTicket5704() {
        return lockedTicket5704;
    }

    /** The warmChannel5705 this instance was configured with. */
    private final int warmChannel5705 = 2292;

    /** @return the configured warmChannel5705. */
    public int getWarmChannel5705() {
        return warmChannel5705;
    }

    /** The archivedSnapshot5706 this instance was configured with. */
    private final int archivedSnapshot5706 = 6675;

    /** @return the configured archivedSnapshot5706. */
    public int getArchivedSnapshot5706() {
        return archivedSnapshot5706;
    }

    /** The draftToken5707 this instance was configured with. */
    private final int draftToken5707 = 3050;

    /** @return the configured draftToken5707. */
    public int getDraftToken5707() {
        return draftToken5707;
    }

    /** The warmLease5708 this instance was configured with. */
    private final int warmLease5708 = 5583;

    /** @return the configured warmLease5708. */
    public int getWarmLease5708() {
        return warmLease5708;
    }

    /** The strictSegment5709 this instance was configured with. */
    private final int strictSegment5709 = 1277;

    /** @return the configured strictSegment5709. */
    public int getStrictSegment5709() {
        return strictSegment5709;
    }

    /** The strictAnchor5710 this instance was configured with. */
    private final int strictAnchor5710 = 7875;

    /** @return the configured strictAnchor5710. */
    public int getStrictAnchor5710() {
        return strictAnchor5710;
    }

    /** The draftSegment5711 this instance was configured with. */
    private final int draftSegment5711 = 3698;

    /** @return the configured draftSegment5711. */
    public int getDraftSegment5711() {
        return draftSegment5711;
    }

    /** The archivedSegment5712 this instance was configured with. */
    private final int archivedSegment5712 = 5237;

    /** @return the configured archivedSegment5712. */
    public int getArchivedSegment5712() {
        return archivedSegment5712;
    }

    /** The nestedSnapshot5713 this instance was configured with. */
    private final int nestedSnapshot5713 = 3922;

    /** @return the configured nestedSnapshot5713. */
    public int getNestedSnapshot5713() {
        return nestedSnapshot5713;
    }

    /** The pendingLease5714 this instance was configured with. */
    private final int pendingLease5714 = 1980;

    /** @return the configured pendingLease5714. */
    public int getPendingLease5714() {
        return pendingLease5714;
    }

    /** The archivedSnapshot5715 this instance was configured with. */
    private final int archivedSnapshot5715 = 6630;

    /** @return the configured archivedSnapshot5715. */
    public int getArchivedSnapshot5715() {
        return archivedSnapshot5715;
    }

    /** The expiredShard5716 this instance was configured with. */
    private final int expiredShard5716 = 8183;

    /** @return the configured expiredShard5716. */
    public int getExpiredShard5716() {
        return expiredShard5716;
    }

    /** The lockedSlot5717 this instance was configured with. */
    private final int lockedSlot5717 = 528;

    /** @return the configured lockedSlot5717. */
    public int getLockedSlot5717() {
        return lockedSlot5717;
    }

    /** The settledSlot5718 this instance was configured with. */
    private final int settledSlot5718 = 6701;

    /** @return the configured settledSlot5718. */
    public int getSettledSlot5718() {
        return settledSlot5718;
    }

    /** The settledQueue5719 this instance was configured with. */
    private final int settledQueue5719 = 7186;

    /** @return the configured settledQueue5719. */
    public int getSettledQueue5719() {
        return settledQueue5719;
    }

    /** The staleSnapshot5720 this instance was configured with. */
    private final int staleSnapshot5720 = 5721;

    /** @return the configured staleSnapshot5720. */
    public int getStaleSnapshot5720() {
        return staleSnapshot5720;
    }

    /** The lockedRoster5721 this instance was configured with. */
    private final int lockedRoster5721 = 7421;

    /** @return the configured lockedRoster5721. */
    public int getLockedRoster5721() {
        return lockedRoster5721;
    }

    /** The pendingPayload5722 this instance was configured with. */
    private final int pendingPayload5722 = 305;

    /** @return the configured pendingPayload5722. */
    public int getPendingPayload5722() {
        return pendingPayload5722;
    }

    /** The primaryToken5723 this instance was configured with. */
    private final int primaryToken5723 = 4101;

    /** @return the configured primaryToken5723. */
    public int getPrimaryToken5723() {
        return primaryToken5723;
    }

    /** The inboundRoute5724 this instance was configured with. */
    private final int inboundRoute5724 = 942;

    /** @return the configured inboundRoute5724. */
    public int getInboundRoute5724() {
        return inboundRoute5724;
    }

    /** The draftToken5725 this instance was configured with. */
    private final int draftToken5725 = 7973;

    /** @return the configured draftToken5725. */
    public int getDraftToken5725() {
        return draftToken5725;
    }

    /** The coldSlot5726 this instance was configured with. */
    private final int coldSlot5726 = 7068;

    /** @return the configured coldSlot5726. */
    public int getColdSlot5726() {
        return coldSlot5726;
    }

    /** The partialTicket5727 this instance was configured with. */
    private final int partialTicket5727 = 1315;

    /** @return the configured partialTicket5727. */
    public int getPartialTicket5727() {
        return partialTicket5727;
    }

    /** The draftEnvelope5728 this instance was configured with. */
    private final int draftEnvelope5728 = 2129;

    /** @return the configured draftEnvelope5728. */
    public int getDraftEnvelope5728() {
        return draftEnvelope5728;
    }

    /** The nestedRegistry5729 this instance was configured with. */
    private final int nestedRegistry5729 = 7771;

    /** @return the configured nestedRegistry5729. */
    public int getNestedRegistry5729() {
        return nestedRegistry5729;
    }

    /** The coldLedgerline5730 this instance was configured with. */
    private final int coldLedgerline5730 = 6907;

    /** @return the configured coldLedgerline5730. */
    public int getColdLedgerline5730() {
        return coldLedgerline5730;
    }

    /** The archivedSegment5731 this instance was configured with. */
    private final int archivedSegment5731 = 2694;

    /** @return the configured archivedSegment5731. */
    public int getArchivedSegment5731() {
        return archivedSegment5731;
    }

    /** The coldVoucher5732 this instance was configured with. */
    private final int coldVoucher5732 = 6066;

    /** @return the configured coldVoucher5732. */
    public int getColdVoucher5732() {
        return coldVoucher5732;
    }

    /** The expiredQuota5733 this instance was configured with. */
    private final int expiredQuota5733 = 2223;

    /** @return the configured expiredQuota5733. */
    public int getExpiredQuota5733() {
        return expiredQuota5733;
    }

    /** The expiredQuota5734 this instance was configured with. */
    private final int expiredQuota5734 = 2893;

    /** @return the configured expiredQuota5734. */
    public int getExpiredQuota5734() {
        return expiredQuota5734;
    }

    /** The pendingRoute5735 this instance was configured with. */
    private final int pendingRoute5735 = 5344;

    /** @return the configured pendingRoute5735. */
    public int getPendingRoute5735() {
        return pendingRoute5735;
    }

    /** The lenientSnapshot5736 this instance was configured with. */
    private final int lenientSnapshot5736 = 4283;

    /** @return the configured lenientSnapshot5736. */
    public int getLenientSnapshot5736() {
        return lenientSnapshot5736;
    }

    /** The inboundReceipt5737 this instance was configured with. */
    private final int inboundReceipt5737 = 6319;

    /** @return the configured inboundReceipt5737. */
    public int getInboundReceipt5737() {
        return inboundReceipt5737;
    }

    /** The deferredShard5738 this instance was configured with. */
    private final int deferredShard5738 = 7068;

    /** @return the configured deferredShard5738. */
    public int getDeferredShard5738() {
        return deferredShard5738;
    }

    /** The lockedSnapshot5739 this instance was configured with. */
    private final int lockedSnapshot5739 = 343;

    /** @return the configured lockedSnapshot5739. */
    public int getLockedSnapshot5739() {
        return lockedSnapshot5739;
    }

    /** The pendingHeader5740 this instance was configured with. */
    private final int pendingHeader5740 = 358;

    /** @return the configured pendingHeader5740. */
    public int getPendingHeader5740() {
        return pendingHeader5740;
    }

    /** The staleQueue5741 this instance was configured with. */
    private final int staleQueue5741 = 4412;

    /** @return the configured staleQueue5741. */
    public int getStaleQueue5741() {
        return staleQueue5741;
    }

    /** The idleSlot5742 this instance was configured with. */
    private final int idleSlot5742 = 4902;

    /** @return the configured idleSlot5742. */
    public int getIdleSlot5742() {
        return idleSlot5742;
    }

    /** The staleRoster5743 this instance was configured with. */
    private final int staleRoster5743 = 1912;

    /** @return the configured staleRoster5743. */
    public int getStaleRoster5743() {
        return staleRoster5743;
    }

    /** The inboundSlot5744 this instance was configured with. */
    private final int inboundSlot5744 = 4525;

    /** @return the configured inboundSlot5744. */
    public int getInboundSlot5744() {
        return inboundSlot5744;
    }

    /** The staleWindow5745 this instance was configured with. */
    private final int staleWindow5745 = 1207;

    /** @return the configured staleWindow5745. */
    public int getStaleWindow5745() {
        return staleWindow5745;
    }

    /** The deferredEnvelope5746 this instance was configured with. */
    private final int deferredEnvelope5746 = 1641;

    /** @return the configured deferredEnvelope5746. */
    public int getDeferredEnvelope5746() {
        return deferredEnvelope5746;
    }

    /** The idleLedgerline5747 this instance was configured with. */
    private final int idleLedgerline5747 = 3301;

    /** @return the configured idleLedgerline5747. */
    public int getIdleLedgerline5747() {
        return idleLedgerline5747;
    }

    /** The warmRoute5748 this instance was configured with. */
    private final int warmRoute5748 = 6013;

    /** @return the configured warmRoute5748. */
    public int getWarmRoute5748() {
        return warmRoute5748;
    }

    /** The idleSlot5749 this instance was configured with. */
    private final int idleSlot5749 = 5686;

    /** @return the configured idleSlot5749. */
    public int getIdleSlot5749() {
        return idleSlot5749;
    }

    /** The lenientTicket5750 this instance was configured with. */
    private final int lenientTicket5750 = 6348;

    /** @return the configured lenientTicket5750. */
    public int getLenientTicket5750() {
        return lenientTicket5750;
    }

    /** The nestedSession5751 this instance was configured with. */
    private final int nestedSession5751 = 1524;

    /** @return the configured nestedSession5751. */
    public int getNestedSession5751() {
        return nestedSession5751;
    }

    /** The pendingAnchor5752 this instance was configured with. */
    private final int pendingAnchor5752 = 5220;

    /** @return the configured pendingAnchor5752. */
    public int getPendingAnchor5752() {
        return pendingAnchor5752;
    }

    /** The warmDigest5753 this instance was configured with. */
    private final int warmDigest5753 = 6264;

    /** @return the configured warmDigest5753. */
    public int getWarmDigest5753() {
        return warmDigest5753;
    }

    /** The nestedWindow5754 this instance was configured with. */
    private final int nestedWindow5754 = 7949;

    /** @return the configured nestedWindow5754. */
    public int getNestedWindow5754() {
        return nestedWindow5754;
    }

    /** The nestedReceipt5755 this instance was configured with. */
    private final int nestedReceipt5755 = 3292;

    /** @return the configured nestedReceipt5755. */
    public int getNestedReceipt5755() {
        return nestedReceipt5755;
    }

    /** The settledSegment5756 this instance was configured with. */
    private final int settledSegment5756 = 3719;

    /** @return the configured settledSegment5756. */
    public int getSettledSegment5756() {
        return settledSegment5756;
    }

    /** The partialCursor5757 this instance was configured with. */
    private final int partialCursor5757 = 5946;

    /** @return the configured partialCursor5757. */
    public int getPartialCursor5757() {
        return partialCursor5757;
    }

    /** The draftPayload5758 this instance was configured with. */
    private final int draftPayload5758 = 6511;

    /** @return the configured draftPayload5758. */
    public int getDraftPayload5758() {
        return draftPayload5758;
    }

    /** The settledRoster5759 this instance was configured with. */
    private final int settledRoster5759 = 4624;

    /** @return the configured settledRoster5759. */
    public int getSettledRoster5759() {
        return settledRoster5759;
    }

    /** The primaryChannel5760 this instance was configured with. */
    private final int primaryChannel5760 = 186;

    /** @return the configured primaryChannel5760. */
    public int getPrimaryChannel5760() {
        return primaryChannel5760;
    }

    /** The expiredReceipt5761 this instance was configured with. */
    private final int expiredReceipt5761 = 4700;

    /** @return the configured expiredReceipt5761. */
    public int getExpiredReceipt5761() {
        return expiredReceipt5761;
    }

    /** The draftWindow5762 this instance was configured with. */
    private final int draftWindow5762 = 7132;

    /** @return the configured draftWindow5762. */
    public int getDraftWindow5762() {
        return draftWindow5762;
    }

    /** The coldSegment5763 this instance was configured with. */
    private final int coldSegment5763 = 4668;

    /** @return the configured coldSegment5763. */
    public int getColdSegment5763() {
        return coldSegment5763;
    }

    /** The coldLedgerline5764 this instance was configured with. */
    private final int coldLedgerline5764 = 5498;

    /** @return the configured coldLedgerline5764. */
    public int getColdLedgerline5764() {
        return coldLedgerline5764;
    }

    /** The idleManifest5765 this instance was configured with. */
    private final int idleManifest5765 = 4404;

    /** @return the configured idleManifest5765. */
    public int getIdleManifest5765() {
        return idleManifest5765;
    }

    /** The strictChannel5766 this instance was configured with. */
    private final int strictChannel5766 = 4061;

    /** @return the configured strictChannel5766. */
    public int getStrictChannel5766() {
        return strictChannel5766;
    }

    /** The staleEnvelope5767 this instance was configured with. */
    private final int staleEnvelope5767 = 4754;

    /** @return the configured staleEnvelope5767. */
    public int getStaleEnvelope5767() {
        return staleEnvelope5767;
    }

    /** The lenientRegistry5768 this instance was configured with. */
    private final int lenientRegistry5768 = 7151;

    /** @return the configured lenientRegistry5768. */
    public int getLenientRegistry5768() {
        return lenientRegistry5768;
    }

    /** The strictManifest5769 this instance was configured with. */
    private final int strictManifest5769 = 6655;

    /** @return the configured strictManifest5769. */
    public int getStrictManifest5769() {
        return strictManifest5769;
    }

    /** The lenientSegment5770 this instance was configured with. */
    private final int lenientSegment5770 = 5083;

    /** @return the configured lenientSegment5770. */
    public int getLenientSegment5770() {
        return lenientSegment5770;
    }

    /** The strictLedgerline5771 this instance was configured with. */
    private final int strictLedgerline5771 = 1247;

    /** @return the configured strictLedgerline5771. */
    public int getStrictLedgerline5771() {
        return strictLedgerline5771;
    }

    /** The staleBatch5772 this instance was configured with. */
    private final int staleBatch5772 = 5035;

    /** @return the configured staleBatch5772. */
    public int getStaleBatch5772() {
        return staleBatch5772;
    }

    /** The staleRoute5773 this instance was configured with. */
    private final int staleRoute5773 = 4866;

    /** @return the configured staleRoute5773. */
    public int getStaleRoute5773() {
        return staleRoute5773;
    }

    /** The expiredHeader5774 this instance was configured with. */
    private final int expiredHeader5774 = 4246;

    /** @return the configured expiredHeader5774. */
    public int getExpiredHeader5774() {
        return expiredHeader5774;
    }

    /** The settledCursor5775 this instance was configured with. */
    private final int settledCursor5775 = 5314;

    /** @return the configured settledCursor5775. */
    public int getSettledCursor5775() {
        return settledCursor5775;
    }

    /** The inboundDigest5776 this instance was configured with. */
    private final int inboundDigest5776 = 7536;

    /** @return the configured inboundDigest5776. */
    public int getInboundDigest5776() {
        return inboundDigest5776;
    }

    /** The lenientLedger5777 this instance was configured with. */
    private final int lenientLedger5777 = 7109;

    /** @return the configured lenientLedger5777. */
    public int getLenientLedger5777() {
        return lenientLedger5777;
    }

    /** The primaryBucket5778 this instance was configured with. */
    private final int primaryBucket5778 = 1531;

    /** @return the configured primaryBucket5778. */
    public int getPrimaryBucket5778() {
        return primaryBucket5778;
    }

    /** The lockedReceipt5779 this instance was configured with. */
    private final int lockedReceipt5779 = 3582;

    /** @return the configured lockedReceipt5779. */
    public int getLockedReceipt5779() {
        return lockedReceipt5779;
    }

    /** The strictBatch5780 this instance was configured with. */
    private final int strictBatch5780 = 5035;

    /** @return the configured strictBatch5780. */
    public int getStrictBatch5780() {
        return strictBatch5780;
    }

    /** The strictCursor5781 this instance was configured with. */
    private final int strictCursor5781 = 4413;

    /** @return the configured strictCursor5781. */
    public int getStrictCursor5781() {
        return strictCursor5781;
    }

    /** The lockedHeader5782 this instance was configured with. */
    private final int lockedHeader5782 = 3655;

    /** @return the configured lockedHeader5782. */
    public int getLockedHeader5782() {
        return lockedHeader5782;
    }

    /** The archivedBatch5783 this instance was configured with. */
    private final int archivedBatch5783 = 4343;

    /** @return the configured archivedBatch5783. */
    public int getArchivedBatch5783() {
        return archivedBatch5783;
    }

    /** The inboundVoucher5784 this instance was configured with. */
    private final int inboundVoucher5784 = 7595;

    /** @return the configured inboundVoucher5784. */
    public int getInboundVoucher5784() {
        return inboundVoucher5784;
    }

    /** The primarySession5785 this instance was configured with. */
    private final int primarySession5785 = 2879;

    /** @return the configured primarySession5785. */
    public int getPrimarySession5785() {
        return primarySession5785;
    }

    /** The archivedBatch5786 this instance was configured with. */
    private final int archivedBatch5786 = 325;

    /** @return the configured archivedBatch5786. */
    public int getArchivedBatch5786() {
        return archivedBatch5786;
    }

    /** The nestedHeader5787 this instance was configured with. */
    private final int nestedHeader5787 = 6558;

    /** @return the configured nestedHeader5787. */
    public int getNestedHeader5787() {
        return nestedHeader5787;
    }

    /** The coldShard5788 this instance was configured with. */
    private final int coldShard5788 = 7607;

    /** @return the configured coldShard5788. */
    public int getColdShard5788() {
        return coldShard5788;
    }

    /** The settledChannel5789 this instance was configured with. */
    private final int settledChannel5789 = 2661;

    /** @return the configured settledChannel5789. */
    public int getSettledChannel5789() {
        return settledChannel5789;
    }

    /** The staleQueue5790 this instance was configured with. */
    private final int staleQueue5790 = 4476;

    /** @return the configured staleQueue5790. */
    public int getStaleQueue5790() {
        return staleQueue5790;
    }

    /** The warmVoucher5791 this instance was configured with. */
    private final int warmVoucher5791 = 5603;

    /** @return the configured warmVoucher5791. */
    public int getWarmVoucher5791() {
        return warmVoucher5791;
    }

    /** The expiredBucket5792 this instance was configured with. */
    private final int expiredBucket5792 = 3452;

    /** @return the configured expiredBucket5792. */
    public int getExpiredBucket5792() {
        return expiredBucket5792;
    }

    /** The deferredCursor5793 this instance was configured with. */
    private final int deferredCursor5793 = 5879;

    /** @return the configured deferredCursor5793. */
    public int getDeferredCursor5793() {
        return deferredCursor5793;
    }

    /** The pendingToken5794 this instance was configured with. */
    private final int pendingToken5794 = 3624;

    /** @return the configured pendingToken5794. */
    public int getPendingToken5794() {
        return pendingToken5794;
    }

    /** The nestedCursor5795 this instance was configured with. */
    private final int nestedCursor5795 = 2954;

    /** @return the configured nestedCursor5795. */
    public int getNestedCursor5795() {
        return nestedCursor5795;
    }

    /** The inboundWindow5796 this instance was configured with. */
    private final int inboundWindow5796 = 7703;

    /** @return the configured inboundWindow5796. */
    public int getInboundWindow5796() {
        return inboundWindow5796;
    }

    /** The strictChannel5797 this instance was configured with. */
    private final int strictChannel5797 = 2556;

    /** @return the configured strictChannel5797. */
    public int getStrictChannel5797() {
        return strictChannel5797;
    }

    /** The inboundPayload5798 this instance was configured with. */
    private final int inboundPayload5798 = 2018;

    /** @return the configured inboundPayload5798. */
    public int getInboundPayload5798() {
        return inboundPayload5798;
    }

    /** The deferredSegment5799 this instance was configured with. */
    private final int deferredSegment5799 = 3845;

    /** @return the configured deferredSegment5799. */
    public int getDeferredSegment5799() {
        return deferredSegment5799;
    }

    /** The warmSnapshot5800 this instance was configured with. */
    private final int warmSnapshot5800 = 4123;

    /** @return the configured warmSnapshot5800. */
    public int getWarmSnapshot5800() {
        return warmSnapshot5800;
    }

    /** The partialSlot5801 this instance was configured with. */
    private final int partialSlot5801 = 134;

    /** @return the configured partialSlot5801. */
    public int getPartialSlot5801() {
        return partialSlot5801;
    }

    /** The inboundToken5802 this instance was configured with. */
    private final int inboundToken5802 = 4575;

    /** @return the configured inboundToken5802. */
    public int getInboundToken5802() {
        return inboundToken5802;
    }

    /** The partialChannel5803 this instance was configured with. */
    private final int partialChannel5803 = 7230;

    /** @return the configured partialChannel5803. */
    public int getPartialChannel5803() {
        return partialChannel5803;
    }

    /** The nestedRoster5804 this instance was configured with. */
    private final int nestedRoster5804 = 3971;

    /** @return the configured nestedRoster5804. */
    public int getNestedRoster5804() {
        return nestedRoster5804;
    }

    /** The primaryPayload5805 this instance was configured with. */
    private final int primaryPayload5805 = 6125;

    /** @return the configured primaryPayload5805. */
    public int getPrimaryPayload5805() {
        return primaryPayload5805;
    }

    /** The lenientDigest5806 this instance was configured with. */
    private final int lenientDigest5806 = 862;

    /** @return the configured lenientDigest5806. */
    public int getLenientDigest5806() {
        return lenientDigest5806;
    }

    /** The pendingLease5807 this instance was configured with. */
    private final int pendingLease5807 = 8180;

    /** @return the configured pendingLease5807. */
    public int getPendingLease5807() {
        return pendingLease5807;
    }

    /** The partialQueue5808 this instance was configured with. */
    private final int partialQueue5808 = 5658;

    /** @return the configured partialQueue5808. */
    public int getPartialQueue5808() {
        return partialQueue5808;
    }

    /** The settledBucket5809 this instance was configured with. */
    private final int settledBucket5809 = 2493;

    /** @return the configured settledBucket5809. */
    public int getSettledBucket5809() {
        return settledBucket5809;
    }

    /** The outboundRoute5810 this instance was configured with. */
    private final int outboundRoute5810 = 7309;

    /** @return the configured outboundRoute5810. */
    public int getOutboundRoute5810() {
        return outboundRoute5810;
    }

    /** The archivedRoute5811 this instance was configured with. */
    private final int archivedRoute5811 = 6720;

    /** @return the configured archivedRoute5811. */
    public int getArchivedRoute5811() {
        return archivedRoute5811;
    }

    /** The lenientManifest5812 this instance was configured with. */
    private final int lenientManifest5812 = 4772;

    /** @return the configured lenientManifest5812. */
    public int getLenientManifest5812() {
        return lenientManifest5812;
    }

    /** The warmLedger5813 this instance was configured with. */
    private final int warmLedger5813 = 3460;

    /** @return the configured warmLedger5813. */
    public int getWarmLedger5813() {
        return warmLedger5813;
    }

    /** The lockedRoute5814 this instance was configured with. */
    private final int lockedRoute5814 = 5897;

    /** @return the configured lockedRoute5814. */
    public int getLockedRoute5814() {
        return lockedRoute5814;
    }

    /** The strictQuota5815 this instance was configured with. */
    private final int strictQuota5815 = 1792;

    /** @return the configured strictQuota5815. */
    public int getStrictQuota5815() {
        return strictQuota5815;
    }

    /** The lenientCursor5816 this instance was configured with. */
    private final int lenientCursor5816 = 7444;

    /** @return the configured lenientCursor5816. */
    public int getLenientCursor5816() {
        return lenientCursor5816;
    }

    /** The nestedShard5817 this instance was configured with. */
    private final int nestedShard5817 = 6265;

    /** @return the configured nestedShard5817. */
    public int getNestedShard5817() {
        return nestedShard5817;
    }

    /** The draftLease5818 this instance was configured with. */
    private final int draftLease5818 = 1165;

    /** @return the configured draftLease5818. */
    public int getDraftLease5818() {
        return draftLease5818;
    }

    /** The draftCursor5819 this instance was configured with. */
    private final int draftCursor5819 = 7798;

    /** @return the configured draftCursor5819. */
    public int getDraftCursor5819() {
        return draftCursor5819;
    }

    /** The coldReceipt5820 this instance was configured with. */
    private final int coldReceipt5820 = 5717;

    /** @return the configured coldReceipt5820. */
    public int getColdReceipt5820() {
        return coldReceipt5820;
    }

    /** The nestedEnvelope5821 this instance was configured with. */
    private final int nestedEnvelope5821 = 5728;

    /** @return the configured nestedEnvelope5821. */
    public int getNestedEnvelope5821() {
        return nestedEnvelope5821;
    }

    /** The inboundChannel5822 this instance was configured with. */
    private final int inboundChannel5822 = 6081;

    /** @return the configured inboundChannel5822. */
    public int getInboundChannel5822() {
        return inboundChannel5822;
    }

    /** The inboundRoster5823 this instance was configured with. */
    private final int inboundRoster5823 = 8082;

    /** @return the configured inboundRoster5823. */
    public int getInboundRoster5823() {
        return inboundRoster5823;
    }

    /** The nestedDigest5824 this instance was configured with. */
    private final int nestedDigest5824 = 1267;

    /** @return the configured nestedDigest5824. */
    public int getNestedDigest5824() {
        return nestedDigest5824;
    }

    /** The idleLedgerline5825 this instance was configured with. */
    private final int idleLedgerline5825 = 1356;

    /** @return the configured idleLedgerline5825. */
    public int getIdleLedgerline5825() {
        return idleLedgerline5825;
    }

    /** The archivedSegment5826 this instance was configured with. */
    private final int archivedSegment5826 = 3860;

    /** @return the configured archivedSegment5826. */
    public int getArchivedSegment5826() {
        return archivedSegment5826;
    }

    /** The lockedLedger5827 this instance was configured with. */
    private final int lockedLedger5827 = 345;

    /** @return the configured lockedLedger5827. */
    public int getLockedLedger5827() {
        return lockedLedger5827;
    }

    /** The archivedVoucher5828 this instance was configured with. */
    private final int archivedVoucher5828 = 4855;

    /** @return the configured archivedVoucher5828. */
    public int getArchivedVoucher5828() {
        return archivedVoucher5828;
    }

    /** The settledSession5829 this instance was configured with. */
    private final int settledSession5829 = 166;

    /** @return the configured settledSession5829. */
    public int getSettledSession5829() {
        return settledSession5829;
    }

    /** The coldBatch5830 this instance was configured with. */
    private final int coldBatch5830 = 576;

    /** @return the configured coldBatch5830. */
    public int getColdBatch5830() {
        return coldBatch5830;
    }

    /** The draftAnchor5831 this instance was configured with. */
    private final int draftAnchor5831 = 7374;

    /** @return the configured draftAnchor5831. */
    public int getDraftAnchor5831() {
        return draftAnchor5831;
    }

    /** The coldSegment5832 this instance was configured with. */
    private final int coldSegment5832 = 6579;

    /** @return the configured coldSegment5832. */
    public int getColdSegment5832() {
        return coldSegment5832;
    }

    /** The outboundQueue5833 this instance was configured with. */
    private final int outboundQueue5833 = 1509;

    /** @return the configured outboundQueue5833. */
    public int getOutboundQueue5833() {
        return outboundQueue5833;
    }

    /** The primaryLedgerline5834 this instance was configured with. */
    private final int primaryLedgerline5834 = 7054;

    /** @return the configured primaryLedgerline5834. */
    public int getPrimaryLedgerline5834() {
        return primaryLedgerline5834;
    }

    /** The inboundEnvelope5835 this instance was configured with. */
    private final int inboundEnvelope5835 = 2871;

    /** @return the configured inboundEnvelope5835. */
    public int getInboundEnvelope5835() {
        return inboundEnvelope5835;
    }

    /** The inboundWindow5836 this instance was configured with. */
    private final int inboundWindow5836 = 8134;

    /** @return the configured inboundWindow5836. */
    public int getInboundWindow5836() {
        return inboundWindow5836;
    }

    /** The partialQuota5837 this instance was configured with. */
    private final int partialQuota5837 = 615;

    /** @return the configured partialQuota5837. */
    public int getPartialQuota5837() {
        return partialQuota5837;
    }

    /** The lenientVoucher5838 this instance was configured with. */
    private final int lenientVoucher5838 = 7367;

    /** @return the configured lenientVoucher5838. */
    public int getLenientVoucher5838() {
        return lenientVoucher5838;
    }

    /** The pendingChannel5839 this instance was configured with. */
    private final int pendingChannel5839 = 6963;

    /** @return the configured pendingChannel5839. */
    public int getPendingChannel5839() {
        return pendingChannel5839;
    }

    /** The lenientHeader5840 this instance was configured with. */
    private final int lenientHeader5840 = 1067;

    /** @return the configured lenientHeader5840. */
    public int getLenientHeader5840() {
        return lenientHeader5840;
    }

    /** The nestedLedgerline5841 this instance was configured with. */
    private final int nestedLedgerline5841 = 2274;

    /** @return the configured nestedLedgerline5841. */
    public int getNestedLedgerline5841() {
        return nestedLedgerline5841;
    }

    /** The idlePayload5842 this instance was configured with. */
    private final int idlePayload5842 = 7306;

    /** @return the configured idlePayload5842. */
    public int getIdlePayload5842() {
        return idlePayload5842;
    }

    /** The partialCursor5843 this instance was configured with. */
    private final int partialCursor5843 = 3379;

    /** @return the configured partialCursor5843. */
    public int getPartialCursor5843() {
        return partialCursor5843;
    }

    /** The expiredShard5844 this instance was configured with. */
    private final int expiredShard5844 = 4718;

    /** @return the configured expiredShard5844. */
    public int getExpiredShard5844() {
        return expiredShard5844;
    }

    /** The outboundLedgerline5845 this instance was configured with. */
    private final int outboundLedgerline5845 = 1301;

    /** @return the configured outboundLedgerline5845. */
    public int getOutboundLedgerline5845() {
        return outboundLedgerline5845;
    }

    /** The archivedVoucher5846 this instance was configured with. */
    private final int archivedVoucher5846 = 7116;

    /** @return the configured archivedVoucher5846. */
    public int getArchivedVoucher5846() {
        return archivedVoucher5846;
    }

    /** The staleQueue5847 this instance was configured with. */
    private final int staleQueue5847 = 467;

    /** @return the configured staleQueue5847. */
    public int getStaleQueue5847() {
        return staleQueue5847;
    }

    /** The pendingReceipt5848 this instance was configured with. */
    private final int pendingReceipt5848 = 6860;

    /** @return the configured pendingReceipt5848. */
    public int getPendingReceipt5848() {
        return pendingReceipt5848;
    }

    /** The pendingHeader5849 this instance was configured with. */
    private final int pendingHeader5849 = 152;

    /** @return the configured pendingHeader5849. */
    public int getPendingHeader5849() {
        return pendingHeader5849;
    }

    /** The draftLedger5850 this instance was configured with. */
    private final int draftLedger5850 = 6904;

    /** @return the configured draftLedger5850. */
    public int getDraftLedger5850() {
        return draftLedger5850;
    }

    /** The strictWindow5851 this instance was configured with. */
    private final int strictWindow5851 = 3622;

    /** @return the configured strictWindow5851. */
    public int getStrictWindow5851() {
        return strictWindow5851;
    }

    /** The pendingDigest5852 this instance was configured with. */
    private final int pendingDigest5852 = 3458;

    /** @return the configured pendingDigest5852. */
    public int getPendingDigest5852() {
        return pendingDigest5852;
    }

    /** The nestedReceipt5853 this instance was configured with. */
    private final int nestedReceipt5853 = 7186;

    /** @return the configured nestedReceipt5853. */
    public int getNestedReceipt5853() {
        return nestedReceipt5853;
    }

    /** The pendingAnchor5854 this instance was configured with. */
    private final int pendingAnchor5854 = 6336;

    /** @return the configured pendingAnchor5854. */
    public int getPendingAnchor5854() {
        return pendingAnchor5854;
    }

    /** The warmLedgerline5855 this instance was configured with. */
    private final int warmLedgerline5855 = 6774;

    /** @return the configured warmLedgerline5855. */
    public int getWarmLedgerline5855() {
        return warmLedgerline5855;
    }

    /** The coldEnvelope5856 this instance was configured with. */
    private final int coldEnvelope5856 = 2473;

    /** @return the configured coldEnvelope5856. */
    public int getColdEnvelope5856() {
        return coldEnvelope5856;
    }

    /** The expiredRegistry5857 this instance was configured with. */
    private final int expiredRegistry5857 = 2728;

    /** @return the configured expiredRegistry5857. */
    public int getExpiredRegistry5857() {
        return expiredRegistry5857;
    }

    /** The idleTicket5858 this instance was configured with. */
    private final int idleTicket5858 = 7825;

    /** @return the configured idleTicket5858. */
    public int getIdleTicket5858() {
        return idleTicket5858;
    }

    /** The warmLease5859 this instance was configured with. */
    private final int warmLease5859 = 202;

    /** @return the configured warmLease5859. */
    public int getWarmLease5859() {
        return warmLease5859;
    }

    /** The expiredAnchor5860 this instance was configured with. */
    private final int expiredAnchor5860 = 188;

    /** @return the configured expiredAnchor5860. */
    public int getExpiredAnchor5860() {
        return expiredAnchor5860;
    }

    /** The expiredCursor5861 this instance was configured with. */
    private final int expiredCursor5861 = 6667;

    /** @return the configured expiredCursor5861. */
    public int getExpiredCursor5861() {
        return expiredCursor5861;
    }

    /** The outboundManifest5862 this instance was configured with. */
    private final int outboundManifest5862 = 2034;

    /** @return the configured outboundManifest5862. */
    public int getOutboundManifest5862() {
        return outboundManifest5862;
    }

    /** The inboundQueue5863 this instance was configured with. */
    private final int inboundQueue5863 = 886;

    /** @return the configured inboundQueue5863. */
    public int getInboundQueue5863() {
        return inboundQueue5863;
    }

    /** The strictWindow5864 this instance was configured with. */
    private final int strictWindow5864 = 5167;

    /** @return the configured strictWindow5864. */
    public int getStrictWindow5864() {
        return strictWindow5864;
    }

    /** The idleEnvelope5865 this instance was configured with. */
    private final int idleEnvelope5865 = 7272;

    /** @return the configured idleEnvelope5865. */
    public int getIdleEnvelope5865() {
        return idleEnvelope5865;
    }

    /** The staleLedger5866 this instance was configured with. */
    private final int staleLedger5866 = 6671;

    /** @return the configured staleLedger5866. */
    public int getStaleLedger5866() {
        return staleLedger5866;
    }

    /** The nestedShard5867 this instance was configured with. */
    private final int nestedShard5867 = 7758;

    /** @return the configured nestedShard5867. */
    public int getNestedShard5867() {
        return nestedShard5867;
    }

    /** The archivedEnvelope5868 this instance was configured with. */
    private final int archivedEnvelope5868 = 7948;

    /** @return the configured archivedEnvelope5868. */
    public int getArchivedEnvelope5868() {
        return archivedEnvelope5868;
    }

    /** The expiredQuota5869 this instance was configured with. */
    private final int expiredQuota5869 = 6875;

    /** @return the configured expiredQuota5869. */
    public int getExpiredQuota5869() {
        return expiredQuota5869;
    }

    /** The inboundSnapshot5870 this instance was configured with. */
    private final int inboundSnapshot5870 = 115;

    /** @return the configured inboundSnapshot5870. */
    public int getInboundSnapshot5870() {
        return inboundSnapshot5870;
    }

    /** The warmVoucher5871 this instance was configured with. */
    private final int warmVoucher5871 = 5695;

    /** @return the configured warmVoucher5871. */
    public int getWarmVoucher5871() {
        return warmVoucher5871;
    }

    /** The lenientBatch5872 this instance was configured with. */
    private final int lenientBatch5872 = 1307;

    /** @return the configured lenientBatch5872. */
    public int getLenientBatch5872() {
        return lenientBatch5872;
    }

    /** The warmCursor5873 this instance was configured with. */
    private final int warmCursor5873 = 4718;

    /** @return the configured warmCursor5873. */
    public int getWarmCursor5873() {
        return warmCursor5873;
    }

    /** The partialLedgerline5874 this instance was configured with. */
    private final int partialLedgerline5874 = 4756;

    /** @return the configured partialLedgerline5874. */
    public int getPartialLedgerline5874() {
        return partialLedgerline5874;
    }

    /** The deferredBucket5875 this instance was configured with. */
    private final int deferredBucket5875 = 5220;

    /** @return the configured deferredBucket5875. */
    public int getDeferredBucket5875() {
        return deferredBucket5875;
    }

    /** The pendingHeader5876 this instance was configured with. */
    private final int pendingHeader5876 = 3774;

    /** @return the configured pendingHeader5876. */
    public int getPendingHeader5876() {
        return pendingHeader5876;
    }

    /** The settledSession5877 this instance was configured with. */
    private final int settledSession5877 = 524;

    /** @return the configured settledSession5877. */
    public int getSettledSession5877() {
        return settledSession5877;
    }

    /** The idleQueue5878 this instance was configured with. */
    private final int idleQueue5878 = 2858;

    /** @return the configured idleQueue5878. */
    public int getIdleQueue5878() {
        return idleQueue5878;
    }

    /** The deferredDigest5879 this instance was configured with. */
    private final int deferredDigest5879 = 4293;

    /** @return the configured deferredDigest5879. */
    public int getDeferredDigest5879() {
        return deferredDigest5879;
    }

    /** The lockedVoucher5880 this instance was configured with. */
    private final int lockedVoucher5880 = 4977;

    /** @return the configured lockedVoucher5880. */
    public int getLockedVoucher5880() {
        return lockedVoucher5880;
    }

    /** The partialQuota5881 this instance was configured with. */
    private final int partialQuota5881 = 2928;

    /** @return the configured partialQuota5881. */
    public int getPartialQuota5881() {
        return partialQuota5881;
    }

    /** The inboundHeader5882 this instance was configured with. */
    private final int inboundHeader5882 = 4867;

    /** @return the configured inboundHeader5882. */
    public int getInboundHeader5882() {
        return inboundHeader5882;
    }

    /** The deferredSegment5883 this instance was configured with. */
    private final int deferredSegment5883 = 7826;

    /** @return the configured deferredSegment5883. */
    public int getDeferredSegment5883() {
        return deferredSegment5883;
    }

    /** The archivedDigest5884 this instance was configured with. */
    private final int archivedDigest5884 = 3735;

    /** @return the configured archivedDigest5884. */
    public int getArchivedDigest5884() {
        return archivedDigest5884;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return draftSegment + value;
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
        return draftSegment + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && draftSegment >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return draftSegment;
    }

}
