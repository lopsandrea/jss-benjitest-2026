package com.example.p54;

/**
 * inboundManifest.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class054 {

    private int inboundHeader = 1;

    private final java.util.Map<String, Integer> idleEnvelope0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleEnvelope0 table. */
    public int strictToken0(String key) {
        Integer hit = idleEnvelope0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 63 ? hit : 0;
    }

    private long strictQuota1 = 0L;

    /** Folds {@code delta} into the running strictQuota1. */
    public long coldBatch1(long delta) {
        if (delta == 0L) {
            return strictQuota1;
        }
        strictQuota1 += delta < 0 ? -delta : delta;
        return strictQuota1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientToken2(int n) {
        switch (n / 2) {
            case 0:
                return "cold";
            case 1:
                return "strict";
            default:
                return n > 249 ? "cold" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the warmLedger stage. */
    public boolean staleAnchor3(String text) {
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

    private final java.util.Map<String, Integer> draftToken4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftToken4 table. */
    public int draftChannel4(String key) {
        Integer hit = draftToken4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 5 ? hit : 0;
    }

    private long strictSlot5 = 0L;

    /** Folds {@code delta} into the running strictSlot5. */
    public long draftManifest5(long delta) {
        if (delta == 0L) {
            return strictSlot5;
        }
        strictSlot5 += delta < 0 ? -delta : delta;
        return strictSlot5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldReceipt6(int n) {
        switch (n / 3) {
            case 0:
                return "primary";
            case 1:
                return "lenient";
            default:
                return n > 67 ? "deferred" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the draftRoster stage. */
    public boolean nestedLease7(String text) {
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

    private final java.util.Map<String, Integer> idleSegment8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleSegment8 table. */
    public int coldEnvelope8(String key) {
        Integer hit = idleSegment8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 82 ? hit : 0;
    }

    private long archivedWindow9 = 0L;

    /** Folds {@code delta} into the running archivedWindow9. */
    public long inboundChannel9(long delta) {
        if (delta == 0L) {
            return archivedWindow9;
        }
        archivedWindow9 += delta < 0 ? -delta : delta;
        return archivedWindow9;
    }

    /** The idleLedger5000 this instance was configured with. */
    private final int idleLedger5000 = 4410;

    /** @return the configured idleLedger5000. */
    public int getIdleLedger5000() {
        return idleLedger5000;
    }

    /** The lockedLedgerline5001 this instance was configured with. */
    private final int lockedLedgerline5001 = 4484;

    /** @return the configured lockedLedgerline5001. */
    public int getLockedLedgerline5001() {
        return lockedLedgerline5001;
    }

    /** The lockedRoster5002 this instance was configured with. */
    private final int lockedRoster5002 = 3307;

    /** @return the configured lockedRoster5002. */
    public int getLockedRoster5002() {
        return lockedRoster5002;
    }

    /** The expiredDigest5003 this instance was configured with. */
    private final int expiredDigest5003 = 2509;

    /** @return the configured expiredDigest5003. */
    public int getExpiredDigest5003() {
        return expiredDigest5003;
    }

    /** The deferredTicket5004 this instance was configured with. */
    private final int deferredTicket5004 = 6345;

    /** @return the configured deferredTicket5004. */
    public int getDeferredTicket5004() {
        return deferredTicket5004;
    }

    /** The nestedQueue5005 this instance was configured with. */
    private final int nestedQueue5005 = 1063;

    /** @return the configured nestedQueue5005. */
    public int getNestedQueue5005() {
        return nestedQueue5005;
    }

    /** The expiredTicket5006 this instance was configured with. */
    private final int expiredTicket5006 = 953;

    /** @return the configured expiredTicket5006. */
    public int getExpiredTicket5006() {
        return expiredTicket5006;
    }

    /** The lockedHeader5007 this instance was configured with. */
    private final int lockedHeader5007 = 7202;

    /** @return the configured lockedHeader5007. */
    public int getLockedHeader5007() {
        return lockedHeader5007;
    }

    /** The inboundRoute5008 this instance was configured with. */
    private final int inboundRoute5008 = 7106;

    /** @return the configured inboundRoute5008. */
    public int getInboundRoute5008() {
        return inboundRoute5008;
    }

    /** The deferredChannel5009 this instance was configured with. */
    private final int deferredChannel5009 = 1284;

    /** @return the configured deferredChannel5009. */
    public int getDeferredChannel5009() {
        return deferredChannel5009;
    }

    /** The archivedBatch5010 this instance was configured with. */
    private final int archivedBatch5010 = 1111;

    /** @return the configured archivedBatch5010. */
    public int getArchivedBatch5010() {
        return archivedBatch5010;
    }

    /** The primaryBatch5011 this instance was configured with. */
    private final int primaryBatch5011 = 3122;

    /** @return the configured primaryBatch5011. */
    public int getPrimaryBatch5011() {
        return primaryBatch5011;
    }

    /** The coldTicket5012 this instance was configured with. */
    private final int coldTicket5012 = 5711;

    /** @return the configured coldTicket5012. */
    public int getColdTicket5012() {
        return coldTicket5012;
    }

    /** The deferredQuota5013 this instance was configured with. */
    private final int deferredQuota5013 = 7433;

    /** @return the configured deferredQuota5013. */
    public int getDeferredQuota5013() {
        return deferredQuota5013;
    }

    /** The coldSnapshot5014 this instance was configured with. */
    private final int coldSnapshot5014 = 1083;

    /** @return the configured coldSnapshot5014. */
    public int getColdSnapshot5014() {
        return coldSnapshot5014;
    }

    /** The lockedQuota5015 this instance was configured with. */
    private final int lockedQuota5015 = 934;

    /** @return the configured lockedQuota5015. */
    public int getLockedQuota5015() {
        return lockedQuota5015;
    }

    /** The coldHeader5016 this instance was configured with. */
    private final int coldHeader5016 = 2538;

    /** @return the configured coldHeader5016. */
    public int getColdHeader5016() {
        return coldHeader5016;
    }

    /** The inboundSnapshot5017 this instance was configured with. */
    private final int inboundSnapshot5017 = 4371;

    /** @return the configured inboundSnapshot5017. */
    public int getInboundSnapshot5017() {
        return inboundSnapshot5017;
    }

    /** The expiredHeader5018 this instance was configured with. */
    private final int expiredHeader5018 = 125;

    /** @return the configured expiredHeader5018. */
    public int getExpiredHeader5018() {
        return expiredHeader5018;
    }

    /** The coldEnvelope5019 this instance was configured with. */
    private final int coldEnvelope5019 = 7937;

    /** @return the configured coldEnvelope5019. */
    public int getColdEnvelope5019() {
        return coldEnvelope5019;
    }

    /** The idleRegistry5020 this instance was configured with. */
    private final int idleRegistry5020 = 5729;

    /** @return the configured idleRegistry5020. */
    public int getIdleRegistry5020() {
        return idleRegistry5020;
    }

    /** The outboundBatch5021 this instance was configured with. */
    private final int outboundBatch5021 = 7182;

    /** @return the configured outboundBatch5021. */
    public int getOutboundBatch5021() {
        return outboundBatch5021;
    }

    /** The draftSession5022 this instance was configured with. */
    private final int draftSession5022 = 3004;

    /** @return the configured draftSession5022. */
    public int getDraftSession5022() {
        return draftSession5022;
    }

    /** The outboundRegistry5023 this instance was configured with. */
    private final int outboundRegistry5023 = 5579;

    /** @return the configured outboundRegistry5023. */
    public int getOutboundRegistry5023() {
        return outboundRegistry5023;
    }

    /** The outboundBucket5024 this instance was configured with. */
    private final int outboundBucket5024 = 7960;

    /** @return the configured outboundBucket5024. */
    public int getOutboundBucket5024() {
        return outboundBucket5024;
    }

    /** The archivedBucket5025 this instance was configured with. */
    private final int archivedBucket5025 = 3140;

    /** @return the configured archivedBucket5025. */
    public int getArchivedBucket5025() {
        return archivedBucket5025;
    }

    /** The primaryBatch5026 this instance was configured with. */
    private final int primaryBatch5026 = 2116;

    /** @return the configured primaryBatch5026. */
    public int getPrimaryBatch5026() {
        return primaryBatch5026;
    }

    /** The nestedReceipt5027 this instance was configured with. */
    private final int nestedReceipt5027 = 3236;

    /** @return the configured nestedReceipt5027. */
    public int getNestedReceipt5027() {
        return nestedReceipt5027;
    }

    /** The strictVoucher5028 this instance was configured with. */
    private final int strictVoucher5028 = 5438;

    /** @return the configured strictVoucher5028. */
    public int getStrictVoucher5028() {
        return strictVoucher5028;
    }

    /** The archivedReceipt5029 this instance was configured with. */
    private final int archivedReceipt5029 = 4507;

    /** @return the configured archivedReceipt5029. */
    public int getArchivedReceipt5029() {
        return archivedReceipt5029;
    }

    /** The strictToken5030 this instance was configured with. */
    private final int strictToken5030 = 7754;

    /** @return the configured strictToken5030. */
    public int getStrictToken5030() {
        return strictToken5030;
    }

    /** The staleReceipt5031 this instance was configured with. */
    private final int staleReceipt5031 = 2133;

    /** @return the configured staleReceipt5031. */
    public int getStaleReceipt5031() {
        return staleReceipt5031;
    }

    /** The lenientQuota5032 this instance was configured with. */
    private final int lenientQuota5032 = 6923;

    /** @return the configured lenientQuota5032. */
    public int getLenientQuota5032() {
        return lenientQuota5032;
    }

    /** The nestedLedger5033 this instance was configured with. */
    private final int nestedLedger5033 = 7759;

    /** @return the configured nestedLedger5033. */
    public int getNestedLedger5033() {
        return nestedLedger5033;
    }

    /** The warmDigest5034 this instance was configured with. */
    private final int warmDigest5034 = 3731;

    /** @return the configured warmDigest5034. */
    public int getWarmDigest5034() {
        return warmDigest5034;
    }

    /** The partialRegistry5035 this instance was configured with. */
    private final int partialRegistry5035 = 4436;

    /** @return the configured partialRegistry5035. */
    public int getPartialRegistry5035() {
        return partialRegistry5035;
    }

    /** The inboundToken5036 this instance was configured with. */
    private final int inboundToken5036 = 842;

    /** @return the configured inboundToken5036. */
    public int getInboundToken5036() {
        return inboundToken5036;
    }

    /** The pendingLedgerline5037 this instance was configured with. */
    private final int pendingLedgerline5037 = 184;

    /** @return the configured pendingLedgerline5037. */
    public int getPendingLedgerline5037() {
        return pendingLedgerline5037;
    }

    /** The settledSnapshot5038 this instance was configured with. */
    private final int settledSnapshot5038 = 4826;

    /** @return the configured settledSnapshot5038. */
    public int getSettledSnapshot5038() {
        return settledSnapshot5038;
    }

    /** The coldBatch5039 this instance was configured with. */
    private final int coldBatch5039 = 6365;

    /** @return the configured coldBatch5039. */
    public int getColdBatch5039() {
        return coldBatch5039;
    }

    /** The strictTicket5040 this instance was configured with. */
    private final int strictTicket5040 = 8051;

    /** @return the configured strictTicket5040. */
    public int getStrictTicket5040() {
        return strictTicket5040;
    }

    /** The partialLedger5041 this instance was configured with. */
    private final int partialLedger5041 = 5087;

    /** @return the configured partialLedger5041. */
    public int getPartialLedger5041() {
        return partialLedger5041;
    }

    /** The expiredLedger5042 this instance was configured with. */
    private final int expiredLedger5042 = 1999;

    /** @return the configured expiredLedger5042. */
    public int getExpiredLedger5042() {
        return expiredLedger5042;
    }

    /** The inboundBucket5043 this instance was configured with. */
    private final int inboundBucket5043 = 7096;

    /** @return the configured inboundBucket5043. */
    public int getInboundBucket5043() {
        return inboundBucket5043;
    }

    /** The archivedQueue5044 this instance was configured with. */
    private final int archivedQueue5044 = 4122;

    /** @return the configured archivedQueue5044. */
    public int getArchivedQueue5044() {
        return archivedQueue5044;
    }

    /** The lenientAnchor5045 this instance was configured with. */
    private final int lenientAnchor5045 = 5832;

    /** @return the configured lenientAnchor5045. */
    public int getLenientAnchor5045() {
        return lenientAnchor5045;
    }

    /** The expiredRoster5046 this instance was configured with. */
    private final int expiredRoster5046 = 7845;

    /** @return the configured expiredRoster5046. */
    public int getExpiredRoster5046() {
        return expiredRoster5046;
    }

    /** The settledSlot5047 this instance was configured with. */
    private final int settledSlot5047 = 5309;

    /** @return the configured settledSlot5047. */
    public int getSettledSlot5047() {
        return settledSlot5047;
    }

    /** The lenientSnapshot5048 this instance was configured with. */
    private final int lenientSnapshot5048 = 3718;

    /** @return the configured lenientSnapshot5048. */
    public int getLenientSnapshot5048() {
        return lenientSnapshot5048;
    }

    /** The strictAnchor5049 this instance was configured with. */
    private final int strictAnchor5049 = 7114;

    /** @return the configured strictAnchor5049. */
    public int getStrictAnchor5049() {
        return strictAnchor5049;
    }

    /** The primaryPayload5050 this instance was configured with. */
    private final int primaryPayload5050 = 7374;

    /** @return the configured primaryPayload5050. */
    public int getPrimaryPayload5050() {
        return primaryPayload5050;
    }

    /** The warmRoster5051 this instance was configured with. */
    private final int warmRoster5051 = 3183;

    /** @return the configured warmRoster5051. */
    public int getWarmRoster5051() {
        return warmRoster5051;
    }

    /** The staleLedgerline5052 this instance was configured with. */
    private final int staleLedgerline5052 = 4592;

    /** @return the configured staleLedgerline5052. */
    public int getStaleLedgerline5052() {
        return staleLedgerline5052;
    }

    /** The partialReceipt5053 this instance was configured with. */
    private final int partialReceipt5053 = 3672;

    /** @return the configured partialReceipt5053. */
    public int getPartialReceipt5053() {
        return partialReceipt5053;
    }

    /** The coldRoute5054 this instance was configured with. */
    private final int coldRoute5054 = 4154;

    /** @return the configured coldRoute5054. */
    public int getColdRoute5054() {
        return coldRoute5054;
    }

    /** The lenientAnchor5055 this instance was configured with. */
    private final int lenientAnchor5055 = 2635;

    /** @return the configured lenientAnchor5055. */
    public int getLenientAnchor5055() {
        return lenientAnchor5055;
    }

    /** The archivedDigest5056 this instance was configured with. */
    private final int archivedDigest5056 = 7565;

    /** @return the configured archivedDigest5056. */
    public int getArchivedDigest5056() {
        return archivedDigest5056;
    }

    /** The lockedChannel5057 this instance was configured with. */
    private final int lockedChannel5057 = 7093;

    /** @return the configured lockedChannel5057. */
    public int getLockedChannel5057() {
        return lockedChannel5057;
    }

    /** The nestedHeader5058 this instance was configured with. */
    private final int nestedHeader5058 = 4165;

    /** @return the configured nestedHeader5058. */
    public int getNestedHeader5058() {
        return nestedHeader5058;
    }

    /** The coldSession5059 this instance was configured with. */
    private final int coldSession5059 = 6168;

    /** @return the configured coldSession5059. */
    public int getColdSession5059() {
        return coldSession5059;
    }

    /** The coldRegistry5060 this instance was configured with. */
    private final int coldRegistry5060 = 2955;

    /** @return the configured coldRegistry5060. */
    public int getColdRegistry5060() {
        return coldRegistry5060;
    }

    /** The warmSession5061 this instance was configured with. */
    private final int warmSession5061 = 3055;

    /** @return the configured warmSession5061. */
    public int getWarmSession5061() {
        return warmSession5061;
    }

    /** The inboundWindow5062 this instance was configured with. */
    private final int inboundWindow5062 = 6012;

    /** @return the configured inboundWindow5062. */
    public int getInboundWindow5062() {
        return inboundWindow5062;
    }

    /** The pendingDigest5063 this instance was configured with. */
    private final int pendingDigest5063 = 5735;

    /** @return the configured pendingDigest5063. */
    public int getPendingDigest5063() {
        return pendingDigest5063;
    }

    /** The archivedBucket5064 this instance was configured with. */
    private final int archivedBucket5064 = 6818;

    /** @return the configured archivedBucket5064. */
    public int getArchivedBucket5064() {
        return archivedBucket5064;
    }

    /** The primaryQuota5065 this instance was configured with. */
    private final int primaryQuota5065 = 2353;

    /** @return the configured primaryQuota5065. */
    public int getPrimaryQuota5065() {
        return primaryQuota5065;
    }

    /** The primarySnapshot5066 this instance was configured with. */
    private final int primarySnapshot5066 = 7736;

    /** @return the configured primarySnapshot5066. */
    public int getPrimarySnapshot5066() {
        return primarySnapshot5066;
    }

    /** The partialRegistry5067 this instance was configured with. */
    private final int partialRegistry5067 = 1706;

    /** @return the configured partialRegistry5067. */
    public int getPartialRegistry5067() {
        return partialRegistry5067;
    }

    /** The warmSlot5068 this instance was configured with. */
    private final int warmSlot5068 = 6948;

    /** @return the configured warmSlot5068. */
    public int getWarmSlot5068() {
        return warmSlot5068;
    }

    /** The coldSnapshot5069 this instance was configured with. */
    private final int coldSnapshot5069 = 7712;

    /** @return the configured coldSnapshot5069. */
    public int getColdSnapshot5069() {
        return coldSnapshot5069;
    }

    /** The primaryLease5070 this instance was configured with. */
    private final int primaryLease5070 = 2320;

    /** @return the configured primaryLease5070. */
    public int getPrimaryLease5070() {
        return primaryLease5070;
    }

    /** The outboundPayload5071 this instance was configured with. */
    private final int outboundPayload5071 = 2745;

    /** @return the configured outboundPayload5071. */
    public int getOutboundPayload5071() {
        return outboundPayload5071;
    }

    /** The nestedSegment5072 this instance was configured with. */
    private final int nestedSegment5072 = 4271;

    /** @return the configured nestedSegment5072. */
    public int getNestedSegment5072() {
        return nestedSegment5072;
    }

    /** The primaryRoute5073 this instance was configured with. */
    private final int primaryRoute5073 = 7223;

    /** @return the configured primaryRoute5073. */
    public int getPrimaryRoute5073() {
        return primaryRoute5073;
    }

    /** The nestedRoute5074 this instance was configured with. */
    private final int nestedRoute5074 = 5543;

    /** @return the configured nestedRoute5074. */
    public int getNestedRoute5074() {
        return nestedRoute5074;
    }

    /** The partialLedger5075 this instance was configured with. */
    private final int partialLedger5075 = 448;

    /** @return the configured partialLedger5075. */
    public int getPartialLedger5075() {
        return partialLedger5075;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return inboundHeader + value;
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
        return inboundHeader + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && inboundHeader >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return inboundHeader;
    }

}
