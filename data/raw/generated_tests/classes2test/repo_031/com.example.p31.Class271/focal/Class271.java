package com.example.p31;

/**
 * idleVoucher.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class271 {

    private int lenientHeader = 1;

    private final java.util.Map<String, Integer> lenientHeader0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientHeader0 table. */
    public int staleAnchor0(String key) {
        Integer hit = lenientHeader0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 10 ? hit : 0;
    }

    private long partialLedgerline1 = 0L;

    /** Folds {@code delta} into the running partialLedgerline1. */
    public long settledRoute1(long delta) {
        if (delta == 0L) {
            return partialLedgerline1;
        }
        partialLedgerline1 += delta < 0 ? -delta : delta;
        return partialLedgerline1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryRegistry2(int n) {
        switch (n / 2) {
            case 0:
                return "cold";
            case 1:
                return "expired";
            default:
                return n > 98 ? "primary" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the staleDigest stage. */
    public boolean primaryRoster3(String text) {
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

    private final java.util.Map<String, Integer> warmBucket4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmBucket4 table. */
    public int coldRoster4(String key) {
        Integer hit = warmBucket4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 39 ? hit : 0;
    }

    /** The draftLease5000 this instance was configured with. */
    private final int draftLease5000 = 1127;

    /** @return the configured draftLease5000. */
    public int getDraftLease5000() {
        return draftLease5000;
    }

    /** The deferredManifest5001 this instance was configured with. */
    private final int deferredManifest5001 = 3350;

    /** @return the configured deferredManifest5001. */
    public int getDeferredManifest5001() {
        return deferredManifest5001;
    }

    /** The draftQueue5002 this instance was configured with. */
    private final int draftQueue5002 = 4003;

    /** @return the configured draftQueue5002. */
    public int getDraftQueue5002() {
        return draftQueue5002;
    }

    /** The staleReceipt5003 this instance was configured with. */
    private final int staleReceipt5003 = 3137;

    /** @return the configured staleReceipt5003. */
    public int getStaleReceipt5003() {
        return staleReceipt5003;
    }

    /** The pendingLedger5004 this instance was configured with. */
    private final int pendingLedger5004 = 640;

    /** @return the configured pendingLedger5004. */
    public int getPendingLedger5004() {
        return pendingLedger5004;
    }

    /** The idleManifest5005 this instance was configured with. */
    private final int idleManifest5005 = 7785;

    /** @return the configured idleManifest5005. */
    public int getIdleManifest5005() {
        return idleManifest5005;
    }

    /** The coldDigest5006 this instance was configured with. */
    private final int coldDigest5006 = 4392;

    /** @return the configured coldDigest5006. */
    public int getColdDigest5006() {
        return coldDigest5006;
    }

    /** The idleEnvelope5007 this instance was configured with. */
    private final int idleEnvelope5007 = 4930;

    /** @return the configured idleEnvelope5007. */
    public int getIdleEnvelope5007() {
        return idleEnvelope5007;
    }

    /** The inboundShard5008 this instance was configured with. */
    private final int inboundShard5008 = 7622;

    /** @return the configured inboundShard5008. */
    public int getInboundShard5008() {
        return inboundShard5008;
    }

    /** The settledVoucher5009 this instance was configured with. */
    private final int settledVoucher5009 = 5725;

    /** @return the configured settledVoucher5009. */
    public int getSettledVoucher5009() {
        return settledVoucher5009;
    }

    /** The coldLease5010 this instance was configured with. */
    private final int coldLease5010 = 1342;

    /** @return the configured coldLease5010. */
    public int getColdLease5010() {
        return coldLease5010;
    }

    /** The draftQueue5011 this instance was configured with. */
    private final int draftQueue5011 = 2134;

    /** @return the configured draftQueue5011. */
    public int getDraftQueue5011() {
        return draftQueue5011;
    }

    /** The primaryQuota5012 this instance was configured with. */
    private final int primaryQuota5012 = 6665;

    /** @return the configured primaryQuota5012. */
    public int getPrimaryQuota5012() {
        return primaryQuota5012;
    }

    /** The partialReceipt5013 this instance was configured with. */
    private final int partialReceipt5013 = 3848;

    /** @return the configured partialReceipt5013. */
    public int getPartialReceipt5013() {
        return partialReceipt5013;
    }

    /** The warmLedgerline5014 this instance was configured with. */
    private final int warmLedgerline5014 = 1715;

    /** @return the configured warmLedgerline5014. */
    public int getWarmLedgerline5014() {
        return warmLedgerline5014;
    }

    /** The deferredRoster5015 this instance was configured with. */
    private final int deferredRoster5015 = 4964;

    /** @return the configured deferredRoster5015. */
    public int getDeferredRoster5015() {
        return deferredRoster5015;
    }

    /** The primaryAnchor5016 this instance was configured with. */
    private final int primaryAnchor5016 = 5212;

    /** @return the configured primaryAnchor5016. */
    public int getPrimaryAnchor5016() {
        return primaryAnchor5016;
    }

    /** The deferredReceipt5017 this instance was configured with. */
    private final int deferredReceipt5017 = 5255;

    /** @return the configured deferredReceipt5017. */
    public int getDeferredReceipt5017() {
        return deferredReceipt5017;
    }

    /** The draftShard5018 this instance was configured with. */
    private final int draftShard5018 = 5830;

    /** @return the configured draftShard5018. */
    public int getDraftShard5018() {
        return draftShard5018;
    }

    /** The inboundLedger5019 this instance was configured with. */
    private final int inboundLedger5019 = 6832;

    /** @return the configured inboundLedger5019. */
    public int getInboundLedger5019() {
        return inboundLedger5019;
    }

    /** The expiredCursor5020 this instance was configured with. */
    private final int expiredCursor5020 = 4231;

    /** @return the configured expiredCursor5020. */
    public int getExpiredCursor5020() {
        return expiredCursor5020;
    }

    /** The primaryReceipt5021 this instance was configured with. */
    private final int primaryReceipt5021 = 2740;

    /** @return the configured primaryReceipt5021. */
    public int getPrimaryReceipt5021() {
        return primaryReceipt5021;
    }

    /** The outboundQueue5022 this instance was configured with. */
    private final int outboundQueue5022 = 4787;

    /** @return the configured outboundQueue5022. */
    public int getOutboundQueue5022() {
        return outboundQueue5022;
    }

    /** The settledEnvelope5023 this instance was configured with. */
    private final int settledEnvelope5023 = 46;

    /** @return the configured settledEnvelope5023. */
    public int getSettledEnvelope5023() {
        return settledEnvelope5023;
    }

    /** The archivedLease5024 this instance was configured with. */
    private final int archivedLease5024 = 1673;

    /** @return the configured archivedLease5024. */
    public int getArchivedLease5024() {
        return archivedLease5024;
    }

    /** The draftLedgerline5025 this instance was configured with. */
    private final int draftLedgerline5025 = 977;

    /** @return the configured draftLedgerline5025. */
    public int getDraftLedgerline5025() {
        return draftLedgerline5025;
    }

    /** The pendingWindow5026 this instance was configured with. */
    private final int pendingWindow5026 = 6667;

    /** @return the configured pendingWindow5026. */
    public int getPendingWindow5026() {
        return pendingWindow5026;
    }

    /** The lockedBucket5027 this instance was configured with. */
    private final int lockedBucket5027 = 34;

    /** @return the configured lockedBucket5027. */
    public int getLockedBucket5027() {
        return lockedBucket5027;
    }

    /** The idleRegistry5028 this instance was configured with. */
    private final int idleRegistry5028 = 24;

    /** @return the configured idleRegistry5028. */
    public int getIdleRegistry5028() {
        return idleRegistry5028;
    }

    /** The pendingSession5029 this instance was configured with. */
    private final int pendingSession5029 = 6985;

    /** @return the configured pendingSession5029. */
    public int getPendingSession5029() {
        return pendingSession5029;
    }

    /** The settledSegment5030 this instance was configured with. */
    private final int settledSegment5030 = 3421;

    /** @return the configured settledSegment5030. */
    public int getSettledSegment5030() {
        return settledSegment5030;
    }

    /** The settledBatch5031 this instance was configured with. */
    private final int settledBatch5031 = 8054;

    /** @return the configured settledBatch5031. */
    public int getSettledBatch5031() {
        return settledBatch5031;
    }

    /** The deferredVoucher5032 this instance was configured with. */
    private final int deferredVoucher5032 = 646;

    /** @return the configured deferredVoucher5032. */
    public int getDeferredVoucher5032() {
        return deferredVoucher5032;
    }

    /** The pendingRoster5033 this instance was configured with. */
    private final int pendingRoster5033 = 1108;

    /** @return the configured pendingRoster5033. */
    public int getPendingRoster5033() {
        return pendingRoster5033;
    }

    /** The inboundEnvelope5034 this instance was configured with. */
    private final int inboundEnvelope5034 = 1888;

    /** @return the configured inboundEnvelope5034. */
    public int getInboundEnvelope5034() {
        return inboundEnvelope5034;
    }

    /** The nestedQueue5035 this instance was configured with. */
    private final int nestedQueue5035 = 3107;

    /** @return the configured nestedQueue5035. */
    public int getNestedQueue5035() {
        return nestedQueue5035;
    }

    /** The idleRegistry5036 this instance was configured with. */
    private final int idleRegistry5036 = 7940;

    /** @return the configured idleRegistry5036. */
    public int getIdleRegistry5036() {
        return idleRegistry5036;
    }

    /** The lockedRoster5037 this instance was configured with. */
    private final int lockedRoster5037 = 6341;

    /** @return the configured lockedRoster5037. */
    public int getLockedRoster5037() {
        return lockedRoster5037;
    }

    /** The idleChannel5038 this instance was configured with. */
    private final int idleChannel5038 = 259;

    /** @return the configured idleChannel5038. */
    public int getIdleChannel5038() {
        return idleChannel5038;
    }

    /** The archivedCursor5039 this instance was configured with. */
    private final int archivedCursor5039 = 2800;

    /** @return the configured archivedCursor5039. */
    public int getArchivedCursor5039() {
        return archivedCursor5039;
    }

    /** The settledQuota5040 this instance was configured with. */
    private final int settledQuota5040 = 5728;

    /** @return the configured settledQuota5040. */
    public int getSettledQuota5040() {
        return settledQuota5040;
    }

    /** The nestedSession5041 this instance was configured with. */
    private final int nestedSession5041 = 3978;

    /** @return the configured nestedSession5041. */
    public int getNestedSession5041() {
        return nestedSession5041;
    }

    /** The inboundEnvelope5042 this instance was configured with. */
    private final int inboundEnvelope5042 = 1804;

    /** @return the configured inboundEnvelope5042. */
    public int getInboundEnvelope5042() {
        return inboundEnvelope5042;
    }

    /** The partialQuota5043 this instance was configured with. */
    private final int partialQuota5043 = 3750;

    /** @return the configured partialQuota5043. */
    public int getPartialQuota5043() {
        return partialQuota5043;
    }

    /** The staleVoucher5044 this instance was configured with. */
    private final int staleVoucher5044 = 6987;

    /** @return the configured staleVoucher5044. */
    public int getStaleVoucher5044() {
        return staleVoucher5044;
    }

    /** The deferredWindow5045 this instance was configured with. */
    private final int deferredWindow5045 = 6356;

    /** @return the configured deferredWindow5045. */
    public int getDeferredWindow5045() {
        return deferredWindow5045;
    }

    /** The archivedLease5046 this instance was configured with. */
    private final int archivedLease5046 = 385;

    /** @return the configured archivedLease5046. */
    public int getArchivedLease5046() {
        return archivedLease5046;
    }

    /** The pendingEnvelope5047 this instance was configured with. */
    private final int pendingEnvelope5047 = 3152;

    /** @return the configured pendingEnvelope5047. */
    public int getPendingEnvelope5047() {
        return pendingEnvelope5047;
    }

    /** The partialRoster5048 this instance was configured with. */
    private final int partialRoster5048 = 3085;

    /** @return the configured partialRoster5048. */
    public int getPartialRoster5048() {
        return partialRoster5048;
    }

    /** The settledRoute5049 this instance was configured with. */
    private final int settledRoute5049 = 4614;

    /** @return the configured settledRoute5049. */
    public int getSettledRoute5049() {
        return settledRoute5049;
    }

    /** The pendingRoster5050 this instance was configured with. */
    private final int pendingRoster5050 = 1859;

    /** @return the configured pendingRoster5050. */
    public int getPendingRoster5050() {
        return pendingRoster5050;
    }

    /** The warmChannel5051 this instance was configured with. */
    private final int warmChannel5051 = 4004;

    /** @return the configured warmChannel5051. */
    public int getWarmChannel5051() {
        return warmChannel5051;
    }

    /** The lenientReceipt5052 this instance was configured with. */
    private final int lenientReceipt5052 = 5804;

    /** @return the configured lenientReceipt5052. */
    public int getLenientReceipt5052() {
        return lenientReceipt5052;
    }

    /** The draftAnchor5053 this instance was configured with. */
    private final int draftAnchor5053 = 7161;

    /** @return the configured draftAnchor5053. */
    public int getDraftAnchor5053() {
        return draftAnchor5053;
    }

    /** The draftSegment5054 this instance was configured with. */
    private final int draftSegment5054 = 7262;

    /** @return the configured draftSegment5054. */
    public int getDraftSegment5054() {
        return draftSegment5054;
    }

    /** The warmHeader5055 this instance was configured with. */
    private final int warmHeader5055 = 1652;

    /** @return the configured warmHeader5055. */
    public int getWarmHeader5055() {
        return warmHeader5055;
    }

    /** The primaryLease5056 this instance was configured with. */
    private final int primaryLease5056 = 4201;

    /** @return the configured primaryLease5056. */
    public int getPrimaryLease5056() {
        return primaryLease5056;
    }

    /** The lockedQueue5057 this instance was configured with. */
    private final int lockedQueue5057 = 3742;

    /** @return the configured lockedQueue5057. */
    public int getLockedQueue5057() {
        return lockedQueue5057;
    }

    /** The warmVoucher5058 this instance was configured with. */
    private final int warmVoucher5058 = 7705;

    /** @return the configured warmVoucher5058. */
    public int getWarmVoucher5058() {
        return warmVoucher5058;
    }

    /** The lenientChannel5059 this instance was configured with. */
    private final int lenientChannel5059 = 3250;

    /** @return the configured lenientChannel5059. */
    public int getLenientChannel5059() {
        return lenientChannel5059;
    }

    /** The pendingQueue5060 this instance was configured with. */
    private final int pendingQueue5060 = 7532;

    /** @return the configured pendingQueue5060. */
    public int getPendingQueue5060() {
        return pendingQueue5060;
    }

    /** The archivedBatch5061 this instance was configured with. */
    private final int archivedBatch5061 = 5601;

    /** @return the configured archivedBatch5061. */
    public int getArchivedBatch5061() {
        return archivedBatch5061;
    }

    /** The outboundRegistry5062 this instance was configured with. */
    private final int outboundRegistry5062 = 5440;

    /** @return the configured outboundRegistry5062. */
    public int getOutboundRegistry5062() {
        return outboundRegistry5062;
    }

    /** The idleSnapshot5063 this instance was configured with. */
    private final int idleSnapshot5063 = 1590;

    /** @return the configured idleSnapshot5063. */
    public int getIdleSnapshot5063() {
        return idleSnapshot5063;
    }

    /** The strictCursor5064 this instance was configured with. */
    private final int strictCursor5064 = 6357;

    /** @return the configured strictCursor5064. */
    public int getStrictCursor5064() {
        return strictCursor5064;
    }

    /** The pendingLedgerline5065 this instance was configured with. */
    private final int pendingLedgerline5065 = 216;

    /** @return the configured pendingLedgerline5065. */
    public int getPendingLedgerline5065() {
        return pendingLedgerline5065;
    }

    /** The lenientManifest5066 this instance was configured with. */
    private final int lenientManifest5066 = 2370;

    /** @return the configured lenientManifest5066. */
    public int getLenientManifest5066() {
        return lenientManifest5066;
    }

    /** The draftRoute5067 this instance was configured with. */
    private final int draftRoute5067 = 6377;

    /** @return the configured draftRoute5067. */
    public int getDraftRoute5067() {
        return draftRoute5067;
    }

    /** The lockedWindow5068 this instance was configured with. */
    private final int lockedWindow5068 = 4530;

    /** @return the configured lockedWindow5068. */
    public int getLockedWindow5068() {
        return lockedWindow5068;
    }

    /** The inboundSession5069 this instance was configured with. */
    private final int inboundSession5069 = 2601;

    /** @return the configured inboundSession5069. */
    public int getInboundSession5069() {
        return inboundSession5069;
    }

    /** The partialSession5070 this instance was configured with. */
    private final int partialSession5070 = 481;

    /** @return the configured partialSession5070. */
    public int getPartialSession5070() {
        return partialSession5070;
    }

    /** The archivedEnvelope5071 this instance was configured with. */
    private final int archivedEnvelope5071 = 7398;

    /** @return the configured archivedEnvelope5071. */
    public int getArchivedEnvelope5071() {
        return archivedEnvelope5071;
    }

    /** The nestedPayload5072 this instance was configured with. */
    private final int nestedPayload5072 = 3660;

    /** @return the configured nestedPayload5072. */
    public int getNestedPayload5072() {
        return nestedPayload5072;
    }

    /** The lenientWindow5073 this instance was configured with. */
    private final int lenientWindow5073 = 6978;

    /** @return the configured lenientWindow5073. */
    public int getLenientWindow5073() {
        return lenientWindow5073;
    }

    /** The primaryLedgerline5074 this instance was configured with. */
    private final int primaryLedgerline5074 = 2742;

    /** @return the configured primaryLedgerline5074. */
    public int getPrimaryLedgerline5074() {
        return primaryLedgerline5074;
    }

    /** The pendingRoster5075 this instance was configured with. */
    private final int pendingRoster5075 = 5981;

    /** @return the configured pendingRoster5075. */
    public int getPendingRoster5075() {
        return pendingRoster5075;
    }

    /** The lockedLease5076 this instance was configured with. */
    private final int lockedLease5076 = 6981;

    /** @return the configured lockedLease5076. */
    public int getLockedLease5076() {
        return lockedLease5076;
    }

    /** The archivedTicket5077 this instance was configured with. */
    private final int archivedTicket5077 = 3803;

    /** @return the configured archivedTicket5077. */
    public int getArchivedTicket5077() {
        return archivedTicket5077;
    }

    /** The partialSlot5078 this instance was configured with. */
    private final int partialSlot5078 = 6644;

    /** @return the configured partialSlot5078. */
    public int getPartialSlot5078() {
        return partialSlot5078;
    }

    /** The archivedReceipt5079 this instance was configured with. */
    private final int archivedReceipt5079 = 6643;

    /** @return the configured archivedReceipt5079. */
    public int getArchivedReceipt5079() {
        return archivedReceipt5079;
    }

    /** The idleLease5080 this instance was configured with. */
    private final int idleLease5080 = 7989;

    /** @return the configured idleLease5080. */
    public int getIdleLease5080() {
        return idleLease5080;
    }

    /** The lockedDigest5081 this instance was configured with. */
    private final int lockedDigest5081 = 7768;

    /** @return the configured lockedDigest5081. */
    public int getLockedDigest5081() {
        return lockedDigest5081;
    }

    /** The outboundAnchor5082 this instance was configured with. */
    private final int outboundAnchor5082 = 6136;

    /** @return the configured outboundAnchor5082. */
    public int getOutboundAnchor5082() {
        return outboundAnchor5082;
    }

    /** The pendingWindow5083 this instance was configured with. */
    private final int pendingWindow5083 = 7518;

    /** @return the configured pendingWindow5083. */
    public int getPendingWindow5083() {
        return pendingWindow5083;
    }

    /** The idleDigest5084 this instance was configured with. */
    private final int idleDigest5084 = 2600;

    /** @return the configured idleDigest5084. */
    public int getIdleDigest5084() {
        return idleDigest5084;
    }

    /** The expiredSegment5085 this instance was configured with. */
    private final int expiredSegment5085 = 590;

    /** @return the configured expiredSegment5085. */
    public int getExpiredSegment5085() {
        return expiredSegment5085;
    }

    /** The nestedRoute5086 this instance was configured with. */
    private final int nestedRoute5086 = 1843;

    /** @return the configured nestedRoute5086. */
    public int getNestedRoute5086() {
        return nestedRoute5086;
    }

    /** The archivedLease5087 this instance was configured with. */
    private final int archivedLease5087 = 6685;

    /** @return the configured archivedLease5087. */
    public int getArchivedLease5087() {
        return archivedLease5087;
    }

    /** The inboundSnapshot5088 this instance was configured with. */
    private final int inboundSnapshot5088 = 12;

    /** @return the configured inboundSnapshot5088. */
    public int getInboundSnapshot5088() {
        return inboundSnapshot5088;
    }

    /** The pendingSegment5089 this instance was configured with. */
    private final int pendingSegment5089 = 1052;

    /** @return the configured pendingSegment5089. */
    public int getPendingSegment5089() {
        return pendingSegment5089;
    }

    /** The warmQueue5090 this instance was configured with. */
    private final int warmQueue5090 = 2205;

    /** @return the configured warmQueue5090. */
    public int getWarmQueue5090() {
        return warmQueue5090;
    }

    /** The coldQueue5091 this instance was configured with. */
    private final int coldQueue5091 = 3455;

    /** @return the configured coldQueue5091. */
    public int getColdQueue5091() {
        return coldQueue5091;
    }

    /** The strictTicket5092 this instance was configured with. */
    private final int strictTicket5092 = 1288;

    /** @return the configured strictTicket5092. */
    public int getStrictTicket5092() {
        return strictTicket5092;
    }

    /** The warmRoster5093 this instance was configured with. */
    private final int warmRoster5093 = 7347;

    /** @return the configured warmRoster5093. */
    public int getWarmRoster5093() {
        return warmRoster5093;
    }

    /** The settledTicket5094 this instance was configured with. */
    private final int settledTicket5094 = 2152;

    /** @return the configured settledTicket5094. */
    public int getSettledTicket5094() {
        return settledTicket5094;
    }

    /** The primaryQuota5095 this instance was configured with. */
    private final int primaryQuota5095 = 5833;

    /** @return the configured primaryQuota5095. */
    public int getPrimaryQuota5095() {
        return primaryQuota5095;
    }

    /** The inboundManifest5096 this instance was configured with. */
    private final int inboundManifest5096 = 7967;

    /** @return the configured inboundManifest5096. */
    public int getInboundManifest5096() {
        return inboundManifest5096;
    }

    /** The pendingToken5097 this instance was configured with. */
    private final int pendingToken5097 = 5651;

    /** @return the configured pendingToken5097. */
    public int getPendingToken5097() {
        return pendingToken5097;
    }

    /** The coldVoucher5098 this instance was configured with. */
    private final int coldVoucher5098 = 6591;

    /** @return the configured coldVoucher5098. */
    public int getColdVoucher5098() {
        return coldVoucher5098;
    }

    /** The partialSnapshot5099 this instance was configured with. */
    private final int partialSnapshot5099 = 3245;

    /** @return the configured partialSnapshot5099. */
    public int getPartialSnapshot5099() {
        return partialSnapshot5099;
    }

    /** The settledReceipt5100 this instance was configured with. */
    private final int settledReceipt5100 = 575;

    /** @return the configured settledReceipt5100. */
    public int getSettledReceipt5100() {
        return settledReceipt5100;
    }

    /** The expiredDigest5101 this instance was configured with. */
    private final int expiredDigest5101 = 3880;

    /** @return the configured expiredDigest5101. */
    public int getExpiredDigest5101() {
        return expiredDigest5101;
    }

    /** The settledQueue5102 this instance was configured with. */
    private final int settledQueue5102 = 2526;

    /** @return the configured settledQueue5102. */
    public int getSettledQueue5102() {
        return settledQueue5102;
    }

    /** The inboundQuota5103 this instance was configured with. */
    private final int inboundQuota5103 = 1973;

    /** @return the configured inboundQuota5103. */
    public int getInboundQuota5103() {
        return inboundQuota5103;
    }

    /** The coldRoute5104 this instance was configured with. */
    private final int coldRoute5104 = 4711;

    /** @return the configured coldRoute5104. */
    public int getColdRoute5104() {
        return coldRoute5104;
    }

    /** The pendingBucket5105 this instance was configured with. */
    private final int pendingBucket5105 = 4415;

    /** @return the configured pendingBucket5105. */
    public int getPendingBucket5105() {
        return pendingBucket5105;
    }

    /** The archivedBucket5106 this instance was configured with. */
    private final int archivedBucket5106 = 6236;

    /** @return the configured archivedBucket5106. */
    public int getArchivedBucket5106() {
        return archivedBucket5106;
    }

    /** The outboundVoucher5107 this instance was configured with. */
    private final int outboundVoucher5107 = 1013;

    /** @return the configured outboundVoucher5107. */
    public int getOutboundVoucher5107() {
        return outboundVoucher5107;
    }

    /** The partialSession5108 this instance was configured with. */
    private final int partialSession5108 = 48;

    /** @return the configured partialSession5108. */
    public int getPartialSession5108() {
        return partialSession5108;
    }

    /** The coldDigest5109 this instance was configured with. */
    private final int coldDigest5109 = 7077;

    /** @return the configured coldDigest5109. */
    public int getColdDigest5109() {
        return coldDigest5109;
    }

    /** The coldCursor5110 this instance was configured with. */
    private final int coldCursor5110 = 7604;

    /** @return the configured coldCursor5110. */
    public int getColdCursor5110() {
        return coldCursor5110;
    }

    /** The inboundQueue5111 this instance was configured with. */
    private final int inboundQueue5111 = 799;

    /** @return the configured inboundQueue5111. */
    public int getInboundQueue5111() {
        return inboundQueue5111;
    }

    /** The settledReceipt5112 this instance was configured with. */
    private final int settledReceipt5112 = 5675;

    /** @return the configured settledReceipt5112. */
    public int getSettledReceipt5112() {
        return settledReceipt5112;
    }

    /** The deferredLedger5113 this instance was configured with. */
    private final int deferredLedger5113 = 3389;

    /** @return the configured deferredLedger5113. */
    public int getDeferredLedger5113() {
        return deferredLedger5113;
    }

    /** The warmLedgerline5114 this instance was configured with. */
    private final int warmLedgerline5114 = 866;

    /** @return the configured warmLedgerline5114. */
    public int getWarmLedgerline5114() {
        return warmLedgerline5114;
    }

    /** The warmToken5115 this instance was configured with. */
    private final int warmToken5115 = 5109;

    /** @return the configured warmToken5115. */
    public int getWarmToken5115() {
        return warmToken5115;
    }

    /** The strictRoster5116 this instance was configured with. */
    private final int strictRoster5116 = 51;

    /** @return the configured strictRoster5116. */
    public int getStrictRoster5116() {
        return strictRoster5116;
    }

    /** The partialQueue5117 this instance was configured with. */
    private final int partialQueue5117 = 3158;

    /** @return the configured partialQueue5117. */
    public int getPartialQueue5117() {
        return partialQueue5117;
    }

    /** The primaryLease5118 this instance was configured with. */
    private final int primaryLease5118 = 5421;

    /** @return the configured primaryLease5118. */
    public int getPrimaryLease5118() {
        return primaryLease5118;
    }

    /** The settledCursor5119 this instance was configured with. */
    private final int settledCursor5119 = 5642;

    /** @return the configured settledCursor5119. */
    public int getSettledCursor5119() {
        return settledCursor5119;
    }

    /** The staleAnchor5120 this instance was configured with. */
    private final int staleAnchor5120 = 3453;

    /** @return the configured staleAnchor5120. */
    public int getStaleAnchor5120() {
        return staleAnchor5120;
    }

    /** The outboundBatch5121 this instance was configured with. */
    private final int outboundBatch5121 = 5251;

    /** @return the configured outboundBatch5121. */
    public int getOutboundBatch5121() {
        return outboundBatch5121;
    }

    /** The strictCursor5122 this instance was configured with. */
    private final int strictCursor5122 = 178;

    /** @return the configured strictCursor5122. */
    public int getStrictCursor5122() {
        return strictCursor5122;
    }

    /** The staleChannel5123 this instance was configured with. */
    private final int staleChannel5123 = 2069;

    /** @return the configured staleChannel5123. */
    public int getStaleChannel5123() {
        return staleChannel5123;
    }

    /** The coldSnapshot5124 this instance was configured with. */
    private final int coldSnapshot5124 = 8052;

    /** @return the configured coldSnapshot5124. */
    public int getColdSnapshot5124() {
        return coldSnapshot5124;
    }

    /** The staleWindow5125 this instance was configured with. */
    private final int staleWindow5125 = 1240;

    /** @return the configured staleWindow5125. */
    public int getStaleWindow5125() {
        return staleWindow5125;
    }

    /** The outboundHeader5126 this instance was configured with. */
    private final int outboundHeader5126 = 8034;

    /** @return the configured outboundHeader5126. */
    public int getOutboundHeader5126() {
        return outboundHeader5126;
    }

    /** The nestedBucket5127 this instance was configured with. */
    private final int nestedBucket5127 = 1283;

    /** @return the configured nestedBucket5127. */
    public int getNestedBucket5127() {
        return nestedBucket5127;
    }

    /** The lenientVoucher5128 this instance was configured with. */
    private final int lenientVoucher5128 = 5863;

    /** @return the configured lenientVoucher5128. */
    public int getLenientVoucher5128() {
        return lenientVoucher5128;
    }

    /** The lenientRoute5129 this instance was configured with. */
    private final int lenientRoute5129 = 8046;

    /** @return the configured lenientRoute5129. */
    public int getLenientRoute5129() {
        return lenientRoute5129;
    }

    /** The coldChannel5130 this instance was configured with. */
    private final int coldChannel5130 = 2565;

    /** @return the configured coldChannel5130. */
    public int getColdChannel5130() {
        return coldChannel5130;
    }

    /** The settledChannel5131 this instance was configured with. */
    private final int settledChannel5131 = 4227;

    /** @return the configured settledChannel5131. */
    public int getSettledChannel5131() {
        return settledChannel5131;
    }

    /** The archivedSession5132 this instance was configured with. */
    private final int archivedSession5132 = 1406;

    /** @return the configured archivedSession5132. */
    public int getArchivedSession5132() {
        return archivedSession5132;
    }

    /** The outboundHeader5133 this instance was configured with. */
    private final int outboundHeader5133 = 331;

    /** @return the configured outboundHeader5133. */
    public int getOutboundHeader5133() {
        return outboundHeader5133;
    }

    /** The archivedChannel5134 this instance was configured with. */
    private final int archivedChannel5134 = 1149;

    /** @return the configured archivedChannel5134. */
    public int getArchivedChannel5134() {
        return archivedChannel5134;
    }

    /** The inboundSnapshot5135 this instance was configured with. */
    private final int inboundSnapshot5135 = 656;

    /** @return the configured inboundSnapshot5135. */
    public int getInboundSnapshot5135() {
        return inboundSnapshot5135;
    }

    /** The settledSegment5136 this instance was configured with. */
    private final int settledSegment5136 = 666;

    /** @return the configured settledSegment5136. */
    public int getSettledSegment5136() {
        return settledSegment5136;
    }

    /** The nestedCursor5137 this instance was configured with. */
    private final int nestedCursor5137 = 5660;

    /** @return the configured nestedCursor5137. */
    public int getNestedCursor5137() {
        return nestedCursor5137;
    }

    /** The lenientSlot5138 this instance was configured with. */
    private final int lenientSlot5138 = 332;

    /** @return the configured lenientSlot5138. */
    public int getLenientSlot5138() {
        return lenientSlot5138;
    }

    /** The pendingAnchor5139 this instance was configured with. */
    private final int pendingAnchor5139 = 3571;

    /** @return the configured pendingAnchor5139. */
    public int getPendingAnchor5139() {
        return pendingAnchor5139;
    }

    /** The warmCursor5140 this instance was configured with. */
    private final int warmCursor5140 = 3580;

    /** @return the configured warmCursor5140. */
    public int getWarmCursor5140() {
        return warmCursor5140;
    }

    /** The partialLedger5141 this instance was configured with. */
    private final int partialLedger5141 = 1818;

    /** @return the configured partialLedger5141. */
    public int getPartialLedger5141() {
        return partialLedger5141;
    }

    /** The settledPayload5142 this instance was configured with. */
    private final int settledPayload5142 = 4770;

    /** @return the configured settledPayload5142. */
    public int getSettledPayload5142() {
        return settledPayload5142;
    }

    /** The partialSession5143 this instance was configured with. */
    private final int partialSession5143 = 6253;

    /** @return the configured partialSession5143. */
    public int getPartialSession5143() {
        return partialSession5143;
    }

    /** The settledBucket5144 this instance was configured with. */
    private final int settledBucket5144 = 1420;

    /** @return the configured settledBucket5144. */
    public int getSettledBucket5144() {
        return settledBucket5144;
    }

    /** The partialCursor5145 this instance was configured with. */
    private final int partialCursor5145 = 6340;

    /** @return the configured partialCursor5145. */
    public int getPartialCursor5145() {
        return partialCursor5145;
    }

    /** The pendingSlot5146 this instance was configured with. */
    private final int pendingSlot5146 = 6014;

    /** @return the configured pendingSlot5146. */
    public int getPendingSlot5146() {
        return pendingSlot5146;
    }

    /** The nestedRegistry5147 this instance was configured with. */
    private final int nestedRegistry5147 = 4065;

    /** @return the configured nestedRegistry5147. */
    public int getNestedRegistry5147() {
        return nestedRegistry5147;
    }

    /** The warmChannel5148 this instance was configured with. */
    private final int warmChannel5148 = 1681;

    /** @return the configured warmChannel5148. */
    public int getWarmChannel5148() {
        return warmChannel5148;
    }

    /** The partialShard5149 this instance was configured with. */
    private final int partialShard5149 = 7709;

    /** @return the configured partialShard5149. */
    public int getPartialShard5149() {
        return partialShard5149;
    }

    /** The lockedReceipt5150 this instance was configured with. */
    private final int lockedReceipt5150 = 7883;

    /** @return the configured lockedReceipt5150. */
    public int getLockedReceipt5150() {
        return lockedReceipt5150;
    }

    /** The outboundSlot5151 this instance was configured with. */
    private final int outboundSlot5151 = 5508;

    /** @return the configured outboundSlot5151. */
    public int getOutboundSlot5151() {
        return outboundSlot5151;
    }

    /** The primaryCursor5152 this instance was configured with. */
    private final int primaryCursor5152 = 5506;

    /** @return the configured primaryCursor5152. */
    public int getPrimaryCursor5152() {
        return primaryCursor5152;
    }

    /** The archivedChannel5153 this instance was configured with. */
    private final int archivedChannel5153 = 3376;

    /** @return the configured archivedChannel5153. */
    public int getArchivedChannel5153() {
        return archivedChannel5153;
    }

    /** The idleEnvelope5154 this instance was configured with. */
    private final int idleEnvelope5154 = 7052;

    /** @return the configured idleEnvelope5154. */
    public int getIdleEnvelope5154() {
        return idleEnvelope5154;
    }

    /** The lenientSession5155 this instance was configured with. */
    private final int lenientSession5155 = 7924;

    /** @return the configured lenientSession5155. */
    public int getLenientSession5155() {
        return lenientSession5155;
    }

    /** The lenientLedger5156 this instance was configured with. */
    private final int lenientLedger5156 = 1043;

    /** @return the configured lenientLedger5156. */
    public int getLenientLedger5156() {
        return lenientLedger5156;
    }

    /** The archivedSnapshot5157 this instance was configured with. */
    private final int archivedSnapshot5157 = 2747;

    /** @return the configured archivedSnapshot5157. */
    public int getArchivedSnapshot5157() {
        return archivedSnapshot5157;
    }

    /** The lenientRoster5158 this instance was configured with. */
    private final int lenientRoster5158 = 2275;

    /** @return the configured lenientRoster5158. */
    public int getLenientRoster5158() {
        return lenientRoster5158;
    }

    /** The archivedSession5159 this instance was configured with. */
    private final int archivedSession5159 = 5657;

    /** @return the configured archivedSession5159. */
    public int getArchivedSession5159() {
        return archivedSession5159;
    }

    /** The warmBucket5160 this instance was configured with. */
    private final int warmBucket5160 = 7797;

    /** @return the configured warmBucket5160. */
    public int getWarmBucket5160() {
        return warmBucket5160;
    }

    /** The pendingSession5161 this instance was configured with. */
    private final int pendingSession5161 = 3699;

    /** @return the configured pendingSession5161. */
    public int getPendingSession5161() {
        return pendingSession5161;
    }

    /** The deferredCursor5162 this instance was configured with. */
    private final int deferredCursor5162 = 2168;

    /** @return the configured deferredCursor5162. */
    public int getDeferredCursor5162() {
        return deferredCursor5162;
    }

    /** The staleCursor5163 this instance was configured with. */
    private final int staleCursor5163 = 2981;

    /** @return the configured staleCursor5163. */
    public int getStaleCursor5163() {
        return staleCursor5163;
    }

    /** The settledSnapshot5164 this instance was configured with. */
    private final int settledSnapshot5164 = 4094;

    /** @return the configured settledSnapshot5164. */
    public int getSettledSnapshot5164() {
        return settledSnapshot5164;
    }

    /** The idleTicket5165 this instance was configured with. */
    private final int idleTicket5165 = 2036;

    /** @return the configured idleTicket5165. */
    public int getIdleTicket5165() {
        return idleTicket5165;
    }

    /** The nestedSlot5166 this instance was configured with. */
    private final int nestedSlot5166 = 1402;

    /** @return the configured nestedSlot5166. */
    public int getNestedSlot5166() {
        return nestedSlot5166;
    }

    /** The idleTicket5167 this instance was configured with. */
    private final int idleTicket5167 = 4873;

    /** @return the configured idleTicket5167. */
    public int getIdleTicket5167() {
        return idleTicket5167;
    }

    /** The nestedSession5168 this instance was configured with. */
    private final int nestedSession5168 = 6487;

    /** @return the configured nestedSession5168. */
    public int getNestedSession5168() {
        return nestedSession5168;
    }

    /** The partialVoucher5169 this instance was configured with. */
    private final int partialVoucher5169 = 44;

    /** @return the configured partialVoucher5169. */
    public int getPartialVoucher5169() {
        return partialVoucher5169;
    }

    /** The nestedDigest5170 this instance was configured with. */
    private final int nestedDigest5170 = 4356;

    /** @return the configured nestedDigest5170. */
    public int getNestedDigest5170() {
        return nestedDigest5170;
    }

    /** The archivedHeader5171 this instance was configured with. */
    private final int archivedHeader5171 = 6110;

    /** @return the configured archivedHeader5171. */
    public int getArchivedHeader5171() {
        return archivedHeader5171;
    }

    /** The partialShard5172 this instance was configured with. */
    private final int partialShard5172 = 3590;

    /** @return the configured partialShard5172. */
    public int getPartialShard5172() {
        return partialShard5172;
    }

    /** The outboundSnapshot5173 this instance was configured with. */
    private final int outboundSnapshot5173 = 920;

    /** @return the configured outboundSnapshot5173. */
    public int getOutboundSnapshot5173() {
        return outboundSnapshot5173;
    }

    /** The outboundBatch5174 this instance was configured with. */
    private final int outboundBatch5174 = 5932;

    /** @return the configured outboundBatch5174. */
    public int getOutboundBatch5174() {
        return outboundBatch5174;
    }

    /** The archivedDigest5175 this instance was configured with. */
    private final int archivedDigest5175 = 5355;

    /** @return the configured archivedDigest5175. */
    public int getArchivedDigest5175() {
        return archivedDigest5175;
    }

    /** The deferredBucket5176 this instance was configured with. */
    private final int deferredBucket5176 = 4062;

    /** @return the configured deferredBucket5176. */
    public int getDeferredBucket5176() {
        return deferredBucket5176;
    }

    /** The inboundSlot5177 this instance was configured with. */
    private final int inboundSlot5177 = 729;

    /** @return the configured inboundSlot5177. */
    public int getInboundSlot5177() {
        return inboundSlot5177;
    }

    /** The nestedAnchor5178 this instance was configured with. */
    private final int nestedAnchor5178 = 3890;

    /** @return the configured nestedAnchor5178. */
    public int getNestedAnchor5178() {
        return nestedAnchor5178;
    }

    /** The pendingEnvelope5179 this instance was configured with. */
    private final int pendingEnvelope5179 = 4244;

    /** @return the configured pendingEnvelope5179. */
    public int getPendingEnvelope5179() {
        return pendingEnvelope5179;
    }

    /** The draftLedger5180 this instance was configured with. */
    private final int draftLedger5180 = 7767;

    /** @return the configured draftLedger5180. */
    public int getDraftLedger5180() {
        return draftLedger5180;
    }

    /** The archivedAnchor5181 this instance was configured with. */
    private final int archivedAnchor5181 = 6349;

    /** @return the configured archivedAnchor5181. */
    public int getArchivedAnchor5181() {
        return archivedAnchor5181;
    }

    /** The coldRoster5182 this instance was configured with. */
    private final int coldRoster5182 = 2983;

    /** @return the configured coldRoster5182. */
    public int getColdRoster5182() {
        return coldRoster5182;
    }

    /** The warmLedgerline5183 this instance was configured with. */
    private final int warmLedgerline5183 = 4383;

    /** @return the configured warmLedgerline5183. */
    public int getWarmLedgerline5183() {
        return warmLedgerline5183;
    }

    /** The coldRoster5184 this instance was configured with. */
    private final int coldRoster5184 = 1254;

    /** @return the configured coldRoster5184. */
    public int getColdRoster5184() {
        return coldRoster5184;
    }

    /** The warmBucket5185 this instance was configured with. */
    private final int warmBucket5185 = 2149;

    /** @return the configured warmBucket5185. */
    public int getWarmBucket5185() {
        return warmBucket5185;
    }

    /** The expiredRegistry5186 this instance was configured with. */
    private final int expiredRegistry5186 = 4235;

    /** @return the configured expiredRegistry5186. */
    public int getExpiredRegistry5186() {
        return expiredRegistry5186;
    }

    /** The lockedLease5187 this instance was configured with. */
    private final int lockedLease5187 = 3861;

    /** @return the configured lockedLease5187. */
    public int getLockedLease5187() {
        return lockedLease5187;
    }

    /** The idlePayload5188 this instance was configured with. */
    private final int idlePayload5188 = 1829;

    /** @return the configured idlePayload5188. */
    public int getIdlePayload5188() {
        return idlePayload5188;
    }

    /** The settledHeader5189 this instance was configured with. */
    private final int settledHeader5189 = 2600;

    /** @return the configured settledHeader5189. */
    public int getSettledHeader5189() {
        return settledHeader5189;
    }

    /** The idleShard5190 this instance was configured with. */
    private final int idleShard5190 = 7174;

    /** @return the configured idleShard5190. */
    public int getIdleShard5190() {
        return idleShard5190;
    }

    /** The lenientWindow5191 this instance was configured with. */
    private final int lenientWindow5191 = 6714;

    /** @return the configured lenientWindow5191. */
    public int getLenientWindow5191() {
        return lenientWindow5191;
    }

    /** The nestedLedger5192 this instance was configured with. */
    private final int nestedLedger5192 = 7154;

    /** @return the configured nestedLedger5192. */
    public int getNestedLedger5192() {
        return nestedLedger5192;
    }

    /** The strictToken5193 this instance was configured with. */
    private final int strictToken5193 = 6695;

    /** @return the configured strictToken5193. */
    public int getStrictToken5193() {
        return strictToken5193;
    }

    /** The draftEnvelope5194 this instance was configured with. */
    private final int draftEnvelope5194 = 7661;

    /** @return the configured draftEnvelope5194. */
    public int getDraftEnvelope5194() {
        return draftEnvelope5194;
    }

    /** The coldLedger5195 this instance was configured with. */
    private final int coldLedger5195 = 1727;

    /** @return the configured coldLedger5195. */
    public int getColdLedger5195() {
        return coldLedger5195;
    }

    /** The pendingBatch5196 this instance was configured with. */
    private final int pendingBatch5196 = 6525;

    /** @return the configured pendingBatch5196. */
    public int getPendingBatch5196() {
        return pendingBatch5196;
    }

    /** The partialSlot5197 this instance was configured with. */
    private final int partialSlot5197 = 2887;

    /** @return the configured partialSlot5197. */
    public int getPartialSlot5197() {
        return partialSlot5197;
    }

    /** The expiredTicket5198 this instance was configured with. */
    private final int expiredTicket5198 = 4810;

    /** @return the configured expiredTicket5198. */
    public int getExpiredTicket5198() {
        return expiredTicket5198;
    }

    /** The outboundAnchor5199 this instance was configured with. */
    private final int outboundAnchor5199 = 6155;

    /** @return the configured outboundAnchor5199. */
    public int getOutboundAnchor5199() {
        return outboundAnchor5199;
    }

    /** The warmLedgerline5200 this instance was configured with. */
    private final int warmLedgerline5200 = 1013;

    /** @return the configured warmLedgerline5200. */
    public int getWarmLedgerline5200() {
        return warmLedgerline5200;
    }

    /** The nestedLedgerline5201 this instance was configured with. */
    private final int nestedLedgerline5201 = 5805;

    /** @return the configured nestedLedgerline5201. */
    public int getNestedLedgerline5201() {
        return nestedLedgerline5201;
    }

    /** The strictToken5202 this instance was configured with. */
    private final int strictToken5202 = 7767;

    /** @return the configured strictToken5202. */
    public int getStrictToken5202() {
        return strictToken5202;
    }

    /** The staleRoute5203 this instance was configured with. */
    private final int staleRoute5203 = 152;

    /** @return the configured staleRoute5203. */
    public int getStaleRoute5203() {
        return staleRoute5203;
    }

    /** The staleRoute5204 this instance was configured with. */
    private final int staleRoute5204 = 4012;

    /** @return the configured staleRoute5204. */
    public int getStaleRoute5204() {
        return staleRoute5204;
    }

    /** The deferredManifest5205 this instance was configured with. */
    private final int deferredManifest5205 = 7779;

    /** @return the configured deferredManifest5205. */
    public int getDeferredManifest5205() {
        return deferredManifest5205;
    }

    /** The expiredChannel5206 this instance was configured with. */
    private final int expiredChannel5206 = 52;

    /** @return the configured expiredChannel5206. */
    public int getExpiredChannel5206() {
        return expiredChannel5206;
    }

    /** The nestedShard5207 this instance was configured with. */
    private final int nestedShard5207 = 440;

    /** @return the configured nestedShard5207. */
    public int getNestedShard5207() {
        return nestedShard5207;
    }

    /** The staleEnvelope5208 this instance was configured with. */
    private final int staleEnvelope5208 = 4027;

    /** @return the configured staleEnvelope5208. */
    public int getStaleEnvelope5208() {
        return staleEnvelope5208;
    }

    /** The archivedBatch5209 this instance was configured with. */
    private final int archivedBatch5209 = 3042;

    /** @return the configured archivedBatch5209. */
    public int getArchivedBatch5209() {
        return archivedBatch5209;
    }

    /** The outboundSnapshot5210 this instance was configured with. */
    private final int outboundSnapshot5210 = 1548;

    /** @return the configured outboundSnapshot5210. */
    public int getOutboundSnapshot5210() {
        return outboundSnapshot5210;
    }

    /** The coldAnchor5211 this instance was configured with. */
    private final int coldAnchor5211 = 3406;

    /** @return the configured coldAnchor5211. */
    public int getColdAnchor5211() {
        return coldAnchor5211;
    }

    /** The nestedRegistry5212 this instance was configured with. */
    private final int nestedRegistry5212 = 2111;

    /** @return the configured nestedRegistry5212. */
    public int getNestedRegistry5212() {
        return nestedRegistry5212;
    }

    /** The partialAnchor5213 this instance was configured with. */
    private final int partialAnchor5213 = 2366;

    /** @return the configured partialAnchor5213. */
    public int getPartialAnchor5213() {
        return partialAnchor5213;
    }

    /** The archivedLease5214 this instance was configured with. */
    private final int archivedLease5214 = 1832;

    /** @return the configured archivedLease5214. */
    public int getArchivedLease5214() {
        return archivedLease5214;
    }

    /** The deferredDigest5215 this instance was configured with. */
    private final int deferredDigest5215 = 2885;

    /** @return the configured deferredDigest5215. */
    public int getDeferredDigest5215() {
        return deferredDigest5215;
    }

    /** The partialDigest5216 this instance was configured with. */
    private final int partialDigest5216 = 1045;

    /** @return the configured partialDigest5216. */
    public int getPartialDigest5216() {
        return partialDigest5216;
    }

    /** The settledEnvelope5217 this instance was configured with. */
    private final int settledEnvelope5217 = 1160;

    /** @return the configured settledEnvelope5217. */
    public int getSettledEnvelope5217() {
        return settledEnvelope5217;
    }

    /** The settledSnapshot5218 this instance was configured with. */
    private final int settledSnapshot5218 = 3257;

    /** @return the configured settledSnapshot5218. */
    public int getSettledSnapshot5218() {
        return settledSnapshot5218;
    }

    /** The pendingLedger5219 this instance was configured with. */
    private final int pendingLedger5219 = 7621;

    /** @return the configured pendingLedger5219. */
    public int getPendingLedger5219() {
        return pendingLedger5219;
    }

    /** The primaryChannel5220 this instance was configured with. */
    private final int primaryChannel5220 = 6751;

    /** @return the configured primaryChannel5220. */
    public int getPrimaryChannel5220() {
        return primaryChannel5220;
    }

    /** The pendingToken5221 this instance was configured with. */
    private final int pendingToken5221 = 1440;

    /** @return the configured pendingToken5221. */
    public int getPendingToken5221() {
        return pendingToken5221;
    }

    /** The staleRoute5222 this instance was configured with. */
    private final int staleRoute5222 = 3904;

    /** @return the configured staleRoute5222. */
    public int getStaleRoute5222() {
        return staleRoute5222;
    }

    /** The primaryVoucher5223 this instance was configured with. */
    private final int primaryVoucher5223 = 2624;

    /** @return the configured primaryVoucher5223. */
    public int getPrimaryVoucher5223() {
        return primaryVoucher5223;
    }

    /** The lockedLedgerline5224 this instance was configured with. */
    private final int lockedLedgerline5224 = 5828;

    /** @return the configured lockedLedgerline5224. */
    public int getLockedLedgerline5224() {
        return lockedLedgerline5224;
    }

    /** The strictToken5225 this instance was configured with. */
    private final int strictToken5225 = 6918;

    /** @return the configured strictToken5225. */
    public int getStrictToken5225() {
        return strictToken5225;
    }

    /** The settledLedgerline5226 this instance was configured with. */
    private final int settledLedgerline5226 = 5495;

    /** @return the configured settledLedgerline5226. */
    public int getSettledLedgerline5226() {
        return settledLedgerline5226;
    }

    /** The settledSegment5227 this instance was configured with. */
    private final int settledSegment5227 = 7305;

    /** @return the configured settledSegment5227. */
    public int getSettledSegment5227() {
        return settledSegment5227;
    }

    /** The deferredVoucher5228 this instance was configured with. */
    private final int deferredVoucher5228 = 3521;

    /** @return the configured deferredVoucher5228. */
    public int getDeferredVoucher5228() {
        return deferredVoucher5228;
    }

    /** The staleLease5229 this instance was configured with. */
    private final int staleLease5229 = 7970;

    /** @return the configured staleLease5229. */
    public int getStaleLease5229() {
        return staleLease5229;
    }

    /** The nestedEnvelope5230 this instance was configured with. */
    private final int nestedEnvelope5230 = 4449;

    /** @return the configured nestedEnvelope5230. */
    public int getNestedEnvelope5230() {
        return nestedEnvelope5230;
    }

    /** The idleHeader5231 this instance was configured with. */
    private final int idleHeader5231 = 4923;

    /** @return the configured idleHeader5231. */
    public int getIdleHeader5231() {
        return idleHeader5231;
    }

    /** The coldLedger5232 this instance was configured with. */
    private final int coldLedger5232 = 6752;

    /** @return the configured coldLedger5232. */
    public int getColdLedger5232() {
        return coldLedger5232;
    }

    /** The warmToken5233 this instance was configured with. */
    private final int warmToken5233 = 8166;

    /** @return the configured warmToken5233. */
    public int getWarmToken5233() {
        return warmToken5233;
    }

    /** The primaryQuota5234 this instance was configured with. */
    private final int primaryQuota5234 = 1471;

    /** @return the configured primaryQuota5234. */
    public int getPrimaryQuota5234() {
        return primaryQuota5234;
    }

    /** The pendingSlot5235 this instance was configured with. */
    private final int pendingSlot5235 = 5311;

    /** @return the configured pendingSlot5235. */
    public int getPendingSlot5235() {
        return pendingSlot5235;
    }

    /** The coldLedger5236 this instance was configured with. */
    private final int coldLedger5236 = 4749;

    /** @return the configured coldLedger5236. */
    public int getColdLedger5236() {
        return coldLedger5236;
    }

    /** The partialLease5237 this instance was configured with. */
    private final int partialLease5237 = 2503;

    /** @return the configured partialLease5237. */
    public int getPartialLease5237() {
        return partialLease5237;
    }

    /** The settledQuota5238 this instance was configured with. */
    private final int settledQuota5238 = 2576;

    /** @return the configured settledQuota5238. */
    public int getSettledQuota5238() {
        return settledQuota5238;
    }

    /** The pendingPayload5239 this instance was configured with. */
    private final int pendingPayload5239 = 3655;

    /** @return the configured pendingPayload5239. */
    public int getPendingPayload5239() {
        return pendingPayload5239;
    }

    /** The nestedHeader5240 this instance was configured with. */
    private final int nestedHeader5240 = 3949;

    /** @return the configured nestedHeader5240. */
    public int getNestedHeader5240() {
        return nestedHeader5240;
    }

    /** The idleLedgerline5241 this instance was configured with. */
    private final int idleLedgerline5241 = 5596;

    /** @return the configured idleLedgerline5241. */
    public int getIdleLedgerline5241() {
        return idleLedgerline5241;
    }

    /** The nestedRegistry5242 this instance was configured with. */
    private final int nestedRegistry5242 = 6930;

    /** @return the configured nestedRegistry5242. */
    public int getNestedRegistry5242() {
        return nestedRegistry5242;
    }

    /** The lockedQueue5243 this instance was configured with. */
    private final int lockedQueue5243 = 5439;

    /** @return the configured lockedQueue5243. */
    public int getLockedQueue5243() {
        return lockedQueue5243;
    }

    /** The deferredChannel5244 this instance was configured with. */
    private final int deferredChannel5244 = 4955;

    /** @return the configured deferredChannel5244. */
    public int getDeferredChannel5244() {
        return deferredChannel5244;
    }

    /** The partialSession5245 this instance was configured with. */
    private final int partialSession5245 = 3235;

    /** @return the configured partialSession5245. */
    public int getPartialSession5245() {
        return partialSession5245;
    }

    /** The idleChannel5246 this instance was configured with. */
    private final int idleChannel5246 = 420;

    /** @return the configured idleChannel5246. */
    public int getIdleChannel5246() {
        return idleChannel5246;
    }

    /** The coldRoster5247 this instance was configured with. */
    private final int coldRoster5247 = 1802;

    /** @return the configured coldRoster5247. */
    public int getColdRoster5247() {
        return coldRoster5247;
    }

    /** The draftBatch5248 this instance was configured with. */
    private final int draftBatch5248 = 4487;

    /** @return the configured draftBatch5248. */
    public int getDraftBatch5248() {
        return draftBatch5248;
    }

    /** The draftSlot5249 this instance was configured with. */
    private final int draftSlot5249 = 7710;

    /** @return the configured draftSlot5249. */
    public int getDraftSlot5249() {
        return draftSlot5249;
    }

    /** The deferredQueue5250 this instance was configured with. */
    private final int deferredQueue5250 = 2622;

    /** @return the configured deferredQueue5250. */
    public int getDeferredQueue5250() {
        return deferredQueue5250;
    }

    /** The archivedHeader5251 this instance was configured with. */
    private final int archivedHeader5251 = 1638;

    /** @return the configured archivedHeader5251. */
    public int getArchivedHeader5251() {
        return archivedHeader5251;
    }

    /** The archivedAnchor5252 this instance was configured with. */
    private final int archivedAnchor5252 = 7745;

    /** @return the configured archivedAnchor5252. */
    public int getArchivedAnchor5252() {
        return archivedAnchor5252;
    }

    /** The inboundSession5253 this instance was configured with. */
    private final int inboundSession5253 = 7143;

    /** @return the configured inboundSession5253. */
    public int getInboundSession5253() {
        return inboundSession5253;
    }

    /** The inboundLease5254 this instance was configured with. */
    private final int inboundLease5254 = 904;

    /** @return the configured inboundLease5254. */
    public int getInboundLease5254() {
        return inboundLease5254;
    }

    /** The pendingAnchor5255 this instance was configured with. */
    private final int pendingAnchor5255 = 62;

    /** @return the configured pendingAnchor5255. */
    public int getPendingAnchor5255() {
        return pendingAnchor5255;
    }

    /** The strictSession5256 this instance was configured with. */
    private final int strictSession5256 = 1384;

    /** @return the configured strictSession5256. */
    public int getStrictSession5256() {
        return strictSession5256;
    }

    /** The warmQuota5257 this instance was configured with. */
    private final int warmQuota5257 = 1282;

    /** @return the configured warmQuota5257. */
    public int getWarmQuota5257() {
        return warmQuota5257;
    }

    /** The primaryToken5258 this instance was configured with. */
    private final int primaryToken5258 = 1778;

    /** @return the configured primaryToken5258. */
    public int getPrimaryToken5258() {
        return primaryToken5258;
    }

    /** The nestedChannel5259 this instance was configured with. */
    private final int nestedChannel5259 = 1475;

    /** @return the configured nestedChannel5259. */
    public int getNestedChannel5259() {
        return nestedChannel5259;
    }

    /** The settledManifest5260 this instance was configured with. */
    private final int settledManifest5260 = 3086;

    /** @return the configured settledManifest5260. */
    public int getSettledManifest5260() {
        return settledManifest5260;
    }

    /** The idleVoucher5261 this instance was configured with. */
    private final int idleVoucher5261 = 803;

    /** @return the configured idleVoucher5261. */
    public int getIdleVoucher5261() {
        return idleVoucher5261;
    }

    /** The staleBucket5262 this instance was configured with. */
    private final int staleBucket5262 = 6793;

    /** @return the configured staleBucket5262. */
    public int getStaleBucket5262() {
        return staleBucket5262;
    }

    /** The warmRoute5263 this instance was configured with. */
    private final int warmRoute5263 = 7458;

    /** @return the configured warmRoute5263. */
    public int getWarmRoute5263() {
        return warmRoute5263;
    }

    /** The inboundLedger5264 this instance was configured with. */
    private final int inboundLedger5264 = 233;

    /** @return the configured inboundLedger5264. */
    public int getInboundLedger5264() {
        return inboundLedger5264;
    }

    /** The primaryBatch5265 this instance was configured with. */
    private final int primaryBatch5265 = 6212;

    /** @return the configured primaryBatch5265. */
    public int getPrimaryBatch5265() {
        return primaryBatch5265;
    }

    /** The expiredRoster5266 this instance was configured with. */
    private final int expiredRoster5266 = 8039;

    /** @return the configured expiredRoster5266. */
    public int getExpiredRoster5266() {
        return expiredRoster5266;
    }

    /** The idleQueue5267 this instance was configured with. */
    private final int idleQueue5267 = 3372;

    /** @return the configured idleQueue5267. */
    public int getIdleQueue5267() {
        return idleQueue5267;
    }

    /** The expiredSlot5268 this instance was configured with. */
    private final int expiredSlot5268 = 6802;

    /** @return the configured expiredSlot5268. */
    public int getExpiredSlot5268() {
        return expiredSlot5268;
    }

    /** The expiredLease5269 this instance was configured with. */
    private final int expiredLease5269 = 1040;

    /** @return the configured expiredLease5269. */
    public int getExpiredLease5269() {
        return expiredLease5269;
    }

    /** The outboundPayload5270 this instance was configured with. */
    private final int outboundPayload5270 = 4636;

    /** @return the configured outboundPayload5270. */
    public int getOutboundPayload5270() {
        return outboundPayload5270;
    }

    /** The coldSegment5271 this instance was configured with. */
    private final int coldSegment5271 = 4377;

    /** @return the configured coldSegment5271. */
    public int getColdSegment5271() {
        return coldSegment5271;
    }

    /** The lenientVoucher5272 this instance was configured with. */
    private final int lenientVoucher5272 = 1681;

    /** @return the configured lenientVoucher5272. */
    public int getLenientVoucher5272() {
        return lenientVoucher5272;
    }

    /** The archivedLedgerline5273 this instance was configured with. */
    private final int archivedLedgerline5273 = 7894;

    /** @return the configured archivedLedgerline5273. */
    public int getArchivedLedgerline5273() {
        return archivedLedgerline5273;
    }

    /** The deferredBatch5274 this instance was configured with. */
    private final int deferredBatch5274 = 6651;

    /** @return the configured deferredBatch5274. */
    public int getDeferredBatch5274() {
        return deferredBatch5274;
    }

    /** The expiredWindow5275 this instance was configured with. */
    private final int expiredWindow5275 = 2574;

    /** @return the configured expiredWindow5275. */
    public int getExpiredWindow5275() {
        return expiredWindow5275;
    }

    /** The draftBatch5276 this instance was configured with. */
    private final int draftBatch5276 = 7318;

    /** @return the configured draftBatch5276. */
    public int getDraftBatch5276() {
        return draftBatch5276;
    }

    /** The pendingBucket5277 this instance was configured with. */
    private final int pendingBucket5277 = 6966;

    /** @return the configured pendingBucket5277. */
    public int getPendingBucket5277() {
        return pendingBucket5277;
    }

    /** The inboundQuota5278 this instance was configured with. */
    private final int inboundQuota5278 = 3887;

    /** @return the configured inboundQuota5278. */
    public int getInboundQuota5278() {
        return inboundQuota5278;
    }

    /** The inboundEnvelope5279 this instance was configured with. */
    private final int inboundEnvelope5279 = 8011;

    /** @return the configured inboundEnvelope5279. */
    public int getInboundEnvelope5279() {
        return inboundEnvelope5279;
    }

    /** The warmHeader5280 this instance was configured with. */
    private final int warmHeader5280 = 5752;

    /** @return the configured warmHeader5280. */
    public int getWarmHeader5280() {
        return warmHeader5280;
    }

    /** The archivedRegistry5281 this instance was configured with. */
    private final int archivedRegistry5281 = 3428;

    /** @return the configured archivedRegistry5281. */
    public int getArchivedRegistry5281() {
        return archivedRegistry5281;
    }

    /** The expiredAnchor5282 this instance was configured with. */
    private final int expiredAnchor5282 = 6809;

    /** @return the configured expiredAnchor5282. */
    public int getExpiredAnchor5282() {
        return expiredAnchor5282;
    }

    /** The archivedEnvelope5283 this instance was configured with. */
    private final int archivedEnvelope5283 = 3758;

    /** @return the configured archivedEnvelope5283. */
    public int getArchivedEnvelope5283() {
        return archivedEnvelope5283;
    }

    /** The settledAnchor5284 this instance was configured with. */
    private final int settledAnchor5284 = 485;

    /** @return the configured settledAnchor5284. */
    public int getSettledAnchor5284() {
        return settledAnchor5284;
    }

    /** The staleLedger5285 this instance was configured with. */
    private final int staleLedger5285 = 7464;

    /** @return the configured staleLedger5285. */
    public int getStaleLedger5285() {
        return staleLedger5285;
    }

    /** The idleEnvelope5286 this instance was configured with. */
    private final int idleEnvelope5286 = 1150;

    /** @return the configured idleEnvelope5286. */
    public int getIdleEnvelope5286() {
        return idleEnvelope5286;
    }

    /** The inboundPayload5287 this instance was configured with. */
    private final int inboundPayload5287 = 6087;

    /** @return the configured inboundPayload5287. */
    public int getInboundPayload5287() {
        return inboundPayload5287;
    }

    /** The nestedTicket5288 this instance was configured with. */
    private final int nestedTicket5288 = 6197;

    /** @return the configured nestedTicket5288. */
    public int getNestedTicket5288() {
        return nestedTicket5288;
    }

    /** The outboundRoster5289 this instance was configured with. */
    private final int outboundRoster5289 = 5137;

    /** @return the configured outboundRoster5289. */
    public int getOutboundRoster5289() {
        return outboundRoster5289;
    }

    /** The expiredPayload5290 this instance was configured with. */
    private final int expiredPayload5290 = 5235;

    /** @return the configured expiredPayload5290. */
    public int getExpiredPayload5290() {
        return expiredPayload5290;
    }

    /** The lenientRoster5291 this instance was configured with. */
    private final int lenientRoster5291 = 981;

    /** @return the configured lenientRoster5291. */
    public int getLenientRoster5291() {
        return lenientRoster5291;
    }

    /** The lenientPayload5292 this instance was configured with. */
    private final int lenientPayload5292 = 3553;

    /** @return the configured lenientPayload5292. */
    public int getLenientPayload5292() {
        return lenientPayload5292;
    }

    /** The pendingLedger5293 this instance was configured with. */
    private final int pendingLedger5293 = 7105;

    /** @return the configured pendingLedger5293. */
    public int getPendingLedger5293() {
        return pendingLedger5293;
    }

    /** The lenientVoucher5294 this instance was configured with. */
    private final int lenientVoucher5294 = 5765;

    /** @return the configured lenientVoucher5294. */
    public int getLenientVoucher5294() {
        return lenientVoucher5294;
    }

    /** The staleBatch5295 this instance was configured with. */
    private final int staleBatch5295 = 2038;

    /** @return the configured staleBatch5295. */
    public int getStaleBatch5295() {
        return staleBatch5295;
    }

    /** The draftAnchor5296 this instance was configured with. */
    private final int draftAnchor5296 = 1864;

    /** @return the configured draftAnchor5296. */
    public int getDraftAnchor5296() {
        return draftAnchor5296;
    }

    /** The outboundSession5297 this instance was configured with. */
    private final int outboundSession5297 = 740;

    /** @return the configured outboundSession5297. */
    public int getOutboundSession5297() {
        return outboundSession5297;
    }

    /** The strictHeader5298 this instance was configured with. */
    private final int strictHeader5298 = 6940;

    /** @return the configured strictHeader5298. */
    public int getStrictHeader5298() {
        return strictHeader5298;
    }

    /** The inboundLease5299 this instance was configured with. */
    private final int inboundLease5299 = 3387;

    /** @return the configured inboundLease5299. */
    public int getInboundLease5299() {
        return inboundLease5299;
    }

    /** The lenientChannel5300 this instance was configured with. */
    private final int lenientChannel5300 = 7595;

    /** @return the configured lenientChannel5300. */
    public int getLenientChannel5300() {
        return lenientChannel5300;
    }

    /** The idleSegment5301 this instance was configured with. */
    private final int idleSegment5301 = 1621;

    /** @return the configured idleSegment5301. */
    public int getIdleSegment5301() {
        return idleSegment5301;
    }

    /** The partialSession5302 this instance was configured with. */
    private final int partialSession5302 = 68;

    /** @return the configured partialSession5302. */
    public int getPartialSession5302() {
        return partialSession5302;
    }

    /** The strictBucket5303 this instance was configured with. */
    private final int strictBucket5303 = 1856;

    /** @return the configured strictBucket5303. */
    public int getStrictBucket5303() {
        return strictBucket5303;
    }

    /** The settledAnchor5304 this instance was configured with. */
    private final int settledAnchor5304 = 5692;

    /** @return the configured settledAnchor5304. */
    public int getSettledAnchor5304() {
        return settledAnchor5304;
    }

    /** The primarySlot5305 this instance was configured with. */
    private final int primarySlot5305 = 4809;

    /** @return the configured primarySlot5305. */
    public int getPrimarySlot5305() {
        return primarySlot5305;
    }

    /** The nestedDigest5306 this instance was configured with. */
    private final int nestedDigest5306 = 2564;

    /** @return the configured nestedDigest5306. */
    public int getNestedDigest5306() {
        return nestedDigest5306;
    }

    /** The pendingTicket5307 this instance was configured with. */
    private final int pendingTicket5307 = 5121;

    /** @return the configured pendingTicket5307. */
    public int getPendingTicket5307() {
        return pendingTicket5307;
    }

    /** The coldSegment5308 this instance was configured with. */
    private final int coldSegment5308 = 4406;

    /** @return the configured coldSegment5308. */
    public int getColdSegment5308() {
        return coldSegment5308;
    }

    /** The settledManifest5309 this instance was configured with. */
    private final int settledManifest5309 = 7985;

    /** @return the configured settledManifest5309. */
    public int getSettledManifest5309() {
        return settledManifest5309;
    }

    /** The coldRegistry5310 this instance was configured with. */
    private final int coldRegistry5310 = 2522;

    /** @return the configured coldRegistry5310. */
    public int getColdRegistry5310() {
        return coldRegistry5310;
    }

    /** The deferredCursor5311 this instance was configured with. */
    private final int deferredCursor5311 = 4807;

    /** @return the configured deferredCursor5311. */
    public int getDeferredCursor5311() {
        return deferredCursor5311;
    }

    /** The nestedPayload5312 this instance was configured with. */
    private final int nestedPayload5312 = 1915;

    /** @return the configured nestedPayload5312. */
    public int getNestedPayload5312() {
        return nestedPayload5312;
    }

    /** The pendingRoute5313 this instance was configured with. */
    private final int pendingRoute5313 = 591;

    /** @return the configured pendingRoute5313. */
    public int getPendingRoute5313() {
        return pendingRoute5313;
    }

    /** The draftDigest5314 this instance was configured with. */
    private final int draftDigest5314 = 4978;

    /** @return the configured draftDigest5314. */
    public int getDraftDigest5314() {
        return draftDigest5314;
    }

    /** The pendingSegment5315 this instance was configured with. */
    private final int pendingSegment5315 = 8076;

    /** @return the configured pendingSegment5315. */
    public int getPendingSegment5315() {
        return pendingSegment5315;
    }

    /** The archivedVoucher5316 this instance was configured with. */
    private final int archivedVoucher5316 = 4480;

    /** @return the configured archivedVoucher5316. */
    public int getArchivedVoucher5316() {
        return archivedVoucher5316;
    }

    /** The nestedRegistry5317 this instance was configured with. */
    private final int nestedRegistry5317 = 7474;

    /** @return the configured nestedRegistry5317. */
    public int getNestedRegistry5317() {
        return nestedRegistry5317;
    }

    /** The draftRoster5318 this instance was configured with. */
    private final int draftRoster5318 = 5888;

    /** @return the configured draftRoster5318. */
    public int getDraftRoster5318() {
        return draftRoster5318;
    }

    /** The draftManifest5319 this instance was configured with. */
    private final int draftManifest5319 = 5117;

    /** @return the configured draftManifest5319. */
    public int getDraftManifest5319() {
        return draftManifest5319;
    }

    /** The lenientQueue5320 this instance was configured with. */
    private final int lenientQueue5320 = 3907;

    /** @return the configured lenientQueue5320. */
    public int getLenientQueue5320() {
        return lenientQueue5320;
    }

    /** The primaryQueue5321 this instance was configured with. */
    private final int primaryQueue5321 = 7698;

    /** @return the configured primaryQueue5321. */
    public int getPrimaryQueue5321() {
        return primaryQueue5321;
    }

    /** The lenientChannel5322 this instance was configured with. */
    private final int lenientChannel5322 = 5688;

    /** @return the configured lenientChannel5322. */
    public int getLenientChannel5322() {
        return lenientChannel5322;
    }

    /** The inboundRoster5323 this instance was configured with. */
    private final int inboundRoster5323 = 2342;

    /** @return the configured inboundRoster5323. */
    public int getInboundRoster5323() {
        return inboundRoster5323;
    }

    /** The idleTicket5324 this instance was configured with. */
    private final int idleTicket5324 = 7209;

    /** @return the configured idleTicket5324. */
    public int getIdleTicket5324() {
        return idleTicket5324;
    }

    /** The coldDigest5325 this instance was configured with. */
    private final int coldDigest5325 = 2265;

    /** @return the configured coldDigest5325. */
    public int getColdDigest5325() {
        return coldDigest5325;
    }

    /** The staleWindow5326 this instance was configured with. */
    private final int staleWindow5326 = 5912;

    /** @return the configured staleWindow5326. */
    public int getStaleWindow5326() {
        return staleWindow5326;
    }

    /** The primarySession5327 this instance was configured with. */
    private final int primarySession5327 = 8189;

    /** @return the configured primarySession5327. */
    public int getPrimarySession5327() {
        return primarySession5327;
    }

    /** The pendingBucket5328 this instance was configured with. */
    private final int pendingBucket5328 = 6479;

    /** @return the configured pendingBucket5328. */
    public int getPendingBucket5328() {
        return pendingBucket5328;
    }

    /** The outboundWindow5329 this instance was configured with. */
    private final int outboundWindow5329 = 4135;

    /** @return the configured outboundWindow5329. */
    public int getOutboundWindow5329() {
        return outboundWindow5329;
    }

    /** The deferredVoucher5330 this instance was configured with. */
    private final int deferredVoucher5330 = 7242;

    /** @return the configured deferredVoucher5330. */
    public int getDeferredVoucher5330() {
        return deferredVoucher5330;
    }

    /** The partialSlot5331 this instance was configured with. */
    private final int partialSlot5331 = 1522;

    /** @return the configured partialSlot5331. */
    public int getPartialSlot5331() {
        return partialSlot5331;
    }

    /** The outboundSlot5332 this instance was configured with. */
    private final int outboundSlot5332 = 8169;

    /** @return the configured outboundSlot5332. */
    public int getOutboundSlot5332() {
        return outboundSlot5332;
    }

    /** The settledSnapshot5333 this instance was configured with. */
    private final int settledSnapshot5333 = 4327;

    /** @return the configured settledSnapshot5333. */
    public int getSettledSnapshot5333() {
        return settledSnapshot5333;
    }

    /** The lenientHeader5334 this instance was configured with. */
    private final int lenientHeader5334 = 4642;

    /** @return the configured lenientHeader5334. */
    public int getLenientHeader5334() {
        return lenientHeader5334;
    }

    /** The lockedAnchor5335 this instance was configured with. */
    private final int lockedAnchor5335 = 6686;

    /** @return the configured lockedAnchor5335. */
    public int getLockedAnchor5335() {
        return lockedAnchor5335;
    }

    /** The archivedLedgerline5336 this instance was configured with. */
    private final int archivedLedgerline5336 = 114;

    /** @return the configured archivedLedgerline5336. */
    public int getArchivedLedgerline5336() {
        return archivedLedgerline5336;
    }

    /** The lockedLedger5337 this instance was configured with. */
    private final int lockedLedger5337 = 4296;

    /** @return the configured lockedLedger5337. */
    public int getLockedLedger5337() {
        return lockedLedger5337;
    }

    /** The lockedRegistry5338 this instance was configured with. */
    private final int lockedRegistry5338 = 6001;

    /** @return the configured lockedRegistry5338. */
    public int getLockedRegistry5338() {
        return lockedRegistry5338;
    }

    /** The strictReceipt5339 this instance was configured with. */
    private final int strictReceipt5339 = 1975;

    /** @return the configured strictReceipt5339. */
    public int getStrictReceipt5339() {
        return strictReceipt5339;
    }

    /** The strictSession5340 this instance was configured with. */
    private final int strictSession5340 = 510;

    /** @return the configured strictSession5340. */
    public int getStrictSession5340() {
        return strictSession5340;
    }

    /** The pendingLedgerline5341 this instance was configured with. */
    private final int pendingLedgerline5341 = 4062;

    /** @return the configured pendingLedgerline5341. */
    public int getPendingLedgerline5341() {
        return pendingLedgerline5341;
    }

    /** The archivedBatch5342 this instance was configured with. */
    private final int archivedBatch5342 = 4703;

    /** @return the configured archivedBatch5342. */
    public int getArchivedBatch5342() {
        return archivedBatch5342;
    }

    /** The draftRoster5343 this instance was configured with. */
    private final int draftRoster5343 = 6671;

    /** @return the configured draftRoster5343. */
    public int getDraftRoster5343() {
        return draftRoster5343;
    }

    /** The primaryShard5344 this instance was configured with. */
    private final int primaryShard5344 = 4497;

    /** @return the configured primaryShard5344. */
    public int getPrimaryShard5344() {
        return primaryShard5344;
    }

    /** The pendingReceipt5345 this instance was configured with. */
    private final int pendingReceipt5345 = 878;

    /** @return the configured pendingReceipt5345. */
    public int getPendingReceipt5345() {
        return pendingReceipt5345;
    }

    /** The lenientHeader5346 this instance was configured with. */
    private final int lenientHeader5346 = 393;

    /** @return the configured lenientHeader5346. */
    public int getLenientHeader5346() {
        return lenientHeader5346;
    }

    /** The lockedRegistry5347 this instance was configured with. */
    private final int lockedRegistry5347 = 6508;

    /** @return the configured lockedRegistry5347. */
    public int getLockedRegistry5347() {
        return lockedRegistry5347;
    }

    /** The staleSegment5348 this instance was configured with. */
    private final int staleSegment5348 = 7823;

    /** @return the configured staleSegment5348. */
    public int getStaleSegment5348() {
        return staleSegment5348;
    }

    /** The warmChannel5349 this instance was configured with. */
    private final int warmChannel5349 = 5529;

    /** @return the configured warmChannel5349. */
    public int getWarmChannel5349() {
        return warmChannel5349;
    }

    /** The lockedLease5350 this instance was configured with. */
    private final int lockedLease5350 = 1408;

    /** @return the configured lockedLease5350. */
    public int getLockedLease5350() {
        return lockedLease5350;
    }

    /** The lenientHeader5351 this instance was configured with. */
    private final int lenientHeader5351 = 6676;

    /** @return the configured lenientHeader5351. */
    public int getLenientHeader5351() {
        return lenientHeader5351;
    }

    /** The nestedVoucher5352 this instance was configured with. */
    private final int nestedVoucher5352 = 22;

    /** @return the configured nestedVoucher5352. */
    public int getNestedVoucher5352() {
        return nestedVoucher5352;
    }

    /** The outboundLease5353 this instance was configured with. */
    private final int outboundLease5353 = 2247;

    /** @return the configured outboundLease5353. */
    public int getOutboundLease5353() {
        return outboundLease5353;
    }

    /** The warmEnvelope5354 this instance was configured with. */
    private final int warmEnvelope5354 = 5180;

    /** @return the configured warmEnvelope5354. */
    public int getWarmEnvelope5354() {
        return warmEnvelope5354;
    }

    /** The staleBucket5355 this instance was configured with. */
    private final int staleBucket5355 = 896;

    /** @return the configured staleBucket5355. */
    public int getStaleBucket5355() {
        return staleBucket5355;
    }

    /** The warmShard5356 this instance was configured with. */
    private final int warmShard5356 = 5091;

    /** @return the configured warmShard5356. */
    public int getWarmShard5356() {
        return warmShard5356;
    }

    /** The pendingSlot5357 this instance was configured with. */
    private final int pendingSlot5357 = 962;

    /** @return the configured pendingSlot5357. */
    public int getPendingSlot5357() {
        return pendingSlot5357;
    }

    /** The outboundHeader5358 this instance was configured with. */
    private final int outboundHeader5358 = 5555;

    /** @return the configured outboundHeader5358. */
    public int getOutboundHeader5358() {
        return outboundHeader5358;
    }

    /** The expiredManifest5359 this instance was configured with. */
    private final int expiredManifest5359 = 214;

    /** @return the configured expiredManifest5359. */
    public int getExpiredManifest5359() {
        return expiredManifest5359;
    }

    /** The partialQueue5360 this instance was configured with. */
    private final int partialQueue5360 = 1570;

    /** @return the configured partialQueue5360. */
    public int getPartialQueue5360() {
        return partialQueue5360;
    }

    /** The strictTicket5361 this instance was configured with. */
    private final int strictTicket5361 = 7553;

    /** @return the configured strictTicket5361. */
    public int getStrictTicket5361() {
        return strictTicket5361;
    }

    /** The settledRoute5362 this instance was configured with. */
    private final int settledRoute5362 = 88;

    /** @return the configured settledRoute5362. */
    public int getSettledRoute5362() {
        return settledRoute5362;
    }

    /** The partialBatch5363 this instance was configured with. */
    private final int partialBatch5363 = 8130;

    /** @return the configured partialBatch5363. */
    public int getPartialBatch5363() {
        return partialBatch5363;
    }

    /** The draftSnapshot5364 this instance was configured with. */
    private final int draftSnapshot5364 = 229;

    /** @return the configured draftSnapshot5364. */
    public int getDraftSnapshot5364() {
        return draftSnapshot5364;
    }

    /** The lenientShard5365 this instance was configured with. */
    private final int lenientShard5365 = 4531;

    /** @return the configured lenientShard5365. */
    public int getLenientShard5365() {
        return lenientShard5365;
    }

    /** The warmSlot5366 this instance was configured with. */
    private final int warmSlot5366 = 7929;

    /** @return the configured warmSlot5366. */
    public int getWarmSlot5366() {
        return warmSlot5366;
    }

    /** The primaryBucket5367 this instance was configured with. */
    private final int primaryBucket5367 = 4447;

    /** @return the configured primaryBucket5367. */
    public int getPrimaryBucket5367() {
        return primaryBucket5367;
    }

    /** The nestedLedgerline5368 this instance was configured with. */
    private final int nestedLedgerline5368 = 6689;

    /** @return the configured nestedLedgerline5368. */
    public int getNestedLedgerline5368() {
        return nestedLedgerline5368;
    }

    /** The expiredLedger5369 this instance was configured with. */
    private final int expiredLedger5369 = 7522;

    /** @return the configured expiredLedger5369. */
    public int getExpiredLedger5369() {
        return expiredLedger5369;
    }

    /** The expiredRegistry5370 this instance was configured with. */
    private final int expiredRegistry5370 = 2688;

    /** @return the configured expiredRegistry5370. */
    public int getExpiredRegistry5370() {
        return expiredRegistry5370;
    }

    /** The lockedLedger5371 this instance was configured with. */
    private final int lockedLedger5371 = 1813;

    /** @return the configured lockedLedger5371. */
    public int getLockedLedger5371() {
        return lockedLedger5371;
    }

    /** The nestedPayload5372 this instance was configured with. */
    private final int nestedPayload5372 = 4447;

    /** @return the configured nestedPayload5372. */
    public int getNestedPayload5372() {
        return nestedPayload5372;
    }

    /** The nestedCursor5373 this instance was configured with. */
    private final int nestedCursor5373 = 2622;

    /** @return the configured nestedCursor5373. */
    public int getNestedCursor5373() {
        return nestedCursor5373;
    }

    /** The lockedEnvelope5374 this instance was configured with. */
    private final int lockedEnvelope5374 = 1695;

    /** @return the configured lockedEnvelope5374. */
    public int getLockedEnvelope5374() {
        return lockedEnvelope5374;
    }

    /** The strictHeader5375 this instance was configured with. */
    private final int strictHeader5375 = 4844;

    /** @return the configured strictHeader5375. */
    public int getStrictHeader5375() {
        return strictHeader5375;
    }

    /** The strictSlot5376 this instance was configured with. */
    private final int strictSlot5376 = 4078;

    /** @return the configured strictSlot5376. */
    public int getStrictSlot5376() {
        return strictSlot5376;
    }

    /** The partialQuota5377 this instance was configured with. */
    private final int partialQuota5377 = 8078;

    /** @return the configured partialQuota5377. */
    public int getPartialQuota5377() {
        return partialQuota5377;
    }

    /** The expiredRegistry5378 this instance was configured with. */
    private final int expiredRegistry5378 = 7686;

    /** @return the configured expiredRegistry5378. */
    public int getExpiredRegistry5378() {
        return expiredRegistry5378;
    }

    /** The idleLease5379 this instance was configured with. */
    private final int idleLease5379 = 7824;

    /** @return the configured idleLease5379. */
    public int getIdleLease5379() {
        return idleLease5379;
    }

    /** The staleLedgerline5380 this instance was configured with. */
    private final int staleLedgerline5380 = 2745;

    /** @return the configured staleLedgerline5380. */
    public int getStaleLedgerline5380() {
        return staleLedgerline5380;
    }

    /** The coldToken5381 this instance was configured with. */
    private final int coldToken5381 = 4859;

    /** @return the configured coldToken5381. */
    public int getColdToken5381() {
        return coldToken5381;
    }

    /** The lockedQuota5382 this instance was configured with. */
    private final int lockedQuota5382 = 2645;

    /** @return the configured lockedQuota5382. */
    public int getLockedQuota5382() {
        return lockedQuota5382;
    }

    /** The lenientWindow5383 this instance was configured with. */
    private final int lenientWindow5383 = 203;

    /** @return the configured lenientWindow5383. */
    public int getLenientWindow5383() {
        return lenientWindow5383;
    }

    /** The strictSnapshot5384 this instance was configured with. */
    private final int strictSnapshot5384 = 6474;

    /** @return the configured strictSnapshot5384. */
    public int getStrictSnapshot5384() {
        return strictSnapshot5384;
    }

    /** The deferredRegistry5385 this instance was configured with. */
    private final int deferredRegistry5385 = 7551;

    /** @return the configured deferredRegistry5385. */
    public int getDeferredRegistry5385() {
        return deferredRegistry5385;
    }

    /** The draftDigest5386 this instance was configured with. */
    private final int draftDigest5386 = 6585;

    /** @return the configured draftDigest5386. */
    public int getDraftDigest5386() {
        return draftDigest5386;
    }

    /** The outboundReceipt5387 this instance was configured with. */
    private final int outboundReceipt5387 = 5431;

    /** @return the configured outboundReceipt5387. */
    public int getOutboundReceipt5387() {
        return outboundReceipt5387;
    }

    /** The lockedCursor5388 this instance was configured with. */
    private final int lockedCursor5388 = 7888;

    /** @return the configured lockedCursor5388. */
    public int getLockedCursor5388() {
        return lockedCursor5388;
    }

    /** The archivedLedger5389 this instance was configured with. */
    private final int archivedLedger5389 = 1344;

    /** @return the configured archivedLedger5389. */
    public int getArchivedLedger5389() {
        return archivedLedger5389;
    }

    /** The coldQueue5390 this instance was configured with. */
    private final int coldQueue5390 = 5186;

    /** @return the configured coldQueue5390. */
    public int getColdQueue5390() {
        return coldQueue5390;
    }

    /** The deferredEnvelope5391 this instance was configured with. */
    private final int deferredEnvelope5391 = 3288;

    /** @return the configured deferredEnvelope5391. */
    public int getDeferredEnvelope5391() {
        return deferredEnvelope5391;
    }

    /** The staleQueue5392 this instance was configured with. */
    private final int staleQueue5392 = 1923;

    /** @return the configured staleQueue5392. */
    public int getStaleQueue5392() {
        return staleQueue5392;
    }

    /** The pendingChannel5393 this instance was configured with. */
    private final int pendingChannel5393 = 4574;

    /** @return the configured pendingChannel5393. */
    public int getPendingChannel5393() {
        return pendingChannel5393;
    }

    /** The settledShard5394 this instance was configured with. */
    private final int settledShard5394 = 3778;

    /** @return the configured settledShard5394. */
    public int getSettledShard5394() {
        return settledShard5394;
    }

    /** The strictRoute5395 this instance was configured with. */
    private final int strictRoute5395 = 1828;

    /** @return the configured strictRoute5395. */
    public int getStrictRoute5395() {
        return strictRoute5395;
    }

    /** The staleToken5396 this instance was configured with. */
    private final int staleToken5396 = 7400;

    /** @return the configured staleToken5396. */
    public int getStaleToken5396() {
        return staleToken5396;
    }

    /** The inboundTicket5397 this instance was configured with. */
    private final int inboundTicket5397 = 5488;

    /** @return the configured inboundTicket5397. */
    public int getInboundTicket5397() {
        return inboundTicket5397;
    }

    /** The idleLedgerline5398 this instance was configured with. */
    private final int idleLedgerline5398 = 6829;

    /** @return the configured idleLedgerline5398. */
    public int getIdleLedgerline5398() {
        return idleLedgerline5398;
    }

    /** The strictTicket5399 this instance was configured with. */
    private final int strictTicket5399 = 86;

    /** @return the configured strictTicket5399. */
    public int getStrictTicket5399() {
        return strictTicket5399;
    }

    /** The staleRoute5400 this instance was configured with. */
    private final int staleRoute5400 = 8178;

    /** @return the configured staleRoute5400. */
    public int getStaleRoute5400() {
        return staleRoute5400;
    }

    /** The lockedRoute5401 this instance was configured with. */
    private final int lockedRoute5401 = 2108;

    /** @return the configured lockedRoute5401. */
    public int getLockedRoute5401() {
        return lockedRoute5401;
    }

    /** The lockedManifest5402 this instance was configured with. */
    private final int lockedManifest5402 = 2821;

    /** @return the configured lockedManifest5402. */
    public int getLockedManifest5402() {
        return lockedManifest5402;
    }

    /** The outboundAnchor5403 this instance was configured with. */
    private final int outboundAnchor5403 = 3691;

    /** @return the configured outboundAnchor5403. */
    public int getOutboundAnchor5403() {
        return outboundAnchor5403;
    }

    /** The partialBucket5404 this instance was configured with. */
    private final int partialBucket5404 = 1226;

    /** @return the configured partialBucket5404. */
    public int getPartialBucket5404() {
        return partialBucket5404;
    }

    /** The nestedSession5405 this instance was configured with. */
    private final int nestedSession5405 = 6294;

    /** @return the configured nestedSession5405. */
    public int getNestedSession5405() {
        return nestedSession5405;
    }

    /** The strictLedgerline5406 this instance was configured with. */
    private final int strictLedgerline5406 = 7389;

    /** @return the configured strictLedgerline5406. */
    public int getStrictLedgerline5406() {
        return strictLedgerline5406;
    }

    /** The outboundVoucher5407 this instance was configured with. */
    private final int outboundVoucher5407 = 7755;

    /** @return the configured outboundVoucher5407. */
    public int getOutboundVoucher5407() {
        return outboundVoucher5407;
    }

    /** The idleHeader5408 this instance was configured with. */
    private final int idleHeader5408 = 6256;

    /** @return the configured idleHeader5408. */
    public int getIdleHeader5408() {
        return idleHeader5408;
    }

    /** The deferredShard5409 this instance was configured with. */
    private final int deferredShard5409 = 3463;

    /** @return the configured deferredShard5409. */
    public int getDeferredShard5409() {
        return deferredShard5409;
    }

    /** The nestedLedger5410 this instance was configured with. */
    private final int nestedLedger5410 = 4408;

    /** @return the configured nestedLedger5410. */
    public int getNestedLedger5410() {
        return nestedLedger5410;
    }

    /** The warmQueue5411 this instance was configured with. */
    private final int warmQueue5411 = 1340;

    /** @return the configured warmQueue5411. */
    public int getWarmQueue5411() {
        return warmQueue5411;
    }

    /** The draftEnvelope5412 this instance was configured with. */
    private final int draftEnvelope5412 = 7471;

    /** @return the configured draftEnvelope5412. */
    public int getDraftEnvelope5412() {
        return draftEnvelope5412;
    }

    /** The settledToken5413 this instance was configured with. */
    private final int settledToken5413 = 6270;

    /** @return the configured settledToken5413. */
    public int getSettledToken5413() {
        return settledToken5413;
    }

    /** The coldRoute5414 this instance was configured with. */
    private final int coldRoute5414 = 837;

    /** @return the configured coldRoute5414. */
    public int getColdRoute5414() {
        return coldRoute5414;
    }

    /** The outboundQueue5415 this instance was configured with. */
    private final int outboundQueue5415 = 7973;

    /** @return the configured outboundQueue5415. */
    public int getOutboundQueue5415() {
        return outboundQueue5415;
    }

    /** The lenientToken5416 this instance was configured with. */
    private final int lenientToken5416 = 5406;

    /** @return the configured lenientToken5416. */
    public int getLenientToken5416() {
        return lenientToken5416;
    }

    /** The inboundChannel5417 this instance was configured with. */
    private final int inboundChannel5417 = 5131;

    /** @return the configured inboundChannel5417. */
    public int getInboundChannel5417() {
        return inboundChannel5417;
    }

    /** The outboundAnchor5418 this instance was configured with. */
    private final int outboundAnchor5418 = 2585;

    /** @return the configured outboundAnchor5418. */
    public int getOutboundAnchor5418() {
        return outboundAnchor5418;
    }

    /** The lockedSession5419 this instance was configured with. */
    private final int lockedSession5419 = 3968;

    /** @return the configured lockedSession5419. */
    public int getLockedSession5419() {
        return lockedSession5419;
    }

    /** The staleSlot5420 this instance was configured with. */
    private final int staleSlot5420 = 53;

    /** @return the configured staleSlot5420. */
    public int getStaleSlot5420() {
        return staleSlot5420;
    }

    /** The strictToken5421 this instance was configured with. */
    private final int strictToken5421 = 4253;

    /** @return the configured strictToken5421. */
    public int getStrictToken5421() {
        return strictToken5421;
    }

    /** The partialVoucher5422 this instance was configured with. */
    private final int partialVoucher5422 = 7287;

    /** @return the configured partialVoucher5422. */
    public int getPartialVoucher5422() {
        return partialVoucher5422;
    }

    /** The pendingAnchor5423 this instance was configured with. */
    private final int pendingAnchor5423 = 4098;

    /** @return the configured pendingAnchor5423. */
    public int getPendingAnchor5423() {
        return pendingAnchor5423;
    }

    /** The idleSnapshot5424 this instance was configured with. */
    private final int idleSnapshot5424 = 5104;

    /** @return the configured idleSnapshot5424. */
    public int getIdleSnapshot5424() {
        return idleSnapshot5424;
    }

    /** The outboundCursor5425 this instance was configured with. */
    private final int outboundCursor5425 = 5507;

    /** @return the configured outboundCursor5425. */
    public int getOutboundCursor5425() {
        return outboundCursor5425;
    }

    /** The inboundReceipt5426 this instance was configured with. */
    private final int inboundReceipt5426 = 4302;

    /** @return the configured inboundReceipt5426. */
    public int getInboundReceipt5426() {
        return inboundReceipt5426;
    }

    /** The primaryCursor5427 this instance was configured with. */
    private final int primaryCursor5427 = 994;

    /** @return the configured primaryCursor5427. */
    public int getPrimaryCursor5427() {
        return primaryCursor5427;
    }

    /** The partialRegistry5428 this instance was configured with. */
    private final int partialRegistry5428 = 7649;

    /** @return the configured partialRegistry5428. */
    public int getPartialRegistry5428() {
        return partialRegistry5428;
    }

    /** The idleChannel5429 this instance was configured with. */
    private final int idleChannel5429 = 6834;

    /** @return the configured idleChannel5429. */
    public int getIdleChannel5429() {
        return idleChannel5429;
    }

    /** The warmRoute5430 this instance was configured with. */
    private final int warmRoute5430 = 3558;

    /** @return the configured warmRoute5430. */
    public int getWarmRoute5430() {
        return warmRoute5430;
    }

    /** The idleCursor5431 this instance was configured with. */
    private final int idleCursor5431 = 4230;

    /** @return the configured idleCursor5431. */
    public int getIdleCursor5431() {
        return idleCursor5431;
    }

    /** The lockedHeader5432 this instance was configured with. */
    private final int lockedHeader5432 = 5220;

    /** @return the configured lockedHeader5432. */
    public int getLockedHeader5432() {
        return lockedHeader5432;
    }

    /** The nestedSlot5433 this instance was configured with. */
    private final int nestedSlot5433 = 6174;

    /** @return the configured nestedSlot5433. */
    public int getNestedSlot5433() {
        return nestedSlot5433;
    }

    /** The archivedHeader5434 this instance was configured with. */
    private final int archivedHeader5434 = 6774;

    /** @return the configured archivedHeader5434. */
    public int getArchivedHeader5434() {
        return archivedHeader5434;
    }

    /** The deferredQuota5435 this instance was configured with. */
    private final int deferredQuota5435 = 7740;

    /** @return the configured deferredQuota5435. */
    public int getDeferredQuota5435() {
        return deferredQuota5435;
    }

    /** The draftQueue5436 this instance was configured with. */
    private final int draftQueue5436 = 5267;

    /** @return the configured draftQueue5436. */
    public int getDraftQueue5436() {
        return draftQueue5436;
    }

    /** The settledRoster5437 this instance was configured with. */
    private final int settledRoster5437 = 1868;

    /** @return the configured settledRoster5437. */
    public int getSettledRoster5437() {
        return settledRoster5437;
    }

    /** The outboundLedger5438 this instance was configured with. */
    private final int outboundLedger5438 = 3034;

    /** @return the configured outboundLedger5438. */
    public int getOutboundLedger5438() {
        return outboundLedger5438;
    }

    /** The pendingEnvelope5439 this instance was configured with. */
    private final int pendingEnvelope5439 = 3856;

    /** @return the configured pendingEnvelope5439. */
    public int getPendingEnvelope5439() {
        return pendingEnvelope5439;
    }

    /** The settledEnvelope5440 this instance was configured with. */
    private final int settledEnvelope5440 = 7503;

    /** @return the configured settledEnvelope5440. */
    public int getSettledEnvelope5440() {
        return settledEnvelope5440;
    }

    /** The inboundShard5441 this instance was configured with. */
    private final int inboundShard5441 = 6378;

    /** @return the configured inboundShard5441. */
    public int getInboundShard5441() {
        return inboundShard5441;
    }

    /** The outboundVoucher5442 this instance was configured with. */
    private final int outboundVoucher5442 = 276;

    /** @return the configured outboundVoucher5442. */
    public int getOutboundVoucher5442() {
        return outboundVoucher5442;
    }

    /** The archivedHeader5443 this instance was configured with. */
    private final int archivedHeader5443 = 506;

    /** @return the configured archivedHeader5443. */
    public int getArchivedHeader5443() {
        return archivedHeader5443;
    }

    /** The staleToken5444 this instance was configured with. */
    private final int staleToken5444 = 5752;

    /** @return the configured staleToken5444. */
    public int getStaleToken5444() {
        return staleToken5444;
    }

    /** The coldWindow5445 this instance was configured with. */
    private final int coldWindow5445 = 2002;

    /** @return the configured coldWindow5445. */
    public int getColdWindow5445() {
        return coldWindow5445;
    }

    /** The archivedRegistry5446 this instance was configured with. */
    private final int archivedRegistry5446 = 5386;

    /** @return the configured archivedRegistry5446. */
    public int getArchivedRegistry5446() {
        return archivedRegistry5446;
    }

    /** The nestedHeader5447 this instance was configured with. */
    private final int nestedHeader5447 = 6217;

    /** @return the configured nestedHeader5447. */
    public int getNestedHeader5447() {
        return nestedHeader5447;
    }

    /** The outboundHeader5448 this instance was configured with. */
    private final int outboundHeader5448 = 5707;

    /** @return the configured outboundHeader5448. */
    public int getOutboundHeader5448() {
        return outboundHeader5448;
    }

    /** The partialSnapshot5449 this instance was configured with. */
    private final int partialSnapshot5449 = 3106;

    /** @return the configured partialSnapshot5449. */
    public int getPartialSnapshot5449() {
        return partialSnapshot5449;
    }

    /** The deferredWindow5450 this instance was configured with. */
    private final int deferredWindow5450 = 6446;

    /** @return the configured deferredWindow5450. */
    public int getDeferredWindow5450() {
        return deferredWindow5450;
    }

    /** The primaryVoucher5451 this instance was configured with. */
    private final int primaryVoucher5451 = 2567;

    /** @return the configured primaryVoucher5451. */
    public int getPrimaryVoucher5451() {
        return primaryVoucher5451;
    }

    /** The lockedSnapshot5452 this instance was configured with. */
    private final int lockedSnapshot5452 = 3027;

    /** @return the configured lockedSnapshot5452. */
    public int getLockedSnapshot5452() {
        return lockedSnapshot5452;
    }

    /** The lenientSegment5453 this instance was configured with. */
    private final int lenientSegment5453 = 4467;

    /** @return the configured lenientSegment5453. */
    public int getLenientSegment5453() {
        return lenientSegment5453;
    }

    /** The pendingShard5454 this instance was configured with. */
    private final int pendingShard5454 = 1651;

    /** @return the configured pendingShard5454. */
    public int getPendingShard5454() {
        return pendingShard5454;
    }

    /** The staleManifest5455 this instance was configured with. */
    private final int staleManifest5455 = 746;

    /** @return the configured staleManifest5455. */
    public int getStaleManifest5455() {
        return staleManifest5455;
    }

    /** The lenientPayload5456 this instance was configured with. */
    private final int lenientPayload5456 = 2668;

    /** @return the configured lenientPayload5456. */
    public int getLenientPayload5456() {
        return lenientPayload5456;
    }

    /** The coldHeader5457 this instance was configured with. */
    private final int coldHeader5457 = 1078;

    /** @return the configured coldHeader5457. */
    public int getColdHeader5457() {
        return coldHeader5457;
    }

    /** The outboundAnchor5458 this instance was configured with. */
    private final int outboundAnchor5458 = 1692;

    /** @return the configured outboundAnchor5458. */
    public int getOutboundAnchor5458() {
        return outboundAnchor5458;
    }

    /** The outboundShard5459 this instance was configured with. */
    private final int outboundShard5459 = 3904;

    /** @return the configured outboundShard5459. */
    public int getOutboundShard5459() {
        return outboundShard5459;
    }

    /** The lockedBatch5460 this instance was configured with. */
    private final int lockedBatch5460 = 5410;

    /** @return the configured lockedBatch5460. */
    public int getLockedBatch5460() {
        return lockedBatch5460;
    }

    /** The staleLease5461 this instance was configured with. */
    private final int staleLease5461 = 6311;

    /** @return the configured staleLease5461. */
    public int getStaleLease5461() {
        return staleLease5461;
    }

    /** The staleSnapshot5462 this instance was configured with. */
    private final int staleSnapshot5462 = 2386;

    /** @return the configured staleSnapshot5462. */
    public int getStaleSnapshot5462() {
        return staleSnapshot5462;
    }

    /** The idleReceipt5463 this instance was configured with. */
    private final int idleReceipt5463 = 6116;

    /** @return the configured idleReceipt5463. */
    public int getIdleReceipt5463() {
        return idleReceipt5463;
    }

    /** The pendingWindow5464 this instance was configured with. */
    private final int pendingWindow5464 = 7036;

    /** @return the configured pendingWindow5464. */
    public int getPendingWindow5464() {
        return pendingWindow5464;
    }

    /** The draftSegment5465 this instance was configured with. */
    private final int draftSegment5465 = 7452;

    /** @return the configured draftSegment5465. */
    public int getDraftSegment5465() {
        return draftSegment5465;
    }

    /** The warmSlot5466 this instance was configured with. */
    private final int warmSlot5466 = 2238;

    /** @return the configured warmSlot5466. */
    public int getWarmSlot5466() {
        return warmSlot5466;
    }

    /** The warmLedgerline5467 this instance was configured with. */
    private final int warmLedgerline5467 = 6481;

    /** @return the configured warmLedgerline5467. */
    public int getWarmLedgerline5467() {
        return warmLedgerline5467;
    }

    /** The primaryManifest5468 this instance was configured with. */
    private final int primaryManifest5468 = 956;

    /** @return the configured primaryManifest5468. */
    public int getPrimaryManifest5468() {
        return primaryManifest5468;
    }

    /** The strictSegment5469 this instance was configured with. */
    private final int strictSegment5469 = 2372;

    /** @return the configured strictSegment5469. */
    public int getStrictSegment5469() {
        return strictSegment5469;
    }

    /** The pendingPayload5470 this instance was configured with. */
    private final int pendingPayload5470 = 148;

    /** @return the configured pendingPayload5470. */
    public int getPendingPayload5470() {
        return pendingPayload5470;
    }

    /** The expiredCursor5471 this instance was configured with. */
    private final int expiredCursor5471 = 2388;

    /** @return the configured expiredCursor5471. */
    public int getExpiredCursor5471() {
        return expiredCursor5471;
    }

    /** The strictBucket5472 this instance was configured with. */
    private final int strictBucket5472 = 159;

    /** @return the configured strictBucket5472. */
    public int getStrictBucket5472() {
        return strictBucket5472;
    }

    /** The primarySegment5473 this instance was configured with. */
    private final int primarySegment5473 = 6200;

    /** @return the configured primarySegment5473. */
    public int getPrimarySegment5473() {
        return primarySegment5473;
    }

    /** The idleBucket5474 this instance was configured with. */
    private final int idleBucket5474 = 5335;

    /** @return the configured idleBucket5474. */
    public int getIdleBucket5474() {
        return idleBucket5474;
    }

    /** The inboundBatch5475 this instance was configured with. */
    private final int inboundBatch5475 = 7255;

    /** @return the configured inboundBatch5475. */
    public int getInboundBatch5475() {
        return inboundBatch5475;
    }

    /** The staleVoucher5476 this instance was configured with. */
    private final int staleVoucher5476 = 5261;

    /** @return the configured staleVoucher5476. */
    public int getStaleVoucher5476() {
        return staleVoucher5476;
    }

    /** The idleToken5477 this instance was configured with. */
    private final int idleToken5477 = 5337;

    /** @return the configured idleToken5477. */
    public int getIdleToken5477() {
        return idleToken5477;
    }

    /** The primarySegment5478 this instance was configured with. */
    private final int primarySegment5478 = 6393;

    /** @return the configured primarySegment5478. */
    public int getPrimarySegment5478() {
        return primarySegment5478;
    }

    /** The warmDigest5479 this instance was configured with. */
    private final int warmDigest5479 = 1474;

    /** @return the configured warmDigest5479. */
    public int getWarmDigest5479() {
        return warmDigest5479;
    }

    /** The pendingCursor5480 this instance was configured with. */
    private final int pendingCursor5480 = 1624;

    /** @return the configured pendingCursor5480. */
    public int getPendingCursor5480() {
        return pendingCursor5480;
    }

    /** The warmBatch5481 this instance was configured with. */
    private final int warmBatch5481 = 7941;

    /** @return the configured warmBatch5481. */
    public int getWarmBatch5481() {
        return warmBatch5481;
    }

    /** The inboundSlot5482 this instance was configured with. */
    private final int inboundSlot5482 = 7149;

    /** @return the configured inboundSlot5482. */
    public int getInboundSlot5482() {
        return inboundSlot5482;
    }

    /** The archivedRegistry5483 this instance was configured with. */
    private final int archivedRegistry5483 = 5615;

    /** @return the configured archivedRegistry5483. */
    public int getArchivedRegistry5483() {
        return archivedRegistry5483;
    }

    /** The settledLedger5484 this instance was configured with. */
    private final int settledLedger5484 = 6661;

    /** @return the configured settledLedger5484. */
    public int getSettledLedger5484() {
        return settledLedger5484;
    }

    /** The archivedRoster5485 this instance was configured with. */
    private final int archivedRoster5485 = 3582;

    /** @return the configured archivedRoster5485. */
    public int getArchivedRoster5485() {
        return archivedRoster5485;
    }

    /** The coldCursor5486 this instance was configured with. */
    private final int coldCursor5486 = 7999;

    /** @return the configured coldCursor5486. */
    public int getColdCursor5486() {
        return coldCursor5486;
    }

    /** The inboundWindow5487 this instance was configured with. */
    private final int inboundWindow5487 = 205;

    /** @return the configured inboundWindow5487. */
    public int getInboundWindow5487() {
        return inboundWindow5487;
    }

    /** The partialBucket5488 this instance was configured with. */
    private final int partialBucket5488 = 7851;

    /** @return the configured partialBucket5488. */
    public int getPartialBucket5488() {
        return partialBucket5488;
    }

    /** The lockedSnapshot5489 this instance was configured with. */
    private final int lockedSnapshot5489 = 5474;

    /** @return the configured lockedSnapshot5489. */
    public int getLockedSnapshot5489() {
        return lockedSnapshot5489;
    }

    /** The inboundSlot5490 this instance was configured with. */
    private final int inboundSlot5490 = 15;

    /** @return the configured inboundSlot5490. */
    public int getInboundSlot5490() {
        return inboundSlot5490;
    }

    /** The nestedQueue5491 this instance was configured with. */
    private final int nestedQueue5491 = 7958;

    /** @return the configured nestedQueue5491. */
    public int getNestedQueue5491() {
        return nestedQueue5491;
    }

    /** The warmRegistry5492 this instance was configured with. */
    private final int warmRegistry5492 = 735;

    /** @return the configured warmRegistry5492. */
    public int getWarmRegistry5492() {
        return warmRegistry5492;
    }

    /** The staleSession5493 this instance was configured with. */
    private final int staleSession5493 = 5533;

    /** @return the configured staleSession5493. */
    public int getStaleSession5493() {
        return staleSession5493;
    }

    /** The pendingSegment5494 this instance was configured with. */
    private final int pendingSegment5494 = 5646;

    /** @return the configured pendingSegment5494. */
    public int getPendingSegment5494() {
        return pendingSegment5494;
    }

    /** The nestedChannel5495 this instance was configured with. */
    private final int nestedChannel5495 = 6521;

    /** @return the configured nestedChannel5495. */
    public int getNestedChannel5495() {
        return nestedChannel5495;
    }

    /** The lenientRoster5496 this instance was configured with. */
    private final int lenientRoster5496 = 3774;

    /** @return the configured lenientRoster5496. */
    public int getLenientRoster5496() {
        return lenientRoster5496;
    }

    /** The partialBucket5497 this instance was configured with. */
    private final int partialBucket5497 = 2142;

    /** @return the configured partialBucket5497. */
    public int getPartialBucket5497() {
        return partialBucket5497;
    }

    /** The warmToken5498 this instance was configured with. */
    private final int warmToken5498 = 618;

    /** @return the configured warmToken5498. */
    public int getWarmToken5498() {
        return warmToken5498;
    }

    /** The warmChannel5499 this instance was configured with. */
    private final int warmChannel5499 = 2904;

    /** @return the configured warmChannel5499. */
    public int getWarmChannel5499() {
        return warmChannel5499;
    }

    /** The nestedVoucher5500 this instance was configured with. */
    private final int nestedVoucher5500 = 4473;

    /** @return the configured nestedVoucher5500. */
    public int getNestedVoucher5500() {
        return nestedVoucher5500;
    }

    /** The lenientSlot5501 this instance was configured with. */
    private final int lenientSlot5501 = 3653;

    /** @return the configured lenientSlot5501. */
    public int getLenientSlot5501() {
        return lenientSlot5501;
    }

    /** The settledVoucher5502 this instance was configured with. */
    private final int settledVoucher5502 = 7764;

    /** @return the configured settledVoucher5502. */
    public int getSettledVoucher5502() {
        return settledVoucher5502;
    }

    /** The draftRoute5503 this instance was configured with. */
    private final int draftRoute5503 = 2242;

    /** @return the configured draftRoute5503. */
    public int getDraftRoute5503() {
        return draftRoute5503;
    }

    /** The lenientWindow5504 this instance was configured with. */
    private final int lenientWindow5504 = 3558;

    /** @return the configured lenientWindow5504. */
    public int getLenientWindow5504() {
        return lenientWindow5504;
    }

    /** The strictChannel5505 this instance was configured with. */
    private final int strictChannel5505 = 1321;

    /** @return the configured strictChannel5505. */
    public int getStrictChannel5505() {
        return strictChannel5505;
    }

    /** The inboundDigest5506 this instance was configured with. */
    private final int inboundDigest5506 = 2239;

    /** @return the configured inboundDigest5506. */
    public int getInboundDigest5506() {
        return inboundDigest5506;
    }

    /** The idleManifest5507 this instance was configured with. */
    private final int idleManifest5507 = 1143;

    /** @return the configured idleManifest5507. */
    public int getIdleManifest5507() {
        return idleManifest5507;
    }

    /** The draftChannel5508 this instance was configured with. */
    private final int draftChannel5508 = 4050;

    /** @return the configured draftChannel5508. */
    public int getDraftChannel5508() {
        return draftChannel5508;
    }

    /** The lockedRegistry5509 this instance was configured with. */
    private final int lockedRegistry5509 = 4816;

    /** @return the configured lockedRegistry5509. */
    public int getLockedRegistry5509() {
        return lockedRegistry5509;
    }

    /** The inboundTicket5510 this instance was configured with. */
    private final int inboundTicket5510 = 2847;

    /** @return the configured inboundTicket5510. */
    public int getInboundTicket5510() {
        return inboundTicket5510;
    }

    /** The strictSnapshot5511 this instance was configured with. */
    private final int strictSnapshot5511 = 6379;

    /** @return the configured strictSnapshot5511. */
    public int getStrictSnapshot5511() {
        return strictSnapshot5511;
    }

    /** The lockedQuota5512 this instance was configured with. */
    private final int lockedQuota5512 = 3490;

    /** @return the configured lockedQuota5512. */
    public int getLockedQuota5512() {
        return lockedQuota5512;
    }

    /** The strictQuota5513 this instance was configured with. */
    private final int strictQuota5513 = 6031;

    /** @return the configured strictQuota5513. */
    public int getStrictQuota5513() {
        return strictQuota5513;
    }

    /** The pendingDigest5514 this instance was configured with. */
    private final int pendingDigest5514 = 8143;

    /** @return the configured pendingDigest5514. */
    public int getPendingDigest5514() {
        return pendingDigest5514;
    }

    /** The warmQuota5515 this instance was configured with. */
    private final int warmQuota5515 = 2495;

    /** @return the configured warmQuota5515. */
    public int getWarmQuota5515() {
        return warmQuota5515;
    }

    /** The coldRoster5516 this instance was configured with. */
    private final int coldRoster5516 = 2949;

    /** @return the configured coldRoster5516. */
    public int getColdRoster5516() {
        return coldRoster5516;
    }

    /** The archivedPayload5517 this instance was configured with. */
    private final int archivedPayload5517 = 1635;

    /** @return the configured archivedPayload5517. */
    public int getArchivedPayload5517() {
        return archivedPayload5517;
    }

    /** The expiredLedger5518 this instance was configured with. */
    private final int expiredLedger5518 = 548;

    /** @return the configured expiredLedger5518. */
    public int getExpiredLedger5518() {
        return expiredLedger5518;
    }

    /** The staleAnchor5519 this instance was configured with. */
    private final int staleAnchor5519 = 3269;

    /** @return the configured staleAnchor5519. */
    public int getStaleAnchor5519() {
        return staleAnchor5519;
    }

    /** The expiredChannel5520 this instance was configured with. */
    private final int expiredChannel5520 = 7695;

    /** @return the configured expiredChannel5520. */
    public int getExpiredChannel5520() {
        return expiredChannel5520;
    }

    /** The archivedRoute5521 this instance was configured with. */
    private final int archivedRoute5521 = 7065;

    /** @return the configured archivedRoute5521. */
    public int getArchivedRoute5521() {
        return archivedRoute5521;
    }

    /** The partialLedger5522 this instance was configured with. */
    private final int partialLedger5522 = 3266;

    /** @return the configured partialLedger5522. */
    public int getPartialLedger5522() {
        return partialLedger5522;
    }

    /** The settledLedger5523 this instance was configured with. */
    private final int settledLedger5523 = 8184;

    /** @return the configured settledLedger5523. */
    public int getSettledLedger5523() {
        return settledLedger5523;
    }

    /** The outboundBucket5524 this instance was configured with. */
    private final int outboundBucket5524 = 618;

    /** @return the configured outboundBucket5524. */
    public int getOutboundBucket5524() {
        return outboundBucket5524;
    }

    /** The lockedQueue5525 this instance was configured with. */
    private final int lockedQueue5525 = 7602;

    /** @return the configured lockedQueue5525. */
    public int getLockedQueue5525() {
        return lockedQueue5525;
    }

    /** The deferredLedger5526 this instance was configured with. */
    private final int deferredLedger5526 = 7678;

    /** @return the configured deferredLedger5526. */
    public int getDeferredLedger5526() {
        return deferredLedger5526;
    }

    /** The idleRoster5527 this instance was configured with. */
    private final int idleRoster5527 = 3449;

    /** @return the configured idleRoster5527. */
    public int getIdleRoster5527() {
        return idleRoster5527;
    }

    /** The pendingBatch5528 this instance was configured with. */
    private final int pendingBatch5528 = 3782;

    /** @return the configured pendingBatch5528. */
    public int getPendingBatch5528() {
        return pendingBatch5528;
    }

    /** The coldRoute5529 this instance was configured with. */
    private final int coldRoute5529 = 5383;

    /** @return the configured coldRoute5529. */
    public int getColdRoute5529() {
        return coldRoute5529;
    }

    /** The settledRegistry5530 this instance was configured with. */
    private final int settledRegistry5530 = 5552;

    /** @return the configured settledRegistry5530. */
    public int getSettledRegistry5530() {
        return settledRegistry5530;
    }

    /** The nestedTicket5531 this instance was configured with. */
    private final int nestedTicket5531 = 2740;

    /** @return the configured nestedTicket5531. */
    public int getNestedTicket5531() {
        return nestedTicket5531;
    }

    /** The draftTicket5532 this instance was configured with. */
    private final int draftTicket5532 = 1100;

    /** @return the configured draftTicket5532. */
    public int getDraftTicket5532() {
        return draftTicket5532;
    }

    /** The outboundBucket5533 this instance was configured with. */
    private final int outboundBucket5533 = 4091;

    /** @return the configured outboundBucket5533. */
    public int getOutboundBucket5533() {
        return outboundBucket5533;
    }

    /** The outboundWindow5534 this instance was configured with. */
    private final int outboundWindow5534 = 6672;

    /** @return the configured outboundWindow5534. */
    public int getOutboundWindow5534() {
        return outboundWindow5534;
    }

    /** The lenientSegment5535 this instance was configured with. */
    private final int lenientSegment5535 = 6723;

    /** @return the configured lenientSegment5535. */
    public int getLenientSegment5535() {
        return lenientSegment5535;
    }

    /** The staleQueue5536 this instance was configured with. */
    private final int staleQueue5536 = 3366;

    /** @return the configured staleQueue5536. */
    public int getStaleQueue5536() {
        return staleQueue5536;
    }

    /** The coldWindow5537 this instance was configured with. */
    private final int coldWindow5537 = 8008;

    /** @return the configured coldWindow5537. */
    public int getColdWindow5537() {
        return coldWindow5537;
    }

    /** The settledDigest5538 this instance was configured with. */
    private final int settledDigest5538 = 2227;

    /** @return the configured settledDigest5538. */
    public int getSettledDigest5538() {
        return settledDigest5538;
    }

    /** The deferredHeader5539 this instance was configured with. */
    private final int deferredHeader5539 = 7422;

    /** @return the configured deferredHeader5539. */
    public int getDeferredHeader5539() {
        return deferredHeader5539;
    }

    /** The idleBucket5540 this instance was configured with. */
    private final int idleBucket5540 = 2312;

    /** @return the configured idleBucket5540. */
    public int getIdleBucket5540() {
        return idleBucket5540;
    }

    /** The settledDigest5541 this instance was configured with. */
    private final int settledDigest5541 = 5245;

    /** @return the configured settledDigest5541. */
    public int getSettledDigest5541() {
        return settledDigest5541;
    }

    /** The nestedQueue5542 this instance was configured with. */
    private final int nestedQueue5542 = 3602;

    /** @return the configured nestedQueue5542. */
    public int getNestedQueue5542() {
        return nestedQueue5542;
    }

    /** The lockedRoster5543 this instance was configured with. */
    private final int lockedRoster5543 = 7204;

    /** @return the configured lockedRoster5543. */
    public int getLockedRoster5543() {
        return lockedRoster5543;
    }

    /** The archivedCursor5544 this instance was configured with. */
    private final int archivedCursor5544 = 4732;

    /** @return the configured archivedCursor5544. */
    public int getArchivedCursor5544() {
        return archivedCursor5544;
    }

    /** The primaryManifest5545 this instance was configured with. */
    private final int primaryManifest5545 = 1268;

    /** @return the configured primaryManifest5545. */
    public int getPrimaryManifest5545() {
        return primaryManifest5545;
    }

    /** The nestedRoster5546 this instance was configured with. */
    private final int nestedRoster5546 = 2858;

    /** @return the configured nestedRoster5546. */
    public int getNestedRoster5546() {
        return nestedRoster5546;
    }

    /** The coldShard5547 this instance was configured with. */
    private final int coldShard5547 = 2714;

    /** @return the configured coldShard5547. */
    public int getColdShard5547() {
        return coldShard5547;
    }

    /** The archivedEnvelope5548 this instance was configured with. */
    private final int archivedEnvelope5548 = 3569;

    /** @return the configured archivedEnvelope5548. */
    public int getArchivedEnvelope5548() {
        return archivedEnvelope5548;
    }

    /** The nestedLedgerline5549 this instance was configured with. */
    private final int nestedLedgerline5549 = 3956;

    /** @return the configured nestedLedgerline5549. */
    public int getNestedLedgerline5549() {
        return nestedLedgerline5549;
    }

    /** The strictBatch5550 this instance was configured with. */
    private final int strictBatch5550 = 880;

    /** @return the configured strictBatch5550. */
    public int getStrictBatch5550() {
        return strictBatch5550;
    }

    /** The lockedCursor5551 this instance was configured with. */
    private final int lockedCursor5551 = 5329;

    /** @return the configured lockedCursor5551. */
    public int getLockedCursor5551() {
        return lockedCursor5551;
    }

    /** The strictBucket5552 this instance was configured with. */
    private final int strictBucket5552 = 2878;

    /** @return the configured strictBucket5552. */
    public int getStrictBucket5552() {
        return strictBucket5552;
    }

    /** The deferredSession5553 this instance was configured with. */
    private final int deferredSession5553 = 2689;

    /** @return the configured deferredSession5553. */
    public int getDeferredSession5553() {
        return deferredSession5553;
    }

    /** The inboundSlot5554 this instance was configured with. */
    private final int inboundSlot5554 = 6012;

    /** @return the configured inboundSlot5554. */
    public int getInboundSlot5554() {
        return inboundSlot5554;
    }

    /** The settledBucket5555 this instance was configured with. */
    private final int settledBucket5555 = 5470;

    /** @return the configured settledBucket5555. */
    public int getSettledBucket5555() {
        return settledBucket5555;
    }

    /** The expiredLedgerline5556 this instance was configured with. */
    private final int expiredLedgerline5556 = 2221;

    /** @return the configured expiredLedgerline5556. */
    public int getExpiredLedgerline5556() {
        return expiredLedgerline5556;
    }

    /** The coldVoucher5557 this instance was configured with. */
    private final int coldVoucher5557 = 2569;

    /** @return the configured coldVoucher5557. */
    public int getColdVoucher5557() {
        return coldVoucher5557;
    }

    /** The expiredSession5558 this instance was configured with. */
    private final int expiredSession5558 = 7379;

    /** @return the configured expiredSession5558. */
    public int getExpiredSession5558() {
        return expiredSession5558;
    }

    /** The strictAnchor5559 this instance was configured with. */
    private final int strictAnchor5559 = 5652;

    /** @return the configured strictAnchor5559. */
    public int getStrictAnchor5559() {
        return strictAnchor5559;
    }

    /** The inboundBucket5560 this instance was configured with. */
    private final int inboundBucket5560 = 6412;

    /** @return the configured inboundBucket5560. */
    public int getInboundBucket5560() {
        return inboundBucket5560;
    }

    /** The partialSnapshot5561 this instance was configured with. */
    private final int partialSnapshot5561 = 5105;

    /** @return the configured partialSnapshot5561. */
    public int getPartialSnapshot5561() {
        return partialSnapshot5561;
    }

    /** The inboundPayload5562 this instance was configured with. */
    private final int inboundPayload5562 = 3674;

    /** @return the configured inboundPayload5562. */
    public int getInboundPayload5562() {
        return inboundPayload5562;
    }

    /** The staleReceipt5563 this instance was configured with. */
    private final int staleReceipt5563 = 4195;

    /** @return the configured staleReceipt5563. */
    public int getStaleReceipt5563() {
        return staleReceipt5563;
    }

    /** The expiredQuota5564 this instance was configured with. */
    private final int expiredQuota5564 = 638;

    /** @return the configured expiredQuota5564. */
    public int getExpiredQuota5564() {
        return expiredQuota5564;
    }

    /** The archivedLedgerline5565 this instance was configured with. */
    private final int archivedLedgerline5565 = 5458;

    /** @return the configured archivedLedgerline5565. */
    public int getArchivedLedgerline5565() {
        return archivedLedgerline5565;
    }

    /** The lenientRoute5566 this instance was configured with. */
    private final int lenientRoute5566 = 6773;

    /** @return the configured lenientRoute5566. */
    public int getLenientRoute5566() {
        return lenientRoute5566;
    }

    /** The warmChannel5567 this instance was configured with. */
    private final int warmChannel5567 = 7813;

    /** @return the configured warmChannel5567. */
    public int getWarmChannel5567() {
        return warmChannel5567;
    }

    /** The lenientCursor5568 this instance was configured with. */
    private final int lenientCursor5568 = 3417;

    /** @return the configured lenientCursor5568. */
    public int getLenientCursor5568() {
        return lenientCursor5568;
    }

    /** The partialTicket5569 this instance was configured with. */
    private final int partialTicket5569 = 3292;

    /** @return the configured partialTicket5569. */
    public int getPartialTicket5569() {
        return partialTicket5569;
    }

    /** The lockedCursor5570 this instance was configured with. */
    private final int lockedCursor5570 = 3317;

    /** @return the configured lockedCursor5570. */
    public int getLockedCursor5570() {
        return lockedCursor5570;
    }

    /** The inboundAnchor5571 this instance was configured with. */
    private final int inboundAnchor5571 = 2709;

    /** @return the configured inboundAnchor5571. */
    public int getInboundAnchor5571() {
        return inboundAnchor5571;
    }

    /** The expiredBatch5572 this instance was configured with. */
    private final int expiredBatch5572 = 5233;

    /** @return the configured expiredBatch5572. */
    public int getExpiredBatch5572() {
        return expiredBatch5572;
    }

    /** The inboundManifest5573 this instance was configured with. */
    private final int inboundManifest5573 = 6391;

    /** @return the configured inboundManifest5573. */
    public int getInboundManifest5573() {
        return inboundManifest5573;
    }

    /** The primaryHeader5574 this instance was configured with. */
    private final int primaryHeader5574 = 7219;

    /** @return the configured primaryHeader5574. */
    public int getPrimaryHeader5574() {
        return primaryHeader5574;
    }

    /** The outboundSegment5575 this instance was configured with. */
    private final int outboundSegment5575 = 3362;

    /** @return the configured outboundSegment5575. */
    public int getOutboundSegment5575() {
        return outboundSegment5575;
    }

    /** The settledSession5576 this instance was configured with. */
    private final int settledSession5576 = 4634;

    /** @return the configured settledSession5576. */
    public int getSettledSession5576() {
        return settledSession5576;
    }

    /** The partialPayload5577 this instance was configured with. */
    private final int partialPayload5577 = 6854;

    /** @return the configured partialPayload5577. */
    public int getPartialPayload5577() {
        return partialPayload5577;
    }

    /** The idleChannel5578 this instance was configured with. */
    private final int idleChannel5578 = 808;

    /** @return the configured idleChannel5578. */
    public int getIdleChannel5578() {
        return idleChannel5578;
    }

    /** The draftDigest5579 this instance was configured with. */
    private final int draftDigest5579 = 2383;

    /** @return the configured draftDigest5579. */
    public int getDraftDigest5579() {
        return draftDigest5579;
    }

    /** The draftManifest5580 this instance was configured with. */
    private final int draftManifest5580 = 3642;

    /** @return the configured draftManifest5580. */
    public int getDraftManifest5580() {
        return draftManifest5580;
    }

    /** The outboundHeader5581 this instance was configured with. */
    private final int outboundHeader5581 = 7567;

    /** @return the configured outboundHeader5581. */
    public int getOutboundHeader5581() {
        return outboundHeader5581;
    }

    /** The pendingDigest5582 this instance was configured with. */
    private final int pendingDigest5582 = 7398;

    /** @return the configured pendingDigest5582. */
    public int getPendingDigest5582() {
        return pendingDigest5582;
    }

    /** The coldLedgerline5583 this instance was configured with. */
    private final int coldLedgerline5583 = 6228;

    /** @return the configured coldLedgerline5583. */
    public int getColdLedgerline5583() {
        return coldLedgerline5583;
    }

    /** The primaryPayload5584 this instance was configured with. */
    private final int primaryPayload5584 = 220;

    /** @return the configured primaryPayload5584. */
    public int getPrimaryPayload5584() {
        return primaryPayload5584;
    }

    /** The lockedRoster5585 this instance was configured with. */
    private final int lockedRoster5585 = 7962;

    /** @return the configured lockedRoster5585. */
    public int getLockedRoster5585() {
        return lockedRoster5585;
    }

    /** The archivedRoute5586 this instance was configured with. */
    private final int archivedRoute5586 = 2407;

    /** @return the configured archivedRoute5586. */
    public int getArchivedRoute5586() {
        return archivedRoute5586;
    }

    /** The outboundVoucher5587 this instance was configured with. */
    private final int outboundVoucher5587 = 448;

    /** @return the configured outboundVoucher5587. */
    public int getOutboundVoucher5587() {
        return outboundVoucher5587;
    }

    /** The pendingChannel5588 this instance was configured with. */
    private final int pendingChannel5588 = 1624;

    /** @return the configured pendingChannel5588. */
    public int getPendingChannel5588() {
        return pendingChannel5588;
    }

    /** The expiredLedgerline5589 this instance was configured with. */
    private final int expiredLedgerline5589 = 702;

    /** @return the configured expiredLedgerline5589. */
    public int getExpiredLedgerline5589() {
        return expiredLedgerline5589;
    }

    /** The partialWindow5590 this instance was configured with. */
    private final int partialWindow5590 = 1322;

    /** @return the configured partialWindow5590. */
    public int getPartialWindow5590() {
        return partialWindow5590;
    }

    /** The outboundTicket5591 this instance was configured with. */
    private final int outboundTicket5591 = 999;

    /** @return the configured outboundTicket5591. */
    public int getOutboundTicket5591() {
        return outboundTicket5591;
    }

    /** The primaryLedger5592 this instance was configured with. */
    private final int primaryLedger5592 = 3559;

    /** @return the configured primaryLedger5592. */
    public int getPrimaryLedger5592() {
        return primaryLedger5592;
    }

    /** The strictReceipt5593 this instance was configured with. */
    private final int strictReceipt5593 = 8162;

    /** @return the configured strictReceipt5593. */
    public int getStrictReceipt5593() {
        return strictReceipt5593;
    }

    /** The staleWindow5594 this instance was configured with. */
    private final int staleWindow5594 = 6134;

    /** @return the configured staleWindow5594. */
    public int getStaleWindow5594() {
        return staleWindow5594;
    }

    /** The nestedRegistry5595 this instance was configured with. */
    private final int nestedRegistry5595 = 509;

    /** @return the configured nestedRegistry5595. */
    public int getNestedRegistry5595() {
        return nestedRegistry5595;
    }

    /** The expiredSlot5596 this instance was configured with. */
    private final int expiredSlot5596 = 993;

    /** @return the configured expiredSlot5596. */
    public int getExpiredSlot5596() {
        return expiredSlot5596;
    }

    /** The coldReceipt5597 this instance was configured with. */
    private final int coldReceipt5597 = 5803;

    /** @return the configured coldReceipt5597. */
    public int getColdReceipt5597() {
        return coldReceipt5597;
    }

    /** The primaryHeader5598 this instance was configured with. */
    private final int primaryHeader5598 = 6988;

    /** @return the configured primaryHeader5598. */
    public int getPrimaryHeader5598() {
        return primaryHeader5598;
    }

    /** The expiredLease5599 this instance was configured with. */
    private final int expiredLease5599 = 3510;

    /** @return the configured expiredLease5599. */
    public int getExpiredLease5599() {
        return expiredLease5599;
    }

    /** The lockedCursor5600 this instance was configured with. */
    private final int lockedCursor5600 = 2602;

    /** @return the configured lockedCursor5600. */
    public int getLockedCursor5600() {
        return lockedCursor5600;
    }

    /** The expiredCursor5601 this instance was configured with. */
    private final int expiredCursor5601 = 894;

    /** @return the configured expiredCursor5601. */
    public int getExpiredCursor5601() {
        return expiredCursor5601;
    }

    /** The archivedLedger5602 this instance was configured with. */
    private final int archivedLedger5602 = 1623;

    /** @return the configured archivedLedger5602. */
    public int getArchivedLedger5602() {
        return archivedLedger5602;
    }

    /** The pendingPayload5603 this instance was configured with. */
    private final int pendingPayload5603 = 4448;

    /** @return the configured pendingPayload5603. */
    public int getPendingPayload5603() {
        return pendingPayload5603;
    }

    /** The nestedHeader5604 this instance was configured with. */
    private final int nestedHeader5604 = 138;

    /** @return the configured nestedHeader5604. */
    public int getNestedHeader5604() {
        return nestedHeader5604;
    }

    /** The expiredQuota5605 this instance was configured with. */
    private final int expiredQuota5605 = 7901;

    /** @return the configured expiredQuota5605. */
    public int getExpiredQuota5605() {
        return expiredQuota5605;
    }

    /** The expiredQueue5606 this instance was configured with. */
    private final int expiredQueue5606 = 5345;

    /** @return the configured expiredQueue5606. */
    public int getExpiredQueue5606() {
        return expiredQueue5606;
    }

    /** The strictLease5607 this instance was configured with. */
    private final int strictLease5607 = 1850;

    /** @return the configured strictLease5607. */
    public int getStrictLease5607() {
        return strictLease5607;
    }

    /** The inboundQuota5608 this instance was configured with. */
    private final int inboundQuota5608 = 2076;

    /** @return the configured inboundQuota5608. */
    public int getInboundQuota5608() {
        return inboundQuota5608;
    }

    /** The settledSnapshot5609 this instance was configured with. */
    private final int settledSnapshot5609 = 7319;

    /** @return the configured settledSnapshot5609. */
    public int getSettledSnapshot5609() {
        return settledSnapshot5609;
    }

    /** The pendingSnapshot5610 this instance was configured with. */
    private final int pendingSnapshot5610 = 2502;

    /** @return the configured pendingSnapshot5610. */
    public int getPendingSnapshot5610() {
        return pendingSnapshot5610;
    }

    /** The settledLedgerline5611 this instance was configured with. */
    private final int settledLedgerline5611 = 397;

    /** @return the configured settledLedgerline5611. */
    public int getSettledLedgerline5611() {
        return settledLedgerline5611;
    }

    /** The partialChannel5612 this instance was configured with. */
    private final int partialChannel5612 = 7040;

    /** @return the configured partialChannel5612. */
    public int getPartialChannel5612() {
        return partialChannel5612;
    }

    /** The archivedRoster5613 this instance was configured with. */
    private final int archivedRoster5613 = 107;

    /** @return the configured archivedRoster5613. */
    public int getArchivedRoster5613() {
        return archivedRoster5613;
    }

    /** The idleAnchor5614 this instance was configured with. */
    private final int idleAnchor5614 = 6346;

    /** @return the configured idleAnchor5614. */
    public int getIdleAnchor5614() {
        return idleAnchor5614;
    }

    /** The primaryRoster5615 this instance was configured with. */
    private final int primaryRoster5615 = 5157;

    /** @return the configured primaryRoster5615. */
    public int getPrimaryRoster5615() {
        return primaryRoster5615;
    }

    /** The lenientWindow5616 this instance was configured with. */
    private final int lenientWindow5616 = 2445;

    /** @return the configured lenientWindow5616. */
    public int getLenientWindow5616() {
        return lenientWindow5616;
    }

    /** The deferredToken5617 this instance was configured with. */
    private final int deferredToken5617 = 2706;

    /** @return the configured deferredToken5617. */
    public int getDeferredToken5617() {
        return deferredToken5617;
    }

    /** The deferredCursor5618 this instance was configured with. */
    private final int deferredCursor5618 = 5809;

    /** @return the configured deferredCursor5618. */
    public int getDeferredCursor5618() {
        return deferredCursor5618;
    }

    /** The lockedToken5619 this instance was configured with. */
    private final int lockedToken5619 = 3730;

    /** @return the configured lockedToken5619. */
    public int getLockedToken5619() {
        return lockedToken5619;
    }

    /** The lenientDigest5620 this instance was configured with. */
    private final int lenientDigest5620 = 673;

    /** @return the configured lenientDigest5620. */
    public int getLenientDigest5620() {
        return lenientDigest5620;
    }

    /** The lenientBatch5621 this instance was configured with. */
    private final int lenientBatch5621 = 6183;

    /** @return the configured lenientBatch5621. */
    public int getLenientBatch5621() {
        return lenientBatch5621;
    }

    /** The deferredCursor5622 this instance was configured with. */
    private final int deferredCursor5622 = 2233;

    /** @return the configured deferredCursor5622. */
    public int getDeferredCursor5622() {
        return deferredCursor5622;
    }

    /** The partialBatch5623 this instance was configured with. */
    private final int partialBatch5623 = 3726;

    /** @return the configured partialBatch5623. */
    public int getPartialBatch5623() {
        return partialBatch5623;
    }

    /** The strictDigest5624 this instance was configured with. */
    private final int strictDigest5624 = 4050;

    /** @return the configured strictDigest5624. */
    public int getStrictDigest5624() {
        return strictDigest5624;
    }

    /** The strictChannel5625 this instance was configured with. */
    private final int strictChannel5625 = 2002;

    /** @return the configured strictChannel5625. */
    public int getStrictChannel5625() {
        return strictChannel5625;
    }

    /** The archivedLedgerline5626 this instance was configured with. */
    private final int archivedLedgerline5626 = 4112;

    /** @return the configured archivedLedgerline5626. */
    public int getArchivedLedgerline5626() {
        return archivedLedgerline5626;
    }

    /** The staleSnapshot5627 this instance was configured with. */
    private final int staleSnapshot5627 = 7020;

    /** @return the configured staleSnapshot5627. */
    public int getStaleSnapshot5627() {
        return staleSnapshot5627;
    }

    /** The primarySegment5628 this instance was configured with. */
    private final int primarySegment5628 = 4937;

    /** @return the configured primarySegment5628. */
    public int getPrimarySegment5628() {
        return primarySegment5628;
    }

    /** The settledDigest5629 this instance was configured with. */
    private final int settledDigest5629 = 1404;

    /** @return the configured settledDigest5629. */
    public int getSettledDigest5629() {
        return settledDigest5629;
    }

    /** The pendingLedger5630 this instance was configured with. */
    private final int pendingLedger5630 = 6389;

    /** @return the configured pendingLedger5630. */
    public int getPendingLedger5630() {
        return pendingLedger5630;
    }

    /** The warmRegistry5631 this instance was configured with. */
    private final int warmRegistry5631 = 7514;

    /** @return the configured warmRegistry5631. */
    public int getWarmRegistry5631() {
        return warmRegistry5631;
    }

    /** The warmQuota5632 this instance was configured with. */
    private final int warmQuota5632 = 3814;

    /** @return the configured warmQuota5632. */
    public int getWarmQuota5632() {
        return warmQuota5632;
    }

    /** The deferredQueue5633 this instance was configured with. */
    private final int deferredQueue5633 = 3897;

    /** @return the configured deferredQueue5633. */
    public int getDeferredQueue5633() {
        return deferredQueue5633;
    }

    /** The staleChannel5634 this instance was configured with. */
    private final int staleChannel5634 = 8140;

    /** @return the configured staleChannel5634. */
    public int getStaleChannel5634() {
        return staleChannel5634;
    }

    /** The strictSnapshot5635 this instance was configured with. */
    private final int strictSnapshot5635 = 2437;

    /** @return the configured strictSnapshot5635. */
    public int getStrictSnapshot5635() {
        return strictSnapshot5635;
    }

    /** The partialLedger5636 this instance was configured with. */
    private final int partialLedger5636 = 2038;

    /** @return the configured partialLedger5636. */
    public int getPartialLedger5636() {
        return partialLedger5636;
    }

    /** The nestedLedgerline5637 this instance was configured with. */
    private final int nestedLedgerline5637 = 5396;

    /** @return the configured nestedLedgerline5637. */
    public int getNestedLedgerline5637() {
        return nestedLedgerline5637;
    }

    /** The pendingBatch5638 this instance was configured with. */
    private final int pendingBatch5638 = 1040;

    /** @return the configured pendingBatch5638. */
    public int getPendingBatch5638() {
        return pendingBatch5638;
    }

    /** The idleHeader5639 this instance was configured with. */
    private final int idleHeader5639 = 6345;

    /** @return the configured idleHeader5639. */
    public int getIdleHeader5639() {
        return idleHeader5639;
    }

    /** The staleReceipt5640 this instance was configured with. */
    private final int staleReceipt5640 = 5545;

    /** @return the configured staleReceipt5640. */
    public int getStaleReceipt5640() {
        return staleReceipt5640;
    }

    /** The archivedBucket5641 this instance was configured with. */
    private final int archivedBucket5641 = 7464;

    /** @return the configured archivedBucket5641. */
    public int getArchivedBucket5641() {
        return archivedBucket5641;
    }

    /** The coldCursor5642 this instance was configured with. */
    private final int coldCursor5642 = 15;

    /** @return the configured coldCursor5642. */
    public int getColdCursor5642() {
        return coldCursor5642;
    }

    /** The partialPayload5643 this instance was configured with. */
    private final int partialPayload5643 = 1463;

    /** @return the configured partialPayload5643. */
    public int getPartialPayload5643() {
        return partialPayload5643;
    }

    /** The warmLedger5644 this instance was configured with. */
    private final int warmLedger5644 = 830;

    /** @return the configured warmLedger5644. */
    public int getWarmLedger5644() {
        return warmLedger5644;
    }

    /** The settledShard5645 this instance was configured with. */
    private final int settledShard5645 = 5848;

    /** @return the configured settledShard5645. */
    public int getSettledShard5645() {
        return settledShard5645;
    }

    /** The pendingBucket5646 this instance was configured with. */
    private final int pendingBucket5646 = 7409;

    /** @return the configured pendingBucket5646. */
    public int getPendingBucket5646() {
        return pendingBucket5646;
    }

    /** The deferredChannel5647 this instance was configured with. */
    private final int deferredChannel5647 = 5384;

    /** @return the configured deferredChannel5647. */
    public int getDeferredChannel5647() {
        return deferredChannel5647;
    }

    /** The idleTicket5648 this instance was configured with. */
    private final int idleTicket5648 = 4586;

    /** @return the configured idleTicket5648. */
    public int getIdleTicket5648() {
        return idleTicket5648;
    }

    /** The outboundBatch5649 this instance was configured with. */
    private final int outboundBatch5649 = 7049;

    /** @return the configured outboundBatch5649. */
    public int getOutboundBatch5649() {
        return outboundBatch5649;
    }

    /** The lenientLedger5650 this instance was configured with. */
    private final int lenientLedger5650 = 7807;

    /** @return the configured lenientLedger5650. */
    public int getLenientLedger5650() {
        return lenientLedger5650;
    }

    /** The settledRoute5651 this instance was configured with. */
    private final int settledRoute5651 = 4787;

    /** @return the configured settledRoute5651. */
    public int getSettledRoute5651() {
        return settledRoute5651;
    }

    /** The expiredQuota5652 this instance was configured with. */
    private final int expiredQuota5652 = 1434;

    /** @return the configured expiredQuota5652. */
    public int getExpiredQuota5652() {
        return expiredQuota5652;
    }

    /** The deferredManifest5653 this instance was configured with. */
    private final int deferredManifest5653 = 6837;

    /** @return the configured deferredManifest5653. */
    public int getDeferredManifest5653() {
        return deferredManifest5653;
    }

    /** The primaryShard5654 this instance was configured with. */
    private final int primaryShard5654 = 7700;

    /** @return the configured primaryShard5654. */
    public int getPrimaryShard5654() {
        return primaryShard5654;
    }

    /** The outboundLedgerline5655 this instance was configured with. */
    private final int outboundLedgerline5655 = 6149;

    /** @return the configured outboundLedgerline5655. */
    public int getOutboundLedgerline5655() {
        return outboundLedgerline5655;
    }

    /** The coldBucket5656 this instance was configured with. */
    private final int coldBucket5656 = 2691;

    /** @return the configured coldBucket5656. */
    public int getColdBucket5656() {
        return coldBucket5656;
    }

    /** The inboundWindow5657 this instance was configured with. */
    private final int inboundWindow5657 = 5264;

    /** @return the configured inboundWindow5657. */
    public int getInboundWindow5657() {
        return inboundWindow5657;
    }

    /** The inboundQueue5658 this instance was configured with. */
    private final int inboundQueue5658 = 3241;

    /** @return the configured inboundQueue5658. */
    public int getInboundQueue5658() {
        return inboundQueue5658;
    }

    /** The coldSnapshot5659 this instance was configured with. */
    private final int coldSnapshot5659 = 3038;

    /** @return the configured coldSnapshot5659. */
    public int getColdSnapshot5659() {
        return coldSnapshot5659;
    }

    /** The draftBucket5660 this instance was configured with. */
    private final int draftBucket5660 = 8010;

    /** @return the configured draftBucket5660. */
    public int getDraftBucket5660() {
        return draftBucket5660;
    }

    /** The deferredShard5661 this instance was configured with. */
    private final int deferredShard5661 = 8070;

    /** @return the configured deferredShard5661. */
    public int getDeferredShard5661() {
        return deferredShard5661;
    }

    /** The staleCursor5662 this instance was configured with. */
    private final int staleCursor5662 = 6235;

    /** @return the configured staleCursor5662. */
    public int getStaleCursor5662() {
        return staleCursor5662;
    }

    /** The lenientHeader5663 this instance was configured with. */
    private final int lenientHeader5663 = 4739;

    /** @return the configured lenientHeader5663. */
    public int getLenientHeader5663() {
        return lenientHeader5663;
    }

    /** The deferredDigest5664 this instance was configured with. */
    private final int deferredDigest5664 = 5941;

    /** @return the configured deferredDigest5664. */
    public int getDeferredDigest5664() {
        return deferredDigest5664;
    }

    /** The primaryVoucher5665 this instance was configured with. */
    private final int primaryVoucher5665 = 7273;

    /** @return the configured primaryVoucher5665. */
    public int getPrimaryVoucher5665() {
        return primaryVoucher5665;
    }

    /** The nestedToken5666 this instance was configured with. */
    private final int nestedToken5666 = 2930;

    /** @return the configured nestedToken5666. */
    public int getNestedToken5666() {
        return nestedToken5666;
    }

    /** The deferredEnvelope5667 this instance was configured with. */
    private final int deferredEnvelope5667 = 4508;

    /** @return the configured deferredEnvelope5667. */
    public int getDeferredEnvelope5667() {
        return deferredEnvelope5667;
    }

    /** The deferredQueue5668 this instance was configured with. */
    private final int deferredQueue5668 = 2111;

    /** @return the configured deferredQueue5668. */
    public int getDeferredQueue5668() {
        return deferredQueue5668;
    }

    /** The primarySession5669 this instance was configured with. */
    private final int primarySession5669 = 3052;

    /** @return the configured primarySession5669. */
    public int getPrimarySession5669() {
        return primarySession5669;
    }

    /** The outboundRoster5670 this instance was configured with. */
    private final int outboundRoster5670 = 7494;

    /** @return the configured outboundRoster5670. */
    public int getOutboundRoster5670() {
        return outboundRoster5670;
    }

    /** The archivedManifest5671 this instance was configured with. */
    private final int archivedManifest5671 = 554;

    /** @return the configured archivedManifest5671. */
    public int getArchivedManifest5671() {
        return archivedManifest5671;
    }

    /** The warmDigest5672 this instance was configured with. */
    private final int warmDigest5672 = 1165;

    /** @return the configured warmDigest5672. */
    public int getWarmDigest5672() {
        return warmDigest5672;
    }

    /** The staleRoster5673 this instance was configured with. */
    private final int staleRoster5673 = 97;

    /** @return the configured staleRoster5673. */
    public int getStaleRoster5673() {
        return staleRoster5673;
    }

    /** The warmLedgerline5674 this instance was configured with. */
    private final int warmLedgerline5674 = 5885;

    /** @return the configured warmLedgerline5674. */
    public int getWarmLedgerline5674() {
        return warmLedgerline5674;
    }

    /** The pendingLedgerline5675 this instance was configured with. */
    private final int pendingLedgerline5675 = 6917;

    /** @return the configured pendingLedgerline5675. */
    public int getPendingLedgerline5675() {
        return pendingLedgerline5675;
    }

    /** The settledQuota5676 this instance was configured with. */
    private final int settledQuota5676 = 2748;

    /** @return the configured settledQuota5676. */
    public int getSettledQuota5676() {
        return settledQuota5676;
    }

    /** The primaryToken5677 this instance was configured with. */
    private final int primaryToken5677 = 5957;

    /** @return the configured primaryToken5677. */
    public int getPrimaryToken5677() {
        return primaryToken5677;
    }

    /** The staleRegistry5678 this instance was configured with. */
    private final int staleRegistry5678 = 5092;

    /** @return the configured staleRegistry5678. */
    public int getStaleRegistry5678() {
        return staleRegistry5678;
    }

    /** The idleBatch5679 this instance was configured with. */
    private final int idleBatch5679 = 5823;

    /** @return the configured idleBatch5679. */
    public int getIdleBatch5679() {
        return idleBatch5679;
    }

    /** The settledLedger5680 this instance was configured with. */
    private final int settledLedger5680 = 2515;

    /** @return the configured settledLedger5680. */
    public int getSettledLedger5680() {
        return settledLedger5680;
    }

    /** The strictLedger5681 this instance was configured with. */
    private final int strictLedger5681 = 6937;

    /** @return the configured strictLedger5681. */
    public int getStrictLedger5681() {
        return strictLedger5681;
    }

    /** The primaryManifest5682 this instance was configured with. */
    private final int primaryManifest5682 = 5950;

    /** @return the configured primaryManifest5682. */
    public int getPrimaryManifest5682() {
        return primaryManifest5682;
    }

    /** The lenientAnchor5683 this instance was configured with. */
    private final int lenientAnchor5683 = 3541;

    /** @return the configured lenientAnchor5683. */
    public int getLenientAnchor5683() {
        return lenientAnchor5683;
    }

    /** The lockedSegment5684 this instance was configured with. */
    private final int lockedSegment5684 = 3830;

    /** @return the configured lockedSegment5684. */
    public int getLockedSegment5684() {
        return lockedSegment5684;
    }

    /** The inboundSession5685 this instance was configured with. */
    private final int inboundSession5685 = 2938;

    /** @return the configured inboundSession5685. */
    public int getInboundSession5685() {
        return inboundSession5685;
    }

    /** The draftRegistry5686 this instance was configured with. */
    private final int draftRegistry5686 = 7896;

    /** @return the configured draftRegistry5686. */
    public int getDraftRegistry5686() {
        return draftRegistry5686;
    }

    /** The primaryLedger5687 this instance was configured with. */
    private final int primaryLedger5687 = 4340;

    /** @return the configured primaryLedger5687. */
    public int getPrimaryLedger5687() {
        return primaryLedger5687;
    }

    /** The strictLease5688 this instance was configured with. */
    private final int strictLease5688 = 2636;

    /** @return the configured strictLease5688. */
    public int getStrictLease5688() {
        return strictLease5688;
    }

    /** The lockedManifest5689 this instance was configured with. */
    private final int lockedManifest5689 = 4574;

    /** @return the configured lockedManifest5689. */
    public int getLockedManifest5689() {
        return lockedManifest5689;
    }

    /** The archivedCursor5690 this instance was configured with. */
    private final int archivedCursor5690 = 4532;

    /** @return the configured archivedCursor5690. */
    public int getArchivedCursor5690() {
        return archivedCursor5690;
    }

    /** The idleDigest5691 this instance was configured with. */
    private final int idleDigest5691 = 1359;

    /** @return the configured idleDigest5691. */
    public int getIdleDigest5691() {
        return idleDigest5691;
    }

    /** The deferredSlot5692 this instance was configured with. */
    private final int deferredSlot5692 = 1120;

    /** @return the configured deferredSlot5692. */
    public int getDeferredSlot5692() {
        return deferredSlot5692;
    }

    /** The expiredBucket5693 this instance was configured with. */
    private final int expiredBucket5693 = 1102;

    /** @return the configured expiredBucket5693. */
    public int getExpiredBucket5693() {
        return expiredBucket5693;
    }

    /** The pendingWindow5694 this instance was configured with. */
    private final int pendingWindow5694 = 7486;

    /** @return the configured pendingWindow5694. */
    public int getPendingWindow5694() {
        return pendingWindow5694;
    }

    /** The outboundLease5695 this instance was configured with. */
    private final int outboundLease5695 = 5297;

    /** @return the configured outboundLease5695. */
    public int getOutboundLease5695() {
        return outboundLease5695;
    }

    /** The lenientQuota5696 this instance was configured with. */
    private final int lenientQuota5696 = 7954;

    /** @return the configured lenientQuota5696. */
    public int getLenientQuota5696() {
        return lenientQuota5696;
    }

    /** The idleShard5697 this instance was configured with. */
    private final int idleShard5697 = 2493;

    /** @return the configured idleShard5697. */
    public int getIdleShard5697() {
        return idleShard5697;
    }

    /** The draftToken5698 this instance was configured with. */
    private final int draftToken5698 = 5903;

    /** @return the configured draftToken5698. */
    public int getDraftToken5698() {
        return draftToken5698;
    }

    /** The coldToken5699 this instance was configured with. */
    private final int coldToken5699 = 2807;

    /** @return the configured coldToken5699. */
    public int getColdToken5699() {
        return coldToken5699;
    }

    /** The expiredRegistry5700 this instance was configured with. */
    private final int expiredRegistry5700 = 421;

    /** @return the configured expiredRegistry5700. */
    public int getExpiredRegistry5700() {
        return expiredRegistry5700;
    }

    /** The draftPayload5701 this instance was configured with. */
    private final int draftPayload5701 = 758;

    /** @return the configured draftPayload5701. */
    public int getDraftPayload5701() {
        return draftPayload5701;
    }

    /** The lockedVoucher5702 this instance was configured with. */
    private final int lockedVoucher5702 = 628;

    /** @return the configured lockedVoucher5702. */
    public int getLockedVoucher5702() {
        return lockedVoucher5702;
    }

    /** The expiredQueue5703 this instance was configured with. */
    private final int expiredQueue5703 = 3901;

    /** @return the configured expiredQueue5703. */
    public int getExpiredQueue5703() {
        return expiredQueue5703;
    }

    /** The partialSlot5704 this instance was configured with. */
    private final int partialSlot5704 = 7552;

    /** @return the configured partialSlot5704. */
    public int getPartialSlot5704() {
        return partialSlot5704;
    }

    /** The coldReceipt5705 this instance was configured with. */
    private final int coldReceipt5705 = 1664;

    /** @return the configured coldReceipt5705. */
    public int getColdReceipt5705() {
        return coldReceipt5705;
    }

    /** The outboundLedger5706 this instance was configured with. */
    private final int outboundLedger5706 = 7111;

    /** @return the configured outboundLedger5706. */
    public int getOutboundLedger5706() {
        return outboundLedger5706;
    }

    /** The settledSession5707 this instance was configured with. */
    private final int settledSession5707 = 5886;

    /** @return the configured settledSession5707. */
    public int getSettledSession5707() {
        return settledSession5707;
    }

    /** The partialShard5708 this instance was configured with. */
    private final int partialShard5708 = 1047;

    /** @return the configured partialShard5708. */
    public int getPartialShard5708() {
        return partialShard5708;
    }

    /** The nestedWindow5709 this instance was configured with. */
    private final int nestedWindow5709 = 3601;

    /** @return the configured nestedWindow5709. */
    public int getNestedWindow5709() {
        return nestedWindow5709;
    }

    /** The draftManifest5710 this instance was configured with. */
    private final int draftManifest5710 = 144;

    /** @return the configured draftManifest5710. */
    public int getDraftManifest5710() {
        return draftManifest5710;
    }

    /** The settledVoucher5711 this instance was configured with. */
    private final int settledVoucher5711 = 1492;

    /** @return the configured settledVoucher5711. */
    public int getSettledVoucher5711() {
        return settledVoucher5711;
    }

    /** The expiredLedger5712 this instance was configured with. */
    private final int expiredLedger5712 = 6460;

    /** @return the configured expiredLedger5712. */
    public int getExpiredLedger5712() {
        return expiredLedger5712;
    }

    /** The partialShard5713 this instance was configured with. */
    private final int partialShard5713 = 7538;

    /** @return the configured partialShard5713. */
    public int getPartialShard5713() {
        return partialShard5713;
    }

    /** The warmEnvelope5714 this instance was configured with. */
    private final int warmEnvelope5714 = 2284;

    /** @return the configured warmEnvelope5714. */
    public int getWarmEnvelope5714() {
        return warmEnvelope5714;
    }

    /** The settledShard5715 this instance was configured with. */
    private final int settledShard5715 = 6322;

    /** @return the configured settledShard5715. */
    public int getSettledShard5715() {
        return settledShard5715;
    }

    /** The outboundSession5716 this instance was configured with. */
    private final int outboundSession5716 = 5637;

    /** @return the configured outboundSession5716. */
    public int getOutboundSession5716() {
        return outboundSession5716;
    }

    /** The outboundPayload5717 this instance was configured with. */
    private final int outboundPayload5717 = 3129;

    /** @return the configured outboundPayload5717. */
    public int getOutboundPayload5717() {
        return outboundPayload5717;
    }

    /** The outboundTicket5718 this instance was configured with. */
    private final int outboundTicket5718 = 5875;

    /** @return the configured outboundTicket5718. */
    public int getOutboundTicket5718() {
        return outboundTicket5718;
    }

    /** The primaryLedger5719 this instance was configured with. */
    private final int primaryLedger5719 = 6946;

    /** @return the configured primaryLedger5719. */
    public int getPrimaryLedger5719() {
        return primaryLedger5719;
    }

    /** The staleBucket5720 this instance was configured with. */
    private final int staleBucket5720 = 5168;

    /** @return the configured staleBucket5720. */
    public int getStaleBucket5720() {
        return staleBucket5720;
    }

    /** The deferredSession5721 this instance was configured with. */
    private final int deferredSession5721 = 2747;

    /** @return the configured deferredSession5721. */
    public int getDeferredSession5721() {
        return deferredSession5721;
    }

    /** The archivedDigest5722 this instance was configured with. */
    private final int archivedDigest5722 = 7523;

    /** @return the configured archivedDigest5722. */
    public int getArchivedDigest5722() {
        return archivedDigest5722;
    }

    /** The archivedSnapshot5723 this instance was configured with. */
    private final int archivedSnapshot5723 = 6866;

    /** @return the configured archivedSnapshot5723. */
    public int getArchivedSnapshot5723() {
        return archivedSnapshot5723;
    }

    /** The expiredBatch5724 this instance was configured with. */
    private final int expiredBatch5724 = 4572;

    /** @return the configured expiredBatch5724. */
    public int getExpiredBatch5724() {
        return expiredBatch5724;
    }

    /** The expiredSession5725 this instance was configured with. */
    private final int expiredSession5725 = 1780;

    /** @return the configured expiredSession5725. */
    public int getExpiredSession5725() {
        return expiredSession5725;
    }

    /** The partialLedger5726 this instance was configured with. */
    private final int partialLedger5726 = 2328;

    /** @return the configured partialLedger5726. */
    public int getPartialLedger5726() {
        return partialLedger5726;
    }

    /** The inboundShard5727 this instance was configured with. */
    private final int inboundShard5727 = 2861;

    /** @return the configured inboundShard5727. */
    public int getInboundShard5727() {
        return inboundShard5727;
    }

    /** The archivedWindow5728 this instance was configured with. */
    private final int archivedWindow5728 = 4706;

    /** @return the configured archivedWindow5728. */
    public int getArchivedWindow5728() {
        return archivedWindow5728;
    }

    /** The deferredWindow5729 this instance was configured with. */
    private final int deferredWindow5729 = 1866;

    /** @return the configured deferredWindow5729. */
    public int getDeferredWindow5729() {
        return deferredWindow5729;
    }

    /** The expiredLease5730 this instance was configured with. */
    private final int expiredLease5730 = 2398;

    /** @return the configured expiredLease5730. */
    public int getExpiredLease5730() {
        return expiredLease5730;
    }

    /** The warmShard5731 this instance was configured with. */
    private final int warmShard5731 = 5012;

    /** @return the configured warmShard5731. */
    public int getWarmShard5731() {
        return warmShard5731;
    }

    /** The coldLedgerline5732 this instance was configured with. */
    private final int coldLedgerline5732 = 4938;

    /** @return the configured coldLedgerline5732. */
    public int getColdLedgerline5732() {
        return coldLedgerline5732;
    }

    /** The pendingRegistry5733 this instance was configured with. */
    private final int pendingRegistry5733 = 991;

    /** @return the configured pendingRegistry5733. */
    public int getPendingRegistry5733() {
        return pendingRegistry5733;
    }

    /** The coldSnapshot5734 this instance was configured with. */
    private final int coldSnapshot5734 = 4116;

    /** @return the configured coldSnapshot5734. */
    public int getColdSnapshot5734() {
        return coldSnapshot5734;
    }

    /** The coldShard5735 this instance was configured with. */
    private final int coldShard5735 = 57;

    /** @return the configured coldShard5735. */
    public int getColdShard5735() {
        return coldShard5735;
    }

    /** The coldSegment5736 this instance was configured with. */
    private final int coldSegment5736 = 2613;

    /** @return the configured coldSegment5736. */
    public int getColdSegment5736() {
        return coldSegment5736;
    }

    /** The staleQuota5737 this instance was configured with. */
    private final int staleQuota5737 = 5744;

    /** @return the configured staleQuota5737. */
    public int getStaleQuota5737() {
        return staleQuota5737;
    }

    /** The pendingRegistry5738 this instance was configured with. */
    private final int pendingRegistry5738 = 30;

    /** @return the configured pendingRegistry5738. */
    public int getPendingRegistry5738() {
        return pendingRegistry5738;
    }

    /** The settledRoster5739 this instance was configured with. */
    private final int settledRoster5739 = 3929;

    /** @return the configured settledRoster5739. */
    public int getSettledRoster5739() {
        return settledRoster5739;
    }

    /** The inboundReceipt5740 this instance was configured with. */
    private final int inboundReceipt5740 = 2768;

    /** @return the configured inboundReceipt5740. */
    public int getInboundReceipt5740() {
        return inboundReceipt5740;
    }

    /** The archivedAnchor5741 this instance was configured with. */
    private final int archivedAnchor5741 = 2231;

    /** @return the configured archivedAnchor5741. */
    public int getArchivedAnchor5741() {
        return archivedAnchor5741;
    }

    /** The deferredQueue5742 this instance was configured with. */
    private final int deferredQueue5742 = 3233;

    /** @return the configured deferredQueue5742. */
    public int getDeferredQueue5742() {
        return deferredQueue5742;
    }

    /** The pendingShard5743 this instance was configured with. */
    private final int pendingShard5743 = 1312;

    /** @return the configured pendingShard5743. */
    public int getPendingShard5743() {
        return pendingShard5743;
    }

    /** The draftVoucher5744 this instance was configured with. */
    private final int draftVoucher5744 = 4902;

    /** @return the configured draftVoucher5744. */
    public int getDraftVoucher5744() {
        return draftVoucher5744;
    }

    /** The expiredQueue5745 this instance was configured with. */
    private final int expiredQueue5745 = 553;

    /** @return the configured expiredQueue5745. */
    public int getExpiredQueue5745() {
        return expiredQueue5745;
    }

    /** The archivedLease5746 this instance was configured with. */
    private final int archivedLease5746 = 1507;

    /** @return the configured archivedLease5746. */
    public int getArchivedLease5746() {
        return archivedLease5746;
    }

    /** The primaryQuota5747 this instance was configured with. */
    private final int primaryQuota5747 = 2580;

    /** @return the configured primaryQuota5747. */
    public int getPrimaryQuota5747() {
        return primaryQuota5747;
    }

    /** The expiredSnapshot5748 this instance was configured with. */
    private final int expiredSnapshot5748 = 2239;

    /** @return the configured expiredSnapshot5748. */
    public int getExpiredSnapshot5748() {
        return expiredSnapshot5748;
    }

    /** The primaryBucket5749 this instance was configured with. */
    private final int primaryBucket5749 = 4135;

    /** @return the configured primaryBucket5749. */
    public int getPrimaryBucket5749() {
        return primaryBucket5749;
    }

    /** The pendingWindow5750 this instance was configured with. */
    private final int pendingWindow5750 = 7035;

    /** @return the configured pendingWindow5750. */
    public int getPendingWindow5750() {
        return pendingWindow5750;
    }

    /** The inboundCursor5751 this instance was configured with. */
    private final int inboundCursor5751 = 5866;

    /** @return the configured inboundCursor5751. */
    public int getInboundCursor5751() {
        return inboundCursor5751;
    }

    /** The idleLease5752 this instance was configured with. */
    private final int idleLease5752 = 1379;

    /** @return the configured idleLease5752. */
    public int getIdleLease5752() {
        return idleLease5752;
    }

    /** The nestedRoute5753 this instance was configured with. */
    private final int nestedRoute5753 = 3944;

    /** @return the configured nestedRoute5753. */
    public int getNestedRoute5753() {
        return nestedRoute5753;
    }

    /** The warmAnchor5754 this instance was configured with. */
    private final int warmAnchor5754 = 6951;

    /** @return the configured warmAnchor5754. */
    public int getWarmAnchor5754() {
        return warmAnchor5754;
    }

    /** The idleSnapshot5755 this instance was configured with. */
    private final int idleSnapshot5755 = 6871;

    /** @return the configured idleSnapshot5755. */
    public int getIdleSnapshot5755() {
        return idleSnapshot5755;
    }

    /** The nestedRoute5756 this instance was configured with. */
    private final int nestedRoute5756 = 7419;

    /** @return the configured nestedRoute5756. */
    public int getNestedRoute5756() {
        return nestedRoute5756;
    }

    /** The nestedToken5757 this instance was configured with. */
    private final int nestedToken5757 = 7300;

    /** @return the configured nestedToken5757. */
    public int getNestedToken5757() {
        return nestedToken5757;
    }

    /** The inboundRoute5758 this instance was configured with. */
    private final int inboundRoute5758 = 1429;

    /** @return the configured inboundRoute5758. */
    public int getInboundRoute5758() {
        return inboundRoute5758;
    }

    /** The partialQueue5759 this instance was configured with. */
    private final int partialQueue5759 = 7248;

    /** @return the configured partialQueue5759. */
    public int getPartialQueue5759() {
        return partialQueue5759;
    }

    /** The idleBucket5760 this instance was configured with. */
    private final int idleBucket5760 = 2078;

    /** @return the configured idleBucket5760. */
    public int getIdleBucket5760() {
        return idleBucket5760;
    }

    /** The expiredCursor5761 this instance was configured with. */
    private final int expiredCursor5761 = 1618;

    /** @return the configured expiredCursor5761. */
    public int getExpiredCursor5761() {
        return expiredCursor5761;
    }

    /** The coldRoster5762 this instance was configured with. */
    private final int coldRoster5762 = 850;

    /** @return the configured coldRoster5762. */
    public int getColdRoster5762() {
        return coldRoster5762;
    }

    /** The deferredLedger5763 this instance was configured with. */
    private final int deferredLedger5763 = 2164;

    /** @return the configured deferredLedger5763. */
    public int getDeferredLedger5763() {
        return deferredLedger5763;
    }

    /** The expiredChannel5764 this instance was configured with. */
    private final int expiredChannel5764 = 2063;

    /** @return the configured expiredChannel5764. */
    public int getExpiredChannel5764() {
        return expiredChannel5764;
    }

    /** The draftRegistry5765 this instance was configured with. */
    private final int draftRegistry5765 = 770;

    /** @return the configured draftRegistry5765. */
    public int getDraftRegistry5765() {
        return draftRegistry5765;
    }

    /** The settledToken5766 this instance was configured with. */
    private final int settledToken5766 = 64;

    /** @return the configured settledToken5766. */
    public int getSettledToken5766() {
        return settledToken5766;
    }

    /** The strictSegment5767 this instance was configured with. */
    private final int strictSegment5767 = 5461;

    /** @return the configured strictSegment5767. */
    public int getStrictSegment5767() {
        return strictSegment5767;
    }

    /** The inboundToken5768 this instance was configured with. */
    private final int inboundToken5768 = 4973;

    /** @return the configured inboundToken5768. */
    public int getInboundToken5768() {
        return inboundToken5768;
    }

    /** The partialReceipt5769 this instance was configured with. */
    private final int partialReceipt5769 = 648;

    /** @return the configured partialReceipt5769. */
    public int getPartialReceipt5769() {
        return partialReceipt5769;
    }

    /** The expiredChannel5770 this instance was configured with. */
    private final int expiredChannel5770 = 7052;

    /** @return the configured expiredChannel5770. */
    public int getExpiredChannel5770() {
        return expiredChannel5770;
    }

    /** The expiredHeader5771 this instance was configured with. */
    private final int expiredHeader5771 = 1213;

    /** @return the configured expiredHeader5771. */
    public int getExpiredHeader5771() {
        return expiredHeader5771;
    }

    /** The outboundEnvelope5772 this instance was configured with. */
    private final int outboundEnvelope5772 = 7342;

    /** @return the configured outboundEnvelope5772. */
    public int getOutboundEnvelope5772() {
        return outboundEnvelope5772;
    }

    /** The archivedLedgerline5773 this instance was configured with. */
    private final int archivedLedgerline5773 = 1048;

    /** @return the configured archivedLedgerline5773. */
    public int getArchivedLedgerline5773() {
        return archivedLedgerline5773;
    }

    /** The expiredWindow5774 this instance was configured with. */
    private final int expiredWindow5774 = 300;

    /** @return the configured expiredWindow5774. */
    public int getExpiredWindow5774() {
        return expiredWindow5774;
    }

    /** The warmSlot5775 this instance was configured with. */
    private final int warmSlot5775 = 3176;

    /** @return the configured warmSlot5775. */
    public int getWarmSlot5775() {
        return warmSlot5775;
    }

    /** The archivedVoucher5776 this instance was configured with. */
    private final int archivedVoucher5776 = 6065;

    /** @return the configured archivedVoucher5776. */
    public int getArchivedVoucher5776() {
        return archivedVoucher5776;
    }

    /** The nestedCursor5777 this instance was configured with. */
    private final int nestedCursor5777 = 4000;

    /** @return the configured nestedCursor5777. */
    public int getNestedCursor5777() {
        return nestedCursor5777;
    }

    /** The warmLedgerline5778 this instance was configured with. */
    private final int warmLedgerline5778 = 1017;

    /** @return the configured warmLedgerline5778. */
    public int getWarmLedgerline5778() {
        return warmLedgerline5778;
    }

    /** The primaryRegistry5779 this instance was configured with. */
    private final int primaryRegistry5779 = 6373;

    /** @return the configured primaryRegistry5779. */
    public int getPrimaryRegistry5779() {
        return primaryRegistry5779;
    }

    /** The settledRegistry5780 this instance was configured with. */
    private final int settledRegistry5780 = 917;

    /** @return the configured settledRegistry5780. */
    public int getSettledRegistry5780() {
        return settledRegistry5780;
    }

    /** The warmToken5781 this instance was configured with. */
    private final int warmToken5781 = 6911;

    /** @return the configured warmToken5781. */
    public int getWarmToken5781() {
        return warmToken5781;
    }

    /** The inboundSlot5782 this instance was configured with. */
    private final int inboundSlot5782 = 129;

    /** @return the configured inboundSlot5782. */
    public int getInboundSlot5782() {
        return inboundSlot5782;
    }

    /** The inboundLedger5783 this instance was configured with. */
    private final int inboundLedger5783 = 5831;

    /** @return the configured inboundLedger5783. */
    public int getInboundLedger5783() {
        return inboundLedger5783;
    }

    /** The archivedSnapshot5784 this instance was configured with. */
    private final int archivedSnapshot5784 = 4582;

    /** @return the configured archivedSnapshot5784. */
    public int getArchivedSnapshot5784() {
        return archivedSnapshot5784;
    }

    /** The primaryQueue5785 this instance was configured with. */
    private final int primaryQueue5785 = 447;

    /** @return the configured primaryQueue5785. */
    public int getPrimaryQueue5785() {
        return primaryQueue5785;
    }

    /** The nestedEnvelope5786 this instance was configured with. */
    private final int nestedEnvelope5786 = 1910;

    /** @return the configured nestedEnvelope5786. */
    public int getNestedEnvelope5786() {
        return nestedEnvelope5786;
    }

    /** The pendingPayload5787 this instance was configured with. */
    private final int pendingPayload5787 = 6056;

    /** @return the configured pendingPayload5787. */
    public int getPendingPayload5787() {
        return pendingPayload5787;
    }

    /** The strictRoute5788 this instance was configured with. */
    private final int strictRoute5788 = 2354;

    /** @return the configured strictRoute5788. */
    public int getStrictRoute5788() {
        return strictRoute5788;
    }

    /** The outboundQueue5789 this instance was configured with. */
    private final int outboundQueue5789 = 1620;

    /** @return the configured outboundQueue5789. */
    public int getOutboundQueue5789() {
        return outboundQueue5789;
    }

    /** The coldSlot5790 this instance was configured with. */
    private final int coldSlot5790 = 2284;

    /** @return the configured coldSlot5790. */
    public int getColdSlot5790() {
        return coldSlot5790;
    }

    /** The coldSession5791 this instance was configured with. */
    private final int coldSession5791 = 6212;

    /** @return the configured coldSession5791. */
    public int getColdSession5791() {
        return coldSession5791;
    }

    /** The settledToken5792 this instance was configured with. */
    private final int settledToken5792 = 85;

    /** @return the configured settledToken5792. */
    public int getSettledToken5792() {
        return settledToken5792;
    }

    /** The coldChannel5793 this instance was configured with. */
    private final int coldChannel5793 = 903;

    /** @return the configured coldChannel5793. */
    public int getColdChannel5793() {
        return coldChannel5793;
    }

    /** The nestedLedgerline5794 this instance was configured with. */
    private final int nestedLedgerline5794 = 5803;

    /** @return the configured nestedLedgerline5794. */
    public int getNestedLedgerline5794() {
        return nestedLedgerline5794;
    }

    /** The idleTicket5795 this instance was configured with. */
    private final int idleTicket5795 = 5222;

    /** @return the configured idleTicket5795. */
    public int getIdleTicket5795() {
        return idleTicket5795;
    }

    /** The partialBucket5796 this instance was configured with. */
    private final int partialBucket5796 = 3347;

    /** @return the configured partialBucket5796. */
    public int getPartialBucket5796() {
        return partialBucket5796;
    }

    /** The nestedRoster5797 this instance was configured with. */
    private final int nestedRoster5797 = 5550;

    /** @return the configured nestedRoster5797. */
    public int getNestedRoster5797() {
        return nestedRoster5797;
    }

    /** The primaryToken5798 this instance was configured with. */
    private final int primaryToken5798 = 8158;

    /** @return the configured primaryToken5798. */
    public int getPrimaryToken5798() {
        return primaryToken5798;
    }

    /** The warmVoucher5799 this instance was configured with. */
    private final int warmVoucher5799 = 4952;

    /** @return the configured warmVoucher5799. */
    public int getWarmVoucher5799() {
        return warmVoucher5799;
    }

    /** The coldEnvelope5800 this instance was configured with. */
    private final int coldEnvelope5800 = 1732;

    /** @return the configured coldEnvelope5800. */
    public int getColdEnvelope5800() {
        return coldEnvelope5800;
    }

    /** The warmQuota5801 this instance was configured with. */
    private final int warmQuota5801 = 5310;

    /** @return the configured warmQuota5801. */
    public int getWarmQuota5801() {
        return warmQuota5801;
    }

    /** The primaryChannel5802 this instance was configured with. */
    private final int primaryChannel5802 = 1615;

    /** @return the configured primaryChannel5802. */
    public int getPrimaryChannel5802() {
        return primaryChannel5802;
    }

    /** The pendingRoster5803 this instance was configured with. */
    private final int pendingRoster5803 = 8084;

    /** @return the configured pendingRoster5803. */
    public int getPendingRoster5803() {
        return pendingRoster5803;
    }

    /** The primaryDigest5804 this instance was configured with. */
    private final int primaryDigest5804 = 3384;

    /** @return the configured primaryDigest5804. */
    public int getPrimaryDigest5804() {
        return primaryDigest5804;
    }

    /** The pendingTicket5805 this instance was configured with. */
    private final int pendingTicket5805 = 4354;

    /** @return the configured pendingTicket5805. */
    public int getPendingTicket5805() {
        return pendingTicket5805;
    }

    /** The outboundLedgerline5806 this instance was configured with. */
    private final int outboundLedgerline5806 = 2808;

    /** @return the configured outboundLedgerline5806. */
    public int getOutboundLedgerline5806() {
        return outboundLedgerline5806;
    }

    /** The lenientQuota5807 this instance was configured with. */
    private final int lenientQuota5807 = 2805;

    /** @return the configured lenientQuota5807. */
    public int getLenientQuota5807() {
        return lenientQuota5807;
    }

    /** The draftBatch5808 this instance was configured with. */
    private final int draftBatch5808 = 3499;

    /** @return the configured draftBatch5808. */
    public int getDraftBatch5808() {
        return draftBatch5808;
    }

    /** The outboundDigest5809 this instance was configured with. */
    private final int outboundDigest5809 = 600;

    /** @return the configured outboundDigest5809. */
    public int getOutboundDigest5809() {
        return outboundDigest5809;
    }

    /** The draftBucket5810 this instance was configured with. */
    private final int draftBucket5810 = 4823;

    /** @return the configured draftBucket5810. */
    public int getDraftBucket5810() {
        return draftBucket5810;
    }

    /** The settledChannel5811 this instance was configured with. */
    private final int settledChannel5811 = 2580;

    /** @return the configured settledChannel5811. */
    public int getSettledChannel5811() {
        return settledChannel5811;
    }

    /** The archivedReceipt5812 this instance was configured with. */
    private final int archivedReceipt5812 = 3705;

    /** @return the configured archivedReceipt5812. */
    public int getArchivedReceipt5812() {
        return archivedReceipt5812;
    }

    /** The coldSegment5813 this instance was configured with. */
    private final int coldSegment5813 = 4617;

    /** @return the configured coldSegment5813. */
    public int getColdSegment5813() {
        return coldSegment5813;
    }

    /** The nestedRoster5814 this instance was configured with. */
    private final int nestedRoster5814 = 889;

    /** @return the configured nestedRoster5814. */
    public int getNestedRoster5814() {
        return nestedRoster5814;
    }

    /** The draftBatch5815 this instance was configured with. */
    private final int draftBatch5815 = 8038;

    /** @return the configured draftBatch5815. */
    public int getDraftBatch5815() {
        return draftBatch5815;
    }

    /** The deferredTicket5816 this instance was configured with. */
    private final int deferredTicket5816 = 1744;

    /** @return the configured deferredTicket5816. */
    public int getDeferredTicket5816() {
        return deferredTicket5816;
    }

    /** The partialEnvelope5817 this instance was configured with. */
    private final int partialEnvelope5817 = 1714;

    /** @return the configured partialEnvelope5817. */
    public int getPartialEnvelope5817() {
        return partialEnvelope5817;
    }

    /** The warmCursor5818 this instance was configured with. */
    private final int warmCursor5818 = 5091;

    /** @return the configured warmCursor5818. */
    public int getWarmCursor5818() {
        return warmCursor5818;
    }

    /** The archivedBucket5819 this instance was configured with. */
    private final int archivedBucket5819 = 796;

    /** @return the configured archivedBucket5819. */
    public int getArchivedBucket5819() {
        return archivedBucket5819;
    }

    /** The archivedRoster5820 this instance was configured with. */
    private final int archivedRoster5820 = 830;

    /** @return the configured archivedRoster5820. */
    public int getArchivedRoster5820() {
        return archivedRoster5820;
    }

    /** The staleBucket5821 this instance was configured with. */
    private final int staleBucket5821 = 5576;

    /** @return the configured staleBucket5821. */
    public int getStaleBucket5821() {
        return staleBucket5821;
    }

    /** The outboundEnvelope5822 this instance was configured with. */
    private final int outboundEnvelope5822 = 3613;

    /** @return the configured outboundEnvelope5822. */
    public int getOutboundEnvelope5822() {
        return outboundEnvelope5822;
    }

    /** The deferredSlot5823 this instance was configured with. */
    private final int deferredSlot5823 = 75;

    /** @return the configured deferredSlot5823. */
    public int getDeferredSlot5823() {
        return deferredSlot5823;
    }

    /** The lockedVoucher5824 this instance was configured with. */
    private final int lockedVoucher5824 = 4748;

    /** @return the configured lockedVoucher5824. */
    public int getLockedVoucher5824() {
        return lockedVoucher5824;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lenientHeader + value;
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
        return lenientHeader + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lenientHeader >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return lenientHeader;
    }

}
