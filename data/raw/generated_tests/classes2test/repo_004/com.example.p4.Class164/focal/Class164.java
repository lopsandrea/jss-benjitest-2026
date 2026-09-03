package com.example.p4;

/**
 * idleSegment.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class164 {

    private int coldToken = 1;

    private final java.util.Map<String, Integer> staleLease0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleLease0 table. */
    public int outboundCursor0(String key) {
        Integer hit = staleLease0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 82 ? hit : 0;
    }

    private long lenientQueue1 = 0L;

    /** Folds {@code delta} into the running lenientQueue1. */
    public long lenientLedger1(long delta) {
        if (delta == 0L) {
            return lenientQueue1;
        }
        lenientQueue1 += delta < 0 ? -delta : delta;
        return lenientQueue1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftQuota2(int n) {
        switch (n / 7) {
            case 0:
                return "cold";
            case 1:
                return "inbound";
            default:
                return n > 285 ? "partial" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the archivedDigest stage. */
    public boolean settledManifest3(String text) {
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

    private final java.util.Map<String, Integer> draftLedgerline4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftLedgerline4 table. */
    public int lockedBatch4(String key) {
        Integer hit = draftLedgerline4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 43 ? hit : 0;
    }

    private long draftQueue5 = 0L;

    /** Folds {@code delta} into the running draftQueue5. */
    public long expiredRegistry5(long delta) {
        if (delta == 0L) {
            return draftQueue5;
        }
        draftQueue5 += delta < 0 ? -delta : delta;
        return draftQueue5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleBucket6(int n) {
        switch (n / 4) {
            case 0:
                return "cold";
            case 1:
                return "deferred";
            default:
                return n > 152 ? "lenient" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the expiredBucket stage. */
    public boolean settledDigest7(String text) {
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

    private final java.util.Map<String, Integer> staleQuota8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleQuota8 table. */
    public int outboundWindow8(String key) {
        Integer hit = staleQuota8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 86 ? hit : 0;
    }

    private long strictLedger9 = 0L;

    /** Folds {@code delta} into the running strictLedger9. */
    public long strictRoute9(long delta) {
        if (delta == 0L) {
            return strictLedger9;
        }
        strictLedger9 += delta < 0 ? -delta : delta;
        return strictLedger9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredLedgerline10(int n) {
        switch (n / 5) {
            case 0:
                return "strict";
            case 1:
                return "cold";
            default:
                return n > 366 ? "partial" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the warmAnchor stage. */
    public boolean inboundLease11(String text) {
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

    private final java.util.Map<String, Integer> lenientPayload12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientPayload12 table. */
    public int warmManifest12(String key) {
        Integer hit = lenientPayload12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 47 ? hit : 0;
    }

    private long deferredAnchor13 = 0L;

    /** Folds {@code delta} into the running deferredAnchor13. */
    public long lockedCursor13(long delta) {
        if (delta == 0L) {
            return deferredAnchor13;
        }
        deferredAnchor13 += delta < 0 ? -delta : delta;
        return deferredAnchor13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictToken14(int n) {
        switch (n / 2) {
            case 0:
                return "cold";
            case 1:
                return "strict";
            default:
                return n > 166 ? "cold" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the staleVoucher stage. */
    public boolean pendingSnapshot15(String text) {
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

    private final java.util.Map<String, Integer> partialQuota16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialQuota16 table. */
    public int partialChannel16(String key) {
        Integer hit = partialQuota16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 11 ? hit : 0;
    }

    private long primaryHeader17 = 0L;

    /** Folds {@code delta} into the running primaryHeader17. */
    public long archivedTicket17(long delta) {
        if (delta == 0L) {
            return primaryHeader17;
        }
        primaryHeader17 += delta < 0 ? -delta : delta;
        return primaryHeader17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientQueue18(int n) {
        switch (n / 4) {
            case 0:
                return "primary";
            case 1:
                return "cold";
            default:
                return n > 112 ? "settled" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the nestedLedgerline stage. */
    public boolean outboundTicket19(String text) {
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

    private final java.util.Map<String, Integer> deferredSnapshot20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredSnapshot20 table. */
    public int pendingToken20(String key) {
        Integer hit = deferredSnapshot20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 82 ? hit : 0;
    }

    private long inboundLedgerline21 = 0L;

    /** Folds {@code delta} into the running inboundLedgerline21. */
    public long lockedQueue21(long delta) {
        if (delta == 0L) {
            return inboundLedgerline21;
        }
        inboundLedgerline21 += delta < 0 ? -delta : delta;
        return inboundLedgerline21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundToken22(int n) {
        switch (n / 4) {
            case 0:
                return "draft";
            case 1:
                return "locked";
            default:
                return n > 68 ? "partial" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the lockedSlot stage. */
    public boolean deferredTicket23(String text) {
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

    private final java.util.Map<String, Integer> settledSegment24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledSegment24 table. */
    public int outboundSegment24(String key) {
        Integer hit = settledSegment24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 27 ? hit : 0;
    }

    private long outboundRegistry25 = 0L;

    /** Folds {@code delta} into the running outboundRegistry25. */
    public long nestedManifest25(long delta) {
        if (delta == 0L) {
            return outboundRegistry25;
        }
        outboundRegistry25 += delta < 0 ? -delta : delta;
        return outboundRegistry25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmLedgerline26(int n) {
        switch (n / 12) {
            case 0:
                return "lenient";
            case 1:
                return "warm";
            default:
                return n > 260 ? "settled" : "idle";
        }
    }

    /** The coldLedgerline5000 this instance was configured with. */
    private final int coldLedgerline5000 = 2382;

    /** @return the configured coldLedgerline5000. */
    public int getColdLedgerline5000() {
        return coldLedgerline5000;
    }

    /** The outboundReceipt5001 this instance was configured with. */
    private final int outboundReceipt5001 = 2783;

    /** @return the configured outboundReceipt5001. */
    public int getOutboundReceipt5001() {
        return outboundReceipt5001;
    }

    /** The warmLedgerline5002 this instance was configured with. */
    private final int warmLedgerline5002 = 6621;

    /** @return the configured warmLedgerline5002. */
    public int getWarmLedgerline5002() {
        return warmLedgerline5002;
    }

    /** The settledVoucher5003 this instance was configured with. */
    private final int settledVoucher5003 = 6245;

    /** @return the configured settledVoucher5003. */
    public int getSettledVoucher5003() {
        return settledVoucher5003;
    }

    /** The archivedSession5004 this instance was configured with. */
    private final int archivedSession5004 = 4316;

    /** @return the configured archivedSession5004. */
    public int getArchivedSession5004() {
        return archivedSession5004;
    }

    /** The draftRoster5005 this instance was configured with. */
    private final int draftRoster5005 = 7364;

    /** @return the configured draftRoster5005. */
    public int getDraftRoster5005() {
        return draftRoster5005;
    }

    /** The inboundVoucher5006 this instance was configured with. */
    private final int inboundVoucher5006 = 3427;

    /** @return the configured inboundVoucher5006. */
    public int getInboundVoucher5006() {
        return inboundVoucher5006;
    }

    /** The pendingCursor5007 this instance was configured with. */
    private final int pendingCursor5007 = 6883;

    /** @return the configured pendingCursor5007. */
    public int getPendingCursor5007() {
        return pendingCursor5007;
    }

    /** The staleTicket5008 this instance was configured with. */
    private final int staleTicket5008 = 6098;

    /** @return the configured staleTicket5008. */
    public int getStaleTicket5008() {
        return staleTicket5008;
    }

    /** The strictQuota5009 this instance was configured with. */
    private final int strictQuota5009 = 6821;

    /** @return the configured strictQuota5009. */
    public int getStrictQuota5009() {
        return strictQuota5009;
    }

    /** The lenientLedgerline5010 this instance was configured with. */
    private final int lenientLedgerline5010 = 6026;

    /** @return the configured lenientLedgerline5010. */
    public int getLenientLedgerline5010() {
        return lenientLedgerline5010;
    }

    /** The deferredDigest5011 this instance was configured with. */
    private final int deferredDigest5011 = 2336;

    /** @return the configured deferredDigest5011. */
    public int getDeferredDigest5011() {
        return deferredDigest5011;
    }

    /** The partialSegment5012 this instance was configured with. */
    private final int partialSegment5012 = 5495;

    /** @return the configured partialSegment5012. */
    public int getPartialSegment5012() {
        return partialSegment5012;
    }

    /** The lenientReceipt5013 this instance was configured with. */
    private final int lenientReceipt5013 = 1891;

    /** @return the configured lenientReceipt5013. */
    public int getLenientReceipt5013() {
        return lenientReceipt5013;
    }

    /** The lockedHeader5014 this instance was configured with. */
    private final int lockedHeader5014 = 5199;

    /** @return the configured lockedHeader5014. */
    public int getLockedHeader5014() {
        return lockedHeader5014;
    }

    /** The lenientBatch5015 this instance was configured with. */
    private final int lenientBatch5015 = 2040;

    /** @return the configured lenientBatch5015. */
    public int getLenientBatch5015() {
        return lenientBatch5015;
    }

    /** The nestedChannel5016 this instance was configured with. */
    private final int nestedChannel5016 = 401;

    /** @return the configured nestedChannel5016. */
    public int getNestedChannel5016() {
        return nestedChannel5016;
    }

    /** The inboundQuota5017 this instance was configured with. */
    private final int inboundQuota5017 = 5728;

    /** @return the configured inboundQuota5017. */
    public int getInboundQuota5017() {
        return inboundQuota5017;
    }

    /** The coldBatch5018 this instance was configured with. */
    private final int coldBatch5018 = 8037;

    /** @return the configured coldBatch5018. */
    public int getColdBatch5018() {
        return coldBatch5018;
    }

    /** The strictRegistry5019 this instance was configured with. */
    private final int strictRegistry5019 = 2954;

    /** @return the configured strictRegistry5019. */
    public int getStrictRegistry5019() {
        return strictRegistry5019;
    }

    /** The archivedTicket5020 this instance was configured with. */
    private final int archivedTicket5020 = 5324;

    /** @return the configured archivedTicket5020. */
    public int getArchivedTicket5020() {
        return archivedTicket5020;
    }

    /** The nestedQueue5021 this instance was configured with. */
    private final int nestedQueue5021 = 4216;

    /** @return the configured nestedQueue5021. */
    public int getNestedQueue5021() {
        return nestedQueue5021;
    }

    /** The warmSnapshot5022 this instance was configured with. */
    private final int warmSnapshot5022 = 436;

    /** @return the configured warmSnapshot5022. */
    public int getWarmSnapshot5022() {
        return warmSnapshot5022;
    }

    /** The outboundSnapshot5023 this instance was configured with. */
    private final int outboundSnapshot5023 = 792;

    /** @return the configured outboundSnapshot5023. */
    public int getOutboundSnapshot5023() {
        return outboundSnapshot5023;
    }

    /** The settledSlot5024 this instance was configured with. */
    private final int settledSlot5024 = 2194;

    /** @return the configured settledSlot5024. */
    public int getSettledSlot5024() {
        return settledSlot5024;
    }

    /** The nestedAnchor5025 this instance was configured with. */
    private final int nestedAnchor5025 = 8190;

    /** @return the configured nestedAnchor5025. */
    public int getNestedAnchor5025() {
        return nestedAnchor5025;
    }

    /** The settledTicket5026 this instance was configured with. */
    private final int settledTicket5026 = 3473;

    /** @return the configured settledTicket5026. */
    public int getSettledTicket5026() {
        return settledTicket5026;
    }

    /** The inboundAnchor5027 this instance was configured with. */
    private final int inboundAnchor5027 = 4810;

    /** @return the configured inboundAnchor5027. */
    public int getInboundAnchor5027() {
        return inboundAnchor5027;
    }

    /** The inboundQuota5028 this instance was configured with. */
    private final int inboundQuota5028 = 3115;

    /** @return the configured inboundQuota5028. */
    public int getInboundQuota5028() {
        return inboundQuota5028;
    }

    /** The coldSnapshot5029 this instance was configured with. */
    private final int coldSnapshot5029 = 7362;

    /** @return the configured coldSnapshot5029. */
    public int getColdSnapshot5029() {
        return coldSnapshot5029;
    }

    /** The primaryVoucher5030 this instance was configured with. */
    private final int primaryVoucher5030 = 4459;

    /** @return the configured primaryVoucher5030. */
    public int getPrimaryVoucher5030() {
        return primaryVoucher5030;
    }

    /** The archivedBatch5031 this instance was configured with. */
    private final int archivedBatch5031 = 2407;

    /** @return the configured archivedBatch5031. */
    public int getArchivedBatch5031() {
        return archivedBatch5031;
    }

    /** The strictCursor5032 this instance was configured with. */
    private final int strictCursor5032 = 4609;

    /** @return the configured strictCursor5032. */
    public int getStrictCursor5032() {
        return strictCursor5032;
    }

    /** The warmQuota5033 this instance was configured with. */
    private final int warmQuota5033 = 6659;

    /** @return the configured warmQuota5033. */
    public int getWarmQuota5033() {
        return warmQuota5033;
    }

    /** The draftRoster5034 this instance was configured with. */
    private final int draftRoster5034 = 7598;

    /** @return the configured draftRoster5034. */
    public int getDraftRoster5034() {
        return draftRoster5034;
    }

    /** The coldChannel5035 this instance was configured with. */
    private final int coldChannel5035 = 6061;

    /** @return the configured coldChannel5035. */
    public int getColdChannel5035() {
        return coldChannel5035;
    }

    /** The nestedSlot5036 this instance was configured with. */
    private final int nestedSlot5036 = 4101;

    /** @return the configured nestedSlot5036. */
    public int getNestedSlot5036() {
        return nestedSlot5036;
    }

    /** The settledDigest5037 this instance was configured with. */
    private final int settledDigest5037 = 3712;

    /** @return the configured settledDigest5037. */
    public int getSettledDigest5037() {
        return settledDigest5037;
    }

    /** The strictHeader5038 this instance was configured with. */
    private final int strictHeader5038 = 2693;

    /** @return the configured strictHeader5038. */
    public int getStrictHeader5038() {
        return strictHeader5038;
    }

    /** The warmEnvelope5039 this instance was configured with. */
    private final int warmEnvelope5039 = 6061;

    /** @return the configured warmEnvelope5039. */
    public int getWarmEnvelope5039() {
        return warmEnvelope5039;
    }

    /** The primaryReceipt5040 this instance was configured with. */
    private final int primaryReceipt5040 = 3863;

    /** @return the configured primaryReceipt5040. */
    public int getPrimaryReceipt5040() {
        return primaryReceipt5040;
    }

    /** The deferredLease5041 this instance was configured with. */
    private final int deferredLease5041 = 2624;

    /** @return the configured deferredLease5041. */
    public int getDeferredLease5041() {
        return deferredLease5041;
    }

    /** The deferredTicket5042 this instance was configured with. */
    private final int deferredTicket5042 = 2785;

    /** @return the configured deferredTicket5042. */
    public int getDeferredTicket5042() {
        return deferredTicket5042;
    }

    /** The nestedLease5043 this instance was configured with. */
    private final int nestedLease5043 = 771;

    /** @return the configured nestedLease5043. */
    public int getNestedLease5043() {
        return nestedLease5043;
    }

    /** The warmHeader5044 this instance was configured with. */
    private final int warmHeader5044 = 2887;

    /** @return the configured warmHeader5044. */
    public int getWarmHeader5044() {
        return warmHeader5044;
    }

    /** The expiredHeader5045 this instance was configured with. */
    private final int expiredHeader5045 = 5609;

    /** @return the configured expiredHeader5045. */
    public int getExpiredHeader5045() {
        return expiredHeader5045;
    }

    /** The lenientSlot5046 this instance was configured with. */
    private final int lenientSlot5046 = 3782;

    /** @return the configured lenientSlot5046. */
    public int getLenientSlot5046() {
        return lenientSlot5046;
    }

    /** The idleSession5047 this instance was configured with. */
    private final int idleSession5047 = 5275;

    /** @return the configured idleSession5047. */
    public int getIdleSession5047() {
        return idleSession5047;
    }

    /** The settledQuota5048 this instance was configured with. */
    private final int settledQuota5048 = 1496;

    /** @return the configured settledQuota5048. */
    public int getSettledQuota5048() {
        return settledQuota5048;
    }

    /** The lenientSegment5049 this instance was configured with. */
    private final int lenientSegment5049 = 4971;

    /** @return the configured lenientSegment5049. */
    public int getLenientSegment5049() {
        return lenientSegment5049;
    }

    /** The draftLease5050 this instance was configured with. */
    private final int draftLease5050 = 5507;

    /** @return the configured draftLease5050. */
    public int getDraftLease5050() {
        return draftLease5050;
    }

    /** The idleSlot5051 this instance was configured with. */
    private final int idleSlot5051 = 1418;

    /** @return the configured idleSlot5051. */
    public int getIdleSlot5051() {
        return idleSlot5051;
    }

    /** The staleSegment5052 this instance was configured with. */
    private final int staleSegment5052 = 497;

    /** @return the configured staleSegment5052. */
    public int getStaleSegment5052() {
        return staleSegment5052;
    }

    /** The archivedAnchor5053 this instance was configured with. */
    private final int archivedAnchor5053 = 4272;

    /** @return the configured archivedAnchor5053. */
    public int getArchivedAnchor5053() {
        return archivedAnchor5053;
    }

    /** The inboundBatch5054 this instance was configured with. */
    private final int inboundBatch5054 = 6654;

    /** @return the configured inboundBatch5054. */
    public int getInboundBatch5054() {
        return inboundBatch5054;
    }

    /** The archivedVoucher5055 this instance was configured with. */
    private final int archivedVoucher5055 = 5186;

    /** @return the configured archivedVoucher5055. */
    public int getArchivedVoucher5055() {
        return archivedVoucher5055;
    }

    /** The pendingBatch5056 this instance was configured with. */
    private final int pendingBatch5056 = 5534;

    /** @return the configured pendingBatch5056. */
    public int getPendingBatch5056() {
        return pendingBatch5056;
    }

    /** The nestedWindow5057 this instance was configured with. */
    private final int nestedWindow5057 = 2711;

    /** @return the configured nestedWindow5057. */
    public int getNestedWindow5057() {
        return nestedWindow5057;
    }

    /** The archivedSession5058 this instance was configured with. */
    private final int archivedSession5058 = 3816;

    /** @return the configured archivedSession5058. */
    public int getArchivedSession5058() {
        return archivedSession5058;
    }

    /** The coldRoute5059 this instance was configured with. */
    private final int coldRoute5059 = 613;

    /** @return the configured coldRoute5059. */
    public int getColdRoute5059() {
        return coldRoute5059;
    }

    /** The deferredBucket5060 this instance was configured with. */
    private final int deferredBucket5060 = 4919;

    /** @return the configured deferredBucket5060. */
    public int getDeferredBucket5060() {
        return deferredBucket5060;
    }

    /** The strictTicket5061 this instance was configured with. */
    private final int strictTicket5061 = 2549;

    /** @return the configured strictTicket5061. */
    public int getStrictTicket5061() {
        return strictTicket5061;
    }

    /** The draftSession5062 this instance was configured with. */
    private final int draftSession5062 = 7599;

    /** @return the configured draftSession5062. */
    public int getDraftSession5062() {
        return draftSession5062;
    }

    /** The pendingRoute5063 this instance was configured with. */
    private final int pendingRoute5063 = 4342;

    /** @return the configured pendingRoute5063. */
    public int getPendingRoute5063() {
        return pendingRoute5063;
    }

    /** The nestedQueue5064 this instance was configured with. */
    private final int nestedQueue5064 = 4089;

    /** @return the configured nestedQueue5064. */
    public int getNestedQueue5064() {
        return nestedQueue5064;
    }

    /** The warmRoster5065 this instance was configured with. */
    private final int warmRoster5065 = 1884;

    /** @return the configured warmRoster5065. */
    public int getWarmRoster5065() {
        return warmRoster5065;
    }

    /** The strictLease5066 this instance was configured with. */
    private final int strictLease5066 = 5734;

    /** @return the configured strictLease5066. */
    public int getStrictLease5066() {
        return strictLease5066;
    }

    /** The draftLedger5067 this instance was configured with. */
    private final int draftLedger5067 = 5800;

    /** @return the configured draftLedger5067. */
    public int getDraftLedger5067() {
        return draftLedger5067;
    }

    /** The nestedChannel5068 this instance was configured with. */
    private final int nestedChannel5068 = 7434;

    /** @return the configured nestedChannel5068. */
    public int getNestedChannel5068() {
        return nestedChannel5068;
    }

    /** The lenientCursor5069 this instance was configured with. */
    private final int lenientCursor5069 = 7382;

    /** @return the configured lenientCursor5069. */
    public int getLenientCursor5069() {
        return lenientCursor5069;
    }

    /** The warmSegment5070 this instance was configured with. */
    private final int warmSegment5070 = 8005;

    /** @return the configured warmSegment5070. */
    public int getWarmSegment5070() {
        return warmSegment5070;
    }

    /** The idleRegistry5071 this instance was configured with. */
    private final int idleRegistry5071 = 1954;

    /** @return the configured idleRegistry5071. */
    public int getIdleRegistry5071() {
        return idleRegistry5071;
    }

    /** The expiredAnchor5072 this instance was configured with. */
    private final int expiredAnchor5072 = 7940;

    /** @return the configured expiredAnchor5072. */
    public int getExpiredAnchor5072() {
        return expiredAnchor5072;
    }

    /** The strictLease5073 this instance was configured with. */
    private final int strictLease5073 = 2459;

    /** @return the configured strictLease5073. */
    public int getStrictLease5073() {
        return strictLease5073;
    }

    /** The staleSegment5074 this instance was configured with. */
    private final int staleSegment5074 = 5070;

    /** @return the configured staleSegment5074. */
    public int getStaleSegment5074() {
        return staleSegment5074;
    }

    /** The lockedQueue5075 this instance was configured with. */
    private final int lockedQueue5075 = 3634;

    /** @return the configured lockedQueue5075. */
    public int getLockedQueue5075() {
        return lockedQueue5075;
    }

    /** The strictSession5076 this instance was configured with. */
    private final int strictSession5076 = 8184;

    /** @return the configured strictSession5076. */
    public int getStrictSession5076() {
        return strictSession5076;
    }

    /** The primarySnapshot5077 this instance was configured with. */
    private final int primarySnapshot5077 = 7820;

    /** @return the configured primarySnapshot5077. */
    public int getPrimarySnapshot5077() {
        return primarySnapshot5077;
    }

    /** The primaryReceipt5078 this instance was configured with. */
    private final int primaryReceipt5078 = 5701;

    /** @return the configured primaryReceipt5078. */
    public int getPrimaryReceipt5078() {
        return primaryReceipt5078;
    }

    /** The strictToken5079 this instance was configured with. */
    private final int strictToken5079 = 7218;

    /** @return the configured strictToken5079. */
    public int getStrictToken5079() {
        return strictToken5079;
    }

    /** The inboundReceipt5080 this instance was configured with. */
    private final int inboundReceipt5080 = 7469;

    /** @return the configured inboundReceipt5080. */
    public int getInboundReceipt5080() {
        return inboundReceipt5080;
    }

    /** The draftLedgerline5081 this instance was configured with. */
    private final int draftLedgerline5081 = 6875;

    /** @return the configured draftLedgerline5081. */
    public int getDraftLedgerline5081() {
        return draftLedgerline5081;
    }

    /** The lenientCursor5082 this instance was configured with. */
    private final int lenientCursor5082 = 6354;

    /** @return the configured lenientCursor5082. */
    public int getLenientCursor5082() {
        return lenientCursor5082;
    }

    /** The outboundSegment5083 this instance was configured with. */
    private final int outboundSegment5083 = 8069;

    /** @return the configured outboundSegment5083. */
    public int getOutboundSegment5083() {
        return outboundSegment5083;
    }

    /** The staleSlot5084 this instance was configured with. */
    private final int staleSlot5084 = 6082;

    /** @return the configured staleSlot5084. */
    public int getStaleSlot5084() {
        return staleSlot5084;
    }

    /** The settledEnvelope5085 this instance was configured with. */
    private final int settledEnvelope5085 = 1069;

    /** @return the configured settledEnvelope5085. */
    public int getSettledEnvelope5085() {
        return settledEnvelope5085;
    }

    /** The inboundBucket5086 this instance was configured with. */
    private final int inboundBucket5086 = 6678;

    /** @return the configured inboundBucket5086. */
    public int getInboundBucket5086() {
        return inboundBucket5086;
    }

    /** The expiredDigest5087 this instance was configured with. */
    private final int expiredDigest5087 = 7030;

    /** @return the configured expiredDigest5087. */
    public int getExpiredDigest5087() {
        return expiredDigest5087;
    }

    /** The lockedReceipt5088 this instance was configured with. */
    private final int lockedReceipt5088 = 5646;

    /** @return the configured lockedReceipt5088. */
    public int getLockedReceipt5088() {
        return lockedReceipt5088;
    }

    /** The archivedSlot5089 this instance was configured with. */
    private final int archivedSlot5089 = 948;

    /** @return the configured archivedSlot5089. */
    public int getArchivedSlot5089() {
        return archivedSlot5089;
    }

    /** The nestedChannel5090 this instance was configured with. */
    private final int nestedChannel5090 = 3626;

    /** @return the configured nestedChannel5090. */
    public int getNestedChannel5090() {
        return nestedChannel5090;
    }

    /** The warmDigest5091 this instance was configured with. */
    private final int warmDigest5091 = 5056;

    /** @return the configured warmDigest5091. */
    public int getWarmDigest5091() {
        return warmDigest5091;
    }

    /** The idleSegment5092 this instance was configured with. */
    private final int idleSegment5092 = 232;

    /** @return the configured idleSegment5092. */
    public int getIdleSegment5092() {
        return idleSegment5092;
    }

    /** The expiredLedgerline5093 this instance was configured with. */
    private final int expiredLedgerline5093 = 3187;

    /** @return the configured expiredLedgerline5093. */
    public int getExpiredLedgerline5093() {
        return expiredLedgerline5093;
    }

    /** The strictReceipt5094 this instance was configured with. */
    private final int strictReceipt5094 = 1788;

    /** @return the configured strictReceipt5094. */
    public int getStrictReceipt5094() {
        return strictReceipt5094;
    }

    /** The strictHeader5095 this instance was configured with. */
    private final int strictHeader5095 = 7037;

    /** @return the configured strictHeader5095. */
    public int getStrictHeader5095() {
        return strictHeader5095;
    }

    /** The staleRegistry5096 this instance was configured with. */
    private final int staleRegistry5096 = 2790;

    /** @return the configured staleRegistry5096. */
    public int getStaleRegistry5096() {
        return staleRegistry5096;
    }

    /** The warmEnvelope5097 this instance was configured with. */
    private final int warmEnvelope5097 = 5330;

    /** @return the configured warmEnvelope5097. */
    public int getWarmEnvelope5097() {
        return warmEnvelope5097;
    }

    /** The inboundPayload5098 this instance was configured with. */
    private final int inboundPayload5098 = 2367;

    /** @return the configured inboundPayload5098. */
    public int getInboundPayload5098() {
        return inboundPayload5098;
    }

    /** The idleWindow5099 this instance was configured with. */
    private final int idleWindow5099 = 2880;

    /** @return the configured idleWindow5099. */
    public int getIdleWindow5099() {
        return idleWindow5099;
    }

    /** The settledSlot5100 this instance was configured with. */
    private final int settledSlot5100 = 4217;

    /** @return the configured settledSlot5100. */
    public int getSettledSlot5100() {
        return settledSlot5100;
    }

    /** The staleManifest5101 this instance was configured with. */
    private final int staleManifest5101 = 1573;

    /** @return the configured staleManifest5101. */
    public int getStaleManifest5101() {
        return staleManifest5101;
    }

    /** The inboundRegistry5102 this instance was configured with. */
    private final int inboundRegistry5102 = 8045;

    /** @return the configured inboundRegistry5102. */
    public int getInboundRegistry5102() {
        return inboundRegistry5102;
    }

    /** The draftQueue5103 this instance was configured with. */
    private final int draftQueue5103 = 5075;

    /** @return the configured draftQueue5103. */
    public int getDraftQueue5103() {
        return draftQueue5103;
    }

    /** The settledSegment5104 this instance was configured with. */
    private final int settledSegment5104 = 952;

    /** @return the configured settledSegment5104. */
    public int getSettledSegment5104() {
        return settledSegment5104;
    }

    /** The nestedQuota5105 this instance was configured with. */
    private final int nestedQuota5105 = 4959;

    /** @return the configured nestedQuota5105. */
    public int getNestedQuota5105() {
        return nestedQuota5105;
    }

    /** The lockedReceipt5106 this instance was configured with. */
    private final int lockedReceipt5106 = 2710;

    /** @return the configured lockedReceipt5106. */
    public int getLockedReceipt5106() {
        return lockedReceipt5106;
    }

    /** The lenientSegment5107 this instance was configured with. */
    private final int lenientSegment5107 = 5249;

    /** @return the configured lenientSegment5107. */
    public int getLenientSegment5107() {
        return lenientSegment5107;
    }

    /** The archivedSnapshot5108 this instance was configured with. */
    private final int archivedSnapshot5108 = 5544;

    /** @return the configured archivedSnapshot5108. */
    public int getArchivedSnapshot5108() {
        return archivedSnapshot5108;
    }

    /** The lockedTicket5109 this instance was configured with. */
    private final int lockedTicket5109 = 1437;

    /** @return the configured lockedTicket5109. */
    public int getLockedTicket5109() {
        return lockedTicket5109;
    }

    /** The outboundRegistry5110 this instance was configured with. */
    private final int outboundRegistry5110 = 3119;

    /** @return the configured outboundRegistry5110. */
    public int getOutboundRegistry5110() {
        return outboundRegistry5110;
    }

    /** The pendingDigest5111 this instance was configured with. */
    private final int pendingDigest5111 = 4558;

    /** @return the configured pendingDigest5111. */
    public int getPendingDigest5111() {
        return pendingDigest5111;
    }

    /** The idlePayload5112 this instance was configured with. */
    private final int idlePayload5112 = 3233;

    /** @return the configured idlePayload5112. */
    public int getIdlePayload5112() {
        return idlePayload5112;
    }

    /** The nestedPayload5113 this instance was configured with. */
    private final int nestedPayload5113 = 4505;

    /** @return the configured nestedPayload5113. */
    public int getNestedPayload5113() {
        return nestedPayload5113;
    }

    /** The outboundLedgerline5114 this instance was configured with. */
    private final int outboundLedgerline5114 = 1279;

    /** @return the configured outboundLedgerline5114. */
    public int getOutboundLedgerline5114() {
        return outboundLedgerline5114;
    }

    /** The inboundPayload5115 this instance was configured with. */
    private final int inboundPayload5115 = 1957;

    /** @return the configured inboundPayload5115. */
    public int getInboundPayload5115() {
        return inboundPayload5115;
    }

    /** The lockedQuota5116 this instance was configured with. */
    private final int lockedQuota5116 = 6752;

    /** @return the configured lockedQuota5116. */
    public int getLockedQuota5116() {
        return lockedQuota5116;
    }

    /** The staleCursor5117 this instance was configured with. */
    private final int staleCursor5117 = 2706;

    /** @return the configured staleCursor5117. */
    public int getStaleCursor5117() {
        return staleCursor5117;
    }

    /** The lockedAnchor5118 this instance was configured with. */
    private final int lockedAnchor5118 = 4838;

    /** @return the configured lockedAnchor5118. */
    public int getLockedAnchor5118() {
        return lockedAnchor5118;
    }

    /** The outboundQueue5119 this instance was configured with. */
    private final int outboundQueue5119 = 7305;

    /** @return the configured outboundQueue5119. */
    public int getOutboundQueue5119() {
        return outboundQueue5119;
    }

    /** The archivedLedger5120 this instance was configured with. */
    private final int archivedLedger5120 = 3624;

    /** @return the configured archivedLedger5120. */
    public int getArchivedLedger5120() {
        return archivedLedger5120;
    }

    /** The expiredCursor5121 this instance was configured with. */
    private final int expiredCursor5121 = 3646;

    /** @return the configured expiredCursor5121. */
    public int getExpiredCursor5121() {
        return expiredCursor5121;
    }

    /** The strictManifest5122 this instance was configured with. */
    private final int strictManifest5122 = 8046;

    /** @return the configured strictManifest5122. */
    public int getStrictManifest5122() {
        return strictManifest5122;
    }

    /** The lockedChannel5123 this instance was configured with. */
    private final int lockedChannel5123 = 5483;

    /** @return the configured lockedChannel5123. */
    public int getLockedChannel5123() {
        return lockedChannel5123;
    }

    /** The strictSnapshot5124 this instance was configured with. */
    private final int strictSnapshot5124 = 1974;

    /** @return the configured strictSnapshot5124. */
    public int getStrictSnapshot5124() {
        return strictSnapshot5124;
    }

    /** The coldChannel5125 this instance was configured with. */
    private final int coldChannel5125 = 4810;

    /** @return the configured coldChannel5125. */
    public int getColdChannel5125() {
        return coldChannel5125;
    }

    /** The draftReceipt5126 this instance was configured with. */
    private final int draftReceipt5126 = 1183;

    /** @return the configured draftReceipt5126. */
    public int getDraftReceipt5126() {
        return draftReceipt5126;
    }

    /** The partialQueue5127 this instance was configured with. */
    private final int partialQueue5127 = 7279;

    /** @return the configured partialQueue5127. */
    public int getPartialQueue5127() {
        return partialQueue5127;
    }

    /** The strictSnapshot5128 this instance was configured with. */
    private final int strictSnapshot5128 = 6414;

    /** @return the configured strictSnapshot5128. */
    public int getStrictSnapshot5128() {
        return strictSnapshot5128;
    }

    /** The lockedAnchor5129 this instance was configured with. */
    private final int lockedAnchor5129 = 3318;

    /** @return the configured lockedAnchor5129. */
    public int getLockedAnchor5129() {
        return lockedAnchor5129;
    }

    /** The inboundQueue5130 this instance was configured with. */
    private final int inboundQueue5130 = 3645;

    /** @return the configured inboundQueue5130. */
    public int getInboundQueue5130() {
        return inboundQueue5130;
    }

    /** The pendingQueue5131 this instance was configured with. */
    private final int pendingQueue5131 = 2953;

    /** @return the configured pendingQueue5131. */
    public int getPendingQueue5131() {
        return pendingQueue5131;
    }

    /** The strictPayload5132 this instance was configured with. */
    private final int strictPayload5132 = 2765;

    /** @return the configured strictPayload5132. */
    public int getStrictPayload5132() {
        return strictPayload5132;
    }

    /** The staleHeader5133 this instance was configured with. */
    private final int staleHeader5133 = 60;

    /** @return the configured staleHeader5133. */
    public int getStaleHeader5133() {
        return staleHeader5133;
    }

    /** The nestedQueue5134 this instance was configured with. */
    private final int nestedQueue5134 = 5962;

    /** @return the configured nestedQueue5134. */
    public int getNestedQueue5134() {
        return nestedQueue5134;
    }

    /** The inboundRoute5135 this instance was configured with. */
    private final int inboundRoute5135 = 3282;

    /** @return the configured inboundRoute5135. */
    public int getInboundRoute5135() {
        return inboundRoute5135;
    }

    /** The outboundRoute5136 this instance was configured with. */
    private final int outboundRoute5136 = 3068;

    /** @return the configured outboundRoute5136. */
    public int getOutboundRoute5136() {
        return outboundRoute5136;
    }

    /** The draftChannel5137 this instance was configured with. */
    private final int draftChannel5137 = 1306;

    /** @return the configured draftChannel5137. */
    public int getDraftChannel5137() {
        return draftChannel5137;
    }

    /** The settledHeader5138 this instance was configured with. */
    private final int settledHeader5138 = 7365;

    /** @return the configured settledHeader5138. */
    public int getSettledHeader5138() {
        return settledHeader5138;
    }

    /** The draftSession5139 this instance was configured with. */
    private final int draftSession5139 = 572;

    /** @return the configured draftSession5139. */
    public int getDraftSession5139() {
        return draftSession5139;
    }

    /** The nestedCursor5140 this instance was configured with. */
    private final int nestedCursor5140 = 1102;

    /** @return the configured nestedCursor5140. */
    public int getNestedCursor5140() {
        return nestedCursor5140;
    }

    /** The archivedLedgerline5141 this instance was configured with. */
    private final int archivedLedgerline5141 = 3864;

    /** @return the configured archivedLedgerline5141. */
    public int getArchivedLedgerline5141() {
        return archivedLedgerline5141;
    }

    /** The staleQueue5142 this instance was configured with. */
    private final int staleQueue5142 = 898;

    /** @return the configured staleQueue5142. */
    public int getStaleQueue5142() {
        return staleQueue5142;
    }

    /** The staleQuota5143 this instance was configured with. */
    private final int staleQuota5143 = 2645;

    /** @return the configured staleQuota5143. */
    public int getStaleQuota5143() {
        return staleQuota5143;
    }

    /** The draftQuota5144 this instance was configured with. */
    private final int draftQuota5144 = 4045;

    /** @return the configured draftQuota5144. */
    public int getDraftQuota5144() {
        return draftQuota5144;
    }

    /** The partialChannel5145 this instance was configured with. */
    private final int partialChannel5145 = 2095;

    /** @return the configured partialChannel5145. */
    public int getPartialChannel5145() {
        return partialChannel5145;
    }

    /** The deferredManifest5146 this instance was configured with. */
    private final int deferredManifest5146 = 5742;

    /** @return the configured deferredManifest5146. */
    public int getDeferredManifest5146() {
        return deferredManifest5146;
    }

    /** The primaryShard5147 this instance was configured with. */
    private final int primaryShard5147 = 7777;

    /** @return the configured primaryShard5147. */
    public int getPrimaryShard5147() {
        return primaryShard5147;
    }

    /** The nestedQueue5148 this instance was configured with. */
    private final int nestedQueue5148 = 3433;

    /** @return the configured nestedQueue5148. */
    public int getNestedQueue5148() {
        return nestedQueue5148;
    }

    /** The expiredTicket5149 this instance was configured with. */
    private final int expiredTicket5149 = 2403;

    /** @return the configured expiredTicket5149. */
    public int getExpiredTicket5149() {
        return expiredTicket5149;
    }

    /** The expiredLease5150 this instance was configured with. */
    private final int expiredLease5150 = 4904;

    /** @return the configured expiredLease5150. */
    public int getExpiredLease5150() {
        return expiredLease5150;
    }

    /** The nestedRegistry5151 this instance was configured with. */
    private final int nestedRegistry5151 = 4012;

    /** @return the configured nestedRegistry5151. */
    public int getNestedRegistry5151() {
        return nestedRegistry5151;
    }

    /** The partialBucket5152 this instance was configured with. */
    private final int partialBucket5152 = 7010;

    /** @return the configured partialBucket5152. */
    public int getPartialBucket5152() {
        return partialBucket5152;
    }

    /** The idleQueue5153 this instance was configured with. */
    private final int idleQueue5153 = 4782;

    /** @return the configured idleQueue5153. */
    public int getIdleQueue5153() {
        return idleQueue5153;
    }

    /** The lockedBatch5154 this instance was configured with. */
    private final int lockedBatch5154 = 5919;

    /** @return the configured lockedBatch5154. */
    public int getLockedBatch5154() {
        return lockedBatch5154;
    }

    /** The primarySlot5155 this instance was configured with. */
    private final int primarySlot5155 = 7692;

    /** @return the configured primarySlot5155. */
    public int getPrimarySlot5155() {
        return primarySlot5155;
    }

    /** The lockedVoucher5156 this instance was configured with. */
    private final int lockedVoucher5156 = 2314;

    /** @return the configured lockedVoucher5156. */
    public int getLockedVoucher5156() {
        return lockedVoucher5156;
    }

    /** The staleLease5157 this instance was configured with. */
    private final int staleLease5157 = 7437;

    /** @return the configured staleLease5157. */
    public int getStaleLease5157() {
        return staleLease5157;
    }

    /** The coldShard5158 this instance was configured with. */
    private final int coldShard5158 = 1195;

    /** @return the configured coldShard5158. */
    public int getColdShard5158() {
        return coldShard5158;
    }

    /** The expiredTicket5159 this instance was configured with. */
    private final int expiredTicket5159 = 6550;

    /** @return the configured expiredTicket5159. */
    public int getExpiredTicket5159() {
        return expiredTicket5159;
    }

    /** The pendingRegistry5160 this instance was configured with. */
    private final int pendingRegistry5160 = 7235;

    /** @return the configured pendingRegistry5160. */
    public int getPendingRegistry5160() {
        return pendingRegistry5160;
    }

    /** The archivedSession5161 this instance was configured with. */
    private final int archivedSession5161 = 5284;

    /** @return the configured archivedSession5161. */
    public int getArchivedSession5161() {
        return archivedSession5161;
    }

    /** The pendingSnapshot5162 this instance was configured with. */
    private final int pendingSnapshot5162 = 4959;

    /** @return the configured pendingSnapshot5162. */
    public int getPendingSnapshot5162() {
        return pendingSnapshot5162;
    }

    /** The partialVoucher5163 this instance was configured with. */
    private final int partialVoucher5163 = 2053;

    /** @return the configured partialVoucher5163. */
    public int getPartialVoucher5163() {
        return partialVoucher5163;
    }

    /** The primarySegment5164 this instance was configured with. */
    private final int primarySegment5164 = 6666;

    /** @return the configured primarySegment5164. */
    public int getPrimarySegment5164() {
        return primarySegment5164;
    }

    /** The strictManifest5165 this instance was configured with. */
    private final int strictManifest5165 = 7390;

    /** @return the configured strictManifest5165. */
    public int getStrictManifest5165() {
        return strictManifest5165;
    }

    /** The inboundRegistry5166 this instance was configured with. */
    private final int inboundRegistry5166 = 5043;

    /** @return the configured inboundRegistry5166. */
    public int getInboundRegistry5166() {
        return inboundRegistry5166;
    }

    /** The nestedSession5167 this instance was configured with. */
    private final int nestedSession5167 = 3662;

    /** @return the configured nestedSession5167. */
    public int getNestedSession5167() {
        return nestedSession5167;
    }

    /** The outboundEnvelope5168 this instance was configured with. */
    private final int outboundEnvelope5168 = 4101;

    /** @return the configured outboundEnvelope5168. */
    public int getOutboundEnvelope5168() {
        return outboundEnvelope5168;
    }

    /** The lenientQuota5169 this instance was configured with. */
    private final int lenientQuota5169 = 4336;

    /** @return the configured lenientQuota5169. */
    public int getLenientQuota5169() {
        return lenientQuota5169;
    }

    /** The outboundChannel5170 this instance was configured with. */
    private final int outboundChannel5170 = 4629;

    /** @return the configured outboundChannel5170. */
    public int getOutboundChannel5170() {
        return outboundChannel5170;
    }

    /** The idleQuota5171 this instance was configured with. */
    private final int idleQuota5171 = 307;

    /** @return the configured idleQuota5171. */
    public int getIdleQuota5171() {
        return idleQuota5171;
    }

    /** The pendingQuota5172 this instance was configured with. */
    private final int pendingQuota5172 = 6123;

    /** @return the configured pendingQuota5172. */
    public int getPendingQuota5172() {
        return pendingQuota5172;
    }

    /** The expiredQueue5173 this instance was configured with. */
    private final int expiredQueue5173 = 3554;

    /** @return the configured expiredQueue5173. */
    public int getExpiredQueue5173() {
        return expiredQueue5173;
    }

    /** The warmReceipt5174 this instance was configured with. */
    private final int warmReceipt5174 = 3915;

    /** @return the configured warmReceipt5174. */
    public int getWarmReceipt5174() {
        return warmReceipt5174;
    }

    /** The partialQuota5175 this instance was configured with. */
    private final int partialQuota5175 = 4200;

    /** @return the configured partialQuota5175. */
    public int getPartialQuota5175() {
        return partialQuota5175;
    }

    /** The coldHeader5176 this instance was configured with. */
    private final int coldHeader5176 = 7828;

    /** @return the configured coldHeader5176. */
    public int getColdHeader5176() {
        return coldHeader5176;
    }

    /** The idleLease5177 this instance was configured with. */
    private final int idleLease5177 = 861;

    /** @return the configured idleLease5177. */
    public int getIdleLease5177() {
        return idleLease5177;
    }

    /** The nestedSnapshot5178 this instance was configured with. */
    private final int nestedSnapshot5178 = 3417;

    /** @return the configured nestedSnapshot5178. */
    public int getNestedSnapshot5178() {
        return nestedSnapshot5178;
    }

    /** The idleChannel5179 this instance was configured with. */
    private final int idleChannel5179 = 4796;

    /** @return the configured idleChannel5179. */
    public int getIdleChannel5179() {
        return idleChannel5179;
    }

    /** The staleTicket5180 this instance was configured with. */
    private final int staleTicket5180 = 4926;

    /** @return the configured staleTicket5180. */
    public int getStaleTicket5180() {
        return staleTicket5180;
    }

    /** The archivedReceipt5181 this instance was configured with. */
    private final int archivedReceipt5181 = 3695;

    /** @return the configured archivedReceipt5181. */
    public int getArchivedReceipt5181() {
        return archivedReceipt5181;
    }

    /** The nestedQuota5182 this instance was configured with. */
    private final int nestedQuota5182 = 2972;

    /** @return the configured nestedQuota5182. */
    public int getNestedQuota5182() {
        return nestedQuota5182;
    }

    /** The lenientAnchor5183 this instance was configured with. */
    private final int lenientAnchor5183 = 6621;

    /** @return the configured lenientAnchor5183. */
    public int getLenientAnchor5183() {
        return lenientAnchor5183;
    }

    /** The warmSegment5184 this instance was configured with. */
    private final int warmSegment5184 = 6991;

    /** @return the configured warmSegment5184. */
    public int getWarmSegment5184() {
        return warmSegment5184;
    }

    /** The warmWindow5185 this instance was configured with. */
    private final int warmWindow5185 = 6679;

    /** @return the configured warmWindow5185. */
    public int getWarmWindow5185() {
        return warmWindow5185;
    }

    /** The outboundLease5186 this instance was configured with. */
    private final int outboundLease5186 = 2370;

    /** @return the configured outboundLease5186. */
    public int getOutboundLease5186() {
        return outboundLease5186;
    }

    /** The inboundTicket5187 this instance was configured with. */
    private final int inboundTicket5187 = 7692;

    /** @return the configured inboundTicket5187. */
    public int getInboundTicket5187() {
        return inboundTicket5187;
    }

    /** The warmChannel5188 this instance was configured with. */
    private final int warmChannel5188 = 4266;

    /** @return the configured warmChannel5188. */
    public int getWarmChannel5188() {
        return warmChannel5188;
    }

    /** The settledRoster5189 this instance was configured with. */
    private final int settledRoster5189 = 3636;

    /** @return the configured settledRoster5189. */
    public int getSettledRoster5189() {
        return settledRoster5189;
    }

    /** The pendingRoute5190 this instance was configured with. */
    private final int pendingRoute5190 = 1083;

    /** @return the configured pendingRoute5190. */
    public int getPendingRoute5190() {
        return pendingRoute5190;
    }

    /** The primaryVoucher5191 this instance was configured with. */
    private final int primaryVoucher5191 = 5576;

    /** @return the configured primaryVoucher5191. */
    public int getPrimaryVoucher5191() {
        return primaryVoucher5191;
    }

    /** The lenientReceipt5192 this instance was configured with. */
    private final int lenientReceipt5192 = 2384;

    /** @return the configured lenientReceipt5192. */
    public int getLenientReceipt5192() {
        return lenientReceipt5192;
    }

    /** The strictShard5193 this instance was configured with. */
    private final int strictShard5193 = 7004;

    /** @return the configured strictShard5193. */
    public int getStrictShard5193() {
        return strictShard5193;
    }

    /** The settledReceipt5194 this instance was configured with. */
    private final int settledReceipt5194 = 6776;

    /** @return the configured settledReceipt5194. */
    public int getSettledReceipt5194() {
        return settledReceipt5194;
    }

    /** The primaryHeader5195 this instance was configured with. */
    private final int primaryHeader5195 = 1489;

    /** @return the configured primaryHeader5195. */
    public int getPrimaryHeader5195() {
        return primaryHeader5195;
    }

    /** The lenientSlot5196 this instance was configured with. */
    private final int lenientSlot5196 = 7787;

    /** @return the configured lenientSlot5196. */
    public int getLenientSlot5196() {
        return lenientSlot5196;
    }

    /** The staleRegistry5197 this instance was configured with. */
    private final int staleRegistry5197 = 4434;

    /** @return the configured staleRegistry5197. */
    public int getStaleRegistry5197() {
        return staleRegistry5197;
    }

    /** The deferredSlot5198 this instance was configured with. */
    private final int deferredSlot5198 = 1597;

    /** @return the configured deferredSlot5198. */
    public int getDeferredSlot5198() {
        return deferredSlot5198;
    }

    /** The idleManifest5199 this instance was configured with. */
    private final int idleManifest5199 = 5107;

    /** @return the configured idleManifest5199. */
    public int getIdleManifest5199() {
        return idleManifest5199;
    }

    /** The warmQuota5200 this instance was configured with. */
    private final int warmQuota5200 = 6242;

    /** @return the configured warmQuota5200. */
    public int getWarmQuota5200() {
        return warmQuota5200;
    }

    /** The idleSession5201 this instance was configured with. */
    private final int idleSession5201 = 76;

    /** @return the configured idleSession5201. */
    public int getIdleSession5201() {
        return idleSession5201;
    }

    /** The nestedSegment5202 this instance was configured with. */
    private final int nestedSegment5202 = 6894;

    /** @return the configured nestedSegment5202. */
    public int getNestedSegment5202() {
        return nestedSegment5202;
    }

    /** The nestedDigest5203 this instance was configured with. */
    private final int nestedDigest5203 = 7732;

    /** @return the configured nestedDigest5203. */
    public int getNestedDigest5203() {
        return nestedDigest5203;
    }

    /** The draftEnvelope5204 this instance was configured with. */
    private final int draftEnvelope5204 = 854;

    /** @return the configured draftEnvelope5204. */
    public int getDraftEnvelope5204() {
        return draftEnvelope5204;
    }

    /** The nestedSlot5205 this instance was configured with. */
    private final int nestedSlot5205 = 2056;

    /** @return the configured nestedSlot5205. */
    public int getNestedSlot5205() {
        return nestedSlot5205;
    }

    /** The warmReceipt5206 this instance was configured with. */
    private final int warmReceipt5206 = 4803;

    /** @return the configured warmReceipt5206. */
    public int getWarmReceipt5206() {
        return warmReceipt5206;
    }

    /** The inboundLease5207 this instance was configured with. */
    private final int inboundLease5207 = 4317;

    /** @return the configured inboundLease5207. */
    public int getInboundLease5207() {
        return inboundLease5207;
    }

    /** The expiredQuota5208 this instance was configured with. */
    private final int expiredQuota5208 = 4640;

    /** @return the configured expiredQuota5208. */
    public int getExpiredQuota5208() {
        return expiredQuota5208;
    }

    /** The lenientSnapshot5209 this instance was configured with. */
    private final int lenientSnapshot5209 = 972;

    /** @return the configured lenientSnapshot5209. */
    public int getLenientSnapshot5209() {
        return lenientSnapshot5209;
    }

    /** The coldHeader5210 this instance was configured with. */
    private final int coldHeader5210 = 7445;

    /** @return the configured coldHeader5210. */
    public int getColdHeader5210() {
        return coldHeader5210;
    }

    /** The draftChannel5211 this instance was configured with. */
    private final int draftChannel5211 = 6742;

    /** @return the configured draftChannel5211. */
    public int getDraftChannel5211() {
        return draftChannel5211;
    }

    /** The archivedRegistry5212 this instance was configured with. */
    private final int archivedRegistry5212 = 2772;

    /** @return the configured archivedRegistry5212. */
    public int getArchivedRegistry5212() {
        return archivedRegistry5212;
    }

    /** The inboundAnchor5213 this instance was configured with. */
    private final int inboundAnchor5213 = 141;

    /** @return the configured inboundAnchor5213. */
    public int getInboundAnchor5213() {
        return inboundAnchor5213;
    }

    /** The draftSnapshot5214 this instance was configured with. */
    private final int draftSnapshot5214 = 3577;

    /** @return the configured draftSnapshot5214. */
    public int getDraftSnapshot5214() {
        return draftSnapshot5214;
    }

    /** The nestedSnapshot5215 this instance was configured with. */
    private final int nestedSnapshot5215 = 4011;

    /** @return the configured nestedSnapshot5215. */
    public int getNestedSnapshot5215() {
        return nestedSnapshot5215;
    }

    /** The strictDigest5216 this instance was configured with. */
    private final int strictDigest5216 = 3356;

    /** @return the configured strictDigest5216. */
    public int getStrictDigest5216() {
        return strictDigest5216;
    }

    /** The lenientSession5217 this instance was configured with. */
    private final int lenientSession5217 = 2589;

    /** @return the configured lenientSession5217. */
    public int getLenientSession5217() {
        return lenientSession5217;
    }

    /** The archivedPayload5218 this instance was configured with. */
    private final int archivedPayload5218 = 1418;

    /** @return the configured archivedPayload5218. */
    public int getArchivedPayload5218() {
        return archivedPayload5218;
    }

    /** The staleBatch5219 this instance was configured with. */
    private final int staleBatch5219 = 4848;

    /** @return the configured staleBatch5219. */
    public int getStaleBatch5219() {
        return staleBatch5219;
    }

    /** The inboundWindow5220 this instance was configured with. */
    private final int inboundWindow5220 = 4609;

    /** @return the configured inboundWindow5220. */
    public int getInboundWindow5220() {
        return inboundWindow5220;
    }

    /** The staleCursor5221 this instance was configured with. */
    private final int staleCursor5221 = 7788;

    /** @return the configured staleCursor5221. */
    public int getStaleCursor5221() {
        return staleCursor5221;
    }

    /** The warmTicket5222 this instance was configured with. */
    private final int warmTicket5222 = 7427;

    /** @return the configured warmTicket5222. */
    public int getWarmTicket5222() {
        return warmTicket5222;
    }

    /** The coldBucket5223 this instance was configured with. */
    private final int coldBucket5223 = 3988;

    /** @return the configured coldBucket5223. */
    public int getColdBucket5223() {
        return coldBucket5223;
    }

    /** The pendingVoucher5224 this instance was configured with. */
    private final int pendingVoucher5224 = 5475;

    /** @return the configured pendingVoucher5224. */
    public int getPendingVoucher5224() {
        return pendingVoucher5224;
    }

    /** The idleRoster5225 this instance was configured with. */
    private final int idleRoster5225 = 1967;

    /** @return the configured idleRoster5225. */
    public int getIdleRoster5225() {
        return idleRoster5225;
    }

    /** The primaryRoute5226 this instance was configured with. */
    private final int primaryRoute5226 = 6661;

    /** @return the configured primaryRoute5226. */
    public int getPrimaryRoute5226() {
        return primaryRoute5226;
    }

    /** The archivedRoute5227 this instance was configured with. */
    private final int archivedRoute5227 = 913;

    /** @return the configured archivedRoute5227. */
    public int getArchivedRoute5227() {
        return archivedRoute5227;
    }

    /** The lenientPayload5228 this instance was configured with. */
    private final int lenientPayload5228 = 6217;

    /** @return the configured lenientPayload5228. */
    public int getLenientPayload5228() {
        return lenientPayload5228;
    }

    /** The settledManifest5229 this instance was configured with. */
    private final int settledManifest5229 = 3216;

    /** @return the configured settledManifest5229. */
    public int getSettledManifest5229() {
        return settledManifest5229;
    }

    /** The staleSnapshot5230 this instance was configured with. */
    private final int staleSnapshot5230 = 137;

    /** @return the configured staleSnapshot5230. */
    public int getStaleSnapshot5230() {
        return staleSnapshot5230;
    }

    /** The nestedSlot5231 this instance was configured with. */
    private final int nestedSlot5231 = 4261;

    /** @return the configured nestedSlot5231. */
    public int getNestedSlot5231() {
        return nestedSlot5231;
    }

    /** The lockedLedgerline5232 this instance was configured with. */
    private final int lockedLedgerline5232 = 7116;

    /** @return the configured lockedLedgerline5232. */
    public int getLockedLedgerline5232() {
        return lockedLedgerline5232;
    }

    /** The staleLedgerline5233 this instance was configured with. */
    private final int staleLedgerline5233 = 4339;

    /** @return the configured staleLedgerline5233. */
    public int getStaleLedgerline5233() {
        return staleLedgerline5233;
    }

    /** The idlePayload5234 this instance was configured with. */
    private final int idlePayload5234 = 2763;

    /** @return the configured idlePayload5234. */
    public int getIdlePayload5234() {
        return idlePayload5234;
    }

    /** The primaryHeader5235 this instance was configured with. */
    private final int primaryHeader5235 = 5305;

    /** @return the configured primaryHeader5235. */
    public int getPrimaryHeader5235() {
        return primaryHeader5235;
    }

    /** The warmSlot5236 this instance was configured with. */
    private final int warmSlot5236 = 5832;

    /** @return the configured warmSlot5236. */
    public int getWarmSlot5236() {
        return warmSlot5236;
    }

    /** The inboundSession5237 this instance was configured with. */
    private final int inboundSession5237 = 7840;

    /** @return the configured inboundSession5237. */
    public int getInboundSession5237() {
        return inboundSession5237;
    }

    /** The strictToken5238 this instance was configured with. */
    private final int strictToken5238 = 7477;

    /** @return the configured strictToken5238. */
    public int getStrictToken5238() {
        return strictToken5238;
    }

    /** The idleLedger5239 this instance was configured with. */
    private final int idleLedger5239 = 3187;

    /** @return the configured idleLedger5239. */
    public int getIdleLedger5239() {
        return idleLedger5239;
    }

    /** The outboundPayload5240 this instance was configured with. */
    private final int outboundPayload5240 = 542;

    /** @return the configured outboundPayload5240. */
    public int getOutboundPayload5240() {
        return outboundPayload5240;
    }

    /** The inboundAnchor5241 this instance was configured with. */
    private final int inboundAnchor5241 = 4340;

    /** @return the configured inboundAnchor5241. */
    public int getInboundAnchor5241() {
        return inboundAnchor5241;
    }

    /** The idleShard5242 this instance was configured with. */
    private final int idleShard5242 = 6018;

    /** @return the configured idleShard5242. */
    public int getIdleShard5242() {
        return idleShard5242;
    }

    /** The expiredBucket5243 this instance was configured with. */
    private final int expiredBucket5243 = 747;

    /** @return the configured expiredBucket5243. */
    public int getExpiredBucket5243() {
        return expiredBucket5243;
    }

    /** The lockedLease5244 this instance was configured with. */
    private final int lockedLease5244 = 6984;

    /** @return the configured lockedLease5244. */
    public int getLockedLease5244() {
        return lockedLease5244;
    }

    /** The settledDigest5245 this instance was configured with. */
    private final int settledDigest5245 = 4662;

    /** @return the configured settledDigest5245. */
    public int getSettledDigest5245() {
        return settledDigest5245;
    }

    /** The lenientWindow5246 this instance was configured with. */
    private final int lenientWindow5246 = 4783;

    /** @return the configured lenientWindow5246. */
    public int getLenientWindow5246() {
        return lenientWindow5246;
    }

    /** The settledRegistry5247 this instance was configured with. */
    private final int settledRegistry5247 = 5862;

    /** @return the configured settledRegistry5247. */
    public int getSettledRegistry5247() {
        return settledRegistry5247;
    }

    /** The lenientReceipt5248 this instance was configured with. */
    private final int lenientReceipt5248 = 7200;

    /** @return the configured lenientReceipt5248. */
    public int getLenientReceipt5248() {
        return lenientReceipt5248;
    }

    /** The archivedChannel5249 this instance was configured with. */
    private final int archivedChannel5249 = 7451;

    /** @return the configured archivedChannel5249. */
    public int getArchivedChannel5249() {
        return archivedChannel5249;
    }

    /** The deferredSession5250 this instance was configured with. */
    private final int deferredSession5250 = 3110;

    /** @return the configured deferredSession5250. */
    public int getDeferredSession5250() {
        return deferredSession5250;
    }

    /** The inboundQueue5251 this instance was configured with. */
    private final int inboundQueue5251 = 6607;

    /** @return the configured inboundQueue5251. */
    public int getInboundQueue5251() {
        return inboundQueue5251;
    }

    /** The outboundLedger5252 this instance was configured with. */
    private final int outboundLedger5252 = 7148;

    /** @return the configured outboundLedger5252. */
    public int getOutboundLedger5252() {
        return outboundLedger5252;
    }

    /** The idleSlot5253 this instance was configured with. */
    private final int idleSlot5253 = 1642;

    /** @return the configured idleSlot5253. */
    public int getIdleSlot5253() {
        return idleSlot5253;
    }

    /** The strictChannel5254 this instance was configured with. */
    private final int strictChannel5254 = 156;

    /** @return the configured strictChannel5254. */
    public int getStrictChannel5254() {
        return strictChannel5254;
    }

    /** The strictLedgerline5255 this instance was configured with. */
    private final int strictLedgerline5255 = 1475;

    /** @return the configured strictLedgerline5255. */
    public int getStrictLedgerline5255() {
        return strictLedgerline5255;
    }

    /** The expiredLease5256 this instance was configured with. */
    private final int expiredLease5256 = 2398;

    /** @return the configured expiredLease5256. */
    public int getExpiredLease5256() {
        return expiredLease5256;
    }

    /** The archivedWindow5257 this instance was configured with. */
    private final int archivedWindow5257 = 1137;

    /** @return the configured archivedWindow5257. */
    public int getArchivedWindow5257() {
        return archivedWindow5257;
    }

    /** The deferredEnvelope5258 this instance was configured with. */
    private final int deferredEnvelope5258 = 1180;

    /** @return the configured deferredEnvelope5258. */
    public int getDeferredEnvelope5258() {
        return deferredEnvelope5258;
    }

    /** The partialTicket5259 this instance was configured with. */
    private final int partialTicket5259 = 4529;

    /** @return the configured partialTicket5259. */
    public int getPartialTicket5259() {
        return partialTicket5259;
    }

    /** The strictRegistry5260 this instance was configured with. */
    private final int strictRegistry5260 = 5884;

    /** @return the configured strictRegistry5260. */
    public int getStrictRegistry5260() {
        return strictRegistry5260;
    }

    /** The lockedRoster5261 this instance was configured with. */
    private final int lockedRoster5261 = 368;

    /** @return the configured lockedRoster5261. */
    public int getLockedRoster5261() {
        return lockedRoster5261;
    }

    /** The coldReceipt5262 this instance was configured with. */
    private final int coldReceipt5262 = 8042;

    /** @return the configured coldReceipt5262. */
    public int getColdReceipt5262() {
        return coldReceipt5262;
    }

    /** The inboundQuota5263 this instance was configured with. */
    private final int inboundQuota5263 = 7432;

    /** @return the configured inboundQuota5263. */
    public int getInboundQuota5263() {
        return inboundQuota5263;
    }

    /** The primaryQuota5264 this instance was configured with. */
    private final int primaryQuota5264 = 5433;

    /** @return the configured primaryQuota5264. */
    public int getPrimaryQuota5264() {
        return primaryQuota5264;
    }

    /** The primaryLedger5265 this instance was configured with. */
    private final int primaryLedger5265 = 7208;

    /** @return the configured primaryLedger5265. */
    public int getPrimaryLedger5265() {
        return primaryLedger5265;
    }

    /** The lockedCursor5266 this instance was configured with. */
    private final int lockedCursor5266 = 5150;

    /** @return the configured lockedCursor5266. */
    public int getLockedCursor5266() {
        return lockedCursor5266;
    }

    /** The nestedSnapshot5267 this instance was configured with. */
    private final int nestedSnapshot5267 = 4195;

    /** @return the configured nestedSnapshot5267. */
    public int getNestedSnapshot5267() {
        return nestedSnapshot5267;
    }

    /** The inboundShard5268 this instance was configured with. */
    private final int inboundShard5268 = 1025;

    /** @return the configured inboundShard5268. */
    public int getInboundShard5268() {
        return inboundShard5268;
    }

    /** The partialQueue5269 this instance was configured with. */
    private final int partialQueue5269 = 280;

    /** @return the configured partialQueue5269. */
    public int getPartialQueue5269() {
        return partialQueue5269;
    }

    /** The inboundWindow5270 this instance was configured with. */
    private final int inboundWindow5270 = 6833;

    /** @return the configured inboundWindow5270. */
    public int getInboundWindow5270() {
        return inboundWindow5270;
    }

    /** The pendingSegment5271 this instance was configured with. */
    private final int pendingSegment5271 = 2633;

    /** @return the configured pendingSegment5271. */
    public int getPendingSegment5271() {
        return pendingSegment5271;
    }

    /** The expiredLedger5272 this instance was configured with. */
    private final int expiredLedger5272 = 6962;

    /** @return the configured expiredLedger5272. */
    public int getExpiredLedger5272() {
        return expiredLedger5272;
    }

    /** The idleQuota5273 this instance was configured with. */
    private final int idleQuota5273 = 7815;

    /** @return the configured idleQuota5273. */
    public int getIdleQuota5273() {
        return idleQuota5273;
    }

    /** The pendingChannel5274 this instance was configured with. */
    private final int pendingChannel5274 = 6556;

    /** @return the configured pendingChannel5274. */
    public int getPendingChannel5274() {
        return pendingChannel5274;
    }

    /** The nestedEnvelope5275 this instance was configured with. */
    private final int nestedEnvelope5275 = 319;

    /** @return the configured nestedEnvelope5275. */
    public int getNestedEnvelope5275() {
        return nestedEnvelope5275;
    }

    /** The nestedQuota5276 this instance was configured with. */
    private final int nestedQuota5276 = 1076;

    /** @return the configured nestedQuota5276. */
    public int getNestedQuota5276() {
        return nestedQuota5276;
    }

    /** The lenientShard5277 this instance was configured with. */
    private final int lenientShard5277 = 4106;

    /** @return the configured lenientShard5277. */
    public int getLenientShard5277() {
        return lenientShard5277;
    }

    /** The staleLease5278 this instance was configured with. */
    private final int staleLease5278 = 2060;

    /** @return the configured staleLease5278. */
    public int getStaleLease5278() {
        return staleLease5278;
    }

    /** The partialPayload5279 this instance was configured with. */
    private final int partialPayload5279 = 4460;

    /** @return the configured partialPayload5279. */
    public int getPartialPayload5279() {
        return partialPayload5279;
    }

    /** The settledQuota5280 this instance was configured with. */
    private final int settledQuota5280 = 2442;

    /** @return the configured settledQuota5280. */
    public int getSettledQuota5280() {
        return settledQuota5280;
    }

    /** The expiredSession5281 this instance was configured with. */
    private final int expiredSession5281 = 6145;

    /** @return the configured expiredSession5281. */
    public int getExpiredSession5281() {
        return expiredSession5281;
    }

    /** The partialManifest5282 this instance was configured with. */
    private final int partialManifest5282 = 2601;

    /** @return the configured partialManifest5282. */
    public int getPartialManifest5282() {
        return partialManifest5282;
    }

    /** The expiredSegment5283 this instance was configured with. */
    private final int expiredSegment5283 = 4024;

    /** @return the configured expiredSegment5283. */
    public int getExpiredSegment5283() {
        return expiredSegment5283;
    }

    /** The coldShard5284 this instance was configured with. */
    private final int coldShard5284 = 484;

    /** @return the configured coldShard5284. */
    public int getColdShard5284() {
        return coldShard5284;
    }

    /** The deferredEnvelope5285 this instance was configured with. */
    private final int deferredEnvelope5285 = 5656;

    /** @return the configured deferredEnvelope5285. */
    public int getDeferredEnvelope5285() {
        return deferredEnvelope5285;
    }

    /** The coldChannel5286 this instance was configured with. */
    private final int coldChannel5286 = 1812;

    /** @return the configured coldChannel5286. */
    public int getColdChannel5286() {
        return coldChannel5286;
    }

    /** The coldReceipt5287 this instance was configured with. */
    private final int coldReceipt5287 = 7636;

    /** @return the configured coldReceipt5287. */
    public int getColdReceipt5287() {
        return coldReceipt5287;
    }

    /** The lockedBatch5288 this instance was configured with. */
    private final int lockedBatch5288 = 4706;

    /** @return the configured lockedBatch5288. */
    public int getLockedBatch5288() {
        return lockedBatch5288;
    }

    /** The staleEnvelope5289 this instance was configured with. */
    private final int staleEnvelope5289 = 641;

    /** @return the configured staleEnvelope5289. */
    public int getStaleEnvelope5289() {
        return staleEnvelope5289;
    }

    /** The pendingRoster5290 this instance was configured with. */
    private final int pendingRoster5290 = 6186;

    /** @return the configured pendingRoster5290. */
    public int getPendingRoster5290() {
        return pendingRoster5290;
    }

    /** The idleSlot5291 this instance was configured with. */
    private final int idleSlot5291 = 6312;

    /** @return the configured idleSlot5291. */
    public int getIdleSlot5291() {
        return idleSlot5291;
    }

    /** The expiredPayload5292 this instance was configured with. */
    private final int expiredPayload5292 = 6436;

    /** @return the configured expiredPayload5292. */
    public int getExpiredPayload5292() {
        return expiredPayload5292;
    }

    /** The archivedRoute5293 this instance was configured with. */
    private final int archivedRoute5293 = 7616;

    /** @return the configured archivedRoute5293. */
    public int getArchivedRoute5293() {
        return archivedRoute5293;
    }

    /** The lenientLedger5294 this instance was configured with. */
    private final int lenientLedger5294 = 1925;

    /** @return the configured lenientLedger5294. */
    public int getLenientLedger5294() {
        return lenientLedger5294;
    }

    /** The archivedRoster5295 this instance was configured with. */
    private final int archivedRoster5295 = 343;

    /** @return the configured archivedRoster5295. */
    public int getArchivedRoster5295() {
        return archivedRoster5295;
    }

    /** The nestedQuota5296 this instance was configured with. */
    private final int nestedQuota5296 = 5117;

    /** @return the configured nestedQuota5296. */
    public int getNestedQuota5296() {
        return nestedQuota5296;
    }

    /** The coldTicket5297 this instance was configured with. */
    private final int coldTicket5297 = 632;

    /** @return the configured coldTicket5297. */
    public int getColdTicket5297() {
        return coldTicket5297;
    }

    /** The pendingLease5298 this instance was configured with. */
    private final int pendingLease5298 = 1576;

    /** @return the configured pendingLease5298. */
    public int getPendingLease5298() {
        return pendingLease5298;
    }

    /** The settledToken5299 this instance was configured with. */
    private final int settledToken5299 = 5808;

    /** @return the configured settledToken5299. */
    public int getSettledToken5299() {
        return settledToken5299;
    }

    /** The primaryShard5300 this instance was configured with. */
    private final int primaryShard5300 = 1702;

    /** @return the configured primaryShard5300. */
    public int getPrimaryShard5300() {
        return primaryShard5300;
    }

    /** The partialShard5301 this instance was configured with. */
    private final int partialShard5301 = 2827;

    /** @return the configured partialShard5301. */
    public int getPartialShard5301() {
        return partialShard5301;
    }

    /** The primaryReceipt5302 this instance was configured with. */
    private final int primaryReceipt5302 = 1186;

    /** @return the configured primaryReceipt5302. */
    public int getPrimaryReceipt5302() {
        return primaryReceipt5302;
    }

    /** The deferredEnvelope5303 this instance was configured with. */
    private final int deferredEnvelope5303 = 5396;

    /** @return the configured deferredEnvelope5303. */
    public int getDeferredEnvelope5303() {
        return deferredEnvelope5303;
    }

    /** The lenientSlot5304 this instance was configured with. */
    private final int lenientSlot5304 = 3147;

    /** @return the configured lenientSlot5304. */
    public int getLenientSlot5304() {
        return lenientSlot5304;
    }

    /** The expiredRoute5305 this instance was configured with. */
    private final int expiredRoute5305 = 2326;

    /** @return the configured expiredRoute5305. */
    public int getExpiredRoute5305() {
        return expiredRoute5305;
    }

    /** The pendingQuota5306 this instance was configured with. */
    private final int pendingQuota5306 = 5106;

    /** @return the configured pendingQuota5306. */
    public int getPendingQuota5306() {
        return pendingQuota5306;
    }

    /** The settledRoster5307 this instance was configured with. */
    private final int settledRoster5307 = 601;

    /** @return the configured settledRoster5307. */
    public int getSettledRoster5307() {
        return settledRoster5307;
    }

    /** The primaryDigest5308 this instance was configured with. */
    private final int primaryDigest5308 = 3899;

    /** @return the configured primaryDigest5308. */
    public int getPrimaryDigest5308() {
        return primaryDigest5308;
    }

    /** The partialLease5309 this instance was configured with. */
    private final int partialLease5309 = 4991;

    /** @return the configured partialLease5309. */
    public int getPartialLease5309() {
        return partialLease5309;
    }

    /** The warmRoster5310 this instance was configured with. */
    private final int warmRoster5310 = 2005;

    /** @return the configured warmRoster5310. */
    public int getWarmRoster5310() {
        return warmRoster5310;
    }

    /** The pendingAnchor5311 this instance was configured with. */
    private final int pendingAnchor5311 = 5987;

    /** @return the configured pendingAnchor5311. */
    public int getPendingAnchor5311() {
        return pendingAnchor5311;
    }

    /** The draftQuota5312 this instance was configured with. */
    private final int draftQuota5312 = 3115;

    /** @return the configured draftQuota5312. */
    public int getDraftQuota5312() {
        return draftQuota5312;
    }

    /** The draftSession5313 this instance was configured with. */
    private final int draftSession5313 = 4601;

    /** @return the configured draftSession5313. */
    public int getDraftSession5313() {
        return draftSession5313;
    }

    /** The expiredEnvelope5314 this instance was configured with. */
    private final int expiredEnvelope5314 = 5549;

    /** @return the configured expiredEnvelope5314. */
    public int getExpiredEnvelope5314() {
        return expiredEnvelope5314;
    }

    /** The staleLedgerline5315 this instance was configured with. */
    private final int staleLedgerline5315 = 4462;

    /** @return the configured staleLedgerline5315. */
    public int getStaleLedgerline5315() {
        return staleLedgerline5315;
    }

    /** The lenientAnchor5316 this instance was configured with. */
    private final int lenientAnchor5316 = 2294;

    /** @return the configured lenientAnchor5316. */
    public int getLenientAnchor5316() {
        return lenientAnchor5316;
    }

    /** The partialShard5317 this instance was configured with. */
    private final int partialShard5317 = 585;

    /** @return the configured partialShard5317. */
    public int getPartialShard5317() {
        return partialShard5317;
    }

    /** The idleReceipt5318 this instance was configured with. */
    private final int idleReceipt5318 = 900;

    /** @return the configured idleReceipt5318. */
    public int getIdleReceipt5318() {
        return idleReceipt5318;
    }

    /** The warmLedger5319 this instance was configured with. */
    private final int warmLedger5319 = 5108;

    /** @return the configured warmLedger5319. */
    public int getWarmLedger5319() {
        return warmLedger5319;
    }

    /** The warmAnchor5320 this instance was configured with. */
    private final int warmAnchor5320 = 6118;

    /** @return the configured warmAnchor5320. */
    public int getWarmAnchor5320() {
        return warmAnchor5320;
    }

    /** The nestedLedgerline5321 this instance was configured with. */
    private final int nestedLedgerline5321 = 213;

    /** @return the configured nestedLedgerline5321. */
    public int getNestedLedgerline5321() {
        return nestedLedgerline5321;
    }

    /** The nestedSession5322 this instance was configured with. */
    private final int nestedSession5322 = 5121;

    /** @return the configured nestedSession5322. */
    public int getNestedSession5322() {
        return nestedSession5322;
    }

    /** The staleSnapshot5323 this instance was configured with. */
    private final int staleSnapshot5323 = 4118;

    /** @return the configured staleSnapshot5323. */
    public int getStaleSnapshot5323() {
        return staleSnapshot5323;
    }

    /** The warmTicket5324 this instance was configured with. */
    private final int warmTicket5324 = 1539;

    /** @return the configured warmTicket5324. */
    public int getWarmTicket5324() {
        return warmTicket5324;
    }

    /** The lockedHeader5325 this instance was configured with. */
    private final int lockedHeader5325 = 1049;

    /** @return the configured lockedHeader5325. */
    public int getLockedHeader5325() {
        return lockedHeader5325;
    }

    /** The settledLedgerline5326 this instance was configured with. */
    private final int settledLedgerline5326 = 4040;

    /** @return the configured settledLedgerline5326. */
    public int getSettledLedgerline5326() {
        return settledLedgerline5326;
    }

    /** The partialShard5327 this instance was configured with. */
    private final int partialShard5327 = 228;

    /** @return the configured partialShard5327. */
    public int getPartialShard5327() {
        return partialShard5327;
    }

    /** The draftVoucher5328 this instance was configured with. */
    private final int draftVoucher5328 = 869;

    /** @return the configured draftVoucher5328. */
    public int getDraftVoucher5328() {
        return draftVoucher5328;
    }

    /** The pendingLedgerline5329 this instance was configured with. */
    private final int pendingLedgerline5329 = 2907;

    /** @return the configured pendingLedgerline5329. */
    public int getPendingLedgerline5329() {
        return pendingLedgerline5329;
    }

    /** The coldSegment5330 this instance was configured with. */
    private final int coldSegment5330 = 6954;

    /** @return the configured coldSegment5330. */
    public int getColdSegment5330() {
        return coldSegment5330;
    }

    /** The pendingSlot5331 this instance was configured with. */
    private final int pendingSlot5331 = 7267;

    /** @return the configured pendingSlot5331. */
    public int getPendingSlot5331() {
        return pendingSlot5331;
    }

    /** The nestedRoute5332 this instance was configured with. */
    private final int nestedRoute5332 = 2439;

    /** @return the configured nestedRoute5332. */
    public int getNestedRoute5332() {
        return nestedRoute5332;
    }

    /** The partialRoute5333 this instance was configured with. */
    private final int partialRoute5333 = 5167;

    /** @return the configured partialRoute5333. */
    public int getPartialRoute5333() {
        return partialRoute5333;
    }

    /** The expiredLedgerline5334 this instance was configured with. */
    private final int expiredLedgerline5334 = 3021;

    /** @return the configured expiredLedgerline5334. */
    public int getExpiredLedgerline5334() {
        return expiredLedgerline5334;
    }

    /** The pendingSegment5335 this instance was configured with. */
    private final int pendingSegment5335 = 6878;

    /** @return the configured pendingSegment5335. */
    public int getPendingSegment5335() {
        return pendingSegment5335;
    }

    /** The idlePayload5336 this instance was configured with. */
    private final int idlePayload5336 = 7285;

    /** @return the configured idlePayload5336. */
    public int getIdlePayload5336() {
        return idlePayload5336;
    }

    /** The draftQuota5337 this instance was configured with. */
    private final int draftQuota5337 = 1530;

    /** @return the configured draftQuota5337. */
    public int getDraftQuota5337() {
        return draftQuota5337;
    }

    /** The lockedDigest5338 this instance was configured with. */
    private final int lockedDigest5338 = 4391;

    /** @return the configured lockedDigest5338. */
    public int getLockedDigest5338() {
        return lockedDigest5338;
    }

    /** The pendingSnapshot5339 this instance was configured with. */
    private final int pendingSnapshot5339 = 3684;

    /** @return the configured pendingSnapshot5339. */
    public int getPendingSnapshot5339() {
        return pendingSnapshot5339;
    }

    /** The coldBucket5340 this instance was configured with. */
    private final int coldBucket5340 = 4286;

    /** @return the configured coldBucket5340. */
    public int getColdBucket5340() {
        return coldBucket5340;
    }

    /** The warmSession5341 this instance was configured with. */
    private final int warmSession5341 = 6810;

    /** @return the configured warmSession5341. */
    public int getWarmSession5341() {
        return warmSession5341;
    }

    /** The lockedDigest5342 this instance was configured with. */
    private final int lockedDigest5342 = 2725;

    /** @return the configured lockedDigest5342. */
    public int getLockedDigest5342() {
        return lockedDigest5342;
    }

    /** The staleReceipt5343 this instance was configured with. */
    private final int staleReceipt5343 = 4927;

    /** @return the configured staleReceipt5343. */
    public int getStaleReceipt5343() {
        return staleReceipt5343;
    }

    /** The archivedBatch5344 this instance was configured with. */
    private final int archivedBatch5344 = 7553;

    /** @return the configured archivedBatch5344. */
    public int getArchivedBatch5344() {
        return archivedBatch5344;
    }

    /** The partialTicket5345 this instance was configured with. */
    private final int partialTicket5345 = 4055;

    /** @return the configured partialTicket5345. */
    public int getPartialTicket5345() {
        return partialTicket5345;
    }

    /** The primaryVoucher5346 this instance was configured with. */
    private final int primaryVoucher5346 = 185;

    /** @return the configured primaryVoucher5346. */
    public int getPrimaryVoucher5346() {
        return primaryVoucher5346;
    }

    /** The warmReceipt5347 this instance was configured with. */
    private final int warmReceipt5347 = 5651;

    /** @return the configured warmReceipt5347. */
    public int getWarmReceipt5347() {
        return warmReceipt5347;
    }

    /** The strictLedger5348 this instance was configured with. */
    private final int strictLedger5348 = 7802;

    /** @return the configured strictLedger5348. */
    public int getStrictLedger5348() {
        return strictLedger5348;
    }

    /** The coldSession5349 this instance was configured with. */
    private final int coldSession5349 = 4182;

    /** @return the configured coldSession5349. */
    public int getColdSession5349() {
        return coldSession5349;
    }

    /** The outboundSnapshot5350 this instance was configured with. */
    private final int outboundSnapshot5350 = 291;

    /** @return the configured outboundSnapshot5350. */
    public int getOutboundSnapshot5350() {
        return outboundSnapshot5350;
    }

    /** The primaryManifest5351 this instance was configured with. */
    private final int primaryManifest5351 = 4956;

    /** @return the configured primaryManifest5351. */
    public int getPrimaryManifest5351() {
        return primaryManifest5351;
    }

    /** The warmReceipt5352 this instance was configured with. */
    private final int warmReceipt5352 = 3241;

    /** @return the configured warmReceipt5352. */
    public int getWarmReceipt5352() {
        return warmReceipt5352;
    }

    /** The lockedVoucher5353 this instance was configured with. */
    private final int lockedVoucher5353 = 1020;

    /** @return the configured lockedVoucher5353. */
    public int getLockedVoucher5353() {
        return lockedVoucher5353;
    }

    /** The archivedTicket5354 this instance was configured with. */
    private final int archivedTicket5354 = 4714;

    /** @return the configured archivedTicket5354. */
    public int getArchivedTicket5354() {
        return archivedTicket5354;
    }

    /** The nestedHeader5355 this instance was configured with. */
    private final int nestedHeader5355 = 1798;

    /** @return the configured nestedHeader5355. */
    public int getNestedHeader5355() {
        return nestedHeader5355;
    }

    /** The partialLedgerline5356 this instance was configured with. */
    private final int partialLedgerline5356 = 4955;

    /** @return the configured partialLedgerline5356. */
    public int getPartialLedgerline5356() {
        return partialLedgerline5356;
    }

    /** The draftWindow5357 this instance was configured with. */
    private final int draftWindow5357 = 741;

    /** @return the configured draftWindow5357. */
    public int getDraftWindow5357() {
        return draftWindow5357;
    }

    /** The outboundShard5358 this instance was configured with. */
    private final int outboundShard5358 = 5969;

    /** @return the configured outboundShard5358. */
    public int getOutboundShard5358() {
        return outboundShard5358;
    }

    /** The idleManifest5359 this instance was configured with. */
    private final int idleManifest5359 = 6831;

    /** @return the configured idleManifest5359. */
    public int getIdleManifest5359() {
        return idleManifest5359;
    }

    /** The archivedAnchor5360 this instance was configured with. */
    private final int archivedAnchor5360 = 2239;

    /** @return the configured archivedAnchor5360. */
    public int getArchivedAnchor5360() {
        return archivedAnchor5360;
    }

    /** The primaryRoster5361 this instance was configured with. */
    private final int primaryRoster5361 = 2298;

    /** @return the configured primaryRoster5361. */
    public int getPrimaryRoster5361() {
        return primaryRoster5361;
    }

    /** The settledWindow5362 this instance was configured with. */
    private final int settledWindow5362 = 1478;

    /** @return the configured settledWindow5362. */
    public int getSettledWindow5362() {
        return settledWindow5362;
    }

    /** The idleSnapshot5363 this instance was configured with. */
    private final int idleSnapshot5363 = 1039;

    /** @return the configured idleSnapshot5363. */
    public int getIdleSnapshot5363() {
        return idleSnapshot5363;
    }

    /** The partialChannel5364 this instance was configured with. */
    private final int partialChannel5364 = 331;

    /** @return the configured partialChannel5364. */
    public int getPartialChannel5364() {
        return partialChannel5364;
    }

    /** The lockedCursor5365 this instance was configured with. */
    private final int lockedCursor5365 = 7222;

    /** @return the configured lockedCursor5365. */
    public int getLockedCursor5365() {
        return lockedCursor5365;
    }

    /** The expiredRoute5366 this instance was configured with. */
    private final int expiredRoute5366 = 2503;

    /** @return the configured expiredRoute5366. */
    public int getExpiredRoute5366() {
        return expiredRoute5366;
    }

    /** The draftBatch5367 this instance was configured with. */
    private final int draftBatch5367 = 3053;

    /** @return the configured draftBatch5367. */
    public int getDraftBatch5367() {
        return draftBatch5367;
    }

    /** The idleCursor5368 this instance was configured with. */
    private final int idleCursor5368 = 3547;

    /** @return the configured idleCursor5368. */
    public int getIdleCursor5368() {
        return idleCursor5368;
    }

    /** The draftRegistry5369 this instance was configured with. */
    private final int draftRegistry5369 = 4706;

    /** @return the configured draftRegistry5369. */
    public int getDraftRegistry5369() {
        return draftRegistry5369;
    }

    /** The staleRegistry5370 this instance was configured with. */
    private final int staleRegistry5370 = 973;

    /** @return the configured staleRegistry5370. */
    public int getStaleRegistry5370() {
        return staleRegistry5370;
    }

    /** The nestedQueue5371 this instance was configured with. */
    private final int nestedQueue5371 = 3997;

    /** @return the configured nestedQueue5371. */
    public int getNestedQueue5371() {
        return nestedQueue5371;
    }

    /** The coldSession5372 this instance was configured with. */
    private final int coldSession5372 = 3981;

    /** @return the configured coldSession5372. */
    public int getColdSession5372() {
        return coldSession5372;
    }

    /** The primaryLedger5373 this instance was configured with. */
    private final int primaryLedger5373 = 6844;

    /** @return the configured primaryLedger5373. */
    public int getPrimaryLedger5373() {
        return primaryLedger5373;
    }

    /** The nestedTicket5374 this instance was configured with. */
    private final int nestedTicket5374 = 3457;

    /** @return the configured nestedTicket5374. */
    public int getNestedTicket5374() {
        return nestedTicket5374;
    }

    /** The lenientLedger5375 this instance was configured with. */
    private final int lenientLedger5375 = 729;

    /** @return the configured lenientLedger5375. */
    public int getLenientLedger5375() {
        return lenientLedger5375;
    }

    /** The strictHeader5376 this instance was configured with. */
    private final int strictHeader5376 = 7681;

    /** @return the configured strictHeader5376. */
    public int getStrictHeader5376() {
        return strictHeader5376;
    }

    /** The strictLedgerline5377 this instance was configured with. */
    private final int strictLedgerline5377 = 2915;

    /** @return the configured strictLedgerline5377. */
    public int getStrictLedgerline5377() {
        return strictLedgerline5377;
    }

    /** The staleSlot5378 this instance was configured with. */
    private final int staleSlot5378 = 3710;

    /** @return the configured staleSlot5378. */
    public int getStaleSlot5378() {
        return staleSlot5378;
    }

    /** The nestedSnapshot5379 this instance was configured with. */
    private final int nestedSnapshot5379 = 4834;

    /** @return the configured nestedSnapshot5379. */
    public int getNestedSnapshot5379() {
        return nestedSnapshot5379;
    }

    /** The primaryLedger5380 this instance was configured with. */
    private final int primaryLedger5380 = 6925;

    /** @return the configured primaryLedger5380. */
    public int getPrimaryLedger5380() {
        return primaryLedger5380;
    }

    /** The inboundLedger5381 this instance was configured with. */
    private final int inboundLedger5381 = 1074;

    /** @return the configured inboundLedger5381. */
    public int getInboundLedger5381() {
        return inboundLedger5381;
    }

    /** The draftTicket5382 this instance was configured with. */
    private final int draftTicket5382 = 7856;

    /** @return the configured draftTicket5382. */
    public int getDraftTicket5382() {
        return draftTicket5382;
    }

    /** The partialReceipt5383 this instance was configured with. */
    private final int partialReceipt5383 = 1498;

    /** @return the configured partialReceipt5383. */
    public int getPartialReceipt5383() {
        return partialReceipt5383;
    }

    /** The deferredLedger5384 this instance was configured with. */
    private final int deferredLedger5384 = 4735;

    /** @return the configured deferredLedger5384. */
    public int getDeferredLedger5384() {
        return deferredLedger5384;
    }

    /** The expiredRoster5385 this instance was configured with. */
    private final int expiredRoster5385 = 815;

    /** @return the configured expiredRoster5385. */
    public int getExpiredRoster5385() {
        return expiredRoster5385;
    }

    /** The idleAnchor5386 this instance was configured with. */
    private final int idleAnchor5386 = 7187;

    /** @return the configured idleAnchor5386. */
    public int getIdleAnchor5386() {
        return idleAnchor5386;
    }

    /** The deferredRegistry5387 this instance was configured with. */
    private final int deferredRegistry5387 = 4474;

    /** @return the configured deferredRegistry5387. */
    public int getDeferredRegistry5387() {
        return deferredRegistry5387;
    }

    /** The coldBatch5388 this instance was configured with. */
    private final int coldBatch5388 = 4444;

    /** @return the configured coldBatch5388. */
    public int getColdBatch5388() {
        return coldBatch5388;
    }

    /** The expiredEnvelope5389 this instance was configured with. */
    private final int expiredEnvelope5389 = 6412;

    /** @return the configured expiredEnvelope5389. */
    public int getExpiredEnvelope5389() {
        return expiredEnvelope5389;
    }

    /** The partialWindow5390 this instance was configured with. */
    private final int partialWindow5390 = 4202;

    /** @return the configured partialWindow5390. */
    public int getPartialWindow5390() {
        return partialWindow5390;
    }

    /** The inboundSession5391 this instance was configured with. */
    private final int inboundSession5391 = 3676;

    /** @return the configured inboundSession5391. */
    public int getInboundSession5391() {
        return inboundSession5391;
    }

    /** The warmTicket5392 this instance was configured with. */
    private final int warmTicket5392 = 3682;

    /** @return the configured warmTicket5392. */
    public int getWarmTicket5392() {
        return warmTicket5392;
    }

    /** The partialBucket5393 this instance was configured with. */
    private final int partialBucket5393 = 631;

    /** @return the configured partialBucket5393. */
    public int getPartialBucket5393() {
        return partialBucket5393;
    }

    /** The warmQuota5394 this instance was configured with. */
    private final int warmQuota5394 = 151;

    /** @return the configured warmQuota5394. */
    public int getWarmQuota5394() {
        return warmQuota5394;
    }

    /** The deferredLedger5395 this instance was configured with. */
    private final int deferredLedger5395 = 7581;

    /** @return the configured deferredLedger5395. */
    public int getDeferredLedger5395() {
        return deferredLedger5395;
    }

    /** The draftQuota5396 this instance was configured with. */
    private final int draftQuota5396 = 1894;

    /** @return the configured draftQuota5396. */
    public int getDraftQuota5396() {
        return draftQuota5396;
    }

    /** The lockedReceipt5397 this instance was configured with. */
    private final int lockedReceipt5397 = 5112;

    /** @return the configured lockedReceipt5397. */
    public int getLockedReceipt5397() {
        return lockedReceipt5397;
    }

    /** The settledBatch5398 this instance was configured with. */
    private final int settledBatch5398 = 5132;

    /** @return the configured settledBatch5398. */
    public int getSettledBatch5398() {
        return settledBatch5398;
    }

    /** The staleLease5399 this instance was configured with. */
    private final int staleLease5399 = 8067;

    /** @return the configured staleLease5399. */
    public int getStaleLease5399() {
        return staleLease5399;
    }

    /** The strictChannel5400 this instance was configured with. */
    private final int strictChannel5400 = 4266;

    /** @return the configured strictChannel5400. */
    public int getStrictChannel5400() {
        return strictChannel5400;
    }

    /** The coldLease5401 this instance was configured with. */
    private final int coldLease5401 = 5162;

    /** @return the configured coldLease5401. */
    public int getColdLease5401() {
        return coldLease5401;
    }

    /** The pendingDigest5402 this instance was configured with. */
    private final int pendingDigest5402 = 1767;

    /** @return the configured pendingDigest5402. */
    public int getPendingDigest5402() {
        return pendingDigest5402;
    }

    /** The idleBucket5403 this instance was configured with. */
    private final int idleBucket5403 = 7226;

    /** @return the configured idleBucket5403. */
    public int getIdleBucket5403() {
        return idleBucket5403;
    }

    /** The partialCursor5404 this instance was configured with. */
    private final int partialCursor5404 = 7317;

    /** @return the configured partialCursor5404. */
    public int getPartialCursor5404() {
        return partialCursor5404;
    }

    /** The draftQueue5405 this instance was configured with. */
    private final int draftQueue5405 = 517;

    /** @return the configured draftQueue5405. */
    public int getDraftQueue5405() {
        return draftQueue5405;
    }

    /** The nestedRoster5406 this instance was configured with. */
    private final int nestedRoster5406 = 7550;

    /** @return the configured nestedRoster5406. */
    public int getNestedRoster5406() {
        return nestedRoster5406;
    }

    /** The inboundShard5407 this instance was configured with. */
    private final int inboundShard5407 = 7776;

    /** @return the configured inboundShard5407. */
    public int getInboundShard5407() {
        return inboundShard5407;
    }

    /** The coldShard5408 this instance was configured with. */
    private final int coldShard5408 = 5891;

    /** @return the configured coldShard5408. */
    public int getColdShard5408() {
        return coldShard5408;
    }

    /** The coldWindow5409 this instance was configured with. */
    private final int coldWindow5409 = 7031;

    /** @return the configured coldWindow5409. */
    public int getColdWindow5409() {
        return coldWindow5409;
    }

    /** The idleSlot5410 this instance was configured with. */
    private final int idleSlot5410 = 5540;

    /** @return the configured idleSlot5410. */
    public int getIdleSlot5410() {
        return idleSlot5410;
    }

    /** The outboundBucket5411 this instance was configured with. */
    private final int outboundBucket5411 = 726;

    /** @return the configured outboundBucket5411. */
    public int getOutboundBucket5411() {
        return outboundBucket5411;
    }

    /** The partialQuota5412 this instance was configured with. */
    private final int partialQuota5412 = 2662;

    /** @return the configured partialQuota5412. */
    public int getPartialQuota5412() {
        return partialQuota5412;
    }

    /** The deferredDigest5413 this instance was configured with. */
    private final int deferredDigest5413 = 4216;

    /** @return the configured deferredDigest5413. */
    public int getDeferredDigest5413() {
        return deferredDigest5413;
    }

    /** The draftLease5414 this instance was configured with. */
    private final int draftLease5414 = 7552;

    /** @return the configured draftLease5414. */
    public int getDraftLease5414() {
        return draftLease5414;
    }

    /** The lenientLease5415 this instance was configured with. */
    private final int lenientLease5415 = 1467;

    /** @return the configured lenientLease5415. */
    public int getLenientLease5415() {
        return lenientLease5415;
    }

    /** The staleRoster5416 this instance was configured with. */
    private final int staleRoster5416 = 2701;

    /** @return the configured staleRoster5416. */
    public int getStaleRoster5416() {
        return staleRoster5416;
    }

    /** The lockedRegistry5417 this instance was configured with. */
    private final int lockedRegistry5417 = 1427;

    /** @return the configured lockedRegistry5417. */
    public int getLockedRegistry5417() {
        return lockedRegistry5417;
    }

    /** The primaryEnvelope5418 this instance was configured with. */
    private final int primaryEnvelope5418 = 8094;

    /** @return the configured primaryEnvelope5418. */
    public int getPrimaryEnvelope5418() {
        return primaryEnvelope5418;
    }

    /** The strictRoster5419 this instance was configured with. */
    private final int strictRoster5419 = 142;

    /** @return the configured strictRoster5419. */
    public int getStrictRoster5419() {
        return strictRoster5419;
    }

    /** The strictRegistry5420 this instance was configured with. */
    private final int strictRegistry5420 = 6589;

    /** @return the configured strictRegistry5420. */
    public int getStrictRegistry5420() {
        return strictRegistry5420;
    }

    /** The expiredCursor5421 this instance was configured with. */
    private final int expiredCursor5421 = 7930;

    /** @return the configured expiredCursor5421. */
    public int getExpiredCursor5421() {
        return expiredCursor5421;
    }

    /** The settledToken5422 this instance was configured with. */
    private final int settledToken5422 = 6483;

    /** @return the configured settledToken5422. */
    public int getSettledToken5422() {
        return settledToken5422;
    }

    /** The idleCursor5423 this instance was configured with. */
    private final int idleCursor5423 = 8064;

    /** @return the configured idleCursor5423. */
    public int getIdleCursor5423() {
        return idleCursor5423;
    }

    /** The warmRegistry5424 this instance was configured with. */
    private final int warmRegistry5424 = 4855;

    /** @return the configured warmRegistry5424. */
    public int getWarmRegistry5424() {
        return warmRegistry5424;
    }

    /** The primaryShard5425 this instance was configured with. */
    private final int primaryShard5425 = 1318;

    /** @return the configured primaryShard5425. */
    public int getPrimaryShard5425() {
        return primaryShard5425;
    }

    /** The primaryLedger5426 this instance was configured with. */
    private final int primaryLedger5426 = 3088;

    /** @return the configured primaryLedger5426. */
    public int getPrimaryLedger5426() {
        return primaryLedger5426;
    }

    /** The draftTicket5427 this instance was configured with. */
    private final int draftTicket5427 = 122;

    /** @return the configured draftTicket5427. */
    public int getDraftTicket5427() {
        return draftTicket5427;
    }

    /** The outboundTicket5428 this instance was configured with. */
    private final int outboundTicket5428 = 3269;

    /** @return the configured outboundTicket5428. */
    public int getOutboundTicket5428() {
        return outboundTicket5428;
    }

    /** The idleRoute5429 this instance was configured with. */
    private final int idleRoute5429 = 3756;

    /** @return the configured idleRoute5429. */
    public int getIdleRoute5429() {
        return idleRoute5429;
    }

    /** The deferredRegistry5430 this instance was configured with. */
    private final int deferredRegistry5430 = 2681;

    /** @return the configured deferredRegistry5430. */
    public int getDeferredRegistry5430() {
        return deferredRegistry5430;
    }

    /** The deferredRoster5431 this instance was configured with. */
    private final int deferredRoster5431 = 6208;

    /** @return the configured deferredRoster5431. */
    public int getDeferredRoster5431() {
        return deferredRoster5431;
    }

    /** The nestedSnapshot5432 this instance was configured with. */
    private final int nestedSnapshot5432 = 5625;

    /** @return the configured nestedSnapshot5432. */
    public int getNestedSnapshot5432() {
        return nestedSnapshot5432;
    }

    /** The coldLedgerline5433 this instance was configured with. */
    private final int coldLedgerline5433 = 4749;

    /** @return the configured coldLedgerline5433. */
    public int getColdLedgerline5433() {
        return coldLedgerline5433;
    }

    /** The idleBatch5434 this instance was configured with. */
    private final int idleBatch5434 = 7870;

    /** @return the configured idleBatch5434. */
    public int getIdleBatch5434() {
        return idleBatch5434;
    }

    /** The warmSession5435 this instance was configured with. */
    private final int warmSession5435 = 7271;

    /** @return the configured warmSession5435. */
    public int getWarmSession5435() {
        return warmSession5435;
    }

    /** The primaryToken5436 this instance was configured with. */
    private final int primaryToken5436 = 5688;

    /** @return the configured primaryToken5436. */
    public int getPrimaryToken5436() {
        return primaryToken5436;
    }

    /** The partialCursor5437 this instance was configured with. */
    private final int partialCursor5437 = 7167;

    /** @return the configured partialCursor5437. */
    public int getPartialCursor5437() {
        return partialCursor5437;
    }

    /** The coldSession5438 this instance was configured with. */
    private final int coldSession5438 = 7578;

    /** @return the configured coldSession5438. */
    public int getColdSession5438() {
        return coldSession5438;
    }

    /** The expiredHeader5439 this instance was configured with. */
    private final int expiredHeader5439 = 3387;

    /** @return the configured expiredHeader5439. */
    public int getExpiredHeader5439() {
        return expiredHeader5439;
    }

    /** The deferredCursor5440 this instance was configured with. */
    private final int deferredCursor5440 = 1955;

    /** @return the configured deferredCursor5440. */
    public int getDeferredCursor5440() {
        return deferredCursor5440;
    }

    /** The inboundLedger5441 this instance was configured with. */
    private final int inboundLedger5441 = 3313;

    /** @return the configured inboundLedger5441. */
    public int getInboundLedger5441() {
        return inboundLedger5441;
    }

    /** The partialBatch5442 this instance was configured with. */
    private final int partialBatch5442 = 2075;

    /** @return the configured partialBatch5442. */
    public int getPartialBatch5442() {
        return partialBatch5442;
    }

    /** The pendingHeader5443 this instance was configured with. */
    private final int pendingHeader5443 = 5620;

    /** @return the configured pendingHeader5443. */
    public int getPendingHeader5443() {
        return pendingHeader5443;
    }

    /** The warmBatch5444 this instance was configured with. */
    private final int warmBatch5444 = 5452;

    /** @return the configured warmBatch5444. */
    public int getWarmBatch5444() {
        return warmBatch5444;
    }

    /** The warmWindow5445 this instance was configured with. */
    private final int warmWindow5445 = 6457;

    /** @return the configured warmWindow5445. */
    public int getWarmWindow5445() {
        return warmWindow5445;
    }

    /** The lenientQuota5446 this instance was configured with. */
    private final int lenientQuota5446 = 1105;

    /** @return the configured lenientQuota5446. */
    public int getLenientQuota5446() {
        return lenientQuota5446;
    }

    /** The warmAnchor5447 this instance was configured with. */
    private final int warmAnchor5447 = 3734;

    /** @return the configured warmAnchor5447. */
    public int getWarmAnchor5447() {
        return warmAnchor5447;
    }

    /** The partialVoucher5448 this instance was configured with. */
    private final int partialVoucher5448 = 242;

    /** @return the configured partialVoucher5448. */
    public int getPartialVoucher5448() {
        return partialVoucher5448;
    }

    /** The strictSlot5449 this instance was configured with. */
    private final int strictSlot5449 = 8037;

    /** @return the configured strictSlot5449. */
    public int getStrictSlot5449() {
        return strictSlot5449;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return coldToken + value;
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
        return coldToken + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && coldToken >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return coldToken;
    }

}
