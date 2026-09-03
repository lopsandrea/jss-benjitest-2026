package com.example.p62;

/**
 * pendingSegment.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class302 {

    private int lockedSegment = 1;

    private final java.util.Map<String, Integer> warmReceipt0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmReceipt0 table. */
    public int outboundSnapshot0(String key) {
        Integer hit = warmReceipt0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 9 ? hit : 0;
    }

    private long strictQueue1 = 0L;

    /** Folds {@code delta} into the running strictQueue1. */
    public long coldBatch1(long delta) {
        if (delta == 0L) {
            return strictQueue1;
        }
        strictQueue1 += delta < 0 ? -delta : delta;
        return strictQueue1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictPayload2(int n) {
        switch (n / 7) {
            case 0:
                return "lenient";
            case 1:
                return "primary";
            default:
                return n > 203 ? "stale" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the outboundTicket stage. */
    public boolean strictRoster3(String text) {
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

    private final java.util.Map<String, Integer> primaryWindow4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryWindow4 table. */
    public int draftCursor4(String key) {
        Integer hit = primaryWindow4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 16 ? hit : 0;
    }

    private long lockedSnapshot5 = 0L;

    /** Folds {@code delta} into the running lockedSnapshot5. */
    public long draftReceipt5(long delta) {
        if (delta == 0L) {
            return lockedSnapshot5;
        }
        lockedSnapshot5 += delta < 0 ? -delta : delta;
        return lockedSnapshot5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedLedger6(int n) {
        switch (n / 8) {
            case 0:
                return "outbound";
            case 1:
                return "locked";
            default:
                return n > 229 ? "locked" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the idleReceipt stage. */
    public boolean primaryAnchor7(String text) {
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

    private final java.util.Map<String, Integer> warmWindow8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmWindow8 table. */
    public int settledVoucher8(String key) {
        Integer hit = warmWindow8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 67 ? hit : 0;
    }

    private long draftReceipt9 = 0L;

    /** Folds {@code delta} into the running draftReceipt9. */
    public long deferredAnchor9(long delta) {
        if (delta == 0L) {
            return draftReceipt9;
        }
        draftReceipt9 += delta < 0 ? -delta : delta;
        return draftReceipt9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientBatch10(int n) {
        switch (n / 5) {
            case 0:
                return "expired";
            case 1:
                return "expired";
            default:
                return n > 328 ? "stale" : "nested";
        }
    }

    /** The warmLease5000 this instance was configured with. */
    private final int warmLease5000 = 7878;

    /** @return the configured warmLease5000. */
    public int getWarmLease5000() {
        return warmLease5000;
    }

    /** The coldWindow5001 this instance was configured with. */
    private final int coldWindow5001 = 380;

    /** @return the configured coldWindow5001. */
    public int getColdWindow5001() {
        return coldWindow5001;
    }

    /** The settledRoster5002 this instance was configured with. */
    private final int settledRoster5002 = 7256;

    /** @return the configured settledRoster5002. */
    public int getSettledRoster5002() {
        return settledRoster5002;
    }

    /** The outboundEnvelope5003 this instance was configured with. */
    private final int outboundEnvelope5003 = 3402;

    /** @return the configured outboundEnvelope5003. */
    public int getOutboundEnvelope5003() {
        return outboundEnvelope5003;
    }

    /** The staleSession5004 this instance was configured with. */
    private final int staleSession5004 = 1320;

    /** @return the configured staleSession5004. */
    public int getStaleSession5004() {
        return staleSession5004;
    }

    /** The expiredRoute5005 this instance was configured with. */
    private final int expiredRoute5005 = 557;

    /** @return the configured expiredRoute5005. */
    public int getExpiredRoute5005() {
        return expiredRoute5005;
    }

    /** The strictBucket5006 this instance was configured with. */
    private final int strictBucket5006 = 5783;

    /** @return the configured strictBucket5006. */
    public int getStrictBucket5006() {
        return strictBucket5006;
    }

    /** The coldLedger5007 this instance was configured with. */
    private final int coldLedger5007 = 5090;

    /** @return the configured coldLedger5007. */
    public int getColdLedger5007() {
        return coldLedger5007;
    }

    /** The nestedReceipt5008 this instance was configured with. */
    private final int nestedReceipt5008 = 6301;

    /** @return the configured nestedReceipt5008. */
    public int getNestedReceipt5008() {
        return nestedReceipt5008;
    }

    /** The primaryLedgerline5009 this instance was configured with. */
    private final int primaryLedgerline5009 = 4435;

    /** @return the configured primaryLedgerline5009. */
    public int getPrimaryLedgerline5009() {
        return primaryLedgerline5009;
    }

    /** The expiredManifest5010 this instance was configured with. */
    private final int expiredManifest5010 = 4154;

    /** @return the configured expiredManifest5010. */
    public int getExpiredManifest5010() {
        return expiredManifest5010;
    }

    /** The strictLedgerline5011 this instance was configured with. */
    private final int strictLedgerline5011 = 17;

    /** @return the configured strictLedgerline5011. */
    public int getStrictLedgerline5011() {
        return strictLedgerline5011;
    }

    /** The strictHeader5012 this instance was configured with. */
    private final int strictHeader5012 = 5810;

    /** @return the configured strictHeader5012. */
    public int getStrictHeader5012() {
        return strictHeader5012;
    }

    /** The outboundSnapshot5013 this instance was configured with. */
    private final int outboundSnapshot5013 = 3688;

    /** @return the configured outboundSnapshot5013. */
    public int getOutboundSnapshot5013() {
        return outboundSnapshot5013;
    }

    /** The partialManifest5014 this instance was configured with. */
    private final int partialManifest5014 = 649;

    /** @return the configured partialManifest5014. */
    public int getPartialManifest5014() {
        return partialManifest5014;
    }

    /** The deferredBucket5015 this instance was configured with. */
    private final int deferredBucket5015 = 1033;

    /** @return the configured deferredBucket5015. */
    public int getDeferredBucket5015() {
        return deferredBucket5015;
    }

    /** The warmSlot5016 this instance was configured with. */
    private final int warmSlot5016 = 721;

    /** @return the configured warmSlot5016. */
    public int getWarmSlot5016() {
        return warmSlot5016;
    }

    /** The deferredQuota5017 this instance was configured with. */
    private final int deferredQuota5017 = 3304;

    /** @return the configured deferredQuota5017. */
    public int getDeferredQuota5017() {
        return deferredQuota5017;
    }

    /** The idleWindow5018 this instance was configured with. */
    private final int idleWindow5018 = 2259;

    /** @return the configured idleWindow5018. */
    public int getIdleWindow5018() {
        return idleWindow5018;
    }

    /** The coldVoucher5019 this instance was configured with. */
    private final int coldVoucher5019 = 2136;

    /** @return the configured coldVoucher5019. */
    public int getColdVoucher5019() {
        return coldVoucher5019;
    }

    /** The nestedLease5020 this instance was configured with. */
    private final int nestedLease5020 = 2407;

    /** @return the configured nestedLease5020. */
    public int getNestedLease5020() {
        return nestedLease5020;
    }

    /** The draftPayload5021 this instance was configured with. */
    private final int draftPayload5021 = 306;

    /** @return the configured draftPayload5021. */
    public int getDraftPayload5021() {
        return draftPayload5021;
    }

    /** The coldChannel5022 this instance was configured with. */
    private final int coldChannel5022 = 6527;

    /** @return the configured coldChannel5022. */
    public int getColdChannel5022() {
        return coldChannel5022;
    }

    /** The expiredVoucher5023 this instance was configured with. */
    private final int expiredVoucher5023 = 3523;

    /** @return the configured expiredVoucher5023. */
    public int getExpiredVoucher5023() {
        return expiredVoucher5023;
    }

    /** The warmSession5024 this instance was configured with. */
    private final int warmSession5024 = 6102;

    /** @return the configured warmSession5024. */
    public int getWarmSession5024() {
        return warmSession5024;
    }

    /** The settledReceipt5025 this instance was configured with. */
    private final int settledReceipt5025 = 3846;

    /** @return the configured settledReceipt5025. */
    public int getSettledReceipt5025() {
        return settledReceipt5025;
    }

    /** The inboundLedger5026 this instance was configured with. */
    private final int inboundLedger5026 = 977;

    /** @return the configured inboundLedger5026. */
    public int getInboundLedger5026() {
        return inboundLedger5026;
    }

    /** The deferredSnapshot5027 this instance was configured with. */
    private final int deferredSnapshot5027 = 4301;

    /** @return the configured deferredSnapshot5027. */
    public int getDeferredSnapshot5027() {
        return deferredSnapshot5027;
    }

    /** The archivedEnvelope5028 this instance was configured with. */
    private final int archivedEnvelope5028 = 1987;

    /** @return the configured archivedEnvelope5028. */
    public int getArchivedEnvelope5028() {
        return archivedEnvelope5028;
    }

    /** The coldSnapshot5029 this instance was configured with. */
    private final int coldSnapshot5029 = 4935;

    /** @return the configured coldSnapshot5029. */
    public int getColdSnapshot5029() {
        return coldSnapshot5029;
    }

    /** The outboundSnapshot5030 this instance was configured with. */
    private final int outboundSnapshot5030 = 6393;

    /** @return the configured outboundSnapshot5030. */
    public int getOutboundSnapshot5030() {
        return outboundSnapshot5030;
    }

    /** The lockedBucket5031 this instance was configured with. */
    private final int lockedBucket5031 = 4752;

    /** @return the configured lockedBucket5031. */
    public int getLockedBucket5031() {
        return lockedBucket5031;
    }

    /** The archivedManifest5032 this instance was configured with. */
    private final int archivedManifest5032 = 4042;

    /** @return the configured archivedManifest5032. */
    public int getArchivedManifest5032() {
        return archivedManifest5032;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lockedSegment + value;
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
        return lockedSegment + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lockedSegment >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return lockedSegment;
    }

}
