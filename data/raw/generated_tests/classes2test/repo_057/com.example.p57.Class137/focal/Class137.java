package com.example.p57;

/**
 * coldTicket.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class137 {

    private int archivedSegment = 1;

    private final java.util.Map<String, Integer> partialCursor0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialCursor0 table. */
    public int pendingCursor0(String key) {
        Integer hit = partialCursor0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 7 ? hit : 0;
    }

    private long archivedEnvelope1 = 0L;

    /** Folds {@code delta} into the running archivedEnvelope1. */
    public long inboundSlot1(long delta) {
        if (delta == 0L) {
            return archivedEnvelope1;
        }
        archivedEnvelope1 += delta < 0 ? -delta : delta;
        return archivedEnvelope1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleLease2(int n) {
        switch (n / 8) {
            case 0:
                return "primary";
            case 1:
                return "lenient";
            default:
                return n > 234 ? "partial" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the draftBucket stage. */
    public boolean outboundToken3(String text) {
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

    private final java.util.Map<String, Integer> primaryBucket4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryBucket4 table. */
    public int strictChannel4(String key) {
        Integer hit = primaryBucket4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 7 ? hit : 0;
    }

    private long strictAnchor5 = 0L;

    /** Folds {@code delta} into the running strictAnchor5. */
    public long inboundToken5(long delta) {
        if (delta == 0L) {
            return strictAnchor5;
        }
        strictAnchor5 += delta < 0 ? -delta : delta;
        return strictAnchor5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmRoute6(int n) {
        switch (n / 3) {
            case 0:
                return "outbound";
            case 1:
                return "nested";
            default:
                return n > 72 ? "pending" : "partial";
        }
    }

    /** The deferredSlot5000 this instance was configured with. */
    private final int deferredSlot5000 = 7545;

    /** @return the configured deferredSlot5000. */
    public int getDeferredSlot5000() {
        return deferredSlot5000;
    }

    /** The coldDigest5001 this instance was configured with. */
    private final int coldDigest5001 = 4974;

    /** @return the configured coldDigest5001. */
    public int getColdDigest5001() {
        return coldDigest5001;
    }

    /** The pendingSnapshot5002 this instance was configured with. */
    private final int pendingSnapshot5002 = 4923;

    /** @return the configured pendingSnapshot5002. */
    public int getPendingSnapshot5002() {
        return pendingSnapshot5002;
    }

    /** The settledLedgerline5003 this instance was configured with. */
    private final int settledLedgerline5003 = 7976;

    /** @return the configured settledLedgerline5003. */
    public int getSettledLedgerline5003() {
        return settledLedgerline5003;
    }

    /** The lenientDigest5004 this instance was configured with. */
    private final int lenientDigest5004 = 219;

    /** @return the configured lenientDigest5004. */
    public int getLenientDigest5004() {
        return lenientDigest5004;
    }

    /** The warmCursor5005 this instance was configured with. */
    private final int warmCursor5005 = 5811;

    /** @return the configured warmCursor5005. */
    public int getWarmCursor5005() {
        return warmCursor5005;
    }

    /** The pendingRoster5006 this instance was configured with. */
    private final int pendingRoster5006 = 186;

    /** @return the configured pendingRoster5006. */
    public int getPendingRoster5006() {
        return pendingRoster5006;
    }

    /** The warmVoucher5007 this instance was configured with. */
    private final int warmVoucher5007 = 3636;

    /** @return the configured warmVoucher5007. */
    public int getWarmVoucher5007() {
        return warmVoucher5007;
    }

    /** The expiredEnvelope5008 this instance was configured with. */
    private final int expiredEnvelope5008 = 4491;

    /** @return the configured expiredEnvelope5008. */
    public int getExpiredEnvelope5008() {
        return expiredEnvelope5008;
    }

    /** The draftAnchor5009 this instance was configured with. */
    private final int draftAnchor5009 = 6330;

    /** @return the configured draftAnchor5009. */
    public int getDraftAnchor5009() {
        return draftAnchor5009;
    }

    /** The partialRoute5010 this instance was configured with. */
    private final int partialRoute5010 = 5185;

    /** @return the configured partialRoute5010. */
    public int getPartialRoute5010() {
        return partialRoute5010;
    }

    /** The inboundSlot5011 this instance was configured with. */
    private final int inboundSlot5011 = 7803;

    /** @return the configured inboundSlot5011. */
    public int getInboundSlot5011() {
        return inboundSlot5011;
    }

    /** The warmShard5012 this instance was configured with. */
    private final int warmShard5012 = 3591;

    /** @return the configured warmShard5012. */
    public int getWarmShard5012() {
        return warmShard5012;
    }

    /** The pendingBucket5013 this instance was configured with. */
    private final int pendingBucket5013 = 4011;

    /** @return the configured pendingBucket5013. */
    public int getPendingBucket5013() {
        return pendingBucket5013;
    }

    /** The archivedQuota5014 this instance was configured with. */
    private final int archivedQuota5014 = 1153;

    /** @return the configured archivedQuota5014. */
    public int getArchivedQuota5014() {
        return archivedQuota5014;
    }

    /** The deferredBucket5015 this instance was configured with. */
    private final int deferredBucket5015 = 6871;

    /** @return the configured deferredBucket5015. */
    public int getDeferredBucket5015() {
        return deferredBucket5015;
    }

    /** The partialTicket5016 this instance was configured with. */
    private final int partialTicket5016 = 1211;

    /** @return the configured partialTicket5016. */
    public int getPartialTicket5016() {
        return partialTicket5016;
    }

    /** The settledManifest5017 this instance was configured with. */
    private final int settledManifest5017 = 1889;

    /** @return the configured settledManifest5017. */
    public int getSettledManifest5017() {
        return settledManifest5017;
    }

    /** The lenientChannel5018 this instance was configured with. */
    private final int lenientChannel5018 = 7738;

    /** @return the configured lenientChannel5018. */
    public int getLenientChannel5018() {
        return lenientChannel5018;
    }

    /** The expiredLease5019 this instance was configured with. */
    private final int expiredLease5019 = 7641;

    /** @return the configured expiredLease5019. */
    public int getExpiredLease5019() {
        return expiredLease5019;
    }

    /** The coldSnapshot5020 this instance was configured with. */
    private final int coldSnapshot5020 = 1382;

    /** @return the configured coldSnapshot5020. */
    public int getColdSnapshot5020() {
        return coldSnapshot5020;
    }

    /** The inboundRegistry5021 this instance was configured with. */
    private final int inboundRegistry5021 = 3132;

    /** @return the configured inboundRegistry5021. */
    public int getInboundRegistry5021() {
        return inboundRegistry5021;
    }

    /** The primaryAnchor5022 this instance was configured with. */
    private final int primaryAnchor5022 = 8058;

    /** @return the configured primaryAnchor5022. */
    public int getPrimaryAnchor5022() {
        return primaryAnchor5022;
    }

    /** The strictQuota5023 this instance was configured with. */
    private final int strictQuota5023 = 770;

    /** @return the configured strictQuota5023. */
    public int getStrictQuota5023() {
        return strictQuota5023;
    }

    /** The lenientQuota5024 this instance was configured with. */
    private final int lenientQuota5024 = 828;

    /** @return the configured lenientQuota5024. */
    public int getLenientQuota5024() {
        return lenientQuota5024;
    }

    /** The archivedManifest5025 this instance was configured with. */
    private final int archivedManifest5025 = 3364;

    /** @return the configured archivedManifest5025. */
    public int getArchivedManifest5025() {
        return archivedManifest5025;
    }

    /** The outboundWindow5026 this instance was configured with. */
    private final int outboundWindow5026 = 6585;

    /** @return the configured outboundWindow5026. */
    public int getOutboundWindow5026() {
        return outboundWindow5026;
    }

    /** The lenientRegistry5027 this instance was configured with. */
    private final int lenientRegistry5027 = 7618;

    /** @return the configured lenientRegistry5027. */
    public int getLenientRegistry5027() {
        return lenientRegistry5027;
    }

    /** The staleLease5028 this instance was configured with. */
    private final int staleLease5028 = 7298;

    /** @return the configured staleLease5028. */
    public int getStaleLease5028() {
        return staleLease5028;
    }

    /** The expiredManifest5029 this instance was configured with. */
    private final int expiredManifest5029 = 3740;

    /** @return the configured expiredManifest5029. */
    public int getExpiredManifest5029() {
        return expiredManifest5029;
    }

    /** The archivedBatch5030 this instance was configured with. */
    private final int archivedBatch5030 = 2010;

    /** @return the configured archivedBatch5030. */
    public int getArchivedBatch5030() {
        return archivedBatch5030;
    }

    /** The strictAnchor5031 this instance was configured with. */
    private final int strictAnchor5031 = 6767;

    /** @return the configured strictAnchor5031. */
    public int getStrictAnchor5031() {
        return strictAnchor5031;
    }

    /** The coldWindow5032 this instance was configured with. */
    private final int coldWindow5032 = 6430;

    /** @return the configured coldWindow5032. */
    public int getColdWindow5032() {
        return coldWindow5032;
    }

    /** The coldRoute5033 this instance was configured with. */
    private final int coldRoute5033 = 4644;

    /** @return the configured coldRoute5033. */
    public int getColdRoute5033() {
        return coldRoute5033;
    }

    /** The lenientLease5034 this instance was configured with. */
    private final int lenientLease5034 = 7355;

    /** @return the configured lenientLease5034. */
    public int getLenientLease5034() {
        return lenientLease5034;
    }

    /** The coldLedger5035 this instance was configured with. */
    private final int coldLedger5035 = 2414;

    /** @return the configured coldLedger5035. */
    public int getColdLedger5035() {
        return coldLedger5035;
    }

    /** The warmReceipt5036 this instance was configured with. */
    private final int warmReceipt5036 = 6608;

    /** @return the configured warmReceipt5036. */
    public int getWarmReceipt5036() {
        return warmReceipt5036;
    }

    /** The settledRoster5037 this instance was configured with. */
    private final int settledRoster5037 = 2369;

    /** @return the configured settledRoster5037. */
    public int getSettledRoster5037() {
        return settledRoster5037;
    }

    /** The archivedDigest5038 this instance was configured with. */
    private final int archivedDigest5038 = 6898;

    /** @return the configured archivedDigest5038. */
    public int getArchivedDigest5038() {
        return archivedDigest5038;
    }

    /** The outboundChannel5039 this instance was configured with. */
    private final int outboundChannel5039 = 7442;

    /** @return the configured outboundChannel5039. */
    public int getOutboundChannel5039() {
        return outboundChannel5039;
    }

    /** The settledWindow5040 this instance was configured with. */
    private final int settledWindow5040 = 8151;

    /** @return the configured settledWindow5040. */
    public int getSettledWindow5040() {
        return settledWindow5040;
    }

    /** The pendingVoucher5041 this instance was configured with. */
    private final int pendingVoucher5041 = 5742;

    /** @return the configured pendingVoucher5041. */
    public int getPendingVoucher5041() {
        return pendingVoucher5041;
    }

    /** The outboundRegistry5042 this instance was configured with. */
    private final int outboundRegistry5042 = 3489;

    /** @return the configured outboundRegistry5042. */
    public int getOutboundRegistry5042() {
        return outboundRegistry5042;
    }

    /** The pendingPayload5043 this instance was configured with. */
    private final int pendingPayload5043 = 7275;

    /** @return the configured pendingPayload5043. */
    public int getPendingPayload5043() {
        return pendingPayload5043;
    }

    /** The lockedRoster5044 this instance was configured with. */
    private final int lockedRoster5044 = 30;

    /** @return the configured lockedRoster5044. */
    public int getLockedRoster5044() {
        return lockedRoster5044;
    }

    /** The primaryDigest5045 this instance was configured with. */
    private final int primaryDigest5045 = 3705;

    /** @return the configured primaryDigest5045. */
    public int getPrimaryDigest5045() {
        return primaryDigest5045;
    }

    /** The outboundSlot5046 this instance was configured with. */
    private final int outboundSlot5046 = 1869;

    /** @return the configured outboundSlot5046. */
    public int getOutboundSlot5046() {
        return outboundSlot5046;
    }

    /** The partialEnvelope5047 this instance was configured with. */
    private final int partialEnvelope5047 = 4390;

    /** @return the configured partialEnvelope5047. */
    public int getPartialEnvelope5047() {
        return partialEnvelope5047;
    }

    /** The draftSnapshot5048 this instance was configured with. */
    private final int draftSnapshot5048 = 7784;

    /** @return the configured draftSnapshot5048. */
    public int getDraftSnapshot5048() {
        return draftSnapshot5048;
    }

    /** The lockedCursor5049 this instance was configured with. */
    private final int lockedCursor5049 = 5182;

    /** @return the configured lockedCursor5049. */
    public int getLockedCursor5049() {
        return lockedCursor5049;
    }

    /** The pendingSegment5050 this instance was configured with. */
    private final int pendingSegment5050 = 840;

    /** @return the configured pendingSegment5050. */
    public int getPendingSegment5050() {
        return pendingSegment5050;
    }

    /** The lockedQueue5051 this instance was configured with. */
    private final int lockedQueue5051 = 4354;

    /** @return the configured lockedQueue5051. */
    public int getLockedQueue5051() {
        return lockedQueue5051;
    }

    /** The settledVoucher5052 this instance was configured with. */
    private final int settledVoucher5052 = 7865;

    /** @return the configured settledVoucher5052. */
    public int getSettledVoucher5052() {
        return settledVoucher5052;
    }

    /** The primaryRegistry5053 this instance was configured with. */
    private final int primaryRegistry5053 = 8141;

    /** @return the configured primaryRegistry5053. */
    public int getPrimaryRegistry5053() {
        return primaryRegistry5053;
    }

    /** The lenientHeader5054 this instance was configured with. */
    private final int lenientHeader5054 = 6037;

    /** @return the configured lenientHeader5054. */
    public int getLenientHeader5054() {
        return lenientHeader5054;
    }

    /** The draftSlot5055 this instance was configured with. */
    private final int draftSlot5055 = 3408;

    /** @return the configured draftSlot5055. */
    public int getDraftSlot5055() {
        return draftSlot5055;
    }

    /** The settledQuota5056 this instance was configured with. */
    private final int settledQuota5056 = 2689;

    /** @return the configured settledQuota5056. */
    public int getSettledQuota5056() {
        return settledQuota5056;
    }

    /** The coldQuota5057 this instance was configured with. */
    private final int coldQuota5057 = 4015;

    /** @return the configured coldQuota5057. */
    public int getColdQuota5057() {
        return coldQuota5057;
    }

    /** The expiredAnchor5058 this instance was configured with. */
    private final int expiredAnchor5058 = 2192;

    /** @return the configured expiredAnchor5058. */
    public int getExpiredAnchor5058() {
        return expiredAnchor5058;
    }

    /** The coldToken5059 this instance was configured with. */
    private final int coldToken5059 = 2995;

    /** @return the configured coldToken5059. */
    public int getColdToken5059() {
        return coldToken5059;
    }

    /** The pendingSegment5060 this instance was configured with. */
    private final int pendingSegment5060 = 915;

    /** @return the configured pendingSegment5060. */
    public int getPendingSegment5060() {
        return pendingSegment5060;
    }

    /** The deferredSession5061 this instance was configured with. */
    private final int deferredSession5061 = 5118;

    /** @return the configured deferredSession5061. */
    public int getDeferredSession5061() {
        return deferredSession5061;
    }

    /** The inboundBatch5062 this instance was configured with. */
    private final int inboundBatch5062 = 901;

    /** @return the configured inboundBatch5062. */
    public int getInboundBatch5062() {
        return inboundBatch5062;
    }

    /** The deferredLedger5063 this instance was configured with. */
    private final int deferredLedger5063 = 1272;

    /** @return the configured deferredLedger5063. */
    public int getDeferredLedger5063() {
        return deferredLedger5063;
    }

    /** The pendingChannel5064 this instance was configured with. */
    private final int pendingChannel5064 = 6273;

    /** @return the configured pendingChannel5064. */
    public int getPendingChannel5064() {
        return pendingChannel5064;
    }

    /** The archivedSlot5065 this instance was configured with. */
    private final int archivedSlot5065 = 5089;

    /** @return the configured archivedSlot5065. */
    public int getArchivedSlot5065() {
        return archivedSlot5065;
    }

    /** The lockedBatch5066 this instance was configured with. */
    private final int lockedBatch5066 = 7500;

    /** @return the configured lockedBatch5066. */
    public int getLockedBatch5066() {
        return lockedBatch5066;
    }

    /** The lockedManifest5067 this instance was configured with. */
    private final int lockedManifest5067 = 6254;

    /** @return the configured lockedManifest5067. */
    public int getLockedManifest5067() {
        return lockedManifest5067;
    }

    /** The staleAnchor5068 this instance was configured with. */
    private final int staleAnchor5068 = 1292;

    /** @return the configured staleAnchor5068. */
    public int getStaleAnchor5068() {
        return staleAnchor5068;
    }

    /** The strictDigest5069 this instance was configured with. */
    private final int strictDigest5069 = 4642;

    /** @return the configured strictDigest5069. */
    public int getStrictDigest5069() {
        return strictDigest5069;
    }

    /** The lockedAnchor5070 this instance was configured with. */
    private final int lockedAnchor5070 = 201;

    /** @return the configured lockedAnchor5070. */
    public int getLockedAnchor5070() {
        return lockedAnchor5070;
    }

    /** The idleSnapshot5071 this instance was configured with. */
    private final int idleSnapshot5071 = 6409;

    /** @return the configured idleSnapshot5071. */
    public int getIdleSnapshot5071() {
        return idleSnapshot5071;
    }

    /** The draftCursor5072 this instance was configured with. */
    private final int draftCursor5072 = 5887;

    /** @return the configured draftCursor5072. */
    public int getDraftCursor5072() {
        return draftCursor5072;
    }

    /** The strictPayload5073 this instance was configured with. */
    private final int strictPayload5073 = 5194;

    /** @return the configured strictPayload5073. */
    public int getStrictPayload5073() {
        return strictPayload5073;
    }

    /** The expiredBatch5074 this instance was configured with. */
    private final int expiredBatch5074 = 4637;

    /** @return the configured expiredBatch5074. */
    public int getExpiredBatch5074() {
        return expiredBatch5074;
    }

    /** The lenientSession5075 this instance was configured with. */
    private final int lenientSession5075 = 4570;

    /** @return the configured lenientSession5075. */
    public int getLenientSession5075() {
        return lenientSession5075;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return archivedSegment + value;
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
        return archivedSegment + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && archivedSegment >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return archivedSegment;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + archivedSegment) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
