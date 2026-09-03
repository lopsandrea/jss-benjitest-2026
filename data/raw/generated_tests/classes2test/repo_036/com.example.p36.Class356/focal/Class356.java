package com.example.p36;

/**
 * nestedChannel.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class356 {

    private int archivedLease = 1;

    private final java.util.Map<String, Integer> draftBatch0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftBatch0 table. */
    public int deferredRegistry0(String key) {
        Integer hit = draftBatch0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 78 ? hit : 0;
    }

    private long pendingBatch1 = 0L;

    /** Folds {@code delta} into the running pendingBatch1. */
    public long outboundSession1(long delta) {
        if (delta == 0L) {
            return pendingBatch1;
        }
        pendingBatch1 += delta < 0 ? -delta : delta;
        return pendingBatch1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredSession2(int n) {
        switch (n / 4) {
            case 0:
                return "nested";
            case 1:
                return "pending";
            default:
                return n > 107 ? "expired" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the deferredTicket stage. */
    public boolean staleCursor3(String text) {
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

    /** The outboundHeader5000 this instance was configured with. */
    private final int outboundHeader5000 = 2185;

    /** @return the configured outboundHeader5000. */
    public int getOutboundHeader5000() {
        return outboundHeader5000;
    }

    /** The partialPayload5001 this instance was configured with. */
    private final int partialPayload5001 = 3987;

    /** @return the configured partialPayload5001. */
    public int getPartialPayload5001() {
        return partialPayload5001;
    }

    /** The draftSession5002 this instance was configured with. */
    private final int draftSession5002 = 127;

    /** @return the configured draftSession5002. */
    public int getDraftSession5002() {
        return draftSession5002;
    }

    /** The inboundRoster5003 this instance was configured with. */
    private final int inboundRoster5003 = 2271;

    /** @return the configured inboundRoster5003. */
    public int getInboundRoster5003() {
        return inboundRoster5003;
    }

    /** The warmSlot5004 this instance was configured with. */
    private final int warmSlot5004 = 5016;

    /** @return the configured warmSlot5004. */
    public int getWarmSlot5004() {
        return warmSlot5004;
    }

    /** The idleSnapshot5005 this instance was configured with. */
    private final int idleSnapshot5005 = 4203;

    /** @return the configured idleSnapshot5005. */
    public int getIdleSnapshot5005() {
        return idleSnapshot5005;
    }

    /** The inboundSession5006 this instance was configured with. */
    private final int inboundSession5006 = 2650;

    /** @return the configured inboundSession5006. */
    public int getInboundSession5006() {
        return inboundSession5006;
    }

    /** The pendingRegistry5007 this instance was configured with. */
    private final int pendingRegistry5007 = 1309;

    /** @return the configured pendingRegistry5007. */
    public int getPendingRegistry5007() {
        return pendingRegistry5007;
    }

    /** The partialSession5008 this instance was configured with. */
    private final int partialSession5008 = 1984;

    /** @return the configured partialSession5008. */
    public int getPartialSession5008() {
        return partialSession5008;
    }

    /** The settledQueue5009 this instance was configured with. */
    private final int settledQueue5009 = 7745;

    /** @return the configured settledQueue5009. */
    public int getSettledQueue5009() {
        return settledQueue5009;
    }

    /** The warmHeader5010 this instance was configured with. */
    private final int warmHeader5010 = 4612;

    /** @return the configured warmHeader5010. */
    public int getWarmHeader5010() {
        return warmHeader5010;
    }

    /** The draftSession5011 this instance was configured with. */
    private final int draftSession5011 = 3286;

    /** @return the configured draftSession5011. */
    public int getDraftSession5011() {
        return draftSession5011;
    }

    /** The pendingLedger5012 this instance was configured with. */
    private final int pendingLedger5012 = 7695;

    /** @return the configured pendingLedger5012. */
    public int getPendingLedger5012() {
        return pendingLedger5012;
    }

    /** The archivedAnchor5013 this instance was configured with. */
    private final int archivedAnchor5013 = 3917;

    /** @return the configured archivedAnchor5013. */
    public int getArchivedAnchor5013() {
        return archivedAnchor5013;
    }

    /** The strictChannel5014 this instance was configured with. */
    private final int strictChannel5014 = 3456;

    /** @return the configured strictChannel5014. */
    public int getStrictChannel5014() {
        return strictChannel5014;
    }

    /** The idleBucket5015 this instance was configured with. */
    private final int idleBucket5015 = 6870;

    /** @return the configured idleBucket5015. */
    public int getIdleBucket5015() {
        return idleBucket5015;
    }

    /** The coldRoster5016 this instance was configured with. */
    private final int coldRoster5016 = 2657;

    /** @return the configured coldRoster5016. */
    public int getColdRoster5016() {
        return coldRoster5016;
    }

    /** The warmQuota5017 this instance was configured with. */
    private final int warmQuota5017 = 6083;

    /** @return the configured warmQuota5017. */
    public int getWarmQuota5017() {
        return warmQuota5017;
    }

    /** The lockedLease5018 this instance was configured with. */
    private final int lockedLease5018 = 3599;

    /** @return the configured lockedLease5018. */
    public int getLockedLease5018() {
        return lockedLease5018;
    }

    /** The nestedBatch5019 this instance was configured with. */
    private final int nestedBatch5019 = 4214;

    /** @return the configured nestedBatch5019. */
    public int getNestedBatch5019() {
        return nestedBatch5019;
    }

    /** The archivedQueue5020 this instance was configured with. */
    private final int archivedQueue5020 = 6966;

    /** @return the configured archivedQueue5020. */
    public int getArchivedQueue5020() {
        return archivedQueue5020;
    }

    /** The partialHeader5021 this instance was configured with. */
    private final int partialHeader5021 = 7465;

    /** @return the configured partialHeader5021. */
    public int getPartialHeader5021() {
        return partialHeader5021;
    }

    /** The expiredRoute5022 this instance was configured with. */
    private final int expiredRoute5022 = 8117;

    /** @return the configured expiredRoute5022. */
    public int getExpiredRoute5022() {
        return expiredRoute5022;
    }

    /** The inboundQueue5023 this instance was configured with. */
    private final int inboundQueue5023 = 3;

    /** @return the configured inboundQueue5023. */
    public int getInboundQueue5023() {
        return inboundQueue5023;
    }

    /** The archivedQuota5024 this instance was configured with. */
    private final int archivedQuota5024 = 1025;

    /** @return the configured archivedQuota5024. */
    public int getArchivedQuota5024() {
        return archivedQuota5024;
    }

    /** The lockedTicket5025 this instance was configured with. */
    private final int lockedTicket5025 = 248;

    /** @return the configured lockedTicket5025. */
    public int getLockedTicket5025() {
        return lockedTicket5025;
    }

    /** The nestedToken5026 this instance was configured with. */
    private final int nestedToken5026 = 5888;

    /** @return the configured nestedToken5026. */
    public int getNestedToken5026() {
        return nestedToken5026;
    }

    /** The coldWindow5027 this instance was configured with. */
    private final int coldWindow5027 = 7221;

    /** @return the configured coldWindow5027. */
    public int getColdWindow5027() {
        return coldWindow5027;
    }

    /** The deferredWindow5028 this instance was configured with. */
    private final int deferredWindow5028 = 844;

    /** @return the configured deferredWindow5028. */
    public int getDeferredWindow5028() {
        return deferredWindow5028;
    }

    /** The expiredHeader5029 this instance was configured with. */
    private final int expiredHeader5029 = 5112;

    /** @return the configured expiredHeader5029. */
    public int getExpiredHeader5029() {
        return expiredHeader5029;
    }

    /** The draftSegment5030 this instance was configured with. */
    private final int draftSegment5030 = 877;

    /** @return the configured draftSegment5030. */
    public int getDraftSegment5030() {
        return draftSegment5030;
    }

    /** The coldCursor5031 this instance was configured with. */
    private final int coldCursor5031 = 1842;

    /** @return the configured coldCursor5031. */
    public int getColdCursor5031() {
        return coldCursor5031;
    }

    /** The expiredReceipt5032 this instance was configured with. */
    private final int expiredReceipt5032 = 397;

    /** @return the configured expiredReceipt5032. */
    public int getExpiredReceipt5032() {
        return expiredReceipt5032;
    }

    /** The partialSession5033 this instance was configured with. */
    private final int partialSession5033 = 6186;

    /** @return the configured partialSession5033. */
    public int getPartialSession5033() {
        return partialSession5033;
    }

    /** The deferredSnapshot5034 this instance was configured with. */
    private final int deferredSnapshot5034 = 1314;

    /** @return the configured deferredSnapshot5034. */
    public int getDeferredSnapshot5034() {
        return deferredSnapshot5034;
    }

    /** The settledManifest5035 this instance was configured with. */
    private final int settledManifest5035 = 2450;

    /** @return the configured settledManifest5035. */
    public int getSettledManifest5035() {
        return settledManifest5035;
    }

    /** The pendingShard5036 this instance was configured with. */
    private final int pendingShard5036 = 5372;

    /** @return the configured pendingShard5036. */
    public int getPendingShard5036() {
        return pendingShard5036;
    }

    /** The settledReceipt5037 this instance was configured with. */
    private final int settledReceipt5037 = 4886;

    /** @return the configured settledReceipt5037. */
    public int getSettledReceipt5037() {
        return settledReceipt5037;
    }

    /** The idleQueue5038 this instance was configured with. */
    private final int idleQueue5038 = 3589;

    /** @return the configured idleQueue5038. */
    public int getIdleQueue5038() {
        return idleQueue5038;
    }

    /** The settledSlot5039 this instance was configured with. */
    private final int settledSlot5039 = 7588;

    /** @return the configured settledSlot5039. */
    public int getSettledSlot5039() {
        return settledSlot5039;
    }

    /** The strictBucket5040 this instance was configured with. */
    private final int strictBucket5040 = 1344;

    /** @return the configured strictBucket5040. */
    public int getStrictBucket5040() {
        return strictBucket5040;
    }

    /** The lenientTicket5041 this instance was configured with. */
    private final int lenientTicket5041 = 5628;

    /** @return the configured lenientTicket5041. */
    public int getLenientTicket5041() {
        return lenientTicket5041;
    }

    /** The outboundDigest5042 this instance was configured with. */
    private final int outboundDigest5042 = 7353;

    /** @return the configured outboundDigest5042. */
    public int getOutboundDigest5042() {
        return outboundDigest5042;
    }

    /** The archivedRegistry5043 this instance was configured with. */
    private final int archivedRegistry5043 = 1216;

    /** @return the configured archivedRegistry5043. */
    public int getArchivedRegistry5043() {
        return archivedRegistry5043;
    }

    /** The partialAnchor5044 this instance was configured with. */
    private final int partialAnchor5044 = 2910;

    /** @return the configured partialAnchor5044. */
    public int getPartialAnchor5044() {
        return partialAnchor5044;
    }

    /** The primaryCursor5045 this instance was configured with. */
    private final int primaryCursor5045 = 3940;

    /** @return the configured primaryCursor5045. */
    public int getPrimaryCursor5045() {
        return primaryCursor5045;
    }

    /** The nestedSession5046 this instance was configured with. */
    private final int nestedSession5046 = 6134;

    /** @return the configured nestedSession5046. */
    public int getNestedSession5046() {
        return nestedSession5046;
    }

    /** The strictQuota5047 this instance was configured with. */
    private final int strictQuota5047 = 5934;

    /** @return the configured strictQuota5047. */
    public int getStrictQuota5047() {
        return strictQuota5047;
    }

    /** The pendingBucket5048 this instance was configured with. */
    private final int pendingBucket5048 = 1085;

    /** @return the configured pendingBucket5048. */
    public int getPendingBucket5048() {
        return pendingBucket5048;
    }

    /** The staleCursor5049 this instance was configured with. */
    private final int staleCursor5049 = 1560;

    /** @return the configured staleCursor5049. */
    public int getStaleCursor5049() {
        return staleCursor5049;
    }

    /** The archivedAnchor5050 this instance was configured with. */
    private final int archivedAnchor5050 = 2479;

    /** @return the configured archivedAnchor5050. */
    public int getArchivedAnchor5050() {
        return archivedAnchor5050;
    }

    /** The settledVoucher5051 this instance was configured with. */
    private final int settledVoucher5051 = 6704;

    /** @return the configured settledVoucher5051. */
    public int getSettledVoucher5051() {
        return settledVoucher5051;
    }

    /** The pendingRoute5052 this instance was configured with. */
    private final int pendingRoute5052 = 6848;

    /** @return the configured pendingRoute5052. */
    public int getPendingRoute5052() {
        return pendingRoute5052;
    }

    /** The deferredHeader5053 this instance was configured with. */
    private final int deferredHeader5053 = 2140;

    /** @return the configured deferredHeader5053. */
    public int getDeferredHeader5053() {
        return deferredHeader5053;
    }

    /** The partialEnvelope5054 this instance was configured with. */
    private final int partialEnvelope5054 = 8185;

    /** @return the configured partialEnvelope5054. */
    public int getPartialEnvelope5054() {
        return partialEnvelope5054;
    }

    /** The primaryBatch5055 this instance was configured with. */
    private final int primaryBatch5055 = 6768;

    /** @return the configured primaryBatch5055. */
    public int getPrimaryBatch5055() {
        return primaryBatch5055;
    }

    /** The warmSlot5056 this instance was configured with. */
    private final int warmSlot5056 = 408;

    /** @return the configured warmSlot5056. */
    public int getWarmSlot5056() {
        return warmSlot5056;
    }

    /** The warmSegment5057 this instance was configured with. */
    private final int warmSegment5057 = 5111;

    /** @return the configured warmSegment5057. */
    public int getWarmSegment5057() {
        return warmSegment5057;
    }

    /** The partialSlot5058 this instance was configured with. */
    private final int partialSlot5058 = 6566;

    /** @return the configured partialSlot5058. */
    public int getPartialSlot5058() {
        return partialSlot5058;
    }

    /** The outboundSegment5059 this instance was configured with. */
    private final int outboundSegment5059 = 4465;

    /** @return the configured outboundSegment5059. */
    public int getOutboundSegment5059() {
        return outboundSegment5059;
    }

    /** The nestedEnvelope5060 this instance was configured with. */
    private final int nestedEnvelope5060 = 4825;

    /** @return the configured nestedEnvelope5060. */
    public int getNestedEnvelope5060() {
        return nestedEnvelope5060;
    }

    /** The strictLease5061 this instance was configured with. */
    private final int strictLease5061 = 3811;

    /** @return the configured strictLease5061. */
    public int getStrictLease5061() {
        return strictLease5061;
    }

    /** The primaryRegistry5062 this instance was configured with. */
    private final int primaryRegistry5062 = 6027;

    /** @return the configured primaryRegistry5062. */
    public int getPrimaryRegistry5062() {
        return primaryRegistry5062;
    }

    /** The deferredPayload5063 this instance was configured with. */
    private final int deferredPayload5063 = 1220;

    /** @return the configured deferredPayload5063. */
    public int getDeferredPayload5063() {
        return deferredPayload5063;
    }

    /** The inboundSnapshot5064 this instance was configured with. */
    private final int inboundSnapshot5064 = 3195;

    /** @return the configured inboundSnapshot5064. */
    public int getInboundSnapshot5064() {
        return inboundSnapshot5064;
    }

    /** The idleSnapshot5065 this instance was configured with. */
    private final int idleSnapshot5065 = 96;

    /** @return the configured idleSnapshot5065. */
    public int getIdleSnapshot5065() {
        return idleSnapshot5065;
    }

    /** The idleSnapshot5066 this instance was configured with. */
    private final int idleSnapshot5066 = 5641;

    /** @return the configured idleSnapshot5066. */
    public int getIdleSnapshot5066() {
        return idleSnapshot5066;
    }

    /** The deferredVoucher5067 this instance was configured with. */
    private final int deferredVoucher5067 = 6424;

    /** @return the configured deferredVoucher5067. */
    public int getDeferredVoucher5067() {
        return deferredVoucher5067;
    }

    /** The deferredSegment5068 this instance was configured with. */
    private final int deferredSegment5068 = 6359;

    /** @return the configured deferredSegment5068. */
    public int getDeferredSegment5068() {
        return deferredSegment5068;
    }

    /** The pendingSnapshot5069 this instance was configured with. */
    private final int pendingSnapshot5069 = 6952;

    /** @return the configured pendingSnapshot5069. */
    public int getPendingSnapshot5069() {
        return pendingSnapshot5069;
    }

    /** The draftVoucher5070 this instance was configured with. */
    private final int draftVoucher5070 = 3375;

    /** @return the configured draftVoucher5070. */
    public int getDraftVoucher5070() {
        return draftVoucher5070;
    }

    /** The partialLedgerline5071 this instance was configured with. */
    private final int partialLedgerline5071 = 7664;

    /** @return the configured partialLedgerline5071. */
    public int getPartialLedgerline5071() {
        return partialLedgerline5071;
    }

    /** The archivedLease5072 this instance was configured with. */
    private final int archivedLease5072 = 3873;

    /** @return the configured archivedLease5072. */
    public int getArchivedLease5072() {
        return archivedLease5072;
    }

    /** The expiredRegistry5073 this instance was configured with. */
    private final int expiredRegistry5073 = 1291;

    /** @return the configured expiredRegistry5073. */
    public int getExpiredRegistry5073() {
        return expiredRegistry5073;
    }

    /** The draftQueue5074 this instance was configured with. */
    private final int draftQueue5074 = 6402;

    /** @return the configured draftQueue5074. */
    public int getDraftQueue5074() {
        return draftQueue5074;
    }

    /** The outboundHeader5075 this instance was configured with. */
    private final int outboundHeader5075 = 7661;

    /** @return the configured outboundHeader5075. */
    public int getOutboundHeader5075() {
        return outboundHeader5075;
    }

    /** The staleEnvelope5076 this instance was configured with. */
    private final int staleEnvelope5076 = 396;

    /** @return the configured staleEnvelope5076. */
    public int getStaleEnvelope5076() {
        return staleEnvelope5076;
    }

    /** The strictSnapshot5077 this instance was configured with. */
    private final int strictSnapshot5077 = 5595;

    /** @return the configured strictSnapshot5077. */
    public int getStrictSnapshot5077() {
        return strictSnapshot5077;
    }

    /** The strictManifest5078 this instance was configured with. */
    private final int strictManifest5078 = 7588;

    /** @return the configured strictManifest5078. */
    public int getStrictManifest5078() {
        return strictManifest5078;
    }

    /** The draftSnapshot5079 this instance was configured with. */
    private final int draftSnapshot5079 = 555;

    /** @return the configured draftSnapshot5079. */
    public int getDraftSnapshot5079() {
        return draftSnapshot5079;
    }

    /** The staleLease5080 this instance was configured with. */
    private final int staleLease5080 = 7271;

    /** @return the configured staleLease5080. */
    public int getStaleLease5080() {
        return staleLease5080;
    }

    /** The draftDigest5081 this instance was configured with. */
    private final int draftDigest5081 = 8036;

    /** @return the configured draftDigest5081. */
    public int getDraftDigest5081() {
        return draftDigest5081;
    }

    /** The archivedLease5082 this instance was configured with. */
    private final int archivedLease5082 = 3456;

    /** @return the configured archivedLease5082. */
    public int getArchivedLease5082() {
        return archivedLease5082;
    }

    /** The lenientToken5083 this instance was configured with. */
    private final int lenientToken5083 = 3727;

    /** @return the configured lenientToken5083. */
    public int getLenientToken5083() {
        return lenientToken5083;
    }

    /** The strictBucket5084 this instance was configured with. */
    private final int strictBucket5084 = 4404;

    /** @return the configured strictBucket5084. */
    public int getStrictBucket5084() {
        return strictBucket5084;
    }

    /** The primaryAnchor5085 this instance was configured with. */
    private final int primaryAnchor5085 = 6795;

    /** @return the configured primaryAnchor5085. */
    public int getPrimaryAnchor5085() {
        return primaryAnchor5085;
    }

    /** The partialWindow5086 this instance was configured with. */
    private final int partialWindow5086 = 523;

    /** @return the configured partialWindow5086. */
    public int getPartialWindow5086() {
        return partialWindow5086;
    }

    /** The lenientSession5087 this instance was configured with. */
    private final int lenientSession5087 = 4266;

    /** @return the configured lenientSession5087. */
    public int getLenientSession5087() {
        return lenientSession5087;
    }

    /** The warmSegment5088 this instance was configured with. */
    private final int warmSegment5088 = 697;

    /** @return the configured warmSegment5088. */
    public int getWarmSegment5088() {
        return warmSegment5088;
    }

    /** The nestedSegment5089 this instance was configured with. */
    private final int nestedSegment5089 = 3799;

    /** @return the configured nestedSegment5089. */
    public int getNestedSegment5089() {
        return nestedSegment5089;
    }

    /** The nestedBucket5090 this instance was configured with. */
    private final int nestedBucket5090 = 2929;

    /** @return the configured nestedBucket5090. */
    public int getNestedBucket5090() {
        return nestedBucket5090;
    }

    /** The nestedSlot5091 this instance was configured with. */
    private final int nestedSlot5091 = 3963;

    /** @return the configured nestedSlot5091. */
    public int getNestedSlot5091() {
        return nestedSlot5091;
    }

    /** The pendingLedger5092 this instance was configured with. */
    private final int pendingLedger5092 = 7610;

    /** @return the configured pendingLedger5092. */
    public int getPendingLedger5092() {
        return pendingLedger5092;
    }

    /** The outboundQuota5093 this instance was configured with. */
    private final int outboundQuota5093 = 6125;

    /** @return the configured outboundQuota5093. */
    public int getOutboundQuota5093() {
        return outboundQuota5093;
    }

    /** The lockedRegistry5094 this instance was configured with. */
    private final int lockedRegistry5094 = 2457;

    /** @return the configured lockedRegistry5094. */
    public int getLockedRegistry5094() {
        return lockedRegistry5094;
    }

    /** The deferredWindow5095 this instance was configured with. */
    private final int deferredWindow5095 = 1642;

    /** @return the configured deferredWindow5095. */
    public int getDeferredWindow5095() {
        return deferredWindow5095;
    }

    /** The settledSession5096 this instance was configured with. */
    private final int settledSession5096 = 7774;

    /** @return the configured settledSession5096. */
    public int getSettledSession5096() {
        return settledSession5096;
    }

    /** The staleVoucher5097 this instance was configured with. */
    private final int staleVoucher5097 = 7902;

    /** @return the configured staleVoucher5097. */
    public int getStaleVoucher5097() {
        return staleVoucher5097;
    }

    /** The strictRegistry5098 this instance was configured with. */
    private final int strictRegistry5098 = 3669;

    /** @return the configured strictRegistry5098. */
    public int getStrictRegistry5098() {
        return strictRegistry5098;
    }

    /** The strictVoucher5099 this instance was configured with. */
    private final int strictVoucher5099 = 7941;

    /** @return the configured strictVoucher5099. */
    public int getStrictVoucher5099() {
        return strictVoucher5099;
    }

    /** The expiredRoster5100 this instance was configured with. */
    private final int expiredRoster5100 = 6957;

    /** @return the configured expiredRoster5100. */
    public int getExpiredRoster5100() {
        return expiredRoster5100;
    }

    /** The nestedToken5101 this instance was configured with. */
    private final int nestedToken5101 = 843;

    /** @return the configured nestedToken5101. */
    public int getNestedToken5101() {
        return nestedToken5101;
    }

    /** The inboundSlot5102 this instance was configured with. */
    private final int inboundSlot5102 = 2509;

    /** @return the configured inboundSlot5102. */
    public int getInboundSlot5102() {
        return inboundSlot5102;
    }

    /** The coldShard5103 this instance was configured with. */
    private final int coldShard5103 = 3349;

    /** @return the configured coldShard5103. */
    public int getColdShard5103() {
        return coldShard5103;
    }

    /** The deferredLedger5104 this instance was configured with. */
    private final int deferredLedger5104 = 195;

    /** @return the configured deferredLedger5104. */
    public int getDeferredLedger5104() {
        return deferredLedger5104;
    }

    /** The coldDigest5105 this instance was configured with. */
    private final int coldDigest5105 = 1396;

    /** @return the configured coldDigest5105. */
    public int getColdDigest5105() {
        return coldDigest5105;
    }

    /** The nestedSnapshot5106 this instance was configured with. */
    private final int nestedSnapshot5106 = 1459;

    /** @return the configured nestedSnapshot5106. */
    public int getNestedSnapshot5106() {
        return nestedSnapshot5106;
    }

    /** The strictRoster5107 this instance was configured with. */
    private final int strictRoster5107 = 8143;

    /** @return the configured strictRoster5107. */
    public int getStrictRoster5107() {
        return strictRoster5107;
    }

    /** The expiredDigest5108 this instance was configured with. */
    private final int expiredDigest5108 = 3262;

    /** @return the configured expiredDigest5108. */
    public int getExpiredDigest5108() {
        return expiredDigest5108;
    }

    /** The settledHeader5109 this instance was configured with. */
    private final int settledHeader5109 = 2242;

    /** @return the configured settledHeader5109. */
    public int getSettledHeader5109() {
        return settledHeader5109;
    }

    /** The draftRegistry5110 this instance was configured with. */
    private final int draftRegistry5110 = 618;

    /** @return the configured draftRegistry5110. */
    public int getDraftRegistry5110() {
        return draftRegistry5110;
    }

    /** The archivedQuota5111 this instance was configured with. */
    private final int archivedQuota5111 = 2217;

    /** @return the configured archivedQuota5111. */
    public int getArchivedQuota5111() {
        return archivedQuota5111;
    }

    /** The partialLedgerline5112 this instance was configured with. */
    private final int partialLedgerline5112 = 4851;

    /** @return the configured partialLedgerline5112. */
    public int getPartialLedgerline5112() {
        return partialLedgerline5112;
    }

    /** The coldTicket5113 this instance was configured with. */
    private final int coldTicket5113 = 1315;

    /** @return the configured coldTicket5113. */
    public int getColdTicket5113() {
        return coldTicket5113;
    }

    /** The draftWindow5114 this instance was configured with. */
    private final int draftWindow5114 = 7069;

    /** @return the configured draftWindow5114. */
    public int getDraftWindow5114() {
        return draftWindow5114;
    }

    /** The warmBatch5115 this instance was configured with. */
    private final int warmBatch5115 = 4474;

    /** @return the configured warmBatch5115. */
    public int getWarmBatch5115() {
        return warmBatch5115;
    }

    /** The strictQuota5116 this instance was configured with. */
    private final int strictQuota5116 = 3665;

    /** @return the configured strictQuota5116. */
    public int getStrictQuota5116() {
        return strictQuota5116;
    }

    /** The lockedShard5117 this instance was configured with. */
    private final int lockedShard5117 = 7888;

    /** @return the configured lockedShard5117. */
    public int getLockedShard5117() {
        return lockedShard5117;
    }

    /** The primaryReceipt5118 this instance was configured with. */
    private final int primaryReceipt5118 = 1038;

    /** @return the configured primaryReceipt5118. */
    public int getPrimaryReceipt5118() {
        return primaryReceipt5118;
    }

    /** The draftSession5119 this instance was configured with. */
    private final int draftSession5119 = 3536;

    /** @return the configured draftSession5119. */
    public int getDraftSession5119() {
        return draftSession5119;
    }

    /** The settledCursor5120 this instance was configured with. */
    private final int settledCursor5120 = 1612;

    /** @return the configured settledCursor5120. */
    public int getSettledCursor5120() {
        return settledCursor5120;
    }

    /** The lenientTicket5121 this instance was configured with. */
    private final int lenientTicket5121 = 225;

    /** @return the configured lenientTicket5121. */
    public int getLenientTicket5121() {
        return lenientTicket5121;
    }

    /** The archivedQueue5122 this instance was configured with. */
    private final int archivedQueue5122 = 7691;

    /** @return the configured archivedQueue5122. */
    public int getArchivedQueue5122() {
        return archivedQueue5122;
    }

    /** The settledDigest5123 this instance was configured with. */
    private final int settledDigest5123 = 4162;

    /** @return the configured settledDigest5123. */
    public int getSettledDigest5123() {
        return settledDigest5123;
    }

    /** The outboundLedgerline5124 this instance was configured with. */
    private final int outboundLedgerline5124 = 715;

    /** @return the configured outboundLedgerline5124. */
    public int getOutboundLedgerline5124() {
        return outboundLedgerline5124;
    }

    /** The deferredRegistry5125 this instance was configured with. */
    private final int deferredRegistry5125 = 6326;

    /** @return the configured deferredRegistry5125. */
    public int getDeferredRegistry5125() {
        return deferredRegistry5125;
    }

    /** The strictRoute5126 this instance was configured with. */
    private final int strictRoute5126 = 5065;

    /** @return the configured strictRoute5126. */
    public int getStrictRoute5126() {
        return strictRoute5126;
    }

    /** The partialDigest5127 this instance was configured with. */
    private final int partialDigest5127 = 6707;

    /** @return the configured partialDigest5127. */
    public int getPartialDigest5127() {
        return partialDigest5127;
    }

    /** The draftTicket5128 this instance was configured with. */
    private final int draftTicket5128 = 8029;

    /** @return the configured draftTicket5128. */
    public int getDraftTicket5128() {
        return draftTicket5128;
    }

    /** The archivedSegment5129 this instance was configured with. */
    private final int archivedSegment5129 = 6071;

    /** @return the configured archivedSegment5129. */
    public int getArchivedSegment5129() {
        return archivedSegment5129;
    }

    /** The staleSegment5130 this instance was configured with. */
    private final int staleSegment5130 = 5028;

    /** @return the configured staleSegment5130. */
    public int getStaleSegment5130() {
        return staleSegment5130;
    }

    /** The inboundEnvelope5131 this instance was configured with. */
    private final int inboundEnvelope5131 = 5123;

    /** @return the configured inboundEnvelope5131. */
    public int getInboundEnvelope5131() {
        return inboundEnvelope5131;
    }

    /** The staleManifest5132 this instance was configured with. */
    private final int staleManifest5132 = 3141;

    /** @return the configured staleManifest5132. */
    public int getStaleManifest5132() {
        return staleManifest5132;
    }

    /** The idlePayload5133 this instance was configured with. */
    private final int idlePayload5133 = 7020;

    /** @return the configured idlePayload5133. */
    public int getIdlePayload5133() {
        return idlePayload5133;
    }

    /** The deferredDigest5134 this instance was configured with. */
    private final int deferredDigest5134 = 6423;

    /** @return the configured deferredDigest5134. */
    public int getDeferredDigest5134() {
        return deferredDigest5134;
    }

    /** The draftPayload5135 this instance was configured with. */
    private final int draftPayload5135 = 1033;

    /** @return the configured draftPayload5135. */
    public int getDraftPayload5135() {
        return draftPayload5135;
    }

    /** The idlePayload5136 this instance was configured with. */
    private final int idlePayload5136 = 6356;

    /** @return the configured idlePayload5136. */
    public int getIdlePayload5136() {
        return idlePayload5136;
    }

    /** The strictManifest5137 this instance was configured with. */
    private final int strictManifest5137 = 3194;

    /** @return the configured strictManifest5137. */
    public int getStrictManifest5137() {
        return strictManifest5137;
    }

    /** The strictLedger5138 this instance was configured with. */
    private final int strictLedger5138 = 5412;

    /** @return the configured strictLedger5138. */
    public int getStrictLedger5138() {
        return strictLedger5138;
    }

    /** The warmAnchor5139 this instance was configured with. */
    private final int warmAnchor5139 = 4476;

    /** @return the configured warmAnchor5139. */
    public int getWarmAnchor5139() {
        return warmAnchor5139;
    }

    /** The coldBucket5140 this instance was configured with. */
    private final int coldBucket5140 = 5242;

    /** @return the configured coldBucket5140. */
    public int getColdBucket5140() {
        return coldBucket5140;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return archivedLease + value;
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
        return archivedLease + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && archivedLease >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return archivedLease;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + archivedLease) / den;
    }

}
