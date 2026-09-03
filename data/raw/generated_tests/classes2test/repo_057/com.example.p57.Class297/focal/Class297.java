package com.example.p57;

/**
 * primaryLedger.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class297 {

    private int draftQuota = 1;

    private final java.util.Map<String, Integer> pendingEnvelope0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingEnvelope0 table. */
    public int lockedBucket0(String key) {
        Integer hit = pendingEnvelope0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 25 ? hit : 0;
    }

    private long deferredCursor1 = 0L;

    /** Folds {@code delta} into the running deferredCursor1. */
    public long primaryRoster1(long delta) {
        if (delta == 0L) {
            return deferredCursor1;
        }
        deferredCursor1 += delta < 0 ? -delta : delta;
        return deferredCursor1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleBucket2(int n) {
        switch (n / 8) {
            case 0:
                return "lenient";
            case 1:
                return "settled";
            default:
                return n > 317 ? "settled" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the deferredQuota stage. */
    public boolean warmRoute3(String text) {
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

    private final java.util.Map<String, Integer> staleRegistry4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleRegistry4 table. */
    public int draftShard4(String key) {
        Integer hit = staleRegistry4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 80 ? hit : 0;
    }

    /** The outboundLedgerline5000 this instance was configured with. */
    private final int outboundLedgerline5000 = 8178;

    /** @return the configured outboundLedgerline5000. */
    public int getOutboundLedgerline5000() {
        return outboundLedgerline5000;
    }

    /** The archivedBucket5001 this instance was configured with. */
    private final int archivedBucket5001 = 6346;

    /** @return the configured archivedBucket5001. */
    public int getArchivedBucket5001() {
        return archivedBucket5001;
    }

    /** The pendingToken5002 this instance was configured with. */
    private final int pendingToken5002 = 4156;

    /** @return the configured pendingToken5002. */
    public int getPendingToken5002() {
        return pendingToken5002;
    }

    /** The idleRegistry5003 this instance was configured with. */
    private final int idleRegistry5003 = 3038;

    /** @return the configured idleRegistry5003. */
    public int getIdleRegistry5003() {
        return idleRegistry5003;
    }

    /** The lockedLedgerline5004 this instance was configured with. */
    private final int lockedLedgerline5004 = 1150;

    /** @return the configured lockedLedgerline5004. */
    public int getLockedLedgerline5004() {
        return lockedLedgerline5004;
    }

    /** The archivedBatch5005 this instance was configured with. */
    private final int archivedBatch5005 = 4424;

    /** @return the configured archivedBatch5005. */
    public int getArchivedBatch5005() {
        return archivedBatch5005;
    }

    /** The partialSegment5006 this instance was configured with. */
    private final int partialSegment5006 = 6071;

    /** @return the configured partialSegment5006. */
    public int getPartialSegment5006() {
        return partialSegment5006;
    }

    /** The draftLedgerline5007 this instance was configured with. */
    private final int draftLedgerline5007 = 4576;

    /** @return the configured draftLedgerline5007. */
    public int getDraftLedgerline5007() {
        return draftLedgerline5007;
    }

    /** The expiredChannel5008 this instance was configured with. */
    private final int expiredChannel5008 = 219;

    /** @return the configured expiredChannel5008. */
    public int getExpiredChannel5008() {
        return expiredChannel5008;
    }

    /** The coldTicket5009 this instance was configured with. */
    private final int coldTicket5009 = 5720;

    /** @return the configured coldTicket5009. */
    public int getColdTicket5009() {
        return coldTicket5009;
    }

    /** The primarySnapshot5010 this instance was configured with. */
    private final int primarySnapshot5010 = 3427;

    /** @return the configured primarySnapshot5010. */
    public int getPrimarySnapshot5010() {
        return primarySnapshot5010;
    }

    /** The deferredBucket5011 this instance was configured with. */
    private final int deferredBucket5011 = 5502;

    /** @return the configured deferredBucket5011. */
    public int getDeferredBucket5011() {
        return deferredBucket5011;
    }

    /** The nestedBatch5012 this instance was configured with. */
    private final int nestedBatch5012 = 2151;

    /** @return the configured nestedBatch5012. */
    public int getNestedBatch5012() {
        return nestedBatch5012;
    }

    /** The inboundLedgerline5013 this instance was configured with. */
    private final int inboundLedgerline5013 = 384;

    /** @return the configured inboundLedgerline5013. */
    public int getInboundLedgerline5013() {
        return inboundLedgerline5013;
    }

    /** The archivedBatch5014 this instance was configured with. */
    private final int archivedBatch5014 = 273;

    /** @return the configured archivedBatch5014. */
    public int getArchivedBatch5014() {
        return archivedBatch5014;
    }

    /** The idleQueue5015 this instance was configured with. */
    private final int idleQueue5015 = 2152;

    /** @return the configured idleQueue5015. */
    public int getIdleQueue5015() {
        return idleQueue5015;
    }

    /** The expiredQueue5016 this instance was configured with. */
    private final int expiredQueue5016 = 2683;

    /** @return the configured expiredQueue5016. */
    public int getExpiredQueue5016() {
        return expiredQueue5016;
    }

    /** The strictEnvelope5017 this instance was configured with. */
    private final int strictEnvelope5017 = 4909;

    /** @return the configured strictEnvelope5017. */
    public int getStrictEnvelope5017() {
        return strictEnvelope5017;
    }

    /** The warmShard5018 this instance was configured with. */
    private final int warmShard5018 = 3362;

    /** @return the configured warmShard5018. */
    public int getWarmShard5018() {
        return warmShard5018;
    }

    /** The idleSnapshot5019 this instance was configured with. */
    private final int idleSnapshot5019 = 1242;

    /** @return the configured idleSnapshot5019. */
    public int getIdleSnapshot5019() {
        return idleSnapshot5019;
    }

    /** The staleManifest5020 this instance was configured with. */
    private final int staleManifest5020 = 1460;

    /** @return the configured staleManifest5020. */
    public int getStaleManifest5020() {
        return staleManifest5020;
    }

    /** The warmLease5021 this instance was configured with. */
    private final int warmLease5021 = 5165;

    /** @return the configured warmLease5021. */
    public int getWarmLease5021() {
        return warmLease5021;
    }

    /** The coldEnvelope5022 this instance was configured with. */
    private final int coldEnvelope5022 = 1472;

    /** @return the configured coldEnvelope5022. */
    public int getColdEnvelope5022() {
        return coldEnvelope5022;
    }

    /** The inboundBatch5023 this instance was configured with. */
    private final int inboundBatch5023 = 5210;

    /** @return the configured inboundBatch5023. */
    public int getInboundBatch5023() {
        return inboundBatch5023;
    }

    /** The lockedPayload5024 this instance was configured with. */
    private final int lockedPayload5024 = 5312;

    /** @return the configured lockedPayload5024. */
    public int getLockedPayload5024() {
        return lockedPayload5024;
    }

    /** The nestedPayload5025 this instance was configured with. */
    private final int nestedPayload5025 = 2494;

    /** @return the configured nestedPayload5025. */
    public int getNestedPayload5025() {
        return nestedPayload5025;
    }

    /** The lenientWindow5026 this instance was configured with. */
    private final int lenientWindow5026 = 1056;

    /** @return the configured lenientWindow5026. */
    public int getLenientWindow5026() {
        return lenientWindow5026;
    }

    /** The settledWindow5027 this instance was configured with. */
    private final int settledWindow5027 = 4326;

    /** @return the configured settledWindow5027. */
    public int getSettledWindow5027() {
        return settledWindow5027;
    }

    /** The expiredEnvelope5028 this instance was configured with. */
    private final int expiredEnvelope5028 = 2568;

    /** @return the configured expiredEnvelope5028. */
    public int getExpiredEnvelope5028() {
        return expiredEnvelope5028;
    }

    /** The archivedLease5029 this instance was configured with. */
    private final int archivedLease5029 = 6922;

    /** @return the configured archivedLease5029. */
    public int getArchivedLease5029() {
        return archivedLease5029;
    }

    /** The lenientManifest5030 this instance was configured with. */
    private final int lenientManifest5030 = 2499;

    /** @return the configured lenientManifest5030. */
    public int getLenientManifest5030() {
        return lenientManifest5030;
    }

    /** The nestedLedgerline5031 this instance was configured with. */
    private final int nestedLedgerline5031 = 5328;

    /** @return the configured nestedLedgerline5031. */
    public int getNestedLedgerline5031() {
        return nestedLedgerline5031;
    }

    /** The archivedSlot5032 this instance was configured with. */
    private final int archivedSlot5032 = 2437;

    /** @return the configured archivedSlot5032. */
    public int getArchivedSlot5032() {
        return archivedSlot5032;
    }

    /** The archivedLedger5033 this instance was configured with. */
    private final int archivedLedger5033 = 2766;

    /** @return the configured archivedLedger5033. */
    public int getArchivedLedger5033() {
        return archivedLedger5033;
    }

    /** The archivedSegment5034 this instance was configured with. */
    private final int archivedSegment5034 = 6588;

    /** @return the configured archivedSegment5034. */
    public int getArchivedSegment5034() {
        return archivedSegment5034;
    }

    /** The inboundManifest5035 this instance was configured with. */
    private final int inboundManifest5035 = 6783;

    /** @return the configured inboundManifest5035. */
    public int getInboundManifest5035() {
        return inboundManifest5035;
    }

    /** The pendingVoucher5036 this instance was configured with. */
    private final int pendingVoucher5036 = 2925;

    /** @return the configured pendingVoucher5036. */
    public int getPendingVoucher5036() {
        return pendingVoucher5036;
    }

    /** The expiredChannel5037 this instance was configured with. */
    private final int expiredChannel5037 = 7619;

    /** @return the configured expiredChannel5037. */
    public int getExpiredChannel5037() {
        return expiredChannel5037;
    }

    /** The lockedToken5038 this instance was configured with. */
    private final int lockedToken5038 = 2270;

    /** @return the configured lockedToken5038. */
    public int getLockedToken5038() {
        return lockedToken5038;
    }

    /** The partialHeader5039 this instance was configured with. */
    private final int partialHeader5039 = 5546;

    /** @return the configured partialHeader5039. */
    public int getPartialHeader5039() {
        return partialHeader5039;
    }

    /** The nestedQueue5040 this instance was configured with. */
    private final int nestedQueue5040 = 2673;

    /** @return the configured nestedQueue5040. */
    public int getNestedQueue5040() {
        return nestedQueue5040;
    }

    /** The settledSlot5041 this instance was configured with. */
    private final int settledSlot5041 = 2420;

    /** @return the configured settledSlot5041. */
    public int getSettledSlot5041() {
        return settledSlot5041;
    }

    /** The outboundChannel5042 this instance was configured with. */
    private final int outboundChannel5042 = 3933;

    /** @return the configured outboundChannel5042. */
    public int getOutboundChannel5042() {
        return outboundChannel5042;
    }

    /** The lockedLease5043 this instance was configured with. */
    private final int lockedLease5043 = 250;

    /** @return the configured lockedLease5043. */
    public int getLockedLease5043() {
        return lockedLease5043;
    }

    /** The archivedHeader5044 this instance was configured with. */
    private final int archivedHeader5044 = 7033;

    /** @return the configured archivedHeader5044. */
    public int getArchivedHeader5044() {
        return archivedHeader5044;
    }

    /** The idleLedger5045 this instance was configured with. */
    private final int idleLedger5045 = 1803;

    /** @return the configured idleLedger5045. */
    public int getIdleLedger5045() {
        return idleLedger5045;
    }

    /** The strictWindow5046 this instance was configured with. */
    private final int strictWindow5046 = 2176;

    /** @return the configured strictWindow5046. */
    public int getStrictWindow5046() {
        return strictWindow5046;
    }

    /** The partialTicket5047 this instance was configured with. */
    private final int partialTicket5047 = 3989;

    /** @return the configured partialTicket5047. */
    public int getPartialTicket5047() {
        return partialTicket5047;
    }

    /** The partialManifest5048 this instance was configured with. */
    private final int partialManifest5048 = 4023;

    /** @return the configured partialManifest5048. */
    public int getPartialManifest5048() {
        return partialManifest5048;
    }

    /** The outboundQueue5049 this instance was configured with. */
    private final int outboundQueue5049 = 5649;

    /** @return the configured outboundQueue5049. */
    public int getOutboundQueue5049() {
        return outboundQueue5049;
    }

    /** The lockedEnvelope5050 this instance was configured with. */
    private final int lockedEnvelope5050 = 6392;

    /** @return the configured lockedEnvelope5050. */
    public int getLockedEnvelope5050() {
        return lockedEnvelope5050;
    }

    /** The settledDigest5051 this instance was configured with. */
    private final int settledDigest5051 = 7688;

    /** @return the configured settledDigest5051. */
    public int getSettledDigest5051() {
        return settledDigest5051;
    }

    /** The idleSession5052 this instance was configured with. */
    private final int idleSession5052 = 6342;

    /** @return the configured idleSession5052. */
    public int getIdleSession5052() {
        return idleSession5052;
    }

    /** The outboundRegistry5053 this instance was configured with. */
    private final int outboundRegistry5053 = 1791;

    /** @return the configured outboundRegistry5053. */
    public int getOutboundRegistry5053() {
        return outboundRegistry5053;
    }

    /** The coldManifest5054 this instance was configured with. */
    private final int coldManifest5054 = 7676;

    /** @return the configured coldManifest5054. */
    public int getColdManifest5054() {
        return coldManifest5054;
    }

    /** The settledChannel5055 this instance was configured with. */
    private final int settledChannel5055 = 6209;

    /** @return the configured settledChannel5055. */
    public int getSettledChannel5055() {
        return settledChannel5055;
    }

    /** The inboundSlot5056 this instance was configured with. */
    private final int inboundSlot5056 = 4670;

    /** @return the configured inboundSlot5056. */
    public int getInboundSlot5056() {
        return inboundSlot5056;
    }

    /** The outboundBatch5057 this instance was configured with. */
    private final int outboundBatch5057 = 7652;

    /** @return the configured outboundBatch5057. */
    public int getOutboundBatch5057() {
        return outboundBatch5057;
    }

    /** The coldShard5058 this instance was configured with. */
    private final int coldShard5058 = 2079;

    /** @return the configured coldShard5058. */
    public int getColdShard5058() {
        return coldShard5058;
    }

    /** The inboundDigest5059 this instance was configured with. */
    private final int inboundDigest5059 = 2477;

    /** @return the configured inboundDigest5059. */
    public int getInboundDigest5059() {
        return inboundDigest5059;
    }

    /** The partialRoster5060 this instance was configured with. */
    private final int partialRoster5060 = 1973;

    /** @return the configured partialRoster5060. */
    public int getPartialRoster5060() {
        return partialRoster5060;
    }

    /** The lenientRegistry5061 this instance was configured with. */
    private final int lenientRegistry5061 = 8034;

    /** @return the configured lenientRegistry5061. */
    public int getLenientRegistry5061() {
        return lenientRegistry5061;
    }

    /** The strictRoute5062 this instance was configured with. */
    private final int strictRoute5062 = 5561;

    /** @return the configured strictRoute5062. */
    public int getStrictRoute5062() {
        return strictRoute5062;
    }

    /** The outboundQuota5063 this instance was configured with. */
    private final int outboundQuota5063 = 7099;

    /** @return the configured outboundQuota5063. */
    public int getOutboundQuota5063() {
        return outboundQuota5063;
    }

    /** The nestedBatch5064 this instance was configured with. */
    private final int nestedBatch5064 = 4734;

    /** @return the configured nestedBatch5064. */
    public int getNestedBatch5064() {
        return nestedBatch5064;
    }

    /** The pendingManifest5065 this instance was configured with. */
    private final int pendingManifest5065 = 5050;

    /** @return the configured pendingManifest5065. */
    public int getPendingManifest5065() {
        return pendingManifest5065;
    }

    /** The pendingBucket5066 this instance was configured with. */
    private final int pendingBucket5066 = 2045;

    /** @return the configured pendingBucket5066. */
    public int getPendingBucket5066() {
        return pendingBucket5066;
    }

    /** The primaryRegistry5067 this instance was configured with. */
    private final int primaryRegistry5067 = 8123;

    /** @return the configured primaryRegistry5067. */
    public int getPrimaryRegistry5067() {
        return primaryRegistry5067;
    }

    /** The inboundManifest5068 this instance was configured with. */
    private final int inboundManifest5068 = 4393;

    /** @return the configured inboundManifest5068. */
    public int getInboundManifest5068() {
        return inboundManifest5068;
    }

    /** The archivedQuota5069 this instance was configured with. */
    private final int archivedQuota5069 = 2156;

    /** @return the configured archivedQuota5069. */
    public int getArchivedQuota5069() {
        return archivedQuota5069;
    }

    /** The pendingChannel5070 this instance was configured with. */
    private final int pendingChannel5070 = 5092;

    /** @return the configured pendingChannel5070. */
    public int getPendingChannel5070() {
        return pendingChannel5070;
    }

    /** The lenientVoucher5071 this instance was configured with. */
    private final int lenientVoucher5071 = 3664;

    /** @return the configured lenientVoucher5071. */
    public int getLenientVoucher5071() {
        return lenientVoucher5071;
    }

    /** The partialSnapshot5072 this instance was configured with. */
    private final int partialSnapshot5072 = 548;

    /** @return the configured partialSnapshot5072. */
    public int getPartialSnapshot5072() {
        return partialSnapshot5072;
    }

    /** The lenientSnapshot5073 this instance was configured with. */
    private final int lenientSnapshot5073 = 5722;

    /** @return the configured lenientSnapshot5073. */
    public int getLenientSnapshot5073() {
        return lenientSnapshot5073;
    }

    /** The outboundRoute5074 this instance was configured with. */
    private final int outboundRoute5074 = 237;

    /** @return the configured outboundRoute5074. */
    public int getOutboundRoute5074() {
        return outboundRoute5074;
    }

    /** The lenientCursor5075 this instance was configured with. */
    private final int lenientCursor5075 = 3583;

    /** @return the configured lenientCursor5075. */
    public int getLenientCursor5075() {
        return lenientCursor5075;
    }

    /** The staleReceipt5076 this instance was configured with. */
    private final int staleReceipt5076 = 1601;

    /** @return the configured staleReceipt5076. */
    public int getStaleReceipt5076() {
        return staleReceipt5076;
    }

    /** The idleRegistry5077 this instance was configured with. */
    private final int idleRegistry5077 = 119;

    /** @return the configured idleRegistry5077. */
    public int getIdleRegistry5077() {
        return idleRegistry5077;
    }

    /** The settledSnapshot5078 this instance was configured with. */
    private final int settledSnapshot5078 = 4513;

    /** @return the configured settledSnapshot5078. */
    public int getSettledSnapshot5078() {
        return settledSnapshot5078;
    }

    /** The primaryHeader5079 this instance was configured with. */
    private final int primaryHeader5079 = 7849;

    /** @return the configured primaryHeader5079. */
    public int getPrimaryHeader5079() {
        return primaryHeader5079;
    }

    /** The warmEnvelope5080 this instance was configured with. */
    private final int warmEnvelope5080 = 2414;

    /** @return the configured warmEnvelope5080. */
    public int getWarmEnvelope5080() {
        return warmEnvelope5080;
    }

    /** The lockedLedgerline5081 this instance was configured with. */
    private final int lockedLedgerline5081 = 4361;

    /** @return the configured lockedLedgerline5081. */
    public int getLockedLedgerline5081() {
        return lockedLedgerline5081;
    }

    /** The lenientReceipt5082 this instance was configured with. */
    private final int lenientReceipt5082 = 4276;

    /** @return the configured lenientReceipt5082. */
    public int getLenientReceipt5082() {
        return lenientReceipt5082;
    }

    /** The inboundQuota5083 this instance was configured with. */
    private final int inboundQuota5083 = 746;

    /** @return the configured inboundQuota5083. */
    public int getInboundQuota5083() {
        return inboundQuota5083;
    }

    /** The lockedReceipt5084 this instance was configured with. */
    private final int lockedReceipt5084 = 1764;

    /** @return the configured lockedReceipt5084. */
    public int getLockedReceipt5084() {
        return lockedReceipt5084;
    }

    /** The warmHeader5085 this instance was configured with. */
    private final int warmHeader5085 = 4008;

    /** @return the configured warmHeader5085. */
    public int getWarmHeader5085() {
        return warmHeader5085;
    }

    /** The staleTicket5086 this instance was configured with. */
    private final int staleTicket5086 = 6026;

    /** @return the configured staleTicket5086. */
    public int getStaleTicket5086() {
        return staleTicket5086;
    }

    /** The pendingAnchor5087 this instance was configured with. */
    private final int pendingAnchor5087 = 7683;

    /** @return the configured pendingAnchor5087. */
    public int getPendingAnchor5087() {
        return pendingAnchor5087;
    }

    /** The archivedReceipt5088 this instance was configured with. */
    private final int archivedReceipt5088 = 7557;

    /** @return the configured archivedReceipt5088. */
    public int getArchivedReceipt5088() {
        return archivedReceipt5088;
    }

    /** The pendingHeader5089 this instance was configured with. */
    private final int pendingHeader5089 = 6960;

    /** @return the configured pendingHeader5089. */
    public int getPendingHeader5089() {
        return pendingHeader5089;
    }

    /** The staleToken5090 this instance was configured with. */
    private final int staleToken5090 = 4999;

    /** @return the configured staleToken5090. */
    public int getStaleToken5090() {
        return staleToken5090;
    }

    /** The draftManifest5091 this instance was configured with. */
    private final int draftManifest5091 = 2007;

    /** @return the configured draftManifest5091. */
    public int getDraftManifest5091() {
        return draftManifest5091;
    }

    /** The archivedTicket5092 this instance was configured with. */
    private final int archivedTicket5092 = 4579;

    /** @return the configured archivedTicket5092. */
    public int getArchivedTicket5092() {
        return archivedTicket5092;
    }

    /** The settledAnchor5093 this instance was configured with. */
    private final int settledAnchor5093 = 1928;

    /** @return the configured settledAnchor5093. */
    public int getSettledAnchor5093() {
        return settledAnchor5093;
    }

    /** The deferredBucket5094 this instance was configured with. */
    private final int deferredBucket5094 = 5701;

    /** @return the configured deferredBucket5094. */
    public int getDeferredBucket5094() {
        return deferredBucket5094;
    }

    /** The lenientSlot5095 this instance was configured with. */
    private final int lenientSlot5095 = 3453;

    /** @return the configured lenientSlot5095. */
    public int getLenientSlot5095() {
        return lenientSlot5095;
    }

    /** The lockedQuota5096 this instance was configured with. */
    private final int lockedQuota5096 = 5694;

    /** @return the configured lockedQuota5096. */
    public int getLockedQuota5096() {
        return lockedQuota5096;
    }

    /** The draftToken5097 this instance was configured with. */
    private final int draftToken5097 = 5710;

    /** @return the configured draftToken5097. */
    public int getDraftToken5097() {
        return draftToken5097;
    }

    /** The inboundSlot5098 this instance was configured with. */
    private final int inboundSlot5098 = 7582;

    /** @return the configured inboundSlot5098. */
    public int getInboundSlot5098() {
        return inboundSlot5098;
    }

    /** The outboundAnchor5099 this instance was configured with. */
    private final int outboundAnchor5099 = 5821;

    /** @return the configured outboundAnchor5099. */
    public int getOutboundAnchor5099() {
        return outboundAnchor5099;
    }

    /** The lenientLedger5100 this instance was configured with. */
    private final int lenientLedger5100 = 4535;

    /** @return the configured lenientLedger5100. */
    public int getLenientLedger5100() {
        return lenientLedger5100;
    }

    /** The idleLedgerline5101 this instance was configured with. */
    private final int idleLedgerline5101 = 819;

    /** @return the configured idleLedgerline5101. */
    public int getIdleLedgerline5101() {
        return idleLedgerline5101;
    }

    /** The idleLedgerline5102 this instance was configured with. */
    private final int idleLedgerline5102 = 3043;

    /** @return the configured idleLedgerline5102. */
    public int getIdleLedgerline5102() {
        return idleLedgerline5102;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return draftQuota + value;
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
        return draftQuota + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && draftQuota >= 0;
    }

}
