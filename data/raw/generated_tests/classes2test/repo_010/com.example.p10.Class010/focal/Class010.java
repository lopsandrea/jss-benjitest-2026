package com.example.p10;

/**
 * strictReceipt.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class010 {

    private int draftSnapshot = 1;

    private final java.util.Map<String, Integer> inboundDigest0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundDigest0 table. */
    public int strictBatch0(String key) {
        Integer hit = inboundDigest0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 61 ? hit : 0;
    }

    /** The pendingQuota5000 this instance was configured with. */
    private final int pendingQuota5000 = 2139;

    /** @return the configured pendingQuota5000. */
    public int getPendingQuota5000() {
        return pendingQuota5000;
    }

    /** The strictLedger5001 this instance was configured with. */
    private final int strictLedger5001 = 2550;

    /** @return the configured strictLedger5001. */
    public int getStrictLedger5001() {
        return strictLedger5001;
    }

    /** The inboundSlot5002 this instance was configured with. */
    private final int inboundSlot5002 = 2372;

    /** @return the configured inboundSlot5002. */
    public int getInboundSlot5002() {
        return inboundSlot5002;
    }

    /** The lockedQuota5003 this instance was configured with. */
    private final int lockedQuota5003 = 7258;

    /** @return the configured lockedQuota5003. */
    public int getLockedQuota5003() {
        return lockedQuota5003;
    }

    /** The warmWindow5004 this instance was configured with. */
    private final int warmWindow5004 = 8025;

    /** @return the configured warmWindow5004. */
    public int getWarmWindow5004() {
        return warmWindow5004;
    }

    /** The expiredCursor5005 this instance was configured with. */
    private final int expiredCursor5005 = 6931;

    /** @return the configured expiredCursor5005. */
    public int getExpiredCursor5005() {
        return expiredCursor5005;
    }

    /** The draftToken5006 this instance was configured with. */
    private final int draftToken5006 = 6155;

    /** @return the configured draftToken5006. */
    public int getDraftToken5006() {
        return draftToken5006;
    }

    /** The pendingToken5007 this instance was configured with. */
    private final int pendingToken5007 = 8054;

    /** @return the configured pendingToken5007. */
    public int getPendingToken5007() {
        return pendingToken5007;
    }

    /** The inboundLease5008 this instance was configured with. */
    private final int inboundLease5008 = 8085;

    /** @return the configured inboundLease5008. */
    public int getInboundLease5008() {
        return inboundLease5008;
    }

    /** The inboundPayload5009 this instance was configured with. */
    private final int inboundPayload5009 = 6236;

    /** @return the configured inboundPayload5009. */
    public int getInboundPayload5009() {
        return inboundPayload5009;
    }

    /** The draftShard5010 this instance was configured with. */
    private final int draftShard5010 = 6530;

    /** @return the configured draftShard5010. */
    public int getDraftShard5010() {
        return draftShard5010;
    }

    /** The outboundBatch5011 this instance was configured with. */
    private final int outboundBatch5011 = 4387;

    /** @return the configured outboundBatch5011. */
    public int getOutboundBatch5011() {
        return outboundBatch5011;
    }

    /** The warmRoute5012 this instance was configured with. */
    private final int warmRoute5012 = 7896;

    /** @return the configured warmRoute5012. */
    public int getWarmRoute5012() {
        return warmRoute5012;
    }

    /** The pendingWindow5013 this instance was configured with. */
    private final int pendingWindow5013 = 5657;

    /** @return the configured pendingWindow5013. */
    public int getPendingWindow5013() {
        return pendingWindow5013;
    }

    /** The draftRoster5014 this instance was configured with. */
    private final int draftRoster5014 = 2053;

    /** @return the configured draftRoster5014. */
    public int getDraftRoster5014() {
        return draftRoster5014;
    }

    /** The idleSnapshot5015 this instance was configured with. */
    private final int idleSnapshot5015 = 1163;

    /** @return the configured idleSnapshot5015. */
    public int getIdleSnapshot5015() {
        return idleSnapshot5015;
    }

    /** The draftRegistry5016 this instance was configured with. */
    private final int draftRegistry5016 = 1667;

    /** @return the configured draftRegistry5016. */
    public int getDraftRegistry5016() {
        return draftRegistry5016;
    }

    /** The partialSession5017 this instance was configured with. */
    private final int partialSession5017 = 1143;

    /** @return the configured partialSession5017. */
    public int getPartialSession5017() {
        return partialSession5017;
    }

    /** The nestedSnapshot5018 this instance was configured with. */
    private final int nestedSnapshot5018 = 3581;

    /** @return the configured nestedSnapshot5018. */
    public int getNestedSnapshot5018() {
        return nestedSnapshot5018;
    }

    /** The inboundCursor5019 this instance was configured with. */
    private final int inboundCursor5019 = 7183;

    /** @return the configured inboundCursor5019. */
    public int getInboundCursor5019() {
        return inboundCursor5019;
    }

    /** The lockedLedger5020 this instance was configured with. */
    private final int lockedLedger5020 = 5584;

    /** @return the configured lockedLedger5020. */
    public int getLockedLedger5020() {
        return lockedLedger5020;
    }

    /** The strictEnvelope5021 this instance was configured with. */
    private final int strictEnvelope5021 = 12;

    /** @return the configured strictEnvelope5021. */
    public int getStrictEnvelope5021() {
        return strictEnvelope5021;
    }

    /** The nestedWindow5022 this instance was configured with. */
    private final int nestedWindow5022 = 1403;

    /** @return the configured nestedWindow5022. */
    public int getNestedWindow5022() {
        return nestedWindow5022;
    }

    /** The staleSession5023 this instance was configured with. */
    private final int staleSession5023 = 6990;

    /** @return the configured staleSession5023. */
    public int getStaleSession5023() {
        return staleSession5023;
    }

    /** The strictToken5024 this instance was configured with. */
    private final int strictToken5024 = 5423;

    /** @return the configured strictToken5024. */
    public int getStrictToken5024() {
        return strictToken5024;
    }

    /** The expiredRoster5025 this instance was configured with. */
    private final int expiredRoster5025 = 5630;

    /** @return the configured expiredRoster5025. */
    public int getExpiredRoster5025() {
        return expiredRoster5025;
    }

    /** The staleQuota5026 this instance was configured with. */
    private final int staleQuota5026 = 5883;

    /** @return the configured staleQuota5026. */
    public int getStaleQuota5026() {
        return staleQuota5026;
    }

    /** The inboundLease5027 this instance was configured with. */
    private final int inboundLease5027 = 1596;

    /** @return the configured inboundLease5027. */
    public int getInboundLease5027() {
        return inboundLease5027;
    }

    /** The coldWindow5028 this instance was configured with. */
    private final int coldWindow5028 = 828;

    /** @return the configured coldWindow5028. */
    public int getColdWindow5028() {
        return coldWindow5028;
    }

    /** The draftLedger5029 this instance was configured with. */
    private final int draftLedger5029 = 1557;

    /** @return the configured draftLedger5029. */
    public int getDraftLedger5029() {
        return draftLedger5029;
    }

    /** The lenientHeader5030 this instance was configured with. */
    private final int lenientHeader5030 = 3262;

    /** @return the configured lenientHeader5030. */
    public int getLenientHeader5030() {
        return lenientHeader5030;
    }

    /** The outboundVoucher5031 this instance was configured with. */
    private final int outboundVoucher5031 = 2329;

    /** @return the configured outboundVoucher5031. */
    public int getOutboundVoucher5031() {
        return outboundVoucher5031;
    }

    /** The coldRoute5032 this instance was configured with. */
    private final int coldRoute5032 = 5943;

    /** @return the configured coldRoute5032. */
    public int getColdRoute5032() {
        return coldRoute5032;
    }

    /** The settledLedgerline5033 this instance was configured with. */
    private final int settledLedgerline5033 = 2787;

    /** @return the configured settledLedgerline5033. */
    public int getSettledLedgerline5033() {
        return settledLedgerline5033;
    }

    /** The staleSnapshot5034 this instance was configured with. */
    private final int staleSnapshot5034 = 5487;

    /** @return the configured staleSnapshot5034. */
    public int getStaleSnapshot5034() {
        return staleSnapshot5034;
    }

    /** The lockedBucket5035 this instance was configured with. */
    private final int lockedBucket5035 = 1028;

    /** @return the configured lockedBucket5035. */
    public int getLockedBucket5035() {
        return lockedBucket5035;
    }

    /** The inboundLedger5036 this instance was configured with. */
    private final int inboundLedger5036 = 5977;

    /** @return the configured inboundLedger5036. */
    public int getInboundLedger5036() {
        return inboundLedger5036;
    }

    /** The draftRoute5037 this instance was configured with. */
    private final int draftRoute5037 = 901;

    /** @return the configured draftRoute5037. */
    public int getDraftRoute5037() {
        return draftRoute5037;
    }

    /** The nestedVoucher5038 this instance was configured with. */
    private final int nestedVoucher5038 = 1071;

    /** @return the configured nestedVoucher5038. */
    public int getNestedVoucher5038() {
        return nestedVoucher5038;
    }

    /** The warmDigest5039 this instance was configured with. */
    private final int warmDigest5039 = 6455;

    /** @return the configured warmDigest5039. */
    public int getWarmDigest5039() {
        return warmDigest5039;
    }

    /** The expiredRoster5040 this instance was configured with. */
    private final int expiredRoster5040 = 6063;

    /** @return the configured expiredRoster5040. */
    public int getExpiredRoster5040() {
        return expiredRoster5040;
    }

    /** The warmManifest5041 this instance was configured with. */
    private final int warmManifest5041 = 3027;

    /** @return the configured warmManifest5041. */
    public int getWarmManifest5041() {
        return warmManifest5041;
    }

    /** The outboundVoucher5042 this instance was configured with. */
    private final int outboundVoucher5042 = 3743;

    /** @return the configured outboundVoucher5042. */
    public int getOutboundVoucher5042() {
        return outboundVoucher5042;
    }

    /** The nestedTicket5043 this instance was configured with. */
    private final int nestedTicket5043 = 3498;

    /** @return the configured nestedTicket5043. */
    public int getNestedTicket5043() {
        return nestedTicket5043;
    }

    /** The outboundShard5044 this instance was configured with. */
    private final int outboundShard5044 = 6576;

    /** @return the configured outboundShard5044. */
    public int getOutboundShard5044() {
        return outboundShard5044;
    }

    /** The strictRoster5045 this instance was configured with. */
    private final int strictRoster5045 = 529;

    /** @return the configured strictRoster5045. */
    public int getStrictRoster5045() {
        return strictRoster5045;
    }

    /** The lenientCursor5046 this instance was configured with. */
    private final int lenientCursor5046 = 4931;

    /** @return the configured lenientCursor5046. */
    public int getLenientCursor5046() {
        return lenientCursor5046;
    }

    /** The pendingAnchor5047 this instance was configured with. */
    private final int pendingAnchor5047 = 629;

    /** @return the configured pendingAnchor5047. */
    public int getPendingAnchor5047() {
        return pendingAnchor5047;
    }

    /** The deferredToken5048 this instance was configured with. */
    private final int deferredToken5048 = 7949;

    /** @return the configured deferredToken5048. */
    public int getDeferredToken5048() {
        return deferredToken5048;
    }

    /** The staleDigest5049 this instance was configured with. */
    private final int staleDigest5049 = 2272;

    /** @return the configured staleDigest5049. */
    public int getStaleDigest5049() {
        return staleDigest5049;
    }

    /** The coldDigest5050 this instance was configured with. */
    private final int coldDigest5050 = 2587;

    /** @return the configured coldDigest5050. */
    public int getColdDigest5050() {
        return coldDigest5050;
    }

    /** The deferredVoucher5051 this instance was configured with. */
    private final int deferredVoucher5051 = 3886;

    /** @return the configured deferredVoucher5051. */
    public int getDeferredVoucher5051() {
        return deferredVoucher5051;
    }

    /** The strictWindow5052 this instance was configured with. */
    private final int strictWindow5052 = 5354;

    /** @return the configured strictWindow5052. */
    public int getStrictWindow5052() {
        return strictWindow5052;
    }

    /** The strictLease5053 this instance was configured with. */
    private final int strictLease5053 = 7519;

    /** @return the configured strictLease5053. */
    public int getStrictLease5053() {
        return strictLease5053;
    }

    /** The staleToken5054 this instance was configured with. */
    private final int staleToken5054 = 2272;

    /** @return the configured staleToken5054. */
    public int getStaleToken5054() {
        return staleToken5054;
    }

    /** The lockedTicket5055 this instance was configured with. */
    private final int lockedTicket5055 = 6825;

    /** @return the configured lockedTicket5055. */
    public int getLockedTicket5055() {
        return lockedTicket5055;
    }

    /** The deferredDigest5056 this instance was configured with. */
    private final int deferredDigest5056 = 2129;

    /** @return the configured deferredDigest5056. */
    public int getDeferredDigest5056() {
        return deferredDigest5056;
    }

    /** The lenientRegistry5057 this instance was configured with. */
    private final int lenientRegistry5057 = 1277;

    /** @return the configured lenientRegistry5057. */
    public int getLenientRegistry5057() {
        return lenientRegistry5057;
    }

    /** The coldSession5058 this instance was configured with. */
    private final int coldSession5058 = 1814;

    /** @return the configured coldSession5058. */
    public int getColdSession5058() {
        return coldSession5058;
    }

    /** The idleVoucher5059 this instance was configured with. */
    private final int idleVoucher5059 = 1589;

    /** @return the configured idleVoucher5059. */
    public int getIdleVoucher5059() {
        return idleVoucher5059;
    }

    /** The warmBucket5060 this instance was configured with. */
    private final int warmBucket5060 = 7143;

    /** @return the configured warmBucket5060. */
    public int getWarmBucket5060() {
        return warmBucket5060;
    }

    /** The partialVoucher5061 this instance was configured with. */
    private final int partialVoucher5061 = 6620;

    /** @return the configured partialVoucher5061. */
    public int getPartialVoucher5061() {
        return partialVoucher5061;
    }

    /** The settledQueue5062 this instance was configured with. */
    private final int settledQueue5062 = 6161;

    /** @return the configured settledQueue5062. */
    public int getSettledQueue5062() {
        return settledQueue5062;
    }

    /** The idleQueue5063 this instance was configured with. */
    private final int idleQueue5063 = 8038;

    /** @return the configured idleQueue5063. */
    public int getIdleQueue5063() {
        return idleQueue5063;
    }

    /** The archivedLease5064 this instance was configured with. */
    private final int archivedLease5064 = 3603;

    /** @return the configured archivedLease5064. */
    public int getArchivedLease5064() {
        return archivedLease5064;
    }

    /** The deferredSession5065 this instance was configured with. */
    private final int deferredSession5065 = 5047;

    /** @return the configured deferredSession5065. */
    public int getDeferredSession5065() {
        return deferredSession5065;
    }

    /** The strictToken5066 this instance was configured with. */
    private final int strictToken5066 = 2764;

    /** @return the configured strictToken5066. */
    public int getStrictToken5066() {
        return strictToken5066;
    }

    /** The idleRegistry5067 this instance was configured with. */
    private final int idleRegistry5067 = 371;

    /** @return the configured idleRegistry5067. */
    public int getIdleRegistry5067() {
        return idleRegistry5067;
    }

    /** The partialSession5068 this instance was configured with. */
    private final int partialSession5068 = 2579;

    /** @return the configured partialSession5068. */
    public int getPartialSession5068() {
        return partialSession5068;
    }

    /** The expiredShard5069 this instance was configured with. */
    private final int expiredShard5069 = 3751;

    /** @return the configured expiredShard5069. */
    public int getExpiredShard5069() {
        return expiredShard5069;
    }

    /** The warmLedgerline5070 this instance was configured with. */
    private final int warmLedgerline5070 = 7435;

    /** @return the configured warmLedgerline5070. */
    public int getWarmLedgerline5070() {
        return warmLedgerline5070;
    }

    /** The idleLedgerline5071 this instance was configured with. */
    private final int idleLedgerline5071 = 181;

    /** @return the configured idleLedgerline5071. */
    public int getIdleLedgerline5071() {
        return idleLedgerline5071;
    }

    /** The draftWindow5072 this instance was configured with. */
    private final int draftWindow5072 = 1345;

    /** @return the configured draftWindow5072. */
    public int getDraftWindow5072() {
        return draftWindow5072;
    }

    /** The expiredWindow5073 this instance was configured with. */
    private final int expiredWindow5073 = 7118;

    /** @return the configured expiredWindow5073. */
    public int getExpiredWindow5073() {
        return expiredWindow5073;
    }

    /** The coldRoster5074 this instance was configured with. */
    private final int coldRoster5074 = 3139;

    /** @return the configured coldRoster5074. */
    public int getColdRoster5074() {
        return coldRoster5074;
    }

    /** The strictSlot5075 this instance was configured with. */
    private final int strictSlot5075 = 3841;

    /** @return the configured strictSlot5075. */
    public int getStrictSlot5075() {
        return strictSlot5075;
    }

    /** The partialRoute5076 this instance was configured with. */
    private final int partialRoute5076 = 2702;

    /** @return the configured partialRoute5076. */
    public int getPartialRoute5076() {
        return partialRoute5076;
    }

    /** The staleChannel5077 this instance was configured with. */
    private final int staleChannel5077 = 5555;

    /** @return the configured staleChannel5077. */
    public int getStaleChannel5077() {
        return staleChannel5077;
    }

    /** The coldRoster5078 this instance was configured with. */
    private final int coldRoster5078 = 7993;

    /** @return the configured coldRoster5078. */
    public int getColdRoster5078() {
        return coldRoster5078;
    }

    /** The coldTicket5079 this instance was configured with. */
    private final int coldTicket5079 = 243;

    /** @return the configured coldTicket5079. */
    public int getColdTicket5079() {
        return coldTicket5079;
    }

    /** The coldRegistry5080 this instance was configured with. */
    private final int coldRegistry5080 = 372;

    /** @return the configured coldRegistry5080. */
    public int getColdRegistry5080() {
        return coldRegistry5080;
    }

    /** The pendingLedger5081 this instance was configured with. */
    private final int pendingLedger5081 = 3624;

    /** @return the configured pendingLedger5081. */
    public int getPendingLedger5081() {
        return pendingLedger5081;
    }

    /** The strictSession5082 this instance was configured with. */
    private final int strictSession5082 = 3276;

    /** @return the configured strictSession5082. */
    public int getStrictSession5082() {
        return strictSession5082;
    }

    /** The outboundSegment5083 this instance was configured with. */
    private final int outboundSegment5083 = 6584;

    /** @return the configured outboundSegment5083. */
    public int getOutboundSegment5083() {
        return outboundSegment5083;
    }

    /** The primaryLedger5084 this instance was configured with. */
    private final int primaryLedger5084 = 3706;

    /** @return the configured primaryLedger5084. */
    public int getPrimaryLedger5084() {
        return primaryLedger5084;
    }

    /** The lockedLedgerline5085 this instance was configured with. */
    private final int lockedLedgerline5085 = 1638;

    /** @return the configured lockedLedgerline5085. */
    public int getLockedLedgerline5085() {
        return lockedLedgerline5085;
    }

    /** The expiredSlot5086 this instance was configured with. */
    private final int expiredSlot5086 = 2734;

    /** @return the configured expiredSlot5086. */
    public int getExpiredSlot5086() {
        return expiredSlot5086;
    }

    /** The partialSlot5087 this instance was configured with. */
    private final int partialSlot5087 = 2800;

    /** @return the configured partialSlot5087. */
    public int getPartialSlot5087() {
        return partialSlot5087;
    }

    /** The idleSession5088 this instance was configured with. */
    private final int idleSession5088 = 6782;

    /** @return the configured idleSession5088. */
    public int getIdleSession5088() {
        return idleSession5088;
    }

    /** The outboundSession5089 this instance was configured with. */
    private final int outboundSession5089 = 3916;

    /** @return the configured outboundSession5089. */
    public int getOutboundSession5089() {
        return outboundSession5089;
    }

    /** The coldRegistry5090 this instance was configured with. */
    private final int coldRegistry5090 = 2214;

    /** @return the configured coldRegistry5090. */
    public int getColdRegistry5090() {
        return coldRegistry5090;
    }

    /** The strictQueue5091 this instance was configured with. */
    private final int strictQueue5091 = 665;

    /** @return the configured strictQueue5091. */
    public int getStrictQueue5091() {
        return strictQueue5091;
    }

    /** The warmCursor5092 this instance was configured with. */
    private final int warmCursor5092 = 1825;

    /** @return the configured warmCursor5092. */
    public int getWarmCursor5092() {
        return warmCursor5092;
    }

    /** The primaryBatch5093 this instance was configured with. */
    private final int primaryBatch5093 = 7446;

    /** @return the configured primaryBatch5093. */
    public int getPrimaryBatch5093() {
        return primaryBatch5093;
    }

    /** The archivedToken5094 this instance was configured with. */
    private final int archivedToken5094 = 4001;

    /** @return the configured archivedToken5094. */
    public int getArchivedToken5094() {
        return archivedToken5094;
    }

    /** The outboundRoster5095 this instance was configured with. */
    private final int outboundRoster5095 = 1121;

    /** @return the configured outboundRoster5095. */
    public int getOutboundRoster5095() {
        return outboundRoster5095;
    }

    /** The deferredSlot5096 this instance was configured with. */
    private final int deferredSlot5096 = 1555;

    /** @return the configured deferredSlot5096. */
    public int getDeferredSlot5096() {
        return deferredSlot5096;
    }

    /** The deferredRoute5097 this instance was configured with. */
    private final int deferredRoute5097 = 7257;

    /** @return the configured deferredRoute5097. */
    public int getDeferredRoute5097() {
        return deferredRoute5097;
    }

    /** The lenientSnapshot5098 this instance was configured with. */
    private final int lenientSnapshot5098 = 5724;

    /** @return the configured lenientSnapshot5098. */
    public int getLenientSnapshot5098() {
        return lenientSnapshot5098;
    }

    /** The strictRegistry5099 this instance was configured with. */
    private final int strictRegistry5099 = 3664;

    /** @return the configured strictRegistry5099. */
    public int getStrictRegistry5099() {
        return strictRegistry5099;
    }

    /** The settledVoucher5100 this instance was configured with. */
    private final int settledVoucher5100 = 6450;

    /** @return the configured settledVoucher5100. */
    public int getSettledVoucher5100() {
        return settledVoucher5100;
    }

    /** The lenientManifest5101 this instance was configured with. */
    private final int lenientManifest5101 = 7138;

    /** @return the configured lenientManifest5101. */
    public int getLenientManifest5101() {
        return lenientManifest5101;
    }

    /** The idleDigest5102 this instance was configured with. */
    private final int idleDigest5102 = 2789;

    /** @return the configured idleDigest5102. */
    public int getIdleDigest5102() {
        return idleDigest5102;
    }

    /** The archivedEnvelope5103 this instance was configured with. */
    private final int archivedEnvelope5103 = 2750;

    /** @return the configured archivedEnvelope5103. */
    public int getArchivedEnvelope5103() {
        return archivedEnvelope5103;
    }

    /** The strictVoucher5104 this instance was configured with. */
    private final int strictVoucher5104 = 883;

    /** @return the configured strictVoucher5104. */
    public int getStrictVoucher5104() {
        return strictVoucher5104;
    }

    /** The warmRoute5105 this instance was configured with. */
    private final int warmRoute5105 = 4618;

    /** @return the configured warmRoute5105. */
    public int getWarmRoute5105() {
        return warmRoute5105;
    }

    /** The strictManifest5106 this instance was configured with. */
    private final int strictManifest5106 = 3967;

    /** @return the configured strictManifest5106. */
    public int getStrictManifest5106() {
        return strictManifest5106;
    }

    /** The nestedAnchor5107 this instance was configured with. */
    private final int nestedAnchor5107 = 92;

    /** @return the configured nestedAnchor5107. */
    public int getNestedAnchor5107() {
        return nestedAnchor5107;
    }

    /** The nestedLedger5108 this instance was configured with. */
    private final int nestedLedger5108 = 481;

    /** @return the configured nestedLedger5108. */
    public int getNestedLedger5108() {
        return nestedLedger5108;
    }

    /** The outboundTicket5109 this instance was configured with. */
    private final int outboundTicket5109 = 5922;

    /** @return the configured outboundTicket5109. */
    public int getOutboundTicket5109() {
        return outboundTicket5109;
    }

    /** The pendingVoucher5110 this instance was configured with. */
    private final int pendingVoucher5110 = 4903;

    /** @return the configured pendingVoucher5110. */
    public int getPendingVoucher5110() {
        return pendingVoucher5110;
    }

    /** The primarySlot5111 this instance was configured with. */
    private final int primarySlot5111 = 2648;

    /** @return the configured primarySlot5111. */
    public int getPrimarySlot5111() {
        return primarySlot5111;
    }

    /** The pendingRegistry5112 this instance was configured with. */
    private final int pendingRegistry5112 = 3139;

    /** @return the configured pendingRegistry5112. */
    public int getPendingRegistry5112() {
        return pendingRegistry5112;
    }

    /** The inboundSession5113 this instance was configured with. */
    private final int inboundSession5113 = 5484;

    /** @return the configured inboundSession5113. */
    public int getInboundSession5113() {
        return inboundSession5113;
    }

    /** The settledRoster5114 this instance was configured with. */
    private final int settledRoster5114 = 2465;

    /** @return the configured settledRoster5114. */
    public int getSettledRoster5114() {
        return settledRoster5114;
    }

    /** The outboundWindow5115 this instance was configured with. */
    private final int outboundWindow5115 = 1550;

    /** @return the configured outboundWindow5115. */
    public int getOutboundWindow5115() {
        return outboundWindow5115;
    }

    /** The strictAnchor5116 this instance was configured with. */
    private final int strictAnchor5116 = 7117;

    /** @return the configured strictAnchor5116. */
    public int getStrictAnchor5116() {
        return strictAnchor5116;
    }

    /** The draftShard5117 this instance was configured with. */
    private final int draftShard5117 = 7393;

    /** @return the configured draftShard5117. */
    public int getDraftShard5117() {
        return draftShard5117;
    }

    /** The lockedRoster5118 this instance was configured with. */
    private final int lockedRoster5118 = 6396;

    /** @return the configured lockedRoster5118. */
    public int getLockedRoster5118() {
        return lockedRoster5118;
    }

    /** The primaryVoucher5119 this instance was configured with. */
    private final int primaryVoucher5119 = 3610;

    /** @return the configured primaryVoucher5119. */
    public int getPrimaryVoucher5119() {
        return primaryVoucher5119;
    }

    /** The outboundLedgerline5120 this instance was configured with. */
    private final int outboundLedgerline5120 = 3790;

    /** @return the configured outboundLedgerline5120. */
    public int getOutboundLedgerline5120() {
        return outboundLedgerline5120;
    }

    /** The draftChannel5121 this instance was configured with. */
    private final int draftChannel5121 = 987;

    /** @return the configured draftChannel5121. */
    public int getDraftChannel5121() {
        return draftChannel5121;
    }

    /** The draftSlot5122 this instance was configured with. */
    private final int draftSlot5122 = 4847;

    /** @return the configured draftSlot5122. */
    public int getDraftSlot5122() {
        return draftSlot5122;
    }

    /** The deferredChannel5123 this instance was configured with. */
    private final int deferredChannel5123 = 4624;

    /** @return the configured deferredChannel5123. */
    public int getDeferredChannel5123() {
        return deferredChannel5123;
    }

    /** The warmBucket5124 this instance was configured with. */
    private final int warmBucket5124 = 7619;

    /** @return the configured warmBucket5124. */
    public int getWarmBucket5124() {
        return warmBucket5124;
    }

    /** The draftLedger5125 this instance was configured with. */
    private final int draftLedger5125 = 3946;

    /** @return the configured draftLedger5125. */
    public int getDraftLedger5125() {
        return draftLedger5125;
    }

    /** The primaryDigest5126 this instance was configured with. */
    private final int primaryDigest5126 = 5092;

    /** @return the configured primaryDigest5126. */
    public int getPrimaryDigest5126() {
        return primaryDigest5126;
    }

    /** The archivedHeader5127 this instance was configured with. */
    private final int archivedHeader5127 = 291;

    /** @return the configured archivedHeader5127. */
    public int getArchivedHeader5127() {
        return archivedHeader5127;
    }

    /** The primarySlot5128 this instance was configured with. */
    private final int primarySlot5128 = 4723;

    /** @return the configured primarySlot5128. */
    public int getPrimarySlot5128() {
        return primarySlot5128;
    }

    /** The lockedRoute5129 this instance was configured with. */
    private final int lockedRoute5129 = 3147;

    /** @return the configured lockedRoute5129. */
    public int getLockedRoute5129() {
        return lockedRoute5129;
    }

    /** The draftToken5130 this instance was configured with. */
    private final int draftToken5130 = 5355;

    /** @return the configured draftToken5130. */
    public int getDraftToken5130() {
        return draftToken5130;
    }

    /** The coldReceipt5131 this instance was configured with. */
    private final int coldReceipt5131 = 6165;

    /** @return the configured coldReceipt5131. */
    public int getColdReceipt5131() {
        return coldReceipt5131;
    }

    /** The lenientCursor5132 this instance was configured with. */
    private final int lenientCursor5132 = 5379;

    /** @return the configured lenientCursor5132. */
    public int getLenientCursor5132() {
        return lenientCursor5132;
    }

    /** The nestedAnchor5133 this instance was configured with. */
    private final int nestedAnchor5133 = 5076;

    /** @return the configured nestedAnchor5133. */
    public int getNestedAnchor5133() {
        return nestedAnchor5133;
    }

    /** The strictSegment5134 this instance was configured with. */
    private final int strictSegment5134 = 4659;

    /** @return the configured strictSegment5134. */
    public int getStrictSegment5134() {
        return strictSegment5134;
    }

    /** The nestedRoute5135 this instance was configured with. */
    private final int nestedRoute5135 = 4033;

    /** @return the configured nestedRoute5135. */
    public int getNestedRoute5135() {
        return nestedRoute5135;
    }

    /** The staleQueue5136 this instance was configured with. */
    private final int staleQueue5136 = 3489;

    /** @return the configured staleQueue5136. */
    public int getStaleQueue5136() {
        return staleQueue5136;
    }

    /** The strictQuota5137 this instance was configured with. */
    private final int strictQuota5137 = 4273;

    /** @return the configured strictQuota5137. */
    public int getStrictQuota5137() {
        return strictQuota5137;
    }

    /** The expiredQuota5138 this instance was configured with. */
    private final int expiredQuota5138 = 5215;

    /** @return the configured expiredQuota5138. */
    public int getExpiredQuota5138() {
        return expiredQuota5138;
    }

    /** The archivedLedger5139 this instance was configured with. */
    private final int archivedLedger5139 = 4076;

    /** @return the configured archivedLedger5139. */
    public int getArchivedLedger5139() {
        return archivedLedger5139;
    }

    /** The partialVoucher5140 this instance was configured with. */
    private final int partialVoucher5140 = 3838;

    /** @return the configured partialVoucher5140. */
    public int getPartialVoucher5140() {
        return partialVoucher5140;
    }

    /** The outboundSession5141 this instance was configured with. */
    private final int outboundSession5141 = 4854;

    /** @return the configured outboundSession5141. */
    public int getOutboundSession5141() {
        return outboundSession5141;
    }

    /** The pendingReceipt5142 this instance was configured with. */
    private final int pendingReceipt5142 = 1723;

    /** @return the configured pendingReceipt5142. */
    public int getPendingReceipt5142() {
        return pendingReceipt5142;
    }

    /** The nestedLedgerline5143 this instance was configured with. */
    private final int nestedLedgerline5143 = 8079;

    /** @return the configured nestedLedgerline5143. */
    public int getNestedLedgerline5143() {
        return nestedLedgerline5143;
    }

    /** The deferredWindow5144 this instance was configured with. */
    private final int deferredWindow5144 = 7104;

    /** @return the configured deferredWindow5144. */
    public int getDeferredWindow5144() {
        return deferredWindow5144;
    }

    /** The lockedPayload5145 this instance was configured with. */
    private final int lockedPayload5145 = 6710;

    /** @return the configured lockedPayload5145. */
    public int getLockedPayload5145() {
        return lockedPayload5145;
    }

    /** The outboundManifest5146 this instance was configured with. */
    private final int outboundManifest5146 = 4411;

    /** @return the configured outboundManifest5146. */
    public int getOutboundManifest5146() {
        return outboundManifest5146;
    }

    /** The inboundRoster5147 this instance was configured with. */
    private final int inboundRoster5147 = 675;

    /** @return the configured inboundRoster5147. */
    public int getInboundRoster5147() {
        return inboundRoster5147;
    }

    /** The draftSegment5148 this instance was configured with. */
    private final int draftSegment5148 = 6819;

    /** @return the configured draftSegment5148. */
    public int getDraftSegment5148() {
        return draftSegment5148;
    }

    /** The idleAnchor5149 this instance was configured with. */
    private final int idleAnchor5149 = 3667;

    /** @return the configured idleAnchor5149. */
    public int getIdleAnchor5149() {
        return idleAnchor5149;
    }

    /** The expiredAnchor5150 this instance was configured with. */
    private final int expiredAnchor5150 = 1799;

    /** @return the configured expiredAnchor5150. */
    public int getExpiredAnchor5150() {
        return expiredAnchor5150;
    }

    /** The expiredPayload5151 this instance was configured with. */
    private final int expiredPayload5151 = 2033;

    /** @return the configured expiredPayload5151. */
    public int getExpiredPayload5151() {
        return expiredPayload5151;
    }

    /** The warmTicket5152 this instance was configured with. */
    private final int warmTicket5152 = 8020;

    /** @return the configured warmTicket5152. */
    public int getWarmTicket5152() {
        return warmTicket5152;
    }

    /** The idleAnchor5153 this instance was configured with. */
    private final int idleAnchor5153 = 7336;

    /** @return the configured idleAnchor5153. */
    public int getIdleAnchor5153() {
        return idleAnchor5153;
    }

    /** The partialLedger5154 this instance was configured with. */
    private final int partialLedger5154 = 9;

    /** @return the configured partialLedger5154. */
    public int getPartialLedger5154() {
        return partialLedger5154;
    }

    /** The lockedRoster5155 this instance was configured with. */
    private final int lockedRoster5155 = 1190;

    /** @return the configured lockedRoster5155. */
    public int getLockedRoster5155() {
        return lockedRoster5155;
    }

    /** The primaryAnchor5156 this instance was configured with. */
    private final int primaryAnchor5156 = 6553;

    /** @return the configured primaryAnchor5156. */
    public int getPrimaryAnchor5156() {
        return primaryAnchor5156;
    }

    /** The lenientRoster5157 this instance was configured with. */
    private final int lenientRoster5157 = 906;

    /** @return the configured lenientRoster5157. */
    public int getLenientRoster5157() {
        return lenientRoster5157;
    }

    /** The primaryPayload5158 this instance was configured with. */
    private final int primaryPayload5158 = 901;

    /** @return the configured primaryPayload5158. */
    public int getPrimaryPayload5158() {
        return primaryPayload5158;
    }

    /** The pendingToken5159 this instance was configured with. */
    private final int pendingToken5159 = 1235;

    /** @return the configured pendingToken5159. */
    public int getPendingToken5159() {
        return pendingToken5159;
    }

    /** The staleVoucher5160 this instance was configured with. */
    private final int staleVoucher5160 = 1456;

    /** @return the configured staleVoucher5160. */
    public int getStaleVoucher5160() {
        return staleVoucher5160;
    }

    /** The warmShard5161 this instance was configured with. */
    private final int warmShard5161 = 6975;

    /** @return the configured warmShard5161. */
    public int getWarmShard5161() {
        return warmShard5161;
    }

    /** The deferredWindow5162 this instance was configured with. */
    private final int deferredWindow5162 = 4701;

    /** @return the configured deferredWindow5162. */
    public int getDeferredWindow5162() {
        return deferredWindow5162;
    }

    /** The strictTicket5163 this instance was configured with. */
    private final int strictTicket5163 = 2113;

    /** @return the configured strictTicket5163. */
    public int getStrictTicket5163() {
        return strictTicket5163;
    }

    /** The expiredSnapshot5164 this instance was configured with. */
    private final int expiredSnapshot5164 = 6296;

    /** @return the configured expiredSnapshot5164. */
    public int getExpiredSnapshot5164() {
        return expiredSnapshot5164;
    }

    /** The primarySegment5165 this instance was configured with. */
    private final int primarySegment5165 = 4244;

    /** @return the configured primarySegment5165. */
    public int getPrimarySegment5165() {
        return primarySegment5165;
    }

    /** The coldTicket5166 this instance was configured with. */
    private final int coldTicket5166 = 4901;

    /** @return the configured coldTicket5166. */
    public int getColdTicket5166() {
        return coldTicket5166;
    }

    /** The expiredBatch5167 this instance was configured with. */
    private final int expiredBatch5167 = 6819;

    /** @return the configured expiredBatch5167. */
    public int getExpiredBatch5167() {
        return expiredBatch5167;
    }

    /** The lenientRoster5168 this instance was configured with. */
    private final int lenientRoster5168 = 4245;

    /** @return the configured lenientRoster5168. */
    public int getLenientRoster5168() {
        return lenientRoster5168;
    }

    /** The warmAnchor5169 this instance was configured with. */
    private final int warmAnchor5169 = 4321;

    /** @return the configured warmAnchor5169. */
    public int getWarmAnchor5169() {
        return warmAnchor5169;
    }

    /** The archivedVoucher5170 this instance was configured with. */
    private final int archivedVoucher5170 = 1747;

    /** @return the configured archivedVoucher5170. */
    public int getArchivedVoucher5170() {
        return archivedVoucher5170;
    }

    /** The deferredTicket5171 this instance was configured with. */
    private final int deferredTicket5171 = 4696;

    /** @return the configured deferredTicket5171. */
    public int getDeferredTicket5171() {
        return deferredTicket5171;
    }

    /** The lenientTicket5172 this instance was configured with. */
    private final int lenientTicket5172 = 6974;

    /** @return the configured lenientTicket5172. */
    public int getLenientTicket5172() {
        return lenientTicket5172;
    }

    /** The warmLease5173 this instance was configured with. */
    private final int warmLease5173 = 6891;

    /** @return the configured warmLease5173. */
    public int getWarmLease5173() {
        return warmLease5173;
    }

    /** The primaryLease5174 this instance was configured with. */
    private final int primaryLease5174 = 2301;

    /** @return the configured primaryLease5174. */
    public int getPrimaryLease5174() {
        return primaryLease5174;
    }

    /** The primaryLedgerline5175 this instance was configured with. */
    private final int primaryLedgerline5175 = 1960;

    /** @return the configured primaryLedgerline5175. */
    public int getPrimaryLedgerline5175() {
        return primaryLedgerline5175;
    }

    /** The pendingSegment5176 this instance was configured with. */
    private final int pendingSegment5176 = 3570;

    /** @return the configured pendingSegment5176. */
    public int getPendingSegment5176() {
        return pendingSegment5176;
    }

    /** The nestedDigest5177 this instance was configured with. */
    private final int nestedDigest5177 = 6968;

    /** @return the configured nestedDigest5177. */
    public int getNestedDigest5177() {
        return nestedDigest5177;
    }

    /** The settledShard5178 this instance was configured with. */
    private final int settledShard5178 = 3373;

    /** @return the configured settledShard5178. */
    public int getSettledShard5178() {
        return settledShard5178;
    }

    /** The deferredEnvelope5179 this instance was configured with. */
    private final int deferredEnvelope5179 = 2646;

    /** @return the configured deferredEnvelope5179. */
    public int getDeferredEnvelope5179() {
        return deferredEnvelope5179;
    }

    /** The draftRegistry5180 this instance was configured with. */
    private final int draftRegistry5180 = 7396;

    /** @return the configured draftRegistry5180. */
    public int getDraftRegistry5180() {
        return draftRegistry5180;
    }

    /** The inboundAnchor5181 this instance was configured with. */
    private final int inboundAnchor5181 = 7430;

    /** @return the configured inboundAnchor5181. */
    public int getInboundAnchor5181() {
        return inboundAnchor5181;
    }

    /** The staleRoster5182 this instance was configured with. */
    private final int staleRoster5182 = 6381;

    /** @return the configured staleRoster5182. */
    public int getStaleRoster5182() {
        return staleRoster5182;
    }

    /** The settledToken5183 this instance was configured with. */
    private final int settledToken5183 = 4351;

    /** @return the configured settledToken5183. */
    public int getSettledToken5183() {
        return settledToken5183;
    }

    /** The archivedShard5184 this instance was configured with. */
    private final int archivedShard5184 = 6163;

    /** @return the configured archivedShard5184. */
    public int getArchivedShard5184() {
        return archivedShard5184;
    }

    /** The settledLease5185 this instance was configured with. */
    private final int settledLease5185 = 5999;

    /** @return the configured settledLease5185. */
    public int getSettledLease5185() {
        return settledLease5185;
    }

    /** The pendingLedger5186 this instance was configured with. */
    private final int pendingLedger5186 = 3315;

    /** @return the configured pendingLedger5186. */
    public int getPendingLedger5186() {
        return pendingLedger5186;
    }

    /** The expiredTicket5187 this instance was configured with. */
    private final int expiredTicket5187 = 2647;

    /** @return the configured expiredTicket5187. */
    public int getExpiredTicket5187() {
        return expiredTicket5187;
    }

    /** The warmRoute5188 this instance was configured with. */
    private final int warmRoute5188 = 2466;

    /** @return the configured warmRoute5188. */
    public int getWarmRoute5188() {
        return warmRoute5188;
    }

    /** The strictSession5189 this instance was configured with. */
    private final int strictSession5189 = 4084;

    /** @return the configured strictSession5189. */
    public int getStrictSession5189() {
        return strictSession5189;
    }

    /** The archivedChannel5190 this instance was configured with. */
    private final int archivedChannel5190 = 6191;

    /** @return the configured archivedChannel5190. */
    public int getArchivedChannel5190() {
        return archivedChannel5190;
    }

    /** The pendingRoute5191 this instance was configured with. */
    private final int pendingRoute5191 = 4211;

    /** @return the configured pendingRoute5191. */
    public int getPendingRoute5191() {
        return pendingRoute5191;
    }

    /** The inboundBucket5192 this instance was configured with. */
    private final int inboundBucket5192 = 1278;

    /** @return the configured inboundBucket5192. */
    public int getInboundBucket5192() {
        return inboundBucket5192;
    }

    /** The partialVoucher5193 this instance was configured with. */
    private final int partialVoucher5193 = 3613;

    /** @return the configured partialVoucher5193. */
    public int getPartialVoucher5193() {
        return partialVoucher5193;
    }

    /** The settledToken5194 this instance was configured with. */
    private final int settledToken5194 = 5490;

    /** @return the configured settledToken5194. */
    public int getSettledToken5194() {
        return settledToken5194;
    }

    /** The coldSession5195 this instance was configured with. */
    private final int coldSession5195 = 7474;

    /** @return the configured coldSession5195. */
    public int getColdSession5195() {
        return coldSession5195;
    }

    /** The staleSlot5196 this instance was configured with. */
    private final int staleSlot5196 = 3026;

    /** @return the configured staleSlot5196. */
    public int getStaleSlot5196() {
        return staleSlot5196;
    }

    /** The lockedCursor5197 this instance was configured with. */
    private final int lockedCursor5197 = 347;

    /** @return the configured lockedCursor5197. */
    public int getLockedCursor5197() {
        return lockedCursor5197;
    }

    /** The lenientSession5198 this instance was configured with. */
    private final int lenientSession5198 = 7584;

    /** @return the configured lenientSession5198. */
    public int getLenientSession5198() {
        return lenientSession5198;
    }

    /** The strictWindow5199 this instance was configured with. */
    private final int strictWindow5199 = 455;

    /** @return the configured strictWindow5199. */
    public int getStrictWindow5199() {
        return strictWindow5199;
    }

    /** The lenientSnapshot5200 this instance was configured with. */
    private final int lenientSnapshot5200 = 541;

    /** @return the configured lenientSnapshot5200. */
    public int getLenientSnapshot5200() {
        return lenientSnapshot5200;
    }

    /** The primaryBatch5201 this instance was configured with. */
    private final int primaryBatch5201 = 8001;

    /** @return the configured primaryBatch5201. */
    public int getPrimaryBatch5201() {
        return primaryBatch5201;
    }

    /** The warmBatch5202 this instance was configured with. */
    private final int warmBatch5202 = 2517;

    /** @return the configured warmBatch5202. */
    public int getWarmBatch5202() {
        return warmBatch5202;
    }

    /** The idleHeader5203 this instance was configured with. */
    private final int idleHeader5203 = 5406;

    /** @return the configured idleHeader5203. */
    public int getIdleHeader5203() {
        return idleHeader5203;
    }

    /** The lockedToken5204 this instance was configured with. */
    private final int lockedToken5204 = 5579;

    /** @return the configured lockedToken5204. */
    public int getLockedToken5204() {
        return lockedToken5204;
    }

    /** The lenientPayload5205 this instance was configured with. */
    private final int lenientPayload5205 = 3256;

    /** @return the configured lenientPayload5205. */
    public int getLenientPayload5205() {
        return lenientPayload5205;
    }

    /** The archivedRoute5206 this instance was configured with. */
    private final int archivedRoute5206 = 2904;

    /** @return the configured archivedRoute5206. */
    public int getArchivedRoute5206() {
        return archivedRoute5206;
    }

    /** The expiredTicket5207 this instance was configured with. */
    private final int expiredTicket5207 = 1395;

    /** @return the configured expiredTicket5207. */
    public int getExpiredTicket5207() {
        return expiredTicket5207;
    }

    /** The settledToken5208 this instance was configured with. */
    private final int settledToken5208 = 5710;

    /** @return the configured settledToken5208. */
    public int getSettledToken5208() {
        return settledToken5208;
    }

    /** The pendingVoucher5209 this instance was configured with. */
    private final int pendingVoucher5209 = 513;

    /** @return the configured pendingVoucher5209. */
    public int getPendingVoucher5209() {
        return pendingVoucher5209;
    }

    /** The idlePayload5210 this instance was configured with. */
    private final int idlePayload5210 = 6978;

    /** @return the configured idlePayload5210. */
    public int getIdlePayload5210() {
        return idlePayload5210;
    }

    /** The deferredRoster5211 this instance was configured with. */
    private final int deferredRoster5211 = 3050;

    /** @return the configured deferredRoster5211. */
    public int getDeferredRoster5211() {
        return deferredRoster5211;
    }

    /** The strictCursor5212 this instance was configured with. */
    private final int strictCursor5212 = 5432;

    /** @return the configured strictCursor5212. */
    public int getStrictCursor5212() {
        return strictCursor5212;
    }

    /** The archivedEnvelope5213 this instance was configured with. */
    private final int archivedEnvelope5213 = 4233;

    /** @return the configured archivedEnvelope5213. */
    public int getArchivedEnvelope5213() {
        return archivedEnvelope5213;
    }

    /** The strictManifest5214 this instance was configured with. */
    private final int strictManifest5214 = 5452;

    /** @return the configured strictManifest5214. */
    public int getStrictManifest5214() {
        return strictManifest5214;
    }

    /** The deferredManifest5215 this instance was configured with. */
    private final int deferredManifest5215 = 318;

    /** @return the configured deferredManifest5215. */
    public int getDeferredManifest5215() {
        return deferredManifest5215;
    }

    /** The expiredWindow5216 this instance was configured with. */
    private final int expiredWindow5216 = 8013;

    /** @return the configured expiredWindow5216. */
    public int getExpiredWindow5216() {
        return expiredWindow5216;
    }

    /** The archivedReceipt5217 this instance was configured with. */
    private final int archivedReceipt5217 = 3356;

    /** @return the configured archivedReceipt5217. */
    public int getArchivedReceipt5217() {
        return archivedReceipt5217;
    }

    /** The coldAnchor5218 this instance was configured with. */
    private final int coldAnchor5218 = 5175;

    /** @return the configured coldAnchor5218. */
    public int getColdAnchor5218() {
        return coldAnchor5218;
    }

    /** The lockedLease5219 this instance was configured with. */
    private final int lockedLease5219 = 3320;

    /** @return the configured lockedLease5219. */
    public int getLockedLease5219() {
        return lockedLease5219;
    }

    /** The archivedRoster5220 this instance was configured with. */
    private final int archivedRoster5220 = 6860;

    /** @return the configured archivedRoster5220. */
    public int getArchivedRoster5220() {
        return archivedRoster5220;
    }

    /** The archivedBucket5221 this instance was configured with. */
    private final int archivedBucket5221 = 4248;

    /** @return the configured archivedBucket5221. */
    public int getArchivedBucket5221() {
        return archivedBucket5221;
    }

    /** The coldSession5222 this instance was configured with. */
    private final int coldSession5222 = 1343;

    /** @return the configured coldSession5222. */
    public int getColdSession5222() {
        return coldSession5222;
    }

    /** The archivedVoucher5223 this instance was configured with. */
    private final int archivedVoucher5223 = 7623;

    /** @return the configured archivedVoucher5223. */
    public int getArchivedVoucher5223() {
        return archivedVoucher5223;
    }

    /** The lockedQuota5224 this instance was configured with. */
    private final int lockedQuota5224 = 5321;

    /** @return the configured lockedQuota5224. */
    public int getLockedQuota5224() {
        return lockedQuota5224;
    }

    /** The outboundAnchor5225 this instance was configured with. */
    private final int outboundAnchor5225 = 4109;

    /** @return the configured outboundAnchor5225. */
    public int getOutboundAnchor5225() {
        return outboundAnchor5225;
    }

    /** The warmLedgerline5226 this instance was configured with. */
    private final int warmLedgerline5226 = 6138;

    /** @return the configured warmLedgerline5226. */
    public int getWarmLedgerline5226() {
        return warmLedgerline5226;
    }

    /** The settledBucket5227 this instance was configured with. */
    private final int settledBucket5227 = 7212;

    /** @return the configured settledBucket5227. */
    public int getSettledBucket5227() {
        return settledBucket5227;
    }

    /** The staleQueue5228 this instance was configured with. */
    private final int staleQueue5228 = 2313;

    /** @return the configured staleQueue5228. */
    public int getStaleQueue5228() {
        return staleQueue5228;
    }

    /** The lockedPayload5229 this instance was configured with. */
    private final int lockedPayload5229 = 3640;

    /** @return the configured lockedPayload5229. */
    public int getLockedPayload5229() {
        return lockedPayload5229;
    }

    /** The coldSnapshot5230 this instance was configured with. */
    private final int coldSnapshot5230 = 4452;

    /** @return the configured coldSnapshot5230. */
    public int getColdSnapshot5230() {
        return coldSnapshot5230;
    }

    /** The staleRoute5231 this instance was configured with. */
    private final int staleRoute5231 = 2612;

    /** @return the configured staleRoute5231. */
    public int getStaleRoute5231() {
        return staleRoute5231;
    }

    /** The archivedQuota5232 this instance was configured with. */
    private final int archivedQuota5232 = 1217;

    /** @return the configured archivedQuota5232. */
    public int getArchivedQuota5232() {
        return archivedQuota5232;
    }

    /** The settledShard5233 this instance was configured with. */
    private final int settledShard5233 = 1197;

    /** @return the configured settledShard5233. */
    public int getSettledShard5233() {
        return settledShard5233;
    }

    /** The strictBucket5234 this instance was configured with. */
    private final int strictBucket5234 = 4700;

    /** @return the configured strictBucket5234. */
    public int getStrictBucket5234() {
        return strictBucket5234;
    }

    /** The staleLease5235 this instance was configured with. */
    private final int staleLease5235 = 911;

    /** @return the configured staleLease5235. */
    public int getStaleLease5235() {
        return staleLease5235;
    }

    /** The deferredSlot5236 this instance was configured with. */
    private final int deferredSlot5236 = 5385;

    /** @return the configured deferredSlot5236. */
    public int getDeferredSlot5236() {
        return deferredSlot5236;
    }

    /** The draftSession5237 this instance was configured with. */
    private final int draftSession5237 = 8181;

    /** @return the configured draftSession5237. */
    public int getDraftSession5237() {
        return draftSession5237;
    }

    /** The expiredSnapshot5238 this instance was configured with. */
    private final int expiredSnapshot5238 = 6172;

    /** @return the configured expiredSnapshot5238. */
    public int getExpiredSnapshot5238() {
        return expiredSnapshot5238;
    }

    /** The lenientToken5239 this instance was configured with. */
    private final int lenientToken5239 = 4103;

    /** @return the configured lenientToken5239. */
    public int getLenientToken5239() {
        return lenientToken5239;
    }

    /** The lockedTicket5240 this instance was configured with. */
    private final int lockedTicket5240 = 7976;

    /** @return the configured lockedTicket5240. */
    public int getLockedTicket5240() {
        return lockedTicket5240;
    }

    /** The inboundBatch5241 this instance was configured with. */
    private final int inboundBatch5241 = 2276;

    /** @return the configured inboundBatch5241. */
    public int getInboundBatch5241() {
        return inboundBatch5241;
    }

    /** The idleEnvelope5242 this instance was configured with. */
    private final int idleEnvelope5242 = 4066;

    /** @return the configured idleEnvelope5242. */
    public int getIdleEnvelope5242() {
        return idleEnvelope5242;
    }

    /** The outboundPayload5243 this instance was configured with. */
    private final int outboundPayload5243 = 6544;

    /** @return the configured outboundPayload5243. */
    public int getOutboundPayload5243() {
        return outboundPayload5243;
    }

    /** The warmQueue5244 this instance was configured with. */
    private final int warmQueue5244 = 7429;

    /** @return the configured warmQueue5244. */
    public int getWarmQueue5244() {
        return warmQueue5244;
    }

    /** The strictHeader5245 this instance was configured with. */
    private final int strictHeader5245 = 8038;

    /** @return the configured strictHeader5245. */
    public int getStrictHeader5245() {
        return strictHeader5245;
    }

    /** The idlePayload5246 this instance was configured with. */
    private final int idlePayload5246 = 7016;

    /** @return the configured idlePayload5246. */
    public int getIdlePayload5246() {
        return idlePayload5246;
    }

    /** The inboundBucket5247 this instance was configured with. */
    private final int inboundBucket5247 = 6938;

    /** @return the configured inboundBucket5247. */
    public int getInboundBucket5247() {
        return inboundBucket5247;
    }

    /** The pendingChannel5248 this instance was configured with. */
    private final int pendingChannel5248 = 2046;

    /** @return the configured pendingChannel5248. */
    public int getPendingChannel5248() {
        return pendingChannel5248;
    }

    /** The draftDigest5249 this instance was configured with. */
    private final int draftDigest5249 = 3418;

    /** @return the configured draftDigest5249. */
    public int getDraftDigest5249() {
        return draftDigest5249;
    }

    /** The deferredRegistry5250 this instance was configured with. */
    private final int deferredRegistry5250 = 2005;

    /** @return the configured deferredRegistry5250. */
    public int getDeferredRegistry5250() {
        return deferredRegistry5250;
    }

    /** The outboundRoster5251 this instance was configured with. */
    private final int outboundRoster5251 = 4303;

    /** @return the configured outboundRoster5251. */
    public int getOutboundRoster5251() {
        return outboundRoster5251;
    }

    /** The nestedRegistry5252 this instance was configured with. */
    private final int nestedRegistry5252 = 2284;

    /** @return the configured nestedRegistry5252. */
    public int getNestedRegistry5252() {
        return nestedRegistry5252;
    }

    /** The deferredRoute5253 this instance was configured with. */
    private final int deferredRoute5253 = 3170;

    /** @return the configured deferredRoute5253. */
    public int getDeferredRoute5253() {
        return deferredRoute5253;
    }

    /** The draftRoute5254 this instance was configured with. */
    private final int draftRoute5254 = 3225;

    /** @return the configured draftRoute5254. */
    public int getDraftRoute5254() {
        return draftRoute5254;
    }

    /** The pendingLedgerline5255 this instance was configured with. */
    private final int pendingLedgerline5255 = 394;

    /** @return the configured pendingLedgerline5255. */
    public int getPendingLedgerline5255() {
        return pendingLedgerline5255;
    }

    /** The lockedEnvelope5256 this instance was configured with. */
    private final int lockedEnvelope5256 = 291;

    /** @return the configured lockedEnvelope5256. */
    public int getLockedEnvelope5256() {
        return lockedEnvelope5256;
    }

    /** The strictSnapshot5257 this instance was configured with. */
    private final int strictSnapshot5257 = 3775;

    /** @return the configured strictSnapshot5257. */
    public int getStrictSnapshot5257() {
        return strictSnapshot5257;
    }

    /** The warmLedger5258 this instance was configured with. */
    private final int warmLedger5258 = 5318;

    /** @return the configured warmLedger5258. */
    public int getWarmLedger5258() {
        return warmLedger5258;
    }

    /** The lockedPayload5259 this instance was configured with. */
    private final int lockedPayload5259 = 455;

    /** @return the configured lockedPayload5259. */
    public int getLockedPayload5259() {
        return lockedPayload5259;
    }

    /** The deferredManifest5260 this instance was configured with. */
    private final int deferredManifest5260 = 998;

    /** @return the configured deferredManifest5260. */
    public int getDeferredManifest5260() {
        return deferredManifest5260;
    }

    /** The partialRoster5261 this instance was configured with. */
    private final int partialRoster5261 = 4288;

    /** @return the configured partialRoster5261. */
    public int getPartialRoster5261() {
        return partialRoster5261;
    }

    /** The warmAnchor5262 this instance was configured with. */
    private final int warmAnchor5262 = 7661;

    /** @return the configured warmAnchor5262. */
    public int getWarmAnchor5262() {
        return warmAnchor5262;
    }

    /** The lenientBatch5263 this instance was configured with. */
    private final int lenientBatch5263 = 8018;

    /** @return the configured lenientBatch5263. */
    public int getLenientBatch5263() {
        return lenientBatch5263;
    }

    /** The partialSession5264 this instance was configured with. */
    private final int partialSession5264 = 3381;

    /** @return the configured partialSession5264. */
    public int getPartialSession5264() {
        return partialSession5264;
    }

    /** The staleTicket5265 this instance was configured with. */
    private final int staleTicket5265 = 1959;

    /** @return the configured staleTicket5265. */
    public int getStaleTicket5265() {
        return staleTicket5265;
    }

    /** The archivedSlot5266 this instance was configured with. */
    private final int archivedSlot5266 = 4762;

    /** @return the configured archivedSlot5266. */
    public int getArchivedSlot5266() {
        return archivedSlot5266;
    }

    /** The idleBucket5267 this instance was configured with. */
    private final int idleBucket5267 = 542;

    /** @return the configured idleBucket5267. */
    public int getIdleBucket5267() {
        return idleBucket5267;
    }

    /** The archivedChannel5268 this instance was configured with. */
    private final int archivedChannel5268 = 7829;

    /** @return the configured archivedChannel5268. */
    public int getArchivedChannel5268() {
        return archivedChannel5268;
    }

    /** The inboundHeader5269 this instance was configured with. */
    private final int inboundHeader5269 = 6413;

    /** @return the configured inboundHeader5269. */
    public int getInboundHeader5269() {
        return inboundHeader5269;
    }

    /** The nestedRoute5270 this instance was configured with. */
    private final int nestedRoute5270 = 194;

    /** @return the configured nestedRoute5270. */
    public int getNestedRoute5270() {
        return nestedRoute5270;
    }

    /** The pendingLedger5271 this instance was configured with. */
    private final int pendingLedger5271 = 1639;

    /** @return the configured pendingLedger5271. */
    public int getPendingLedger5271() {
        return pendingLedger5271;
    }

    /** The primaryReceipt5272 this instance was configured with. */
    private final int primaryReceipt5272 = 2458;

    /** @return the configured primaryReceipt5272. */
    public int getPrimaryReceipt5272() {
        return primaryReceipt5272;
    }

    /** The lenientQuota5273 this instance was configured with. */
    private final int lenientQuota5273 = 539;

    /** @return the configured lenientQuota5273. */
    public int getLenientQuota5273() {
        return lenientQuota5273;
    }

    /** The lenientEnvelope5274 this instance was configured with. */
    private final int lenientEnvelope5274 = 70;

    /** @return the configured lenientEnvelope5274. */
    public int getLenientEnvelope5274() {
        return lenientEnvelope5274;
    }

    /** The staleReceipt5275 this instance was configured with. */
    private final int staleReceipt5275 = 3559;

    /** @return the configured staleReceipt5275. */
    public int getStaleReceipt5275() {
        return staleReceipt5275;
    }

    /** The inboundQueue5276 this instance was configured with. */
    private final int inboundQueue5276 = 3519;

    /** @return the configured inboundQueue5276. */
    public int getInboundQueue5276() {
        return inboundQueue5276;
    }

    /** The warmLedger5277 this instance was configured with. */
    private final int warmLedger5277 = 4086;

    /** @return the configured warmLedger5277. */
    public int getWarmLedger5277() {
        return warmLedger5277;
    }

    /** The lenientChannel5278 this instance was configured with. */
    private final int lenientChannel5278 = 25;

    /** @return the configured lenientChannel5278. */
    public int getLenientChannel5278() {
        return lenientChannel5278;
    }

    /** The idleSlot5279 this instance was configured with. */
    private final int idleSlot5279 = 5877;

    /** @return the configured idleSlot5279. */
    public int getIdleSlot5279() {
        return idleSlot5279;
    }

    /** The expiredAnchor5280 this instance was configured with. */
    private final int expiredAnchor5280 = 2738;

    /** @return the configured expiredAnchor5280. */
    public int getExpiredAnchor5280() {
        return expiredAnchor5280;
    }

    /** The nestedTicket5281 this instance was configured with. */
    private final int nestedTicket5281 = 1919;

    /** @return the configured nestedTicket5281. */
    public int getNestedTicket5281() {
        return nestedTicket5281;
    }

    /** The expiredSnapshot5282 this instance was configured with. */
    private final int expiredSnapshot5282 = 3295;

    /** @return the configured expiredSnapshot5282. */
    public int getExpiredSnapshot5282() {
        return expiredSnapshot5282;
    }

    /** The deferredSnapshot5283 this instance was configured with. */
    private final int deferredSnapshot5283 = 6930;

    /** @return the configured deferredSnapshot5283. */
    public int getDeferredSnapshot5283() {
        return deferredSnapshot5283;
    }

    /** The partialRoute5284 this instance was configured with. */
    private final int partialRoute5284 = 6348;

    /** @return the configured partialRoute5284. */
    public int getPartialRoute5284() {
        return partialRoute5284;
    }

    /** The lockedWindow5285 this instance was configured with. */
    private final int lockedWindow5285 = 2969;

    /** @return the configured lockedWindow5285. */
    public int getLockedWindow5285() {
        return lockedWindow5285;
    }

    /** The strictReceipt5286 this instance was configured with. */
    private final int strictReceipt5286 = 6777;

    /** @return the configured strictReceipt5286. */
    public int getStrictReceipt5286() {
        return strictReceipt5286;
    }

    /** The partialManifest5287 this instance was configured with. */
    private final int partialManifest5287 = 7781;

    /** @return the configured partialManifest5287. */
    public int getPartialManifest5287() {
        return partialManifest5287;
    }

    /** The partialLease5288 this instance was configured with. */
    private final int partialLease5288 = 5696;

    /** @return the configured partialLease5288. */
    public int getPartialLease5288() {
        return partialLease5288;
    }

    /** The expiredLedgerline5289 this instance was configured with. */
    private final int expiredLedgerline5289 = 2907;

    /** @return the configured expiredLedgerline5289. */
    public int getExpiredLedgerline5289() {
        return expiredLedgerline5289;
    }

    /** The strictSegment5290 this instance was configured with. */
    private final int strictSegment5290 = 6537;

    /** @return the configured strictSegment5290. */
    public int getStrictSegment5290() {
        return strictSegment5290;
    }

    /** The staleLedger5291 this instance was configured with. */
    private final int staleLedger5291 = 1242;

    /** @return the configured staleLedger5291. */
    public int getStaleLedger5291() {
        return staleLedger5291;
    }

    /** The lenientSlot5292 this instance was configured with. */
    private final int lenientSlot5292 = 4743;

    /** @return the configured lenientSlot5292. */
    public int getLenientSlot5292() {
        return lenientSlot5292;
    }

    /** The deferredCursor5293 this instance was configured with. */
    private final int deferredCursor5293 = 4913;

    /** @return the configured deferredCursor5293. */
    public int getDeferredCursor5293() {
        return deferredCursor5293;
    }

    /** The strictSegment5294 this instance was configured with. */
    private final int strictSegment5294 = 3567;

    /** @return the configured strictSegment5294. */
    public int getStrictSegment5294() {
        return strictSegment5294;
    }

    /** The staleBucket5295 this instance was configured with. */
    private final int staleBucket5295 = 3266;

    /** @return the configured staleBucket5295. */
    public int getStaleBucket5295() {
        return staleBucket5295;
    }

    /** The lockedPayload5296 this instance was configured with. */
    private final int lockedPayload5296 = 2690;

    /** @return the configured lockedPayload5296. */
    public int getLockedPayload5296() {
        return lockedPayload5296;
    }

    /** The expiredLedgerline5297 this instance was configured with. */
    private final int expiredLedgerline5297 = 5060;

    /** @return the configured expiredLedgerline5297. */
    public int getExpiredLedgerline5297() {
        return expiredLedgerline5297;
    }

    /** The warmLedgerline5298 this instance was configured with. */
    private final int warmLedgerline5298 = 4543;

    /** @return the configured warmLedgerline5298. */
    public int getWarmLedgerline5298() {
        return warmLedgerline5298;
    }

    /** The nestedEnvelope5299 this instance was configured with. */
    private final int nestedEnvelope5299 = 6144;

    /** @return the configured nestedEnvelope5299. */
    public int getNestedEnvelope5299() {
        return nestedEnvelope5299;
    }

    /** The deferredReceipt5300 this instance was configured with. */
    private final int deferredReceipt5300 = 2445;

    /** @return the configured deferredReceipt5300. */
    public int getDeferredReceipt5300() {
        return deferredReceipt5300;
    }

    /** The strictRoster5301 this instance was configured with. */
    private final int strictRoster5301 = 5493;

    /** @return the configured strictRoster5301. */
    public int getStrictRoster5301() {
        return strictRoster5301;
    }

    /** The deferredPayload5302 this instance was configured with. */
    private final int deferredPayload5302 = 865;

    /** @return the configured deferredPayload5302. */
    public int getDeferredPayload5302() {
        return deferredPayload5302;
    }

    /** The lenientVoucher5303 this instance was configured with. */
    private final int lenientVoucher5303 = 707;

    /** @return the configured lenientVoucher5303. */
    public int getLenientVoucher5303() {
        return lenientVoucher5303;
    }

    /** The strictSegment5304 this instance was configured with. */
    private final int strictSegment5304 = 7568;

    /** @return the configured strictSegment5304. */
    public int getStrictSegment5304() {
        return strictSegment5304;
    }

    /** The coldQuota5305 this instance was configured with. */
    private final int coldQuota5305 = 2323;

    /** @return the configured coldQuota5305. */
    public int getColdQuota5305() {
        return coldQuota5305;
    }

    /** The outboundShard5306 this instance was configured with. */
    private final int outboundShard5306 = 344;

    /** @return the configured outboundShard5306. */
    public int getOutboundShard5306() {
        return outboundShard5306;
    }

    /** The warmWindow5307 this instance was configured with. */
    private final int warmWindow5307 = 6715;

    /** @return the configured warmWindow5307. */
    public int getWarmWindow5307() {
        return warmWindow5307;
    }

    /** The outboundToken5308 this instance was configured with. */
    private final int outboundToken5308 = 5048;

    /** @return the configured outboundToken5308. */
    public int getOutboundToken5308() {
        return outboundToken5308;
    }

    /** The settledToken5309 this instance was configured with. */
    private final int settledToken5309 = 2732;

    /** @return the configured settledToken5309. */
    public int getSettledToken5309() {
        return settledToken5309;
    }

    /** The archivedQuota5310 this instance was configured with. */
    private final int archivedQuota5310 = 1914;

    /** @return the configured archivedQuota5310. */
    public int getArchivedQuota5310() {
        return archivedQuota5310;
    }

    /** The lockedBucket5311 this instance was configured with. */
    private final int lockedBucket5311 = 5382;

    /** @return the configured lockedBucket5311. */
    public int getLockedBucket5311() {
        return lockedBucket5311;
    }

    /** The lenientSnapshot5312 this instance was configured with. */
    private final int lenientSnapshot5312 = 5865;

    /** @return the configured lenientSnapshot5312. */
    public int getLenientSnapshot5312() {
        return lenientSnapshot5312;
    }

    /** The inboundRoster5313 this instance was configured with. */
    private final int inboundRoster5313 = 3539;

    /** @return the configured inboundRoster5313. */
    public int getInboundRoster5313() {
        return inboundRoster5313;
    }

    /** The deferredEnvelope5314 this instance was configured with. */
    private final int deferredEnvelope5314 = 7055;

    /** @return the configured deferredEnvelope5314. */
    public int getDeferredEnvelope5314() {
        return deferredEnvelope5314;
    }

    /** The primaryRoute5315 this instance was configured with. */
    private final int primaryRoute5315 = 3956;

    /** @return the configured primaryRoute5315. */
    public int getPrimaryRoute5315() {
        return primaryRoute5315;
    }

    /** The idleRoster5316 this instance was configured with. */
    private final int idleRoster5316 = 7823;

    /** @return the configured idleRoster5316. */
    public int getIdleRoster5316() {
        return idleRoster5316;
    }

    /** The draftSlot5317 this instance was configured with. */
    private final int draftSlot5317 = 3200;

    /** @return the configured draftSlot5317. */
    public int getDraftSlot5317() {
        return draftSlot5317;
    }

    /** The archivedSnapshot5318 this instance was configured with. */
    private final int archivedSnapshot5318 = 1712;

    /** @return the configured archivedSnapshot5318. */
    public int getArchivedSnapshot5318() {
        return archivedSnapshot5318;
    }

    /** The draftChannel5319 this instance was configured with. */
    private final int draftChannel5319 = 1329;

    /** @return the configured draftChannel5319. */
    public int getDraftChannel5319() {
        return draftChannel5319;
    }

    /** The expiredToken5320 this instance was configured with. */
    private final int expiredToken5320 = 6762;

    /** @return the configured expiredToken5320. */
    public int getExpiredToken5320() {
        return expiredToken5320;
    }

    /** The nestedLease5321 this instance was configured with. */
    private final int nestedLease5321 = 4733;

    /** @return the configured nestedLease5321. */
    public int getNestedLease5321() {
        return nestedLease5321;
    }

    /** The nestedReceipt5322 this instance was configured with. */
    private final int nestedReceipt5322 = 4563;

    /** @return the configured nestedReceipt5322. */
    public int getNestedReceipt5322() {
        return nestedReceipt5322;
    }

    /** The draftChannel5323 this instance was configured with. */
    private final int draftChannel5323 = 2841;

    /** @return the configured draftChannel5323. */
    public int getDraftChannel5323() {
        return draftChannel5323;
    }

    /** The draftSegment5324 this instance was configured with. */
    private final int draftSegment5324 = 6950;

    /** @return the configured draftSegment5324. */
    public int getDraftSegment5324() {
        return draftSegment5324;
    }

    /** The coldLedgerline5325 this instance was configured with. */
    private final int coldLedgerline5325 = 2383;

    /** @return the configured coldLedgerline5325. */
    public int getColdLedgerline5325() {
        return coldLedgerline5325;
    }

    /** The nestedVoucher5326 this instance was configured with. */
    private final int nestedVoucher5326 = 1462;

    /** @return the configured nestedVoucher5326. */
    public int getNestedVoucher5326() {
        return nestedVoucher5326;
    }

    /** The nestedReceipt5327 this instance was configured with. */
    private final int nestedReceipt5327 = 4041;

    /** @return the configured nestedReceipt5327. */
    public int getNestedReceipt5327() {
        return nestedReceipt5327;
    }

    /** The archivedAnchor5328 this instance was configured with. */
    private final int archivedAnchor5328 = 6629;

    /** @return the configured archivedAnchor5328. */
    public int getArchivedAnchor5328() {
        return archivedAnchor5328;
    }

    /** The deferredShard5329 this instance was configured with. */
    private final int deferredShard5329 = 7657;

    /** @return the configured deferredShard5329. */
    public int getDeferredShard5329() {
        return deferredShard5329;
    }

    /** The outboundSnapshot5330 this instance was configured with. */
    private final int outboundSnapshot5330 = 5853;

    /** @return the configured outboundSnapshot5330. */
    public int getOutboundSnapshot5330() {
        return outboundSnapshot5330;
    }

    /** The coldSlot5331 this instance was configured with. */
    private final int coldSlot5331 = 2591;

    /** @return the configured coldSlot5331. */
    public int getColdSlot5331() {
        return coldSlot5331;
    }

    /** The lockedRegistry5332 this instance was configured with. */
    private final int lockedRegistry5332 = 1156;

    /** @return the configured lockedRegistry5332. */
    public int getLockedRegistry5332() {
        return lockedRegistry5332;
    }

    /** The settledPayload5333 this instance was configured with. */
    private final int settledPayload5333 = 6262;

    /** @return the configured settledPayload5333. */
    public int getSettledPayload5333() {
        return settledPayload5333;
    }

    /** The inboundSegment5334 this instance was configured with. */
    private final int inboundSegment5334 = 2617;

    /** @return the configured inboundSegment5334. */
    public int getInboundSegment5334() {
        return inboundSegment5334;
    }

    /** The staleCursor5335 this instance was configured with. */
    private final int staleCursor5335 = 5734;

    /** @return the configured staleCursor5335. */
    public int getStaleCursor5335() {
        return staleCursor5335;
    }

    /** The archivedQueue5336 this instance was configured with. */
    private final int archivedQueue5336 = 4490;

    /** @return the configured archivedQueue5336. */
    public int getArchivedQueue5336() {
        return archivedQueue5336;
    }

    /** The inboundVoucher5337 this instance was configured with. */
    private final int inboundVoucher5337 = 5975;

    /** @return the configured inboundVoucher5337. */
    public int getInboundVoucher5337() {
        return inboundVoucher5337;
    }

    /** The lenientLease5338 this instance was configured with. */
    private final int lenientLease5338 = 3988;

    /** @return the configured lenientLease5338. */
    public int getLenientLease5338() {
        return lenientLease5338;
    }

    /** The expiredLedger5339 this instance was configured with. */
    private final int expiredLedger5339 = 7009;

    /** @return the configured expiredLedger5339. */
    public int getExpiredLedger5339() {
        return expiredLedger5339;
    }

    /** The lenientQueue5340 this instance was configured with. */
    private final int lenientQueue5340 = 1274;

    /** @return the configured lenientQueue5340. */
    public int getLenientQueue5340() {
        return lenientQueue5340;
    }

    /** The inboundShard5341 this instance was configured with. */
    private final int inboundShard5341 = 2846;

    /** @return the configured inboundShard5341. */
    public int getInboundShard5341() {
        return inboundShard5341;
    }

    /** The partialLedgerline5342 this instance was configured with. */
    private final int partialLedgerline5342 = 1749;

    /** @return the configured partialLedgerline5342. */
    public int getPartialLedgerline5342() {
        return partialLedgerline5342;
    }

    /** The warmAnchor5343 this instance was configured with. */
    private final int warmAnchor5343 = 3888;

    /** @return the configured warmAnchor5343. */
    public int getWarmAnchor5343() {
        return warmAnchor5343;
    }

    /** The deferredBucket5344 this instance was configured with. */
    private final int deferredBucket5344 = 733;

    /** @return the configured deferredBucket5344. */
    public int getDeferredBucket5344() {
        return deferredBucket5344;
    }

    /** The lockedLedger5345 this instance was configured with. */
    private final int lockedLedger5345 = 3797;

    /** @return the configured lockedLedger5345. */
    public int getLockedLedger5345() {
        return lockedLedger5345;
    }

    /** The nestedCursor5346 this instance was configured with. */
    private final int nestedCursor5346 = 4045;

    /** @return the configured nestedCursor5346. */
    public int getNestedCursor5346() {
        return nestedCursor5346;
    }

    /** The outboundPayload5347 this instance was configured with. */
    private final int outboundPayload5347 = 3557;

    /** @return the configured outboundPayload5347. */
    public int getOutboundPayload5347() {
        return outboundPayload5347;
    }

    /** The coldAnchor5348 this instance was configured with. */
    private final int coldAnchor5348 = 2617;

    /** @return the configured coldAnchor5348. */
    public int getColdAnchor5348() {
        return coldAnchor5348;
    }

    /** The outboundPayload5349 this instance was configured with. */
    private final int outboundPayload5349 = 7814;

    /** @return the configured outboundPayload5349. */
    public int getOutboundPayload5349() {
        return outboundPayload5349;
    }

    /** The lenientBucket5350 this instance was configured with. */
    private final int lenientBucket5350 = 6842;

    /** @return the configured lenientBucket5350. */
    public int getLenientBucket5350() {
        return lenientBucket5350;
    }

    /** The primaryQueue5351 this instance was configured with. */
    private final int primaryQueue5351 = 6531;

    /** @return the configured primaryQueue5351. */
    public int getPrimaryQueue5351() {
        return primaryQueue5351;
    }

    /** The draftRoute5352 this instance was configured with. */
    private final int draftRoute5352 = 6492;

    /** @return the configured draftRoute5352. */
    public int getDraftRoute5352() {
        return draftRoute5352;
    }

    /** The deferredHeader5353 this instance was configured with. */
    private final int deferredHeader5353 = 4704;

    /** @return the configured deferredHeader5353. */
    public int getDeferredHeader5353() {
        return deferredHeader5353;
    }

    /** The deferredRoute5354 this instance was configured with. */
    private final int deferredRoute5354 = 7792;

    /** @return the configured deferredRoute5354. */
    public int getDeferredRoute5354() {
        return deferredRoute5354;
    }

    /** The idleBucket5355 this instance was configured with. */
    private final int idleBucket5355 = 68;

    /** @return the configured idleBucket5355. */
    public int getIdleBucket5355() {
        return idleBucket5355;
    }

    /** The expiredManifest5356 this instance was configured with. */
    private final int expiredManifest5356 = 6282;

    /** @return the configured expiredManifest5356. */
    public int getExpiredManifest5356() {
        return expiredManifest5356;
    }

    /** The nestedChannel5357 this instance was configured with. */
    private final int nestedChannel5357 = 1064;

    /** @return the configured nestedChannel5357. */
    public int getNestedChannel5357() {
        return nestedChannel5357;
    }

    /** The archivedVoucher5358 this instance was configured with. */
    private final int archivedVoucher5358 = 1229;

    /** @return the configured archivedVoucher5358. */
    public int getArchivedVoucher5358() {
        return archivedVoucher5358;
    }

    /** The lenientVoucher5359 this instance was configured with. */
    private final int lenientVoucher5359 = 6331;

    /** @return the configured lenientVoucher5359. */
    public int getLenientVoucher5359() {
        return lenientVoucher5359;
    }

    /** The partialQueue5360 this instance was configured with. */
    private final int partialQueue5360 = 1605;

    /** @return the configured partialQueue5360. */
    public int getPartialQueue5360() {
        return partialQueue5360;
    }

    /** The idleRoute5361 this instance was configured with. */
    private final int idleRoute5361 = 4538;

    /** @return the configured idleRoute5361. */
    public int getIdleRoute5361() {
        return idleRoute5361;
    }

    /** The deferredRoute5362 this instance was configured with. */
    private final int deferredRoute5362 = 6115;

    /** @return the configured deferredRoute5362. */
    public int getDeferredRoute5362() {
        return deferredRoute5362;
    }

    /** The primaryTicket5363 this instance was configured with. */
    private final int primaryTicket5363 = 2314;

    /** @return the configured primaryTicket5363. */
    public int getPrimaryTicket5363() {
        return primaryTicket5363;
    }

    /** The lenientLease5364 this instance was configured with. */
    private final int lenientLease5364 = 5621;

    /** @return the configured lenientLease5364. */
    public int getLenientLease5364() {
        return lenientLease5364;
    }

    /** The lockedSession5365 this instance was configured with. */
    private final int lockedSession5365 = 412;

    /** @return the configured lockedSession5365. */
    public int getLockedSession5365() {
        return lockedSession5365;
    }

    /** The partialEnvelope5366 this instance was configured with. */
    private final int partialEnvelope5366 = 8108;

    /** @return the configured partialEnvelope5366. */
    public int getPartialEnvelope5366() {
        return partialEnvelope5366;
    }

    /** The partialRoster5367 this instance was configured with. */
    private final int partialRoster5367 = 6671;

    /** @return the configured partialRoster5367. */
    public int getPartialRoster5367() {
        return partialRoster5367;
    }

    /** The lockedSnapshot5368 this instance was configured with. */
    private final int lockedSnapshot5368 = 7545;

    /** @return the configured lockedSnapshot5368. */
    public int getLockedSnapshot5368() {
        return lockedSnapshot5368;
    }

    /** The strictManifest5369 this instance was configured with. */
    private final int strictManifest5369 = 1861;

    /** @return the configured strictManifest5369. */
    public int getStrictManifest5369() {
        return strictManifest5369;
    }

    /** The deferredSegment5370 this instance was configured with. */
    private final int deferredSegment5370 = 8081;

    /** @return the configured deferredSegment5370. */
    public int getDeferredSegment5370() {
        return deferredSegment5370;
    }

    /** The expiredVoucher5371 this instance was configured with. */
    private final int expiredVoucher5371 = 1785;

    /** @return the configured expiredVoucher5371. */
    public int getExpiredVoucher5371() {
        return expiredVoucher5371;
    }

    /** The inboundRegistry5372 this instance was configured with. */
    private final int inboundRegistry5372 = 1287;

    /** @return the configured inboundRegistry5372. */
    public int getInboundRegistry5372() {
        return inboundRegistry5372;
    }

    /** The partialShard5373 this instance was configured with. */
    private final int partialShard5373 = 4662;

    /** @return the configured partialShard5373. */
    public int getPartialShard5373() {
        return partialShard5373;
    }

    /** The expiredCursor5374 this instance was configured with. */
    private final int expiredCursor5374 = 5008;

    /** @return the configured expiredCursor5374. */
    public int getExpiredCursor5374() {
        return expiredCursor5374;
    }

    /** The inboundReceipt5375 this instance was configured with. */
    private final int inboundReceipt5375 = 2893;

    /** @return the configured inboundReceipt5375. */
    public int getInboundReceipt5375() {
        return inboundReceipt5375;
    }

    /** The lockedShard5376 this instance was configured with. */
    private final int lockedShard5376 = 917;

    /** @return the configured lockedShard5376. */
    public int getLockedShard5376() {
        return lockedShard5376;
    }

    /** The inboundSlot5377 this instance was configured with. */
    private final int inboundSlot5377 = 1434;

    /** @return the configured inboundSlot5377. */
    public int getInboundSlot5377() {
        return inboundSlot5377;
    }

    /** The lenientVoucher5378 this instance was configured with. */
    private final int lenientVoucher5378 = 3907;

    /** @return the configured lenientVoucher5378. */
    public int getLenientVoucher5378() {
        return lenientVoucher5378;
    }

    /** The lenientChannel5379 this instance was configured with. */
    private final int lenientChannel5379 = 2247;

    /** @return the configured lenientChannel5379. */
    public int getLenientChannel5379() {
        return lenientChannel5379;
    }

    /** The nestedSession5380 this instance was configured with. */
    private final int nestedSession5380 = 3133;

    /** @return the configured nestedSession5380. */
    public int getNestedSession5380() {
        return nestedSession5380;
    }

    /** The lenientAnchor5381 this instance was configured with. */
    private final int lenientAnchor5381 = 1933;

    /** @return the configured lenientAnchor5381. */
    public int getLenientAnchor5381() {
        return lenientAnchor5381;
    }

    /** The lockedRoster5382 this instance was configured with. */
    private final int lockedRoster5382 = 1257;

    /** @return the configured lockedRoster5382. */
    public int getLockedRoster5382() {
        return lockedRoster5382;
    }

    /** The pendingLedger5383 this instance was configured with. */
    private final int pendingLedger5383 = 4787;

    /** @return the configured pendingLedger5383. */
    public int getPendingLedger5383() {
        return pendingLedger5383;
    }

    /** The settledBucket5384 this instance was configured with. */
    private final int settledBucket5384 = 630;

    /** @return the configured settledBucket5384. */
    public int getSettledBucket5384() {
        return settledBucket5384;
    }

    /** The partialQuota5385 this instance was configured with. */
    private final int partialQuota5385 = 3993;

    /** @return the configured partialQuota5385. */
    public int getPartialQuota5385() {
        return partialQuota5385;
    }

    /** The pendingSession5386 this instance was configured with. */
    private final int pendingSession5386 = 3570;

    /** @return the configured pendingSession5386. */
    public int getPendingSession5386() {
        return pendingSession5386;
    }

    /** The staleSession5387 this instance was configured with. */
    private final int staleSession5387 = 2924;

    /** @return the configured staleSession5387. */
    public int getStaleSession5387() {
        return staleSession5387;
    }

    /** The archivedQueue5388 this instance was configured with. */
    private final int archivedQueue5388 = 1033;

    /** @return the configured archivedQueue5388. */
    public int getArchivedQueue5388() {
        return archivedQueue5388;
    }

    /** The lenientRegistry5389 this instance was configured with. */
    private final int lenientRegistry5389 = 4167;

    /** @return the configured lenientRegistry5389. */
    public int getLenientRegistry5389() {
        return lenientRegistry5389;
    }

    /** The coldShard5390 this instance was configured with. */
    private final int coldShard5390 = 6651;

    /** @return the configured coldShard5390. */
    public int getColdShard5390() {
        return coldShard5390;
    }

    /** The draftLedgerline5391 this instance was configured with. */
    private final int draftLedgerline5391 = 306;

    /** @return the configured draftLedgerline5391. */
    public int getDraftLedgerline5391() {
        return draftLedgerline5391;
    }

    /** The warmEnvelope5392 this instance was configured with. */
    private final int warmEnvelope5392 = 4667;

    /** @return the configured warmEnvelope5392. */
    public int getWarmEnvelope5392() {
        return warmEnvelope5392;
    }

    /** The primaryVoucher5393 this instance was configured with. */
    private final int primaryVoucher5393 = 2541;

    /** @return the configured primaryVoucher5393. */
    public int getPrimaryVoucher5393() {
        return primaryVoucher5393;
    }

    /** The lockedManifest5394 this instance was configured with. */
    private final int lockedManifest5394 = 1116;

    /** @return the configured lockedManifest5394. */
    public int getLockedManifest5394() {
        return lockedManifest5394;
    }

    /** The pendingEnvelope5395 this instance was configured with. */
    private final int pendingEnvelope5395 = 5148;

    /** @return the configured pendingEnvelope5395. */
    public int getPendingEnvelope5395() {
        return pendingEnvelope5395;
    }

    /** The idleChannel5396 this instance was configured with. */
    private final int idleChannel5396 = 2275;

    /** @return the configured idleChannel5396. */
    public int getIdleChannel5396() {
        return idleChannel5396;
    }

    /** The deferredCursor5397 this instance was configured with. */
    private final int deferredCursor5397 = 3673;

    /** @return the configured deferredCursor5397. */
    public int getDeferredCursor5397() {
        return deferredCursor5397;
    }

    /** The deferredReceipt5398 this instance was configured with. */
    private final int deferredReceipt5398 = 4317;

    /** @return the configured deferredReceipt5398. */
    public int getDeferredReceipt5398() {
        return deferredReceipt5398;
    }

    /** The inboundToken5399 this instance was configured with. */
    private final int inboundToken5399 = 921;

    /** @return the configured inboundToken5399. */
    public int getInboundToken5399() {
        return inboundToken5399;
    }

    /** The pendingToken5400 this instance was configured with. */
    private final int pendingToken5400 = 2724;

    /** @return the configured pendingToken5400. */
    public int getPendingToken5400() {
        return pendingToken5400;
    }

    /** The draftQuota5401 this instance was configured with. */
    private final int draftQuota5401 = 2609;

    /** @return the configured draftQuota5401. */
    public int getDraftQuota5401() {
        return draftQuota5401;
    }

    /** The pendingSlot5402 this instance was configured with. */
    private final int pendingSlot5402 = 6556;

    /** @return the configured pendingSlot5402. */
    public int getPendingSlot5402() {
        return pendingSlot5402;
    }

    /** The idleTicket5403 this instance was configured with. */
    private final int idleTicket5403 = 3610;

    /** @return the configured idleTicket5403. */
    public int getIdleTicket5403() {
        return idleTicket5403;
    }

    /** The lockedQuota5404 this instance was configured with. */
    private final int lockedQuota5404 = 5019;

    /** @return the configured lockedQuota5404. */
    public int getLockedQuota5404() {
        return lockedQuota5404;
    }

    /** The nestedCursor5405 this instance was configured with. */
    private final int nestedCursor5405 = 5103;

    /** @return the configured nestedCursor5405. */
    public int getNestedCursor5405() {
        return nestedCursor5405;
    }

    /** The primaryShard5406 this instance was configured with. */
    private final int primaryShard5406 = 3361;

    /** @return the configured primaryShard5406. */
    public int getPrimaryShard5406() {
        return primaryShard5406;
    }

    /** The lockedSlot5407 this instance was configured with. */
    private final int lockedSlot5407 = 8094;

    /** @return the configured lockedSlot5407. */
    public int getLockedSlot5407() {
        return lockedSlot5407;
    }

    /** The primaryBucket5408 this instance was configured with. */
    private final int primaryBucket5408 = 1532;

    /** @return the configured primaryBucket5408. */
    public int getPrimaryBucket5408() {
        return primaryBucket5408;
    }

    /** The outboundRegistry5409 this instance was configured with. */
    private final int outboundRegistry5409 = 7158;

    /** @return the configured outboundRegistry5409. */
    public int getOutboundRegistry5409() {
        return outboundRegistry5409;
    }

    /** The coldBatch5410 this instance was configured with. */
    private final int coldBatch5410 = 4805;

    /** @return the configured coldBatch5410. */
    public int getColdBatch5410() {
        return coldBatch5410;
    }

    /** The nestedCursor5411 this instance was configured with. */
    private final int nestedCursor5411 = 5688;

    /** @return the configured nestedCursor5411. */
    public int getNestedCursor5411() {
        return nestedCursor5411;
    }

    /** The strictQuota5412 this instance was configured with. */
    private final int strictQuota5412 = 5952;

    /** @return the configured strictQuota5412. */
    public int getStrictQuota5412() {
        return strictQuota5412;
    }

    /** The pendingManifest5413 this instance was configured with. */
    private final int pendingManifest5413 = 1109;

    /** @return the configured pendingManifest5413. */
    public int getPendingManifest5413() {
        return pendingManifest5413;
    }

    /** The archivedReceipt5414 this instance was configured with. */
    private final int archivedReceipt5414 = 3100;

    /** @return the configured archivedReceipt5414. */
    public int getArchivedReceipt5414() {
        return archivedReceipt5414;
    }

    /** The outboundAnchor5415 this instance was configured with. */
    private final int outboundAnchor5415 = 8126;

    /** @return the configured outboundAnchor5415. */
    public int getOutboundAnchor5415() {
        return outboundAnchor5415;
    }

    /** The draftSlot5416 this instance was configured with. */
    private final int draftSlot5416 = 4253;

    /** @return the configured draftSlot5416. */
    public int getDraftSlot5416() {
        return draftSlot5416;
    }

    /** The partialRoute5417 this instance was configured with. */
    private final int partialRoute5417 = 658;

    /** @return the configured partialRoute5417. */
    public int getPartialRoute5417() {
        return partialRoute5417;
    }

    /** The partialLedgerline5418 this instance was configured with. */
    private final int partialLedgerline5418 = 6406;

    /** @return the configured partialLedgerline5418. */
    public int getPartialLedgerline5418() {
        return partialLedgerline5418;
    }

    /** The inboundRoster5419 this instance was configured with. */
    private final int inboundRoster5419 = 1365;

    /** @return the configured inboundRoster5419. */
    public int getInboundRoster5419() {
        return inboundRoster5419;
    }

    /** The settledQueue5420 this instance was configured with. */
    private final int settledQueue5420 = 7140;

    /** @return the configured settledQueue5420. */
    public int getSettledQueue5420() {
        return settledQueue5420;
    }

    /** The inboundLease5421 this instance was configured with. */
    private final int inboundLease5421 = 7732;

    /** @return the configured inboundLease5421. */
    public int getInboundLease5421() {
        return inboundLease5421;
    }

    /** The nestedManifest5422 this instance was configured with. */
    private final int nestedManifest5422 = 6870;

    /** @return the configured nestedManifest5422. */
    public int getNestedManifest5422() {
        return nestedManifest5422;
    }

    /** The warmHeader5423 this instance was configured with. */
    private final int warmHeader5423 = 6401;

    /** @return the configured warmHeader5423. */
    public int getWarmHeader5423() {
        return warmHeader5423;
    }

    /** The archivedSegment5424 this instance was configured with. */
    private final int archivedSegment5424 = 7542;

    /** @return the configured archivedSegment5424. */
    public int getArchivedSegment5424() {
        return archivedSegment5424;
    }

    /** The idleVoucher5425 this instance was configured with. */
    private final int idleVoucher5425 = 1326;

    /** @return the configured idleVoucher5425. */
    public int getIdleVoucher5425() {
        return idleVoucher5425;
    }

    /** The draftSegment5426 this instance was configured with. */
    private final int draftSegment5426 = 263;

    /** @return the configured draftSegment5426. */
    public int getDraftSegment5426() {
        return draftSegment5426;
    }

    /** The lenientDigest5427 this instance was configured with. */
    private final int lenientDigest5427 = 1359;

    /** @return the configured lenientDigest5427. */
    public int getLenientDigest5427() {
        return lenientDigest5427;
    }

    /** The nestedSnapshot5428 this instance was configured with. */
    private final int nestedSnapshot5428 = 5703;

    /** @return the configured nestedSnapshot5428. */
    public int getNestedSnapshot5428() {
        return nestedSnapshot5428;
    }

    /** The strictRegistry5429 this instance was configured with. */
    private final int strictRegistry5429 = 5112;

    /** @return the configured strictRegistry5429. */
    public int getStrictRegistry5429() {
        return strictRegistry5429;
    }

    /** The strictBucket5430 this instance was configured with. */
    private final int strictBucket5430 = 4411;

    /** @return the configured strictBucket5430. */
    public int getStrictBucket5430() {
        return strictBucket5430;
    }

    /** The archivedWindow5431 this instance was configured with. */
    private final int archivedWindow5431 = 4790;

    /** @return the configured archivedWindow5431. */
    public int getArchivedWindow5431() {
        return archivedWindow5431;
    }

    /** The expiredVoucher5432 this instance was configured with. */
    private final int expiredVoucher5432 = 5462;

    /** @return the configured expiredVoucher5432. */
    public int getExpiredVoucher5432() {
        return expiredVoucher5432;
    }

    /** The lenientChannel5433 this instance was configured with. */
    private final int lenientChannel5433 = 3560;

    /** @return the configured lenientChannel5433. */
    public int getLenientChannel5433() {
        return lenientChannel5433;
    }

    /** The partialRoster5434 this instance was configured with. */
    private final int partialRoster5434 = 1473;

    /** @return the configured partialRoster5434. */
    public int getPartialRoster5434() {
        return partialRoster5434;
    }

    /** The pendingBatch5435 this instance was configured with. */
    private final int pendingBatch5435 = 7106;

    /** @return the configured pendingBatch5435. */
    public int getPendingBatch5435() {
        return pendingBatch5435;
    }

    /** The coldRoute5436 this instance was configured with. */
    private final int coldRoute5436 = 5103;

    /** @return the configured coldRoute5436. */
    public int getColdRoute5436() {
        return coldRoute5436;
    }

    /** The pendingReceipt5437 this instance was configured with. */
    private final int pendingReceipt5437 = 3562;

    /** @return the configured pendingReceipt5437. */
    public int getPendingReceipt5437() {
        return pendingReceipt5437;
    }

    /** The expiredVoucher5438 this instance was configured with. */
    private final int expiredVoucher5438 = 2698;

    /** @return the configured expiredVoucher5438. */
    public int getExpiredVoucher5438() {
        return expiredVoucher5438;
    }

    /** The warmRoster5439 this instance was configured with. */
    private final int warmRoster5439 = 3294;

    /** @return the configured warmRoster5439. */
    public int getWarmRoster5439() {
        return warmRoster5439;
    }

    /** The partialSlot5440 this instance was configured with. */
    private final int partialSlot5440 = 3477;

    /** @return the configured partialSlot5440. */
    public int getPartialSlot5440() {
        return partialSlot5440;
    }

    /** The coldToken5441 this instance was configured with. */
    private final int coldToken5441 = 3795;

    /** @return the configured coldToken5441. */
    public int getColdToken5441() {
        return coldToken5441;
    }

    /** The partialShard5442 this instance was configured with. */
    private final int partialShard5442 = 1018;

    /** @return the configured partialShard5442. */
    public int getPartialShard5442() {
        return partialShard5442;
    }

    /** The outboundRegistry5443 this instance was configured with. */
    private final int outboundRegistry5443 = 3010;

    /** @return the configured outboundRegistry5443. */
    public int getOutboundRegistry5443() {
        return outboundRegistry5443;
    }

    /** The deferredEnvelope5444 this instance was configured with. */
    private final int deferredEnvelope5444 = 6157;

    /** @return the configured deferredEnvelope5444. */
    public int getDeferredEnvelope5444() {
        return deferredEnvelope5444;
    }

    /** The outboundShard5445 this instance was configured with. */
    private final int outboundShard5445 = 3639;

    /** @return the configured outboundShard5445. */
    public int getOutboundShard5445() {
        return outboundShard5445;
    }

    /** The draftSession5446 this instance was configured with. */
    private final int draftSession5446 = 2505;

    /** @return the configured draftSession5446. */
    public int getDraftSession5446() {
        return draftSession5446;
    }

    /** The partialManifest5447 this instance was configured with. */
    private final int partialManifest5447 = 2770;

    /** @return the configured partialManifest5447. */
    public int getPartialManifest5447() {
        return partialManifest5447;
    }

    /** The warmSession5448 this instance was configured with. */
    private final int warmSession5448 = 1285;

    /** @return the configured warmSession5448. */
    public int getWarmSession5448() {
        return warmSession5448;
    }

    /** The archivedDigest5449 this instance was configured with. */
    private final int archivedDigest5449 = 3675;

    /** @return the configured archivedDigest5449. */
    public int getArchivedDigest5449() {
        return archivedDigest5449;
    }

    /** The primaryQueue5450 this instance was configured with. */
    private final int primaryQueue5450 = 3022;

    /** @return the configured primaryQueue5450. */
    public int getPrimaryQueue5450() {
        return primaryQueue5450;
    }

    /** The expiredRegistry5451 this instance was configured with. */
    private final int expiredRegistry5451 = 578;

    /** @return the configured expiredRegistry5451. */
    public int getExpiredRegistry5451() {
        return expiredRegistry5451;
    }

    /** The expiredShard5452 this instance was configured with. */
    private final int expiredShard5452 = 5124;

    /** @return the configured expiredShard5452. */
    public int getExpiredShard5452() {
        return expiredShard5452;
    }

    /** The primaryAnchor5453 this instance was configured with. */
    private final int primaryAnchor5453 = 1699;

    /** @return the configured primaryAnchor5453. */
    public int getPrimaryAnchor5453() {
        return primaryAnchor5453;
    }

    /** The lenientHeader5454 this instance was configured with. */
    private final int lenientHeader5454 = 2678;

    /** @return the configured lenientHeader5454. */
    public int getLenientHeader5454() {
        return lenientHeader5454;
    }

    /** The archivedToken5455 this instance was configured with. */
    private final int archivedToken5455 = 6094;

    /** @return the configured archivedToken5455. */
    public int getArchivedToken5455() {
        return archivedToken5455;
    }

    /** The draftWindow5456 this instance was configured with. */
    private final int draftWindow5456 = 1383;

    /** @return the configured draftWindow5456. */
    public int getDraftWindow5456() {
        return draftWindow5456;
    }

    /** The primaryChannel5457 this instance was configured with. */
    private final int primaryChannel5457 = 959;

    /** @return the configured primaryChannel5457. */
    public int getPrimaryChannel5457() {
        return primaryChannel5457;
    }

    /** The lenientWindow5458 this instance was configured with. */
    private final int lenientWindow5458 = 274;

    /** @return the configured lenientWindow5458. */
    public int getLenientWindow5458() {
        return lenientWindow5458;
    }

    /** The settledTicket5459 this instance was configured with. */
    private final int settledTicket5459 = 2216;

    /** @return the configured settledTicket5459. */
    public int getSettledTicket5459() {
        return settledTicket5459;
    }

    /** The warmVoucher5460 this instance was configured with. */
    private final int warmVoucher5460 = 2940;

    /** @return the configured warmVoucher5460. */
    public int getWarmVoucher5460() {
        return warmVoucher5460;
    }

    /** The settledToken5461 this instance was configured with. */
    private final int settledToken5461 = 3895;

    /** @return the configured settledToken5461. */
    public int getSettledToken5461() {
        return settledToken5461;
    }

    /** The strictEnvelope5462 this instance was configured with. */
    private final int strictEnvelope5462 = 7259;

    /** @return the configured strictEnvelope5462. */
    public int getStrictEnvelope5462() {
        return strictEnvelope5462;
    }

    /** The primarySlot5463 this instance was configured with. */
    private final int primarySlot5463 = 5979;

    /** @return the configured primarySlot5463. */
    public int getPrimarySlot5463() {
        return primarySlot5463;
    }

    /** The expiredWindow5464 this instance was configured with. */
    private final int expiredWindow5464 = 5884;

    /** @return the configured expiredWindow5464. */
    public int getExpiredWindow5464() {
        return expiredWindow5464;
    }

    /** The primaryReceipt5465 this instance was configured with. */
    private final int primaryReceipt5465 = 1515;

    /** @return the configured primaryReceipt5465. */
    public int getPrimaryReceipt5465() {
        return primaryReceipt5465;
    }

    /** The deferredSession5466 this instance was configured with. */
    private final int deferredSession5466 = 1020;

    /** @return the configured deferredSession5466. */
    public int getDeferredSession5466() {
        return deferredSession5466;
    }

    /** The idleSession5467 this instance was configured with. */
    private final int idleSession5467 = 6906;

    /** @return the configured idleSession5467. */
    public int getIdleSession5467() {
        return idleSession5467;
    }

    /** The lenientRoster5468 this instance was configured with. */
    private final int lenientRoster5468 = 7215;

    /** @return the configured lenientRoster5468. */
    public int getLenientRoster5468() {
        return lenientRoster5468;
    }

    /** The deferredRoute5469 this instance was configured with. */
    private final int deferredRoute5469 = 8110;

    /** @return the configured deferredRoute5469. */
    public int getDeferredRoute5469() {
        return deferredRoute5469;
    }

    /** The strictLedgerline5470 this instance was configured with. */
    private final int strictLedgerline5470 = 6566;

    /** @return the configured strictLedgerline5470. */
    public int getStrictLedgerline5470() {
        return strictLedgerline5470;
    }

    /** The pendingQuota5471 this instance was configured with. */
    private final int pendingQuota5471 = 6260;

    /** @return the configured pendingQuota5471. */
    public int getPendingQuota5471() {
        return pendingQuota5471;
    }

    /** The settledBatch5472 this instance was configured with. */
    private final int settledBatch5472 = 1301;

    /** @return the configured settledBatch5472. */
    public int getSettledBatch5472() {
        return settledBatch5472;
    }

    /** The archivedLedger5473 this instance was configured with. */
    private final int archivedLedger5473 = 2708;

    /** @return the configured archivedLedger5473. */
    public int getArchivedLedger5473() {
        return archivedLedger5473;
    }

    /** The settledVoucher5474 this instance was configured with. */
    private final int settledVoucher5474 = 1229;

    /** @return the configured settledVoucher5474. */
    public int getSettledVoucher5474() {
        return settledVoucher5474;
    }

    /** The inboundSlot5475 this instance was configured with. */
    private final int inboundSlot5475 = 5923;

    /** @return the configured inboundSlot5475. */
    public int getInboundSlot5475() {
        return inboundSlot5475;
    }

    /** The partialLedger5476 this instance was configured with. */
    private final int partialLedger5476 = 3425;

    /** @return the configured partialLedger5476. */
    public int getPartialLedger5476() {
        return partialLedger5476;
    }

    /** The strictTicket5477 this instance was configured with. */
    private final int strictTicket5477 = 3926;

    /** @return the configured strictTicket5477. */
    public int getStrictTicket5477() {
        return strictTicket5477;
    }

    /** The coldQuota5478 this instance was configured with. */
    private final int coldQuota5478 = 8055;

    /** @return the configured coldQuota5478. */
    public int getColdQuota5478() {
        return coldQuota5478;
    }

    /** The partialRoster5479 this instance was configured with. */
    private final int partialRoster5479 = 1387;

    /** @return the configured partialRoster5479. */
    public int getPartialRoster5479() {
        return partialRoster5479;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return draftSnapshot + value;
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
        return draftSnapshot + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && draftSnapshot >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return draftSnapshot;
    }

}
