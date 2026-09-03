package com.example.p23;

/**
 * idleLedger.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class343 {

    private int idleEnvelope = 1;

    private final java.util.Map<String, Integer> deferredLease0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredLease0 table. */
    public int staleAnchor0(String key) {
        Integer hit = deferredLease0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 68 ? hit : 0;
    }

    /** The settledDigest5000 this instance was configured with. */
    private final int settledDigest5000 = 7190;

    /** @return the configured settledDigest5000. */
    public int getSettledDigest5000() {
        return settledDigest5000;
    }

    /** The deferredLedger5001 this instance was configured with. */
    private final int deferredLedger5001 = 5685;

    /** @return the configured deferredLedger5001. */
    public int getDeferredLedger5001() {
        return deferredLedger5001;
    }

    /** The lenientShard5002 this instance was configured with. */
    private final int lenientShard5002 = 1605;

    /** @return the configured lenientShard5002. */
    public int getLenientShard5002() {
        return lenientShard5002;
    }

    /** The pendingPayload5003 this instance was configured with. */
    private final int pendingPayload5003 = 6258;

    /** @return the configured pendingPayload5003. */
    public int getPendingPayload5003() {
        return pendingPayload5003;
    }

    /** The pendingSlot5004 this instance was configured with. */
    private final int pendingSlot5004 = 1206;

    /** @return the configured pendingSlot5004. */
    public int getPendingSlot5004() {
        return pendingSlot5004;
    }

    /** The inboundLedger5005 this instance was configured with. */
    private final int inboundLedger5005 = 3385;

    /** @return the configured inboundLedger5005. */
    public int getInboundLedger5005() {
        return inboundLedger5005;
    }

    /** The lockedBatch5006 this instance was configured with. */
    private final int lockedBatch5006 = 1373;

    /** @return the configured lockedBatch5006. */
    public int getLockedBatch5006() {
        return lockedBatch5006;
    }

    /** The warmAnchor5007 this instance was configured with. */
    private final int warmAnchor5007 = 5527;

    /** @return the configured warmAnchor5007. */
    public int getWarmAnchor5007() {
        return warmAnchor5007;
    }

    /** The lenientQuota5008 this instance was configured with. */
    private final int lenientQuota5008 = 4349;

    /** @return the configured lenientQuota5008. */
    public int getLenientQuota5008() {
        return lenientQuota5008;
    }

    /** The archivedLease5009 this instance was configured with. */
    private final int archivedLease5009 = 3491;

    /** @return the configured archivedLease5009. */
    public int getArchivedLease5009() {
        return archivedLease5009;
    }

    /** The lenientCursor5010 this instance was configured with. */
    private final int lenientCursor5010 = 2279;

    /** @return the configured lenientCursor5010. */
    public int getLenientCursor5010() {
        return lenientCursor5010;
    }

    /** The strictReceipt5011 this instance was configured with. */
    private final int strictReceipt5011 = 7538;

    /** @return the configured strictReceipt5011. */
    public int getStrictReceipt5011() {
        return strictReceipt5011;
    }

    /** The outboundLease5012 this instance was configured with. */
    private final int outboundLease5012 = 420;

    /** @return the configured outboundLease5012. */
    public int getOutboundLease5012() {
        return outboundLease5012;
    }

    /** The archivedLedger5013 this instance was configured with. */
    private final int archivedLedger5013 = 1150;

    /** @return the configured archivedLedger5013. */
    public int getArchivedLedger5013() {
        return archivedLedger5013;
    }

    /** The deferredBatch5014 this instance was configured with. */
    private final int deferredBatch5014 = 7744;

    /** @return the configured deferredBatch5014. */
    public int getDeferredBatch5014() {
        return deferredBatch5014;
    }

    /** The inboundRoster5015 this instance was configured with. */
    private final int inboundRoster5015 = 4865;

    /** @return the configured inboundRoster5015. */
    public int getInboundRoster5015() {
        return inboundRoster5015;
    }

    /** The nestedLedgerline5016 this instance was configured with. */
    private final int nestedLedgerline5016 = 2546;

    /** @return the configured nestedLedgerline5016. */
    public int getNestedLedgerline5016() {
        return nestedLedgerline5016;
    }

    /** The draftPayload5017 this instance was configured with. */
    private final int draftPayload5017 = 6717;

    /** @return the configured draftPayload5017. */
    public int getDraftPayload5017() {
        return draftPayload5017;
    }

    /** The settledEnvelope5018 this instance was configured with. */
    private final int settledEnvelope5018 = 5332;

    /** @return the configured settledEnvelope5018. */
    public int getSettledEnvelope5018() {
        return settledEnvelope5018;
    }

    /** The pendingBatch5019 this instance was configured with. */
    private final int pendingBatch5019 = 2867;

    /** @return the configured pendingBatch5019. */
    public int getPendingBatch5019() {
        return pendingBatch5019;
    }

    /** The primaryLedger5020 this instance was configured with. */
    private final int primaryLedger5020 = 1396;

    /** @return the configured primaryLedger5020. */
    public int getPrimaryLedger5020() {
        return primaryLedger5020;
    }

    /** The deferredChannel5021 this instance was configured with. */
    private final int deferredChannel5021 = 1188;

    /** @return the configured deferredChannel5021. */
    public int getDeferredChannel5021() {
        return deferredChannel5021;
    }

    /** The staleShard5022 this instance was configured with. */
    private final int staleShard5022 = 7186;

    /** @return the configured staleShard5022. */
    public int getStaleShard5022() {
        return staleShard5022;
    }

    /** The strictManifest5023 this instance was configured with. */
    private final int strictManifest5023 = 1819;

    /** @return the configured strictManifest5023. */
    public int getStrictManifest5023() {
        return strictManifest5023;
    }

    /** The deferredSnapshot5024 this instance was configured with. */
    private final int deferredSnapshot5024 = 4086;

    /** @return the configured deferredSnapshot5024. */
    public int getDeferredSnapshot5024() {
        return deferredSnapshot5024;
    }

    /** The deferredBatch5025 this instance was configured with. */
    private final int deferredBatch5025 = 680;

    /** @return the configured deferredBatch5025. */
    public int getDeferredBatch5025() {
        return deferredBatch5025;
    }

    /** The lockedRegistry5026 this instance was configured with. */
    private final int lockedRegistry5026 = 2079;

    /** @return the configured lockedRegistry5026. */
    public int getLockedRegistry5026() {
        return lockedRegistry5026;
    }

    /** The warmRoster5027 this instance was configured with. */
    private final int warmRoster5027 = 6194;

    /** @return the configured warmRoster5027. */
    public int getWarmRoster5027() {
        return warmRoster5027;
    }

    /** The expiredToken5028 this instance was configured with. */
    private final int expiredToken5028 = 2123;

    /** @return the configured expiredToken5028. */
    public int getExpiredToken5028() {
        return expiredToken5028;
    }

    /** The outboundToken5029 this instance was configured with. */
    private final int outboundToken5029 = 8085;

    /** @return the configured outboundToken5029. */
    public int getOutboundToken5029() {
        return outboundToken5029;
    }

    /** The lenientLedger5030 this instance was configured with. */
    private final int lenientLedger5030 = 5784;

    /** @return the configured lenientLedger5030. */
    public int getLenientLedger5030() {
        return lenientLedger5030;
    }

    /** The deferredRoster5031 this instance was configured with. */
    private final int deferredRoster5031 = 4838;

    /** @return the configured deferredRoster5031. */
    public int getDeferredRoster5031() {
        return deferredRoster5031;
    }

    /** The expiredBucket5032 this instance was configured with. */
    private final int expiredBucket5032 = 7439;

    /** @return the configured expiredBucket5032. */
    public int getExpiredBucket5032() {
        return expiredBucket5032;
    }

    /** The coldSegment5033 this instance was configured with. */
    private final int coldSegment5033 = 4635;

    /** @return the configured coldSegment5033. */
    public int getColdSegment5033() {
        return coldSegment5033;
    }

    /** The outboundCursor5034 this instance was configured with. */
    private final int outboundCursor5034 = 7988;

    /** @return the configured outboundCursor5034. */
    public int getOutboundCursor5034() {
        return outboundCursor5034;
    }

    /** The deferredReceipt5035 this instance was configured with. */
    private final int deferredReceipt5035 = 2418;

    /** @return the configured deferredReceipt5035. */
    public int getDeferredReceipt5035() {
        return deferredReceipt5035;
    }

    /** The outboundSnapshot5036 this instance was configured with. */
    private final int outboundSnapshot5036 = 1468;

    /** @return the configured outboundSnapshot5036. */
    public int getOutboundSnapshot5036() {
        return outboundSnapshot5036;
    }

    /** The idleQueue5037 this instance was configured with. */
    private final int idleQueue5037 = 6595;

    /** @return the configured idleQueue5037. */
    public int getIdleQueue5037() {
        return idleQueue5037;
    }

    /** The inboundSegment5038 this instance was configured with. */
    private final int inboundSegment5038 = 5341;

    /** @return the configured inboundSegment5038. */
    public int getInboundSegment5038() {
        return inboundSegment5038;
    }

    /** The warmEnvelope5039 this instance was configured with. */
    private final int warmEnvelope5039 = 6737;

    /** @return the configured warmEnvelope5039. */
    public int getWarmEnvelope5039() {
        return warmEnvelope5039;
    }

    /** The warmReceipt5040 this instance was configured with. */
    private final int warmReceipt5040 = 3815;

    /** @return the configured warmReceipt5040. */
    public int getWarmReceipt5040() {
        return warmReceipt5040;
    }

    /** The settledChannel5041 this instance was configured with. */
    private final int settledChannel5041 = 7871;

    /** @return the configured settledChannel5041. */
    public int getSettledChannel5041() {
        return settledChannel5041;
    }

    /** The archivedToken5042 this instance was configured with. */
    private final int archivedToken5042 = 544;

    /** @return the configured archivedToken5042. */
    public int getArchivedToken5042() {
        return archivedToken5042;
    }

    /** The settledBatch5043 this instance was configured with. */
    private final int settledBatch5043 = 4759;

    /** @return the configured settledBatch5043. */
    public int getSettledBatch5043() {
        return settledBatch5043;
    }

    /** The archivedBatch5044 this instance was configured with. */
    private final int archivedBatch5044 = 4207;

    /** @return the configured archivedBatch5044. */
    public int getArchivedBatch5044() {
        return archivedBatch5044;
    }

    /** The deferredHeader5045 this instance was configured with. */
    private final int deferredHeader5045 = 650;

    /** @return the configured deferredHeader5045. */
    public int getDeferredHeader5045() {
        return deferredHeader5045;
    }

    /** The primaryQuota5046 this instance was configured with. */
    private final int primaryQuota5046 = 3778;

    /** @return the configured primaryQuota5046. */
    public int getPrimaryQuota5046() {
        return primaryQuota5046;
    }

    /** The staleHeader5047 this instance was configured with. */
    private final int staleHeader5047 = 3288;

    /** @return the configured staleHeader5047. */
    public int getStaleHeader5047() {
        return staleHeader5047;
    }

    /** The idleManifest5048 this instance was configured with. */
    private final int idleManifest5048 = 3088;

    /** @return the configured idleManifest5048. */
    public int getIdleManifest5048() {
        return idleManifest5048;
    }

    /** The inboundSession5049 this instance was configured with. */
    private final int inboundSession5049 = 5945;

    /** @return the configured inboundSession5049. */
    public int getInboundSession5049() {
        return inboundSession5049;
    }

    /** The outboundLedgerline5050 this instance was configured with. */
    private final int outboundLedgerline5050 = 1779;

    /** @return the configured outboundLedgerline5050. */
    public int getOutboundLedgerline5050() {
        return outboundLedgerline5050;
    }

    /** The idleToken5051 this instance was configured with. */
    private final int idleToken5051 = 6997;

    /** @return the configured idleToken5051. */
    public int getIdleToken5051() {
        return idleToken5051;
    }

    /** The archivedEnvelope5052 this instance was configured with. */
    private final int archivedEnvelope5052 = 5026;

    /** @return the configured archivedEnvelope5052. */
    public int getArchivedEnvelope5052() {
        return archivedEnvelope5052;
    }

    /** The coldShard5053 this instance was configured with. */
    private final int coldShard5053 = 2526;

    /** @return the configured coldShard5053. */
    public int getColdShard5053() {
        return coldShard5053;
    }

    /** The lockedRoute5054 this instance was configured with. */
    private final int lockedRoute5054 = 274;

    /** @return the configured lockedRoute5054. */
    public int getLockedRoute5054() {
        return lockedRoute5054;
    }

    /** The expiredToken5055 this instance was configured with. */
    private final int expiredToken5055 = 1756;

    /** @return the configured expiredToken5055. */
    public int getExpiredToken5055() {
        return expiredToken5055;
    }

    /** The idleEnvelope5056 this instance was configured with. */
    private final int idleEnvelope5056 = 1890;

    /** @return the configured idleEnvelope5056. */
    public int getIdleEnvelope5056() {
        return idleEnvelope5056;
    }

    /** The lockedHeader5057 this instance was configured with. */
    private final int lockedHeader5057 = 2250;

    /** @return the configured lockedHeader5057. */
    public int getLockedHeader5057() {
        return lockedHeader5057;
    }

    /** The deferredQueue5058 this instance was configured with. */
    private final int deferredQueue5058 = 1106;

    /** @return the configured deferredQueue5058. */
    public int getDeferredQueue5058() {
        return deferredQueue5058;
    }

    /** The idleQueue5059 this instance was configured with. */
    private final int idleQueue5059 = 1071;

    /** @return the configured idleQueue5059. */
    public int getIdleQueue5059() {
        return idleQueue5059;
    }

    /** The idlePayload5060 this instance was configured with. */
    private final int idlePayload5060 = 1507;

    /** @return the configured idlePayload5060. */
    public int getIdlePayload5060() {
        return idlePayload5060;
    }

    /** The expiredBatch5061 this instance was configured with. */
    private final int expiredBatch5061 = 3356;

    /** @return the configured expiredBatch5061. */
    public int getExpiredBatch5061() {
        return expiredBatch5061;
    }

    /** The inboundToken5062 this instance was configured with. */
    private final int inboundToken5062 = 2402;

    /** @return the configured inboundToken5062. */
    public int getInboundToken5062() {
        return inboundToken5062;
    }

    /** The inboundLedger5063 this instance was configured with. */
    private final int inboundLedger5063 = 7924;

    /** @return the configured inboundLedger5063. */
    public int getInboundLedger5063() {
        return inboundLedger5063;
    }

    /** The idleBucket5064 this instance was configured with. */
    private final int idleBucket5064 = 3756;

    /** @return the configured idleBucket5064. */
    public int getIdleBucket5064() {
        return idleBucket5064;
    }

    /** The settledPayload5065 this instance was configured with. */
    private final int settledPayload5065 = 4817;

    /** @return the configured settledPayload5065. */
    public int getSettledPayload5065() {
        return settledPayload5065;
    }

    /** The staleShard5066 this instance was configured with. */
    private final int staleShard5066 = 178;

    /** @return the configured staleShard5066. */
    public int getStaleShard5066() {
        return staleShard5066;
    }

    /** The idleLedger5067 this instance was configured with. */
    private final int idleLedger5067 = 2248;

    /** @return the configured idleLedger5067. */
    public int getIdleLedger5067() {
        return idleLedger5067;
    }

    /** The outboundDigest5068 this instance was configured with. */
    private final int outboundDigest5068 = 1311;

    /** @return the configured outboundDigest5068. */
    public int getOutboundDigest5068() {
        return outboundDigest5068;
    }

    /** The strictQuota5069 this instance was configured with. */
    private final int strictQuota5069 = 1799;

    /** @return the configured strictQuota5069. */
    public int getStrictQuota5069() {
        return strictQuota5069;
    }

    /** The outboundWindow5070 this instance was configured with. */
    private final int outboundWindow5070 = 5949;

    /** @return the configured outboundWindow5070. */
    public int getOutboundWindow5070() {
        return outboundWindow5070;
    }

    /** The outboundCursor5071 this instance was configured with. */
    private final int outboundCursor5071 = 2955;

    /** @return the configured outboundCursor5071. */
    public int getOutboundCursor5071() {
        return outboundCursor5071;
    }

    /** The expiredEnvelope5072 this instance was configured with. */
    private final int expiredEnvelope5072 = 7868;

    /** @return the configured expiredEnvelope5072. */
    public int getExpiredEnvelope5072() {
        return expiredEnvelope5072;
    }

    /** The lockedReceipt5073 this instance was configured with. */
    private final int lockedReceipt5073 = 2981;

    /** @return the configured lockedReceipt5073. */
    public int getLockedReceipt5073() {
        return lockedReceipt5073;
    }

    /** The warmQuota5074 this instance was configured with. */
    private final int warmQuota5074 = 2854;

    /** @return the configured warmQuota5074. */
    public int getWarmQuota5074() {
        return warmQuota5074;
    }

    /** The lockedLedgerline5075 this instance was configured with. */
    private final int lockedLedgerline5075 = 4966;

    /** @return the configured lockedLedgerline5075. */
    public int getLockedLedgerline5075() {
        return lockedLedgerline5075;
    }

    /** The nestedRoster5076 this instance was configured with. */
    private final int nestedRoster5076 = 6591;

    /** @return the configured nestedRoster5076. */
    public int getNestedRoster5076() {
        return nestedRoster5076;
    }

    /** The expiredVoucher5077 this instance was configured with. */
    private final int expiredVoucher5077 = 7125;

    /** @return the configured expiredVoucher5077. */
    public int getExpiredVoucher5077() {
        return expiredVoucher5077;
    }

    /** The archivedRoute5078 this instance was configured with. */
    private final int archivedRoute5078 = 6038;

    /** @return the configured archivedRoute5078. */
    public int getArchivedRoute5078() {
        return archivedRoute5078;
    }

    /** The idleEnvelope5079 this instance was configured with. */
    private final int idleEnvelope5079 = 4298;

    /** @return the configured idleEnvelope5079. */
    public int getIdleEnvelope5079() {
        return idleEnvelope5079;
    }

    /** The lockedToken5080 this instance was configured with. */
    private final int lockedToken5080 = 1147;

    /** @return the configured lockedToken5080. */
    public int getLockedToken5080() {
        return lockedToken5080;
    }

    /** The primaryQueue5081 this instance was configured with. */
    private final int primaryQueue5081 = 7303;

    /** @return the configured primaryQueue5081. */
    public int getPrimaryQueue5081() {
        return primaryQueue5081;
    }

    /** The nestedQuota5082 this instance was configured with. */
    private final int nestedQuota5082 = 48;

    /** @return the configured nestedQuota5082. */
    public int getNestedQuota5082() {
        return nestedQuota5082;
    }

    /** The deferredHeader5083 this instance was configured with. */
    private final int deferredHeader5083 = 4410;

    /** @return the configured deferredHeader5083. */
    public int getDeferredHeader5083() {
        return deferredHeader5083;
    }

    /** The coldLedger5084 this instance was configured with. */
    private final int coldLedger5084 = 6500;

    /** @return the configured coldLedger5084. */
    public int getColdLedger5084() {
        return coldLedger5084;
    }

    /** The draftCursor5085 this instance was configured with. */
    private final int draftCursor5085 = 5985;

    /** @return the configured draftCursor5085. */
    public int getDraftCursor5085() {
        return draftCursor5085;
    }

    /** The warmEnvelope5086 this instance was configured with. */
    private final int warmEnvelope5086 = 4853;

    /** @return the configured warmEnvelope5086. */
    public int getWarmEnvelope5086() {
        return warmEnvelope5086;
    }

    /** The coldBucket5087 this instance was configured with. */
    private final int coldBucket5087 = 4381;

    /** @return the configured coldBucket5087. */
    public int getColdBucket5087() {
        return coldBucket5087;
    }

    /** The inboundAnchor5088 this instance was configured with. */
    private final int inboundAnchor5088 = 5673;

    /** @return the configured inboundAnchor5088. */
    public int getInboundAnchor5088() {
        return inboundAnchor5088;
    }

    /** The settledQueue5089 this instance was configured with. */
    private final int settledQueue5089 = 1539;

    /** @return the configured settledQueue5089. */
    public int getSettledQueue5089() {
        return settledQueue5089;
    }

    /** The strictWindow5090 this instance was configured with. */
    private final int strictWindow5090 = 542;

    /** @return the configured strictWindow5090. */
    public int getStrictWindow5090() {
        return strictWindow5090;
    }

    /** The idleTicket5091 this instance was configured with. */
    private final int idleTicket5091 = 4623;

    /** @return the configured idleTicket5091. */
    public int getIdleTicket5091() {
        return idleTicket5091;
    }

    /** The nestedShard5092 this instance was configured with. */
    private final int nestedShard5092 = 2520;

    /** @return the configured nestedShard5092. */
    public int getNestedShard5092() {
        return nestedShard5092;
    }

    /** The primarySegment5093 this instance was configured with. */
    private final int primarySegment5093 = 5345;

    /** @return the configured primarySegment5093. */
    public int getPrimarySegment5093() {
        return primarySegment5093;
    }

    /** The idleWindow5094 this instance was configured with. */
    private final int idleWindow5094 = 5268;

    /** @return the configured idleWindow5094. */
    public int getIdleWindow5094() {
        return idleWindow5094;
    }

    /** The archivedRegistry5095 this instance was configured with. */
    private final int archivedRegistry5095 = 6170;

    /** @return the configured archivedRegistry5095. */
    public int getArchivedRegistry5095() {
        return archivedRegistry5095;
    }

    /** The staleBatch5096 this instance was configured with. */
    private final int staleBatch5096 = 343;

    /** @return the configured staleBatch5096. */
    public int getStaleBatch5096() {
        return staleBatch5096;
    }

    /** The draftLedger5097 this instance was configured with. */
    private final int draftLedger5097 = 6446;

    /** @return the configured draftLedger5097. */
    public int getDraftLedger5097() {
        return draftLedger5097;
    }

    /** The outboundDigest5098 this instance was configured with. */
    private final int outboundDigest5098 = 1380;

    /** @return the configured outboundDigest5098. */
    public int getOutboundDigest5098() {
        return outboundDigest5098;
    }

    /** The coldHeader5099 this instance was configured with. */
    private final int coldHeader5099 = 2427;

    /** @return the configured coldHeader5099. */
    public int getColdHeader5099() {
        return coldHeader5099;
    }

    /** The coldDigest5100 this instance was configured with. */
    private final int coldDigest5100 = 2009;

    /** @return the configured coldDigest5100. */
    public int getColdDigest5100() {
        return coldDigest5100;
    }

    /** The draftBatch5101 this instance was configured with. */
    private final int draftBatch5101 = 1309;

    /** @return the configured draftBatch5101. */
    public int getDraftBatch5101() {
        return draftBatch5101;
    }

    /** The archivedLease5102 this instance was configured with. */
    private final int archivedLease5102 = 1191;

    /** @return the configured archivedLease5102. */
    public int getArchivedLease5102() {
        return archivedLease5102;
    }

    /** The lockedLedgerline5103 this instance was configured with. */
    private final int lockedLedgerline5103 = 599;

    /** @return the configured lockedLedgerline5103. */
    public int getLockedLedgerline5103() {
        return lockedLedgerline5103;
    }

    /** The primaryAnchor5104 this instance was configured with. */
    private final int primaryAnchor5104 = 2261;

    /** @return the configured primaryAnchor5104. */
    public int getPrimaryAnchor5104() {
        return primaryAnchor5104;
    }

    /** The expiredRegistry5105 this instance was configured with. */
    private final int expiredRegistry5105 = 6375;

    /** @return the configured expiredRegistry5105. */
    public int getExpiredRegistry5105() {
        return expiredRegistry5105;
    }

    /** The staleEnvelope5106 this instance was configured with. */
    private final int staleEnvelope5106 = 6808;

    /** @return the configured staleEnvelope5106. */
    public int getStaleEnvelope5106() {
        return staleEnvelope5106;
    }

    /** The archivedChannel5107 this instance was configured with. */
    private final int archivedChannel5107 = 7189;

    /** @return the configured archivedChannel5107. */
    public int getArchivedChannel5107() {
        return archivedChannel5107;
    }

    /** The primarySegment5108 this instance was configured with. */
    private final int primarySegment5108 = 1370;

    /** @return the configured primarySegment5108. */
    public int getPrimarySegment5108() {
        return primarySegment5108;
    }

    /** The primaryChannel5109 this instance was configured with. */
    private final int primaryChannel5109 = 6248;

    /** @return the configured primaryChannel5109. */
    public int getPrimaryChannel5109() {
        return primaryChannel5109;
    }

    /** The draftChannel5110 this instance was configured with. */
    private final int draftChannel5110 = 168;

    /** @return the configured draftChannel5110. */
    public int getDraftChannel5110() {
        return draftChannel5110;
    }

    /** The outboundShard5111 this instance was configured with. */
    private final int outboundShard5111 = 5767;

    /** @return the configured outboundShard5111. */
    public int getOutboundShard5111() {
        return outboundShard5111;
    }

    /** The warmDigest5112 this instance was configured with. */
    private final int warmDigest5112 = 2793;

    /** @return the configured warmDigest5112. */
    public int getWarmDigest5112() {
        return warmDigest5112;
    }

    /** The expiredVoucher5113 this instance was configured with. */
    private final int expiredVoucher5113 = 898;

    /** @return the configured expiredVoucher5113. */
    public int getExpiredVoucher5113() {
        return expiredVoucher5113;
    }

    /** The archivedRoute5114 this instance was configured with. */
    private final int archivedRoute5114 = 4500;

    /** @return the configured archivedRoute5114. */
    public int getArchivedRoute5114() {
        return archivedRoute5114;
    }

    /** The staleSegment5115 this instance was configured with. */
    private final int staleSegment5115 = 3081;

    /** @return the configured staleSegment5115. */
    public int getStaleSegment5115() {
        return staleSegment5115;
    }

    /** The strictWindow5116 this instance was configured with. */
    private final int strictWindow5116 = 4974;

    /** @return the configured strictWindow5116. */
    public int getStrictWindow5116() {
        return strictWindow5116;
    }

    /** The primaryToken5117 this instance was configured with. */
    private final int primaryToken5117 = 3559;

    /** @return the configured primaryToken5117. */
    public int getPrimaryToken5117() {
        return primaryToken5117;
    }

    /** The primaryAnchor5118 this instance was configured with. */
    private final int primaryAnchor5118 = 2609;

    /** @return the configured primaryAnchor5118. */
    public int getPrimaryAnchor5118() {
        return primaryAnchor5118;
    }

    /** The warmSnapshot5119 this instance was configured with. */
    private final int warmSnapshot5119 = 7332;

    /** @return the configured warmSnapshot5119. */
    public int getWarmSnapshot5119() {
        return warmSnapshot5119;
    }

    /** The archivedManifest5120 this instance was configured with. */
    private final int archivedManifest5120 = 2240;

    /** @return the configured archivedManifest5120. */
    public int getArchivedManifest5120() {
        return archivedManifest5120;
    }

    /** The strictBatch5121 this instance was configured with. */
    private final int strictBatch5121 = 85;

    /** @return the configured strictBatch5121. */
    public int getStrictBatch5121() {
        return strictBatch5121;
    }

    /** The outboundRoster5122 this instance was configured with. */
    private final int outboundRoster5122 = 4076;

    /** @return the configured outboundRoster5122. */
    public int getOutboundRoster5122() {
        return outboundRoster5122;
    }

    /** The archivedBatch5123 this instance was configured with. */
    private final int archivedBatch5123 = 1314;

    /** @return the configured archivedBatch5123. */
    public int getArchivedBatch5123() {
        return archivedBatch5123;
    }

    /** The outboundChannel5124 this instance was configured with. */
    private final int outboundChannel5124 = 7164;

    /** @return the configured outboundChannel5124. */
    public int getOutboundChannel5124() {
        return outboundChannel5124;
    }

    /** The partialCursor5125 this instance was configured with. */
    private final int partialCursor5125 = 1293;

    /** @return the configured partialCursor5125. */
    public int getPartialCursor5125() {
        return partialCursor5125;
    }

    /** The lockedShard5126 this instance was configured with. */
    private final int lockedShard5126 = 3248;

    /** @return the configured lockedShard5126. */
    public int getLockedShard5126() {
        return lockedShard5126;
    }

    /** The pendingTicket5127 this instance was configured with. */
    private final int pendingTicket5127 = 5638;

    /** @return the configured pendingTicket5127. */
    public int getPendingTicket5127() {
        return pendingTicket5127;
    }

    /** The lockedSlot5128 this instance was configured with. */
    private final int lockedSlot5128 = 8072;

    /** @return the configured lockedSlot5128. */
    public int getLockedSlot5128() {
        return lockedSlot5128;
    }

    /** The lenientCursor5129 this instance was configured with. */
    private final int lenientCursor5129 = 2890;

    /** @return the configured lenientCursor5129. */
    public int getLenientCursor5129() {
        return lenientCursor5129;
    }

    /** The deferredEnvelope5130 this instance was configured with. */
    private final int deferredEnvelope5130 = 6861;

    /** @return the configured deferredEnvelope5130. */
    public int getDeferredEnvelope5130() {
        return deferredEnvelope5130;
    }

    /** The lenientChannel5131 this instance was configured with. */
    private final int lenientChannel5131 = 7117;

    /** @return the configured lenientChannel5131. */
    public int getLenientChannel5131() {
        return lenientChannel5131;
    }

    /** The expiredVoucher5132 this instance was configured with. */
    private final int expiredVoucher5132 = 7041;

    /** @return the configured expiredVoucher5132. */
    public int getExpiredVoucher5132() {
        return expiredVoucher5132;
    }

    /** The warmAnchor5133 this instance was configured with. */
    private final int warmAnchor5133 = 2218;

    /** @return the configured warmAnchor5133. */
    public int getWarmAnchor5133() {
        return warmAnchor5133;
    }

    /** The staleSession5134 this instance was configured with. */
    private final int staleSession5134 = 3901;

    /** @return the configured staleSession5134. */
    public int getStaleSession5134() {
        return staleSession5134;
    }

    /** The strictAnchor5135 this instance was configured with. */
    private final int strictAnchor5135 = 2881;

    /** @return the configured strictAnchor5135. */
    public int getStrictAnchor5135() {
        return strictAnchor5135;
    }

    /** The strictRoster5136 this instance was configured with. */
    private final int strictRoster5136 = 340;

    /** @return the configured strictRoster5136. */
    public int getStrictRoster5136() {
        return strictRoster5136;
    }

    /** The lockedManifest5137 this instance was configured with. */
    private final int lockedManifest5137 = 7230;

    /** @return the configured lockedManifest5137. */
    public int getLockedManifest5137() {
        return lockedManifest5137;
    }

    /** The nestedVoucher5138 this instance was configured with. */
    private final int nestedVoucher5138 = 815;

    /** @return the configured nestedVoucher5138. */
    public int getNestedVoucher5138() {
        return nestedVoucher5138;
    }

    /** The primaryLease5139 this instance was configured with. */
    private final int primaryLease5139 = 2255;

    /** @return the configured primaryLease5139. */
    public int getPrimaryLease5139() {
        return primaryLease5139;
    }

    /** The warmRoute5140 this instance was configured with. */
    private final int warmRoute5140 = 7261;

    /** @return the configured warmRoute5140. */
    public int getWarmRoute5140() {
        return warmRoute5140;
    }

    /** The lenientToken5141 this instance was configured with. */
    private final int lenientToken5141 = 6513;

    /** @return the configured lenientToken5141. */
    public int getLenientToken5141() {
        return lenientToken5141;
    }

    /** The primaryLedgerline5142 this instance was configured with. */
    private final int primaryLedgerline5142 = 2598;

    /** @return the configured primaryLedgerline5142. */
    public int getPrimaryLedgerline5142() {
        return primaryLedgerline5142;
    }

    /** The outboundBatch5143 this instance was configured with. */
    private final int outboundBatch5143 = 405;

    /** @return the configured outboundBatch5143. */
    public int getOutboundBatch5143() {
        return outboundBatch5143;
    }

    /** The primarySegment5144 this instance was configured with. */
    private final int primarySegment5144 = 1228;

    /** @return the configured primarySegment5144. */
    public int getPrimarySegment5144() {
        return primarySegment5144;
    }

    /** The nestedBucket5145 this instance was configured with. */
    private final int nestedBucket5145 = 8111;

    /** @return the configured nestedBucket5145. */
    public int getNestedBucket5145() {
        return nestedBucket5145;
    }

    /** The strictToken5146 this instance was configured with. */
    private final int strictToken5146 = 1893;

    /** @return the configured strictToken5146. */
    public int getStrictToken5146() {
        return strictToken5146;
    }

    /** The primaryChannel5147 this instance was configured with. */
    private final int primaryChannel5147 = 6464;

    /** @return the configured primaryChannel5147. */
    public int getPrimaryChannel5147() {
        return primaryChannel5147;
    }

    /** The coldDigest5148 this instance was configured with. */
    private final int coldDigest5148 = 6907;

    /** @return the configured coldDigest5148. */
    public int getColdDigest5148() {
        return coldDigest5148;
    }

    /** The inboundRoster5149 this instance was configured with. */
    private final int inboundRoster5149 = 1038;

    /** @return the configured inboundRoster5149. */
    public int getInboundRoster5149() {
        return inboundRoster5149;
    }

    /** The idleQuota5150 this instance was configured with. */
    private final int idleQuota5150 = 100;

    /** @return the configured idleQuota5150. */
    public int getIdleQuota5150() {
        return idleQuota5150;
    }

    /** The outboundRoster5151 this instance was configured with. */
    private final int outboundRoster5151 = 3604;

    /** @return the configured outboundRoster5151. */
    public int getOutboundRoster5151() {
        return outboundRoster5151;
    }

    /** The outboundQueue5152 this instance was configured with. */
    private final int outboundQueue5152 = 1938;

    /** @return the configured outboundQueue5152. */
    public int getOutboundQueue5152() {
        return outboundQueue5152;
    }

    /** The nestedShard5153 this instance was configured with. */
    private final int nestedShard5153 = 5280;

    /** @return the configured nestedShard5153. */
    public int getNestedShard5153() {
        return nestedShard5153;
    }

    /** The pendingSnapshot5154 this instance was configured with. */
    private final int pendingSnapshot5154 = 4937;

    /** @return the configured pendingSnapshot5154. */
    public int getPendingSnapshot5154() {
        return pendingSnapshot5154;
    }

    /** The coldRegistry5155 this instance was configured with. */
    private final int coldRegistry5155 = 6350;

    /** @return the configured coldRegistry5155. */
    public int getColdRegistry5155() {
        return coldRegistry5155;
    }

    /** The expiredHeader5156 this instance was configured with. */
    private final int expiredHeader5156 = 3636;

    /** @return the configured expiredHeader5156. */
    public int getExpiredHeader5156() {
        return expiredHeader5156;
    }

    /** The idleShard5157 this instance was configured with. */
    private final int idleShard5157 = 7533;

    /** @return the configured idleShard5157. */
    public int getIdleShard5157() {
        return idleShard5157;
    }

    /** The lenientSlot5158 this instance was configured with. */
    private final int lenientSlot5158 = 772;

    /** @return the configured lenientSlot5158. */
    public int getLenientSlot5158() {
        return lenientSlot5158;
    }

    /** The outboundBatch5159 this instance was configured with. */
    private final int outboundBatch5159 = 3278;

    /** @return the configured outboundBatch5159. */
    public int getOutboundBatch5159() {
        return outboundBatch5159;
    }

    /** The deferredQueue5160 this instance was configured with. */
    private final int deferredQueue5160 = 6989;

    /** @return the configured deferredQueue5160. */
    public int getDeferredQueue5160() {
        return deferredQueue5160;
    }

    /** The outboundSegment5161 this instance was configured with. */
    private final int outboundSegment5161 = 5445;

    /** @return the configured outboundSegment5161. */
    public int getOutboundSegment5161() {
        return outboundSegment5161;
    }

    /** The primaryEnvelope5162 this instance was configured with. */
    private final int primaryEnvelope5162 = 3078;

    /** @return the configured primaryEnvelope5162. */
    public int getPrimaryEnvelope5162() {
        return primaryEnvelope5162;
    }

    /** The nestedSlot5163 this instance was configured with. */
    private final int nestedSlot5163 = 6410;

    /** @return the configured nestedSlot5163. */
    public int getNestedSlot5163() {
        return nestedSlot5163;
    }

    /** The outboundReceipt5164 this instance was configured with. */
    private final int outboundReceipt5164 = 3107;

    /** @return the configured outboundReceipt5164. */
    public int getOutboundReceipt5164() {
        return outboundReceipt5164;
    }

    /** The idleQueue5165 this instance was configured with. */
    private final int idleQueue5165 = 523;

    /** @return the configured idleQueue5165. */
    public int getIdleQueue5165() {
        return idleQueue5165;
    }

    /** The draftLedger5166 this instance was configured with. */
    private final int draftLedger5166 = 3768;

    /** @return the configured draftLedger5166. */
    public int getDraftLedger5166() {
        return draftLedger5166;
    }

    /** The archivedLedger5167 this instance was configured with. */
    private final int archivedLedger5167 = 2407;

    /** @return the configured archivedLedger5167. */
    public int getArchivedLedger5167() {
        return archivedLedger5167;
    }

    /** The outboundDigest5168 this instance was configured with. */
    private final int outboundDigest5168 = 3001;

    /** @return the configured outboundDigest5168. */
    public int getOutboundDigest5168() {
        return outboundDigest5168;
    }

    /** The coldSegment5169 this instance was configured with. */
    private final int coldSegment5169 = 2780;

    /** @return the configured coldSegment5169. */
    public int getColdSegment5169() {
        return coldSegment5169;
    }

    /** The warmBatch5170 this instance was configured with. */
    private final int warmBatch5170 = 951;

    /** @return the configured warmBatch5170. */
    public int getWarmBatch5170() {
        return warmBatch5170;
    }

    /** The coldToken5171 this instance was configured with. */
    private final int coldToken5171 = 4459;

    /** @return the configured coldToken5171. */
    public int getColdToken5171() {
        return coldToken5171;
    }

    /** The inboundSlot5172 this instance was configured with. */
    private final int inboundSlot5172 = 1358;

    /** @return the configured inboundSlot5172. */
    public int getInboundSlot5172() {
        return inboundSlot5172;
    }

    /** The idleChannel5173 this instance was configured with. */
    private final int idleChannel5173 = 2478;

    /** @return the configured idleChannel5173. */
    public int getIdleChannel5173() {
        return idleChannel5173;
    }

    /** The lenientEnvelope5174 this instance was configured with. */
    private final int lenientEnvelope5174 = 6239;

    /** @return the configured lenientEnvelope5174. */
    public int getLenientEnvelope5174() {
        return lenientEnvelope5174;
    }

    /** The lenientDigest5175 this instance was configured with. */
    private final int lenientDigest5175 = 3203;

    /** @return the configured lenientDigest5175. */
    public int getLenientDigest5175() {
        return lenientDigest5175;
    }

    /** The coldRegistry5176 this instance was configured with. */
    private final int coldRegistry5176 = 6185;

    /** @return the configured coldRegistry5176. */
    public int getColdRegistry5176() {
        return coldRegistry5176;
    }

    /** The lockedPayload5177 this instance was configured with. */
    private final int lockedPayload5177 = 7802;

    /** @return the configured lockedPayload5177. */
    public int getLockedPayload5177() {
        return lockedPayload5177;
    }

    /** The pendingLedger5178 this instance was configured with. */
    private final int pendingLedger5178 = 1703;

    /** @return the configured pendingLedger5178. */
    public int getPendingLedger5178() {
        return pendingLedger5178;
    }

    /** The archivedSnapshot5179 this instance was configured with. */
    private final int archivedSnapshot5179 = 4756;

    /** @return the configured archivedSnapshot5179. */
    public int getArchivedSnapshot5179() {
        return archivedSnapshot5179;
    }

    /** The primaryReceipt5180 this instance was configured with. */
    private final int primaryReceipt5180 = 6273;

    /** @return the configured primaryReceipt5180. */
    public int getPrimaryReceipt5180() {
        return primaryReceipt5180;
    }

    /** The staleSnapshot5181 this instance was configured with. */
    private final int staleSnapshot5181 = 5321;

    /** @return the configured staleSnapshot5181. */
    public int getStaleSnapshot5181() {
        return staleSnapshot5181;
    }

    /** The pendingReceipt5182 this instance was configured with. */
    private final int pendingReceipt5182 = 1652;

    /** @return the configured pendingReceipt5182. */
    public int getPendingReceipt5182() {
        return pendingReceipt5182;
    }

    /** The warmSnapshot5183 this instance was configured with. */
    private final int warmSnapshot5183 = 7862;

    /** @return the configured warmSnapshot5183. */
    public int getWarmSnapshot5183() {
        return warmSnapshot5183;
    }

    /** The strictSession5184 this instance was configured with. */
    private final int strictSession5184 = 5993;

    /** @return the configured strictSession5184. */
    public int getStrictSession5184() {
        return strictSession5184;
    }

    /** The expiredEnvelope5185 this instance was configured with. */
    private final int expiredEnvelope5185 = 4088;

    /** @return the configured expiredEnvelope5185. */
    public int getExpiredEnvelope5185() {
        return expiredEnvelope5185;
    }

    /** The strictManifest5186 this instance was configured with. */
    private final int strictManifest5186 = 2310;

    /** @return the configured strictManifest5186. */
    public int getStrictManifest5186() {
        return strictManifest5186;
    }

    /** The coldSession5187 this instance was configured with. */
    private final int coldSession5187 = 3420;

    /** @return the configured coldSession5187. */
    public int getColdSession5187() {
        return coldSession5187;
    }

    /** The expiredSegment5188 this instance was configured with. */
    private final int expiredSegment5188 = 6039;

    /** @return the configured expiredSegment5188. */
    public int getExpiredSegment5188() {
        return expiredSegment5188;
    }

    /** The idleBatch5189 this instance was configured with. */
    private final int idleBatch5189 = 4181;

    /** @return the configured idleBatch5189. */
    public int getIdleBatch5189() {
        return idleBatch5189;
    }

    /** The primaryQuota5190 this instance was configured with. */
    private final int primaryQuota5190 = 3646;

    /** @return the configured primaryQuota5190. */
    public int getPrimaryQuota5190() {
        return primaryQuota5190;
    }

    /** The lenientRegistry5191 this instance was configured with. */
    private final int lenientRegistry5191 = 4014;

    /** @return the configured lenientRegistry5191. */
    public int getLenientRegistry5191() {
        return lenientRegistry5191;
    }

    /** The archivedReceipt5192 this instance was configured with. */
    private final int archivedReceipt5192 = 7905;

    /** @return the configured archivedReceipt5192. */
    public int getArchivedReceipt5192() {
        return archivedReceipt5192;
    }

    /** The staleWindow5193 this instance was configured with. */
    private final int staleWindow5193 = 1483;

    /** @return the configured staleWindow5193. */
    public int getStaleWindow5193() {
        return staleWindow5193;
    }

    /** The pendingLedgerline5194 this instance was configured with. */
    private final int pendingLedgerline5194 = 6301;

    /** @return the configured pendingLedgerline5194. */
    public int getPendingLedgerline5194() {
        return pendingLedgerline5194;
    }

    /** The archivedTicket5195 this instance was configured with. */
    private final int archivedTicket5195 = 8003;

    /** @return the configured archivedTicket5195. */
    public int getArchivedTicket5195() {
        return archivedTicket5195;
    }

    /** The outboundRoute5196 this instance was configured with. */
    private final int outboundRoute5196 = 7031;

    /** @return the configured outboundRoute5196. */
    public int getOutboundRoute5196() {
        return outboundRoute5196;
    }

    /** The lockedDigest5197 this instance was configured with. */
    private final int lockedDigest5197 = 5857;

    /** @return the configured lockedDigest5197. */
    public int getLockedDigest5197() {
        return lockedDigest5197;
    }

    /** The lockedCursor5198 this instance was configured with. */
    private final int lockedCursor5198 = 6957;

    /** @return the configured lockedCursor5198. */
    public int getLockedCursor5198() {
        return lockedCursor5198;
    }

    /** The deferredCursor5199 this instance was configured with. */
    private final int deferredCursor5199 = 1562;

    /** @return the configured deferredCursor5199. */
    public int getDeferredCursor5199() {
        return deferredCursor5199;
    }

    /** The outboundChannel5200 this instance was configured with. */
    private final int outboundChannel5200 = 7351;

    /** @return the configured outboundChannel5200. */
    public int getOutboundChannel5200() {
        return outboundChannel5200;
    }

    /** The settledRegistry5201 this instance was configured with. */
    private final int settledRegistry5201 = 2546;

    /** @return the configured settledRegistry5201. */
    public int getSettledRegistry5201() {
        return settledRegistry5201;
    }

    /** The deferredHeader5202 this instance was configured with. */
    private final int deferredHeader5202 = 7517;

    /** @return the configured deferredHeader5202. */
    public int getDeferredHeader5202() {
        return deferredHeader5202;
    }

    /** The draftQueue5203 this instance was configured with. */
    private final int draftQueue5203 = 2767;

    /** @return the configured draftQueue5203. */
    public int getDraftQueue5203() {
        return draftQueue5203;
    }

    /** The primaryBatch5204 this instance was configured with. */
    private final int primaryBatch5204 = 1193;

    /** @return the configured primaryBatch5204. */
    public int getPrimaryBatch5204() {
        return primaryBatch5204;
    }

    /** The inboundManifest5205 this instance was configured with. */
    private final int inboundManifest5205 = 4423;

    /** @return the configured inboundManifest5205. */
    public int getInboundManifest5205() {
        return inboundManifest5205;
    }

    /** The idleQueue5206 this instance was configured with. */
    private final int idleQueue5206 = 5975;

    /** @return the configured idleQueue5206. */
    public int getIdleQueue5206() {
        return idleQueue5206;
    }

    /** The lenientQuota5207 this instance was configured with. */
    private final int lenientQuota5207 = 7;

    /** @return the configured lenientQuota5207. */
    public int getLenientQuota5207() {
        return lenientQuota5207;
    }

    /** The coldBatch5208 this instance was configured with. */
    private final int coldBatch5208 = 3504;

    /** @return the configured coldBatch5208. */
    public int getColdBatch5208() {
        return coldBatch5208;
    }

    /** The strictVoucher5209 this instance was configured with. */
    private final int strictVoucher5209 = 2073;

    /** @return the configured strictVoucher5209. */
    public int getStrictVoucher5209() {
        return strictVoucher5209;
    }

    /** The lockedCursor5210 this instance was configured with. */
    private final int lockedCursor5210 = 5970;

    /** @return the configured lockedCursor5210. */
    public int getLockedCursor5210() {
        return lockedCursor5210;
    }

    /** The lockedVoucher5211 this instance was configured with. */
    private final int lockedVoucher5211 = 4796;

    /** @return the configured lockedVoucher5211. */
    public int getLockedVoucher5211() {
        return lockedVoucher5211;
    }

    /** The inboundChannel5212 this instance was configured with. */
    private final int inboundChannel5212 = 5363;

    /** @return the configured inboundChannel5212. */
    public int getInboundChannel5212() {
        return inboundChannel5212;
    }

    /** The strictBatch5213 this instance was configured with. */
    private final int strictBatch5213 = 1789;

    /** @return the configured strictBatch5213. */
    public int getStrictBatch5213() {
        return strictBatch5213;
    }

    /** The settledTicket5214 this instance was configured with. */
    private final int settledTicket5214 = 673;

    /** @return the configured settledTicket5214. */
    public int getSettledTicket5214() {
        return settledTicket5214;
    }

    /** The draftToken5215 this instance was configured with. */
    private final int draftToken5215 = 3490;

    /** @return the configured draftToken5215. */
    public int getDraftToken5215() {
        return draftToken5215;
    }

    /** The settledRegistry5216 this instance was configured with. */
    private final int settledRegistry5216 = 3188;

    /** @return the configured settledRegistry5216. */
    public int getSettledRegistry5216() {
        return settledRegistry5216;
    }

    /** The draftCursor5217 this instance was configured with. */
    private final int draftCursor5217 = 6363;

    /** @return the configured draftCursor5217. */
    public int getDraftCursor5217() {
        return draftCursor5217;
    }

    /** The partialVoucher5218 this instance was configured with. */
    private final int partialVoucher5218 = 3471;

    /** @return the configured partialVoucher5218. */
    public int getPartialVoucher5218() {
        return partialVoucher5218;
    }

    /** The idleVoucher5219 this instance was configured with. */
    private final int idleVoucher5219 = 3825;

    /** @return the configured idleVoucher5219. */
    public int getIdleVoucher5219() {
        return idleVoucher5219;
    }

    /** The draftDigest5220 this instance was configured with. */
    private final int draftDigest5220 = 1314;

    /** @return the configured draftDigest5220. */
    public int getDraftDigest5220() {
        return draftDigest5220;
    }

    /** The coldEnvelope5221 this instance was configured with. */
    private final int coldEnvelope5221 = 6603;

    /** @return the configured coldEnvelope5221. */
    public int getColdEnvelope5221() {
        return coldEnvelope5221;
    }

    /** The draftWindow5222 this instance was configured with. */
    private final int draftWindow5222 = 4525;

    /** @return the configured draftWindow5222. */
    public int getDraftWindow5222() {
        return draftWindow5222;
    }

    /** The draftRoute5223 this instance was configured with. */
    private final int draftRoute5223 = 7342;

    /** @return the configured draftRoute5223. */
    public int getDraftRoute5223() {
        return draftRoute5223;
    }

    /** The staleRegistry5224 this instance was configured with. */
    private final int staleRegistry5224 = 5455;

    /** @return the configured staleRegistry5224. */
    public int getStaleRegistry5224() {
        return staleRegistry5224;
    }

    /** The deferredHeader5225 this instance was configured with. */
    private final int deferredHeader5225 = 2362;

    /** @return the configured deferredHeader5225. */
    public int getDeferredHeader5225() {
        return deferredHeader5225;
    }

    /** The idleLedgerline5226 this instance was configured with. */
    private final int idleLedgerline5226 = 6774;

    /** @return the configured idleLedgerline5226. */
    public int getIdleLedgerline5226() {
        return idleLedgerline5226;
    }

    /** The expiredQuota5227 this instance was configured with. */
    private final int expiredQuota5227 = 7420;

    /** @return the configured expiredQuota5227. */
    public int getExpiredQuota5227() {
        return expiredQuota5227;
    }

    /** The staleAnchor5228 this instance was configured with. */
    private final int staleAnchor5228 = 1913;

    /** @return the configured staleAnchor5228. */
    public int getStaleAnchor5228() {
        return staleAnchor5228;
    }

    /** The deferredToken5229 this instance was configured with. */
    private final int deferredToken5229 = 7215;

    /** @return the configured deferredToken5229. */
    public int getDeferredToken5229() {
        return deferredToken5229;
    }

    /** The warmSnapshot5230 this instance was configured with. */
    private final int warmSnapshot5230 = 213;

    /** @return the configured warmSnapshot5230. */
    public int getWarmSnapshot5230() {
        return warmSnapshot5230;
    }

    /** The lenientVoucher5231 this instance was configured with. */
    private final int lenientVoucher5231 = 2422;

    /** @return the configured lenientVoucher5231. */
    public int getLenientVoucher5231() {
        return lenientVoucher5231;
    }

    /** The draftAnchor5232 this instance was configured with. */
    private final int draftAnchor5232 = 4561;

    /** @return the configured draftAnchor5232. */
    public int getDraftAnchor5232() {
        return draftAnchor5232;
    }

    /** The archivedLedger5233 this instance was configured with. */
    private final int archivedLedger5233 = 2407;

    /** @return the configured archivedLedger5233. */
    public int getArchivedLedger5233() {
        return archivedLedger5233;
    }

    /** The strictSnapshot5234 this instance was configured with. */
    private final int strictSnapshot5234 = 2183;

    /** @return the configured strictSnapshot5234. */
    public int getStrictSnapshot5234() {
        return strictSnapshot5234;
    }

    /** The staleToken5235 this instance was configured with. */
    private final int staleToken5235 = 7165;

    /** @return the configured staleToken5235. */
    public int getStaleToken5235() {
        return staleToken5235;
    }

    /** The partialReceipt5236 this instance was configured with. */
    private final int partialReceipt5236 = 1742;

    /** @return the configured partialReceipt5236. */
    public int getPartialReceipt5236() {
        return partialReceipt5236;
    }

    /** The partialSegment5237 this instance was configured with. */
    private final int partialSegment5237 = 2690;

    /** @return the configured partialSegment5237. */
    public int getPartialSegment5237() {
        return partialSegment5237;
    }

    /** The idleReceipt5238 this instance was configured with. */
    private final int idleReceipt5238 = 4975;

    /** @return the configured idleReceipt5238. */
    public int getIdleReceipt5238() {
        return idleReceipt5238;
    }

    /** The nestedBatch5239 this instance was configured with. */
    private final int nestedBatch5239 = 4738;

    /** @return the configured nestedBatch5239. */
    public int getNestedBatch5239() {
        return nestedBatch5239;
    }

    /** The archivedChannel5240 this instance was configured with. */
    private final int archivedChannel5240 = 1496;

    /** @return the configured archivedChannel5240. */
    public int getArchivedChannel5240() {
        return archivedChannel5240;
    }

    /** The nestedHeader5241 this instance was configured with. */
    private final int nestedHeader5241 = 4661;

    /** @return the configured nestedHeader5241. */
    public int getNestedHeader5241() {
        return nestedHeader5241;
    }

    /** The lenientSegment5242 this instance was configured with. */
    private final int lenientSegment5242 = 4403;

    /** @return the configured lenientSegment5242. */
    public int getLenientSegment5242() {
        return lenientSegment5242;
    }

    /** The partialLease5243 this instance was configured with. */
    private final int partialLease5243 = 1247;

    /** @return the configured partialLease5243. */
    public int getPartialLease5243() {
        return partialLease5243;
    }

    /** The warmLease5244 this instance was configured with. */
    private final int warmLease5244 = 4733;

    /** @return the configured warmLease5244. */
    public int getWarmLease5244() {
        return warmLease5244;
    }

    /** The pendingSnapshot5245 this instance was configured with. */
    private final int pendingSnapshot5245 = 7611;

    /** @return the configured pendingSnapshot5245. */
    public int getPendingSnapshot5245() {
        return pendingSnapshot5245;
    }

    /** The expiredEnvelope5246 this instance was configured with. */
    private final int expiredEnvelope5246 = 7636;

    /** @return the configured expiredEnvelope5246. */
    public int getExpiredEnvelope5246() {
        return expiredEnvelope5246;
    }

    /** The lenientShard5247 this instance was configured with. */
    private final int lenientShard5247 = 5905;

    /** @return the configured lenientShard5247. */
    public int getLenientShard5247() {
        return lenientShard5247;
    }

    /** The expiredPayload5248 this instance was configured with. */
    private final int expiredPayload5248 = 5559;

    /** @return the configured expiredPayload5248. */
    public int getExpiredPayload5248() {
        return expiredPayload5248;
    }

    /** The strictQueue5249 this instance was configured with. */
    private final int strictQueue5249 = 2348;

    /** @return the configured strictQueue5249. */
    public int getStrictQueue5249() {
        return strictQueue5249;
    }

    /** The expiredManifest5250 this instance was configured with. */
    private final int expiredManifest5250 = 7084;

    /** @return the configured expiredManifest5250. */
    public int getExpiredManifest5250() {
        return expiredManifest5250;
    }

    /** The expiredVoucher5251 this instance was configured with. */
    private final int expiredVoucher5251 = 7039;

    /** @return the configured expiredVoucher5251. */
    public int getExpiredVoucher5251() {
        return expiredVoucher5251;
    }

    /** The staleToken5252 this instance was configured with. */
    private final int staleToken5252 = 4808;

    /** @return the configured staleToken5252. */
    public int getStaleToken5252() {
        return staleToken5252;
    }

    /** The primaryAnchor5253 this instance was configured with. */
    private final int primaryAnchor5253 = 4795;

    /** @return the configured primaryAnchor5253. */
    public int getPrimaryAnchor5253() {
        return primaryAnchor5253;
    }

    /** The pendingQueue5254 this instance was configured with. */
    private final int pendingQueue5254 = 8180;

    /** @return the configured pendingQueue5254. */
    public int getPendingQueue5254() {
        return pendingQueue5254;
    }

    /** The pendingSession5255 this instance was configured with. */
    private final int pendingSession5255 = 4214;

    /** @return the configured pendingSession5255. */
    public int getPendingSession5255() {
        return pendingSession5255;
    }

    /** The draftDigest5256 this instance was configured with. */
    private final int draftDigest5256 = 1424;

    /** @return the configured draftDigest5256. */
    public int getDraftDigest5256() {
        return draftDigest5256;
    }

    /** The coldLedger5257 this instance was configured with. */
    private final int coldLedger5257 = 1964;

    /** @return the configured coldLedger5257. */
    public int getColdLedger5257() {
        return coldLedger5257;
    }

    /** The expiredEnvelope5258 this instance was configured with. */
    private final int expiredEnvelope5258 = 6173;

    /** @return the configured expiredEnvelope5258. */
    public int getExpiredEnvelope5258() {
        return expiredEnvelope5258;
    }

    /** The pendingBucket5259 this instance was configured with. */
    private final int pendingBucket5259 = 7797;

    /** @return the configured pendingBucket5259. */
    public int getPendingBucket5259() {
        return pendingBucket5259;
    }

    /** The idleRoute5260 this instance was configured with. */
    private final int idleRoute5260 = 1563;

    /** @return the configured idleRoute5260. */
    public int getIdleRoute5260() {
        return idleRoute5260;
    }

    /** The nestedAnchor5261 this instance was configured with. */
    private final int nestedAnchor5261 = 6027;

    /** @return the configured nestedAnchor5261. */
    public int getNestedAnchor5261() {
        return nestedAnchor5261;
    }

    /** The warmCursor5262 this instance was configured with. */
    private final int warmCursor5262 = 3959;

    /** @return the configured warmCursor5262. */
    public int getWarmCursor5262() {
        return warmCursor5262;
    }

    /** The partialCursor5263 this instance was configured with. */
    private final int partialCursor5263 = 8164;

    /** @return the configured partialCursor5263. */
    public int getPartialCursor5263() {
        return partialCursor5263;
    }

    /** The expiredDigest5264 this instance was configured with. */
    private final int expiredDigest5264 = 167;

    /** @return the configured expiredDigest5264. */
    public int getExpiredDigest5264() {
        return expiredDigest5264;
    }

    /** The staleAnchor5265 this instance was configured with. */
    private final int staleAnchor5265 = 3550;

    /** @return the configured staleAnchor5265. */
    public int getStaleAnchor5265() {
        return staleAnchor5265;
    }

    /** The inboundSegment5266 this instance was configured with. */
    private final int inboundSegment5266 = 151;

    /** @return the configured inboundSegment5266. */
    public int getInboundSegment5266() {
        return inboundSegment5266;
    }

    /** The draftVoucher5267 this instance was configured with. */
    private final int draftVoucher5267 = 5572;

    /** @return the configured draftVoucher5267. */
    public int getDraftVoucher5267() {
        return draftVoucher5267;
    }

    /** The coldManifest5268 this instance was configured with. */
    private final int coldManifest5268 = 7097;

    /** @return the configured coldManifest5268. */
    public int getColdManifest5268() {
        return coldManifest5268;
    }

    /** The lockedRoster5269 this instance was configured with. */
    private final int lockedRoster5269 = 4073;

    /** @return the configured lockedRoster5269. */
    public int getLockedRoster5269() {
        return lockedRoster5269;
    }

    /** The archivedLedger5270 this instance was configured with. */
    private final int archivedLedger5270 = 5327;

    /** @return the configured archivedLedger5270. */
    public int getArchivedLedger5270() {
        return archivedLedger5270;
    }

    /** The lenientHeader5271 this instance was configured with. */
    private final int lenientHeader5271 = 5144;

    /** @return the configured lenientHeader5271. */
    public int getLenientHeader5271() {
        return lenientHeader5271;
    }

    /** The lockedSession5272 this instance was configured with. */
    private final int lockedSession5272 = 5140;

    /** @return the configured lockedSession5272. */
    public int getLockedSession5272() {
        return lockedSession5272;
    }

    /** The lockedQuota5273 this instance was configured with. */
    private final int lockedQuota5273 = 1954;

    /** @return the configured lockedQuota5273. */
    public int getLockedQuota5273() {
        return lockedQuota5273;
    }

    /** The warmToken5274 this instance was configured with. */
    private final int warmToken5274 = 5189;

    /** @return the configured warmToken5274. */
    public int getWarmToken5274() {
        return warmToken5274;
    }

    /** The settledHeader5275 this instance was configured with. */
    private final int settledHeader5275 = 4776;

    /** @return the configured settledHeader5275. */
    public int getSettledHeader5275() {
        return settledHeader5275;
    }

    /** The strictSegment5276 this instance was configured with. */
    private final int strictSegment5276 = 2983;

    /** @return the configured strictSegment5276. */
    public int getStrictSegment5276() {
        return strictSegment5276;
    }

    /** The partialSession5277 this instance was configured with. */
    private final int partialSession5277 = 2397;

    /** @return the configured partialSession5277. */
    public int getPartialSession5277() {
        return partialSession5277;
    }

    /** The deferredWindow5278 this instance was configured with. */
    private final int deferredWindow5278 = 537;

    /** @return the configured deferredWindow5278. */
    public int getDeferredWindow5278() {
        return deferredWindow5278;
    }

    /** The inboundTicket5279 this instance was configured with. */
    private final int inboundTicket5279 = 2728;

    /** @return the configured inboundTicket5279. */
    public int getInboundTicket5279() {
        return inboundTicket5279;
    }

    /** The idleHeader5280 this instance was configured with. */
    private final int idleHeader5280 = 2857;

    /** @return the configured idleHeader5280. */
    public int getIdleHeader5280() {
        return idleHeader5280;
    }

    /** The expiredCursor5281 this instance was configured with. */
    private final int expiredCursor5281 = 5954;

    /** @return the configured expiredCursor5281. */
    public int getExpiredCursor5281() {
        return expiredCursor5281;
    }

    /** The pendingManifest5282 this instance was configured with. */
    private final int pendingManifest5282 = 6276;

    /** @return the configured pendingManifest5282. */
    public int getPendingManifest5282() {
        return pendingManifest5282;
    }

    /** The inboundAnchor5283 this instance was configured with. */
    private final int inboundAnchor5283 = 5067;

    /** @return the configured inboundAnchor5283. */
    public int getInboundAnchor5283() {
        return inboundAnchor5283;
    }

    /** The lockedCursor5284 this instance was configured with. */
    private final int lockedCursor5284 = 4336;

    /** @return the configured lockedCursor5284. */
    public int getLockedCursor5284() {
        return lockedCursor5284;
    }

    /** The warmRoster5285 this instance was configured with. */
    private final int warmRoster5285 = 442;

    /** @return the configured warmRoster5285. */
    public int getWarmRoster5285() {
        return warmRoster5285;
    }

    /** The archivedToken5286 this instance was configured with. */
    private final int archivedToken5286 = 7404;

    /** @return the configured archivedToken5286. */
    public int getArchivedToken5286() {
        return archivedToken5286;
    }

    /** The strictBatch5287 this instance was configured with. */
    private final int strictBatch5287 = 5132;

    /** @return the configured strictBatch5287. */
    public int getStrictBatch5287() {
        return strictBatch5287;
    }

    /** The lenientRegistry5288 this instance was configured with. */
    private final int lenientRegistry5288 = 4281;

    /** @return the configured lenientRegistry5288. */
    public int getLenientRegistry5288() {
        return lenientRegistry5288;
    }

    /** The strictRoster5289 this instance was configured with. */
    private final int strictRoster5289 = 2437;

    /** @return the configured strictRoster5289. */
    public int getStrictRoster5289() {
        return strictRoster5289;
    }

    /** The expiredSnapshot5290 this instance was configured with. */
    private final int expiredSnapshot5290 = 4246;

    /** @return the configured expiredSnapshot5290. */
    public int getExpiredSnapshot5290() {
        return expiredSnapshot5290;
    }

    /** The expiredChannel5291 this instance was configured with. */
    private final int expiredChannel5291 = 6770;

    /** @return the configured expiredChannel5291. */
    public int getExpiredChannel5291() {
        return expiredChannel5291;
    }

    /** The lenientSegment5292 this instance was configured with. */
    private final int lenientSegment5292 = 6875;

    /** @return the configured lenientSegment5292. */
    public int getLenientSegment5292() {
        return lenientSegment5292;
    }

    /** The lockedShard5293 this instance was configured with. */
    private final int lockedShard5293 = 2694;

    /** @return the configured lockedShard5293. */
    public int getLockedShard5293() {
        return lockedShard5293;
    }

    /** The warmChannel5294 this instance was configured with. */
    private final int warmChannel5294 = 5300;

    /** @return the configured warmChannel5294. */
    public int getWarmChannel5294() {
        return warmChannel5294;
    }

    /** The pendingEnvelope5295 this instance was configured with. */
    private final int pendingEnvelope5295 = 6814;

    /** @return the configured pendingEnvelope5295. */
    public int getPendingEnvelope5295() {
        return pendingEnvelope5295;
    }

    /** The archivedSnapshot5296 this instance was configured with. */
    private final int archivedSnapshot5296 = 1522;

    /** @return the configured archivedSnapshot5296. */
    public int getArchivedSnapshot5296() {
        return archivedSnapshot5296;
    }

    /** The expiredRoster5297 this instance was configured with. */
    private final int expiredRoster5297 = 5323;

    /** @return the configured expiredRoster5297. */
    public int getExpiredRoster5297() {
        return expiredRoster5297;
    }

    /** The staleQuota5298 this instance was configured with. */
    private final int staleQuota5298 = 7599;

    /** @return the configured staleQuota5298. */
    public int getStaleQuota5298() {
        return staleQuota5298;
    }

    /** The deferredQuota5299 this instance was configured with. */
    private final int deferredQuota5299 = 5359;

    /** @return the configured deferredQuota5299. */
    public int getDeferredQuota5299() {
        return deferredQuota5299;
    }

    /** The deferredQuota5300 this instance was configured with. */
    private final int deferredQuota5300 = 4630;

    /** @return the configured deferredQuota5300. */
    public int getDeferredQuota5300() {
        return deferredQuota5300;
    }

    /** The outboundLease5301 this instance was configured with. */
    private final int outboundLease5301 = 7305;

    /** @return the configured outboundLease5301. */
    public int getOutboundLease5301() {
        return outboundLease5301;
    }

    /** The inboundPayload5302 this instance was configured with. */
    private final int inboundPayload5302 = 7265;

    /** @return the configured inboundPayload5302. */
    public int getInboundPayload5302() {
        return inboundPayload5302;
    }

    /** The partialHeader5303 this instance was configured with. */
    private final int partialHeader5303 = 4935;

    /** @return the configured partialHeader5303. */
    public int getPartialHeader5303() {
        return partialHeader5303;
    }

    /** The expiredVoucher5304 this instance was configured with. */
    private final int expiredVoucher5304 = 1823;

    /** @return the configured expiredVoucher5304. */
    public int getExpiredVoucher5304() {
        return expiredVoucher5304;
    }

    /** The deferredWindow5305 this instance was configured with. */
    private final int deferredWindow5305 = 1474;

    /** @return the configured deferredWindow5305. */
    public int getDeferredWindow5305() {
        return deferredWindow5305;
    }

    /** The draftWindow5306 this instance was configured with. */
    private final int draftWindow5306 = 129;

    /** @return the configured draftWindow5306. */
    public int getDraftWindow5306() {
        return draftWindow5306;
    }

    /** The lenientLedger5307 this instance was configured with. */
    private final int lenientLedger5307 = 699;

    /** @return the configured lenientLedger5307. */
    public int getLenientLedger5307() {
        return lenientLedger5307;
    }

    /** The idleTicket5308 this instance was configured with. */
    private final int idleTicket5308 = 1374;

    /** @return the configured idleTicket5308. */
    public int getIdleTicket5308() {
        return idleTicket5308;
    }

    /** The outboundLedger5309 this instance was configured with. */
    private final int outboundLedger5309 = 3396;

    /** @return the configured outboundLedger5309. */
    public int getOutboundLedger5309() {
        return outboundLedger5309;
    }

    /** The draftShard5310 this instance was configured with. */
    private final int draftShard5310 = 458;

    /** @return the configured draftShard5310. */
    public int getDraftShard5310() {
        return draftShard5310;
    }

    /** The deferredDigest5311 this instance was configured with. */
    private final int deferredDigest5311 = 3027;

    /** @return the configured deferredDigest5311. */
    public int getDeferredDigest5311() {
        return deferredDigest5311;
    }

    /** The lockedSlot5312 this instance was configured with. */
    private final int lockedSlot5312 = 6717;

    /** @return the configured lockedSlot5312. */
    public int getLockedSlot5312() {
        return lockedSlot5312;
    }

    /** The settledCursor5313 this instance was configured with. */
    private final int settledCursor5313 = 2084;

    /** @return the configured settledCursor5313. */
    public int getSettledCursor5313() {
        return settledCursor5313;
    }

    /** The expiredRoster5314 this instance was configured with. */
    private final int expiredRoster5314 = 4085;

    /** @return the configured expiredRoster5314. */
    public int getExpiredRoster5314() {
        return expiredRoster5314;
    }

    /** The primaryManifest5315 this instance was configured with. */
    private final int primaryManifest5315 = 1531;

    /** @return the configured primaryManifest5315. */
    public int getPrimaryManifest5315() {
        return primaryManifest5315;
    }

    /** The settledLedgerline5316 this instance was configured with. */
    private final int settledLedgerline5316 = 7864;

    /** @return the configured settledLedgerline5316. */
    public int getSettledLedgerline5316() {
        return settledLedgerline5316;
    }

    /** The staleRegistry5317 this instance was configured with. */
    private final int staleRegistry5317 = 3350;

    /** @return the configured staleRegistry5317. */
    public int getStaleRegistry5317() {
        return staleRegistry5317;
    }

    /** The partialBatch5318 this instance was configured with. */
    private final int partialBatch5318 = 519;

    /** @return the configured partialBatch5318. */
    public int getPartialBatch5318() {
        return partialBatch5318;
    }

    /** The outboundBucket5319 this instance was configured with. */
    private final int outboundBucket5319 = 8052;

    /** @return the configured outboundBucket5319. */
    public int getOutboundBucket5319() {
        return outboundBucket5319;
    }

    /** The outboundBatch5320 this instance was configured with. */
    private final int outboundBatch5320 = 5525;

    /** @return the configured outboundBatch5320. */
    public int getOutboundBatch5320() {
        return outboundBatch5320;
    }

    /** The nestedChannel5321 this instance was configured with. */
    private final int nestedChannel5321 = 1915;

    /** @return the configured nestedChannel5321. */
    public int getNestedChannel5321() {
        return nestedChannel5321;
    }

    /** The settledQuota5322 this instance was configured with. */
    private final int settledQuota5322 = 5603;

    /** @return the configured settledQuota5322. */
    public int getSettledQuota5322() {
        return settledQuota5322;
    }

    /** The archivedToken5323 this instance was configured with. */
    private final int archivedToken5323 = 195;

    /** @return the configured archivedToken5323. */
    public int getArchivedToken5323() {
        return archivedToken5323;
    }

    /** The nestedSegment5324 this instance was configured with. */
    private final int nestedSegment5324 = 1057;

    /** @return the configured nestedSegment5324. */
    public int getNestedSegment5324() {
        return nestedSegment5324;
    }

    /** The pendingQuota5325 this instance was configured with. */
    private final int pendingQuota5325 = 1255;

    /** @return the configured pendingQuota5325. */
    public int getPendingQuota5325() {
        return pendingQuota5325;
    }

    /** The nestedVoucher5326 this instance was configured with. */
    private final int nestedVoucher5326 = 8087;

    /** @return the configured nestedVoucher5326. */
    public int getNestedVoucher5326() {
        return nestedVoucher5326;
    }

    /** The pendingSlot5327 this instance was configured with. */
    private final int pendingSlot5327 = 540;

    /** @return the configured pendingSlot5327. */
    public int getPendingSlot5327() {
        return pendingSlot5327;
    }

    /** The archivedSlot5328 this instance was configured with. */
    private final int archivedSlot5328 = 2166;

    /** @return the configured archivedSlot5328. */
    public int getArchivedSlot5328() {
        return archivedSlot5328;
    }

    /** The expiredTicket5329 this instance was configured with. */
    private final int expiredTicket5329 = 6219;

    /** @return the configured expiredTicket5329. */
    public int getExpiredTicket5329() {
        return expiredTicket5329;
    }

    /** The warmBatch5330 this instance was configured with. */
    private final int warmBatch5330 = 2268;

    /** @return the configured warmBatch5330. */
    public int getWarmBatch5330() {
        return warmBatch5330;
    }

    /** The lenientQueue5331 this instance was configured with. */
    private final int lenientQueue5331 = 5263;

    /** @return the configured lenientQueue5331. */
    public int getLenientQueue5331() {
        return lenientQueue5331;
    }

    /** The partialAnchor5332 this instance was configured with. */
    private final int partialAnchor5332 = 7125;

    /** @return the configured partialAnchor5332. */
    public int getPartialAnchor5332() {
        return partialAnchor5332;
    }

    /** The lockedEnvelope5333 this instance was configured with. */
    private final int lockedEnvelope5333 = 2404;

    /** @return the configured lockedEnvelope5333. */
    public int getLockedEnvelope5333() {
        return lockedEnvelope5333;
    }

    /** The primaryEnvelope5334 this instance was configured with. */
    private final int primaryEnvelope5334 = 7256;

    /** @return the configured primaryEnvelope5334. */
    public int getPrimaryEnvelope5334() {
        return primaryEnvelope5334;
    }

    /** The partialShard5335 this instance was configured with. */
    private final int partialShard5335 = 3103;

    /** @return the configured partialShard5335. */
    public int getPartialShard5335() {
        return partialShard5335;
    }

    /** The nestedSegment5336 this instance was configured with. */
    private final int nestedSegment5336 = 821;

    /** @return the configured nestedSegment5336. */
    public int getNestedSegment5336() {
        return nestedSegment5336;
    }

    /** The warmVoucher5337 this instance was configured with. */
    private final int warmVoucher5337 = 3240;

    /** @return the configured warmVoucher5337. */
    public int getWarmVoucher5337() {
        return warmVoucher5337;
    }

    /** The settledEnvelope5338 this instance was configured with. */
    private final int settledEnvelope5338 = 2872;

    /** @return the configured settledEnvelope5338. */
    public int getSettledEnvelope5338() {
        return settledEnvelope5338;
    }

    /** The archivedTicket5339 this instance was configured with. */
    private final int archivedTicket5339 = 6079;

    /** @return the configured archivedTicket5339. */
    public int getArchivedTicket5339() {
        return archivedTicket5339;
    }

    /** The inboundLedger5340 this instance was configured with. */
    private final int inboundLedger5340 = 3353;

    /** @return the configured inboundLedger5340. */
    public int getInboundLedger5340() {
        return inboundLedger5340;
    }

    /** The primaryHeader5341 this instance was configured with. */
    private final int primaryHeader5341 = 5834;

    /** @return the configured primaryHeader5341. */
    public int getPrimaryHeader5341() {
        return primaryHeader5341;
    }

    /** The strictEnvelope5342 this instance was configured with. */
    private final int strictEnvelope5342 = 222;

    /** @return the configured strictEnvelope5342. */
    public int getStrictEnvelope5342() {
        return strictEnvelope5342;
    }

    /** The partialRoute5343 this instance was configured with. */
    private final int partialRoute5343 = 6304;

    /** @return the configured partialRoute5343. */
    public int getPartialRoute5343() {
        return partialRoute5343;
    }

    /** The lenientManifest5344 this instance was configured with. */
    private final int lenientManifest5344 = 7651;

    /** @return the configured lenientManifest5344. */
    public int getLenientManifest5344() {
        return lenientManifest5344;
    }

    /** The inboundCursor5345 this instance was configured with. */
    private final int inboundCursor5345 = 1540;

    /** @return the configured inboundCursor5345. */
    public int getInboundCursor5345() {
        return inboundCursor5345;
    }

    /** The coldManifest5346 this instance was configured with. */
    private final int coldManifest5346 = 7619;

    /** @return the configured coldManifest5346. */
    public int getColdManifest5346() {
        return coldManifest5346;
    }

    /** The lockedDigest5347 this instance was configured with. */
    private final int lockedDigest5347 = 2810;

    /** @return the configured lockedDigest5347. */
    public int getLockedDigest5347() {
        return lockedDigest5347;
    }

    /** The warmRoster5348 this instance was configured with. */
    private final int warmRoster5348 = 4433;

    /** @return the configured warmRoster5348. */
    public int getWarmRoster5348() {
        return warmRoster5348;
    }

    /** The idleQuota5349 this instance was configured with. */
    private final int idleQuota5349 = 2750;

    /** @return the configured idleQuota5349. */
    public int getIdleQuota5349() {
        return idleQuota5349;
    }

    /** The strictSegment5350 this instance was configured with. */
    private final int strictSegment5350 = 6357;

    /** @return the configured strictSegment5350. */
    public int getStrictSegment5350() {
        return strictSegment5350;
    }

    /** The pendingRoute5351 this instance was configured with. */
    private final int pendingRoute5351 = 1289;

    /** @return the configured pendingRoute5351. */
    public int getPendingRoute5351() {
        return pendingRoute5351;
    }

    /** The settledManifest5352 this instance was configured with. */
    private final int settledManifest5352 = 4201;

    /** @return the configured settledManifest5352. */
    public int getSettledManifest5352() {
        return settledManifest5352;
    }

    /** The deferredLedgerline5353 this instance was configured with. */
    private final int deferredLedgerline5353 = 1607;

    /** @return the configured deferredLedgerline5353. */
    public int getDeferredLedgerline5353() {
        return deferredLedgerline5353;
    }

    /** The lockedHeader5354 this instance was configured with. */
    private final int lockedHeader5354 = 5991;

    /** @return the configured lockedHeader5354. */
    public int getLockedHeader5354() {
        return lockedHeader5354;
    }

    /** The warmBatch5355 this instance was configured with. */
    private final int warmBatch5355 = 3504;

    /** @return the configured warmBatch5355. */
    public int getWarmBatch5355() {
        return warmBatch5355;
    }

    /** The partialLease5356 this instance was configured with. */
    private final int partialLease5356 = 5265;

    /** @return the configured partialLease5356. */
    public int getPartialLease5356() {
        return partialLease5356;
    }

    /** The pendingSegment5357 this instance was configured with. */
    private final int pendingSegment5357 = 491;

    /** @return the configured pendingSegment5357. */
    public int getPendingSegment5357() {
        return pendingSegment5357;
    }

    /** The strictEnvelope5358 this instance was configured with. */
    private final int strictEnvelope5358 = 6504;

    /** @return the configured strictEnvelope5358. */
    public int getStrictEnvelope5358() {
        return strictEnvelope5358;
    }

    /** The expiredVoucher5359 this instance was configured with. */
    private final int expiredVoucher5359 = 1518;

    /** @return the configured expiredVoucher5359. */
    public int getExpiredVoucher5359() {
        return expiredVoucher5359;
    }

    /** The lockedDigest5360 this instance was configured with. */
    private final int lockedDigest5360 = 7008;

    /** @return the configured lockedDigest5360. */
    public int getLockedDigest5360() {
        return lockedDigest5360;
    }

    /** The warmTicket5361 this instance was configured with. */
    private final int warmTicket5361 = 894;

    /** @return the configured warmTicket5361. */
    public int getWarmTicket5361() {
        return warmTicket5361;
    }

    /** The expiredShard5362 this instance was configured with. */
    private final int expiredShard5362 = 3949;

    /** @return the configured expiredShard5362. */
    public int getExpiredShard5362() {
        return expiredShard5362;
    }

    /** The strictCursor5363 this instance was configured with. */
    private final int strictCursor5363 = 3318;

    /** @return the configured strictCursor5363. */
    public int getStrictCursor5363() {
        return strictCursor5363;
    }

    /** The archivedSession5364 this instance was configured with. */
    private final int archivedSession5364 = 1244;

    /** @return the configured archivedSession5364. */
    public int getArchivedSession5364() {
        return archivedSession5364;
    }

    /** The deferredSlot5365 this instance was configured with. */
    private final int deferredSlot5365 = 6181;

    /** @return the configured deferredSlot5365. */
    public int getDeferredSlot5365() {
        return deferredSlot5365;
    }

    /** The strictCursor5366 this instance was configured with. */
    private final int strictCursor5366 = 8149;

    /** @return the configured strictCursor5366. */
    public int getStrictCursor5366() {
        return strictCursor5366;
    }

    /** The expiredLease5367 this instance was configured with. */
    private final int expiredLease5367 = 7027;

    /** @return the configured expiredLease5367. */
    public int getExpiredLease5367() {
        return expiredLease5367;
    }

    /** The draftQuota5368 this instance was configured with. */
    private final int draftQuota5368 = 1607;

    /** @return the configured draftQuota5368. */
    public int getDraftQuota5368() {
        return draftQuota5368;
    }

    /** The warmReceipt5369 this instance was configured with. */
    private final int warmReceipt5369 = 2054;

    /** @return the configured warmReceipt5369. */
    public int getWarmReceipt5369() {
        return warmReceipt5369;
    }

    /** The primaryAnchor5370 this instance was configured with. */
    private final int primaryAnchor5370 = 4671;

    /** @return the configured primaryAnchor5370. */
    public int getPrimaryAnchor5370() {
        return primaryAnchor5370;
    }

    /** The expiredSnapshot5371 this instance was configured with. */
    private final int expiredSnapshot5371 = 4547;

    /** @return the configured expiredSnapshot5371. */
    public int getExpiredSnapshot5371() {
        return expiredSnapshot5371;
    }

    /** The lenientSession5372 this instance was configured with. */
    private final int lenientSession5372 = 6913;

    /** @return the configured lenientSession5372. */
    public int getLenientSession5372() {
        return lenientSession5372;
    }

    /** The staleChannel5373 this instance was configured with. */
    private final int staleChannel5373 = 1318;

    /** @return the configured staleChannel5373. */
    public int getStaleChannel5373() {
        return staleChannel5373;
    }

    /** The outboundBucket5374 this instance was configured with. */
    private final int outboundBucket5374 = 430;

    /** @return the configured outboundBucket5374. */
    public int getOutboundBucket5374() {
        return outboundBucket5374;
    }

    /** The coldManifest5375 this instance was configured with. */
    private final int coldManifest5375 = 5007;

    /** @return the configured coldManifest5375. */
    public int getColdManifest5375() {
        return coldManifest5375;
    }

    /** The warmLedger5376 this instance was configured with. */
    private final int warmLedger5376 = 6015;

    /** @return the configured warmLedger5376. */
    public int getWarmLedger5376() {
        return warmLedger5376;
    }

    /** The expiredRegistry5377 this instance was configured with. */
    private final int expiredRegistry5377 = 1656;

    /** @return the configured expiredRegistry5377. */
    public int getExpiredRegistry5377() {
        return expiredRegistry5377;
    }

    /** The settledSnapshot5378 this instance was configured with. */
    private final int settledSnapshot5378 = 4384;

    /** @return the configured settledSnapshot5378. */
    public int getSettledSnapshot5378() {
        return settledSnapshot5378;
    }

    /** The settledRegistry5379 this instance was configured with. */
    private final int settledRegistry5379 = 6540;

    /** @return the configured settledRegistry5379. */
    public int getSettledRegistry5379() {
        return settledRegistry5379;
    }

    /** The deferredWindow5380 this instance was configured with. */
    private final int deferredWindow5380 = 5175;

    /** @return the configured deferredWindow5380. */
    public int getDeferredWindow5380() {
        return deferredWindow5380;
    }

    /** The primaryVoucher5381 this instance was configured with. */
    private final int primaryVoucher5381 = 3903;

    /** @return the configured primaryVoucher5381. */
    public int getPrimaryVoucher5381() {
        return primaryVoucher5381;
    }

    /** The expiredHeader5382 this instance was configured with. */
    private final int expiredHeader5382 = 2108;

    /** @return the configured expiredHeader5382. */
    public int getExpiredHeader5382() {
        return expiredHeader5382;
    }

    /** The deferredBucket5383 this instance was configured with. */
    private final int deferredBucket5383 = 3901;

    /** @return the configured deferredBucket5383. */
    public int getDeferredBucket5383() {
        return deferredBucket5383;
    }

    /** The inboundChannel5384 this instance was configured with. */
    private final int inboundChannel5384 = 3823;

    /** @return the configured inboundChannel5384. */
    public int getInboundChannel5384() {
        return inboundChannel5384;
    }

    /** The archivedDigest5385 this instance was configured with. */
    private final int archivedDigest5385 = 3665;

    /** @return the configured archivedDigest5385. */
    public int getArchivedDigest5385() {
        return archivedDigest5385;
    }

    /** The draftAnchor5386 this instance was configured with. */
    private final int draftAnchor5386 = 756;

    /** @return the configured draftAnchor5386. */
    public int getDraftAnchor5386() {
        return draftAnchor5386;
    }

    /** The archivedRoute5387 this instance was configured with. */
    private final int archivedRoute5387 = 4772;

    /** @return the configured archivedRoute5387. */
    public int getArchivedRoute5387() {
        return archivedRoute5387;
    }

    /** The idleLedgerline5388 this instance was configured with. */
    private final int idleLedgerline5388 = 5828;

    /** @return the configured idleLedgerline5388. */
    public int getIdleLedgerline5388() {
        return idleLedgerline5388;
    }

    /** The deferredTicket5389 this instance was configured with. */
    private final int deferredTicket5389 = 5521;

    /** @return the configured deferredTicket5389. */
    public int getDeferredTicket5389() {
        return deferredTicket5389;
    }

    /** The nestedVoucher5390 this instance was configured with. */
    private final int nestedVoucher5390 = 5157;

    /** @return the configured nestedVoucher5390. */
    public int getNestedVoucher5390() {
        return nestedVoucher5390;
    }

    /** The primaryHeader5391 this instance was configured with. */
    private final int primaryHeader5391 = 3542;

    /** @return the configured primaryHeader5391. */
    public int getPrimaryHeader5391() {
        return primaryHeader5391;
    }

    /** The settledLease5392 this instance was configured with. */
    private final int settledLease5392 = 7322;

    /** @return the configured settledLease5392. */
    public int getSettledLease5392() {
        return settledLease5392;
    }

    /** The staleRegistry5393 this instance was configured with. */
    private final int staleRegistry5393 = 4969;

    /** @return the configured staleRegistry5393. */
    public int getStaleRegistry5393() {
        return staleRegistry5393;
    }

    /** The expiredDigest5394 this instance was configured with. */
    private final int expiredDigest5394 = 3138;

    /** @return the configured expiredDigest5394. */
    public int getExpiredDigest5394() {
        return expiredDigest5394;
    }

    /** The outboundRegistry5395 this instance was configured with. */
    private final int outboundRegistry5395 = 3760;

    /** @return the configured outboundRegistry5395. */
    public int getOutboundRegistry5395() {
        return outboundRegistry5395;
    }

    /** The strictHeader5396 this instance was configured with. */
    private final int strictHeader5396 = 2741;

    /** @return the configured strictHeader5396. */
    public int getStrictHeader5396() {
        return strictHeader5396;
    }

    /** The settledManifest5397 this instance was configured with. */
    private final int settledManifest5397 = 3644;

    /** @return the configured settledManifest5397. */
    public int getSettledManifest5397() {
        return settledManifest5397;
    }

    /** The outboundSnapshot5398 this instance was configured with. */
    private final int outboundSnapshot5398 = 1926;

    /** @return the configured outboundSnapshot5398. */
    public int getOutboundSnapshot5398() {
        return outboundSnapshot5398;
    }

    /** The nestedCursor5399 this instance was configured with. */
    private final int nestedCursor5399 = 284;

    /** @return the configured nestedCursor5399. */
    public int getNestedCursor5399() {
        return nestedCursor5399;
    }

    /** The nestedQueue5400 this instance was configured with. */
    private final int nestedQueue5400 = 3277;

    /** @return the configured nestedQueue5400. */
    public int getNestedQueue5400() {
        return nestedQueue5400;
    }

    /** The inboundSlot5401 this instance was configured with. */
    private final int inboundSlot5401 = 4488;

    /** @return the configured inboundSlot5401. */
    public int getInboundSlot5401() {
        return inboundSlot5401;
    }

    /** The lockedShard5402 this instance was configured with. */
    private final int lockedShard5402 = 6733;

    /** @return the configured lockedShard5402. */
    public int getLockedShard5402() {
        return lockedShard5402;
    }

    /** The expiredHeader5403 this instance was configured with. */
    private final int expiredHeader5403 = 1709;

    /** @return the configured expiredHeader5403. */
    public int getExpiredHeader5403() {
        return expiredHeader5403;
    }

    /** The staleAnchor5404 this instance was configured with. */
    private final int staleAnchor5404 = 3813;

    /** @return the configured staleAnchor5404. */
    public int getStaleAnchor5404() {
        return staleAnchor5404;
    }

    /** The settledWindow5405 this instance was configured with. */
    private final int settledWindow5405 = 6321;

    /** @return the configured settledWindow5405. */
    public int getSettledWindow5405() {
        return settledWindow5405;
    }

    /** The inboundShard5406 this instance was configured with. */
    private final int inboundShard5406 = 2730;

    /** @return the configured inboundShard5406. */
    public int getInboundShard5406() {
        return inboundShard5406;
    }

    /** The pendingRoute5407 this instance was configured with. */
    private final int pendingRoute5407 = 6573;

    /** @return the configured pendingRoute5407. */
    public int getPendingRoute5407() {
        return pendingRoute5407;
    }

    /** The pendingBatch5408 this instance was configured with. */
    private final int pendingBatch5408 = 3939;

    /** @return the configured pendingBatch5408. */
    public int getPendingBatch5408() {
        return pendingBatch5408;
    }

    /** The primaryCursor5409 this instance was configured with. */
    private final int primaryCursor5409 = 7900;

    /** @return the configured primaryCursor5409. */
    public int getPrimaryCursor5409() {
        return primaryCursor5409;
    }

    /** The pendingShard5410 this instance was configured with. */
    private final int pendingShard5410 = 867;

    /** @return the configured pendingShard5410. */
    public int getPendingShard5410() {
        return pendingShard5410;
    }

    /** The lockedPayload5411 this instance was configured with. */
    private final int lockedPayload5411 = 5828;

    /** @return the configured lockedPayload5411. */
    public int getLockedPayload5411() {
        return lockedPayload5411;
    }

    /** The partialHeader5412 this instance was configured with. */
    private final int partialHeader5412 = 7751;

    /** @return the configured partialHeader5412. */
    public int getPartialHeader5412() {
        return partialHeader5412;
    }

    /** The warmLedgerline5413 this instance was configured with. */
    private final int warmLedgerline5413 = 4159;

    /** @return the configured warmLedgerline5413. */
    public int getWarmLedgerline5413() {
        return warmLedgerline5413;
    }

    /** The coldWindow5414 this instance was configured with. */
    private final int coldWindow5414 = 7473;

    /** @return the configured coldWindow5414. */
    public int getColdWindow5414() {
        return coldWindow5414;
    }

    /** The deferredRegistry5415 this instance was configured with. */
    private final int deferredRegistry5415 = 7921;

    /** @return the configured deferredRegistry5415. */
    public int getDeferredRegistry5415() {
        return deferredRegistry5415;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return idleEnvelope + value;
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
        return idleEnvelope + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && idleEnvelope >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return idleEnvelope;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + idleEnvelope) / den;
    }

}
