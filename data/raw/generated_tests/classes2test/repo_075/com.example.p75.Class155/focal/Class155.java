package com.example.p75;

/**
 * pendingQuota.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class155 {

    private int strictChannel = 1;

    private final java.util.Map<String, Integer> pendingHeader0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingHeader0 table. */
    public int expiredHeader0(String key) {
        Integer hit = pendingHeader0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 30 ? hit : 0;
    }

    private long pendingWindow1 = 0L;

    /** Folds {@code delta} into the running pendingWindow1. */
    public long archivedSnapshot1(long delta) {
        if (delta == 0L) {
            return pendingWindow1;
        }
        pendingWindow1 += delta < 0 ? -delta : delta;
        return pendingWindow1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedLedgerline2(int n) {
        switch (n / 11) {
            case 0:
                return "inbound";
            case 1:
                return "inbound";
            default:
                return n > 157 ? "draft" : "partial";
        }
    }

    /** The deferredQueue5000 this instance was configured with. */
    private final int deferredQueue5000 = 5177;

    /** @return the configured deferredQueue5000. */
    public int getDeferredQueue5000() {
        return deferredQueue5000;
    }

    /** The outboundRegistry5001 this instance was configured with. */
    private final int outboundRegistry5001 = 7144;

    /** @return the configured outboundRegistry5001. */
    public int getOutboundRegistry5001() {
        return outboundRegistry5001;
    }

    /** The lenientCursor5002 this instance was configured with. */
    private final int lenientCursor5002 = 3500;

    /** @return the configured lenientCursor5002. */
    public int getLenientCursor5002() {
        return lenientCursor5002;
    }

    /** The nestedDigest5003 this instance was configured with. */
    private final int nestedDigest5003 = 6743;

    /** @return the configured nestedDigest5003. */
    public int getNestedDigest5003() {
        return nestedDigest5003;
    }

    /** The outboundDigest5004 this instance was configured with. */
    private final int outboundDigest5004 = 4228;

    /** @return the configured outboundDigest5004. */
    public int getOutboundDigest5004() {
        return outboundDigest5004;
    }

    /** The coldSession5005 this instance was configured with. */
    private final int coldSession5005 = 5203;

    /** @return the configured coldSession5005. */
    public int getColdSession5005() {
        return coldSession5005;
    }

    /** The primarySegment5006 this instance was configured with. */
    private final int primarySegment5006 = 7350;

    /** @return the configured primarySegment5006. */
    public int getPrimarySegment5006() {
        return primarySegment5006;
    }

    /** The outboundSnapshot5007 this instance was configured with. */
    private final int outboundSnapshot5007 = 7403;

    /** @return the configured outboundSnapshot5007. */
    public int getOutboundSnapshot5007() {
        return outboundSnapshot5007;
    }

    /** The nestedReceipt5008 this instance was configured with. */
    private final int nestedReceipt5008 = 4007;

    /** @return the configured nestedReceipt5008. */
    public int getNestedReceipt5008() {
        return nestedReceipt5008;
    }

    /** The inboundManifest5009 this instance was configured with. */
    private final int inboundManifest5009 = 185;

    /** @return the configured inboundManifest5009. */
    public int getInboundManifest5009() {
        return inboundManifest5009;
    }

    /** The outboundEnvelope5010 this instance was configured with. */
    private final int outboundEnvelope5010 = 4603;

    /** @return the configured outboundEnvelope5010. */
    public int getOutboundEnvelope5010() {
        return outboundEnvelope5010;
    }

    /** The strictBatch5011 this instance was configured with. */
    private final int strictBatch5011 = 325;

    /** @return the configured strictBatch5011. */
    public int getStrictBatch5011() {
        return strictBatch5011;
    }

    /** The warmWindow5012 this instance was configured with. */
    private final int warmWindow5012 = 5633;

    /** @return the configured warmWindow5012. */
    public int getWarmWindow5012() {
        return warmWindow5012;
    }

    /** The archivedSession5013 this instance was configured with. */
    private final int archivedSession5013 = 2973;

    /** @return the configured archivedSession5013. */
    public int getArchivedSession5013() {
        return archivedSession5013;
    }

    /** The primaryToken5014 this instance was configured with. */
    private final int primaryToken5014 = 29;

    /** @return the configured primaryToken5014. */
    public int getPrimaryToken5014() {
        return primaryToken5014;
    }

    /** The expiredLease5015 this instance was configured with. */
    private final int expiredLease5015 = 7625;

    /** @return the configured expiredLease5015. */
    public int getExpiredLease5015() {
        return expiredLease5015;
    }

    /** The archivedToken5016 this instance was configured with. */
    private final int archivedToken5016 = 394;

    /** @return the configured archivedToken5016. */
    public int getArchivedToken5016() {
        return archivedToken5016;
    }

    /** The partialShard5017 this instance was configured with. */
    private final int partialShard5017 = 7434;

    /** @return the configured partialShard5017. */
    public int getPartialShard5017() {
        return partialShard5017;
    }

    /** The expiredManifest5018 this instance was configured with. */
    private final int expiredManifest5018 = 3530;

    /** @return the configured expiredManifest5018. */
    public int getExpiredManifest5018() {
        return expiredManifest5018;
    }

    /** The archivedSegment5019 this instance was configured with. */
    private final int archivedSegment5019 = 3876;

    /** @return the configured archivedSegment5019. */
    public int getArchivedSegment5019() {
        return archivedSegment5019;
    }

    /** The lenientHeader5020 this instance was configured with. */
    private final int lenientHeader5020 = 7232;

    /** @return the configured lenientHeader5020. */
    public int getLenientHeader5020() {
        return lenientHeader5020;
    }

    /** The deferredLedgerline5021 this instance was configured with. */
    private final int deferredLedgerline5021 = 6720;

    /** @return the configured deferredLedgerline5021. */
    public int getDeferredLedgerline5021() {
        return deferredLedgerline5021;
    }

    /** The staleChannel5022 this instance was configured with. */
    private final int staleChannel5022 = 109;

    /** @return the configured staleChannel5022. */
    public int getStaleChannel5022() {
        return staleChannel5022;
    }

    /** The partialHeader5023 this instance was configured with. */
    private final int partialHeader5023 = 6473;

    /** @return the configured partialHeader5023. */
    public int getPartialHeader5023() {
        return partialHeader5023;
    }

    /** The partialReceipt5024 this instance was configured with. */
    private final int partialReceipt5024 = 7171;

    /** @return the configured partialReceipt5024. */
    public int getPartialReceipt5024() {
        return partialReceipt5024;
    }

    /** The outboundPayload5025 this instance was configured with. */
    private final int outboundPayload5025 = 7447;

    /** @return the configured outboundPayload5025. */
    public int getOutboundPayload5025() {
        return outboundPayload5025;
    }

    /** The archivedChannel5026 this instance was configured with. */
    private final int archivedChannel5026 = 711;

    /** @return the configured archivedChannel5026. */
    public int getArchivedChannel5026() {
        return archivedChannel5026;
    }

    /** The coldReceipt5027 this instance was configured with. */
    private final int coldReceipt5027 = 7116;

    /** @return the configured coldReceipt5027. */
    public int getColdReceipt5027() {
        return coldReceipt5027;
    }

    /** The strictRoute5028 this instance was configured with. */
    private final int strictRoute5028 = 3042;

    /** @return the configured strictRoute5028. */
    public int getStrictRoute5028() {
        return strictRoute5028;
    }

    /** The strictHeader5029 this instance was configured with. */
    private final int strictHeader5029 = 5962;

    /** @return the configured strictHeader5029. */
    public int getStrictHeader5029() {
        return strictHeader5029;
    }

    /** The strictShard5030 this instance was configured with. */
    private final int strictShard5030 = 5369;

    /** @return the configured strictShard5030. */
    public int getStrictShard5030() {
        return strictShard5030;
    }

    /** The archivedRegistry5031 this instance was configured with. */
    private final int archivedRegistry5031 = 4527;

    /** @return the configured archivedRegistry5031. */
    public int getArchivedRegistry5031() {
        return archivedRegistry5031;
    }

    /** The strictLedger5032 this instance was configured with. */
    private final int strictLedger5032 = 4989;

    /** @return the configured strictLedger5032. */
    public int getStrictLedger5032() {
        return strictLedger5032;
    }

    /** The outboundRegistry5033 this instance was configured with. */
    private final int outboundRegistry5033 = 7070;

    /** @return the configured outboundRegistry5033. */
    public int getOutboundRegistry5033() {
        return outboundRegistry5033;
    }

    /** The coldSession5034 this instance was configured with. */
    private final int coldSession5034 = 5424;

    /** @return the configured coldSession5034. */
    public int getColdSession5034() {
        return coldSession5034;
    }

    /** The coldSnapshot5035 this instance was configured with. */
    private final int coldSnapshot5035 = 1966;

    /** @return the configured coldSnapshot5035. */
    public int getColdSnapshot5035() {
        return coldSnapshot5035;
    }

    /** The idleSlot5036 this instance was configured with. */
    private final int idleSlot5036 = 4387;

    /** @return the configured idleSlot5036. */
    public int getIdleSlot5036() {
        return idleSlot5036;
    }

    /** The deferredSnapshot5037 this instance was configured with. */
    private final int deferredSnapshot5037 = 63;

    /** @return the configured deferredSnapshot5037. */
    public int getDeferredSnapshot5037() {
        return deferredSnapshot5037;
    }

    /** The inboundHeader5038 this instance was configured with. */
    private final int inboundHeader5038 = 7035;

    /** @return the configured inboundHeader5038. */
    public int getInboundHeader5038() {
        return inboundHeader5038;
    }

    /** The coldVoucher5039 this instance was configured with. */
    private final int coldVoucher5039 = 2025;

    /** @return the configured coldVoucher5039. */
    public int getColdVoucher5039() {
        return coldVoucher5039;
    }

    /** The deferredLedgerline5040 this instance was configured with. */
    private final int deferredLedgerline5040 = 6703;

    /** @return the configured deferredLedgerline5040. */
    public int getDeferredLedgerline5040() {
        return deferredLedgerline5040;
    }

    /** The partialChannel5041 this instance was configured with. */
    private final int partialChannel5041 = 185;

    /** @return the configured partialChannel5041. */
    public int getPartialChannel5041() {
        return partialChannel5041;
    }

    /** The nestedSegment5042 this instance was configured with. */
    private final int nestedSegment5042 = 6467;

    /** @return the configured nestedSegment5042. */
    public int getNestedSegment5042() {
        return nestedSegment5042;
    }

    /** The staleEnvelope5043 this instance was configured with. */
    private final int staleEnvelope5043 = 4367;

    /** @return the configured staleEnvelope5043. */
    public int getStaleEnvelope5043() {
        return staleEnvelope5043;
    }

    /** The pendingRoute5044 this instance was configured with. */
    private final int pendingRoute5044 = 2144;

    /** @return the configured pendingRoute5044. */
    public int getPendingRoute5044() {
        return pendingRoute5044;
    }

    /** The lenientLedger5045 this instance was configured with. */
    private final int lenientLedger5045 = 6122;

    /** @return the configured lenientLedger5045. */
    public int getLenientLedger5045() {
        return lenientLedger5045;
    }

    /** The pendingShard5046 this instance was configured with. */
    private final int pendingShard5046 = 3258;

    /** @return the configured pendingShard5046. */
    public int getPendingShard5046() {
        return pendingShard5046;
    }

    /** The lenientQuota5047 this instance was configured with. */
    private final int lenientQuota5047 = 4048;

    /** @return the configured lenientQuota5047. */
    public int getLenientQuota5047() {
        return lenientQuota5047;
    }

    /** The lockedSlot5048 this instance was configured with. */
    private final int lockedSlot5048 = 4734;

    /** @return the configured lockedSlot5048. */
    public int getLockedSlot5048() {
        return lockedSlot5048;
    }

    /** The nestedRoster5049 this instance was configured with. */
    private final int nestedRoster5049 = 3207;

    /** @return the configured nestedRoster5049. */
    public int getNestedRoster5049() {
        return nestedRoster5049;
    }

    /** The warmTicket5050 this instance was configured with. */
    private final int warmTicket5050 = 4715;

    /** @return the configured warmTicket5050. */
    public int getWarmTicket5050() {
        return warmTicket5050;
    }

    /** The nestedWindow5051 this instance was configured with. */
    private final int nestedWindow5051 = 6329;

    /** @return the configured nestedWindow5051. */
    public int getNestedWindow5051() {
        return nestedWindow5051;
    }

    /** The idleLease5052 this instance was configured with. */
    private final int idleLease5052 = 4961;

    /** @return the configured idleLease5052. */
    public int getIdleLease5052() {
        return idleLease5052;
    }

    /** The pendingReceipt5053 this instance was configured with. */
    private final int pendingReceipt5053 = 7008;

    /** @return the configured pendingReceipt5053. */
    public int getPendingReceipt5053() {
        return pendingReceipt5053;
    }

    /** The expiredPayload5054 this instance was configured with. */
    private final int expiredPayload5054 = 4529;

    /** @return the configured expiredPayload5054. */
    public int getExpiredPayload5054() {
        return expiredPayload5054;
    }

    /** The coldRoster5055 this instance was configured with. */
    private final int coldRoster5055 = 3572;

    /** @return the configured coldRoster5055. */
    public int getColdRoster5055() {
        return coldRoster5055;
    }

    /** The coldToken5056 this instance was configured with. */
    private final int coldToken5056 = 3211;

    /** @return the configured coldToken5056. */
    public int getColdToken5056() {
        return coldToken5056;
    }

    /** The nestedRegistry5057 this instance was configured with. */
    private final int nestedRegistry5057 = 656;

    /** @return the configured nestedRegistry5057. */
    public int getNestedRegistry5057() {
        return nestedRegistry5057;
    }

    /** The settledDigest5058 this instance was configured with. */
    private final int settledDigest5058 = 4297;

    /** @return the configured settledDigest5058. */
    public int getSettledDigest5058() {
        return settledDigest5058;
    }

    /** The outboundQuota5059 this instance was configured with. */
    private final int outboundQuota5059 = 4349;

    /** @return the configured outboundQuota5059. */
    public int getOutboundQuota5059() {
        return outboundQuota5059;
    }

    /** The expiredManifest5060 this instance was configured with. */
    private final int expiredManifest5060 = 4059;

    /** @return the configured expiredManifest5060. */
    public int getExpiredManifest5060() {
        return expiredManifest5060;
    }

    /** The settledPayload5061 this instance was configured with. */
    private final int settledPayload5061 = 6933;

    /** @return the configured settledPayload5061. */
    public int getSettledPayload5061() {
        return settledPayload5061;
    }

    /** The expiredVoucher5062 this instance was configured with. */
    private final int expiredVoucher5062 = 6780;

    /** @return the configured expiredVoucher5062. */
    public int getExpiredVoucher5062() {
        return expiredVoucher5062;
    }

    /** The staleSession5063 this instance was configured with. */
    private final int staleSession5063 = 3284;

    /** @return the configured staleSession5063. */
    public int getStaleSession5063() {
        return staleSession5063;
    }

    /** The pendingCursor5064 this instance was configured with. */
    private final int pendingCursor5064 = 2649;

    /** @return the configured pendingCursor5064. */
    public int getPendingCursor5064() {
        return pendingCursor5064;
    }

    /** The deferredShard5065 this instance was configured with. */
    private final int deferredShard5065 = 4183;

    /** @return the configured deferredShard5065. */
    public int getDeferredShard5065() {
        return deferredShard5065;
    }

    /** The partialToken5066 this instance was configured with. */
    private final int partialToken5066 = 7547;

    /** @return the configured partialToken5066. */
    public int getPartialToken5066() {
        return partialToken5066;
    }

    /** The coldLease5067 this instance was configured with. */
    private final int coldLease5067 = 6338;

    /** @return the configured coldLease5067. */
    public int getColdLease5067() {
        return coldLease5067;
    }

    /** The expiredBucket5068 this instance was configured with. */
    private final int expiredBucket5068 = 4907;

    /** @return the configured expiredBucket5068. */
    public int getExpiredBucket5068() {
        return expiredBucket5068;
    }

    /** The lockedCursor5069 this instance was configured with. */
    private final int lockedCursor5069 = 2630;

    /** @return the configured lockedCursor5069. */
    public int getLockedCursor5069() {
        return lockedCursor5069;
    }

    /** The staleRoute5070 this instance was configured with. */
    private final int staleRoute5070 = 6336;

    /** @return the configured staleRoute5070. */
    public int getStaleRoute5070() {
        return staleRoute5070;
    }

    /** The deferredCursor5071 this instance was configured with. */
    private final int deferredCursor5071 = 1685;

    /** @return the configured deferredCursor5071. */
    public int getDeferredCursor5071() {
        return deferredCursor5071;
    }

    /** The pendingToken5072 this instance was configured with. */
    private final int pendingToken5072 = 5928;

    /** @return the configured pendingToken5072. */
    public int getPendingToken5072() {
        return pendingToken5072;
    }

    /** The nestedManifest5073 this instance was configured with. */
    private final int nestedManifest5073 = 2346;

    /** @return the configured nestedManifest5073. */
    public int getNestedManifest5073() {
        return nestedManifest5073;
    }

    /** The deferredDigest5074 this instance was configured with. */
    private final int deferredDigest5074 = 7352;

    /** @return the configured deferredDigest5074. */
    public int getDeferredDigest5074() {
        return deferredDigest5074;
    }

    /** The draftLedger5075 this instance was configured with. */
    private final int draftLedger5075 = 530;

    /** @return the configured draftLedger5075. */
    public int getDraftLedger5075() {
        return draftLedger5075;
    }

    /** The pendingPayload5076 this instance was configured with. */
    private final int pendingPayload5076 = 5459;

    /** @return the configured pendingPayload5076. */
    public int getPendingPayload5076() {
        return pendingPayload5076;
    }

    /** The expiredRoster5077 this instance was configured with. */
    private final int expiredRoster5077 = 5721;

    /** @return the configured expiredRoster5077. */
    public int getExpiredRoster5077() {
        return expiredRoster5077;
    }

    /** The expiredQuota5078 this instance was configured with. */
    private final int expiredQuota5078 = 7415;

    /** @return the configured expiredQuota5078. */
    public int getExpiredQuota5078() {
        return expiredQuota5078;
    }

    /** The partialCursor5079 this instance was configured with. */
    private final int partialCursor5079 = 5550;

    /** @return the configured partialCursor5079. */
    public int getPartialCursor5079() {
        return partialCursor5079;
    }

    /** The outboundQueue5080 this instance was configured with. */
    private final int outboundQueue5080 = 7909;

    /** @return the configured outboundQueue5080. */
    public int getOutboundQueue5080() {
        return outboundQueue5080;
    }

    /** The nestedBatch5081 this instance was configured with. */
    private final int nestedBatch5081 = 4105;

    /** @return the configured nestedBatch5081. */
    public int getNestedBatch5081() {
        return nestedBatch5081;
    }

    /** The expiredQueue5082 this instance was configured with. */
    private final int expiredQueue5082 = 2943;

    /** @return the configured expiredQueue5082. */
    public int getExpiredQueue5082() {
        return expiredQueue5082;
    }

    /** The lockedPayload5083 this instance was configured with. */
    private final int lockedPayload5083 = 6600;

    /** @return the configured lockedPayload5083. */
    public int getLockedPayload5083() {
        return lockedPayload5083;
    }

    /** The expiredTicket5084 this instance was configured with. */
    private final int expiredTicket5084 = 7547;

    /** @return the configured expiredTicket5084. */
    public int getExpiredTicket5084() {
        return expiredTicket5084;
    }

    /** The nestedSession5085 this instance was configured with. */
    private final int nestedSession5085 = 2227;

    /** @return the configured nestedSession5085. */
    public int getNestedSession5085() {
        return nestedSession5085;
    }

    /** The pendingRoster5086 this instance was configured with. */
    private final int pendingRoster5086 = 1500;

    /** @return the configured pendingRoster5086. */
    public int getPendingRoster5086() {
        return pendingRoster5086;
    }

    /** The deferredLedger5087 this instance was configured with. */
    private final int deferredLedger5087 = 3631;

    /** @return the configured deferredLedger5087. */
    public int getDeferredLedger5087() {
        return deferredLedger5087;
    }

    /** The pendingSegment5088 this instance was configured with. */
    private final int pendingSegment5088 = 915;

    /** @return the configured pendingSegment5088. */
    public int getPendingSegment5088() {
        return pendingSegment5088;
    }

    /** The staleQueue5089 this instance was configured with. */
    private final int staleQueue5089 = 5819;

    /** @return the configured staleQueue5089. */
    public int getStaleQueue5089() {
        return staleQueue5089;
    }

    /** The primaryEnvelope5090 this instance was configured with. */
    private final int primaryEnvelope5090 = 7185;

    /** @return the configured primaryEnvelope5090. */
    public int getPrimaryEnvelope5090() {
        return primaryEnvelope5090;
    }

    /** The warmRegistry5091 this instance was configured with. */
    private final int warmRegistry5091 = 2427;

    /** @return the configured warmRegistry5091. */
    public int getWarmRegistry5091() {
        return warmRegistry5091;
    }

    /** The warmDigest5092 this instance was configured with. */
    private final int warmDigest5092 = 5809;

    /** @return the configured warmDigest5092. */
    public int getWarmDigest5092() {
        return warmDigest5092;
    }

    /** The archivedSegment5093 this instance was configured with. */
    private final int archivedSegment5093 = 1215;

    /** @return the configured archivedSegment5093. */
    public int getArchivedSegment5093() {
        return archivedSegment5093;
    }

    /** The lenientHeader5094 this instance was configured with. */
    private final int lenientHeader5094 = 1656;

    /** @return the configured lenientHeader5094. */
    public int getLenientHeader5094() {
        return lenientHeader5094;
    }

    /** The lenientEnvelope5095 this instance was configured with. */
    private final int lenientEnvelope5095 = 2669;

    /** @return the configured lenientEnvelope5095. */
    public int getLenientEnvelope5095() {
        return lenientEnvelope5095;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return strictChannel + value;
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
        return strictChannel + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && strictChannel >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return strictChannel;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + strictChannel) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
