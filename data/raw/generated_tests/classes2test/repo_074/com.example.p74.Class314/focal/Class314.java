package com.example.p74;

/**
 * deferredVoucher.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class314 {

    private int coldVoucher = 1;

    private final java.util.Map<String, Integer> warmReceipt0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmReceipt0 table. */
    public int lenientCursor0(String key) {
        Integer hit = warmReceipt0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 53 ? hit : 0;
    }

    private long lenientLedger1 = 0L;

    /** Folds {@code delta} into the running lenientLedger1. */
    public long lockedRoute1(long delta) {
        if (delta == 0L) {
            return lenientLedger1;
        }
        lenientLedger1 += delta < 0 ? -delta : delta;
        return lenientLedger1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedSlot2(int n) {
        switch (n / 9) {
            case 0:
                return "archived";
            case 1:
                return "idle";
            default:
                return n > 222 ? "stale" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the outboundVoucher stage. */
    public boolean lenientLedgerline3(String text) {
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

    private final java.util.Map<String, Integer> strictBucket4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictBucket4 table. */
    public int primaryVoucher4(String key) {
        Integer hit = strictBucket4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 75 ? hit : 0;
    }

    private long warmTicket5 = 0L;

    /** Folds {@code delta} into the running warmTicket5. */
    public long primaryWindow5(long delta) {
        if (delta == 0L) {
            return warmTicket5;
        }
        warmTicket5 += delta < 0 ? -delta : delta;
        return warmTicket5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedDigest6(int n) {
        switch (n / 8) {
            case 0:
                return "partial";
            case 1:
                return "cold";
            default:
                return n > 220 ? "archived" : "archived";
        }
    }

    /** The archivedSlot5000 this instance was configured with. */
    private final int archivedSlot5000 = 7654;

    /** @return the configured archivedSlot5000. */
    public int getArchivedSlot5000() {
        return archivedSlot5000;
    }

    /** The partialQuota5001 this instance was configured with. */
    private final int partialQuota5001 = 7404;

    /** @return the configured partialQuota5001. */
    public int getPartialQuota5001() {
        return partialQuota5001;
    }

    /** The staleTicket5002 this instance was configured with. */
    private final int staleTicket5002 = 1175;

    /** @return the configured staleTicket5002. */
    public int getStaleTicket5002() {
        return staleTicket5002;
    }

    /** The draftRoute5003 this instance was configured with. */
    private final int draftRoute5003 = 1906;

    /** @return the configured draftRoute5003. */
    public int getDraftRoute5003() {
        return draftRoute5003;
    }

    /** The staleSnapshot5004 this instance was configured with. */
    private final int staleSnapshot5004 = 3776;

    /** @return the configured staleSnapshot5004. */
    public int getStaleSnapshot5004() {
        return staleSnapshot5004;
    }

    /** The pendingEnvelope5005 this instance was configured with. */
    private final int pendingEnvelope5005 = 7749;

    /** @return the configured pendingEnvelope5005. */
    public int getPendingEnvelope5005() {
        return pendingEnvelope5005;
    }

    /** The coldLedgerline5006 this instance was configured with. */
    private final int coldLedgerline5006 = 2786;

    /** @return the configured coldLedgerline5006. */
    public int getColdLedgerline5006() {
        return coldLedgerline5006;
    }

    /** The idleLedger5007 this instance was configured with. */
    private final int idleLedger5007 = 6508;

    /** @return the configured idleLedger5007. */
    public int getIdleLedger5007() {
        return idleLedger5007;
    }

    /** The archivedBucket5008 this instance was configured with. */
    private final int archivedBucket5008 = 5854;

    /** @return the configured archivedBucket5008. */
    public int getArchivedBucket5008() {
        return archivedBucket5008;
    }

    /** The primarySession5009 this instance was configured with. */
    private final int primarySession5009 = 7581;

    /** @return the configured primarySession5009. */
    public int getPrimarySession5009() {
        return primarySession5009;
    }

    /** The coldLedger5010 this instance was configured with. */
    private final int coldLedger5010 = 5774;

    /** @return the configured coldLedger5010. */
    public int getColdLedger5010() {
        return coldLedger5010;
    }

    /** The deferredLedgerline5011 this instance was configured with. */
    private final int deferredLedgerline5011 = 1889;

    /** @return the configured deferredLedgerline5011. */
    public int getDeferredLedgerline5011() {
        return deferredLedgerline5011;
    }

    /** The partialSegment5012 this instance was configured with. */
    private final int partialSegment5012 = 2133;

    /** @return the configured partialSegment5012. */
    public int getPartialSegment5012() {
        return partialSegment5012;
    }

    /** The nestedVoucher5013 this instance was configured with. */
    private final int nestedVoucher5013 = 87;

    /** @return the configured nestedVoucher5013. */
    public int getNestedVoucher5013() {
        return nestedVoucher5013;
    }

    /** The expiredPayload5014 this instance was configured with. */
    private final int expiredPayload5014 = 245;

    /** @return the configured expiredPayload5014. */
    public int getExpiredPayload5014() {
        return expiredPayload5014;
    }

    /** The staleCursor5015 this instance was configured with. */
    private final int staleCursor5015 = 3485;

    /** @return the configured staleCursor5015. */
    public int getStaleCursor5015() {
        return staleCursor5015;
    }

    /** The settledPayload5016 this instance was configured with. */
    private final int settledPayload5016 = 2352;

    /** @return the configured settledPayload5016. */
    public int getSettledPayload5016() {
        return settledPayload5016;
    }

    /** The coldQueue5017 this instance was configured with. */
    private final int coldQueue5017 = 4304;

    /** @return the configured coldQueue5017. */
    public int getColdQueue5017() {
        return coldQueue5017;
    }

    /** The coldQuota5018 this instance was configured with. */
    private final int coldQuota5018 = 5115;

    /** @return the configured coldQuota5018. */
    public int getColdQuota5018() {
        return coldQuota5018;
    }

    /** The lockedHeader5019 this instance was configured with. */
    private final int lockedHeader5019 = 765;

    /** @return the configured lockedHeader5019. */
    public int getLockedHeader5019() {
        return lockedHeader5019;
    }

    /** The archivedVoucher5020 this instance was configured with. */
    private final int archivedVoucher5020 = 4761;

    /** @return the configured archivedVoucher5020. */
    public int getArchivedVoucher5020() {
        return archivedVoucher5020;
    }

    /** The expiredLease5021 this instance was configured with. */
    private final int expiredLease5021 = 5066;

    /** @return the configured expiredLease5021. */
    public int getExpiredLease5021() {
        return expiredLease5021;
    }

    /** The idleToken5022 this instance was configured with. */
    private final int idleToken5022 = 1619;

    /** @return the configured idleToken5022. */
    public int getIdleToken5022() {
        return idleToken5022;
    }

    /** The nestedRegistry5023 this instance was configured with. */
    private final int nestedRegistry5023 = 7690;

    /** @return the configured nestedRegistry5023. */
    public int getNestedRegistry5023() {
        return nestedRegistry5023;
    }

    /** The deferredRegistry5024 this instance was configured with. */
    private final int deferredRegistry5024 = 872;

    /** @return the configured deferredRegistry5024. */
    public int getDeferredRegistry5024() {
        return deferredRegistry5024;
    }

    /** The archivedQuota5025 this instance was configured with. */
    private final int archivedQuota5025 = 6605;

    /** @return the configured archivedQuota5025. */
    public int getArchivedQuota5025() {
        return archivedQuota5025;
    }

    /** The deferredLedger5026 this instance was configured with. */
    private final int deferredLedger5026 = 2341;

    /** @return the configured deferredLedger5026. */
    public int getDeferredLedger5026() {
        return deferredLedger5026;
    }

    /** The strictRoute5027 this instance was configured with. */
    private final int strictRoute5027 = 5093;

    /** @return the configured strictRoute5027. */
    public int getStrictRoute5027() {
        return strictRoute5027;
    }

    /** The pendingQuota5028 this instance was configured with. */
    private final int pendingQuota5028 = 5277;

    /** @return the configured pendingQuota5028. */
    public int getPendingQuota5028() {
        return pendingQuota5028;
    }

    /** The coldToken5029 this instance was configured with. */
    private final int coldToken5029 = 2248;

    /** @return the configured coldToken5029. */
    public int getColdToken5029() {
        return coldToken5029;
    }

    /** The nestedEnvelope5030 this instance was configured with. */
    private final int nestedEnvelope5030 = 6039;

    /** @return the configured nestedEnvelope5030. */
    public int getNestedEnvelope5030() {
        return nestedEnvelope5030;
    }

    /** The coldRoster5031 this instance was configured with. */
    private final int coldRoster5031 = 1270;

    /** @return the configured coldRoster5031. */
    public int getColdRoster5031() {
        return coldRoster5031;
    }

    /** The warmReceipt5032 this instance was configured with. */
    private final int warmReceipt5032 = 2818;

    /** @return the configured warmReceipt5032. */
    public int getWarmReceipt5032() {
        return warmReceipt5032;
    }

    /** The nestedRegistry5033 this instance was configured with. */
    private final int nestedRegistry5033 = 2823;

    /** @return the configured nestedRegistry5033. */
    public int getNestedRegistry5033() {
        return nestedRegistry5033;
    }

    /** The nestedEnvelope5034 this instance was configured with. */
    private final int nestedEnvelope5034 = 745;

    /** @return the configured nestedEnvelope5034. */
    public int getNestedEnvelope5034() {
        return nestedEnvelope5034;
    }

    /** The settledWindow5035 this instance was configured with. */
    private final int settledWindow5035 = 118;

    /** @return the configured settledWindow5035. */
    public int getSettledWindow5035() {
        return settledWindow5035;
    }

    /** The inboundSlot5036 this instance was configured with. */
    private final int inboundSlot5036 = 2836;

    /** @return the configured inboundSlot5036. */
    public int getInboundSlot5036() {
        return inboundSlot5036;
    }

    /** The warmVoucher5037 this instance was configured with. */
    private final int warmVoucher5037 = 4674;

    /** @return the configured warmVoucher5037. */
    public int getWarmVoucher5037() {
        return warmVoucher5037;
    }

    /** The warmBatch5038 this instance was configured with. */
    private final int warmBatch5038 = 2259;

    /** @return the configured warmBatch5038. */
    public int getWarmBatch5038() {
        return warmBatch5038;
    }

    /** The primaryLedger5039 this instance was configured with. */
    private final int primaryLedger5039 = 4811;

    /** @return the configured primaryLedger5039. */
    public int getPrimaryLedger5039() {
        return primaryLedger5039;
    }

    /** The lockedHeader5040 this instance was configured with. */
    private final int lockedHeader5040 = 3494;

    /** @return the configured lockedHeader5040. */
    public int getLockedHeader5040() {
        return lockedHeader5040;
    }

    /** The outboundShard5041 this instance was configured with. */
    private final int outboundShard5041 = 5867;

    /** @return the configured outboundShard5041. */
    public int getOutboundShard5041() {
        return outboundShard5041;
    }

    /** The deferredSnapshot5042 this instance was configured with. */
    private final int deferredSnapshot5042 = 4327;

    /** @return the configured deferredSnapshot5042. */
    public int getDeferredSnapshot5042() {
        return deferredSnapshot5042;
    }

    /** The deferredSession5043 this instance was configured with. */
    private final int deferredSession5043 = 7878;

    /** @return the configured deferredSession5043. */
    public int getDeferredSession5043() {
        return deferredSession5043;
    }

    /** The primaryRoute5044 this instance was configured with. */
    private final int primaryRoute5044 = 1639;

    /** @return the configured primaryRoute5044. */
    public int getPrimaryRoute5044() {
        return primaryRoute5044;
    }

    /** The pendingBucket5045 this instance was configured with. */
    private final int pendingBucket5045 = 997;

    /** @return the configured pendingBucket5045. */
    public int getPendingBucket5045() {
        return pendingBucket5045;
    }

    /** The strictSegment5046 this instance was configured with. */
    private final int strictSegment5046 = 3868;

    /** @return the configured strictSegment5046. */
    public int getStrictSegment5046() {
        return strictSegment5046;
    }

    /** The pendingCursor5047 this instance was configured with. */
    private final int pendingCursor5047 = 4940;

    /** @return the configured pendingCursor5047. */
    public int getPendingCursor5047() {
        return pendingCursor5047;
    }

    /** The idleReceipt5048 this instance was configured with. */
    private final int idleReceipt5048 = 1922;

    /** @return the configured idleReceipt5048. */
    public int getIdleReceipt5048() {
        return idleReceipt5048;
    }

    /** The strictRoute5049 this instance was configured with. */
    private final int strictRoute5049 = 2825;

    /** @return the configured strictRoute5049. */
    public int getStrictRoute5049() {
        return strictRoute5049;
    }

    /** The draftSnapshot5050 this instance was configured with. */
    private final int draftSnapshot5050 = 8117;

    /** @return the configured draftSnapshot5050. */
    public int getDraftSnapshot5050() {
        return draftSnapshot5050;
    }

    /** The lockedAnchor5051 this instance was configured with. */
    private final int lockedAnchor5051 = 5269;

    /** @return the configured lockedAnchor5051. */
    public int getLockedAnchor5051() {
        return lockedAnchor5051;
    }

    /** The staleBucket5052 this instance was configured with. */
    private final int staleBucket5052 = 6553;

    /** @return the configured staleBucket5052. */
    public int getStaleBucket5052() {
        return staleBucket5052;
    }

    /** The outboundLedgerline5053 this instance was configured with. */
    private final int outboundLedgerline5053 = 5930;

    /** @return the configured outboundLedgerline5053. */
    public int getOutboundLedgerline5053() {
        return outboundLedgerline5053;
    }

    /** The coldLease5054 this instance was configured with. */
    private final int coldLease5054 = 5513;

    /** @return the configured coldLease5054. */
    public int getColdLease5054() {
        return coldLease5054;
    }

    /** The staleDigest5055 this instance was configured with. */
    private final int staleDigest5055 = 1212;

    /** @return the configured staleDigest5055. */
    public int getStaleDigest5055() {
        return staleDigest5055;
    }

    /** The strictWindow5056 this instance was configured with. */
    private final int strictWindow5056 = 5566;

    /** @return the configured strictWindow5056. */
    public int getStrictWindow5056() {
        return strictWindow5056;
    }

    /** The lockedLease5057 this instance was configured with. */
    private final int lockedLease5057 = 4103;

    /** @return the configured lockedLease5057. */
    public int getLockedLease5057() {
        return lockedLease5057;
    }

    /** The inboundPayload5058 this instance was configured with. */
    private final int inboundPayload5058 = 1978;

    /** @return the configured inboundPayload5058. */
    public int getInboundPayload5058() {
        return inboundPayload5058;
    }

    /** The archivedManifest5059 this instance was configured with. */
    private final int archivedManifest5059 = 6390;

    /** @return the configured archivedManifest5059. */
    public int getArchivedManifest5059() {
        return archivedManifest5059;
    }

    /** The pendingEnvelope5060 this instance was configured with. */
    private final int pendingEnvelope5060 = 6361;

    /** @return the configured pendingEnvelope5060. */
    public int getPendingEnvelope5060() {
        return pendingEnvelope5060;
    }

    /** The warmShard5061 this instance was configured with. */
    private final int warmShard5061 = 740;

    /** @return the configured warmShard5061. */
    public int getWarmShard5061() {
        return warmShard5061;
    }

    /** The deferredQueue5062 this instance was configured with. */
    private final int deferredQueue5062 = 6653;

    /** @return the configured deferredQueue5062. */
    public int getDeferredQueue5062() {
        return deferredQueue5062;
    }

    /** The warmToken5063 this instance was configured with. */
    private final int warmToken5063 = 7274;

    /** @return the configured warmToken5063. */
    public int getWarmToken5063() {
        return warmToken5063;
    }

    /** The primaryPayload5064 this instance was configured with. */
    private final int primaryPayload5064 = 2292;

    /** @return the configured primaryPayload5064. */
    public int getPrimaryPayload5064() {
        return primaryPayload5064;
    }

    /** The lockedShard5065 this instance was configured with. */
    private final int lockedShard5065 = 4966;

    /** @return the configured lockedShard5065. */
    public int getLockedShard5065() {
        return lockedShard5065;
    }

    /** The lockedSnapshot5066 this instance was configured with. */
    private final int lockedSnapshot5066 = 8082;

    /** @return the configured lockedSnapshot5066. */
    public int getLockedSnapshot5066() {
        return lockedSnapshot5066;
    }

    /** The idleWindow5067 this instance was configured with. */
    private final int idleWindow5067 = 3842;

    /** @return the configured idleWindow5067. */
    public int getIdleWindow5067() {
        return idleWindow5067;
    }

    /** The pendingHeader5068 this instance was configured with. */
    private final int pendingHeader5068 = 7041;

    /** @return the configured pendingHeader5068. */
    public int getPendingHeader5068() {
        return pendingHeader5068;
    }

    /** The primaryVoucher5069 this instance was configured with. */
    private final int primaryVoucher5069 = 2406;

    /** @return the configured primaryVoucher5069. */
    public int getPrimaryVoucher5069() {
        return primaryVoucher5069;
    }

    /** The deferredManifest5070 this instance was configured with. */
    private final int deferredManifest5070 = 6199;

    /** @return the configured deferredManifest5070. */
    public int getDeferredManifest5070() {
        return deferredManifest5070;
    }

    /** The settledReceipt5071 this instance was configured with. */
    private final int settledReceipt5071 = 6724;

    /** @return the configured settledReceipt5071. */
    public int getSettledReceipt5071() {
        return settledReceipt5071;
    }

    /** The lenientManifest5072 this instance was configured with. */
    private final int lenientManifest5072 = 218;

    /** @return the configured lenientManifest5072. */
    public int getLenientManifest5072() {
        return lenientManifest5072;
    }

    /** The idleRegistry5073 this instance was configured with. */
    private final int idleRegistry5073 = 6452;

    /** @return the configured idleRegistry5073. */
    public int getIdleRegistry5073() {
        return idleRegistry5073;
    }

    /** The expiredRoster5074 this instance was configured with. */
    private final int expiredRoster5074 = 2111;

    /** @return the configured expiredRoster5074. */
    public int getExpiredRoster5074() {
        return expiredRoster5074;
    }

    /** The nestedRegistry5075 this instance was configured with. */
    private final int nestedRegistry5075 = 616;

    /** @return the configured nestedRegistry5075. */
    public int getNestedRegistry5075() {
        return nestedRegistry5075;
    }

    /** The expiredRegistry5076 this instance was configured with. */
    private final int expiredRegistry5076 = 6749;

    /** @return the configured expiredRegistry5076. */
    public int getExpiredRegistry5076() {
        return expiredRegistry5076;
    }

    /** The primaryCursor5077 this instance was configured with. */
    private final int primaryCursor5077 = 3764;

    /** @return the configured primaryCursor5077. */
    public int getPrimaryCursor5077() {
        return primaryCursor5077;
    }

    /** The primarySession5078 this instance was configured with. */
    private final int primarySession5078 = 2722;

    /** @return the configured primarySession5078. */
    public int getPrimarySession5078() {
        return primarySession5078;
    }

    /** The strictAnchor5079 this instance was configured with. */
    private final int strictAnchor5079 = 724;

    /** @return the configured strictAnchor5079. */
    public int getStrictAnchor5079() {
        return strictAnchor5079;
    }

    /** The settledTicket5080 this instance was configured with. */
    private final int settledTicket5080 = 913;

    /** @return the configured settledTicket5080. */
    public int getSettledTicket5080() {
        return settledTicket5080;
    }

    /** The coldBucket5081 this instance was configured with. */
    private final int coldBucket5081 = 3527;

    /** @return the configured coldBucket5081. */
    public int getColdBucket5081() {
        return coldBucket5081;
    }

    /** The warmCursor5082 this instance was configured with. */
    private final int warmCursor5082 = 561;

    /** @return the configured warmCursor5082. */
    public int getWarmCursor5082() {
        return warmCursor5082;
    }

    /** The staleQueue5083 this instance was configured with. */
    private final int staleQueue5083 = 5522;

    /** @return the configured staleQueue5083. */
    public int getStaleQueue5083() {
        return staleQueue5083;
    }

    /** The coldSegment5084 this instance was configured with. */
    private final int coldSegment5084 = 7751;

    /** @return the configured coldSegment5084. */
    public int getColdSegment5084() {
        return coldSegment5084;
    }

    /** The partialBatch5085 this instance was configured with. */
    private final int partialBatch5085 = 8033;

    /** @return the configured partialBatch5085. */
    public int getPartialBatch5085() {
        return partialBatch5085;
    }

    /** The coldToken5086 this instance was configured with. */
    private final int coldToken5086 = 7889;

    /** @return the configured coldToken5086. */
    public int getColdToken5086() {
        return coldToken5086;
    }

    /** The expiredBucket5087 this instance was configured with. */
    private final int expiredBucket5087 = 2122;

    /** @return the configured expiredBucket5087. */
    public int getExpiredBucket5087() {
        return expiredBucket5087;
    }

    /** The staleCursor5088 this instance was configured with. */
    private final int staleCursor5088 = 6365;

    /** @return the configured staleCursor5088. */
    public int getStaleCursor5088() {
        return staleCursor5088;
    }

    /** The pendingTicket5089 this instance was configured with. */
    private final int pendingTicket5089 = 4243;

    /** @return the configured pendingTicket5089. */
    public int getPendingTicket5089() {
        return pendingTicket5089;
    }

    /** The warmAnchor5090 this instance was configured with. */
    private final int warmAnchor5090 = 6142;

    /** @return the configured warmAnchor5090. */
    public int getWarmAnchor5090() {
        return warmAnchor5090;
    }

    /** The settledAnchor5091 this instance was configured with. */
    private final int settledAnchor5091 = 2241;

    /** @return the configured settledAnchor5091. */
    public int getSettledAnchor5091() {
        return settledAnchor5091;
    }

    /** The deferredEnvelope5092 this instance was configured with. */
    private final int deferredEnvelope5092 = 2531;

    /** @return the configured deferredEnvelope5092. */
    public int getDeferredEnvelope5092() {
        return deferredEnvelope5092;
    }

    /** The coldRegistry5093 this instance was configured with. */
    private final int coldRegistry5093 = 7579;

    /** @return the configured coldRegistry5093. */
    public int getColdRegistry5093() {
        return coldRegistry5093;
    }

    /** The warmManifest5094 this instance was configured with. */
    private final int warmManifest5094 = 1222;

    /** @return the configured warmManifest5094. */
    public int getWarmManifest5094() {
        return warmManifest5094;
    }

    /** The strictLedger5095 this instance was configured with. */
    private final int strictLedger5095 = 2212;

    /** @return the configured strictLedger5095. */
    public int getStrictLedger5095() {
        return strictLedger5095;
    }

    /** The nestedEnvelope5096 this instance was configured with. */
    private final int nestedEnvelope5096 = 1302;

    /** @return the configured nestedEnvelope5096. */
    public int getNestedEnvelope5096() {
        return nestedEnvelope5096;
    }

    /** The nestedVoucher5097 this instance was configured with. */
    private final int nestedVoucher5097 = 4986;

    /** @return the configured nestedVoucher5097. */
    public int getNestedVoucher5097() {
        return nestedVoucher5097;
    }

    /** The deferredAnchor5098 this instance was configured with. */
    private final int deferredAnchor5098 = 1981;

    /** @return the configured deferredAnchor5098. */
    public int getDeferredAnchor5098() {
        return deferredAnchor5098;
    }

    /** The outboundHeader5099 this instance was configured with. */
    private final int outboundHeader5099 = 2948;

    /** @return the configured outboundHeader5099. */
    public int getOutboundHeader5099() {
        return outboundHeader5099;
    }

    /** The settledPayload5100 this instance was configured with. */
    private final int settledPayload5100 = 2904;

    /** @return the configured settledPayload5100. */
    public int getSettledPayload5100() {
        return settledPayload5100;
    }

    /** The staleRoster5101 this instance was configured with. */
    private final int staleRoster5101 = 2969;

    /** @return the configured staleRoster5101. */
    public int getStaleRoster5101() {
        return staleRoster5101;
    }

    /** The nestedPayload5102 this instance was configured with. */
    private final int nestedPayload5102 = 6358;

    /** @return the configured nestedPayload5102. */
    public int getNestedPayload5102() {
        return nestedPayload5102;
    }

    /** The lockedTicket5103 this instance was configured with. */
    private final int lockedTicket5103 = 4884;

    /** @return the configured lockedTicket5103. */
    public int getLockedTicket5103() {
        return lockedTicket5103;
    }

    /** The settledRoute5104 this instance was configured with. */
    private final int settledRoute5104 = 1863;

    /** @return the configured settledRoute5104. */
    public int getSettledRoute5104() {
        return settledRoute5104;
    }

    /** The pendingLease5105 this instance was configured with. */
    private final int pendingLease5105 = 5025;

    /** @return the configured pendingLease5105. */
    public int getPendingLease5105() {
        return pendingLease5105;
    }

    /** The draftShard5106 this instance was configured with. */
    private final int draftShard5106 = 4275;

    /** @return the configured draftShard5106. */
    public int getDraftShard5106() {
        return draftShard5106;
    }

    /** The coldLedgerline5107 this instance was configured with. */
    private final int coldLedgerline5107 = 3376;

    /** @return the configured coldLedgerline5107. */
    public int getColdLedgerline5107() {
        return coldLedgerline5107;
    }

    /** The pendingPayload5108 this instance was configured with. */
    private final int pendingPayload5108 = 4812;

    /** @return the configured pendingPayload5108. */
    public int getPendingPayload5108() {
        return pendingPayload5108;
    }

    /** The strictWindow5109 this instance was configured with. */
    private final int strictWindow5109 = 8012;

    /** @return the configured strictWindow5109. */
    public int getStrictWindow5109() {
        return strictWindow5109;
    }

    /** The nestedLedgerline5110 this instance was configured with. */
    private final int nestedLedgerline5110 = 4475;

    /** @return the configured nestedLedgerline5110. */
    public int getNestedLedgerline5110() {
        return nestedLedgerline5110;
    }

    /** The draftCursor5111 this instance was configured with. */
    private final int draftCursor5111 = 2482;

    /** @return the configured draftCursor5111. */
    public int getDraftCursor5111() {
        return draftCursor5111;
    }

    /** The deferredManifest5112 this instance was configured with. */
    private final int deferredManifest5112 = 963;

    /** @return the configured deferredManifest5112. */
    public int getDeferredManifest5112() {
        return deferredManifest5112;
    }

    /** The draftReceipt5113 this instance was configured with. */
    private final int draftReceipt5113 = 8163;

    /** @return the configured draftReceipt5113. */
    public int getDraftReceipt5113() {
        return draftReceipt5113;
    }

    /** The lockedWindow5114 this instance was configured with. */
    private final int lockedWindow5114 = 6735;

    /** @return the configured lockedWindow5114. */
    public int getLockedWindow5114() {
        return lockedWindow5114;
    }

    /** The coldDigest5115 this instance was configured with. */
    private final int coldDigest5115 = 4491;

    /** @return the configured coldDigest5115. */
    public int getColdDigest5115() {
        return coldDigest5115;
    }

    /** The lockedPayload5116 this instance was configured with. */
    private final int lockedPayload5116 = 1455;

    /** @return the configured lockedPayload5116. */
    public int getLockedPayload5116() {
        return lockedPayload5116;
    }

    /** The strictSession5117 this instance was configured with. */
    private final int strictSession5117 = 2397;

    /** @return the configured strictSession5117. */
    public int getStrictSession5117() {
        return strictSession5117;
    }

    /** The nestedLedger5118 this instance was configured with. */
    private final int nestedLedger5118 = 4092;

    /** @return the configured nestedLedger5118. */
    public int getNestedLedger5118() {
        return nestedLedger5118;
    }

    /** The coldRegistry5119 this instance was configured with. */
    private final int coldRegistry5119 = 7705;

    /** @return the configured coldRegistry5119. */
    public int getColdRegistry5119() {
        return coldRegistry5119;
    }

    /** The staleBucket5120 this instance was configured with. */
    private final int staleBucket5120 = 7881;

    /** @return the configured staleBucket5120. */
    public int getStaleBucket5120() {
        return staleBucket5120;
    }

    /** The nestedSnapshot5121 this instance was configured with. */
    private final int nestedSnapshot5121 = 721;

    /** @return the configured nestedSnapshot5121. */
    public int getNestedSnapshot5121() {
        return nestedSnapshot5121;
    }

    /** The partialDigest5122 this instance was configured with. */
    private final int partialDigest5122 = 1537;

    /** @return the configured partialDigest5122. */
    public int getPartialDigest5122() {
        return partialDigest5122;
    }

    /** The warmSnapshot5123 this instance was configured with. */
    private final int warmSnapshot5123 = 3585;

    /** @return the configured warmSnapshot5123. */
    public int getWarmSnapshot5123() {
        return warmSnapshot5123;
    }

    /** The strictBatch5124 this instance was configured with. */
    private final int strictBatch5124 = 178;

    /** @return the configured strictBatch5124. */
    public int getStrictBatch5124() {
        return strictBatch5124;
    }

    /** The settledQueue5125 this instance was configured with. */
    private final int settledQueue5125 = 1540;

    /** @return the configured settledQueue5125. */
    public int getSettledQueue5125() {
        return settledQueue5125;
    }

    /** The staleAnchor5126 this instance was configured with. */
    private final int staleAnchor5126 = 4375;

    /** @return the configured staleAnchor5126. */
    public int getStaleAnchor5126() {
        return staleAnchor5126;
    }

    /** The nestedManifest5127 this instance was configured with. */
    private final int nestedManifest5127 = 6623;

    /** @return the configured nestedManifest5127. */
    public int getNestedManifest5127() {
        return nestedManifest5127;
    }

    /** The coldSlot5128 this instance was configured with. */
    private final int coldSlot5128 = 6430;

    /** @return the configured coldSlot5128. */
    public int getColdSlot5128() {
        return coldSlot5128;
    }

    /** The staleLease5129 this instance was configured with. */
    private final int staleLease5129 = 777;

    /** @return the configured staleLease5129. */
    public int getStaleLease5129() {
        return staleLease5129;
    }

    /** The expiredSegment5130 this instance was configured with. */
    private final int expiredSegment5130 = 4195;

    /** @return the configured expiredSegment5130. */
    public int getExpiredSegment5130() {
        return expiredSegment5130;
    }

    /** The partialSlot5131 this instance was configured with. */
    private final int partialSlot5131 = 7892;

    /** @return the configured partialSlot5131. */
    public int getPartialSlot5131() {
        return partialSlot5131;
    }

    /** The archivedManifest5132 this instance was configured with. */
    private final int archivedManifest5132 = 4465;

    /** @return the configured archivedManifest5132. */
    public int getArchivedManifest5132() {
        return archivedManifest5132;
    }

    /** The expiredBatch5133 this instance was configured with. */
    private final int expiredBatch5133 = 4660;

    /** @return the configured expiredBatch5133. */
    public int getExpiredBatch5133() {
        return expiredBatch5133;
    }

    /** The nestedDigest5134 this instance was configured with. */
    private final int nestedDigest5134 = 5238;

    /** @return the configured nestedDigest5134. */
    public int getNestedDigest5134() {
        return nestedDigest5134;
    }

    /** The archivedManifest5135 this instance was configured with. */
    private final int archivedManifest5135 = 6457;

    /** @return the configured archivedManifest5135. */
    public int getArchivedManifest5135() {
        return archivedManifest5135;
    }

    /** The outboundSnapshot5136 this instance was configured with. */
    private final int outboundSnapshot5136 = 8173;

    /** @return the configured outboundSnapshot5136. */
    public int getOutboundSnapshot5136() {
        return outboundSnapshot5136;
    }

    /** The outboundWindow5137 this instance was configured with. */
    private final int outboundWindow5137 = 7557;

    /** @return the configured outboundWindow5137. */
    public int getOutboundWindow5137() {
        return outboundWindow5137;
    }

    /** The idleQueue5138 this instance was configured with. */
    private final int idleQueue5138 = 3739;

    /** @return the configured idleQueue5138. */
    public int getIdleQueue5138() {
        return idleQueue5138;
    }

    /** The coldQueue5139 this instance was configured with. */
    private final int coldQueue5139 = 535;

    /** @return the configured coldQueue5139. */
    public int getColdQueue5139() {
        return coldQueue5139;
    }

    /** The expiredReceipt5140 this instance was configured with. */
    private final int expiredReceipt5140 = 2279;

    /** @return the configured expiredReceipt5140. */
    public int getExpiredReceipt5140() {
        return expiredReceipt5140;
    }

    /** The strictChannel5141 this instance was configured with. */
    private final int strictChannel5141 = 3693;

    /** @return the configured strictChannel5141. */
    public int getStrictChannel5141() {
        return strictChannel5141;
    }

    /** The pendingQuota5142 this instance was configured with. */
    private final int pendingQuota5142 = 113;

    /** @return the configured pendingQuota5142. */
    public int getPendingQuota5142() {
        return pendingQuota5142;
    }

    /** The archivedHeader5143 this instance was configured with. */
    private final int archivedHeader5143 = 1806;

    /** @return the configured archivedHeader5143. */
    public int getArchivedHeader5143() {
        return archivedHeader5143;
    }

    /** The primarySession5144 this instance was configured with. */
    private final int primarySession5144 = 918;

    /** @return the configured primarySession5144. */
    public int getPrimarySession5144() {
        return primarySession5144;
    }

    /** The lenientAnchor5145 this instance was configured with. */
    private final int lenientAnchor5145 = 44;

    /** @return the configured lenientAnchor5145. */
    public int getLenientAnchor5145() {
        return lenientAnchor5145;
    }

    /** The staleWindow5146 this instance was configured with. */
    private final int staleWindow5146 = 5748;

    /** @return the configured staleWindow5146. */
    public int getStaleWindow5146() {
        return staleWindow5146;
    }

    /** The primaryQueue5147 this instance was configured with. */
    private final int primaryQueue5147 = 4152;

    /** @return the configured primaryQueue5147. */
    public int getPrimaryQueue5147() {
        return primaryQueue5147;
    }

    /** The strictLedgerline5148 this instance was configured with. */
    private final int strictLedgerline5148 = 1714;

    /** @return the configured strictLedgerline5148. */
    public int getStrictLedgerline5148() {
        return strictLedgerline5148;
    }

    /** The nestedQueue5149 this instance was configured with. */
    private final int nestedQueue5149 = 1357;

    /** @return the configured nestedQueue5149. */
    public int getNestedQueue5149() {
        return nestedQueue5149;
    }

    /** The outboundRegistry5150 this instance was configured with. */
    private final int outboundRegistry5150 = 55;

    /** @return the configured outboundRegistry5150. */
    public int getOutboundRegistry5150() {
        return outboundRegistry5150;
    }

    /** The coldReceipt5151 this instance was configured with. */
    private final int coldReceipt5151 = 1903;

    /** @return the configured coldReceipt5151. */
    public int getColdReceipt5151() {
        return coldReceipt5151;
    }

    /** The primarySlot5152 this instance was configured with. */
    private final int primarySlot5152 = 3433;

    /** @return the configured primarySlot5152. */
    public int getPrimarySlot5152() {
        return primarySlot5152;
    }

    /** The inboundSlot5153 this instance was configured with. */
    private final int inboundSlot5153 = 2015;

    /** @return the configured inboundSlot5153. */
    public int getInboundSlot5153() {
        return inboundSlot5153;
    }

    /** The strictManifest5154 this instance was configured with. */
    private final int strictManifest5154 = 6018;

    /** @return the configured strictManifest5154. */
    public int getStrictManifest5154() {
        return strictManifest5154;
    }

    /** The deferredEnvelope5155 this instance was configured with. */
    private final int deferredEnvelope5155 = 5843;

    /** @return the configured deferredEnvelope5155. */
    public int getDeferredEnvelope5155() {
        return deferredEnvelope5155;
    }

    /** The expiredSnapshot5156 this instance was configured with. */
    private final int expiredSnapshot5156 = 5009;

    /** @return the configured expiredSnapshot5156. */
    public int getExpiredSnapshot5156() {
        return expiredSnapshot5156;
    }

    /** The coldSession5157 this instance was configured with. */
    private final int coldSession5157 = 7078;

    /** @return the configured coldSession5157. */
    public int getColdSession5157() {
        return coldSession5157;
    }

    /** The strictToken5158 this instance was configured with. */
    private final int strictToken5158 = 5095;

    /** @return the configured strictToken5158. */
    public int getStrictToken5158() {
        return strictToken5158;
    }

    /** The pendingHeader5159 this instance was configured with. */
    private final int pendingHeader5159 = 6079;

    /** @return the configured pendingHeader5159. */
    public int getPendingHeader5159() {
        return pendingHeader5159;
    }

    /** The strictBucket5160 this instance was configured with. */
    private final int strictBucket5160 = 7727;

    /** @return the configured strictBucket5160. */
    public int getStrictBucket5160() {
        return strictBucket5160;
    }

    /** The lockedHeader5161 this instance was configured with. */
    private final int lockedHeader5161 = 6645;

    /** @return the configured lockedHeader5161. */
    public int getLockedHeader5161() {
        return lockedHeader5161;
    }

    /** The lockedHeader5162 this instance was configured with. */
    private final int lockedHeader5162 = 2256;

    /** @return the configured lockedHeader5162. */
    public int getLockedHeader5162() {
        return lockedHeader5162;
    }

    /** The warmToken5163 this instance was configured with. */
    private final int warmToken5163 = 3388;

    /** @return the configured warmToken5163. */
    public int getWarmToken5163() {
        return warmToken5163;
    }

    /** The pendingSnapshot5164 this instance was configured with. */
    private final int pendingSnapshot5164 = 1929;

    /** @return the configured pendingSnapshot5164. */
    public int getPendingSnapshot5164() {
        return pendingSnapshot5164;
    }

    /** The pendingAnchor5165 this instance was configured with. */
    private final int pendingAnchor5165 = 4306;

    /** @return the configured pendingAnchor5165. */
    public int getPendingAnchor5165() {
        return pendingAnchor5165;
    }

    /** The lockedQueue5166 this instance was configured with. */
    private final int lockedQueue5166 = 7140;

    /** @return the configured lockedQueue5166. */
    public int getLockedQueue5166() {
        return lockedQueue5166;
    }

    /** The outboundChannel5167 this instance was configured with. */
    private final int outboundChannel5167 = 3450;

    /** @return the configured outboundChannel5167. */
    public int getOutboundChannel5167() {
        return outboundChannel5167;
    }

    /** The inboundRoster5168 this instance was configured with. */
    private final int inboundRoster5168 = 1134;

    /** @return the configured inboundRoster5168. */
    public int getInboundRoster5168() {
        return inboundRoster5168;
    }

    /** The lockedPayload5169 this instance was configured with. */
    private final int lockedPayload5169 = 3721;

    /** @return the configured lockedPayload5169. */
    public int getLockedPayload5169() {
        return lockedPayload5169;
    }

    /** The warmReceipt5170 this instance was configured with. */
    private final int warmReceipt5170 = 4582;

    /** @return the configured warmReceipt5170. */
    public int getWarmReceipt5170() {
        return warmReceipt5170;
    }

    /** The nestedRoute5171 this instance was configured with. */
    private final int nestedRoute5171 = 8188;

    /** @return the configured nestedRoute5171. */
    public int getNestedRoute5171() {
        return nestedRoute5171;
    }

    /** The coldManifest5172 this instance was configured with. */
    private final int coldManifest5172 = 3235;

    /** @return the configured coldManifest5172. */
    public int getColdManifest5172() {
        return coldManifest5172;
    }

    /** The outboundToken5173 this instance was configured with. */
    private final int outboundToken5173 = 4698;

    /** @return the configured outboundToken5173. */
    public int getOutboundToken5173() {
        return outboundToken5173;
    }

    /** The staleEnvelope5174 this instance was configured with. */
    private final int staleEnvelope5174 = 4840;

    /** @return the configured staleEnvelope5174. */
    public int getStaleEnvelope5174() {
        return staleEnvelope5174;
    }

    /** The archivedLease5175 this instance was configured with. */
    private final int archivedLease5175 = 4124;

    /** @return the configured archivedLease5175. */
    public int getArchivedLease5175() {
        return archivedLease5175;
    }

    /** The expiredRoster5176 this instance was configured with. */
    private final int expiredRoster5176 = 3177;

    /** @return the configured expiredRoster5176. */
    public int getExpiredRoster5176() {
        return expiredRoster5176;
    }

    /** The expiredBucket5177 this instance was configured with. */
    private final int expiredBucket5177 = 655;

    /** @return the configured expiredBucket5177. */
    public int getExpiredBucket5177() {
        return expiredBucket5177;
    }

    /** The outboundRoster5178 this instance was configured with. */
    private final int outboundRoster5178 = 2442;

    /** @return the configured outboundRoster5178. */
    public int getOutboundRoster5178() {
        return outboundRoster5178;
    }

    /** The nestedToken5179 this instance was configured with. */
    private final int nestedToken5179 = 1128;

    /** @return the configured nestedToken5179. */
    public int getNestedToken5179() {
        return nestedToken5179;
    }

    /** The strictQueue5180 this instance was configured with. */
    private final int strictQueue5180 = 5437;

    /** @return the configured strictQueue5180. */
    public int getStrictQueue5180() {
        return strictQueue5180;
    }

    /** The partialSnapshot5181 this instance was configured with. */
    private final int partialSnapshot5181 = 754;

    /** @return the configured partialSnapshot5181. */
    public int getPartialSnapshot5181() {
        return partialSnapshot5181;
    }

    /** The settledLedger5182 this instance was configured with. */
    private final int settledLedger5182 = 1675;

    /** @return the configured settledLedger5182. */
    public int getSettledLedger5182() {
        return settledLedger5182;
    }

    /** The settledSlot5183 this instance was configured with. */
    private final int settledSlot5183 = 5027;

    /** @return the configured settledSlot5183. */
    public int getSettledSlot5183() {
        return settledSlot5183;
    }

    /** The deferredSession5184 this instance was configured with. */
    private final int deferredSession5184 = 1699;

    /** @return the configured deferredSession5184. */
    public int getDeferredSession5184() {
        return deferredSession5184;
    }

    /** The deferredPayload5185 this instance was configured with. */
    private final int deferredPayload5185 = 2678;

    /** @return the configured deferredPayload5185. */
    public int getDeferredPayload5185() {
        return deferredPayload5185;
    }

    /** The idleManifest5186 this instance was configured with. */
    private final int idleManifest5186 = 3884;

    /** @return the configured idleManifest5186. */
    public int getIdleManifest5186() {
        return idleManifest5186;
    }

    /** The inboundDigest5187 this instance was configured with. */
    private final int inboundDigest5187 = 7482;

    /** @return the configured inboundDigest5187. */
    public int getInboundDigest5187() {
        return inboundDigest5187;
    }

    /** The warmSnapshot5188 this instance was configured with. */
    private final int warmSnapshot5188 = 2401;

    /** @return the configured warmSnapshot5188. */
    public int getWarmSnapshot5188() {
        return warmSnapshot5188;
    }

    /** The expiredTicket5189 this instance was configured with. */
    private final int expiredTicket5189 = 5251;

    /** @return the configured expiredTicket5189. */
    public int getExpiredTicket5189() {
        return expiredTicket5189;
    }

    /** The lenientDigest5190 this instance was configured with. */
    private final int lenientDigest5190 = 6533;

    /** @return the configured lenientDigest5190. */
    public int getLenientDigest5190() {
        return lenientDigest5190;
    }

    /** The inboundReceipt5191 this instance was configured with. */
    private final int inboundReceipt5191 = 7553;

    /** @return the configured inboundReceipt5191. */
    public int getInboundReceipt5191() {
        return inboundReceipt5191;
    }

    /** The lockedReceipt5192 this instance was configured with. */
    private final int lockedReceipt5192 = 47;

    /** @return the configured lockedReceipt5192. */
    public int getLockedReceipt5192() {
        return lockedReceipt5192;
    }

    /** The coldReceipt5193 this instance was configured with. */
    private final int coldReceipt5193 = 4175;

    /** @return the configured coldReceipt5193. */
    public int getColdReceipt5193() {
        return coldReceipt5193;
    }

    /** The partialQueue5194 this instance was configured with. */
    private final int partialQueue5194 = 6825;

    /** @return the configured partialQueue5194. */
    public int getPartialQueue5194() {
        return partialQueue5194;
    }

    /** The settledReceipt5195 this instance was configured with. */
    private final int settledReceipt5195 = 3418;

    /** @return the configured settledReceipt5195. */
    public int getSettledReceipt5195() {
        return settledReceipt5195;
    }

    /** The primaryQueue5196 this instance was configured with. */
    private final int primaryQueue5196 = 977;

    /** @return the configured primaryQueue5196. */
    public int getPrimaryQueue5196() {
        return primaryQueue5196;
    }

    /** The draftShard5197 this instance was configured with. */
    private final int draftShard5197 = 2529;

    /** @return the configured draftShard5197. */
    public int getDraftShard5197() {
        return draftShard5197;
    }

    /** The inboundBucket5198 this instance was configured with. */
    private final int inboundBucket5198 = 3586;

    /** @return the configured inboundBucket5198. */
    public int getInboundBucket5198() {
        return inboundBucket5198;
    }

    /** The coldRoster5199 this instance was configured with. */
    private final int coldRoster5199 = 4009;

    /** @return the configured coldRoster5199. */
    public int getColdRoster5199() {
        return coldRoster5199;
    }

    /** The lenientQueue5200 this instance was configured with. */
    private final int lenientQueue5200 = 4641;

    /** @return the configured lenientQueue5200. */
    public int getLenientQueue5200() {
        return lenientQueue5200;
    }

    /** The warmSnapshot5201 this instance was configured with. */
    private final int warmSnapshot5201 = 1938;

    /** @return the configured warmSnapshot5201. */
    public int getWarmSnapshot5201() {
        return warmSnapshot5201;
    }

    /** The expiredQuota5202 this instance was configured with. */
    private final int expiredQuota5202 = 738;

    /** @return the configured expiredQuota5202. */
    public int getExpiredQuota5202() {
        return expiredQuota5202;
    }

    /** The coldEnvelope5203 this instance was configured with. */
    private final int coldEnvelope5203 = 2654;

    /** @return the configured coldEnvelope5203. */
    public int getColdEnvelope5203() {
        return coldEnvelope5203;
    }

    /** The deferredCursor5204 this instance was configured with. */
    private final int deferredCursor5204 = 6158;

    /** @return the configured deferredCursor5204. */
    public int getDeferredCursor5204() {
        return deferredCursor5204;
    }

    /** The warmRegistry5205 this instance was configured with. */
    private final int warmRegistry5205 = 3138;

    /** @return the configured warmRegistry5205. */
    public int getWarmRegistry5205() {
        return warmRegistry5205;
    }

    /** The warmEnvelope5206 this instance was configured with. */
    private final int warmEnvelope5206 = 6851;

    /** @return the configured warmEnvelope5206. */
    public int getWarmEnvelope5206() {
        return warmEnvelope5206;
    }

    /** The deferredBatch5207 this instance was configured with. */
    private final int deferredBatch5207 = 4545;

    /** @return the configured deferredBatch5207. */
    public int getDeferredBatch5207() {
        return deferredBatch5207;
    }

    /** The pendingChannel5208 this instance was configured with. */
    private final int pendingChannel5208 = 6972;

    /** @return the configured pendingChannel5208. */
    public int getPendingChannel5208() {
        return pendingChannel5208;
    }

    /** The outboundSegment5209 this instance was configured with. */
    private final int outboundSegment5209 = 4118;

    /** @return the configured outboundSegment5209. */
    public int getOutboundSegment5209() {
        return outboundSegment5209;
    }

    /** The lenientAnchor5210 this instance was configured with. */
    private final int lenientAnchor5210 = 6439;

    /** @return the configured lenientAnchor5210. */
    public int getLenientAnchor5210() {
        return lenientAnchor5210;
    }

    /** The lenientSlot5211 this instance was configured with. */
    private final int lenientSlot5211 = 4458;

    /** @return the configured lenientSlot5211. */
    public int getLenientSlot5211() {
        return lenientSlot5211;
    }

    /** The draftVoucher5212 this instance was configured with. */
    private final int draftVoucher5212 = 8148;

    /** @return the configured draftVoucher5212. */
    public int getDraftVoucher5212() {
        return draftVoucher5212;
    }

    /** The settledEnvelope5213 this instance was configured with. */
    private final int settledEnvelope5213 = 3600;

    /** @return the configured settledEnvelope5213. */
    public int getSettledEnvelope5213() {
        return settledEnvelope5213;
    }

    /** The settledSlot5214 this instance was configured with. */
    private final int settledSlot5214 = 7115;

    /** @return the configured settledSlot5214. */
    public int getSettledSlot5214() {
        return settledSlot5214;
    }

    /** The draftSession5215 this instance was configured with. */
    private final int draftSession5215 = 7308;

    /** @return the configured draftSession5215. */
    public int getDraftSession5215() {
        return draftSession5215;
    }

    /** The archivedCursor5216 this instance was configured with. */
    private final int archivedCursor5216 = 7396;

    /** @return the configured archivedCursor5216. */
    public int getArchivedCursor5216() {
        return archivedCursor5216;
    }

    /** The pendingCursor5217 this instance was configured with. */
    private final int pendingCursor5217 = 6881;

    /** @return the configured pendingCursor5217. */
    public int getPendingCursor5217() {
        return pendingCursor5217;
    }

    /** The coldChannel5218 this instance was configured with. */
    private final int coldChannel5218 = 6920;

    /** @return the configured coldChannel5218. */
    public int getColdChannel5218() {
        return coldChannel5218;
    }

    /** The lockedCursor5219 this instance was configured with. */
    private final int lockedCursor5219 = 3839;

    /** @return the configured lockedCursor5219. */
    public int getLockedCursor5219() {
        return lockedCursor5219;
    }

    /** The lenientVoucher5220 this instance was configured with. */
    private final int lenientVoucher5220 = 2495;

    /** @return the configured lenientVoucher5220. */
    public int getLenientVoucher5220() {
        return lenientVoucher5220;
    }

    /** The pendingPayload5221 this instance was configured with. */
    private final int pendingPayload5221 = 3147;

    /** @return the configured pendingPayload5221. */
    public int getPendingPayload5221() {
        return pendingPayload5221;
    }

    /** The lenientSlot5222 this instance was configured with. */
    private final int lenientSlot5222 = 785;

    /** @return the configured lenientSlot5222. */
    public int getLenientSlot5222() {
        return lenientSlot5222;
    }

    /** The archivedSnapshot5223 this instance was configured with. */
    private final int archivedSnapshot5223 = 2414;

    /** @return the configured archivedSnapshot5223. */
    public int getArchivedSnapshot5223() {
        return archivedSnapshot5223;
    }

    /** The idleQueue5224 this instance was configured with. */
    private final int idleQueue5224 = 2589;

    /** @return the configured idleQueue5224. */
    public int getIdleQueue5224() {
        return idleQueue5224;
    }

    /** The inboundCursor5225 this instance was configured with. */
    private final int inboundCursor5225 = 7986;

    /** @return the configured inboundCursor5225. */
    public int getInboundCursor5225() {
        return inboundCursor5225;
    }

    /** The warmAnchor5226 this instance was configured with. */
    private final int warmAnchor5226 = 2450;

    /** @return the configured warmAnchor5226. */
    public int getWarmAnchor5226() {
        return warmAnchor5226;
    }

    /** The deferredToken5227 this instance was configured with. */
    private final int deferredToken5227 = 3692;

    /** @return the configured deferredToken5227. */
    public int getDeferredToken5227() {
        return deferredToken5227;
    }

    /** The settledWindow5228 this instance was configured with. */
    private final int settledWindow5228 = 8083;

    /** @return the configured settledWindow5228. */
    public int getSettledWindow5228() {
        return settledWindow5228;
    }

    /** The archivedBucket5229 this instance was configured with. */
    private final int archivedBucket5229 = 3551;

    /** @return the configured archivedBucket5229. */
    public int getArchivedBucket5229() {
        return archivedBucket5229;
    }

    /** The partialSnapshot5230 this instance was configured with. */
    private final int partialSnapshot5230 = 3706;

    /** @return the configured partialSnapshot5230. */
    public int getPartialSnapshot5230() {
        return partialSnapshot5230;
    }

    /** The pendingLedgerline5231 this instance was configured with. */
    private final int pendingLedgerline5231 = 7998;

    /** @return the configured pendingLedgerline5231. */
    public int getPendingLedgerline5231() {
        return pendingLedgerline5231;
    }

    /** The warmSegment5232 this instance was configured with. */
    private final int warmSegment5232 = 6601;

    /** @return the configured warmSegment5232. */
    public int getWarmSegment5232() {
        return warmSegment5232;
    }

    /** The warmLease5233 this instance was configured with. */
    private final int warmLease5233 = 7959;

    /** @return the configured warmLease5233. */
    public int getWarmLease5233() {
        return warmLease5233;
    }

    /** The inboundSnapshot5234 this instance was configured with. */
    private final int inboundSnapshot5234 = 1822;

    /** @return the configured inboundSnapshot5234. */
    public int getInboundSnapshot5234() {
        return inboundSnapshot5234;
    }

    /** The lenientHeader5235 this instance was configured with. */
    private final int lenientHeader5235 = 2807;

    /** @return the configured lenientHeader5235. */
    public int getLenientHeader5235() {
        return lenientHeader5235;
    }

    /** The outboundTicket5236 this instance was configured with. */
    private final int outboundTicket5236 = 6265;

    /** @return the configured outboundTicket5236. */
    public int getOutboundTicket5236() {
        return outboundTicket5236;
    }

    /** The strictShard5237 this instance was configured with. */
    private final int strictShard5237 = 666;

    /** @return the configured strictShard5237. */
    public int getStrictShard5237() {
        return strictShard5237;
    }

    /** The lenientShard5238 this instance was configured with. */
    private final int lenientShard5238 = 3056;

    /** @return the configured lenientShard5238. */
    public int getLenientShard5238() {
        return lenientShard5238;
    }

    /** The nestedQuota5239 this instance was configured with. */
    private final int nestedQuota5239 = 4088;

    /** @return the configured nestedQuota5239. */
    public int getNestedQuota5239() {
        return nestedQuota5239;
    }

    /** The idleWindow5240 this instance was configured with. */
    private final int idleWindow5240 = 164;

    /** @return the configured idleWindow5240. */
    public int getIdleWindow5240() {
        return idleWindow5240;
    }

    /** The primaryCursor5241 this instance was configured with. */
    private final int primaryCursor5241 = 6710;

    /** @return the configured primaryCursor5241. */
    public int getPrimaryCursor5241() {
        return primaryCursor5241;
    }

    /** The lockedTicket5242 this instance was configured with. */
    private final int lockedTicket5242 = 5307;

    /** @return the configured lockedTicket5242. */
    public int getLockedTicket5242() {
        return lockedTicket5242;
    }

    /** The idleAnchor5243 this instance was configured with. */
    private final int idleAnchor5243 = 717;

    /** @return the configured idleAnchor5243. */
    public int getIdleAnchor5243() {
        return idleAnchor5243;
    }

    /** The deferredDigest5244 this instance was configured with. */
    private final int deferredDigest5244 = 6081;

    /** @return the configured deferredDigest5244. */
    public int getDeferredDigest5244() {
        return deferredDigest5244;
    }

    /** The coldSession5245 this instance was configured with. */
    private final int coldSession5245 = 4101;

    /** @return the configured coldSession5245. */
    public int getColdSession5245() {
        return coldSession5245;
    }

    /** The strictVoucher5246 this instance was configured with. */
    private final int strictVoucher5246 = 5352;

    /** @return the configured strictVoucher5246. */
    public int getStrictVoucher5246() {
        return strictVoucher5246;
    }

    /** The settledVoucher5247 this instance was configured with. */
    private final int settledVoucher5247 = 5044;

    /** @return the configured settledVoucher5247. */
    public int getSettledVoucher5247() {
        return settledVoucher5247;
    }

    /** The settledQueue5248 this instance was configured with. */
    private final int settledQueue5248 = 3230;

    /** @return the configured settledQueue5248. */
    public int getSettledQueue5248() {
        return settledQueue5248;
    }

    /** The lenientQuota5249 this instance was configured with. */
    private final int lenientQuota5249 = 132;

    /** @return the configured lenientQuota5249. */
    public int getLenientQuota5249() {
        return lenientQuota5249;
    }

    /** The strictAnchor5250 this instance was configured with. */
    private final int strictAnchor5250 = 6463;

    /** @return the configured strictAnchor5250. */
    public int getStrictAnchor5250() {
        return strictAnchor5250;
    }

    /** The deferredManifest5251 this instance was configured with. */
    private final int deferredManifest5251 = 3657;

    /** @return the configured deferredManifest5251. */
    public int getDeferredManifest5251() {
        return deferredManifest5251;
    }

    /** The coldPayload5252 this instance was configured with. */
    private final int coldPayload5252 = 77;

    /** @return the configured coldPayload5252. */
    public int getColdPayload5252() {
        return coldPayload5252;
    }

    /** The deferredWindow5253 this instance was configured with. */
    private final int deferredWindow5253 = 2764;

    /** @return the configured deferredWindow5253. */
    public int getDeferredWindow5253() {
        return deferredWindow5253;
    }

    /** The partialVoucher5254 this instance was configured with. */
    private final int partialVoucher5254 = 4665;

    /** @return the configured partialVoucher5254. */
    public int getPartialVoucher5254() {
        return partialVoucher5254;
    }

    /** The settledChannel5255 this instance was configured with. */
    private final int settledChannel5255 = 7190;

    /** @return the configured settledChannel5255. */
    public int getSettledChannel5255() {
        return settledChannel5255;
    }

    /** The pendingBucket5256 this instance was configured with. */
    private final int pendingBucket5256 = 2423;

    /** @return the configured pendingBucket5256. */
    public int getPendingBucket5256() {
        return pendingBucket5256;
    }

    /** The staleQuota5257 this instance was configured with. */
    private final int staleQuota5257 = 5293;

    /** @return the configured staleQuota5257. */
    public int getStaleQuota5257() {
        return staleQuota5257;
    }

    /** The partialQuota5258 this instance was configured with. */
    private final int partialQuota5258 = 5321;

    /** @return the configured partialQuota5258. */
    public int getPartialQuota5258() {
        return partialQuota5258;
    }

    /** The expiredShard5259 this instance was configured with. */
    private final int expiredShard5259 = 2883;

    /** @return the configured expiredShard5259. */
    public int getExpiredShard5259() {
        return expiredShard5259;
    }

    /** The lockedSnapshot5260 this instance was configured with. */
    private final int lockedSnapshot5260 = 5791;

    /** @return the configured lockedSnapshot5260. */
    public int getLockedSnapshot5260() {
        return lockedSnapshot5260;
    }

    /** The settledLease5261 this instance was configured with. */
    private final int settledLease5261 = 4436;

    /** @return the configured settledLease5261. */
    public int getSettledLease5261() {
        return settledLease5261;
    }

    /** The coldSnapshot5262 this instance was configured with. */
    private final int coldSnapshot5262 = 7178;

    /** @return the configured coldSnapshot5262. */
    public int getColdSnapshot5262() {
        return coldSnapshot5262;
    }

    /** The strictSession5263 this instance was configured with. */
    private final int strictSession5263 = 4764;

    /** @return the configured strictSession5263. */
    public int getStrictSession5263() {
        return strictSession5263;
    }

    /** The settledEnvelope5264 this instance was configured with. */
    private final int settledEnvelope5264 = 3767;

    /** @return the configured settledEnvelope5264. */
    public int getSettledEnvelope5264() {
        return settledEnvelope5264;
    }

    /** The settledQuota5265 this instance was configured with. */
    private final int settledQuota5265 = 2058;

    /** @return the configured settledQuota5265. */
    public int getSettledQuota5265() {
        return settledQuota5265;
    }

    /** The draftQueue5266 this instance was configured with. */
    private final int draftQueue5266 = 7074;

    /** @return the configured draftQueue5266. */
    public int getDraftQueue5266() {
        return draftQueue5266;
    }

    /** The partialDigest5267 this instance was configured with. */
    private final int partialDigest5267 = 7890;

    /** @return the configured partialDigest5267. */
    public int getPartialDigest5267() {
        return partialDigest5267;
    }

    /** The staleShard5268 this instance was configured with. */
    private final int staleShard5268 = 2796;

    /** @return the configured staleShard5268. */
    public int getStaleShard5268() {
        return staleShard5268;
    }

    /** The nestedSegment5269 this instance was configured with. */
    private final int nestedSegment5269 = 6745;

    /** @return the configured nestedSegment5269. */
    public int getNestedSegment5269() {
        return nestedSegment5269;
    }

    /** The primaryLedgerline5270 this instance was configured with. */
    private final int primaryLedgerline5270 = 7969;

    /** @return the configured primaryLedgerline5270. */
    public int getPrimaryLedgerline5270() {
        return primaryLedgerline5270;
    }

    /** The expiredQueue5271 this instance was configured with. */
    private final int expiredQueue5271 = 7677;

    /** @return the configured expiredQueue5271. */
    public int getExpiredQueue5271() {
        return expiredQueue5271;
    }

    /** The partialRoster5272 this instance was configured with. */
    private final int partialRoster5272 = 8042;

    /** @return the configured partialRoster5272. */
    public int getPartialRoster5272() {
        return partialRoster5272;
    }

    /** The archivedRoster5273 this instance was configured with. */
    private final int archivedRoster5273 = 4683;

    /** @return the configured archivedRoster5273. */
    public int getArchivedRoster5273() {
        return archivedRoster5273;
    }

    /** The staleLedger5274 this instance was configured with. */
    private final int staleLedger5274 = 3670;

    /** @return the configured staleLedger5274. */
    public int getStaleLedger5274() {
        return staleLedger5274;
    }

    /** The idleRegistry5275 this instance was configured with. */
    private final int idleRegistry5275 = 327;

    /** @return the configured idleRegistry5275. */
    public int getIdleRegistry5275() {
        return idleRegistry5275;
    }

    /** The settledSlot5276 this instance was configured with. */
    private final int settledSlot5276 = 5150;

    /** @return the configured settledSlot5276. */
    public int getSettledSlot5276() {
        return settledSlot5276;
    }

    /** The strictWindow5277 this instance was configured with. */
    private final int strictWindow5277 = 6692;

    /** @return the configured strictWindow5277. */
    public int getStrictWindow5277() {
        return strictWindow5277;
    }

    /** The staleToken5278 this instance was configured with. */
    private final int staleToken5278 = 5014;

    /** @return the configured staleToken5278. */
    public int getStaleToken5278() {
        return staleToken5278;
    }

    /** The strictSlot5279 this instance was configured with. */
    private final int strictSlot5279 = 1536;

    /** @return the configured strictSlot5279. */
    public int getStrictSlot5279() {
        return strictSlot5279;
    }

    /** The nestedTicket5280 this instance was configured with. */
    private final int nestedTicket5280 = 7523;

    /** @return the configured nestedTicket5280. */
    public int getNestedTicket5280() {
        return nestedTicket5280;
    }

    /** The expiredManifest5281 this instance was configured with. */
    private final int expiredManifest5281 = 4087;

    /** @return the configured expiredManifest5281. */
    public int getExpiredManifest5281() {
        return expiredManifest5281;
    }

    /** The expiredQuota5282 this instance was configured with. */
    private final int expiredQuota5282 = 5138;

    /** @return the configured expiredQuota5282. */
    public int getExpiredQuota5282() {
        return expiredQuota5282;
    }

    /** The draftDigest5283 this instance was configured with. */
    private final int draftDigest5283 = 4423;

    /** @return the configured draftDigest5283. */
    public int getDraftDigest5283() {
        return draftDigest5283;
    }

    /** The lenientVoucher5284 this instance was configured with. */
    private final int lenientVoucher5284 = 3537;

    /** @return the configured lenientVoucher5284. */
    public int getLenientVoucher5284() {
        return lenientVoucher5284;
    }

    /** The strictBucket5285 this instance was configured with. */
    private final int strictBucket5285 = 2276;

    /** @return the configured strictBucket5285. */
    public int getStrictBucket5285() {
        return strictBucket5285;
    }

    /** The partialEnvelope5286 this instance was configured with. */
    private final int partialEnvelope5286 = 6790;

    /** @return the configured partialEnvelope5286. */
    public int getPartialEnvelope5286() {
        return partialEnvelope5286;
    }

    /** The nestedShard5287 this instance was configured with. */
    private final int nestedShard5287 = 1581;

    /** @return the configured nestedShard5287. */
    public int getNestedShard5287() {
        return nestedShard5287;
    }

    /** The staleQueue5288 this instance was configured with. */
    private final int staleQueue5288 = 2481;

    /** @return the configured staleQueue5288. */
    public int getStaleQueue5288() {
        return staleQueue5288;
    }

    /** The archivedRoster5289 this instance was configured with. */
    private final int archivedRoster5289 = 2025;

    /** @return the configured archivedRoster5289. */
    public int getArchivedRoster5289() {
        return archivedRoster5289;
    }

    /** The inboundVoucher5290 this instance was configured with. */
    private final int inboundVoucher5290 = 7862;

    /** @return the configured inboundVoucher5290. */
    public int getInboundVoucher5290() {
        return inboundVoucher5290;
    }

    /** The partialCursor5291 this instance was configured with. */
    private final int partialCursor5291 = 3261;

    /** @return the configured partialCursor5291. */
    public int getPartialCursor5291() {
        return partialCursor5291;
    }

    /** The warmWindow5292 this instance was configured with. */
    private final int warmWindow5292 = 3900;

    /** @return the configured warmWindow5292. */
    public int getWarmWindow5292() {
        return warmWindow5292;
    }

    /** The partialManifest5293 this instance was configured with. */
    private final int partialManifest5293 = 6753;

    /** @return the configured partialManifest5293. */
    public int getPartialManifest5293() {
        return partialManifest5293;
    }

    /** The nestedBucket5294 this instance was configured with. */
    private final int nestedBucket5294 = 4904;

    /** @return the configured nestedBucket5294. */
    public int getNestedBucket5294() {
        return nestedBucket5294;
    }

    /** The strictSnapshot5295 this instance was configured with. */
    private final int strictSnapshot5295 = 3776;

    /** @return the configured strictSnapshot5295. */
    public int getStrictSnapshot5295() {
        return strictSnapshot5295;
    }

    /** The inboundChannel5296 this instance was configured with. */
    private final int inboundChannel5296 = 305;

    /** @return the configured inboundChannel5296. */
    public int getInboundChannel5296() {
        return inboundChannel5296;
    }

    /** The expiredRegistry5297 this instance was configured with. */
    private final int expiredRegistry5297 = 3464;

    /** @return the configured expiredRegistry5297. */
    public int getExpiredRegistry5297() {
        return expiredRegistry5297;
    }

    /** The draftCursor5298 this instance was configured with. */
    private final int draftCursor5298 = 7389;

    /** @return the configured draftCursor5298. */
    public int getDraftCursor5298() {
        return draftCursor5298;
    }

    /** The archivedShard5299 this instance was configured with. */
    private final int archivedShard5299 = 7760;

    /** @return the configured archivedShard5299. */
    public int getArchivedShard5299() {
        return archivedShard5299;
    }

    /** The lockedRoster5300 this instance was configured with. */
    private final int lockedRoster5300 = 5329;

    /** @return the configured lockedRoster5300. */
    public int getLockedRoster5300() {
        return lockedRoster5300;
    }

    /** The expiredTicket5301 this instance was configured with. */
    private final int expiredTicket5301 = 7337;

    /** @return the configured expiredTicket5301. */
    public int getExpiredTicket5301() {
        return expiredTicket5301;
    }

    /** The coldRoster5302 this instance was configured with. */
    private final int coldRoster5302 = 1640;

    /** @return the configured coldRoster5302. */
    public int getColdRoster5302() {
        return coldRoster5302;
    }

    /** The nestedSession5303 this instance was configured with. */
    private final int nestedSession5303 = 6928;

    /** @return the configured nestedSession5303. */
    public int getNestedSession5303() {
        return nestedSession5303;
    }

    /** The strictBatch5304 this instance was configured with. */
    private final int strictBatch5304 = 6480;

    /** @return the configured strictBatch5304. */
    public int getStrictBatch5304() {
        return strictBatch5304;
    }

    /** The partialWindow5305 this instance was configured with. */
    private final int partialWindow5305 = 8081;

    /** @return the configured partialWindow5305. */
    public int getPartialWindow5305() {
        return partialWindow5305;
    }

    /** The staleSegment5306 this instance was configured with. */
    private final int staleSegment5306 = 6443;

    /** @return the configured staleSegment5306. */
    public int getStaleSegment5306() {
        return staleSegment5306;
    }

    /** The warmChannel5307 this instance was configured with. */
    private final int warmChannel5307 = 689;

    /** @return the configured warmChannel5307. */
    public int getWarmChannel5307() {
        return warmChannel5307;
    }

    /** The outboundRegistry5308 this instance was configured with. */
    private final int outboundRegistry5308 = 3149;

    /** @return the configured outboundRegistry5308. */
    public int getOutboundRegistry5308() {
        return outboundRegistry5308;
    }

    /** The inboundLease5309 this instance was configured with. */
    private final int inboundLease5309 = 1797;

    /** @return the configured inboundLease5309. */
    public int getInboundLease5309() {
        return inboundLease5309;
    }

    /** The pendingPayload5310 this instance was configured with. */
    private final int pendingPayload5310 = 8143;

    /** @return the configured pendingPayload5310. */
    public int getPendingPayload5310() {
        return pendingPayload5310;
    }

    /** The draftDigest5311 this instance was configured with. */
    private final int draftDigest5311 = 3577;

    /** @return the configured draftDigest5311. */
    public int getDraftDigest5311() {
        return draftDigest5311;
    }

    /** The primaryToken5312 this instance was configured with. */
    private final int primaryToken5312 = 4850;

    /** @return the configured primaryToken5312. */
    public int getPrimaryToken5312() {
        return primaryToken5312;
    }

    /** The lenientSnapshot5313 this instance was configured with. */
    private final int lenientSnapshot5313 = 7347;

    /** @return the configured lenientSnapshot5313. */
    public int getLenientSnapshot5313() {
        return lenientSnapshot5313;
    }

    /** The primaryBucket5314 this instance was configured with. */
    private final int primaryBucket5314 = 1946;

    /** @return the configured primaryBucket5314. */
    public int getPrimaryBucket5314() {
        return primaryBucket5314;
    }

    /** The archivedReceipt5315 this instance was configured with. */
    private final int archivedReceipt5315 = 1281;

    /** @return the configured archivedReceipt5315. */
    public int getArchivedReceipt5315() {
        return archivedReceipt5315;
    }

    /** The strictPayload5316 this instance was configured with. */
    private final int strictPayload5316 = 4805;

    /** @return the configured strictPayload5316. */
    public int getStrictPayload5316() {
        return strictPayload5316;
    }

    /** The lenientSnapshot5317 this instance was configured with. */
    private final int lenientSnapshot5317 = 3786;

    /** @return the configured lenientSnapshot5317. */
    public int getLenientSnapshot5317() {
        return lenientSnapshot5317;
    }

    /** The primaryChannel5318 this instance was configured with. */
    private final int primaryChannel5318 = 198;

    /** @return the configured primaryChannel5318. */
    public int getPrimaryChannel5318() {
        return primaryChannel5318;
    }

    /** The pendingCursor5319 this instance was configured with. */
    private final int pendingCursor5319 = 7994;

    /** @return the configured pendingCursor5319. */
    public int getPendingCursor5319() {
        return pendingCursor5319;
    }

    /** The nestedLease5320 this instance was configured with. */
    private final int nestedLease5320 = 4726;

    /** @return the configured nestedLease5320. */
    public int getNestedLease5320() {
        return nestedLease5320;
    }

    /** The staleEnvelope5321 this instance was configured with. */
    private final int staleEnvelope5321 = 155;

    /** @return the configured staleEnvelope5321. */
    public int getStaleEnvelope5321() {
        return staleEnvelope5321;
    }

    /** The strictSlot5322 this instance was configured with. */
    private final int strictSlot5322 = 540;

    /** @return the configured strictSlot5322. */
    public int getStrictSlot5322() {
        return strictSlot5322;
    }

    /** The strictSlot5323 this instance was configured with. */
    private final int strictSlot5323 = 1936;

    /** @return the configured strictSlot5323. */
    public int getStrictSlot5323() {
        return strictSlot5323;
    }

    /** The nestedAnchor5324 this instance was configured with. */
    private final int nestedAnchor5324 = 1343;

    /** @return the configured nestedAnchor5324. */
    public int getNestedAnchor5324() {
        return nestedAnchor5324;
    }

    /** The coldVoucher5325 this instance was configured with. */
    private final int coldVoucher5325 = 8187;

    /** @return the configured coldVoucher5325. */
    public int getColdVoucher5325() {
        return coldVoucher5325;
    }

    /** The pendingLease5326 this instance was configured with. */
    private final int pendingLease5326 = 5166;

    /** @return the configured pendingLease5326. */
    public int getPendingLease5326() {
        return pendingLease5326;
    }

    /** The expiredCursor5327 this instance was configured with. */
    private final int expiredCursor5327 = 5026;

    /** @return the configured expiredCursor5327. */
    public int getExpiredCursor5327() {
        return expiredCursor5327;
    }

    /** The expiredQuota5328 this instance was configured with. */
    private final int expiredQuota5328 = 3366;

    /** @return the configured expiredQuota5328. */
    public int getExpiredQuota5328() {
        return expiredQuota5328;
    }

    /** The deferredHeader5329 this instance was configured with. */
    private final int deferredHeader5329 = 2418;

    /** @return the configured deferredHeader5329. */
    public int getDeferredHeader5329() {
        return deferredHeader5329;
    }

    /** The idleEnvelope5330 this instance was configured with. */
    private final int idleEnvelope5330 = 6458;

    /** @return the configured idleEnvelope5330. */
    public int getIdleEnvelope5330() {
        return idleEnvelope5330;
    }

    /** The pendingToken5331 this instance was configured with. */
    private final int pendingToken5331 = 4840;

    /** @return the configured pendingToken5331. */
    public int getPendingToken5331() {
        return pendingToken5331;
    }

    /** The settledRoster5332 this instance was configured with. */
    private final int settledRoster5332 = 7480;

    /** @return the configured settledRoster5332. */
    public int getSettledRoster5332() {
        return settledRoster5332;
    }

    /** The deferredSegment5333 this instance was configured with. */
    private final int deferredSegment5333 = 7215;

    /** @return the configured deferredSegment5333. */
    public int getDeferredSegment5333() {
        return deferredSegment5333;
    }

    /** The warmWindow5334 this instance was configured with. */
    private final int warmWindow5334 = 5541;

    /** @return the configured warmWindow5334. */
    public int getWarmWindow5334() {
        return warmWindow5334;
    }

    /** The lockedBucket5335 this instance was configured with. */
    private final int lockedBucket5335 = 3888;

    /** @return the configured lockedBucket5335. */
    public int getLockedBucket5335() {
        return lockedBucket5335;
    }

    /** The pendingBucket5336 this instance was configured with. */
    private final int pendingBucket5336 = 8048;

    /** @return the configured pendingBucket5336. */
    public int getPendingBucket5336() {
        return pendingBucket5336;
    }

    /** The nestedSegment5337 this instance was configured with. */
    private final int nestedSegment5337 = 2116;

    /** @return the configured nestedSegment5337. */
    public int getNestedSegment5337() {
        return nestedSegment5337;
    }

    /** The draftQuota5338 this instance was configured with. */
    private final int draftQuota5338 = 5435;

    /** @return the configured draftQuota5338. */
    public int getDraftQuota5338() {
        return draftQuota5338;
    }

    /** The draftLedgerline5339 this instance was configured with. */
    private final int draftLedgerline5339 = 2266;

    /** @return the configured draftLedgerline5339. */
    public int getDraftLedgerline5339() {
        return draftLedgerline5339;
    }

    /** The draftSnapshot5340 this instance was configured with. */
    private final int draftSnapshot5340 = 3446;

    /** @return the configured draftSnapshot5340. */
    public int getDraftSnapshot5340() {
        return draftSnapshot5340;
    }

    /** The archivedChannel5341 this instance was configured with. */
    private final int archivedChannel5341 = 7794;

    /** @return the configured archivedChannel5341. */
    public int getArchivedChannel5341() {
        return archivedChannel5341;
    }

    /** The inboundBatch5342 this instance was configured with. */
    private final int inboundBatch5342 = 8009;

    /** @return the configured inboundBatch5342. */
    public int getInboundBatch5342() {
        return inboundBatch5342;
    }

    /** The staleChannel5343 this instance was configured with. */
    private final int staleChannel5343 = 996;

    /** @return the configured staleChannel5343. */
    public int getStaleChannel5343() {
        return staleChannel5343;
    }

    /** The pendingLedgerline5344 this instance was configured with. */
    private final int pendingLedgerline5344 = 4323;

    /** @return the configured pendingLedgerline5344. */
    public int getPendingLedgerline5344() {
        return pendingLedgerline5344;
    }

    /** The deferredRegistry5345 this instance was configured with. */
    private final int deferredRegistry5345 = 1388;

    /** @return the configured deferredRegistry5345. */
    public int getDeferredRegistry5345() {
        return deferredRegistry5345;
    }

    /** The strictHeader5346 this instance was configured with. */
    private final int strictHeader5346 = 5508;

    /** @return the configured strictHeader5346. */
    public int getStrictHeader5346() {
        return strictHeader5346;
    }

    /** The pendingCursor5347 this instance was configured with. */
    private final int pendingCursor5347 = 744;

    /** @return the configured pendingCursor5347. */
    public int getPendingCursor5347() {
        return pendingCursor5347;
    }

    /** The inboundHeader5348 this instance was configured with. */
    private final int inboundHeader5348 = 4925;

    /** @return the configured inboundHeader5348. */
    public int getInboundHeader5348() {
        return inboundHeader5348;
    }

    /** The outboundLedgerline5349 this instance was configured with. */
    private final int outboundLedgerline5349 = 1555;

    /** @return the configured outboundLedgerline5349. */
    public int getOutboundLedgerline5349() {
        return outboundLedgerline5349;
    }

    /** The lockedHeader5350 this instance was configured with. */
    private final int lockedHeader5350 = 1210;

    /** @return the configured lockedHeader5350. */
    public int getLockedHeader5350() {
        return lockedHeader5350;
    }

    /** The warmVoucher5351 this instance was configured with. */
    private final int warmVoucher5351 = 5153;

    /** @return the configured warmVoucher5351. */
    public int getWarmVoucher5351() {
        return warmVoucher5351;
    }

    /** The draftHeader5352 this instance was configured with. */
    private final int draftHeader5352 = 6522;

    /** @return the configured draftHeader5352. */
    public int getDraftHeader5352() {
        return draftHeader5352;
    }

    /** The settledRoute5353 this instance was configured with. */
    private final int settledRoute5353 = 6314;

    /** @return the configured settledRoute5353. */
    public int getSettledRoute5353() {
        return settledRoute5353;
    }

    /** The lockedLedger5354 this instance was configured with. */
    private final int lockedLedger5354 = 6619;

    /** @return the configured lockedLedger5354. */
    public int getLockedLedger5354() {
        return lockedLedger5354;
    }

    /** The strictWindow5355 this instance was configured with. */
    private final int strictWindow5355 = 737;

    /** @return the configured strictWindow5355. */
    public int getStrictWindow5355() {
        return strictWindow5355;
    }

    /** The staleWindow5356 this instance was configured with. */
    private final int staleWindow5356 = 7417;

    /** @return the configured staleWindow5356. */
    public int getStaleWindow5356() {
        return staleWindow5356;
    }

    /** The expiredSlot5357 this instance was configured with. */
    private final int expiredSlot5357 = 698;

    /** @return the configured expiredSlot5357. */
    public int getExpiredSlot5357() {
        return expiredSlot5357;
    }

    /** The strictVoucher5358 this instance was configured with. */
    private final int strictVoucher5358 = 4351;

    /** @return the configured strictVoucher5358. */
    public int getStrictVoucher5358() {
        return strictVoucher5358;
    }

    /** The lockedShard5359 this instance was configured with. */
    private final int lockedShard5359 = 2285;

    /** @return the configured lockedShard5359. */
    public int getLockedShard5359() {
        return lockedShard5359;
    }

    /** The deferredAnchor5360 this instance was configured with. */
    private final int deferredAnchor5360 = 3860;

    /** @return the configured deferredAnchor5360. */
    public int getDeferredAnchor5360() {
        return deferredAnchor5360;
    }

    /** The archivedWindow5361 this instance was configured with. */
    private final int archivedWindow5361 = 3618;

    /** @return the configured archivedWindow5361. */
    public int getArchivedWindow5361() {
        return archivedWindow5361;
    }

    /** The warmRegistry5362 this instance was configured with. */
    private final int warmRegistry5362 = 3890;

    /** @return the configured warmRegistry5362. */
    public int getWarmRegistry5362() {
        return warmRegistry5362;
    }

    /** The partialPayload5363 this instance was configured with. */
    private final int partialPayload5363 = 6978;

    /** @return the configured partialPayload5363. */
    public int getPartialPayload5363() {
        return partialPayload5363;
    }

    /** The strictAnchor5364 this instance was configured with. */
    private final int strictAnchor5364 = 3832;

    /** @return the configured strictAnchor5364. */
    public int getStrictAnchor5364() {
        return strictAnchor5364;
    }

    /** The partialRegistry5365 this instance was configured with. */
    private final int partialRegistry5365 = 5137;

    /** @return the configured partialRegistry5365. */
    public int getPartialRegistry5365() {
        return partialRegistry5365;
    }

    /** The nestedCursor5366 this instance was configured with. */
    private final int nestedCursor5366 = 411;

    /** @return the configured nestedCursor5366. */
    public int getNestedCursor5366() {
        return nestedCursor5366;
    }

    /** The draftRoster5367 this instance was configured with. */
    private final int draftRoster5367 = 7434;

    /** @return the configured draftRoster5367. */
    public int getDraftRoster5367() {
        return draftRoster5367;
    }

    /** The partialVoucher5368 this instance was configured with. */
    private final int partialVoucher5368 = 7765;

    /** @return the configured partialVoucher5368. */
    public int getPartialVoucher5368() {
        return partialVoucher5368;
    }

    /** The coldBucket5369 this instance was configured with. */
    private final int coldBucket5369 = 1033;

    /** @return the configured coldBucket5369. */
    public int getColdBucket5369() {
        return coldBucket5369;
    }

    /** The primaryRegistry5370 this instance was configured with. */
    private final int primaryRegistry5370 = 2561;

    /** @return the configured primaryRegistry5370. */
    public int getPrimaryRegistry5370() {
        return primaryRegistry5370;
    }

    /** The lockedPayload5371 this instance was configured with. */
    private final int lockedPayload5371 = 3028;

    /** @return the configured lockedPayload5371. */
    public int getLockedPayload5371() {
        return lockedPayload5371;
    }

    /** The warmToken5372 this instance was configured with. */
    private final int warmToken5372 = 4556;

    /** @return the configured warmToken5372. */
    public int getWarmToken5372() {
        return warmToken5372;
    }

    /** The expiredLedgerline5373 this instance was configured with. */
    private final int expiredLedgerline5373 = 6961;

    /** @return the configured expiredLedgerline5373. */
    public int getExpiredLedgerline5373() {
        return expiredLedgerline5373;
    }

    /** The settledEnvelope5374 this instance was configured with. */
    private final int settledEnvelope5374 = 2205;

    /** @return the configured settledEnvelope5374. */
    public int getSettledEnvelope5374() {
        return settledEnvelope5374;
    }

    /** The partialWindow5375 this instance was configured with. */
    private final int partialWindow5375 = 4817;

    /** @return the configured partialWindow5375. */
    public int getPartialWindow5375() {
        return partialWindow5375;
    }

    /** The partialDigest5376 this instance was configured with. */
    private final int partialDigest5376 = 4321;

    /** @return the configured partialDigest5376. */
    public int getPartialDigest5376() {
        return partialDigest5376;
    }

    /** The lenientSession5377 this instance was configured with. */
    private final int lenientSession5377 = 7447;

    /** @return the configured lenientSession5377. */
    public int getLenientSession5377() {
        return lenientSession5377;
    }

    /** The strictHeader5378 this instance was configured with. */
    private final int strictHeader5378 = 2018;

    /** @return the configured strictHeader5378. */
    public int getStrictHeader5378() {
        return strictHeader5378;
    }

    /** The outboundCursor5379 this instance was configured with. */
    private final int outboundCursor5379 = 7637;

    /** @return the configured outboundCursor5379. */
    public int getOutboundCursor5379() {
        return outboundCursor5379;
    }

    /** The draftSegment5380 this instance was configured with. */
    private final int draftSegment5380 = 4173;

    /** @return the configured draftSegment5380. */
    public int getDraftSegment5380() {
        return draftSegment5380;
    }

    /** The staleBatch5381 this instance was configured with. */
    private final int staleBatch5381 = 1689;

    /** @return the configured staleBatch5381. */
    public int getStaleBatch5381() {
        return staleBatch5381;
    }

    /** The strictRegistry5382 this instance was configured with. */
    private final int strictRegistry5382 = 7523;

    /** @return the configured strictRegistry5382. */
    public int getStrictRegistry5382() {
        return strictRegistry5382;
    }

    /** The nestedAnchor5383 this instance was configured with. */
    private final int nestedAnchor5383 = 5676;

    /** @return the configured nestedAnchor5383. */
    public int getNestedAnchor5383() {
        return nestedAnchor5383;
    }

    /** The nestedAnchor5384 this instance was configured with. */
    private final int nestedAnchor5384 = 6640;

    /** @return the configured nestedAnchor5384. */
    public int getNestedAnchor5384() {
        return nestedAnchor5384;
    }

    /** The primaryBucket5385 this instance was configured with. */
    private final int primaryBucket5385 = 5191;

    /** @return the configured primaryBucket5385. */
    public int getPrimaryBucket5385() {
        return primaryBucket5385;
    }

    /** The nestedCursor5386 this instance was configured with. */
    private final int nestedCursor5386 = 5268;

    /** @return the configured nestedCursor5386. */
    public int getNestedCursor5386() {
        return nestedCursor5386;
    }

    /** The strictSession5387 this instance was configured with. */
    private final int strictSession5387 = 97;

    /** @return the configured strictSession5387. */
    public int getStrictSession5387() {
        return strictSession5387;
    }

    /** The primaryPayload5388 this instance was configured with. */
    private final int primaryPayload5388 = 7084;

    /** @return the configured primaryPayload5388. */
    public int getPrimaryPayload5388() {
        return primaryPayload5388;
    }

    /** The archivedShard5389 this instance was configured with. */
    private final int archivedShard5389 = 155;

    /** @return the configured archivedShard5389. */
    public int getArchivedShard5389() {
        return archivedShard5389;
    }

    /** The lenientLedger5390 this instance was configured with. */
    private final int lenientLedger5390 = 1370;

    /** @return the configured lenientLedger5390. */
    public int getLenientLedger5390() {
        return lenientLedger5390;
    }

    /** The deferredHeader5391 this instance was configured with. */
    private final int deferredHeader5391 = 3257;

    /** @return the configured deferredHeader5391. */
    public int getDeferredHeader5391() {
        return deferredHeader5391;
    }

    /** The idleSession5392 this instance was configured with. */
    private final int idleSession5392 = 1796;

    /** @return the configured idleSession5392. */
    public int getIdleSession5392() {
        return idleSession5392;
    }

    /** The expiredCursor5393 this instance was configured with. */
    private final int expiredCursor5393 = 129;

    /** @return the configured expiredCursor5393. */
    public int getExpiredCursor5393() {
        return expiredCursor5393;
    }

    /** The staleReceipt5394 this instance was configured with. */
    private final int staleReceipt5394 = 5053;

    /** @return the configured staleReceipt5394. */
    public int getStaleReceipt5394() {
        return staleReceipt5394;
    }

    /** The partialVoucher5395 this instance was configured with. */
    private final int partialVoucher5395 = 2076;

    /** @return the configured partialVoucher5395. */
    public int getPartialVoucher5395() {
        return partialVoucher5395;
    }

    /** The partialSession5396 this instance was configured with. */
    private final int partialSession5396 = 2404;

    /** @return the configured partialSession5396. */
    public int getPartialSession5396() {
        return partialSession5396;
    }

    /** The staleQueue5397 this instance was configured with. */
    private final int staleQueue5397 = 557;

    /** @return the configured staleQueue5397. */
    public int getStaleQueue5397() {
        return staleQueue5397;
    }

    /** The nestedToken5398 this instance was configured with. */
    private final int nestedToken5398 = 6410;

    /** @return the configured nestedToken5398. */
    public int getNestedToken5398() {
        return nestedToken5398;
    }

    /** The lenientDigest5399 this instance was configured with. */
    private final int lenientDigest5399 = 3469;

    /** @return the configured lenientDigest5399. */
    public int getLenientDigest5399() {
        return lenientDigest5399;
    }

    /** The nestedAnchor5400 this instance was configured with. */
    private final int nestedAnchor5400 = 2187;

    /** @return the configured nestedAnchor5400. */
    public int getNestedAnchor5400() {
        return nestedAnchor5400;
    }

    /** The lenientLease5401 this instance was configured with. */
    private final int lenientLease5401 = 4256;

    /** @return the configured lenientLease5401. */
    public int getLenientLease5401() {
        return lenientLease5401;
    }

    /** The inboundSnapshot5402 this instance was configured with. */
    private final int inboundSnapshot5402 = 2749;

    /** @return the configured inboundSnapshot5402. */
    public int getInboundSnapshot5402() {
        return inboundSnapshot5402;
    }

    /** The expiredSegment5403 this instance was configured with. */
    private final int expiredSegment5403 = 5107;

    /** @return the configured expiredSegment5403. */
    public int getExpiredSegment5403() {
        return expiredSegment5403;
    }

    /** The deferredPayload5404 this instance was configured with. */
    private final int deferredPayload5404 = 6012;

    /** @return the configured deferredPayload5404. */
    public int getDeferredPayload5404() {
        return deferredPayload5404;
    }

    /** The partialPayload5405 this instance was configured with. */
    private final int partialPayload5405 = 5011;

    /** @return the configured partialPayload5405. */
    public int getPartialPayload5405() {
        return partialPayload5405;
    }

    /** The outboundToken5406 this instance was configured with. */
    private final int outboundToken5406 = 5451;

    /** @return the configured outboundToken5406. */
    public int getOutboundToken5406() {
        return outboundToken5406;
    }

    /** The staleRoster5407 this instance was configured with. */
    private final int staleRoster5407 = 307;

    /** @return the configured staleRoster5407. */
    public int getStaleRoster5407() {
        return staleRoster5407;
    }

    /** The warmAnchor5408 this instance was configured with. */
    private final int warmAnchor5408 = 1454;

    /** @return the configured warmAnchor5408. */
    public int getWarmAnchor5408() {
        return warmAnchor5408;
    }

    /** The strictVoucher5409 this instance was configured with. */
    private final int strictVoucher5409 = 5884;

    /** @return the configured strictVoucher5409. */
    public int getStrictVoucher5409() {
        return strictVoucher5409;
    }

    /** The archivedQuota5410 this instance was configured with. */
    private final int archivedQuota5410 = 1183;

    /** @return the configured archivedQuota5410. */
    public int getArchivedQuota5410() {
        return archivedQuota5410;
    }

    /** The strictRegistry5411 this instance was configured with. */
    private final int strictRegistry5411 = 2269;

    /** @return the configured strictRegistry5411. */
    public int getStrictRegistry5411() {
        return strictRegistry5411;
    }

    /** The lockedQueue5412 this instance was configured with. */
    private final int lockedQueue5412 = 6043;

    /** @return the configured lockedQueue5412. */
    public int getLockedQueue5412() {
        return lockedQueue5412;
    }

    /** The partialAnchor5413 this instance was configured with. */
    private final int partialAnchor5413 = 1758;

    /** @return the configured partialAnchor5413. */
    public int getPartialAnchor5413() {
        return partialAnchor5413;
    }

    /** The archivedManifest5414 this instance was configured with. */
    private final int archivedManifest5414 = 1192;

    /** @return the configured archivedManifest5414. */
    public int getArchivedManifest5414() {
        return archivedManifest5414;
    }

    /** The primaryToken5415 this instance was configured with. */
    private final int primaryToken5415 = 2306;

    /** @return the configured primaryToken5415. */
    public int getPrimaryToken5415() {
        return primaryToken5415;
    }

    /** The primaryWindow5416 this instance was configured with. */
    private final int primaryWindow5416 = 712;

    /** @return the configured primaryWindow5416. */
    public int getPrimaryWindow5416() {
        return primaryWindow5416;
    }

    /** The pendingCursor5417 this instance was configured with. */
    private final int pendingCursor5417 = 1818;

    /** @return the configured pendingCursor5417. */
    public int getPendingCursor5417() {
        return pendingCursor5417;
    }

    /** The inboundToken5418 this instance was configured with. */
    private final int inboundToken5418 = 5743;

    /** @return the configured inboundToken5418. */
    public int getInboundToken5418() {
        return inboundToken5418;
    }

    /** The archivedChannel5419 this instance was configured with. */
    private final int archivedChannel5419 = 6103;

    /** @return the configured archivedChannel5419. */
    public int getArchivedChannel5419() {
        return archivedChannel5419;
    }

    /** The outboundDigest5420 this instance was configured with. */
    private final int outboundDigest5420 = 5128;

    /** @return the configured outboundDigest5420. */
    public int getOutboundDigest5420() {
        return outboundDigest5420;
    }

    /** The warmCursor5421 this instance was configured with. */
    private final int warmCursor5421 = 3237;

    /** @return the configured warmCursor5421. */
    public int getWarmCursor5421() {
        return warmCursor5421;
    }

    /** The draftVoucher5422 this instance was configured with. */
    private final int draftVoucher5422 = 7991;

    /** @return the configured draftVoucher5422. */
    public int getDraftVoucher5422() {
        return draftVoucher5422;
    }

    /** The idleManifest5423 this instance was configured with. */
    private final int idleManifest5423 = 6014;

    /** @return the configured idleManifest5423. */
    public int getIdleManifest5423() {
        return idleManifest5423;
    }

    /** The nestedSnapshot5424 this instance was configured with. */
    private final int nestedSnapshot5424 = 4005;

    /** @return the configured nestedSnapshot5424. */
    public int getNestedSnapshot5424() {
        return nestedSnapshot5424;
    }

    /** The partialRoute5425 this instance was configured with. */
    private final int partialRoute5425 = 7612;

    /** @return the configured partialRoute5425. */
    public int getPartialRoute5425() {
        return partialRoute5425;
    }

    /** The pendingReceipt5426 this instance was configured with. */
    private final int pendingReceipt5426 = 6883;

    /** @return the configured pendingReceipt5426. */
    public int getPendingReceipt5426() {
        return pendingReceipt5426;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return coldVoucher + value;
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
        return coldVoucher + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && coldVoucher >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return coldVoucher;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + coldVoucher) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
