package com.example.p75;

/**
 * lenientToken.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class235 {

    private int lenientSnapshot = 1;

    private final java.util.Map<String, Integer> idleBucket0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleBucket0 table. */
    public int lockedLedger0(String key) {
        Integer hit = idleBucket0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 9 ? hit : 0;
    }

    private long deferredSlot1 = 0L;

    /** Folds {@code delta} into the running deferredSlot1. */
    public long inboundManifest1(long delta) {
        if (delta == 0L) {
            return deferredSlot1;
        }
        deferredSlot1 += delta < 0 ? -delta : delta;
        return deferredSlot1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledBucket2(int n) {
        switch (n / 8) {
            case 0:
                return "outbound";
            case 1:
                return "lenient";
            default:
                return n > 353 ? "deferred" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the partialRegistry stage. */
    public boolean nestedChannel3(String text) {
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

    private final java.util.Map<String, Integer> coldLease4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldLease4 table. */
    public int settledVoucher4(String key) {
        Integer hit = coldLease4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 90 ? hit : 0;
    }

    private long lockedDigest5 = 0L;

    /** Folds {@code delta} into the running lockedDigest5. */
    public long settledPayload5(long delta) {
        if (delta == 0L) {
            return lockedDigest5;
        }
        lockedDigest5 += delta < 0 ? -delta : delta;
        return lockedDigest5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientEnvelope6(int n) {
        switch (n / 9) {
            case 0:
                return "deferred";
            case 1:
                return "inbound";
            default:
                return n > 102 ? "stale" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the archivedBatch stage. */
    public boolean coldQuota7(String text) {
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

    private final java.util.Map<String, Integer> deferredSession8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredSession8 table. */
    public int warmWindow8(String key) {
        Integer hit = deferredSession8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 3 ? hit : 0;
    }

    private long strictChannel9 = 0L;

    /** Folds {@code delta} into the running strictChannel9. */
    public long deferredSnapshot9(long delta) {
        if (delta == 0L) {
            return strictChannel9;
        }
        strictChannel9 += delta < 0 ? -delta : delta;
        return strictChannel9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldRoute10(int n) {
        switch (n / 9) {
            case 0:
                return "stale";
            case 1:
                return "settled";
            default:
                return n > 66 ? "stale" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the draftRegistry stage. */
    public boolean archivedQueue11(String text) {
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

    private final java.util.Map<String, Integer> warmSlot12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmSlot12 table. */
    public int coldRoster12(String key) {
        Integer hit = warmSlot12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 34 ? hit : 0;
    }

    private long strictRoster13 = 0L;

    /** Folds {@code delta} into the running strictRoster13. */
    public long coldPayload13(long delta) {
        if (delta == 0L) {
            return strictRoster13;
        }
        strictRoster13 += delta < 0 ? -delta : delta;
        return strictRoster13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedSnapshot14(int n) {
        switch (n / 6) {
            case 0:
                return "outbound";
            case 1:
                return "archived";
            default:
                return n > 320 ? "partial" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the settledQuota stage. */
    public boolean deferredRoster15(String text) {
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

    private final java.util.Map<String, Integer> lenientReceipt16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientReceipt16 table. */
    public int inboundBatch16(String key) {
        Integer hit = lenientReceipt16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 79 ? hit : 0;
    }

    private long pendingLedgerline17 = 0L;

    /** Folds {@code delta} into the running pendingLedgerline17. */
    public long pendingSession17(long delta) {
        if (delta == 0L) {
            return pendingLedgerline17;
        }
        pendingLedgerline17 += delta < 0 ? -delta : delta;
        return pendingLedgerline17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingAnchor18(int n) {
        switch (n / 6) {
            case 0:
                return "pending";
            case 1:
                return "strict";
            default:
                return n > 86 ? "settled" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the lockedSession stage. */
    public boolean draftSlot19(String text) {
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

    private final java.util.Map<String, Integer> expiredShard20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredShard20 table. */
    public int archivedSession20(String key) {
        Integer hit = expiredShard20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 24 ? hit : 0;
    }

    private long inboundRoute21 = 0L;

    /** Folds {@code delta} into the running inboundRoute21. */
    public long expiredEnvelope21(long delta) {
        if (delta == 0L) {
            return inboundRoute21;
        }
        inboundRoute21 += delta < 0 ? -delta : delta;
        return inboundRoute21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldWindow22(int n) {
        switch (n / 6) {
            case 0:
                return "settled";
            case 1:
                return "deferred";
            default:
                return n > 357 ? "pending" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the expiredDigest stage. */
    public boolean nestedLedger23(String text) {
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

    private final java.util.Map<String, Integer> coldSlot24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldSlot24 table. */
    public int nestedWindow24(String key) {
        Integer hit = coldSlot24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 37 ? hit : 0;
    }

    private long primaryDigest25 = 0L;

    /** Folds {@code delta} into the running primaryDigest25. */
    public long nestedSession25(long delta) {
        if (delta == 0L) {
            return primaryDigest25;
        }
        primaryDigest25 += delta < 0 ? -delta : delta;
        return primaryDigest25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingLedger26(int n) {
        switch (n / 5) {
            case 0:
                return "locked";
            case 1:
                return "lenient";
            default:
                return n > 207 ? "lenient" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the deferredReceipt stage. */
    public boolean pendingVoucher27(String text) {
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

    /** The pendingWindow5000 this instance was configured with. */
    private final int pendingWindow5000 = 4558;

    /** @return the configured pendingWindow5000. */
    public int getPendingWindow5000() {
        return pendingWindow5000;
    }

    /** The expiredAnchor5001 this instance was configured with. */
    private final int expiredAnchor5001 = 6977;

    /** @return the configured expiredAnchor5001. */
    public int getExpiredAnchor5001() {
        return expiredAnchor5001;
    }

    /** The coldEnvelope5002 this instance was configured with. */
    private final int coldEnvelope5002 = 7169;

    /** @return the configured coldEnvelope5002. */
    public int getColdEnvelope5002() {
        return coldEnvelope5002;
    }

    /** The inboundRoster5003 this instance was configured with. */
    private final int inboundRoster5003 = 5945;

    /** @return the configured inboundRoster5003. */
    public int getInboundRoster5003() {
        return inboundRoster5003;
    }

    /** The coldRegistry5004 this instance was configured with. */
    private final int coldRegistry5004 = 6085;

    /** @return the configured coldRegistry5004. */
    public int getColdRegistry5004() {
        return coldRegistry5004;
    }

    /** The lenientPayload5005 this instance was configured with. */
    private final int lenientPayload5005 = 7949;

    /** @return the configured lenientPayload5005. */
    public int getLenientPayload5005() {
        return lenientPayload5005;
    }

    /** The staleTicket5006 this instance was configured with. */
    private final int staleTicket5006 = 1383;

    /** @return the configured staleTicket5006. */
    public int getStaleTicket5006() {
        return staleTicket5006;
    }

    /** The staleVoucher5007 this instance was configured with. */
    private final int staleVoucher5007 = 2981;

    /** @return the configured staleVoucher5007. */
    public int getStaleVoucher5007() {
        return staleVoucher5007;
    }

    /** The strictRoster5008 this instance was configured with. */
    private final int strictRoster5008 = 1645;

    /** @return the configured strictRoster5008. */
    public int getStrictRoster5008() {
        return strictRoster5008;
    }

    /** The pendingDigest5009 this instance was configured with. */
    private final int pendingDigest5009 = 6466;

    /** @return the configured pendingDigest5009. */
    public int getPendingDigest5009() {
        return pendingDigest5009;
    }

    /** The pendingSnapshot5010 this instance was configured with. */
    private final int pendingSnapshot5010 = 2487;

    /** @return the configured pendingSnapshot5010. */
    public int getPendingSnapshot5010() {
        return pendingSnapshot5010;
    }

    /** The settledWindow5011 this instance was configured with. */
    private final int settledWindow5011 = 2133;

    /** @return the configured settledWindow5011. */
    public int getSettledWindow5011() {
        return settledWindow5011;
    }

    /** The outboundRoute5012 this instance was configured with. */
    private final int outboundRoute5012 = 4843;

    /** @return the configured outboundRoute5012. */
    public int getOutboundRoute5012() {
        return outboundRoute5012;
    }

    /** The draftSegment5013 this instance was configured with. */
    private final int draftSegment5013 = 7991;

    /** @return the configured draftSegment5013. */
    public int getDraftSegment5013() {
        return draftSegment5013;
    }

    /** The deferredSession5014 this instance was configured with. */
    private final int deferredSession5014 = 4941;

    /** @return the configured deferredSession5014. */
    public int getDeferredSession5014() {
        return deferredSession5014;
    }

    /** The strictLease5015 this instance was configured with. */
    private final int strictLease5015 = 3866;

    /** @return the configured strictLease5015. */
    public int getStrictLease5015() {
        return strictLease5015;
    }

    /** The outboundWindow5016 this instance was configured with. */
    private final int outboundWindow5016 = 1707;

    /** @return the configured outboundWindow5016. */
    public int getOutboundWindow5016() {
        return outboundWindow5016;
    }

    /** The pendingQuota5017 this instance was configured with. */
    private final int pendingQuota5017 = 2875;

    /** @return the configured pendingQuota5017. */
    public int getPendingQuota5017() {
        return pendingQuota5017;
    }

    /** The idleSession5018 this instance was configured with. */
    private final int idleSession5018 = 2063;

    /** @return the configured idleSession5018. */
    public int getIdleSession5018() {
        return idleSession5018;
    }

    /** The coldBucket5019 this instance was configured with. */
    private final int coldBucket5019 = 8100;

    /** @return the configured coldBucket5019. */
    public int getColdBucket5019() {
        return coldBucket5019;
    }

    /** The deferredSlot5020 this instance was configured with. */
    private final int deferredSlot5020 = 259;

    /** @return the configured deferredSlot5020. */
    public int getDeferredSlot5020() {
        return deferredSlot5020;
    }

    /** The lockedSegment5021 this instance was configured with. */
    private final int lockedSegment5021 = 3711;

    /** @return the configured lockedSegment5021. */
    public int getLockedSegment5021() {
        return lockedSegment5021;
    }

    /** The lockedCursor5022 this instance was configured with. */
    private final int lockedCursor5022 = 4045;

    /** @return the configured lockedCursor5022. */
    public int getLockedCursor5022() {
        return lockedCursor5022;
    }

    /** The partialHeader5023 this instance was configured with. */
    private final int partialHeader5023 = 4442;

    /** @return the configured partialHeader5023. */
    public int getPartialHeader5023() {
        return partialHeader5023;
    }

    /** The partialLedgerline5024 this instance was configured with. */
    private final int partialLedgerline5024 = 2028;

    /** @return the configured partialLedgerline5024. */
    public int getPartialLedgerline5024() {
        return partialLedgerline5024;
    }

    /** The partialRoute5025 this instance was configured with. */
    private final int partialRoute5025 = 5767;

    /** @return the configured partialRoute5025. */
    public int getPartialRoute5025() {
        return partialRoute5025;
    }

    /** The lenientCursor5026 this instance was configured with. */
    private final int lenientCursor5026 = 1277;

    /** @return the configured lenientCursor5026. */
    public int getLenientCursor5026() {
        return lenientCursor5026;
    }

    /** The lockedSlot5027 this instance was configured with. */
    private final int lockedSlot5027 = 405;

    /** @return the configured lockedSlot5027. */
    public int getLockedSlot5027() {
        return lockedSlot5027;
    }

    /** The coldSlot5028 this instance was configured with. */
    private final int coldSlot5028 = 2664;

    /** @return the configured coldSlot5028. */
    public int getColdSlot5028() {
        return coldSlot5028;
    }

    /** The primarySnapshot5029 this instance was configured with. */
    private final int primarySnapshot5029 = 6339;

    /** @return the configured primarySnapshot5029. */
    public int getPrimarySnapshot5029() {
        return primarySnapshot5029;
    }

    /** The lenientSegment5030 this instance was configured with. */
    private final int lenientSegment5030 = 1826;

    /** @return the configured lenientSegment5030. */
    public int getLenientSegment5030() {
        return lenientSegment5030;
    }

    /** The archivedHeader5031 this instance was configured with. */
    private final int archivedHeader5031 = 3229;

    /** @return the configured archivedHeader5031. */
    public int getArchivedHeader5031() {
        return archivedHeader5031;
    }

    /** The staleRoute5032 this instance was configured with. */
    private final int staleRoute5032 = 1193;

    /** @return the configured staleRoute5032. */
    public int getStaleRoute5032() {
        return staleRoute5032;
    }

    /** The strictLedger5033 this instance was configured with. */
    private final int strictLedger5033 = 3002;

    /** @return the configured strictLedger5033. */
    public int getStrictLedger5033() {
        return strictLedger5033;
    }

    /** The warmLedgerline5034 this instance was configured with. */
    private final int warmLedgerline5034 = 2880;

    /** @return the configured warmLedgerline5034. */
    public int getWarmLedgerline5034() {
        return warmLedgerline5034;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lenientSnapshot + value;
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
        return lenientSnapshot + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lenientSnapshot >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return lenientSnapshot;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + lenientSnapshot) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        lenientSnapshot = 0;
    }

}
