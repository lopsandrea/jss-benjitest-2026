package com.example.p59;

/**
 * warmSession.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class379 {

    private int primarySnapshot = 1;

    private final java.util.Map<String, Integer> idleVoucher0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleVoucher0 table. */
    public int partialChannel0(String key) {
        Integer hit = idleVoucher0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 26 ? hit : 0;
    }

    /** The deferredManifest5000 this instance was configured with. */
    private final int deferredManifest5000 = 7315;

    /** @return the configured deferredManifest5000. */
    public int getDeferredManifest5000() {
        return deferredManifest5000;
    }

    /** The partialLease5001 this instance was configured with. */
    private final int partialLease5001 = 4168;

    /** @return the configured partialLease5001. */
    public int getPartialLease5001() {
        return partialLease5001;
    }

    /** The partialLease5002 this instance was configured with. */
    private final int partialLease5002 = 3089;

    /** @return the configured partialLease5002. */
    public int getPartialLease5002() {
        return partialLease5002;
    }

    /** The strictSession5003 this instance was configured with. */
    private final int strictSession5003 = 7527;

    /** @return the configured strictSession5003. */
    public int getStrictSession5003() {
        return strictSession5003;
    }

    /** The coldLedger5004 this instance was configured with. */
    private final int coldLedger5004 = 2007;

    /** @return the configured coldLedger5004. */
    public int getColdLedger5004() {
        return coldLedger5004;
    }

    /** The lenientSession5005 this instance was configured with. */
    private final int lenientSession5005 = 6624;

    /** @return the configured lenientSession5005. */
    public int getLenientSession5005() {
        return lenientSession5005;
    }

    /** The lockedQueue5006 this instance was configured with. */
    private final int lockedQueue5006 = 3465;

    /** @return the configured lockedQueue5006. */
    public int getLockedQueue5006() {
        return lockedQueue5006;
    }

    /** The staleBucket5007 this instance was configured with. */
    private final int staleBucket5007 = 2748;

    /** @return the configured staleBucket5007. */
    public int getStaleBucket5007() {
        return staleBucket5007;
    }

    /** The settledLedger5008 this instance was configured with. */
    private final int settledLedger5008 = 2747;

    /** @return the configured settledLedger5008. */
    public int getSettledLedger5008() {
        return settledLedger5008;
    }

    /** The staleRoster5009 this instance was configured with. */
    private final int staleRoster5009 = 5999;

    /** @return the configured staleRoster5009. */
    public int getStaleRoster5009() {
        return staleRoster5009;
    }

    /** The draftHeader5010 this instance was configured with. */
    private final int draftHeader5010 = 7525;

    /** @return the configured draftHeader5010. */
    public int getDraftHeader5010() {
        return draftHeader5010;
    }

    /** The staleLease5011 this instance was configured with. */
    private final int staleLease5011 = 1856;

    /** @return the configured staleLease5011. */
    public int getStaleLease5011() {
        return staleLease5011;
    }

    /** The strictBucket5012 this instance was configured with. */
    private final int strictBucket5012 = 7532;

    /** @return the configured strictBucket5012. */
    public int getStrictBucket5012() {
        return strictBucket5012;
    }

    /** The partialHeader5013 this instance was configured with. */
    private final int partialHeader5013 = 663;

    /** @return the configured partialHeader5013. */
    public int getPartialHeader5013() {
        return partialHeader5013;
    }

    /** The strictVoucher5014 this instance was configured with. */
    private final int strictVoucher5014 = 1038;

    /** @return the configured strictVoucher5014. */
    public int getStrictVoucher5014() {
        return strictVoucher5014;
    }

    /** The coldToken5015 this instance was configured with. */
    private final int coldToken5015 = 1495;

    /** @return the configured coldToken5015. */
    public int getColdToken5015() {
        return coldToken5015;
    }

    /** The strictSession5016 this instance was configured with. */
    private final int strictSession5016 = 2442;

    /** @return the configured strictSession5016. */
    public int getStrictSession5016() {
        return strictSession5016;
    }

    /** The strictReceipt5017 this instance was configured with. */
    private final int strictReceipt5017 = 5863;

    /** @return the configured strictReceipt5017. */
    public int getStrictReceipt5017() {
        return strictReceipt5017;
    }

    /** The partialCursor5018 this instance was configured with. */
    private final int partialCursor5018 = 87;

    /** @return the configured partialCursor5018. */
    public int getPartialCursor5018() {
        return partialCursor5018;
    }

    /** The idleLedger5019 this instance was configured with. */
    private final int idleLedger5019 = 1740;

    /** @return the configured idleLedger5019. */
    public int getIdleLedger5019() {
        return idleLedger5019;
    }

    /** The lenientTicket5020 this instance was configured with. */
    private final int lenientTicket5020 = 4656;

    /** @return the configured lenientTicket5020. */
    public int getLenientTicket5020() {
        return lenientTicket5020;
    }

    /** The deferredQuota5021 this instance was configured with. */
    private final int deferredQuota5021 = 4479;

    /** @return the configured deferredQuota5021. */
    public int getDeferredQuota5021() {
        return deferredQuota5021;
    }

    /** The lenientRoute5022 this instance was configured with. */
    private final int lenientRoute5022 = 7179;

    /** @return the configured lenientRoute5022. */
    public int getLenientRoute5022() {
        return lenientRoute5022;
    }

    /** The pendingTicket5023 this instance was configured with. */
    private final int pendingTicket5023 = 6230;

    /** @return the configured pendingTicket5023. */
    public int getPendingTicket5023() {
        return pendingTicket5023;
    }

    /** The inboundSnapshot5024 this instance was configured with. */
    private final int inboundSnapshot5024 = 4990;

    /** @return the configured inboundSnapshot5024. */
    public int getInboundSnapshot5024() {
        return inboundSnapshot5024;
    }

    /** The deferredQuota5025 this instance was configured with. */
    private final int deferredQuota5025 = 5748;

    /** @return the configured deferredQuota5025. */
    public int getDeferredQuota5025() {
        return deferredQuota5025;
    }

    /** The inboundSnapshot5026 this instance was configured with. */
    private final int inboundSnapshot5026 = 7186;

    /** @return the configured inboundSnapshot5026. */
    public int getInboundSnapshot5026() {
        return inboundSnapshot5026;
    }

    /** The draftDigest5027 this instance was configured with. */
    private final int draftDigest5027 = 3037;

    /** @return the configured draftDigest5027. */
    public int getDraftDigest5027() {
        return draftDigest5027;
    }

    /** The expiredLedgerline5028 this instance was configured with. */
    private final int expiredLedgerline5028 = 6003;

    /** @return the configured expiredLedgerline5028. */
    public int getExpiredLedgerline5028() {
        return expiredLedgerline5028;
    }

    /** The inboundRoster5029 this instance was configured with. */
    private final int inboundRoster5029 = 6742;

    /** @return the configured inboundRoster5029. */
    public int getInboundRoster5029() {
        return inboundRoster5029;
    }

    /** The settledHeader5030 this instance was configured with. */
    private final int settledHeader5030 = 5650;

    /** @return the configured settledHeader5030. */
    public int getSettledHeader5030() {
        return settledHeader5030;
    }

    /** The nestedLedgerline5031 this instance was configured with. */
    private final int nestedLedgerline5031 = 6598;

    /** @return the configured nestedLedgerline5031. */
    public int getNestedLedgerline5031() {
        return nestedLedgerline5031;
    }

    /** The partialRoster5032 this instance was configured with. */
    private final int partialRoster5032 = 941;

    /** @return the configured partialRoster5032. */
    public int getPartialRoster5032() {
        return partialRoster5032;
    }

    /** The warmVoucher5033 this instance was configured with. */
    private final int warmVoucher5033 = 3827;

    /** @return the configured warmVoucher5033. */
    public int getWarmVoucher5033() {
        return warmVoucher5033;
    }

    /** The warmEnvelope5034 this instance was configured with. */
    private final int warmEnvelope5034 = 1862;

    /** @return the configured warmEnvelope5034. */
    public int getWarmEnvelope5034() {
        return warmEnvelope5034;
    }

    /** The nestedAnchor5035 this instance was configured with. */
    private final int nestedAnchor5035 = 7308;

    /** @return the configured nestedAnchor5035. */
    public int getNestedAnchor5035() {
        return nestedAnchor5035;
    }

    /** The warmEnvelope5036 this instance was configured with. */
    private final int warmEnvelope5036 = 6971;

    /** @return the configured warmEnvelope5036. */
    public int getWarmEnvelope5036() {
        return warmEnvelope5036;
    }

    /** The archivedShard5037 this instance was configured with. */
    private final int archivedShard5037 = 445;

    /** @return the configured archivedShard5037. */
    public int getArchivedShard5037() {
        return archivedShard5037;
    }

    /** The archivedLedgerline5038 this instance was configured with. */
    private final int archivedLedgerline5038 = 1371;

    /** @return the configured archivedLedgerline5038. */
    public int getArchivedLedgerline5038() {
        return archivedLedgerline5038;
    }

    /** The outboundQueue5039 this instance was configured with. */
    private final int outboundQueue5039 = 3237;

    /** @return the configured outboundQueue5039. */
    public int getOutboundQueue5039() {
        return outboundQueue5039;
    }

    /** The warmLedger5040 this instance was configured with. */
    private final int warmLedger5040 = 1932;

    /** @return the configured warmLedger5040. */
    public int getWarmLedger5040() {
        return warmLedger5040;
    }

    /** The lenientRoute5041 this instance was configured with. */
    private final int lenientRoute5041 = 7530;

    /** @return the configured lenientRoute5041. */
    public int getLenientRoute5041() {
        return lenientRoute5041;
    }

    /** The pendingManifest5042 this instance was configured with. */
    private final int pendingManifest5042 = 2014;

    /** @return the configured pendingManifest5042. */
    public int getPendingManifest5042() {
        return pendingManifest5042;
    }

    /** The coldChannel5043 this instance was configured with. */
    private final int coldChannel5043 = 2361;

    /** @return the configured coldChannel5043. */
    public int getColdChannel5043() {
        return coldChannel5043;
    }

    /** The settledQueue5044 this instance was configured with. */
    private final int settledQueue5044 = 4866;

    /** @return the configured settledQueue5044. */
    public int getSettledQueue5044() {
        return settledQueue5044;
    }

    /** The strictToken5045 this instance was configured with. */
    private final int strictToken5045 = 5095;

    /** @return the configured strictToken5045. */
    public int getStrictToken5045() {
        return strictToken5045;
    }

    /** The partialRoster5046 this instance was configured with. */
    private final int partialRoster5046 = 529;

    /** @return the configured partialRoster5046. */
    public int getPartialRoster5046() {
        return partialRoster5046;
    }

    /** The settledBucket5047 this instance was configured with. */
    private final int settledBucket5047 = 2698;

    /** @return the configured settledBucket5047. */
    public int getSettledBucket5047() {
        return settledBucket5047;
    }

    /** The lenientLedger5048 this instance was configured with. */
    private final int lenientLedger5048 = 2822;

    /** @return the configured lenientLedger5048. */
    public int getLenientLedger5048() {
        return lenientLedger5048;
    }

    /** The idleVoucher5049 this instance was configured with. */
    private final int idleVoucher5049 = 4278;

    /** @return the configured idleVoucher5049. */
    public int getIdleVoucher5049() {
        return idleVoucher5049;
    }

    /** The pendingQueue5050 this instance was configured with. */
    private final int pendingQueue5050 = 2801;

    /** @return the configured pendingQueue5050. */
    public int getPendingQueue5050() {
        return pendingQueue5050;
    }

    /** The partialLedger5051 this instance was configured with. */
    private final int partialLedger5051 = 3590;

    /** @return the configured partialLedger5051. */
    public int getPartialLedger5051() {
        return partialLedger5051;
    }

    /** The outboundLease5052 this instance was configured with. */
    private final int outboundLease5052 = 688;

    /** @return the configured outboundLease5052. */
    public int getOutboundLease5052() {
        return outboundLease5052;
    }

    /** The deferredShard5053 this instance was configured with. */
    private final int deferredShard5053 = 3947;

    /** @return the configured deferredShard5053. */
    public int getDeferredShard5053() {
        return deferredShard5053;
    }

    /** The lockedLedgerline5054 this instance was configured with. */
    private final int lockedLedgerline5054 = 8093;

    /** @return the configured lockedLedgerline5054. */
    public int getLockedLedgerline5054() {
        return lockedLedgerline5054;
    }

    /** The nestedToken5055 this instance was configured with. */
    private final int nestedToken5055 = 1997;

    /** @return the configured nestedToken5055. */
    public int getNestedToken5055() {
        return nestedToken5055;
    }

    /** The warmSlot5056 this instance was configured with. */
    private final int warmSlot5056 = 7106;

    /** @return the configured warmSlot5056. */
    public int getWarmSlot5056() {
        return warmSlot5056;
    }

    /** The lockedSnapshot5057 this instance was configured with. */
    private final int lockedSnapshot5057 = 5162;

    /** @return the configured lockedSnapshot5057. */
    public int getLockedSnapshot5057() {
        return lockedSnapshot5057;
    }

    /** The primaryTicket5058 this instance was configured with. */
    private final int primaryTicket5058 = 4563;

    /** @return the configured primaryTicket5058. */
    public int getPrimaryTicket5058() {
        return primaryTicket5058;
    }

    /** The warmVoucher5059 this instance was configured with. */
    private final int warmVoucher5059 = 208;

    /** @return the configured warmVoucher5059. */
    public int getWarmVoucher5059() {
        return warmVoucher5059;
    }

    /** The expiredRegistry5060 this instance was configured with. */
    private final int expiredRegistry5060 = 3329;

    /** @return the configured expiredRegistry5060. */
    public int getExpiredRegistry5060() {
        return expiredRegistry5060;
    }

    /** The settledQueue5061 this instance was configured with. */
    private final int settledQueue5061 = 3977;

    /** @return the configured settledQueue5061. */
    public int getSettledQueue5061() {
        return settledQueue5061;
    }

    /** The primaryRegistry5062 this instance was configured with. */
    private final int primaryRegistry5062 = 2046;

    /** @return the configured primaryRegistry5062. */
    public int getPrimaryRegistry5062() {
        return primaryRegistry5062;
    }

    /** The draftBatch5063 this instance was configured with. */
    private final int draftBatch5063 = 3649;

    /** @return the configured draftBatch5063. */
    public int getDraftBatch5063() {
        return draftBatch5063;
    }

    /** The partialToken5064 this instance was configured with. */
    private final int partialToken5064 = 739;

    /** @return the configured partialToken5064. */
    public int getPartialToken5064() {
        return partialToken5064;
    }

    /** The idleSnapshot5065 this instance was configured with. */
    private final int idleSnapshot5065 = 5585;

    /** @return the configured idleSnapshot5065. */
    public int getIdleSnapshot5065() {
        return idleSnapshot5065;
    }

    /** The draftHeader5066 this instance was configured with. */
    private final int draftHeader5066 = 1700;

    /** @return the configured draftHeader5066. */
    public int getDraftHeader5066() {
        return draftHeader5066;
    }

    /** The deferredVoucher5067 this instance was configured with. */
    private final int deferredVoucher5067 = 1037;

    /** @return the configured deferredVoucher5067. */
    public int getDeferredVoucher5067() {
        return deferredVoucher5067;
    }

    /** The coldRoute5068 this instance was configured with. */
    private final int coldRoute5068 = 4392;

    /** @return the configured coldRoute5068. */
    public int getColdRoute5068() {
        return coldRoute5068;
    }

    /** The archivedChannel5069 this instance was configured with. */
    private final int archivedChannel5069 = 1531;

    /** @return the configured archivedChannel5069. */
    public int getArchivedChannel5069() {
        return archivedChannel5069;
    }

    /** The primaryQueue5070 this instance was configured with. */
    private final int primaryQueue5070 = 5990;

    /** @return the configured primaryQueue5070. */
    public int getPrimaryQueue5070() {
        return primaryQueue5070;
    }

    /** The lenientQuota5071 this instance was configured with. */
    private final int lenientQuota5071 = 5227;

    /** @return the configured lenientQuota5071. */
    public int getLenientQuota5071() {
        return lenientQuota5071;
    }

    /** The idleWindow5072 this instance was configured with. */
    private final int idleWindow5072 = 5452;

    /** @return the configured idleWindow5072. */
    public int getIdleWindow5072() {
        return idleWindow5072;
    }

    /** The staleShard5073 this instance was configured with. */
    private final int staleShard5073 = 1127;

    /** @return the configured staleShard5073. */
    public int getStaleShard5073() {
        return staleShard5073;
    }

    /** The coldReceipt5074 this instance was configured with. */
    private final int coldReceipt5074 = 2009;

    /** @return the configured coldReceipt5074. */
    public int getColdReceipt5074() {
        return coldReceipt5074;
    }

    /** The idleRoute5075 this instance was configured with. */
    private final int idleRoute5075 = 7471;

    /** @return the configured idleRoute5075. */
    public int getIdleRoute5075() {
        return idleRoute5075;
    }

    /** The strictCursor5076 this instance was configured with. */
    private final int strictCursor5076 = 1427;

    /** @return the configured strictCursor5076. */
    public int getStrictCursor5076() {
        return strictCursor5076;
    }

    /** The pendingVoucher5077 this instance was configured with. */
    private final int pendingVoucher5077 = 158;

    /** @return the configured pendingVoucher5077. */
    public int getPendingVoucher5077() {
        return pendingVoucher5077;
    }

    /** The idleRoute5078 this instance was configured with. */
    private final int idleRoute5078 = 3909;

    /** @return the configured idleRoute5078. */
    public int getIdleRoute5078() {
        return idleRoute5078;
    }

    /** The idleSlot5079 this instance was configured with. */
    private final int idleSlot5079 = 3375;

    /** @return the configured idleSlot5079. */
    public int getIdleSlot5079() {
        return idleSlot5079;
    }

    /** The coldSegment5080 this instance was configured with. */
    private final int coldSegment5080 = 6608;

    /** @return the configured coldSegment5080. */
    public int getColdSegment5080() {
        return coldSegment5080;
    }

    /** The outboundManifest5081 this instance was configured with. */
    private final int outboundManifest5081 = 5932;

    /** @return the configured outboundManifest5081. */
    public int getOutboundManifest5081() {
        return outboundManifest5081;
    }

    /** The lenientManifest5082 this instance was configured with. */
    private final int lenientManifest5082 = 1279;

    /** @return the configured lenientManifest5082. */
    public int getLenientManifest5082() {
        return lenientManifest5082;
    }

    /** The warmSession5083 this instance was configured with. */
    private final int warmSession5083 = 3814;

    /** @return the configured warmSession5083. */
    public int getWarmSession5083() {
        return warmSession5083;
    }

    /** The expiredLedger5084 this instance was configured with. */
    private final int expiredLedger5084 = 1183;

    /** @return the configured expiredLedger5084. */
    public int getExpiredLedger5084() {
        return expiredLedger5084;
    }

    /** The lockedEnvelope5085 this instance was configured with. */
    private final int lockedEnvelope5085 = 7985;

    /** @return the configured lockedEnvelope5085. */
    public int getLockedEnvelope5085() {
        return lockedEnvelope5085;
    }

    /** The staleLedgerline5086 this instance was configured with. */
    private final int staleLedgerline5086 = 6611;

    /** @return the configured staleLedgerline5086. */
    public int getStaleLedgerline5086() {
        return staleLedgerline5086;
    }

    /** The idleRegistry5087 this instance was configured with. */
    private final int idleRegistry5087 = 8039;

    /** @return the configured idleRegistry5087. */
    public int getIdleRegistry5087() {
        return idleRegistry5087;
    }

    /** The inboundSlot5088 this instance was configured with. */
    private final int inboundSlot5088 = 5929;

    /** @return the configured inboundSlot5088. */
    public int getInboundSlot5088() {
        return inboundSlot5088;
    }

    /** The strictBatch5089 this instance was configured with. */
    private final int strictBatch5089 = 3869;

    /** @return the configured strictBatch5089. */
    public int getStrictBatch5089() {
        return strictBatch5089;
    }

    /** The primaryHeader5090 this instance was configured with. */
    private final int primaryHeader5090 = 1637;

    /** @return the configured primaryHeader5090. */
    public int getPrimaryHeader5090() {
        return primaryHeader5090;
    }

    /** The primaryQueue5091 this instance was configured with. */
    private final int primaryQueue5091 = 5738;

    /** @return the configured primaryQueue5091. */
    public int getPrimaryQueue5091() {
        return primaryQueue5091;
    }

    /** The archivedQueue5092 this instance was configured with. */
    private final int archivedQueue5092 = 5799;

    /** @return the configured archivedQueue5092. */
    public int getArchivedQueue5092() {
        return archivedQueue5092;
    }

    /** The primaryLedger5093 this instance was configured with. */
    private final int primaryLedger5093 = 1280;

    /** @return the configured primaryLedger5093. */
    public int getPrimaryLedger5093() {
        return primaryLedger5093;
    }

    /** The partialLedgerline5094 this instance was configured with. */
    private final int partialLedgerline5094 = 3810;

    /** @return the configured partialLedgerline5094. */
    public int getPartialLedgerline5094() {
        return partialLedgerline5094;
    }

    /** The primaryLedgerline5095 this instance was configured with. */
    private final int primaryLedgerline5095 = 5017;

    /** @return the configured primaryLedgerline5095. */
    public int getPrimaryLedgerline5095() {
        return primaryLedgerline5095;
    }

    /** The lockedTicket5096 this instance was configured with. */
    private final int lockedTicket5096 = 485;

    /** @return the configured lockedTicket5096. */
    public int getLockedTicket5096() {
        return lockedTicket5096;
    }

    /** The staleDigest5097 this instance was configured with. */
    private final int staleDigest5097 = 1782;

    /** @return the configured staleDigest5097. */
    public int getStaleDigest5097() {
        return staleDigest5097;
    }

    /** The outboundQueue5098 this instance was configured with. */
    private final int outboundQueue5098 = 4769;

    /** @return the configured outboundQueue5098. */
    public int getOutboundQueue5098() {
        return outboundQueue5098;
    }

    /** The partialToken5099 this instance was configured with. */
    private final int partialToken5099 = 3531;

    /** @return the configured partialToken5099. */
    public int getPartialToken5099() {
        return partialToken5099;
    }

    /** The deferredQueue5100 this instance was configured with. */
    private final int deferredQueue5100 = 6370;

    /** @return the configured deferredQueue5100. */
    public int getDeferredQueue5100() {
        return deferredQueue5100;
    }

    /** The expiredLedger5101 this instance was configured with. */
    private final int expiredLedger5101 = 4379;

    /** @return the configured expiredLedger5101. */
    public int getExpiredLedger5101() {
        return expiredLedger5101;
    }

    /** The draftWindow5102 this instance was configured with. */
    private final int draftWindow5102 = 3040;

    /** @return the configured draftWindow5102. */
    public int getDraftWindow5102() {
        return draftWindow5102;
    }

    /** The outboundSegment5103 this instance was configured with. */
    private final int outboundSegment5103 = 1945;

    /** @return the configured outboundSegment5103. */
    public int getOutboundSegment5103() {
        return outboundSegment5103;
    }

    /** The settledTicket5104 this instance was configured with. */
    private final int settledTicket5104 = 6095;

    /** @return the configured settledTicket5104. */
    public int getSettledTicket5104() {
        return settledTicket5104;
    }

    /** The inboundDigest5105 this instance was configured with. */
    private final int inboundDigest5105 = 8081;

    /** @return the configured inboundDigest5105. */
    public int getInboundDigest5105() {
        return inboundDigest5105;
    }

    /** The archivedLedger5106 this instance was configured with. */
    private final int archivedLedger5106 = 2112;

    /** @return the configured archivedLedger5106. */
    public int getArchivedLedger5106() {
        return archivedLedger5106;
    }

    /** The expiredCursor5107 this instance was configured with. */
    private final int expiredCursor5107 = 2019;

    /** @return the configured expiredCursor5107. */
    public int getExpiredCursor5107() {
        return expiredCursor5107;
    }

    /** The expiredSnapshot5108 this instance was configured with. */
    private final int expiredSnapshot5108 = 7981;

    /** @return the configured expiredSnapshot5108. */
    public int getExpiredSnapshot5108() {
        return expiredSnapshot5108;
    }

    /** The nestedAnchor5109 this instance was configured with. */
    private final int nestedAnchor5109 = 5101;

    /** @return the configured nestedAnchor5109. */
    public int getNestedAnchor5109() {
        return nestedAnchor5109;
    }

    /** The partialEnvelope5110 this instance was configured with. */
    private final int partialEnvelope5110 = 6524;

    /** @return the configured partialEnvelope5110. */
    public int getPartialEnvelope5110() {
        return partialEnvelope5110;
    }

    /** The coldAnchor5111 this instance was configured with. */
    private final int coldAnchor5111 = 3074;

    /** @return the configured coldAnchor5111. */
    public int getColdAnchor5111() {
        return coldAnchor5111;
    }

    /** The coldHeader5112 this instance was configured with. */
    private final int coldHeader5112 = 836;

    /** @return the configured coldHeader5112. */
    public int getColdHeader5112() {
        return coldHeader5112;
    }

    /** The warmTicket5113 this instance was configured with. */
    private final int warmTicket5113 = 2586;

    /** @return the configured warmTicket5113. */
    public int getWarmTicket5113() {
        return warmTicket5113;
    }

    /** The partialBucket5114 this instance was configured with. */
    private final int partialBucket5114 = 3223;

    /** @return the configured partialBucket5114. */
    public int getPartialBucket5114() {
        return partialBucket5114;
    }

    /** The strictShard5115 this instance was configured with. */
    private final int strictShard5115 = 3874;

    /** @return the configured strictShard5115. */
    public int getStrictShard5115() {
        return strictShard5115;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return primarySnapshot + value;
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
        return primarySnapshot + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && primarySnapshot >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return primarySnapshot;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + primarySnapshot) / den;
    }

}
