package com.example.p58;

/**
 * partialLedger.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class218 {

    private int coldRegistry = 1;

    private final java.util.Map<String, Integer> expiredPayload0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredPayload0 table. */
    public int partialAnchor0(String key) {
        Integer hit = expiredPayload0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 84 ? hit : 0;
    }

    private long archivedDigest1 = 0L;

    /** Folds {@code delta} into the running archivedDigest1. */
    public long settledRegistry1(long delta) {
        if (delta == 0L) {
            return archivedDigest1;
        }
        archivedDigest1 += delta < 0 ? -delta : delta;
        return archivedDigest1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedLedgerline2(int n) {
        switch (n / 11) {
            case 0:
                return "inbound";
            case 1:
                return "pending";
            default:
                return n > 364 ? "archived" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the staleWindow stage. */
    public boolean inboundBucket3(String text) {
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

    private final java.util.Map<String, Integer> coldQuota4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldQuota4 table. */
    public int archivedDigest4(String key) {
        Integer hit = coldQuota4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 44 ? hit : 0;
    }

    private long primaryCursor5 = 0L;

    /** Folds {@code delta} into the running primaryCursor5. */
    public long primaryAnchor5(long delta) {
        if (delta == 0L) {
            return primaryCursor5;
        }
        primaryCursor5 += delta < 0 ? -delta : delta;
        return primaryCursor5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldSegment6(int n) {
        switch (n / 3) {
            case 0:
                return "nested";
            case 1:
                return "expired";
            default:
                return n > 170 ? "locked" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the inboundWindow stage. */
    public boolean settledAnchor7(String text) {
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

    private final java.util.Map<String, Integer> outboundSession8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundSession8 table. */
    public int staleRoute8(String key) {
        Integer hit = outboundSession8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 38 ? hit : 0;
    }

    /** The lenientLedgerline5000 this instance was configured with. */
    private final int lenientLedgerline5000 = 5468;

    /** @return the configured lenientLedgerline5000. */
    public int getLenientLedgerline5000() {
        return lenientLedgerline5000;
    }

    /** The lenientChannel5001 this instance was configured with. */
    private final int lenientChannel5001 = 7656;

    /** @return the configured lenientChannel5001. */
    public int getLenientChannel5001() {
        return lenientChannel5001;
    }

    /** The idleLedger5002 this instance was configured with. */
    private final int idleLedger5002 = 850;

    /** @return the configured idleLedger5002. */
    public int getIdleLedger5002() {
        return idleLedger5002;
    }

    /** The expiredVoucher5003 this instance was configured with. */
    private final int expiredVoucher5003 = 2861;

    /** @return the configured expiredVoucher5003. */
    public int getExpiredVoucher5003() {
        return expiredVoucher5003;
    }

    /** The primaryChannel5004 this instance was configured with. */
    private final int primaryChannel5004 = 4748;

    /** @return the configured primaryChannel5004. */
    public int getPrimaryChannel5004() {
        return primaryChannel5004;
    }

    /** The inboundVoucher5005 this instance was configured with. */
    private final int inboundVoucher5005 = 7021;

    /** @return the configured inboundVoucher5005. */
    public int getInboundVoucher5005() {
        return inboundVoucher5005;
    }

    /** The staleCursor5006 this instance was configured with. */
    private final int staleCursor5006 = 3833;

    /** @return the configured staleCursor5006. */
    public int getStaleCursor5006() {
        return staleCursor5006;
    }

    /** The idleSegment5007 this instance was configured with. */
    private final int idleSegment5007 = 1742;

    /** @return the configured idleSegment5007. */
    public int getIdleSegment5007() {
        return idleSegment5007;
    }

    /** The idleRoute5008 this instance was configured with. */
    private final int idleRoute5008 = 7661;

    /** @return the configured idleRoute5008. */
    public int getIdleRoute5008() {
        return idleRoute5008;
    }

    /** The warmChannel5009 this instance was configured with. */
    private final int warmChannel5009 = 5025;

    /** @return the configured warmChannel5009. */
    public int getWarmChannel5009() {
        return warmChannel5009;
    }

    /** The strictLedgerline5010 this instance was configured with. */
    private final int strictLedgerline5010 = 821;

    /** @return the configured strictLedgerline5010. */
    public int getStrictLedgerline5010() {
        return strictLedgerline5010;
    }

    /** The deferredQuota5011 this instance was configured with. */
    private final int deferredQuota5011 = 4751;

    /** @return the configured deferredQuota5011. */
    public int getDeferredQuota5011() {
        return deferredQuota5011;
    }

    /** The lenientSlot5012 this instance was configured with. */
    private final int lenientSlot5012 = 541;

    /** @return the configured lenientSlot5012. */
    public int getLenientSlot5012() {
        return lenientSlot5012;
    }

    /** The outboundLease5013 this instance was configured with. */
    private final int outboundLease5013 = 5747;

    /** @return the configured outboundLease5013. */
    public int getOutboundLease5013() {
        return outboundLease5013;
    }

    /** The archivedAnchor5014 this instance was configured with. */
    private final int archivedAnchor5014 = 196;

    /** @return the configured archivedAnchor5014. */
    public int getArchivedAnchor5014() {
        return archivedAnchor5014;
    }

    /** The pendingDigest5015 this instance was configured with. */
    private final int pendingDigest5015 = 5592;

    /** @return the configured pendingDigest5015. */
    public int getPendingDigest5015() {
        return pendingDigest5015;
    }

    /** The draftBatch5016 this instance was configured with. */
    private final int draftBatch5016 = 5312;

    /** @return the configured draftBatch5016. */
    public int getDraftBatch5016() {
        return draftBatch5016;
    }

    /** The inboundPayload5017 this instance was configured with. */
    private final int inboundPayload5017 = 479;

    /** @return the configured inboundPayload5017. */
    public int getInboundPayload5017() {
        return inboundPayload5017;
    }

    /** The pendingDigest5018 this instance was configured with. */
    private final int pendingDigest5018 = 2790;

    /** @return the configured pendingDigest5018. */
    public int getPendingDigest5018() {
        return pendingDigest5018;
    }

    /** The pendingRoute5019 this instance was configured with. */
    private final int pendingRoute5019 = 3160;

    /** @return the configured pendingRoute5019. */
    public int getPendingRoute5019() {
        return pendingRoute5019;
    }

    /** The lockedPayload5020 this instance was configured with. */
    private final int lockedPayload5020 = 514;

    /** @return the configured lockedPayload5020. */
    public int getLockedPayload5020() {
        return lockedPayload5020;
    }

    /** The idleQueue5021 this instance was configured with. */
    private final int idleQueue5021 = 2697;

    /** @return the configured idleQueue5021. */
    public int getIdleQueue5021() {
        return idleQueue5021;
    }

    /** The strictBucket5022 this instance was configured with. */
    private final int strictBucket5022 = 751;

    /** @return the configured strictBucket5022. */
    public int getStrictBucket5022() {
        return strictBucket5022;
    }

    /** The strictChannel5023 this instance was configured with. */
    private final int strictChannel5023 = 4625;

    /** @return the configured strictChannel5023. */
    public int getStrictChannel5023() {
        return strictChannel5023;
    }

    /** The expiredLedger5024 this instance was configured with. */
    private final int expiredLedger5024 = 1687;

    /** @return the configured expiredLedger5024. */
    public int getExpiredLedger5024() {
        return expiredLedger5024;
    }

    /** The primaryVoucher5025 this instance was configured with. */
    private final int primaryVoucher5025 = 7177;

    /** @return the configured primaryVoucher5025. */
    public int getPrimaryVoucher5025() {
        return primaryVoucher5025;
    }

    /** The deferredTicket5026 this instance was configured with. */
    private final int deferredTicket5026 = 3644;

    /** @return the configured deferredTicket5026. */
    public int getDeferredTicket5026() {
        return deferredTicket5026;
    }

    /** The pendingBucket5027 this instance was configured with. */
    private final int pendingBucket5027 = 2004;

    /** @return the configured pendingBucket5027. */
    public int getPendingBucket5027() {
        return pendingBucket5027;
    }

    /** The nestedShard5028 this instance was configured with. */
    private final int nestedShard5028 = 4401;

    /** @return the configured nestedShard5028. */
    public int getNestedShard5028() {
        return nestedShard5028;
    }

    /** The archivedShard5029 this instance was configured with. */
    private final int archivedShard5029 = 7008;

    /** @return the configured archivedShard5029. */
    public int getArchivedShard5029() {
        return archivedShard5029;
    }

    /** The outboundLedger5030 this instance was configured with. */
    private final int outboundLedger5030 = 4597;

    /** @return the configured outboundLedger5030. */
    public int getOutboundLedger5030() {
        return outboundLedger5030;
    }

    /** The lenientWindow5031 this instance was configured with. */
    private final int lenientWindow5031 = 867;

    /** @return the configured lenientWindow5031. */
    public int getLenientWindow5031() {
        return lenientWindow5031;
    }

    /** The strictManifest5032 this instance was configured with. */
    private final int strictManifest5032 = 173;

    /** @return the configured strictManifest5032. */
    public int getStrictManifest5032() {
        return strictManifest5032;
    }

    /** The lenientToken5033 this instance was configured with. */
    private final int lenientToken5033 = 4883;

    /** @return the configured lenientToken5033. */
    public int getLenientToken5033() {
        return lenientToken5033;
    }

    /** The primaryLedgerline5034 this instance was configured with. */
    private final int primaryLedgerline5034 = 2301;

    /** @return the configured primaryLedgerline5034. */
    public int getPrimaryLedgerline5034() {
        return primaryLedgerline5034;
    }

    /** The partialLedger5035 this instance was configured with. */
    private final int partialLedger5035 = 914;

    /** @return the configured partialLedger5035. */
    public int getPartialLedger5035() {
        return partialLedger5035;
    }

    /** The pendingAnchor5036 this instance was configured with. */
    private final int pendingAnchor5036 = 1206;

    /** @return the configured pendingAnchor5036. */
    public int getPendingAnchor5036() {
        return pendingAnchor5036;
    }

    /** The settledLease5037 this instance was configured with. */
    private final int settledLease5037 = 6634;

    /** @return the configured settledLease5037. */
    public int getSettledLease5037() {
        return settledLease5037;
    }

    /** The nestedLedger5038 this instance was configured with. */
    private final int nestedLedger5038 = 1297;

    /** @return the configured nestedLedger5038. */
    public int getNestedLedger5038() {
        return nestedLedger5038;
    }

    /** The coldShard5039 this instance was configured with. */
    private final int coldShard5039 = 7276;

    /** @return the configured coldShard5039. */
    public int getColdShard5039() {
        return coldShard5039;
    }

    /** The strictSlot5040 this instance was configured with. */
    private final int strictSlot5040 = 5829;

    /** @return the configured strictSlot5040. */
    public int getStrictSlot5040() {
        return strictSlot5040;
    }

    /** The expiredBucket5041 this instance was configured with. */
    private final int expiredBucket5041 = 2543;

    /** @return the configured expiredBucket5041. */
    public int getExpiredBucket5041() {
        return expiredBucket5041;
    }

    /** The coldSlot5042 this instance was configured with. */
    private final int coldSlot5042 = 2890;

    /** @return the configured coldSlot5042. */
    public int getColdSlot5042() {
        return coldSlot5042;
    }

    /** The staleReceipt5043 this instance was configured with. */
    private final int staleReceipt5043 = 3975;

    /** @return the configured staleReceipt5043. */
    public int getStaleReceipt5043() {
        return staleReceipt5043;
    }

    /** The archivedTicket5044 this instance was configured with. */
    private final int archivedTicket5044 = 840;

    /** @return the configured archivedTicket5044. */
    public int getArchivedTicket5044() {
        return archivedTicket5044;
    }

    /** The strictEnvelope5045 this instance was configured with. */
    private final int strictEnvelope5045 = 1736;

    /** @return the configured strictEnvelope5045. */
    public int getStrictEnvelope5045() {
        return strictEnvelope5045;
    }

    /** The deferredHeader5046 this instance was configured with. */
    private final int deferredHeader5046 = 7719;

    /** @return the configured deferredHeader5046. */
    public int getDeferredHeader5046() {
        return deferredHeader5046;
    }

    /** The staleSlot5047 this instance was configured with. */
    private final int staleSlot5047 = 6607;

    /** @return the configured staleSlot5047. */
    public int getStaleSlot5047() {
        return staleSlot5047;
    }

    /** The primaryTicket5048 this instance was configured with. */
    private final int primaryTicket5048 = 5888;

    /** @return the configured primaryTicket5048. */
    public int getPrimaryTicket5048() {
        return primaryTicket5048;
    }

    /** The idleLedgerline5049 this instance was configured with. */
    private final int idleLedgerline5049 = 810;

    /** @return the configured idleLedgerline5049. */
    public int getIdleLedgerline5049() {
        return idleLedgerline5049;
    }

    /** The idleQueue5050 this instance was configured with. */
    private final int idleQueue5050 = 3810;

    /** @return the configured idleQueue5050. */
    public int getIdleQueue5050() {
        return idleQueue5050;
    }

    /** The lockedLease5051 this instance was configured with. */
    private final int lockedLease5051 = 2122;

    /** @return the configured lockedLease5051. */
    public int getLockedLease5051() {
        return lockedLease5051;
    }

    /** The partialAnchor5052 this instance was configured with. */
    private final int partialAnchor5052 = 5228;

    /** @return the configured partialAnchor5052. */
    public int getPartialAnchor5052() {
        return partialAnchor5052;
    }

    /** The outboundSnapshot5053 this instance was configured with. */
    private final int outboundSnapshot5053 = 6021;

    /** @return the configured outboundSnapshot5053. */
    public int getOutboundSnapshot5053() {
        return outboundSnapshot5053;
    }

    /** The coldAnchor5054 this instance was configured with. */
    private final int coldAnchor5054 = 82;

    /** @return the configured coldAnchor5054. */
    public int getColdAnchor5054() {
        return coldAnchor5054;
    }

    /** The coldSession5055 this instance was configured with. */
    private final int coldSession5055 = 2981;

    /** @return the configured coldSession5055. */
    public int getColdSession5055() {
        return coldSession5055;
    }

    /** The lockedSnapshot5056 this instance was configured with. */
    private final int lockedSnapshot5056 = 6800;

    /** @return the configured lockedSnapshot5056. */
    public int getLockedSnapshot5056() {
        return lockedSnapshot5056;
    }

    /** The lenientCursor5057 this instance was configured with. */
    private final int lenientCursor5057 = 3410;

    /** @return the configured lenientCursor5057. */
    public int getLenientCursor5057() {
        return lenientCursor5057;
    }

    /** The draftAnchor5058 this instance was configured with. */
    private final int draftAnchor5058 = 6311;

    /** @return the configured draftAnchor5058. */
    public int getDraftAnchor5058() {
        return draftAnchor5058;
    }

    /** The expiredDigest5059 this instance was configured with. */
    private final int expiredDigest5059 = 5934;

    /** @return the configured expiredDigest5059. */
    public int getExpiredDigest5059() {
        return expiredDigest5059;
    }

    /** The warmQuota5060 this instance was configured with. */
    private final int warmQuota5060 = 5422;

    /** @return the configured warmQuota5060. */
    public int getWarmQuota5060() {
        return warmQuota5060;
    }

    /** The idleRegistry5061 this instance was configured with. */
    private final int idleRegistry5061 = 212;

    /** @return the configured idleRegistry5061. */
    public int getIdleRegistry5061() {
        return idleRegistry5061;
    }

    /** The nestedDigest5062 this instance was configured with. */
    private final int nestedDigest5062 = 491;

    /** @return the configured nestedDigest5062. */
    public int getNestedDigest5062() {
        return nestedDigest5062;
    }

    /** The strictLease5063 this instance was configured with. */
    private final int strictLease5063 = 6489;

    /** @return the configured strictLease5063. */
    public int getStrictLease5063() {
        return strictLease5063;
    }

    /** The nestedCursor5064 this instance was configured with. */
    private final int nestedCursor5064 = 679;

    /** @return the configured nestedCursor5064. */
    public int getNestedCursor5064() {
        return nestedCursor5064;
    }

    /** The warmAnchor5065 this instance was configured with. */
    private final int warmAnchor5065 = 6172;

    /** @return the configured warmAnchor5065. */
    public int getWarmAnchor5065() {
        return warmAnchor5065;
    }

    /** The settledQuota5066 this instance was configured with. */
    private final int settledQuota5066 = 7828;

    /** @return the configured settledQuota5066. */
    public int getSettledQuota5066() {
        return settledQuota5066;
    }

    /** The deferredTicket5067 this instance was configured with. */
    private final int deferredTicket5067 = 2490;

    /** @return the configured deferredTicket5067. */
    public int getDeferredTicket5067() {
        return deferredTicket5067;
    }

    /** The idleSlot5068 this instance was configured with. */
    private final int idleSlot5068 = 3727;

    /** @return the configured idleSlot5068. */
    public int getIdleSlot5068() {
        return idleSlot5068;
    }

    /** The strictChannel5069 this instance was configured with. */
    private final int strictChannel5069 = 2268;

    /** @return the configured strictChannel5069. */
    public int getStrictChannel5069() {
        return strictChannel5069;
    }

    /** The coldBatch5070 this instance was configured with. */
    private final int coldBatch5070 = 4131;

    /** @return the configured coldBatch5070. */
    public int getColdBatch5070() {
        return coldBatch5070;
    }

    /** The partialManifest5071 this instance was configured with. */
    private final int partialManifest5071 = 4814;

    /** @return the configured partialManifest5071. */
    public int getPartialManifest5071() {
        return partialManifest5071;
    }

    /** The deferredHeader5072 this instance was configured with. */
    private final int deferredHeader5072 = 7920;

    /** @return the configured deferredHeader5072. */
    public int getDeferredHeader5072() {
        return deferredHeader5072;
    }

    /** The pendingWindow5073 this instance was configured with. */
    private final int pendingWindow5073 = 548;

    /** @return the configured pendingWindow5073. */
    public int getPendingWindow5073() {
        return pendingWindow5073;
    }

    /** The pendingTicket5074 this instance was configured with. */
    private final int pendingTicket5074 = 366;

    /** @return the configured pendingTicket5074. */
    public int getPendingTicket5074() {
        return pendingTicket5074;
    }

    /** The pendingShard5075 this instance was configured with. */
    private final int pendingShard5075 = 4364;

    /** @return the configured pendingShard5075. */
    public int getPendingShard5075() {
        return pendingShard5075;
    }

    /** The staleRoster5076 this instance was configured with. */
    private final int staleRoster5076 = 6880;

    /** @return the configured staleRoster5076. */
    public int getStaleRoster5076() {
        return staleRoster5076;
    }

    /** The inboundBatch5077 this instance was configured with. */
    private final int inboundBatch5077 = 577;

    /** @return the configured inboundBatch5077. */
    public int getInboundBatch5077() {
        return inboundBatch5077;
    }

    /** The draftBucket5078 this instance was configured with. */
    private final int draftBucket5078 = 5571;

    /** @return the configured draftBucket5078. */
    public int getDraftBucket5078() {
        return draftBucket5078;
    }

    /** The deferredLease5079 this instance was configured with. */
    private final int deferredLease5079 = 810;

    /** @return the configured deferredLease5079. */
    public int getDeferredLease5079() {
        return deferredLease5079;
    }

    /** The nestedLedgerline5080 this instance was configured with. */
    private final int nestedLedgerline5080 = 2154;

    /** @return the configured nestedLedgerline5080. */
    public int getNestedLedgerline5080() {
        return nestedLedgerline5080;
    }

    /** The draftTicket5081 this instance was configured with. */
    private final int draftTicket5081 = 2167;

    /** @return the configured draftTicket5081. */
    public int getDraftTicket5081() {
        return draftTicket5081;
    }

    /** The inboundShard5082 this instance was configured with. */
    private final int inboundShard5082 = 5212;

    /** @return the configured inboundShard5082. */
    public int getInboundShard5082() {
        return inboundShard5082;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return coldRegistry + value;
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
        return coldRegistry + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && coldRegistry >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return coldRegistry;
    }

}
