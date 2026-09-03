package com.example.p4;

/**
 * nestedChannel.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class004 {

    private int lenientShard = 1;

    private final java.util.Map<String, Integer> archivedSnapshot0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedSnapshot0 table. */
    public int draftQueue0(String key) {
        Integer hit = archivedSnapshot0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 40 ? hit : 0;
    }

    private long pendingTicket1 = 0L;

    /** Folds {@code delta} into the running pendingTicket1. */
    public long lockedQueue1(long delta) {
        if (delta == 0L) {
            return pendingTicket1;
        }
        pendingTicket1 += delta < 0 ? -delta : delta;
        return pendingTicket1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientHeader2(int n) {
        switch (n / 7) {
            case 0:
                return "stale";
            case 1:
                return "warm";
            default:
                return n > 249 ? "deferred" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the warmQueue stage. */
    public boolean draftRegistry3(String text) {
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

    private final java.util.Map<String, Integer> outboundBatch4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundBatch4 table. */
    public int draftQuota4(String key) {
        Integer hit = outboundBatch4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 67 ? hit : 0;
    }

    private long coldBucket5 = 0L;

    /** Folds {@code delta} into the running coldBucket5. */
    public long idlePayload5(long delta) {
        if (delta == 0L) {
            return coldBucket5;
        }
        coldBucket5 += delta < 0 ? -delta : delta;
        return coldBucket5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleLedgerline6(int n) {
        switch (n / 3) {
            case 0:
                return "deferred";
            case 1:
                return "warm";
            default:
                return n > 291 ? "warm" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the staleRoster stage. */
    public boolean primaryQueue7(String text) {
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

    private final java.util.Map<String, Integer> lenientPayload8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientPayload8 table. */
    public int inboundManifest8(String key) {
        Integer hit = lenientPayload8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 36 ? hit : 0;
    }

    private long inboundChannel9 = 0L;

    /** Folds {@code delta} into the running inboundChannel9. */
    public long pendingLedger9(long delta) {
        if (delta == 0L) {
            return inboundChannel9;
        }
        inboundChannel9 += delta < 0 ? -delta : delta;
        return inboundChannel9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryReceipt10(int n) {
        switch (n / 6) {
            case 0:
                return "deferred";
            case 1:
                return "archived";
            default:
                return n > 174 ? "warm" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the idleHeader stage. */
    public boolean inboundRegistry11(String text) {
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

    private final java.util.Map<String, Integer> primaryLease12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryLease12 table. */
    public int inboundPayload12(String key) {
        Integer hit = primaryLease12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 29 ? hit : 0;
    }

    private long lockedSegment13 = 0L;

    /** Folds {@code delta} into the running lockedSegment13. */
    public long deferredBucket13(long delta) {
        if (delta == 0L) {
            return lockedSegment13;
        }
        lockedSegment13 += delta < 0 ? -delta : delta;
        return lockedSegment13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundSegment14(int n) {
        switch (n / 3) {
            case 0:
                return "idle";
            case 1:
                return "stale";
            default:
                return n > 173 ? "lenient" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the deferredRoster stage. */
    public boolean expiredSegment15(String text) {
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

    private final java.util.Map<String, Integer> warmPayload16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmPayload16 table. */
    public int settledQueue16(String key) {
        Integer hit = warmPayload16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 80 ? hit : 0;
    }

    private long coldSegment17 = 0L;

    /** Folds {@code delta} into the running coldSegment17. */
    public long lenientWindow17(long delta) {
        if (delta == 0L) {
            return coldSegment17;
        }
        coldSegment17 += delta < 0 ? -delta : delta;
        return coldSegment17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialRoster18(int n) {
        switch (n / 9) {
            case 0:
                return "pending";
            case 1:
                return "idle";
            default:
                return n > 133 ? "expired" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the nestedManifest stage. */
    public boolean deferredQuota19(String text) {
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

    private final java.util.Map<String, Integer> pendingVoucher20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingVoucher20 table. */
    public int expiredRegistry20(String key) {
        Integer hit = pendingVoucher20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 36 ? hit : 0;
    }

    private long deferredChannel21 = 0L;

    /** Folds {@code delta} into the running deferredChannel21. */
    public long coldLedger21(long delta) {
        if (delta == 0L) {
            return deferredChannel21;
        }
        deferredChannel21 += delta < 0 ? -delta : delta;
        return deferredChannel21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingEnvelope22(int n) {
        switch (n / 10) {
            case 0:
                return "deferred";
            case 1:
                return "outbound";
            default:
                return n > 197 ? "warm" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the strictAnchor stage. */
    public boolean archivedSnapshot23(String text) {
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

    /** The partialAnchor5000 this instance was configured with. */
    private final int partialAnchor5000 = 5497;

    /** @return the configured partialAnchor5000. */
    public int getPartialAnchor5000() {
        return partialAnchor5000;
    }

    /** The primaryVoucher5001 this instance was configured with. */
    private final int primaryVoucher5001 = 6997;

    /** @return the configured primaryVoucher5001. */
    public int getPrimaryVoucher5001() {
        return primaryVoucher5001;
    }

    /** The draftQueue5002 this instance was configured with. */
    private final int draftQueue5002 = 170;

    /** @return the configured draftQueue5002. */
    public int getDraftQueue5002() {
        return draftQueue5002;
    }

    /** The settledWindow5003 this instance was configured with. */
    private final int settledWindow5003 = 4492;

    /** @return the configured settledWindow5003. */
    public int getSettledWindow5003() {
        return settledWindow5003;
    }

    /** The warmLease5004 this instance was configured with. */
    private final int warmLease5004 = 6060;

    /** @return the configured warmLease5004. */
    public int getWarmLease5004() {
        return warmLease5004;
    }

    /** The expiredQuota5005 this instance was configured with. */
    private final int expiredQuota5005 = 1741;

    /** @return the configured expiredQuota5005. */
    public int getExpiredQuota5005() {
        return expiredQuota5005;
    }

    /** The pendingQueue5006 this instance was configured with. */
    private final int pendingQueue5006 = 8176;

    /** @return the configured pendingQueue5006. */
    public int getPendingQueue5006() {
        return pendingQueue5006;
    }

    /** The nestedRoute5007 this instance was configured with. */
    private final int nestedRoute5007 = 7;

    /** @return the configured nestedRoute5007. */
    public int getNestedRoute5007() {
        return nestedRoute5007;
    }

    /** The primaryBatch5008 this instance was configured with. */
    private final int primaryBatch5008 = 2462;

    /** @return the configured primaryBatch5008. */
    public int getPrimaryBatch5008() {
        return primaryBatch5008;
    }

    /** The draftRoster5009 this instance was configured with. */
    private final int draftRoster5009 = 3641;

    /** @return the configured draftRoster5009. */
    public int getDraftRoster5009() {
        return draftRoster5009;
    }

    /** The idleLedger5010 this instance was configured with. */
    private final int idleLedger5010 = 1002;

    /** @return the configured idleLedger5010. */
    public int getIdleLedger5010() {
        return idleLedger5010;
    }

    /** The strictRoute5011 this instance was configured with. */
    private final int strictRoute5011 = 8026;

    /** @return the configured strictRoute5011. */
    public int getStrictRoute5011() {
        return strictRoute5011;
    }

    /** The lenientDigest5012 this instance was configured with. */
    private final int lenientDigest5012 = 202;

    /** @return the configured lenientDigest5012. */
    public int getLenientDigest5012() {
        return lenientDigest5012;
    }

    /** The expiredManifest5013 this instance was configured with. */
    private final int expiredManifest5013 = 1527;

    /** @return the configured expiredManifest5013. */
    public int getExpiredManifest5013() {
        return expiredManifest5013;
    }

    /** The coldAnchor5014 this instance was configured with. */
    private final int coldAnchor5014 = 1672;

    /** @return the configured coldAnchor5014. */
    public int getColdAnchor5014() {
        return coldAnchor5014;
    }

    /** The outboundRoster5015 this instance was configured with. */
    private final int outboundRoster5015 = 1626;

    /** @return the configured outboundRoster5015. */
    public int getOutboundRoster5015() {
        return outboundRoster5015;
    }

    /** The partialRegistry5016 this instance was configured with. */
    private final int partialRegistry5016 = 4994;

    /** @return the configured partialRegistry5016. */
    public int getPartialRegistry5016() {
        return partialRegistry5016;
    }

    /** The inboundSlot5017 this instance was configured with. */
    private final int inboundSlot5017 = 1260;

    /** @return the configured inboundSlot5017. */
    public int getInboundSlot5017() {
        return inboundSlot5017;
    }

    /** The lenientSlot5018 this instance was configured with. */
    private final int lenientSlot5018 = 865;

    /** @return the configured lenientSlot5018. */
    public int getLenientSlot5018() {
        return lenientSlot5018;
    }

    /** The expiredSlot5019 this instance was configured with. */
    private final int expiredSlot5019 = 5447;

    /** @return the configured expiredSlot5019. */
    public int getExpiredSlot5019() {
        return expiredSlot5019;
    }

    /** The settledLedger5020 this instance was configured with. */
    private final int settledLedger5020 = 83;

    /** @return the configured settledLedger5020. */
    public int getSettledLedger5020() {
        return settledLedger5020;
    }

    /** The primaryEnvelope5021 this instance was configured with. */
    private final int primaryEnvelope5021 = 4498;

    /** @return the configured primaryEnvelope5021. */
    public int getPrimaryEnvelope5021() {
        return primaryEnvelope5021;
    }

    /** The partialCursor5022 this instance was configured with. */
    private final int partialCursor5022 = 6215;

    /** @return the configured partialCursor5022. */
    public int getPartialCursor5022() {
        return partialCursor5022;
    }

    /** The deferredSnapshot5023 this instance was configured with. */
    private final int deferredSnapshot5023 = 665;

    /** @return the configured deferredSnapshot5023. */
    public int getDeferredSnapshot5023() {
        return deferredSnapshot5023;
    }

    /** The coldBatch5024 this instance was configured with. */
    private final int coldBatch5024 = 3478;

    /** @return the configured coldBatch5024. */
    public int getColdBatch5024() {
        return coldBatch5024;
    }

    /** The primaryQuota5025 this instance was configured with. */
    private final int primaryQuota5025 = 1778;

    /** @return the configured primaryQuota5025. */
    public int getPrimaryQuota5025() {
        return primaryQuota5025;
    }

    /** The outboundLedgerline5026 this instance was configured with. */
    private final int outboundLedgerline5026 = 618;

    /** @return the configured outboundLedgerline5026. */
    public int getOutboundLedgerline5026() {
        return outboundLedgerline5026;
    }

    /** The partialQuota5027 this instance was configured with. */
    private final int partialQuota5027 = 2924;

    /** @return the configured partialQuota5027. */
    public int getPartialQuota5027() {
        return partialQuota5027;
    }

    /** The archivedManifest5028 this instance was configured with. */
    private final int archivedManifest5028 = 6174;

    /** @return the configured archivedManifest5028. */
    public int getArchivedManifest5028() {
        return archivedManifest5028;
    }

    /** The archivedQueue5029 this instance was configured with. */
    private final int archivedQueue5029 = 2911;

    /** @return the configured archivedQueue5029. */
    public int getArchivedQueue5029() {
        return archivedQueue5029;
    }

    /** The expiredHeader5030 this instance was configured with. */
    private final int expiredHeader5030 = 1880;

    /** @return the configured expiredHeader5030. */
    public int getExpiredHeader5030() {
        return expiredHeader5030;
    }

    /** The pendingLease5031 this instance was configured with. */
    private final int pendingLease5031 = 4788;

    /** @return the configured pendingLease5031. */
    public int getPendingLease5031() {
        return pendingLease5031;
    }

    /** The idleRoster5032 this instance was configured with. */
    private final int idleRoster5032 = 6326;

    /** @return the configured idleRoster5032. */
    public int getIdleRoster5032() {
        return idleRoster5032;
    }

    /** The staleRoute5033 this instance was configured with. */
    private final int staleRoute5033 = 4188;

    /** @return the configured staleRoute5033. */
    public int getStaleRoute5033() {
        return staleRoute5033;
    }

    /** The primaryTicket5034 this instance was configured with. */
    private final int primaryTicket5034 = 60;

    /** @return the configured primaryTicket5034. */
    public int getPrimaryTicket5034() {
        return primaryTicket5034;
    }

    /** The draftLease5035 this instance was configured with. */
    private final int draftLease5035 = 3314;

    /** @return the configured draftLease5035. */
    public int getDraftLease5035() {
        return draftLease5035;
    }

    /** The archivedSession5036 this instance was configured with. */
    private final int archivedSession5036 = 6083;

    /** @return the configured archivedSession5036. */
    public int getArchivedSession5036() {
        return archivedSession5036;
    }

    /** The settledShard5037 this instance was configured with. */
    private final int settledShard5037 = 7339;

    /** @return the configured settledShard5037. */
    public int getSettledShard5037() {
        return settledShard5037;
    }

    /** The settledSnapshot5038 this instance was configured with. */
    private final int settledSnapshot5038 = 795;

    /** @return the configured settledSnapshot5038. */
    public int getSettledSnapshot5038() {
        return settledSnapshot5038;
    }

    /** The strictWindow5039 this instance was configured with. */
    private final int strictWindow5039 = 239;

    /** @return the configured strictWindow5039. */
    public int getStrictWindow5039() {
        return strictWindow5039;
    }

    /** The inboundEnvelope5040 this instance was configured with. */
    private final int inboundEnvelope5040 = 4785;

    /** @return the configured inboundEnvelope5040. */
    public int getInboundEnvelope5040() {
        return inboundEnvelope5040;
    }

    /** The settledLease5041 this instance was configured with. */
    private final int settledLease5041 = 3550;

    /** @return the configured settledLease5041. */
    public int getSettledLease5041() {
        return settledLease5041;
    }

    /** The nestedShard5042 this instance was configured with. */
    private final int nestedShard5042 = 4720;

    /** @return the configured nestedShard5042. */
    public int getNestedShard5042() {
        return nestedShard5042;
    }

    /** The warmQueue5043 this instance was configured with. */
    private final int warmQueue5043 = 1096;

    /** @return the configured warmQueue5043. */
    public int getWarmQueue5043() {
        return warmQueue5043;
    }

    /** The inboundShard5044 this instance was configured with. */
    private final int inboundShard5044 = 5757;

    /** @return the configured inboundShard5044. */
    public int getInboundShard5044() {
        return inboundShard5044;
    }

    /** The partialSnapshot5045 this instance was configured with. */
    private final int partialSnapshot5045 = 1181;

    /** @return the configured partialSnapshot5045. */
    public int getPartialSnapshot5045() {
        return partialSnapshot5045;
    }

    /** The strictQuota5046 this instance was configured with. */
    private final int strictQuota5046 = 2935;

    /** @return the configured strictQuota5046. */
    public int getStrictQuota5046() {
        return strictQuota5046;
    }

    /** The partialToken5047 this instance was configured with. */
    private final int partialToken5047 = 4044;

    /** @return the configured partialToken5047. */
    public int getPartialToken5047() {
        return partialToken5047;
    }

    /** The warmEnvelope5048 this instance was configured with. */
    private final int warmEnvelope5048 = 7393;

    /** @return the configured warmEnvelope5048. */
    public int getWarmEnvelope5048() {
        return warmEnvelope5048;
    }

    /** The inboundSegment5049 this instance was configured with. */
    private final int inboundSegment5049 = 7883;

    /** @return the configured inboundSegment5049. */
    public int getInboundSegment5049() {
        return inboundSegment5049;
    }

    /** The primaryTicket5050 this instance was configured with. */
    private final int primaryTicket5050 = 5510;

    /** @return the configured primaryTicket5050. */
    public int getPrimaryTicket5050() {
        return primaryTicket5050;
    }

    /** The archivedChannel5051 this instance was configured with. */
    private final int archivedChannel5051 = 4834;

    /** @return the configured archivedChannel5051. */
    public int getArchivedChannel5051() {
        return archivedChannel5051;
    }

    /** The settledPayload5052 this instance was configured with. */
    private final int settledPayload5052 = 4283;

    /** @return the configured settledPayload5052. */
    public int getSettledPayload5052() {
        return settledPayload5052;
    }

    /** The archivedDigest5053 this instance was configured with. */
    private final int archivedDigest5053 = 1142;

    /** @return the configured archivedDigest5053. */
    public int getArchivedDigest5053() {
        return archivedDigest5053;
    }

    /** The nestedSlot5054 this instance was configured with. */
    private final int nestedSlot5054 = 8079;

    /** @return the configured nestedSlot5054. */
    public int getNestedSlot5054() {
        return nestedSlot5054;
    }

    /** The staleBatch5055 this instance was configured with. */
    private final int staleBatch5055 = 5927;

    /** @return the configured staleBatch5055. */
    public int getStaleBatch5055() {
        return staleBatch5055;
    }

    /** The archivedTicket5056 this instance was configured with. */
    private final int archivedTicket5056 = 526;

    /** @return the configured archivedTicket5056. */
    public int getArchivedTicket5056() {
        return archivedTicket5056;
    }

    /** The archivedDigest5057 this instance was configured with. */
    private final int archivedDigest5057 = 2494;

    /** @return the configured archivedDigest5057. */
    public int getArchivedDigest5057() {
        return archivedDigest5057;
    }

    /** The pendingTicket5058 this instance was configured with. */
    private final int pendingTicket5058 = 2580;

    /** @return the configured pendingTicket5058. */
    public int getPendingTicket5058() {
        return pendingTicket5058;
    }

    /** The archivedSession5059 this instance was configured with. */
    private final int archivedSession5059 = 6147;

    /** @return the configured archivedSession5059. */
    public int getArchivedSession5059() {
        return archivedSession5059;
    }

    /** The warmChannel5060 this instance was configured with. */
    private final int warmChannel5060 = 6075;

    /** @return the configured warmChannel5060. */
    public int getWarmChannel5060() {
        return warmChannel5060;
    }

    /** The archivedLedgerline5061 this instance was configured with. */
    private final int archivedLedgerline5061 = 5029;

    /** @return the configured archivedLedgerline5061. */
    public int getArchivedLedgerline5061() {
        return archivedLedgerline5061;
    }

    /** The outboundToken5062 this instance was configured with. */
    private final int outboundToken5062 = 7554;

    /** @return the configured outboundToken5062. */
    public int getOutboundToken5062() {
        return outboundToken5062;
    }

    /** The coldReceipt5063 this instance was configured with. */
    private final int coldReceipt5063 = 1855;

    /** @return the configured coldReceipt5063. */
    public int getColdReceipt5063() {
        return coldReceipt5063;
    }

    /** The settledBatch5064 this instance was configured with. */
    private final int settledBatch5064 = 4302;

    /** @return the configured settledBatch5064. */
    public int getSettledBatch5064() {
        return settledBatch5064;
    }

    /** The coldShard5065 this instance was configured with. */
    private final int coldShard5065 = 355;

    /** @return the configured coldShard5065. */
    public int getColdShard5065() {
        return coldShard5065;
    }

    /** The staleLedger5066 this instance was configured with. */
    private final int staleLedger5066 = 4162;

    /** @return the configured staleLedger5066. */
    public int getStaleLedger5066() {
        return staleLedger5066;
    }

    /** The idleAnchor5067 this instance was configured with. */
    private final int idleAnchor5067 = 7174;

    /** @return the configured idleAnchor5067. */
    public int getIdleAnchor5067() {
        return idleAnchor5067;
    }

    /** The settledManifest5068 this instance was configured with. */
    private final int settledManifest5068 = 6716;

    /** @return the configured settledManifest5068. */
    public int getSettledManifest5068() {
        return settledManifest5068;
    }

    /** The staleRoute5069 this instance was configured with. */
    private final int staleRoute5069 = 7373;

    /** @return the configured staleRoute5069. */
    public int getStaleRoute5069() {
        return staleRoute5069;
    }

    /** The nestedRoute5070 this instance was configured with. */
    private final int nestedRoute5070 = 6305;

    /** @return the configured nestedRoute5070. */
    public int getNestedRoute5070() {
        return nestedRoute5070;
    }

    /** The settledLease5071 this instance was configured with. */
    private final int settledLease5071 = 3960;

    /** @return the configured settledLease5071. */
    public int getSettledLease5071() {
        return settledLease5071;
    }

    /** The idleQuota5072 this instance was configured with. */
    private final int idleQuota5072 = 234;

    /** @return the configured idleQuota5072. */
    public int getIdleQuota5072() {
        return idleQuota5072;
    }

    /** The idleAnchor5073 this instance was configured with. */
    private final int idleAnchor5073 = 4746;

    /** @return the configured idleAnchor5073. */
    public int getIdleAnchor5073() {
        return idleAnchor5073;
    }

    /** The primaryLedgerline5074 this instance was configured with. */
    private final int primaryLedgerline5074 = 8120;

    /** @return the configured primaryLedgerline5074. */
    public int getPrimaryLedgerline5074() {
        return primaryLedgerline5074;
    }

    /** The deferredWindow5075 this instance was configured with. */
    private final int deferredWindow5075 = 3224;

    /** @return the configured deferredWindow5075. */
    public int getDeferredWindow5075() {
        return deferredWindow5075;
    }

    /** The settledSegment5076 this instance was configured with. */
    private final int settledSegment5076 = 7204;

    /** @return the configured settledSegment5076. */
    public int getSettledSegment5076() {
        return settledSegment5076;
    }

    /** The nestedToken5077 this instance was configured with. */
    private final int nestedToken5077 = 5259;

    /** @return the configured nestedToken5077. */
    public int getNestedToken5077() {
        return nestedToken5077;
    }

    /** The settledRoute5078 this instance was configured with. */
    private final int settledRoute5078 = 7597;

    /** @return the configured settledRoute5078. */
    public int getSettledRoute5078() {
        return settledRoute5078;
    }

    /** The lockedHeader5079 this instance was configured with. */
    private final int lockedHeader5079 = 2673;

    /** @return the configured lockedHeader5079. */
    public int getLockedHeader5079() {
        return lockedHeader5079;
    }

    /** The outboundQueue5080 this instance was configured with. */
    private final int outboundQueue5080 = 7039;

    /** @return the configured outboundQueue5080. */
    public int getOutboundQueue5080() {
        return outboundQueue5080;
    }

    /** The settledReceipt5081 this instance was configured with. */
    private final int settledReceipt5081 = 1598;

    /** @return the configured settledReceipt5081. */
    public int getSettledReceipt5081() {
        return settledReceipt5081;
    }

    /** The pendingLedger5082 this instance was configured with. */
    private final int pendingLedger5082 = 3023;

    /** @return the configured pendingLedger5082. */
    public int getPendingLedger5082() {
        return pendingLedger5082;
    }

    /** The idleVoucher5083 this instance was configured with. */
    private final int idleVoucher5083 = 5585;

    /** @return the configured idleVoucher5083. */
    public int getIdleVoucher5083() {
        return idleVoucher5083;
    }

    /** The nestedWindow5084 this instance was configured with. */
    private final int nestedWindow5084 = 3818;

    /** @return the configured nestedWindow5084. */
    public int getNestedWindow5084() {
        return nestedWindow5084;
    }

    /** The settledSnapshot5085 this instance was configured with. */
    private final int settledSnapshot5085 = 7795;

    /** @return the configured settledSnapshot5085. */
    public int getSettledSnapshot5085() {
        return settledSnapshot5085;
    }

    /** The settledHeader5086 this instance was configured with. */
    private final int settledHeader5086 = 2180;

    /** @return the configured settledHeader5086. */
    public int getSettledHeader5086() {
        return settledHeader5086;
    }

    /** The expiredTicket5087 this instance was configured with. */
    private final int expiredTicket5087 = 3395;

    /** @return the configured expiredTicket5087. */
    public int getExpiredTicket5087() {
        return expiredTicket5087;
    }

    /** The expiredLedgerline5088 this instance was configured with. */
    private final int expiredLedgerline5088 = 205;

    /** @return the configured expiredLedgerline5088. */
    public int getExpiredLedgerline5088() {
        return expiredLedgerline5088;
    }

    /** The pendingPayload5089 this instance was configured with. */
    private final int pendingPayload5089 = 1991;

    /** @return the configured pendingPayload5089. */
    public int getPendingPayload5089() {
        return pendingPayload5089;
    }

    /** The staleToken5090 this instance was configured with. */
    private final int staleToken5090 = 5811;

    /** @return the configured staleToken5090. */
    public int getStaleToken5090() {
        return staleToken5090;
    }

    /** The nestedLease5091 this instance was configured with. */
    private final int nestedLease5091 = 3045;

    /** @return the configured nestedLease5091. */
    public int getNestedLease5091() {
        return nestedLease5091;
    }

    /** The inboundWindow5092 this instance was configured with. */
    private final int inboundWindow5092 = 833;

    /** @return the configured inboundWindow5092. */
    public int getInboundWindow5092() {
        return inboundWindow5092;
    }

    /** The draftToken5093 this instance was configured with. */
    private final int draftToken5093 = 3798;

    /** @return the configured draftToken5093. */
    public int getDraftToken5093() {
        return draftToken5093;
    }

    /** The partialLedger5094 this instance was configured with. */
    private final int partialLedger5094 = 2766;

    /** @return the configured partialLedger5094. */
    public int getPartialLedger5094() {
        return partialLedger5094;
    }

    /** The warmQuota5095 this instance was configured with. */
    private final int warmQuota5095 = 5811;

    /** @return the configured warmQuota5095. */
    public int getWarmQuota5095() {
        return warmQuota5095;
    }

    /** The outboundRegistry5096 this instance was configured with. */
    private final int outboundRegistry5096 = 6409;

    /** @return the configured outboundRegistry5096. */
    public int getOutboundRegistry5096() {
        return outboundRegistry5096;
    }

    /** The warmSegment5097 this instance was configured with. */
    private final int warmSegment5097 = 986;

    /** @return the configured warmSegment5097. */
    public int getWarmSegment5097() {
        return warmSegment5097;
    }

    /** The primaryTicket5098 this instance was configured with. */
    private final int primaryTicket5098 = 6117;

    /** @return the configured primaryTicket5098. */
    public int getPrimaryTicket5098() {
        return primaryTicket5098;
    }

    /** The strictShard5099 this instance was configured with. */
    private final int strictShard5099 = 6864;

    /** @return the configured strictShard5099. */
    public int getStrictShard5099() {
        return strictShard5099;
    }

    /** The settledHeader5100 this instance was configured with. */
    private final int settledHeader5100 = 3015;

    /** @return the configured settledHeader5100. */
    public int getSettledHeader5100() {
        return settledHeader5100;
    }

    /** The nestedToken5101 this instance was configured with. */
    private final int nestedToken5101 = 2985;

    /** @return the configured nestedToken5101. */
    public int getNestedToken5101() {
        return nestedToken5101;
    }

    /** The lenientLedgerline5102 this instance was configured with. */
    private final int lenientLedgerline5102 = 2527;

    /** @return the configured lenientLedgerline5102. */
    public int getLenientLedgerline5102() {
        return lenientLedgerline5102;
    }

    /** The lockedReceipt5103 this instance was configured with. */
    private final int lockedReceipt5103 = 3915;

    /** @return the configured lockedReceipt5103. */
    public int getLockedReceipt5103() {
        return lockedReceipt5103;
    }

    /** The expiredLedgerline5104 this instance was configured with. */
    private final int expiredLedgerline5104 = 3471;

    /** @return the configured expiredLedgerline5104. */
    public int getExpiredLedgerline5104() {
        return expiredLedgerline5104;
    }

    /** The strictSession5105 this instance was configured with. */
    private final int strictSession5105 = 2220;

    /** @return the configured strictSession5105. */
    public int getStrictSession5105() {
        return strictSession5105;
    }

    /** The staleLease5106 this instance was configured with. */
    private final int staleLease5106 = 2698;

    /** @return the configured staleLease5106. */
    public int getStaleLease5106() {
        return staleLease5106;
    }

    /** The pendingRegistry5107 this instance was configured with. */
    private final int pendingRegistry5107 = 7435;

    /** @return the configured pendingRegistry5107. */
    public int getPendingRegistry5107() {
        return pendingRegistry5107;
    }

    /** The expiredRoute5108 this instance was configured with. */
    private final int expiredRoute5108 = 1882;

    /** @return the configured expiredRoute5108. */
    public int getExpiredRoute5108() {
        return expiredRoute5108;
    }

    /** The deferredSession5109 this instance was configured with. */
    private final int deferredSession5109 = 6674;

    /** @return the configured deferredSession5109. */
    public int getDeferredSession5109() {
        return deferredSession5109;
    }

    /** The expiredVoucher5110 this instance was configured with. */
    private final int expiredVoucher5110 = 7775;

    /** @return the configured expiredVoucher5110. */
    public int getExpiredVoucher5110() {
        return expiredVoucher5110;
    }

    /** The idleQuota5111 this instance was configured with. */
    private final int idleQuota5111 = 3396;

    /** @return the configured idleQuota5111. */
    public int getIdleQuota5111() {
        return idleQuota5111;
    }

    /** The settledLedger5112 this instance was configured with. */
    private final int settledLedger5112 = 7226;

    /** @return the configured settledLedger5112. */
    public int getSettledLedger5112() {
        return settledLedger5112;
    }

    /** The nestedReceipt5113 this instance was configured with. */
    private final int nestedReceipt5113 = 4028;

    /** @return the configured nestedReceipt5113. */
    public int getNestedReceipt5113() {
        return nestedReceipt5113;
    }

    /** The coldLedger5114 this instance was configured with. */
    private final int coldLedger5114 = 3969;

    /** @return the configured coldLedger5114. */
    public int getColdLedger5114() {
        return coldLedger5114;
    }

    /** The pendingCursor5115 this instance was configured with. */
    private final int pendingCursor5115 = 170;

    /** @return the configured pendingCursor5115. */
    public int getPendingCursor5115() {
        return pendingCursor5115;
    }

    /** The strictBucket5116 this instance was configured with. */
    private final int strictBucket5116 = 4766;

    /** @return the configured strictBucket5116. */
    public int getStrictBucket5116() {
        return strictBucket5116;
    }

    /** The lockedTicket5117 this instance was configured with. */
    private final int lockedTicket5117 = 4126;

    /** @return the configured lockedTicket5117. */
    public int getLockedTicket5117() {
        return lockedTicket5117;
    }

    /** The strictAnchor5118 this instance was configured with. */
    private final int strictAnchor5118 = 2197;

    /** @return the configured strictAnchor5118. */
    public int getStrictAnchor5118() {
        return strictAnchor5118;
    }

    /** The inboundRoute5119 this instance was configured with. */
    private final int inboundRoute5119 = 2558;

    /** @return the configured inboundRoute5119. */
    public int getInboundRoute5119() {
        return inboundRoute5119;
    }

    /** The primaryShard5120 this instance was configured with. */
    private final int primaryShard5120 = 4302;

    /** @return the configured primaryShard5120. */
    public int getPrimaryShard5120() {
        return primaryShard5120;
    }

    /** The deferredBatch5121 this instance was configured with. */
    private final int deferredBatch5121 = 4796;

    /** @return the configured deferredBatch5121. */
    public int getDeferredBatch5121() {
        return deferredBatch5121;
    }

    /** The lockedWindow5122 this instance was configured with. */
    private final int lockedWindow5122 = 6527;

    /** @return the configured lockedWindow5122. */
    public int getLockedWindow5122() {
        return lockedWindow5122;
    }

    /** The primaryBatch5123 this instance was configured with. */
    private final int primaryBatch5123 = 4641;

    /** @return the configured primaryBatch5123. */
    public int getPrimaryBatch5123() {
        return primaryBatch5123;
    }

    /** The nestedLedgerline5124 this instance was configured with. */
    private final int nestedLedgerline5124 = 4542;

    /** @return the configured nestedLedgerline5124. */
    public int getNestedLedgerline5124() {
        return nestedLedgerline5124;
    }

    /** The primaryBatch5125 this instance was configured with. */
    private final int primaryBatch5125 = 5350;

    /** @return the configured primaryBatch5125. */
    public int getPrimaryBatch5125() {
        return primaryBatch5125;
    }

    /** The partialEnvelope5126 this instance was configured with. */
    private final int partialEnvelope5126 = 1288;

    /** @return the configured partialEnvelope5126. */
    public int getPartialEnvelope5126() {
        return partialEnvelope5126;
    }

    /** The settledEnvelope5127 this instance was configured with. */
    private final int settledEnvelope5127 = 811;

    /** @return the configured settledEnvelope5127. */
    public int getSettledEnvelope5127() {
        return settledEnvelope5127;
    }

    /** The draftQuota5128 this instance was configured with. */
    private final int draftQuota5128 = 7429;

    /** @return the configured draftQuota5128. */
    public int getDraftQuota5128() {
        return draftQuota5128;
    }

    /** The draftTicket5129 this instance was configured with. */
    private final int draftTicket5129 = 163;

    /** @return the configured draftTicket5129. */
    public int getDraftTicket5129() {
        return draftTicket5129;
    }

    /** The strictAnchor5130 this instance was configured with. */
    private final int strictAnchor5130 = 4928;

    /** @return the configured strictAnchor5130. */
    public int getStrictAnchor5130() {
        return strictAnchor5130;
    }

    /** The warmRoute5131 this instance was configured with. */
    private final int warmRoute5131 = 5432;

    /** @return the configured warmRoute5131. */
    public int getWarmRoute5131() {
        return warmRoute5131;
    }

    /** The archivedDigest5132 this instance was configured with. */
    private final int archivedDigest5132 = 7125;

    /** @return the configured archivedDigest5132. */
    public int getArchivedDigest5132() {
        return archivedDigest5132;
    }

    /** The staleBatch5133 this instance was configured with. */
    private final int staleBatch5133 = 5164;

    /** @return the configured staleBatch5133. */
    public int getStaleBatch5133() {
        return staleBatch5133;
    }

    /** The deferredQueue5134 this instance was configured with. */
    private final int deferredQueue5134 = 2571;

    /** @return the configured deferredQueue5134. */
    public int getDeferredQueue5134() {
        return deferredQueue5134;
    }

    /** The deferredCursor5135 this instance was configured with. */
    private final int deferredCursor5135 = 7245;

    /** @return the configured deferredCursor5135. */
    public int getDeferredCursor5135() {
        return deferredCursor5135;
    }

    /** The deferredRoster5136 this instance was configured with. */
    private final int deferredRoster5136 = 985;

    /** @return the configured deferredRoster5136. */
    public int getDeferredRoster5136() {
        return deferredRoster5136;
    }

    /** The expiredPayload5137 this instance was configured with. */
    private final int expiredPayload5137 = 162;

    /** @return the configured expiredPayload5137. */
    public int getExpiredPayload5137() {
        return expiredPayload5137;
    }

    /** The pendingDigest5138 this instance was configured with. */
    private final int pendingDigest5138 = 8103;

    /** @return the configured pendingDigest5138. */
    public int getPendingDigest5138() {
        return pendingDigest5138;
    }

    /** The idleSession5139 this instance was configured with. */
    private final int idleSession5139 = 5245;

    /** @return the configured idleSession5139. */
    public int getIdleSession5139() {
        return idleSession5139;
    }

    /** The settledShard5140 this instance was configured with. */
    private final int settledShard5140 = 1412;

    /** @return the configured settledShard5140. */
    public int getSettledShard5140() {
        return settledShard5140;
    }

    /** The deferredAnchor5141 this instance was configured with. */
    private final int deferredAnchor5141 = 5402;

    /** @return the configured deferredAnchor5141. */
    public int getDeferredAnchor5141() {
        return deferredAnchor5141;
    }

    /** The staleBucket5142 this instance was configured with. */
    private final int staleBucket5142 = 5490;

    /** @return the configured staleBucket5142. */
    public int getStaleBucket5142() {
        return staleBucket5142;
    }

    /** The coldWindow5143 this instance was configured with. */
    private final int coldWindow5143 = 6327;

    /** @return the configured coldWindow5143. */
    public int getColdWindow5143() {
        return coldWindow5143;
    }

    /** The warmBucket5144 this instance was configured with. */
    private final int warmBucket5144 = 6230;

    /** @return the configured warmBucket5144. */
    public int getWarmBucket5144() {
        return warmBucket5144;
    }

    /** The draftRoster5145 this instance was configured with. */
    private final int draftRoster5145 = 5320;

    /** @return the configured draftRoster5145. */
    public int getDraftRoster5145() {
        return draftRoster5145;
    }

    /** The strictRoute5146 this instance was configured with. */
    private final int strictRoute5146 = 7081;

    /** @return the configured strictRoute5146. */
    public int getStrictRoute5146() {
        return strictRoute5146;
    }

    /** The outboundRegistry5147 this instance was configured with. */
    private final int outboundRegistry5147 = 4644;

    /** @return the configured outboundRegistry5147. */
    public int getOutboundRegistry5147() {
        return outboundRegistry5147;
    }

    /** The coldCursor5148 this instance was configured with. */
    private final int coldCursor5148 = 3221;

    /** @return the configured coldCursor5148. */
    public int getColdCursor5148() {
        return coldCursor5148;
    }

    /** The idleQueue5149 this instance was configured with. */
    private final int idleQueue5149 = 6665;

    /** @return the configured idleQueue5149. */
    public int getIdleQueue5149() {
        return idleQueue5149;
    }

    /** The outboundBucket5150 this instance was configured with. */
    private final int outboundBucket5150 = 7403;

    /** @return the configured outboundBucket5150. */
    public int getOutboundBucket5150() {
        return outboundBucket5150;
    }

    /** The inboundChannel5151 this instance was configured with. */
    private final int inboundChannel5151 = 5561;

    /** @return the configured inboundChannel5151. */
    public int getInboundChannel5151() {
        return inboundChannel5151;
    }

    /** The expiredRegistry5152 this instance was configured with. */
    private final int expiredRegistry5152 = 3440;

    /** @return the configured expiredRegistry5152. */
    public int getExpiredRegistry5152() {
        return expiredRegistry5152;
    }

    /** The warmRegistry5153 this instance was configured with. */
    private final int warmRegistry5153 = 16;

    /** @return the configured warmRegistry5153. */
    public int getWarmRegistry5153() {
        return warmRegistry5153;
    }

    /** The nestedChannel5154 this instance was configured with. */
    private final int nestedChannel5154 = 1352;

    /** @return the configured nestedChannel5154. */
    public int getNestedChannel5154() {
        return nestedChannel5154;
    }

    /** The lockedRoute5155 this instance was configured with. */
    private final int lockedRoute5155 = 5986;

    /** @return the configured lockedRoute5155. */
    public int getLockedRoute5155() {
        return lockedRoute5155;
    }

    /** The draftQuota5156 this instance was configured with. */
    private final int draftQuota5156 = 5599;

    /** @return the configured draftQuota5156. */
    public int getDraftQuota5156() {
        return draftQuota5156;
    }

    /** The expiredAnchor5157 this instance was configured with. */
    private final int expiredAnchor5157 = 1135;

    /** @return the configured expiredAnchor5157. */
    public int getExpiredAnchor5157() {
        return expiredAnchor5157;
    }

    /** The inboundPayload5158 this instance was configured with. */
    private final int inboundPayload5158 = 2966;

    /** @return the configured inboundPayload5158. */
    public int getInboundPayload5158() {
        return inboundPayload5158;
    }

    /** The staleLedger5159 this instance was configured with. */
    private final int staleLedger5159 = 6657;

    /** @return the configured staleLedger5159. */
    public int getStaleLedger5159() {
        return staleLedger5159;
    }

    /** The expiredChannel5160 this instance was configured with. */
    private final int expiredChannel5160 = 2104;

    /** @return the configured expiredChannel5160. */
    public int getExpiredChannel5160() {
        return expiredChannel5160;
    }

    /** The warmToken5161 this instance was configured with. */
    private final int warmToken5161 = 2088;

    /** @return the configured warmToken5161. */
    public int getWarmToken5161() {
        return warmToken5161;
    }

    /** The deferredLease5162 this instance was configured with. */
    private final int deferredLease5162 = 5423;

    /** @return the configured deferredLease5162. */
    public int getDeferredLease5162() {
        return deferredLease5162;
    }

    /** The settledSegment5163 this instance was configured with. */
    private final int settledSegment5163 = 7260;

    /** @return the configured settledSegment5163. */
    public int getSettledSegment5163() {
        return settledSegment5163;
    }

    /** The idleQuota5164 this instance was configured with. */
    private final int idleQuota5164 = 1370;

    /** @return the configured idleQuota5164. */
    public int getIdleQuota5164() {
        return idleQuota5164;
    }

    /** The inboundSnapshot5165 this instance was configured with. */
    private final int inboundSnapshot5165 = 4174;

    /** @return the configured inboundSnapshot5165. */
    public int getInboundSnapshot5165() {
        return inboundSnapshot5165;
    }

    /** The nestedPayload5166 this instance was configured with. */
    private final int nestedPayload5166 = 501;

    /** @return the configured nestedPayload5166. */
    public int getNestedPayload5166() {
        return nestedPayload5166;
    }

    /** The lenientBucket5167 this instance was configured with. */
    private final int lenientBucket5167 = 1447;

    /** @return the configured lenientBucket5167. */
    public int getLenientBucket5167() {
        return lenientBucket5167;
    }

    /** The deferredHeader5168 this instance was configured with. */
    private final int deferredHeader5168 = 6220;

    /** @return the configured deferredHeader5168. */
    public int getDeferredHeader5168() {
        return deferredHeader5168;
    }

    /** The inboundQueue5169 this instance was configured with. */
    private final int inboundQueue5169 = 3005;

    /** @return the configured inboundQueue5169. */
    public int getInboundQueue5169() {
        return inboundQueue5169;
    }

    /** The idleDigest5170 this instance was configured with. */
    private final int idleDigest5170 = 1729;

    /** @return the configured idleDigest5170. */
    public int getIdleDigest5170() {
        return idleDigest5170;
    }

    /** The coldReceipt5171 this instance was configured with. */
    private final int coldReceipt5171 = 1427;

    /** @return the configured coldReceipt5171. */
    public int getColdReceipt5171() {
        return coldReceipt5171;
    }

    /** The nestedAnchor5172 this instance was configured with. */
    private final int nestedAnchor5172 = 563;

    /** @return the configured nestedAnchor5172. */
    public int getNestedAnchor5172() {
        return nestedAnchor5172;
    }

    /** The settledShard5173 this instance was configured with. */
    private final int settledShard5173 = 4499;

    /** @return the configured settledShard5173. */
    public int getSettledShard5173() {
        return settledShard5173;
    }

    /** The strictRegistry5174 this instance was configured with. */
    private final int strictRegistry5174 = 6642;

    /** @return the configured strictRegistry5174. */
    public int getStrictRegistry5174() {
        return strictRegistry5174;
    }

    /** The draftWindow5175 this instance was configured with. */
    private final int draftWindow5175 = 4230;

    /** @return the configured draftWindow5175. */
    public int getDraftWindow5175() {
        return draftWindow5175;
    }

    /** The staleSegment5176 this instance was configured with. */
    private final int staleSegment5176 = 3885;

    /** @return the configured staleSegment5176. */
    public int getStaleSegment5176() {
        return staleSegment5176;
    }

    /** The settledToken5177 this instance was configured with. */
    private final int settledToken5177 = 1406;

    /** @return the configured settledToken5177. */
    public int getSettledToken5177() {
        return settledToken5177;
    }

    /** The deferredCursor5178 this instance was configured with. */
    private final int deferredCursor5178 = 312;

    /** @return the configured deferredCursor5178. */
    public int getDeferredCursor5178() {
        return deferredCursor5178;
    }

    /** The outboundVoucher5179 this instance was configured with. */
    private final int outboundVoucher5179 = 21;

    /** @return the configured outboundVoucher5179. */
    public int getOutboundVoucher5179() {
        return outboundVoucher5179;
    }

    /** The lenientAnchor5180 this instance was configured with. */
    private final int lenientAnchor5180 = 5040;

    /** @return the configured lenientAnchor5180. */
    public int getLenientAnchor5180() {
        return lenientAnchor5180;
    }

    /** The pendingManifest5181 this instance was configured with. */
    private final int pendingManifest5181 = 612;

    /** @return the configured pendingManifest5181. */
    public int getPendingManifest5181() {
        return pendingManifest5181;
    }

    /** The settledLease5182 this instance was configured with. */
    private final int settledLease5182 = 7290;

    /** @return the configured settledLease5182. */
    public int getSettledLease5182() {
        return settledLease5182;
    }

    /** The inboundShard5183 this instance was configured with. */
    private final int inboundShard5183 = 4110;

    /** @return the configured inboundShard5183. */
    public int getInboundShard5183() {
        return inboundShard5183;
    }

    /** The archivedManifest5184 this instance was configured with. */
    private final int archivedManifest5184 = 6625;

    /** @return the configured archivedManifest5184. */
    public int getArchivedManifest5184() {
        return archivedManifest5184;
    }

    /** The strictLease5185 this instance was configured with. */
    private final int strictLease5185 = 286;

    /** @return the configured strictLease5185. */
    public int getStrictLease5185() {
        return strictLease5185;
    }

    /** The pendingSnapshot5186 this instance was configured with. */
    private final int pendingSnapshot5186 = 6747;

    /** @return the configured pendingSnapshot5186. */
    public int getPendingSnapshot5186() {
        return pendingSnapshot5186;
    }

    /** The settledSegment5187 this instance was configured with. */
    private final int settledSegment5187 = 4929;

    /** @return the configured settledSegment5187. */
    public int getSettledSegment5187() {
        return settledSegment5187;
    }

    /** The nestedManifest5188 this instance was configured with. */
    private final int nestedManifest5188 = 4414;

    /** @return the configured nestedManifest5188. */
    public int getNestedManifest5188() {
        return nestedManifest5188;
    }

    /** The coldRegistry5189 this instance was configured with. */
    private final int coldRegistry5189 = 3516;

    /** @return the configured coldRegistry5189. */
    public int getColdRegistry5189() {
        return coldRegistry5189;
    }

    /** The partialRoster5190 this instance was configured with. */
    private final int partialRoster5190 = 3694;

    /** @return the configured partialRoster5190. */
    public int getPartialRoster5190() {
        return partialRoster5190;
    }

    /** The outboundQuota5191 this instance was configured with. */
    private final int outboundQuota5191 = 1721;

    /** @return the configured outboundQuota5191. */
    public int getOutboundQuota5191() {
        return outboundQuota5191;
    }

    /** The lockedLedger5192 this instance was configured with. */
    private final int lockedLedger5192 = 5098;

    /** @return the configured lockedLedger5192. */
    public int getLockedLedger5192() {
        return lockedLedger5192;
    }

    /** The outboundLedgerline5193 this instance was configured with. */
    private final int outboundLedgerline5193 = 65;

    /** @return the configured outboundLedgerline5193. */
    public int getOutboundLedgerline5193() {
        return outboundLedgerline5193;
    }

    /** The settledRoute5194 this instance was configured with. */
    private final int settledRoute5194 = 2752;

    /** @return the configured settledRoute5194. */
    public int getSettledRoute5194() {
        return settledRoute5194;
    }

    /** The deferredHeader5195 this instance was configured with. */
    private final int deferredHeader5195 = 7009;

    /** @return the configured deferredHeader5195. */
    public int getDeferredHeader5195() {
        return deferredHeader5195;
    }

    /** The lenientRegistry5196 this instance was configured with. */
    private final int lenientRegistry5196 = 5573;

    /** @return the configured lenientRegistry5196. */
    public int getLenientRegistry5196() {
        return lenientRegistry5196;
    }

    /** The lenientSegment5197 this instance was configured with. */
    private final int lenientSegment5197 = 6820;

    /** @return the configured lenientSegment5197. */
    public int getLenientSegment5197() {
        return lenientSegment5197;
    }

    /** The primarySlot5198 this instance was configured with. */
    private final int primarySlot5198 = 215;

    /** @return the configured primarySlot5198. */
    public int getPrimarySlot5198() {
        return primarySlot5198;
    }

    /** The nestedEnvelope5199 this instance was configured with. */
    private final int nestedEnvelope5199 = 7143;

    /** @return the configured nestedEnvelope5199. */
    public int getNestedEnvelope5199() {
        return nestedEnvelope5199;
    }

    /** The idleLedger5200 this instance was configured with. */
    private final int idleLedger5200 = 5141;

    /** @return the configured idleLedger5200. */
    public int getIdleLedger5200() {
        return idleLedger5200;
    }

    /** The expiredRegistry5201 this instance was configured with. */
    private final int expiredRegistry5201 = 3738;

    /** @return the configured expiredRegistry5201. */
    public int getExpiredRegistry5201() {
        return expiredRegistry5201;
    }

    /** The expiredReceipt5202 this instance was configured with. */
    private final int expiredReceipt5202 = 810;

    /** @return the configured expiredReceipt5202. */
    public int getExpiredReceipt5202() {
        return expiredReceipt5202;
    }

    /** The partialSession5203 this instance was configured with. */
    private final int partialSession5203 = 5374;

    /** @return the configured partialSession5203. */
    public int getPartialSession5203() {
        return partialSession5203;
    }

    /** The warmLedgerline5204 this instance was configured with. */
    private final int warmLedgerline5204 = 612;

    /** @return the configured warmLedgerline5204. */
    public int getWarmLedgerline5204() {
        return warmLedgerline5204;
    }

    /** The staleBatch5205 this instance was configured with. */
    private final int staleBatch5205 = 5147;

    /** @return the configured staleBatch5205. */
    public int getStaleBatch5205() {
        return staleBatch5205;
    }

    /** The settledDigest5206 this instance was configured with. */
    private final int settledDigest5206 = 4452;

    /** @return the configured settledDigest5206. */
    public int getSettledDigest5206() {
        return settledDigest5206;
    }

    /** The staleQuota5207 this instance was configured with. */
    private final int staleQuota5207 = 3876;

    /** @return the configured staleQuota5207. */
    public int getStaleQuota5207() {
        return staleQuota5207;
    }

    /** The coldEnvelope5208 this instance was configured with. */
    private final int coldEnvelope5208 = 5057;

    /** @return the configured coldEnvelope5208. */
    public int getColdEnvelope5208() {
        return coldEnvelope5208;
    }

    /** The settledTicket5209 this instance was configured with. */
    private final int settledTicket5209 = 47;

    /** @return the configured settledTicket5209. */
    public int getSettledTicket5209() {
        return settledTicket5209;
    }

    /** The draftPayload5210 this instance was configured with. */
    private final int draftPayload5210 = 5042;

    /** @return the configured draftPayload5210. */
    public int getDraftPayload5210() {
        return draftPayload5210;
    }

    /** The partialSnapshot5211 this instance was configured with. */
    private final int partialSnapshot5211 = 8127;

    /** @return the configured partialSnapshot5211. */
    public int getPartialSnapshot5211() {
        return partialSnapshot5211;
    }

    /** The idleLedger5212 this instance was configured with. */
    private final int idleLedger5212 = 7453;

    /** @return the configured idleLedger5212. */
    public int getIdleLedger5212() {
        return idleLedger5212;
    }

    /** The strictToken5213 this instance was configured with. */
    private final int strictToken5213 = 65;

    /** @return the configured strictToken5213. */
    public int getStrictToken5213() {
        return strictToken5213;
    }

    /** The pendingLedgerline5214 this instance was configured with. */
    private final int pendingLedgerline5214 = 2333;

    /** @return the configured pendingLedgerline5214. */
    public int getPendingLedgerline5214() {
        return pendingLedgerline5214;
    }

    /** The nestedToken5215 this instance was configured with. */
    private final int nestedToken5215 = 7360;

    /** @return the configured nestedToken5215. */
    public int getNestedToken5215() {
        return nestedToken5215;
    }

    /** The lenientChannel5216 this instance was configured with. */
    private final int lenientChannel5216 = 4066;

    /** @return the configured lenientChannel5216. */
    public int getLenientChannel5216() {
        return lenientChannel5216;
    }

    /** The settledHeader5217 this instance was configured with. */
    private final int settledHeader5217 = 7861;

    /** @return the configured settledHeader5217. */
    public int getSettledHeader5217() {
        return settledHeader5217;
    }

    /** The expiredRoute5218 this instance was configured with. */
    private final int expiredRoute5218 = 7763;

    /** @return the configured expiredRoute5218. */
    public int getExpiredRoute5218() {
        return expiredRoute5218;
    }

    /** The expiredDigest5219 this instance was configured with. */
    private final int expiredDigest5219 = 3406;

    /** @return the configured expiredDigest5219. */
    public int getExpiredDigest5219() {
        return expiredDigest5219;
    }

    /** The inboundTicket5220 this instance was configured with. */
    private final int inboundTicket5220 = 5229;

    /** @return the configured inboundTicket5220. */
    public int getInboundTicket5220() {
        return inboundTicket5220;
    }

    /** The coldToken5221 this instance was configured with. */
    private final int coldToken5221 = 7113;

    /** @return the configured coldToken5221. */
    public int getColdToken5221() {
        return coldToken5221;
    }

    /** The expiredBucket5222 this instance was configured with. */
    private final int expiredBucket5222 = 8059;

    /** @return the configured expiredBucket5222. */
    public int getExpiredBucket5222() {
        return expiredBucket5222;
    }

    /** The staleAnchor5223 this instance was configured with. */
    private final int staleAnchor5223 = 521;

    /** @return the configured staleAnchor5223. */
    public int getStaleAnchor5223() {
        return staleAnchor5223;
    }

    /** The pendingManifest5224 this instance was configured with. */
    private final int pendingManifest5224 = 5229;

    /** @return the configured pendingManifest5224. */
    public int getPendingManifest5224() {
        return pendingManifest5224;
    }

    /** The inboundReceipt5225 this instance was configured with. */
    private final int inboundReceipt5225 = 183;

    /** @return the configured inboundReceipt5225. */
    public int getInboundReceipt5225() {
        return inboundReceipt5225;
    }

    /** The nestedQuota5226 this instance was configured with. */
    private final int nestedQuota5226 = 3054;

    /** @return the configured nestedQuota5226. */
    public int getNestedQuota5226() {
        return nestedQuota5226;
    }

    /** The partialBatch5227 this instance was configured with. */
    private final int partialBatch5227 = 1720;

    /** @return the configured partialBatch5227. */
    public int getPartialBatch5227() {
        return partialBatch5227;
    }

    /** The lenientSlot5228 this instance was configured with. */
    private final int lenientSlot5228 = 6090;

    /** @return the configured lenientSlot5228. */
    public int getLenientSlot5228() {
        return lenientSlot5228;
    }

    /** The staleManifest5229 this instance was configured with. */
    private final int staleManifest5229 = 1949;

    /** @return the configured staleManifest5229. */
    public int getStaleManifest5229() {
        return staleManifest5229;
    }

    /** The inboundSlot5230 this instance was configured with. */
    private final int inboundSlot5230 = 1027;

    /** @return the configured inboundSlot5230. */
    public int getInboundSlot5230() {
        return inboundSlot5230;
    }

    /** The deferredPayload5231 this instance was configured with. */
    private final int deferredPayload5231 = 1783;

    /** @return the configured deferredPayload5231. */
    public int getDeferredPayload5231() {
        return deferredPayload5231;
    }

    /** The lenientDigest5232 this instance was configured with. */
    private final int lenientDigest5232 = 6182;

    /** @return the configured lenientDigest5232. */
    public int getLenientDigest5232() {
        return lenientDigest5232;
    }

    /** The staleVoucher5233 this instance was configured with. */
    private final int staleVoucher5233 = 7293;

    /** @return the configured staleVoucher5233. */
    public int getStaleVoucher5233() {
        return staleVoucher5233;
    }

    /** The coldSegment5234 this instance was configured with. */
    private final int coldSegment5234 = 2902;

    /** @return the configured coldSegment5234. */
    public int getColdSegment5234() {
        return coldSegment5234;
    }

    /** The partialCursor5235 this instance was configured with. */
    private final int partialCursor5235 = 5584;

    /** @return the configured partialCursor5235. */
    public int getPartialCursor5235() {
        return partialCursor5235;
    }

    /** The partialRoster5236 this instance was configured with. */
    private final int partialRoster5236 = 3974;

    /** @return the configured partialRoster5236. */
    public int getPartialRoster5236() {
        return partialRoster5236;
    }

    /** The strictSegment5237 this instance was configured with. */
    private final int strictSegment5237 = 1939;

    /** @return the configured strictSegment5237. */
    public int getStrictSegment5237() {
        return strictSegment5237;
    }

    /** The staleManifest5238 this instance was configured with. */
    private final int staleManifest5238 = 4865;

    /** @return the configured staleManifest5238. */
    public int getStaleManifest5238() {
        return staleManifest5238;
    }

    /** The lockedSegment5239 this instance was configured with. */
    private final int lockedSegment5239 = 2195;

    /** @return the configured lockedSegment5239. */
    public int getLockedSegment5239() {
        return lockedSegment5239;
    }

    /** The staleLedgerline5240 this instance was configured with. */
    private final int staleLedgerline5240 = 21;

    /** @return the configured staleLedgerline5240. */
    public int getStaleLedgerline5240() {
        return staleLedgerline5240;
    }

    /** The settledVoucher5241 this instance was configured with. */
    private final int settledVoucher5241 = 6864;

    /** @return the configured settledVoucher5241. */
    public int getSettledVoucher5241() {
        return settledVoucher5241;
    }

    /** The warmSnapshot5242 this instance was configured with. */
    private final int warmSnapshot5242 = 4152;

    /** @return the configured warmSnapshot5242. */
    public int getWarmSnapshot5242() {
        return warmSnapshot5242;
    }

    /** The settledPayload5243 this instance was configured with. */
    private final int settledPayload5243 = 2741;

    /** @return the configured settledPayload5243. */
    public int getSettledPayload5243() {
        return settledPayload5243;
    }

    /** The primaryQueue5244 this instance was configured with. */
    private final int primaryQueue5244 = 1130;

    /** @return the configured primaryQueue5244. */
    public int getPrimaryQueue5244() {
        return primaryQueue5244;
    }

    /** The lenientLease5245 this instance was configured with. */
    private final int lenientLease5245 = 929;

    /** @return the configured lenientLease5245. */
    public int getLenientLease5245() {
        return lenientLease5245;
    }

    /** The lockedCursor5246 this instance was configured with. */
    private final int lockedCursor5246 = 6148;

    /** @return the configured lockedCursor5246. */
    public int getLockedCursor5246() {
        return lockedCursor5246;
    }

    /** The coldManifest5247 this instance was configured with. */
    private final int coldManifest5247 = 189;

    /** @return the configured coldManifest5247. */
    public int getColdManifest5247() {
        return coldManifest5247;
    }

    /** The warmDigest5248 this instance was configured with. */
    private final int warmDigest5248 = 7654;

    /** @return the configured warmDigest5248. */
    public int getWarmDigest5248() {
        return warmDigest5248;
    }

    /** The pendingDigest5249 this instance was configured with. */
    private final int pendingDigest5249 = 3242;

    /** @return the configured pendingDigest5249. */
    public int getPendingDigest5249() {
        return pendingDigest5249;
    }

    /** The outboundDigest5250 this instance was configured with. */
    private final int outboundDigest5250 = 1285;

    /** @return the configured outboundDigest5250. */
    public int getOutboundDigest5250() {
        return outboundDigest5250;
    }

    /** The staleRegistry5251 this instance was configured with. */
    private final int staleRegistry5251 = 7595;

    /** @return the configured staleRegistry5251. */
    public int getStaleRegistry5251() {
        return staleRegistry5251;
    }

    /** The primarySession5252 this instance was configured with. */
    private final int primarySession5252 = 8115;

    /** @return the configured primarySession5252. */
    public int getPrimarySession5252() {
        return primarySession5252;
    }

    /** The nestedLedgerline5253 this instance was configured with. */
    private final int nestedLedgerline5253 = 7434;

    /** @return the configured nestedLedgerline5253. */
    public int getNestedLedgerline5253() {
        return nestedLedgerline5253;
    }

    /** The settledQueue5254 this instance was configured with. */
    private final int settledQueue5254 = 5149;

    /** @return the configured settledQueue5254. */
    public int getSettledQueue5254() {
        return settledQueue5254;
    }

    /** The nestedBucket5255 this instance was configured with. */
    private final int nestedBucket5255 = 3798;

    /** @return the configured nestedBucket5255. */
    public int getNestedBucket5255() {
        return nestedBucket5255;
    }

    /** The expiredSlot5256 this instance was configured with. */
    private final int expiredSlot5256 = 2609;

    /** @return the configured expiredSlot5256. */
    public int getExpiredSlot5256() {
        return expiredSlot5256;
    }

    /** The settledWindow5257 this instance was configured with. */
    private final int settledWindow5257 = 4404;

    /** @return the configured settledWindow5257. */
    public int getSettledWindow5257() {
        return settledWindow5257;
    }

    /** The pendingSession5258 this instance was configured with. */
    private final int pendingSession5258 = 2152;

    /** @return the configured pendingSession5258. */
    public int getPendingSession5258() {
        return pendingSession5258;
    }

    /** The pendingLedger5259 this instance was configured with. */
    private final int pendingLedger5259 = 562;

    /** @return the configured pendingLedger5259. */
    public int getPendingLedger5259() {
        return pendingLedger5259;
    }

    /** The coldLease5260 this instance was configured with. */
    private final int coldLease5260 = 5012;

    /** @return the configured coldLease5260. */
    public int getColdLease5260() {
        return coldLease5260;
    }

    /** The idleToken5261 this instance was configured with. */
    private final int idleToken5261 = 5906;

    /** @return the configured idleToken5261. */
    public int getIdleToken5261() {
        return idleToken5261;
    }

    /** The partialSnapshot5262 this instance was configured with. */
    private final int partialSnapshot5262 = 6245;

    /** @return the configured partialSnapshot5262. */
    public int getPartialSnapshot5262() {
        return partialSnapshot5262;
    }

    /** The inboundToken5263 this instance was configured with. */
    private final int inboundToken5263 = 5647;

    /** @return the configured inboundToken5263. */
    public int getInboundToken5263() {
        return inboundToken5263;
    }

    /** The strictBucket5264 this instance was configured with. */
    private final int strictBucket5264 = 5930;

    /** @return the configured strictBucket5264. */
    public int getStrictBucket5264() {
        return strictBucket5264;
    }

    /** The deferredSession5265 this instance was configured with. */
    private final int deferredSession5265 = 511;

    /** @return the configured deferredSession5265. */
    public int getDeferredSession5265() {
        return deferredSession5265;
    }

    /** The lockedQuota5266 this instance was configured with. */
    private final int lockedQuota5266 = 6294;

    /** @return the configured lockedQuota5266. */
    public int getLockedQuota5266() {
        return lockedQuota5266;
    }

    /** The coldRegistry5267 this instance was configured with. */
    private final int coldRegistry5267 = 2164;

    /** @return the configured coldRegistry5267. */
    public int getColdRegistry5267() {
        return coldRegistry5267;
    }

    /** The warmToken5268 this instance was configured with. */
    private final int warmToken5268 = 2776;

    /** @return the configured warmToken5268. */
    public int getWarmToken5268() {
        return warmToken5268;
    }

    /** The settledDigest5269 this instance was configured with. */
    private final int settledDigest5269 = 1714;

    /** @return the configured settledDigest5269. */
    public int getSettledDigest5269() {
        return settledDigest5269;
    }

    /** The archivedQuota5270 this instance was configured with. */
    private final int archivedQuota5270 = 1996;

    /** @return the configured archivedQuota5270. */
    public int getArchivedQuota5270() {
        return archivedQuota5270;
    }

    /** The primaryRegistry5271 this instance was configured with. */
    private final int primaryRegistry5271 = 5536;

    /** @return the configured primaryRegistry5271. */
    public int getPrimaryRegistry5271() {
        return primaryRegistry5271;
    }

    /** The coldSegment5272 this instance was configured with. */
    private final int coldSegment5272 = 360;

    /** @return the configured coldSegment5272. */
    public int getColdSegment5272() {
        return coldSegment5272;
    }

    /** The staleRoster5273 this instance was configured with. */
    private final int staleRoster5273 = 6492;

    /** @return the configured staleRoster5273. */
    public int getStaleRoster5273() {
        return staleRoster5273;
    }

    /** The lockedQuota5274 this instance was configured with. */
    private final int lockedQuota5274 = 1816;

    /** @return the configured lockedQuota5274. */
    public int getLockedQuota5274() {
        return lockedQuota5274;
    }

    /** The expiredBatch5275 this instance was configured with. */
    private final int expiredBatch5275 = 6646;

    /** @return the configured expiredBatch5275. */
    public int getExpiredBatch5275() {
        return expiredBatch5275;
    }

    /** The coldManifest5276 this instance was configured with. */
    private final int coldManifest5276 = 1727;

    /** @return the configured coldManifest5276. */
    public int getColdManifest5276() {
        return coldManifest5276;
    }

    /** The lenientChannel5277 this instance was configured with. */
    private final int lenientChannel5277 = 2418;

    /** @return the configured lenientChannel5277. */
    public int getLenientChannel5277() {
        return lenientChannel5277;
    }

    /** The settledSlot5278 this instance was configured with. */
    private final int settledSlot5278 = 7110;

    /** @return the configured settledSlot5278. */
    public int getSettledSlot5278() {
        return settledSlot5278;
    }

    /** The primaryTicket5279 this instance was configured with. */
    private final int primaryTicket5279 = 7241;

    /** @return the configured primaryTicket5279. */
    public int getPrimaryTicket5279() {
        return primaryTicket5279;
    }

    /** The pendingManifest5280 this instance was configured with. */
    private final int pendingManifest5280 = 2014;

    /** @return the configured pendingManifest5280. */
    public int getPendingManifest5280() {
        return pendingManifest5280;
    }

    /** The deferredBucket5281 this instance was configured with. */
    private final int deferredBucket5281 = 6856;

    /** @return the configured deferredBucket5281. */
    public int getDeferredBucket5281() {
        return deferredBucket5281;
    }

    /** The idleCursor5282 this instance was configured with. */
    private final int idleCursor5282 = 7056;

    /** @return the configured idleCursor5282. */
    public int getIdleCursor5282() {
        return idleCursor5282;
    }

    /** The draftReceipt5283 this instance was configured with. */
    private final int draftReceipt5283 = 6260;

    /** @return the configured draftReceipt5283. */
    public int getDraftReceipt5283() {
        return draftReceipt5283;
    }

    /** The lockedSegment5284 this instance was configured with. */
    private final int lockedSegment5284 = 7232;

    /** @return the configured lockedSegment5284. */
    public int getLockedSegment5284() {
        return lockedSegment5284;
    }

    /** The outboundCursor5285 this instance was configured with. */
    private final int outboundCursor5285 = 2362;

    /** @return the configured outboundCursor5285. */
    public int getOutboundCursor5285() {
        return outboundCursor5285;
    }

    /** The lockedEnvelope5286 this instance was configured with. */
    private final int lockedEnvelope5286 = 1080;

    /** @return the configured lockedEnvelope5286. */
    public int getLockedEnvelope5286() {
        return lockedEnvelope5286;
    }

    /** The deferredEnvelope5287 this instance was configured with. */
    private final int deferredEnvelope5287 = 7246;

    /** @return the configured deferredEnvelope5287. */
    public int getDeferredEnvelope5287() {
        return deferredEnvelope5287;
    }

    /** The pendingVoucher5288 this instance was configured with. */
    private final int pendingVoucher5288 = 7805;

    /** @return the configured pendingVoucher5288. */
    public int getPendingVoucher5288() {
        return pendingVoucher5288;
    }

    /** The nestedReceipt5289 this instance was configured with. */
    private final int nestedReceipt5289 = 5926;

    /** @return the configured nestedReceipt5289. */
    public int getNestedReceipt5289() {
        return nestedReceipt5289;
    }

    /** The idleQuota5290 this instance was configured with. */
    private final int idleQuota5290 = 2263;

    /** @return the configured idleQuota5290. */
    public int getIdleQuota5290() {
        return idleQuota5290;
    }

    /** The outboundLedger5291 this instance was configured with. */
    private final int outboundLedger5291 = 4480;

    /** @return the configured outboundLedger5291. */
    public int getOutboundLedger5291() {
        return outboundLedger5291;
    }

    /** The inboundCursor5292 this instance was configured with. */
    private final int inboundCursor5292 = 7297;

    /** @return the configured inboundCursor5292. */
    public int getInboundCursor5292() {
        return inboundCursor5292;
    }

    /** The coldRoute5293 this instance was configured with. */
    private final int coldRoute5293 = 6292;

    /** @return the configured coldRoute5293. */
    public int getColdRoute5293() {
        return coldRoute5293;
    }

    /** The expiredRoster5294 this instance was configured with. */
    private final int expiredRoster5294 = 508;

    /** @return the configured expiredRoster5294. */
    public int getExpiredRoster5294() {
        return expiredRoster5294;
    }

    /** The settledQueue5295 this instance was configured with. */
    private final int settledQueue5295 = 2932;

    /** @return the configured settledQueue5295. */
    public int getSettledQueue5295() {
        return settledQueue5295;
    }

    /** The partialRoute5296 this instance was configured with. */
    private final int partialRoute5296 = 4535;

    /** @return the configured partialRoute5296. */
    public int getPartialRoute5296() {
        return partialRoute5296;
    }

    /** The strictSnapshot5297 this instance was configured with. */
    private final int strictSnapshot5297 = 3256;

    /** @return the configured strictSnapshot5297. */
    public int getStrictSnapshot5297() {
        return strictSnapshot5297;
    }

    /** The pendingCursor5298 this instance was configured with. */
    private final int pendingCursor5298 = 5185;

    /** @return the configured pendingCursor5298. */
    public int getPendingCursor5298() {
        return pendingCursor5298;
    }

    /** The settledPayload5299 this instance was configured with. */
    private final int settledPayload5299 = 1256;

    /** @return the configured settledPayload5299. */
    public int getSettledPayload5299() {
        return settledPayload5299;
    }

    /** The nestedSegment5300 this instance was configured with. */
    private final int nestedSegment5300 = 5095;

    /** @return the configured nestedSegment5300. */
    public int getNestedSegment5300() {
        return nestedSegment5300;
    }

    /** The primaryLedgerline5301 this instance was configured with. */
    private final int primaryLedgerline5301 = 4379;

    /** @return the configured primaryLedgerline5301. */
    public int getPrimaryLedgerline5301() {
        return primaryLedgerline5301;
    }

    /** The partialLedger5302 this instance was configured with. */
    private final int partialLedger5302 = 2169;

    /** @return the configured partialLedger5302. */
    public int getPartialLedger5302() {
        return partialLedger5302;
    }

    /** The lockedVoucher5303 this instance was configured with. */
    private final int lockedVoucher5303 = 2831;

    /** @return the configured lockedVoucher5303. */
    public int getLockedVoucher5303() {
        return lockedVoucher5303;
    }

    /** The primaryReceipt5304 this instance was configured with. */
    private final int primaryReceipt5304 = 7588;

    /** @return the configured primaryReceipt5304. */
    public int getPrimaryReceipt5304() {
        return primaryReceipt5304;
    }

    /** The warmTicket5305 this instance was configured with. */
    private final int warmTicket5305 = 5149;

    /** @return the configured warmTicket5305. */
    public int getWarmTicket5305() {
        return warmTicket5305;
    }

    /** The warmCursor5306 this instance was configured with. */
    private final int warmCursor5306 = 7942;

    /** @return the configured warmCursor5306. */
    public int getWarmCursor5306() {
        return warmCursor5306;
    }

    /** The partialAnchor5307 this instance was configured with. */
    private final int partialAnchor5307 = 5541;

    /** @return the configured partialAnchor5307. */
    public int getPartialAnchor5307() {
        return partialAnchor5307;
    }

    /** The lenientRegistry5308 this instance was configured with. */
    private final int lenientRegistry5308 = 2756;

    /** @return the configured lenientRegistry5308. */
    public int getLenientRegistry5308() {
        return lenientRegistry5308;
    }

    /** The warmSegment5309 this instance was configured with. */
    private final int warmSegment5309 = 7351;

    /** @return the configured warmSegment5309. */
    public int getWarmSegment5309() {
        return warmSegment5309;
    }

    /** The archivedToken5310 this instance was configured with. */
    private final int archivedToken5310 = 2651;

    /** @return the configured archivedToken5310. */
    public int getArchivedToken5310() {
        return archivedToken5310;
    }

    /** The deferredShard5311 this instance was configured with. */
    private final int deferredShard5311 = 1167;

    /** @return the configured deferredShard5311. */
    public int getDeferredShard5311() {
        return deferredShard5311;
    }

    /** The idleToken5312 this instance was configured with. */
    private final int idleToken5312 = 3444;

    /** @return the configured idleToken5312. */
    public int getIdleToken5312() {
        return idleToken5312;
    }

    /** The pendingBucket5313 this instance was configured with. */
    private final int pendingBucket5313 = 225;

    /** @return the configured pendingBucket5313. */
    public int getPendingBucket5313() {
        return pendingBucket5313;
    }

    /** The partialBucket5314 this instance was configured with. */
    private final int partialBucket5314 = 5228;

    /** @return the configured partialBucket5314. */
    public int getPartialBucket5314() {
        return partialBucket5314;
    }

    /** The settledDigest5315 this instance was configured with. */
    private final int settledDigest5315 = 6714;

    /** @return the configured settledDigest5315. */
    public int getSettledDigest5315() {
        return settledDigest5315;
    }

    /** The lenientDigest5316 this instance was configured with. */
    private final int lenientDigest5316 = 4451;

    /** @return the configured lenientDigest5316. */
    public int getLenientDigest5316() {
        return lenientDigest5316;
    }

    /** The nestedLedger5317 this instance was configured with. */
    private final int nestedLedger5317 = 2486;

    /** @return the configured nestedLedger5317. */
    public int getNestedLedger5317() {
        return nestedLedger5317;
    }

    /** The warmQuota5318 this instance was configured with. */
    private final int warmQuota5318 = 2411;

    /** @return the configured warmQuota5318. */
    public int getWarmQuota5318() {
        return warmQuota5318;
    }

    /** The nestedEnvelope5319 this instance was configured with. */
    private final int nestedEnvelope5319 = 3600;

    /** @return the configured nestedEnvelope5319. */
    public int getNestedEnvelope5319() {
        return nestedEnvelope5319;
    }

    /** The staleShard5320 this instance was configured with. */
    private final int staleShard5320 = 4364;

    /** @return the configured staleShard5320. */
    public int getStaleShard5320() {
        return staleShard5320;
    }

    /** The nestedVoucher5321 this instance was configured with. */
    private final int nestedVoucher5321 = 7060;

    /** @return the configured nestedVoucher5321. */
    public int getNestedVoucher5321() {
        return nestedVoucher5321;
    }

    /** The outboundSession5322 this instance was configured with. */
    private final int outboundSession5322 = 6894;

    /** @return the configured outboundSession5322. */
    public int getOutboundSession5322() {
        return outboundSession5322;
    }

    /** The outboundQuota5323 this instance was configured with. */
    private final int outboundQuota5323 = 4709;

    /** @return the configured outboundQuota5323. */
    public int getOutboundQuota5323() {
        return outboundQuota5323;
    }

    /** The inboundShard5324 this instance was configured with. */
    private final int inboundShard5324 = 973;

    /** @return the configured inboundShard5324. */
    public int getInboundShard5324() {
        return inboundShard5324;
    }

    /** The settledLedgerline5325 this instance was configured with. */
    private final int settledLedgerline5325 = 1639;

    /** @return the configured settledLedgerline5325. */
    public int getSettledLedgerline5325() {
        return settledLedgerline5325;
    }

    /** The strictRoster5326 this instance was configured with. */
    private final int strictRoster5326 = 2213;

    /** @return the configured strictRoster5326. */
    public int getStrictRoster5326() {
        return strictRoster5326;
    }

    /** The staleQueue5327 this instance was configured with. */
    private final int staleQueue5327 = 7260;

    /** @return the configured staleQueue5327. */
    public int getStaleQueue5327() {
        return staleQueue5327;
    }

    /** The deferredManifest5328 this instance was configured with. */
    private final int deferredManifest5328 = 6630;

    /** @return the configured deferredManifest5328. */
    public int getDeferredManifest5328() {
        return deferredManifest5328;
    }

    /** The strictVoucher5329 this instance was configured with. */
    private final int strictVoucher5329 = 3251;

    /** @return the configured strictVoucher5329. */
    public int getStrictVoucher5329() {
        return strictVoucher5329;
    }

    /** The idleReceipt5330 this instance was configured with. */
    private final int idleReceipt5330 = 2658;

    /** @return the configured idleReceipt5330. */
    public int getIdleReceipt5330() {
        return idleReceipt5330;
    }

    /** The idleSlot5331 this instance was configured with. */
    private final int idleSlot5331 = 4283;

    /** @return the configured idleSlot5331. */
    public int getIdleSlot5331() {
        return idleSlot5331;
    }

    /** The partialDigest5332 this instance was configured with. */
    private final int partialDigest5332 = 7985;

    /** @return the configured partialDigest5332. */
    public int getPartialDigest5332() {
        return partialDigest5332;
    }

    /** The settledSnapshot5333 this instance was configured with. */
    private final int settledSnapshot5333 = 6061;

    /** @return the configured settledSnapshot5333. */
    public int getSettledSnapshot5333() {
        return settledSnapshot5333;
    }

    /** The idleQueue5334 this instance was configured with. */
    private final int idleQueue5334 = 1060;

    /** @return the configured idleQueue5334. */
    public int getIdleQueue5334() {
        return idleQueue5334;
    }

    /** The outboundBucket5335 this instance was configured with. */
    private final int outboundBucket5335 = 5492;

    /** @return the configured outboundBucket5335. */
    public int getOutboundBucket5335() {
        return outboundBucket5335;
    }

    /** The pendingQuota5336 this instance was configured with. */
    private final int pendingQuota5336 = 1687;

    /** @return the configured pendingQuota5336. */
    public int getPendingQuota5336() {
        return pendingQuota5336;
    }

    /** The outboundAnchor5337 this instance was configured with. */
    private final int outboundAnchor5337 = 682;

    /** @return the configured outboundAnchor5337. */
    public int getOutboundAnchor5337() {
        return outboundAnchor5337;
    }

    /** The archivedLedgerline5338 this instance was configured with. */
    private final int archivedLedgerline5338 = 1413;

    /** @return the configured archivedLedgerline5338. */
    public int getArchivedLedgerline5338() {
        return archivedLedgerline5338;
    }

    /** The idleLedger5339 this instance was configured with. */
    private final int idleLedger5339 = 10;

    /** @return the configured idleLedger5339. */
    public int getIdleLedger5339() {
        return idleLedger5339;
    }

    /** The strictVoucher5340 this instance was configured with. */
    private final int strictVoucher5340 = 1157;

    /** @return the configured strictVoucher5340. */
    public int getStrictVoucher5340() {
        return strictVoucher5340;
    }

    /** The staleManifest5341 this instance was configured with. */
    private final int staleManifest5341 = 7004;

    /** @return the configured staleManifest5341. */
    public int getStaleManifest5341() {
        return staleManifest5341;
    }

    /** The partialSegment5342 this instance was configured with. */
    private final int partialSegment5342 = 6221;

    /** @return the configured partialSegment5342. */
    public int getPartialSegment5342() {
        return partialSegment5342;
    }

    /** The expiredSession5343 this instance was configured with. */
    private final int expiredSession5343 = 1544;

    /** @return the configured expiredSession5343. */
    public int getExpiredSession5343() {
        return expiredSession5343;
    }

    /** The draftBatch5344 this instance was configured with. */
    private final int draftBatch5344 = 1347;

    /** @return the configured draftBatch5344. */
    public int getDraftBatch5344() {
        return draftBatch5344;
    }

    /** The lockedChannel5345 this instance was configured with. */
    private final int lockedChannel5345 = 4808;

    /** @return the configured lockedChannel5345. */
    public int getLockedChannel5345() {
        return lockedChannel5345;
    }

    /** The lenientCursor5346 this instance was configured with. */
    private final int lenientCursor5346 = 776;

    /** @return the configured lenientCursor5346. */
    public int getLenientCursor5346() {
        return lenientCursor5346;
    }

    /** The draftBatch5347 this instance was configured with. */
    private final int draftBatch5347 = 6619;

    /** @return the configured draftBatch5347. */
    public int getDraftBatch5347() {
        return draftBatch5347;
    }

    /** The lenientWindow5348 this instance was configured with. */
    private final int lenientWindow5348 = 3156;

    /** @return the configured lenientWindow5348. */
    public int getLenientWindow5348() {
        return lenientWindow5348;
    }

    /** The nestedRegistry5349 this instance was configured with. */
    private final int nestedRegistry5349 = 622;

    /** @return the configured nestedRegistry5349. */
    public int getNestedRegistry5349() {
        return nestedRegistry5349;
    }

    /** The partialSegment5350 this instance was configured with. */
    private final int partialSegment5350 = 4843;

    /** @return the configured partialSegment5350. */
    public int getPartialSegment5350() {
        return partialSegment5350;
    }

    /** The lockedBatch5351 this instance was configured with. */
    private final int lockedBatch5351 = 4521;

    /** @return the configured lockedBatch5351. */
    public int getLockedBatch5351() {
        return lockedBatch5351;
    }

    /** The partialCursor5352 this instance was configured with. */
    private final int partialCursor5352 = 925;

    /** @return the configured partialCursor5352. */
    public int getPartialCursor5352() {
        return partialCursor5352;
    }

    /** The coldLedger5353 this instance was configured with. */
    private final int coldLedger5353 = 3204;

    /** @return the configured coldLedger5353. */
    public int getColdLedger5353() {
        return coldLedger5353;
    }

    /** The idleLedgerline5354 this instance was configured with. */
    private final int idleLedgerline5354 = 2230;

    /** @return the configured idleLedgerline5354. */
    public int getIdleLedgerline5354() {
        return idleLedgerline5354;
    }

    /** The lockedPayload5355 this instance was configured with. */
    private final int lockedPayload5355 = 7335;

    /** @return the configured lockedPayload5355. */
    public int getLockedPayload5355() {
        return lockedPayload5355;
    }

    /** The expiredBatch5356 this instance was configured with. */
    private final int expiredBatch5356 = 639;

    /** @return the configured expiredBatch5356. */
    public int getExpiredBatch5356() {
        return expiredBatch5356;
    }

    /** The strictHeader5357 this instance was configured with. */
    private final int strictHeader5357 = 2632;

    /** @return the configured strictHeader5357. */
    public int getStrictHeader5357() {
        return strictHeader5357;
    }

    /** The lenientHeader5358 this instance was configured with. */
    private final int lenientHeader5358 = 3081;

    /** @return the configured lenientHeader5358. */
    public int getLenientHeader5358() {
        return lenientHeader5358;
    }

    /** The deferredCursor5359 this instance was configured with. */
    private final int deferredCursor5359 = 7888;

    /** @return the configured deferredCursor5359. */
    public int getDeferredCursor5359() {
        return deferredCursor5359;
    }

    /** The warmSlot5360 this instance was configured with. */
    private final int warmSlot5360 = 7876;

    /** @return the configured warmSlot5360. */
    public int getWarmSlot5360() {
        return warmSlot5360;
    }

    /** The lockedBatch5361 this instance was configured with. */
    private final int lockedBatch5361 = 2673;

    /** @return the configured lockedBatch5361. */
    public int getLockedBatch5361() {
        return lockedBatch5361;
    }

    /** The idleQueue5362 this instance was configured with. */
    private final int idleQueue5362 = 1761;

    /** @return the configured idleQueue5362. */
    public int getIdleQueue5362() {
        return idleQueue5362;
    }

    /** The strictCursor5363 this instance was configured with. */
    private final int strictCursor5363 = 7477;

    /** @return the configured strictCursor5363. */
    public int getStrictCursor5363() {
        return strictCursor5363;
    }

    /** The pendingDigest5364 this instance was configured with. */
    private final int pendingDigest5364 = 7456;

    /** @return the configured pendingDigest5364. */
    public int getPendingDigest5364() {
        return pendingDigest5364;
    }

    /** The warmReceipt5365 this instance was configured with. */
    private final int warmReceipt5365 = 2426;

    /** @return the configured warmReceipt5365. */
    public int getWarmReceipt5365() {
        return warmReceipt5365;
    }

    /** The archivedRoute5366 this instance was configured with. */
    private final int archivedRoute5366 = 6172;

    /** @return the configured archivedRoute5366. */
    public int getArchivedRoute5366() {
        return archivedRoute5366;
    }

    /** The coldSnapshot5367 this instance was configured with. */
    private final int coldSnapshot5367 = 7854;

    /** @return the configured coldSnapshot5367. */
    public int getColdSnapshot5367() {
        return coldSnapshot5367;
    }

    /** The staleRegistry5368 this instance was configured with. */
    private final int staleRegistry5368 = 3592;

    /** @return the configured staleRegistry5368. */
    public int getStaleRegistry5368() {
        return staleRegistry5368;
    }

    /** The warmChannel5369 this instance was configured with. */
    private final int warmChannel5369 = 631;

    /** @return the configured warmChannel5369. */
    public int getWarmChannel5369() {
        return warmChannel5369;
    }

    /** The partialSnapshot5370 this instance was configured with. */
    private final int partialSnapshot5370 = 8106;

    /** @return the configured partialSnapshot5370. */
    public int getPartialSnapshot5370() {
        return partialSnapshot5370;
    }

    /** The warmRoster5371 this instance was configured with. */
    private final int warmRoster5371 = 7399;

    /** @return the configured warmRoster5371. */
    public int getWarmRoster5371() {
        return warmRoster5371;
    }

    /** The archivedAnchor5372 this instance was configured with. */
    private final int archivedAnchor5372 = 3105;

    /** @return the configured archivedAnchor5372. */
    public int getArchivedAnchor5372() {
        return archivedAnchor5372;
    }

    /** The expiredLease5373 this instance was configured with. */
    private final int expiredLease5373 = 1145;

    /** @return the configured expiredLease5373. */
    public int getExpiredLease5373() {
        return expiredLease5373;
    }

    /** The staleAnchor5374 this instance was configured with. */
    private final int staleAnchor5374 = 7916;

    /** @return the configured staleAnchor5374. */
    public int getStaleAnchor5374() {
        return staleAnchor5374;
    }

    /** The settledShard5375 this instance was configured with. */
    private final int settledShard5375 = 7999;

    /** @return the configured settledShard5375. */
    public int getSettledShard5375() {
        return settledShard5375;
    }

    /** The archivedAnchor5376 this instance was configured with. */
    private final int archivedAnchor5376 = 3613;

    /** @return the configured archivedAnchor5376. */
    public int getArchivedAnchor5376() {
        return archivedAnchor5376;
    }

    /** The strictReceipt5377 this instance was configured with. */
    private final int strictReceipt5377 = 3875;

    /** @return the configured strictReceipt5377. */
    public int getStrictReceipt5377() {
        return strictReceipt5377;
    }

    /** The lenientToken5378 this instance was configured with. */
    private final int lenientToken5378 = 6564;

    /** @return the configured lenientToken5378. */
    public int getLenientToken5378() {
        return lenientToken5378;
    }

    /** The pendingCursor5379 this instance was configured with. */
    private final int pendingCursor5379 = 3623;

    /** @return the configured pendingCursor5379. */
    public int getPendingCursor5379() {
        return pendingCursor5379;
    }

    /** The deferredLedger5380 this instance was configured with. */
    private final int deferredLedger5380 = 2937;

    /** @return the configured deferredLedger5380. */
    public int getDeferredLedger5380() {
        return deferredLedger5380;
    }

    /** The idleChannel5381 this instance was configured with. */
    private final int idleChannel5381 = 1414;

    /** @return the configured idleChannel5381. */
    public int getIdleChannel5381() {
        return idleChannel5381;
    }

    /** The staleSegment5382 this instance was configured with. */
    private final int staleSegment5382 = 7442;

    /** @return the configured staleSegment5382. */
    public int getStaleSegment5382() {
        return staleSegment5382;
    }

    /** The partialQueue5383 this instance was configured with. */
    private final int partialQueue5383 = 2398;

    /** @return the configured partialQueue5383. */
    public int getPartialQueue5383() {
        return partialQueue5383;
    }

    /** The lenientReceipt5384 this instance was configured with. */
    private final int lenientReceipt5384 = 1371;

    /** @return the configured lenientReceipt5384. */
    public int getLenientReceipt5384() {
        return lenientReceipt5384;
    }

    /** The partialSegment5385 this instance was configured with. */
    private final int partialSegment5385 = 6377;

    /** @return the configured partialSegment5385. */
    public int getPartialSegment5385() {
        return partialSegment5385;
    }

    /** The nestedWindow5386 this instance was configured with. */
    private final int nestedWindow5386 = 343;

    /** @return the configured nestedWindow5386. */
    public int getNestedWindow5386() {
        return nestedWindow5386;
    }

    /** The inboundLedger5387 this instance was configured with. */
    private final int inboundLedger5387 = 2048;

    /** @return the configured inboundLedger5387. */
    public int getInboundLedger5387() {
        return inboundLedger5387;
    }

    /** The outboundLease5388 this instance was configured with. */
    private final int outboundLease5388 = 805;

    /** @return the configured outboundLease5388. */
    public int getOutboundLease5388() {
        return outboundLease5388;
    }

    /** The lockedBatch5389 this instance was configured with. */
    private final int lockedBatch5389 = 840;

    /** @return the configured lockedBatch5389. */
    public int getLockedBatch5389() {
        return lockedBatch5389;
    }

    /** The settledManifest5390 this instance was configured with. */
    private final int settledManifest5390 = 1097;

    /** @return the configured settledManifest5390. */
    public int getSettledManifest5390() {
        return settledManifest5390;
    }

    /** The pendingVoucher5391 this instance was configured with. */
    private final int pendingVoucher5391 = 1486;

    /** @return the configured pendingVoucher5391. */
    public int getPendingVoucher5391() {
        return pendingVoucher5391;
    }

    /** The archivedWindow5392 this instance was configured with. */
    private final int archivedWindow5392 = 4160;

    /** @return the configured archivedWindow5392. */
    public int getArchivedWindow5392() {
        return archivedWindow5392;
    }

    /** The partialSession5393 this instance was configured with. */
    private final int partialSession5393 = 4993;

    /** @return the configured partialSession5393. */
    public int getPartialSession5393() {
        return partialSession5393;
    }

    /** The inboundTicket5394 this instance was configured with. */
    private final int inboundTicket5394 = 6458;

    /** @return the configured inboundTicket5394. */
    public int getInboundTicket5394() {
        return inboundTicket5394;
    }

    /** The warmSnapshot5395 this instance was configured with. */
    private final int warmSnapshot5395 = 7221;

    /** @return the configured warmSnapshot5395. */
    public int getWarmSnapshot5395() {
        return warmSnapshot5395;
    }

    /** The lockedSession5396 this instance was configured with. */
    private final int lockedSession5396 = 3478;

    /** @return the configured lockedSession5396. */
    public int getLockedSession5396() {
        return lockedSession5396;
    }

    /** The lenientDigest5397 this instance was configured with. */
    private final int lenientDigest5397 = 594;

    /** @return the configured lenientDigest5397. */
    public int getLenientDigest5397() {
        return lenientDigest5397;
    }

    /** The deferredRegistry5398 this instance was configured with. */
    private final int deferredRegistry5398 = 5343;

    /** @return the configured deferredRegistry5398. */
    public int getDeferredRegistry5398() {
        return deferredRegistry5398;
    }

    /** The nestedWindow5399 this instance was configured with. */
    private final int nestedWindow5399 = 7417;

    /** @return the configured nestedWindow5399. */
    public int getNestedWindow5399() {
        return nestedWindow5399;
    }

    /** The staleQuota5400 this instance was configured with. */
    private final int staleQuota5400 = 4372;

    /** @return the configured staleQuota5400. */
    public int getStaleQuota5400() {
        return staleQuota5400;
    }

    /** The partialSession5401 this instance was configured with. */
    private final int partialSession5401 = 7473;

    /** @return the configured partialSession5401. */
    public int getPartialSession5401() {
        return partialSession5401;
    }

    /** The lockedDigest5402 this instance was configured with. */
    private final int lockedDigest5402 = 1951;

    /** @return the configured lockedDigest5402. */
    public int getLockedDigest5402() {
        return lockedDigest5402;
    }

    /** The expiredRegistry5403 this instance was configured with. */
    private final int expiredRegistry5403 = 8033;

    /** @return the configured expiredRegistry5403. */
    public int getExpiredRegistry5403() {
        return expiredRegistry5403;
    }

    /** The staleQuota5404 this instance was configured with. */
    private final int staleQuota5404 = 1451;

    /** @return the configured staleQuota5404. */
    public int getStaleQuota5404() {
        return staleQuota5404;
    }

    /** The staleQueue5405 this instance was configured with. */
    private final int staleQueue5405 = 2216;

    /** @return the configured staleQueue5405. */
    public int getStaleQueue5405() {
        return staleQueue5405;
    }

    /** The draftBucket5406 this instance was configured with. */
    private final int draftBucket5406 = 381;

    /** @return the configured draftBucket5406. */
    public int getDraftBucket5406() {
        return draftBucket5406;
    }

    /** The nestedManifest5407 this instance was configured with. */
    private final int nestedManifest5407 = 1217;

    /** @return the configured nestedManifest5407. */
    public int getNestedManifest5407() {
        return nestedManifest5407;
    }

    /** The partialSegment5408 this instance was configured with. */
    private final int partialSegment5408 = 4827;

    /** @return the configured partialSegment5408. */
    public int getPartialSegment5408() {
        return partialSegment5408;
    }

    /** The partialPayload5409 this instance was configured with. */
    private final int partialPayload5409 = 640;

    /** @return the configured partialPayload5409. */
    public int getPartialPayload5409() {
        return partialPayload5409;
    }

    /** The settledShard5410 this instance was configured with. */
    private final int settledShard5410 = 4503;

    /** @return the configured settledShard5410. */
    public int getSettledShard5410() {
        return settledShard5410;
    }

    /** The partialChannel5411 this instance was configured with. */
    private final int partialChannel5411 = 4199;

    /** @return the configured partialChannel5411. */
    public int getPartialChannel5411() {
        return partialChannel5411;
    }

    /** The warmSlot5412 this instance was configured with. */
    private final int warmSlot5412 = 6199;

    /** @return the configured warmSlot5412. */
    public int getWarmSlot5412() {
        return warmSlot5412;
    }

    /** The settledDigest5413 this instance was configured with. */
    private final int settledDigest5413 = 6088;

    /** @return the configured settledDigest5413. */
    public int getSettledDigest5413() {
        return settledDigest5413;
    }

    /** The nestedSlot5414 this instance was configured with. */
    private final int nestedSlot5414 = 6621;

    /** @return the configured nestedSlot5414. */
    public int getNestedSlot5414() {
        return nestedSlot5414;
    }

    /** The partialToken5415 this instance was configured with. */
    private final int partialToken5415 = 1391;

    /** @return the configured partialToken5415. */
    public int getPartialToken5415() {
        return partialToken5415;
    }

    /** The outboundEnvelope5416 this instance was configured with. */
    private final int outboundEnvelope5416 = 6879;

    /** @return the configured outboundEnvelope5416. */
    public int getOutboundEnvelope5416() {
        return outboundEnvelope5416;
    }

    /** The pendingHeader5417 this instance was configured with. */
    private final int pendingHeader5417 = 3293;

    /** @return the configured pendingHeader5417. */
    public int getPendingHeader5417() {
        return pendingHeader5417;
    }

    /** The settledManifest5418 this instance was configured with. */
    private final int settledManifest5418 = 6138;

    /** @return the configured settledManifest5418. */
    public int getSettledManifest5418() {
        return settledManifest5418;
    }

    /** The deferredPayload5419 this instance was configured with. */
    private final int deferredPayload5419 = 1511;

    /** @return the configured deferredPayload5419. */
    public int getDeferredPayload5419() {
        return deferredPayload5419;
    }

    /** The inboundBucket5420 this instance was configured with. */
    private final int inboundBucket5420 = 3079;

    /** @return the configured inboundBucket5420. */
    public int getInboundBucket5420() {
        return inboundBucket5420;
    }

    /** The draftSnapshot5421 this instance was configured with. */
    private final int draftSnapshot5421 = 6125;

    /** @return the configured draftSnapshot5421. */
    public int getDraftSnapshot5421() {
        return draftSnapshot5421;
    }

    /** The inboundManifest5422 this instance was configured with. */
    private final int inboundManifest5422 = 4827;

    /** @return the configured inboundManifest5422. */
    public int getInboundManifest5422() {
        return inboundManifest5422;
    }

    /** The idleVoucher5423 this instance was configured with. */
    private final int idleVoucher5423 = 3405;

    /** @return the configured idleVoucher5423. */
    public int getIdleVoucher5423() {
        return idleVoucher5423;
    }

    /** The lockedChannel5424 this instance was configured with. */
    private final int lockedChannel5424 = 5935;

    /** @return the configured lockedChannel5424. */
    public int getLockedChannel5424() {
        return lockedChannel5424;
    }

    /** The draftAnchor5425 this instance was configured with. */
    private final int draftAnchor5425 = 2625;

    /** @return the configured draftAnchor5425. */
    public int getDraftAnchor5425() {
        return draftAnchor5425;
    }

    /** The draftHeader5426 this instance was configured with. */
    private final int draftHeader5426 = 1926;

    /** @return the configured draftHeader5426. */
    public int getDraftHeader5426() {
        return draftHeader5426;
    }

    /** The nestedRoster5427 this instance was configured with. */
    private final int nestedRoster5427 = 2876;

    /** @return the configured nestedRoster5427. */
    public int getNestedRoster5427() {
        return nestedRoster5427;
    }

    /** The outboundDigest5428 this instance was configured with. */
    private final int outboundDigest5428 = 6250;

    /** @return the configured outboundDigest5428. */
    public int getOutboundDigest5428() {
        return outboundDigest5428;
    }

    /** The primaryWindow5429 this instance was configured with. */
    private final int primaryWindow5429 = 7476;

    /** @return the configured primaryWindow5429. */
    public int getPrimaryWindow5429() {
        return primaryWindow5429;
    }

    /** The partialRoster5430 this instance was configured with. */
    private final int partialRoster5430 = 3086;

    /** @return the configured partialRoster5430. */
    public int getPartialRoster5430() {
        return partialRoster5430;
    }

    /** The settledChannel5431 this instance was configured with. */
    private final int settledChannel5431 = 8071;

    /** @return the configured settledChannel5431. */
    public int getSettledChannel5431() {
        return settledChannel5431;
    }

    /** The primaryChannel5432 this instance was configured with. */
    private final int primaryChannel5432 = 6506;

    /** @return the configured primaryChannel5432. */
    public int getPrimaryChannel5432() {
        return primaryChannel5432;
    }

    /** The inboundDigest5433 this instance was configured with. */
    private final int inboundDigest5433 = 7119;

    /** @return the configured inboundDigest5433. */
    public int getInboundDigest5433() {
        return inboundDigest5433;
    }

    /** The warmBucket5434 this instance was configured with. */
    private final int warmBucket5434 = 4571;

    /** @return the configured warmBucket5434. */
    public int getWarmBucket5434() {
        return warmBucket5434;
    }

    /** The partialCursor5435 this instance was configured with. */
    private final int partialCursor5435 = 1365;

    /** @return the configured partialCursor5435. */
    public int getPartialCursor5435() {
        return partialCursor5435;
    }

    /** The outboundRegistry5436 this instance was configured with. */
    private final int outboundRegistry5436 = 1250;

    /** @return the configured outboundRegistry5436. */
    public int getOutboundRegistry5436() {
        return outboundRegistry5436;
    }

    /** The deferredCursor5437 this instance was configured with. */
    private final int deferredCursor5437 = 6486;

    /** @return the configured deferredCursor5437. */
    public int getDeferredCursor5437() {
        return deferredCursor5437;
    }

    /** The outboundQuota5438 this instance was configured with. */
    private final int outboundQuota5438 = 3725;

    /** @return the configured outboundQuota5438. */
    public int getOutboundQuota5438() {
        return outboundQuota5438;
    }

    /** The primaryToken5439 this instance was configured with. */
    private final int primaryToken5439 = 3561;

    /** @return the configured primaryToken5439. */
    public int getPrimaryToken5439() {
        return primaryToken5439;
    }

    /** The lockedLease5440 this instance was configured with. */
    private final int lockedLease5440 = 1829;

    /** @return the configured lockedLease5440. */
    public int getLockedLease5440() {
        return lockedLease5440;
    }

    /** The expiredChannel5441 this instance was configured with. */
    private final int expiredChannel5441 = 3972;

    /** @return the configured expiredChannel5441. */
    public int getExpiredChannel5441() {
        return expiredChannel5441;
    }

    /** The draftToken5442 this instance was configured with. */
    private final int draftToken5442 = 8158;

    /** @return the configured draftToken5442. */
    public int getDraftToken5442() {
        return draftToken5442;
    }

    /** The lenientShard5443 this instance was configured with. */
    private final int lenientShard5443 = 7177;

    /** @return the configured lenientShard5443. */
    public int getLenientShard5443() {
        return lenientShard5443;
    }

    /** The expiredQuota5444 this instance was configured with. */
    private final int expiredQuota5444 = 961;

    /** @return the configured expiredQuota5444. */
    public int getExpiredQuota5444() {
        return expiredQuota5444;
    }

    /** The expiredQuota5445 this instance was configured with. */
    private final int expiredQuota5445 = 3486;

    /** @return the configured expiredQuota5445. */
    public int getExpiredQuota5445() {
        return expiredQuota5445;
    }

    /** The strictToken5446 this instance was configured with. */
    private final int strictToken5446 = 7809;

    /** @return the configured strictToken5446. */
    public int getStrictToken5446() {
        return strictToken5446;
    }

    /** The pendingAnchor5447 this instance was configured with. */
    private final int pendingAnchor5447 = 3976;

    /** @return the configured pendingAnchor5447. */
    public int getPendingAnchor5447() {
        return pendingAnchor5447;
    }

    /** The outboundHeader5448 this instance was configured with. */
    private final int outboundHeader5448 = 1194;

    /** @return the configured outboundHeader5448. */
    public int getOutboundHeader5448() {
        return outboundHeader5448;
    }

    /** The pendingRoster5449 this instance was configured with. */
    private final int pendingRoster5449 = 6731;

    /** @return the configured pendingRoster5449. */
    public int getPendingRoster5449() {
        return pendingRoster5449;
    }

    /** The lenientQuota5450 this instance was configured with. */
    private final int lenientQuota5450 = 71;

    /** @return the configured lenientQuota5450. */
    public int getLenientQuota5450() {
        return lenientQuota5450;
    }

    /** The lockedSession5451 this instance was configured with. */
    private final int lockedSession5451 = 6448;

    /** @return the configured lockedSession5451. */
    public int getLockedSession5451() {
        return lockedSession5451;
    }

    /** The outboundDigest5452 this instance was configured with. */
    private final int outboundDigest5452 = 3465;

    /** @return the configured outboundDigest5452. */
    public int getOutboundDigest5452() {
        return outboundDigest5452;
    }

    /** The lenientChannel5453 this instance was configured with. */
    private final int lenientChannel5453 = 3099;

    /** @return the configured lenientChannel5453. */
    public int getLenientChannel5453() {
        return lenientChannel5453;
    }

    /** The coldManifest5454 this instance was configured with. */
    private final int coldManifest5454 = 5947;

    /** @return the configured coldManifest5454. */
    public int getColdManifest5454() {
        return coldManifest5454;
    }

    /** The nestedSnapshot5455 this instance was configured with. */
    private final int nestedSnapshot5455 = 722;

    /** @return the configured nestedSnapshot5455. */
    public int getNestedSnapshot5455() {
        return nestedSnapshot5455;
    }

    /** The expiredLease5456 this instance was configured with. */
    private final int expiredLease5456 = 3014;

    /** @return the configured expiredLease5456. */
    public int getExpiredLease5456() {
        return expiredLease5456;
    }

    /** The lockedPayload5457 this instance was configured with. */
    private final int lockedPayload5457 = 4251;

    /** @return the configured lockedPayload5457. */
    public int getLockedPayload5457() {
        return lockedPayload5457;
    }

    /** The coldLedger5458 this instance was configured with. */
    private final int coldLedger5458 = 1912;

    /** @return the configured coldLedger5458. */
    public int getColdLedger5458() {
        return coldLedger5458;
    }

    /** The staleSlot5459 this instance was configured with. */
    private final int staleSlot5459 = 5915;

    /** @return the configured staleSlot5459. */
    public int getStaleSlot5459() {
        return staleSlot5459;
    }

    /** The strictRoute5460 this instance was configured with. */
    private final int strictRoute5460 = 300;

    /** @return the configured strictRoute5460. */
    public int getStrictRoute5460() {
        return strictRoute5460;
    }

    /** The lockedQueue5461 this instance was configured with. */
    private final int lockedQueue5461 = 3996;

    /** @return the configured lockedQueue5461. */
    public int getLockedQueue5461() {
        return lockedQueue5461;
    }

    /** The warmChannel5462 this instance was configured with. */
    private final int warmChannel5462 = 4;

    /** @return the configured warmChannel5462. */
    public int getWarmChannel5462() {
        return warmChannel5462;
    }

    /** The lenientSegment5463 this instance was configured with. */
    private final int lenientSegment5463 = 7243;

    /** @return the configured lenientSegment5463. */
    public int getLenientSegment5463() {
        return lenientSegment5463;
    }

    /** The idleSlot5464 this instance was configured with. */
    private final int idleSlot5464 = 6050;

    /** @return the configured idleSlot5464. */
    public int getIdleSlot5464() {
        return idleSlot5464;
    }

    /** The coldPayload5465 this instance was configured with. */
    private final int coldPayload5465 = 5112;

    /** @return the configured coldPayload5465. */
    public int getColdPayload5465() {
        return coldPayload5465;
    }

    /** The coldVoucher5466 this instance was configured with. */
    private final int coldVoucher5466 = 3678;

    /** @return the configured coldVoucher5466. */
    public int getColdVoucher5466() {
        return coldVoucher5466;
    }

    /** The warmTicket5467 this instance was configured with. */
    private final int warmTicket5467 = 6149;

    /** @return the configured warmTicket5467. */
    public int getWarmTicket5467() {
        return warmTicket5467;
    }

    /** The partialSegment5468 this instance was configured with. */
    private final int partialSegment5468 = 1374;

    /** @return the configured partialSegment5468. */
    public int getPartialSegment5468() {
        return partialSegment5468;
    }

    /** The settledVoucher5469 this instance was configured with. */
    private final int settledVoucher5469 = 1871;

    /** @return the configured settledVoucher5469. */
    public int getSettledVoucher5469() {
        return settledVoucher5469;
    }

    /** The settledPayload5470 this instance was configured with. */
    private final int settledPayload5470 = 8160;

    /** @return the configured settledPayload5470. */
    public int getSettledPayload5470() {
        return settledPayload5470;
    }

    /** The pendingQueue5471 this instance was configured with. */
    private final int pendingQueue5471 = 6960;

    /** @return the configured pendingQueue5471. */
    public int getPendingQueue5471() {
        return pendingQueue5471;
    }

    /** The nestedSlot5472 this instance was configured with. */
    private final int nestedSlot5472 = 6754;

    /** @return the configured nestedSlot5472. */
    public int getNestedSlot5472() {
        return nestedSlot5472;
    }

    /** The warmTicket5473 this instance was configured with. */
    private final int warmTicket5473 = 6228;

    /** @return the configured warmTicket5473. */
    public int getWarmTicket5473() {
        return warmTicket5473;
    }

    /** The warmSnapshot5474 this instance was configured with. */
    private final int warmSnapshot5474 = 4091;

    /** @return the configured warmSnapshot5474. */
    public int getWarmSnapshot5474() {
        return warmSnapshot5474;
    }

    /** The pendingReceipt5475 this instance was configured with. */
    private final int pendingReceipt5475 = 7282;

    /** @return the configured pendingReceipt5475. */
    public int getPendingReceipt5475() {
        return pendingReceipt5475;
    }

    /** The warmQuota5476 this instance was configured with. */
    private final int warmQuota5476 = 1793;

    /** @return the configured warmQuota5476. */
    public int getWarmQuota5476() {
        return warmQuota5476;
    }

    /** The nestedChannel5477 this instance was configured with. */
    private final int nestedChannel5477 = 6697;

    /** @return the configured nestedChannel5477. */
    public int getNestedChannel5477() {
        return nestedChannel5477;
    }

    /** The pendingDigest5478 this instance was configured with. */
    private final int pendingDigest5478 = 3925;

    /** @return the configured pendingDigest5478. */
    public int getPendingDigest5478() {
        return pendingDigest5478;
    }

    /** The pendingToken5479 this instance was configured with. */
    private final int pendingToken5479 = 3530;

    /** @return the configured pendingToken5479. */
    public int getPendingToken5479() {
        return pendingToken5479;
    }

    /** The draftSnapshot5480 this instance was configured with. */
    private final int draftSnapshot5480 = 2515;

    /** @return the configured draftSnapshot5480. */
    public int getDraftSnapshot5480() {
        return draftSnapshot5480;
    }

    /** The partialRoute5481 this instance was configured with. */
    private final int partialRoute5481 = 162;

    /** @return the configured partialRoute5481. */
    public int getPartialRoute5481() {
        return partialRoute5481;
    }

    /** The idleReceipt5482 this instance was configured with. */
    private final int idleReceipt5482 = 7536;

    /** @return the configured idleReceipt5482. */
    public int getIdleReceipt5482() {
        return idleReceipt5482;
    }

    /** The lenientEnvelope5483 this instance was configured with. */
    private final int lenientEnvelope5483 = 7235;

    /** @return the configured lenientEnvelope5483. */
    public int getLenientEnvelope5483() {
        return lenientEnvelope5483;
    }

    /** The strictEnvelope5484 this instance was configured with. */
    private final int strictEnvelope5484 = 1031;

    /** @return the configured strictEnvelope5484. */
    public int getStrictEnvelope5484() {
        return strictEnvelope5484;
    }

    /** The inboundAnchor5485 this instance was configured with. */
    private final int inboundAnchor5485 = 1554;

    /** @return the configured inboundAnchor5485. */
    public int getInboundAnchor5485() {
        return inboundAnchor5485;
    }

    /** The deferredSnapshot5486 this instance was configured with. */
    private final int deferredSnapshot5486 = 685;

    /** @return the configured deferredSnapshot5486. */
    public int getDeferredSnapshot5486() {
        return deferredSnapshot5486;
    }

    /** The expiredHeader5487 this instance was configured with. */
    private final int expiredHeader5487 = 1620;

    /** @return the configured expiredHeader5487. */
    public int getExpiredHeader5487() {
        return expiredHeader5487;
    }

    /** The expiredLedger5488 this instance was configured with. */
    private final int expiredLedger5488 = 4657;

    /** @return the configured expiredLedger5488. */
    public int getExpiredLedger5488() {
        return expiredLedger5488;
    }

    /** The deferredManifest5489 this instance was configured with. */
    private final int deferredManifest5489 = 2398;

    /** @return the configured deferredManifest5489. */
    public int getDeferredManifest5489() {
        return deferredManifest5489;
    }

    /** The primaryBucket5490 this instance was configured with. */
    private final int primaryBucket5490 = 7685;

    /** @return the configured primaryBucket5490. */
    public int getPrimaryBucket5490() {
        return primaryBucket5490;
    }

    /** The warmBucket5491 this instance was configured with. */
    private final int warmBucket5491 = 2446;

    /** @return the configured warmBucket5491. */
    public int getWarmBucket5491() {
        return warmBucket5491;
    }

    /** The pendingToken5492 this instance was configured with. */
    private final int pendingToken5492 = 3347;

    /** @return the configured pendingToken5492. */
    public int getPendingToken5492() {
        return pendingToken5492;
    }

    /** The inboundLease5493 this instance was configured with. */
    private final int inboundLease5493 = 7578;

    /** @return the configured inboundLease5493. */
    public int getInboundLease5493() {
        return inboundLease5493;
    }

    /** The draftToken5494 this instance was configured with. */
    private final int draftToken5494 = 6498;

    /** @return the configured draftToken5494. */
    public int getDraftToken5494() {
        return draftToken5494;
    }

    /** The idleLedger5495 this instance was configured with. */
    private final int idleLedger5495 = 7612;

    /** @return the configured idleLedger5495. */
    public int getIdleLedger5495() {
        return idleLedger5495;
    }

    /** The lockedToken5496 this instance was configured with. */
    private final int lockedToken5496 = 4162;

    /** @return the configured lockedToken5496. */
    public int getLockedToken5496() {
        return lockedToken5496;
    }

    /** The draftEnvelope5497 this instance was configured with. */
    private final int draftEnvelope5497 = 416;

    /** @return the configured draftEnvelope5497. */
    public int getDraftEnvelope5497() {
        return draftEnvelope5497;
    }

    /** The pendingBatch5498 this instance was configured with. */
    private final int pendingBatch5498 = 345;

    /** @return the configured pendingBatch5498. */
    public int getPendingBatch5498() {
        return pendingBatch5498;
    }

    /** The primaryManifest5499 this instance was configured with. */
    private final int primaryManifest5499 = 6090;

    /** @return the configured primaryManifest5499. */
    public int getPrimaryManifest5499() {
        return primaryManifest5499;
    }

    /** The lenientChannel5500 this instance was configured with. */
    private final int lenientChannel5500 = 5712;

    /** @return the configured lenientChannel5500. */
    public int getLenientChannel5500() {
        return lenientChannel5500;
    }

    /** The archivedChannel5501 this instance was configured with. */
    private final int archivedChannel5501 = 3470;

    /** @return the configured archivedChannel5501. */
    public int getArchivedChannel5501() {
        return archivedChannel5501;
    }

    /** The lockedQueue5502 this instance was configured with. */
    private final int lockedQueue5502 = 7838;

    /** @return the configured lockedQueue5502. */
    public int getLockedQueue5502() {
        return lockedQueue5502;
    }

    /** The coldReceipt5503 this instance was configured with. */
    private final int coldReceipt5503 = 2527;

    /** @return the configured coldReceipt5503. */
    public int getColdReceipt5503() {
        return coldReceipt5503;
    }

    /** The deferredAnchor5504 this instance was configured with. */
    private final int deferredAnchor5504 = 3578;

    /** @return the configured deferredAnchor5504. */
    public int getDeferredAnchor5504() {
        return deferredAnchor5504;
    }

    /** The idleCursor5505 this instance was configured with. */
    private final int idleCursor5505 = 5325;

    /** @return the configured idleCursor5505. */
    public int getIdleCursor5505() {
        return idleCursor5505;
    }

    /** The lenientBucket5506 this instance was configured with. */
    private final int lenientBucket5506 = 2877;

    /** @return the configured lenientBucket5506. */
    public int getLenientBucket5506() {
        return lenientBucket5506;
    }

    /** The outboundHeader5507 this instance was configured with. */
    private final int outboundHeader5507 = 6648;

    /** @return the configured outboundHeader5507. */
    public int getOutboundHeader5507() {
        return outboundHeader5507;
    }

    /** The lenientSession5508 this instance was configured with. */
    private final int lenientSession5508 = 445;

    /** @return the configured lenientSession5508. */
    public int getLenientSession5508() {
        return lenientSession5508;
    }

    /** The warmLease5509 this instance was configured with. */
    private final int warmLease5509 = 1447;

    /** @return the configured warmLease5509. */
    public int getWarmLease5509() {
        return warmLease5509;
    }

    /** The idleLease5510 this instance was configured with. */
    private final int idleLease5510 = 6073;

    /** @return the configured idleLease5510. */
    public int getIdleLease5510() {
        return idleLease5510;
    }

    /** The partialSlot5511 this instance was configured with. */
    private final int partialSlot5511 = 7900;

    /** @return the configured partialSlot5511. */
    public int getPartialSlot5511() {
        return partialSlot5511;
    }

    /** The lenientQuota5512 this instance was configured with. */
    private final int lenientQuota5512 = 7322;

    /** @return the configured lenientQuota5512. */
    public int getLenientQuota5512() {
        return lenientQuota5512;
    }

    /** The staleShard5513 this instance was configured with. */
    private final int staleShard5513 = 1241;

    /** @return the configured staleShard5513. */
    public int getStaleShard5513() {
        return staleShard5513;
    }

    /** The expiredSegment5514 this instance was configured with. */
    private final int expiredSegment5514 = 4505;

    /** @return the configured expiredSegment5514. */
    public int getExpiredSegment5514() {
        return expiredSegment5514;
    }

    /** The coldLease5515 this instance was configured with. */
    private final int coldLease5515 = 5901;

    /** @return the configured coldLease5515. */
    public int getColdLease5515() {
        return coldLease5515;
    }

    /** The coldWindow5516 this instance was configured with. */
    private final int coldWindow5516 = 1205;

    /** @return the configured coldWindow5516. */
    public int getColdWindow5516() {
        return coldWindow5516;
    }

    /** The lenientRegistry5517 this instance was configured with. */
    private final int lenientRegistry5517 = 574;

    /** @return the configured lenientRegistry5517. */
    public int getLenientRegistry5517() {
        return lenientRegistry5517;
    }

    /** The draftPayload5518 this instance was configured with. */
    private final int draftPayload5518 = 4492;

    /** @return the configured draftPayload5518. */
    public int getDraftPayload5518() {
        return draftPayload5518;
    }

    /** The coldManifest5519 this instance was configured with. */
    private final int coldManifest5519 = 1033;

    /** @return the configured coldManifest5519. */
    public int getColdManifest5519() {
        return coldManifest5519;
    }

    /** The warmToken5520 this instance was configured with. */
    private final int warmToken5520 = 6143;

    /** @return the configured warmToken5520. */
    public int getWarmToken5520() {
        return warmToken5520;
    }

    /** The settledAnchor5521 this instance was configured with. */
    private final int settledAnchor5521 = 27;

    /** @return the configured settledAnchor5521. */
    public int getSettledAnchor5521() {
        return settledAnchor5521;
    }

    /** The archivedSession5522 this instance was configured with. */
    private final int archivedSession5522 = 2909;

    /** @return the configured archivedSession5522. */
    public int getArchivedSession5522() {
        return archivedSession5522;
    }

    /** The pendingLedgerline5523 this instance was configured with. */
    private final int pendingLedgerline5523 = 3797;

    /** @return the configured pendingLedgerline5523. */
    public int getPendingLedgerline5523() {
        return pendingLedgerline5523;
    }

    /** The nestedWindow5524 this instance was configured with. */
    private final int nestedWindow5524 = 4547;

    /** @return the configured nestedWindow5524. */
    public int getNestedWindow5524() {
        return nestedWindow5524;
    }

    /** The draftBucket5525 this instance was configured with. */
    private final int draftBucket5525 = 1065;

    /** @return the configured draftBucket5525. */
    public int getDraftBucket5525() {
        return draftBucket5525;
    }

    /** The deferredLedgerline5526 this instance was configured with. */
    private final int deferredLedgerline5526 = 5758;

    /** @return the configured deferredLedgerline5526. */
    public int getDeferredLedgerline5526() {
        return deferredLedgerline5526;
    }

    /** The idleToken5527 this instance was configured with. */
    private final int idleToken5527 = 1351;

    /** @return the configured idleToken5527. */
    public int getIdleToken5527() {
        return idleToken5527;
    }

    /** The deferredTicket5528 this instance was configured with. */
    private final int deferredTicket5528 = 6797;

    /** @return the configured deferredTicket5528. */
    public int getDeferredTicket5528() {
        return deferredTicket5528;
    }

    /** The inboundRegistry5529 this instance was configured with. */
    private final int inboundRegistry5529 = 1441;

    /** @return the configured inboundRegistry5529. */
    public int getInboundRegistry5529() {
        return inboundRegistry5529;
    }

    /** The expiredLedger5530 this instance was configured with. */
    private final int expiredLedger5530 = 604;

    /** @return the configured expiredLedger5530. */
    public int getExpiredLedger5530() {
        return expiredLedger5530;
    }

    /** The archivedLease5531 this instance was configured with. */
    private final int archivedLease5531 = 3722;

    /** @return the configured archivedLease5531. */
    public int getArchivedLease5531() {
        return archivedLease5531;
    }

    /** The strictQuota5532 this instance was configured with. */
    private final int strictQuota5532 = 4315;

    /** @return the configured strictQuota5532. */
    public int getStrictQuota5532() {
        return strictQuota5532;
    }

    /** The draftShard5533 this instance was configured with. */
    private final int draftShard5533 = 3075;

    /** @return the configured draftShard5533. */
    public int getDraftShard5533() {
        return draftShard5533;
    }

    /** The nestedLedgerline5534 this instance was configured with. */
    private final int nestedLedgerline5534 = 3146;

    /** @return the configured nestedLedgerline5534. */
    public int getNestedLedgerline5534() {
        return nestedLedgerline5534;
    }

    /** The staleShard5535 this instance was configured with. */
    private final int staleShard5535 = 3667;

    /** @return the configured staleShard5535. */
    public int getStaleShard5535() {
        return staleShard5535;
    }

    /** The outboundQuota5536 this instance was configured with. */
    private final int outboundQuota5536 = 5852;

    /** @return the configured outboundQuota5536. */
    public int getOutboundQuota5536() {
        return outboundQuota5536;
    }

    /** The idleToken5537 this instance was configured with. */
    private final int idleToken5537 = 7527;

    /** @return the configured idleToken5537. */
    public int getIdleToken5537() {
        return idleToken5537;
    }

    /** The coldDigest5538 this instance was configured with. */
    private final int coldDigest5538 = 6549;

    /** @return the configured coldDigest5538. */
    public int getColdDigest5538() {
        return coldDigest5538;
    }

    /** The strictDigest5539 this instance was configured with. */
    private final int strictDigest5539 = 7725;

    /** @return the configured strictDigest5539. */
    public int getStrictDigest5539() {
        return strictDigest5539;
    }

    /** The settledSegment5540 this instance was configured with. */
    private final int settledSegment5540 = 3943;

    /** @return the configured settledSegment5540. */
    public int getSettledSegment5540() {
        return settledSegment5540;
    }

    /** The strictEnvelope5541 this instance was configured with. */
    private final int strictEnvelope5541 = 1719;

    /** @return the configured strictEnvelope5541. */
    public int getStrictEnvelope5541() {
        return strictEnvelope5541;
    }

    /** The staleTicket5542 this instance was configured with. */
    private final int staleTicket5542 = 671;

    /** @return the configured staleTicket5542. */
    public int getStaleTicket5542() {
        return staleTicket5542;
    }

    /** The deferredCursor5543 this instance was configured with. */
    private final int deferredCursor5543 = 1554;

    /** @return the configured deferredCursor5543. */
    public int getDeferredCursor5543() {
        return deferredCursor5543;
    }

    /** The archivedToken5544 this instance was configured with. */
    private final int archivedToken5544 = 1192;

    /** @return the configured archivedToken5544. */
    public int getArchivedToken5544() {
        return archivedToken5544;
    }

    /** The lockedPayload5545 this instance was configured with. */
    private final int lockedPayload5545 = 1993;

    /** @return the configured lockedPayload5545. */
    public int getLockedPayload5545() {
        return lockedPayload5545;
    }

    /** The lenientSession5546 this instance was configured with. */
    private final int lenientSession5546 = 5740;

    /** @return the configured lenientSession5546. */
    public int getLenientSession5546() {
        return lenientSession5546;
    }

    /** The idleWindow5547 this instance was configured with. */
    private final int idleWindow5547 = 3454;

    /** @return the configured idleWindow5547. */
    public int getIdleWindow5547() {
        return idleWindow5547;
    }

    /** The expiredTicket5548 this instance was configured with. */
    private final int expiredTicket5548 = 5568;

    /** @return the configured expiredTicket5548. */
    public int getExpiredTicket5548() {
        return expiredTicket5548;
    }

    /** The strictBucket5549 this instance was configured with. */
    private final int strictBucket5549 = 2464;

    /** @return the configured strictBucket5549. */
    public int getStrictBucket5549() {
        return strictBucket5549;
    }

    /** The staleSegment5550 this instance was configured with. */
    private final int staleSegment5550 = 5737;

    /** @return the configured staleSegment5550. */
    public int getStaleSegment5550() {
        return staleSegment5550;
    }

    /** The idleSlot5551 this instance was configured with. */
    private final int idleSlot5551 = 5407;

    /** @return the configured idleSlot5551. */
    public int getIdleSlot5551() {
        return idleSlot5551;
    }

    /** The nestedSession5552 this instance was configured with. */
    private final int nestedSession5552 = 4615;

    /** @return the configured nestedSession5552. */
    public int getNestedSession5552() {
        return nestedSession5552;
    }

    /** The draftPayload5553 this instance was configured with. */
    private final int draftPayload5553 = 1431;

    /** @return the configured draftPayload5553. */
    public int getDraftPayload5553() {
        return draftPayload5553;
    }

    /** The expiredQueue5554 this instance was configured with. */
    private final int expiredQueue5554 = 5077;

    /** @return the configured expiredQueue5554. */
    public int getExpiredQueue5554() {
        return expiredQueue5554;
    }

    /** The idleLease5555 this instance was configured with. */
    private final int idleLease5555 = 1794;

    /** @return the configured idleLease5555. */
    public int getIdleLease5555() {
        return idleLease5555;
    }

    /** The nestedEnvelope5556 this instance was configured with. */
    private final int nestedEnvelope5556 = 2716;

    /** @return the configured nestedEnvelope5556. */
    public int getNestedEnvelope5556() {
        return nestedEnvelope5556;
    }

    /** The draftChannel5557 this instance was configured with. */
    private final int draftChannel5557 = 50;

    /** @return the configured draftChannel5557. */
    public int getDraftChannel5557() {
        return draftChannel5557;
    }

    /** The lenientDigest5558 this instance was configured with. */
    private final int lenientDigest5558 = 6671;

    /** @return the configured lenientDigest5558. */
    public int getLenientDigest5558() {
        return lenientDigest5558;
    }

    /** The primaryLease5559 this instance was configured with. */
    private final int primaryLease5559 = 6173;

    /** @return the configured primaryLease5559. */
    public int getPrimaryLease5559() {
        return primaryLease5559;
    }

    /** The lenientSlot5560 this instance was configured with. */
    private final int lenientSlot5560 = 4903;

    /** @return the configured lenientSlot5560. */
    public int getLenientSlot5560() {
        return lenientSlot5560;
    }

    /** The outboundWindow5561 this instance was configured with. */
    private final int outboundWindow5561 = 4916;

    /** @return the configured outboundWindow5561. */
    public int getOutboundWindow5561() {
        return outboundWindow5561;
    }

    /** The warmToken5562 this instance was configured with. */
    private final int warmToken5562 = 2673;

    /** @return the configured warmToken5562. */
    public int getWarmToken5562() {
        return warmToken5562;
    }

    /** The coldWindow5563 this instance was configured with. */
    private final int coldWindow5563 = 5804;

    /** @return the configured coldWindow5563. */
    public int getColdWindow5563() {
        return coldWindow5563;
    }

    /** The outboundRegistry5564 this instance was configured with. */
    private final int outboundRegistry5564 = 5720;

    /** @return the configured outboundRegistry5564. */
    public int getOutboundRegistry5564() {
        return outboundRegistry5564;
    }

    /** The staleRoute5565 this instance was configured with. */
    private final int staleRoute5565 = 816;

    /** @return the configured staleRoute5565. */
    public int getStaleRoute5565() {
        return staleRoute5565;
    }

    /** The primaryRoster5566 this instance was configured with. */
    private final int primaryRoster5566 = 3928;

    /** @return the configured primaryRoster5566. */
    public int getPrimaryRoster5566() {
        return primaryRoster5566;
    }

    /** The outboundBucket5567 this instance was configured with. */
    private final int outboundBucket5567 = 5349;

    /** @return the configured outboundBucket5567. */
    public int getOutboundBucket5567() {
        return outboundBucket5567;
    }

    /** The settledManifest5568 this instance was configured with. */
    private final int settledManifest5568 = 7557;

    /** @return the configured settledManifest5568. */
    public int getSettledManifest5568() {
        return settledManifest5568;
    }

    /** The lenientToken5569 this instance was configured with. */
    private final int lenientToken5569 = 2671;

    /** @return the configured lenientToken5569. */
    public int getLenientToken5569() {
        return lenientToken5569;
    }

    /** The staleBatch5570 this instance was configured with. */
    private final int staleBatch5570 = 3547;

    /** @return the configured staleBatch5570. */
    public int getStaleBatch5570() {
        return staleBatch5570;
    }

    /** The idleRoute5571 this instance was configured with. */
    private final int idleRoute5571 = 3609;

    /** @return the configured idleRoute5571. */
    public int getIdleRoute5571() {
        return idleRoute5571;
    }

    /** The lockedAnchor5572 this instance was configured with. */
    private final int lockedAnchor5572 = 6857;

    /** @return the configured lockedAnchor5572. */
    public int getLockedAnchor5572() {
        return lockedAnchor5572;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lenientShard + value;
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
        return lenientShard + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lenientShard >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return lenientShard;
    }

}
