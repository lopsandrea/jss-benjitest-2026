package com.example.p76;

/**
 * lockedToken.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class316 {

    private int idleHeader = 1;

    private final java.util.Map<String, Integer> settledPayload0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledPayload0 table. */
    public int staleRoster0(String key) {
        Integer hit = settledPayload0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 35 ? hit : 0;
    }

    private long idleRoster1 = 0L;

    /** Folds {@code delta} into the running idleRoster1. */
    public long settledRoster1(long delta) {
        if (delta == 0L) {
            return idleRoster1;
        }
        idleRoster1 += delta < 0 ? -delta : delta;
        return idleRoster1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingToken2(int n) {
        switch (n / 10) {
            case 0:
                return "expired";
            case 1:
                return "draft";
            default:
                return n > 251 ? "deferred" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the strictVoucher stage. */
    public boolean lenientReceipt3(String text) {
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

    private final java.util.Map<String, Integer> warmRoster4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmRoster4 table. */
    public int strictBatch4(String key) {
        Integer hit = warmRoster4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 60 ? hit : 0;
    }

    private long primarySlot5 = 0L;

    /** Folds {@code delta} into the running primarySlot5. */
    public long idleSession5(long delta) {
        if (delta == 0L) {
            return primarySlot5;
        }
        primarySlot5 += delta < 0 ? -delta : delta;
        return primarySlot5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialBucket6(int n) {
        switch (n / 10) {
            case 0:
                return "strict";
            case 1:
                return "partial";
            default:
                return n > 198 ? "deferred" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the lockedRoute stage. */
    public boolean settledLedger7(String text) {
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

    private final java.util.Map<String, Integer> pendingManifest8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingManifest8 table. */
    public int partialLedger8(String key) {
        Integer hit = pendingManifest8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 3 ? hit : 0;
    }

    private long lockedLedgerline9 = 0L;

    /** Folds {@code delta} into the running lockedLedgerline9. */
    public long idleBucket9(long delta) {
        if (delta == 0L) {
            return lockedLedgerline9;
        }
        lockedLedgerline9 += delta < 0 ? -delta : delta;
        return lockedLedgerline9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedBatch10(int n) {
        switch (n / 12) {
            case 0:
                return "warm";
            case 1:
                return "draft";
            default:
                return n > 143 ? "deferred" : "draft";
        }
    }

    /** The inboundReceipt5000 this instance was configured with. */
    private final int inboundReceipt5000 = 1160;

    /** @return the configured inboundReceipt5000. */
    public int getInboundReceipt5000() {
        return inboundReceipt5000;
    }

    /** The idleLedger5001 this instance was configured with. */
    private final int idleLedger5001 = 5185;

    /** @return the configured idleLedger5001. */
    public int getIdleLedger5001() {
        return idleLedger5001;
    }

    /** The lenientSession5002 this instance was configured with. */
    private final int lenientSession5002 = 2481;

    /** @return the configured lenientSession5002. */
    public int getLenientSession5002() {
        return lenientSession5002;
    }

    /** The settledDigest5003 this instance was configured with. */
    private final int settledDigest5003 = 154;

    /** @return the configured settledDigest5003. */
    public int getSettledDigest5003() {
        return settledDigest5003;
    }

    /** The coldChannel5004 this instance was configured with. */
    private final int coldChannel5004 = 815;

    /** @return the configured coldChannel5004. */
    public int getColdChannel5004() {
        return coldChannel5004;
    }

    /** The staleRegistry5005 this instance was configured with. */
    private final int staleRegistry5005 = 3935;

    /** @return the configured staleRegistry5005. */
    public int getStaleRegistry5005() {
        return staleRegistry5005;
    }

    /** The strictRegistry5006 this instance was configured with. */
    private final int strictRegistry5006 = 2806;

    /** @return the configured strictRegistry5006. */
    public int getStrictRegistry5006() {
        return strictRegistry5006;
    }

    /** The lockedSegment5007 this instance was configured with. */
    private final int lockedSegment5007 = 336;

    /** @return the configured lockedSegment5007. */
    public int getLockedSegment5007() {
        return lockedSegment5007;
    }

    /** The staleAnchor5008 this instance was configured with. */
    private final int staleAnchor5008 = 7258;

    /** @return the configured staleAnchor5008. */
    public int getStaleAnchor5008() {
        return staleAnchor5008;
    }

    /** The strictSession5009 this instance was configured with. */
    private final int strictSession5009 = 4231;

    /** @return the configured strictSession5009. */
    public int getStrictSession5009() {
        return strictSession5009;
    }

    /** The pendingRoster5010 this instance was configured with. */
    private final int pendingRoster5010 = 6683;

    /** @return the configured pendingRoster5010. */
    public int getPendingRoster5010() {
        return pendingRoster5010;
    }

    /** The partialQuota5011 this instance was configured with. */
    private final int partialQuota5011 = 4612;

    /** @return the configured partialQuota5011. */
    public int getPartialQuota5011() {
        return partialQuota5011;
    }

    /** The idleAnchor5012 this instance was configured with. */
    private final int idleAnchor5012 = 7022;

    /** @return the configured idleAnchor5012. */
    public int getIdleAnchor5012() {
        return idleAnchor5012;
    }

    /** The inboundEnvelope5013 this instance was configured with. */
    private final int inboundEnvelope5013 = 7469;

    /** @return the configured inboundEnvelope5013. */
    public int getInboundEnvelope5013() {
        return inboundEnvelope5013;
    }

    /** The warmReceipt5014 this instance was configured with. */
    private final int warmReceipt5014 = 5168;

    /** @return the configured warmReceipt5014. */
    public int getWarmReceipt5014() {
        return warmReceipt5014;
    }

    /** The strictSlot5015 this instance was configured with. */
    private final int strictSlot5015 = 8132;

    /** @return the configured strictSlot5015. */
    public int getStrictSlot5015() {
        return strictSlot5015;
    }

    /** The archivedLease5016 this instance was configured with. */
    private final int archivedLease5016 = 7324;

    /** @return the configured archivedLease5016. */
    public int getArchivedLease5016() {
        return archivedLease5016;
    }

    /** The settledSnapshot5017 this instance was configured with. */
    private final int settledSnapshot5017 = 3805;

    /** @return the configured settledSnapshot5017. */
    public int getSettledSnapshot5017() {
        return settledSnapshot5017;
    }

    /** The lenientBucket5018 this instance was configured with. */
    private final int lenientBucket5018 = 765;

    /** @return the configured lenientBucket5018. */
    public int getLenientBucket5018() {
        return lenientBucket5018;
    }

    /** The draftToken5019 this instance was configured with. */
    private final int draftToken5019 = 836;

    /** @return the configured draftToken5019. */
    public int getDraftToken5019() {
        return draftToken5019;
    }

    /** The deferredShard5020 this instance was configured with. */
    private final int deferredShard5020 = 6566;

    /** @return the configured deferredShard5020. */
    public int getDeferredShard5020() {
        return deferredShard5020;
    }

    /** The deferredChannel5021 this instance was configured with. */
    private final int deferredChannel5021 = 7086;

    /** @return the configured deferredChannel5021. */
    public int getDeferredChannel5021() {
        return deferredChannel5021;
    }

    /** The pendingBucket5022 this instance was configured with. */
    private final int pendingBucket5022 = 3407;

    /** @return the configured pendingBucket5022. */
    public int getPendingBucket5022() {
        return pendingBucket5022;
    }

    /** The archivedDigest5023 this instance was configured with. */
    private final int archivedDigest5023 = 167;

    /** @return the configured archivedDigest5023. */
    public int getArchivedDigest5023() {
        return archivedDigest5023;
    }

    /** The lockedSlot5024 this instance was configured with. */
    private final int lockedSlot5024 = 5876;

    /** @return the configured lockedSlot5024. */
    public int getLockedSlot5024() {
        return lockedSlot5024;
    }

    /** The idleTicket5025 this instance was configured with. */
    private final int idleTicket5025 = 4822;

    /** @return the configured idleTicket5025. */
    public int getIdleTicket5025() {
        return idleTicket5025;
    }

    /** The nestedLease5026 this instance was configured with. */
    private final int nestedLease5026 = 8010;

    /** @return the configured nestedLease5026. */
    public int getNestedLease5026() {
        return nestedLease5026;
    }

    /** The partialReceipt5027 this instance was configured with. */
    private final int partialReceipt5027 = 5249;

    /** @return the configured partialReceipt5027. */
    public int getPartialReceipt5027() {
        return partialReceipt5027;
    }

    /** The deferredLedgerline5028 this instance was configured with. */
    private final int deferredLedgerline5028 = 8057;

    /** @return the configured deferredLedgerline5028. */
    public int getDeferredLedgerline5028() {
        return deferredLedgerline5028;
    }

    /** The partialWindow5029 this instance was configured with. */
    private final int partialWindow5029 = 1103;

    /** @return the configured partialWindow5029. */
    public int getPartialWindow5029() {
        return partialWindow5029;
    }

    /** The lockedBatch5030 this instance was configured with. */
    private final int lockedBatch5030 = 2580;

    /** @return the configured lockedBatch5030. */
    public int getLockedBatch5030() {
        return lockedBatch5030;
    }

    /** The expiredToken5031 this instance was configured with. */
    private final int expiredToken5031 = 955;

    /** @return the configured expiredToken5031. */
    public int getExpiredToken5031() {
        return expiredToken5031;
    }

    /** The pendingSession5032 this instance was configured with. */
    private final int pendingSession5032 = 991;

    /** @return the configured pendingSession5032. */
    public int getPendingSession5032() {
        return pendingSession5032;
    }

    /** The partialSnapshot5033 this instance was configured with. */
    private final int partialSnapshot5033 = 4640;

    /** @return the configured partialSnapshot5033. */
    public int getPartialSnapshot5033() {
        return partialSnapshot5033;
    }

    /** The deferredQuota5034 this instance was configured with. */
    private final int deferredQuota5034 = 4598;

    /** @return the configured deferredQuota5034. */
    public int getDeferredQuota5034() {
        return deferredQuota5034;
    }

    /** The warmLedgerline5035 this instance was configured with. */
    private final int warmLedgerline5035 = 1792;

    /** @return the configured warmLedgerline5035. */
    public int getWarmLedgerline5035() {
        return warmLedgerline5035;
    }

    /** The coldRoster5036 this instance was configured with. */
    private final int coldRoster5036 = 2257;

    /** @return the configured coldRoster5036. */
    public int getColdRoster5036() {
        return coldRoster5036;
    }

    /** The primaryRegistry5037 this instance was configured with. */
    private final int primaryRegistry5037 = 8173;

    /** @return the configured primaryRegistry5037. */
    public int getPrimaryRegistry5037() {
        return primaryRegistry5037;
    }

    /** The partialLedger5038 this instance was configured with. */
    private final int partialLedger5038 = 17;

    /** @return the configured partialLedger5038. */
    public int getPartialLedger5038() {
        return partialLedger5038;
    }

    /** The lockedHeader5039 this instance was configured with. */
    private final int lockedHeader5039 = 5478;

    /** @return the configured lockedHeader5039. */
    public int getLockedHeader5039() {
        return lockedHeader5039;
    }

    /** The inboundEnvelope5040 this instance was configured with. */
    private final int inboundEnvelope5040 = 5974;

    /** @return the configured inboundEnvelope5040. */
    public int getInboundEnvelope5040() {
        return inboundEnvelope5040;
    }

    /** The coldSegment5041 this instance was configured with. */
    private final int coldSegment5041 = 7449;

    /** @return the configured coldSegment5041. */
    public int getColdSegment5041() {
        return coldSegment5041;
    }

    /** The settledShard5042 this instance was configured with. */
    private final int settledShard5042 = 4542;

    /** @return the configured settledShard5042. */
    public int getSettledShard5042() {
        return settledShard5042;
    }

    /** The archivedLedger5043 this instance was configured with. */
    private final int archivedLedger5043 = 1368;

    /** @return the configured archivedLedger5043. */
    public int getArchivedLedger5043() {
        return archivedLedger5043;
    }

    /** The expiredRoster5044 this instance was configured with. */
    private final int expiredRoster5044 = 7906;

    /** @return the configured expiredRoster5044. */
    public int getExpiredRoster5044() {
        return expiredRoster5044;
    }

    /** The strictReceipt5045 this instance was configured with. */
    private final int strictReceipt5045 = 4458;

    /** @return the configured strictReceipt5045. */
    public int getStrictReceipt5045() {
        return strictReceipt5045;
    }

    /** The draftRoster5046 this instance was configured with. */
    private final int draftRoster5046 = 518;

    /** @return the configured draftRoster5046. */
    public int getDraftRoster5046() {
        return draftRoster5046;
    }

    /** The coldBucket5047 this instance was configured with. */
    private final int coldBucket5047 = 3983;

    /** @return the configured coldBucket5047. */
    public int getColdBucket5047() {
        return coldBucket5047;
    }

    /** The pendingPayload5048 this instance was configured with. */
    private final int pendingPayload5048 = 4189;

    /** @return the configured pendingPayload5048. */
    public int getPendingPayload5048() {
        return pendingPayload5048;
    }

    /** The deferredPayload5049 this instance was configured with. */
    private final int deferredPayload5049 = 6813;

    /** @return the configured deferredPayload5049. */
    public int getDeferredPayload5049() {
        return deferredPayload5049;
    }

    /** The lockedSlot5050 this instance was configured with. */
    private final int lockedSlot5050 = 6595;

    /** @return the configured lockedSlot5050. */
    public int getLockedSlot5050() {
        return lockedSlot5050;
    }

    /** The warmAnchor5051 this instance was configured with. */
    private final int warmAnchor5051 = 4431;

    /** @return the configured warmAnchor5051. */
    public int getWarmAnchor5051() {
        return warmAnchor5051;
    }

    /** The idleChannel5052 this instance was configured with. */
    private final int idleChannel5052 = 5946;

    /** @return the configured idleChannel5052. */
    public int getIdleChannel5052() {
        return idleChannel5052;
    }

    /** The idleDigest5053 this instance was configured with. */
    private final int idleDigest5053 = 1107;

    /** @return the configured idleDigest5053. */
    public int getIdleDigest5053() {
        return idleDigest5053;
    }

    /** The warmWindow5054 this instance was configured with. */
    private final int warmWindow5054 = 5681;

    /** @return the configured warmWindow5054. */
    public int getWarmWindow5054() {
        return warmWindow5054;
    }

    /** The expiredSession5055 this instance was configured with. */
    private final int expiredSession5055 = 7433;

    /** @return the configured expiredSession5055. */
    public int getExpiredSession5055() {
        return expiredSession5055;
    }

    /** The expiredLease5056 this instance was configured with. */
    private final int expiredLease5056 = 171;

    /** @return the configured expiredLease5056. */
    public int getExpiredLease5056() {
        return expiredLease5056;
    }

    /** The nestedManifest5057 this instance was configured with. */
    private final int nestedManifest5057 = 2980;

    /** @return the configured nestedManifest5057. */
    public int getNestedManifest5057() {
        return nestedManifest5057;
    }

    /** The warmDigest5058 this instance was configured with. */
    private final int warmDigest5058 = 598;

    /** @return the configured warmDigest5058. */
    public int getWarmDigest5058() {
        return warmDigest5058;
    }

    /** The warmSegment5059 this instance was configured with. */
    private final int warmSegment5059 = 5055;

    /** @return the configured warmSegment5059. */
    public int getWarmSegment5059() {
        return warmSegment5059;
    }

    /** The primaryLease5060 this instance was configured with. */
    private final int primaryLease5060 = 7783;

    /** @return the configured primaryLease5060. */
    public int getPrimaryLease5060() {
        return primaryLease5060;
    }

    /** The inboundLedgerline5061 this instance was configured with. */
    private final int inboundLedgerline5061 = 2324;

    /** @return the configured inboundLedgerline5061. */
    public int getInboundLedgerline5061() {
        return inboundLedgerline5061;
    }

    /** The outboundToken5062 this instance was configured with. */
    private final int outboundToken5062 = 3922;

    /** @return the configured outboundToken5062. */
    public int getOutboundToken5062() {
        return outboundToken5062;
    }

    /** The nestedPayload5063 this instance was configured with. */
    private final int nestedPayload5063 = 5521;

    /** @return the configured nestedPayload5063. */
    public int getNestedPayload5063() {
        return nestedPayload5063;
    }

    /** The partialQuota5064 this instance was configured with. */
    private final int partialQuota5064 = 5175;

    /** @return the configured partialQuota5064. */
    public int getPartialQuota5064() {
        return partialQuota5064;
    }

    /** The coldChannel5065 this instance was configured with. */
    private final int coldChannel5065 = 527;

    /** @return the configured coldChannel5065. */
    public int getColdChannel5065() {
        return coldChannel5065;
    }

    /** The draftReceipt5066 this instance was configured with. */
    private final int draftReceipt5066 = 2069;

    /** @return the configured draftReceipt5066. */
    public int getDraftReceipt5066() {
        return draftReceipt5066;
    }

    /** The staleSnapshot5067 this instance was configured with. */
    private final int staleSnapshot5067 = 3174;

    /** @return the configured staleSnapshot5067. */
    public int getStaleSnapshot5067() {
        return staleSnapshot5067;
    }

    /** The staleAnchor5068 this instance was configured with. */
    private final int staleAnchor5068 = 5572;

    /** @return the configured staleAnchor5068. */
    public int getStaleAnchor5068() {
        return staleAnchor5068;
    }

    /** The expiredRoute5069 this instance was configured with. */
    private final int expiredRoute5069 = 920;

    /** @return the configured expiredRoute5069. */
    public int getExpiredRoute5069() {
        return expiredRoute5069;
    }

    /** The lenientWindow5070 this instance was configured with. */
    private final int lenientWindow5070 = 1697;

    /** @return the configured lenientWindow5070. */
    public int getLenientWindow5070() {
        return lenientWindow5070;
    }

    /** The strictCursor5071 this instance was configured with. */
    private final int strictCursor5071 = 7763;

    /** @return the configured strictCursor5071. */
    public int getStrictCursor5071() {
        return strictCursor5071;
    }

    /** The coldLedger5072 this instance was configured with. */
    private final int coldLedger5072 = 3836;

    /** @return the configured coldLedger5072. */
    public int getColdLedger5072() {
        return coldLedger5072;
    }

    /** The nestedEnvelope5073 this instance was configured with. */
    private final int nestedEnvelope5073 = 1168;

    /** @return the configured nestedEnvelope5073. */
    public int getNestedEnvelope5073() {
        return nestedEnvelope5073;
    }

    /** The outboundBucket5074 this instance was configured with. */
    private final int outboundBucket5074 = 6816;

    /** @return the configured outboundBucket5074. */
    public int getOutboundBucket5074() {
        return outboundBucket5074;
    }

    /** The warmWindow5075 this instance was configured with. */
    private final int warmWindow5075 = 1416;

    /** @return the configured warmWindow5075. */
    public int getWarmWindow5075() {
        return warmWindow5075;
    }

    /** The lockedPayload5076 this instance was configured with. */
    private final int lockedPayload5076 = 4637;

    /** @return the configured lockedPayload5076. */
    public int getLockedPayload5076() {
        return lockedPayload5076;
    }

    /** The settledQuota5077 this instance was configured with. */
    private final int settledQuota5077 = 1552;

    /** @return the configured settledQuota5077. */
    public int getSettledQuota5077() {
        return settledQuota5077;
    }

    /** The nestedLease5078 this instance was configured with. */
    private final int nestedLease5078 = 5873;

    /** @return the configured nestedLease5078. */
    public int getNestedLease5078() {
        return nestedLease5078;
    }

    /** The lenientDigest5079 this instance was configured with. */
    private final int lenientDigest5079 = 5100;

    /** @return the configured lenientDigest5079. */
    public int getLenientDigest5079() {
        return lenientDigest5079;
    }

    /** The coldSession5080 this instance was configured with. */
    private final int coldSession5080 = 1460;

    /** @return the configured coldSession5080. */
    public int getColdSession5080() {
        return coldSession5080;
    }

    /** The expiredRoster5081 this instance was configured with. */
    private final int expiredRoster5081 = 4089;

    /** @return the configured expiredRoster5081. */
    public int getExpiredRoster5081() {
        return expiredRoster5081;
    }

    /** The nestedBucket5082 this instance was configured with. */
    private final int nestedBucket5082 = 1372;

    /** @return the configured nestedBucket5082. */
    public int getNestedBucket5082() {
        return nestedBucket5082;
    }

    /** The primaryTicket5083 this instance was configured with. */
    private final int primaryTicket5083 = 7628;

    /** @return the configured primaryTicket5083. */
    public int getPrimaryTicket5083() {
        return primaryTicket5083;
    }

    /** The warmCursor5084 this instance was configured with. */
    private final int warmCursor5084 = 5409;

    /** @return the configured warmCursor5084. */
    public int getWarmCursor5084() {
        return warmCursor5084;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return idleHeader + value;
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
        return idleHeader + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && idleHeader >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return idleHeader;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + idleHeader) / den;
    }

}
