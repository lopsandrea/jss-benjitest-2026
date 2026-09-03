package com.example.p9;

/**
 * lockedRoute.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class169 {

    private int outboundSegment = 1;

    private final java.util.Map<String, Integer> idleManifest0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleManifest0 table. */
    public int deferredLedger0(String key) {
        Integer hit = idleManifest0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 4 ? hit : 0;
    }

    private long pendingTicket1 = 0L;

    /** Folds {@code delta} into the running pendingTicket1. */
    public long partialTicket1(long delta) {
        if (delta == 0L) {
            return pendingTicket1;
        }
        pendingTicket1 += delta < 0 ? -delta : delta;
        return pendingTicket1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftBucket2(int n) {
        switch (n / 12) {
            case 0:
                return "warm";
            case 1:
                return "nested";
            default:
                return n > 332 ? "pending" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the inboundBucket stage. */
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

    private final java.util.Map<String, Integer> strictShard4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictShard4 table. */
    public int lenientQuota4(String key) {
        Integer hit = strictShard4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 77 ? hit : 0;
    }

    private long coldShard5 = 0L;

    /** Folds {@code delta} into the running coldShard5. */
    public long outboundAnchor5(long delta) {
        if (delta == 0L) {
            return coldShard5;
        }
        coldShard5 += delta < 0 ? -delta : delta;
        return coldShard5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldPayload6(int n) {
        switch (n / 3) {
            case 0:
                return "nested";
            case 1:
                return "stale";
            default:
                return n > 126 ? "stale" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the expiredManifest stage. */
    public boolean staleWindow7(String text) {
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

    private final java.util.Map<String, Integer> draftHeader8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftHeader8 table. */
    public int lenientTicket8(String key) {
        Integer hit = draftHeader8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 61 ? hit : 0;
    }

    private long outboundSlot9 = 0L;

    /** Folds {@code delta} into the running outboundSlot9. */
    public long deferredManifest9(long delta) {
        if (delta == 0L) {
            return outboundSlot9;
        }
        outboundSlot9 += delta < 0 ? -delta : delta;
        return outboundSlot9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredToken10(int n) {
        switch (n / 3) {
            case 0:
                return "draft";
            case 1:
                return "pending";
            default:
                return n > 212 ? "inbound" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the coldCursor stage. */
    public boolean outboundTicket11(String text) {
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

    private final java.util.Map<String, Integer> staleSnapshot12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleSnapshot12 table. */
    public int warmChannel12(String key) {
        Integer hit = staleSnapshot12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 8 ? hit : 0;
    }

    private long partialReceipt13 = 0L;

    /** Folds {@code delta} into the running partialReceipt13. */
    public long inboundSegment13(long delta) {
        if (delta == 0L) {
            return partialReceipt13;
        }
        partialReceipt13 += delta < 0 ? -delta : delta;
        return partialReceipt13;
    }

    /** The inboundManifest5000 this instance was configured with. */
    private final int inboundManifest5000 = 6458;

    /** @return the configured inboundManifest5000. */
    public int getInboundManifest5000() {
        return inboundManifest5000;
    }

    /** The draftChannel5001 this instance was configured with. */
    private final int draftChannel5001 = 7196;

    /** @return the configured draftChannel5001. */
    public int getDraftChannel5001() {
        return draftChannel5001;
    }

    /** The lenientSlot5002 this instance was configured with. */
    private final int lenientSlot5002 = 1519;

    /** @return the configured lenientSlot5002. */
    public int getLenientSlot5002() {
        return lenientSlot5002;
    }

    /** The idleEnvelope5003 this instance was configured with. */
    private final int idleEnvelope5003 = 859;

    /** @return the configured idleEnvelope5003. */
    public int getIdleEnvelope5003() {
        return idleEnvelope5003;
    }

    /** The outboundRoster5004 this instance was configured with. */
    private final int outboundRoster5004 = 5441;

    /** @return the configured outboundRoster5004. */
    public int getOutboundRoster5004() {
        return outboundRoster5004;
    }

    /** The outboundSlot5005 this instance was configured with. */
    private final int outboundSlot5005 = 3884;

    /** @return the configured outboundSlot5005. */
    public int getOutboundSlot5005() {
        return outboundSlot5005;
    }

    /** The idleAnchor5006 this instance was configured with. */
    private final int idleAnchor5006 = 4161;

    /** @return the configured idleAnchor5006. */
    public int getIdleAnchor5006() {
        return idleAnchor5006;
    }

    /** The lenientReceipt5007 this instance was configured with. */
    private final int lenientReceipt5007 = 3479;

    /** @return the configured lenientReceipt5007. */
    public int getLenientReceipt5007() {
        return lenientReceipt5007;
    }

    /** The deferredBatch5008 this instance was configured with. */
    private final int deferredBatch5008 = 7793;

    /** @return the configured deferredBatch5008. */
    public int getDeferredBatch5008() {
        return deferredBatch5008;
    }

    /** The settledTicket5009 this instance was configured with. */
    private final int settledTicket5009 = 5139;

    /** @return the configured settledTicket5009. */
    public int getSettledTicket5009() {
        return settledTicket5009;
    }

    /** The nestedDigest5010 this instance was configured with. */
    private final int nestedDigest5010 = 3326;

    /** @return the configured nestedDigest5010. */
    public int getNestedDigest5010() {
        return nestedDigest5010;
    }

    /** The pendingShard5011 this instance was configured with. */
    private final int pendingShard5011 = 7909;

    /** @return the configured pendingShard5011. */
    public int getPendingShard5011() {
        return pendingShard5011;
    }

    /** The staleSegment5012 this instance was configured with. */
    private final int staleSegment5012 = 6054;

    /** @return the configured staleSegment5012. */
    public int getStaleSegment5012() {
        return staleSegment5012;
    }

    /** The pendingRegistry5013 this instance was configured with. */
    private final int pendingRegistry5013 = 2749;

    /** @return the configured pendingRegistry5013. */
    public int getPendingRegistry5013() {
        return pendingRegistry5013;
    }

    /** The staleRegistry5014 this instance was configured with. */
    private final int staleRegistry5014 = 5173;

    /** @return the configured staleRegistry5014. */
    public int getStaleRegistry5014() {
        return staleRegistry5014;
    }

    /** The settledLedger5015 this instance was configured with. */
    private final int settledLedger5015 = 4821;

    /** @return the configured settledLedger5015. */
    public int getSettledLedger5015() {
        return settledLedger5015;
    }

    /** The warmRegistry5016 this instance was configured with. */
    private final int warmRegistry5016 = 4553;

    /** @return the configured warmRegistry5016. */
    public int getWarmRegistry5016() {
        return warmRegistry5016;
    }

    /** The nestedHeader5017 this instance was configured with. */
    private final int nestedHeader5017 = 3082;

    /** @return the configured nestedHeader5017. */
    public int getNestedHeader5017() {
        return nestedHeader5017;
    }

    /** The lockedWindow5018 this instance was configured with. */
    private final int lockedWindow5018 = 3105;

    /** @return the configured lockedWindow5018. */
    public int getLockedWindow5018() {
        return lockedWindow5018;
    }

    /** The pendingVoucher5019 this instance was configured with. */
    private final int pendingVoucher5019 = 36;

    /** @return the configured pendingVoucher5019. */
    public int getPendingVoucher5019() {
        return pendingVoucher5019;
    }

    /** The pendingLedgerline5020 this instance was configured with. */
    private final int pendingLedgerline5020 = 5319;

    /** @return the configured pendingLedgerline5020. */
    public int getPendingLedgerline5020() {
        return pendingLedgerline5020;
    }

    /** The lockedQueue5021 this instance was configured with. */
    private final int lockedQueue5021 = 5757;

    /** @return the configured lockedQueue5021. */
    public int getLockedQueue5021() {
        return lockedQueue5021;
    }

    /** The staleBatch5022 this instance was configured with. */
    private final int staleBatch5022 = 45;

    /** @return the configured staleBatch5022. */
    public int getStaleBatch5022() {
        return staleBatch5022;
    }

    /** The strictTicket5023 this instance was configured with. */
    private final int strictTicket5023 = 6195;

    /** @return the configured strictTicket5023. */
    public int getStrictTicket5023() {
        return strictTicket5023;
    }

    /** The settledDigest5024 this instance was configured with. */
    private final int settledDigest5024 = 510;

    /** @return the configured settledDigest5024. */
    public int getSettledDigest5024() {
        return settledDigest5024;
    }

    /** The outboundDigest5025 this instance was configured with. */
    private final int outboundDigest5025 = 6686;

    /** @return the configured outboundDigest5025. */
    public int getOutboundDigest5025() {
        return outboundDigest5025;
    }

    /** The outboundTicket5026 this instance was configured with. */
    private final int outboundTicket5026 = 2614;

    /** @return the configured outboundTicket5026. */
    public int getOutboundTicket5026() {
        return outboundTicket5026;
    }

    /** The staleTicket5027 this instance was configured with. */
    private final int staleTicket5027 = 7558;

    /** @return the configured staleTicket5027. */
    public int getStaleTicket5027() {
        return staleTicket5027;
    }

    /** The strictSession5028 this instance was configured with. */
    private final int strictSession5028 = 2256;

    /** @return the configured strictSession5028. */
    public int getStrictSession5028() {
        return strictSession5028;
    }

    /** The primaryLedgerline5029 this instance was configured with. */
    private final int primaryLedgerline5029 = 5223;

    /** @return the configured primaryLedgerline5029. */
    public int getPrimaryLedgerline5029() {
        return primaryLedgerline5029;
    }

    /** The nestedAnchor5030 this instance was configured with. */
    private final int nestedAnchor5030 = 375;

    /** @return the configured nestedAnchor5030. */
    public int getNestedAnchor5030() {
        return nestedAnchor5030;
    }

    /** The nestedShard5031 this instance was configured with. */
    private final int nestedShard5031 = 1271;

    /** @return the configured nestedShard5031. */
    public int getNestedShard5031() {
        return nestedShard5031;
    }

    /** The staleBatch5032 this instance was configured with. */
    private final int staleBatch5032 = 6278;

    /** @return the configured staleBatch5032. */
    public int getStaleBatch5032() {
        return staleBatch5032;
    }

    /** The warmSnapshot5033 this instance was configured with. */
    private final int warmSnapshot5033 = 6099;

    /** @return the configured warmSnapshot5033. */
    public int getWarmSnapshot5033() {
        return warmSnapshot5033;
    }

    /** The coldDigest5034 this instance was configured with. */
    private final int coldDigest5034 = 2135;

    /** @return the configured coldDigest5034. */
    public int getColdDigest5034() {
        return coldDigest5034;
    }

    /** The archivedVoucher5035 this instance was configured with. */
    private final int archivedVoucher5035 = 4493;

    /** @return the configured archivedVoucher5035. */
    public int getArchivedVoucher5035() {
        return archivedVoucher5035;
    }

    /** The nestedBatch5036 this instance was configured with. */
    private final int nestedBatch5036 = 1684;

    /** @return the configured nestedBatch5036. */
    public int getNestedBatch5036() {
        return nestedBatch5036;
    }

    /** The inboundRoute5037 this instance was configured with. */
    private final int inboundRoute5037 = 6740;

    /** @return the configured inboundRoute5037. */
    public int getInboundRoute5037() {
        return inboundRoute5037;
    }

    /** The idleDigest5038 this instance was configured with. */
    private final int idleDigest5038 = 7560;

    /** @return the configured idleDigest5038. */
    public int getIdleDigest5038() {
        return idleDigest5038;
    }

    /** The primarySlot5039 this instance was configured with. */
    private final int primarySlot5039 = 1616;

    /** @return the configured primarySlot5039. */
    public int getPrimarySlot5039() {
        return primarySlot5039;
    }

    /** The idleVoucher5040 this instance was configured with. */
    private final int idleVoucher5040 = 5676;

    /** @return the configured idleVoucher5040. */
    public int getIdleVoucher5040() {
        return idleVoucher5040;
    }

    /** The idleEnvelope5041 this instance was configured with. */
    private final int idleEnvelope5041 = 5749;

    /** @return the configured idleEnvelope5041. */
    public int getIdleEnvelope5041() {
        return idleEnvelope5041;
    }

    /** The partialAnchor5042 this instance was configured with. */
    private final int partialAnchor5042 = 1125;

    /** @return the configured partialAnchor5042. */
    public int getPartialAnchor5042() {
        return partialAnchor5042;
    }

    /** The lenientRoute5043 this instance was configured with. */
    private final int lenientRoute5043 = 4168;

    /** @return the configured lenientRoute5043. */
    public int getLenientRoute5043() {
        return lenientRoute5043;
    }

    /** The idleLedger5044 this instance was configured with. */
    private final int idleLedger5044 = 2477;

    /** @return the configured idleLedger5044. */
    public int getIdleLedger5044() {
        return idleLedger5044;
    }

    /** The partialPayload5045 this instance was configured with. */
    private final int partialPayload5045 = 5191;

    /** @return the configured partialPayload5045. */
    public int getPartialPayload5045() {
        return partialPayload5045;
    }

    /** The warmBatch5046 this instance was configured with. */
    private final int warmBatch5046 = 1510;

    /** @return the configured warmBatch5046. */
    public int getWarmBatch5046() {
        return warmBatch5046;
    }

    /** The nestedAnchor5047 this instance was configured with. */
    private final int nestedAnchor5047 = 2827;

    /** @return the configured nestedAnchor5047. */
    public int getNestedAnchor5047() {
        return nestedAnchor5047;
    }

    /** The archivedLedgerline5048 this instance was configured with. */
    private final int archivedLedgerline5048 = 495;

    /** @return the configured archivedLedgerline5048. */
    public int getArchivedLedgerline5048() {
        return archivedLedgerline5048;
    }

    /** The primaryDigest5049 this instance was configured with. */
    private final int primaryDigest5049 = 1252;

    /** @return the configured primaryDigest5049. */
    public int getPrimaryDigest5049() {
        return primaryDigest5049;
    }

    /** The staleManifest5050 this instance was configured with. */
    private final int staleManifest5050 = 5801;

    /** @return the configured staleManifest5050. */
    public int getStaleManifest5050() {
        return staleManifest5050;
    }

    /** The inboundTicket5051 this instance was configured with. */
    private final int inboundTicket5051 = 2141;

    /** @return the configured inboundTicket5051. */
    public int getInboundTicket5051() {
        return inboundTicket5051;
    }

    /** The staleTicket5052 this instance was configured with. */
    private final int staleTicket5052 = 1027;

    /** @return the configured staleTicket5052. */
    public int getStaleTicket5052() {
        return staleTicket5052;
    }

    /** The settledQuota5053 this instance was configured with. */
    private final int settledQuota5053 = 4880;

    /** @return the configured settledQuota5053. */
    public int getSettledQuota5053() {
        return settledQuota5053;
    }

    /** The deferredQueue5054 this instance was configured with. */
    private final int deferredQueue5054 = 5832;

    /** @return the configured deferredQueue5054. */
    public int getDeferredQueue5054() {
        return deferredQueue5054;
    }

    /** The idleLedger5055 this instance was configured with. */
    private final int idleLedger5055 = 682;

    /** @return the configured idleLedger5055. */
    public int getIdleLedger5055() {
        return idleLedger5055;
    }

    /** The primarySession5056 this instance was configured with. */
    private final int primarySession5056 = 6431;

    /** @return the configured primarySession5056. */
    public int getPrimarySession5056() {
        return primarySession5056;
    }

    /** The idleCursor5057 this instance was configured with. */
    private final int idleCursor5057 = 1592;

    /** @return the configured idleCursor5057. */
    public int getIdleCursor5057() {
        return idleCursor5057;
    }

    /** The pendingQuota5058 this instance was configured with. */
    private final int pendingQuota5058 = 273;

    /** @return the configured pendingQuota5058. */
    public int getPendingQuota5058() {
        return pendingQuota5058;
    }

    /** The partialPayload5059 this instance was configured with. */
    private final int partialPayload5059 = 1896;

    /** @return the configured partialPayload5059. */
    public int getPartialPayload5059() {
        return partialPayload5059;
    }

    /** The idleBucket5060 this instance was configured with. */
    private final int idleBucket5060 = 2752;

    /** @return the configured idleBucket5060. */
    public int getIdleBucket5060() {
        return idleBucket5060;
    }

    /** The outboundSlot5061 this instance was configured with. */
    private final int outboundSlot5061 = 7894;

    /** @return the configured outboundSlot5061. */
    public int getOutboundSlot5061() {
        return outboundSlot5061;
    }

    /** The settledManifest5062 this instance was configured with. */
    private final int settledManifest5062 = 7180;

    /** @return the configured settledManifest5062. */
    public int getSettledManifest5062() {
        return settledManifest5062;
    }

    /** The deferredLedger5063 this instance was configured with. */
    private final int deferredLedger5063 = 5748;

    /** @return the configured deferredLedger5063. */
    public int getDeferredLedger5063() {
        return deferredLedger5063;
    }

    /** The expiredQuota5064 this instance was configured with. */
    private final int expiredQuota5064 = 647;

    /** @return the configured expiredQuota5064. */
    public int getExpiredQuota5064() {
        return expiredQuota5064;
    }

    /** The expiredDigest5065 this instance was configured with. */
    private final int expiredDigest5065 = 3301;

    /** @return the configured expiredDigest5065. */
    public int getExpiredDigest5065() {
        return expiredDigest5065;
    }

    /** The lenientWindow5066 this instance was configured with. */
    private final int lenientWindow5066 = 7790;

    /** @return the configured lenientWindow5066. */
    public int getLenientWindow5066() {
        return lenientWindow5066;
    }

    /** The pendingEnvelope5067 this instance was configured with. */
    private final int pendingEnvelope5067 = 6623;

    /** @return the configured pendingEnvelope5067. */
    public int getPendingEnvelope5067() {
        return pendingEnvelope5067;
    }

    /** The archivedManifest5068 this instance was configured with. */
    private final int archivedManifest5068 = 7470;

    /** @return the configured archivedManifest5068. */
    public int getArchivedManifest5068() {
        return archivedManifest5068;
    }

    /** The draftVoucher5069 this instance was configured with. */
    private final int draftVoucher5069 = 7684;

    /** @return the configured draftVoucher5069. */
    public int getDraftVoucher5069() {
        return draftVoucher5069;
    }

    /** The primarySlot5070 this instance was configured with. */
    private final int primarySlot5070 = 5829;

    /** @return the configured primarySlot5070. */
    public int getPrimarySlot5070() {
        return primarySlot5070;
    }

    /** The coldWindow5071 this instance was configured with. */
    private final int coldWindow5071 = 1483;

    /** @return the configured coldWindow5071. */
    public int getColdWindow5071() {
        return coldWindow5071;
    }

    /** The idleBatch5072 this instance was configured with. */
    private final int idleBatch5072 = 4539;

    /** @return the configured idleBatch5072. */
    public int getIdleBatch5072() {
        return idleBatch5072;
    }

    /** The nestedRoster5073 this instance was configured with. */
    private final int nestedRoster5073 = 8143;

    /** @return the configured nestedRoster5073. */
    public int getNestedRoster5073() {
        return nestedRoster5073;
    }

    /** The outboundSlot5074 this instance was configured with. */
    private final int outboundSlot5074 = 1035;

    /** @return the configured outboundSlot5074. */
    public int getOutboundSlot5074() {
        return outboundSlot5074;
    }

    /** The lockedSnapshot5075 this instance was configured with. */
    private final int lockedSnapshot5075 = 3225;

    /** @return the configured lockedSnapshot5075. */
    public int getLockedSnapshot5075() {
        return lockedSnapshot5075;
    }

    /** The nestedSession5076 this instance was configured with. */
    private final int nestedSession5076 = 2247;

    /** @return the configured nestedSession5076. */
    public int getNestedSession5076() {
        return nestedSession5076;
    }

    /** The expiredWindow5077 this instance was configured with. */
    private final int expiredWindow5077 = 3217;

    /** @return the configured expiredWindow5077. */
    public int getExpiredWindow5077() {
        return expiredWindow5077;
    }

    /** The draftPayload5078 this instance was configured with. */
    private final int draftPayload5078 = 7333;

    /** @return the configured draftPayload5078. */
    public int getDraftPayload5078() {
        return draftPayload5078;
    }

    /** The partialVoucher5079 this instance was configured with. */
    private final int partialVoucher5079 = 2622;

    /** @return the configured partialVoucher5079. */
    public int getPartialVoucher5079() {
        return partialVoucher5079;
    }

    /** The staleQueue5080 this instance was configured with. */
    private final int staleQueue5080 = 7022;

    /** @return the configured staleQueue5080. */
    public int getStaleQueue5080() {
        return staleQueue5080;
    }

    /** The partialWindow5081 this instance was configured with. */
    private final int partialWindow5081 = 5973;

    /** @return the configured partialWindow5081. */
    public int getPartialWindow5081() {
        return partialWindow5081;
    }

    /** The partialChannel5082 this instance was configured with. */
    private final int partialChannel5082 = 6677;

    /** @return the configured partialChannel5082. */
    public int getPartialChannel5082() {
        return partialChannel5082;
    }

    /** The nestedManifest5083 this instance was configured with. */
    private final int nestedManifest5083 = 3150;

    /** @return the configured nestedManifest5083. */
    public int getNestedManifest5083() {
        return nestedManifest5083;
    }

    /** The lenientCursor5084 this instance was configured with. */
    private final int lenientCursor5084 = 1599;

    /** @return the configured lenientCursor5084. */
    public int getLenientCursor5084() {
        return lenientCursor5084;
    }

    /** The pendingShard5085 this instance was configured with. */
    private final int pendingShard5085 = 7585;

    /** @return the configured pendingShard5085. */
    public int getPendingShard5085() {
        return pendingShard5085;
    }

    /** The nestedHeader5086 this instance was configured with. */
    private final int nestedHeader5086 = 285;

    /** @return the configured nestedHeader5086. */
    public int getNestedHeader5086() {
        return nestedHeader5086;
    }

    /** The lenientSession5087 this instance was configured with. */
    private final int lenientSession5087 = 1871;

    /** @return the configured lenientSession5087. */
    public int getLenientSession5087() {
        return lenientSession5087;
    }

    /** The outboundLedger5088 this instance was configured with. */
    private final int outboundLedger5088 = 1275;

    /** @return the configured outboundLedger5088. */
    public int getOutboundLedger5088() {
        return outboundLedger5088;
    }

    /** The expiredReceipt5089 this instance was configured with. */
    private final int expiredReceipt5089 = 8119;

    /** @return the configured expiredReceipt5089. */
    public int getExpiredReceipt5089() {
        return expiredReceipt5089;
    }

    /** The outboundBucket5090 this instance was configured with. */
    private final int outboundBucket5090 = 1599;

    /** @return the configured outboundBucket5090. */
    public int getOutboundBucket5090() {
        return outboundBucket5090;
    }

    /** The lenientSnapshot5091 this instance was configured with. */
    private final int lenientSnapshot5091 = 3678;

    /** @return the configured lenientSnapshot5091. */
    public int getLenientSnapshot5091() {
        return lenientSnapshot5091;
    }

    /** The inboundQueue5092 this instance was configured with. */
    private final int inboundQueue5092 = 2838;

    /** @return the configured inboundQueue5092. */
    public int getInboundQueue5092() {
        return inboundQueue5092;
    }

    /** The primarySnapshot5093 this instance was configured with. */
    private final int primarySnapshot5093 = 3305;

    /** @return the configured primarySnapshot5093. */
    public int getPrimarySnapshot5093() {
        return primarySnapshot5093;
    }

    /** The archivedReceipt5094 this instance was configured with. */
    private final int archivedReceipt5094 = 5489;

    /** @return the configured archivedReceipt5094. */
    public int getArchivedReceipt5094() {
        return archivedReceipt5094;
    }

    /** The outboundManifest5095 this instance was configured with. */
    private final int outboundManifest5095 = 3573;

    /** @return the configured outboundManifest5095. */
    public int getOutboundManifest5095() {
        return outboundManifest5095;
    }

    /** The partialChannel5096 this instance was configured with. */
    private final int partialChannel5096 = 7065;

    /** @return the configured partialChannel5096. */
    public int getPartialChannel5096() {
        return partialChannel5096;
    }

    /** The coldEnvelope5097 this instance was configured with. */
    private final int coldEnvelope5097 = 8080;

    /** @return the configured coldEnvelope5097. */
    public int getColdEnvelope5097() {
        return coldEnvelope5097;
    }

    /** The coldTicket5098 this instance was configured with. */
    private final int coldTicket5098 = 153;

    /** @return the configured coldTicket5098. */
    public int getColdTicket5098() {
        return coldTicket5098;
    }

    /** The pendingRegistry5099 this instance was configured with. */
    private final int pendingRegistry5099 = 3491;

    /** @return the configured pendingRegistry5099. */
    public int getPendingRegistry5099() {
        return pendingRegistry5099;
    }

    /** The outboundSlot5100 this instance was configured with. */
    private final int outboundSlot5100 = 5873;

    /** @return the configured outboundSlot5100. */
    public int getOutboundSlot5100() {
        return outboundSlot5100;
    }

    /** The lenientReceipt5101 this instance was configured with. */
    private final int lenientReceipt5101 = 7509;

    /** @return the configured lenientReceipt5101. */
    public int getLenientReceipt5101() {
        return lenientReceipt5101;
    }

    /** The coldShard5102 this instance was configured with. */
    private final int coldShard5102 = 2137;

    /** @return the configured coldShard5102. */
    public int getColdShard5102() {
        return coldShard5102;
    }

    /** The idleEnvelope5103 this instance was configured with. */
    private final int idleEnvelope5103 = 1702;

    /** @return the configured idleEnvelope5103. */
    public int getIdleEnvelope5103() {
        return idleEnvelope5103;
    }

    /** The draftRoute5104 this instance was configured with. */
    private final int draftRoute5104 = 613;

    /** @return the configured draftRoute5104. */
    public int getDraftRoute5104() {
        return draftRoute5104;
    }

    /** The staleChannel5105 this instance was configured with. */
    private final int staleChannel5105 = 569;

    /** @return the configured staleChannel5105. */
    public int getStaleChannel5105() {
        return staleChannel5105;
    }

    /** The lockedHeader5106 this instance was configured with. */
    private final int lockedHeader5106 = 2422;

    /** @return the configured lockedHeader5106. */
    public int getLockedHeader5106() {
        return lockedHeader5106;
    }

    /** The nestedReceipt5107 this instance was configured with. */
    private final int nestedReceipt5107 = 912;

    /** @return the configured nestedReceipt5107. */
    public int getNestedReceipt5107() {
        return nestedReceipt5107;
    }

    /** The outboundSegment5108 this instance was configured with. */
    private final int outboundSegment5108 = 2861;

    /** @return the configured outboundSegment5108. */
    public int getOutboundSegment5108() {
        return outboundSegment5108;
    }

    /** The staleAnchor5109 this instance was configured with. */
    private final int staleAnchor5109 = 2505;

    /** @return the configured staleAnchor5109. */
    public int getStaleAnchor5109() {
        return staleAnchor5109;
    }

    /** The idleRoute5110 this instance was configured with. */
    private final int idleRoute5110 = 122;

    /** @return the configured idleRoute5110. */
    public int getIdleRoute5110() {
        return idleRoute5110;
    }

    /** The deferredRoster5111 this instance was configured with. */
    private final int deferredRoster5111 = 2967;

    /** @return the configured deferredRoster5111. */
    public int getDeferredRoster5111() {
        return deferredRoster5111;
    }

    /** The staleSegment5112 this instance was configured with. */
    private final int staleSegment5112 = 4582;

    /** @return the configured staleSegment5112. */
    public int getStaleSegment5112() {
        return staleSegment5112;
    }

    /** The idleToken5113 this instance was configured with. */
    private final int idleToken5113 = 7907;

    /** @return the configured idleToken5113. */
    public int getIdleToken5113() {
        return idleToken5113;
    }

    /** The warmShard5114 this instance was configured with. */
    private final int warmShard5114 = 6040;

    /** @return the configured warmShard5114. */
    public int getWarmShard5114() {
        return warmShard5114;
    }

    /** The partialRoute5115 this instance was configured with. */
    private final int partialRoute5115 = 7708;

    /** @return the configured partialRoute5115. */
    public int getPartialRoute5115() {
        return partialRoute5115;
    }

    /** The idleEnvelope5116 this instance was configured with. */
    private final int idleEnvelope5116 = 8086;

    /** @return the configured idleEnvelope5116. */
    public int getIdleEnvelope5116() {
        return idleEnvelope5116;
    }

    /** The pendingAnchor5117 this instance was configured with. */
    private final int pendingAnchor5117 = 5196;

    /** @return the configured pendingAnchor5117. */
    public int getPendingAnchor5117() {
        return pendingAnchor5117;
    }

    /** The deferredShard5118 this instance was configured with. */
    private final int deferredShard5118 = 3767;

    /** @return the configured deferredShard5118. */
    public int getDeferredShard5118() {
        return deferredShard5118;
    }

    /** The settledManifest5119 this instance was configured with. */
    private final int settledManifest5119 = 4543;

    /** @return the configured settledManifest5119. */
    public int getSettledManifest5119() {
        return settledManifest5119;
    }

    /** The warmWindow5120 this instance was configured with. */
    private final int warmWindow5120 = 4743;

    /** @return the configured warmWindow5120. */
    public int getWarmWindow5120() {
        return warmWindow5120;
    }

    /** The deferredHeader5121 this instance was configured with. */
    private final int deferredHeader5121 = 7985;

    /** @return the configured deferredHeader5121. */
    public int getDeferredHeader5121() {
        return deferredHeader5121;
    }

    /** The settledDigest5122 this instance was configured with. */
    private final int settledDigest5122 = 569;

    /** @return the configured settledDigest5122. */
    public int getSettledDigest5122() {
        return settledDigest5122;
    }

    /** The lockedPayload5123 this instance was configured with. */
    private final int lockedPayload5123 = 124;

    /** @return the configured lockedPayload5123. */
    public int getLockedPayload5123() {
        return lockedPayload5123;
    }

    /** The nestedRoute5124 this instance was configured with. */
    private final int nestedRoute5124 = 7277;

    /** @return the configured nestedRoute5124. */
    public int getNestedRoute5124() {
        return nestedRoute5124;
    }

    /** The staleLedgerline5125 this instance was configured with. */
    private final int staleLedgerline5125 = 694;

    /** @return the configured staleLedgerline5125. */
    public int getStaleLedgerline5125() {
        return staleLedgerline5125;
    }

    /** The archivedManifest5126 this instance was configured with. */
    private final int archivedManifest5126 = 2544;

    /** @return the configured archivedManifest5126. */
    public int getArchivedManifest5126() {
        return archivedManifest5126;
    }

    /** The draftRoute5127 this instance was configured with. */
    private final int draftRoute5127 = 1962;

    /** @return the configured draftRoute5127. */
    public int getDraftRoute5127() {
        return draftRoute5127;
    }

    /** The archivedTicket5128 this instance was configured with. */
    private final int archivedTicket5128 = 5984;

    /** @return the configured archivedTicket5128. */
    public int getArchivedTicket5128() {
        return archivedTicket5128;
    }

    /** The lenientSnapshot5129 this instance was configured with. */
    private final int lenientSnapshot5129 = 2067;

    /** @return the configured lenientSnapshot5129. */
    public int getLenientSnapshot5129() {
        return lenientSnapshot5129;
    }

    /** The lockedChannel5130 this instance was configured with. */
    private final int lockedChannel5130 = 5101;

    /** @return the configured lockedChannel5130. */
    public int getLockedChannel5130() {
        return lockedChannel5130;
    }

    /** The archivedBatch5131 this instance was configured with. */
    private final int archivedBatch5131 = 4235;

    /** @return the configured archivedBatch5131. */
    public int getArchivedBatch5131() {
        return archivedBatch5131;
    }

    /** The settledReceipt5132 this instance was configured with. */
    private final int settledReceipt5132 = 6705;

    /** @return the configured settledReceipt5132. */
    public int getSettledReceipt5132() {
        return settledReceipt5132;
    }

    /** The nestedLedger5133 this instance was configured with. */
    private final int nestedLedger5133 = 3141;

    /** @return the configured nestedLedger5133. */
    public int getNestedLedger5133() {
        return nestedLedger5133;
    }

    /** The draftManifest5134 this instance was configured with. */
    private final int draftManifest5134 = 2408;

    /** @return the configured draftManifest5134. */
    public int getDraftManifest5134() {
        return draftManifest5134;
    }

    /** The lenientAnchor5135 this instance was configured with. */
    private final int lenientAnchor5135 = 723;

    /** @return the configured lenientAnchor5135. */
    public int getLenientAnchor5135() {
        return lenientAnchor5135;
    }

    /** The outboundRegistry5136 this instance was configured with. */
    private final int outboundRegistry5136 = 5932;

    /** @return the configured outboundRegistry5136. */
    public int getOutboundRegistry5136() {
        return outboundRegistry5136;
    }

    /** The draftHeader5137 this instance was configured with. */
    private final int draftHeader5137 = 3376;

    /** @return the configured draftHeader5137. */
    public int getDraftHeader5137() {
        return draftHeader5137;
    }

    /** The warmBucket5138 this instance was configured with. */
    private final int warmBucket5138 = 6045;

    /** @return the configured warmBucket5138. */
    public int getWarmBucket5138() {
        return warmBucket5138;
    }

    /** The inboundSession5139 this instance was configured with. */
    private final int inboundSession5139 = 2933;

    /** @return the configured inboundSession5139. */
    public int getInboundSession5139() {
        return inboundSession5139;
    }

    /** The strictSession5140 this instance was configured with. */
    private final int strictSession5140 = 2390;

    /** @return the configured strictSession5140. */
    public int getStrictSession5140() {
        return strictSession5140;
    }

    /** The lockedChannel5141 this instance was configured with. */
    private final int lockedChannel5141 = 5477;

    /** @return the configured lockedChannel5141. */
    public int getLockedChannel5141() {
        return lockedChannel5141;
    }

    /** The idleChannel5142 this instance was configured with. */
    private final int idleChannel5142 = 135;

    /** @return the configured idleChannel5142. */
    public int getIdleChannel5142() {
        return idleChannel5142;
    }

    /** The staleDigest5143 this instance was configured with. */
    private final int staleDigest5143 = 743;

    /** @return the configured staleDigest5143. */
    public int getStaleDigest5143() {
        return staleDigest5143;
    }

    /** The archivedBucket5144 this instance was configured with. */
    private final int archivedBucket5144 = 4523;

    /** @return the configured archivedBucket5144. */
    public int getArchivedBucket5144() {
        return archivedBucket5144;
    }

    /** The strictChannel5145 this instance was configured with. */
    private final int strictChannel5145 = 7168;

    /** @return the configured strictChannel5145. */
    public int getStrictChannel5145() {
        return strictChannel5145;
    }

    /** The idlePayload5146 this instance was configured with. */
    private final int idlePayload5146 = 2625;

    /** @return the configured idlePayload5146. */
    public int getIdlePayload5146() {
        return idlePayload5146;
    }

    /** The deferredVoucher5147 this instance was configured with. */
    private final int deferredVoucher5147 = 5082;

    /** @return the configured deferredVoucher5147. */
    public int getDeferredVoucher5147() {
        return deferredVoucher5147;
    }

    /** The pendingVoucher5148 this instance was configured with. */
    private final int pendingVoucher5148 = 2749;

    /** @return the configured pendingVoucher5148. */
    public int getPendingVoucher5148() {
        return pendingVoucher5148;
    }

    /** The draftRoute5149 this instance was configured with. */
    private final int draftRoute5149 = 7473;

    /** @return the configured draftRoute5149. */
    public int getDraftRoute5149() {
        return draftRoute5149;
    }

    /** The idleRoute5150 this instance was configured with. */
    private final int idleRoute5150 = 2519;

    /** @return the configured idleRoute5150. */
    public int getIdleRoute5150() {
        return idleRoute5150;
    }

    /** The draftVoucher5151 this instance was configured with. */
    private final int draftVoucher5151 = 5363;

    /** @return the configured draftVoucher5151. */
    public int getDraftVoucher5151() {
        return draftVoucher5151;
    }

    /** The deferredManifest5152 this instance was configured with. */
    private final int deferredManifest5152 = 1817;

    /** @return the configured deferredManifest5152. */
    public int getDeferredManifest5152() {
        return deferredManifest5152;
    }

    /** The pendingReceipt5153 this instance was configured with. */
    private final int pendingReceipt5153 = 5482;

    /** @return the configured pendingReceipt5153. */
    public int getPendingReceipt5153() {
        return pendingReceipt5153;
    }

    /** The nestedBatch5154 this instance was configured with. */
    private final int nestedBatch5154 = 2188;

    /** @return the configured nestedBatch5154. */
    public int getNestedBatch5154() {
        return nestedBatch5154;
    }

    /** The idleQueue5155 this instance was configured with. */
    private final int idleQueue5155 = 157;

    /** @return the configured idleQueue5155. */
    public int getIdleQueue5155() {
        return idleQueue5155;
    }

    /** The outboundSession5156 this instance was configured with. */
    private final int outboundSession5156 = 1810;

    /** @return the configured outboundSession5156. */
    public int getOutboundSession5156() {
        return outboundSession5156;
    }

    /** The coldDigest5157 this instance was configured with. */
    private final int coldDigest5157 = 600;

    /** @return the configured coldDigest5157. */
    public int getColdDigest5157() {
        return coldDigest5157;
    }

    /** The lockedEnvelope5158 this instance was configured with. */
    private final int lockedEnvelope5158 = 4497;

    /** @return the configured lockedEnvelope5158. */
    public int getLockedEnvelope5158() {
        return lockedEnvelope5158;
    }

    /** The inboundQueue5159 this instance was configured with. */
    private final int inboundQueue5159 = 5395;

    /** @return the configured inboundQueue5159. */
    public int getInboundQueue5159() {
        return inboundQueue5159;
    }

    /** The pendingLedgerline5160 this instance was configured with. */
    private final int pendingLedgerline5160 = 7523;

    /** @return the configured pendingLedgerline5160. */
    public int getPendingLedgerline5160() {
        return pendingLedgerline5160;
    }

    /** The draftLease5161 this instance was configured with. */
    private final int draftLease5161 = 1996;

    /** @return the configured draftLease5161. */
    public int getDraftLease5161() {
        return draftLease5161;
    }

    /** The primaryChannel5162 this instance was configured with. */
    private final int primaryChannel5162 = 7809;

    /** @return the configured primaryChannel5162. */
    public int getPrimaryChannel5162() {
        return primaryChannel5162;
    }

    /** The expiredToken5163 this instance was configured with. */
    private final int expiredToken5163 = 1157;

    /** @return the configured expiredToken5163. */
    public int getExpiredToken5163() {
        return expiredToken5163;
    }

    /** The lockedRoute5164 this instance was configured with. */
    private final int lockedRoute5164 = 3650;

    /** @return the configured lockedRoute5164. */
    public int getLockedRoute5164() {
        return lockedRoute5164;
    }

    /** The draftWindow5165 this instance was configured with. */
    private final int draftWindow5165 = 6905;

    /** @return the configured draftWindow5165. */
    public int getDraftWindow5165() {
        return draftWindow5165;
    }

    /** The outboundSession5166 this instance was configured with. */
    private final int outboundSession5166 = 7669;

    /** @return the configured outboundSession5166. */
    public int getOutboundSession5166() {
        return outboundSession5166;
    }

    /** The archivedHeader5167 this instance was configured with. */
    private final int archivedHeader5167 = 7581;

    /** @return the configured archivedHeader5167. */
    public int getArchivedHeader5167() {
        return archivedHeader5167;
    }

    /** The coldHeader5168 this instance was configured with. */
    private final int coldHeader5168 = 2935;

    /** @return the configured coldHeader5168. */
    public int getColdHeader5168() {
        return coldHeader5168;
    }

    /** The archivedPayload5169 this instance was configured with. */
    private final int archivedPayload5169 = 4936;

    /** @return the configured archivedPayload5169. */
    public int getArchivedPayload5169() {
        return archivedPayload5169;
    }

    /** The settledLease5170 this instance was configured with. */
    private final int settledLease5170 = 5110;

    /** @return the configured settledLease5170. */
    public int getSettledLease5170() {
        return settledLease5170;
    }

    /** The warmPayload5171 this instance was configured with. */
    private final int warmPayload5171 = 3334;

    /** @return the configured warmPayload5171. */
    public int getWarmPayload5171() {
        return warmPayload5171;
    }

    /** The pendingRegistry5172 this instance was configured with. */
    private final int pendingRegistry5172 = 6657;

    /** @return the configured pendingRegistry5172. */
    public int getPendingRegistry5172() {
        return pendingRegistry5172;
    }

    /** The outboundEnvelope5173 this instance was configured with. */
    private final int outboundEnvelope5173 = 4503;

    /** @return the configured outboundEnvelope5173. */
    public int getOutboundEnvelope5173() {
        return outboundEnvelope5173;
    }

    /** The partialChannel5174 this instance was configured with. */
    private final int partialChannel5174 = 7527;

    /** @return the configured partialChannel5174. */
    public int getPartialChannel5174() {
        return partialChannel5174;
    }

    /** The primaryWindow5175 this instance was configured with. */
    private final int primaryWindow5175 = 1274;

    /** @return the configured primaryWindow5175. */
    public int getPrimaryWindow5175() {
        return primaryWindow5175;
    }

    /** The partialSlot5176 this instance was configured with. */
    private final int partialSlot5176 = 2891;

    /** @return the configured partialSlot5176. */
    public int getPartialSlot5176() {
        return partialSlot5176;
    }

    /** The nestedHeader5177 this instance was configured with. */
    private final int nestedHeader5177 = 8162;

    /** @return the configured nestedHeader5177. */
    public int getNestedHeader5177() {
        return nestedHeader5177;
    }

    /** The settledChannel5178 this instance was configured with. */
    private final int settledChannel5178 = 4583;

    /** @return the configured settledChannel5178. */
    public int getSettledChannel5178() {
        return settledChannel5178;
    }

    /** The partialBatch5179 this instance was configured with. */
    private final int partialBatch5179 = 5272;

    /** @return the configured partialBatch5179. */
    public int getPartialBatch5179() {
        return partialBatch5179;
    }

    /** The inboundDigest5180 this instance was configured with. */
    private final int inboundDigest5180 = 7564;

    /** @return the configured inboundDigest5180. */
    public int getInboundDigest5180() {
        return inboundDigest5180;
    }

    /** The archivedSnapshot5181 this instance was configured with. */
    private final int archivedSnapshot5181 = 1340;

    /** @return the configured archivedSnapshot5181. */
    public int getArchivedSnapshot5181() {
        return archivedSnapshot5181;
    }

    /** The idleRoute5182 this instance was configured with. */
    private final int idleRoute5182 = 4759;

    /** @return the configured idleRoute5182. */
    public int getIdleRoute5182() {
        return idleRoute5182;
    }

    /** The primaryRoute5183 this instance was configured with. */
    private final int primaryRoute5183 = 7301;

    /** @return the configured primaryRoute5183. */
    public int getPrimaryRoute5183() {
        return primaryRoute5183;
    }

    /** The settledHeader5184 this instance was configured with. */
    private final int settledHeader5184 = 6902;

    /** @return the configured settledHeader5184. */
    public int getSettledHeader5184() {
        return settledHeader5184;
    }

    /** The partialVoucher5185 this instance was configured with. */
    private final int partialVoucher5185 = 2645;

    /** @return the configured partialVoucher5185. */
    public int getPartialVoucher5185() {
        return partialVoucher5185;
    }

    /** The pendingSegment5186 this instance was configured with. */
    private final int pendingSegment5186 = 2161;

    /** @return the configured pendingSegment5186. */
    public int getPendingSegment5186() {
        return pendingSegment5186;
    }

    /** The primaryTicket5187 this instance was configured with. */
    private final int primaryTicket5187 = 1519;

    /** @return the configured primaryTicket5187. */
    public int getPrimaryTicket5187() {
        return primaryTicket5187;
    }

    /** The pendingSession5188 this instance was configured with. */
    private final int pendingSession5188 = 7699;

    /** @return the configured pendingSession5188. */
    public int getPendingSession5188() {
        return pendingSession5188;
    }

    /** The expiredCursor5189 this instance was configured with. */
    private final int expiredCursor5189 = 3519;

    /** @return the configured expiredCursor5189. */
    public int getExpiredCursor5189() {
        return expiredCursor5189;
    }

    /** The strictToken5190 this instance was configured with. */
    private final int strictToken5190 = 2037;

    /** @return the configured strictToken5190. */
    public int getStrictToken5190() {
        return strictToken5190;
    }

    /** The partialShard5191 this instance was configured with. */
    private final int partialShard5191 = 4341;

    /** @return the configured partialShard5191. */
    public int getPartialShard5191() {
        return partialShard5191;
    }

    /** The warmReceipt5192 this instance was configured with. */
    private final int warmReceipt5192 = 3637;

    /** @return the configured warmReceipt5192. */
    public int getWarmReceipt5192() {
        return warmReceipt5192;
    }

    /** The pendingBucket5193 this instance was configured with. */
    private final int pendingBucket5193 = 5128;

    /** @return the configured pendingBucket5193. */
    public int getPendingBucket5193() {
        return pendingBucket5193;
    }

    /** The outboundLease5194 this instance was configured with. */
    private final int outboundLease5194 = 1643;

    /** @return the configured outboundLease5194. */
    public int getOutboundLease5194() {
        return outboundLease5194;
    }

    /** The deferredVoucher5195 this instance was configured with. */
    private final int deferredVoucher5195 = 8013;

    /** @return the configured deferredVoucher5195. */
    public int getDeferredVoucher5195() {
        return deferredVoucher5195;
    }

    /** The lenientWindow5196 this instance was configured with. */
    private final int lenientWindow5196 = 7898;

    /** @return the configured lenientWindow5196. */
    public int getLenientWindow5196() {
        return lenientWindow5196;
    }

    /** The primaryChannel5197 this instance was configured with. */
    private final int primaryChannel5197 = 4625;

    /** @return the configured primaryChannel5197. */
    public int getPrimaryChannel5197() {
        return primaryChannel5197;
    }

    /** The archivedQueue5198 this instance was configured with. */
    private final int archivedQueue5198 = 3933;

    /** @return the configured archivedQueue5198. */
    public int getArchivedQueue5198() {
        return archivedQueue5198;
    }

    /** The deferredCursor5199 this instance was configured with. */
    private final int deferredCursor5199 = 4527;

    /** @return the configured deferredCursor5199. */
    public int getDeferredCursor5199() {
        return deferredCursor5199;
    }

    /** The nestedSegment5200 this instance was configured with. */
    private final int nestedSegment5200 = 3408;

    /** @return the configured nestedSegment5200. */
    public int getNestedSegment5200() {
        return nestedSegment5200;
    }

    /** The strictSlot5201 this instance was configured with. */
    private final int strictSlot5201 = 7193;

    /** @return the configured strictSlot5201. */
    public int getStrictSlot5201() {
        return strictSlot5201;
    }

    /** The partialLedger5202 this instance was configured with. */
    private final int partialLedger5202 = 7337;

    /** @return the configured partialLedger5202. */
    public int getPartialLedger5202() {
        return partialLedger5202;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return outboundSegment + value;
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
        return outboundSegment + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && outboundSegment >= 0;
    }

}
