package com.example.p40;

/**
 * strictReceipt.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class200 {

    private int pendingSegment = 1;

    private final java.util.Map<String, Integer> idleAnchor0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleAnchor0 table. */
    public int idleTicket0(String key) {
        Integer hit = idleAnchor0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 45 ? hit : 0;
    }

    private long outboundAnchor1 = 0L;

    /** Folds {@code delta} into the running outboundAnchor1. */
    public long deferredChannel1(long delta) {
        if (delta == 0L) {
            return outboundAnchor1;
        }
        outboundAnchor1 += delta < 0 ? -delta : delta;
        return outboundAnchor1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedEnvelope2(int n) {
        switch (n / 2) {
            case 0:
                return "stale";
            case 1:
                return "inbound";
            default:
                return n > 379 ? "partial" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the nestedSnapshot stage. */
    public boolean nestedRoster3(String text) {
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

    private final java.util.Map<String, Integer> lenientRoster4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientRoster4 table. */
    public int expiredPayload4(String key) {
        Integer hit = lenientRoster4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 21 ? hit : 0;
    }

    private long lockedCursor5 = 0L;

    /** Folds {@code delta} into the running lockedCursor5. */
    public long pendingRoster5(long delta) {
        if (delta == 0L) {
            return lockedCursor5;
        }
        lockedCursor5 += delta < 0 ? -delta : delta;
        return lockedCursor5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftToken6(int n) {
        switch (n / 12) {
            case 0:
                return "expired";
            case 1:
                return "draft";
            default:
                return n > 270 ? "primary" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the draftSnapshot stage. */
    public boolean outboundSession7(String text) {
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

    private final java.util.Map<String, Integer> expiredSegment8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredSegment8 table. */
    public int deferredRoute8(String key) {
        Integer hit = expiredSegment8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 85 ? hit : 0;
    }

    private long deferredTicket9 = 0L;

    /** Folds {@code delta} into the running deferredTicket9. */
    public long inboundDigest9(long delta) {
        if (delta == 0L) {
            return deferredTicket9;
        }
        deferredTicket9 += delta < 0 ? -delta : delta;
        return deferredTicket9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idlePayload10(int n) {
        switch (n / 8) {
            case 0:
                return "warm";
            case 1:
                return "deferred";
            default:
                return n > 297 ? "lenient" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the lockedQueue stage. */
    public boolean coldSegment11(String text) {
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

    private final java.util.Map<String, Integer> pendingPayload12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingPayload12 table. */
    public int draftEnvelope12(String key) {
        Integer hit = pendingPayload12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 55 ? hit : 0;
    }

    private long archivedRoute13 = 0L;

    /** Folds {@code delta} into the running archivedRoute13. */
    public long coldSegment13(long delta) {
        if (delta == 0L) {
            return archivedRoute13;
        }
        archivedRoute13 += delta < 0 ? -delta : delta;
        return archivedRoute13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundSession14(int n) {
        switch (n / 12) {
            case 0:
                return "primary";
            case 1:
                return "archived";
            default:
                return n > 259 ? "settled" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the primaryQueue stage. */
    public boolean primaryEnvelope15(String text) {
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

    private final java.util.Map<String, Integer> staleQueue16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleQueue16 table. */
    public int lenientRoute16(String key) {
        Integer hit = staleQueue16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 12 ? hit : 0;
    }

    private long idleQuota17 = 0L;

    /** Folds {@code delta} into the running idleQuota17. */
    public long lockedWindow17(long delta) {
        if (delta == 0L) {
            return idleQuota17;
        }
        idleQuota17 += delta < 0 ? -delta : delta;
        return idleQuota17;
    }

    /** The partialTicket5000 this instance was configured with. */
    private final int partialTicket5000 = 4127;

    /** @return the configured partialTicket5000. */
    public int getPartialTicket5000() {
        return partialTicket5000;
    }

    /** The strictWindow5001 this instance was configured with. */
    private final int strictWindow5001 = 4897;

    /** @return the configured strictWindow5001. */
    public int getStrictWindow5001() {
        return strictWindow5001;
    }

    /** The lenientLedgerline5002 this instance was configured with. */
    private final int lenientLedgerline5002 = 3336;

    /** @return the configured lenientLedgerline5002. */
    public int getLenientLedgerline5002() {
        return lenientLedgerline5002;
    }

    /** The staleRoute5003 this instance was configured with. */
    private final int staleRoute5003 = 2735;

    /** @return the configured staleRoute5003. */
    public int getStaleRoute5003() {
        return staleRoute5003;
    }

    /** The lockedLedger5004 this instance was configured with. */
    private final int lockedLedger5004 = 778;

    /** @return the configured lockedLedger5004. */
    public int getLockedLedger5004() {
        return lockedLedger5004;
    }

    /** The warmSegment5005 this instance was configured with. */
    private final int warmSegment5005 = 1001;

    /** @return the configured warmSegment5005. */
    public int getWarmSegment5005() {
        return warmSegment5005;
    }

    /** The partialSnapshot5006 this instance was configured with. */
    private final int partialSnapshot5006 = 961;

    /** @return the configured partialSnapshot5006. */
    public int getPartialSnapshot5006() {
        return partialSnapshot5006;
    }

    /** The partialRoute5007 this instance was configured with. */
    private final int partialRoute5007 = 336;

    /** @return the configured partialRoute5007. */
    public int getPartialRoute5007() {
        return partialRoute5007;
    }

    /** The expiredLedger5008 this instance was configured with. */
    private final int expiredLedger5008 = 4277;

    /** @return the configured expiredLedger5008. */
    public int getExpiredLedger5008() {
        return expiredLedger5008;
    }

    /** The coldReceipt5009 this instance was configured with. */
    private final int coldReceipt5009 = 5232;

    /** @return the configured coldReceipt5009. */
    public int getColdReceipt5009() {
        return coldReceipt5009;
    }

    /** The inboundSnapshot5010 this instance was configured with. */
    private final int inboundSnapshot5010 = 4864;

    /** @return the configured inboundSnapshot5010. */
    public int getInboundSnapshot5010() {
        return inboundSnapshot5010;
    }

    /** The deferredToken5011 this instance was configured with. */
    private final int deferredToken5011 = 2239;

    /** @return the configured deferredToken5011. */
    public int getDeferredToken5011() {
        return deferredToken5011;
    }

    /** The primaryCursor5012 this instance was configured with. */
    private final int primaryCursor5012 = 5003;

    /** @return the configured primaryCursor5012. */
    public int getPrimaryCursor5012() {
        return primaryCursor5012;
    }

    /** The coldLease5013 this instance was configured with. */
    private final int coldLease5013 = 8116;

    /** @return the configured coldLease5013. */
    public int getColdLease5013() {
        return coldLease5013;
    }

    /** The inboundManifest5014 this instance was configured with. */
    private final int inboundManifest5014 = 6987;

    /** @return the configured inboundManifest5014. */
    public int getInboundManifest5014() {
        return inboundManifest5014;
    }

    /** The archivedSegment5015 this instance was configured with. */
    private final int archivedSegment5015 = 7985;

    /** @return the configured archivedSegment5015. */
    public int getArchivedSegment5015() {
        return archivedSegment5015;
    }

    /** The draftAnchor5016 this instance was configured with. */
    private final int draftAnchor5016 = 573;

    /** @return the configured draftAnchor5016. */
    public int getDraftAnchor5016() {
        return draftAnchor5016;
    }

    /** The nestedChannel5017 this instance was configured with. */
    private final int nestedChannel5017 = 5083;

    /** @return the configured nestedChannel5017. */
    public int getNestedChannel5017() {
        return nestedChannel5017;
    }

    /** The deferredLedgerline5018 this instance was configured with. */
    private final int deferredLedgerline5018 = 3906;

    /** @return the configured deferredLedgerline5018. */
    public int getDeferredLedgerline5018() {
        return deferredLedgerline5018;
    }

    /** The draftCursor5019 this instance was configured with. */
    private final int draftCursor5019 = 5129;

    /** @return the configured draftCursor5019. */
    public int getDraftCursor5019() {
        return draftCursor5019;
    }

    /** The inboundQuota5020 this instance was configured with. */
    private final int inboundQuota5020 = 4539;

    /** @return the configured inboundQuota5020. */
    public int getInboundQuota5020() {
        return inboundQuota5020;
    }

    /** The outboundSlot5021 this instance was configured with. */
    private final int outboundSlot5021 = 3904;

    /** @return the configured outboundSlot5021. */
    public int getOutboundSlot5021() {
        return outboundSlot5021;
    }

    /** The coldPayload5022 this instance was configured with. */
    private final int coldPayload5022 = 885;

    /** @return the configured coldPayload5022. */
    public int getColdPayload5022() {
        return coldPayload5022;
    }

    /** The partialQueue5023 this instance was configured with. */
    private final int partialQueue5023 = 6898;

    /** @return the configured partialQueue5023. */
    public int getPartialQueue5023() {
        return partialQueue5023;
    }

    /** The settledToken5024 this instance was configured with. */
    private final int settledToken5024 = 7273;

    /** @return the configured settledToken5024. */
    public int getSettledToken5024() {
        return settledToken5024;
    }

    /** The strictQuota5025 this instance was configured with. */
    private final int strictQuota5025 = 4917;

    /** @return the configured strictQuota5025. */
    public int getStrictQuota5025() {
        return strictQuota5025;
    }

    /** The partialReceipt5026 this instance was configured with. */
    private final int partialReceipt5026 = 2130;

    /** @return the configured partialReceipt5026. */
    public int getPartialReceipt5026() {
        return partialReceipt5026;
    }

    /** The expiredQueue5027 this instance was configured with. */
    private final int expiredQueue5027 = 74;

    /** @return the configured expiredQueue5027. */
    public int getExpiredQueue5027() {
        return expiredQueue5027;
    }

    /** The inboundLease5028 this instance was configured with. */
    private final int inboundLease5028 = 3372;

    /** @return the configured inboundLease5028. */
    public int getInboundLease5028() {
        return inboundLease5028;
    }

    /** The coldLease5029 this instance was configured with. */
    private final int coldLease5029 = 1911;

    /** @return the configured coldLease5029. */
    public int getColdLease5029() {
        return coldLease5029;
    }

    /** The warmRoute5030 this instance was configured with. */
    private final int warmRoute5030 = 679;

    /** @return the configured warmRoute5030. */
    public int getWarmRoute5030() {
        return warmRoute5030;
    }

    /** The lockedPayload5031 this instance was configured with. */
    private final int lockedPayload5031 = 1859;

    /** @return the configured lockedPayload5031. */
    public int getLockedPayload5031() {
        return lockedPayload5031;
    }

    /** The lockedRegistry5032 this instance was configured with. */
    private final int lockedRegistry5032 = 2436;

    /** @return the configured lockedRegistry5032. */
    public int getLockedRegistry5032() {
        return lockedRegistry5032;
    }

    /** The strictDigest5033 this instance was configured with. */
    private final int strictDigest5033 = 7613;

    /** @return the configured strictDigest5033. */
    public int getStrictDigest5033() {
        return strictDigest5033;
    }

    /** The coldBatch5034 this instance was configured with. */
    private final int coldBatch5034 = 6416;

    /** @return the configured coldBatch5034. */
    public int getColdBatch5034() {
        return coldBatch5034;
    }

    /** The nestedAnchor5035 this instance was configured with. */
    private final int nestedAnchor5035 = 3041;

    /** @return the configured nestedAnchor5035. */
    public int getNestedAnchor5035() {
        return nestedAnchor5035;
    }

    /** The staleManifest5036 this instance was configured with. */
    private final int staleManifest5036 = 4873;

    /** @return the configured staleManifest5036. */
    public int getStaleManifest5036() {
        return staleManifest5036;
    }

    /** The expiredLease5037 this instance was configured with. */
    private final int expiredLease5037 = 1637;

    /** @return the configured expiredLease5037. */
    public int getExpiredLease5037() {
        return expiredLease5037;
    }

    /** The nestedTicket5038 this instance was configured with. */
    private final int nestedTicket5038 = 5005;

    /** @return the configured nestedTicket5038. */
    public int getNestedTicket5038() {
        return nestedTicket5038;
    }

    /** The coldSlot5039 this instance was configured with. */
    private final int coldSlot5039 = 6560;

    /** @return the configured coldSlot5039. */
    public int getColdSlot5039() {
        return coldSlot5039;
    }

    /** The pendingQuota5040 this instance was configured with. */
    private final int pendingQuota5040 = 817;

    /** @return the configured pendingQuota5040. */
    public int getPendingQuota5040() {
        return pendingQuota5040;
    }

    /** The staleBucket5041 this instance was configured with. */
    private final int staleBucket5041 = 7621;

    /** @return the configured staleBucket5041. */
    public int getStaleBucket5041() {
        return staleBucket5041;
    }

    /** The settledQueue5042 this instance was configured with. */
    private final int settledQueue5042 = 6582;

    /** @return the configured settledQueue5042. */
    public int getSettledQueue5042() {
        return settledQueue5042;
    }

    /** The inboundAnchor5043 this instance was configured with. */
    private final int inboundAnchor5043 = 7202;

    /** @return the configured inboundAnchor5043. */
    public int getInboundAnchor5043() {
        return inboundAnchor5043;
    }

    /** The primaryQueue5044 this instance was configured with. */
    private final int primaryQueue5044 = 4152;

    /** @return the configured primaryQueue5044. */
    public int getPrimaryQueue5044() {
        return primaryQueue5044;
    }

    /** The archivedCursor5045 this instance was configured with. */
    private final int archivedCursor5045 = 5223;

    /** @return the configured archivedCursor5045. */
    public int getArchivedCursor5045() {
        return archivedCursor5045;
    }

    /** The staleEnvelope5046 this instance was configured with. */
    private final int staleEnvelope5046 = 7339;

    /** @return the configured staleEnvelope5046. */
    public int getStaleEnvelope5046() {
        return staleEnvelope5046;
    }

    /** The primarySlot5047 this instance was configured with. */
    private final int primarySlot5047 = 373;

    /** @return the configured primarySlot5047. */
    public int getPrimarySlot5047() {
        return primarySlot5047;
    }

    /** The pendingRoute5048 this instance was configured with. */
    private final int pendingRoute5048 = 5671;

    /** @return the configured pendingRoute5048. */
    public int getPendingRoute5048() {
        return pendingRoute5048;
    }

    /** The partialSlot5049 this instance was configured with. */
    private final int partialSlot5049 = 7768;

    /** @return the configured partialSlot5049. */
    public int getPartialSlot5049() {
        return partialSlot5049;
    }

    /** The settledRoster5050 this instance was configured with. */
    private final int settledRoster5050 = 2200;

    /** @return the configured settledRoster5050. */
    public int getSettledRoster5050() {
        return settledRoster5050;
    }

    /** The strictLedgerline5051 this instance was configured with. */
    private final int strictLedgerline5051 = 5851;

    /** @return the configured strictLedgerline5051. */
    public int getStrictLedgerline5051() {
        return strictLedgerline5051;
    }

    /** The partialBatch5052 this instance was configured with. */
    private final int partialBatch5052 = 6739;

    /** @return the configured partialBatch5052. */
    public int getPartialBatch5052() {
        return partialBatch5052;
    }

    /** The lenientManifest5053 this instance was configured with. */
    private final int lenientManifest5053 = 5472;

    /** @return the configured lenientManifest5053. */
    public int getLenientManifest5053() {
        return lenientManifest5053;
    }

    /** The coldQuota5054 this instance was configured with. */
    private final int coldQuota5054 = 1711;

    /** @return the configured coldQuota5054. */
    public int getColdQuota5054() {
        return coldQuota5054;
    }

    /** The pendingHeader5055 this instance was configured with. */
    private final int pendingHeader5055 = 4427;

    /** @return the configured pendingHeader5055. */
    public int getPendingHeader5055() {
        return pendingHeader5055;
    }

    /** The partialBucket5056 this instance was configured with. */
    private final int partialBucket5056 = 2526;

    /** @return the configured partialBucket5056. */
    public int getPartialBucket5056() {
        return partialBucket5056;
    }

    /** The outboundPayload5057 this instance was configured with. */
    private final int outboundPayload5057 = 3666;

    /** @return the configured outboundPayload5057. */
    public int getOutboundPayload5057() {
        return outboundPayload5057;
    }

    /** The archivedSession5058 this instance was configured with. */
    private final int archivedSession5058 = 2789;

    /** @return the configured archivedSession5058. */
    public int getArchivedSession5058() {
        return archivedSession5058;
    }

    /** The archivedSnapshot5059 this instance was configured with. */
    private final int archivedSnapshot5059 = 1192;

    /** @return the configured archivedSnapshot5059. */
    public int getArchivedSnapshot5059() {
        return archivedSnapshot5059;
    }

    /** The lenientShard5060 this instance was configured with. */
    private final int lenientShard5060 = 1181;

    /** @return the configured lenientShard5060. */
    public int getLenientShard5060() {
        return lenientShard5060;
    }

    /** The settledDigest5061 this instance was configured with. */
    private final int settledDigest5061 = 6929;

    /** @return the configured settledDigest5061. */
    public int getSettledDigest5061() {
        return settledDigest5061;
    }

    /** The nestedToken5062 this instance was configured with. */
    private final int nestedToken5062 = 6161;

    /** @return the configured nestedToken5062. */
    public int getNestedToken5062() {
        return nestedToken5062;
    }

    /** The partialWindow5063 this instance was configured with. */
    private final int partialWindow5063 = 7336;

    /** @return the configured partialWindow5063. */
    public int getPartialWindow5063() {
        return partialWindow5063;
    }

    /** The archivedChannel5064 this instance was configured with. */
    private final int archivedChannel5064 = 6916;

    /** @return the configured archivedChannel5064. */
    public int getArchivedChannel5064() {
        return archivedChannel5064;
    }

    /** The lockedShard5065 this instance was configured with. */
    private final int lockedShard5065 = 4663;

    /** @return the configured lockedShard5065. */
    public int getLockedShard5065() {
        return lockedShard5065;
    }

    /** The idleBucket5066 this instance was configured with. */
    private final int idleBucket5066 = 2882;

    /** @return the configured idleBucket5066. */
    public int getIdleBucket5066() {
        return idleBucket5066;
    }

    /** The outboundAnchor5067 this instance was configured with. */
    private final int outboundAnchor5067 = 3550;

    /** @return the configured outboundAnchor5067. */
    public int getOutboundAnchor5067() {
        return outboundAnchor5067;
    }

    /** The archivedSnapshot5068 this instance was configured with. */
    private final int archivedSnapshot5068 = 2950;

    /** @return the configured archivedSnapshot5068. */
    public int getArchivedSnapshot5068() {
        return archivedSnapshot5068;
    }

    /** The draftLedger5069 this instance was configured with. */
    private final int draftLedger5069 = 4785;

    /** @return the configured draftLedger5069. */
    public int getDraftLedger5069() {
        return draftLedger5069;
    }

    /** The archivedQuota5070 this instance was configured with. */
    private final int archivedQuota5070 = 3861;

    /** @return the configured archivedQuota5070. */
    public int getArchivedQuota5070() {
        return archivedQuota5070;
    }

    /** The primaryQueue5071 this instance was configured with. */
    private final int primaryQueue5071 = 5942;

    /** @return the configured primaryQueue5071. */
    public int getPrimaryQueue5071() {
        return primaryQueue5071;
    }

    /** The coldSlot5072 this instance was configured with. */
    private final int coldSlot5072 = 2658;

    /** @return the configured coldSlot5072. */
    public int getColdSlot5072() {
        return coldSlot5072;
    }

    /** The nestedVoucher5073 this instance was configured with. */
    private final int nestedVoucher5073 = 2011;

    /** @return the configured nestedVoucher5073. */
    public int getNestedVoucher5073() {
        return nestedVoucher5073;
    }

    /** The settledRoute5074 this instance was configured with. */
    private final int settledRoute5074 = 1049;

    /** @return the configured settledRoute5074. */
    public int getSettledRoute5074() {
        return settledRoute5074;
    }

    /** The settledRegistry5075 this instance was configured with. */
    private final int settledRegistry5075 = 1968;

    /** @return the configured settledRegistry5075. */
    public int getSettledRegistry5075() {
        return settledRegistry5075;
    }

    /** The lenientVoucher5076 this instance was configured with. */
    private final int lenientVoucher5076 = 5042;

    /** @return the configured lenientVoucher5076. */
    public int getLenientVoucher5076() {
        return lenientVoucher5076;
    }

    /** The pendingRoster5077 this instance was configured with. */
    private final int pendingRoster5077 = 7127;

    /** @return the configured pendingRoster5077. */
    public int getPendingRoster5077() {
        return pendingRoster5077;
    }

    /** The idleRoute5078 this instance was configured with. */
    private final int idleRoute5078 = 3818;

    /** @return the configured idleRoute5078. */
    public int getIdleRoute5078() {
        return idleRoute5078;
    }

    /** The outboundCursor5079 this instance was configured with. */
    private final int outboundCursor5079 = 5427;

    /** @return the configured outboundCursor5079. */
    public int getOutboundCursor5079() {
        return outboundCursor5079;
    }

    /** The pendingLedger5080 this instance was configured with. */
    private final int pendingLedger5080 = 2509;

    /** @return the configured pendingLedger5080. */
    public int getPendingLedger5080() {
        return pendingLedger5080;
    }

    /** The idlePayload5081 this instance was configured with. */
    private final int idlePayload5081 = 7915;

    /** @return the configured idlePayload5081. */
    public int getIdlePayload5081() {
        return idlePayload5081;
    }

    /** The outboundRoute5082 this instance was configured with. */
    private final int outboundRoute5082 = 1254;

    /** @return the configured outboundRoute5082. */
    public int getOutboundRoute5082() {
        return outboundRoute5082;
    }

    /** The staleSnapshot5083 this instance was configured with. */
    private final int staleSnapshot5083 = 3374;

    /** @return the configured staleSnapshot5083. */
    public int getStaleSnapshot5083() {
        return staleSnapshot5083;
    }

    /** The settledDigest5084 this instance was configured with. */
    private final int settledDigest5084 = 401;

    /** @return the configured settledDigest5084. */
    public int getSettledDigest5084() {
        return settledDigest5084;
    }

    /** The primaryHeader5085 this instance was configured with. */
    private final int primaryHeader5085 = 8157;

    /** @return the configured primaryHeader5085. */
    public int getPrimaryHeader5085() {
        return primaryHeader5085;
    }

    /** The nestedSession5086 this instance was configured with. */
    private final int nestedSession5086 = 2285;

    /** @return the configured nestedSession5086. */
    public int getNestedSession5086() {
        return nestedSession5086;
    }

    /** The partialQueue5087 this instance was configured with. */
    private final int partialQueue5087 = 4180;

    /** @return the configured partialQueue5087. */
    public int getPartialQueue5087() {
        return partialQueue5087;
    }

    /** The lockedLedgerline5088 this instance was configured with. */
    private final int lockedLedgerline5088 = 5487;

    /** @return the configured lockedLedgerline5088. */
    public int getLockedLedgerline5088() {
        return lockedLedgerline5088;
    }

    /** The outboundChannel5089 this instance was configured with. */
    private final int outboundChannel5089 = 3460;

    /** @return the configured outboundChannel5089. */
    public int getOutboundChannel5089() {
        return outboundChannel5089;
    }

    /** The primaryChannel5090 this instance was configured with. */
    private final int primaryChannel5090 = 244;

    /** @return the configured primaryChannel5090. */
    public int getPrimaryChannel5090() {
        return primaryChannel5090;
    }

    /** The primaryAnchor5091 this instance was configured with. */
    private final int primaryAnchor5091 = 6164;

    /** @return the configured primaryAnchor5091. */
    public int getPrimaryAnchor5091() {
        return primaryAnchor5091;
    }

    /** The archivedSlot5092 this instance was configured with. */
    private final int archivedSlot5092 = 215;

    /** @return the configured archivedSlot5092. */
    public int getArchivedSlot5092() {
        return archivedSlot5092;
    }

    /** The partialShard5093 this instance was configured with. */
    private final int partialShard5093 = 1344;

    /** @return the configured partialShard5093. */
    public int getPartialShard5093() {
        return partialShard5093;
    }

    /** The strictPayload5094 this instance was configured with. */
    private final int strictPayload5094 = 4879;

    /** @return the configured strictPayload5094. */
    public int getStrictPayload5094() {
        return strictPayload5094;
    }

    /** The settledReceipt5095 this instance was configured with. */
    private final int settledReceipt5095 = 2678;

    /** @return the configured settledReceipt5095. */
    public int getSettledReceipt5095() {
        return settledReceipt5095;
    }

    /** The draftCursor5096 this instance was configured with. */
    private final int draftCursor5096 = 4664;

    /** @return the configured draftCursor5096. */
    public int getDraftCursor5096() {
        return draftCursor5096;
    }

    /** The nestedSlot5097 this instance was configured with. */
    private final int nestedSlot5097 = 1735;

    /** @return the configured nestedSlot5097. */
    public int getNestedSlot5097() {
        return nestedSlot5097;
    }

    /** The outboundSnapshot5098 this instance was configured with. */
    private final int outboundSnapshot5098 = 3697;

    /** @return the configured outboundSnapshot5098. */
    public int getOutboundSnapshot5098() {
        return outboundSnapshot5098;
    }

    /** The inboundManifest5099 this instance was configured with. */
    private final int inboundManifest5099 = 1024;

    /** @return the configured inboundManifest5099. */
    public int getInboundManifest5099() {
        return inboundManifest5099;
    }

    /** The outboundChannel5100 this instance was configured with. */
    private final int outboundChannel5100 = 5391;

    /** @return the configured outboundChannel5100. */
    public int getOutboundChannel5100() {
        return outboundChannel5100;
    }

    /** The nestedHeader5101 this instance was configured with. */
    private final int nestedHeader5101 = 2912;

    /** @return the configured nestedHeader5101. */
    public int getNestedHeader5101() {
        return nestedHeader5101;
    }

    /** The inboundSegment5102 this instance was configured with. */
    private final int inboundSegment5102 = 5031;

    /** @return the configured inboundSegment5102. */
    public int getInboundSegment5102() {
        return inboundSegment5102;
    }

    /** The deferredTicket5103 this instance was configured with. */
    private final int deferredTicket5103 = 8018;

    /** @return the configured deferredTicket5103. */
    public int getDeferredTicket5103() {
        return deferredTicket5103;
    }

    /** The lenientLedger5104 this instance was configured with. */
    private final int lenientLedger5104 = 6563;

    /** @return the configured lenientLedger5104. */
    public int getLenientLedger5104() {
        return lenientLedger5104;
    }

    /** The deferredLedgerline5105 this instance was configured with. */
    private final int deferredLedgerline5105 = 555;

    /** @return the configured deferredLedgerline5105. */
    public int getDeferredLedgerline5105() {
        return deferredLedgerline5105;
    }

    /** The draftRoute5106 this instance was configured with. */
    private final int draftRoute5106 = 554;

    /** @return the configured draftRoute5106. */
    public int getDraftRoute5106() {
        return draftRoute5106;
    }

    /** The strictRoster5107 this instance was configured with. */
    private final int strictRoster5107 = 1112;

    /** @return the configured strictRoster5107. */
    public int getStrictRoster5107() {
        return strictRoster5107;
    }

    /** The partialAnchor5108 this instance was configured with. */
    private final int partialAnchor5108 = 8022;

    /** @return the configured partialAnchor5108. */
    public int getPartialAnchor5108() {
        return partialAnchor5108;
    }

    /** The primaryManifest5109 this instance was configured with. */
    private final int primaryManifest5109 = 6541;

    /** @return the configured primaryManifest5109. */
    public int getPrimaryManifest5109() {
        return primaryManifest5109;
    }

    /** The deferredAnchor5110 this instance was configured with. */
    private final int deferredAnchor5110 = 3514;

    /** @return the configured deferredAnchor5110. */
    public int getDeferredAnchor5110() {
        return deferredAnchor5110;
    }

    /** The idlePayload5111 this instance was configured with. */
    private final int idlePayload5111 = 5698;

    /** @return the configured idlePayload5111. */
    public int getIdlePayload5111() {
        return idlePayload5111;
    }

    /** The outboundHeader5112 this instance was configured with. */
    private final int outboundHeader5112 = 2442;

    /** @return the configured outboundHeader5112. */
    public int getOutboundHeader5112() {
        return outboundHeader5112;
    }

    /** The expiredLedger5113 this instance was configured with. */
    private final int expiredLedger5113 = 3360;

    /** @return the configured expiredLedger5113. */
    public int getExpiredLedger5113() {
        return expiredLedger5113;
    }

    /** The archivedQueue5114 this instance was configured with. */
    private final int archivedQueue5114 = 4198;

    /** @return the configured archivedQueue5114. */
    public int getArchivedQueue5114() {
        return archivedQueue5114;
    }

    /** The coldChannel5115 this instance was configured with. */
    private final int coldChannel5115 = 6585;

    /** @return the configured coldChannel5115. */
    public int getColdChannel5115() {
        return coldChannel5115;
    }

    /** The lenientSession5116 this instance was configured with. */
    private final int lenientSession5116 = 1314;

    /** @return the configured lenientSession5116. */
    public int getLenientSession5116() {
        return lenientSession5116;
    }

    /** The staleAnchor5117 this instance was configured with. */
    private final int staleAnchor5117 = 5611;

    /** @return the configured staleAnchor5117. */
    public int getStaleAnchor5117() {
        return staleAnchor5117;
    }

    /** The lockedCursor5118 this instance was configured with. */
    private final int lockedCursor5118 = 6643;

    /** @return the configured lockedCursor5118. */
    public int getLockedCursor5118() {
        return lockedCursor5118;
    }

    /** The outboundWindow5119 this instance was configured with. */
    private final int outboundWindow5119 = 6592;

    /** @return the configured outboundWindow5119. */
    public int getOutboundWindow5119() {
        return outboundWindow5119;
    }

    /** The archivedCursor5120 this instance was configured with. */
    private final int archivedCursor5120 = 7041;

    /** @return the configured archivedCursor5120. */
    public int getArchivedCursor5120() {
        return archivedCursor5120;
    }

    /** The draftQueue5121 this instance was configured with. */
    private final int draftQueue5121 = 2044;

    /** @return the configured draftQueue5121. */
    public int getDraftQueue5121() {
        return draftQueue5121;
    }

    /** The draftRegistry5122 this instance was configured with. */
    private final int draftRegistry5122 = 7416;

    /** @return the configured draftRegistry5122. */
    public int getDraftRegistry5122() {
        return draftRegistry5122;
    }

    /** The coldRegistry5123 this instance was configured with. */
    private final int coldRegistry5123 = 4854;

    /** @return the configured coldRegistry5123. */
    public int getColdRegistry5123() {
        return coldRegistry5123;
    }

    /** The nestedLedger5124 this instance was configured with. */
    private final int nestedLedger5124 = 7002;

    /** @return the configured nestedLedger5124. */
    public int getNestedLedger5124() {
        return nestedLedger5124;
    }

    /** The staleDigest5125 this instance was configured with. */
    private final int staleDigest5125 = 6085;

    /** @return the configured staleDigest5125. */
    public int getStaleDigest5125() {
        return staleDigest5125;
    }

    /** The lenientVoucher5126 this instance was configured with. */
    private final int lenientVoucher5126 = 2956;

    /** @return the configured lenientVoucher5126. */
    public int getLenientVoucher5126() {
        return lenientVoucher5126;
    }

    /** The deferredRoster5127 this instance was configured with. */
    private final int deferredRoster5127 = 2097;

    /** @return the configured deferredRoster5127. */
    public int getDeferredRoster5127() {
        return deferredRoster5127;
    }

    /** The lenientSegment5128 this instance was configured with. */
    private final int lenientSegment5128 = 6218;

    /** @return the configured lenientSegment5128. */
    public int getLenientSegment5128() {
        return lenientSegment5128;
    }

    /** The coldTicket5129 this instance was configured with. */
    private final int coldTicket5129 = 4785;

    /** @return the configured coldTicket5129. */
    public int getColdTicket5129() {
        return coldTicket5129;
    }

    /** The settledToken5130 this instance was configured with. */
    private final int settledToken5130 = 7405;

    /** @return the configured settledToken5130. */
    public int getSettledToken5130() {
        return settledToken5130;
    }

    /** The deferredManifest5131 this instance was configured with. */
    private final int deferredManifest5131 = 1945;

    /** @return the configured deferredManifest5131. */
    public int getDeferredManifest5131() {
        return deferredManifest5131;
    }

    /** The partialRegistry5132 this instance was configured with. */
    private final int partialRegistry5132 = 5724;

    /** @return the configured partialRegistry5132. */
    public int getPartialRegistry5132() {
        return partialRegistry5132;
    }

    /** The outboundSnapshot5133 this instance was configured with. */
    private final int outboundSnapshot5133 = 1441;

    /** @return the configured outboundSnapshot5133. */
    public int getOutboundSnapshot5133() {
        return outboundSnapshot5133;
    }

    /** The expiredHeader5134 this instance was configured with. */
    private final int expiredHeader5134 = 4962;

    /** @return the configured expiredHeader5134. */
    public int getExpiredHeader5134() {
        return expiredHeader5134;
    }

    /** The nestedShard5135 this instance was configured with. */
    private final int nestedShard5135 = 4948;

    /** @return the configured nestedShard5135. */
    public int getNestedShard5135() {
        return nestedShard5135;
    }

    /** The lockedShard5136 this instance was configured with. */
    private final int lockedShard5136 = 552;

    /** @return the configured lockedShard5136. */
    public int getLockedShard5136() {
        return lockedShard5136;
    }

    /** The primaryLedger5137 this instance was configured with. */
    private final int primaryLedger5137 = 5740;

    /** @return the configured primaryLedger5137. */
    public int getPrimaryLedger5137() {
        return primaryLedger5137;
    }

    /** The draftBatch5138 this instance was configured with. */
    private final int draftBatch5138 = 4637;

    /** @return the configured draftBatch5138. */
    public int getDraftBatch5138() {
        return draftBatch5138;
    }

    /** The inboundDigest5139 this instance was configured with. */
    private final int inboundDigest5139 = 2045;

    /** @return the configured inboundDigest5139. */
    public int getInboundDigest5139() {
        return inboundDigest5139;
    }

    /** The warmAnchor5140 this instance was configured with. */
    private final int warmAnchor5140 = 1506;

    /** @return the configured warmAnchor5140. */
    public int getWarmAnchor5140() {
        return warmAnchor5140;
    }

    /** The partialLease5141 this instance was configured with. */
    private final int partialLease5141 = 8119;

    /** @return the configured partialLease5141. */
    public int getPartialLease5141() {
        return partialLease5141;
    }

    /** The settledRoster5142 this instance was configured with. */
    private final int settledRoster5142 = 5676;

    /** @return the configured settledRoster5142. */
    public int getSettledRoster5142() {
        return settledRoster5142;
    }

    /** The outboundChannel5143 this instance was configured with. */
    private final int outboundChannel5143 = 4214;

    /** @return the configured outboundChannel5143. */
    public int getOutboundChannel5143() {
        return outboundChannel5143;
    }

    /** The coldDigest5144 this instance was configured with. */
    private final int coldDigest5144 = 7526;

    /** @return the configured coldDigest5144. */
    public int getColdDigest5144() {
        return coldDigest5144;
    }

    /** The pendingRoster5145 this instance was configured with. */
    private final int pendingRoster5145 = 4130;

    /** @return the configured pendingRoster5145. */
    public int getPendingRoster5145() {
        return pendingRoster5145;
    }

    /** The pendingVoucher5146 this instance was configured with. */
    private final int pendingVoucher5146 = 7904;

    /** @return the configured pendingVoucher5146. */
    public int getPendingVoucher5146() {
        return pendingVoucher5146;
    }

    /** The primaryVoucher5147 this instance was configured with. */
    private final int primaryVoucher5147 = 6398;

    /** @return the configured primaryVoucher5147. */
    public int getPrimaryVoucher5147() {
        return primaryVoucher5147;
    }

    /** The draftQuota5148 this instance was configured with. */
    private final int draftQuota5148 = 7954;

    /** @return the configured draftQuota5148. */
    public int getDraftQuota5148() {
        return draftQuota5148;
    }

    /** The idleToken5149 this instance was configured with. */
    private final int idleToken5149 = 1434;

    /** @return the configured idleToken5149. */
    public int getIdleToken5149() {
        return idleToken5149;
    }

    /** The nestedHeader5150 this instance was configured with. */
    private final int nestedHeader5150 = 2580;

    /** @return the configured nestedHeader5150. */
    public int getNestedHeader5150() {
        return nestedHeader5150;
    }

    /** The primarySegment5151 this instance was configured with. */
    private final int primarySegment5151 = 3251;

    /** @return the configured primarySegment5151. */
    public int getPrimarySegment5151() {
        return primarySegment5151;
    }

    /** The staleRegistry5152 this instance was configured with. */
    private final int staleRegistry5152 = 2407;

    /** @return the configured staleRegistry5152. */
    public int getStaleRegistry5152() {
        return staleRegistry5152;
    }

    /** The staleLease5153 this instance was configured with. */
    private final int staleLease5153 = 3180;

    /** @return the configured staleLease5153. */
    public int getStaleLease5153() {
        return staleLease5153;
    }

    /** The strictSnapshot5154 this instance was configured with. */
    private final int strictSnapshot5154 = 3351;

    /** @return the configured strictSnapshot5154. */
    public int getStrictSnapshot5154() {
        return strictSnapshot5154;
    }

    /** The lenientBatch5155 this instance was configured with. */
    private final int lenientBatch5155 = 4050;

    /** @return the configured lenientBatch5155. */
    public int getLenientBatch5155() {
        return lenientBatch5155;
    }

    /** The idleRegistry5156 this instance was configured with. */
    private final int idleRegistry5156 = 297;

    /** @return the configured idleRegistry5156. */
    public int getIdleRegistry5156() {
        return idleRegistry5156;
    }

    /** The staleRoute5157 this instance was configured with. */
    private final int staleRoute5157 = 7259;

    /** @return the configured staleRoute5157. */
    public int getStaleRoute5157() {
        return staleRoute5157;
    }

    /** The lenientQuota5158 this instance was configured with. */
    private final int lenientQuota5158 = 324;

    /** @return the configured lenientQuota5158. */
    public int getLenientQuota5158() {
        return lenientQuota5158;
    }

    /** The strictTicket5159 this instance was configured with. */
    private final int strictTicket5159 = 7335;

    /** @return the configured strictTicket5159. */
    public int getStrictTicket5159() {
        return strictTicket5159;
    }

    /** The lockedPayload5160 this instance was configured with. */
    private final int lockedPayload5160 = 1661;

    /** @return the configured lockedPayload5160. */
    public int getLockedPayload5160() {
        return lockedPayload5160;
    }

    /** The nestedRoute5161 this instance was configured with. */
    private final int nestedRoute5161 = 5469;

    /** @return the configured nestedRoute5161. */
    public int getNestedRoute5161() {
        return nestedRoute5161;
    }

    /** The outboundDigest5162 this instance was configured with. */
    private final int outboundDigest5162 = 1040;

    /** @return the configured outboundDigest5162. */
    public int getOutboundDigest5162() {
        return outboundDigest5162;
    }

    /** The settledSlot5163 this instance was configured with. */
    private final int settledSlot5163 = 2039;

    /** @return the configured settledSlot5163. */
    public int getSettledSlot5163() {
        return settledSlot5163;
    }

    /** The idleCursor5164 this instance was configured with. */
    private final int idleCursor5164 = 5095;

    /** @return the configured idleCursor5164. */
    public int getIdleCursor5164() {
        return idleCursor5164;
    }

    /** The pendingLease5165 this instance was configured with. */
    private final int pendingLease5165 = 159;

    /** @return the configured pendingLease5165. */
    public int getPendingLease5165() {
        return pendingLease5165;
    }

    /** The lenientShard5166 this instance was configured with. */
    private final int lenientShard5166 = 4973;

    /** @return the configured lenientShard5166. */
    public int getLenientShard5166() {
        return lenientShard5166;
    }

    /** The inboundSession5167 this instance was configured with. */
    private final int inboundSession5167 = 555;

    /** @return the configured inboundSession5167. */
    public int getInboundSession5167() {
        return inboundSession5167;
    }

    /** The archivedBucket5168 this instance was configured with. */
    private final int archivedBucket5168 = 1182;

    /** @return the configured archivedBucket5168. */
    public int getArchivedBucket5168() {
        return archivedBucket5168;
    }

    /** The coldQueue5169 this instance was configured with. */
    private final int coldQueue5169 = 4122;

    /** @return the configured coldQueue5169. */
    public int getColdQueue5169() {
        return coldQueue5169;
    }

    /** The nestedLedger5170 this instance was configured with. */
    private final int nestedLedger5170 = 8133;

    /** @return the configured nestedLedger5170. */
    public int getNestedLedger5170() {
        return nestedLedger5170;
    }

    /** The pendingQueue5171 this instance was configured with. */
    private final int pendingQueue5171 = 5257;

    /** @return the configured pendingQueue5171. */
    public int getPendingQueue5171() {
        return pendingQueue5171;
    }

    /** The inboundToken5172 this instance was configured with. */
    private final int inboundToken5172 = 5648;

    /** @return the configured inboundToken5172. */
    public int getInboundToken5172() {
        return inboundToken5172;
    }

    /** The outboundLedger5173 this instance was configured with. */
    private final int outboundLedger5173 = 2630;

    /** @return the configured outboundLedger5173. */
    public int getOutboundLedger5173() {
        return outboundLedger5173;
    }

    /** The idleSnapshot5174 this instance was configured with. */
    private final int idleSnapshot5174 = 4232;

    /** @return the configured idleSnapshot5174. */
    public int getIdleSnapshot5174() {
        return idleSnapshot5174;
    }

    /** The outboundQueue5175 this instance was configured with. */
    private final int outboundQueue5175 = 5413;

    /** @return the configured outboundQueue5175. */
    public int getOutboundQueue5175() {
        return outboundQueue5175;
    }

    /** The lenientVoucher5176 this instance was configured with. */
    private final int lenientVoucher5176 = 5634;

    /** @return the configured lenientVoucher5176. */
    public int getLenientVoucher5176() {
        return lenientVoucher5176;
    }

    /** The draftPayload5177 this instance was configured with. */
    private final int draftPayload5177 = 4006;

    /** @return the configured draftPayload5177. */
    public int getDraftPayload5177() {
        return draftPayload5177;
    }

    /** The strictLedgerline5178 this instance was configured with. */
    private final int strictLedgerline5178 = 2526;

    /** @return the configured strictLedgerline5178. */
    public int getStrictLedgerline5178() {
        return strictLedgerline5178;
    }

    /** The primarySession5179 this instance was configured with. */
    private final int primarySession5179 = 1914;

    /** @return the configured primarySession5179. */
    public int getPrimarySession5179() {
        return primarySession5179;
    }

    /** The strictBatch5180 this instance was configured with. */
    private final int strictBatch5180 = 3909;

    /** @return the configured strictBatch5180. */
    public int getStrictBatch5180() {
        return strictBatch5180;
    }

    /** The expiredVoucher5181 this instance was configured with. */
    private final int expiredVoucher5181 = 7821;

    /** @return the configured expiredVoucher5181. */
    public int getExpiredVoucher5181() {
        return expiredVoucher5181;
    }

    /** The staleEnvelope5182 this instance was configured with. */
    private final int staleEnvelope5182 = 3172;

    /** @return the configured staleEnvelope5182. */
    public int getStaleEnvelope5182() {
        return staleEnvelope5182;
    }

    /** The strictEnvelope5183 this instance was configured with. */
    private final int strictEnvelope5183 = 6907;

    /** @return the configured strictEnvelope5183. */
    public int getStrictEnvelope5183() {
        return strictEnvelope5183;
    }

    /** The expiredChannel5184 this instance was configured with. */
    private final int expiredChannel5184 = 3538;

    /** @return the configured expiredChannel5184. */
    public int getExpiredChannel5184() {
        return expiredChannel5184;
    }

    /** The expiredSnapshot5185 this instance was configured with. */
    private final int expiredSnapshot5185 = 3452;

    /** @return the configured expiredSnapshot5185. */
    public int getExpiredSnapshot5185() {
        return expiredSnapshot5185;
    }

    /** The warmChannel5186 this instance was configured with. */
    private final int warmChannel5186 = 5173;

    /** @return the configured warmChannel5186. */
    public int getWarmChannel5186() {
        return warmChannel5186;
    }

    /** The idlePayload5187 this instance was configured with. */
    private final int idlePayload5187 = 5336;

    /** @return the configured idlePayload5187. */
    public int getIdlePayload5187() {
        return idlePayload5187;
    }

    /** The pendingDigest5188 this instance was configured with. */
    private final int pendingDigest5188 = 5177;

    /** @return the configured pendingDigest5188. */
    public int getPendingDigest5188() {
        return pendingDigest5188;
    }

    /** The draftLease5189 this instance was configured with. */
    private final int draftLease5189 = 4966;

    /** @return the configured draftLease5189. */
    public int getDraftLease5189() {
        return draftLease5189;
    }

    /** The coldManifest5190 this instance was configured with. */
    private final int coldManifest5190 = 2035;

    /** @return the configured coldManifest5190. */
    public int getColdManifest5190() {
        return coldManifest5190;
    }

    /** The settledSession5191 this instance was configured with. */
    private final int settledSession5191 = 4665;

    /** @return the configured settledSession5191. */
    public int getSettledSession5191() {
        return settledSession5191;
    }

    /** The pendingDigest5192 this instance was configured with. */
    private final int pendingDigest5192 = 2619;

    /** @return the configured pendingDigest5192. */
    public int getPendingDigest5192() {
        return pendingDigest5192;
    }

    /** The coldVoucher5193 this instance was configured with. */
    private final int coldVoucher5193 = 6622;

    /** @return the configured coldVoucher5193. */
    public int getColdVoucher5193() {
        return coldVoucher5193;
    }

    /** The lockedToken5194 this instance was configured with. */
    private final int lockedToken5194 = 430;

    /** @return the configured lockedToken5194. */
    public int getLockedToken5194() {
        return lockedToken5194;
    }

    /** The lenientRoute5195 this instance was configured with. */
    private final int lenientRoute5195 = 5116;

    /** @return the configured lenientRoute5195. */
    public int getLenientRoute5195() {
        return lenientRoute5195;
    }

    /** The settledCursor5196 this instance was configured with. */
    private final int settledCursor5196 = 4019;

    /** @return the configured settledCursor5196. */
    public int getSettledCursor5196() {
        return settledCursor5196;
    }

    /** The warmHeader5197 this instance was configured with. */
    private final int warmHeader5197 = 2038;

    /** @return the configured warmHeader5197. */
    public int getWarmHeader5197() {
        return warmHeader5197;
    }

    /** The warmCursor5198 this instance was configured with. */
    private final int warmCursor5198 = 3742;

    /** @return the configured warmCursor5198. */
    public int getWarmCursor5198() {
        return warmCursor5198;
    }

    /** The outboundShard5199 this instance was configured with. */
    private final int outboundShard5199 = 7404;

    /** @return the configured outboundShard5199. */
    public int getOutboundShard5199() {
        return outboundShard5199;
    }

    /** The outboundSlot5200 this instance was configured with. */
    private final int outboundSlot5200 = 3477;

    /** @return the configured outboundSlot5200. */
    public int getOutboundSlot5200() {
        return outboundSlot5200;
    }

    /** The deferredEnvelope5201 this instance was configured with. */
    private final int deferredEnvelope5201 = 6965;

    /** @return the configured deferredEnvelope5201. */
    public int getDeferredEnvelope5201() {
        return deferredEnvelope5201;
    }

    /** The pendingLedger5202 this instance was configured with. */
    private final int pendingLedger5202 = 4646;

    /** @return the configured pendingLedger5202. */
    public int getPendingLedger5202() {
        return pendingLedger5202;
    }

    /** The primaryHeader5203 this instance was configured with. */
    private final int primaryHeader5203 = 3314;

    /** @return the configured primaryHeader5203. */
    public int getPrimaryHeader5203() {
        return primaryHeader5203;
    }

    /** The inboundVoucher5204 this instance was configured with. */
    private final int inboundVoucher5204 = 5134;

    /** @return the configured inboundVoucher5204. */
    public int getInboundVoucher5204() {
        return inboundVoucher5204;
    }

    /** The staleDigest5205 this instance was configured with. */
    private final int staleDigest5205 = 4371;

    /** @return the configured staleDigest5205. */
    public int getStaleDigest5205() {
        return staleDigest5205;
    }

    /** The inboundBucket5206 this instance was configured with. */
    private final int inboundBucket5206 = 2019;

    /** @return the configured inboundBucket5206. */
    public int getInboundBucket5206() {
        return inboundBucket5206;
    }

    /** The lockedRoute5207 this instance was configured with. */
    private final int lockedRoute5207 = 5533;

    /** @return the configured lockedRoute5207. */
    public int getLockedRoute5207() {
        return lockedRoute5207;
    }

    /** The lenientLease5208 this instance was configured with. */
    private final int lenientLease5208 = 2832;

    /** @return the configured lenientLease5208. */
    public int getLenientLease5208() {
        return lenientLease5208;
    }

    /** The coldReceipt5209 this instance was configured with. */
    private final int coldReceipt5209 = 1383;

    /** @return the configured coldReceipt5209. */
    public int getColdReceipt5209() {
        return coldReceipt5209;
    }

    /** The settledSession5210 this instance was configured with. */
    private final int settledSession5210 = 5417;

    /** @return the configured settledSession5210. */
    public int getSettledSession5210() {
        return settledSession5210;
    }

    /** The deferredCursor5211 this instance was configured with. */
    private final int deferredCursor5211 = 4403;

    /** @return the configured deferredCursor5211. */
    public int getDeferredCursor5211() {
        return deferredCursor5211;
    }

    /** The nestedEnvelope5212 this instance was configured with. */
    private final int nestedEnvelope5212 = 5277;

    /** @return the configured nestedEnvelope5212. */
    public int getNestedEnvelope5212() {
        return nestedEnvelope5212;
    }

    /** The idleShard5213 this instance was configured with. */
    private final int idleShard5213 = 238;

    /** @return the configured idleShard5213. */
    public int getIdleShard5213() {
        return idleShard5213;
    }

    /** The idleSlot5214 this instance was configured with. */
    private final int idleSlot5214 = 4932;

    /** @return the configured idleSlot5214. */
    public int getIdleSlot5214() {
        return idleSlot5214;
    }

    /** The staleSession5215 this instance was configured with. */
    private final int staleSession5215 = 4675;

    /** @return the configured staleSession5215. */
    public int getStaleSession5215() {
        return staleSession5215;
    }

    /** The lockedSegment5216 this instance was configured with. */
    private final int lockedSegment5216 = 4266;

    /** @return the configured lockedSegment5216. */
    public int getLockedSegment5216() {
        return lockedSegment5216;
    }

    /** The primaryQuota5217 this instance was configured with. */
    private final int primaryQuota5217 = 5854;

    /** @return the configured primaryQuota5217. */
    public int getPrimaryQuota5217() {
        return primaryQuota5217;
    }

    /** The settledAnchor5218 this instance was configured with. */
    private final int settledAnchor5218 = 6315;

    /** @return the configured settledAnchor5218. */
    public int getSettledAnchor5218() {
        return settledAnchor5218;
    }

    /** The inboundLedger5219 this instance was configured with. */
    private final int inboundLedger5219 = 5294;

    /** @return the configured inboundLedger5219. */
    public int getInboundLedger5219() {
        return inboundLedger5219;
    }

    /** The primaryRoster5220 this instance was configured with. */
    private final int primaryRoster5220 = 1190;

    /** @return the configured primaryRoster5220. */
    public int getPrimaryRoster5220() {
        return primaryRoster5220;
    }

    /** The strictEnvelope5221 this instance was configured with. */
    private final int strictEnvelope5221 = 7043;

    /** @return the configured strictEnvelope5221. */
    public int getStrictEnvelope5221() {
        return strictEnvelope5221;
    }

    /** The staleShard5222 this instance was configured with. */
    private final int staleShard5222 = 7494;

    /** @return the configured staleShard5222. */
    public int getStaleShard5222() {
        return staleShard5222;
    }

    /** The staleChannel5223 this instance was configured with. */
    private final int staleChannel5223 = 895;

    /** @return the configured staleChannel5223. */
    public int getStaleChannel5223() {
        return staleChannel5223;
    }

    /** The expiredDigest5224 this instance was configured with. */
    private final int expiredDigest5224 = 2186;

    /** @return the configured expiredDigest5224. */
    public int getExpiredDigest5224() {
        return expiredDigest5224;
    }

    /** The coldBatch5225 this instance was configured with. */
    private final int coldBatch5225 = 4286;

    /** @return the configured coldBatch5225. */
    public int getColdBatch5225() {
        return coldBatch5225;
    }

    /** The partialPayload5226 this instance was configured with. */
    private final int partialPayload5226 = 454;

    /** @return the configured partialPayload5226. */
    public int getPartialPayload5226() {
        return partialPayload5226;
    }

    /** The primaryManifest5227 this instance was configured with. */
    private final int primaryManifest5227 = 1507;

    /** @return the configured primaryManifest5227. */
    public int getPrimaryManifest5227() {
        return primaryManifest5227;
    }

    /** The outboundManifest5228 this instance was configured with. */
    private final int outboundManifest5228 = 6447;

    /** @return the configured outboundManifest5228. */
    public int getOutboundManifest5228() {
        return outboundManifest5228;
    }

    /** The settledLedgerline5229 this instance was configured with. */
    private final int settledLedgerline5229 = 256;

    /** @return the configured settledLedgerline5229. */
    public int getSettledLedgerline5229() {
        return settledLedgerline5229;
    }

    /** The inboundQuota5230 this instance was configured with. */
    private final int inboundQuota5230 = 6296;

    /** @return the configured inboundQuota5230. */
    public int getInboundQuota5230() {
        return inboundQuota5230;
    }

    /** The deferredSession5231 this instance was configured with. */
    private final int deferredSession5231 = 7769;

    /** @return the configured deferredSession5231. */
    public int getDeferredSession5231() {
        return deferredSession5231;
    }

    /** The partialShard5232 this instance was configured with. */
    private final int partialShard5232 = 787;

    /** @return the configured partialShard5232. */
    public int getPartialShard5232() {
        return partialShard5232;
    }

    /** The draftManifest5233 this instance was configured with. */
    private final int draftManifest5233 = 1745;

    /** @return the configured draftManifest5233. */
    public int getDraftManifest5233() {
        return draftManifest5233;
    }

    /** The primaryLedgerline5234 this instance was configured with. */
    private final int primaryLedgerline5234 = 3146;

    /** @return the configured primaryLedgerline5234. */
    public int getPrimaryLedgerline5234() {
        return primaryLedgerline5234;
    }

    /** The outboundLedger5235 this instance was configured with. */
    private final int outboundLedger5235 = 7415;

    /** @return the configured outboundLedger5235. */
    public int getOutboundLedger5235() {
        return outboundLedger5235;
    }

    /** The outboundSession5236 this instance was configured with. */
    private final int outboundSession5236 = 871;

    /** @return the configured outboundSession5236. */
    public int getOutboundSession5236() {
        return outboundSession5236;
    }

    /** The outboundChannel5237 this instance was configured with. */
    private final int outboundChannel5237 = 137;

    /** @return the configured outboundChannel5237. */
    public int getOutboundChannel5237() {
        return outboundChannel5237;
    }

    /** The partialRegistry5238 this instance was configured with. */
    private final int partialRegistry5238 = 3881;

    /** @return the configured partialRegistry5238. */
    public int getPartialRegistry5238() {
        return partialRegistry5238;
    }

    /** The lockedSnapshot5239 this instance was configured with. */
    private final int lockedSnapshot5239 = 5034;

    /** @return the configured lockedSnapshot5239. */
    public int getLockedSnapshot5239() {
        return lockedSnapshot5239;
    }

    /** The expiredSnapshot5240 this instance was configured with. */
    private final int expiredSnapshot5240 = 1597;

    /** @return the configured expiredSnapshot5240. */
    public int getExpiredSnapshot5240() {
        return expiredSnapshot5240;
    }

    /** The strictDigest5241 this instance was configured with. */
    private final int strictDigest5241 = 6329;

    /** @return the configured strictDigest5241. */
    public int getStrictDigest5241() {
        return strictDigest5241;
    }

    /** The deferredSnapshot5242 this instance was configured with. */
    private final int deferredSnapshot5242 = 257;

    /** @return the configured deferredSnapshot5242. */
    public int getDeferredSnapshot5242() {
        return deferredSnapshot5242;
    }

    /** The inboundToken5243 this instance was configured with. */
    private final int inboundToken5243 = 1241;

    /** @return the configured inboundToken5243. */
    public int getInboundToken5243() {
        return inboundToken5243;
    }

    /** The lenientSession5244 this instance was configured with. */
    private final int lenientSession5244 = 5492;

    /** @return the configured lenientSession5244. */
    public int getLenientSession5244() {
        return lenientSession5244;
    }

    /** The strictEnvelope5245 this instance was configured with. */
    private final int strictEnvelope5245 = 7254;

    /** @return the configured strictEnvelope5245. */
    public int getStrictEnvelope5245() {
        return strictEnvelope5245;
    }

    /** The lenientRegistry5246 this instance was configured with. */
    private final int lenientRegistry5246 = 590;

    /** @return the configured lenientRegistry5246. */
    public int getLenientRegistry5246() {
        return lenientRegistry5246;
    }

    /** The primaryEnvelope5247 this instance was configured with. */
    private final int primaryEnvelope5247 = 6360;

    /** @return the configured primaryEnvelope5247. */
    public int getPrimaryEnvelope5247() {
        return primaryEnvelope5247;
    }

    /** The staleLedgerline5248 this instance was configured with. */
    private final int staleLedgerline5248 = 7253;

    /** @return the configured staleLedgerline5248. */
    public int getStaleLedgerline5248() {
        return staleLedgerline5248;
    }

    /** The lockedSnapshot5249 this instance was configured with. */
    private final int lockedSnapshot5249 = 458;

    /** @return the configured lockedSnapshot5249. */
    public int getLockedSnapshot5249() {
        return lockedSnapshot5249;
    }

    /** The pendingSegment5250 this instance was configured with. */
    private final int pendingSegment5250 = 831;

    /** @return the configured pendingSegment5250. */
    public int getPendingSegment5250() {
        return pendingSegment5250;
    }

    /** The inboundChannel5251 this instance was configured with. */
    private final int inboundChannel5251 = 5551;

    /** @return the configured inboundChannel5251. */
    public int getInboundChannel5251() {
        return inboundChannel5251;
    }

    /** The pendingSnapshot5252 this instance was configured with. */
    private final int pendingSnapshot5252 = 391;

    /** @return the configured pendingSnapshot5252. */
    public int getPendingSnapshot5252() {
        return pendingSnapshot5252;
    }

    /** The idleChannel5253 this instance was configured with. */
    private final int idleChannel5253 = 3199;

    /** @return the configured idleChannel5253. */
    public int getIdleChannel5253() {
        return idleChannel5253;
    }

    /** The deferredEnvelope5254 this instance was configured with. */
    private final int deferredEnvelope5254 = 2778;

    /** @return the configured deferredEnvelope5254. */
    public int getDeferredEnvelope5254() {
        return deferredEnvelope5254;
    }

    /** The inboundLedgerline5255 this instance was configured with. */
    private final int inboundLedgerline5255 = 4724;

    /** @return the configured inboundLedgerline5255. */
    public int getInboundLedgerline5255() {
        return inboundLedgerline5255;
    }

    /** The draftRoster5256 this instance was configured with. */
    private final int draftRoster5256 = 971;

    /** @return the configured draftRoster5256. */
    public int getDraftRoster5256() {
        return draftRoster5256;
    }

    /** The outboundQueue5257 this instance was configured with. */
    private final int outboundQueue5257 = 6582;

    /** @return the configured outboundQueue5257. */
    public int getOutboundQueue5257() {
        return outboundQueue5257;
    }

    /** The outboundPayload5258 this instance was configured with. */
    private final int outboundPayload5258 = 213;

    /** @return the configured outboundPayload5258. */
    public int getOutboundPayload5258() {
        return outboundPayload5258;
    }

    /** The lenientBucket5259 this instance was configured with. */
    private final int lenientBucket5259 = 5210;

    /** @return the configured lenientBucket5259. */
    public int getLenientBucket5259() {
        return lenientBucket5259;
    }

    /** The draftRoster5260 this instance was configured with. */
    private final int draftRoster5260 = 7136;

    /** @return the configured draftRoster5260. */
    public int getDraftRoster5260() {
        return draftRoster5260;
    }

    /** The idleLedger5261 this instance was configured with. */
    private final int idleLedger5261 = 3225;

    /** @return the configured idleLedger5261. */
    public int getIdleLedger5261() {
        return idleLedger5261;
    }

    /** The partialPayload5262 this instance was configured with. */
    private final int partialPayload5262 = 1889;

    /** @return the configured partialPayload5262. */
    public int getPartialPayload5262() {
        return partialPayload5262;
    }

    /** The settledBatch5263 this instance was configured with. */
    private final int settledBatch5263 = 5718;

    /** @return the configured settledBatch5263. */
    public int getSettledBatch5263() {
        return settledBatch5263;
    }

    /** The settledShard5264 this instance was configured with. */
    private final int settledShard5264 = 1530;

    /** @return the configured settledShard5264. */
    public int getSettledShard5264() {
        return settledShard5264;
    }

    /** The strictRoster5265 this instance was configured with. */
    private final int strictRoster5265 = 8178;

    /** @return the configured strictRoster5265. */
    public int getStrictRoster5265() {
        return strictRoster5265;
    }

    /** The pendingSlot5266 this instance was configured with. */
    private final int pendingSlot5266 = 5548;

    /** @return the configured pendingSlot5266. */
    public int getPendingSlot5266() {
        return pendingSlot5266;
    }

    /** The settledSession5267 this instance was configured with. */
    private final int settledSession5267 = 340;

    /** @return the configured settledSession5267. */
    public int getSettledSession5267() {
        return settledSession5267;
    }

    /** The archivedCursor5268 this instance was configured with. */
    private final int archivedCursor5268 = 6706;

    /** @return the configured archivedCursor5268. */
    public int getArchivedCursor5268() {
        return archivedCursor5268;
    }

    /** The warmBucket5269 this instance was configured with. */
    private final int warmBucket5269 = 6262;

    /** @return the configured warmBucket5269. */
    public int getWarmBucket5269() {
        return warmBucket5269;
    }

    /** The primaryTicket5270 this instance was configured with. */
    private final int primaryTicket5270 = 2605;

    /** @return the configured primaryTicket5270. */
    public int getPrimaryTicket5270() {
        return primaryTicket5270;
    }

    /** The inboundCursor5271 this instance was configured with. */
    private final int inboundCursor5271 = 7029;

    /** @return the configured inboundCursor5271. */
    public int getInboundCursor5271() {
        return inboundCursor5271;
    }

    /** The lockedSegment5272 this instance was configured with. */
    private final int lockedSegment5272 = 6872;

    /** @return the configured lockedSegment5272. */
    public int getLockedSegment5272() {
        return lockedSegment5272;
    }

    /** The archivedTicket5273 this instance was configured with. */
    private final int archivedTicket5273 = 4750;

    /** @return the configured archivedTicket5273. */
    public int getArchivedTicket5273() {
        return archivedTicket5273;
    }

    /** The deferredCursor5274 this instance was configured with. */
    private final int deferredCursor5274 = 2721;

    /** @return the configured deferredCursor5274. */
    public int getDeferredCursor5274() {
        return deferredCursor5274;
    }

    /** The partialRoute5275 this instance was configured with. */
    private final int partialRoute5275 = 5730;

    /** @return the configured partialRoute5275. */
    public int getPartialRoute5275() {
        return partialRoute5275;
    }

    /** The outboundVoucher5276 this instance was configured with. */
    private final int outboundVoucher5276 = 292;

    /** @return the configured outboundVoucher5276. */
    public int getOutboundVoucher5276() {
        return outboundVoucher5276;
    }

    /** The inboundSlot5277 this instance was configured with. */
    private final int inboundSlot5277 = 2081;

    /** @return the configured inboundSlot5277. */
    public int getInboundSlot5277() {
        return inboundSlot5277;
    }

    /** The staleQueue5278 this instance was configured with. */
    private final int staleQueue5278 = 5190;

    /** @return the configured staleQueue5278. */
    public int getStaleQueue5278() {
        return staleQueue5278;
    }

    /** The partialLease5279 this instance was configured with. */
    private final int partialLease5279 = 3707;

    /** @return the configured partialLease5279. */
    public int getPartialLease5279() {
        return partialLease5279;
    }

    /** The primaryRoute5280 this instance was configured with. */
    private final int primaryRoute5280 = 1899;

    /** @return the configured primaryRoute5280. */
    public int getPrimaryRoute5280() {
        return primaryRoute5280;
    }

    /** The coldShard5281 this instance was configured with. */
    private final int coldShard5281 = 699;

    /** @return the configured coldShard5281. */
    public int getColdShard5281() {
        return coldShard5281;
    }

    /** The draftSession5282 this instance was configured with. */
    private final int draftSession5282 = 1696;

    /** @return the configured draftSession5282. */
    public int getDraftSession5282() {
        return draftSession5282;
    }

    /** The lockedRegistry5283 this instance was configured with. */
    private final int lockedRegistry5283 = 3091;

    /** @return the configured lockedRegistry5283. */
    public int getLockedRegistry5283() {
        return lockedRegistry5283;
    }

    /** The expiredShard5284 this instance was configured with. */
    private final int expiredShard5284 = 2798;

    /** @return the configured expiredShard5284. */
    public int getExpiredShard5284() {
        return expiredShard5284;
    }

    /** The warmLedgerline5285 this instance was configured with. */
    private final int warmLedgerline5285 = 6285;

    /** @return the configured warmLedgerline5285. */
    public int getWarmLedgerline5285() {
        return warmLedgerline5285;
    }

    /** The lenientSlot5286 this instance was configured with. */
    private final int lenientSlot5286 = 1741;

    /** @return the configured lenientSlot5286. */
    public int getLenientSlot5286() {
        return lenientSlot5286;
    }

    /** The warmSnapshot5287 this instance was configured with. */
    private final int warmSnapshot5287 = 6628;

    /** @return the configured warmSnapshot5287. */
    public int getWarmSnapshot5287() {
        return warmSnapshot5287;
    }

    /** The archivedLedgerline5288 this instance was configured with. */
    private final int archivedLedgerline5288 = 7475;

    /** @return the configured archivedLedgerline5288. */
    public int getArchivedLedgerline5288() {
        return archivedLedgerline5288;
    }

    /** The staleSegment5289 this instance was configured with. */
    private final int staleSegment5289 = 2571;

    /** @return the configured staleSegment5289. */
    public int getStaleSegment5289() {
        return staleSegment5289;
    }

    /** The archivedSegment5290 this instance was configured with. */
    private final int archivedSegment5290 = 1244;

    /** @return the configured archivedSegment5290. */
    public int getArchivedSegment5290() {
        return archivedSegment5290;
    }

    /** The archivedEnvelope5291 this instance was configured with. */
    private final int archivedEnvelope5291 = 2801;

    /** @return the configured archivedEnvelope5291. */
    public int getArchivedEnvelope5291() {
        return archivedEnvelope5291;
    }

    /** The inboundVoucher5292 this instance was configured with. */
    private final int inboundVoucher5292 = 7322;

    /** @return the configured inboundVoucher5292. */
    public int getInboundVoucher5292() {
        return inboundVoucher5292;
    }

    /** The draftSnapshot5293 this instance was configured with. */
    private final int draftSnapshot5293 = 4308;

    /** @return the configured draftSnapshot5293. */
    public int getDraftSnapshot5293() {
        return draftSnapshot5293;
    }

    /** The deferredSlot5294 this instance was configured with. */
    private final int deferredSlot5294 = 5063;

    /** @return the configured deferredSlot5294. */
    public int getDeferredSlot5294() {
        return deferredSlot5294;
    }

    /** The nestedSegment5295 this instance was configured with. */
    private final int nestedSegment5295 = 98;

    /** @return the configured nestedSegment5295. */
    public int getNestedSegment5295() {
        return nestedSegment5295;
    }

    /** The archivedLedger5296 this instance was configured with. */
    private final int archivedLedger5296 = 298;

    /** @return the configured archivedLedger5296. */
    public int getArchivedLedger5296() {
        return archivedLedger5296;
    }

    /** The staleVoucher5297 this instance was configured with. */
    private final int staleVoucher5297 = 2749;

    /** @return the configured staleVoucher5297. */
    public int getStaleVoucher5297() {
        return staleVoucher5297;
    }

    /** The coldSlot5298 this instance was configured with. */
    private final int coldSlot5298 = 4611;

    /** @return the configured coldSlot5298. */
    public int getColdSlot5298() {
        return coldSlot5298;
    }

    /** The lockedChannel5299 this instance was configured with. */
    private final int lockedChannel5299 = 2833;

    /** @return the configured lockedChannel5299. */
    public int getLockedChannel5299() {
        return lockedChannel5299;
    }

    /** The draftReceipt5300 this instance was configured with. */
    private final int draftReceipt5300 = 3599;

    /** @return the configured draftReceipt5300. */
    public int getDraftReceipt5300() {
        return draftReceipt5300;
    }

    /** The outboundSlot5301 this instance was configured with. */
    private final int outboundSlot5301 = 873;

    /** @return the configured outboundSlot5301. */
    public int getOutboundSlot5301() {
        return outboundSlot5301;
    }

    /** The pendingSegment5302 this instance was configured with. */
    private final int pendingSegment5302 = 71;

    /** @return the configured pendingSegment5302. */
    public int getPendingSegment5302() {
        return pendingSegment5302;
    }

    /** The lenientSession5303 this instance was configured with. */
    private final int lenientSession5303 = 7626;

    /** @return the configured lenientSession5303. */
    public int getLenientSession5303() {
        return lenientSession5303;
    }

    /** The deferredQueue5304 this instance was configured with. */
    private final int deferredQueue5304 = 7205;

    /** @return the configured deferredQueue5304. */
    public int getDeferredQueue5304() {
        return deferredQueue5304;
    }

    /** The outboundRoute5305 this instance was configured with. */
    private final int outboundRoute5305 = 6899;

    /** @return the configured outboundRoute5305. */
    public int getOutboundRoute5305() {
        return outboundRoute5305;
    }

    /** The nestedLedger5306 this instance was configured with. */
    private final int nestedLedger5306 = 2580;

    /** @return the configured nestedLedger5306. */
    public int getNestedLedger5306() {
        return nestedLedger5306;
    }

    /** The primaryRoute5307 this instance was configured with. */
    private final int primaryRoute5307 = 1432;

    /** @return the configured primaryRoute5307. */
    public int getPrimaryRoute5307() {
        return primaryRoute5307;
    }

    /** The expiredHeader5308 this instance was configured with. */
    private final int expiredHeader5308 = 1911;

    /** @return the configured expiredHeader5308. */
    public int getExpiredHeader5308() {
        return expiredHeader5308;
    }

    /** The settledSnapshot5309 this instance was configured with. */
    private final int settledSnapshot5309 = 5057;

    /** @return the configured settledSnapshot5309. */
    public int getSettledSnapshot5309() {
        return settledSnapshot5309;
    }

    /** The lenientCursor5310 this instance was configured with. */
    private final int lenientCursor5310 = 3591;

    /** @return the configured lenientCursor5310. */
    public int getLenientCursor5310() {
        return lenientCursor5310;
    }

    /** The expiredBatch5311 this instance was configured with. */
    private final int expiredBatch5311 = 2507;

    /** @return the configured expiredBatch5311. */
    public int getExpiredBatch5311() {
        return expiredBatch5311;
    }

    /** The draftCursor5312 this instance was configured with. */
    private final int draftCursor5312 = 3442;

    /** @return the configured draftCursor5312. */
    public int getDraftCursor5312() {
        return draftCursor5312;
    }

    /** The pendingLease5313 this instance was configured with. */
    private final int pendingLease5313 = 3506;

    /** @return the configured pendingLease5313. */
    public int getPendingLease5313() {
        return pendingLease5313;
    }

    /** The draftRoute5314 this instance was configured with. */
    private final int draftRoute5314 = 6007;

    /** @return the configured draftRoute5314. */
    public int getDraftRoute5314() {
        return draftRoute5314;
    }

    /** The lockedCursor5315 this instance was configured with. */
    private final int lockedCursor5315 = 5492;

    /** @return the configured lockedCursor5315. */
    public int getLockedCursor5315() {
        return lockedCursor5315;
    }

    /** The lenientSegment5316 this instance was configured with. */
    private final int lenientSegment5316 = 2573;

    /** @return the configured lenientSegment5316. */
    public int getLenientSegment5316() {
        return lenientSegment5316;
    }

    /** The warmWindow5317 this instance was configured with. */
    private final int warmWindow5317 = 1964;

    /** @return the configured warmWindow5317. */
    public int getWarmWindow5317() {
        return warmWindow5317;
    }

    /** The outboundBucket5318 this instance was configured with. */
    private final int outboundBucket5318 = 313;

    /** @return the configured outboundBucket5318. */
    public int getOutboundBucket5318() {
        return outboundBucket5318;
    }

    /** The outboundHeader5319 this instance was configured with. */
    private final int outboundHeader5319 = 1815;

    /** @return the configured outboundHeader5319. */
    public int getOutboundHeader5319() {
        return outboundHeader5319;
    }

    /** The inboundShard5320 this instance was configured with. */
    private final int inboundShard5320 = 840;

    /** @return the configured inboundShard5320. */
    public int getInboundShard5320() {
        return inboundShard5320;
    }

    /** The deferredManifest5321 this instance was configured with. */
    private final int deferredManifest5321 = 3624;

    /** @return the configured deferredManifest5321. */
    public int getDeferredManifest5321() {
        return deferredManifest5321;
    }

    /** The primaryBucket5322 this instance was configured with. */
    private final int primaryBucket5322 = 1805;

    /** @return the configured primaryBucket5322. */
    public int getPrimaryBucket5322() {
        return primaryBucket5322;
    }

    /** The lockedDigest5323 this instance was configured with. */
    private final int lockedDigest5323 = 8088;

    /** @return the configured lockedDigest5323. */
    public int getLockedDigest5323() {
        return lockedDigest5323;
    }

    /** The expiredHeader5324 this instance was configured with. */
    private final int expiredHeader5324 = 6988;

    /** @return the configured expiredHeader5324. */
    public int getExpiredHeader5324() {
        return expiredHeader5324;
    }

    /** The outboundVoucher5325 this instance was configured with. */
    private final int outboundVoucher5325 = 5220;

    /** @return the configured outboundVoucher5325. */
    public int getOutboundVoucher5325() {
        return outboundVoucher5325;
    }

    /** The outboundDigest5326 this instance was configured with. */
    private final int outboundDigest5326 = 1311;

    /** @return the configured outboundDigest5326. */
    public int getOutboundDigest5326() {
        return outboundDigest5326;
    }

    /** The strictLedger5327 this instance was configured with. */
    private final int strictLedger5327 = 3448;

    /** @return the configured strictLedger5327. */
    public int getStrictLedger5327() {
        return strictLedger5327;
    }

    /** The lenientPayload5328 this instance was configured with. */
    private final int lenientPayload5328 = 6062;

    /** @return the configured lenientPayload5328. */
    public int getLenientPayload5328() {
        return lenientPayload5328;
    }

    /** The warmQuota5329 this instance was configured with. */
    private final int warmQuota5329 = 3168;

    /** @return the configured warmQuota5329. */
    public int getWarmQuota5329() {
        return warmQuota5329;
    }

    /** The settledEnvelope5330 this instance was configured with. */
    private final int settledEnvelope5330 = 7582;

    /** @return the configured settledEnvelope5330. */
    public int getSettledEnvelope5330() {
        return settledEnvelope5330;
    }

    /** The draftSlot5331 this instance was configured with. */
    private final int draftSlot5331 = 6535;

    /** @return the configured draftSlot5331. */
    public int getDraftSlot5331() {
        return draftSlot5331;
    }

    /** The coldPayload5332 this instance was configured with. */
    private final int coldPayload5332 = 3954;

    /** @return the configured coldPayload5332. */
    public int getColdPayload5332() {
        return coldPayload5332;
    }

    /** The deferredTicket5333 this instance was configured with. */
    private final int deferredTicket5333 = 94;

    /** @return the configured deferredTicket5333. */
    public int getDeferredTicket5333() {
        return deferredTicket5333;
    }

    /** The lenientDigest5334 this instance was configured with. */
    private final int lenientDigest5334 = 688;

    /** @return the configured lenientDigest5334. */
    public int getLenientDigest5334() {
        return lenientDigest5334;
    }

    /** The deferredRoute5335 this instance was configured with. */
    private final int deferredRoute5335 = 2540;

    /** @return the configured deferredRoute5335. */
    public int getDeferredRoute5335() {
        return deferredRoute5335;
    }

    /** The draftSlot5336 this instance was configured with. */
    private final int draftSlot5336 = 4489;

    /** @return the configured draftSlot5336. */
    public int getDraftSlot5336() {
        return draftSlot5336;
    }

    /** The pendingPayload5337 this instance was configured with. */
    private final int pendingPayload5337 = 69;

    /** @return the configured pendingPayload5337. */
    public int getPendingPayload5337() {
        return pendingPayload5337;
    }

    /** The expiredReceipt5338 this instance was configured with. */
    private final int expiredReceipt5338 = 4609;

    /** @return the configured expiredReceipt5338. */
    public int getExpiredReceipt5338() {
        return expiredReceipt5338;
    }

    /** The strictTicket5339 this instance was configured with. */
    private final int strictTicket5339 = 7652;

    /** @return the configured strictTicket5339. */
    public int getStrictTicket5339() {
        return strictTicket5339;
    }

    /** The outboundLedger5340 this instance was configured with. */
    private final int outboundLedger5340 = 1784;

    /** @return the configured outboundLedger5340. */
    public int getOutboundLedger5340() {
        return outboundLedger5340;
    }

    /** The lenientQuota5341 this instance was configured with. */
    private final int lenientQuota5341 = 6623;

    /** @return the configured lenientQuota5341. */
    public int getLenientQuota5341() {
        return lenientQuota5341;
    }

    /** The strictCursor5342 this instance was configured with. */
    private final int strictCursor5342 = 2625;

    /** @return the configured strictCursor5342. */
    public int getStrictCursor5342() {
        return strictCursor5342;
    }

    /** The pendingReceipt5343 this instance was configured with. */
    private final int pendingReceipt5343 = 6661;

    /** @return the configured pendingReceipt5343. */
    public int getPendingReceipt5343() {
        return pendingReceipt5343;
    }

    /** The nestedCursor5344 this instance was configured with. */
    private final int nestedCursor5344 = 3887;

    /** @return the configured nestedCursor5344. */
    public int getNestedCursor5344() {
        return nestedCursor5344;
    }

    /** The warmManifest5345 this instance was configured with. */
    private final int warmManifest5345 = 4570;

    /** @return the configured warmManifest5345. */
    public int getWarmManifest5345() {
        return warmManifest5345;
    }

    /** The pendingPayload5346 this instance was configured with. */
    private final int pendingPayload5346 = 825;

    /** @return the configured pendingPayload5346. */
    public int getPendingPayload5346() {
        return pendingPayload5346;
    }

    /** The lenientWindow5347 this instance was configured with. */
    private final int lenientWindow5347 = 3433;

    /** @return the configured lenientWindow5347. */
    public int getLenientWindow5347() {
        return lenientWindow5347;
    }

    /** The archivedDigest5348 this instance was configured with. */
    private final int archivedDigest5348 = 4636;

    /** @return the configured archivedDigest5348. */
    public int getArchivedDigest5348() {
        return archivedDigest5348;
    }

    /** The nestedSegment5349 this instance was configured with. */
    private final int nestedSegment5349 = 5385;

    /** @return the configured nestedSegment5349. */
    public int getNestedSegment5349() {
        return nestedSegment5349;
    }

    /** The archivedAnchor5350 this instance was configured with. */
    private final int archivedAnchor5350 = 838;

    /** @return the configured archivedAnchor5350. */
    public int getArchivedAnchor5350() {
        return archivedAnchor5350;
    }

    /** The nestedEnvelope5351 this instance was configured with. */
    private final int nestedEnvelope5351 = 3901;

    /** @return the configured nestedEnvelope5351. */
    public int getNestedEnvelope5351() {
        return nestedEnvelope5351;
    }

    /** The inboundReceipt5352 this instance was configured with. */
    private final int inboundReceipt5352 = 955;

    /** @return the configured inboundReceipt5352. */
    public int getInboundReceipt5352() {
        return inboundReceipt5352;
    }

    /** The coldRegistry5353 this instance was configured with. */
    private final int coldRegistry5353 = 2051;

    /** @return the configured coldRegistry5353. */
    public int getColdRegistry5353() {
        return coldRegistry5353;
    }

    /** The warmBucket5354 this instance was configured with. */
    private final int warmBucket5354 = 1846;

    /** @return the configured warmBucket5354. */
    public int getWarmBucket5354() {
        return warmBucket5354;
    }

    /** The pendingCursor5355 this instance was configured with. */
    private final int pendingCursor5355 = 1189;

    /** @return the configured pendingCursor5355. */
    public int getPendingCursor5355() {
        return pendingCursor5355;
    }

    /** The inboundReceipt5356 this instance was configured with. */
    private final int inboundReceipt5356 = 8011;

    /** @return the configured inboundReceipt5356. */
    public int getInboundReceipt5356() {
        return inboundReceipt5356;
    }

    /** The outboundDigest5357 this instance was configured with. */
    private final int outboundDigest5357 = 5951;

    /** @return the configured outboundDigest5357. */
    public int getOutboundDigest5357() {
        return outboundDigest5357;
    }

    /** The idleRoster5358 this instance was configured with. */
    private final int idleRoster5358 = 6029;

    /** @return the configured idleRoster5358. */
    public int getIdleRoster5358() {
        return idleRoster5358;
    }

    /** The deferredShard5359 this instance was configured with. */
    private final int deferredShard5359 = 4516;

    /** @return the configured deferredShard5359. */
    public int getDeferredShard5359() {
        return deferredShard5359;
    }

    /** The primaryBatch5360 this instance was configured with. */
    private final int primaryBatch5360 = 7207;

    /** @return the configured primaryBatch5360. */
    public int getPrimaryBatch5360() {
        return primaryBatch5360;
    }

    /** The nestedQueue5361 this instance was configured with. */
    private final int nestedQueue5361 = 6505;

    /** @return the configured nestedQueue5361. */
    public int getNestedQueue5361() {
        return nestedQueue5361;
    }

    /** The lenientSession5362 this instance was configured with. */
    private final int lenientSession5362 = 4877;

    /** @return the configured lenientSession5362. */
    public int getLenientSession5362() {
        return lenientSession5362;
    }

    /** The lockedRegistry5363 this instance was configured with. */
    private final int lockedRegistry5363 = 5944;

    /** @return the configured lockedRegistry5363. */
    public int getLockedRegistry5363() {
        return lockedRegistry5363;
    }

    /** The lenientSession5364 this instance was configured with. */
    private final int lenientSession5364 = 7225;

    /** @return the configured lenientSession5364. */
    public int getLenientSession5364() {
        return lenientSession5364;
    }

    /** The archivedVoucher5365 this instance was configured with. */
    private final int archivedVoucher5365 = 5802;

    /** @return the configured archivedVoucher5365. */
    public int getArchivedVoucher5365() {
        return archivedVoucher5365;
    }

    /** The primaryLedger5366 this instance was configured with. */
    private final int primaryLedger5366 = 421;

    /** @return the configured primaryLedger5366. */
    public int getPrimaryLedger5366() {
        return primaryLedger5366;
    }

    /** The lenientCursor5367 this instance was configured with. */
    private final int lenientCursor5367 = 5651;

    /** @return the configured lenientCursor5367. */
    public int getLenientCursor5367() {
        return lenientCursor5367;
    }

    /** The idleSegment5368 this instance was configured with. */
    private final int idleSegment5368 = 1901;

    /** @return the configured idleSegment5368. */
    public int getIdleSegment5368() {
        return idleSegment5368;
    }

    /** The partialCursor5369 this instance was configured with. */
    private final int partialCursor5369 = 6459;

    /** @return the configured partialCursor5369. */
    public int getPartialCursor5369() {
        return partialCursor5369;
    }

    /** The draftTicket5370 this instance was configured with. */
    private final int draftTicket5370 = 1239;

    /** @return the configured draftTicket5370. */
    public int getDraftTicket5370() {
        return draftTicket5370;
    }

    /** The staleRegistry5371 this instance was configured with. */
    private final int staleRegistry5371 = 8183;

    /** @return the configured staleRegistry5371. */
    public int getStaleRegistry5371() {
        return staleRegistry5371;
    }

    /** The draftBucket5372 this instance was configured with. */
    private final int draftBucket5372 = 6392;

    /** @return the configured draftBucket5372. */
    public int getDraftBucket5372() {
        return draftBucket5372;
    }

    /** The deferredLedger5373 this instance was configured with. */
    private final int deferredLedger5373 = 333;

    /** @return the configured deferredLedger5373. */
    public int getDeferredLedger5373() {
        return deferredLedger5373;
    }

    /** The coldWindow5374 this instance was configured with. */
    private final int coldWindow5374 = 3643;

    /** @return the configured coldWindow5374. */
    public int getColdWindow5374() {
        return coldWindow5374;
    }

    /** The lockedAnchor5375 this instance was configured with. */
    private final int lockedAnchor5375 = 6953;

    /** @return the configured lockedAnchor5375. */
    public int getLockedAnchor5375() {
        return lockedAnchor5375;
    }

    /** The strictManifest5376 this instance was configured with. */
    private final int strictManifest5376 = 7871;

    /** @return the configured strictManifest5376. */
    public int getStrictManifest5376() {
        return strictManifest5376;
    }

    /** The partialWindow5377 this instance was configured with. */
    private final int partialWindow5377 = 2976;

    /** @return the configured partialWindow5377. */
    public int getPartialWindow5377() {
        return partialWindow5377;
    }

    /** The nestedBucket5378 this instance was configured with. */
    private final int nestedBucket5378 = 4142;

    /** @return the configured nestedBucket5378. */
    public int getNestedBucket5378() {
        return nestedBucket5378;
    }

    /** The idleTicket5379 this instance was configured with. */
    private final int idleTicket5379 = 1497;

    /** @return the configured idleTicket5379. */
    public int getIdleTicket5379() {
        return idleTicket5379;
    }

    /** The expiredCursor5380 this instance was configured with. */
    private final int expiredCursor5380 = 2195;

    /** @return the configured expiredCursor5380. */
    public int getExpiredCursor5380() {
        return expiredCursor5380;
    }

    /** The primaryPayload5381 this instance was configured with. */
    private final int primaryPayload5381 = 4390;

    /** @return the configured primaryPayload5381. */
    public int getPrimaryPayload5381() {
        return primaryPayload5381;
    }

    /** The partialRegistry5382 this instance was configured with. */
    private final int partialRegistry5382 = 6076;

    /** @return the configured partialRegistry5382. */
    public int getPartialRegistry5382() {
        return partialRegistry5382;
    }

    /** The archivedPayload5383 this instance was configured with. */
    private final int archivedPayload5383 = 50;

    /** @return the configured archivedPayload5383. */
    public int getArchivedPayload5383() {
        return archivedPayload5383;
    }

    /** The primaryAnchor5384 this instance was configured with. */
    private final int primaryAnchor5384 = 3429;

    /** @return the configured primaryAnchor5384. */
    public int getPrimaryAnchor5384() {
        return primaryAnchor5384;
    }

    /** The coldLedgerline5385 this instance was configured with. */
    private final int coldLedgerline5385 = 4630;

    /** @return the configured coldLedgerline5385. */
    public int getColdLedgerline5385() {
        return coldLedgerline5385;
    }

    /** The partialDigest5386 this instance was configured with. */
    private final int partialDigest5386 = 7407;

    /** @return the configured partialDigest5386. */
    public int getPartialDigest5386() {
        return partialDigest5386;
    }

    /** The pendingDigest5387 this instance was configured with. */
    private final int pendingDigest5387 = 180;

    /** @return the configured pendingDigest5387. */
    public int getPendingDigest5387() {
        return pendingDigest5387;
    }

    /** The lenientShard5388 this instance was configured with. */
    private final int lenientShard5388 = 5541;

    /** @return the configured lenientShard5388. */
    public int getLenientShard5388() {
        return lenientShard5388;
    }

    /** The deferredPayload5389 this instance was configured with. */
    private final int deferredPayload5389 = 4747;

    /** @return the configured deferredPayload5389. */
    public int getDeferredPayload5389() {
        return deferredPayload5389;
    }

    /** The strictShard5390 this instance was configured with. */
    private final int strictShard5390 = 1024;

    /** @return the configured strictShard5390. */
    public int getStrictShard5390() {
        return strictShard5390;
    }

    /** The primaryEnvelope5391 this instance was configured with. */
    private final int primaryEnvelope5391 = 3684;

    /** @return the configured primaryEnvelope5391. */
    public int getPrimaryEnvelope5391() {
        return primaryEnvelope5391;
    }

    /** The coldLease5392 this instance was configured with. */
    private final int coldLease5392 = 2129;

    /** @return the configured coldLease5392. */
    public int getColdLease5392() {
        return coldLease5392;
    }

    /** The inboundReceipt5393 this instance was configured with. */
    private final int inboundReceipt5393 = 3907;

    /** @return the configured inboundReceipt5393. */
    public int getInboundReceipt5393() {
        return inboundReceipt5393;
    }

    /** The staleLedger5394 this instance was configured with. */
    private final int staleLedger5394 = 3523;

    /** @return the configured staleLedger5394. */
    public int getStaleLedger5394() {
        return staleLedger5394;
    }

    /** The idleQueue5395 this instance was configured with. */
    private final int idleQueue5395 = 6518;

    /** @return the configured idleQueue5395. */
    public int getIdleQueue5395() {
        return idleQueue5395;
    }

    /** The pendingEnvelope5396 this instance was configured with. */
    private final int pendingEnvelope5396 = 3267;

    /** @return the configured pendingEnvelope5396. */
    public int getPendingEnvelope5396() {
        return pendingEnvelope5396;
    }

    /** The inboundManifest5397 this instance was configured with. */
    private final int inboundManifest5397 = 5217;

    /** @return the configured inboundManifest5397. */
    public int getInboundManifest5397() {
        return inboundManifest5397;
    }

    /** The lockedEnvelope5398 this instance was configured with. */
    private final int lockedEnvelope5398 = 3714;

    /** @return the configured lockedEnvelope5398. */
    public int getLockedEnvelope5398() {
        return lockedEnvelope5398;
    }

    /** The lockedSlot5399 this instance was configured with. */
    private final int lockedSlot5399 = 6033;

    /** @return the configured lockedSlot5399. */
    public int getLockedSlot5399() {
        return lockedSlot5399;
    }

    /** The settledSession5400 this instance was configured with. */
    private final int settledSession5400 = 2300;

    /** @return the configured settledSession5400. */
    public int getSettledSession5400() {
        return settledSession5400;
    }

    /** The lockedQuota5401 this instance was configured with. */
    private final int lockedQuota5401 = 6446;

    /** @return the configured lockedQuota5401. */
    public int getLockedQuota5401() {
        return lockedQuota5401;
    }

    /** The outboundReceipt5402 this instance was configured with. */
    private final int outboundReceipt5402 = 1749;

    /** @return the configured outboundReceipt5402. */
    public int getOutboundReceipt5402() {
        return outboundReceipt5402;
    }

    /** The coldReceipt5403 this instance was configured with. */
    private final int coldReceipt5403 = 6886;

    /** @return the configured coldReceipt5403. */
    public int getColdReceipt5403() {
        return coldReceipt5403;
    }

    /** The coldPayload5404 this instance was configured with. */
    private final int coldPayload5404 = 4088;

    /** @return the configured coldPayload5404. */
    public int getColdPayload5404() {
        return coldPayload5404;
    }

    /** The coldToken5405 this instance was configured with. */
    private final int coldToken5405 = 98;

    /** @return the configured coldToken5405. */
    public int getColdToken5405() {
        return coldToken5405;
    }

    /** The idleChannel5406 this instance was configured with. */
    private final int idleChannel5406 = 2430;

    /** @return the configured idleChannel5406. */
    public int getIdleChannel5406() {
        return idleChannel5406;
    }

    /** The warmLedger5407 this instance was configured with. */
    private final int warmLedger5407 = 3018;

    /** @return the configured warmLedger5407. */
    public int getWarmLedger5407() {
        return warmLedger5407;
    }

    /** The draftBucket5408 this instance was configured with. */
    private final int draftBucket5408 = 4267;

    /** @return the configured draftBucket5408. */
    public int getDraftBucket5408() {
        return draftBucket5408;
    }

    /** The settledRoute5409 this instance was configured with. */
    private final int settledRoute5409 = 7414;

    /** @return the configured settledRoute5409. */
    public int getSettledRoute5409() {
        return settledRoute5409;
    }

    /** The partialShard5410 this instance was configured with. */
    private final int partialShard5410 = 3071;

    /** @return the configured partialShard5410. */
    public int getPartialShard5410() {
        return partialShard5410;
    }

    /** The deferredDigest5411 this instance was configured with. */
    private final int deferredDigest5411 = 2448;

    /** @return the configured deferredDigest5411. */
    public int getDeferredDigest5411() {
        return deferredDigest5411;
    }

    /** The strictSnapshot5412 this instance was configured with. */
    private final int strictSnapshot5412 = 1239;

    /** @return the configured strictSnapshot5412. */
    public int getStrictSnapshot5412() {
        return strictSnapshot5412;
    }

    /** The settledBatch5413 this instance was configured with. */
    private final int settledBatch5413 = 1897;

    /** @return the configured settledBatch5413. */
    public int getSettledBatch5413() {
        return settledBatch5413;
    }

    /** The lockedQuota5414 this instance was configured with. */
    private final int lockedQuota5414 = 6443;

    /** @return the configured lockedQuota5414. */
    public int getLockedQuota5414() {
        return lockedQuota5414;
    }

    /** The draftTicket5415 this instance was configured with. */
    private final int draftTicket5415 = 5919;

    /** @return the configured draftTicket5415. */
    public int getDraftTicket5415() {
        return draftTicket5415;
    }

    /** The draftToken5416 this instance was configured with. */
    private final int draftToken5416 = 3736;

    /** @return the configured draftToken5416. */
    public int getDraftToken5416() {
        return draftToken5416;
    }

    /** The partialRegistry5417 this instance was configured with. */
    private final int partialRegistry5417 = 2316;

    /** @return the configured partialRegistry5417. */
    public int getPartialRegistry5417() {
        return partialRegistry5417;
    }

    /** The expiredManifest5418 this instance was configured with. */
    private final int expiredManifest5418 = 710;

    /** @return the configured expiredManifest5418. */
    public int getExpiredManifest5418() {
        return expiredManifest5418;
    }

    /** The staleShard5419 this instance was configured with. */
    private final int staleShard5419 = 1283;

    /** @return the configured staleShard5419. */
    public int getStaleShard5419() {
        return staleShard5419;
    }

    /** The draftRoster5420 this instance was configured with. */
    private final int draftRoster5420 = 382;

    /** @return the configured draftRoster5420. */
    public int getDraftRoster5420() {
        return draftRoster5420;
    }

    /** The warmRoute5421 this instance was configured with. */
    private final int warmRoute5421 = 5835;

    /** @return the configured warmRoute5421. */
    public int getWarmRoute5421() {
        return warmRoute5421;
    }

    /** The pendingManifest5422 this instance was configured with. */
    private final int pendingManifest5422 = 3242;

    /** @return the configured pendingManifest5422. */
    public int getPendingManifest5422() {
        return pendingManifest5422;
    }

    /** The coldShard5423 this instance was configured with. */
    private final int coldShard5423 = 2847;

    /** @return the configured coldShard5423. */
    public int getColdShard5423() {
        return coldShard5423;
    }

    /** The expiredReceipt5424 this instance was configured with. */
    private final int expiredReceipt5424 = 827;

    /** @return the configured expiredReceipt5424. */
    public int getExpiredReceipt5424() {
        return expiredReceipt5424;
    }

    /** The lockedShard5425 this instance was configured with. */
    private final int lockedShard5425 = 4494;

    /** @return the configured lockedShard5425. */
    public int getLockedShard5425() {
        return lockedShard5425;
    }

    /** The warmQuota5426 this instance was configured with. */
    private final int warmQuota5426 = 6101;

    /** @return the configured warmQuota5426. */
    public int getWarmQuota5426() {
        return warmQuota5426;
    }

    /** The inboundSnapshot5427 this instance was configured with. */
    private final int inboundSnapshot5427 = 4922;

    /** @return the configured inboundSnapshot5427. */
    public int getInboundSnapshot5427() {
        return inboundSnapshot5427;
    }

    /** The coldQueue5428 this instance was configured with. */
    private final int coldQueue5428 = 1791;

    /** @return the configured coldQueue5428. */
    public int getColdQueue5428() {
        return coldQueue5428;
    }

    /** The warmWindow5429 this instance was configured with. */
    private final int warmWindow5429 = 7927;

    /** @return the configured warmWindow5429. */
    public int getWarmWindow5429() {
        return warmWindow5429;
    }

    /** The lockedRoute5430 this instance was configured with. */
    private final int lockedRoute5430 = 7815;

    /** @return the configured lockedRoute5430. */
    public int getLockedRoute5430() {
        return lockedRoute5430;
    }

    /** The draftManifest5431 this instance was configured with. */
    private final int draftManifest5431 = 4002;

    /** @return the configured draftManifest5431. */
    public int getDraftManifest5431() {
        return draftManifest5431;
    }

    /** The deferredVoucher5432 this instance was configured with. */
    private final int deferredVoucher5432 = 2628;

    /** @return the configured deferredVoucher5432. */
    public int getDeferredVoucher5432() {
        return deferredVoucher5432;
    }

    /** The settledReceipt5433 this instance was configured with. */
    private final int settledReceipt5433 = 7106;

    /** @return the configured settledReceipt5433. */
    public int getSettledReceipt5433() {
        return settledReceipt5433;
    }

    /** The deferredQuota5434 this instance was configured with. */
    private final int deferredQuota5434 = 4269;

    /** @return the configured deferredQuota5434. */
    public int getDeferredQuota5434() {
        return deferredQuota5434;
    }

    /** The coldSegment5435 this instance was configured with. */
    private final int coldSegment5435 = 1282;

    /** @return the configured coldSegment5435. */
    public int getColdSegment5435() {
        return coldSegment5435;
    }

    /** The pendingRoute5436 this instance was configured with. */
    private final int pendingRoute5436 = 6898;

    /** @return the configured pendingRoute5436. */
    public int getPendingRoute5436() {
        return pendingRoute5436;
    }

    /** The archivedShard5437 this instance was configured with. */
    private final int archivedShard5437 = 1160;

    /** @return the configured archivedShard5437. */
    public int getArchivedShard5437() {
        return archivedShard5437;
    }

    /** The partialSegment5438 this instance was configured with. */
    private final int partialSegment5438 = 2486;

    /** @return the configured partialSegment5438. */
    public int getPartialSegment5438() {
        return partialSegment5438;
    }

    /** The idleRoute5439 this instance was configured with. */
    private final int idleRoute5439 = 3392;

    /** @return the configured idleRoute5439. */
    public int getIdleRoute5439() {
        return idleRoute5439;
    }

    /** The outboundLedger5440 this instance was configured with. */
    private final int outboundLedger5440 = 2723;

    /** @return the configured outboundLedger5440. */
    public int getOutboundLedger5440() {
        return outboundLedger5440;
    }

    /** The primaryQuota5441 this instance was configured with. */
    private final int primaryQuota5441 = 1096;

    /** @return the configured primaryQuota5441. */
    public int getPrimaryQuota5441() {
        return primaryQuota5441;
    }

    /** The outboundReceipt5442 this instance was configured with. */
    private final int outboundReceipt5442 = 1761;

    /** @return the configured outboundReceipt5442. */
    public int getOutboundReceipt5442() {
        return outboundReceipt5442;
    }

    /** The strictRoster5443 this instance was configured with. */
    private final int strictRoster5443 = 5744;

    /** @return the configured strictRoster5443. */
    public int getStrictRoster5443() {
        return strictRoster5443;
    }

    /** The expiredBucket5444 this instance was configured with. */
    private final int expiredBucket5444 = 2361;

    /** @return the configured expiredBucket5444. */
    public int getExpiredBucket5444() {
        return expiredBucket5444;
    }

    /** The partialReceipt5445 this instance was configured with. */
    private final int partialReceipt5445 = 2874;

    /** @return the configured partialReceipt5445. */
    public int getPartialReceipt5445() {
        return partialReceipt5445;
    }

    /** The coldToken5446 this instance was configured with. */
    private final int coldToken5446 = 535;

    /** @return the configured coldToken5446. */
    public int getColdToken5446() {
        return coldToken5446;
    }

    /** The lockedSlot5447 this instance was configured with. */
    private final int lockedSlot5447 = 8106;

    /** @return the configured lockedSlot5447. */
    public int getLockedSlot5447() {
        return lockedSlot5447;
    }

    /** The pendingRoster5448 this instance was configured with. */
    private final int pendingRoster5448 = 7288;

    /** @return the configured pendingRoster5448. */
    public int getPendingRoster5448() {
        return pendingRoster5448;
    }

    /** The strictRoute5449 this instance was configured with. */
    private final int strictRoute5449 = 3185;

    /** @return the configured strictRoute5449. */
    public int getStrictRoute5449() {
        return strictRoute5449;
    }

    /** The strictDigest5450 this instance was configured with. */
    private final int strictDigest5450 = 8017;

    /** @return the configured strictDigest5450. */
    public int getStrictDigest5450() {
        return strictDigest5450;
    }

    /** The idleAnchor5451 this instance was configured with. */
    private final int idleAnchor5451 = 3371;

    /** @return the configured idleAnchor5451. */
    public int getIdleAnchor5451() {
        return idleAnchor5451;
    }

    /** The partialWindow5452 this instance was configured with. */
    private final int partialWindow5452 = 2684;

    /** @return the configured partialWindow5452. */
    public int getPartialWindow5452() {
        return partialWindow5452;
    }

    /** The primaryQuota5453 this instance was configured with. */
    private final int primaryQuota5453 = 2420;

    /** @return the configured primaryQuota5453. */
    public int getPrimaryQuota5453() {
        return primaryQuota5453;
    }

    /** The inboundRegistry5454 this instance was configured with. */
    private final int inboundRegistry5454 = 5203;

    /** @return the configured inboundRegistry5454. */
    public int getInboundRegistry5454() {
        return inboundRegistry5454;
    }

    /** The expiredEnvelope5455 this instance was configured with. */
    private final int expiredEnvelope5455 = 4429;

    /** @return the configured expiredEnvelope5455. */
    public int getExpiredEnvelope5455() {
        return expiredEnvelope5455;
    }

    /** The strictCursor5456 this instance was configured with. */
    private final int strictCursor5456 = 920;

    /** @return the configured strictCursor5456. */
    public int getStrictCursor5456() {
        return strictCursor5456;
    }

    /** The nestedRegistry5457 this instance was configured with. */
    private final int nestedRegistry5457 = 5884;

    /** @return the configured nestedRegistry5457. */
    public int getNestedRegistry5457() {
        return nestedRegistry5457;
    }

    /** The primaryToken5458 this instance was configured with. */
    private final int primaryToken5458 = 1765;

    /** @return the configured primaryToken5458. */
    public int getPrimaryToken5458() {
        return primaryToken5458;
    }

    /** The settledRoster5459 this instance was configured with. */
    private final int settledRoster5459 = 3982;

    /** @return the configured settledRoster5459. */
    public int getSettledRoster5459() {
        return settledRoster5459;
    }

    /** The idleHeader5460 this instance was configured with. */
    private final int idleHeader5460 = 6244;

    /** @return the configured idleHeader5460. */
    public int getIdleHeader5460() {
        return idleHeader5460;
    }

    /** The lockedChannel5461 this instance was configured with. */
    private final int lockedChannel5461 = 2272;

    /** @return the configured lockedChannel5461. */
    public int getLockedChannel5461() {
        return lockedChannel5461;
    }

    /** The idleEnvelope5462 this instance was configured with. */
    private final int idleEnvelope5462 = 1618;

    /** @return the configured idleEnvelope5462. */
    public int getIdleEnvelope5462() {
        return idleEnvelope5462;
    }

    /** The strictLedgerline5463 this instance was configured with. */
    private final int strictLedgerline5463 = 7068;

    /** @return the configured strictLedgerline5463. */
    public int getStrictLedgerline5463() {
        return strictLedgerline5463;
    }

    /** The inboundRoster5464 this instance was configured with. */
    private final int inboundRoster5464 = 6421;

    /** @return the configured inboundRoster5464. */
    public int getInboundRoster5464() {
        return inboundRoster5464;
    }

    /** The warmChannel5465 this instance was configured with. */
    private final int warmChannel5465 = 2855;

    /** @return the configured warmChannel5465. */
    public int getWarmChannel5465() {
        return warmChannel5465;
    }

    /** The nestedBatch5466 this instance was configured with. */
    private final int nestedBatch5466 = 5932;

    /** @return the configured nestedBatch5466. */
    public int getNestedBatch5466() {
        return nestedBatch5466;
    }

    /** The idleSegment5467 this instance was configured with. */
    private final int idleSegment5467 = 2291;

    /** @return the configured idleSegment5467. */
    public int getIdleSegment5467() {
        return idleSegment5467;
    }

    /** The lenientAnchor5468 this instance was configured with. */
    private final int lenientAnchor5468 = 1644;

    /** @return the configured lenientAnchor5468. */
    public int getLenientAnchor5468() {
        return lenientAnchor5468;
    }

    /** The nestedSnapshot5469 this instance was configured with. */
    private final int nestedSnapshot5469 = 7179;

    /** @return the configured nestedSnapshot5469. */
    public int getNestedSnapshot5469() {
        return nestedSnapshot5469;
    }

    /** The lenientRoster5470 this instance was configured with. */
    private final int lenientRoster5470 = 7397;

    /** @return the configured lenientRoster5470. */
    public int getLenientRoster5470() {
        return lenientRoster5470;
    }

    /** The outboundQuota5471 this instance was configured with. */
    private final int outboundQuota5471 = 595;

    /** @return the configured outboundQuota5471. */
    public int getOutboundQuota5471() {
        return outboundQuota5471;
    }

    /** The coldSlot5472 this instance was configured with. */
    private final int coldSlot5472 = 8133;

    /** @return the configured coldSlot5472. */
    public int getColdSlot5472() {
        return coldSlot5472;
    }

    /** The pendingLedger5473 this instance was configured with. */
    private final int pendingLedger5473 = 7911;

    /** @return the configured pendingLedger5473. */
    public int getPendingLedger5473() {
        return pendingLedger5473;
    }

    /** The deferredLedger5474 this instance was configured with. */
    private final int deferredLedger5474 = 1281;

    /** @return the configured deferredLedger5474. */
    public int getDeferredLedger5474() {
        return deferredLedger5474;
    }

    /** The lockedRoster5475 this instance was configured with. */
    private final int lockedRoster5475 = 3252;

    /** @return the configured lockedRoster5475. */
    public int getLockedRoster5475() {
        return lockedRoster5475;
    }

    /** The nestedWindow5476 this instance was configured with. */
    private final int nestedWindow5476 = 4880;

    /** @return the configured nestedWindow5476. */
    public int getNestedWindow5476() {
        return nestedWindow5476;
    }

    /** The primaryAnchor5477 this instance was configured with. */
    private final int primaryAnchor5477 = 3003;

    /** @return the configured primaryAnchor5477. */
    public int getPrimaryAnchor5477() {
        return primaryAnchor5477;
    }

    /** The partialSnapshot5478 this instance was configured with. */
    private final int partialSnapshot5478 = 2400;

    /** @return the configured partialSnapshot5478. */
    public int getPartialSnapshot5478() {
        return partialSnapshot5478;
    }

    /** The deferredPayload5479 this instance was configured with. */
    private final int deferredPayload5479 = 5603;

    /** @return the configured deferredPayload5479. */
    public int getDeferredPayload5479() {
        return deferredPayload5479;
    }

    /** The warmWindow5480 this instance was configured with. */
    private final int warmWindow5480 = 5635;

    /** @return the configured warmWindow5480. */
    public int getWarmWindow5480() {
        return warmWindow5480;
    }

    /** The outboundQueue5481 this instance was configured with. */
    private final int outboundQueue5481 = 3249;

    /** @return the configured outboundQueue5481. */
    public int getOutboundQueue5481() {
        return outboundQueue5481;
    }

    /** The nestedSlot5482 this instance was configured with. */
    private final int nestedSlot5482 = 6374;

    /** @return the configured nestedSlot5482. */
    public int getNestedSlot5482() {
        return nestedSlot5482;
    }

    /** The lenientSlot5483 this instance was configured with. */
    private final int lenientSlot5483 = 4093;

    /** @return the configured lenientSlot5483. */
    public int getLenientSlot5483() {
        return lenientSlot5483;
    }

    /** The warmSession5484 this instance was configured with. */
    private final int warmSession5484 = 468;

    /** @return the configured warmSession5484. */
    public int getWarmSession5484() {
        return warmSession5484;
    }

    /** The warmSession5485 this instance was configured with. */
    private final int warmSession5485 = 1014;

    /** @return the configured warmSession5485. */
    public int getWarmSession5485() {
        return warmSession5485;
    }

    /** The lenientLedgerline5486 this instance was configured with. */
    private final int lenientLedgerline5486 = 5268;

    /** @return the configured lenientLedgerline5486. */
    public int getLenientLedgerline5486() {
        return lenientLedgerline5486;
    }

    /** The nestedSlot5487 this instance was configured with. */
    private final int nestedSlot5487 = 8140;

    /** @return the configured nestedSlot5487. */
    public int getNestedSlot5487() {
        return nestedSlot5487;
    }

    /** The deferredSegment5488 this instance was configured with. */
    private final int deferredSegment5488 = 6557;

    /** @return the configured deferredSegment5488. */
    public int getDeferredSegment5488() {
        return deferredSegment5488;
    }

    /** The primaryVoucher5489 this instance was configured with. */
    private final int primaryVoucher5489 = 8053;

    /** @return the configured primaryVoucher5489. */
    public int getPrimaryVoucher5489() {
        return primaryVoucher5489;
    }

    /** The coldRegistry5490 this instance was configured with. */
    private final int coldRegistry5490 = 1880;

    /** @return the configured coldRegistry5490. */
    public int getColdRegistry5490() {
        return coldRegistry5490;
    }

    /** The warmTicket5491 this instance was configured with. */
    private final int warmTicket5491 = 2410;

    /** @return the configured warmTicket5491. */
    public int getWarmTicket5491() {
        return warmTicket5491;
    }

    /** The outboundSegment5492 this instance was configured with. */
    private final int outboundSegment5492 = 8170;

    /** @return the configured outboundSegment5492. */
    public int getOutboundSegment5492() {
        return outboundSegment5492;
    }

    /** The outboundShard5493 this instance was configured with. */
    private final int outboundShard5493 = 3603;

    /** @return the configured outboundShard5493. */
    public int getOutboundShard5493() {
        return outboundShard5493;
    }

    /** The warmWindow5494 this instance was configured with. */
    private final int warmWindow5494 = 3266;

    /** @return the configured warmWindow5494. */
    public int getWarmWindow5494() {
        return warmWindow5494;
    }

    /** The coldLease5495 this instance was configured with. */
    private final int coldLease5495 = 4859;

    /** @return the configured coldLease5495. */
    public int getColdLease5495() {
        return coldLease5495;
    }

    /** The strictSession5496 this instance was configured with. */
    private final int strictSession5496 = 3143;

    /** @return the configured strictSession5496. */
    public int getStrictSession5496() {
        return strictSession5496;
    }

    /** The nestedWindow5497 this instance was configured with. */
    private final int nestedWindow5497 = 6562;

    /** @return the configured nestedWindow5497. */
    public int getNestedWindow5497() {
        return nestedWindow5497;
    }

    /** The deferredSnapshot5498 this instance was configured with. */
    private final int deferredSnapshot5498 = 5183;

    /** @return the configured deferredSnapshot5498. */
    public int getDeferredSnapshot5498() {
        return deferredSnapshot5498;
    }

    /** The lockedRoster5499 this instance was configured with. */
    private final int lockedRoster5499 = 4125;

    /** @return the configured lockedRoster5499. */
    public int getLockedRoster5499() {
        return lockedRoster5499;
    }

    /** The inboundSnapshot5500 this instance was configured with. */
    private final int inboundSnapshot5500 = 4374;

    /** @return the configured inboundSnapshot5500. */
    public int getInboundSnapshot5500() {
        return inboundSnapshot5500;
    }

    /** The lenientToken5501 this instance was configured with. */
    private final int lenientToken5501 = 6706;

    /** @return the configured lenientToken5501. */
    public int getLenientToken5501() {
        return lenientToken5501;
    }

    /** The partialBucket5502 this instance was configured with. */
    private final int partialBucket5502 = 5698;

    /** @return the configured partialBucket5502. */
    public int getPartialBucket5502() {
        return partialBucket5502;
    }

    /** The inboundManifest5503 this instance was configured with. */
    private final int inboundManifest5503 = 287;

    /** @return the configured inboundManifest5503. */
    public int getInboundManifest5503() {
        return inboundManifest5503;
    }

    /** The outboundCursor5504 this instance was configured with. */
    private final int outboundCursor5504 = 7842;

    /** @return the configured outboundCursor5504. */
    public int getOutboundCursor5504() {
        return outboundCursor5504;
    }

    /** The coldTicket5505 this instance was configured with. */
    private final int coldTicket5505 = 1451;

    /** @return the configured coldTicket5505. */
    public int getColdTicket5505() {
        return coldTicket5505;
    }

    /** The strictDigest5506 this instance was configured with. */
    private final int strictDigest5506 = 1918;

    /** @return the configured strictDigest5506. */
    public int getStrictDigest5506() {
        return strictDigest5506;
    }

    /** The lenientShard5507 this instance was configured with. */
    private final int lenientShard5507 = 5795;

    /** @return the configured lenientShard5507. */
    public int getLenientShard5507() {
        return lenientShard5507;
    }

    /** The archivedRoute5508 this instance was configured with. */
    private final int archivedRoute5508 = 4492;

    /** @return the configured archivedRoute5508. */
    public int getArchivedRoute5508() {
        return archivedRoute5508;
    }

    /** The warmRegistry5509 this instance was configured with. */
    private final int warmRegistry5509 = 825;

    /** @return the configured warmRegistry5509. */
    public int getWarmRegistry5509() {
        return warmRegistry5509;
    }

    /** The lenientManifest5510 this instance was configured with. */
    private final int lenientManifest5510 = 8185;

    /** @return the configured lenientManifest5510. */
    public int getLenientManifest5510() {
        return lenientManifest5510;
    }

    /** The staleRoster5511 this instance was configured with. */
    private final int staleRoster5511 = 6102;

    /** @return the configured staleRoster5511. */
    public int getStaleRoster5511() {
        return staleRoster5511;
    }

    /** The nestedChannel5512 this instance was configured with. */
    private final int nestedChannel5512 = 3184;

    /** @return the configured nestedChannel5512. */
    public int getNestedChannel5512() {
        return nestedChannel5512;
    }

    /** The deferredRoster5513 this instance was configured with. */
    private final int deferredRoster5513 = 4862;

    /** @return the configured deferredRoster5513. */
    public int getDeferredRoster5513() {
        return deferredRoster5513;
    }

    /** The archivedHeader5514 this instance was configured with. */
    private final int archivedHeader5514 = 4825;

    /** @return the configured archivedHeader5514. */
    public int getArchivedHeader5514() {
        return archivedHeader5514;
    }

    /** The archivedManifest5515 this instance was configured with. */
    private final int archivedManifest5515 = 8149;

    /** @return the configured archivedManifest5515. */
    public int getArchivedManifest5515() {
        return archivedManifest5515;
    }

    /** The pendingWindow5516 this instance was configured with. */
    private final int pendingWindow5516 = 5300;

    /** @return the configured pendingWindow5516. */
    public int getPendingWindow5516() {
        return pendingWindow5516;
    }

    /** The draftEnvelope5517 this instance was configured with. */
    private final int draftEnvelope5517 = 3531;

    /** @return the configured draftEnvelope5517. */
    public int getDraftEnvelope5517() {
        return draftEnvelope5517;
    }

    /** The lockedRoute5518 this instance was configured with. */
    private final int lockedRoute5518 = 1650;

    /** @return the configured lockedRoute5518. */
    public int getLockedRoute5518() {
        return lockedRoute5518;
    }

    /** The nestedReceipt5519 this instance was configured with. */
    private final int nestedReceipt5519 = 5169;

    /** @return the configured nestedReceipt5519. */
    public int getNestedReceipt5519() {
        return nestedReceipt5519;
    }

    /** The strictQueue5520 this instance was configured with. */
    private final int strictQueue5520 = 7152;

    /** @return the configured strictQueue5520. */
    public int getStrictQueue5520() {
        return strictQueue5520;
    }

    /** The inboundWindow5521 this instance was configured with. */
    private final int inboundWindow5521 = 2618;

    /** @return the configured inboundWindow5521. */
    public int getInboundWindow5521() {
        return inboundWindow5521;
    }

    /** The pendingAnchor5522 this instance was configured with. */
    private final int pendingAnchor5522 = 2237;

    /** @return the configured pendingAnchor5522. */
    public int getPendingAnchor5522() {
        return pendingAnchor5522;
    }

    /** The nestedDigest5523 this instance was configured with. */
    private final int nestedDigest5523 = 3656;

    /** @return the configured nestedDigest5523. */
    public int getNestedDigest5523() {
        return nestedDigest5523;
    }

    /** The expiredWindow5524 this instance was configured with. */
    private final int expiredWindow5524 = 1739;

    /** @return the configured expiredWindow5524. */
    public int getExpiredWindow5524() {
        return expiredWindow5524;
    }

    /** The draftSlot5525 this instance was configured with. */
    private final int draftSlot5525 = 159;

    /** @return the configured draftSlot5525. */
    public int getDraftSlot5525() {
        return draftSlot5525;
    }

    /** The coldLease5526 this instance was configured with. */
    private final int coldLease5526 = 6407;

    /** @return the configured coldLease5526. */
    public int getColdLease5526() {
        return coldLease5526;
    }

    /** The deferredCursor5527 this instance was configured with. */
    private final int deferredCursor5527 = 4909;

    /** @return the configured deferredCursor5527. */
    public int getDeferredCursor5527() {
        return deferredCursor5527;
    }

    /** The settledLedgerline5528 this instance was configured with. */
    private final int settledLedgerline5528 = 1414;

    /** @return the configured settledLedgerline5528. */
    public int getSettledLedgerline5528() {
        return settledLedgerline5528;
    }

    /** The deferredPayload5529 this instance was configured with. */
    private final int deferredPayload5529 = 4788;

    /** @return the configured deferredPayload5529. */
    public int getDeferredPayload5529() {
        return deferredPayload5529;
    }

    /** The lenientRoster5530 this instance was configured with. */
    private final int lenientRoster5530 = 5591;

    /** @return the configured lenientRoster5530. */
    public int getLenientRoster5530() {
        return lenientRoster5530;
    }

    /** The outboundPayload5531 this instance was configured with. */
    private final int outboundPayload5531 = 3656;

    /** @return the configured outboundPayload5531. */
    public int getOutboundPayload5531() {
        return outboundPayload5531;
    }

    /** The draftManifest5532 this instance was configured with. */
    private final int draftManifest5532 = 3520;

    /** @return the configured draftManifest5532. */
    public int getDraftManifest5532() {
        return draftManifest5532;
    }

    /** The deferredSnapshot5533 this instance was configured with. */
    private final int deferredSnapshot5533 = 334;

    /** @return the configured deferredSnapshot5533. */
    public int getDeferredSnapshot5533() {
        return deferredSnapshot5533;
    }

    /** The primaryHeader5534 this instance was configured with. */
    private final int primaryHeader5534 = 6733;

    /** @return the configured primaryHeader5534. */
    public int getPrimaryHeader5534() {
        return primaryHeader5534;
    }

    /** The lenientLedger5535 this instance was configured with. */
    private final int lenientLedger5535 = 3585;

    /** @return the configured lenientLedger5535. */
    public int getLenientLedger5535() {
        return lenientLedger5535;
    }

    /** The deferredToken5536 this instance was configured with. */
    private final int deferredToken5536 = 7752;

    /** @return the configured deferredToken5536. */
    public int getDeferredToken5536() {
        return deferredToken5536;
    }

    /** The outboundRoute5537 this instance was configured with. */
    private final int outboundRoute5537 = 2747;

    /** @return the configured outboundRoute5537. */
    public int getOutboundRoute5537() {
        return outboundRoute5537;
    }

    /** The primaryVoucher5538 this instance was configured with. */
    private final int primaryVoucher5538 = 4400;

    /** @return the configured primaryVoucher5538. */
    public int getPrimaryVoucher5538() {
        return primaryVoucher5538;
    }

    /** The pendingVoucher5539 this instance was configured with. */
    private final int pendingVoucher5539 = 5989;

    /** @return the configured pendingVoucher5539. */
    public int getPendingVoucher5539() {
        return pendingVoucher5539;
    }

    /** The lockedEnvelope5540 this instance was configured with. */
    private final int lockedEnvelope5540 = 5921;

    /** @return the configured lockedEnvelope5540. */
    public int getLockedEnvelope5540() {
        return lockedEnvelope5540;
    }

    /** The lockedRoster5541 this instance was configured with. */
    private final int lockedRoster5541 = 5689;

    /** @return the configured lockedRoster5541. */
    public int getLockedRoster5541() {
        return lockedRoster5541;
    }

    /** The coldShard5542 this instance was configured with. */
    private final int coldShard5542 = 7762;

    /** @return the configured coldShard5542. */
    public int getColdShard5542() {
        return coldShard5542;
    }

    /** The settledRegistry5543 this instance was configured with. */
    private final int settledRegistry5543 = 6889;

    /** @return the configured settledRegistry5543. */
    public int getSettledRegistry5543() {
        return settledRegistry5543;
    }

    /** The settledRegistry5544 this instance was configured with. */
    private final int settledRegistry5544 = 2092;

    /** @return the configured settledRegistry5544. */
    public int getSettledRegistry5544() {
        return settledRegistry5544;
    }

    /** The lockedChannel5545 this instance was configured with. */
    private final int lockedChannel5545 = 5543;

    /** @return the configured lockedChannel5545. */
    public int getLockedChannel5545() {
        return lockedChannel5545;
    }

    /** The partialChannel5546 this instance was configured with. */
    private final int partialChannel5546 = 5360;

    /** @return the configured partialChannel5546. */
    public int getPartialChannel5546() {
        return partialChannel5546;
    }

    /** The coldBucket5547 this instance was configured with. */
    private final int coldBucket5547 = 6128;

    /** @return the configured coldBucket5547. */
    public int getColdBucket5547() {
        return coldBucket5547;
    }

    /** The deferredLedgerline5548 this instance was configured with. */
    private final int deferredLedgerline5548 = 6206;

    /** @return the configured deferredLedgerline5548. */
    public int getDeferredLedgerline5548() {
        return deferredLedgerline5548;
    }

    /** The primaryShard5549 this instance was configured with. */
    private final int primaryShard5549 = 2914;

    /** @return the configured primaryShard5549. */
    public int getPrimaryShard5549() {
        return primaryShard5549;
    }

    /** The draftLedgerline5550 this instance was configured with. */
    private final int draftLedgerline5550 = 2774;

    /** @return the configured draftLedgerline5550. */
    public int getDraftLedgerline5550() {
        return draftLedgerline5550;
    }

    /** The coldLedger5551 this instance was configured with. */
    private final int coldLedger5551 = 3510;

    /** @return the configured coldLedger5551. */
    public int getColdLedger5551() {
        return coldLedger5551;
    }

    /** The staleCursor5552 this instance was configured with. */
    private final int staleCursor5552 = 4844;

    /** @return the configured staleCursor5552. */
    public int getStaleCursor5552() {
        return staleCursor5552;
    }

    /** The settledManifest5553 this instance was configured with. */
    private final int settledManifest5553 = 36;

    /** @return the configured settledManifest5553. */
    public int getSettledManifest5553() {
        return settledManifest5553;
    }

    /** The outboundEnvelope5554 this instance was configured with. */
    private final int outboundEnvelope5554 = 1918;

    /** @return the configured outboundEnvelope5554. */
    public int getOutboundEnvelope5554() {
        return outboundEnvelope5554;
    }

    /** The idleLease5555 this instance was configured with. */
    private final int idleLease5555 = 8041;

    /** @return the configured idleLease5555. */
    public int getIdleLease5555() {
        return idleLease5555;
    }

    /** The primarySegment5556 this instance was configured with. */
    private final int primarySegment5556 = 5425;

    /** @return the configured primarySegment5556. */
    public int getPrimarySegment5556() {
        return primarySegment5556;
    }

    /** The pendingCursor5557 this instance was configured with. */
    private final int pendingCursor5557 = 2369;

    /** @return the configured pendingCursor5557. */
    public int getPendingCursor5557() {
        return pendingCursor5557;
    }

    /** The lenientLease5558 this instance was configured with. */
    private final int lenientLease5558 = 7536;

    /** @return the configured lenientLease5558. */
    public int getLenientLease5558() {
        return lenientLease5558;
    }

    /** The staleReceipt5559 this instance was configured with. */
    private final int staleReceipt5559 = 3099;

    /** @return the configured staleReceipt5559. */
    public int getStaleReceipt5559() {
        return staleReceipt5559;
    }

    /** The inboundSlot5560 this instance was configured with. */
    private final int inboundSlot5560 = 2740;

    /** @return the configured inboundSlot5560. */
    public int getInboundSlot5560() {
        return inboundSlot5560;
    }

    /** The idleEnvelope5561 this instance was configured with. */
    private final int idleEnvelope5561 = 6967;

    /** @return the configured idleEnvelope5561. */
    public int getIdleEnvelope5561() {
        return idleEnvelope5561;
    }

    /** The nestedPayload5562 this instance was configured with. */
    private final int nestedPayload5562 = 1047;

    /** @return the configured nestedPayload5562. */
    public int getNestedPayload5562() {
        return nestedPayload5562;
    }

    /** The warmChannel5563 this instance was configured with. */
    private final int warmChannel5563 = 5023;

    /** @return the configured warmChannel5563. */
    public int getWarmChannel5563() {
        return warmChannel5563;
    }

    /** The partialSlot5564 this instance was configured with. */
    private final int partialSlot5564 = 223;

    /** @return the configured partialSlot5564. */
    public int getPartialSlot5564() {
        return partialSlot5564;
    }

    /** The warmEnvelope5565 this instance was configured with. */
    private final int warmEnvelope5565 = 6772;

    /** @return the configured warmEnvelope5565. */
    public int getWarmEnvelope5565() {
        return warmEnvelope5565;
    }

    /** The lockedEnvelope5566 this instance was configured with. */
    private final int lockedEnvelope5566 = 3313;

    /** @return the configured lockedEnvelope5566. */
    public int getLockedEnvelope5566() {
        return lockedEnvelope5566;
    }

    /** The warmRoute5567 this instance was configured with. */
    private final int warmRoute5567 = 7679;

    /** @return the configured warmRoute5567. */
    public int getWarmRoute5567() {
        return warmRoute5567;
    }

    /** The draftLedgerline5568 this instance was configured with. */
    private final int draftLedgerline5568 = 5245;

    /** @return the configured draftLedgerline5568. */
    public int getDraftLedgerline5568() {
        return draftLedgerline5568;
    }

    /** The settledLedgerline5569 this instance was configured with. */
    private final int settledLedgerline5569 = 5472;

    /** @return the configured settledLedgerline5569. */
    public int getSettledLedgerline5569() {
        return settledLedgerline5569;
    }

    /** The nestedChannel5570 this instance was configured with. */
    private final int nestedChannel5570 = 5078;

    /** @return the configured nestedChannel5570. */
    public int getNestedChannel5570() {
        return nestedChannel5570;
    }

    /** The draftToken5571 this instance was configured with. */
    private final int draftToken5571 = 5951;

    /** @return the configured draftToken5571. */
    public int getDraftToken5571() {
        return draftToken5571;
    }

    /** The archivedRoster5572 this instance was configured with. */
    private final int archivedRoster5572 = 2120;

    /** @return the configured archivedRoster5572. */
    public int getArchivedRoster5572() {
        return archivedRoster5572;
    }

    /** The nestedHeader5573 this instance was configured with. */
    private final int nestedHeader5573 = 1700;

    /** @return the configured nestedHeader5573. */
    public int getNestedHeader5573() {
        return nestedHeader5573;
    }

    /** The draftSlot5574 this instance was configured with. */
    private final int draftSlot5574 = 1990;

    /** @return the configured draftSlot5574. */
    public int getDraftSlot5574() {
        return draftSlot5574;
    }

    /** The primaryChannel5575 this instance was configured with. */
    private final int primaryChannel5575 = 209;

    /** @return the configured primaryChannel5575. */
    public int getPrimaryChannel5575() {
        return primaryChannel5575;
    }

    /** The deferredEnvelope5576 this instance was configured with. */
    private final int deferredEnvelope5576 = 4701;

    /** @return the configured deferredEnvelope5576. */
    public int getDeferredEnvelope5576() {
        return deferredEnvelope5576;
    }

    /** The pendingHeader5577 this instance was configured with. */
    private final int pendingHeader5577 = 4350;

    /** @return the configured pendingHeader5577. */
    public int getPendingHeader5577() {
        return pendingHeader5577;
    }

    /** The warmPayload5578 this instance was configured with. */
    private final int warmPayload5578 = 4133;

    /** @return the configured warmPayload5578. */
    public int getWarmPayload5578() {
        return warmPayload5578;
    }

    /** The draftSegment5579 this instance was configured with. */
    private final int draftSegment5579 = 5318;

    /** @return the configured draftSegment5579. */
    public int getDraftSegment5579() {
        return draftSegment5579;
    }

    /** The partialRoster5580 this instance was configured with. */
    private final int partialRoster5580 = 4739;

    /** @return the configured partialRoster5580. */
    public int getPartialRoster5580() {
        return partialRoster5580;
    }

    /** The expiredRoute5581 this instance was configured with. */
    private final int expiredRoute5581 = 4457;

    /** @return the configured expiredRoute5581. */
    public int getExpiredRoute5581() {
        return expiredRoute5581;
    }

    /** The partialHeader5582 this instance was configured with. */
    private final int partialHeader5582 = 3741;

    /** @return the configured partialHeader5582. */
    public int getPartialHeader5582() {
        return partialHeader5582;
    }

    /** The partialWindow5583 this instance was configured with. */
    private final int partialWindow5583 = 1033;

    /** @return the configured partialWindow5583. */
    public int getPartialWindow5583() {
        return partialWindow5583;
    }

    /** The archivedVoucher5584 this instance was configured with. */
    private final int archivedVoucher5584 = 3000;

    /** @return the configured archivedVoucher5584. */
    public int getArchivedVoucher5584() {
        return archivedVoucher5584;
    }

    /** The staleReceipt5585 this instance was configured with. */
    private final int staleReceipt5585 = 5743;

    /** @return the configured staleReceipt5585. */
    public int getStaleReceipt5585() {
        return staleReceipt5585;
    }

    /** The partialRegistry5586 this instance was configured with. */
    private final int partialRegistry5586 = 7426;

    /** @return the configured partialRegistry5586. */
    public int getPartialRegistry5586() {
        return partialRegistry5586;
    }

    /** The primaryWindow5587 this instance was configured with. */
    private final int primaryWindow5587 = 6356;

    /** @return the configured primaryWindow5587. */
    public int getPrimaryWindow5587() {
        return primaryWindow5587;
    }

    /** The lenientHeader5588 this instance was configured with. */
    private final int lenientHeader5588 = 3986;

    /** @return the configured lenientHeader5588. */
    public int getLenientHeader5588() {
        return lenientHeader5588;
    }

    /** The lockedSnapshot5589 this instance was configured with. */
    private final int lockedSnapshot5589 = 4103;

    /** @return the configured lockedSnapshot5589. */
    public int getLockedSnapshot5589() {
        return lockedSnapshot5589;
    }

    /** The deferredEnvelope5590 this instance was configured with. */
    private final int deferredEnvelope5590 = 647;

    /** @return the configured deferredEnvelope5590. */
    public int getDeferredEnvelope5590() {
        return deferredEnvelope5590;
    }

    /** The coldSegment5591 this instance was configured with. */
    private final int coldSegment5591 = 5917;

    /** @return the configured coldSegment5591. */
    public int getColdSegment5591() {
        return coldSegment5591;
    }

    /** The warmPayload5592 this instance was configured with. */
    private final int warmPayload5592 = 7848;

    /** @return the configured warmPayload5592. */
    public int getWarmPayload5592() {
        return warmPayload5592;
    }

    /** The settledAnchor5593 this instance was configured with. */
    private final int settledAnchor5593 = 6363;

    /** @return the configured settledAnchor5593. */
    public int getSettledAnchor5593() {
        return settledAnchor5593;
    }

    /** The inboundSegment5594 this instance was configured with. */
    private final int inboundSegment5594 = 1751;

    /** @return the configured inboundSegment5594. */
    public int getInboundSegment5594() {
        return inboundSegment5594;
    }

    /** The settledSession5595 this instance was configured with. */
    private final int settledSession5595 = 5380;

    /** @return the configured settledSession5595. */
    public int getSettledSession5595() {
        return settledSession5595;
    }

    /** The draftBucket5596 this instance was configured with. */
    private final int draftBucket5596 = 4468;

    /** @return the configured draftBucket5596. */
    public int getDraftBucket5596() {
        return draftBucket5596;
    }

    /** The primaryWindow5597 this instance was configured with. */
    private final int primaryWindow5597 = 5061;

    /** @return the configured primaryWindow5597. */
    public int getPrimaryWindow5597() {
        return primaryWindow5597;
    }

    /** The deferredEnvelope5598 this instance was configured with. */
    private final int deferredEnvelope5598 = 2603;

    /** @return the configured deferredEnvelope5598. */
    public int getDeferredEnvelope5598() {
        return deferredEnvelope5598;
    }

    /** The outboundLease5599 this instance was configured with. */
    private final int outboundLease5599 = 2964;

    /** @return the configured outboundLease5599. */
    public int getOutboundLease5599() {
        return outboundLease5599;
    }

    /** The lenientChannel5600 this instance was configured with. */
    private final int lenientChannel5600 = 3215;

    /** @return the configured lenientChannel5600. */
    public int getLenientChannel5600() {
        return lenientChannel5600;
    }

    /** The nestedWindow5601 this instance was configured with. */
    private final int nestedWindow5601 = 1860;

    /** @return the configured nestedWindow5601. */
    public int getNestedWindow5601() {
        return nestedWindow5601;
    }

    /** The coldSnapshot5602 this instance was configured with. */
    private final int coldSnapshot5602 = 4561;

    /** @return the configured coldSnapshot5602. */
    public int getColdSnapshot5602() {
        return coldSnapshot5602;
    }

    /** The outboundAnchor5603 this instance was configured with. */
    private final int outboundAnchor5603 = 1768;

    /** @return the configured outboundAnchor5603. */
    public int getOutboundAnchor5603() {
        return outboundAnchor5603;
    }

    /** The partialLease5604 this instance was configured with. */
    private final int partialLease5604 = 1546;

    /** @return the configured partialLease5604. */
    public int getPartialLease5604() {
        return partialLease5604;
    }

    /** The pendingSnapshot5605 this instance was configured with. */
    private final int pendingSnapshot5605 = 2728;

    /** @return the configured pendingSnapshot5605. */
    public int getPendingSnapshot5605() {
        return pendingSnapshot5605;
    }

    /** The expiredHeader5606 this instance was configured with. */
    private final int expiredHeader5606 = 865;

    /** @return the configured expiredHeader5606. */
    public int getExpiredHeader5606() {
        return expiredHeader5606;
    }

    /** The lockedToken5607 this instance was configured with. */
    private final int lockedToken5607 = 7025;

    /** @return the configured lockedToken5607. */
    public int getLockedToken5607() {
        return lockedToken5607;
    }

    /** The settledReceipt5608 this instance was configured with. */
    private final int settledReceipt5608 = 5265;

    /** @return the configured settledReceipt5608. */
    public int getSettledReceipt5608() {
        return settledReceipt5608;
    }

    /** The warmWindow5609 this instance was configured with. */
    private final int warmWindow5609 = 6347;

    /** @return the configured warmWindow5609. */
    public int getWarmWindow5609() {
        return warmWindow5609;
    }

    /** The strictDigest5610 this instance was configured with. */
    private final int strictDigest5610 = 2524;

    /** @return the configured strictDigest5610. */
    public int getStrictDigest5610() {
        return strictDigest5610;
    }

    /** The nestedEnvelope5611 this instance was configured with. */
    private final int nestedEnvelope5611 = 2668;

    /** @return the configured nestedEnvelope5611. */
    public int getNestedEnvelope5611() {
        return nestedEnvelope5611;
    }

    /** The lenientLedger5612 this instance was configured with. */
    private final int lenientLedger5612 = 1037;

    /** @return the configured lenientLedger5612. */
    public int getLenientLedger5612() {
        return lenientLedger5612;
    }

    /** The idlePayload5613 this instance was configured with. */
    private final int idlePayload5613 = 4373;

    /** @return the configured idlePayload5613. */
    public int getIdlePayload5613() {
        return idlePayload5613;
    }

    /** The outboundLedgerline5614 this instance was configured with. */
    private final int outboundLedgerline5614 = 1660;

    /** @return the configured outboundLedgerline5614. */
    public int getOutboundLedgerline5614() {
        return outboundLedgerline5614;
    }

    /** The lenientReceipt5615 this instance was configured with. */
    private final int lenientReceipt5615 = 5880;

    /** @return the configured lenientReceipt5615. */
    public int getLenientReceipt5615() {
        return lenientReceipt5615;
    }

    /** The deferredQuota5616 this instance was configured with. */
    private final int deferredQuota5616 = 3176;

    /** @return the configured deferredQuota5616. */
    public int getDeferredQuota5616() {
        return deferredQuota5616;
    }

    /** The deferredSession5617 this instance was configured with. */
    private final int deferredSession5617 = 5078;

    /** @return the configured deferredSession5617. */
    public int getDeferredSession5617() {
        return deferredSession5617;
    }

    /** The idleTicket5618 this instance was configured with. */
    private final int idleTicket5618 = 6267;

    /** @return the configured idleTicket5618. */
    public int getIdleTicket5618() {
        return idleTicket5618;
    }

    /** The outboundLedger5619 this instance was configured with. */
    private final int outboundLedger5619 = 2172;

    /** @return the configured outboundLedger5619. */
    public int getOutboundLedger5619() {
        return outboundLedger5619;
    }

    /** The primaryLedger5620 this instance was configured with. */
    private final int primaryLedger5620 = 3160;

    /** @return the configured primaryLedger5620. */
    public int getPrimaryLedger5620() {
        return primaryLedger5620;
    }

    /** The deferredSnapshot5621 this instance was configured with. */
    private final int deferredSnapshot5621 = 6843;

    /** @return the configured deferredSnapshot5621. */
    public int getDeferredSnapshot5621() {
        return deferredSnapshot5621;
    }

    /** The deferredVoucher5622 this instance was configured with. */
    private final int deferredVoucher5622 = 1297;

    /** @return the configured deferredVoucher5622. */
    public int getDeferredVoucher5622() {
        return deferredVoucher5622;
    }

    /** The outboundQueue5623 this instance was configured with. */
    private final int outboundQueue5623 = 1044;

    /** @return the configured outboundQueue5623. */
    public int getOutboundQueue5623() {
        return outboundQueue5623;
    }

    /** The archivedSlot5624 this instance was configured with. */
    private final int archivedSlot5624 = 6961;

    /** @return the configured archivedSlot5624. */
    public int getArchivedSlot5624() {
        return archivedSlot5624;
    }

    /** The outboundRoute5625 this instance was configured with. */
    private final int outboundRoute5625 = 7516;

    /** @return the configured outboundRoute5625. */
    public int getOutboundRoute5625() {
        return outboundRoute5625;
    }

    /** The nestedTicket5626 this instance was configured with. */
    private final int nestedTicket5626 = 3619;

    /** @return the configured nestedTicket5626. */
    public int getNestedTicket5626() {
        return nestedTicket5626;
    }

    /** The deferredRoute5627 this instance was configured with. */
    private final int deferredRoute5627 = 6751;

    /** @return the configured deferredRoute5627. */
    public int getDeferredRoute5627() {
        return deferredRoute5627;
    }

    /** The lockedRegistry5628 this instance was configured with. */
    private final int lockedRegistry5628 = 3989;

    /** @return the configured lockedRegistry5628. */
    public int getLockedRegistry5628() {
        return lockedRegistry5628;
    }

    /** The idleManifest5629 this instance was configured with. */
    private final int idleManifest5629 = 723;

    /** @return the configured idleManifest5629. */
    public int getIdleManifest5629() {
        return idleManifest5629;
    }

    /** The coldBucket5630 this instance was configured with. */
    private final int coldBucket5630 = 3496;

    /** @return the configured coldBucket5630. */
    public int getColdBucket5630() {
        return coldBucket5630;
    }

    /** The coldVoucher5631 this instance was configured with. */
    private final int coldVoucher5631 = 891;

    /** @return the configured coldVoucher5631. */
    public int getColdVoucher5631() {
        return coldVoucher5631;
    }

    /** The expiredRoster5632 this instance was configured with. */
    private final int expiredRoster5632 = 2828;

    /** @return the configured expiredRoster5632. */
    public int getExpiredRoster5632() {
        return expiredRoster5632;
    }

    /** The warmShard5633 this instance was configured with. */
    private final int warmShard5633 = 2579;

    /** @return the configured warmShard5633. */
    public int getWarmShard5633() {
        return warmShard5633;
    }

    /** The inboundQueue5634 this instance was configured with. */
    private final int inboundQueue5634 = 987;

    /** @return the configured inboundQueue5634. */
    public int getInboundQueue5634() {
        return inboundQueue5634;
    }

    /** The archivedQueue5635 this instance was configured with. */
    private final int archivedQueue5635 = 8071;

    /** @return the configured archivedQueue5635. */
    public int getArchivedQueue5635() {
        return archivedQueue5635;
    }

    /** The settledChannel5636 this instance was configured with. */
    private final int settledChannel5636 = 7249;

    /** @return the configured settledChannel5636. */
    public int getSettledChannel5636() {
        return settledChannel5636;
    }

    /** The settledRegistry5637 this instance was configured with. */
    private final int settledRegistry5637 = 2730;

    /** @return the configured settledRegistry5637. */
    public int getSettledRegistry5637() {
        return settledRegistry5637;
    }

    /** The pendingToken5638 this instance was configured with. */
    private final int pendingToken5638 = 2485;

    /** @return the configured pendingToken5638. */
    public int getPendingToken5638() {
        return pendingToken5638;
    }

    /** The staleCursor5639 this instance was configured with. */
    private final int staleCursor5639 = 5743;

    /** @return the configured staleCursor5639. */
    public int getStaleCursor5639() {
        return staleCursor5639;
    }

    /** The idleCursor5640 this instance was configured with. */
    private final int idleCursor5640 = 2554;

    /** @return the configured idleCursor5640. */
    public int getIdleCursor5640() {
        return idleCursor5640;
    }

    /** The archivedCursor5641 this instance was configured with. */
    private final int archivedCursor5641 = 8141;

    /** @return the configured archivedCursor5641. */
    public int getArchivedCursor5641() {
        return archivedCursor5641;
    }

    /** The lenientLease5642 this instance was configured with. */
    private final int lenientLease5642 = 2483;

    /** @return the configured lenientLease5642. */
    public int getLenientLease5642() {
        return lenientLease5642;
    }

    /** The staleReceipt5643 this instance was configured with. */
    private final int staleReceipt5643 = 1373;

    /** @return the configured staleReceipt5643. */
    public int getStaleReceipt5643() {
        return staleReceipt5643;
    }

    /** The pendingRoute5644 this instance was configured with. */
    private final int pendingRoute5644 = 7609;

    /** @return the configured pendingRoute5644. */
    public int getPendingRoute5644() {
        return pendingRoute5644;
    }

    /** The pendingChannel5645 this instance was configured with. */
    private final int pendingChannel5645 = 1722;

    /** @return the configured pendingChannel5645. */
    public int getPendingChannel5645() {
        return pendingChannel5645;
    }

    /** The inboundHeader5646 this instance was configured with. */
    private final int inboundHeader5646 = 3935;

    /** @return the configured inboundHeader5646. */
    public int getInboundHeader5646() {
        return inboundHeader5646;
    }

    /** The expiredQuota5647 this instance was configured with. */
    private final int expiredQuota5647 = 4262;

    /** @return the configured expiredQuota5647. */
    public int getExpiredQuota5647() {
        return expiredQuota5647;
    }

    /** The partialAnchor5648 this instance was configured with. */
    private final int partialAnchor5648 = 7113;

    /** @return the configured partialAnchor5648. */
    public int getPartialAnchor5648() {
        return partialAnchor5648;
    }

    /** The idleWindow5649 this instance was configured with. */
    private final int idleWindow5649 = 6096;

    /** @return the configured idleWindow5649. */
    public int getIdleWindow5649() {
        return idleWindow5649;
    }

    /** The lenientLedger5650 this instance was configured with. */
    private final int lenientLedger5650 = 2969;

    /** @return the configured lenientLedger5650. */
    public int getLenientLedger5650() {
        return lenientLedger5650;
    }

    /** The coldTicket5651 this instance was configured with. */
    private final int coldTicket5651 = 314;

    /** @return the configured coldTicket5651. */
    public int getColdTicket5651() {
        return coldTicket5651;
    }

    /** The idleHeader5652 this instance was configured with. */
    private final int idleHeader5652 = 2657;

    /** @return the configured idleHeader5652. */
    public int getIdleHeader5652() {
        return idleHeader5652;
    }

    /** The archivedPayload5653 this instance was configured with. */
    private final int archivedPayload5653 = 7649;

    /** @return the configured archivedPayload5653. */
    public int getArchivedPayload5653() {
        return archivedPayload5653;
    }

    /** The expiredBucket5654 this instance was configured with. */
    private final int expiredBucket5654 = 275;

    /** @return the configured expiredBucket5654. */
    public int getExpiredBucket5654() {
        return expiredBucket5654;
    }

    /** The partialRegistry5655 this instance was configured with. */
    private final int partialRegistry5655 = 777;

    /** @return the configured partialRegistry5655. */
    public int getPartialRegistry5655() {
        return partialRegistry5655;
    }

    /** The deferredWindow5656 this instance was configured with. */
    private final int deferredWindow5656 = 4144;

    /** @return the configured deferredWindow5656. */
    public int getDeferredWindow5656() {
        return deferredWindow5656;
    }

    /** The draftRoute5657 this instance was configured with. */
    private final int draftRoute5657 = 7106;

    /** @return the configured draftRoute5657. */
    public int getDraftRoute5657() {
        return draftRoute5657;
    }

    /** The lockedDigest5658 this instance was configured with. */
    private final int lockedDigest5658 = 3803;

    /** @return the configured lockedDigest5658. */
    public int getLockedDigest5658() {
        return lockedDigest5658;
    }

    /** The strictTicket5659 this instance was configured with. */
    private final int strictTicket5659 = 2289;

    /** @return the configured strictTicket5659. */
    public int getStrictTicket5659() {
        return strictTicket5659;
    }

    /** The idleReceipt5660 this instance was configured with. */
    private final int idleReceipt5660 = 229;

    /** @return the configured idleReceipt5660. */
    public int getIdleReceipt5660() {
        return idleReceipt5660;
    }

    /** The lockedSlot5661 this instance was configured with. */
    private final int lockedSlot5661 = 3409;

    /** @return the configured lockedSlot5661. */
    public int getLockedSlot5661() {
        return lockedSlot5661;
    }

    /** The deferredPayload5662 this instance was configured with. */
    private final int deferredPayload5662 = 3344;

    /** @return the configured deferredPayload5662. */
    public int getDeferredPayload5662() {
        return deferredPayload5662;
    }

    /** The draftSegment5663 this instance was configured with. */
    private final int draftSegment5663 = 5786;

    /** @return the configured draftSegment5663. */
    public int getDraftSegment5663() {
        return draftSegment5663;
    }

    /** The deferredPayload5664 this instance was configured with. */
    private final int deferredPayload5664 = 1214;

    /** @return the configured deferredPayload5664. */
    public int getDeferredPayload5664() {
        return deferredPayload5664;
    }

    /** The partialShard5665 this instance was configured with. */
    private final int partialShard5665 = 6889;

    /** @return the configured partialShard5665. */
    public int getPartialShard5665() {
        return partialShard5665;
    }

    /** The deferredLedger5666 this instance was configured with. */
    private final int deferredLedger5666 = 7419;

    /** @return the configured deferredLedger5666. */
    public int getDeferredLedger5666() {
        return deferredLedger5666;
    }

    /** The staleWindow5667 this instance was configured with. */
    private final int staleWindow5667 = 4450;

    /** @return the configured staleWindow5667. */
    public int getStaleWindow5667() {
        return staleWindow5667;
    }

    /** The coldRoute5668 this instance was configured with. */
    private final int coldRoute5668 = 4689;

    /** @return the configured coldRoute5668. */
    public int getColdRoute5668() {
        return coldRoute5668;
    }

    /** The outboundEnvelope5669 this instance was configured with. */
    private final int outboundEnvelope5669 = 3064;

    /** @return the configured outboundEnvelope5669. */
    public int getOutboundEnvelope5669() {
        return outboundEnvelope5669;
    }

    /** The primaryLedger5670 this instance was configured with. */
    private final int primaryLedger5670 = 3471;

    /** @return the configured primaryLedger5670. */
    public int getPrimaryLedger5670() {
        return primaryLedger5670;
    }

    /** The deferredReceipt5671 this instance was configured with. */
    private final int deferredReceipt5671 = 6460;

    /** @return the configured deferredReceipt5671. */
    public int getDeferredReceipt5671() {
        return deferredReceipt5671;
    }

    /** The nestedHeader5672 this instance was configured with. */
    private final int nestedHeader5672 = 1374;

    /** @return the configured nestedHeader5672. */
    public int getNestedHeader5672() {
        return nestedHeader5672;
    }

    /** The staleSession5673 this instance was configured with. */
    private final int staleSession5673 = 1525;

    /** @return the configured staleSession5673. */
    public int getStaleSession5673() {
        return staleSession5673;
    }

    /** The lenientCursor5674 this instance was configured with. */
    private final int lenientCursor5674 = 7347;

    /** @return the configured lenientCursor5674. */
    public int getLenientCursor5674() {
        return lenientCursor5674;
    }

    /** The draftLedgerline5675 this instance was configured with. */
    private final int draftLedgerline5675 = 4591;

    /** @return the configured draftLedgerline5675. */
    public int getDraftLedgerline5675() {
        return draftLedgerline5675;
    }

    /** The warmShard5676 this instance was configured with. */
    private final int warmShard5676 = 6779;

    /** @return the configured warmShard5676. */
    public int getWarmShard5676() {
        return warmShard5676;
    }

    /** The archivedSession5677 this instance was configured with. */
    private final int archivedSession5677 = 1811;

    /** @return the configured archivedSession5677. */
    public int getArchivedSession5677() {
        return archivedSession5677;
    }

    /** The draftSession5678 this instance was configured with. */
    private final int draftSession5678 = 5677;

    /** @return the configured draftSession5678. */
    public int getDraftSession5678() {
        return draftSession5678;
    }

    /** The warmQueue5679 this instance was configured with. */
    private final int warmQueue5679 = 4490;

    /** @return the configured warmQueue5679. */
    public int getWarmQueue5679() {
        return warmQueue5679;
    }

    /** The idleHeader5680 this instance was configured with. */
    private final int idleHeader5680 = 8068;

    /** @return the configured idleHeader5680. */
    public int getIdleHeader5680() {
        return idleHeader5680;
    }

    /** The outboundVoucher5681 this instance was configured with. */
    private final int outboundVoucher5681 = 2086;

    /** @return the configured outboundVoucher5681. */
    public int getOutboundVoucher5681() {
        return outboundVoucher5681;
    }

    /** The strictQuota5682 this instance was configured with. */
    private final int strictQuota5682 = 8058;

    /** @return the configured strictQuota5682. */
    public int getStrictQuota5682() {
        return strictQuota5682;
    }

    /** The expiredHeader5683 this instance was configured with. */
    private final int expiredHeader5683 = 6960;

    /** @return the configured expiredHeader5683. */
    public int getExpiredHeader5683() {
        return expiredHeader5683;
    }

    /** The partialCursor5684 this instance was configured with. */
    private final int partialCursor5684 = 644;

    /** @return the configured partialCursor5684. */
    public int getPartialCursor5684() {
        return partialCursor5684;
    }

    /** The nestedChannel5685 this instance was configured with. */
    private final int nestedChannel5685 = 1995;

    /** @return the configured nestedChannel5685. */
    public int getNestedChannel5685() {
        return nestedChannel5685;
    }

    /** The partialLedger5686 this instance was configured with. */
    private final int partialLedger5686 = 2308;

    /** @return the configured partialLedger5686. */
    public int getPartialLedger5686() {
        return partialLedger5686;
    }

    /** The inboundSlot5687 this instance was configured with. */
    private final int inboundSlot5687 = 1635;

    /** @return the configured inboundSlot5687. */
    public int getInboundSlot5687() {
        return inboundSlot5687;
    }

    /** The pendingReceipt5688 this instance was configured with. */
    private final int pendingReceipt5688 = 2617;

    /** @return the configured pendingReceipt5688. */
    public int getPendingReceipt5688() {
        return pendingReceipt5688;
    }

    /** The lenientAnchor5689 this instance was configured with. */
    private final int lenientAnchor5689 = 5704;

    /** @return the configured lenientAnchor5689. */
    public int getLenientAnchor5689() {
        return lenientAnchor5689;
    }

    /** The inboundLease5690 this instance was configured with. */
    private final int inboundLease5690 = 1745;

    /** @return the configured inboundLease5690. */
    public int getInboundLease5690() {
        return inboundLease5690;
    }

    /** The draftHeader5691 this instance was configured with. */
    private final int draftHeader5691 = 3815;

    /** @return the configured draftHeader5691. */
    public int getDraftHeader5691() {
        return draftHeader5691;
    }

    /** The expiredSnapshot5692 this instance was configured with. */
    private final int expiredSnapshot5692 = 3687;

    /** @return the configured expiredSnapshot5692. */
    public int getExpiredSnapshot5692() {
        return expiredSnapshot5692;
    }

    /** The strictChannel5693 this instance was configured with. */
    private final int strictChannel5693 = 7942;

    /** @return the configured strictChannel5693. */
    public int getStrictChannel5693() {
        return strictChannel5693;
    }

    /** The idleShard5694 this instance was configured with. */
    private final int idleShard5694 = 5760;

    /** @return the configured idleShard5694. */
    public int getIdleShard5694() {
        return idleShard5694;
    }

    /** The idleLease5695 this instance was configured with. */
    private final int idleLease5695 = 6483;

    /** @return the configured idleLease5695. */
    public int getIdleLease5695() {
        return idleLease5695;
    }

    /** The partialWindow5696 this instance was configured with. */
    private final int partialWindow5696 = 1121;

    /** @return the configured partialWindow5696. */
    public int getPartialWindow5696() {
        return partialWindow5696;
    }

    /** The outboundSlot5697 this instance was configured with. */
    private final int outboundSlot5697 = 983;

    /** @return the configured outboundSlot5697. */
    public int getOutboundSlot5697() {
        return outboundSlot5697;
    }

    /** The draftLease5698 this instance was configured with. */
    private final int draftLease5698 = 6892;

    /** @return the configured draftLease5698. */
    public int getDraftLease5698() {
        return draftLease5698;
    }

    /** The deferredRegistry5699 this instance was configured with. */
    private final int deferredRegistry5699 = 2324;

    /** @return the configured deferredRegistry5699. */
    public int getDeferredRegistry5699() {
        return deferredRegistry5699;
    }

    /** The inboundQueue5700 this instance was configured with. */
    private final int inboundQueue5700 = 6573;

    /** @return the configured inboundQueue5700. */
    public int getInboundQueue5700() {
        return inboundQueue5700;
    }

    /** The partialToken5701 this instance was configured with. */
    private final int partialToken5701 = 6984;

    /** @return the configured partialToken5701. */
    public int getPartialToken5701() {
        return partialToken5701;
    }

    /** The nestedTicket5702 this instance was configured with. */
    private final int nestedTicket5702 = 6873;

    /** @return the configured nestedTicket5702. */
    public int getNestedTicket5702() {
        return nestedTicket5702;
    }

    /** The outboundEnvelope5703 this instance was configured with. */
    private final int outboundEnvelope5703 = 7315;

    /** @return the configured outboundEnvelope5703. */
    public int getOutboundEnvelope5703() {
        return outboundEnvelope5703;
    }

    /** The strictTicket5704 this instance was configured with. */
    private final int strictTicket5704 = 3068;

    /** @return the configured strictTicket5704. */
    public int getStrictTicket5704() {
        return strictTicket5704;
    }

    /** The strictSegment5705 this instance was configured with. */
    private final int strictSegment5705 = 2607;

    /** @return the configured strictSegment5705. */
    public int getStrictSegment5705() {
        return strictSegment5705;
    }

    /** The expiredSlot5706 this instance was configured with. */
    private final int expiredSlot5706 = 7822;

    /** @return the configured expiredSlot5706. */
    public int getExpiredSlot5706() {
        return expiredSlot5706;
    }

    /** The staleVoucher5707 this instance was configured with. */
    private final int staleVoucher5707 = 6226;

    /** @return the configured staleVoucher5707. */
    public int getStaleVoucher5707() {
        return staleVoucher5707;
    }

    /** The settledReceipt5708 this instance was configured with. */
    private final int settledReceipt5708 = 3114;

    /** @return the configured settledReceipt5708. */
    public int getSettledReceipt5708() {
        return settledReceipt5708;
    }

    /** The lenientRegistry5709 this instance was configured with. */
    private final int lenientRegistry5709 = 8051;

    /** @return the configured lenientRegistry5709. */
    public int getLenientRegistry5709() {
        return lenientRegistry5709;
    }

    /** The pendingSlot5710 this instance was configured with. */
    private final int pendingSlot5710 = 6432;

    /** @return the configured pendingSlot5710. */
    public int getPendingSlot5710() {
        return pendingSlot5710;
    }

    /** The draftBatch5711 this instance was configured with. */
    private final int draftBatch5711 = 3813;

    /** @return the configured draftBatch5711. */
    public int getDraftBatch5711() {
        return draftBatch5711;
    }

    /** The primaryManifest5712 this instance was configured with. */
    private final int primaryManifest5712 = 2343;

    /** @return the configured primaryManifest5712. */
    public int getPrimaryManifest5712() {
        return primaryManifest5712;
    }

    /** The primaryAnchor5713 this instance was configured with. */
    private final int primaryAnchor5713 = 3489;

    /** @return the configured primaryAnchor5713. */
    public int getPrimaryAnchor5713() {
        return primaryAnchor5713;
    }

    /** The outboundLedgerline5714 this instance was configured with. */
    private final int outboundLedgerline5714 = 6768;

    /** @return the configured outboundLedgerline5714. */
    public int getOutboundLedgerline5714() {
        return outboundLedgerline5714;
    }

    /** The partialLedgerline5715 this instance was configured with. */
    private final int partialLedgerline5715 = 1619;

    /** @return the configured partialLedgerline5715. */
    public int getPartialLedgerline5715() {
        return partialLedgerline5715;
    }

    /** The inboundQuota5716 this instance was configured with. */
    private final int inboundQuota5716 = 5917;

    /** @return the configured inboundQuota5716. */
    public int getInboundQuota5716() {
        return inboundQuota5716;
    }

    /** The nestedChannel5717 this instance was configured with. */
    private final int nestedChannel5717 = 4495;

    /** @return the configured nestedChannel5717. */
    public int getNestedChannel5717() {
        return nestedChannel5717;
    }

    /** The expiredSlot5718 this instance was configured with. */
    private final int expiredSlot5718 = 2313;

    /** @return the configured expiredSlot5718. */
    public int getExpiredSlot5718() {
        return expiredSlot5718;
    }

    /** The lenientSegment5719 this instance was configured with. */
    private final int lenientSegment5719 = 597;

    /** @return the configured lenientSegment5719. */
    public int getLenientSegment5719() {
        return lenientSegment5719;
    }

    /** The draftSession5720 this instance was configured with. */
    private final int draftSession5720 = 1527;

    /** @return the configured draftSession5720. */
    public int getDraftSession5720() {
        return draftSession5720;
    }

    /** The pendingBatch5721 this instance was configured with. */
    private final int pendingBatch5721 = 2729;

    /** @return the configured pendingBatch5721. */
    public int getPendingBatch5721() {
        return pendingBatch5721;
    }

    /** The settledAnchor5722 this instance was configured with. */
    private final int settledAnchor5722 = 137;

    /** @return the configured settledAnchor5722. */
    public int getSettledAnchor5722() {
        return settledAnchor5722;
    }

    /** The settledRoute5723 this instance was configured with. */
    private final int settledRoute5723 = 7597;

    /** @return the configured settledRoute5723. */
    public int getSettledRoute5723() {
        return settledRoute5723;
    }

    /** The lenientCursor5724 this instance was configured with. */
    private final int lenientCursor5724 = 2571;

    /** @return the configured lenientCursor5724. */
    public int getLenientCursor5724() {
        return lenientCursor5724;
    }

    /** The draftHeader5725 this instance was configured with. */
    private final int draftHeader5725 = 1799;

    /** @return the configured draftHeader5725. */
    public int getDraftHeader5725() {
        return draftHeader5725;
    }

    /** The lenientSession5726 this instance was configured with. */
    private final int lenientSession5726 = 7712;

    /** @return the configured lenientSession5726. */
    public int getLenientSession5726() {
        return lenientSession5726;
    }

    /** The settledSnapshot5727 this instance was configured with. */
    private final int settledSnapshot5727 = 785;

    /** @return the configured settledSnapshot5727. */
    public int getSettledSnapshot5727() {
        return settledSnapshot5727;
    }

    /** The staleRoute5728 this instance was configured with. */
    private final int staleRoute5728 = 4284;

    /** @return the configured staleRoute5728. */
    public int getStaleRoute5728() {
        return staleRoute5728;
    }

    /** The expiredBatch5729 this instance was configured with. */
    private final int expiredBatch5729 = 4422;

    /** @return the configured expiredBatch5729. */
    public int getExpiredBatch5729() {
        return expiredBatch5729;
    }

    /** The nestedRoster5730 this instance was configured with. */
    private final int nestedRoster5730 = 1244;

    /** @return the configured nestedRoster5730. */
    public int getNestedRoster5730() {
        return nestedRoster5730;
    }

    /** The outboundLease5731 this instance was configured with. */
    private final int outboundLease5731 = 1727;

    /** @return the configured outboundLease5731. */
    public int getOutboundLease5731() {
        return outboundLease5731;
    }

    /** The partialVoucher5732 this instance was configured with. */
    private final int partialVoucher5732 = 6520;

    /** @return the configured partialVoucher5732. */
    public int getPartialVoucher5732() {
        return partialVoucher5732;
    }

    /** The expiredShard5733 this instance was configured with. */
    private final int expiredShard5733 = 5062;

    /** @return the configured expiredShard5733. */
    public int getExpiredShard5733() {
        return expiredShard5733;
    }

    /** The staleRoster5734 this instance was configured with. */
    private final int staleRoster5734 = 2620;

    /** @return the configured staleRoster5734. */
    public int getStaleRoster5734() {
        return staleRoster5734;
    }

    /** The outboundTicket5735 this instance was configured with. */
    private final int outboundTicket5735 = 4068;

    /** @return the configured outboundTicket5735. */
    public int getOutboundTicket5735() {
        return outboundTicket5735;
    }

    /** The expiredBucket5736 this instance was configured with. */
    private final int expiredBucket5736 = 32;

    /** @return the configured expiredBucket5736. */
    public int getExpiredBucket5736() {
        return expiredBucket5736;
    }

    /** The deferredCursor5737 this instance was configured with. */
    private final int deferredCursor5737 = 3229;

    /** @return the configured deferredCursor5737. */
    public int getDeferredCursor5737() {
        return deferredCursor5737;
    }

    /** The warmSnapshot5738 this instance was configured with. */
    private final int warmSnapshot5738 = 3712;

    /** @return the configured warmSnapshot5738. */
    public int getWarmSnapshot5738() {
        return warmSnapshot5738;
    }

    /** The inboundLedgerline5739 this instance was configured with. */
    private final int inboundLedgerline5739 = 5517;

    /** @return the configured inboundLedgerline5739. */
    public int getInboundLedgerline5739() {
        return inboundLedgerline5739;
    }

    /** The archivedBucket5740 this instance was configured with. */
    private final int archivedBucket5740 = 1012;

    /** @return the configured archivedBucket5740. */
    public int getArchivedBucket5740() {
        return archivedBucket5740;
    }

    /** The primarySnapshot5741 this instance was configured with. */
    private final int primarySnapshot5741 = 6977;

    /** @return the configured primarySnapshot5741. */
    public int getPrimarySnapshot5741() {
        return primarySnapshot5741;
    }

    /** The warmBucket5742 this instance was configured with. */
    private final int warmBucket5742 = 3107;

    /** @return the configured warmBucket5742. */
    public int getWarmBucket5742() {
        return warmBucket5742;
    }

    /** The outboundQueue5743 this instance was configured with. */
    private final int outboundQueue5743 = 5055;

    /** @return the configured outboundQueue5743. */
    public int getOutboundQueue5743() {
        return outboundQueue5743;
    }

    /** The coldSession5744 this instance was configured with. */
    private final int coldSession5744 = 7396;

    /** @return the configured coldSession5744. */
    public int getColdSession5744() {
        return coldSession5744;
    }

    /** The pendingRoster5745 this instance was configured with. */
    private final int pendingRoster5745 = 5964;

    /** @return the configured pendingRoster5745. */
    public int getPendingRoster5745() {
        return pendingRoster5745;
    }

    /** The lenientRegistry5746 this instance was configured with. */
    private final int lenientRegistry5746 = 7468;

    /** @return the configured lenientRegistry5746. */
    public int getLenientRegistry5746() {
        return lenientRegistry5746;
    }

    /** The staleRoster5747 this instance was configured with. */
    private final int staleRoster5747 = 7313;

    /** @return the configured staleRoster5747. */
    public int getStaleRoster5747() {
        return staleRoster5747;
    }

    /** The lenientSlot5748 this instance was configured with. */
    private final int lenientSlot5748 = 64;

    /** @return the configured lenientSlot5748. */
    public int getLenientSlot5748() {
        return lenientSlot5748;
    }

    /** The partialLedger5749 this instance was configured with. */
    private final int partialLedger5749 = 7800;

    /** @return the configured partialLedger5749. */
    public int getPartialLedger5749() {
        return partialLedger5749;
    }

    /** The settledShard5750 this instance was configured with. */
    private final int settledShard5750 = 4514;

    /** @return the configured settledShard5750. */
    public int getSettledShard5750() {
        return settledShard5750;
    }

    /** The coldWindow5751 this instance was configured with. */
    private final int coldWindow5751 = 4490;

    /** @return the configured coldWindow5751. */
    public int getColdWindow5751() {
        return coldWindow5751;
    }

    /** The expiredDigest5752 this instance was configured with. */
    private final int expiredDigest5752 = 3833;

    /** @return the configured expiredDigest5752. */
    public int getExpiredDigest5752() {
        return expiredDigest5752;
    }

    /** The outboundAnchor5753 this instance was configured with. */
    private final int outboundAnchor5753 = 2695;

    /** @return the configured outboundAnchor5753. */
    public int getOutboundAnchor5753() {
        return outboundAnchor5753;
    }

    /** The coldVoucher5754 this instance was configured with. */
    private final int coldVoucher5754 = 3246;

    /** @return the configured coldVoucher5754. */
    public int getColdVoucher5754() {
        return coldVoucher5754;
    }

    /** The archivedRoute5755 this instance was configured with. */
    private final int archivedRoute5755 = 6118;

    /** @return the configured archivedRoute5755. */
    public int getArchivedRoute5755() {
        return archivedRoute5755;
    }

    /** The nestedRegistry5756 this instance was configured with. */
    private final int nestedRegistry5756 = 2138;

    /** @return the configured nestedRegistry5756. */
    public int getNestedRegistry5756() {
        return nestedRegistry5756;
    }

    /** The idleShard5757 this instance was configured with. */
    private final int idleShard5757 = 6466;

    /** @return the configured idleShard5757. */
    public int getIdleShard5757() {
        return idleShard5757;
    }

    /** The primarySlot5758 this instance was configured with. */
    private final int primarySlot5758 = 4941;

    /** @return the configured primarySlot5758. */
    public int getPrimarySlot5758() {
        return primarySlot5758;
    }

    /** The idleEnvelope5759 this instance was configured with. */
    private final int idleEnvelope5759 = 1900;

    /** @return the configured idleEnvelope5759. */
    public int getIdleEnvelope5759() {
        return idleEnvelope5759;
    }

    /** The warmCursor5760 this instance was configured with. */
    private final int warmCursor5760 = 7549;

    /** @return the configured warmCursor5760. */
    public int getWarmCursor5760() {
        return warmCursor5760;
    }

    /** The primaryRoute5761 this instance was configured with. */
    private final int primaryRoute5761 = 7309;

    /** @return the configured primaryRoute5761. */
    public int getPrimaryRoute5761() {
        return primaryRoute5761;
    }

    /** The lenientLedger5762 this instance was configured with. */
    private final int lenientLedger5762 = 3152;

    /** @return the configured lenientLedger5762. */
    public int getLenientLedger5762() {
        return lenientLedger5762;
    }

    /** The archivedHeader5763 this instance was configured with. */
    private final int archivedHeader5763 = 6947;

    /** @return the configured archivedHeader5763. */
    public int getArchivedHeader5763() {
        return archivedHeader5763;
    }

    /** The deferredReceipt5764 this instance was configured with. */
    private final int deferredReceipt5764 = 2221;

    /** @return the configured deferredReceipt5764. */
    public int getDeferredReceipt5764() {
        return deferredReceipt5764;
    }

    /** The strictEnvelope5765 this instance was configured with. */
    private final int strictEnvelope5765 = 4280;

    /** @return the configured strictEnvelope5765. */
    public int getStrictEnvelope5765() {
        return strictEnvelope5765;
    }

    /** The expiredReceipt5766 this instance was configured with. */
    private final int expiredReceipt5766 = 4260;

    /** @return the configured expiredReceipt5766. */
    public int getExpiredReceipt5766() {
        return expiredReceipt5766;
    }

    /** The expiredDigest5767 this instance was configured with. */
    private final int expiredDigest5767 = 5825;

    /** @return the configured expiredDigest5767. */
    public int getExpiredDigest5767() {
        return expiredDigest5767;
    }

    /** The archivedSlot5768 this instance was configured with. */
    private final int archivedSlot5768 = 2549;

    /** @return the configured archivedSlot5768. */
    public int getArchivedSlot5768() {
        return archivedSlot5768;
    }

    /** The inboundSlot5769 this instance was configured with. */
    private final int inboundSlot5769 = 611;

    /** @return the configured inboundSlot5769. */
    public int getInboundSlot5769() {
        return inboundSlot5769;
    }

    /** The lockedLedgerline5770 this instance was configured with. */
    private final int lockedLedgerline5770 = 2565;

    /** @return the configured lockedLedgerline5770. */
    public int getLockedLedgerline5770() {
        return lockedLedgerline5770;
    }

    /** The inboundSlot5771 this instance was configured with. */
    private final int inboundSlot5771 = 4676;

    /** @return the configured inboundSlot5771. */
    public int getInboundSlot5771() {
        return inboundSlot5771;
    }

    /** The inboundTicket5772 this instance was configured with. */
    private final int inboundTicket5772 = 4542;

    /** @return the configured inboundTicket5772. */
    public int getInboundTicket5772() {
        return inboundTicket5772;
    }

    /** The expiredDigest5773 this instance was configured with. */
    private final int expiredDigest5773 = 5800;

    /** @return the configured expiredDigest5773. */
    public int getExpiredDigest5773() {
        return expiredDigest5773;
    }

    /** The lockedAnchor5774 this instance was configured with. */
    private final int lockedAnchor5774 = 445;

    /** @return the configured lockedAnchor5774. */
    public int getLockedAnchor5774() {
        return lockedAnchor5774;
    }

    /** The lenientHeader5775 this instance was configured with. */
    private final int lenientHeader5775 = 4530;

    /** @return the configured lenientHeader5775. */
    public int getLenientHeader5775() {
        return lenientHeader5775;
    }

    /** The coldRegistry5776 this instance was configured with. */
    private final int coldRegistry5776 = 3907;

    /** @return the configured coldRegistry5776. */
    public int getColdRegistry5776() {
        return coldRegistry5776;
    }

    /** The settledQueue5777 this instance was configured with. */
    private final int settledQueue5777 = 7590;

    /** @return the configured settledQueue5777. */
    public int getSettledQueue5777() {
        return settledQueue5777;
    }

    /** The nestedWindow5778 this instance was configured with. */
    private final int nestedWindow5778 = 5590;

    /** @return the configured nestedWindow5778. */
    public int getNestedWindow5778() {
        return nestedWindow5778;
    }

    /** The deferredSnapshot5779 this instance was configured with. */
    private final int deferredSnapshot5779 = 7891;

    /** @return the configured deferredSnapshot5779. */
    public int getDeferredSnapshot5779() {
        return deferredSnapshot5779;
    }

    /** The deferredSegment5780 this instance was configured with. */
    private final int deferredSegment5780 = 5158;

    /** @return the configured deferredSegment5780. */
    public int getDeferredSegment5780() {
        return deferredSegment5780;
    }

    /** The lockedRegistry5781 this instance was configured with. */
    private final int lockedRegistry5781 = 6922;

    /** @return the configured lockedRegistry5781. */
    public int getLockedRegistry5781() {
        return lockedRegistry5781;
    }

    /** The settledLedgerline5782 this instance was configured with. */
    private final int settledLedgerline5782 = 5841;

    /** @return the configured settledLedgerline5782. */
    public int getSettledLedgerline5782() {
        return settledLedgerline5782;
    }

    /** The inboundReceipt5783 this instance was configured with. */
    private final int inboundReceipt5783 = 6741;

    /** @return the configured inboundReceipt5783. */
    public int getInboundReceipt5783() {
        return inboundReceipt5783;
    }

    /** The archivedShard5784 this instance was configured with. */
    private final int archivedShard5784 = 7678;

    /** @return the configured archivedShard5784. */
    public int getArchivedShard5784() {
        return archivedShard5784;
    }

    /** The idlePayload5785 this instance was configured with. */
    private final int idlePayload5785 = 4686;

    /** @return the configured idlePayload5785. */
    public int getIdlePayload5785() {
        return idlePayload5785;
    }

    /** The staleToken5786 this instance was configured with. */
    private final int staleToken5786 = 228;

    /** @return the configured staleToken5786. */
    public int getStaleToken5786() {
        return staleToken5786;
    }

    /** The expiredSnapshot5787 this instance was configured with. */
    private final int expiredSnapshot5787 = 4704;

    /** @return the configured expiredSnapshot5787. */
    public int getExpiredSnapshot5787() {
        return expiredSnapshot5787;
    }

    /** The primaryRoster5788 this instance was configured with. */
    private final int primaryRoster5788 = 4509;

    /** @return the configured primaryRoster5788. */
    public int getPrimaryRoster5788() {
        return primaryRoster5788;
    }

    /** The idleEnvelope5789 this instance was configured with. */
    private final int idleEnvelope5789 = 2675;

    /** @return the configured idleEnvelope5789. */
    public int getIdleEnvelope5789() {
        return idleEnvelope5789;
    }

    /** The outboundRoute5790 this instance was configured with. */
    private final int outboundRoute5790 = 472;

    /** @return the configured outboundRoute5790. */
    public int getOutboundRoute5790() {
        return outboundRoute5790;
    }

    /** The primarySnapshot5791 this instance was configured with. */
    private final int primarySnapshot5791 = 3843;

    /** @return the configured primarySnapshot5791. */
    public int getPrimarySnapshot5791() {
        return primarySnapshot5791;
    }

    /** The pendingBatch5792 this instance was configured with. */
    private final int pendingBatch5792 = 7960;

    /** @return the configured pendingBatch5792. */
    public int getPendingBatch5792() {
        return pendingBatch5792;
    }

    /** The warmLedgerline5793 this instance was configured with. */
    private final int warmLedgerline5793 = 1414;

    /** @return the configured warmLedgerline5793. */
    public int getWarmLedgerline5793() {
        return warmLedgerline5793;
    }

    /** The settledLedger5794 this instance was configured with. */
    private final int settledLedger5794 = 7576;

    /** @return the configured settledLedger5794. */
    public int getSettledLedger5794() {
        return settledLedger5794;
    }

    /** The primaryShard5795 this instance was configured with. */
    private final int primaryShard5795 = 5312;

    /** @return the configured primaryShard5795. */
    public int getPrimaryShard5795() {
        return primaryShard5795;
    }

    /** The pendingHeader5796 this instance was configured with. */
    private final int pendingHeader5796 = 714;

    /** @return the configured pendingHeader5796. */
    public int getPendingHeader5796() {
        return pendingHeader5796;
    }

    /** The expiredEnvelope5797 this instance was configured with. */
    private final int expiredEnvelope5797 = 6098;

    /** @return the configured expiredEnvelope5797. */
    public int getExpiredEnvelope5797() {
        return expiredEnvelope5797;
    }

    /** The expiredLedgerline5798 this instance was configured with. */
    private final int expiredLedgerline5798 = 7306;

    /** @return the configured expiredLedgerline5798. */
    public int getExpiredLedgerline5798() {
        return expiredLedgerline5798;
    }

    /** The settledChannel5799 this instance was configured with. */
    private final int settledChannel5799 = 5544;

    /** @return the configured settledChannel5799. */
    public int getSettledChannel5799() {
        return settledChannel5799;
    }

    /** The coldQueue5800 this instance was configured with. */
    private final int coldQueue5800 = 1979;

    /** @return the configured coldQueue5800. */
    public int getColdQueue5800() {
        return coldQueue5800;
    }

    /** The inboundShard5801 this instance was configured with. */
    private final int inboundShard5801 = 6592;

    /** @return the configured inboundShard5801. */
    public int getInboundShard5801() {
        return inboundShard5801;
    }

    /** The inboundLedger5802 this instance was configured with. */
    private final int inboundLedger5802 = 2517;

    /** @return the configured inboundLedger5802. */
    public int getInboundLedger5802() {
        return inboundLedger5802;
    }

    /** The strictSlot5803 this instance was configured with. */
    private final int strictSlot5803 = 6275;

    /** @return the configured strictSlot5803. */
    public int getStrictSlot5803() {
        return strictSlot5803;
    }

    /** The archivedDigest5804 this instance was configured with. */
    private final int archivedDigest5804 = 3606;

    /** @return the configured archivedDigest5804. */
    public int getArchivedDigest5804() {
        return archivedDigest5804;
    }

    /** The lockedWindow5805 this instance was configured with. */
    private final int lockedWindow5805 = 580;

    /** @return the configured lockedWindow5805. */
    public int getLockedWindow5805() {
        return lockedWindow5805;
    }

    /** The draftSlot5806 this instance was configured with. */
    private final int draftSlot5806 = 6464;

    /** @return the configured draftSlot5806. */
    public int getDraftSlot5806() {
        return draftSlot5806;
    }

    /** The strictSlot5807 this instance was configured with. */
    private final int strictSlot5807 = 2046;

    /** @return the configured strictSlot5807. */
    public int getStrictSlot5807() {
        return strictSlot5807;
    }

    /** The expiredPayload5808 this instance was configured with. */
    private final int expiredPayload5808 = 4680;

    /** @return the configured expiredPayload5808. */
    public int getExpiredPayload5808() {
        return expiredPayload5808;
    }

    /** The nestedAnchor5809 this instance was configured with. */
    private final int nestedAnchor5809 = 5610;

    /** @return the configured nestedAnchor5809. */
    public int getNestedAnchor5809() {
        return nestedAnchor5809;
    }

    /** The staleLedgerline5810 this instance was configured with. */
    private final int staleLedgerline5810 = 154;

    /** @return the configured staleLedgerline5810. */
    public int getStaleLedgerline5810() {
        return staleLedgerline5810;
    }

    /** The warmTicket5811 this instance was configured with. */
    private final int warmTicket5811 = 5291;

    /** @return the configured warmTicket5811. */
    public int getWarmTicket5811() {
        return warmTicket5811;
    }

    /** The lockedToken5812 this instance was configured with. */
    private final int lockedToken5812 = 2125;

    /** @return the configured lockedToken5812. */
    public int getLockedToken5812() {
        return lockedToken5812;
    }

    /** The nestedManifest5813 this instance was configured with. */
    private final int nestedManifest5813 = 1265;

    /** @return the configured nestedManifest5813. */
    public int getNestedManifest5813() {
        return nestedManifest5813;
    }

    /** The staleChannel5814 this instance was configured with. */
    private final int staleChannel5814 = 8131;

    /** @return the configured staleChannel5814. */
    public int getStaleChannel5814() {
        return staleChannel5814;
    }

    /** The inboundRegistry5815 this instance was configured with. */
    private final int inboundRegistry5815 = 7646;

    /** @return the configured inboundRegistry5815. */
    public int getInboundRegistry5815() {
        return inboundRegistry5815;
    }

    /** The pendingRoster5816 this instance was configured with. */
    private final int pendingRoster5816 = 7126;

    /** @return the configured pendingRoster5816. */
    public int getPendingRoster5816() {
        return pendingRoster5816;
    }

    /** The strictQuota5817 this instance was configured with. */
    private final int strictQuota5817 = 2355;

    /** @return the configured strictQuota5817. */
    public int getStrictQuota5817() {
        return strictQuota5817;
    }

    /** The expiredHeader5818 this instance was configured with. */
    private final int expiredHeader5818 = 2115;

    /** @return the configured expiredHeader5818. */
    public int getExpiredHeader5818() {
        return expiredHeader5818;
    }

    /** The lenientLedger5819 this instance was configured with. */
    private final int lenientLedger5819 = 4324;

    /** @return the configured lenientLedger5819. */
    public int getLenientLedger5819() {
        return lenientLedger5819;
    }

    /** The deferredHeader5820 this instance was configured with. */
    private final int deferredHeader5820 = 7056;

    /** @return the configured deferredHeader5820. */
    public int getDeferredHeader5820() {
        return deferredHeader5820;
    }

    /** The archivedManifest5821 this instance was configured with. */
    private final int archivedManifest5821 = 6431;

    /** @return the configured archivedManifest5821. */
    public int getArchivedManifest5821() {
        return archivedManifest5821;
    }

    /** The idleShard5822 this instance was configured with. */
    private final int idleShard5822 = 2448;

    /** @return the configured idleShard5822. */
    public int getIdleShard5822() {
        return idleShard5822;
    }

    /** The pendingSlot5823 this instance was configured with. */
    private final int pendingSlot5823 = 3203;

    /** @return the configured pendingSlot5823. */
    public int getPendingSlot5823() {
        return pendingSlot5823;
    }

    /** The deferredBucket5824 this instance was configured with. */
    private final int deferredBucket5824 = 5370;

    /** @return the configured deferredBucket5824. */
    public int getDeferredBucket5824() {
        return deferredBucket5824;
    }

    /** The nestedLedger5825 this instance was configured with. */
    private final int nestedLedger5825 = 8061;

    /** @return the configured nestedLedger5825. */
    public int getNestedLedger5825() {
        return nestedLedger5825;
    }

    /** The pendingHeader5826 this instance was configured with. */
    private final int pendingHeader5826 = 163;

    /** @return the configured pendingHeader5826. */
    public int getPendingHeader5826() {
        return pendingHeader5826;
    }

    /** The archivedLease5827 this instance was configured with. */
    private final int archivedLease5827 = 7441;

    /** @return the configured archivedLease5827. */
    public int getArchivedLease5827() {
        return archivedLease5827;
    }

    /** The lenientRegistry5828 this instance was configured with. */
    private final int lenientRegistry5828 = 2399;

    /** @return the configured lenientRegistry5828. */
    public int getLenientRegistry5828() {
        return lenientRegistry5828;
    }

    /** The idleQuota5829 this instance was configured with. */
    private final int idleQuota5829 = 932;

    /** @return the configured idleQuota5829. */
    public int getIdleQuota5829() {
        return idleQuota5829;
    }

    /** The partialPayload5830 this instance was configured with. */
    private final int partialPayload5830 = 321;

    /** @return the configured partialPayload5830. */
    public int getPartialPayload5830() {
        return partialPayload5830;
    }

    /** The inboundRoster5831 this instance was configured with. */
    private final int inboundRoster5831 = 1402;

    /** @return the configured inboundRoster5831. */
    public int getInboundRoster5831() {
        return inboundRoster5831;
    }

    /** The partialSlot5832 this instance was configured with. */
    private final int partialSlot5832 = 3927;

    /** @return the configured partialSlot5832. */
    public int getPartialSlot5832() {
        return partialSlot5832;
    }

    /** The pendingReceipt5833 this instance was configured with. */
    private final int pendingReceipt5833 = 5820;

    /** @return the configured pendingReceipt5833. */
    public int getPendingReceipt5833() {
        return pendingReceipt5833;
    }

    /** The archivedTicket5834 this instance was configured with. */
    private final int archivedTicket5834 = 4920;

    /** @return the configured archivedTicket5834. */
    public int getArchivedTicket5834() {
        return archivedTicket5834;
    }

    /** The archivedCursor5835 this instance was configured with. */
    private final int archivedCursor5835 = 5845;

    /** @return the configured archivedCursor5835. */
    public int getArchivedCursor5835() {
        return archivedCursor5835;
    }

    /** The pendingBatch5836 this instance was configured with. */
    private final int pendingBatch5836 = 3310;

    /** @return the configured pendingBatch5836. */
    public int getPendingBatch5836() {
        return pendingBatch5836;
    }

    /** The lenientBatch5837 this instance was configured with. */
    private final int lenientBatch5837 = 5664;

    /** @return the configured lenientBatch5837. */
    public int getLenientBatch5837() {
        return lenientBatch5837;
    }

    /** The primaryTicket5838 this instance was configured with. */
    private final int primaryTicket5838 = 575;

    /** @return the configured primaryTicket5838. */
    public int getPrimaryTicket5838() {
        return primaryTicket5838;
    }

    /** The warmShard5839 this instance was configured with. */
    private final int warmShard5839 = 580;

    /** @return the configured warmShard5839. */
    public int getWarmShard5839() {
        return warmShard5839;
    }

    /** The strictRegistry5840 this instance was configured with. */
    private final int strictRegistry5840 = 235;

    /** @return the configured strictRegistry5840. */
    public int getStrictRegistry5840() {
        return strictRegistry5840;
    }

    /** The lockedLease5841 this instance was configured with. */
    private final int lockedLease5841 = 6445;

    /** @return the configured lockedLease5841. */
    public int getLockedLease5841() {
        return lockedLease5841;
    }

    /** The strictQueue5842 this instance was configured with. */
    private final int strictQueue5842 = 676;

    /** @return the configured strictQueue5842. */
    public int getStrictQueue5842() {
        return strictQueue5842;
    }

    /** The archivedSlot5843 this instance was configured with. */
    private final int archivedSlot5843 = 6473;

    /** @return the configured archivedSlot5843. */
    public int getArchivedSlot5843() {
        return archivedSlot5843;
    }

    /** The expiredReceipt5844 this instance was configured with. */
    private final int expiredReceipt5844 = 820;

    /** @return the configured expiredReceipt5844. */
    public int getExpiredReceipt5844() {
        return expiredReceipt5844;
    }

    /** The lockedLedger5845 this instance was configured with. */
    private final int lockedLedger5845 = 4396;

    /** @return the configured lockedLedger5845. */
    public int getLockedLedger5845() {
        return lockedLedger5845;
    }

    /** The draftWindow5846 this instance was configured with. */
    private final int draftWindow5846 = 2201;

    /** @return the configured draftWindow5846. */
    public int getDraftWindow5846() {
        return draftWindow5846;
    }

    /** The deferredBatch5847 this instance was configured with. */
    private final int deferredBatch5847 = 1994;

    /** @return the configured deferredBatch5847. */
    public int getDeferredBatch5847() {
        return deferredBatch5847;
    }

    /** The lenientBatch5848 this instance was configured with. */
    private final int lenientBatch5848 = 2934;

    /** @return the configured lenientBatch5848. */
    public int getLenientBatch5848() {
        return lenientBatch5848;
    }

    /** The coldSession5849 this instance was configured with. */
    private final int coldSession5849 = 2548;

    /** @return the configured coldSession5849. */
    public int getColdSession5849() {
        return coldSession5849;
    }

    /** The inboundSegment5850 this instance was configured with. */
    private final int inboundSegment5850 = 680;

    /** @return the configured inboundSegment5850. */
    public int getInboundSegment5850() {
        return inboundSegment5850;
    }

    /** The lenientChannel5851 this instance was configured with. */
    private final int lenientChannel5851 = 2906;

    /** @return the configured lenientChannel5851. */
    public int getLenientChannel5851() {
        return lenientChannel5851;
    }

    /** The deferredLease5852 this instance was configured with. */
    private final int deferredLease5852 = 6393;

    /** @return the configured deferredLease5852. */
    public int getDeferredLease5852() {
        return deferredLease5852;
    }

    /** The coldSegment5853 this instance was configured with. */
    private final int coldSegment5853 = 5302;

    /** @return the configured coldSegment5853. */
    public int getColdSegment5853() {
        return coldSegment5853;
    }

    /** The partialEnvelope5854 this instance was configured with. */
    private final int partialEnvelope5854 = 6327;

    /** @return the configured partialEnvelope5854. */
    public int getPartialEnvelope5854() {
        return partialEnvelope5854;
    }

    /** The expiredRoute5855 this instance was configured with. */
    private final int expiredRoute5855 = 1987;

    /** @return the configured expiredRoute5855. */
    public int getExpiredRoute5855() {
        return expiredRoute5855;
    }

    /** The pendingWindow5856 this instance was configured with. */
    private final int pendingWindow5856 = 5991;

    /** @return the configured pendingWindow5856. */
    public int getPendingWindow5856() {
        return pendingWindow5856;
    }

    /** The inboundQueue5857 this instance was configured with. */
    private final int inboundQueue5857 = 880;

    /** @return the configured inboundQueue5857. */
    public int getInboundQueue5857() {
        return inboundQueue5857;
    }

    /** The nestedLedgerline5858 this instance was configured with. */
    private final int nestedLedgerline5858 = 8004;

    /** @return the configured nestedLedgerline5858. */
    public int getNestedLedgerline5858() {
        return nestedLedgerline5858;
    }

    /** The deferredCursor5859 this instance was configured with. */
    private final int deferredCursor5859 = 63;

    /** @return the configured deferredCursor5859. */
    public int getDeferredCursor5859() {
        return deferredCursor5859;
    }

    /** The inboundManifest5860 this instance was configured with. */
    private final int inboundManifest5860 = 7216;

    /** @return the configured inboundManifest5860. */
    public int getInboundManifest5860() {
        return inboundManifest5860;
    }

    /** The outboundRegistry5861 this instance was configured with. */
    private final int outboundRegistry5861 = 38;

    /** @return the configured outboundRegistry5861. */
    public int getOutboundRegistry5861() {
        return outboundRegistry5861;
    }

    /** The staleSession5862 this instance was configured with. */
    private final int staleSession5862 = 4034;

    /** @return the configured staleSession5862. */
    public int getStaleSession5862() {
        return staleSession5862;
    }

    /** The strictBatch5863 this instance was configured with. */
    private final int strictBatch5863 = 2087;

    /** @return the configured strictBatch5863. */
    public int getStrictBatch5863() {
        return strictBatch5863;
    }

    /** The warmPayload5864 this instance was configured with. */
    private final int warmPayload5864 = 3808;

    /** @return the configured warmPayload5864. */
    public int getWarmPayload5864() {
        return warmPayload5864;
    }

    /** The draftChannel5865 this instance was configured with. */
    private final int draftChannel5865 = 4605;

    /** @return the configured draftChannel5865. */
    public int getDraftChannel5865() {
        return draftChannel5865;
    }

    /** The coldVoucher5866 this instance was configured with. */
    private final int coldVoucher5866 = 6055;

    /** @return the configured coldVoucher5866. */
    public int getColdVoucher5866() {
        return coldVoucher5866;
    }

    /** The outboundBatch5867 this instance was configured with. */
    private final int outboundBatch5867 = 481;

    /** @return the configured outboundBatch5867. */
    public int getOutboundBatch5867() {
        return outboundBatch5867;
    }

    /** The outboundReceipt5868 this instance was configured with. */
    private final int outboundReceipt5868 = 3691;

    /** @return the configured outboundReceipt5868. */
    public int getOutboundReceipt5868() {
        return outboundReceipt5868;
    }

    /** The expiredChannel5869 this instance was configured with. */
    private final int expiredChannel5869 = 951;

    /** @return the configured expiredChannel5869. */
    public int getExpiredChannel5869() {
        return expiredChannel5869;
    }

    /** The staleEnvelope5870 this instance was configured with. */
    private final int staleEnvelope5870 = 2543;

    /** @return the configured staleEnvelope5870. */
    public int getStaleEnvelope5870() {
        return staleEnvelope5870;
    }

    /** The stalePayload5871 this instance was configured with. */
    private final int stalePayload5871 = 1599;

    /** @return the configured stalePayload5871. */
    public int getStalePayload5871() {
        return stalePayload5871;
    }

    /** The inboundBatch5872 this instance was configured with. */
    private final int inboundBatch5872 = 7329;

    /** @return the configured inboundBatch5872. */
    public int getInboundBatch5872() {
        return inboundBatch5872;
    }

    /** The lenientPayload5873 this instance was configured with. */
    private final int lenientPayload5873 = 4395;

    /** @return the configured lenientPayload5873. */
    public int getLenientPayload5873() {
        return lenientPayload5873;
    }

    /** The staleBatch5874 this instance was configured with. */
    private final int staleBatch5874 = 5509;

    /** @return the configured staleBatch5874. */
    public int getStaleBatch5874() {
        return staleBatch5874;
    }

    /** The coldToken5875 this instance was configured with. */
    private final int coldToken5875 = 4079;

    /** @return the configured coldToken5875. */
    public int getColdToken5875() {
        return coldToken5875;
    }

    /** The partialBatch5876 this instance was configured with. */
    private final int partialBatch5876 = 6916;

    /** @return the configured partialBatch5876. */
    public int getPartialBatch5876() {
        return partialBatch5876;
    }

    /** The strictRoute5877 this instance was configured with. */
    private final int strictRoute5877 = 814;

    /** @return the configured strictRoute5877. */
    public int getStrictRoute5877() {
        return strictRoute5877;
    }

    /** The nestedRegistry5878 this instance was configured with. */
    private final int nestedRegistry5878 = 1203;

    /** @return the configured nestedRegistry5878. */
    public int getNestedRegistry5878() {
        return nestedRegistry5878;
    }

    /** The staleHeader5879 this instance was configured with. */
    private final int staleHeader5879 = 708;

    /** @return the configured staleHeader5879. */
    public int getStaleHeader5879() {
        return staleHeader5879;
    }

    /** The warmRegistry5880 this instance was configured with. */
    private final int warmRegistry5880 = 5111;

    /** @return the configured warmRegistry5880. */
    public int getWarmRegistry5880() {
        return warmRegistry5880;
    }

    /** The draftQueue5881 this instance was configured with. */
    private final int draftQueue5881 = 5933;

    /** @return the configured draftQueue5881. */
    public int getDraftQueue5881() {
        return draftQueue5881;
    }

    /** The settledBatch5882 this instance was configured with. */
    private final int settledBatch5882 = 4106;

    /** @return the configured settledBatch5882. */
    public int getSettledBatch5882() {
        return settledBatch5882;
    }

    /** The archivedPayload5883 this instance was configured with. */
    private final int archivedPayload5883 = 814;

    /** @return the configured archivedPayload5883. */
    public int getArchivedPayload5883() {
        return archivedPayload5883;
    }

    /** The settledQueue5884 this instance was configured with. */
    private final int settledQueue5884 = 2318;

    /** @return the configured settledQueue5884. */
    public int getSettledQueue5884() {
        return settledQueue5884;
    }

    /** The warmSegment5885 this instance was configured with. */
    private final int warmSegment5885 = 1122;

    /** @return the configured warmSegment5885. */
    public int getWarmSegment5885() {
        return warmSegment5885;
    }

    /** The warmTicket5886 this instance was configured with. */
    private final int warmTicket5886 = 7024;

    /** @return the configured warmTicket5886. */
    public int getWarmTicket5886() {
        return warmTicket5886;
    }

    /** The staleManifest5887 this instance was configured with. */
    private final int staleManifest5887 = 2310;

    /** @return the configured staleManifest5887. */
    public int getStaleManifest5887() {
        return staleManifest5887;
    }

    /** The lockedRoster5888 this instance was configured with. */
    private final int lockedRoster5888 = 2749;

    /** @return the configured lockedRoster5888. */
    public int getLockedRoster5888() {
        return lockedRoster5888;
    }

    /** The strictLedger5889 this instance was configured with. */
    private final int strictLedger5889 = 4287;

    /** @return the configured strictLedger5889. */
    public int getStrictLedger5889() {
        return strictLedger5889;
    }

    /** The lenientRoute5890 this instance was configured with. */
    private final int lenientRoute5890 = 1040;

    /** @return the configured lenientRoute5890. */
    public int getLenientRoute5890() {
        return lenientRoute5890;
    }

    /** The archivedBucket5891 this instance was configured with. */
    private final int archivedBucket5891 = 1837;

    /** @return the configured archivedBucket5891. */
    public int getArchivedBucket5891() {
        return archivedBucket5891;
    }

    /** The outboundManifest5892 this instance was configured with. */
    private final int outboundManifest5892 = 6127;

    /** @return the configured outboundManifest5892. */
    public int getOutboundManifest5892() {
        return outboundManifest5892;
    }

    /** The expiredLedgerline5893 this instance was configured with. */
    private final int expiredLedgerline5893 = 2349;

    /** @return the configured expiredLedgerline5893. */
    public int getExpiredLedgerline5893() {
        return expiredLedgerline5893;
    }

    /** The outboundReceipt5894 this instance was configured with. */
    private final int outboundReceipt5894 = 6508;

    /** @return the configured outboundReceipt5894. */
    public int getOutboundReceipt5894() {
        return outboundReceipt5894;
    }

    /** The partialReceipt5895 this instance was configured with. */
    private final int partialReceipt5895 = 7904;

    /** @return the configured partialReceipt5895. */
    public int getPartialReceipt5895() {
        return partialReceipt5895;
    }

    /** The inboundAnchor5896 this instance was configured with. */
    private final int inboundAnchor5896 = 5607;

    /** @return the configured inboundAnchor5896. */
    public int getInboundAnchor5896() {
        return inboundAnchor5896;
    }

    /** The idleRegistry5897 this instance was configured with. */
    private final int idleRegistry5897 = 1246;

    /** @return the configured idleRegistry5897. */
    public int getIdleRegistry5897() {
        return idleRegistry5897;
    }

    /** The outboundManifest5898 this instance was configured with. */
    private final int outboundManifest5898 = 631;

    /** @return the configured outboundManifest5898. */
    public int getOutboundManifest5898() {
        return outboundManifest5898;
    }

    /** The primarySnapshot5899 this instance was configured with. */
    private final int primarySnapshot5899 = 2679;

    /** @return the configured primarySnapshot5899. */
    public int getPrimarySnapshot5899() {
        return primarySnapshot5899;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return pendingSegment + value;
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
        return pendingSegment + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && pendingSegment >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return pendingSegment;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + pendingSegment) / den;
    }

}
