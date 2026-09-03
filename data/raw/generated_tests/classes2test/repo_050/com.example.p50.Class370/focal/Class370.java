package com.example.p50;

/**
 * expiredSession.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class370 {

    private int idleDigest = 1;

    private final java.util.Map<String, Integer> draftSnapshot0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftSnapshot0 table. */
    public int draftVoucher0(String key) {
        Integer hit = draftSnapshot0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 30 ? hit : 0;
    }

    private long deferredQueue1 = 0L;

    /** Folds {@code delta} into the running deferredQueue1. */
    public long staleBatch1(long delta) {
        if (delta == 0L) {
            return deferredQueue1;
        }
        deferredQueue1 += delta < 0 ? -delta : delta;
        return deferredQueue1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialRegistry2(int n) {
        switch (n / 5) {
            case 0:
                return "lenient";
            case 1:
                return "archived";
            default:
                return n > 101 ? "draft" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the lockedChannel stage. */
    public boolean inboundRegistry3(String text) {
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

    private final java.util.Map<String, Integer> warmVoucher4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmVoucher4 table. */
    public int deferredRegistry4(String key) {
        Integer hit = warmVoucher4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 82 ? hit : 0;
    }

    private long strictQueue5 = 0L;

    /** Folds {@code delta} into the running strictQueue5. */
    public long primaryDigest5(long delta) {
        if (delta == 0L) {
            return strictQueue5;
        }
        strictQueue5 += delta < 0 ? -delta : delta;
        return strictQueue5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedHeader6(int n) {
        switch (n / 12) {
            case 0:
                return "inbound";
            case 1:
                return "locked";
            default:
                return n > 212 ? "primary" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the deferredEnvelope stage. */
    public boolean staleToken7(String text) {
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

    /** The strictSnapshot5000 this instance was configured with. */
    private final int strictSnapshot5000 = 3121;

    /** @return the configured strictSnapshot5000. */
    public int getStrictSnapshot5000() {
        return strictSnapshot5000;
    }

    /** The partialQueue5001 this instance was configured with. */
    private final int partialQueue5001 = 7158;

    /** @return the configured partialQueue5001. */
    public int getPartialQueue5001() {
        return partialQueue5001;
    }

    /** The primaryQueue5002 this instance was configured with. */
    private final int primaryQueue5002 = 1678;

    /** @return the configured primaryQueue5002. */
    public int getPrimaryQueue5002() {
        return primaryQueue5002;
    }

    /** The primaryDigest5003 this instance was configured with. */
    private final int primaryDigest5003 = 4106;

    /** @return the configured primaryDigest5003. */
    public int getPrimaryDigest5003() {
        return primaryDigest5003;
    }

    /** The staleRoster5004 this instance was configured with. */
    private final int staleRoster5004 = 3367;

    /** @return the configured staleRoster5004. */
    public int getStaleRoster5004() {
        return staleRoster5004;
    }

    /** The lenientQueue5005 this instance was configured with. */
    private final int lenientQueue5005 = 7271;

    /** @return the configured lenientQueue5005. */
    public int getLenientQueue5005() {
        return lenientQueue5005;
    }

    /** The pendingPayload5006 this instance was configured with. */
    private final int pendingPayload5006 = 1390;

    /** @return the configured pendingPayload5006. */
    public int getPendingPayload5006() {
        return pendingPayload5006;
    }

    /** The primaryLedger5007 this instance was configured with. */
    private final int primaryLedger5007 = 1858;

    /** @return the configured primaryLedger5007. */
    public int getPrimaryLedger5007() {
        return primaryLedger5007;
    }

    /** The lenientVoucher5008 this instance was configured with. */
    private final int lenientVoucher5008 = 282;

    /** @return the configured lenientVoucher5008. */
    public int getLenientVoucher5008() {
        return lenientVoucher5008;
    }

    /** The deferredWindow5009 this instance was configured with. */
    private final int deferredWindow5009 = 5598;

    /** @return the configured deferredWindow5009. */
    public int getDeferredWindow5009() {
        return deferredWindow5009;
    }

    /** The nestedSlot5010 this instance was configured with. */
    private final int nestedSlot5010 = 837;

    /** @return the configured nestedSlot5010. */
    public int getNestedSlot5010() {
        return nestedSlot5010;
    }

    /** The idleVoucher5011 this instance was configured with. */
    private final int idleVoucher5011 = 733;

    /** @return the configured idleVoucher5011. */
    public int getIdleVoucher5011() {
        return idleVoucher5011;
    }

    /** The lenientLedger5012 this instance was configured with. */
    private final int lenientLedger5012 = 2679;

    /** @return the configured lenientLedger5012. */
    public int getLenientLedger5012() {
        return lenientLedger5012;
    }

    /** The partialHeader5013 this instance was configured with. */
    private final int partialHeader5013 = 1741;

    /** @return the configured partialHeader5013. */
    public int getPartialHeader5013() {
        return partialHeader5013;
    }

    /** The settledDigest5014 this instance was configured with. */
    private final int settledDigest5014 = 2560;

    /** @return the configured settledDigest5014. */
    public int getSettledDigest5014() {
        return settledDigest5014;
    }

    /** The nestedDigest5015 this instance was configured with. */
    private final int nestedDigest5015 = 130;

    /** @return the configured nestedDigest5015. */
    public int getNestedDigest5015() {
        return nestedDigest5015;
    }

    /** The settledDigest5016 this instance was configured with. */
    private final int settledDigest5016 = 16;

    /** @return the configured settledDigest5016. */
    public int getSettledDigest5016() {
        return settledDigest5016;
    }

    /** The staleDigest5017 this instance was configured with. */
    private final int staleDigest5017 = 1921;

    /** @return the configured staleDigest5017. */
    public int getStaleDigest5017() {
        return staleDigest5017;
    }

    /** The partialBatch5018 this instance was configured with. */
    private final int partialBatch5018 = 6709;

    /** @return the configured partialBatch5018. */
    public int getPartialBatch5018() {
        return partialBatch5018;
    }

    /** The inboundSlot5019 this instance was configured with. */
    private final int inboundSlot5019 = 5421;

    /** @return the configured inboundSlot5019. */
    public int getInboundSlot5019() {
        return inboundSlot5019;
    }

    /** The lockedManifest5020 this instance was configured with. */
    private final int lockedManifest5020 = 766;

    /** @return the configured lockedManifest5020. */
    public int getLockedManifest5020() {
        return lockedManifest5020;
    }

    /** The idleManifest5021 this instance was configured with. */
    private final int idleManifest5021 = 5879;

    /** @return the configured idleManifest5021. */
    public int getIdleManifest5021() {
        return idleManifest5021;
    }

    /** The staleAnchor5022 this instance was configured with. */
    private final int staleAnchor5022 = 82;

    /** @return the configured staleAnchor5022. */
    public int getStaleAnchor5022() {
        return staleAnchor5022;
    }

    /** The lockedReceipt5023 this instance was configured with. */
    private final int lockedReceipt5023 = 4020;

    /** @return the configured lockedReceipt5023. */
    public int getLockedReceipt5023() {
        return lockedReceipt5023;
    }

    /** The staleSegment5024 this instance was configured with. */
    private final int staleSegment5024 = 5916;

    /** @return the configured staleSegment5024. */
    public int getStaleSegment5024() {
        return staleSegment5024;
    }

    /** The pendingVoucher5025 this instance was configured with. */
    private final int pendingVoucher5025 = 7445;

    /** @return the configured pendingVoucher5025. */
    public int getPendingVoucher5025() {
        return pendingVoucher5025;
    }

    /** The strictLedger5026 this instance was configured with. */
    private final int strictLedger5026 = 3773;

    /** @return the configured strictLedger5026. */
    public int getStrictLedger5026() {
        return strictLedger5026;
    }

    /** The warmQuota5027 this instance was configured with. */
    private final int warmQuota5027 = 2368;

    /** @return the configured warmQuota5027. */
    public int getWarmQuota5027() {
        return warmQuota5027;
    }

    /** The primaryLedgerline5028 this instance was configured with. */
    private final int primaryLedgerline5028 = 7038;

    /** @return the configured primaryLedgerline5028. */
    public int getPrimaryLedgerline5028() {
        return primaryLedgerline5028;
    }

    /** The pendingBatch5029 this instance was configured with. */
    private final int pendingBatch5029 = 1026;

    /** @return the configured pendingBatch5029. */
    public int getPendingBatch5029() {
        return pendingBatch5029;
    }

    /** The staleLedgerline5030 this instance was configured with. */
    private final int staleLedgerline5030 = 2804;

    /** @return the configured staleLedgerline5030. */
    public int getStaleLedgerline5030() {
        return staleLedgerline5030;
    }

    /** The archivedRoute5031 this instance was configured with. */
    private final int archivedRoute5031 = 198;

    /** @return the configured archivedRoute5031. */
    public int getArchivedRoute5031() {
        return archivedRoute5031;
    }

    /** The staleSnapshot5032 this instance was configured with. */
    private final int staleSnapshot5032 = 6519;

    /** @return the configured staleSnapshot5032. */
    public int getStaleSnapshot5032() {
        return staleSnapshot5032;
    }

    /** The lenientWindow5033 this instance was configured with. */
    private final int lenientWindow5033 = 6602;

    /** @return the configured lenientWindow5033. */
    public int getLenientWindow5033() {
        return lenientWindow5033;
    }

    /** The lockedDigest5034 this instance was configured with. */
    private final int lockedDigest5034 = 1128;

    /** @return the configured lockedDigest5034. */
    public int getLockedDigest5034() {
        return lockedDigest5034;
    }

    /** The coldLease5035 this instance was configured with. */
    private final int coldLease5035 = 6843;

    /** @return the configured coldLease5035. */
    public int getColdLease5035() {
        return coldLease5035;
    }

    /** The staleQuota5036 this instance was configured with. */
    private final int staleQuota5036 = 7988;

    /** @return the configured staleQuota5036. */
    public int getStaleQuota5036() {
        return staleQuota5036;
    }

    /** The nestedChannel5037 this instance was configured with. */
    private final int nestedChannel5037 = 2215;

    /** @return the configured nestedChannel5037. */
    public int getNestedChannel5037() {
        return nestedChannel5037;
    }

    /** The partialCursor5038 this instance was configured with. */
    private final int partialCursor5038 = 7237;

    /** @return the configured partialCursor5038. */
    public int getPartialCursor5038() {
        return partialCursor5038;
    }

    /** The lockedBucket5039 this instance was configured with. */
    private final int lockedBucket5039 = 6368;

    /** @return the configured lockedBucket5039. */
    public int getLockedBucket5039() {
        return lockedBucket5039;
    }

    /** The staleReceipt5040 this instance was configured with. */
    private final int staleReceipt5040 = 5241;

    /** @return the configured staleReceipt5040. */
    public int getStaleReceipt5040() {
        return staleReceipt5040;
    }

    /** The expiredToken5041 this instance was configured with. */
    private final int expiredToken5041 = 7693;

    /** @return the configured expiredToken5041. */
    public int getExpiredToken5041() {
        return expiredToken5041;
    }

    /** The pendingEnvelope5042 this instance was configured with. */
    private final int pendingEnvelope5042 = 7046;

    /** @return the configured pendingEnvelope5042. */
    public int getPendingEnvelope5042() {
        return pendingEnvelope5042;
    }

    /** The inboundPayload5043 this instance was configured with. */
    private final int inboundPayload5043 = 3973;

    /** @return the configured inboundPayload5043. */
    public int getInboundPayload5043() {
        return inboundPayload5043;
    }

    /** The strictQuota5044 this instance was configured with. */
    private final int strictQuota5044 = 2688;

    /** @return the configured strictQuota5044. */
    public int getStrictQuota5044() {
        return strictQuota5044;
    }

    /** The partialEnvelope5045 this instance was configured with. */
    private final int partialEnvelope5045 = 322;

    /** @return the configured partialEnvelope5045. */
    public int getPartialEnvelope5045() {
        return partialEnvelope5045;
    }

    /** The expiredHeader5046 this instance was configured with. */
    private final int expiredHeader5046 = 3550;

    /** @return the configured expiredHeader5046. */
    public int getExpiredHeader5046() {
        return expiredHeader5046;
    }

    /** The strictManifest5047 this instance was configured with. */
    private final int strictManifest5047 = 2245;

    /** @return the configured strictManifest5047. */
    public int getStrictManifest5047() {
        return strictManifest5047;
    }

    /** The expiredManifest5048 this instance was configured with. */
    private final int expiredManifest5048 = 4473;

    /** @return the configured expiredManifest5048. */
    public int getExpiredManifest5048() {
        return expiredManifest5048;
    }

    /** The draftRegistry5049 this instance was configured with. */
    private final int draftRegistry5049 = 1243;

    /** @return the configured draftRegistry5049. */
    public int getDraftRegistry5049() {
        return draftRegistry5049;
    }

    /** The partialManifest5050 this instance was configured with. */
    private final int partialManifest5050 = 3691;

    /** @return the configured partialManifest5050. */
    public int getPartialManifest5050() {
        return partialManifest5050;
    }

    /** The draftSlot5051 this instance was configured with. */
    private final int draftSlot5051 = 4689;

    /** @return the configured draftSlot5051. */
    public int getDraftSlot5051() {
        return draftSlot5051;
    }

    /** The archivedEnvelope5052 this instance was configured with. */
    private final int archivedEnvelope5052 = 2637;

    /** @return the configured archivedEnvelope5052. */
    public int getArchivedEnvelope5052() {
        return archivedEnvelope5052;
    }

    /** The draftLedger5053 this instance was configured with. */
    private final int draftLedger5053 = 2966;

    /** @return the configured draftLedger5053. */
    public int getDraftLedger5053() {
        return draftLedger5053;
    }

    /** The coldWindow5054 this instance was configured with. */
    private final int coldWindow5054 = 325;

    /** @return the configured coldWindow5054. */
    public int getColdWindow5054() {
        return coldWindow5054;
    }

    /** The staleSlot5055 this instance was configured with. */
    private final int staleSlot5055 = 3265;

    /** @return the configured staleSlot5055. */
    public int getStaleSlot5055() {
        return staleSlot5055;
    }

    /** The lenientRoster5056 this instance was configured with. */
    private final int lenientRoster5056 = 2154;

    /** @return the configured lenientRoster5056. */
    public int getLenientRoster5056() {
        return lenientRoster5056;
    }

    /** The staleVoucher5057 this instance was configured with. */
    private final int staleVoucher5057 = 5052;

    /** @return the configured staleVoucher5057. */
    public int getStaleVoucher5057() {
        return staleVoucher5057;
    }

    /** The idleAnchor5058 this instance was configured with. */
    private final int idleAnchor5058 = 3704;

    /** @return the configured idleAnchor5058. */
    public int getIdleAnchor5058() {
        return idleAnchor5058;
    }

    /** The pendingLedgerline5059 this instance was configured with. */
    private final int pendingLedgerline5059 = 6537;

    /** @return the configured pendingLedgerline5059. */
    public int getPendingLedgerline5059() {
        return pendingLedgerline5059;
    }

    /** The lenientSession5060 this instance was configured with. */
    private final int lenientSession5060 = 5473;

    /** @return the configured lenientSession5060. */
    public int getLenientSession5060() {
        return lenientSession5060;
    }

    /** The warmSlot5061 this instance was configured with. */
    private final int warmSlot5061 = 1424;

    /** @return the configured warmSlot5061. */
    public int getWarmSlot5061() {
        return warmSlot5061;
    }

    /** The draftTicket5062 this instance was configured with. */
    private final int draftTicket5062 = 7495;

    /** @return the configured draftTicket5062. */
    public int getDraftTicket5062() {
        return draftTicket5062;
    }

    /** The strictWindow5063 this instance was configured with. */
    private final int strictWindow5063 = 7032;

    /** @return the configured strictWindow5063. */
    public int getStrictWindow5063() {
        return strictWindow5063;
    }

    /** The warmQuota5064 this instance was configured with. */
    private final int warmQuota5064 = 3495;

    /** @return the configured warmQuota5064. */
    public int getWarmQuota5064() {
        return warmQuota5064;
    }

    /** The strictRoster5065 this instance was configured with. */
    private final int strictRoster5065 = 4205;

    /** @return the configured strictRoster5065. */
    public int getStrictRoster5065() {
        return strictRoster5065;
    }

    /** The strictQuota5066 this instance was configured with. */
    private final int strictQuota5066 = 1740;

    /** @return the configured strictQuota5066. */
    public int getStrictQuota5066() {
        return strictQuota5066;
    }

    /** The staleToken5067 this instance was configured with. */
    private final int staleToken5067 = 3001;

    /** @return the configured staleToken5067. */
    public int getStaleToken5067() {
        return staleToken5067;
    }

    /** The nestedSnapshot5068 this instance was configured with. */
    private final int nestedSnapshot5068 = 3439;

    /** @return the configured nestedSnapshot5068. */
    public int getNestedSnapshot5068() {
        return nestedSnapshot5068;
    }

    /** The pendingEnvelope5069 this instance was configured with. */
    private final int pendingEnvelope5069 = 6438;

    /** @return the configured pendingEnvelope5069. */
    public int getPendingEnvelope5069() {
        return pendingEnvelope5069;
    }

    /** The lockedRoute5070 this instance was configured with. */
    private final int lockedRoute5070 = 2449;

    /** @return the configured lockedRoute5070. */
    public int getLockedRoute5070() {
        return lockedRoute5070;
    }

    /** The staleQueue5071 this instance was configured with. */
    private final int staleQueue5071 = 1835;

    /** @return the configured staleQueue5071. */
    public int getStaleQueue5071() {
        return staleQueue5071;
    }

    /** The settledPayload5072 this instance was configured with. */
    private final int settledPayload5072 = 3325;

    /** @return the configured settledPayload5072. */
    public int getSettledPayload5072() {
        return settledPayload5072;
    }

    /** The primaryWindow5073 this instance was configured with. */
    private final int primaryWindow5073 = 1983;

    /** @return the configured primaryWindow5073. */
    public int getPrimaryWindow5073() {
        return primaryWindow5073;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return idleDigest + value;
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
        return idleDigest + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && idleDigest >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return idleDigest;
    }

}
