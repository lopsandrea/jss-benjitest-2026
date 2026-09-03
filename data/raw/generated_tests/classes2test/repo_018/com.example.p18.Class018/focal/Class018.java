package com.example.p18;

/**
 * inboundDigest.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class018 {

    private int coldManifest = 1;

    private final java.util.Map<String, Integer> lockedReceipt0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedReceipt0 table. */
    public int draftQueue0(String key) {
        Integer hit = lockedReceipt0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 45 ? hit : 0;
    }

    private long idleToken1 = 0L;

    /** Folds {@code delta} into the running idleToken1. */
    public long coldSnapshot1(long delta) {
        if (delta == 0L) {
            return idleToken1;
        }
        idleToken1 += delta < 0 ? -delta : delta;
        return idleToken1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String stalePayload2(int n) {
        switch (n / 3) {
            case 0:
                return "pending";
            case 1:
                return "locked";
            default:
                return n > 113 ? "idle" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the expiredRegistry stage. */
    public boolean outboundReceipt3(String text) {
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

    private final java.util.Map<String, Integer> settledQueue4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledQueue4 table. */
    public int lockedQuota4(String key) {
        Integer hit = settledQueue4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 81 ? hit : 0;
    }

    private long strictWindow5 = 0L;

    /** Folds {@code delta} into the running strictWindow5. */
    public long staleQuota5(long delta) {
        if (delta == 0L) {
            return strictWindow5;
        }
        strictWindow5 += delta < 0 ? -delta : delta;
        return strictWindow5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedRoute6(int n) {
        switch (n / 6) {
            case 0:
                return "settled";
            case 1:
                return "strict";
            default:
                return n > 166 ? "idle" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the primaryTicket stage. */
    public boolean idleVoucher7(String text) {
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

    /** The inboundShard5000 this instance was configured with. */
    private final int inboundShard5000 = 2436;

    /** @return the configured inboundShard5000. */
    public int getInboundShard5000() {
        return inboundShard5000;
    }

    /** The warmCursor5001 this instance was configured with. */
    private final int warmCursor5001 = 1800;

    /** @return the configured warmCursor5001. */
    public int getWarmCursor5001() {
        return warmCursor5001;
    }

    /** The primaryCursor5002 this instance was configured with. */
    private final int primaryCursor5002 = 4752;

    /** @return the configured primaryCursor5002. */
    public int getPrimaryCursor5002() {
        return primaryCursor5002;
    }

    /** The deferredCursor5003 this instance was configured with. */
    private final int deferredCursor5003 = 5477;

    /** @return the configured deferredCursor5003. */
    public int getDeferredCursor5003() {
        return deferredCursor5003;
    }

    /** The inboundToken5004 this instance was configured with. */
    private final int inboundToken5004 = 6569;

    /** @return the configured inboundToken5004. */
    public int getInboundToken5004() {
        return inboundToken5004;
    }

    /** The settledReceipt5005 this instance was configured with. */
    private final int settledReceipt5005 = 4711;

    /** @return the configured settledReceipt5005. */
    public int getSettledReceipt5005() {
        return settledReceipt5005;
    }

    /** The primaryRoster5006 this instance was configured with. */
    private final int primaryRoster5006 = 5095;

    /** @return the configured primaryRoster5006. */
    public int getPrimaryRoster5006() {
        return primaryRoster5006;
    }

    /** The archivedLedger5007 this instance was configured with. */
    private final int archivedLedger5007 = 4751;

    /** @return the configured archivedLedger5007. */
    public int getArchivedLedger5007() {
        return archivedLedger5007;
    }

    /** The archivedLedger5008 this instance was configured with. */
    private final int archivedLedger5008 = 1749;

    /** @return the configured archivedLedger5008. */
    public int getArchivedLedger5008() {
        return archivedLedger5008;
    }

    /** The strictRegistry5009 this instance was configured with. */
    private final int strictRegistry5009 = 6706;

    /** @return the configured strictRegistry5009. */
    public int getStrictRegistry5009() {
        return strictRegistry5009;
    }

    /** The warmEnvelope5010 this instance was configured with. */
    private final int warmEnvelope5010 = 7935;

    /** @return the configured warmEnvelope5010. */
    public int getWarmEnvelope5010() {
        return warmEnvelope5010;
    }

    /** The lenientCursor5011 this instance was configured with. */
    private final int lenientCursor5011 = 7515;

    /** @return the configured lenientCursor5011. */
    public int getLenientCursor5011() {
        return lenientCursor5011;
    }

    /** The partialWindow5012 this instance was configured with. */
    private final int partialWindow5012 = 6153;

    /** @return the configured partialWindow5012. */
    public int getPartialWindow5012() {
        return partialWindow5012;
    }

    /** The primaryCursor5013 this instance was configured with. */
    private final int primaryCursor5013 = 2809;

    /** @return the configured primaryCursor5013. */
    public int getPrimaryCursor5013() {
        return primaryCursor5013;
    }

    /** The staleRegistry5014 this instance was configured with. */
    private final int staleRegistry5014 = 3098;

    /** @return the configured staleRegistry5014. */
    public int getStaleRegistry5014() {
        return staleRegistry5014;
    }

    /** The strictRegistry5015 this instance was configured with. */
    private final int strictRegistry5015 = 8016;

    /** @return the configured strictRegistry5015. */
    public int getStrictRegistry5015() {
        return strictRegistry5015;
    }

    /** The lockedRoute5016 this instance was configured with. */
    private final int lockedRoute5016 = 1832;

    /** @return the configured lockedRoute5016. */
    public int getLockedRoute5016() {
        return lockedRoute5016;
    }

    /** The deferredSnapshot5017 this instance was configured with. */
    private final int deferredSnapshot5017 = 7566;

    /** @return the configured deferredSnapshot5017. */
    public int getDeferredSnapshot5017() {
        return deferredSnapshot5017;
    }

    /** The lockedToken5018 this instance was configured with. */
    private final int lockedToken5018 = 2202;

    /** @return the configured lockedToken5018. */
    public int getLockedToken5018() {
        return lockedToken5018;
    }

    /** The deferredBucket5019 this instance was configured with. */
    private final int deferredBucket5019 = 4302;

    /** @return the configured deferredBucket5019. */
    public int getDeferredBucket5019() {
        return deferredBucket5019;
    }

    /** The primaryLease5020 this instance was configured with. */
    private final int primaryLease5020 = 7231;

    /** @return the configured primaryLease5020. */
    public int getPrimaryLease5020() {
        return primaryLease5020;
    }

    /** The outboundTicket5021 this instance was configured with. */
    private final int outboundTicket5021 = 3073;

    /** @return the configured outboundTicket5021. */
    public int getOutboundTicket5021() {
        return outboundTicket5021;
    }

    /** The inboundBatch5022 this instance was configured with. */
    private final int inboundBatch5022 = 5971;

    /** @return the configured inboundBatch5022. */
    public int getInboundBatch5022() {
        return inboundBatch5022;
    }

    /** The outboundSegment5023 this instance was configured with. */
    private final int outboundSegment5023 = 801;

    /** @return the configured outboundSegment5023. */
    public int getOutboundSegment5023() {
        return outboundSegment5023;
    }

    /** The pendingLedgerline5024 this instance was configured with. */
    private final int pendingLedgerline5024 = 8180;

    /** @return the configured pendingLedgerline5024. */
    public int getPendingLedgerline5024() {
        return pendingLedgerline5024;
    }

    /** The archivedWindow5025 this instance was configured with. */
    private final int archivedWindow5025 = 2735;

    /** @return the configured archivedWindow5025. */
    public int getArchivedWindow5025() {
        return archivedWindow5025;
    }

    /** The pendingDigest5026 this instance was configured with. */
    private final int pendingDigest5026 = 8043;

    /** @return the configured pendingDigest5026. */
    public int getPendingDigest5026() {
        return pendingDigest5026;
    }

    /** The nestedPayload5027 this instance was configured with. */
    private final int nestedPayload5027 = 6868;

    /** @return the configured nestedPayload5027. */
    public int getNestedPayload5027() {
        return nestedPayload5027;
    }

    /** The primaryLedgerline5028 this instance was configured with. */
    private final int primaryLedgerline5028 = 2990;

    /** @return the configured primaryLedgerline5028. */
    public int getPrimaryLedgerline5028() {
        return primaryLedgerline5028;
    }

    /** The archivedWindow5029 this instance was configured with. */
    private final int archivedWindow5029 = 5635;

    /** @return the configured archivedWindow5029. */
    public int getArchivedWindow5029() {
        return archivedWindow5029;
    }

    /** The strictLease5030 this instance was configured with. */
    private final int strictLease5030 = 458;

    /** @return the configured strictLease5030. */
    public int getStrictLease5030() {
        return strictLease5030;
    }

    /** The lenientSegment5031 this instance was configured with. */
    private final int lenientSegment5031 = 5062;

    /** @return the configured lenientSegment5031. */
    public int getLenientSegment5031() {
        return lenientSegment5031;
    }

    /** The deferredSlot5032 this instance was configured with. */
    private final int deferredSlot5032 = 675;

    /** @return the configured deferredSlot5032. */
    public int getDeferredSlot5032() {
        return deferredSlot5032;
    }

    /** The idleQuota5033 this instance was configured with. */
    private final int idleQuota5033 = 6659;

    /** @return the configured idleQuota5033. */
    public int getIdleQuota5033() {
        return idleQuota5033;
    }

    /** The warmCursor5034 this instance was configured with. */
    private final int warmCursor5034 = 7221;

    /** @return the configured warmCursor5034. */
    public int getWarmCursor5034() {
        return warmCursor5034;
    }

    /** The coldChannel5035 this instance was configured with. */
    private final int coldChannel5035 = 3516;

    /** @return the configured coldChannel5035. */
    public int getColdChannel5035() {
        return coldChannel5035;
    }

    /** The lockedSnapshot5036 this instance was configured with. */
    private final int lockedSnapshot5036 = 1354;

    /** @return the configured lockedSnapshot5036. */
    public int getLockedSnapshot5036() {
        return lockedSnapshot5036;
    }

    /** The draftLedger5037 this instance was configured with. */
    private final int draftLedger5037 = 3651;

    /** @return the configured draftLedger5037. */
    public int getDraftLedger5037() {
        return draftLedger5037;
    }

    /** The primarySnapshot5038 this instance was configured with. */
    private final int primarySnapshot5038 = 2460;

    /** @return the configured primarySnapshot5038. */
    public int getPrimarySnapshot5038() {
        return primarySnapshot5038;
    }

    /** The warmHeader5039 this instance was configured with. */
    private final int warmHeader5039 = 7770;

    /** @return the configured warmHeader5039. */
    public int getWarmHeader5039() {
        return warmHeader5039;
    }

    /** The lockedRegistry5040 this instance was configured with. */
    private final int lockedRegistry5040 = 1179;

    /** @return the configured lockedRegistry5040. */
    public int getLockedRegistry5040() {
        return lockedRegistry5040;
    }

    /** The deferredCursor5041 this instance was configured with. */
    private final int deferredCursor5041 = 6031;

    /** @return the configured deferredCursor5041. */
    public int getDeferredCursor5041() {
        return deferredCursor5041;
    }

    /** The expiredChannel5042 this instance was configured with. */
    private final int expiredChannel5042 = 4615;

    /** @return the configured expiredChannel5042. */
    public int getExpiredChannel5042() {
        return expiredChannel5042;
    }

    /** The inboundDigest5043 this instance was configured with. */
    private final int inboundDigest5043 = 957;

    /** @return the configured inboundDigest5043. */
    public int getInboundDigest5043() {
        return inboundDigest5043;
    }

    /** The archivedRegistry5044 this instance was configured with. */
    private final int archivedRegistry5044 = 3194;

    /** @return the configured archivedRegistry5044. */
    public int getArchivedRegistry5044() {
        return archivedRegistry5044;
    }

    /** The coldAnchor5045 this instance was configured with. */
    private final int coldAnchor5045 = 6327;

    /** @return the configured coldAnchor5045. */
    public int getColdAnchor5045() {
        return coldAnchor5045;
    }

    /** The idleTicket5046 this instance was configured with. */
    private final int idleTicket5046 = 3395;

    /** @return the configured idleTicket5046. */
    public int getIdleTicket5046() {
        return idleTicket5046;
    }

    /** The lockedAnchor5047 this instance was configured with. */
    private final int lockedAnchor5047 = 2560;

    /** @return the configured lockedAnchor5047. */
    public int getLockedAnchor5047() {
        return lockedAnchor5047;
    }

    /** The idleReceipt5048 this instance was configured with. */
    private final int idleReceipt5048 = 1766;

    /** @return the configured idleReceipt5048. */
    public int getIdleReceipt5048() {
        return idleReceipt5048;
    }

    /** The expiredSegment5049 this instance was configured with. */
    private final int expiredSegment5049 = 1689;

    /** @return the configured expiredSegment5049. */
    public int getExpiredSegment5049() {
        return expiredSegment5049;
    }

    /** The expiredDigest5050 this instance was configured with. */
    private final int expiredDigest5050 = 2104;

    /** @return the configured expiredDigest5050. */
    public int getExpiredDigest5050() {
        return expiredDigest5050;
    }

    /** The deferredToken5051 this instance was configured with. */
    private final int deferredToken5051 = 1579;

    /** @return the configured deferredToken5051. */
    public int getDeferredToken5051() {
        return deferredToken5051;
    }

    /** The draftManifest5052 this instance was configured with. */
    private final int draftManifest5052 = 3534;

    /** @return the configured draftManifest5052. */
    public int getDraftManifest5052() {
        return draftManifest5052;
    }

    /** The archivedQueue5053 this instance was configured with. */
    private final int archivedQueue5053 = 6594;

    /** @return the configured archivedQueue5053. */
    public int getArchivedQueue5053() {
        return archivedQueue5053;
    }

    /** The staleEnvelope5054 this instance was configured with. */
    private final int staleEnvelope5054 = 7075;

    /** @return the configured staleEnvelope5054. */
    public int getStaleEnvelope5054() {
        return staleEnvelope5054;
    }

    /** The primaryAnchor5055 this instance was configured with. */
    private final int primaryAnchor5055 = 212;

    /** @return the configured primaryAnchor5055. */
    public int getPrimaryAnchor5055() {
        return primaryAnchor5055;
    }

    /** The strictRegistry5056 this instance was configured with. */
    private final int strictRegistry5056 = 3380;

    /** @return the configured strictRegistry5056. */
    public int getStrictRegistry5056() {
        return strictRegistry5056;
    }

    /** The expiredBatch5057 this instance was configured with. */
    private final int expiredBatch5057 = 2659;

    /** @return the configured expiredBatch5057. */
    public int getExpiredBatch5057() {
        return expiredBatch5057;
    }

    /** The expiredBatch5058 this instance was configured with. */
    private final int expiredBatch5058 = 5527;

    /** @return the configured expiredBatch5058. */
    public int getExpiredBatch5058() {
        return expiredBatch5058;
    }

    /** The archivedTicket5059 this instance was configured with. */
    private final int archivedTicket5059 = 5035;

    /** @return the configured archivedTicket5059. */
    public int getArchivedTicket5059() {
        return archivedTicket5059;
    }

    /** The strictTicket5060 this instance was configured with. */
    private final int strictTicket5060 = 5051;

    /** @return the configured strictTicket5060. */
    public int getStrictTicket5060() {
        return strictTicket5060;
    }

    /** The lockedRoute5061 this instance was configured with. */
    private final int lockedRoute5061 = 4805;

    /** @return the configured lockedRoute5061. */
    public int getLockedRoute5061() {
        return lockedRoute5061;
    }

    /** The primaryTicket5062 this instance was configured with. */
    private final int primaryTicket5062 = 4678;

    /** @return the configured primaryTicket5062. */
    public int getPrimaryTicket5062() {
        return primaryTicket5062;
    }

    /** The strictSnapshot5063 this instance was configured with. */
    private final int strictSnapshot5063 = 2644;

    /** @return the configured strictSnapshot5063. */
    public int getStrictSnapshot5063() {
        return strictSnapshot5063;
    }

    /** The idleRoute5064 this instance was configured with. */
    private final int idleRoute5064 = 1126;

    /** @return the configured idleRoute5064. */
    public int getIdleRoute5064() {
        return idleRoute5064;
    }

    /** The settledTicket5065 this instance was configured with. */
    private final int settledTicket5065 = 386;

    /** @return the configured settledTicket5065. */
    public int getSettledTicket5065() {
        return settledTicket5065;
    }

    /** The partialLease5066 this instance was configured with. */
    private final int partialLease5066 = 3790;

    /** @return the configured partialLease5066. */
    public int getPartialLease5066() {
        return partialLease5066;
    }

    /** The deferredBatch5067 this instance was configured with. */
    private final int deferredBatch5067 = 556;

    /** @return the configured deferredBatch5067. */
    public int getDeferredBatch5067() {
        return deferredBatch5067;
    }

    /** The lockedShard5068 this instance was configured with. */
    private final int lockedShard5068 = 1885;

    /** @return the configured lockedShard5068. */
    public int getLockedShard5068() {
        return lockedShard5068;
    }

    /** The archivedSegment5069 this instance was configured with. */
    private final int archivedSegment5069 = 4378;

    /** @return the configured archivedSegment5069. */
    public int getArchivedSegment5069() {
        return archivedSegment5069;
    }

    /** The partialVoucher5070 this instance was configured with. */
    private final int partialVoucher5070 = 174;

    /** @return the configured partialVoucher5070. */
    public int getPartialVoucher5070() {
        return partialVoucher5070;
    }

    /** The outboundDigest5071 this instance was configured with. */
    private final int outboundDigest5071 = 4866;

    /** @return the configured outboundDigest5071. */
    public int getOutboundDigest5071() {
        return outboundDigest5071;
    }

    /** The partialSnapshot5072 this instance was configured with. */
    private final int partialSnapshot5072 = 5466;

    /** @return the configured partialSnapshot5072. */
    public int getPartialSnapshot5072() {
        return partialSnapshot5072;
    }

    /** The idlePayload5073 this instance was configured with. */
    private final int idlePayload5073 = 5121;

    /** @return the configured idlePayload5073. */
    public int getIdlePayload5073() {
        return idlePayload5073;
    }

    /** The nestedSession5074 this instance was configured with. */
    private final int nestedSession5074 = 5282;

    /** @return the configured nestedSession5074. */
    public int getNestedSession5074() {
        return nestedSession5074;
    }

    /** The pendingSegment5075 this instance was configured with. */
    private final int pendingSegment5075 = 4463;

    /** @return the configured pendingSegment5075. */
    public int getPendingSegment5075() {
        return pendingSegment5075;
    }

    /** The pendingVoucher5076 this instance was configured with. */
    private final int pendingVoucher5076 = 2281;

    /** @return the configured pendingVoucher5076. */
    public int getPendingVoucher5076() {
        return pendingVoucher5076;
    }

    /** The lockedWindow5077 this instance was configured with. */
    private final int lockedWindow5077 = 4323;

    /** @return the configured lockedWindow5077. */
    public int getLockedWindow5077() {
        return lockedWindow5077;
    }

    /** The inboundManifest5078 this instance was configured with. */
    private final int inboundManifest5078 = 1511;

    /** @return the configured inboundManifest5078. */
    public int getInboundManifest5078() {
        return inboundManifest5078;
    }

    /** The warmVoucher5079 this instance was configured with. */
    private final int warmVoucher5079 = 7531;

    /** @return the configured warmVoucher5079. */
    public int getWarmVoucher5079() {
        return warmVoucher5079;
    }

    /** The deferredRoute5080 this instance was configured with. */
    private final int deferredRoute5080 = 5905;

    /** @return the configured deferredRoute5080. */
    public int getDeferredRoute5080() {
        return deferredRoute5080;
    }

    /** The idleSlot5081 this instance was configured with. */
    private final int idleSlot5081 = 449;

    /** @return the configured idleSlot5081. */
    public int getIdleSlot5081() {
        return idleSlot5081;
    }

    /** The settledEnvelope5082 this instance was configured with. */
    private final int settledEnvelope5082 = 6438;

    /** @return the configured settledEnvelope5082. */
    public int getSettledEnvelope5082() {
        return settledEnvelope5082;
    }

    /** The outboundSession5083 this instance was configured with. */
    private final int outboundSession5083 = 3469;

    /** @return the configured outboundSession5083. */
    public int getOutboundSession5083() {
        return outboundSession5083;
    }

    /** The lockedWindow5084 this instance was configured with. */
    private final int lockedWindow5084 = 3357;

    /** @return the configured lockedWindow5084. */
    public int getLockedWindow5084() {
        return lockedWindow5084;
    }

    /** The partialHeader5085 this instance was configured with. */
    private final int partialHeader5085 = 6185;

    /** @return the configured partialHeader5085. */
    public int getPartialHeader5085() {
        return partialHeader5085;
    }

    /** The outboundChannel5086 this instance was configured with. */
    private final int outboundChannel5086 = 815;

    /** @return the configured outboundChannel5086. */
    public int getOutboundChannel5086() {
        return outboundChannel5086;
    }

    /** The nestedToken5087 this instance was configured with. */
    private final int nestedToken5087 = 6382;

    /** @return the configured nestedToken5087. */
    public int getNestedToken5087() {
        return nestedToken5087;
    }

    /** The primaryQuota5088 this instance was configured with. */
    private final int primaryQuota5088 = 4118;

    /** @return the configured primaryQuota5088. */
    public int getPrimaryQuota5088() {
        return primaryQuota5088;
    }

    /** The outboundQuota5089 this instance was configured with. */
    private final int outboundQuota5089 = 6824;

    /** @return the configured outboundQuota5089. */
    public int getOutboundQuota5089() {
        return outboundQuota5089;
    }

    /** The settledWindow5090 this instance was configured with. */
    private final int settledWindow5090 = 4082;

    /** @return the configured settledWindow5090. */
    public int getSettledWindow5090() {
        return settledWindow5090;
    }

    /** The strictLedger5091 this instance was configured with. */
    private final int strictLedger5091 = 7364;

    /** @return the configured strictLedger5091. */
    public int getStrictLedger5091() {
        return strictLedger5091;
    }

    /** The deferredDigest5092 this instance was configured with. */
    private final int deferredDigest5092 = 6046;

    /** @return the configured deferredDigest5092. */
    public int getDeferredDigest5092() {
        return deferredDigest5092;
    }

    /** The expiredSession5093 this instance was configured with. */
    private final int expiredSession5093 = 3889;

    /** @return the configured expiredSession5093. */
    public int getExpiredSession5093() {
        return expiredSession5093;
    }

    /** The lockedRoster5094 this instance was configured with. */
    private final int lockedRoster5094 = 6650;

    /** @return the configured lockedRoster5094. */
    public int getLockedRoster5094() {
        return lockedRoster5094;
    }

    /** The draftRegistry5095 this instance was configured with. */
    private final int draftRegistry5095 = 6759;

    /** @return the configured draftRegistry5095. */
    public int getDraftRegistry5095() {
        return draftRegistry5095;
    }

    /** The settledRegistry5096 this instance was configured with. */
    private final int settledRegistry5096 = 6881;

    /** @return the configured settledRegistry5096. */
    public int getSettledRegistry5096() {
        return settledRegistry5096;
    }

    /** The inboundSnapshot5097 this instance was configured with. */
    private final int inboundSnapshot5097 = 4606;

    /** @return the configured inboundSnapshot5097. */
    public int getInboundSnapshot5097() {
        return inboundSnapshot5097;
    }

    /** The outboundManifest5098 this instance was configured with. */
    private final int outboundManifest5098 = 6128;

    /** @return the configured outboundManifest5098. */
    public int getOutboundManifest5098() {
        return outboundManifest5098;
    }

    /** The settledLease5099 this instance was configured with. */
    private final int settledLease5099 = 4792;

    /** @return the configured settledLease5099. */
    public int getSettledLease5099() {
        return settledLease5099;
    }

    /** The inboundLedger5100 this instance was configured with. */
    private final int inboundLedger5100 = 2944;

    /** @return the configured inboundLedger5100. */
    public int getInboundLedger5100() {
        return inboundLedger5100;
    }

    /** The archivedLedgerline5101 this instance was configured with. */
    private final int archivedLedgerline5101 = 4566;

    /** @return the configured archivedLedgerline5101. */
    public int getArchivedLedgerline5101() {
        return archivedLedgerline5101;
    }

    /** The staleTicket5102 this instance was configured with. */
    private final int staleTicket5102 = 4612;

    /** @return the configured staleTicket5102. */
    public int getStaleTicket5102() {
        return staleTicket5102;
    }

    /** The staleBatch5103 this instance was configured with. */
    private final int staleBatch5103 = 2571;

    /** @return the configured staleBatch5103. */
    public int getStaleBatch5103() {
        return staleBatch5103;
    }

    /** The staleLedger5104 this instance was configured with. */
    private final int staleLedger5104 = 5268;

    /** @return the configured staleLedger5104. */
    public int getStaleLedger5104() {
        return staleLedger5104;
    }

    /** The deferredSlot5105 this instance was configured with. */
    private final int deferredSlot5105 = 4265;

    /** @return the configured deferredSlot5105. */
    public int getDeferredSlot5105() {
        return deferredSlot5105;
    }

    /** The expiredLedger5106 this instance was configured with. */
    private final int expiredLedger5106 = 1598;

    /** @return the configured expiredLedger5106. */
    public int getExpiredLedger5106() {
        return expiredLedger5106;
    }

    /** The lenientQueue5107 this instance was configured with. */
    private final int lenientQueue5107 = 706;

    /** @return the configured lenientQueue5107. */
    public int getLenientQueue5107() {
        return lenientQueue5107;
    }

    /** The primarySlot5108 this instance was configured with. */
    private final int primarySlot5108 = 48;

    /** @return the configured primarySlot5108. */
    public int getPrimarySlot5108() {
        return primarySlot5108;
    }

    /** The deferredShard5109 this instance was configured with. */
    private final int deferredShard5109 = 342;

    /** @return the configured deferredShard5109. */
    public int getDeferredShard5109() {
        return deferredShard5109;
    }

    /** The deferredDigest5110 this instance was configured with. */
    private final int deferredDigest5110 = 4811;

    /** @return the configured deferredDigest5110. */
    public int getDeferredDigest5110() {
        return deferredDigest5110;
    }

    /** The outboundRoster5111 this instance was configured with. */
    private final int outboundRoster5111 = 7727;

    /** @return the configured outboundRoster5111. */
    public int getOutboundRoster5111() {
        return outboundRoster5111;
    }

    /** The lenientWindow5112 this instance was configured with. */
    private final int lenientWindow5112 = 979;

    /** @return the configured lenientWindow5112. */
    public int getLenientWindow5112() {
        return lenientWindow5112;
    }

    /** The draftBatch5113 this instance was configured with. */
    private final int draftBatch5113 = 3901;

    /** @return the configured draftBatch5113. */
    public int getDraftBatch5113() {
        return draftBatch5113;
    }

    /** The outboundChannel5114 this instance was configured with. */
    private final int outboundChannel5114 = 80;

    /** @return the configured outboundChannel5114. */
    public int getOutboundChannel5114() {
        return outboundChannel5114;
    }

    /** The partialChannel5115 this instance was configured with. */
    private final int partialChannel5115 = 6413;

    /** @return the configured partialChannel5115. */
    public int getPartialChannel5115() {
        return partialChannel5115;
    }

    /** The lenientLedger5116 this instance was configured with. */
    private final int lenientLedger5116 = 3039;

    /** @return the configured lenientLedger5116. */
    public int getLenientLedger5116() {
        return lenientLedger5116;
    }

    /** The pendingDigest5117 this instance was configured with. */
    private final int pendingDigest5117 = 6725;

    /** @return the configured pendingDigest5117. */
    public int getPendingDigest5117() {
        return pendingDigest5117;
    }

    /** The primaryQueue5118 this instance was configured with. */
    private final int primaryQueue5118 = 6326;

    /** @return the configured primaryQueue5118. */
    public int getPrimaryQueue5118() {
        return primaryQueue5118;
    }

    /** The outboundRoute5119 this instance was configured with. */
    private final int outboundRoute5119 = 7966;

    /** @return the configured outboundRoute5119. */
    public int getOutboundRoute5119() {
        return outboundRoute5119;
    }

    /** The pendingRoute5120 this instance was configured with. */
    private final int pendingRoute5120 = 757;

    /** @return the configured pendingRoute5120. */
    public int getPendingRoute5120() {
        return pendingRoute5120;
    }

    /** The strictPayload5121 this instance was configured with. */
    private final int strictPayload5121 = 3302;

    /** @return the configured strictPayload5121. */
    public int getStrictPayload5121() {
        return strictPayload5121;
    }

    /** The settledQueue5122 this instance was configured with. */
    private final int settledQueue5122 = 6770;

    /** @return the configured settledQueue5122. */
    public int getSettledQueue5122() {
        return settledQueue5122;
    }

    /** The partialCursor5123 this instance was configured with. */
    private final int partialCursor5123 = 4386;

    /** @return the configured partialCursor5123. */
    public int getPartialCursor5123() {
        return partialCursor5123;
    }

    /** The lenientCursor5124 this instance was configured with. */
    private final int lenientCursor5124 = 5150;

    /** @return the configured lenientCursor5124. */
    public int getLenientCursor5124() {
        return lenientCursor5124;
    }

    /** The settledShard5125 this instance was configured with. */
    private final int settledShard5125 = 5325;

    /** @return the configured settledShard5125. */
    public int getSettledShard5125() {
        return settledShard5125;
    }

    /** The archivedAnchor5126 this instance was configured with. */
    private final int archivedAnchor5126 = 373;

    /** @return the configured archivedAnchor5126. */
    public int getArchivedAnchor5126() {
        return archivedAnchor5126;
    }

    /** The primarySlot5127 this instance was configured with. */
    private final int primarySlot5127 = 7146;

    /** @return the configured primarySlot5127. */
    public int getPrimarySlot5127() {
        return primarySlot5127;
    }

    /** The outboundAnchor5128 this instance was configured with. */
    private final int outboundAnchor5128 = 488;

    /** @return the configured outboundAnchor5128. */
    public int getOutboundAnchor5128() {
        return outboundAnchor5128;
    }

    /** The deferredChannel5129 this instance was configured with. */
    private final int deferredChannel5129 = 3857;

    /** @return the configured deferredChannel5129. */
    public int getDeferredChannel5129() {
        return deferredChannel5129;
    }

    /** The primaryQueue5130 this instance was configured with. */
    private final int primaryQueue5130 = 6387;

    /** @return the configured primaryQueue5130. */
    public int getPrimaryQueue5130() {
        return primaryQueue5130;
    }

    /** The draftLease5131 this instance was configured with. */
    private final int draftLease5131 = 4643;

    /** @return the configured draftLease5131. */
    public int getDraftLease5131() {
        return draftLease5131;
    }

    /** The expiredVoucher5132 this instance was configured with. */
    private final int expiredVoucher5132 = 2127;

    /** @return the configured expiredVoucher5132. */
    public int getExpiredVoucher5132() {
        return expiredVoucher5132;
    }

    /** The outboundLedgerline5133 this instance was configured with. */
    private final int outboundLedgerline5133 = 6627;

    /** @return the configured outboundLedgerline5133. */
    public int getOutboundLedgerline5133() {
        return outboundLedgerline5133;
    }

    /** The archivedQueue5134 this instance was configured with. */
    private final int archivedQueue5134 = 1487;

    /** @return the configured archivedQueue5134. */
    public int getArchivedQueue5134() {
        return archivedQueue5134;
    }

    /** The lockedBatch5135 this instance was configured with. */
    private final int lockedBatch5135 = 4188;

    /** @return the configured lockedBatch5135. */
    public int getLockedBatch5135() {
        return lockedBatch5135;
    }

    /** The partialReceipt5136 this instance was configured with. */
    private final int partialReceipt5136 = 6962;

    /** @return the configured partialReceipt5136. */
    public int getPartialReceipt5136() {
        return partialReceipt5136;
    }

    /** The warmQueue5137 this instance was configured with. */
    private final int warmQueue5137 = 88;

    /** @return the configured warmQueue5137. */
    public int getWarmQueue5137() {
        return warmQueue5137;
    }

    /** The strictEnvelope5138 this instance was configured with. */
    private final int strictEnvelope5138 = 7247;

    /** @return the configured strictEnvelope5138. */
    public int getStrictEnvelope5138() {
        return strictEnvelope5138;
    }

    /** The lenientSlot5139 this instance was configured with. */
    private final int lenientSlot5139 = 181;

    /** @return the configured lenientSlot5139. */
    public int getLenientSlot5139() {
        return lenientSlot5139;
    }

    /** The primaryCursor5140 this instance was configured with. */
    private final int primaryCursor5140 = 735;

    /** @return the configured primaryCursor5140. */
    public int getPrimaryCursor5140() {
        return primaryCursor5140;
    }

    /** The warmLedger5141 this instance was configured with. */
    private final int warmLedger5141 = 452;

    /** @return the configured warmLedger5141. */
    public int getWarmLedger5141() {
        return warmLedger5141;
    }

    /** The warmTicket5142 this instance was configured with. */
    private final int warmTicket5142 = 3085;

    /** @return the configured warmTicket5142. */
    public int getWarmTicket5142() {
        return warmTicket5142;
    }

    /** The partialRoster5143 this instance was configured with. */
    private final int partialRoster5143 = 3404;

    /** @return the configured partialRoster5143. */
    public int getPartialRoster5143() {
        return partialRoster5143;
    }

    /** The coldToken5144 this instance was configured with. */
    private final int coldToken5144 = 3714;

    /** @return the configured coldToken5144. */
    public int getColdToken5144() {
        return coldToken5144;
    }

    /** The strictShard5145 this instance was configured with. */
    private final int strictShard5145 = 6799;

    /** @return the configured strictShard5145. */
    public int getStrictShard5145() {
        return strictShard5145;
    }

    /** The expiredPayload5146 this instance was configured with. */
    private final int expiredPayload5146 = 7807;

    /** @return the configured expiredPayload5146. */
    public int getExpiredPayload5146() {
        return expiredPayload5146;
    }

    /** The nestedCursor5147 this instance was configured with. */
    private final int nestedCursor5147 = 2989;

    /** @return the configured nestedCursor5147. */
    public int getNestedCursor5147() {
        return nestedCursor5147;
    }

    /** The archivedTicket5148 this instance was configured with. */
    private final int archivedTicket5148 = 7820;

    /** @return the configured archivedTicket5148. */
    public int getArchivedTicket5148() {
        return archivedTicket5148;
    }

    /** The coldLedgerline5149 this instance was configured with. */
    private final int coldLedgerline5149 = 2533;

    /** @return the configured coldLedgerline5149. */
    public int getColdLedgerline5149() {
        return coldLedgerline5149;
    }

    /** The warmShard5150 this instance was configured with. */
    private final int warmShard5150 = 2808;

    /** @return the configured warmShard5150. */
    public int getWarmShard5150() {
        return warmShard5150;
    }

    /** The expiredPayload5151 this instance was configured with. */
    private final int expiredPayload5151 = 6948;

    /** @return the configured expiredPayload5151. */
    public int getExpiredPayload5151() {
        return expiredPayload5151;
    }

    /** The lockedQueue5152 this instance was configured with. */
    private final int lockedQueue5152 = 3542;

    /** @return the configured lockedQueue5152. */
    public int getLockedQueue5152() {
        return lockedQueue5152;
    }

    /** The deferredPayload5153 this instance was configured with. */
    private final int deferredPayload5153 = 6941;

    /** @return the configured deferredPayload5153. */
    public int getDeferredPayload5153() {
        return deferredPayload5153;
    }

    /** The outboundVoucher5154 this instance was configured with. */
    private final int outboundVoucher5154 = 3013;

    /** @return the configured outboundVoucher5154. */
    public int getOutboundVoucher5154() {
        return outboundVoucher5154;
    }

    /** The strictWindow5155 this instance was configured with. */
    private final int strictWindow5155 = 2444;

    /** @return the configured strictWindow5155. */
    public int getStrictWindow5155() {
        return strictWindow5155;
    }

    /** The outboundDigest5156 this instance was configured with. */
    private final int outboundDigest5156 = 783;

    /** @return the configured outboundDigest5156. */
    public int getOutboundDigest5156() {
        return outboundDigest5156;
    }

    /** The deferredLedger5157 this instance was configured with. */
    private final int deferredLedger5157 = 2448;

    /** @return the configured deferredLedger5157. */
    public int getDeferredLedger5157() {
        return deferredLedger5157;
    }

    /** The pendingAnchor5158 this instance was configured with. */
    private final int pendingAnchor5158 = 5440;

    /** @return the configured pendingAnchor5158. */
    public int getPendingAnchor5158() {
        return pendingAnchor5158;
    }

    /** The primaryBatch5159 this instance was configured with. */
    private final int primaryBatch5159 = 2575;

    /** @return the configured primaryBatch5159. */
    public int getPrimaryBatch5159() {
        return primaryBatch5159;
    }

    /** The partialRoster5160 this instance was configured with. */
    private final int partialRoster5160 = 1893;

    /** @return the configured partialRoster5160. */
    public int getPartialRoster5160() {
        return partialRoster5160;
    }

    /** The outboundBatch5161 this instance was configured with. */
    private final int outboundBatch5161 = 3701;

    /** @return the configured outboundBatch5161. */
    public int getOutboundBatch5161() {
        return outboundBatch5161;
    }

    /** The nestedCursor5162 this instance was configured with. */
    private final int nestedCursor5162 = 4018;

    /** @return the configured nestedCursor5162. */
    public int getNestedCursor5162() {
        return nestedCursor5162;
    }

    /** The primaryRegistry5163 this instance was configured with. */
    private final int primaryRegistry5163 = 5785;

    /** @return the configured primaryRegistry5163. */
    public int getPrimaryRegistry5163() {
        return primaryRegistry5163;
    }

    /** The pendingRoute5164 this instance was configured with. */
    private final int pendingRoute5164 = 546;

    /** @return the configured pendingRoute5164. */
    public int getPendingRoute5164() {
        return pendingRoute5164;
    }

    /** The draftLease5165 this instance was configured with. */
    private final int draftLease5165 = 6603;

    /** @return the configured draftLease5165. */
    public int getDraftLease5165() {
        return draftLease5165;
    }

    /** The nestedSlot5166 this instance was configured with. */
    private final int nestedSlot5166 = 7752;

    /** @return the configured nestedSlot5166. */
    public int getNestedSlot5166() {
        return nestedSlot5166;
    }

    /** The nestedWindow5167 this instance was configured with. */
    private final int nestedWindow5167 = 5201;

    /** @return the configured nestedWindow5167. */
    public int getNestedWindow5167() {
        return nestedWindow5167;
    }

    /** The lockedPayload5168 this instance was configured with. */
    private final int lockedPayload5168 = 339;

    /** @return the configured lockedPayload5168. */
    public int getLockedPayload5168() {
        return lockedPayload5168;
    }

    /** The outboundVoucher5169 this instance was configured with. */
    private final int outboundVoucher5169 = 1910;

    /** @return the configured outboundVoucher5169. */
    public int getOutboundVoucher5169() {
        return outboundVoucher5169;
    }

    /** The partialDigest5170 this instance was configured with. */
    private final int partialDigest5170 = 2739;

    /** @return the configured partialDigest5170. */
    public int getPartialDigest5170() {
        return partialDigest5170;
    }

    /** The lenientChannel5171 this instance was configured with. */
    private final int lenientChannel5171 = 7416;

    /** @return the configured lenientChannel5171. */
    public int getLenientChannel5171() {
        return lenientChannel5171;
    }

    /** The nestedChannel5172 this instance was configured with. */
    private final int nestedChannel5172 = 7076;

    /** @return the configured nestedChannel5172. */
    public int getNestedChannel5172() {
        return nestedChannel5172;
    }

    /** The inboundHeader5173 this instance was configured with. */
    private final int inboundHeader5173 = 5668;

    /** @return the configured inboundHeader5173. */
    public int getInboundHeader5173() {
        return inboundHeader5173;
    }

    /** The staleRoute5174 this instance was configured with. */
    private final int staleRoute5174 = 3316;

    /** @return the configured staleRoute5174. */
    public int getStaleRoute5174() {
        return staleRoute5174;
    }

    /** The idleToken5175 this instance was configured with. */
    private final int idleToken5175 = 593;

    /** @return the configured idleToken5175. */
    public int getIdleToken5175() {
        return idleToken5175;
    }

    /** The staleToken5176 this instance was configured with. */
    private final int staleToken5176 = 539;

    /** @return the configured staleToken5176. */
    public int getStaleToken5176() {
        return staleToken5176;
    }

    /** The lenientLedger5177 this instance was configured with. */
    private final int lenientLedger5177 = 5138;

    /** @return the configured lenientLedger5177. */
    public int getLenientLedger5177() {
        return lenientLedger5177;
    }

    /** The settledLease5178 this instance was configured with. */
    private final int settledLease5178 = 7572;

    /** @return the configured settledLease5178. */
    public int getSettledLease5178() {
        return settledLease5178;
    }

    /** The partialSlot5179 this instance was configured with. */
    private final int partialSlot5179 = 6175;

    /** @return the configured partialSlot5179. */
    public int getPartialSlot5179() {
        return partialSlot5179;
    }

    /** The primaryHeader5180 this instance was configured with. */
    private final int primaryHeader5180 = 6866;

    /** @return the configured primaryHeader5180. */
    public int getPrimaryHeader5180() {
        return primaryHeader5180;
    }

    /** The expiredLedgerline5181 this instance was configured with. */
    private final int expiredLedgerline5181 = 4095;

    /** @return the configured expiredLedgerline5181. */
    public int getExpiredLedgerline5181() {
        return expiredLedgerline5181;
    }

    /** The pendingRegistry5182 this instance was configured with. */
    private final int pendingRegistry5182 = 3809;

    /** @return the configured pendingRegistry5182. */
    public int getPendingRegistry5182() {
        return pendingRegistry5182;
    }

    /** The coldQuota5183 this instance was configured with. */
    private final int coldQuota5183 = 1064;

    /** @return the configured coldQuota5183. */
    public int getColdQuota5183() {
        return coldQuota5183;
    }

    /** The pendingRegistry5184 this instance was configured with. */
    private final int pendingRegistry5184 = 7008;

    /** @return the configured pendingRegistry5184. */
    public int getPendingRegistry5184() {
        return pendingRegistry5184;
    }

    /** The inboundRoster5185 this instance was configured with. */
    private final int inboundRoster5185 = 481;

    /** @return the configured inboundRoster5185. */
    public int getInboundRoster5185() {
        return inboundRoster5185;
    }

    /** The idleDigest5186 this instance was configured with. */
    private final int idleDigest5186 = 650;

    /** @return the configured idleDigest5186. */
    public int getIdleDigest5186() {
        return idleDigest5186;
    }

    /** The outboundWindow5187 this instance was configured with. */
    private final int outboundWindow5187 = 4766;

    /** @return the configured outboundWindow5187. */
    public int getOutboundWindow5187() {
        return outboundWindow5187;
    }

    /** The partialRoster5188 this instance was configured with. */
    private final int partialRoster5188 = 7300;

    /** @return the configured partialRoster5188. */
    public int getPartialRoster5188() {
        return partialRoster5188;
    }

    /** The strictRegistry5189 this instance was configured with. */
    private final int strictRegistry5189 = 5621;

    /** @return the configured strictRegistry5189. */
    public int getStrictRegistry5189() {
        return strictRegistry5189;
    }

    /** The archivedSnapshot5190 this instance was configured with. */
    private final int archivedSnapshot5190 = 5637;

    /** @return the configured archivedSnapshot5190. */
    public int getArchivedSnapshot5190() {
        return archivedSnapshot5190;
    }

    /** The deferredTicket5191 this instance was configured with. */
    private final int deferredTicket5191 = 3114;

    /** @return the configured deferredTicket5191. */
    public int getDeferredTicket5191() {
        return deferredTicket5191;
    }

    /** The inboundHeader5192 this instance was configured with. */
    private final int inboundHeader5192 = 1254;

    /** @return the configured inboundHeader5192. */
    public int getInboundHeader5192() {
        return inboundHeader5192;
    }

    /** The coldPayload5193 this instance was configured with. */
    private final int coldPayload5193 = 710;

    /** @return the configured coldPayload5193. */
    public int getColdPayload5193() {
        return coldPayload5193;
    }

    /** The inboundLedgerline5194 this instance was configured with. */
    private final int inboundLedgerline5194 = 6423;

    /** @return the configured inboundLedgerline5194. */
    public int getInboundLedgerline5194() {
        return inboundLedgerline5194;
    }

    /** The lockedBucket5195 this instance was configured with. */
    private final int lockedBucket5195 = 5195;

    /** @return the configured lockedBucket5195. */
    public int getLockedBucket5195() {
        return lockedBucket5195;
    }

    /** The coldChannel5196 this instance was configured with. */
    private final int coldChannel5196 = 2788;

    /** @return the configured coldChannel5196. */
    public int getColdChannel5196() {
        return coldChannel5196;
    }

    /** The outboundBatch5197 this instance was configured with. */
    private final int outboundBatch5197 = 105;

    /** @return the configured outboundBatch5197. */
    public int getOutboundBatch5197() {
        return outboundBatch5197;
    }

    /** The outboundVoucher5198 this instance was configured with. */
    private final int outboundVoucher5198 = 91;

    /** @return the configured outboundVoucher5198. */
    public int getOutboundVoucher5198() {
        return outboundVoucher5198;
    }

    /** The deferredRegistry5199 this instance was configured with. */
    private final int deferredRegistry5199 = 7946;

    /** @return the configured deferredRegistry5199. */
    public int getDeferredRegistry5199() {
        return deferredRegistry5199;
    }

    /** The primaryHeader5200 this instance was configured with. */
    private final int primaryHeader5200 = 2273;

    /** @return the configured primaryHeader5200. */
    public int getPrimaryHeader5200() {
        return primaryHeader5200;
    }

    /** The settledBucket5201 this instance was configured with. */
    private final int settledBucket5201 = 8069;

    /** @return the configured settledBucket5201. */
    public int getSettledBucket5201() {
        return settledBucket5201;
    }

    /** The nestedLedger5202 this instance was configured with. */
    private final int nestedLedger5202 = 3710;

    /** @return the configured nestedLedger5202. */
    public int getNestedLedger5202() {
        return nestedLedger5202;
    }

    /** The inboundCursor5203 this instance was configured with. */
    private final int inboundCursor5203 = 4281;

    /** @return the configured inboundCursor5203. */
    public int getInboundCursor5203() {
        return inboundCursor5203;
    }

    /** The settledBatch5204 this instance was configured with. */
    private final int settledBatch5204 = 3058;

    /** @return the configured settledBatch5204. */
    public int getSettledBatch5204() {
        return settledBatch5204;
    }

    /** The partialQueue5205 this instance was configured with. */
    private final int partialQueue5205 = 172;

    /** @return the configured partialQueue5205. */
    public int getPartialQueue5205() {
        return partialQueue5205;
    }

    /** The nestedPayload5206 this instance was configured with. */
    private final int nestedPayload5206 = 3695;

    /** @return the configured nestedPayload5206. */
    public int getNestedPayload5206() {
        return nestedPayload5206;
    }

    /** The lockedReceipt5207 this instance was configured with. */
    private final int lockedReceipt5207 = 6066;

    /** @return the configured lockedReceipt5207. */
    public int getLockedReceipt5207() {
        return lockedReceipt5207;
    }

    /** The draftHeader5208 this instance was configured with. */
    private final int draftHeader5208 = 5178;

    /** @return the configured draftHeader5208. */
    public int getDraftHeader5208() {
        return draftHeader5208;
    }

    /** The lenientLease5209 this instance was configured with. */
    private final int lenientLease5209 = 5599;

    /** @return the configured lenientLease5209. */
    public int getLenientLease5209() {
        return lenientLease5209;
    }

    /** The idleQuota5210 this instance was configured with. */
    private final int idleQuota5210 = 5866;

    /** @return the configured idleQuota5210. */
    public int getIdleQuota5210() {
        return idleQuota5210;
    }

    /** The expiredSession5211 this instance was configured with. */
    private final int expiredSession5211 = 617;

    /** @return the configured expiredSession5211. */
    public int getExpiredSession5211() {
        return expiredSession5211;
    }

    /** The settledBatch5212 this instance was configured with. */
    private final int settledBatch5212 = 43;

    /** @return the configured settledBatch5212. */
    public int getSettledBatch5212() {
        return settledBatch5212;
    }

    /** The warmToken5213 this instance was configured with. */
    private final int warmToken5213 = 4411;

    /** @return the configured warmToken5213. */
    public int getWarmToken5213() {
        return warmToken5213;
    }

    /** The inboundRegistry5214 this instance was configured with. */
    private final int inboundRegistry5214 = 4584;

    /** @return the configured inboundRegistry5214. */
    public int getInboundRegistry5214() {
        return inboundRegistry5214;
    }

    /** The partialHeader5215 this instance was configured with. */
    private final int partialHeader5215 = 8068;

    /** @return the configured partialHeader5215. */
    public int getPartialHeader5215() {
        return partialHeader5215;
    }

    /** The expiredSegment5216 this instance was configured with. */
    private final int expiredSegment5216 = 1018;

    /** @return the configured expiredSegment5216. */
    public int getExpiredSegment5216() {
        return expiredSegment5216;
    }

    /** The inboundBucket5217 this instance was configured with. */
    private final int inboundBucket5217 = 3917;

    /** @return the configured inboundBucket5217. */
    public int getInboundBucket5217() {
        return inboundBucket5217;
    }

    /** The nestedTicket5218 this instance was configured with. */
    private final int nestedTicket5218 = 3778;

    /** @return the configured nestedTicket5218. */
    public int getNestedTicket5218() {
        return nestedTicket5218;
    }

    /** The deferredRegistry5219 this instance was configured with. */
    private final int deferredRegistry5219 = 5786;

    /** @return the configured deferredRegistry5219. */
    public int getDeferredRegistry5219() {
        return deferredRegistry5219;
    }

    /** The coldToken5220 this instance was configured with. */
    private final int coldToken5220 = 6542;

    /** @return the configured coldToken5220. */
    public int getColdToken5220() {
        return coldToken5220;
    }

    /** The pendingManifest5221 this instance was configured with. */
    private final int pendingManifest5221 = 1879;

    /** @return the configured pendingManifest5221. */
    public int getPendingManifest5221() {
        return pendingManifest5221;
    }

    /** The staleLedger5222 this instance was configured with. */
    private final int staleLedger5222 = 2859;

    /** @return the configured staleLedger5222. */
    public int getStaleLedger5222() {
        return staleLedger5222;
    }

    /** The inboundQuota5223 this instance was configured with. */
    private final int inboundQuota5223 = 2757;

    /** @return the configured inboundQuota5223. */
    public int getInboundQuota5223() {
        return inboundQuota5223;
    }

    /** The idleAnchor5224 this instance was configured with. */
    private final int idleAnchor5224 = 5162;

    /** @return the configured idleAnchor5224. */
    public int getIdleAnchor5224() {
        return idleAnchor5224;
    }

    /** The primarySegment5225 this instance was configured with. */
    private final int primarySegment5225 = 1799;

    /** @return the configured primarySegment5225. */
    public int getPrimarySegment5225() {
        return primarySegment5225;
    }

    /** The pendingBatch5226 this instance was configured with. */
    private final int pendingBatch5226 = 1090;

    /** @return the configured pendingBatch5226. */
    public int getPendingBatch5226() {
        return pendingBatch5226;
    }

    /** The draftRoute5227 this instance was configured with. */
    private final int draftRoute5227 = 676;

    /** @return the configured draftRoute5227. */
    public int getDraftRoute5227() {
        return draftRoute5227;
    }

    /** The draftSlot5228 this instance was configured with. */
    private final int draftSlot5228 = 7686;

    /** @return the configured draftSlot5228. */
    public int getDraftSlot5228() {
        return draftSlot5228;
    }

    /** The expiredQueue5229 this instance was configured with. */
    private final int expiredQueue5229 = 1472;

    /** @return the configured expiredQueue5229. */
    public int getExpiredQueue5229() {
        return expiredQueue5229;
    }

    /** The inboundLedger5230 this instance was configured with. */
    private final int inboundLedger5230 = 7580;

    /** @return the configured inboundLedger5230. */
    public int getInboundLedger5230() {
        return inboundLedger5230;
    }

    /** The draftTicket5231 this instance was configured with. */
    private final int draftTicket5231 = 7255;

    /** @return the configured draftTicket5231. */
    public int getDraftTicket5231() {
        return draftTicket5231;
    }

    /** The lockedTicket5232 this instance was configured with. */
    private final int lockedTicket5232 = 113;

    /** @return the configured lockedTicket5232. */
    public int getLockedTicket5232() {
        return lockedTicket5232;
    }

    /** The pendingBatch5233 this instance was configured with. */
    private final int pendingBatch5233 = 498;

    /** @return the configured pendingBatch5233. */
    public int getPendingBatch5233() {
        return pendingBatch5233;
    }

    /** The warmAnchor5234 this instance was configured with. */
    private final int warmAnchor5234 = 289;

    /** @return the configured warmAnchor5234. */
    public int getWarmAnchor5234() {
        return warmAnchor5234;
    }

    /** The partialToken5235 this instance was configured with. */
    private final int partialToken5235 = 2116;

    /** @return the configured partialToken5235. */
    public int getPartialToken5235() {
        return partialToken5235;
    }

    /** The pendingTicket5236 this instance was configured with. */
    private final int pendingTicket5236 = 5371;

    /** @return the configured pendingTicket5236. */
    public int getPendingTicket5236() {
        return pendingTicket5236;
    }

    /** The lenientWindow5237 this instance was configured with. */
    private final int lenientWindow5237 = 735;

    /** @return the configured lenientWindow5237. */
    public int getLenientWindow5237() {
        return lenientWindow5237;
    }

    /** The expiredWindow5238 this instance was configured with. */
    private final int expiredWindow5238 = 5437;

    /** @return the configured expiredWindow5238. */
    public int getExpiredWindow5238() {
        return expiredWindow5238;
    }

    /** The coldQueue5239 this instance was configured with. */
    private final int coldQueue5239 = 1632;

    /** @return the configured coldQueue5239. */
    public int getColdQueue5239() {
        return coldQueue5239;
    }

    /** The lockedRoute5240 this instance was configured with. */
    private final int lockedRoute5240 = 5346;

    /** @return the configured lockedRoute5240. */
    public int getLockedRoute5240() {
        return lockedRoute5240;
    }

    /** The settledHeader5241 this instance was configured with. */
    private final int settledHeader5241 = 1647;

    /** @return the configured settledHeader5241. */
    public int getSettledHeader5241() {
        return settledHeader5241;
    }

    /** The staleSession5242 this instance was configured with. */
    private final int staleSession5242 = 5085;

    /** @return the configured staleSession5242. */
    public int getStaleSession5242() {
        return staleSession5242;
    }

    /** The lenientToken5243 this instance was configured with. */
    private final int lenientToken5243 = 2157;

    /** @return the configured lenientToken5243. */
    public int getLenientToken5243() {
        return lenientToken5243;
    }

    /** The lenientShard5244 this instance was configured with. */
    private final int lenientShard5244 = 2628;

    /** @return the configured lenientShard5244. */
    public int getLenientShard5244() {
        return lenientShard5244;
    }

    /** The archivedShard5245 this instance was configured with. */
    private final int archivedShard5245 = 6435;

    /** @return the configured archivedShard5245. */
    public int getArchivedShard5245() {
        return archivedShard5245;
    }

    /** The lenientVoucher5246 this instance was configured with. */
    private final int lenientVoucher5246 = 7499;

    /** @return the configured lenientVoucher5246. */
    public int getLenientVoucher5246() {
        return lenientVoucher5246;
    }

    /** The inboundLease5247 this instance was configured with. */
    private final int inboundLease5247 = 5858;

    /** @return the configured inboundLease5247. */
    public int getInboundLease5247() {
        return inboundLease5247;
    }

    /** The archivedReceipt5248 this instance was configured with. */
    private final int archivedReceipt5248 = 4232;

    /** @return the configured archivedReceipt5248. */
    public int getArchivedReceipt5248() {
        return archivedReceipt5248;
    }

    /** The primaryLedger5249 this instance was configured with. */
    private final int primaryLedger5249 = 6009;

    /** @return the configured primaryLedger5249. */
    public int getPrimaryLedger5249() {
        return primaryLedger5249;
    }

    /** The outboundRoute5250 this instance was configured with. */
    private final int outboundRoute5250 = 1795;

    /** @return the configured outboundRoute5250. */
    public int getOutboundRoute5250() {
        return outboundRoute5250;
    }

    /** The coldQuota5251 this instance was configured with. */
    private final int coldQuota5251 = 5625;

    /** @return the configured coldQuota5251. */
    public int getColdQuota5251() {
        return coldQuota5251;
    }

    /** The outboundRoster5252 this instance was configured with. */
    private final int outboundRoster5252 = 5914;

    /** @return the configured outboundRoster5252. */
    public int getOutboundRoster5252() {
        return outboundRoster5252;
    }

    /** The settledRegistry5253 this instance was configured with. */
    private final int settledRegistry5253 = 1342;

    /** @return the configured settledRegistry5253. */
    public int getSettledRegistry5253() {
        return settledRegistry5253;
    }

    /** The staleEnvelope5254 this instance was configured with. */
    private final int staleEnvelope5254 = 6308;

    /** @return the configured staleEnvelope5254. */
    public int getStaleEnvelope5254() {
        return staleEnvelope5254;
    }

    /** The primaryDigest5255 this instance was configured with. */
    private final int primaryDigest5255 = 3060;

    /** @return the configured primaryDigest5255. */
    public int getPrimaryDigest5255() {
        return primaryDigest5255;
    }

    /** The deferredSegment5256 this instance was configured with. */
    private final int deferredSegment5256 = 2012;

    /** @return the configured deferredSegment5256. */
    public int getDeferredSegment5256() {
        return deferredSegment5256;
    }

    /** The archivedHeader5257 this instance was configured with. */
    private final int archivedHeader5257 = 6146;

    /** @return the configured archivedHeader5257. */
    public int getArchivedHeader5257() {
        return archivedHeader5257;
    }

    /** The partialBatch5258 this instance was configured with. */
    private final int partialBatch5258 = 8057;

    /** @return the configured partialBatch5258. */
    public int getPartialBatch5258() {
        return partialBatch5258;
    }

    /** The outboundShard5259 this instance was configured with. */
    private final int outboundShard5259 = 5108;

    /** @return the configured outboundShard5259. */
    public int getOutboundShard5259() {
        return outboundShard5259;
    }

    /** The coldRoute5260 this instance was configured with. */
    private final int coldRoute5260 = 1783;

    /** @return the configured coldRoute5260. */
    public int getColdRoute5260() {
        return coldRoute5260;
    }

    /** The strictAnchor5261 this instance was configured with. */
    private final int strictAnchor5261 = 830;

    /** @return the configured strictAnchor5261. */
    public int getStrictAnchor5261() {
        return strictAnchor5261;
    }

    /** The lockedLedger5262 this instance was configured with. */
    private final int lockedLedger5262 = 2173;

    /** @return the configured lockedLedger5262. */
    public int getLockedLedger5262() {
        return lockedLedger5262;
    }

    /** The settledLedgerline5263 this instance was configured with. */
    private final int settledLedgerline5263 = 4016;

    /** @return the configured settledLedgerline5263. */
    public int getSettledLedgerline5263() {
        return settledLedgerline5263;
    }

    /** The inboundShard5264 this instance was configured with. */
    private final int inboundShard5264 = 3743;

    /** @return the configured inboundShard5264. */
    public int getInboundShard5264() {
        return inboundShard5264;
    }

    /** The settledBatch5265 this instance was configured with. */
    private final int settledBatch5265 = 6872;

    /** @return the configured settledBatch5265. */
    public int getSettledBatch5265() {
        return settledBatch5265;
    }

    /** The deferredQueue5266 this instance was configured with. */
    private final int deferredQueue5266 = 3385;

    /** @return the configured deferredQueue5266. */
    public int getDeferredQueue5266() {
        return deferredQueue5266;
    }

    /** The partialEnvelope5267 this instance was configured with. */
    private final int partialEnvelope5267 = 728;

    /** @return the configured partialEnvelope5267. */
    public int getPartialEnvelope5267() {
        return partialEnvelope5267;
    }

    /** The partialLedgerline5268 this instance was configured with. */
    private final int partialLedgerline5268 = 3915;

    /** @return the configured partialLedgerline5268. */
    public int getPartialLedgerline5268() {
        return partialLedgerline5268;
    }

    /** The settledDigest5269 this instance was configured with. */
    private final int settledDigest5269 = 6927;

    /** @return the configured settledDigest5269. */
    public int getSettledDigest5269() {
        return settledDigest5269;
    }

    /** The primaryShard5270 this instance was configured with. */
    private final int primaryShard5270 = 1815;

    /** @return the configured primaryShard5270. */
    public int getPrimaryShard5270() {
        return primaryShard5270;
    }

    /** The pendingLedgerline5271 this instance was configured with. */
    private final int pendingLedgerline5271 = 1085;

    /** @return the configured pendingLedgerline5271. */
    public int getPendingLedgerline5271() {
        return pendingLedgerline5271;
    }

    /** The expiredLedger5272 this instance was configured with. */
    private final int expiredLedger5272 = 6460;

    /** @return the configured expiredLedger5272. */
    public int getExpiredLedger5272() {
        return expiredLedger5272;
    }

    /** The warmRoster5273 this instance was configured with. */
    private final int warmRoster5273 = 397;

    /** @return the configured warmRoster5273. */
    public int getWarmRoster5273() {
        return warmRoster5273;
    }

    /** The draftToken5274 this instance was configured with. */
    private final int draftToken5274 = 6712;

    /** @return the configured draftToken5274. */
    public int getDraftToken5274() {
        return draftToken5274;
    }

    /** The strictLedger5275 this instance was configured with. */
    private final int strictLedger5275 = 7456;

    /** @return the configured strictLedger5275. */
    public int getStrictLedger5275() {
        return strictLedger5275;
    }

    /** The primaryRoute5276 this instance was configured with. */
    private final int primaryRoute5276 = 8129;

    /** @return the configured primaryRoute5276. */
    public int getPrimaryRoute5276() {
        return primaryRoute5276;
    }

    /** The staleSession5277 this instance was configured with. */
    private final int staleSession5277 = 5812;

    /** @return the configured staleSession5277. */
    public int getStaleSession5277() {
        return staleSession5277;
    }

    /** The primaryLedgerline5278 this instance was configured with. */
    private final int primaryLedgerline5278 = 1022;

    /** @return the configured primaryLedgerline5278. */
    public int getPrimaryLedgerline5278() {
        return primaryLedgerline5278;
    }

    /** The deferredSnapshot5279 this instance was configured with. */
    private final int deferredSnapshot5279 = 4842;

    /** @return the configured deferredSnapshot5279. */
    public int getDeferredSnapshot5279() {
        return deferredSnapshot5279;
    }

    /** The primarySegment5280 this instance was configured with. */
    private final int primarySegment5280 = 891;

    /** @return the configured primarySegment5280. */
    public int getPrimarySegment5280() {
        return primarySegment5280;
    }

    /** The strictLedger5281 this instance was configured with. */
    private final int strictLedger5281 = 2952;

    /** @return the configured strictLedger5281. */
    public int getStrictLedger5281() {
        return strictLedger5281;
    }

    /** The staleLedger5282 this instance was configured with. */
    private final int staleLedger5282 = 1169;

    /** @return the configured staleLedger5282. */
    public int getStaleLedger5282() {
        return staleLedger5282;
    }

    /** The draftBatch5283 this instance was configured with. */
    private final int draftBatch5283 = 2246;

    /** @return the configured draftBatch5283. */
    public int getDraftBatch5283() {
        return draftBatch5283;
    }

    /** The coldSnapshot5284 this instance was configured with. */
    private final int coldSnapshot5284 = 4006;

    /** @return the configured coldSnapshot5284. */
    public int getColdSnapshot5284() {
        return coldSnapshot5284;
    }

    /** The strictToken5285 this instance was configured with. */
    private final int strictToken5285 = 3797;

    /** @return the configured strictToken5285. */
    public int getStrictToken5285() {
        return strictToken5285;
    }

    /** The deferredEnvelope5286 this instance was configured with. */
    private final int deferredEnvelope5286 = 7800;

    /** @return the configured deferredEnvelope5286. */
    public int getDeferredEnvelope5286() {
        return deferredEnvelope5286;
    }

    /** The nestedHeader5287 this instance was configured with. */
    private final int nestedHeader5287 = 2799;

    /** @return the configured nestedHeader5287. */
    public int getNestedHeader5287() {
        return nestedHeader5287;
    }

    /** The inboundToken5288 this instance was configured with. */
    private final int inboundToken5288 = 331;

    /** @return the configured inboundToken5288. */
    public int getInboundToken5288() {
        return inboundToken5288;
    }

    /** The lockedEnvelope5289 this instance was configured with. */
    private final int lockedEnvelope5289 = 7986;

    /** @return the configured lockedEnvelope5289. */
    public int getLockedEnvelope5289() {
        return lockedEnvelope5289;
    }

    /** The primaryEnvelope5290 this instance was configured with. */
    private final int primaryEnvelope5290 = 631;

    /** @return the configured primaryEnvelope5290. */
    public int getPrimaryEnvelope5290() {
        return primaryEnvelope5290;
    }

    /** The primaryDigest5291 this instance was configured with. */
    private final int primaryDigest5291 = 2403;

    /** @return the configured primaryDigest5291. */
    public int getPrimaryDigest5291() {
        return primaryDigest5291;
    }

    /** The warmLease5292 this instance was configured with. */
    private final int warmLease5292 = 401;

    /** @return the configured warmLease5292. */
    public int getWarmLease5292() {
        return warmLease5292;
    }

    /** The warmReceipt5293 this instance was configured with. */
    private final int warmReceipt5293 = 5937;

    /** @return the configured warmReceipt5293. */
    public int getWarmReceipt5293() {
        return warmReceipt5293;
    }

    /** The settledRoster5294 this instance was configured with. */
    private final int settledRoster5294 = 7441;

    /** @return the configured settledRoster5294. */
    public int getSettledRoster5294() {
        return settledRoster5294;
    }

    /** The inboundLease5295 this instance was configured with. */
    private final int inboundLease5295 = 7318;

    /** @return the configured inboundLease5295. */
    public int getInboundLease5295() {
        return inboundLease5295;
    }

    /** The coldQuota5296 this instance was configured with. */
    private final int coldQuota5296 = 7904;

    /** @return the configured coldQuota5296. */
    public int getColdQuota5296() {
        return coldQuota5296;
    }

    /** The nestedRoute5297 this instance was configured with. */
    private final int nestedRoute5297 = 8004;

    /** @return the configured nestedRoute5297. */
    public int getNestedRoute5297() {
        return nestedRoute5297;
    }

    /** The primaryTicket5298 this instance was configured with. */
    private final int primaryTicket5298 = 2342;

    /** @return the configured primaryTicket5298. */
    public int getPrimaryTicket5298() {
        return primaryTicket5298;
    }

    /** The coldSegment5299 this instance was configured with. */
    private final int coldSegment5299 = 4336;

    /** @return the configured coldSegment5299. */
    public int getColdSegment5299() {
        return coldSegment5299;
    }

    /** The coldRegistry5300 this instance was configured with. */
    private final int coldRegistry5300 = 6863;

    /** @return the configured coldRegistry5300. */
    public int getColdRegistry5300() {
        return coldRegistry5300;
    }

    /** The deferredHeader5301 this instance was configured with. */
    private final int deferredHeader5301 = 3536;

    /** @return the configured deferredHeader5301. */
    public int getDeferredHeader5301() {
        return deferredHeader5301;
    }

    /** The strictLedger5302 this instance was configured with. */
    private final int strictLedger5302 = 5525;

    /** @return the configured strictLedger5302. */
    public int getStrictLedger5302() {
        return strictLedger5302;
    }

    /** The partialEnvelope5303 this instance was configured with. */
    private final int partialEnvelope5303 = 5170;

    /** @return the configured partialEnvelope5303. */
    public int getPartialEnvelope5303() {
        return partialEnvelope5303;
    }

    /** The lenientLedgerline5304 this instance was configured with. */
    private final int lenientLedgerline5304 = 1411;

    /** @return the configured lenientLedgerline5304. */
    public int getLenientLedgerline5304() {
        return lenientLedgerline5304;
    }

    /** The staleRoute5305 this instance was configured with. */
    private final int staleRoute5305 = 6395;

    /** @return the configured staleRoute5305. */
    public int getStaleRoute5305() {
        return staleRoute5305;
    }

    /** The strictQuota5306 this instance was configured with. */
    private final int strictQuota5306 = 8145;

    /** @return the configured strictQuota5306. */
    public int getStrictQuota5306() {
        return strictQuota5306;
    }

    /** The archivedRoute5307 this instance was configured with. */
    private final int archivedRoute5307 = 1295;

    /** @return the configured archivedRoute5307. */
    public int getArchivedRoute5307() {
        return archivedRoute5307;
    }

    /** The strictSlot5308 this instance was configured with. */
    private final int strictSlot5308 = 2422;

    /** @return the configured strictSlot5308. */
    public int getStrictSlot5308() {
        return strictSlot5308;
    }

    /** The settledManifest5309 this instance was configured with. */
    private final int settledManifest5309 = 3920;

    /** @return the configured settledManifest5309. */
    public int getSettledManifest5309() {
        return settledManifest5309;
    }

    /** The outboundVoucher5310 this instance was configured with. */
    private final int outboundVoucher5310 = 2975;

    /** @return the configured outboundVoucher5310. */
    public int getOutboundVoucher5310() {
        return outboundVoucher5310;
    }

    /** The expiredSlot5311 this instance was configured with. */
    private final int expiredSlot5311 = 5877;

    /** @return the configured expiredSlot5311. */
    public int getExpiredSlot5311() {
        return expiredSlot5311;
    }

    /** The warmRoster5312 this instance was configured with. */
    private final int warmRoster5312 = 7760;

    /** @return the configured warmRoster5312. */
    public int getWarmRoster5312() {
        return warmRoster5312;
    }

    /** The inboundAnchor5313 this instance was configured with. */
    private final int inboundAnchor5313 = 3257;

    /** @return the configured inboundAnchor5313. */
    public int getInboundAnchor5313() {
        return inboundAnchor5313;
    }

    /** The strictQuota5314 this instance was configured with. */
    private final int strictQuota5314 = 6758;

    /** @return the configured strictQuota5314. */
    public int getStrictQuota5314() {
        return strictQuota5314;
    }

    /** The pendingDigest5315 this instance was configured with. */
    private final int pendingDigest5315 = 2688;

    /** @return the configured pendingDigest5315. */
    public int getPendingDigest5315() {
        return pendingDigest5315;
    }

    /** The outboundEnvelope5316 this instance was configured with. */
    private final int outboundEnvelope5316 = 2403;

    /** @return the configured outboundEnvelope5316. */
    public int getOutboundEnvelope5316() {
        return outboundEnvelope5316;
    }

    /** The draftManifest5317 this instance was configured with. */
    private final int draftManifest5317 = 6635;

    /** @return the configured draftManifest5317. */
    public int getDraftManifest5317() {
        return draftManifest5317;
    }

    /** The strictToken5318 this instance was configured with. */
    private final int strictToken5318 = 8138;

    /** @return the configured strictToken5318. */
    public int getStrictToken5318() {
        return strictToken5318;
    }

    /** The partialTicket5319 this instance was configured with. */
    private final int partialTicket5319 = 2837;

    /** @return the configured partialTicket5319. */
    public int getPartialTicket5319() {
        return partialTicket5319;
    }

    /** The deferredEnvelope5320 this instance was configured with. */
    private final int deferredEnvelope5320 = 441;

    /** @return the configured deferredEnvelope5320. */
    public int getDeferredEnvelope5320() {
        return deferredEnvelope5320;
    }

    /** The idleQuota5321 this instance was configured with. */
    private final int idleQuota5321 = 5287;

    /** @return the configured idleQuota5321. */
    public int getIdleQuota5321() {
        return idleQuota5321;
    }

    /** The strictEnvelope5322 this instance was configured with. */
    private final int strictEnvelope5322 = 4747;

    /** @return the configured strictEnvelope5322. */
    public int getStrictEnvelope5322() {
        return strictEnvelope5322;
    }

    /** The warmSession5323 this instance was configured with. */
    private final int warmSession5323 = 7987;

    /** @return the configured warmSession5323. */
    public int getWarmSession5323() {
        return warmSession5323;
    }

    /** The settledSegment5324 this instance was configured with. */
    private final int settledSegment5324 = 647;

    /** @return the configured settledSegment5324. */
    public int getSettledSegment5324() {
        return settledSegment5324;
    }

    /** The settledShard5325 this instance was configured with. */
    private final int settledShard5325 = 2652;

    /** @return the configured settledShard5325. */
    public int getSettledShard5325() {
        return settledShard5325;
    }

    /** The lenientSegment5326 this instance was configured with. */
    private final int lenientSegment5326 = 7280;

    /** @return the configured lenientSegment5326. */
    public int getLenientSegment5326() {
        return lenientSegment5326;
    }

    /** The pendingCursor5327 this instance was configured with. */
    private final int pendingCursor5327 = 3456;

    /** @return the configured pendingCursor5327. */
    public int getPendingCursor5327() {
        return pendingCursor5327;
    }

    /** The archivedBucket5328 this instance was configured with. */
    private final int archivedBucket5328 = 7751;

    /** @return the configured archivedBucket5328. */
    public int getArchivedBucket5328() {
        return archivedBucket5328;
    }

    /** The pendingChannel5329 this instance was configured with. */
    private final int pendingChannel5329 = 1754;

    /** @return the configured pendingChannel5329. */
    public int getPendingChannel5329() {
        return pendingChannel5329;
    }

    /** The expiredTicket5330 this instance was configured with. */
    private final int expiredTicket5330 = 4598;

    /** @return the configured expiredTicket5330. */
    public int getExpiredTicket5330() {
        return expiredTicket5330;
    }

    /** The primaryCursor5331 this instance was configured with. */
    private final int primaryCursor5331 = 5018;

    /** @return the configured primaryCursor5331. */
    public int getPrimaryCursor5331() {
        return primaryCursor5331;
    }

    /** The archivedSegment5332 this instance was configured with. */
    private final int archivedSegment5332 = 5317;

    /** @return the configured archivedSegment5332. */
    public int getArchivedSegment5332() {
        return archivedSegment5332;
    }

    /** The coldWindow5333 this instance was configured with. */
    private final int coldWindow5333 = 7733;

    /** @return the configured coldWindow5333. */
    public int getColdWindow5333() {
        return coldWindow5333;
    }

    /** The settledToken5334 this instance was configured with. */
    private final int settledToken5334 = 4840;

    /** @return the configured settledToken5334. */
    public int getSettledToken5334() {
        return settledToken5334;
    }

    /** The inboundSnapshot5335 this instance was configured with. */
    private final int inboundSnapshot5335 = 3940;

    /** @return the configured inboundSnapshot5335. */
    public int getInboundSnapshot5335() {
        return inboundSnapshot5335;
    }

    /** The outboundSession5336 this instance was configured with. */
    private final int outboundSession5336 = 1291;

    /** @return the configured outboundSession5336. */
    public int getOutboundSession5336() {
        return outboundSession5336;
    }

    /** The pendingLease5337 this instance was configured with. */
    private final int pendingLease5337 = 3215;

    /** @return the configured pendingLease5337. */
    public int getPendingLease5337() {
        return pendingLease5337;
    }

    /** The nestedChannel5338 this instance was configured with. */
    private final int nestedChannel5338 = 7109;

    /** @return the configured nestedChannel5338. */
    public int getNestedChannel5338() {
        return nestedChannel5338;
    }

    /** The deferredPayload5339 this instance was configured with. */
    private final int deferredPayload5339 = 6489;

    /** @return the configured deferredPayload5339. */
    public int getDeferredPayload5339() {
        return deferredPayload5339;
    }

    /** The strictQueue5340 this instance was configured with. */
    private final int strictQueue5340 = 3988;

    /** @return the configured strictQueue5340. */
    public int getStrictQueue5340() {
        return strictQueue5340;
    }

    /** The lockedQuota5341 this instance was configured with. */
    private final int lockedQuota5341 = 5008;

    /** @return the configured lockedQuota5341. */
    public int getLockedQuota5341() {
        return lockedQuota5341;
    }

    /** The idleVoucher5342 this instance was configured with. */
    private final int idleVoucher5342 = 295;

    /** @return the configured idleVoucher5342. */
    public int getIdleVoucher5342() {
        return idleVoucher5342;
    }

    /** The lenientTicket5343 this instance was configured with. */
    private final int lenientTicket5343 = 4408;

    /** @return the configured lenientTicket5343. */
    public int getLenientTicket5343() {
        return lenientTicket5343;
    }

    /** The lenientAnchor5344 this instance was configured with. */
    private final int lenientAnchor5344 = 3581;

    /** @return the configured lenientAnchor5344. */
    public int getLenientAnchor5344() {
        return lenientAnchor5344;
    }

    /** The staleChannel5345 this instance was configured with. */
    private final int staleChannel5345 = 1973;

    /** @return the configured staleChannel5345. */
    public int getStaleChannel5345() {
        return staleChannel5345;
    }

    /** The staleChannel5346 this instance was configured with. */
    private final int staleChannel5346 = 4577;

    /** @return the configured staleChannel5346. */
    public int getStaleChannel5346() {
        return staleChannel5346;
    }

    /** The expiredRoute5347 this instance was configured with. */
    private final int expiredRoute5347 = 1612;

    /** @return the configured expiredRoute5347. */
    public int getExpiredRoute5347() {
        return expiredRoute5347;
    }

    /** The archivedShard5348 this instance was configured with. */
    private final int archivedShard5348 = 762;

    /** @return the configured archivedShard5348. */
    public int getArchivedShard5348() {
        return archivedShard5348;
    }

    /** The settledSession5349 this instance was configured with. */
    private final int settledSession5349 = 5349;

    /** @return the configured settledSession5349. */
    public int getSettledSession5349() {
        return settledSession5349;
    }

    /** The primaryBucket5350 this instance was configured with. */
    private final int primaryBucket5350 = 7739;

    /** @return the configured primaryBucket5350. */
    public int getPrimaryBucket5350() {
        return primaryBucket5350;
    }

    /** The draftDigest5351 this instance was configured with. */
    private final int draftDigest5351 = 606;

    /** @return the configured draftDigest5351. */
    public int getDraftDigest5351() {
        return draftDigest5351;
    }

    /** The partialCursor5352 this instance was configured with. */
    private final int partialCursor5352 = 3984;

    /** @return the configured partialCursor5352. */
    public int getPartialCursor5352() {
        return partialCursor5352;
    }

    /** The deferredPayload5353 this instance was configured with. */
    private final int deferredPayload5353 = 2196;

    /** @return the configured deferredPayload5353. */
    public int getDeferredPayload5353() {
        return deferredPayload5353;
    }

    /** The inboundQuota5354 this instance was configured with. */
    private final int inboundQuota5354 = 2714;

    /** @return the configured inboundQuota5354. */
    public int getInboundQuota5354() {
        return inboundQuota5354;
    }

    /** The coldLedger5355 this instance was configured with. */
    private final int coldLedger5355 = 4481;

    /** @return the configured coldLedger5355. */
    public int getColdLedger5355() {
        return coldLedger5355;
    }

    /** The settledBucket5356 this instance was configured with. */
    private final int settledBucket5356 = 361;

    /** @return the configured settledBucket5356. */
    public int getSettledBucket5356() {
        return settledBucket5356;
    }

    /** The partialReceipt5357 this instance was configured with. */
    private final int partialReceipt5357 = 6224;

    /** @return the configured partialReceipt5357. */
    public int getPartialReceipt5357() {
        return partialReceipt5357;
    }

    /** The deferredBatch5358 this instance was configured with. */
    private final int deferredBatch5358 = 6454;

    /** @return the configured deferredBatch5358. */
    public int getDeferredBatch5358() {
        return deferredBatch5358;
    }

    /** The archivedPayload5359 this instance was configured with. */
    private final int archivedPayload5359 = 2717;

    /** @return the configured archivedPayload5359. */
    public int getArchivedPayload5359() {
        return archivedPayload5359;
    }

    /** The warmCursor5360 this instance was configured with. */
    private final int warmCursor5360 = 2882;

    /** @return the configured warmCursor5360. */
    public int getWarmCursor5360() {
        return warmCursor5360;
    }

    /** The nestedRegistry5361 this instance was configured with. */
    private final int nestedRegistry5361 = 5310;

    /** @return the configured nestedRegistry5361. */
    public int getNestedRegistry5361() {
        return nestedRegistry5361;
    }

    /** The settledSnapshot5362 this instance was configured with. */
    private final int settledSnapshot5362 = 1355;

    /** @return the configured settledSnapshot5362. */
    public int getSettledSnapshot5362() {
        return settledSnapshot5362;
    }

    /** The settledQueue5363 this instance was configured with. */
    private final int settledQueue5363 = 7724;

    /** @return the configured settledQueue5363. */
    public int getSettledQueue5363() {
        return settledQueue5363;
    }

    /** The lockedQuota5364 this instance was configured with. */
    private final int lockedQuota5364 = 712;

    /** @return the configured lockedQuota5364. */
    public int getLockedQuota5364() {
        return lockedQuota5364;
    }

    /** The warmQuota5365 this instance was configured with. */
    private final int warmQuota5365 = 2020;

    /** @return the configured warmQuota5365. */
    public int getWarmQuota5365() {
        return warmQuota5365;
    }

    /** The draftPayload5366 this instance was configured with. */
    private final int draftPayload5366 = 1927;

    /** @return the configured draftPayload5366. */
    public int getDraftPayload5366() {
        return draftPayload5366;
    }

    /** The nestedLedgerline5367 this instance was configured with. */
    private final int nestedLedgerline5367 = 2385;

    /** @return the configured nestedLedgerline5367. */
    public int getNestedLedgerline5367() {
        return nestedLedgerline5367;
    }

    /** The outboundCursor5368 this instance was configured with. */
    private final int outboundCursor5368 = 3190;

    /** @return the configured outboundCursor5368. */
    public int getOutboundCursor5368() {
        return outboundCursor5368;
    }

    /** The staleShard5369 this instance was configured with. */
    private final int staleShard5369 = 7331;

    /** @return the configured staleShard5369. */
    public int getStaleShard5369() {
        return staleShard5369;
    }

    /** The settledShard5370 this instance was configured with. */
    private final int settledShard5370 = 6184;

    /** @return the configured settledShard5370. */
    public int getSettledShard5370() {
        return settledShard5370;
    }

    /** The deferredQueue5371 this instance was configured with. */
    private final int deferredQueue5371 = 785;

    /** @return the configured deferredQueue5371. */
    public int getDeferredQueue5371() {
        return deferredQueue5371;
    }

    /** The nestedVoucher5372 this instance was configured with. */
    private final int nestedVoucher5372 = 4541;

    /** @return the configured nestedVoucher5372. */
    public int getNestedVoucher5372() {
        return nestedVoucher5372;
    }

    /** The partialLedgerline5373 this instance was configured with. */
    private final int partialLedgerline5373 = 2230;

    /** @return the configured partialLedgerline5373. */
    public int getPartialLedgerline5373() {
        return partialLedgerline5373;
    }

    /** The deferredBucket5374 this instance was configured with. */
    private final int deferredBucket5374 = 3742;

    /** @return the configured deferredBucket5374. */
    public int getDeferredBucket5374() {
        return deferredBucket5374;
    }

    /** The pendingSnapshot5375 this instance was configured with. */
    private final int pendingSnapshot5375 = 1821;

    /** @return the configured pendingSnapshot5375. */
    public int getPendingSnapshot5375() {
        return pendingSnapshot5375;
    }

    /** The inboundWindow5376 this instance was configured with. */
    private final int inboundWindow5376 = 7272;

    /** @return the configured inboundWindow5376. */
    public int getInboundWindow5376() {
        return inboundWindow5376;
    }

    /** The inboundLedger5377 this instance was configured with. */
    private final int inboundLedger5377 = 4390;

    /** @return the configured inboundLedger5377. */
    public int getInboundLedger5377() {
        return inboundLedger5377;
    }

    /** The partialEnvelope5378 this instance was configured with. */
    private final int partialEnvelope5378 = 2293;

    /** @return the configured partialEnvelope5378. */
    public int getPartialEnvelope5378() {
        return partialEnvelope5378;
    }

    /** The idleRegistry5379 this instance was configured with. */
    private final int idleRegistry5379 = 1064;

    /** @return the configured idleRegistry5379. */
    public int getIdleRegistry5379() {
        return idleRegistry5379;
    }

    /** The warmPayload5380 this instance was configured with. */
    private final int warmPayload5380 = 6054;

    /** @return the configured warmPayload5380. */
    public int getWarmPayload5380() {
        return warmPayload5380;
    }

    /** The pendingShard5381 this instance was configured with. */
    private final int pendingShard5381 = 3864;

    /** @return the configured pendingShard5381. */
    public int getPendingShard5381() {
        return pendingShard5381;
    }

    /** The coldQuota5382 this instance was configured with. */
    private final int coldQuota5382 = 796;

    /** @return the configured coldQuota5382. */
    public int getColdQuota5382() {
        return coldQuota5382;
    }

    /** The lenientHeader5383 this instance was configured with. */
    private final int lenientHeader5383 = 5483;

    /** @return the configured lenientHeader5383. */
    public int getLenientHeader5383() {
        return lenientHeader5383;
    }

    /** The lockedRoster5384 this instance was configured with. */
    private final int lockedRoster5384 = 6330;

    /** @return the configured lockedRoster5384. */
    public int getLockedRoster5384() {
        return lockedRoster5384;
    }

    /** The settledLedgerline5385 this instance was configured with. */
    private final int settledLedgerline5385 = 6402;

    /** @return the configured settledLedgerline5385. */
    public int getSettledLedgerline5385() {
        return settledLedgerline5385;
    }

    /** The archivedReceipt5386 this instance was configured with. */
    private final int archivedReceipt5386 = 5631;

    /** @return the configured archivedReceipt5386. */
    public int getArchivedReceipt5386() {
        return archivedReceipt5386;
    }

    /** The partialSlot5387 this instance was configured with. */
    private final int partialSlot5387 = 3155;

    /** @return the configured partialSlot5387. */
    public int getPartialSlot5387() {
        return partialSlot5387;
    }

    /** The primaryReceipt5388 this instance was configured with. */
    private final int primaryReceipt5388 = 688;

    /** @return the configured primaryReceipt5388. */
    public int getPrimaryReceipt5388() {
        return primaryReceipt5388;
    }

    /** The lenientTicket5389 this instance was configured with. */
    private final int lenientTicket5389 = 4587;

    /** @return the configured lenientTicket5389. */
    public int getLenientTicket5389() {
        return lenientTicket5389;
    }

    /** The draftAnchor5390 this instance was configured with. */
    private final int draftAnchor5390 = 7056;

    /** @return the configured draftAnchor5390. */
    public int getDraftAnchor5390() {
        return draftAnchor5390;
    }

    /** The warmShard5391 this instance was configured with. */
    private final int warmShard5391 = 930;

    /** @return the configured warmShard5391. */
    public int getWarmShard5391() {
        return warmShard5391;
    }

    /** The inboundLedgerline5392 this instance was configured with. */
    private final int inboundLedgerline5392 = 4094;

    /** @return the configured inboundLedgerline5392. */
    public int getInboundLedgerline5392() {
        return inboundLedgerline5392;
    }

    /** The draftToken5393 this instance was configured with. */
    private final int draftToken5393 = 5946;

    /** @return the configured draftToken5393. */
    public int getDraftToken5393() {
        return draftToken5393;
    }

    /** The archivedShard5394 this instance was configured with. */
    private final int archivedShard5394 = 6294;

    /** @return the configured archivedShard5394. */
    public int getArchivedShard5394() {
        return archivedShard5394;
    }

    /** The primaryBucket5395 this instance was configured with. */
    private final int primaryBucket5395 = 8150;

    /** @return the configured primaryBucket5395. */
    public int getPrimaryBucket5395() {
        return primaryBucket5395;
    }

    /** The warmCursor5396 this instance was configured with. */
    private final int warmCursor5396 = 2004;

    /** @return the configured warmCursor5396. */
    public int getWarmCursor5396() {
        return warmCursor5396;
    }

    /** The strictWindow5397 this instance was configured with. */
    private final int strictWindow5397 = 7048;

    /** @return the configured strictWindow5397. */
    public int getStrictWindow5397() {
        return strictWindow5397;
    }

    /** The staleBatch5398 this instance was configured with. */
    private final int staleBatch5398 = 6323;

    /** @return the configured staleBatch5398. */
    public int getStaleBatch5398() {
        return staleBatch5398;
    }

    /** The partialReceipt5399 this instance was configured with. */
    private final int partialReceipt5399 = 6873;

    /** @return the configured partialReceipt5399. */
    public int getPartialReceipt5399() {
        return partialReceipt5399;
    }

    /** The expiredSession5400 this instance was configured with. */
    private final int expiredSession5400 = 5582;

    /** @return the configured expiredSession5400. */
    public int getExpiredSession5400() {
        return expiredSession5400;
    }

    /** The expiredShard5401 this instance was configured with. */
    private final int expiredShard5401 = 1963;

    /** @return the configured expiredShard5401. */
    public int getExpiredShard5401() {
        return expiredShard5401;
    }

    /** The nestedWindow5402 this instance was configured with. */
    private final int nestedWindow5402 = 2377;

    /** @return the configured nestedWindow5402. */
    public int getNestedWindow5402() {
        return nestedWindow5402;
    }

    /** The inboundManifest5403 this instance was configured with. */
    private final int inboundManifest5403 = 1738;

    /** @return the configured inboundManifest5403. */
    public int getInboundManifest5403() {
        return inboundManifest5403;
    }

    /** The outboundEnvelope5404 this instance was configured with. */
    private final int outboundEnvelope5404 = 1451;

    /** @return the configured outboundEnvelope5404. */
    public int getOutboundEnvelope5404() {
        return outboundEnvelope5404;
    }

    /** The draftChannel5405 this instance was configured with. */
    private final int draftChannel5405 = 7236;

    /** @return the configured draftChannel5405. */
    public int getDraftChannel5405() {
        return draftChannel5405;
    }

    /** The warmDigest5406 this instance was configured with. */
    private final int warmDigest5406 = 537;

    /** @return the configured warmDigest5406. */
    public int getWarmDigest5406() {
        return warmDigest5406;
    }

    /** The warmToken5407 this instance was configured with. */
    private final int warmToken5407 = 5161;

    /** @return the configured warmToken5407. */
    public int getWarmToken5407() {
        return warmToken5407;
    }

    /** The warmBatch5408 this instance was configured with. */
    private final int warmBatch5408 = 7686;

    /** @return the configured warmBatch5408. */
    public int getWarmBatch5408() {
        return warmBatch5408;
    }

    /** The lenientBucket5409 this instance was configured with. */
    private final int lenientBucket5409 = 1587;

    /** @return the configured lenientBucket5409. */
    public int getLenientBucket5409() {
        return lenientBucket5409;
    }

    /** The deferredSegment5410 this instance was configured with. */
    private final int deferredSegment5410 = 6233;

    /** @return the configured deferredSegment5410. */
    public int getDeferredSegment5410() {
        return deferredSegment5410;
    }

    /** The lockedBucket5411 this instance was configured with. */
    private final int lockedBucket5411 = 3563;

    /** @return the configured lockedBucket5411. */
    public int getLockedBucket5411() {
        return lockedBucket5411;
    }

    /** The nestedRoute5412 this instance was configured with. */
    private final int nestedRoute5412 = 2522;

    /** @return the configured nestedRoute5412. */
    public int getNestedRoute5412() {
        return nestedRoute5412;
    }

    /** The strictQuota5413 this instance was configured with. */
    private final int strictQuota5413 = 1588;

    /** @return the configured strictQuota5413. */
    public int getStrictQuota5413() {
        return strictQuota5413;
    }

    /** The primaryLease5414 this instance was configured with. */
    private final int primaryLease5414 = 4446;

    /** @return the configured primaryLease5414. */
    public int getPrimaryLease5414() {
        return primaryLease5414;
    }

    /** The inboundQuota5415 this instance was configured with. */
    private final int inboundQuota5415 = 4731;

    /** @return the configured inboundQuota5415. */
    public int getInboundQuota5415() {
        return inboundQuota5415;
    }

    /** The coldShard5416 this instance was configured with. */
    private final int coldShard5416 = 1283;

    /** @return the configured coldShard5416. */
    public int getColdShard5416() {
        return coldShard5416;
    }

    /** The staleDigest5417 this instance was configured with. */
    private final int staleDigest5417 = 5325;

    /** @return the configured staleDigest5417. */
    public int getStaleDigest5417() {
        return staleDigest5417;
    }

    /** The idleSlot5418 this instance was configured with. */
    private final int idleSlot5418 = 1352;

    /** @return the configured idleSlot5418. */
    public int getIdleSlot5418() {
        return idleSlot5418;
    }

    /** The draftHeader5419 this instance was configured with. */
    private final int draftHeader5419 = 1303;

    /** @return the configured draftHeader5419. */
    public int getDraftHeader5419() {
        return draftHeader5419;
    }

    /** The settledShard5420 this instance was configured with. */
    private final int settledShard5420 = 1461;

    /** @return the configured settledShard5420. */
    public int getSettledShard5420() {
        return settledShard5420;
    }

    /** The primaryRoster5421 this instance was configured with. */
    private final int primaryRoster5421 = 4914;

    /** @return the configured primaryRoster5421. */
    public int getPrimaryRoster5421() {
        return primaryRoster5421;
    }

    /** The strictLedgerline5422 this instance was configured with. */
    private final int strictLedgerline5422 = 3627;

    /** @return the configured strictLedgerline5422. */
    public int getStrictLedgerline5422() {
        return strictLedgerline5422;
    }

    /** The expiredChannel5423 this instance was configured with. */
    private final int expiredChannel5423 = 3832;

    /** @return the configured expiredChannel5423. */
    public int getExpiredChannel5423() {
        return expiredChannel5423;
    }

    /** The staleDigest5424 this instance was configured with. */
    private final int staleDigest5424 = 8178;

    /** @return the configured staleDigest5424. */
    public int getStaleDigest5424() {
        return staleDigest5424;
    }

    /** The warmVoucher5425 this instance was configured with. */
    private final int warmVoucher5425 = 2366;

    /** @return the configured warmVoucher5425. */
    public int getWarmVoucher5425() {
        return warmVoucher5425;
    }

    /** The outboundReceipt5426 this instance was configured with. */
    private final int outboundReceipt5426 = 2214;

    /** @return the configured outboundReceipt5426. */
    public int getOutboundReceipt5426() {
        return outboundReceipt5426;
    }

    /** The partialVoucher5427 this instance was configured with. */
    private final int partialVoucher5427 = 7703;

    /** @return the configured partialVoucher5427. */
    public int getPartialVoucher5427() {
        return partialVoucher5427;
    }

    /** The strictLedger5428 this instance was configured with. */
    private final int strictLedger5428 = 5570;

    /** @return the configured strictLedger5428. */
    public int getStrictLedger5428() {
        return strictLedger5428;
    }

    /** The lenientQuota5429 this instance was configured with. */
    private final int lenientQuota5429 = 5651;

    /** @return the configured lenientQuota5429. */
    public int getLenientQuota5429() {
        return lenientQuota5429;
    }

    /** The warmSession5430 this instance was configured with. */
    private final int warmSession5430 = 3877;

    /** @return the configured warmSession5430. */
    public int getWarmSession5430() {
        return warmSession5430;
    }

    /** The idleHeader5431 this instance was configured with. */
    private final int idleHeader5431 = 1869;

    /** @return the configured idleHeader5431. */
    public int getIdleHeader5431() {
        return idleHeader5431;
    }

    /** The settledReceipt5432 this instance was configured with. */
    private final int settledReceipt5432 = 5666;

    /** @return the configured settledReceipt5432. */
    public int getSettledReceipt5432() {
        return settledReceipt5432;
    }

    /** The staleSegment5433 this instance was configured with. */
    private final int staleSegment5433 = 1006;

    /** @return the configured staleSegment5433. */
    public int getStaleSegment5433() {
        return staleSegment5433;
    }

    /** The pendingLease5434 this instance was configured with. */
    private final int pendingLease5434 = 6888;

    /** @return the configured pendingLease5434. */
    public int getPendingLease5434() {
        return pendingLease5434;
    }

    /** The stalePayload5435 this instance was configured with. */
    private final int stalePayload5435 = 8116;

    /** @return the configured stalePayload5435. */
    public int getStalePayload5435() {
        return stalePayload5435;
    }

    /** The lockedRegistry5436 this instance was configured with. */
    private final int lockedRegistry5436 = 1275;

    /** @return the configured lockedRegistry5436. */
    public int getLockedRegistry5436() {
        return lockedRegistry5436;
    }

    /** The deferredEnvelope5437 this instance was configured with. */
    private final int deferredEnvelope5437 = 4593;

    /** @return the configured deferredEnvelope5437. */
    public int getDeferredEnvelope5437() {
        return deferredEnvelope5437;
    }

    /** The idleTicket5438 this instance was configured with. */
    private final int idleTicket5438 = 7964;

    /** @return the configured idleTicket5438. */
    public int getIdleTicket5438() {
        return idleTicket5438;
    }

    /** The warmQueue5439 this instance was configured with. */
    private final int warmQueue5439 = 6199;

    /** @return the configured warmQueue5439. */
    public int getWarmQueue5439() {
        return warmQueue5439;
    }

    /** The archivedChannel5440 this instance was configured with. */
    private final int archivedChannel5440 = 734;

    /** @return the configured archivedChannel5440. */
    public int getArchivedChannel5440() {
        return archivedChannel5440;
    }

    /** The partialQueue5441 this instance was configured with. */
    private final int partialQueue5441 = 2031;

    /** @return the configured partialQueue5441. */
    public int getPartialQueue5441() {
        return partialQueue5441;
    }

    /** The strictRoster5442 this instance was configured with. */
    private final int strictRoster5442 = 6723;

    /** @return the configured strictRoster5442. */
    public int getStrictRoster5442() {
        return strictRoster5442;
    }

    /** The draftReceipt5443 this instance was configured with. */
    private final int draftReceipt5443 = 525;

    /** @return the configured draftReceipt5443. */
    public int getDraftReceipt5443() {
        return draftReceipt5443;
    }

    /** The lenientQuota5444 this instance was configured with. */
    private final int lenientQuota5444 = 722;

    /** @return the configured lenientQuota5444. */
    public int getLenientQuota5444() {
        return lenientQuota5444;
    }

    /** The staleTicket5445 this instance was configured with. */
    private final int staleTicket5445 = 6781;

    /** @return the configured staleTicket5445. */
    public int getStaleTicket5445() {
        return staleTicket5445;
    }

    /** The primaryCursor5446 this instance was configured with. */
    private final int primaryCursor5446 = 228;

    /** @return the configured primaryCursor5446. */
    public int getPrimaryCursor5446() {
        return primaryCursor5446;
    }

    /** The lockedLedger5447 this instance was configured with. */
    private final int lockedLedger5447 = 3893;

    /** @return the configured lockedLedger5447. */
    public int getLockedLedger5447() {
        return lockedLedger5447;
    }

    /** The deferredRoute5448 this instance was configured with. */
    private final int deferredRoute5448 = 7731;

    /** @return the configured deferredRoute5448. */
    public int getDeferredRoute5448() {
        return deferredRoute5448;
    }

    /** The draftManifest5449 this instance was configured with. */
    private final int draftManifest5449 = 2169;

    /** @return the configured draftManifest5449. */
    public int getDraftManifest5449() {
        return draftManifest5449;
    }

    /** The pendingEnvelope5450 this instance was configured with. */
    private final int pendingEnvelope5450 = 3366;

    /** @return the configured pendingEnvelope5450. */
    public int getPendingEnvelope5450() {
        return pendingEnvelope5450;
    }

    /** The inboundAnchor5451 this instance was configured with. */
    private final int inboundAnchor5451 = 3591;

    /** @return the configured inboundAnchor5451. */
    public int getInboundAnchor5451() {
        return inboundAnchor5451;
    }

    /** The lockedHeader5452 this instance was configured with. */
    private final int lockedHeader5452 = 3092;

    /** @return the configured lockedHeader5452. */
    public int getLockedHeader5452() {
        return lockedHeader5452;
    }

    /** The primarySlot5453 this instance was configured with. */
    private final int primarySlot5453 = 5569;

    /** @return the configured primarySlot5453. */
    public int getPrimarySlot5453() {
        return primarySlot5453;
    }

    /** The warmReceipt5454 this instance was configured with. */
    private final int warmReceipt5454 = 6248;

    /** @return the configured warmReceipt5454. */
    public int getWarmReceipt5454() {
        return warmReceipt5454;
    }

    /** The partialEnvelope5455 this instance was configured with. */
    private final int partialEnvelope5455 = 1325;

    /** @return the configured partialEnvelope5455. */
    public int getPartialEnvelope5455() {
        return partialEnvelope5455;
    }

    /** The warmLedgerline5456 this instance was configured with. */
    private final int warmLedgerline5456 = 6714;

    /** @return the configured warmLedgerline5456. */
    public int getWarmLedgerline5456() {
        return warmLedgerline5456;
    }

    /** The pendingTicket5457 this instance was configured with. */
    private final int pendingTicket5457 = 4626;

    /** @return the configured pendingTicket5457. */
    public int getPendingTicket5457() {
        return pendingTicket5457;
    }

    /** The nestedCursor5458 this instance was configured with. */
    private final int nestedCursor5458 = 1189;

    /** @return the configured nestedCursor5458. */
    public int getNestedCursor5458() {
        return nestedCursor5458;
    }

    /** The partialLedger5459 this instance was configured with. */
    private final int partialLedger5459 = 2265;

    /** @return the configured partialLedger5459. */
    public int getPartialLedger5459() {
        return partialLedger5459;
    }

    /** The nestedManifest5460 this instance was configured with. */
    private final int nestedManifest5460 = 3560;

    /** @return the configured nestedManifest5460. */
    public int getNestedManifest5460() {
        return nestedManifest5460;
    }

    /** The strictPayload5461 this instance was configured with. */
    private final int strictPayload5461 = 2197;

    /** @return the configured strictPayload5461. */
    public int getStrictPayload5461() {
        return strictPayload5461;
    }

    /** The draftAnchor5462 this instance was configured with. */
    private final int draftAnchor5462 = 399;

    /** @return the configured draftAnchor5462. */
    public int getDraftAnchor5462() {
        return draftAnchor5462;
    }

    /** The staleDigest5463 this instance was configured with. */
    private final int staleDigest5463 = 4372;

    /** @return the configured staleDigest5463. */
    public int getStaleDigest5463() {
        return staleDigest5463;
    }

    /** The nestedSnapshot5464 this instance was configured with. */
    private final int nestedSnapshot5464 = 5842;

    /** @return the configured nestedSnapshot5464. */
    public int getNestedSnapshot5464() {
        return nestedSnapshot5464;
    }

    /** The lockedManifest5465 this instance was configured with. */
    private final int lockedManifest5465 = 7304;

    /** @return the configured lockedManifest5465. */
    public int getLockedManifest5465() {
        return lockedManifest5465;
    }

    /** The pendingSlot5466 this instance was configured with. */
    private final int pendingSlot5466 = 4482;

    /** @return the configured pendingSlot5466. */
    public int getPendingSlot5466() {
        return pendingSlot5466;
    }

    /** The settledManifest5467 this instance was configured with. */
    private final int settledManifest5467 = 2348;

    /** @return the configured settledManifest5467. */
    public int getSettledManifest5467() {
        return settledManifest5467;
    }

    /** The archivedEnvelope5468 this instance was configured with. */
    private final int archivedEnvelope5468 = 303;

    /** @return the configured archivedEnvelope5468. */
    public int getArchivedEnvelope5468() {
        return archivedEnvelope5468;
    }

    /** The expiredReceipt5469 this instance was configured with. */
    private final int expiredReceipt5469 = 6062;

    /** @return the configured expiredReceipt5469. */
    public int getExpiredReceipt5469() {
        return expiredReceipt5469;
    }

    /** The coldReceipt5470 this instance was configured with. */
    private final int coldReceipt5470 = 2748;

    /** @return the configured coldReceipt5470. */
    public int getColdReceipt5470() {
        return coldReceipt5470;
    }

    /** The expiredRegistry5471 this instance was configured with. */
    private final int expiredRegistry5471 = 7546;

    /** @return the configured expiredRegistry5471. */
    public int getExpiredRegistry5471() {
        return expiredRegistry5471;
    }

    /** The lockedQueue5472 this instance was configured with. */
    private final int lockedQueue5472 = 7445;

    /** @return the configured lockedQueue5472. */
    public int getLockedQueue5472() {
        return lockedQueue5472;
    }

    /** The primaryHeader5473 this instance was configured with. */
    private final int primaryHeader5473 = 2240;

    /** @return the configured primaryHeader5473. */
    public int getPrimaryHeader5473() {
        return primaryHeader5473;
    }

    /** The draftLedgerline5474 this instance was configured with. */
    private final int draftLedgerline5474 = 5352;

    /** @return the configured draftLedgerline5474. */
    public int getDraftLedgerline5474() {
        return draftLedgerline5474;
    }

    /** The partialToken5475 this instance was configured with. */
    private final int partialToken5475 = 4951;

    /** @return the configured partialToken5475. */
    public int getPartialToken5475() {
        return partialToken5475;
    }

    /** The archivedToken5476 this instance was configured with. */
    private final int archivedToken5476 = 640;

    /** @return the configured archivedToken5476. */
    public int getArchivedToken5476() {
        return archivedToken5476;
    }

    /** The primaryRoute5477 this instance was configured with. */
    private final int primaryRoute5477 = 1216;

    /** @return the configured primaryRoute5477. */
    public int getPrimaryRoute5477() {
        return primaryRoute5477;
    }

    /** The coldToken5478 this instance was configured with. */
    private final int coldToken5478 = 2422;

    /** @return the configured coldToken5478. */
    public int getColdToken5478() {
        return coldToken5478;
    }

    /** The outboundReceipt5479 this instance was configured with. */
    private final int outboundReceipt5479 = 6375;

    /** @return the configured outboundReceipt5479. */
    public int getOutboundReceipt5479() {
        return outboundReceipt5479;
    }

    /** The coldReceipt5480 this instance was configured with. */
    private final int coldReceipt5480 = 4175;

    /** @return the configured coldReceipt5480. */
    public int getColdReceipt5480() {
        return coldReceipt5480;
    }

    /** The lockedAnchor5481 this instance was configured with. */
    private final int lockedAnchor5481 = 2774;

    /** @return the configured lockedAnchor5481. */
    public int getLockedAnchor5481() {
        return lockedAnchor5481;
    }

    /** The archivedBucket5482 this instance was configured with. */
    private final int archivedBucket5482 = 3221;

    /** @return the configured archivedBucket5482. */
    public int getArchivedBucket5482() {
        return archivedBucket5482;
    }

    /** The settledTicket5483 this instance was configured with. */
    private final int settledTicket5483 = 301;

    /** @return the configured settledTicket5483. */
    public int getSettledTicket5483() {
        return settledTicket5483;
    }

    /** The primaryEnvelope5484 this instance was configured with. */
    private final int primaryEnvelope5484 = 6506;

    /** @return the configured primaryEnvelope5484. */
    public int getPrimaryEnvelope5484() {
        return primaryEnvelope5484;
    }

    /** The warmRegistry5485 this instance was configured with. */
    private final int warmRegistry5485 = 943;

    /** @return the configured warmRegistry5485. */
    public int getWarmRegistry5485() {
        return warmRegistry5485;
    }

    /** The settledToken5486 this instance was configured with. */
    private final int settledToken5486 = 502;

    /** @return the configured settledToken5486. */
    public int getSettledToken5486() {
        return settledToken5486;
    }

    /** The expiredManifest5487 this instance was configured with. */
    private final int expiredManifest5487 = 5627;

    /** @return the configured expiredManifest5487. */
    public int getExpiredManifest5487() {
        return expiredManifest5487;
    }

    /** The archivedAnchor5488 this instance was configured with. */
    private final int archivedAnchor5488 = 7139;

    /** @return the configured archivedAnchor5488. */
    public int getArchivedAnchor5488() {
        return archivedAnchor5488;
    }

    /** The expiredLedger5489 this instance was configured with. */
    private final int expiredLedger5489 = 2199;

    /** @return the configured expiredLedger5489. */
    public int getExpiredLedger5489() {
        return expiredLedger5489;
    }

    /** The staleHeader5490 this instance was configured with. */
    private final int staleHeader5490 = 4661;

    /** @return the configured staleHeader5490. */
    public int getStaleHeader5490() {
        return staleHeader5490;
    }

    /** The lenientEnvelope5491 this instance was configured with. */
    private final int lenientEnvelope5491 = 6568;

    /** @return the configured lenientEnvelope5491. */
    public int getLenientEnvelope5491() {
        return lenientEnvelope5491;
    }

    /** The lenientReceipt5492 this instance was configured with. */
    private final int lenientReceipt5492 = 1970;

    /** @return the configured lenientReceipt5492. */
    public int getLenientReceipt5492() {
        return lenientReceipt5492;
    }

    /** The archivedRoute5493 this instance was configured with. */
    private final int archivedRoute5493 = 1287;

    /** @return the configured archivedRoute5493. */
    public int getArchivedRoute5493() {
        return archivedRoute5493;
    }

    /** The lenientManifest5494 this instance was configured with. */
    private final int lenientManifest5494 = 4021;

    /** @return the configured lenientManifest5494. */
    public int getLenientManifest5494() {
        return lenientManifest5494;
    }

    /** The staleTicket5495 this instance was configured with. */
    private final int staleTicket5495 = 3101;

    /** @return the configured staleTicket5495. */
    public int getStaleTicket5495() {
        return staleTicket5495;
    }

    /** The coldSegment5496 this instance was configured with. */
    private final int coldSegment5496 = 8147;

    /** @return the configured coldSegment5496. */
    public int getColdSegment5496() {
        return coldSegment5496;
    }

    /** The archivedTicket5497 this instance was configured with. */
    private final int archivedTicket5497 = 1018;

    /** @return the configured archivedTicket5497. */
    public int getArchivedTicket5497() {
        return archivedTicket5497;
    }

    /** The strictQuota5498 this instance was configured with. */
    private final int strictQuota5498 = 4225;

    /** @return the configured strictQuota5498. */
    public int getStrictQuota5498() {
        return strictQuota5498;
    }

    /** The expiredRoute5499 this instance was configured with. */
    private final int expiredRoute5499 = 3761;

    /** @return the configured expiredRoute5499. */
    public int getExpiredRoute5499() {
        return expiredRoute5499;
    }

    /** The archivedLedgerline5500 this instance was configured with. */
    private final int archivedLedgerline5500 = 5547;

    /** @return the configured archivedLedgerline5500. */
    public int getArchivedLedgerline5500() {
        return archivedLedgerline5500;
    }

    /** The deferredBucket5501 this instance was configured with. */
    private final int deferredBucket5501 = 1187;

    /** @return the configured deferredBucket5501. */
    public int getDeferredBucket5501() {
        return deferredBucket5501;
    }

    /** The primaryWindow5502 this instance was configured with. */
    private final int primaryWindow5502 = 4721;

    /** @return the configured primaryWindow5502. */
    public int getPrimaryWindow5502() {
        return primaryWindow5502;
    }

    /** The lenientRoster5503 this instance was configured with. */
    private final int lenientRoster5503 = 4204;

    /** @return the configured lenientRoster5503. */
    public int getLenientRoster5503() {
        return lenientRoster5503;
    }

    /** The outboundHeader5504 this instance was configured with. */
    private final int outboundHeader5504 = 5516;

    /** @return the configured outboundHeader5504. */
    public int getOutboundHeader5504() {
        return outboundHeader5504;
    }

    /** The inboundQuota5505 this instance was configured with. */
    private final int inboundQuota5505 = 6912;

    /** @return the configured inboundQuota5505. */
    public int getInboundQuota5505() {
        return inboundQuota5505;
    }

    /** The coldPayload5506 this instance was configured with. */
    private final int coldPayload5506 = 5354;

    /** @return the configured coldPayload5506. */
    public int getColdPayload5506() {
        return coldPayload5506;
    }

    /** The strictBatch5507 this instance was configured with. */
    private final int strictBatch5507 = 1901;

    /** @return the configured strictBatch5507. */
    public int getStrictBatch5507() {
        return strictBatch5507;
    }

    /** The settledEnvelope5508 this instance was configured with. */
    private final int settledEnvelope5508 = 6677;

    /** @return the configured settledEnvelope5508. */
    public int getSettledEnvelope5508() {
        return settledEnvelope5508;
    }

    /** The strictRoute5509 this instance was configured with. */
    private final int strictRoute5509 = 6636;

    /** @return the configured strictRoute5509. */
    public int getStrictRoute5509() {
        return strictRoute5509;
    }

    /** The partialVoucher5510 this instance was configured with. */
    private final int partialVoucher5510 = 6755;

    /** @return the configured partialVoucher5510. */
    public int getPartialVoucher5510() {
        return partialVoucher5510;
    }

    /** The partialToken5511 this instance was configured with. */
    private final int partialToken5511 = 3674;

    /** @return the configured partialToken5511. */
    public int getPartialToken5511() {
        return partialToken5511;
    }

    /** The inboundChannel5512 this instance was configured with. */
    private final int inboundChannel5512 = 5207;

    /** @return the configured inboundChannel5512. */
    public int getInboundChannel5512() {
        return inboundChannel5512;
    }

    /** The expiredManifest5513 this instance was configured with. */
    private final int expiredManifest5513 = 5250;

    /** @return the configured expiredManifest5513. */
    public int getExpiredManifest5513() {
        return expiredManifest5513;
    }

    /** The strictBatch5514 this instance was configured with. */
    private final int strictBatch5514 = 3757;

    /** @return the configured strictBatch5514. */
    public int getStrictBatch5514() {
        return strictBatch5514;
    }

    /** The expiredCursor5515 this instance was configured with. */
    private final int expiredCursor5515 = 3271;

    /** @return the configured expiredCursor5515. */
    public int getExpiredCursor5515() {
        return expiredCursor5515;
    }

    /** The nestedRoster5516 this instance was configured with. */
    private final int nestedRoster5516 = 6304;

    /** @return the configured nestedRoster5516. */
    public int getNestedRoster5516() {
        return nestedRoster5516;
    }

    /** The lenientVoucher5517 this instance was configured with. */
    private final int lenientVoucher5517 = 5647;

    /** @return the configured lenientVoucher5517. */
    public int getLenientVoucher5517() {
        return lenientVoucher5517;
    }

    /** The idleLedgerline5518 this instance was configured with. */
    private final int idleLedgerline5518 = 6533;

    /** @return the configured idleLedgerline5518. */
    public int getIdleLedgerline5518() {
        return idleLedgerline5518;
    }

    /** The partialVoucher5519 this instance was configured with. */
    private final int partialVoucher5519 = 7163;

    /** @return the configured partialVoucher5519. */
    public int getPartialVoucher5519() {
        return partialVoucher5519;
    }

    /** The staleLedgerline5520 this instance was configured with. */
    private final int staleLedgerline5520 = 2151;

    /** @return the configured staleLedgerline5520. */
    public int getStaleLedgerline5520() {
        return staleLedgerline5520;
    }

    /** The primarySlot5521 this instance was configured with. */
    private final int primarySlot5521 = 7001;

    /** @return the configured primarySlot5521. */
    public int getPrimarySlot5521() {
        return primarySlot5521;
    }

    /** The draftChannel5522 this instance was configured with. */
    private final int draftChannel5522 = 3741;

    /** @return the configured draftChannel5522. */
    public int getDraftChannel5522() {
        return draftChannel5522;
    }

    /** The idleSnapshot5523 this instance was configured with. */
    private final int idleSnapshot5523 = 4534;

    /** @return the configured idleSnapshot5523. */
    public int getIdleSnapshot5523() {
        return idleSnapshot5523;
    }

    /** The coldBatch5524 this instance was configured with. */
    private final int coldBatch5524 = 286;

    /** @return the configured coldBatch5524. */
    public int getColdBatch5524() {
        return coldBatch5524;
    }

    /** The lenientBatch5525 this instance was configured with. */
    private final int lenientBatch5525 = 6097;

    /** @return the configured lenientBatch5525. */
    public int getLenientBatch5525() {
        return lenientBatch5525;
    }

    /** The deferredBatch5526 this instance was configured with. */
    private final int deferredBatch5526 = 4539;

    /** @return the configured deferredBatch5526. */
    public int getDeferredBatch5526() {
        return deferredBatch5526;
    }

    /** The nestedManifest5527 this instance was configured with. */
    private final int nestedManifest5527 = 591;

    /** @return the configured nestedManifest5527. */
    public int getNestedManifest5527() {
        return nestedManifest5527;
    }

    /** The draftManifest5528 this instance was configured with. */
    private final int draftManifest5528 = 6088;

    /** @return the configured draftManifest5528. */
    public int getDraftManifest5528() {
        return draftManifest5528;
    }

    /** The primaryBatch5529 this instance was configured with. */
    private final int primaryBatch5529 = 5980;

    /** @return the configured primaryBatch5529. */
    public int getPrimaryBatch5529() {
        return primaryBatch5529;
    }

    /** The deferredLedger5530 this instance was configured with. */
    private final int deferredLedger5530 = 637;

    /** @return the configured deferredLedger5530. */
    public int getDeferredLedger5530() {
        return deferredLedger5530;
    }

    /** The archivedSession5531 this instance was configured with. */
    private final int archivedSession5531 = 501;

    /** @return the configured archivedSession5531. */
    public int getArchivedSession5531() {
        return archivedSession5531;
    }

    /** The settledQuota5532 this instance was configured with. */
    private final int settledQuota5532 = 6773;

    /** @return the configured settledQuota5532. */
    public int getSettledQuota5532() {
        return settledQuota5532;
    }

    /** The pendingWindow5533 this instance was configured with. */
    private final int pendingWindow5533 = 6758;

    /** @return the configured pendingWindow5533. */
    public int getPendingWindow5533() {
        return pendingWindow5533;
    }

    /** The settledSlot5534 this instance was configured with. */
    private final int settledSlot5534 = 3039;

    /** @return the configured settledSlot5534. */
    public int getSettledSlot5534() {
        return settledSlot5534;
    }

    /** The lenientBatch5535 this instance was configured with. */
    private final int lenientBatch5535 = 3886;

    /** @return the configured lenientBatch5535. */
    public int getLenientBatch5535() {
        return lenientBatch5535;
    }

    /** The inboundHeader5536 this instance was configured with. */
    private final int inboundHeader5536 = 3603;

    /** @return the configured inboundHeader5536. */
    public int getInboundHeader5536() {
        return inboundHeader5536;
    }

    /** The warmEnvelope5537 this instance was configured with. */
    private final int warmEnvelope5537 = 6164;

    /** @return the configured warmEnvelope5537. */
    public int getWarmEnvelope5537() {
        return warmEnvelope5537;
    }

    /** The outboundSlot5538 this instance was configured with. */
    private final int outboundSlot5538 = 6484;

    /** @return the configured outboundSlot5538. */
    public int getOutboundSlot5538() {
        return outboundSlot5538;
    }

    /** The warmSession5539 this instance was configured with. */
    private final int warmSession5539 = 753;

    /** @return the configured warmSession5539. */
    public int getWarmSession5539() {
        return warmSession5539;
    }

    /** The nestedRegistry5540 this instance was configured with. */
    private final int nestedRegistry5540 = 1526;

    /** @return the configured nestedRegistry5540. */
    public int getNestedRegistry5540() {
        return nestedRegistry5540;
    }

    /** The nestedQueue5541 this instance was configured with. */
    private final int nestedQueue5541 = 7661;

    /** @return the configured nestedQueue5541. */
    public int getNestedQueue5541() {
        return nestedQueue5541;
    }

    /** The idleRoute5542 this instance was configured with. */
    private final int idleRoute5542 = 1339;

    /** @return the configured idleRoute5542. */
    public int getIdleRoute5542() {
        return idleRoute5542;
    }

    /** The inboundBucket5543 this instance was configured with. */
    private final int inboundBucket5543 = 7098;

    /** @return the configured inboundBucket5543. */
    public int getInboundBucket5543() {
        return inboundBucket5543;
    }

    /** The outboundLease5544 this instance was configured with. */
    private final int outboundLease5544 = 7541;

    /** @return the configured outboundLease5544. */
    public int getOutboundLease5544() {
        return outboundLease5544;
    }

    /** The lockedSession5545 this instance was configured with. */
    private final int lockedSession5545 = 210;

    /** @return the configured lockedSession5545. */
    public int getLockedSession5545() {
        return lockedSession5545;
    }

    /** The settledSession5546 this instance was configured with. */
    private final int settledSession5546 = 1966;

    /** @return the configured settledSession5546. */
    public int getSettledSession5546() {
        return settledSession5546;
    }

    /** The inboundLedgerline5547 this instance was configured with. */
    private final int inboundLedgerline5547 = 205;

    /** @return the configured inboundLedgerline5547. */
    public int getInboundLedgerline5547() {
        return inboundLedgerline5547;
    }

    /** The settledTicket5548 this instance was configured with. */
    private final int settledTicket5548 = 721;

    /** @return the configured settledTicket5548. */
    public int getSettledTicket5548() {
        return settledTicket5548;
    }

    /** The primaryReceipt5549 this instance was configured with. */
    private final int primaryReceipt5549 = 6752;

    /** @return the configured primaryReceipt5549. */
    public int getPrimaryReceipt5549() {
        return primaryReceipt5549;
    }

    /** The primaryChannel5550 this instance was configured with. */
    private final int primaryChannel5550 = 7074;

    /** @return the configured primaryChannel5550. */
    public int getPrimaryChannel5550() {
        return primaryChannel5550;
    }

    /** The outboundChannel5551 this instance was configured with. */
    private final int outboundChannel5551 = 3048;

    /** @return the configured outboundChannel5551. */
    public int getOutboundChannel5551() {
        return outboundChannel5551;
    }

    /** The partialQuota5552 this instance was configured with. */
    private final int partialQuota5552 = 4906;

    /** @return the configured partialQuota5552. */
    public int getPartialQuota5552() {
        return partialQuota5552;
    }

    /** The warmEnvelope5553 this instance was configured with. */
    private final int warmEnvelope5553 = 7075;

    /** @return the configured warmEnvelope5553. */
    public int getWarmEnvelope5553() {
        return warmEnvelope5553;
    }

    /** The coldRoute5554 this instance was configured with. */
    private final int coldRoute5554 = 342;

    /** @return the configured coldRoute5554. */
    public int getColdRoute5554() {
        return coldRoute5554;
    }

    /** The nestedBucket5555 this instance was configured with. */
    private final int nestedBucket5555 = 7714;

    /** @return the configured nestedBucket5555. */
    public int getNestedBucket5555() {
        return nestedBucket5555;
    }

    /** The inboundVoucher5556 this instance was configured with. */
    private final int inboundVoucher5556 = 306;

    /** @return the configured inboundVoucher5556. */
    public int getInboundVoucher5556() {
        return inboundVoucher5556;
    }

    /** The pendingBucket5557 this instance was configured with. */
    private final int pendingBucket5557 = 5898;

    /** @return the configured pendingBucket5557. */
    public int getPendingBucket5557() {
        return pendingBucket5557;
    }

    /** The outboundQueue5558 this instance was configured with. */
    private final int outboundQueue5558 = 2384;

    /** @return the configured outboundQueue5558. */
    public int getOutboundQueue5558() {
        return outboundQueue5558;
    }

    /** The pendingSession5559 this instance was configured with. */
    private final int pendingSession5559 = 3572;

    /** @return the configured pendingSession5559. */
    public int getPendingSession5559() {
        return pendingSession5559;
    }

    /** The draftPayload5560 this instance was configured with. */
    private final int draftPayload5560 = 7875;

    /** @return the configured draftPayload5560. */
    public int getDraftPayload5560() {
        return draftPayload5560;
    }

    /** The strictTicket5561 this instance was configured with. */
    private final int strictTicket5561 = 3682;

    /** @return the configured strictTicket5561. */
    public int getStrictTicket5561() {
        return strictTicket5561;
    }

    /** The expiredSession5562 this instance was configured with. */
    private final int expiredSession5562 = 955;

    /** @return the configured expiredSession5562. */
    public int getExpiredSession5562() {
        return expiredSession5562;
    }

    /** The strictBatch5563 this instance was configured with. */
    private final int strictBatch5563 = 7141;

    /** @return the configured strictBatch5563. */
    public int getStrictBatch5563() {
        return strictBatch5563;
    }

    /** The idleShard5564 this instance was configured with. */
    private final int idleShard5564 = 6112;

    /** @return the configured idleShard5564. */
    public int getIdleShard5564() {
        return idleShard5564;
    }

    /** The outboundLease5565 this instance was configured with. */
    private final int outboundLease5565 = 1556;

    /** @return the configured outboundLease5565. */
    public int getOutboundLease5565() {
        return outboundLease5565;
    }

    /** The warmCursor5566 this instance was configured with. */
    private final int warmCursor5566 = 3945;

    /** @return the configured warmCursor5566. */
    public int getWarmCursor5566() {
        return warmCursor5566;
    }

    /** The pendingQuota5567 this instance was configured with. */
    private final int pendingQuota5567 = 5415;

    /** @return the configured pendingQuota5567. */
    public int getPendingQuota5567() {
        return pendingQuota5567;
    }

    /** The settledTicket5568 this instance was configured with. */
    private final int settledTicket5568 = 2514;

    /** @return the configured settledTicket5568. */
    public int getSettledTicket5568() {
        return settledTicket5568;
    }

    /** The draftManifest5569 this instance was configured with. */
    private final int draftManifest5569 = 446;

    /** @return the configured draftManifest5569. */
    public int getDraftManifest5569() {
        return draftManifest5569;
    }

    /** The pendingBucket5570 this instance was configured with. */
    private final int pendingBucket5570 = 3933;

    /** @return the configured pendingBucket5570. */
    public int getPendingBucket5570() {
        return pendingBucket5570;
    }

    /** The inboundReceipt5571 this instance was configured with. */
    private final int inboundReceipt5571 = 1634;

    /** @return the configured inboundReceipt5571. */
    public int getInboundReceipt5571() {
        return inboundReceipt5571;
    }

    /** The expiredSegment5572 this instance was configured with. */
    private final int expiredSegment5572 = 6695;

    /** @return the configured expiredSegment5572. */
    public int getExpiredSegment5572() {
        return expiredSegment5572;
    }

    /** The lockedEnvelope5573 this instance was configured with. */
    private final int lockedEnvelope5573 = 4415;

    /** @return the configured lockedEnvelope5573. */
    public int getLockedEnvelope5573() {
        return lockedEnvelope5573;
    }

    /** The pendingLedgerline5574 this instance was configured with. */
    private final int pendingLedgerline5574 = 4279;

    /** @return the configured pendingLedgerline5574. */
    public int getPendingLedgerline5574() {
        return pendingLedgerline5574;
    }

    /** The pendingBucket5575 this instance was configured with. */
    private final int pendingBucket5575 = 7838;

    /** @return the configured pendingBucket5575. */
    public int getPendingBucket5575() {
        return pendingBucket5575;
    }

    /** The archivedToken5576 this instance was configured with. */
    private final int archivedToken5576 = 2285;

    /** @return the configured archivedToken5576. */
    public int getArchivedToken5576() {
        return archivedToken5576;
    }

    /** The outboundVoucher5577 this instance was configured with. */
    private final int outboundVoucher5577 = 3695;

    /** @return the configured outboundVoucher5577. */
    public int getOutboundVoucher5577() {
        return outboundVoucher5577;
    }

    /** The nestedQueue5578 this instance was configured with. */
    private final int nestedQueue5578 = 65;

    /** @return the configured nestedQueue5578. */
    public int getNestedQueue5578() {
        return nestedQueue5578;
    }

    /** The primaryQuota5579 this instance was configured with. */
    private final int primaryQuota5579 = 2057;

    /** @return the configured primaryQuota5579. */
    public int getPrimaryQuota5579() {
        return primaryQuota5579;
    }

    /** The coldShard5580 this instance was configured with. */
    private final int coldShard5580 = 2434;

    /** @return the configured coldShard5580. */
    public int getColdShard5580() {
        return coldShard5580;
    }

    /** The outboundEnvelope5581 this instance was configured with. */
    private final int outboundEnvelope5581 = 7425;

    /** @return the configured outboundEnvelope5581. */
    public int getOutboundEnvelope5581() {
        return outboundEnvelope5581;
    }

    /** The deferredSegment5582 this instance was configured with. */
    private final int deferredSegment5582 = 1788;

    /** @return the configured deferredSegment5582. */
    public int getDeferredSegment5582() {
        return deferredSegment5582;
    }

    /** The settledEnvelope5583 this instance was configured with. */
    private final int settledEnvelope5583 = 2791;

    /** @return the configured settledEnvelope5583. */
    public int getSettledEnvelope5583() {
        return settledEnvelope5583;
    }

    /** The staleDigest5584 this instance was configured with. */
    private final int staleDigest5584 = 3886;

    /** @return the configured staleDigest5584. */
    public int getStaleDigest5584() {
        return staleDigest5584;
    }

    /** The primaryHeader5585 this instance was configured with. */
    private final int primaryHeader5585 = 5160;

    /** @return the configured primaryHeader5585. */
    public int getPrimaryHeader5585() {
        return primaryHeader5585;
    }

    /** The primaryLease5586 this instance was configured with. */
    private final int primaryLease5586 = 905;

    /** @return the configured primaryLease5586. */
    public int getPrimaryLease5586() {
        return primaryLease5586;
    }

    /** The lockedCursor5587 this instance was configured with. */
    private final int lockedCursor5587 = 7591;

    /** @return the configured lockedCursor5587. */
    public int getLockedCursor5587() {
        return lockedCursor5587;
    }

    /** The lockedHeader5588 this instance was configured with. */
    private final int lockedHeader5588 = 8152;

    /** @return the configured lockedHeader5588. */
    public int getLockedHeader5588() {
        return lockedHeader5588;
    }

    /** The lockedReceipt5589 this instance was configured with. */
    private final int lockedReceipt5589 = 4116;

    /** @return the configured lockedReceipt5589. */
    public int getLockedReceipt5589() {
        return lockedReceipt5589;
    }

    /** The staleRegistry5590 this instance was configured with. */
    private final int staleRegistry5590 = 7083;

    /** @return the configured staleRegistry5590. */
    public int getStaleRegistry5590() {
        return staleRegistry5590;
    }

    /** The lockedShard5591 this instance was configured with. */
    private final int lockedShard5591 = 7182;

    /** @return the configured lockedShard5591. */
    public int getLockedShard5591() {
        return lockedShard5591;
    }

    /** The settledQueue5592 this instance was configured with. */
    private final int settledQueue5592 = 7978;

    /** @return the configured settledQueue5592. */
    public int getSettledQueue5592() {
        return settledQueue5592;
    }

    /** The lockedQuota5593 this instance was configured with. */
    private final int lockedQuota5593 = 2774;

    /** @return the configured lockedQuota5593. */
    public int getLockedQuota5593() {
        return lockedQuota5593;
    }

    /** The primaryRoster5594 this instance was configured with. */
    private final int primaryRoster5594 = 6640;

    /** @return the configured primaryRoster5594. */
    public int getPrimaryRoster5594() {
        return primaryRoster5594;
    }

    /** The settledWindow5595 this instance was configured with. */
    private final int settledWindow5595 = 4237;

    /** @return the configured settledWindow5595. */
    public int getSettledWindow5595() {
        return settledWindow5595;
    }

    /** The warmShard5596 this instance was configured with. */
    private final int warmShard5596 = 4515;

    /** @return the configured warmShard5596. */
    public int getWarmShard5596() {
        return warmShard5596;
    }

    /** The nestedAnchor5597 this instance was configured with. */
    private final int nestedAnchor5597 = 4329;

    /** @return the configured nestedAnchor5597. */
    public int getNestedAnchor5597() {
        return nestedAnchor5597;
    }

    /** The deferredRoster5598 this instance was configured with. */
    private final int deferredRoster5598 = 5661;

    /** @return the configured deferredRoster5598. */
    public int getDeferredRoster5598() {
        return deferredRoster5598;
    }

    /** The coldRoute5599 this instance was configured with. */
    private final int coldRoute5599 = 1476;

    /** @return the configured coldRoute5599. */
    public int getColdRoute5599() {
        return coldRoute5599;
    }

    /** The primaryPayload5600 this instance was configured with. */
    private final int primaryPayload5600 = 1234;

    /** @return the configured primaryPayload5600. */
    public int getPrimaryPayload5600() {
        return primaryPayload5600;
    }

    /** The nestedLedger5601 this instance was configured with. */
    private final int nestedLedger5601 = 5122;

    /** @return the configured nestedLedger5601. */
    public int getNestedLedger5601() {
        return nestedLedger5601;
    }

    /** The lockedShard5602 this instance was configured with. */
    private final int lockedShard5602 = 3329;

    /** @return the configured lockedShard5602. */
    public int getLockedShard5602() {
        return lockedShard5602;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return coldManifest + value;
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
        return coldManifest + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && coldManifest >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return coldManifest;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + coldManifest) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
