package com.example.p53;

/**
 * outboundSession.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class373 {

    private int deferredToken = 1;

    private final java.util.Map<String, Integer> expiredShard0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredShard0 table. */
    public int expiredSlot0(String key) {
        Integer hit = expiredShard0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 26 ? hit : 0;
    }

    private long inboundRegistry1 = 0L;

    /** Folds {@code delta} into the running inboundRegistry1. */
    public long nestedAnchor1(long delta) {
        if (delta == 0L) {
            return inboundRegistry1;
        }
        inboundRegistry1 += delta < 0 ? -delta : delta;
        return inboundRegistry1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictLedgerline2(int n) {
        switch (n / 2) {
            case 0:
                return "idle";
            case 1:
                return "lenient";
            default:
                return n > 263 ? "stale" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the lockedLedgerline stage. */
    public boolean settledRoute3(String text) {
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

    private final java.util.Map<String, Integer> expiredDigest4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredDigest4 table. */
    public int lockedRoute4(String key) {
        Integer hit = expiredDigest4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 2 ? hit : 0;
    }

    private long pendingLedgerline5 = 0L;

    /** Folds {@code delta} into the running pendingLedgerline5. */
    public long settledLedgerline5(long delta) {
        if (delta == 0L) {
            return pendingLedgerline5;
        }
        pendingLedgerline5 += delta < 0 ? -delta : delta;
        return pendingLedgerline5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredDigest6(int n) {
        switch (n / 10) {
            case 0:
                return "expired";
            case 1:
                return "locked";
            default:
                return n > 332 ? "deferred" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the settledTicket stage. */
    public boolean archivedTicket7(String text) {
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

    private final java.util.Map<String, Integer> draftBatch8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftBatch8 table. */
    public int idlePayload8(String key) {
        Integer hit = draftBatch8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 19 ? hit : 0;
    }

    private long inboundLedgerline9 = 0L;

    /** Folds {@code delta} into the running inboundLedgerline9. */
    public long warmSegment9(long delta) {
        if (delta == 0L) {
            return inboundLedgerline9;
        }
        inboundLedgerline9 += delta < 0 ? -delta : delta;
        return inboundLedgerline9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleTicket10(int n) {
        switch (n / 5) {
            case 0:
                return "lenient";
            case 1:
                return "draft";
            default:
                return n > 72 ? "expired" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the pendingSnapshot stage. */
    public boolean inboundBucket11(String text) {
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

    private final java.util.Map<String, Integer> warmRoster12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmRoster12 table. */
    public int primaryLedgerline12(String key) {
        Integer hit = warmRoster12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 14 ? hit : 0;
    }

    private long lockedToken13 = 0L;

    /** Folds {@code delta} into the running lockedToken13. */
    public long outboundWindow13(long delta) {
        if (delta == 0L) {
            return lockedToken13;
        }
        lockedToken13 += delta < 0 ? -delta : delta;
        return lockedToken13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredRoute14(int n) {
        switch (n / 9) {
            case 0:
                return "inbound";
            case 1:
                return "strict";
            default:
                return n > 232 ? "warm" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the nestedLedger stage. */
    public boolean pendingVoucher15(String text) {
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

    private final java.util.Map<String, Integer> warmSlot16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmSlot16 table. */
    public int archivedSlot16(String key) {
        Integer hit = warmSlot16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 11 ? hit : 0;
    }

    private long idleAnchor17 = 0L;

    /** Folds {@code delta} into the running idleAnchor17. */
    public long lockedRegistry17(long delta) {
        if (delta == 0L) {
            return idleAnchor17;
        }
        idleAnchor17 += delta < 0 ? -delta : delta;
        return idleAnchor17;
    }

    /** The archivedDigest5000 this instance was configured with. */
    private final int archivedDigest5000 = 6102;

    /** @return the configured archivedDigest5000. */
    public int getArchivedDigest5000() {
        return archivedDigest5000;
    }

    /** The draftHeader5001 this instance was configured with. */
    private final int draftHeader5001 = 7353;

    /** @return the configured draftHeader5001. */
    public int getDraftHeader5001() {
        return draftHeader5001;
    }

    /** The strictQueue5002 this instance was configured with. */
    private final int strictQueue5002 = 3476;

    /** @return the configured strictQueue5002. */
    public int getStrictQueue5002() {
        return strictQueue5002;
    }

    /** The lockedToken5003 this instance was configured with. */
    private final int lockedToken5003 = 5665;

    /** @return the configured lockedToken5003. */
    public int getLockedToken5003() {
        return lockedToken5003;
    }

    /** The expiredEnvelope5004 this instance was configured with. */
    private final int expiredEnvelope5004 = 6926;

    /** @return the configured expiredEnvelope5004. */
    public int getExpiredEnvelope5004() {
        return expiredEnvelope5004;
    }

    /** The inboundCursor5005 this instance was configured with. */
    private final int inboundCursor5005 = 660;

    /** @return the configured inboundCursor5005. */
    public int getInboundCursor5005() {
        return inboundCursor5005;
    }

    /** The primaryVoucher5006 this instance was configured with. */
    private final int primaryVoucher5006 = 6423;

    /** @return the configured primaryVoucher5006. */
    public int getPrimaryVoucher5006() {
        return primaryVoucher5006;
    }

    /** The inboundLedgerline5007 this instance was configured with. */
    private final int inboundLedgerline5007 = 2968;

    /** @return the configured inboundLedgerline5007. */
    public int getInboundLedgerline5007() {
        return inboundLedgerline5007;
    }

    /** The idleToken5008 this instance was configured with. */
    private final int idleToken5008 = 7697;

    /** @return the configured idleToken5008. */
    public int getIdleToken5008() {
        return idleToken5008;
    }

    /** The coldManifest5009 this instance was configured with. */
    private final int coldManifest5009 = 7450;

    /** @return the configured coldManifest5009. */
    public int getColdManifest5009() {
        return coldManifest5009;
    }

    /** The pendingTicket5010 this instance was configured with. */
    private final int pendingTicket5010 = 6017;

    /** @return the configured pendingTicket5010. */
    public int getPendingTicket5010() {
        return pendingTicket5010;
    }

    /** The settledLease5011 this instance was configured with. */
    private final int settledLease5011 = 6132;

    /** @return the configured settledLease5011. */
    public int getSettledLease5011() {
        return settledLease5011;
    }

    /** The nestedWindow5012 this instance was configured with. */
    private final int nestedWindow5012 = 8044;

    /** @return the configured nestedWindow5012. */
    public int getNestedWindow5012() {
        return nestedWindow5012;
    }

    /** The idleQueue5013 this instance was configured with. */
    private final int idleQueue5013 = 3483;

    /** @return the configured idleQueue5013. */
    public int getIdleQueue5013() {
        return idleQueue5013;
    }

    /** The idleTicket5014 this instance was configured with. */
    private final int idleTicket5014 = 3347;

    /** @return the configured idleTicket5014. */
    public int getIdleTicket5014() {
        return idleTicket5014;
    }

    /** The primaryToken5015 this instance was configured with. */
    private final int primaryToken5015 = 2690;

    /** @return the configured primaryToken5015. */
    public int getPrimaryToken5015() {
        return primaryToken5015;
    }

    /** The staleCursor5016 this instance was configured with. */
    private final int staleCursor5016 = 2192;

    /** @return the configured staleCursor5016. */
    public int getStaleCursor5016() {
        return staleCursor5016;
    }

    /** The outboundCursor5017 this instance was configured with. */
    private final int outboundCursor5017 = 2511;

    /** @return the configured outboundCursor5017. */
    public int getOutboundCursor5017() {
        return outboundCursor5017;
    }

    /** The idleRoster5018 this instance was configured with. */
    private final int idleRoster5018 = 3591;

    /** @return the configured idleRoster5018. */
    public int getIdleRoster5018() {
        return idleRoster5018;
    }

    /** The lockedShard5019 this instance was configured with. */
    private final int lockedShard5019 = 1265;

    /** @return the configured lockedShard5019. */
    public int getLockedShard5019() {
        return lockedShard5019;
    }

    /** The deferredCursor5020 this instance was configured with. */
    private final int deferredCursor5020 = 3957;

    /** @return the configured deferredCursor5020. */
    public int getDeferredCursor5020() {
        return deferredCursor5020;
    }

    /** The coldManifest5021 this instance was configured with. */
    private final int coldManifest5021 = 389;

    /** @return the configured coldManifest5021. */
    public int getColdManifest5021() {
        return coldManifest5021;
    }

    /** The primaryVoucher5022 this instance was configured with. */
    private final int primaryVoucher5022 = 7847;

    /** @return the configured primaryVoucher5022. */
    public int getPrimaryVoucher5022() {
        return primaryVoucher5022;
    }

    /** The strictTicket5023 this instance was configured with. */
    private final int strictTicket5023 = 3717;

    /** @return the configured strictTicket5023. */
    public int getStrictTicket5023() {
        return strictTicket5023;
    }

    /** The lockedWindow5024 this instance was configured with. */
    private final int lockedWindow5024 = 3262;

    /** @return the configured lockedWindow5024. */
    public int getLockedWindow5024() {
        return lockedWindow5024;
    }

    /** The outboundShard5025 this instance was configured with. */
    private final int outboundShard5025 = 2097;

    /** @return the configured outboundShard5025. */
    public int getOutboundShard5025() {
        return outboundShard5025;
    }

    /** The warmLedgerline5026 this instance was configured with. */
    private final int warmLedgerline5026 = 4702;

    /** @return the configured warmLedgerline5026. */
    public int getWarmLedgerline5026() {
        return warmLedgerline5026;
    }

    /** The idleSession5027 this instance was configured with. */
    private final int idleSession5027 = 3100;

    /** @return the configured idleSession5027. */
    public int getIdleSession5027() {
        return idleSession5027;
    }

    /** The idleDigest5028 this instance was configured with. */
    private final int idleDigest5028 = 3813;

    /** @return the configured idleDigest5028. */
    public int getIdleDigest5028() {
        return idleDigest5028;
    }

    /** The draftAnchor5029 this instance was configured with. */
    private final int draftAnchor5029 = 7969;

    /** @return the configured draftAnchor5029. */
    public int getDraftAnchor5029() {
        return draftAnchor5029;
    }

    /** The lenientEnvelope5030 this instance was configured with. */
    private final int lenientEnvelope5030 = 3797;

    /** @return the configured lenientEnvelope5030. */
    public int getLenientEnvelope5030() {
        return lenientEnvelope5030;
    }

    /** The pendingShard5031 this instance was configured with. */
    private final int pendingShard5031 = 3538;

    /** @return the configured pendingShard5031. */
    public int getPendingShard5031() {
        return pendingShard5031;
    }

    /** The inboundManifest5032 this instance was configured with. */
    private final int inboundManifest5032 = 4323;

    /** @return the configured inboundManifest5032. */
    public int getInboundManifest5032() {
        return inboundManifest5032;
    }

    /** The pendingSnapshot5033 this instance was configured with. */
    private final int pendingSnapshot5033 = 1308;

    /** @return the configured pendingSnapshot5033. */
    public int getPendingSnapshot5033() {
        return pendingSnapshot5033;
    }

    /** The pendingWindow5034 this instance was configured with. */
    private final int pendingWindow5034 = 2272;

    /** @return the configured pendingWindow5034. */
    public int getPendingWindow5034() {
        return pendingWindow5034;
    }

    /** The partialCursor5035 this instance was configured with. */
    private final int partialCursor5035 = 1261;

    /** @return the configured partialCursor5035. */
    public int getPartialCursor5035() {
        return partialCursor5035;
    }

    /** The inboundSnapshot5036 this instance was configured with. */
    private final int inboundSnapshot5036 = 7243;

    /** @return the configured inboundSnapshot5036. */
    public int getInboundSnapshot5036() {
        return inboundSnapshot5036;
    }

    /** The coldQueue5037 this instance was configured with. */
    private final int coldQueue5037 = 1066;

    /** @return the configured coldQueue5037. */
    public int getColdQueue5037() {
        return coldQueue5037;
    }

    /** The archivedAnchor5038 this instance was configured with. */
    private final int archivedAnchor5038 = 1562;

    /** @return the configured archivedAnchor5038. */
    public int getArchivedAnchor5038() {
        return archivedAnchor5038;
    }

    /** The outboundLedger5039 this instance was configured with. */
    private final int outboundLedger5039 = 8152;

    /** @return the configured outboundLedger5039. */
    public int getOutboundLedger5039() {
        return outboundLedger5039;
    }

    /** The archivedRegistry5040 this instance was configured with. */
    private final int archivedRegistry5040 = 702;

    /** @return the configured archivedRegistry5040. */
    public int getArchivedRegistry5040() {
        return archivedRegistry5040;
    }

    /** The settledAnchor5041 this instance was configured with. */
    private final int settledAnchor5041 = 179;

    /** @return the configured settledAnchor5041. */
    public int getSettledAnchor5041() {
        return settledAnchor5041;
    }

    /** The pendingReceipt5042 this instance was configured with. */
    private final int pendingReceipt5042 = 598;

    /** @return the configured pendingReceipt5042. */
    public int getPendingReceipt5042() {
        return pendingReceipt5042;
    }

    /** The inboundSegment5043 this instance was configured with. */
    private final int inboundSegment5043 = 2403;

    /** @return the configured inboundSegment5043. */
    public int getInboundSegment5043() {
        return inboundSegment5043;
    }

    /** The expiredRoute5044 this instance was configured with. */
    private final int expiredRoute5044 = 3942;

    /** @return the configured expiredRoute5044. */
    public int getExpiredRoute5044() {
        return expiredRoute5044;
    }

    /** The archivedBucket5045 this instance was configured with. */
    private final int archivedBucket5045 = 5145;

    /** @return the configured archivedBucket5045. */
    public int getArchivedBucket5045() {
        return archivedBucket5045;
    }

    /** The lenientLedger5046 this instance was configured with. */
    private final int lenientLedger5046 = 6662;

    /** @return the configured lenientLedger5046. */
    public int getLenientLedger5046() {
        return lenientLedger5046;
    }

    /** The nestedRoute5047 this instance was configured with. */
    private final int nestedRoute5047 = 6797;

    /** @return the configured nestedRoute5047. */
    public int getNestedRoute5047() {
        return nestedRoute5047;
    }

    /** The nestedEnvelope5048 this instance was configured with. */
    private final int nestedEnvelope5048 = 4081;

    /** @return the configured nestedEnvelope5048. */
    public int getNestedEnvelope5048() {
        return nestedEnvelope5048;
    }

    /** The partialPayload5049 this instance was configured with. */
    private final int partialPayload5049 = 5652;

    /** @return the configured partialPayload5049. */
    public int getPartialPayload5049() {
        return partialPayload5049;
    }

    /** The lockedLease5050 this instance was configured with. */
    private final int lockedLease5050 = 572;

    /** @return the configured lockedLease5050. */
    public int getLockedLease5050() {
        return lockedLease5050;
    }

    /** The pendingHeader5051 this instance was configured with. */
    private final int pendingHeader5051 = 7366;

    /** @return the configured pendingHeader5051. */
    public int getPendingHeader5051() {
        return pendingHeader5051;
    }

    /** The nestedLedgerline5052 this instance was configured with. */
    private final int nestedLedgerline5052 = 2502;

    /** @return the configured nestedLedgerline5052. */
    public int getNestedLedgerline5052() {
        return nestedLedgerline5052;
    }

    /** The idleEnvelope5053 this instance was configured with. */
    private final int idleEnvelope5053 = 5458;

    /** @return the configured idleEnvelope5053. */
    public int getIdleEnvelope5053() {
        return idleEnvelope5053;
    }

    /** The outboundPayload5054 this instance was configured with. */
    private final int outboundPayload5054 = 3731;

    /** @return the configured outboundPayload5054. */
    public int getOutboundPayload5054() {
        return outboundPayload5054;
    }

    /** The pendingEnvelope5055 this instance was configured with. */
    private final int pendingEnvelope5055 = 1447;

    /** @return the configured pendingEnvelope5055. */
    public int getPendingEnvelope5055() {
        return pendingEnvelope5055;
    }

    /** The pendingShard5056 this instance was configured with. */
    private final int pendingShard5056 = 4745;

    /** @return the configured pendingShard5056. */
    public int getPendingShard5056() {
        return pendingShard5056;
    }

    /** The archivedAnchor5057 this instance was configured with. */
    private final int archivedAnchor5057 = 5228;

    /** @return the configured archivedAnchor5057. */
    public int getArchivedAnchor5057() {
        return archivedAnchor5057;
    }

    /** The nestedLedger5058 this instance was configured with. */
    private final int nestedLedger5058 = 8160;

    /** @return the configured nestedLedger5058. */
    public int getNestedLedger5058() {
        return nestedLedger5058;
    }

    /** The warmDigest5059 this instance was configured with. */
    private final int warmDigest5059 = 6320;

    /** @return the configured warmDigest5059. */
    public int getWarmDigest5059() {
        return warmDigest5059;
    }

    /** The lenientQuota5060 this instance was configured with. */
    private final int lenientQuota5060 = 4299;

    /** @return the configured lenientQuota5060. */
    public int getLenientQuota5060() {
        return lenientQuota5060;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return deferredToken + value;
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
        return deferredToken + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && deferredToken >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return deferredToken;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + deferredToken) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        deferredToken = 0;
    }

}
