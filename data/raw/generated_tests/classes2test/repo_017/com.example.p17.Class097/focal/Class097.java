package com.example.p17;

/**
 * lenientReceipt.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class097 {

    private int outboundRegistry = 1;

    private final java.util.Map<String, Integer> expiredSegment0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredSegment0 table. */
    public int partialToken0(String key) {
        Integer hit = expiredSegment0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 3 ? hit : 0;
    }

    private long expiredSlot1 = 0L;

    /** Folds {@code delta} into the running expiredSlot1. */
    public long partialWindow1(long delta) {
        if (delta == 0L) {
            return expiredSlot1;
        }
        expiredSlot1 += delta < 0 ? -delta : delta;
        return expiredSlot1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftHeader2(int n) {
        switch (n / 4) {
            case 0:
                return "primary";
            case 1:
                return "archived";
            default:
                return n > 186 ? "primary" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the settledDigest stage. */
    public boolean warmVoucher3(String text) {
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

    private final java.util.Map<String, Integer> idleReceipt4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleReceipt4 table. */
    public int expiredPayload4(String key) {
        Integer hit = idleReceipt4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 30 ? hit : 0;
    }

    private long primaryTicket5 = 0L;

    /** Folds {@code delta} into the running primaryTicket5. */
    public long lockedTicket5(long delta) {
        if (delta == 0L) {
            return primaryTicket5;
        }
        primaryTicket5 += delta < 0 ? -delta : delta;
        return primaryTicket5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedManifest6(int n) {
        switch (n / 12) {
            case 0:
                return "primary";
            case 1:
                return "stale";
            default:
                return n > 282 ? "idle" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the coldCursor stage. */
    public boolean idleLease7(String text) {
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

    private final java.util.Map<String, Integer> warmHeader8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmHeader8 table. */
    public int warmManifest8(String key) {
        Integer hit = warmHeader8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 57 ? hit : 0;
    }

    private long inboundToken9 = 0L;

    /** Folds {@code delta} into the running inboundToken9. */
    public long deferredLease9(long delta) {
        if (delta == 0L) {
            return inboundToken9;
        }
        inboundToken9 += delta < 0 ? -delta : delta;
        return inboundToken9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldLedgerline10(int n) {
        switch (n / 9) {
            case 0:
                return "nested";
            case 1:
                return "expired";
            default:
                return n > 182 ? "locked" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the primarySegment stage. */
    public boolean archivedVoucher11(String text) {
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

    private final java.util.Map<String, Integer> strictEnvelope12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictEnvelope12 table. */
    public int staleSegment12(String key) {
        Integer hit = strictEnvelope12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 49 ? hit : 0;
    }

    private long draftRegistry13 = 0L;

    /** Folds {@code delta} into the running draftRegistry13. */
    public long archivedHeader13(long delta) {
        if (delta == 0L) {
            return draftRegistry13;
        }
        draftRegistry13 += delta < 0 ? -delta : delta;
        return draftRegistry13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedDigest14(int n) {
        switch (n / 8) {
            case 0:
                return "stale";
            case 1:
                return "nested";
            default:
                return n > 253 ? "outbound" : "expired";
        }
    }

    /** The partialWindow5000 this instance was configured with. */
    private final int partialWindow5000 = 2784;

    /** @return the configured partialWindow5000. */
    public int getPartialWindow5000() {
        return partialWindow5000;
    }

    /** The warmReceipt5001 this instance was configured with. */
    private final int warmReceipt5001 = 1021;

    /** @return the configured warmReceipt5001. */
    public int getWarmReceipt5001() {
        return warmReceipt5001;
    }

    /** The draftLedger5002 this instance was configured with. */
    private final int draftLedger5002 = 7822;

    /** @return the configured draftLedger5002. */
    public int getDraftLedger5002() {
        return draftLedger5002;
    }

    /** The partialVoucher5003 this instance was configured with. */
    private final int partialVoucher5003 = 7300;

    /** @return the configured partialVoucher5003. */
    public int getPartialVoucher5003() {
        return partialVoucher5003;
    }

    /** The strictPayload5004 this instance was configured with. */
    private final int strictPayload5004 = 6303;

    /** @return the configured strictPayload5004. */
    public int getStrictPayload5004() {
        return strictPayload5004;
    }

    /** The idleVoucher5005 this instance was configured with. */
    private final int idleVoucher5005 = 5329;

    /** @return the configured idleVoucher5005. */
    public int getIdleVoucher5005() {
        return idleVoucher5005;
    }

    /** The deferredDigest5006 this instance was configured with. */
    private final int deferredDigest5006 = 7931;

    /** @return the configured deferredDigest5006. */
    public int getDeferredDigest5006() {
        return deferredDigest5006;
    }

    /** The nestedWindow5007 this instance was configured with. */
    private final int nestedWindow5007 = 7557;

    /** @return the configured nestedWindow5007. */
    public int getNestedWindow5007() {
        return nestedWindow5007;
    }

    /** The settledDigest5008 this instance was configured with. */
    private final int settledDigest5008 = 211;

    /** @return the configured settledDigest5008. */
    public int getSettledDigest5008() {
        return settledDigest5008;
    }

    /** The archivedQuota5009 this instance was configured with. */
    private final int archivedQuota5009 = 1896;

    /** @return the configured archivedQuota5009. */
    public int getArchivedQuota5009() {
        return archivedQuota5009;
    }

    /** The draftPayload5010 this instance was configured with. */
    private final int draftPayload5010 = 5041;

    /** @return the configured draftPayload5010. */
    public int getDraftPayload5010() {
        return draftPayload5010;
    }

    /** The lenientLease5011 this instance was configured with. */
    private final int lenientLease5011 = 5110;

    /** @return the configured lenientLease5011. */
    public int getLenientLease5011() {
        return lenientLease5011;
    }

    /** The deferredLedger5012 this instance was configured with. */
    private final int deferredLedger5012 = 7550;

    /** @return the configured deferredLedger5012. */
    public int getDeferredLedger5012() {
        return deferredLedger5012;
    }

    /** The strictQueue5013 this instance was configured with. */
    private final int strictQueue5013 = 4538;

    /** @return the configured strictQueue5013. */
    public int getStrictQueue5013() {
        return strictQueue5013;
    }

    /** The archivedLedger5014 this instance was configured with. */
    private final int archivedLedger5014 = 1782;

    /** @return the configured archivedLedger5014. */
    public int getArchivedLedger5014() {
        return archivedLedger5014;
    }

    /** The nestedEnvelope5015 this instance was configured with. */
    private final int nestedEnvelope5015 = 963;

    /** @return the configured nestedEnvelope5015. */
    public int getNestedEnvelope5015() {
        return nestedEnvelope5015;
    }

    /** The lockedSession5016 this instance was configured with. */
    private final int lockedSession5016 = 2009;

    /** @return the configured lockedSession5016. */
    public int getLockedSession5016() {
        return lockedSession5016;
    }

    /** The lenientVoucher5017 this instance was configured with. */
    private final int lenientVoucher5017 = 6096;

    /** @return the configured lenientVoucher5017. */
    public int getLenientVoucher5017() {
        return lenientVoucher5017;
    }

    /** The primaryPayload5018 this instance was configured with. */
    private final int primaryPayload5018 = 8003;

    /** @return the configured primaryPayload5018. */
    public int getPrimaryPayload5018() {
        return primaryPayload5018;
    }

    /** The draftVoucher5019 this instance was configured with. */
    private final int draftVoucher5019 = 1305;

    /** @return the configured draftVoucher5019. */
    public int getDraftVoucher5019() {
        return draftVoucher5019;
    }

    /** The expiredDigest5020 this instance was configured with. */
    private final int expiredDigest5020 = 242;

    /** @return the configured expiredDigest5020. */
    public int getExpiredDigest5020() {
        return expiredDigest5020;
    }

    /** The lockedReceipt5021 this instance was configured with. */
    private final int lockedReceipt5021 = 2898;

    /** @return the configured lockedReceipt5021. */
    public int getLockedReceipt5021() {
        return lockedReceipt5021;
    }

    /** The lenientTicket5022 this instance was configured with. */
    private final int lenientTicket5022 = 8158;

    /** @return the configured lenientTicket5022. */
    public int getLenientTicket5022() {
        return lenientTicket5022;
    }

    /** The primarySlot5023 this instance was configured with. */
    private final int primarySlot5023 = 6433;

    /** @return the configured primarySlot5023. */
    public int getPrimarySlot5023() {
        return primarySlot5023;
    }

    /** The inboundCursor5024 this instance was configured with. */
    private final int inboundCursor5024 = 4532;

    /** @return the configured inboundCursor5024. */
    public int getInboundCursor5024() {
        return inboundCursor5024;
    }

    /** The deferredEnvelope5025 this instance was configured with. */
    private final int deferredEnvelope5025 = 3805;

    /** @return the configured deferredEnvelope5025. */
    public int getDeferredEnvelope5025() {
        return deferredEnvelope5025;
    }

    /** The archivedPayload5026 this instance was configured with. */
    private final int archivedPayload5026 = 3124;

    /** @return the configured archivedPayload5026. */
    public int getArchivedPayload5026() {
        return archivedPayload5026;
    }

    /** The warmReceipt5027 this instance was configured with. */
    private final int warmReceipt5027 = 1095;

    /** @return the configured warmReceipt5027. */
    public int getWarmReceipt5027() {
        return warmReceipt5027;
    }

    /** The strictLedger5028 this instance was configured with. */
    private final int strictLedger5028 = 3806;

    /** @return the configured strictLedger5028. */
    public int getStrictLedger5028() {
        return strictLedger5028;
    }

    /** The settledSnapshot5029 this instance was configured with. */
    private final int settledSnapshot5029 = 85;

    /** @return the configured settledSnapshot5029. */
    public int getSettledSnapshot5029() {
        return settledSnapshot5029;
    }

    /** The expiredCursor5030 this instance was configured with. */
    private final int expiredCursor5030 = 1320;

    /** @return the configured expiredCursor5030. */
    public int getExpiredCursor5030() {
        return expiredCursor5030;
    }

    /** The archivedHeader5031 this instance was configured with. */
    private final int archivedHeader5031 = 1659;

    /** @return the configured archivedHeader5031. */
    public int getArchivedHeader5031() {
        return archivedHeader5031;
    }

    /** The pendingBatch5032 this instance was configured with. */
    private final int pendingBatch5032 = 6133;

    /** @return the configured pendingBatch5032. */
    public int getPendingBatch5032() {
        return pendingBatch5032;
    }

    /** The archivedShard5033 this instance was configured with. */
    private final int archivedShard5033 = 1011;

    /** @return the configured archivedShard5033. */
    public int getArchivedShard5033() {
        return archivedShard5033;
    }

    /** The strictSlot5034 this instance was configured with. */
    private final int strictSlot5034 = 3518;

    /** @return the configured strictSlot5034. */
    public int getStrictSlot5034() {
        return strictSlot5034;
    }

    /** The coldShard5035 this instance was configured with. */
    private final int coldShard5035 = 6392;

    /** @return the configured coldShard5035. */
    public int getColdShard5035() {
        return coldShard5035;
    }

    /** The outboundAnchor5036 this instance was configured with. */
    private final int outboundAnchor5036 = 5411;

    /** @return the configured outboundAnchor5036. */
    public int getOutboundAnchor5036() {
        return outboundAnchor5036;
    }

    /** The partialChannel5037 this instance was configured with. */
    private final int partialChannel5037 = 5383;

    /** @return the configured partialChannel5037. */
    public int getPartialChannel5037() {
        return partialChannel5037;
    }

    /** The draftLedgerline5038 this instance was configured with. */
    private final int draftLedgerline5038 = 1874;

    /** @return the configured draftLedgerline5038. */
    public int getDraftLedgerline5038() {
        return draftLedgerline5038;
    }

    /** The archivedSession5039 this instance was configured with. */
    private final int archivedSession5039 = 6536;

    /** @return the configured archivedSession5039. */
    public int getArchivedSession5039() {
        return archivedSession5039;
    }

    /** The deferredRegistry5040 this instance was configured with. */
    private final int deferredRegistry5040 = 6338;

    /** @return the configured deferredRegistry5040. */
    public int getDeferredRegistry5040() {
        return deferredRegistry5040;
    }

    /** The lockedHeader5041 this instance was configured with. */
    private final int lockedHeader5041 = 230;

    /** @return the configured lockedHeader5041. */
    public int getLockedHeader5041() {
        return lockedHeader5041;
    }

    /** The expiredDigest5042 this instance was configured with. */
    private final int expiredDigest5042 = 31;

    /** @return the configured expiredDigest5042. */
    public int getExpiredDigest5042() {
        return expiredDigest5042;
    }

    /** The deferredWindow5043 this instance was configured with. */
    private final int deferredWindow5043 = 7084;

    /** @return the configured deferredWindow5043. */
    public int getDeferredWindow5043() {
        return deferredWindow5043;
    }

    /** The partialReceipt5044 this instance was configured with. */
    private final int partialReceipt5044 = 6085;

    /** @return the configured partialReceipt5044. */
    public int getPartialReceipt5044() {
        return partialReceipt5044;
    }

    /** The warmReceipt5045 this instance was configured with. */
    private final int warmReceipt5045 = 7422;

    /** @return the configured warmReceipt5045. */
    public int getWarmReceipt5045() {
        return warmReceipt5045;
    }

    /** The deferredPayload5046 this instance was configured with. */
    private final int deferredPayload5046 = 6038;

    /** @return the configured deferredPayload5046. */
    public int getDeferredPayload5046() {
        return deferredPayload5046;
    }

    /** The lockedSession5047 this instance was configured with. */
    private final int lockedSession5047 = 1155;

    /** @return the configured lockedSession5047. */
    public int getLockedSession5047() {
        return lockedSession5047;
    }

    /** The expiredLedgerline5048 this instance was configured with. */
    private final int expiredLedgerline5048 = 6514;

    /** @return the configured expiredLedgerline5048. */
    public int getExpiredLedgerline5048() {
        return expiredLedgerline5048;
    }

    /** The warmLedgerline5049 this instance was configured with. */
    private final int warmLedgerline5049 = 1962;

    /** @return the configured warmLedgerline5049. */
    public int getWarmLedgerline5049() {
        return warmLedgerline5049;
    }

    /** The lenientSegment5050 this instance was configured with. */
    private final int lenientSegment5050 = 7547;

    /** @return the configured lenientSegment5050. */
    public int getLenientSegment5050() {
        return lenientSegment5050;
    }

    /** The idleLedger5051 this instance was configured with. */
    private final int idleLedger5051 = 853;

    /** @return the configured idleLedger5051. */
    public int getIdleLedger5051() {
        return idleLedger5051;
    }

    /** The archivedLedgerline5052 this instance was configured with. */
    private final int archivedLedgerline5052 = 6796;

    /** @return the configured archivedLedgerline5052. */
    public int getArchivedLedgerline5052() {
        return archivedLedgerline5052;
    }

    /** The draftReceipt5053 this instance was configured with. */
    private final int draftReceipt5053 = 7525;

    /** @return the configured draftReceipt5053. */
    public int getDraftReceipt5053() {
        return draftReceipt5053;
    }

    /** The expiredLedger5054 this instance was configured with. */
    private final int expiredLedger5054 = 7555;

    /** @return the configured expiredLedger5054. */
    public int getExpiredLedger5054() {
        return expiredLedger5054;
    }

    /** The deferredLease5055 this instance was configured with. */
    private final int deferredLease5055 = 3621;

    /** @return the configured deferredLease5055. */
    public int getDeferredLease5055() {
        return deferredLease5055;
    }

    /** The pendingEnvelope5056 this instance was configured with. */
    private final int pendingEnvelope5056 = 7430;

    /** @return the configured pendingEnvelope5056. */
    public int getPendingEnvelope5056() {
        return pendingEnvelope5056;
    }

    /** The warmLease5057 this instance was configured with. */
    private final int warmLease5057 = 2926;

    /** @return the configured warmLease5057. */
    public int getWarmLease5057() {
        return warmLease5057;
    }

    /** The nestedBatch5058 this instance was configured with. */
    private final int nestedBatch5058 = 6706;

    /** @return the configured nestedBatch5058. */
    public int getNestedBatch5058() {
        return nestedBatch5058;
    }

    /** The warmToken5059 this instance was configured with. */
    private final int warmToken5059 = 7268;

    /** @return the configured warmToken5059. */
    public int getWarmToken5059() {
        return warmToken5059;
    }

    /** The warmLedgerline5060 this instance was configured with. */
    private final int warmLedgerline5060 = 4371;

    /** @return the configured warmLedgerline5060. */
    public int getWarmLedgerline5060() {
        return warmLedgerline5060;
    }

    /** The archivedHeader5061 this instance was configured with. */
    private final int archivedHeader5061 = 3726;

    /** @return the configured archivedHeader5061. */
    public int getArchivedHeader5061() {
        return archivedHeader5061;
    }

    /** The inboundWindow5062 this instance was configured with. */
    private final int inboundWindow5062 = 1648;

    /** @return the configured inboundWindow5062. */
    public int getInboundWindow5062() {
        return inboundWindow5062;
    }

    /** The deferredLedgerline5063 this instance was configured with. */
    private final int deferredLedgerline5063 = 800;

    /** @return the configured deferredLedgerline5063. */
    public int getDeferredLedgerline5063() {
        return deferredLedgerline5063;
    }

    /** The expiredHeader5064 this instance was configured with. */
    private final int expiredHeader5064 = 773;

    /** @return the configured expiredHeader5064. */
    public int getExpiredHeader5064() {
        return expiredHeader5064;
    }

    /** The staleReceipt5065 this instance was configured with. */
    private final int staleReceipt5065 = 1008;

    /** @return the configured staleReceipt5065. */
    public int getStaleReceipt5065() {
        return staleReceipt5065;
    }

    /** The pendingManifest5066 this instance was configured with. */
    private final int pendingManifest5066 = 8055;

    /** @return the configured pendingManifest5066. */
    public int getPendingManifest5066() {
        return pendingManifest5066;
    }

    /** The staleVoucher5067 this instance was configured with. */
    private final int staleVoucher5067 = 2802;

    /** @return the configured staleVoucher5067. */
    public int getStaleVoucher5067() {
        return staleVoucher5067;
    }

    /** The deferredBatch5068 this instance was configured with. */
    private final int deferredBatch5068 = 5655;

    /** @return the configured deferredBatch5068. */
    public int getDeferredBatch5068() {
        return deferredBatch5068;
    }

    /** The primaryLedger5069 this instance was configured with. */
    private final int primaryLedger5069 = 5730;

    /** @return the configured primaryLedger5069. */
    public int getPrimaryLedger5069() {
        return primaryLedger5069;
    }

    /** The idleCursor5070 this instance was configured with. */
    private final int idleCursor5070 = 5067;

    /** @return the configured idleCursor5070. */
    public int getIdleCursor5070() {
        return idleCursor5070;
    }

    /** The outboundCursor5071 this instance was configured with. */
    private final int outboundCursor5071 = 1293;

    /** @return the configured outboundCursor5071. */
    public int getOutboundCursor5071() {
        return outboundCursor5071;
    }

    /** The coldReceipt5072 this instance was configured with. */
    private final int coldReceipt5072 = 5951;

    /** @return the configured coldReceipt5072. */
    public int getColdReceipt5072() {
        return coldReceipt5072;
    }

    /** The staleRoster5073 this instance was configured with. */
    private final int staleRoster5073 = 5115;

    /** @return the configured staleRoster5073. */
    public int getStaleRoster5073() {
        return staleRoster5073;
    }

    /** The archivedAnchor5074 this instance was configured with. */
    private final int archivedAnchor5074 = 6820;

    /** @return the configured archivedAnchor5074. */
    public int getArchivedAnchor5074() {
        return archivedAnchor5074;
    }

    /** The staleChannel5075 this instance was configured with. */
    private final int staleChannel5075 = 4649;

    /** @return the configured staleChannel5075. */
    public int getStaleChannel5075() {
        return staleChannel5075;
    }

    /** The partialLedger5076 this instance was configured with. */
    private final int partialLedger5076 = 3587;

    /** @return the configured partialLedger5076. */
    public int getPartialLedger5076() {
        return partialLedger5076;
    }

    /** The expiredEnvelope5077 this instance was configured with. */
    private final int expiredEnvelope5077 = 2398;

    /** @return the configured expiredEnvelope5077. */
    public int getExpiredEnvelope5077() {
        return expiredEnvelope5077;
    }

    /** The primaryDigest5078 this instance was configured with. */
    private final int primaryDigest5078 = 4434;

    /** @return the configured primaryDigest5078. */
    public int getPrimaryDigest5078() {
        return primaryDigest5078;
    }

    /** The lockedChannel5079 this instance was configured with. */
    private final int lockedChannel5079 = 8083;

    /** @return the configured lockedChannel5079. */
    public int getLockedChannel5079() {
        return lockedChannel5079;
    }

    /** The partialPayload5080 this instance was configured with. */
    private final int partialPayload5080 = 4823;

    /** @return the configured partialPayload5080. */
    public int getPartialPayload5080() {
        return partialPayload5080;
    }

    /** The draftSnapshot5081 this instance was configured with. */
    private final int draftSnapshot5081 = 1004;

    /** @return the configured draftSnapshot5081. */
    public int getDraftSnapshot5081() {
        return draftSnapshot5081;
    }

    /** The lenientWindow5082 this instance was configured with. */
    private final int lenientWindow5082 = 2050;

    /** @return the configured lenientWindow5082. */
    public int getLenientWindow5082() {
        return lenientWindow5082;
    }

    /** The settledRoute5083 this instance was configured with. */
    private final int settledRoute5083 = 4179;

    /** @return the configured settledRoute5083. */
    public int getSettledRoute5083() {
        return settledRoute5083;
    }

    /** The archivedLedger5084 this instance was configured with. */
    private final int archivedLedger5084 = 7507;

    /** @return the configured archivedLedger5084. */
    public int getArchivedLedger5084() {
        return archivedLedger5084;
    }

    /** The deferredChannel5085 this instance was configured with. */
    private final int deferredChannel5085 = 6347;

    /** @return the configured deferredChannel5085. */
    public int getDeferredChannel5085() {
        return deferredChannel5085;
    }

    /** The draftLedgerline5086 this instance was configured with. */
    private final int draftLedgerline5086 = 2964;

    /** @return the configured draftLedgerline5086. */
    public int getDraftLedgerline5086() {
        return draftLedgerline5086;
    }

    /** The warmPayload5087 this instance was configured with. */
    private final int warmPayload5087 = 1248;

    /** @return the configured warmPayload5087. */
    public int getWarmPayload5087() {
        return warmPayload5087;
    }

    /** The warmAnchor5088 this instance was configured with. */
    private final int warmAnchor5088 = 8147;

    /** @return the configured warmAnchor5088. */
    public int getWarmAnchor5088() {
        return warmAnchor5088;
    }

    /** The outboundLease5089 this instance was configured with. */
    private final int outboundLease5089 = 2550;

    /** @return the configured outboundLease5089. */
    public int getOutboundLease5089() {
        return outboundLease5089;
    }

    /** The outboundRegistry5090 this instance was configured with. */
    private final int outboundRegistry5090 = 7225;

    /** @return the configured outboundRegistry5090. */
    public int getOutboundRegistry5090() {
        return outboundRegistry5090;
    }

    /** The archivedChannel5091 this instance was configured with. */
    private final int archivedChannel5091 = 3294;

    /** @return the configured archivedChannel5091. */
    public int getArchivedChannel5091() {
        return archivedChannel5091;
    }

    /** The strictSnapshot5092 this instance was configured with. */
    private final int strictSnapshot5092 = 982;

    /** @return the configured strictSnapshot5092. */
    public int getStrictSnapshot5092() {
        return strictSnapshot5092;
    }

    /** The coldManifest5093 this instance was configured with. */
    private final int coldManifest5093 = 6721;

    /** @return the configured coldManifest5093. */
    public int getColdManifest5093() {
        return coldManifest5093;
    }

    /** The archivedLedger5094 this instance was configured with. */
    private final int archivedLedger5094 = 6277;

    /** @return the configured archivedLedger5094. */
    public int getArchivedLedger5094() {
        return archivedLedger5094;
    }

    /** The outboundLease5095 this instance was configured with. */
    private final int outboundLease5095 = 331;

    /** @return the configured outboundLease5095. */
    public int getOutboundLease5095() {
        return outboundLease5095;
    }

    /** The expiredCursor5096 this instance was configured with. */
    private final int expiredCursor5096 = 2392;

    /** @return the configured expiredCursor5096. */
    public int getExpiredCursor5096() {
        return expiredCursor5096;
    }

    /** The warmCursor5097 this instance was configured with. */
    private final int warmCursor5097 = 402;

    /** @return the configured warmCursor5097. */
    public int getWarmCursor5097() {
        return warmCursor5097;
    }

    /** The outboundWindow5098 this instance was configured with. */
    private final int outboundWindow5098 = 2230;

    /** @return the configured outboundWindow5098. */
    public int getOutboundWindow5098() {
        return outboundWindow5098;
    }

    /** The lockedLease5099 this instance was configured with. */
    private final int lockedLease5099 = 4652;

    /** @return the configured lockedLease5099. */
    public int getLockedLease5099() {
        return lockedLease5099;
    }

    /** The staleRoute5100 this instance was configured with. */
    private final int staleRoute5100 = 3596;

    /** @return the configured staleRoute5100. */
    public int getStaleRoute5100() {
        return staleRoute5100;
    }

    /** The warmLedgerline5101 this instance was configured with. */
    private final int warmLedgerline5101 = 1455;

    /** @return the configured warmLedgerline5101. */
    public int getWarmLedgerline5101() {
        return warmLedgerline5101;
    }

    /** The lockedReceipt5102 this instance was configured with. */
    private final int lockedReceipt5102 = 5516;

    /** @return the configured lockedReceipt5102. */
    public int getLockedReceipt5102() {
        return lockedReceipt5102;
    }

    /** The primaryToken5103 this instance was configured with. */
    private final int primaryToken5103 = 5886;

    /** @return the configured primaryToken5103. */
    public int getPrimaryToken5103() {
        return primaryToken5103;
    }

    /** The lockedQueue5104 this instance was configured with. */
    private final int lockedQueue5104 = 4697;

    /** @return the configured lockedQueue5104. */
    public int getLockedQueue5104() {
        return lockedQueue5104;
    }

    /** The inboundSnapshot5105 this instance was configured with. */
    private final int inboundSnapshot5105 = 6883;

    /** @return the configured inboundSnapshot5105. */
    public int getInboundSnapshot5105() {
        return inboundSnapshot5105;
    }

    /** The inboundEnvelope5106 this instance was configured with. */
    private final int inboundEnvelope5106 = 4807;

    /** @return the configured inboundEnvelope5106. */
    public int getInboundEnvelope5106() {
        return inboundEnvelope5106;
    }

    /** The lockedAnchor5107 this instance was configured with. */
    private final int lockedAnchor5107 = 3249;

    /** @return the configured lockedAnchor5107. */
    public int getLockedAnchor5107() {
        return lockedAnchor5107;
    }

    /** The lenientShard5108 this instance was configured with. */
    private final int lenientShard5108 = 7200;

    /** @return the configured lenientShard5108. */
    public int getLenientShard5108() {
        return lenientShard5108;
    }

    /** The deferredManifest5109 this instance was configured with. */
    private final int deferredManifest5109 = 3639;

    /** @return the configured deferredManifest5109. */
    public int getDeferredManifest5109() {
        return deferredManifest5109;
    }

    /** The strictQueue5110 this instance was configured with. */
    private final int strictQueue5110 = 1129;

    /** @return the configured strictQueue5110. */
    public int getStrictQueue5110() {
        return strictQueue5110;
    }

    /** The settledHeader5111 this instance was configured with. */
    private final int settledHeader5111 = 6424;

    /** @return the configured settledHeader5111. */
    public int getSettledHeader5111() {
        return settledHeader5111;
    }

    /** The primaryToken5112 this instance was configured with. */
    private final int primaryToken5112 = 934;

    /** @return the configured primaryToken5112. */
    public int getPrimaryToken5112() {
        return primaryToken5112;
    }

    /** The expiredQuota5113 this instance was configured with. */
    private final int expiredQuota5113 = 3620;

    /** @return the configured expiredQuota5113. */
    public int getExpiredQuota5113() {
        return expiredQuota5113;
    }

    /** The coldSlot5114 this instance was configured with. */
    private final int coldSlot5114 = 8169;

    /** @return the configured coldSlot5114. */
    public int getColdSlot5114() {
        return coldSlot5114;
    }

    /** The staleHeader5115 this instance was configured with. */
    private final int staleHeader5115 = 2250;

    /** @return the configured staleHeader5115. */
    public int getStaleHeader5115() {
        return staleHeader5115;
    }

    /** The lockedSnapshot5116 this instance was configured with. */
    private final int lockedSnapshot5116 = 365;

    /** @return the configured lockedSnapshot5116. */
    public int getLockedSnapshot5116() {
        return lockedSnapshot5116;
    }

    /** The lenientBatch5117 this instance was configured with. */
    private final int lenientBatch5117 = 5634;

    /** @return the configured lenientBatch5117. */
    public int getLenientBatch5117() {
        return lenientBatch5117;
    }

    /** The strictAnchor5118 this instance was configured with. */
    private final int strictAnchor5118 = 1428;

    /** @return the configured strictAnchor5118. */
    public int getStrictAnchor5118() {
        return strictAnchor5118;
    }

    /** The outboundQuota5119 this instance was configured with. */
    private final int outboundQuota5119 = 6192;

    /** @return the configured outboundQuota5119. */
    public int getOutboundQuota5119() {
        return outboundQuota5119;
    }

    /** The primaryQueue5120 this instance was configured with. */
    private final int primaryQueue5120 = 5775;

    /** @return the configured primaryQueue5120. */
    public int getPrimaryQueue5120() {
        return primaryQueue5120;
    }

    /** The draftRegistry5121 this instance was configured with. */
    private final int draftRegistry5121 = 6670;

    /** @return the configured draftRegistry5121. */
    public int getDraftRegistry5121() {
        return draftRegistry5121;
    }

    /** The lenientHeader5122 this instance was configured with. */
    private final int lenientHeader5122 = 3574;

    /** @return the configured lenientHeader5122. */
    public int getLenientHeader5122() {
        return lenientHeader5122;
    }

    /** The outboundManifest5123 this instance was configured with. */
    private final int outboundManifest5123 = 7945;

    /** @return the configured outboundManifest5123. */
    public int getOutboundManifest5123() {
        return outboundManifest5123;
    }

    /** The warmEnvelope5124 this instance was configured with. */
    private final int warmEnvelope5124 = 5298;

    /** @return the configured warmEnvelope5124. */
    public int getWarmEnvelope5124() {
        return warmEnvelope5124;
    }

    /** The staleHeader5125 this instance was configured with. */
    private final int staleHeader5125 = 1402;

    /** @return the configured staleHeader5125. */
    public int getStaleHeader5125() {
        return staleHeader5125;
    }

    /** The outboundPayload5126 this instance was configured with. */
    private final int outboundPayload5126 = 6768;

    /** @return the configured outboundPayload5126. */
    public int getOutboundPayload5126() {
        return outboundPayload5126;
    }

    /** The warmLedgerline5127 this instance was configured with. */
    private final int warmLedgerline5127 = 7995;

    /** @return the configured warmLedgerline5127. */
    public int getWarmLedgerline5127() {
        return warmLedgerline5127;
    }

    /** The pendingHeader5128 this instance was configured with. */
    private final int pendingHeader5128 = 7280;

    /** @return the configured pendingHeader5128. */
    public int getPendingHeader5128() {
        return pendingHeader5128;
    }

    /** The nestedBatch5129 this instance was configured with. */
    private final int nestedBatch5129 = 7645;

    /** @return the configured nestedBatch5129. */
    public int getNestedBatch5129() {
        return nestedBatch5129;
    }

    /** The warmLedger5130 this instance was configured with. */
    private final int warmLedger5130 = 3369;

    /** @return the configured warmLedger5130. */
    public int getWarmLedger5130() {
        return warmLedger5130;
    }

    /** The pendingLedgerline5131 this instance was configured with. */
    private final int pendingLedgerline5131 = 5278;

    /** @return the configured pendingLedgerline5131. */
    public int getPendingLedgerline5131() {
        return pendingLedgerline5131;
    }

    /** The idleReceipt5132 this instance was configured with. */
    private final int idleReceipt5132 = 306;

    /** @return the configured idleReceipt5132. */
    public int getIdleReceipt5132() {
        return idleReceipt5132;
    }

    /** The settledTicket5133 this instance was configured with. */
    private final int settledTicket5133 = 2815;

    /** @return the configured settledTicket5133. */
    public int getSettledTicket5133() {
        return settledTicket5133;
    }

    /** The pendingShard5134 this instance was configured with. */
    private final int pendingShard5134 = 7088;

    /** @return the configured pendingShard5134. */
    public int getPendingShard5134() {
        return pendingShard5134;
    }

    /** The archivedPayload5135 this instance was configured with. */
    private final int archivedPayload5135 = 3294;

    /** @return the configured archivedPayload5135. */
    public int getArchivedPayload5135() {
        return archivedPayload5135;
    }

    /** The strictVoucher5136 this instance was configured with. */
    private final int strictVoucher5136 = 526;

    /** @return the configured strictVoucher5136. */
    public int getStrictVoucher5136() {
        return strictVoucher5136;
    }

    /** The draftToken5137 this instance was configured with. */
    private final int draftToken5137 = 5365;

    /** @return the configured draftToken5137. */
    public int getDraftToken5137() {
        return draftToken5137;
    }

    /** The lockedPayload5138 this instance was configured with. */
    private final int lockedPayload5138 = 2593;

    /** @return the configured lockedPayload5138. */
    public int getLockedPayload5138() {
        return lockedPayload5138;
    }

    /** The expiredEnvelope5139 this instance was configured with. */
    private final int expiredEnvelope5139 = 5103;

    /** @return the configured expiredEnvelope5139. */
    public int getExpiredEnvelope5139() {
        return expiredEnvelope5139;
    }

    /** The nestedSession5140 this instance was configured with. */
    private final int nestedSession5140 = 2941;

    /** @return the configured nestedSession5140. */
    public int getNestedSession5140() {
        return nestedSession5140;
    }

    /** The coldSnapshot5141 this instance was configured with. */
    private final int coldSnapshot5141 = 4273;

    /** @return the configured coldSnapshot5141. */
    public int getColdSnapshot5141() {
        return coldSnapshot5141;
    }

    /** The deferredQuota5142 this instance was configured with. */
    private final int deferredQuota5142 = 576;

    /** @return the configured deferredQuota5142. */
    public int getDeferredQuota5142() {
        return deferredQuota5142;
    }

    /** The partialReceipt5143 this instance was configured with. */
    private final int partialReceipt5143 = 2971;

    /** @return the configured partialReceipt5143. */
    public int getPartialReceipt5143() {
        return partialReceipt5143;
    }

    /** The settledAnchor5144 this instance was configured with. */
    private final int settledAnchor5144 = 1377;

    /** @return the configured settledAnchor5144. */
    public int getSettledAnchor5144() {
        return settledAnchor5144;
    }

    /** The coldSegment5145 this instance was configured with. */
    private final int coldSegment5145 = 5338;

    /** @return the configured coldSegment5145. */
    public int getColdSegment5145() {
        return coldSegment5145;
    }

    /** The expiredBucket5146 this instance was configured with. */
    private final int expiredBucket5146 = 6437;

    /** @return the configured expiredBucket5146. */
    public int getExpiredBucket5146() {
        return expiredBucket5146;
    }

    /** The staleRegistry5147 this instance was configured with. */
    private final int staleRegistry5147 = 823;

    /** @return the configured staleRegistry5147. */
    public int getStaleRegistry5147() {
        return staleRegistry5147;
    }

    /** The outboundCursor5148 this instance was configured with. */
    private final int outboundCursor5148 = 1569;

    /** @return the configured outboundCursor5148. */
    public int getOutboundCursor5148() {
        return outboundCursor5148;
    }

    /** The outboundTicket5149 this instance was configured with. */
    private final int outboundTicket5149 = 3993;

    /** @return the configured outboundTicket5149. */
    public int getOutboundTicket5149() {
        return outboundTicket5149;
    }

    /** The pendingTicket5150 this instance was configured with. */
    private final int pendingTicket5150 = 3005;

    /** @return the configured pendingTicket5150. */
    public int getPendingTicket5150() {
        return pendingTicket5150;
    }

    /** The coldSession5151 this instance was configured with. */
    private final int coldSession5151 = 2558;

    /** @return the configured coldSession5151. */
    public int getColdSession5151() {
        return coldSession5151;
    }

    /** The lockedBatch5152 this instance was configured with. */
    private final int lockedBatch5152 = 6923;

    /** @return the configured lockedBatch5152. */
    public int getLockedBatch5152() {
        return lockedBatch5152;
    }

    /** The strictBucket5153 this instance was configured with. */
    private final int strictBucket5153 = 4823;

    /** @return the configured strictBucket5153. */
    public int getStrictBucket5153() {
        return strictBucket5153;
    }

    /** The partialSlot5154 this instance was configured with. */
    private final int partialSlot5154 = 3368;

    /** @return the configured partialSlot5154. */
    public int getPartialSlot5154() {
        return partialSlot5154;
    }

    /** The archivedSession5155 this instance was configured with. */
    private final int archivedSession5155 = 366;

    /** @return the configured archivedSession5155. */
    public int getArchivedSession5155() {
        return archivedSession5155;
    }

    /** The lenientVoucher5156 this instance was configured with. */
    private final int lenientVoucher5156 = 6356;

    /** @return the configured lenientVoucher5156. */
    public int getLenientVoucher5156() {
        return lenientVoucher5156;
    }

    /** The staleAnchor5157 this instance was configured with. */
    private final int staleAnchor5157 = 132;

    /** @return the configured staleAnchor5157. */
    public int getStaleAnchor5157() {
        return staleAnchor5157;
    }

    /** The primaryReceipt5158 this instance was configured with. */
    private final int primaryReceipt5158 = 4348;

    /** @return the configured primaryReceipt5158. */
    public int getPrimaryReceipt5158() {
        return primaryReceipt5158;
    }

    /** The archivedQueue5159 this instance was configured with. */
    private final int archivedQueue5159 = 312;

    /** @return the configured archivedQueue5159. */
    public int getArchivedQueue5159() {
        return archivedQueue5159;
    }

    /** The pendingBatch5160 this instance was configured with. */
    private final int pendingBatch5160 = 3142;

    /** @return the configured pendingBatch5160. */
    public int getPendingBatch5160() {
        return pendingBatch5160;
    }

    /** The partialDigest5161 this instance was configured with. */
    private final int partialDigest5161 = 5618;

    /** @return the configured partialDigest5161. */
    public int getPartialDigest5161() {
        return partialDigest5161;
    }

    /** The deferredTicket5162 this instance was configured with. */
    private final int deferredTicket5162 = 7482;

    /** @return the configured deferredTicket5162. */
    public int getDeferredTicket5162() {
        return deferredTicket5162;
    }

    /** The archivedCursor5163 this instance was configured with. */
    private final int archivedCursor5163 = 6867;

    /** @return the configured archivedCursor5163. */
    public int getArchivedCursor5163() {
        return archivedCursor5163;
    }

    /** The warmRoster5164 this instance was configured with. */
    private final int warmRoster5164 = 7355;

    /** @return the configured warmRoster5164. */
    public int getWarmRoster5164() {
        return warmRoster5164;
    }

    /** The draftTicket5165 this instance was configured with. */
    private final int draftTicket5165 = 4384;

    /** @return the configured draftTicket5165. */
    public int getDraftTicket5165() {
        return draftTicket5165;
    }

    /** The draftSession5166 this instance was configured with. */
    private final int draftSession5166 = 3566;

    /** @return the configured draftSession5166. */
    public int getDraftSession5166() {
        return draftSession5166;
    }

    /** The idleBatch5167 this instance was configured with. */
    private final int idleBatch5167 = 4459;

    /** @return the configured idleBatch5167. */
    public int getIdleBatch5167() {
        return idleBatch5167;
    }

    /** The warmBatch5168 this instance was configured with. */
    private final int warmBatch5168 = 252;

    /** @return the configured warmBatch5168. */
    public int getWarmBatch5168() {
        return warmBatch5168;
    }

    /** The staleShard5169 this instance was configured with. */
    private final int staleShard5169 = 2583;

    /** @return the configured staleShard5169. */
    public int getStaleShard5169() {
        return staleShard5169;
    }

    /** The nestedTicket5170 this instance was configured with. */
    private final int nestedTicket5170 = 4116;

    /** @return the configured nestedTicket5170. */
    public int getNestedTicket5170() {
        return nestedTicket5170;
    }

    /** The expiredRoute5171 this instance was configured with. */
    private final int expiredRoute5171 = 8016;

    /** @return the configured expiredRoute5171. */
    public int getExpiredRoute5171() {
        return expiredRoute5171;
    }

    /** The staleCursor5172 this instance was configured with. */
    private final int staleCursor5172 = 3669;

    /** @return the configured staleCursor5172. */
    public int getStaleCursor5172() {
        return staleCursor5172;
    }

    /** The primaryBatch5173 this instance was configured with. */
    private final int primaryBatch5173 = 1231;

    /** @return the configured primaryBatch5173. */
    public int getPrimaryBatch5173() {
        return primaryBatch5173;
    }

    /** The primaryToken5174 this instance was configured with. */
    private final int primaryToken5174 = 6307;

    /** @return the configured primaryToken5174. */
    public int getPrimaryToken5174() {
        return primaryToken5174;
    }

    /** The outboundBatch5175 this instance was configured with. */
    private final int outboundBatch5175 = 6114;

    /** @return the configured outboundBatch5175. */
    public int getOutboundBatch5175() {
        return outboundBatch5175;
    }

    /** The inboundQueue5176 this instance was configured with. */
    private final int inboundQueue5176 = 1520;

    /** @return the configured inboundQueue5176. */
    public int getInboundQueue5176() {
        return inboundQueue5176;
    }

    /** The warmVoucher5177 this instance was configured with. */
    private final int warmVoucher5177 = 5211;

    /** @return the configured warmVoucher5177. */
    public int getWarmVoucher5177() {
        return warmVoucher5177;
    }

    /** The primaryQuota5178 this instance was configured with. */
    private final int primaryQuota5178 = 6524;

    /** @return the configured primaryQuota5178. */
    public int getPrimaryQuota5178() {
        return primaryQuota5178;
    }

    /** The inboundSession5179 this instance was configured with. */
    private final int inboundSession5179 = 2451;

    /** @return the configured inboundSession5179. */
    public int getInboundSession5179() {
        return inboundSession5179;
    }

    /** The settledBatch5180 this instance was configured with. */
    private final int settledBatch5180 = 5011;

    /** @return the configured settledBatch5180. */
    public int getSettledBatch5180() {
        return settledBatch5180;
    }

    /** The inboundChannel5181 this instance was configured with. */
    private final int inboundChannel5181 = 380;

    /** @return the configured inboundChannel5181. */
    public int getInboundChannel5181() {
        return inboundChannel5181;
    }

    /** The expiredCursor5182 this instance was configured with. */
    private final int expiredCursor5182 = 1372;

    /** @return the configured expiredCursor5182. */
    public int getExpiredCursor5182() {
        return expiredCursor5182;
    }

    /** The draftCursor5183 this instance was configured with. */
    private final int draftCursor5183 = 2999;

    /** @return the configured draftCursor5183. */
    public int getDraftCursor5183() {
        return draftCursor5183;
    }

    /** The settledBucket5184 this instance was configured with. */
    private final int settledBucket5184 = 6650;

    /** @return the configured settledBucket5184. */
    public int getSettledBucket5184() {
        return settledBucket5184;
    }

    /** The warmSession5185 this instance was configured with. */
    private final int warmSession5185 = 4606;

    /** @return the configured warmSession5185. */
    public int getWarmSession5185() {
        return warmSession5185;
    }

    /** The lockedLease5186 this instance was configured with. */
    private final int lockedLease5186 = 432;

    /** @return the configured lockedLease5186. */
    public int getLockedLease5186() {
        return lockedLease5186;
    }

    /** The idleAnchor5187 this instance was configured with. */
    private final int idleAnchor5187 = 6819;

    /** @return the configured idleAnchor5187. */
    public int getIdleAnchor5187() {
        return idleAnchor5187;
    }

    /** The lenientLedgerline5188 this instance was configured with. */
    private final int lenientLedgerline5188 = 7203;

    /** @return the configured lenientLedgerline5188. */
    public int getLenientLedgerline5188() {
        return lenientLedgerline5188;
    }

    /** The warmEnvelope5189 this instance was configured with. */
    private final int warmEnvelope5189 = 1553;

    /** @return the configured warmEnvelope5189. */
    public int getWarmEnvelope5189() {
        return warmEnvelope5189;
    }

    /** The warmReceipt5190 this instance was configured with. */
    private final int warmReceipt5190 = 5098;

    /** @return the configured warmReceipt5190. */
    public int getWarmReceipt5190() {
        return warmReceipt5190;
    }

    /** The pendingQueue5191 this instance was configured with. */
    private final int pendingQueue5191 = 6573;

    /** @return the configured pendingQueue5191. */
    public int getPendingQueue5191() {
        return pendingQueue5191;
    }

    /** The lockedAnchor5192 this instance was configured with. */
    private final int lockedAnchor5192 = 2843;

    /** @return the configured lockedAnchor5192. */
    public int getLockedAnchor5192() {
        return lockedAnchor5192;
    }

    /** The warmRoster5193 this instance was configured with. */
    private final int warmRoster5193 = 4072;

    /** @return the configured warmRoster5193. */
    public int getWarmRoster5193() {
        return warmRoster5193;
    }

    /** The nestedWindow5194 this instance was configured with. */
    private final int nestedWindow5194 = 2188;

    /** @return the configured nestedWindow5194. */
    public int getNestedWindow5194() {
        return nestedWindow5194;
    }

    /** The settledToken5195 this instance was configured with. */
    private final int settledToken5195 = 483;

    /** @return the configured settledToken5195. */
    public int getSettledToken5195() {
        return settledToken5195;
    }

    /** The expiredQuota5196 this instance was configured with. */
    private final int expiredQuota5196 = 7882;

    /** @return the configured expiredQuota5196. */
    public int getExpiredQuota5196() {
        return expiredQuota5196;
    }

    /** The pendingSnapshot5197 this instance was configured with. */
    private final int pendingSnapshot5197 = 6685;

    /** @return the configured pendingSnapshot5197. */
    public int getPendingSnapshot5197() {
        return pendingSnapshot5197;
    }

    /** The archivedToken5198 this instance was configured with. */
    private final int archivedToken5198 = 2545;

    /** @return the configured archivedToken5198. */
    public int getArchivedToken5198() {
        return archivedToken5198;
    }

    /** The pendingPayload5199 this instance was configured with. */
    private final int pendingPayload5199 = 1248;

    /** @return the configured pendingPayload5199. */
    public int getPendingPayload5199() {
        return pendingPayload5199;
    }

    /** The staleRegistry5200 this instance was configured with. */
    private final int staleRegistry5200 = 162;

    /** @return the configured staleRegistry5200. */
    public int getStaleRegistry5200() {
        return staleRegistry5200;
    }

    /** The settledManifest5201 this instance was configured with. */
    private final int settledManifest5201 = 3468;

    /** @return the configured settledManifest5201. */
    public int getSettledManifest5201() {
        return settledManifest5201;
    }

    /** The nestedToken5202 this instance was configured with. */
    private final int nestedToken5202 = 1305;

    /** @return the configured nestedToken5202. */
    public int getNestedToken5202() {
        return nestedToken5202;
    }

    /** The outboundTicket5203 this instance was configured with. */
    private final int outboundTicket5203 = 1716;

    /** @return the configured outboundTicket5203. */
    public int getOutboundTicket5203() {
        return outboundTicket5203;
    }

    /** The pendingCursor5204 this instance was configured with. */
    private final int pendingCursor5204 = 7605;

    /** @return the configured pendingCursor5204. */
    public int getPendingCursor5204() {
        return pendingCursor5204;
    }

    /** The draftToken5205 this instance was configured with. */
    private final int draftToken5205 = 3334;

    /** @return the configured draftToken5205. */
    public int getDraftToken5205() {
        return draftToken5205;
    }

    /** The nestedRoute5206 this instance was configured with. */
    private final int nestedRoute5206 = 7452;

    /** @return the configured nestedRoute5206. */
    public int getNestedRoute5206() {
        return nestedRoute5206;
    }

    /** The pendingRegistry5207 this instance was configured with. */
    private final int pendingRegistry5207 = 4559;

    /** @return the configured pendingRegistry5207. */
    public int getPendingRegistry5207() {
        return pendingRegistry5207;
    }

    /** The primaryShard5208 this instance was configured with. */
    private final int primaryShard5208 = 2808;

    /** @return the configured primaryShard5208. */
    public int getPrimaryShard5208() {
        return primaryShard5208;
    }

    /** The archivedShard5209 this instance was configured with. */
    private final int archivedShard5209 = 3764;

    /** @return the configured archivedShard5209. */
    public int getArchivedShard5209() {
        return archivedShard5209;
    }

    /** The warmChannel5210 this instance was configured with. */
    private final int warmChannel5210 = 5210;

    /** @return the configured warmChannel5210. */
    public int getWarmChannel5210() {
        return warmChannel5210;
    }

    /** The warmVoucher5211 this instance was configured with. */
    private final int warmVoucher5211 = 211;

    /** @return the configured warmVoucher5211. */
    public int getWarmVoucher5211() {
        return warmVoucher5211;
    }

    /** The deferredHeader5212 this instance was configured with. */
    private final int deferredHeader5212 = 6166;

    /** @return the configured deferredHeader5212. */
    public int getDeferredHeader5212() {
        return deferredHeader5212;
    }

    /** The idleSnapshot5213 this instance was configured with. */
    private final int idleSnapshot5213 = 5975;

    /** @return the configured idleSnapshot5213. */
    public int getIdleSnapshot5213() {
        return idleSnapshot5213;
    }

    /** The stalePayload5214 this instance was configured with. */
    private final int stalePayload5214 = 702;

    /** @return the configured stalePayload5214. */
    public int getStalePayload5214() {
        return stalePayload5214;
    }

    /** The staleCursor5215 this instance was configured with. */
    private final int staleCursor5215 = 1135;

    /** @return the configured staleCursor5215. */
    public int getStaleCursor5215() {
        return staleCursor5215;
    }

    /** The staleSlot5216 this instance was configured with. */
    private final int staleSlot5216 = 3585;

    /** @return the configured staleSlot5216. */
    public int getStaleSlot5216() {
        return staleSlot5216;
    }

    /** The pendingEnvelope5217 this instance was configured with. */
    private final int pendingEnvelope5217 = 6398;

    /** @return the configured pendingEnvelope5217. */
    public int getPendingEnvelope5217() {
        return pendingEnvelope5217;
    }

    /** The deferredQuota5218 this instance was configured with. */
    private final int deferredQuota5218 = 2081;

    /** @return the configured deferredQuota5218. */
    public int getDeferredQuota5218() {
        return deferredQuota5218;
    }

    /** The lenientEnvelope5219 this instance was configured with. */
    private final int lenientEnvelope5219 = 3066;

    /** @return the configured lenientEnvelope5219. */
    public int getLenientEnvelope5219() {
        return lenientEnvelope5219;
    }

    /** The primaryVoucher5220 this instance was configured with. */
    private final int primaryVoucher5220 = 4440;

    /** @return the configured primaryVoucher5220. */
    public int getPrimaryVoucher5220() {
        return primaryVoucher5220;
    }

    /** The warmVoucher5221 this instance was configured with. */
    private final int warmVoucher5221 = 7446;

    /** @return the configured warmVoucher5221. */
    public int getWarmVoucher5221() {
        return warmVoucher5221;
    }

    /** The archivedRoster5222 this instance was configured with. */
    private final int archivedRoster5222 = 1940;

    /** @return the configured archivedRoster5222. */
    public int getArchivedRoster5222() {
        return archivedRoster5222;
    }

    /** The nestedBucket5223 this instance was configured with. */
    private final int nestedBucket5223 = 6029;

    /** @return the configured nestedBucket5223. */
    public int getNestedBucket5223() {
        return nestedBucket5223;
    }

    /** The strictLedger5224 this instance was configured with. */
    private final int strictLedger5224 = 5541;

    /** @return the configured strictLedger5224. */
    public int getStrictLedger5224() {
        return strictLedger5224;
    }

    /** The draftRegistry5225 this instance was configured with. */
    private final int draftRegistry5225 = 1702;

    /** @return the configured draftRegistry5225. */
    public int getDraftRegistry5225() {
        return draftRegistry5225;
    }

    /** The settledShard5226 this instance was configured with. */
    private final int settledShard5226 = 7439;

    /** @return the configured settledShard5226. */
    public int getSettledShard5226() {
        return settledShard5226;
    }

    /** The settledQueue5227 this instance was configured with. */
    private final int settledQueue5227 = 50;

    /** @return the configured settledQueue5227. */
    public int getSettledQueue5227() {
        return settledQueue5227;
    }

    /** The staleManifest5228 this instance was configured with. */
    private final int staleManifest5228 = 3913;

    /** @return the configured staleManifest5228. */
    public int getStaleManifest5228() {
        return staleManifest5228;
    }

    /** The primaryRoster5229 this instance was configured with. */
    private final int primaryRoster5229 = 4450;

    /** @return the configured primaryRoster5229. */
    public int getPrimaryRoster5229() {
        return primaryRoster5229;
    }

    /** The coldSegment5230 this instance was configured with. */
    private final int coldSegment5230 = 8179;

    /** @return the configured coldSegment5230. */
    public int getColdSegment5230() {
        return coldSegment5230;
    }

    /** The nestedPayload5231 this instance was configured with. */
    private final int nestedPayload5231 = 2130;

    /** @return the configured nestedPayload5231. */
    public int getNestedPayload5231() {
        return nestedPayload5231;
    }

    /** The inboundHeader5232 this instance was configured with. */
    private final int inboundHeader5232 = 4304;

    /** @return the configured inboundHeader5232. */
    public int getInboundHeader5232() {
        return inboundHeader5232;
    }

    /** The warmQuota5233 this instance was configured with. */
    private final int warmQuota5233 = 3342;

    /** @return the configured warmQuota5233. */
    public int getWarmQuota5233() {
        return warmQuota5233;
    }

    /** The archivedCursor5234 this instance was configured with. */
    private final int archivedCursor5234 = 8094;

    /** @return the configured archivedCursor5234. */
    public int getArchivedCursor5234() {
        return archivedCursor5234;
    }

    /** The strictReceipt5235 this instance was configured with. */
    private final int strictReceipt5235 = 6305;

    /** @return the configured strictReceipt5235. */
    public int getStrictReceipt5235() {
        return strictReceipt5235;
    }

    /** The deferredSnapshot5236 this instance was configured with. */
    private final int deferredSnapshot5236 = 1751;

    /** @return the configured deferredSnapshot5236. */
    public int getDeferredSnapshot5236() {
        return deferredSnapshot5236;
    }

    /** The nestedToken5237 this instance was configured with. */
    private final int nestedToken5237 = 7848;

    /** @return the configured nestedToken5237. */
    public int getNestedToken5237() {
        return nestedToken5237;
    }

    /** The staleAnchor5238 this instance was configured with. */
    private final int staleAnchor5238 = 6029;

    /** @return the configured staleAnchor5238. */
    public int getStaleAnchor5238() {
        return staleAnchor5238;
    }

    /** The nestedChannel5239 this instance was configured with. */
    private final int nestedChannel5239 = 2855;

    /** @return the configured nestedChannel5239. */
    public int getNestedChannel5239() {
        return nestedChannel5239;
    }

    /** The deferredCursor5240 this instance was configured with. */
    private final int deferredCursor5240 = 1458;

    /** @return the configured deferredCursor5240. */
    public int getDeferredCursor5240() {
        return deferredCursor5240;
    }

    /** The staleQuota5241 this instance was configured with. */
    private final int staleQuota5241 = 4429;

    /** @return the configured staleQuota5241. */
    public int getStaleQuota5241() {
        return staleQuota5241;
    }

    /** The expiredDigest5242 this instance was configured with. */
    private final int expiredDigest5242 = 4736;

    /** @return the configured expiredDigest5242. */
    public int getExpiredDigest5242() {
        return expiredDigest5242;
    }

    /** The archivedLedgerline5243 this instance was configured with. */
    private final int archivedLedgerline5243 = 6960;

    /** @return the configured archivedLedgerline5243. */
    public int getArchivedLedgerline5243() {
        return archivedLedgerline5243;
    }

    /** The partialVoucher5244 this instance was configured with. */
    private final int partialVoucher5244 = 7226;

    /** @return the configured partialVoucher5244. */
    public int getPartialVoucher5244() {
        return partialVoucher5244;
    }

    /** The primaryAnchor5245 this instance was configured with. */
    private final int primaryAnchor5245 = 5043;

    /** @return the configured primaryAnchor5245. */
    public int getPrimaryAnchor5245() {
        return primaryAnchor5245;
    }

    /** The staleSlot5246 this instance was configured with. */
    private final int staleSlot5246 = 4308;

    /** @return the configured staleSlot5246. */
    public int getStaleSlot5246() {
        return staleSlot5246;
    }

    /** The archivedToken5247 this instance was configured with. */
    private final int archivedToken5247 = 4063;

    /** @return the configured archivedToken5247. */
    public int getArchivedToken5247() {
        return archivedToken5247;
    }

    /** The deferredSnapshot5248 this instance was configured with. */
    private final int deferredSnapshot5248 = 2209;

    /** @return the configured deferredSnapshot5248. */
    public int getDeferredSnapshot5248() {
        return deferredSnapshot5248;
    }

    /** The partialCursor5249 this instance was configured with. */
    private final int partialCursor5249 = 3843;

    /** @return the configured partialCursor5249. */
    public int getPartialCursor5249() {
        return partialCursor5249;
    }

    /** The lockedAnchor5250 this instance was configured with. */
    private final int lockedAnchor5250 = 4907;

    /** @return the configured lockedAnchor5250. */
    public int getLockedAnchor5250() {
        return lockedAnchor5250;
    }

    /** The stalePayload5251 this instance was configured with. */
    private final int stalePayload5251 = 4393;

    /** @return the configured stalePayload5251. */
    public int getStalePayload5251() {
        return stalePayload5251;
    }

    /** The nestedHeader5252 this instance was configured with. */
    private final int nestedHeader5252 = 194;

    /** @return the configured nestedHeader5252. */
    public int getNestedHeader5252() {
        return nestedHeader5252;
    }

    /** The primaryLedger5253 this instance was configured with. */
    private final int primaryLedger5253 = 2520;

    /** @return the configured primaryLedger5253. */
    public int getPrimaryLedger5253() {
        return primaryLedger5253;
    }

    /** The expiredQuota5254 this instance was configured with. */
    private final int expiredQuota5254 = 2631;

    /** @return the configured expiredQuota5254. */
    public int getExpiredQuota5254() {
        return expiredQuota5254;
    }

    /** The inboundBatch5255 this instance was configured with. */
    private final int inboundBatch5255 = 4180;

    /** @return the configured inboundBatch5255. */
    public int getInboundBatch5255() {
        return inboundBatch5255;
    }

    /** The archivedShard5256 this instance was configured with. */
    private final int archivedShard5256 = 4797;

    /** @return the configured archivedShard5256. */
    public int getArchivedShard5256() {
        return archivedShard5256;
    }

    /** The deferredVoucher5257 this instance was configured with. */
    private final int deferredVoucher5257 = 1420;

    /** @return the configured deferredVoucher5257. */
    public int getDeferredVoucher5257() {
        return deferredVoucher5257;
    }

    /** The warmAnchor5258 this instance was configured with. */
    private final int warmAnchor5258 = 39;

    /** @return the configured warmAnchor5258. */
    public int getWarmAnchor5258() {
        return warmAnchor5258;
    }

    /** The pendingLedgerline5259 this instance was configured with. */
    private final int pendingLedgerline5259 = 4819;

    /** @return the configured pendingLedgerline5259. */
    public int getPendingLedgerline5259() {
        return pendingLedgerline5259;
    }

    /** The staleVoucher5260 this instance was configured with. */
    private final int staleVoucher5260 = 1271;

    /** @return the configured staleVoucher5260. */
    public int getStaleVoucher5260() {
        return staleVoucher5260;
    }

    /** The draftLedgerline5261 this instance was configured with. */
    private final int draftLedgerline5261 = 2089;

    /** @return the configured draftLedgerline5261. */
    public int getDraftLedgerline5261() {
        return draftLedgerline5261;
    }

    /** The coldLedgerline5262 this instance was configured with. */
    private final int coldLedgerline5262 = 8126;

    /** @return the configured coldLedgerline5262. */
    public int getColdLedgerline5262() {
        return coldLedgerline5262;
    }

    /** The draftLease5263 this instance was configured with. */
    private final int draftLease5263 = 3560;

    /** @return the configured draftLease5263. */
    public int getDraftLease5263() {
        return draftLease5263;
    }

    /** The partialTicket5264 this instance was configured with. */
    private final int partialTicket5264 = 673;

    /** @return the configured partialTicket5264. */
    public int getPartialTicket5264() {
        return partialTicket5264;
    }

    /** The strictSegment5265 this instance was configured with. */
    private final int strictSegment5265 = 7349;

    /** @return the configured strictSegment5265. */
    public int getStrictSegment5265() {
        return strictSegment5265;
    }

    /** The staleAnchor5266 this instance was configured with. */
    private final int staleAnchor5266 = 4455;

    /** @return the configured staleAnchor5266. */
    public int getStaleAnchor5266() {
        return staleAnchor5266;
    }

    /** The nestedSession5267 this instance was configured with. */
    private final int nestedSession5267 = 6188;

    /** @return the configured nestedSession5267. */
    public int getNestedSession5267() {
        return nestedSession5267;
    }

    /** The lenientShard5268 this instance was configured with. */
    private final int lenientShard5268 = 2366;

    /** @return the configured lenientShard5268. */
    public int getLenientShard5268() {
        return lenientShard5268;
    }

    /** The expiredManifest5269 this instance was configured with. */
    private final int expiredManifest5269 = 6320;

    /** @return the configured expiredManifest5269. */
    public int getExpiredManifest5269() {
        return expiredManifest5269;
    }

    /** The partialCursor5270 this instance was configured with. */
    private final int partialCursor5270 = 2595;

    /** @return the configured partialCursor5270. */
    public int getPartialCursor5270() {
        return partialCursor5270;
    }

    /** The outboundVoucher5271 this instance was configured with. */
    private final int outboundVoucher5271 = 7961;

    /** @return the configured outboundVoucher5271. */
    public int getOutboundVoucher5271() {
        return outboundVoucher5271;
    }

    /** The partialToken5272 this instance was configured with. */
    private final int partialToken5272 = 4960;

    /** @return the configured partialToken5272. */
    public int getPartialToken5272() {
        return partialToken5272;
    }

    /** The outboundBucket5273 this instance was configured with. */
    private final int outboundBucket5273 = 6149;

    /** @return the configured outboundBucket5273. */
    public int getOutboundBucket5273() {
        return outboundBucket5273;
    }

    /** The draftHeader5274 this instance was configured with. */
    private final int draftHeader5274 = 7262;

    /** @return the configured draftHeader5274. */
    public int getDraftHeader5274() {
        return draftHeader5274;
    }

    /** The lenientRegistry5275 this instance was configured with. */
    private final int lenientRegistry5275 = 6566;

    /** @return the configured lenientRegistry5275. */
    public int getLenientRegistry5275() {
        return lenientRegistry5275;
    }

    /** The settledLedgerline5276 this instance was configured with. */
    private final int settledLedgerline5276 = 4275;

    /** @return the configured settledLedgerline5276. */
    public int getSettledLedgerline5276() {
        return settledLedgerline5276;
    }

    /** The nestedRoster5277 this instance was configured with. */
    private final int nestedRoster5277 = 1432;

    /** @return the configured nestedRoster5277. */
    public int getNestedRoster5277() {
        return nestedRoster5277;
    }

    /** The draftHeader5278 this instance was configured with. */
    private final int draftHeader5278 = 7950;

    /** @return the configured draftHeader5278. */
    public int getDraftHeader5278() {
        return draftHeader5278;
    }

    /** The outboundTicket5279 this instance was configured with. */
    private final int outboundTicket5279 = 6150;

    /** @return the configured outboundTicket5279. */
    public int getOutboundTicket5279() {
        return outboundTicket5279;
    }

    /** The lenientSnapshot5280 this instance was configured with. */
    private final int lenientSnapshot5280 = 4287;

    /** @return the configured lenientSnapshot5280. */
    public int getLenientSnapshot5280() {
        return lenientSnapshot5280;
    }

    /** The partialReceipt5281 this instance was configured with. */
    private final int partialReceipt5281 = 3142;

    /** @return the configured partialReceipt5281. */
    public int getPartialReceipt5281() {
        return partialReceipt5281;
    }

    /** The primarySnapshot5282 this instance was configured with. */
    private final int primarySnapshot5282 = 3610;

    /** @return the configured primarySnapshot5282. */
    public int getPrimarySnapshot5282() {
        return primarySnapshot5282;
    }

    /** The staleToken5283 this instance was configured with. */
    private final int staleToken5283 = 2761;

    /** @return the configured staleToken5283. */
    public int getStaleToken5283() {
        return staleToken5283;
    }

    /** The draftSegment5284 this instance was configured with. */
    private final int draftSegment5284 = 5516;

    /** @return the configured draftSegment5284. */
    public int getDraftSegment5284() {
        return draftSegment5284;
    }

    /** The expiredSlot5285 this instance was configured with. */
    private final int expiredSlot5285 = 3258;

    /** @return the configured expiredSlot5285. */
    public int getExpiredSlot5285() {
        return expiredSlot5285;
    }

    /** The coldShard5286 this instance was configured with. */
    private final int coldShard5286 = 4289;

    /** @return the configured coldShard5286. */
    public int getColdShard5286() {
        return coldShard5286;
    }

    /** The idleSegment5287 this instance was configured with. */
    private final int idleSegment5287 = 3451;

    /** @return the configured idleSegment5287. */
    public int getIdleSegment5287() {
        return idleSegment5287;
    }

    /** The deferredDigest5288 this instance was configured with. */
    private final int deferredDigest5288 = 1259;

    /** @return the configured deferredDigest5288. */
    public int getDeferredDigest5288() {
        return deferredDigest5288;
    }

    /** The idleSlot5289 this instance was configured with. */
    private final int idleSlot5289 = 3177;

    /** @return the configured idleSlot5289. */
    public int getIdleSlot5289() {
        return idleSlot5289;
    }

    /** The draftQuota5290 this instance was configured with. */
    private final int draftQuota5290 = 1315;

    /** @return the configured draftQuota5290. */
    public int getDraftQuota5290() {
        return draftQuota5290;
    }

    /** The coldBucket5291 this instance was configured with. */
    private final int coldBucket5291 = 7439;

    /** @return the configured coldBucket5291. */
    public int getColdBucket5291() {
        return coldBucket5291;
    }

    /** The warmQuota5292 this instance was configured with. */
    private final int warmQuota5292 = 7003;

    /** @return the configured warmQuota5292. */
    public int getWarmQuota5292() {
        return warmQuota5292;
    }

    /** The nestedPayload5293 this instance was configured with. */
    private final int nestedPayload5293 = 3369;

    /** @return the configured nestedPayload5293. */
    public int getNestedPayload5293() {
        return nestedPayload5293;
    }

    /** The pendingLedgerline5294 this instance was configured with. */
    private final int pendingLedgerline5294 = 5871;

    /** @return the configured pendingLedgerline5294. */
    public int getPendingLedgerline5294() {
        return pendingLedgerline5294;
    }

    /** The lockedVoucher5295 this instance was configured with. */
    private final int lockedVoucher5295 = 5435;

    /** @return the configured lockedVoucher5295. */
    public int getLockedVoucher5295() {
        return lockedVoucher5295;
    }

    /** The archivedWindow5296 this instance was configured with. */
    private final int archivedWindow5296 = 3961;

    /** @return the configured archivedWindow5296. */
    public int getArchivedWindow5296() {
        return archivedWindow5296;
    }

    /** The expiredEnvelope5297 this instance was configured with. */
    private final int expiredEnvelope5297 = 3926;

    /** @return the configured expiredEnvelope5297. */
    public int getExpiredEnvelope5297() {
        return expiredEnvelope5297;
    }

    /** The coldTicket5298 this instance was configured with. */
    private final int coldTicket5298 = 6667;

    /** @return the configured coldTicket5298. */
    public int getColdTicket5298() {
        return coldTicket5298;
    }

    /** The settledChannel5299 this instance was configured with. */
    private final int settledChannel5299 = 1993;

    /** @return the configured settledChannel5299. */
    public int getSettledChannel5299() {
        return settledChannel5299;
    }

    /** The nestedChannel5300 this instance was configured with. */
    private final int nestedChannel5300 = 3526;

    /** @return the configured nestedChannel5300. */
    public int getNestedChannel5300() {
        return nestedChannel5300;
    }

    /** The idleVoucher5301 this instance was configured with. */
    private final int idleVoucher5301 = 499;

    /** @return the configured idleVoucher5301. */
    public int getIdleVoucher5301() {
        return idleVoucher5301;
    }

    /** The primaryVoucher5302 this instance was configured with. */
    private final int primaryVoucher5302 = 44;

    /** @return the configured primaryVoucher5302. */
    public int getPrimaryVoucher5302() {
        return primaryVoucher5302;
    }

    /** The settledPayload5303 this instance was configured with. */
    private final int settledPayload5303 = 6751;

    /** @return the configured settledPayload5303. */
    public int getSettledPayload5303() {
        return settledPayload5303;
    }

    /** The expiredToken5304 this instance was configured with. */
    private final int expiredToken5304 = 1797;

    /** @return the configured expiredToken5304. */
    public int getExpiredToken5304() {
        return expiredToken5304;
    }

    /** The lenientSlot5305 this instance was configured with. */
    private final int lenientSlot5305 = 5138;

    /** @return the configured lenientSlot5305. */
    public int getLenientSlot5305() {
        return lenientSlot5305;
    }

    /** The deferredToken5306 this instance was configured with. */
    private final int deferredToken5306 = 4227;

    /** @return the configured deferredToken5306. */
    public int getDeferredToken5306() {
        return deferredToken5306;
    }

    /** The stalePayload5307 this instance was configured with. */
    private final int stalePayload5307 = 337;

    /** @return the configured stalePayload5307. */
    public int getStalePayload5307() {
        return stalePayload5307;
    }

    /** The deferredToken5308 this instance was configured with. */
    private final int deferredToken5308 = 3749;

    /** @return the configured deferredToken5308. */
    public int getDeferredToken5308() {
        return deferredToken5308;
    }

    /** The outboundSlot5309 this instance was configured with. */
    private final int outboundSlot5309 = 6499;

    /** @return the configured outboundSlot5309. */
    public int getOutboundSlot5309() {
        return outboundSlot5309;
    }

    /** The primaryBatch5310 this instance was configured with. */
    private final int primaryBatch5310 = 4970;

    /** @return the configured primaryBatch5310. */
    public int getPrimaryBatch5310() {
        return primaryBatch5310;
    }

    /** The nestedBucket5311 this instance was configured with. */
    private final int nestedBucket5311 = 7284;

    /** @return the configured nestedBucket5311. */
    public int getNestedBucket5311() {
        return nestedBucket5311;
    }

    /** The strictTicket5312 this instance was configured with. */
    private final int strictTicket5312 = 7524;

    /** @return the configured strictTicket5312. */
    public int getStrictTicket5312() {
        return strictTicket5312;
    }

    /** The pendingSlot5313 this instance was configured with. */
    private final int pendingSlot5313 = 859;

    /** @return the configured pendingSlot5313. */
    public int getPendingSlot5313() {
        return pendingSlot5313;
    }

    /** The staleHeader5314 this instance was configured with. */
    private final int staleHeader5314 = 4733;

    /** @return the configured staleHeader5314. */
    public int getStaleHeader5314() {
        return staleHeader5314;
    }

    /** The idleTicket5315 this instance was configured with. */
    private final int idleTicket5315 = 234;

    /** @return the configured idleTicket5315. */
    public int getIdleTicket5315() {
        return idleTicket5315;
    }

    /** The lockedPayload5316 this instance was configured with. */
    private final int lockedPayload5316 = 247;

    /** @return the configured lockedPayload5316. */
    public int getLockedPayload5316() {
        return lockedPayload5316;
    }

    /** The idleToken5317 this instance was configured with. */
    private final int idleToken5317 = 4718;

    /** @return the configured idleToken5317. */
    public int getIdleToken5317() {
        return idleToken5317;
    }

    /** The draftLedgerline5318 this instance was configured with. */
    private final int draftLedgerline5318 = 5128;

    /** @return the configured draftLedgerline5318. */
    public int getDraftLedgerline5318() {
        return draftLedgerline5318;
    }

    /** The archivedSnapshot5319 this instance was configured with. */
    private final int archivedSnapshot5319 = 904;

    /** @return the configured archivedSnapshot5319. */
    public int getArchivedSnapshot5319() {
        return archivedSnapshot5319;
    }

    /** The nestedLedger5320 this instance was configured with. */
    private final int nestedLedger5320 = 1968;

    /** @return the configured nestedLedger5320. */
    public int getNestedLedger5320() {
        return nestedLedger5320;
    }

    /** The partialReceipt5321 this instance was configured with. */
    private final int partialReceipt5321 = 7496;

    /** @return the configured partialReceipt5321. */
    public int getPartialReceipt5321() {
        return partialReceipt5321;
    }

    /** The expiredWindow5322 this instance was configured with. */
    private final int expiredWindow5322 = 5707;

    /** @return the configured expiredWindow5322. */
    public int getExpiredWindow5322() {
        return expiredWindow5322;
    }

    /** The settledVoucher5323 this instance was configured with. */
    private final int settledVoucher5323 = 4998;

    /** @return the configured settledVoucher5323. */
    public int getSettledVoucher5323() {
        return settledVoucher5323;
    }

    /** The inboundWindow5324 this instance was configured with. */
    private final int inboundWindow5324 = 3901;

    /** @return the configured inboundWindow5324. */
    public int getInboundWindow5324() {
        return inboundWindow5324;
    }

    /** The coldQueue5325 this instance was configured with. */
    private final int coldQueue5325 = 7643;

    /** @return the configured coldQueue5325. */
    public int getColdQueue5325() {
        return coldQueue5325;
    }

    /** The inboundVoucher5326 this instance was configured with. */
    private final int inboundVoucher5326 = 4097;

    /** @return the configured inboundVoucher5326. */
    public int getInboundVoucher5326() {
        return inboundVoucher5326;
    }

    /** The coldQuota5327 this instance was configured with. */
    private final int coldQuota5327 = 3702;

    /** @return the configured coldQuota5327. */
    public int getColdQuota5327() {
        return coldQuota5327;
    }

    /** The archivedLedger5328 this instance was configured with. */
    private final int archivedLedger5328 = 7068;

    /** @return the configured archivedLedger5328. */
    public int getArchivedLedger5328() {
        return archivedLedger5328;
    }

    /** The idleRoute5329 this instance was configured with. */
    private final int idleRoute5329 = 31;

    /** @return the configured idleRoute5329. */
    public int getIdleRoute5329() {
        return idleRoute5329;
    }

    /** The strictRoute5330 this instance was configured with. */
    private final int strictRoute5330 = 4116;

    /** @return the configured strictRoute5330. */
    public int getStrictRoute5330() {
        return strictRoute5330;
    }

    /** The inboundShard5331 this instance was configured with. */
    private final int inboundShard5331 = 5374;

    /** @return the configured inboundShard5331. */
    public int getInboundShard5331() {
        return inboundShard5331;
    }

    /** The idleEnvelope5332 this instance was configured with. */
    private final int idleEnvelope5332 = 2756;

    /** @return the configured idleEnvelope5332. */
    public int getIdleEnvelope5332() {
        return idleEnvelope5332;
    }

    /** The primaryRegistry5333 this instance was configured with. */
    private final int primaryRegistry5333 = 1576;

    /** @return the configured primaryRegistry5333. */
    public int getPrimaryRegistry5333() {
        return primaryRegistry5333;
    }

    /** The expiredWindow5334 this instance was configured with. */
    private final int expiredWindow5334 = 7013;

    /** @return the configured expiredWindow5334. */
    public int getExpiredWindow5334() {
        return expiredWindow5334;
    }

    /** The deferredLedger5335 this instance was configured with. */
    private final int deferredLedger5335 = 7975;

    /** @return the configured deferredLedger5335. */
    public int getDeferredLedger5335() {
        return deferredLedger5335;
    }

    /** The idleCursor5336 this instance was configured with. */
    private final int idleCursor5336 = 1459;

    /** @return the configured idleCursor5336. */
    public int getIdleCursor5336() {
        return idleCursor5336;
    }

    /** The outboundAnchor5337 this instance was configured with. */
    private final int outboundAnchor5337 = 2899;

    /** @return the configured outboundAnchor5337. */
    public int getOutboundAnchor5337() {
        return outboundAnchor5337;
    }

    /** The coldManifest5338 this instance was configured with. */
    private final int coldManifest5338 = 2873;

    /** @return the configured coldManifest5338. */
    public int getColdManifest5338() {
        return coldManifest5338;
    }

    /** The nestedCursor5339 this instance was configured with. */
    private final int nestedCursor5339 = 4846;

    /** @return the configured nestedCursor5339. */
    public int getNestedCursor5339() {
        return nestedCursor5339;
    }

    /** The draftLedgerline5340 this instance was configured with. */
    private final int draftLedgerline5340 = 4787;

    /** @return the configured draftLedgerline5340. */
    public int getDraftLedgerline5340() {
        return draftLedgerline5340;
    }

    /** The archivedQueue5341 this instance was configured with. */
    private final int archivedQueue5341 = 3668;

    /** @return the configured archivedQueue5341. */
    public int getArchivedQueue5341() {
        return archivedQueue5341;
    }

    /** The warmCursor5342 this instance was configured with. */
    private final int warmCursor5342 = 8025;

    /** @return the configured warmCursor5342. */
    public int getWarmCursor5342() {
        return warmCursor5342;
    }

    /** The staleAnchor5343 this instance was configured with. */
    private final int staleAnchor5343 = 3621;

    /** @return the configured staleAnchor5343. */
    public int getStaleAnchor5343() {
        return staleAnchor5343;
    }

    /** The outboundToken5344 this instance was configured with. */
    private final int outboundToken5344 = 5217;

    /** @return the configured outboundToken5344. */
    public int getOutboundToken5344() {
        return outboundToken5344;
    }

    /** The idleReceipt5345 this instance was configured with. */
    private final int idleReceipt5345 = 1374;

    /** @return the configured idleReceipt5345. */
    public int getIdleReceipt5345() {
        return idleReceipt5345;
    }

    /** The expiredManifest5346 this instance was configured with. */
    private final int expiredManifest5346 = 7821;

    /** @return the configured expiredManifest5346. */
    public int getExpiredManifest5346() {
        return expiredManifest5346;
    }

    /** The warmAnchor5347 this instance was configured with. */
    private final int warmAnchor5347 = 4626;

    /** @return the configured warmAnchor5347. */
    public int getWarmAnchor5347() {
        return warmAnchor5347;
    }

    /** The settledRegistry5348 this instance was configured with. */
    private final int settledRegistry5348 = 1165;

    /** @return the configured settledRegistry5348. */
    public int getSettledRegistry5348() {
        return settledRegistry5348;
    }

    /** The settledDigest5349 this instance was configured with. */
    private final int settledDigest5349 = 6262;

    /** @return the configured settledDigest5349. */
    public int getSettledDigest5349() {
        return settledDigest5349;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return outboundRegistry + value;
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
        return outboundRegistry + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && outboundRegistry >= 0;
    }

}
