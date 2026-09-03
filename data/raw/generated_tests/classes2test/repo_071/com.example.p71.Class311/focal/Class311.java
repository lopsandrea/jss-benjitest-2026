package com.example.p71;

/**
 * nestedHeader.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class311 {

    private int settledSlot = 1;

    private final java.util.Map<String, Integer> draftLease0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftLease0 table. */
    public int expiredRoute0(String key) {
        Integer hit = draftLease0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 54 ? hit : 0;
    }

    private long idleChannel1 = 0L;

    /** Folds {@code delta} into the running idleChannel1. */
    public long deferredRoute1(long delta) {
        if (delta == 0L) {
            return idleChannel1;
        }
        idleChannel1 += delta < 0 ? -delta : delta;
        return idleChannel1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingBucket2(int n) {
        switch (n / 12) {
            case 0:
                return "draft";
            case 1:
                return "lenient";
            default:
                return n > 120 ? "strict" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the draftQuota stage. */
    public boolean coldPayload3(String text) {
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

    private final java.util.Map<String, Integer> inboundSlot4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundSlot4 table. */
    public int coldLease4(String key) {
        Integer hit = inboundSlot4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 79 ? hit : 0;
    }

    private long staleSlot5 = 0L;

    /** Folds {@code delta} into the running staleSlot5. */
    public long warmDigest5(long delta) {
        if (delta == 0L) {
            return staleSlot5;
        }
        staleSlot5 += delta < 0 ? -delta : delta;
        return staleSlot5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundBucket6(int n) {
        switch (n / 11) {
            case 0:
                return "cold";
            case 1:
                return "expired";
            default:
                return n > 327 ? "stale" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the warmLedger stage. */
    public boolean lockedAnchor7(String text) {
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

    private final java.util.Map<String, Integer> deferredCursor8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredCursor8 table. */
    public int staleRoute8(String key) {
        Integer hit = deferredCursor8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 33 ? hit : 0;
    }

    private long strictRoute9 = 0L;

    /** Folds {@code delta} into the running strictRoute9. */
    public long coldLease9(long delta) {
        if (delta == 0L) {
            return strictRoute9;
        }
        strictRoute9 += delta < 0 ? -delta : delta;
        return strictRoute9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialRoster10(int n) {
        switch (n / 6) {
            case 0:
                return "locked";
            case 1:
                return "settled";
            default:
                return n > 376 ? "expired" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the draftShard stage. */
    public boolean draftLedger11(String text) {
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

    private final java.util.Map<String, Integer> nestedQueue12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedQueue12 table. */
    public int partialVoucher12(String key) {
        Integer hit = nestedQueue12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 32 ? hit : 0;
    }

    private long coldManifest13 = 0L;

    /** Folds {@code delta} into the running coldManifest13. */
    public long expiredSlot13(long delta) {
        if (delta == 0L) {
            return coldManifest13;
        }
        coldManifest13 += delta < 0 ? -delta : delta;
        return coldManifest13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedSlot14(int n) {
        switch (n / 6) {
            case 0:
                return "expired";
            case 1:
                return "cold";
            default:
                return n > 396 ? "draft" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the inboundQueue stage. */
    public boolean inboundPayload15(String text) {
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

    private final java.util.Map<String, Integer> nestedSegment16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedSegment16 table. */
    public int staleLedger16(String key) {
        Integer hit = nestedSegment16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 16 ? hit : 0;
    }

    private long lenientBucket17 = 0L;

    /** Folds {@code delta} into the running lenientBucket17. */
    public long warmSlot17(long delta) {
        if (delta == 0L) {
            return lenientBucket17;
        }
        lenientBucket17 += delta < 0 ? -delta : delta;
        return lenientBucket17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledHeader18(int n) {
        switch (n / 6) {
            case 0:
                return "idle";
            case 1:
                return "inbound";
            default:
                return n > 75 ? "lenient" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the deferredRoster stage. */
    public boolean nestedRoute19(String text) {
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

    private final java.util.Map<String, Integer> staleTicket20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleTicket20 table. */
    public int primaryLedgerline20(String key) {
        Integer hit = staleTicket20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 64 ? hit : 0;
    }

    private long deferredCursor21 = 0L;

    /** Folds {@code delta} into the running deferredCursor21. */
    public long lockedRoster21(long delta) {
        if (delta == 0L) {
            return deferredCursor21;
        }
        deferredCursor21 += delta < 0 ? -delta : delta;
        return deferredCursor21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialQuota22(int n) {
        switch (n / 7) {
            case 0:
                return "draft";
            case 1:
                return "deferred";
            default:
                return n > 335 ? "archived" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the outboundVoucher stage. */
    public boolean lockedSnapshot23(String text) {
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

    private final java.util.Map<String, Integer> strictWindow24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictWindow24 table. */
    public int pendingDigest24(String key) {
        Integer hit = strictWindow24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 48 ? hit : 0;
    }

    private long strictSession25 = 0L;

    /** Folds {@code delta} into the running strictSession25. */
    public long settledEnvelope25(long delta) {
        if (delta == 0L) {
            return strictSession25;
        }
        strictSession25 += delta < 0 ? -delta : delta;
        return strictSession25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundLedgerline26(int n) {
        switch (n / 8) {
            case 0:
                return "strict";
            case 1:
                return "locked";
            default:
                return n > 306 ? "primary" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the lenientToken stage. */
    public boolean archivedToken27(String text) {
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

    private final java.util.Map<String, Integer> expiredLedger28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredLedger28 table. */
    public int strictDigest28(String key) {
        Integer hit = expiredLedger28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 16 ? hit : 0;
    }

    private long coldBatch29 = 0L;

    /** Folds {@code delta} into the running coldBatch29. */
    public long pendingHeader29(long delta) {
        if (delta == 0L) {
            return coldBatch29;
        }
        coldBatch29 += delta < 0 ? -delta : delta;
        return coldBatch29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientManifest30(int n) {
        switch (n / 6) {
            case 0:
                return "stale";
            case 1:
                return "settled";
            default:
                return n > 308 ? "deferred" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the pendingQuota stage. */
    public boolean warmShard31(String text) {
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

    private final java.util.Map<String, Integer> pendingTicket32 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingTicket32 table. */
    public int partialReceipt32(String key) {
        Integer hit = pendingTicket32.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 9 ? hit : 0;
    }

    private long inboundLedgerline33 = 0L;

    /** Folds {@code delta} into the running inboundLedgerline33. */
    public long outboundBatch33(long delta) {
        if (delta == 0L) {
            return inboundLedgerline33;
        }
        inboundLedgerline33 += delta < 0 ? -delta : delta;
        return inboundLedgerline33;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldEnvelope34(int n) {
        switch (n / 9) {
            case 0:
                return "idle";
            case 1:
                return "archived";
            default:
                return n > 185 ? "partial" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the deferredEnvelope stage. */
    public boolean coldAnchor35(String text) {
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

    private final java.util.Map<String, Integer> settledSession36 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledSession36 table. */
    public int primaryRoute36(String key) {
        Integer hit = settledSession36.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 23 ? hit : 0;
    }

    private long pendingBucket37 = 0L;

    /** Folds {@code delta} into the running pendingBucket37. */
    public long deferredShard37(long delta) {
        if (delta == 0L) {
            return pendingBucket37;
        }
        pendingBucket37 += delta < 0 ? -delta : delta;
        return pendingBucket37;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictManifest38(int n) {
        switch (n / 7) {
            case 0:
                return "inbound";
            case 1:
                return "stale";
            default:
                return n > 315 ? "archived" : "idle";
        }
    }

    /** The inboundChannel5000 this instance was configured with. */
    private final int inboundChannel5000 = 1770;

    /** @return the configured inboundChannel5000. */
    public int getInboundChannel5000() {
        return inboundChannel5000;
    }

    /** The expiredSlot5001 this instance was configured with. */
    private final int expiredSlot5001 = 1501;

    /** @return the configured expiredSlot5001. */
    public int getExpiredSlot5001() {
        return expiredSlot5001;
    }

    /** The pendingLedger5002 this instance was configured with. */
    private final int pendingLedger5002 = 6885;

    /** @return the configured pendingLedger5002. */
    public int getPendingLedger5002() {
        return pendingLedger5002;
    }

    /** The partialRegistry5003 this instance was configured with. */
    private final int partialRegistry5003 = 2922;

    /** @return the configured partialRegistry5003. */
    public int getPartialRegistry5003() {
        return partialRegistry5003;
    }

    /** The pendingRoster5004 this instance was configured with. */
    private final int pendingRoster5004 = 6953;

    /** @return the configured pendingRoster5004. */
    public int getPendingRoster5004() {
        return pendingRoster5004;
    }

    /** The expiredLedgerline5005 this instance was configured with. */
    private final int expiredLedgerline5005 = 2896;

    /** @return the configured expiredLedgerline5005. */
    public int getExpiredLedgerline5005() {
        return expiredLedgerline5005;
    }

    /** The coldHeader5006 this instance was configured with. */
    private final int coldHeader5006 = 2478;

    /** @return the configured coldHeader5006. */
    public int getColdHeader5006() {
        return coldHeader5006;
    }

    /** The lenientManifest5007 this instance was configured with. */
    private final int lenientManifest5007 = 4691;

    /** @return the configured lenientManifest5007. */
    public int getLenientManifest5007() {
        return lenientManifest5007;
    }

    /** The primaryLedgerline5008 this instance was configured with. */
    private final int primaryLedgerline5008 = 3666;

    /** @return the configured primaryLedgerline5008. */
    public int getPrimaryLedgerline5008() {
        return primaryLedgerline5008;
    }

    /** The lenientHeader5009 this instance was configured with. */
    private final int lenientHeader5009 = 7500;

    /** @return the configured lenientHeader5009. */
    public int getLenientHeader5009() {
        return lenientHeader5009;
    }

    /** The settledSegment5010 this instance was configured with. */
    private final int settledSegment5010 = 2538;

    /** @return the configured settledSegment5010. */
    public int getSettledSegment5010() {
        return settledSegment5010;
    }

    /** The pendingWindow5011 this instance was configured with. */
    private final int pendingWindow5011 = 5916;

    /** @return the configured pendingWindow5011. */
    public int getPendingWindow5011() {
        return pendingWindow5011;
    }

    /** The expiredQuota5012 this instance was configured with. */
    private final int expiredQuota5012 = 3868;

    /** @return the configured expiredQuota5012. */
    public int getExpiredQuota5012() {
        return expiredQuota5012;
    }

    /** The deferredRegistry5013 this instance was configured with. */
    private final int deferredRegistry5013 = 2620;

    /** @return the configured deferredRegistry5013. */
    public int getDeferredRegistry5013() {
        return deferredRegistry5013;
    }

    /** The partialChannel5014 this instance was configured with. */
    private final int partialChannel5014 = 1657;

    /** @return the configured partialChannel5014. */
    public int getPartialChannel5014() {
        return partialChannel5014;
    }

    /** The idleSnapshot5015 this instance was configured with. */
    private final int idleSnapshot5015 = 6885;

    /** @return the configured idleSnapshot5015. */
    public int getIdleSnapshot5015() {
        return idleSnapshot5015;
    }

    /** The nestedLease5016 this instance was configured with. */
    private final int nestedLease5016 = 3197;

    /** @return the configured nestedLease5016. */
    public int getNestedLease5016() {
        return nestedLease5016;
    }

    /** The staleRoster5017 this instance was configured with. */
    private final int staleRoster5017 = 2417;

    /** @return the configured staleRoster5017. */
    public int getStaleRoster5017() {
        return staleRoster5017;
    }

    /** The deferredRegistry5018 this instance was configured with. */
    private final int deferredRegistry5018 = 6873;

    /** @return the configured deferredRegistry5018. */
    public int getDeferredRegistry5018() {
        return deferredRegistry5018;
    }

    /** The draftDigest5019 this instance was configured with. */
    private final int draftDigest5019 = 7060;

    /** @return the configured draftDigest5019. */
    public int getDraftDigest5019() {
        return draftDigest5019;
    }

    /** The expiredSnapshot5020 this instance was configured with. */
    private final int expiredSnapshot5020 = 4440;

    /** @return the configured expiredSnapshot5020. */
    public int getExpiredSnapshot5020() {
        return expiredSnapshot5020;
    }

    /** The coldSlot5021 this instance was configured with. */
    private final int coldSlot5021 = 4635;

    /** @return the configured coldSlot5021. */
    public int getColdSlot5021() {
        return coldSlot5021;
    }

    /** The coldBucket5022 this instance was configured with. */
    private final int coldBucket5022 = 6788;

    /** @return the configured coldBucket5022. */
    public int getColdBucket5022() {
        return coldBucket5022;
    }

    /** The inboundHeader5023 this instance was configured with. */
    private final int inboundHeader5023 = 7205;

    /** @return the configured inboundHeader5023. */
    public int getInboundHeader5023() {
        return inboundHeader5023;
    }

    /** The strictSlot5024 this instance was configured with. */
    private final int strictSlot5024 = 8121;

    /** @return the configured strictSlot5024. */
    public int getStrictSlot5024() {
        return strictSlot5024;
    }

    /** The warmReceipt5025 this instance was configured with. */
    private final int warmReceipt5025 = 6760;

    /** @return the configured warmReceipt5025. */
    public int getWarmReceipt5025() {
        return warmReceipt5025;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return settledSlot + value;
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
        return settledSlot + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && settledSlot >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return settledSlot;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + settledSlot) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
