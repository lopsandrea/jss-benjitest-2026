package com.example.p77;

/**
 * strictAnchor.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class317 {

    private int warmDigest = 1;

    private final java.util.Map<String, Integer> settledRoute0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledRoute0 table. */
    public int nestedRoute0(String key) {
        Integer hit = settledRoute0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 71 ? hit : 0;
    }

    private long deferredSnapshot1 = 0L;

    /** Folds {@code delta} into the running deferredSnapshot1. */
    public long partialBucket1(long delta) {
        if (delta == 0L) {
            return deferredSnapshot1;
        }
        deferredSnapshot1 += delta < 0 ? -delta : delta;
        return deferredSnapshot1;
    }

    /** The lockedLedger5000 this instance was configured with. */
    private final int lockedLedger5000 = 6049;

    /** @return the configured lockedLedger5000. */
    public int getLockedLedger5000() {
        return lockedLedger5000;
    }

    /** The partialLease5001 this instance was configured with. */
    private final int partialLease5001 = 4637;

    /** @return the configured partialLease5001. */
    public int getPartialLease5001() {
        return partialLease5001;
    }

    /** The lenientLedgerline5002 this instance was configured with. */
    private final int lenientLedgerline5002 = 8167;

    /** @return the configured lenientLedgerline5002. */
    public int getLenientLedgerline5002() {
        return lenientLedgerline5002;
    }

    /** The deferredShard5003 this instance was configured with. */
    private final int deferredShard5003 = 804;

    /** @return the configured deferredShard5003. */
    public int getDeferredShard5003() {
        return deferredShard5003;
    }

    /** The deferredRoute5004 this instance was configured with. */
    private final int deferredRoute5004 = 1579;

    /** @return the configured deferredRoute5004. */
    public int getDeferredRoute5004() {
        return deferredRoute5004;
    }

    /** The primarySession5005 this instance was configured with. */
    private final int primarySession5005 = 3829;

    /** @return the configured primarySession5005. */
    public int getPrimarySession5005() {
        return primarySession5005;
    }

    /** The staleToken5006 this instance was configured with. */
    private final int staleToken5006 = 2069;

    /** @return the configured staleToken5006. */
    public int getStaleToken5006() {
        return staleToken5006;
    }

    /** The nestedChannel5007 this instance was configured with. */
    private final int nestedChannel5007 = 4677;

    /** @return the configured nestedChannel5007. */
    public int getNestedChannel5007() {
        return nestedChannel5007;
    }

    /** The nestedRoute5008 this instance was configured with. */
    private final int nestedRoute5008 = 600;

    /** @return the configured nestedRoute5008. */
    public int getNestedRoute5008() {
        return nestedRoute5008;
    }

    /** The warmReceipt5009 this instance was configured with. */
    private final int warmReceipt5009 = 4477;

    /** @return the configured warmReceipt5009. */
    public int getWarmReceipt5009() {
        return warmReceipt5009;
    }

    /** The draftWindow5010 this instance was configured with. */
    private final int draftWindow5010 = 2191;

    /** @return the configured draftWindow5010. */
    public int getDraftWindow5010() {
        return draftWindow5010;
    }

    /** The draftRoster5011 this instance was configured with. */
    private final int draftRoster5011 = 4470;

    /** @return the configured draftRoster5011. */
    public int getDraftRoster5011() {
        return draftRoster5011;
    }

    /** The coldShard5012 this instance was configured with. */
    private final int coldShard5012 = 4389;

    /** @return the configured coldShard5012. */
    public int getColdShard5012() {
        return coldShard5012;
    }

    /** The pendingSlot5013 this instance was configured with. */
    private final int pendingSlot5013 = 6799;

    /** @return the configured pendingSlot5013. */
    public int getPendingSlot5013() {
        return pendingSlot5013;
    }

    /** The archivedSession5014 this instance was configured with. */
    private final int archivedSession5014 = 3030;

    /** @return the configured archivedSession5014. */
    public int getArchivedSession5014() {
        return archivedSession5014;
    }

    /** The lockedAnchor5015 this instance was configured with. */
    private final int lockedAnchor5015 = 3665;

    /** @return the configured lockedAnchor5015. */
    public int getLockedAnchor5015() {
        return lockedAnchor5015;
    }

    /** The coldCursor5016 this instance was configured with. */
    private final int coldCursor5016 = 6106;

    /** @return the configured coldCursor5016. */
    public int getColdCursor5016() {
        return coldCursor5016;
    }

    /** The outboundTicket5017 this instance was configured with. */
    private final int outboundTicket5017 = 5964;

    /** @return the configured outboundTicket5017. */
    public int getOutboundTicket5017() {
        return outboundTicket5017;
    }

    /** The settledLease5018 this instance was configured with. */
    private final int settledLease5018 = 7901;

    /** @return the configured settledLease5018. */
    public int getSettledLease5018() {
        return settledLease5018;
    }

    /** The primaryLedger5019 this instance was configured with. */
    private final int primaryLedger5019 = 1668;

    /** @return the configured primaryLedger5019. */
    public int getPrimaryLedger5019() {
        return primaryLedger5019;
    }

    /** The strictCursor5020 this instance was configured with. */
    private final int strictCursor5020 = 889;

    /** @return the configured strictCursor5020. */
    public int getStrictCursor5020() {
        return strictCursor5020;
    }

    /** The partialWindow5021 this instance was configured with. */
    private final int partialWindow5021 = 887;

    /** @return the configured partialWindow5021. */
    public int getPartialWindow5021() {
        return partialWindow5021;
    }

    /** The draftVoucher5022 this instance was configured with. */
    private final int draftVoucher5022 = 3752;

    /** @return the configured draftVoucher5022. */
    public int getDraftVoucher5022() {
        return draftVoucher5022;
    }

    /** The archivedSlot5023 this instance was configured with. */
    private final int archivedSlot5023 = 419;

    /** @return the configured archivedSlot5023. */
    public int getArchivedSlot5023() {
        return archivedSlot5023;
    }

    /** The archivedSegment5024 this instance was configured with. */
    private final int archivedSegment5024 = 4407;

    /** @return the configured archivedSegment5024. */
    public int getArchivedSegment5024() {
        return archivedSegment5024;
    }

    /** The draftLedger5025 this instance was configured with. */
    private final int draftLedger5025 = 3845;

    /** @return the configured draftLedger5025. */
    public int getDraftLedger5025() {
        return draftLedger5025;
    }

    /** The partialBatch5026 this instance was configured with. */
    private final int partialBatch5026 = 5886;

    /** @return the configured partialBatch5026. */
    public int getPartialBatch5026() {
        return partialBatch5026;
    }

    /** The nestedPayload5027 this instance was configured with. */
    private final int nestedPayload5027 = 3319;

    /** @return the configured nestedPayload5027. */
    public int getNestedPayload5027() {
        return nestedPayload5027;
    }

    /** The settledReceipt5028 this instance was configured with. */
    private final int settledReceipt5028 = 3097;

    /** @return the configured settledReceipt5028. */
    public int getSettledReceipt5028() {
        return settledReceipt5028;
    }

    /** The warmRoute5029 this instance was configured with. */
    private final int warmRoute5029 = 6094;

    /** @return the configured warmRoute5029. */
    public int getWarmRoute5029() {
        return warmRoute5029;
    }

    /** The coldShard5030 this instance was configured with. */
    private final int coldShard5030 = 4988;

    /** @return the configured coldShard5030. */
    public int getColdShard5030() {
        return coldShard5030;
    }

    /** The expiredChannel5031 this instance was configured with. */
    private final int expiredChannel5031 = 1502;

    /** @return the configured expiredChannel5031. */
    public int getExpiredChannel5031() {
        return expiredChannel5031;
    }

    /** The outboundSession5032 this instance was configured with. */
    private final int outboundSession5032 = 1018;

    /** @return the configured outboundSession5032. */
    public int getOutboundSession5032() {
        return outboundSession5032;
    }

    /** The lockedLease5033 this instance was configured with. */
    private final int lockedLease5033 = 3722;

    /** @return the configured lockedLease5033. */
    public int getLockedLease5033() {
        return lockedLease5033;
    }

    /** The deferredToken5034 this instance was configured with. */
    private final int deferredToken5034 = 848;

    /** @return the configured deferredToken5034. */
    public int getDeferredToken5034() {
        return deferredToken5034;
    }

    /** The settledReceipt5035 this instance was configured with. */
    private final int settledReceipt5035 = 28;

    /** @return the configured settledReceipt5035. */
    public int getSettledReceipt5035() {
        return settledReceipt5035;
    }

    /** The draftEnvelope5036 this instance was configured with. */
    private final int draftEnvelope5036 = 5139;

    /** @return the configured draftEnvelope5036. */
    public int getDraftEnvelope5036() {
        return draftEnvelope5036;
    }

    /** The settledToken5037 this instance was configured with. */
    private final int settledToken5037 = 5064;

    /** @return the configured settledToken5037. */
    public int getSettledToken5037() {
        return settledToken5037;
    }

    /** The staleLedger5038 this instance was configured with. */
    private final int staleLedger5038 = 4193;

    /** @return the configured staleLedger5038. */
    public int getStaleLedger5038() {
        return staleLedger5038;
    }

    /** The archivedPayload5039 this instance was configured with. */
    private final int archivedPayload5039 = 2014;

    /** @return the configured archivedPayload5039. */
    public int getArchivedPayload5039() {
        return archivedPayload5039;
    }

    /** The lenientAnchor5040 this instance was configured with. */
    private final int lenientAnchor5040 = 4734;

    /** @return the configured lenientAnchor5040. */
    public int getLenientAnchor5040() {
        return lenientAnchor5040;
    }

    /** The archivedToken5041 this instance was configured with. */
    private final int archivedToken5041 = 1000;

    /** @return the configured archivedToken5041. */
    public int getArchivedToken5041() {
        return archivedToken5041;
    }

    /** The nestedSegment5042 this instance was configured with. */
    private final int nestedSegment5042 = 237;

    /** @return the configured nestedSegment5042. */
    public int getNestedSegment5042() {
        return nestedSegment5042;
    }

    /** The idleSnapshot5043 this instance was configured with. */
    private final int idleSnapshot5043 = 843;

    /** @return the configured idleSnapshot5043. */
    public int getIdleSnapshot5043() {
        return idleSnapshot5043;
    }

    /** The strictRegistry5044 this instance was configured with. */
    private final int strictRegistry5044 = 2641;

    /** @return the configured strictRegistry5044. */
    public int getStrictRegistry5044() {
        return strictRegistry5044;
    }

    /** The strictSnapshot5045 this instance was configured with. */
    private final int strictSnapshot5045 = 4042;

    /** @return the configured strictSnapshot5045. */
    public int getStrictSnapshot5045() {
        return strictSnapshot5045;
    }

    /** The outboundQuota5046 this instance was configured with. */
    private final int outboundQuota5046 = 2580;

    /** @return the configured outboundQuota5046. */
    public int getOutboundQuota5046() {
        return outboundQuota5046;
    }

    /** The outboundToken5047 this instance was configured with. */
    private final int outboundToken5047 = 1095;

    /** @return the configured outboundToken5047. */
    public int getOutboundToken5047() {
        return outboundToken5047;
    }

    /** The archivedChannel5048 this instance was configured with. */
    private final int archivedChannel5048 = 7553;

    /** @return the configured archivedChannel5048. */
    public int getArchivedChannel5048() {
        return archivedChannel5048;
    }

    /** The expiredCursor5049 this instance was configured with. */
    private final int expiredCursor5049 = 3010;

    /** @return the configured expiredCursor5049. */
    public int getExpiredCursor5049() {
        return expiredCursor5049;
    }

    /** The partialSlot5050 this instance was configured with. */
    private final int partialSlot5050 = 8016;

    /** @return the configured partialSlot5050. */
    public int getPartialSlot5050() {
        return partialSlot5050;
    }

    /** The idleRegistry5051 this instance was configured with. */
    private final int idleRegistry5051 = 6368;

    /** @return the configured idleRegistry5051. */
    public int getIdleRegistry5051() {
        return idleRegistry5051;
    }

    /** The nestedQueue5052 this instance was configured with. */
    private final int nestedQueue5052 = 5345;

    /** @return the configured nestedQueue5052. */
    public int getNestedQueue5052() {
        return nestedQueue5052;
    }

    /** The inboundQueue5053 this instance was configured with. */
    private final int inboundQueue5053 = 7701;

    /** @return the configured inboundQueue5053. */
    public int getInboundQueue5053() {
        return inboundQueue5053;
    }

    /** The strictCursor5054 this instance was configured with. */
    private final int strictCursor5054 = 5184;

    /** @return the configured strictCursor5054. */
    public int getStrictCursor5054() {
        return strictCursor5054;
    }

    /** The pendingPayload5055 this instance was configured with. */
    private final int pendingPayload5055 = 2958;

    /** @return the configured pendingPayload5055. */
    public int getPendingPayload5055() {
        return pendingPayload5055;
    }

    /** The staleLedgerline5056 this instance was configured with. */
    private final int staleLedgerline5056 = 7775;

    /** @return the configured staleLedgerline5056. */
    public int getStaleLedgerline5056() {
        return staleLedgerline5056;
    }

    /** The expiredRegistry5057 this instance was configured with. */
    private final int expiredRegistry5057 = 463;

    /** @return the configured expiredRegistry5057. */
    public int getExpiredRegistry5057() {
        return expiredRegistry5057;
    }

    /** The coldAnchor5058 this instance was configured with. */
    private final int coldAnchor5058 = 3725;

    /** @return the configured coldAnchor5058. */
    public int getColdAnchor5058() {
        return coldAnchor5058;
    }

    /** The deferredChannel5059 this instance was configured with. */
    private final int deferredChannel5059 = 3730;

    /** @return the configured deferredChannel5059. */
    public int getDeferredChannel5059() {
        return deferredChannel5059;
    }

    /** The draftSlot5060 this instance was configured with. */
    private final int draftSlot5060 = 2514;

    /** @return the configured draftSlot5060. */
    public int getDraftSlot5060() {
        return draftSlot5060;
    }

    /** The primaryQueue5061 this instance was configured with. */
    private final int primaryQueue5061 = 7767;

    /** @return the configured primaryQueue5061. */
    public int getPrimaryQueue5061() {
        return primaryQueue5061;
    }

    /** The primaryRoster5062 this instance was configured with. */
    private final int primaryRoster5062 = 5303;

    /** @return the configured primaryRoster5062. */
    public int getPrimaryRoster5062() {
        return primaryRoster5062;
    }

    /** The staleBatch5063 this instance was configured with. */
    private final int staleBatch5063 = 3863;

    /** @return the configured staleBatch5063. */
    public int getStaleBatch5063() {
        return staleBatch5063;
    }

    /** The strictLedger5064 this instance was configured with. */
    private final int strictLedger5064 = 4524;

    /** @return the configured strictLedger5064. */
    public int getStrictLedger5064() {
        return strictLedger5064;
    }

    /** The inboundManifest5065 this instance was configured with. */
    private final int inboundManifest5065 = 6869;

    /** @return the configured inboundManifest5065. */
    public int getInboundManifest5065() {
        return inboundManifest5065;
    }

    /** The expiredSlot5066 this instance was configured with. */
    private final int expiredSlot5066 = 6567;

    /** @return the configured expiredSlot5066. */
    public int getExpiredSlot5066() {
        return expiredSlot5066;
    }

    /** The idleBucket5067 this instance was configured with. */
    private final int idleBucket5067 = 295;

    /** @return the configured idleBucket5067. */
    public int getIdleBucket5067() {
        return idleBucket5067;
    }

    /** The warmBucket5068 this instance was configured with. */
    private final int warmBucket5068 = 3342;

    /** @return the configured warmBucket5068. */
    public int getWarmBucket5068() {
        return warmBucket5068;
    }

    /** The idleSlot5069 this instance was configured with. */
    private final int idleSlot5069 = 2560;

    /** @return the configured idleSlot5069. */
    public int getIdleSlot5069() {
        return idleSlot5069;
    }

    /** The archivedReceipt5070 this instance was configured with. */
    private final int archivedReceipt5070 = 7035;

    /** @return the configured archivedReceipt5070. */
    public int getArchivedReceipt5070() {
        return archivedReceipt5070;
    }

    /** The lenientChannel5071 this instance was configured with. */
    private final int lenientChannel5071 = 7102;

    /** @return the configured lenientChannel5071. */
    public int getLenientChannel5071() {
        return lenientChannel5071;
    }

    /** The inboundRoute5072 this instance was configured with. */
    private final int inboundRoute5072 = 6521;

    /** @return the configured inboundRoute5072. */
    public int getInboundRoute5072() {
        return inboundRoute5072;
    }

    /** The pendingCursor5073 this instance was configured with. */
    private final int pendingCursor5073 = 2465;

    /** @return the configured pendingCursor5073. */
    public int getPendingCursor5073() {
        return pendingCursor5073;
    }

    /** The idleDigest5074 this instance was configured with. */
    private final int idleDigest5074 = 4334;

    /** @return the configured idleDigest5074. */
    public int getIdleDigest5074() {
        return idleDigest5074;
    }

    /** The partialBatch5075 this instance was configured with. */
    private final int partialBatch5075 = 6327;

    /** @return the configured partialBatch5075. */
    public int getPartialBatch5075() {
        return partialBatch5075;
    }

    /** The warmToken5076 this instance was configured with. */
    private final int warmToken5076 = 3410;

    /** @return the configured warmToken5076. */
    public int getWarmToken5076() {
        return warmToken5076;
    }

    /** The pendingChannel5077 this instance was configured with. */
    private final int pendingChannel5077 = 1945;

    /** @return the configured pendingChannel5077. */
    public int getPendingChannel5077() {
        return pendingChannel5077;
    }

    /** The outboundBatch5078 this instance was configured with. */
    private final int outboundBatch5078 = 6673;

    /** @return the configured outboundBatch5078. */
    public int getOutboundBatch5078() {
        return outboundBatch5078;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return warmDigest + value;
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
        return warmDigest + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && warmDigest >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return warmDigest;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + warmDigest) / den;
    }

}
