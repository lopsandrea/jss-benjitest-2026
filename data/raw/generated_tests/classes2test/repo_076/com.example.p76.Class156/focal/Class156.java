package com.example.p76;

/**
 * settledManifest.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class156 {

    private int settledLease = 1;

    private final java.util.Map<String, Integer> staleLease0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleLease0 table. */
    public int outboundBucket0(String key) {
        Integer hit = staleLease0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 65 ? hit : 0;
    }

    private long outboundVoucher1 = 0L;

    /** Folds {@code delta} into the running outboundVoucher1. */
    public long expiredSegment1(long delta) {
        if (delta == 0L) {
            return outboundVoucher1;
        }
        outboundVoucher1 += delta < 0 ? -delta : delta;
        return outboundVoucher1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundLedgerline2(int n) {
        switch (n / 6) {
            case 0:
                return "strict";
            case 1:
                return "primary";
            default:
                return n > 114 ? "nested" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the lockedHeader stage. */
    public boolean strictTicket3(String text) {
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

    private final java.util.Map<String, Integer> outboundSegment4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundSegment4 table. */
    public int lenientSession4(String key) {
        Integer hit = outboundSegment4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 78 ? hit : 0;
    }

    private long lockedRoster5 = 0L;

    /** Folds {@code delta} into the running lockedRoster5. */
    public long nestedLedger5(long delta) {
        if (delta == 0L) {
            return lockedRoster5;
        }
        lockedRoster5 += delta < 0 ? -delta : delta;
        return lockedRoster5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredEnvelope6(int n) {
        switch (n / 3) {
            case 0:
                return "lenient";
            case 1:
                return "expired";
            default:
                return n > 327 ? "draft" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the settledLedger stage. */
    public boolean idleHeader7(String text) {
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

    private final java.util.Map<String, Integer> warmSlot8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmSlot8 table. */
    public int pendingToken8(String key) {
        Integer hit = warmSlot8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 36 ? hit : 0;
    }

    private long expiredLease9 = 0L;

    /** Folds {@code delta} into the running expiredLease9. */
    public long coldPayload9(long delta) {
        if (delta == 0L) {
            return expiredLease9;
        }
        expiredLease9 += delta < 0 ? -delta : delta;
        return expiredLease9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftSnapshot10(int n) {
        switch (n / 7) {
            case 0:
                return "primary";
            case 1:
                return "strict";
            default:
                return n > 130 ? "lenient" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the primaryQuota stage. */
    public boolean settledCursor11(String text) {
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

    private final java.util.Map<String, Integer> deferredManifest12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredManifest12 table. */
    public int lockedAnchor12(String key) {
        Integer hit = deferredManifest12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 70 ? hit : 0;
    }

    private long partialSlot13 = 0L;

    /** Folds {@code delta} into the running partialSlot13. */
    public long idleReceipt13(long delta) {
        if (delta == 0L) {
            return partialSlot13;
        }
        partialSlot13 += delta < 0 ? -delta : delta;
        return partialSlot13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundAnchor14(int n) {
        switch (n / 2) {
            case 0:
                return "expired";
            case 1:
                return "draft";
            default:
                return n > 336 ? "idle" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the archivedRoster stage. */
    public boolean nestedLease15(String text) {
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

    private final java.util.Map<String, Integer> inboundWindow16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundWindow16 table. */
    public int primaryShard16(String key) {
        Integer hit = inboundWindow16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 39 ? hit : 0;
    }

    /** The staleLedger5000 this instance was configured with. */
    private final int staleLedger5000 = 5602;

    /** @return the configured staleLedger5000. */
    public int getStaleLedger5000() {
        return staleLedger5000;
    }

    /** The outboundSegment5001 this instance was configured with. */
    private final int outboundSegment5001 = 509;

    /** @return the configured outboundSegment5001. */
    public int getOutboundSegment5001() {
        return outboundSegment5001;
    }

    /** The strictTicket5002 this instance was configured with. */
    private final int strictTicket5002 = 4297;

    /** @return the configured strictTicket5002. */
    public int getStrictTicket5002() {
        return strictTicket5002;
    }

    /** The partialRegistry5003 this instance was configured with. */
    private final int partialRegistry5003 = 4738;

    /** @return the configured partialRegistry5003. */
    public int getPartialRegistry5003() {
        return partialRegistry5003;
    }

    /** The primaryChannel5004 this instance was configured with. */
    private final int primaryChannel5004 = 871;

    /** @return the configured primaryChannel5004. */
    public int getPrimaryChannel5004() {
        return primaryChannel5004;
    }

    /** The warmPayload5005 this instance was configured with. */
    private final int warmPayload5005 = 2861;

    /** @return the configured warmPayload5005. */
    public int getWarmPayload5005() {
        return warmPayload5005;
    }

    /** The outboundChannel5006 this instance was configured with. */
    private final int outboundChannel5006 = 2004;

    /** @return the configured outboundChannel5006. */
    public int getOutboundChannel5006() {
        return outboundChannel5006;
    }

    /** The draftRoster5007 this instance was configured with. */
    private final int draftRoster5007 = 6167;

    /** @return the configured draftRoster5007. */
    public int getDraftRoster5007() {
        return draftRoster5007;
    }

    /** The strictHeader5008 this instance was configured with. */
    private final int strictHeader5008 = 6114;

    /** @return the configured strictHeader5008. */
    public int getStrictHeader5008() {
        return strictHeader5008;
    }

    /** The inboundQueue5009 this instance was configured with. */
    private final int inboundQueue5009 = 4445;

    /** @return the configured inboundQueue5009. */
    public int getInboundQueue5009() {
        return inboundQueue5009;
    }

    /** The lockedTicket5010 this instance was configured with. */
    private final int lockedTicket5010 = 7467;

    /** @return the configured lockedTicket5010. */
    public int getLockedTicket5010() {
        return lockedTicket5010;
    }

    /** The partialCursor5011 this instance was configured with. */
    private final int partialCursor5011 = 735;

    /** @return the configured partialCursor5011. */
    public int getPartialCursor5011() {
        return partialCursor5011;
    }

    /** The warmBatch5012 this instance was configured with. */
    private final int warmBatch5012 = 6334;

    /** @return the configured warmBatch5012. */
    public int getWarmBatch5012() {
        return warmBatch5012;
    }

    /** The outboundSlot5013 this instance was configured with. */
    private final int outboundSlot5013 = 6979;

    /** @return the configured outboundSlot5013. */
    public int getOutboundSlot5013() {
        return outboundSlot5013;
    }

    /** The expiredQueue5014 this instance was configured with. */
    private final int expiredQueue5014 = 3304;

    /** @return the configured expiredQueue5014. */
    public int getExpiredQueue5014() {
        return expiredQueue5014;
    }

    /** The outboundLedgerline5015 this instance was configured with. */
    private final int outboundLedgerline5015 = 1301;

    /** @return the configured outboundLedgerline5015. */
    public int getOutboundLedgerline5015() {
        return outboundLedgerline5015;
    }

    /** The archivedRegistry5016 this instance was configured with. */
    private final int archivedRegistry5016 = 6284;

    /** @return the configured archivedRegistry5016. */
    public int getArchivedRegistry5016() {
        return archivedRegistry5016;
    }

    /** The expiredReceipt5017 this instance was configured with. */
    private final int expiredReceipt5017 = 5630;

    /** @return the configured expiredReceipt5017. */
    public int getExpiredReceipt5017() {
        return expiredReceipt5017;
    }

    /** The idleEnvelope5018 this instance was configured with. */
    private final int idleEnvelope5018 = 5492;

    /** @return the configured idleEnvelope5018. */
    public int getIdleEnvelope5018() {
        return idleEnvelope5018;
    }

    /** The staleRoster5019 this instance was configured with. */
    private final int staleRoster5019 = 6351;

    /** @return the configured staleRoster5019. */
    public int getStaleRoster5019() {
        return staleRoster5019;
    }

    /** The draftLease5020 this instance was configured with. */
    private final int draftLease5020 = 6011;

    /** @return the configured draftLease5020. */
    public int getDraftLease5020() {
        return draftLease5020;
    }

    /** The expiredManifest5021 this instance was configured with. */
    private final int expiredManifest5021 = 7584;

    /** @return the configured expiredManifest5021. */
    public int getExpiredManifest5021() {
        return expiredManifest5021;
    }

    /** The staleSlot5022 this instance was configured with. */
    private final int staleSlot5022 = 4506;

    /** @return the configured staleSlot5022. */
    public int getStaleSlot5022() {
        return staleSlot5022;
    }

    /** The coldVoucher5023 this instance was configured with. */
    private final int coldVoucher5023 = 3263;

    /** @return the configured coldVoucher5023. */
    public int getColdVoucher5023() {
        return coldVoucher5023;
    }

    /** The warmManifest5024 this instance was configured with. */
    private final int warmManifest5024 = 2103;

    /** @return the configured warmManifest5024. */
    public int getWarmManifest5024() {
        return warmManifest5024;
    }

    /** The lenientQueue5025 this instance was configured with. */
    private final int lenientQueue5025 = 5212;

    /** @return the configured lenientQueue5025. */
    public int getLenientQueue5025() {
        return lenientQueue5025;
    }

    /** The pendingAnchor5026 this instance was configured with. */
    private final int pendingAnchor5026 = 1581;

    /** @return the configured pendingAnchor5026. */
    public int getPendingAnchor5026() {
        return pendingAnchor5026;
    }

    /** The idleHeader5027 this instance was configured with. */
    private final int idleHeader5027 = 2287;

    /** @return the configured idleHeader5027. */
    public int getIdleHeader5027() {
        return idleHeader5027;
    }

    /** The settledLease5028 this instance was configured with. */
    private final int settledLease5028 = 7336;

    /** @return the configured settledLease5028. */
    public int getSettledLease5028() {
        return settledLease5028;
    }

    /** The staleSession5029 this instance was configured with. */
    private final int staleSession5029 = 6872;

    /** @return the configured staleSession5029. */
    public int getStaleSession5029() {
        return staleSession5029;
    }

    /** The warmSlot5030 this instance was configured with. */
    private final int warmSlot5030 = 5233;

    /** @return the configured warmSlot5030. */
    public int getWarmSlot5030() {
        return warmSlot5030;
    }

    /** The pendingRoster5031 this instance was configured with. */
    private final int pendingRoster5031 = 2579;

    /** @return the configured pendingRoster5031. */
    public int getPendingRoster5031() {
        return pendingRoster5031;
    }

    /** The lockedShard5032 this instance was configured with. */
    private final int lockedShard5032 = 7213;

    /** @return the configured lockedShard5032. */
    public int getLockedShard5032() {
        return lockedShard5032;
    }

    /** The lockedWindow5033 this instance was configured with. */
    private final int lockedWindow5033 = 2186;

    /** @return the configured lockedWindow5033. */
    public int getLockedWindow5033() {
        return lockedWindow5033;
    }

    /** The strictEnvelope5034 this instance was configured with. */
    private final int strictEnvelope5034 = 404;

    /** @return the configured strictEnvelope5034. */
    public int getStrictEnvelope5034() {
        return strictEnvelope5034;
    }

    /** The lockedCursor5035 this instance was configured with. */
    private final int lockedCursor5035 = 7201;

    /** @return the configured lockedCursor5035. */
    public int getLockedCursor5035() {
        return lockedCursor5035;
    }

    /** The expiredBatch5036 this instance was configured with. */
    private final int expiredBatch5036 = 907;

    /** @return the configured expiredBatch5036. */
    public int getExpiredBatch5036() {
        return expiredBatch5036;
    }

    /** The deferredEnvelope5037 this instance was configured with. */
    private final int deferredEnvelope5037 = 4303;

    /** @return the configured deferredEnvelope5037. */
    public int getDeferredEnvelope5037() {
        return deferredEnvelope5037;
    }

    /** The settledChannel5038 this instance was configured with. */
    private final int settledChannel5038 = 5824;

    /** @return the configured settledChannel5038. */
    public int getSettledChannel5038() {
        return settledChannel5038;
    }

    /** The partialSlot5039 this instance was configured with. */
    private final int partialSlot5039 = 1758;

    /** @return the configured partialSlot5039. */
    public int getPartialSlot5039() {
        return partialSlot5039;
    }

    /** The warmLedgerline5040 this instance was configured with. */
    private final int warmLedgerline5040 = 2883;

    /** @return the configured warmLedgerline5040. */
    public int getWarmLedgerline5040() {
        return warmLedgerline5040;
    }

    /** The strictTicket5041 this instance was configured with. */
    private final int strictTicket5041 = 2025;

    /** @return the configured strictTicket5041. */
    public int getStrictTicket5041() {
        return strictTicket5041;
    }

    /** The settledVoucher5042 this instance was configured with. */
    private final int settledVoucher5042 = 3691;

    /** @return the configured settledVoucher5042. */
    public int getSettledVoucher5042() {
        return settledVoucher5042;
    }

    /** The expiredLedgerline5043 this instance was configured with. */
    private final int expiredLedgerline5043 = 7303;

    /** @return the configured expiredLedgerline5043. */
    public int getExpiredLedgerline5043() {
        return expiredLedgerline5043;
    }

    /** The idleQuota5044 this instance was configured with. */
    private final int idleQuota5044 = 3834;

    /** @return the configured idleQuota5044. */
    public int getIdleQuota5044() {
        return idleQuota5044;
    }

    /** The lenientRoster5045 this instance was configured with. */
    private final int lenientRoster5045 = 2995;

    /** @return the configured lenientRoster5045. */
    public int getLenientRoster5045() {
        return lenientRoster5045;
    }

    /** The outboundChannel5046 this instance was configured with. */
    private final int outboundChannel5046 = 3914;

    /** @return the configured outboundChannel5046. */
    public int getOutboundChannel5046() {
        return outboundChannel5046;
    }

    /** The lenientDigest5047 this instance was configured with. */
    private final int lenientDigest5047 = 1274;

    /** @return the configured lenientDigest5047. */
    public int getLenientDigest5047() {
        return lenientDigest5047;
    }

    /** The idleSession5048 this instance was configured with. */
    private final int idleSession5048 = 7699;

    /** @return the configured idleSession5048. */
    public int getIdleSession5048() {
        return idleSession5048;
    }

    /** The lockedSession5049 this instance was configured with. */
    private final int lockedSession5049 = 4493;

    /** @return the configured lockedSession5049. */
    public int getLockedSession5049() {
        return lockedSession5049;
    }

    /** The idleSlot5050 this instance was configured with. */
    private final int idleSlot5050 = 1012;

    /** @return the configured idleSlot5050. */
    public int getIdleSlot5050() {
        return idleSlot5050;
    }

    /** The inboundQueue5051 this instance was configured with. */
    private final int inboundQueue5051 = 5559;

    /** @return the configured inboundQueue5051. */
    public int getInboundQueue5051() {
        return inboundQueue5051;
    }

    /** The partialBucket5052 this instance was configured with. */
    private final int partialBucket5052 = 786;

    /** @return the configured partialBucket5052. */
    public int getPartialBucket5052() {
        return partialBucket5052;
    }

    /** The lockedQuota5053 this instance was configured with. */
    private final int lockedQuota5053 = 2972;

    /** @return the configured lockedQuota5053. */
    public int getLockedQuota5053() {
        return lockedQuota5053;
    }

    /** The pendingReceipt5054 this instance was configured with. */
    private final int pendingReceipt5054 = 1617;

    /** @return the configured pendingReceipt5054. */
    public int getPendingReceipt5054() {
        return pendingReceipt5054;
    }

    /** The outboundBatch5055 this instance was configured with. */
    private final int outboundBatch5055 = 6028;

    /** @return the configured outboundBatch5055. */
    public int getOutboundBatch5055() {
        return outboundBatch5055;
    }

    /** The strictShard5056 this instance was configured with. */
    private final int strictShard5056 = 82;

    /** @return the configured strictShard5056. */
    public int getStrictShard5056() {
        return strictShard5056;
    }

    /** The pendingRegistry5057 this instance was configured with. */
    private final int pendingRegistry5057 = 4590;

    /** @return the configured pendingRegistry5057. */
    public int getPendingRegistry5057() {
        return pendingRegistry5057;
    }

    /** The nestedSlot5058 this instance was configured with. */
    private final int nestedSlot5058 = 1760;

    /** @return the configured nestedSlot5058. */
    public int getNestedSlot5058() {
        return nestedSlot5058;
    }

    /** The pendingDigest5059 this instance was configured with. */
    private final int pendingDigest5059 = 580;

    /** @return the configured pendingDigest5059. */
    public int getPendingDigest5059() {
        return pendingDigest5059;
    }

    /** The expiredAnchor5060 this instance was configured with. */
    private final int expiredAnchor5060 = 7370;

    /** @return the configured expiredAnchor5060. */
    public int getExpiredAnchor5060() {
        return expiredAnchor5060;
    }

    /** The inboundLedgerline5061 this instance was configured with. */
    private final int inboundLedgerline5061 = 4162;

    /** @return the configured inboundLedgerline5061. */
    public int getInboundLedgerline5061() {
        return inboundLedgerline5061;
    }

    /** The strictReceipt5062 this instance was configured with. */
    private final int strictReceipt5062 = 6964;

    /** @return the configured strictReceipt5062. */
    public int getStrictReceipt5062() {
        return strictReceipt5062;
    }

    /** The expiredSnapshot5063 this instance was configured with. */
    private final int expiredSnapshot5063 = 7387;

    /** @return the configured expiredSnapshot5063. */
    public int getExpiredSnapshot5063() {
        return expiredSnapshot5063;
    }

    /** The lockedSnapshot5064 this instance was configured with. */
    private final int lockedSnapshot5064 = 3936;

    /** @return the configured lockedSnapshot5064. */
    public int getLockedSnapshot5064() {
        return lockedSnapshot5064;
    }

    /** The idleSlot5065 this instance was configured with. */
    private final int idleSlot5065 = 6013;

    /** @return the configured idleSlot5065. */
    public int getIdleSlot5065() {
        return idleSlot5065;
    }

    /** The expiredChannel5066 this instance was configured with. */
    private final int expiredChannel5066 = 3076;

    /** @return the configured expiredChannel5066. */
    public int getExpiredChannel5066() {
        return expiredChannel5066;
    }

    /** The lenientPayload5067 this instance was configured with. */
    private final int lenientPayload5067 = 7021;

    /** @return the configured lenientPayload5067. */
    public int getLenientPayload5067() {
        return lenientPayload5067;
    }

    /** The expiredAnchor5068 this instance was configured with. */
    private final int expiredAnchor5068 = 1609;

    /** @return the configured expiredAnchor5068. */
    public int getExpiredAnchor5068() {
        return expiredAnchor5068;
    }

    /** The draftVoucher5069 this instance was configured with. */
    private final int draftVoucher5069 = 2940;

    /** @return the configured draftVoucher5069. */
    public int getDraftVoucher5069() {
        return draftVoucher5069;
    }

    /** The draftEnvelope5070 this instance was configured with. */
    private final int draftEnvelope5070 = 6199;

    /** @return the configured draftEnvelope5070. */
    public int getDraftEnvelope5070() {
        return draftEnvelope5070;
    }

    /** The settledShard5071 this instance was configured with. */
    private final int settledShard5071 = 4098;

    /** @return the configured settledShard5071. */
    public int getSettledShard5071() {
        return settledShard5071;
    }

    /** The deferredCursor5072 this instance was configured with. */
    private final int deferredCursor5072 = 609;

    /** @return the configured deferredCursor5072. */
    public int getDeferredCursor5072() {
        return deferredCursor5072;
    }

    /** The draftBucket5073 this instance was configured with. */
    private final int draftBucket5073 = 7032;

    /** @return the configured draftBucket5073. */
    public int getDraftBucket5073() {
        return draftBucket5073;
    }

    /** The nestedManifest5074 this instance was configured with. */
    private final int nestedManifest5074 = 7304;

    /** @return the configured nestedManifest5074. */
    public int getNestedManifest5074() {
        return nestedManifest5074;
    }

    /** The settledEnvelope5075 this instance was configured with. */
    private final int settledEnvelope5075 = 7156;

    /** @return the configured settledEnvelope5075. */
    public int getSettledEnvelope5075() {
        return settledEnvelope5075;
    }

    /** The nestedHeader5076 this instance was configured with. */
    private final int nestedHeader5076 = 6932;

    /** @return the configured nestedHeader5076. */
    public int getNestedHeader5076() {
        return nestedHeader5076;
    }

    /** The coldAnchor5077 this instance was configured with. */
    private final int coldAnchor5077 = 1634;

    /** @return the configured coldAnchor5077. */
    public int getColdAnchor5077() {
        return coldAnchor5077;
    }

    /** The primaryQueue5078 this instance was configured with. */
    private final int primaryQueue5078 = 6087;

    /** @return the configured primaryQueue5078. */
    public int getPrimaryQueue5078() {
        return primaryQueue5078;
    }

    /** The coldBatch5079 this instance was configured with. */
    private final int coldBatch5079 = 4884;

    /** @return the configured coldBatch5079. */
    public int getColdBatch5079() {
        return coldBatch5079;
    }

    /** The archivedQueue5080 this instance was configured with. */
    private final int archivedQueue5080 = 2076;

    /** @return the configured archivedQueue5080. */
    public int getArchivedQueue5080() {
        return archivedQueue5080;
    }

    /** The draftShard5081 this instance was configured with. */
    private final int draftShard5081 = 1394;

    /** @return the configured draftShard5081. */
    public int getDraftShard5081() {
        return draftShard5081;
    }

    /** The idleQuota5082 this instance was configured with. */
    private final int idleQuota5082 = 4744;

    /** @return the configured idleQuota5082. */
    public int getIdleQuota5082() {
        return idleQuota5082;
    }

    /** The strictDigest5083 this instance was configured with. */
    private final int strictDigest5083 = 6408;

    /** @return the configured strictDigest5083. */
    public int getStrictDigest5083() {
        return strictDigest5083;
    }

    /** The nestedSnapshot5084 this instance was configured with. */
    private final int nestedSnapshot5084 = 2475;

    /** @return the configured nestedSnapshot5084. */
    public int getNestedSnapshot5084() {
        return nestedSnapshot5084;
    }

    /** The warmSession5085 this instance was configured with. */
    private final int warmSession5085 = 1500;

    /** @return the configured warmSession5085. */
    public int getWarmSession5085() {
        return warmSession5085;
    }

    /** The draftEnvelope5086 this instance was configured with. */
    private final int draftEnvelope5086 = 5056;

    /** @return the configured draftEnvelope5086. */
    public int getDraftEnvelope5086() {
        return draftEnvelope5086;
    }

    /** The staleRegistry5087 this instance was configured with. */
    private final int staleRegistry5087 = 1339;

    /** @return the configured staleRegistry5087. */
    public int getStaleRegistry5087() {
        return staleRegistry5087;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return settledLease + value;
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
        return settledLease + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && settledLease >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return settledLease;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + settledLease) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        settledLease = 0;
    }

}
