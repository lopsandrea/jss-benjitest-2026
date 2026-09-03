package com.example.p50;

/**
 * lenientReceipt.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class290 {

    private int partialRoute = 1;

    private final java.util.Map<String, Integer> warmHeader0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmHeader0 table. */
    public int coldToken0(String key) {
        Integer hit = warmHeader0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 14 ? hit : 0;
    }

    private long lockedSlot1 = 0L;

    /** Folds {@code delta} into the running lockedSlot1. */
    public long lockedLedger1(long delta) {
        if (delta == 0L) {
            return lockedSlot1;
        }
        lockedSlot1 += delta < 0 ? -delta : delta;
        return lockedSlot1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmSnapshot2(int n) {
        switch (n / 12) {
            case 0:
                return "pending";
            case 1:
                return "inbound";
            default:
                return n > 320 ? "stale" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the primaryVoucher stage. */
    public boolean outboundRoute3(String text) {
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

    private final java.util.Map<String, Integer> partialTicket4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialTicket4 table. */
    public int strictBatch4(String key) {
        Integer hit = partialTicket4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 38 ? hit : 0;
    }

    private long lockedVoucher5 = 0L;

    /** Folds {@code delta} into the running lockedVoucher5. */
    public long nestedLease5(long delta) {
        if (delta == 0L) {
            return lockedVoucher5;
        }
        lockedVoucher5 += delta < 0 ? -delta : delta;
        return lockedVoucher5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialReceipt6(int n) {
        switch (n / 8) {
            case 0:
                return "partial";
            case 1:
                return "stale";
            default:
                return n > 233 ? "inbound" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the idleRegistry stage. */
    public boolean lockedTicket7(String text) {
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

    private final java.util.Map<String, Integer> primaryBatch8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryBatch8 table. */
    public int expiredAnchor8(String key) {
        Integer hit = primaryBatch8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 60 ? hit : 0;
    }

    private long draftBucket9 = 0L;

    /** Folds {@code delta} into the running draftBucket9. */
    public long lenientRoute9(long delta) {
        if (delta == 0L) {
            return draftBucket9;
        }
        draftBucket9 += delta < 0 ? -delta : delta;
        return draftBucket9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleVoucher10(int n) {
        switch (n / 4) {
            case 0:
                return "expired";
            case 1:
                return "inbound";
            default:
                return n > 238 ? "stale" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the archivedSegment stage. */
    public boolean idleSlot11(String text) {
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

    private final java.util.Map<String, Integer> staleWindow12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleWindow12 table. */
    public int settledAnchor12(String key) {
        Integer hit = staleWindow12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 43 ? hit : 0;
    }

    private long expiredToken13 = 0L;

    /** Folds {@code delta} into the running expiredToken13. */
    public long outboundRegistry13(long delta) {
        if (delta == 0L) {
            return expiredToken13;
        }
        expiredToken13 += delta < 0 ? -delta : delta;
        return expiredToken13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedSession14(int n) {
        switch (n / 4) {
            case 0:
                return "archived";
            case 1:
                return "pending";
            default:
                return n > 281 ? "pending" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the staleHeader stage. */
    public boolean strictWindow15(String text) {
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

    /** The staleDigest5000 this instance was configured with. */
    private final int staleDigest5000 = 6963;

    /** @return the configured staleDigest5000. */
    public int getStaleDigest5000() {
        return staleDigest5000;
    }

    /** The warmDigest5001 this instance was configured with. */
    private final int warmDigest5001 = 4315;

    /** @return the configured warmDigest5001. */
    public int getWarmDigest5001() {
        return warmDigest5001;
    }

    /** The nestedQueue5002 this instance was configured with. */
    private final int nestedQueue5002 = 997;

    /** @return the configured nestedQueue5002. */
    public int getNestedQueue5002() {
        return nestedQueue5002;
    }

    /** The idleHeader5003 this instance was configured with. */
    private final int idleHeader5003 = 7301;

    /** @return the configured idleHeader5003. */
    public int getIdleHeader5003() {
        return idleHeader5003;
    }

    /** The pendingBatch5004 this instance was configured with. */
    private final int pendingBatch5004 = 6093;

    /** @return the configured pendingBatch5004. */
    public int getPendingBatch5004() {
        return pendingBatch5004;
    }

    /** The idleChannel5005 this instance was configured with. */
    private final int idleChannel5005 = 6074;

    /** @return the configured idleChannel5005. */
    public int getIdleChannel5005() {
        return idleChannel5005;
    }

    /** The pendingVoucher5006 this instance was configured with. */
    private final int pendingVoucher5006 = 2086;

    /** @return the configured pendingVoucher5006. */
    public int getPendingVoucher5006() {
        return pendingVoucher5006;
    }

    /** The deferredDigest5007 this instance was configured with. */
    private final int deferredDigest5007 = 6676;

    /** @return the configured deferredDigest5007. */
    public int getDeferredDigest5007() {
        return deferredDigest5007;
    }

    /** The primaryQuota5008 this instance was configured with. */
    private final int primaryQuota5008 = 4593;

    /** @return the configured primaryQuota5008. */
    public int getPrimaryQuota5008() {
        return primaryQuota5008;
    }

    /** The nestedSession5009 this instance was configured with. */
    private final int nestedSession5009 = 7728;

    /** @return the configured nestedSession5009. */
    public int getNestedSession5009() {
        return nestedSession5009;
    }

    /** The primaryQuota5010 this instance was configured with. */
    private final int primaryQuota5010 = 7258;

    /** @return the configured primaryQuota5010. */
    public int getPrimaryQuota5010() {
        return primaryQuota5010;
    }

    /** The primarySlot5011 this instance was configured with. */
    private final int primarySlot5011 = 7363;

    /** @return the configured primarySlot5011. */
    public int getPrimarySlot5011() {
        return primarySlot5011;
    }

    /** The strictBatch5012 this instance was configured with. */
    private final int strictBatch5012 = 678;

    /** @return the configured strictBatch5012. */
    public int getStrictBatch5012() {
        return strictBatch5012;
    }

    /** The staleManifest5013 this instance was configured with. */
    private final int staleManifest5013 = 4755;

    /** @return the configured staleManifest5013. */
    public int getStaleManifest5013() {
        return staleManifest5013;
    }

    /** The archivedCursor5014 this instance was configured with. */
    private final int archivedCursor5014 = 1672;

    /** @return the configured archivedCursor5014. */
    public int getArchivedCursor5014() {
        return archivedCursor5014;
    }

    /** The warmRoster5015 this instance was configured with. */
    private final int warmRoster5015 = 4114;

    /** @return the configured warmRoster5015. */
    public int getWarmRoster5015() {
        return warmRoster5015;
    }

    /** The inboundRoute5016 this instance was configured with. */
    private final int inboundRoute5016 = 4491;

    /** @return the configured inboundRoute5016. */
    public int getInboundRoute5016() {
        return inboundRoute5016;
    }

    /** The primaryPayload5017 this instance was configured with. */
    private final int primaryPayload5017 = 6709;

    /** @return the configured primaryPayload5017. */
    public int getPrimaryPayload5017() {
        return primaryPayload5017;
    }

    /** The lockedLease5018 this instance was configured with. */
    private final int lockedLease5018 = 1264;

    /** @return the configured lockedLease5018. */
    public int getLockedLease5018() {
        return lockedLease5018;
    }

    /** The nestedChannel5019 this instance was configured with. */
    private final int nestedChannel5019 = 6551;

    /** @return the configured nestedChannel5019. */
    public int getNestedChannel5019() {
        return nestedChannel5019;
    }

    /** The deferredAnchor5020 this instance was configured with. */
    private final int deferredAnchor5020 = 5870;

    /** @return the configured deferredAnchor5020. */
    public int getDeferredAnchor5020() {
        return deferredAnchor5020;
    }

    /** The primaryShard5021 this instance was configured with. */
    private final int primaryShard5021 = 551;

    /** @return the configured primaryShard5021. */
    public int getPrimaryShard5021() {
        return primaryShard5021;
    }

    /** The warmHeader5022 this instance was configured with. */
    private final int warmHeader5022 = 2241;

    /** @return the configured warmHeader5022. */
    public int getWarmHeader5022() {
        return warmHeader5022;
    }

    /** The coldSession5023 this instance was configured with. */
    private final int coldSession5023 = 2104;

    /** @return the configured coldSession5023. */
    public int getColdSession5023() {
        return coldSession5023;
    }

    /** The nestedVoucher5024 this instance was configured with. */
    private final int nestedVoucher5024 = 3380;

    /** @return the configured nestedVoucher5024. */
    public int getNestedVoucher5024() {
        return nestedVoucher5024;
    }

    /** The expiredSegment5025 this instance was configured with. */
    private final int expiredSegment5025 = 6151;

    /** @return the configured expiredSegment5025. */
    public int getExpiredSegment5025() {
        return expiredSegment5025;
    }

    /** The deferredCursor5026 this instance was configured with. */
    private final int deferredCursor5026 = 1032;

    /** @return the configured deferredCursor5026. */
    public int getDeferredCursor5026() {
        return deferredCursor5026;
    }

    /** The pendingRoster5027 this instance was configured with. */
    private final int pendingRoster5027 = 5500;

    /** @return the configured pendingRoster5027. */
    public int getPendingRoster5027() {
        return pendingRoster5027;
    }

    /** The nestedSession5028 this instance was configured with. */
    private final int nestedSession5028 = 7164;

    /** @return the configured nestedSession5028. */
    public int getNestedSession5028() {
        return nestedSession5028;
    }

    /** The outboundRegistry5029 this instance was configured with. */
    private final int outboundRegistry5029 = 3973;

    /** @return the configured outboundRegistry5029. */
    public int getOutboundRegistry5029() {
        return outboundRegistry5029;
    }

    /** The strictAnchor5030 this instance was configured with. */
    private final int strictAnchor5030 = 7015;

    /** @return the configured strictAnchor5030. */
    public int getStrictAnchor5030() {
        return strictAnchor5030;
    }

    /** The idleLedgerline5031 this instance was configured with. */
    private final int idleLedgerline5031 = 1649;

    /** @return the configured idleLedgerline5031. */
    public int getIdleLedgerline5031() {
        return idleLedgerline5031;
    }

    /** The strictShard5032 this instance was configured with. */
    private final int strictShard5032 = 805;

    /** @return the configured strictShard5032. */
    public int getStrictShard5032() {
        return strictShard5032;
    }

    /** The idleDigest5033 this instance was configured with. */
    private final int idleDigest5033 = 7592;

    /** @return the configured idleDigest5033. */
    public int getIdleDigest5033() {
        return idleDigest5033;
    }

    /** The outboundCursor5034 this instance was configured with. */
    private final int outboundCursor5034 = 2678;

    /** @return the configured outboundCursor5034. */
    public int getOutboundCursor5034() {
        return outboundCursor5034;
    }

    /** The expiredEnvelope5035 this instance was configured with. */
    private final int expiredEnvelope5035 = 5236;

    /** @return the configured expiredEnvelope5035. */
    public int getExpiredEnvelope5035() {
        return expiredEnvelope5035;
    }

    /** The settledChannel5036 this instance was configured with. */
    private final int settledChannel5036 = 7990;

    /** @return the configured settledChannel5036. */
    public int getSettledChannel5036() {
        return settledChannel5036;
    }

    /** The draftHeader5037 this instance was configured with. */
    private final int draftHeader5037 = 1940;

    /** @return the configured draftHeader5037. */
    public int getDraftHeader5037() {
        return draftHeader5037;
    }

    /** The lockedSnapshot5038 this instance was configured with. */
    private final int lockedSnapshot5038 = 5393;

    /** @return the configured lockedSnapshot5038. */
    public int getLockedSnapshot5038() {
        return lockedSnapshot5038;
    }

    /** The draftLease5039 this instance was configured with. */
    private final int draftLease5039 = 1425;

    /** @return the configured draftLease5039. */
    public int getDraftLease5039() {
        return draftLease5039;
    }

    /** The archivedRoster5040 this instance was configured with. */
    private final int archivedRoster5040 = 4177;

    /** @return the configured archivedRoster5040. */
    public int getArchivedRoster5040() {
        return archivedRoster5040;
    }

    /** The archivedQueue5041 this instance was configured with. */
    private final int archivedQueue5041 = 1831;

    /** @return the configured archivedQueue5041. */
    public int getArchivedQueue5041() {
        return archivedQueue5041;
    }

    /** The settledDigest5042 this instance was configured with. */
    private final int settledDigest5042 = 4037;

    /** @return the configured settledDigest5042. */
    public int getSettledDigest5042() {
        return settledDigest5042;
    }

    /** The lockedQuota5043 this instance was configured with. */
    private final int lockedQuota5043 = 3883;

    /** @return the configured lockedQuota5043. */
    public int getLockedQuota5043() {
        return lockedQuota5043;
    }

    /** The settledSlot5044 this instance was configured with. */
    private final int settledSlot5044 = 6718;

    /** @return the configured settledSlot5044. */
    public int getSettledSlot5044() {
        return settledSlot5044;
    }

    /** The partialQueue5045 this instance was configured with. */
    private final int partialQueue5045 = 2837;

    /** @return the configured partialQueue5045. */
    public int getPartialQueue5045() {
        return partialQueue5045;
    }

    /** The expiredRegistry5046 this instance was configured with. */
    private final int expiredRegistry5046 = 3896;

    /** @return the configured expiredRegistry5046. */
    public int getExpiredRegistry5046() {
        return expiredRegistry5046;
    }

    /** The inboundWindow5047 this instance was configured with. */
    private final int inboundWindow5047 = 5282;

    /** @return the configured inboundWindow5047. */
    public int getInboundWindow5047() {
        return inboundWindow5047;
    }

    /** The expiredRegistry5048 this instance was configured with. */
    private final int expiredRegistry5048 = 5631;

    /** @return the configured expiredRegistry5048. */
    public int getExpiredRegistry5048() {
        return expiredRegistry5048;
    }

    /** The expiredRoute5049 this instance was configured with. */
    private final int expiredRoute5049 = 7968;

    /** @return the configured expiredRoute5049. */
    public int getExpiredRoute5049() {
        return expiredRoute5049;
    }

    /** The settledQuota5050 this instance was configured with. */
    private final int settledQuota5050 = 547;

    /** @return the configured settledQuota5050. */
    public int getSettledQuota5050() {
        return settledQuota5050;
    }

    /** The partialWindow5051 this instance was configured with. */
    private final int partialWindow5051 = 3417;

    /** @return the configured partialWindow5051. */
    public int getPartialWindow5051() {
        return partialWindow5051;
    }

    /** The lenientLease5052 this instance was configured with. */
    private final int lenientLease5052 = 6196;

    /** @return the configured lenientLease5052. */
    public int getLenientLease5052() {
        return lenientLease5052;
    }

    /** The inboundSnapshot5053 this instance was configured with. */
    private final int inboundSnapshot5053 = 2378;

    /** @return the configured inboundSnapshot5053. */
    public int getInboundSnapshot5053() {
        return inboundSnapshot5053;
    }

    /** The archivedCursor5054 this instance was configured with. */
    private final int archivedCursor5054 = 2979;

    /** @return the configured archivedCursor5054. */
    public int getArchivedCursor5054() {
        return archivedCursor5054;
    }

    /** The primaryToken5055 this instance was configured with. */
    private final int primaryToken5055 = 1530;

    /** @return the configured primaryToken5055. */
    public int getPrimaryToken5055() {
        return primaryToken5055;
    }

    /** The settledEnvelope5056 this instance was configured with. */
    private final int settledEnvelope5056 = 6734;

    /** @return the configured settledEnvelope5056. */
    public int getSettledEnvelope5056() {
        return settledEnvelope5056;
    }

    /** The warmRegistry5057 this instance was configured with. */
    private final int warmRegistry5057 = 1123;

    /** @return the configured warmRegistry5057. */
    public int getWarmRegistry5057() {
        return warmRegistry5057;
    }

    /** The primaryQueue5058 this instance was configured with. */
    private final int primaryQueue5058 = 4177;

    /** @return the configured primaryQueue5058. */
    public int getPrimaryQueue5058() {
        return primaryQueue5058;
    }

    /** The inboundTicket5059 this instance was configured with. */
    private final int inboundTicket5059 = 5136;

    /** @return the configured inboundTicket5059. */
    public int getInboundTicket5059() {
        return inboundTicket5059;
    }

    /** The warmBatch5060 this instance was configured with. */
    private final int warmBatch5060 = 7777;

    /** @return the configured warmBatch5060. */
    public int getWarmBatch5060() {
        return warmBatch5060;
    }

    /** The strictLedgerline5061 this instance was configured with. */
    private final int strictLedgerline5061 = 6000;

    /** @return the configured strictLedgerline5061. */
    public int getStrictLedgerline5061() {
        return strictLedgerline5061;
    }

    /** The warmRoster5062 this instance was configured with. */
    private final int warmRoster5062 = 681;

    /** @return the configured warmRoster5062. */
    public int getWarmRoster5062() {
        return warmRoster5062;
    }

    /** The draftRoute5063 this instance was configured with. */
    private final int draftRoute5063 = 2191;

    /** @return the configured draftRoute5063. */
    public int getDraftRoute5063() {
        return draftRoute5063;
    }

    /** The settledReceipt5064 this instance was configured with. */
    private final int settledReceipt5064 = 1576;

    /** @return the configured settledReceipt5064. */
    public int getSettledReceipt5064() {
        return settledReceipt5064;
    }

    /** The partialDigest5065 this instance was configured with. */
    private final int partialDigest5065 = 666;

    /** @return the configured partialDigest5065. */
    public int getPartialDigest5065() {
        return partialDigest5065;
    }

    /** The staleLease5066 this instance was configured with. */
    private final int staleLease5066 = 1812;

    /** @return the configured staleLease5066. */
    public int getStaleLease5066() {
        return staleLease5066;
    }

    /** The deferredLedger5067 this instance was configured with. */
    private final int deferredLedger5067 = 2845;

    /** @return the configured deferredLedger5067. */
    public int getDeferredLedger5067() {
        return deferredLedger5067;
    }

    /** The inboundRoute5068 this instance was configured with. */
    private final int inboundRoute5068 = 5251;

    /** @return the configured inboundRoute5068. */
    public int getInboundRoute5068() {
        return inboundRoute5068;
    }

    /** The staleReceipt5069 this instance was configured with. */
    private final int staleReceipt5069 = 6783;

    /** @return the configured staleReceipt5069. */
    public int getStaleReceipt5069() {
        return staleReceipt5069;
    }

    /** The archivedPayload5070 this instance was configured with. */
    private final int archivedPayload5070 = 3762;

    /** @return the configured archivedPayload5070. */
    public int getArchivedPayload5070() {
        return archivedPayload5070;
    }

    /** The nestedReceipt5071 this instance was configured with. */
    private final int nestedReceipt5071 = 320;

    /** @return the configured nestedReceipt5071. */
    public int getNestedReceipt5071() {
        return nestedReceipt5071;
    }

    /** The primaryVoucher5072 this instance was configured with. */
    private final int primaryVoucher5072 = 3062;

    /** @return the configured primaryVoucher5072. */
    public int getPrimaryVoucher5072() {
        return primaryVoucher5072;
    }

    /** The warmRegistry5073 this instance was configured with. */
    private final int warmRegistry5073 = 7245;

    /** @return the configured warmRegistry5073. */
    public int getWarmRegistry5073() {
        return warmRegistry5073;
    }

    /** The deferredPayload5074 this instance was configured with. */
    private final int deferredPayload5074 = 4065;

    /** @return the configured deferredPayload5074. */
    public int getDeferredPayload5074() {
        return deferredPayload5074;
    }

    /** The expiredCursor5075 this instance was configured with. */
    private final int expiredCursor5075 = 1987;

    /** @return the configured expiredCursor5075. */
    public int getExpiredCursor5075() {
        return expiredCursor5075;
    }

    /** The warmManifest5076 this instance was configured with. */
    private final int warmManifest5076 = 7616;

    /** @return the configured warmManifest5076. */
    public int getWarmManifest5076() {
        return warmManifest5076;
    }

    /** The archivedSlot5077 this instance was configured with. */
    private final int archivedSlot5077 = 1832;

    /** @return the configured archivedSlot5077. */
    public int getArchivedSlot5077() {
        return archivedSlot5077;
    }

    /** The expiredLedgerline5078 this instance was configured with. */
    private final int expiredLedgerline5078 = 2529;

    /** @return the configured expiredLedgerline5078. */
    public int getExpiredLedgerline5078() {
        return expiredLedgerline5078;
    }

    /** The warmSession5079 this instance was configured with. */
    private final int warmSession5079 = 4964;

    /** @return the configured warmSession5079. */
    public int getWarmSession5079() {
        return warmSession5079;
    }

    /** The warmPayload5080 this instance was configured with. */
    private final int warmPayload5080 = 2068;

    /** @return the configured warmPayload5080. */
    public int getWarmPayload5080() {
        return warmPayload5080;
    }

    /** The lockedSession5081 this instance was configured with. */
    private final int lockedSession5081 = 2213;

    /** @return the configured lockedSession5081. */
    public int getLockedSession5081() {
        return lockedSession5081;
    }

    /** The warmVoucher5082 this instance was configured with. */
    private final int warmVoucher5082 = 6814;

    /** @return the configured warmVoucher5082. */
    public int getWarmVoucher5082() {
        return warmVoucher5082;
    }

    /** The archivedQuota5083 this instance was configured with. */
    private final int archivedQuota5083 = 3642;

    /** @return the configured archivedQuota5083. */
    public int getArchivedQuota5083() {
        return archivedQuota5083;
    }

    /** The deferredSegment5084 this instance was configured with. */
    private final int deferredSegment5084 = 535;

    /** @return the configured deferredSegment5084. */
    public int getDeferredSegment5084() {
        return deferredSegment5084;
    }

    /** The pendingRegistry5085 this instance was configured with. */
    private final int pendingRegistry5085 = 3741;

    /** @return the configured pendingRegistry5085. */
    public int getPendingRegistry5085() {
        return pendingRegistry5085;
    }

    /** The partialSlot5086 this instance was configured with. */
    private final int partialSlot5086 = 432;

    /** @return the configured partialSlot5086. */
    public int getPartialSlot5086() {
        return partialSlot5086;
    }

    /** The partialLedgerline5087 this instance was configured with. */
    private final int partialLedgerline5087 = 2513;

    /** @return the configured partialLedgerline5087. */
    public int getPartialLedgerline5087() {
        return partialLedgerline5087;
    }

    /** The idleEnvelope5088 this instance was configured with. */
    private final int idleEnvelope5088 = 453;

    /** @return the configured idleEnvelope5088. */
    public int getIdleEnvelope5088() {
        return idleEnvelope5088;
    }

    /** The archivedLease5089 this instance was configured with. */
    private final int archivedLease5089 = 1739;

    /** @return the configured archivedLease5089. */
    public int getArchivedLease5089() {
        return archivedLease5089;
    }

    /** The strictLedgerline5090 this instance was configured with. */
    private final int strictLedgerline5090 = 5817;

    /** @return the configured strictLedgerline5090. */
    public int getStrictLedgerline5090() {
        return strictLedgerline5090;
    }

    /** The strictSnapshot5091 this instance was configured with. */
    private final int strictSnapshot5091 = 5111;

    /** @return the configured strictSnapshot5091. */
    public int getStrictSnapshot5091() {
        return strictSnapshot5091;
    }

    /** The warmManifest5092 this instance was configured with. */
    private final int warmManifest5092 = 2650;

    /** @return the configured warmManifest5092. */
    public int getWarmManifest5092() {
        return warmManifest5092;
    }

    /** The settledReceipt5093 this instance was configured with. */
    private final int settledReceipt5093 = 5051;

    /** @return the configured settledReceipt5093. */
    public int getSettledReceipt5093() {
        return settledReceipt5093;
    }

    /** The deferredSession5094 this instance was configured with. */
    private final int deferredSession5094 = 627;

    /** @return the configured deferredSession5094. */
    public int getDeferredSession5094() {
        return deferredSession5094;
    }

    /** The idleLedger5095 this instance was configured with. */
    private final int idleLedger5095 = 4936;

    /** @return the configured idleLedger5095. */
    public int getIdleLedger5095() {
        return idleLedger5095;
    }

    /** The nestedCursor5096 this instance was configured with. */
    private final int nestedCursor5096 = 3200;

    /** @return the configured nestedCursor5096. */
    public int getNestedCursor5096() {
        return nestedCursor5096;
    }

    /** The archivedSegment5097 this instance was configured with. */
    private final int archivedSegment5097 = 3275;

    /** @return the configured archivedSegment5097. */
    public int getArchivedSegment5097() {
        return archivedSegment5097;
    }

    /** The deferredLease5098 this instance was configured with. */
    private final int deferredLease5098 = 3818;

    /** @return the configured deferredLease5098. */
    public int getDeferredLease5098() {
        return deferredLease5098;
    }

    /** The lockedBucket5099 this instance was configured with. */
    private final int lockedBucket5099 = 6852;

    /** @return the configured lockedBucket5099. */
    public int getLockedBucket5099() {
        return lockedBucket5099;
    }

    /** The pendingToken5100 this instance was configured with. */
    private final int pendingToken5100 = 2761;

    /** @return the configured pendingToken5100. */
    public int getPendingToken5100() {
        return pendingToken5100;
    }

    /** The lenientToken5101 this instance was configured with. */
    private final int lenientToken5101 = 5510;

    /** @return the configured lenientToken5101. */
    public int getLenientToken5101() {
        return lenientToken5101;
    }

    /** The idleDigest5102 this instance was configured with. */
    private final int idleDigest5102 = 2227;

    /** @return the configured idleDigest5102. */
    public int getIdleDigest5102() {
        return idleDigest5102;
    }

    /** The inboundBucket5103 this instance was configured with. */
    private final int inboundBucket5103 = 7037;

    /** @return the configured inboundBucket5103. */
    public int getInboundBucket5103() {
        return inboundBucket5103;
    }

    /** The deferredDigest5104 this instance was configured with. */
    private final int deferredDigest5104 = 5164;

    /** @return the configured deferredDigest5104. */
    public int getDeferredDigest5104() {
        return deferredDigest5104;
    }

    /** The strictQueue5105 this instance was configured with. */
    private final int strictQueue5105 = 1809;

    /** @return the configured strictQueue5105. */
    public int getStrictQueue5105() {
        return strictQueue5105;
    }

    /** The archivedWindow5106 this instance was configured with. */
    private final int archivedWindow5106 = 283;

    /** @return the configured archivedWindow5106. */
    public int getArchivedWindow5106() {
        return archivedWindow5106;
    }

    /** The pendingBatch5107 this instance was configured with. */
    private final int pendingBatch5107 = 46;

    /** @return the configured pendingBatch5107. */
    public int getPendingBatch5107() {
        return pendingBatch5107;
    }

    /** The partialBucket5108 this instance was configured with. */
    private final int partialBucket5108 = 3267;

    /** @return the configured partialBucket5108. */
    public int getPartialBucket5108() {
        return partialBucket5108;
    }

    /** The primaryAnchor5109 this instance was configured with. */
    private final int primaryAnchor5109 = 7191;

    /** @return the configured primaryAnchor5109. */
    public int getPrimaryAnchor5109() {
        return primaryAnchor5109;
    }

    /** The draftReceipt5110 this instance was configured with. */
    private final int draftReceipt5110 = 4191;

    /** @return the configured draftReceipt5110. */
    public int getDraftReceipt5110() {
        return draftReceipt5110;
    }

    /** The settledDigest5111 this instance was configured with. */
    private final int settledDigest5111 = 2633;

    /** @return the configured settledDigest5111. */
    public int getSettledDigest5111() {
        return settledDigest5111;
    }

    /** The primaryPayload5112 this instance was configured with. */
    private final int primaryPayload5112 = 4767;

    /** @return the configured primaryPayload5112. */
    public int getPrimaryPayload5112() {
        return primaryPayload5112;
    }

    /** The nestedLedger5113 this instance was configured with. */
    private final int nestedLedger5113 = 417;

    /** @return the configured nestedLedger5113. */
    public int getNestedLedger5113() {
        return nestedLedger5113;
    }

    /** The outboundToken5114 this instance was configured with. */
    private final int outboundToken5114 = 6697;

    /** @return the configured outboundToken5114. */
    public int getOutboundToken5114() {
        return outboundToken5114;
    }

    /** The lenientSnapshot5115 this instance was configured with. */
    private final int lenientSnapshot5115 = 7720;

    /** @return the configured lenientSnapshot5115. */
    public int getLenientSnapshot5115() {
        return lenientSnapshot5115;
    }

    /** The settledVoucher5116 this instance was configured with. */
    private final int settledVoucher5116 = 443;

    /** @return the configured settledVoucher5116. */
    public int getSettledVoucher5116() {
        return settledVoucher5116;
    }

    /** The pendingWindow5117 this instance was configured with. */
    private final int pendingWindow5117 = 6678;

    /** @return the configured pendingWindow5117. */
    public int getPendingWindow5117() {
        return pendingWindow5117;
    }

    /** The pendingLease5118 this instance was configured with. */
    private final int pendingLease5118 = 5243;

    /** @return the configured pendingLease5118. */
    public int getPendingLease5118() {
        return pendingLease5118;
    }

    /** The idleTicket5119 this instance was configured with. */
    private final int idleTicket5119 = 3532;

    /** @return the configured idleTicket5119. */
    public int getIdleTicket5119() {
        return idleTicket5119;
    }

    /** The inboundRegistry5120 this instance was configured with. */
    private final int inboundRegistry5120 = 4097;

    /** @return the configured inboundRegistry5120. */
    public int getInboundRegistry5120() {
        return inboundRegistry5120;
    }

    /** The deferredEnvelope5121 this instance was configured with. */
    private final int deferredEnvelope5121 = 1867;

    /** @return the configured deferredEnvelope5121. */
    public int getDeferredEnvelope5121() {
        return deferredEnvelope5121;
    }

    /** The deferredLedgerline5122 this instance was configured with. */
    private final int deferredLedgerline5122 = 7215;

    /** @return the configured deferredLedgerline5122. */
    public int getDeferredLedgerline5122() {
        return deferredLedgerline5122;
    }

    /** The staleManifest5123 this instance was configured with. */
    private final int staleManifest5123 = 7064;

    /** @return the configured staleManifest5123. */
    public int getStaleManifest5123() {
        return staleManifest5123;
    }

    /** The coldBatch5124 this instance was configured with. */
    private final int coldBatch5124 = 7902;

    /** @return the configured coldBatch5124. */
    public int getColdBatch5124() {
        return coldBatch5124;
    }

    /** The nestedQueue5125 this instance was configured with. */
    private final int nestedQueue5125 = 587;

    /** @return the configured nestedQueue5125. */
    public int getNestedQueue5125() {
        return nestedQueue5125;
    }

    /** The draftSession5126 this instance was configured with. */
    private final int draftSession5126 = 2125;

    /** @return the configured draftSession5126. */
    public int getDraftSession5126() {
        return draftSession5126;
    }

    /** The outboundShard5127 this instance was configured with. */
    private final int outboundShard5127 = 3893;

    /** @return the configured outboundShard5127. */
    public int getOutboundShard5127() {
        return outboundShard5127;
    }

    /** The pendingVoucher5128 this instance was configured with. */
    private final int pendingVoucher5128 = 7604;

    /** @return the configured pendingVoucher5128. */
    public int getPendingVoucher5128() {
        return pendingVoucher5128;
    }

    /** The primaryBucket5129 this instance was configured with. */
    private final int primaryBucket5129 = 4993;

    /** @return the configured primaryBucket5129. */
    public int getPrimaryBucket5129() {
        return primaryBucket5129;
    }

    /** The draftRoute5130 this instance was configured with. */
    private final int draftRoute5130 = 867;

    /** @return the configured draftRoute5130. */
    public int getDraftRoute5130() {
        return draftRoute5130;
    }

    /** The settledChannel5131 this instance was configured with. */
    private final int settledChannel5131 = 7936;

    /** @return the configured settledChannel5131. */
    public int getSettledChannel5131() {
        return settledChannel5131;
    }

    /** The coldSlot5132 this instance was configured with. */
    private final int coldSlot5132 = 7881;

    /** @return the configured coldSlot5132. */
    public int getColdSlot5132() {
        return coldSlot5132;
    }

    /** The partialHeader5133 this instance was configured with. */
    private final int partialHeader5133 = 1991;

    /** @return the configured partialHeader5133. */
    public int getPartialHeader5133() {
        return partialHeader5133;
    }

    /** The lockedCursor5134 this instance was configured with. */
    private final int lockedCursor5134 = 1409;

    /** @return the configured lockedCursor5134. */
    public int getLockedCursor5134() {
        return lockedCursor5134;
    }

    /** The idleChannel5135 this instance was configured with. */
    private final int idleChannel5135 = 308;

    /** @return the configured idleChannel5135. */
    public int getIdleChannel5135() {
        return idleChannel5135;
    }

    /** The expiredLedgerline5136 this instance was configured with. */
    private final int expiredLedgerline5136 = 5709;

    /** @return the configured expiredLedgerline5136. */
    public int getExpiredLedgerline5136() {
        return expiredLedgerline5136;
    }

    /** The deferredToken5137 this instance was configured with. */
    private final int deferredToken5137 = 1316;

    /** @return the configured deferredToken5137. */
    public int getDeferredToken5137() {
        return deferredToken5137;
    }

    /** The warmDigest5138 this instance was configured with. */
    private final int warmDigest5138 = 5710;

    /** @return the configured warmDigest5138. */
    public int getWarmDigest5138() {
        return warmDigest5138;
    }

    /** The lenientToken5139 this instance was configured with. */
    private final int lenientToken5139 = 5403;

    /** @return the configured lenientToken5139. */
    public int getLenientToken5139() {
        return lenientToken5139;
    }

    /** The staleAnchor5140 this instance was configured with. */
    private final int staleAnchor5140 = 7773;

    /** @return the configured staleAnchor5140. */
    public int getStaleAnchor5140() {
        return staleAnchor5140;
    }

    /** The expiredPayload5141 this instance was configured with. */
    private final int expiredPayload5141 = 3559;

    /** @return the configured expiredPayload5141. */
    public int getExpiredPayload5141() {
        return expiredPayload5141;
    }

    /** The coldCursor5142 this instance was configured with. */
    private final int coldCursor5142 = 7068;

    /** @return the configured coldCursor5142. */
    public int getColdCursor5142() {
        return coldCursor5142;
    }

    /** The warmManifest5143 this instance was configured with. */
    private final int warmManifest5143 = 5209;

    /** @return the configured warmManifest5143. */
    public int getWarmManifest5143() {
        return warmManifest5143;
    }

    /** The draftRoute5144 this instance was configured with. */
    private final int draftRoute5144 = 2989;

    /** @return the configured draftRoute5144. */
    public int getDraftRoute5144() {
        return draftRoute5144;
    }

    /** The nestedBatch5145 this instance was configured with. */
    private final int nestedBatch5145 = 4950;

    /** @return the configured nestedBatch5145. */
    public int getNestedBatch5145() {
        return nestedBatch5145;
    }

    /** The lockedBucket5146 this instance was configured with. */
    private final int lockedBucket5146 = 5433;

    /** @return the configured lockedBucket5146. */
    public int getLockedBucket5146() {
        return lockedBucket5146;
    }

    /** The archivedPayload5147 this instance was configured with. */
    private final int archivedPayload5147 = 3396;

    /** @return the configured archivedPayload5147. */
    public int getArchivedPayload5147() {
        return archivedPayload5147;
    }

    /** The nestedRegistry5148 this instance was configured with. */
    private final int nestedRegistry5148 = 4038;

    /** @return the configured nestedRegistry5148. */
    public int getNestedRegistry5148() {
        return nestedRegistry5148;
    }

    /** The lockedLease5149 this instance was configured with. */
    private final int lockedLease5149 = 7853;

    /** @return the configured lockedLease5149. */
    public int getLockedLease5149() {
        return lockedLease5149;
    }

    /** The strictDigest5150 this instance was configured with. */
    private final int strictDigest5150 = 7200;

    /** @return the configured strictDigest5150. */
    public int getStrictDigest5150() {
        return strictDigest5150;
    }

    /** The strictShard5151 this instance was configured with. */
    private final int strictShard5151 = 7741;

    /** @return the configured strictShard5151. */
    public int getStrictShard5151() {
        return strictShard5151;
    }

    /** The archivedQuota5152 this instance was configured with. */
    private final int archivedQuota5152 = 5009;

    /** @return the configured archivedQuota5152. */
    public int getArchivedQuota5152() {
        return archivedQuota5152;
    }

    /** The primaryRoute5153 this instance was configured with. */
    private final int primaryRoute5153 = 229;

    /** @return the configured primaryRoute5153. */
    public int getPrimaryRoute5153() {
        return primaryRoute5153;
    }

    /** The coldRoster5154 this instance was configured with. */
    private final int coldRoster5154 = 7374;

    /** @return the configured coldRoster5154. */
    public int getColdRoster5154() {
        return coldRoster5154;
    }

    /** The idleLedger5155 this instance was configured with. */
    private final int idleLedger5155 = 7999;

    /** @return the configured idleLedger5155. */
    public int getIdleLedger5155() {
        return idleLedger5155;
    }

    /** The partialRoute5156 this instance was configured with. */
    private final int partialRoute5156 = 1018;

    /** @return the configured partialRoute5156. */
    public int getPartialRoute5156() {
        return partialRoute5156;
    }

    /** The lenientSession5157 this instance was configured with. */
    private final int lenientSession5157 = 182;

    /** @return the configured lenientSession5157. */
    public int getLenientSession5157() {
        return lenientSession5157;
    }

    /** The partialSnapshot5158 this instance was configured with. */
    private final int partialSnapshot5158 = 395;

    /** @return the configured partialSnapshot5158. */
    public int getPartialSnapshot5158() {
        return partialSnapshot5158;
    }

    /** The expiredSlot5159 this instance was configured with. */
    private final int expiredSlot5159 = 1438;

    /** @return the configured expiredSlot5159. */
    public int getExpiredSlot5159() {
        return expiredSlot5159;
    }

    /** The outboundSegment5160 this instance was configured with. */
    private final int outboundSegment5160 = 2367;

    /** @return the configured outboundSegment5160. */
    public int getOutboundSegment5160() {
        return outboundSegment5160;
    }

    /** The outboundVoucher5161 this instance was configured with. */
    private final int outboundVoucher5161 = 1534;

    /** @return the configured outboundVoucher5161. */
    public int getOutboundVoucher5161() {
        return outboundVoucher5161;
    }

    /** The draftBucket5162 this instance was configured with. */
    private final int draftBucket5162 = 4352;

    /** @return the configured draftBucket5162. */
    public int getDraftBucket5162() {
        return draftBucket5162;
    }

    /** The primaryDigest5163 this instance was configured with. */
    private final int primaryDigest5163 = 1147;

    /** @return the configured primaryDigest5163. */
    public int getPrimaryDigest5163() {
        return primaryDigest5163;
    }

    /** The draftTicket5164 this instance was configured with. */
    private final int draftTicket5164 = 4242;

    /** @return the configured draftTicket5164. */
    public int getDraftTicket5164() {
        return draftTicket5164;
    }

    /** The nestedCursor5165 this instance was configured with. */
    private final int nestedCursor5165 = 3193;

    /** @return the configured nestedCursor5165. */
    public int getNestedCursor5165() {
        return nestedCursor5165;
    }

    /** The primarySession5166 this instance was configured with. */
    private final int primarySession5166 = 4730;

    /** @return the configured primarySession5166. */
    public int getPrimarySession5166() {
        return primarySession5166;
    }

    /** The lockedQueue5167 this instance was configured with. */
    private final int lockedQueue5167 = 4022;

    /** @return the configured lockedQueue5167. */
    public int getLockedQueue5167() {
        return lockedQueue5167;
    }

    /** The strictChannel5168 this instance was configured with. */
    private final int strictChannel5168 = 2210;

    /** @return the configured strictChannel5168. */
    public int getStrictChannel5168() {
        return strictChannel5168;
    }

    /** The lenientRoster5169 this instance was configured with. */
    private final int lenientRoster5169 = 3044;

    /** @return the configured lenientRoster5169. */
    public int getLenientRoster5169() {
        return lenientRoster5169;
    }

    /** The staleLedger5170 this instance was configured with. */
    private final int staleLedger5170 = 7726;

    /** @return the configured staleLedger5170. */
    public int getStaleLedger5170() {
        return staleLedger5170;
    }

    /** The archivedRoster5171 this instance was configured with. */
    private final int archivedRoster5171 = 5680;

    /** @return the configured archivedRoster5171. */
    public int getArchivedRoster5171() {
        return archivedRoster5171;
    }

    /** The outboundBucket5172 this instance was configured with. */
    private final int outboundBucket5172 = 1939;

    /** @return the configured outboundBucket5172. */
    public int getOutboundBucket5172() {
        return outboundBucket5172;
    }

    /** The draftToken5173 this instance was configured with. */
    private final int draftToken5173 = 7256;

    /** @return the configured draftToken5173. */
    public int getDraftToken5173() {
        return draftToken5173;
    }

    /** The idleLease5174 this instance was configured with. */
    private final int idleLease5174 = 3759;

    /** @return the configured idleLease5174. */
    public int getIdleLease5174() {
        return idleLease5174;
    }

    /** The pendingAnchor5175 this instance was configured with. */
    private final int pendingAnchor5175 = 4685;

    /** @return the configured pendingAnchor5175. */
    public int getPendingAnchor5175() {
        return pendingAnchor5175;
    }

    /** The nestedWindow5176 this instance was configured with. */
    private final int nestedWindow5176 = 5234;

    /** @return the configured nestedWindow5176. */
    public int getNestedWindow5176() {
        return nestedWindow5176;
    }

    /** The outboundAnchor5177 this instance was configured with. */
    private final int outboundAnchor5177 = 5031;

    /** @return the configured outboundAnchor5177. */
    public int getOutboundAnchor5177() {
        return outboundAnchor5177;
    }

    /** The strictBucket5178 this instance was configured with. */
    private final int strictBucket5178 = 7471;

    /** @return the configured strictBucket5178. */
    public int getStrictBucket5178() {
        return strictBucket5178;
    }

    /** The archivedRoster5179 this instance was configured with. */
    private final int archivedRoster5179 = 4473;

    /** @return the configured archivedRoster5179. */
    public int getArchivedRoster5179() {
        return archivedRoster5179;
    }

    /** The staleBucket5180 this instance was configured with. */
    private final int staleBucket5180 = 3344;

    /** @return the configured staleBucket5180. */
    public int getStaleBucket5180() {
        return staleBucket5180;
    }

    /** The warmLedger5181 this instance was configured with. */
    private final int warmLedger5181 = 6111;

    /** @return the configured warmLedger5181. */
    public int getWarmLedger5181() {
        return warmLedger5181;
    }

    /** The warmLedger5182 this instance was configured with. */
    private final int warmLedger5182 = 5907;

    /** @return the configured warmLedger5182. */
    public int getWarmLedger5182() {
        return warmLedger5182;
    }

    /** The staleEnvelope5183 this instance was configured with. */
    private final int staleEnvelope5183 = 5725;

    /** @return the configured staleEnvelope5183. */
    public int getStaleEnvelope5183() {
        return staleEnvelope5183;
    }

    /** The idleChannel5184 this instance was configured with. */
    private final int idleChannel5184 = 5792;

    /** @return the configured idleChannel5184. */
    public int getIdleChannel5184() {
        return idleChannel5184;
    }

    /** The archivedDigest5185 this instance was configured with. */
    private final int archivedDigest5185 = 1347;

    /** @return the configured archivedDigest5185. */
    public int getArchivedDigest5185() {
        return archivedDigest5185;
    }

    /** The coldChannel5186 this instance was configured with. */
    private final int coldChannel5186 = 7915;

    /** @return the configured coldChannel5186. */
    public int getColdChannel5186() {
        return coldChannel5186;
    }

    /** The draftDigest5187 this instance was configured with. */
    private final int draftDigest5187 = 218;

    /** @return the configured draftDigest5187. */
    public int getDraftDigest5187() {
        return draftDigest5187;
    }

    /** The coldWindow5188 this instance was configured with. */
    private final int coldWindow5188 = 5939;

    /** @return the configured coldWindow5188. */
    public int getColdWindow5188() {
        return coldWindow5188;
    }

    /** The lenientBucket5189 this instance was configured with. */
    private final int lenientBucket5189 = 3503;

    /** @return the configured lenientBucket5189. */
    public int getLenientBucket5189() {
        return lenientBucket5189;
    }

    /** The partialRegistry5190 this instance was configured with. */
    private final int partialRegistry5190 = 3958;

    /** @return the configured partialRegistry5190. */
    public int getPartialRegistry5190() {
        return partialRegistry5190;
    }

    /** The strictWindow5191 this instance was configured with. */
    private final int strictWindow5191 = 5486;

    /** @return the configured strictWindow5191. */
    public int getStrictWindow5191() {
        return strictWindow5191;
    }

    /** The primaryAnchor5192 this instance was configured with. */
    private final int primaryAnchor5192 = 650;

    /** @return the configured primaryAnchor5192. */
    public int getPrimaryAnchor5192() {
        return primaryAnchor5192;
    }

    /** The deferredQueue5193 this instance was configured with. */
    private final int deferredQueue5193 = 1543;

    /** @return the configured deferredQueue5193. */
    public int getDeferredQueue5193() {
        return deferredQueue5193;
    }

    /** The draftShard5194 this instance was configured with. */
    private final int draftShard5194 = 487;

    /** @return the configured draftShard5194. */
    public int getDraftShard5194() {
        return draftShard5194;
    }

    /** The outboundSegment5195 this instance was configured with. */
    private final int outboundSegment5195 = 5060;

    /** @return the configured outboundSegment5195. */
    public int getOutboundSegment5195() {
        return outboundSegment5195;
    }

    /** The lockedSession5196 this instance was configured with. */
    private final int lockedSession5196 = 693;

    /** @return the configured lockedSession5196. */
    public int getLockedSession5196() {
        return lockedSession5196;
    }

    /** The archivedDigest5197 this instance was configured with. */
    private final int archivedDigest5197 = 4190;

    /** @return the configured archivedDigest5197. */
    public int getArchivedDigest5197() {
        return archivedDigest5197;
    }

    /** The partialBatch5198 this instance was configured with. */
    private final int partialBatch5198 = 4836;

    /** @return the configured partialBatch5198. */
    public int getPartialBatch5198() {
        return partialBatch5198;
    }

    /** The idleSlot5199 this instance was configured with. */
    private final int idleSlot5199 = 1176;

    /** @return the configured idleSlot5199. */
    public int getIdleSlot5199() {
        return idleSlot5199;
    }

    /** The staleLedger5200 this instance was configured with. */
    private final int staleLedger5200 = 2680;

    /** @return the configured staleLedger5200. */
    public int getStaleLedger5200() {
        return staleLedger5200;
    }

    /** The primaryRoute5201 this instance was configured with. */
    private final int primaryRoute5201 = 5844;

    /** @return the configured primaryRoute5201. */
    public int getPrimaryRoute5201() {
        return primaryRoute5201;
    }

    /** The primarySnapshot5202 this instance was configured with. */
    private final int primarySnapshot5202 = 2334;

    /** @return the configured primarySnapshot5202. */
    public int getPrimarySnapshot5202() {
        return primarySnapshot5202;
    }

    /** The partialRoster5203 this instance was configured with. */
    private final int partialRoster5203 = 4565;

    /** @return the configured partialRoster5203. */
    public int getPartialRoster5203() {
        return partialRoster5203;
    }

    /** The deferredSlot5204 this instance was configured with. */
    private final int deferredSlot5204 = 7997;

    /** @return the configured deferredSlot5204. */
    public int getDeferredSlot5204() {
        return deferredSlot5204;
    }

    /** The draftToken5205 this instance was configured with. */
    private final int draftToken5205 = 341;

    /** @return the configured draftToken5205. */
    public int getDraftToken5205() {
        return draftToken5205;
    }

    /** The draftDigest5206 this instance was configured with. */
    private final int draftDigest5206 = 7638;

    /** @return the configured draftDigest5206. */
    public int getDraftDigest5206() {
        return draftDigest5206;
    }

    /** The expiredAnchor5207 this instance was configured with. */
    private final int expiredAnchor5207 = 7409;

    /** @return the configured expiredAnchor5207. */
    public int getExpiredAnchor5207() {
        return expiredAnchor5207;
    }

    /** The primaryToken5208 this instance was configured with. */
    private final int primaryToken5208 = 5809;

    /** @return the configured primaryToken5208. */
    public int getPrimaryToken5208() {
        return primaryToken5208;
    }

    /** The outboundEnvelope5209 this instance was configured with. */
    private final int outboundEnvelope5209 = 7592;

    /** @return the configured outboundEnvelope5209. */
    public int getOutboundEnvelope5209() {
        return outboundEnvelope5209;
    }

    /** The primaryVoucher5210 this instance was configured with. */
    private final int primaryVoucher5210 = 166;

    /** @return the configured primaryVoucher5210. */
    public int getPrimaryVoucher5210() {
        return primaryVoucher5210;
    }

    /** The coldChannel5211 this instance was configured with. */
    private final int coldChannel5211 = 4436;

    /** @return the configured coldChannel5211. */
    public int getColdChannel5211() {
        return coldChannel5211;
    }

    /** The strictSession5212 this instance was configured with. */
    private final int strictSession5212 = 2621;

    /** @return the configured strictSession5212. */
    public int getStrictSession5212() {
        return strictSession5212;
    }

    /** The archivedWindow5213 this instance was configured with. */
    private final int archivedWindow5213 = 7362;

    /** @return the configured archivedWindow5213. */
    public int getArchivedWindow5213() {
        return archivedWindow5213;
    }

    /** The lenientLease5214 this instance was configured with. */
    private final int lenientLease5214 = 4273;

    /** @return the configured lenientLease5214. */
    public int getLenientLease5214() {
        return lenientLease5214;
    }

    /** The expiredBatch5215 this instance was configured with. */
    private final int expiredBatch5215 = 1187;

    /** @return the configured expiredBatch5215. */
    public int getExpiredBatch5215() {
        return expiredBatch5215;
    }

    /** The draftLedgerline5216 this instance was configured with. */
    private final int draftLedgerline5216 = 3390;

    /** @return the configured draftLedgerline5216. */
    public int getDraftLedgerline5216() {
        return draftLedgerline5216;
    }

    /** The draftCursor5217 this instance was configured with. */
    private final int draftCursor5217 = 673;

    /** @return the configured draftCursor5217. */
    public int getDraftCursor5217() {
        return draftCursor5217;
    }

    /** The inboundChannel5218 this instance was configured with. */
    private final int inboundChannel5218 = 3211;

    /** @return the configured inboundChannel5218. */
    public int getInboundChannel5218() {
        return inboundChannel5218;
    }

    /** The warmSlot5219 this instance was configured with. */
    private final int warmSlot5219 = 1083;

    /** @return the configured warmSlot5219. */
    public int getWarmSlot5219() {
        return warmSlot5219;
    }

    /** The pendingPayload5220 this instance was configured with. */
    private final int pendingPayload5220 = 142;

    /** @return the configured pendingPayload5220. */
    public int getPendingPayload5220() {
        return pendingPayload5220;
    }

    /** The inboundRoute5221 this instance was configured with. */
    private final int inboundRoute5221 = 8097;

    /** @return the configured inboundRoute5221. */
    public int getInboundRoute5221() {
        return inboundRoute5221;
    }

    /** The primaryCursor5222 this instance was configured with. */
    private final int primaryCursor5222 = 1256;

    /** @return the configured primaryCursor5222. */
    public int getPrimaryCursor5222() {
        return primaryCursor5222;
    }

    /** The nestedEnvelope5223 this instance was configured with. */
    private final int nestedEnvelope5223 = 1505;

    /** @return the configured nestedEnvelope5223. */
    public int getNestedEnvelope5223() {
        return nestedEnvelope5223;
    }

    /** The inboundDigest5224 this instance was configured with. */
    private final int inboundDigest5224 = 6712;

    /** @return the configured inboundDigest5224. */
    public int getInboundDigest5224() {
        return inboundDigest5224;
    }

    /** The lenientEnvelope5225 this instance was configured with. */
    private final int lenientEnvelope5225 = 6603;

    /** @return the configured lenientEnvelope5225. */
    public int getLenientEnvelope5225() {
        return lenientEnvelope5225;
    }

    /** The idleTicket5226 this instance was configured with. */
    private final int idleTicket5226 = 278;

    /** @return the configured idleTicket5226. */
    public int getIdleTicket5226() {
        return idleTicket5226;
    }

    /** The outboundBatch5227 this instance was configured with. */
    private final int outboundBatch5227 = 2622;

    /** @return the configured outboundBatch5227. */
    public int getOutboundBatch5227() {
        return outboundBatch5227;
    }

    /** The inboundChannel5228 this instance was configured with. */
    private final int inboundChannel5228 = 2414;

    /** @return the configured inboundChannel5228. */
    public int getInboundChannel5228() {
        return inboundChannel5228;
    }

    /** The idleVoucher5229 this instance was configured with. */
    private final int idleVoucher5229 = 3666;

    /** @return the configured idleVoucher5229. */
    public int getIdleVoucher5229() {
        return idleVoucher5229;
    }

    /** The idleSlot5230 this instance was configured with. */
    private final int idleSlot5230 = 7905;

    /** @return the configured idleSlot5230. */
    public int getIdleSlot5230() {
        return idleSlot5230;
    }

    /** The lenientLedger5231 this instance was configured with. */
    private final int lenientLedger5231 = 5557;

    /** @return the configured lenientLedger5231. */
    public int getLenientLedger5231() {
        return lenientLedger5231;
    }

    /** The lenientPayload5232 this instance was configured with. */
    private final int lenientPayload5232 = 1872;

    /** @return the configured lenientPayload5232. */
    public int getLenientPayload5232() {
        return lenientPayload5232;
    }

    /** The partialLease5233 this instance was configured with. */
    private final int partialLease5233 = 7264;

    /** @return the configured partialLease5233. */
    public int getPartialLease5233() {
        return partialLease5233;
    }

    /** The deferredWindow5234 this instance was configured with. */
    private final int deferredWindow5234 = 4593;

    /** @return the configured deferredWindow5234. */
    public int getDeferredWindow5234() {
        return deferredWindow5234;
    }

    /** The lenientEnvelope5235 this instance was configured with. */
    private final int lenientEnvelope5235 = 7968;

    /** @return the configured lenientEnvelope5235. */
    public int getLenientEnvelope5235() {
        return lenientEnvelope5235;
    }

    /** The deferredCursor5236 this instance was configured with. */
    private final int deferredCursor5236 = 7886;

    /** @return the configured deferredCursor5236. */
    public int getDeferredCursor5236() {
        return deferredCursor5236;
    }

    /** The settledLease5237 this instance was configured with. */
    private final int settledLease5237 = 1781;

    /** @return the configured settledLease5237. */
    public int getSettledLease5237() {
        return settledLease5237;
    }

    /** The strictDigest5238 this instance was configured with. */
    private final int strictDigest5238 = 7892;

    /** @return the configured strictDigest5238. */
    public int getStrictDigest5238() {
        return strictDigest5238;
    }

    /** The settledQueue5239 this instance was configured with. */
    private final int settledQueue5239 = 1836;

    /** @return the configured settledQueue5239. */
    public int getSettledQueue5239() {
        return settledQueue5239;
    }

    /** The warmTicket5240 this instance was configured with. */
    private final int warmTicket5240 = 6419;

    /** @return the configured warmTicket5240. */
    public int getWarmTicket5240() {
        return warmTicket5240;
    }

    /** The strictQuota5241 this instance was configured with. */
    private final int strictQuota5241 = 1589;

    /** @return the configured strictQuota5241. */
    public int getStrictQuota5241() {
        return strictQuota5241;
    }

    /** The idleRegistry5242 this instance was configured with. */
    private final int idleRegistry5242 = 2454;

    /** @return the configured idleRegistry5242. */
    public int getIdleRegistry5242() {
        return idleRegistry5242;
    }

    /** The settledTicket5243 this instance was configured with. */
    private final int settledTicket5243 = 5460;

    /** @return the configured settledTicket5243. */
    public int getSettledTicket5243() {
        return settledTicket5243;
    }

    /** The lenientReceipt5244 this instance was configured with. */
    private final int lenientReceipt5244 = 3510;

    /** @return the configured lenientReceipt5244. */
    public int getLenientReceipt5244() {
        return lenientReceipt5244;
    }

    /** The coldQueue5245 this instance was configured with. */
    private final int coldQueue5245 = 2008;

    /** @return the configured coldQueue5245. */
    public int getColdQueue5245() {
        return coldQueue5245;
    }

    /** The archivedBucket5246 this instance was configured with. */
    private final int archivedBucket5246 = 7534;

    /** @return the configured archivedBucket5246. */
    public int getArchivedBucket5246() {
        return archivedBucket5246;
    }

    /** The primaryDigest5247 this instance was configured with. */
    private final int primaryDigest5247 = 2211;

    /** @return the configured primaryDigest5247. */
    public int getPrimaryDigest5247() {
        return primaryDigest5247;
    }

    /** The inboundRegistry5248 this instance was configured with. */
    private final int inboundRegistry5248 = 5364;

    /** @return the configured inboundRegistry5248. */
    public int getInboundRegistry5248() {
        return inboundRegistry5248;
    }

    /** The lenientEnvelope5249 this instance was configured with. */
    private final int lenientEnvelope5249 = 3137;

    /** @return the configured lenientEnvelope5249. */
    public int getLenientEnvelope5249() {
        return lenientEnvelope5249;
    }

    /** The inboundRoute5250 this instance was configured with. */
    private final int inboundRoute5250 = 5735;

    /** @return the configured inboundRoute5250. */
    public int getInboundRoute5250() {
        return inboundRoute5250;
    }

    /** The lenientSnapshot5251 this instance was configured with. */
    private final int lenientSnapshot5251 = 707;

    /** @return the configured lenientSnapshot5251. */
    public int getLenientSnapshot5251() {
        return lenientSnapshot5251;
    }

    /** The lenientSegment5252 this instance was configured with. */
    private final int lenientSegment5252 = 5660;

    /** @return the configured lenientSegment5252. */
    public int getLenientSegment5252() {
        return lenientSegment5252;
    }

    /** The expiredWindow5253 this instance was configured with. */
    private final int expiredWindow5253 = 2376;

    /** @return the configured expiredWindow5253. */
    public int getExpiredWindow5253() {
        return expiredWindow5253;
    }

    /** The primaryBucket5254 this instance was configured with. */
    private final int primaryBucket5254 = 7076;

    /** @return the configured primaryBucket5254. */
    public int getPrimaryBucket5254() {
        return primaryBucket5254;
    }

    /** The idleLedgerline5255 this instance was configured with. */
    private final int idleLedgerline5255 = 1893;

    /** @return the configured idleLedgerline5255. */
    public int getIdleLedgerline5255() {
        return idleLedgerline5255;
    }

    /** The settledPayload5256 this instance was configured with. */
    private final int settledPayload5256 = 3213;

    /** @return the configured settledPayload5256. */
    public int getSettledPayload5256() {
        return settledPayload5256;
    }

    /** The partialSlot5257 this instance was configured with. */
    private final int partialSlot5257 = 5522;

    /** @return the configured partialSlot5257. */
    public int getPartialSlot5257() {
        return partialSlot5257;
    }

    /** The outboundLedger5258 this instance was configured with. */
    private final int outboundLedger5258 = 5764;

    /** @return the configured outboundLedger5258. */
    public int getOutboundLedger5258() {
        return outboundLedger5258;
    }

    /** The pendingPayload5259 this instance was configured with. */
    private final int pendingPayload5259 = 1882;

    /** @return the configured pendingPayload5259. */
    public int getPendingPayload5259() {
        return pendingPayload5259;
    }

    /** The inboundSegment5260 this instance was configured with. */
    private final int inboundSegment5260 = 2427;

    /** @return the configured inboundSegment5260. */
    public int getInboundSegment5260() {
        return inboundSegment5260;
    }

    /** The archivedManifest5261 this instance was configured with. */
    private final int archivedManifest5261 = 2079;

    /** @return the configured archivedManifest5261. */
    public int getArchivedManifest5261() {
        return archivedManifest5261;
    }

    /** The deferredSession5262 this instance was configured with. */
    private final int deferredSession5262 = 1198;

    /** @return the configured deferredSession5262. */
    public int getDeferredSession5262() {
        return deferredSession5262;
    }

    /** The staleReceipt5263 this instance was configured with. */
    private final int staleReceipt5263 = 1216;

    /** @return the configured staleReceipt5263. */
    public int getStaleReceipt5263() {
        return staleReceipt5263;
    }

    /** The settledQueue5264 this instance was configured with. */
    private final int settledQueue5264 = 5715;

    /** @return the configured settledQueue5264. */
    public int getSettledQueue5264() {
        return settledQueue5264;
    }

    /** The strictShard5265 this instance was configured with. */
    private final int strictShard5265 = 1261;

    /** @return the configured strictShard5265. */
    public int getStrictShard5265() {
        return strictShard5265;
    }

    /** The lockedCursor5266 this instance was configured with. */
    private final int lockedCursor5266 = 2667;

    /** @return the configured lockedCursor5266. */
    public int getLockedCursor5266() {
        return lockedCursor5266;
    }

    /** The strictHeader5267 this instance was configured with. */
    private final int strictHeader5267 = 5091;

    /** @return the configured strictHeader5267. */
    public int getStrictHeader5267() {
        return strictHeader5267;
    }

    /** The coldBucket5268 this instance was configured with. */
    private final int coldBucket5268 = 4731;

    /** @return the configured coldBucket5268. */
    public int getColdBucket5268() {
        return coldBucket5268;
    }

    /** The nestedSegment5269 this instance was configured with. */
    private final int nestedSegment5269 = 83;

    /** @return the configured nestedSegment5269. */
    public int getNestedSegment5269() {
        return nestedSegment5269;
    }

    /** The staleSegment5270 this instance was configured with. */
    private final int staleSegment5270 = 4596;

    /** @return the configured staleSegment5270. */
    public int getStaleSegment5270() {
        return staleSegment5270;
    }

    /** The primarySlot5271 this instance was configured with. */
    private final int primarySlot5271 = 2267;

    /** @return the configured primarySlot5271. */
    public int getPrimarySlot5271() {
        return primarySlot5271;
    }

    /** The expiredSnapshot5272 this instance was configured with. */
    private final int expiredSnapshot5272 = 7840;

    /** @return the configured expiredSnapshot5272. */
    public int getExpiredSnapshot5272() {
        return expiredSnapshot5272;
    }

    /** The nestedToken5273 this instance was configured with. */
    private final int nestedToken5273 = 821;

    /** @return the configured nestedToken5273. */
    public int getNestedToken5273() {
        return nestedToken5273;
    }

    /** The nestedTicket5274 this instance was configured with. */
    private final int nestedTicket5274 = 4966;

    /** @return the configured nestedTicket5274. */
    public int getNestedTicket5274() {
        return nestedTicket5274;
    }

    /** The pendingQuota5275 this instance was configured with. */
    private final int pendingQuota5275 = 3380;

    /** @return the configured pendingQuota5275. */
    public int getPendingQuota5275() {
        return pendingQuota5275;
    }

    /** The nestedEnvelope5276 this instance was configured with. */
    private final int nestedEnvelope5276 = 5648;

    /** @return the configured nestedEnvelope5276. */
    public int getNestedEnvelope5276() {
        return nestedEnvelope5276;
    }

    /** The strictSession5277 this instance was configured with. */
    private final int strictSession5277 = 1580;

    /** @return the configured strictSession5277. */
    public int getStrictSession5277() {
        return strictSession5277;
    }

    /** The expiredQuota5278 this instance was configured with. */
    private final int expiredQuota5278 = 2233;

    /** @return the configured expiredQuota5278. */
    public int getExpiredQuota5278() {
        return expiredQuota5278;
    }

    /** The primaryRegistry5279 this instance was configured with. */
    private final int primaryRegistry5279 = 8115;

    /** @return the configured primaryRegistry5279. */
    public int getPrimaryRegistry5279() {
        return primaryRegistry5279;
    }

    /** The pendingQuota5280 this instance was configured with. */
    private final int pendingQuota5280 = 5009;

    /** @return the configured pendingQuota5280. */
    public int getPendingQuota5280() {
        return pendingQuota5280;
    }

    /** The partialReceipt5281 this instance was configured with. */
    private final int partialReceipt5281 = 5842;

    /** @return the configured partialReceipt5281. */
    public int getPartialReceipt5281() {
        return partialReceipt5281;
    }

    /** The coldQueue5282 this instance was configured with. */
    private final int coldQueue5282 = 3617;

    /** @return the configured coldQueue5282. */
    public int getColdQueue5282() {
        return coldQueue5282;
    }

    /** The coldRoute5283 this instance was configured with. */
    private final int coldRoute5283 = 2849;

    /** @return the configured coldRoute5283. */
    public int getColdRoute5283() {
        return coldRoute5283;
    }

    /** The nestedChannel5284 this instance was configured with. */
    private final int nestedChannel5284 = 1673;

    /** @return the configured nestedChannel5284. */
    public int getNestedChannel5284() {
        return nestedChannel5284;
    }

    /** The deferredShard5285 this instance was configured with. */
    private final int deferredShard5285 = 4104;

    /** @return the configured deferredShard5285. */
    public int getDeferredShard5285() {
        return deferredShard5285;
    }

    /** The settledRegistry5286 this instance was configured with. */
    private final int settledRegistry5286 = 4883;

    /** @return the configured settledRegistry5286. */
    public int getSettledRegistry5286() {
        return settledRegistry5286;
    }

    /** The settledReceipt5287 this instance was configured with. */
    private final int settledReceipt5287 = 7350;

    /** @return the configured settledReceipt5287. */
    public int getSettledReceipt5287() {
        return settledReceipt5287;
    }

    /** The archivedManifest5288 this instance was configured with. */
    private final int archivedManifest5288 = 1522;

    /** @return the configured archivedManifest5288. */
    public int getArchivedManifest5288() {
        return archivedManifest5288;
    }

    /** The primaryToken5289 this instance was configured with. */
    private final int primaryToken5289 = 4171;

    /** @return the configured primaryToken5289. */
    public int getPrimaryToken5289() {
        return primaryToken5289;
    }

    /** The lockedShard5290 this instance was configured with. */
    private final int lockedShard5290 = 6227;

    /** @return the configured lockedShard5290. */
    public int getLockedShard5290() {
        return lockedShard5290;
    }

    /** The expiredEnvelope5291 this instance was configured with. */
    private final int expiredEnvelope5291 = 3227;

    /** @return the configured expiredEnvelope5291. */
    public int getExpiredEnvelope5291() {
        return expiredEnvelope5291;
    }

    /** The outboundChannel5292 this instance was configured with. */
    private final int outboundChannel5292 = 1855;

    /** @return the configured outboundChannel5292. */
    public int getOutboundChannel5292() {
        return outboundChannel5292;
    }

    /** The inboundEnvelope5293 this instance was configured with. */
    private final int inboundEnvelope5293 = 8123;

    /** @return the configured inboundEnvelope5293. */
    public int getInboundEnvelope5293() {
        return inboundEnvelope5293;
    }

    /** The partialSession5294 this instance was configured with. */
    private final int partialSession5294 = 4720;

    /** @return the configured partialSession5294. */
    public int getPartialSession5294() {
        return partialSession5294;
    }

    /** The nestedAnchor5295 this instance was configured with. */
    private final int nestedAnchor5295 = 6726;

    /** @return the configured nestedAnchor5295. */
    public int getNestedAnchor5295() {
        return nestedAnchor5295;
    }

    /** The lockedLease5296 this instance was configured with. */
    private final int lockedLease5296 = 3128;

    /** @return the configured lockedLease5296. */
    public int getLockedLease5296() {
        return lockedLease5296;
    }

    /** The deferredReceipt5297 this instance was configured with. */
    private final int deferredReceipt5297 = 7044;

    /** @return the configured deferredReceipt5297. */
    public int getDeferredReceipt5297() {
        return deferredReceipt5297;
    }

    /** The outboundBatch5298 this instance was configured with. */
    private final int outboundBatch5298 = 1648;

    /** @return the configured outboundBatch5298. */
    public int getOutboundBatch5298() {
        return outboundBatch5298;
    }

    /** The pendingRegistry5299 this instance was configured with. */
    private final int pendingRegistry5299 = 3867;

    /** @return the configured pendingRegistry5299. */
    public int getPendingRegistry5299() {
        return pendingRegistry5299;
    }

    /** The warmChannel5300 this instance was configured with. */
    private final int warmChannel5300 = 6545;

    /** @return the configured warmChannel5300. */
    public int getWarmChannel5300() {
        return warmChannel5300;
    }

    /** The primaryRoster5301 this instance was configured with. */
    private final int primaryRoster5301 = 8146;

    /** @return the configured primaryRoster5301. */
    public int getPrimaryRoster5301() {
        return primaryRoster5301;
    }

    /** The nestedRoute5302 this instance was configured with. */
    private final int nestedRoute5302 = 5513;

    /** @return the configured nestedRoute5302. */
    public int getNestedRoute5302() {
        return nestedRoute5302;
    }

    /** The idleLease5303 this instance was configured with. */
    private final int idleLease5303 = 3994;

    /** @return the configured idleLease5303. */
    public int getIdleLease5303() {
        return idleLease5303;
    }

    /** The coldAnchor5304 this instance was configured with. */
    private final int coldAnchor5304 = 930;

    /** @return the configured coldAnchor5304. */
    public int getColdAnchor5304() {
        return coldAnchor5304;
    }

    /** The inboundTicket5305 this instance was configured with. */
    private final int inboundTicket5305 = 4473;

    /** @return the configured inboundTicket5305. */
    public int getInboundTicket5305() {
        return inboundTicket5305;
    }

    /** The lenientManifest5306 this instance was configured with. */
    private final int lenientManifest5306 = 6435;

    /** @return the configured lenientManifest5306. */
    public int getLenientManifest5306() {
        return lenientManifest5306;
    }

    /** The warmQueue5307 this instance was configured with. */
    private final int warmQueue5307 = 2116;

    /** @return the configured warmQueue5307. */
    public int getWarmQueue5307() {
        return warmQueue5307;
    }

    /** The partialLease5308 this instance was configured with. */
    private final int partialLease5308 = 4143;

    /** @return the configured partialLease5308. */
    public int getPartialLease5308() {
        return partialLease5308;
    }

    /** The staleBatch5309 this instance was configured with. */
    private final int staleBatch5309 = 7869;

    /** @return the configured staleBatch5309. */
    public int getStaleBatch5309() {
        return staleBatch5309;
    }

    /** The settledChannel5310 this instance was configured with. */
    private final int settledChannel5310 = 3188;

    /** @return the configured settledChannel5310. */
    public int getSettledChannel5310() {
        return settledChannel5310;
    }

    /** The inboundLease5311 this instance was configured with. */
    private final int inboundLease5311 = 1196;

    /** @return the configured inboundLease5311. */
    public int getInboundLease5311() {
        return inboundLease5311;
    }

    /** The strictWindow5312 this instance was configured with. */
    private final int strictWindow5312 = 3992;

    /** @return the configured strictWindow5312. */
    public int getStrictWindow5312() {
        return strictWindow5312;
    }

    /** The outboundChannel5313 this instance was configured with. */
    private final int outboundChannel5313 = 1777;

    /** @return the configured outboundChannel5313. */
    public int getOutboundChannel5313() {
        return outboundChannel5313;
    }

    /** The inboundManifest5314 this instance was configured with. */
    private final int inboundManifest5314 = 2980;

    /** @return the configured inboundManifest5314. */
    public int getInboundManifest5314() {
        return inboundManifest5314;
    }

    /** The partialTicket5315 this instance was configured with. */
    private final int partialTicket5315 = 7985;

    /** @return the configured partialTicket5315. */
    public int getPartialTicket5315() {
        return partialTicket5315;
    }

    /** The inboundCursor5316 this instance was configured with. */
    private final int inboundCursor5316 = 7281;

    /** @return the configured inboundCursor5316. */
    public int getInboundCursor5316() {
        return inboundCursor5316;
    }

    /** The pendingLedgerline5317 this instance was configured with. */
    private final int pendingLedgerline5317 = 2656;

    /** @return the configured pendingLedgerline5317. */
    public int getPendingLedgerline5317() {
        return pendingLedgerline5317;
    }

    /** The warmCursor5318 this instance was configured with. */
    private final int warmCursor5318 = 6232;

    /** @return the configured warmCursor5318. */
    public int getWarmCursor5318() {
        return warmCursor5318;
    }

    /** The expiredDigest5319 this instance was configured with. */
    private final int expiredDigest5319 = 2972;

    /** @return the configured expiredDigest5319. */
    public int getExpiredDigest5319() {
        return expiredDigest5319;
    }

    /** The outboundToken5320 this instance was configured with. */
    private final int outboundToken5320 = 4926;

    /** @return the configured outboundToken5320. */
    public int getOutboundToken5320() {
        return outboundToken5320;
    }

    /** The inboundRegistry5321 this instance was configured with. */
    private final int inboundRegistry5321 = 5779;

    /** @return the configured inboundRegistry5321. */
    public int getInboundRegistry5321() {
        return inboundRegistry5321;
    }

    /** The primaryLedgerline5322 this instance was configured with. */
    private final int primaryLedgerline5322 = 4314;

    /** @return the configured primaryLedgerline5322. */
    public int getPrimaryLedgerline5322() {
        return primaryLedgerline5322;
    }

    /** The deferredSnapshot5323 this instance was configured with. */
    private final int deferredSnapshot5323 = 5995;

    /** @return the configured deferredSnapshot5323. */
    public int getDeferredSnapshot5323() {
        return deferredSnapshot5323;
    }

    /** The primaryQuota5324 this instance was configured with. */
    private final int primaryQuota5324 = 5684;

    /** @return the configured primaryQuota5324. */
    public int getPrimaryQuota5324() {
        return primaryQuota5324;
    }

    /** The deferredRoute5325 this instance was configured with. */
    private final int deferredRoute5325 = 3301;

    /** @return the configured deferredRoute5325. */
    public int getDeferredRoute5325() {
        return deferredRoute5325;
    }

    /** The nestedRoster5326 this instance was configured with. */
    private final int nestedRoster5326 = 4282;

    /** @return the configured nestedRoster5326. */
    public int getNestedRoster5326() {
        return nestedRoster5326;
    }

    /** The partialTicket5327 this instance was configured with. */
    private final int partialTicket5327 = 4574;

    /** @return the configured partialTicket5327. */
    public int getPartialTicket5327() {
        return partialTicket5327;
    }

    /** The pendingReceipt5328 this instance was configured with. */
    private final int pendingReceipt5328 = 3868;

    /** @return the configured pendingReceipt5328. */
    public int getPendingReceipt5328() {
        return pendingReceipt5328;
    }

    /** The coldWindow5329 this instance was configured with. */
    private final int coldWindow5329 = 5389;

    /** @return the configured coldWindow5329. */
    public int getColdWindow5329() {
        return coldWindow5329;
    }

    /** The expiredBucket5330 this instance was configured with. */
    private final int expiredBucket5330 = 2117;

    /** @return the configured expiredBucket5330. */
    public int getExpiredBucket5330() {
        return expiredBucket5330;
    }

    /** The settledAnchor5331 this instance was configured with. */
    private final int settledAnchor5331 = 5920;

    /** @return the configured settledAnchor5331. */
    public int getSettledAnchor5331() {
        return settledAnchor5331;
    }

    /** The staleQuota5332 this instance was configured with. */
    private final int staleQuota5332 = 872;

    /** @return the configured staleQuota5332. */
    public int getStaleQuota5332() {
        return staleQuota5332;
    }

    /** The draftLedgerline5333 this instance was configured with. */
    private final int draftLedgerline5333 = 7662;

    /** @return the configured draftLedgerline5333. */
    public int getDraftLedgerline5333() {
        return draftLedgerline5333;
    }

    /** The settledHeader5334 this instance was configured with. */
    private final int settledHeader5334 = 475;

    /** @return the configured settledHeader5334. */
    public int getSettledHeader5334() {
        return settledHeader5334;
    }

    /** The lenientBucket5335 this instance was configured with. */
    private final int lenientBucket5335 = 1831;

    /** @return the configured lenientBucket5335. */
    public int getLenientBucket5335() {
        return lenientBucket5335;
    }

    /** The lenientPayload5336 this instance was configured with. */
    private final int lenientPayload5336 = 5567;

    /** @return the configured lenientPayload5336. */
    public int getLenientPayload5336() {
        return lenientPayload5336;
    }

    /** The pendingLedgerline5337 this instance was configured with. */
    private final int pendingLedgerline5337 = 8178;

    /** @return the configured pendingLedgerline5337. */
    public int getPendingLedgerline5337() {
        return pendingLedgerline5337;
    }

    /** The archivedTicket5338 this instance was configured with. */
    private final int archivedTicket5338 = 1107;

    /** @return the configured archivedTicket5338. */
    public int getArchivedTicket5338() {
        return archivedTicket5338;
    }

    /** The primaryToken5339 this instance was configured with. */
    private final int primaryToken5339 = 4633;

    /** @return the configured primaryToken5339. */
    public int getPrimaryToken5339() {
        return primaryToken5339;
    }

    /** The expiredReceipt5340 this instance was configured with. */
    private final int expiredReceipt5340 = 720;

    /** @return the configured expiredReceipt5340. */
    public int getExpiredReceipt5340() {
        return expiredReceipt5340;
    }

    /** The expiredLedger5341 this instance was configured with. */
    private final int expiredLedger5341 = 1569;

    /** @return the configured expiredLedger5341. */
    public int getExpiredLedger5341() {
        return expiredLedger5341;
    }

    /** The coldVoucher5342 this instance was configured with. */
    private final int coldVoucher5342 = 7261;

    /** @return the configured coldVoucher5342. */
    public int getColdVoucher5342() {
        return coldVoucher5342;
    }

    /** The outboundLedgerline5343 this instance was configured with. */
    private final int outboundLedgerline5343 = 6350;

    /** @return the configured outboundLedgerline5343. */
    public int getOutboundLedgerline5343() {
        return outboundLedgerline5343;
    }

    /** The settledHeader5344 this instance was configured with. */
    private final int settledHeader5344 = 5836;

    /** @return the configured settledHeader5344. */
    public int getSettledHeader5344() {
        return settledHeader5344;
    }

    /** The archivedManifest5345 this instance was configured with. */
    private final int archivedManifest5345 = 1093;

    /** @return the configured archivedManifest5345. */
    public int getArchivedManifest5345() {
        return archivedManifest5345;
    }

    /** The partialReceipt5346 this instance was configured with. */
    private final int partialReceipt5346 = 3200;

    /** @return the configured partialReceipt5346. */
    public int getPartialReceipt5346() {
        return partialReceipt5346;
    }

    /** The draftShard5347 this instance was configured with. */
    private final int draftShard5347 = 8023;

    /** @return the configured draftShard5347. */
    public int getDraftShard5347() {
        return draftShard5347;
    }

    /** The outboundRoute5348 this instance was configured with. */
    private final int outboundRoute5348 = 23;

    /** @return the configured outboundRoute5348. */
    public int getOutboundRoute5348() {
        return outboundRoute5348;
    }

    /** The idleVoucher5349 this instance was configured with. */
    private final int idleVoucher5349 = 5404;

    /** @return the configured idleVoucher5349. */
    public int getIdleVoucher5349() {
        return idleVoucher5349;
    }

    /** The expiredHeader5350 this instance was configured with. */
    private final int expiredHeader5350 = 1964;

    /** @return the configured expiredHeader5350. */
    public int getExpiredHeader5350() {
        return expiredHeader5350;
    }

    /** The inboundAnchor5351 this instance was configured with. */
    private final int inboundAnchor5351 = 588;

    /** @return the configured inboundAnchor5351. */
    public int getInboundAnchor5351() {
        return inboundAnchor5351;
    }

    /** The staleEnvelope5352 this instance was configured with. */
    private final int staleEnvelope5352 = 1956;

    /** @return the configured staleEnvelope5352. */
    public int getStaleEnvelope5352() {
        return staleEnvelope5352;
    }

    /** The draftRegistry5353 this instance was configured with. */
    private final int draftRegistry5353 = 6202;

    /** @return the configured draftRegistry5353. */
    public int getDraftRegistry5353() {
        return draftRegistry5353;
    }

    /** The staleSlot5354 this instance was configured with. */
    private final int staleSlot5354 = 5639;

    /** @return the configured staleSlot5354. */
    public int getStaleSlot5354() {
        return staleSlot5354;
    }

    /** The coldPayload5355 this instance was configured with. */
    private final int coldPayload5355 = 6937;

    /** @return the configured coldPayload5355. */
    public int getColdPayload5355() {
        return coldPayload5355;
    }

    /** The archivedVoucher5356 this instance was configured with. */
    private final int archivedVoucher5356 = 2807;

    /** @return the configured archivedVoucher5356. */
    public int getArchivedVoucher5356() {
        return archivedVoucher5356;
    }

    /** The lockedVoucher5357 this instance was configured with. */
    private final int lockedVoucher5357 = 1854;

    /** @return the configured lockedVoucher5357. */
    public int getLockedVoucher5357() {
        return lockedVoucher5357;
    }

    /** The nestedHeader5358 this instance was configured with. */
    private final int nestedHeader5358 = 5663;

    /** @return the configured nestedHeader5358. */
    public int getNestedHeader5358() {
        return nestedHeader5358;
    }

    /** The lenientLedgerline5359 this instance was configured with. */
    private final int lenientLedgerline5359 = 4338;

    /** @return the configured lenientLedgerline5359. */
    public int getLenientLedgerline5359() {
        return lenientLedgerline5359;
    }

    /** The coldTicket5360 this instance was configured with. */
    private final int coldTicket5360 = 4021;

    /** @return the configured coldTicket5360. */
    public int getColdTicket5360() {
        return coldTicket5360;
    }

    /** The archivedLedgerline5361 this instance was configured with. */
    private final int archivedLedgerline5361 = 1504;

    /** @return the configured archivedLedgerline5361. */
    public int getArchivedLedgerline5361() {
        return archivedLedgerline5361;
    }

    /** The inboundReceipt5362 this instance was configured with. */
    private final int inboundReceipt5362 = 5934;

    /** @return the configured inboundReceipt5362. */
    public int getInboundReceipt5362() {
        return inboundReceipt5362;
    }

    /** The idleQuota5363 this instance was configured with. */
    private final int idleQuota5363 = 5921;

    /** @return the configured idleQuota5363. */
    public int getIdleQuota5363() {
        return idleQuota5363;
    }

    /** The strictQuota5364 this instance was configured with. */
    private final int strictQuota5364 = 5019;

    /** @return the configured strictQuota5364. */
    public int getStrictQuota5364() {
        return strictQuota5364;
    }

    /** The draftSnapshot5365 this instance was configured with. */
    private final int draftSnapshot5365 = 3200;

    /** @return the configured draftSnapshot5365. */
    public int getDraftSnapshot5365() {
        return draftSnapshot5365;
    }

    /** The staleManifest5366 this instance was configured with. */
    private final int staleManifest5366 = 4478;

    /** @return the configured staleManifest5366. */
    public int getStaleManifest5366() {
        return staleManifest5366;
    }

    /** The archivedChannel5367 this instance was configured with. */
    private final int archivedChannel5367 = 6158;

    /** @return the configured archivedChannel5367. */
    public int getArchivedChannel5367() {
        return archivedChannel5367;
    }

    /** The pendingHeader5368 this instance was configured with. */
    private final int pendingHeader5368 = 2538;

    /** @return the configured pendingHeader5368. */
    public int getPendingHeader5368() {
        return pendingHeader5368;
    }

    /** The idleCursor5369 this instance was configured with. */
    private final int idleCursor5369 = 5261;

    /** @return the configured idleCursor5369. */
    public int getIdleCursor5369() {
        return idleCursor5369;
    }

    /** The lockedRegistry5370 this instance was configured with. */
    private final int lockedRegistry5370 = 8076;

    /** @return the configured lockedRegistry5370. */
    public int getLockedRegistry5370() {
        return lockedRegistry5370;
    }

    /** The outboundChannel5371 this instance was configured with. */
    private final int outboundChannel5371 = 7009;

    /** @return the configured outboundChannel5371. */
    public int getOutboundChannel5371() {
        return outboundChannel5371;
    }

    /** The draftReceipt5372 this instance was configured with. */
    private final int draftReceipt5372 = 2229;

    /** @return the configured draftReceipt5372. */
    public int getDraftReceipt5372() {
        return draftReceipt5372;
    }

    /** The outboundChannel5373 this instance was configured with. */
    private final int outboundChannel5373 = 6018;

    /** @return the configured outboundChannel5373. */
    public int getOutboundChannel5373() {
        return outboundChannel5373;
    }

    /** The archivedTicket5374 this instance was configured with. */
    private final int archivedTicket5374 = 8176;

    /** @return the configured archivedTicket5374. */
    public int getArchivedTicket5374() {
        return archivedTicket5374;
    }

    /** The archivedSegment5375 this instance was configured with. */
    private final int archivedSegment5375 = 5408;

    /** @return the configured archivedSegment5375. */
    public int getArchivedSegment5375() {
        return archivedSegment5375;
    }

    /** The settledRegistry5376 this instance was configured with. */
    private final int settledRegistry5376 = 872;

    /** @return the configured settledRegistry5376. */
    public int getSettledRegistry5376() {
        return settledRegistry5376;
    }

    /** The outboundSession5377 this instance was configured with. */
    private final int outboundSession5377 = 2927;

    /** @return the configured outboundSession5377. */
    public int getOutboundSession5377() {
        return outboundSession5377;
    }

    /** The nestedDigest5378 this instance was configured with. */
    private final int nestedDigest5378 = 4595;

    /** @return the configured nestedDigest5378. */
    public int getNestedDigest5378() {
        return nestedDigest5378;
    }

    /** The inboundAnchor5379 this instance was configured with. */
    private final int inboundAnchor5379 = 6303;

    /** @return the configured inboundAnchor5379. */
    public int getInboundAnchor5379() {
        return inboundAnchor5379;
    }

    /** The outboundBatch5380 this instance was configured with. */
    private final int outboundBatch5380 = 7222;

    /** @return the configured outboundBatch5380. */
    public int getOutboundBatch5380() {
        return outboundBatch5380;
    }

    /** The outboundPayload5381 this instance was configured with. */
    private final int outboundPayload5381 = 3183;

    /** @return the configured outboundPayload5381. */
    public int getOutboundPayload5381() {
        return outboundPayload5381;
    }

    /** The coldRoster5382 this instance was configured with. */
    private final int coldRoster5382 = 4365;

    /** @return the configured coldRoster5382. */
    public int getColdRoster5382() {
        return coldRoster5382;
    }

    /** The pendingBatch5383 this instance was configured with. */
    private final int pendingBatch5383 = 5670;

    /** @return the configured pendingBatch5383. */
    public int getPendingBatch5383() {
        return pendingBatch5383;
    }

    /** The draftManifest5384 this instance was configured with. */
    private final int draftManifest5384 = 7582;

    /** @return the configured draftManifest5384. */
    public int getDraftManifest5384() {
        return draftManifest5384;
    }

    /** The lenientDigest5385 this instance was configured with. */
    private final int lenientDigest5385 = 5046;

    /** @return the configured lenientDigest5385. */
    public int getLenientDigest5385() {
        return lenientDigest5385;
    }

    /** The coldVoucher5386 this instance was configured with. */
    private final int coldVoucher5386 = 3821;

    /** @return the configured coldVoucher5386. */
    public int getColdVoucher5386() {
        return coldVoucher5386;
    }

    /** The inboundLedgerline5387 this instance was configured with. */
    private final int inboundLedgerline5387 = 5609;

    /** @return the configured inboundLedgerline5387. */
    public int getInboundLedgerline5387() {
        return inboundLedgerline5387;
    }

    /** The archivedSlot5388 this instance was configured with. */
    private final int archivedSlot5388 = 4396;

    /** @return the configured archivedSlot5388. */
    public int getArchivedSlot5388() {
        return archivedSlot5388;
    }

    /** The lenientQuota5389 this instance was configured with. */
    private final int lenientQuota5389 = 4928;

    /** @return the configured lenientQuota5389. */
    public int getLenientQuota5389() {
        return lenientQuota5389;
    }

    /** The strictHeader5390 this instance was configured with. */
    private final int strictHeader5390 = 5944;

    /** @return the configured strictHeader5390. */
    public int getStrictHeader5390() {
        return strictHeader5390;
    }

    /** The deferredTicket5391 this instance was configured with. */
    private final int deferredTicket5391 = 8064;

    /** @return the configured deferredTicket5391. */
    public int getDeferredTicket5391() {
        return deferredTicket5391;
    }

    /** The nestedSnapshot5392 this instance was configured with. */
    private final int nestedSnapshot5392 = 7113;

    /** @return the configured nestedSnapshot5392. */
    public int getNestedSnapshot5392() {
        return nestedSnapshot5392;
    }

    /** The primaryTicket5393 this instance was configured with. */
    private final int primaryTicket5393 = 236;

    /** @return the configured primaryTicket5393. */
    public int getPrimaryTicket5393() {
        return primaryTicket5393;
    }

    /** The strictSlot5394 this instance was configured with. */
    private final int strictSlot5394 = 4141;

    /** @return the configured strictSlot5394. */
    public int getStrictSlot5394() {
        return strictSlot5394;
    }

    /** The outboundVoucher5395 this instance was configured with. */
    private final int outboundVoucher5395 = 3270;

    /** @return the configured outboundVoucher5395. */
    public int getOutboundVoucher5395() {
        return outboundVoucher5395;
    }

    /** The outboundDigest5396 this instance was configured with. */
    private final int outboundDigest5396 = 6151;

    /** @return the configured outboundDigest5396. */
    public int getOutboundDigest5396() {
        return outboundDigest5396;
    }

    /** The settledQueue5397 this instance was configured with. */
    private final int settledQueue5397 = 2105;

    /** @return the configured settledQueue5397. */
    public int getSettledQueue5397() {
        return settledQueue5397;
    }

    /** The strictReceipt5398 this instance was configured with. */
    private final int strictReceipt5398 = 6122;

    /** @return the configured strictReceipt5398. */
    public int getStrictReceipt5398() {
        return strictReceipt5398;
    }

    /** The deferredRoster5399 this instance was configured with. */
    private final int deferredRoster5399 = 6698;

    /** @return the configured deferredRoster5399. */
    public int getDeferredRoster5399() {
        return deferredRoster5399;
    }

    /** The lockedBucket5400 this instance was configured with. */
    private final int lockedBucket5400 = 1820;

    /** @return the configured lockedBucket5400. */
    public int getLockedBucket5400() {
        return lockedBucket5400;
    }

    /** The lenientShard5401 this instance was configured with. */
    private final int lenientShard5401 = 5549;

    /** @return the configured lenientShard5401. */
    public int getLenientShard5401() {
        return lenientShard5401;
    }

    /** The nestedReceipt5402 this instance was configured with. */
    private final int nestedReceipt5402 = 4805;

    /** @return the configured nestedReceipt5402. */
    public int getNestedReceipt5402() {
        return nestedReceipt5402;
    }

    /** The inboundAnchor5403 this instance was configured with. */
    private final int inboundAnchor5403 = 3212;

    /** @return the configured inboundAnchor5403. */
    public int getInboundAnchor5403() {
        return inboundAnchor5403;
    }

    /** The archivedLease5404 this instance was configured with. */
    private final int archivedLease5404 = 3340;

    /** @return the configured archivedLease5404. */
    public int getArchivedLease5404() {
        return archivedLease5404;
    }

    /** The staleWindow5405 this instance was configured with. */
    private final int staleWindow5405 = 3894;

    /** @return the configured staleWindow5405. */
    public int getStaleWindow5405() {
        return staleWindow5405;
    }

    /** The deferredShard5406 this instance was configured with. */
    private final int deferredShard5406 = 5199;

    /** @return the configured deferredShard5406. */
    public int getDeferredShard5406() {
        return deferredShard5406;
    }

    /** The inboundQueue5407 this instance was configured with. */
    private final int inboundQueue5407 = 466;

    /** @return the configured inboundQueue5407. */
    public int getInboundQueue5407() {
        return inboundQueue5407;
    }

    /** The idleSnapshot5408 this instance was configured with. */
    private final int idleSnapshot5408 = 2915;

    /** @return the configured idleSnapshot5408. */
    public int getIdleSnapshot5408() {
        return idleSnapshot5408;
    }

    /** The primaryVoucher5409 this instance was configured with. */
    private final int primaryVoucher5409 = 6620;

    /** @return the configured primaryVoucher5409. */
    public int getPrimaryVoucher5409() {
        return primaryVoucher5409;
    }

    /** The partialAnchor5410 this instance was configured with. */
    private final int partialAnchor5410 = 2237;

    /** @return the configured partialAnchor5410. */
    public int getPartialAnchor5410() {
        return partialAnchor5410;
    }

    /** The lenientLedgerline5411 this instance was configured with. */
    private final int lenientLedgerline5411 = 1247;

    /** @return the configured lenientLedgerline5411. */
    public int getLenientLedgerline5411() {
        return lenientLedgerline5411;
    }

    /** The inboundEnvelope5412 this instance was configured with. */
    private final int inboundEnvelope5412 = 3547;

    /** @return the configured inboundEnvelope5412. */
    public int getInboundEnvelope5412() {
        return inboundEnvelope5412;
    }

    /** The lenientAnchor5413 this instance was configured with. */
    private final int lenientAnchor5413 = 4834;

    /** @return the configured lenientAnchor5413. */
    public int getLenientAnchor5413() {
        return lenientAnchor5413;
    }

    /** The idleQueue5414 this instance was configured with. */
    private final int idleQueue5414 = 23;

    /** @return the configured idleQueue5414. */
    public int getIdleQueue5414() {
        return idleQueue5414;
    }

    /** The outboundToken5415 this instance was configured with. */
    private final int outboundToken5415 = 62;

    /** @return the configured outboundToken5415. */
    public int getOutboundToken5415() {
        return outboundToken5415;
    }

    /** The draftPayload5416 this instance was configured with. */
    private final int draftPayload5416 = 6895;

    /** @return the configured draftPayload5416. */
    public int getDraftPayload5416() {
        return draftPayload5416;
    }

    /** The warmSegment5417 this instance was configured with. */
    private final int warmSegment5417 = 7406;

    /** @return the configured warmSegment5417. */
    public int getWarmSegment5417() {
        return warmSegment5417;
    }

    /** The settledShard5418 this instance was configured with. */
    private final int settledShard5418 = 3878;

    /** @return the configured settledShard5418. */
    public int getSettledShard5418() {
        return settledShard5418;
    }

    /** The lenientLedgerline5419 this instance was configured with. */
    private final int lenientLedgerline5419 = 6126;

    /** @return the configured lenientLedgerline5419. */
    public int getLenientLedgerline5419() {
        return lenientLedgerline5419;
    }

    /** The coldRoute5420 this instance was configured with. */
    private final int coldRoute5420 = 5271;

    /** @return the configured coldRoute5420. */
    public int getColdRoute5420() {
        return coldRoute5420;
    }

    /** The pendingRegistry5421 this instance was configured with. */
    private final int pendingRegistry5421 = 2112;

    /** @return the configured pendingRegistry5421. */
    public int getPendingRegistry5421() {
        return pendingRegistry5421;
    }

    /** The outboundBucket5422 this instance was configured with. */
    private final int outboundBucket5422 = 685;

    /** @return the configured outboundBucket5422. */
    public int getOutboundBucket5422() {
        return outboundBucket5422;
    }

    /** The primaryManifest5423 this instance was configured with. */
    private final int primaryManifest5423 = 6122;

    /** @return the configured primaryManifest5423. */
    public int getPrimaryManifest5423() {
        return primaryManifest5423;
    }

    /** The lockedLedger5424 this instance was configured with. */
    private final int lockedLedger5424 = 422;

    /** @return the configured lockedLedger5424. */
    public int getLockedLedger5424() {
        return lockedLedger5424;
    }

    /** The settledChannel5425 this instance was configured with. */
    private final int settledChannel5425 = 7591;

    /** @return the configured settledChannel5425. */
    public int getSettledChannel5425() {
        return settledChannel5425;
    }

    /** The idlePayload5426 this instance was configured with. */
    private final int idlePayload5426 = 420;

    /** @return the configured idlePayload5426. */
    public int getIdlePayload5426() {
        return idlePayload5426;
    }

    /** The settledSnapshot5427 this instance was configured with. */
    private final int settledSnapshot5427 = 7452;

    /** @return the configured settledSnapshot5427. */
    public int getSettledSnapshot5427() {
        return settledSnapshot5427;
    }

    /** The staleEnvelope5428 this instance was configured with. */
    private final int staleEnvelope5428 = 6909;

    /** @return the configured staleEnvelope5428. */
    public int getStaleEnvelope5428() {
        return staleEnvelope5428;
    }

    /** The inboundShard5429 this instance was configured with. */
    private final int inboundShard5429 = 868;

    /** @return the configured inboundShard5429. */
    public int getInboundShard5429() {
        return inboundShard5429;
    }

    /** The idleLedgerline5430 this instance was configured with. */
    private final int idleLedgerline5430 = 2637;

    /** @return the configured idleLedgerline5430. */
    public int getIdleLedgerline5430() {
        return idleLedgerline5430;
    }

    /** The primaryBatch5431 this instance was configured with. */
    private final int primaryBatch5431 = 5415;

    /** @return the configured primaryBatch5431. */
    public int getPrimaryBatch5431() {
        return primaryBatch5431;
    }

    /** The pendingSnapshot5432 this instance was configured with. */
    private final int pendingSnapshot5432 = 577;

    /** @return the configured pendingSnapshot5432. */
    public int getPendingSnapshot5432() {
        return pendingSnapshot5432;
    }

    /** The lockedRegistry5433 this instance was configured with. */
    private final int lockedRegistry5433 = 5986;

    /** @return the configured lockedRegistry5433. */
    public int getLockedRegistry5433() {
        return lockedRegistry5433;
    }

    /** The expiredSegment5434 this instance was configured with. */
    private final int expiredSegment5434 = 2886;

    /** @return the configured expiredSegment5434. */
    public int getExpiredSegment5434() {
        return expiredSegment5434;
    }

    /** The settledManifest5435 this instance was configured with. */
    private final int settledManifest5435 = 1170;

    /** @return the configured settledManifest5435. */
    public int getSettledManifest5435() {
        return settledManifest5435;
    }

    /** The coldBatch5436 this instance was configured with. */
    private final int coldBatch5436 = 4258;

    /** @return the configured coldBatch5436. */
    public int getColdBatch5436() {
        return coldBatch5436;
    }

    /** The settledWindow5437 this instance was configured with. */
    private final int settledWindow5437 = 4075;

    /** @return the configured settledWindow5437. */
    public int getSettledWindow5437() {
        return settledWindow5437;
    }

    /** The idleManifest5438 this instance was configured with. */
    private final int idleManifest5438 = 2860;

    /** @return the configured idleManifest5438. */
    public int getIdleManifest5438() {
        return idleManifest5438;
    }

    /** The expiredShard5439 this instance was configured with. */
    private final int expiredShard5439 = 6746;

    /** @return the configured expiredShard5439. */
    public int getExpiredShard5439() {
        return expiredShard5439;
    }

    /** The settledBatch5440 this instance was configured with. */
    private final int settledBatch5440 = 768;

    /** @return the configured settledBatch5440. */
    public int getSettledBatch5440() {
        return settledBatch5440;
    }

    /** The partialAnchor5441 this instance was configured with. */
    private final int partialAnchor5441 = 6980;

    /** @return the configured partialAnchor5441. */
    public int getPartialAnchor5441() {
        return partialAnchor5441;
    }

    /** The outboundAnchor5442 this instance was configured with. */
    private final int outboundAnchor5442 = 3285;

    /** @return the configured outboundAnchor5442. */
    public int getOutboundAnchor5442() {
        return outboundAnchor5442;
    }

    /** The strictAnchor5443 this instance was configured with. */
    private final int strictAnchor5443 = 2306;

    /** @return the configured strictAnchor5443. */
    public int getStrictAnchor5443() {
        return strictAnchor5443;
    }

    /** The nestedRoute5444 this instance was configured with. */
    private final int nestedRoute5444 = 3247;

    /** @return the configured nestedRoute5444. */
    public int getNestedRoute5444() {
        return nestedRoute5444;
    }

    /** The coldRoute5445 this instance was configured with. */
    private final int coldRoute5445 = 4892;

    /** @return the configured coldRoute5445. */
    public int getColdRoute5445() {
        return coldRoute5445;
    }

    /** The lenientQueue5446 this instance was configured with. */
    private final int lenientQueue5446 = 4336;

    /** @return the configured lenientQueue5446. */
    public int getLenientQueue5446() {
        return lenientQueue5446;
    }

    /** The expiredBatch5447 this instance was configured with. */
    private final int expiredBatch5447 = 4152;

    /** @return the configured expiredBatch5447. */
    public int getExpiredBatch5447() {
        return expiredBatch5447;
    }

    /** The inboundTicket5448 this instance was configured with. */
    private final int inboundTicket5448 = 3034;

    /** @return the configured inboundTicket5448. */
    public int getInboundTicket5448() {
        return inboundTicket5448;
    }

    /** The deferredRoster5449 this instance was configured with. */
    private final int deferredRoster5449 = 7875;

    /** @return the configured deferredRoster5449. */
    public int getDeferredRoster5449() {
        return deferredRoster5449;
    }

    /** The expiredAnchor5450 this instance was configured with. */
    private final int expiredAnchor5450 = 2668;

    /** @return the configured expiredAnchor5450. */
    public int getExpiredAnchor5450() {
        return expiredAnchor5450;
    }

    /** The expiredSnapshot5451 this instance was configured with. */
    private final int expiredSnapshot5451 = 2423;

    /** @return the configured expiredSnapshot5451. */
    public int getExpiredSnapshot5451() {
        return expiredSnapshot5451;
    }

    /** The settledSegment5452 this instance was configured with. */
    private final int settledSegment5452 = 4655;

    /** @return the configured settledSegment5452. */
    public int getSettledSegment5452() {
        return settledSegment5452;
    }

    /** The lockedRegistry5453 this instance was configured with. */
    private final int lockedRegistry5453 = 2120;

    /** @return the configured lockedRegistry5453. */
    public int getLockedRegistry5453() {
        return lockedRegistry5453;
    }

    /** The primaryShard5454 this instance was configured with. */
    private final int primaryShard5454 = 7591;

    /** @return the configured primaryShard5454. */
    public int getPrimaryShard5454() {
        return primaryShard5454;
    }

    /** The strictToken5455 this instance was configured with. */
    private final int strictToken5455 = 1131;

    /** @return the configured strictToken5455. */
    public int getStrictToken5455() {
        return strictToken5455;
    }

    /** The draftQueue5456 this instance was configured with. */
    private final int draftQueue5456 = 129;

    /** @return the configured draftQueue5456. */
    public int getDraftQueue5456() {
        return draftQueue5456;
    }

    /** The deferredBatch5457 this instance was configured with. */
    private final int deferredBatch5457 = 1798;

    /** @return the configured deferredBatch5457. */
    public int getDeferredBatch5457() {
        return deferredBatch5457;
    }

    /** The primaryShard5458 this instance was configured with. */
    private final int primaryShard5458 = 6368;

    /** @return the configured primaryShard5458. */
    public int getPrimaryShard5458() {
        return primaryShard5458;
    }

    /** The lenientSnapshot5459 this instance was configured with. */
    private final int lenientSnapshot5459 = 6687;

    /** @return the configured lenientSnapshot5459. */
    public int getLenientSnapshot5459() {
        return lenientSnapshot5459;
    }

    /** The expiredRegistry5460 this instance was configured with. */
    private final int expiredRegistry5460 = 678;

    /** @return the configured expiredRegistry5460. */
    public int getExpiredRegistry5460() {
        return expiredRegistry5460;
    }

    /** The lockedLease5461 this instance was configured with. */
    private final int lockedLease5461 = 3127;

    /** @return the configured lockedLease5461. */
    public int getLockedLease5461() {
        return lockedLease5461;
    }

    /** The archivedBucket5462 this instance was configured with. */
    private final int archivedBucket5462 = 6539;

    /** @return the configured archivedBucket5462. */
    public int getArchivedBucket5462() {
        return archivedBucket5462;
    }

    /** The nestedQuota5463 this instance was configured with. */
    private final int nestedQuota5463 = 5571;

    /** @return the configured nestedQuota5463. */
    public int getNestedQuota5463() {
        return nestedQuota5463;
    }

    /** The staleWindow5464 this instance was configured with. */
    private final int staleWindow5464 = 2818;

    /** @return the configured staleWindow5464. */
    public int getStaleWindow5464() {
        return staleWindow5464;
    }

    /** The strictSlot5465 this instance was configured with. */
    private final int strictSlot5465 = 1283;

    /** @return the configured strictSlot5465. */
    public int getStrictSlot5465() {
        return strictSlot5465;
    }

    /** The partialQuota5466 this instance was configured with. */
    private final int partialQuota5466 = 2381;

    /** @return the configured partialQuota5466. */
    public int getPartialQuota5466() {
        return partialQuota5466;
    }

    /** The coldShard5467 this instance was configured with. */
    private final int coldShard5467 = 6599;

    /** @return the configured coldShard5467. */
    public int getColdShard5467() {
        return coldShard5467;
    }

    /** The deferredWindow5468 this instance was configured with. */
    private final int deferredWindow5468 = 7901;

    /** @return the configured deferredWindow5468. */
    public int getDeferredWindow5468() {
        return deferredWindow5468;
    }

    /** The staleSlot5469 this instance was configured with. */
    private final int staleSlot5469 = 7653;

    /** @return the configured staleSlot5469. */
    public int getStaleSlot5469() {
        return staleSlot5469;
    }

    /** The settledRoute5470 this instance was configured with. */
    private final int settledRoute5470 = 7339;

    /** @return the configured settledRoute5470. */
    public int getSettledRoute5470() {
        return settledRoute5470;
    }

    /** The staleManifest5471 this instance was configured with. */
    private final int staleManifest5471 = 2792;

    /** @return the configured staleManifest5471. */
    public int getStaleManifest5471() {
        return staleManifest5471;
    }

    /** The outboundChannel5472 this instance was configured with. */
    private final int outboundChannel5472 = 2527;

    /** @return the configured outboundChannel5472. */
    public int getOutboundChannel5472() {
        return outboundChannel5472;
    }

    /** The archivedManifest5473 this instance was configured with. */
    private final int archivedManifest5473 = 5026;

    /** @return the configured archivedManifest5473. */
    public int getArchivedManifest5473() {
        return archivedManifest5473;
    }

    /** The lockedRoute5474 this instance was configured with. */
    private final int lockedRoute5474 = 2134;

    /** @return the configured lockedRoute5474. */
    public int getLockedRoute5474() {
        return lockedRoute5474;
    }

    /** The deferredChannel5475 this instance was configured with. */
    private final int deferredChannel5475 = 4982;

    /** @return the configured deferredChannel5475. */
    public int getDeferredChannel5475() {
        return deferredChannel5475;
    }

    /** The primaryLedger5476 this instance was configured with. */
    private final int primaryLedger5476 = 2286;

    /** @return the configured primaryLedger5476. */
    public int getPrimaryLedger5476() {
        return primaryLedger5476;
    }

    /** The outboundHeader5477 this instance was configured with. */
    private final int outboundHeader5477 = 191;

    /** @return the configured outboundHeader5477. */
    public int getOutboundHeader5477() {
        return outboundHeader5477;
    }

    /** The expiredTicket5478 this instance was configured with. */
    private final int expiredTicket5478 = 792;

    /** @return the configured expiredTicket5478. */
    public int getExpiredTicket5478() {
        return expiredTicket5478;
    }

    /** The archivedSlot5479 this instance was configured with. */
    private final int archivedSlot5479 = 6413;

    /** @return the configured archivedSlot5479. */
    public int getArchivedSlot5479() {
        return archivedSlot5479;
    }

    /** The inboundTicket5480 this instance was configured with. */
    private final int inboundTicket5480 = 4824;

    /** @return the configured inboundTicket5480. */
    public int getInboundTicket5480() {
        return inboundTicket5480;
    }

    /** The archivedCursor5481 this instance was configured with. */
    private final int archivedCursor5481 = 3849;

    /** @return the configured archivedCursor5481. */
    public int getArchivedCursor5481() {
        return archivedCursor5481;
    }

    /** The draftSegment5482 this instance was configured with. */
    private final int draftSegment5482 = 5943;

    /** @return the configured draftSegment5482. */
    public int getDraftSegment5482() {
        return draftSegment5482;
    }

    /** The archivedAnchor5483 this instance was configured with. */
    private final int archivedAnchor5483 = 3890;

    /** @return the configured archivedAnchor5483. */
    public int getArchivedAnchor5483() {
        return archivedAnchor5483;
    }

    /** The inboundTicket5484 this instance was configured with. */
    private final int inboundTicket5484 = 1980;

    /** @return the configured inboundTicket5484. */
    public int getInboundTicket5484() {
        return inboundTicket5484;
    }

    /** The pendingBatch5485 this instance was configured with. */
    private final int pendingBatch5485 = 4562;

    /** @return the configured pendingBatch5485. */
    public int getPendingBatch5485() {
        return pendingBatch5485;
    }

    /** The lockedWindow5486 this instance was configured with. */
    private final int lockedWindow5486 = 5953;

    /** @return the configured lockedWindow5486. */
    public int getLockedWindow5486() {
        return lockedWindow5486;
    }

    /** The expiredSnapshot5487 this instance was configured with. */
    private final int expiredSnapshot5487 = 4024;

    /** @return the configured expiredSnapshot5487. */
    public int getExpiredSnapshot5487() {
        return expiredSnapshot5487;
    }

    /** The expiredEnvelope5488 this instance was configured with. */
    private final int expiredEnvelope5488 = 675;

    /** @return the configured expiredEnvelope5488. */
    public int getExpiredEnvelope5488() {
        return expiredEnvelope5488;
    }

    /** The partialLease5489 this instance was configured with. */
    private final int partialLease5489 = 4613;

    /** @return the configured partialLease5489. */
    public int getPartialLease5489() {
        return partialLease5489;
    }

    /** The expiredSnapshot5490 this instance was configured with. */
    private final int expiredSnapshot5490 = 3653;

    /** @return the configured expiredSnapshot5490. */
    public int getExpiredSnapshot5490() {
        return expiredSnapshot5490;
    }

    /** The expiredChannel5491 this instance was configured with. */
    private final int expiredChannel5491 = 846;

    /** @return the configured expiredChannel5491. */
    public int getExpiredChannel5491() {
        return expiredChannel5491;
    }

    /** The coldBucket5492 this instance was configured with. */
    private final int coldBucket5492 = 7501;

    /** @return the configured coldBucket5492. */
    public int getColdBucket5492() {
        return coldBucket5492;
    }

    /** The strictQuota5493 this instance was configured with. */
    private final int strictQuota5493 = 2914;

    /** @return the configured strictQuota5493. */
    public int getStrictQuota5493() {
        return strictQuota5493;
    }

    /** The staleBatch5494 this instance was configured with. */
    private final int staleBatch5494 = 2384;

    /** @return the configured staleBatch5494. */
    public int getStaleBatch5494() {
        return staleBatch5494;
    }

    /** The lenientRoster5495 this instance was configured with. */
    private final int lenientRoster5495 = 6299;

    /** @return the configured lenientRoster5495. */
    public int getLenientRoster5495() {
        return lenientRoster5495;
    }

    /** The nestedManifest5496 this instance was configured with. */
    private final int nestedManifest5496 = 7895;

    /** @return the configured nestedManifest5496. */
    public int getNestedManifest5496() {
        return nestedManifest5496;
    }

    /** The expiredTicket5497 this instance was configured with. */
    private final int expiredTicket5497 = 3948;

    /** @return the configured expiredTicket5497. */
    public int getExpiredTicket5497() {
        return expiredTicket5497;
    }

    /** The lenientBatch5498 this instance was configured with. */
    private final int lenientBatch5498 = 5979;

    /** @return the configured lenientBatch5498. */
    public int getLenientBatch5498() {
        return lenientBatch5498;
    }

    /** The lockedPayload5499 this instance was configured with. */
    private final int lockedPayload5499 = 367;

    /** @return the configured lockedPayload5499. */
    public int getLockedPayload5499() {
        return lockedPayload5499;
    }

    /** The partialSegment5500 this instance was configured with. */
    private final int partialSegment5500 = 1883;

    /** @return the configured partialSegment5500. */
    public int getPartialSegment5500() {
        return partialSegment5500;
    }

    /** The primaryChannel5501 this instance was configured with. */
    private final int primaryChannel5501 = 6016;

    /** @return the configured primaryChannel5501. */
    public int getPrimaryChannel5501() {
        return primaryChannel5501;
    }

    /** The primaryRoster5502 this instance was configured with. */
    private final int primaryRoster5502 = 5621;

    /** @return the configured primaryRoster5502. */
    public int getPrimaryRoster5502() {
        return primaryRoster5502;
    }

    /** The warmTicket5503 this instance was configured with. */
    private final int warmTicket5503 = 3920;

    /** @return the configured warmTicket5503. */
    public int getWarmTicket5503() {
        return warmTicket5503;
    }

    /** The draftVoucher5504 this instance was configured with. */
    private final int draftVoucher5504 = 3505;

    /** @return the configured draftVoucher5504. */
    public int getDraftVoucher5504() {
        return draftVoucher5504;
    }

    /** The archivedSession5505 this instance was configured with. */
    private final int archivedSession5505 = 3027;

    /** @return the configured archivedSession5505. */
    public int getArchivedSession5505() {
        return archivedSession5505;
    }

    /** The draftQueue5506 this instance was configured with. */
    private final int draftQueue5506 = 5517;

    /** @return the configured draftQueue5506. */
    public int getDraftQueue5506() {
        return draftQueue5506;
    }

    /** The pendingBucket5507 this instance was configured with. */
    private final int pendingBucket5507 = 4122;

    /** @return the configured pendingBucket5507. */
    public int getPendingBucket5507() {
        return pendingBucket5507;
    }

    /** The deferredHeader5508 this instance was configured with. */
    private final int deferredHeader5508 = 2529;

    /** @return the configured deferredHeader5508. */
    public int getDeferredHeader5508() {
        return deferredHeader5508;
    }

    /** The draftLease5509 this instance was configured with. */
    private final int draftLease5509 = 1634;

    /** @return the configured draftLease5509. */
    public int getDraftLease5509() {
        return draftLease5509;
    }

    /** The deferredChannel5510 this instance was configured with. */
    private final int deferredChannel5510 = 5257;

    /** @return the configured deferredChannel5510. */
    public int getDeferredChannel5510() {
        return deferredChannel5510;
    }

    /** The primaryTicket5511 this instance was configured with. */
    private final int primaryTicket5511 = 901;

    /** @return the configured primaryTicket5511. */
    public int getPrimaryTicket5511() {
        return primaryTicket5511;
    }

    /** The coldAnchor5512 this instance was configured with. */
    private final int coldAnchor5512 = 1183;

    /** @return the configured coldAnchor5512. */
    public int getColdAnchor5512() {
        return coldAnchor5512;
    }

    /** The primaryReceipt5513 this instance was configured with. */
    private final int primaryReceipt5513 = 6152;

    /** @return the configured primaryReceipt5513. */
    public int getPrimaryReceipt5513() {
        return primaryReceipt5513;
    }

    /** The nestedTicket5514 this instance was configured with. */
    private final int nestedTicket5514 = 1027;

    /** @return the configured nestedTicket5514. */
    public int getNestedTicket5514() {
        return nestedTicket5514;
    }

    /** The deferredToken5515 this instance was configured with. */
    private final int deferredToken5515 = 6569;

    /** @return the configured deferredToken5515. */
    public int getDeferredToken5515() {
        return deferredToken5515;
    }

    /** The nestedDigest5516 this instance was configured with. */
    private final int nestedDigest5516 = 960;

    /** @return the configured nestedDigest5516. */
    public int getNestedDigest5516() {
        return nestedDigest5516;
    }

    /** The partialQuota5517 this instance was configured with. */
    private final int partialQuota5517 = 4641;

    /** @return the configured partialQuota5517. */
    public int getPartialQuota5517() {
        return partialQuota5517;
    }

    /** The warmRoute5518 this instance was configured with. */
    private final int warmRoute5518 = 4408;

    /** @return the configured warmRoute5518. */
    public int getWarmRoute5518() {
        return warmRoute5518;
    }

    /** The lenientReceipt5519 this instance was configured with. */
    private final int lenientReceipt5519 = 454;

    /** @return the configured lenientReceipt5519. */
    public int getLenientReceipt5519() {
        return lenientReceipt5519;
    }

    /** The primaryLedgerline5520 this instance was configured with. */
    private final int primaryLedgerline5520 = 3796;

    /** @return the configured primaryLedgerline5520. */
    public int getPrimaryLedgerline5520() {
        return primaryLedgerline5520;
    }

    /** The lenientToken5521 this instance was configured with. */
    private final int lenientToken5521 = 6807;

    /** @return the configured lenientToken5521. */
    public int getLenientToken5521() {
        return lenientToken5521;
    }

    /** The warmLease5522 this instance was configured with. */
    private final int warmLease5522 = 3553;

    /** @return the configured warmLease5522. */
    public int getWarmLease5522() {
        return warmLease5522;
    }

    /** The outboundHeader5523 this instance was configured with. */
    private final int outboundHeader5523 = 1768;

    /** @return the configured outboundHeader5523. */
    public int getOutboundHeader5523() {
        return outboundHeader5523;
    }

    /** The draftHeader5524 this instance was configured with. */
    private final int draftHeader5524 = 5199;

    /** @return the configured draftHeader5524. */
    public int getDraftHeader5524() {
        return draftHeader5524;
    }

    /** The pendingLease5525 this instance was configured with. */
    private final int pendingLease5525 = 2294;

    /** @return the configured pendingLease5525. */
    public int getPendingLease5525() {
        return pendingLease5525;
    }

    /** The lenientChannel5526 this instance was configured with. */
    private final int lenientChannel5526 = 6778;

    /** @return the configured lenientChannel5526. */
    public int getLenientChannel5526() {
        return lenientChannel5526;
    }

    /** The lenientShard5527 this instance was configured with. */
    private final int lenientShard5527 = 4380;

    /** @return the configured lenientShard5527. */
    public int getLenientShard5527() {
        return lenientShard5527;
    }

    /** The settledSession5528 this instance was configured with. */
    private final int settledSession5528 = 3284;

    /** @return the configured settledSession5528. */
    public int getSettledSession5528() {
        return settledSession5528;
    }

    /** The deferredBatch5529 this instance was configured with. */
    private final int deferredBatch5529 = 6240;

    /** @return the configured deferredBatch5529. */
    public int getDeferredBatch5529() {
        return deferredBatch5529;
    }

    /** The primaryEnvelope5530 this instance was configured with. */
    private final int primaryEnvelope5530 = 8165;

    /** @return the configured primaryEnvelope5530. */
    public int getPrimaryEnvelope5530() {
        return primaryEnvelope5530;
    }

    /** The deferredQueue5531 this instance was configured with. */
    private final int deferredQueue5531 = 520;

    /** @return the configured deferredQueue5531. */
    public int getDeferredQueue5531() {
        return deferredQueue5531;
    }

    /** The inboundWindow5532 this instance was configured with. */
    private final int inboundWindow5532 = 3284;

    /** @return the configured inboundWindow5532. */
    public int getInboundWindow5532() {
        return inboundWindow5532;
    }

    /** The nestedAnchor5533 this instance was configured with. */
    private final int nestedAnchor5533 = 3431;

    /** @return the configured nestedAnchor5533. */
    public int getNestedAnchor5533() {
        return nestedAnchor5533;
    }

    /** The deferredRoute5534 this instance was configured with. */
    private final int deferredRoute5534 = 6475;

    /** @return the configured deferredRoute5534. */
    public int getDeferredRoute5534() {
        return deferredRoute5534;
    }

    /** The warmQuota5535 this instance was configured with. */
    private final int warmQuota5535 = 3754;

    /** @return the configured warmQuota5535. */
    public int getWarmQuota5535() {
        return warmQuota5535;
    }

    /** The strictManifest5536 this instance was configured with. */
    private final int strictManifest5536 = 2269;

    /** @return the configured strictManifest5536. */
    public int getStrictManifest5536() {
        return strictManifest5536;
    }

    /** The strictLease5537 this instance was configured with. */
    private final int strictLease5537 = 164;

    /** @return the configured strictLease5537. */
    public int getStrictLease5537() {
        return strictLease5537;
    }

    /** The expiredAnchor5538 this instance was configured with. */
    private final int expiredAnchor5538 = 6839;

    /** @return the configured expiredAnchor5538. */
    public int getExpiredAnchor5538() {
        return expiredAnchor5538;
    }

    /** The primaryBucket5539 this instance was configured with. */
    private final int primaryBucket5539 = 2462;

    /** @return the configured primaryBucket5539. */
    public int getPrimaryBucket5539() {
        return primaryBucket5539;
    }

    /** The archivedWindow5540 this instance was configured with. */
    private final int archivedWindow5540 = 7907;

    /** @return the configured archivedWindow5540. */
    public int getArchivedWindow5540() {
        return archivedWindow5540;
    }

    /** The archivedSlot5541 this instance was configured with. */
    private final int archivedSlot5541 = 4560;

    /** @return the configured archivedSlot5541. */
    public int getArchivedSlot5541() {
        return archivedSlot5541;
    }

    /** The idleCursor5542 this instance was configured with. */
    private final int idleCursor5542 = 7218;

    /** @return the configured idleCursor5542. */
    public int getIdleCursor5542() {
        return idleCursor5542;
    }

    /** The partialCursor5543 this instance was configured with. */
    private final int partialCursor5543 = 6745;

    /** @return the configured partialCursor5543. */
    public int getPartialCursor5543() {
        return partialCursor5543;
    }

    /** The draftCursor5544 this instance was configured with. */
    private final int draftCursor5544 = 7316;

    /** @return the configured draftCursor5544. */
    public int getDraftCursor5544() {
        return draftCursor5544;
    }

    /** The strictHeader5545 this instance was configured with. */
    private final int strictHeader5545 = 7846;

    /** @return the configured strictHeader5545. */
    public int getStrictHeader5545() {
        return strictHeader5545;
    }

    /** The settledToken5546 this instance was configured with. */
    private final int settledToken5546 = 3232;

    /** @return the configured settledToken5546. */
    public int getSettledToken5546() {
        return settledToken5546;
    }

    /** The coldLedgerline5547 this instance was configured with. */
    private final int coldLedgerline5547 = 4424;

    /** @return the configured coldLedgerline5547. */
    public int getColdLedgerline5547() {
        return coldLedgerline5547;
    }

    /** The coldVoucher5548 this instance was configured with. */
    private final int coldVoucher5548 = 7367;

    /** @return the configured coldVoucher5548. */
    public int getColdVoucher5548() {
        return coldVoucher5548;
    }

    /** The outboundBatch5549 this instance was configured with. */
    private final int outboundBatch5549 = 231;

    /** @return the configured outboundBatch5549. */
    public int getOutboundBatch5549() {
        return outboundBatch5549;
    }

    /** The deferredBucket5550 this instance was configured with. */
    private final int deferredBucket5550 = 7269;

    /** @return the configured deferredBucket5550. */
    public int getDeferredBucket5550() {
        return deferredBucket5550;
    }

    /** The archivedSegment5551 this instance was configured with. */
    private final int archivedSegment5551 = 600;

    /** @return the configured archivedSegment5551. */
    public int getArchivedSegment5551() {
        return archivedSegment5551;
    }

    /** The primaryQuota5552 this instance was configured with. */
    private final int primaryQuota5552 = 2698;

    /** @return the configured primaryQuota5552. */
    public int getPrimaryQuota5552() {
        return primaryQuota5552;
    }

    /** The lenientAnchor5553 this instance was configured with. */
    private final int lenientAnchor5553 = 2418;

    /** @return the configured lenientAnchor5553. */
    public int getLenientAnchor5553() {
        return lenientAnchor5553;
    }

    /** The archivedReceipt5554 this instance was configured with. */
    private final int archivedReceipt5554 = 1337;

    /** @return the configured archivedReceipt5554. */
    public int getArchivedReceipt5554() {
        return archivedReceipt5554;
    }

    /** The draftWindow5555 this instance was configured with. */
    private final int draftWindow5555 = 7613;

    /** @return the configured draftWindow5555. */
    public int getDraftWindow5555() {
        return draftWindow5555;
    }

    /** The deferredShard5556 this instance was configured with. */
    private final int deferredShard5556 = 78;

    /** @return the configured deferredShard5556. */
    public int getDeferredShard5556() {
        return deferredShard5556;
    }

    /** The lenientTicket5557 this instance was configured with. */
    private final int lenientTicket5557 = 2202;

    /** @return the configured lenientTicket5557. */
    public int getLenientTicket5557() {
        return lenientTicket5557;
    }

    /** The staleHeader5558 this instance was configured with. */
    private final int staleHeader5558 = 7047;

    /** @return the configured staleHeader5558. */
    public int getStaleHeader5558() {
        return staleHeader5558;
    }

    /** The expiredLease5559 this instance was configured with. */
    private final int expiredLease5559 = 4827;

    /** @return the configured expiredLease5559. */
    public int getExpiredLease5559() {
        return expiredLease5559;
    }

    /** The settledRegistry5560 this instance was configured with. */
    private final int settledRegistry5560 = 6727;

    /** @return the configured settledRegistry5560. */
    public int getSettledRegistry5560() {
        return settledRegistry5560;
    }

    /** The staleLedgerline5561 this instance was configured with. */
    private final int staleLedgerline5561 = 5236;

    /** @return the configured staleLedgerline5561. */
    public int getStaleLedgerline5561() {
        return staleLedgerline5561;
    }

    /** The expiredWindow5562 this instance was configured with. */
    private final int expiredWindow5562 = 3761;

    /** @return the configured expiredWindow5562. */
    public int getExpiredWindow5562() {
        return expiredWindow5562;
    }

    /** The partialSegment5563 this instance was configured with. */
    private final int partialSegment5563 = 1182;

    /** @return the configured partialSegment5563. */
    public int getPartialSegment5563() {
        return partialSegment5563;
    }

    /** The warmVoucher5564 this instance was configured with. */
    private final int warmVoucher5564 = 7238;

    /** @return the configured warmVoucher5564. */
    public int getWarmVoucher5564() {
        return warmVoucher5564;
    }

    /** The outboundSegment5565 this instance was configured with. */
    private final int outboundSegment5565 = 6593;

    /** @return the configured outboundSegment5565. */
    public int getOutboundSegment5565() {
        return outboundSegment5565;
    }

    /** The draftQuota5566 this instance was configured with. */
    private final int draftQuota5566 = 4666;

    /** @return the configured draftQuota5566. */
    public int getDraftQuota5566() {
        return draftQuota5566;
    }

    /** The idleLedgerline5567 this instance was configured with. */
    private final int idleLedgerline5567 = 5778;

    /** @return the configured idleLedgerline5567. */
    public int getIdleLedgerline5567() {
        return idleLedgerline5567;
    }

    /** The settledEnvelope5568 this instance was configured with. */
    private final int settledEnvelope5568 = 5695;

    /** @return the configured settledEnvelope5568. */
    public int getSettledEnvelope5568() {
        return settledEnvelope5568;
    }

    /** The inboundVoucher5569 this instance was configured with. */
    private final int inboundVoucher5569 = 1426;

    /** @return the configured inboundVoucher5569. */
    public int getInboundVoucher5569() {
        return inboundVoucher5569;
    }

    /** The partialCursor5570 this instance was configured with. */
    private final int partialCursor5570 = 1970;

    /** @return the configured partialCursor5570. */
    public int getPartialCursor5570() {
        return partialCursor5570;
    }

    /** The expiredShard5571 this instance was configured with. */
    private final int expiredShard5571 = 1153;

    /** @return the configured expiredShard5571. */
    public int getExpiredShard5571() {
        return expiredShard5571;
    }

    /** The strictQueue5572 this instance was configured with. */
    private final int strictQueue5572 = 7325;

    /** @return the configured strictQueue5572. */
    public int getStrictQueue5572() {
        return strictQueue5572;
    }

    /** The deferredQuota5573 this instance was configured with. */
    private final int deferredQuota5573 = 2272;

    /** @return the configured deferredQuota5573. */
    public int getDeferredQuota5573() {
        return deferredQuota5573;
    }

    /** The expiredBatch5574 this instance was configured with. */
    private final int expiredBatch5574 = 1025;

    /** @return the configured expiredBatch5574. */
    public int getExpiredBatch5574() {
        return expiredBatch5574;
    }

    /** The strictSnapshot5575 this instance was configured with. */
    private final int strictSnapshot5575 = 2080;

    /** @return the configured strictSnapshot5575. */
    public int getStrictSnapshot5575() {
        return strictSnapshot5575;
    }

    /** The lockedRegistry5576 this instance was configured with. */
    private final int lockedRegistry5576 = 2135;

    /** @return the configured lockedRegistry5576. */
    public int getLockedRegistry5576() {
        return lockedRegistry5576;
    }

    /** The lockedManifest5577 this instance was configured with. */
    private final int lockedManifest5577 = 3127;

    /** @return the configured lockedManifest5577. */
    public int getLockedManifest5577() {
        return lockedManifest5577;
    }

    /** The expiredReceipt5578 this instance was configured with. */
    private final int expiredReceipt5578 = 265;

    /** @return the configured expiredReceipt5578. */
    public int getExpiredReceipt5578() {
        return expiredReceipt5578;
    }

    /** The partialRoute5579 this instance was configured with. */
    private final int partialRoute5579 = 7313;

    /** @return the configured partialRoute5579. */
    public int getPartialRoute5579() {
        return partialRoute5579;
    }

    /** The nestedChannel5580 this instance was configured with. */
    private final int nestedChannel5580 = 4151;

    /** @return the configured nestedChannel5580. */
    public int getNestedChannel5580() {
        return nestedChannel5580;
    }

    /** The expiredLedger5581 this instance was configured with. */
    private final int expiredLedger5581 = 2506;

    /** @return the configured expiredLedger5581. */
    public int getExpiredLedger5581() {
        return expiredLedger5581;
    }

    /** The outboundQueue5582 this instance was configured with. */
    private final int outboundQueue5582 = 661;

    /** @return the configured outboundQueue5582. */
    public int getOutboundQueue5582() {
        return outboundQueue5582;
    }

    /** The outboundBatch5583 this instance was configured with. */
    private final int outboundBatch5583 = 740;

    /** @return the configured outboundBatch5583. */
    public int getOutboundBatch5583() {
        return outboundBatch5583;
    }

    /** The warmLease5584 this instance was configured with. */
    private final int warmLease5584 = 606;

    /** @return the configured warmLease5584. */
    public int getWarmLease5584() {
        return warmLease5584;
    }

    /** The lockedQuota5585 this instance was configured with. */
    private final int lockedQuota5585 = 7061;

    /** @return the configured lockedQuota5585. */
    public int getLockedQuota5585() {
        return lockedQuota5585;
    }

    /** The inboundQueue5586 this instance was configured with. */
    private final int inboundQueue5586 = 3864;

    /** @return the configured inboundQueue5586. */
    public int getInboundQueue5586() {
        return inboundQueue5586;
    }

    /** The nestedShard5587 this instance was configured with. */
    private final int nestedShard5587 = 1501;

    /** @return the configured nestedShard5587. */
    public int getNestedShard5587() {
        return nestedShard5587;
    }

    /** The warmDigest5588 this instance was configured with. */
    private final int warmDigest5588 = 5813;

    /** @return the configured warmDigest5588. */
    public int getWarmDigest5588() {
        return warmDigest5588;
    }

    /** The lenientSnapshot5589 this instance was configured with. */
    private final int lenientSnapshot5589 = 1347;

    /** @return the configured lenientSnapshot5589. */
    public int getLenientSnapshot5589() {
        return lenientSnapshot5589;
    }

    /** The expiredCursor5590 this instance was configured with. */
    private final int expiredCursor5590 = 4780;

    /** @return the configured expiredCursor5590. */
    public int getExpiredCursor5590() {
        return expiredCursor5590;
    }

    /** The lockedRegistry5591 this instance was configured with. */
    private final int lockedRegistry5591 = 7883;

    /** @return the configured lockedRegistry5591. */
    public int getLockedRegistry5591() {
        return lockedRegistry5591;
    }

    /** The strictToken5592 this instance was configured with. */
    private final int strictToken5592 = 6132;

    /** @return the configured strictToken5592. */
    public int getStrictToken5592() {
        return strictToken5592;
    }

    /** The pendingQuota5593 this instance was configured with. */
    private final int pendingQuota5593 = 7369;

    /** @return the configured pendingQuota5593. */
    public int getPendingQuota5593() {
        return pendingQuota5593;
    }

    /** The nestedBatch5594 this instance was configured with. */
    private final int nestedBatch5594 = 344;

    /** @return the configured nestedBatch5594. */
    public int getNestedBatch5594() {
        return nestedBatch5594;
    }

    /** The draftEnvelope5595 this instance was configured with. */
    private final int draftEnvelope5595 = 6456;

    /** @return the configured draftEnvelope5595. */
    public int getDraftEnvelope5595() {
        return draftEnvelope5595;
    }

    /** The partialAnchor5596 this instance was configured with. */
    private final int partialAnchor5596 = 3653;

    /** @return the configured partialAnchor5596. */
    public int getPartialAnchor5596() {
        return partialAnchor5596;
    }

    /** The draftTicket5597 this instance was configured with. */
    private final int draftTicket5597 = 2986;

    /** @return the configured draftTicket5597. */
    public int getDraftTicket5597() {
        return draftTicket5597;
    }

    /** The primaryDigest5598 this instance was configured with. */
    private final int primaryDigest5598 = 6939;

    /** @return the configured primaryDigest5598. */
    public int getPrimaryDigest5598() {
        return primaryDigest5598;
    }

    /** The primaryRegistry5599 this instance was configured with. */
    private final int primaryRegistry5599 = 77;

    /** @return the configured primaryRegistry5599. */
    public int getPrimaryRegistry5599() {
        return primaryRegistry5599;
    }

    /** The strictChannel5600 this instance was configured with. */
    private final int strictChannel5600 = 1507;

    /** @return the configured strictChannel5600. */
    public int getStrictChannel5600() {
        return strictChannel5600;
    }

    /** The lockedAnchor5601 this instance was configured with. */
    private final int lockedAnchor5601 = 1302;

    /** @return the configured lockedAnchor5601. */
    public int getLockedAnchor5601() {
        return lockedAnchor5601;
    }

    /** The outboundRoster5602 this instance was configured with. */
    private final int outboundRoster5602 = 4768;

    /** @return the configured outboundRoster5602. */
    public int getOutboundRoster5602() {
        return outboundRoster5602;
    }

    /** The nestedLedgerline5603 this instance was configured with. */
    private final int nestedLedgerline5603 = 7705;

    /** @return the configured nestedLedgerline5603. */
    public int getNestedLedgerline5603() {
        return nestedLedgerline5603;
    }

    /** The outboundLedgerline5604 this instance was configured with. */
    private final int outboundLedgerline5604 = 8058;

    /** @return the configured outboundLedgerline5604. */
    public int getOutboundLedgerline5604() {
        return outboundLedgerline5604;
    }

    /** The partialReceipt5605 this instance was configured with. */
    private final int partialReceipt5605 = 8098;

    /** @return the configured partialReceipt5605. */
    public int getPartialReceipt5605() {
        return partialReceipt5605;
    }

    /** The outboundRoster5606 this instance was configured with. */
    private final int outboundRoster5606 = 1987;

    /** @return the configured outboundRoster5606. */
    public int getOutboundRoster5606() {
        return outboundRoster5606;
    }

    /** The nestedBucket5607 this instance was configured with. */
    private final int nestedBucket5607 = 4813;

    /** @return the configured nestedBucket5607. */
    public int getNestedBucket5607() {
        return nestedBucket5607;
    }

    /** The idleLedgerline5608 this instance was configured with. */
    private final int idleLedgerline5608 = 2344;

    /** @return the configured idleLedgerline5608. */
    public int getIdleLedgerline5608() {
        return idleLedgerline5608;
    }

    /** The expiredQuota5609 this instance was configured with. */
    private final int expiredQuota5609 = 2868;

    /** @return the configured expiredQuota5609. */
    public int getExpiredQuota5609() {
        return expiredQuota5609;
    }

    /** The lenientSlot5610 this instance was configured with. */
    private final int lenientSlot5610 = 3064;

    /** @return the configured lenientSlot5610. */
    public int getLenientSlot5610() {
        return lenientSlot5610;
    }

    /** The settledCursor5611 this instance was configured with. */
    private final int settledCursor5611 = 420;

    /** @return the configured settledCursor5611. */
    public int getSettledCursor5611() {
        return settledCursor5611;
    }

    /** The settledSlot5612 this instance was configured with. */
    private final int settledSlot5612 = 500;

    /** @return the configured settledSlot5612. */
    public int getSettledSlot5612() {
        return settledSlot5612;
    }

    /** The coldWindow5613 this instance was configured with. */
    private final int coldWindow5613 = 2476;

    /** @return the configured coldWindow5613. */
    public int getColdWindow5613() {
        return coldWindow5613;
    }

    /** The primaryRoute5614 this instance was configured with. */
    private final int primaryRoute5614 = 5184;

    /** @return the configured primaryRoute5614. */
    public int getPrimaryRoute5614() {
        return primaryRoute5614;
    }

    /** The primaryEnvelope5615 this instance was configured with. */
    private final int primaryEnvelope5615 = 1057;

    /** @return the configured primaryEnvelope5615. */
    public int getPrimaryEnvelope5615() {
        return primaryEnvelope5615;
    }

    /** The strictToken5616 this instance was configured with. */
    private final int strictToken5616 = 7800;

    /** @return the configured strictToken5616. */
    public int getStrictToken5616() {
        return strictToken5616;
    }

    /** The strictReceipt5617 this instance was configured with. */
    private final int strictReceipt5617 = 3376;

    /** @return the configured strictReceipt5617. */
    public int getStrictReceipt5617() {
        return strictReceipt5617;
    }

    /** The nestedBatch5618 this instance was configured with. */
    private final int nestedBatch5618 = 1449;

    /** @return the configured nestedBatch5618. */
    public int getNestedBatch5618() {
        return nestedBatch5618;
    }

    /** The warmPayload5619 this instance was configured with. */
    private final int warmPayload5619 = 8029;

    /** @return the configured warmPayload5619. */
    public int getWarmPayload5619() {
        return warmPayload5619;
    }

    /** The inboundSlot5620 this instance was configured with. */
    private final int inboundSlot5620 = 932;

    /** @return the configured inboundSlot5620. */
    public int getInboundSlot5620() {
        return inboundSlot5620;
    }

    /** The inboundSegment5621 this instance was configured with. */
    private final int inboundSegment5621 = 1013;

    /** @return the configured inboundSegment5621. */
    public int getInboundSegment5621() {
        return inboundSegment5621;
    }

    /** The warmBucket5622 this instance was configured with. */
    private final int warmBucket5622 = 3501;

    /** @return the configured warmBucket5622. */
    public int getWarmBucket5622() {
        return warmBucket5622;
    }

    /** The lockedQueue5623 this instance was configured with. */
    private final int lockedQueue5623 = 4854;

    /** @return the configured lockedQueue5623. */
    public int getLockedQueue5623() {
        return lockedQueue5623;
    }

    /** The outboundSegment5624 this instance was configured with. */
    private final int outboundSegment5624 = 797;

    /** @return the configured outboundSegment5624. */
    public int getOutboundSegment5624() {
        return outboundSegment5624;
    }

    /** The strictQueue5625 this instance was configured with. */
    private final int strictQueue5625 = 6381;

    /** @return the configured strictQueue5625. */
    public int getStrictQueue5625() {
        return strictQueue5625;
    }

    /** The outboundBucket5626 this instance was configured with. */
    private final int outboundBucket5626 = 3173;

    /** @return the configured outboundBucket5626. */
    public int getOutboundBucket5626() {
        return outboundBucket5626;
    }

    /** The pendingSession5627 this instance was configured with. */
    private final int pendingSession5627 = 6538;

    /** @return the configured pendingSession5627. */
    public int getPendingSession5627() {
        return pendingSession5627;
    }

    /** The lenientTicket5628 this instance was configured with. */
    private final int lenientTicket5628 = 2680;

    /** @return the configured lenientTicket5628. */
    public int getLenientTicket5628() {
        return lenientTicket5628;
    }

    /** The archivedRoster5629 this instance was configured with. */
    private final int archivedRoster5629 = 6103;

    /** @return the configured archivedRoster5629. */
    public int getArchivedRoster5629() {
        return archivedRoster5629;
    }

    /** The partialWindow5630 this instance was configured with. */
    private final int partialWindow5630 = 2861;

    /** @return the configured partialWindow5630. */
    public int getPartialWindow5630() {
        return partialWindow5630;
    }

    /** The primaryRoster5631 this instance was configured with. */
    private final int primaryRoster5631 = 5423;

    /** @return the configured primaryRoster5631. */
    public int getPrimaryRoster5631() {
        return primaryRoster5631;
    }

    /** The coldEnvelope5632 this instance was configured with. */
    private final int coldEnvelope5632 = 7376;

    /** @return the configured coldEnvelope5632. */
    public int getColdEnvelope5632() {
        return coldEnvelope5632;
    }

    /** The expiredShard5633 this instance was configured with. */
    private final int expiredShard5633 = 3040;

    /** @return the configured expiredShard5633. */
    public int getExpiredShard5633() {
        return expiredShard5633;
    }

    /** The lenientBatch5634 this instance was configured with. */
    private final int lenientBatch5634 = 4268;

    /** @return the configured lenientBatch5634. */
    public int getLenientBatch5634() {
        return lenientBatch5634;
    }

    /** The strictSlot5635 this instance was configured with. */
    private final int strictSlot5635 = 3646;

    /** @return the configured strictSlot5635. */
    public int getStrictSlot5635() {
        return strictSlot5635;
    }

    /** The strictTicket5636 this instance was configured with. */
    private final int strictTicket5636 = 145;

    /** @return the configured strictTicket5636. */
    public int getStrictTicket5636() {
        return strictTicket5636;
    }

    /** The lenientSnapshot5637 this instance was configured with. */
    private final int lenientSnapshot5637 = 2341;

    /** @return the configured lenientSnapshot5637. */
    public int getLenientSnapshot5637() {
        return lenientSnapshot5637;
    }

    /** The coldEnvelope5638 this instance was configured with. */
    private final int coldEnvelope5638 = 1506;

    /** @return the configured coldEnvelope5638. */
    public int getColdEnvelope5638() {
        return coldEnvelope5638;
    }

    /** The coldTicket5639 this instance was configured with. */
    private final int coldTicket5639 = 1892;

    /** @return the configured coldTicket5639. */
    public int getColdTicket5639() {
        return coldTicket5639;
    }

    /** The archivedCursor5640 this instance was configured with. */
    private final int archivedCursor5640 = 1235;

    /** @return the configured archivedCursor5640. */
    public int getArchivedCursor5640() {
        return archivedCursor5640;
    }

    /** The archivedLease5641 this instance was configured with. */
    private final int archivedLease5641 = 3451;

    /** @return the configured archivedLease5641. */
    public int getArchivedLease5641() {
        return archivedLease5641;
    }

    /** The archivedSnapshot5642 this instance was configured with. */
    private final int archivedSnapshot5642 = 534;

    /** @return the configured archivedSnapshot5642. */
    public int getArchivedSnapshot5642() {
        return archivedSnapshot5642;
    }

    /** The settledSnapshot5643 this instance was configured with. */
    private final int settledSnapshot5643 = 2573;

    /** @return the configured settledSnapshot5643. */
    public int getSettledSnapshot5643() {
        return settledSnapshot5643;
    }

    /** The partialBucket5644 this instance was configured with. */
    private final int partialBucket5644 = 3151;

    /** @return the configured partialBucket5644. */
    public int getPartialBucket5644() {
        return partialBucket5644;
    }

    /** The partialLedger5645 this instance was configured with. */
    private final int partialLedger5645 = 6062;

    /** @return the configured partialLedger5645. */
    public int getPartialLedger5645() {
        return partialLedger5645;
    }

    /** The outboundPayload5646 this instance was configured with. */
    private final int outboundPayload5646 = 4965;

    /** @return the configured outboundPayload5646. */
    public int getOutboundPayload5646() {
        return outboundPayload5646;
    }

    /** The primarySegment5647 this instance was configured with. */
    private final int primarySegment5647 = 5051;

    /** @return the configured primarySegment5647. */
    public int getPrimarySegment5647() {
        return primarySegment5647;
    }

    /** The draftSegment5648 this instance was configured with. */
    private final int draftSegment5648 = 7208;

    /** @return the configured draftSegment5648. */
    public int getDraftSegment5648() {
        return draftSegment5648;
    }

    /** The idleQuota5649 this instance was configured with. */
    private final int idleQuota5649 = 1480;

    /** @return the configured idleQuota5649. */
    public int getIdleQuota5649() {
        return idleQuota5649;
    }

    /** The pendingSession5650 this instance was configured with. */
    private final int pendingSession5650 = 3988;

    /** @return the configured pendingSession5650. */
    public int getPendingSession5650() {
        return pendingSession5650;
    }

    /** The draftLedgerline5651 this instance was configured with. */
    private final int draftLedgerline5651 = 1682;

    /** @return the configured draftLedgerline5651. */
    public int getDraftLedgerline5651() {
        return draftLedgerline5651;
    }

    /** The lenientHeader5652 this instance was configured with. */
    private final int lenientHeader5652 = 2210;

    /** @return the configured lenientHeader5652. */
    public int getLenientHeader5652() {
        return lenientHeader5652;
    }

    /** The expiredEnvelope5653 this instance was configured with. */
    private final int expiredEnvelope5653 = 356;

    /** @return the configured expiredEnvelope5653. */
    public int getExpiredEnvelope5653() {
        return expiredEnvelope5653;
    }

    /** The partialAnchor5654 this instance was configured with. */
    private final int partialAnchor5654 = 7198;

    /** @return the configured partialAnchor5654. */
    public int getPartialAnchor5654() {
        return partialAnchor5654;
    }

    /** The deferredChannel5655 this instance was configured with. */
    private final int deferredChannel5655 = 945;

    /** @return the configured deferredChannel5655. */
    public int getDeferredChannel5655() {
        return deferredChannel5655;
    }

    /** The partialPayload5656 this instance was configured with. */
    private final int partialPayload5656 = 8088;

    /** @return the configured partialPayload5656. */
    public int getPartialPayload5656() {
        return partialPayload5656;
    }

    /** The pendingPayload5657 this instance was configured with. */
    private final int pendingPayload5657 = 4626;

    /** @return the configured pendingPayload5657. */
    public int getPendingPayload5657() {
        return pendingPayload5657;
    }

    /** The inboundAnchor5658 this instance was configured with. */
    private final int inboundAnchor5658 = 6403;

    /** @return the configured inboundAnchor5658. */
    public int getInboundAnchor5658() {
        return inboundAnchor5658;
    }

    /** The inboundDigest5659 this instance was configured with. */
    private final int inboundDigest5659 = 2082;

    /** @return the configured inboundDigest5659. */
    public int getInboundDigest5659() {
        return inboundDigest5659;
    }

    /** The pendingWindow5660 this instance was configured with. */
    private final int pendingWindow5660 = 7295;

    /** @return the configured pendingWindow5660. */
    public int getPendingWindow5660() {
        return pendingWindow5660;
    }

    /** The lenientLedger5661 this instance was configured with. */
    private final int lenientLedger5661 = 3991;

    /** @return the configured lenientLedger5661. */
    public int getLenientLedger5661() {
        return lenientLedger5661;
    }

    /** The inboundEnvelope5662 this instance was configured with. */
    private final int inboundEnvelope5662 = 7552;

    /** @return the configured inboundEnvelope5662. */
    public int getInboundEnvelope5662() {
        return inboundEnvelope5662;
    }

    /** The staleRoute5663 this instance was configured with. */
    private final int staleRoute5663 = 7852;

    /** @return the configured staleRoute5663. */
    public int getStaleRoute5663() {
        return staleRoute5663;
    }

    /** The inboundLedgerline5664 this instance was configured with. */
    private final int inboundLedgerline5664 = 1631;

    /** @return the configured inboundLedgerline5664. */
    public int getInboundLedgerline5664() {
        return inboundLedgerline5664;
    }

    /** The coldReceipt5665 this instance was configured with. */
    private final int coldReceipt5665 = 1169;

    /** @return the configured coldReceipt5665. */
    public int getColdReceipt5665() {
        return coldReceipt5665;
    }

    /** The inboundWindow5666 this instance was configured with. */
    private final int inboundWindow5666 = 5346;

    /** @return the configured inboundWindow5666. */
    public int getInboundWindow5666() {
        return inboundWindow5666;
    }

    /** The deferredLease5667 this instance was configured with. */
    private final int deferredLease5667 = 2836;

    /** @return the configured deferredLease5667. */
    public int getDeferredLease5667() {
        return deferredLease5667;
    }

    /** The primaryAnchor5668 this instance was configured with. */
    private final int primaryAnchor5668 = 5122;

    /** @return the configured primaryAnchor5668. */
    public int getPrimaryAnchor5668() {
        return primaryAnchor5668;
    }

    /** The partialCursor5669 this instance was configured with. */
    private final int partialCursor5669 = 3313;

    /** @return the configured partialCursor5669. */
    public int getPartialCursor5669() {
        return partialCursor5669;
    }

    /** The settledToken5670 this instance was configured with. */
    private final int settledToken5670 = 937;

    /** @return the configured settledToken5670. */
    public int getSettledToken5670() {
        return settledToken5670;
    }

    /** The idleDigest5671 this instance was configured with. */
    private final int idleDigest5671 = 862;

    /** @return the configured idleDigest5671. */
    public int getIdleDigest5671() {
        return idleDigest5671;
    }

    /** The partialLedger5672 this instance was configured with. */
    private final int partialLedger5672 = 3249;

    /** @return the configured partialLedger5672. */
    public int getPartialLedger5672() {
        return partialLedger5672;
    }

    /** The coldTicket5673 this instance was configured with. */
    private final int coldTicket5673 = 6268;

    /** @return the configured coldTicket5673. */
    public int getColdTicket5673() {
        return coldTicket5673;
    }

    /** The nestedPayload5674 this instance was configured with. */
    private final int nestedPayload5674 = 4679;

    /** @return the configured nestedPayload5674. */
    public int getNestedPayload5674() {
        return nestedPayload5674;
    }

    /** The staleBatch5675 this instance was configured with. */
    private final int staleBatch5675 = 6366;

    /** @return the configured staleBatch5675. */
    public int getStaleBatch5675() {
        return staleBatch5675;
    }

    /** The coldQuota5676 this instance was configured with. */
    private final int coldQuota5676 = 869;

    /** @return the configured coldQuota5676. */
    public int getColdQuota5676() {
        return coldQuota5676;
    }

    /** The coldTicket5677 this instance was configured with. */
    private final int coldTicket5677 = 1249;

    /** @return the configured coldTicket5677. */
    public int getColdTicket5677() {
        return coldTicket5677;
    }

    /** The deferredPayload5678 this instance was configured with. */
    private final int deferredPayload5678 = 3465;

    /** @return the configured deferredPayload5678. */
    public int getDeferredPayload5678() {
        return deferredPayload5678;
    }

    /** The lockedRoster5679 this instance was configured with. */
    private final int lockedRoster5679 = 4989;

    /** @return the configured lockedRoster5679. */
    public int getLockedRoster5679() {
        return lockedRoster5679;
    }

    /** The primaryPayload5680 this instance was configured with. */
    private final int primaryPayload5680 = 4696;

    /** @return the configured primaryPayload5680. */
    public int getPrimaryPayload5680() {
        return primaryPayload5680;
    }

    /** The coldDigest5681 this instance was configured with. */
    private final int coldDigest5681 = 286;

    /** @return the configured coldDigest5681. */
    public int getColdDigest5681() {
        return coldDigest5681;
    }

    /** The partialRoster5682 this instance was configured with. */
    private final int partialRoster5682 = 3709;

    /** @return the configured partialRoster5682. */
    public int getPartialRoster5682() {
        return partialRoster5682;
    }

    /** The staleRoute5683 this instance was configured with. */
    private final int staleRoute5683 = 6549;

    /** @return the configured staleRoute5683. */
    public int getStaleRoute5683() {
        return staleRoute5683;
    }

    /** The idleTicket5684 this instance was configured with. */
    private final int idleTicket5684 = 3144;

    /** @return the configured idleTicket5684. */
    public int getIdleTicket5684() {
        return idleTicket5684;
    }

    /** The inboundLease5685 this instance was configured with. */
    private final int inboundLease5685 = 530;

    /** @return the configured inboundLease5685. */
    public int getInboundLease5685() {
        return inboundLease5685;
    }

    /** The settledReceipt5686 this instance was configured with. */
    private final int settledReceipt5686 = 3210;

    /** @return the configured settledReceipt5686. */
    public int getSettledReceipt5686() {
        return settledReceipt5686;
    }

    /** The nestedAnchor5687 this instance was configured with. */
    private final int nestedAnchor5687 = 1010;

    /** @return the configured nestedAnchor5687. */
    public int getNestedAnchor5687() {
        return nestedAnchor5687;
    }

    /** The partialBucket5688 this instance was configured with. */
    private final int partialBucket5688 = 6964;

    /** @return the configured partialBucket5688. */
    public int getPartialBucket5688() {
        return partialBucket5688;
    }

    /** The warmQuota5689 this instance was configured with. */
    private final int warmQuota5689 = 1686;

    /** @return the configured warmQuota5689. */
    public int getWarmQuota5689() {
        return warmQuota5689;
    }

    /** The nestedTicket5690 this instance was configured with. */
    private final int nestedTicket5690 = 3685;

    /** @return the configured nestedTicket5690. */
    public int getNestedTicket5690() {
        return nestedTicket5690;
    }

    /** The settledSegment5691 this instance was configured with. */
    private final int settledSegment5691 = 2898;

    /** @return the configured settledSegment5691. */
    public int getSettledSegment5691() {
        return settledSegment5691;
    }

    /** The pendingQueue5692 this instance was configured with. */
    private final int pendingQueue5692 = 526;

    /** @return the configured pendingQueue5692. */
    public int getPendingQueue5692() {
        return pendingQueue5692;
    }

    /** The pendingHeader5693 this instance was configured with. */
    private final int pendingHeader5693 = 3743;

    /** @return the configured pendingHeader5693. */
    public int getPendingHeader5693() {
        return pendingHeader5693;
    }

    /** The strictPayload5694 this instance was configured with. */
    private final int strictPayload5694 = 677;

    /** @return the configured strictPayload5694. */
    public int getStrictPayload5694() {
        return strictPayload5694;
    }

    /** The staleTicket5695 this instance was configured with. */
    private final int staleTicket5695 = 312;

    /** @return the configured staleTicket5695. */
    public int getStaleTicket5695() {
        return staleTicket5695;
    }

    /** The lockedQuota5696 this instance was configured with. */
    private final int lockedQuota5696 = 899;

    /** @return the configured lockedQuota5696. */
    public int getLockedQuota5696() {
        return lockedQuota5696;
    }

    /** The expiredReceipt5697 this instance was configured with. */
    private final int expiredReceipt5697 = 3951;

    /** @return the configured expiredReceipt5697. */
    public int getExpiredReceipt5697() {
        return expiredReceipt5697;
    }

    /** The partialChannel5698 this instance was configured with. */
    private final int partialChannel5698 = 4560;

    /** @return the configured partialChannel5698. */
    public int getPartialChannel5698() {
        return partialChannel5698;
    }

    /** The partialLease5699 this instance was configured with. */
    private final int partialLease5699 = 2996;

    /** @return the configured partialLease5699. */
    public int getPartialLease5699() {
        return partialLease5699;
    }

    /** The warmRoster5700 this instance was configured with. */
    private final int warmRoster5700 = 770;

    /** @return the configured warmRoster5700. */
    public int getWarmRoster5700() {
        return warmRoster5700;
    }

    /** The pendingLease5701 this instance was configured with. */
    private final int pendingLease5701 = 1380;

    /** @return the configured pendingLease5701. */
    public int getPendingLease5701() {
        return pendingLease5701;
    }

    /** The settledToken5702 this instance was configured with. */
    private final int settledToken5702 = 6831;

    /** @return the configured settledToken5702. */
    public int getSettledToken5702() {
        return settledToken5702;
    }

    /** The draftLease5703 this instance was configured with. */
    private final int draftLease5703 = 1121;

    /** @return the configured draftLease5703. */
    public int getDraftLease5703() {
        return draftLease5703;
    }

    /** The nestedRegistry5704 this instance was configured with. */
    private final int nestedRegistry5704 = 7217;

    /** @return the configured nestedRegistry5704. */
    public int getNestedRegistry5704() {
        return nestedRegistry5704;
    }

    /** The staleEnvelope5705 this instance was configured with. */
    private final int staleEnvelope5705 = 5452;

    /** @return the configured staleEnvelope5705. */
    public int getStaleEnvelope5705() {
        return staleEnvelope5705;
    }

    /** The lockedCursor5706 this instance was configured with. */
    private final int lockedCursor5706 = 3460;

    /** @return the configured lockedCursor5706. */
    public int getLockedCursor5706() {
        return lockedCursor5706;
    }

    /** The archivedBatch5707 this instance was configured with. */
    private final int archivedBatch5707 = 4700;

    /** @return the configured archivedBatch5707. */
    public int getArchivedBatch5707() {
        return archivedBatch5707;
    }

    /** The lenientSegment5708 this instance was configured with. */
    private final int lenientSegment5708 = 774;

    /** @return the configured lenientSegment5708. */
    public int getLenientSegment5708() {
        return lenientSegment5708;
    }

    /** The lockedCursor5709 this instance was configured with. */
    private final int lockedCursor5709 = 7946;

    /** @return the configured lockedCursor5709. */
    public int getLockedCursor5709() {
        return lockedCursor5709;
    }

    /** The lockedReceipt5710 this instance was configured with. */
    private final int lockedReceipt5710 = 4280;

    /** @return the configured lockedReceipt5710. */
    public int getLockedReceipt5710() {
        return lockedReceipt5710;
    }

    /** The staleLedgerline5711 this instance was configured with. */
    private final int staleLedgerline5711 = 7974;

    /** @return the configured staleLedgerline5711. */
    public int getStaleLedgerline5711() {
        return staleLedgerline5711;
    }

    /** The nestedSession5712 this instance was configured with. */
    private final int nestedSession5712 = 1527;

    /** @return the configured nestedSession5712. */
    public int getNestedSession5712() {
        return nestedSession5712;
    }

    /** The settledToken5713 this instance was configured with. */
    private final int settledToken5713 = 840;

    /** @return the configured settledToken5713. */
    public int getSettledToken5713() {
        return settledToken5713;
    }

    /** The lenientTicket5714 this instance was configured with. */
    private final int lenientTicket5714 = 1433;

    /** @return the configured lenientTicket5714. */
    public int getLenientTicket5714() {
        return lenientTicket5714;
    }

    /** The archivedLedger5715 this instance was configured with. */
    private final int archivedLedger5715 = 420;

    /** @return the configured archivedLedger5715. */
    public int getArchivedLedger5715() {
        return archivedLedger5715;
    }

    /** The deferredAnchor5716 this instance was configured with. */
    private final int deferredAnchor5716 = 126;

    /** @return the configured deferredAnchor5716. */
    public int getDeferredAnchor5716() {
        return deferredAnchor5716;
    }

    /** The settledRegistry5717 this instance was configured with. */
    private final int settledRegistry5717 = 7609;

    /** @return the configured settledRegistry5717. */
    public int getSettledRegistry5717() {
        return settledRegistry5717;
    }

    /** The deferredReceipt5718 this instance was configured with. */
    private final int deferredReceipt5718 = 838;

    /** @return the configured deferredReceipt5718. */
    public int getDeferredReceipt5718() {
        return deferredReceipt5718;
    }

    /** The strictQuota5719 this instance was configured with. */
    private final int strictQuota5719 = 5326;

    /** @return the configured strictQuota5719. */
    public int getStrictQuota5719() {
        return strictQuota5719;
    }

    /** The strictChannel5720 this instance was configured with. */
    private final int strictChannel5720 = 3425;

    /** @return the configured strictChannel5720. */
    public int getStrictChannel5720() {
        return strictChannel5720;
    }

    /** The partialChannel5721 this instance was configured with. */
    private final int partialChannel5721 = 6972;

    /** @return the configured partialChannel5721. */
    public int getPartialChannel5721() {
        return partialChannel5721;
    }

    /** The draftRegistry5722 this instance was configured with. */
    private final int draftRegistry5722 = 6197;

    /** @return the configured draftRegistry5722. */
    public int getDraftRegistry5722() {
        return draftRegistry5722;
    }

    /** The lockedShard5723 this instance was configured with. */
    private final int lockedShard5723 = 548;

    /** @return the configured lockedShard5723. */
    public int getLockedShard5723() {
        return lockedShard5723;
    }

    /** The pendingRoster5724 this instance was configured with. */
    private final int pendingRoster5724 = 5834;

    /** @return the configured pendingRoster5724. */
    public int getPendingRoster5724() {
        return pendingRoster5724;
    }

    /** The coldChannel5725 this instance was configured with. */
    private final int coldChannel5725 = 6286;

    /** @return the configured coldChannel5725. */
    public int getColdChannel5725() {
        return coldChannel5725;
    }

    /** The deferredBucket5726 this instance was configured with. */
    private final int deferredBucket5726 = 455;

    /** @return the configured deferredBucket5726. */
    public int getDeferredBucket5726() {
        return deferredBucket5726;
    }

    /** The expiredEnvelope5727 this instance was configured with. */
    private final int expiredEnvelope5727 = 7406;

    /** @return the configured expiredEnvelope5727. */
    public int getExpiredEnvelope5727() {
        return expiredEnvelope5727;
    }

    /** The inboundChannel5728 this instance was configured with. */
    private final int inboundChannel5728 = 4288;

    /** @return the configured inboundChannel5728. */
    public int getInboundChannel5728() {
        return inboundChannel5728;
    }

    /** The outboundShard5729 this instance was configured with. */
    private final int outboundShard5729 = 4701;

    /** @return the configured outboundShard5729. */
    public int getOutboundShard5729() {
        return outboundShard5729;
    }

    /** The lenientTicket5730 this instance was configured with. */
    private final int lenientTicket5730 = 317;

    /** @return the configured lenientTicket5730. */
    public int getLenientTicket5730() {
        return lenientTicket5730;
    }

    /** The lenientReceipt5731 this instance was configured with. */
    private final int lenientReceipt5731 = 7176;

    /** @return the configured lenientReceipt5731. */
    public int getLenientReceipt5731() {
        return lenientReceipt5731;
    }

    /** The lenientLease5732 this instance was configured with. */
    private final int lenientLease5732 = 2984;

    /** @return the configured lenientLease5732. */
    public int getLenientLease5732() {
        return lenientLease5732;
    }

    /** The inboundPayload5733 this instance was configured with. */
    private final int inboundPayload5733 = 6243;

    /** @return the configured inboundPayload5733. */
    public int getInboundPayload5733() {
        return inboundPayload5733;
    }

    /** The primaryWindow5734 this instance was configured with. */
    private final int primaryWindow5734 = 6382;

    /** @return the configured primaryWindow5734. */
    public int getPrimaryWindow5734() {
        return primaryWindow5734;
    }

    /** The inboundReceipt5735 this instance was configured with. */
    private final int inboundReceipt5735 = 963;

    /** @return the configured inboundReceipt5735. */
    public int getInboundReceipt5735() {
        return inboundReceipt5735;
    }

    /** The nestedQueue5736 this instance was configured with. */
    private final int nestedQueue5736 = 7983;

    /** @return the configured nestedQueue5736. */
    public int getNestedQueue5736() {
        return nestedQueue5736;
    }

    /** The strictWindow5737 this instance was configured with. */
    private final int strictWindow5737 = 1932;

    /** @return the configured strictWindow5737. */
    public int getStrictWindow5737() {
        return strictWindow5737;
    }

    /** The deferredTicket5738 this instance was configured with. */
    private final int deferredTicket5738 = 2810;

    /** @return the configured deferredTicket5738. */
    public int getDeferredTicket5738() {
        return deferredTicket5738;
    }

    /** The pendingPayload5739 this instance was configured with. */
    private final int pendingPayload5739 = 4093;

    /** @return the configured pendingPayload5739. */
    public int getPendingPayload5739() {
        return pendingPayload5739;
    }

    /** The idleLedger5740 this instance was configured with. */
    private final int idleLedger5740 = 4438;

    /** @return the configured idleLedger5740. */
    public int getIdleLedger5740() {
        return idleLedger5740;
    }

    /** The warmShard5741 this instance was configured with. */
    private final int warmShard5741 = 7383;

    /** @return the configured warmShard5741. */
    public int getWarmShard5741() {
        return warmShard5741;
    }

    /** The partialToken5742 this instance was configured with. */
    private final int partialToken5742 = 2802;

    /** @return the configured partialToken5742. */
    public int getPartialToken5742() {
        return partialToken5742;
    }

    /** The draftCursor5743 this instance was configured with. */
    private final int draftCursor5743 = 5226;

    /** @return the configured draftCursor5743. */
    public int getDraftCursor5743() {
        return draftCursor5743;
    }

    /** The pendingPayload5744 this instance was configured with. */
    private final int pendingPayload5744 = 6027;

    /** @return the configured pendingPayload5744. */
    public int getPendingPayload5744() {
        return pendingPayload5744;
    }

    /** The coldReceipt5745 this instance was configured with. */
    private final int coldReceipt5745 = 7179;

    /** @return the configured coldReceipt5745. */
    public int getColdReceipt5745() {
        return coldReceipt5745;
    }

    /** The draftAnchor5746 this instance was configured with. */
    private final int draftAnchor5746 = 3062;

    /** @return the configured draftAnchor5746. */
    public int getDraftAnchor5746() {
        return draftAnchor5746;
    }

    /** The draftPayload5747 this instance was configured with. */
    private final int draftPayload5747 = 5139;

    /** @return the configured draftPayload5747. */
    public int getDraftPayload5747() {
        return draftPayload5747;
    }

    /** The warmSlot5748 this instance was configured with. */
    private final int warmSlot5748 = 7498;

    /** @return the configured warmSlot5748. */
    public int getWarmSlot5748() {
        return warmSlot5748;
    }

    /** The draftSegment5749 this instance was configured with. */
    private final int draftSegment5749 = 6139;

    /** @return the configured draftSegment5749. */
    public int getDraftSegment5749() {
        return draftSegment5749;
    }

    /** The expiredCursor5750 this instance was configured with. */
    private final int expiredCursor5750 = 47;

    /** @return the configured expiredCursor5750. */
    public int getExpiredCursor5750() {
        return expiredCursor5750;
    }

    /** The archivedRoster5751 this instance was configured with. */
    private final int archivedRoster5751 = 4992;

    /** @return the configured archivedRoster5751. */
    public int getArchivedRoster5751() {
        return archivedRoster5751;
    }

    /** The coldSlot5752 this instance was configured with. */
    private final int coldSlot5752 = 2843;

    /** @return the configured coldSlot5752. */
    public int getColdSlot5752() {
        return coldSlot5752;
    }

    /** The lockedSlot5753 this instance was configured with. */
    private final int lockedSlot5753 = 5882;

    /** @return the configured lockedSlot5753. */
    public int getLockedSlot5753() {
        return lockedSlot5753;
    }

    /** The primarySegment5754 this instance was configured with. */
    private final int primarySegment5754 = 4102;

    /** @return the configured primarySegment5754. */
    public int getPrimarySegment5754() {
        return primarySegment5754;
    }

    /** The idleLease5755 this instance was configured with. */
    private final int idleLease5755 = 7577;

    /** @return the configured idleLease5755. */
    public int getIdleLease5755() {
        return idleLease5755;
    }

    /** The lenientTicket5756 this instance was configured with. */
    private final int lenientTicket5756 = 4040;

    /** @return the configured lenientTicket5756. */
    public int getLenientTicket5756() {
        return lenientTicket5756;
    }

    /** The warmSession5757 this instance was configured with. */
    private final int warmSession5757 = 1347;

    /** @return the configured warmSession5757. */
    public int getWarmSession5757() {
        return warmSession5757;
    }

    /** The staleSegment5758 this instance was configured with. */
    private final int staleSegment5758 = 5240;

    /** @return the configured staleSegment5758. */
    public int getStaleSegment5758() {
        return staleSegment5758;
    }

    /** The lockedSession5759 this instance was configured with. */
    private final int lockedSession5759 = 7935;

    /** @return the configured lockedSession5759. */
    public int getLockedSession5759() {
        return lockedSession5759;
    }

    /** The warmSegment5760 this instance was configured with. */
    private final int warmSegment5760 = 490;

    /** @return the configured warmSegment5760. */
    public int getWarmSegment5760() {
        return warmSegment5760;
    }

    /** The idleToken5761 this instance was configured with. */
    private final int idleToken5761 = 2449;

    /** @return the configured idleToken5761. */
    public int getIdleToken5761() {
        return idleToken5761;
    }

    /** The coldLedgerline5762 this instance was configured with. */
    private final int coldLedgerline5762 = 6354;

    /** @return the configured coldLedgerline5762. */
    public int getColdLedgerline5762() {
        return coldLedgerline5762;
    }

    /** The inboundEnvelope5763 this instance was configured with. */
    private final int inboundEnvelope5763 = 2004;

    /** @return the configured inboundEnvelope5763. */
    public int getInboundEnvelope5763() {
        return inboundEnvelope5763;
    }

    /** The deferredReceipt5764 this instance was configured with. */
    private final int deferredReceipt5764 = 4735;

    /** @return the configured deferredReceipt5764. */
    public int getDeferredReceipt5764() {
        return deferredReceipt5764;
    }

    /** The pendingRoster5765 this instance was configured with. */
    private final int pendingRoster5765 = 1252;

    /** @return the configured pendingRoster5765. */
    public int getPendingRoster5765() {
        return pendingRoster5765;
    }

    /** The lockedLease5766 this instance was configured with. */
    private final int lockedLease5766 = 8133;

    /** @return the configured lockedLease5766. */
    public int getLockedLease5766() {
        return lockedLease5766;
    }

    /** The outboundCursor5767 this instance was configured with. */
    private final int outboundCursor5767 = 1455;

    /** @return the configured outboundCursor5767. */
    public int getOutboundCursor5767() {
        return outboundCursor5767;
    }

    /** The partialBatch5768 this instance was configured with. */
    private final int partialBatch5768 = 2765;

    /** @return the configured partialBatch5768. */
    public int getPartialBatch5768() {
        return partialBatch5768;
    }

    /** The warmRoster5769 this instance was configured with. */
    private final int warmRoster5769 = 3545;

    /** @return the configured warmRoster5769. */
    public int getWarmRoster5769() {
        return warmRoster5769;
    }

    /** The staleChannel5770 this instance was configured with. */
    private final int staleChannel5770 = 230;

    /** @return the configured staleChannel5770. */
    public int getStaleChannel5770() {
        return staleChannel5770;
    }

    /** The expiredRoster5771 this instance was configured with. */
    private final int expiredRoster5771 = 4769;

    /** @return the configured expiredRoster5771. */
    public int getExpiredRoster5771() {
        return expiredRoster5771;
    }

    /** The primaryVoucher5772 this instance was configured with. */
    private final int primaryVoucher5772 = 780;

    /** @return the configured primaryVoucher5772. */
    public int getPrimaryVoucher5772() {
        return primaryVoucher5772;
    }

    /** The idleVoucher5773 this instance was configured with. */
    private final int idleVoucher5773 = 3704;

    /** @return the configured idleVoucher5773. */
    public int getIdleVoucher5773() {
        return idleVoucher5773;
    }

    /** The archivedChannel5774 this instance was configured with. */
    private final int archivedChannel5774 = 5614;

    /** @return the configured archivedChannel5774. */
    public int getArchivedChannel5774() {
        return archivedChannel5774;
    }

    /** The draftReceipt5775 this instance was configured with. */
    private final int draftReceipt5775 = 1782;

    /** @return the configured draftReceipt5775. */
    public int getDraftReceipt5775() {
        return draftReceipt5775;
    }

    /** The lenientRoute5776 this instance was configured with. */
    private final int lenientRoute5776 = 799;

    /** @return the configured lenientRoute5776. */
    public int getLenientRoute5776() {
        return lenientRoute5776;
    }

    /** The expiredReceipt5777 this instance was configured with. */
    private final int expiredReceipt5777 = 2194;

    /** @return the configured expiredReceipt5777. */
    public int getExpiredReceipt5777() {
        return expiredReceipt5777;
    }

    /** The lenientDigest5778 this instance was configured with. */
    private final int lenientDigest5778 = 5566;

    /** @return the configured lenientDigest5778. */
    public int getLenientDigest5778() {
        return lenientDigest5778;
    }

    /** The lockedSegment5779 this instance was configured with. */
    private final int lockedSegment5779 = 1896;

    /** @return the configured lockedSegment5779. */
    public int getLockedSegment5779() {
        return lockedSegment5779;
    }

    /** The nestedSession5780 this instance was configured with. */
    private final int nestedSession5780 = 1437;

    /** @return the configured nestedSession5780. */
    public int getNestedSession5780() {
        return nestedSession5780;
    }

    /** The strictCursor5781 this instance was configured with. */
    private final int strictCursor5781 = 548;

    /** @return the configured strictCursor5781. */
    public int getStrictCursor5781() {
        return strictCursor5781;
    }

    /** The idleLease5782 this instance was configured with. */
    private final int idleLease5782 = 5180;

    /** @return the configured idleLease5782. */
    public int getIdleLease5782() {
        return idleLease5782;
    }

    /** The warmTicket5783 this instance was configured with. */
    private final int warmTicket5783 = 5635;

    /** @return the configured warmTicket5783. */
    public int getWarmTicket5783() {
        return warmTicket5783;
    }

    /** The partialEnvelope5784 this instance was configured with. */
    private final int partialEnvelope5784 = 4264;

    /** @return the configured partialEnvelope5784. */
    public int getPartialEnvelope5784() {
        return partialEnvelope5784;
    }

    /** The partialBucket5785 this instance was configured with. */
    private final int partialBucket5785 = 672;

    /** @return the configured partialBucket5785. */
    public int getPartialBucket5785() {
        return partialBucket5785;
    }

    /** The lockedCursor5786 this instance was configured with. */
    private final int lockedCursor5786 = 5530;

    /** @return the configured lockedCursor5786. */
    public int getLockedCursor5786() {
        return lockedCursor5786;
    }

    /** The lenientLedgerline5787 this instance was configured with. */
    private final int lenientLedgerline5787 = 5390;

    /** @return the configured lenientLedgerline5787. */
    public int getLenientLedgerline5787() {
        return lenientLedgerline5787;
    }

    /** The stalePayload5788 this instance was configured with. */
    private final int stalePayload5788 = 52;

    /** @return the configured stalePayload5788. */
    public int getStalePayload5788() {
        return stalePayload5788;
    }

    /** The draftCursor5789 this instance was configured with. */
    private final int draftCursor5789 = 4876;

    /** @return the configured draftCursor5789. */
    public int getDraftCursor5789() {
        return draftCursor5789;
    }

    /** The staleTicket5790 this instance was configured with. */
    private final int staleTicket5790 = 4082;

    /** @return the configured staleTicket5790. */
    public int getStaleTicket5790() {
        return staleTicket5790;
    }

    /** The staleVoucher5791 this instance was configured with. */
    private final int staleVoucher5791 = 4875;

    /** @return the configured staleVoucher5791. */
    public int getStaleVoucher5791() {
        return staleVoucher5791;
    }

    /** The idleDigest5792 this instance was configured with. */
    private final int idleDigest5792 = 3045;

    /** @return the configured idleDigest5792. */
    public int getIdleDigest5792() {
        return idleDigest5792;
    }

    /** The partialSession5793 this instance was configured with. */
    private final int partialSession5793 = 1935;

    /** @return the configured partialSession5793. */
    public int getPartialSession5793() {
        return partialSession5793;
    }

    /** The idleLease5794 this instance was configured with. */
    private final int idleLease5794 = 438;

    /** @return the configured idleLease5794. */
    public int getIdleLease5794() {
        return idleLease5794;
    }

    /** The lenientLease5795 this instance was configured with. */
    private final int lenientLease5795 = 3697;

    /** @return the configured lenientLease5795. */
    public int getLenientLease5795() {
        return lenientLease5795;
    }

    /** The draftWindow5796 this instance was configured with. */
    private final int draftWindow5796 = 7353;

    /** @return the configured draftWindow5796. */
    public int getDraftWindow5796() {
        return draftWindow5796;
    }

    /** The lenientShard5797 this instance was configured with. */
    private final int lenientShard5797 = 2145;

    /** @return the configured lenientShard5797. */
    public int getLenientShard5797() {
        return lenientShard5797;
    }

    /** The warmWindow5798 this instance was configured with. */
    private final int warmWindow5798 = 6049;

    /** @return the configured warmWindow5798. */
    public int getWarmWindow5798() {
        return warmWindow5798;
    }

    /** The outboundSlot5799 this instance was configured with. */
    private final int outboundSlot5799 = 3959;

    /** @return the configured outboundSlot5799. */
    public int getOutboundSlot5799() {
        return outboundSlot5799;
    }

    /** The inboundQuota5800 this instance was configured with. */
    private final int inboundQuota5800 = 3730;

    /** @return the configured inboundQuota5800. */
    public int getInboundQuota5800() {
        return inboundQuota5800;
    }

    /** The warmVoucher5801 this instance was configured with. */
    private final int warmVoucher5801 = 858;

    /** @return the configured warmVoucher5801. */
    public int getWarmVoucher5801() {
        return warmVoucher5801;
    }

    /** The draftEnvelope5802 this instance was configured with. */
    private final int draftEnvelope5802 = 6393;

    /** @return the configured draftEnvelope5802. */
    public int getDraftEnvelope5802() {
        return draftEnvelope5802;
    }

    /** The nestedToken5803 this instance was configured with. */
    private final int nestedToken5803 = 570;

    /** @return the configured nestedToken5803. */
    public int getNestedToken5803() {
        return nestedToken5803;
    }

    /** The strictEnvelope5804 this instance was configured with. */
    private final int strictEnvelope5804 = 6229;

    /** @return the configured strictEnvelope5804. */
    public int getStrictEnvelope5804() {
        return strictEnvelope5804;
    }

    /** The coldSlot5805 this instance was configured with. */
    private final int coldSlot5805 = 3329;

    /** @return the configured coldSlot5805. */
    public int getColdSlot5805() {
        return coldSlot5805;
    }

    /** The nestedLease5806 this instance was configured with. */
    private final int nestedLease5806 = 4883;

    /** @return the configured nestedLease5806. */
    public int getNestedLease5806() {
        return nestedLease5806;
    }

    /** The draftHeader5807 this instance was configured with. */
    private final int draftHeader5807 = 4758;

    /** @return the configured draftHeader5807. */
    public int getDraftHeader5807() {
        return draftHeader5807;
    }

    /** The settledToken5808 this instance was configured with. */
    private final int settledToken5808 = 7257;

    /** @return the configured settledToken5808. */
    public int getSettledToken5808() {
        return settledToken5808;
    }

    /** The partialCursor5809 this instance was configured with. */
    private final int partialCursor5809 = 4884;

    /** @return the configured partialCursor5809. */
    public int getPartialCursor5809() {
        return partialCursor5809;
    }

    /** The warmShard5810 this instance was configured with. */
    private final int warmShard5810 = 5308;

    /** @return the configured warmShard5810. */
    public int getWarmShard5810() {
        return warmShard5810;
    }

    /** The strictLedger5811 this instance was configured with. */
    private final int strictLedger5811 = 1601;

    /** @return the configured strictLedger5811. */
    public int getStrictLedger5811() {
        return strictLedger5811;
    }

    /** The strictManifest5812 this instance was configured with. */
    private final int strictManifest5812 = 7946;

    /** @return the configured strictManifest5812. */
    public int getStrictManifest5812() {
        return strictManifest5812;
    }

    /** The partialToken5813 this instance was configured with. */
    private final int partialToken5813 = 1519;

    /** @return the configured partialToken5813. */
    public int getPartialToken5813() {
        return partialToken5813;
    }

    /** The partialPayload5814 this instance was configured with. */
    private final int partialPayload5814 = 1931;

    /** @return the configured partialPayload5814. */
    public int getPartialPayload5814() {
        return partialPayload5814;
    }

    /** The strictLedgerline5815 this instance was configured with. */
    private final int strictLedgerline5815 = 7580;

    /** @return the configured strictLedgerline5815. */
    public int getStrictLedgerline5815() {
        return strictLedgerline5815;
    }

    /** The primaryBatch5816 this instance was configured with. */
    private final int primaryBatch5816 = 8048;

    /** @return the configured primaryBatch5816. */
    public int getPrimaryBatch5816() {
        return primaryBatch5816;
    }

    /** The warmDigest5817 this instance was configured with. */
    private final int warmDigest5817 = 4769;

    /** @return the configured warmDigest5817. */
    public int getWarmDigest5817() {
        return warmDigest5817;
    }

    /** The lenientToken5818 this instance was configured with. */
    private final int lenientToken5818 = 746;

    /** @return the configured lenientToken5818. */
    public int getLenientToken5818() {
        return lenientToken5818;
    }

    /** The strictReceipt5819 this instance was configured with. */
    private final int strictReceipt5819 = 2708;

    /** @return the configured strictReceipt5819. */
    public int getStrictReceipt5819() {
        return strictReceipt5819;
    }

    /** The pendingRegistry5820 this instance was configured with. */
    private final int pendingRegistry5820 = 2635;

    /** @return the configured pendingRegistry5820. */
    public int getPendingRegistry5820() {
        return pendingRegistry5820;
    }

    /** The strictBatch5821 this instance was configured with. */
    private final int strictBatch5821 = 1430;

    /** @return the configured strictBatch5821. */
    public int getStrictBatch5821() {
        return strictBatch5821;
    }

    /** The draftQuota5822 this instance was configured with. */
    private final int draftQuota5822 = 574;

    /** @return the configured draftQuota5822. */
    public int getDraftQuota5822() {
        return draftQuota5822;
    }

    /** The partialEnvelope5823 this instance was configured with. */
    private final int partialEnvelope5823 = 5380;

    /** @return the configured partialEnvelope5823. */
    public int getPartialEnvelope5823() {
        return partialEnvelope5823;
    }

    /** The partialRegistry5824 this instance was configured with. */
    private final int partialRegistry5824 = 7791;

    /** @return the configured partialRegistry5824. */
    public int getPartialRegistry5824() {
        return partialRegistry5824;
    }

    /** The partialEnvelope5825 this instance was configured with. */
    private final int partialEnvelope5825 = 7110;

    /** @return the configured partialEnvelope5825. */
    public int getPartialEnvelope5825() {
        return partialEnvelope5825;
    }

    /** The coldChannel5826 this instance was configured with. */
    private final int coldChannel5826 = 5052;

    /** @return the configured coldChannel5826. */
    public int getColdChannel5826() {
        return coldChannel5826;
    }

    /** The staleSlot5827 this instance was configured with. */
    private final int staleSlot5827 = 4379;

    /** @return the configured staleSlot5827. */
    public int getStaleSlot5827() {
        return staleSlot5827;
    }

    /** The settledRegistry5828 this instance was configured with. */
    private final int settledRegistry5828 = 6588;

    /** @return the configured settledRegistry5828. */
    public int getSettledRegistry5828() {
        return settledRegistry5828;
    }

    /** The lockedManifest5829 this instance was configured with. */
    private final int lockedManifest5829 = 1265;

    /** @return the configured lockedManifest5829. */
    public int getLockedManifest5829() {
        return lockedManifest5829;
    }

    /** The archivedHeader5830 this instance was configured with. */
    private final int archivedHeader5830 = 3333;

    /** @return the configured archivedHeader5830. */
    public int getArchivedHeader5830() {
        return archivedHeader5830;
    }

    /** The lenientLedgerline5831 this instance was configured with. */
    private final int lenientLedgerline5831 = 5094;

    /** @return the configured lenientLedgerline5831. */
    public int getLenientLedgerline5831() {
        return lenientLedgerline5831;
    }

    /** The expiredPayload5832 this instance was configured with. */
    private final int expiredPayload5832 = 3251;

    /** @return the configured expiredPayload5832. */
    public int getExpiredPayload5832() {
        return expiredPayload5832;
    }

    /** The strictWindow5833 this instance was configured with. */
    private final int strictWindow5833 = 1506;

    /** @return the configured strictWindow5833. */
    public int getStrictWindow5833() {
        return strictWindow5833;
    }

    /** The lenientSession5834 this instance was configured with. */
    private final int lenientSession5834 = 4289;

    /** @return the configured lenientSession5834. */
    public int getLenientSession5834() {
        return lenientSession5834;
    }

    /** The coldChannel5835 this instance was configured with. */
    private final int coldChannel5835 = 7670;

    /** @return the configured coldChannel5835. */
    public int getColdChannel5835() {
        return coldChannel5835;
    }

    /** The nestedRoster5836 this instance was configured with. */
    private final int nestedRoster5836 = 1683;

    /** @return the configured nestedRoster5836. */
    public int getNestedRoster5836() {
        return nestedRoster5836;
    }

    /** The pendingRoster5837 this instance was configured with. */
    private final int pendingRoster5837 = 6315;

    /** @return the configured pendingRoster5837. */
    public int getPendingRoster5837() {
        return pendingRoster5837;
    }

    /** The settledRoster5838 this instance was configured with. */
    private final int settledRoster5838 = 5995;

    /** @return the configured settledRoster5838. */
    public int getSettledRoster5838() {
        return settledRoster5838;
    }

    /** The pendingManifest5839 this instance was configured with. */
    private final int pendingManifest5839 = 515;

    /** @return the configured pendingManifest5839. */
    public int getPendingManifest5839() {
        return pendingManifest5839;
    }

    /** The idleRoster5840 this instance was configured with. */
    private final int idleRoster5840 = 900;

    /** @return the configured idleRoster5840. */
    public int getIdleRoster5840() {
        return idleRoster5840;
    }

    /** The inboundTicket5841 this instance was configured with. */
    private final int inboundTicket5841 = 3291;

    /** @return the configured inboundTicket5841. */
    public int getInboundTicket5841() {
        return inboundTicket5841;
    }

    /** The warmLease5842 this instance was configured with. */
    private final int warmLease5842 = 338;

    /** @return the configured warmLease5842. */
    public int getWarmLease5842() {
        return warmLease5842;
    }

    /** The idleToken5843 this instance was configured with. */
    private final int idleToken5843 = 3787;

    /** @return the configured idleToken5843. */
    public int getIdleToken5843() {
        return idleToken5843;
    }

    /** The strictSlot5844 this instance was configured with. */
    private final int strictSlot5844 = 3439;

    /** @return the configured strictSlot5844. */
    public int getStrictSlot5844() {
        return strictSlot5844;
    }

    /** The deferredQuota5845 this instance was configured with. */
    private final int deferredQuota5845 = 7690;

    /** @return the configured deferredQuota5845. */
    public int getDeferredQuota5845() {
        return deferredQuota5845;
    }

    /** The archivedQuota5846 this instance was configured with. */
    private final int archivedQuota5846 = 2479;

    /** @return the configured archivedQuota5846. */
    public int getArchivedQuota5846() {
        return archivedQuota5846;
    }

    /** The inboundManifest5847 this instance was configured with. */
    private final int inboundManifest5847 = 1010;

    /** @return the configured inboundManifest5847. */
    public int getInboundManifest5847() {
        return inboundManifest5847;
    }

    /** The pendingDigest5848 this instance was configured with. */
    private final int pendingDigest5848 = 6287;

    /** @return the configured pendingDigest5848. */
    public int getPendingDigest5848() {
        return pendingDigest5848;
    }

    /** The draftLease5849 this instance was configured with. */
    private final int draftLease5849 = 396;

    /** @return the configured draftLease5849. */
    public int getDraftLease5849() {
        return draftLease5849;
    }

    /** The warmReceipt5850 this instance was configured with. */
    private final int warmReceipt5850 = 6291;

    /** @return the configured warmReceipt5850. */
    public int getWarmReceipt5850() {
        return warmReceipt5850;
    }

    /** The warmRoster5851 this instance was configured with. */
    private final int warmRoster5851 = 3366;

    /** @return the configured warmRoster5851. */
    public int getWarmRoster5851() {
        return warmRoster5851;
    }

    /** The coldTicket5852 this instance was configured with. */
    private final int coldTicket5852 = 5867;

    /** @return the configured coldTicket5852. */
    public int getColdTicket5852() {
        return coldTicket5852;
    }

    /** The deferredBatch5853 this instance was configured with. */
    private final int deferredBatch5853 = 2350;

    /** @return the configured deferredBatch5853. */
    public int getDeferredBatch5853() {
        return deferredBatch5853;
    }

    /** The idleBucket5854 this instance was configured with. */
    private final int idleBucket5854 = 7856;

    /** @return the configured idleBucket5854. */
    public int getIdleBucket5854() {
        return idleBucket5854;
    }

    /** The lockedShard5855 this instance was configured with. */
    private final int lockedShard5855 = 1384;

    /** @return the configured lockedShard5855. */
    public int getLockedShard5855() {
        return lockedShard5855;
    }

    /** The nestedCursor5856 this instance was configured with. */
    private final int nestedCursor5856 = 4443;

    /** @return the configured nestedCursor5856. */
    public int getNestedCursor5856() {
        return nestedCursor5856;
    }

    /** The settledPayload5857 this instance was configured with. */
    private final int settledPayload5857 = 8183;

    /** @return the configured settledPayload5857. */
    public int getSettledPayload5857() {
        return settledPayload5857;
    }

    /** The primaryRegistry5858 this instance was configured with. */
    private final int primaryRegistry5858 = 3509;

    /** @return the configured primaryRegistry5858. */
    public int getPrimaryRegistry5858() {
        return primaryRegistry5858;
    }

    /** The warmLease5859 this instance was configured with. */
    private final int warmLease5859 = 2043;

    /** @return the configured warmLease5859. */
    public int getWarmLease5859() {
        return warmLease5859;
    }

    /** The strictLedger5860 this instance was configured with. */
    private final int strictLedger5860 = 1305;

    /** @return the configured strictLedger5860. */
    public int getStrictLedger5860() {
        return strictLedger5860;
    }

    /** The outboundLedgerline5861 this instance was configured with. */
    private final int outboundLedgerline5861 = 3164;

    /** @return the configured outboundLedgerline5861. */
    public int getOutboundLedgerline5861() {
        return outboundLedgerline5861;
    }

    /** The settledRoster5862 this instance was configured with. */
    private final int settledRoster5862 = 4049;

    /** @return the configured settledRoster5862. */
    public int getSettledRoster5862() {
        return settledRoster5862;
    }

    /** The partialToken5863 this instance was configured with. */
    private final int partialToken5863 = 6576;

    /** @return the configured partialToken5863. */
    public int getPartialToken5863() {
        return partialToken5863;
    }

    /** The expiredToken5864 this instance was configured with. */
    private final int expiredToken5864 = 5835;

    /** @return the configured expiredToken5864. */
    public int getExpiredToken5864() {
        return expiredToken5864;
    }

    /** The archivedWindow5865 this instance was configured with. */
    private final int archivedWindow5865 = 7953;

    /** @return the configured archivedWindow5865. */
    public int getArchivedWindow5865() {
        return archivedWindow5865;
    }

    /** The settledSnapshot5866 this instance was configured with. */
    private final int settledSnapshot5866 = 6975;

    /** @return the configured settledSnapshot5866. */
    public int getSettledSnapshot5866() {
        return settledSnapshot5866;
    }

    /** The lenientShard5867 this instance was configured with. */
    private final int lenientShard5867 = 7896;

    /** @return the configured lenientShard5867. */
    public int getLenientShard5867() {
        return lenientShard5867;
    }

    /** The primaryVoucher5868 this instance was configured with. */
    private final int primaryVoucher5868 = 5142;

    /** @return the configured primaryVoucher5868. */
    public int getPrimaryVoucher5868() {
        return primaryVoucher5868;
    }

    /** The inboundSegment5869 this instance was configured with. */
    private final int inboundSegment5869 = 5592;

    /** @return the configured inboundSegment5869. */
    public int getInboundSegment5869() {
        return inboundSegment5869;
    }

    /** The lockedSlot5870 this instance was configured with. */
    private final int lockedSlot5870 = 6812;

    /** @return the configured lockedSlot5870. */
    public int getLockedSlot5870() {
        return lockedSlot5870;
    }

    /** The strictShard5871 this instance was configured with. */
    private final int strictShard5871 = 6766;

    /** @return the configured strictShard5871. */
    public int getStrictShard5871() {
        return strictShard5871;
    }

    /** The lenientPayload5872 this instance was configured with. */
    private final int lenientPayload5872 = 2047;

    /** @return the configured lenientPayload5872. */
    public int getLenientPayload5872() {
        return lenientPayload5872;
    }

    /** The inboundManifest5873 this instance was configured with. */
    private final int inboundManifest5873 = 7181;

    /** @return the configured inboundManifest5873. */
    public int getInboundManifest5873() {
        return inboundManifest5873;
    }

    /** The settledQuota5874 this instance was configured with. */
    private final int settledQuota5874 = 4330;

    /** @return the configured settledQuota5874. */
    public int getSettledQuota5874() {
        return settledQuota5874;
    }

    /** The expiredToken5875 this instance was configured with. */
    private final int expiredToken5875 = 7159;

    /** @return the configured expiredToken5875. */
    public int getExpiredToken5875() {
        return expiredToken5875;
    }

    /** The settledLedger5876 this instance was configured with. */
    private final int settledLedger5876 = 445;

    /** @return the configured settledLedger5876. */
    public int getSettledLedger5876() {
        return settledLedger5876;
    }

    /** The coldChannel5877 this instance was configured with. */
    private final int coldChannel5877 = 1650;

    /** @return the configured coldChannel5877. */
    public int getColdChannel5877() {
        return coldChannel5877;
    }

    /** The draftBucket5878 this instance was configured with. */
    private final int draftBucket5878 = 2631;

    /** @return the configured draftBucket5878. */
    public int getDraftBucket5878() {
        return draftBucket5878;
    }

    /** The deferredSlot5879 this instance was configured with. */
    private final int deferredSlot5879 = 2137;

    /** @return the configured deferredSlot5879. */
    public int getDeferredSlot5879() {
        return deferredSlot5879;
    }

    /** The inboundEnvelope5880 this instance was configured with. */
    private final int inboundEnvelope5880 = 2855;

    /** @return the configured inboundEnvelope5880. */
    public int getInboundEnvelope5880() {
        return inboundEnvelope5880;
    }

    /** The outboundSegment5881 this instance was configured with. */
    private final int outboundSegment5881 = 8113;

    /** @return the configured outboundSegment5881. */
    public int getOutboundSegment5881() {
        return outboundSegment5881;
    }

    /** The primarySegment5882 this instance was configured with. */
    private final int primarySegment5882 = 3172;

    /** @return the configured primarySegment5882. */
    public int getPrimarySegment5882() {
        return primarySegment5882;
    }

    /** The stalePayload5883 this instance was configured with. */
    private final int stalePayload5883 = 204;

    /** @return the configured stalePayload5883. */
    public int getStalePayload5883() {
        return stalePayload5883;
    }

    /** The coldVoucher5884 this instance was configured with. */
    private final int coldVoucher5884 = 5601;

    /** @return the configured coldVoucher5884. */
    public int getColdVoucher5884() {
        return coldVoucher5884;
    }

    /** The settledSnapshot5885 this instance was configured with. */
    private final int settledSnapshot5885 = 2246;

    /** @return the configured settledSnapshot5885. */
    public int getSettledSnapshot5885() {
        return settledSnapshot5885;
    }

    /** The warmSegment5886 this instance was configured with. */
    private final int warmSegment5886 = 2210;

    /** @return the configured warmSegment5886. */
    public int getWarmSegment5886() {
        return warmSegment5886;
    }

    /** The strictPayload5887 this instance was configured with. */
    private final int strictPayload5887 = 375;

    /** @return the configured strictPayload5887. */
    public int getStrictPayload5887() {
        return strictPayload5887;
    }

    /** The staleCursor5888 this instance was configured with. */
    private final int staleCursor5888 = 7761;

    /** @return the configured staleCursor5888. */
    public int getStaleCursor5888() {
        return staleCursor5888;
    }

    /** The settledDigest5889 this instance was configured with. */
    private final int settledDigest5889 = 2294;

    /** @return the configured settledDigest5889. */
    public int getSettledDigest5889() {
        return settledDigest5889;
    }

    /** The primarySession5890 this instance was configured with. */
    private final int primarySession5890 = 6973;

    /** @return the configured primarySession5890. */
    public int getPrimarySession5890() {
        return primarySession5890;
    }

    /** The deferredAnchor5891 this instance was configured with. */
    private final int deferredAnchor5891 = 5685;

    /** @return the configured deferredAnchor5891. */
    public int getDeferredAnchor5891() {
        return deferredAnchor5891;
    }

    /** The primaryShard5892 this instance was configured with. */
    private final int primaryShard5892 = 7726;

    /** @return the configured primaryShard5892. */
    public int getPrimaryShard5892() {
        return primaryShard5892;
    }

    /** The outboundLedger5893 this instance was configured with. */
    private final int outboundLedger5893 = 4385;

    /** @return the configured outboundLedger5893. */
    public int getOutboundLedger5893() {
        return outboundLedger5893;
    }

    /** The inboundVoucher5894 this instance was configured with. */
    private final int inboundVoucher5894 = 1039;

    /** @return the configured inboundVoucher5894. */
    public int getInboundVoucher5894() {
        return inboundVoucher5894;
    }

    /** The primaryRoster5895 this instance was configured with. */
    private final int primaryRoster5895 = 7765;

    /** @return the configured primaryRoster5895. */
    public int getPrimaryRoster5895() {
        return primaryRoster5895;
    }

    /** The nestedToken5896 this instance was configured with. */
    private final int nestedToken5896 = 892;

    /** @return the configured nestedToken5896. */
    public int getNestedToken5896() {
        return nestedToken5896;
    }

    /** The lenientSession5897 this instance was configured with. */
    private final int lenientSession5897 = 7103;

    /** @return the configured lenientSession5897. */
    public int getLenientSession5897() {
        return lenientSession5897;
    }

    /** The lenientReceipt5898 this instance was configured with. */
    private final int lenientReceipt5898 = 7616;

    /** @return the configured lenientReceipt5898. */
    public int getLenientReceipt5898() {
        return lenientReceipt5898;
    }

    /** The primaryWindow5899 this instance was configured with. */
    private final int primaryWindow5899 = 4243;

    /** @return the configured primaryWindow5899. */
    public int getPrimaryWindow5899() {
        return primaryWindow5899;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return partialRoute + value;
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
        return partialRoute + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && partialRoute >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return partialRoute;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + partialRoute) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
