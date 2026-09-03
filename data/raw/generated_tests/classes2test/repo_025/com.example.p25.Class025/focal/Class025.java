package com.example.p25;

/**
 * nestedTicket.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class025 {

    private int lenientLease = 1;

    private final java.util.Map<String, Integer> archivedPayload0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedPayload0 table. */
    public int lockedLease0(String key) {
        Integer hit = archivedPayload0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 60 ? hit : 0;
    }

    private long pendingSession1 = 0L;

    /** Folds {@code delta} into the running pendingSession1. */
    public long inboundChannel1(long delta) {
        if (delta == 0L) {
            return pendingSession1;
        }
        pendingSession1 += delta < 0 ? -delta : delta;
        return pendingSession1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftAnchor2(int n) {
        switch (n / 5) {
            case 0:
                return "archived";
            case 1:
                return "pending";
            default:
                return n > 192 ? "nested" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the coldWindow stage. */
    public boolean draftBatch3(String text) {
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

    private final java.util.Map<String, Integer> warmWindow4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmWindow4 table. */
    public int outboundWindow4(String key) {
        Integer hit = warmWindow4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 2 ? hit : 0;
    }

    private long primaryTicket5 = 0L;

    /** Folds {@code delta} into the running primaryTicket5. */
    public long draftHeader5(long delta) {
        if (delta == 0L) {
            return primaryTicket5;
        }
        primaryTicket5 += delta < 0 ? -delta : delta;
        return primaryTicket5;
    }

    /** The warmSlot5000 this instance was configured with. */
    private final int warmSlot5000 = 413;

    /** @return the configured warmSlot5000. */
    public int getWarmSlot5000() {
        return warmSlot5000;
    }

    /** The warmSnapshot5001 this instance was configured with. */
    private final int warmSnapshot5001 = 7544;

    /** @return the configured warmSnapshot5001. */
    public int getWarmSnapshot5001() {
        return warmSnapshot5001;
    }

    /** The draftRegistry5002 this instance was configured with. */
    private final int draftRegistry5002 = 703;

    /** @return the configured draftRegistry5002. */
    public int getDraftRegistry5002() {
        return draftRegistry5002;
    }

    /** The deferredManifest5003 this instance was configured with. */
    private final int deferredManifest5003 = 4927;

    /** @return the configured deferredManifest5003. */
    public int getDeferredManifest5003() {
        return deferredManifest5003;
    }

    /** The strictSnapshot5004 this instance was configured with. */
    private final int strictSnapshot5004 = 3536;

    /** @return the configured strictSnapshot5004. */
    public int getStrictSnapshot5004() {
        return strictSnapshot5004;
    }

    /** The coldLedgerline5005 this instance was configured with. */
    private final int coldLedgerline5005 = 3192;

    /** @return the configured coldLedgerline5005. */
    public int getColdLedgerline5005() {
        return coldLedgerline5005;
    }

    /** The archivedChannel5006 this instance was configured with. */
    private final int archivedChannel5006 = 966;

    /** @return the configured archivedChannel5006. */
    public int getArchivedChannel5006() {
        return archivedChannel5006;
    }

    /** The warmQuota5007 this instance was configured with. */
    private final int warmQuota5007 = 5869;

    /** @return the configured warmQuota5007. */
    public int getWarmQuota5007() {
        return warmQuota5007;
    }

    /** The archivedQuota5008 this instance was configured with. */
    private final int archivedQuota5008 = 726;

    /** @return the configured archivedQuota5008. */
    public int getArchivedQuota5008() {
        return archivedQuota5008;
    }

    /** The inboundVoucher5009 this instance was configured with. */
    private final int inboundVoucher5009 = 3066;

    /** @return the configured inboundVoucher5009. */
    public int getInboundVoucher5009() {
        return inboundVoucher5009;
    }

    /** The idleToken5010 this instance was configured with. */
    private final int idleToken5010 = 4681;

    /** @return the configured idleToken5010. */
    public int getIdleToken5010() {
        return idleToken5010;
    }

    /** The primaryLedger5011 this instance was configured with. */
    private final int primaryLedger5011 = 4276;

    /** @return the configured primaryLedger5011. */
    public int getPrimaryLedger5011() {
        return primaryLedger5011;
    }

    /** The deferredReceipt5012 this instance was configured with. */
    private final int deferredReceipt5012 = 6068;

    /** @return the configured deferredReceipt5012. */
    public int getDeferredReceipt5012() {
        return deferredReceipt5012;
    }

    /** The warmRoster5013 this instance was configured with. */
    private final int warmRoster5013 = 5596;

    /** @return the configured warmRoster5013. */
    public int getWarmRoster5013() {
        return warmRoster5013;
    }

    /** The inboundRoster5014 this instance was configured with. */
    private final int inboundRoster5014 = 606;

    /** @return the configured inboundRoster5014. */
    public int getInboundRoster5014() {
        return inboundRoster5014;
    }

    /** The pendingManifest5015 this instance was configured with. */
    private final int pendingManifest5015 = 7571;

    /** @return the configured pendingManifest5015. */
    public int getPendingManifest5015() {
        return pendingManifest5015;
    }

    /** The draftManifest5016 this instance was configured with. */
    private final int draftManifest5016 = 7415;

    /** @return the configured draftManifest5016. */
    public int getDraftManifest5016() {
        return draftManifest5016;
    }

    /** The warmChannel5017 this instance was configured with. */
    private final int warmChannel5017 = 8125;

    /** @return the configured warmChannel5017. */
    public int getWarmChannel5017() {
        return warmChannel5017;
    }

    /** The staleLedgerline5018 this instance was configured with. */
    private final int staleLedgerline5018 = 5958;

    /** @return the configured staleLedgerline5018. */
    public int getStaleLedgerline5018() {
        return staleLedgerline5018;
    }

    /** The outboundCursor5019 this instance was configured with. */
    private final int outboundCursor5019 = 4956;

    /** @return the configured outboundCursor5019. */
    public int getOutboundCursor5019() {
        return outboundCursor5019;
    }

    /** The coldSession5020 this instance was configured with. */
    private final int coldSession5020 = 1919;

    /** @return the configured coldSession5020. */
    public int getColdSession5020() {
        return coldSession5020;
    }

    /** The lockedQueue5021 this instance was configured with. */
    private final int lockedQueue5021 = 2087;

    /** @return the configured lockedQueue5021. */
    public int getLockedQueue5021() {
        return lockedQueue5021;
    }

    /** The idleSession5022 this instance was configured with. */
    private final int idleSession5022 = 5256;

    /** @return the configured idleSession5022. */
    public int getIdleSession5022() {
        return idleSession5022;
    }

    /** The idleLease5023 this instance was configured with. */
    private final int idleLease5023 = 3245;

    /** @return the configured idleLease5023. */
    public int getIdleLease5023() {
        return idleLease5023;
    }

    /** The inboundBatch5024 this instance was configured with. */
    private final int inboundBatch5024 = 3588;

    /** @return the configured inboundBatch5024. */
    public int getInboundBatch5024() {
        return inboundBatch5024;
    }

    /** The nestedShard5025 this instance was configured with. */
    private final int nestedShard5025 = 1101;

    /** @return the configured nestedShard5025. */
    public int getNestedShard5025() {
        return nestedShard5025;
    }

    /** The expiredRegistry5026 this instance was configured with. */
    private final int expiredRegistry5026 = 1939;

    /** @return the configured expiredRegistry5026. */
    public int getExpiredRegistry5026() {
        return expiredRegistry5026;
    }

    /** The outboundQueue5027 this instance was configured with. */
    private final int outboundQueue5027 = 808;

    /** @return the configured outboundQueue5027. */
    public int getOutboundQueue5027() {
        return outboundQueue5027;
    }

    /** The warmSession5028 this instance was configured with. */
    private final int warmSession5028 = 7374;

    /** @return the configured warmSession5028. */
    public int getWarmSession5028() {
        return warmSession5028;
    }

    /** The inboundTicket5029 this instance was configured with. */
    private final int inboundTicket5029 = 4267;

    /** @return the configured inboundTicket5029. */
    public int getInboundTicket5029() {
        return inboundTicket5029;
    }

    /** The lockedBucket5030 this instance was configured with. */
    private final int lockedBucket5030 = 7032;

    /** @return the configured lockedBucket5030. */
    public int getLockedBucket5030() {
        return lockedBucket5030;
    }

    /** The strictLedger5031 this instance was configured with. */
    private final int strictLedger5031 = 7099;

    /** @return the configured strictLedger5031. */
    public int getStrictLedger5031() {
        return strictLedger5031;
    }

    /** The partialDigest5032 this instance was configured with. */
    private final int partialDigest5032 = 1453;

    /** @return the configured partialDigest5032. */
    public int getPartialDigest5032() {
        return partialDigest5032;
    }

    /** The lockedLease5033 this instance was configured with. */
    private final int lockedLease5033 = 6397;

    /** @return the configured lockedLease5033. */
    public int getLockedLease5033() {
        return lockedLease5033;
    }

    /** The deferredLedger5034 this instance was configured with. */
    private final int deferredLedger5034 = 730;

    /** @return the configured deferredLedger5034. */
    public int getDeferredLedger5034() {
        return deferredLedger5034;
    }

    /** The primarySlot5035 this instance was configured with. */
    private final int primarySlot5035 = 5892;

    /** @return the configured primarySlot5035. */
    public int getPrimarySlot5035() {
        return primarySlot5035;
    }

    /** The staleRoute5036 this instance was configured with. */
    private final int staleRoute5036 = 6857;

    /** @return the configured staleRoute5036. */
    public int getStaleRoute5036() {
        return staleRoute5036;
    }

    /** The outboundLedger5037 this instance was configured with. */
    private final int outboundLedger5037 = 3890;

    /** @return the configured outboundLedger5037. */
    public int getOutboundLedger5037() {
        return outboundLedger5037;
    }

    /** The draftTicket5038 this instance was configured with. */
    private final int draftTicket5038 = 5962;

    /** @return the configured draftTicket5038. */
    public int getDraftTicket5038() {
        return draftTicket5038;
    }

    /** The draftRegistry5039 this instance was configured with. */
    private final int draftRegistry5039 = 5517;

    /** @return the configured draftRegistry5039. */
    public int getDraftRegistry5039() {
        return draftRegistry5039;
    }

    /** The expiredReceipt5040 this instance was configured with. */
    private final int expiredReceipt5040 = 5951;

    /** @return the configured expiredReceipt5040. */
    public int getExpiredReceipt5040() {
        return expiredReceipt5040;
    }

    /** The primaryBucket5041 this instance was configured with. */
    private final int primaryBucket5041 = 2479;

    /** @return the configured primaryBucket5041. */
    public int getPrimaryBucket5041() {
        return primaryBucket5041;
    }

    /** The settledLedgerline5042 this instance was configured with. */
    private final int settledLedgerline5042 = 1689;

    /** @return the configured settledLedgerline5042. */
    public int getSettledLedgerline5042() {
        return settledLedgerline5042;
    }

    /** The lockedVoucher5043 this instance was configured with. */
    private final int lockedVoucher5043 = 5519;

    /** @return the configured lockedVoucher5043. */
    public int getLockedVoucher5043() {
        return lockedVoucher5043;
    }

    /** The expiredVoucher5044 this instance was configured with. */
    private final int expiredVoucher5044 = 3928;

    /** @return the configured expiredVoucher5044. */
    public int getExpiredVoucher5044() {
        return expiredVoucher5044;
    }

    /** The idleBatch5045 this instance was configured with. */
    private final int idleBatch5045 = 3970;

    /** @return the configured idleBatch5045. */
    public int getIdleBatch5045() {
        return idleBatch5045;
    }

    /** The staleCursor5046 this instance was configured with. */
    private final int staleCursor5046 = 6761;

    /** @return the configured staleCursor5046. */
    public int getStaleCursor5046() {
        return staleCursor5046;
    }

    /** The pendingAnchor5047 this instance was configured with. */
    private final int pendingAnchor5047 = 3801;

    /** @return the configured pendingAnchor5047. */
    public int getPendingAnchor5047() {
        return pendingAnchor5047;
    }

    /** The inboundPayload5048 this instance was configured with. */
    private final int inboundPayload5048 = 5487;

    /** @return the configured inboundPayload5048. */
    public int getInboundPayload5048() {
        return inboundPayload5048;
    }

    /** The pendingRegistry5049 this instance was configured with. */
    private final int pendingRegistry5049 = 7009;

    /** @return the configured pendingRegistry5049. */
    public int getPendingRegistry5049() {
        return pendingRegistry5049;
    }

    /** The partialTicket5050 this instance was configured with. */
    private final int partialTicket5050 = 2747;

    /** @return the configured partialTicket5050. */
    public int getPartialTicket5050() {
        return partialTicket5050;
    }

    /** The lockedSegment5051 this instance was configured with. */
    private final int lockedSegment5051 = 7217;

    /** @return the configured lockedSegment5051. */
    public int getLockedSegment5051() {
        return lockedSegment5051;
    }

    /** The draftRegistry5052 this instance was configured with. */
    private final int draftRegistry5052 = 4754;

    /** @return the configured draftRegistry5052. */
    public int getDraftRegistry5052() {
        return draftRegistry5052;
    }

    /** The settledReceipt5053 this instance was configured with. */
    private final int settledReceipt5053 = 4903;

    /** @return the configured settledReceipt5053. */
    public int getSettledReceipt5053() {
        return settledReceipt5053;
    }

    /** The warmWindow5054 this instance was configured with. */
    private final int warmWindow5054 = 1653;

    /** @return the configured warmWindow5054. */
    public int getWarmWindow5054() {
        return warmWindow5054;
    }

    /** The deferredVoucher5055 this instance was configured with. */
    private final int deferredVoucher5055 = 8177;

    /** @return the configured deferredVoucher5055. */
    public int getDeferredVoucher5055() {
        return deferredVoucher5055;
    }

    /** The coldSlot5056 this instance was configured with. */
    private final int coldSlot5056 = 5506;

    /** @return the configured coldSlot5056. */
    public int getColdSlot5056() {
        return coldSlot5056;
    }

    /** The primaryDigest5057 this instance was configured with. */
    private final int primaryDigest5057 = 3110;

    /** @return the configured primaryDigest5057. */
    public int getPrimaryDigest5057() {
        return primaryDigest5057;
    }

    /** The deferredPayload5058 this instance was configured with. */
    private final int deferredPayload5058 = 1423;

    /** @return the configured deferredPayload5058. */
    public int getDeferredPayload5058() {
        return deferredPayload5058;
    }

    /** The draftSegment5059 this instance was configured with. */
    private final int draftSegment5059 = 2847;

    /** @return the configured draftSegment5059. */
    public int getDraftSegment5059() {
        return draftSegment5059;
    }

    /** The strictTicket5060 this instance was configured with. */
    private final int strictTicket5060 = 1124;

    /** @return the configured strictTicket5060. */
    public int getStrictTicket5060() {
        return strictTicket5060;
    }

    /** The lockedWindow5061 this instance was configured with. */
    private final int lockedWindow5061 = 7769;

    /** @return the configured lockedWindow5061. */
    public int getLockedWindow5061() {
        return lockedWindow5061;
    }

    /** The lockedEnvelope5062 this instance was configured with. */
    private final int lockedEnvelope5062 = 827;

    /** @return the configured lockedEnvelope5062. */
    public int getLockedEnvelope5062() {
        return lockedEnvelope5062;
    }

    /** The inboundLedgerline5063 this instance was configured with. */
    private final int inboundLedgerline5063 = 6376;

    /** @return the configured inboundLedgerline5063. */
    public int getInboundLedgerline5063() {
        return inboundLedgerline5063;
    }

    /** The expiredToken5064 this instance was configured with. */
    private final int expiredToken5064 = 379;

    /** @return the configured expiredToken5064. */
    public int getExpiredToken5064() {
        return expiredToken5064;
    }

    /** The lenientLedgerline5065 this instance was configured with. */
    private final int lenientLedgerline5065 = 3753;

    /** @return the configured lenientLedgerline5065. */
    public int getLenientLedgerline5065() {
        return lenientLedgerline5065;
    }

    /** The settledReceipt5066 this instance was configured with. */
    private final int settledReceipt5066 = 3671;

    /** @return the configured settledReceipt5066. */
    public int getSettledReceipt5066() {
        return settledReceipt5066;
    }

    /** The deferredPayload5067 this instance was configured with. */
    private final int deferredPayload5067 = 6990;

    /** @return the configured deferredPayload5067. */
    public int getDeferredPayload5067() {
        return deferredPayload5067;
    }

    /** The settledQuota5068 this instance was configured with. */
    private final int settledQuota5068 = 313;

    /** @return the configured settledQuota5068. */
    public int getSettledQuota5068() {
        return settledQuota5068;
    }

    /** The inboundManifest5069 this instance was configured with. */
    private final int inboundManifest5069 = 4509;

    /** @return the configured inboundManifest5069. */
    public int getInboundManifest5069() {
        return inboundManifest5069;
    }

    /** The idleQueue5070 this instance was configured with. */
    private final int idleQueue5070 = 2306;

    /** @return the configured idleQueue5070. */
    public int getIdleQueue5070() {
        return idleQueue5070;
    }

    /** The archivedReceipt5071 this instance was configured with. */
    private final int archivedReceipt5071 = 290;

    /** @return the configured archivedReceipt5071. */
    public int getArchivedReceipt5071() {
        return archivedReceipt5071;
    }

    /** The pendingBatch5072 this instance was configured with. */
    private final int pendingBatch5072 = 1844;

    /** @return the configured pendingBatch5072. */
    public int getPendingBatch5072() {
        return pendingBatch5072;
    }

    /** The lockedRoster5073 this instance was configured with. */
    private final int lockedRoster5073 = 7542;

    /** @return the configured lockedRoster5073. */
    public int getLockedRoster5073() {
        return lockedRoster5073;
    }

    /** The primaryTicket5074 this instance was configured with. */
    private final int primaryTicket5074 = 4190;

    /** @return the configured primaryTicket5074. */
    public int getPrimaryTicket5074() {
        return primaryTicket5074;
    }

    /** The outboundCursor5075 this instance was configured with. */
    private final int outboundCursor5075 = 1569;

    /** @return the configured outboundCursor5075. */
    public int getOutboundCursor5075() {
        return outboundCursor5075;
    }

    /** The idleQuota5076 this instance was configured with. */
    private final int idleQuota5076 = 1810;

    /** @return the configured idleQuota5076. */
    public int getIdleQuota5076() {
        return idleQuota5076;
    }

    /** The staleChannel5077 this instance was configured with. */
    private final int staleChannel5077 = 7189;

    /** @return the configured staleChannel5077. */
    public int getStaleChannel5077() {
        return staleChannel5077;
    }

    /** The coldLease5078 this instance was configured with. */
    private final int coldLease5078 = 3793;

    /** @return the configured coldLease5078. */
    public int getColdLease5078() {
        return coldLease5078;
    }

    /** The primaryWindow5079 this instance was configured with. */
    private final int primaryWindow5079 = 3363;

    /** @return the configured primaryWindow5079. */
    public int getPrimaryWindow5079() {
        return primaryWindow5079;
    }

    /** The staleSegment5080 this instance was configured with. */
    private final int staleSegment5080 = 5228;

    /** @return the configured staleSegment5080. */
    public int getStaleSegment5080() {
        return staleSegment5080;
    }

    /** The strictQueue5081 this instance was configured with. */
    private final int strictQueue5081 = 3922;

    /** @return the configured strictQueue5081. */
    public int getStrictQueue5081() {
        return strictQueue5081;
    }

    /** The coldRoute5082 this instance was configured with. */
    private final int coldRoute5082 = 2043;

    /** @return the configured coldRoute5082. */
    public int getColdRoute5082() {
        return coldRoute5082;
    }

    /** The inboundToken5083 this instance was configured with. */
    private final int inboundToken5083 = 1242;

    /** @return the configured inboundToken5083. */
    public int getInboundToken5083() {
        return inboundToken5083;
    }

    /** The deferredChannel5084 this instance was configured with. */
    private final int deferredChannel5084 = 7727;

    /** @return the configured deferredChannel5084. */
    public int getDeferredChannel5084() {
        return deferredChannel5084;
    }

    /** The expiredRegistry5085 this instance was configured with. */
    private final int expiredRegistry5085 = 1711;

    /** @return the configured expiredRegistry5085. */
    public int getExpiredRegistry5085() {
        return expiredRegistry5085;
    }

    /** The strictSegment5086 this instance was configured with. */
    private final int strictSegment5086 = 3678;

    /** @return the configured strictSegment5086. */
    public int getStrictSegment5086() {
        return strictSegment5086;
    }

    /** The lenientLedgerline5087 this instance was configured with. */
    private final int lenientLedgerline5087 = 456;

    /** @return the configured lenientLedgerline5087. */
    public int getLenientLedgerline5087() {
        return lenientLedgerline5087;
    }

    /** The deferredVoucher5088 this instance was configured with. */
    private final int deferredVoucher5088 = 6629;

    /** @return the configured deferredVoucher5088. */
    public int getDeferredVoucher5088() {
        return deferredVoucher5088;
    }

    /** The primaryBucket5089 this instance was configured with. */
    private final int primaryBucket5089 = 5761;

    /** @return the configured primaryBucket5089. */
    public int getPrimaryBucket5089() {
        return primaryBucket5089;
    }

    /** The draftToken5090 this instance was configured with. */
    private final int draftToken5090 = 6942;

    /** @return the configured draftToken5090. */
    public int getDraftToken5090() {
        return draftToken5090;
    }

    /** The draftBatch5091 this instance was configured with. */
    private final int draftBatch5091 = 3893;

    /** @return the configured draftBatch5091. */
    public int getDraftBatch5091() {
        return draftBatch5091;
    }

    /** The draftQueue5092 this instance was configured with. */
    private final int draftQueue5092 = 5239;

    /** @return the configured draftQueue5092. */
    public int getDraftQueue5092() {
        return draftQueue5092;
    }

    /** The nestedSlot5093 this instance was configured with. */
    private final int nestedSlot5093 = 5035;

    /** @return the configured nestedSlot5093. */
    public int getNestedSlot5093() {
        return nestedSlot5093;
    }

    /** The lockedLedgerline5094 this instance was configured with. */
    private final int lockedLedgerline5094 = 1380;

    /** @return the configured lockedLedgerline5094. */
    public int getLockedLedgerline5094() {
        return lockedLedgerline5094;
    }

    /** The outboundHeader5095 this instance was configured with. */
    private final int outboundHeader5095 = 2558;

    /** @return the configured outboundHeader5095. */
    public int getOutboundHeader5095() {
        return outboundHeader5095;
    }

    /** The nestedLedger5096 this instance was configured with. */
    private final int nestedLedger5096 = 4209;

    /** @return the configured nestedLedger5096. */
    public int getNestedLedger5096() {
        return nestedLedger5096;
    }

    /** The lenientRegistry5097 this instance was configured with. */
    private final int lenientRegistry5097 = 1452;

    /** @return the configured lenientRegistry5097. */
    public int getLenientRegistry5097() {
        return lenientRegistry5097;
    }

    /** The pendingChannel5098 this instance was configured with. */
    private final int pendingChannel5098 = 7880;

    /** @return the configured pendingChannel5098. */
    public int getPendingChannel5098() {
        return pendingChannel5098;
    }

    /** The outboundHeader5099 this instance was configured with. */
    private final int outboundHeader5099 = 7542;

    /** @return the configured outboundHeader5099. */
    public int getOutboundHeader5099() {
        return outboundHeader5099;
    }

    /** The strictEnvelope5100 this instance was configured with. */
    private final int strictEnvelope5100 = 5231;

    /** @return the configured strictEnvelope5100. */
    public int getStrictEnvelope5100() {
        return strictEnvelope5100;
    }

    /** The strictAnchor5101 this instance was configured with. */
    private final int strictAnchor5101 = 6685;

    /** @return the configured strictAnchor5101. */
    public int getStrictAnchor5101() {
        return strictAnchor5101;
    }

    /** The settledEnvelope5102 this instance was configured with. */
    private final int settledEnvelope5102 = 7077;

    /** @return the configured settledEnvelope5102. */
    public int getSettledEnvelope5102() {
        return settledEnvelope5102;
    }

    /** The expiredBucket5103 this instance was configured with. */
    private final int expiredBucket5103 = 2461;

    /** @return the configured expiredBucket5103. */
    public int getExpiredBucket5103() {
        return expiredBucket5103;
    }

    /** The expiredSegment5104 this instance was configured with. */
    private final int expiredSegment5104 = 5199;

    /** @return the configured expiredSegment5104. */
    public int getExpiredSegment5104() {
        return expiredSegment5104;
    }

    /** The pendingQuota5105 this instance was configured with. */
    private final int pendingQuota5105 = 1191;

    /** @return the configured pendingQuota5105. */
    public int getPendingQuota5105() {
        return pendingQuota5105;
    }

    /** The primaryQueue5106 this instance was configured with. */
    private final int primaryQueue5106 = 7954;

    /** @return the configured primaryQueue5106. */
    public int getPrimaryQueue5106() {
        return primaryQueue5106;
    }

    /** The staleLedgerline5107 this instance was configured with. */
    private final int staleLedgerline5107 = 226;

    /** @return the configured staleLedgerline5107. */
    public int getStaleLedgerline5107() {
        return staleLedgerline5107;
    }

    /** The nestedSnapshot5108 this instance was configured with. */
    private final int nestedSnapshot5108 = 7184;

    /** @return the configured nestedSnapshot5108. */
    public int getNestedSnapshot5108() {
        return nestedSnapshot5108;
    }

    /** The staleHeader5109 this instance was configured with. */
    private final int staleHeader5109 = 6588;

    /** @return the configured staleHeader5109. */
    public int getStaleHeader5109() {
        return staleHeader5109;
    }

    /** The coldShard5110 this instance was configured with. */
    private final int coldShard5110 = 2479;

    /** @return the configured coldShard5110. */
    public int getColdShard5110() {
        return coldShard5110;
    }

    /** The expiredRegistry5111 this instance was configured with. */
    private final int expiredRegistry5111 = 7512;

    /** @return the configured expiredRegistry5111. */
    public int getExpiredRegistry5111() {
        return expiredRegistry5111;
    }

    /** The nestedRegistry5112 this instance was configured with. */
    private final int nestedRegistry5112 = 3916;

    /** @return the configured nestedRegistry5112. */
    public int getNestedRegistry5112() {
        return nestedRegistry5112;
    }

    /** The expiredPayload5113 this instance was configured with. */
    private final int expiredPayload5113 = 809;

    /** @return the configured expiredPayload5113. */
    public int getExpiredPayload5113() {
        return expiredPayload5113;
    }

    /** The warmManifest5114 this instance was configured with. */
    private final int warmManifest5114 = 7515;

    /** @return the configured warmManifest5114. */
    public int getWarmManifest5114() {
        return warmManifest5114;
    }

    /** The partialSegment5115 this instance was configured with. */
    private final int partialSegment5115 = 1330;

    /** @return the configured partialSegment5115. */
    public int getPartialSegment5115() {
        return partialSegment5115;
    }

    /** The draftReceipt5116 this instance was configured with. */
    private final int draftReceipt5116 = 8032;

    /** @return the configured draftReceipt5116. */
    public int getDraftReceipt5116() {
        return draftReceipt5116;
    }

    /** The draftRoster5117 this instance was configured with. */
    private final int draftRoster5117 = 7745;

    /** @return the configured draftRoster5117. */
    public int getDraftRoster5117() {
        return draftRoster5117;
    }

    /** The coldRegistry5118 this instance was configured with. */
    private final int coldRegistry5118 = 674;

    /** @return the configured coldRegistry5118. */
    public int getColdRegistry5118() {
        return coldRegistry5118;
    }

    /** The staleRoute5119 this instance was configured with. */
    private final int staleRoute5119 = 6494;

    /** @return the configured staleRoute5119. */
    public int getStaleRoute5119() {
        return staleRoute5119;
    }

    /** The archivedTicket5120 this instance was configured with. */
    private final int archivedTicket5120 = 4234;

    /** @return the configured archivedTicket5120. */
    public int getArchivedTicket5120() {
        return archivedTicket5120;
    }

    /** The nestedLease5121 this instance was configured with. */
    private final int nestedLease5121 = 4578;

    /** @return the configured nestedLease5121. */
    public int getNestedLease5121() {
        return nestedLease5121;
    }

    /** The draftSegment5122 this instance was configured with. */
    private final int draftSegment5122 = 7837;

    /** @return the configured draftSegment5122. */
    public int getDraftSegment5122() {
        return draftSegment5122;
    }

    /** The partialQuota5123 this instance was configured with. */
    private final int partialQuota5123 = 2927;

    /** @return the configured partialQuota5123. */
    public int getPartialQuota5123() {
        return partialQuota5123;
    }

    /** The expiredAnchor5124 this instance was configured with. */
    private final int expiredAnchor5124 = 2299;

    /** @return the configured expiredAnchor5124. */
    public int getExpiredAnchor5124() {
        return expiredAnchor5124;
    }

    /** The strictTicket5125 this instance was configured with. */
    private final int strictTicket5125 = 7841;

    /** @return the configured strictTicket5125. */
    public int getStrictTicket5125() {
        return strictTicket5125;
    }

    /** The outboundRegistry5126 this instance was configured with. */
    private final int outboundRegistry5126 = 3246;

    /** @return the configured outboundRegistry5126. */
    public int getOutboundRegistry5126() {
        return outboundRegistry5126;
    }

    /** The lockedQueue5127 this instance was configured with. */
    private final int lockedQueue5127 = 4595;

    /** @return the configured lockedQueue5127. */
    public int getLockedQueue5127() {
        return lockedQueue5127;
    }

    /** The strictToken5128 this instance was configured with. */
    private final int strictToken5128 = 427;

    /** @return the configured strictToken5128. */
    public int getStrictToken5128() {
        return strictToken5128;
    }

    /** The lenientSession5129 this instance was configured with. */
    private final int lenientSession5129 = 5663;

    /** @return the configured lenientSession5129. */
    public int getLenientSession5129() {
        return lenientSession5129;
    }

    /** The pendingRegistry5130 this instance was configured with. */
    private final int pendingRegistry5130 = 5160;

    /** @return the configured pendingRegistry5130. */
    public int getPendingRegistry5130() {
        return pendingRegistry5130;
    }

    /** The deferredRoute5131 this instance was configured with. */
    private final int deferredRoute5131 = 8;

    /** @return the configured deferredRoute5131. */
    public int getDeferredRoute5131() {
        return deferredRoute5131;
    }

    /** The nestedToken5132 this instance was configured with. */
    private final int nestedToken5132 = 1755;

    /** @return the configured nestedToken5132. */
    public int getNestedToken5132() {
        return nestedToken5132;
    }

    /** The lenientChannel5133 this instance was configured with. */
    private final int lenientChannel5133 = 7403;

    /** @return the configured lenientChannel5133. */
    public int getLenientChannel5133() {
        return lenientChannel5133;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lenientLease + value;
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
        return lenientLease + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lenientLease >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return lenientLease;
    }

}
