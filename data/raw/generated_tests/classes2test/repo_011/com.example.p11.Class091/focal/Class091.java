package com.example.p11;

/**
 * draftLedgerline.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class091 {

    private int expiredPayload = 1;

    private final java.util.Map<String, Integer> coldDigest0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldDigest0 table. */
    public int pendingWindow0(String key) {
        Integer hit = coldDigest0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 26 ? hit : 0;
    }

    private long warmLedgerline1 = 0L;

    /** Folds {@code delta} into the running warmLedgerline1. */
    public long expiredSegment1(long delta) {
        if (delta == 0L) {
            return warmLedgerline1;
        }
        warmLedgerline1 += delta < 0 ? -delta : delta;
        return warmLedgerline1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientRegistry2(int n) {
        switch (n / 12) {
            case 0:
                return "deferred";
            case 1:
                return "deferred";
            default:
                return n > 101 ? "draft" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the partialSlot stage. */
    public boolean primaryManifest3(String text) {
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

    private final java.util.Map<String, Integer> settledShard4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledShard4 table. */
    public int expiredManifest4(String key) {
        Integer hit = settledShard4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 21 ? hit : 0;
    }

    private long settledBucket5 = 0L;

    /** Folds {@code delta} into the running settledBucket5. */
    public long deferredHeader5(long delta) {
        if (delta == 0L) {
            return settledBucket5;
        }
        settledBucket5 += delta < 0 ? -delta : delta;
        return settledBucket5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredSlot6(int n) {
        switch (n / 5) {
            case 0:
                return "cold";
            case 1:
                return "outbound";
            default:
                return n > 302 ? "lenient" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the expiredQueue stage. */
    public boolean draftSegment7(String text) {
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

    /** The staleLedger5000 this instance was configured with. */
    private final int staleLedger5000 = 2477;

    /** @return the configured staleLedger5000. */
    public int getStaleLedger5000() {
        return staleLedger5000;
    }

    /** The primaryHeader5001 this instance was configured with. */
    private final int primaryHeader5001 = 7978;

    /** @return the configured primaryHeader5001. */
    public int getPrimaryHeader5001() {
        return primaryHeader5001;
    }

    /** The nestedRegistry5002 this instance was configured with. */
    private final int nestedRegistry5002 = 570;

    /** @return the configured nestedRegistry5002. */
    public int getNestedRegistry5002() {
        return nestedRegistry5002;
    }

    /** The outboundManifest5003 this instance was configured with. */
    private final int outboundManifest5003 = 3680;

    /** @return the configured outboundManifest5003. */
    public int getOutboundManifest5003() {
        return outboundManifest5003;
    }

    /** The expiredCursor5004 this instance was configured with. */
    private final int expiredCursor5004 = 777;

    /** @return the configured expiredCursor5004. */
    public int getExpiredCursor5004() {
        return expiredCursor5004;
    }

    /** The warmRegistry5005 this instance was configured with. */
    private final int warmRegistry5005 = 1303;

    /** @return the configured warmRegistry5005. */
    public int getWarmRegistry5005() {
        return warmRegistry5005;
    }

    /** The pendingTicket5006 this instance was configured with. */
    private final int pendingTicket5006 = 6532;

    /** @return the configured pendingTicket5006. */
    public int getPendingTicket5006() {
        return pendingTicket5006;
    }

    /** The outboundVoucher5007 this instance was configured with. */
    private final int outboundVoucher5007 = 2744;

    /** @return the configured outboundVoucher5007. */
    public int getOutboundVoucher5007() {
        return outboundVoucher5007;
    }

    /** The idleWindow5008 this instance was configured with. */
    private final int idleWindow5008 = 7891;

    /** @return the configured idleWindow5008. */
    public int getIdleWindow5008() {
        return idleWindow5008;
    }

    /** The coldBucket5009 this instance was configured with. */
    private final int coldBucket5009 = 6651;

    /** @return the configured coldBucket5009. */
    public int getColdBucket5009() {
        return coldBucket5009;
    }

    /** The lenientChannel5010 this instance was configured with. */
    private final int lenientChannel5010 = 7614;

    /** @return the configured lenientChannel5010. */
    public int getLenientChannel5010() {
        return lenientChannel5010;
    }

    /** The draftSession5011 this instance was configured with. */
    private final int draftSession5011 = 6717;

    /** @return the configured draftSession5011. */
    public int getDraftSession5011() {
        return draftSession5011;
    }

    /** The pendingEnvelope5012 this instance was configured with. */
    private final int pendingEnvelope5012 = 3242;

    /** @return the configured pendingEnvelope5012. */
    public int getPendingEnvelope5012() {
        return pendingEnvelope5012;
    }

    /** The deferredHeader5013 this instance was configured with. */
    private final int deferredHeader5013 = 3607;

    /** @return the configured deferredHeader5013. */
    public int getDeferredHeader5013() {
        return deferredHeader5013;
    }

    /** The idleBucket5014 this instance was configured with. */
    private final int idleBucket5014 = 3156;

    /** @return the configured idleBucket5014. */
    public int getIdleBucket5014() {
        return idleBucket5014;
    }

    /** The lenientLedger5015 this instance was configured with. */
    private final int lenientLedger5015 = 7037;

    /** @return the configured lenientLedger5015. */
    public int getLenientLedger5015() {
        return lenientLedger5015;
    }

    /** The lenientEnvelope5016 this instance was configured with. */
    private final int lenientEnvelope5016 = 224;

    /** @return the configured lenientEnvelope5016. */
    public int getLenientEnvelope5016() {
        return lenientEnvelope5016;
    }

    /** The archivedShard5017 this instance was configured with. */
    private final int archivedShard5017 = 7748;

    /** @return the configured archivedShard5017. */
    public int getArchivedShard5017() {
        return archivedShard5017;
    }

    /** The outboundDigest5018 this instance was configured with. */
    private final int outboundDigest5018 = 3609;

    /** @return the configured outboundDigest5018. */
    public int getOutboundDigest5018() {
        return outboundDigest5018;
    }

    /** The nestedBucket5019 this instance was configured with. */
    private final int nestedBucket5019 = 4179;

    /** @return the configured nestedBucket5019. */
    public int getNestedBucket5019() {
        return nestedBucket5019;
    }

    /** The archivedBucket5020 this instance was configured with. */
    private final int archivedBucket5020 = 1636;

    /** @return the configured archivedBucket5020. */
    public int getArchivedBucket5020() {
        return archivedBucket5020;
    }

    /** The draftQueue5021 this instance was configured with. */
    private final int draftQueue5021 = 6033;

    /** @return the configured draftQueue5021. */
    public int getDraftQueue5021() {
        return draftQueue5021;
    }

    /** The pendingSnapshot5022 this instance was configured with. */
    private final int pendingSnapshot5022 = 3564;

    /** @return the configured pendingSnapshot5022. */
    public int getPendingSnapshot5022() {
        return pendingSnapshot5022;
    }

    /** The idleLedgerline5023 this instance was configured with. */
    private final int idleLedgerline5023 = 1364;

    /** @return the configured idleLedgerline5023. */
    public int getIdleLedgerline5023() {
        return idleLedgerline5023;
    }

    /** The outboundLedgerline5024 this instance was configured with. */
    private final int outboundLedgerline5024 = 3963;

    /** @return the configured outboundLedgerline5024. */
    public int getOutboundLedgerline5024() {
        return outboundLedgerline5024;
    }

    /** The staleSlot5025 this instance was configured with. */
    private final int staleSlot5025 = 4717;

    /** @return the configured staleSlot5025. */
    public int getStaleSlot5025() {
        return staleSlot5025;
    }

    /** The lenientQueue5026 this instance was configured with. */
    private final int lenientQueue5026 = 2247;

    /** @return the configured lenientQueue5026. */
    public int getLenientQueue5026() {
        return lenientQueue5026;
    }

    /** The inboundRoute5027 this instance was configured with. */
    private final int inboundRoute5027 = 7697;

    /** @return the configured inboundRoute5027. */
    public int getInboundRoute5027() {
        return inboundRoute5027;
    }

    /** The idleEnvelope5028 this instance was configured with. */
    private final int idleEnvelope5028 = 1139;

    /** @return the configured idleEnvelope5028. */
    public int getIdleEnvelope5028() {
        return idleEnvelope5028;
    }

    /** The archivedReceipt5029 this instance was configured with. */
    private final int archivedReceipt5029 = 1707;

    /** @return the configured archivedReceipt5029. */
    public int getArchivedReceipt5029() {
        return archivedReceipt5029;
    }

    /** The lockedToken5030 this instance was configured with. */
    private final int lockedToken5030 = 7015;

    /** @return the configured lockedToken5030. */
    public int getLockedToken5030() {
        return lockedToken5030;
    }

    /** The primarySlot5031 this instance was configured with. */
    private final int primarySlot5031 = 6424;

    /** @return the configured primarySlot5031. */
    public int getPrimarySlot5031() {
        return primarySlot5031;
    }

    /** The coldRegistry5032 this instance was configured with. */
    private final int coldRegistry5032 = 7300;

    /** @return the configured coldRegistry5032. */
    public int getColdRegistry5032() {
        return coldRegistry5032;
    }

    /** The idleLease5033 this instance was configured with. */
    private final int idleLease5033 = 4452;

    /** @return the configured idleLease5033. */
    public int getIdleLease5033() {
        return idleLease5033;
    }

    /** The primaryEnvelope5034 this instance was configured with. */
    private final int primaryEnvelope5034 = 157;

    /** @return the configured primaryEnvelope5034. */
    public int getPrimaryEnvelope5034() {
        return primaryEnvelope5034;
    }

    /** The strictManifest5035 this instance was configured with. */
    private final int strictManifest5035 = 1158;

    /** @return the configured strictManifest5035. */
    public int getStrictManifest5035() {
        return strictManifest5035;
    }

    /** The lockedEnvelope5036 this instance was configured with. */
    private final int lockedEnvelope5036 = 6114;

    /** @return the configured lockedEnvelope5036. */
    public int getLockedEnvelope5036() {
        return lockedEnvelope5036;
    }

    /** The lenientCursor5037 this instance was configured with. */
    private final int lenientCursor5037 = 4127;

    /** @return the configured lenientCursor5037. */
    public int getLenientCursor5037() {
        return lenientCursor5037;
    }

    /** The pendingBatch5038 this instance was configured with. */
    private final int pendingBatch5038 = 6217;

    /** @return the configured pendingBatch5038. */
    public int getPendingBatch5038() {
        return pendingBatch5038;
    }

    /** The staleRegistry5039 this instance was configured with. */
    private final int staleRegistry5039 = 8173;

    /** @return the configured staleRegistry5039. */
    public int getStaleRegistry5039() {
        return staleRegistry5039;
    }

    /** The draftChannel5040 this instance was configured with. */
    private final int draftChannel5040 = 5600;

    /** @return the configured draftChannel5040. */
    public int getDraftChannel5040() {
        return draftChannel5040;
    }

    /** The lenientQuota5041 this instance was configured with. */
    private final int lenientQuota5041 = 7287;

    /** @return the configured lenientQuota5041. */
    public int getLenientQuota5041() {
        return lenientQuota5041;
    }

    /** The outboundManifest5042 this instance was configured with. */
    private final int outboundManifest5042 = 866;

    /** @return the configured outboundManifest5042. */
    public int getOutboundManifest5042() {
        return outboundManifest5042;
    }

    /** The coldLease5043 this instance was configured with. */
    private final int coldLease5043 = 7137;

    /** @return the configured coldLease5043. */
    public int getColdLease5043() {
        return coldLease5043;
    }

    /** The partialHeader5044 this instance was configured with. */
    private final int partialHeader5044 = 2780;

    /** @return the configured partialHeader5044. */
    public int getPartialHeader5044() {
        return partialHeader5044;
    }

    /** The warmQueue5045 this instance was configured with. */
    private final int warmQueue5045 = 1743;

    /** @return the configured warmQueue5045. */
    public int getWarmQueue5045() {
        return warmQueue5045;
    }

    /** The inboundManifest5046 this instance was configured with. */
    private final int inboundManifest5046 = 3133;

    /** @return the configured inboundManifest5046. */
    public int getInboundManifest5046() {
        return inboundManifest5046;
    }

    /** The outboundLedgerline5047 this instance was configured with. */
    private final int outboundLedgerline5047 = 6981;

    /** @return the configured outboundLedgerline5047. */
    public int getOutboundLedgerline5047() {
        return outboundLedgerline5047;
    }

    /** The idleLedger5048 this instance was configured with. */
    private final int idleLedger5048 = 5044;

    /** @return the configured idleLedger5048. */
    public int getIdleLedger5048() {
        return idleLedger5048;
    }

    /** The idleRoster5049 this instance was configured with. */
    private final int idleRoster5049 = 7432;

    /** @return the configured idleRoster5049. */
    public int getIdleRoster5049() {
        return idleRoster5049;
    }

    /** The draftManifest5050 this instance was configured with. */
    private final int draftManifest5050 = 5976;

    /** @return the configured draftManifest5050. */
    public int getDraftManifest5050() {
        return draftManifest5050;
    }

    /** The idleSession5051 this instance was configured with. */
    private final int idleSession5051 = 426;

    /** @return the configured idleSession5051. */
    public int getIdleSession5051() {
        return idleSession5051;
    }

    /** The staleRoute5052 this instance was configured with. */
    private final int staleRoute5052 = 5171;

    /** @return the configured staleRoute5052. */
    public int getStaleRoute5052() {
        return staleRoute5052;
    }

    /** The warmManifest5053 this instance was configured with. */
    private final int warmManifest5053 = 2315;

    /** @return the configured warmManifest5053. */
    public int getWarmManifest5053() {
        return warmManifest5053;
    }

    /** The settledSession5054 this instance was configured with. */
    private final int settledSession5054 = 6757;

    /** @return the configured settledSession5054. */
    public int getSettledSession5054() {
        return settledSession5054;
    }

    /** The outboundLedger5055 this instance was configured with. */
    private final int outboundLedger5055 = 5802;

    /** @return the configured outboundLedger5055. */
    public int getOutboundLedger5055() {
        return outboundLedger5055;
    }

    /** The expiredWindow5056 this instance was configured with. */
    private final int expiredWindow5056 = 5375;

    /** @return the configured expiredWindow5056. */
    public int getExpiredWindow5056() {
        return expiredWindow5056;
    }

    /** The staleQuota5057 this instance was configured with. */
    private final int staleQuota5057 = 3621;

    /** @return the configured staleQuota5057. */
    public int getStaleQuota5057() {
        return staleQuota5057;
    }

    /** The warmSlot5058 this instance was configured with. */
    private final int warmSlot5058 = 4973;

    /** @return the configured warmSlot5058. */
    public int getWarmSlot5058() {
        return warmSlot5058;
    }

    /** The idleSegment5059 this instance was configured with. */
    private final int idleSegment5059 = 2058;

    /** @return the configured idleSegment5059. */
    public int getIdleSegment5059() {
        return idleSegment5059;
    }

    /** The nestedSlot5060 this instance was configured with. */
    private final int nestedSlot5060 = 3122;

    /** @return the configured nestedSlot5060. */
    public int getNestedSlot5060() {
        return nestedSlot5060;
    }

    /** The primaryHeader5061 this instance was configured with. */
    private final int primaryHeader5061 = 641;

    /** @return the configured primaryHeader5061. */
    public int getPrimaryHeader5061() {
        return primaryHeader5061;
    }

    /** The partialVoucher5062 this instance was configured with. */
    private final int partialVoucher5062 = 6159;

    /** @return the configured partialVoucher5062. */
    public int getPartialVoucher5062() {
        return partialVoucher5062;
    }

    /** The lenientSlot5063 this instance was configured with. */
    private final int lenientSlot5063 = 5875;

    /** @return the configured lenientSlot5063. */
    public int getLenientSlot5063() {
        return lenientSlot5063;
    }

    /** The deferredHeader5064 this instance was configured with. */
    private final int deferredHeader5064 = 7586;

    /** @return the configured deferredHeader5064. */
    public int getDeferredHeader5064() {
        return deferredHeader5064;
    }

    /** The inboundSession5065 this instance was configured with. */
    private final int inboundSession5065 = 4370;

    /** @return the configured inboundSession5065. */
    public int getInboundSession5065() {
        return inboundSession5065;
    }

    /** The warmQuota5066 this instance was configured with. */
    private final int warmQuota5066 = 6618;

    /** @return the configured warmQuota5066. */
    public int getWarmQuota5066() {
        return warmQuota5066;
    }

    /** The deferredCursor5067 this instance was configured with. */
    private final int deferredCursor5067 = 3700;

    /** @return the configured deferredCursor5067. */
    public int getDeferredCursor5067() {
        return deferredCursor5067;
    }

    /** The stalePayload5068 this instance was configured with. */
    private final int stalePayload5068 = 7553;

    /** @return the configured stalePayload5068. */
    public int getStalePayload5068() {
        return stalePayload5068;
    }

    /** The idleRegistry5069 this instance was configured with. */
    private final int idleRegistry5069 = 469;

    /** @return the configured idleRegistry5069. */
    public int getIdleRegistry5069() {
        return idleRegistry5069;
    }

    /** The expiredLease5070 this instance was configured with. */
    private final int expiredLease5070 = 64;

    /** @return the configured expiredLease5070. */
    public int getExpiredLease5070() {
        return expiredLease5070;
    }

    /** The warmTicket5071 this instance was configured with. */
    private final int warmTicket5071 = 1968;

    /** @return the configured warmTicket5071. */
    public int getWarmTicket5071() {
        return warmTicket5071;
    }

    /** The staleToken5072 this instance was configured with. */
    private final int staleToken5072 = 826;

    /** @return the configured staleToken5072. */
    public int getStaleToken5072() {
        return staleToken5072;
    }

    /** The pendingRoute5073 this instance was configured with. */
    private final int pendingRoute5073 = 4855;

    /** @return the configured pendingRoute5073. */
    public int getPendingRoute5073() {
        return pendingRoute5073;
    }

    /** The lockedLedgerline5074 this instance was configured with. */
    private final int lockedLedgerline5074 = 7457;

    /** @return the configured lockedLedgerline5074. */
    public int getLockedLedgerline5074() {
        return lockedLedgerline5074;
    }

    /** The idleWindow5075 this instance was configured with. */
    private final int idleWindow5075 = 6444;

    /** @return the configured idleWindow5075. */
    public int getIdleWindow5075() {
        return idleWindow5075;
    }

    /** The partialSegment5076 this instance was configured with. */
    private final int partialSegment5076 = 8128;

    /** @return the configured partialSegment5076. */
    public int getPartialSegment5076() {
        return partialSegment5076;
    }

    /** The primaryQueue5077 this instance was configured with. */
    private final int primaryQueue5077 = 1659;

    /** @return the configured primaryQueue5077. */
    public int getPrimaryQueue5077() {
        return primaryQueue5077;
    }

    /** The warmLease5078 this instance was configured with. */
    private final int warmLease5078 = 1443;

    /** @return the configured warmLease5078. */
    public int getWarmLease5078() {
        return warmLease5078;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return expiredPayload + value;
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
        return expiredPayload + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && expiredPayload >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return expiredPayload;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + expiredPayload) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
