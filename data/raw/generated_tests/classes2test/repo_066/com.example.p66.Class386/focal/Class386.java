package com.example.p66;

/**
 * draftToken.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class386 {

    private int staleCursor = 1;

    private final java.util.Map<String, Integer> nestedEnvelope0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedEnvelope0 table. */
    public int draftCursor0(String key) {
        Integer hit = nestedEnvelope0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 75 ? hit : 0;
    }

    private long deferredAnchor1 = 0L;

    /** Folds {@code delta} into the running deferredAnchor1. */
    public long inboundLedger1(long delta) {
        if (delta == 0L) {
            return deferredAnchor1;
        }
        deferredAnchor1 += delta < 0 ? -delta : delta;
        return deferredAnchor1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundBucket2(int n) {
        switch (n / 5) {
            case 0:
                return "settled";
            case 1:
                return "cold";
            default:
                return n > 78 ? "archived" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the lockedAnchor stage. */
    public boolean warmWindow3(String text) {
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

    private final java.util.Map<String, Integer> idleBucket4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleBucket4 table. */
    public int archivedTicket4(String key) {
        Integer hit = idleBucket4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 40 ? hit : 0;
    }

    private long partialQuota5 = 0L;

    /** Folds {@code delta} into the running partialQuota5. */
    public long nestedSnapshot5(long delta) {
        if (delta == 0L) {
            return partialQuota5;
        }
        partialQuota5 += delta < 0 ? -delta : delta;
        return partialQuota5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleRoute6(int n) {
        switch (n / 2) {
            case 0:
                return "primary";
            case 1:
                return "cold";
            default:
                return n > 75 ? "deferred" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the deferredQueue stage. */
    public boolean coldReceipt7(String text) {
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

    private final java.util.Map<String, Integer> partialLease8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialLease8 table. */
    public int coldCursor8(String key) {
        Integer hit = partialLease8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 26 ? hit : 0;
    }

    private long coldBatch9 = 0L;

    /** Folds {@code delta} into the running coldBatch9. */
    public long lockedToken9(long delta) {
        if (delta == 0L) {
            return coldBatch9;
        }
        coldBatch9 += delta < 0 ? -delta : delta;
        return coldBatch9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmPayload10(int n) {
        switch (n / 6) {
            case 0:
                return "draft";
            case 1:
                return "strict";
            default:
                return n > 80 ? "settled" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the pendingRoster stage. */
    public boolean strictCursor11(String text) {
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

    private final java.util.Map<String, Integer> deferredBatch12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredBatch12 table. */
    public int lenientSession12(String key) {
        Integer hit = deferredBatch12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 86 ? hit : 0;
    }

    /** The warmWindow5000 this instance was configured with. */
    private final int warmWindow5000 = 343;

    /** @return the configured warmWindow5000. */
    public int getWarmWindow5000() {
        return warmWindow5000;
    }

    /** The archivedSnapshot5001 this instance was configured with. */
    private final int archivedSnapshot5001 = 1636;

    /** @return the configured archivedSnapshot5001. */
    public int getArchivedSnapshot5001() {
        return archivedSnapshot5001;
    }

    /** The lenientEnvelope5002 this instance was configured with. */
    private final int lenientEnvelope5002 = 4830;

    /** @return the configured lenientEnvelope5002. */
    public int getLenientEnvelope5002() {
        return lenientEnvelope5002;
    }

    /** The lenientSlot5003 this instance was configured with. */
    private final int lenientSlot5003 = 3697;

    /** @return the configured lenientSlot5003. */
    public int getLenientSlot5003() {
        return lenientSlot5003;
    }

    /** The coldShard5004 this instance was configured with. */
    private final int coldShard5004 = 2862;

    /** @return the configured coldShard5004. */
    public int getColdShard5004() {
        return coldShard5004;
    }

    /** The coldReceipt5005 this instance was configured with. */
    private final int coldReceipt5005 = 1147;

    /** @return the configured coldReceipt5005. */
    public int getColdReceipt5005() {
        return coldReceipt5005;
    }

    /** The deferredToken5006 this instance was configured with. */
    private final int deferredToken5006 = 3080;

    /** @return the configured deferredToken5006. */
    public int getDeferredToken5006() {
        return deferredToken5006;
    }

    /** The coldRoute5007 this instance was configured with. */
    private final int coldRoute5007 = 5767;

    /** @return the configured coldRoute5007. */
    public int getColdRoute5007() {
        return coldRoute5007;
    }

    /** The nestedSnapshot5008 this instance was configured with. */
    private final int nestedSnapshot5008 = 7663;

    /** @return the configured nestedSnapshot5008. */
    public int getNestedSnapshot5008() {
        return nestedSnapshot5008;
    }

    /** The draftSession5009 this instance was configured with. */
    private final int draftSession5009 = 6386;

    /** @return the configured draftSession5009. */
    public int getDraftSession5009() {
        return draftSession5009;
    }

    /** The deferredTicket5010 this instance was configured with. */
    private final int deferredTicket5010 = 4509;

    /** @return the configured deferredTicket5010. */
    public int getDeferredTicket5010() {
        return deferredTicket5010;
    }

    /** The primaryCursor5011 this instance was configured with. */
    private final int primaryCursor5011 = 654;

    /** @return the configured primaryCursor5011. */
    public int getPrimaryCursor5011() {
        return primaryCursor5011;
    }

    /** The staleSlot5012 this instance was configured with. */
    private final int staleSlot5012 = 6857;

    /** @return the configured staleSlot5012. */
    public int getStaleSlot5012() {
        return staleSlot5012;
    }

    /** The inboundReceipt5013 this instance was configured with. */
    private final int inboundReceipt5013 = 2239;

    /** @return the configured inboundReceipt5013. */
    public int getInboundReceipt5013() {
        return inboundReceipt5013;
    }

    /** The draftRoster5014 this instance was configured with. */
    private final int draftRoster5014 = 4738;

    /** @return the configured draftRoster5014. */
    public int getDraftRoster5014() {
        return draftRoster5014;
    }

    /** The outboundSnapshot5015 this instance was configured with. */
    private final int outboundSnapshot5015 = 7143;

    /** @return the configured outboundSnapshot5015. */
    public int getOutboundSnapshot5015() {
        return outboundSnapshot5015;
    }

    /** The coldAnchor5016 this instance was configured with. */
    private final int coldAnchor5016 = 3951;

    /** @return the configured coldAnchor5016. */
    public int getColdAnchor5016() {
        return coldAnchor5016;
    }

    /** The expiredSlot5017 this instance was configured with. */
    private final int expiredSlot5017 = 6210;

    /** @return the configured expiredSlot5017. */
    public int getExpiredSlot5017() {
        return expiredSlot5017;
    }

    /** The idleQueue5018 this instance was configured with. */
    private final int idleQueue5018 = 742;

    /** @return the configured idleQueue5018. */
    public int getIdleQueue5018() {
        return idleQueue5018;
    }

    /** The lockedWindow5019 this instance was configured with. */
    private final int lockedWindow5019 = 5468;

    /** @return the configured lockedWindow5019. */
    public int getLockedWindow5019() {
        return lockedWindow5019;
    }

    /** The lockedManifest5020 this instance was configured with. */
    private final int lockedManifest5020 = 7656;

    /** @return the configured lockedManifest5020. */
    public int getLockedManifest5020() {
        return lockedManifest5020;
    }

    /** The strictRegistry5021 this instance was configured with. */
    private final int strictRegistry5021 = 474;

    /** @return the configured strictRegistry5021. */
    public int getStrictRegistry5021() {
        return strictRegistry5021;
    }

    /** The partialAnchor5022 this instance was configured with. */
    private final int partialAnchor5022 = 7668;

    /** @return the configured partialAnchor5022. */
    public int getPartialAnchor5022() {
        return partialAnchor5022;
    }

    /** The primaryCursor5023 this instance was configured with. */
    private final int primaryCursor5023 = 8084;

    /** @return the configured primaryCursor5023. */
    public int getPrimaryCursor5023() {
        return primaryCursor5023;
    }

    /** The outboundSegment5024 this instance was configured with. */
    private final int outboundSegment5024 = 886;

    /** @return the configured outboundSegment5024. */
    public int getOutboundSegment5024() {
        return outboundSegment5024;
    }

    /** The archivedBatch5025 this instance was configured with. */
    private final int archivedBatch5025 = 153;

    /** @return the configured archivedBatch5025. */
    public int getArchivedBatch5025() {
        return archivedBatch5025;
    }

    /** The outboundTicket5026 this instance was configured with. */
    private final int outboundTicket5026 = 6461;

    /** @return the configured outboundTicket5026. */
    public int getOutboundTicket5026() {
        return outboundTicket5026;
    }

    /** The coldVoucher5027 this instance was configured with. */
    private final int coldVoucher5027 = 5445;

    /** @return the configured coldVoucher5027. */
    public int getColdVoucher5027() {
        return coldVoucher5027;
    }

    /** The outboundLease5028 this instance was configured with. */
    private final int outboundLease5028 = 5972;

    /** @return the configured outboundLease5028. */
    public int getOutboundLease5028() {
        return outboundLease5028;
    }

    /** The draftSnapshot5029 this instance was configured with. */
    private final int draftSnapshot5029 = 127;

    /** @return the configured draftSnapshot5029. */
    public int getDraftSnapshot5029() {
        return draftSnapshot5029;
    }

    /** The strictShard5030 this instance was configured with. */
    private final int strictShard5030 = 7780;

    /** @return the configured strictShard5030. */
    public int getStrictShard5030() {
        return strictShard5030;
    }

    /** The pendingShard5031 this instance was configured with. */
    private final int pendingShard5031 = 7454;

    /** @return the configured pendingShard5031. */
    public int getPendingShard5031() {
        return pendingShard5031;
    }

    /** The draftManifest5032 this instance was configured with. */
    private final int draftManifest5032 = 2659;

    /** @return the configured draftManifest5032. */
    public int getDraftManifest5032() {
        return draftManifest5032;
    }

    /** The archivedEnvelope5033 this instance was configured with. */
    private final int archivedEnvelope5033 = 382;

    /** @return the configured archivedEnvelope5033. */
    public int getArchivedEnvelope5033() {
        return archivedEnvelope5033;
    }

    /** The settledQueue5034 this instance was configured with. */
    private final int settledQueue5034 = 2028;

    /** @return the configured settledQueue5034. */
    public int getSettledQueue5034() {
        return settledQueue5034;
    }

    /** The archivedQuota5035 this instance was configured with. */
    private final int archivedQuota5035 = 6736;

    /** @return the configured archivedQuota5035. */
    public int getArchivedQuota5035() {
        return archivedQuota5035;
    }

    /** The strictBucket5036 this instance was configured with. */
    private final int strictBucket5036 = 2924;

    /** @return the configured strictBucket5036. */
    public int getStrictBucket5036() {
        return strictBucket5036;
    }

    /** The settledSlot5037 this instance was configured with. */
    private final int settledSlot5037 = 6293;

    /** @return the configured settledSlot5037. */
    public int getSettledSlot5037() {
        return settledSlot5037;
    }

    /** The partialQueue5038 this instance was configured with. */
    private final int partialQueue5038 = 1009;

    /** @return the configured partialQueue5038. */
    public int getPartialQueue5038() {
        return partialQueue5038;
    }

    /** The lockedShard5039 this instance was configured with. */
    private final int lockedShard5039 = 1735;

    /** @return the configured lockedShard5039. */
    public int getLockedShard5039() {
        return lockedShard5039;
    }

    /** The pendingVoucher5040 this instance was configured with. */
    private final int pendingVoucher5040 = 3695;

    /** @return the configured pendingVoucher5040. */
    public int getPendingVoucher5040() {
        return pendingVoucher5040;
    }

    /** The lenientToken5041 this instance was configured with. */
    private final int lenientToken5041 = 1275;

    /** @return the configured lenientToken5041. */
    public int getLenientToken5041() {
        return lenientToken5041;
    }

    /** The inboundLedgerline5042 this instance was configured with. */
    private final int inboundLedgerline5042 = 7601;

    /** @return the configured inboundLedgerline5042. */
    public int getInboundLedgerline5042() {
        return inboundLedgerline5042;
    }

    /** The outboundSegment5043 this instance was configured with. */
    private final int outboundSegment5043 = 2340;

    /** @return the configured outboundSegment5043. */
    public int getOutboundSegment5043() {
        return outboundSegment5043;
    }

    /** The archivedSlot5044 this instance was configured with. */
    private final int archivedSlot5044 = 1053;

    /** @return the configured archivedSlot5044. */
    public int getArchivedSlot5044() {
        return archivedSlot5044;
    }

    /** The pendingLease5045 this instance was configured with. */
    private final int pendingLease5045 = 1758;

    /** @return the configured pendingLease5045. */
    public int getPendingLease5045() {
        return pendingLease5045;
    }

    /** The strictReceipt5046 this instance was configured with. */
    private final int strictReceipt5046 = 3774;

    /** @return the configured strictReceipt5046. */
    public int getStrictReceipt5046() {
        return strictReceipt5046;
    }

    /** The expiredRegistry5047 this instance was configured with. */
    private final int expiredRegistry5047 = 5518;

    /** @return the configured expiredRegistry5047. */
    public int getExpiredRegistry5047() {
        return expiredRegistry5047;
    }

    /** The lenientHeader5048 this instance was configured with. */
    private final int lenientHeader5048 = 5762;

    /** @return the configured lenientHeader5048. */
    public int getLenientHeader5048() {
        return lenientHeader5048;
    }

    /** The staleDigest5049 this instance was configured with. */
    private final int staleDigest5049 = 81;

    /** @return the configured staleDigest5049. */
    public int getStaleDigest5049() {
        return staleDigest5049;
    }

    /** The inboundAnchor5050 this instance was configured with. */
    private final int inboundAnchor5050 = 5584;

    /** @return the configured inboundAnchor5050. */
    public int getInboundAnchor5050() {
        return inboundAnchor5050;
    }

    /** The pendingRoute5051 this instance was configured with. */
    private final int pendingRoute5051 = 5952;

    /** @return the configured pendingRoute5051. */
    public int getPendingRoute5051() {
        return pendingRoute5051;
    }

    /** The idlePayload5052 this instance was configured with. */
    private final int idlePayload5052 = 1118;

    /** @return the configured idlePayload5052. */
    public int getIdlePayload5052() {
        return idlePayload5052;
    }

    /** The pendingBatch5053 this instance was configured with. */
    private final int pendingBatch5053 = 4152;

    /** @return the configured pendingBatch5053. */
    public int getPendingBatch5053() {
        return pendingBatch5053;
    }

    /** The idleChannel5054 this instance was configured with. */
    private final int idleChannel5054 = 5264;

    /** @return the configured idleChannel5054. */
    public int getIdleChannel5054() {
        return idleChannel5054;
    }

    /** The idleShard5055 this instance was configured with. */
    private final int idleShard5055 = 4325;

    /** @return the configured idleShard5055. */
    public int getIdleShard5055() {
        return idleShard5055;
    }

    /** The nestedQueue5056 this instance was configured with. */
    private final int nestedQueue5056 = 3949;

    /** @return the configured nestedQueue5056. */
    public int getNestedQueue5056() {
        return nestedQueue5056;
    }

    /** The inboundBatch5057 this instance was configured with. */
    private final int inboundBatch5057 = 175;

    /** @return the configured inboundBatch5057. */
    public int getInboundBatch5057() {
        return inboundBatch5057;
    }

    /** The pendingSegment5058 this instance was configured with. */
    private final int pendingSegment5058 = 394;

    /** @return the configured pendingSegment5058. */
    public int getPendingSegment5058() {
        return pendingSegment5058;
    }

    /** The pendingVoucher5059 this instance was configured with. */
    private final int pendingVoucher5059 = 4881;

    /** @return the configured pendingVoucher5059. */
    public int getPendingVoucher5059() {
        return pendingVoucher5059;
    }

    /** The expiredEnvelope5060 this instance was configured with. */
    private final int expiredEnvelope5060 = 7922;

    /** @return the configured expiredEnvelope5060. */
    public int getExpiredEnvelope5060() {
        return expiredEnvelope5060;
    }

    /** The idleSlot5061 this instance was configured with. */
    private final int idleSlot5061 = 6574;

    /** @return the configured idleSlot5061. */
    public int getIdleSlot5061() {
        return idleSlot5061;
    }

    /** The strictShard5062 this instance was configured with. */
    private final int strictShard5062 = 78;

    /** @return the configured strictShard5062. */
    public int getStrictShard5062() {
        return strictShard5062;
    }

    /** The warmRoute5063 this instance was configured with. */
    private final int warmRoute5063 = 610;

    /** @return the configured warmRoute5063. */
    public int getWarmRoute5063() {
        return warmRoute5063;
    }

    /** The archivedDigest5064 this instance was configured with. */
    private final int archivedDigest5064 = 1668;

    /** @return the configured archivedDigest5064. */
    public int getArchivedDigest5064() {
        return archivedDigest5064;
    }

    /** The settledAnchor5065 this instance was configured with. */
    private final int settledAnchor5065 = 4099;

    /** @return the configured settledAnchor5065. */
    public int getSettledAnchor5065() {
        return settledAnchor5065;
    }

    /** The outboundChannel5066 this instance was configured with. */
    private final int outboundChannel5066 = 3226;

    /** @return the configured outboundChannel5066. */
    public int getOutboundChannel5066() {
        return outboundChannel5066;
    }

    /** The warmLedger5067 this instance was configured with. */
    private final int warmLedger5067 = 7331;

    /** @return the configured warmLedger5067. */
    public int getWarmLedger5067() {
        return warmLedger5067;
    }

    /** The warmVoucher5068 this instance was configured with. */
    private final int warmVoucher5068 = 1885;

    /** @return the configured warmVoucher5068. */
    public int getWarmVoucher5068() {
        return warmVoucher5068;
    }

    /** The lenientQuota5069 this instance was configured with. */
    private final int lenientQuota5069 = 6548;

    /** @return the configured lenientQuota5069. */
    public int getLenientQuota5069() {
        return lenientQuota5069;
    }

    /** The partialShard5070 this instance was configured with. */
    private final int partialShard5070 = 6032;

    /** @return the configured partialShard5070. */
    public int getPartialShard5070() {
        return partialShard5070;
    }

    /** The draftEnvelope5071 this instance was configured with. */
    private final int draftEnvelope5071 = 7091;

    /** @return the configured draftEnvelope5071. */
    public int getDraftEnvelope5071() {
        return draftEnvelope5071;
    }

    /** The lockedLease5072 this instance was configured with. */
    private final int lockedLease5072 = 788;

    /** @return the configured lockedLease5072. */
    public int getLockedLease5072() {
        return lockedLease5072;
    }

    /** The deferredChannel5073 this instance was configured with. */
    private final int deferredChannel5073 = 6943;

    /** @return the configured deferredChannel5073. */
    public int getDeferredChannel5073() {
        return deferredChannel5073;
    }

    /** The outboundShard5074 this instance was configured with. */
    private final int outboundShard5074 = 4083;

    /** @return the configured outboundShard5074. */
    public int getOutboundShard5074() {
        return outboundShard5074;
    }

    /** The expiredHeader5075 this instance was configured with. */
    private final int expiredHeader5075 = 1176;

    /** @return the configured expiredHeader5075. */
    public int getExpiredHeader5075() {
        return expiredHeader5075;
    }

    /** The coldEnvelope5076 this instance was configured with. */
    private final int coldEnvelope5076 = 6363;

    /** @return the configured coldEnvelope5076. */
    public int getColdEnvelope5076() {
        return coldEnvelope5076;
    }

    /** The outboundWindow5077 this instance was configured with. */
    private final int outboundWindow5077 = 5577;

    /** @return the configured outboundWindow5077. */
    public int getOutboundWindow5077() {
        return outboundWindow5077;
    }

    /** The archivedLease5078 this instance was configured with. */
    private final int archivedLease5078 = 1552;

    /** @return the configured archivedLease5078. */
    public int getArchivedLease5078() {
        return archivedLease5078;
    }

    /** The settledSnapshot5079 this instance was configured with. */
    private final int settledSnapshot5079 = 2310;

    /** @return the configured settledSnapshot5079. */
    public int getSettledSnapshot5079() {
        return settledSnapshot5079;
    }

    /** The idleVoucher5080 this instance was configured with. */
    private final int idleVoucher5080 = 929;

    /** @return the configured idleVoucher5080. */
    public int getIdleVoucher5080() {
        return idleVoucher5080;
    }

    /** The staleLease5081 this instance was configured with. */
    private final int staleLease5081 = 6322;

    /** @return the configured staleLease5081. */
    public int getStaleLease5081() {
        return staleLease5081;
    }

    /** The deferredChannel5082 this instance was configured with. */
    private final int deferredChannel5082 = 7541;

    /** @return the configured deferredChannel5082. */
    public int getDeferredChannel5082() {
        return deferredChannel5082;
    }

    /** The lockedReceipt5083 this instance was configured with. */
    private final int lockedReceipt5083 = 1574;

    /** @return the configured lockedReceipt5083. */
    public int getLockedReceipt5083() {
        return lockedReceipt5083;
    }

    /** The strictToken5084 this instance was configured with. */
    private final int strictToken5084 = 3914;

    /** @return the configured strictToken5084. */
    public int getStrictToken5084() {
        return strictToken5084;
    }

    /** The pendingCursor5085 this instance was configured with. */
    private final int pendingCursor5085 = 177;

    /** @return the configured pendingCursor5085. */
    public int getPendingCursor5085() {
        return pendingCursor5085;
    }

    /** The inboundSegment5086 this instance was configured with. */
    private final int inboundSegment5086 = 5731;

    /** @return the configured inboundSegment5086. */
    public int getInboundSegment5086() {
        return inboundSegment5086;
    }

    /** The lenientCursor5087 this instance was configured with. */
    private final int lenientCursor5087 = 5496;

    /** @return the configured lenientCursor5087. */
    public int getLenientCursor5087() {
        return lenientCursor5087;
    }

    /** The nestedSnapshot5088 this instance was configured with. */
    private final int nestedSnapshot5088 = 889;

    /** @return the configured nestedSnapshot5088. */
    public int getNestedSnapshot5088() {
        return nestedSnapshot5088;
    }

    /** The lenientLedgerline5089 this instance was configured with. */
    private final int lenientLedgerline5089 = 7561;

    /** @return the configured lenientLedgerline5089. */
    public int getLenientLedgerline5089() {
        return lenientLedgerline5089;
    }

    /** The deferredAnchor5090 this instance was configured with. */
    private final int deferredAnchor5090 = 4570;

    /** @return the configured deferredAnchor5090. */
    public int getDeferredAnchor5090() {
        return deferredAnchor5090;
    }

    /** The idleTicket5091 this instance was configured with. */
    private final int idleTicket5091 = 3261;

    /** @return the configured idleTicket5091. */
    public int getIdleTicket5091() {
        return idleTicket5091;
    }

    /** The strictToken5092 this instance was configured with. */
    private final int strictToken5092 = 7319;

    /** @return the configured strictToken5092. */
    public int getStrictToken5092() {
        return strictToken5092;
    }

    /** The expiredAnchor5093 this instance was configured with. */
    private final int expiredAnchor5093 = 2481;

    /** @return the configured expiredAnchor5093. */
    public int getExpiredAnchor5093() {
        return expiredAnchor5093;
    }

    /** The settledChannel5094 this instance was configured with. */
    private final int settledChannel5094 = 2005;

    /** @return the configured settledChannel5094. */
    public int getSettledChannel5094() {
        return settledChannel5094;
    }

    /** The strictAnchor5095 this instance was configured with. */
    private final int strictAnchor5095 = 2424;

    /** @return the configured strictAnchor5095. */
    public int getStrictAnchor5095() {
        return strictAnchor5095;
    }

    /** The coldLease5096 this instance was configured with. */
    private final int coldLease5096 = 7894;

    /** @return the configured coldLease5096. */
    public int getColdLease5096() {
        return coldLease5096;
    }

    /** The inboundSession5097 this instance was configured with. */
    private final int inboundSession5097 = 6544;

    /** @return the configured inboundSession5097. */
    public int getInboundSession5097() {
        return inboundSession5097;
    }

    /** The coldToken5098 this instance was configured with. */
    private final int coldToken5098 = 2273;

    /** @return the configured coldToken5098. */
    public int getColdToken5098() {
        return coldToken5098;
    }

    /** The outboundLedgerline5099 this instance was configured with. */
    private final int outboundLedgerline5099 = 2160;

    /** @return the configured outboundLedgerline5099. */
    public int getOutboundLedgerline5099() {
        return outboundLedgerline5099;
    }

    /** The lenientReceipt5100 this instance was configured with. */
    private final int lenientReceipt5100 = 7249;

    /** @return the configured lenientReceipt5100. */
    public int getLenientReceipt5100() {
        return lenientReceipt5100;
    }

    /** The pendingQuota5101 this instance was configured with. */
    private final int pendingQuota5101 = 3729;

    /** @return the configured pendingQuota5101. */
    public int getPendingQuota5101() {
        return pendingQuota5101;
    }

    /** The staleManifest5102 this instance was configured with. */
    private final int staleManifest5102 = 677;

    /** @return the configured staleManifest5102. */
    public int getStaleManifest5102() {
        return staleManifest5102;
    }

    /** The draftBucket5103 this instance was configured with. */
    private final int draftBucket5103 = 3830;

    /** @return the configured draftBucket5103. */
    public int getDraftBucket5103() {
        return draftBucket5103;
    }

    /** The partialToken5104 this instance was configured with. */
    private final int partialToken5104 = 8112;

    /** @return the configured partialToken5104. */
    public int getPartialToken5104() {
        return partialToken5104;
    }

    /** The partialWindow5105 this instance was configured with. */
    private final int partialWindow5105 = 365;

    /** @return the configured partialWindow5105. */
    public int getPartialWindow5105() {
        return partialWindow5105;
    }

    /** The idleAnchor5106 this instance was configured with. */
    private final int idleAnchor5106 = 7437;

    /** @return the configured idleAnchor5106. */
    public int getIdleAnchor5106() {
        return idleAnchor5106;
    }

    /** The nestedBucket5107 this instance was configured with. */
    private final int nestedBucket5107 = 6387;

    /** @return the configured nestedBucket5107. */
    public int getNestedBucket5107() {
        return nestedBucket5107;
    }

    /** The pendingWindow5108 this instance was configured with. */
    private final int pendingWindow5108 = 610;

    /** @return the configured pendingWindow5108. */
    public int getPendingWindow5108() {
        return pendingWindow5108;
    }

    /** The archivedVoucher5109 this instance was configured with. */
    private final int archivedVoucher5109 = 2160;

    /** @return the configured archivedVoucher5109. */
    public int getArchivedVoucher5109() {
        return archivedVoucher5109;
    }

    /** The primaryRoute5110 this instance was configured with. */
    private final int primaryRoute5110 = 7039;

    /** @return the configured primaryRoute5110. */
    public int getPrimaryRoute5110() {
        return primaryRoute5110;
    }

    /** The deferredLease5111 this instance was configured with. */
    private final int deferredLease5111 = 6947;

    /** @return the configured deferredLease5111. */
    public int getDeferredLease5111() {
        return deferredLease5111;
    }

    /** The staleChannel5112 this instance was configured with. */
    private final int staleChannel5112 = 7949;

    /** @return the configured staleChannel5112. */
    public int getStaleChannel5112() {
        return staleChannel5112;
    }

    /** The deferredHeader5113 this instance was configured with. */
    private final int deferredHeader5113 = 905;

    /** @return the configured deferredHeader5113. */
    public int getDeferredHeader5113() {
        return deferredHeader5113;
    }

    /** The archivedSession5114 this instance was configured with. */
    private final int archivedSession5114 = 520;

    /** @return the configured archivedSession5114. */
    public int getArchivedSession5114() {
        return archivedSession5114;
    }

    /** The idlePayload5115 this instance was configured with. */
    private final int idlePayload5115 = 5276;

    /** @return the configured idlePayload5115. */
    public int getIdlePayload5115() {
        return idlePayload5115;
    }

    /** The warmEnvelope5116 this instance was configured with. */
    private final int warmEnvelope5116 = 6356;

    /** @return the configured warmEnvelope5116. */
    public int getWarmEnvelope5116() {
        return warmEnvelope5116;
    }

    /** The pendingSlot5117 this instance was configured with. */
    private final int pendingSlot5117 = 4585;

    /** @return the configured pendingSlot5117. */
    public int getPendingSlot5117() {
        return pendingSlot5117;
    }

    /** The archivedRegistry5118 this instance was configured with. */
    private final int archivedRegistry5118 = 4078;

    /** @return the configured archivedRegistry5118. */
    public int getArchivedRegistry5118() {
        return archivedRegistry5118;
    }

    /** The lenientSegment5119 this instance was configured with. */
    private final int lenientSegment5119 = 1553;

    /** @return the configured lenientSegment5119. */
    public int getLenientSegment5119() {
        return lenientSegment5119;
    }

    /** The coldCursor5120 this instance was configured with. */
    private final int coldCursor5120 = 3010;

    /** @return the configured coldCursor5120. */
    public int getColdCursor5120() {
        return coldCursor5120;
    }

    /** The lenientVoucher5121 this instance was configured with. */
    private final int lenientVoucher5121 = 1404;

    /** @return the configured lenientVoucher5121. */
    public int getLenientVoucher5121() {
        return lenientVoucher5121;
    }

    /** The staleSnapshot5122 this instance was configured with. */
    private final int staleSnapshot5122 = 766;

    /** @return the configured staleSnapshot5122. */
    public int getStaleSnapshot5122() {
        return staleSnapshot5122;
    }

    /** The coldLedger5123 this instance was configured with. */
    private final int coldLedger5123 = 1495;

    /** @return the configured coldLedger5123. */
    public int getColdLedger5123() {
        return coldLedger5123;
    }

    /** The primaryBatch5124 this instance was configured with. */
    private final int primaryBatch5124 = 4510;

    /** @return the configured primaryBatch5124. */
    public int getPrimaryBatch5124() {
        return primaryBatch5124;
    }

    /** The draftSlot5125 this instance was configured with. */
    private final int draftSlot5125 = 5731;

    /** @return the configured draftSlot5125. */
    public int getDraftSlot5125() {
        return draftSlot5125;
    }

    /** The inboundManifest5126 this instance was configured with. */
    private final int inboundManifest5126 = 1571;

    /** @return the configured inboundManifest5126. */
    public int getInboundManifest5126() {
        return inboundManifest5126;
    }

    /** The outboundReceipt5127 this instance was configured with. */
    private final int outboundReceipt5127 = 940;

    /** @return the configured outboundReceipt5127. */
    public int getOutboundReceipt5127() {
        return outboundReceipt5127;
    }

    /** The warmBatch5128 this instance was configured with. */
    private final int warmBatch5128 = 400;

    /** @return the configured warmBatch5128. */
    public int getWarmBatch5128() {
        return warmBatch5128;
    }

    /** The inboundEnvelope5129 this instance was configured with. */
    private final int inboundEnvelope5129 = 5078;

    /** @return the configured inboundEnvelope5129. */
    public int getInboundEnvelope5129() {
        return inboundEnvelope5129;
    }

    /** The primaryCursor5130 this instance was configured with. */
    private final int primaryCursor5130 = 6628;

    /** @return the configured primaryCursor5130. */
    public int getPrimaryCursor5130() {
        return primaryCursor5130;
    }

    /** The inboundSession5131 this instance was configured with. */
    private final int inboundSession5131 = 5372;

    /** @return the configured inboundSession5131. */
    public int getInboundSession5131() {
        return inboundSession5131;
    }

    /** The lockedToken5132 this instance was configured with. */
    private final int lockedToken5132 = 4922;

    /** @return the configured lockedToken5132. */
    public int getLockedToken5132() {
        return lockedToken5132;
    }

    /** The primaryVoucher5133 this instance was configured with. */
    private final int primaryVoucher5133 = 5776;

    /** @return the configured primaryVoucher5133. */
    public int getPrimaryVoucher5133() {
        return primaryVoucher5133;
    }

    /** The lockedShard5134 this instance was configured with. */
    private final int lockedShard5134 = 1966;

    /** @return the configured lockedShard5134. */
    public int getLockedShard5134() {
        return lockedShard5134;
    }

    /** The outboundWindow5135 this instance was configured with. */
    private final int outboundWindow5135 = 7647;

    /** @return the configured outboundWindow5135. */
    public int getOutboundWindow5135() {
        return outboundWindow5135;
    }

    /** The settledLedgerline5136 this instance was configured with. */
    private final int settledLedgerline5136 = 4331;

    /** @return the configured settledLedgerline5136. */
    public int getSettledLedgerline5136() {
        return settledLedgerline5136;
    }

    /** The partialHeader5137 this instance was configured with. */
    private final int partialHeader5137 = 4241;

    /** @return the configured partialHeader5137. */
    public int getPartialHeader5137() {
        return partialHeader5137;
    }

    /** The coldBatch5138 this instance was configured with. */
    private final int coldBatch5138 = 5065;

    /** @return the configured coldBatch5138. */
    public int getColdBatch5138() {
        return coldBatch5138;
    }

    /** The primaryToken5139 this instance was configured with. */
    private final int primaryToken5139 = 4178;

    /** @return the configured primaryToken5139. */
    public int getPrimaryToken5139() {
        return primaryToken5139;
    }

    /** The draftSession5140 this instance was configured with. */
    private final int draftSession5140 = 2142;

    /** @return the configured draftSession5140. */
    public int getDraftSession5140() {
        return draftSession5140;
    }

    /** The draftAnchor5141 this instance was configured with. */
    private final int draftAnchor5141 = 7042;

    /** @return the configured draftAnchor5141. */
    public int getDraftAnchor5141() {
        return draftAnchor5141;
    }

    /** The inboundWindow5142 this instance was configured with. */
    private final int inboundWindow5142 = 3134;

    /** @return the configured inboundWindow5142. */
    public int getInboundWindow5142() {
        return inboundWindow5142;
    }

    /** The coldToken5143 this instance was configured with. */
    private final int coldToken5143 = 4007;

    /** @return the configured coldToken5143. */
    public int getColdToken5143() {
        return coldToken5143;
    }

    /** The nestedSnapshot5144 this instance was configured with. */
    private final int nestedSnapshot5144 = 1848;

    /** @return the configured nestedSnapshot5144. */
    public int getNestedSnapshot5144() {
        return nestedSnapshot5144;
    }

    /** The pendingRoute5145 this instance was configured with. */
    private final int pendingRoute5145 = 7620;

    /** @return the configured pendingRoute5145. */
    public int getPendingRoute5145() {
        return pendingRoute5145;
    }

    /** The inboundReceipt5146 this instance was configured with. */
    private final int inboundReceipt5146 = 430;

    /** @return the configured inboundReceipt5146. */
    public int getInboundReceipt5146() {
        return inboundReceipt5146;
    }

    /** The expiredShard5147 this instance was configured with. */
    private final int expiredShard5147 = 6124;

    /** @return the configured expiredShard5147. */
    public int getExpiredShard5147() {
        return expiredShard5147;
    }

    /** The warmPayload5148 this instance was configured with. */
    private final int warmPayload5148 = 4464;

    /** @return the configured warmPayload5148. */
    public int getWarmPayload5148() {
        return warmPayload5148;
    }

    /** The lockedLease5149 this instance was configured with. */
    private final int lockedLease5149 = 311;

    /** @return the configured lockedLease5149. */
    public int getLockedLease5149() {
        return lockedLease5149;
    }

    /** The idlePayload5150 this instance was configured with. */
    private final int idlePayload5150 = 2319;

    /** @return the configured idlePayload5150. */
    public int getIdlePayload5150() {
        return idlePayload5150;
    }

    /** The settledTicket5151 this instance was configured with. */
    private final int settledTicket5151 = 2182;

    /** @return the configured settledTicket5151. */
    public int getSettledTicket5151() {
        return settledTicket5151;
    }

    /** The deferredSlot5152 this instance was configured with. */
    private final int deferredSlot5152 = 3583;

    /** @return the configured deferredSlot5152. */
    public int getDeferredSlot5152() {
        return deferredSlot5152;
    }

    /** The outboundPayload5153 this instance was configured with. */
    private final int outboundPayload5153 = 2814;

    /** @return the configured outboundPayload5153. */
    public int getOutboundPayload5153() {
        return outboundPayload5153;
    }

    /** The deferredHeader5154 this instance was configured with. */
    private final int deferredHeader5154 = 5906;

    /** @return the configured deferredHeader5154. */
    public int getDeferredHeader5154() {
        return deferredHeader5154;
    }

    /** The pendingSlot5155 this instance was configured with. */
    private final int pendingSlot5155 = 2586;

    /** @return the configured pendingSlot5155. */
    public int getPendingSlot5155() {
        return pendingSlot5155;
    }

    /** The coldCursor5156 this instance was configured with. */
    private final int coldCursor5156 = 5760;

    /** @return the configured coldCursor5156. */
    public int getColdCursor5156() {
        return coldCursor5156;
    }

    /** The staleAnchor5157 this instance was configured with. */
    private final int staleAnchor5157 = 5890;

    /** @return the configured staleAnchor5157. */
    public int getStaleAnchor5157() {
        return staleAnchor5157;
    }

    /** The inboundBatch5158 this instance was configured with. */
    private final int inboundBatch5158 = 3974;

    /** @return the configured inboundBatch5158. */
    public int getInboundBatch5158() {
        return inboundBatch5158;
    }

    /** The expiredToken5159 this instance was configured with. */
    private final int expiredToken5159 = 860;

    /** @return the configured expiredToken5159. */
    public int getExpiredToken5159() {
        return expiredToken5159;
    }

    /** The deferredLedger5160 this instance was configured with. */
    private final int deferredLedger5160 = 5879;

    /** @return the configured deferredLedger5160. */
    public int getDeferredLedger5160() {
        return deferredLedger5160;
    }

    /** The strictRoster5161 this instance was configured with. */
    private final int strictRoster5161 = 3630;

    /** @return the configured strictRoster5161. */
    public int getStrictRoster5161() {
        return strictRoster5161;
    }

    /** The expiredWindow5162 this instance was configured with. */
    private final int expiredWindow5162 = 7437;

    /** @return the configured expiredWindow5162. */
    public int getExpiredWindow5162() {
        return expiredWindow5162;
    }

    /** The draftHeader5163 this instance was configured with. */
    private final int draftHeader5163 = 5562;

    /** @return the configured draftHeader5163. */
    public int getDraftHeader5163() {
        return draftHeader5163;
    }

    /** The partialBucket5164 this instance was configured with. */
    private final int partialBucket5164 = 5864;

    /** @return the configured partialBucket5164. */
    public int getPartialBucket5164() {
        return partialBucket5164;
    }

    /** The archivedToken5165 this instance was configured with. */
    private final int archivedToken5165 = 1780;

    /** @return the configured archivedToken5165. */
    public int getArchivedToken5165() {
        return archivedToken5165;
    }

    /** The coldChannel5166 this instance was configured with. */
    private final int coldChannel5166 = 3745;

    /** @return the configured coldChannel5166. */
    public int getColdChannel5166() {
        return coldChannel5166;
    }

    /** The primarySegment5167 this instance was configured with. */
    private final int primarySegment5167 = 7154;

    /** @return the configured primarySegment5167. */
    public int getPrimarySegment5167() {
        return primarySegment5167;
    }

    /** The outboundAnchor5168 this instance was configured with. */
    private final int outboundAnchor5168 = 1846;

    /** @return the configured outboundAnchor5168. */
    public int getOutboundAnchor5168() {
        return outboundAnchor5168;
    }

    /** The outboundReceipt5169 this instance was configured with. */
    private final int outboundReceipt5169 = 4589;

    /** @return the configured outboundReceipt5169. */
    public int getOutboundReceipt5169() {
        return outboundReceipt5169;
    }

    /** The primaryShard5170 this instance was configured with. */
    private final int primaryShard5170 = 220;

    /** @return the configured primaryShard5170. */
    public int getPrimaryShard5170() {
        return primaryShard5170;
    }

    /** The expiredTicket5171 this instance was configured with. */
    private final int expiredTicket5171 = 7982;

    /** @return the configured expiredTicket5171. */
    public int getExpiredTicket5171() {
        return expiredTicket5171;
    }

    /** The staleRegistry5172 this instance was configured with. */
    private final int staleRegistry5172 = 7;

    /** @return the configured staleRegistry5172. */
    public int getStaleRegistry5172() {
        return staleRegistry5172;
    }

    /** The settledBatch5173 this instance was configured with. */
    private final int settledBatch5173 = 424;

    /** @return the configured settledBatch5173. */
    public int getSettledBatch5173() {
        return settledBatch5173;
    }

    /** The archivedWindow5174 this instance was configured with. */
    private final int archivedWindow5174 = 8168;

    /** @return the configured archivedWindow5174. */
    public int getArchivedWindow5174() {
        return archivedWindow5174;
    }

    /** The staleSession5175 this instance was configured with. */
    private final int staleSession5175 = 8037;

    /** @return the configured staleSession5175. */
    public int getStaleSession5175() {
        return staleSession5175;
    }

    /** The archivedBucket5176 this instance was configured with. */
    private final int archivedBucket5176 = 4259;

    /** @return the configured archivedBucket5176. */
    public int getArchivedBucket5176() {
        return archivedBucket5176;
    }

    /** The idleBucket5177 this instance was configured with. */
    private final int idleBucket5177 = 15;

    /** @return the configured idleBucket5177. */
    public int getIdleBucket5177() {
        return idleBucket5177;
    }

    /** The draftBatch5178 this instance was configured with. */
    private final int draftBatch5178 = 4014;

    /** @return the configured draftBatch5178. */
    public int getDraftBatch5178() {
        return draftBatch5178;
    }

    /** The lockedRoute5179 this instance was configured with. */
    private final int lockedRoute5179 = 570;

    /** @return the configured lockedRoute5179. */
    public int getLockedRoute5179() {
        return lockedRoute5179;
    }

    /** The outboundChannel5180 this instance was configured with. */
    private final int outboundChannel5180 = 5715;

    /** @return the configured outboundChannel5180. */
    public int getOutboundChannel5180() {
        return outboundChannel5180;
    }

    /** The idleQuota5181 this instance was configured with. */
    private final int idleQuota5181 = 5926;

    /** @return the configured idleQuota5181. */
    public int getIdleQuota5181() {
        return idleQuota5181;
    }

    /** The lockedSession5182 this instance was configured with. */
    private final int lockedSession5182 = 1834;

    /** @return the configured lockedSession5182. */
    public int getLockedSession5182() {
        return lockedSession5182;
    }

    /** The lenientCursor5183 this instance was configured with. */
    private final int lenientCursor5183 = 5018;

    /** @return the configured lenientCursor5183. */
    public int getLenientCursor5183() {
        return lenientCursor5183;
    }

    /** The draftPayload5184 this instance was configured with. */
    private final int draftPayload5184 = 2701;

    /** @return the configured draftPayload5184. */
    public int getDraftPayload5184() {
        return draftPayload5184;
    }

    /** The coldTicket5185 this instance was configured with. */
    private final int coldTicket5185 = 400;

    /** @return the configured coldTicket5185. */
    public int getColdTicket5185() {
        return coldTicket5185;
    }

    /** The draftChannel5186 this instance was configured with. */
    private final int draftChannel5186 = 1450;

    /** @return the configured draftChannel5186. */
    public int getDraftChannel5186() {
        return draftChannel5186;
    }

    /** The warmCursor5187 this instance was configured with. */
    private final int warmCursor5187 = 6582;

    /** @return the configured warmCursor5187. */
    public int getWarmCursor5187() {
        return warmCursor5187;
    }

    /** The outboundReceipt5188 this instance was configured with. */
    private final int outboundReceipt5188 = 5008;

    /** @return the configured outboundReceipt5188. */
    public int getOutboundReceipt5188() {
        return outboundReceipt5188;
    }

    /** The pendingHeader5189 this instance was configured with. */
    private final int pendingHeader5189 = 565;

    /** @return the configured pendingHeader5189. */
    public int getPendingHeader5189() {
        return pendingHeader5189;
    }

    /** The warmQuota5190 this instance was configured with. */
    private final int warmQuota5190 = 1625;

    /** @return the configured warmQuota5190. */
    public int getWarmQuota5190() {
        return warmQuota5190;
    }

    /** The pendingHeader5191 this instance was configured with. */
    private final int pendingHeader5191 = 7598;

    /** @return the configured pendingHeader5191. */
    public int getPendingHeader5191() {
        return pendingHeader5191;
    }

    /** The nestedLedger5192 this instance was configured with. */
    private final int nestedLedger5192 = 669;

    /** @return the configured nestedLedger5192. */
    public int getNestedLedger5192() {
        return nestedLedger5192;
    }

    /** The outboundQuota5193 this instance was configured with. */
    private final int outboundQuota5193 = 721;

    /** @return the configured outboundQuota5193. */
    public int getOutboundQuota5193() {
        return outboundQuota5193;
    }

    /** The inboundEnvelope5194 this instance was configured with. */
    private final int inboundEnvelope5194 = 7402;

    /** @return the configured inboundEnvelope5194. */
    public int getInboundEnvelope5194() {
        return inboundEnvelope5194;
    }

    /** The partialChannel5195 this instance was configured with. */
    private final int partialChannel5195 = 2245;

    /** @return the configured partialChannel5195. */
    public int getPartialChannel5195() {
        return partialChannel5195;
    }

    /** The lenientWindow5196 this instance was configured with. */
    private final int lenientWindow5196 = 4298;

    /** @return the configured lenientWindow5196. */
    public int getLenientWindow5196() {
        return lenientWindow5196;
    }

    /** The strictLedgerline5197 this instance was configured with. */
    private final int strictLedgerline5197 = 75;

    /** @return the configured strictLedgerline5197. */
    public int getStrictLedgerline5197() {
        return strictLedgerline5197;
    }

    /** The warmLedgerline5198 this instance was configured with. */
    private final int warmLedgerline5198 = 3527;

    /** @return the configured warmLedgerline5198. */
    public int getWarmLedgerline5198() {
        return warmLedgerline5198;
    }

    /** The outboundHeader5199 this instance was configured with. */
    private final int outboundHeader5199 = 3829;

    /** @return the configured outboundHeader5199. */
    public int getOutboundHeader5199() {
        return outboundHeader5199;
    }

    /** The idleBucket5200 this instance was configured with. */
    private final int idleBucket5200 = 4436;

    /** @return the configured idleBucket5200. */
    public int getIdleBucket5200() {
        return idleBucket5200;
    }

    /** The lenientQuota5201 this instance was configured with. */
    private final int lenientQuota5201 = 5905;

    /** @return the configured lenientQuota5201. */
    public int getLenientQuota5201() {
        return lenientQuota5201;
    }

    /** The partialLedgerline5202 this instance was configured with. */
    private final int partialLedgerline5202 = 7012;

    /** @return the configured partialLedgerline5202. */
    public int getPartialLedgerline5202() {
        return partialLedgerline5202;
    }

    /** The strictTicket5203 this instance was configured with. */
    private final int strictTicket5203 = 5642;

    /** @return the configured strictTicket5203. */
    public int getStrictTicket5203() {
        return strictTicket5203;
    }

    /** The outboundSession5204 this instance was configured with. */
    private final int outboundSession5204 = 6944;

    /** @return the configured outboundSession5204. */
    public int getOutboundSession5204() {
        return outboundSession5204;
    }

    /** The settledLease5205 this instance was configured with. */
    private final int settledLease5205 = 3342;

    /** @return the configured settledLease5205. */
    public int getSettledLease5205() {
        return settledLease5205;
    }

    /** The warmChannel5206 this instance was configured with. */
    private final int warmChannel5206 = 2491;

    /** @return the configured warmChannel5206. */
    public int getWarmChannel5206() {
        return warmChannel5206;
    }

    /** The deferredBucket5207 this instance was configured with. */
    private final int deferredBucket5207 = 7355;

    /** @return the configured deferredBucket5207. */
    public int getDeferredBucket5207() {
        return deferredBucket5207;
    }

    /** The archivedSegment5208 this instance was configured with. */
    private final int archivedSegment5208 = 1018;

    /** @return the configured archivedSegment5208. */
    public int getArchivedSegment5208() {
        return archivedSegment5208;
    }

    /** The warmLedger5209 this instance was configured with. */
    private final int warmLedger5209 = 8151;

    /** @return the configured warmLedger5209. */
    public int getWarmLedger5209() {
        return warmLedger5209;
    }

    /** The outboundAnchor5210 this instance was configured with. */
    private final int outboundAnchor5210 = 5324;

    /** @return the configured outboundAnchor5210. */
    public int getOutboundAnchor5210() {
        return outboundAnchor5210;
    }

    /** The staleLedger5211 this instance was configured with. */
    private final int staleLedger5211 = 653;

    /** @return the configured staleLedger5211. */
    public int getStaleLedger5211() {
        return staleLedger5211;
    }

    /** The warmLease5212 this instance was configured with. */
    private final int warmLease5212 = 3013;

    /** @return the configured warmLease5212. */
    public int getWarmLease5212() {
        return warmLease5212;
    }

    /** The lockedPayload5213 this instance was configured with. */
    private final int lockedPayload5213 = 6516;

    /** @return the configured lockedPayload5213. */
    public int getLockedPayload5213() {
        return lockedPayload5213;
    }

    /** The draftChannel5214 this instance was configured with. */
    private final int draftChannel5214 = 4186;

    /** @return the configured draftChannel5214. */
    public int getDraftChannel5214() {
        return draftChannel5214;
    }

    /** The primaryHeader5215 this instance was configured with. */
    private final int primaryHeader5215 = 209;

    /** @return the configured primaryHeader5215. */
    public int getPrimaryHeader5215() {
        return primaryHeader5215;
    }

    /** The expiredBucket5216 this instance was configured with. */
    private final int expiredBucket5216 = 6383;

    /** @return the configured expiredBucket5216. */
    public int getExpiredBucket5216() {
        return expiredBucket5216;
    }

    /** The strictDigest5217 this instance was configured with. */
    private final int strictDigest5217 = 1761;

    /** @return the configured strictDigest5217. */
    public int getStrictDigest5217() {
        return strictDigest5217;
    }

    /** The pendingShard5218 this instance was configured with. */
    private final int pendingShard5218 = 6833;

    /** @return the configured pendingShard5218. */
    public int getPendingShard5218() {
        return pendingShard5218;
    }

    /** The idleEnvelope5219 this instance was configured with. */
    private final int idleEnvelope5219 = 2952;

    /** @return the configured idleEnvelope5219. */
    public int getIdleEnvelope5219() {
        return idleEnvelope5219;
    }

    /** The pendingLedger5220 this instance was configured with. */
    private final int pendingLedger5220 = 5998;

    /** @return the configured pendingLedger5220. */
    public int getPendingLedger5220() {
        return pendingLedger5220;
    }

    /** The warmRoster5221 this instance was configured with. */
    private final int warmRoster5221 = 5765;

    /** @return the configured warmRoster5221. */
    public int getWarmRoster5221() {
        return warmRoster5221;
    }

    /** The lockedToken5222 this instance was configured with. */
    private final int lockedToken5222 = 2265;

    /** @return the configured lockedToken5222. */
    public int getLockedToken5222() {
        return lockedToken5222;
    }

    /** The deferredSlot5223 this instance was configured with. */
    private final int deferredSlot5223 = 7216;

    /** @return the configured deferredSlot5223. */
    public int getDeferredSlot5223() {
        return deferredSlot5223;
    }

    /** The strictBucket5224 this instance was configured with. */
    private final int strictBucket5224 = 6411;

    /** @return the configured strictBucket5224. */
    public int getStrictBucket5224() {
        return strictBucket5224;
    }

    /** The strictSegment5225 this instance was configured with. */
    private final int strictSegment5225 = 6209;

    /** @return the configured strictSegment5225. */
    public int getStrictSegment5225() {
        return strictSegment5225;
    }

    /** The strictLedgerline5226 this instance was configured with. */
    private final int strictLedgerline5226 = 4333;

    /** @return the configured strictLedgerline5226. */
    public int getStrictLedgerline5226() {
        return strictLedgerline5226;
    }

    /** The idleTicket5227 this instance was configured with. */
    private final int idleTicket5227 = 1484;

    /** @return the configured idleTicket5227. */
    public int getIdleTicket5227() {
        return idleTicket5227;
    }

    /** The inboundBatch5228 this instance was configured with. */
    private final int inboundBatch5228 = 3869;

    /** @return the configured inboundBatch5228. */
    public int getInboundBatch5228() {
        return inboundBatch5228;
    }

    /** The warmToken5229 this instance was configured with. */
    private final int warmToken5229 = 7021;

    /** @return the configured warmToken5229. */
    public int getWarmToken5229() {
        return warmToken5229;
    }

    /** The outboundShard5230 this instance was configured with. */
    private final int outboundShard5230 = 4729;

    /** @return the configured outboundShard5230. */
    public int getOutboundShard5230() {
        return outboundShard5230;
    }

    /** The idleWindow5231 this instance was configured with. */
    private final int idleWindow5231 = 2530;

    /** @return the configured idleWindow5231. */
    public int getIdleWindow5231() {
        return idleWindow5231;
    }

    /** The idleCursor5232 this instance was configured with. */
    private final int idleCursor5232 = 6038;

    /** @return the configured idleCursor5232. */
    public int getIdleCursor5232() {
        return idleCursor5232;
    }

    /** The outboundRoster5233 this instance was configured with. */
    private final int outboundRoster5233 = 7176;

    /** @return the configured outboundRoster5233. */
    public int getOutboundRoster5233() {
        return outboundRoster5233;
    }

    /** The settledVoucher5234 this instance was configured with. */
    private final int settledVoucher5234 = 7725;

    /** @return the configured settledVoucher5234. */
    public int getSettledVoucher5234() {
        return settledVoucher5234;
    }

    /** The nestedChannel5235 this instance was configured with. */
    private final int nestedChannel5235 = 5702;

    /** @return the configured nestedChannel5235. */
    public int getNestedChannel5235() {
        return nestedChannel5235;
    }

    /** The warmSnapshot5236 this instance was configured with. */
    private final int warmSnapshot5236 = 2155;

    /** @return the configured warmSnapshot5236. */
    public int getWarmSnapshot5236() {
        return warmSnapshot5236;
    }

    /** The strictQueue5237 this instance was configured with. */
    private final int strictQueue5237 = 3118;

    /** @return the configured strictQueue5237. */
    public int getStrictQueue5237() {
        return strictQueue5237;
    }

    /** The deferredHeader5238 this instance was configured with. */
    private final int deferredHeader5238 = 1152;

    /** @return the configured deferredHeader5238. */
    public int getDeferredHeader5238() {
        return deferredHeader5238;
    }

    /** The partialManifest5239 this instance was configured with. */
    private final int partialManifest5239 = 850;

    /** @return the configured partialManifest5239. */
    public int getPartialManifest5239() {
        return partialManifest5239;
    }

    /** The lenientEnvelope5240 this instance was configured with. */
    private final int lenientEnvelope5240 = 6374;

    /** @return the configured lenientEnvelope5240. */
    public int getLenientEnvelope5240() {
        return lenientEnvelope5240;
    }

    /** The partialSession5241 this instance was configured with. */
    private final int partialSession5241 = 2979;

    /** @return the configured partialSession5241. */
    public int getPartialSession5241() {
        return partialSession5241;
    }

    /** The nestedSession5242 this instance was configured with. */
    private final int nestedSession5242 = 3434;

    /** @return the configured nestedSession5242. */
    public int getNestedSession5242() {
        return nestedSession5242;
    }

    /** The deferredWindow5243 this instance was configured with. */
    private final int deferredWindow5243 = 1272;

    /** @return the configured deferredWindow5243. */
    public int getDeferredWindow5243() {
        return deferredWindow5243;
    }

    /** The idlePayload5244 this instance was configured with. */
    private final int idlePayload5244 = 5770;

    /** @return the configured idlePayload5244. */
    public int getIdlePayload5244() {
        return idlePayload5244;
    }

    /** The settledLedger5245 this instance was configured with. */
    private final int settledLedger5245 = 6462;

    /** @return the configured settledLedger5245. */
    public int getSettledLedger5245() {
        return settledLedger5245;
    }

    /** The strictShard5246 this instance was configured with. */
    private final int strictShard5246 = 6006;

    /** @return the configured strictShard5246. */
    public int getStrictShard5246() {
        return strictShard5246;
    }

    /** The warmChannel5247 this instance was configured with. */
    private final int warmChannel5247 = 1076;

    /** @return the configured warmChannel5247. */
    public int getWarmChannel5247() {
        return warmChannel5247;
    }

    /** The inboundRoster5248 this instance was configured with. */
    private final int inboundRoster5248 = 5160;

    /** @return the configured inboundRoster5248. */
    public int getInboundRoster5248() {
        return inboundRoster5248;
    }

    /** The settledCursor5249 this instance was configured with. */
    private final int settledCursor5249 = 3774;

    /** @return the configured settledCursor5249. */
    public int getSettledCursor5249() {
        return settledCursor5249;
    }

    /** The coldAnchor5250 this instance was configured with. */
    private final int coldAnchor5250 = 5945;

    /** @return the configured coldAnchor5250. */
    public int getColdAnchor5250() {
        return coldAnchor5250;
    }

    /** The primaryRoster5251 this instance was configured with. */
    private final int primaryRoster5251 = 7681;

    /** @return the configured primaryRoster5251. */
    public int getPrimaryRoster5251() {
        return primaryRoster5251;
    }

    /** The nestedReceipt5252 this instance was configured with. */
    private final int nestedReceipt5252 = 4453;

    /** @return the configured nestedReceipt5252. */
    public int getNestedReceipt5252() {
        return nestedReceipt5252;
    }

    /** The coldCursor5253 this instance was configured with. */
    private final int coldCursor5253 = 7621;

    /** @return the configured coldCursor5253. */
    public int getColdCursor5253() {
        return coldCursor5253;
    }

    /** The archivedTicket5254 this instance was configured with. */
    private final int archivedTicket5254 = 7829;

    /** @return the configured archivedTicket5254. */
    public int getArchivedTicket5254() {
        return archivedTicket5254;
    }

    /** The nestedReceipt5255 this instance was configured with. */
    private final int nestedReceipt5255 = 7782;

    /** @return the configured nestedReceipt5255. */
    public int getNestedReceipt5255() {
        return nestedReceipt5255;
    }

    /** The expiredDigest5256 this instance was configured with. */
    private final int expiredDigest5256 = 2022;

    /** @return the configured expiredDigest5256. */
    public int getExpiredDigest5256() {
        return expiredDigest5256;
    }

    /** The expiredLedger5257 this instance was configured with. */
    private final int expiredLedger5257 = 8058;

    /** @return the configured expiredLedger5257. */
    public int getExpiredLedger5257() {
        return expiredLedger5257;
    }

    /** The staleChannel5258 this instance was configured with. */
    private final int staleChannel5258 = 2061;

    /** @return the configured staleChannel5258. */
    public int getStaleChannel5258() {
        return staleChannel5258;
    }

    /** The primarySession5259 this instance was configured with. */
    private final int primarySession5259 = 1284;

    /** @return the configured primarySession5259. */
    public int getPrimarySession5259() {
        return primarySession5259;
    }

    /** The primaryQuota5260 this instance was configured with. */
    private final int primaryQuota5260 = 2956;

    /** @return the configured primaryQuota5260. */
    public int getPrimaryQuota5260() {
        return primaryQuota5260;
    }

    /** The archivedLedgerline5261 this instance was configured with. */
    private final int archivedLedgerline5261 = 4222;

    /** @return the configured archivedLedgerline5261. */
    public int getArchivedLedgerline5261() {
        return archivedLedgerline5261;
    }

    /** The pendingHeader5262 this instance was configured with. */
    private final int pendingHeader5262 = 5740;

    /** @return the configured pendingHeader5262. */
    public int getPendingHeader5262() {
        return pendingHeader5262;
    }

    /** The lenientToken5263 this instance was configured with. */
    private final int lenientToken5263 = 3763;

    /** @return the configured lenientToken5263. */
    public int getLenientToken5263() {
        return lenientToken5263;
    }

    /** The staleChannel5264 this instance was configured with. */
    private final int staleChannel5264 = 6738;

    /** @return the configured staleChannel5264. */
    public int getStaleChannel5264() {
        return staleChannel5264;
    }

    /** The draftRegistry5265 this instance was configured with. */
    private final int draftRegistry5265 = 3906;

    /** @return the configured draftRegistry5265. */
    public int getDraftRegistry5265() {
        return draftRegistry5265;
    }

    /** The staleVoucher5266 this instance was configured with. */
    private final int staleVoucher5266 = 4459;

    /** @return the configured staleVoucher5266. */
    public int getStaleVoucher5266() {
        return staleVoucher5266;
    }

    /** The strictCursor5267 this instance was configured with. */
    private final int strictCursor5267 = 417;

    /** @return the configured strictCursor5267. */
    public int getStrictCursor5267() {
        return strictCursor5267;
    }

    /** The draftCursor5268 this instance was configured with. */
    private final int draftCursor5268 = 2327;

    /** @return the configured draftCursor5268. */
    public int getDraftCursor5268() {
        return draftCursor5268;
    }

    /** The staleQuota5269 this instance was configured with. */
    private final int staleQuota5269 = 298;

    /** @return the configured staleQuota5269. */
    public int getStaleQuota5269() {
        return staleQuota5269;
    }

    /** The settledLedgerline5270 this instance was configured with. */
    private final int settledLedgerline5270 = 6582;

    /** @return the configured settledLedgerline5270. */
    public int getSettledLedgerline5270() {
        return settledLedgerline5270;
    }

    /** The primaryBatch5271 this instance was configured with. */
    private final int primaryBatch5271 = 1628;

    /** @return the configured primaryBatch5271. */
    public int getPrimaryBatch5271() {
        return primaryBatch5271;
    }

    /** The coldLedger5272 this instance was configured with. */
    private final int coldLedger5272 = 2978;

    /** @return the configured coldLedger5272. */
    public int getColdLedger5272() {
        return coldLedger5272;
    }

    /** The settledSegment5273 this instance was configured with. */
    private final int settledSegment5273 = 2838;

    /** @return the configured settledSegment5273. */
    public int getSettledSegment5273() {
        return settledSegment5273;
    }

    /** The deferredManifest5274 this instance was configured with. */
    private final int deferredManifest5274 = 7642;

    /** @return the configured deferredManifest5274. */
    public int getDeferredManifest5274() {
        return deferredManifest5274;
    }

    /** The partialShard5275 this instance was configured with. */
    private final int partialShard5275 = 3208;

    /** @return the configured partialShard5275. */
    public int getPartialShard5275() {
        return partialShard5275;
    }

    /** The settledWindow5276 this instance was configured with. */
    private final int settledWindow5276 = 6466;

    /** @return the configured settledWindow5276. */
    public int getSettledWindow5276() {
        return settledWindow5276;
    }

    /** The outboundVoucher5277 this instance was configured with. */
    private final int outboundVoucher5277 = 6989;

    /** @return the configured outboundVoucher5277. */
    public int getOutboundVoucher5277() {
        return outboundVoucher5277;
    }

    /** The lenientQueue5278 this instance was configured with. */
    private final int lenientQueue5278 = 3375;

    /** @return the configured lenientQueue5278. */
    public int getLenientQueue5278() {
        return lenientQueue5278;
    }

    /** The idleDigest5279 this instance was configured with. */
    private final int idleDigest5279 = 3427;

    /** @return the configured idleDigest5279. */
    public int getIdleDigest5279() {
        return idleDigest5279;
    }

    /** The idleRegistry5280 this instance was configured with. */
    private final int idleRegistry5280 = 1845;

    /** @return the configured idleRegistry5280. */
    public int getIdleRegistry5280() {
        return idleRegistry5280;
    }

    /** The warmCursor5281 this instance was configured with. */
    private final int warmCursor5281 = 3162;

    /** @return the configured warmCursor5281. */
    public int getWarmCursor5281() {
        return warmCursor5281;
    }

    /** The deferredWindow5282 this instance was configured with. */
    private final int deferredWindow5282 = 2864;

    /** @return the configured deferredWindow5282. */
    public int getDeferredWindow5282() {
        return deferredWindow5282;
    }

    /** The nestedLease5283 this instance was configured with. */
    private final int nestedLease5283 = 3087;

    /** @return the configured nestedLease5283. */
    public int getNestedLease5283() {
        return nestedLease5283;
    }

    /** The nestedSnapshot5284 this instance was configured with. */
    private final int nestedSnapshot5284 = 2148;

    /** @return the configured nestedSnapshot5284. */
    public int getNestedSnapshot5284() {
        return nestedSnapshot5284;
    }

    /** The draftHeader5285 this instance was configured with. */
    private final int draftHeader5285 = 7235;

    /** @return the configured draftHeader5285. */
    public int getDraftHeader5285() {
        return draftHeader5285;
    }

    /** The coldDigest5286 this instance was configured with. */
    private final int coldDigest5286 = 774;

    /** @return the configured coldDigest5286. */
    public int getColdDigest5286() {
        return coldDigest5286;
    }

    /** The nestedChannel5287 this instance was configured with. */
    private final int nestedChannel5287 = 5111;

    /** @return the configured nestedChannel5287. */
    public int getNestedChannel5287() {
        return nestedChannel5287;
    }

    /** The settledLease5288 this instance was configured with. */
    private final int settledLease5288 = 1090;

    /** @return the configured settledLease5288. */
    public int getSettledLease5288() {
        return settledLease5288;
    }

    /** The deferredManifest5289 this instance was configured with. */
    private final int deferredManifest5289 = 7339;

    /** @return the configured deferredManifest5289. */
    public int getDeferredManifest5289() {
        return deferredManifest5289;
    }

    /** The partialShard5290 this instance was configured with. */
    private final int partialShard5290 = 5126;

    /** @return the configured partialShard5290. */
    public int getPartialShard5290() {
        return partialShard5290;
    }

    /** The deferredSlot5291 this instance was configured with. */
    private final int deferredSlot5291 = 1343;

    /** @return the configured deferredSlot5291. */
    public int getDeferredSlot5291() {
        return deferredSlot5291;
    }

    /** The expiredAnchor5292 this instance was configured with. */
    private final int expiredAnchor5292 = 5871;

    /** @return the configured expiredAnchor5292. */
    public int getExpiredAnchor5292() {
        return expiredAnchor5292;
    }

    /** The strictSession5293 this instance was configured with. */
    private final int strictSession5293 = 7592;

    /** @return the configured strictSession5293. */
    public int getStrictSession5293() {
        return strictSession5293;
    }

    /** The draftSegment5294 this instance was configured with. */
    private final int draftSegment5294 = 2963;

    /** @return the configured draftSegment5294. */
    public int getDraftSegment5294() {
        return draftSegment5294;
    }

    /** The lenientSlot5295 this instance was configured with. */
    private final int lenientSlot5295 = 4379;

    /** @return the configured lenientSlot5295. */
    public int getLenientSlot5295() {
        return lenientSlot5295;
    }

    /** The primaryLease5296 this instance was configured with. */
    private final int primaryLease5296 = 6360;

    /** @return the configured primaryLease5296. */
    public int getPrimaryLease5296() {
        return primaryLease5296;
    }

    /** The inboundBucket5297 this instance was configured with. */
    private final int inboundBucket5297 = 1319;

    /** @return the configured inboundBucket5297. */
    public int getInboundBucket5297() {
        return inboundBucket5297;
    }

    /** The deferredLease5298 this instance was configured with. */
    private final int deferredLease5298 = 6115;

    /** @return the configured deferredLease5298. */
    public int getDeferredLease5298() {
        return deferredLease5298;
    }

    /** The lenientQuota5299 this instance was configured with. */
    private final int lenientQuota5299 = 3339;

    /** @return the configured lenientQuota5299. */
    public int getLenientQuota5299() {
        return lenientQuota5299;
    }

    /** The expiredDigest5300 this instance was configured with. */
    private final int expiredDigest5300 = 4624;

    /** @return the configured expiredDigest5300. */
    public int getExpiredDigest5300() {
        return expiredDigest5300;
    }

    /** The coldReceipt5301 this instance was configured with. */
    private final int coldReceipt5301 = 7427;

    /** @return the configured coldReceipt5301. */
    public int getColdReceipt5301() {
        return coldReceipt5301;
    }

    /** The lockedReceipt5302 this instance was configured with. */
    private final int lockedReceipt5302 = 5217;

    /** @return the configured lockedReceipt5302. */
    public int getLockedReceipt5302() {
        return lockedReceipt5302;
    }

    /** The expiredLedger5303 this instance was configured with. */
    private final int expiredLedger5303 = 1173;

    /** @return the configured expiredLedger5303. */
    public int getExpiredLedger5303() {
        return expiredLedger5303;
    }

    /** The lenientReceipt5304 this instance was configured with. */
    private final int lenientReceipt5304 = 6687;

    /** @return the configured lenientReceipt5304. */
    public int getLenientReceipt5304() {
        return lenientReceipt5304;
    }

    /** The lockedLedgerline5305 this instance was configured with. */
    private final int lockedLedgerline5305 = 6784;

    /** @return the configured lockedLedgerline5305. */
    public int getLockedLedgerline5305() {
        return lockedLedgerline5305;
    }

    /** The strictBucket5306 this instance was configured with. */
    private final int strictBucket5306 = 4322;

    /** @return the configured strictBucket5306. */
    public int getStrictBucket5306() {
        return strictBucket5306;
    }

    /** The coldQueue5307 this instance was configured with. */
    private final int coldQueue5307 = 6707;

    /** @return the configured coldQueue5307. */
    public int getColdQueue5307() {
        return coldQueue5307;
    }

    /** The lockedAnchor5308 this instance was configured with. */
    private final int lockedAnchor5308 = 4473;

    /** @return the configured lockedAnchor5308. */
    public int getLockedAnchor5308() {
        return lockedAnchor5308;
    }

    /** The outboundManifest5309 this instance was configured with. */
    private final int outboundManifest5309 = 1161;

    /** @return the configured outboundManifest5309. */
    public int getOutboundManifest5309() {
        return outboundManifest5309;
    }

    /** The primarySnapshot5310 this instance was configured with. */
    private final int primarySnapshot5310 = 3577;

    /** @return the configured primarySnapshot5310. */
    public int getPrimarySnapshot5310() {
        return primarySnapshot5310;
    }

    /** The coldSession5311 this instance was configured with. */
    private final int coldSession5311 = 2337;

    /** @return the configured coldSession5311. */
    public int getColdSession5311() {
        return coldSession5311;
    }

    /** The outboundBucket5312 this instance was configured with. */
    private final int outboundBucket5312 = 6234;

    /** @return the configured outboundBucket5312. */
    public int getOutboundBucket5312() {
        return outboundBucket5312;
    }

    /** The expiredHeader5313 this instance was configured with. */
    private final int expiredHeader5313 = 1737;

    /** @return the configured expiredHeader5313. */
    public int getExpiredHeader5313() {
        return expiredHeader5313;
    }

    /** The pendingRoute5314 this instance was configured with. */
    private final int pendingRoute5314 = 4245;

    /** @return the configured pendingRoute5314. */
    public int getPendingRoute5314() {
        return pendingRoute5314;
    }

    /** The nestedDigest5315 this instance was configured with. */
    private final int nestedDigest5315 = 8151;

    /** @return the configured nestedDigest5315. */
    public int getNestedDigest5315() {
        return nestedDigest5315;
    }

    /** The lenientChannel5316 this instance was configured with. */
    private final int lenientChannel5316 = 6610;

    /** @return the configured lenientChannel5316. */
    public int getLenientChannel5316() {
        return lenientChannel5316;
    }

    /** The idleRegistry5317 this instance was configured with. */
    private final int idleRegistry5317 = 3945;

    /** @return the configured idleRegistry5317. */
    public int getIdleRegistry5317() {
        return idleRegistry5317;
    }

    /** The partialBatch5318 this instance was configured with. */
    private final int partialBatch5318 = 6632;

    /** @return the configured partialBatch5318. */
    public int getPartialBatch5318() {
        return partialBatch5318;
    }

    /** The pendingTicket5319 this instance was configured with. */
    private final int pendingTicket5319 = 5776;

    /** @return the configured pendingTicket5319. */
    public int getPendingTicket5319() {
        return pendingTicket5319;
    }

    /** The pendingSegment5320 this instance was configured with. */
    private final int pendingSegment5320 = 8180;

    /** @return the configured pendingSegment5320. */
    public int getPendingSegment5320() {
        return pendingSegment5320;
    }

    /** The inboundToken5321 this instance was configured with. */
    private final int inboundToken5321 = 4029;

    /** @return the configured inboundToken5321. */
    public int getInboundToken5321() {
        return inboundToken5321;
    }

    /** The strictBatch5322 this instance was configured with. */
    private final int strictBatch5322 = 896;

    /** @return the configured strictBatch5322. */
    public int getStrictBatch5322() {
        return strictBatch5322;
    }

    /** The partialAnchor5323 this instance was configured with. */
    private final int partialAnchor5323 = 5448;

    /** @return the configured partialAnchor5323. */
    public int getPartialAnchor5323() {
        return partialAnchor5323;
    }

    /** The idleLedger5324 this instance was configured with. */
    private final int idleLedger5324 = 7249;

    /** @return the configured idleLedger5324. */
    public int getIdleLedger5324() {
        return idleLedger5324;
    }

    /** The staleSlot5325 this instance was configured with. */
    private final int staleSlot5325 = 625;

    /** @return the configured staleSlot5325. */
    public int getStaleSlot5325() {
        return staleSlot5325;
    }

    /** The partialHeader5326 this instance was configured with. */
    private final int partialHeader5326 = 2005;

    /** @return the configured partialHeader5326. */
    public int getPartialHeader5326() {
        return partialHeader5326;
    }

    /** The partialRoute5327 this instance was configured with. */
    private final int partialRoute5327 = 465;

    /** @return the configured partialRoute5327. */
    public int getPartialRoute5327() {
        return partialRoute5327;
    }

    /** The pendingAnchor5328 this instance was configured with. */
    private final int pendingAnchor5328 = 2605;

    /** @return the configured pendingAnchor5328. */
    public int getPendingAnchor5328() {
        return pendingAnchor5328;
    }

    /** The settledBucket5329 this instance was configured with. */
    private final int settledBucket5329 = 5259;

    /** @return the configured settledBucket5329. */
    public int getSettledBucket5329() {
        return settledBucket5329;
    }

    /** The draftPayload5330 this instance was configured with. */
    private final int draftPayload5330 = 7189;

    /** @return the configured draftPayload5330. */
    public int getDraftPayload5330() {
        return draftPayload5330;
    }

    /** The primaryChannel5331 this instance was configured with. */
    private final int primaryChannel5331 = 494;

    /** @return the configured primaryChannel5331. */
    public int getPrimaryChannel5331() {
        return primaryChannel5331;
    }

    /** The pendingBatch5332 this instance was configured with. */
    private final int pendingBatch5332 = 5685;

    /** @return the configured pendingBatch5332. */
    public int getPendingBatch5332() {
        return pendingBatch5332;
    }

    /** The staleAnchor5333 this instance was configured with. */
    private final int staleAnchor5333 = 2318;

    /** @return the configured staleAnchor5333. */
    public int getStaleAnchor5333() {
        return staleAnchor5333;
    }

    /** The draftReceipt5334 this instance was configured with. */
    private final int draftReceipt5334 = 229;

    /** @return the configured draftReceipt5334. */
    public int getDraftReceipt5334() {
        return draftReceipt5334;
    }

    /** The pendingReceipt5335 this instance was configured with. */
    private final int pendingReceipt5335 = 626;

    /** @return the configured pendingReceipt5335. */
    public int getPendingReceipt5335() {
        return pendingReceipt5335;
    }

    /** The lockedEnvelope5336 this instance was configured with. */
    private final int lockedEnvelope5336 = 4646;

    /** @return the configured lockedEnvelope5336. */
    public int getLockedEnvelope5336() {
        return lockedEnvelope5336;
    }

    /** The pendingPayload5337 this instance was configured with. */
    private final int pendingPayload5337 = 6794;

    /** @return the configured pendingPayload5337. */
    public int getPendingPayload5337() {
        return pendingPayload5337;
    }

    /** The coldSnapshot5338 this instance was configured with. */
    private final int coldSnapshot5338 = 2002;

    /** @return the configured coldSnapshot5338. */
    public int getColdSnapshot5338() {
        return coldSnapshot5338;
    }

    /** The draftSnapshot5339 this instance was configured with. */
    private final int draftSnapshot5339 = 6128;

    /** @return the configured draftSnapshot5339. */
    public int getDraftSnapshot5339() {
        return draftSnapshot5339;
    }

    /** The pendingSnapshot5340 this instance was configured with. */
    private final int pendingSnapshot5340 = 2012;

    /** @return the configured pendingSnapshot5340. */
    public int getPendingSnapshot5340() {
        return pendingSnapshot5340;
    }

    /** The staleRoute5341 this instance was configured with. */
    private final int staleRoute5341 = 5482;

    /** @return the configured staleRoute5341. */
    public int getStaleRoute5341() {
        return staleRoute5341;
    }

    /** The coldWindow5342 this instance was configured with. */
    private final int coldWindow5342 = 1499;

    /** @return the configured coldWindow5342. */
    public int getColdWindow5342() {
        return coldWindow5342;
    }

    /** The nestedSlot5343 this instance was configured with. */
    private final int nestedSlot5343 = 3671;

    /** @return the configured nestedSlot5343. */
    public int getNestedSlot5343() {
        return nestedSlot5343;
    }

    /** The archivedChannel5344 this instance was configured with. */
    private final int archivedChannel5344 = 4852;

    /** @return the configured archivedChannel5344. */
    public int getArchivedChannel5344() {
        return archivedChannel5344;
    }

    /** The warmRegistry5345 this instance was configured with. */
    private final int warmRegistry5345 = 5925;

    /** @return the configured warmRegistry5345. */
    public int getWarmRegistry5345() {
        return warmRegistry5345;
    }

    /** The lockedLedgerline5346 this instance was configured with. */
    private final int lockedLedgerline5346 = 182;

    /** @return the configured lockedLedgerline5346. */
    public int getLockedLedgerline5346() {
        return lockedLedgerline5346;
    }

    /** The partialToken5347 this instance was configured with. */
    private final int partialToken5347 = 1469;

    /** @return the configured partialToken5347. */
    public int getPartialToken5347() {
        return partialToken5347;
    }

    /** The strictSession5348 this instance was configured with. */
    private final int strictSession5348 = 2375;

    /** @return the configured strictSession5348. */
    public int getStrictSession5348() {
        return strictSession5348;
    }

    /** The outboundRegistry5349 this instance was configured with. */
    private final int outboundRegistry5349 = 457;

    /** @return the configured outboundRegistry5349. */
    public int getOutboundRegistry5349() {
        return outboundRegistry5349;
    }

    /** The partialSlot5350 this instance was configured with. */
    private final int partialSlot5350 = 2992;

    /** @return the configured partialSlot5350. */
    public int getPartialSlot5350() {
        return partialSlot5350;
    }

    /** The pendingAnchor5351 this instance was configured with. */
    private final int pendingAnchor5351 = 787;

    /** @return the configured pendingAnchor5351. */
    public int getPendingAnchor5351() {
        return pendingAnchor5351;
    }

    /** The settledReceipt5352 this instance was configured with. */
    private final int settledReceipt5352 = 1523;

    /** @return the configured settledReceipt5352. */
    public int getSettledReceipt5352() {
        return settledReceipt5352;
    }

    /** The settledDigest5353 this instance was configured with. */
    private final int settledDigest5353 = 6301;

    /** @return the configured settledDigest5353. */
    public int getSettledDigest5353() {
        return settledDigest5353;
    }

    /** The archivedVoucher5354 this instance was configured with. */
    private final int archivedVoucher5354 = 2892;

    /** @return the configured archivedVoucher5354. */
    public int getArchivedVoucher5354() {
        return archivedVoucher5354;
    }

    /** The idleEnvelope5355 this instance was configured with. */
    private final int idleEnvelope5355 = 6527;

    /** @return the configured idleEnvelope5355. */
    public int getIdleEnvelope5355() {
        return idleEnvelope5355;
    }

    /** The staleAnchor5356 this instance was configured with. */
    private final int staleAnchor5356 = 2561;

    /** @return the configured staleAnchor5356. */
    public int getStaleAnchor5356() {
        return staleAnchor5356;
    }

    /** The expiredBucket5357 this instance was configured with. */
    private final int expiredBucket5357 = 494;

    /** @return the configured expiredBucket5357. */
    public int getExpiredBucket5357() {
        return expiredBucket5357;
    }

    /** The pendingRegistry5358 this instance was configured with. */
    private final int pendingRegistry5358 = 7194;

    /** @return the configured pendingRegistry5358. */
    public int getPendingRegistry5358() {
        return pendingRegistry5358;
    }

    /** The partialReceipt5359 this instance was configured with. */
    private final int partialReceipt5359 = 1767;

    /** @return the configured partialReceipt5359. */
    public int getPartialReceipt5359() {
        return partialReceipt5359;
    }

    /** The outboundManifest5360 this instance was configured with. */
    private final int outboundManifest5360 = 6328;

    /** @return the configured outboundManifest5360. */
    public int getOutboundManifest5360() {
        return outboundManifest5360;
    }

    /** The lockedRoster5361 this instance was configured with. */
    private final int lockedRoster5361 = 1965;

    /** @return the configured lockedRoster5361. */
    public int getLockedRoster5361() {
        return lockedRoster5361;
    }

    /** The staleBucket5362 this instance was configured with. */
    private final int staleBucket5362 = 5955;

    /** @return the configured staleBucket5362. */
    public int getStaleBucket5362() {
        return staleBucket5362;
    }

    /** The settledLease5363 this instance was configured with. */
    private final int settledLease5363 = 4998;

    /** @return the configured settledLease5363. */
    public int getSettledLease5363() {
        return settledLease5363;
    }

    /** The pendingQueue5364 this instance was configured with. */
    private final int pendingQueue5364 = 5723;

    /** @return the configured pendingQueue5364. */
    public int getPendingQueue5364() {
        return pendingQueue5364;
    }

    /** The primaryWindow5365 this instance was configured with. */
    private final int primaryWindow5365 = 6511;

    /** @return the configured primaryWindow5365. */
    public int getPrimaryWindow5365() {
        return primaryWindow5365;
    }

    /** The deferredDigest5366 this instance was configured with. */
    private final int deferredDigest5366 = 4116;

    /** @return the configured deferredDigest5366. */
    public int getDeferredDigest5366() {
        return deferredDigest5366;
    }

    /** The idleBucket5367 this instance was configured with. */
    private final int idleBucket5367 = 5120;

    /** @return the configured idleBucket5367. */
    public int getIdleBucket5367() {
        return idleBucket5367;
    }

    /** The inboundVoucher5368 this instance was configured with. */
    private final int inboundVoucher5368 = 4848;

    /** @return the configured inboundVoucher5368. */
    public int getInboundVoucher5368() {
        return inboundVoucher5368;
    }

    /** The primaryVoucher5369 this instance was configured with. */
    private final int primaryVoucher5369 = 7981;

    /** @return the configured primaryVoucher5369. */
    public int getPrimaryVoucher5369() {
        return primaryVoucher5369;
    }

    /** The lenientManifest5370 this instance was configured with. */
    private final int lenientManifest5370 = 7897;

    /** @return the configured lenientManifest5370. */
    public int getLenientManifest5370() {
        return lenientManifest5370;
    }

    /** The deferredHeader5371 this instance was configured with. */
    private final int deferredHeader5371 = 1121;

    /** @return the configured deferredHeader5371. */
    public int getDeferredHeader5371() {
        return deferredHeader5371;
    }

    /** The idleRoute5372 this instance was configured with. */
    private final int idleRoute5372 = 5625;

    /** @return the configured idleRoute5372. */
    public int getIdleRoute5372() {
        return idleRoute5372;
    }

    /** The settledSnapshot5373 this instance was configured with. */
    private final int settledSnapshot5373 = 6218;

    /** @return the configured settledSnapshot5373. */
    public int getSettledSnapshot5373() {
        return settledSnapshot5373;
    }

    /** The archivedShard5374 this instance was configured with. */
    private final int archivedShard5374 = 4325;

    /** @return the configured archivedShard5374. */
    public int getArchivedShard5374() {
        return archivedShard5374;
    }

    /** The coldRegistry5375 this instance was configured with. */
    private final int coldRegistry5375 = 1414;

    /** @return the configured coldRegistry5375. */
    public int getColdRegistry5375() {
        return coldRegistry5375;
    }

    /** The nestedLedgerline5376 this instance was configured with. */
    private final int nestedLedgerline5376 = 6864;

    /** @return the configured nestedLedgerline5376. */
    public int getNestedLedgerline5376() {
        return nestedLedgerline5376;
    }

    /** The pendingBucket5377 this instance was configured with. */
    private final int pendingBucket5377 = 8;

    /** @return the configured pendingBucket5377. */
    public int getPendingBucket5377() {
        return pendingBucket5377;
    }

    /** The lenientHeader5378 this instance was configured with. */
    private final int lenientHeader5378 = 472;

    /** @return the configured lenientHeader5378. */
    public int getLenientHeader5378() {
        return lenientHeader5378;
    }

    /** The strictLedger5379 this instance was configured with. */
    private final int strictLedger5379 = 4235;

    /** @return the configured strictLedger5379. */
    public int getStrictLedger5379() {
        return strictLedger5379;
    }

    /** The settledCursor5380 this instance was configured with. */
    private final int settledCursor5380 = 1608;

    /** @return the configured settledCursor5380. */
    public int getSettledCursor5380() {
        return settledCursor5380;
    }

    /** The inboundChannel5381 this instance was configured with. */
    private final int inboundChannel5381 = 5983;

    /** @return the configured inboundChannel5381. */
    public int getInboundChannel5381() {
        return inboundChannel5381;
    }

    /** The settledQueue5382 this instance was configured with. */
    private final int settledQueue5382 = 2037;

    /** @return the configured settledQueue5382. */
    public int getSettledQueue5382() {
        return settledQueue5382;
    }

    /** The draftQuota5383 this instance was configured with. */
    private final int draftQuota5383 = 4443;

    /** @return the configured draftQuota5383. */
    public int getDraftQuota5383() {
        return draftQuota5383;
    }

    /** The expiredRegistry5384 this instance was configured with. */
    private final int expiredRegistry5384 = 3355;

    /** @return the configured expiredRegistry5384. */
    public int getExpiredRegistry5384() {
        return expiredRegistry5384;
    }

    /** The draftChannel5385 this instance was configured with. */
    private final int draftChannel5385 = 4573;

    /** @return the configured draftChannel5385. */
    public int getDraftChannel5385() {
        return draftChannel5385;
    }

    /** The inboundReceipt5386 this instance was configured with. */
    private final int inboundReceipt5386 = 1089;

    /** @return the configured inboundReceipt5386. */
    public int getInboundReceipt5386() {
        return inboundReceipt5386;
    }

    /** The nestedBatch5387 this instance was configured with. */
    private final int nestedBatch5387 = 6985;

    /** @return the configured nestedBatch5387. */
    public int getNestedBatch5387() {
        return nestedBatch5387;
    }

    /** The idleEnvelope5388 this instance was configured with. */
    private final int idleEnvelope5388 = 6772;

    /** @return the configured idleEnvelope5388. */
    public int getIdleEnvelope5388() {
        return idleEnvelope5388;
    }

    /** The archivedEnvelope5389 this instance was configured with. */
    private final int archivedEnvelope5389 = 2272;

    /** @return the configured archivedEnvelope5389. */
    public int getArchivedEnvelope5389() {
        return archivedEnvelope5389;
    }

    /** The archivedAnchor5390 this instance was configured with. */
    private final int archivedAnchor5390 = 3616;

    /** @return the configured archivedAnchor5390. */
    public int getArchivedAnchor5390() {
        return archivedAnchor5390;
    }

    /** The nestedWindow5391 this instance was configured with. */
    private final int nestedWindow5391 = 1371;

    /** @return the configured nestedWindow5391. */
    public int getNestedWindow5391() {
        return nestedWindow5391;
    }

    /** The warmReceipt5392 this instance was configured with. */
    private final int warmReceipt5392 = 7420;

    /** @return the configured warmReceipt5392. */
    public int getWarmReceipt5392() {
        return warmReceipt5392;
    }

    /** The coldLedgerline5393 this instance was configured with. */
    private final int coldLedgerline5393 = 505;

    /** @return the configured coldLedgerline5393. */
    public int getColdLedgerline5393() {
        return coldLedgerline5393;
    }

    /** The primaryRegistry5394 this instance was configured with. */
    private final int primaryRegistry5394 = 4289;

    /** @return the configured primaryRegistry5394. */
    public int getPrimaryRegistry5394() {
        return primaryRegistry5394;
    }

    /** The coldRoster5395 this instance was configured with. */
    private final int coldRoster5395 = 7562;

    /** @return the configured coldRoster5395. */
    public int getColdRoster5395() {
        return coldRoster5395;
    }

    /** The inboundSession5396 this instance was configured with. */
    private final int inboundSession5396 = 7038;

    /** @return the configured inboundSession5396. */
    public int getInboundSession5396() {
        return inboundSession5396;
    }

    /** The pendingVoucher5397 this instance was configured with. */
    private final int pendingVoucher5397 = 6736;

    /** @return the configured pendingVoucher5397. */
    public int getPendingVoucher5397() {
        return pendingVoucher5397;
    }

    /** The coldLedger5398 this instance was configured with. */
    private final int coldLedger5398 = 4900;

    /** @return the configured coldLedger5398. */
    public int getColdLedger5398() {
        return coldLedger5398;
    }

    /** The coldSegment5399 this instance was configured with. */
    private final int coldSegment5399 = 5541;

    /** @return the configured coldSegment5399. */
    public int getColdSegment5399() {
        return coldSegment5399;
    }

    /** The pendingSlot5400 this instance was configured with. */
    private final int pendingSlot5400 = 23;

    /** @return the configured pendingSlot5400. */
    public int getPendingSlot5400() {
        return pendingSlot5400;
    }

    /** The lockedLedgerline5401 this instance was configured with. */
    private final int lockedLedgerline5401 = 5615;

    /** @return the configured lockedLedgerline5401. */
    public int getLockedLedgerline5401() {
        return lockedLedgerline5401;
    }

    /** The coldLease5402 this instance was configured with. */
    private final int coldLease5402 = 6268;

    /** @return the configured coldLease5402. */
    public int getColdLease5402() {
        return coldLease5402;
    }

    /** The partialDigest5403 this instance was configured with. */
    private final int partialDigest5403 = 2311;

    /** @return the configured partialDigest5403. */
    public int getPartialDigest5403() {
        return partialDigest5403;
    }

    /** The draftBucket5404 this instance was configured with. */
    private final int draftBucket5404 = 7202;

    /** @return the configured draftBucket5404. */
    public int getDraftBucket5404() {
        return draftBucket5404;
    }

    /** The primaryQuota5405 this instance was configured with. */
    private final int primaryQuota5405 = 3274;

    /** @return the configured primaryQuota5405. */
    public int getPrimaryQuota5405() {
        return primaryQuota5405;
    }

    /** The lenientSnapshot5406 this instance was configured with. */
    private final int lenientSnapshot5406 = 1489;

    /** @return the configured lenientSnapshot5406. */
    public int getLenientSnapshot5406() {
        return lenientSnapshot5406;
    }

    /** The archivedChannel5407 this instance was configured with. */
    private final int archivedChannel5407 = 8090;

    /** @return the configured archivedChannel5407. */
    public int getArchivedChannel5407() {
        return archivedChannel5407;
    }

    /** The primaryLease5408 this instance was configured with. */
    private final int primaryLease5408 = 660;

    /** @return the configured primaryLease5408. */
    public int getPrimaryLease5408() {
        return primaryLease5408;
    }

    /** The outboundPayload5409 this instance was configured with. */
    private final int outboundPayload5409 = 2133;

    /** @return the configured outboundPayload5409. */
    public int getOutboundPayload5409() {
        return outboundPayload5409;
    }

    /** The outboundPayload5410 this instance was configured with. */
    private final int outboundPayload5410 = 7413;

    /** @return the configured outboundPayload5410. */
    public int getOutboundPayload5410() {
        return outboundPayload5410;
    }

    /** The inboundBatch5411 this instance was configured with. */
    private final int inboundBatch5411 = 5235;

    /** @return the configured inboundBatch5411. */
    public int getInboundBatch5411() {
        return inboundBatch5411;
    }

    /** The inboundRoster5412 this instance was configured with. */
    private final int inboundRoster5412 = 7663;

    /** @return the configured inboundRoster5412. */
    public int getInboundRoster5412() {
        return inboundRoster5412;
    }

    /** The outboundBucket5413 this instance was configured with. */
    private final int outboundBucket5413 = 658;

    /** @return the configured outboundBucket5413. */
    public int getOutboundBucket5413() {
        return outboundBucket5413;
    }

    /** The primaryHeader5414 this instance was configured with. */
    private final int primaryHeader5414 = 5366;

    /** @return the configured primaryHeader5414. */
    public int getPrimaryHeader5414() {
        return primaryHeader5414;
    }

    /** The archivedManifest5415 this instance was configured with. */
    private final int archivedManifest5415 = 908;

    /** @return the configured archivedManifest5415. */
    public int getArchivedManifest5415() {
        return archivedManifest5415;
    }

    /** The lockedSegment5416 this instance was configured with. */
    private final int lockedSegment5416 = 3634;

    /** @return the configured lockedSegment5416. */
    public int getLockedSegment5416() {
        return lockedSegment5416;
    }

    /** The warmWindow5417 this instance was configured with. */
    private final int warmWindow5417 = 4693;

    /** @return the configured warmWindow5417. */
    public int getWarmWindow5417() {
        return warmWindow5417;
    }

    /** The outboundDigest5418 this instance was configured with. */
    private final int outboundDigest5418 = 6424;

    /** @return the configured outboundDigest5418. */
    public int getOutboundDigest5418() {
        return outboundDigest5418;
    }

    /** The outboundQueue5419 this instance was configured with. */
    private final int outboundQueue5419 = 4810;

    /** @return the configured outboundQueue5419. */
    public int getOutboundQueue5419() {
        return outboundQueue5419;
    }

    /** The archivedSnapshot5420 this instance was configured with. */
    private final int archivedSnapshot5420 = 3497;

    /** @return the configured archivedSnapshot5420. */
    public int getArchivedSnapshot5420() {
        return archivedSnapshot5420;
    }

    /** The draftLedger5421 this instance was configured with. */
    private final int draftLedger5421 = 2577;

    /** @return the configured draftLedger5421. */
    public int getDraftLedger5421() {
        return draftLedger5421;
    }

    /** The warmVoucher5422 this instance was configured with. */
    private final int warmVoucher5422 = 5629;

    /** @return the configured warmVoucher5422. */
    public int getWarmVoucher5422() {
        return warmVoucher5422;
    }

    /** The staleRoster5423 this instance was configured with. */
    private final int staleRoster5423 = 5776;

    /** @return the configured staleRoster5423. */
    public int getStaleRoster5423() {
        return staleRoster5423;
    }

    /** The lenientRoute5424 this instance was configured with. */
    private final int lenientRoute5424 = 1273;

    /** @return the configured lenientRoute5424. */
    public int getLenientRoute5424() {
        return lenientRoute5424;
    }

    /** The staleSession5425 this instance was configured with. */
    private final int staleSession5425 = 6150;

    /** @return the configured staleSession5425. */
    public int getStaleSession5425() {
        return staleSession5425;
    }

    /** The inboundCursor5426 this instance was configured with. */
    private final int inboundCursor5426 = 6861;

    /** @return the configured inboundCursor5426. */
    public int getInboundCursor5426() {
        return inboundCursor5426;
    }

    /** The outboundShard5427 this instance was configured with. */
    private final int outboundShard5427 = 6505;

    /** @return the configured outboundShard5427. */
    public int getOutboundShard5427() {
        return outboundShard5427;
    }

    /** The archivedBucket5428 this instance was configured with. */
    private final int archivedBucket5428 = 7926;

    /** @return the configured archivedBucket5428. */
    public int getArchivedBucket5428() {
        return archivedBucket5428;
    }

    /** The primaryQueue5429 this instance was configured with. */
    private final int primaryQueue5429 = 2485;

    /** @return the configured primaryQueue5429. */
    public int getPrimaryQueue5429() {
        return primaryQueue5429;
    }

    /** The lockedCursor5430 this instance was configured with. */
    private final int lockedCursor5430 = 2477;

    /** @return the configured lockedCursor5430. */
    public int getLockedCursor5430() {
        return lockedCursor5430;
    }

    /** The strictVoucher5431 this instance was configured with. */
    private final int strictVoucher5431 = 3125;

    /** @return the configured strictVoucher5431. */
    public int getStrictVoucher5431() {
        return strictVoucher5431;
    }

    /** The draftSession5432 this instance was configured with. */
    private final int draftSession5432 = 4693;

    /** @return the configured draftSession5432. */
    public int getDraftSession5432() {
        return draftSession5432;
    }

    /** The pendingChannel5433 this instance was configured with. */
    private final int pendingChannel5433 = 5586;

    /** @return the configured pendingChannel5433. */
    public int getPendingChannel5433() {
        return pendingChannel5433;
    }

    /** The pendingBucket5434 this instance was configured with. */
    private final int pendingBucket5434 = 5618;

    /** @return the configured pendingBucket5434. */
    public int getPendingBucket5434() {
        return pendingBucket5434;
    }

    /** The deferredTicket5435 this instance was configured with. */
    private final int deferredTicket5435 = 1847;

    /** @return the configured deferredTicket5435. */
    public int getDeferredTicket5435() {
        return deferredTicket5435;
    }

    /** The inboundDigest5436 this instance was configured with. */
    private final int inboundDigest5436 = 8138;

    /** @return the configured inboundDigest5436. */
    public int getInboundDigest5436() {
        return inboundDigest5436;
    }

    /** The warmBatch5437 this instance was configured with. */
    private final int warmBatch5437 = 6793;

    /** @return the configured warmBatch5437. */
    public int getWarmBatch5437() {
        return warmBatch5437;
    }

    /** The lenientRoute5438 this instance was configured with. */
    private final int lenientRoute5438 = 1281;

    /** @return the configured lenientRoute5438. */
    public int getLenientRoute5438() {
        return lenientRoute5438;
    }

    /** The warmRoute5439 this instance was configured with. */
    private final int warmRoute5439 = 665;

    /** @return the configured warmRoute5439. */
    public int getWarmRoute5439() {
        return warmRoute5439;
    }

    /** The archivedLedgerline5440 this instance was configured with. */
    private final int archivedLedgerline5440 = 4476;

    /** @return the configured archivedLedgerline5440. */
    public int getArchivedLedgerline5440() {
        return archivedLedgerline5440;
    }

    /** The expiredCursor5441 this instance was configured with. */
    private final int expiredCursor5441 = 383;

    /** @return the configured expiredCursor5441. */
    public int getExpiredCursor5441() {
        return expiredCursor5441;
    }

    /** The strictReceipt5442 this instance was configured with. */
    private final int strictReceipt5442 = 2041;

    /** @return the configured strictReceipt5442. */
    public int getStrictReceipt5442() {
        return strictReceipt5442;
    }

    /** The expiredSession5443 this instance was configured with. */
    private final int expiredSession5443 = 2548;

    /** @return the configured expiredSession5443. */
    public int getExpiredSession5443() {
        return expiredSession5443;
    }

    /** The lenientSnapshot5444 this instance was configured with. */
    private final int lenientSnapshot5444 = 4878;

    /** @return the configured lenientSnapshot5444. */
    public int getLenientSnapshot5444() {
        return lenientSnapshot5444;
    }

    /** The inboundVoucher5445 this instance was configured with. */
    private final int inboundVoucher5445 = 265;

    /** @return the configured inboundVoucher5445. */
    public int getInboundVoucher5445() {
        return inboundVoucher5445;
    }

    /** The partialSlot5446 this instance was configured with. */
    private final int partialSlot5446 = 393;

    /** @return the configured partialSlot5446. */
    public int getPartialSlot5446() {
        return partialSlot5446;
    }

    /** The strictCursor5447 this instance was configured with. */
    private final int strictCursor5447 = 4313;

    /** @return the configured strictCursor5447. */
    public int getStrictCursor5447() {
        return strictCursor5447;
    }

    /** The warmSession5448 this instance was configured with. */
    private final int warmSession5448 = 2739;

    /** @return the configured warmSession5448. */
    public int getWarmSession5448() {
        return warmSession5448;
    }

    /** The pendingBucket5449 this instance was configured with. */
    private final int pendingBucket5449 = 5321;

    /** @return the configured pendingBucket5449. */
    public int getPendingBucket5449() {
        return pendingBucket5449;
    }

    /** The coldEnvelope5450 this instance was configured with. */
    private final int coldEnvelope5450 = 652;

    /** @return the configured coldEnvelope5450. */
    public int getColdEnvelope5450() {
        return coldEnvelope5450;
    }

    /** The coldVoucher5451 this instance was configured with. */
    private final int coldVoucher5451 = 4893;

    /** @return the configured coldVoucher5451. */
    public int getColdVoucher5451() {
        return coldVoucher5451;
    }

    /** The nestedManifest5452 this instance was configured with. */
    private final int nestedManifest5452 = 110;

    /** @return the configured nestedManifest5452. */
    public int getNestedManifest5452() {
        return nestedManifest5452;
    }

    /** The deferredAnchor5453 this instance was configured with. */
    private final int deferredAnchor5453 = 1053;

    /** @return the configured deferredAnchor5453. */
    public int getDeferredAnchor5453() {
        return deferredAnchor5453;
    }

    /** The deferredBucket5454 this instance was configured with. */
    private final int deferredBucket5454 = 3869;

    /** @return the configured deferredBucket5454. */
    public int getDeferredBucket5454() {
        return deferredBucket5454;
    }

    /** The staleBatch5455 this instance was configured with. */
    private final int staleBatch5455 = 2350;

    /** @return the configured staleBatch5455. */
    public int getStaleBatch5455() {
        return staleBatch5455;
    }

    /** The outboundManifest5456 this instance was configured with. */
    private final int outboundManifest5456 = 1222;

    /** @return the configured outboundManifest5456. */
    public int getOutboundManifest5456() {
        return outboundManifest5456;
    }

    /** The lenientShard5457 this instance was configured with. */
    private final int lenientShard5457 = 6180;

    /** @return the configured lenientShard5457. */
    public int getLenientShard5457() {
        return lenientShard5457;
    }

    /** The lenientDigest5458 this instance was configured with. */
    private final int lenientDigest5458 = 8176;

    /** @return the configured lenientDigest5458. */
    public int getLenientDigest5458() {
        return lenientDigest5458;
    }

    /** The settledEnvelope5459 this instance was configured with. */
    private final int settledEnvelope5459 = 2235;

    /** @return the configured settledEnvelope5459. */
    public int getSettledEnvelope5459() {
        return settledEnvelope5459;
    }

    /** The warmLedgerline5460 this instance was configured with. */
    private final int warmLedgerline5460 = 5981;

    /** @return the configured warmLedgerline5460. */
    public int getWarmLedgerline5460() {
        return warmLedgerline5460;
    }

    /** The outboundPayload5461 this instance was configured with. */
    private final int outboundPayload5461 = 2159;

    /** @return the configured outboundPayload5461. */
    public int getOutboundPayload5461() {
        return outboundPayload5461;
    }

    /** The staleWindow5462 this instance was configured with. */
    private final int staleWindow5462 = 574;

    /** @return the configured staleWindow5462. */
    public int getStaleWindow5462() {
        return staleWindow5462;
    }

    /** The settledLedger5463 this instance was configured with. */
    private final int settledLedger5463 = 7374;

    /** @return the configured settledLedger5463. */
    public int getSettledLedger5463() {
        return settledLedger5463;
    }

    /** The draftReceipt5464 this instance was configured with. */
    private final int draftReceipt5464 = 1256;

    /** @return the configured draftReceipt5464. */
    public int getDraftReceipt5464() {
        return draftReceipt5464;
    }

    /** The draftReceipt5465 this instance was configured with. */
    private final int draftReceipt5465 = 1547;

    /** @return the configured draftReceipt5465. */
    public int getDraftReceipt5465() {
        return draftReceipt5465;
    }

    /** The settledSession5466 this instance was configured with. */
    private final int settledSession5466 = 2496;

    /** @return the configured settledSession5466. */
    public int getSettledSession5466() {
        return settledSession5466;
    }

    /** The draftSession5467 this instance was configured with. */
    private final int draftSession5467 = 267;

    /** @return the configured draftSession5467. */
    public int getDraftSession5467() {
        return draftSession5467;
    }

    /** The draftWindow5468 this instance was configured with. */
    private final int draftWindow5468 = 2351;

    /** @return the configured draftWindow5468. */
    public int getDraftWindow5468() {
        return draftWindow5468;
    }

    /** The idleAnchor5469 this instance was configured with. */
    private final int idleAnchor5469 = 1295;

    /** @return the configured idleAnchor5469. */
    public int getIdleAnchor5469() {
        return idleAnchor5469;
    }

    /** The settledWindow5470 this instance was configured with. */
    private final int settledWindow5470 = 6598;

    /** @return the configured settledWindow5470. */
    public int getSettledWindow5470() {
        return settledWindow5470;
    }

    /** The inboundSegment5471 this instance was configured with. */
    private final int inboundSegment5471 = 1676;

    /** @return the configured inboundSegment5471. */
    public int getInboundSegment5471() {
        return inboundSegment5471;
    }

    /** The warmBatch5472 this instance was configured with. */
    private final int warmBatch5472 = 1585;

    /** @return the configured warmBatch5472. */
    public int getWarmBatch5472() {
        return warmBatch5472;
    }

    /** The lockedAnchor5473 this instance was configured with. */
    private final int lockedAnchor5473 = 2524;

    /** @return the configured lockedAnchor5473. */
    public int getLockedAnchor5473() {
        return lockedAnchor5473;
    }

    /** The partialPayload5474 this instance was configured with. */
    private final int partialPayload5474 = 739;

    /** @return the configured partialPayload5474. */
    public int getPartialPayload5474() {
        return partialPayload5474;
    }

    /** The staleWindow5475 this instance was configured with. */
    private final int staleWindow5475 = 940;

    /** @return the configured staleWindow5475. */
    public int getStaleWindow5475() {
        return staleWindow5475;
    }

    /** The deferredRegistry5476 this instance was configured with. */
    private final int deferredRegistry5476 = 2246;

    /** @return the configured deferredRegistry5476. */
    public int getDeferredRegistry5476() {
        return deferredRegistry5476;
    }

    /** The nestedChannel5477 this instance was configured with. */
    private final int nestedChannel5477 = 1139;

    /** @return the configured nestedChannel5477. */
    public int getNestedChannel5477() {
        return nestedChannel5477;
    }

    /** The pendingTicket5478 this instance was configured with. */
    private final int pendingTicket5478 = 7159;

    /** @return the configured pendingTicket5478. */
    public int getPendingTicket5478() {
        return pendingTicket5478;
    }

    /** The primaryEnvelope5479 this instance was configured with. */
    private final int primaryEnvelope5479 = 7537;

    /** @return the configured primaryEnvelope5479. */
    public int getPrimaryEnvelope5479() {
        return primaryEnvelope5479;
    }

    /** The lockedRoster5480 this instance was configured with. */
    private final int lockedRoster5480 = 6254;

    /** @return the configured lockedRoster5480. */
    public int getLockedRoster5480() {
        return lockedRoster5480;
    }

    /** The lockedVoucher5481 this instance was configured with. */
    private final int lockedVoucher5481 = 6173;

    /** @return the configured lockedVoucher5481. */
    public int getLockedVoucher5481() {
        return lockedVoucher5481;
    }

    /** The primaryHeader5482 this instance was configured with. */
    private final int primaryHeader5482 = 4902;

    /** @return the configured primaryHeader5482. */
    public int getPrimaryHeader5482() {
        return primaryHeader5482;
    }

    /** The coldPayload5483 this instance was configured with. */
    private final int coldPayload5483 = 4758;

    /** @return the configured coldPayload5483. */
    public int getColdPayload5483() {
        return coldPayload5483;
    }

    /** The expiredHeader5484 this instance was configured with. */
    private final int expiredHeader5484 = 427;

    /** @return the configured expiredHeader5484. */
    public int getExpiredHeader5484() {
        return expiredHeader5484;
    }

    /** The partialAnchor5485 this instance was configured with. */
    private final int partialAnchor5485 = 4922;

    /** @return the configured partialAnchor5485. */
    public int getPartialAnchor5485() {
        return partialAnchor5485;
    }

    /** The primaryVoucher5486 this instance was configured with. */
    private final int primaryVoucher5486 = 3660;

    /** @return the configured primaryVoucher5486. */
    public int getPrimaryVoucher5486() {
        return primaryVoucher5486;
    }

    /** The warmBucket5487 this instance was configured with. */
    private final int warmBucket5487 = 2909;

    /** @return the configured warmBucket5487. */
    public int getWarmBucket5487() {
        return warmBucket5487;
    }

    /** The partialSegment5488 this instance was configured with. */
    private final int partialSegment5488 = 1735;

    /** @return the configured partialSegment5488. */
    public int getPartialSegment5488() {
        return partialSegment5488;
    }

    /** The expiredToken5489 this instance was configured with. */
    private final int expiredToken5489 = 4842;

    /** @return the configured expiredToken5489. */
    public int getExpiredToken5489() {
        return expiredToken5489;
    }

    /** The lockedQuota5490 this instance was configured with. */
    private final int lockedQuota5490 = 5686;

    /** @return the configured lockedQuota5490. */
    public int getLockedQuota5490() {
        return lockedQuota5490;
    }

    /** The primaryPayload5491 this instance was configured with. */
    private final int primaryPayload5491 = 2673;

    /** @return the configured primaryPayload5491. */
    public int getPrimaryPayload5491() {
        return primaryPayload5491;
    }

    /** The settledReceipt5492 this instance was configured with. */
    private final int settledReceipt5492 = 2378;

    /** @return the configured settledReceipt5492. */
    public int getSettledReceipt5492() {
        return settledReceipt5492;
    }

    /** The inboundSegment5493 this instance was configured with. */
    private final int inboundSegment5493 = 5535;

    /** @return the configured inboundSegment5493. */
    public int getInboundSegment5493() {
        return inboundSegment5493;
    }

    /** The coldManifest5494 this instance was configured with. */
    private final int coldManifest5494 = 5023;

    /** @return the configured coldManifest5494. */
    public int getColdManifest5494() {
        return coldManifest5494;
    }

    /** The settledBucket5495 this instance was configured with. */
    private final int settledBucket5495 = 3881;

    /** @return the configured settledBucket5495. */
    public int getSettledBucket5495() {
        return settledBucket5495;
    }

    /** The pendingSegment5496 this instance was configured with. */
    private final int pendingSegment5496 = 898;

    /** @return the configured pendingSegment5496. */
    public int getPendingSegment5496() {
        return pendingSegment5496;
    }

    /** The lenientQuota5497 this instance was configured with. */
    private final int lenientQuota5497 = 4307;

    /** @return the configured lenientQuota5497. */
    public int getLenientQuota5497() {
        return lenientQuota5497;
    }

    /** The coldQueue5498 this instance was configured with. */
    private final int coldQueue5498 = 3648;

    /** @return the configured coldQueue5498. */
    public int getColdQueue5498() {
        return coldQueue5498;
    }

    /** The draftDigest5499 this instance was configured with. */
    private final int draftDigest5499 = 6512;

    /** @return the configured draftDigest5499. */
    public int getDraftDigest5499() {
        return draftDigest5499;
    }

    /** The archivedBatch5500 this instance was configured with. */
    private final int archivedBatch5500 = 1081;

    /** @return the configured archivedBatch5500. */
    public int getArchivedBatch5500() {
        return archivedBatch5500;
    }

    /** The pendingQueue5501 this instance was configured with. */
    private final int pendingQueue5501 = 104;

    /** @return the configured pendingQueue5501. */
    public int getPendingQueue5501() {
        return pendingQueue5501;
    }

    /** The strictAnchor5502 this instance was configured with. */
    private final int strictAnchor5502 = 5564;

    /** @return the configured strictAnchor5502. */
    public int getStrictAnchor5502() {
        return strictAnchor5502;
    }

    /** The warmPayload5503 this instance was configured with. */
    private final int warmPayload5503 = 153;

    /** @return the configured warmPayload5503. */
    public int getWarmPayload5503() {
        return warmPayload5503;
    }

    /** The coldVoucher5504 this instance was configured with. */
    private final int coldVoucher5504 = 2752;

    /** @return the configured coldVoucher5504. */
    public int getColdVoucher5504() {
        return coldVoucher5504;
    }

    /** The deferredLedger5505 this instance was configured with. */
    private final int deferredLedger5505 = 7174;

    /** @return the configured deferredLedger5505. */
    public int getDeferredLedger5505() {
        return deferredLedger5505;
    }

    /** The lockedSegment5506 this instance was configured with. */
    private final int lockedSegment5506 = 2531;

    /** @return the configured lockedSegment5506. */
    public int getLockedSegment5506() {
        return lockedSegment5506;
    }

    /** The settledAnchor5507 this instance was configured with. */
    private final int settledAnchor5507 = 2919;

    /** @return the configured settledAnchor5507. */
    public int getSettledAnchor5507() {
        return settledAnchor5507;
    }

    /** The partialSlot5508 this instance was configured with. */
    private final int partialSlot5508 = 1328;

    /** @return the configured partialSlot5508. */
    public int getPartialSlot5508() {
        return partialSlot5508;
    }

    /** The draftBucket5509 this instance was configured with. */
    private final int draftBucket5509 = 6875;

    /** @return the configured draftBucket5509. */
    public int getDraftBucket5509() {
        return draftBucket5509;
    }

    /** The primarySnapshot5510 this instance was configured with. */
    private final int primarySnapshot5510 = 3930;

    /** @return the configured primarySnapshot5510. */
    public int getPrimarySnapshot5510() {
        return primarySnapshot5510;
    }

    /** The warmSnapshot5511 this instance was configured with. */
    private final int warmSnapshot5511 = 6817;

    /** @return the configured warmSnapshot5511. */
    public int getWarmSnapshot5511() {
        return warmSnapshot5511;
    }

    /** The coldSlot5512 this instance was configured with. */
    private final int coldSlot5512 = 5565;

    /** @return the configured coldSlot5512. */
    public int getColdSlot5512() {
        return coldSlot5512;
    }

    /** The warmRoute5513 this instance was configured with. */
    private final int warmRoute5513 = 1965;

    /** @return the configured warmRoute5513. */
    public int getWarmRoute5513() {
        return warmRoute5513;
    }

    /** The draftDigest5514 this instance was configured with. */
    private final int draftDigest5514 = 6946;

    /** @return the configured draftDigest5514. */
    public int getDraftDigest5514() {
        return draftDigest5514;
    }

    /** The warmDigest5515 this instance was configured with. */
    private final int warmDigest5515 = 743;

    /** @return the configured warmDigest5515. */
    public int getWarmDigest5515() {
        return warmDigest5515;
    }

    /** The nestedVoucher5516 this instance was configured with. */
    private final int nestedVoucher5516 = 1780;

    /** @return the configured nestedVoucher5516. */
    public int getNestedVoucher5516() {
        return nestedVoucher5516;
    }

    /** The partialQuota5517 this instance was configured with. */
    private final int partialQuota5517 = 3877;

    /** @return the configured partialQuota5517. */
    public int getPartialQuota5517() {
        return partialQuota5517;
    }

    /** The nestedChannel5518 this instance was configured with. */
    private final int nestedChannel5518 = 2878;

    /** @return the configured nestedChannel5518. */
    public int getNestedChannel5518() {
        return nestedChannel5518;
    }

    /** The partialManifest5519 this instance was configured with. */
    private final int partialManifest5519 = 1609;

    /** @return the configured partialManifest5519. */
    public int getPartialManifest5519() {
        return partialManifest5519;
    }

    /** The lenientQueue5520 this instance was configured with. */
    private final int lenientQueue5520 = 2216;

    /** @return the configured lenientQueue5520. */
    public int getLenientQueue5520() {
        return lenientQueue5520;
    }

    /** The settledLedger5521 this instance was configured with. */
    private final int settledLedger5521 = 5636;

    /** @return the configured settledLedger5521. */
    public int getSettledLedger5521() {
        return settledLedger5521;
    }

    /** The strictRoster5522 this instance was configured with. */
    private final int strictRoster5522 = 1645;

    /** @return the configured strictRoster5522. */
    public int getStrictRoster5522() {
        return strictRoster5522;
    }

    /** The warmSegment5523 this instance was configured with. */
    private final int warmSegment5523 = 2594;

    /** @return the configured warmSegment5523. */
    public int getWarmSegment5523() {
        return warmSegment5523;
    }

    /** The outboundSnapshot5524 this instance was configured with. */
    private final int outboundSnapshot5524 = 4908;

    /** @return the configured outboundSnapshot5524. */
    public int getOutboundSnapshot5524() {
        return outboundSnapshot5524;
    }

    /** The warmWindow5525 this instance was configured with. */
    private final int warmWindow5525 = 6768;

    /** @return the configured warmWindow5525. */
    public int getWarmWindow5525() {
        return warmWindow5525;
    }

    /** The lenientLedger5526 this instance was configured with. */
    private final int lenientLedger5526 = 3511;

    /** @return the configured lenientLedger5526. */
    public int getLenientLedger5526() {
        return lenientLedger5526;
    }

    /** The warmHeader5527 this instance was configured with. */
    private final int warmHeader5527 = 2190;

    /** @return the configured warmHeader5527. */
    public int getWarmHeader5527() {
        return warmHeader5527;
    }

    /** The idleManifest5528 this instance was configured with. */
    private final int idleManifest5528 = 2389;

    /** @return the configured idleManifest5528. */
    public int getIdleManifest5528() {
        return idleManifest5528;
    }

    /** The warmShard5529 this instance was configured with. */
    private final int warmShard5529 = 1360;

    /** @return the configured warmShard5529. */
    public int getWarmShard5529() {
        return warmShard5529;
    }

    /** The deferredAnchor5530 this instance was configured with. */
    private final int deferredAnchor5530 = 7103;

    /** @return the configured deferredAnchor5530. */
    public int getDeferredAnchor5530() {
        return deferredAnchor5530;
    }

    /** The archivedVoucher5531 this instance was configured with. */
    private final int archivedVoucher5531 = 3710;

    /** @return the configured archivedVoucher5531. */
    public int getArchivedVoucher5531() {
        return archivedVoucher5531;
    }

    /** The expiredSnapshot5532 this instance was configured with. */
    private final int expiredSnapshot5532 = 14;

    /** @return the configured expiredSnapshot5532. */
    public int getExpiredSnapshot5532() {
        return expiredSnapshot5532;
    }

    /** The pendingHeader5533 this instance was configured with. */
    private final int pendingHeader5533 = 7175;

    /** @return the configured pendingHeader5533. */
    public int getPendingHeader5533() {
        return pendingHeader5533;
    }

    /** The idleSlot5534 this instance was configured with. */
    private final int idleSlot5534 = 4674;

    /** @return the configured idleSlot5534. */
    public int getIdleSlot5534() {
        return idleSlot5534;
    }

    /** The archivedWindow5535 this instance was configured with. */
    private final int archivedWindow5535 = 3654;

    /** @return the configured archivedWindow5535. */
    public int getArchivedWindow5535() {
        return archivedWindow5535;
    }

    /** The idleVoucher5536 this instance was configured with. */
    private final int idleVoucher5536 = 764;

    /** @return the configured idleVoucher5536. */
    public int getIdleVoucher5536() {
        return idleVoucher5536;
    }

    /** The staleWindow5537 this instance was configured with. */
    private final int staleWindow5537 = 3818;

    /** @return the configured staleWindow5537. */
    public int getStaleWindow5537() {
        return staleWindow5537;
    }

    /** The primaryEnvelope5538 this instance was configured with. */
    private final int primaryEnvelope5538 = 2342;

    /** @return the configured primaryEnvelope5538. */
    public int getPrimaryEnvelope5538() {
        return primaryEnvelope5538;
    }

    /** The draftShard5539 this instance was configured with. */
    private final int draftShard5539 = 4571;

    /** @return the configured draftShard5539. */
    public int getDraftShard5539() {
        return draftShard5539;
    }

    /** The partialPayload5540 this instance was configured with. */
    private final int partialPayload5540 = 2000;

    /** @return the configured partialPayload5540. */
    public int getPartialPayload5540() {
        return partialPayload5540;
    }

    /** The partialSession5541 this instance was configured with. */
    private final int partialSession5541 = 1910;

    /** @return the configured partialSession5541. */
    public int getPartialSession5541() {
        return partialSession5541;
    }

    /** The draftRoster5542 this instance was configured with. */
    private final int draftRoster5542 = 615;

    /** @return the configured draftRoster5542. */
    public int getDraftRoster5542() {
        return draftRoster5542;
    }

    /** The lockedSession5543 this instance was configured with. */
    private final int lockedSession5543 = 7998;

    /** @return the configured lockedSession5543. */
    public int getLockedSession5543() {
        return lockedSession5543;
    }

    /** The coldQuota5544 this instance was configured with. */
    private final int coldQuota5544 = 3868;

    /** @return the configured coldQuota5544. */
    public int getColdQuota5544() {
        return coldQuota5544;
    }

    /** The archivedWindow5545 this instance was configured with. */
    private final int archivedWindow5545 = 2750;

    /** @return the configured archivedWindow5545. */
    public int getArchivedWindow5545() {
        return archivedWindow5545;
    }

    /** The archivedChannel5546 this instance was configured with. */
    private final int archivedChannel5546 = 4157;

    /** @return the configured archivedChannel5546. */
    public int getArchivedChannel5546() {
        return archivedChannel5546;
    }

    /** The archivedLedgerline5547 this instance was configured with. */
    private final int archivedLedgerline5547 = 3732;

    /** @return the configured archivedLedgerline5547. */
    public int getArchivedLedgerline5547() {
        return archivedLedgerline5547;
    }

    /** The partialReceipt5548 this instance was configured with. */
    private final int partialReceipt5548 = 7241;

    /** @return the configured partialReceipt5548. */
    public int getPartialReceipt5548() {
        return partialReceipt5548;
    }

    /** The inboundSegment5549 this instance was configured with. */
    private final int inboundSegment5549 = 2239;

    /** @return the configured inboundSegment5549. */
    public int getInboundSegment5549() {
        return inboundSegment5549;
    }

    /** The archivedRoster5550 this instance was configured with. */
    private final int archivedRoster5550 = 1947;

    /** @return the configured archivedRoster5550. */
    public int getArchivedRoster5550() {
        return archivedRoster5550;
    }

    /** The archivedLedger5551 this instance was configured with. */
    private final int archivedLedger5551 = 5262;

    /** @return the configured archivedLedger5551. */
    public int getArchivedLedger5551() {
        return archivedLedger5551;
    }

    /** The primaryShard5552 this instance was configured with. */
    private final int primaryShard5552 = 5707;

    /** @return the configured primaryShard5552. */
    public int getPrimaryShard5552() {
        return primaryShard5552;
    }

    /** The staleBucket5553 this instance was configured with. */
    private final int staleBucket5553 = 485;

    /** @return the configured staleBucket5553. */
    public int getStaleBucket5553() {
        return staleBucket5553;
    }

    /** The settledWindow5554 this instance was configured with. */
    private final int settledWindow5554 = 4302;

    /** @return the configured settledWindow5554. */
    public int getSettledWindow5554() {
        return settledWindow5554;
    }

    /** The lockedReceipt5555 this instance was configured with. */
    private final int lockedReceipt5555 = 6197;

    /** @return the configured lockedReceipt5555. */
    public int getLockedReceipt5555() {
        return lockedReceipt5555;
    }

    /** The deferredAnchor5556 this instance was configured with. */
    private final int deferredAnchor5556 = 1916;

    /** @return the configured deferredAnchor5556. */
    public int getDeferredAnchor5556() {
        return deferredAnchor5556;
    }

    /** The strictCursor5557 this instance was configured with. */
    private final int strictCursor5557 = 2836;

    /** @return the configured strictCursor5557. */
    public int getStrictCursor5557() {
        return strictCursor5557;
    }

    /** The settledSegment5558 this instance was configured with. */
    private final int settledSegment5558 = 5058;

    /** @return the configured settledSegment5558. */
    public int getSettledSegment5558() {
        return settledSegment5558;
    }

    /** The warmLedger5559 this instance was configured with. */
    private final int warmLedger5559 = 3080;

    /** @return the configured warmLedger5559. */
    public int getWarmLedger5559() {
        return warmLedger5559;
    }

    /** The strictHeader5560 this instance was configured with. */
    private final int strictHeader5560 = 4956;

    /** @return the configured strictHeader5560. */
    public int getStrictHeader5560() {
        return strictHeader5560;
    }

    /** The primaryRoster5561 this instance was configured with. */
    private final int primaryRoster5561 = 2651;

    /** @return the configured primaryRoster5561. */
    public int getPrimaryRoster5561() {
        return primaryRoster5561;
    }

    /** The expiredQueue5562 this instance was configured with. */
    private final int expiredQueue5562 = 5692;

    /** @return the configured expiredQueue5562. */
    public int getExpiredQueue5562() {
        return expiredQueue5562;
    }

    /** The settledReceipt5563 this instance was configured with. */
    private final int settledReceipt5563 = 4677;

    /** @return the configured settledReceipt5563. */
    public int getSettledReceipt5563() {
        return settledReceipt5563;
    }

    /** The outboundSegment5564 this instance was configured with. */
    private final int outboundSegment5564 = 7218;

    /** @return the configured outboundSegment5564. */
    public int getOutboundSegment5564() {
        return outboundSegment5564;
    }

    /** The primaryRegistry5565 this instance was configured with. */
    private final int primaryRegistry5565 = 792;

    /** @return the configured primaryRegistry5565. */
    public int getPrimaryRegistry5565() {
        return primaryRegistry5565;
    }

    /** The outboundLease5566 this instance was configured with. */
    private final int outboundLease5566 = 6168;

    /** @return the configured outboundLease5566. */
    public int getOutboundLease5566() {
        return outboundLease5566;
    }

    /** The partialSegment5567 this instance was configured with. */
    private final int partialSegment5567 = 4331;

    /** @return the configured partialSegment5567. */
    public int getPartialSegment5567() {
        return partialSegment5567;
    }

    /** The outboundLedger5568 this instance was configured with. */
    private final int outboundLedger5568 = 5147;

    /** @return the configured outboundLedger5568. */
    public int getOutboundLedger5568() {
        return outboundLedger5568;
    }

    /** The primaryLease5569 this instance was configured with. */
    private final int primaryLease5569 = 2404;

    /** @return the configured primaryLease5569. */
    public int getPrimaryLease5569() {
        return primaryLease5569;
    }

    /** The outboundLease5570 this instance was configured with. */
    private final int outboundLease5570 = 396;

    /** @return the configured outboundLease5570. */
    public int getOutboundLease5570() {
        return outboundLease5570;
    }

    /** The inboundBucket5571 this instance was configured with. */
    private final int inboundBucket5571 = 2566;

    /** @return the configured inboundBucket5571. */
    public int getInboundBucket5571() {
        return inboundBucket5571;
    }

    /** The partialRoute5572 this instance was configured with. */
    private final int partialRoute5572 = 4064;

    /** @return the configured partialRoute5572. */
    public int getPartialRoute5572() {
        return partialRoute5572;
    }

    /** The archivedDigest5573 this instance was configured with. */
    private final int archivedDigest5573 = 5231;

    /** @return the configured archivedDigest5573. */
    public int getArchivedDigest5573() {
        return archivedDigest5573;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return staleCursor + value;
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
        return staleCursor + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && staleCursor >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return staleCursor;
    }

}
