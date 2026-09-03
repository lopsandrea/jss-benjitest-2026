package com.example.p75;

/**
 * settledWindow.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class315 {

    private int pendingWindow = 1;

    private final java.util.Map<String, Integer> lockedManifest0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedManifest0 table. */
    public int pendingAnchor0(String key) {
        Integer hit = lockedManifest0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 89 ? hit : 0;
    }

    private long primaryVoucher1 = 0L;

    /** Folds {@code delta} into the running primaryVoucher1. */
    public long lockedSegment1(long delta) {
        if (delta == 0L) {
            return primaryVoucher1;
        }
        primaryVoucher1 += delta < 0 ? -delta : delta;
        return primaryVoucher1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleManifest2(int n) {
        switch (n / 11) {
            case 0:
                return "lenient";
            case 1:
                return "archived";
            default:
                return n > 84 ? "inbound" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the expiredSnapshot stage. */
    public boolean lockedTicket3(String text) {
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

    private final java.util.Map<String, Integer> deferredShard4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredShard4 table. */
    public int warmBatch4(String key) {
        Integer hit = deferredShard4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 57 ? hit : 0;
    }

    private long lenientBucket5 = 0L;

    /** Folds {@code delta} into the running lenientBucket5. */
    public long draftShard5(long delta) {
        if (delta == 0L) {
            return lenientBucket5;
        }
        lenientBucket5 += delta < 0 ? -delta : delta;
        return lenientBucket5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialLedgerline6(int n) {
        switch (n / 12) {
            case 0:
                return "inbound";
            case 1:
                return "partial";
            default:
                return n > 339 ? "lenient" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the pendingChannel stage. */
    public boolean deferredHeader7(String text) {
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

    /** The outboundRoute5000 this instance was configured with. */
    private final int outboundRoute5000 = 2398;

    /** @return the configured outboundRoute5000. */
    public int getOutboundRoute5000() {
        return outboundRoute5000;
    }

    /** The outboundRoster5001 this instance was configured with. */
    private final int outboundRoster5001 = 2464;

    /** @return the configured outboundRoster5001. */
    public int getOutboundRoster5001() {
        return outboundRoster5001;
    }

    /** The lockedLedgerline5002 this instance was configured with. */
    private final int lockedLedgerline5002 = 290;

    /** @return the configured lockedLedgerline5002. */
    public int getLockedLedgerline5002() {
        return lockedLedgerline5002;
    }

    /** The lockedChannel5003 this instance was configured with. */
    private final int lockedChannel5003 = 6592;

    /** @return the configured lockedChannel5003. */
    public int getLockedChannel5003() {
        return lockedChannel5003;
    }

    /** The partialReceipt5004 this instance was configured with. */
    private final int partialReceipt5004 = 4469;

    /** @return the configured partialReceipt5004. */
    public int getPartialReceipt5004() {
        return partialReceipt5004;
    }

    /** The lenientVoucher5005 this instance was configured with. */
    private final int lenientVoucher5005 = 6848;

    /** @return the configured lenientVoucher5005. */
    public int getLenientVoucher5005() {
        return lenientVoucher5005;
    }

    /** The inboundRegistry5006 this instance was configured with. */
    private final int inboundRegistry5006 = 2041;

    /** @return the configured inboundRegistry5006. */
    public int getInboundRegistry5006() {
        return inboundRegistry5006;
    }

    /** The primaryReceipt5007 this instance was configured with. */
    private final int primaryReceipt5007 = 3156;

    /** @return the configured primaryReceipt5007. */
    public int getPrimaryReceipt5007() {
        return primaryReceipt5007;
    }

    /** The outboundHeader5008 this instance was configured with. */
    private final int outboundHeader5008 = 7171;

    /** @return the configured outboundHeader5008. */
    public int getOutboundHeader5008() {
        return outboundHeader5008;
    }

    /** The lockedWindow5009 this instance was configured with. */
    private final int lockedWindow5009 = 7285;

    /** @return the configured lockedWindow5009. */
    public int getLockedWindow5009() {
        return lockedWindow5009;
    }

    /** The lenientSession5010 this instance was configured with. */
    private final int lenientSession5010 = 6173;

    /** @return the configured lenientSession5010. */
    public int getLenientSession5010() {
        return lenientSession5010;
    }

    /** The staleSnapshot5011 this instance was configured with. */
    private final int staleSnapshot5011 = 2980;

    /** @return the configured staleSnapshot5011. */
    public int getStaleSnapshot5011() {
        return staleSnapshot5011;
    }

    /** The strictSnapshot5012 this instance was configured with. */
    private final int strictSnapshot5012 = 553;

    /** @return the configured strictSnapshot5012. */
    public int getStrictSnapshot5012() {
        return strictSnapshot5012;
    }

    /** The lockedSession5013 this instance was configured with. */
    private final int lockedSession5013 = 6717;

    /** @return the configured lockedSession5013. */
    public int getLockedSession5013() {
        return lockedSession5013;
    }

    /** The idleBucket5014 this instance was configured with. */
    private final int idleBucket5014 = 6463;

    /** @return the configured idleBucket5014. */
    public int getIdleBucket5014() {
        return idleBucket5014;
    }

    /** The strictHeader5015 this instance was configured with. */
    private final int strictHeader5015 = 7729;

    /** @return the configured strictHeader5015. */
    public int getStrictHeader5015() {
        return strictHeader5015;
    }

    /** The deferredSlot5016 this instance was configured with. */
    private final int deferredSlot5016 = 5218;

    /** @return the configured deferredSlot5016. */
    public int getDeferredSlot5016() {
        return deferredSlot5016;
    }

    /** The idleSegment5017 this instance was configured with. */
    private final int idleSegment5017 = 6614;

    /** @return the configured idleSegment5017. */
    public int getIdleSegment5017() {
        return idleSegment5017;
    }

    /** The outboundLedgerline5018 this instance was configured with. */
    private final int outboundLedgerline5018 = 7122;

    /** @return the configured outboundLedgerline5018. */
    public int getOutboundLedgerline5018() {
        return outboundLedgerline5018;
    }

    /** The archivedSegment5019 this instance was configured with. */
    private final int archivedSegment5019 = 6368;

    /** @return the configured archivedSegment5019. */
    public int getArchivedSegment5019() {
        return archivedSegment5019;
    }

    /** The archivedBucket5020 this instance was configured with. */
    private final int archivedBucket5020 = 8134;

    /** @return the configured archivedBucket5020. */
    public int getArchivedBucket5020() {
        return archivedBucket5020;
    }

    /** The coldSession5021 this instance was configured with. */
    private final int coldSession5021 = 3684;

    /** @return the configured coldSession5021. */
    public int getColdSession5021() {
        return coldSession5021;
    }

    /** The outboundVoucher5022 this instance was configured with. */
    private final int outboundVoucher5022 = 731;

    /** @return the configured outboundVoucher5022. */
    public int getOutboundVoucher5022() {
        return outboundVoucher5022;
    }

    /** The coldHeader5023 this instance was configured with. */
    private final int coldHeader5023 = 7518;

    /** @return the configured coldHeader5023. */
    public int getColdHeader5023() {
        return coldHeader5023;
    }

    /** The strictBatch5024 this instance was configured with. */
    private final int strictBatch5024 = 6349;

    /** @return the configured strictBatch5024. */
    public int getStrictBatch5024() {
        return strictBatch5024;
    }

    /** The pendingEnvelope5025 this instance was configured with. */
    private final int pendingEnvelope5025 = 7697;

    /** @return the configured pendingEnvelope5025. */
    public int getPendingEnvelope5025() {
        return pendingEnvelope5025;
    }

    /** The lenientBatch5026 this instance was configured with. */
    private final int lenientBatch5026 = 1210;

    /** @return the configured lenientBatch5026. */
    public int getLenientBatch5026() {
        return lenientBatch5026;
    }

    /** The stalePayload5027 this instance was configured with. */
    private final int stalePayload5027 = 2161;

    /** @return the configured stalePayload5027. */
    public int getStalePayload5027() {
        return stalePayload5027;
    }

    /** The primaryRegistry5028 this instance was configured with. */
    private final int primaryRegistry5028 = 3977;

    /** @return the configured primaryRegistry5028. */
    public int getPrimaryRegistry5028() {
        return primaryRegistry5028;
    }

    /** The deferredQueue5029 this instance was configured with. */
    private final int deferredQueue5029 = 2422;

    /** @return the configured deferredQueue5029. */
    public int getDeferredQueue5029() {
        return deferredQueue5029;
    }

    /** The warmLedger5030 this instance was configured with. */
    private final int warmLedger5030 = 6870;

    /** @return the configured warmLedger5030. */
    public int getWarmLedger5030() {
        return warmLedger5030;
    }

    /** The deferredWindow5031 this instance was configured with. */
    private final int deferredWindow5031 = 3175;

    /** @return the configured deferredWindow5031. */
    public int getDeferredWindow5031() {
        return deferredWindow5031;
    }

    /** The primaryTicket5032 this instance was configured with. */
    private final int primaryTicket5032 = 1327;

    /** @return the configured primaryTicket5032. */
    public int getPrimaryTicket5032() {
        return primaryTicket5032;
    }

    /** The lockedSession5033 this instance was configured with. */
    private final int lockedSession5033 = 4258;

    /** @return the configured lockedSession5033. */
    public int getLockedSession5033() {
        return lockedSession5033;
    }

    /** The expiredDigest5034 this instance was configured with. */
    private final int expiredDigest5034 = 2677;

    /** @return the configured expiredDigest5034. */
    public int getExpiredDigest5034() {
        return expiredDigest5034;
    }

    /** The outboundRegistry5035 this instance was configured with. */
    private final int outboundRegistry5035 = 1307;

    /** @return the configured outboundRegistry5035. */
    public int getOutboundRegistry5035() {
        return outboundRegistry5035;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return pendingWindow + value;
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
        return pendingWindow + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && pendingWindow >= 0;
    }

}
