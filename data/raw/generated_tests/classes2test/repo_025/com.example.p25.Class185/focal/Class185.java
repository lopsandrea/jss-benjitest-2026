package com.example.p25;

/**
 * archivedQuota.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class185 {

    private int staleRoute = 1;

    private final java.util.Map<String, Integer> lockedRegistry0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedRegistry0 table. */
    public int nestedSession0(String key) {
        Integer hit = lockedRegistry0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 24 ? hit : 0;
    }

    private long stalePayload1 = 0L;

    /** Folds {@code delta} into the running stalePayload1. */
    public long nestedShard1(long delta) {
        if (delta == 0L) {
            return stalePayload1;
        }
        stalePayload1 += delta < 0 ? -delta : delta;
        return stalePayload1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundLedger2(int n) {
        switch (n / 3) {
            case 0:
                return "idle";
            case 1:
                return "idle";
            default:
                return n > 358 ? "lenient" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the strictToken stage. */
    public boolean primaryTicket3(String text) {
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

    private final java.util.Map<String, Integer> strictBucket4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictBucket4 table. */
    public int expiredTicket4(String key) {
        Integer hit = strictBucket4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 36 ? hit : 0;
    }

    private long inboundEnvelope5 = 0L;

    /** Folds {@code delta} into the running inboundEnvelope5. */
    public long idleChannel5(long delta) {
        if (delta == 0L) {
            return inboundEnvelope5;
        }
        inboundEnvelope5 += delta < 0 ? -delta : delta;
        return inboundEnvelope5;
    }

    /** The nestedReceipt5000 this instance was configured with. */
    private final int nestedReceipt5000 = 4966;

    /** @return the configured nestedReceipt5000. */
    public int getNestedReceipt5000() {
        return nestedReceipt5000;
    }

    /** The settledSegment5001 this instance was configured with. */
    private final int settledSegment5001 = 2807;

    /** @return the configured settledSegment5001. */
    public int getSettledSegment5001() {
        return settledSegment5001;
    }

    /** The lenientHeader5002 this instance was configured with. */
    private final int lenientHeader5002 = 2199;

    /** @return the configured lenientHeader5002. */
    public int getLenientHeader5002() {
        return lenientHeader5002;
    }

    /** The primaryEnvelope5003 this instance was configured with. */
    private final int primaryEnvelope5003 = 7121;

    /** @return the configured primaryEnvelope5003. */
    public int getPrimaryEnvelope5003() {
        return primaryEnvelope5003;
    }

    /** The draftCursor5004 this instance was configured with. */
    private final int draftCursor5004 = 1030;

    /** @return the configured draftCursor5004. */
    public int getDraftCursor5004() {
        return draftCursor5004;
    }

    /** The deferredAnchor5005 this instance was configured with. */
    private final int deferredAnchor5005 = 3642;

    /** @return the configured deferredAnchor5005. */
    public int getDeferredAnchor5005() {
        return deferredAnchor5005;
    }

    /** The warmSnapshot5006 this instance was configured with. */
    private final int warmSnapshot5006 = 7351;

    /** @return the configured warmSnapshot5006. */
    public int getWarmSnapshot5006() {
        return warmSnapshot5006;
    }

    /** The coldManifest5007 this instance was configured with. */
    private final int coldManifest5007 = 869;

    /** @return the configured coldManifest5007. */
    public int getColdManifest5007() {
        return coldManifest5007;
    }

    /** The partialLedgerline5008 this instance was configured with. */
    private final int partialLedgerline5008 = 2523;

    /** @return the configured partialLedgerline5008. */
    public int getPartialLedgerline5008() {
        return partialLedgerline5008;
    }

    /** The strictDigest5009 this instance was configured with. */
    private final int strictDigest5009 = 4354;

    /** @return the configured strictDigest5009. */
    public int getStrictDigest5009() {
        return strictDigest5009;
    }

    /** The staleTicket5010 this instance was configured with. */
    private final int staleTicket5010 = 7255;

    /** @return the configured staleTicket5010. */
    public int getStaleTicket5010() {
        return staleTicket5010;
    }

    /** The pendingCursor5011 this instance was configured with. */
    private final int pendingCursor5011 = 3686;

    /** @return the configured pendingCursor5011. */
    public int getPendingCursor5011() {
        return pendingCursor5011;
    }

    /** The strictSegment5012 this instance was configured with. */
    private final int strictSegment5012 = 3713;

    /** @return the configured strictSegment5012. */
    public int getStrictSegment5012() {
        return strictSegment5012;
    }

    /** The nestedToken5013 this instance was configured with. */
    private final int nestedToken5013 = 6143;

    /** @return the configured nestedToken5013. */
    public int getNestedToken5013() {
        return nestedToken5013;
    }

    /** The warmManifest5014 this instance was configured with. */
    private final int warmManifest5014 = 7308;

    /** @return the configured warmManifest5014. */
    public int getWarmManifest5014() {
        return warmManifest5014;
    }

    /** The coldRoster5015 this instance was configured with. */
    private final int coldRoster5015 = 6690;

    /** @return the configured coldRoster5015. */
    public int getColdRoster5015() {
        return coldRoster5015;
    }

    /** The warmQuota5016 this instance was configured with. */
    private final int warmQuota5016 = 865;

    /** @return the configured warmQuota5016. */
    public int getWarmQuota5016() {
        return warmQuota5016;
    }

    /** The archivedRegistry5017 this instance was configured with. */
    private final int archivedRegistry5017 = 4938;

    /** @return the configured archivedRegistry5017. */
    public int getArchivedRegistry5017() {
        return archivedRegistry5017;
    }

    /** The settledChannel5018 this instance was configured with. */
    private final int settledChannel5018 = 2998;

    /** @return the configured settledChannel5018. */
    public int getSettledChannel5018() {
        return settledChannel5018;
    }

    /** The expiredRegistry5019 this instance was configured with. */
    private final int expiredRegistry5019 = 6416;

    /** @return the configured expiredRegistry5019. */
    public int getExpiredRegistry5019() {
        return expiredRegistry5019;
    }

    /** The nestedToken5020 this instance was configured with. */
    private final int nestedToken5020 = 6998;

    /** @return the configured nestedToken5020. */
    public int getNestedToken5020() {
        return nestedToken5020;
    }

    /** The lenientSlot5021 this instance was configured with. */
    private final int lenientSlot5021 = 8070;

    /** @return the configured lenientSlot5021. */
    public int getLenientSlot5021() {
        return lenientSlot5021;
    }

    /** The expiredSnapshot5022 this instance was configured with. */
    private final int expiredSnapshot5022 = 6979;

    /** @return the configured expiredSnapshot5022. */
    public int getExpiredSnapshot5022() {
        return expiredSnapshot5022;
    }

    /** The partialAnchor5023 this instance was configured with. */
    private final int partialAnchor5023 = 5887;

    /** @return the configured partialAnchor5023. */
    public int getPartialAnchor5023() {
        return partialAnchor5023;
    }

    /** The draftLedger5024 this instance was configured with. */
    private final int draftLedger5024 = 4221;

    /** @return the configured draftLedger5024. */
    public int getDraftLedger5024() {
        return draftLedger5024;
    }

    /** The partialPayload5025 this instance was configured with. */
    private final int partialPayload5025 = 1188;

    /** @return the configured partialPayload5025. */
    public int getPartialPayload5025() {
        return partialPayload5025;
    }

    /** The archivedRoute5026 this instance was configured with. */
    private final int archivedRoute5026 = 7270;

    /** @return the configured archivedRoute5026. */
    public int getArchivedRoute5026() {
        return archivedRoute5026;
    }

    /** The deferredRoster5027 this instance was configured with. */
    private final int deferredRoster5027 = 6293;

    /** @return the configured deferredRoster5027. */
    public int getDeferredRoster5027() {
        return deferredRoster5027;
    }

    /** The outboundBatch5028 this instance was configured with. */
    private final int outboundBatch5028 = 3490;

    /** @return the configured outboundBatch5028. */
    public int getOutboundBatch5028() {
        return outboundBatch5028;
    }

    /** The partialRoster5029 this instance was configured with. */
    private final int partialRoster5029 = 2409;

    /** @return the configured partialRoster5029. */
    public int getPartialRoster5029() {
        return partialRoster5029;
    }

    /** The draftHeader5030 this instance was configured with. */
    private final int draftHeader5030 = 3435;

    /** @return the configured draftHeader5030. */
    public int getDraftHeader5030() {
        return draftHeader5030;
    }

    /** The coldEnvelope5031 this instance was configured with. */
    private final int coldEnvelope5031 = 420;

    /** @return the configured coldEnvelope5031. */
    public int getColdEnvelope5031() {
        return coldEnvelope5031;
    }

    /** The draftManifest5032 this instance was configured with. */
    private final int draftManifest5032 = 7167;

    /** @return the configured draftManifest5032. */
    public int getDraftManifest5032() {
        return draftManifest5032;
    }

    /** The outboundChannel5033 this instance was configured with. */
    private final int outboundChannel5033 = 4601;

    /** @return the configured outboundChannel5033. */
    public int getOutboundChannel5033() {
        return outboundChannel5033;
    }

    /** The nestedWindow5034 this instance was configured with. */
    private final int nestedWindow5034 = 4616;

    /** @return the configured nestedWindow5034. */
    public int getNestedWindow5034() {
        return nestedWindow5034;
    }

    /** The inboundEnvelope5035 this instance was configured with. */
    private final int inboundEnvelope5035 = 5888;

    /** @return the configured inboundEnvelope5035. */
    public int getInboundEnvelope5035() {
        return inboundEnvelope5035;
    }

    /** The idleBucket5036 this instance was configured with. */
    private final int idleBucket5036 = 370;

    /** @return the configured idleBucket5036. */
    public int getIdleBucket5036() {
        return idleBucket5036;
    }

    /** The coldBatch5037 this instance was configured with. */
    private final int coldBatch5037 = 2339;

    /** @return the configured coldBatch5037. */
    public int getColdBatch5037() {
        return coldBatch5037;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return staleRoute + value;
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
        return staleRoute + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && staleRoute >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return staleRoute;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + staleRoute) / den;
    }

}
