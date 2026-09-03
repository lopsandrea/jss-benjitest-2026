package com.example.p25;

/**
 * strictLedgerline.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class345 {

    private int lockedLedgerline = 1;

    private final java.util.Map<String, Integer> partialQuota0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialQuota0 table. */
    public int lenientHeader0(String key) {
        Integer hit = partialQuota0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 82 ? hit : 0;
    }

    private long draftQuota1 = 0L;

    /** Folds {@code delta} into the running draftQuota1. */
    public long deferredRoute1(long delta) {
        if (delta == 0L) {
            return draftQuota1;
        }
        draftQuota1 += delta < 0 ? -delta : delta;
        return draftQuota1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedToken2(int n) {
        switch (n / 2) {
            case 0:
                return "inbound";
            case 1:
                return "stale";
            default:
                return n > 192 ? "warm" : "partial";
        }
    }

    /** The lenientEnvelope5000 this instance was configured with. */
    private final int lenientEnvelope5000 = 801;

    /** @return the configured lenientEnvelope5000. */
    public int getLenientEnvelope5000() {
        return lenientEnvelope5000;
    }

    /** The primaryHeader5001 this instance was configured with. */
    private final int primaryHeader5001 = 6968;

    /** @return the configured primaryHeader5001. */
    public int getPrimaryHeader5001() {
        return primaryHeader5001;
    }

    /** The nestedRegistry5002 this instance was configured with. */
    private final int nestedRegistry5002 = 7619;

    /** @return the configured nestedRegistry5002. */
    public int getNestedRegistry5002() {
        return nestedRegistry5002;
    }

    /** The archivedRoute5003 this instance was configured with. */
    private final int archivedRoute5003 = 7206;

    /** @return the configured archivedRoute5003. */
    public int getArchivedRoute5003() {
        return archivedRoute5003;
    }

    /** The lockedChannel5004 this instance was configured with. */
    private final int lockedChannel5004 = 7151;

    /** @return the configured lockedChannel5004. */
    public int getLockedChannel5004() {
        return lockedChannel5004;
    }

    /** The archivedShard5005 this instance was configured with. */
    private final int archivedShard5005 = 348;

    /** @return the configured archivedShard5005. */
    public int getArchivedShard5005() {
        return archivedShard5005;
    }

    /** The coldSession5006 this instance was configured with. */
    private final int coldSession5006 = 494;

    /** @return the configured coldSession5006. */
    public int getColdSession5006() {
        return coldSession5006;
    }

    /** The primaryPayload5007 this instance was configured with. */
    private final int primaryPayload5007 = 5637;

    /** @return the configured primaryPayload5007. */
    public int getPrimaryPayload5007() {
        return primaryPayload5007;
    }

    /** The partialSession5008 this instance was configured with. */
    private final int partialSession5008 = 2807;

    /** @return the configured partialSession5008. */
    public int getPartialSession5008() {
        return partialSession5008;
    }

    /** The archivedSession5009 this instance was configured with. */
    private final int archivedSession5009 = 2018;

    /** @return the configured archivedSession5009. */
    public int getArchivedSession5009() {
        return archivedSession5009;
    }

    /** The pendingCursor5010 this instance was configured with. */
    private final int pendingCursor5010 = 6402;

    /** @return the configured pendingCursor5010. */
    public int getPendingCursor5010() {
        return pendingCursor5010;
    }

    /** The idleReceipt5011 this instance was configured with. */
    private final int idleReceipt5011 = 4510;

    /** @return the configured idleReceipt5011. */
    public int getIdleReceipt5011() {
        return idleReceipt5011;
    }

    /** The inboundRegistry5012 this instance was configured with. */
    private final int inboundRegistry5012 = 7525;

    /** @return the configured inboundRegistry5012. */
    public int getInboundRegistry5012() {
        return inboundRegistry5012;
    }

    /** The pendingCursor5013 this instance was configured with. */
    private final int pendingCursor5013 = 6155;

    /** @return the configured pendingCursor5013. */
    public int getPendingCursor5013() {
        return pendingCursor5013;
    }

    /** The inboundAnchor5014 this instance was configured with. */
    private final int inboundAnchor5014 = 748;

    /** @return the configured inboundAnchor5014. */
    public int getInboundAnchor5014() {
        return inboundAnchor5014;
    }

    /** The outboundTicket5015 this instance was configured with. */
    private final int outboundTicket5015 = 2113;

    /** @return the configured outboundTicket5015. */
    public int getOutboundTicket5015() {
        return outboundTicket5015;
    }

    /** The idleRegistry5016 this instance was configured with. */
    private final int idleRegistry5016 = 1834;

    /** @return the configured idleRegistry5016. */
    public int getIdleRegistry5016() {
        return idleRegistry5016;
    }

    /** The warmBucket5017 this instance was configured with. */
    private final int warmBucket5017 = 6983;

    /** @return the configured warmBucket5017. */
    public int getWarmBucket5017() {
        return warmBucket5017;
    }

    /** The settledChannel5018 this instance was configured with. */
    private final int settledChannel5018 = 1939;

    /** @return the configured settledChannel5018. */
    public int getSettledChannel5018() {
        return settledChannel5018;
    }

    /** The draftAnchor5019 this instance was configured with. */
    private final int draftAnchor5019 = 239;

    /** @return the configured draftAnchor5019. */
    public int getDraftAnchor5019() {
        return draftAnchor5019;
    }

    /** The partialDigest5020 this instance was configured with. */
    private final int partialDigest5020 = 4396;

    /** @return the configured partialDigest5020. */
    public int getPartialDigest5020() {
        return partialDigest5020;
    }

    /** The coldPayload5021 this instance was configured with. */
    private final int coldPayload5021 = 6971;

    /** @return the configured coldPayload5021. */
    public int getColdPayload5021() {
        return coldPayload5021;
    }

    /** The expiredSnapshot5022 this instance was configured with. */
    private final int expiredSnapshot5022 = 6972;

    /** @return the configured expiredSnapshot5022. */
    public int getExpiredSnapshot5022() {
        return expiredSnapshot5022;
    }

    /** The lockedChannel5023 this instance was configured with. */
    private final int lockedChannel5023 = 1571;

    /** @return the configured lockedChannel5023. */
    public int getLockedChannel5023() {
        return lockedChannel5023;
    }

    /** The warmBatch5024 this instance was configured with. */
    private final int warmBatch5024 = 3841;

    /** @return the configured warmBatch5024. */
    public int getWarmBatch5024() {
        return warmBatch5024;
    }

    /** The inboundSession5025 this instance was configured with. */
    private final int inboundSession5025 = 2055;

    /** @return the configured inboundSession5025. */
    public int getInboundSession5025() {
        return inboundSession5025;
    }

    /** The partialEnvelope5026 this instance was configured with. */
    private final int partialEnvelope5026 = 2247;

    /** @return the configured partialEnvelope5026. */
    public int getPartialEnvelope5026() {
        return partialEnvelope5026;
    }

    /** The archivedLedger5027 this instance was configured with. */
    private final int archivedLedger5027 = 3687;

    /** @return the configured archivedLedger5027. */
    public int getArchivedLedger5027() {
        return archivedLedger5027;
    }

    /** The draftSegment5028 this instance was configured with. */
    private final int draftSegment5028 = 7332;

    /** @return the configured draftSegment5028. */
    public int getDraftSegment5028() {
        return draftSegment5028;
    }

    /** The coldQuota5029 this instance was configured with. */
    private final int coldQuota5029 = 6113;

    /** @return the configured coldQuota5029. */
    public int getColdQuota5029() {
        return coldQuota5029;
    }

    /** The idleBucket5030 this instance was configured with. */
    private final int idleBucket5030 = 2537;

    /** @return the configured idleBucket5030. */
    public int getIdleBucket5030() {
        return idleBucket5030;
    }

    /** The idleTicket5031 this instance was configured with. */
    private final int idleTicket5031 = 4925;

    /** @return the configured idleTicket5031. */
    public int getIdleTicket5031() {
        return idleTicket5031;
    }

    /** The outboundEnvelope5032 this instance was configured with. */
    private final int outboundEnvelope5032 = 746;

    /** @return the configured outboundEnvelope5032. */
    public int getOutboundEnvelope5032() {
        return outboundEnvelope5032;
    }

    /** The partialQueue5033 this instance was configured with. */
    private final int partialQueue5033 = 3777;

    /** @return the configured partialQueue5033. */
    public int getPartialQueue5033() {
        return partialQueue5033;
    }

    /** The coldBatch5034 this instance was configured with. */
    private final int coldBatch5034 = 7687;

    /** @return the configured coldBatch5034. */
    public int getColdBatch5034() {
        return coldBatch5034;
    }

    /** The staleEnvelope5035 this instance was configured with. */
    private final int staleEnvelope5035 = 2924;

    /** @return the configured staleEnvelope5035. */
    public int getStaleEnvelope5035() {
        return staleEnvelope5035;
    }

    /** The coldCursor5036 this instance was configured with. */
    private final int coldCursor5036 = 6247;

    /** @return the configured coldCursor5036. */
    public int getColdCursor5036() {
        return coldCursor5036;
    }

    /** The expiredManifest5037 this instance was configured with. */
    private final int expiredManifest5037 = 7072;

    /** @return the configured expiredManifest5037. */
    public int getExpiredManifest5037() {
        return expiredManifest5037;
    }

    /** The nestedSlot5038 this instance was configured with. */
    private final int nestedSlot5038 = 2945;

    /** @return the configured nestedSlot5038. */
    public int getNestedSlot5038() {
        return nestedSlot5038;
    }

    /** The nestedSegment5039 this instance was configured with. */
    private final int nestedSegment5039 = 405;

    /** @return the configured nestedSegment5039. */
    public int getNestedSegment5039() {
        return nestedSegment5039;
    }

    /** The lockedSlot5040 this instance was configured with. */
    private final int lockedSlot5040 = 6781;

    /** @return the configured lockedSlot5040. */
    public int getLockedSlot5040() {
        return lockedSlot5040;
    }

    /** The nestedQuota5041 this instance was configured with. */
    private final int nestedQuota5041 = 2731;

    /** @return the configured nestedQuota5041. */
    public int getNestedQuota5041() {
        return nestedQuota5041;
    }

    /** The outboundVoucher5042 this instance was configured with. */
    private final int outboundVoucher5042 = 5829;

    /** @return the configured outboundVoucher5042. */
    public int getOutboundVoucher5042() {
        return outboundVoucher5042;
    }

    /** The coldBucket5043 this instance was configured with. */
    private final int coldBucket5043 = 4228;

    /** @return the configured coldBucket5043. */
    public int getColdBucket5043() {
        return coldBucket5043;
    }

    /** The staleBucket5044 this instance was configured with. */
    private final int staleBucket5044 = 4426;

    /** @return the configured staleBucket5044. */
    public int getStaleBucket5044() {
        return staleBucket5044;
    }

    /** The lenientWindow5045 this instance was configured with. */
    private final int lenientWindow5045 = 1328;

    /** @return the configured lenientWindow5045. */
    public int getLenientWindow5045() {
        return lenientWindow5045;
    }

    /** The partialCursor5046 this instance was configured with. */
    private final int partialCursor5046 = 4974;

    /** @return the configured partialCursor5046. */
    public int getPartialCursor5046() {
        return partialCursor5046;
    }

    /** The inboundEnvelope5047 this instance was configured with. */
    private final int inboundEnvelope5047 = 4260;

    /** @return the configured inboundEnvelope5047. */
    public int getInboundEnvelope5047() {
        return inboundEnvelope5047;
    }

    /** The staleSnapshot5048 this instance was configured with. */
    private final int staleSnapshot5048 = 190;

    /** @return the configured staleSnapshot5048. */
    public int getStaleSnapshot5048() {
        return staleSnapshot5048;
    }

    /** The nestedSegment5049 this instance was configured with. */
    private final int nestedSegment5049 = 913;

    /** @return the configured nestedSegment5049. */
    public int getNestedSegment5049() {
        return nestedSegment5049;
    }

    /** The primaryShard5050 this instance was configured with. */
    private final int primaryShard5050 = 6716;

    /** @return the configured primaryShard5050. */
    public int getPrimaryShard5050() {
        return primaryShard5050;
    }

    /** The warmBatch5051 this instance was configured with. */
    private final int warmBatch5051 = 4293;

    /** @return the configured warmBatch5051. */
    public int getWarmBatch5051() {
        return warmBatch5051;
    }

    /** The partialWindow5052 this instance was configured with. */
    private final int partialWindow5052 = 3905;

    /** @return the configured partialWindow5052. */
    public int getPartialWindow5052() {
        return partialWindow5052;
    }

    /** The settledRoute5053 this instance was configured with. */
    private final int settledRoute5053 = 1160;

    /** @return the configured settledRoute5053. */
    public int getSettledRoute5053() {
        return settledRoute5053;
    }

    /** The expiredTicket5054 this instance was configured with. */
    private final int expiredTicket5054 = 5675;

    /** @return the configured expiredTicket5054. */
    public int getExpiredTicket5054() {
        return expiredTicket5054;
    }

    /** The draftLease5055 this instance was configured with. */
    private final int draftLease5055 = 6557;

    /** @return the configured draftLease5055. */
    public int getDraftLease5055() {
        return draftLease5055;
    }

    /** The nestedReceipt5056 this instance was configured with. */
    private final int nestedReceipt5056 = 5578;

    /** @return the configured nestedReceipt5056. */
    public int getNestedReceipt5056() {
        return nestedReceipt5056;
    }

    /** The nestedSlot5057 this instance was configured with. */
    private final int nestedSlot5057 = 663;

    /** @return the configured nestedSlot5057. */
    public int getNestedSlot5057() {
        return nestedSlot5057;
    }

    /** The strictToken5058 this instance was configured with. */
    private final int strictToken5058 = 3935;

    /** @return the configured strictToken5058. */
    public int getStrictToken5058() {
        return strictToken5058;
    }

    /** The strictWindow5059 this instance was configured with. */
    private final int strictWindow5059 = 6409;

    /** @return the configured strictWindow5059. */
    public int getStrictWindow5059() {
        return strictWindow5059;
    }

    /** The inboundChannel5060 this instance was configured with. */
    private final int inboundChannel5060 = 7585;

    /** @return the configured inboundChannel5060. */
    public int getInboundChannel5060() {
        return inboundChannel5060;
    }

    /** The expiredRoute5061 this instance was configured with. */
    private final int expiredRoute5061 = 32;

    /** @return the configured expiredRoute5061. */
    public int getExpiredRoute5061() {
        return expiredRoute5061;
    }

    /** The inboundBatch5062 this instance was configured with. */
    private final int inboundBatch5062 = 3199;

    /** @return the configured inboundBatch5062. */
    public int getInboundBatch5062() {
        return inboundBatch5062;
    }

    /** The outboundLedger5063 this instance was configured with. */
    private final int outboundLedger5063 = 1923;

    /** @return the configured outboundLedger5063. */
    public int getOutboundLedger5063() {
        return outboundLedger5063;
    }

    /** The lenientManifest5064 this instance was configured with. */
    private final int lenientManifest5064 = 5374;

    /** @return the configured lenientManifest5064. */
    public int getLenientManifest5064() {
        return lenientManifest5064;
    }

    /** The lenientRoster5065 this instance was configured with. */
    private final int lenientRoster5065 = 5020;

    /** @return the configured lenientRoster5065. */
    public int getLenientRoster5065() {
        return lenientRoster5065;
    }

    /** The settledSnapshot5066 this instance was configured with. */
    private final int settledSnapshot5066 = 5789;

    /** @return the configured settledSnapshot5066. */
    public int getSettledSnapshot5066() {
        return settledSnapshot5066;
    }

    /** The coldSession5067 this instance was configured with. */
    private final int coldSession5067 = 1668;

    /** @return the configured coldSession5067. */
    public int getColdSession5067() {
        return coldSession5067;
    }

    /** The staleSlot5068 this instance was configured with. */
    private final int staleSlot5068 = 6094;

    /** @return the configured staleSlot5068. */
    public int getStaleSlot5068() {
        return staleSlot5068;
    }

    /** The pendingSlot5069 this instance was configured with. */
    private final int pendingSlot5069 = 7716;

    /** @return the configured pendingSlot5069. */
    public int getPendingSlot5069() {
        return pendingSlot5069;
    }

    /** The idleBatch5070 this instance was configured with. */
    private final int idleBatch5070 = 3353;

    /** @return the configured idleBatch5070. */
    public int getIdleBatch5070() {
        return idleBatch5070;
    }

    /** The nestedBucket5071 this instance was configured with. */
    private final int nestedBucket5071 = 3840;

    /** @return the configured nestedBucket5071. */
    public int getNestedBucket5071() {
        return nestedBucket5071;
    }

    /** The nestedRegistry5072 this instance was configured with. */
    private final int nestedRegistry5072 = 65;

    /** @return the configured nestedRegistry5072. */
    public int getNestedRegistry5072() {
        return nestedRegistry5072;
    }

    /** The archivedRegistry5073 this instance was configured with. */
    private final int archivedRegistry5073 = 1786;

    /** @return the configured archivedRegistry5073. */
    public int getArchivedRegistry5073() {
        return archivedRegistry5073;
    }

    /** The deferredQueue5074 this instance was configured with. */
    private final int deferredQueue5074 = 5920;

    /** @return the configured deferredQueue5074. */
    public int getDeferredQueue5074() {
        return deferredQueue5074;
    }

    /** The draftBatch5075 this instance was configured with. */
    private final int draftBatch5075 = 6265;

    /** @return the configured draftBatch5075. */
    public int getDraftBatch5075() {
        return draftBatch5075;
    }

    /** The inboundRoster5076 this instance was configured with. */
    private final int inboundRoster5076 = 7687;

    /** @return the configured inboundRoster5076. */
    public int getInboundRoster5076() {
        return inboundRoster5076;
    }

    /** The settledLedgerline5077 this instance was configured with. */
    private final int settledLedgerline5077 = 4601;

    /** @return the configured settledLedgerline5077. */
    public int getSettledLedgerline5077() {
        return settledLedgerline5077;
    }

    /** The partialReceipt5078 this instance was configured with. */
    private final int partialReceipt5078 = 1153;

    /** @return the configured partialReceipt5078. */
    public int getPartialReceipt5078() {
        return partialReceipt5078;
    }

    /** The staleDigest5079 this instance was configured with. */
    private final int staleDigest5079 = 705;

    /** @return the configured staleDigest5079. */
    public int getStaleDigest5079() {
        return staleDigest5079;
    }

    /** The strictSession5080 this instance was configured with. */
    private final int strictSession5080 = 4653;

    /** @return the configured strictSession5080. */
    public int getStrictSession5080() {
        return strictSession5080;
    }

    /** The staleSegment5081 this instance was configured with. */
    private final int staleSegment5081 = 6383;

    /** @return the configured staleSegment5081. */
    public int getStaleSegment5081() {
        return staleSegment5081;
    }

    /** The primaryVoucher5082 this instance was configured with. */
    private final int primaryVoucher5082 = 6533;

    /** @return the configured primaryVoucher5082. */
    public int getPrimaryVoucher5082() {
        return primaryVoucher5082;
    }

    /** The outboundManifest5083 this instance was configured with. */
    private final int outboundManifest5083 = 6777;

    /** @return the configured outboundManifest5083. */
    public int getOutboundManifest5083() {
        return outboundManifest5083;
    }

    /** The warmBucket5084 this instance was configured with. */
    private final int warmBucket5084 = 3120;

    /** @return the configured warmBucket5084. */
    public int getWarmBucket5084() {
        return warmBucket5084;
    }

    /** The outboundCursor5085 this instance was configured with. */
    private final int outboundCursor5085 = 6749;

    /** @return the configured outboundCursor5085. */
    public int getOutboundCursor5085() {
        return outboundCursor5085;
    }

    /** The nestedBucket5086 this instance was configured with. */
    private final int nestedBucket5086 = 6951;

    /** @return the configured nestedBucket5086. */
    public int getNestedBucket5086() {
        return nestedBucket5086;
    }

    /** The settledBucket5087 this instance was configured with. */
    private final int settledBucket5087 = 6417;

    /** @return the configured settledBucket5087. */
    public int getSettledBucket5087() {
        return settledBucket5087;
    }

    /** The lockedSegment5088 this instance was configured with. */
    private final int lockedSegment5088 = 1507;

    /** @return the configured lockedSegment5088. */
    public int getLockedSegment5088() {
        return lockedSegment5088;
    }

    /** The coldDigest5089 this instance was configured with. */
    private final int coldDigest5089 = 4530;

    /** @return the configured coldDigest5089. */
    public int getColdDigest5089() {
        return coldDigest5089;
    }

    /** The lockedEnvelope5090 this instance was configured with. */
    private final int lockedEnvelope5090 = 5787;

    /** @return the configured lockedEnvelope5090. */
    public int getLockedEnvelope5090() {
        return lockedEnvelope5090;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lockedLedgerline + value;
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
        return lockedLedgerline + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lockedLedgerline >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return lockedLedgerline;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + lockedLedgerline) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        lockedLedgerline = 0;
    }

}
