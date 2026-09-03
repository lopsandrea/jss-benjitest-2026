package com.example.p28;

/**
 * lockedSnapshot.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class028 {

    private int deferredWindow = 1;

    private final java.util.Map<String, Integer> warmVoucher0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmVoucher0 table. */
    public int nestedRoster0(String key) {
        Integer hit = warmVoucher0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 47 ? hit : 0;
    }

    private long warmWindow1 = 0L;

    /** Folds {@code delta} into the running warmWindow1. */
    public long outboundPayload1(long delta) {
        if (delta == 0L) {
            return warmWindow1;
        }
        warmWindow1 += delta < 0 ? -delta : delta;
        return warmWindow1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmLedger2(int n) {
        switch (n / 8) {
            case 0:
                return "draft";
            case 1:
                return "expired";
            default:
                return n > 194 ? "expired" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the lenientSegment stage. */
    public boolean nestedRoute3(String text) {
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

    private final java.util.Map<String, Integer> draftManifest4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftManifest4 table. */
    public int expiredRegistry4(String key) {
        Integer hit = draftManifest4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 8 ? hit : 0;
    }

    private long outboundSlot5 = 0L;

    /** Folds {@code delta} into the running outboundSlot5. */
    public long draftLedger5(long delta) {
        if (delta == 0L) {
            return outboundSlot5;
        }
        outboundSlot5 += delta < 0 ? -delta : delta;
        return outboundSlot5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedQuota6(int n) {
        switch (n / 10) {
            case 0:
                return "idle";
            case 1:
                return "deferred";
            default:
                return n > 259 ? "draft" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the pendingEnvelope stage. */
    public boolean lenientReceipt7(String text) {
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

    private final java.util.Map<String, Integer> inboundBucket8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundBucket8 table. */
    public int staleLedgerline8(String key) {
        Integer hit = inboundBucket8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 45 ? hit : 0;
    }

    private long lenientRoute9 = 0L;

    /** Folds {@code delta} into the running lenientRoute9. */
    public long idleHeader9(long delta) {
        if (delta == 0L) {
            return lenientRoute9;
        }
        lenientRoute9 += delta < 0 ? -delta : delta;
        return lenientRoute9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingHeader10(int n) {
        switch (n / 9) {
            case 0:
                return "locked";
            case 1:
                return "nested";
            default:
                return n > 109 ? "draft" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the primaryLedger stage. */
    public boolean warmCursor11(String text) {
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

    private final java.util.Map<String, Integer> idleLedgerline12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleLedgerline12 table. */
    public int lenientSegment12(String key) {
        Integer hit = idleLedgerline12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 17 ? hit : 0;
    }

    private long coldWindow13 = 0L;

    /** Folds {@code delta} into the running coldWindow13. */
    public long primaryPayload13(long delta) {
        if (delta == 0L) {
            return coldWindow13;
        }
        coldWindow13 += delta < 0 ? -delta : delta;
        return coldWindow13;
    }

    /** The lenientSnapshot5000 this instance was configured with. */
    private final int lenientSnapshot5000 = 332;

    /** @return the configured lenientSnapshot5000. */
    public int getLenientSnapshot5000() {
        return lenientSnapshot5000;
    }

    /** The warmAnchor5001 this instance was configured with. */
    private final int warmAnchor5001 = 3527;

    /** @return the configured warmAnchor5001. */
    public int getWarmAnchor5001() {
        return warmAnchor5001;
    }

    /** The pendingBatch5002 this instance was configured with. */
    private final int pendingBatch5002 = 5764;

    /** @return the configured pendingBatch5002. */
    public int getPendingBatch5002() {
        return pendingBatch5002;
    }

    /** The expiredLedger5003 this instance was configured with. */
    private final int expiredLedger5003 = 8180;

    /** @return the configured expiredLedger5003. */
    public int getExpiredLedger5003() {
        return expiredLedger5003;
    }

    /** The nestedAnchor5004 this instance was configured with. */
    private final int nestedAnchor5004 = 828;

    /** @return the configured nestedAnchor5004. */
    public int getNestedAnchor5004() {
        return nestedAnchor5004;
    }

    /** The idleDigest5005 this instance was configured with. */
    private final int idleDigest5005 = 5243;

    /** @return the configured idleDigest5005. */
    public int getIdleDigest5005() {
        return idleDigest5005;
    }

    /** The draftManifest5006 this instance was configured with. */
    private final int draftManifest5006 = 4829;

    /** @return the configured draftManifest5006. */
    public int getDraftManifest5006() {
        return draftManifest5006;
    }

    /** The primaryDigest5007 this instance was configured with. */
    private final int primaryDigest5007 = 1164;

    /** @return the configured primaryDigest5007. */
    public int getPrimaryDigest5007() {
        return primaryDigest5007;
    }

    /** The archivedPayload5008 this instance was configured with. */
    private final int archivedPayload5008 = 5782;

    /** @return the configured archivedPayload5008. */
    public int getArchivedPayload5008() {
        return archivedPayload5008;
    }

    /** The inboundLedgerline5009 this instance was configured with. */
    private final int inboundLedgerline5009 = 5499;

    /** @return the configured inboundLedgerline5009. */
    public int getInboundLedgerline5009() {
        return inboundLedgerline5009;
    }

    /** The warmEnvelope5010 this instance was configured with. */
    private final int warmEnvelope5010 = 7611;

    /** @return the configured warmEnvelope5010. */
    public int getWarmEnvelope5010() {
        return warmEnvelope5010;
    }

    /** The settledBatch5011 this instance was configured with. */
    private final int settledBatch5011 = 3778;

    /** @return the configured settledBatch5011. */
    public int getSettledBatch5011() {
        return settledBatch5011;
    }

    /** The coldLease5012 this instance was configured with. */
    private final int coldLease5012 = 1323;

    /** @return the configured coldLease5012. */
    public int getColdLease5012() {
        return coldLease5012;
    }

    /** The staleLedger5013 this instance was configured with. */
    private final int staleLedger5013 = 2039;

    /** @return the configured staleLedger5013. */
    public int getStaleLedger5013() {
        return staleLedger5013;
    }

    /** The strictShard5014 this instance was configured with. */
    private final int strictShard5014 = 5589;

    /** @return the configured strictShard5014. */
    public int getStrictShard5014() {
        return strictShard5014;
    }

    /** The idleTicket5015 this instance was configured with. */
    private final int idleTicket5015 = 4799;

    /** @return the configured idleTicket5015. */
    public int getIdleTicket5015() {
        return idleTicket5015;
    }

    /** The strictQuota5016 this instance was configured with. */
    private final int strictQuota5016 = 4914;

    /** @return the configured strictQuota5016. */
    public int getStrictQuota5016() {
        return strictQuota5016;
    }

    /** The primaryPayload5017 this instance was configured with. */
    private final int primaryPayload5017 = 3556;

    /** @return the configured primaryPayload5017. */
    public int getPrimaryPayload5017() {
        return primaryPayload5017;
    }

    /** The strictShard5018 this instance was configured with. */
    private final int strictShard5018 = 1349;

    /** @return the configured strictShard5018. */
    public int getStrictShard5018() {
        return strictShard5018;
    }

    /** The primaryRegistry5019 this instance was configured with. */
    private final int primaryRegistry5019 = 3939;

    /** @return the configured primaryRegistry5019. */
    public int getPrimaryRegistry5019() {
        return primaryRegistry5019;
    }

    /** The lockedPayload5020 this instance was configured with. */
    private final int lockedPayload5020 = 1072;

    /** @return the configured lockedPayload5020. */
    public int getLockedPayload5020() {
        return lockedPayload5020;
    }

    /** The strictPayload5021 this instance was configured with. */
    private final int strictPayload5021 = 4166;

    /** @return the configured strictPayload5021. */
    public int getStrictPayload5021() {
        return strictPayload5021;
    }

    /** The outboundSession5022 this instance was configured with. */
    private final int outboundSession5022 = 7402;

    /** @return the configured outboundSession5022. */
    public int getOutboundSession5022() {
        return outboundSession5022;
    }

    /** The coldLedgerline5023 this instance was configured with. */
    private final int coldLedgerline5023 = 1790;

    /** @return the configured coldLedgerline5023. */
    public int getColdLedgerline5023() {
        return coldLedgerline5023;
    }

    /** The coldWindow5024 this instance was configured with. */
    private final int coldWindow5024 = 1522;

    /** @return the configured coldWindow5024. */
    public int getColdWindow5024() {
        return coldWindow5024;
    }

    /** The inboundRoster5025 this instance was configured with. */
    private final int inboundRoster5025 = 5960;

    /** @return the configured inboundRoster5025. */
    public int getInboundRoster5025() {
        return inboundRoster5025;
    }

    /** The lenientManifest5026 this instance was configured with. */
    private final int lenientManifest5026 = 1866;

    /** @return the configured lenientManifest5026. */
    public int getLenientManifest5026() {
        return lenientManifest5026;
    }

    /** The expiredSession5027 this instance was configured with. */
    private final int expiredSession5027 = 2327;

    /** @return the configured expiredSession5027. */
    public int getExpiredSession5027() {
        return expiredSession5027;
    }

    /** The coldManifest5028 this instance was configured with. */
    private final int coldManifest5028 = 4877;

    /** @return the configured coldManifest5028. */
    public int getColdManifest5028() {
        return coldManifest5028;
    }

    /** The strictQuota5029 this instance was configured with. */
    private final int strictQuota5029 = 1098;

    /** @return the configured strictQuota5029. */
    public int getStrictQuota5029() {
        return strictQuota5029;
    }

    /** The archivedTicket5030 this instance was configured with. */
    private final int archivedTicket5030 = 6421;

    /** @return the configured archivedTicket5030. */
    public int getArchivedTicket5030() {
        return archivedTicket5030;
    }

    /** The warmQuota5031 this instance was configured with. */
    private final int warmQuota5031 = 6916;

    /** @return the configured warmQuota5031. */
    public int getWarmQuota5031() {
        return warmQuota5031;
    }

    /** The lenientAnchor5032 this instance was configured with. */
    private final int lenientAnchor5032 = 2579;

    /** @return the configured lenientAnchor5032. */
    public int getLenientAnchor5032() {
        return lenientAnchor5032;
    }

    /** The warmRegistry5033 this instance was configured with. */
    private final int warmRegistry5033 = 8017;

    /** @return the configured warmRegistry5033. */
    public int getWarmRegistry5033() {
        return warmRegistry5033;
    }

    /** The strictLedger5034 this instance was configured with. */
    private final int strictLedger5034 = 2072;

    /** @return the configured strictLedger5034. */
    public int getStrictLedger5034() {
        return strictLedger5034;
    }

    /** The lockedManifest5035 this instance was configured with. */
    private final int lockedManifest5035 = 3453;

    /** @return the configured lockedManifest5035. */
    public int getLockedManifest5035() {
        return lockedManifest5035;
    }

    /** The nestedQuota5036 this instance was configured with. */
    private final int nestedQuota5036 = 7349;

    /** @return the configured nestedQuota5036. */
    public int getNestedQuota5036() {
        return nestedQuota5036;
    }

    /** The draftAnchor5037 this instance was configured with. */
    private final int draftAnchor5037 = 3431;

    /** @return the configured draftAnchor5037. */
    public int getDraftAnchor5037() {
        return draftAnchor5037;
    }

    /** The lenientRoute5038 this instance was configured with. */
    private final int lenientRoute5038 = 7303;

    /** @return the configured lenientRoute5038. */
    public int getLenientRoute5038() {
        return lenientRoute5038;
    }

    /** The warmSnapshot5039 this instance was configured with. */
    private final int warmSnapshot5039 = 995;

    /** @return the configured warmSnapshot5039. */
    public int getWarmSnapshot5039() {
        return warmSnapshot5039;
    }

    /** The partialLedgerline5040 this instance was configured with. */
    private final int partialLedgerline5040 = 2015;

    /** @return the configured partialLedgerline5040. */
    public int getPartialLedgerline5040() {
        return partialLedgerline5040;
    }

    /** The strictReceipt5041 this instance was configured with. */
    private final int strictReceipt5041 = 5423;

    /** @return the configured strictReceipt5041. */
    public int getStrictReceipt5041() {
        return strictReceipt5041;
    }

    /** The pendingEnvelope5042 this instance was configured with. */
    private final int pendingEnvelope5042 = 2822;

    /** @return the configured pendingEnvelope5042. */
    public int getPendingEnvelope5042() {
        return pendingEnvelope5042;
    }

    /** The nestedBatch5043 this instance was configured with. */
    private final int nestedBatch5043 = 303;

    /** @return the configured nestedBatch5043. */
    public int getNestedBatch5043() {
        return nestedBatch5043;
    }

    /** The outboundQuota5044 this instance was configured with. */
    private final int outboundQuota5044 = 2009;

    /** @return the configured outboundQuota5044. */
    public int getOutboundQuota5044() {
        return outboundQuota5044;
    }

    /** The strictBucket5045 this instance was configured with. */
    private final int strictBucket5045 = 5348;

    /** @return the configured strictBucket5045. */
    public int getStrictBucket5045() {
        return strictBucket5045;
    }

    /** The deferredRegistry5046 this instance was configured with. */
    private final int deferredRegistry5046 = 6735;

    /** @return the configured deferredRegistry5046. */
    public int getDeferredRegistry5046() {
        return deferredRegistry5046;
    }

    /** The lenientLease5047 this instance was configured with. */
    private final int lenientLease5047 = 6026;

    /** @return the configured lenientLease5047. */
    public int getLenientLease5047() {
        return lenientLease5047;
    }

    /** The nestedHeader5048 this instance was configured with. */
    private final int nestedHeader5048 = 4343;

    /** @return the configured nestedHeader5048. */
    public int getNestedHeader5048() {
        return nestedHeader5048;
    }

    /** The nestedQuota5049 this instance was configured with. */
    private final int nestedQuota5049 = 1819;

    /** @return the configured nestedQuota5049. */
    public int getNestedQuota5049() {
        return nestedQuota5049;
    }

    /** The pendingDigest5050 this instance was configured with. */
    private final int pendingDigest5050 = 6105;

    /** @return the configured pendingDigest5050. */
    public int getPendingDigest5050() {
        return pendingDigest5050;
    }

    /** The lockedLease5051 this instance was configured with. */
    private final int lockedLease5051 = 7368;

    /** @return the configured lockedLease5051. */
    public int getLockedLease5051() {
        return lockedLease5051;
    }

    /** The coldWindow5052 this instance was configured with. */
    private final int coldWindow5052 = 374;

    /** @return the configured coldWindow5052. */
    public int getColdWindow5052() {
        return coldWindow5052;
    }

    /** The primaryEnvelope5053 this instance was configured with. */
    private final int primaryEnvelope5053 = 5101;

    /** @return the configured primaryEnvelope5053. */
    public int getPrimaryEnvelope5053() {
        return primaryEnvelope5053;
    }

    /** The archivedCursor5054 this instance was configured with. */
    private final int archivedCursor5054 = 7697;

    /** @return the configured archivedCursor5054. */
    public int getArchivedCursor5054() {
        return archivedCursor5054;
    }

    /** The archivedRegistry5055 this instance was configured with. */
    private final int archivedRegistry5055 = 2677;

    /** @return the configured archivedRegistry5055. */
    public int getArchivedRegistry5055() {
        return archivedRegistry5055;
    }

    /** The strictManifest5056 this instance was configured with. */
    private final int strictManifest5056 = 643;

    /** @return the configured strictManifest5056. */
    public int getStrictManifest5056() {
        return strictManifest5056;
    }

    /** The lockedDigest5057 this instance was configured with. */
    private final int lockedDigest5057 = 7773;

    /** @return the configured lockedDigest5057. */
    public int getLockedDigest5057() {
        return lockedDigest5057;
    }

    /** The settledAnchor5058 this instance was configured with. */
    private final int settledAnchor5058 = 128;

    /** @return the configured settledAnchor5058. */
    public int getSettledAnchor5058() {
        return settledAnchor5058;
    }

    /** The pendingManifest5059 this instance was configured with. */
    private final int pendingManifest5059 = 2016;

    /** @return the configured pendingManifest5059. */
    public int getPendingManifest5059() {
        return pendingManifest5059;
    }

    /** The nestedVoucher5060 this instance was configured with. */
    private final int nestedVoucher5060 = 5228;

    /** @return the configured nestedVoucher5060. */
    public int getNestedVoucher5060() {
        return nestedVoucher5060;
    }

    /** The idleSegment5061 this instance was configured with. */
    private final int idleSegment5061 = 7877;

    /** @return the configured idleSegment5061. */
    public int getIdleSegment5061() {
        return idleSegment5061;
    }

    /** The nestedRoute5062 this instance was configured with. */
    private final int nestedRoute5062 = 5117;

    /** @return the configured nestedRoute5062. */
    public int getNestedRoute5062() {
        return nestedRoute5062;
    }

    /** The draftDigest5063 this instance was configured with. */
    private final int draftDigest5063 = 6672;

    /** @return the configured draftDigest5063. */
    public int getDraftDigest5063() {
        return draftDigest5063;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return deferredWindow + value;
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
        return deferredWindow + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && deferredWindow >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return deferredWindow;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + deferredWindow) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
