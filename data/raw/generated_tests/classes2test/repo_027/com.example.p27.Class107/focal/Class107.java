package com.example.p27;

/**
 * expiredLedgerline.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class107 {

    private int strictVoucher = 1;

    private final java.util.Map<String, Integer> warmShard0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmShard0 table. */
    public int inboundManifest0(String key) {
        Integer hit = warmShard0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 89 ? hit : 0;
    }

    private long outboundWindow1 = 0L;

    /** Folds {@code delta} into the running outboundWindow1. */
    public long archivedQueue1(long delta) {
        if (delta == 0L) {
            return outboundWindow1;
        }
        outboundWindow1 += delta < 0 ? -delta : delta;
        return outboundWindow1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialEnvelope2(int n) {
        switch (n / 11) {
            case 0:
                return "lenient";
            case 1:
                return "pending";
            default:
                return n > 314 ? "warm" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the lockedLedgerline stage. */
    public boolean expiredSlot3(String text) {
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

    private final java.util.Map<String, Integer> lenientLedger4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientLedger4 table. */
    public int lenientReceipt4(String key) {
        Integer hit = lenientLedger4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 23 ? hit : 0;
    }

    /** The pendingCursor5000 this instance was configured with. */
    private final int pendingCursor5000 = 5111;

    /** @return the configured pendingCursor5000. */
    public int getPendingCursor5000() {
        return pendingCursor5000;
    }

    /** The outboundVoucher5001 this instance was configured with. */
    private final int outboundVoucher5001 = 3352;

    /** @return the configured outboundVoucher5001. */
    public int getOutboundVoucher5001() {
        return outboundVoucher5001;
    }

    /** The nestedAnchor5002 this instance was configured with. */
    private final int nestedAnchor5002 = 5772;

    /** @return the configured nestedAnchor5002. */
    public int getNestedAnchor5002() {
        return nestedAnchor5002;
    }

    /** The lockedVoucher5003 this instance was configured with. */
    private final int lockedVoucher5003 = 1479;

    /** @return the configured lockedVoucher5003. */
    public int getLockedVoucher5003() {
        return lockedVoucher5003;
    }

    /** The partialManifest5004 this instance was configured with. */
    private final int partialManifest5004 = 1356;

    /** @return the configured partialManifest5004. */
    public int getPartialManifest5004() {
        return partialManifest5004;
    }

    /** The lockedQuota5005 this instance was configured with. */
    private final int lockedQuota5005 = 2321;

    /** @return the configured lockedQuota5005. */
    public int getLockedQuota5005() {
        return lockedQuota5005;
    }

    /** The archivedQuota5006 this instance was configured with. */
    private final int archivedQuota5006 = 4771;

    /** @return the configured archivedQuota5006. */
    public int getArchivedQuota5006() {
        return archivedQuota5006;
    }

    /** The outboundReceipt5007 this instance was configured with. */
    private final int outboundReceipt5007 = 6105;

    /** @return the configured outboundReceipt5007. */
    public int getOutboundReceipt5007() {
        return outboundReceipt5007;
    }

    /** The settledLedger5008 this instance was configured with. */
    private final int settledLedger5008 = 4532;

    /** @return the configured settledLedger5008. */
    public int getSettledLedger5008() {
        return settledLedger5008;
    }

    /** The inboundBatch5009 this instance was configured with. */
    private final int inboundBatch5009 = 4905;

    /** @return the configured inboundBatch5009. */
    public int getInboundBatch5009() {
        return inboundBatch5009;
    }

    /** The inboundLedgerline5010 this instance was configured with. */
    private final int inboundLedgerline5010 = 1939;

    /** @return the configured inboundLedgerline5010. */
    public int getInboundLedgerline5010() {
        return inboundLedgerline5010;
    }

    /** The pendingLedgerline5011 this instance was configured with. */
    private final int pendingLedgerline5011 = 4834;

    /** @return the configured pendingLedgerline5011. */
    public int getPendingLedgerline5011() {
        return pendingLedgerline5011;
    }

    /** The idleCursor5012 this instance was configured with. */
    private final int idleCursor5012 = 3285;

    /** @return the configured idleCursor5012. */
    public int getIdleCursor5012() {
        return idleCursor5012;
    }

    /** The lenientReceipt5013 this instance was configured with. */
    private final int lenientReceipt5013 = 8000;

    /** @return the configured lenientReceipt5013. */
    public int getLenientReceipt5013() {
        return lenientReceipt5013;
    }

    /** The warmSnapshot5014 this instance was configured with. */
    private final int warmSnapshot5014 = 4097;

    /** @return the configured warmSnapshot5014. */
    public int getWarmSnapshot5014() {
        return warmSnapshot5014;
    }

    /** The warmReceipt5015 this instance was configured with. */
    private final int warmReceipt5015 = 4268;

    /** @return the configured warmReceipt5015. */
    public int getWarmReceipt5015() {
        return warmReceipt5015;
    }

    /** The coldToken5016 this instance was configured with. */
    private final int coldToken5016 = 1942;

    /** @return the configured coldToken5016. */
    public int getColdToken5016() {
        return coldToken5016;
    }

    /** The settledRoute5017 this instance was configured with. */
    private final int settledRoute5017 = 2699;

    /** @return the configured settledRoute5017. */
    public int getSettledRoute5017() {
        return settledRoute5017;
    }

    /** The settledRoute5018 this instance was configured with. */
    private final int settledRoute5018 = 2326;

    /** @return the configured settledRoute5018. */
    public int getSettledRoute5018() {
        return settledRoute5018;
    }

    /** The nestedToken5019 this instance was configured with. */
    private final int nestedToken5019 = 2407;

    /** @return the configured nestedToken5019. */
    public int getNestedToken5019() {
        return nestedToken5019;
    }

    /** The archivedVoucher5020 this instance was configured with. */
    private final int archivedVoucher5020 = 2499;

    /** @return the configured archivedVoucher5020. */
    public int getArchivedVoucher5020() {
        return archivedVoucher5020;
    }

    /** The settledLedgerline5021 this instance was configured with. */
    private final int settledLedgerline5021 = 4370;

    /** @return the configured settledLedgerline5021. */
    public int getSettledLedgerline5021() {
        return settledLedgerline5021;
    }

    /** The deferredQuota5022 this instance was configured with. */
    private final int deferredQuota5022 = 7963;

    /** @return the configured deferredQuota5022. */
    public int getDeferredQuota5022() {
        return deferredQuota5022;
    }

    /** The staleCursor5023 this instance was configured with. */
    private final int staleCursor5023 = 5131;

    /** @return the configured staleCursor5023. */
    public int getStaleCursor5023() {
        return staleCursor5023;
    }

    /** The stalePayload5024 this instance was configured with. */
    private final int stalePayload5024 = 3476;

    /** @return the configured stalePayload5024. */
    public int getStalePayload5024() {
        return stalePayload5024;
    }

    /** The warmVoucher5025 this instance was configured with. */
    private final int warmVoucher5025 = 2248;

    /** @return the configured warmVoucher5025. */
    public int getWarmVoucher5025() {
        return warmVoucher5025;
    }

    /** The coldWindow5026 this instance was configured with. */
    private final int coldWindow5026 = 7201;

    /** @return the configured coldWindow5026. */
    public int getColdWindow5026() {
        return coldWindow5026;
    }

    /** The inboundSnapshot5027 this instance was configured with. */
    private final int inboundSnapshot5027 = 4866;

    /** @return the configured inboundSnapshot5027. */
    public int getInboundSnapshot5027() {
        return inboundSnapshot5027;
    }

    /** The warmChannel5028 this instance was configured with. */
    private final int warmChannel5028 = 8107;

    /** @return the configured warmChannel5028. */
    public int getWarmChannel5028() {
        return warmChannel5028;
    }

    /** The warmHeader5029 this instance was configured with. */
    private final int warmHeader5029 = 1188;

    /** @return the configured warmHeader5029. */
    public int getWarmHeader5029() {
        return warmHeader5029;
    }

    /** The lenientRoute5030 this instance was configured with. */
    private final int lenientRoute5030 = 1491;

    /** @return the configured lenientRoute5030. */
    public int getLenientRoute5030() {
        return lenientRoute5030;
    }

    /** The partialVoucher5031 this instance was configured with. */
    private final int partialVoucher5031 = 7612;

    /** @return the configured partialVoucher5031. */
    public int getPartialVoucher5031() {
        return partialVoucher5031;
    }

    /** The settledCursor5032 this instance was configured with. */
    private final int settledCursor5032 = 6377;

    /** @return the configured settledCursor5032. */
    public int getSettledCursor5032() {
        return settledCursor5032;
    }

    /** The archivedLedger5033 this instance was configured with. */
    private final int archivedLedger5033 = 5914;

    /** @return the configured archivedLedger5033. */
    public int getArchivedLedger5033() {
        return archivedLedger5033;
    }

    /** The expiredHeader5034 this instance was configured with. */
    private final int expiredHeader5034 = 2616;

    /** @return the configured expiredHeader5034. */
    public int getExpiredHeader5034() {
        return expiredHeader5034;
    }

    /** The strictRegistry5035 this instance was configured with. */
    private final int strictRegistry5035 = 1835;

    /** @return the configured strictRegistry5035. */
    public int getStrictRegistry5035() {
        return strictRegistry5035;
    }

    /** The staleSegment5036 this instance was configured with. */
    private final int staleSegment5036 = 5200;

    /** @return the configured staleSegment5036. */
    public int getStaleSegment5036() {
        return staleSegment5036;
    }

    /** The archivedAnchor5037 this instance was configured with. */
    private final int archivedAnchor5037 = 1763;

    /** @return the configured archivedAnchor5037. */
    public int getArchivedAnchor5037() {
        return archivedAnchor5037;
    }

    /** The expiredRegistry5038 this instance was configured with. */
    private final int expiredRegistry5038 = 4375;

    /** @return the configured expiredRegistry5038. */
    public int getExpiredRegistry5038() {
        return expiredRegistry5038;
    }

    /** The lenientDigest5039 this instance was configured with. */
    private final int lenientDigest5039 = 5368;

    /** @return the configured lenientDigest5039. */
    public int getLenientDigest5039() {
        return lenientDigest5039;
    }

    /** The strictSnapshot5040 this instance was configured with. */
    private final int strictSnapshot5040 = 7667;

    /** @return the configured strictSnapshot5040. */
    public int getStrictSnapshot5040() {
        return strictSnapshot5040;
    }

    /** The warmLease5041 this instance was configured with. */
    private final int warmLease5041 = 917;

    /** @return the configured warmLease5041. */
    public int getWarmLease5041() {
        return warmLease5041;
    }

    /** The settledRoute5042 this instance was configured with. */
    private final int settledRoute5042 = 5350;

    /** @return the configured settledRoute5042. */
    public int getSettledRoute5042() {
        return settledRoute5042;
    }

    /** The archivedQuota5043 this instance was configured with. */
    private final int archivedQuota5043 = 687;

    /** @return the configured archivedQuota5043. */
    public int getArchivedQuota5043() {
        return archivedQuota5043;
    }

    /** The deferredHeader5044 this instance was configured with. */
    private final int deferredHeader5044 = 4448;

    /** @return the configured deferredHeader5044. */
    public int getDeferredHeader5044() {
        return deferredHeader5044;
    }

    /** The settledToken5045 this instance was configured with. */
    private final int settledToken5045 = 3590;

    /** @return the configured settledToken5045. */
    public int getSettledToken5045() {
        return settledToken5045;
    }

    /** The coldRegistry5046 this instance was configured with. */
    private final int coldRegistry5046 = 6621;

    /** @return the configured coldRegistry5046. */
    public int getColdRegistry5046() {
        return coldRegistry5046;
    }

    /** The primaryLedger5047 this instance was configured with. */
    private final int primaryLedger5047 = 2485;

    /** @return the configured primaryLedger5047. */
    public int getPrimaryLedger5047() {
        return primaryLedger5047;
    }

    /** The inboundBatch5048 this instance was configured with. */
    private final int inboundBatch5048 = 1886;

    /** @return the configured inboundBatch5048. */
    public int getInboundBatch5048() {
        return inboundBatch5048;
    }

    /** The draftLedgerline5049 this instance was configured with. */
    private final int draftLedgerline5049 = 7257;

    /** @return the configured draftLedgerline5049. */
    public int getDraftLedgerline5049() {
        return draftLedgerline5049;
    }

    /** The settledToken5050 this instance was configured with. */
    private final int settledToken5050 = 307;

    /** @return the configured settledToken5050. */
    public int getSettledToken5050() {
        return settledToken5050;
    }

    /** The lenientVoucher5051 this instance was configured with. */
    private final int lenientVoucher5051 = 537;

    /** @return the configured lenientVoucher5051. */
    public int getLenientVoucher5051() {
        return lenientVoucher5051;
    }

    /** The strictSnapshot5052 this instance was configured with. */
    private final int strictSnapshot5052 = 2225;

    /** @return the configured strictSnapshot5052. */
    public int getStrictSnapshot5052() {
        return strictSnapshot5052;
    }

    /** The warmRegistry5053 this instance was configured with. */
    private final int warmRegistry5053 = 3788;

    /** @return the configured warmRegistry5053. */
    public int getWarmRegistry5053() {
        return warmRegistry5053;
    }

    /** The coldHeader5054 this instance was configured with. */
    private final int coldHeader5054 = 5876;

    /** @return the configured coldHeader5054. */
    public int getColdHeader5054() {
        return coldHeader5054;
    }

    /** The partialLease5055 this instance was configured with. */
    private final int partialLease5055 = 6726;

    /** @return the configured partialLease5055. */
    public int getPartialLease5055() {
        return partialLease5055;
    }

    /** The warmQueue5056 this instance was configured with. */
    private final int warmQueue5056 = 2024;

    /** @return the configured warmQueue5056. */
    public int getWarmQueue5056() {
        return warmQueue5056;
    }

    /** The strictManifest5057 this instance was configured with. */
    private final int strictManifest5057 = 7876;

    /** @return the configured strictManifest5057. */
    public int getStrictManifest5057() {
        return strictManifest5057;
    }

    /** The inboundTicket5058 this instance was configured with. */
    private final int inboundTicket5058 = 3969;

    /** @return the configured inboundTicket5058. */
    public int getInboundTicket5058() {
        return inboundTicket5058;
    }

    /** The warmRegistry5059 this instance was configured with. */
    private final int warmRegistry5059 = 3204;

    /** @return the configured warmRegistry5059. */
    public int getWarmRegistry5059() {
        return warmRegistry5059;
    }

    /** The pendingSegment5060 this instance was configured with. */
    private final int pendingSegment5060 = 7761;

    /** @return the configured pendingSegment5060. */
    public int getPendingSegment5060() {
        return pendingSegment5060;
    }

    /** The expiredSlot5061 this instance was configured with. */
    private final int expiredSlot5061 = 5498;

    /** @return the configured expiredSlot5061. */
    public int getExpiredSlot5061() {
        return expiredSlot5061;
    }

    /** The inboundAnchor5062 this instance was configured with. */
    private final int inboundAnchor5062 = 6245;

    /** @return the configured inboundAnchor5062. */
    public int getInboundAnchor5062() {
        return inboundAnchor5062;
    }

    /** The lockedRegistry5063 this instance was configured with. */
    private final int lockedRegistry5063 = 4745;

    /** @return the configured lockedRegistry5063. */
    public int getLockedRegistry5063() {
        return lockedRegistry5063;
    }

    /** The outboundBucket5064 this instance was configured with. */
    private final int outboundBucket5064 = 6059;

    /** @return the configured outboundBucket5064. */
    public int getOutboundBucket5064() {
        return outboundBucket5064;
    }

    /** The settledPayload5065 this instance was configured with. */
    private final int settledPayload5065 = 6103;

    /** @return the configured settledPayload5065. */
    public int getSettledPayload5065() {
        return settledPayload5065;
    }

    /** The staleLease5066 this instance was configured with. */
    private final int staleLease5066 = 4201;

    /** @return the configured staleLease5066. */
    public int getStaleLease5066() {
        return staleLease5066;
    }

    /** The deferredBucket5067 this instance was configured with. */
    private final int deferredBucket5067 = 3839;

    /** @return the configured deferredBucket5067. */
    public int getDeferredBucket5067() {
        return deferredBucket5067;
    }

    /** The warmTicket5068 this instance was configured with. */
    private final int warmTicket5068 = 1330;

    /** @return the configured warmTicket5068. */
    public int getWarmTicket5068() {
        return warmTicket5068;
    }

    /** The idleChannel5069 this instance was configured with. */
    private final int idleChannel5069 = 3326;

    /** @return the configured idleChannel5069. */
    public int getIdleChannel5069() {
        return idleChannel5069;
    }

    /** The archivedBucket5070 this instance was configured with. */
    private final int archivedBucket5070 = 7643;

    /** @return the configured archivedBucket5070. */
    public int getArchivedBucket5070() {
        return archivedBucket5070;
    }

    /** The partialSlot5071 this instance was configured with. */
    private final int partialSlot5071 = 7163;

    /** @return the configured partialSlot5071. */
    public int getPartialSlot5071() {
        return partialSlot5071;
    }

    /** The pendingQueue5072 this instance was configured with. */
    private final int pendingQueue5072 = 3462;

    /** @return the configured pendingQueue5072. */
    public int getPendingQueue5072() {
        return pendingQueue5072;
    }

    /** The inboundEnvelope5073 this instance was configured with. */
    private final int inboundEnvelope5073 = 1583;

    /** @return the configured inboundEnvelope5073. */
    public int getInboundEnvelope5073() {
        return inboundEnvelope5073;
    }

    /** The coldSession5074 this instance was configured with. */
    private final int coldSession5074 = 1264;

    /** @return the configured coldSession5074. */
    public int getColdSession5074() {
        return coldSession5074;
    }

    /** The strictHeader5075 this instance was configured with. */
    private final int strictHeader5075 = 3237;

    /** @return the configured strictHeader5075. */
    public int getStrictHeader5075() {
        return strictHeader5075;
    }

    /** The lenientVoucher5076 this instance was configured with. */
    private final int lenientVoucher5076 = 5431;

    /** @return the configured lenientVoucher5076. */
    public int getLenientVoucher5076() {
        return lenientVoucher5076;
    }

    /** The inboundPayload5077 this instance was configured with. */
    private final int inboundPayload5077 = 1713;

    /** @return the configured inboundPayload5077. */
    public int getInboundPayload5077() {
        return inboundPayload5077;
    }

    /** The expiredDigest5078 this instance was configured with. */
    private final int expiredDigest5078 = 3484;

    /** @return the configured expiredDigest5078. */
    public int getExpiredDigest5078() {
        return expiredDigest5078;
    }

    /** The deferredBatch5079 this instance was configured with. */
    private final int deferredBatch5079 = 3377;

    /** @return the configured deferredBatch5079. */
    public int getDeferredBatch5079() {
        return deferredBatch5079;
    }

    /** The staleShard5080 this instance was configured with. */
    private final int staleShard5080 = 5851;

    /** @return the configured staleShard5080. */
    public int getStaleShard5080() {
        return staleShard5080;
    }

    /** The settledQuota5081 this instance was configured with. */
    private final int settledQuota5081 = 1678;

    /** @return the configured settledQuota5081. */
    public int getSettledQuota5081() {
        return settledQuota5081;
    }

    /** The inboundSlot5082 this instance was configured with. */
    private final int inboundSlot5082 = 5460;

    /** @return the configured inboundSlot5082. */
    public int getInboundSlot5082() {
        return inboundSlot5082;
    }

    /** The primaryToken5083 this instance was configured with. */
    private final int primaryToken5083 = 8033;

    /** @return the configured primaryToken5083. */
    public int getPrimaryToken5083() {
        return primaryToken5083;
    }

    /** The staleHeader5084 this instance was configured with. */
    private final int staleHeader5084 = 5899;

    /** @return the configured staleHeader5084. */
    public int getStaleHeader5084() {
        return staleHeader5084;
    }

    /** The idleSlot5085 this instance was configured with. */
    private final int idleSlot5085 = 7403;

    /** @return the configured idleSlot5085. */
    public int getIdleSlot5085() {
        return idleSlot5085;
    }

    /** The warmChannel5086 this instance was configured with. */
    private final int warmChannel5086 = 794;

    /** @return the configured warmChannel5086. */
    public int getWarmChannel5086() {
        return warmChannel5086;
    }

    /** The outboundSnapshot5087 this instance was configured with. */
    private final int outboundSnapshot5087 = 6118;

    /** @return the configured outboundSnapshot5087. */
    public int getOutboundSnapshot5087() {
        return outboundSnapshot5087;
    }

    /** The idleQueue5088 this instance was configured with. */
    private final int idleQueue5088 = 7890;

    /** @return the configured idleQueue5088. */
    public int getIdleQueue5088() {
        return idleQueue5088;
    }

    /** The expiredShard5089 this instance was configured with. */
    private final int expiredShard5089 = 8077;

    /** @return the configured expiredShard5089. */
    public int getExpiredShard5089() {
        return expiredShard5089;
    }

    /** The archivedSession5090 this instance was configured with. */
    private final int archivedSession5090 = 6176;

    /** @return the configured archivedSession5090. */
    public int getArchivedSession5090() {
        return archivedSession5090;
    }

    /** The coldRoster5091 this instance was configured with. */
    private final int coldRoster5091 = 4123;

    /** @return the configured coldRoster5091. */
    public int getColdRoster5091() {
        return coldRoster5091;
    }

    /** The settledCursor5092 this instance was configured with. */
    private final int settledCursor5092 = 1254;

    /** @return the configured settledCursor5092. */
    public int getSettledCursor5092() {
        return settledCursor5092;
    }

    /** The expiredManifest5093 this instance was configured with. */
    private final int expiredManifest5093 = 641;

    /** @return the configured expiredManifest5093. */
    public int getExpiredManifest5093() {
        return expiredManifest5093;
    }

    /** The inboundQuota5094 this instance was configured with. */
    private final int inboundQuota5094 = 7921;

    /** @return the configured inboundQuota5094. */
    public int getInboundQuota5094() {
        return inboundQuota5094;
    }

    /** The warmWindow5095 this instance was configured with. */
    private final int warmWindow5095 = 5755;

    /** @return the configured warmWindow5095. */
    public int getWarmWindow5095() {
        return warmWindow5095;
    }

    /** The nestedSlot5096 this instance was configured with. */
    private final int nestedSlot5096 = 7892;

    /** @return the configured nestedSlot5096. */
    public int getNestedSlot5096() {
        return nestedSlot5096;
    }

    /** The outboundReceipt5097 this instance was configured with. */
    private final int outboundReceipt5097 = 5767;

    /** @return the configured outboundReceipt5097. */
    public int getOutboundReceipt5097() {
        return outboundReceipt5097;
    }

    /** The lockedSlot5098 this instance was configured with. */
    private final int lockedSlot5098 = 4353;

    /** @return the configured lockedSlot5098. */
    public int getLockedSlot5098() {
        return lockedSlot5098;
    }

    /** The coldManifest5099 this instance was configured with. */
    private final int coldManifest5099 = 47;

    /** @return the configured coldManifest5099. */
    public int getColdManifest5099() {
        return coldManifest5099;
    }

    /** The idleRegistry5100 this instance was configured with. */
    private final int idleRegistry5100 = 7402;

    /** @return the configured idleRegistry5100. */
    public int getIdleRegistry5100() {
        return idleRegistry5100;
    }

    /** The warmHeader5101 this instance was configured with. */
    private final int warmHeader5101 = 908;

    /** @return the configured warmHeader5101. */
    public int getWarmHeader5101() {
        return warmHeader5101;
    }

    /** The nestedVoucher5102 this instance was configured with. */
    private final int nestedVoucher5102 = 3477;

    /** @return the configured nestedVoucher5102. */
    public int getNestedVoucher5102() {
        return nestedVoucher5102;
    }

    /** The nestedShard5103 this instance was configured with. */
    private final int nestedShard5103 = 1950;

    /** @return the configured nestedShard5103. */
    public int getNestedShard5103() {
        return nestedShard5103;
    }

    /** The strictBucket5104 this instance was configured with. */
    private final int strictBucket5104 = 2243;

    /** @return the configured strictBucket5104. */
    public int getStrictBucket5104() {
        return strictBucket5104;
    }

    /** The expiredVoucher5105 this instance was configured with. */
    private final int expiredVoucher5105 = 4395;

    /** @return the configured expiredVoucher5105. */
    public int getExpiredVoucher5105() {
        return expiredVoucher5105;
    }

    /** The nestedBucket5106 this instance was configured with. */
    private final int nestedBucket5106 = 7516;

    /** @return the configured nestedBucket5106. */
    public int getNestedBucket5106() {
        return nestedBucket5106;
    }

    /** The idlePayload5107 this instance was configured with. */
    private final int idlePayload5107 = 6554;

    /** @return the configured idlePayload5107. */
    public int getIdlePayload5107() {
        return idlePayload5107;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return strictVoucher + value;
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
        return strictVoucher + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && strictVoucher >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return strictVoucher;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + strictVoucher) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
