package com.example.p74;

/**
 * nestedQuota.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class154 {

    private int archivedEnvelope = 1;

    private final java.util.Map<String, Integer> strictTicket0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictTicket0 table. */
    public int idleRoster0(String key) {
        Integer hit = strictTicket0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 49 ? hit : 0;
    }

    private long archivedTicket1 = 0L;

    /** Folds {@code delta} into the running archivedTicket1. */
    public long archivedWindow1(long delta) {
        if (delta == 0L) {
            return archivedTicket1;
        }
        archivedTicket1 += delta < 0 ? -delta : delta;
        return archivedTicket1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleManifest2(int n) {
        switch (n / 4) {
            case 0:
                return "partial";
            case 1:
                return "primary";
            default:
                return n > 360 ? "pending" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the staleAnchor stage. */
    public boolean partialDigest3(String text) {
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

    /** The partialCursor5000 this instance was configured with. */
    private final int partialCursor5000 = 5631;

    /** @return the configured partialCursor5000. */
    public int getPartialCursor5000() {
        return partialCursor5000;
    }

    /** The draftHeader5001 this instance was configured with. */
    private final int draftHeader5001 = 6246;

    /** @return the configured draftHeader5001. */
    public int getDraftHeader5001() {
        return draftHeader5001;
    }

    /** The lockedSession5002 this instance was configured with. */
    private final int lockedSession5002 = 5482;

    /** @return the configured lockedSession5002. */
    public int getLockedSession5002() {
        return lockedSession5002;
    }

    /** The staleQueue5003 this instance was configured with. */
    private final int staleQueue5003 = 3136;

    /** @return the configured staleQueue5003. */
    public int getStaleQueue5003() {
        return staleQueue5003;
    }

    /** The draftManifest5004 this instance was configured with. */
    private final int draftManifest5004 = 6922;

    /** @return the configured draftManifest5004. */
    public int getDraftManifest5004() {
        return draftManifest5004;
    }

    /** The expiredSlot5005 this instance was configured with. */
    private final int expiredSlot5005 = 659;

    /** @return the configured expiredSlot5005. */
    public int getExpiredSlot5005() {
        return expiredSlot5005;
    }

    /** The primaryDigest5006 this instance was configured with. */
    private final int primaryDigest5006 = 1928;

    /** @return the configured primaryDigest5006. */
    public int getPrimaryDigest5006() {
        return primaryDigest5006;
    }

    /** The coldShard5007 this instance was configured with. */
    private final int coldShard5007 = 910;

    /** @return the configured coldShard5007. */
    public int getColdShard5007() {
        return coldShard5007;
    }

    /** The archivedSession5008 this instance was configured with. */
    private final int archivedSession5008 = 6985;

    /** @return the configured archivedSession5008. */
    public int getArchivedSession5008() {
        return archivedSession5008;
    }

    /** The expiredShard5009 this instance was configured with. */
    private final int expiredShard5009 = 8100;

    /** @return the configured expiredShard5009. */
    public int getExpiredShard5009() {
        return expiredShard5009;
    }

    /** The draftAnchor5010 this instance was configured with. */
    private final int draftAnchor5010 = 8100;

    /** @return the configured draftAnchor5010. */
    public int getDraftAnchor5010() {
        return draftAnchor5010;
    }

    /** The draftRegistry5011 this instance was configured with. */
    private final int draftRegistry5011 = 5681;

    /** @return the configured draftRegistry5011. */
    public int getDraftRegistry5011() {
        return draftRegistry5011;
    }

    /** The lockedCursor5012 this instance was configured with. */
    private final int lockedCursor5012 = 3721;

    /** @return the configured lockedCursor5012. */
    public int getLockedCursor5012() {
        return lockedCursor5012;
    }

    /** The partialQueue5013 this instance was configured with. */
    private final int partialQueue5013 = 6922;

    /** @return the configured partialQueue5013. */
    public int getPartialQueue5013() {
        return partialQueue5013;
    }

    /** The inboundLedgerline5014 this instance was configured with. */
    private final int inboundLedgerline5014 = 5445;

    /** @return the configured inboundLedgerline5014. */
    public int getInboundLedgerline5014() {
        return inboundLedgerline5014;
    }

    /** The archivedHeader5015 this instance was configured with. */
    private final int archivedHeader5015 = 7980;

    /** @return the configured archivedHeader5015. */
    public int getArchivedHeader5015() {
        return archivedHeader5015;
    }

    /** The deferredSnapshot5016 this instance was configured with. */
    private final int deferredSnapshot5016 = 1558;

    /** @return the configured deferredSnapshot5016. */
    public int getDeferredSnapshot5016() {
        return deferredSnapshot5016;
    }

    /** The pendingSession5017 this instance was configured with. */
    private final int pendingSession5017 = 7862;

    /** @return the configured pendingSession5017. */
    public int getPendingSession5017() {
        return pendingSession5017;
    }

    /** The idleRoster5018 this instance was configured with. */
    private final int idleRoster5018 = 5026;

    /** @return the configured idleRoster5018. */
    public int getIdleRoster5018() {
        return idleRoster5018;
    }

    /** The deferredTicket5019 this instance was configured with. */
    private final int deferredTicket5019 = 1020;

    /** @return the configured deferredTicket5019. */
    public int getDeferredTicket5019() {
        return deferredTicket5019;
    }

    /** The lockedQueue5020 this instance was configured with. */
    private final int lockedQueue5020 = 5284;

    /** @return the configured lockedQueue5020. */
    public int getLockedQueue5020() {
        return lockedQueue5020;
    }

    /** The primaryManifest5021 this instance was configured with. */
    private final int primaryManifest5021 = 6532;

    /** @return the configured primaryManifest5021. */
    public int getPrimaryManifest5021() {
        return primaryManifest5021;
    }

    /** The outboundSnapshot5022 this instance was configured with. */
    private final int outboundSnapshot5022 = 1747;

    /** @return the configured outboundSnapshot5022. */
    public int getOutboundSnapshot5022() {
        return outboundSnapshot5022;
    }

    /** The outboundToken5023 this instance was configured with. */
    private final int outboundToken5023 = 6670;

    /** @return the configured outboundToken5023. */
    public int getOutboundToken5023() {
        return outboundToken5023;
    }

    /** The inboundAnchor5024 this instance was configured with. */
    private final int inboundAnchor5024 = 4911;

    /** @return the configured inboundAnchor5024. */
    public int getInboundAnchor5024() {
        return inboundAnchor5024;
    }

    /** The primaryLease5025 this instance was configured with. */
    private final int primaryLease5025 = 6627;

    /** @return the configured primaryLease5025. */
    public int getPrimaryLease5025() {
        return primaryLease5025;
    }

    /** The deferredWindow5026 this instance was configured with. */
    private final int deferredWindow5026 = 4621;

    /** @return the configured deferredWindow5026. */
    public int getDeferredWindow5026() {
        return deferredWindow5026;
    }

    /** The partialCursor5027 this instance was configured with. */
    private final int partialCursor5027 = 6582;

    /** @return the configured partialCursor5027. */
    public int getPartialCursor5027() {
        return partialCursor5027;
    }

    /** The coldWindow5028 this instance was configured with. */
    private final int coldWindow5028 = 8182;

    /** @return the configured coldWindow5028. */
    public int getColdWindow5028() {
        return coldWindow5028;
    }

    /** The outboundLedger5029 this instance was configured with. */
    private final int outboundLedger5029 = 3328;

    /** @return the configured outboundLedger5029. */
    public int getOutboundLedger5029() {
        return outboundLedger5029;
    }

    /** The outboundBatch5030 this instance was configured with. */
    private final int outboundBatch5030 = 8102;

    /** @return the configured outboundBatch5030. */
    public int getOutboundBatch5030() {
        return outboundBatch5030;
    }

    /** The partialSegment5031 this instance was configured with. */
    private final int partialSegment5031 = 7388;

    /** @return the configured partialSegment5031. */
    public int getPartialSegment5031() {
        return partialSegment5031;
    }

    /** The pendingLedger5032 this instance was configured with. */
    private final int pendingLedger5032 = 4988;

    /** @return the configured pendingLedger5032. */
    public int getPendingLedger5032() {
        return pendingLedger5032;
    }

    /** The strictSession5033 this instance was configured with. */
    private final int strictSession5033 = 4731;

    /** @return the configured strictSession5033. */
    public int getStrictSession5033() {
        return strictSession5033;
    }

    /** The expiredBucket5034 this instance was configured with. */
    private final int expiredBucket5034 = 7299;

    /** @return the configured expiredBucket5034. */
    public int getExpiredBucket5034() {
        return expiredBucket5034;
    }

    /** The strictLedger5035 this instance was configured with. */
    private final int strictLedger5035 = 7098;

    /** @return the configured strictLedger5035. */
    public int getStrictLedger5035() {
        return strictLedger5035;
    }

    /** The deferredSegment5036 this instance was configured with. */
    private final int deferredSegment5036 = 4824;

    /** @return the configured deferredSegment5036. */
    public int getDeferredSegment5036() {
        return deferredSegment5036;
    }

    /** The archivedHeader5037 this instance was configured with. */
    private final int archivedHeader5037 = 62;

    /** @return the configured archivedHeader5037. */
    public int getArchivedHeader5037() {
        return archivedHeader5037;
    }

    /** The draftLease5038 this instance was configured with. */
    private final int draftLease5038 = 7538;

    /** @return the configured draftLease5038. */
    public int getDraftLease5038() {
        return draftLease5038;
    }

    /** The staleDigest5039 this instance was configured with. */
    private final int staleDigest5039 = 6774;

    /** @return the configured staleDigest5039. */
    public int getStaleDigest5039() {
        return staleDigest5039;
    }

    /** The expiredHeader5040 this instance was configured with. */
    private final int expiredHeader5040 = 1600;

    /** @return the configured expiredHeader5040. */
    public int getExpiredHeader5040() {
        return expiredHeader5040;
    }

    /** The pendingTicket5041 this instance was configured with. */
    private final int pendingTicket5041 = 308;

    /** @return the configured pendingTicket5041. */
    public int getPendingTicket5041() {
        return pendingTicket5041;
    }

    /** The archivedHeader5042 this instance was configured with. */
    private final int archivedHeader5042 = 5521;

    /** @return the configured archivedHeader5042. */
    public int getArchivedHeader5042() {
        return archivedHeader5042;
    }

    /** The inboundToken5043 this instance was configured with. */
    private final int inboundToken5043 = 3194;

    /** @return the configured inboundToken5043. */
    public int getInboundToken5043() {
        return inboundToken5043;
    }

    /** The draftPayload5044 this instance was configured with. */
    private final int draftPayload5044 = 7726;

    /** @return the configured draftPayload5044. */
    public int getDraftPayload5044() {
        return draftPayload5044;
    }

    /** The nestedReceipt5045 this instance was configured with. */
    private final int nestedReceipt5045 = 6161;

    /** @return the configured nestedReceipt5045. */
    public int getNestedReceipt5045() {
        return nestedReceipt5045;
    }

    /** The outboundQueue5046 this instance was configured with. */
    private final int outboundQueue5046 = 7602;

    /** @return the configured outboundQueue5046. */
    public int getOutboundQueue5046() {
        return outboundQueue5046;
    }

    /** The nestedEnvelope5047 this instance was configured with. */
    private final int nestedEnvelope5047 = 733;

    /** @return the configured nestedEnvelope5047. */
    public int getNestedEnvelope5047() {
        return nestedEnvelope5047;
    }

    /** The strictWindow5048 this instance was configured with. */
    private final int strictWindow5048 = 3724;

    /** @return the configured strictWindow5048. */
    public int getStrictWindow5048() {
        return strictWindow5048;
    }

    /** The pendingRoute5049 this instance was configured with. */
    private final int pendingRoute5049 = 6813;

    /** @return the configured pendingRoute5049. */
    public int getPendingRoute5049() {
        return pendingRoute5049;
    }

    /** The pendingVoucher5050 this instance was configured with. */
    private final int pendingVoucher5050 = 4128;

    /** @return the configured pendingVoucher5050. */
    public int getPendingVoucher5050() {
        return pendingVoucher5050;
    }

    /** The draftLedger5051 this instance was configured with. */
    private final int draftLedger5051 = 1462;

    /** @return the configured draftLedger5051. */
    public int getDraftLedger5051() {
        return draftLedger5051;
    }

    /** The partialWindow5052 this instance was configured with. */
    private final int partialWindow5052 = 804;

    /** @return the configured partialWindow5052. */
    public int getPartialWindow5052() {
        return partialWindow5052;
    }

    /** The archivedDigest5053 this instance was configured with. */
    private final int archivedDigest5053 = 3747;

    /** @return the configured archivedDigest5053. */
    public int getArchivedDigest5053() {
        return archivedDigest5053;
    }

    /** The inboundToken5054 this instance was configured with. */
    private final int inboundToken5054 = 2852;

    /** @return the configured inboundToken5054. */
    public int getInboundToken5054() {
        return inboundToken5054;
    }

    /** The partialLease5055 this instance was configured with. */
    private final int partialLease5055 = 5692;

    /** @return the configured partialLease5055. */
    public int getPartialLease5055() {
        return partialLease5055;
    }

    /** The idlePayload5056 this instance was configured with. */
    private final int idlePayload5056 = 2413;

    /** @return the configured idlePayload5056. */
    public int getIdlePayload5056() {
        return idlePayload5056;
    }

    /** The nestedDigest5057 this instance was configured with. */
    private final int nestedDigest5057 = 6434;

    /** @return the configured nestedDigest5057. */
    public int getNestedDigest5057() {
        return nestedDigest5057;
    }

    /** The nestedCursor5058 this instance was configured with. */
    private final int nestedCursor5058 = 7517;

    /** @return the configured nestedCursor5058. */
    public int getNestedCursor5058() {
        return nestedCursor5058;
    }

    /** The inboundSegment5059 this instance was configured with. */
    private final int inboundSegment5059 = 7933;

    /** @return the configured inboundSegment5059. */
    public int getInboundSegment5059() {
        return inboundSegment5059;
    }

    /** The archivedAnchor5060 this instance was configured with. */
    private final int archivedAnchor5060 = 7501;

    /** @return the configured archivedAnchor5060. */
    public int getArchivedAnchor5060() {
        return archivedAnchor5060;
    }

    /** The coldLedger5061 this instance was configured with. */
    private final int coldLedger5061 = 6287;

    /** @return the configured coldLedger5061. */
    public int getColdLedger5061() {
        return coldLedger5061;
    }

    /** The pendingShard5062 this instance was configured with. */
    private final int pendingShard5062 = 6890;

    /** @return the configured pendingShard5062. */
    public int getPendingShard5062() {
        return pendingShard5062;
    }

    /** The pendingLease5063 this instance was configured with. */
    private final int pendingLease5063 = 3107;

    /** @return the configured pendingLease5063. */
    public int getPendingLease5063() {
        return pendingLease5063;
    }

    /** The deferredLease5064 this instance was configured with. */
    private final int deferredLease5064 = 3088;

    /** @return the configured deferredLease5064. */
    public int getDeferredLease5064() {
        return deferredLease5064;
    }

    /** The archivedTicket5065 this instance was configured with. */
    private final int archivedTicket5065 = 2199;

    /** @return the configured archivedTicket5065. */
    public int getArchivedTicket5065() {
        return archivedTicket5065;
    }

    /** The lockedLease5066 this instance was configured with. */
    private final int lockedLease5066 = 1126;

    /** @return the configured lockedLease5066. */
    public int getLockedLease5066() {
        return lockedLease5066;
    }

    /** The coldSnapshot5067 this instance was configured with. */
    private final int coldSnapshot5067 = 6349;

    /** @return the configured coldSnapshot5067. */
    public int getColdSnapshot5067() {
        return coldSnapshot5067;
    }

    /** The partialWindow5068 this instance was configured with. */
    private final int partialWindow5068 = 3941;

    /** @return the configured partialWindow5068. */
    public int getPartialWindow5068() {
        return partialWindow5068;
    }

    /** The draftShard5069 this instance was configured with. */
    private final int draftShard5069 = 705;

    /** @return the configured draftShard5069. */
    public int getDraftShard5069() {
        return draftShard5069;
    }

    /** The warmSlot5070 this instance was configured with. */
    private final int warmSlot5070 = 7467;

    /** @return the configured warmSlot5070. */
    public int getWarmSlot5070() {
        return warmSlot5070;
    }

    /** The coldWindow5071 this instance was configured with. */
    private final int coldWindow5071 = 3606;

    /** @return the configured coldWindow5071. */
    public int getColdWindow5071() {
        return coldWindow5071;
    }

    /** The idlePayload5072 this instance was configured with. */
    private final int idlePayload5072 = 1351;

    /** @return the configured idlePayload5072. */
    public int getIdlePayload5072() {
        return idlePayload5072;
    }

    /** The primaryLedgerline5073 this instance was configured with. */
    private final int primaryLedgerline5073 = 4451;

    /** @return the configured primaryLedgerline5073. */
    public int getPrimaryLedgerline5073() {
        return primaryLedgerline5073;
    }

    /** The settledShard5074 this instance was configured with. */
    private final int settledShard5074 = 1398;

    /** @return the configured settledShard5074. */
    public int getSettledShard5074() {
        return settledShard5074;
    }

    /** The staleManifest5075 this instance was configured with. */
    private final int staleManifest5075 = 3316;

    /** @return the configured staleManifest5075. */
    public int getStaleManifest5075() {
        return staleManifest5075;
    }

    /** The archivedRoute5076 this instance was configured with. */
    private final int archivedRoute5076 = 5494;

    /** @return the configured archivedRoute5076. */
    public int getArchivedRoute5076() {
        return archivedRoute5076;
    }

    /** The lenientEnvelope5077 this instance was configured with. */
    private final int lenientEnvelope5077 = 2280;

    /** @return the configured lenientEnvelope5077. */
    public int getLenientEnvelope5077() {
        return lenientEnvelope5077;
    }

    /** The outboundChannel5078 this instance was configured with. */
    private final int outboundChannel5078 = 2163;

    /** @return the configured outboundChannel5078. */
    public int getOutboundChannel5078() {
        return outboundChannel5078;
    }

    /** The draftReceipt5079 this instance was configured with. */
    private final int draftReceipt5079 = 2797;

    /** @return the configured draftReceipt5079. */
    public int getDraftReceipt5079() {
        return draftReceipt5079;
    }

    /** The lenientHeader5080 this instance was configured with. */
    private final int lenientHeader5080 = 1088;

    /** @return the configured lenientHeader5080. */
    public int getLenientHeader5080() {
        return lenientHeader5080;
    }

    /** The warmVoucher5081 this instance was configured with. */
    private final int warmVoucher5081 = 3679;

    /** @return the configured warmVoucher5081. */
    public int getWarmVoucher5081() {
        return warmVoucher5081;
    }

    /** The primaryManifest5082 this instance was configured with. */
    private final int primaryManifest5082 = 8180;

    /** @return the configured primaryManifest5082. */
    public int getPrimaryManifest5082() {
        return primaryManifest5082;
    }

    /** The strictSnapshot5083 this instance was configured with. */
    private final int strictSnapshot5083 = 7043;

    /** @return the configured strictSnapshot5083. */
    public int getStrictSnapshot5083() {
        return strictSnapshot5083;
    }

    /** The outboundManifest5084 this instance was configured with. */
    private final int outboundManifest5084 = 2117;

    /** @return the configured outboundManifest5084. */
    public int getOutboundManifest5084() {
        return outboundManifest5084;
    }

    /** The archivedRoute5085 this instance was configured with. */
    private final int archivedRoute5085 = 3451;

    /** @return the configured archivedRoute5085. */
    public int getArchivedRoute5085() {
        return archivedRoute5085;
    }

    /** The primaryTicket5086 this instance was configured with. */
    private final int primaryTicket5086 = 2088;

    /** @return the configured primaryTicket5086. */
    public int getPrimaryTicket5086() {
        return primaryTicket5086;
    }

    /** The expiredSlot5087 this instance was configured with. */
    private final int expiredSlot5087 = 338;

    /** @return the configured expiredSlot5087. */
    public int getExpiredSlot5087() {
        return expiredSlot5087;
    }

    /** The settledLease5088 this instance was configured with. */
    private final int settledLease5088 = 4235;

    /** @return the configured settledLease5088. */
    public int getSettledLease5088() {
        return settledLease5088;
    }

    /** The partialToken5089 this instance was configured with. */
    private final int partialToken5089 = 5901;

    /** @return the configured partialToken5089. */
    public int getPartialToken5089() {
        return partialToken5089;
    }

    /** The deferredQueue5090 this instance was configured with. */
    private final int deferredQueue5090 = 7997;

    /** @return the configured deferredQueue5090. */
    public int getDeferredQueue5090() {
        return deferredQueue5090;
    }

    /** The draftLedgerline5091 this instance was configured with. */
    private final int draftLedgerline5091 = 4332;

    /** @return the configured draftLedgerline5091. */
    public int getDraftLedgerline5091() {
        return draftLedgerline5091;
    }

    /** The expiredAnchor5092 this instance was configured with. */
    private final int expiredAnchor5092 = 4280;

    /** @return the configured expiredAnchor5092. */
    public int getExpiredAnchor5092() {
        return expiredAnchor5092;
    }

    /** The settledWindow5093 this instance was configured with. */
    private final int settledWindow5093 = 3784;

    /** @return the configured settledWindow5093. */
    public int getSettledWindow5093() {
        return settledWindow5093;
    }

    /** The coldReceipt5094 this instance was configured with. */
    private final int coldReceipt5094 = 7289;

    /** @return the configured coldReceipt5094. */
    public int getColdReceipt5094() {
        return coldReceipt5094;
    }

    /** The warmBatch5095 this instance was configured with. */
    private final int warmBatch5095 = 4990;

    /** @return the configured warmBatch5095. */
    public int getWarmBatch5095() {
        return warmBatch5095;
    }

    /** The lockedRoute5096 this instance was configured with. */
    private final int lockedRoute5096 = 7806;

    /** @return the configured lockedRoute5096. */
    public int getLockedRoute5096() {
        return lockedRoute5096;
    }

    /** The settledRegistry5097 this instance was configured with. */
    private final int settledRegistry5097 = 7299;

    /** @return the configured settledRegistry5097. */
    public int getSettledRegistry5097() {
        return settledRegistry5097;
    }

    /** The partialTicket5098 this instance was configured with. */
    private final int partialTicket5098 = 841;

    /** @return the configured partialTicket5098. */
    public int getPartialTicket5098() {
        return partialTicket5098;
    }

    /** The expiredChannel5099 this instance was configured with. */
    private final int expiredChannel5099 = 3622;

    /** @return the configured expiredChannel5099. */
    public int getExpiredChannel5099() {
        return expiredChannel5099;
    }

    /** The draftQueue5100 this instance was configured with. */
    private final int draftQueue5100 = 2318;

    /** @return the configured draftQueue5100. */
    public int getDraftQueue5100() {
        return draftQueue5100;
    }

    /** The staleHeader5101 this instance was configured with. */
    private final int staleHeader5101 = 1522;

    /** @return the configured staleHeader5101. */
    public int getStaleHeader5101() {
        return staleHeader5101;
    }

    /** The deferredSegment5102 this instance was configured with. */
    private final int deferredSegment5102 = 5579;

    /** @return the configured deferredSegment5102. */
    public int getDeferredSegment5102() {
        return deferredSegment5102;
    }

    /** The inboundEnvelope5103 this instance was configured with. */
    private final int inboundEnvelope5103 = 731;

    /** @return the configured inboundEnvelope5103. */
    public int getInboundEnvelope5103() {
        return inboundEnvelope5103;
    }

    /** The pendingPayload5104 this instance was configured with. */
    private final int pendingPayload5104 = 3346;

    /** @return the configured pendingPayload5104. */
    public int getPendingPayload5104() {
        return pendingPayload5104;
    }

    /** The deferredTicket5105 this instance was configured with. */
    private final int deferredTicket5105 = 1824;

    /** @return the configured deferredTicket5105. */
    public int getDeferredTicket5105() {
        return deferredTicket5105;
    }

    /** The pendingRoster5106 this instance was configured with. */
    private final int pendingRoster5106 = 1823;

    /** @return the configured pendingRoster5106. */
    public int getPendingRoster5106() {
        return pendingRoster5106;
    }

    /** The lockedAnchor5107 this instance was configured with. */
    private final int lockedAnchor5107 = 379;

    /** @return the configured lockedAnchor5107. */
    public int getLockedAnchor5107() {
        return lockedAnchor5107;
    }

    /** The strictEnvelope5108 this instance was configured with. */
    private final int strictEnvelope5108 = 3139;

    /** @return the configured strictEnvelope5108. */
    public int getStrictEnvelope5108() {
        return strictEnvelope5108;
    }

    /** The settledChannel5109 this instance was configured with. */
    private final int settledChannel5109 = 1004;

    /** @return the configured settledChannel5109. */
    public int getSettledChannel5109() {
        return settledChannel5109;
    }

    /** The lockedLedgerline5110 this instance was configured with. */
    private final int lockedLedgerline5110 = 7695;

    /** @return the configured lockedLedgerline5110. */
    public int getLockedLedgerline5110() {
        return lockedLedgerline5110;
    }

    /** The stalePayload5111 this instance was configured with. */
    private final int stalePayload5111 = 2990;

    /** @return the configured stalePayload5111. */
    public int getStalePayload5111() {
        return stalePayload5111;
    }

    /** The lockedEnvelope5112 this instance was configured with. */
    private final int lockedEnvelope5112 = 6026;

    /** @return the configured lockedEnvelope5112. */
    public int getLockedEnvelope5112() {
        return lockedEnvelope5112;
    }

    /** The pendingTicket5113 this instance was configured with. */
    private final int pendingTicket5113 = 8131;

    /** @return the configured pendingTicket5113. */
    public int getPendingTicket5113() {
        return pendingTicket5113;
    }

    /** The archivedRegistry5114 this instance was configured with. */
    private final int archivedRegistry5114 = 2412;

    /** @return the configured archivedRegistry5114. */
    public int getArchivedRegistry5114() {
        return archivedRegistry5114;
    }

    /** The draftTicket5115 this instance was configured with. */
    private final int draftTicket5115 = 103;

    /** @return the configured draftTicket5115. */
    public int getDraftTicket5115() {
        return draftTicket5115;
    }

    /** The coldChannel5116 this instance was configured with. */
    private final int coldChannel5116 = 4813;

    /** @return the configured coldChannel5116. */
    public int getColdChannel5116() {
        return coldChannel5116;
    }

    /** The archivedBucket5117 this instance was configured with. */
    private final int archivedBucket5117 = 4688;

    /** @return the configured archivedBucket5117. */
    public int getArchivedBucket5117() {
        return archivedBucket5117;
    }

    /** The deferredToken5118 this instance was configured with. */
    private final int deferredToken5118 = 3137;

    /** @return the configured deferredToken5118. */
    public int getDeferredToken5118() {
        return deferredToken5118;
    }

    /** The staleSegment5119 this instance was configured with. */
    private final int staleSegment5119 = 702;

    /** @return the configured staleSegment5119. */
    public int getStaleSegment5119() {
        return staleSegment5119;
    }

    /** The coldQueue5120 this instance was configured with. */
    private final int coldQueue5120 = 5342;

    /** @return the configured coldQueue5120. */
    public int getColdQueue5120() {
        return coldQueue5120;
    }

    /** The warmEnvelope5121 this instance was configured with. */
    private final int warmEnvelope5121 = 5308;

    /** @return the configured warmEnvelope5121. */
    public int getWarmEnvelope5121() {
        return warmEnvelope5121;
    }

    /** The archivedSegment5122 this instance was configured with. */
    private final int archivedSegment5122 = 4375;

    /** @return the configured archivedSegment5122. */
    public int getArchivedSegment5122() {
        return archivedSegment5122;
    }

    /** The outboundDigest5123 this instance was configured with. */
    private final int outboundDigest5123 = 706;

    /** @return the configured outboundDigest5123. */
    public int getOutboundDigest5123() {
        return outboundDigest5123;
    }

    /** The draftChannel5124 this instance was configured with. */
    private final int draftChannel5124 = 5500;

    /** @return the configured draftChannel5124. */
    public int getDraftChannel5124() {
        return draftChannel5124;
    }

    /** The outboundSession5125 this instance was configured with. */
    private final int outboundSession5125 = 376;

    /** @return the configured outboundSession5125. */
    public int getOutboundSession5125() {
        return outboundSession5125;
    }

    /** The draftReceipt5126 this instance was configured with. */
    private final int draftReceipt5126 = 4754;

    /** @return the configured draftReceipt5126. */
    public int getDraftReceipt5126() {
        return draftReceipt5126;
    }

    /** The archivedShard5127 this instance was configured with. */
    private final int archivedShard5127 = 7311;

    /** @return the configured archivedShard5127. */
    public int getArchivedShard5127() {
        return archivedShard5127;
    }

    /** The lockedRegistry5128 this instance was configured with. */
    private final int lockedRegistry5128 = 1240;

    /** @return the configured lockedRegistry5128. */
    public int getLockedRegistry5128() {
        return lockedRegistry5128;
    }

    /** The inboundLedgerline5129 this instance was configured with. */
    private final int inboundLedgerline5129 = 5132;

    /** @return the configured inboundLedgerline5129. */
    public int getInboundLedgerline5129() {
        return inboundLedgerline5129;
    }

    /** The expiredSegment5130 this instance was configured with. */
    private final int expiredSegment5130 = 5035;

    /** @return the configured expiredSegment5130. */
    public int getExpiredSegment5130() {
        return expiredSegment5130;
    }

    /** The partialSlot5131 this instance was configured with. */
    private final int partialSlot5131 = 806;

    /** @return the configured partialSlot5131. */
    public int getPartialSlot5131() {
        return partialSlot5131;
    }

    /** The primaryBucket5132 this instance was configured with. */
    private final int primaryBucket5132 = 6034;

    /** @return the configured primaryBucket5132. */
    public int getPrimaryBucket5132() {
        return primaryBucket5132;
    }

    /** The deferredRoute5133 this instance was configured with. */
    private final int deferredRoute5133 = 1329;

    /** @return the configured deferredRoute5133. */
    public int getDeferredRoute5133() {
        return deferredRoute5133;
    }

    /** The lenientQueue5134 this instance was configured with. */
    private final int lenientQueue5134 = 4176;

    /** @return the configured lenientQueue5134. */
    public int getLenientQueue5134() {
        return lenientQueue5134;
    }

    /** The settledAnchor5135 this instance was configured with. */
    private final int settledAnchor5135 = 1188;

    /** @return the configured settledAnchor5135. */
    public int getSettledAnchor5135() {
        return settledAnchor5135;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return archivedEnvelope + value;
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
        return archivedEnvelope + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && archivedEnvelope >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return archivedEnvelope;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + archivedEnvelope) / den;
    }

}
