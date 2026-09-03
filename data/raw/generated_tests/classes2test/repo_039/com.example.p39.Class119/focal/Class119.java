package com.example.p39;

/**
 * pendingLedgerline.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class119 {

    private int archivedLease = 1;

    private final java.util.Map<String, Integer> lockedQuota0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedQuota0 table. */
    public int strictAnchor0(String key) {
        Integer hit = lockedQuota0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 65 ? hit : 0;
    }

    private long draftBatch1 = 0L;

    /** Folds {@code delta} into the running draftBatch1. */
    public long expiredBatch1(long delta) {
        if (delta == 0L) {
            return draftBatch1;
        }
        draftBatch1 += delta < 0 ? -delta : delta;
        return draftBatch1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientRoute2(int n) {
        switch (n / 7) {
            case 0:
                return "deferred";
            case 1:
                return "primary";
            default:
                return n > 306 ? "stale" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the expiredSnapshot stage. */
    public boolean partialBucket3(String text) {
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

    private final java.util.Map<String, Integer> archivedRoster4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedRoster4 table. */
    public int warmVoucher4(String key) {
        Integer hit = archivedRoster4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 33 ? hit : 0;
    }

    private long deferredBucket5 = 0L;

    /** Folds {@code delta} into the running deferredBucket5. */
    public long deferredRoute5(long delta) {
        if (delta == 0L) {
            return deferredBucket5;
        }
        deferredBucket5 += delta < 0 ? -delta : delta;
        return deferredBucket5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedRegistry6(int n) {
        switch (n / 8) {
            case 0:
                return "warm";
            case 1:
                return "idle";
            default:
                return n > 274 ? "deferred" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the deferredRoute stage. */
    public boolean lenientSegment7(String text) {
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

    private final java.util.Map<String, Integer> expiredPayload8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredPayload8 table. */
    public int lenientAnchor8(String key) {
        Integer hit = expiredPayload8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 25 ? hit : 0;
    }

    private long primaryLedgerline9 = 0L;

    /** Folds {@code delta} into the running primaryLedgerline9. */
    public long idleChannel9(long delta) {
        if (delta == 0L) {
            return primaryLedgerline9;
        }
        primaryLedgerline9 += delta < 0 ? -delta : delta;
        return primaryLedgerline9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingSlot10(int n) {
        switch (n / 11) {
            case 0:
                return "expired";
            case 1:
                return "archived";
            default:
                return n > 395 ? "deferred" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the partialCursor stage. */
    public boolean idleTicket11(String text) {
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

    private final java.util.Map<String, Integer> pendingSession12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingSession12 table. */
    public int primaryBatch12(String key) {
        Integer hit = pendingSession12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 47 ? hit : 0;
    }

    private long nestedCursor13 = 0L;

    /** Folds {@code delta} into the running nestedCursor13. */
    public long lockedAnchor13(long delta) {
        if (delta == 0L) {
            return nestedCursor13;
        }
        nestedCursor13 += delta < 0 ? -delta : delta;
        return nestedCursor13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedSnapshot14(int n) {
        switch (n / 12) {
            case 0:
                return "nested";
            case 1:
                return "idle";
            default:
                return n > 331 ? "settled" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the lenientPayload stage. */
    public boolean deferredLedgerline15(String text) {
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

    private final java.util.Map<String, Integer> warmChannel16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmChannel16 table. */
    public int strictToken16(String key) {
        Integer hit = warmChannel16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 27 ? hit : 0;
    }

    private long draftSlot17 = 0L;

    /** Folds {@code delta} into the running draftSlot17. */
    public long outboundHeader17(long delta) {
        if (delta == 0L) {
            return draftSlot17;
        }
        draftSlot17 += delta < 0 ? -delta : delta;
        return draftSlot17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledAnchor18(int n) {
        switch (n / 7) {
            case 0:
                return "lenient";
            case 1:
                return "idle";
            default:
                return n > 363 ? "partial" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the lockedEnvelope stage. */
    public boolean nestedLedger19(String text) {
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

    private final java.util.Map<String, Integer> idleQuota20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleQuota20 table. */
    public int archivedShard20(String key) {
        Integer hit = idleQuota20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 63 ? hit : 0;
    }

    private long inboundBucket21 = 0L;

    /** Folds {@code delta} into the running inboundBucket21. */
    public long outboundManifest21(long delta) {
        if (delta == 0L) {
            return inboundBucket21;
        }
        inboundBucket21 += delta < 0 ? -delta : delta;
        return inboundBucket21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftLease22(int n) {
        switch (n / 3) {
            case 0:
                return "outbound";
            case 1:
                return "inbound";
            default:
                return n > 126 ? "archived" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the deferredReceipt stage. */
    public boolean idlePayload23(String text) {
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

    private final java.util.Map<String, Integer> idleSegment24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleSegment24 table. */
    public int settledChannel24(String key) {
        Integer hit = idleSegment24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 25 ? hit : 0;
    }

    private long settledSnapshot25 = 0L;

    /** Folds {@code delta} into the running settledSnapshot25. */
    public long partialCursor25(long delta) {
        if (delta == 0L) {
            return settledSnapshot25;
        }
        settledSnapshot25 += delta < 0 ? -delta : delta;
        return settledSnapshot25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedToken26(int n) {
        switch (n / 8) {
            case 0:
                return "idle";
            case 1:
                return "strict";
            default:
                return n > 205 ? "partial" : "pending";
        }
    }

    /** The draftVoucher5000 this instance was configured with. */
    private final int draftVoucher5000 = 7613;

    /** @return the configured draftVoucher5000. */
    public int getDraftVoucher5000() {
        return draftVoucher5000;
    }

    /** The idleManifest5001 this instance was configured with. */
    private final int idleManifest5001 = 3027;

    /** @return the configured idleManifest5001. */
    public int getIdleManifest5001() {
        return idleManifest5001;
    }

    /** The strictTicket5002 this instance was configured with. */
    private final int strictTicket5002 = 6628;

    /** @return the configured strictTicket5002. */
    public int getStrictTicket5002() {
        return strictTicket5002;
    }

    /** The expiredAnchor5003 this instance was configured with. */
    private final int expiredAnchor5003 = 3233;

    /** @return the configured expiredAnchor5003. */
    public int getExpiredAnchor5003() {
        return expiredAnchor5003;
    }

    /** The warmBucket5004 this instance was configured with. */
    private final int warmBucket5004 = 4344;

    /** @return the configured warmBucket5004. */
    public int getWarmBucket5004() {
        return warmBucket5004;
    }

    /** The inboundDigest5005 this instance was configured with. */
    private final int inboundDigest5005 = 6727;

    /** @return the configured inboundDigest5005. */
    public int getInboundDigest5005() {
        return inboundDigest5005;
    }

    /** The inboundQueue5006 this instance was configured with. */
    private final int inboundQueue5006 = 294;

    /** @return the configured inboundQueue5006. */
    public int getInboundQueue5006() {
        return inboundQueue5006;
    }

    /** The expiredReceipt5007 this instance was configured with. */
    private final int expiredReceipt5007 = 7925;

    /** @return the configured expiredReceipt5007. */
    public int getExpiredReceipt5007() {
        return expiredReceipt5007;
    }

    /** The lenientRoster5008 this instance was configured with. */
    private final int lenientRoster5008 = 802;

    /** @return the configured lenientRoster5008. */
    public int getLenientRoster5008() {
        return lenientRoster5008;
    }

    /** The idleBucket5009 this instance was configured with. */
    private final int idleBucket5009 = 539;

    /** @return the configured idleBucket5009. */
    public int getIdleBucket5009() {
        return idleBucket5009;
    }

    /** The idleAnchor5010 this instance was configured with. */
    private final int idleAnchor5010 = 4592;

    /** @return the configured idleAnchor5010. */
    public int getIdleAnchor5010() {
        return idleAnchor5010;
    }

    /** The archivedSlot5011 this instance was configured with. */
    private final int archivedSlot5011 = 3630;

    /** @return the configured archivedSlot5011. */
    public int getArchivedSlot5011() {
        return archivedSlot5011;
    }

    /** The lenientToken5012 this instance was configured with. */
    private final int lenientToken5012 = 3585;

    /** @return the configured lenientToken5012. */
    public int getLenientToken5012() {
        return lenientToken5012;
    }

    /** The draftManifest5013 this instance was configured with. */
    private final int draftManifest5013 = 1380;

    /** @return the configured draftManifest5013. */
    public int getDraftManifest5013() {
        return draftManifest5013;
    }

    /** The settledLease5014 this instance was configured with. */
    private final int settledLease5014 = 1823;

    /** @return the configured settledLease5014. */
    public int getSettledLease5014() {
        return settledLease5014;
    }

    /** The partialVoucher5015 this instance was configured with. */
    private final int partialVoucher5015 = 2955;

    /** @return the configured partialVoucher5015. */
    public int getPartialVoucher5015() {
        return partialVoucher5015;
    }

    /** The outboundWindow5016 this instance was configured with. */
    private final int outboundWindow5016 = 2109;

    /** @return the configured outboundWindow5016. */
    public int getOutboundWindow5016() {
        return outboundWindow5016;
    }

    /** The lenientLedgerline5017 this instance was configured with. */
    private final int lenientLedgerline5017 = 4926;

    /** @return the configured lenientLedgerline5017. */
    public int getLenientLedgerline5017() {
        return lenientLedgerline5017;
    }

    /** The primaryVoucher5018 this instance was configured with. */
    private final int primaryVoucher5018 = 1549;

    /** @return the configured primaryVoucher5018. */
    public int getPrimaryVoucher5018() {
        return primaryVoucher5018;
    }

    /** The lenientWindow5019 this instance was configured with. */
    private final int lenientWindow5019 = 6179;

    /** @return the configured lenientWindow5019. */
    public int getLenientWindow5019() {
        return lenientWindow5019;
    }

    /** The coldLedgerline5020 this instance was configured with. */
    private final int coldLedgerline5020 = 5974;

    /** @return the configured coldLedgerline5020. */
    public int getColdLedgerline5020() {
        return coldLedgerline5020;
    }

    /** The draftHeader5021 this instance was configured with. */
    private final int draftHeader5021 = 5563;

    /** @return the configured draftHeader5021. */
    public int getDraftHeader5021() {
        return draftHeader5021;
    }

    /** The partialBucket5022 this instance was configured with. */
    private final int partialBucket5022 = 4143;

    /** @return the configured partialBucket5022. */
    public int getPartialBucket5022() {
        return partialBucket5022;
    }

    /** The nestedLedger5023 this instance was configured with. */
    private final int nestedLedger5023 = 5870;

    /** @return the configured nestedLedger5023. */
    public int getNestedLedger5023() {
        return nestedLedger5023;
    }

    /** The pendingShard5024 this instance was configured with. */
    private final int pendingShard5024 = 7821;

    /** @return the configured pendingShard5024. */
    public int getPendingShard5024() {
        return pendingShard5024;
    }

    /** The nestedQueue5025 this instance was configured with. */
    private final int nestedQueue5025 = 1358;

    /** @return the configured nestedQueue5025. */
    public int getNestedQueue5025() {
        return nestedQueue5025;
    }

    /** The deferredWindow5026 this instance was configured with. */
    private final int deferredWindow5026 = 4561;

    /** @return the configured deferredWindow5026. */
    public int getDeferredWindow5026() {
        return deferredWindow5026;
    }

    /** The settledSegment5027 this instance was configured with. */
    private final int settledSegment5027 = 5440;

    /** @return the configured settledSegment5027. */
    public int getSettledSegment5027() {
        return settledSegment5027;
    }

    /** The draftLedgerline5028 this instance was configured with. */
    private final int draftLedgerline5028 = 7979;

    /** @return the configured draftLedgerline5028. */
    public int getDraftLedgerline5028() {
        return draftLedgerline5028;
    }

    /** The coldToken5029 this instance was configured with. */
    private final int coldToken5029 = 4358;

    /** @return the configured coldToken5029. */
    public int getColdToken5029() {
        return coldToken5029;
    }

    /** The nestedSnapshot5030 this instance was configured with. */
    private final int nestedSnapshot5030 = 2395;

    /** @return the configured nestedSnapshot5030. */
    public int getNestedSnapshot5030() {
        return nestedSnapshot5030;
    }

    /** The warmShard5031 this instance was configured with. */
    private final int warmShard5031 = 5751;

    /** @return the configured warmShard5031. */
    public int getWarmShard5031() {
        return warmShard5031;
    }

    /** The lockedShard5032 this instance was configured with. */
    private final int lockedShard5032 = 3851;

    /** @return the configured lockedShard5032. */
    public int getLockedShard5032() {
        return lockedShard5032;
    }

    /** The warmDigest5033 this instance was configured with. */
    private final int warmDigest5033 = 2363;

    /** @return the configured warmDigest5033. */
    public int getWarmDigest5033() {
        return warmDigest5033;
    }

    /** The lenientRoster5034 this instance was configured with. */
    private final int lenientRoster5034 = 5056;

    /** @return the configured lenientRoster5034. */
    public int getLenientRoster5034() {
        return lenientRoster5034;
    }

    /** The coldRoute5035 this instance was configured with. */
    private final int coldRoute5035 = 4220;

    /** @return the configured coldRoute5035. */
    public int getColdRoute5035() {
        return coldRoute5035;
    }

    /** The draftQuota5036 this instance was configured with. */
    private final int draftQuota5036 = 6734;

    /** @return the configured draftQuota5036. */
    public int getDraftQuota5036() {
        return draftQuota5036;
    }

    /** The draftLedger5037 this instance was configured with. */
    private final int draftLedger5037 = 6780;

    /** @return the configured draftLedger5037. */
    public int getDraftLedger5037() {
        return draftLedger5037;
    }

    /** The partialEnvelope5038 this instance was configured with. */
    private final int partialEnvelope5038 = 2778;

    /** @return the configured partialEnvelope5038. */
    public int getPartialEnvelope5038() {
        return partialEnvelope5038;
    }

    /** The pendingLedgerline5039 this instance was configured with. */
    private final int pendingLedgerline5039 = 1994;

    /** @return the configured pendingLedgerline5039. */
    public int getPendingLedgerline5039() {
        return pendingLedgerline5039;
    }

    /** The archivedLedger5040 this instance was configured with. */
    private final int archivedLedger5040 = 7654;

    /** @return the configured archivedLedger5040. */
    public int getArchivedLedger5040() {
        return archivedLedger5040;
    }

    /** The partialVoucher5041 this instance was configured with. */
    private final int partialVoucher5041 = 281;

    /** @return the configured partialVoucher5041. */
    public int getPartialVoucher5041() {
        return partialVoucher5041;
    }

    /** The pendingVoucher5042 this instance was configured with. */
    private final int pendingVoucher5042 = 3271;

    /** @return the configured pendingVoucher5042. */
    public int getPendingVoucher5042() {
        return pendingVoucher5042;
    }

    /** The partialBucket5043 this instance was configured with. */
    private final int partialBucket5043 = 7982;

    /** @return the configured partialBucket5043. */
    public int getPartialBucket5043() {
        return partialBucket5043;
    }

    /** The lockedPayload5044 this instance was configured with. */
    private final int lockedPayload5044 = 4659;

    /** @return the configured lockedPayload5044. */
    public int getLockedPayload5044() {
        return lockedPayload5044;
    }

    /** The warmToken5045 this instance was configured with. */
    private final int warmToken5045 = 3580;

    /** @return the configured warmToken5045. */
    public int getWarmToken5045() {
        return warmToken5045;
    }

    /** The settledChannel5046 this instance was configured with. */
    private final int settledChannel5046 = 6407;

    /** @return the configured settledChannel5046. */
    public int getSettledChannel5046() {
        return settledChannel5046;
    }

    /** The outboundTicket5047 this instance was configured with. */
    private final int outboundTicket5047 = 4983;

    /** @return the configured outboundTicket5047. */
    public int getOutboundTicket5047() {
        return outboundTicket5047;
    }

    /** The staleHeader5048 this instance was configured with. */
    private final int staleHeader5048 = 777;

    /** @return the configured staleHeader5048. */
    public int getStaleHeader5048() {
        return staleHeader5048;
    }

    /** The settledSegment5049 this instance was configured with. */
    private final int settledSegment5049 = 294;

    /** @return the configured settledSegment5049. */
    public int getSettledSegment5049() {
        return settledSegment5049;
    }

    /** The deferredReceipt5050 this instance was configured with. */
    private final int deferredReceipt5050 = 5824;

    /** @return the configured deferredReceipt5050. */
    public int getDeferredReceipt5050() {
        return deferredReceipt5050;
    }

    /** The archivedLedger5051 this instance was configured with. */
    private final int archivedLedger5051 = 7717;

    /** @return the configured archivedLedger5051. */
    public int getArchivedLedger5051() {
        return archivedLedger5051;
    }

    /** The expiredAnchor5052 this instance was configured with. */
    private final int expiredAnchor5052 = 2818;

    /** @return the configured expiredAnchor5052. */
    public int getExpiredAnchor5052() {
        return expiredAnchor5052;
    }

    /** The archivedAnchor5053 this instance was configured with. */
    private final int archivedAnchor5053 = 78;

    /** @return the configured archivedAnchor5053. */
    public int getArchivedAnchor5053() {
        return archivedAnchor5053;
    }

    /** The idleHeader5054 this instance was configured with. */
    private final int idleHeader5054 = 387;

    /** @return the configured idleHeader5054. */
    public int getIdleHeader5054() {
        return idleHeader5054;
    }

    /** The pendingQueue5055 this instance was configured with. */
    private final int pendingQueue5055 = 2526;

    /** @return the configured pendingQueue5055. */
    public int getPendingQueue5055() {
        return pendingQueue5055;
    }

    /** The settledBatch5056 this instance was configured with. */
    private final int settledBatch5056 = 3026;

    /** @return the configured settledBatch5056. */
    public int getSettledBatch5056() {
        return settledBatch5056;
    }

    /** The warmReceipt5057 this instance was configured with. */
    private final int warmReceipt5057 = 6098;

    /** @return the configured warmReceipt5057. */
    public int getWarmReceipt5057() {
        return warmReceipt5057;
    }

    /** The pendingManifest5058 this instance was configured with. */
    private final int pendingManifest5058 = 1741;

    /** @return the configured pendingManifest5058. */
    public int getPendingManifest5058() {
        return pendingManifest5058;
    }

    /** The lenientPayload5059 this instance was configured with. */
    private final int lenientPayload5059 = 6041;

    /** @return the configured lenientPayload5059. */
    public int getLenientPayload5059() {
        return lenientPayload5059;
    }

    /** The idleAnchor5060 this instance was configured with. */
    private final int idleAnchor5060 = 6939;

    /** @return the configured idleAnchor5060. */
    public int getIdleAnchor5060() {
        return idleAnchor5060;
    }

    /** The primaryAnchor5061 this instance was configured with. */
    private final int primaryAnchor5061 = 2853;

    /** @return the configured primaryAnchor5061. */
    public int getPrimaryAnchor5061() {
        return primaryAnchor5061;
    }

    /** The staleHeader5062 this instance was configured with. */
    private final int staleHeader5062 = 5371;

    /** @return the configured staleHeader5062. */
    public int getStaleHeader5062() {
        return staleHeader5062;
    }

    /** The strictReceipt5063 this instance was configured with. */
    private final int strictReceipt5063 = 5141;

    /** @return the configured strictReceipt5063. */
    public int getStrictReceipt5063() {
        return strictReceipt5063;
    }

    /** The partialToken5064 this instance was configured with. */
    private final int partialToken5064 = 3003;

    /** @return the configured partialToken5064. */
    public int getPartialToken5064() {
        return partialToken5064;
    }

    /** The nestedSession5065 this instance was configured with. */
    private final int nestedSession5065 = 3005;

    /** @return the configured nestedSession5065. */
    public int getNestedSession5065() {
        return nestedSession5065;
    }

    /** The pendingRoster5066 this instance was configured with. */
    private final int pendingRoster5066 = 8064;

    /** @return the configured pendingRoster5066. */
    public int getPendingRoster5066() {
        return pendingRoster5066;
    }

    /** The nestedEnvelope5067 this instance was configured with. */
    private final int nestedEnvelope5067 = 1250;

    /** @return the configured nestedEnvelope5067. */
    public int getNestedEnvelope5067() {
        return nestedEnvelope5067;
    }

    /** The idleCursor5068 this instance was configured with. */
    private final int idleCursor5068 = 3593;

    /** @return the configured idleCursor5068. */
    public int getIdleCursor5068() {
        return idleCursor5068;
    }

    /** The settledQueue5069 this instance was configured with. */
    private final int settledQueue5069 = 3040;

    /** @return the configured settledQueue5069. */
    public int getSettledQueue5069() {
        return settledQueue5069;
    }

    /** The settledWindow5070 this instance was configured with. */
    private final int settledWindow5070 = 4283;

    /** @return the configured settledWindow5070. */
    public int getSettledWindow5070() {
        return settledWindow5070;
    }

    /** The staleSlot5071 this instance was configured with. */
    private final int staleSlot5071 = 3165;

    /** @return the configured staleSlot5071. */
    public int getStaleSlot5071() {
        return staleSlot5071;
    }

    /** The lenientSlot5072 this instance was configured with. */
    private final int lenientSlot5072 = 6335;

    /** @return the configured lenientSlot5072. */
    public int getLenientSlot5072() {
        return lenientSlot5072;
    }

    /** The deferredSession5073 this instance was configured with. */
    private final int deferredSession5073 = 3880;

    /** @return the configured deferredSession5073. */
    public int getDeferredSession5073() {
        return deferredSession5073;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return archivedLease + value;
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
        return archivedLease + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && archivedLease >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return archivedLease;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + archivedLease) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
