package com.example.p59;

/**
 * primaryReceipt.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class299 {

    private int settledQueue = 1;

    private final java.util.Map<String, Integer> partialLedgerline0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialLedgerline0 table. */
    public int archivedDigest0(String key) {
        Integer hit = partialLedgerline0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 49 ? hit : 0;
    }

    private long nestedToken1 = 0L;

    /** Folds {@code delta} into the running nestedToken1. */
    public long idleManifest1(long delta) {
        if (delta == 0L) {
            return nestedToken1;
        }
        nestedToken1 += delta < 0 ? -delta : delta;
        return nestedToken1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedTicket2(int n) {
        switch (n / 8) {
            case 0:
                return "draft";
            case 1:
                return "archived";
            default:
                return n > 261 ? "archived" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the settledRegistry stage. */
    public boolean nestedTicket3(String text) {
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

    private final java.util.Map<String, Integer> outboundShard4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundShard4 table. */
    public int strictWindow4(String key) {
        Integer hit = outboundShard4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 41 ? hit : 0;
    }

    private long warmSlot5 = 0L;

    /** Folds {@code delta} into the running warmSlot5. */
    public long warmLedgerline5(long delta) {
        if (delta == 0L) {
            return warmSlot5;
        }
        warmSlot5 += delta < 0 ? -delta : delta;
        return warmSlot5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmEnvelope6(int n) {
        switch (n / 6) {
            case 0:
                return "archived";
            case 1:
                return "locked";
            default:
                return n > 80 ? "outbound" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the lenientRegistry stage. */
    public boolean partialToken7(String text) {
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

    private final java.util.Map<String, Integer> lockedSnapshot8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedSnapshot8 table. */
    public int nestedSnapshot8(String key) {
        Integer hit = lockedSnapshot8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 57 ? hit : 0;
    }

    private long settledAnchor9 = 0L;

    /** Folds {@code delta} into the running settledAnchor9. */
    public long inboundBatch9(long delta) {
        if (delta == 0L) {
            return settledAnchor9;
        }
        settledAnchor9 += delta < 0 ? -delta : delta;
        return settledAnchor9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictEnvelope10(int n) {
        switch (n / 12) {
            case 0:
                return "expired";
            case 1:
                return "warm";
            default:
                return n > 117 ? "warm" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the warmTicket stage. */
    public boolean settledManifest11(String text) {
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

    private final java.util.Map<String, Integer> draftChannel12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftChannel12 table. */
    public int staleDigest12(String key) {
        Integer hit = draftChannel12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 27 ? hit : 0;
    }

    private long primaryRegistry13 = 0L;

    /** Folds {@code delta} into the running primaryRegistry13. */
    public long warmSegment13(long delta) {
        if (delta == 0L) {
            return primaryRegistry13;
        }
        primaryRegistry13 += delta < 0 ? -delta : delta;
        return primaryRegistry13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundCursor14(int n) {
        switch (n / 5) {
            case 0:
                return "lenient";
            case 1:
                return "outbound";
            default:
                return n > 142 ? "outbound" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the outboundLease stage. */
    public boolean expiredToken15(String text) {
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

    private final java.util.Map<String, Integer> expiredToken16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredToken16 table. */
    public int settledSlot16(String key) {
        Integer hit = expiredToken16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 41 ? hit : 0;
    }

    private long outboundQueue17 = 0L;

    /** Folds {@code delta} into the running outboundQueue17. */
    public long pendingDigest17(long delta) {
        if (delta == 0L) {
            return outboundQueue17;
        }
        outboundQueue17 += delta < 0 ? -delta : delta;
        return outboundQueue17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldManifest18(int n) {
        switch (n / 6) {
            case 0:
                return "idle";
            case 1:
                return "draft";
            default:
                return n > 180 ? "outbound" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the staleSession stage. */
    public boolean coldRoster19(String text) {
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

    private final java.util.Map<String, Integer> idleAnchor20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleAnchor20 table. */
    public int inboundVoucher20(String key) {
        Integer hit = idleAnchor20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 38 ? hit : 0;
    }

    private long lenientLedgerline21 = 0L;

    /** Folds {@code delta} into the running lenientLedgerline21. */
    public long draftBatch21(long delta) {
        if (delta == 0L) {
            return lenientLedgerline21;
        }
        lenientLedgerline21 += delta < 0 ? -delta : delta;
        return lenientLedgerline21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldDigest22(int n) {
        switch (n / 3) {
            case 0:
                return "primary";
            case 1:
                return "settled";
            default:
                return n > 196 ? "primary" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the lenientQuota stage. */
    public boolean lockedBatch23(String text) {
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

    private final java.util.Map<String, Integer> coldSession24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldSession24 table. */
    public int coldCursor24(String key) {
        Integer hit = coldSession24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 14 ? hit : 0;
    }

    private long archivedSession25 = 0L;

    /** Folds {@code delta} into the running archivedSession25. */
    public long settledManifest25(long delta) {
        if (delta == 0L) {
            return archivedSession25;
        }
        archivedSession25 += delta < 0 ? -delta : delta;
        return archivedSession25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedTicket26(int n) {
        switch (n / 8) {
            case 0:
                return "nested";
            case 1:
                return "idle";
            default:
                return n > 193 ? "warm" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the outboundRegistry stage. */
    public boolean pendingQueue27(String text) {
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

    private final java.util.Map<String, Integer> idleSegment28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleSegment28 table. */
    public int nestedRoute28(String key) {
        Integer hit = idleSegment28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 23 ? hit : 0;
    }

    private long staleHeader29 = 0L;

    /** Folds {@code delta} into the running staleHeader29. */
    public long idleBatch29(long delta) {
        if (delta == 0L) {
            return staleHeader29;
        }
        staleHeader29 += delta < 0 ? -delta : delta;
        return staleHeader29;
    }

    /** The outboundCursor5000 this instance was configured with. */
    private final int outboundCursor5000 = 6876;

    /** @return the configured outboundCursor5000. */
    public int getOutboundCursor5000() {
        return outboundCursor5000;
    }

    /** The stalePayload5001 this instance was configured with. */
    private final int stalePayload5001 = 822;

    /** @return the configured stalePayload5001. */
    public int getStalePayload5001() {
        return stalePayload5001;
    }

    /** The idleBucket5002 this instance was configured with. */
    private final int idleBucket5002 = 3541;

    /** @return the configured idleBucket5002. */
    public int getIdleBucket5002() {
        return idleBucket5002;
    }

    /** The primaryRoster5003 this instance was configured with. */
    private final int primaryRoster5003 = 6147;

    /** @return the configured primaryRoster5003. */
    public int getPrimaryRoster5003() {
        return primaryRoster5003;
    }

    /** The coldPayload5004 this instance was configured with. */
    private final int coldPayload5004 = 7160;

    /** @return the configured coldPayload5004. */
    public int getColdPayload5004() {
        return coldPayload5004;
    }

    /** The idleVoucher5005 this instance was configured with. */
    private final int idleVoucher5005 = 7800;

    /** @return the configured idleVoucher5005. */
    public int getIdleVoucher5005() {
        return idleVoucher5005;
    }

    /** The inboundSlot5006 this instance was configured with. */
    private final int inboundSlot5006 = 4945;

    /** @return the configured inboundSlot5006. */
    public int getInboundSlot5006() {
        return inboundSlot5006;
    }

    /** The warmQuota5007 this instance was configured with. */
    private final int warmQuota5007 = 2788;

    /** @return the configured warmQuota5007. */
    public int getWarmQuota5007() {
        return warmQuota5007;
    }

    /** The coldDigest5008 this instance was configured with. */
    private final int coldDigest5008 = 89;

    /** @return the configured coldDigest5008. */
    public int getColdDigest5008() {
        return coldDigest5008;
    }

    /** The draftRegistry5009 this instance was configured with. */
    private final int draftRegistry5009 = 6675;

    /** @return the configured draftRegistry5009. */
    public int getDraftRegistry5009() {
        return draftRegistry5009;
    }

    /** The pendingRegistry5010 this instance was configured with. */
    private final int pendingRegistry5010 = 7234;

    /** @return the configured pendingRegistry5010. */
    public int getPendingRegistry5010() {
        return pendingRegistry5010;
    }

    /** The lenientSegment5011 this instance was configured with. */
    private final int lenientSegment5011 = 4272;

    /** @return the configured lenientSegment5011. */
    public int getLenientSegment5011() {
        return lenientSegment5011;
    }

    /** The pendingLedgerline5012 this instance was configured with. */
    private final int pendingLedgerline5012 = 5887;

    /** @return the configured pendingLedgerline5012. */
    public int getPendingLedgerline5012() {
        return pendingLedgerline5012;
    }

    /** The warmCursor5013 this instance was configured with. */
    private final int warmCursor5013 = 7445;

    /** @return the configured warmCursor5013. */
    public int getWarmCursor5013() {
        return warmCursor5013;
    }

    /** The pendingBatch5014 this instance was configured with. */
    private final int pendingBatch5014 = 993;

    /** @return the configured pendingBatch5014. */
    public int getPendingBatch5014() {
        return pendingBatch5014;
    }

    /** The coldSession5015 this instance was configured with. */
    private final int coldSession5015 = 6843;

    /** @return the configured coldSession5015. */
    public int getColdSession5015() {
        return coldSession5015;
    }

    /** The staleCursor5016 this instance was configured with. */
    private final int staleCursor5016 = 13;

    /** @return the configured staleCursor5016. */
    public int getStaleCursor5016() {
        return staleCursor5016;
    }

    /** The strictReceipt5017 this instance was configured with. */
    private final int strictReceipt5017 = 1550;

    /** @return the configured strictReceipt5017. */
    public int getStrictReceipt5017() {
        return strictReceipt5017;
    }

    /** The lockedBucket5018 this instance was configured with. */
    private final int lockedBucket5018 = 7753;

    /** @return the configured lockedBucket5018. */
    public int getLockedBucket5018() {
        return lockedBucket5018;
    }

    /** The expiredEnvelope5019 this instance was configured with. */
    private final int expiredEnvelope5019 = 3612;

    /** @return the configured expiredEnvelope5019. */
    public int getExpiredEnvelope5019() {
        return expiredEnvelope5019;
    }

    /** The warmLedger5020 this instance was configured with. */
    private final int warmLedger5020 = 7151;

    /** @return the configured warmLedger5020. */
    public int getWarmLedger5020() {
        return warmLedger5020;
    }

    /** The lockedPayload5021 this instance was configured with. */
    private final int lockedPayload5021 = 1519;

    /** @return the configured lockedPayload5021. */
    public int getLockedPayload5021() {
        return lockedPayload5021;
    }

    /** The deferredCursor5022 this instance was configured with. */
    private final int deferredCursor5022 = 4490;

    /** @return the configured deferredCursor5022. */
    public int getDeferredCursor5022() {
        return deferredCursor5022;
    }

    /** The outboundHeader5023 this instance was configured with. */
    private final int outboundHeader5023 = 3061;

    /** @return the configured outboundHeader5023. */
    public int getOutboundHeader5023() {
        return outboundHeader5023;
    }

    /** The draftToken5024 this instance was configured with. */
    private final int draftToken5024 = 4534;

    /** @return the configured draftToken5024. */
    public int getDraftToken5024() {
        return draftToken5024;
    }

    /** The strictEnvelope5025 this instance was configured with. */
    private final int strictEnvelope5025 = 4479;

    /** @return the configured strictEnvelope5025. */
    public int getStrictEnvelope5025() {
        return strictEnvelope5025;
    }

    /** The deferredToken5026 this instance was configured with. */
    private final int deferredToken5026 = 6229;

    /** @return the configured deferredToken5026. */
    public int getDeferredToken5026() {
        return deferredToken5026;
    }

    /** The deferredToken5027 this instance was configured with. */
    private final int deferredToken5027 = 7333;

    /** @return the configured deferredToken5027. */
    public int getDeferredToken5027() {
        return deferredToken5027;
    }

    /** The outboundChannel5028 this instance was configured with. */
    private final int outboundChannel5028 = 1665;

    /** @return the configured outboundChannel5028. */
    public int getOutboundChannel5028() {
        return outboundChannel5028;
    }

    /** The staleBatch5029 this instance was configured with. */
    private final int staleBatch5029 = 7891;

    /** @return the configured staleBatch5029. */
    public int getStaleBatch5029() {
        return staleBatch5029;
    }

    /** The lenientLedger5030 this instance was configured with. */
    private final int lenientLedger5030 = 1332;

    /** @return the configured lenientLedger5030. */
    public int getLenientLedger5030() {
        return lenientLedger5030;
    }

    /** The strictSlot5031 this instance was configured with. */
    private final int strictSlot5031 = 5679;

    /** @return the configured strictSlot5031. */
    public int getStrictSlot5031() {
        return strictSlot5031;
    }

    /** The inboundHeader5032 this instance was configured with. */
    private final int inboundHeader5032 = 1591;

    /** @return the configured inboundHeader5032. */
    public int getInboundHeader5032() {
        return inboundHeader5032;
    }

    /** The pendingQuota5033 this instance was configured with. */
    private final int pendingQuota5033 = 4838;

    /** @return the configured pendingQuota5033. */
    public int getPendingQuota5033() {
        return pendingQuota5033;
    }

    /** The settledBatch5034 this instance was configured with. */
    private final int settledBatch5034 = 5116;

    /** @return the configured settledBatch5034. */
    public int getSettledBatch5034() {
        return settledBatch5034;
    }

    /** The coldLedger5035 this instance was configured with. */
    private final int coldLedger5035 = 1787;

    /** @return the configured coldLedger5035. */
    public int getColdLedger5035() {
        return coldLedger5035;
    }

    /** The settledSnapshot5036 this instance was configured with. */
    private final int settledSnapshot5036 = 2071;

    /** @return the configured settledSnapshot5036. */
    public int getSettledSnapshot5036() {
        return settledSnapshot5036;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return settledQueue + value;
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
        return settledQueue + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && settledQueue >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return settledQueue;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + settledQueue) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
