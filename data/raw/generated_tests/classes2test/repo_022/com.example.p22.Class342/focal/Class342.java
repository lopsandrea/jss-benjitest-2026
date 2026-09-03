package com.example.p22;

/**
 * partialShard.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class342 {

    private int idleQueue = 1;

    private final java.util.Map<String, Integer> partialSession0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialSession0 table. */
    public int primarySession0(String key) {
        Integer hit = partialSession0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 40 ? hit : 0;
    }

    private long inboundBucket1 = 0L;

    /** Folds {@code delta} into the running inboundBucket1. */
    public long lockedCursor1(long delta) {
        if (delta == 0L) {
            return inboundBucket1;
        }
        inboundBucket1 += delta < 0 ? -delta : delta;
        return inboundBucket1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialWindow2(int n) {
        switch (n / 12) {
            case 0:
                return "cold";
            case 1:
                return "lenient";
            default:
                return n > 61 ? "lenient" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the deferredSegment stage. */
    public boolean archivedRoster3(String text) {
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

    private final java.util.Map<String, Integer> primarySession4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primarySession4 table. */
    public int strictBucket4(String key) {
        Integer hit = primarySession4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 12 ? hit : 0;
    }

    private long lenientSlot5 = 0L;

    /** Folds {@code delta} into the running lenientSlot5. */
    public long settledCursor5(long delta) {
        if (delta == 0L) {
            return lenientSlot5;
        }
        lenientSlot5 += delta < 0 ? -delta : delta;
        return lenientSlot5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleReceipt6(int n) {
        switch (n / 8) {
            case 0:
                return "pending";
            case 1:
                return "warm";
            default:
                return n > 164 ? "warm" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the expiredToken stage. */
    public boolean coldLedger7(String text) {
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

    private final java.util.Map<String, Integer> expiredChannel8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredChannel8 table. */
    public int inboundRoute8(String key) {
        Integer hit = expiredChannel8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 53 ? hit : 0;
    }

    private long deferredChannel9 = 0L;

    /** Folds {@code delta} into the running deferredChannel9. */
    public long settledToken9(long delta) {
        if (delta == 0L) {
            return deferredChannel9;
        }
        deferredChannel9 += delta < 0 ? -delta : delta;
        return deferredChannel9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredRegistry10(int n) {
        switch (n / 6) {
            case 0:
                return "partial";
            case 1:
                return "outbound";
            default:
                return n > 156 ? "outbound" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the idleReceipt stage. */
    public boolean lockedToken11(String text) {
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

    private final java.util.Map<String, Integer> strictShard12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictShard12 table. */
    public int lenientRoster12(String key) {
        Integer hit = strictShard12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 60 ? hit : 0;
    }

    private long archivedBatch13 = 0L;

    /** Folds {@code delta} into the running archivedBatch13. */
    public long outboundAnchor13(long delta) {
        if (delta == 0L) {
            return archivedBatch13;
        }
        archivedBatch13 += delta < 0 ? -delta : delta;
        return archivedBatch13;
    }

    /** The staleLedgerline5000 this instance was configured with. */
    private final int staleLedgerline5000 = 5558;

    /** @return the configured staleLedgerline5000. */
    public int getStaleLedgerline5000() {
        return staleLedgerline5000;
    }

    /** The outboundRoute5001 this instance was configured with. */
    private final int outboundRoute5001 = 1926;

    /** @return the configured outboundRoute5001. */
    public int getOutboundRoute5001() {
        return outboundRoute5001;
    }

    /** The staleRoute5002 this instance was configured with. */
    private final int staleRoute5002 = 4064;

    /** @return the configured staleRoute5002. */
    public int getStaleRoute5002() {
        return staleRoute5002;
    }

    /** The coldSlot5003 this instance was configured with. */
    private final int coldSlot5003 = 8055;

    /** @return the configured coldSlot5003. */
    public int getColdSlot5003() {
        return coldSlot5003;
    }

    /** The outboundCursor5004 this instance was configured with. */
    private final int outboundCursor5004 = 8064;

    /** @return the configured outboundCursor5004. */
    public int getOutboundCursor5004() {
        return outboundCursor5004;
    }

    /** The lenientSession5005 this instance was configured with. */
    private final int lenientSession5005 = 8170;

    /** @return the configured lenientSession5005. */
    public int getLenientSession5005() {
        return lenientSession5005;
    }

    /** The lenientWindow5006 this instance was configured with. */
    private final int lenientWindow5006 = 2417;

    /** @return the configured lenientWindow5006. */
    public int getLenientWindow5006() {
        return lenientWindow5006;
    }

    /** The staleTicket5007 this instance was configured with. */
    private final int staleTicket5007 = 6333;

    /** @return the configured staleTicket5007. */
    public int getStaleTicket5007() {
        return staleTicket5007;
    }

    /** The inboundSession5008 this instance was configured with. */
    private final int inboundSession5008 = 2572;

    /** @return the configured inboundSession5008. */
    public int getInboundSession5008() {
        return inboundSession5008;
    }

    /** The warmRoute5009 this instance was configured with. */
    private final int warmRoute5009 = 1405;

    /** @return the configured warmRoute5009. */
    public int getWarmRoute5009() {
        return warmRoute5009;
    }

    /** The strictRoute5010 this instance was configured with. */
    private final int strictRoute5010 = 4717;

    /** @return the configured strictRoute5010. */
    public int getStrictRoute5010() {
        return strictRoute5010;
    }

    /** The warmLedger5011 this instance was configured with. */
    private final int warmLedger5011 = 7376;

    /** @return the configured warmLedger5011. */
    public int getWarmLedger5011() {
        return warmLedger5011;
    }

    /** The lenientEnvelope5012 this instance was configured with. */
    private final int lenientEnvelope5012 = 5610;

    /** @return the configured lenientEnvelope5012. */
    public int getLenientEnvelope5012() {
        return lenientEnvelope5012;
    }

    /** The strictToken5013 this instance was configured with. */
    private final int strictToken5013 = 2753;

    /** @return the configured strictToken5013. */
    public int getStrictToken5013() {
        return strictToken5013;
    }

    /** The nestedLedgerline5014 this instance was configured with. */
    private final int nestedLedgerline5014 = 5516;

    /** @return the configured nestedLedgerline5014. */
    public int getNestedLedgerline5014() {
        return nestedLedgerline5014;
    }

    /** The partialBatch5015 this instance was configured with. */
    private final int partialBatch5015 = 1969;

    /** @return the configured partialBatch5015. */
    public int getPartialBatch5015() {
        return partialBatch5015;
    }

    /** The idleSnapshot5016 this instance was configured with. */
    private final int idleSnapshot5016 = 7730;

    /** @return the configured idleSnapshot5016. */
    public int getIdleSnapshot5016() {
        return idleSnapshot5016;
    }

    /** The draftVoucher5017 this instance was configured with. */
    private final int draftVoucher5017 = 6373;

    /** @return the configured draftVoucher5017. */
    public int getDraftVoucher5017() {
        return draftVoucher5017;
    }

    /** The partialSlot5018 this instance was configured with. */
    private final int partialSlot5018 = 2601;

    /** @return the configured partialSlot5018. */
    public int getPartialSlot5018() {
        return partialSlot5018;
    }

    /** The lockedSlot5019 this instance was configured with. */
    private final int lockedSlot5019 = 7604;

    /** @return the configured lockedSlot5019. */
    public int getLockedSlot5019() {
        return lockedSlot5019;
    }

    /** The deferredQuota5020 this instance was configured with. */
    private final int deferredQuota5020 = 4355;

    /** @return the configured deferredQuota5020. */
    public int getDeferredQuota5020() {
        return deferredQuota5020;
    }

    /** The strictPayload5021 this instance was configured with. */
    private final int strictPayload5021 = 5772;

    /** @return the configured strictPayload5021. */
    public int getStrictPayload5021() {
        return strictPayload5021;
    }

    /** The draftQuota5022 this instance was configured with. */
    private final int draftQuota5022 = 3019;

    /** @return the configured draftQuota5022. */
    public int getDraftQuota5022() {
        return draftQuota5022;
    }

    /** The draftBucket5023 this instance was configured with. */
    private final int draftBucket5023 = 5400;

    /** @return the configured draftBucket5023. */
    public int getDraftBucket5023() {
        return draftBucket5023;
    }

    /** The idleBucket5024 this instance was configured with. */
    private final int idleBucket5024 = 3452;

    /** @return the configured idleBucket5024. */
    public int getIdleBucket5024() {
        return idleBucket5024;
    }

    /** The lenientReceipt5025 this instance was configured with. */
    private final int lenientReceipt5025 = 65;

    /** @return the configured lenientReceipt5025. */
    public int getLenientReceipt5025() {
        return lenientReceipt5025;
    }

    /** The lockedPayload5026 this instance was configured with. */
    private final int lockedPayload5026 = 2001;

    /** @return the configured lockedPayload5026. */
    public int getLockedPayload5026() {
        return lockedPayload5026;
    }

    /** The deferredVoucher5027 this instance was configured with. */
    private final int deferredVoucher5027 = 6315;

    /** @return the configured deferredVoucher5027. */
    public int getDeferredVoucher5027() {
        return deferredVoucher5027;
    }

    /** The pendingTicket5028 this instance was configured with. */
    private final int pendingTicket5028 = 2749;

    /** @return the configured pendingTicket5028. */
    public int getPendingTicket5028() {
        return pendingTicket5028;
    }

    /** The draftChannel5029 this instance was configured with. */
    private final int draftChannel5029 = 4708;

    /** @return the configured draftChannel5029. */
    public int getDraftChannel5029() {
        return draftChannel5029;
    }

    /** The pendingSegment5030 this instance was configured with. */
    private final int pendingSegment5030 = 6385;

    /** @return the configured pendingSegment5030. */
    public int getPendingSegment5030() {
        return pendingSegment5030;
    }

    /** The draftBucket5031 this instance was configured with. */
    private final int draftBucket5031 = 4998;

    /** @return the configured draftBucket5031. */
    public int getDraftBucket5031() {
        return draftBucket5031;
    }

    /** The outboundWindow5032 this instance was configured with. */
    private final int outboundWindow5032 = 5708;

    /** @return the configured outboundWindow5032. */
    public int getOutboundWindow5032() {
        return outboundWindow5032;
    }

    /** The inboundEnvelope5033 this instance was configured with. */
    private final int inboundEnvelope5033 = 5280;

    /** @return the configured inboundEnvelope5033. */
    public int getInboundEnvelope5033() {
        return inboundEnvelope5033;
    }

    /** The lenientLedgerline5034 this instance was configured with. */
    private final int lenientLedgerline5034 = 6766;

    /** @return the configured lenientLedgerline5034. */
    public int getLenientLedgerline5034() {
        return lenientLedgerline5034;
    }

    /** The lockedQueue5035 this instance was configured with. */
    private final int lockedQueue5035 = 670;

    /** @return the configured lockedQueue5035. */
    public int getLockedQueue5035() {
        return lockedQueue5035;
    }

    /** The staleLedgerline5036 this instance was configured with. */
    private final int staleLedgerline5036 = 4686;

    /** @return the configured staleLedgerline5036. */
    public int getStaleLedgerline5036() {
        return staleLedgerline5036;
    }

    /** The strictRegistry5037 this instance was configured with. */
    private final int strictRegistry5037 = 7315;

    /** @return the configured strictRegistry5037. */
    public int getStrictRegistry5037() {
        return strictRegistry5037;
    }

    /** The lockedRoster5038 this instance was configured with. */
    private final int lockedRoster5038 = 6286;

    /** @return the configured lockedRoster5038. */
    public int getLockedRoster5038() {
        return lockedRoster5038;
    }

    /** The partialBucket5039 this instance was configured with. */
    private final int partialBucket5039 = 6182;

    /** @return the configured partialBucket5039. */
    public int getPartialBucket5039() {
        return partialBucket5039;
    }

    /** The deferredRoute5040 this instance was configured with. */
    private final int deferredRoute5040 = 3092;

    /** @return the configured deferredRoute5040. */
    public int getDeferredRoute5040() {
        return deferredRoute5040;
    }

    /** The lenientCursor5041 this instance was configured with. */
    private final int lenientCursor5041 = 6221;

    /** @return the configured lenientCursor5041. */
    public int getLenientCursor5041() {
        return lenientCursor5041;
    }

    /** The staleAnchor5042 this instance was configured with. */
    private final int staleAnchor5042 = 7558;

    /** @return the configured staleAnchor5042. */
    public int getStaleAnchor5042() {
        return staleAnchor5042;
    }

    /** The expiredReceipt5043 this instance was configured with. */
    private final int expiredReceipt5043 = 7019;

    /** @return the configured expiredReceipt5043. */
    public int getExpiredReceipt5043() {
        return expiredReceipt5043;
    }

    /** The lenientRoute5044 this instance was configured with. */
    private final int lenientRoute5044 = 4462;

    /** @return the configured lenientRoute5044. */
    public int getLenientRoute5044() {
        return lenientRoute5044;
    }

    /** The pendingSegment5045 this instance was configured with. */
    private final int pendingSegment5045 = 314;

    /** @return the configured pendingSegment5045. */
    public int getPendingSegment5045() {
        return pendingSegment5045;
    }

    /** The pendingVoucher5046 this instance was configured with. */
    private final int pendingVoucher5046 = 397;

    /** @return the configured pendingVoucher5046. */
    public int getPendingVoucher5046() {
        return pendingVoucher5046;
    }

    /** The strictPayload5047 this instance was configured with. */
    private final int strictPayload5047 = 1248;

    /** @return the configured strictPayload5047. */
    public int getStrictPayload5047() {
        return strictPayload5047;
    }

    /** The staleTicket5048 this instance was configured with. */
    private final int staleTicket5048 = 4722;

    /** @return the configured staleTicket5048. */
    public int getStaleTicket5048() {
        return staleTicket5048;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return idleQueue + value;
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
        return idleQueue + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && idleQueue >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return idleQueue;
    }

}
