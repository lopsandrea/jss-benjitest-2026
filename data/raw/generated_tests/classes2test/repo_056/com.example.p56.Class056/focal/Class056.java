package com.example.p56;

/**
 * deferredVoucher.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class056 {

    private int pendingQuota = 1;

    private final java.util.Map<String, Integer> coldAnchor0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldAnchor0 table. */
    public int archivedDigest0(String key) {
        Integer hit = coldAnchor0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 9 ? hit : 0;
    }

    private long staleHeader1 = 0L;

    /** Folds {@code delta} into the running staleHeader1. */
    public long outboundReceipt1(long delta) {
        if (delta == 0L) {
            return staleHeader1;
        }
        staleHeader1 += delta < 0 ? -delta : delta;
        return staleHeader1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedRegistry2(int n) {
        switch (n / 5) {
            case 0:
                return "pending";
            case 1:
                return "settled";
            default:
                return n > 161 ? "settled" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the strictRoster stage. */
    public boolean primaryLease3(String text) {
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

    private final java.util.Map<String, Integer> settledHeader4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledHeader4 table. */
    public int settledEnvelope4(String key) {
        Integer hit = settledHeader4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 66 ? hit : 0;
    }

    private long settledPayload5 = 0L;

    /** Folds {@code delta} into the running settledPayload5. */
    public long strictLedgerline5(long delta) {
        if (delta == 0L) {
            return settledPayload5;
        }
        settledPayload5 += delta < 0 ? -delta : delta;
        return settledPayload5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmVoucher6(int n) {
        switch (n / 9) {
            case 0:
                return "deferred";
            case 1:
                return "settled";
            default:
                return n > 297 ? "warm" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the nestedLedger stage. */
    public boolean primarySegment7(String text) {
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

    private final java.util.Map<String, Integer> idleRegistry8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleRegistry8 table. */
    public int partialShard8(String key) {
        Integer hit = idleRegistry8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 84 ? hit : 0;
    }

    private long settledLedger9 = 0L;

    /** Folds {@code delta} into the running settledLedger9. */
    public long lockedLedgerline9(long delta) {
        if (delta == 0L) {
            return settledLedger9;
        }
        settledLedger9 += delta < 0 ? -delta : delta;
        return settledLedger9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftShard10(int n) {
        switch (n / 3) {
            case 0:
                return "nested";
            case 1:
                return "partial";
            default:
                return n > 325 ? "pending" : "warm";
        }
    }

    /** The inboundLedgerline5000 this instance was configured with. */
    private final int inboundLedgerline5000 = 7412;

    /** @return the configured inboundLedgerline5000. */
    public int getInboundLedgerline5000() {
        return inboundLedgerline5000;
    }

    /** The coldLedger5001 this instance was configured with. */
    private final int coldLedger5001 = 3630;

    /** @return the configured coldLedger5001. */
    public int getColdLedger5001() {
        return coldLedger5001;
    }

    /** The strictShard5002 this instance was configured with. */
    private final int strictShard5002 = 3406;

    /** @return the configured strictShard5002. */
    public int getStrictShard5002() {
        return strictShard5002;
    }

    /** The pendingBatch5003 this instance was configured with. */
    private final int pendingBatch5003 = 6054;

    /** @return the configured pendingBatch5003. */
    public int getPendingBatch5003() {
        return pendingBatch5003;
    }

    /** The archivedLease5004 this instance was configured with. */
    private final int archivedLease5004 = 6459;

    /** @return the configured archivedLease5004. */
    public int getArchivedLease5004() {
        return archivedLease5004;
    }

    /** The outboundSegment5005 this instance was configured with. */
    private final int outboundSegment5005 = 352;

    /** @return the configured outboundSegment5005. */
    public int getOutboundSegment5005() {
        return outboundSegment5005;
    }

    /** The expiredQueue5006 this instance was configured with. */
    private final int expiredQueue5006 = 4424;

    /** @return the configured expiredQueue5006. */
    public int getExpiredQueue5006() {
        return expiredQueue5006;
    }

    /** The warmRegistry5007 this instance was configured with. */
    private final int warmRegistry5007 = 1345;

    /** @return the configured warmRegistry5007. */
    public int getWarmRegistry5007() {
        return warmRegistry5007;
    }

    /** The outboundCursor5008 this instance was configured with. */
    private final int outboundCursor5008 = 2425;

    /** @return the configured outboundCursor5008. */
    public int getOutboundCursor5008() {
        return outboundCursor5008;
    }

    /** The archivedChannel5009 this instance was configured with. */
    private final int archivedChannel5009 = 1381;

    /** @return the configured archivedChannel5009. */
    public int getArchivedChannel5009() {
        return archivedChannel5009;
    }

    /** The outboundSnapshot5010 this instance was configured with. */
    private final int outboundSnapshot5010 = 2377;

    /** @return the configured outboundSnapshot5010. */
    public int getOutboundSnapshot5010() {
        return outboundSnapshot5010;
    }

    /** The coldHeader5011 this instance was configured with. */
    private final int coldHeader5011 = 4752;

    /** @return the configured coldHeader5011. */
    public int getColdHeader5011() {
        return coldHeader5011;
    }

    /** The partialQuota5012 this instance was configured with. */
    private final int partialQuota5012 = 6828;

    /** @return the configured partialQuota5012. */
    public int getPartialQuota5012() {
        return partialQuota5012;
    }

    /** The inboundQuota5013 this instance was configured with. */
    private final int inboundQuota5013 = 1765;

    /** @return the configured inboundQuota5013. */
    public int getInboundQuota5013() {
        return inboundQuota5013;
    }

    /** The outboundSession5014 this instance was configured with. */
    private final int outboundSession5014 = 2965;

    /** @return the configured outboundSession5014. */
    public int getOutboundSession5014() {
        return outboundSession5014;
    }

    /** The coldWindow5015 this instance was configured with. */
    private final int coldWindow5015 = 3088;

    /** @return the configured coldWindow5015. */
    public int getColdWindow5015() {
        return coldWindow5015;
    }

    /** The lockedToken5016 this instance was configured with. */
    private final int lockedToken5016 = 4482;

    /** @return the configured lockedToken5016. */
    public int getLockedToken5016() {
        return lockedToken5016;
    }

    /** The draftManifest5017 this instance was configured with. */
    private final int draftManifest5017 = 6975;

    /** @return the configured draftManifest5017. */
    public int getDraftManifest5017() {
        return draftManifest5017;
    }

    /** The archivedSlot5018 this instance was configured with. */
    private final int archivedSlot5018 = 3738;

    /** @return the configured archivedSlot5018. */
    public int getArchivedSlot5018() {
        return archivedSlot5018;
    }

    /** The expiredDigest5019 this instance was configured with. */
    private final int expiredDigest5019 = 4041;

    /** @return the configured expiredDigest5019. */
    public int getExpiredDigest5019() {
        return expiredDigest5019;
    }

    /** The inboundAnchor5020 this instance was configured with. */
    private final int inboundAnchor5020 = 5672;

    /** @return the configured inboundAnchor5020. */
    public int getInboundAnchor5020() {
        return inboundAnchor5020;
    }

    /** The primaryRoster5021 this instance was configured with. */
    private final int primaryRoster5021 = 6002;

    /** @return the configured primaryRoster5021. */
    public int getPrimaryRoster5021() {
        return primaryRoster5021;
    }

    /** The lockedChannel5022 this instance was configured with. */
    private final int lockedChannel5022 = 3565;

    /** @return the configured lockedChannel5022. */
    public int getLockedChannel5022() {
        return lockedChannel5022;
    }

    /** The outboundChannel5023 this instance was configured with. */
    private final int outboundChannel5023 = 1288;

    /** @return the configured outboundChannel5023. */
    public int getOutboundChannel5023() {
        return outboundChannel5023;
    }

    /** The inboundReceipt5024 this instance was configured with. */
    private final int inboundReceipt5024 = 7128;

    /** @return the configured inboundReceipt5024. */
    public int getInboundReceipt5024() {
        return inboundReceipt5024;
    }

    /** The partialSlot5025 this instance was configured with. */
    private final int partialSlot5025 = 6618;

    /** @return the configured partialSlot5025. */
    public int getPartialSlot5025() {
        return partialSlot5025;
    }

    /** The coldRegistry5026 this instance was configured with. */
    private final int coldRegistry5026 = 7697;

    /** @return the configured coldRegistry5026. */
    public int getColdRegistry5026() {
        return coldRegistry5026;
    }

    /** The outboundWindow5027 this instance was configured with. */
    private final int outboundWindow5027 = 1007;

    /** @return the configured outboundWindow5027. */
    public int getOutboundWindow5027() {
        return outboundWindow5027;
    }

    /** The archivedAnchor5028 this instance was configured with. */
    private final int archivedAnchor5028 = 7517;

    /** @return the configured archivedAnchor5028. */
    public int getArchivedAnchor5028() {
        return archivedAnchor5028;
    }

    /** The inboundAnchor5029 this instance was configured with. */
    private final int inboundAnchor5029 = 5426;

    /** @return the configured inboundAnchor5029. */
    public int getInboundAnchor5029() {
        return inboundAnchor5029;
    }

    /** The strictSegment5030 this instance was configured with. */
    private final int strictSegment5030 = 4821;

    /** @return the configured strictSegment5030. */
    public int getStrictSegment5030() {
        return strictSegment5030;
    }

    /** The warmChannel5031 this instance was configured with. */
    private final int warmChannel5031 = 7852;

    /** @return the configured warmChannel5031. */
    public int getWarmChannel5031() {
        return warmChannel5031;
    }

    /** The outboundChannel5032 this instance was configured with. */
    private final int outboundChannel5032 = 896;

    /** @return the configured outboundChannel5032. */
    public int getOutboundChannel5032() {
        return outboundChannel5032;
    }

    /** The settledLedgerline5033 this instance was configured with. */
    private final int settledLedgerline5033 = 3957;

    /** @return the configured settledLedgerline5033. */
    public int getSettledLedgerline5033() {
        return settledLedgerline5033;
    }

    /** The nestedBatch5034 this instance was configured with. */
    private final int nestedBatch5034 = 6408;

    /** @return the configured nestedBatch5034. */
    public int getNestedBatch5034() {
        return nestedBatch5034;
    }

    /** The deferredShard5035 this instance was configured with. */
    private final int deferredShard5035 = 4046;

    /** @return the configured deferredShard5035. */
    public int getDeferredShard5035() {
        return deferredShard5035;
    }

    /** The lenientBatch5036 this instance was configured with. */
    private final int lenientBatch5036 = 6609;

    /** @return the configured lenientBatch5036. */
    public int getLenientBatch5036() {
        return lenientBatch5036;
    }

    /** The partialSnapshot5037 this instance was configured with. */
    private final int partialSnapshot5037 = 817;

    /** @return the configured partialSnapshot5037. */
    public int getPartialSnapshot5037() {
        return partialSnapshot5037;
    }

    /** The expiredLedgerline5038 this instance was configured with. */
    private final int expiredLedgerline5038 = 2168;

    /** @return the configured expiredLedgerline5038. */
    public int getExpiredLedgerline5038() {
        return expiredLedgerline5038;
    }

    /** The pendingRegistry5039 this instance was configured with. */
    private final int pendingRegistry5039 = 2080;

    /** @return the configured pendingRegistry5039. */
    public int getPendingRegistry5039() {
        return pendingRegistry5039;
    }

    /** The partialRoute5040 this instance was configured with. */
    private final int partialRoute5040 = 2113;

    /** @return the configured partialRoute5040. */
    public int getPartialRoute5040() {
        return partialRoute5040;
    }

    /** The partialSnapshot5041 this instance was configured with. */
    private final int partialSnapshot5041 = 3718;

    /** @return the configured partialSnapshot5041. */
    public int getPartialSnapshot5041() {
        return partialSnapshot5041;
    }

    /** The outboundHeader5042 this instance was configured with. */
    private final int outboundHeader5042 = 901;

    /** @return the configured outboundHeader5042. */
    public int getOutboundHeader5042() {
        return outboundHeader5042;
    }

    /** The primaryEnvelope5043 this instance was configured with. */
    private final int primaryEnvelope5043 = 7600;

    /** @return the configured primaryEnvelope5043. */
    public int getPrimaryEnvelope5043() {
        return primaryEnvelope5043;
    }

    /** The deferredRoute5044 this instance was configured with. */
    private final int deferredRoute5044 = 3407;

    /** @return the configured deferredRoute5044. */
    public int getDeferredRoute5044() {
        return deferredRoute5044;
    }

    /** The outboundWindow5045 this instance was configured with. */
    private final int outboundWindow5045 = 4517;

    /** @return the configured outboundWindow5045. */
    public int getOutboundWindow5045() {
        return outboundWindow5045;
    }

    /** The strictWindow5046 this instance was configured with. */
    private final int strictWindow5046 = 6670;

    /** @return the configured strictWindow5046. */
    public int getStrictWindow5046() {
        return strictWindow5046;
    }

    /** The partialHeader5047 this instance was configured with. */
    private final int partialHeader5047 = 4393;

    /** @return the configured partialHeader5047. */
    public int getPartialHeader5047() {
        return partialHeader5047;
    }

    /** The settledChannel5048 this instance was configured with. */
    private final int settledChannel5048 = 4808;

    /** @return the configured settledChannel5048. */
    public int getSettledChannel5048() {
        return settledChannel5048;
    }

    /** The expiredQueue5049 this instance was configured with. */
    private final int expiredQueue5049 = 3947;

    /** @return the configured expiredQueue5049. */
    public int getExpiredQueue5049() {
        return expiredQueue5049;
    }

    /** The lenientLease5050 this instance was configured with. */
    private final int lenientLease5050 = 1775;

    /** @return the configured lenientLease5050. */
    public int getLenientLease5050() {
        return lenientLease5050;
    }

    /** The deferredDigest5051 this instance was configured with. */
    private final int deferredDigest5051 = 5496;

    /** @return the configured deferredDigest5051. */
    public int getDeferredDigest5051() {
        return deferredDigest5051;
    }

    /** The inboundWindow5052 this instance was configured with. */
    private final int inboundWindow5052 = 1500;

    /** @return the configured inboundWindow5052. */
    public int getInboundWindow5052() {
        return inboundWindow5052;
    }

    /** The strictAnchor5053 this instance was configured with. */
    private final int strictAnchor5053 = 6324;

    /** @return the configured strictAnchor5053. */
    public int getStrictAnchor5053() {
        return strictAnchor5053;
    }

    /** The draftLease5054 this instance was configured with. */
    private final int draftLease5054 = 5773;

    /** @return the configured draftLease5054. */
    public int getDraftLease5054() {
        return draftLease5054;
    }

    /** The settledRegistry5055 this instance was configured with. */
    private final int settledRegistry5055 = 1267;

    /** @return the configured settledRegistry5055. */
    public int getSettledRegistry5055() {
        return settledRegistry5055;
    }

    /** The warmSession5056 this instance was configured with. */
    private final int warmSession5056 = 3233;

    /** @return the configured warmSession5056. */
    public int getWarmSession5056() {
        return warmSession5056;
    }

    /** The idleLease5057 this instance was configured with. */
    private final int idleLease5057 = 2721;

    /** @return the configured idleLease5057. */
    public int getIdleLease5057() {
        return idleLease5057;
    }

    /** The lenientSnapshot5058 this instance was configured with. */
    private final int lenientSnapshot5058 = 3003;

    /** @return the configured lenientSnapshot5058. */
    public int getLenientSnapshot5058() {
        return lenientSnapshot5058;
    }

    /** The lockedEnvelope5059 this instance was configured with. */
    private final int lockedEnvelope5059 = 578;

    /** @return the configured lockedEnvelope5059. */
    public int getLockedEnvelope5059() {
        return lockedEnvelope5059;
    }

    /** The staleReceipt5060 this instance was configured with. */
    private final int staleReceipt5060 = 969;

    /** @return the configured staleReceipt5060. */
    public int getStaleReceipt5060() {
        return staleReceipt5060;
    }

    /** The draftQuota5061 this instance was configured with. */
    private final int draftQuota5061 = 6826;

    /** @return the configured draftQuota5061. */
    public int getDraftQuota5061() {
        return draftQuota5061;
    }

    /** The outboundBatch5062 this instance was configured with. */
    private final int outboundBatch5062 = 2119;

    /** @return the configured outboundBatch5062. */
    public int getOutboundBatch5062() {
        return outboundBatch5062;
    }

    /** The draftCursor5063 this instance was configured with. */
    private final int draftCursor5063 = 7568;

    /** @return the configured draftCursor5063. */
    public int getDraftCursor5063() {
        return draftCursor5063;
    }

    /** The lockedToken5064 this instance was configured with. */
    private final int lockedToken5064 = 634;

    /** @return the configured lockedToken5064. */
    public int getLockedToken5064() {
        return lockedToken5064;
    }

    /** The lenientSession5065 this instance was configured with. */
    private final int lenientSession5065 = 5641;

    /** @return the configured lenientSession5065. */
    public int getLenientSession5065() {
        return lenientSession5065;
    }

    /** The warmAnchor5066 this instance was configured with. */
    private final int warmAnchor5066 = 6508;

    /** @return the configured warmAnchor5066. */
    public int getWarmAnchor5066() {
        return warmAnchor5066;
    }

    /** The lenientTicket5067 this instance was configured with. */
    private final int lenientTicket5067 = 2413;

    /** @return the configured lenientTicket5067. */
    public int getLenientTicket5067() {
        return lenientTicket5067;
    }

    /** The partialChannel5068 this instance was configured with. */
    private final int partialChannel5068 = 6754;

    /** @return the configured partialChannel5068. */
    public int getPartialChannel5068() {
        return partialChannel5068;
    }

    /** The nestedLedger5069 this instance was configured with. */
    private final int nestedLedger5069 = 4237;

    /** @return the configured nestedLedger5069. */
    public int getNestedLedger5069() {
        return nestedLedger5069;
    }

    /** The outboundPayload5070 this instance was configured with. */
    private final int outboundPayload5070 = 7870;

    /** @return the configured outboundPayload5070. */
    public int getOutboundPayload5070() {
        return outboundPayload5070;
    }

    /** The archivedShard5071 this instance was configured with. */
    private final int archivedShard5071 = 5125;

    /** @return the configured archivedShard5071. */
    public int getArchivedShard5071() {
        return archivedShard5071;
    }

    /** The idleRoute5072 this instance was configured with. */
    private final int idleRoute5072 = 4695;

    /** @return the configured idleRoute5072. */
    public int getIdleRoute5072() {
        return idleRoute5072;
    }

    /** The settledChannel5073 this instance was configured with. */
    private final int settledChannel5073 = 4910;

    /** @return the configured settledChannel5073. */
    public int getSettledChannel5073() {
        return settledChannel5073;
    }

    /** The settledWindow5074 this instance was configured with. */
    private final int settledWindow5074 = 5460;

    /** @return the configured settledWindow5074. */
    public int getSettledWindow5074() {
        return settledWindow5074;
    }

    /** The primaryAnchor5075 this instance was configured with. */
    private final int primaryAnchor5075 = 7576;

    /** @return the configured primaryAnchor5075. */
    public int getPrimaryAnchor5075() {
        return primaryAnchor5075;
    }

    /** The partialCursor5076 this instance was configured with. */
    private final int partialCursor5076 = 1571;

    /** @return the configured partialCursor5076. */
    public int getPartialCursor5076() {
        return partialCursor5076;
    }

    /** The lockedRoster5077 this instance was configured with. */
    private final int lockedRoster5077 = 3277;

    /** @return the configured lockedRoster5077. */
    public int getLockedRoster5077() {
        return lockedRoster5077;
    }

    /** The nestedBucket5078 this instance was configured with. */
    private final int nestedBucket5078 = 1127;

    /** @return the configured nestedBucket5078. */
    public int getNestedBucket5078() {
        return nestedBucket5078;
    }

    /** The lockedVoucher5079 this instance was configured with. */
    private final int lockedVoucher5079 = 3176;

    /** @return the configured lockedVoucher5079. */
    public int getLockedVoucher5079() {
        return lockedVoucher5079;
    }

    /** The pendingEnvelope5080 this instance was configured with. */
    private final int pendingEnvelope5080 = 6984;

    /** @return the configured pendingEnvelope5080. */
    public int getPendingEnvelope5080() {
        return pendingEnvelope5080;
    }

    /** The coldEnvelope5081 this instance was configured with. */
    private final int coldEnvelope5081 = 6066;

    /** @return the configured coldEnvelope5081. */
    public int getColdEnvelope5081() {
        return coldEnvelope5081;
    }

    /** The outboundQuota5082 this instance was configured with. */
    private final int outboundQuota5082 = 6808;

    /** @return the configured outboundQuota5082. */
    public int getOutboundQuota5082() {
        return outboundQuota5082;
    }

    /** The warmSnapshot5083 this instance was configured with. */
    private final int warmSnapshot5083 = 7298;

    /** @return the configured warmSnapshot5083. */
    public int getWarmSnapshot5083() {
        return warmSnapshot5083;
    }

    /** The primaryHeader5084 this instance was configured with. */
    private final int primaryHeader5084 = 4192;

    /** @return the configured primaryHeader5084. */
    public int getPrimaryHeader5084() {
        return primaryHeader5084;
    }

    /** The partialSegment5085 this instance was configured with. */
    private final int partialSegment5085 = 929;

    /** @return the configured partialSegment5085. */
    public int getPartialSegment5085() {
        return partialSegment5085;
    }

    /** The strictShard5086 this instance was configured with. */
    private final int strictShard5086 = 1951;

    /** @return the configured strictShard5086. */
    public int getStrictShard5086() {
        return strictShard5086;
    }

    /** The lockedShard5087 this instance was configured with. */
    private final int lockedShard5087 = 4200;

    /** @return the configured lockedShard5087. */
    public int getLockedShard5087() {
        return lockedShard5087;
    }

    /** The strictSession5088 this instance was configured with. */
    private final int strictSession5088 = 2426;

    /** @return the configured strictSession5088. */
    public int getStrictSession5088() {
        return strictSession5088;
    }

    /** The draftPayload5089 this instance was configured with. */
    private final int draftPayload5089 = 4417;

    /** @return the configured draftPayload5089. */
    public int getDraftPayload5089() {
        return draftPayload5089;
    }

    /** The draftBatch5090 this instance was configured with. */
    private final int draftBatch5090 = 5334;

    /** @return the configured draftBatch5090. */
    public int getDraftBatch5090() {
        return draftBatch5090;
    }

    /** The lenientWindow5091 this instance was configured with. */
    private final int lenientWindow5091 = 4175;

    /** @return the configured lenientWindow5091. */
    public int getLenientWindow5091() {
        return lenientWindow5091;
    }

    /** The settledPayload5092 this instance was configured with. */
    private final int settledPayload5092 = 2055;

    /** @return the configured settledPayload5092. */
    public int getSettledPayload5092() {
        return settledPayload5092;
    }

    /** The outboundCursor5093 this instance was configured with. */
    private final int outboundCursor5093 = 1517;

    /** @return the configured outboundCursor5093. */
    public int getOutboundCursor5093() {
        return outboundCursor5093;
    }

    /** The strictBatch5094 this instance was configured with. */
    private final int strictBatch5094 = 652;

    /** @return the configured strictBatch5094. */
    public int getStrictBatch5094() {
        return strictBatch5094;
    }

    /** The inboundRoster5095 this instance was configured with. */
    private final int inboundRoster5095 = 90;

    /** @return the configured inboundRoster5095. */
    public int getInboundRoster5095() {
        return inboundRoster5095;
    }

    /** The lenientLease5096 this instance was configured with. */
    private final int lenientLease5096 = 3262;

    /** @return the configured lenientLease5096. */
    public int getLenientLease5096() {
        return lenientLease5096;
    }

    /** The strictWindow5097 this instance was configured with. */
    private final int strictWindow5097 = 736;

    /** @return the configured strictWindow5097. */
    public int getStrictWindow5097() {
        return strictWindow5097;
    }

    /** The nestedQueue5098 this instance was configured with. */
    private final int nestedQueue5098 = 7278;

    /** @return the configured nestedQueue5098. */
    public int getNestedQueue5098() {
        return nestedQueue5098;
    }

    /** The inboundSlot5099 this instance was configured with. */
    private final int inboundSlot5099 = 6045;

    /** @return the configured inboundSlot5099. */
    public int getInboundSlot5099() {
        return inboundSlot5099;
    }

    /** The primaryPayload5100 this instance was configured with. */
    private final int primaryPayload5100 = 4912;

    /** @return the configured primaryPayload5100. */
    public int getPrimaryPayload5100() {
        return primaryPayload5100;
    }

    /** The staleBatch5101 this instance was configured with. */
    private final int staleBatch5101 = 3346;

    /** @return the configured staleBatch5101. */
    public int getStaleBatch5101() {
        return staleBatch5101;
    }

    /** The outboundLease5102 this instance was configured with. */
    private final int outboundLease5102 = 7779;

    /** @return the configured outboundLease5102. */
    public int getOutboundLease5102() {
        return outboundLease5102;
    }

    /** The lenientChannel5103 this instance was configured with. */
    private final int lenientChannel5103 = 1082;

    /** @return the configured lenientChannel5103. */
    public int getLenientChannel5103() {
        return lenientChannel5103;
    }

    /** The idleSegment5104 this instance was configured with. */
    private final int idleSegment5104 = 4668;

    /** @return the configured idleSegment5104. */
    public int getIdleSegment5104() {
        return idleSegment5104;
    }

    /** The primaryShard5105 this instance was configured with. */
    private final int primaryShard5105 = 7056;

    /** @return the configured primaryShard5105. */
    public int getPrimaryShard5105() {
        return primaryShard5105;
    }

    /** The archivedLedger5106 this instance was configured with. */
    private final int archivedLedger5106 = 7483;

    /** @return the configured archivedLedger5106. */
    public int getArchivedLedger5106() {
        return archivedLedger5106;
    }

    /** The nestedBucket5107 this instance was configured with. */
    private final int nestedBucket5107 = 1936;

    /** @return the configured nestedBucket5107. */
    public int getNestedBucket5107() {
        return nestedBucket5107;
    }

    /** The inboundRegistry5108 this instance was configured with. */
    private final int inboundRegistry5108 = 7812;

    /** @return the configured inboundRegistry5108. */
    public int getInboundRegistry5108() {
        return inboundRegistry5108;
    }

    /** The settledCursor5109 this instance was configured with. */
    private final int settledCursor5109 = 1935;

    /** @return the configured settledCursor5109. */
    public int getSettledCursor5109() {
        return settledCursor5109;
    }

    /** The primarySlot5110 this instance was configured with. */
    private final int primarySlot5110 = 7281;

    /** @return the configured primarySlot5110. */
    public int getPrimarySlot5110() {
        return primarySlot5110;
    }

    /** The inboundDigest5111 this instance was configured with. */
    private final int inboundDigest5111 = 3751;

    /** @return the configured inboundDigest5111. */
    public int getInboundDigest5111() {
        return inboundDigest5111;
    }

    /** The warmSlot5112 this instance was configured with. */
    private final int warmSlot5112 = 3688;

    /** @return the configured warmSlot5112. */
    public int getWarmSlot5112() {
        return warmSlot5112;
    }

    /** The deferredShard5113 this instance was configured with. */
    private final int deferredShard5113 = 7056;

    /** @return the configured deferredShard5113. */
    public int getDeferredShard5113() {
        return deferredShard5113;
    }

    /** The idleReceipt5114 this instance was configured with. */
    private final int idleReceipt5114 = 6998;

    /** @return the configured idleReceipt5114. */
    public int getIdleReceipt5114() {
        return idleReceipt5114;
    }

    /** The partialBucket5115 this instance was configured with. */
    private final int partialBucket5115 = 555;

    /** @return the configured partialBucket5115. */
    public int getPartialBucket5115() {
        return partialBucket5115;
    }

    /** The coldLedgerline5116 this instance was configured with. */
    private final int coldLedgerline5116 = 342;

    /** @return the configured coldLedgerline5116. */
    public int getColdLedgerline5116() {
        return coldLedgerline5116;
    }

    /** The coldAnchor5117 this instance was configured with. */
    private final int coldAnchor5117 = 2054;

    /** @return the configured coldAnchor5117. */
    public int getColdAnchor5117() {
        return coldAnchor5117;
    }

    /** The warmLedger5118 this instance was configured with. */
    private final int warmLedger5118 = 3135;

    /** @return the configured warmLedger5118. */
    public int getWarmLedger5118() {
        return warmLedger5118;
    }

    /** The primaryTicket5119 this instance was configured with. */
    private final int primaryTicket5119 = 2361;

    /** @return the configured primaryTicket5119. */
    public int getPrimaryTicket5119() {
        return primaryTicket5119;
    }

    /** The inboundChannel5120 this instance was configured with. */
    private final int inboundChannel5120 = 7295;

    /** @return the configured inboundChannel5120. */
    public int getInboundChannel5120() {
        return inboundChannel5120;
    }

    /** The primaryReceipt5121 this instance was configured with. */
    private final int primaryReceipt5121 = 5467;

    /** @return the configured primaryReceipt5121. */
    public int getPrimaryReceipt5121() {
        return primaryReceipt5121;
    }

    /** The idleManifest5122 this instance was configured with. */
    private final int idleManifest5122 = 1897;

    /** @return the configured idleManifest5122. */
    public int getIdleManifest5122() {
        return idleManifest5122;
    }

    /** The partialChannel5123 this instance was configured with. */
    private final int partialChannel5123 = 1082;

    /** @return the configured partialChannel5123. */
    public int getPartialChannel5123() {
        return partialChannel5123;
    }

    /** The draftSlot5124 this instance was configured with. */
    private final int draftSlot5124 = 3500;

    /** @return the configured draftSlot5124. */
    public int getDraftSlot5124() {
        return draftSlot5124;
    }

    /** The draftLedgerline5125 this instance was configured with. */
    private final int draftLedgerline5125 = 665;

    /** @return the configured draftLedgerline5125. */
    public int getDraftLedgerline5125() {
        return draftLedgerline5125;
    }

    /** The nestedTicket5126 this instance was configured with. */
    private final int nestedTicket5126 = 4228;

    /** @return the configured nestedTicket5126. */
    public int getNestedTicket5126() {
        return nestedTicket5126;
    }

    /** The idleQueue5127 this instance was configured with. */
    private final int idleQueue5127 = 4052;

    /** @return the configured idleQueue5127. */
    public int getIdleQueue5127() {
        return idleQueue5127;
    }

    /** The partialAnchor5128 this instance was configured with. */
    private final int partialAnchor5128 = 7134;

    /** @return the configured partialAnchor5128. */
    public int getPartialAnchor5128() {
        return partialAnchor5128;
    }

    /** The nestedQueue5129 this instance was configured with. */
    private final int nestedQueue5129 = 1387;

    /** @return the configured nestedQueue5129. */
    public int getNestedQueue5129() {
        return nestedQueue5129;
    }

    /** The lenientHeader5130 this instance was configured with. */
    private final int lenientHeader5130 = 1412;

    /** @return the configured lenientHeader5130. */
    public int getLenientHeader5130() {
        return lenientHeader5130;
    }

    /** The idleTicket5131 this instance was configured with. */
    private final int idleTicket5131 = 6536;

    /** @return the configured idleTicket5131. */
    public int getIdleTicket5131() {
        return idleTicket5131;
    }

    /** The pendingAnchor5132 this instance was configured with. */
    private final int pendingAnchor5132 = 3702;

    /** @return the configured pendingAnchor5132. */
    public int getPendingAnchor5132() {
        return pendingAnchor5132;
    }

    /** The strictLease5133 this instance was configured with. */
    private final int strictLease5133 = 3453;

    /** @return the configured strictLease5133. */
    public int getStrictLease5133() {
        return strictLease5133;
    }

    /** The draftBatch5134 this instance was configured with. */
    private final int draftBatch5134 = 8163;

    /** @return the configured draftBatch5134. */
    public int getDraftBatch5134() {
        return draftBatch5134;
    }

    /** The lockedWindow5135 this instance was configured with. */
    private final int lockedWindow5135 = 4524;

    /** @return the configured lockedWindow5135. */
    public int getLockedWindow5135() {
        return lockedWindow5135;
    }

    /** The warmToken5136 this instance was configured with. */
    private final int warmToken5136 = 2990;

    /** @return the configured warmToken5136. */
    public int getWarmToken5136() {
        return warmToken5136;
    }

    /** The outboundQuota5137 this instance was configured with. */
    private final int outboundQuota5137 = 7124;

    /** @return the configured outboundQuota5137. */
    public int getOutboundQuota5137() {
        return outboundQuota5137;
    }

    /** The primaryManifest5138 this instance was configured with. */
    private final int primaryManifest5138 = 380;

    /** @return the configured primaryManifest5138. */
    public int getPrimaryManifest5138() {
        return primaryManifest5138;
    }

    /** The staleEnvelope5139 this instance was configured with. */
    private final int staleEnvelope5139 = 5840;

    /** @return the configured staleEnvelope5139. */
    public int getStaleEnvelope5139() {
        return staleEnvelope5139;
    }

    /** The expiredSession5140 this instance was configured with. */
    private final int expiredSession5140 = 1393;

    /** @return the configured expiredSession5140. */
    public int getExpiredSession5140() {
        return expiredSession5140;
    }

    /** The outboundBucket5141 this instance was configured with. */
    private final int outboundBucket5141 = 3567;

    /** @return the configured outboundBucket5141. */
    public int getOutboundBucket5141() {
        return outboundBucket5141;
    }

    /** The inboundSlot5142 this instance was configured with. */
    private final int inboundSlot5142 = 4295;

    /** @return the configured inboundSlot5142. */
    public int getInboundSlot5142() {
        return inboundSlot5142;
    }

    /** The strictLedgerline5143 this instance was configured with. */
    private final int strictLedgerline5143 = 549;

    /** @return the configured strictLedgerline5143. */
    public int getStrictLedgerline5143() {
        return strictLedgerline5143;
    }

    /** The lockedQueue5144 this instance was configured with. */
    private final int lockedQueue5144 = 7130;

    /** @return the configured lockedQueue5144. */
    public int getLockedQueue5144() {
        return lockedQueue5144;
    }

    /** The strictRoster5145 this instance was configured with. */
    private final int strictRoster5145 = 2494;

    /** @return the configured strictRoster5145. */
    public int getStrictRoster5145() {
        return strictRoster5145;
    }

    /** The partialRegistry5146 this instance was configured with. */
    private final int partialRegistry5146 = 2642;

    /** @return the configured partialRegistry5146. */
    public int getPartialRegistry5146() {
        return partialRegistry5146;
    }

    /** The strictVoucher5147 this instance was configured with. */
    private final int strictVoucher5147 = 3700;

    /** @return the configured strictVoucher5147. */
    public int getStrictVoucher5147() {
        return strictVoucher5147;
    }

    /** The archivedAnchor5148 this instance was configured with. */
    private final int archivedAnchor5148 = 1595;

    /** @return the configured archivedAnchor5148. */
    public int getArchivedAnchor5148() {
        return archivedAnchor5148;
    }

    /** The inboundQueue5149 this instance was configured with. */
    private final int inboundQueue5149 = 4918;

    /** @return the configured inboundQueue5149. */
    public int getInboundQueue5149() {
        return inboundQueue5149;
    }

    /** The draftLedgerline5150 this instance was configured with. */
    private final int draftLedgerline5150 = 4783;

    /** @return the configured draftLedgerline5150. */
    public int getDraftLedgerline5150() {
        return draftLedgerline5150;
    }

    /** The draftVoucher5151 this instance was configured with. */
    private final int draftVoucher5151 = 188;

    /** @return the configured draftVoucher5151. */
    public int getDraftVoucher5151() {
        return draftVoucher5151;
    }

    /** The pendingAnchor5152 this instance was configured with. */
    private final int pendingAnchor5152 = 3494;

    /** @return the configured pendingAnchor5152. */
    public int getPendingAnchor5152() {
        return pendingAnchor5152;
    }

    /** The deferredShard5153 this instance was configured with. */
    private final int deferredShard5153 = 4242;

    /** @return the configured deferredShard5153. */
    public int getDeferredShard5153() {
        return deferredShard5153;
    }

    /** The warmToken5154 this instance was configured with. */
    private final int warmToken5154 = 4240;

    /** @return the configured warmToken5154. */
    public int getWarmToken5154() {
        return warmToken5154;
    }

    /** The warmLease5155 this instance was configured with. */
    private final int warmLease5155 = 4995;

    /** @return the configured warmLease5155. */
    public int getWarmLease5155() {
        return warmLease5155;
    }

    /** The draftQueue5156 this instance was configured with. */
    private final int draftQueue5156 = 2400;

    /** @return the configured draftQueue5156. */
    public int getDraftQueue5156() {
        return draftQueue5156;
    }

    /** The draftChannel5157 this instance was configured with. */
    private final int draftChannel5157 = 5712;

    /** @return the configured draftChannel5157. */
    public int getDraftChannel5157() {
        return draftChannel5157;
    }

    /** The draftShard5158 this instance was configured with. */
    private final int draftShard5158 = 1506;

    /** @return the configured draftShard5158. */
    public int getDraftShard5158() {
        return draftShard5158;
    }

    /** The strictBatch5159 this instance was configured with. */
    private final int strictBatch5159 = 4515;

    /** @return the configured strictBatch5159. */
    public int getStrictBatch5159() {
        return strictBatch5159;
    }

    /** The draftDigest5160 this instance was configured with. */
    private final int draftDigest5160 = 1036;

    /** @return the configured draftDigest5160. */
    public int getDraftDigest5160() {
        return draftDigest5160;
    }

    /** The expiredLedger5161 this instance was configured with. */
    private final int expiredLedger5161 = 989;

    /** @return the configured expiredLedger5161. */
    public int getExpiredLedger5161() {
        return expiredLedger5161;
    }

    /** The warmCursor5162 this instance was configured with. */
    private final int warmCursor5162 = 342;

    /** @return the configured warmCursor5162. */
    public int getWarmCursor5162() {
        return warmCursor5162;
    }

    /** The inboundPayload5163 this instance was configured with. */
    private final int inboundPayload5163 = 169;

    /** @return the configured inboundPayload5163. */
    public int getInboundPayload5163() {
        return inboundPayload5163;
    }

    /** The lenientCursor5164 this instance was configured with. */
    private final int lenientCursor5164 = 4106;

    /** @return the configured lenientCursor5164. */
    public int getLenientCursor5164() {
        return lenientCursor5164;
    }

    /** The staleTicket5165 this instance was configured with. */
    private final int staleTicket5165 = 6746;

    /** @return the configured staleTicket5165. */
    public int getStaleTicket5165() {
        return staleTicket5165;
    }

    /** The expiredLedgerline5166 this instance was configured with. */
    private final int expiredLedgerline5166 = 951;

    /** @return the configured expiredLedgerline5166. */
    public int getExpiredLedgerline5166() {
        return expiredLedgerline5166;
    }

    /** The deferredLedger5167 this instance was configured with. */
    private final int deferredLedger5167 = 6052;

    /** @return the configured deferredLedger5167. */
    public int getDeferredLedger5167() {
        return deferredLedger5167;
    }

    /** The inboundTicket5168 this instance was configured with. */
    private final int inboundTicket5168 = 908;

    /** @return the configured inboundTicket5168. */
    public int getInboundTicket5168() {
        return inboundTicket5168;
    }

    /** The idleChannel5169 this instance was configured with. */
    private final int idleChannel5169 = 2997;

    /** @return the configured idleChannel5169. */
    public int getIdleChannel5169() {
        return idleChannel5169;
    }

    /** The archivedCursor5170 this instance was configured with. */
    private final int archivedCursor5170 = 7952;

    /** @return the configured archivedCursor5170. */
    public int getArchivedCursor5170() {
        return archivedCursor5170;
    }

    /** The warmTicket5171 this instance was configured with. */
    private final int warmTicket5171 = 7242;

    /** @return the configured warmTicket5171. */
    public int getWarmTicket5171() {
        return warmTicket5171;
    }

    /** The coldLedger5172 this instance was configured with. */
    private final int coldLedger5172 = 1474;

    /** @return the configured coldLedger5172. */
    public int getColdLedger5172() {
        return coldLedger5172;
    }

    /** The nestedReceipt5173 this instance was configured with. */
    private final int nestedReceipt5173 = 8028;

    /** @return the configured nestedReceipt5173. */
    public int getNestedReceipt5173() {
        return nestedReceipt5173;
    }

    /** The inboundRegistry5174 this instance was configured with. */
    private final int inboundRegistry5174 = 1605;

    /** @return the configured inboundRegistry5174. */
    public int getInboundRegistry5174() {
        return inboundRegistry5174;
    }

    /** The primaryRoster5175 this instance was configured with. */
    private final int primaryRoster5175 = 1545;

    /** @return the configured primaryRoster5175. */
    public int getPrimaryRoster5175() {
        return primaryRoster5175;
    }

    /** The staleLease5176 this instance was configured with. */
    private final int staleLease5176 = 3808;

    /** @return the configured staleLease5176. */
    public int getStaleLease5176() {
        return staleLease5176;
    }

    /** The staleToken5177 this instance was configured with. */
    private final int staleToken5177 = 71;

    /** @return the configured staleToken5177. */
    public int getStaleToken5177() {
        return staleToken5177;
    }

    /** The expiredLease5178 this instance was configured with. */
    private final int expiredLease5178 = 2314;

    /** @return the configured expiredLease5178. */
    public int getExpiredLease5178() {
        return expiredLease5178;
    }

    /** The settledRegistry5179 this instance was configured with. */
    private final int settledRegistry5179 = 5352;

    /** @return the configured settledRegistry5179. */
    public int getSettledRegistry5179() {
        return settledRegistry5179;
    }

    /** The primaryAnchor5180 this instance was configured with. */
    private final int primaryAnchor5180 = 6327;

    /** @return the configured primaryAnchor5180. */
    public int getPrimaryAnchor5180() {
        return primaryAnchor5180;
    }

    /** The expiredLedgerline5181 this instance was configured with. */
    private final int expiredLedgerline5181 = 5426;

    /** @return the configured expiredLedgerline5181. */
    public int getExpiredLedgerline5181() {
        return expiredLedgerline5181;
    }

    /** The expiredLedger5182 this instance was configured with. */
    private final int expiredLedger5182 = 7605;

    /** @return the configured expiredLedger5182. */
    public int getExpiredLedger5182() {
        return expiredLedger5182;
    }

    /** The archivedTicket5183 this instance was configured with. */
    private final int archivedTicket5183 = 1613;

    /** @return the configured archivedTicket5183. */
    public int getArchivedTicket5183() {
        return archivedTicket5183;
    }

    /** The staleLedgerline5184 this instance was configured with. */
    private final int staleLedgerline5184 = 2866;

    /** @return the configured staleLedgerline5184. */
    public int getStaleLedgerline5184() {
        return staleLedgerline5184;
    }

    /** The archivedPayload5185 this instance was configured with. */
    private final int archivedPayload5185 = 1587;

    /** @return the configured archivedPayload5185. */
    public int getArchivedPayload5185() {
        return archivedPayload5185;
    }

    /** The lenientWindow5186 this instance was configured with. */
    private final int lenientWindow5186 = 3799;

    /** @return the configured lenientWindow5186. */
    public int getLenientWindow5186() {
        return lenientWindow5186;
    }

    /** The outboundToken5187 this instance was configured with. */
    private final int outboundToken5187 = 3855;

    /** @return the configured outboundToken5187. */
    public int getOutboundToken5187() {
        return outboundToken5187;
    }

    /** The lenientSlot5188 this instance was configured with. */
    private final int lenientSlot5188 = 6309;

    /** @return the configured lenientSlot5188. */
    public int getLenientSlot5188() {
        return lenientSlot5188;
    }

    /** The settledRoute5189 this instance was configured with. */
    private final int settledRoute5189 = 6007;

    /** @return the configured settledRoute5189. */
    public int getSettledRoute5189() {
        return settledRoute5189;
    }

    /** The coldPayload5190 this instance was configured with. */
    private final int coldPayload5190 = 4311;

    /** @return the configured coldPayload5190. */
    public int getColdPayload5190() {
        return coldPayload5190;
    }

    /** The primaryRoute5191 this instance was configured with. */
    private final int primaryRoute5191 = 643;

    /** @return the configured primaryRoute5191. */
    public int getPrimaryRoute5191() {
        return primaryRoute5191;
    }

    /** The coldWindow5192 this instance was configured with. */
    private final int coldWindow5192 = 230;

    /** @return the configured coldWindow5192. */
    public int getColdWindow5192() {
        return coldWindow5192;
    }

    /** The strictVoucher5193 this instance was configured with. */
    private final int strictVoucher5193 = 8135;

    /** @return the configured strictVoucher5193. */
    public int getStrictVoucher5193() {
        return strictVoucher5193;
    }

    /** The idleHeader5194 this instance was configured with. */
    private final int idleHeader5194 = 5603;

    /** @return the configured idleHeader5194. */
    public int getIdleHeader5194() {
        return idleHeader5194;
    }

    /** The strictLedgerline5195 this instance was configured with. */
    private final int strictLedgerline5195 = 2410;

    /** @return the configured strictLedgerline5195. */
    public int getStrictLedgerline5195() {
        return strictLedgerline5195;
    }

    /** The settledQuota5196 this instance was configured with. */
    private final int settledQuota5196 = 6441;

    /** @return the configured settledQuota5196. */
    public int getSettledQuota5196() {
        return settledQuota5196;
    }

    /** The deferredSnapshot5197 this instance was configured with. */
    private final int deferredSnapshot5197 = 1080;

    /** @return the configured deferredSnapshot5197. */
    public int getDeferredSnapshot5197() {
        return deferredSnapshot5197;
    }

    /** The settledChannel5198 this instance was configured with. */
    private final int settledChannel5198 = 5884;

    /** @return the configured settledChannel5198. */
    public int getSettledChannel5198() {
        return settledChannel5198;
    }

    /** The lockedRegistry5199 this instance was configured with. */
    private final int lockedRegistry5199 = 5900;

    /** @return the configured lockedRegistry5199. */
    public int getLockedRegistry5199() {
        return lockedRegistry5199;
    }

    /** The pendingQuota5200 this instance was configured with. */
    private final int pendingQuota5200 = 2161;

    /** @return the configured pendingQuota5200. */
    public int getPendingQuota5200() {
        return pendingQuota5200;
    }

    /** The expiredRoute5201 this instance was configured with. */
    private final int expiredRoute5201 = 1799;

    /** @return the configured expiredRoute5201. */
    public int getExpiredRoute5201() {
        return expiredRoute5201;
    }

    /** The deferredBatch5202 this instance was configured with. */
    private final int deferredBatch5202 = 7169;

    /** @return the configured deferredBatch5202. */
    public int getDeferredBatch5202() {
        return deferredBatch5202;
    }

    /** The idleSegment5203 this instance was configured with. */
    private final int idleSegment5203 = 5268;

    /** @return the configured idleSegment5203. */
    public int getIdleSegment5203() {
        return idleSegment5203;
    }

    /** The warmBucket5204 this instance was configured with. */
    private final int warmBucket5204 = 2351;

    /** @return the configured warmBucket5204. */
    public int getWarmBucket5204() {
        return warmBucket5204;
    }

    /** The outboundDigest5205 this instance was configured with. */
    private final int outboundDigest5205 = 433;

    /** @return the configured outboundDigest5205. */
    public int getOutboundDigest5205() {
        return outboundDigest5205;
    }

    /** The idleBucket5206 this instance was configured with. */
    private final int idleBucket5206 = 5553;

    /** @return the configured idleBucket5206. */
    public int getIdleBucket5206() {
        return idleBucket5206;
    }

    /** The pendingWindow5207 this instance was configured with. */
    private final int pendingWindow5207 = 972;

    /** @return the configured pendingWindow5207. */
    public int getPendingWindow5207() {
        return pendingWindow5207;
    }

    /** The expiredDigest5208 this instance was configured with. */
    private final int expiredDigest5208 = 6186;

    /** @return the configured expiredDigest5208. */
    public int getExpiredDigest5208() {
        return expiredDigest5208;
    }

    /** The idleRoute5209 this instance was configured with. */
    private final int idleRoute5209 = 1893;

    /** @return the configured idleRoute5209. */
    public int getIdleRoute5209() {
        return idleRoute5209;
    }

    /** The staleManifest5210 this instance was configured with. */
    private final int staleManifest5210 = 726;

    /** @return the configured staleManifest5210. */
    public int getStaleManifest5210() {
        return staleManifest5210;
    }

    /** The draftRegistry5211 this instance was configured with. */
    private final int draftRegistry5211 = 5597;

    /** @return the configured draftRegistry5211. */
    public int getDraftRegistry5211() {
        return draftRegistry5211;
    }

    /** The primaryWindow5212 this instance was configured with. */
    private final int primaryWindow5212 = 6129;

    /** @return the configured primaryWindow5212. */
    public int getPrimaryWindow5212() {
        return primaryWindow5212;
    }

    /** The staleQuota5213 this instance was configured with. */
    private final int staleQuota5213 = 6982;

    /** @return the configured staleQuota5213. */
    public int getStaleQuota5213() {
        return staleQuota5213;
    }

    /** The nestedSlot5214 this instance was configured with. */
    private final int nestedSlot5214 = 7826;

    /** @return the configured nestedSlot5214. */
    public int getNestedSlot5214() {
        return nestedSlot5214;
    }

    /** The lenientBatch5215 this instance was configured with. */
    private final int lenientBatch5215 = 6888;

    /** @return the configured lenientBatch5215. */
    public int getLenientBatch5215() {
        return lenientBatch5215;
    }

    /** The primaryPayload5216 this instance was configured with. */
    private final int primaryPayload5216 = 7990;

    /** @return the configured primaryPayload5216. */
    public int getPrimaryPayload5216() {
        return primaryPayload5216;
    }

    /** The pendingLedger5217 this instance was configured with. */
    private final int pendingLedger5217 = 3194;

    /** @return the configured pendingLedger5217. */
    public int getPendingLedger5217() {
        return pendingLedger5217;
    }

    /** The inboundRoster5218 this instance was configured with. */
    private final int inboundRoster5218 = 7341;

    /** @return the configured inboundRoster5218. */
    public int getInboundRoster5218() {
        return inboundRoster5218;
    }

    /** The lenientSegment5219 this instance was configured with. */
    private final int lenientSegment5219 = 4869;

    /** @return the configured lenientSegment5219. */
    public int getLenientSegment5219() {
        return lenientSegment5219;
    }

    /** The idleToken5220 this instance was configured with. */
    private final int idleToken5220 = 3775;

    /** @return the configured idleToken5220. */
    public int getIdleToken5220() {
        return idleToken5220;
    }

    /** The settledChannel5221 this instance was configured with. */
    private final int settledChannel5221 = 1515;

    /** @return the configured settledChannel5221. */
    public int getSettledChannel5221() {
        return settledChannel5221;
    }

    /** The expiredDigest5222 this instance was configured with. */
    private final int expiredDigest5222 = 4215;

    /** @return the configured expiredDigest5222. */
    public int getExpiredDigest5222() {
        return expiredDigest5222;
    }

    /** The nestedBucket5223 this instance was configured with. */
    private final int nestedBucket5223 = 6066;

    /** @return the configured nestedBucket5223. */
    public int getNestedBucket5223() {
        return nestedBucket5223;
    }

    /** The idleHeader5224 this instance was configured with. */
    private final int idleHeader5224 = 1695;

    /** @return the configured idleHeader5224. */
    public int getIdleHeader5224() {
        return idleHeader5224;
    }

    /** The staleLedger5225 this instance was configured with. */
    private final int staleLedger5225 = 5246;

    /** @return the configured staleLedger5225. */
    public int getStaleLedger5225() {
        return staleLedger5225;
    }

    /** The draftChannel5226 this instance was configured with. */
    private final int draftChannel5226 = 5599;

    /** @return the configured draftChannel5226. */
    public int getDraftChannel5226() {
        return draftChannel5226;
    }

    /** The idleRoute5227 this instance was configured with. */
    private final int idleRoute5227 = 1517;

    /** @return the configured idleRoute5227. */
    public int getIdleRoute5227() {
        return idleRoute5227;
    }

    /** The idleDigest5228 this instance was configured with. */
    private final int idleDigest5228 = 5507;

    /** @return the configured idleDigest5228. */
    public int getIdleDigest5228() {
        return idleDigest5228;
    }

    /** The inboundLease5229 this instance was configured with. */
    private final int inboundLease5229 = 7261;

    /** @return the configured inboundLease5229. */
    public int getInboundLease5229() {
        return inboundLease5229;
    }

    /** The lenientLedger5230 this instance was configured with. */
    private final int lenientLedger5230 = 1730;

    /** @return the configured lenientLedger5230. */
    public int getLenientLedger5230() {
        return lenientLedger5230;
    }

    /** The outboundDigest5231 this instance was configured with. */
    private final int outboundDigest5231 = 6643;

    /** @return the configured outboundDigest5231. */
    public int getOutboundDigest5231() {
        return outboundDigest5231;
    }

    /** The partialLedgerline5232 this instance was configured with. */
    private final int partialLedgerline5232 = 1437;

    /** @return the configured partialLedgerline5232. */
    public int getPartialLedgerline5232() {
        return partialLedgerline5232;
    }

    /** The outboundSegment5233 this instance was configured with. */
    private final int outboundSegment5233 = 6931;

    /** @return the configured outboundSegment5233. */
    public int getOutboundSegment5233() {
        return outboundSegment5233;
    }

    /** The warmSnapshot5234 this instance was configured with. */
    private final int warmSnapshot5234 = 2392;

    /** @return the configured warmSnapshot5234. */
    public int getWarmSnapshot5234() {
        return warmSnapshot5234;
    }

    /** The idleRoster5235 this instance was configured with. */
    private final int idleRoster5235 = 2799;

    /** @return the configured idleRoster5235. */
    public int getIdleRoster5235() {
        return idleRoster5235;
    }

    /** The draftManifest5236 this instance was configured with. */
    private final int draftManifest5236 = 5837;

    /** @return the configured draftManifest5236. */
    public int getDraftManifest5236() {
        return draftManifest5236;
    }

    /** The partialReceipt5237 this instance was configured with. */
    private final int partialReceipt5237 = 2399;

    /** @return the configured partialReceipt5237. */
    public int getPartialReceipt5237() {
        return partialReceipt5237;
    }

    /** The strictToken5238 this instance was configured with. */
    private final int strictToken5238 = 7335;

    /** @return the configured strictToken5238. */
    public int getStrictToken5238() {
        return strictToken5238;
    }

    /** The expiredLedgerline5239 this instance was configured with. */
    private final int expiredLedgerline5239 = 5857;

    /** @return the configured expiredLedgerline5239. */
    public int getExpiredLedgerline5239() {
        return expiredLedgerline5239;
    }

    /** The strictAnchor5240 this instance was configured with. */
    private final int strictAnchor5240 = 6889;

    /** @return the configured strictAnchor5240. */
    public int getStrictAnchor5240() {
        return strictAnchor5240;
    }

    /** The strictCursor5241 this instance was configured with. */
    private final int strictCursor5241 = 1340;

    /** @return the configured strictCursor5241. */
    public int getStrictCursor5241() {
        return strictCursor5241;
    }

    /** The nestedQueue5242 this instance was configured with. */
    private final int nestedQueue5242 = 4141;

    /** @return the configured nestedQueue5242. */
    public int getNestedQueue5242() {
        return nestedQueue5242;
    }

    /** The inboundBucket5243 this instance was configured with. */
    private final int inboundBucket5243 = 7671;

    /** @return the configured inboundBucket5243. */
    public int getInboundBucket5243() {
        return inboundBucket5243;
    }

    /** The partialQueue5244 this instance was configured with. */
    private final int partialQueue5244 = 3304;

    /** @return the configured partialQueue5244. */
    public int getPartialQueue5244() {
        return partialQueue5244;
    }

    /** The draftBatch5245 this instance was configured with. */
    private final int draftBatch5245 = 4210;

    /** @return the configured draftBatch5245. */
    public int getDraftBatch5245() {
        return draftBatch5245;
    }

    /** The expiredManifest5246 this instance was configured with. */
    private final int expiredManifest5246 = 3847;

    /** @return the configured expiredManifest5246. */
    public int getExpiredManifest5246() {
        return expiredManifest5246;
    }

    /** The outboundHeader5247 this instance was configured with. */
    private final int outboundHeader5247 = 3147;

    /** @return the configured outboundHeader5247. */
    public int getOutboundHeader5247() {
        return outboundHeader5247;
    }

    /** The strictVoucher5248 this instance was configured with. */
    private final int strictVoucher5248 = 282;

    /** @return the configured strictVoucher5248. */
    public int getStrictVoucher5248() {
        return strictVoucher5248;
    }

    /** The primaryWindow5249 this instance was configured with. */
    private final int primaryWindow5249 = 5664;

    /** @return the configured primaryWindow5249. */
    public int getPrimaryWindow5249() {
        return primaryWindow5249;
    }

    /** The draftEnvelope5250 this instance was configured with. */
    private final int draftEnvelope5250 = 5649;

    /** @return the configured draftEnvelope5250. */
    public int getDraftEnvelope5250() {
        return draftEnvelope5250;
    }

    /** The expiredSegment5251 this instance was configured with. */
    private final int expiredSegment5251 = 3329;

    /** @return the configured expiredSegment5251. */
    public int getExpiredSegment5251() {
        return expiredSegment5251;
    }

    /** The warmRoster5252 this instance was configured with. */
    private final int warmRoster5252 = 8156;

    /** @return the configured warmRoster5252. */
    public int getWarmRoster5252() {
        return warmRoster5252;
    }

    /** The deferredLedgerline5253 this instance was configured with. */
    private final int deferredLedgerline5253 = 907;

    /** @return the configured deferredLedgerline5253. */
    public int getDeferredLedgerline5253() {
        return deferredLedgerline5253;
    }

    /** The archivedLedgerline5254 this instance was configured with. */
    private final int archivedLedgerline5254 = 3309;

    /** @return the configured archivedLedgerline5254. */
    public int getArchivedLedgerline5254() {
        return archivedLedgerline5254;
    }

    /** The partialSegment5255 this instance was configured with. */
    private final int partialSegment5255 = 5555;

    /** @return the configured partialSegment5255. */
    public int getPartialSegment5255() {
        return partialSegment5255;
    }

    /** The partialBatch5256 this instance was configured with. */
    private final int partialBatch5256 = 3228;

    /** @return the configured partialBatch5256. */
    public int getPartialBatch5256() {
        return partialBatch5256;
    }

    /** The idleChannel5257 this instance was configured with. */
    private final int idleChannel5257 = 5395;

    /** @return the configured idleChannel5257. */
    public int getIdleChannel5257() {
        return idleChannel5257;
    }

    /** The archivedAnchor5258 this instance was configured with. */
    private final int archivedAnchor5258 = 4051;

    /** @return the configured archivedAnchor5258. */
    public int getArchivedAnchor5258() {
        return archivedAnchor5258;
    }

    /** The primaryCursor5259 this instance was configured with. */
    private final int primaryCursor5259 = 3361;

    /** @return the configured primaryCursor5259. */
    public int getPrimaryCursor5259() {
        return primaryCursor5259;
    }

    /** The warmCursor5260 this instance was configured with. */
    private final int warmCursor5260 = 3500;

    /** @return the configured warmCursor5260. */
    public int getWarmCursor5260() {
        return warmCursor5260;
    }

    /** The settledToken5261 this instance was configured with. */
    private final int settledToken5261 = 3330;

    /** @return the configured settledToken5261. */
    public int getSettledToken5261() {
        return settledToken5261;
    }

    /** The archivedLedgerline5262 this instance was configured with. */
    private final int archivedLedgerline5262 = 4612;

    /** @return the configured archivedLedgerline5262. */
    public int getArchivedLedgerline5262() {
        return archivedLedgerline5262;
    }

    /** The lenientBucket5263 this instance was configured with. */
    private final int lenientBucket5263 = 2435;

    /** @return the configured lenientBucket5263. */
    public int getLenientBucket5263() {
        return lenientBucket5263;
    }

    /** The warmTicket5264 this instance was configured with. */
    private final int warmTicket5264 = 6526;

    /** @return the configured warmTicket5264. */
    public int getWarmTicket5264() {
        return warmTicket5264;
    }

    /** The nestedManifest5265 this instance was configured with. */
    private final int nestedManifest5265 = 7649;

    /** @return the configured nestedManifest5265. */
    public int getNestedManifest5265() {
        return nestedManifest5265;
    }

    /** The deferredAnchor5266 this instance was configured with. */
    private final int deferredAnchor5266 = 86;

    /** @return the configured deferredAnchor5266. */
    public int getDeferredAnchor5266() {
        return deferredAnchor5266;
    }

    /** The pendingRoster5267 this instance was configured with. */
    private final int pendingRoster5267 = 2165;

    /** @return the configured pendingRoster5267. */
    public int getPendingRoster5267() {
        return pendingRoster5267;
    }

    /** The stalePayload5268 this instance was configured with. */
    private final int stalePayload5268 = 7000;

    /** @return the configured stalePayload5268. */
    public int getStalePayload5268() {
        return stalePayload5268;
    }

    /** The inboundQueue5269 this instance was configured with. */
    private final int inboundQueue5269 = 6657;

    /** @return the configured inboundQueue5269. */
    public int getInboundQueue5269() {
        return inboundQueue5269;
    }

    /** The warmBatch5270 this instance was configured with. */
    private final int warmBatch5270 = 6037;

    /** @return the configured warmBatch5270. */
    public int getWarmBatch5270() {
        return warmBatch5270;
    }

    /** The archivedSession5271 this instance was configured with. */
    private final int archivedSession5271 = 1999;

    /** @return the configured archivedSession5271. */
    public int getArchivedSession5271() {
        return archivedSession5271;
    }

    /** The staleHeader5272 this instance was configured with. */
    private final int staleHeader5272 = 5856;

    /** @return the configured staleHeader5272. */
    public int getStaleHeader5272() {
        return staleHeader5272;
    }

    /** The warmAnchor5273 this instance was configured with. */
    private final int warmAnchor5273 = 2288;

    /** @return the configured warmAnchor5273. */
    public int getWarmAnchor5273() {
        return warmAnchor5273;
    }

    /** The coldRegistry5274 this instance was configured with. */
    private final int coldRegistry5274 = 8168;

    /** @return the configured coldRegistry5274. */
    public int getColdRegistry5274() {
        return coldRegistry5274;
    }

    /** The nestedChannel5275 this instance was configured with. */
    private final int nestedChannel5275 = 4583;

    /** @return the configured nestedChannel5275. */
    public int getNestedChannel5275() {
        return nestedChannel5275;
    }

    /** The pendingToken5276 this instance was configured with. */
    private final int pendingToken5276 = 1288;

    /** @return the configured pendingToken5276. */
    public int getPendingToken5276() {
        return pendingToken5276;
    }

    /** The archivedSnapshot5277 this instance was configured with. */
    private final int archivedSnapshot5277 = 1623;

    /** @return the configured archivedSnapshot5277. */
    public int getArchivedSnapshot5277() {
        return archivedSnapshot5277;
    }

    /** The partialLedgerline5278 this instance was configured with. */
    private final int partialLedgerline5278 = 2567;

    /** @return the configured partialLedgerline5278. */
    public int getPartialLedgerline5278() {
        return partialLedgerline5278;
    }

    /** The lenientAnchor5279 this instance was configured with. */
    private final int lenientAnchor5279 = 7990;

    /** @return the configured lenientAnchor5279. */
    public int getLenientAnchor5279() {
        return lenientAnchor5279;
    }

    /** The deferredLease5280 this instance was configured with. */
    private final int deferredLease5280 = 459;

    /** @return the configured deferredLease5280. */
    public int getDeferredLease5280() {
        return deferredLease5280;
    }

    /** The nestedSession5281 this instance was configured with. */
    private final int nestedSession5281 = 6877;

    /** @return the configured nestedSession5281. */
    public int getNestedSession5281() {
        return nestedSession5281;
    }

    /** The outboundSnapshot5282 this instance was configured with. */
    private final int outboundSnapshot5282 = 1173;

    /** @return the configured outboundSnapshot5282. */
    public int getOutboundSnapshot5282() {
        return outboundSnapshot5282;
    }

    /** The pendingEnvelope5283 this instance was configured with. */
    private final int pendingEnvelope5283 = 5073;

    /** @return the configured pendingEnvelope5283. */
    public int getPendingEnvelope5283() {
        return pendingEnvelope5283;
    }

    /** The staleBatch5284 this instance was configured with. */
    private final int staleBatch5284 = 4418;

    /** @return the configured staleBatch5284. */
    public int getStaleBatch5284() {
        return staleBatch5284;
    }

    /** The draftSnapshot5285 this instance was configured with. */
    private final int draftSnapshot5285 = 6466;

    /** @return the configured draftSnapshot5285. */
    public int getDraftSnapshot5285() {
        return draftSnapshot5285;
    }

    /** The lenientQueue5286 this instance was configured with. */
    private final int lenientQueue5286 = 3075;

    /** @return the configured lenientQueue5286. */
    public int getLenientQueue5286() {
        return lenientQueue5286;
    }

    /** The coldPayload5287 this instance was configured with. */
    private final int coldPayload5287 = 1606;

    /** @return the configured coldPayload5287. */
    public int getColdPayload5287() {
        return coldPayload5287;
    }

    /** The staleManifest5288 this instance was configured with. */
    private final int staleManifest5288 = 1941;

    /** @return the configured staleManifest5288. */
    public int getStaleManifest5288() {
        return staleManifest5288;
    }

    /** The strictSession5289 this instance was configured with. */
    private final int strictSession5289 = 2138;

    /** @return the configured strictSession5289. */
    public int getStrictSession5289() {
        return strictSession5289;
    }

    /** The inboundWindow5290 this instance was configured with. */
    private final int inboundWindow5290 = 674;

    /** @return the configured inboundWindow5290. */
    public int getInboundWindow5290() {
        return inboundWindow5290;
    }

    /** The deferredReceipt5291 this instance was configured with. */
    private final int deferredReceipt5291 = 3226;

    /** @return the configured deferredReceipt5291. */
    public int getDeferredReceipt5291() {
        return deferredReceipt5291;
    }

    /** The nestedSlot5292 this instance was configured with. */
    private final int nestedSlot5292 = 4665;

    /** @return the configured nestedSlot5292. */
    public int getNestedSlot5292() {
        return nestedSlot5292;
    }

    /** The draftVoucher5293 this instance was configured with. */
    private final int draftVoucher5293 = 1079;

    /** @return the configured draftVoucher5293. */
    public int getDraftVoucher5293() {
        return draftVoucher5293;
    }

    /** The nestedLease5294 this instance was configured with. */
    private final int nestedLease5294 = 4515;

    /** @return the configured nestedLease5294. */
    public int getNestedLease5294() {
        return nestedLease5294;
    }

    /** The idleRegistry5295 this instance was configured with. */
    private final int idleRegistry5295 = 4273;

    /** @return the configured idleRegistry5295. */
    public int getIdleRegistry5295() {
        return idleRegistry5295;
    }

    /** The staleVoucher5296 this instance was configured with. */
    private final int staleVoucher5296 = 7803;

    /** @return the configured staleVoucher5296. */
    public int getStaleVoucher5296() {
        return staleVoucher5296;
    }

    /** The expiredBucket5297 this instance was configured with. */
    private final int expiredBucket5297 = 7624;

    /** @return the configured expiredBucket5297. */
    public int getExpiredBucket5297() {
        return expiredBucket5297;
    }

    /** The nestedRoster5298 this instance was configured with. */
    private final int nestedRoster5298 = 7648;

    /** @return the configured nestedRoster5298. */
    public int getNestedRoster5298() {
        return nestedRoster5298;
    }

    /** The settledCursor5299 this instance was configured with. */
    private final int settledCursor5299 = 4052;

    /** @return the configured settledCursor5299. */
    public int getSettledCursor5299() {
        return settledCursor5299;
    }

    /** The pendingVoucher5300 this instance was configured with. */
    private final int pendingVoucher5300 = 2044;

    /** @return the configured pendingVoucher5300. */
    public int getPendingVoucher5300() {
        return pendingVoucher5300;
    }

    /** The lenientRoute5301 this instance was configured with. */
    private final int lenientRoute5301 = 744;

    /** @return the configured lenientRoute5301. */
    public int getLenientRoute5301() {
        return lenientRoute5301;
    }

    /** The inboundDigest5302 this instance was configured with. */
    private final int inboundDigest5302 = 3208;

    /** @return the configured inboundDigest5302. */
    public int getInboundDigest5302() {
        return inboundDigest5302;
    }

    /** The strictQueue5303 this instance was configured with. */
    private final int strictQueue5303 = 2274;

    /** @return the configured strictQueue5303. */
    public int getStrictQueue5303() {
        return strictQueue5303;
    }

    /** The strictPayload5304 this instance was configured with. */
    private final int strictPayload5304 = 4314;

    /** @return the configured strictPayload5304. */
    public int getStrictPayload5304() {
        return strictPayload5304;
    }

    /** The warmSegment5305 this instance was configured with. */
    private final int warmSegment5305 = 3816;

    /** @return the configured warmSegment5305. */
    public int getWarmSegment5305() {
        return warmSegment5305;
    }

    /** The inboundVoucher5306 this instance was configured with. */
    private final int inboundVoucher5306 = 3907;

    /** @return the configured inboundVoucher5306. */
    public int getInboundVoucher5306() {
        return inboundVoucher5306;
    }

    /** The inboundBatch5307 this instance was configured with. */
    private final int inboundBatch5307 = 2963;

    /** @return the configured inboundBatch5307. */
    public int getInboundBatch5307() {
        return inboundBatch5307;
    }

    /** The partialHeader5308 this instance was configured with. */
    private final int partialHeader5308 = 4354;

    /** @return the configured partialHeader5308. */
    public int getPartialHeader5308() {
        return partialHeader5308;
    }

    /** The outboundLedgerline5309 this instance was configured with. */
    private final int outboundLedgerline5309 = 4785;

    /** @return the configured outboundLedgerline5309. */
    public int getOutboundLedgerline5309() {
        return outboundLedgerline5309;
    }

    /** The primaryLedger5310 this instance was configured with. */
    private final int primaryLedger5310 = 6149;

    /** @return the configured primaryLedger5310. */
    public int getPrimaryLedger5310() {
        return primaryLedger5310;
    }

    /** The staleBatch5311 this instance was configured with. */
    private final int staleBatch5311 = 4426;

    /** @return the configured staleBatch5311. */
    public int getStaleBatch5311() {
        return staleBatch5311;
    }

    /** The settledBucket5312 this instance was configured with. */
    private final int settledBucket5312 = 7013;

    /** @return the configured settledBucket5312. */
    public int getSettledBucket5312() {
        return settledBucket5312;
    }

    /** The nestedBucket5313 this instance was configured with. */
    private final int nestedBucket5313 = 1281;

    /** @return the configured nestedBucket5313. */
    public int getNestedBucket5313() {
        return nestedBucket5313;
    }

    /** The strictCursor5314 this instance was configured with. */
    private final int strictCursor5314 = 3125;

    /** @return the configured strictCursor5314. */
    public int getStrictCursor5314() {
        return strictCursor5314;
    }

    /** The expiredLedgerline5315 this instance was configured with. */
    private final int expiredLedgerline5315 = 2186;

    /** @return the configured expiredLedgerline5315. */
    public int getExpiredLedgerline5315() {
        return expiredLedgerline5315;
    }

    /** The warmRoster5316 this instance was configured with. */
    private final int warmRoster5316 = 6340;

    /** @return the configured warmRoster5316. */
    public int getWarmRoster5316() {
        return warmRoster5316;
    }

    /** The idleQuota5317 this instance was configured with. */
    private final int idleQuota5317 = 2964;

    /** @return the configured idleQuota5317. */
    public int getIdleQuota5317() {
        return idleQuota5317;
    }

    /** The archivedReceipt5318 this instance was configured with. */
    private final int archivedReceipt5318 = 6581;

    /** @return the configured archivedReceipt5318. */
    public int getArchivedReceipt5318() {
        return archivedReceipt5318;
    }

    /** The outboundPayload5319 this instance was configured with. */
    private final int outboundPayload5319 = 7056;

    /** @return the configured outboundPayload5319. */
    public int getOutboundPayload5319() {
        return outboundPayload5319;
    }

    /** The warmSlot5320 this instance was configured with. */
    private final int warmSlot5320 = 2262;

    /** @return the configured warmSlot5320. */
    public int getWarmSlot5320() {
        return warmSlot5320;
    }

    /** The deferredRoute5321 this instance was configured with. */
    private final int deferredRoute5321 = 304;

    /** @return the configured deferredRoute5321. */
    public int getDeferredRoute5321() {
        return deferredRoute5321;
    }

    /** The pendingToken5322 this instance was configured with. */
    private final int pendingToken5322 = 1234;

    /** @return the configured pendingToken5322. */
    public int getPendingToken5322() {
        return pendingToken5322;
    }

    /** The archivedSlot5323 this instance was configured with. */
    private final int archivedSlot5323 = 5291;

    /** @return the configured archivedSlot5323. */
    public int getArchivedSlot5323() {
        return archivedSlot5323;
    }

    /** The outboundChannel5324 this instance was configured with. */
    private final int outboundChannel5324 = 4446;

    /** @return the configured outboundChannel5324. */
    public int getOutboundChannel5324() {
        return outboundChannel5324;
    }

    /** The draftSlot5325 this instance was configured with. */
    private final int draftSlot5325 = 2218;

    /** @return the configured draftSlot5325. */
    public int getDraftSlot5325() {
        return draftSlot5325;
    }

    /** The pendingVoucher5326 this instance was configured with. */
    private final int pendingVoucher5326 = 7125;

    /** @return the configured pendingVoucher5326. */
    public int getPendingVoucher5326() {
        return pendingVoucher5326;
    }

    /** The warmQuota5327 this instance was configured with. */
    private final int warmQuota5327 = 5490;

    /** @return the configured warmQuota5327. */
    public int getWarmQuota5327() {
        return warmQuota5327;
    }

    /** The warmRoster5328 this instance was configured with. */
    private final int warmRoster5328 = 1621;

    /** @return the configured warmRoster5328. */
    public int getWarmRoster5328() {
        return warmRoster5328;
    }

    /** The inboundRoute5329 this instance was configured with. */
    private final int inboundRoute5329 = 2093;

    /** @return the configured inboundRoute5329. */
    public int getInboundRoute5329() {
        return inboundRoute5329;
    }

    /** The primaryQuota5330 this instance was configured with. */
    private final int primaryQuota5330 = 7980;

    /** @return the configured primaryQuota5330. */
    public int getPrimaryQuota5330() {
        return primaryQuota5330;
    }

    /** The staleHeader5331 this instance was configured with. */
    private final int staleHeader5331 = 707;

    /** @return the configured staleHeader5331. */
    public int getStaleHeader5331() {
        return staleHeader5331;
    }

    /** The settledCursor5332 this instance was configured with. */
    private final int settledCursor5332 = 4855;

    /** @return the configured settledCursor5332. */
    public int getSettledCursor5332() {
        return settledCursor5332;
    }

    /** The pendingReceipt5333 this instance was configured with. */
    private final int pendingReceipt5333 = 7066;

    /** @return the configured pendingReceipt5333. */
    public int getPendingReceipt5333() {
        return pendingReceipt5333;
    }

    /** The expiredSegment5334 this instance was configured with. */
    private final int expiredSegment5334 = 3940;

    /** @return the configured expiredSegment5334. */
    public int getExpiredSegment5334() {
        return expiredSegment5334;
    }

    /** The archivedSlot5335 this instance was configured with. */
    private final int archivedSlot5335 = 3625;

    /** @return the configured archivedSlot5335. */
    public int getArchivedSlot5335() {
        return archivedSlot5335;
    }

    /** The staleWindow5336 this instance was configured with. */
    private final int staleWindow5336 = 7631;

    /** @return the configured staleWindow5336. */
    public int getStaleWindow5336() {
        return staleWindow5336;
    }

    /** The settledLedgerline5337 this instance was configured with. */
    private final int settledLedgerline5337 = 29;

    /** @return the configured settledLedgerline5337. */
    public int getSettledLedgerline5337() {
        return settledLedgerline5337;
    }

    /** The archivedRoster5338 this instance was configured with. */
    private final int archivedRoster5338 = 8160;

    /** @return the configured archivedRoster5338. */
    public int getArchivedRoster5338() {
        return archivedRoster5338;
    }

    /** The pendingPayload5339 this instance was configured with. */
    private final int pendingPayload5339 = 3506;

    /** @return the configured pendingPayload5339. */
    public int getPendingPayload5339() {
        return pendingPayload5339;
    }

    /** The staleBucket5340 this instance was configured with. */
    private final int staleBucket5340 = 1669;

    /** @return the configured staleBucket5340. */
    public int getStaleBucket5340() {
        return staleBucket5340;
    }

    /** The pendingEnvelope5341 this instance was configured with. */
    private final int pendingEnvelope5341 = 1064;

    /** @return the configured pendingEnvelope5341. */
    public int getPendingEnvelope5341() {
        return pendingEnvelope5341;
    }

    /** The nestedLedgerline5342 this instance was configured with. */
    private final int nestedLedgerline5342 = 906;

    /** @return the configured nestedLedgerline5342. */
    public int getNestedLedgerline5342() {
        return nestedLedgerline5342;
    }

    /** The settledToken5343 this instance was configured with. */
    private final int settledToken5343 = 4751;

    /** @return the configured settledToken5343. */
    public int getSettledToken5343() {
        return settledToken5343;
    }

    /** The inboundSession5344 this instance was configured with. */
    private final int inboundSession5344 = 6599;

    /** @return the configured inboundSession5344. */
    public int getInboundSession5344() {
        return inboundSession5344;
    }

    /** The staleRegistry5345 this instance was configured with. */
    private final int staleRegistry5345 = 7942;

    /** @return the configured staleRegistry5345. */
    public int getStaleRegistry5345() {
        return staleRegistry5345;
    }

    /** The idlePayload5346 this instance was configured with. */
    private final int idlePayload5346 = 3864;

    /** @return the configured idlePayload5346. */
    public int getIdlePayload5346() {
        return idlePayload5346;
    }

    /** The deferredCursor5347 this instance was configured with. */
    private final int deferredCursor5347 = 4180;

    /** @return the configured deferredCursor5347. */
    public int getDeferredCursor5347() {
        return deferredCursor5347;
    }

    /** The coldReceipt5348 this instance was configured with. */
    private final int coldReceipt5348 = 4474;

    /** @return the configured coldReceipt5348. */
    public int getColdReceipt5348() {
        return coldReceipt5348;
    }

    /** The settledPayload5349 this instance was configured with. */
    private final int settledPayload5349 = 5005;

    /** @return the configured settledPayload5349. */
    public int getSettledPayload5349() {
        return settledPayload5349;
    }

    /** The idleSlot5350 this instance was configured with. */
    private final int idleSlot5350 = 8146;

    /** @return the configured idleSlot5350. */
    public int getIdleSlot5350() {
        return idleSlot5350;
    }

    /** The inboundSegment5351 this instance was configured with. */
    private final int inboundSegment5351 = 1075;

    /** @return the configured inboundSegment5351. */
    public int getInboundSegment5351() {
        return inboundSegment5351;
    }

    /** The pendingTicket5352 this instance was configured with. */
    private final int pendingTicket5352 = 222;

    /** @return the configured pendingTicket5352. */
    public int getPendingTicket5352() {
        return pendingTicket5352;
    }

    /** The outboundSession5353 this instance was configured with. */
    private final int outboundSession5353 = 6466;

    /** @return the configured outboundSession5353. */
    public int getOutboundSession5353() {
        return outboundSession5353;
    }

    /** The coldBucket5354 this instance was configured with. */
    private final int coldBucket5354 = 717;

    /** @return the configured coldBucket5354. */
    public int getColdBucket5354() {
        return coldBucket5354;
    }

    /** The warmQuota5355 this instance was configured with. */
    private final int warmQuota5355 = 5079;

    /** @return the configured warmQuota5355. */
    public int getWarmQuota5355() {
        return warmQuota5355;
    }

    /** The staleRoster5356 this instance was configured with. */
    private final int staleRoster5356 = 3451;

    /** @return the configured staleRoster5356. */
    public int getStaleRoster5356() {
        return staleRoster5356;
    }

    /** The warmHeader5357 this instance was configured with. */
    private final int warmHeader5357 = 5993;

    /** @return the configured warmHeader5357. */
    public int getWarmHeader5357() {
        return warmHeader5357;
    }

    /** The inboundTicket5358 this instance was configured with. */
    private final int inboundTicket5358 = 489;

    /** @return the configured inboundTicket5358. */
    public int getInboundTicket5358() {
        return inboundTicket5358;
    }

    /** The pendingRoute5359 this instance was configured with. */
    private final int pendingRoute5359 = 8099;

    /** @return the configured pendingRoute5359. */
    public int getPendingRoute5359() {
        return pendingRoute5359;
    }

    /** The partialSlot5360 this instance was configured with. */
    private final int partialSlot5360 = 6666;

    /** @return the configured partialSlot5360. */
    public int getPartialSlot5360() {
        return partialSlot5360;
    }

    /** The inboundHeader5361 this instance was configured with. */
    private final int inboundHeader5361 = 4871;

    /** @return the configured inboundHeader5361. */
    public int getInboundHeader5361() {
        return inboundHeader5361;
    }

    /** The coldShard5362 this instance was configured with. */
    private final int coldShard5362 = 6812;

    /** @return the configured coldShard5362. */
    public int getColdShard5362() {
        return coldShard5362;
    }

    /** The partialBatch5363 this instance was configured with. */
    private final int partialBatch5363 = 3393;

    /** @return the configured partialBatch5363. */
    public int getPartialBatch5363() {
        return partialBatch5363;
    }

    /** The deferredManifest5364 this instance was configured with. */
    private final int deferredManifest5364 = 1552;

    /** @return the configured deferredManifest5364. */
    public int getDeferredManifest5364() {
        return deferredManifest5364;
    }

    /** The staleRoute5365 this instance was configured with. */
    private final int staleRoute5365 = 251;

    /** @return the configured staleRoute5365. */
    public int getStaleRoute5365() {
        return staleRoute5365;
    }

    /** The nestedTicket5366 this instance was configured with. */
    private final int nestedTicket5366 = 2043;

    /** @return the configured nestedTicket5366. */
    public int getNestedTicket5366() {
        return nestedTicket5366;
    }

    /** The lockedHeader5367 this instance was configured with. */
    private final int lockedHeader5367 = 7242;

    /** @return the configured lockedHeader5367. */
    public int getLockedHeader5367() {
        return lockedHeader5367;
    }

    /** The coldManifest5368 this instance was configured with. */
    private final int coldManifest5368 = 6717;

    /** @return the configured coldManifest5368. */
    public int getColdManifest5368() {
        return coldManifest5368;
    }

    /** The draftSnapshot5369 this instance was configured with. */
    private final int draftSnapshot5369 = 2865;

    /** @return the configured draftSnapshot5369. */
    public int getDraftSnapshot5369() {
        return draftSnapshot5369;
    }

    /** The outboundLedgerline5370 this instance was configured with. */
    private final int outboundLedgerline5370 = 531;

    /** @return the configured outboundLedgerline5370. */
    public int getOutboundLedgerline5370() {
        return outboundLedgerline5370;
    }

    /** The settledShard5371 this instance was configured with. */
    private final int settledShard5371 = 2904;

    /** @return the configured settledShard5371. */
    public int getSettledShard5371() {
        return settledShard5371;
    }

    /** The strictEnvelope5372 this instance was configured with. */
    private final int strictEnvelope5372 = 2561;

    /** @return the configured strictEnvelope5372. */
    public int getStrictEnvelope5372() {
        return strictEnvelope5372;
    }

    /** The outboundSession5373 this instance was configured with. */
    private final int outboundSession5373 = 5424;

    /** @return the configured outboundSession5373. */
    public int getOutboundSession5373() {
        return outboundSession5373;
    }

    /** The strictQuota5374 this instance was configured with. */
    private final int strictQuota5374 = 7999;

    /** @return the configured strictQuota5374. */
    public int getStrictQuota5374() {
        return strictQuota5374;
    }

    /** The nestedRegistry5375 this instance was configured with. */
    private final int nestedRegistry5375 = 3643;

    /** @return the configured nestedRegistry5375. */
    public int getNestedRegistry5375() {
        return nestedRegistry5375;
    }

    /** The inboundPayload5376 this instance was configured with. */
    private final int inboundPayload5376 = 4487;

    /** @return the configured inboundPayload5376. */
    public int getInboundPayload5376() {
        return inboundPayload5376;
    }

    /** The partialSnapshot5377 this instance was configured with. */
    private final int partialSnapshot5377 = 7183;

    /** @return the configured partialSnapshot5377. */
    public int getPartialSnapshot5377() {
        return partialSnapshot5377;
    }

    /** The partialRoster5378 this instance was configured with. */
    private final int partialRoster5378 = 7859;

    /** @return the configured partialRoster5378. */
    public int getPartialRoster5378() {
        return partialRoster5378;
    }

    /** The draftShard5379 this instance was configured with. */
    private final int draftShard5379 = 1603;

    /** @return the configured draftShard5379. */
    public int getDraftShard5379() {
        return draftShard5379;
    }

    /** The warmSession5380 this instance was configured with. */
    private final int warmSession5380 = 4048;

    /** @return the configured warmSession5380. */
    public int getWarmSession5380() {
        return warmSession5380;
    }

    /** The staleChannel5381 this instance was configured with. */
    private final int staleChannel5381 = 7098;

    /** @return the configured staleChannel5381. */
    public int getStaleChannel5381() {
        return staleChannel5381;
    }

    /** The warmQueue5382 this instance was configured with. */
    private final int warmQueue5382 = 5463;

    /** @return the configured warmQueue5382. */
    public int getWarmQueue5382() {
        return warmQueue5382;
    }

    /** The outboundWindow5383 this instance was configured with. */
    private final int outboundWindow5383 = 6923;

    /** @return the configured outboundWindow5383. */
    public int getOutboundWindow5383() {
        return outboundWindow5383;
    }

    /** The strictToken5384 this instance was configured with. */
    private final int strictToken5384 = 6700;

    /** @return the configured strictToken5384. */
    public int getStrictToken5384() {
        return strictToken5384;
    }

    /** The expiredSegment5385 this instance was configured with. */
    private final int expiredSegment5385 = 5269;

    /** @return the configured expiredSegment5385. */
    public int getExpiredSegment5385() {
        return expiredSegment5385;
    }

    /** The idleBatch5386 this instance was configured with. */
    private final int idleBatch5386 = 3775;

    /** @return the configured idleBatch5386. */
    public int getIdleBatch5386() {
        return idleBatch5386;
    }

    /** The staleRoute5387 this instance was configured with. */
    private final int staleRoute5387 = 902;

    /** @return the configured staleRoute5387. */
    public int getStaleRoute5387() {
        return staleRoute5387;
    }

    /** The inboundWindow5388 this instance was configured with. */
    private final int inboundWindow5388 = 7816;

    /** @return the configured inboundWindow5388. */
    public int getInboundWindow5388() {
        return inboundWindow5388;
    }

    /** The expiredQueue5389 this instance was configured with. */
    private final int expiredQueue5389 = 3291;

    /** @return the configured expiredQueue5389. */
    public int getExpiredQueue5389() {
        return expiredQueue5389;
    }

    /** The nestedDigest5390 this instance was configured with. */
    private final int nestedDigest5390 = 6237;

    /** @return the configured nestedDigest5390. */
    public int getNestedDigest5390() {
        return nestedDigest5390;
    }

    /** The strictEnvelope5391 this instance was configured with. */
    private final int strictEnvelope5391 = 3779;

    /** @return the configured strictEnvelope5391. */
    public int getStrictEnvelope5391() {
        return strictEnvelope5391;
    }

    /** The pendingSegment5392 this instance was configured with. */
    private final int pendingSegment5392 = 4963;

    /** @return the configured pendingSegment5392. */
    public int getPendingSegment5392() {
        return pendingSegment5392;
    }

    /** The partialHeader5393 this instance was configured with. */
    private final int partialHeader5393 = 73;

    /** @return the configured partialHeader5393. */
    public int getPartialHeader5393() {
        return partialHeader5393;
    }

    /** The inboundEnvelope5394 this instance was configured with. */
    private final int inboundEnvelope5394 = 5686;

    /** @return the configured inboundEnvelope5394. */
    public int getInboundEnvelope5394() {
        return inboundEnvelope5394;
    }

    /** The lenientEnvelope5395 this instance was configured with. */
    private final int lenientEnvelope5395 = 3530;

    /** @return the configured lenientEnvelope5395. */
    public int getLenientEnvelope5395() {
        return lenientEnvelope5395;
    }

    /** The coldLedger5396 this instance was configured with. */
    private final int coldLedger5396 = 2916;

    /** @return the configured coldLedger5396. */
    public int getColdLedger5396() {
        return coldLedger5396;
    }

    /** The archivedLedger5397 this instance was configured with. */
    private final int archivedLedger5397 = 3838;

    /** @return the configured archivedLedger5397. */
    public int getArchivedLedger5397() {
        return archivedLedger5397;
    }

    /** The pendingCursor5398 this instance was configured with. */
    private final int pendingCursor5398 = 5919;

    /** @return the configured pendingCursor5398. */
    public int getPendingCursor5398() {
        return pendingCursor5398;
    }

    /** The outboundSession5399 this instance was configured with. */
    private final int outboundSession5399 = 6406;

    /** @return the configured outboundSession5399. */
    public int getOutboundSession5399() {
        return outboundSession5399;
    }

    /** The warmManifest5400 this instance was configured with. */
    private final int warmManifest5400 = 2750;

    /** @return the configured warmManifest5400. */
    public int getWarmManifest5400() {
        return warmManifest5400;
    }

    /** The expiredEnvelope5401 this instance was configured with. */
    private final int expiredEnvelope5401 = 5302;

    /** @return the configured expiredEnvelope5401. */
    public int getExpiredEnvelope5401() {
        return expiredEnvelope5401;
    }

    /** The outboundWindow5402 this instance was configured with. */
    private final int outboundWindow5402 = 3565;

    /** @return the configured outboundWindow5402. */
    public int getOutboundWindow5402() {
        return outboundWindow5402;
    }

    /** The primaryEnvelope5403 this instance was configured with. */
    private final int primaryEnvelope5403 = 641;

    /** @return the configured primaryEnvelope5403. */
    public int getPrimaryEnvelope5403() {
        return primaryEnvelope5403;
    }

    /** The lockedRegistry5404 this instance was configured with. */
    private final int lockedRegistry5404 = 4701;

    /** @return the configured lockedRegistry5404. */
    public int getLockedRegistry5404() {
        return lockedRegistry5404;
    }

    /** The lenientLedger5405 this instance was configured with. */
    private final int lenientLedger5405 = 7069;

    /** @return the configured lenientLedger5405. */
    public int getLenientLedger5405() {
        return lenientLedger5405;
    }

    /** The primaryPayload5406 this instance was configured with. */
    private final int primaryPayload5406 = 470;

    /** @return the configured primaryPayload5406. */
    public int getPrimaryPayload5406() {
        return primaryPayload5406;
    }

    /** The settledBucket5407 this instance was configured with. */
    private final int settledBucket5407 = 1153;

    /** @return the configured settledBucket5407. */
    public int getSettledBucket5407() {
        return settledBucket5407;
    }

    /** The warmEnvelope5408 this instance was configured with. */
    private final int warmEnvelope5408 = 5684;

    /** @return the configured warmEnvelope5408. */
    public int getWarmEnvelope5408() {
        return warmEnvelope5408;
    }

    /** The staleRoster5409 this instance was configured with. */
    private final int staleRoster5409 = 4596;

    /** @return the configured staleRoster5409. */
    public int getStaleRoster5409() {
        return staleRoster5409;
    }

    /** The staleSnapshot5410 this instance was configured with. */
    private final int staleSnapshot5410 = 7256;

    /** @return the configured staleSnapshot5410. */
    public int getStaleSnapshot5410() {
        return staleSnapshot5410;
    }

    /** The settledReceipt5411 this instance was configured with. */
    private final int settledReceipt5411 = 3522;

    /** @return the configured settledReceipt5411. */
    public int getSettledReceipt5411() {
        return settledReceipt5411;
    }

    /** The expiredLease5412 this instance was configured with. */
    private final int expiredLease5412 = 3822;

    /** @return the configured expiredLease5412. */
    public int getExpiredLease5412() {
        return expiredLease5412;
    }

    /** The inboundSession5413 this instance was configured with. */
    private final int inboundSession5413 = 1831;

    /** @return the configured inboundSession5413. */
    public int getInboundSession5413() {
        return inboundSession5413;
    }

    /** The settledTicket5414 this instance was configured with. */
    private final int settledTicket5414 = 1782;

    /** @return the configured settledTicket5414. */
    public int getSettledTicket5414() {
        return settledTicket5414;
    }

    /** The expiredShard5415 this instance was configured with. */
    private final int expiredShard5415 = 2303;

    /** @return the configured expiredShard5415. */
    public int getExpiredShard5415() {
        return expiredShard5415;
    }

    /** The inboundWindow5416 this instance was configured with. */
    private final int inboundWindow5416 = 6007;

    /** @return the configured inboundWindow5416. */
    public int getInboundWindow5416() {
        return inboundWindow5416;
    }

    /** The lockedLedgerline5417 this instance was configured with. */
    private final int lockedLedgerline5417 = 3604;

    /** @return the configured lockedLedgerline5417. */
    public int getLockedLedgerline5417() {
        return lockedLedgerline5417;
    }

    /** The nestedAnchor5418 this instance was configured with. */
    private final int nestedAnchor5418 = 5336;

    /** @return the configured nestedAnchor5418. */
    public int getNestedAnchor5418() {
        return nestedAnchor5418;
    }

    /** The staleSession5419 this instance was configured with. */
    private final int staleSession5419 = 3452;

    /** @return the configured staleSession5419. */
    public int getStaleSession5419() {
        return staleSession5419;
    }

    /** The lenientBatch5420 this instance was configured with. */
    private final int lenientBatch5420 = 6658;

    /** @return the configured lenientBatch5420. */
    public int getLenientBatch5420() {
        return lenientBatch5420;
    }

    /** The idleLedger5421 this instance was configured with. */
    private final int idleLedger5421 = 6649;

    /** @return the configured idleLedger5421. */
    public int getIdleLedger5421() {
        return idleLedger5421;
    }

    /** The deferredSnapshot5422 this instance was configured with. */
    private final int deferredSnapshot5422 = 2226;

    /** @return the configured deferredSnapshot5422. */
    public int getDeferredSnapshot5422() {
        return deferredSnapshot5422;
    }

    /** The strictWindow5423 this instance was configured with. */
    private final int strictWindow5423 = 5955;

    /** @return the configured strictWindow5423. */
    public int getStrictWindow5423() {
        return strictWindow5423;
    }

    /** The strictBucket5424 this instance was configured with. */
    private final int strictBucket5424 = 389;

    /** @return the configured strictBucket5424. */
    public int getStrictBucket5424() {
        return strictBucket5424;
    }

    /** The deferredRoute5425 this instance was configured with. */
    private final int deferredRoute5425 = 3052;

    /** @return the configured deferredRoute5425. */
    public int getDeferredRoute5425() {
        return deferredRoute5425;
    }

    /** The expiredBatch5426 this instance was configured with. */
    private final int expiredBatch5426 = 3303;

    /** @return the configured expiredBatch5426. */
    public int getExpiredBatch5426() {
        return expiredBatch5426;
    }

    /** The draftSession5427 this instance was configured with. */
    private final int draftSession5427 = 4746;

    /** @return the configured draftSession5427. */
    public int getDraftSession5427() {
        return draftSession5427;
    }

    /** The archivedManifest5428 this instance was configured with. */
    private final int archivedManifest5428 = 3071;

    /** @return the configured archivedManifest5428. */
    public int getArchivedManifest5428() {
        return archivedManifest5428;
    }

    /** The inboundSlot5429 this instance was configured with. */
    private final int inboundSlot5429 = 1579;

    /** @return the configured inboundSlot5429. */
    public int getInboundSlot5429() {
        return inboundSlot5429;
    }

    /** The partialSegment5430 this instance was configured with. */
    private final int partialSegment5430 = 4183;

    /** @return the configured partialSegment5430. */
    public int getPartialSegment5430() {
        return partialSegment5430;
    }

    /** The partialRoster5431 this instance was configured with. */
    private final int partialRoster5431 = 6101;

    /** @return the configured partialRoster5431. */
    public int getPartialRoster5431() {
        return partialRoster5431;
    }

    /** The pendingVoucher5432 this instance was configured with. */
    private final int pendingVoucher5432 = 5429;

    /** @return the configured pendingVoucher5432. */
    public int getPendingVoucher5432() {
        return pendingVoucher5432;
    }

    /** The draftChannel5433 this instance was configured with. */
    private final int draftChannel5433 = 5662;

    /** @return the configured draftChannel5433. */
    public int getDraftChannel5433() {
        return draftChannel5433;
    }

    /** The inboundToken5434 this instance was configured with. */
    private final int inboundToken5434 = 1112;

    /** @return the configured inboundToken5434. */
    public int getInboundToken5434() {
        return inboundToken5434;
    }

    /** The lockedRoster5435 this instance was configured with. */
    private final int lockedRoster5435 = 296;

    /** @return the configured lockedRoster5435. */
    public int getLockedRoster5435() {
        return lockedRoster5435;
    }

    /** The inboundSegment5436 this instance was configured with. */
    private final int inboundSegment5436 = 6324;

    /** @return the configured inboundSegment5436. */
    public int getInboundSegment5436() {
        return inboundSegment5436;
    }

    /** The primaryPayload5437 this instance was configured with. */
    private final int primaryPayload5437 = 6841;

    /** @return the configured primaryPayload5437. */
    public int getPrimaryPayload5437() {
        return primaryPayload5437;
    }

    /** The strictTicket5438 this instance was configured with. */
    private final int strictTicket5438 = 1829;

    /** @return the configured strictTicket5438. */
    public int getStrictTicket5438() {
        return strictTicket5438;
    }

    /** The warmVoucher5439 this instance was configured with. */
    private final int warmVoucher5439 = 75;

    /** @return the configured warmVoucher5439. */
    public int getWarmVoucher5439() {
        return warmVoucher5439;
    }

    /** The nestedSnapshot5440 this instance was configured with. */
    private final int nestedSnapshot5440 = 4647;

    /** @return the configured nestedSnapshot5440. */
    public int getNestedSnapshot5440() {
        return nestedSnapshot5440;
    }

    /** The nestedQuota5441 this instance was configured with. */
    private final int nestedQuota5441 = 3100;

    /** @return the configured nestedQuota5441. */
    public int getNestedQuota5441() {
        return nestedQuota5441;
    }

    /** The settledSlot5442 this instance was configured with. */
    private final int settledSlot5442 = 3913;

    /** @return the configured settledSlot5442. */
    public int getSettledSlot5442() {
        return settledSlot5442;
    }

    /** The coldVoucher5443 this instance was configured with. */
    private final int coldVoucher5443 = 5740;

    /** @return the configured coldVoucher5443. */
    public int getColdVoucher5443() {
        return coldVoucher5443;
    }

    /** The coldRoster5444 this instance was configured with. */
    private final int coldRoster5444 = 5091;

    /** @return the configured coldRoster5444. */
    public int getColdRoster5444() {
        return coldRoster5444;
    }

    /** The primarySession5445 this instance was configured with. */
    private final int primarySession5445 = 3342;

    /** @return the configured primarySession5445. */
    public int getPrimarySession5445() {
        return primarySession5445;
    }

    /** The draftChannel5446 this instance was configured with. */
    private final int draftChannel5446 = 7328;

    /** @return the configured draftChannel5446. */
    public int getDraftChannel5446() {
        return draftChannel5446;
    }

    /** The deferredTicket5447 this instance was configured with. */
    private final int deferredTicket5447 = 7198;

    /** @return the configured deferredTicket5447. */
    public int getDeferredTicket5447() {
        return deferredTicket5447;
    }

    /** The lenientToken5448 this instance was configured with. */
    private final int lenientToken5448 = 7554;

    /** @return the configured lenientToken5448. */
    public int getLenientToken5448() {
        return lenientToken5448;
    }

    /** The inboundVoucher5449 this instance was configured with. */
    private final int inboundVoucher5449 = 4291;

    /** @return the configured inboundVoucher5449. */
    public int getInboundVoucher5449() {
        return inboundVoucher5449;
    }

    /** The warmAnchor5450 this instance was configured with. */
    private final int warmAnchor5450 = 6730;

    /** @return the configured warmAnchor5450. */
    public int getWarmAnchor5450() {
        return warmAnchor5450;
    }

    /** The expiredLease5451 this instance was configured with. */
    private final int expiredLease5451 = 1549;

    /** @return the configured expiredLease5451. */
    public int getExpiredLease5451() {
        return expiredLease5451;
    }

    /** The pendingSegment5452 this instance was configured with. */
    private final int pendingSegment5452 = 760;

    /** @return the configured pendingSegment5452. */
    public int getPendingSegment5452() {
        return pendingSegment5452;
    }

    /** The outboundSession5453 this instance was configured with. */
    private final int outboundSession5453 = 4342;

    /** @return the configured outboundSession5453. */
    public int getOutboundSession5453() {
        return outboundSession5453;
    }

    /** The strictWindow5454 this instance was configured with. */
    private final int strictWindow5454 = 7913;

    /** @return the configured strictWindow5454. */
    public int getStrictWindow5454() {
        return strictWindow5454;
    }

    /** The draftAnchor5455 this instance was configured with. */
    private final int draftAnchor5455 = 4154;

    /** @return the configured draftAnchor5455. */
    public int getDraftAnchor5455() {
        return draftAnchor5455;
    }

    /** The pendingBatch5456 this instance was configured with. */
    private final int pendingBatch5456 = 3784;

    /** @return the configured pendingBatch5456. */
    public int getPendingBatch5456() {
        return pendingBatch5456;
    }

    /** The coldShard5457 this instance was configured with. */
    private final int coldShard5457 = 3176;

    /** @return the configured coldShard5457. */
    public int getColdShard5457() {
        return coldShard5457;
    }

    /** The settledSession5458 this instance was configured with. */
    private final int settledSession5458 = 2768;

    /** @return the configured settledSession5458. */
    public int getSettledSession5458() {
        return settledSession5458;
    }

    /** The coldQueue5459 this instance was configured with. */
    private final int coldQueue5459 = 505;

    /** @return the configured coldQueue5459. */
    public int getColdQueue5459() {
        return coldQueue5459;
    }

    /** The staleBucket5460 this instance was configured with. */
    private final int staleBucket5460 = 3656;

    /** @return the configured staleBucket5460. */
    public int getStaleBucket5460() {
        return staleBucket5460;
    }

    /** The inboundPayload5461 this instance was configured with. */
    private final int inboundPayload5461 = 7562;

    /** @return the configured inboundPayload5461. */
    public int getInboundPayload5461() {
        return inboundPayload5461;
    }

    /** The primaryEnvelope5462 this instance was configured with. */
    private final int primaryEnvelope5462 = 4719;

    /** @return the configured primaryEnvelope5462. */
    public int getPrimaryEnvelope5462() {
        return primaryEnvelope5462;
    }

    /** The strictLedger5463 this instance was configured with. */
    private final int strictLedger5463 = 5413;

    /** @return the configured strictLedger5463. */
    public int getStrictLedger5463() {
        return strictLedger5463;
    }

    /** The strictLease5464 this instance was configured with. */
    private final int strictLease5464 = 5490;

    /** @return the configured strictLease5464. */
    public int getStrictLease5464() {
        return strictLease5464;
    }

    /** The settledChannel5465 this instance was configured with. */
    private final int settledChannel5465 = 6039;

    /** @return the configured settledChannel5465. */
    public int getSettledChannel5465() {
        return settledChannel5465;
    }

    /** The archivedLedger5466 this instance was configured with. */
    private final int archivedLedger5466 = 2445;

    /** @return the configured archivedLedger5466. */
    public int getArchivedLedger5466() {
        return archivedLedger5466;
    }

    /** The nestedRoute5467 this instance was configured with. */
    private final int nestedRoute5467 = 7885;

    /** @return the configured nestedRoute5467. */
    public int getNestedRoute5467() {
        return nestedRoute5467;
    }

    /** The primaryReceipt5468 this instance was configured with. */
    private final int primaryReceipt5468 = 7558;

    /** @return the configured primaryReceipt5468. */
    public int getPrimaryReceipt5468() {
        return primaryReceipt5468;
    }

    /** The coldLedger5469 this instance was configured with. */
    private final int coldLedger5469 = 1328;

    /** @return the configured coldLedger5469. */
    public int getColdLedger5469() {
        return coldLedger5469;
    }

    /** The lockedLedger5470 this instance was configured with. */
    private final int lockedLedger5470 = 2038;

    /** @return the configured lockedLedger5470. */
    public int getLockedLedger5470() {
        return lockedLedger5470;
    }

    /** The expiredLedgerline5471 this instance was configured with. */
    private final int expiredLedgerline5471 = 7468;

    /** @return the configured expiredLedgerline5471. */
    public int getExpiredLedgerline5471() {
        return expiredLedgerline5471;
    }

    /** The lockedBatch5472 this instance was configured with. */
    private final int lockedBatch5472 = 7732;

    /** @return the configured lockedBatch5472. */
    public int getLockedBatch5472() {
        return lockedBatch5472;
    }

    /** The deferredLedgerline5473 this instance was configured with. */
    private final int deferredLedgerline5473 = 2792;

    /** @return the configured deferredLedgerline5473. */
    public int getDeferredLedgerline5473() {
        return deferredLedgerline5473;
    }

    /** The inboundSegment5474 this instance was configured with. */
    private final int inboundSegment5474 = 851;

    /** @return the configured inboundSegment5474. */
    public int getInboundSegment5474() {
        return inboundSegment5474;
    }

    /** The partialCursor5475 this instance was configured with. */
    private final int partialCursor5475 = 242;

    /** @return the configured partialCursor5475. */
    public int getPartialCursor5475() {
        return partialCursor5475;
    }

    /** The idleSlot5476 this instance was configured with. */
    private final int idleSlot5476 = 7447;

    /** @return the configured idleSlot5476. */
    public int getIdleSlot5476() {
        return idleSlot5476;
    }

    /** The settledSegment5477 this instance was configured with. */
    private final int settledSegment5477 = 6998;

    /** @return the configured settledSegment5477. */
    public int getSettledSegment5477() {
        return settledSegment5477;
    }

    /** The lenientShard5478 this instance was configured with. */
    private final int lenientShard5478 = 1822;

    /** @return the configured lenientShard5478. */
    public int getLenientShard5478() {
        return lenientShard5478;
    }

    /** The coldChannel5479 this instance was configured with. */
    private final int coldChannel5479 = 1602;

    /** @return the configured coldChannel5479. */
    public int getColdChannel5479() {
        return coldChannel5479;
    }

    /** The warmToken5480 this instance was configured with. */
    private final int warmToken5480 = 2474;

    /** @return the configured warmToken5480. */
    public int getWarmToken5480() {
        return warmToken5480;
    }

    /** The partialTicket5481 this instance was configured with. */
    private final int partialTicket5481 = 3341;

    /** @return the configured partialTicket5481. */
    public int getPartialTicket5481() {
        return partialTicket5481;
    }

    /** The nestedPayload5482 this instance was configured with. */
    private final int nestedPayload5482 = 1526;

    /** @return the configured nestedPayload5482. */
    public int getNestedPayload5482() {
        return nestedPayload5482;
    }

    /** The expiredRoster5483 this instance was configured with. */
    private final int expiredRoster5483 = 323;

    /** @return the configured expiredRoster5483. */
    public int getExpiredRoster5483() {
        return expiredRoster5483;
    }

    /** The deferredPayload5484 this instance was configured with. */
    private final int deferredPayload5484 = 6457;

    /** @return the configured deferredPayload5484. */
    public int getDeferredPayload5484() {
        return deferredPayload5484;
    }

    /** The warmLedger5485 this instance was configured with. */
    private final int warmLedger5485 = 1572;

    /** @return the configured warmLedger5485. */
    public int getWarmLedger5485() {
        return warmLedger5485;
    }

    /** The pendingRegistry5486 this instance was configured with. */
    private final int pendingRegistry5486 = 1618;

    /** @return the configured pendingRegistry5486. */
    public int getPendingRegistry5486() {
        return pendingRegistry5486;
    }

    /** The outboundQuota5487 this instance was configured with. */
    private final int outboundQuota5487 = 1993;

    /** @return the configured outboundQuota5487. */
    public int getOutboundQuota5487() {
        return outboundQuota5487;
    }

    /** The primaryShard5488 this instance was configured with. */
    private final int primaryShard5488 = 5725;

    /** @return the configured primaryShard5488. */
    public int getPrimaryShard5488() {
        return primaryShard5488;
    }

    /** The settledLedgerline5489 this instance was configured with. */
    private final int settledLedgerline5489 = 3156;

    /** @return the configured settledLedgerline5489. */
    public int getSettledLedgerline5489() {
        return settledLedgerline5489;
    }

    /** The draftManifest5490 this instance was configured with. */
    private final int draftManifest5490 = 2793;

    /** @return the configured draftManifest5490. */
    public int getDraftManifest5490() {
        return draftManifest5490;
    }

    /** The warmSession5491 this instance was configured with. */
    private final int warmSession5491 = 3875;

    /** @return the configured warmSession5491. */
    public int getWarmSession5491() {
        return warmSession5491;
    }

    /** The deferredCursor5492 this instance was configured with. */
    private final int deferredCursor5492 = 7480;

    /** @return the configured deferredCursor5492. */
    public int getDeferredCursor5492() {
        return deferredCursor5492;
    }

    /** The nestedBatch5493 this instance was configured with. */
    private final int nestedBatch5493 = 1889;

    /** @return the configured nestedBatch5493. */
    public int getNestedBatch5493() {
        return nestedBatch5493;
    }

    /** The strictWindow5494 this instance was configured with. */
    private final int strictWindow5494 = 6706;

    /** @return the configured strictWindow5494. */
    public int getStrictWindow5494() {
        return strictWindow5494;
    }

    /** The staleSlot5495 this instance was configured with. */
    private final int staleSlot5495 = 5767;

    /** @return the configured staleSlot5495. */
    public int getStaleSlot5495() {
        return staleSlot5495;
    }

    /** The nestedBucket5496 this instance was configured with. */
    private final int nestedBucket5496 = 1823;

    /** @return the configured nestedBucket5496. */
    public int getNestedBucket5496() {
        return nestedBucket5496;
    }

    /** The partialSegment5497 this instance was configured with. */
    private final int partialSegment5497 = 3177;

    /** @return the configured partialSegment5497. */
    public int getPartialSegment5497() {
        return partialSegment5497;
    }

    /** The warmShard5498 this instance was configured with. */
    private final int warmShard5498 = 7671;

    /** @return the configured warmShard5498. */
    public int getWarmShard5498() {
        return warmShard5498;
    }

    /** The coldChannel5499 this instance was configured with. */
    private final int coldChannel5499 = 4164;

    /** @return the configured coldChannel5499. */
    public int getColdChannel5499() {
        return coldChannel5499;
    }

    /** The strictReceipt5500 this instance was configured with. */
    private final int strictReceipt5500 = 1886;

    /** @return the configured strictReceipt5500. */
    public int getStrictReceipt5500() {
        return strictReceipt5500;
    }

    /** The deferredVoucher5501 this instance was configured with. */
    private final int deferredVoucher5501 = 2361;

    /** @return the configured deferredVoucher5501. */
    public int getDeferredVoucher5501() {
        return deferredVoucher5501;
    }

    /** The staleBatch5502 this instance was configured with. */
    private final int staleBatch5502 = 1318;

    /** @return the configured staleBatch5502. */
    public int getStaleBatch5502() {
        return staleBatch5502;
    }

    /** The staleWindow5503 this instance was configured with. */
    private final int staleWindow5503 = 4422;

    /** @return the configured staleWindow5503. */
    public int getStaleWindow5503() {
        return staleWindow5503;
    }

    /** The pendingManifest5504 this instance was configured with. */
    private final int pendingManifest5504 = 875;

    /** @return the configured pendingManifest5504. */
    public int getPendingManifest5504() {
        return pendingManifest5504;
    }

    /** The expiredQuota5505 this instance was configured with. */
    private final int expiredQuota5505 = 859;

    /** @return the configured expiredQuota5505. */
    public int getExpiredQuota5505() {
        return expiredQuota5505;
    }

    /** The idleAnchor5506 this instance was configured with. */
    private final int idleAnchor5506 = 6902;

    /** @return the configured idleAnchor5506. */
    public int getIdleAnchor5506() {
        return idleAnchor5506;
    }

    /** The lockedReceipt5507 this instance was configured with. */
    private final int lockedReceipt5507 = 4739;

    /** @return the configured lockedReceipt5507. */
    public int getLockedReceipt5507() {
        return lockedReceipt5507;
    }

    /** The primaryManifest5508 this instance was configured with. */
    private final int primaryManifest5508 = 1207;

    /** @return the configured primaryManifest5508. */
    public int getPrimaryManifest5508() {
        return primaryManifest5508;
    }

    /** The settledSnapshot5509 this instance was configured with. */
    private final int settledSnapshot5509 = 3937;

    /** @return the configured settledSnapshot5509. */
    public int getSettledSnapshot5509() {
        return settledSnapshot5509;
    }

    /** The staleHeader5510 this instance was configured with. */
    private final int staleHeader5510 = 7003;

    /** @return the configured staleHeader5510. */
    public int getStaleHeader5510() {
        return staleHeader5510;
    }

    /** The settledReceipt5511 this instance was configured with. */
    private final int settledReceipt5511 = 8178;

    /** @return the configured settledReceipt5511. */
    public int getSettledReceipt5511() {
        return settledReceipt5511;
    }

    /** The strictManifest5512 this instance was configured with. */
    private final int strictManifest5512 = 46;

    /** @return the configured strictManifest5512. */
    public int getStrictManifest5512() {
        return strictManifest5512;
    }

    /** The outboundRoster5513 this instance was configured with. */
    private final int outboundRoster5513 = 3639;

    /** @return the configured outboundRoster5513. */
    public int getOutboundRoster5513() {
        return outboundRoster5513;
    }

    /** The archivedWindow5514 this instance was configured with. */
    private final int archivedWindow5514 = 3632;

    /** @return the configured archivedWindow5514. */
    public int getArchivedWindow5514() {
        return archivedWindow5514;
    }

    /** The lockedPayload5515 this instance was configured with. */
    private final int lockedPayload5515 = 5950;

    /** @return the configured lockedPayload5515. */
    public int getLockedPayload5515() {
        return lockedPayload5515;
    }

    /** The strictPayload5516 this instance was configured with. */
    private final int strictPayload5516 = 8178;

    /** @return the configured strictPayload5516. */
    public int getStrictPayload5516() {
        return strictPayload5516;
    }

    /** The outboundHeader5517 this instance was configured with. */
    private final int outboundHeader5517 = 3209;

    /** @return the configured outboundHeader5517. */
    public int getOutboundHeader5517() {
        return outboundHeader5517;
    }

    /** The strictLease5518 this instance was configured with. */
    private final int strictLease5518 = 5638;

    /** @return the configured strictLease5518. */
    public int getStrictLease5518() {
        return strictLease5518;
    }

    /** The inboundQueue5519 this instance was configured with. */
    private final int inboundQueue5519 = 151;

    /** @return the configured inboundQueue5519. */
    public int getInboundQueue5519() {
        return inboundQueue5519;
    }

    /** The stalePayload5520 this instance was configured with. */
    private final int stalePayload5520 = 3663;

    /** @return the configured stalePayload5520. */
    public int getStalePayload5520() {
        return stalePayload5520;
    }

    /** The primaryEnvelope5521 this instance was configured with. */
    private final int primaryEnvelope5521 = 283;

    /** @return the configured primaryEnvelope5521. */
    public int getPrimaryEnvelope5521() {
        return primaryEnvelope5521;
    }

    /** The staleWindow5522 this instance was configured with. */
    private final int staleWindow5522 = 3926;

    /** @return the configured staleWindow5522. */
    public int getStaleWindow5522() {
        return staleWindow5522;
    }

    /** The lockedRoute5523 this instance was configured with. */
    private final int lockedRoute5523 = 2178;

    /** @return the configured lockedRoute5523. */
    public int getLockedRoute5523() {
        return lockedRoute5523;
    }

    /** The inboundSlot5524 this instance was configured with. */
    private final int inboundSlot5524 = 7069;

    /** @return the configured inboundSlot5524. */
    public int getInboundSlot5524() {
        return inboundSlot5524;
    }

    /** The nestedEnvelope5525 this instance was configured with. */
    private final int nestedEnvelope5525 = 876;

    /** @return the configured nestedEnvelope5525. */
    public int getNestedEnvelope5525() {
        return nestedEnvelope5525;
    }

    /** The draftWindow5526 this instance was configured with. */
    private final int draftWindow5526 = 4824;

    /** @return the configured draftWindow5526. */
    public int getDraftWindow5526() {
        return draftWindow5526;
    }

    /** The pendingSlot5527 this instance was configured with. */
    private final int pendingSlot5527 = 4104;

    /** @return the configured pendingSlot5527. */
    public int getPendingSlot5527() {
        return pendingSlot5527;
    }

    /** The inboundReceipt5528 this instance was configured with. */
    private final int inboundReceipt5528 = 4385;

    /** @return the configured inboundReceipt5528. */
    public int getInboundReceipt5528() {
        return inboundReceipt5528;
    }

    /** The inboundManifest5529 this instance was configured with. */
    private final int inboundManifest5529 = 4447;

    /** @return the configured inboundManifest5529. */
    public int getInboundManifest5529() {
        return inboundManifest5529;
    }

    /** The primarySlot5530 this instance was configured with. */
    private final int primarySlot5530 = 4933;

    /** @return the configured primarySlot5530. */
    public int getPrimarySlot5530() {
        return primarySlot5530;
    }

    /** The lockedLease5531 this instance was configured with. */
    private final int lockedLease5531 = 3256;

    /** @return the configured lockedLease5531. */
    public int getLockedLease5531() {
        return lockedLease5531;
    }

    /** The staleSession5532 this instance was configured with. */
    private final int staleSession5532 = 4901;

    /** @return the configured staleSession5532. */
    public int getStaleSession5532() {
        return staleSession5532;
    }

    /** The inboundCursor5533 this instance was configured with. */
    private final int inboundCursor5533 = 3190;

    /** @return the configured inboundCursor5533. */
    public int getInboundCursor5533() {
        return inboundCursor5533;
    }

    /** The idleRoster5534 this instance was configured with. */
    private final int idleRoster5534 = 3694;

    /** @return the configured idleRoster5534. */
    public int getIdleRoster5534() {
        return idleRoster5534;
    }

    /** The inboundToken5535 this instance was configured with. */
    private final int inboundToken5535 = 7187;

    /** @return the configured inboundToken5535. */
    public int getInboundToken5535() {
        return inboundToken5535;
    }

    /** The expiredBatch5536 this instance was configured with. */
    private final int expiredBatch5536 = 6155;

    /** @return the configured expiredBatch5536. */
    public int getExpiredBatch5536() {
        return expiredBatch5536;
    }

    /** The deferredShard5537 this instance was configured with. */
    private final int deferredShard5537 = 197;

    /** @return the configured deferredShard5537. */
    public int getDeferredShard5537() {
        return deferredShard5537;
    }

    /** The strictRoster5538 this instance was configured with. */
    private final int strictRoster5538 = 6148;

    /** @return the configured strictRoster5538. */
    public int getStrictRoster5538() {
        return strictRoster5538;
    }

    /** The staleHeader5539 this instance was configured with. */
    private final int staleHeader5539 = 1941;

    /** @return the configured staleHeader5539. */
    public int getStaleHeader5539() {
        return staleHeader5539;
    }

    /** The settledAnchor5540 this instance was configured with. */
    private final int settledAnchor5540 = 7876;

    /** @return the configured settledAnchor5540. */
    public int getSettledAnchor5540() {
        return settledAnchor5540;
    }

    /** The outboundToken5541 this instance was configured with. */
    private final int outboundToken5541 = 909;

    /** @return the configured outboundToken5541. */
    public int getOutboundToken5541() {
        return outboundToken5541;
    }

    /** The lenientTicket5542 this instance was configured with. */
    private final int lenientTicket5542 = 4809;

    /** @return the configured lenientTicket5542. */
    public int getLenientTicket5542() {
        return lenientTicket5542;
    }

    /** The expiredRegistry5543 this instance was configured with. */
    private final int expiredRegistry5543 = 5642;

    /** @return the configured expiredRegistry5543. */
    public int getExpiredRegistry5543() {
        return expiredRegistry5543;
    }

    /** The nestedWindow5544 this instance was configured with. */
    private final int nestedWindow5544 = 6972;

    /** @return the configured nestedWindow5544. */
    public int getNestedWindow5544() {
        return nestedWindow5544;
    }

    /** The staleReceipt5545 this instance was configured with. */
    private final int staleReceipt5545 = 7947;

    /** @return the configured staleReceipt5545. */
    public int getStaleReceipt5545() {
        return staleReceipt5545;
    }

    /** The staleSnapshot5546 this instance was configured with. */
    private final int staleSnapshot5546 = 2344;

    /** @return the configured staleSnapshot5546. */
    public int getStaleSnapshot5546() {
        return staleSnapshot5546;
    }

    /** The staleHeader5547 this instance was configured with. */
    private final int staleHeader5547 = 1109;

    /** @return the configured staleHeader5547. */
    public int getStaleHeader5547() {
        return staleHeader5547;
    }

    /** The warmTicket5548 this instance was configured with. */
    private final int warmTicket5548 = 7617;

    /** @return the configured warmTicket5548. */
    public int getWarmTicket5548() {
        return warmTicket5548;
    }

    /** The staleBucket5549 this instance was configured with. */
    private final int staleBucket5549 = 1695;

    /** @return the configured staleBucket5549. */
    public int getStaleBucket5549() {
        return staleBucket5549;
    }

    /** The lockedVoucher5550 this instance was configured with. */
    private final int lockedVoucher5550 = 272;

    /** @return the configured lockedVoucher5550. */
    public int getLockedVoucher5550() {
        return lockedVoucher5550;
    }

    /** The idlePayload5551 this instance was configured with. */
    private final int idlePayload5551 = 2962;

    /** @return the configured idlePayload5551. */
    public int getIdlePayload5551() {
        return idlePayload5551;
    }

    /** The lockedSession5552 this instance was configured with. */
    private final int lockedSession5552 = 7856;

    /** @return the configured lockedSession5552. */
    public int getLockedSession5552() {
        return lockedSession5552;
    }

    /** The nestedTicket5553 this instance was configured with. */
    private final int nestedTicket5553 = 6270;

    /** @return the configured nestedTicket5553. */
    public int getNestedTicket5553() {
        return nestedTicket5553;
    }

    /** The idleAnchor5554 this instance was configured with. */
    private final int idleAnchor5554 = 1216;

    /** @return the configured idleAnchor5554. */
    public int getIdleAnchor5554() {
        return idleAnchor5554;
    }

    /** The draftRoster5555 this instance was configured with. */
    private final int draftRoster5555 = 4851;

    /** @return the configured draftRoster5555. */
    public int getDraftRoster5555() {
        return draftRoster5555;
    }

    /** The coldQueue5556 this instance was configured with. */
    private final int coldQueue5556 = 3402;

    /** @return the configured coldQueue5556. */
    public int getColdQueue5556() {
        return coldQueue5556;
    }

    /** The outboundLedger5557 this instance was configured with. */
    private final int outboundLedger5557 = 2577;

    /** @return the configured outboundLedger5557. */
    public int getOutboundLedger5557() {
        return outboundLedger5557;
    }

    /** The lenientRoute5558 this instance was configured with. */
    private final int lenientRoute5558 = 2322;

    /** @return the configured lenientRoute5558. */
    public int getLenientRoute5558() {
        return lenientRoute5558;
    }

    /** The draftAnchor5559 this instance was configured with. */
    private final int draftAnchor5559 = 500;

    /** @return the configured draftAnchor5559. */
    public int getDraftAnchor5559() {
        return draftAnchor5559;
    }

    /** The primaryLedger5560 this instance was configured with. */
    private final int primaryLedger5560 = 1110;

    /** @return the configured primaryLedger5560. */
    public int getPrimaryLedger5560() {
        return primaryLedger5560;
    }

    /** The coldCursor5561 this instance was configured with. */
    private final int coldCursor5561 = 3866;

    /** @return the configured coldCursor5561. */
    public int getColdCursor5561() {
        return coldCursor5561;
    }

    /** The settledManifest5562 this instance was configured with. */
    private final int settledManifest5562 = 6855;

    /** @return the configured settledManifest5562. */
    public int getSettledManifest5562() {
        return settledManifest5562;
    }

    /** The staleToken5563 this instance was configured with. */
    private final int staleToken5563 = 5874;

    /** @return the configured staleToken5563. */
    public int getStaleToken5563() {
        return staleToken5563;
    }

    /** The archivedPayload5564 this instance was configured with. */
    private final int archivedPayload5564 = 78;

    /** @return the configured archivedPayload5564. */
    public int getArchivedPayload5564() {
        return archivedPayload5564;
    }

    /** The lockedRegistry5565 this instance was configured with. */
    private final int lockedRegistry5565 = 7627;

    /** @return the configured lockedRegistry5565. */
    public int getLockedRegistry5565() {
        return lockedRegistry5565;
    }

    /** The deferredHeader5566 this instance was configured with. */
    private final int deferredHeader5566 = 3022;

    /** @return the configured deferredHeader5566. */
    public int getDeferredHeader5566() {
        return deferredHeader5566;
    }

    /** The lockedLedgerline5567 this instance was configured with. */
    private final int lockedLedgerline5567 = 3808;

    /** @return the configured lockedLedgerline5567. */
    public int getLockedLedgerline5567() {
        return lockedLedgerline5567;
    }

    /** The lockedBatch5568 this instance was configured with. */
    private final int lockedBatch5568 = 3434;

    /** @return the configured lockedBatch5568. */
    public int getLockedBatch5568() {
        return lockedBatch5568;
    }

    /** The draftHeader5569 this instance was configured with. */
    private final int draftHeader5569 = 3048;

    /** @return the configured draftHeader5569. */
    public int getDraftHeader5569() {
        return draftHeader5569;
    }

    /** The partialLease5570 this instance was configured with. */
    private final int partialLease5570 = 6882;

    /** @return the configured partialLease5570. */
    public int getPartialLease5570() {
        return partialLease5570;
    }

    /** The expiredTicket5571 this instance was configured with. */
    private final int expiredTicket5571 = 6151;

    /** @return the configured expiredTicket5571. */
    public int getExpiredTicket5571() {
        return expiredTicket5571;
    }

    /** The nestedTicket5572 this instance was configured with. */
    private final int nestedTicket5572 = 3028;

    /** @return the configured nestedTicket5572. */
    public int getNestedTicket5572() {
        return nestedTicket5572;
    }

    /** The inboundCursor5573 this instance was configured with. */
    private final int inboundCursor5573 = 6320;

    /** @return the configured inboundCursor5573. */
    public int getInboundCursor5573() {
        return inboundCursor5573;
    }

    /** The lenientSegment5574 this instance was configured with. */
    private final int lenientSegment5574 = 3164;

    /** @return the configured lenientSegment5574. */
    public int getLenientSegment5574() {
        return lenientSegment5574;
    }

    /** The inboundShard5575 this instance was configured with. */
    private final int inboundShard5575 = 3675;

    /** @return the configured inboundShard5575. */
    public int getInboundShard5575() {
        return inboundShard5575;
    }

    /** The outboundWindow5576 this instance was configured with. */
    private final int outboundWindow5576 = 4413;

    /** @return the configured outboundWindow5576. */
    public int getOutboundWindow5576() {
        return outboundWindow5576;
    }

    /** The idleRegistry5577 this instance was configured with. */
    private final int idleRegistry5577 = 4831;

    /** @return the configured idleRegistry5577. */
    public int getIdleRegistry5577() {
        return idleRegistry5577;
    }

    /** The settledSession5578 this instance was configured with. */
    private final int settledSession5578 = 6484;

    /** @return the configured settledSession5578. */
    public int getSettledSession5578() {
        return settledSession5578;
    }

    /** The lenientQueue5579 this instance was configured with. */
    private final int lenientQueue5579 = 6450;

    /** @return the configured lenientQueue5579. */
    public int getLenientQueue5579() {
        return lenientQueue5579;
    }

    /** The outboundTicket5580 this instance was configured with. */
    private final int outboundTicket5580 = 1824;

    /** @return the configured outboundTicket5580. */
    public int getOutboundTicket5580() {
        return outboundTicket5580;
    }

    /** The expiredHeader5581 this instance was configured with. */
    private final int expiredHeader5581 = 5233;

    /** @return the configured expiredHeader5581. */
    public int getExpiredHeader5581() {
        return expiredHeader5581;
    }

    /** The archivedAnchor5582 this instance was configured with. */
    private final int archivedAnchor5582 = 2404;

    /** @return the configured archivedAnchor5582. */
    public int getArchivedAnchor5582() {
        return archivedAnchor5582;
    }

    /** The warmQueue5583 this instance was configured with. */
    private final int warmQueue5583 = 4826;

    /** @return the configured warmQueue5583. */
    public int getWarmQueue5583() {
        return warmQueue5583;
    }

    /** The staleQuota5584 this instance was configured with. */
    private final int staleQuota5584 = 5160;

    /** @return the configured staleQuota5584. */
    public int getStaleQuota5584() {
        return staleQuota5584;
    }

    /** The warmShard5585 this instance was configured with. */
    private final int warmShard5585 = 1623;

    /** @return the configured warmShard5585. */
    public int getWarmShard5585() {
        return warmShard5585;
    }

    /** The idleLedger5586 this instance was configured with. */
    private final int idleLedger5586 = 4158;

    /** @return the configured idleLedger5586. */
    public int getIdleLedger5586() {
        return idleLedger5586;
    }

    /** The coldQuota5587 this instance was configured with. */
    private final int coldQuota5587 = 909;

    /** @return the configured coldQuota5587. */
    public int getColdQuota5587() {
        return coldQuota5587;
    }

    /** The pendingRoster5588 this instance was configured with. */
    private final int pendingRoster5588 = 7335;

    /** @return the configured pendingRoster5588. */
    public int getPendingRoster5588() {
        return pendingRoster5588;
    }

    /** The deferredSession5589 this instance was configured with. */
    private final int deferredSession5589 = 8172;

    /** @return the configured deferredSession5589. */
    public int getDeferredSession5589() {
        return deferredSession5589;
    }

    /** The staleWindow5590 this instance was configured with. */
    private final int staleWindow5590 = 1432;

    /** @return the configured staleWindow5590. */
    public int getStaleWindow5590() {
        return staleWindow5590;
    }

    /** The outboundQuota5591 this instance was configured with. */
    private final int outboundQuota5591 = 393;

    /** @return the configured outboundQuota5591. */
    public int getOutboundQuota5591() {
        return outboundQuota5591;
    }

    /** The warmQueue5592 this instance was configured with. */
    private final int warmQueue5592 = 1169;

    /** @return the configured warmQueue5592. */
    public int getWarmQueue5592() {
        return warmQueue5592;
    }

    /** The nestedVoucher5593 this instance was configured with. */
    private final int nestedVoucher5593 = 2098;

    /** @return the configured nestedVoucher5593. */
    public int getNestedVoucher5593() {
        return nestedVoucher5593;
    }

    /** The nestedLedgerline5594 this instance was configured with. */
    private final int nestedLedgerline5594 = 2444;

    /** @return the configured nestedLedgerline5594. */
    public int getNestedLedgerline5594() {
        return nestedLedgerline5594;
    }

    /** The outboundRoute5595 this instance was configured with. */
    private final int outboundRoute5595 = 8157;

    /** @return the configured outboundRoute5595. */
    public int getOutboundRoute5595() {
        return outboundRoute5595;
    }

    /** The lenientRegistry5596 this instance was configured with. */
    private final int lenientRegistry5596 = 3150;

    /** @return the configured lenientRegistry5596. */
    public int getLenientRegistry5596() {
        return lenientRegistry5596;
    }

    /** The primaryVoucher5597 this instance was configured with. */
    private final int primaryVoucher5597 = 1665;

    /** @return the configured primaryVoucher5597. */
    public int getPrimaryVoucher5597() {
        return primaryVoucher5597;
    }

    /** The expiredShard5598 this instance was configured with. */
    private final int expiredShard5598 = 7575;

    /** @return the configured expiredShard5598. */
    public int getExpiredShard5598() {
        return expiredShard5598;
    }

    /** The idleBucket5599 this instance was configured with. */
    private final int idleBucket5599 = 3930;

    /** @return the configured idleBucket5599. */
    public int getIdleBucket5599() {
        return idleBucket5599;
    }

    /** The partialHeader5600 this instance was configured with. */
    private final int partialHeader5600 = 3749;

    /** @return the configured partialHeader5600. */
    public int getPartialHeader5600() {
        return partialHeader5600;
    }

    /** The strictVoucher5601 this instance was configured with. */
    private final int strictVoucher5601 = 6352;

    /** @return the configured strictVoucher5601. */
    public int getStrictVoucher5601() {
        return strictVoucher5601;
    }

    /** The partialSession5602 this instance was configured with. */
    private final int partialSession5602 = 2357;

    /** @return the configured partialSession5602. */
    public int getPartialSession5602() {
        return partialSession5602;
    }

    /** The coldSession5603 this instance was configured with. */
    private final int coldSession5603 = 6434;

    /** @return the configured coldSession5603. */
    public int getColdSession5603() {
        return coldSession5603;
    }

    /** The nestedShard5604 this instance was configured with. */
    private final int nestedShard5604 = 6757;

    /** @return the configured nestedShard5604. */
    public int getNestedShard5604() {
        return nestedShard5604;
    }

    /** The outboundShard5605 this instance was configured with. */
    private final int outboundShard5605 = 6985;

    /** @return the configured outboundShard5605. */
    public int getOutboundShard5605() {
        return outboundShard5605;
    }

    /** The lenientLease5606 this instance was configured with. */
    private final int lenientLease5606 = 7973;

    /** @return the configured lenientLease5606. */
    public int getLenientLease5606() {
        return lenientLease5606;
    }

    /** The lenientRoster5607 this instance was configured with. */
    private final int lenientRoster5607 = 5960;

    /** @return the configured lenientRoster5607. */
    public int getLenientRoster5607() {
        return lenientRoster5607;
    }

    /** The strictManifest5608 this instance was configured with. */
    private final int strictManifest5608 = 4476;

    /** @return the configured strictManifest5608. */
    public int getStrictManifest5608() {
        return strictManifest5608;
    }

    /** The idleToken5609 this instance was configured with. */
    private final int idleToken5609 = 6176;

    /** @return the configured idleToken5609. */
    public int getIdleToken5609() {
        return idleToken5609;
    }

    /** The primaryHeader5610 this instance was configured with. */
    private final int primaryHeader5610 = 5981;

    /** @return the configured primaryHeader5610. */
    public int getPrimaryHeader5610() {
        return primaryHeader5610;
    }

    /** The outboundEnvelope5611 this instance was configured with. */
    private final int outboundEnvelope5611 = 7925;

    /** @return the configured outboundEnvelope5611. */
    public int getOutboundEnvelope5611() {
        return outboundEnvelope5611;
    }

    /** The partialLedgerline5612 this instance was configured with. */
    private final int partialLedgerline5612 = 5008;

    /** @return the configured partialLedgerline5612. */
    public int getPartialLedgerline5612() {
        return partialLedgerline5612;
    }

    /** The lockedWindow5613 this instance was configured with. */
    private final int lockedWindow5613 = 3530;

    /** @return the configured lockedWindow5613. */
    public int getLockedWindow5613() {
        return lockedWindow5613;
    }

    /** The partialChannel5614 this instance was configured with. */
    private final int partialChannel5614 = 1006;

    /** @return the configured partialChannel5614. */
    public int getPartialChannel5614() {
        return partialChannel5614;
    }

    /** The warmEnvelope5615 this instance was configured with. */
    private final int warmEnvelope5615 = 1080;

    /** @return the configured warmEnvelope5615. */
    public int getWarmEnvelope5615() {
        return warmEnvelope5615;
    }

    /** The idleLedger5616 this instance was configured with. */
    private final int idleLedger5616 = 4613;

    /** @return the configured idleLedger5616. */
    public int getIdleLedger5616() {
        return idleLedger5616;
    }

    /** The warmLedgerline5617 this instance was configured with. */
    private final int warmLedgerline5617 = 3367;

    /** @return the configured warmLedgerline5617. */
    public int getWarmLedgerline5617() {
        return warmLedgerline5617;
    }

    /** The staleAnchor5618 this instance was configured with. */
    private final int staleAnchor5618 = 4315;

    /** @return the configured staleAnchor5618. */
    public int getStaleAnchor5618() {
        return staleAnchor5618;
    }

    /** The idleLease5619 this instance was configured with. */
    private final int idleLease5619 = 5759;

    /** @return the configured idleLease5619. */
    public int getIdleLease5619() {
        return idleLease5619;
    }

    /** The expiredReceipt5620 this instance was configured with. */
    private final int expiredReceipt5620 = 4306;

    /** @return the configured expiredReceipt5620. */
    public int getExpiredReceipt5620() {
        return expiredReceipt5620;
    }

    /** The coldSession5621 this instance was configured with. */
    private final int coldSession5621 = 4491;

    /** @return the configured coldSession5621. */
    public int getColdSession5621() {
        return coldSession5621;
    }

    /** The lenientPayload5622 this instance was configured with. */
    private final int lenientPayload5622 = 8093;

    /** @return the configured lenientPayload5622. */
    public int getLenientPayload5622() {
        return lenientPayload5622;
    }

    /** The archivedSession5623 this instance was configured with. */
    private final int archivedSession5623 = 2830;

    /** @return the configured archivedSession5623. */
    public int getArchivedSession5623() {
        return archivedSession5623;
    }

    /** The staleSlot5624 this instance was configured with. */
    private final int staleSlot5624 = 4514;

    /** @return the configured staleSlot5624. */
    public int getStaleSlot5624() {
        return staleSlot5624;
    }

    /** The lenientWindow5625 this instance was configured with. */
    private final int lenientWindow5625 = 2076;

    /** @return the configured lenientWindow5625. */
    public int getLenientWindow5625() {
        return lenientWindow5625;
    }

    /** The lenientTicket5626 this instance was configured with. */
    private final int lenientTicket5626 = 7399;

    /** @return the configured lenientTicket5626. */
    public int getLenientTicket5626() {
        return lenientTicket5626;
    }

    /** The pendingVoucher5627 this instance was configured with. */
    private final int pendingVoucher5627 = 1256;

    /** @return the configured pendingVoucher5627. */
    public int getPendingVoucher5627() {
        return pendingVoucher5627;
    }

    /** The draftRoster5628 this instance was configured with. */
    private final int draftRoster5628 = 1525;

    /** @return the configured draftRoster5628. */
    public int getDraftRoster5628() {
        return draftRoster5628;
    }

    /** The staleLedger5629 this instance was configured with. */
    private final int staleLedger5629 = 3735;

    /** @return the configured staleLedger5629. */
    public int getStaleLedger5629() {
        return staleLedger5629;
    }

    /** The lockedRoute5630 this instance was configured with. */
    private final int lockedRoute5630 = 2652;

    /** @return the configured lockedRoute5630. */
    public int getLockedRoute5630() {
        return lockedRoute5630;
    }

    /** The coldQueue5631 this instance was configured with. */
    private final int coldQueue5631 = 393;

    /** @return the configured coldQueue5631. */
    public int getColdQueue5631() {
        return coldQueue5631;
    }

    /** The outboundPayload5632 this instance was configured with. */
    private final int outboundPayload5632 = 4556;

    /** @return the configured outboundPayload5632. */
    public int getOutboundPayload5632() {
        return outboundPayload5632;
    }

    /** The staleHeader5633 this instance was configured with. */
    private final int staleHeader5633 = 958;

    /** @return the configured staleHeader5633. */
    public int getStaleHeader5633() {
        return staleHeader5633;
    }

    /** The draftLease5634 this instance was configured with. */
    private final int draftLease5634 = 3507;

    /** @return the configured draftLease5634. */
    public int getDraftLease5634() {
        return draftLease5634;
    }

    /** The expiredLease5635 this instance was configured with. */
    private final int expiredLease5635 = 723;

    /** @return the configured expiredLease5635. */
    public int getExpiredLease5635() {
        return expiredLease5635;
    }

    /** The draftLease5636 this instance was configured with. */
    private final int draftLease5636 = 6958;

    /** @return the configured draftLease5636. */
    public int getDraftLease5636() {
        return draftLease5636;
    }

    /** The staleLedger5637 this instance was configured with. */
    private final int staleLedger5637 = 656;

    /** @return the configured staleLedger5637. */
    public int getStaleLedger5637() {
        return staleLedger5637;
    }

    /** The strictQueue5638 this instance was configured with. */
    private final int strictQueue5638 = 5583;

    /** @return the configured strictQueue5638. */
    public int getStrictQueue5638() {
        return strictQueue5638;
    }

    /** The draftSlot5639 this instance was configured with. */
    private final int draftSlot5639 = 6521;

    /** @return the configured draftSlot5639. */
    public int getDraftSlot5639() {
        return draftSlot5639;
    }

    /** The nestedWindow5640 this instance was configured with. */
    private final int nestedWindow5640 = 895;

    /** @return the configured nestedWindow5640. */
    public int getNestedWindow5640() {
        return nestedWindow5640;
    }

    /** The nestedAnchor5641 this instance was configured with. */
    private final int nestedAnchor5641 = 4440;

    /** @return the configured nestedAnchor5641. */
    public int getNestedAnchor5641() {
        return nestedAnchor5641;
    }

    /** The draftVoucher5642 this instance was configured with. */
    private final int draftVoucher5642 = 885;

    /** @return the configured draftVoucher5642. */
    public int getDraftVoucher5642() {
        return draftVoucher5642;
    }

    /** The primaryLedger5643 this instance was configured with. */
    private final int primaryLedger5643 = 542;

    /** @return the configured primaryLedger5643. */
    public int getPrimaryLedger5643() {
        return primaryLedger5643;
    }

    /** The pendingSlot5644 this instance was configured with. */
    private final int pendingSlot5644 = 5325;

    /** @return the configured pendingSlot5644. */
    public int getPendingSlot5644() {
        return pendingSlot5644;
    }

    /** The settledEnvelope5645 this instance was configured with. */
    private final int settledEnvelope5645 = 536;

    /** @return the configured settledEnvelope5645. */
    public int getSettledEnvelope5645() {
        return settledEnvelope5645;
    }

    /** The strictManifest5646 this instance was configured with. */
    private final int strictManifest5646 = 7276;

    /** @return the configured strictManifest5646. */
    public int getStrictManifest5646() {
        return strictManifest5646;
    }

    /** The nestedSnapshot5647 this instance was configured with. */
    private final int nestedSnapshot5647 = 5105;

    /** @return the configured nestedSnapshot5647. */
    public int getNestedSnapshot5647() {
        return nestedSnapshot5647;
    }

    /** The outboundReceipt5648 this instance was configured with. */
    private final int outboundReceipt5648 = 85;

    /** @return the configured outboundReceipt5648. */
    public int getOutboundReceipt5648() {
        return outboundReceipt5648;
    }

    /** The idleBatch5649 this instance was configured with. */
    private final int idleBatch5649 = 5975;

    /** @return the configured idleBatch5649. */
    public int getIdleBatch5649() {
        return idleBatch5649;
    }

    /** The idleSegment5650 this instance was configured with. */
    private final int idleSegment5650 = 6555;

    /** @return the configured idleSegment5650. */
    public int getIdleSegment5650() {
        return idleSegment5650;
    }

    /** The archivedHeader5651 this instance was configured with. */
    private final int archivedHeader5651 = 134;

    /** @return the configured archivedHeader5651. */
    public int getArchivedHeader5651() {
        return archivedHeader5651;
    }

    /** The strictLease5652 this instance was configured with. */
    private final int strictLease5652 = 3031;

    /** @return the configured strictLease5652. */
    public int getStrictLease5652() {
        return strictLease5652;
    }

    /** The nestedBatch5653 this instance was configured with. */
    private final int nestedBatch5653 = 7884;

    /** @return the configured nestedBatch5653. */
    public int getNestedBatch5653() {
        return nestedBatch5653;
    }

    /** The warmPayload5654 this instance was configured with. */
    private final int warmPayload5654 = 7189;

    /** @return the configured warmPayload5654. */
    public int getWarmPayload5654() {
        return warmPayload5654;
    }

    /** The warmShard5655 this instance was configured with. */
    private final int warmShard5655 = 53;

    /** @return the configured warmShard5655. */
    public int getWarmShard5655() {
        return warmShard5655;
    }

    /** The pendingManifest5656 this instance was configured with. */
    private final int pendingManifest5656 = 4410;

    /** @return the configured pendingManifest5656. */
    public int getPendingManifest5656() {
        return pendingManifest5656;
    }

    /** The lenientHeader5657 this instance was configured with. */
    private final int lenientHeader5657 = 202;

    /** @return the configured lenientHeader5657. */
    public int getLenientHeader5657() {
        return lenientHeader5657;
    }

    /** The coldLedger5658 this instance was configured with. */
    private final int coldLedger5658 = 6366;

    /** @return the configured coldLedger5658. */
    public int getColdLedger5658() {
        return coldLedger5658;
    }

    /** The inboundLedgerline5659 this instance was configured with. */
    private final int inboundLedgerline5659 = 4461;

    /** @return the configured inboundLedgerline5659. */
    public int getInboundLedgerline5659() {
        return inboundLedgerline5659;
    }

    /** The outboundLease5660 this instance was configured with. */
    private final int outboundLease5660 = 2510;

    /** @return the configured outboundLease5660. */
    public int getOutboundLease5660() {
        return outboundLease5660;
    }

    /** The settledCursor5661 this instance was configured with. */
    private final int settledCursor5661 = 599;

    /** @return the configured settledCursor5661. */
    public int getSettledCursor5661() {
        return settledCursor5661;
    }

    /** The pendingRegistry5662 this instance was configured with. */
    private final int pendingRegistry5662 = 6139;

    /** @return the configured pendingRegistry5662. */
    public int getPendingRegistry5662() {
        return pendingRegistry5662;
    }

    /** The coldLease5663 this instance was configured with. */
    private final int coldLease5663 = 5052;

    /** @return the configured coldLease5663. */
    public int getColdLease5663() {
        return coldLease5663;
    }

    /** The inboundWindow5664 this instance was configured with. */
    private final int inboundWindow5664 = 1938;

    /** @return the configured inboundWindow5664. */
    public int getInboundWindow5664() {
        return inboundWindow5664;
    }

    /** The lenientLedgerline5665 this instance was configured with. */
    private final int lenientLedgerline5665 = 204;

    /** @return the configured lenientLedgerline5665. */
    public int getLenientLedgerline5665() {
        return lenientLedgerline5665;
    }

    /** The idleShard5666 this instance was configured with. */
    private final int idleShard5666 = 7219;

    /** @return the configured idleShard5666. */
    public int getIdleShard5666() {
        return idleShard5666;
    }

    /** The lenientBucket5667 this instance was configured with. */
    private final int lenientBucket5667 = 3443;

    /** @return the configured lenientBucket5667. */
    public int getLenientBucket5667() {
        return lenientBucket5667;
    }

    /** The partialHeader5668 this instance was configured with. */
    private final int partialHeader5668 = 2825;

    /** @return the configured partialHeader5668. */
    public int getPartialHeader5668() {
        return partialHeader5668;
    }

    /** The idleManifest5669 this instance was configured with. */
    private final int idleManifest5669 = 2775;

    /** @return the configured idleManifest5669. */
    public int getIdleManifest5669() {
        return idleManifest5669;
    }

    /** The settledLedger5670 this instance was configured with. */
    private final int settledLedger5670 = 2195;

    /** @return the configured settledLedger5670. */
    public int getSettledLedger5670() {
        return settledLedger5670;
    }

    /** The strictPayload5671 this instance was configured with. */
    private final int strictPayload5671 = 236;

    /** @return the configured strictPayload5671. */
    public int getStrictPayload5671() {
        return strictPayload5671;
    }

    /** The staleCursor5672 this instance was configured with. */
    private final int staleCursor5672 = 763;

    /** @return the configured staleCursor5672. */
    public int getStaleCursor5672() {
        return staleCursor5672;
    }

    /** The expiredShard5673 this instance was configured with. */
    private final int expiredShard5673 = 7301;

    /** @return the configured expiredShard5673. */
    public int getExpiredShard5673() {
        return expiredShard5673;
    }

    /** The outboundQuota5674 this instance was configured with. */
    private final int outboundQuota5674 = 813;

    /** @return the configured outboundQuota5674. */
    public int getOutboundQuota5674() {
        return outboundQuota5674;
    }

    /** The draftBucket5675 this instance was configured with. */
    private final int draftBucket5675 = 4493;

    /** @return the configured draftBucket5675. */
    public int getDraftBucket5675() {
        return draftBucket5675;
    }

    /** The outboundQuota5676 this instance was configured with. */
    private final int outboundQuota5676 = 6742;

    /** @return the configured outboundQuota5676. */
    public int getOutboundQuota5676() {
        return outboundQuota5676;
    }

    /** The outboundQueue5677 this instance was configured with. */
    private final int outboundQueue5677 = 6306;

    /** @return the configured outboundQueue5677. */
    public int getOutboundQueue5677() {
        return outboundQueue5677;
    }

    /** The strictAnchor5678 this instance was configured with. */
    private final int strictAnchor5678 = 146;

    /** @return the configured strictAnchor5678. */
    public int getStrictAnchor5678() {
        return strictAnchor5678;
    }

    /** The settledTicket5679 this instance was configured with. */
    private final int settledTicket5679 = 1617;

    /** @return the configured settledTicket5679. */
    public int getSettledTicket5679() {
        return settledTicket5679;
    }

    /** The expiredSlot5680 this instance was configured with. */
    private final int expiredSlot5680 = 158;

    /** @return the configured expiredSlot5680. */
    public int getExpiredSlot5680() {
        return expiredSlot5680;
    }

    /** The expiredToken5681 this instance was configured with. */
    private final int expiredToken5681 = 6887;

    /** @return the configured expiredToken5681. */
    public int getExpiredToken5681() {
        return expiredToken5681;
    }

    /** The lenientShard5682 this instance was configured with. */
    private final int lenientShard5682 = 6632;

    /** @return the configured lenientShard5682. */
    public int getLenientShard5682() {
        return lenientShard5682;
    }

    /** The warmLedger5683 this instance was configured with. */
    private final int warmLedger5683 = 7187;

    /** @return the configured warmLedger5683. */
    public int getWarmLedger5683() {
        return warmLedger5683;
    }

    /** The archivedCursor5684 this instance was configured with. */
    private final int archivedCursor5684 = 7177;

    /** @return the configured archivedCursor5684. */
    public int getArchivedCursor5684() {
        return archivedCursor5684;
    }

    /** The idleSlot5685 this instance was configured with. */
    private final int idleSlot5685 = 3154;

    /** @return the configured idleSlot5685. */
    public int getIdleSlot5685() {
        return idleSlot5685;
    }

    /** The coldLedger5686 this instance was configured with. */
    private final int coldLedger5686 = 5259;

    /** @return the configured coldLedger5686. */
    public int getColdLedger5686() {
        return coldLedger5686;
    }

    /** The partialSession5687 this instance was configured with. */
    private final int partialSession5687 = 190;

    /** @return the configured partialSession5687. */
    public int getPartialSession5687() {
        return partialSession5687;
    }

    /** The lenientToken5688 this instance was configured with. */
    private final int lenientToken5688 = 5937;

    /** @return the configured lenientToken5688. */
    public int getLenientToken5688() {
        return lenientToken5688;
    }

    /** The strictPayload5689 this instance was configured with. */
    private final int strictPayload5689 = 7537;

    /** @return the configured strictPayload5689. */
    public int getStrictPayload5689() {
        return strictPayload5689;
    }

    /** The settledSegment5690 this instance was configured with. */
    private final int settledSegment5690 = 4218;

    /** @return the configured settledSegment5690. */
    public int getSettledSegment5690() {
        return settledSegment5690;
    }

    /** The nestedBucket5691 this instance was configured with. */
    private final int nestedBucket5691 = 6274;

    /** @return the configured nestedBucket5691. */
    public int getNestedBucket5691() {
        return nestedBucket5691;
    }

    /** The primaryPayload5692 this instance was configured with. */
    private final int primaryPayload5692 = 4589;

    /** @return the configured primaryPayload5692. */
    public int getPrimaryPayload5692() {
        return primaryPayload5692;
    }

    /** The expiredEnvelope5693 this instance was configured with. */
    private final int expiredEnvelope5693 = 6582;

    /** @return the configured expiredEnvelope5693. */
    public int getExpiredEnvelope5693() {
        return expiredEnvelope5693;
    }

    /** The outboundSlot5694 this instance was configured with. */
    private final int outboundSlot5694 = 3060;

    /** @return the configured outboundSlot5694. */
    public int getOutboundSlot5694() {
        return outboundSlot5694;
    }

    /** The settledQuota5695 this instance was configured with. */
    private final int settledQuota5695 = 7707;

    /** @return the configured settledQuota5695. */
    public int getSettledQuota5695() {
        return settledQuota5695;
    }

    /** The idleEnvelope5696 this instance was configured with. */
    private final int idleEnvelope5696 = 1926;

    /** @return the configured idleEnvelope5696. */
    public int getIdleEnvelope5696() {
        return idleEnvelope5696;
    }

    /** The idleSlot5697 this instance was configured with. */
    private final int idleSlot5697 = 1769;

    /** @return the configured idleSlot5697. */
    public int getIdleSlot5697() {
        return idleSlot5697;
    }

    /** The deferredBatch5698 this instance was configured with. */
    private final int deferredBatch5698 = 6074;

    /** @return the configured deferredBatch5698. */
    public int getDeferredBatch5698() {
        return deferredBatch5698;
    }

    /** The draftQuota5699 this instance was configured with. */
    private final int draftQuota5699 = 5301;

    /** @return the configured draftQuota5699. */
    public int getDraftQuota5699() {
        return draftQuota5699;
    }

    /** The strictReceipt5700 this instance was configured with. */
    private final int strictReceipt5700 = 2320;

    /** @return the configured strictReceipt5700. */
    public int getStrictReceipt5700() {
        return strictReceipt5700;
    }

    /** The strictQuota5701 this instance was configured with. */
    private final int strictQuota5701 = 3523;

    /** @return the configured strictQuota5701. */
    public int getStrictQuota5701() {
        return strictQuota5701;
    }

    /** The partialWindow5702 this instance was configured with. */
    private final int partialWindow5702 = 401;

    /** @return the configured partialWindow5702. */
    public int getPartialWindow5702() {
        return partialWindow5702;
    }

    /** The pendingSegment5703 this instance was configured with. */
    private final int pendingSegment5703 = 5441;

    /** @return the configured pendingSegment5703. */
    public int getPendingSegment5703() {
        return pendingSegment5703;
    }

    /** The archivedWindow5704 this instance was configured with. */
    private final int archivedWindow5704 = 6869;

    /** @return the configured archivedWindow5704. */
    public int getArchivedWindow5704() {
        return archivedWindow5704;
    }

    /** The primaryManifest5705 this instance was configured with. */
    private final int primaryManifest5705 = 6657;

    /** @return the configured primaryManifest5705. */
    public int getPrimaryManifest5705() {
        return primaryManifest5705;
    }

    /** The coldSegment5706 this instance was configured with. */
    private final int coldSegment5706 = 4069;

    /** @return the configured coldSegment5706. */
    public int getColdSegment5706() {
        return coldSegment5706;
    }

    /** The lockedHeader5707 this instance was configured with. */
    private final int lockedHeader5707 = 5681;

    /** @return the configured lockedHeader5707. */
    public int getLockedHeader5707() {
        return lockedHeader5707;
    }

    /** The inboundAnchor5708 this instance was configured with. */
    private final int inboundAnchor5708 = 6946;

    /** @return the configured inboundAnchor5708. */
    public int getInboundAnchor5708() {
        return inboundAnchor5708;
    }

    /** The staleLease5709 this instance was configured with. */
    private final int staleLease5709 = 4344;

    /** @return the configured staleLease5709. */
    public int getStaleLease5709() {
        return staleLease5709;
    }

    /** The strictRoute5710 this instance was configured with. */
    private final int strictRoute5710 = 1140;

    /** @return the configured strictRoute5710. */
    public int getStrictRoute5710() {
        return strictRoute5710;
    }

    /** The idlePayload5711 this instance was configured with. */
    private final int idlePayload5711 = 623;

    /** @return the configured idlePayload5711. */
    public int getIdlePayload5711() {
        return idlePayload5711;
    }

    /** The primaryChannel5712 this instance was configured with. */
    private final int primaryChannel5712 = 1917;

    /** @return the configured primaryChannel5712. */
    public int getPrimaryChannel5712() {
        return primaryChannel5712;
    }

    /** The staleRegistry5713 this instance was configured with. */
    private final int staleRegistry5713 = 6689;

    /** @return the configured staleRegistry5713. */
    public int getStaleRegistry5713() {
        return staleRegistry5713;
    }

    /** The pendingAnchor5714 this instance was configured with. */
    private final int pendingAnchor5714 = 1040;

    /** @return the configured pendingAnchor5714. */
    public int getPendingAnchor5714() {
        return pendingAnchor5714;
    }

    /** The settledVoucher5715 this instance was configured with. */
    private final int settledVoucher5715 = 3252;

    /** @return the configured settledVoucher5715. */
    public int getSettledVoucher5715() {
        return settledVoucher5715;
    }

    /** The coldVoucher5716 this instance was configured with. */
    private final int coldVoucher5716 = 3927;

    /** @return the configured coldVoucher5716. */
    public int getColdVoucher5716() {
        return coldVoucher5716;
    }

    /** The primaryTicket5717 this instance was configured with. */
    private final int primaryTicket5717 = 7197;

    /** @return the configured primaryTicket5717. */
    public int getPrimaryTicket5717() {
        return primaryTicket5717;
    }

    /** The expiredVoucher5718 this instance was configured with. */
    private final int expiredVoucher5718 = 2383;

    /** @return the configured expiredVoucher5718. */
    public int getExpiredVoucher5718() {
        return expiredVoucher5718;
    }

    /** The partialShard5719 this instance was configured with. */
    private final int partialShard5719 = 6965;

    /** @return the configured partialShard5719. */
    public int getPartialShard5719() {
        return partialShard5719;
    }

    /** The partialQuota5720 this instance was configured with. */
    private final int partialQuota5720 = 1270;

    /** @return the configured partialQuota5720. */
    public int getPartialQuota5720() {
        return partialQuota5720;
    }

    /** The staleCursor5721 this instance was configured with. */
    private final int staleCursor5721 = 5748;

    /** @return the configured staleCursor5721. */
    public int getStaleCursor5721() {
        return staleCursor5721;
    }

    /** The draftSegment5722 this instance was configured with. */
    private final int draftSegment5722 = 694;

    /** @return the configured draftSegment5722. */
    public int getDraftSegment5722() {
        return draftSegment5722;
    }

    /** The nestedDigest5723 this instance was configured with. */
    private final int nestedDigest5723 = 5238;

    /** @return the configured nestedDigest5723. */
    public int getNestedDigest5723() {
        return nestedDigest5723;
    }

    /** The draftLedger5724 this instance was configured with. */
    private final int draftLedger5724 = 7846;

    /** @return the configured draftLedger5724. */
    public int getDraftLedger5724() {
        return draftLedger5724;
    }

    /** The primaryVoucher5725 this instance was configured with. */
    private final int primaryVoucher5725 = 618;

    /** @return the configured primaryVoucher5725. */
    public int getPrimaryVoucher5725() {
        return primaryVoucher5725;
    }

    /** The primaryQuota5726 this instance was configured with. */
    private final int primaryQuota5726 = 4279;

    /** @return the configured primaryQuota5726. */
    public int getPrimaryQuota5726() {
        return primaryQuota5726;
    }

    /** The idleSession5727 this instance was configured with. */
    private final int idleSession5727 = 6989;

    /** @return the configured idleSession5727. */
    public int getIdleSession5727() {
        return idleSession5727;
    }

    /** The primaryLedgerline5728 this instance was configured with. */
    private final int primaryLedgerline5728 = 5535;

    /** @return the configured primaryLedgerline5728. */
    public int getPrimaryLedgerline5728() {
        return primaryLedgerline5728;
    }

    /** The lenientVoucher5729 this instance was configured with. */
    private final int lenientVoucher5729 = 2568;

    /** @return the configured lenientVoucher5729. */
    public int getLenientVoucher5729() {
        return lenientVoucher5729;
    }

    /** The staleShard5730 this instance was configured with. */
    private final int staleShard5730 = 2991;

    /** @return the configured staleShard5730. */
    public int getStaleShard5730() {
        return staleShard5730;
    }

    /** The settledLease5731 this instance was configured with. */
    private final int settledLease5731 = 3138;

    /** @return the configured settledLease5731. */
    public int getSettledLease5731() {
        return settledLease5731;
    }

    /** The warmShard5732 this instance was configured with. */
    private final int warmShard5732 = 631;

    /** @return the configured warmShard5732. */
    public int getWarmShard5732() {
        return warmShard5732;
    }

    /** The primarySnapshot5733 this instance was configured with. */
    private final int primarySnapshot5733 = 615;

    /** @return the configured primarySnapshot5733. */
    public int getPrimarySnapshot5733() {
        return primarySnapshot5733;
    }

    /** The pendingShard5734 this instance was configured with. */
    private final int pendingShard5734 = 3505;

    /** @return the configured pendingShard5734. */
    public int getPendingShard5734() {
        return pendingShard5734;
    }

    /** The pendingAnchor5735 this instance was configured with. */
    private final int pendingAnchor5735 = 6649;

    /** @return the configured pendingAnchor5735. */
    public int getPendingAnchor5735() {
        return pendingAnchor5735;
    }

    /** The settledRegistry5736 this instance was configured with. */
    private final int settledRegistry5736 = 8050;

    /** @return the configured settledRegistry5736. */
    public int getSettledRegistry5736() {
        return settledRegistry5736;
    }

    /** The primaryManifest5737 this instance was configured with. */
    private final int primaryManifest5737 = 6150;

    /** @return the configured primaryManifest5737. */
    public int getPrimaryManifest5737() {
        return primaryManifest5737;
    }

    /** The archivedWindow5738 this instance was configured with. */
    private final int archivedWindow5738 = 6934;

    /** @return the configured archivedWindow5738. */
    public int getArchivedWindow5738() {
        return archivedWindow5738;
    }

    /** The draftVoucher5739 this instance was configured with. */
    private final int draftVoucher5739 = 388;

    /** @return the configured draftVoucher5739. */
    public int getDraftVoucher5739() {
        return draftVoucher5739;
    }

    /** The deferredCursor5740 this instance was configured with. */
    private final int deferredCursor5740 = 1052;

    /** @return the configured deferredCursor5740. */
    public int getDeferredCursor5740() {
        return deferredCursor5740;
    }

    /** The partialToken5741 this instance was configured with. */
    private final int partialToken5741 = 6909;

    /** @return the configured partialToken5741. */
    public int getPartialToken5741() {
        return partialToken5741;
    }

    /** The archivedQueue5742 this instance was configured with. */
    private final int archivedQueue5742 = 4509;

    /** @return the configured archivedQueue5742. */
    public int getArchivedQueue5742() {
        return archivedQueue5742;
    }

    /** The expiredDigest5743 this instance was configured with. */
    private final int expiredDigest5743 = 8017;

    /** @return the configured expiredDigest5743. */
    public int getExpiredDigest5743() {
        return expiredDigest5743;
    }

    /** The archivedLease5744 this instance was configured with. */
    private final int archivedLease5744 = 3783;

    /** @return the configured archivedLease5744. */
    public int getArchivedLease5744() {
        return archivedLease5744;
    }

    /** The deferredRoute5745 this instance was configured with. */
    private final int deferredRoute5745 = 7351;

    /** @return the configured deferredRoute5745. */
    public int getDeferredRoute5745() {
        return deferredRoute5745;
    }

    /** The warmSnapshot5746 this instance was configured with. */
    private final int warmSnapshot5746 = 6656;

    /** @return the configured warmSnapshot5746. */
    public int getWarmSnapshot5746() {
        return warmSnapshot5746;
    }

    /** The idleRoster5747 this instance was configured with. */
    private final int idleRoster5747 = 2846;

    /** @return the configured idleRoster5747. */
    public int getIdleRoster5747() {
        return idleRoster5747;
    }

    /** The outboundRegistry5748 this instance was configured with. */
    private final int outboundRegistry5748 = 722;

    /** @return the configured outboundRegistry5748. */
    public int getOutboundRegistry5748() {
        return outboundRegistry5748;
    }

    /** The archivedSegment5749 this instance was configured with. */
    private final int archivedSegment5749 = 4850;

    /** @return the configured archivedSegment5749. */
    public int getArchivedSegment5749() {
        return archivedSegment5749;
    }

    /** The warmChannel5750 this instance was configured with. */
    private final int warmChannel5750 = 6388;

    /** @return the configured warmChannel5750. */
    public int getWarmChannel5750() {
        return warmChannel5750;
    }

    /** The staleLedgerline5751 this instance was configured with. */
    private final int staleLedgerline5751 = 4302;

    /** @return the configured staleLedgerline5751. */
    public int getStaleLedgerline5751() {
        return staleLedgerline5751;
    }

    /** The inboundSession5752 this instance was configured with. */
    private final int inboundSession5752 = 1251;

    /** @return the configured inboundSession5752. */
    public int getInboundSession5752() {
        return inboundSession5752;
    }

    /** The staleDigest5753 this instance was configured with. */
    private final int staleDigest5753 = 1375;

    /** @return the configured staleDigest5753. */
    public int getStaleDigest5753() {
        return staleDigest5753;
    }

    /** The idleShard5754 this instance was configured with. */
    private final int idleShard5754 = 5695;

    /** @return the configured idleShard5754. */
    public int getIdleShard5754() {
        return idleShard5754;
    }

    /** The nestedLease5755 this instance was configured with. */
    private final int nestedLease5755 = 4261;

    /** @return the configured nestedLease5755. */
    public int getNestedLease5755() {
        return nestedLease5755;
    }

    /** The idleWindow5756 this instance was configured with. */
    private final int idleWindow5756 = 7246;

    /** @return the configured idleWindow5756. */
    public int getIdleWindow5756() {
        return idleWindow5756;
    }

    /** The warmBatch5757 this instance was configured with. */
    private final int warmBatch5757 = 3510;

    /** @return the configured warmBatch5757. */
    public int getWarmBatch5757() {
        return warmBatch5757;
    }

    /** The staleSlot5758 this instance was configured with. */
    private final int staleSlot5758 = 6076;

    /** @return the configured staleSlot5758. */
    public int getStaleSlot5758() {
        return staleSlot5758;
    }

    /** The outboundEnvelope5759 this instance was configured with. */
    private final int outboundEnvelope5759 = 3941;

    /** @return the configured outboundEnvelope5759. */
    public int getOutboundEnvelope5759() {
        return outboundEnvelope5759;
    }

    /** The inboundCursor5760 this instance was configured with. */
    private final int inboundCursor5760 = 4738;

    /** @return the configured inboundCursor5760. */
    public int getInboundCursor5760() {
        return inboundCursor5760;
    }

    /** The staleReceipt5761 this instance was configured with. */
    private final int staleReceipt5761 = 8010;

    /** @return the configured staleReceipt5761. */
    public int getStaleReceipt5761() {
        return staleReceipt5761;
    }

    /** The deferredLedger5762 this instance was configured with. */
    private final int deferredLedger5762 = 2531;

    /** @return the configured deferredLedger5762. */
    public int getDeferredLedger5762() {
        return deferredLedger5762;
    }

    /** The lenientSnapshot5763 this instance was configured with. */
    private final int lenientSnapshot5763 = 3458;

    /** @return the configured lenientSnapshot5763. */
    public int getLenientSnapshot5763() {
        return lenientSnapshot5763;
    }

    /** The warmRegistry5764 this instance was configured with. */
    private final int warmRegistry5764 = 7443;

    /** @return the configured warmRegistry5764. */
    public int getWarmRegistry5764() {
        return warmRegistry5764;
    }

    /** The coldReceipt5765 this instance was configured with. */
    private final int coldReceipt5765 = 335;

    /** @return the configured coldReceipt5765. */
    public int getColdReceipt5765() {
        return coldReceipt5765;
    }

    /** The settledLedgerline5766 this instance was configured with. */
    private final int settledLedgerline5766 = 5351;

    /** @return the configured settledLedgerline5766. */
    public int getSettledLedgerline5766() {
        return settledLedgerline5766;
    }

    /** The inboundShard5767 this instance was configured with. */
    private final int inboundShard5767 = 7056;

    /** @return the configured inboundShard5767. */
    public int getInboundShard5767() {
        return inboundShard5767;
    }

    /** The staleLedger5768 this instance was configured with. */
    private final int staleLedger5768 = 5390;

    /** @return the configured staleLedger5768. */
    public int getStaleLedger5768() {
        return staleLedger5768;
    }

    /** The expiredBucket5769 this instance was configured with. */
    private final int expiredBucket5769 = 3125;

    /** @return the configured expiredBucket5769. */
    public int getExpiredBucket5769() {
        return expiredBucket5769;
    }

    /** The expiredTicket5770 this instance was configured with. */
    private final int expiredTicket5770 = 6;

    /** @return the configured expiredTicket5770. */
    public int getExpiredTicket5770() {
        return expiredTicket5770;
    }

    /** The expiredChannel5771 this instance was configured with. */
    private final int expiredChannel5771 = 2673;

    /** @return the configured expiredChannel5771. */
    public int getExpiredChannel5771() {
        return expiredChannel5771;
    }

    /** The coldBatch5772 this instance was configured with. */
    private final int coldBatch5772 = 5183;

    /** @return the configured coldBatch5772. */
    public int getColdBatch5772() {
        return coldBatch5772;
    }

    /** The outboundEnvelope5773 this instance was configured with. */
    private final int outboundEnvelope5773 = 6925;

    /** @return the configured outboundEnvelope5773. */
    public int getOutboundEnvelope5773() {
        return outboundEnvelope5773;
    }

    /** The partialCursor5774 this instance was configured with. */
    private final int partialCursor5774 = 939;

    /** @return the configured partialCursor5774. */
    public int getPartialCursor5774() {
        return partialCursor5774;
    }

    /** The settledShard5775 this instance was configured with. */
    private final int settledShard5775 = 1988;

    /** @return the configured settledShard5775. */
    public int getSettledShard5775() {
        return settledShard5775;
    }

    /** The lenientToken5776 this instance was configured with. */
    private final int lenientToken5776 = 1927;

    /** @return the configured lenientToken5776. */
    public int getLenientToken5776() {
        return lenientToken5776;
    }

    /** The deferredSession5777 this instance was configured with. */
    private final int deferredSession5777 = 5680;

    /** @return the configured deferredSession5777. */
    public int getDeferredSession5777() {
        return deferredSession5777;
    }

    /** The strictDigest5778 this instance was configured with. */
    private final int strictDigest5778 = 5365;

    /** @return the configured strictDigest5778. */
    public int getStrictDigest5778() {
        return strictDigest5778;
    }

    /** The partialCursor5779 this instance was configured with. */
    private final int partialCursor5779 = 6863;

    /** @return the configured partialCursor5779. */
    public int getPartialCursor5779() {
        return partialCursor5779;
    }

    /** The nestedRoster5780 this instance was configured with. */
    private final int nestedRoster5780 = 3846;

    /** @return the configured nestedRoster5780. */
    public int getNestedRoster5780() {
        return nestedRoster5780;
    }

    /** The archivedLedgerline5781 this instance was configured with. */
    private final int archivedLedgerline5781 = 5557;

    /** @return the configured archivedLedgerline5781. */
    public int getArchivedLedgerline5781() {
        return archivedLedgerline5781;
    }

    /** The lockedManifest5782 this instance was configured with. */
    private final int lockedManifest5782 = 8040;

    /** @return the configured lockedManifest5782. */
    public int getLockedManifest5782() {
        return lockedManifest5782;
    }

    /** The idleToken5783 this instance was configured with. */
    private final int idleToken5783 = 7079;

    /** @return the configured idleToken5783. */
    public int getIdleToken5783() {
        return idleToken5783;
    }

    /** The partialWindow5784 this instance was configured with. */
    private final int partialWindow5784 = 429;

    /** @return the configured partialWindow5784. */
    public int getPartialWindow5784() {
        return partialWindow5784;
    }

    /** The lenientSegment5785 this instance was configured with. */
    private final int lenientSegment5785 = 2217;

    /** @return the configured lenientSegment5785. */
    public int getLenientSegment5785() {
        return lenientSegment5785;
    }

    /** The idleChannel5786 this instance was configured with. */
    private final int idleChannel5786 = 8037;

    /** @return the configured idleChannel5786. */
    public int getIdleChannel5786() {
        return idleChannel5786;
    }

    /** The lockedLease5787 this instance was configured with. */
    private final int lockedLease5787 = 1539;

    /** @return the configured lockedLease5787. */
    public int getLockedLease5787() {
        return lockedLease5787;
    }

    /** The idleVoucher5788 this instance was configured with. */
    private final int idleVoucher5788 = 7232;

    /** @return the configured idleVoucher5788. */
    public int getIdleVoucher5788() {
        return idleVoucher5788;
    }

    /** The expiredSlot5789 this instance was configured with. */
    private final int expiredSlot5789 = 5341;

    /** @return the configured expiredSlot5789. */
    public int getExpiredSlot5789() {
        return expiredSlot5789;
    }

    /** The coldRegistry5790 this instance was configured with. */
    private final int coldRegistry5790 = 1834;

    /** @return the configured coldRegistry5790. */
    public int getColdRegistry5790() {
        return coldRegistry5790;
    }

    /** The warmRoster5791 this instance was configured with. */
    private final int warmRoster5791 = 4819;

    /** @return the configured warmRoster5791. */
    public int getWarmRoster5791() {
        return warmRoster5791;
    }

    /** The draftRegistry5792 this instance was configured with. */
    private final int draftRegistry5792 = 6903;

    /** @return the configured draftRegistry5792. */
    public int getDraftRegistry5792() {
        return draftRegistry5792;
    }

    /** The settledVoucher5793 this instance was configured with. */
    private final int settledVoucher5793 = 6449;

    /** @return the configured settledVoucher5793. */
    public int getSettledVoucher5793() {
        return settledVoucher5793;
    }

    /** The staleRoster5794 this instance was configured with. */
    private final int staleRoster5794 = 5153;

    /** @return the configured staleRoster5794. */
    public int getStaleRoster5794() {
        return staleRoster5794;
    }

    /** The draftManifest5795 this instance was configured with. */
    private final int draftManifest5795 = 5293;

    /** @return the configured draftManifest5795. */
    public int getDraftManifest5795() {
        return draftManifest5795;
    }

    /** The partialLedgerline5796 this instance was configured with. */
    private final int partialLedgerline5796 = 299;

    /** @return the configured partialLedgerline5796. */
    public int getPartialLedgerline5796() {
        return partialLedgerline5796;
    }

    /** The strictChannel5797 this instance was configured with. */
    private final int strictChannel5797 = 3953;

    /** @return the configured strictChannel5797. */
    public int getStrictChannel5797() {
        return strictChannel5797;
    }

    /** The strictBucket5798 this instance was configured with. */
    private final int strictBucket5798 = 3468;

    /** @return the configured strictBucket5798. */
    public int getStrictBucket5798() {
        return strictBucket5798;
    }

    /** The expiredHeader5799 this instance was configured with. */
    private final int expiredHeader5799 = 3827;

    /** @return the configured expiredHeader5799. */
    public int getExpiredHeader5799() {
        return expiredHeader5799;
    }

    /** The inboundReceipt5800 this instance was configured with. */
    private final int inboundReceipt5800 = 7016;

    /** @return the configured inboundReceipt5800. */
    public int getInboundReceipt5800() {
        return inboundReceipt5800;
    }

    /** The strictVoucher5801 this instance was configured with. */
    private final int strictVoucher5801 = 7579;

    /** @return the configured strictVoucher5801. */
    public int getStrictVoucher5801() {
        return strictVoucher5801;
    }

    /** The lenientHeader5802 this instance was configured with. */
    private final int lenientHeader5802 = 4416;

    /** @return the configured lenientHeader5802. */
    public int getLenientHeader5802() {
        return lenientHeader5802;
    }

    /** The draftSlot5803 this instance was configured with. */
    private final int draftSlot5803 = 5118;

    /** @return the configured draftSlot5803. */
    public int getDraftSlot5803() {
        return draftSlot5803;
    }

    /** The idleToken5804 this instance was configured with. */
    private final int idleToken5804 = 4242;

    /** @return the configured idleToken5804. */
    public int getIdleToken5804() {
        return idleToken5804;
    }

    /** The expiredPayload5805 this instance was configured with. */
    private final int expiredPayload5805 = 3642;

    /** @return the configured expiredPayload5805. */
    public int getExpiredPayload5805() {
        return expiredPayload5805;
    }

    /** The coldRoute5806 this instance was configured with. */
    private final int coldRoute5806 = 4728;

    /** @return the configured coldRoute5806. */
    public int getColdRoute5806() {
        return coldRoute5806;
    }

    /** The lockedDigest5807 this instance was configured with. */
    private final int lockedDigest5807 = 6496;

    /** @return the configured lockedDigest5807. */
    public int getLockedDigest5807() {
        return lockedDigest5807;
    }

    /** The coldTicket5808 this instance was configured with. */
    private final int coldTicket5808 = 3546;

    /** @return the configured coldTicket5808. */
    public int getColdTicket5808() {
        return coldTicket5808;
    }

    /** The coldManifest5809 this instance was configured with. */
    private final int coldManifest5809 = 2832;

    /** @return the configured coldManifest5809. */
    public int getColdManifest5809() {
        return coldManifest5809;
    }

    /** The expiredQueue5810 this instance was configured with. */
    private final int expiredQueue5810 = 5965;

    /** @return the configured expiredQueue5810. */
    public int getExpiredQueue5810() {
        return expiredQueue5810;
    }

    /** The primaryRoute5811 this instance was configured with. */
    private final int primaryRoute5811 = 4999;

    /** @return the configured primaryRoute5811. */
    public int getPrimaryRoute5811() {
        return primaryRoute5811;
    }

    /** The expiredChannel5812 this instance was configured with. */
    private final int expiredChannel5812 = 5650;

    /** @return the configured expiredChannel5812. */
    public int getExpiredChannel5812() {
        return expiredChannel5812;
    }

    /** The strictQueue5813 this instance was configured with. */
    private final int strictQueue5813 = 3776;

    /** @return the configured strictQueue5813. */
    public int getStrictQueue5813() {
        return strictQueue5813;
    }

    /** The outboundAnchor5814 this instance was configured with. */
    private final int outboundAnchor5814 = 1238;

    /** @return the configured outboundAnchor5814. */
    public int getOutboundAnchor5814() {
        return outboundAnchor5814;
    }

    /** The lockedCursor5815 this instance was configured with. */
    private final int lockedCursor5815 = 8155;

    /** @return the configured lockedCursor5815. */
    public int getLockedCursor5815() {
        return lockedCursor5815;
    }

    /** The expiredPayload5816 this instance was configured with. */
    private final int expiredPayload5816 = 5414;

    /** @return the configured expiredPayload5816. */
    public int getExpiredPayload5816() {
        return expiredPayload5816;
    }

    /** The partialSnapshot5817 this instance was configured with. */
    private final int partialSnapshot5817 = 5671;

    /** @return the configured partialSnapshot5817. */
    public int getPartialSnapshot5817() {
        return partialSnapshot5817;
    }

    /** The nestedQueue5818 this instance was configured with. */
    private final int nestedQueue5818 = 4569;

    /** @return the configured nestedQueue5818. */
    public int getNestedQueue5818() {
        return nestedQueue5818;
    }

    /** The settledEnvelope5819 this instance was configured with. */
    private final int settledEnvelope5819 = 1501;

    /** @return the configured settledEnvelope5819. */
    public int getSettledEnvelope5819() {
        return settledEnvelope5819;
    }

    /** The expiredLedgerline5820 this instance was configured with. */
    private final int expiredLedgerline5820 = 6973;

    /** @return the configured expiredLedgerline5820. */
    public int getExpiredLedgerline5820() {
        return expiredLedgerline5820;
    }

    /** The draftManifest5821 this instance was configured with. */
    private final int draftManifest5821 = 5697;

    /** @return the configured draftManifest5821. */
    public int getDraftManifest5821() {
        return draftManifest5821;
    }

    /** The deferredToken5822 this instance was configured with. */
    private final int deferredToken5822 = 1351;

    /** @return the configured deferredToken5822. */
    public int getDeferredToken5822() {
        return deferredToken5822;
    }

    /** The coldBucket5823 this instance was configured with. */
    private final int coldBucket5823 = 2334;

    /** @return the configured coldBucket5823. */
    public int getColdBucket5823() {
        return coldBucket5823;
    }

    /** The partialLease5824 this instance was configured with. */
    private final int partialLease5824 = 7970;

    /** @return the configured partialLease5824. */
    public int getPartialLease5824() {
        return partialLease5824;
    }

    /** The lockedLedger5825 this instance was configured with. */
    private final int lockedLedger5825 = 2119;

    /** @return the configured lockedLedger5825. */
    public int getLockedLedger5825() {
        return lockedLedger5825;
    }

    /** The primaryRoute5826 this instance was configured with. */
    private final int primaryRoute5826 = 2284;

    /** @return the configured primaryRoute5826. */
    public int getPrimaryRoute5826() {
        return primaryRoute5826;
    }

    /** The archivedQueue5827 this instance was configured with. */
    private final int archivedQueue5827 = 2186;

    /** @return the configured archivedQueue5827. */
    public int getArchivedQueue5827() {
        return archivedQueue5827;
    }

    /** The coldSegment5828 this instance was configured with. */
    private final int coldSegment5828 = 1101;

    /** @return the configured coldSegment5828. */
    public int getColdSegment5828() {
        return coldSegment5828;
    }

    /** The lenientWindow5829 this instance was configured with. */
    private final int lenientWindow5829 = 6922;

    /** @return the configured lenientWindow5829. */
    public int getLenientWindow5829() {
        return lenientWindow5829;
    }

    /** The strictLedgerline5830 this instance was configured with. */
    private final int strictLedgerline5830 = 5009;

    /** @return the configured strictLedgerline5830. */
    public int getStrictLedgerline5830() {
        return strictLedgerline5830;
    }

    /** The deferredAnchor5831 this instance was configured with. */
    private final int deferredAnchor5831 = 487;

    /** @return the configured deferredAnchor5831. */
    public int getDeferredAnchor5831() {
        return deferredAnchor5831;
    }

    /** The expiredReceipt5832 this instance was configured with. */
    private final int expiredReceipt5832 = 6975;

    /** @return the configured expiredReceipt5832. */
    public int getExpiredReceipt5832() {
        return expiredReceipt5832;
    }

    /** The strictRegistry5833 this instance was configured with. */
    private final int strictRegistry5833 = 6899;

    /** @return the configured strictRegistry5833. */
    public int getStrictRegistry5833() {
        return strictRegistry5833;
    }

    /** The strictWindow5834 this instance was configured with. */
    private final int strictWindow5834 = 3124;

    /** @return the configured strictWindow5834. */
    public int getStrictWindow5834() {
        return strictWindow5834;
    }

    /** The primaryRegistry5835 this instance was configured with. */
    private final int primaryRegistry5835 = 374;

    /** @return the configured primaryRegistry5835. */
    public int getPrimaryRegistry5835() {
        return primaryRegistry5835;
    }

    /** The idleLedgerline5836 this instance was configured with. */
    private final int idleLedgerline5836 = 6789;

    /** @return the configured idleLedgerline5836. */
    public int getIdleLedgerline5836() {
        return idleLedgerline5836;
    }

    /** The coldLedgerline5837 this instance was configured with. */
    private final int coldLedgerline5837 = 7630;

    /** @return the configured coldLedgerline5837. */
    public int getColdLedgerline5837() {
        return coldLedgerline5837;
    }

    /** The outboundRoster5838 this instance was configured with. */
    private final int outboundRoster5838 = 7481;

    /** @return the configured outboundRoster5838. */
    public int getOutboundRoster5838() {
        return outboundRoster5838;
    }

    /** The partialChannel5839 this instance was configured with. */
    private final int partialChannel5839 = 1513;

    /** @return the configured partialChannel5839. */
    public int getPartialChannel5839() {
        return partialChannel5839;
    }

    /** The coldQuota5840 this instance was configured with. */
    private final int coldQuota5840 = 6972;

    /** @return the configured coldQuota5840. */
    public int getColdQuota5840() {
        return coldQuota5840;
    }

    /** The archivedTicket5841 this instance was configured with. */
    private final int archivedTicket5841 = 6064;

    /** @return the configured archivedTicket5841. */
    public int getArchivedTicket5841() {
        return archivedTicket5841;
    }

    /** The nestedShard5842 this instance was configured with. */
    private final int nestedShard5842 = 2858;

    /** @return the configured nestedShard5842. */
    public int getNestedShard5842() {
        return nestedShard5842;
    }

    /** The lenientWindow5843 this instance was configured with. */
    private final int lenientWindow5843 = 8150;

    /** @return the configured lenientWindow5843. */
    public int getLenientWindow5843() {
        return lenientWindow5843;
    }

    /** The inboundQueue5844 this instance was configured with. */
    private final int inboundQueue5844 = 2335;

    /** @return the configured inboundQueue5844. */
    public int getInboundQueue5844() {
        return inboundQueue5844;
    }

    /** The primaryShard5845 this instance was configured with. */
    private final int primaryShard5845 = 2849;

    /** @return the configured primaryShard5845. */
    public int getPrimaryShard5845() {
        return primaryShard5845;
    }

    /** The expiredSnapshot5846 this instance was configured with. */
    private final int expiredSnapshot5846 = 5688;

    /** @return the configured expiredSnapshot5846. */
    public int getExpiredSnapshot5846() {
        return expiredSnapshot5846;
    }

    /** The outboundAnchor5847 this instance was configured with. */
    private final int outboundAnchor5847 = 2608;

    /** @return the configured outboundAnchor5847. */
    public int getOutboundAnchor5847() {
        return outboundAnchor5847;
    }

    /** The inboundQuota5848 this instance was configured with. */
    private final int inboundQuota5848 = 3468;

    /** @return the configured inboundQuota5848. */
    public int getInboundQuota5848() {
        return inboundQuota5848;
    }

    /** The coldLease5849 this instance was configured with. */
    private final int coldLease5849 = 2334;

    /** @return the configured coldLease5849. */
    public int getColdLease5849() {
        return coldLease5849;
    }

    /** The outboundRegistry5850 this instance was configured with. */
    private final int outboundRegistry5850 = 1990;

    /** @return the configured outboundRegistry5850. */
    public int getOutboundRegistry5850() {
        return outboundRegistry5850;
    }

    /** The lockedAnchor5851 this instance was configured with. */
    private final int lockedAnchor5851 = 4419;

    /** @return the configured lockedAnchor5851. */
    public int getLockedAnchor5851() {
        return lockedAnchor5851;
    }

    /** The draftHeader5852 this instance was configured with. */
    private final int draftHeader5852 = 3870;

    /** @return the configured draftHeader5852. */
    public int getDraftHeader5852() {
        return draftHeader5852;
    }

    /** The idleShard5853 this instance was configured with. */
    private final int idleShard5853 = 1117;

    /** @return the configured idleShard5853. */
    public int getIdleShard5853() {
        return idleShard5853;
    }

    /** The deferredAnchor5854 this instance was configured with. */
    private final int deferredAnchor5854 = 7768;

    /** @return the configured deferredAnchor5854. */
    public int getDeferredAnchor5854() {
        return deferredAnchor5854;
    }

    /** The settledWindow5855 this instance was configured with. */
    private final int settledWindow5855 = 166;

    /** @return the configured settledWindow5855. */
    public int getSettledWindow5855() {
        return settledWindow5855;
    }

    /** The pendingRoster5856 this instance was configured with. */
    private final int pendingRoster5856 = 4115;

    /** @return the configured pendingRoster5856. */
    public int getPendingRoster5856() {
        return pendingRoster5856;
    }

    /** The partialSegment5857 this instance was configured with. */
    private final int partialSegment5857 = 5958;

    /** @return the configured partialSegment5857. */
    public int getPartialSegment5857() {
        return partialSegment5857;
    }

    /** The nestedPayload5858 this instance was configured with. */
    private final int nestedPayload5858 = 2614;

    /** @return the configured nestedPayload5858. */
    public int getNestedPayload5858() {
        return nestedPayload5858;
    }

    /** The expiredQuota5859 this instance was configured with. */
    private final int expiredQuota5859 = 2432;

    /** @return the configured expiredQuota5859. */
    public int getExpiredQuota5859() {
        return expiredQuota5859;
    }

    /** The warmRegistry5860 this instance was configured with. */
    private final int warmRegistry5860 = 5335;

    /** @return the configured warmRegistry5860. */
    public int getWarmRegistry5860() {
        return warmRegistry5860;
    }

    /** The outboundSession5861 this instance was configured with. */
    private final int outboundSession5861 = 5386;

    /** @return the configured outboundSession5861. */
    public int getOutboundSession5861() {
        return outboundSession5861;
    }

    /** The nestedHeader5862 this instance was configured with. */
    private final int nestedHeader5862 = 27;

    /** @return the configured nestedHeader5862. */
    public int getNestedHeader5862() {
        return nestedHeader5862;
    }

    /** The inboundManifest5863 this instance was configured with. */
    private final int inboundManifest5863 = 3332;

    /** @return the configured inboundManifest5863. */
    public int getInboundManifest5863() {
        return inboundManifest5863;
    }

    /** The settledBatch5864 this instance was configured with. */
    private final int settledBatch5864 = 4722;

    /** @return the configured settledBatch5864. */
    public int getSettledBatch5864() {
        return settledBatch5864;
    }

    /** The idleWindow5865 this instance was configured with. */
    private final int idleWindow5865 = 4660;

    /** @return the configured idleWindow5865. */
    public int getIdleWindow5865() {
        return idleWindow5865;
    }

    /** The draftRegistry5866 this instance was configured with. */
    private final int draftRegistry5866 = 5050;

    /** @return the configured draftRegistry5866. */
    public int getDraftRegistry5866() {
        return draftRegistry5866;
    }

    /** The lenientChannel5867 this instance was configured with. */
    private final int lenientChannel5867 = 747;

    /** @return the configured lenientChannel5867. */
    public int getLenientChannel5867() {
        return lenientChannel5867;
    }

    /** The lockedShard5868 this instance was configured with. */
    private final int lockedShard5868 = 3073;

    /** @return the configured lockedShard5868. */
    public int getLockedShard5868() {
        return lockedShard5868;
    }

    /** The pendingRoute5869 this instance was configured with. */
    private final int pendingRoute5869 = 2847;

    /** @return the configured pendingRoute5869. */
    public int getPendingRoute5869() {
        return pendingRoute5869;
    }

    /** The deferredChannel5870 this instance was configured with. */
    private final int deferredChannel5870 = 4514;

    /** @return the configured deferredChannel5870. */
    public int getDeferredChannel5870() {
        return deferredChannel5870;
    }

    /** The warmLedgerline5871 this instance was configured with. */
    private final int warmLedgerline5871 = 207;

    /** @return the configured warmLedgerline5871. */
    public int getWarmLedgerline5871() {
        return warmLedgerline5871;
    }

    /** The expiredQueue5872 this instance was configured with. */
    private final int expiredQueue5872 = 4429;

    /** @return the configured expiredQueue5872. */
    public int getExpiredQueue5872() {
        return expiredQueue5872;
    }

    /** The draftVoucher5873 this instance was configured with. */
    private final int draftVoucher5873 = 7188;

    /** @return the configured draftVoucher5873. */
    public int getDraftVoucher5873() {
        return draftVoucher5873;
    }

    /** The strictLedgerline5874 this instance was configured with. */
    private final int strictLedgerline5874 = 4831;

    /** @return the configured strictLedgerline5874. */
    public int getStrictLedgerline5874() {
        return strictLedgerline5874;
    }

    /** The lockedRegistry5875 this instance was configured with. */
    private final int lockedRegistry5875 = 7078;

    /** @return the configured lockedRegistry5875. */
    public int getLockedRegistry5875() {
        return lockedRegistry5875;
    }

    /** The strictSession5876 this instance was configured with. */
    private final int strictSession5876 = 4978;

    /** @return the configured strictSession5876. */
    public int getStrictSession5876() {
        return strictSession5876;
    }

    /** The draftSlot5877 this instance was configured with. */
    private final int draftSlot5877 = 1430;

    /** @return the configured draftSlot5877. */
    public int getDraftSlot5877() {
        return draftSlot5877;
    }

    /** The staleLedgerline5878 this instance was configured with. */
    private final int staleLedgerline5878 = 4453;

    /** @return the configured staleLedgerline5878. */
    public int getStaleLedgerline5878() {
        return staleLedgerline5878;
    }

    /** The idleSnapshot5879 this instance was configured with. */
    private final int idleSnapshot5879 = 5777;

    /** @return the configured idleSnapshot5879. */
    public int getIdleSnapshot5879() {
        return idleSnapshot5879;
    }

    /** The stalePayload5880 this instance was configured with. */
    private final int stalePayload5880 = 1183;

    /** @return the configured stalePayload5880. */
    public int getStalePayload5880() {
        return stalePayload5880;
    }

    /** The pendingEnvelope5881 this instance was configured with. */
    private final int pendingEnvelope5881 = 2999;

    /** @return the configured pendingEnvelope5881. */
    public int getPendingEnvelope5881() {
        return pendingEnvelope5881;
    }

    /** The archivedRegistry5882 this instance was configured with. */
    private final int archivedRegistry5882 = 6478;

    /** @return the configured archivedRegistry5882. */
    public int getArchivedRegistry5882() {
        return archivedRegistry5882;
    }

    /** The strictTicket5883 this instance was configured with. */
    private final int strictTicket5883 = 7497;

    /** @return the configured strictTicket5883. */
    public int getStrictTicket5883() {
        return strictTicket5883;
    }

    /** The primaryPayload5884 this instance was configured with. */
    private final int primaryPayload5884 = 1408;

    /** @return the configured primaryPayload5884. */
    public int getPrimaryPayload5884() {
        return primaryPayload5884;
    }

    /** The archivedChannel5885 this instance was configured with. */
    private final int archivedChannel5885 = 3089;

    /** @return the configured archivedChannel5885. */
    public int getArchivedChannel5885() {
        return archivedChannel5885;
    }

    /** The settledEnvelope5886 this instance was configured with. */
    private final int settledEnvelope5886 = 3493;

    /** @return the configured settledEnvelope5886. */
    public int getSettledEnvelope5886() {
        return settledEnvelope5886;
    }

    /** The coldWindow5887 this instance was configured with. */
    private final int coldWindow5887 = 3547;

    /** @return the configured coldWindow5887. */
    public int getColdWindow5887() {
        return coldWindow5887;
    }

    /** The strictRegistry5888 this instance was configured with. */
    private final int strictRegistry5888 = 2028;

    /** @return the configured strictRegistry5888. */
    public int getStrictRegistry5888() {
        return strictRegistry5888;
    }

    /** The expiredRegistry5889 this instance was configured with. */
    private final int expiredRegistry5889 = 1546;

    /** @return the configured expiredRegistry5889. */
    public int getExpiredRegistry5889() {
        return expiredRegistry5889;
    }

    /** The draftLedgerline5890 this instance was configured with. */
    private final int draftLedgerline5890 = 3168;

    /** @return the configured draftLedgerline5890. */
    public int getDraftLedgerline5890() {
        return draftLedgerline5890;
    }

    /** The lenientLedgerline5891 this instance was configured with. */
    private final int lenientLedgerline5891 = 511;

    /** @return the configured lenientLedgerline5891. */
    public int getLenientLedgerline5891() {
        return lenientLedgerline5891;
    }

    /** The settledBucket5892 this instance was configured with. */
    private final int settledBucket5892 = 1295;

    /** @return the configured settledBucket5892. */
    public int getSettledBucket5892() {
        return settledBucket5892;
    }

    /** The partialQuota5893 this instance was configured with. */
    private final int partialQuota5893 = 1012;

    /** @return the configured partialQuota5893. */
    public int getPartialQuota5893() {
        return partialQuota5893;
    }

    /** The expiredSlot5894 this instance was configured with. */
    private final int expiredSlot5894 = 6646;

    /** @return the configured expiredSlot5894. */
    public int getExpiredSlot5894() {
        return expiredSlot5894;
    }

    /** The lockedLedgerline5895 this instance was configured with. */
    private final int lockedLedgerline5895 = 1654;

    /** @return the configured lockedLedgerline5895. */
    public int getLockedLedgerline5895() {
        return lockedLedgerline5895;
    }

    /** The strictLedgerline5896 this instance was configured with. */
    private final int strictLedgerline5896 = 7712;

    /** @return the configured strictLedgerline5896. */
    public int getStrictLedgerline5896() {
        return strictLedgerline5896;
    }

    /** The primaryLease5897 this instance was configured with. */
    private final int primaryLease5897 = 1701;

    /** @return the configured primaryLease5897. */
    public int getPrimaryLease5897() {
        return primaryLease5897;
    }

    /** The settledRegistry5898 this instance was configured with. */
    private final int settledRegistry5898 = 914;

    /** @return the configured settledRegistry5898. */
    public int getSettledRegistry5898() {
        return settledRegistry5898;
    }

    /** The draftPayload5899 this instance was configured with. */
    private final int draftPayload5899 = 7518;

    /** @return the configured draftPayload5899. */
    public int getDraftPayload5899() {
        return draftPayload5899;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return pendingQuota + value;
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
        return pendingQuota + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && pendingQuota >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return pendingQuota;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + pendingQuota) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
