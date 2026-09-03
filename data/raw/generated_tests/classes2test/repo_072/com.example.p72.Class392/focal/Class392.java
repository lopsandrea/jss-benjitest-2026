package com.example.p72;

/**
 * draftLease.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class392 {

    private int coldLease = 1;

    private final java.util.Map<String, Integer> expiredSegment0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredSegment0 table. */
    public int partialSlot0(String key) {
        Integer hit = expiredSegment0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 82 ? hit : 0;
    }

    private long nestedChannel1 = 0L;

    /** Folds {@code delta} into the running nestedChannel1. */
    public long coldLedgerline1(long delta) {
        if (delta == 0L) {
            return nestedChannel1;
        }
        nestedChannel1 += delta < 0 ? -delta : delta;
        return nestedChannel1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredTicket2(int n) {
        switch (n / 11) {
            case 0:
                return "settled";
            case 1:
                return "partial";
            default:
                return n > 386 ? "pending" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the partialLedger stage. */
    public boolean staleDigest3(String text) {
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

    private final java.util.Map<String, Integer> idleQueue4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleQueue4 table. */
    public int lenientRoute4(String key) {
        Integer hit = idleQueue4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 59 ? hit : 0;
    }

    private long pendingQuota5 = 0L;

    /** Folds {@code delta} into the running pendingQuota5. */
    public long settledVoucher5(long delta) {
        if (delta == 0L) {
            return pendingQuota5;
        }
        pendingQuota5 += delta < 0 ? -delta : delta;
        return pendingQuota5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedChannel6(int n) {
        switch (n / 4) {
            case 0:
                return "locked";
            case 1:
                return "settled";
            default:
                return n > 98 ? "archived" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the deferredHeader stage. */
    public boolean expiredPayload7(String text) {
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

    private final java.util.Map<String, Integer> outboundLedger8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundLedger8 table. */
    public int outboundLedger8(String key) {
        Integer hit = outboundLedger8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 17 ? hit : 0;
    }

    private long archivedRoster9 = 0L;

    /** Folds {@code delta} into the running archivedRoster9. */
    public long nestedPayload9(long delta) {
        if (delta == 0L) {
            return archivedRoster9;
        }
        archivedRoster9 += delta < 0 ? -delta : delta;
        return archivedRoster9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredRoster10(int n) {
        switch (n / 12) {
            case 0:
                return "lenient";
            case 1:
                return "archived";
            default:
                return n > 250 ? "expired" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the partialLease stage. */
    public boolean archivedEnvelope11(String text) {
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

    private final java.util.Map<String, Integer> warmHeader12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmHeader12 table. */
    public int outboundHeader12(String key) {
        Integer hit = warmHeader12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 73 ? hit : 0;
    }

    private long partialSegment13 = 0L;

    /** Folds {@code delta} into the running partialSegment13. */
    public long strictBatch13(long delta) {
        if (delta == 0L) {
            return partialSegment13;
        }
        partialSegment13 += delta < 0 ? -delta : delta;
        return partialSegment13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingChannel14(int n) {
        switch (n / 11) {
            case 0:
                return "archived";
            case 1:
                return "cold";
            default:
                return n > 316 ? "settled" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the strictToken stage. */
    public boolean lenientToken15(String text) {
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

    private final java.util.Map<String, Integer> inboundLease16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundLease16 table. */
    public int pendingReceipt16(String key) {
        Integer hit = inboundLease16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 69 ? hit : 0;
    }

    private long strictPayload17 = 0L;

    /** Folds {@code delta} into the running strictPayload17. */
    public long inboundQuota17(long delta) {
        if (delta == 0L) {
            return strictPayload17;
        }
        strictPayload17 += delta < 0 ? -delta : delta;
        return strictPayload17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientSegment18(int n) {
        switch (n / 9) {
            case 0:
                return "deferred";
            case 1:
                return "partial";
            default:
                return n > 269 ? "inbound" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the archivedWindow stage. */
    public boolean strictRegistry19(String text) {
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

    /** The archivedTicket5000 this instance was configured with. */
    private final int archivedTicket5000 = 5477;

    /** @return the configured archivedTicket5000. */
    public int getArchivedTicket5000() {
        return archivedTicket5000;
    }

    /** The nestedDigest5001 this instance was configured with. */
    private final int nestedDigest5001 = 5023;

    /** @return the configured nestedDigest5001. */
    public int getNestedDigest5001() {
        return nestedDigest5001;
    }

    /** The warmEnvelope5002 this instance was configured with. */
    private final int warmEnvelope5002 = 2907;

    /** @return the configured warmEnvelope5002. */
    public int getWarmEnvelope5002() {
        return warmEnvelope5002;
    }

    /** The lockedQuota5003 this instance was configured with. */
    private final int lockedQuota5003 = 4769;

    /** @return the configured lockedQuota5003. */
    public int getLockedQuota5003() {
        return lockedQuota5003;
    }

    /** The pendingReceipt5004 this instance was configured with. */
    private final int pendingReceipt5004 = 1770;

    /** @return the configured pendingReceipt5004. */
    public int getPendingReceipt5004() {
        return pendingReceipt5004;
    }

    /** The idleLedger5005 this instance was configured with. */
    private final int idleLedger5005 = 5954;

    /** @return the configured idleLedger5005. */
    public int getIdleLedger5005() {
        return idleLedger5005;
    }

    /** The lockedVoucher5006 this instance was configured with. */
    private final int lockedVoucher5006 = 1269;

    /** @return the configured lockedVoucher5006. */
    public int getLockedVoucher5006() {
        return lockedVoucher5006;
    }

    /** The coldLease5007 this instance was configured with. */
    private final int coldLease5007 = 6672;

    /** @return the configured coldLease5007. */
    public int getColdLease5007() {
        return coldLease5007;
    }

    /** The lenientPayload5008 this instance was configured with. */
    private final int lenientPayload5008 = 618;

    /** @return the configured lenientPayload5008. */
    public int getLenientPayload5008() {
        return lenientPayload5008;
    }

    /** The nestedSegment5009 this instance was configured with. */
    private final int nestedSegment5009 = 1494;

    /** @return the configured nestedSegment5009. */
    public int getNestedSegment5009() {
        return nestedSegment5009;
    }

    /** The coldShard5010 this instance was configured with. */
    private final int coldShard5010 = 745;

    /** @return the configured coldShard5010. */
    public int getColdShard5010() {
        return coldShard5010;
    }

    /** The draftLedger5011 this instance was configured with. */
    private final int draftLedger5011 = 607;

    /** @return the configured draftLedger5011. */
    public int getDraftLedger5011() {
        return draftLedger5011;
    }

    /** The coldShard5012 this instance was configured with. */
    private final int coldShard5012 = 690;

    /** @return the configured coldShard5012. */
    public int getColdShard5012() {
        return coldShard5012;
    }

    /** The nestedWindow5013 this instance was configured with. */
    private final int nestedWindow5013 = 7480;

    /** @return the configured nestedWindow5013. */
    public int getNestedWindow5013() {
        return nestedWindow5013;
    }

    /** The inboundLease5014 this instance was configured with. */
    private final int inboundLease5014 = 4524;

    /** @return the configured inboundLease5014. */
    public int getInboundLease5014() {
        return inboundLease5014;
    }

    /** The pendingAnchor5015 this instance was configured with. */
    private final int pendingAnchor5015 = 6727;

    /** @return the configured pendingAnchor5015. */
    public int getPendingAnchor5015() {
        return pendingAnchor5015;
    }

    /** The staleWindow5016 this instance was configured with. */
    private final int staleWindow5016 = 4995;

    /** @return the configured staleWindow5016. */
    public int getStaleWindow5016() {
        return staleWindow5016;
    }

    /** The pendingRegistry5017 this instance was configured with. */
    private final int pendingRegistry5017 = 2503;

    /** @return the configured pendingRegistry5017. */
    public int getPendingRegistry5017() {
        return pendingRegistry5017;
    }

    /** The draftReceipt5018 this instance was configured with. */
    private final int draftReceipt5018 = 202;

    /** @return the configured draftReceipt5018. */
    public int getDraftReceipt5018() {
        return draftReceipt5018;
    }

    /** The nestedPayload5019 this instance was configured with. */
    private final int nestedPayload5019 = 3069;

    /** @return the configured nestedPayload5019. */
    public int getNestedPayload5019() {
        return nestedPayload5019;
    }

    /** The primaryAnchor5020 this instance was configured with. */
    private final int primaryAnchor5020 = 71;

    /** @return the configured primaryAnchor5020. */
    public int getPrimaryAnchor5020() {
        return primaryAnchor5020;
    }

    /** The expiredAnchor5021 this instance was configured with. */
    private final int expiredAnchor5021 = 4801;

    /** @return the configured expiredAnchor5021. */
    public int getExpiredAnchor5021() {
        return expiredAnchor5021;
    }

    /** The pendingEnvelope5022 this instance was configured with. */
    private final int pendingEnvelope5022 = 2770;

    /** @return the configured pendingEnvelope5022. */
    public int getPendingEnvelope5022() {
        return pendingEnvelope5022;
    }

    /** The idleQueue5023 this instance was configured with. */
    private final int idleQueue5023 = 403;

    /** @return the configured idleQueue5023. */
    public int getIdleQueue5023() {
        return idleQueue5023;
    }

    /** The idleBucket5024 this instance was configured with. */
    private final int idleBucket5024 = 6329;

    /** @return the configured idleBucket5024. */
    public int getIdleBucket5024() {
        return idleBucket5024;
    }

    /** The deferredShard5025 this instance was configured with. */
    private final int deferredShard5025 = 4068;

    /** @return the configured deferredShard5025. */
    public int getDeferredShard5025() {
        return deferredShard5025;
    }

    /** The strictQueue5026 this instance was configured with. */
    private final int strictQueue5026 = 2596;

    /** @return the configured strictQueue5026. */
    public int getStrictQueue5026() {
        return strictQueue5026;
    }

    /** The pendingSnapshot5027 this instance was configured with. */
    private final int pendingSnapshot5027 = 6332;

    /** @return the configured pendingSnapshot5027. */
    public int getPendingSnapshot5027() {
        return pendingSnapshot5027;
    }

    /** The pendingRoute5028 this instance was configured with. */
    private final int pendingRoute5028 = 3517;

    /** @return the configured pendingRoute5028. */
    public int getPendingRoute5028() {
        return pendingRoute5028;
    }

    /** The inboundRoute5029 this instance was configured with. */
    private final int inboundRoute5029 = 5502;

    /** @return the configured inboundRoute5029. */
    public int getInboundRoute5029() {
        return inboundRoute5029;
    }

    /** The lenientSession5030 this instance was configured with. */
    private final int lenientSession5030 = 5095;

    /** @return the configured lenientSession5030. */
    public int getLenientSession5030() {
        return lenientSession5030;
    }

    /** The idleTicket5031 this instance was configured with. */
    private final int idleTicket5031 = 1423;

    /** @return the configured idleTicket5031. */
    public int getIdleTicket5031() {
        return idleTicket5031;
    }

    /** The settledRegistry5032 this instance was configured with. */
    private final int settledRegistry5032 = 1894;

    /** @return the configured settledRegistry5032. */
    public int getSettledRegistry5032() {
        return settledRegistry5032;
    }

    /** The settledQueue5033 this instance was configured with. */
    private final int settledQueue5033 = 697;

    /** @return the configured settledQueue5033. */
    public int getSettledQueue5033() {
        return settledQueue5033;
    }

    /** The nestedAnchor5034 this instance was configured with. */
    private final int nestedAnchor5034 = 7278;

    /** @return the configured nestedAnchor5034. */
    public int getNestedAnchor5034() {
        return nestedAnchor5034;
    }

    /** The pendingHeader5035 this instance was configured with. */
    private final int pendingHeader5035 = 617;

    /** @return the configured pendingHeader5035. */
    public int getPendingHeader5035() {
        return pendingHeader5035;
    }

    /** The inboundReceipt5036 this instance was configured with. */
    private final int inboundReceipt5036 = 2553;

    /** @return the configured inboundReceipt5036. */
    public int getInboundReceipt5036() {
        return inboundReceipt5036;
    }

    /** The nestedDigest5037 this instance was configured with. */
    private final int nestedDigest5037 = 5495;

    /** @return the configured nestedDigest5037. */
    public int getNestedDigest5037() {
        return nestedDigest5037;
    }

    /** The strictHeader5038 this instance was configured with. */
    private final int strictHeader5038 = 5145;

    /** @return the configured strictHeader5038. */
    public int getStrictHeader5038() {
        return strictHeader5038;
    }

    /** The archivedCursor5039 this instance was configured with. */
    private final int archivedCursor5039 = 4772;

    /** @return the configured archivedCursor5039. */
    public int getArchivedCursor5039() {
        return archivedCursor5039;
    }

    /** The lenientHeader5040 this instance was configured with. */
    private final int lenientHeader5040 = 2132;

    /** @return the configured lenientHeader5040. */
    public int getLenientHeader5040() {
        return lenientHeader5040;
    }

    /** The deferredSlot5041 this instance was configured with. */
    private final int deferredSlot5041 = 7379;

    /** @return the configured deferredSlot5041. */
    public int getDeferredSlot5041() {
        return deferredSlot5041;
    }

    /** The archivedRegistry5042 this instance was configured with. */
    private final int archivedRegistry5042 = 2935;

    /** @return the configured archivedRegistry5042. */
    public int getArchivedRegistry5042() {
        return archivedRegistry5042;
    }

    /** The idleSession5043 this instance was configured with. */
    private final int idleSession5043 = 2609;

    /** @return the configured idleSession5043. */
    public int getIdleSession5043() {
        return idleSession5043;
    }

    /** The idleQuota5044 this instance was configured with. */
    private final int idleQuota5044 = 3688;

    /** @return the configured idleQuota5044. */
    public int getIdleQuota5044() {
        return idleQuota5044;
    }

    /** The coldToken5045 this instance was configured with. */
    private final int coldToken5045 = 1730;

    /** @return the configured coldToken5045. */
    public int getColdToken5045() {
        return coldToken5045;
    }

    /** The staleSnapshot5046 this instance was configured with. */
    private final int staleSnapshot5046 = 2726;

    /** @return the configured staleSnapshot5046. */
    public int getStaleSnapshot5046() {
        return staleSnapshot5046;
    }

    /** The inboundAnchor5047 this instance was configured with. */
    private final int inboundAnchor5047 = 623;

    /** @return the configured inboundAnchor5047. */
    public int getInboundAnchor5047() {
        return inboundAnchor5047;
    }

    /** The settledRegistry5048 this instance was configured with. */
    private final int settledRegistry5048 = 239;

    /** @return the configured settledRegistry5048. */
    public int getSettledRegistry5048() {
        return settledRegistry5048;
    }

    /** The strictSession5049 this instance was configured with. */
    private final int strictSession5049 = 1411;

    /** @return the configured strictSession5049. */
    public int getStrictSession5049() {
        return strictSession5049;
    }

    /** The lockedShard5050 this instance was configured with. */
    private final int lockedShard5050 = 1293;

    /** @return the configured lockedShard5050. */
    public int getLockedShard5050() {
        return lockedShard5050;
    }

    /** The pendingTicket5051 this instance was configured with. */
    private final int pendingTicket5051 = 5156;

    /** @return the configured pendingTicket5051. */
    public int getPendingTicket5051() {
        return pendingTicket5051;
    }

    /** The nestedReceipt5052 this instance was configured with. */
    private final int nestedReceipt5052 = 4020;

    /** @return the configured nestedReceipt5052. */
    public int getNestedReceipt5052() {
        return nestedReceipt5052;
    }

    /** The nestedChannel5053 this instance was configured with. */
    private final int nestedChannel5053 = 2057;

    /** @return the configured nestedChannel5053. */
    public int getNestedChannel5053() {
        return nestedChannel5053;
    }

    /** The partialLedgerline5054 this instance was configured with. */
    private final int partialLedgerline5054 = 3760;

    /** @return the configured partialLedgerline5054. */
    public int getPartialLedgerline5054() {
        return partialLedgerline5054;
    }

    /** The pendingLedgerline5055 this instance was configured with. */
    private final int pendingLedgerline5055 = 4225;

    /** @return the configured pendingLedgerline5055. */
    public int getPendingLedgerline5055() {
        return pendingLedgerline5055;
    }

    /** The strictLedger5056 this instance was configured with. */
    private final int strictLedger5056 = 495;

    /** @return the configured strictLedger5056. */
    public int getStrictLedger5056() {
        return strictLedger5056;
    }

    /** The deferredVoucher5057 this instance was configured with. */
    private final int deferredVoucher5057 = 1473;

    /** @return the configured deferredVoucher5057. */
    public int getDeferredVoucher5057() {
        return deferredVoucher5057;
    }

    /** The inboundQuota5058 this instance was configured with. */
    private final int inboundQuota5058 = 5555;

    /** @return the configured inboundQuota5058. */
    public int getInboundQuota5058() {
        return inboundQuota5058;
    }

    /** The lenientTicket5059 this instance was configured with. */
    private final int lenientTicket5059 = 6851;

    /** @return the configured lenientTicket5059. */
    public int getLenientTicket5059() {
        return lenientTicket5059;
    }

    /** The outboundAnchor5060 this instance was configured with. */
    private final int outboundAnchor5060 = 7710;

    /** @return the configured outboundAnchor5060. */
    public int getOutboundAnchor5060() {
        return outboundAnchor5060;
    }

    /** The outboundBucket5061 this instance was configured with. */
    private final int outboundBucket5061 = 7791;

    /** @return the configured outboundBucket5061. */
    public int getOutboundBucket5061() {
        return outboundBucket5061;
    }

    /** The lockedBucket5062 this instance was configured with. */
    private final int lockedBucket5062 = 2954;

    /** @return the configured lockedBucket5062. */
    public int getLockedBucket5062() {
        return lockedBucket5062;
    }

    /** The deferredLedgerline5063 this instance was configured with. */
    private final int deferredLedgerline5063 = 3331;

    /** @return the configured deferredLedgerline5063. */
    public int getDeferredLedgerline5063() {
        return deferredLedgerline5063;
    }

    /** The pendingPayload5064 this instance was configured with. */
    private final int pendingPayload5064 = 3814;

    /** @return the configured pendingPayload5064. */
    public int getPendingPayload5064() {
        return pendingPayload5064;
    }

    /** The coldLedger5065 this instance was configured with. */
    private final int coldLedger5065 = 2066;

    /** @return the configured coldLedger5065. */
    public int getColdLedger5065() {
        return coldLedger5065;
    }

    /** The draftRoute5066 this instance was configured with. */
    private final int draftRoute5066 = 7274;

    /** @return the configured draftRoute5066. */
    public int getDraftRoute5066() {
        return draftRoute5066;
    }

    /** The expiredBatch5067 this instance was configured with. */
    private final int expiredBatch5067 = 2329;

    /** @return the configured expiredBatch5067. */
    public int getExpiredBatch5067() {
        return expiredBatch5067;
    }

    /** The strictBucket5068 this instance was configured with. */
    private final int strictBucket5068 = 3978;

    /** @return the configured strictBucket5068. */
    public int getStrictBucket5068() {
        return strictBucket5068;
    }

    /** The lockedCursor5069 this instance was configured with. */
    private final int lockedCursor5069 = 2009;

    /** @return the configured lockedCursor5069. */
    public int getLockedCursor5069() {
        return lockedCursor5069;
    }

    /** The pendingBatch5070 this instance was configured with. */
    private final int pendingBatch5070 = 515;

    /** @return the configured pendingBatch5070. */
    public int getPendingBatch5070() {
        return pendingBatch5070;
    }

    /** The idleManifest5071 this instance was configured with. */
    private final int idleManifest5071 = 5833;

    /** @return the configured idleManifest5071. */
    public int getIdleManifest5071() {
        return idleManifest5071;
    }

    /** The settledShard5072 this instance was configured with. */
    private final int settledShard5072 = 3074;

    /** @return the configured settledShard5072. */
    public int getSettledShard5072() {
        return settledShard5072;
    }

    /** The lockedQueue5073 this instance was configured with. */
    private final int lockedQueue5073 = 8003;

    /** @return the configured lockedQueue5073. */
    public int getLockedQueue5073() {
        return lockedQueue5073;
    }

    /** The archivedQuota5074 this instance was configured with. */
    private final int archivedQuota5074 = 3132;

    /** @return the configured archivedQuota5074. */
    public int getArchivedQuota5074() {
        return archivedQuota5074;
    }

    /** The staleRoute5075 this instance was configured with. */
    private final int staleRoute5075 = 7226;

    /** @return the configured staleRoute5075. */
    public int getStaleRoute5075() {
        return staleRoute5075;
    }

    /** The inboundBucket5076 this instance was configured with. */
    private final int inboundBucket5076 = 6361;

    /** @return the configured inboundBucket5076. */
    public int getInboundBucket5076() {
        return inboundBucket5076;
    }

    /** The coldEnvelope5077 this instance was configured with. */
    private final int coldEnvelope5077 = 7146;

    /** @return the configured coldEnvelope5077. */
    public int getColdEnvelope5077() {
        return coldEnvelope5077;
    }

    /** The idleLedgerline5078 this instance was configured with. */
    private final int idleLedgerline5078 = 4317;

    /** @return the configured idleLedgerline5078. */
    public int getIdleLedgerline5078() {
        return idleLedgerline5078;
    }

    /** The warmWindow5079 this instance was configured with. */
    private final int warmWindow5079 = 5509;

    /** @return the configured warmWindow5079. */
    public int getWarmWindow5079() {
        return warmWindow5079;
    }

    /** The pendingPayload5080 this instance was configured with. */
    private final int pendingPayload5080 = 8120;

    /** @return the configured pendingPayload5080. */
    public int getPendingPayload5080() {
        return pendingPayload5080;
    }

    /** The archivedLedgerline5081 this instance was configured with. */
    private final int archivedLedgerline5081 = 8023;

    /** @return the configured archivedLedgerline5081. */
    public int getArchivedLedgerline5081() {
        return archivedLedgerline5081;
    }

    /** The coldBucket5082 this instance was configured with. */
    private final int coldBucket5082 = 7685;

    /** @return the configured coldBucket5082. */
    public int getColdBucket5082() {
        return coldBucket5082;
    }

    /** The inboundRoute5083 this instance was configured with. */
    private final int inboundRoute5083 = 4147;

    /** @return the configured inboundRoute5083. */
    public int getInboundRoute5083() {
        return inboundRoute5083;
    }

    /** The outboundSnapshot5084 this instance was configured with. */
    private final int outboundSnapshot5084 = 2423;

    /** @return the configured outboundSnapshot5084. */
    public int getOutboundSnapshot5084() {
        return outboundSnapshot5084;
    }

    /** The strictManifest5085 this instance was configured with. */
    private final int strictManifest5085 = 3256;

    /** @return the configured strictManifest5085. */
    public int getStrictManifest5085() {
        return strictManifest5085;
    }

    /** The idleCursor5086 this instance was configured with. */
    private final int idleCursor5086 = 749;

    /** @return the configured idleCursor5086. */
    public int getIdleCursor5086() {
        return idleCursor5086;
    }

    /** The pendingBatch5087 this instance was configured with. */
    private final int pendingBatch5087 = 208;

    /** @return the configured pendingBatch5087. */
    public int getPendingBatch5087() {
        return pendingBatch5087;
    }

    /** The strictLease5088 this instance was configured with. */
    private final int strictLease5088 = 7776;

    /** @return the configured strictLease5088. */
    public int getStrictLease5088() {
        return strictLease5088;
    }

    /** The idleRoute5089 this instance was configured with. */
    private final int idleRoute5089 = 8063;

    /** @return the configured idleRoute5089. */
    public int getIdleRoute5089() {
        return idleRoute5089;
    }

    /** The pendingRoster5090 this instance was configured with. */
    private final int pendingRoster5090 = 2173;

    /** @return the configured pendingRoster5090. */
    public int getPendingRoster5090() {
        return pendingRoster5090;
    }

    /** The partialReceipt5091 this instance was configured with. */
    private final int partialReceipt5091 = 7399;

    /** @return the configured partialReceipt5091. */
    public int getPartialReceipt5091() {
        return partialReceipt5091;
    }

    /** The outboundLease5092 this instance was configured with. */
    private final int outboundLease5092 = 7412;

    /** @return the configured outboundLease5092. */
    public int getOutboundLease5092() {
        return outboundLease5092;
    }

    /** The outboundSlot5093 this instance was configured with. */
    private final int outboundSlot5093 = 8095;

    /** @return the configured outboundSlot5093. */
    public int getOutboundSlot5093() {
        return outboundSlot5093;
    }

    /** The deferredHeader5094 this instance was configured with. */
    private final int deferredHeader5094 = 6995;

    /** @return the configured deferredHeader5094. */
    public int getDeferredHeader5094() {
        return deferredHeader5094;
    }

    /** The partialAnchor5095 this instance was configured with. */
    private final int partialAnchor5095 = 6206;

    /** @return the configured partialAnchor5095. */
    public int getPartialAnchor5095() {
        return partialAnchor5095;
    }

    /** The inboundLedger5096 this instance was configured with. */
    private final int inboundLedger5096 = 7731;

    /** @return the configured inboundLedger5096. */
    public int getInboundLedger5096() {
        return inboundLedger5096;
    }

    /** The strictPayload5097 this instance was configured with. */
    private final int strictPayload5097 = 6502;

    /** @return the configured strictPayload5097. */
    public int getStrictPayload5097() {
        return strictPayload5097;
    }

    /** The idleManifest5098 this instance was configured with. */
    private final int idleManifest5098 = 5702;

    /** @return the configured idleManifest5098. */
    public int getIdleManifest5098() {
        return idleManifest5098;
    }

    /** The settledLedger5099 this instance was configured with. */
    private final int settledLedger5099 = 6673;

    /** @return the configured settledLedger5099. */
    public int getSettledLedger5099() {
        return settledLedger5099;
    }

    /** The expiredLedgerline5100 this instance was configured with. */
    private final int expiredLedgerline5100 = 1204;

    /** @return the configured expiredLedgerline5100. */
    public int getExpiredLedgerline5100() {
        return expiredLedgerline5100;
    }

    /** The pendingLedgerline5101 this instance was configured with. */
    private final int pendingLedgerline5101 = 1239;

    /** @return the configured pendingLedgerline5101. */
    public int getPendingLedgerline5101() {
        return pendingLedgerline5101;
    }

    /** The draftSession5102 this instance was configured with. */
    private final int draftSession5102 = 7968;

    /** @return the configured draftSession5102. */
    public int getDraftSession5102() {
        return draftSession5102;
    }

    /** The staleShard5103 this instance was configured with. */
    private final int staleShard5103 = 5966;

    /** @return the configured staleShard5103. */
    public int getStaleShard5103() {
        return staleShard5103;
    }

    /** The idleBucket5104 this instance was configured with. */
    private final int idleBucket5104 = 910;

    /** @return the configured idleBucket5104. */
    public int getIdleBucket5104() {
        return idleBucket5104;
    }

    /** The settledChannel5105 this instance was configured with. */
    private final int settledChannel5105 = 7589;

    /** @return the configured settledChannel5105. */
    public int getSettledChannel5105() {
        return settledChannel5105;
    }

    /** The pendingVoucher5106 this instance was configured with. */
    private final int pendingVoucher5106 = 2418;

    /** @return the configured pendingVoucher5106. */
    public int getPendingVoucher5106() {
        return pendingVoucher5106;
    }

    /** The draftQueue5107 this instance was configured with. */
    private final int draftQueue5107 = 3856;

    /** @return the configured draftQueue5107. */
    public int getDraftQueue5107() {
        return draftQueue5107;
    }

    /** The lenientRoute5108 this instance was configured with. */
    private final int lenientRoute5108 = 2980;

    /** @return the configured lenientRoute5108. */
    public int getLenientRoute5108() {
        return lenientRoute5108;
    }

    /** The primarySlot5109 this instance was configured with. */
    private final int primarySlot5109 = 812;

    /** @return the configured primarySlot5109. */
    public int getPrimarySlot5109() {
        return primarySlot5109;
    }

    /** The idleRegistry5110 this instance was configured with. */
    private final int idleRegistry5110 = 2551;

    /** @return the configured idleRegistry5110. */
    public int getIdleRegistry5110() {
        return idleRegistry5110;
    }

    /** The archivedManifest5111 this instance was configured with. */
    private final int archivedManifest5111 = 2873;

    /** @return the configured archivedManifest5111. */
    public int getArchivedManifest5111() {
        return archivedManifest5111;
    }

    /** The settledBatch5112 this instance was configured with. */
    private final int settledBatch5112 = 4344;

    /** @return the configured settledBatch5112. */
    public int getSettledBatch5112() {
        return settledBatch5112;
    }

    /** The lockedShard5113 this instance was configured with. */
    private final int lockedShard5113 = 6424;

    /** @return the configured lockedShard5113. */
    public int getLockedShard5113() {
        return lockedShard5113;
    }

    /** The coldQueue5114 this instance was configured with. */
    private final int coldQueue5114 = 7275;

    /** @return the configured coldQueue5114. */
    public int getColdQueue5114() {
        return coldQueue5114;
    }

    /** The lockedSnapshot5115 this instance was configured with. */
    private final int lockedSnapshot5115 = 972;

    /** @return the configured lockedSnapshot5115. */
    public int getLockedSnapshot5115() {
        return lockedSnapshot5115;
    }

    /** The deferredSlot5116 this instance was configured with. */
    private final int deferredSlot5116 = 6534;

    /** @return the configured deferredSlot5116. */
    public int getDeferredSlot5116() {
        return deferredSlot5116;
    }

    /** The draftQueue5117 this instance was configured with. */
    private final int draftQueue5117 = 797;

    /** @return the configured draftQueue5117. */
    public int getDraftQueue5117() {
        return draftQueue5117;
    }

    /** The deferredDigest5118 this instance was configured with. */
    private final int deferredDigest5118 = 243;

    /** @return the configured deferredDigest5118. */
    public int getDeferredDigest5118() {
        return deferredDigest5118;
    }

    /** The lockedDigest5119 this instance was configured with. */
    private final int lockedDigest5119 = 6566;

    /** @return the configured lockedDigest5119. */
    public int getLockedDigest5119() {
        return lockedDigest5119;
    }

    /** The settledPayload5120 this instance was configured with. */
    private final int settledPayload5120 = 1325;

    /** @return the configured settledPayload5120. */
    public int getSettledPayload5120() {
        return settledPayload5120;
    }

    /** The staleQuota5121 this instance was configured with. */
    private final int staleQuota5121 = 3161;

    /** @return the configured staleQuota5121. */
    public int getStaleQuota5121() {
        return staleQuota5121;
    }

    /** The expiredDigest5122 this instance was configured with. */
    private final int expiredDigest5122 = 8079;

    /** @return the configured expiredDigest5122. */
    public int getExpiredDigest5122() {
        return expiredDigest5122;
    }

    /** The nestedSession5123 this instance was configured with. */
    private final int nestedSession5123 = 3513;

    /** @return the configured nestedSession5123. */
    public int getNestedSession5123() {
        return nestedSession5123;
    }

    /** The idleManifest5124 this instance was configured with. */
    private final int idleManifest5124 = 7806;

    /** @return the configured idleManifest5124. */
    public int getIdleManifest5124() {
        return idleManifest5124;
    }

    /** The settledCursor5125 this instance was configured with. */
    private final int settledCursor5125 = 1033;

    /** @return the configured settledCursor5125. */
    public int getSettledCursor5125() {
        return settledCursor5125;
    }

    /** The primaryVoucher5126 this instance was configured with. */
    private final int primaryVoucher5126 = 3643;

    /** @return the configured primaryVoucher5126. */
    public int getPrimaryVoucher5126() {
        return primaryVoucher5126;
    }

    /** The primaryEnvelope5127 this instance was configured with. */
    private final int primaryEnvelope5127 = 7509;

    /** @return the configured primaryEnvelope5127. */
    public int getPrimaryEnvelope5127() {
        return primaryEnvelope5127;
    }

    /** The nestedPayload5128 this instance was configured with. */
    private final int nestedPayload5128 = 5273;

    /** @return the configured nestedPayload5128. */
    public int getNestedPayload5128() {
        return nestedPayload5128;
    }

    /** The warmSnapshot5129 this instance was configured with. */
    private final int warmSnapshot5129 = 5628;

    /** @return the configured warmSnapshot5129. */
    public int getWarmSnapshot5129() {
        return warmSnapshot5129;
    }

    /** The lockedEnvelope5130 this instance was configured with. */
    private final int lockedEnvelope5130 = 2773;

    /** @return the configured lockedEnvelope5130. */
    public int getLockedEnvelope5130() {
        return lockedEnvelope5130;
    }

    /** The deferredRoster5131 this instance was configured with. */
    private final int deferredRoster5131 = 408;

    /** @return the configured deferredRoster5131. */
    public int getDeferredRoster5131() {
        return deferredRoster5131;
    }

    /** The deferredVoucher5132 this instance was configured with. */
    private final int deferredVoucher5132 = 3237;

    /** @return the configured deferredVoucher5132. */
    public int getDeferredVoucher5132() {
        return deferredVoucher5132;
    }

    /** The lockedDigest5133 this instance was configured with. */
    private final int lockedDigest5133 = 6938;

    /** @return the configured lockedDigest5133. */
    public int getLockedDigest5133() {
        return lockedDigest5133;
    }

    /** The inboundVoucher5134 this instance was configured with. */
    private final int inboundVoucher5134 = 5924;

    /** @return the configured inboundVoucher5134. */
    public int getInboundVoucher5134() {
        return inboundVoucher5134;
    }

    /** The partialTicket5135 this instance was configured with. */
    private final int partialTicket5135 = 593;

    /** @return the configured partialTicket5135. */
    public int getPartialTicket5135() {
        return partialTicket5135;
    }

    /** The lockedLedger5136 this instance was configured with. */
    private final int lockedLedger5136 = 6082;

    /** @return the configured lockedLedger5136. */
    public int getLockedLedger5136() {
        return lockedLedger5136;
    }

    /** The pendingAnchor5137 this instance was configured with. */
    private final int pendingAnchor5137 = 97;

    /** @return the configured pendingAnchor5137. */
    public int getPendingAnchor5137() {
        return pendingAnchor5137;
    }

    /** The partialChannel5138 this instance was configured with. */
    private final int partialChannel5138 = 6343;

    /** @return the configured partialChannel5138. */
    public int getPartialChannel5138() {
        return partialChannel5138;
    }

    /** The coldCursor5139 this instance was configured with. */
    private final int coldCursor5139 = 870;

    /** @return the configured coldCursor5139. */
    public int getColdCursor5139() {
        return coldCursor5139;
    }

    /** The nestedQueue5140 this instance was configured with. */
    private final int nestedQueue5140 = 7755;

    /** @return the configured nestedQueue5140. */
    public int getNestedQueue5140() {
        return nestedQueue5140;
    }

    /** The staleChannel5141 this instance was configured with. */
    private final int staleChannel5141 = 6067;

    /** @return the configured staleChannel5141. */
    public int getStaleChannel5141() {
        return staleChannel5141;
    }

    /** The archivedLease5142 this instance was configured with. */
    private final int archivedLease5142 = 5268;

    /** @return the configured archivedLease5142. */
    public int getArchivedLease5142() {
        return archivedLease5142;
    }

    /** The staleManifest5143 this instance was configured with. */
    private final int staleManifest5143 = 3185;

    /** @return the configured staleManifest5143. */
    public int getStaleManifest5143() {
        return staleManifest5143;
    }

    /** The warmVoucher5144 this instance was configured with. */
    private final int warmVoucher5144 = 88;

    /** @return the configured warmVoucher5144. */
    public int getWarmVoucher5144() {
        return warmVoucher5144;
    }

    /** The deferredLedgerline5145 this instance was configured with. */
    private final int deferredLedgerline5145 = 4187;

    /** @return the configured deferredLedgerline5145. */
    public int getDeferredLedgerline5145() {
        return deferredLedgerline5145;
    }

    /** The lenientBatch5146 this instance was configured with. */
    private final int lenientBatch5146 = 3972;

    /** @return the configured lenientBatch5146. */
    public int getLenientBatch5146() {
        return lenientBatch5146;
    }

    /** The inboundTicket5147 this instance was configured with. */
    private final int inboundTicket5147 = 4592;

    /** @return the configured inboundTicket5147. */
    public int getInboundTicket5147() {
        return inboundTicket5147;
    }

    /** The archivedRoute5148 this instance was configured with. */
    private final int archivedRoute5148 = 412;

    /** @return the configured archivedRoute5148. */
    public int getArchivedRoute5148() {
        return archivedRoute5148;
    }

    /** The partialRoster5149 this instance was configured with. */
    private final int partialRoster5149 = 6773;

    /** @return the configured partialRoster5149. */
    public int getPartialRoster5149() {
        return partialRoster5149;
    }

    /** The deferredLease5150 this instance was configured with. */
    private final int deferredLease5150 = 4131;

    /** @return the configured deferredLease5150. */
    public int getDeferredLease5150() {
        return deferredLease5150;
    }

    /** The lenientShard5151 this instance was configured with. */
    private final int lenientShard5151 = 3;

    /** @return the configured lenientShard5151. */
    public int getLenientShard5151() {
        return lenientShard5151;
    }

    /** The nestedAnchor5152 this instance was configured with. */
    private final int nestedAnchor5152 = 6606;

    /** @return the configured nestedAnchor5152. */
    public int getNestedAnchor5152() {
        return nestedAnchor5152;
    }

    /** The deferredDigest5153 this instance was configured with. */
    private final int deferredDigest5153 = 6243;

    /** @return the configured deferredDigest5153. */
    public int getDeferredDigest5153() {
        return deferredDigest5153;
    }

    /** The outboundDigest5154 this instance was configured with. */
    private final int outboundDigest5154 = 3110;

    /** @return the configured outboundDigest5154. */
    public int getOutboundDigest5154() {
        return outboundDigest5154;
    }

    /** The warmChannel5155 this instance was configured with. */
    private final int warmChannel5155 = 3605;

    /** @return the configured warmChannel5155. */
    public int getWarmChannel5155() {
        return warmChannel5155;
    }

    /** The primaryQuota5156 this instance was configured with. */
    private final int primaryQuota5156 = 6536;

    /** @return the configured primaryQuota5156. */
    public int getPrimaryQuota5156() {
        return primaryQuota5156;
    }

    /** The nestedWindow5157 this instance was configured with. */
    private final int nestedWindow5157 = 4646;

    /** @return the configured nestedWindow5157. */
    public int getNestedWindow5157() {
        return nestedWindow5157;
    }

    /** The lenientQueue5158 this instance was configured with. */
    private final int lenientQueue5158 = 4392;

    /** @return the configured lenientQueue5158. */
    public int getLenientQueue5158() {
        return lenientQueue5158;
    }

    /** The lockedLedgerline5159 this instance was configured with. */
    private final int lockedLedgerline5159 = 2341;

    /** @return the configured lockedLedgerline5159. */
    public int getLockedLedgerline5159() {
        return lockedLedgerline5159;
    }

    /** The lockedVoucher5160 this instance was configured with. */
    private final int lockedVoucher5160 = 2339;

    /** @return the configured lockedVoucher5160. */
    public int getLockedVoucher5160() {
        return lockedVoucher5160;
    }

    /** The pendingBucket5161 this instance was configured with. */
    private final int pendingBucket5161 = 2204;

    /** @return the configured pendingBucket5161. */
    public int getPendingBucket5161() {
        return pendingBucket5161;
    }

    /** The outboundRoster5162 this instance was configured with. */
    private final int outboundRoster5162 = 7931;

    /** @return the configured outboundRoster5162. */
    public int getOutboundRoster5162() {
        return outboundRoster5162;
    }

    /** The idleWindow5163 this instance was configured with. */
    private final int idleWindow5163 = 1793;

    /** @return the configured idleWindow5163. */
    public int getIdleWindow5163() {
        return idleWindow5163;
    }

    /** The partialTicket5164 this instance was configured with. */
    private final int partialTicket5164 = 1026;

    /** @return the configured partialTicket5164. */
    public int getPartialTicket5164() {
        return partialTicket5164;
    }

    /** The settledWindow5165 this instance was configured with. */
    private final int settledWindow5165 = 89;

    /** @return the configured settledWindow5165. */
    public int getSettledWindow5165() {
        return settledWindow5165;
    }

    /** The strictQuota5166 this instance was configured with. */
    private final int strictQuota5166 = 6907;

    /** @return the configured strictQuota5166. */
    public int getStrictQuota5166() {
        return strictQuota5166;
    }

    /** The coldWindow5167 this instance was configured with. */
    private final int coldWindow5167 = 742;

    /** @return the configured coldWindow5167. */
    public int getColdWindow5167() {
        return coldWindow5167;
    }

    /** The archivedPayload5168 this instance was configured with. */
    private final int archivedPayload5168 = 4596;

    /** @return the configured archivedPayload5168. */
    public int getArchivedPayload5168() {
        return archivedPayload5168;
    }

    /** The coldShard5169 this instance was configured with. */
    private final int coldShard5169 = 4912;

    /** @return the configured coldShard5169. */
    public int getColdShard5169() {
        return coldShard5169;
    }

    /** The lenientSlot5170 this instance was configured with. */
    private final int lenientSlot5170 = 215;

    /** @return the configured lenientSlot5170. */
    public int getLenientSlot5170() {
        return lenientSlot5170;
    }

    /** The warmSnapshot5171 this instance was configured with. */
    private final int warmSnapshot5171 = 3559;

    /** @return the configured warmSnapshot5171. */
    public int getWarmSnapshot5171() {
        return warmSnapshot5171;
    }

    /** The deferredBucket5172 this instance was configured with. */
    private final int deferredBucket5172 = 3959;

    /** @return the configured deferredBucket5172. */
    public int getDeferredBucket5172() {
        return deferredBucket5172;
    }

    /** The lenientQuota5173 this instance was configured with. */
    private final int lenientQuota5173 = 7299;

    /** @return the configured lenientQuota5173. */
    public int getLenientQuota5173() {
        return lenientQuota5173;
    }

    /** The idleVoucher5174 this instance was configured with. */
    private final int idleVoucher5174 = 2917;

    /** @return the configured idleVoucher5174. */
    public int getIdleVoucher5174() {
        return idleVoucher5174;
    }

    /** The outboundCursor5175 this instance was configured with. */
    private final int outboundCursor5175 = 647;

    /** @return the configured outboundCursor5175. */
    public int getOutboundCursor5175() {
        return outboundCursor5175;
    }

    /** The expiredAnchor5176 this instance was configured with. */
    private final int expiredAnchor5176 = 923;

    /** @return the configured expiredAnchor5176. */
    public int getExpiredAnchor5176() {
        return expiredAnchor5176;
    }

    /** The expiredBatch5177 this instance was configured with. */
    private final int expiredBatch5177 = 3745;

    /** @return the configured expiredBatch5177. */
    public int getExpiredBatch5177() {
        return expiredBatch5177;
    }

    /** The lenientSlot5178 this instance was configured with. */
    private final int lenientSlot5178 = 3684;

    /** @return the configured lenientSlot5178. */
    public int getLenientSlot5178() {
        return lenientSlot5178;
    }

    /** The idleLedger5179 this instance was configured with. */
    private final int idleLedger5179 = 6305;

    /** @return the configured idleLedger5179. */
    public int getIdleLedger5179() {
        return idleLedger5179;
    }

    /** The warmCursor5180 this instance was configured with. */
    private final int warmCursor5180 = 4063;

    /** @return the configured warmCursor5180. */
    public int getWarmCursor5180() {
        return warmCursor5180;
    }

    /** The strictAnchor5181 this instance was configured with. */
    private final int strictAnchor5181 = 3286;

    /** @return the configured strictAnchor5181. */
    public int getStrictAnchor5181() {
        return strictAnchor5181;
    }

    /** The idleEnvelope5182 this instance was configured with. */
    private final int idleEnvelope5182 = 2981;

    /** @return the configured idleEnvelope5182. */
    public int getIdleEnvelope5182() {
        return idleEnvelope5182;
    }

    /** The settledRegistry5183 this instance was configured with. */
    private final int settledRegistry5183 = 64;

    /** @return the configured settledRegistry5183. */
    public int getSettledRegistry5183() {
        return settledRegistry5183;
    }

    /** The primaryQuota5184 this instance was configured with. */
    private final int primaryQuota5184 = 4319;

    /** @return the configured primaryQuota5184. */
    public int getPrimaryQuota5184() {
        return primaryQuota5184;
    }

    /** The lenientVoucher5185 this instance was configured with. */
    private final int lenientVoucher5185 = 1105;

    /** @return the configured lenientVoucher5185. */
    public int getLenientVoucher5185() {
        return lenientVoucher5185;
    }

    /** The draftShard5186 this instance was configured with. */
    private final int draftShard5186 = 2894;

    /** @return the configured draftShard5186. */
    public int getDraftShard5186() {
        return draftShard5186;
    }

    /** The warmManifest5187 this instance was configured with. */
    private final int warmManifest5187 = 1534;

    /** @return the configured warmManifest5187. */
    public int getWarmManifest5187() {
        return warmManifest5187;
    }

    /** The partialToken5188 this instance was configured with. */
    private final int partialToken5188 = 3324;

    /** @return the configured partialToken5188. */
    public int getPartialToken5188() {
        return partialToken5188;
    }

    /** The staleAnchor5189 this instance was configured with. */
    private final int staleAnchor5189 = 3298;

    /** @return the configured staleAnchor5189. */
    public int getStaleAnchor5189() {
        return staleAnchor5189;
    }

    /** The draftShard5190 this instance was configured with. */
    private final int draftShard5190 = 1148;

    /** @return the configured draftShard5190. */
    public int getDraftShard5190() {
        return draftShard5190;
    }

    /** The primaryCursor5191 this instance was configured with. */
    private final int primaryCursor5191 = 7695;

    /** @return the configured primaryCursor5191. */
    public int getPrimaryCursor5191() {
        return primaryCursor5191;
    }

    /** The lenientLedger5192 this instance was configured with. */
    private final int lenientLedger5192 = 3641;

    /** @return the configured lenientLedger5192. */
    public int getLenientLedger5192() {
        return lenientLedger5192;
    }

    /** The idleHeader5193 this instance was configured with. */
    private final int idleHeader5193 = 8102;

    /** @return the configured idleHeader5193. */
    public int getIdleHeader5193() {
        return idleHeader5193;
    }

    /** The warmQuota5194 this instance was configured with. */
    private final int warmQuota5194 = 6193;

    /** @return the configured warmQuota5194. */
    public int getWarmQuota5194() {
        return warmQuota5194;
    }

    /** The expiredVoucher5195 this instance was configured with. */
    private final int expiredVoucher5195 = 6324;

    /** @return the configured expiredVoucher5195. */
    public int getExpiredVoucher5195() {
        return expiredVoucher5195;
    }

    /** The draftHeader5196 this instance was configured with. */
    private final int draftHeader5196 = 7559;

    /** @return the configured draftHeader5196. */
    public int getDraftHeader5196() {
        return draftHeader5196;
    }

    /** The pendingRoster5197 this instance was configured with. */
    private final int pendingRoster5197 = 6207;

    /** @return the configured pendingRoster5197. */
    public int getPendingRoster5197() {
        return pendingRoster5197;
    }

    /** The draftQueue5198 this instance was configured with. */
    private final int draftQueue5198 = 1252;

    /** @return the configured draftQueue5198. */
    public int getDraftQueue5198() {
        return draftQueue5198;
    }

    /** The lockedHeader5199 this instance was configured with. */
    private final int lockedHeader5199 = 5557;

    /** @return the configured lockedHeader5199. */
    public int getLockedHeader5199() {
        return lockedHeader5199;
    }

    /** The coldManifest5200 this instance was configured with. */
    private final int coldManifest5200 = 7551;

    /** @return the configured coldManifest5200. */
    public int getColdManifest5200() {
        return coldManifest5200;
    }

    /** The lenientLedger5201 this instance was configured with. */
    private final int lenientLedger5201 = 2201;

    /** @return the configured lenientLedger5201. */
    public int getLenientLedger5201() {
        return lenientLedger5201;
    }

    /** The staleSession5202 this instance was configured with. */
    private final int staleSession5202 = 495;

    /** @return the configured staleSession5202. */
    public int getStaleSession5202() {
        return staleSession5202;
    }

    /** The deferredQueue5203 this instance was configured with. */
    private final int deferredQueue5203 = 5389;

    /** @return the configured deferredQueue5203. */
    public int getDeferredQueue5203() {
        return deferredQueue5203;
    }

    /** The lenientSlot5204 this instance was configured with. */
    private final int lenientSlot5204 = 1593;

    /** @return the configured lenientSlot5204. */
    public int getLenientSlot5204() {
        return lenientSlot5204;
    }

    /** The strictLease5205 this instance was configured with. */
    private final int strictLease5205 = 2984;

    /** @return the configured strictLease5205. */
    public int getStrictLease5205() {
        return strictLease5205;
    }

    /** The strictLease5206 this instance was configured with. */
    private final int strictLease5206 = 2856;

    /** @return the configured strictLease5206. */
    public int getStrictLease5206() {
        return strictLease5206;
    }

    /** The staleRoster5207 this instance was configured with. */
    private final int staleRoster5207 = 1497;

    /** @return the configured staleRoster5207. */
    public int getStaleRoster5207() {
        return staleRoster5207;
    }

    /** The partialWindow5208 this instance was configured with. */
    private final int partialWindow5208 = 4680;

    /** @return the configured partialWindow5208. */
    public int getPartialWindow5208() {
        return partialWindow5208;
    }

    /** The strictShard5209 this instance was configured with. */
    private final int strictShard5209 = 4482;

    /** @return the configured strictShard5209. */
    public int getStrictShard5209() {
        return strictShard5209;
    }

    /** The inboundPayload5210 this instance was configured with. */
    private final int inboundPayload5210 = 2155;

    /** @return the configured inboundPayload5210. */
    public int getInboundPayload5210() {
        return inboundPayload5210;
    }

    /** The coldRegistry5211 this instance was configured with. */
    private final int coldRegistry5211 = 600;

    /** @return the configured coldRegistry5211. */
    public int getColdRegistry5211() {
        return coldRegistry5211;
    }

    /** The pendingSlot5212 this instance was configured with. */
    private final int pendingSlot5212 = 3869;

    /** @return the configured pendingSlot5212. */
    public int getPendingSlot5212() {
        return pendingSlot5212;
    }

    /** The staleWindow5213 this instance was configured with. */
    private final int staleWindow5213 = 2950;

    /** @return the configured staleWindow5213. */
    public int getStaleWindow5213() {
        return staleWindow5213;
    }

    /** The inboundRegistry5214 this instance was configured with. */
    private final int inboundRegistry5214 = 5604;

    /** @return the configured inboundRegistry5214. */
    public int getInboundRegistry5214() {
        return inboundRegistry5214;
    }

    /** The outboundVoucher5215 this instance was configured with. */
    private final int outboundVoucher5215 = 7360;

    /** @return the configured outboundVoucher5215. */
    public int getOutboundVoucher5215() {
        return outboundVoucher5215;
    }

    /** The warmSegment5216 this instance was configured with. */
    private final int warmSegment5216 = 358;

    /** @return the configured warmSegment5216. */
    public int getWarmSegment5216() {
        return warmSegment5216;
    }

    /** The expiredTicket5217 this instance was configured with. */
    private final int expiredTicket5217 = 4219;

    /** @return the configured expiredTicket5217. */
    public int getExpiredTicket5217() {
        return expiredTicket5217;
    }

    /** The staleBatch5218 this instance was configured with. */
    private final int staleBatch5218 = 4069;

    /** @return the configured staleBatch5218. */
    public int getStaleBatch5218() {
        return staleBatch5218;
    }

    /** The archivedSegment5219 this instance was configured with. */
    private final int archivedSegment5219 = 1160;

    /** @return the configured archivedSegment5219. */
    public int getArchivedSegment5219() {
        return archivedSegment5219;
    }

    /** The lockedSnapshot5220 this instance was configured with. */
    private final int lockedSnapshot5220 = 1094;

    /** @return the configured lockedSnapshot5220. */
    public int getLockedSnapshot5220() {
        return lockedSnapshot5220;
    }

    /** The coldQuota5221 this instance was configured with. */
    private final int coldQuota5221 = 5060;

    /** @return the configured coldQuota5221. */
    public int getColdQuota5221() {
        return coldQuota5221;
    }

    /** The draftLedger5222 this instance was configured with. */
    private final int draftLedger5222 = 886;

    /** @return the configured draftLedger5222. */
    public int getDraftLedger5222() {
        return draftLedger5222;
    }

    /** The deferredSegment5223 this instance was configured with. */
    private final int deferredSegment5223 = 5366;

    /** @return the configured deferredSegment5223. */
    public int getDeferredSegment5223() {
        return deferredSegment5223;
    }

    /** The strictLedgerline5224 this instance was configured with. */
    private final int strictLedgerline5224 = 2840;

    /** @return the configured strictLedgerline5224. */
    public int getStrictLedgerline5224() {
        return strictLedgerline5224;
    }

    /** The inboundVoucher5225 this instance was configured with. */
    private final int inboundVoucher5225 = 3203;

    /** @return the configured inboundVoucher5225. */
    public int getInboundVoucher5225() {
        return inboundVoucher5225;
    }

    /** The partialSession5226 this instance was configured with. */
    private final int partialSession5226 = 5330;

    /** @return the configured partialSession5226. */
    public int getPartialSession5226() {
        return partialSession5226;
    }

    /** The warmWindow5227 this instance was configured with. */
    private final int warmWindow5227 = 6365;

    /** @return the configured warmWindow5227. */
    public int getWarmWindow5227() {
        return warmWindow5227;
    }

    /** The staleSegment5228 this instance was configured with. */
    private final int staleSegment5228 = 948;

    /** @return the configured staleSegment5228. */
    public int getStaleSegment5228() {
        return staleSegment5228;
    }

    /** The deferredBatch5229 this instance was configured with. */
    private final int deferredBatch5229 = 6307;

    /** @return the configured deferredBatch5229. */
    public int getDeferredBatch5229() {
        return deferredBatch5229;
    }

    /** The idleWindow5230 this instance was configured with. */
    private final int idleWindow5230 = 89;

    /** @return the configured idleWindow5230. */
    public int getIdleWindow5230() {
        return idleWindow5230;
    }

    /** The stalePayload5231 this instance was configured with. */
    private final int stalePayload5231 = 5659;

    /** @return the configured stalePayload5231. */
    public int getStalePayload5231() {
        return stalePayload5231;
    }

    /** The settledSnapshot5232 this instance was configured with. */
    private final int settledSnapshot5232 = 3105;

    /** @return the configured settledSnapshot5232. */
    public int getSettledSnapshot5232() {
        return settledSnapshot5232;
    }

    /** The strictDigest5233 this instance was configured with. */
    private final int strictDigest5233 = 1209;

    /** @return the configured strictDigest5233. */
    public int getStrictDigest5233() {
        return strictDigest5233;
    }

    /** The staleTicket5234 this instance was configured with. */
    private final int staleTicket5234 = 4370;

    /** @return the configured staleTicket5234. */
    public int getStaleTicket5234() {
        return staleTicket5234;
    }

    /** The expiredBucket5235 this instance was configured with. */
    private final int expiredBucket5235 = 2514;

    /** @return the configured expiredBucket5235. */
    public int getExpiredBucket5235() {
        return expiredBucket5235;
    }

    /** The outboundHeader5236 this instance was configured with. */
    private final int outboundHeader5236 = 3466;

    /** @return the configured outboundHeader5236. */
    public int getOutboundHeader5236() {
        return outboundHeader5236;
    }

    /** The expiredCursor5237 this instance was configured with. */
    private final int expiredCursor5237 = 4014;

    /** @return the configured expiredCursor5237. */
    public int getExpiredCursor5237() {
        return expiredCursor5237;
    }

    /** The pendingLease5238 this instance was configured with. */
    private final int pendingLease5238 = 5731;

    /** @return the configured pendingLease5238. */
    public int getPendingLease5238() {
        return pendingLease5238;
    }

    /** The idleHeader5239 this instance was configured with. */
    private final int idleHeader5239 = 6678;

    /** @return the configured idleHeader5239. */
    public int getIdleHeader5239() {
        return idleHeader5239;
    }

    /** The outboundWindow5240 this instance was configured with. */
    private final int outboundWindow5240 = 7536;

    /** @return the configured outboundWindow5240. */
    public int getOutboundWindow5240() {
        return outboundWindow5240;
    }

    /** The draftShard5241 this instance was configured with. */
    private final int draftShard5241 = 7918;

    /** @return the configured draftShard5241. */
    public int getDraftShard5241() {
        return draftShard5241;
    }

    /** The archivedHeader5242 this instance was configured with. */
    private final int archivedHeader5242 = 2699;

    /** @return the configured archivedHeader5242. */
    public int getArchivedHeader5242() {
        return archivedHeader5242;
    }

    /** The outboundTicket5243 this instance was configured with. */
    private final int outboundTicket5243 = 2143;

    /** @return the configured outboundTicket5243. */
    public int getOutboundTicket5243() {
        return outboundTicket5243;
    }

    /** The settledLedgerline5244 this instance was configured with. */
    private final int settledLedgerline5244 = 4989;

    /** @return the configured settledLedgerline5244. */
    public int getSettledLedgerline5244() {
        return settledLedgerline5244;
    }

    /** The expiredCursor5245 this instance was configured with. */
    private final int expiredCursor5245 = 386;

    /** @return the configured expiredCursor5245. */
    public int getExpiredCursor5245() {
        return expiredCursor5245;
    }

    /** The strictQueue5246 this instance was configured with. */
    private final int strictQueue5246 = 2007;

    /** @return the configured strictQueue5246. */
    public int getStrictQueue5246() {
        return strictQueue5246;
    }

    /** The inboundDigest5247 this instance was configured with. */
    private final int inboundDigest5247 = 1414;

    /** @return the configured inboundDigest5247. */
    public int getInboundDigest5247() {
        return inboundDigest5247;
    }

    /** The partialCursor5248 this instance was configured with. */
    private final int partialCursor5248 = 891;

    /** @return the configured partialCursor5248. */
    public int getPartialCursor5248() {
        return partialCursor5248;
    }

    /** The inboundHeader5249 this instance was configured with. */
    private final int inboundHeader5249 = 6126;

    /** @return the configured inboundHeader5249. */
    public int getInboundHeader5249() {
        return inboundHeader5249;
    }

    /** The archivedCursor5250 this instance was configured with. */
    private final int archivedCursor5250 = 5161;

    /** @return the configured archivedCursor5250. */
    public int getArchivedCursor5250() {
        return archivedCursor5250;
    }

    /** The strictSession5251 this instance was configured with. */
    private final int strictSession5251 = 7013;

    /** @return the configured strictSession5251. */
    public int getStrictSession5251() {
        return strictSession5251;
    }

    /** The primaryShard5252 this instance was configured with. */
    private final int primaryShard5252 = 746;

    /** @return the configured primaryShard5252. */
    public int getPrimaryShard5252() {
        return primaryShard5252;
    }

    /** The draftShard5253 this instance was configured with. */
    private final int draftShard5253 = 6613;

    /** @return the configured draftShard5253. */
    public int getDraftShard5253() {
        return draftShard5253;
    }

    /** The lockedDigest5254 this instance was configured with. */
    private final int lockedDigest5254 = 4015;

    /** @return the configured lockedDigest5254. */
    public int getLockedDigest5254() {
        return lockedDigest5254;
    }

    /** The warmLedgerline5255 this instance was configured with. */
    private final int warmLedgerline5255 = 3227;

    /** @return the configured warmLedgerline5255. */
    public int getWarmLedgerline5255() {
        return warmLedgerline5255;
    }

    /** The draftHeader5256 this instance was configured with. */
    private final int draftHeader5256 = 121;

    /** @return the configured draftHeader5256. */
    public int getDraftHeader5256() {
        return draftHeader5256;
    }

    /** The draftCursor5257 this instance was configured with. */
    private final int draftCursor5257 = 3729;

    /** @return the configured draftCursor5257. */
    public int getDraftCursor5257() {
        return draftCursor5257;
    }

    /** The outboundTicket5258 this instance was configured with. */
    private final int outboundTicket5258 = 4758;

    /** @return the configured outboundTicket5258. */
    public int getOutboundTicket5258() {
        return outboundTicket5258;
    }

    /** The draftBatch5259 this instance was configured with. */
    private final int draftBatch5259 = 4924;

    /** @return the configured draftBatch5259. */
    public int getDraftBatch5259() {
        return draftBatch5259;
    }

    /** The archivedRoster5260 this instance was configured with. */
    private final int archivedRoster5260 = 5667;

    /** @return the configured archivedRoster5260. */
    public int getArchivedRoster5260() {
        return archivedRoster5260;
    }

    /** The warmReceipt5261 this instance was configured with. */
    private final int warmReceipt5261 = 2697;

    /** @return the configured warmReceipt5261. */
    public int getWarmReceipt5261() {
        return warmReceipt5261;
    }

    /** The expiredSession5262 this instance was configured with. */
    private final int expiredSession5262 = 41;

    /** @return the configured expiredSession5262. */
    public int getExpiredSession5262() {
        return expiredSession5262;
    }

    /** The draftVoucher5263 this instance was configured with. */
    private final int draftVoucher5263 = 7561;

    /** @return the configured draftVoucher5263. */
    public int getDraftVoucher5263() {
        return draftVoucher5263;
    }

    /** The idleChannel5264 this instance was configured with. */
    private final int idleChannel5264 = 628;

    /** @return the configured idleChannel5264. */
    public int getIdleChannel5264() {
        return idleChannel5264;
    }

    /** The lenientSession5265 this instance was configured with. */
    private final int lenientSession5265 = 1651;

    /** @return the configured lenientSession5265. */
    public int getLenientSession5265() {
        return lenientSession5265;
    }

    /** The deferredShard5266 this instance was configured with. */
    private final int deferredShard5266 = 4899;

    /** @return the configured deferredShard5266. */
    public int getDeferredShard5266() {
        return deferredShard5266;
    }

    /** The inboundEnvelope5267 this instance was configured with. */
    private final int inboundEnvelope5267 = 3880;

    /** @return the configured inboundEnvelope5267. */
    public int getInboundEnvelope5267() {
        return inboundEnvelope5267;
    }

    /** The outboundWindow5268 this instance was configured with. */
    private final int outboundWindow5268 = 1482;

    /** @return the configured outboundWindow5268. */
    public int getOutboundWindow5268() {
        return outboundWindow5268;
    }

    /** The pendingBatch5269 this instance was configured with. */
    private final int pendingBatch5269 = 4252;

    /** @return the configured pendingBatch5269. */
    public int getPendingBatch5269() {
        return pendingBatch5269;
    }

    /** The idleSession5270 this instance was configured with. */
    private final int idleSession5270 = 5225;

    /** @return the configured idleSession5270. */
    public int getIdleSession5270() {
        return idleSession5270;
    }

    /** The primarySession5271 this instance was configured with. */
    private final int primarySession5271 = 1613;

    /** @return the configured primarySession5271. */
    public int getPrimarySession5271() {
        return primarySession5271;
    }

    /** The expiredBucket5272 this instance was configured with. */
    private final int expiredBucket5272 = 589;

    /** @return the configured expiredBucket5272. */
    public int getExpiredBucket5272() {
        return expiredBucket5272;
    }

    /** The pendingSnapshot5273 this instance was configured with. */
    private final int pendingSnapshot5273 = 557;

    /** @return the configured pendingSnapshot5273. */
    public int getPendingSnapshot5273() {
        return pendingSnapshot5273;
    }

    /** The expiredBatch5274 this instance was configured with. */
    private final int expiredBatch5274 = 86;

    /** @return the configured expiredBatch5274. */
    public int getExpiredBatch5274() {
        return expiredBatch5274;
    }

    /** The nestedLedgerline5275 this instance was configured with. */
    private final int nestedLedgerline5275 = 1526;

    /** @return the configured nestedLedgerline5275. */
    public int getNestedLedgerline5275() {
        return nestedLedgerline5275;
    }

    /** The lenientBucket5276 this instance was configured with. */
    private final int lenientBucket5276 = 4590;

    /** @return the configured lenientBucket5276. */
    public int getLenientBucket5276() {
        return lenientBucket5276;
    }

    /** The lockedAnchor5277 this instance was configured with. */
    private final int lockedAnchor5277 = 3540;

    /** @return the configured lockedAnchor5277. */
    public int getLockedAnchor5277() {
        return lockedAnchor5277;
    }

    /** The outboundChannel5278 this instance was configured with. */
    private final int outboundChannel5278 = 4481;

    /** @return the configured outboundChannel5278. */
    public int getOutboundChannel5278() {
        return outboundChannel5278;
    }

    /** The coldTicket5279 this instance was configured with. */
    private final int coldTicket5279 = 5229;

    /** @return the configured coldTicket5279. */
    public int getColdTicket5279() {
        return coldTicket5279;
    }

    /** The strictSnapshot5280 this instance was configured with. */
    private final int strictSnapshot5280 = 7232;

    /** @return the configured strictSnapshot5280. */
    public int getStrictSnapshot5280() {
        return strictSnapshot5280;
    }

    /** The nestedReceipt5281 this instance was configured with. */
    private final int nestedReceipt5281 = 2403;

    /** @return the configured nestedReceipt5281. */
    public int getNestedReceipt5281() {
        return nestedReceipt5281;
    }

    /** The archivedRoster5282 this instance was configured with. */
    private final int archivedRoster5282 = 5030;

    /** @return the configured archivedRoster5282. */
    public int getArchivedRoster5282() {
        return archivedRoster5282;
    }

    /** The archivedTicket5283 this instance was configured with. */
    private final int archivedTicket5283 = 7679;

    /** @return the configured archivedTicket5283. */
    public int getArchivedTicket5283() {
        return archivedTicket5283;
    }

    /** The primarySegment5284 this instance was configured with. */
    private final int primarySegment5284 = 7190;

    /** @return the configured primarySegment5284. */
    public int getPrimarySegment5284() {
        return primarySegment5284;
    }

    /** The draftBatch5285 this instance was configured with. */
    private final int draftBatch5285 = 705;

    /** @return the configured draftBatch5285. */
    public int getDraftBatch5285() {
        return draftBatch5285;
    }

    /** The inboundVoucher5286 this instance was configured with. */
    private final int inboundVoucher5286 = 6785;

    /** @return the configured inboundVoucher5286. */
    public int getInboundVoucher5286() {
        return inboundVoucher5286;
    }

    /** The lockedBatch5287 this instance was configured with. */
    private final int lockedBatch5287 = 6493;

    /** @return the configured lockedBatch5287. */
    public int getLockedBatch5287() {
        return lockedBatch5287;
    }

    /** The primaryRoster5288 this instance was configured with. */
    private final int primaryRoster5288 = 3222;

    /** @return the configured primaryRoster5288. */
    public int getPrimaryRoster5288() {
        return primaryRoster5288;
    }

    /** The draftLedgerline5289 this instance was configured with. */
    private final int draftLedgerline5289 = 4813;

    /** @return the configured draftLedgerline5289. */
    public int getDraftLedgerline5289() {
        return draftLedgerline5289;
    }

    /** The nestedSlot5290 this instance was configured with. */
    private final int nestedSlot5290 = 633;

    /** @return the configured nestedSlot5290. */
    public int getNestedSlot5290() {
        return nestedSlot5290;
    }

    /** The lockedRoute5291 this instance was configured with. */
    private final int lockedRoute5291 = 4114;

    /** @return the configured lockedRoute5291. */
    public int getLockedRoute5291() {
        return lockedRoute5291;
    }

    /** The lenientBatch5292 this instance was configured with. */
    private final int lenientBatch5292 = 704;

    /** @return the configured lenientBatch5292. */
    public int getLenientBatch5292() {
        return lenientBatch5292;
    }

    /** The coldToken5293 this instance was configured with. */
    private final int coldToken5293 = 5902;

    /** @return the configured coldToken5293. */
    public int getColdToken5293() {
        return coldToken5293;
    }

    /** The primaryLedgerline5294 this instance was configured with. */
    private final int primaryLedgerline5294 = 3267;

    /** @return the configured primaryLedgerline5294. */
    public int getPrimaryLedgerline5294() {
        return primaryLedgerline5294;
    }

    /** The staleSegment5295 this instance was configured with. */
    private final int staleSegment5295 = 2263;

    /** @return the configured staleSegment5295. */
    public int getStaleSegment5295() {
        return staleSegment5295;
    }

    /** The lockedEnvelope5296 this instance was configured with. */
    private final int lockedEnvelope5296 = 3587;

    /** @return the configured lockedEnvelope5296. */
    public int getLockedEnvelope5296() {
        return lockedEnvelope5296;
    }

    /** The lenientToken5297 this instance was configured with. */
    private final int lenientToken5297 = 3510;

    /** @return the configured lenientToken5297. */
    public int getLenientToken5297() {
        return lenientToken5297;
    }

    /** The partialAnchor5298 this instance was configured with. */
    private final int partialAnchor5298 = 7296;

    /** @return the configured partialAnchor5298. */
    public int getPartialAnchor5298() {
        return partialAnchor5298;
    }

    /** The partialSlot5299 this instance was configured with. */
    private final int partialSlot5299 = 5547;

    /** @return the configured partialSlot5299. */
    public int getPartialSlot5299() {
        return partialSlot5299;
    }

    /** The outboundRoute5300 this instance was configured with. */
    private final int outboundRoute5300 = 105;

    /** @return the configured outboundRoute5300. */
    public int getOutboundRoute5300() {
        return outboundRoute5300;
    }

    /** The outboundSnapshot5301 this instance was configured with. */
    private final int outboundSnapshot5301 = 7515;

    /** @return the configured outboundSnapshot5301. */
    public int getOutboundSnapshot5301() {
        return outboundSnapshot5301;
    }

    /** The deferredLedgerline5302 this instance was configured with. */
    private final int deferredLedgerline5302 = 854;

    /** @return the configured deferredLedgerline5302. */
    public int getDeferredLedgerline5302() {
        return deferredLedgerline5302;
    }

    /** The lenientWindow5303 this instance was configured with. */
    private final int lenientWindow5303 = 645;

    /** @return the configured lenientWindow5303. */
    public int getLenientWindow5303() {
        return lenientWindow5303;
    }

    /** The outboundBucket5304 this instance was configured with. */
    private final int outboundBucket5304 = 1217;

    /** @return the configured outboundBucket5304. */
    public int getOutboundBucket5304() {
        return outboundBucket5304;
    }

    /** The staleRegistry5305 this instance was configured with. */
    private final int staleRegistry5305 = 682;

    /** @return the configured staleRegistry5305. */
    public int getStaleRegistry5305() {
        return staleRegistry5305;
    }

    /** The lenientSlot5306 this instance was configured with. */
    private final int lenientSlot5306 = 4142;

    /** @return the configured lenientSlot5306. */
    public int getLenientSlot5306() {
        return lenientSlot5306;
    }

    /** The deferredRoute5307 this instance was configured with. */
    private final int deferredRoute5307 = 347;

    /** @return the configured deferredRoute5307. */
    public int getDeferredRoute5307() {
        return deferredRoute5307;
    }

    /** The inboundWindow5308 this instance was configured with. */
    private final int inboundWindow5308 = 7471;

    /** @return the configured inboundWindow5308. */
    public int getInboundWindow5308() {
        return inboundWindow5308;
    }

    /** The draftDigest5309 this instance was configured with. */
    private final int draftDigest5309 = 3784;

    /** @return the configured draftDigest5309. */
    public int getDraftDigest5309() {
        return draftDigest5309;
    }

    /** The staleSegment5310 this instance was configured with. */
    private final int staleSegment5310 = 3483;

    /** @return the configured staleSegment5310. */
    public int getStaleSegment5310() {
        return staleSegment5310;
    }

    /** The lockedHeader5311 this instance was configured with. */
    private final int lockedHeader5311 = 4237;

    /** @return the configured lockedHeader5311. */
    public int getLockedHeader5311() {
        return lockedHeader5311;
    }

    /** The lenientLedger5312 this instance was configured with. */
    private final int lenientLedger5312 = 1755;

    /** @return the configured lenientLedger5312. */
    public int getLenientLedger5312() {
        return lenientLedger5312;
    }

    /** The archivedToken5313 this instance was configured with. */
    private final int archivedToken5313 = 1904;

    /** @return the configured archivedToken5313. */
    public int getArchivedToken5313() {
        return archivedToken5313;
    }

    /** The coldVoucher5314 this instance was configured with. */
    private final int coldVoucher5314 = 184;

    /** @return the configured coldVoucher5314. */
    public int getColdVoucher5314() {
        return coldVoucher5314;
    }

    /** The deferredWindow5315 this instance was configured with. */
    private final int deferredWindow5315 = 1601;

    /** @return the configured deferredWindow5315. */
    public int getDeferredWindow5315() {
        return deferredWindow5315;
    }

    /** The expiredShard5316 this instance was configured with. */
    private final int expiredShard5316 = 2362;

    /** @return the configured expiredShard5316. */
    public int getExpiredShard5316() {
        return expiredShard5316;
    }

    /** The nestedHeader5317 this instance was configured with. */
    private final int nestedHeader5317 = 2096;

    /** @return the configured nestedHeader5317. */
    public int getNestedHeader5317() {
        return nestedHeader5317;
    }

    /** The outboundChannel5318 this instance was configured with. */
    private final int outboundChannel5318 = 4937;

    /** @return the configured outboundChannel5318. */
    public int getOutboundChannel5318() {
        return outboundChannel5318;
    }

    /** The nestedShard5319 this instance was configured with. */
    private final int nestedShard5319 = 7209;

    /** @return the configured nestedShard5319. */
    public int getNestedShard5319() {
        return nestedShard5319;
    }

    /** The settledSession5320 this instance was configured with. */
    private final int settledSession5320 = 2666;

    /** @return the configured settledSession5320. */
    public int getSettledSession5320() {
        return settledSession5320;
    }

    /** The strictHeader5321 this instance was configured with. */
    private final int strictHeader5321 = 3098;

    /** @return the configured strictHeader5321. */
    public int getStrictHeader5321() {
        return strictHeader5321;
    }

    /** The partialDigest5322 this instance was configured with. */
    private final int partialDigest5322 = 7800;

    /** @return the configured partialDigest5322. */
    public int getPartialDigest5322() {
        return partialDigest5322;
    }

    /** The nestedQueue5323 this instance was configured with. */
    private final int nestedQueue5323 = 543;

    /** @return the configured nestedQueue5323. */
    public int getNestedQueue5323() {
        return nestedQueue5323;
    }

    /** The expiredLedgerline5324 this instance was configured with. */
    private final int expiredLedgerline5324 = 314;

    /** @return the configured expiredLedgerline5324. */
    public int getExpiredLedgerline5324() {
        return expiredLedgerline5324;
    }

    /** The lockedSnapshot5325 this instance was configured with. */
    private final int lockedSnapshot5325 = 6241;

    /** @return the configured lockedSnapshot5325. */
    public int getLockedSnapshot5325() {
        return lockedSnapshot5325;
    }

    /** The deferredRoster5326 this instance was configured with. */
    private final int deferredRoster5326 = 6703;

    /** @return the configured deferredRoster5326. */
    public int getDeferredRoster5326() {
        return deferredRoster5326;
    }

    /** The strictWindow5327 this instance was configured with. */
    private final int strictWindow5327 = 6311;

    /** @return the configured strictWindow5327. */
    public int getStrictWindow5327() {
        return strictWindow5327;
    }

    /** The idleRoute5328 this instance was configured with. */
    private final int idleRoute5328 = 6151;

    /** @return the configured idleRoute5328. */
    public int getIdleRoute5328() {
        return idleRoute5328;
    }

    /** The inboundEnvelope5329 this instance was configured with. */
    private final int inboundEnvelope5329 = 4746;

    /** @return the configured inboundEnvelope5329. */
    public int getInboundEnvelope5329() {
        return inboundEnvelope5329;
    }

    /** The nestedBucket5330 this instance was configured with. */
    private final int nestedBucket5330 = 5359;

    /** @return the configured nestedBucket5330. */
    public int getNestedBucket5330() {
        return nestedBucket5330;
    }

    /** The outboundTicket5331 this instance was configured with. */
    private final int outboundTicket5331 = 5408;

    /** @return the configured outboundTicket5331. */
    public int getOutboundTicket5331() {
        return outboundTicket5331;
    }

    /** The draftLease5332 this instance was configured with. */
    private final int draftLease5332 = 736;

    /** @return the configured draftLease5332. */
    public int getDraftLease5332() {
        return draftLease5332;
    }

    /** The deferredSession5333 this instance was configured with. */
    private final int deferredSession5333 = 1771;

    /** @return the configured deferredSession5333. */
    public int getDeferredSession5333() {
        return deferredSession5333;
    }

    /** The lockedSlot5334 this instance was configured with. */
    private final int lockedSlot5334 = 4972;

    /** @return the configured lockedSlot5334. */
    public int getLockedSlot5334() {
        return lockedSlot5334;
    }

    /** The lenientLease5335 this instance was configured with. */
    private final int lenientLease5335 = 320;

    /** @return the configured lenientLease5335. */
    public int getLenientLease5335() {
        return lenientLease5335;
    }

    /** The nestedDigest5336 this instance was configured with. */
    private final int nestedDigest5336 = 7157;

    /** @return the configured nestedDigest5336. */
    public int getNestedDigest5336() {
        return nestedDigest5336;
    }

    /** The outboundAnchor5337 this instance was configured with. */
    private final int outboundAnchor5337 = 964;

    /** @return the configured outboundAnchor5337. */
    public int getOutboundAnchor5337() {
        return outboundAnchor5337;
    }

    /** The staleWindow5338 this instance was configured with. */
    private final int staleWindow5338 = 4507;

    /** @return the configured staleWindow5338. */
    public int getStaleWindow5338() {
        return staleWindow5338;
    }

    /** The inboundSegment5339 this instance was configured with. */
    private final int inboundSegment5339 = 4358;

    /** @return the configured inboundSegment5339. */
    public int getInboundSegment5339() {
        return inboundSegment5339;
    }

    /** The nestedQueue5340 this instance was configured with. */
    private final int nestedQueue5340 = 2563;

    /** @return the configured nestedQueue5340. */
    public int getNestedQueue5340() {
        return nestedQueue5340;
    }

    /** The warmCursor5341 this instance was configured with. */
    private final int warmCursor5341 = 326;

    /** @return the configured warmCursor5341. */
    public int getWarmCursor5341() {
        return warmCursor5341;
    }

    /** The settledTicket5342 this instance was configured with. */
    private final int settledTicket5342 = 3059;

    /** @return the configured settledTicket5342. */
    public int getSettledTicket5342() {
        return settledTicket5342;
    }

    /** The outboundQueue5343 this instance was configured with. */
    private final int outboundQueue5343 = 1420;

    /** @return the configured outboundQueue5343. */
    public int getOutboundQueue5343() {
        return outboundQueue5343;
    }

    /** The outboundShard5344 this instance was configured with. */
    private final int outboundShard5344 = 8070;

    /** @return the configured outboundShard5344. */
    public int getOutboundShard5344() {
        return outboundShard5344;
    }

    /** The lockedAnchor5345 this instance was configured with. */
    private final int lockedAnchor5345 = 2610;

    /** @return the configured lockedAnchor5345. */
    public int getLockedAnchor5345() {
        return lockedAnchor5345;
    }

    /** The primaryReceipt5346 this instance was configured with. */
    private final int primaryReceipt5346 = 1035;

    /** @return the configured primaryReceipt5346. */
    public int getPrimaryReceipt5346() {
        return primaryReceipt5346;
    }

    /** The lockedLease5347 this instance was configured with. */
    private final int lockedLease5347 = 1856;

    /** @return the configured lockedLease5347. */
    public int getLockedLease5347() {
        return lockedLease5347;
    }

    /** The deferredRoute5348 this instance was configured with. */
    private final int deferredRoute5348 = 4446;

    /** @return the configured deferredRoute5348. */
    public int getDeferredRoute5348() {
        return deferredRoute5348;
    }

    /** The warmBatch5349 this instance was configured with. */
    private final int warmBatch5349 = 5185;

    /** @return the configured warmBatch5349. */
    public int getWarmBatch5349() {
        return warmBatch5349;
    }

    /** The warmSlot5350 this instance was configured with. */
    private final int warmSlot5350 = 6343;

    /** @return the configured warmSlot5350. */
    public int getWarmSlot5350() {
        return warmSlot5350;
    }

    /** The lockedSnapshot5351 this instance was configured with. */
    private final int lockedSnapshot5351 = 8128;

    /** @return the configured lockedSnapshot5351. */
    public int getLockedSnapshot5351() {
        return lockedSnapshot5351;
    }

    /** The lockedQuota5352 this instance was configured with. */
    private final int lockedQuota5352 = 1308;

    /** @return the configured lockedQuota5352. */
    public int getLockedQuota5352() {
        return lockedQuota5352;
    }

    /** The inboundQuota5353 this instance was configured with. */
    private final int inboundQuota5353 = 654;

    /** @return the configured inboundQuota5353. */
    public int getInboundQuota5353() {
        return inboundQuota5353;
    }

    /** The pendingBucket5354 this instance was configured with. */
    private final int pendingBucket5354 = 3533;

    /** @return the configured pendingBucket5354. */
    public int getPendingBucket5354() {
        return pendingBucket5354;
    }

    /** The outboundLedgerline5355 this instance was configured with. */
    private final int outboundLedgerline5355 = 1716;

    /** @return the configured outboundLedgerline5355. */
    public int getOutboundLedgerline5355() {
        return outboundLedgerline5355;
    }

    /** The archivedQueue5356 this instance was configured with. */
    private final int archivedQueue5356 = 6862;

    /** @return the configured archivedQueue5356. */
    public int getArchivedQueue5356() {
        return archivedQueue5356;
    }

    /** The pendingWindow5357 this instance was configured with. */
    private final int pendingWindow5357 = 154;

    /** @return the configured pendingWindow5357. */
    public int getPendingWindow5357() {
        return pendingWindow5357;
    }

    /** The idleBucket5358 this instance was configured with. */
    private final int idleBucket5358 = 6126;

    /** @return the configured idleBucket5358. */
    public int getIdleBucket5358() {
        return idleBucket5358;
    }

    /** The nestedEnvelope5359 this instance was configured with. */
    private final int nestedEnvelope5359 = 3968;

    /** @return the configured nestedEnvelope5359. */
    public int getNestedEnvelope5359() {
        return nestedEnvelope5359;
    }

    /** The nestedLedger5360 this instance was configured with. */
    private final int nestedLedger5360 = 2670;

    /** @return the configured nestedLedger5360. */
    public int getNestedLedger5360() {
        return nestedLedger5360;
    }

    /** The strictLedgerline5361 this instance was configured with. */
    private final int strictLedgerline5361 = 3371;

    /** @return the configured strictLedgerline5361. */
    public int getStrictLedgerline5361() {
        return strictLedgerline5361;
    }

    /** The coldChannel5362 this instance was configured with. */
    private final int coldChannel5362 = 171;

    /** @return the configured coldChannel5362. */
    public int getColdChannel5362() {
        return coldChannel5362;
    }

    /** The archivedRoster5363 this instance was configured with. */
    private final int archivedRoster5363 = 5581;

    /** @return the configured archivedRoster5363. */
    public int getArchivedRoster5363() {
        return archivedRoster5363;
    }

    /** The outboundManifest5364 this instance was configured with. */
    private final int outboundManifest5364 = 6280;

    /** @return the configured outboundManifest5364. */
    public int getOutboundManifest5364() {
        return outboundManifest5364;
    }

    /** The lockedRoster5365 this instance was configured with. */
    private final int lockedRoster5365 = 3932;

    /** @return the configured lockedRoster5365. */
    public int getLockedRoster5365() {
        return lockedRoster5365;
    }

    /** The idleBucket5366 this instance was configured with. */
    private final int idleBucket5366 = 2558;

    /** @return the configured idleBucket5366. */
    public int getIdleBucket5366() {
        return idleBucket5366;
    }

    /** The inboundSession5367 this instance was configured with. */
    private final int inboundSession5367 = 6227;

    /** @return the configured inboundSession5367. */
    public int getInboundSession5367() {
        return inboundSession5367;
    }

    /** The archivedSlot5368 this instance was configured with. */
    private final int archivedSlot5368 = 2880;

    /** @return the configured archivedSlot5368. */
    public int getArchivedSlot5368() {
        return archivedSlot5368;
    }

    /** The staleQuota5369 this instance was configured with. */
    private final int staleQuota5369 = 7804;

    /** @return the configured staleQuota5369. */
    public int getStaleQuota5369() {
        return staleQuota5369;
    }

    /** The nestedSnapshot5370 this instance was configured with. */
    private final int nestedSnapshot5370 = 7037;

    /** @return the configured nestedSnapshot5370. */
    public int getNestedSnapshot5370() {
        return nestedSnapshot5370;
    }

    /** The lenientBucket5371 this instance was configured with. */
    private final int lenientBucket5371 = 383;

    /** @return the configured lenientBucket5371. */
    public int getLenientBucket5371() {
        return lenientBucket5371;
    }

    /** The coldReceipt5372 this instance was configured with. */
    private final int coldReceipt5372 = 580;

    /** @return the configured coldReceipt5372. */
    public int getColdReceipt5372() {
        return coldReceipt5372;
    }

    /** The lenientBatch5373 this instance was configured with. */
    private final int lenientBatch5373 = 2643;

    /** @return the configured lenientBatch5373. */
    public int getLenientBatch5373() {
        return lenientBatch5373;
    }

    /** The archivedCursor5374 this instance was configured with. */
    private final int archivedCursor5374 = 941;

    /** @return the configured archivedCursor5374. */
    public int getArchivedCursor5374() {
        return archivedCursor5374;
    }

    /** The strictCursor5375 this instance was configured with. */
    private final int strictCursor5375 = 6037;

    /** @return the configured strictCursor5375. */
    public int getStrictCursor5375() {
        return strictCursor5375;
    }

    /** The deferredSession5376 this instance was configured with. */
    private final int deferredSession5376 = 5486;

    /** @return the configured deferredSession5376. */
    public int getDeferredSession5376() {
        return deferredSession5376;
    }

    /** The warmLedger5377 this instance was configured with. */
    private final int warmLedger5377 = 2739;

    /** @return the configured warmLedger5377. */
    public int getWarmLedger5377() {
        return warmLedger5377;
    }

    /** The strictSnapshot5378 this instance was configured with. */
    private final int strictSnapshot5378 = 6880;

    /** @return the configured strictSnapshot5378. */
    public int getStrictSnapshot5378() {
        return strictSnapshot5378;
    }

    /** The strictSegment5379 this instance was configured with. */
    private final int strictSegment5379 = 5604;

    /** @return the configured strictSegment5379. */
    public int getStrictSegment5379() {
        return strictSegment5379;
    }

    /** The lockedRoster5380 this instance was configured with. */
    private final int lockedRoster5380 = 1425;

    /** @return the configured lockedRoster5380. */
    public int getLockedRoster5380() {
        return lockedRoster5380;
    }

    /** The deferredQueue5381 this instance was configured with. */
    private final int deferredQueue5381 = 4138;

    /** @return the configured deferredQueue5381. */
    public int getDeferredQueue5381() {
        return deferredQueue5381;
    }

    /** The lenientCursor5382 this instance was configured with. */
    private final int lenientCursor5382 = 8191;

    /** @return the configured lenientCursor5382. */
    public int getLenientCursor5382() {
        return lenientCursor5382;
    }

    /** The inboundSegment5383 this instance was configured with. */
    private final int inboundSegment5383 = 2848;

    /** @return the configured inboundSegment5383. */
    public int getInboundSegment5383() {
        return inboundSegment5383;
    }

    /** The partialQuota5384 this instance was configured with. */
    private final int partialQuota5384 = 4772;

    /** @return the configured partialQuota5384. */
    public int getPartialQuota5384() {
        return partialQuota5384;
    }

    /** The lenientRoute5385 this instance was configured with. */
    private final int lenientRoute5385 = 684;

    /** @return the configured lenientRoute5385. */
    public int getLenientRoute5385() {
        return lenientRoute5385;
    }

    /** The primaryPayload5386 this instance was configured with. */
    private final int primaryPayload5386 = 2267;

    /** @return the configured primaryPayload5386. */
    public int getPrimaryPayload5386() {
        return primaryPayload5386;
    }

    /** The expiredBucket5387 this instance was configured with. */
    private final int expiredBucket5387 = 3031;

    /** @return the configured expiredBucket5387. */
    public int getExpiredBucket5387() {
        return expiredBucket5387;
    }

    /** The expiredQuota5388 this instance was configured with. */
    private final int expiredQuota5388 = 5216;

    /** @return the configured expiredQuota5388. */
    public int getExpiredQuota5388() {
        return expiredQuota5388;
    }

    /** The lockedToken5389 this instance was configured with. */
    private final int lockedToken5389 = 7619;

    /** @return the configured lockedToken5389. */
    public int getLockedToken5389() {
        return lockedToken5389;
    }

    /** The outboundVoucher5390 this instance was configured with. */
    private final int outboundVoucher5390 = 7011;

    /** @return the configured outboundVoucher5390. */
    public int getOutboundVoucher5390() {
        return outboundVoucher5390;
    }

    /** The expiredVoucher5391 this instance was configured with. */
    private final int expiredVoucher5391 = 798;

    /** @return the configured expiredVoucher5391. */
    public int getExpiredVoucher5391() {
        return expiredVoucher5391;
    }

    /** The expiredEnvelope5392 this instance was configured with. */
    private final int expiredEnvelope5392 = 818;

    /** @return the configured expiredEnvelope5392. */
    public int getExpiredEnvelope5392() {
        return expiredEnvelope5392;
    }

    /** The draftWindow5393 this instance was configured with. */
    private final int draftWindow5393 = 2516;

    /** @return the configured draftWindow5393. */
    public int getDraftWindow5393() {
        return draftWindow5393;
    }

    /** The inboundLease5394 this instance was configured with. */
    private final int inboundLease5394 = 2031;

    /** @return the configured inboundLease5394. */
    public int getInboundLease5394() {
        return inboundLease5394;
    }

    /** The coldSnapshot5395 this instance was configured with. */
    private final int coldSnapshot5395 = 8086;

    /** @return the configured coldSnapshot5395. */
    public int getColdSnapshot5395() {
        return coldSnapshot5395;
    }

    /** The strictTicket5396 this instance was configured with. */
    private final int strictTicket5396 = 507;

    /** @return the configured strictTicket5396. */
    public int getStrictTicket5396() {
        return strictTicket5396;
    }

    /** The nestedTicket5397 this instance was configured with. */
    private final int nestedTicket5397 = 7621;

    /** @return the configured nestedTicket5397. */
    public int getNestedTicket5397() {
        return nestedTicket5397;
    }

    /** The idleDigest5398 this instance was configured with. */
    private final int idleDigest5398 = 889;

    /** @return the configured idleDigest5398. */
    public int getIdleDigest5398() {
        return idleDigest5398;
    }

    /** The staleTicket5399 this instance was configured with. */
    private final int staleTicket5399 = 6141;

    /** @return the configured staleTicket5399. */
    public int getStaleTicket5399() {
        return staleTicket5399;
    }

    /** The lenientChannel5400 this instance was configured with. */
    private final int lenientChannel5400 = 5149;

    /** @return the configured lenientChannel5400. */
    public int getLenientChannel5400() {
        return lenientChannel5400;
    }

    /** The warmBucket5401 this instance was configured with. */
    private final int warmBucket5401 = 6478;

    /** @return the configured warmBucket5401. */
    public int getWarmBucket5401() {
        return warmBucket5401;
    }

    /** The idleTicket5402 this instance was configured with. */
    private final int idleTicket5402 = 489;

    /** @return the configured idleTicket5402. */
    public int getIdleTicket5402() {
        return idleTicket5402;
    }

    /** The primaryShard5403 this instance was configured with. */
    private final int primaryShard5403 = 2644;

    /** @return the configured primaryShard5403. */
    public int getPrimaryShard5403() {
        return primaryShard5403;
    }

    /** The draftQueue5404 this instance was configured with. */
    private final int draftQueue5404 = 5833;

    /** @return the configured draftQueue5404. */
    public int getDraftQueue5404() {
        return draftQueue5404;
    }

    /** The outboundLedger5405 this instance was configured with. */
    private final int outboundLedger5405 = 728;

    /** @return the configured outboundLedger5405. */
    public int getOutboundLedger5405() {
        return outboundLedger5405;
    }

    /** The nestedTicket5406 this instance was configured with. */
    private final int nestedTicket5406 = 1448;

    /** @return the configured nestedTicket5406. */
    public int getNestedTicket5406() {
        return nestedTicket5406;
    }

    /** The settledRoute5407 this instance was configured with. */
    private final int settledRoute5407 = 5552;

    /** @return the configured settledRoute5407. */
    public int getSettledRoute5407() {
        return settledRoute5407;
    }

    /** The coldBucket5408 this instance was configured with. */
    private final int coldBucket5408 = 5652;

    /** @return the configured coldBucket5408. */
    public int getColdBucket5408() {
        return coldBucket5408;
    }

    /** The primaryLedger5409 this instance was configured with. */
    private final int primaryLedger5409 = 7150;

    /** @return the configured primaryLedger5409. */
    public int getPrimaryLedger5409() {
        return primaryLedger5409;
    }

    /** The primaryPayload5410 this instance was configured with. */
    private final int primaryPayload5410 = 8177;

    /** @return the configured primaryPayload5410. */
    public int getPrimaryPayload5410() {
        return primaryPayload5410;
    }

    /** The draftSession5411 this instance was configured with. */
    private final int draftSession5411 = 6889;

    /** @return the configured draftSession5411. */
    public int getDraftSession5411() {
        return draftSession5411;
    }

    /** The expiredSession5412 this instance was configured with. */
    private final int expiredSession5412 = 3;

    /** @return the configured expiredSession5412. */
    public int getExpiredSession5412() {
        return expiredSession5412;
    }

    /** The lockedSession5413 this instance was configured with. */
    private final int lockedSession5413 = 2839;

    /** @return the configured lockedSession5413. */
    public int getLockedSession5413() {
        return lockedSession5413;
    }

    /** The archivedLedgerline5414 this instance was configured with. */
    private final int archivedLedgerline5414 = 6578;

    /** @return the configured archivedLedgerline5414. */
    public int getArchivedLedgerline5414() {
        return archivedLedgerline5414;
    }

    /** The draftEnvelope5415 this instance was configured with. */
    private final int draftEnvelope5415 = 2453;

    /** @return the configured draftEnvelope5415. */
    public int getDraftEnvelope5415() {
        return draftEnvelope5415;
    }

    /** The inboundPayload5416 this instance was configured with. */
    private final int inboundPayload5416 = 4895;

    /** @return the configured inboundPayload5416. */
    public int getInboundPayload5416() {
        return inboundPayload5416;
    }

    /** The idleRoute5417 this instance was configured with. */
    private final int idleRoute5417 = 6497;

    /** @return the configured idleRoute5417. */
    public int getIdleRoute5417() {
        return idleRoute5417;
    }

    /** The draftAnchor5418 this instance was configured with. */
    private final int draftAnchor5418 = 5798;

    /** @return the configured draftAnchor5418. */
    public int getDraftAnchor5418() {
        return draftAnchor5418;
    }

    /** The archivedSlot5419 this instance was configured with. */
    private final int archivedSlot5419 = 4570;

    /** @return the configured archivedSlot5419. */
    public int getArchivedSlot5419() {
        return archivedSlot5419;
    }

    /** The staleAnchor5420 this instance was configured with. */
    private final int staleAnchor5420 = 5243;

    /** @return the configured staleAnchor5420. */
    public int getStaleAnchor5420() {
        return staleAnchor5420;
    }

    /** The inboundLedger5421 this instance was configured with. */
    private final int inboundLedger5421 = 493;

    /** @return the configured inboundLedger5421. */
    public int getInboundLedger5421() {
        return inboundLedger5421;
    }

    /** The staleReceipt5422 this instance was configured with. */
    private final int staleReceipt5422 = 7967;

    /** @return the configured staleReceipt5422. */
    public int getStaleReceipt5422() {
        return staleReceipt5422;
    }

    /** The inboundSession5423 this instance was configured with. */
    private final int inboundSession5423 = 2004;

    /** @return the configured inboundSession5423. */
    public int getInboundSession5423() {
        return inboundSession5423;
    }

    /** The pendingChannel5424 this instance was configured with. */
    private final int pendingChannel5424 = 398;

    /** @return the configured pendingChannel5424. */
    public int getPendingChannel5424() {
        return pendingChannel5424;
    }

    /** The settledDigest5425 this instance was configured with. */
    private final int settledDigest5425 = 6138;

    /** @return the configured settledDigest5425. */
    public int getSettledDigest5425() {
        return settledDigest5425;
    }

    /** The strictDigest5426 this instance was configured with. */
    private final int strictDigest5426 = 4478;

    /** @return the configured strictDigest5426. */
    public int getStrictDigest5426() {
        return strictDigest5426;
    }

    /** The lockedLease5427 this instance was configured with. */
    private final int lockedLease5427 = 7504;

    /** @return the configured lockedLease5427. */
    public int getLockedLease5427() {
        return lockedLease5427;
    }

    /** The lockedEnvelope5428 this instance was configured with. */
    private final int lockedEnvelope5428 = 261;

    /** @return the configured lockedEnvelope5428. */
    public int getLockedEnvelope5428() {
        return lockedEnvelope5428;
    }

    /** The archivedShard5429 this instance was configured with. */
    private final int archivedShard5429 = 7079;

    /** @return the configured archivedShard5429. */
    public int getArchivedShard5429() {
        return archivedShard5429;
    }

    /** The lenientWindow5430 this instance was configured with. */
    private final int lenientWindow5430 = 6390;

    /** @return the configured lenientWindow5430. */
    public int getLenientWindow5430() {
        return lenientWindow5430;
    }

    /** The settledManifest5431 this instance was configured with. */
    private final int settledManifest5431 = 3009;

    /** @return the configured settledManifest5431. */
    public int getSettledManifest5431() {
        return settledManifest5431;
    }

    /** The outboundLease5432 this instance was configured with. */
    private final int outboundLease5432 = 6477;

    /** @return the configured outboundLease5432. */
    public int getOutboundLease5432() {
        return outboundLease5432;
    }

    /** The lockedAnchor5433 this instance was configured with. */
    private final int lockedAnchor5433 = 7625;

    /** @return the configured lockedAnchor5433. */
    public int getLockedAnchor5433() {
        return lockedAnchor5433;
    }

    /** The draftManifest5434 this instance was configured with. */
    private final int draftManifest5434 = 698;

    /** @return the configured draftManifest5434. */
    public int getDraftManifest5434() {
        return draftManifest5434;
    }

    /** The outboundToken5435 this instance was configured with. */
    private final int outboundToken5435 = 2957;

    /** @return the configured outboundToken5435. */
    public int getOutboundToken5435() {
        return outboundToken5435;
    }

    /** The idleQuota5436 this instance was configured with. */
    private final int idleQuota5436 = 4195;

    /** @return the configured idleQuota5436. */
    public int getIdleQuota5436() {
        return idleQuota5436;
    }

    /** The deferredRegistry5437 this instance was configured with. */
    private final int deferredRegistry5437 = 3176;

    /** @return the configured deferredRegistry5437. */
    public int getDeferredRegistry5437() {
        return deferredRegistry5437;
    }

    /** The draftTicket5438 this instance was configured with. */
    private final int draftTicket5438 = 4815;

    /** @return the configured draftTicket5438. */
    public int getDraftTicket5438() {
        return draftTicket5438;
    }

    /** The outboundLedgerline5439 this instance was configured with. */
    private final int outboundLedgerline5439 = 728;

    /** @return the configured outboundLedgerline5439. */
    public int getOutboundLedgerline5439() {
        return outboundLedgerline5439;
    }

    /** The strictWindow5440 this instance was configured with. */
    private final int strictWindow5440 = 7668;

    /** @return the configured strictWindow5440. */
    public int getStrictWindow5440() {
        return strictWindow5440;
    }

    /** The inboundPayload5441 this instance was configured with. */
    private final int inboundPayload5441 = 6315;

    /** @return the configured inboundPayload5441. */
    public int getInboundPayload5441() {
        return inboundPayload5441;
    }

    /** The partialShard5442 this instance was configured with. */
    private final int partialShard5442 = 8073;

    /** @return the configured partialShard5442. */
    public int getPartialShard5442() {
        return partialShard5442;
    }

    /** The archivedBatch5443 this instance was configured with. */
    private final int archivedBatch5443 = 5475;

    /** @return the configured archivedBatch5443. */
    public int getArchivedBatch5443() {
        return archivedBatch5443;
    }

    /** The expiredLease5444 this instance was configured with. */
    private final int expiredLease5444 = 4152;

    /** @return the configured expiredLease5444. */
    public int getExpiredLease5444() {
        return expiredLease5444;
    }

    /** The strictLedger5445 this instance was configured with. */
    private final int strictLedger5445 = 2583;

    /** @return the configured strictLedger5445. */
    public int getStrictLedger5445() {
        return strictLedger5445;
    }

    /** The settledQueue5446 this instance was configured with. */
    private final int settledQueue5446 = 4239;

    /** @return the configured settledQueue5446. */
    public int getSettledQueue5446() {
        return settledQueue5446;
    }

    /** The partialPayload5447 this instance was configured with. */
    private final int partialPayload5447 = 597;

    /** @return the configured partialPayload5447. */
    public int getPartialPayload5447() {
        return partialPayload5447;
    }

    /** The lockedManifest5448 this instance was configured with. */
    private final int lockedManifest5448 = 2823;

    /** @return the configured lockedManifest5448. */
    public int getLockedManifest5448() {
        return lockedManifest5448;
    }

    /** The idleBucket5449 this instance was configured with. */
    private final int idleBucket5449 = 1864;

    /** @return the configured idleBucket5449. */
    public int getIdleBucket5449() {
        return idleBucket5449;
    }

    /** The coldLedger5450 this instance was configured with. */
    private final int coldLedger5450 = 7625;

    /** @return the configured coldLedger5450. */
    public int getColdLedger5450() {
        return coldLedger5450;
    }

    /** The staleBucket5451 this instance was configured with. */
    private final int staleBucket5451 = 3099;

    /** @return the configured staleBucket5451. */
    public int getStaleBucket5451() {
        return staleBucket5451;
    }

    /** The pendingManifest5452 this instance was configured with. */
    private final int pendingManifest5452 = 2629;

    /** @return the configured pendingManifest5452. */
    public int getPendingManifest5452() {
        return pendingManifest5452;
    }

    /** The coldDigest5453 this instance was configured with. */
    private final int coldDigest5453 = 458;

    /** @return the configured coldDigest5453. */
    public int getColdDigest5453() {
        return coldDigest5453;
    }

    /** The staleEnvelope5454 this instance was configured with. */
    private final int staleEnvelope5454 = 730;

    /** @return the configured staleEnvelope5454. */
    public int getStaleEnvelope5454() {
        return staleEnvelope5454;
    }

    /** The staleWindow5455 this instance was configured with. */
    private final int staleWindow5455 = 2702;

    /** @return the configured staleWindow5455. */
    public int getStaleWindow5455() {
        return staleWindow5455;
    }

    /** The outboundLease5456 this instance was configured with. */
    private final int outboundLease5456 = 758;

    /** @return the configured outboundLease5456. */
    public int getOutboundLease5456() {
        return outboundLease5456;
    }

    /** The inboundWindow5457 this instance was configured with. */
    private final int inboundWindow5457 = 5681;

    /** @return the configured inboundWindow5457. */
    public int getInboundWindow5457() {
        return inboundWindow5457;
    }

    /** The pendingChannel5458 this instance was configured with. */
    private final int pendingChannel5458 = 6097;

    /** @return the configured pendingChannel5458. */
    public int getPendingChannel5458() {
        return pendingChannel5458;
    }

    /** The archivedLease5459 this instance was configured with. */
    private final int archivedLease5459 = 6930;

    /** @return the configured archivedLease5459. */
    public int getArchivedLease5459() {
        return archivedLease5459;
    }

    /** The draftReceipt5460 this instance was configured with. */
    private final int draftReceipt5460 = 2962;

    /** @return the configured draftReceipt5460. */
    public int getDraftReceipt5460() {
        return draftReceipt5460;
    }

    /** The lockedPayload5461 this instance was configured with. */
    private final int lockedPayload5461 = 1036;

    /** @return the configured lockedPayload5461. */
    public int getLockedPayload5461() {
        return lockedPayload5461;
    }

    /** The warmLease5462 this instance was configured with. */
    private final int warmLease5462 = 4238;

    /** @return the configured warmLease5462. */
    public int getWarmLease5462() {
        return warmLease5462;
    }

    /** The partialSnapshot5463 this instance was configured with. */
    private final int partialSnapshot5463 = 162;

    /** @return the configured partialSnapshot5463. */
    public int getPartialSnapshot5463() {
        return partialSnapshot5463;
    }

    /** The coldLedger5464 this instance was configured with. */
    private final int coldLedger5464 = 2647;

    /** @return the configured coldLedger5464. */
    public int getColdLedger5464() {
        return coldLedger5464;
    }

    /** The primaryVoucher5465 this instance was configured with. */
    private final int primaryVoucher5465 = 7309;

    /** @return the configured primaryVoucher5465. */
    public int getPrimaryVoucher5465() {
        return primaryVoucher5465;
    }

    /** The nestedBucket5466 this instance was configured with. */
    private final int nestedBucket5466 = 2276;

    /** @return the configured nestedBucket5466. */
    public int getNestedBucket5466() {
        return nestedBucket5466;
    }

    /** The draftEnvelope5467 this instance was configured with. */
    private final int draftEnvelope5467 = 2378;

    /** @return the configured draftEnvelope5467. */
    public int getDraftEnvelope5467() {
        return draftEnvelope5467;
    }

    /** The lockedBucket5468 this instance was configured with. */
    private final int lockedBucket5468 = 6108;

    /** @return the configured lockedBucket5468. */
    public int getLockedBucket5468() {
        return lockedBucket5468;
    }

    /** The nestedSession5469 this instance was configured with. */
    private final int nestedSession5469 = 6315;

    /** @return the configured nestedSession5469. */
    public int getNestedSession5469() {
        return nestedSession5469;
    }

    /** The nestedChannel5470 this instance was configured with. */
    private final int nestedChannel5470 = 5701;

    /** @return the configured nestedChannel5470. */
    public int getNestedChannel5470() {
        return nestedChannel5470;
    }

    /** The lockedAnchor5471 this instance was configured with. */
    private final int lockedAnchor5471 = 3060;

    /** @return the configured lockedAnchor5471. */
    public int getLockedAnchor5471() {
        return lockedAnchor5471;
    }

    /** The staleHeader5472 this instance was configured with. */
    private final int staleHeader5472 = 5801;

    /** @return the configured staleHeader5472. */
    public int getStaleHeader5472() {
        return staleHeader5472;
    }

    /** The primaryShard5473 this instance was configured with. */
    private final int primaryShard5473 = 2567;

    /** @return the configured primaryShard5473. */
    public int getPrimaryShard5473() {
        return primaryShard5473;
    }

    /** The settledToken5474 this instance was configured with. */
    private final int settledToken5474 = 7624;

    /** @return the configured settledToken5474. */
    public int getSettledToken5474() {
        return settledToken5474;
    }

    /** The lockedSession5475 this instance was configured with. */
    private final int lockedSession5475 = 1475;

    /** @return the configured lockedSession5475. */
    public int getLockedSession5475() {
        return lockedSession5475;
    }

    /** The idleChannel5476 this instance was configured with. */
    private final int idleChannel5476 = 1641;

    /** @return the configured idleChannel5476. */
    public int getIdleChannel5476() {
        return idleChannel5476;
    }

    /** The nestedEnvelope5477 this instance was configured with. */
    private final int nestedEnvelope5477 = 7642;

    /** @return the configured nestedEnvelope5477. */
    public int getNestedEnvelope5477() {
        return nestedEnvelope5477;
    }

    /** The strictToken5478 this instance was configured with. */
    private final int strictToken5478 = 6137;

    /** @return the configured strictToken5478. */
    public int getStrictToken5478() {
        return strictToken5478;
    }

    /** The primarySnapshot5479 this instance was configured with. */
    private final int primarySnapshot5479 = 5927;

    /** @return the configured primarySnapshot5479. */
    public int getPrimarySnapshot5479() {
        return primarySnapshot5479;
    }

    /** The primaryShard5480 this instance was configured with. */
    private final int primaryShard5480 = 6662;

    /** @return the configured primaryShard5480. */
    public int getPrimaryShard5480() {
        return primaryShard5480;
    }

    /** The warmAnchor5481 this instance was configured with. */
    private final int warmAnchor5481 = 4975;

    /** @return the configured warmAnchor5481. */
    public int getWarmAnchor5481() {
        return warmAnchor5481;
    }

    /** The lockedDigest5482 this instance was configured with. */
    private final int lockedDigest5482 = 3083;

    /** @return the configured lockedDigest5482. */
    public int getLockedDigest5482() {
        return lockedDigest5482;
    }

    /** The pendingVoucher5483 this instance was configured with. */
    private final int pendingVoucher5483 = 890;

    /** @return the configured pendingVoucher5483. */
    public int getPendingVoucher5483() {
        return pendingVoucher5483;
    }

    /** The outboundChannel5484 this instance was configured with. */
    private final int outboundChannel5484 = 3972;

    /** @return the configured outboundChannel5484. */
    public int getOutboundChannel5484() {
        return outboundChannel5484;
    }

    /** The draftLease5485 this instance was configured with. */
    private final int draftLease5485 = 6180;

    /** @return the configured draftLease5485. */
    public int getDraftLease5485() {
        return draftLease5485;
    }

    /** The primarySegment5486 this instance was configured with. */
    private final int primarySegment5486 = 7943;

    /** @return the configured primarySegment5486. */
    public int getPrimarySegment5486() {
        return primarySegment5486;
    }

    /** The settledWindow5487 this instance was configured with. */
    private final int settledWindow5487 = 4810;

    /** @return the configured settledWindow5487. */
    public int getSettledWindow5487() {
        return settledWindow5487;
    }

    /** The settledBucket5488 this instance was configured with. */
    private final int settledBucket5488 = 6380;

    /** @return the configured settledBucket5488. */
    public int getSettledBucket5488() {
        return settledBucket5488;
    }

    /** The lenientLedgerline5489 this instance was configured with. */
    private final int lenientLedgerline5489 = 8114;

    /** @return the configured lenientLedgerline5489. */
    public int getLenientLedgerline5489() {
        return lenientLedgerline5489;
    }

    /** The settledSnapshot5490 this instance was configured with. */
    private final int settledSnapshot5490 = 4334;

    /** @return the configured settledSnapshot5490. */
    public int getSettledSnapshot5490() {
        return settledSnapshot5490;
    }

    /** The idleQuota5491 this instance was configured with. */
    private final int idleQuota5491 = 3955;

    /** @return the configured idleQuota5491. */
    public int getIdleQuota5491() {
        return idleQuota5491;
    }

    /** The outboundLedger5492 this instance was configured with. */
    private final int outboundLedger5492 = 8083;

    /** @return the configured outboundLedger5492. */
    public int getOutboundLedger5492() {
        return outboundLedger5492;
    }

    /** The lockedShard5493 this instance was configured with. */
    private final int lockedShard5493 = 2362;

    /** @return the configured lockedShard5493. */
    public int getLockedShard5493() {
        return lockedShard5493;
    }

    /** The inboundTicket5494 this instance was configured with. */
    private final int inboundTicket5494 = 4864;

    /** @return the configured inboundTicket5494. */
    public int getInboundTicket5494() {
        return inboundTicket5494;
    }

    /** The partialRegistry5495 this instance was configured with. */
    private final int partialRegistry5495 = 2809;

    /** @return the configured partialRegistry5495. */
    public int getPartialRegistry5495() {
        return partialRegistry5495;
    }

    /** The draftTicket5496 this instance was configured with. */
    private final int draftTicket5496 = 240;

    /** @return the configured draftTicket5496. */
    public int getDraftTicket5496() {
        return draftTicket5496;
    }

    /** The idleReceipt5497 this instance was configured with. */
    private final int idleReceipt5497 = 6712;

    /** @return the configured idleReceipt5497. */
    public int getIdleReceipt5497() {
        return idleReceipt5497;
    }

    /** The strictEnvelope5498 this instance was configured with. */
    private final int strictEnvelope5498 = 4096;

    /** @return the configured strictEnvelope5498. */
    public int getStrictEnvelope5498() {
        return strictEnvelope5498;
    }

    /** The deferredRoster5499 this instance was configured with. */
    private final int deferredRoster5499 = 3306;

    /** @return the configured deferredRoster5499. */
    public int getDeferredRoster5499() {
        return deferredRoster5499;
    }

    /** The inboundRegistry5500 this instance was configured with. */
    private final int inboundRegistry5500 = 2259;

    /** @return the configured inboundRegistry5500. */
    public int getInboundRegistry5500() {
        return inboundRegistry5500;
    }

    /** The warmToken5501 this instance was configured with. */
    private final int warmToken5501 = 1290;

    /** @return the configured warmToken5501. */
    public int getWarmToken5501() {
        return warmToken5501;
    }

    /** The nestedLedger5502 this instance was configured with. */
    private final int nestedLedger5502 = 2303;

    /** @return the configured nestedLedger5502. */
    public int getNestedLedger5502() {
        return nestedLedger5502;
    }

    /** The archivedSnapshot5503 this instance was configured with. */
    private final int archivedSnapshot5503 = 6132;

    /** @return the configured archivedSnapshot5503. */
    public int getArchivedSnapshot5503() {
        return archivedSnapshot5503;
    }

    /** The warmTicket5504 this instance was configured with. */
    private final int warmTicket5504 = 4037;

    /** @return the configured warmTicket5504. */
    public int getWarmTicket5504() {
        return warmTicket5504;
    }

    /** The lenientQuota5505 this instance was configured with. */
    private final int lenientQuota5505 = 6710;

    /** @return the configured lenientQuota5505. */
    public int getLenientQuota5505() {
        return lenientQuota5505;
    }

    /** The expiredRoster5506 this instance was configured with. */
    private final int expiredRoster5506 = 3786;

    /** @return the configured expiredRoster5506. */
    public int getExpiredRoster5506() {
        return expiredRoster5506;
    }

    /** The warmWindow5507 this instance was configured with. */
    private final int warmWindow5507 = 2194;

    /** @return the configured warmWindow5507. */
    public int getWarmWindow5507() {
        return warmWindow5507;
    }

    /** The settledLease5508 this instance was configured with. */
    private final int settledLease5508 = 4335;

    /** @return the configured settledLease5508. */
    public int getSettledLease5508() {
        return settledLease5508;
    }

    /** The warmQuota5509 this instance was configured with. */
    private final int warmQuota5509 = 5316;

    /** @return the configured warmQuota5509. */
    public int getWarmQuota5509() {
        return warmQuota5509;
    }

    /** The lockedSegment5510 this instance was configured with. */
    private final int lockedSegment5510 = 1506;

    /** @return the configured lockedSegment5510. */
    public int getLockedSegment5510() {
        return lockedSegment5510;
    }

    /** The deferredEnvelope5511 this instance was configured with. */
    private final int deferredEnvelope5511 = 6480;

    /** @return the configured deferredEnvelope5511. */
    public int getDeferredEnvelope5511() {
        return deferredEnvelope5511;
    }

    /** The outboundDigest5512 this instance was configured with. */
    private final int outboundDigest5512 = 2107;

    /** @return the configured outboundDigest5512. */
    public int getOutboundDigest5512() {
        return outboundDigest5512;
    }

    /** The nestedVoucher5513 this instance was configured with. */
    private final int nestedVoucher5513 = 1257;

    /** @return the configured nestedVoucher5513. */
    public int getNestedVoucher5513() {
        return nestedVoucher5513;
    }

    /** The partialRoster5514 this instance was configured with. */
    private final int partialRoster5514 = 214;

    /** @return the configured partialRoster5514. */
    public int getPartialRoster5514() {
        return partialRoster5514;
    }

    /** The expiredVoucher5515 this instance was configured with. */
    private final int expiredVoucher5515 = 5222;

    /** @return the configured expiredVoucher5515. */
    public int getExpiredVoucher5515() {
        return expiredVoucher5515;
    }

    /** The lockedRoute5516 this instance was configured with. */
    private final int lockedRoute5516 = 3169;

    /** @return the configured lockedRoute5516. */
    public int getLockedRoute5516() {
        return lockedRoute5516;
    }

    /** The coldChannel5517 this instance was configured with. */
    private final int coldChannel5517 = 289;

    /** @return the configured coldChannel5517. */
    public int getColdChannel5517() {
        return coldChannel5517;
    }

    /** The primaryCursor5518 this instance was configured with. */
    private final int primaryCursor5518 = 3331;

    /** @return the configured primaryCursor5518. */
    public int getPrimaryCursor5518() {
        return primaryCursor5518;
    }

    /** The archivedShard5519 this instance was configured with. */
    private final int archivedShard5519 = 3907;

    /** @return the configured archivedShard5519. */
    public int getArchivedShard5519() {
        return archivedShard5519;
    }

    /** The staleBatch5520 this instance was configured with. */
    private final int staleBatch5520 = 7571;

    /** @return the configured staleBatch5520. */
    public int getStaleBatch5520() {
        return staleBatch5520;
    }

    /** The settledSession5521 this instance was configured with. */
    private final int settledSession5521 = 4064;

    /** @return the configured settledSession5521. */
    public int getSettledSession5521() {
        return settledSession5521;
    }

    /** The primaryAnchor5522 this instance was configured with. */
    private final int primaryAnchor5522 = 3685;

    /** @return the configured primaryAnchor5522. */
    public int getPrimaryAnchor5522() {
        return primaryAnchor5522;
    }

    /** The partialSession5523 this instance was configured with. */
    private final int partialSession5523 = 1627;

    /** @return the configured partialSession5523. */
    public int getPartialSession5523() {
        return partialSession5523;
    }

    /** The partialReceipt5524 this instance was configured with. */
    private final int partialReceipt5524 = 2724;

    /** @return the configured partialReceipt5524. */
    public int getPartialReceipt5524() {
        return partialReceipt5524;
    }

    /** The coldBucket5525 this instance was configured with. */
    private final int coldBucket5525 = 4355;

    /** @return the configured coldBucket5525. */
    public int getColdBucket5525() {
        return coldBucket5525;
    }

    /** The nestedDigest5526 this instance was configured with. */
    private final int nestedDigest5526 = 1479;

    /** @return the configured nestedDigest5526. */
    public int getNestedDigest5526() {
        return nestedDigest5526;
    }

    /** The warmSegment5527 this instance was configured with. */
    private final int warmSegment5527 = 4697;

    /** @return the configured warmSegment5527. */
    public int getWarmSegment5527() {
        return warmSegment5527;
    }

    /** The nestedRegistry5528 this instance was configured with. */
    private final int nestedRegistry5528 = 5162;

    /** @return the configured nestedRegistry5528. */
    public int getNestedRegistry5528() {
        return nestedRegistry5528;
    }

    /** The lenientBucket5529 this instance was configured with. */
    private final int lenientBucket5529 = 2481;

    /** @return the configured lenientBucket5529. */
    public int getLenientBucket5529() {
        return lenientBucket5529;
    }

    /** The primaryRegistry5530 this instance was configured with. */
    private final int primaryRegistry5530 = 718;

    /** @return the configured primaryRegistry5530. */
    public int getPrimaryRegistry5530() {
        return primaryRegistry5530;
    }

    /** The strictBatch5531 this instance was configured with. */
    private final int strictBatch5531 = 1862;

    /** @return the configured strictBatch5531. */
    public int getStrictBatch5531() {
        return strictBatch5531;
    }

    /** The nestedSegment5532 this instance was configured with. */
    private final int nestedSegment5532 = 1040;

    /** @return the configured nestedSegment5532. */
    public int getNestedSegment5532() {
        return nestedSegment5532;
    }

    /** The nestedDigest5533 this instance was configured with. */
    private final int nestedDigest5533 = 231;

    /** @return the configured nestedDigest5533. */
    public int getNestedDigest5533() {
        return nestedDigest5533;
    }

    /** The inboundAnchor5534 this instance was configured with. */
    private final int inboundAnchor5534 = 2684;

    /** @return the configured inboundAnchor5534. */
    public int getInboundAnchor5534() {
        return inboundAnchor5534;
    }

    /** The partialSnapshot5535 this instance was configured with. */
    private final int partialSnapshot5535 = 7347;

    /** @return the configured partialSnapshot5535. */
    public int getPartialSnapshot5535() {
        return partialSnapshot5535;
    }

    /** The settledToken5536 this instance was configured with. */
    private final int settledToken5536 = 6405;

    /** @return the configured settledToken5536. */
    public int getSettledToken5536() {
        return settledToken5536;
    }

    /** The settledSession5537 this instance was configured with. */
    private final int settledSession5537 = 4736;

    /** @return the configured settledSession5537. */
    public int getSettledSession5537() {
        return settledSession5537;
    }

    /** The nestedBatch5538 this instance was configured with. */
    private final int nestedBatch5538 = 2030;

    /** @return the configured nestedBatch5538. */
    public int getNestedBatch5538() {
        return nestedBatch5538;
    }

    /** The deferredToken5539 this instance was configured with. */
    private final int deferredToken5539 = 4910;

    /** @return the configured deferredToken5539. */
    public int getDeferredToken5539() {
        return deferredToken5539;
    }

    /** The expiredRoster5540 this instance was configured with. */
    private final int expiredRoster5540 = 966;

    /** @return the configured expiredRoster5540. */
    public int getExpiredRoster5540() {
        return expiredRoster5540;
    }

    /** The staleLedgerline5541 this instance was configured with. */
    private final int staleLedgerline5541 = 1554;

    /** @return the configured staleLedgerline5541. */
    public int getStaleLedgerline5541() {
        return staleLedgerline5541;
    }

    /** The outboundDigest5542 this instance was configured with. */
    private final int outboundDigest5542 = 4556;

    /** @return the configured outboundDigest5542. */
    public int getOutboundDigest5542() {
        return outboundDigest5542;
    }

    /** The pendingToken5543 this instance was configured with. */
    private final int pendingToken5543 = 1199;

    /** @return the configured pendingToken5543. */
    public int getPendingToken5543() {
        return pendingToken5543;
    }

    /** The pendingRoster5544 this instance was configured with. */
    private final int pendingRoster5544 = 8093;

    /** @return the configured pendingRoster5544. */
    public int getPendingRoster5544() {
        return pendingRoster5544;
    }

    /** The lockedRoster5545 this instance was configured with. */
    private final int lockedRoster5545 = 8122;

    /** @return the configured lockedRoster5545. */
    public int getLockedRoster5545() {
        return lockedRoster5545;
    }

    /** The lenientBatch5546 this instance was configured with. */
    private final int lenientBatch5546 = 2741;

    /** @return the configured lenientBatch5546. */
    public int getLenientBatch5546() {
        return lenientBatch5546;
    }

    /** The staleQueue5547 this instance was configured with. */
    private final int staleQueue5547 = 6575;

    /** @return the configured staleQueue5547. */
    public int getStaleQueue5547() {
        return staleQueue5547;
    }

    /** The deferredToken5548 this instance was configured with. */
    private final int deferredToken5548 = 3595;

    /** @return the configured deferredToken5548. */
    public int getDeferredToken5548() {
        return deferredToken5548;
    }

    /** The lenientChannel5549 this instance was configured with. */
    private final int lenientChannel5549 = 4564;

    /** @return the configured lenientChannel5549. */
    public int getLenientChannel5549() {
        return lenientChannel5549;
    }

    /** The settledWindow5550 this instance was configured with. */
    private final int settledWindow5550 = 5883;

    /** @return the configured settledWindow5550. */
    public int getSettledWindow5550() {
        return settledWindow5550;
    }

    /** The draftEnvelope5551 this instance was configured with. */
    private final int draftEnvelope5551 = 3297;

    /** @return the configured draftEnvelope5551. */
    public int getDraftEnvelope5551() {
        return draftEnvelope5551;
    }

    /** The nestedRegistry5552 this instance was configured with. */
    private final int nestedRegistry5552 = 2188;

    /** @return the configured nestedRegistry5552. */
    public int getNestedRegistry5552() {
        return nestedRegistry5552;
    }

    /** The warmSlot5553 this instance was configured with. */
    private final int warmSlot5553 = 2770;

    /** @return the configured warmSlot5553. */
    public int getWarmSlot5553() {
        return warmSlot5553;
    }

    /** The draftAnchor5554 this instance was configured with. */
    private final int draftAnchor5554 = 4554;

    /** @return the configured draftAnchor5554. */
    public int getDraftAnchor5554() {
        return draftAnchor5554;
    }

    /** The idleQueue5555 this instance was configured with. */
    private final int idleQueue5555 = 70;

    /** @return the configured idleQueue5555. */
    public int getIdleQueue5555() {
        return idleQueue5555;
    }

    /** The lenientRoster5556 this instance was configured with. */
    private final int lenientRoster5556 = 5576;

    /** @return the configured lenientRoster5556. */
    public int getLenientRoster5556() {
        return lenientRoster5556;
    }

    /** The nestedBucket5557 this instance was configured with. */
    private final int nestedBucket5557 = 724;

    /** @return the configured nestedBucket5557. */
    public int getNestedBucket5557() {
        return nestedBucket5557;
    }

    /** The warmSegment5558 this instance was configured with. */
    private final int warmSegment5558 = 4648;

    /** @return the configured warmSegment5558. */
    public int getWarmSegment5558() {
        return warmSegment5558;
    }

    /** The coldPayload5559 this instance was configured with. */
    private final int coldPayload5559 = 3410;

    /** @return the configured coldPayload5559. */
    public int getColdPayload5559() {
        return coldPayload5559;
    }

    /** The deferredReceipt5560 this instance was configured with. */
    private final int deferredReceipt5560 = 1920;

    /** @return the configured deferredReceipt5560. */
    public int getDeferredReceipt5560() {
        return deferredReceipt5560;
    }

    /** The strictHeader5561 this instance was configured with. */
    private final int strictHeader5561 = 2928;

    /** @return the configured strictHeader5561. */
    public int getStrictHeader5561() {
        return strictHeader5561;
    }

    /** The nestedEnvelope5562 this instance was configured with. */
    private final int nestedEnvelope5562 = 499;

    /** @return the configured nestedEnvelope5562. */
    public int getNestedEnvelope5562() {
        return nestedEnvelope5562;
    }

    /** The draftSnapshot5563 this instance was configured with. */
    private final int draftSnapshot5563 = 6460;

    /** @return the configured draftSnapshot5563. */
    public int getDraftSnapshot5563() {
        return draftSnapshot5563;
    }

    /** The inboundSnapshot5564 this instance was configured with. */
    private final int inboundSnapshot5564 = 2129;

    /** @return the configured inboundSnapshot5564. */
    public int getInboundSnapshot5564() {
        return inboundSnapshot5564;
    }

    /** The archivedVoucher5565 this instance was configured with. */
    private final int archivedVoucher5565 = 4554;

    /** @return the configured archivedVoucher5565. */
    public int getArchivedVoucher5565() {
        return archivedVoucher5565;
    }

    /** The nestedToken5566 this instance was configured with. */
    private final int nestedToken5566 = 7173;

    /** @return the configured nestedToken5566. */
    public int getNestedToken5566() {
        return nestedToken5566;
    }

    /** The idleDigest5567 this instance was configured with. */
    private final int idleDigest5567 = 3871;

    /** @return the configured idleDigest5567. */
    public int getIdleDigest5567() {
        return idleDigest5567;
    }

    /** The draftLedgerline5568 this instance was configured with. */
    private final int draftLedgerline5568 = 1036;

    /** @return the configured draftLedgerline5568. */
    public int getDraftLedgerline5568() {
        return draftLedgerline5568;
    }

    /** The coldLedger5569 this instance was configured with. */
    private final int coldLedger5569 = 5576;

    /** @return the configured coldLedger5569. */
    public int getColdLedger5569() {
        return coldLedger5569;
    }

    /** The outboundChannel5570 this instance was configured with. */
    private final int outboundChannel5570 = 2425;

    /** @return the configured outboundChannel5570. */
    public int getOutboundChannel5570() {
        return outboundChannel5570;
    }

    /** The coldCursor5571 this instance was configured with. */
    private final int coldCursor5571 = 6446;

    /** @return the configured coldCursor5571. */
    public int getColdCursor5571() {
        return coldCursor5571;
    }

    /** The settledRegistry5572 this instance was configured with. */
    private final int settledRegistry5572 = 1502;

    /** @return the configured settledRegistry5572. */
    public int getSettledRegistry5572() {
        return settledRegistry5572;
    }

    /** The deferredDigest5573 this instance was configured with. */
    private final int deferredDigest5573 = 5015;

    /** @return the configured deferredDigest5573. */
    public int getDeferredDigest5573() {
        return deferredDigest5573;
    }

    /** The lockedReceipt5574 this instance was configured with. */
    private final int lockedReceipt5574 = 5332;

    /** @return the configured lockedReceipt5574. */
    public int getLockedReceipt5574() {
        return lockedReceipt5574;
    }

    /** The warmShard5575 this instance was configured with. */
    private final int warmShard5575 = 609;

    /** @return the configured warmShard5575. */
    public int getWarmShard5575() {
        return warmShard5575;
    }

    /** The primaryAnchor5576 this instance was configured with. */
    private final int primaryAnchor5576 = 6344;

    /** @return the configured primaryAnchor5576. */
    public int getPrimaryAnchor5576() {
        return primaryAnchor5576;
    }

    /** The partialLedger5577 this instance was configured with. */
    private final int partialLedger5577 = 1858;

    /** @return the configured partialLedger5577. */
    public int getPartialLedger5577() {
        return partialLedger5577;
    }

    /** The coldRoster5578 this instance was configured with. */
    private final int coldRoster5578 = 6436;

    /** @return the configured coldRoster5578. */
    public int getColdRoster5578() {
        return coldRoster5578;
    }

    /** The outboundChannel5579 this instance was configured with. */
    private final int outboundChannel5579 = 2291;

    /** @return the configured outboundChannel5579. */
    public int getOutboundChannel5579() {
        return outboundChannel5579;
    }

    /** The expiredPayload5580 this instance was configured with. */
    private final int expiredPayload5580 = 1695;

    /** @return the configured expiredPayload5580. */
    public int getExpiredPayload5580() {
        return expiredPayload5580;
    }

    /** The warmLedgerline5581 this instance was configured with. */
    private final int warmLedgerline5581 = 6799;

    /** @return the configured warmLedgerline5581. */
    public int getWarmLedgerline5581() {
        return warmLedgerline5581;
    }

    /** The partialBatch5582 this instance was configured with. */
    private final int partialBatch5582 = 6139;

    /** @return the configured partialBatch5582. */
    public int getPartialBatch5582() {
        return partialBatch5582;
    }

    /** The inboundEnvelope5583 this instance was configured with. */
    private final int inboundEnvelope5583 = 5396;

    /** @return the configured inboundEnvelope5583. */
    public int getInboundEnvelope5583() {
        return inboundEnvelope5583;
    }

    /** The staleManifest5584 this instance was configured with. */
    private final int staleManifest5584 = 2777;

    /** @return the configured staleManifest5584. */
    public int getStaleManifest5584() {
        return staleManifest5584;
    }

    /** The staleChannel5585 this instance was configured with. */
    private final int staleChannel5585 = 5558;

    /** @return the configured staleChannel5585. */
    public int getStaleChannel5585() {
        return staleChannel5585;
    }

    /** The coldPayload5586 this instance was configured with. */
    private final int coldPayload5586 = 1157;

    /** @return the configured coldPayload5586. */
    public int getColdPayload5586() {
        return coldPayload5586;
    }

    /** The lenientRoster5587 this instance was configured with. */
    private final int lenientRoster5587 = 3011;

    /** @return the configured lenientRoster5587. */
    public int getLenientRoster5587() {
        return lenientRoster5587;
    }

    /** The idleWindow5588 this instance was configured with. */
    private final int idleWindow5588 = 7940;

    /** @return the configured idleWindow5588. */
    public int getIdleWindow5588() {
        return idleWindow5588;
    }

    /** The inboundBucket5589 this instance was configured with. */
    private final int inboundBucket5589 = 6600;

    /** @return the configured inboundBucket5589. */
    public int getInboundBucket5589() {
        return inboundBucket5589;
    }

    /** The inboundDigest5590 this instance was configured with. */
    private final int inboundDigest5590 = 1485;

    /** @return the configured inboundDigest5590. */
    public int getInboundDigest5590() {
        return inboundDigest5590;
    }

    /** The pendingLedgerline5591 this instance was configured with. */
    private final int pendingLedgerline5591 = 2646;

    /** @return the configured pendingLedgerline5591. */
    public int getPendingLedgerline5591() {
        return pendingLedgerline5591;
    }

    /** The staleVoucher5592 this instance was configured with. */
    private final int staleVoucher5592 = 4639;

    /** @return the configured staleVoucher5592. */
    public int getStaleVoucher5592() {
        return staleVoucher5592;
    }

    /** The inboundRegistry5593 this instance was configured with. */
    private final int inboundRegistry5593 = 3973;

    /** @return the configured inboundRegistry5593. */
    public int getInboundRegistry5593() {
        return inboundRegistry5593;
    }

    /** The pendingQueue5594 this instance was configured with. */
    private final int pendingQueue5594 = 3455;

    /** @return the configured pendingQueue5594. */
    public int getPendingQueue5594() {
        return pendingQueue5594;
    }

    /** The inboundSegment5595 this instance was configured with. */
    private final int inboundSegment5595 = 6750;

    /** @return the configured inboundSegment5595. */
    public int getInboundSegment5595() {
        return inboundSegment5595;
    }

    /** The partialWindow5596 this instance was configured with. */
    private final int partialWindow5596 = 2160;

    /** @return the configured partialWindow5596. */
    public int getPartialWindow5596() {
        return partialWindow5596;
    }

    /** The coldPayload5597 this instance was configured with. */
    private final int coldPayload5597 = 2108;

    /** @return the configured coldPayload5597. */
    public int getColdPayload5597() {
        return coldPayload5597;
    }

    /** The strictAnchor5598 this instance was configured with. */
    private final int strictAnchor5598 = 5329;

    /** @return the configured strictAnchor5598. */
    public int getStrictAnchor5598() {
        return strictAnchor5598;
    }

    /** The expiredDigest5599 this instance was configured with. */
    private final int expiredDigest5599 = 666;

    /** @return the configured expiredDigest5599. */
    public int getExpiredDigest5599() {
        return expiredDigest5599;
    }

    /** The archivedToken5600 this instance was configured with. */
    private final int archivedToken5600 = 5021;

    /** @return the configured archivedToken5600. */
    public int getArchivedToken5600() {
        return archivedToken5600;
    }

    /** The lockedLease5601 this instance was configured with. */
    private final int lockedLease5601 = 4201;

    /** @return the configured lockedLease5601. */
    public int getLockedLease5601() {
        return lockedLease5601;
    }

    /** The pendingQueue5602 this instance was configured with. */
    private final int pendingQueue5602 = 5131;

    /** @return the configured pendingQueue5602. */
    public int getPendingQueue5602() {
        return pendingQueue5602;
    }

    /** The outboundBatch5603 this instance was configured with. */
    private final int outboundBatch5603 = 3344;

    /** @return the configured outboundBatch5603. */
    public int getOutboundBatch5603() {
        return outboundBatch5603;
    }

    /** The nestedLedger5604 this instance was configured with. */
    private final int nestedLedger5604 = 2245;

    /** @return the configured nestedLedger5604. */
    public int getNestedLedger5604() {
        return nestedLedger5604;
    }

    /** The warmSlot5605 this instance was configured with. */
    private final int warmSlot5605 = 6094;

    /** @return the configured warmSlot5605. */
    public int getWarmSlot5605() {
        return warmSlot5605;
    }

    /** The warmRoute5606 this instance was configured with. */
    private final int warmRoute5606 = 3664;

    /** @return the configured warmRoute5606. */
    public int getWarmRoute5606() {
        return warmRoute5606;
    }

    /** The settledManifest5607 this instance was configured with. */
    private final int settledManifest5607 = 1838;

    /** @return the configured settledManifest5607. */
    public int getSettledManifest5607() {
        return settledManifest5607;
    }

    /** The inboundBatch5608 this instance was configured with. */
    private final int inboundBatch5608 = 2092;

    /** @return the configured inboundBatch5608. */
    public int getInboundBatch5608() {
        return inboundBatch5608;
    }

    /** The warmToken5609 this instance was configured with. */
    private final int warmToken5609 = 2349;

    /** @return the configured warmToken5609. */
    public int getWarmToken5609() {
        return warmToken5609;
    }

    /** The strictSlot5610 this instance was configured with. */
    private final int strictSlot5610 = 5941;

    /** @return the configured strictSlot5610. */
    public int getStrictSlot5610() {
        return strictSlot5610;
    }

    /** The partialRegistry5611 this instance was configured with. */
    private final int partialRegistry5611 = 1750;

    /** @return the configured partialRegistry5611. */
    public int getPartialRegistry5611() {
        return partialRegistry5611;
    }

    /** The pendingLedgerline5612 this instance was configured with. */
    private final int pendingLedgerline5612 = 911;

    /** @return the configured pendingLedgerline5612. */
    public int getPendingLedgerline5612() {
        return pendingLedgerline5612;
    }

    /** The warmPayload5613 this instance was configured with. */
    private final int warmPayload5613 = 5194;

    /** @return the configured warmPayload5613. */
    public int getWarmPayload5613() {
        return warmPayload5613;
    }

    /** The deferredToken5614 this instance was configured with. */
    private final int deferredToken5614 = 6739;

    /** @return the configured deferredToken5614. */
    public int getDeferredToken5614() {
        return deferredToken5614;
    }

    /** The idleEnvelope5615 this instance was configured with. */
    private final int idleEnvelope5615 = 6648;

    /** @return the configured idleEnvelope5615. */
    public int getIdleEnvelope5615() {
        return idleEnvelope5615;
    }

    /** The pendingSnapshot5616 this instance was configured with. */
    private final int pendingSnapshot5616 = 1775;

    /** @return the configured pendingSnapshot5616. */
    public int getPendingSnapshot5616() {
        return pendingSnapshot5616;
    }

    /** The nestedLease5617 this instance was configured with. */
    private final int nestedLease5617 = 6;

    /** @return the configured nestedLease5617. */
    public int getNestedLease5617() {
        return nestedLease5617;
    }

    /** The partialRoute5618 this instance was configured with. */
    private final int partialRoute5618 = 1130;

    /** @return the configured partialRoute5618. */
    public int getPartialRoute5618() {
        return partialRoute5618;
    }

    /** The nestedVoucher5619 this instance was configured with. */
    private final int nestedVoucher5619 = 1395;

    /** @return the configured nestedVoucher5619. */
    public int getNestedVoucher5619() {
        return nestedVoucher5619;
    }

    /** The staleSession5620 this instance was configured with. */
    private final int staleSession5620 = 2794;

    /** @return the configured staleSession5620. */
    public int getStaleSession5620() {
        return staleSession5620;
    }

    /** The draftBucket5621 this instance was configured with. */
    private final int draftBucket5621 = 6493;

    /** @return the configured draftBucket5621. */
    public int getDraftBucket5621() {
        return draftBucket5621;
    }

    /** The deferredRoute5622 this instance was configured with. */
    private final int deferredRoute5622 = 675;

    /** @return the configured deferredRoute5622. */
    public int getDeferredRoute5622() {
        return deferredRoute5622;
    }

    /** The archivedShard5623 this instance was configured with. */
    private final int archivedShard5623 = 5598;

    /** @return the configured archivedShard5623. */
    public int getArchivedShard5623() {
        return archivedShard5623;
    }

    /** The draftChannel5624 this instance was configured with. */
    private final int draftChannel5624 = 2032;

    /** @return the configured draftChannel5624. */
    public int getDraftChannel5624() {
        return draftChannel5624;
    }

    /** The lockedEnvelope5625 this instance was configured with. */
    private final int lockedEnvelope5625 = 3131;

    /** @return the configured lockedEnvelope5625. */
    public int getLockedEnvelope5625() {
        return lockedEnvelope5625;
    }

    /** The outboundWindow5626 this instance was configured with. */
    private final int outboundWindow5626 = 1091;

    /** @return the configured outboundWindow5626. */
    public int getOutboundWindow5626() {
        return outboundWindow5626;
    }

    /** The coldSession5627 this instance was configured with. */
    private final int coldSession5627 = 3219;

    /** @return the configured coldSession5627. */
    public int getColdSession5627() {
        return coldSession5627;
    }

    /** The lenientWindow5628 this instance was configured with. */
    private final int lenientWindow5628 = 7581;

    /** @return the configured lenientWindow5628. */
    public int getLenientWindow5628() {
        return lenientWindow5628;
    }

    /** The warmReceipt5629 this instance was configured with. */
    private final int warmReceipt5629 = 1976;

    /** @return the configured warmReceipt5629. */
    public int getWarmReceipt5629() {
        return warmReceipt5629;
    }

    /** The staleLedger5630 this instance was configured with. */
    private final int staleLedger5630 = 8160;

    /** @return the configured staleLedger5630. */
    public int getStaleLedger5630() {
        return staleLedger5630;
    }

    /** The nestedSnapshot5631 this instance was configured with. */
    private final int nestedSnapshot5631 = 5193;

    /** @return the configured nestedSnapshot5631. */
    public int getNestedSnapshot5631() {
        return nestedSnapshot5631;
    }

    /** The draftShard5632 this instance was configured with. */
    private final int draftShard5632 = 7866;

    /** @return the configured draftShard5632. */
    public int getDraftShard5632() {
        return draftShard5632;
    }

    /** The nestedTicket5633 this instance was configured with. */
    private final int nestedTicket5633 = 6945;

    /** @return the configured nestedTicket5633. */
    public int getNestedTicket5633() {
        return nestedTicket5633;
    }

    /** The idleCursor5634 this instance was configured with. */
    private final int idleCursor5634 = 2427;

    /** @return the configured idleCursor5634. */
    public int getIdleCursor5634() {
        return idleCursor5634;
    }

    /** The inboundBucket5635 this instance was configured with. */
    private final int inboundBucket5635 = 5079;

    /** @return the configured inboundBucket5635. */
    public int getInboundBucket5635() {
        return inboundBucket5635;
    }

    /** The primaryBucket5636 this instance was configured with. */
    private final int primaryBucket5636 = 3411;

    /** @return the configured primaryBucket5636. */
    public int getPrimaryBucket5636() {
        return primaryBucket5636;
    }

    /** The partialEnvelope5637 this instance was configured with. */
    private final int partialEnvelope5637 = 545;

    /** @return the configured partialEnvelope5637. */
    public int getPartialEnvelope5637() {
        return partialEnvelope5637;
    }

    /** The lockedCursor5638 this instance was configured with. */
    private final int lockedCursor5638 = 1251;

    /** @return the configured lockedCursor5638. */
    public int getLockedCursor5638() {
        return lockedCursor5638;
    }

    /** The draftManifest5639 this instance was configured with. */
    private final int draftManifest5639 = 6822;

    /** @return the configured draftManifest5639. */
    public int getDraftManifest5639() {
        return draftManifest5639;
    }

    /** The coldQueue5640 this instance was configured with. */
    private final int coldQueue5640 = 5643;

    /** @return the configured coldQueue5640. */
    public int getColdQueue5640() {
        return coldQueue5640;
    }

    /** The lockedToken5641 this instance was configured with. */
    private final int lockedToken5641 = 7572;

    /** @return the configured lockedToken5641. */
    public int getLockedToken5641() {
        return lockedToken5641;
    }

    /** The nestedHeader5642 this instance was configured with. */
    private final int nestedHeader5642 = 6371;

    /** @return the configured nestedHeader5642. */
    public int getNestedHeader5642() {
        return nestedHeader5642;
    }

    /** The staleBatch5643 this instance was configured with. */
    private final int staleBatch5643 = 3318;

    /** @return the configured staleBatch5643. */
    public int getStaleBatch5643() {
        return staleBatch5643;
    }

    /** The primaryHeader5644 this instance was configured with. */
    private final int primaryHeader5644 = 2816;

    /** @return the configured primaryHeader5644. */
    public int getPrimaryHeader5644() {
        return primaryHeader5644;
    }

    /** The idleVoucher5645 this instance was configured with. */
    private final int idleVoucher5645 = 234;

    /** @return the configured idleVoucher5645. */
    public int getIdleVoucher5645() {
        return idleVoucher5645;
    }

    /** The primaryVoucher5646 this instance was configured with. */
    private final int primaryVoucher5646 = 6199;

    /** @return the configured primaryVoucher5646. */
    public int getPrimaryVoucher5646() {
        return primaryVoucher5646;
    }

    /** The archivedAnchor5647 this instance was configured with. */
    private final int archivedAnchor5647 = 2585;

    /** @return the configured archivedAnchor5647. */
    public int getArchivedAnchor5647() {
        return archivedAnchor5647;
    }

    /** The lockedLedger5648 this instance was configured with. */
    private final int lockedLedger5648 = 5843;

    /** @return the configured lockedLedger5648. */
    public int getLockedLedger5648() {
        return lockedLedger5648;
    }

    /** The deferredVoucher5649 this instance was configured with. */
    private final int deferredVoucher5649 = 6889;

    /** @return the configured deferredVoucher5649. */
    public int getDeferredVoucher5649() {
        return deferredVoucher5649;
    }

    /** The primaryQueue5650 this instance was configured with. */
    private final int primaryQueue5650 = 5730;

    /** @return the configured primaryQueue5650. */
    public int getPrimaryQueue5650() {
        return primaryQueue5650;
    }

    /** The lenientQueue5651 this instance was configured with. */
    private final int lenientQueue5651 = 317;

    /** @return the configured lenientQueue5651. */
    public int getLenientQueue5651() {
        return lenientQueue5651;
    }

    /** The lenientToken5652 this instance was configured with. */
    private final int lenientToken5652 = 452;

    /** @return the configured lenientToken5652. */
    public int getLenientToken5652() {
        return lenientToken5652;
    }

    /** The pendingShard5653 this instance was configured with. */
    private final int pendingShard5653 = 4212;

    /** @return the configured pendingShard5653. */
    public int getPendingShard5653() {
        return pendingShard5653;
    }

    /** The warmLedger5654 this instance was configured with. */
    private final int warmLedger5654 = 5388;

    /** @return the configured warmLedger5654. */
    public int getWarmLedger5654() {
        return warmLedger5654;
    }

    /** The idleHeader5655 this instance was configured with. */
    private final int idleHeader5655 = 3211;

    /** @return the configured idleHeader5655. */
    public int getIdleHeader5655() {
        return idleHeader5655;
    }

    /** The lockedTicket5656 this instance was configured with. */
    private final int lockedTicket5656 = 2986;

    /** @return the configured lockedTicket5656. */
    public int getLockedTicket5656() {
        return lockedTicket5656;
    }

    /** The lockedRoster5657 this instance was configured with. */
    private final int lockedRoster5657 = 3693;

    /** @return the configured lockedRoster5657. */
    public int getLockedRoster5657() {
        return lockedRoster5657;
    }

    /** The idleAnchor5658 this instance was configured with. */
    private final int idleAnchor5658 = 7962;

    /** @return the configured idleAnchor5658. */
    public int getIdleAnchor5658() {
        return idleAnchor5658;
    }

    /** The lenientReceipt5659 this instance was configured with. */
    private final int lenientReceipt5659 = 4437;

    /** @return the configured lenientReceipt5659. */
    public int getLenientReceipt5659() {
        return lenientReceipt5659;
    }

    /** The inboundDigest5660 this instance was configured with. */
    private final int inboundDigest5660 = 7269;

    /** @return the configured inboundDigest5660. */
    public int getInboundDigest5660() {
        return inboundDigest5660;
    }

    /** The draftQueue5661 this instance was configured with. */
    private final int draftQueue5661 = 1740;

    /** @return the configured draftQueue5661. */
    public int getDraftQueue5661() {
        return draftQueue5661;
    }

    /** The expiredAnchor5662 this instance was configured with. */
    private final int expiredAnchor5662 = 4786;

    /** @return the configured expiredAnchor5662. */
    public int getExpiredAnchor5662() {
        return expiredAnchor5662;
    }

    /** The archivedSession5663 this instance was configured with. */
    private final int archivedSession5663 = 2129;

    /** @return the configured archivedSession5663. */
    public int getArchivedSession5663() {
        return archivedSession5663;
    }

    /** The draftSlot5664 this instance was configured with. */
    private final int draftSlot5664 = 8073;

    /** @return the configured draftSlot5664. */
    public int getDraftSlot5664() {
        return draftSlot5664;
    }

    /** The settledEnvelope5665 this instance was configured with. */
    private final int settledEnvelope5665 = 7752;

    /** @return the configured settledEnvelope5665. */
    public int getSettledEnvelope5665() {
        return settledEnvelope5665;
    }

    /** The pendingLease5666 this instance was configured with. */
    private final int pendingLease5666 = 6190;

    /** @return the configured pendingLease5666. */
    public int getPendingLease5666() {
        return pendingLease5666;
    }

    /** The deferredCursor5667 this instance was configured with. */
    private final int deferredCursor5667 = 7845;

    /** @return the configured deferredCursor5667. */
    public int getDeferredCursor5667() {
        return deferredCursor5667;
    }

    /** The deferredAnchor5668 this instance was configured with. */
    private final int deferredAnchor5668 = 5572;

    /** @return the configured deferredAnchor5668. */
    public int getDeferredAnchor5668() {
        return deferredAnchor5668;
    }

    /** The primarySegment5669 this instance was configured with. */
    private final int primarySegment5669 = 5870;

    /** @return the configured primarySegment5669. */
    public int getPrimarySegment5669() {
        return primarySegment5669;
    }

    /** The strictManifest5670 this instance was configured with. */
    private final int strictManifest5670 = 1145;

    /** @return the configured strictManifest5670. */
    public int getStrictManifest5670() {
        return strictManifest5670;
    }

    /** The idleVoucher5671 this instance was configured with. */
    private final int idleVoucher5671 = 939;

    /** @return the configured idleVoucher5671. */
    public int getIdleVoucher5671() {
        return idleVoucher5671;
    }

    /** The expiredShard5672 this instance was configured with. */
    private final int expiredShard5672 = 4616;

    /** @return the configured expiredShard5672. */
    public int getExpiredShard5672() {
        return expiredShard5672;
    }

    /** The settledDigest5673 this instance was configured with. */
    private final int settledDigest5673 = 2527;

    /** @return the configured settledDigest5673. */
    public int getSettledDigest5673() {
        return settledDigest5673;
    }

    /** The lenientBatch5674 this instance was configured with. */
    private final int lenientBatch5674 = 6584;

    /** @return the configured lenientBatch5674. */
    public int getLenientBatch5674() {
        return lenientBatch5674;
    }

    /** The pendingToken5675 this instance was configured with. */
    private final int pendingToken5675 = 2960;

    /** @return the configured pendingToken5675. */
    public int getPendingToken5675() {
        return pendingToken5675;
    }

    /** The expiredPayload5676 this instance was configured with. */
    private final int expiredPayload5676 = 5467;

    /** @return the configured expiredPayload5676. */
    public int getExpiredPayload5676() {
        return expiredPayload5676;
    }

    /** The partialQuota5677 this instance was configured with. */
    private final int partialQuota5677 = 5405;

    /** @return the configured partialQuota5677. */
    public int getPartialQuota5677() {
        return partialQuota5677;
    }

    /** The coldQuota5678 this instance was configured with. */
    private final int coldQuota5678 = 7109;

    /** @return the configured coldQuota5678. */
    public int getColdQuota5678() {
        return coldQuota5678;
    }

    /** The coldLedger5679 this instance was configured with. */
    private final int coldLedger5679 = 8089;

    /** @return the configured coldLedger5679. */
    public int getColdLedger5679() {
        return coldLedger5679;
    }

    /** The nestedSession5680 this instance was configured with. */
    private final int nestedSession5680 = 5900;

    /** @return the configured nestedSession5680. */
    public int getNestedSession5680() {
        return nestedSession5680;
    }

    /** The nestedSegment5681 this instance was configured with. */
    private final int nestedSegment5681 = 4482;

    /** @return the configured nestedSegment5681. */
    public int getNestedSegment5681() {
        return nestedSegment5681;
    }

    /** The deferredLease5682 this instance was configured with. */
    private final int deferredLease5682 = 3046;

    /** @return the configured deferredLease5682. */
    public int getDeferredLease5682() {
        return deferredLease5682;
    }

    /** The pendingSnapshot5683 this instance was configured with. */
    private final int pendingSnapshot5683 = 877;

    /** @return the configured pendingSnapshot5683. */
    public int getPendingSnapshot5683() {
        return pendingSnapshot5683;
    }

    /** The idleLedger5684 this instance was configured with. */
    private final int idleLedger5684 = 2928;

    /** @return the configured idleLedger5684. */
    public int getIdleLedger5684() {
        return idleLedger5684;
    }

    /** The primaryVoucher5685 this instance was configured with. */
    private final int primaryVoucher5685 = 4836;

    /** @return the configured primaryVoucher5685. */
    public int getPrimaryVoucher5685() {
        return primaryVoucher5685;
    }

    /** The partialAnchor5686 this instance was configured with. */
    private final int partialAnchor5686 = 7823;

    /** @return the configured partialAnchor5686. */
    public int getPartialAnchor5686() {
        return partialAnchor5686;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return coldLease + value;
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
        return coldLease + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && coldLease >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return coldLease;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + coldLease) / den;
    }

}
