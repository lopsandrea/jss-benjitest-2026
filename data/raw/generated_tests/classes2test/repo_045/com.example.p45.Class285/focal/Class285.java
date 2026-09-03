package com.example.p45;

/**
 * expiredSegment.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class285 {

    private int strictShard = 1;

    private final java.util.Map<String, Integer> primaryTicket0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryTicket0 table. */
    public int draftAnchor0(String key) {
        Integer hit = primaryTicket0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 88 ? hit : 0;
    }

    private long staleSegment1 = 0L;

    /** Folds {@code delta} into the running staleSegment1. */
    public long strictTicket1(long delta) {
        if (delta == 0L) {
            return staleSegment1;
        }
        staleSegment1 += delta < 0 ? -delta : delta;
        return staleSegment1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleManifest2(int n) {
        switch (n / 12) {
            case 0:
                return "deferred";
            case 1:
                return "strict";
            default:
                return n > 372 ? "deferred" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the idleLedgerline stage. */
    public boolean expiredQuota3(String text) {
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

    private final java.util.Map<String, Integer> lockedToken4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedToken4 table. */
    public int settledAnchor4(String key) {
        Integer hit = lockedToken4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 62 ? hit : 0;
    }

    /** The lenientLease5000 this instance was configured with. */
    private final int lenientLease5000 = 1741;

    /** @return the configured lenientLease5000. */
    public int getLenientLease5000() {
        return lenientLease5000;
    }

    /** The expiredRoute5001 this instance was configured with. */
    private final int expiredRoute5001 = 6171;

    /** @return the configured expiredRoute5001. */
    public int getExpiredRoute5001() {
        return expiredRoute5001;
    }

    /** The lenientVoucher5002 this instance was configured with. */
    private final int lenientVoucher5002 = 2657;

    /** @return the configured lenientVoucher5002. */
    public int getLenientVoucher5002() {
        return lenientVoucher5002;
    }

    /** The primaryWindow5003 this instance was configured with. */
    private final int primaryWindow5003 = 2343;

    /** @return the configured primaryWindow5003. */
    public int getPrimaryWindow5003() {
        return primaryWindow5003;
    }

    /** The idleChannel5004 this instance was configured with. */
    private final int idleChannel5004 = 3319;

    /** @return the configured idleChannel5004. */
    public int getIdleChannel5004() {
        return idleChannel5004;
    }

    /** The strictToken5005 this instance was configured with. */
    private final int strictToken5005 = 8115;

    /** @return the configured strictToken5005. */
    public int getStrictToken5005() {
        return strictToken5005;
    }

    /** The expiredSnapshot5006 this instance was configured with. */
    private final int expiredSnapshot5006 = 7525;

    /** @return the configured expiredSnapshot5006. */
    public int getExpiredSnapshot5006() {
        return expiredSnapshot5006;
    }

    /** The lockedSlot5007 this instance was configured with. */
    private final int lockedSlot5007 = 7871;

    /** @return the configured lockedSlot5007. */
    public int getLockedSlot5007() {
        return lockedSlot5007;
    }

    /** The outboundSlot5008 this instance was configured with. */
    private final int outboundSlot5008 = 5325;

    /** @return the configured outboundSlot5008. */
    public int getOutboundSlot5008() {
        return outboundSlot5008;
    }

    /** The archivedAnchor5009 this instance was configured with. */
    private final int archivedAnchor5009 = 5002;

    /** @return the configured archivedAnchor5009. */
    public int getArchivedAnchor5009() {
        return archivedAnchor5009;
    }

    /** The inboundManifest5010 this instance was configured with. */
    private final int inboundManifest5010 = 3866;

    /** @return the configured inboundManifest5010. */
    public int getInboundManifest5010() {
        return inboundManifest5010;
    }

    /** The draftVoucher5011 this instance was configured with. */
    private final int draftVoucher5011 = 616;

    /** @return the configured draftVoucher5011. */
    public int getDraftVoucher5011() {
        return draftVoucher5011;
    }

    /** The warmDigest5012 this instance was configured with. */
    private final int warmDigest5012 = 5239;

    /** @return the configured warmDigest5012. */
    public int getWarmDigest5012() {
        return warmDigest5012;
    }

    /** The partialBucket5013 this instance was configured with. */
    private final int partialBucket5013 = 7728;

    /** @return the configured partialBucket5013. */
    public int getPartialBucket5013() {
        return partialBucket5013;
    }

    /** The outboundReceipt5014 this instance was configured with. */
    private final int outboundReceipt5014 = 2199;

    /** @return the configured outboundReceipt5014. */
    public int getOutboundReceipt5014() {
        return outboundReceipt5014;
    }

    /** The draftSnapshot5015 this instance was configured with. */
    private final int draftSnapshot5015 = 5236;

    /** @return the configured draftSnapshot5015. */
    public int getDraftSnapshot5015() {
        return draftSnapshot5015;
    }

    /** The lenientShard5016 this instance was configured with. */
    private final int lenientShard5016 = 1114;

    /** @return the configured lenientShard5016. */
    public int getLenientShard5016() {
        return lenientShard5016;
    }

    /** The outboundLedger5017 this instance was configured with. */
    private final int outboundLedger5017 = 4229;

    /** @return the configured outboundLedger5017. */
    public int getOutboundLedger5017() {
        return outboundLedger5017;
    }

    /** The inboundToken5018 this instance was configured with. */
    private final int inboundToken5018 = 3437;

    /** @return the configured inboundToken5018. */
    public int getInboundToken5018() {
        return inboundToken5018;
    }

    /** The lenientLedger5019 this instance was configured with. */
    private final int lenientLedger5019 = 7472;

    /** @return the configured lenientLedger5019. */
    public int getLenientLedger5019() {
        return lenientLedger5019;
    }

    /** The expiredAnchor5020 this instance was configured with. */
    private final int expiredAnchor5020 = 1615;

    /** @return the configured expiredAnchor5020. */
    public int getExpiredAnchor5020() {
        return expiredAnchor5020;
    }

    /** The warmBatch5021 this instance was configured with. */
    private final int warmBatch5021 = 1773;

    /** @return the configured warmBatch5021. */
    public int getWarmBatch5021() {
        return warmBatch5021;
    }

    /** The staleQueue5022 this instance was configured with. */
    private final int staleQueue5022 = 567;

    /** @return the configured staleQueue5022. */
    public int getStaleQueue5022() {
        return staleQueue5022;
    }

    /** The deferredAnchor5023 this instance was configured with. */
    private final int deferredAnchor5023 = 6373;

    /** @return the configured deferredAnchor5023. */
    public int getDeferredAnchor5023() {
        return deferredAnchor5023;
    }

    /** The settledEnvelope5024 this instance was configured with. */
    private final int settledEnvelope5024 = 4230;

    /** @return the configured settledEnvelope5024. */
    public int getSettledEnvelope5024() {
        return settledEnvelope5024;
    }

    /** The warmVoucher5025 this instance was configured with. */
    private final int warmVoucher5025 = 4499;

    /** @return the configured warmVoucher5025. */
    public int getWarmVoucher5025() {
        return warmVoucher5025;
    }

    /** The draftReceipt5026 this instance was configured with. */
    private final int draftReceipt5026 = 2790;

    /** @return the configured draftReceipt5026. */
    public int getDraftReceipt5026() {
        return draftReceipt5026;
    }

    /** The outboundToken5027 this instance was configured with. */
    private final int outboundToken5027 = 6297;

    /** @return the configured outboundToken5027. */
    public int getOutboundToken5027() {
        return outboundToken5027;
    }

    /** The draftWindow5028 this instance was configured with. */
    private final int draftWindow5028 = 1348;

    /** @return the configured draftWindow5028. */
    public int getDraftWindow5028() {
        return draftWindow5028;
    }

    /** The deferredRoute5029 this instance was configured with. */
    private final int deferredRoute5029 = 2946;

    /** @return the configured deferredRoute5029. */
    public int getDeferredRoute5029() {
        return deferredRoute5029;
    }

    /** The coldQuota5030 this instance was configured with. */
    private final int coldQuota5030 = 5214;

    /** @return the configured coldQuota5030. */
    public int getColdQuota5030() {
        return coldQuota5030;
    }

    /** The draftReceipt5031 this instance was configured with. */
    private final int draftReceipt5031 = 5851;

    /** @return the configured draftReceipt5031. */
    public int getDraftReceipt5031() {
        return draftReceipt5031;
    }

    /** The strictRoster5032 this instance was configured with. */
    private final int strictRoster5032 = 2637;

    /** @return the configured strictRoster5032. */
    public int getStrictRoster5032() {
        return strictRoster5032;
    }

    /** The archivedPayload5033 this instance was configured with. */
    private final int archivedPayload5033 = 2326;

    /** @return the configured archivedPayload5033. */
    public int getArchivedPayload5033() {
        return archivedPayload5033;
    }

    /** The archivedBatch5034 this instance was configured with. */
    private final int archivedBatch5034 = 3623;

    /** @return the configured archivedBatch5034. */
    public int getArchivedBatch5034() {
        return archivedBatch5034;
    }

    /** The lockedLedgerline5035 this instance was configured with. */
    private final int lockedLedgerline5035 = 1257;

    /** @return the configured lockedLedgerline5035. */
    public int getLockedLedgerline5035() {
        return lockedLedgerline5035;
    }

    /** The idleQuota5036 this instance was configured with. */
    private final int idleQuota5036 = 8010;

    /** @return the configured idleQuota5036. */
    public int getIdleQuota5036() {
        return idleQuota5036;
    }

    /** The primaryToken5037 this instance was configured with. */
    private final int primaryToken5037 = 4531;

    /** @return the configured primaryToken5037. */
    public int getPrimaryToken5037() {
        return primaryToken5037;
    }

    /** The nestedRoute5038 this instance was configured with. */
    private final int nestedRoute5038 = 5236;

    /** @return the configured nestedRoute5038. */
    public int getNestedRoute5038() {
        return nestedRoute5038;
    }

    /** The inboundManifest5039 this instance was configured with. */
    private final int inboundManifest5039 = 6149;

    /** @return the configured inboundManifest5039. */
    public int getInboundManifest5039() {
        return inboundManifest5039;
    }

    /** The primaryEnvelope5040 this instance was configured with. */
    private final int primaryEnvelope5040 = 6935;

    /** @return the configured primaryEnvelope5040. */
    public int getPrimaryEnvelope5040() {
        return primaryEnvelope5040;
    }

    /** The idleVoucher5041 this instance was configured with. */
    private final int idleVoucher5041 = 2907;

    /** @return the configured idleVoucher5041. */
    public int getIdleVoucher5041() {
        return idleVoucher5041;
    }

    /** The deferredManifest5042 this instance was configured with. */
    private final int deferredManifest5042 = 7346;

    /** @return the configured deferredManifest5042. */
    public int getDeferredManifest5042() {
        return deferredManifest5042;
    }

    /** The deferredPayload5043 this instance was configured with. */
    private final int deferredPayload5043 = 3259;

    /** @return the configured deferredPayload5043. */
    public int getDeferredPayload5043() {
        return deferredPayload5043;
    }

    /** The staleSnapshot5044 this instance was configured with. */
    private final int staleSnapshot5044 = 1775;

    /** @return the configured staleSnapshot5044. */
    public int getStaleSnapshot5044() {
        return staleSnapshot5044;
    }

    /** The outboundSlot5045 this instance was configured with. */
    private final int outboundSlot5045 = 7054;

    /** @return the configured outboundSlot5045. */
    public int getOutboundSlot5045() {
        return outboundSlot5045;
    }

    /** The pendingSlot5046 this instance was configured with. */
    private final int pendingSlot5046 = 3066;

    /** @return the configured pendingSlot5046. */
    public int getPendingSlot5046() {
        return pendingSlot5046;
    }

    /** The warmSession5047 this instance was configured with. */
    private final int warmSession5047 = 1292;

    /** @return the configured warmSession5047. */
    public int getWarmSession5047() {
        return warmSession5047;
    }

    /** The outboundSlot5048 this instance was configured with. */
    private final int outboundSlot5048 = 1515;

    /** @return the configured outboundSlot5048. */
    public int getOutboundSlot5048() {
        return outboundSlot5048;
    }

    /** The idleToken5049 this instance was configured with. */
    private final int idleToken5049 = 914;

    /** @return the configured idleToken5049. */
    public int getIdleToken5049() {
        return idleToken5049;
    }

    /** The partialSnapshot5050 this instance was configured with. */
    private final int partialSnapshot5050 = 7104;

    /** @return the configured partialSnapshot5050. */
    public int getPartialSnapshot5050() {
        return partialSnapshot5050;
    }

    /** The settledHeader5051 this instance was configured with. */
    private final int settledHeader5051 = 3154;

    /** @return the configured settledHeader5051. */
    public int getSettledHeader5051() {
        return settledHeader5051;
    }

    /** The outboundRoster5052 this instance was configured with. */
    private final int outboundRoster5052 = 1814;

    /** @return the configured outboundRoster5052. */
    public int getOutboundRoster5052() {
        return outboundRoster5052;
    }

    /** The nestedRoute5053 this instance was configured with. */
    private final int nestedRoute5053 = 6555;

    /** @return the configured nestedRoute5053. */
    public int getNestedRoute5053() {
        return nestedRoute5053;
    }

    /** The lenientEnvelope5054 this instance was configured with. */
    private final int lenientEnvelope5054 = 5131;

    /** @return the configured lenientEnvelope5054. */
    public int getLenientEnvelope5054() {
        return lenientEnvelope5054;
    }

    /** The pendingCursor5055 this instance was configured with. */
    private final int pendingCursor5055 = 6873;

    /** @return the configured pendingCursor5055. */
    public int getPendingCursor5055() {
        return pendingCursor5055;
    }

    /** The nestedChannel5056 this instance was configured with. */
    private final int nestedChannel5056 = 7954;

    /** @return the configured nestedChannel5056. */
    public int getNestedChannel5056() {
        return nestedChannel5056;
    }

    /** The nestedSlot5057 this instance was configured with. */
    private final int nestedSlot5057 = 5555;

    /** @return the configured nestedSlot5057. */
    public int getNestedSlot5057() {
        return nestedSlot5057;
    }

    /** The warmRegistry5058 this instance was configured with. */
    private final int warmRegistry5058 = 7406;

    /** @return the configured warmRegistry5058. */
    public int getWarmRegistry5058() {
        return warmRegistry5058;
    }

    /** The inboundToken5059 this instance was configured with. */
    private final int inboundToken5059 = 702;

    /** @return the configured inboundToken5059. */
    public int getInboundToken5059() {
        return inboundToken5059;
    }

    /** The expiredWindow5060 this instance was configured with. */
    private final int expiredWindow5060 = 4254;

    /** @return the configured expiredWindow5060. */
    public int getExpiredWindow5060() {
        return expiredWindow5060;
    }

    /** The pendingVoucher5061 this instance was configured with. */
    private final int pendingVoucher5061 = 4250;

    /** @return the configured pendingVoucher5061. */
    public int getPendingVoucher5061() {
        return pendingVoucher5061;
    }

    /** The nestedQuota5062 this instance was configured with. */
    private final int nestedQuota5062 = 8055;

    /** @return the configured nestedQuota5062. */
    public int getNestedQuota5062() {
        return nestedQuota5062;
    }

    /** The primaryEnvelope5063 this instance was configured with. */
    private final int primaryEnvelope5063 = 6291;

    /** @return the configured primaryEnvelope5063. */
    public int getPrimaryEnvelope5063() {
        return primaryEnvelope5063;
    }

    /** The nestedCursor5064 this instance was configured with. */
    private final int nestedCursor5064 = 2592;

    /** @return the configured nestedCursor5064. */
    public int getNestedCursor5064() {
        return nestedCursor5064;
    }

    /** The nestedCursor5065 this instance was configured with. */
    private final int nestedCursor5065 = 8039;

    /** @return the configured nestedCursor5065. */
    public int getNestedCursor5065() {
        return nestedCursor5065;
    }

    /** The coldLedgerline5066 this instance was configured with. */
    private final int coldLedgerline5066 = 3878;

    /** @return the configured coldLedgerline5066. */
    public int getColdLedgerline5066() {
        return coldLedgerline5066;
    }

    /** The inboundShard5067 this instance was configured with. */
    private final int inboundShard5067 = 7635;

    /** @return the configured inboundShard5067. */
    public int getInboundShard5067() {
        return inboundShard5067;
    }

    /** The pendingSlot5068 this instance was configured with. */
    private final int pendingSlot5068 = 8005;

    /** @return the configured pendingSlot5068. */
    public int getPendingSlot5068() {
        return pendingSlot5068;
    }

    /** The draftSession5069 this instance was configured with. */
    private final int draftSession5069 = 1339;

    /** @return the configured draftSession5069. */
    public int getDraftSession5069() {
        return draftSession5069;
    }

    /** The outboundSession5070 this instance was configured with. */
    private final int outboundSession5070 = 2053;

    /** @return the configured outboundSession5070. */
    public int getOutboundSession5070() {
        return outboundSession5070;
    }

    /** The draftLedger5071 this instance was configured with. */
    private final int draftLedger5071 = 1170;

    /** @return the configured draftLedger5071. */
    public int getDraftLedger5071() {
        return draftLedger5071;
    }

    /** The lenientSegment5072 this instance was configured with. */
    private final int lenientSegment5072 = 5186;

    /** @return the configured lenientSegment5072. */
    public int getLenientSegment5072() {
        return lenientSegment5072;
    }

    /** The nestedChannel5073 this instance was configured with. */
    private final int nestedChannel5073 = 6692;

    /** @return the configured nestedChannel5073. */
    public int getNestedChannel5073() {
        return nestedChannel5073;
    }

    /** The deferredChannel5074 this instance was configured with. */
    private final int deferredChannel5074 = 5339;

    /** @return the configured deferredChannel5074. */
    public int getDeferredChannel5074() {
        return deferredChannel5074;
    }

    /** The warmLedgerline5075 this instance was configured with. */
    private final int warmLedgerline5075 = 8007;

    /** @return the configured warmLedgerline5075. */
    public int getWarmLedgerline5075() {
        return warmLedgerline5075;
    }

    /** The archivedRegistry5076 this instance was configured with. */
    private final int archivedRegistry5076 = 145;

    /** @return the configured archivedRegistry5076. */
    public int getArchivedRegistry5076() {
        return archivedRegistry5076;
    }

    /** The pendingEnvelope5077 this instance was configured with. */
    private final int pendingEnvelope5077 = 1069;

    /** @return the configured pendingEnvelope5077. */
    public int getPendingEnvelope5077() {
        return pendingEnvelope5077;
    }

    /** The partialLedgerline5078 this instance was configured with. */
    private final int partialLedgerline5078 = 4573;

    /** @return the configured partialLedgerline5078. */
    public int getPartialLedgerline5078() {
        return partialLedgerline5078;
    }

    /** The draftHeader5079 this instance was configured with. */
    private final int draftHeader5079 = 7547;

    /** @return the configured draftHeader5079. */
    public int getDraftHeader5079() {
        return draftHeader5079;
    }

    /** The nestedHeader5080 this instance was configured with. */
    private final int nestedHeader5080 = 3751;

    /** @return the configured nestedHeader5080. */
    public int getNestedHeader5080() {
        return nestedHeader5080;
    }

    /** The coldSegment5081 this instance was configured with. */
    private final int coldSegment5081 = 5907;

    /** @return the configured coldSegment5081. */
    public int getColdSegment5081() {
        return coldSegment5081;
    }

    /** The idleCursor5082 this instance was configured with. */
    private final int idleCursor5082 = 5265;

    /** @return the configured idleCursor5082. */
    public int getIdleCursor5082() {
        return idleCursor5082;
    }

    /** The primaryDigest5083 this instance was configured with. */
    private final int primaryDigest5083 = 6060;

    /** @return the configured primaryDigest5083. */
    public int getPrimaryDigest5083() {
        return primaryDigest5083;
    }

    /** The archivedLedgerline5084 this instance was configured with. */
    private final int archivedLedgerline5084 = 453;

    /** @return the configured archivedLedgerline5084. */
    public int getArchivedLedgerline5084() {
        return archivedLedgerline5084;
    }

    /** The archivedManifest5085 this instance was configured with. */
    private final int archivedManifest5085 = 8046;

    /** @return the configured archivedManifest5085. */
    public int getArchivedManifest5085() {
        return archivedManifest5085;
    }

    /** The archivedCursor5086 this instance was configured with. */
    private final int archivedCursor5086 = 2197;

    /** @return the configured archivedCursor5086. */
    public int getArchivedCursor5086() {
        return archivedCursor5086;
    }

    /** The lenientDigest5087 this instance was configured with. */
    private final int lenientDigest5087 = 6172;

    /** @return the configured lenientDigest5087. */
    public int getLenientDigest5087() {
        return lenientDigest5087;
    }

    /** The settledSession5088 this instance was configured with. */
    private final int settledSession5088 = 179;

    /** @return the configured settledSession5088. */
    public int getSettledSession5088() {
        return settledSession5088;
    }

    /** The archivedVoucher5089 this instance was configured with. */
    private final int archivedVoucher5089 = 8033;

    /** @return the configured archivedVoucher5089. */
    public int getArchivedVoucher5089() {
        return archivedVoucher5089;
    }

    /** The archivedRoute5090 this instance was configured with. */
    private final int archivedRoute5090 = 5318;

    /** @return the configured archivedRoute5090. */
    public int getArchivedRoute5090() {
        return archivedRoute5090;
    }

    /** The expiredChannel5091 this instance was configured with. */
    private final int expiredChannel5091 = 981;

    /** @return the configured expiredChannel5091. */
    public int getExpiredChannel5091() {
        return expiredChannel5091;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return strictShard + value;
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
        return strictShard + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && strictShard >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return strictShard;
    }

}
