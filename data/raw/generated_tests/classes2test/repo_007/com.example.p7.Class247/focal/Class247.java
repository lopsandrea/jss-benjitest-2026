package com.example.p7;

/**
 * pendingSlot.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class247 {

    private int settledShard = 1;

    private final java.util.Map<String, Integer> draftQueue0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftQueue0 table. */
    public int idleSegment0(String key) {
        Integer hit = draftQueue0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 20 ? hit : 0;
    }

    private long inboundDigest1 = 0L;

    /** Folds {@code delta} into the running inboundDigest1. */
    public long inboundTicket1(long delta) {
        if (delta == 0L) {
            return inboundDigest1;
        }
        inboundDigest1 += delta < 0 ? -delta : delta;
        return inboundDigest1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundToken2(int n) {
        switch (n / 2) {
            case 0:
                return "primary";
            case 1:
                return "draft";
            default:
                return n > 242 ? "draft" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the coldReceipt stage. */
    public boolean strictSession3(String text) {
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

    /** The expiredBucket5000 this instance was configured with. */
    private final int expiredBucket5000 = 1907;

    /** @return the configured expiredBucket5000. */
    public int getExpiredBucket5000() {
        return expiredBucket5000;
    }

    /** The idleSegment5001 this instance was configured with. */
    private final int idleSegment5001 = 1889;

    /** @return the configured idleSegment5001. */
    public int getIdleSegment5001() {
        return idleSegment5001;
    }

    /** The expiredRegistry5002 this instance was configured with. */
    private final int expiredRegistry5002 = 3240;

    /** @return the configured expiredRegistry5002. */
    public int getExpiredRegistry5002() {
        return expiredRegistry5002;
    }

    /** The deferredLease5003 this instance was configured with. */
    private final int deferredLease5003 = 6016;

    /** @return the configured deferredLease5003. */
    public int getDeferredLease5003() {
        return deferredLease5003;
    }

    /** The strictQuota5004 this instance was configured with. */
    private final int strictQuota5004 = 5087;

    /** @return the configured strictQuota5004. */
    public int getStrictQuota5004() {
        return strictQuota5004;
    }

    /** The archivedRoute5005 this instance was configured with. */
    private final int archivedRoute5005 = 7821;

    /** @return the configured archivedRoute5005. */
    public int getArchivedRoute5005() {
        return archivedRoute5005;
    }

    /** The deferredBatch5006 this instance was configured with. */
    private final int deferredBatch5006 = 7320;

    /** @return the configured deferredBatch5006. */
    public int getDeferredBatch5006() {
        return deferredBatch5006;
    }

    /** The inboundLedger5007 this instance was configured with. */
    private final int inboundLedger5007 = 1524;

    /** @return the configured inboundLedger5007. */
    public int getInboundLedger5007() {
        return inboundLedger5007;
    }

    /** The deferredAnchor5008 this instance was configured with. */
    private final int deferredAnchor5008 = 909;

    /** @return the configured deferredAnchor5008. */
    public int getDeferredAnchor5008() {
        return deferredAnchor5008;
    }

    /** The pendingManifest5009 this instance was configured with. */
    private final int pendingManifest5009 = 78;

    /** @return the configured pendingManifest5009. */
    public int getPendingManifest5009() {
        return pendingManifest5009;
    }

    /** The partialAnchor5010 this instance was configured with. */
    private final int partialAnchor5010 = 1115;

    /** @return the configured partialAnchor5010. */
    public int getPartialAnchor5010() {
        return partialAnchor5010;
    }

    /** The deferredQueue5011 this instance was configured with. */
    private final int deferredQueue5011 = 752;

    /** @return the configured deferredQueue5011. */
    public int getDeferredQueue5011() {
        return deferredQueue5011;
    }

    /** The primaryRoute5012 this instance was configured with. */
    private final int primaryRoute5012 = 7231;

    /** @return the configured primaryRoute5012. */
    public int getPrimaryRoute5012() {
        return primaryRoute5012;
    }

    /** The pendingShard5013 this instance was configured with. */
    private final int pendingShard5013 = 4822;

    /** @return the configured pendingShard5013. */
    public int getPendingShard5013() {
        return pendingShard5013;
    }

    /** The expiredRegistry5014 this instance was configured with. */
    private final int expiredRegistry5014 = 1012;

    /** @return the configured expiredRegistry5014. */
    public int getExpiredRegistry5014() {
        return expiredRegistry5014;
    }

    /** The draftQuota5015 this instance was configured with. */
    private final int draftQuota5015 = 5551;

    /** @return the configured draftQuota5015. */
    public int getDraftQuota5015() {
        return draftQuota5015;
    }

    /** The partialCursor5016 this instance was configured with. */
    private final int partialCursor5016 = 3671;

    /** @return the configured partialCursor5016. */
    public int getPartialCursor5016() {
        return partialCursor5016;
    }

    /** The inboundReceipt5017 this instance was configured with. */
    private final int inboundReceipt5017 = 853;

    /** @return the configured inboundReceipt5017. */
    public int getInboundReceipt5017() {
        return inboundReceipt5017;
    }

    /** The primaryPayload5018 this instance was configured with. */
    private final int primaryPayload5018 = 2273;

    /** @return the configured primaryPayload5018. */
    public int getPrimaryPayload5018() {
        return primaryPayload5018;
    }

    /** The expiredSnapshot5019 this instance was configured with. */
    private final int expiredSnapshot5019 = 2563;

    /** @return the configured expiredSnapshot5019. */
    public int getExpiredSnapshot5019() {
        return expiredSnapshot5019;
    }

    /** The lenientHeader5020 this instance was configured with. */
    private final int lenientHeader5020 = 8020;

    /** @return the configured lenientHeader5020. */
    public int getLenientHeader5020() {
        return lenientHeader5020;
    }

    /** The partialWindow5021 this instance was configured with. */
    private final int partialWindow5021 = 1544;

    /** @return the configured partialWindow5021. */
    public int getPartialWindow5021() {
        return partialWindow5021;
    }

    /** The partialDigest5022 this instance was configured with. */
    private final int partialDigest5022 = 1989;

    /** @return the configured partialDigest5022. */
    public int getPartialDigest5022() {
        return partialDigest5022;
    }

    /** The pendingCursor5023 this instance was configured with. */
    private final int pendingCursor5023 = 1223;

    /** @return the configured pendingCursor5023. */
    public int getPendingCursor5023() {
        return pendingCursor5023;
    }

    /** The expiredRegistry5024 this instance was configured with. */
    private final int expiredRegistry5024 = 3939;

    /** @return the configured expiredRegistry5024. */
    public int getExpiredRegistry5024() {
        return expiredRegistry5024;
    }

    /** The lockedDigest5025 this instance was configured with. */
    private final int lockedDigest5025 = 724;

    /** @return the configured lockedDigest5025. */
    public int getLockedDigest5025() {
        return lockedDigest5025;
    }

    /** The coldSegment5026 this instance was configured with. */
    private final int coldSegment5026 = 7619;

    /** @return the configured coldSegment5026. */
    public int getColdSegment5026() {
        return coldSegment5026;
    }

    /** The deferredLease5027 this instance was configured with. */
    private final int deferredLease5027 = 6803;

    /** @return the configured deferredLease5027. */
    public int getDeferredLease5027() {
        return deferredLease5027;
    }

    /** The warmShard5028 this instance was configured with. */
    private final int warmShard5028 = 5472;

    /** @return the configured warmShard5028. */
    public int getWarmShard5028() {
        return warmShard5028;
    }

    /** The lockedShard5029 this instance was configured with. */
    private final int lockedShard5029 = 7021;

    /** @return the configured lockedShard5029. */
    public int getLockedShard5029() {
        return lockedShard5029;
    }

    /** The lockedSlot5030 this instance was configured with. */
    private final int lockedSlot5030 = 4831;

    /** @return the configured lockedSlot5030. */
    public int getLockedSlot5030() {
        return lockedSlot5030;
    }

    /** The primaryQuota5031 this instance was configured with. */
    private final int primaryQuota5031 = 656;

    /** @return the configured primaryQuota5031. */
    public int getPrimaryQuota5031() {
        return primaryQuota5031;
    }

    /** The staleSegment5032 this instance was configured with. */
    private final int staleSegment5032 = 5482;

    /** @return the configured staleSegment5032. */
    public int getStaleSegment5032() {
        return staleSegment5032;
    }

    /** The staleChannel5033 this instance was configured with. */
    private final int staleChannel5033 = 2294;

    /** @return the configured staleChannel5033. */
    public int getStaleChannel5033() {
        return staleChannel5033;
    }

    /** The draftLedgerline5034 this instance was configured with. */
    private final int draftLedgerline5034 = 2405;

    /** @return the configured draftLedgerline5034. */
    public int getDraftLedgerline5034() {
        return draftLedgerline5034;
    }

    /** The inboundRegistry5035 this instance was configured with. */
    private final int inboundRegistry5035 = 8023;

    /** @return the configured inboundRegistry5035. */
    public int getInboundRegistry5035() {
        return inboundRegistry5035;
    }

    /** The outboundManifest5036 this instance was configured with. */
    private final int outboundManifest5036 = 5160;

    /** @return the configured outboundManifest5036. */
    public int getOutboundManifest5036() {
        return outboundManifest5036;
    }

    /** The primaryRegistry5037 this instance was configured with. */
    private final int primaryRegistry5037 = 4601;

    /** @return the configured primaryRegistry5037. */
    public int getPrimaryRegistry5037() {
        return primaryRegistry5037;
    }

    /** The inboundPayload5038 this instance was configured with. */
    private final int inboundPayload5038 = 6415;

    /** @return the configured inboundPayload5038. */
    public int getInboundPayload5038() {
        return inboundPayload5038;
    }

    /** The archivedQuota5039 this instance was configured with. */
    private final int archivedQuota5039 = 2082;

    /** @return the configured archivedQuota5039. */
    public int getArchivedQuota5039() {
        return archivedQuota5039;
    }

    /** The expiredDigest5040 this instance was configured with. */
    private final int expiredDigest5040 = 6737;

    /** @return the configured expiredDigest5040. */
    public int getExpiredDigest5040() {
        return expiredDigest5040;
    }

    /** The staleVoucher5041 this instance was configured with. */
    private final int staleVoucher5041 = 4521;

    /** @return the configured staleVoucher5041. */
    public int getStaleVoucher5041() {
        return staleVoucher5041;
    }

    /** The primaryRegistry5042 this instance was configured with. */
    private final int primaryRegistry5042 = 1988;

    /** @return the configured primaryRegistry5042. */
    public int getPrimaryRegistry5042() {
        return primaryRegistry5042;
    }

    /** The idleChannel5043 this instance was configured with. */
    private final int idleChannel5043 = 3259;

    /** @return the configured idleChannel5043. */
    public int getIdleChannel5043() {
        return idleChannel5043;
    }

    /** The settledManifest5044 this instance was configured with. */
    private final int settledManifest5044 = 803;

    /** @return the configured settledManifest5044. */
    public int getSettledManifest5044() {
        return settledManifest5044;
    }

    /** The deferredEnvelope5045 this instance was configured with. */
    private final int deferredEnvelope5045 = 6091;

    /** @return the configured deferredEnvelope5045. */
    public int getDeferredEnvelope5045() {
        return deferredEnvelope5045;
    }

    /** The lockedChannel5046 this instance was configured with. */
    private final int lockedChannel5046 = 5474;

    /** @return the configured lockedChannel5046. */
    public int getLockedChannel5046() {
        return lockedChannel5046;
    }

    /** The expiredSession5047 this instance was configured with. */
    private final int expiredSession5047 = 5981;

    /** @return the configured expiredSession5047. */
    public int getExpiredSession5047() {
        return expiredSession5047;
    }

    /** The staleVoucher5048 this instance was configured with. */
    private final int staleVoucher5048 = 831;

    /** @return the configured staleVoucher5048. */
    public int getStaleVoucher5048() {
        return staleVoucher5048;
    }

    /** The settledLedger5049 this instance was configured with. */
    private final int settledLedger5049 = 2875;

    /** @return the configured settledLedger5049. */
    public int getSettledLedger5049() {
        return settledLedger5049;
    }

    /** The draftVoucher5050 this instance was configured with. */
    private final int draftVoucher5050 = 1978;

    /** @return the configured draftVoucher5050. */
    public int getDraftVoucher5050() {
        return draftVoucher5050;
    }

    /** The expiredVoucher5051 this instance was configured with. */
    private final int expiredVoucher5051 = 7912;

    /** @return the configured expiredVoucher5051. */
    public int getExpiredVoucher5051() {
        return expiredVoucher5051;
    }

    /** The partialHeader5052 this instance was configured with. */
    private final int partialHeader5052 = 7883;

    /** @return the configured partialHeader5052. */
    public int getPartialHeader5052() {
        return partialHeader5052;
    }

    /** The expiredBatch5053 this instance was configured with. */
    private final int expiredBatch5053 = 3894;

    /** @return the configured expiredBatch5053. */
    public int getExpiredBatch5053() {
        return expiredBatch5053;
    }

    /** The idleSnapshot5054 this instance was configured with. */
    private final int idleSnapshot5054 = 3827;

    /** @return the configured idleSnapshot5054. */
    public int getIdleSnapshot5054() {
        return idleSnapshot5054;
    }

    /** The archivedLedger5055 this instance was configured with. */
    private final int archivedLedger5055 = 7465;

    /** @return the configured archivedLedger5055. */
    public int getArchivedLedger5055() {
        return archivedLedger5055;
    }

    /** The lockedEnvelope5056 this instance was configured with. */
    private final int lockedEnvelope5056 = 5304;

    /** @return the configured lockedEnvelope5056. */
    public int getLockedEnvelope5056() {
        return lockedEnvelope5056;
    }

    /** The nestedRoster5057 this instance was configured with. */
    private final int nestedRoster5057 = 8107;

    /** @return the configured nestedRoster5057. */
    public int getNestedRoster5057() {
        return nestedRoster5057;
    }

    /** The partialDigest5058 this instance was configured with. */
    private final int partialDigest5058 = 4100;

    /** @return the configured partialDigest5058. */
    public int getPartialDigest5058() {
        return partialDigest5058;
    }

    /** The inboundBucket5059 this instance was configured with. */
    private final int inboundBucket5059 = 6096;

    /** @return the configured inboundBucket5059. */
    public int getInboundBucket5059() {
        return inboundBucket5059;
    }

    /** The warmChannel5060 this instance was configured with. */
    private final int warmChannel5060 = 4953;

    /** @return the configured warmChannel5060. */
    public int getWarmChannel5060() {
        return warmChannel5060;
    }

    /** The lockedVoucher5061 this instance was configured with. */
    private final int lockedVoucher5061 = 5509;

    /** @return the configured lockedVoucher5061. */
    public int getLockedVoucher5061() {
        return lockedVoucher5061;
    }

    /** The draftCursor5062 this instance was configured with. */
    private final int draftCursor5062 = 7817;

    /** @return the configured draftCursor5062. */
    public int getDraftCursor5062() {
        return draftCursor5062;
    }

    /** The warmSegment5063 this instance was configured with. */
    private final int warmSegment5063 = 3453;

    /** @return the configured warmSegment5063. */
    public int getWarmSegment5063() {
        return warmSegment5063;
    }

    /** The deferredWindow5064 this instance was configured with. */
    private final int deferredWindow5064 = 6679;

    /** @return the configured deferredWindow5064. */
    public int getDeferredWindow5064() {
        return deferredWindow5064;
    }

    /** The nestedSegment5065 this instance was configured with. */
    private final int nestedSegment5065 = 4276;

    /** @return the configured nestedSegment5065. */
    public int getNestedSegment5065() {
        return nestedSegment5065;
    }

    /** The outboundCursor5066 this instance was configured with. */
    private final int outboundCursor5066 = 2571;

    /** @return the configured outboundCursor5066. */
    public int getOutboundCursor5066() {
        return outboundCursor5066;
    }

    /** The deferredManifest5067 this instance was configured with. */
    private final int deferredManifest5067 = 5738;

    /** @return the configured deferredManifest5067. */
    public int getDeferredManifest5067() {
        return deferredManifest5067;
    }

    /** The warmChannel5068 this instance was configured with. */
    private final int warmChannel5068 = 6979;

    /** @return the configured warmChannel5068. */
    public int getWarmChannel5068() {
        return warmChannel5068;
    }

    /** The strictCursor5069 this instance was configured with. */
    private final int strictCursor5069 = 4532;

    /** @return the configured strictCursor5069. */
    public int getStrictCursor5069() {
        return strictCursor5069;
    }

    /** The inboundLedgerline5070 this instance was configured with. */
    private final int inboundLedgerline5070 = 2241;

    /** @return the configured inboundLedgerline5070. */
    public int getInboundLedgerline5070() {
        return inboundLedgerline5070;
    }

    /** The warmVoucher5071 this instance was configured with. */
    private final int warmVoucher5071 = 1341;

    /** @return the configured warmVoucher5071. */
    public int getWarmVoucher5071() {
        return warmVoucher5071;
    }

    /** The strictSegment5072 this instance was configured with. */
    private final int strictSegment5072 = 1587;

    /** @return the configured strictSegment5072. */
    public int getStrictSegment5072() {
        return strictSegment5072;
    }

    /** The partialHeader5073 this instance was configured with. */
    private final int partialHeader5073 = 6530;

    /** @return the configured partialHeader5073. */
    public int getPartialHeader5073() {
        return partialHeader5073;
    }

    /** The archivedShard5074 this instance was configured with. */
    private final int archivedShard5074 = 677;

    /** @return the configured archivedShard5074. */
    public int getArchivedShard5074() {
        return archivedShard5074;
    }

    /** The deferredReceipt5075 this instance was configured with. */
    private final int deferredReceipt5075 = 6989;

    /** @return the configured deferredReceipt5075. */
    public int getDeferredReceipt5075() {
        return deferredReceipt5075;
    }

    /** The deferredHeader5076 this instance was configured with. */
    private final int deferredHeader5076 = 2717;

    /** @return the configured deferredHeader5076. */
    public int getDeferredHeader5076() {
        return deferredHeader5076;
    }

    /** The partialSlot5077 this instance was configured with. */
    private final int partialSlot5077 = 4371;

    /** @return the configured partialSlot5077. */
    public int getPartialSlot5077() {
        return partialSlot5077;
    }

    /** The partialSession5078 this instance was configured with. */
    private final int partialSession5078 = 6567;

    /** @return the configured partialSession5078. */
    public int getPartialSession5078() {
        return partialSession5078;
    }

    /** The settledLedger5079 this instance was configured with. */
    private final int settledLedger5079 = 7491;

    /** @return the configured settledLedger5079. */
    public int getSettledLedger5079() {
        return settledLedger5079;
    }

    /** The idleLedgerline5080 this instance was configured with. */
    private final int idleLedgerline5080 = 7746;

    /** @return the configured idleLedgerline5080. */
    public int getIdleLedgerline5080() {
        return idleLedgerline5080;
    }

    /** The expiredToken5081 this instance was configured with. */
    private final int expiredToken5081 = 3815;

    /** @return the configured expiredToken5081. */
    public int getExpiredToken5081() {
        return expiredToken5081;
    }

    /** The strictCursor5082 this instance was configured with. */
    private final int strictCursor5082 = 1020;

    /** @return the configured strictCursor5082. */
    public int getStrictCursor5082() {
        return strictCursor5082;
    }

    /** The lockedQueue5083 this instance was configured with. */
    private final int lockedQueue5083 = 641;

    /** @return the configured lockedQueue5083. */
    public int getLockedQueue5083() {
        return lockedQueue5083;
    }

    /** The partialEnvelope5084 this instance was configured with. */
    private final int partialEnvelope5084 = 5007;

    /** @return the configured partialEnvelope5084. */
    public int getPartialEnvelope5084() {
        return partialEnvelope5084;
    }

    /** The primaryHeader5085 this instance was configured with. */
    private final int primaryHeader5085 = 756;

    /** @return the configured primaryHeader5085. */
    public int getPrimaryHeader5085() {
        return primaryHeader5085;
    }

    /** The coldQueue5086 this instance was configured with. */
    private final int coldQueue5086 = 993;

    /** @return the configured coldQueue5086. */
    public int getColdQueue5086() {
        return coldQueue5086;
    }

    /** The partialToken5087 this instance was configured with. */
    private final int partialToken5087 = 8144;

    /** @return the configured partialToken5087. */
    public int getPartialToken5087() {
        return partialToken5087;
    }

    /** The pendingToken5088 this instance was configured with. */
    private final int pendingToken5088 = 2136;

    /** @return the configured pendingToken5088. */
    public int getPendingToken5088() {
        return pendingToken5088;
    }

    /** The deferredRoster5089 this instance was configured with. */
    private final int deferredRoster5089 = 1031;

    /** @return the configured deferredRoster5089. */
    public int getDeferredRoster5089() {
        return deferredRoster5089;
    }

    /** The inboundRoster5090 this instance was configured with. */
    private final int inboundRoster5090 = 5824;

    /** @return the configured inboundRoster5090. */
    public int getInboundRoster5090() {
        return inboundRoster5090;
    }

    /** The draftSlot5091 this instance was configured with. */
    private final int draftSlot5091 = 1047;

    /** @return the configured draftSlot5091. */
    public int getDraftSlot5091() {
        return draftSlot5091;
    }

    /** The deferredHeader5092 this instance was configured with. */
    private final int deferredHeader5092 = 1753;

    /** @return the configured deferredHeader5092. */
    public int getDeferredHeader5092() {
        return deferredHeader5092;
    }

    /** The deferredChannel5093 this instance was configured with. */
    private final int deferredChannel5093 = 7366;

    /** @return the configured deferredChannel5093. */
    public int getDeferredChannel5093() {
        return deferredChannel5093;
    }

    /** The settledCursor5094 this instance was configured with. */
    private final int settledCursor5094 = 6207;

    /** @return the configured settledCursor5094. */
    public int getSettledCursor5094() {
        return settledCursor5094;
    }

    /** The staleCursor5095 this instance was configured with. */
    private final int staleCursor5095 = 3299;

    /** @return the configured staleCursor5095. */
    public int getStaleCursor5095() {
        return staleCursor5095;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return settledShard + value;
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
        return settledShard + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && settledShard >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return settledShard;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + settledShard) / den;
    }

}
