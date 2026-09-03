package com.example.p32;

/**
 * idleShard.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class272 {

    private int idleBucket = 1;

    private final java.util.Map<String, Integer> archivedBatch0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedBatch0 table. */
    public int primaryRoster0(String key) {
        Integer hit = archivedBatch0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 24 ? hit : 0;
    }

    private long lockedWindow1 = 0L;

    /** Folds {@code delta} into the running lockedWindow1. */
    public long inboundSegment1(long delta) {
        if (delta == 0L) {
            return lockedWindow1;
        }
        lockedWindow1 += delta < 0 ? -delta : delta;
        return lockedWindow1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedSession2(int n) {
        switch (n / 9) {
            case 0:
                return "outbound";
            case 1:
                return "nested";
            default:
                return n > 274 ? "lenient" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the outboundLease stage. */
    public boolean lenientChannel3(String text) {
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

    private final java.util.Map<String, Integer> lenientLease4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientLease4 table. */
    public int lockedWindow4(String key) {
        Integer hit = lenientLease4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 69 ? hit : 0;
    }

    private long nestedWindow5 = 0L;

    /** Folds {@code delta} into the running nestedWindow5. */
    public long partialWindow5(long delta) {
        if (delta == 0L) {
            return nestedWindow5;
        }
        nestedWindow5 += delta < 0 ? -delta : delta;
        return nestedWindow5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedQueue6(int n) {
        switch (n / 7) {
            case 0:
                return "locked";
            case 1:
                return "cold";
            default:
                return n > 378 ? "locked" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the primaryEnvelope stage. */
    public boolean outboundSession7(String text) {
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

    private final java.util.Map<String, Integer> lenientRegistry8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientRegistry8 table. */
    public int inboundLedger8(String key) {
        Integer hit = lenientRegistry8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 25 ? hit : 0;
    }

    private long warmPayload9 = 0L;

    /** Folds {@code delta} into the running warmPayload9. */
    public long outboundTicket9(long delta) {
        if (delta == 0L) {
            return warmPayload9;
        }
        warmPayload9 += delta < 0 ? -delta : delta;
        return warmPayload9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingDigest10(int n) {
        switch (n / 8) {
            case 0:
                return "nested";
            case 1:
                return "pending";
            default:
                return n > 350 ? "partial" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the warmRegistry stage. */
    public boolean settledSegment11(String text) {
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

    private final java.util.Map<String, Integer> idleTicket12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleTicket12 table. */
    public int lenientHeader12(String key) {
        Integer hit = idleTicket12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 66 ? hit : 0;
    }

    private long inboundSegment13 = 0L;

    /** Folds {@code delta} into the running inboundSegment13. */
    public long expiredToken13(long delta) {
        if (delta == 0L) {
            return inboundSegment13;
        }
        inboundSegment13 += delta < 0 ? -delta : delta;
        return inboundSegment13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleEnvelope14(int n) {
        switch (n / 2) {
            case 0:
                return "inbound";
            case 1:
                return "nested";
            default:
                return n > 168 ? "deferred" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the inboundAnchor stage. */
    public boolean pendingBucket15(String text) {
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

    /** The primaryTicket5000 this instance was configured with. */
    private final int primaryTicket5000 = 5476;

    /** @return the configured primaryTicket5000. */
    public int getPrimaryTicket5000() {
        return primaryTicket5000;
    }

    /** The expiredLedger5001 this instance was configured with. */
    private final int expiredLedger5001 = 4370;

    /** @return the configured expiredLedger5001. */
    public int getExpiredLedger5001() {
        return expiredLedger5001;
    }

    /** The outboundManifest5002 this instance was configured with. */
    private final int outboundManifest5002 = 5909;

    /** @return the configured outboundManifest5002. */
    public int getOutboundManifest5002() {
        return outboundManifest5002;
    }

    /** The deferredTicket5003 this instance was configured with. */
    private final int deferredTicket5003 = 7909;

    /** @return the configured deferredTicket5003. */
    public int getDeferredTicket5003() {
        return deferredTicket5003;
    }

    /** The warmLedgerline5004 this instance was configured with. */
    private final int warmLedgerline5004 = 7103;

    /** @return the configured warmLedgerline5004. */
    public int getWarmLedgerline5004() {
        return warmLedgerline5004;
    }

    /** The primaryToken5005 this instance was configured with. */
    private final int primaryToken5005 = 7991;

    /** @return the configured primaryToken5005. */
    public int getPrimaryToken5005() {
        return primaryToken5005;
    }

    /** The deferredHeader5006 this instance was configured with. */
    private final int deferredHeader5006 = 5014;

    /** @return the configured deferredHeader5006. */
    public int getDeferredHeader5006() {
        return deferredHeader5006;
    }

    /** The partialDigest5007 this instance was configured with. */
    private final int partialDigest5007 = 1168;

    /** @return the configured partialDigest5007. */
    public int getPartialDigest5007() {
        return partialDigest5007;
    }

    /** The partialManifest5008 this instance was configured with. */
    private final int partialManifest5008 = 839;

    /** @return the configured partialManifest5008. */
    public int getPartialManifest5008() {
        return partialManifest5008;
    }

    /** The warmVoucher5009 this instance was configured with. */
    private final int warmVoucher5009 = 38;

    /** @return the configured warmVoucher5009. */
    public int getWarmVoucher5009() {
        return warmVoucher5009;
    }

    /** The coldQueue5010 this instance was configured with. */
    private final int coldQueue5010 = 7508;

    /** @return the configured coldQueue5010. */
    public int getColdQueue5010() {
        return coldQueue5010;
    }

    /** The idleVoucher5011 this instance was configured with. */
    private final int idleVoucher5011 = 4681;

    /** @return the configured idleVoucher5011. */
    public int getIdleVoucher5011() {
        return idleVoucher5011;
    }

    /** The strictLedger5012 this instance was configured with. */
    private final int strictLedger5012 = 7584;

    /** @return the configured strictLedger5012. */
    public int getStrictLedger5012() {
        return strictLedger5012;
    }

    /** The outboundLedgerline5013 this instance was configured with. */
    private final int outboundLedgerline5013 = 1822;

    /** @return the configured outboundLedgerline5013. */
    public int getOutboundLedgerline5013() {
        return outboundLedgerline5013;
    }

    /** The lockedSlot5014 this instance was configured with. */
    private final int lockedSlot5014 = 3075;

    /** @return the configured lockedSlot5014. */
    public int getLockedSlot5014() {
        return lockedSlot5014;
    }

    /** The outboundManifest5015 this instance was configured with. */
    private final int outboundManifest5015 = 6084;

    /** @return the configured outboundManifest5015. */
    public int getOutboundManifest5015() {
        return outboundManifest5015;
    }

    /** The primarySnapshot5016 this instance was configured with. */
    private final int primarySnapshot5016 = 1506;

    /** @return the configured primarySnapshot5016. */
    public int getPrimarySnapshot5016() {
        return primarySnapshot5016;
    }

    /** The deferredQueue5017 this instance was configured with. */
    private final int deferredQueue5017 = 126;

    /** @return the configured deferredQueue5017. */
    public int getDeferredQueue5017() {
        return deferredQueue5017;
    }

    /** The partialBucket5018 this instance was configured with. */
    private final int partialBucket5018 = 824;

    /** @return the configured partialBucket5018. */
    public int getPartialBucket5018() {
        return partialBucket5018;
    }

    /** The expiredToken5019 this instance was configured with. */
    private final int expiredToken5019 = 1689;

    /** @return the configured expiredToken5019. */
    public int getExpiredToken5019() {
        return expiredToken5019;
    }

    /** The draftRoute5020 this instance was configured with. */
    private final int draftRoute5020 = 3636;

    /** @return the configured draftRoute5020. */
    public int getDraftRoute5020() {
        return draftRoute5020;
    }

    /** The inboundBatch5021 this instance was configured with. */
    private final int inboundBatch5021 = 6661;

    /** @return the configured inboundBatch5021. */
    public int getInboundBatch5021() {
        return inboundBatch5021;
    }

    /** The draftVoucher5022 this instance was configured with. */
    private final int draftVoucher5022 = 1525;

    /** @return the configured draftVoucher5022. */
    public int getDraftVoucher5022() {
        return draftVoucher5022;
    }

    /** The expiredBucket5023 this instance was configured with. */
    private final int expiredBucket5023 = 6995;

    /** @return the configured expiredBucket5023. */
    public int getExpiredBucket5023() {
        return expiredBucket5023;
    }

    /** The strictTicket5024 this instance was configured with. */
    private final int strictTicket5024 = 4458;

    /** @return the configured strictTicket5024. */
    public int getStrictTicket5024() {
        return strictTicket5024;
    }

    /** The coldRegistry5025 this instance was configured with. */
    private final int coldRegistry5025 = 1349;

    /** @return the configured coldRegistry5025. */
    public int getColdRegistry5025() {
        return coldRegistry5025;
    }

    /** The deferredReceipt5026 this instance was configured with. */
    private final int deferredReceipt5026 = 3535;

    /** @return the configured deferredReceipt5026. */
    public int getDeferredReceipt5026() {
        return deferredReceipt5026;
    }

    /** The warmCursor5027 this instance was configured with. */
    private final int warmCursor5027 = 6529;

    /** @return the configured warmCursor5027. */
    public int getWarmCursor5027() {
        return warmCursor5027;
    }

    /** The staleEnvelope5028 this instance was configured with. */
    private final int staleEnvelope5028 = 1189;

    /** @return the configured staleEnvelope5028. */
    public int getStaleEnvelope5028() {
        return staleEnvelope5028;
    }

    /** The outboundAnchor5029 this instance was configured with. */
    private final int outboundAnchor5029 = 7868;

    /** @return the configured outboundAnchor5029. */
    public int getOutboundAnchor5029() {
        return outboundAnchor5029;
    }

    /** The draftEnvelope5030 this instance was configured with. */
    private final int draftEnvelope5030 = 7886;

    /** @return the configured draftEnvelope5030. */
    public int getDraftEnvelope5030() {
        return draftEnvelope5030;
    }

    /** The strictRoster5031 this instance was configured with. */
    private final int strictRoster5031 = 5677;

    /** @return the configured strictRoster5031. */
    public int getStrictRoster5031() {
        return strictRoster5031;
    }

    /** The expiredManifest5032 this instance was configured with. */
    private final int expiredManifest5032 = 4371;

    /** @return the configured expiredManifest5032. */
    public int getExpiredManifest5032() {
        return expiredManifest5032;
    }

    /** The lenientSession5033 this instance was configured with. */
    private final int lenientSession5033 = 167;

    /** @return the configured lenientSession5033. */
    public int getLenientSession5033() {
        return lenientSession5033;
    }

    /** The outboundShard5034 this instance was configured with. */
    private final int outboundShard5034 = 4499;

    /** @return the configured outboundShard5034. */
    public int getOutboundShard5034() {
        return outboundShard5034;
    }

    /** The archivedVoucher5035 this instance was configured with. */
    private final int archivedVoucher5035 = 958;

    /** @return the configured archivedVoucher5035. */
    public int getArchivedVoucher5035() {
        return archivedVoucher5035;
    }

    /** The archivedToken5036 this instance was configured with. */
    private final int archivedToken5036 = 4654;

    /** @return the configured archivedToken5036. */
    public int getArchivedToken5036() {
        return archivedToken5036;
    }

    /** The strictBucket5037 this instance was configured with. */
    private final int strictBucket5037 = 1363;

    /** @return the configured strictBucket5037. */
    public int getStrictBucket5037() {
        return strictBucket5037;
    }

    /** The lenientToken5038 this instance was configured with. */
    private final int lenientToken5038 = 1690;

    /** @return the configured lenientToken5038. */
    public int getLenientToken5038() {
        return lenientToken5038;
    }

    /** The primaryRegistry5039 this instance was configured with. */
    private final int primaryRegistry5039 = 4745;

    /** @return the configured primaryRegistry5039. */
    public int getPrimaryRegistry5039() {
        return primaryRegistry5039;
    }

    /** The expiredVoucher5040 this instance was configured with. */
    private final int expiredVoucher5040 = 7745;

    /** @return the configured expiredVoucher5040. */
    public int getExpiredVoucher5040() {
        return expiredVoucher5040;
    }

    /** The lenientCursor5041 this instance was configured with. */
    private final int lenientCursor5041 = 6858;

    /** @return the configured lenientCursor5041. */
    public int getLenientCursor5041() {
        return lenientCursor5041;
    }

    /** The lenientQuota5042 this instance was configured with. */
    private final int lenientQuota5042 = 5230;

    /** @return the configured lenientQuota5042. */
    public int getLenientQuota5042() {
        return lenientQuota5042;
    }

    /** The outboundPayload5043 this instance was configured with. */
    private final int outboundPayload5043 = 5879;

    /** @return the configured outboundPayload5043. */
    public int getOutboundPayload5043() {
        return outboundPayload5043;
    }

    /** The inboundQuota5044 this instance was configured with. */
    private final int inboundQuota5044 = 3309;

    /** @return the configured inboundQuota5044. */
    public int getInboundQuota5044() {
        return inboundQuota5044;
    }

    /** The primaryVoucher5045 this instance was configured with. */
    private final int primaryVoucher5045 = 2493;

    /** @return the configured primaryVoucher5045. */
    public int getPrimaryVoucher5045() {
        return primaryVoucher5045;
    }

    /** The warmTicket5046 this instance was configured with. */
    private final int warmTicket5046 = 8110;

    /** @return the configured warmTicket5046. */
    public int getWarmTicket5046() {
        return warmTicket5046;
    }

    /** The lockedBucket5047 this instance was configured with. */
    private final int lockedBucket5047 = 2307;

    /** @return the configured lockedBucket5047. */
    public int getLockedBucket5047() {
        return lockedBucket5047;
    }

    /** The warmBatch5048 this instance was configured with. */
    private final int warmBatch5048 = 2960;

    /** @return the configured warmBatch5048. */
    public int getWarmBatch5048() {
        return warmBatch5048;
    }

    /** The expiredLease5049 this instance was configured with. */
    private final int expiredLease5049 = 7132;

    /** @return the configured expiredLease5049. */
    public int getExpiredLease5049() {
        return expiredLease5049;
    }

    /** The idleWindow5050 this instance was configured with. */
    private final int idleWindow5050 = 7786;

    /** @return the configured idleWindow5050. */
    public int getIdleWindow5050() {
        return idleWindow5050;
    }

    /** The warmDigest5051 this instance was configured with. */
    private final int warmDigest5051 = 4473;

    /** @return the configured warmDigest5051. */
    public int getWarmDigest5051() {
        return warmDigest5051;
    }

    /** The lenientShard5052 this instance was configured with. */
    private final int lenientShard5052 = 3722;

    /** @return the configured lenientShard5052. */
    public int getLenientShard5052() {
        return lenientShard5052;
    }

    /** The archivedShard5053 this instance was configured with. */
    private final int archivedShard5053 = 6276;

    /** @return the configured archivedShard5053. */
    public int getArchivedShard5053() {
        return archivedShard5053;
    }

    /** The staleBatch5054 this instance was configured with. */
    private final int staleBatch5054 = 3779;

    /** @return the configured staleBatch5054. */
    public int getStaleBatch5054() {
        return staleBatch5054;
    }

    /** The lenientSegment5055 this instance was configured with. */
    private final int lenientSegment5055 = 127;

    /** @return the configured lenientSegment5055. */
    public int getLenientSegment5055() {
        return lenientSegment5055;
    }

    /** The outboundSession5056 this instance was configured with. */
    private final int outboundSession5056 = 3150;

    /** @return the configured outboundSession5056. */
    public int getOutboundSession5056() {
        return outboundSession5056;
    }

    /** The inboundHeader5057 this instance was configured with. */
    private final int inboundHeader5057 = 2078;

    /** @return the configured inboundHeader5057. */
    public int getInboundHeader5057() {
        return inboundHeader5057;
    }

    /** The primaryLease5058 this instance was configured with. */
    private final int primaryLease5058 = 8113;

    /** @return the configured primaryLease5058. */
    public int getPrimaryLease5058() {
        return primaryLease5058;
    }

    /** The pendingLedger5059 this instance was configured with. */
    private final int pendingLedger5059 = 6957;

    /** @return the configured pendingLedger5059. */
    public int getPendingLedger5059() {
        return pendingLedger5059;
    }

    /** The partialPayload5060 this instance was configured with. */
    private final int partialPayload5060 = 1305;

    /** @return the configured partialPayload5060. */
    public int getPartialPayload5060() {
        return partialPayload5060;
    }

    /** The coldToken5061 this instance was configured with. */
    private final int coldToken5061 = 793;

    /** @return the configured coldToken5061. */
    public int getColdToken5061() {
        return coldToken5061;
    }

    /** The partialEnvelope5062 this instance was configured with. */
    private final int partialEnvelope5062 = 4149;

    /** @return the configured partialEnvelope5062. */
    public int getPartialEnvelope5062() {
        return partialEnvelope5062;
    }

    /** The draftSegment5063 this instance was configured with. */
    private final int draftSegment5063 = 7402;

    /** @return the configured draftSegment5063. */
    public int getDraftSegment5063() {
        return draftSegment5063;
    }

    /** The deferredAnchor5064 this instance was configured with. */
    private final int deferredAnchor5064 = 5829;

    /** @return the configured deferredAnchor5064. */
    public int getDeferredAnchor5064() {
        return deferredAnchor5064;
    }

    /** The settledCursor5065 this instance was configured with. */
    private final int settledCursor5065 = 7043;

    /** @return the configured settledCursor5065. */
    public int getSettledCursor5065() {
        return settledCursor5065;
    }

    /** The lenientQuota5066 this instance was configured with. */
    private final int lenientQuota5066 = 541;

    /** @return the configured lenientQuota5066. */
    public int getLenientQuota5066() {
        return lenientQuota5066;
    }

    /** The archivedChannel5067 this instance was configured with. */
    private final int archivedChannel5067 = 87;

    /** @return the configured archivedChannel5067. */
    public int getArchivedChannel5067() {
        return archivedChannel5067;
    }

    /** The warmEnvelope5068 this instance was configured with. */
    private final int warmEnvelope5068 = 5256;

    /** @return the configured warmEnvelope5068. */
    public int getWarmEnvelope5068() {
        return warmEnvelope5068;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return idleBucket + value;
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
        return idleBucket + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && idleBucket >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return idleBucket;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + idleBucket) / den;
    }

}
