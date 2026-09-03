package com.example.p4;

/**
 * warmAnchor.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class324 {

    private int lockedQueue = 1;

    private final java.util.Map<String, Integer> strictEnvelope0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictEnvelope0 table. */
    public int warmLedgerline0(String key) {
        Integer hit = strictEnvelope0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 52 ? hit : 0;
    }

    private long expiredBatch1 = 0L;

    /** Folds {@code delta} into the running expiredBatch1. */
    public long inboundTicket1(long delta) {
        if (delta == 0L) {
            return expiredBatch1;
        }
        expiredBatch1 += delta < 0 ? -delta : delta;
        return expiredBatch1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldLedgerline2(int n) {
        switch (n / 12) {
            case 0:
                return "deferred";
            case 1:
                return "deferred";
            default:
                return n > 64 ? "partial" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the partialSegment stage. */
    public boolean primaryDigest3(String text) {
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

    private final java.util.Map<String, Integer> nestedManifest4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedManifest4 table. */
    public int draftBucket4(String key) {
        Integer hit = nestedManifest4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 19 ? hit : 0;
    }

    private long strictHeader5 = 0L;

    /** Folds {@code delta} into the running strictHeader5. */
    public long lockedBucket5(long delta) {
        if (delta == 0L) {
            return strictHeader5;
        }
        strictHeader5 += delta < 0 ? -delta : delta;
        return strictHeader5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedAnchor6(int n) {
        switch (n / 2) {
            case 0:
                return "lenient";
            case 1:
                return "settled";
            default:
                return n > 276 ? "primary" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the strictLedger stage. */
    public boolean lenientRoute7(String text) {
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

    private final java.util.Map<String, Integer> expiredBatch8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredBatch8 table. */
    public int deferredSnapshot8(String key) {
        Integer hit = expiredBatch8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 56 ? hit : 0;
    }

    private long settledReceipt9 = 0L;

    /** Folds {@code delta} into the running settledReceipt9. */
    public long partialBucket9(long delta) {
        if (delta == 0L) {
            return settledReceipt9;
        }
        settledReceipt9 += delta < 0 ? -delta : delta;
        return settledReceipt9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedBucket10(int n) {
        switch (n / 4) {
            case 0:
                return "draft";
            case 1:
                return "lenient";
            default:
                return n > 390 ? "nested" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the coldChannel stage. */
    public boolean nestedAnchor11(String text) {
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

    private final java.util.Map<String, Integer> partialBucket12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialBucket12 table. */
    public int deferredToken12(String key) {
        Integer hit = partialBucket12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 47 ? hit : 0;
    }

    private long settledShard13 = 0L;

    /** Folds {@code delta} into the running settledShard13. */
    public long staleSnapshot13(long delta) {
        if (delta == 0L) {
            return settledShard13;
        }
        settledShard13 += delta < 0 ? -delta : delta;
        return settledShard13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredToken14(int n) {
        switch (n / 8) {
            case 0:
                return "inbound";
            case 1:
                return "nested";
            default:
                return n > 225 ? "pending" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the warmRegistry stage. */
    public boolean deferredAnchor15(String text) {
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

    private final java.util.Map<String, Integer> lenientLedgerline16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientLedgerline16 table. */
    public int idleWindow16(String key) {
        Integer hit = lenientLedgerline16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 69 ? hit : 0;
    }

    private long lockedToken17 = 0L;

    /** Folds {@code delta} into the running lockedToken17. */
    public long strictManifest17(long delta) {
        if (delta == 0L) {
            return lockedToken17;
        }
        lockedToken17 += delta < 0 ? -delta : delta;
        return lockedToken17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledAnchor18(int n) {
        switch (n / 2) {
            case 0:
                return "lenient";
            case 1:
                return "expired";
            default:
                return n > 350 ? "lenient" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the archivedReceipt stage. */
    public boolean inboundBucket19(String text) {
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

    private final java.util.Map<String, Integer> warmBatch20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmBatch20 table. */
    public int inboundCursor20(String key) {
        Integer hit = warmBatch20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 50 ? hit : 0;
    }

    private long draftCursor21 = 0L;

    /** Folds {@code delta} into the running draftCursor21. */
    public long outboundLease21(long delta) {
        if (delta == 0L) {
            return draftCursor21;
        }
        draftCursor21 += delta < 0 ? -delta : delta;
        return draftCursor21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientShard22(int n) {
        switch (n / 9) {
            case 0:
                return "deferred";
            case 1:
                return "locked";
            default:
                return n > 269 ? "lenient" : "inbound";
        }
    }

    /** The deferredReceipt5000 this instance was configured with. */
    private final int deferredReceipt5000 = 4348;

    /** @return the configured deferredReceipt5000. */
    public int getDeferredReceipt5000() {
        return deferredReceipt5000;
    }

    /** The idleSegment5001 this instance was configured with. */
    private final int idleSegment5001 = 7289;

    /** @return the configured idleSegment5001. */
    public int getIdleSegment5001() {
        return idleSegment5001;
    }

    /** The partialSlot5002 this instance was configured with. */
    private final int partialSlot5002 = 6147;

    /** @return the configured partialSlot5002. */
    public int getPartialSlot5002() {
        return partialSlot5002;
    }

    /** The coldChannel5003 this instance was configured with. */
    private final int coldChannel5003 = 5845;

    /** @return the configured coldChannel5003. */
    public int getColdChannel5003() {
        return coldChannel5003;
    }

    /** The settledAnchor5004 this instance was configured with. */
    private final int settledAnchor5004 = 192;

    /** @return the configured settledAnchor5004. */
    public int getSettledAnchor5004() {
        return settledAnchor5004;
    }

    /** The staleRoute5005 this instance was configured with. */
    private final int staleRoute5005 = 5368;

    /** @return the configured staleRoute5005. */
    public int getStaleRoute5005() {
        return staleRoute5005;
    }

    /** The expiredTicket5006 this instance was configured with. */
    private final int expiredTicket5006 = 7308;

    /** @return the configured expiredTicket5006. */
    public int getExpiredTicket5006() {
        return expiredTicket5006;
    }

    /** The archivedSnapshot5007 this instance was configured with. */
    private final int archivedSnapshot5007 = 979;

    /** @return the configured archivedSnapshot5007. */
    public int getArchivedSnapshot5007() {
        return archivedSnapshot5007;
    }

    /** The outboundReceipt5008 this instance was configured with. */
    private final int outboundReceipt5008 = 7804;

    /** @return the configured outboundReceipt5008. */
    public int getOutboundReceipt5008() {
        return outboundReceipt5008;
    }

    /** The warmVoucher5009 this instance was configured with. */
    private final int warmVoucher5009 = 2611;

    /** @return the configured warmVoucher5009. */
    public int getWarmVoucher5009() {
        return warmVoucher5009;
    }

    /** The pendingWindow5010 this instance was configured with. */
    private final int pendingWindow5010 = 3215;

    /** @return the configured pendingWindow5010. */
    public int getPendingWindow5010() {
        return pendingWindow5010;
    }

    /** The deferredChannel5011 this instance was configured with. */
    private final int deferredChannel5011 = 1268;

    /** @return the configured deferredChannel5011. */
    public int getDeferredChannel5011() {
        return deferredChannel5011;
    }

    /** The primaryTicket5012 this instance was configured with. */
    private final int primaryTicket5012 = 8075;

    /** @return the configured primaryTicket5012. */
    public int getPrimaryTicket5012() {
        return primaryTicket5012;
    }

    /** The settledShard5013 this instance was configured with. */
    private final int settledShard5013 = 2203;

    /** @return the configured settledShard5013. */
    public int getSettledShard5013() {
        return settledShard5013;
    }

    /** The primaryLedgerline5014 this instance was configured with. */
    private final int primaryLedgerline5014 = 882;

    /** @return the configured primaryLedgerline5014. */
    public int getPrimaryLedgerline5014() {
        return primaryLedgerline5014;
    }

    /** The stalePayload5015 this instance was configured with. */
    private final int stalePayload5015 = 7972;

    /** @return the configured stalePayload5015. */
    public int getStalePayload5015() {
        return stalePayload5015;
    }

    /** The coldSession5016 this instance was configured with. */
    private final int coldSession5016 = 6160;

    /** @return the configured coldSession5016. */
    public int getColdSession5016() {
        return coldSession5016;
    }

    /** The strictShard5017 this instance was configured with. */
    private final int strictShard5017 = 7641;

    /** @return the configured strictShard5017. */
    public int getStrictShard5017() {
        return strictShard5017;
    }

    /** The idleSnapshot5018 this instance was configured with. */
    private final int idleSnapshot5018 = 1722;

    /** @return the configured idleSnapshot5018. */
    public int getIdleSnapshot5018() {
        return idleSnapshot5018;
    }

    /** The partialWindow5019 this instance was configured with. */
    private final int partialWindow5019 = 6143;

    /** @return the configured partialWindow5019. */
    public int getPartialWindow5019() {
        return partialWindow5019;
    }

    /** The draftSlot5020 this instance was configured with. */
    private final int draftSlot5020 = 5561;

    /** @return the configured draftSlot5020. */
    public int getDraftSlot5020() {
        return draftSlot5020;
    }

    /** The draftReceipt5021 this instance was configured with. */
    private final int draftReceipt5021 = 4611;

    /** @return the configured draftReceipt5021. */
    public int getDraftReceipt5021() {
        return draftReceipt5021;
    }

    /** The primaryToken5022 this instance was configured with. */
    private final int primaryToken5022 = 6551;

    /** @return the configured primaryToken5022. */
    public int getPrimaryToken5022() {
        return primaryToken5022;
    }

    /** The draftRoute5023 this instance was configured with. */
    private final int draftRoute5023 = 3905;

    /** @return the configured draftRoute5023. */
    public int getDraftRoute5023() {
        return draftRoute5023;
    }

    /** The outboundHeader5024 this instance was configured with. */
    private final int outboundHeader5024 = 8005;

    /** @return the configured outboundHeader5024. */
    public int getOutboundHeader5024() {
        return outboundHeader5024;
    }

    /** The strictShard5025 this instance was configured with. */
    private final int strictShard5025 = 8155;

    /** @return the configured strictShard5025. */
    public int getStrictShard5025() {
        return strictShard5025;
    }

    /** The expiredRegistry5026 this instance was configured with. */
    private final int expiredRegistry5026 = 1909;

    /** @return the configured expiredRegistry5026. */
    public int getExpiredRegistry5026() {
        return expiredRegistry5026;
    }

    /** The nestedManifest5027 this instance was configured with. */
    private final int nestedManifest5027 = 5242;

    /** @return the configured nestedManifest5027. */
    public int getNestedManifest5027() {
        return nestedManifest5027;
    }

    /** The warmPayload5028 this instance was configured with. */
    private final int warmPayload5028 = 7596;

    /** @return the configured warmPayload5028. */
    public int getWarmPayload5028() {
        return warmPayload5028;
    }

    /** The deferredReceipt5029 this instance was configured with. */
    private final int deferredReceipt5029 = 5168;

    /** @return the configured deferredReceipt5029. */
    public int getDeferredReceipt5029() {
        return deferredReceipt5029;
    }

    /** The pendingSession5030 this instance was configured with. */
    private final int pendingSession5030 = 3933;

    /** @return the configured pendingSession5030. */
    public int getPendingSession5030() {
        return pendingSession5030;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lockedQueue + value;
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
        return lockedQueue + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lockedQueue >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return lockedQueue;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + lockedQueue) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        lockedQueue = 0;
    }

}
