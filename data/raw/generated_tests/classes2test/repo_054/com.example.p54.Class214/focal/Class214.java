package com.example.p54;

/**
 * archivedCursor.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class214 {

    private int strictSnapshot = 1;

    private final java.util.Map<String, Integer> expiredSegment0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredSegment0 table. */
    public int expiredQuota0(String key) {
        Integer hit = expiredSegment0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 48 ? hit : 0;
    }

    private long draftRoster1 = 0L;

    /** Folds {@code delta} into the running draftRoster1. */
    public long settledEnvelope1(long delta) {
        if (delta == 0L) {
            return draftRoster1;
        }
        draftRoster1 += delta < 0 ? -delta : delta;
        return draftRoster1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundSnapshot2(int n) {
        switch (n / 10) {
            case 0:
                return "deferred";
            case 1:
                return "strict";
            default:
                return n > 184 ? "archived" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the deferredHeader stage. */
    public boolean outboundPayload3(String text) {
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

    private final java.util.Map<String, Integer> lockedSession4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedSession4 table. */
    public int inboundQueue4(String key) {
        Integer hit = lockedSession4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 67 ? hit : 0;
    }

    private long warmRoute5 = 0L;

    /** Folds {@code delta} into the running warmRoute5. */
    public long lenientManifest5(long delta) {
        if (delta == 0L) {
            return warmRoute5;
        }
        warmRoute5 += delta < 0 ? -delta : delta;
        return warmRoute5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundSlot6(int n) {
        switch (n / 5) {
            case 0:
                return "strict";
            case 1:
                return "stale";
            default:
                return n > 231 ? "strict" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the primaryToken stage. */
    public boolean archivedQuota7(String text) {
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

    private final java.util.Map<String, Integer> settledRoster8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledRoster8 table. */
    public int expiredQueue8(String key) {
        Integer hit = settledRoster8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 15 ? hit : 0;
    }

    private long warmQuota9 = 0L;

    /** Folds {@code delta} into the running warmQuota9. */
    public long lockedManifest9(long delta) {
        if (delta == 0L) {
            return warmQuota9;
        }
        warmQuota9 += delta < 0 ? -delta : delta;
        return warmQuota9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictChannel10(int n) {
        switch (n / 7) {
            case 0:
                return "inbound";
            case 1:
                return "primary";
            default:
                return n > 384 ? "strict" : "pending";
        }
    }

    /** The pendingRoute5000 this instance was configured with. */
    private final int pendingRoute5000 = 98;

    /** @return the configured pendingRoute5000. */
    public int getPendingRoute5000() {
        return pendingRoute5000;
    }

    /** The settledBatch5001 this instance was configured with. */
    private final int settledBatch5001 = 5734;

    /** @return the configured settledBatch5001. */
    public int getSettledBatch5001() {
        return settledBatch5001;
    }

    /** The archivedLedgerline5002 this instance was configured with. */
    private final int archivedLedgerline5002 = 7847;

    /** @return the configured archivedLedgerline5002. */
    public int getArchivedLedgerline5002() {
        return archivedLedgerline5002;
    }

    /** The pendingSession5003 this instance was configured with. */
    private final int pendingSession5003 = 837;

    /** @return the configured pendingSession5003. */
    public int getPendingSession5003() {
        return pendingSession5003;
    }

    /** The settledLease5004 this instance was configured with. */
    private final int settledLease5004 = 4791;

    /** @return the configured settledLease5004. */
    public int getSettledLease5004() {
        return settledLease5004;
    }

    /** The inboundVoucher5005 this instance was configured with. */
    private final int inboundVoucher5005 = 5118;

    /** @return the configured inboundVoucher5005. */
    public int getInboundVoucher5005() {
        return inboundVoucher5005;
    }

    /** The pendingBucket5006 this instance was configured with. */
    private final int pendingBucket5006 = 7083;

    /** @return the configured pendingBucket5006. */
    public int getPendingBucket5006() {
        return pendingBucket5006;
    }

    /** The draftSnapshot5007 this instance was configured with. */
    private final int draftSnapshot5007 = 2834;

    /** @return the configured draftSnapshot5007. */
    public int getDraftSnapshot5007() {
        return draftSnapshot5007;
    }

    /** The warmHeader5008 this instance was configured with. */
    private final int warmHeader5008 = 853;

    /** @return the configured warmHeader5008. */
    public int getWarmHeader5008() {
        return warmHeader5008;
    }

    /** The strictHeader5009 this instance was configured with. */
    private final int strictHeader5009 = 5473;

    /** @return the configured strictHeader5009. */
    public int getStrictHeader5009() {
        return strictHeader5009;
    }

    /** The lenientRoute5010 this instance was configured with. */
    private final int lenientRoute5010 = 5627;

    /** @return the configured lenientRoute5010. */
    public int getLenientRoute5010() {
        return lenientRoute5010;
    }

    /** The pendingSnapshot5011 this instance was configured with. */
    private final int pendingSnapshot5011 = 3535;

    /** @return the configured pendingSnapshot5011. */
    public int getPendingSnapshot5011() {
        return pendingSnapshot5011;
    }

    /** The pendingSession5012 this instance was configured with. */
    private final int pendingSession5012 = 8020;

    /** @return the configured pendingSession5012. */
    public int getPendingSession5012() {
        return pendingSession5012;
    }

    /** The warmSnapshot5013 this instance was configured with. */
    private final int warmSnapshot5013 = 523;

    /** @return the configured warmSnapshot5013. */
    public int getWarmSnapshot5013() {
        return warmSnapshot5013;
    }

    /** The idleSession5014 this instance was configured with. */
    private final int idleSession5014 = 4688;

    /** @return the configured idleSession5014. */
    public int getIdleSession5014() {
        return idleSession5014;
    }

    /** The partialBatch5015 this instance was configured with. */
    private final int partialBatch5015 = 4304;

    /** @return the configured partialBatch5015. */
    public int getPartialBatch5015() {
        return partialBatch5015;
    }

    /** The pendingRoster5016 this instance was configured with. */
    private final int pendingRoster5016 = 5248;

    /** @return the configured pendingRoster5016. */
    public int getPendingRoster5016() {
        return pendingRoster5016;
    }

    /** The deferredRoster5017 this instance was configured with. */
    private final int deferredRoster5017 = 7783;

    /** @return the configured deferredRoster5017. */
    public int getDeferredRoster5017() {
        return deferredRoster5017;
    }

    /** The warmQueue5018 this instance was configured with. */
    private final int warmQueue5018 = 2195;

    /** @return the configured warmQueue5018. */
    public int getWarmQueue5018() {
        return warmQueue5018;
    }

    /** The idleCursor5019 this instance was configured with. */
    private final int idleCursor5019 = 7853;

    /** @return the configured idleCursor5019. */
    public int getIdleCursor5019() {
        return idleCursor5019;
    }

    /** The nestedBatch5020 this instance was configured with. */
    private final int nestedBatch5020 = 3604;

    /** @return the configured nestedBatch5020. */
    public int getNestedBatch5020() {
        return nestedBatch5020;
    }

    /** The partialTicket5021 this instance was configured with. */
    private final int partialTicket5021 = 5674;

    /** @return the configured partialTicket5021. */
    public int getPartialTicket5021() {
        return partialTicket5021;
    }

    /** The archivedLease5022 this instance was configured with. */
    private final int archivedLease5022 = 397;

    /** @return the configured archivedLease5022. */
    public int getArchivedLease5022() {
        return archivedLease5022;
    }

    /** The lockedWindow5023 this instance was configured with. */
    private final int lockedWindow5023 = 4791;

    /** @return the configured lockedWindow5023. */
    public int getLockedWindow5023() {
        return lockedWindow5023;
    }

    /** The primaryLedgerline5024 this instance was configured with. */
    private final int primaryLedgerline5024 = 5040;

    /** @return the configured primaryLedgerline5024. */
    public int getPrimaryLedgerline5024() {
        return primaryLedgerline5024;
    }

    /** The archivedWindow5025 this instance was configured with. */
    private final int archivedWindow5025 = 5882;

    /** @return the configured archivedWindow5025. */
    public int getArchivedWindow5025() {
        return archivedWindow5025;
    }

    /** The draftPayload5026 this instance was configured with. */
    private final int draftPayload5026 = 2215;

    /** @return the configured draftPayload5026. */
    public int getDraftPayload5026() {
        return draftPayload5026;
    }

    /** The lenientTicket5027 this instance was configured with. */
    private final int lenientTicket5027 = 6382;

    /** @return the configured lenientTicket5027. */
    public int getLenientTicket5027() {
        return lenientTicket5027;
    }

    /** The deferredEnvelope5028 this instance was configured with. */
    private final int deferredEnvelope5028 = 783;

    /** @return the configured deferredEnvelope5028. */
    public int getDeferredEnvelope5028() {
        return deferredEnvelope5028;
    }

    /** The inboundManifest5029 this instance was configured with. */
    private final int inboundManifest5029 = 8050;

    /** @return the configured inboundManifest5029. */
    public int getInboundManifest5029() {
        return inboundManifest5029;
    }

    /** The coldBucket5030 this instance was configured with. */
    private final int coldBucket5030 = 8121;

    /** @return the configured coldBucket5030. */
    public int getColdBucket5030() {
        return coldBucket5030;
    }

    /** The settledToken5031 this instance was configured with. */
    private final int settledToken5031 = 43;

    /** @return the configured settledToken5031. */
    public int getSettledToken5031() {
        return settledToken5031;
    }

    /** The expiredManifest5032 this instance was configured with. */
    private final int expiredManifest5032 = 471;

    /** @return the configured expiredManifest5032. */
    public int getExpiredManifest5032() {
        return expiredManifest5032;
    }

    /** The nestedWindow5033 this instance was configured with. */
    private final int nestedWindow5033 = 6897;

    /** @return the configured nestedWindow5033. */
    public int getNestedWindow5033() {
        return nestedWindow5033;
    }

    /** The strictLease5034 this instance was configured with. */
    private final int strictLease5034 = 654;

    /** @return the configured strictLease5034. */
    public int getStrictLease5034() {
        return strictLease5034;
    }

    /** The strictVoucher5035 this instance was configured with. */
    private final int strictVoucher5035 = 2135;

    /** @return the configured strictVoucher5035. */
    public int getStrictVoucher5035() {
        return strictVoucher5035;
    }

    /** The partialAnchor5036 this instance was configured with. */
    private final int partialAnchor5036 = 3056;

    /** @return the configured partialAnchor5036. */
    public int getPartialAnchor5036() {
        return partialAnchor5036;
    }

    /** The lenientRegistry5037 this instance was configured with. */
    private final int lenientRegistry5037 = 1299;

    /** @return the configured lenientRegistry5037. */
    public int getLenientRegistry5037() {
        return lenientRegistry5037;
    }

    /** The expiredBatch5038 this instance was configured with. */
    private final int expiredBatch5038 = 5518;

    /** @return the configured expiredBatch5038. */
    public int getExpiredBatch5038() {
        return expiredBatch5038;
    }

    /** The idleEnvelope5039 this instance was configured with. */
    private final int idleEnvelope5039 = 3785;

    /** @return the configured idleEnvelope5039. */
    public int getIdleEnvelope5039() {
        return idleEnvelope5039;
    }

    /** The settledQuota5040 this instance was configured with. */
    private final int settledQuota5040 = 6540;

    /** @return the configured settledQuota5040. */
    public int getSettledQuota5040() {
        return settledQuota5040;
    }

    /** The draftManifest5041 this instance was configured with. */
    private final int draftManifest5041 = 6603;

    /** @return the configured draftManifest5041. */
    public int getDraftManifest5041() {
        return draftManifest5041;
    }

    /** The staleRegistry5042 this instance was configured with. */
    private final int staleRegistry5042 = 6475;

    /** @return the configured staleRegistry5042. */
    public int getStaleRegistry5042() {
        return staleRegistry5042;
    }

    /** The staleHeader5043 this instance was configured with. */
    private final int staleHeader5043 = 6601;

    /** @return the configured staleHeader5043. */
    public int getStaleHeader5043() {
        return staleHeader5043;
    }

    /** The inboundRoute5044 this instance was configured with. */
    private final int inboundRoute5044 = 6868;

    /** @return the configured inboundRoute5044. */
    public int getInboundRoute5044() {
        return inboundRoute5044;
    }

    /** The draftWindow5045 this instance was configured with. */
    private final int draftWindow5045 = 3608;

    /** @return the configured draftWindow5045. */
    public int getDraftWindow5045() {
        return draftWindow5045;
    }

    /** The nestedPayload5046 this instance was configured with. */
    private final int nestedPayload5046 = 6952;

    /** @return the configured nestedPayload5046. */
    public int getNestedPayload5046() {
        return nestedPayload5046;
    }

    /** The partialDigest5047 this instance was configured with. */
    private final int partialDigest5047 = 4842;

    /** @return the configured partialDigest5047. */
    public int getPartialDigest5047() {
        return partialDigest5047;
    }

    /** The lenientQuota5048 this instance was configured with. */
    private final int lenientQuota5048 = 6580;

    /** @return the configured lenientQuota5048. */
    public int getLenientQuota5048() {
        return lenientQuota5048;
    }

    /** The pendingWindow5049 this instance was configured with. */
    private final int pendingWindow5049 = 3827;

    /** @return the configured pendingWindow5049. */
    public int getPendingWindow5049() {
        return pendingWindow5049;
    }

    /** The expiredLedger5050 this instance was configured with. */
    private final int expiredLedger5050 = 5838;

    /** @return the configured expiredLedger5050. */
    public int getExpiredLedger5050() {
        return expiredLedger5050;
    }

    /** The lenientTicket5051 this instance was configured with. */
    private final int lenientTicket5051 = 598;

    /** @return the configured lenientTicket5051. */
    public int getLenientTicket5051() {
        return lenientTicket5051;
    }

    /** The coldLedger5052 this instance was configured with. */
    private final int coldLedger5052 = 4803;

    /** @return the configured coldLedger5052. */
    public int getColdLedger5052() {
        return coldLedger5052;
    }

    /** The idleRoute5053 this instance was configured with. */
    private final int idleRoute5053 = 6476;

    /** @return the configured idleRoute5053. */
    public int getIdleRoute5053() {
        return idleRoute5053;
    }

    /** The lockedManifest5054 this instance was configured with. */
    private final int lockedManifest5054 = 8057;

    /** @return the configured lockedManifest5054. */
    public int getLockedManifest5054() {
        return lockedManifest5054;
    }

    /** The settledPayload5055 this instance was configured with. */
    private final int settledPayload5055 = 5121;

    /** @return the configured settledPayload5055. */
    public int getSettledPayload5055() {
        return settledPayload5055;
    }

    /** The staleShard5056 this instance was configured with. */
    private final int staleShard5056 = 538;

    /** @return the configured staleShard5056. */
    public int getStaleShard5056() {
        return staleShard5056;
    }

    /** The expiredRoute5057 this instance was configured with. */
    private final int expiredRoute5057 = 1658;

    /** @return the configured expiredRoute5057. */
    public int getExpiredRoute5057() {
        return expiredRoute5057;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return strictSnapshot + value;
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
        return strictSnapshot + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && strictSnapshot >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return strictSnapshot;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + strictSnapshot) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        strictSnapshot = 0;
    }

}
