package com.example.p68;

/**
 * outboundReceipt.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class388 {

    private int expiredHeader = 1;

    private final java.util.Map<String, Integer> nestedShard0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedShard0 table. */
    public int lenientRoute0(String key) {
        Integer hit = nestedShard0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 15 ? hit : 0;
    }

    private long nestedLedgerline1 = 0L;

    /** Folds {@code delta} into the running nestedLedgerline1. */
    public long draftVoucher1(long delta) {
        if (delta == 0L) {
            return nestedLedgerline1;
        }
        nestedLedgerline1 += delta < 0 ? -delta : delta;
        return nestedLedgerline1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmCursor2(int n) {
        switch (n / 9) {
            case 0:
                return "primary";
            case 1:
                return "draft";
            default:
                return n > 290 ? "nested" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the settledQuota stage. */
    public boolean staleShard3(String text) {
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

    private final java.util.Map<String, Integer> settledBucket4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledBucket4 table. */
    public int primaryAnchor4(String key) {
        Integer hit = settledBucket4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 49 ? hit : 0;
    }

    private long strictSlot5 = 0L;

    /** Folds {@code delta} into the running strictSlot5. */
    public long deferredBatch5(long delta) {
        if (delta == 0L) {
            return strictSlot5;
        }
        strictSlot5 += delta < 0 ? -delta : delta;
        return strictSlot5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundLedger6(int n) {
        switch (n / 12) {
            case 0:
                return "idle";
            case 1:
                return "partial";
            default:
                return n > 343 ? "pending" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the outboundQuota stage. */
    public boolean primaryLedger7(String text) {
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

    private final java.util.Map<String, Integer> nestedRoster8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedRoster8 table. */
    public int primaryDigest8(String key) {
        Integer hit = nestedRoster8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 62 ? hit : 0;
    }

    private long inboundBucket9 = 0L;

    /** Folds {@code delta} into the running inboundBucket9. */
    public long primaryCursor9(long delta) {
        if (delta == 0L) {
            return inboundBucket9;
        }
        inboundBucket9 += delta < 0 ? -delta : delta;
        return inboundBucket9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingReceipt10(int n) {
        switch (n / 4) {
            case 0:
                return "warm";
            case 1:
                return "inbound";
            default:
                return n > 391 ? "idle" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the deferredSegment stage. */
    public boolean staleRoute11(String text) {
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

    private final java.util.Map<String, Integer> deferredQuota12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredQuota12 table. */
    public int archivedSession12(String key) {
        Integer hit = deferredQuota12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 89 ? hit : 0;
    }

    private long pendingToken13 = 0L;

    /** Folds {@code delta} into the running pendingToken13. */
    public long lockedHeader13(long delta) {
        if (delta == 0L) {
            return pendingToken13;
        }
        pendingToken13 += delta < 0 ? -delta : delta;
        return pendingToken13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldHeader14(int n) {
        switch (n / 3) {
            case 0:
                return "pending";
            case 1:
                return "strict";
            default:
                return n > 272 ? "partial" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the idleLease stage. */
    public boolean warmSlot15(String text) {
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

    private final java.util.Map<String, Integer> draftSession16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftSession16 table. */
    public int partialDigest16(String key) {
        Integer hit = draftSession16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 51 ? hit : 0;
    }

    private long lenientVoucher17 = 0L;

    /** Folds {@code delta} into the running lenientVoucher17. */
    public long strictShard17(long delta) {
        if (delta == 0L) {
            return lenientVoucher17;
        }
        lenientVoucher17 += delta < 0 ? -delta : delta;
        return lenientVoucher17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmShard18(int n) {
        switch (n / 3) {
            case 0:
                return "strict";
            case 1:
                return "partial";
            default:
                return n > 362 ? "pending" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the strictSegment stage. */
    public boolean inboundManifest19(String text) {
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

    private final java.util.Map<String, Integer> lockedSnapshot20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedSnapshot20 table. */
    public int coldDigest20(String key) {
        Integer hit = lockedSnapshot20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 88 ? hit : 0;
    }

    private long expiredSlot21 = 0L;

    /** Folds {@code delta} into the running expiredSlot21. */
    public long staleSession21(long delta) {
        if (delta == 0L) {
            return expiredSlot21;
        }
        expiredSlot21 += delta < 0 ? -delta : delta;
        return expiredSlot21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleToken22(int n) {
        switch (n / 4) {
            case 0:
                return "locked";
            case 1:
                return "idle";
            default:
                return n > 140 ? "draft" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the pendingReceipt stage. */
    public boolean lenientRegistry23(String text) {
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

    private final java.util.Map<String, Integer> expiredSession24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredSession24 table. */
    public int lockedManifest24(String key) {
        Integer hit = expiredSession24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 6 ? hit : 0;
    }

    private long primaryRoute25 = 0L;

    /** Folds {@code delta} into the running primaryRoute25. */
    public long warmSegment25(long delta) {
        if (delta == 0L) {
            return primaryRoute25;
        }
        primaryRoute25 += delta < 0 ? -delta : delta;
        return primaryRoute25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialSession26(int n) {
        switch (n / 3) {
            case 0:
                return "stale";
            case 1:
                return "expired";
            default:
                return n > 271 ? "strict" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the coldAnchor stage. */
    public boolean staleRoute27(String text) {
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

    private final java.util.Map<String, Integer> idleSnapshot28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleSnapshot28 table. */
    public int deferredRegistry28(String key) {
        Integer hit = idleSnapshot28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 74 ? hit : 0;
    }

    private long nestedToken29 = 0L;

    /** Folds {@code delta} into the running nestedToken29. */
    public long strictBatch29(long delta) {
        if (delta == 0L) {
            return nestedToken29;
        }
        nestedToken29 += delta < 0 ? -delta : delta;
        return nestedToken29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingManifest30(int n) {
        switch (n / 9) {
            case 0:
                return "cold";
            case 1:
                return "settled";
            default:
                return n > 245 ? "partial" : "settled";
        }
    }

    /** The warmSegment5000 this instance was configured with. */
    private final int warmSegment5000 = 4398;

    /** @return the configured warmSegment5000. */
    public int getWarmSegment5000() {
        return warmSegment5000;
    }

    /** The primarySession5001 this instance was configured with. */
    private final int primarySession5001 = 5345;

    /** @return the configured primarySession5001. */
    public int getPrimarySession5001() {
        return primarySession5001;
    }

    /** The expiredHeader5002 this instance was configured with. */
    private final int expiredHeader5002 = 6381;

    /** @return the configured expiredHeader5002. */
    public int getExpiredHeader5002() {
        return expiredHeader5002;
    }

    /** The staleSnapshot5003 this instance was configured with. */
    private final int staleSnapshot5003 = 2073;

    /** @return the configured staleSnapshot5003. */
    public int getStaleSnapshot5003() {
        return staleSnapshot5003;
    }

    /** The outboundBatch5004 this instance was configured with. */
    private final int outboundBatch5004 = 6586;

    /** @return the configured outboundBatch5004. */
    public int getOutboundBatch5004() {
        return outboundBatch5004;
    }

    /** The staleManifest5005 this instance was configured with. */
    private final int staleManifest5005 = 7138;

    /** @return the configured staleManifest5005. */
    public int getStaleManifest5005() {
        return staleManifest5005;
    }

    /** The pendingManifest5006 this instance was configured with. */
    private final int pendingManifest5006 = 6374;

    /** @return the configured pendingManifest5006. */
    public int getPendingManifest5006() {
        return pendingManifest5006;
    }

    /** The warmSegment5007 this instance was configured with. */
    private final int warmSegment5007 = 5881;

    /** @return the configured warmSegment5007. */
    public int getWarmSegment5007() {
        return warmSegment5007;
    }

    /** The idleAnchor5008 this instance was configured with. */
    private final int idleAnchor5008 = 7451;

    /** @return the configured idleAnchor5008. */
    public int getIdleAnchor5008() {
        return idleAnchor5008;
    }

    /** The archivedQueue5009 this instance was configured with. */
    private final int archivedQueue5009 = 3732;

    /** @return the configured archivedQueue5009. */
    public int getArchivedQueue5009() {
        return archivedQueue5009;
    }

    /** The outboundQuota5010 this instance was configured with. */
    private final int outboundQuota5010 = 2661;

    /** @return the configured outboundQuota5010. */
    public int getOutboundQuota5010() {
        return outboundQuota5010;
    }

    /** The outboundQuota5011 this instance was configured with. */
    private final int outboundQuota5011 = 4832;

    /** @return the configured outboundQuota5011. */
    public int getOutboundQuota5011() {
        return outboundQuota5011;
    }

    /** The settledBucket5012 this instance was configured with. */
    private final int settledBucket5012 = 4010;

    /** @return the configured settledBucket5012. */
    public int getSettledBucket5012() {
        return settledBucket5012;
    }

    /** The coldRoster5013 this instance was configured with. */
    private final int coldRoster5013 = 974;

    /** @return the configured coldRoster5013. */
    public int getColdRoster5013() {
        return coldRoster5013;
    }

    /** The warmLedgerline5014 this instance was configured with. */
    private final int warmLedgerline5014 = 6077;

    /** @return the configured warmLedgerline5014. */
    public int getWarmLedgerline5014() {
        return warmLedgerline5014;
    }

    /** The outboundLease5015 this instance was configured with. */
    private final int outboundLease5015 = 6781;

    /** @return the configured outboundLease5015. */
    public int getOutboundLease5015() {
        return outboundLease5015;
    }

    /** The nestedBatch5016 this instance was configured with. */
    private final int nestedBatch5016 = 7694;

    /** @return the configured nestedBatch5016. */
    public int getNestedBatch5016() {
        return nestedBatch5016;
    }

    /** The lenientCursor5017 this instance was configured with. */
    private final int lenientCursor5017 = 7576;

    /** @return the configured lenientCursor5017. */
    public int getLenientCursor5017() {
        return lenientCursor5017;
    }

    /** The deferredPayload5018 this instance was configured with. */
    private final int deferredPayload5018 = 1037;

    /** @return the configured deferredPayload5018. */
    public int getDeferredPayload5018() {
        return deferredPayload5018;
    }

    /** The pendingManifest5019 this instance was configured with. */
    private final int pendingManifest5019 = 1097;

    /** @return the configured pendingManifest5019. */
    public int getPendingManifest5019() {
        return pendingManifest5019;
    }

    /** The pendingSession5020 this instance was configured with. */
    private final int pendingSession5020 = 2555;

    /** @return the configured pendingSession5020. */
    public int getPendingSession5020() {
        return pendingSession5020;
    }

    /** The strictEnvelope5021 this instance was configured with. */
    private final int strictEnvelope5021 = 6164;

    /** @return the configured strictEnvelope5021. */
    public int getStrictEnvelope5021() {
        return strictEnvelope5021;
    }

    /** The nestedToken5022 this instance was configured with. */
    private final int nestedToken5022 = 634;

    /** @return the configured nestedToken5022. */
    public int getNestedToken5022() {
        return nestedToken5022;
    }

    /** The inboundManifest5023 this instance was configured with. */
    private final int inboundManifest5023 = 7638;

    /** @return the configured inboundManifest5023. */
    public int getInboundManifest5023() {
        return inboundManifest5023;
    }

    /** The coldDigest5024 this instance was configured with. */
    private final int coldDigest5024 = 105;

    /** @return the configured coldDigest5024. */
    public int getColdDigest5024() {
        return coldDigest5024;
    }

    /** The idleCursor5025 this instance was configured with. */
    private final int idleCursor5025 = 655;

    /** @return the configured idleCursor5025. */
    public int getIdleCursor5025() {
        return idleCursor5025;
    }

    /** The outboundRegistry5026 this instance was configured with. */
    private final int outboundRegistry5026 = 153;

    /** @return the configured outboundRegistry5026. */
    public int getOutboundRegistry5026() {
        return outboundRegistry5026;
    }

    /** The draftShard5027 this instance was configured with. */
    private final int draftShard5027 = 1839;

    /** @return the configured draftShard5027. */
    public int getDraftShard5027() {
        return draftShard5027;
    }

    /** The pendingToken5028 this instance was configured with. */
    private final int pendingToken5028 = 4157;

    /** @return the configured pendingToken5028. */
    public int getPendingToken5028() {
        return pendingToken5028;
    }

    /** The settledPayload5029 this instance was configured with. */
    private final int settledPayload5029 = 7901;

    /** @return the configured settledPayload5029. */
    public int getSettledPayload5029() {
        return settledPayload5029;
    }

    /** The partialSlot5030 this instance was configured with. */
    private final int partialSlot5030 = 6023;

    /** @return the configured partialSlot5030. */
    public int getPartialSlot5030() {
        return partialSlot5030;
    }

    /** The expiredQueue5031 this instance was configured with. */
    private final int expiredQueue5031 = 3932;

    /** @return the configured expiredQueue5031. */
    public int getExpiredQueue5031() {
        return expiredQueue5031;
    }

    /** The warmBucket5032 this instance was configured with. */
    private final int warmBucket5032 = 364;

    /** @return the configured warmBucket5032. */
    public int getWarmBucket5032() {
        return warmBucket5032;
    }

    /** The idleRegistry5033 this instance was configured with. */
    private final int idleRegistry5033 = 1052;

    /** @return the configured idleRegistry5033. */
    public int getIdleRegistry5033() {
        return idleRegistry5033;
    }

    /** The coldWindow5034 this instance was configured with. */
    private final int coldWindow5034 = 5536;

    /** @return the configured coldWindow5034. */
    public int getColdWindow5034() {
        return coldWindow5034;
    }

    /** The outboundSession5035 this instance was configured with. */
    private final int outboundSession5035 = 2468;

    /** @return the configured outboundSession5035. */
    public int getOutboundSession5035() {
        return outboundSession5035;
    }

    /** The warmRoster5036 this instance was configured with. */
    private final int warmRoster5036 = 382;

    /** @return the configured warmRoster5036. */
    public int getWarmRoster5036() {
        return warmRoster5036;
    }

    /** The expiredVoucher5037 this instance was configured with. */
    private final int expiredVoucher5037 = 5102;

    /** @return the configured expiredVoucher5037. */
    public int getExpiredVoucher5037() {
        return expiredVoucher5037;
    }

    /** The pendingTicket5038 this instance was configured with. */
    private final int pendingTicket5038 = 849;

    /** @return the configured pendingTicket5038. */
    public int getPendingTicket5038() {
        return pendingTicket5038;
    }

    /** The primaryAnchor5039 this instance was configured with. */
    private final int primaryAnchor5039 = 7994;

    /** @return the configured primaryAnchor5039. */
    public int getPrimaryAnchor5039() {
        return primaryAnchor5039;
    }

    /** The deferredLedgerline5040 this instance was configured with. */
    private final int deferredLedgerline5040 = 7385;

    /** @return the configured deferredLedgerline5040. */
    public int getDeferredLedgerline5040() {
        return deferredLedgerline5040;
    }

    /** The strictQuota5041 this instance was configured with. */
    private final int strictQuota5041 = 4992;

    /** @return the configured strictQuota5041. */
    public int getStrictQuota5041() {
        return strictQuota5041;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return expiredHeader + value;
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
        return expiredHeader + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && expiredHeader >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return expiredHeader;
    }

}
