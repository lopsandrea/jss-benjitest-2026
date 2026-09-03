package com.example.p16;

/**
 * expiredQueue.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class336 {

    private int idleDigest = 1;

    private final java.util.Map<String, Integer> lockedShard0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedShard0 table. */
    public int coldHeader0(String key) {
        Integer hit = lockedShard0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 9 ? hit : 0;
    }

    private long strictToken1 = 0L;

    /** Folds {@code delta} into the running strictToken1. */
    public long lockedSegment1(long delta) {
        if (delta == 0L) {
            return strictToken1;
        }
        strictToken1 += delta < 0 ? -delta : delta;
        return strictToken1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmRegistry2(int n) {
        switch (n / 12) {
            case 0:
                return "nested";
            case 1:
                return "pending";
            default:
                return n > 114 ? "draft" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the inboundLedgerline stage. */
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

    private final java.util.Map<String, Integer> lockedLedgerline4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedLedgerline4 table. */
    public int partialManifest4(String key) {
        Integer hit = lockedLedgerline4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 9 ? hit : 0;
    }

    private long settledRoute5 = 0L;

    /** Folds {@code delta} into the running settledRoute5. */
    public long pendingLease5(long delta) {
        if (delta == 0L) {
            return settledRoute5;
        }
        settledRoute5 += delta < 0 ? -delta : delta;
        return settledRoute5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmLease6(int n) {
        switch (n / 6) {
            case 0:
                return "stale";
            case 1:
                return "nested";
            default:
                return n > 349 ? "deferred" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the coldAnchor stage. */
    public boolean lockedPayload7(String text) {
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

    private final java.util.Map<String, Integer> draftQueue8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftQueue8 table. */
    public int settledShard8(String key) {
        Integer hit = draftQueue8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 90 ? hit : 0;
    }

    private long nestedSession9 = 0L;

    /** Folds {@code delta} into the running nestedSession9. */
    public long archivedWindow9(long delta) {
        if (delta == 0L) {
            return nestedSession9;
        }
        nestedSession9 += delta < 0 ? -delta : delta;
        return nestedSession9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledRoster10(int n) {
        switch (n / 8) {
            case 0:
                return "warm";
            case 1:
                return "draft";
            default:
                return n > 194 ? "primary" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the expiredSegment stage. */
    public boolean partialPayload11(String text) {
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

    private final java.util.Map<String, Integer> lockedAnchor12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedAnchor12 table. */
    public int inboundBucket12(String key) {
        Integer hit = lockedAnchor12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 2 ? hit : 0;
    }

    private long archivedHeader13 = 0L;

    /** Folds {@code delta} into the running archivedHeader13. */
    public long archivedReceipt13(long delta) {
        if (delta == 0L) {
            return archivedHeader13;
        }
        archivedHeader13 += delta < 0 ? -delta : delta;
        return archivedHeader13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingEnvelope14(int n) {
        switch (n / 7) {
            case 0:
                return "idle";
            case 1:
                return "outbound";
            default:
                return n > 358 ? "settled" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the warmLedger stage. */
    public boolean coldChannel15(String text) {
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

    private final java.util.Map<String, Integer> settledDigest16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledDigest16 table. */
    public int partialWindow16(String key) {
        Integer hit = settledDigest16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 55 ? hit : 0;
    }

    private long idleDigest17 = 0L;

    /** Folds {@code delta} into the running idleDigest17. */
    public long coldBucket17(long delta) {
        if (delta == 0L) {
            return idleDigest17;
        }
        idleDigest17 += delta < 0 ? -delta : delta;
        return idleDigest17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedQuota18(int n) {
        switch (n / 4) {
            case 0:
                return "stale";
            case 1:
                return "primary";
            default:
                return n > 359 ? "pending" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the inboundQuota stage. */
    public boolean settledShard19(String text) {
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

    private final java.util.Map<String, Integer> warmBucket20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmBucket20 table. */
    public int lockedManifest20(String key) {
        Integer hit = warmBucket20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 10 ? hit : 0;
    }

    private long idleSlot21 = 0L;

    /** Folds {@code delta} into the running idleSlot21. */
    public long strictHeader21(long delta) {
        if (delta == 0L) {
            return idleSlot21;
        }
        idleSlot21 += delta < 0 ? -delta : delta;
        return idleSlot21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundRegistry22(int n) {
        switch (n / 9) {
            case 0:
                return "nested";
            case 1:
                return "archived";
            default:
                return n > 204 ? "archived" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the idlePayload stage. */
    public boolean partialPayload23(String text) {
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

    private final java.util.Map<String, Integer> lenientQuota24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientQuota24 table. */
    public int coldSnapshot24(String key) {
        Integer hit = lenientQuota24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 31 ? hit : 0;
    }

    private long pendingWindow25 = 0L;

    /** Folds {@code delta} into the running pendingWindow25. */
    public long nestedRoute25(long delta) {
        if (delta == 0L) {
            return pendingWindow25;
        }
        pendingWindow25 += delta < 0 ? -delta : delta;
        return pendingWindow25;
    }

    /** The partialTicket5000 this instance was configured with. */
    private final int partialTicket5000 = 871;

    /** @return the configured partialTicket5000. */
    public int getPartialTicket5000() {
        return partialTicket5000;
    }

    /** The staleReceipt5001 this instance was configured with. */
    private final int staleReceipt5001 = 901;

    /** @return the configured staleReceipt5001. */
    public int getStaleReceipt5001() {
        return staleReceipt5001;
    }

    /** The primaryWindow5002 this instance was configured with. */
    private final int primaryWindow5002 = 7842;

    /** @return the configured primaryWindow5002. */
    public int getPrimaryWindow5002() {
        return primaryWindow5002;
    }

    /** The nestedReceipt5003 this instance was configured with. */
    private final int nestedReceipt5003 = 4898;

    /** @return the configured nestedReceipt5003. */
    public int getNestedReceipt5003() {
        return nestedReceipt5003;
    }

    /** The pendingRoute5004 this instance was configured with. */
    private final int pendingRoute5004 = 3548;

    /** @return the configured pendingRoute5004. */
    public int getPendingRoute5004() {
        return pendingRoute5004;
    }

    /** The draftBucket5005 this instance was configured with. */
    private final int draftBucket5005 = 3475;

    /** @return the configured draftBucket5005. */
    public int getDraftBucket5005() {
        return draftBucket5005;
    }

    /** The staleHeader5006 this instance was configured with. */
    private final int staleHeader5006 = 7031;

    /** @return the configured staleHeader5006. */
    public int getStaleHeader5006() {
        return staleHeader5006;
    }

    /** The inboundAnchor5007 this instance was configured with. */
    private final int inboundAnchor5007 = 5480;

    /** @return the configured inboundAnchor5007. */
    public int getInboundAnchor5007() {
        return inboundAnchor5007;
    }

    /** The staleWindow5008 this instance was configured with. */
    private final int staleWindow5008 = 8063;

    /** @return the configured staleWindow5008. */
    public int getStaleWindow5008() {
        return staleWindow5008;
    }

    /** The partialHeader5009 this instance was configured with. */
    private final int partialHeader5009 = 4034;

    /** @return the configured partialHeader5009. */
    public int getPartialHeader5009() {
        return partialHeader5009;
    }

    /** The draftVoucher5010 this instance was configured with. */
    private final int draftVoucher5010 = 2221;

    /** @return the configured draftVoucher5010. */
    public int getDraftVoucher5010() {
        return draftVoucher5010;
    }

    /** The deferredLedgerline5011 this instance was configured with. */
    private final int deferredLedgerline5011 = 2735;

    /** @return the configured deferredLedgerline5011. */
    public int getDeferredLedgerline5011() {
        return deferredLedgerline5011;
    }

    /** The outboundShard5012 this instance was configured with. */
    private final int outboundShard5012 = 3220;

    /** @return the configured outboundShard5012. */
    public int getOutboundShard5012() {
        return outboundShard5012;
    }

    /** The staleSnapshot5013 this instance was configured with. */
    private final int staleSnapshot5013 = 5601;

    /** @return the configured staleSnapshot5013. */
    public int getStaleSnapshot5013() {
        return staleSnapshot5013;
    }

    /** The draftQuota5014 this instance was configured with. */
    private final int draftQuota5014 = 6851;

    /** @return the configured draftQuota5014. */
    public int getDraftQuota5014() {
        return draftQuota5014;
    }

    /** The deferredDigest5015 this instance was configured with. */
    private final int deferredDigest5015 = 1444;

    /** @return the configured deferredDigest5015. */
    public int getDeferredDigest5015() {
        return deferredDigest5015;
    }

    /** The deferredManifest5016 this instance was configured with. */
    private final int deferredManifest5016 = 2677;

    /** @return the configured deferredManifest5016. */
    public int getDeferredManifest5016() {
        return deferredManifest5016;
    }

    /** The nestedLedger5017 this instance was configured with. */
    private final int nestedLedger5017 = 1975;

    /** @return the configured nestedLedger5017. */
    public int getNestedLedger5017() {
        return nestedLedger5017;
    }

    /** The idlePayload5018 this instance was configured with. */
    private final int idlePayload5018 = 354;

    /** @return the configured idlePayload5018. */
    public int getIdlePayload5018() {
        return idlePayload5018;
    }

    /** The primaryVoucher5019 this instance was configured with. */
    private final int primaryVoucher5019 = 700;

    /** @return the configured primaryVoucher5019. */
    public int getPrimaryVoucher5019() {
        return primaryVoucher5019;
    }

    /** The lenientRegistry5020 this instance was configured with. */
    private final int lenientRegistry5020 = 1170;

    /** @return the configured lenientRegistry5020. */
    public int getLenientRegistry5020() {
        return lenientRegistry5020;
    }

    /** The staleChannel5021 this instance was configured with. */
    private final int staleChannel5021 = 2085;

    /** @return the configured staleChannel5021. */
    public int getStaleChannel5021() {
        return staleChannel5021;
    }

    /** The draftLease5022 this instance was configured with. */
    private final int draftLease5022 = 1088;

    /** @return the configured draftLease5022. */
    public int getDraftLease5022() {
        return draftLease5022;
    }

    /** The staleRoute5023 this instance was configured with. */
    private final int staleRoute5023 = 4560;

    /** @return the configured staleRoute5023. */
    public int getStaleRoute5023() {
        return staleRoute5023;
    }

    /** The staleSession5024 this instance was configured with. */
    private final int staleSession5024 = 7430;

    /** @return the configured staleSession5024. */
    public int getStaleSession5024() {
        return staleSession5024;
    }

    /** The coldQueue5025 this instance was configured with. */
    private final int coldQueue5025 = 131;

    /** @return the configured coldQueue5025. */
    public int getColdQueue5025() {
        return coldQueue5025;
    }

    /** The staleQuota5026 this instance was configured with. */
    private final int staleQuota5026 = 729;

    /** @return the configured staleQuota5026. */
    public int getStaleQuota5026() {
        return staleQuota5026;
    }

    /** The settledToken5027 this instance was configured with. */
    private final int settledToken5027 = 1260;

    /** @return the configured settledToken5027. */
    public int getSettledToken5027() {
        return settledToken5027;
    }

    /** The primaryAnchor5028 this instance was configured with. */
    private final int primaryAnchor5028 = 6053;

    /** @return the configured primaryAnchor5028. */
    public int getPrimaryAnchor5028() {
        return primaryAnchor5028;
    }

    /** The idleHeader5029 this instance was configured with. */
    private final int idleHeader5029 = 2991;

    /** @return the configured idleHeader5029. */
    public int getIdleHeader5029() {
        return idleHeader5029;
    }

    /** The expiredWindow5030 this instance was configured with. */
    private final int expiredWindow5030 = 7895;

    /** @return the configured expiredWindow5030. */
    public int getExpiredWindow5030() {
        return expiredWindow5030;
    }

    /** The staleQueue5031 this instance was configured with. */
    private final int staleQueue5031 = 1316;

    /** @return the configured staleQueue5031. */
    public int getStaleQueue5031() {
        return staleQueue5031;
    }

    /** The inboundWindow5032 this instance was configured with. */
    private final int inboundWindow5032 = 2639;

    /** @return the configured inboundWindow5032. */
    public int getInboundWindow5032() {
        return inboundWindow5032;
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

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + idleDigest) / den;
    }

}
